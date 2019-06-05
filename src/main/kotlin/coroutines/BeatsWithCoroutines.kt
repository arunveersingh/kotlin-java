package coroutines

import kotlinx.coroutines.*
import java.io.File
import javax.sound.sampled.AudioSystem

suspend fun playBeatsCoroutines(beats: String, file: String){

    val parts = beats.split("x")
    var count = 0
    for (part in parts){
        count += part.length + 1
        if(part==""){
            playSoundCoroutines(file)

        }else {
            delay(100 * (part.length + 1L))
            if(count < beats.length){
                playSoundCoroutines(file)
            }
        }
    }
}

fun playSoundCoroutines(file: String){

    val clip = AudioSystem.getClip()
    val audioInputStream = AudioSystem.getAudioInputStream(File(file))
    clip.open(audioInputStream)
    clip.start()

}

/*
fun basics.main(){
    GlobalScope.launch { playBeats("x-x-x-x-x-x-x-x-x-x-x-", "toms.aiff") }
    playBeats("x------x-------x-------x----", "crash_cymbal.aiff")
}*/

fun main(){
    runBlocking {
        launch { playBeatsCoroutines("x-x-x-x-x-x-x-x-x-x-x-", "toms.aiff") }
        playBeatsCoroutines("x---x---x----x---x-----x--x----", "crash_cymbal.aiff")
    }
}

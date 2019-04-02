class Song(val title: String, val artist: String){

    fun play(){
        println("playing the $title by $artist")
    }

    fun stop(){
        println("stop the $title by $artist")
    }

}


fun main(){
    val song: Song = Song("Tu Laung main Elaaichi :)", "Tulsi Kumar")
    song.play()
    song.stop()
}
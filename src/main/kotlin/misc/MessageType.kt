package misc

sealed class MessageType
class MessageSuccess(var msg: String): MessageType()
class MessageFailure(var msg: String, var e: Exception): MessageType()


fun main(){
    val messageSuccess = MessageSuccess("It Worked!")
    val messageSuccess2 = MessageSuccess("It Worked Well!")
    val messageFailure = MessageFailure("Boo!", Exception("Gone wrong."))

    var myMessageType : MessageType = messageFailure

    var myMessage = when(myMessageType){
        is MessageSuccess -> myMessageType.msg
        is MessageFailure -> myMessageType.msg + " " + myMessageType.e.message
    }

    println("myMessage is $myMessage")
}
package nullsandexceptions.exceptions

import java.lang.Exception

class MyException : Exception {

    constructor(message: String?) : super(message)
}
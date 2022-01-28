package com.example.fragmentscommunicatewitheventbus

sealed class MessageEvent {
    data class MessageA(val msg: String) : MessageEvent()
    data class MessageB(val msg: String) : MessageEvent()
}


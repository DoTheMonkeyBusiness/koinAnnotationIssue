package com.example.koinissue.common

sealed interface SealedInterface {

    interface InternalInterface : SealedInterface
}

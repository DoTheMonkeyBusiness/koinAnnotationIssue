package com.example.koinissue.common.koin

import org.koin.core.context.startKoin
import org.koin.dsl.KoinAppDeclaration
import org.koin.ksp.generated.module

fun initKoin(
    appDeclaration: KoinAppDeclaration = {},
) = startKoin {
    appDeclaration()
    modules(
        CommonModule().module,
    )
}
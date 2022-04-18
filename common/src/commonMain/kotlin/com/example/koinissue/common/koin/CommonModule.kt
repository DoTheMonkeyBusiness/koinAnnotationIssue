package com.example.koinissue.common.koin

import org.koin.core.annotation.ComponentScan
import org.koin.core.annotation.Module

@Module(includes = [SubmoduleModule::class])
@ComponentScan("com.example.koinissue.common")
class CommonModule

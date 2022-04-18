package com.example.koinissue.common.koin

import com.example.koinissue.submodule.koin.SubmoduleModule
import org.koin.core.annotation.ComponentScan
import org.koin.core.annotation.Module

@Module(includes = [SubmoduleModule::class])
@ComponentScan("com.example.koinissue.common")
class CommonModule

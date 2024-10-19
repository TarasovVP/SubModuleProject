package com.vnteam.submoduleproject.ui

import com.vnteam.core.CoreModuleClass

open class SubModuleClass {

    fun textFromSubModule(): String {
        return "Text from SubModuleClass"
    }

    fun coreModuleTextFromSubModule(): String {
        val coreModuleClass = CoreModuleClass()
        return coreModuleClass.textFromCoreModule()
    }
}
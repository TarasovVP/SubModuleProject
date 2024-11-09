package com.vnteam.submoduleproject.ui

import com.vnteam.core.MainInnerModuleClass

open class SubModuleClass {

    fun textFromSubModule(): String {
        return "Text from SubModuleClass"
    }

    fun coreModuleTextFromSubModule(): String {
        /*val coreModuleClass = CoreModuleClass()
        return coreModuleClass.textFromCoreModule()*/
        return ""
    }

    fun mainInnerModuleTextFromSubModule(): String {
        val mainInnerModuleClass = MainInnerModuleClass()
        return mainInnerModuleClass.textFromMainInnerModule()
    }
}
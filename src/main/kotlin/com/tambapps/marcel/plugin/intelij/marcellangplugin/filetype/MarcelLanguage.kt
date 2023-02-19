package com.tambapps.marcel.plugin.intelij.marcellangplugin.filetype

import com.intellij.lang.Language

object MarcelLanguage: Language("marcel") {

  override fun getDisplayName(): String {
    return "Marcel"
  }

}
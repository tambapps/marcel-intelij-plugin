package com.tambapps.marcel.plugin.intelij.marcellangplugin

import com.intellij.extapi.psi.PsiFileBase
import com.intellij.psi.FileViewProvider
import com.tambapps.marcel.plugin.intelij.marcellangplugin.filetype.MarcelFileType
import com.tambapps.marcel.plugin.intelij.marcellangplugin.filetype.MarcelLanguage

class MarcelFile(viewProvider: FileViewProvider) : PsiFileBase(viewProvider, MarcelLanguage) {
  override fun getFileType() = MarcelFileType.INSTANCE
}
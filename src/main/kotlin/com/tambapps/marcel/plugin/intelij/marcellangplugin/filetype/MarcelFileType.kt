package com.tambapps.marcel.plugin.intelij.marcellangplugin.filetype

import com.intellij.openapi.fileTypes.LanguageFileType
import com.intellij.openapi.vfs.VirtualFile

class MarcelFileType: LanguageFileType(MarcelLanguage) {

  override fun getName() = "Marcel"
  override fun getDescription() = "Marcel file"
  override fun getDefaultExtension() = "mcl"
  override fun getIcon() = MarcelIcons.MARCEL
  override fun getCharset(file: VirtualFile, content: ByteArray): String = "UTF-8"

  companion object {
    // don't remove this. It is referenced in plugin.xml
    val INSTANCE = MarcelFileType()
  }
}
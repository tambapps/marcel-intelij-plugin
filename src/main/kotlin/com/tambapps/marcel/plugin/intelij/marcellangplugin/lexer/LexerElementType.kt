package com.tambapps.marcel.plugin.intelij.marcellangplugin.lexer

import com.intellij.psi.tree.IElementType
import com.tambapps.marcel.lexer.TokenType
import com.tambapps.marcel.plugin.intelij.marcellangplugin.filetype.MarcelLanguage

class LexerElementType private constructor(private val tokenType: TokenType): IElementType(tokenType.name, MarcelLanguage) {

  override fun toString(): String {
    return tokenType.name
  }


  companion object {

    private val TYPES: Map<TokenType, LexerElementType>
    init {
      val map = mutableMapOf<TokenType, LexerElementType>()
      TokenType.values().forEach {
        map[it] = LexerElementType(it)
      }
      TYPES = map.toMap()
    }

    fun of(tokenType: TokenType): LexerElementType {
      return TYPES.getValue(tokenType)
    }
  }
}
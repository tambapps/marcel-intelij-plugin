package com.tambapps.marcel.plugin.intelij.marcellangplugin.lexer

import com.intellij.lexer.FlexLexer
import com.intellij.psi.tree.IElementType
import com.tambapps.marcel.lexer.LexToken
import com.tambapps.marcel.lexer.MarcelJflexer
import com.tambapps.marcel.lexer.MarcelLexerException

class MarcelFlexLexer: FlexLexer {
  private val lexer = MarcelJflexer()

  override fun yybegin(state: Int) {
    lexer.yybegin(state)
  }

  override fun yystate(): Int {
    return lexer.yystate()
  }

  override fun getTokenStart(): Int {
    return lexer.tokenStart
  }

  override fun getTokenEnd(): Int {
    return lexer.tokenEnd
  }

  override fun advance(): IElementType? {
    try {
      val token: LexToken = lexer.nextToken() ?: return null
      return LexerElementType.of(token.type)
    } catch (e: MarcelLexerException) {
      return null
    }
  }

  override fun reset(buf: CharSequence?, start: Int, end: Int, initialState: Int) {
    lexer.reset(buf, start, end, initialState)
  }

}
package com.tambapps.marcel.plugin.intelij.marcellangplugin.psi.node

import com.intellij.psi.impl.source.tree.CompositePsiElement
import com.intellij.psi.tree.IElementType
import com.tambapps.marcel.lexer.LexToken
import com.tambapps.marcel.lexer.TokenType
import com.tambapps.marcel.parser.ast.AstNode
import com.tambapps.marcel.plugin.intelij.marcellangplugin.lexer.LexerElementType

abstract class AbstractCompositePsiNode(type: IElementType?) : CompositePsiElement(type), AstNode {

  override val token = LexToken.dummy()
  constructor(): this(LexerElementType.of(TokenType.TYPE_INT))

}
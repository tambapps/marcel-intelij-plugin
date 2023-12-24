package com.tambapps.marcel.plugin.intelij.marcellangplugin.psi

import com.intellij.lang.ASTNode
import com.intellij.lang.ParserDefinition
import com.intellij.lexer.FlexAdapter
import com.intellij.openapi.project.Project
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.tambapps.marcel.plugin.intelij.marcellangplugin.MarcelFile
import com.tambapps.marcel.plugin.intelij.marcellangplugin.MarcelFileElementType
import com.tambapps.marcel.plugin.intelij.marcellangplugin.lexer.LexerElementTypes
import com.tambapps.marcel.plugin.intelij.marcellangplugin.lexer.MarcelFlexLexer

class MarcelParserDefinition: ParserDefinition {
  override fun createLexer(project: Project?) = FlexAdapter(MarcelFlexLexer())

  override fun createParser(project: Project?) = TODO()

  override fun getFileNodeType() = MarcelFileElementType.INSTANCE

  override fun getWhitespaceTokens() = LexerElementTypes.WHITE_SPACES

  override fun getCommentTokens() = LexerElementTypes.COMMENTS

  override fun getStringLiteralElements() = LexerElementTypes.STRING_LITERALS

  override fun spaceExistenceTypeBetweenTokens(left: ASTNode?, right: ASTNode?) = ParserDefinition.SpaceRequirements.MAY

  override fun createElement(node: ASTNode): PsiElement {
    return node as PsiElement
  }

  override fun createFile(viewProvider: FileViewProvider) = MarcelFile(viewProvider)
}
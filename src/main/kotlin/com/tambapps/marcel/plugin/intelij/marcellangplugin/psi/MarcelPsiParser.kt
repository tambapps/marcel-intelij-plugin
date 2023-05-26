package com.tambapps.marcel.plugin.intelij.marcellangplugin.psi

import com.intellij.lang.ASTNode
import com.intellij.lang.PsiBuilder
import com.intellij.lang.PsiParser
import com.intellij.psi.tree.IElementType
import com.tambapps.marcel.compiler.JavaTypeResolver
import com.tambapps.marcel.lexer.LexToken
import com.tambapps.marcel.lexer.TokenType
import com.tambapps.marcel.parser.MarcelParser
import com.tambapps.marcel.parser.exception.MarcelParserException
import com.tambapps.marcel.parser.ast.ModuleNode
import com.tambapps.marcel.plugin.intelij.marcellangplugin.psi.node.PsiModuleNode


// TODO it doesn't work AT ALL
class MarcelPsiParser: PsiParser {
  override fun parse(root: IElementType, builder: PsiBuilder): ASTNode {
    val typeResolver = JavaTypeResolver()
    val tokenTypes = mutableListOf<LexToken>()
    while (builder.tokenType != null) {
      tokenTypes.add(LexToken(0, 0, 0,0, TokenType.valueOf(builder.tokenType!!.toString()), builder.tokenText))
      builder.advanceLexer()
    }
    builder.tokenType
    val parser = MarcelParser(typeResolver, tokenTypes)
    return try {
      PsiModuleNode(parser.parse())
    } catch (e: MarcelParserException) {
      PsiModuleNode(ModuleNode())
    } catch (e: UnsupportedOperationException) {
      PsiModuleNode(ModuleNode())
    }
  }

}
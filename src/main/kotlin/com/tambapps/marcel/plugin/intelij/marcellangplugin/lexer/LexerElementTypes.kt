package com.tambapps.marcel.plugin.intelij.marcellangplugin.lexer

import com.intellij.psi.tree.TokenSet
import com.intellij.util.containers.map2Array
import com.tambapps.marcel.lexer.TokenType
import com.tambapps.marcel.lexer.TokenType.*

object LexerElementTypes {

  val IDENTIFIERS = TokenSet.create(*of(IDENTIFIER))
  val COMMENTS = TokenSet.create(*
    of(
      BLOCK_COMMENT, DOC_COMMENT, HASH, SHEBANG_COMMENT, EOL_COMMENT,
    )
  )
  val STRING_LITERALS = TokenSet.create(*
    of(
      OPEN_CHAR_QUOTE, CLOSING_CHAR_QUOTE, OPEN_QUOTE, CLOSING_QUOTE, REGULAR_STRING_PART,
    )
  )
  val NUMBERS = TokenSet.create(*
    of(INTEGER,
      FLOAT,)
  )
  val BOOL_LITERALS = TokenSet.create(*of(VALUE_TRUE, VALUE_FALSE))

  val KEYWORDS = TokenSet.create(*
    of(
      TYPE_INT, TYPE_LONG, TYPE_SHORT, TYPE_FLOAT, TYPE_DOUBLE, TYPE_BOOL, TYPE_BYTE, TYPE_VOID, TYPE_CHAR, FUN, RETURN,
      VALUE_TRUE, VALUE_FALSE, NEW, IMPORT, AS, INLINE, STATIC, FOR, IN, IF, ELSE, NULL, BREAK, CONTINUE, DEF,
      CLASS, EXTENSION, PACKAGE, EXTENDS, IMPLEMENTS, FINAL, SWITCH, WHEN, THIS, SUPER,
      // visibilities
      VISIBILITY_PUBLIC, VISIBILITY_PROTECTED, VISIBILITY_INTERNAL, VISIBILITY_PRIVATE,
    )
  )

  val OPERATORS = TokenSet.create(*
  of(
    PLUS, MINUS, DIV, MUL, COMMA, QUESTION_MARK, INCR, DECR,
    PLUS_ASSIGNMENT, MINUS_ASSIGNMENT, MUL_ASSIGNMENT, DIV_ASSIGNMENT, TWO_DOTS, QUESTION_DOT,
    WHILE, POWER, NOT, MODULO, AND, EQUAL, NOT_EQUAL, GT, LT, GOE, LOE, OR, ASSIGNMENT,
    IS, IS_NOT, LEFT_SHIFT, RIGHT_SHIFT,
  )
  )

  val WHITE_SPACES = TokenSet.create(*of(
    WHITE_SPACE
  ))

  private fun of(vararg types: TokenType): Array<LexerElementType> {
    return types.map2Array { LexerElementType.of(it) }
  }
}
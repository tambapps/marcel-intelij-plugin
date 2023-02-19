package com.tambapps.marcel.plugin.intelij.marcellangplugin

import com.intellij.lexer.LayeredLexer
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.tree.IElementType
import com.tambapps.marcel.lexer.TokenType
import com.tambapps.marcel.plugin.intelij.marcellangplugin.lexer.MarcelPluginLexer

class MarcelSyntaxHighlighter : SyntaxHighlighterBase() {
    override fun getHighlightingLexer() = LayeredLexer(MarcelPluginLexer())

    override fun getTokenHighlights(tokenType: IElementType): Array<TextAttributesKey> =
        pack(ATTRIBUTES_MAP[tokenType.toString()])

    companion object {
        val ATTRIBUTES_MAP = mapOf(
            Pair(TokenType.IDENTIFIER.name, DefaultLanguageHighlighterColors.IDENTIFIER),
            Pair(TokenType.TYPE_INT.name, DefaultLanguageHighlighterColors.KEYWORD),
            Pair(TokenType.TYPE_LONG.name, DefaultLanguageHighlighterColors.KEYWORD),
            Pair(TokenType.TYPE_SHORT.name, DefaultLanguageHighlighterColors.KEYWORD),
            Pair(TokenType.TYPE_FLOAT.name, DefaultLanguageHighlighterColors.KEYWORD),
            Pair(TokenType.TYPE_DOUBLE.name, DefaultLanguageHighlighterColors.KEYWORD),
            Pair(TokenType.TYPE_BOOL.name, DefaultLanguageHighlighterColors.KEYWORD),
            Pair(TokenType.TYPE_BYTE.name, DefaultLanguageHighlighterColors.KEYWORD),
            Pair(TokenType.TYPE_VOID.name, DefaultLanguageHighlighterColors.KEYWORD),
            Pair(TokenType.FUN.name, DefaultLanguageHighlighterColors.KEYWORD),
            Pair(TokenType.RETURN.name, DefaultLanguageHighlighterColors.KEYWORD),
            Pair(TokenType.VALUE_TRUE.name, DefaultLanguageHighlighterColors.KEYWORD),
            Pair(TokenType.VALUE_FALSE.name, DefaultLanguageHighlighterColors.KEYWORD),
            Pair(TokenType.NEW.name, DefaultLanguageHighlighterColors.KEYWORD),
            Pair(TokenType.IMPORT.name, DefaultLanguageHighlighterColors.KEYWORD),
            Pair(TokenType.AS.name, DefaultLanguageHighlighterColors.KEYWORD),
            Pair(TokenType.INLINE.name, DefaultLanguageHighlighterColors.KEYWORD),
            Pair(TokenType.STATIC.name, DefaultLanguageHighlighterColors.KEYWORD),
            Pair(TokenType.FOR.name, DefaultLanguageHighlighterColors.KEYWORD),
            Pair(TokenType.IN.name, DefaultLanguageHighlighterColors.KEYWORD),
            Pair(TokenType.IF.name, DefaultLanguageHighlighterColors.KEYWORD),
            Pair(TokenType.ELSE.name, DefaultLanguageHighlighterColors.KEYWORD),
            Pair(TokenType.NULL.name, DefaultLanguageHighlighterColors.KEYWORD),
            Pair(TokenType.BREAK.name, DefaultLanguageHighlighterColors.KEYWORD),
            Pair(TokenType.CONTINUE.name, DefaultLanguageHighlighterColors.KEYWORD),
            Pair(TokenType.DEF.name, DefaultLanguageHighlighterColors.KEYWORD),
            Pair(TokenType.CLASS.name, DefaultLanguageHighlighterColors.KEYWORD),
            Pair(TokenType.EXTENSION.name, DefaultLanguageHighlighterColors.KEYWORD),
            Pair(TokenType.PACKAGE.name, DefaultLanguageHighlighterColors.KEYWORD),
            Pair(TokenType.EXTENDS.name, DefaultLanguageHighlighterColors.KEYWORD),
            Pair(TokenType.IMPLEMENTS.name, DefaultLanguageHighlighterColors.KEYWORD),
            Pair(TokenType.FINAL.name, DefaultLanguageHighlighterColors.KEYWORD),
            Pair(TokenType.SWITCH.name, DefaultLanguageHighlighterColors.KEYWORD),
            Pair(TokenType.WHEN.name, DefaultLanguageHighlighterColors.KEYWORD),
            Pair(TokenType.WHILE.name, DefaultLanguageHighlighterColors.KEYWORD),
            Pair(TokenType.IS.name, DefaultLanguageHighlighterColors.KEYWORD),
            Pair(TokenType.IS_NOT.name, DefaultLanguageHighlighterColors.KEYWORD),
            Pair(TokenType.VISIBILITY_PUBLIC.name, DefaultLanguageHighlighterColors.KEYWORD),
            Pair(TokenType.VISIBILITY_PROTECTED.name, DefaultLanguageHighlighterColors.KEYWORD),
            Pair(TokenType.VISIBILITY_INTERNAL.name, DefaultLanguageHighlighterColors.KEYWORD),
            Pair(TokenType.VISIBILITY_PRIVATE.name, DefaultLanguageHighlighterColors.KEYWORD),

            // numbers
            Pair(TokenType.INTEGER.name, DefaultLanguageHighlighterColors.NUMBER),
            Pair(TokenType.FLOAT.name, DefaultLanguageHighlighterColors.NUMBER),

            // comments
            Pair(TokenType.SHEBANG_COMMENT.name, DefaultLanguageHighlighterColors.LINE_COMMENT),
            Pair(TokenType.EOL_COMMENT.name, DefaultLanguageHighlighterColors.BLOCK_COMMENT),
            Pair(TokenType.BLOCK_COMMENT.name, DefaultLanguageHighlighterColors.BLOCK_COMMENT),
            Pair(TokenType.DOC_COMMENT.name, DefaultLanguageHighlighterColors.DOC_COMMENT),

            // operators
            Pair(TokenType.PLUS.name, DefaultLanguageHighlighterColors.OPERATION_SIGN),
            Pair(TokenType.MINUS.name, DefaultLanguageHighlighterColors.OPERATION_SIGN),
            Pair(TokenType.DIV.name, DefaultLanguageHighlighterColors.OPERATION_SIGN),
            Pair(TokenType.MUL.name, DefaultLanguageHighlighterColors.OPERATION_SIGN),
            Pair(TokenType.COMMA.name, DefaultLanguageHighlighterColors.COMMA),
            Pair(TokenType.QUESTION_MARK.name, DefaultLanguageHighlighterColors.OPERATION_SIGN),
            Pair(TokenType.THIS.name, DefaultLanguageHighlighterColors.OPERATION_SIGN),
            Pair(TokenType.SUPER.name, DefaultLanguageHighlighterColors.OPERATION_SIGN),

            Pair(TokenType.LPAR.name, DefaultLanguageHighlighterColors.PARENTHESES),
            Pair(TokenType.RPAR.name, DefaultLanguageHighlighterColors.PARENTHESES),

            // IGNORING COLLON
            Pair(TokenType.SEMI_COLON.name, DefaultLanguageHighlighterColors.SEMICOLON),

            Pair(TokenType.INCR.name, DefaultLanguageHighlighterColors.OPERATION_SIGN),
            Pair(TokenType.DECR.name, DefaultLanguageHighlighterColors.OPERATION_SIGN),
            // IGNORING ARROW
            Pair(TokenType.PLUS_ASSIGNMENT.name, DefaultLanguageHighlighterColors.OPERATION_SIGN),
            Pair(TokenType.MINUS_ASSIGNMENT.name, DefaultLanguageHighlighterColors.OPERATION_SIGN),
            Pair(TokenType.MUL_ASSIGNMENT.name, DefaultLanguageHighlighterColors.OPERATION_SIGN),
            Pair(TokenType.DIV_ASSIGNMENT.name, DefaultLanguageHighlighterColors.OPERATION_SIGN),
            // IGNORING TWO_DOTS
            Pair(TokenType.QUESTION_DOT.name, DefaultLanguageHighlighterColors.OPERATION_SIGN),
            Pair(TokenType.POWER.name, DefaultLanguageHighlighterColors.OPERATION_SIGN),
            Pair(TokenType.NOT.name, DefaultLanguageHighlighterColors.OPERATION_SIGN),
            Pair(TokenType.AND.name, DefaultLanguageHighlighterColors.OPERATION_SIGN),
            Pair(TokenType.EQUAL.name, DefaultLanguageHighlighterColors.OPERATION_SIGN),
            Pair(TokenType.NOT_EQUAL.name, DefaultLanguageHighlighterColors.OPERATION_SIGN),
            Pair(TokenType.GT.name, DefaultLanguageHighlighterColors.OPERATION_SIGN),
            Pair(TokenType.LT.name, DefaultLanguageHighlighterColors.OPERATION_SIGN),
            Pair(TokenType.GOE.name, DefaultLanguageHighlighterColors.OPERATION_SIGN),
            Pair(TokenType.LOE.name, DefaultLanguageHighlighterColors.OPERATION_SIGN),
            Pair(TokenType.OR.name, DefaultLanguageHighlighterColors.OPERATION_SIGN),
            Pair(TokenType.ASSIGNMENT.name, DefaultLanguageHighlighterColors.OPERATION_SIGN),
            Pair(TokenType.LEFT_SHIFT.name, DefaultLanguageHighlighterColors.OPERATION_SIGN),
            Pair(TokenType.RIGHT_SHIFT.name, DefaultLanguageHighlighterColors.OPERATION_SIGN),

            // STRING
            Pair(TokenType.OPEN_QUOTE.name, DefaultLanguageHighlighterColors.STRING),
            Pair(TokenType.REGULAR_STRING_PART.name, DefaultLanguageHighlighterColors.STRING),
            Pair(TokenType.CLOSING_QUOTE.name, DefaultLanguageHighlighterColors.STRING),
            Pair(TokenType.OPEN_CHAR_QUOTE.name, DefaultLanguageHighlighterColors.STRING),
            Pair(TokenType.CLOSING_CHAR_QUOTE.name, DefaultLanguageHighlighterColors.STRING),
            Pair(TokenType.ESCAPE_SEQUENCE.name, DefaultLanguageHighlighterColors.VALID_STRING_ESCAPE),
            Pair(TokenType.SHORT_TEMPLATE_ENTRY_START.name, DefaultLanguageHighlighterColors.TEMPLATE_LANGUAGE_COLOR),
            Pair(TokenType.LONG_TEMPLATE_ENTRY_START.name, DefaultLanguageHighlighterColors.TEMPLATE_LANGUAGE_COLOR),
            Pair(TokenType.LONG_TEMPLATE_ENTRY_END.name, DefaultLanguageHighlighterColors.TEMPLATE_LANGUAGE_COLOR),



            Pair(TokenType.BRACKETS_OPEN.name, DefaultLanguageHighlighterColors.BRACKETS),
            Pair(TokenType.BRACKETS_CLOSE.name, DefaultLanguageHighlighterColors.BRACKETS),
            Pair(TokenType.SQUARE_BRACKETS_OPEN.name, DefaultLanguageHighlighterColors.BRACKETS),
            Pair(TokenType.SQUARE_BRACKETS_CLOSE.name, DefaultLanguageHighlighterColors.BRACKETS),
            Pair(TokenType.DOT.name, DefaultLanguageHighlighterColors.DOT),
            Pair(TokenType.LBRACE.name, DefaultLanguageHighlighterColors.BRACES),
            Pair(TokenType.RBRACE.name, DefaultLanguageHighlighterColors.BRACES),
            )
    }
}
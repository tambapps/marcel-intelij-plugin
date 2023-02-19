package com.tambapps.marcel.plugin.intelij.marcellangplugin.psi

import com.intellij.lang.ASTNode
import com.intellij.openapi.util.Key
import com.intellij.openapi.util.TextRange
import com.intellij.psi.PsiElement
import com.intellij.psi.tree.IElementType
import com.intellij.psi.tree.TokenSet

class MarcelASTNode: ASTNode {
  override fun <T : Any?> getUserData(key: Key<T>): T? {
    TODO("Not yet implemented")
  }

  override fun <T : Any?> putUserData(key: Key<T>, value: T?) {
    TODO("Not yet implemented")
  }

  override fun getElementType(): IElementType {
    TODO("Not yet implemented")
  }

  override fun getText(): String {
    TODO("Not yet implemented")
  }

  override fun getChars(): CharSequence {
    TODO("Not yet implemented")
  }

  override fun textContains(c: Char): Boolean {
    TODO("Not yet implemented")
  }

  override fun getStartOffset(): Int {
    TODO("Not yet implemented")
  }

  override fun getTextLength(): Int {
    TODO("Not yet implemented")
  }

  override fun getTextRange(): TextRange {
    TODO("Not yet implemented")
  }

  override fun getTreeParent(): ASTNode {
    TODO("Not yet implemented")
  }

  override fun getFirstChildNode(): ASTNode {
    TODO("Not yet implemented")
  }

  override fun getLastChildNode(): ASTNode {
    TODO("Not yet implemented")
  }

  override fun getTreeNext(): ASTNode {
    TODO("Not yet implemented")
  }

  override fun getTreePrev(): ASTNode {
    TODO("Not yet implemented")
  }

  override fun getChildren(filter: TokenSet?): Array<ASTNode> {
    TODO("Not yet implemented")
  }

  override fun addChild(child: ASTNode) {
    TODO("Not yet implemented")
  }

  override fun addChild(child: ASTNode, anchorBefore: ASTNode?) {
    TODO("Not yet implemented")
  }

  override fun addLeaf(leafType: IElementType, leafText: CharSequence, anchorBefore: ASTNode?) {
    TODO("Not yet implemented")
  }

  override fun removeChild(child: ASTNode) {
    TODO("Not yet implemented")
  }

  override fun removeRange(firstNodeToRemove: ASTNode, firstNodeToKeep: ASTNode?) {
    TODO("Not yet implemented")
  }

  override fun replaceChild(oldChild: ASTNode, newChild: ASTNode) {
    TODO("Not yet implemented")
  }

  override fun replaceAllChildrenToChildrenOf(anotherParent: ASTNode) {
    TODO("Not yet implemented")
  }

  override fun addChildren(firstChild: ASTNode, firstChildToNotAdd: ASTNode?, anchorBefore: ASTNode?) {
    TODO("Not yet implemented")
  }

  override fun clone(): Any {
    TODO("Not yet implemented")
  }

  override fun copyElement(): ASTNode {
    TODO("Not yet implemented")
  }

  override fun findLeafElementAt(offset: Int): ASTNode? {
    TODO("Not yet implemented")
  }

  override fun <T : Any?> getCopyableUserData(key: Key<T>): T? {
    TODO("Not yet implemented")
  }

  override fun <T : Any?> putCopyableUserData(key: Key<T>, value: T?) {
    TODO("Not yet implemented")
  }

  override fun findChildByType(type: IElementType): ASTNode? {
    TODO("Not yet implemented")
  }

  override fun findChildByType(type: IElementType, anchor: ASTNode?): ASTNode? {
    TODO("Not yet implemented")
  }

  override fun findChildByType(typesSet: TokenSet): ASTNode? {
    TODO("Not yet implemented")
  }

  override fun findChildByType(typesSet: TokenSet, anchor: ASTNode?): ASTNode? {
    TODO("Not yet implemented")
  }

  override fun getPsi(): PsiElement {
    TODO("Not yet implemented")
  }

  override fun <T : PsiElement?> getPsi(clazz: Class<T>): T {
    TODO("Not yet implemented")
  }
}
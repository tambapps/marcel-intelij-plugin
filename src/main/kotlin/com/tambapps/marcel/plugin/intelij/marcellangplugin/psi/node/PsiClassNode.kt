package com.tambapps.marcel.plugin.intelij.marcellangplugin.psi.node

import com.tambapps.marcel.parser.ast.ClassNode

class PsiClassNode(val classNode: ClassNode) : AbstractCompositePsiNode() {

  init {
    classNode.methods.forEach {
      add(PsiMethodNode(it))
    }
    classNode.fields.forEach {
      add(PsiFieldNode(it))
    }
  }
}
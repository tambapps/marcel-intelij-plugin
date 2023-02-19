package com.tambapps.marcel.plugin.intelij.marcellangplugin.psi.node

import com.tambapps.marcel.parser.ast.ModuleNode

class PsiModuleNode(val moduleNode: ModuleNode) : AbstractCompositePsiNode() {

  init {
    moduleNode.classes.forEach {
      add(PsiClassNode(it))
    }
  }
}
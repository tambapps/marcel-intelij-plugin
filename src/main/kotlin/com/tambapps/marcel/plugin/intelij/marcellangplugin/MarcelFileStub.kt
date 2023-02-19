package com.tambapps.marcel.plugin.intelij.marcellangplugin

import com.intellij.psi.stubs.PsiFileStubImpl

class MarcelFileStub(file: MarcelFile?) : PsiFileStubImpl<MarcelFile?>(file) {
    override fun getType() = MarcelFileElementType.INSTANCE


    fun getModuleName(): String? {
        // TODO
        return null
    }

    // TODO
    fun getModuleQualifiedName(): String? {
        return null
    }
}

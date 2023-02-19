package com.tambapps.marcel.plugin.intelij.marcellangplugin
import com.intellij.psi.StubBuilder
import com.intellij.psi.stubs.*
import com.intellij.psi.tree.IStubFileElementType
import com.tambapps.marcel.plugin.intelij.marcellangplugin.filetype.MarcelLanguage

class MarcelFileElementType : IStubFileElementType<MarcelFileStub>("MARCEL_FILE", MarcelLanguage) {
    override fun getStubVersion() = VERSION

    override fun getBuilder(): StubBuilder {
        return DefaultStubBuilder()
    }


    override fun serialize(stub: MarcelFileStub, dataStream: StubOutputStream) {}

    override fun deserialize(dataStream: StubInputStream, parentStub: StubElement<*>?): MarcelFileStub {
        return MarcelFileStub(null)
    }

    override fun getExternalId() = "marcel.FILE"

    companion object {
        val INSTANCE = MarcelFileElementType()
        const val VERSION = 81
    }
}

package org.mozilla.javascript.ast;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class XmlString extends XmlFragment {
    private String xml;

    public XmlString() {
    }

    public String getXml() {
        return this.xml;
    }

    public void setXml(String str) {
        assertNotNull(str);
        this.xml = str;
        setLength(str.length());
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public String toSource(int i11) {
        return makeIndent(i11) + this.xml;
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public void visit(NodeVisitor nodeVisitor) {
        nodeVisitor.visit(this);
    }

    public XmlString(int i11) {
        super(i11);
    }

    public XmlString(int i11, String str) {
        super(i11);
        setXml(str);
    }
}

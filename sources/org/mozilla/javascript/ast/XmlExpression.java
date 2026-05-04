package org.mozilla.javascript.ast;

import com.alipay.sdk.m.u.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class XmlExpression extends XmlFragment {
    private AstNode expression;
    private boolean isXmlAttribute;

    public XmlExpression() {
    }

    public AstNode getExpression() {
        return this.expression;
    }

    public boolean isXmlAttribute() {
        return this.isXmlAttribute;
    }

    public void setExpression(AstNode astNode) {
        assertNotNull(astNode);
        this.expression = astNode;
        astNode.setParent(this);
    }

    public void setIsXmlAttribute(boolean z11) {
        this.isXmlAttribute = z11;
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public String toSource(int i11) {
        return makeIndent(i11) + "{" + this.expression.toSource(i11) + i.f11099d;
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public void visit(NodeVisitor nodeVisitor) {
        if (nodeVisitor.visit(this)) {
            this.expression.visit(nodeVisitor);
        }
    }

    public XmlExpression(int i11) {
        super(i11);
    }

    public XmlExpression(int i11, int i12) {
        super(i11, i12);
    }

    public XmlExpression(int i11, AstNode astNode) {
        super(i11);
        setExpression(astNode);
    }
}

package org.mozilla.javascript.ast;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class XmlMemberGet extends InfixExpression {
    public XmlMemberGet() {
        this.type = 143;
    }

    public XmlRef getMemberRef() {
        return (XmlRef) getRight();
    }

    public AstNode getTarget() {
        return getLeft();
    }

    public void setProperty(XmlRef xmlRef) {
        setRight(xmlRef);
    }

    public void setTarget(AstNode astNode) {
        setLeft(astNode);
    }

    @Override // org.mozilla.javascript.ast.InfixExpression, org.mozilla.javascript.ast.AstNode
    public String toSource(int i11) {
        return makeIndent(i11) + getLeft().toSource(0) + AstNode.operatorToString(getType()) + getRight().toSource(0);
    }

    public XmlMemberGet(int i11) {
        super(i11);
        this.type = 143;
    }

    public XmlMemberGet(int i11, int i12) {
        super(i11, i12);
        this.type = 143;
    }

    public XmlMemberGet(int i11, int i12, AstNode astNode, XmlRef xmlRef) {
        super(i11, i12, astNode, xmlRef);
        this.type = 143;
    }

    public XmlMemberGet(AstNode astNode, XmlRef xmlRef) {
        super(astNode, xmlRef);
        this.type = 143;
    }

    public XmlMemberGet(AstNode astNode, XmlRef xmlRef, int i11) {
        super(143, astNode, xmlRef, i11);
        this.type = 143;
    }
}

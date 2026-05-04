package org.mozilla.javascript.ast;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class PropertyGet extends InfixExpression {
    public PropertyGet() {
        this.type = 33;
    }

    public Name getProperty() {
        return (Name) getRight();
    }

    public AstNode getTarget() {
        return getLeft();
    }

    public void setProperty(Name name) {
        setRight(name);
    }

    public void setTarget(AstNode astNode) {
        setLeft(astNode);
    }

    @Override // org.mozilla.javascript.ast.InfixExpression, org.mozilla.javascript.ast.AstNode
    public String toSource(int i11) {
        return makeIndent(i11) + getLeft().toSource(0) + "." + getRight().toSource(0);
    }

    @Override // org.mozilla.javascript.ast.InfixExpression, org.mozilla.javascript.ast.AstNode
    public void visit(NodeVisitor nodeVisitor) {
        if (nodeVisitor.visit(this)) {
            getTarget().visit(nodeVisitor);
            getProperty().visit(nodeVisitor);
        }
    }

    public PropertyGet(int i11) {
        super(i11);
        this.type = 33;
    }

    public PropertyGet(int i11, int i12) {
        super(i11, i12);
        this.type = 33;
    }

    public PropertyGet(int i11, int i12, AstNode astNode, Name name) {
        super(i11, i12, astNode, name);
        this.type = 33;
    }

    public PropertyGet(AstNode astNode, Name name) {
        super(astNode, name);
        this.type = 33;
    }

    public PropertyGet(AstNode astNode, Name name, int i11) {
        super(33, astNode, name, i11);
        this.type = 33;
    }
}

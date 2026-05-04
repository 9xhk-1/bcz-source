package org.mozilla.javascript.ast;

import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class ParenthesizedExpression extends AstNode {
    private AstNode expression;

    public ParenthesizedExpression() {
        this.type = 87;
    }

    public AstNode getExpression() {
        return this.expression;
    }

    public void setExpression(AstNode astNode) {
        assertNotNull(astNode);
        this.expression = astNode;
        astNode.setParent(this);
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public String toSource(int i11) {
        return makeIndent(i11) + j.f81006c + this.expression.toSource(0) + j.f81007d;
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public void visit(NodeVisitor nodeVisitor) {
        if (nodeVisitor.visit(this)) {
            this.expression.visit(nodeVisitor);
        }
    }

    public ParenthesizedExpression(int i11) {
        super(i11);
        this.type = 87;
    }

    public ParenthesizedExpression(int i11, int i12) {
        super(i11, i12);
        this.type = 87;
    }

    public ParenthesizedExpression(AstNode astNode) {
        this(astNode != null ? astNode.getPosition() : 0, astNode != null ? astNode.getLength() : 1, astNode);
    }

    public ParenthesizedExpression(int i11, int i12, AstNode astNode) {
        super(i11, i12);
        this.type = 87;
        setExpression(astNode);
    }
}

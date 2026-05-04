package org.mozilla.javascript.ast;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class ThrowStatement extends AstNode {
    private AstNode expression;

    public ThrowStatement() {
        this.type = 50;
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
        return makeIndent(i11) + "throw " + this.expression.toSource(0) + ";\n";
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public void visit(NodeVisitor nodeVisitor) {
        if (nodeVisitor.visit(this)) {
            this.expression.visit(nodeVisitor);
        }
    }

    public ThrowStatement(int i11) {
        super(i11);
        this.type = 50;
    }

    public ThrowStatement(int i11, int i12) {
        super(i11, i12);
        this.type = 50;
    }

    public ThrowStatement(AstNode astNode) {
        this.type = 50;
        setExpression(astNode);
    }

    public ThrowStatement(int i11, AstNode astNode) {
        super(i11, astNode.getLength());
        this.type = 50;
        setExpression(astNode);
    }

    public ThrowStatement(int i11, int i12, AstNode astNode) {
        super(i11, i12);
        this.type = 50;
        setExpression(astNode);
    }
}

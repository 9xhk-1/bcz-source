package org.mozilla.javascript.ast;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class ExpressionStatement extends AstNode {
    private AstNode expr;

    public ExpressionStatement() {
        this.type = 133;
    }

    public AstNode getExpression() {
        return this.expr;
    }

    @Override // org.mozilla.javascript.ast.AstNode, org.mozilla.javascript.Node
    public boolean hasSideEffects() {
        return this.type == 134 || this.expr.hasSideEffects();
    }

    public void setExpression(AstNode astNode) {
        assertNotNull(astNode);
        this.expr = astNode;
        astNode.setParent(this);
        setLineno(astNode.getLineno());
    }

    public void setHasResult() {
        this.type = 134;
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public String toSource(int i11) {
        return this.expr.toSource(i11) + ";\n";
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public void visit(NodeVisitor nodeVisitor) {
        if (nodeVisitor.visit(this)) {
            this.expr.visit(nodeVisitor);
        }
    }

    public ExpressionStatement(AstNode astNode, boolean z11) {
        this(astNode);
        if (z11) {
            setHasResult();
        }
    }

    public ExpressionStatement(AstNode astNode) {
        this(astNode.getPosition(), astNode.getLength(), astNode);
    }

    public ExpressionStatement(int i11, int i12) {
        super(i11, i12);
        this.type = 133;
    }

    public ExpressionStatement(int i11, int i12, AstNode astNode) {
        super(i11, i12);
        this.type = 133;
        setExpression(astNode);
    }
}

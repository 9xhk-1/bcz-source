package org.mozilla.javascript.ast;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class DoLoop extends Loop {
    private AstNode condition;
    private int whilePosition;

    public DoLoop() {
        this.whilePosition = -1;
        this.type = 118;
    }

    public AstNode getCondition() {
        return this.condition;
    }

    public int getWhilePosition() {
        return this.whilePosition;
    }

    public void setCondition(AstNode astNode) {
        assertNotNull(astNode);
        this.condition = astNode;
        astNode.setParent(this);
    }

    public void setWhilePosition(int i11) {
        this.whilePosition = i11;
    }

    @Override // org.mozilla.javascript.ast.Scope, org.mozilla.javascript.ast.Jump, org.mozilla.javascript.ast.AstNode
    public String toSource(int i11) {
        return makeIndent(i11) + "do " + this.body.toSource(i11).trim() + " while (" + this.condition.toSource(0) + ");\n";
    }

    @Override // org.mozilla.javascript.ast.Scope, org.mozilla.javascript.ast.Jump, org.mozilla.javascript.ast.AstNode
    public void visit(NodeVisitor nodeVisitor) {
        if (nodeVisitor.visit(this)) {
            this.body.visit(nodeVisitor);
            this.condition.visit(nodeVisitor);
        }
    }

    public DoLoop(int i11) {
        super(i11);
        this.whilePosition = -1;
        this.type = 118;
    }

    public DoLoop(int i11, int i12) {
        super(i11, i12);
        this.whilePosition = -1;
        this.type = 118;
    }
}

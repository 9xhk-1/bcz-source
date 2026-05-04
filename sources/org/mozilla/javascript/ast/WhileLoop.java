package org.mozilla.javascript.ast;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class WhileLoop extends Loop {
    private AstNode condition;

    public WhileLoop() {
        this.type = 117;
    }

    public AstNode getCondition() {
        return this.condition;
    }

    public void setCondition(AstNode astNode) {
        assertNotNull(astNode);
        this.condition = astNode;
        astNode.setParent(this);
    }

    @Override // org.mozilla.javascript.ast.Scope, org.mozilla.javascript.ast.Jump, org.mozilla.javascript.ast.AstNode
    public String toSource(int i11) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(makeIndent(i11));
        sb2.append("while (");
        sb2.append(this.condition.toSource(0));
        sb2.append(") ");
        AstNode astNode = this.body;
        if (astNode instanceof Block) {
            sb2.append(astNode.toSource(i11).trim());
            sb2.append("\n");
        } else {
            sb2.append("\n");
            sb2.append(this.body.toSource(i11 + 1));
        }
        return sb2.toString();
    }

    @Override // org.mozilla.javascript.ast.Scope, org.mozilla.javascript.ast.Jump, org.mozilla.javascript.ast.AstNode
    public void visit(NodeVisitor nodeVisitor) {
        if (nodeVisitor.visit(this)) {
            this.condition.visit(nodeVisitor);
            this.body.visit(nodeVisitor);
        }
    }

    public WhileLoop(int i11) {
        super(i11);
        this.type = 117;
    }

    public WhileLoop(int i11, int i12) {
        super(i11, i12);
        this.type = 117;
    }
}

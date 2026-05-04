package org.mozilla.javascript.ast;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class BreakStatement extends Jump {
    private Name breakLabel;
    private AstNode target;

    public BreakStatement() {
        this.type = 120;
    }

    public Name getBreakLabel() {
        return this.breakLabel;
    }

    public AstNode getBreakTarget() {
        return this.target;
    }

    public void setBreakLabel(Name name) {
        this.breakLabel = name;
        if (name != null) {
            name.setParent(this);
        }
    }

    public void setBreakTarget(Jump jump) {
        assertNotNull(jump);
        this.target = jump;
        setJumpStatement(jump);
    }

    @Override // org.mozilla.javascript.ast.Jump, org.mozilla.javascript.ast.AstNode
    public String toSource(int i11) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(makeIndent(i11));
        sb2.append("break");
        if (this.breakLabel != null) {
            sb2.append(" ");
            sb2.append(this.breakLabel.toSource(0));
        }
        sb2.append(";\n");
        return sb2.toString();
    }

    @Override // org.mozilla.javascript.ast.Jump, org.mozilla.javascript.ast.AstNode
    public void visit(NodeVisitor nodeVisitor) {
        Name name;
        if (!nodeVisitor.visit(this) || (name = this.breakLabel) == null) {
            return;
        }
        name.visit(nodeVisitor);
    }

    public BreakStatement(int i11) {
        this.type = 120;
        this.position = i11;
    }

    public BreakStatement(int i11, int i12) {
        this.type = 120;
        this.position = i11;
        this.length = i12;
    }
}

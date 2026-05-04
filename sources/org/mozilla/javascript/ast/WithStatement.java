package org.mozilla.javascript.ast;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class WithStatement extends AstNode {
    private AstNode expression;

    /* renamed from: lp, reason: collision with root package name */
    private int f78390lp;

    /* renamed from: rp, reason: collision with root package name */
    private int f78391rp;
    private AstNode statement;

    public WithStatement() {
        this.f78390lp = -1;
        this.f78391rp = -1;
        this.type = 123;
    }

    public AstNode getExpression() {
        return this.expression;
    }

    public int getLp() {
        return this.f78390lp;
    }

    public int getRp() {
        return this.f78391rp;
    }

    public AstNode getStatement() {
        return this.statement;
    }

    public void setExpression(AstNode astNode) {
        assertNotNull(astNode);
        this.expression = astNode;
        astNode.setParent(this);
    }

    public void setLp(int i11) {
        this.f78390lp = i11;
    }

    public void setParens(int i11, int i12) {
        this.f78390lp = i11;
        this.f78391rp = i12;
    }

    public void setRp(int i11) {
        this.f78391rp = i11;
    }

    public void setStatement(AstNode astNode) {
        assertNotNull(astNode);
        this.statement = astNode;
        astNode.setParent(this);
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public String toSource(int i11) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(makeIndent(i11));
        sb2.append("with (");
        sb2.append(this.expression.toSource(0));
        sb2.append(") ");
        sb2.append(this.statement.toSource(i11 + 1));
        if (!(this.statement instanceof Block)) {
            sb2.append(";\n");
        }
        return sb2.toString();
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public void visit(NodeVisitor nodeVisitor) {
        if (nodeVisitor.visit(this)) {
            this.expression.visit(nodeVisitor);
            this.statement.visit(nodeVisitor);
        }
    }

    public WithStatement(int i11) {
        super(i11);
        this.f78390lp = -1;
        this.f78391rp = -1;
        this.type = 123;
    }

    public WithStatement(int i11, int i12) {
        super(i11, i12);
        this.f78390lp = -1;
        this.f78391rp = -1;
        this.type = 123;
    }
}

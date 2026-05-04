package org.mozilla.javascript.ast;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class IfStatement extends AstNode {
    private AstNode condition;
    private AstNode elsePart;
    private int elsePosition;

    /* renamed from: lp, reason: collision with root package name */
    private int f78382lp;

    /* renamed from: rp, reason: collision with root package name */
    private int f78383rp;
    private AstNode thenPart;

    public IfStatement() {
        this.elsePosition = -1;
        this.f78382lp = -1;
        this.f78383rp = -1;
        this.type = 112;
    }

    public AstNode getCondition() {
        return this.condition;
    }

    public AstNode getElsePart() {
        return this.elsePart;
    }

    public int getElsePosition() {
        return this.elsePosition;
    }

    public int getLp() {
        return this.f78382lp;
    }

    public int getRp() {
        return this.f78383rp;
    }

    public AstNode getThenPart() {
        return this.thenPart;
    }

    public void setCondition(AstNode astNode) {
        assertNotNull(astNode);
        this.condition = astNode;
        astNode.setParent(this);
    }

    public void setElsePart(AstNode astNode) {
        this.elsePart = astNode;
        if (astNode != null) {
            astNode.setParent(this);
        }
    }

    public void setElsePosition(int i11) {
        this.elsePosition = i11;
    }

    public void setLp(int i11) {
        this.f78382lp = i11;
    }

    public void setParens(int i11, int i12) {
        this.f78382lp = i11;
        this.f78383rp = i12;
    }

    public void setRp(int i11) {
        this.f78383rp = i11;
    }

    public void setThenPart(AstNode astNode) {
        assertNotNull(astNode);
        this.thenPart = astNode;
        astNode.setParent(this);
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public String toSource(int i11) {
        String makeIndent = makeIndent(i11);
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append(makeIndent);
        sb2.append("if (");
        sb2.append(this.condition.toSource(0));
        sb2.append(") ");
        if (!(this.thenPart instanceof Block)) {
            sb2.append("\n");
            sb2.append(makeIndent(i11));
        }
        sb2.append(this.thenPart.toSource(i11).trim());
        AstNode astNode = this.elsePart;
        if (astNode instanceof IfStatement) {
            sb2.append(" else ");
            sb2.append(this.elsePart.toSource(i11).trim());
        } else if (astNode != null) {
            sb2.append(" else ");
            sb2.append(this.elsePart.toSource(i11).trim());
        }
        sb2.append("\n");
        return sb2.toString();
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public void visit(NodeVisitor nodeVisitor) {
        if (nodeVisitor.visit(this)) {
            this.condition.visit(nodeVisitor);
            this.thenPart.visit(nodeVisitor);
            AstNode astNode = this.elsePart;
            if (astNode != null) {
                astNode.visit(nodeVisitor);
            }
        }
    }

    public IfStatement(int i11) {
        super(i11);
        this.elsePosition = -1;
        this.f78382lp = -1;
        this.f78383rp = -1;
        this.type = 112;
    }

    public IfStatement(int i11, int i12) {
        super(i11, i12);
        this.elsePosition = -1;
        this.f78382lp = -1;
        this.f78383rp = -1;
        this.type = 112;
    }
}

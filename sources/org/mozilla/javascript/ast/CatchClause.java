package org.mozilla.javascript.ast;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class CatchClause extends AstNode {
    private Block body;
    private AstNode catchCondition;
    private int ifPosition;

    /* renamed from: lp, reason: collision with root package name */
    private int f78372lp;

    /* renamed from: rp, reason: collision with root package name */
    private int f78373rp;
    private Name varName;

    public CatchClause() {
        this.ifPosition = -1;
        this.f78372lp = -1;
        this.f78373rp = -1;
        this.type = 124;
    }

    public Block getBody() {
        return this.body;
    }

    public AstNode getCatchCondition() {
        return this.catchCondition;
    }

    public int getIfPosition() {
        return this.ifPosition;
    }

    public int getLp() {
        return this.f78372lp;
    }

    public int getRp() {
        return this.f78373rp;
    }

    public Name getVarName() {
        return this.varName;
    }

    public void setBody(Block block) {
        assertNotNull(block);
        this.body = block;
        block.setParent(this);
    }

    public void setCatchCondition(AstNode astNode) {
        this.catchCondition = astNode;
        if (astNode != null) {
            astNode.setParent(this);
        }
    }

    public void setIfPosition(int i11) {
        this.ifPosition = i11;
    }

    public void setLp(int i11) {
        this.f78372lp = i11;
    }

    public void setParens(int i11, int i12) {
        this.f78372lp = i11;
        this.f78373rp = i12;
    }

    public void setRp(int i11) {
        this.f78373rp = i11;
    }

    public void setVarName(Name name) {
        assertNotNull(name);
        this.varName = name;
        name.setParent(this);
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public String toSource(int i11) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(makeIndent(i11));
        sb2.append("catch (");
        sb2.append(this.varName.toSource(0));
        if (this.catchCondition != null) {
            sb2.append(" if ");
            sb2.append(this.catchCondition.toSource(0));
        }
        sb2.append(") ");
        sb2.append(this.body.toSource(0));
        return sb2.toString();
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public void visit(NodeVisitor nodeVisitor) {
        if (nodeVisitor.visit(this)) {
            this.varName.visit(nodeVisitor);
            AstNode astNode = this.catchCondition;
            if (astNode != null) {
                astNode.visit(nodeVisitor);
            }
            this.body.visit(nodeVisitor);
        }
    }

    public CatchClause(int i11) {
        super(i11);
        this.ifPosition = -1;
        this.f78372lp = -1;
        this.f78373rp = -1;
        this.type = 124;
    }

    public CatchClause(int i11, int i12) {
        super(i11, i12);
        this.ifPosition = -1;
        this.f78372lp = -1;
        this.f78373rp = -1;
        this.type = 124;
    }
}

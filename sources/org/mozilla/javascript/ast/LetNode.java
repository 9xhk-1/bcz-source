package org.mozilla.javascript.ast;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class LetNode extends Scope {
    private AstNode body;

    /* renamed from: lp, reason: collision with root package name */
    private int f78384lp;

    /* renamed from: rp, reason: collision with root package name */
    private int f78385rp;
    private VariableDeclaration variables;

    public LetNode() {
        this.f78384lp = -1;
        this.f78385rp = -1;
        this.type = 158;
    }

    public AstNode getBody() {
        return this.body;
    }

    public int getLp() {
        return this.f78384lp;
    }

    public int getRp() {
        return this.f78385rp;
    }

    public VariableDeclaration getVariables() {
        return this.variables;
    }

    public void setBody(AstNode astNode) {
        this.body = astNode;
        if (astNode != null) {
            astNode.setParent(this);
        }
    }

    public void setLp(int i11) {
        this.f78384lp = i11;
    }

    public void setParens(int i11, int i12) {
        this.f78384lp = i11;
        this.f78385rp = i12;
    }

    public void setRp(int i11) {
        this.f78385rp = i11;
    }

    public void setVariables(VariableDeclaration variableDeclaration) {
        assertNotNull(variableDeclaration);
        this.variables = variableDeclaration;
        variableDeclaration.setParent(this);
    }

    @Override // org.mozilla.javascript.ast.Scope, org.mozilla.javascript.ast.Jump, org.mozilla.javascript.ast.AstNode
    public String toSource(int i11) {
        String makeIndent = makeIndent(i11);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(makeIndent);
        sb2.append("let (");
        printList(this.variables.getVariables(), sb2);
        sb2.append(") ");
        AstNode astNode = this.body;
        if (astNode != null) {
            sb2.append(astNode.toSource(i11));
        }
        return sb2.toString();
    }

    @Override // org.mozilla.javascript.ast.Scope, org.mozilla.javascript.ast.Jump, org.mozilla.javascript.ast.AstNode
    public void visit(NodeVisitor nodeVisitor) {
        if (nodeVisitor.visit(this)) {
            this.variables.visit(nodeVisitor);
            AstNode astNode = this.body;
            if (astNode != null) {
                astNode.visit(nodeVisitor);
            }
        }
    }

    public LetNode(int i11) {
        super(i11);
        this.f78384lp = -1;
        this.f78385rp = -1;
        this.type = 158;
    }

    public LetNode(int i11, int i12) {
        super(i11, i12);
        this.f78384lp = -1;
        this.f78385rp = -1;
        this.type = 158;
    }
}

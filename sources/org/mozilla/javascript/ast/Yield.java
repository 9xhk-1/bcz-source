package org.mozilla.javascript.ast;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class Yield extends AstNode {
    private AstNode value;

    public Yield() {
        this.type = 72;
    }

    public AstNode getValue() {
        return this.value;
    }

    public void setValue(AstNode astNode) {
        this.value = astNode;
        if (astNode != null) {
            astNode.setParent(this);
        }
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public String toSource(int i11) {
        if (this.value == null) {
            return "yield";
        }
        return "yield " + this.value.toSource(0);
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public void visit(NodeVisitor nodeVisitor) {
        AstNode astNode;
        if (!nodeVisitor.visit(this) || (astNode = this.value) == null) {
            return;
        }
        astNode.visit(nodeVisitor);
    }

    public Yield(int i11) {
        super(i11);
        this.type = 72;
    }

    public Yield(int i11, int i12) {
        super(i11, i12);
        this.type = 72;
    }

    public Yield(int i11, int i12, AstNode astNode) {
        super(i11, i12);
        this.type = 72;
        setValue(astNode);
    }
}

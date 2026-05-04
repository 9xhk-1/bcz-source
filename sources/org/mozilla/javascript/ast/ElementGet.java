package org.mozilla.javascript.ast;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class ElementGet extends AstNode {
    private AstNode element;

    /* renamed from: lb, reason: collision with root package name */
    private int f78374lb;

    /* renamed from: rb, reason: collision with root package name */
    private int f78375rb;
    private AstNode target;

    public ElementGet() {
        this.f78374lb = -1;
        this.f78375rb = -1;
        this.type = 36;
    }

    public AstNode getElement() {
        return this.element;
    }

    public int getLb() {
        return this.f78374lb;
    }

    public int getRb() {
        return this.f78375rb;
    }

    public AstNode getTarget() {
        return this.target;
    }

    public void setElement(AstNode astNode) {
        assertNotNull(astNode);
        this.element = astNode;
        astNode.setParent(this);
    }

    public void setLb(int i11) {
        this.f78374lb = i11;
    }

    public void setParens(int i11, int i12) {
        this.f78374lb = i11;
        this.f78375rb = i12;
    }

    public void setRb(int i11) {
        this.f78375rb = i11;
    }

    public void setTarget(AstNode astNode) {
        assertNotNull(astNode);
        this.target = astNode;
        astNode.setParent(this);
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public String toSource(int i11) {
        return makeIndent(i11) + this.target.toSource(0) + "[" + this.element.toSource(0) + "]";
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public void visit(NodeVisitor nodeVisitor) {
        if (nodeVisitor.visit(this)) {
            this.target.visit(nodeVisitor);
            this.element.visit(nodeVisitor);
        }
    }

    public ElementGet(int i11) {
        super(i11);
        this.f78374lb = -1;
        this.f78375rb = -1;
        this.type = 36;
    }

    public ElementGet(int i11, int i12) {
        super(i11, i12);
        this.f78374lb = -1;
        this.f78375rb = -1;
        this.type = 36;
    }

    public ElementGet(AstNode astNode, AstNode astNode2) {
        this.f78374lb = -1;
        this.f78375rb = -1;
        this.type = 36;
        setTarget(astNode);
        setElement(astNode2);
    }
}

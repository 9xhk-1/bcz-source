package org.mozilla.javascript.ast;

import com.baicizhan.client.business.widget.EmailAutoCompleteEditText;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class XmlElemRef extends XmlRef {
    private AstNode indexExpr;

    /* renamed from: lb, reason: collision with root package name */
    private int f78393lb;

    /* renamed from: rb, reason: collision with root package name */
    private int f78394rb;

    public XmlElemRef() {
        this.f78393lb = -1;
        this.f78394rb = -1;
        this.type = 77;
    }

    public AstNode getExpression() {
        return this.indexExpr;
    }

    public int getLb() {
        return this.f78393lb;
    }

    public int getRb() {
        return this.f78394rb;
    }

    public void setBrackets(int i11, int i12) {
        this.f78393lb = i11;
        this.f78394rb = i12;
    }

    public void setExpression(AstNode astNode) {
        assertNotNull(astNode);
        this.indexExpr = astNode;
        astNode.setParent(this);
    }

    public void setLb(int i11) {
        this.f78393lb = i11;
    }

    public void setRb(int i11) {
        this.f78394rb = i11;
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public String toSource(int i11) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(makeIndent(i11));
        if (isAttributeAccess()) {
            sb2.append(EmailAutoCompleteEditText.f17091d);
        }
        Name name = this.namespace;
        if (name != null) {
            sb2.append(name.toSource(0));
            sb2.append("::");
        }
        sb2.append("[");
        sb2.append(this.indexExpr.toSource(0));
        sb2.append("]");
        return sb2.toString();
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public void visit(NodeVisitor nodeVisitor) {
        if (nodeVisitor.visit(this)) {
            Name name = this.namespace;
            if (name != null) {
                name.visit(nodeVisitor);
            }
            this.indexExpr.visit(nodeVisitor);
        }
    }

    public XmlElemRef(int i11) {
        super(i11);
        this.f78393lb = -1;
        this.f78394rb = -1;
        this.type = 77;
    }

    public XmlElemRef(int i11, int i12) {
        super(i11, i12);
        this.f78393lb = -1;
        this.f78394rb = -1;
        this.type = 77;
    }
}

package org.mozilla.javascript.ast;

import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class ForInLoop extends Loop {
    protected int eachPosition;
    protected int inPosition;
    protected boolean isForEach;
    protected AstNode iteratedObject;
    protected AstNode iterator;

    public ForInLoop() {
        this.inPosition = -1;
        this.eachPosition = -1;
        this.type = 119;
    }

    public int getEachPosition() {
        return this.eachPosition;
    }

    public int getInPosition() {
        return this.inPosition;
    }

    public AstNode getIteratedObject() {
        return this.iteratedObject;
    }

    public AstNode getIterator() {
        return this.iterator;
    }

    public boolean isForEach() {
        return this.isForEach;
    }

    public void setEachPosition(int i11) {
        this.eachPosition = i11;
    }

    public void setInPosition(int i11) {
        this.inPosition = i11;
    }

    public void setIsForEach(boolean z11) {
        this.isForEach = z11;
    }

    public void setIteratedObject(AstNode astNode) {
        assertNotNull(astNode);
        this.iteratedObject = astNode;
        astNode.setParent(this);
    }

    public void setIterator(AstNode astNode) {
        assertNotNull(astNode);
        this.iterator = astNode;
        astNode.setParent(this);
    }

    @Override // org.mozilla.javascript.ast.Scope, org.mozilla.javascript.ast.Jump, org.mozilla.javascript.ast.AstNode
    public String toSource(int i11) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(makeIndent(i11));
        sb2.append("for ");
        if (isForEach()) {
            sb2.append("each ");
        }
        sb2.append(j.f81006c);
        sb2.append(this.iterator.toSource(0));
        sb2.append(" in ");
        sb2.append(this.iteratedObject.toSource(0));
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
            this.iterator.visit(nodeVisitor);
            this.iteratedObject.visit(nodeVisitor);
            this.body.visit(nodeVisitor);
        }
    }

    public ForInLoop(int i11) {
        super(i11);
        this.inPosition = -1;
        this.eachPosition = -1;
        this.type = 119;
    }

    public ForInLoop(int i11, int i12) {
        super(i11, i12);
        this.inPosition = -1;
        this.eachPosition = -1;
        this.type = 119;
    }
}

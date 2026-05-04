package org.mozilla.javascript.ast;

import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class GeneratorExpressionLoop extends ForInLoop {
    public GeneratorExpressionLoop() {
    }

    @Override // org.mozilla.javascript.ast.ForInLoop
    public boolean isForEach() {
        return false;
    }

    @Override // org.mozilla.javascript.ast.ForInLoop
    public void setIsForEach(boolean z11) {
        throw new UnsupportedOperationException("this node type does not support for each");
    }

    @Override // org.mozilla.javascript.ast.ForInLoop, org.mozilla.javascript.ast.Scope, org.mozilla.javascript.ast.Jump, org.mozilla.javascript.ast.AstNode
    public String toSource(int i11) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(makeIndent(i11));
        sb2.append(" for ");
        sb2.append(isForEach() ? "each " : "");
        sb2.append(j.f81006c);
        sb2.append(this.iterator.toSource(0));
        sb2.append(" in ");
        sb2.append(this.iteratedObject.toSource(0));
        sb2.append(j.f81007d);
        return sb2.toString();
    }

    @Override // org.mozilla.javascript.ast.ForInLoop, org.mozilla.javascript.ast.Scope, org.mozilla.javascript.ast.Jump, org.mozilla.javascript.ast.AstNode
    public void visit(NodeVisitor nodeVisitor) {
        if (nodeVisitor.visit(this)) {
            this.iterator.visit(nodeVisitor);
            this.iteratedObject.visit(nodeVisitor);
        }
    }

    public GeneratorExpressionLoop(int i11) {
        super(i11);
    }

    public GeneratorExpressionLoop(int i11, int i12) {
        super(i11, i12);
    }
}

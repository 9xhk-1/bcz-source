package org.mozilla.javascript.ast;

import java.util.Iterator;
import java.util.List;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class NewExpression extends FunctionCall {
    private ObjectLiteral initializer;

    public NewExpression() {
        this.type = 30;
    }

    public ObjectLiteral getInitializer() {
        return this.initializer;
    }

    public void setInitializer(ObjectLiteral objectLiteral) {
        this.initializer = objectLiteral;
        if (objectLiteral != null) {
            objectLiteral.setParent(this);
        }
    }

    @Override // org.mozilla.javascript.ast.FunctionCall, org.mozilla.javascript.ast.AstNode
    public String toSource(int i11) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(makeIndent(i11));
        sb2.append("new ");
        sb2.append(this.target.toSource(0));
        sb2.append(j.f81006c);
        List<AstNode> list = this.arguments;
        if (list != null) {
            printList(list, sb2);
        }
        sb2.append(j.f81007d);
        if (this.initializer != null) {
            sb2.append(" ");
            sb2.append(this.initializer.toSource(0));
        }
        return sb2.toString();
    }

    @Override // org.mozilla.javascript.ast.FunctionCall, org.mozilla.javascript.ast.AstNode
    public void visit(NodeVisitor nodeVisitor) {
        if (nodeVisitor.visit(this)) {
            this.target.visit(nodeVisitor);
            Iterator<AstNode> it = getArguments().iterator();
            while (it.hasNext()) {
                it.next().visit(nodeVisitor);
            }
            ObjectLiteral objectLiteral = this.initializer;
            if (objectLiteral != null) {
                objectLiteral.visit(nodeVisitor);
            }
        }
    }

    public NewExpression(int i11) {
        super(i11);
        this.type = 30;
    }

    public NewExpression(int i11, int i12) {
        super(i11, i12);
        this.type = 30;
    }
}

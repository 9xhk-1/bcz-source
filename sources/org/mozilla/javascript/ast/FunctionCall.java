package org.mozilla.javascript.ast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class FunctionCall extends AstNode {
    protected static final List<AstNode> NO_ARGS = Collections.unmodifiableList(new ArrayList());
    protected List<AstNode> arguments;

    /* renamed from: lp, reason: collision with root package name */
    protected int f78376lp;

    /* renamed from: rp, reason: collision with root package name */
    protected int f78377rp;
    protected AstNode target;

    public FunctionCall() {
        this.f78376lp = -1;
        this.f78377rp = -1;
        this.type = 38;
    }

    public void addArgument(AstNode astNode) {
        assertNotNull(astNode);
        if (this.arguments == null) {
            this.arguments = new ArrayList();
        }
        this.arguments.add(astNode);
        astNode.setParent(this);
    }

    public List<AstNode> getArguments() {
        List<AstNode> list = this.arguments;
        return list != null ? list : NO_ARGS;
    }

    public int getLp() {
        return this.f78376lp;
    }

    public int getRp() {
        return this.f78377rp;
    }

    public AstNode getTarget() {
        return this.target;
    }

    public void setArguments(List<AstNode> list) {
        if (list == null) {
            this.arguments = null;
            return;
        }
        List<AstNode> list2 = this.arguments;
        if (list2 != null) {
            list2.clear();
        }
        Iterator<AstNode> it = list.iterator();
        while (it.hasNext()) {
            addArgument(it.next());
        }
    }

    public void setLp(int i11) {
        this.f78376lp = i11;
    }

    public void setParens(int i11, int i12) {
        this.f78376lp = i11;
        this.f78377rp = i12;
    }

    public void setRp(int i11) {
        this.f78377rp = i11;
    }

    public void setTarget(AstNode astNode) {
        assertNotNull(astNode);
        this.target = astNode;
        astNode.setParent(this);
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public String toSource(int i11) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(makeIndent(i11));
        sb2.append(this.target.toSource(0));
        sb2.append(j.f81006c);
        List<AstNode> list = this.arguments;
        if (list != null) {
            printList(list, sb2);
        }
        sb2.append(j.f81007d);
        return sb2.toString();
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public void visit(NodeVisitor nodeVisitor) {
        if (nodeVisitor.visit(this)) {
            this.target.visit(nodeVisitor);
            Iterator<AstNode> it = getArguments().iterator();
            while (it.hasNext()) {
                it.next().visit(nodeVisitor);
            }
        }
    }

    public FunctionCall(int i11) {
        super(i11);
        this.f78376lp = -1;
        this.f78377rp = -1;
        this.type = 38;
    }

    public FunctionCall(int i11, int i12) {
        super(i11, i12);
        this.f78376lp = -1;
        this.f78377rp = -1;
        this.type = 38;
    }
}

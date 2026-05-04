package org.mozilla.javascript.ast;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class GeneratorExpression extends Scope {
    private AstNode filter;
    private int ifPosition;
    private List<GeneratorExpressionLoop> loops;

    /* renamed from: lp, reason: collision with root package name */
    private int f78380lp;
    private AstNode result;

    /* renamed from: rp, reason: collision with root package name */
    private int f78381rp;

    public GeneratorExpression() {
        this.loops = new ArrayList();
        this.ifPosition = -1;
        this.f78380lp = -1;
        this.f78381rp = -1;
        this.type = 162;
    }

    public void addLoop(GeneratorExpressionLoop generatorExpressionLoop) {
        assertNotNull(generatorExpressionLoop);
        this.loops.add(generatorExpressionLoop);
        generatorExpressionLoop.setParent(this);
    }

    public AstNode getFilter() {
        return this.filter;
    }

    public int getFilterLp() {
        return this.f78380lp;
    }

    public int getFilterRp() {
        return this.f78381rp;
    }

    public int getIfPosition() {
        return this.ifPosition;
    }

    public List<GeneratorExpressionLoop> getLoops() {
        return this.loops;
    }

    public AstNode getResult() {
        return this.result;
    }

    public void setFilter(AstNode astNode) {
        this.filter = astNode;
        if (astNode != null) {
            astNode.setParent(this);
        }
    }

    public void setFilterLp(int i11) {
        this.f78380lp = i11;
    }

    public void setFilterRp(int i11) {
        this.f78381rp = i11;
    }

    public void setIfPosition(int i11) {
        this.ifPosition = i11;
    }

    public void setLoops(List<GeneratorExpressionLoop> list) {
        assertNotNull(list);
        this.loops.clear();
        Iterator<GeneratorExpressionLoop> it = list.iterator();
        while (it.hasNext()) {
            addLoop(it.next());
        }
    }

    public void setResult(AstNode astNode) {
        assertNotNull(astNode);
        this.result = astNode;
        astNode.setParent(this);
    }

    @Override // org.mozilla.javascript.ast.Scope, org.mozilla.javascript.ast.Jump, org.mozilla.javascript.ast.AstNode
    public String toSource(int i11) {
        StringBuilder sb2 = new StringBuilder(250);
        sb2.append(j.f81006c);
        sb2.append(this.result.toSource(0));
        Iterator<GeneratorExpressionLoop> it = this.loops.iterator();
        while (it.hasNext()) {
            sb2.append(it.next().toSource(0));
        }
        if (this.filter != null) {
            sb2.append(" if (");
            sb2.append(this.filter.toSource(0));
            sb2.append(j.f81007d);
        }
        sb2.append(j.f81007d);
        return sb2.toString();
    }

    @Override // org.mozilla.javascript.ast.Scope, org.mozilla.javascript.ast.Jump, org.mozilla.javascript.ast.AstNode
    public void visit(NodeVisitor nodeVisitor) {
        if (nodeVisitor.visit(this)) {
            this.result.visit(nodeVisitor);
            Iterator<GeneratorExpressionLoop> it = this.loops.iterator();
            while (it.hasNext()) {
                it.next().visit(nodeVisitor);
            }
            AstNode astNode = this.filter;
            if (astNode != null) {
                astNode.visit(nodeVisitor);
            }
        }
    }

    public GeneratorExpression(int i11) {
        super(i11);
        this.loops = new ArrayList();
        this.ifPosition = -1;
        this.f78380lp = -1;
        this.f78381rp = -1;
        this.type = 162;
    }

    public GeneratorExpression(int i11, int i12) {
        super(i11, i12);
        this.loops = new ArrayList();
        this.ifPosition = -1;
        this.f78380lp = -1;
        this.f78381rp = -1;
        this.type = 162;
    }
}

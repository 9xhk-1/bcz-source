package org.mozilla.javascript.ast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class SwitchStatement extends Jump {
    private static final List<SwitchCase> NO_CASES = Collections.unmodifiableList(new ArrayList());
    private List<SwitchCase> cases;
    private AstNode expression;

    /* renamed from: lp, reason: collision with root package name */
    private int f78388lp = -1;

    /* renamed from: rp, reason: collision with root package name */
    private int f78389rp = -1;

    public SwitchStatement() {
        this.type = 114;
    }

    public void addCase(SwitchCase switchCase) {
        assertNotNull(switchCase);
        if (this.cases == null) {
            this.cases = new ArrayList();
        }
        this.cases.add(switchCase);
        switchCase.setParent(this);
    }

    public List<SwitchCase> getCases() {
        List<SwitchCase> list = this.cases;
        return list != null ? list : NO_CASES;
    }

    public AstNode getExpression() {
        return this.expression;
    }

    public int getLp() {
        return this.f78388lp;
    }

    public int getRp() {
        return this.f78389rp;
    }

    public void setCases(List<SwitchCase> list) {
        if (list == null) {
            this.cases = null;
            return;
        }
        List<SwitchCase> list2 = this.cases;
        if (list2 != null) {
            list2.clear();
        }
        Iterator<SwitchCase> it = list.iterator();
        while (it.hasNext()) {
            addCase(it.next());
        }
    }

    public void setExpression(AstNode astNode) {
        assertNotNull(astNode);
        this.expression = astNode;
        astNode.setParent(this);
    }

    public void setLp(int i11) {
        this.f78388lp = i11;
    }

    public void setParens(int i11, int i12) {
        this.f78388lp = i11;
        this.f78389rp = i12;
    }

    public void setRp(int i11) {
        this.f78389rp = i11;
    }

    @Override // org.mozilla.javascript.ast.Jump, org.mozilla.javascript.ast.AstNode
    public String toSource(int i11) {
        String makeIndent = makeIndent(i11);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(makeIndent);
        sb2.append("switch (");
        sb2.append(this.expression.toSource(0));
        sb2.append(") {\n");
        Iterator<SwitchCase> it = this.cases.iterator();
        while (it.hasNext()) {
            sb2.append(it.next().toSource(i11 + 1));
        }
        sb2.append(makeIndent);
        sb2.append("}\n");
        return sb2.toString();
    }

    @Override // org.mozilla.javascript.ast.Jump, org.mozilla.javascript.ast.AstNode
    public void visit(NodeVisitor nodeVisitor) {
        if (nodeVisitor.visit(this)) {
            this.expression.visit(nodeVisitor);
            Iterator<SwitchCase> it = getCases().iterator();
            while (it.hasNext()) {
                it.next().visit(nodeVisitor);
            }
        }
    }

    public SwitchStatement(int i11) {
        this.type = 114;
        this.position = i11;
    }

    public SwitchStatement(int i11, int i12) {
        this.type = 114;
        this.position = i11;
        this.length = i12;
    }
}

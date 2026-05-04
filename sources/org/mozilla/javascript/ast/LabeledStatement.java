package org.mozilla.javascript.ast;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class LabeledStatement extends AstNode {
    private List<Label> labels;
    private AstNode statement;

    public LabeledStatement() {
        this.labels = new ArrayList();
        this.type = 133;
    }

    public void addLabel(Label label) {
        assertNotNull(label);
        this.labels.add(label);
        label.setParent(this);
    }

    public Label getFirstLabel() {
        return this.labels.get(0);
    }

    public Label getLabelByName(String str) {
        for (Label label : this.labels) {
            if (str.equals(label.getName())) {
                return label;
            }
        }
        return null;
    }

    public List<Label> getLabels() {
        return this.labels;
    }

    public AstNode getStatement() {
        return this.statement;
    }

    public void setLabels(List<Label> list) {
        assertNotNull(list);
        List<Label> list2 = this.labels;
        if (list2 != null) {
            list2.clear();
        }
        Iterator<Label> it = list.iterator();
        while (it.hasNext()) {
            addLabel(it.next());
        }
    }

    public void setStatement(AstNode astNode) {
        assertNotNull(astNode);
        this.statement = astNode;
        astNode.setParent(this);
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public String toSource(int i11) {
        StringBuilder sb2 = new StringBuilder();
        Iterator<Label> it = this.labels.iterator();
        while (it.hasNext()) {
            sb2.append(it.next().toSource(i11));
        }
        sb2.append(this.statement.toSource(i11 + 1));
        return sb2.toString();
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public void visit(NodeVisitor nodeVisitor) {
        if (nodeVisitor.visit(this)) {
            Iterator<Label> it = this.labels.iterator();
            while (it.hasNext()) {
                it.next().visit(nodeVisitor);
            }
            this.statement.visit(nodeVisitor);
        }
    }

    public LabeledStatement(int i11) {
        super(i11);
        this.labels = new ArrayList();
        this.type = 133;
    }

    public LabeledStatement(int i11, int i12) {
        super(i11, i12);
        this.labels = new ArrayList();
        this.type = 133;
    }
}

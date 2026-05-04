package org.mozilla.javascript.ast;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.mozilla.javascript.Node;
import org.mozilla.javascript.Token;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class VariableDeclaration extends AstNode {
    private boolean isStatement;
    private List<VariableInitializer> variables;

    public VariableDeclaration() {
        this.variables = new ArrayList();
        this.type = 122;
    }

    private String declTypeName() {
        return Token.typeToName(this.type).toLowerCase();
    }

    public void addVariable(VariableInitializer variableInitializer) {
        assertNotNull(variableInitializer);
        this.variables.add(variableInitializer);
        variableInitializer.setParent(this);
    }

    public List<VariableInitializer> getVariables() {
        return this.variables;
    }

    public boolean isConst() {
        return this.type == 154;
    }

    public boolean isLet() {
        return this.type == 153;
    }

    public boolean isStatement() {
        return this.isStatement;
    }

    public boolean isVar() {
        return this.type == 122;
    }

    public void setIsStatement(boolean z11) {
        this.isStatement = z11;
    }

    @Override // org.mozilla.javascript.Node
    public Node setType(int i11) {
        if (i11 == 122 || i11 == 154 || i11 == 153) {
            return super.setType(i11);
        }
        throw new IllegalArgumentException("invalid decl type: " + i11);
    }

    public void setVariables(List<VariableInitializer> list) {
        assertNotNull(list);
        this.variables.clear();
        Iterator<VariableInitializer> it = list.iterator();
        while (it.hasNext()) {
            addVariable(it.next());
        }
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public String toSource(int i11) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(makeIndent(i11));
        sb2.append(declTypeName());
        sb2.append(" ");
        printList(this.variables, sb2);
        if (isStatement()) {
            sb2.append(";\n");
        }
        return sb2.toString();
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public void visit(NodeVisitor nodeVisitor) {
        if (nodeVisitor.visit(this)) {
            Iterator<VariableInitializer> it = this.variables.iterator();
            while (it.hasNext()) {
                it.next().visit(nodeVisitor);
            }
        }
    }

    public VariableDeclaration(int i11) {
        super(i11);
        this.variables = new ArrayList();
        this.type = 122;
    }

    public VariableDeclaration(int i11, int i12) {
        super(i11, i12);
        this.variables = new ArrayList();
        this.type = 122;
    }
}

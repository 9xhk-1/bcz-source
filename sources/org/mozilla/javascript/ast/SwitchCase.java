package org.mozilla.javascript.ast;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class SwitchCase extends AstNode {
    private AstNode expression;
    private List<AstNode> statements;

    public SwitchCase() {
        this.type = 115;
    }

    public void addStatement(AstNode astNode) {
        assertNotNull(astNode);
        if (this.statements == null) {
            this.statements = new ArrayList();
        }
        setLength((astNode.getPosition() + astNode.getLength()) - getPosition());
        this.statements.add(astNode);
        astNode.setParent(this);
    }

    public AstNode getExpression() {
        return this.expression;
    }

    public List<AstNode> getStatements() {
        return this.statements;
    }

    public boolean isDefault() {
        return this.expression == null;
    }

    public void setExpression(AstNode astNode) {
        this.expression = astNode;
        if (astNode != null) {
            astNode.setParent(this);
        }
    }

    public void setStatements(List<AstNode> list) {
        List<AstNode> list2 = this.statements;
        if (list2 != null) {
            list2.clear();
        }
        Iterator<AstNode> it = list.iterator();
        while (it.hasNext()) {
            addStatement(it.next());
        }
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public String toSource(int i11) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(makeIndent(i11));
        if (this.expression == null) {
            sb2.append("default:\n");
        } else {
            sb2.append("case ");
            sb2.append(this.expression.toSource(0));
            sb2.append(":\n");
        }
        List<AstNode> list = this.statements;
        if (list != null) {
            Iterator<AstNode> it = list.iterator();
            while (it.hasNext()) {
                sb2.append(it.next().toSource(i11 + 1));
            }
        }
        return sb2.toString();
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public void visit(NodeVisitor nodeVisitor) {
        if (nodeVisitor.visit(this)) {
            AstNode astNode = this.expression;
            if (astNode != null) {
                astNode.visit(nodeVisitor);
            }
            List<AstNode> list = this.statements;
            if (list != null) {
                Iterator<AstNode> it = list.iterator();
                while (it.hasNext()) {
                    it.next().visit(nodeVisitor);
                }
            }
        }
    }

    public SwitchCase(int i11) {
        super(i11);
        this.type = 115;
    }

    public SwitchCase(int i11, int i12) {
        super(i11, i12);
        this.type = 115;
    }
}

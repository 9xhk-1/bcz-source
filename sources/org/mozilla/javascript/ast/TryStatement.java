package org.mozilla.javascript.ast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class TryStatement extends AstNode {
    private static final List<CatchClause> NO_CATCHES = Collections.unmodifiableList(new ArrayList());
    private List<CatchClause> catchClauses;
    private AstNode finallyBlock;
    private int finallyPosition;
    private AstNode tryBlock;

    public TryStatement() {
        this.finallyPosition = -1;
        this.type = 81;
    }

    public void addCatchClause(CatchClause catchClause) {
        assertNotNull(catchClause);
        if (this.catchClauses == null) {
            this.catchClauses = new ArrayList();
        }
        this.catchClauses.add(catchClause);
        catchClause.setParent(this);
    }

    public List<CatchClause> getCatchClauses() {
        List<CatchClause> list = this.catchClauses;
        return list != null ? list : NO_CATCHES;
    }

    public AstNode getFinallyBlock() {
        return this.finallyBlock;
    }

    public int getFinallyPosition() {
        return this.finallyPosition;
    }

    public AstNode getTryBlock() {
        return this.tryBlock;
    }

    public void setCatchClauses(List<CatchClause> list) {
        if (list == null) {
            this.catchClauses = null;
            return;
        }
        List<CatchClause> list2 = this.catchClauses;
        if (list2 != null) {
            list2.clear();
        }
        Iterator<CatchClause> it = list.iterator();
        while (it.hasNext()) {
            addCatchClause(it.next());
        }
    }

    public void setFinallyBlock(AstNode astNode) {
        this.finallyBlock = astNode;
        if (astNode != null) {
            astNode.setParent(this);
        }
    }

    public void setFinallyPosition(int i11) {
        this.finallyPosition = i11;
    }

    public void setTryBlock(AstNode astNode) {
        assertNotNull(astNode);
        this.tryBlock = astNode;
        astNode.setParent(this);
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public String toSource(int i11) {
        StringBuilder sb2 = new StringBuilder(250);
        sb2.append(makeIndent(i11));
        sb2.append("try ");
        sb2.append(this.tryBlock.toSource(i11).trim());
        Iterator<CatchClause> it = getCatchClauses().iterator();
        while (it.hasNext()) {
            sb2.append(it.next().toSource(i11));
        }
        if (this.finallyBlock != null) {
            sb2.append(" finally ");
            sb2.append(this.finallyBlock.toSource(i11));
        }
        return sb2.toString();
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public void visit(NodeVisitor nodeVisitor) {
        if (nodeVisitor.visit(this)) {
            this.tryBlock.visit(nodeVisitor);
            Iterator<CatchClause> it = getCatchClauses().iterator();
            while (it.hasNext()) {
                it.next().visit(nodeVisitor);
            }
            AstNode astNode = this.finallyBlock;
            if (astNode != null) {
                astNode.visit(nodeVisitor);
            }
        }
    }

    public TryStatement(int i11) {
        super(i11);
        this.finallyPosition = -1;
        this.type = 81;
    }

    public TryStatement(int i11, int i12) {
        super(i11, i12);
        this.finallyPosition = -1;
        this.type = 81;
    }
}

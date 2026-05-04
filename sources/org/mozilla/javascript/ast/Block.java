package org.mozilla.javascript.ast;

import java.util.Iterator;
import org.mozilla.javascript.Node;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class Block extends AstNode {
    public Block() {
        this.type = 129;
    }

    public void addStatement(AstNode astNode) {
        addChild(astNode);
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public String toSource(int i11) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(makeIndent(i11));
        sb2.append("{\n");
        Iterator<Node> it = iterator();
        while (it.hasNext()) {
            sb2.append(((AstNode) it.next()).toSource(i11 + 1));
        }
        sb2.append(makeIndent(i11));
        sb2.append("}\n");
        return sb2.toString();
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public void visit(NodeVisitor nodeVisitor) {
        if (nodeVisitor.visit(this)) {
            Iterator<Node> it = iterator();
            while (it.hasNext()) {
                ((AstNode) it.next()).visit(nodeVisitor);
            }
        }
    }

    public Block(int i11) {
        super(i11);
        this.type = 129;
    }

    public Block(int i11, int i12) {
        super(i11, i12);
        this.type = 129;
    }
}

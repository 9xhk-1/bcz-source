package org.mozilla.javascript.ast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class ArrayLiteral extends AstNode implements DestructuringForm {
    private static final List<AstNode> NO_ELEMS = Collections.unmodifiableList(new ArrayList());
    private int destructuringLength;
    private List<AstNode> elements;
    private boolean isDestructuring;
    private int skipCount;

    public ArrayLiteral() {
        this.type = 65;
    }

    public void addElement(AstNode astNode) {
        assertNotNull(astNode);
        if (this.elements == null) {
            this.elements = new ArrayList();
        }
        this.elements.add(astNode);
        astNode.setParent(this);
    }

    public int getDestructuringLength() {
        return this.destructuringLength;
    }

    public AstNode getElement(int i11) {
        List<AstNode> list = this.elements;
        if (list != null) {
            return list.get(i11);
        }
        throw new IndexOutOfBoundsException("no elements");
    }

    public List<AstNode> getElements() {
        List<AstNode> list = this.elements;
        return list != null ? list : NO_ELEMS;
    }

    public int getSize() {
        List<AstNode> list = this.elements;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public int getSkipCount() {
        return this.skipCount;
    }

    @Override // org.mozilla.javascript.ast.DestructuringForm
    public boolean isDestructuring() {
        return this.isDestructuring;
    }

    public void setDestructuringLength(int i11) {
        this.destructuringLength = i11;
    }

    public void setElements(List<AstNode> list) {
        if (list == null) {
            this.elements = null;
            return;
        }
        List<AstNode> list2 = this.elements;
        if (list2 != null) {
            list2.clear();
        }
        Iterator<AstNode> it = list.iterator();
        while (it.hasNext()) {
            addElement(it.next());
        }
    }

    @Override // org.mozilla.javascript.ast.DestructuringForm
    public void setIsDestructuring(boolean z11) {
        this.isDestructuring = z11;
    }

    public void setSkipCount(int i11) {
        this.skipCount = i11;
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public String toSource(int i11) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(makeIndent(i11));
        sb2.append("[");
        List<AstNode> list = this.elements;
        if (list != null) {
            printList(list, sb2);
        }
        sb2.append("]");
        return sb2.toString();
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public void visit(NodeVisitor nodeVisitor) {
        if (nodeVisitor.visit(this)) {
            Iterator<AstNode> it = getElements().iterator();
            while (it.hasNext()) {
                it.next().visit(nodeVisitor);
            }
        }
    }

    public ArrayLiteral(int i11) {
        super(i11);
        this.type = 65;
    }

    public ArrayLiteral(int i11, int i12) {
        super(i11, i12);
        this.type = 65;
    }
}

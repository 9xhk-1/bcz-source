package org.mozilla.javascript.ast;

import com.alipay.sdk.m.u.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class ObjectLiteral extends AstNode implements DestructuringForm {
    private static final List<ObjectProperty> NO_ELEMS = Collections.unmodifiableList(new ArrayList());
    private List<ObjectProperty> elements;
    boolean isDestructuring;

    public ObjectLiteral() {
        this.type = 66;
    }

    public void addElement(ObjectProperty objectProperty) {
        assertNotNull(objectProperty);
        if (this.elements == null) {
            this.elements = new ArrayList();
        }
        this.elements.add(objectProperty);
        objectProperty.setParent(this);
    }

    public List<ObjectProperty> getElements() {
        List<ObjectProperty> list = this.elements;
        return list != null ? list : NO_ELEMS;
    }

    @Override // org.mozilla.javascript.ast.DestructuringForm
    public boolean isDestructuring() {
        return this.isDestructuring;
    }

    public void setElements(List<ObjectProperty> list) {
        if (list == null) {
            this.elements = null;
            return;
        }
        List<ObjectProperty> list2 = this.elements;
        if (list2 != null) {
            list2.clear();
        }
        Iterator<ObjectProperty> it = list.iterator();
        while (it.hasNext()) {
            addElement(it.next());
        }
    }

    @Override // org.mozilla.javascript.ast.DestructuringForm
    public void setIsDestructuring(boolean z11) {
        this.isDestructuring = z11;
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public String toSource(int i11) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(makeIndent(i11));
        sb2.append("{");
        List<ObjectProperty> list = this.elements;
        if (list != null) {
            printList(list, sb2);
        }
        sb2.append(i.f11099d);
        return sb2.toString();
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public void visit(NodeVisitor nodeVisitor) {
        if (nodeVisitor.visit(this)) {
            Iterator<ObjectProperty> it = getElements().iterator();
            while (it.hasNext()) {
                it.next().visit(nodeVisitor);
            }
        }
    }

    public ObjectLiteral(int i11) {
        super(i11);
        this.type = 66;
    }

    public ObjectLiteral(int i11, int i12) {
        super(i11, i12);
        this.type = 66;
    }
}

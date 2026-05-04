package org.mozilla.javascript.ast;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class XmlLiteral extends AstNode {
    private List<XmlFragment> fragments;

    public XmlLiteral() {
        this.fragments = new ArrayList();
        this.type = 145;
    }

    public void addFragment(XmlFragment xmlFragment) {
        assertNotNull(xmlFragment);
        this.fragments.add(xmlFragment);
        xmlFragment.setParent(this);
    }

    public List<XmlFragment> getFragments() {
        return this.fragments;
    }

    public void setFragments(List<XmlFragment> list) {
        assertNotNull(list);
        this.fragments.clear();
        Iterator<XmlFragment> it = list.iterator();
        while (it.hasNext()) {
            addFragment(it.next());
        }
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public String toSource(int i11) {
        StringBuilder sb2 = new StringBuilder(250);
        Iterator<XmlFragment> it = this.fragments.iterator();
        while (it.hasNext()) {
            sb2.append(it.next().toSource(0));
        }
        return sb2.toString();
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public void visit(NodeVisitor nodeVisitor) {
        if (nodeVisitor.visit(this)) {
            Iterator<XmlFragment> it = this.fragments.iterator();
            while (it.hasNext()) {
                it.next().visit(nodeVisitor);
            }
        }
    }

    public XmlLiteral(int i11) {
        super(i11);
        this.fragments = new ArrayList();
        this.type = 145;
    }

    public XmlLiteral(int i11, int i12) {
        super(i11, i12);
        this.fragments = new ArrayList();
        this.type = 145;
    }
}

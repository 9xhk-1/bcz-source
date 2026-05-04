package org.mozilla.javascript.ast;

import com.baicizhan.client.business.widget.EmailAutoCompleteEditText;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class XmlPropRef extends XmlRef {
    private Name propName;

    public XmlPropRef() {
        this.type = 79;
    }

    public Name getPropName() {
        return this.propName;
    }

    public void setPropName(Name name) {
        assertNotNull(name);
        this.propName = name;
        name.setParent(this);
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public String toSource(int i11) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(makeIndent(i11));
        if (isAttributeAccess()) {
            sb2.append(EmailAutoCompleteEditText.f17091d);
        }
        Name name = this.namespace;
        if (name != null) {
            sb2.append(name.toSource(0));
            sb2.append("::");
        }
        sb2.append(this.propName.toSource(0));
        return sb2.toString();
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public void visit(NodeVisitor nodeVisitor) {
        if (nodeVisitor.visit(this)) {
            Name name = this.namespace;
            if (name != null) {
                name.visit(nodeVisitor);
            }
            this.propName.visit(nodeVisitor);
        }
    }

    public XmlPropRef(int i11) {
        super(i11);
        this.type = 79;
    }

    public XmlPropRef(int i11, int i12) {
        super(i11, i12);
        this.type = 79;
    }
}

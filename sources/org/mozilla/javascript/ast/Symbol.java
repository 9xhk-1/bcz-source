package org.mozilla.javascript.ast;

import org.mozilla.javascript.Node;
import org.mozilla.javascript.Token;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class Symbol {
    private Scope containingTable;
    private int declType;
    private int index = -1;
    private String name;
    private Node node;

    public Symbol() {
    }

    public Scope getContainingTable() {
        return this.containingTable;
    }

    public int getDeclType() {
        return this.declType;
    }

    public String getDeclTypeName() {
        return Token.typeToName(this.declType);
    }

    public int getIndex() {
        return this.index;
    }

    public String getName() {
        return this.name;
    }

    public Node getNode() {
        return this.node;
    }

    public void setContainingTable(Scope scope) {
        this.containingTable = scope;
    }

    public void setDeclType(int i11) {
        if (i11 == 109 || i11 == 87 || i11 == 122 || i11 == 153 || i11 == 154) {
            this.declType = i11;
            return;
        }
        throw new IllegalArgumentException("Invalid declType: " + i11);
    }

    public void setIndex(int i11) {
        this.index = i11;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setNode(Node node) {
        this.node = node;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Symbol (");
        sb2.append(getDeclTypeName());
        sb2.append(") name=");
        sb2.append(this.name);
        if (this.node != null) {
            sb2.append(" line=");
            sb2.append(this.node.getLineno());
        }
        return sb2.toString();
    }

    public Symbol(int i11, String str) {
        setName(str);
        setDeclType(i11);
    }
}

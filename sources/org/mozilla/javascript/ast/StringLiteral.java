package org.mozilla.javascript.ast;

import org.mozilla.javascript.ScriptRuntime;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class StringLiteral extends AstNode {
    private char quoteChar;
    private String value;

    public StringLiteral() {
        this.type = 41;
    }

    public char getQuoteCharacter() {
        return this.quoteChar;
    }

    public String getValue() {
        return this.value;
    }

    public void setQuoteCharacter(char c11) {
        this.quoteChar = c11;
    }

    public void setValue(String str) {
        assertNotNull(str);
        this.value = str;
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public String toSource(int i11) {
        return makeIndent(i11) + this.quoteChar + ScriptRuntime.escapeString(this.value, this.quoteChar) + this.quoteChar;
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public void visit(NodeVisitor nodeVisitor) {
        nodeVisitor.visit(this);
    }

    public String getValue(boolean z11) {
        if (!z11) {
            return this.value;
        }
        return this.quoteChar + this.value + this.quoteChar;
    }

    public StringLiteral(int i11) {
        super(i11);
        this.type = 41;
    }

    public StringLiteral(int i11, int i12) {
        super(i11, i12);
        this.type = 41;
    }
}

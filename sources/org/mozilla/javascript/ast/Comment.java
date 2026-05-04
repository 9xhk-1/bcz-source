package org.mozilla.javascript.ast;

import org.mozilla.javascript.Token;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class Comment extends AstNode {
    private Token.CommentType commentType;
    private String value;

    public Comment(int i11, int i12, Token.CommentType commentType, String str) {
        super(i11, i12);
        this.type = 161;
        this.commentType = commentType;
        this.value = str;
    }

    public Token.CommentType getCommentType() {
        return this.commentType;
    }

    public String getValue() {
        return this.value;
    }

    public void setCommentType(Token.CommentType commentType) {
        this.commentType = commentType;
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public String toSource(int i11) {
        StringBuilder sb2 = new StringBuilder(getLength() + 10);
        sb2.append(makeIndent(i11));
        sb2.append(this.value);
        return sb2.toString();
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public void visit(NodeVisitor nodeVisitor) {
        nodeVisitor.visit(this);
    }
}

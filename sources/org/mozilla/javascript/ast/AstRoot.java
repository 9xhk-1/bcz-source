package org.mozilla.javascript.ast;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;
import org.mozilla.javascript.Node;
import org.mozilla.javascript.ast.AstNode;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class AstRoot extends ScriptNode {
    private SortedSet<Comment> comments;
    private boolean inStrictMode;

    public AstRoot() {
        this.type = 136;
    }

    public void addComment(Comment comment) {
        assertNotNull(comment);
        if (this.comments == null) {
            this.comments = new TreeSet(new AstNode.PositionComparator());
        }
        this.comments.add(comment);
        comment.setParent(this);
    }

    public void checkParentLinks() {
        visit(new NodeVisitor() { // from class: org.mozilla.javascript.ast.AstRoot.1
            @Override // org.mozilla.javascript.ast.NodeVisitor
            public boolean visit(AstNode astNode) {
                if (astNode.getType() == 136 || astNode.getParent() != null) {
                    return true;
                }
                throw new IllegalStateException("No parent for node: " + astNode + "\n" + astNode.toSource(0));
            }
        });
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public String debugPrint() {
        AstNode.DebugPrintVisitor debugPrintVisitor = new AstNode.DebugPrintVisitor(new StringBuilder(1000));
        visitAll(debugPrintVisitor);
        return debugPrintVisitor.toString();
    }

    public SortedSet<Comment> getComments() {
        return this.comments;
    }

    public boolean isInStrictMode() {
        return this.inStrictMode;
    }

    public void setComments(SortedSet<Comment> sortedSet) {
        if (sortedSet == null) {
            this.comments = null;
            return;
        }
        SortedSet<Comment> sortedSet2 = this.comments;
        if (sortedSet2 != null) {
            sortedSet2.clear();
        }
        Iterator<Comment> it = sortedSet.iterator();
        while (it.hasNext()) {
            addComment(it.next());
        }
    }

    public void setInStrictMode(boolean z11) {
        this.inStrictMode = z11;
    }

    @Override // org.mozilla.javascript.ast.Scope, org.mozilla.javascript.ast.Jump, org.mozilla.javascript.ast.AstNode
    public String toSource(int i11) {
        StringBuilder sb2 = new StringBuilder();
        Iterator<Node> it = iterator();
        while (it.hasNext()) {
            sb2.append(((AstNode) it.next()).toSource(i11));
        }
        return sb2.toString();
    }

    public void visitAll(NodeVisitor nodeVisitor) {
        visit(nodeVisitor);
        visitComments(nodeVisitor);
    }

    public void visitComments(NodeVisitor nodeVisitor) {
        SortedSet<Comment> sortedSet = this.comments;
        if (sortedSet != null) {
            Iterator<Comment> it = sortedSet.iterator();
            while (it.hasNext()) {
                nodeVisitor.visit(it.next());
            }
        }
    }

    public AstRoot(int i11) {
        super(i11);
        this.type = 136;
    }
}

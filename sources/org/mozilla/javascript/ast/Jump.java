package org.mozilla.javascript.ast;

import org.mozilla.javascript.Node;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class Jump extends AstNode {
    private Jump jumpNode;
    public Node target;
    private Node target2;

    public Jump() {
        this.type = -1;
    }

    public Node getContinue() {
        if (this.type != 132) {
            AstNode.codeBug();
        }
        return this.target2;
    }

    public Node getDefault() {
        if (this.type != 114) {
            AstNode.codeBug();
        }
        return this.target2;
    }

    public Node getFinally() {
        if (this.type != 81) {
            AstNode.codeBug();
        }
        return this.target2;
    }

    public Jump getJumpStatement() {
        int i11 = this.type;
        if (i11 != 120 && i11 != 121) {
            AstNode.codeBug();
        }
        return this.jumpNode;
    }

    public Jump getLoop() {
        if (this.type != 130) {
            AstNode.codeBug();
        }
        return this.jumpNode;
    }

    public void setContinue(Node node) {
        if (this.type != 132) {
            AstNode.codeBug();
        }
        if (node.getType() != 131) {
            AstNode.codeBug();
        }
        if (this.target2 != null) {
            AstNode.codeBug();
        }
        this.target2 = node;
    }

    public void setDefault(Node node) {
        if (this.type != 114) {
            AstNode.codeBug();
        }
        if (node.getType() != 131) {
            AstNode.codeBug();
        }
        if (this.target2 != null) {
            AstNode.codeBug();
        }
        this.target2 = node;
    }

    public void setFinally(Node node) {
        if (this.type != 81) {
            AstNode.codeBug();
        }
        if (node.getType() != 131) {
            AstNode.codeBug();
        }
        if (this.target2 != null) {
            AstNode.codeBug();
        }
        this.target2 = node;
    }

    public void setJumpStatement(Jump jump) {
        int i11 = this.type;
        if (i11 != 120 && i11 != 121) {
            AstNode.codeBug();
        }
        if (jump == null) {
            AstNode.codeBug();
        }
        if (this.jumpNode != null) {
            AstNode.codeBug();
        }
        this.jumpNode = jump;
    }

    public void setLoop(Jump jump) {
        if (this.type != 130) {
            AstNode.codeBug();
        }
        if (jump == null) {
            AstNode.codeBug();
        }
        if (this.jumpNode != null) {
            AstNode.codeBug();
        }
        this.jumpNode = jump;
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public String toSource(int i11) {
        throw new UnsupportedOperationException(toString());
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public void visit(NodeVisitor nodeVisitor) {
        throw new UnsupportedOperationException(toString());
    }

    public Jump(int i11) {
        this.type = i11;
    }

    public Jump(int i11, int i12) {
        this(i11);
        setLineno(i12);
    }

    public Jump(int i11, Node node) {
        this(i11);
        addChildToBack(node);
    }

    public Jump(int i11, Node node, int i12) {
        this(i11, node);
        setLineno(i12);
    }
}

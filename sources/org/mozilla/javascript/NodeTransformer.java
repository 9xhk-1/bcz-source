package org.mozilla.javascript;

import java.util.ArrayList;
import java.util.List;
import org.mozilla.javascript.ast.AstRoot;
import org.mozilla.javascript.ast.FunctionNode;
import org.mozilla.javascript.ast.Scope;
import org.mozilla.javascript.ast.ScriptNode;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class NodeTransformer {
    private boolean hasFinally;
    private ObjArray loopEnds;
    private ObjArray loops;

    private static Node addBeforeCurrent(Node node, Node node2, Node node3, Node node4) {
        if (node2 == null) {
            if (node3 != node.getFirstChild()) {
                Kit.codeBug();
            }
            node.addChildToFront(node4);
            return node4;
        }
        if (node3 != node2.getNext()) {
            Kit.codeBug();
        }
        node.addChildAfter(node4, node2);
        return node4;
    }

    private static Node replaceCurrent(Node node, Node node2, Node node3, Node node4) {
        if (node2 == null) {
            if (node3 != node.getFirstChild()) {
                Kit.codeBug();
            }
            node.replaceChild(node3, node4);
            return node4;
        }
        if (node2.next == node3) {
            node.replaceChildAfter(node2, node4);
            return node4;
        }
        node.replaceChild(node3, node4);
        return node4;
    }

    private void transformCompilationUnit(ScriptNode scriptNode) {
        this.loops = new ObjArray();
        this.loopEnds = new ObjArray();
        this.hasFinally = false;
        boolean z11 = scriptNode.getType() != 109 || ((FunctionNode) scriptNode).requiresActivation();
        scriptNode.flattenSymbolTable(!z11);
        transformCompilationUnit_r(scriptNode, scriptNode, scriptNode, z11, (scriptNode instanceof AstRoot) && ((AstRoot) scriptNode).isInStrictMode());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x016f  */
    /* JADX WARN: Type inference failed for: r13v7, types: [org.mozilla.javascript.ast.Scope] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void transformCompilationUnit_r(org.mozilla.javascript.ast.ScriptNode r19, org.mozilla.javascript.Node r20, org.mozilla.javascript.ast.Scope r21, boolean r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 986
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.NodeTransformer.transformCompilationUnit_r(org.mozilla.javascript.ast.ScriptNode, org.mozilla.javascript.Node, org.mozilla.javascript.ast.Scope, boolean, boolean):void");
    }

    public final void transform(ScriptNode scriptNode) {
        transformCompilationUnit(scriptNode);
        for (int i11 = 0; i11 != scriptNode.getFunctionCount(); i11++) {
            transform(scriptNode.getFunctionNode(i11));
        }
    }

    public Node visitLet(boolean z11, Node node, Node node2, Node node3) {
        Node node4;
        Node node5;
        Node node6;
        Node node7;
        Node firstChild = node3.getFirstChild();
        Node next = firstChild.getNext();
        node3.removeChild(firstChild);
        node3.removeChild(next);
        int i11 = 158;
        boolean z12 = node3.getType() == 158;
        int i12 = 153;
        if (z11) {
            Node replaceCurrent = replaceCurrent(node, node2, node3, new Node(z12 ? 159 : 129));
            ArrayList arrayList = new ArrayList();
            Node node8 = new Node(66);
            Node firstChild2 = firstChild.getFirstChild();
            while (firstChild2 != null) {
                if (firstChild2.getType() == i11) {
                    List list = (List) firstChild2.getProp(22);
                    Node firstChild3 = firstChild2.getFirstChild();
                    if (firstChild3.getType() != i12) {
                        throw Kit.codeBug();
                    }
                    node6 = z12 ? new Node(89, firstChild3.getNext(), next) : new Node(129, new Node(133, firstChild3.getNext()), next);
                    if (list != null) {
                        arrayList.addAll(list);
                        for (int i13 = 0; i13 < list.size(); i13++) {
                            node8.addChildToBack(new Node(126, Node.newNumber(0.0d)));
                        }
                    }
                    node7 = firstChild3.getFirstChild();
                } else {
                    node6 = next;
                    node7 = firstChild2;
                }
                if (node7.getType() != 39) {
                    throw Kit.codeBug();
                }
                arrayList.add(ScriptRuntime.getIndexObject(node7.getString()));
                Node firstChild4 = node7.getFirstChild();
                if (firstChild4 == null) {
                    firstChild4 = new Node(126, Node.newNumber(0.0d));
                }
                node8.addChildToBack(firstChild4);
                firstChild2 = firstChild2.getNext();
                next = node6;
                i11 = 158;
                i12 = 153;
            }
            node8.putProp(12, arrayList.toArray());
            replaceCurrent.addChildToBack(new Node(2, node8));
            replaceCurrent.addChildToBack(new Node(123, next));
            replaceCurrent.addChildToBack(new Node(3));
            return replaceCurrent;
        }
        Node replaceCurrent2 = replaceCurrent(node, node2, node3, new Node(z12 ? 89 : 129));
        Node node9 = new Node(89);
        Node firstChild5 = firstChild.getFirstChild();
        while (firstChild5 != null) {
            if (firstChild5.getType() == 158) {
                Node firstChild6 = firstChild5.getFirstChild();
                if (firstChild6.getType() != 153) {
                    throw Kit.codeBug();
                }
                node4 = z12 ? new Node(89, firstChild6.getNext(), next) : new Node(129, new Node(133, firstChild6.getNext()), next);
                Scope.joinScopes((Scope) firstChild5, (Scope) node3);
                node5 = firstChild6.getFirstChild();
            } else {
                node4 = next;
                node5 = firstChild5;
            }
            if (node5.getType() != 39) {
                throw Kit.codeBug();
            }
            Node newString = Node.newString(node5.getString());
            newString.setScope((Scope) node3);
            Node firstChild7 = node5.getFirstChild();
            if (firstChild7 == null) {
                firstChild7 = new Node(126, Node.newNumber(0.0d));
            }
            node9.addChildToBack(new Node(56, newString, firstChild7));
            firstChild5 = firstChild5.getNext();
            next = node4;
        }
        if (z12) {
            replaceCurrent2.addChildToBack(node9);
            node3.setType(89);
            replaceCurrent2.addChildToBack(node3);
            node3.addChildToBack(next);
            if (next instanceof Scope) {
                Scope scope = (Scope) next;
                Scope parentScope = scope.getParentScope();
                Scope scope2 = (Scope) node3;
                scope.setParentScope(scope2);
                scope2.setParentScope(parentScope);
                return replaceCurrent2;
            }
        } else {
            replaceCurrent2.addChildToBack(new Node(133, node9));
            node3.setType(129);
            replaceCurrent2.addChildToBack(node3);
            node3.addChildrenToBack(next);
            if (next instanceof Scope) {
                Scope scope3 = (Scope) next;
                Scope parentScope2 = scope3.getParentScope();
                Scope scope4 = (Scope) node3;
                scope3.setParentScope(scope4);
                scope4.setParentScope(parentScope2);
            }
        }
        return replaceCurrent2;
    }

    public void visitCall(Node node, ScriptNode scriptNode) {
    }

    public void visitNew(Node node, ScriptNode scriptNode) {
    }
}

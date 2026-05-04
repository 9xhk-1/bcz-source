package org.mozilla.javascript.optimizer;

import org.mozilla.javascript.Node;
import org.mozilla.javascript.ObjArray;
import org.mozilla.javascript.ast.ScriptNode;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
class Optimizer {
    static final int AnyType = 3;
    static final int NoType = 0;
    static final int NumberType = 1;
    private boolean inDirectCallFunction;
    private boolean parameterUsedInNumberContext;
    OptFunctionNode theFunction;

    private static void buildStatementList_r(Node node, ObjArray objArray) {
        int type = node.getType();
        if (type != 129 && type != 141 && type != 132 && type != 109) {
            objArray.add(node);
            return;
        }
        for (Node firstChild = node.getFirstChild(); firstChild != null; firstChild = firstChild.getNext()) {
            buildStatementList_r(firstChild, objArray);
        }
    }

    private boolean convertParameter(Node node) {
        if (!this.inDirectCallFunction || node.getType() != 55) {
            return false;
        }
        if (!this.theFunction.isParameter(this.theFunction.getVarIndex(node))) {
            return false;
        }
        node.removeProp(8);
        return true;
    }

    private void markDCPNumberContext(Node node) {
        if (this.inDirectCallFunction && node.getType() == 55) {
            if (this.theFunction.isParameter(this.theFunction.getVarIndex(node))) {
                this.parameterUsedInNumberContext = true;
            }
        }
    }

    private void optimizeFunction(OptFunctionNode optFunctionNode) {
        if (optFunctionNode.fnode.requiresActivation()) {
            return;
        }
        this.inDirectCallFunction = optFunctionNode.isTargetOfDirectCall();
        this.theFunction = optFunctionNode;
        ObjArray objArray = new ObjArray();
        buildStatementList_r(optFunctionNode.fnode, objArray);
        int size = objArray.size();
        Node[] nodeArr = new Node[size];
        objArray.toArray(nodeArr);
        Block.runFlowAnalyzes(optFunctionNode, nodeArr);
        if (optFunctionNode.fnode.requiresActivation()) {
            return;
        }
        this.parameterUsedInNumberContext = false;
        for (int i11 = 0; i11 < size; i11++) {
            rewriteForNumberVariables(nodeArr[i11], 1);
        }
        optFunctionNode.setParameterNumberContext(this.parameterUsedInNumberContext);
    }

    private void rewriteAsObjectChildren(Node node, Node node2) {
        while (node2 != null) {
            Node next = node2.getNext();
            if (rewriteForNumberVariables(node2, 0) == 1 && !convertParameter(node2)) {
                node.removeChild(node2);
                Node node3 = new Node(149, node2);
                if (next == null) {
                    node.addChildToBack(node3);
                } else {
                    node.addChildBefore(node3, next);
                }
            }
            node2 = next;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x0121 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int rewriteForNumberVariables(org.mozilla.javascript.Node r9, int r10) {
        /*
            Method dump skipped, instructions count: 728
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.optimizer.Optimizer.rewriteForNumberVariables(org.mozilla.javascript.Node, int):int");
    }

    public void optimize(ScriptNode scriptNode) {
        int functionCount = scriptNode.getFunctionCount();
        for (int i11 = 0; i11 != functionCount; i11++) {
            optimizeFunction(OptFunctionNode.get(scriptNode, i11));
        }
    }
}

package org.mozilla.javascript.optimizer;

import java.util.Map;
import org.mozilla.javascript.Kit;
import org.mozilla.javascript.Node;
import org.mozilla.javascript.NodeTransformer;
import org.mozilla.javascript.ObjArray;
import org.mozilla.javascript.ast.ScriptNode;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
class OptTransformer extends NodeTransformer {
    private ObjArray directCallTargets;
    private Map<String, OptFunctionNode> possibleDirectCalls;

    public OptTransformer(Map<String, OptFunctionNode> map, ObjArray objArray) {
        this.possibleDirectCalls = map;
        this.directCallTargets = objArray;
    }

    private void detectDirectCall(Node node, ScriptNode scriptNode) {
        String str;
        OptFunctionNode optFunctionNode;
        if (scriptNode.getType() == 109) {
            Node firstChild = node.getFirstChild();
            Node next = firstChild.getNext();
            int i11 = 0;
            while (next != null) {
                next = next.getNext();
                i11++;
            }
            if (i11 == 0) {
                OptFunctionNode.get(scriptNode).itsContainsCalls0 = true;
            }
            if (this.possibleDirectCalls != null) {
                if (firstChild.getType() == 39) {
                    str = firstChild.getString();
                } else if (firstChild.getType() == 33) {
                    str = firstChild.getFirstChild().getNext().getString();
                } else {
                    if (firstChild.getType() == 34) {
                        throw Kit.codeBug();
                    }
                    str = null;
                }
                if (str == null || (optFunctionNode = this.possibleDirectCalls.get(str)) == null || i11 != optFunctionNode.fnode.getParamCount() || optFunctionNode.fnode.requiresActivation() || i11 > 32) {
                    return;
                }
                node.putProp(9, optFunctionNode);
                if (optFunctionNode.isTargetOfDirectCall()) {
                    return;
                }
                int size = this.directCallTargets.size();
                this.directCallTargets.add(optFunctionNode);
                optFunctionNode.setDirectTargetIndex(size);
            }
        }
    }

    @Override // org.mozilla.javascript.NodeTransformer
    public void visitCall(Node node, ScriptNode scriptNode) {
        detectDirectCall(node, scriptNode);
        super.visitCall(node, scriptNode);
    }

    @Override // org.mozilla.javascript.NodeTransformer
    public void visitNew(Node node, ScriptNode scriptNode) {
        detectDirectCall(node, scriptNode);
        super.visitNew(node, scriptNode);
    }
}

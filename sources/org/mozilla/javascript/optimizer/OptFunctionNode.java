package org.mozilla.javascript.optimizer;

import org.mozilla.javascript.Kit;
import org.mozilla.javascript.Node;
import org.mozilla.javascript.ast.FunctionNode;
import org.mozilla.javascript.ast.ScriptNode;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class OptFunctionNode {
    private int directTargetIndex = -1;
    public final FunctionNode fnode;
    boolean itsContainsCalls0;
    boolean itsContainsCalls1;
    private boolean itsParameterNumberContext;
    private boolean[] numberVarFlags;

    public OptFunctionNode(FunctionNode functionNode) {
        this.fnode = functionNode;
        functionNode.setCompilerData(this);
    }

    public static OptFunctionNode get(ScriptNode scriptNode, int i11) {
        return (OptFunctionNode) scriptNode.getFunctionNode(i11).getCompilerData();
    }

    public int getDirectTargetIndex() {
        return this.directTargetIndex;
    }

    public boolean getParameterNumberContext() {
        return this.itsParameterNumberContext;
    }

    public int getVarCount() {
        return this.fnode.getParamAndVarCount();
    }

    public int getVarIndex(Node node) {
        Node firstChild;
        int intProp = node.getIntProp(7, -1);
        if (intProp != -1) {
            return intProp;
        }
        int type = node.getType();
        if (type == 55) {
            firstChild = node;
        } else {
            if (type != 56 && type != 156) {
                throw Kit.codeBug();
            }
            firstChild = node.getFirstChild();
        }
        int indexForNameNode = this.fnode.getIndexForNameNode(firstChild);
        if (indexForNameNode < 0) {
            throw Kit.codeBug();
        }
        node.putIntProp(7, indexForNameNode);
        return indexForNameNode;
    }

    public boolean isNumberVar(int i11) {
        boolean[] zArr;
        int paramCount = i11 - this.fnode.getParamCount();
        if (paramCount < 0 || (zArr = this.numberVarFlags) == null) {
            return false;
        }
        return zArr[paramCount];
    }

    public boolean isParameter(int i11) {
        return i11 < this.fnode.getParamCount();
    }

    public boolean isTargetOfDirectCall() {
        return this.directTargetIndex >= 0;
    }

    public void setDirectTargetIndex(int i11) {
        if (i11 < 0 || this.directTargetIndex >= 0) {
            Kit.codeBug();
        }
        this.directTargetIndex = i11;
    }

    public void setIsNumberVar(int i11) {
        int paramCount = i11 - this.fnode.getParamCount();
        if (paramCount < 0) {
            Kit.codeBug();
        }
        if (this.numberVarFlags == null) {
            this.numberVarFlags = new boolean[this.fnode.getParamAndVarCount() - this.fnode.getParamCount()];
        }
        this.numberVarFlags[paramCount] = true;
    }

    public void setParameterNumberContext(boolean z11) {
        this.itsParameterNumberContext = z11;
    }

    public static OptFunctionNode get(ScriptNode scriptNode) {
        return (OptFunctionNode) scriptNode.getCompilerData();
    }
}

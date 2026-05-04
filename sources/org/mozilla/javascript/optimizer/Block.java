package org.mozilla.javascript.optimizer;

import java.util.BitSet;
import java.util.HashMap;
import org.mozilla.javascript.Node;
import org.mozilla.javascript.ObjArray;
import org.mozilla.javascript.ObjToIntMap;
import org.mozilla.javascript.ast.Jump;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
class Block {
    static final boolean DEBUG = false;
    private static int debug_blockCount;
    private int itsBlockID;
    private int itsEndNodeIndex;
    private BitSet itsLiveOnEntrySet;
    private BitSet itsLiveOnExitSet;
    private BitSet itsNotDefSet;
    private Block[] itsPredecessors;
    private int itsStartNodeIndex;
    private Block[] itsSuccessors;
    private BitSet itsUseBeforeDefSet;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class FatBlock {
        private ObjToIntMap predecessors;
        Block realBlock;
        private ObjToIntMap successors;

        private FatBlock() {
            this.successors = new ObjToIntMap();
            this.predecessors = new ObjToIntMap();
        }

        private static Block[] reduceToArray(ObjToIntMap objToIntMap) {
            if (objToIntMap.isEmpty()) {
                return null;
            }
            Block[] blockArr = new Block[objToIntMap.size()];
            ObjToIntMap.Iterator newIterator = objToIntMap.newIterator();
            newIterator.start();
            int i11 = 0;
            while (!newIterator.done()) {
                blockArr[i11] = ((FatBlock) newIterator.getKey()).realBlock;
                newIterator.next();
                i11++;
            }
            return blockArr;
        }

        public void addPredecessor(FatBlock fatBlock) {
            this.predecessors.put(fatBlock, 0);
        }

        public void addSuccessor(FatBlock fatBlock) {
            this.successors.put(fatBlock, 0);
        }

        public Block[] getPredecessors() {
            return reduceToArray(this.predecessors);
        }

        public Block[] getSuccessors() {
            return reduceToArray(this.successors);
        }
    }

    public Block(int i11, int i12) {
        this.itsStartNodeIndex = i11;
        this.itsEndNodeIndex = i12;
    }

    private static boolean assignType(int[] iArr, int i11, int i12) {
        int i13 = iArr[i11];
        int i14 = i12 | i13;
        iArr[i11] = i14;
        return i13 != i14;
    }

    private static Block[] buildBlocks(Node[] nodeArr) {
        HashMap hashMap = new HashMap();
        ObjArray objArray = new ObjArray();
        int i11 = 0;
        for (int i12 = 0; i12 < nodeArr.length; i12++) {
            int type = nodeArr[i12].getType();
            if (type == 5 || type == 6 || type == 7) {
                FatBlock newFatBlock = newFatBlock(i11, i12);
                if (nodeArr[i11].getType() == 131) {
                    hashMap.put(nodeArr[i11], newFatBlock);
                }
                objArray.add(newFatBlock);
                i11 = i12 + 1;
            } else if (type == 131 && i12 != i11) {
                FatBlock newFatBlock2 = newFatBlock(i11, i12 - 1);
                if (nodeArr[i11].getType() == 131) {
                    hashMap.put(nodeArr[i11], newFatBlock2);
                }
                objArray.add(newFatBlock2);
                i11 = i12;
            }
        }
        if (i11 != nodeArr.length) {
            FatBlock newFatBlock3 = newFatBlock(i11, nodeArr.length - 1);
            if (nodeArr[i11].getType() == 131) {
                hashMap.put(nodeArr[i11], newFatBlock3);
            }
            objArray.add(newFatBlock3);
        }
        for (int i13 = 0; i13 < objArray.size(); i13++) {
            FatBlock fatBlock = (FatBlock) objArray.get(i13);
            Node node = nodeArr[fatBlock.realBlock.itsEndNodeIndex];
            int type2 = node.getType();
            if (type2 != 5 && i13 < objArray.size() - 1) {
                FatBlock fatBlock2 = (FatBlock) objArray.get(i13 + 1);
                fatBlock.addSuccessor(fatBlock2);
                fatBlock2.addPredecessor(fatBlock);
            }
            if (type2 == 7 || type2 == 6 || type2 == 5) {
                Node node2 = ((Jump) node).target;
                FatBlock fatBlock3 = (FatBlock) hashMap.get(node2);
                node2.putProp(6, fatBlock3.realBlock);
                fatBlock.addSuccessor(fatBlock3);
                fatBlock3.addPredecessor(fatBlock);
            }
        }
        Block[] blockArr = new Block[objArray.size()];
        for (int i14 = 0; i14 < objArray.size(); i14++) {
            FatBlock fatBlock4 = (FatBlock) objArray.get(i14);
            Block block = fatBlock4.realBlock;
            block.itsSuccessors = fatBlock4.getSuccessors();
            block.itsPredecessors = fatBlock4.getPredecessors();
            block.itsBlockID = i14;
            blockArr[i14] = block;
        }
        return blockArr;
    }

    private boolean doReachedUseDataFlow() {
        this.itsLiveOnExitSet.clear();
        if (this.itsSuccessors != null) {
            int i11 = 0;
            while (true) {
                Block[] blockArr = this.itsSuccessors;
                if (i11 >= blockArr.length) {
                    break;
                }
                this.itsLiveOnExitSet.or(blockArr[i11].itsLiveOnEntrySet);
                i11++;
            }
        }
        return updateEntrySet(this.itsLiveOnEntrySet, this.itsLiveOnExitSet, this.itsUseBeforeDefSet, this.itsNotDefSet);
    }

    private boolean doTypeFlow(OptFunctionNode optFunctionNode, Node[] nodeArr, int[] iArr) {
        boolean z11 = false;
        for (int i11 = this.itsStartNodeIndex; i11 <= this.itsEndNodeIndex; i11++) {
            Node node = nodeArr[i11];
            if (node != null) {
                z11 |= findDefPoints(optFunctionNode, node, iArr);
            }
        }
        return z11;
    }

    private static boolean findDefPoints(OptFunctionNode optFunctionNode, Node node, int[] iArr) {
        boolean assignType;
        Node firstChild = node.getFirstChild();
        boolean z11 = false;
        for (Node node2 = firstChild; node2 != null; node2 = node2.getNext()) {
            z11 |= findDefPoints(optFunctionNode, node2, iArr);
        }
        int type = node.getType();
        if (type == 56) {
            assignType = assignType(iArr, optFunctionNode.getVarIndex(node), findExpressionType(optFunctionNode, firstChild.getNext(), iArr));
        } else {
            if ((type != 106 && type != 107) || firstChild.getType() != 55) {
                return z11;
            }
            assignType = assignType(iArr, optFunctionNode.getVarIndex(firstChild), 1);
        }
        return assignType | z11;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0053 A[FALL_THROUGH, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int findExpressionType(org.mozilla.javascript.optimizer.OptFunctionNode r3, org.mozilla.javascript.Node r4, int[] r5) {
        /*
            int r0 = r4.getType()
            r1 = 35
            if (r0 == r1) goto L72
            r1 = 37
            if (r0 == r1) goto L72
            r1 = 40
            r2 = 1
            if (r0 == r1) goto L71
            r1 = 89
            if (r0 == r1) goto L72
            r1 = 102(0x66, float:1.43E-43)
            if (r0 == r1) goto L5b
            r1 = 55
            if (r0 == r1) goto L54
            r1 = 56
            if (r0 == r1) goto L72
            switch(r0) {
                case 8: goto L72;
                case 9: goto L53;
                case 10: goto L53;
                case 11: goto L53;
                default: goto L24;
            }
        L24:
            switch(r0) {
                case 18: goto L53;
                case 19: goto L53;
                case 20: goto L53;
                case 21: goto L41;
                case 22: goto L53;
                case 23: goto L53;
                case 24: goto L53;
                case 25: goto L53;
                default: goto L27;
            }
        L27:
            switch(r0) {
                case 27: goto L53;
                case 28: goto L53;
                case 29: goto L53;
                default: goto L2a;
            }
        L2a:
            switch(r0) {
                case 104: goto L2f;
                case 105: goto L2f;
                case 106: goto L53;
                case 107: goto L53;
                default: goto L2d;
            }
        L2d:
            r3 = 3
            return r3
        L2f:
            org.mozilla.javascript.Node r4 = r4.getFirstChild()
            int r0 = findExpressionType(r3, r4, r5)
            org.mozilla.javascript.Node r4 = r4.getNext()
            int r3 = findExpressionType(r3, r4, r5)
            r3 = r3 | r0
            return r3
        L41:
            org.mozilla.javascript.Node r4 = r4.getFirstChild()
            int r0 = findExpressionType(r3, r4, r5)
            org.mozilla.javascript.Node r4 = r4.getNext()
            int r3 = findExpressionType(r3, r4, r5)
            r3 = r3 | r0
            return r3
        L53:
            return r2
        L54:
            int r3 = r3.getVarIndex(r4)
            r3 = r5[r3]
            return r3
        L5b:
            org.mozilla.javascript.Node r4 = r4.getFirstChild()
            org.mozilla.javascript.Node r4 = r4.getNext()
            org.mozilla.javascript.Node r0 = r4.getNext()
            int r4 = findExpressionType(r3, r4, r5)
            int r3 = findExpressionType(r3, r0, r5)
            r3 = r3 | r4
            return r3
        L71:
            return r2
        L72:
            org.mozilla.javascript.Node r4 = r4.getLastChild()
            int r3 = findExpressionType(r3, r4, r5)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.optimizer.Block.findExpressionType(org.mozilla.javascript.optimizer.OptFunctionNode, org.mozilla.javascript.Node, int[]):int");
    }

    private void initLiveOnEntrySets(OptFunctionNode optFunctionNode, Node[] nodeArr) {
        int varCount = optFunctionNode.getVarCount();
        this.itsUseBeforeDefSet = new BitSet(varCount);
        this.itsNotDefSet = new BitSet(varCount);
        this.itsLiveOnEntrySet = new BitSet(varCount);
        this.itsLiveOnExitSet = new BitSet(varCount);
        for (int i11 = this.itsStartNodeIndex; i11 <= this.itsEndNodeIndex; i11++) {
            lookForVariableAccess(optFunctionNode, nodeArr[i11]);
        }
        this.itsNotDefSet.flip(0, varCount);
    }

    private void lookForVariableAccess(OptFunctionNode optFunctionNode, Node node) {
        int type = node.getType();
        if (type == 55) {
            int varIndex = optFunctionNode.getVarIndex(node);
            if (this.itsNotDefSet.get(varIndex)) {
                return;
            }
            this.itsUseBeforeDefSet.set(varIndex);
            return;
        }
        if (type == 56) {
            lookForVariableAccess(optFunctionNode, node.getFirstChild().getNext());
            this.itsNotDefSet.set(optFunctionNode.getVarIndex(node));
            return;
        }
        if (type == 106 || type == 107) {
            Node firstChild = node.getFirstChild();
            if (firstChild.getType() != 55) {
                lookForVariableAccess(optFunctionNode, firstChild);
                return;
            }
            int varIndex2 = optFunctionNode.getVarIndex(firstChild);
            if (!this.itsNotDefSet.get(varIndex2)) {
                this.itsUseBeforeDefSet.set(varIndex2);
            }
            this.itsNotDefSet.set(varIndex2);
            return;
        }
        if (type != 137) {
            for (Node firstChild2 = node.getFirstChild(); firstChild2 != null; firstChild2 = firstChild2.getNext()) {
                lookForVariableAccess(optFunctionNode, firstChild2);
            }
            return;
        }
        int indexForNameNode = optFunctionNode.fnode.getIndexForNameNode(node);
        if (indexForNameNode <= -1 || this.itsNotDefSet.get(indexForNameNode)) {
            return;
        }
        this.itsUseBeforeDefSet.set(indexForNameNode);
    }

    private void markAnyTypeVariables(int[] iArr) {
        for (int i11 = 0; i11 != iArr.length; i11++) {
            if (this.itsLiveOnEntrySet.get(i11)) {
                assignType(iArr, i11, 3);
            }
        }
    }

    private static FatBlock newFatBlock(int i11, int i12) {
        FatBlock fatBlock = new FatBlock();
        fatBlock.realBlock = new Block(i11, i12);
        return fatBlock;
    }

    private static void reachingDefDataFlow(OptFunctionNode optFunctionNode, Node[] nodeArr, Block[] blockArr, int[] iArr) {
        Block[] blockArr2;
        for (Block block : blockArr) {
            block.initLiveOnEntrySets(optFunctionNode, nodeArr);
        }
        boolean[] zArr = new boolean[blockArr.length];
        boolean[] zArr2 = new boolean[blockArr.length];
        int length = blockArr.length - 1;
        zArr[length] = true;
        while (true) {
            boolean z11 = false;
            while (true) {
                if (zArr[length] || !zArr2[length]) {
                    zArr2[length] = true;
                    zArr[length] = false;
                    if (blockArr[length].doReachedUseDataFlow() && (blockArr2 = blockArr[length].itsPredecessors) != null) {
                        for (Block block2 : blockArr2) {
                            int i11 = block2.itsBlockID;
                            zArr[i11] = true;
                            z11 |= i11 > length;
                        }
                    }
                }
                if (length == 0) {
                    break;
                } else {
                    length--;
                }
            }
            if (!z11) {
                blockArr[0].markAnyTypeVariables(iArr);
                return;
            }
            length = blockArr.length - 1;
        }
    }

    public static void runFlowAnalyzes(OptFunctionNode optFunctionNode, Node[] nodeArr) {
        int paramCount = optFunctionNode.fnode.getParamCount();
        int paramAndVarCount = optFunctionNode.fnode.getParamAndVarCount();
        int[] iArr = new int[paramAndVarCount];
        for (int i11 = 0; i11 != paramCount; i11++) {
            iArr[i11] = 3;
        }
        for (int i12 = paramCount; i12 != paramAndVarCount; i12++) {
            iArr[i12] = 0;
        }
        Block[] buildBlocks = buildBlocks(nodeArr);
        reachingDefDataFlow(optFunctionNode, nodeArr, buildBlocks, iArr);
        typeFlow(optFunctionNode, nodeArr, buildBlocks, iArr);
        while (paramCount != paramAndVarCount) {
            if (iArr[paramCount] == 1) {
                optFunctionNode.setIsNumberVar(paramCount);
            }
            paramCount++;
        }
    }

    private static String toString(Block[] blockArr, Node[] nodeArr) {
        return null;
    }

    private static void typeFlow(OptFunctionNode optFunctionNode, Node[] nodeArr, Block[] blockArr, int[] iArr) {
        boolean z11;
        Block[] blockArr2;
        boolean[] zArr = new boolean[blockArr.length];
        boolean[] zArr2 = new boolean[blockArr.length];
        zArr[0] = true;
        do {
            int i11 = 0;
            z11 = false;
            while (true) {
                if (zArr[i11] || !zArr2[i11]) {
                    zArr2[i11] = true;
                    zArr[i11] = false;
                    if (blockArr[i11].doTypeFlow(optFunctionNode, nodeArr, iArr) && (blockArr2 = blockArr[i11].itsSuccessors) != null) {
                        for (Block block : blockArr2) {
                            int i12 = block.itsBlockID;
                            zArr[i12] = true;
                            z11 |= i12 < i11;
                        }
                    }
                }
                if (i11 == blockArr.length - 1) {
                    break;
                } else {
                    i11++;
                }
            }
        } while (z11);
    }

    private boolean updateEntrySet(BitSet bitSet, BitSet bitSet2, BitSet bitSet3, BitSet bitSet4) {
        int cardinality = bitSet.cardinality();
        bitSet.or(bitSet2);
        bitSet.and(bitSet4);
        bitSet.or(bitSet3);
        return bitSet.cardinality() != cardinality;
    }

    private void printLiveOnEntrySet(OptFunctionNode optFunctionNode) {
    }
}

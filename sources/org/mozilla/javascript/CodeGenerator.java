package org.mozilla.javascript;

import org.mozilla.javascript.ObjToIntMap;
import org.mozilla.javascript.ast.AstRoot;
import org.mozilla.javascript.ast.FunctionNode;
import org.mozilla.javascript.ast.ScriptNode;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
class CodeGenerator extends Icode {
    private static final int ECF_TAIL = 1;
    private static final int MIN_FIXUP_TABLE_SIZE = 40;
    private static final int MIN_LABEL_TABLE_SIZE = 32;
    private CompilerEnvirons compilerEnv;
    private int doubleTableTop;
    private int exceptionTableTop;
    private long[] fixupTable;
    private int fixupTableTop;
    private int iCodeTop;
    private InterpreterData itsData;
    private boolean itsInFunctionFlag;
    private boolean itsInTryFlag;
    private int[] labelTable;
    private int labelTableTop;
    private int lineNumber;
    private int localTop;
    private ScriptNode scriptOrFn;
    private int stackDepth;
    private ObjToIntMap strings = new ObjToIntMap(20);
    private ObjArray literalIds = new ObjArray();

    private void addBackwardGoto(int i11, int i12) {
        int i13 = this.iCodeTop;
        if (i13 <= i12) {
            throw Kit.codeBug();
        }
        addGotoOp(i11);
        resolveGoto(i13, i12);
    }

    private void addExceptionHandler(int i11, int i12, int i13, boolean z11, int i14, int i15) {
        int i16 = this.exceptionTableTop;
        int[] iArr = this.itsData.itsExceptionTable;
        if (iArr == null) {
            if (i16 != 0) {
                Kit.codeBug();
            }
            iArr = new int[12];
            this.itsData.itsExceptionTable = iArr;
        } else if (iArr.length == i16) {
            int[] iArr2 = new int[iArr.length * 2];
            System.arraycopy(iArr, 0, iArr2, 0, i16);
            this.itsData.itsExceptionTable = iArr2;
            iArr = iArr2;
        }
        iArr[i16] = i11;
        iArr[i16 + 1] = i12;
        iArr[i16 + 2] = i13;
        iArr[i16 + 3] = z11 ? 1 : 0;
        iArr[i16 + 4] = i14;
        iArr[i16 + 5] = i15;
        this.exceptionTableTop = i16 + 6;
    }

    private void addGoto(Node node, int i11) {
        int targetLabel = getTargetLabel(node);
        if (targetLabel >= this.labelTableTop) {
            Kit.codeBug();
        }
        int i12 = this.labelTable[targetLabel];
        if (i12 != -1) {
            addBackwardGoto(i11, i12);
            return;
        }
        int i13 = this.iCodeTop;
        addGotoOp(i11);
        int i14 = this.fixupTableTop;
        long[] jArr = this.fixupTable;
        if (jArr == null || i14 == jArr.length) {
            if (jArr == null) {
                this.fixupTable = new long[40];
            } else {
                long[] jArr2 = new long[jArr.length * 2];
                System.arraycopy(jArr, 0, jArr2, 0, i14);
                this.fixupTable = jArr2;
            }
        }
        this.fixupTableTop = i14 + 1;
        this.fixupTable[i14] = (targetLabel << 32) | i13;
    }

    private void addGotoOp(int i11) {
        byte[] bArr = this.itsData.itsICode;
        int i12 = this.iCodeTop;
        if (i12 + 3 > bArr.length) {
            bArr = increaseICodeCapacity(3);
        }
        bArr[i12] = (byte) i11;
        this.iCodeTop = i12 + 3;
    }

    private void addIcode(int i11) {
        if (!Icode.validIcode(i11)) {
            throw Kit.codeBug();
        }
        addUint8(i11 & 255);
    }

    private void addIndexOp(int i11, int i12) {
        addIndexPrefix(i12);
        if (Icode.validIcode(i11)) {
            addIcode(i11);
        } else {
            addToken(i11);
        }
    }

    private void addIndexPrefix(int i11) {
        if (i11 < 0) {
            Kit.codeBug();
        }
        if (i11 < 6) {
            addIcode((-32) - i11);
            return;
        }
        if (i11 <= 255) {
            addIcode(-38);
            addUint8(i11);
        } else if (i11 <= 65535) {
            addIcode(-39);
            addUint16(i11);
        } else {
            addIcode(-40);
            addInt(i11);
        }
    }

    private void addInt(int i11) {
        byte[] bArr = this.itsData.itsICode;
        int i12 = this.iCodeTop;
        int i13 = i12 + 4;
        if (i13 > bArr.length) {
            bArr = increaseICodeCapacity(4);
        }
        bArr[i12] = (byte) (i11 >>> 24);
        bArr[i12 + 1] = (byte) (i11 >>> 16);
        bArr[i12 + 2] = (byte) (i11 >>> 8);
        bArr[i12 + 3] = (byte) i11;
        this.iCodeTop = i13;
    }

    private void addStringOp(int i11, String str) {
        addStringPrefix(str);
        if (Icode.validIcode(i11)) {
            addIcode(i11);
        } else {
            addToken(i11);
        }
    }

    private void addStringPrefix(String str) {
        int i11 = this.strings.get(str, -1);
        if (i11 == -1) {
            i11 = this.strings.size();
            this.strings.put(str, i11);
        }
        if (i11 < 4) {
            addIcode((-41) - i11);
            return;
        }
        if (i11 <= 255) {
            addIcode(-45);
            addUint8(i11);
        } else if (i11 <= 65535) {
            addIcode(-46);
            addUint16(i11);
        } else {
            addIcode(-47);
            addInt(i11);
        }
    }

    private void addToken(int i11) {
        if (!Icode.validTokenCode(i11)) {
            throw Kit.codeBug();
        }
        addUint8(i11);
    }

    private void addUint16(int i11) {
        if (((-65536) & i11) != 0) {
            throw Kit.codeBug();
        }
        byte[] bArr = this.itsData.itsICode;
        int i12 = this.iCodeTop;
        int i13 = i12 + 2;
        if (i13 > bArr.length) {
            bArr = increaseICodeCapacity(2);
        }
        bArr[i12] = (byte) (i11 >>> 8);
        bArr[i12 + 1] = (byte) i11;
        this.iCodeTop = i13;
    }

    private void addUint8(int i11) {
        if ((i11 & (-256)) != 0) {
            throw Kit.codeBug();
        }
        byte[] bArr = this.itsData.itsICode;
        int i12 = this.iCodeTop;
        if (i12 == bArr.length) {
            bArr = increaseICodeCapacity(1);
        }
        bArr[i12] = (byte) i11;
        this.iCodeTop = i12 + 1;
    }

    private void addVarOp(int i11, int i12) {
        if (i11 != -7) {
            if (i11 == 156) {
                if (i12 >= 128) {
                    addIndexOp(-60, i12);
                    return;
                } else {
                    addIcode(-61);
                    addUint8(i12);
                    return;
                }
            }
            if (i11 != 55 && i11 != 56) {
                throw Kit.codeBug();
            }
            if (i12 < 128) {
                addIcode(i11 == 55 ? -48 : -49);
                addUint8(i12);
                return;
            }
        }
        addIndexOp(i11, i12);
    }

    private int allocLocal() {
        int i11 = this.localTop;
        int i12 = i11 + 1;
        this.localTop = i12;
        InterpreterData interpreterData = this.itsData;
        if (i12 > interpreterData.itsMaxLocals) {
            interpreterData.itsMaxLocals = i12;
        }
        return i11;
    }

    private RuntimeException badTree(Node node) {
        throw new RuntimeException(node.toString());
    }

    private void fixLabelGotos() {
        for (int i11 = 0; i11 < this.fixupTableTop; i11++) {
            long j11 = this.fixupTable[i11];
            int i12 = (int) (j11 >> 32);
            int i13 = (int) j11;
            int i14 = this.labelTable[i12];
            if (i14 == -1) {
                throw Kit.codeBug();
            }
            resolveGoto(i13, i14);
        }
        this.fixupTableTop = 0;
    }

    private void generateCallFunAndThis(Node node) {
        int type = node.getType();
        if (type != 33 && type != 36) {
            if (type == 39) {
                addStringOp(-15, node.getString());
                stackChange(2);
                return;
            } else {
                visitExpression(node, 0);
                addIcode(-18);
                stackChange(1);
                return;
            }
        }
        Node firstChild = node.getFirstChild();
        visitExpression(firstChild, 0);
        Node next = firstChild.getNext();
        if (type == 33) {
            addStringOp(-16, next.getString());
            stackChange(1);
        } else {
            visitExpression(next, 0);
            addIcode(-17);
        }
    }

    private void generateFunctionICode() {
        this.itsInFunctionFlag = true;
        FunctionNode functionNode = (FunctionNode) this.scriptOrFn;
        this.itsData.itsFunctionType = functionNode.getFunctionType();
        this.itsData.itsNeedsActivation = functionNode.requiresActivation();
        if (functionNode.getFunctionName() != null) {
            this.itsData.itsName = functionNode.getName();
        }
        if (functionNode.isGenerator()) {
            addIcode(-62);
            addUint16(functionNode.getBaseLineno() & 65535);
        }
        generateICodeFromTree(functionNode.getLastChild());
    }

    private void generateICodeFromTree(Node node) {
        generateNestedFunctions();
        generateRegExpLiterals();
        visitStatement(node, 0);
        fixLabelGotos();
        if (this.itsData.itsFunctionType == 0) {
            addToken(64);
        }
        byte[] bArr = this.itsData.itsICode;
        int length = bArr.length;
        int i11 = this.iCodeTop;
        if (length != i11) {
            byte[] bArr2 = new byte[i11];
            System.arraycopy(bArr, 0, bArr2, 0, i11);
            this.itsData.itsICode = bArr2;
        }
        if (this.strings.size() == 0) {
            this.itsData.itsStringTable = null;
        } else {
            this.itsData.itsStringTable = new String[this.strings.size()];
            ObjToIntMap.Iterator newIterator = this.strings.newIterator();
            newIterator.start();
            while (!newIterator.done()) {
                String str = (String) newIterator.getKey();
                int value = newIterator.getValue();
                if (this.itsData.itsStringTable[value] != null) {
                    Kit.codeBug();
                }
                this.itsData.itsStringTable[value] = str;
                newIterator.next();
            }
        }
        int i12 = this.doubleTableTop;
        if (i12 == 0) {
            this.itsData.itsDoubleTable = null;
        } else {
            double[] dArr = this.itsData.itsDoubleTable;
            if (dArr.length != i12) {
                double[] dArr2 = new double[i12];
                System.arraycopy(dArr, 0, dArr2, 0, i12);
                this.itsData.itsDoubleTable = dArr2;
            }
        }
        int i13 = this.exceptionTableTop;
        if (i13 != 0) {
            int[] iArr = this.itsData.itsExceptionTable;
            if (iArr.length != i13) {
                int[] iArr2 = new int[i13];
                System.arraycopy(iArr, 0, iArr2, 0, i13);
                this.itsData.itsExceptionTable = iArr2;
            }
        }
        this.itsData.itsMaxVars = this.scriptOrFn.getParamAndVarCount();
        InterpreterData interpreterData = this.itsData;
        interpreterData.itsMaxFrameArray = interpreterData.itsMaxVars + interpreterData.itsMaxLocals + interpreterData.itsMaxStack;
        interpreterData.argNames = this.scriptOrFn.getParamAndVarNames();
        this.itsData.argIsConst = this.scriptOrFn.getParamAndVarConst();
        this.itsData.argCount = this.scriptOrFn.getParamCount();
        this.itsData.encodedSourceStart = this.scriptOrFn.getEncodedSourceStart();
        this.itsData.encodedSourceEnd = this.scriptOrFn.getEncodedSourceEnd();
        if (this.literalIds.size() != 0) {
            this.itsData.literalIds = this.literalIds.toArray();
        }
    }

    private void generateNestedFunctions() {
        int functionCount = this.scriptOrFn.getFunctionCount();
        if (functionCount == 0) {
            return;
        }
        InterpreterData[] interpreterDataArr = new InterpreterData[functionCount];
        for (int i11 = 0; i11 != functionCount; i11++) {
            FunctionNode functionNode = this.scriptOrFn.getFunctionNode(i11);
            CodeGenerator codeGenerator = new CodeGenerator();
            codeGenerator.compilerEnv = this.compilerEnv;
            codeGenerator.scriptOrFn = functionNode;
            codeGenerator.itsData = new InterpreterData(this.itsData);
            codeGenerator.generateFunctionICode();
            interpreterDataArr[i11] = codeGenerator.itsData;
        }
        this.itsData.itsNestedFunctions = interpreterDataArr;
    }

    private void generateRegExpLiterals() {
        int regexpCount = this.scriptOrFn.getRegexpCount();
        if (regexpCount == 0) {
            return;
        }
        Context context = Context.getContext();
        RegExpProxy checkRegExpProxy = ScriptRuntime.checkRegExpProxy(context);
        Object[] objArr = new Object[regexpCount];
        for (int i11 = 0; i11 != regexpCount; i11++) {
            objArr[i11] = checkRegExpProxy.compileRegExp(context, this.scriptOrFn.getRegexpString(i11), this.scriptOrFn.getRegexpFlags(i11));
        }
        this.itsData.itsRegExpLiterals = objArr;
    }

    private int getDoubleIndex(double d11) {
        int i11 = this.doubleTableTop;
        if (i11 == 0) {
            this.itsData.itsDoubleTable = new double[64];
        } else {
            double[] dArr = this.itsData.itsDoubleTable;
            if (dArr.length == i11) {
                double[] dArr2 = new double[i11 * 2];
                System.arraycopy(dArr, 0, dArr2, 0, i11);
                this.itsData.itsDoubleTable = dArr2;
            }
        }
        this.itsData.itsDoubleTable[i11] = d11;
        this.doubleTableTop = i11 + 1;
        return i11;
    }

    private int getLocalBlockRef(Node node) {
        return ((Node) node.getProp(3)).getExistingIntProp(2);
    }

    private int getTargetLabel(Node node) {
        int labelId = node.labelId();
        if (labelId != -1) {
            return labelId;
        }
        int i11 = this.labelTableTop;
        int[] iArr = this.labelTable;
        if (iArr == null || i11 == iArr.length) {
            if (iArr == null) {
                this.labelTable = new int[32];
            } else {
                int[] iArr2 = new int[iArr.length * 2];
                System.arraycopy(iArr, 0, iArr2, 0, i11);
                this.labelTable = iArr2;
            }
        }
        this.labelTableTop = i11 + 1;
        this.labelTable[i11] = -1;
        node.labelId(i11);
        return i11;
    }

    private byte[] increaseICodeCapacity(int i11) {
        byte[] bArr = this.itsData.itsICode;
        int length = bArr.length;
        int i12 = this.iCodeTop;
        int i13 = i11 + i12;
        if (i13 <= length) {
            throw Kit.codeBug();
        }
        int i14 = length * 2;
        if (i13 <= i14) {
            i13 = i14;
        }
        byte[] bArr2 = new byte[i13];
        System.arraycopy(bArr, 0, bArr2, 0, i12);
        this.itsData.itsICode = bArr2;
        return bArr2;
    }

    private void markTargetLabel(Node node) {
        int targetLabel = getTargetLabel(node);
        if (this.labelTable[targetLabel] != -1) {
            Kit.codeBug();
        }
        this.labelTable[targetLabel] = this.iCodeTop;
    }

    private void releaseLocal(int i11) {
        int i12 = this.localTop - 1;
        this.localTop = i12;
        if (i11 != i12) {
            Kit.codeBug();
        }
    }

    private void resolveForwardGoto(int i11) {
        int i12 = this.iCodeTop;
        if (i12 < i11 + 3) {
            throw Kit.codeBug();
        }
        resolveGoto(i11, i12);
    }

    private void resolveGoto(int i11, int i12) {
        int i13 = i12 - i11;
        if (i13 >= 0 && i13 <= 2) {
            throw Kit.codeBug();
        }
        int i14 = i11 + 1;
        if (i13 != ((short) i13)) {
            InterpreterData interpreterData = this.itsData;
            if (interpreterData.longJumps == null) {
                interpreterData.longJumps = new UintMap();
            }
            this.itsData.longJumps.put(i14, i12);
            i13 = 0;
        }
        byte[] bArr = this.itsData.itsICode;
        bArr[i14] = (byte) (i13 >> 8);
        bArr[i11 + 2] = (byte) i13;
    }

    private void stackChange(int i11) {
        if (i11 <= 0) {
            this.stackDepth += i11;
            return;
        }
        int i12 = this.stackDepth + i11;
        InterpreterData interpreterData = this.itsData;
        if (i12 > interpreterData.itsMaxStack) {
            interpreterData.itsMaxStack = i12;
        }
        this.stackDepth = i12;
    }

    private void updateLineNumber(Node node) {
        int lineno = node.getLineno();
        if (lineno == this.lineNumber || lineno < 0) {
            return;
        }
        InterpreterData interpreterData = this.itsData;
        if (interpreterData.firstLinePC < 0) {
            interpreterData.firstLinePC = lineno;
        }
        this.lineNumber = lineno;
        addIcode(-26);
        addUint16(lineno & 65535);
    }

    private void visitArrayComprehension(Node node, Node node2, Node node3) {
        visitStatement(node2, this.stackDepth);
        visitExpression(node3, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0238  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void visitExpression(org.mozilla.javascript.Node r14, int r15) {
        /*
            Method dump skipped, instructions count: 1210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.CodeGenerator.visitExpression(org.mozilla.javascript.Node, int):void");
    }

    private void visitIncDec(Node node, Node node2) {
        int existingIntProp = node.getExistingIntProp(13);
        int type = node2.getType();
        if (type == 33) {
            Node firstChild = node2.getFirstChild();
            visitExpression(firstChild, 0);
            addStringOp(-9, firstChild.getNext().getString());
            addUint8(existingIntProp);
            return;
        }
        if (type == 36) {
            Node firstChild2 = node2.getFirstChild();
            visitExpression(firstChild2, 0);
            visitExpression(firstChild2.getNext(), 0);
            addIcode(-10);
            addUint8(existingIntProp);
            stackChange(-1);
            return;
        }
        if (type == 39) {
            addStringOp(-8, node2.getString());
            addUint8(existingIntProp);
            stackChange(1);
        } else {
            if (type != 55) {
                if (type != 67) {
                    throw badTree(node);
                }
                visitExpression(node2.getFirstChild(), 0);
                addIcode(-11);
                addUint8(existingIntProp);
                return;
            }
            if (this.itsData.itsNeedsActivation) {
                Kit.codeBug();
            }
            addVarOp(-7, this.scriptOrFn.getIndexForNameNode(node2));
            addUint8(existingIntProp);
            stackChange(1);
        }
    }

    private void visitLiteral(Node node, Node node2) {
        Object[] objArr;
        int length;
        int type = node.getType();
        if (type == 65) {
            length = 0;
            for (Node node3 = node2; node3 != null; node3 = node3.getNext()) {
                length++;
            }
            objArr = null;
        } else {
            if (type != 66) {
                throw badTree(node);
            }
            objArr = (Object[]) node.getProp(12);
            length = objArr.length;
        }
        addIndexOp(-29, length);
        stackChange(2);
        while (node2 != null) {
            int type2 = node2.getType();
            if (type2 == 151) {
                visitExpression(node2.getFirstChild(), 0);
                addIcode(-57);
            } else if (type2 == 152) {
                visitExpression(node2.getFirstChild(), 0);
                addIcode(-58);
            } else {
                visitExpression(node2, 0);
                addIcode(-30);
            }
            stackChange(-1);
            node2 = node2.getNext();
        }
        if (type == 65) {
            int[] iArr = (int[]) node.getProp(11);
            if (iArr == null) {
                addToken(65);
            } else {
                int size = this.literalIds.size();
                this.literalIds.add(iArr);
                addIndexOp(-31, size);
            }
        } else {
            int size2 = this.literalIds.size();
            this.literalIds.add(objArr);
            addIndexOp(66, size2);
        }
        stackChange(-1);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:100:0x023e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:101:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0163 A[LOOP:0: B:36:0x0161->B:37:0x0163, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void visitStatement(org.mozilla.javascript.Node r13, int r14) {
        /*
            Method dump skipped, instructions count: 630
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.CodeGenerator.visitStatement(org.mozilla.javascript.Node, int):void");
    }

    public InterpreterData compile(CompilerEnvirons compilerEnvirons, ScriptNode scriptNode, String str, boolean z11) {
        this.compilerEnv = compilerEnvirons;
        new NodeTransformer().transform(scriptNode);
        if (z11) {
            this.scriptOrFn = scriptNode.getFunctionNode(0);
        } else {
            this.scriptOrFn = scriptNode;
        }
        InterpreterData interpreterData = new InterpreterData(compilerEnvirons.getLanguageVersion(), this.scriptOrFn.getSourceName(), str, ((AstRoot) scriptNode).isInStrictMode());
        this.itsData = interpreterData;
        interpreterData.topLevel = true;
        if (z11) {
            generateFunctionICode();
        } else {
            generateICodeFromTree(this.scriptOrFn);
        }
        return this.itsData;
    }
}

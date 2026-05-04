package org.mozilla.javascript.optimizer;

import androidx.core.app.NotificationCompat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import org.mozilla.classfile.ClassFileWriter;
import org.mozilla.javascript.CompilerEnvirons;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Kit;
import org.mozilla.javascript.Node;
import org.mozilla.javascript.Token;
import org.mozilla.javascript.ast.FunctionNode;
import org.mozilla.javascript.ast.Jump;
import org.mozilla.javascript.ast.ScriptNode;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
class BodyCodegen {
    private static final int ECMAERROR_EXCEPTION = 2;
    private static final int EVALUATOR_EXCEPTION = 1;
    private static final int EXCEPTION_MAX = 5;
    private static final int FINALLY_EXCEPTION = 4;
    static final int GENERATOR_START = 0;
    static final int GENERATOR_TERMINATE = -1;
    static final int GENERATOR_YIELD_START = 1;
    private static final int JAVASCRIPT_EXCEPTION = 0;
    private static final int MAX_LOCALS = 1024;
    private static final int THROWABLE_EXCEPTION = 3;
    private short argsLocal;
    ClassFileWriter cfw;
    Codegen codegen;
    CompilerEnvirons compilerEnv;
    private short contextLocal;
    private int enterAreaStartLabel;
    private int epilogueLabel;
    private Map<Node, FinallyReturnPoint> finallys;
    private short firstFreeLocal;
    private OptFunctionNode fnCurrent;
    private short funObjLocal;
    private short generatorStateLocal;
    private int generatorSwitch;
    private boolean hasVarsInRegs;
    private boolean inDirectCallFunction;
    private boolean inLocalBlock;
    private boolean isGenerator;
    private boolean itsForcedObjectParameters;
    private int itsLineNumber;
    private short itsOneArgArray;
    private short itsZeroArgArray;
    private List<Node> literals;
    private int[] locals;
    private short localsMax;
    private short operationLocal;
    private short popvLocal;
    private int savedCodeOffset;
    ScriptNode scriptOrFn;
    public int scriptOrFnIndex;
    private short thisObjLocal;
    private short[] varRegisters;
    private short variableObjectLocal;
    private ExceptionManager exceptionManager = new ExceptionManager();
    private int maxLocals = 0;
    private int maxStack = 0;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class ExceptionManager {
        private LinkedList<ExceptionInfo> exceptionInfo = new LinkedList<>();

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class ExceptionInfo {
            Node finallyBlock;
            Jump node;
            int[] handlerLabels = new int[5];
            int[] exceptionStarts = new int[5];
            Node currentFinally = null;

            public ExceptionInfo(Jump jump, Node node) {
                this.node = jump;
                this.finallyBlock = node;
            }
        }

        public ExceptionManager() {
        }

        private void endCatch(ExceptionInfo exceptionInfo, int i11, int i12) {
            int i13 = exceptionInfo.exceptionStarts[i11];
            if (i13 == 0) {
                throw new IllegalStateException("bad exception start");
            }
            if (BodyCodegen.this.cfw.t0(i13) != BodyCodegen.this.cfw.t0(i12)) {
                BodyCodegen bodyCodegen = BodyCodegen.this;
                bodyCodegen.cfw.A(exceptionInfo.exceptionStarts[i11], i12, exceptionInfo.handlerLabels[i11], bodyCodegen.exceptionTypeToName(i11));
            }
        }

        private ExceptionInfo getTop() {
            return this.exceptionInfo.getLast();
        }

        public void addHandler(int i11, int i12, int i13) {
            ExceptionInfo top = getTop();
            top.handlerLabels[i11] = i12;
            top.exceptionStarts[i11] = i13;
        }

        public void markInlineFinallyEnd(Node node, int i11) {
            LinkedList<ExceptionInfo> linkedList = this.exceptionInfo;
            ListIterator<ExceptionInfo> listIterator = linkedList.listIterator(linkedList.size());
            while (listIterator.hasPrevious()) {
                ExceptionInfo previous = listIterator.previous();
                for (int i12 = 0; i12 < 5; i12++) {
                    if (previous.handlerLabels[i12] != 0 && previous.currentFinally == node) {
                        previous.exceptionStarts[i12] = i11;
                        previous.currentFinally = null;
                    }
                }
                if (previous.finallyBlock == node) {
                    return;
                }
            }
        }

        public void markInlineFinallyStart(Node node, int i11) {
            LinkedList<ExceptionInfo> linkedList = this.exceptionInfo;
            ListIterator<ExceptionInfo> listIterator = linkedList.listIterator(linkedList.size());
            while (listIterator.hasPrevious()) {
                ExceptionInfo previous = listIterator.previous();
                for (int i12 = 0; i12 < 5; i12++) {
                    if (previous.handlerLabels[i12] != 0 && previous.currentFinally == null) {
                        endCatch(previous, i12, i11);
                        previous.exceptionStarts[i12] = 0;
                        previous.currentFinally = node;
                    }
                }
                if (previous.finallyBlock == node) {
                    return;
                }
            }
        }

        public void popExceptionInfo() {
            this.exceptionInfo.removeLast();
        }

        public void pushExceptionInfo(Jump jump) {
            this.exceptionInfo.add(new ExceptionInfo(jump, BodyCodegen.this.getFinallyAtTarget(jump.getFinally())));
        }

        public int removeHandler(int i11, int i12) {
            ExceptionInfo top = getTop();
            int i13 = top.handlerLabels[i11];
            if (i13 == 0) {
                return 0;
            }
            endCatch(top, i11, i12);
            top.handlerLabels[i11] = 0;
            return i13;
        }

        public void setHandlers(int[] iArr, int i11) {
            getTop();
            for (int i12 = 0; i12 < iArr.length; i12++) {
                int i13 = iArr[i12];
                if (i13 != 0) {
                    addHandler(i12, i13, i11);
                }
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class FinallyReturnPoint {
        public List<Integer> jsrPoints = new ArrayList();
        public int tableLabel = 0;
    }

    private void addDoubleWrap() {
        addOptRuntimeInvoke("wrapDouble", "(D)Ljava/lang/Double;");
    }

    private void addGoto(Node node, int i11) {
        this.cfw.s(i11, getTargetLabel(node));
    }

    private void addGotoWithReturn(Node node) {
        FinallyReturnPoint finallyReturnPoint = this.finallys.get(node);
        this.cfw.R(finallyReturnPoint.jsrPoints.size());
        addGoto(node, 167);
        int q11 = this.cfw.q();
        this.cfw.z0(q11);
        finallyReturnPoint.jsrPoints.add(Integer.valueOf(q11));
    }

    private void addInstructionCount() {
        addInstructionCount(Math.max(this.cfw.s0() - this.savedCodeOffset, 1));
    }

    private void addJumpedBooleanWrap(int i11, int i12) {
        this.cfw.z0(i12);
        int q11 = this.cfw.q();
        this.cfw.v(178, "java/lang/Boolean", "FALSE", "Ljava/lang/Boolean;");
        this.cfw.s(167, q11);
        this.cfw.z0(i11);
        this.cfw.v(178, "java/lang/Boolean", "TRUE", "Ljava/lang/Boolean;");
        this.cfw.z0(q11);
        this.cfw.g0(-1);
    }

    private void addNewObjectArray(int i11) {
        if (i11 != 0) {
            this.cfw.W(i11);
            this.cfw.u(189, "java/lang/Object");
            return;
        }
        short s11 = this.itsZeroArgArray;
        if (s11 >= 0) {
            this.cfw.w(s11);
        } else {
            this.cfw.v(178, "org/mozilla/javascript/ScriptRuntime", "emptyArgs", "[Ljava/lang/Object;");
        }
    }

    private void addObjectToDouble() {
        addScriptRuntimeInvoke("toNumber", "(Ljava/lang/Object;)D");
    }

    private void addOptRuntimeInvoke(String str, String str2) {
        this.cfw.K(184, "org/mozilla/javascript/optimizer/OptRuntime", str, str2);
    }

    private void addScriptRuntimeInvoke(String str, String str2) {
        this.cfw.K(184, "org.mozilla.javascript.ScriptRuntime", str, str2);
    }

    private void dcpLoadAsNumber(int i11) {
        this.cfw.w(i11);
        this.cfw.v(178, "java/lang/Void", "TYPE", "Ljava/lang/Class;");
        int q11 = this.cfw.q();
        this.cfw.s(165, q11);
        short v02 = this.cfw.v0();
        this.cfw.w(i11);
        addObjectToDouble();
        int q12 = this.cfw.q();
        this.cfw.s(167, q12);
        this.cfw.A0(q11, v02);
        this.cfw.y(i11 + 1);
        this.cfw.z0(q12);
    }

    private void dcpLoadAsObject(int i11) {
        this.cfw.w(i11);
        this.cfw.v(178, "java/lang/Void", "TYPE", "Ljava/lang/Class;");
        int q11 = this.cfw.q();
        this.cfw.s(165, q11);
        short v02 = this.cfw.v0();
        this.cfw.w(i11);
        int q12 = this.cfw.q();
        this.cfw.s(167, q12);
        this.cfw.A0(q11, v02);
        this.cfw.y(i11 + 1);
        addDoubleWrap();
        this.cfw.z0(q12);
    }

    private void decReferenceWordLocal(short s11) {
        this.locals[s11] = r0[s11] - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String exceptionTypeToName(int i11) {
        if (i11 == 0) {
            return "org/mozilla/javascript/JavaScriptException";
        }
        if (i11 == 1) {
            return "org/mozilla/javascript/EvaluatorException";
        }
        if (i11 == 2) {
            return "org/mozilla/javascript/EcmaError";
        }
        if (i11 == 3) {
            return "java/lang/Throwable";
        }
        if (i11 == 4) {
            return null;
        }
        throw Kit.codeBug();
    }

    private void genSimpleCompare(int i11, int i12, int i13) {
        if (i12 == -1) {
            throw Codegen.badTree();
        }
        switch (i11) {
            case 14:
                this.cfw.r(152);
                this.cfw.s(155, i12);
                break;
            case 15:
                this.cfw.r(152);
                this.cfw.s(158, i12);
                break;
            case 16:
                this.cfw.r(151);
                this.cfw.s(157, i12);
                break;
            case 17:
                this.cfw.r(151);
                this.cfw.s(156, i12);
                break;
            default:
                throw Codegen.badTree();
        }
        if (i13 != -1) {
            this.cfw.s(167, i13);
        }
    }

    private void generateActivationExit() {
        if (this.fnCurrent == null || this.hasVarsInRegs) {
            throw Kit.codeBug();
        }
        this.cfw.w(this.contextLocal);
        addScriptRuntimeInvoke("exitActivationFunction", "(Lorg/mozilla/javascript/Context;)V");
    }

    private void generateArrayLiteralFactory(Node node, int i11) {
        String str = this.codegen.getBodyMethodName(this.scriptOrFn) + "_literal" + i11;
        initBodyGeneration();
        short s11 = this.firstFreeLocal;
        short s12 = (short) (s11 + 1);
        this.firstFreeLocal = s12;
        this.argsLocal = s11;
        this.localsMax = s12;
        this.cfw.O0(str, "(Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/Scriptable;[Ljava/lang/Object;)Lorg/mozilla/javascript/Scriptable;", (short) 2);
        visitArrayLiteral(node, node.getFirstChild(), true);
        this.cfw.r(176);
        this.cfw.P0((short) (this.localsMax + 1));
    }

    private void generateCallArgArray(Node node, Node node2, boolean z11) {
        short s11;
        int i11 = 0;
        for (Node node3 = node2; node3 != null; node3 = node3.getNext()) {
            i11++;
        }
        if (i11 != 1 || (s11 = this.itsOneArgArray) < 0) {
            addNewObjectArray(i11);
        } else {
            this.cfw.w(s11);
        }
        for (int i12 = 0; i12 != i11; i12++) {
            if (!this.isGenerator) {
                this.cfw.r(89);
                this.cfw.W(i12);
            }
            if (z11) {
                int nodeIsDirectCallParameter = nodeIsDirectCallParameter(node2);
                if (nodeIsDirectCallParameter >= 0) {
                    dcpLoadAsObject(nodeIsDirectCallParameter);
                } else {
                    generateExpression(node2, node);
                    if (node2.getIntProp(8, -1) == 0) {
                        addDoubleWrap();
                    }
                }
            } else {
                generateExpression(node2, node);
            }
            if (this.isGenerator) {
                short newWordLocal = getNewWordLocal();
                this.cfw.x(newWordLocal);
                this.cfw.u(192, "[Ljava/lang/Object;");
                this.cfw.r(89);
                this.cfw.W(i12);
                this.cfw.w(newWordLocal);
                releaseWordLocal(newWordLocal);
            }
            this.cfw.r(83);
            node2 = node2.getNext();
        }
    }

    private void generateCatchBlock(int i11, short s11, int i12, int i13, int i14) {
        if (i14 == 0) {
            i14 = this.cfw.q();
        }
        this.cfw.y0(i14);
        this.cfw.x(i13);
        this.cfw.w(s11);
        this.cfw.x(this.variableObjectLocal);
        exceptionTypeToName(i11);
        this.cfw.s(167, i12);
    }

    private void generateCheckForThrowOrClose(int i11, boolean z11, int i12) {
        int q11 = this.cfw.q();
        int q12 = this.cfw.q();
        this.cfw.z0(q11);
        this.cfw.w(this.argsLocal);
        generateThrowJavaScriptException();
        this.cfw.z0(q12);
        this.cfw.w(this.argsLocal);
        this.cfw.u(192, "java/lang/Throwable");
        this.cfw.r(191);
        if (i11 != -1) {
            this.cfw.z0(i11);
        }
        if (!z11) {
            this.cfw.B0(this.generatorSwitch, i12);
        }
        this.cfw.H(this.operationLocal);
        this.cfw.R(2);
        this.cfw.s(159, q12);
        this.cfw.H(this.operationLocal);
        this.cfw.R(1);
        this.cfw.s(159, q11);
    }

    private void generateEpilogue() {
        if (this.compilerEnv.isGenerateObserverCount()) {
            addInstructionCount();
        }
        if (this.isGenerator) {
            Map<Node, int[]> liveLocals = ((FunctionNode) this.scriptOrFn).getLiveLocals();
            if (liveLocals != null) {
                List<Node> resumptionPoints = ((FunctionNode) this.scriptOrFn).getResumptionPoints();
                for (int i11 = 0; i11 < resumptionPoints.size(); i11++) {
                    Node node = resumptionPoints.get(i11);
                    int[] iArr = liveLocals.get(node);
                    if (iArr != null) {
                        this.cfw.B0(this.generatorSwitch, getNextGeneratorState(node));
                        generateGetGeneratorLocalsState();
                        for (int i12 = 0; i12 < iArr.length; i12++) {
                            this.cfw.r(89);
                            this.cfw.R(i12);
                            this.cfw.r(50);
                            this.cfw.x(iArr[i12]);
                        }
                        this.cfw.r(87);
                        this.cfw.s(167, getTargetLabel(node));
                    }
                }
            }
            Map<Node, FinallyReturnPoint> map = this.finallys;
            if (map != null) {
                for (Node node2 : map.keySet()) {
                    if (node2.getType() == 125) {
                        FinallyReturnPoint finallyReturnPoint = this.finallys.get(node2);
                        this.cfw.A0(finallyReturnPoint.tableLabel, (short) 1);
                        int c02 = this.cfw.c0(0, finallyReturnPoint.jsrPoints.size() - 1);
                        this.cfw.D0(c02);
                        int i13 = 0;
                        for (int i14 = 0; i14 < finallyReturnPoint.jsrPoints.size(); i14++) {
                            this.cfw.B0(c02, i13);
                            this.cfw.s(167, finallyReturnPoint.jsrPoints.get(i14).intValue());
                            i13++;
                        }
                    }
                }
            }
        }
        int i15 = this.epilogueLabel;
        if (i15 != -1) {
            this.cfw.z0(i15);
        }
        if (this.hasVarsInRegs) {
            this.cfw.r(176);
            return;
        }
        if (this.isGenerator) {
            if (((FunctionNode) this.scriptOrFn).getResumptionPoints() != null) {
                this.cfw.D0(this.generatorSwitch);
            }
            generateSetGeneratorResumptionPoint(-1);
            this.cfw.w(this.variableObjectLocal);
            addOptRuntimeInvoke("throwStopIteration", "(Ljava/lang/Object;)V");
            Codegen.pushUndefined(this.cfw);
            this.cfw.r(176);
            return;
        }
        if (this.fnCurrent == null) {
            this.cfw.w(this.popvLocal);
            this.cfw.r(176);
            return;
        }
        generateActivationExit();
        this.cfw.r(176);
        int q11 = this.cfw.q();
        this.cfw.y0(q11);
        short newWordLocal = getNewWordLocal();
        this.cfw.x(newWordLocal);
        generateActivationExit();
        this.cfw.w(newWordLocal);
        releaseWordLocal(newWordLocal);
        this.cfw.r(191);
        this.cfw.A(this.enterAreaStartLabel, this.epilogueLabel, q11, null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:126:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0421  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void generateExpression(org.mozilla.javascript.Node r18, org.mozilla.javascript.Node r19) {
        /*
            Method dump skipped, instructions count: 1558
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.optimizer.BodyCodegen.generateExpression(org.mozilla.javascript.Node, org.mozilla.javascript.Node):void");
    }

    private void generateFunctionAndThisObj(Node node, Node node2) {
        int type = node.getType();
        int type2 = node.getType();
        if (type2 != 33) {
            if (type2 == 34) {
                throw Kit.codeBug();
            }
            if (type2 != 36) {
                if (type2 != 39) {
                    generateExpression(node, node2);
                    this.cfw.w(this.contextLocal);
                    addScriptRuntimeInvoke("getValueFunctionAndThis", "(Ljava/lang/Object;Lorg/mozilla/javascript/Context;)Lorg/mozilla/javascript/Callable;");
                } else {
                    this.cfw.Y(node.getString());
                    this.cfw.w(this.contextLocal);
                    this.cfw.w(this.variableObjectLocal);
                    addScriptRuntimeInvoke("getNameFunctionAndThis", "(Ljava/lang/String;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;)Lorg/mozilla/javascript/Callable;");
                }
                this.cfw.w(this.contextLocal);
                addScriptRuntimeInvoke("lastStoredScriptable", "(Lorg/mozilla/javascript/Context;)Lorg/mozilla/javascript/Scriptable;");
            }
        }
        Node firstChild = node.getFirstChild();
        generateExpression(firstChild, node);
        Node next = firstChild.getNext();
        if (type == 33) {
            this.cfw.Y(next.getString());
            this.cfw.w(this.contextLocal);
            this.cfw.w(this.variableObjectLocal);
            addScriptRuntimeInvoke("getPropFunctionAndThis", "(Ljava/lang/Object;Ljava/lang/String;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;)Lorg/mozilla/javascript/Callable;");
        } else {
            if (node.getIntProp(8, -1) != -1) {
                throw Codegen.badTree();
            }
            generateExpression(next, node);
            this.cfw.w(this.contextLocal);
            addScriptRuntimeInvoke("getElemFunctionAndThis", "(Ljava/lang/Object;Ljava/lang/Object;Lorg/mozilla/javascript/Context;)Lorg/mozilla/javascript/Callable;");
        }
        this.cfw.w(this.contextLocal);
        addScriptRuntimeInvoke("lastStoredScriptable", "(Lorg/mozilla/javascript/Context;)Lorg/mozilla/javascript/Scriptable;");
    }

    private void generateGenerator() {
        this.cfw.O0(this.codegen.getBodyMethodName(this.scriptOrFn), this.codegen.getBodyMethodSignature(this.scriptOrFn), (short) 10);
        initBodyGeneration();
        short s11 = this.firstFreeLocal;
        short s12 = (short) (s11 + 1);
        this.firstFreeLocal = s12;
        this.argsLocal = s11;
        this.localsMax = s12;
        if (this.fnCurrent != null) {
            this.cfw.w(this.funObjLocal);
            this.cfw.K(185, "org/mozilla/javascript/Scriptable", "getParentScope", "()Lorg/mozilla/javascript/Scriptable;");
            this.cfw.x(this.variableObjectLocal);
        }
        this.cfw.w(this.funObjLocal);
        this.cfw.w(this.variableObjectLocal);
        this.cfw.w(this.argsLocal);
        addScriptRuntimeInvoke("createFunctionActivation", "(Lorg/mozilla/javascript/NativeFunction;Lorg/mozilla/javascript/Scriptable;[Ljava/lang/Object;)Lorg/mozilla/javascript/Scriptable;");
        this.cfw.x(this.variableObjectLocal);
        this.cfw.u(187, this.codegen.mainClassName);
        this.cfw.r(89);
        this.cfw.w(this.variableObjectLocal);
        this.cfw.w(this.contextLocal);
        this.cfw.W(this.scriptOrFnIndex);
        this.cfw.K(183, this.codegen.mainClassName, "<init>", "(Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/Context;I)V");
        generateNestedFunctionInits();
        this.cfw.w(this.variableObjectLocal);
        this.cfw.w(this.thisObjLocal);
        this.cfw.R(this.maxLocals);
        this.cfw.R(this.maxStack);
        addOptRuntimeInvoke("createNativeGenerator", "(Lorg/mozilla/javascript/NativeFunction;Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/Scriptable;II)Lorg/mozilla/javascript/Scriptable;");
        this.cfw.r(176);
        this.cfw.P0((short) (this.localsMax + 1));
    }

    private void generateGetGeneratorLocalsState() {
        this.cfw.w(this.generatorStateLocal);
        addOptRuntimeInvoke("getGeneratorLocalsState", "(Ljava/lang/Object;)[Ljava/lang/Object;");
    }

    private void generateGetGeneratorResumptionPoint() {
        this.cfw.w(this.generatorStateLocal);
        this.cfw.v(180, "org/mozilla/javascript/optimizer/OptRuntime$GeneratorState", "resumptionPoint", "I");
    }

    private void generateGetGeneratorStackState() {
        this.cfw.w(this.generatorStateLocal);
        addOptRuntimeInvoke("getGeneratorStackState", "(Ljava/lang/Object;)[Ljava/lang/Object;");
    }

    private void generateIfJump(Node node, Node node2, int i11, int i12) {
        int type = node.getType();
        Node firstChild = node.getFirstChild();
        if (type == 26) {
            generateIfJump(firstChild, node, i12, i11);
            return;
        }
        if (type != 46 && type != 47) {
            if (type != 52 && type != 53) {
                if (type == 104 || type == 105) {
                    int q11 = this.cfw.q();
                    if (type == 105) {
                        generateIfJump(firstChild, node, q11, i12);
                    } else {
                        generateIfJump(firstChild, node, i11, q11);
                    }
                    this.cfw.z0(q11);
                    generateIfJump(firstChild.getNext(), node, i11, i12);
                    return;
                }
                switch (type) {
                    case 12:
                    case 13:
                        break;
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                        break;
                    default:
                        generateExpression(node, node2);
                        addScriptRuntimeInvoke("toBoolean", "(Ljava/lang/Object;)Z");
                        this.cfw.s(154, i11);
                        this.cfw.s(167, i12);
                        break;
                }
                return;
            }
            visitIfJumpRelOp(node, firstChild, i11, i12);
            return;
        }
        visitIfJumpEqOp(node, firstChild, i11, i12);
    }

    private void generateIntegerUnwrap() {
        this.cfw.K(182, "java/lang/Integer", "intValue", "()I");
    }

    private void generateIntegerWrap() {
        this.cfw.K(184, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;");
    }

    private void generateNestedFunctionInits() {
        int functionCount = this.scriptOrFn.getFunctionCount();
        for (int i11 = 0; i11 != functionCount; i11++) {
            OptFunctionNode optFunctionNode = OptFunctionNode.get(this.scriptOrFn, i11);
            if (optFunctionNode.fnode.getFunctionType() == 1) {
                visitFunction(optFunctionNode, 1);
            }
        }
    }

    private void generateObjectLiteralFactory(Node node, int i11) {
        String str = this.codegen.getBodyMethodName(this.scriptOrFn) + "_literal" + i11;
        initBodyGeneration();
        short s11 = this.firstFreeLocal;
        short s12 = (short) (s11 + 1);
        this.firstFreeLocal = s12;
        this.argsLocal = s11;
        this.localsMax = s12;
        this.cfw.O0(str, "(Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/Scriptable;[Ljava/lang/Object;)Lorg/mozilla/javascript/Scriptable;", (short) 2);
        visitObjectLiteral(node, node.getFirstChild(), true);
        this.cfw.r(176);
        this.cfw.P0((short) (this.localsMax + 1));
    }

    private void generatePrologue() {
        String str;
        short newWordLocal;
        if (this.inDirectCallFunction) {
            int paramCount = this.scriptOrFn.getParamCount();
            if (this.firstFreeLocal != 4) {
                Kit.codeBug();
            }
            for (int i11 = 0; i11 != paramCount; i11++) {
                short[] sArr = this.varRegisters;
                short s11 = this.firstFreeLocal;
                sArr[i11] = s11;
                this.firstFreeLocal = (short) (s11 + 3);
            }
            if (!this.fnCurrent.getParameterNumberContext()) {
                this.itsForcedObjectParameters = true;
                for (int i12 = 0; i12 != paramCount; i12++) {
                    short s12 = this.varRegisters[i12];
                    this.cfw.w(s12);
                    this.cfw.v(178, "java/lang/Void", "TYPE", "Ljava/lang/Class;");
                    int q11 = this.cfw.q();
                    this.cfw.s(166, q11);
                    this.cfw.y(s12 + 1);
                    addDoubleWrap();
                    this.cfw.x(s12);
                    this.cfw.z0(q11);
                }
            }
        }
        if (this.fnCurrent != null) {
            this.cfw.w(this.funObjLocal);
            this.cfw.K(185, "org/mozilla/javascript/Scriptable", "getParentScope", "()Lorg/mozilla/javascript/Scriptable;");
            this.cfw.x(this.variableObjectLocal);
        }
        short s13 = this.firstFreeLocal;
        short s14 = (short) (s13 + 1);
        this.firstFreeLocal = s14;
        this.argsLocal = s13;
        this.localsMax = s14;
        if (this.isGenerator) {
            short s15 = (short) (s14 + 1);
            this.firstFreeLocal = s15;
            this.operationLocal = s14;
            this.localsMax = s15;
            this.cfw.w(this.thisObjLocal);
            short s16 = this.firstFreeLocal;
            short s17 = (short) (s16 + 1);
            this.firstFreeLocal = s17;
            this.generatorStateLocal = s16;
            this.localsMax = s17;
            this.cfw.u(192, "org/mozilla/javascript/optimizer/OptRuntime$GeneratorState");
            this.cfw.r(89);
            this.cfw.x(this.generatorStateLocal);
            this.cfw.v(180, "org/mozilla/javascript/optimizer/OptRuntime$GeneratorState", "thisObj", "Lorg/mozilla/javascript/Scriptable;");
            this.cfw.x(this.thisObjLocal);
            if (this.epilogueLabel == -1) {
                this.epilogueLabel = this.cfw.q();
            }
            List<Node> resumptionPoints = ((FunctionNode) this.scriptOrFn).getResumptionPoints();
            if (resumptionPoints != null) {
                generateGetGeneratorResumptionPoint();
                this.generatorSwitch = this.cfw.c0(0, resumptionPoints.size());
                generateCheckForThrowOrClose(-1, false, 0);
            }
        }
        if (this.fnCurrent == null && this.scriptOrFn.getRegexpCount() != 0) {
            this.cfw.w(this.contextLocal);
            this.cfw.K(184, this.codegen.mainClassName, "_reInit", "(Lorg/mozilla/javascript/Context;)V");
        }
        if (this.compilerEnv.isGenerateObserverCount()) {
            saveCurrentCodeOffset();
        }
        if (!this.hasVarsInRegs) {
            if (this.isGenerator) {
                return;
            }
            if (this.fnCurrent != null) {
                this.cfw.w(this.funObjLocal);
                this.cfw.w(this.variableObjectLocal);
                this.cfw.w(this.argsLocal);
                addScriptRuntimeInvoke("createFunctionActivation", "(Lorg/mozilla/javascript/NativeFunction;Lorg/mozilla/javascript/Scriptable;[Ljava/lang/Object;)Lorg/mozilla/javascript/Scriptable;");
                this.cfw.x(this.variableObjectLocal);
                this.cfw.w(this.contextLocal);
                this.cfw.w(this.variableObjectLocal);
                addScriptRuntimeInvoke("enterActivationFunction", "(Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;)V");
                str = "activation";
            } else {
                this.cfw.w(this.funObjLocal);
                this.cfw.w(this.thisObjLocal);
                this.cfw.w(this.contextLocal);
                this.cfw.w(this.variableObjectLocal);
                this.cfw.W(0);
                addScriptRuntimeInvoke("initScript", "(Lorg/mozilla/javascript/NativeFunction;Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;Z)V");
                str = "global";
            }
            this.enterAreaStartLabel = this.cfw.q();
            this.epilogueLabel = this.cfw.q();
            this.cfw.z0(this.enterAreaStartLabel);
            generateNestedFunctionInits();
            if (this.compilerEnv.isGenerateDebugInfo()) {
                ClassFileWriter classFileWriter = this.cfw;
                classFileWriter.f0(str, "Lorg/mozilla/javascript/Scriptable;", classFileWriter.s0(), this.variableObjectLocal);
            }
            OptFunctionNode optFunctionNode = this.fnCurrent;
            if (optFunctionNode == null) {
                this.popvLocal = getNewWordLocal();
                Codegen.pushUndefined(this.cfw);
                this.cfw.x(this.popvLocal);
                int endLineno = this.scriptOrFn.getEndLineno();
                if (endLineno != -1) {
                    this.cfw.O((short) endLineno);
                    return;
                }
                return;
            }
            if (optFunctionNode.itsContainsCalls0) {
                this.itsZeroArgArray = getNewWordLocal();
                this.cfw.v(178, "org/mozilla/javascript/ScriptRuntime", "emptyArgs", "[Ljava/lang/Object;");
                this.cfw.x(this.itsZeroArgArray);
            }
            if (this.fnCurrent.itsContainsCalls1) {
                this.itsOneArgArray = getNewWordLocal();
                this.cfw.W(1);
                this.cfw.u(189, "java/lang/Object");
                this.cfw.x(this.itsOneArgArray);
                return;
            }
            return;
        }
        int paramCount2 = this.scriptOrFn.getParamCount();
        if (paramCount2 > 0 && !this.inDirectCallFunction) {
            this.cfw.w(this.argsLocal);
            this.cfw.r(190);
            this.cfw.W(paramCount2);
            int q12 = this.cfw.q();
            this.cfw.s(162, q12);
            this.cfw.w(this.argsLocal);
            this.cfw.W(paramCount2);
            addScriptRuntimeInvoke("padArguments", "([Ljava/lang/Object;I)[Ljava/lang/Object;");
            this.cfw.x(this.argsLocal);
            this.cfw.z0(q12);
        }
        int paramCount3 = this.fnCurrent.fnode.getParamCount();
        int paramAndVarCount = this.fnCurrent.fnode.getParamAndVarCount();
        boolean[] paramAndVarConst = this.fnCurrent.fnode.getParamAndVarConst();
        short s18 = -1;
        for (int i13 = 0; i13 != paramAndVarCount; i13++) {
            if (i13 < paramCount3) {
                if (this.inDirectCallFunction) {
                    newWordLocal = -1;
                } else {
                    newWordLocal = getNewWordLocal();
                    this.cfw.w(this.argsLocal);
                    this.cfw.W(i13);
                    this.cfw.r(50);
                    this.cfw.x(newWordLocal);
                }
            } else if (this.fnCurrent.isNumberVar(i13)) {
                newWordLocal = getNewWordPairLocal(paramAndVarConst[i13]);
                this.cfw.V(0.0d);
                this.cfw.z(newWordLocal);
            } else {
                newWordLocal = getNewWordLocal(paramAndVarConst[i13]);
                if (s18 == -1) {
                    Codegen.pushUndefined(this.cfw);
                    s18 = newWordLocal;
                } else {
                    this.cfw.w(s18);
                }
                this.cfw.x(newWordLocal);
            }
            if (newWordLocal >= 0) {
                if (paramAndVarConst[i13]) {
                    this.cfw.W(0);
                    this.cfw.I((this.fnCurrent.isNumberVar(i13) ? (short) 2 : (short) 1) + newWordLocal);
                }
                this.varRegisters[i13] = newWordLocal;
            }
            if (this.compilerEnv.isGenerateDebugInfo()) {
                String paramOrVarName = this.fnCurrent.fnode.getParamOrVarName(i13);
                String str2 = this.fnCurrent.isNumberVar(i13) ? "D" : "Ljava/lang/Object;";
                int s02 = this.cfw.s0();
                if (newWordLocal < 0) {
                    newWordLocal = this.varRegisters[i13];
                }
                this.cfw.f0(paramOrVarName, str2, s02, newWordLocal);
            }
        }
    }

    private boolean generateSaveLocals(Node node) {
        int i11 = 0;
        for (int i12 = 0; i12 < this.firstFreeLocal; i12++) {
            if (this.locals[i12] != 0) {
                i11++;
            }
        }
        if (i11 == 0) {
            ((FunctionNode) this.scriptOrFn).addLiveLocals(node, null);
            return false;
        }
        int i13 = this.maxLocals;
        if (i13 <= i11) {
            i13 = i11;
        }
        this.maxLocals = i13;
        int[] iArr = new int[i11];
        int i14 = 0;
        for (int i15 = 0; i15 < this.firstFreeLocal; i15++) {
            if (this.locals[i15] != 0) {
                iArr[i14] = i15;
                i14++;
            }
        }
        ((FunctionNode) this.scriptOrFn).addLiveLocals(node, iArr);
        generateGetGeneratorLocalsState();
        for (int i16 = 0; i16 < i11; i16++) {
            this.cfw.r(89);
            this.cfw.R(i16);
            this.cfw.w(iArr[i16]);
            this.cfw.r(83);
        }
        this.cfw.r(87);
        return true;
    }

    private void generateSetGeneratorResumptionPoint(int i11) {
        this.cfw.w(this.generatorStateLocal);
        this.cfw.R(i11);
        this.cfw.v(181, "org/mozilla/javascript/optimizer/OptRuntime$GeneratorState", "resumptionPoint", "I");
    }

    private void generateStatement(Node node) {
        updateLineNumber(node);
        int type = node.getType();
        Node firstChild = node.getFirstChild();
        if (type == 50) {
            generateExpression(firstChild, node);
            if (this.compilerEnv.isGenerateObserverCount()) {
                addInstructionCount();
            }
            generateThrowJavaScriptException();
            return;
        }
        if (type == 51) {
            if (this.compilerEnv.isGenerateObserverCount()) {
                addInstructionCount();
            }
            this.cfw.w(getLocalBlockRegister(node));
            this.cfw.r(191);
            return;
        }
        if (type != 64) {
            if (type == 81) {
                visitTryCatchFinally((Jump) node, firstChild);
                return;
            }
            int i11 = 1;
            if (type == 109) {
                OptFunctionNode optFunctionNode = OptFunctionNode.get(this.scriptOrFn, node.getExistingIntProp(1));
                int functionType = optFunctionNode.fnode.getFunctionType();
                if (functionType == 3) {
                    visitFunction(optFunctionNode, functionType);
                    return;
                } else {
                    if (functionType != 1) {
                        throw Codegen.badTree();
                    }
                    return;
                }
            }
            if (type == 114) {
                if (this.compilerEnv.isGenerateObserverCount()) {
                    addInstructionCount();
                }
                visitSwitch((Jump) node, firstChild);
                return;
            }
            if (type != 123) {
                if (type == 125) {
                    if (this.isGenerator) {
                        if (this.compilerEnv.isGenerateObserverCount()) {
                            saveCurrentCodeOffset();
                        }
                        this.cfw.K0((short) 1);
                        short newWordLocal = getNewWordLocal();
                        int q11 = this.cfw.q();
                        int q12 = this.cfw.q();
                        this.cfw.z0(q11);
                        generateIntegerWrap();
                        this.cfw.x(newWordLocal);
                        while (firstChild != null) {
                            generateStatement(firstChild);
                            firstChild = firstChild.getNext();
                        }
                        this.cfw.w(newWordLocal);
                        this.cfw.u(192, "java/lang/Integer");
                        generateIntegerUnwrap();
                        FinallyReturnPoint finallyReturnPoint = this.finallys.get(node);
                        int q13 = this.cfw.q();
                        finallyReturnPoint.tableLabel = q13;
                        this.cfw.s(167, q13);
                        releaseWordLocal(newWordLocal);
                        this.cfw.z0(q12);
                        return;
                    }
                    return;
                }
                if (type == 141) {
                    boolean z11 = this.inLocalBlock;
                    this.inLocalBlock = true;
                    short newWordLocal2 = getNewWordLocal();
                    if (this.isGenerator) {
                        this.cfw.r(1);
                        this.cfw.x(newWordLocal2);
                    }
                    node.putIntProp(2, newWordLocal2);
                    while (firstChild != null) {
                        generateStatement(firstChild);
                        firstChild = firstChild.getNext();
                    }
                    releaseWordLocal(newWordLocal2);
                    node.removeProp(2);
                    this.inLocalBlock = z11;
                    return;
                }
                if (type != 160) {
                    switch (type) {
                        case 2:
                            generateExpression(firstChild, node);
                            this.cfw.w(this.contextLocal);
                            this.cfw.w(this.variableObjectLocal);
                            addScriptRuntimeInvoke("enterWith", "(Ljava/lang/Object;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;)Lorg/mozilla/javascript/Scriptable;");
                            this.cfw.x(this.variableObjectLocal);
                            incReferenceWordLocal(this.variableObjectLocal);
                            return;
                        case 3:
                            this.cfw.w(this.variableObjectLocal);
                            addScriptRuntimeInvoke("leaveWith", "(Lorg/mozilla/javascript/Scriptable;)Lorg/mozilla/javascript/Scriptable;");
                            this.cfw.x(this.variableObjectLocal);
                            decReferenceWordLocal(this.variableObjectLocal);
                            return;
                        case 4:
                            break;
                        default:
                            switch (type) {
                                case 57:
                                    this.cfw.K0((short) 0);
                                    int localBlockRegister = getLocalBlockRegister(node);
                                    int existingIntProp = node.getExistingIntProp(14);
                                    String string = firstChild.getString();
                                    generateExpression(firstChild.getNext(), node);
                                    if (existingIntProp == 0) {
                                        this.cfw.r(1);
                                    } else {
                                        this.cfw.w(localBlockRegister);
                                    }
                                    this.cfw.Y(string);
                                    this.cfw.w(this.contextLocal);
                                    this.cfw.w(this.variableObjectLocal);
                                    addScriptRuntimeInvoke("newCatchScope", "(Ljava/lang/Throwable;Lorg/mozilla/javascript/Scriptable;Ljava/lang/String;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;)Lorg/mozilla/javascript/Scriptable;");
                                    this.cfw.x(localBlockRegister);
                                    return;
                                case 58:
                                case 59:
                                case 60:
                                    generateExpression(firstChild, node);
                                    this.cfw.w(this.contextLocal);
                                    if (type == 58) {
                                        i11 = 0;
                                    } else if (type != 59) {
                                        i11 = 2;
                                    }
                                    this.cfw.W(i11);
                                    addScriptRuntimeInvoke("enumInit", "(Ljava/lang/Object;Lorg/mozilla/javascript/Context;I)Ljava/lang/Object;");
                                    this.cfw.x(getLocalBlockRegister(node));
                                    return;
                                default:
                                    switch (type) {
                                        case 128:
                                        case 129:
                                        case 130:
                                        case 132:
                                        case 136:
                                            break;
                                        case 131:
                                            if (this.compilerEnv.isGenerateObserverCount()) {
                                                addInstructionCount();
                                            }
                                            this.cfw.z0(getTargetLabel(node));
                                            if (this.compilerEnv.isGenerateObserverCount()) {
                                                saveCurrentCodeOffset();
                                                return;
                                            }
                                            return;
                                        case 133:
                                            if (firstChild.getType() == 56) {
                                                visitSetVar(firstChild, firstChild.getFirstChild(), false);
                                                return;
                                            }
                                            if (firstChild.getType() == 156) {
                                                visitSetConstVar(firstChild, firstChild.getFirstChild(), false);
                                                return;
                                            }
                                            if (firstChild.getType() == 72) {
                                                generateYieldPoint(firstChild, false);
                                                return;
                                            }
                                            generateExpression(firstChild, node);
                                            if (node.getIntProp(8, -1) != -1) {
                                                this.cfw.r(88);
                                                return;
                                            } else {
                                                this.cfw.r(87);
                                                return;
                                            }
                                        case 134:
                                            generateExpression(firstChild, node);
                                            if (this.popvLocal < 0) {
                                                this.popvLocal = getNewWordLocal();
                                            }
                                            this.cfw.x(this.popvLocal);
                                            return;
                                        case 135:
                                            break;
                                        default:
                                            throw Codegen.badTree();
                                    }
                            }
                        case 5:
                        case 6:
                        case 7:
                            if (this.compilerEnv.isGenerateObserverCount()) {
                                addInstructionCount();
                            }
                            visitGoto((Jump) node, type, firstChild);
                            return;
                    }
                } else {
                    return;
                }
            }
            if (this.compilerEnv.isGenerateObserverCount()) {
                addInstructionCount(1);
            }
            while (firstChild != null) {
                generateStatement(firstChild);
                firstChild = firstChild.getNext();
            }
            return;
        }
        if (!this.isGenerator) {
            if (firstChild != null) {
                generateExpression(firstChild, node);
            } else if (type == 4) {
                Codegen.pushUndefined(this.cfw);
            } else {
                short s11 = this.popvLocal;
                if (s11 < 0) {
                    throw Codegen.badTree();
                }
                this.cfw.w(s11);
            }
        }
        if (this.compilerEnv.isGenerateObserverCount()) {
            addInstructionCount();
        }
        if (this.epilogueLabel == -1) {
            if (!this.hasVarsInRegs) {
                throw Codegen.badTree();
            }
            this.epilogueLabel = this.cfw.q();
        }
        this.cfw.s(167, this.epilogueLabel);
    }

    private void generateThrowJavaScriptException() {
        this.cfw.u(187, "org/mozilla/javascript/JavaScriptException");
        this.cfw.r(90);
        this.cfw.r(95);
        this.cfw.Y(this.scriptOrFn.getSourceName());
        this.cfw.W(this.itsLineNumber);
        this.cfw.K(183, "org/mozilla/javascript/JavaScriptException", "<init>", "(Ljava/lang/Object;Ljava/lang/String;I)V");
        this.cfw.r(191);
    }

    private void generateYieldPoint(Node node, boolean z11) {
        short v02 = this.cfw.v0();
        int i11 = this.maxStack;
        if (i11 <= v02) {
            i11 = v02;
        }
        this.maxStack = i11;
        if (this.cfw.v0() != 0) {
            generateGetGeneratorStackState();
            for (int i12 = 0; i12 < v02; i12++) {
                this.cfw.r(90);
                this.cfw.r(95);
                this.cfw.R(i12);
                this.cfw.r(95);
                this.cfw.r(83);
            }
            this.cfw.r(87);
        }
        Node firstChild = node.getFirstChild();
        if (firstChild != null) {
            generateExpression(firstChild, node);
        } else {
            Codegen.pushUndefined(this.cfw);
        }
        int nextGeneratorState = getNextGeneratorState(node);
        generateSetGeneratorResumptionPoint(nextGeneratorState);
        boolean generateSaveLocals = generateSaveLocals(node);
        this.cfw.r(176);
        generateCheckForThrowOrClose(getTargetLabel(node), generateSaveLocals, nextGeneratorState);
        if (v02 != 0) {
            generateGetGeneratorStackState();
            for (int i13 = 0; i13 < v02; i13++) {
                this.cfw.r(89);
                this.cfw.R((v02 - i13) - 1);
                this.cfw.r(50);
                this.cfw.r(95);
            }
            this.cfw.r(87);
        }
        if (z11) {
            this.cfw.w(this.argsLocal);
        }
    }

    private short getConsecutiveSlots(int i11, boolean z11) {
        if (z11) {
            i11++;
        }
        short s11 = this.firstFreeLocal;
        while (s11 < 1023) {
            int i12 = 0;
            while (i12 < i11 && this.locals[s11 + i12] == 0) {
                i12++;
            }
            if (i12 >= i11) {
                break;
            }
            s11 = (short) (s11 + 1);
        }
        return s11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Node getFinallyAtTarget(Node node) {
        Node next;
        if (node == null) {
            return null;
        }
        if (node.getType() == 125) {
            return node;
        }
        if (node.getType() == 131 && (next = node.getNext()) != null && next.getType() == 125) {
            return next;
        }
        throw Kit.codeBug("bad finally target");
    }

    private int getLocalBlockRegister(Node node) {
        return ((Node) node.getProp(3)).getExistingIntProp(2);
    }

    private short getNewWordLocal(boolean z11) {
        short consecutiveSlots = getConsecutiveSlots(1, z11);
        if (consecutiveSlots < 1023) {
            int[] iArr = this.locals;
            iArr[consecutiveSlots] = 1;
            if (z11) {
                iArr[consecutiveSlots + 1] = 1;
            }
            short s11 = this.firstFreeLocal;
            if (consecutiveSlots == s11) {
                for (int i11 = s11 + 2; i11 < 1024; i11++) {
                    if (this.locals[i11] == 0) {
                        short s12 = (short) i11;
                        this.firstFreeLocal = s12;
                        if (this.localsMax < s12) {
                            this.localsMax = s12;
                            return consecutiveSlots;
                        }
                    }
                }
            }
            return consecutiveSlots;
        }
        throw Context.reportRuntimeError("Program too complex (out of locals)");
    }

    private short getNewWordPairLocal(boolean z11) {
        short consecutiveSlots = getConsecutiveSlots(2, z11);
        if (consecutiveSlots < 1023) {
            int[] iArr = this.locals;
            iArr[consecutiveSlots] = 1;
            iArr[consecutiveSlots + 1] = 1;
            if (z11) {
                iArr[consecutiveSlots + 2] = 1;
            }
            short s11 = this.firstFreeLocal;
            if (consecutiveSlots == s11) {
                for (int i11 = s11 + 2; i11 < 1024; i11++) {
                    if (this.locals[i11] == 0) {
                        short s12 = (short) i11;
                        this.firstFreeLocal = s12;
                        if (this.localsMax < s12) {
                            this.localsMax = s12;
                            return consecutiveSlots;
                        }
                    }
                }
            }
            return consecutiveSlots;
        }
        throw Context.reportRuntimeError("Program too complex (out of locals)");
    }

    private int getNextGeneratorState(Node node) {
        return ((FunctionNode) this.scriptOrFn).getResumptionPoints().indexOf(node) + 1;
    }

    private int getTargetLabel(Node node) {
        int labelId = node.labelId();
        if (labelId != -1) {
            return labelId;
        }
        int q11 = this.cfw.q();
        node.labelId(q11);
        return q11;
    }

    private void incReferenceWordLocal(short s11) {
        int[] iArr = this.locals;
        iArr[s11] = iArr[s11] + 1;
    }

    private void initBodyGeneration() {
        int paramAndVarCount;
        this.varRegisters = null;
        if (this.scriptOrFn.getType() == 109) {
            OptFunctionNode optFunctionNode = OptFunctionNode.get(this.scriptOrFn);
            this.fnCurrent = optFunctionNode;
            boolean requiresActivation = optFunctionNode.fnode.requiresActivation();
            this.hasVarsInRegs = !requiresActivation;
            if (!requiresActivation && (paramAndVarCount = this.fnCurrent.fnode.getParamAndVarCount()) != 0) {
                this.varRegisters = new short[paramAndVarCount];
            }
            boolean isTargetOfDirectCall = this.fnCurrent.isTargetOfDirectCall();
            this.inDirectCallFunction = isTargetOfDirectCall;
            if (isTargetOfDirectCall && !this.hasVarsInRegs) {
                Codegen.badTree();
            }
        } else {
            this.fnCurrent = null;
            this.hasVarsInRegs = false;
            this.inDirectCallFunction = false;
        }
        this.locals = new int[1024];
        this.funObjLocal = (short) 0;
        this.contextLocal = (short) 1;
        this.variableObjectLocal = (short) 2;
        this.thisObjLocal = (short) 3;
        this.localsMax = (short) 4;
        this.firstFreeLocal = (short) 4;
        this.popvLocal = (short) -1;
        this.argsLocal = (short) -1;
        this.itsZeroArgArray = (short) -1;
        this.itsOneArgArray = (short) -1;
        this.epilogueLabel = -1;
        this.enterAreaStartLabel = -1;
        this.generatorStateLocal = (short) -1;
    }

    private void inlineFinally(Node node, int i11, int i12) {
        Node finallyAtTarget = getFinallyAtTarget(node);
        finallyAtTarget.resetTargets();
        this.exceptionManager.markInlineFinallyStart(finallyAtTarget, i11);
        for (Node firstChild = finallyAtTarget.getFirstChild(); firstChild != null; firstChild = firstChild.getNext()) {
            generateStatement(firstChild);
        }
        this.exceptionManager.markInlineFinallyEnd(finallyAtTarget, i12);
    }

    private static boolean isArithmeticNode(Node node) {
        int type = node.getType();
        return type == 22 || type == 25 || type == 24 || type == 23;
    }

    private int nodeIsDirectCallParameter(Node node) {
        if (node.getType() != 55 || !this.inDirectCallFunction || this.itsForcedObjectParameters) {
            return -1;
        }
        int varIndex = this.fnCurrent.getVarIndex(node);
        if (this.fnCurrent.isParameter(varIndex)) {
            return this.varRegisters[varIndex];
        }
        return -1;
    }

    private void releaseWordLocal(short s11) {
        if (s11 < this.firstFreeLocal) {
            this.firstFreeLocal = s11;
        }
        this.locals[s11] = 0;
    }

    private void saveCurrentCodeOffset() {
        this.savedCodeOffset = this.cfw.s0();
    }

    private void updateLineNumber(Node node) {
        int lineno = node.getLineno();
        this.itsLineNumber = lineno;
        if (lineno == -1) {
            return;
        }
        this.cfw.O((short) lineno);
    }

    private boolean varIsDirectCallParameter(int i11) {
        return this.fnCurrent.isParameter(i11) && this.inDirectCallFunction && !this.itsForcedObjectParameters;
    }

    private void visitArithmetic(Node node, int i11, Node node2, Node node3) {
        if (node.getIntProp(8, -1) != -1) {
            generateExpression(node2, node);
            generateExpression(node2.getNext(), node);
            this.cfw.r(i11);
            return;
        }
        boolean isArithmeticNode = isArithmeticNode(node3);
        generateExpression(node2, node);
        if (!isArithmeticNode(node2)) {
            addObjectToDouble();
        }
        generateExpression(node2.getNext(), node);
        if (!isArithmeticNode(node2.getNext())) {
            addObjectToDouble();
        }
        this.cfw.r(i11);
        if (isArithmeticNode) {
            return;
        }
        addDoubleWrap();
    }

    private void visitArrayLiteral(Node node, Node node2, boolean z11) {
        int i11 = 0;
        for (Node node3 = node2; node3 != null; node3 = node3.getNext()) {
            i11++;
        }
        if (!z11 && ((i11 > 10 || this.cfw.s0() > 30000) && !this.hasVarsInRegs && !this.isGenerator && !this.inLocalBlock)) {
            if (this.literals == null) {
                this.literals = new LinkedList();
            }
            this.literals.add(node);
            String str = this.codegen.getBodyMethodName(this.scriptOrFn) + "_literal" + this.literals.size();
            this.cfw.w(this.funObjLocal);
            this.cfw.w(this.contextLocal);
            this.cfw.w(this.variableObjectLocal);
            this.cfw.w(this.thisObjLocal);
            this.cfw.w(this.argsLocal);
            this.cfw.K(182, this.codegen.mainClassName, str, "(Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/Scriptable;[Ljava/lang/Object;)Lorg/mozilla/javascript/Scriptable;");
            return;
        }
        addNewObjectArray(i11);
        for (int i12 = 0; i12 != i11; i12++) {
            this.cfw.r(89);
            this.cfw.W(i12);
            generateExpression(node2, node);
            this.cfw.r(83);
            node2 = node2.getNext();
        }
        int[] iArr = (int[]) node.getProp(11);
        if (iArr == null) {
            this.cfw.r(1);
            this.cfw.r(3);
        } else {
            this.cfw.Y(OptRuntime.encodeIntArray(iArr));
            this.cfw.W(iArr.length);
        }
        this.cfw.w(this.contextLocal);
        this.cfw.w(this.variableObjectLocal);
        addOptRuntimeInvoke("newArrayLiteral", "([Ljava/lang/Object;Ljava/lang/String;ILorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;)Lorg/mozilla/javascript/Scriptable;");
    }

    private void visitBitOp(Node node, int i11, Node node2) {
        int intProp = node.getIntProp(8, -1);
        generateExpression(node2, node);
        if (i11 == 20) {
            addScriptRuntimeInvoke("toUint32", "(Ljava/lang/Object;)J");
            generateExpression(node2.getNext(), node);
            addScriptRuntimeInvoke("toInt32", "(Ljava/lang/Object;)I");
            this.cfw.W(31);
            this.cfw.r(126);
            this.cfw.r(125);
            this.cfw.r(138);
            addDoubleWrap();
            return;
        }
        if (intProp == -1) {
            addScriptRuntimeInvoke("toInt32", "(Ljava/lang/Object;)I");
            generateExpression(node2.getNext(), node);
            addScriptRuntimeInvoke("toInt32", "(Ljava/lang/Object;)I");
        } else {
            addScriptRuntimeInvoke("toInt32", "(D)I");
            generateExpression(node2.getNext(), node);
            addScriptRuntimeInvoke("toInt32", "(D)I");
        }
        if (i11 == 18) {
            this.cfw.r(120);
        } else if (i11 != 19) {
            switch (i11) {
                case 9:
                    this.cfw.r(128);
                    break;
                case 10:
                    this.cfw.r(130);
                    break;
                case 11:
                    this.cfw.r(126);
                    break;
                default:
                    throw Codegen.badTree();
            }
        } else {
            this.cfw.r(122);
        }
        this.cfw.r(135);
        if (intProp == -1) {
            addDoubleWrap();
        }
    }

    private void visitDotQuery(Node node, Node node2) {
        updateLineNumber(node);
        generateExpression(node2, node);
        this.cfw.w(this.variableObjectLocal);
        addScriptRuntimeInvoke("enterDotQuery", "(Ljava/lang/Object;Lorg/mozilla/javascript/Scriptable;)Lorg/mozilla/javascript/Scriptable;");
        this.cfw.x(this.variableObjectLocal);
        this.cfw.r(1);
        int q11 = this.cfw.q();
        this.cfw.z0(q11);
        this.cfw.r(87);
        generateExpression(node2.getNext(), node);
        addScriptRuntimeInvoke("toBoolean", "(Ljava/lang/Object;)Z");
        this.cfw.w(this.variableObjectLocal);
        addScriptRuntimeInvoke("updateDotQuery", "(ZLorg/mozilla/javascript/Scriptable;)Ljava/lang/Object;");
        this.cfw.r(89);
        this.cfw.s(198, q11);
        this.cfw.w(this.variableObjectLocal);
        addScriptRuntimeInvoke("leaveDotQuery", "(Lorg/mozilla/javascript/Scriptable;)Lorg/mozilla/javascript/Scriptable;");
        this.cfw.x(this.variableObjectLocal);
    }

    private void visitFunction(OptFunctionNode optFunctionNode, int i11) {
        int index = this.codegen.getIndex(optFunctionNode.fnode);
        this.cfw.u(187, this.codegen.mainClassName);
        this.cfw.r(89);
        this.cfw.w(this.variableObjectLocal);
        this.cfw.w(this.contextLocal);
        this.cfw.W(index);
        this.cfw.K(183, this.codegen.mainClassName, "<init>", "(Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/Context;I)V");
        if (i11 == 2) {
            return;
        }
        this.cfw.W(i11);
        this.cfw.w(this.variableObjectLocal);
        this.cfw.w(this.contextLocal);
        addOptRuntimeInvoke("initFunction", "(Lorg/mozilla/javascript/NativeFunction;ILorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/Context;)V");
    }

    private void visitGetProp(Node node, Node node2) {
        generateExpression(node2, node);
        Node next = node2.getNext();
        generateExpression(next, node);
        if (node.getType() == 34) {
            this.cfw.w(this.contextLocal);
            addScriptRuntimeInvoke("getObjectPropNoWarn", "(Ljava/lang/Object;Ljava/lang/String;Lorg/mozilla/javascript/Context;)Ljava/lang/Object;");
        } else if (node2.getType() == 43 && next.getType() == 41) {
            this.cfw.w(this.contextLocal);
            addScriptRuntimeInvoke("getObjectProp", "(Lorg/mozilla/javascript/Scriptable;Ljava/lang/String;Lorg/mozilla/javascript/Context;)Ljava/lang/Object;");
        } else {
            this.cfw.w(this.contextLocal);
            this.cfw.w(this.variableObjectLocal);
            addScriptRuntimeInvoke("getObjectProp", "(Ljava/lang/Object;Ljava/lang/String;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;)Ljava/lang/Object;");
        }
    }

    private void visitGetVar(Node node) {
        if (!this.hasVarsInRegs) {
            Kit.codeBug();
        }
        int varIndex = this.fnCurrent.getVarIndex(node);
        short s11 = this.varRegisters[varIndex];
        if (varIsDirectCallParameter(varIndex)) {
            if (node.getIntProp(8, -1) != -1) {
                dcpLoadAsNumber(s11);
                return;
            } else {
                dcpLoadAsObject(s11);
                return;
            }
        }
        if (this.fnCurrent.isNumberVar(varIndex)) {
            this.cfw.y(s11);
        } else {
            this.cfw.w(s11);
        }
    }

    private void visitGoto(Jump jump, int i11, Node node) {
        Node node2 = jump.target;
        if (i11 != 6 && i11 != 7) {
            if (i11 != 135) {
                addGoto(node2, 167);
                return;
            } else if (this.isGenerator) {
                addGotoWithReturn(node2);
                return;
            } else {
                inlineFinally(node2);
                return;
            }
        }
        if (node == null) {
            throw Codegen.badTree();
        }
        int targetLabel = getTargetLabel(node2);
        int q11 = this.cfw.q();
        if (i11 == 6) {
            generateIfJump(node, jump, targetLabel, q11);
        } else {
            generateIfJump(node, jump, q11, targetLabel);
        }
        this.cfw.z0(q11);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void visitIfJumpEqOp(org.mozilla.javascript.Node r18, org.mozilla.javascript.Node r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.optimizer.BodyCodegen.visitIfJumpEqOp(org.mozilla.javascript.Node, org.mozilla.javascript.Node, int, int):void");
    }

    private void visitIfJumpRelOp(Node node, Node node2, int i11, int i12) {
        if (i11 == -1 || i12 == -1) {
            throw Codegen.badTree();
        }
        int type = node.getType();
        Node next = node2.getNext();
        if (type == 53 || type == 52) {
            generateExpression(node2, node);
            generateExpression(next, node);
            this.cfw.w(this.contextLocal);
            addScriptRuntimeInvoke(type == 53 ? "instanceOf" : "in", "(Ljava/lang/Object;Ljava/lang/Object;Lorg/mozilla/javascript/Context;)Z");
            this.cfw.s(154, i11);
            this.cfw.s(167, i12);
            return;
        }
        int intProp = node.getIntProp(8, -1);
        int nodeIsDirectCallParameter = nodeIsDirectCallParameter(node2);
        int nodeIsDirectCallParameter2 = nodeIsDirectCallParameter(next);
        if (intProp != -1) {
            if (intProp != 2) {
                generateExpression(node2, node);
            } else if (nodeIsDirectCallParameter != -1) {
                dcpLoadAsNumber(nodeIsDirectCallParameter);
            } else {
                generateExpression(node2, node);
                addObjectToDouble();
            }
            if (intProp != 1) {
                generateExpression(next, node);
            } else if (nodeIsDirectCallParameter2 != -1) {
                dcpLoadAsNumber(nodeIsDirectCallParameter2);
            } else {
                generateExpression(next, node);
                addObjectToDouble();
            }
            genSimpleCompare(type, i11, i12);
            return;
        }
        if (nodeIsDirectCallParameter == -1 || nodeIsDirectCallParameter2 == -1) {
            generateExpression(node2, node);
            generateExpression(next, node);
        } else {
            short v02 = this.cfw.v0();
            int q11 = this.cfw.q();
            this.cfw.w(nodeIsDirectCallParameter);
            this.cfw.v(178, "java/lang/Void", "TYPE", "Ljava/lang/Class;");
            this.cfw.s(166, q11);
            this.cfw.y(nodeIsDirectCallParameter + 1);
            dcpLoadAsNumber(nodeIsDirectCallParameter2);
            genSimpleCompare(type, i11, i12);
            if (v02 != this.cfw.v0()) {
                throw Codegen.badTree();
            }
            this.cfw.z0(q11);
            int q12 = this.cfw.q();
            this.cfw.w(nodeIsDirectCallParameter2);
            this.cfw.v(178, "java/lang/Void", "TYPE", "Ljava/lang/Class;");
            this.cfw.s(166, q12);
            this.cfw.w(nodeIsDirectCallParameter);
            addObjectToDouble();
            this.cfw.y(nodeIsDirectCallParameter2 + 1);
            genSimpleCompare(type, i11, i12);
            if (v02 != this.cfw.v0()) {
                throw Codegen.badTree();
            }
            this.cfw.z0(q12);
            this.cfw.w(nodeIsDirectCallParameter);
            this.cfw.w(nodeIsDirectCallParameter2);
        }
        if (type == 17 || type == 16) {
            this.cfw.r(95);
        }
        addScriptRuntimeInvoke((type == 14 || type == 16) ? "cmp_LT" : "cmp_LE", "(Ljava/lang/Object;Ljava/lang/Object;)Z");
        this.cfw.s(154, i11);
        this.cfw.s(167, i12);
    }

    private void visitIncDec(Node node) {
        int existingIntProp = node.getExistingIntProp(13);
        Node firstChild = node.getFirstChild();
        int type = firstChild.getType();
        if (type == 33) {
            Node firstChild2 = firstChild.getFirstChild();
            generateExpression(firstChild2, node);
            generateExpression(firstChild2.getNext(), node);
            this.cfw.w(this.contextLocal);
            this.cfw.W(existingIntProp);
            addScriptRuntimeInvoke("propIncrDecr", "(Ljava/lang/Object;Ljava/lang/String;Lorg/mozilla/javascript/Context;I)Ljava/lang/Object;");
            return;
        }
        if (type == 34) {
            throw Kit.codeBug();
        }
        if (type == 36) {
            Node firstChild3 = firstChild.getFirstChild();
            generateExpression(firstChild3, node);
            generateExpression(firstChild3.getNext(), node);
            this.cfw.w(this.contextLocal);
            this.cfw.W(existingIntProp);
            if (firstChild3.getNext().getIntProp(8, -1) != -1) {
                addOptRuntimeInvoke("elemIncrDecr", "(Ljava/lang/Object;DLorg/mozilla/javascript/Context;I)Ljava/lang/Object;");
                return;
            } else {
                addScriptRuntimeInvoke("elemIncrDecr", "(Ljava/lang/Object;Ljava/lang/Object;Lorg/mozilla/javascript/Context;I)Ljava/lang/Object;");
                return;
            }
        }
        if (type == 39) {
            this.cfw.w(this.variableObjectLocal);
            this.cfw.Y(firstChild.getString());
            this.cfw.w(this.contextLocal);
            this.cfw.W(existingIntProp);
            addScriptRuntimeInvoke("nameIncrDecr", "(Lorg/mozilla/javascript/Scriptable;Ljava/lang/String;Lorg/mozilla/javascript/Context;I)Ljava/lang/Object;");
            return;
        }
        if (type != 55) {
            if (type != 67) {
                Codegen.badTree();
                return;
            }
            generateExpression(firstChild.getFirstChild(), node);
            this.cfw.w(this.contextLocal);
            this.cfw.W(existingIntProp);
            addScriptRuntimeInvoke("refIncrDecr", "(Lorg/mozilla/javascript/Ref;Lorg/mozilla/javascript/Context;I)Ljava/lang/Object;");
            return;
        }
        if (!this.hasVarsInRegs) {
            Kit.codeBug();
        }
        boolean z11 = (existingIntProp & 2) != 0;
        int varIndex = this.fnCurrent.getVarIndex(firstChild);
        short s11 = this.varRegisters[varIndex];
        if (node.getIntProp(8, -1) != -1) {
            boolean varIsDirectCallParameter = varIsDirectCallParameter(varIndex);
            ClassFileWriter classFileWriter = this.cfw;
            int i11 = s11 + (varIsDirectCallParameter ? 1 : 0);
            classFileWriter.y(i11);
            if (z11) {
                this.cfw.r(92);
            }
            this.cfw.V(1.0d);
            if ((existingIntProp & 1) == 0) {
                this.cfw.r(99);
            } else {
                this.cfw.r(103);
            }
            if (!z11) {
                this.cfw.r(92);
            }
            this.cfw.z(i11);
            return;
        }
        if (varIsDirectCallParameter(varIndex)) {
            dcpLoadAsObject(s11);
        } else {
            this.cfw.w(s11);
        }
        if (z11) {
            this.cfw.r(89);
        }
        addObjectToDouble();
        this.cfw.V(1.0d);
        if ((existingIntProp & 1) == 0) {
            this.cfw.r(99);
        } else {
            this.cfw.r(103);
        }
        addDoubleWrap();
        if (!z11) {
            this.cfw.r(89);
        }
        this.cfw.x(s11);
    }

    private void visitObjectLiteral(Node node, Node node2, boolean z11) {
        Object[] objArr = (Object[]) node.getProp(12);
        int length = objArr.length;
        if (!z11 && ((length > 10 || this.cfw.s0() > 30000) && !this.hasVarsInRegs && !this.isGenerator && !this.inLocalBlock)) {
            if (this.literals == null) {
                this.literals = new LinkedList();
            }
            this.literals.add(node);
            String str = this.codegen.getBodyMethodName(this.scriptOrFn) + "_literal" + this.literals.size();
            this.cfw.w(this.funObjLocal);
            this.cfw.w(this.contextLocal);
            this.cfw.w(this.variableObjectLocal);
            this.cfw.w(this.thisObjLocal);
            this.cfw.w(this.argsLocal);
            this.cfw.K(182, this.codegen.mainClassName, str, "(Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/Scriptable;[Ljava/lang/Object;)Lorg/mozilla/javascript/Scriptable;");
            return;
        }
        addNewObjectArray(length);
        for (int i11 = 0; i11 != length; i11++) {
            this.cfw.r(89);
            this.cfw.W(i11);
            Object obj = objArr[i11];
            if (obj instanceof String) {
                this.cfw.Y((String) obj);
            } else {
                this.cfw.W(((Integer) obj).intValue());
                addScriptRuntimeInvoke("wrapInt", "(I)Ljava/lang/Integer;");
            }
            this.cfw.r(83);
        }
        addNewObjectArray(length);
        Node node3 = node2;
        for (int i12 = 0; i12 != length; i12++) {
            this.cfw.r(89);
            this.cfw.W(i12);
            int type = node3.getType();
            if (type == 151 || type == 152) {
                generateExpression(node3.getFirstChild(), node);
            } else {
                generateExpression(node3, node);
            }
            this.cfw.r(83);
            node3 = node3.getNext();
        }
        Node node4 = node2;
        for (int i13 = 0; i13 != length; i13++) {
            int type2 = node4.getType();
            if (type2 == 151 || type2 == 152) {
                this.cfw.W(length);
                this.cfw.s(188, 10);
                for (int i14 = 0; i14 != length; i14++) {
                    this.cfw.r(89);
                    this.cfw.W(i14);
                    int type3 = node2.getType();
                    if (type3 == 151) {
                        this.cfw.r(2);
                    } else if (type3 == 152) {
                        this.cfw.r(4);
                    } else {
                        this.cfw.r(3);
                    }
                    this.cfw.r(79);
                    node2 = node2.getNext();
                }
                this.cfw.w(this.contextLocal);
                this.cfw.w(this.variableObjectLocal);
                addScriptRuntimeInvoke("newObjectLiteral", "([Ljava/lang/Object;[Ljava/lang/Object;[ILorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;)Lorg/mozilla/javascript/Scriptable;");
            }
            node4 = node4.getNext();
        }
        this.cfw.r(1);
        this.cfw.w(this.contextLocal);
        this.cfw.w(this.variableObjectLocal);
        addScriptRuntimeInvoke("newObjectLiteral", "([Ljava/lang/Object;[Ljava/lang/Object;[ILorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;)Lorg/mozilla/javascript/Scriptable;");
    }

    private void visitOptimizedCall(Node node, OptFunctionNode optFunctionNode, int i11, Node node2) {
        short newWordLocal;
        Node next = node2.getNext();
        String str = this.codegen.mainClassName;
        if (i11 == 30) {
            generateExpression(node2, node);
            newWordLocal = 0;
        } else {
            generateFunctionAndThisObj(node2, node);
            newWordLocal = getNewWordLocal();
            this.cfw.x(newWordLocal);
        }
        int q11 = this.cfw.q();
        int q12 = this.cfw.q();
        this.cfw.r(89);
        this.cfw.u(193, str);
        this.cfw.s(153, q12);
        this.cfw.u(192, str);
        this.cfw.r(89);
        this.cfw.v(180, str, "_id", "I");
        this.cfw.W(this.codegen.getIndex(optFunctionNode.fnode));
        this.cfw.s(160, q12);
        this.cfw.w(this.contextLocal);
        this.cfw.w(this.variableObjectLocal);
        if (i11 == 30) {
            this.cfw.r(1);
        } else {
            this.cfw.w(newWordLocal);
        }
        for (Node node3 = next; node3 != null; node3 = node3.getNext()) {
            int nodeIsDirectCallParameter = nodeIsDirectCallParameter(node3);
            if (nodeIsDirectCallParameter >= 0) {
                this.cfw.w(nodeIsDirectCallParameter);
                this.cfw.y(nodeIsDirectCallParameter + 1);
            } else if (node3.getIntProp(8, -1) == 0) {
                this.cfw.v(178, "java/lang/Void", "TYPE", "Ljava/lang/Class;");
                generateExpression(node3, node);
            } else {
                generateExpression(node3, node);
                this.cfw.V(0.0d);
            }
        }
        this.cfw.v(178, "org/mozilla/javascript/ScriptRuntime", "emptyArgs", "[Ljava/lang/Object;");
        ClassFileWriter classFileWriter = this.cfw;
        Codegen codegen = this.codegen;
        String str2 = codegen.mainClassName;
        FunctionNode functionNode = optFunctionNode.fnode;
        classFileWriter.K(184, str2, i11 == 30 ? codegen.getDirectCtorName(functionNode) : codegen.getBodyMethodName(functionNode), this.codegen.getBodyMethodSignature(optFunctionNode.fnode));
        this.cfw.s(167, q11);
        this.cfw.z0(q12);
        this.cfw.w(this.contextLocal);
        this.cfw.w(this.variableObjectLocal);
        if (i11 != 30) {
            this.cfw.w(newWordLocal);
            releaseWordLocal(newWordLocal);
        }
        generateCallArgArray(node, next, true);
        if (i11 == 30) {
            addScriptRuntimeInvoke("newObject", "(Ljava/lang/Object;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;[Ljava/lang/Object;)Lorg/mozilla/javascript/Scriptable;");
        } else {
            this.cfw.K(185, "org/mozilla/javascript/Callable", NotificationCompat.CATEGORY_CALL, "(Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/Scriptable;[Ljava/lang/Object;)Ljava/lang/Object;");
        }
        this.cfw.z0(q11);
    }

    private void visitSetConst(Node node, Node node2) {
        String string = node.getFirstChild().getString();
        while (node2 != null) {
            generateExpression(node2, node);
            node2 = node2.getNext();
        }
        this.cfw.w(this.contextLocal);
        this.cfw.Y(string);
        addScriptRuntimeInvoke("setConst", "(Lorg/mozilla/javascript/Scriptable;Ljava/lang/Object;Lorg/mozilla/javascript/Context;Ljava/lang/String;)Ljava/lang/Object;");
    }

    private void visitSetConstVar(Node node, Node node2, boolean z11) {
        if (!this.hasVarsInRegs) {
            Kit.codeBug();
        }
        int varIndex = this.fnCurrent.getVarIndex(node);
        generateExpression(node2.getNext(), node);
        boolean z12 = node.getIntProp(8, -1) != -1;
        short s11 = this.varRegisters[varIndex];
        int q11 = this.cfw.q();
        int q12 = this.cfw.q();
        if (z12) {
            int i11 = s11 + 2;
            this.cfw.H(i11);
            this.cfw.s(154, q12);
            short v02 = this.cfw.v0();
            this.cfw.W(1);
            this.cfw.I(i11);
            this.cfw.z(s11);
            if (z11) {
                this.cfw.y(s11);
                this.cfw.A0(q12, v02);
            } else {
                this.cfw.s(167, q11);
                this.cfw.A0(q12, v02);
                this.cfw.r(88);
            }
        } else {
            int i12 = s11 + 1;
            this.cfw.H(i12);
            this.cfw.s(154, q12);
            short v03 = this.cfw.v0();
            this.cfw.W(1);
            this.cfw.I(i12);
            this.cfw.x(s11);
            if (z11) {
                this.cfw.w(s11);
                this.cfw.A0(q12, v03);
            } else {
                this.cfw.s(167, q11);
                this.cfw.A0(q12, v03);
                this.cfw.r(87);
            }
        }
        this.cfw.z0(q11);
    }

    private void visitSetElem(int i11, Node node, Node node2) {
        generateExpression(node2, node);
        Node next = node2.getNext();
        if (i11 == 140) {
            this.cfw.r(89);
        }
        generateExpression(next, node);
        Node next2 = next.getNext();
        boolean z11 = node.getIntProp(8, -1) != -1;
        if (i11 == 140) {
            if (z11) {
                this.cfw.r(93);
                this.cfw.w(this.contextLocal);
                addOptRuntimeInvoke("getObjectIndex", "(Ljava/lang/Object;DLorg/mozilla/javascript/Context;)Ljava/lang/Object;");
            } else {
                this.cfw.r(90);
                this.cfw.w(this.contextLocal);
                addScriptRuntimeInvoke("getObjectElem", "(Ljava/lang/Object;Ljava/lang/Object;Lorg/mozilla/javascript/Context;)Ljava/lang/Object;");
            }
        }
        generateExpression(next2, node);
        this.cfw.w(this.contextLocal);
        if (z11) {
            addScriptRuntimeInvoke("setObjectIndex", "(Ljava/lang/Object;DLjava/lang/Object;Lorg/mozilla/javascript/Context;)Ljava/lang/Object;");
        } else {
            addScriptRuntimeInvoke("setObjectElem", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lorg/mozilla/javascript/Context;)Ljava/lang/Object;");
        }
    }

    private void visitSetName(Node node, Node node2) {
        String string = node.getFirstChild().getString();
        while (node2 != null) {
            generateExpression(node2, node);
            node2 = node2.getNext();
        }
        this.cfw.w(this.contextLocal);
        this.cfw.w(this.variableObjectLocal);
        this.cfw.Y(string);
        addScriptRuntimeInvoke("setName", "(Lorg/mozilla/javascript/Scriptable;Ljava/lang/Object;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;Ljava/lang/String;)Ljava/lang/Object;");
    }

    private void visitSetProp(int i11, Node node, Node node2) {
        generateExpression(node2, node);
        Node next = node2.getNext();
        if (i11 == 139) {
            this.cfw.r(89);
        }
        generateExpression(next, node);
        Node next2 = next.getNext();
        if (i11 == 139) {
            this.cfw.r(90);
            if (node2.getType() == 43 && next.getType() == 41) {
                this.cfw.w(this.contextLocal);
                addScriptRuntimeInvoke("getObjectProp", "(Lorg/mozilla/javascript/Scriptable;Ljava/lang/String;Lorg/mozilla/javascript/Context;)Ljava/lang/Object;");
            } else {
                this.cfw.w(this.contextLocal);
                addScriptRuntimeInvoke("getObjectProp", "(Ljava/lang/Object;Ljava/lang/String;Lorg/mozilla/javascript/Context;)Ljava/lang/Object;");
            }
        }
        generateExpression(next2, node);
        this.cfw.w(this.contextLocal);
        addScriptRuntimeInvoke("setObjectProp", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Lorg/mozilla/javascript/Context;)Ljava/lang/Object;");
    }

    private void visitSetVar(Node node, Node node2, boolean z11) {
        if (!this.hasVarsInRegs) {
            Kit.codeBug();
        }
        int varIndex = this.fnCurrent.getVarIndex(node);
        generateExpression(node2.getNext(), node);
        boolean z12 = node.getIntProp(8, -1) != -1;
        short s11 = this.varRegisters[varIndex];
        if (this.fnCurrent.fnode.getParamAndVarConst()[varIndex]) {
            if (z11) {
                return;
            }
            if (z12) {
                this.cfw.r(88);
                return;
            } else {
                this.cfw.r(87);
                return;
            }
        }
        if (varIsDirectCallParameter(varIndex)) {
            if (!z12) {
                if (z11) {
                    this.cfw.r(89);
                }
                this.cfw.x(s11);
                return;
            }
            if (z11) {
                this.cfw.r(92);
            }
            this.cfw.w(s11);
            this.cfw.v(178, "java/lang/Void", "TYPE", "Ljava/lang/Class;");
            int q11 = this.cfw.q();
            int q12 = this.cfw.q();
            this.cfw.s(165, q11);
            short v02 = this.cfw.v0();
            addDoubleWrap();
            this.cfw.x(s11);
            this.cfw.s(167, q12);
            this.cfw.A0(q11, v02);
            this.cfw.z(s11 + 1);
            this.cfw.z0(q12);
            return;
        }
        boolean isNumberVar = this.fnCurrent.isNumberVar(varIndex);
        if (!z12) {
            if (isNumberVar) {
                Kit.codeBug();
            }
            this.cfw.x(s11);
            if (z11) {
                this.cfw.w(s11);
                return;
            }
            return;
        }
        if (isNumberVar) {
            this.cfw.z(s11);
            if (z11) {
                this.cfw.y(s11);
                return;
            }
            return;
        }
        if (z11) {
            this.cfw.r(92);
        }
        addDoubleWrap();
        this.cfw.x(s11);
    }

    private void visitSpecialCall(Node node, int i11, int i12, Node node2) {
        String str;
        String str2;
        this.cfw.w(this.contextLocal);
        if (i11 == 30) {
            generateExpression(node2, node);
        } else {
            generateFunctionAndThisObj(node2, node);
        }
        generateCallArgArray(node, node2.getNext(), false);
        if (i11 == 30) {
            this.cfw.w(this.variableObjectLocal);
            this.cfw.w(this.thisObjLocal);
            this.cfw.W(i12);
            str = "newObjectSpecial";
            str2 = "(Lorg/mozilla/javascript/Context;Ljava/lang/Object;[Ljava/lang/Object;Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/Scriptable;I)Ljava/lang/Object;";
        } else {
            this.cfw.w(this.variableObjectLocal);
            this.cfw.w(this.thisObjLocal);
            this.cfw.W(i12);
            String sourceName = this.scriptOrFn.getSourceName();
            ClassFileWriter classFileWriter = this.cfw;
            if (sourceName == null) {
                sourceName = "";
            }
            classFileWriter.Y(sourceName);
            this.cfw.W(this.itsLineNumber);
            str = "callSpecial";
            str2 = "(Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Callable;Lorg/mozilla/javascript/Scriptable;[Ljava/lang/Object;Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/Scriptable;ILjava/lang/String;I)Ljava/lang/Object;";
        }
        addOptRuntimeInvoke(str, str2);
    }

    private void visitStandardCall(Node node, Node node2) {
        String str;
        String str2;
        if (node.getType() != 38) {
            throw Codegen.badTree();
        }
        Node next = node2.getNext();
        int type = node2.getType();
        if (next == null) {
            if (type == 39) {
                this.cfw.Y(node2.getString());
                str = "callName0";
                str2 = "(Ljava/lang/String;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;)Ljava/lang/Object;";
            } else if (type == 33) {
                Node firstChild = node2.getFirstChild();
                generateExpression(firstChild, node);
                this.cfw.Y(firstChild.getNext().getString());
                str = "callProp0";
                str2 = "(Ljava/lang/Object;Ljava/lang/String;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;)Ljava/lang/Object;";
            } else {
                if (type == 34) {
                    throw Kit.codeBug();
                }
                generateFunctionAndThisObj(node2, node);
                str = "call0";
                str2 = "(Lorg/mozilla/javascript/Callable;Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;)Ljava/lang/Object;";
            }
        } else if (type == 39) {
            String string = node2.getString();
            generateCallArgArray(node, next, false);
            this.cfw.Y(string);
            str = "callName";
            str2 = "([Ljava/lang/Object;Ljava/lang/String;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;)Ljava/lang/Object;";
        } else {
            int i11 = 0;
            for (Node node3 = next; node3 != null; node3 = node3.getNext()) {
                i11++;
            }
            generateFunctionAndThisObj(node2, node);
            if (i11 == 1) {
                generateExpression(next, node);
                str = "call1";
                str2 = "(Lorg/mozilla/javascript/Callable;Lorg/mozilla/javascript/Scriptable;Ljava/lang/Object;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;)Ljava/lang/Object;";
            } else if (i11 == 2) {
                generateExpression(next, node);
                generateExpression(next.getNext(), node);
                str = "call2";
                str2 = "(Lorg/mozilla/javascript/Callable;Lorg/mozilla/javascript/Scriptable;Ljava/lang/Object;Ljava/lang/Object;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;)Ljava/lang/Object;";
            } else {
                generateCallArgArray(node, next, false);
                str = "callN";
                str2 = "(Lorg/mozilla/javascript/Callable;Lorg/mozilla/javascript/Scriptable;[Ljava/lang/Object;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;)Ljava/lang/Object;";
            }
        }
        this.cfw.w(this.contextLocal);
        this.cfw.w(this.variableObjectLocal);
        addOptRuntimeInvoke(str, str2);
    }

    private void visitStandardNew(Node node, Node node2) {
        if (node.getType() != 30) {
            throw Codegen.badTree();
        }
        Node next = node2.getNext();
        generateExpression(node2, node);
        this.cfw.w(this.contextLocal);
        this.cfw.w(this.variableObjectLocal);
        generateCallArgArray(node, next, false);
        addScriptRuntimeInvoke("newObject", "(Ljava/lang/Object;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;[Ljava/lang/Object;)Lorg/mozilla/javascript/Scriptable;");
    }

    private void visitStrictSetName(Node node, Node node2) {
        String string = node.getFirstChild().getString();
        while (node2 != null) {
            generateExpression(node2, node);
            node2 = node2.getNext();
        }
        this.cfw.w(this.contextLocal);
        this.cfw.w(this.variableObjectLocal);
        this.cfw.Y(string);
        addScriptRuntimeInvoke("strictSetName", "(Lorg/mozilla/javascript/Scriptable;Ljava/lang/Object;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;Ljava/lang/String;)Ljava/lang/Object;");
    }

    private void visitSwitch(Jump jump, Node node) {
        generateExpression(node, jump);
        short newWordLocal = getNewWordLocal();
        this.cfw.x(newWordLocal);
        for (Jump jump2 = (Jump) node.getNext(); jump2 != null; jump2 = (Jump) jump2.getNext()) {
            if (jump2.getType() != 115) {
                throw Codegen.badTree();
            }
            generateExpression(jump2.getFirstChild(), jump2);
            this.cfw.w(newWordLocal);
            addScriptRuntimeInvoke("shallowEq", "(Ljava/lang/Object;Ljava/lang/Object;)Z");
            addGoto(jump2.target, 154);
        }
        releaseWordLocal(newWordLocal);
    }

    private void visitTryCatchFinally(Jump jump, Node node) {
        int i11;
        BodyCodegen bodyCodegen = this;
        short newWordLocal = bodyCodegen.getNewWordLocal();
        bodyCodegen.cfw.w(bodyCodegen.variableObjectLocal);
        bodyCodegen.cfw.x(newWordLocal);
        int q11 = bodyCodegen.cfw.q();
        bodyCodegen.cfw.A0(q11, (short) 0);
        Node node2 = jump.target;
        Node node3 = jump.getFinally();
        int[] iArr = new int[5];
        bodyCodegen.exceptionManager.pushExceptionInfo(jump);
        if (node2 != null) {
            iArr[0] = bodyCodegen.cfw.q();
            iArr[1] = bodyCodegen.cfw.q();
            iArr[2] = bodyCodegen.cfw.q();
            Context currentContext = Context.getCurrentContext();
            if (currentContext != null && currentContext.hasFeature(13)) {
                iArr[3] = bodyCodegen.cfw.q();
            }
        }
        if (node3 != null) {
            iArr[4] = bodyCodegen.cfw.q();
        }
        bodyCodegen.exceptionManager.setHandlers(iArr, q11);
        if (bodyCodegen.isGenerator && node3 != null) {
            FinallyReturnPoint finallyReturnPoint = new FinallyReturnPoint();
            if (bodyCodegen.finallys == null) {
                bodyCodegen.finallys = new HashMap();
            }
            bodyCodegen.finallys.put(node3, finallyReturnPoint);
            bodyCodegen.finallys.put(node3.getNext(), finallyReturnPoint);
        }
        for (Node node4 = node; node4 != null; node4 = node4.getNext()) {
            if (node4 == node2) {
                int targetLabel = bodyCodegen.getTargetLabel(node2);
                bodyCodegen.exceptionManager.removeHandler(0, targetLabel);
                bodyCodegen.exceptionManager.removeHandler(1, targetLabel);
                bodyCodegen.exceptionManager.removeHandler(2, targetLabel);
                bodyCodegen.exceptionManager.removeHandler(3, targetLabel);
            }
            bodyCodegen.generateStatement(node4);
        }
        int q12 = bodyCodegen.cfw.q();
        bodyCodegen.cfw.s(167, q12);
        int localBlockRegister = getLocalBlockRegister(jump);
        if (node2 != null) {
            int labelId = node2.labelId();
            i11 = localBlockRegister;
            bodyCodegen.generateCatchBlock(0, newWordLocal, labelId, i11, iArr[0]);
            generateCatchBlock(1, newWordLocal, labelId, i11, iArr[1]);
            generateCatchBlock(2, newWordLocal, labelId, i11, iArr[2]);
            Context currentContext2 = Context.getCurrentContext();
            if (currentContext2 == null || !currentContext2.hasFeature(13)) {
                bodyCodegen = this;
            } else {
                bodyCodegen = this;
                bodyCodegen.generateCatchBlock(3, newWordLocal, labelId, i11, iArr[3]);
            }
        } else {
            i11 = localBlockRegister;
        }
        if (node3 != null) {
            int q13 = bodyCodegen.cfw.q();
            int q14 = bodyCodegen.cfw.q();
            bodyCodegen.cfw.y0(q13);
            if (!bodyCodegen.isGenerator) {
                bodyCodegen.cfw.z0(iArr[4]);
            }
            bodyCodegen.cfw.x(i11);
            bodyCodegen.cfw.w(newWordLocal);
            bodyCodegen.cfw.x(bodyCodegen.variableObjectLocal);
            int labelId2 = node3.labelId();
            if (bodyCodegen.isGenerator) {
                bodyCodegen.addGotoWithReturn(node3);
            } else {
                bodyCodegen.inlineFinally(node3, iArr[4], q14);
            }
            bodyCodegen.cfw.w(i11);
            if (bodyCodegen.isGenerator) {
                bodyCodegen.cfw.u(192, "java/lang/Throwable");
            }
            bodyCodegen.cfw.r(191);
            bodyCodegen.cfw.z0(q14);
            if (bodyCodegen.isGenerator) {
                bodyCodegen.cfw.A(q11, labelId2, q13, null);
            }
        }
        bodyCodegen.releaseWordLocal(newWordLocal);
        bodyCodegen.cfw.z0(q12);
        if (bodyCodegen.isGenerator) {
            return;
        }
        bodyCodegen.exceptionManager.popExceptionInfo();
    }

    private void visitTypeofname(Node node) {
        int indexForNameNode;
        if (!this.hasVarsInRegs || (indexForNameNode = this.fnCurrent.fnode.getIndexForNameNode(node)) < 0) {
            this.cfw.w(this.variableObjectLocal);
            this.cfw.Y(node.getString());
            addScriptRuntimeInvoke("typeofName", "(Lorg/mozilla/javascript/Scriptable;Ljava/lang/String;)Ljava/lang/String;");
            return;
        }
        if (this.fnCurrent.isNumberVar(indexForNameNode)) {
            this.cfw.Y("number");
            return;
        }
        if (!varIsDirectCallParameter(indexForNameNode)) {
            this.cfw.w(this.varRegisters[indexForNameNode]);
            addScriptRuntimeInvoke("typeof", "(Ljava/lang/Object;)Ljava/lang/String;");
            return;
        }
        short s11 = this.varRegisters[indexForNameNode];
        this.cfw.w(s11);
        this.cfw.v(178, "java/lang/Void", "TYPE", "Ljava/lang/Class;");
        int q11 = this.cfw.q();
        this.cfw.s(165, q11);
        short v02 = this.cfw.v0();
        this.cfw.w(s11);
        addScriptRuntimeInvoke("typeof", "(Ljava/lang/Object;)Ljava/lang/String;");
        int q12 = this.cfw.q();
        this.cfw.s(167, q12);
        this.cfw.A0(q11, v02);
        this.cfw.Y("number");
        this.cfw.z0(q12);
    }

    public void generateBodyCode() {
        this.isGenerator = Codegen.isGenerator(this.scriptOrFn);
        initBodyGeneration();
        if (this.isGenerator) {
            String str = j.f81006c + this.codegen.mainClassSignature + "Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;Ljava/lang/Object;Ljava/lang/Object;I)Ljava/lang/Object;";
            this.cfw.O0(this.codegen.getBodyMethodName(this.scriptOrFn) + "_gen", str, (short) 10);
        } else {
            this.cfw.O0(this.codegen.getBodyMethodName(this.scriptOrFn), this.codegen.getBodyMethodSignature(this.scriptOrFn), (short) 10);
        }
        generatePrologue();
        generateStatement(this.fnCurrent != null ? this.scriptOrFn.getLastChild() : this.scriptOrFn);
        generateEpilogue();
        this.cfw.P0((short) (this.localsMax + 1));
        if (this.isGenerator) {
            generateGenerator();
        }
        if (this.literals != null) {
            for (int i11 = 0; i11 < this.literals.size(); i11++) {
                Node node = this.literals.get(i11);
                int type = node.getType();
                if (type == 65) {
                    generateArrayLiteralFactory(node, i11 + 1);
                } else if (type != 66) {
                    Kit.codeBug(Token.typeToName(type));
                } else {
                    generateObjectLiteralFactory(node, i11 + 1);
                }
            }
        }
    }

    private void addInstructionCount(int i11) {
        this.cfw.w(this.contextLocal);
        this.cfw.W(i11);
        addScriptRuntimeInvoke("addInstructionCount", "(Lorg/mozilla/javascript/Context;I)V");
    }

    private void inlineFinally(Node node) {
        int q11 = this.cfw.q();
        int q12 = this.cfw.q();
        this.cfw.z0(q11);
        inlineFinally(node, q11, q12);
        this.cfw.z0(q12);
    }

    private short getNewWordLocal() {
        short s11 = this.firstFreeLocal;
        this.locals[s11] = 1;
        for (int i11 = s11 + 1; i11 < 1024; i11++) {
            if (this.locals[i11] == 0) {
                short s12 = (short) i11;
                this.firstFreeLocal = s12;
                if (this.localsMax < s12) {
                    this.localsMax = s12;
                }
                return s11;
            }
        }
        throw Context.reportRuntimeError("Program too complex (out of locals)");
    }
}

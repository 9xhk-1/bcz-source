package org.mozilla.javascript;

import ho.c;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.ast.ScriptNode;
import org.mozilla.javascript.debug.DebugFrame;
import org.mozilla.javascript.debug.Debugger;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class Interpreter extends Icode implements Evaluator {
    static final int EXCEPTION_HANDLER_SLOT = 2;
    static final int EXCEPTION_LOCAL_SLOT = 4;
    static final int EXCEPTION_SCOPE_SLOT = 5;
    static final int EXCEPTION_SLOT_SIZE = 6;
    static final int EXCEPTION_TRY_END_SLOT = 1;
    static final int EXCEPTION_TRY_START_SLOT = 0;
    static final int EXCEPTION_TYPE_SLOT = 3;
    InterpreterData itsData;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class CallFrame implements Cloneable, Serializable {
        static final long serialVersionUID = -2843792508994958978L;
        DebugFrame debuggerFrame;
        int emptyStackTop;
        InterpretedFunction fnOrScript;
        int frameIndex;
        boolean frozen;
        InterpreterData idata;
        boolean isContinuationsTopFrame;
        int localShift;
        CallFrame parentFrame;

        /* renamed from: pc, reason: collision with root package name */
        int f78359pc;
        int pcPrevBranch;
        int pcSourceLineStart;
        Object result;
        double resultDbl;
        double[] sDbl;
        int savedCallOp;
        int savedStackTop;
        Scriptable scope;
        Object[] stack;
        int[] stackAttributes;
        Scriptable thisObj;
        Object throwable;
        boolean useActivation;
        CallFrame varSource;

        private CallFrame() {
        }

        public CallFrame cloneFrozen() {
            if (!this.frozen) {
                Kit.codeBug();
            }
            try {
                CallFrame callFrame = (CallFrame) clone();
                callFrame.stack = (Object[]) this.stack.clone();
                callFrame.stackAttributes = (int[]) this.stackAttributes.clone();
                callFrame.sDbl = (double[]) this.sDbl.clone();
                callFrame.frozen = false;
                return callFrame;
            } catch (CloneNotSupportedException unused) {
                throw new IllegalStateException();
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class ContinuationJump implements Serializable {
        static final long serialVersionUID = 7687739156004308247L;
        CallFrame branchFrame;
        CallFrame capturedFrame;
        Object result;
        double resultDbl;

        public ContinuationJump(NativeContinuation nativeContinuation, CallFrame callFrame) {
            CallFrame callFrame2 = (CallFrame) nativeContinuation.getImplementation();
            this.capturedFrame = callFrame2;
            if (callFrame2 == null || callFrame == null) {
                this.branchFrame = null;
                return;
            }
            int i11 = callFrame2.frameIndex - callFrame.frameIndex;
            if (i11 != 0) {
                if (i11 < 0) {
                    i11 = -i11;
                } else {
                    callFrame = callFrame2;
                    callFrame2 = callFrame;
                }
                do {
                    callFrame = callFrame.parentFrame;
                    i11--;
                } while (i11 != 0);
                if (callFrame.frameIndex != callFrame2.frameIndex) {
                    Kit.codeBug();
                }
                callFrame = callFrame2;
                callFrame2 = callFrame;
            }
            while (callFrame2 != callFrame && callFrame2 != null) {
                callFrame2 = callFrame2.parentFrame;
                callFrame = callFrame.parentFrame;
            }
            this.branchFrame = callFrame2;
            if (callFrame2 == null || callFrame2.frozen) {
                return;
            }
            Kit.codeBug();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class GeneratorState {
        int operation;
        RuntimeException returnedException;
        Object value;

        public GeneratorState(int i11, Object obj) {
            this.operation = i11;
            this.value = obj;
        }
    }

    private static void addInstructionCount(Context context, CallFrame callFrame, int i11) {
        int i12 = context.instructionCount + (callFrame.f78359pc - callFrame.pcPrevBranch) + i11;
        context.instructionCount = i12;
        if (i12 > context.instructionThreshold) {
            context.observeInstructionCount(i12);
            context.instructionCount = 0;
        }
    }

    private static int bytecodeSpan(int i11) {
        if (i11 != -54 && i11 != -23) {
            if (i11 == -21) {
                return 5;
            }
            if (i11 != 50) {
                if (i11 != 57) {
                    if (i11 != 72 && i11 != 5 && i11 != 6 && i11 != 7) {
                        switch (i11) {
                            case -63:
                            case -62:
                                break;
                            default:
                                switch (i11) {
                                    case -49:
                                    case -48:
                                        break;
                                    case -47:
                                        return 5;
                                    case -46:
                                        return 3;
                                    case -45:
                                        return 2;
                                    default:
                                        switch (i11) {
                                            case -40:
                                                return 5;
                                            case -39:
                                                return 3;
                                            case -38:
                                                return 2;
                                            default:
                                                switch (i11) {
                                                    case -28:
                                                        return 5;
                                                    case -27:
                                                    case -26:
                                                        return 3;
                                                    default:
                                                        switch (i11) {
                                                            case -11:
                                                            case -10:
                                                            case -9:
                                                            case -8:
                                                            case -7:
                                                                return 2;
                                                            case -6:
                                                                break;
                                                            default:
                                                                if (Icode.validBytecode(i11)) {
                                                                    return 1;
                                                                }
                                                                throw Kit.codeBug();
                                                        }
                                                }
                                        }
                                }
                            case -61:
                                return 2;
                        }
                    }
                }
                return 2;
            }
            return 3;
        }
        return 3;
    }

    public static NativeContinuation captureContinuation(Context context) {
        Object obj = context.lastInterpreterFrame;
        if (obj == null || !(obj instanceof CallFrame)) {
            throw new IllegalStateException("Interpreter frames not found");
        }
        return captureContinuation(context, (CallFrame) obj, true);
    }

    private static CallFrame captureFrameForGenerator(CallFrame callFrame) {
        callFrame.frozen = true;
        CallFrame cloneFrozen = callFrame.cloneFrozen();
        callFrame.frozen = false;
        cloneFrozen.parentFrame = null;
        cloneFrozen.frameIndex = 0;
        return cloneFrozen;
    }

    private static void doAdd(Object[] objArr, double[] dArr, int i11, Context context) {
        boolean z11;
        double d11;
        int i12 = i11 + 1;
        Object obj = objArr[i12];
        Object obj2 = objArr[i11];
        UniqueTag uniqueTag = UniqueTag.DOUBLE_MARK;
        if (obj == uniqueTag) {
            d11 = dArr[i12];
            if (obj2 == uniqueTag) {
                dArr[i11] = dArr[i11] + d11;
                return;
            }
            z11 = true;
        } else {
            if (obj2 != uniqueTag) {
                if ((obj2 instanceof Scriptable) || (obj instanceof Scriptable)) {
                    objArr[i11] = ScriptRuntime.add(obj2, obj, context);
                    return;
                }
                if ((obj2 instanceof CharSequence) || (obj instanceof CharSequence)) {
                    objArr[i11] = new ConsString(ScriptRuntime.toCharSequence(obj2), ScriptRuntime.toCharSequence(obj));
                    return;
                }
                double doubleValue = obj2 instanceof Number ? ((Number) obj2).doubleValue() : ScriptRuntime.toNumber(obj2);
                double doubleValue2 = obj instanceof Number ? ((Number) obj).doubleValue() : ScriptRuntime.toNumber(obj);
                objArr[i11] = uniqueTag;
                dArr[i11] = doubleValue + doubleValue2;
                return;
            }
            obj2 = obj;
            z11 = false;
            d11 = dArr[i11];
        }
        if (obj2 instanceof Scriptable) {
            Object wrapNumber = ScriptRuntime.wrapNumber(d11);
            if (!z11) {
                Object obj3 = obj2;
                obj2 = wrapNumber;
                wrapNumber = obj3;
            }
            objArr[i11] = ScriptRuntime.add(obj2, wrapNumber, context);
            return;
        }
        if (!(obj2 instanceof CharSequence)) {
            double doubleValue3 = obj2 instanceof Number ? ((Number) obj2).doubleValue() : ScriptRuntime.toNumber(obj2);
            objArr[i11] = uniqueTag;
            dArr[i11] = doubleValue3 + d11;
        } else {
            CharSequence charSequence = (CharSequence) obj2;
            CharSequence charSequence2 = ScriptRuntime.toCharSequence(Double.valueOf(d11));
            if (z11) {
                objArr[i11] = new ConsString(charSequence, charSequence2);
            } else {
                objArr[i11] = new ConsString(charSequence2, charSequence);
            }
        }
    }

    private static int doArithmetic(CallFrame callFrame, int i11, Object[] objArr, double[] dArr, int i12) {
        double stack_double = stack_double(callFrame, i12);
        int i13 = i12 - 1;
        double stack_double2 = stack_double(callFrame, i13);
        objArr[i13] = UniqueTag.DOUBLE_MARK;
        switch (i11) {
            case 22:
                stack_double2 -= stack_double;
                break;
            case 23:
                stack_double2 *= stack_double;
                break;
            case 24:
                stack_double2 /= stack_double;
                break;
            case 25:
                stack_double2 %= stack_double;
                break;
        }
        dArr[i13] = stack_double2;
        return i13;
    }

    private static int doBitOp(CallFrame callFrame, int i11, Object[] objArr, double[] dArr, int i12) {
        int stack_int32 = stack_int32(callFrame, i12 - 1);
        int stack_int322 = stack_int32(callFrame, i12);
        int i13 = i12 - 1;
        objArr[i13] = UniqueTag.DOUBLE_MARK;
        if (i11 == 18) {
            stack_int32 <<= stack_int322;
        } else if (i11 != 19) {
            switch (i11) {
                case 9:
                    stack_int32 |= stack_int322;
                    break;
                case 10:
                    stack_int32 ^= stack_int322;
                    break;
                case 11:
                    stack_int32 &= stack_int322;
                    break;
            }
        } else {
            stack_int32 >>= stack_int322;
        }
        dArr[i13] = stack_int32;
        return i13;
    }

    private static int doCallSpecial(Context context, CallFrame callFrame, Object[] objArr, double[] dArr, int i11, byte[] bArr, int i12) {
        int i13;
        int i14 = callFrame.f78359pc;
        int i15 = bArr[i14] & 255;
        boolean z11 = bArr[i14 + 1] != 0;
        int index = getIndex(bArr, i14 + 2);
        if (z11) {
            i13 = i11 - i12;
            Object obj = objArr[i13];
            if (obj == UniqueTag.DOUBLE_MARK) {
                obj = ScriptRuntime.wrapNumber(dArr[i13]);
            }
            objArr[i13] = ScriptRuntime.newSpecial(context, obj, getArgsArray(objArr, dArr, i13 + 1, i12), callFrame.scope, i15);
        } else {
            i13 = i11 - (i12 + 1);
            objArr[i13] = ScriptRuntime.callSpecial(context, (Callable) objArr[i13], (Scriptable) objArr[i13 + 1], getArgsArray(objArr, dArr, i13 + 2, i12), callFrame.scope, callFrame.thisObj, i15, callFrame.idata.itsSourceFile, index);
        }
        callFrame.f78359pc += 4;
        return i13;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        if (r8 >= r1) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
    
        if (r8 > r1) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0031, code lost:
    
        if (r8 <= r1) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0036, code lost:
    
        if (r8 < r1) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int doCompare(org.mozilla.javascript.Interpreter.CallFrame r5, int r6, java.lang.Object[] r7, double[] r8, int r9) {
        /*
            int r0 = r9 + (-1)
            r1 = r7[r9]
            r2 = r7[r0]
            org.mozilla.javascript.UniqueTag r3 = org.mozilla.javascript.UniqueTag.DOUBLE_MARK
            if (r1 != r3) goto L11
            r1 = r8[r9]
            double r8 = stack_double(r5, r0)
            goto L1a
        L11:
            if (r2 != r3) goto L39
            double r1 = org.mozilla.javascript.ScriptRuntime.toNumber(r1)
            r3 = r8[r0]
            r8 = r3
        L1a:
            r5 = 0
            r3 = 1
            switch(r6) {
                case 14: goto L34;
                case 15: goto L2f;
                case 16: goto L2a;
                case 17: goto L24;
                default: goto L1f;
            }
        L1f:
            java.lang.RuntimeException r5 = org.mozilla.javascript.Kit.codeBug()
            throw r5
        L24:
            int r6 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r6 < 0) goto L54
        L28:
            r5 = r3
            goto L54
        L2a:
            int r6 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r6 <= 0) goto L54
            goto L28
        L2f:
            int r6 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r6 > 0) goto L54
            goto L28
        L34:
            int r6 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r6 >= 0) goto L54
            goto L28
        L39:
            switch(r6) {
                case 14: goto L50;
                case 15: goto L4b;
                case 16: goto L46;
                case 17: goto L41;
                default: goto L3c;
            }
        L3c:
            java.lang.RuntimeException r5 = org.mozilla.javascript.Kit.codeBug()
            throw r5
        L41:
            boolean r5 = org.mozilla.javascript.ScriptRuntime.cmp_LE(r1, r2)
            goto L54
        L46:
            boolean r5 = org.mozilla.javascript.ScriptRuntime.cmp_LT(r1, r2)
            goto L54
        L4b:
            boolean r5 = org.mozilla.javascript.ScriptRuntime.cmp_LE(r2, r1)
            goto L54
        L50:
            boolean r5 = org.mozilla.javascript.ScriptRuntime.cmp_LT(r2, r1)
        L54:
            java.lang.Boolean r5 = org.mozilla.javascript.ScriptRuntime.wrapBoolean(r5)
            r7[r0] = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.Interpreter.doCompare(org.mozilla.javascript.Interpreter$CallFrame, int, java.lang.Object[], double[], int):int");
    }

    private static int doDelName(Context context, int i11, Object[] objArr, double[] dArr, int i12) {
        Object obj = objArr[i12];
        UniqueTag uniqueTag = UniqueTag.DOUBLE_MARK;
        if (obj == uniqueTag) {
            obj = ScriptRuntime.wrapNumber(dArr[i12]);
        }
        int i13 = i12 - 1;
        Object obj2 = objArr[i13];
        if (obj2 == uniqueTag) {
            obj2 = ScriptRuntime.wrapNumber(dArr[i13]);
        }
        objArr[i13] = ScriptRuntime.delete(obj2, obj, context, i11 == 0);
        return i13;
    }

    private static int doElemIncDec(Context context, CallFrame callFrame, byte[] bArr, Object[] objArr, double[] dArr, int i11) {
        Object obj = objArr[i11];
        UniqueTag uniqueTag = UniqueTag.DOUBLE_MARK;
        if (obj == uniqueTag) {
            obj = ScriptRuntime.wrapNumber(dArr[i11]);
        }
        int i12 = i11 - 1;
        Object obj2 = objArr[i12];
        if (obj2 == uniqueTag) {
            obj2 = ScriptRuntime.wrapNumber(dArr[i12]);
        }
        objArr[i12] = ScriptRuntime.elemIncrDecr(obj2, obj, context, bArr[callFrame.f78359pc]);
        callFrame.f78359pc++;
        return i12;
    }

    private static boolean doEquals(Object[] objArr, double[] dArr, int i11) {
        int i12 = i11 + 1;
        Object obj = objArr[i12];
        Object obj2 = objArr[i11];
        UniqueTag uniqueTag = UniqueTag.DOUBLE_MARK;
        return obj == uniqueTag ? obj2 == uniqueTag ? dArr[i11] == dArr[i12] : ScriptRuntime.eqNumber(dArr[i12], obj2) : obj2 == uniqueTag ? ScriptRuntime.eqNumber(dArr[i11], obj) : ScriptRuntime.eq(obj2, obj);
    }

    private static int doGetElem(Context context, CallFrame callFrame, Object[] objArr, double[] dArr, int i11) {
        int i12 = i11 - 1;
        Object obj = objArr[i12];
        UniqueTag uniqueTag = UniqueTag.DOUBLE_MARK;
        if (obj == uniqueTag) {
            obj = ScriptRuntime.wrapNumber(dArr[i12]);
        }
        Object obj2 = objArr[i11];
        objArr[i12] = obj2 != uniqueTag ? ScriptRuntime.getObjectElem(obj, obj2, context, callFrame.scope) : ScriptRuntime.getObjectIndex(obj, dArr[i11], context);
        return i12;
    }

    private static int doGetVar(CallFrame callFrame, Object[] objArr, double[] dArr, int i11, Object[] objArr2, double[] dArr2, int i12) {
        int i13 = i11 + 1;
        if (!callFrame.useActivation) {
            objArr[i13] = objArr2[i12];
            dArr[i13] = dArr2[i12];
            return i13;
        }
        String str = callFrame.idata.argNames[i12];
        Scriptable scriptable = callFrame.scope;
        objArr[i13] = scriptable.get(str, scriptable);
        return i13;
    }

    private static int doInOrInstanceof(Context context, int i11, Object[] objArr, double[] dArr, int i12) {
        Object obj = objArr[i12];
        UniqueTag uniqueTag = UniqueTag.DOUBLE_MARK;
        if (obj == uniqueTag) {
            obj = ScriptRuntime.wrapNumber(dArr[i12]);
        }
        int i13 = i12 - 1;
        Object obj2 = objArr[i13];
        if (obj2 == uniqueTag) {
            obj2 = ScriptRuntime.wrapNumber(dArr[i13]);
        }
        objArr[i13] = ScriptRuntime.wrapBoolean(i11 == 52 ? ScriptRuntime.in(obj2, obj, context) : ScriptRuntime.instanceOf(obj2, obj, context));
        return i13;
    }

    private static int doRefMember(Context context, Object[] objArr, double[] dArr, int i11, int i12) {
        Object obj = objArr[i11];
        UniqueTag uniqueTag = UniqueTag.DOUBLE_MARK;
        if (obj == uniqueTag) {
            obj = ScriptRuntime.wrapNumber(dArr[i11]);
        }
        int i13 = i11 - 1;
        Object obj2 = objArr[i13];
        if (obj2 == uniqueTag) {
            obj2 = ScriptRuntime.wrapNumber(dArr[i13]);
        }
        objArr[i13] = ScriptRuntime.memberRef(obj2, obj, context, i12);
        return i13;
    }

    private static int doRefNsMember(Context context, Object[] objArr, double[] dArr, int i11, int i12) {
        Object obj = objArr[i11];
        UniqueTag uniqueTag = UniqueTag.DOUBLE_MARK;
        if (obj == uniqueTag) {
            obj = ScriptRuntime.wrapNumber(dArr[i11]);
        }
        int i13 = i11 - 1;
        Object obj2 = objArr[i13];
        if (obj2 == uniqueTag) {
            obj2 = ScriptRuntime.wrapNumber(dArr[i13]);
        }
        int i14 = i11 - 2;
        Object obj3 = objArr[i14];
        if (obj3 == uniqueTag) {
            obj3 = ScriptRuntime.wrapNumber(dArr[i14]);
        }
        objArr[i14] = ScriptRuntime.memberRef(obj3, obj2, obj, context, i12);
        return i14;
    }

    private static int doRefNsName(Context context, CallFrame callFrame, Object[] objArr, double[] dArr, int i11, int i12) {
        Object obj = objArr[i11];
        UniqueTag uniqueTag = UniqueTag.DOUBLE_MARK;
        if (obj == uniqueTag) {
            obj = ScriptRuntime.wrapNumber(dArr[i11]);
        }
        int i13 = i11 - 1;
        Object obj2 = objArr[i13];
        if (obj2 == uniqueTag) {
            obj2 = ScriptRuntime.wrapNumber(dArr[i13]);
        }
        objArr[i13] = ScriptRuntime.nameRef(obj2, obj, context, callFrame.scope, i12);
        return i13;
    }

    private static int doSetConstVar(CallFrame callFrame, Object[] objArr, double[] dArr, int i11, Object[] objArr2, double[] dArr2, int[] iArr, int i12) {
        if (!callFrame.useActivation) {
            int i13 = iArr[i12];
            if ((i13 & 1) == 0) {
                throw Context.reportRuntimeError1("msg.var.redecl", callFrame.idata.argNames[i12]);
            }
            if ((i13 & 8) != 0) {
                objArr2[i12] = objArr[i11];
                iArr[i12] = i13 & (-9);
                dArr2[i12] = dArr[i11];
            }
            return i11;
        }
        Object obj = objArr[i11];
        if (obj == UniqueTag.DOUBLE_MARK) {
            obj = ScriptRuntime.wrapNumber(dArr[i11]);
        }
        String str = callFrame.idata.argNames[i12];
        Scriptable scriptable = callFrame.scope;
        if (!(scriptable instanceof ConstProperties)) {
            throw Kit.codeBug();
        }
        ((ConstProperties) scriptable).putConst(str, scriptable, obj);
        return i11;
    }

    private static int doSetElem(Context context, Object[] objArr, double[] dArr, int i11) {
        int i12 = i11 - 2;
        Object obj = objArr[i11];
        UniqueTag uniqueTag = UniqueTag.DOUBLE_MARK;
        if (obj == uniqueTag) {
            obj = ScriptRuntime.wrapNumber(dArr[i11]);
        }
        Object obj2 = objArr[i12];
        if (obj2 == uniqueTag) {
            obj2 = ScriptRuntime.wrapNumber(dArr[i12]);
        }
        int i13 = i11 - 1;
        Object obj3 = objArr[i13];
        objArr[i12] = obj3 != uniqueTag ? ScriptRuntime.setObjectElem(obj2, obj3, obj, context) : ScriptRuntime.setObjectIndex(obj2, dArr[i13], obj, context);
        return i12;
    }

    private static int doSetVar(CallFrame callFrame, Object[] objArr, double[] dArr, int i11, Object[] objArr2, double[] dArr2, int[] iArr, int i12) {
        if (!callFrame.useActivation) {
            if ((iArr[i12] & 1) == 0) {
                objArr2[i12] = objArr[i11];
                dArr2[i12] = dArr[i11];
            }
            return i11;
        }
        Object obj = objArr[i11];
        if (obj == UniqueTag.DOUBLE_MARK) {
            obj = ScriptRuntime.wrapNumber(dArr[i11]);
        }
        String str = callFrame.idata.argNames[i12];
        Scriptable scriptable = callFrame.scope;
        scriptable.put(str, scriptable, obj);
        return i11;
    }

    private static boolean doShallowEquals(Object[] objArr, double[] dArr, int i11) {
        double d11;
        double doubleValue;
        int i12 = i11 + 1;
        Object obj = objArr[i12];
        Object obj2 = objArr[i11];
        UniqueTag uniqueTag = UniqueTag.DOUBLE_MARK;
        if (obj != uniqueTag) {
            if (obj2 != uniqueTag) {
                return ScriptRuntime.shallowEq(obj2, obj);
            }
            d11 = dArr[i11];
            if (obj instanceof Number) {
                doubleValue = ((Number) obj).doubleValue();
            }
        }
        doubleValue = dArr[i12];
        if (obj2 == uniqueTag) {
            d11 = dArr[i11];
        } else {
            if (!(obj2 instanceof Number)) {
                return false;
            }
            d11 = ((Number) obj2).doubleValue();
        }
        return d11 == doubleValue;
    }

    private static int doVarIncDec(Context context, CallFrame callFrame, Object[] objArr, double[] dArr, int i11, Object[] objArr2, double[] dArr2, int i12) {
        double number;
        int i13 = i11 + 1;
        InterpreterData interpreterData = callFrame.idata;
        byte b11 = interpreterData.itsICode[callFrame.f78359pc];
        if (callFrame.useActivation) {
            objArr[i13] = ScriptRuntime.nameIncrDecr(callFrame.scope, interpreterData.argNames[i12], context, b11);
        } else {
            UniqueTag uniqueTag = UniqueTag.DOUBLE_MARK;
            objArr[i13] = uniqueTag;
            Object obj = objArr2[i12];
            if (obj == uniqueTag) {
                number = dArr2[i12];
            } else {
                number = ScriptRuntime.toNumber(obj);
                objArr2[i12] = uniqueTag;
            }
            double d11 = (b11 & 1) == 0 ? 1.0d + number : number - 1.0d;
            dArr2[i12] = d11;
            if ((b11 & 2) == 0) {
                number = d11;
            }
            dArr[i13] = number;
        }
        callFrame.f78359pc++;
        return i13;
    }

    private static void enterFrame(Context context, CallFrame callFrame, Object[] objArr, boolean z11) {
        CallFrame callFrame2;
        boolean z12 = callFrame.idata.itsNeedsActivation;
        boolean z13 = callFrame.debuggerFrame != null;
        if (z12 || z13) {
            Scriptable scriptable = callFrame.scope;
            if (scriptable == null) {
                Kit.codeBug();
            } else if (z11) {
                while (scriptable instanceof NativeWith) {
                    scriptable = scriptable.getParentScope();
                    if (scriptable == null || ((callFrame2 = callFrame.parentFrame) != null && callFrame2.scope == scriptable)) {
                        Kit.codeBug();
                        break;
                    }
                }
            }
            if (z13) {
                callFrame.debuggerFrame.onEnter(context, scriptable, callFrame.thisObj, objArr);
            }
            if (z12) {
                ScriptRuntime.enterActivationFunction(context, scriptable);
            }
        }
    }

    private static void exitFrame(Context context, CallFrame callFrame, Object obj) {
        if (callFrame.idata.itsNeedsActivation) {
            ScriptRuntime.exitActivationFunction(context);
        }
        DebugFrame debugFrame = callFrame.debuggerFrame;
        if (debugFrame != null) {
            try {
                if (obj instanceof Throwable) {
                    debugFrame.onExit(context, true, obj);
                    return;
                }
                ContinuationJump continuationJump = (ContinuationJump) obj;
                Object obj2 = continuationJump == null ? callFrame.result : continuationJump.result;
                if (obj2 == UniqueTag.DOUBLE_MARK) {
                    obj2 = ScriptRuntime.wrapNumber(continuationJump == null ? callFrame.resultDbl : continuationJump.resultDbl);
                }
                callFrame.debuggerFrame.onExit(context, false, obj2);
            } catch (Throwable th2) {
                System.err.println("RHINO USAGE WARNING: onExit terminated with exception");
                th2.printStackTrace(System.err);
            }
        }
    }

    private static Object freezeGenerator(Context context, CallFrame callFrame, int i11, GeneratorState generatorState) {
        if (generatorState.operation == 2) {
            throw ScriptRuntime.typeError0("msg.yield.closing");
        }
        callFrame.frozen = true;
        callFrame.result = callFrame.stack[i11];
        callFrame.resultDbl = callFrame.sDbl[i11];
        callFrame.savedStackTop = i11;
        callFrame.f78359pc--;
        ScriptRuntime.exitActivationFunction(context);
        Object obj = callFrame.result;
        return obj != UniqueTag.DOUBLE_MARK ? obj : ScriptRuntime.wrapNumber(callFrame.resultDbl);
    }

    private static Object[] getArgsArray(Object[] objArr, double[] dArr, int i11, int i12) {
        if (i12 == 0) {
            return ScriptRuntime.emptyArgs;
        }
        Object[] objArr2 = new Object[i12];
        int i13 = 0;
        while (i13 != i12) {
            Object obj = objArr[i11];
            if (obj == UniqueTag.DOUBLE_MARK) {
                obj = ScriptRuntime.wrapNumber(dArr[i11]);
            }
            objArr2[i13] = obj;
            i13++;
            i11++;
        }
        return objArr2;
    }

    public static String getEncodedSource(InterpreterData interpreterData) {
        String str = interpreterData.encodedSource;
        if (str == null) {
            return null;
        }
        return str.substring(interpreterData.encodedSourceStart, interpreterData.encodedSourceEnd);
    }

    private static int getExceptionHandler(CallFrame callFrame, boolean z11) {
        int[] iArr = callFrame.idata.itsExceptionTable;
        int i11 = -1;
        if (iArr == null) {
            return -1;
        }
        int i12 = callFrame.f78359pc - 1;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 != iArr.length; i15 += 6) {
            int i16 = iArr[i15];
            int i17 = iArr[i15 + 1];
            if (i16 <= i12 && i12 < i17 && (!z11 || iArr[i15 + 3] == 1)) {
                if (i11 >= 0) {
                    if (i13 >= i17) {
                        if (i14 > i16) {
                            Kit.codeBug();
                        }
                        if (i13 == i17) {
                            Kit.codeBug();
                        }
                    }
                }
                i11 = i15;
                i14 = i16;
                i13 = i17;
            }
        }
        return i11;
    }

    private static int getIndex(byte[] bArr, int i11) {
        return (bArr[i11 + 1] & 255) | ((bArr[i11] & 255) << 8);
    }

    private static int getInt(byte[] bArr, int i11) {
        return (bArr[i11 + 3] & 255) | (bArr[i11] << c.B) | ((bArr[i11 + 1] & 255) << 16) | ((bArr[i11 + 2] & 255) << 8);
    }

    public static int[] getLineNumbers(InterpreterData interpreterData) {
        UintMap uintMap = new UintMap();
        byte[] bArr = interpreterData.itsICode;
        int length = bArr.length;
        int i11 = 0;
        while (i11 != length) {
            byte b11 = bArr[i11];
            int bytecodeSpan = bytecodeSpan(b11);
            if (b11 == -26) {
                if (bytecodeSpan != 3) {
                    Kit.codeBug();
                }
                uintMap.put(getIndex(bArr, i11 + 1), 0);
            }
            i11 += bytecodeSpan;
        }
        return uintMap.getKeys();
    }

    private static int getShort(byte[] bArr, int i11) {
        return (bArr[i11 + 1] & 255) | (bArr[i11] << 8);
    }

    private static void initFrame(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr, double[] dArr, int i11, int i12, InterpretedFunction interpretedFunction, CallFrame callFrame, CallFrame callFrame2) {
        DebugFrame debugFrame;
        Object[] objArr2;
        double[] dArr2;
        int i13;
        Scriptable scriptable3;
        Object obj;
        int[] iArr;
        double[] dArr3;
        boolean z11;
        InterpreterData interpreterData = interpretedFunction.idata;
        boolean z12 = interpreterData.itsNeedsActivation;
        Debugger debugger = context.debugger;
        if (debugger != null) {
            debugFrame = debugger.getFrame(context, interpreterData);
            if (debugFrame != null) {
                z12 = true;
            }
        } else {
            debugFrame = null;
        }
        if (z12) {
            objArr2 = dArr != null ? getArgsArray(objArr, dArr, i11, i12) : objArr;
            dArr2 = null;
            i13 = 0;
        } else {
            objArr2 = objArr;
            dArr2 = dArr;
            i13 = i11;
        }
        if (interpreterData.itsFunctionType != 0) {
            scriptable3 = interpretedFunction.getParentScope();
            if (z12) {
                scriptable3 = ScriptRuntime.createFunctionActivation(interpretedFunction, scriptable3, objArr2);
            }
        } else {
            ScriptRuntime.initScript(interpretedFunction, scriptable2, context, scriptable, interpretedFunction.idata.evalScriptFlag);
            scriptable3 = scriptable;
        }
        if (interpreterData.itsNestedFunctions != null) {
            if (interpreterData.itsFunctionType != 0 && !interpreterData.itsNeedsActivation) {
                Kit.codeBug();
            }
            int i14 = 0;
            obj = null;
            while (true) {
                InterpreterData[] interpreterDataArr = interpreterData.itsNestedFunctions;
                if (i14 >= interpreterDataArr.length) {
                    break;
                }
                if (interpreterDataArr[i14].itsFunctionType == 1) {
                    initFunction(context, scriptable3, interpretedFunction, i14);
                }
                i14++;
            }
        } else {
            obj = null;
        }
        int i15 = interpreterData.itsMaxVars + interpreterData.itsMaxLocals;
        int i16 = i15 - 1;
        int i17 = interpreterData.itsMaxFrameArray;
        if (i17 != interpreterData.itsMaxStack + i16 + 1) {
            Kit.codeBug();
        }
        Object[] objArr3 = callFrame2.stack;
        if (objArr3 == null || i17 > objArr3.length) {
            objArr3 = new Object[i17];
            iArr = new int[i17];
            dArr3 = new double[i17];
            z11 = false;
        } else {
            iArr = callFrame2.stackAttributes;
            dArr3 = callFrame2.sDbl;
            z11 = true;
        }
        int paramAndVarCount = interpreterData.getParamAndVarCount();
        double[] dArr4 = dArr2;
        for (int i18 = 0; i18 < paramAndVarCount; i18++) {
            if (interpreterData.getParamOrVarConst(i18)) {
                iArr[i18] = 13;
            }
        }
        int i19 = interpreterData.argCount;
        int i21 = i12;
        if (i19 <= i21) {
            i21 = i19;
        }
        callFrame2.parentFrame = callFrame;
        int i22 = callFrame == null ? 0 : callFrame.frameIndex + 1;
        callFrame2.frameIndex = i22;
        if (i22 > context.getMaximumInterpreterStackDepth()) {
            throw Context.reportRuntimeError("Exceeded maximum stack depth");
        }
        callFrame2.frozen = false;
        callFrame2.fnOrScript = interpretedFunction;
        callFrame2.idata = interpreterData;
        callFrame2.stack = objArr3;
        callFrame2.stackAttributes = iArr;
        callFrame2.sDbl = dArr3;
        callFrame2.varSource = callFrame2;
        callFrame2.localShift = interpreterData.itsMaxVars;
        callFrame2.emptyStackTop = i16;
        callFrame2.debuggerFrame = debugFrame;
        callFrame2.useActivation = z12;
        callFrame2.thisObj = scriptable2;
        callFrame2.result = Undefined.instance;
        callFrame2.f78359pc = 0;
        callFrame2.pcPrevBranch = 0;
        callFrame2.pcSourceLineStart = interpreterData.firstLinePC;
        callFrame2.scope = scriptable3;
        callFrame2.savedStackTop = i16;
        callFrame2.savedCallOp = 0;
        System.arraycopy(objArr2, i13, objArr3, 0, i21);
        if (dArr4 != null) {
            System.arraycopy(dArr4, i13, dArr3, 0, i21);
        }
        while (i21 != interpreterData.itsMaxVars) {
            objArr3[i21] = Undefined.instance;
            i21++;
        }
        if (z11) {
            for (int i23 = i15; i23 != objArr3.length; i23++) {
                objArr3[i23] = obj;
            }
        }
        enterFrame(context, callFrame2, objArr2, false);
    }

    private static CallFrame initFrameForApplyOrCall(Context context, CallFrame callFrame, int i11, Object[] objArr, double[] dArr, int i12, int i13, Scriptable scriptable, IdFunctionObject idFunctionObject, InterpretedFunction interpretedFunction) {
        Scriptable scriptable2;
        if (i11 != 0) {
            int i14 = i12 + 2;
            Object obj = objArr[i14];
            if (obj == UniqueTag.DOUBLE_MARK) {
                obj = ScriptRuntime.wrapNumber(dArr[i14]);
            }
            scriptable2 = ScriptRuntime.toObjectOrNull(context, obj);
        } else {
            scriptable2 = null;
        }
        if (scriptable2 == null) {
            scriptable2 = ScriptRuntime.getTopCallScope(context);
        }
        if (i13 == -55) {
            exitFrame(context, callFrame, null);
            callFrame = callFrame.parentFrame;
        } else {
            callFrame.savedStackTop = i12;
            callFrame.savedCallOp = i13;
        }
        CallFrame callFrame2 = new CallFrame();
        if (BaseFunction.isApply(idFunctionObject)) {
            Object[] applyArguments = i11 < 2 ? ScriptRuntime.emptyArgs : ScriptRuntime.getApplyArguments(context, objArr[i12 + 3]);
            initFrame(context, scriptable, scriptable2, applyArguments, null, 0, applyArguments.length, interpretedFunction, callFrame, callFrame2);
            return callFrame2;
        }
        CallFrame callFrame3 = callFrame;
        Scriptable scriptable3 = scriptable2;
        for (int i15 = 1; i15 < i11; i15++) {
            int i16 = i12 + 1 + i15;
            int i17 = i12 + 2 + i15;
            objArr[i16] = objArr[i17];
            dArr[i16] = dArr[i17];
        }
        initFrame(context, scriptable, scriptable3, objArr, dArr, i12 + 2, i11 < 2 ? 0 : i11 - 1, interpretedFunction, callFrame3, callFrame2);
        return callFrame2;
    }

    private static CallFrame initFrameForNoSuchMethod(Context context, CallFrame callFrame, int i11, Object[] objArr, double[] dArr, int i12, int i13, Scriptable scriptable, Scriptable scriptable2, ScriptRuntime.NoSuchMethodShim noSuchMethodShim, InterpretedFunction interpretedFunction) {
        CallFrame callFrame2;
        int i14 = i12 + 2;
        Object[] objArr2 = new Object[i11];
        int i15 = 0;
        while (i15 < i11) {
            Object obj = objArr[i14];
            if (obj == UniqueTag.DOUBLE_MARK) {
                obj = ScriptRuntime.wrapNumber(dArr[i14]);
            }
            objArr2[i15] = obj;
            i15++;
            i14++;
        }
        Object[] objArr3 = {noSuchMethodShim.methodName, context.newArray(scriptable2, objArr2)};
        CallFrame callFrame3 = new CallFrame();
        if (i13 == -55) {
            CallFrame callFrame4 = callFrame.parentFrame;
            exitFrame(context, callFrame, null);
            callFrame2 = callFrame4;
        } else {
            callFrame2 = callFrame;
        }
        initFrame(context, scriptable2, scriptable, objArr3, null, 0, 2, interpretedFunction, callFrame2, callFrame3);
        if (i13 != -55) {
            callFrame.savedStackTop = i12;
            callFrame.savedCallOp = i13;
        }
        return callFrame3;
    }

    private static void initFunction(Context context, Scriptable scriptable, InterpretedFunction interpretedFunction, int i11) {
        InterpretedFunction createFunction = InterpretedFunction.createFunction(context, scriptable, interpretedFunction, i11);
        ScriptRuntime.initFunction(context, scriptable, createFunction, createFunction.idata.itsFunctionType, interpretedFunction.idata.evalScriptFlag);
    }

    public static Object interpret(InterpretedFunction interpretedFunction, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        if (!ScriptRuntime.hasTopCall(context)) {
            Kit.codeBug();
        }
        Object obj = context.interpreterSecurityDomain;
        Object obj2 = interpretedFunction.securityDomain;
        if (obj != obj2) {
            context.interpreterSecurityDomain = obj2;
            try {
                return interpretedFunction.securityController.callWithDomain(obj2, context, interpretedFunction, scriptable, scriptable2, objArr);
            } finally {
                context.interpreterSecurityDomain = obj;
            }
        }
        CallFrame callFrame = new CallFrame();
        initFrame(context, scriptable, scriptable2, objArr, null, 0, objArr.length, interpretedFunction, null, callFrame);
        callFrame.isContinuationsTopFrame = context.isContinuationsTopCall;
        context.isContinuationsTopCall = false;
        return interpretLoop(context, callFrame, null);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    private static java.lang.Object interpretLoop(org.mozilla.javascript.Context r39, org.mozilla.javascript.Interpreter.CallFrame r40, java.lang.Object r41) {
        /*
            Method dump skipped, instructions count: 6238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.Interpreter.interpretLoop(org.mozilla.javascript.Context, org.mozilla.javascript.Interpreter$CallFrame, java.lang.Object):java.lang.Object");
    }

    private static boolean isFrameEnterExitRequired(CallFrame callFrame) {
        return callFrame.debuggerFrame != null || callFrame.idata.itsNeedsActivation;
    }

    private static CallFrame processThrowable(Context context, Object obj, CallFrame callFrame, int i11, boolean z11) {
        if (i11 >= 0) {
            if (callFrame.frozen) {
                callFrame = callFrame.cloneFrozen();
            }
            int[] iArr = callFrame.idata.itsExceptionTable;
            int i12 = iArr[i11 + 2];
            callFrame.f78359pc = i12;
            if (z11) {
                callFrame.pcPrevBranch = i12;
            }
            callFrame.savedStackTop = callFrame.emptyStackTop;
            int i13 = callFrame.localShift;
            int i14 = iArr[i11 + 5] + i13;
            int i15 = i13 + iArr[i11 + 4];
            Object[] objArr = callFrame.stack;
            callFrame.scope = (Scriptable) objArr[i14];
            objArr[i15] = obj;
        } else {
            ContinuationJump continuationJump = (ContinuationJump) obj;
            if (continuationJump.branchFrame != callFrame) {
                Kit.codeBug();
            }
            if (continuationJump.capturedFrame == null) {
                Kit.codeBug();
            }
            CallFrame callFrame2 = continuationJump.capturedFrame;
            int i16 = callFrame2.frameIndex + 1;
            CallFrame callFrame3 = continuationJump.branchFrame;
            if (callFrame3 != null) {
                i16 -= callFrame3.frameIndex;
            }
            CallFrame[] callFrameArr = null;
            int i17 = 0;
            for (int i18 = 0; i18 != i16; i18++) {
                if (!callFrame2.frozen) {
                    Kit.codeBug();
                }
                if (isFrameEnterExitRequired(callFrame2)) {
                    if (callFrameArr == null) {
                        callFrameArr = new CallFrame[i16 - i18];
                    }
                    callFrameArr[i17] = callFrame2;
                    i17++;
                }
                callFrame2 = callFrame2.parentFrame;
            }
            while (i17 != 0) {
                i17--;
                enterFrame(context, callFrameArr[i17], ScriptRuntime.emptyArgs, true);
            }
            callFrame = continuationJump.capturedFrame.cloneFrozen();
            setCallResult(callFrame, continuationJump.result, continuationJump.resultDbl);
        }
        callFrame.throwable = null;
        return callFrame;
    }

    public static Object restartContinuation(NativeContinuation nativeContinuation, Context context, Scriptable scriptable, Object[] objArr) {
        if (!ScriptRuntime.hasTopCall(context)) {
            return ScriptRuntime.doTopCall(nativeContinuation, context, scriptable, null, objArr);
        }
        Object obj = objArr.length == 0 ? Undefined.instance : objArr[0];
        if (((CallFrame) nativeContinuation.getImplementation()) == null) {
            return obj;
        }
        ContinuationJump continuationJump = new ContinuationJump(nativeContinuation, null);
        continuationJump.result = obj;
        return interpretLoop(context, null, continuationJump);
    }

    public static Object resumeGenerator(Context context, Scriptable scriptable, int i11, Object obj, Object obj2) {
        CallFrame callFrame = (CallFrame) obj;
        GeneratorState generatorState = new GeneratorState(i11, obj2);
        if (i11 == 2) {
            try {
                return interpretLoop(context, callFrame, generatorState);
            } catch (RuntimeException e11) {
                if (e11 == obj2) {
                    return Undefined.instance;
                }
                throw e11;
            }
        }
        Object interpretLoop = interpretLoop(context, callFrame, generatorState);
        RuntimeException runtimeException = generatorState.returnedException;
        if (runtimeException == null) {
            return interpretLoop;
        }
        throw runtimeException;
    }

    private static void setCallResult(CallFrame callFrame, Object obj, double d11) {
        int i11 = callFrame.savedCallOp;
        if (i11 == 38) {
            Object[] objArr = callFrame.stack;
            int i12 = callFrame.savedStackTop;
            objArr[i12] = obj;
            callFrame.sDbl[i12] = d11;
        } else if (i11 != 30) {
            Kit.codeBug();
        } else if (obj instanceof Scriptable) {
            callFrame.stack[callFrame.savedStackTop] = obj;
        }
        callFrame.savedCallOp = 0;
    }

    private static boolean stack_boolean(CallFrame callFrame, int i11) {
        Object obj = callFrame.stack[i11];
        if (obj == Boolean.TRUE) {
            return true;
        }
        if (obj == Boolean.FALSE) {
            return false;
        }
        if (obj == UniqueTag.DOUBLE_MARK) {
            double d11 = callFrame.sDbl[i11];
            return d11 == d11 && d11 != 0.0d;
        }
        if (obj == null || obj == Undefined.instance) {
            return false;
        }
        if (!(obj instanceof Number)) {
            return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : ScriptRuntime.toBoolean(obj);
        }
        double doubleValue = ((Number) obj).doubleValue();
        return doubleValue == doubleValue && doubleValue != 0.0d;
    }

    private static double stack_double(CallFrame callFrame, int i11) {
        Object obj = callFrame.stack[i11];
        return obj != UniqueTag.DOUBLE_MARK ? ScriptRuntime.toNumber(obj) : callFrame.sDbl[i11];
    }

    private static int stack_int32(CallFrame callFrame, int i11) {
        Object obj = callFrame.stack[i11];
        return obj == UniqueTag.DOUBLE_MARK ? ScriptRuntime.toInt32(callFrame.sDbl[i11]) : ScriptRuntime.toInt32(obj);
    }

    private static Object thawGenerator(CallFrame callFrame, int i11, GeneratorState generatorState, int i12) {
        callFrame.frozen = false;
        int index = getIndex(callFrame.idata.itsICode, callFrame.f78359pc);
        callFrame.f78359pc += 2;
        int i13 = generatorState.operation;
        if (i13 == 1) {
            return new JavaScriptException(generatorState.value, callFrame.idata.itsSourceFile, index);
        }
        if (i13 == 2) {
            return generatorState.value;
        }
        if (i13 != 0) {
            throw Kit.codeBug();
        }
        if (i12 == 72) {
            callFrame.stack[i11] = generatorState.value;
        }
        return Scriptable.NOT_FOUND;
    }

    @Override // org.mozilla.javascript.Evaluator
    public void captureStackInfo(RhinoException rhinoException) {
        CallFrame[] callFrameArr;
        Context currentContext = Context.getCurrentContext();
        if (currentContext == null || currentContext.lastInterpreterFrame == null) {
            rhinoException.interpreterStackInfo = null;
            rhinoException.interpreterLineData = null;
            return;
        }
        ObjArray objArray = currentContext.previousInterpreterInvocations;
        if (objArray == null || objArray.size() == 0) {
            callFrameArr = new CallFrame[1];
        } else {
            int size = currentContext.previousInterpreterInvocations.size();
            if (currentContext.previousInterpreterInvocations.peek() == currentContext.lastInterpreterFrame) {
                size--;
            }
            callFrameArr = new CallFrame[size + 1];
            currentContext.previousInterpreterInvocations.toArray(callFrameArr);
        }
        callFrameArr[callFrameArr.length - 1] = (CallFrame) currentContext.lastInterpreterFrame;
        int i11 = 0;
        for (int i12 = 0; i12 != callFrameArr.length; i12++) {
            i11 += callFrameArr[i12].frameIndex + 1;
        }
        int[] iArr = new int[i11];
        int length = callFrameArr.length;
        while (length != 0) {
            length--;
            for (CallFrame callFrame = callFrameArr[length]; callFrame != null; callFrame = callFrame.parentFrame) {
                i11--;
                iArr[i11] = callFrame.pcSourceLineStart;
            }
        }
        if (i11 != 0) {
            Kit.codeBug();
        }
        rhinoException.interpreterStackInfo = callFrameArr;
        rhinoException.interpreterLineData = iArr;
    }

    @Override // org.mozilla.javascript.Evaluator
    public Object compile(CompilerEnvirons compilerEnvirons, ScriptNode scriptNode, String str, boolean z11) {
        InterpreterData compile = new CodeGenerator().compile(compilerEnvirons, scriptNode, str, z11);
        this.itsData = compile;
        return compile;
    }

    @Override // org.mozilla.javascript.Evaluator
    public Function createFunctionObject(Context context, Scriptable scriptable, Object obj, Object obj2) {
        if (obj != this.itsData) {
            Kit.codeBug();
        }
        return InterpretedFunction.createFunction(context, scriptable, this.itsData, obj2);
    }

    @Override // org.mozilla.javascript.Evaluator
    public Script createScriptObject(Object obj, Object obj2) {
        if (obj != this.itsData) {
            Kit.codeBug();
        }
        return InterpretedFunction.createScript(this.itsData, obj2);
    }

    @Override // org.mozilla.javascript.Evaluator
    public String getPatchedStack(RhinoException rhinoException, String str) {
        char charAt;
        StringBuffer stringBuffer = new StringBuffer(str.length() + 1000);
        String systemProperty = SecurityUtilities.getSystemProperty("line.separator");
        CallFrame[] callFrameArr = (CallFrame[]) rhinoException.interpreterStackInfo;
        int[] iArr = rhinoException.interpreterLineData;
        int length = callFrameArr.length;
        int length2 = iArr.length;
        int i11 = 0;
        while (length != 0) {
            length--;
            int indexOf = str.indexOf("org.mozilla.javascript.Interpreter.interpretLoop", i11);
            if (indexOf < 0) {
                break;
            }
            int i12 = indexOf + 48;
            while (i12 != str.length() && (charAt = str.charAt(i12)) != '\n' && charAt != '\r') {
                i12++;
            }
            stringBuffer.append(str.substring(i11, i12));
            for (CallFrame callFrame = callFrameArr[length]; callFrame != null; callFrame = callFrame.parentFrame) {
                if (length2 == 0) {
                    Kit.codeBug();
                }
                length2--;
                InterpreterData interpreterData = callFrame.idata;
                stringBuffer.append(systemProperty);
                stringBuffer.append("\tat script");
                String str2 = interpreterData.itsName;
                if (str2 != null && str2.length() != 0) {
                    stringBuffer.append('.');
                    stringBuffer.append(interpreterData.itsName);
                }
                stringBuffer.append('(');
                stringBuffer.append(interpreterData.itsSourceFile);
                int i13 = iArr[length2];
                if (i13 >= 0) {
                    stringBuffer.append(':');
                    stringBuffer.append(getIndex(interpreterData.itsICode, i13));
                }
                stringBuffer.append(')');
            }
            i11 = i12;
        }
        stringBuffer.append(str.substring(i11));
        return stringBuffer.toString();
    }

    @Override // org.mozilla.javascript.Evaluator
    public List<String> getScriptStack(RhinoException rhinoException) {
        ScriptStackElement[][] scriptStackElements = getScriptStackElements(rhinoException);
        ArrayList arrayList = new ArrayList(scriptStackElements.length);
        String systemProperty = SecurityUtilities.getSystemProperty("line.separator");
        for (ScriptStackElement[] scriptStackElementArr : scriptStackElements) {
            StringBuilder sb2 = new StringBuilder();
            for (ScriptStackElement scriptStackElement : scriptStackElementArr) {
                scriptStackElement.renderJavaStyle(sb2);
                sb2.append(systemProperty);
            }
            arrayList.add(sb2.toString());
        }
        return arrayList;
    }

    public ScriptStackElement[][] getScriptStackElements(RhinoException rhinoException) {
        if (rhinoException.interpreterStackInfo == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        CallFrame[] callFrameArr = (CallFrame[]) rhinoException.interpreterStackInfo;
        int[] iArr = rhinoException.interpreterLineData;
        int length = callFrameArr.length;
        int length2 = iArr.length;
        while (length != 0) {
            length--;
            CallFrame callFrame = callFrameArr[length];
            ArrayList arrayList2 = new ArrayList();
            while (callFrame != null) {
                if (length2 == 0) {
                    Kit.codeBug();
                }
                length2--;
                InterpreterData interpreterData = callFrame.idata;
                String str = interpreterData.itsSourceFile;
                int i11 = iArr[length2];
                int index = i11 >= 0 ? getIndex(interpreterData.itsICode, i11) : -1;
                String str2 = interpreterData.itsName;
                String str3 = (str2 == null || str2.length() == 0) ? null : interpreterData.itsName;
                callFrame = callFrame.parentFrame;
                arrayList2.add(new ScriptStackElement(str, str3, index));
            }
            arrayList.add(arrayList2.toArray(new ScriptStackElement[arrayList2.size()]));
        }
        return (ScriptStackElement[][]) arrayList.toArray(new ScriptStackElement[arrayList.size()][]);
    }

    @Override // org.mozilla.javascript.Evaluator
    public String getSourcePositionFromStack(Context context, int[] iArr) {
        CallFrame callFrame = (CallFrame) context.lastInterpreterFrame;
        InterpreterData interpreterData = callFrame.idata;
        int i11 = callFrame.pcSourceLineStart;
        if (i11 >= 0) {
            iArr[0] = getIndex(interpreterData.itsICode, i11);
        } else {
            iArr[0] = 0;
        }
        return interpreterData.itsSourceFile;
    }

    @Override // org.mozilla.javascript.Evaluator
    public void setEvalScriptFlag(Script script) {
        ((InterpretedFunction) script).idata.evalScriptFlag = true;
    }

    private static NativeContinuation captureContinuation(Context context, CallFrame callFrame, boolean z11) {
        Object[] objArr;
        NativeContinuation nativeContinuation = new NativeContinuation();
        ScriptRuntime.setObjectProtoAndParent(nativeContinuation, ScriptRuntime.getTopCallScope(context));
        CallFrame callFrame2 = callFrame;
        CallFrame callFrame3 = callFrame2;
        while (callFrame2 != null && !callFrame2.frozen) {
            callFrame2.frozen = true;
            int i11 = callFrame2.savedStackTop + 1;
            while (true) {
                objArr = callFrame2.stack;
                if (i11 == objArr.length) {
                    break;
                }
                objArr[i11] = null;
                callFrame2.stackAttributes[i11] = 0;
                i11++;
            }
            int i12 = callFrame2.savedCallOp;
            if (i12 == 38) {
                objArr[callFrame2.savedStackTop] = null;
            } else if (i12 != 30) {
                Kit.codeBug();
            }
            callFrame3 = callFrame2;
            callFrame2 = callFrame2.parentFrame;
        }
        if (z11) {
            while (true) {
                CallFrame callFrame4 = callFrame3.parentFrame;
                if (callFrame4 == null) {
                    break;
                }
                callFrame3 = callFrame4;
            }
            if (!callFrame3.isContinuationsTopFrame) {
                throw new IllegalStateException("Cannot capture continuation from JavaScript code not called directly by executeScriptWithContinuations or callFunctionWithContinuations");
            }
        }
        nativeContinuation.initImplementation(callFrame);
        return nativeContinuation;
    }

    public static void dumpICode(InterpreterData interpreterData) {
    }
}

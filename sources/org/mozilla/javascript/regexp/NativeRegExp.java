package org.mozilla.javascript.regexp;

import ho.c;
import io.ktor.util.date.b;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Function;
import org.mozilla.javascript.IdFunctionObject;
import org.mozilla.javascript.IdScriptableObject;
import org.mozilla.javascript.Kit;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.TopLevel;
import org.mozilla.javascript.Undefined;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class NativeRegExp extends IdScriptableObject implements Function {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int ANCHOR_BOL = -2;
    private static final int INDEX_LEN = 2;
    private static final int Id_compile = 1;
    private static final int Id_exec = 4;
    private static final int Id_global = 3;
    private static final int Id_ignoreCase = 4;
    private static final int Id_lastIndex = 1;
    private static final int Id_multiline = 5;
    private static final int Id_prefix = 6;
    private static final int Id_source = 2;
    private static final int Id_test = 5;
    private static final int Id_toSource = 3;
    private static final int Id_toString = 2;
    public static final int JSREG_FOLD = 2;
    public static final int JSREG_GLOB = 1;
    public static final int JSREG_MULTILINE = 4;
    public static final int MATCH = 1;
    private static final int MAX_INSTANCE_ID = 5;
    private static final int MAX_PROTOTYPE_ID = 6;
    public static final int PREFIX = 2;
    private static final Object REGEXP_TAG = new Object();
    private static final byte REOP_ALNUM = 9;
    private static final byte REOP_ALT = 31;
    private static final byte REOP_ALTPREREQ = 53;
    private static final byte REOP_ALTPREREQ2 = 55;
    private static final byte REOP_ALTPREREQi = 54;
    private static final byte REOP_ASSERT = 41;
    private static final byte REOP_ASSERTNOTTEST = 44;
    private static final byte REOP_ASSERTTEST = 43;
    private static final byte REOP_ASSERT_NOT = 42;
    private static final byte REOP_BACKREF = 13;
    private static final byte REOP_BOL = 2;
    private static final byte REOP_CLASS = 22;
    private static final byte REOP_DIGIT = 7;
    private static final byte REOP_DOT = 6;
    private static final byte REOP_EMPTY = 1;
    private static final byte REOP_END = 57;
    private static final byte REOP_ENDCHILD = 49;
    private static final byte REOP_EOL = 3;
    private static final byte REOP_FLAT = 14;
    private static final byte REOP_FLAT1 = 15;
    private static final byte REOP_FLAT1i = 17;
    private static final byte REOP_FLATi = 16;
    private static final byte REOP_JUMP = 32;
    private static final byte REOP_LPAREN = 29;
    private static final byte REOP_MINIMALOPT = 47;
    private static final byte REOP_MINIMALPLUS = 46;
    private static final byte REOP_MINIMALQUANT = 48;
    private static final byte REOP_MINIMALREPEAT = 52;
    private static final byte REOP_MINIMALSTAR = 45;
    private static final byte REOP_NCLASS = 23;
    private static final byte REOP_NONALNUM = 10;
    private static final byte REOP_NONDIGIT = 8;
    private static final byte REOP_NONSPACE = 12;
    private static final byte REOP_OPT = 28;
    private static final byte REOP_PLUS = 27;
    private static final byte REOP_QUANT = 25;
    private static final byte REOP_REPEAT = 51;
    private static final byte REOP_RPAREN = 30;
    private static final byte REOP_SIMPLE_END = 23;
    private static final byte REOP_SIMPLE_START = 1;
    private static final byte REOP_SPACE = 11;
    private static final byte REOP_STAR = 26;
    private static final byte REOP_UCFLAT1 = 18;
    private static final byte REOP_UCFLAT1i = 19;
    private static final byte REOP_WBDRY = 4;
    private static final byte REOP_WNONBDRY = 5;
    public static final int TEST = 0;
    private static final boolean debug = false;
    static final long serialVersionUID = 4965263491464903264L;
    double lastIndex;

    /* renamed from: re, reason: collision with root package name */
    private RECompiled f78398re;

    public NativeRegExp(Scriptable scriptable, RECompiled rECompiled) {
        this.f78398re = rECompiled;
        this.lastIndex = 0.0d;
        ScriptRuntime.setBuiltinProtoAndParent(this, scriptable, TopLevel.Builtins.RegExp);
    }

    private static void addCharacterRangeToCharSet(RECharSet rECharSet, char c11, char c12) {
        int i11 = c11 / '\b';
        int i12 = c12 / '\b';
        if (c12 >= rECharSet.length || c11 > c12) {
            throw ScriptRuntime.constructError("SyntaxError", "invalid range in character class");
        }
        char c13 = (char) (c11 & 7);
        char c14 = (char) (c12 & 7);
        if (i11 == i12) {
            byte[] bArr = rECharSet.bits;
            bArr[i11] = (byte) (((255 >> (7 - (c14 - c13))) << c13) | bArr[i11]);
            return;
        }
        byte[] bArr2 = rECharSet.bits;
        bArr2[i11] = (byte) ((255 << c13) | bArr2[i11]);
        while (true) {
            i11++;
            if (i11 >= i12) {
                byte[] bArr3 = rECharSet.bits;
                bArr3[i12] = (byte) (bArr3[i12] | (255 >> (7 - c14)));
                return;
            }
            rECharSet.bits[i11] = -1;
        }
    }

    private static void addCharacterToCharSet(RECharSet rECharSet, char c11) {
        int i11 = c11 / '\b';
        if (c11 >= rECharSet.length) {
            throw ScriptRuntime.constructError("SyntaxError", "invalid range in character class");
        }
        byte[] bArr = rECharSet.bits;
        bArr[i11] = (byte) ((1 << (c11 & 7)) | bArr[i11]);
    }

    private static int addIndex(byte[] bArr, int i11, int i12) {
        if (i12 < 0) {
            throw Kit.codeBug();
        }
        if (i12 > 65535) {
            throw Context.reportRuntimeError("Too complex regexp");
        }
        bArr[i11] = (byte) (i12 >> 8);
        bArr[i11 + 1] = (byte) i12;
        return i11 + 2;
    }

    private static boolean backrefMatcher(REGlobalData rEGlobalData, int i11, String str, int i12) {
        long[] jArr = rEGlobalData.parens;
        if (jArr == null || i11 >= jArr.length) {
            return false;
        }
        int parensIndex = rEGlobalData.parensIndex(i11);
        if (parensIndex == -1) {
            return true;
        }
        int parensLength = rEGlobalData.parensLength(i11);
        int i13 = rEGlobalData.f78402cp;
        if (i13 + parensLength > i12) {
            return false;
        }
        if ((rEGlobalData.regexp.flags & 2) != 0) {
            for (int i14 = 0; i14 < parensLength; i14++) {
                char charAt = str.charAt(parensIndex + i14);
                char charAt2 = str.charAt(rEGlobalData.f78402cp + i14);
                if (charAt != charAt2 && upcase(charAt) != upcase(charAt2)) {
                    return false;
                }
            }
        } else if (!str.regionMatches(parensIndex, str, i13, parensLength)) {
            return false;
        }
        rEGlobalData.f78402cp += parensLength;
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00fc, code lost:
    
        reportError("msg.bad.range", "");
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00ff, code lost:
    
        return false;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:61:0x006f A[LOOP:1: B:57:0x005b->B:61:0x006f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0069 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r14v10, types: [int] */
    /* JADX WARN: Type inference failed for: r14v11, types: [int] */
    /* JADX WARN: Type inference failed for: r14v7, types: [int] */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r8v6, types: [int] */
    /* JADX WARN: Type inference failed for: r8v8, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean calculateBitmapSize(org.mozilla.javascript.regexp.CompilerState r16, org.mozilla.javascript.regexp.RENode r17, char[] r18, int r19, int r20) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.regexp.NativeRegExp.calculateBitmapSize(org.mozilla.javascript.regexp.CompilerState, org.mozilla.javascript.regexp.RENode, char[], int, int):boolean");
    }

    private static boolean classMatcher(REGlobalData rEGlobalData, RECharSet rECharSet, char c11) {
        if (!rECharSet.converted) {
            processCharSet(rEGlobalData, rECharSet);
        }
        int i11 = c11 >> 3;
        int i12 = rECharSet.length;
        boolean z11 = true;
        if (i12 != 0 && c11 < i12 && (rECharSet.bits[i11] & (1 << (c11 & 7))) != 0) {
            z11 = false;
        }
        return rECharSet.sense ^ z11;
    }

    public static RECompiled compileRE(Context context, String str, String str2, boolean z11) {
        int i11;
        RECompiled rECompiled = new RECompiled(str);
        int length = str.length();
        if (str2 != null) {
            i11 = 0;
            for (int i12 = 0; i12 < str2.length(); i12++) {
                char charAt = str2.charAt(i12);
                if (charAt == 'g') {
                    i11 |= 1;
                } else if (charAt == 'i') {
                    i11 |= 2;
                } else if (charAt == 'm') {
                    i11 |= 4;
                } else {
                    reportError("msg.invalid.re.flag", String.valueOf(charAt));
                }
            }
        } else {
            i11 = 0;
        }
        rECompiled.flags = i11;
        CompilerState compilerState = new CompilerState(context, rECompiled.source, length, i11);
        if (z11 && length > 0) {
            RENode rENode = new RENode((byte) 14);
            compilerState.result = rENode;
            rENode.chr = compilerState.cpbegin[0];
            rENode.length = length;
            rENode.flatIndex = 0;
            compilerState.progLength += 5;
        } else if (!parseDisjunction(compilerState)) {
            return null;
        }
        rECompiled.program = new byte[compilerState.progLength + 1];
        int i13 = compilerState.classCount;
        if (i13 != 0) {
            rECompiled.classList = new RECharSet[i13];
            rECompiled.classCount = i13;
        }
        int emitREBytecode = emitREBytecode(compilerState, rECompiled, 0, compilerState.result);
        byte[] bArr = rECompiled.program;
        bArr[emitREBytecode] = REOP_END;
        rECompiled.parenCount = compilerState.parenCount;
        byte b11 = bArr[0];
        if (b11 == 2) {
            rECompiled.anchorCh = -2;
            return rECompiled;
        }
        if (b11 != 31) {
            switch (b11) {
                case 14:
                case 16:
                    rECompiled.anchorCh = rECompiled.source[getIndex(bArr, 1)];
                    break;
                case 15:
                case 17:
                    rECompiled.anchorCh = (char) (bArr[1] & 255);
                    break;
                case 18:
                case 19:
                    rECompiled.anchorCh = (char) getIndex(bArr, 1);
                    break;
            }
            return rECompiled;
        }
        RENode rENode2 = compilerState.result;
        if (rENode2.kid.f78403op == 2 && rENode2.kid2.f78403op == 2) {
            rECompiled.anchorCh = -2;
        }
        return rECompiled;
    }

    private static void doFlat(CompilerState compilerState, char c11) {
        RENode rENode = new RENode((byte) 14);
        compilerState.result = rENode;
        rENode.chr = c11;
        rENode.length = 1;
        rENode.flatIndex = -1;
        compilerState.progLength += 3;
    }

    private static char downcase(char c11) {
        if (c11 >= 128) {
            char lowerCase = Character.toLowerCase(c11);
            if (lowerCase >= 128) {
                return lowerCase;
            }
        } else if ('A' <= c11 && c11 <= 'Z') {
            return (char) (c11 + ' ');
        }
        return c11;
    }

    private static int emitREBytecode(CompilerState compilerState, RECompiled rECompiled, int i11, RENode rENode) {
        int i12;
        byte[] bArr = rECompiled.program;
        while (rENode != null) {
            int i13 = i11 + 1;
            byte b11 = rENode.f78403op;
            bArr[i11] = b11;
            if (b11 != 1) {
                if (b11 != 22) {
                    if (b11 == 25) {
                        int i14 = rENode.min;
                        if (i14 == 0 && rENode.max == -1) {
                            bArr[i11] = rENode.greedy ? (byte) 26 : (byte) 45;
                        } else if (i14 == 0 && rENode.max == 1) {
                            bArr[i11] = rENode.greedy ? (byte) 28 : REOP_MINIMALOPT;
                        } else if (i14 == 1 && rENode.max == -1) {
                            bArr[i11] = rENode.greedy ? (byte) 27 : REOP_MINIMALPLUS;
                        } else {
                            if (!rENode.greedy) {
                                bArr[i11] = REOP_MINIMALQUANT;
                            }
                            i13 = addIndex(bArr, addIndex(bArr, i13, i14), rENode.max + 1);
                        }
                        int addIndex = addIndex(bArr, addIndex(bArr, i13, rENode.parenCount), rENode.parenIndex);
                        int emitREBytecode = emitREBytecode(compilerState, rECompiled, addIndex + 2, rENode.kid);
                        i12 = emitREBytecode + 1;
                        bArr[emitREBytecode] = REOP_ENDCHILD;
                        resolveForwardJump(bArr, addIndex, i12);
                    } else if (b11 != 29) {
                        if (b11 != 31) {
                            if (b11 == 13) {
                                i11 = addIndex(bArr, i13, rENode.parenIndex);
                            } else if (b11 == 14) {
                                if (rENode.flatIndex != -1) {
                                    while (true) {
                                        RENode rENode2 = rENode.next;
                                        if (rENode2 != null && rENode2.f78403op == 14) {
                                            int i15 = rENode.flatIndex;
                                            int i16 = rENode.length;
                                            if (i15 + i16 == rENode2.flatIndex) {
                                                rENode.length = i16 + rENode2.length;
                                                rENode.next = rENode2.next;
                                            }
                                        }
                                    }
                                }
                                int i17 = rENode.flatIndex;
                                if (i17 == -1 || rENode.length <= 1) {
                                    char c11 = rENode.chr;
                                    if (c11 < 256) {
                                        if ((compilerState.flags & 2) != 0) {
                                            bArr[i11] = 17;
                                        } else {
                                            bArr[i11] = 15;
                                        }
                                        i11 += 2;
                                        bArr[i13] = (byte) c11;
                                    } else {
                                        if ((compilerState.flags & 2) != 0) {
                                            bArr[i11] = 19;
                                        } else {
                                            bArr[i11] = 18;
                                        }
                                        i11 = addIndex(bArr, i13, c11);
                                    }
                                } else {
                                    if ((compilerState.flags & 2) != 0) {
                                        bArr[i11] = 16;
                                    } else {
                                        bArr[i11] = 14;
                                    }
                                    i11 = addIndex(bArr, addIndex(bArr, i13, i17), rENode.length);
                                }
                            } else if (b11 == 41) {
                                int emitREBytecode2 = emitREBytecode(compilerState, rECompiled, i11 + 3, rENode.kid);
                                i12 = emitREBytecode2 + 1;
                                bArr[emitREBytecode2] = REOP_ASSERTTEST;
                                resolveForwardJump(bArr, i13, i12);
                            } else if (b11 != 42) {
                                switch (b11) {
                                    case 53:
                                    case 54:
                                    case 55:
                                        boolean z11 = b11 == 54;
                                        char c12 = rENode.chr;
                                        if (z11) {
                                            c12 = upcase(c12);
                                        }
                                        addIndex(bArr, i13, c12);
                                        int i18 = i11 + 3;
                                        int i19 = rENode.index;
                                        if (z11) {
                                            i19 = upcase((char) i19);
                                        }
                                        addIndex(bArr, i18, i19);
                                        i13 = i11 + 5;
                                        break;
                                    default:
                                        i11 = i13;
                                        continue;
                                }
                            } else {
                                int emitREBytecode3 = emitREBytecode(compilerState, rECompiled, i11 + 3, rENode.kid);
                                i12 = emitREBytecode3 + 1;
                                bArr[emitREBytecode3] = REOP_ASSERTNOTTEST;
                                resolveForwardJump(bArr, i13, i12);
                            }
                        }
                        RENode rENode3 = rENode.kid2;
                        int emitREBytecode4 = emitREBytecode(compilerState, rECompiled, i13 + 2, rENode.kid);
                        int i21 = emitREBytecode4 + 1;
                        bArr[emitREBytecode4] = 32;
                        int i22 = emitREBytecode4 + 3;
                        resolveForwardJump(bArr, i13, i22);
                        int emitREBytecode5 = emitREBytecode(compilerState, rECompiled, i22, rENode3);
                        int i23 = emitREBytecode5 + 1;
                        bArr[emitREBytecode5] = 32;
                        i11 = emitREBytecode5 + 3;
                        resolveForwardJump(bArr, i21, i11);
                        resolveForwardJump(bArr, i23, i11);
                    } else {
                        int emitREBytecode6 = emitREBytecode(compilerState, rECompiled, addIndex(bArr, i13, rENode.parenIndex), rENode.kid);
                        bArr[emitREBytecode6] = 30;
                        i11 = addIndex(bArr, emitREBytecode6 + 1, rENode.parenIndex);
                    }
                    i11 = i12;
                } else {
                    if (!rENode.sense) {
                        bArr[i11] = c.A;
                    }
                    i11 = addIndex(bArr, i13, rENode.index);
                    rECompiled.classList[rENode.index] = new RECharSet(rENode.bmsize, rENode.startIndex, rENode.kidlen, rENode.sense);
                }
            }
            rENode = rENode.next;
        }
        return i11;
    }

    private static String escapeRegExp(Object obj) {
        String scriptRuntime = ScriptRuntime.toString(obj);
        StringBuilder sb2 = null;
        int i11 = 0;
        for (int indexOf = scriptRuntime.indexOf(47); indexOf > -1; indexOf = scriptRuntime.indexOf(47, indexOf + 1)) {
            if (indexOf == i11 || scriptRuntime.charAt(indexOf - 1) != '\\') {
                if (sb2 == null) {
                    sb2 = new StringBuilder();
                }
                sb2.append((CharSequence) scriptRuntime, i11, indexOf);
                sb2.append("\\/");
                i11 = indexOf + 1;
            }
        }
        if (sb2 == null) {
            return scriptRuntime;
        }
        sb2.append((CharSequence) scriptRuntime, i11, scriptRuntime.length());
        return sb2.toString();
    }

    private Object execSub(Context context, Scriptable scriptable, Object[] objArr, int i11) {
        String scriptRuntime;
        RegExpImpl impl = getImpl(context);
        if (objArr.length == 0) {
            scriptRuntime = impl.input;
            if (scriptRuntime == null) {
                reportError("msg.no.re.input.for", toString());
            }
        } else {
            scriptRuntime = ScriptRuntime.toString(objArr[0]);
        }
        String str = scriptRuntime;
        double d11 = 0.0d;
        double d12 = (this.f78398re.flags & 1) != 0 ? this.lastIndex : 0.0d;
        if (d12 < 0.0d || str.length() < d12) {
            this.lastIndex = 0.0d;
            return null;
        }
        int[] iArr = {(int) d12};
        Object executeRegExp = executeRegExp(context, scriptable, impl, str, iArr, i11);
        if ((this.f78398re.flags & 1) != 0) {
            if (executeRegExp != null && executeRegExp != Undefined.instance) {
                d11 = iArr[0];
            }
            this.lastIndex = d11;
        }
        return executeRegExp;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    private static boolean executeREBytecode(org.mozilla.javascript.regexp.REGlobalData r20, java.lang.String r21, int r22) {
        /*
            Method dump skipped, instructions count: 1190
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.regexp.NativeRegExp.executeREBytecode(org.mozilla.javascript.regexp.REGlobalData, java.lang.String, int):boolean");
    }

    private static boolean flatNIMatcher(REGlobalData rEGlobalData, int i11, int i12, String str, int i13) {
        if (rEGlobalData.f78402cp + i12 > i13) {
            return false;
        }
        char[] cArr = rEGlobalData.regexp.source;
        for (int i14 = 0; i14 < i12; i14++) {
            char c11 = cArr[i11 + i14];
            char charAt = str.charAt(rEGlobalData.f78402cp + i14);
            if (c11 != charAt && upcase(c11) != upcase(charAt)) {
                return false;
            }
        }
        rEGlobalData.f78402cp += i12;
        return true;
    }

    private static boolean flatNMatcher(REGlobalData rEGlobalData, int i11, int i12, String str, int i13) {
        if (rEGlobalData.f78402cp + i12 > i13) {
            return false;
        }
        for (int i14 = 0; i14 < i12; i14++) {
            if (rEGlobalData.regexp.source[i11 + i14] != str.charAt(rEGlobalData.f78402cp + i14)) {
                return false;
            }
        }
        rEGlobalData.f78402cp += i12;
        return true;
    }

    private static int getDecimalValue(char c11, CompilerState compilerState, int i11, String str) {
        int i12 = compilerState.f78396cp;
        char[] cArr = compilerState.cpbegin;
        int i13 = c11 - 48;
        boolean z11 = false;
        while (true) {
            int i14 = compilerState.f78396cp;
            if (i14 == compilerState.cpend) {
                break;
            }
            char c12 = cArr[i14];
            if (!isDigit(c12)) {
                break;
            }
            if (!z11) {
                int i15 = c12 - '0';
                if (i13 < (i11 - i15) / 10) {
                    i13 = (i13 * 10) + i15;
                } else {
                    i13 = i11;
                    z11 = true;
                }
            }
            compilerState.f78396cp++;
        }
        if (z11) {
            reportError(str, String.valueOf(cArr, i12, compilerState.f78396cp - i12));
        }
        return i13;
    }

    private static RegExpImpl getImpl(Context context) {
        return (RegExpImpl) ScriptRuntime.getRegExpProxy(context);
    }

    private static int getIndex(byte[] bArr, int i11) {
        return (bArr[i11 + 1] & 255) | ((bArr[i11] & 255) << 8);
    }

    private static int getOffset(byte[] bArr, int i11) {
        return getIndex(bArr, i11);
    }

    public static void init(Context context, Scriptable scriptable, boolean z11) {
        NativeRegExp nativeRegExp = new NativeRegExp();
        nativeRegExp.f78398re = compileRE(context, "", null, false);
        nativeRegExp.activatePrototypeMap(6);
        nativeRegExp.setParentScope(scriptable);
        nativeRegExp.setPrototype(ScriptableObject.getObjectPrototype(scriptable));
        NativeRegExpCtor nativeRegExpCtor = new NativeRegExpCtor();
        nativeRegExp.defineProperty("constructor", nativeRegExpCtor, 2);
        ScriptRuntime.setFunctionProtoAndParent(nativeRegExpCtor, scriptable);
        nativeRegExpCtor.setImmunePrototypeProperty(nativeRegExp);
        if (z11) {
            nativeRegExp.sealObject();
            nativeRegExpCtor.sealObject();
        }
        ScriptableObject.defineProperty(scriptable, "RegExp", nativeRegExpCtor, 2);
    }

    private static boolean isControlLetter(char c11) {
        if ('a' > c11 || c11 > 'z') {
            return 'A' <= c11 && c11 <= 'Z';
        }
        return true;
    }

    public static boolean isDigit(char c11) {
        return '0' <= c11 && c11 <= '9';
    }

    private static boolean isLineTerm(char c11) {
        return ScriptRuntime.isJSLineTerminator(c11);
    }

    private static boolean isREWhiteSpace(int i11) {
        return ScriptRuntime.isJSWhitespaceOrLineTerminator(i11);
    }

    private static boolean isWord(char c11) {
        if ('a' > c11 || c11 > 'z') {
            return ('A' <= c11 && c11 <= 'Z') || isDigit(c11) || c11 == '_';
        }
        return true;
    }

    private static boolean matchRegExp(REGlobalData rEGlobalData, RECompiled rECompiled, String str, int i11, int i12, boolean z11) {
        int i13 = rECompiled.parenCount;
        if (i13 != 0) {
            rEGlobalData.parens = new long[i13];
        } else {
            rEGlobalData.parens = null;
        }
        rEGlobalData.backTrackStackTop = null;
        rEGlobalData.stateStackTop = null;
        rEGlobalData.multiline = z11 || (rECompiled.flags & 4) != 0;
        rEGlobalData.regexp = rECompiled;
        int i14 = rECompiled.anchorCh;
        int i15 = i11;
        while (i15 <= i12) {
            if (i14 >= 0) {
                while (i15 != i12) {
                    char charAt = str.charAt(i15);
                    if (charAt != i14 && ((rEGlobalData.regexp.flags & 2) == 0 || upcase(charAt) != upcase((char) i14))) {
                        i15++;
                    }
                }
                return false;
            }
            rEGlobalData.f78402cp = i15;
            rEGlobalData.skipped = i15 - i11;
            for (int i16 = 0; i16 < rECompiled.parenCount; i16++) {
                rEGlobalData.parens[i16] = -1;
            }
            boolean executeREBytecode = executeREBytecode(rEGlobalData, str, i12);
            rEGlobalData.backTrackStackTop = null;
            rEGlobalData.stateStackTop = null;
            if (executeREBytecode) {
                return true;
            }
            if (i14 == -2 && !rEGlobalData.multiline) {
                rEGlobalData.skipped = i12;
                return false;
            }
            i15 = rEGlobalData.skipped + i11 + 1;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
    
        if (r1 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        r5.result = new org.mozilla.javascript.regexp.RENode((byte) 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
    
        r5.result = r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean parseAlternative(org.mozilla.javascript.regexp.CompilerState r5) {
        /*
            char[] r0 = r5.cpbegin
            r1 = 0
            r2 = r1
        L4:
            int r3 = r5.f78396cp
            int r4 = r5.cpend
            if (r3 == r4) goto L31
            char r3 = r0[r3]
            r4 = 124(0x7c, float:1.74E-43)
            if (r3 == r4) goto L31
            int r4 = r5.parenNesting
            if (r4 == 0) goto L19
            r4 = 41
            if (r3 != r4) goto L19
            goto L31
        L19:
            boolean r3 = parseTerm(r5)
            if (r3 != 0) goto L21
            r5 = 0
            return r5
        L21:
            if (r1 != 0) goto L27
            org.mozilla.javascript.regexp.RENode r1 = r5.result
            r2 = r1
            goto L2b
        L27:
            org.mozilla.javascript.regexp.RENode r3 = r5.result
            r2.next = r3
        L2b:
            org.mozilla.javascript.regexp.RENode r3 = r2.next
            if (r3 == 0) goto L4
            r2 = r3
            goto L2b
        L31:
            r0 = 1
            if (r1 != 0) goto L3c
            org.mozilla.javascript.regexp.RENode r1 = new org.mozilla.javascript.regexp.RENode
            r1.<init>(r0)
            r5.result = r1
            goto L3e
        L3c:
            r5.result = r1
        L3e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.regexp.NativeRegExp.parseAlternative(org.mozilla.javascript.regexp.CompilerState):boolean");
    }

    private static boolean parseDisjunction(CompilerState compilerState) {
        int i11;
        int i12;
        if (!parseAlternative(compilerState)) {
            return false;
        }
        char[] cArr = compilerState.cpbegin;
        int i13 = compilerState.f78396cp;
        if (i13 != cArr.length && cArr[i13] == '|') {
            compilerState.f78396cp = i13 + 1;
            RENode rENode = new RENode((byte) 31);
            rENode.kid = compilerState.result;
            if (!parseDisjunction(compilerState)) {
                return false;
            }
            RENode rENode2 = compilerState.result;
            rENode.kid2 = rENode2;
            compilerState.result = rENode;
            RENode rENode3 = rENode.kid;
            byte b11 = rENode3.f78403op;
            if (b11 == 14 && rENode2.f78403op == 14) {
                rENode.f78403op = (compilerState.flags & 2) == 0 ? REOP_ALTPREREQ : REOP_ALTPREREQi;
                rENode.chr = rENode3.chr;
                rENode.index = rENode2.chr;
                compilerState.progLength += 13;
            } else if (b11 == 22 && (i12 = rENode3.index) < 256 && rENode2.f78403op == 14 && (compilerState.flags & 2) == 0) {
                rENode.f78403op = REOP_ALTPREREQ2;
                rENode.chr = rENode2.chr;
                rENode.index = i12;
                compilerState.progLength += 13;
            } else if (b11 == 14 && rENode2.f78403op == 22 && (i11 = rENode2.index) < 256 && (compilerState.flags & 2) == 0) {
                rENode.f78403op = REOP_ALTPREREQ2;
                rENode.chr = rENode3.chr;
                rENode.index = i11;
                compilerState.progLength += 13;
            } else {
                compilerState.progLength += 9;
            }
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0169 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x03dd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0398  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean parseTerm(org.mozilla.javascript.regexp.CompilerState r21) {
        /*
            Method dump skipped, instructions count: 1112
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.regexp.NativeRegExp.parseTerm(org.mozilla.javascript.regexp.CompilerState):boolean");
    }

    private static REProgState popProgState(REGlobalData rEGlobalData) {
        REProgState rEProgState = rEGlobalData.stateStackTop;
        rEGlobalData.stateStackTop = rEProgState.previous;
        return rEProgState;
    }

    private static void processCharSet(REGlobalData rEGlobalData, RECharSet rECharSet) {
        synchronized (rECharSet) {
            try {
                if (!rECharSet.converted) {
                    processCharSetImpl(rEGlobalData, rECharSet);
                    rECharSet.converted = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:21:0x0051. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:22:0x0054. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:23:0x0057. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:89:0x008e A[LOOP:4: B:85:0x0077->B:89:0x008e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0089 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void processCharSetImpl(org.mozilla.javascript.regexp.REGlobalData r14, org.mozilla.javascript.regexp.RECharSet r15) {
        /*
            Method dump skipped, instructions count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.regexp.NativeRegExp.processCharSetImpl(org.mozilla.javascript.regexp.REGlobalData, org.mozilla.javascript.regexp.RECharSet):void");
    }

    private static void pushBackTrackState(REGlobalData rEGlobalData, byte b11, int i11) {
        REProgState rEProgState = rEGlobalData.stateStackTop;
        rEGlobalData.backTrackStackTop = new REBackTrackData(rEGlobalData, b11, i11, rEGlobalData.f78402cp, rEProgState.continuationOp, rEProgState.continuationPc);
    }

    private static void pushProgState(REGlobalData rEGlobalData, int i11, int i12, int i13, REBackTrackData rEBackTrackData, int i14, int i15) {
        rEGlobalData.stateStackTop = new REProgState(rEGlobalData.stateStackTop, i11, i12, i13, rEBackTrackData, i14, i15);
    }

    private static NativeRegExp realThis(Scriptable scriptable, IdFunctionObject idFunctionObject) {
        if (scriptable instanceof NativeRegExp) {
            return (NativeRegExp) scriptable;
        }
        throw IdScriptableObject.incompatibleCallError(idFunctionObject);
    }

    private static boolean reopIsSimple(int i11) {
        return i11 >= 1 && i11 <= 23;
    }

    private static void reportError(String str, String str2) {
        throw ScriptRuntime.constructError("SyntaxError", ScriptRuntime.getMessage1(str, str2));
    }

    private static void reportWarning(Context context, String str, String str2) {
        if (context.hasFeature(11)) {
            Context.reportWarning(ScriptRuntime.getMessage1(str, str2));
        }
    }

    private static void resolveForwardJump(byte[] bArr, int i11, int i12) {
        if (i11 > i12) {
            throw Kit.codeBug();
        }
        addIndex(bArr, i11, i12 - i11);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0178, code lost:
    
        if (isWord(r4.charAt(r6)) != false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x019c, code lost:
    
        if (isWord(r4.charAt(r6)) != false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01ad, code lost:
    
        if (isLineTerm(r4.charAt(r0)) == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01c0, code lost:
    
        if (isLineTerm(r4.charAt(r0 - 1)) == false) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int simpleMatch(org.mozilla.javascript.regexp.REGlobalData r3, java.lang.String r4, int r5, byte[] r6, int r7, int r8, boolean r9) {
        /*
            Method dump skipped, instructions count: 514
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.regexp.NativeRegExp.simpleMatch(org.mozilla.javascript.regexp.REGlobalData, java.lang.String, int, byte[], int, int, boolean):int");
    }

    private static int toASCIIHexDigit(int i11) {
        if (i11 < 48) {
            return -1;
        }
        if (i11 <= 57) {
            return i11 - 48;
        }
        int i12 = i11 | 32;
        if (97 > i12 || i12 > 102) {
            return -1;
        }
        return i12 - 87;
    }

    private static char upcase(char c11) {
        if (c11 >= 128) {
            char upperCase = Character.toUpperCase(c11);
            if (upperCase >= 128) {
                return upperCase;
            }
        } else if ('a' <= c11 && c11 <= 'z') {
            return (char) (c11 - ' ');
        }
        return c11;
    }

    @Override // org.mozilla.javascript.Function, org.mozilla.javascript.Callable
    public Object call(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return execSub(context, scriptable, objArr, 1);
    }

    public Scriptable compile(Context context, Scriptable scriptable, Object[] objArr) {
        Object obj;
        if (objArr.length > 0) {
            Object obj2 = objArr[0];
            if (obj2 instanceof NativeRegExp) {
                if (objArr.length > 1 && objArr[1] != Undefined.instance) {
                    throw ScriptRuntime.typeError0("msg.bad.regexp.compile");
                }
                NativeRegExp nativeRegExp = (NativeRegExp) obj2;
                this.f78398re = nativeRegExp.f78398re;
                this.lastIndex = nativeRegExp.lastIndex;
                return this;
            }
        }
        this.f78398re = compileRE(context, objArr.length == 0 ? "" : escapeRegExp(objArr[0]), (objArr.length <= 1 || (obj = objArr[1]) == Undefined.instance) ? null : ScriptRuntime.toString(obj), false);
        this.lastIndex = 0.0d;
        return this;
    }

    @Override // org.mozilla.javascript.Function
    public Scriptable construct(Context context, Scriptable scriptable, Object[] objArr) {
        return (Scriptable) execSub(context, scriptable, objArr, 1);
    }

    @Override // org.mozilla.javascript.IdScriptableObject, org.mozilla.javascript.IdFunctionCall
    public Object execIdCall(IdFunctionObject idFunctionObject, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        if (!idFunctionObject.hasTag(REGEXP_TAG)) {
            return super.execIdCall(idFunctionObject, context, scriptable, scriptable2, objArr);
        }
        int methodId = idFunctionObject.methodId();
        switch (methodId) {
            case 1:
                return realThis(scriptable2, idFunctionObject).compile(context, scriptable, objArr);
            case 2:
            case 3:
                return realThis(scriptable2, idFunctionObject).toString();
            case 4:
                return realThis(scriptable2, idFunctionObject).execSub(context, scriptable, objArr, 1);
            case 5:
                Object execSub = realThis(scriptable2, idFunctionObject).execSub(context, scriptable, objArr, 0);
                Boolean bool = Boolean.TRUE;
                return bool.equals(execSub) ? bool : Boolean.FALSE;
            case 6:
                return realThis(scriptable2, idFunctionObject).execSub(context, scriptable, objArr, 2);
            default:
                throw new IllegalArgumentException(String.valueOf(methodId));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Boolean] */
    public Object executeRegExp(Context context, Scriptable scriptable, RegExpImpl regExpImpl, String str, int[] iArr, int i11) {
        Context context2;
        Scriptable newArray;
        Scriptable scriptable2;
        NativeRegExp nativeRegExp = this;
        REGlobalData rEGlobalData = new REGlobalData();
        int i12 = iArr[0];
        int length = str.length();
        int i13 = i12 > length ? length : i12;
        SubString subString = null;
        if (!matchRegExp(rEGlobalData, nativeRegExp.f78398re, str, i13, length, regExpImpl.multiline)) {
            if (i11 != 2) {
                return null;
            }
            return Undefined.instance;
        }
        int i14 = rEGlobalData.f78402cp;
        iArr[0] = i14;
        int i15 = i14 - (rEGlobalData.skipped + i13);
        int i16 = i14 - i15;
        if (i11 == 0) {
            scriptable2 = null;
            newArray = Boolean.TRUE;
            context2 = context;
        } else {
            context2 = context;
            newArray = context2.newArray(scriptable, 0);
            newArray.put(0, newArray, str.substring(i16, i16 + i15));
            scriptable2 = newArray;
        }
        int i17 = nativeRegExp.f78398re.parenCount;
        if (i17 == 0) {
            regExpImpl.parens = null;
            regExpImpl.lastParen = SubString.emptySubString;
        } else {
            regExpImpl.parens = new SubString[i17];
            int i18 = 0;
            while (i18 < nativeRegExp.f78398re.parenCount) {
                int parensIndex = rEGlobalData.parensIndex(i18);
                if (parensIndex != -1) {
                    subString = new SubString(str, parensIndex, rEGlobalData.parensLength(i18));
                    regExpImpl.parens[i18] = subString;
                    if (i11 != 0) {
                        scriptable2.put(i18 + 1, scriptable2, subString.toString());
                    }
                } else if (i11 != 0) {
                    scriptable2.put(i18 + 1, scriptable2, Undefined.instance);
                }
                i18++;
                nativeRegExp = this;
            }
            regExpImpl.lastParen = subString;
        }
        if (i11 != 0) {
            scriptable2.put("index", scriptable2, Integer.valueOf(rEGlobalData.skipped + i13));
            scriptable2.put("input", scriptable2, str);
        }
        if (regExpImpl.lastMatch == null) {
            regExpImpl.lastMatch = new SubString();
            regExpImpl.leftContext = new SubString();
            regExpImpl.rightContext = new SubString();
        }
        SubString subString2 = regExpImpl.lastMatch;
        subString2.str = str;
        subString2.index = i16;
        subString2.length = i15;
        regExpImpl.leftContext.str = str;
        if (context2.getLanguageVersion() == 120) {
            SubString subString3 = regExpImpl.leftContext;
            subString3.index = i13;
            subString3.length = rEGlobalData.skipped;
        } else {
            SubString subString4 = regExpImpl.leftContext;
            subString4.index = 0;
            subString4.length = i13 + rEGlobalData.skipped;
        }
        SubString subString5 = regExpImpl.rightContext;
        subString5.str = str;
        subString5.index = i14;
        subString5.length = length - i14;
        return newArray;
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public int findInstanceIdInfo(String str) {
        String str2;
        int i11;
        int length = str.length();
        int i12 = 6;
        if (length == 6) {
            char charAt = str.charAt(0);
            if (charAt == 'g') {
                str2 = "global";
                i11 = 3;
            } else {
                if (charAt == 's') {
                    str2 = "source";
                    i11 = 2;
                }
                str2 = null;
                i11 = 0;
            }
        } else if (length == 9) {
            char charAt2 = str.charAt(0);
            if (charAt2 == 'l') {
                str2 = "lastIndex";
                i11 = 1;
            } else {
                if (charAt2 == 'm') {
                    str2 = "multiline";
                    i11 = 5;
                }
                str2 = null;
                i11 = 0;
            }
        } else {
            if (length == 10) {
                str2 = "ignoreCase";
                i11 = 4;
            }
            str2 = null;
            i11 = 0;
        }
        int i13 = (str2 == null || str2 == str || str2.equals(str)) ? i11 : 0;
        if (i13 == 0) {
            return super.findInstanceIdInfo(str);
        }
        if (i13 != 1) {
            if (i13 != 2 && i13 != 3 && i13 != 4 && i13 != 5) {
                throw new IllegalStateException();
            }
            i12 = 7;
        }
        return IdScriptableObject.instanceIdInfo(i12, i13);
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public int findPrototypeId(String str) {
        String str2;
        int length = str.length();
        int i11 = 4;
        if (length != 4) {
            i11 = 6;
            if (length == 6) {
                str2 = "prefix";
            } else if (length != 7) {
                if (length == 8) {
                    i11 = 3;
                    char charAt = str.charAt(3);
                    if (charAt == 'o') {
                        str2 = "toSource";
                    } else if (charAt == 't') {
                        str2 = "toString";
                        i11 = 2;
                    }
                }
                str2 = null;
                i11 = 0;
            } else {
                str2 = "compile";
                i11 = 1;
            }
        } else {
            char charAt2 = str.charAt(0);
            if (charAt2 == 'e') {
                str2 = "exec";
            } else {
                if (charAt2 == 't') {
                    str2 = "test";
                    i11 = 5;
                }
                str2 = null;
                i11 = 0;
            }
        }
        if (str2 == null || str2 == str || str2.equals(str)) {
            return i11;
        }
        return 0;
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public String getClassName() {
        return "RegExp";
    }

    public int getFlags() {
        return this.f78398re.flags;
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public String getInstanceIdName(int i11) {
        return i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? i11 != 5 ? super.getInstanceIdName(i11) : "multiline" : "ignoreCase" : "global" : "source" : "lastIndex";
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public Object getInstanceIdValue(int i11) {
        if (i11 == 1) {
            return ScriptRuntime.wrapNumber(this.lastIndex);
        }
        if (i11 == 2) {
            return new String(this.f78398re.source);
        }
        if (i11 == 3) {
            return ScriptRuntime.wrapBoolean((this.f78398re.flags & 1) != 0);
        }
        if (i11 == 4) {
            return ScriptRuntime.wrapBoolean((this.f78398re.flags & 2) != 0);
        }
        if (i11 != 5) {
            return super.getInstanceIdValue(i11);
        }
        return ScriptRuntime.wrapBoolean((this.f78398re.flags & 4) != 0);
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public int getMaxInstanceId() {
        return 5;
    }

    @Override // org.mozilla.javascript.ScriptableObject
    public String getTypeOf() {
        return "object";
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public void initPrototypeId(int i11) {
        String str;
        String str2;
        int i12 = 1;
        switch (i11) {
            case 1:
                str = "compile";
                initPrototypeMethod(REGEXP_TAG, i11, str, i12);
                return;
            case 2:
                str2 = "toString";
                String str3 = str2;
                i12 = 0;
                str = str3;
                initPrototypeMethod(REGEXP_TAG, i11, str, i12);
                return;
            case 3:
                str2 = "toSource";
                String str32 = str2;
                i12 = 0;
                str = str32;
                initPrototypeMethod(REGEXP_TAG, i11, str, i12);
                return;
            case 4:
                str = "exec";
                initPrototypeMethod(REGEXP_TAG, i11, str, i12);
                return;
            case 5:
                str = "test";
                initPrototypeMethod(REGEXP_TAG, i11, str, i12);
                return;
            case 6:
                str = "prefix";
                initPrototypeMethod(REGEXP_TAG, i11, str, i12);
                return;
            default:
                throw new IllegalArgumentException(String.valueOf(i11));
        }
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public void setInstanceIdValue(int i11, Object obj) {
        if (i11 == 1) {
            this.lastIndex = ScriptRuntime.toNumber(obj);
        } else {
            if (i11 == 2 || i11 == 3 || i11 == 4 || i11 == 5) {
                return;
            }
            super.setInstanceIdValue(i11, obj);
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('/');
        char[] cArr = this.f78398re.source;
        if (cArr.length != 0) {
            sb2.append(cArr);
        } else {
            sb2.append("(?:)");
        }
        sb2.append('/');
        if ((this.f78398re.flags & 1) != 0) {
            sb2.append('g');
        }
        if ((this.f78398re.flags & 2) != 0) {
            sb2.append('i');
        }
        if ((this.f78398re.flags & 4) != 0) {
            sb2.append(b.f61998d);
        }
        return sb2.toString();
    }

    private static void pushBackTrackState(REGlobalData rEGlobalData, byte b11, int i11, int i12, int i13, int i14) {
        rEGlobalData.backTrackStackTop = new REBackTrackData(rEGlobalData, b11, i11, i12, i13, i14);
    }

    public NativeRegExp() {
    }
}

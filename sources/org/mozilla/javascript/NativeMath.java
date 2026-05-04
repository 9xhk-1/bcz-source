package org.mozilla.javascript;

import androidx.exifinterface.media.ExifInterface;
import com.baicizhan.main.activity.ShowOffActivity;
import w9.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
final class NativeMath extends IdScriptableObject {
    private static final int Id_E = 20;
    private static final int Id_LN10 = 22;
    private static final int Id_LN2 = 23;
    private static final int Id_LOG10E = 25;
    private static final int Id_LOG2E = 24;
    private static final int Id_PI = 21;
    private static final int Id_SQRT1_2 = 26;
    private static final int Id_SQRT2 = 27;
    private static final int Id_abs = 2;
    private static final int Id_acos = 3;
    private static final int Id_asin = 4;
    private static final int Id_atan = 5;
    private static final int Id_atan2 = 6;
    private static final int Id_ceil = 7;
    private static final int Id_cos = 8;
    private static final int Id_exp = 9;
    private static final int Id_floor = 10;
    private static final int Id_log = 11;
    private static final int Id_max = 12;
    private static final int Id_min = 13;
    private static final int Id_pow = 14;
    private static final int Id_random = 15;
    private static final int Id_round = 16;
    private static final int Id_sin = 17;
    private static final int Id_sqrt = 18;
    private static final int Id_tan = 19;
    private static final int Id_toSource = 1;
    private static final int LAST_METHOD_ID = 19;
    private static final Object MATH_TAG = "Math";
    private static final int MAX_ID = 27;
    static final long serialVersionUID = -8838847185801131569L;

    private NativeMath() {
    }

    public static void init(Scriptable scriptable, boolean z11) {
        NativeMath nativeMath = new NativeMath();
        nativeMath.activatePrototypeMap(27);
        nativeMath.setPrototype(ScriptableObject.getObjectPrototype(scriptable));
        nativeMath.setParentScope(scriptable);
        if (z11) {
            nativeMath.sealObject();
        }
        ScriptableObject.defineProperty(scriptable, "Math", nativeMath, 2);
    }

    private double js_pow(double d11, double d12) {
        if (d12 != d12) {
            return d12;
        }
        if (d12 == 0.0d) {
            return 1.0d;
        }
        if (d11 == 0.0d) {
            if (1.0d / d11 > 0.0d) {
                return d12 > 0.0d ? 0.0d : Double.POSITIVE_INFINITY;
            }
            long j11 = (long) d12;
            return (((double) j11) != d12 || (j11 & 1) == 0) ? d12 > 0.0d ? 0.0d : Double.POSITIVE_INFINITY : d12 > 0.0d ? -0.0d : Double.NEGATIVE_INFINITY;
        }
        double pow = Math.pow(d11, d12);
        if (pow != pow) {
            if (d12 == Double.POSITIVE_INFINITY) {
                if (d11 < -1.0d || 1.0d < d11) {
                    return Double.POSITIVE_INFINITY;
                }
                if (-1.0d < d11 && d11 < 1.0d) {
                    return 0.0d;
                }
            } else if (d12 == Double.NEGATIVE_INFINITY) {
                if (d11 < -1.0d || 1.0d < d11) {
                    return 0.0d;
                }
                if (-1.0d < d11 && d11 < 1.0d) {
                    return Double.POSITIVE_INFINITY;
                }
            } else {
                if (d11 == Double.POSITIVE_INFINITY) {
                    return d12 > 0.0d ? Double.POSITIVE_INFINITY : 0.0d;
                }
                if (d11 == Double.NEGATIVE_INFINITY) {
                    long j12 = (long) d12;
                    return (((double) j12) != d12 || (j12 & 1) == 0) ? d12 > 0.0d ? Double.POSITIVE_INFINITY : 0.0d : d12 > 0.0d ? Double.NEGATIVE_INFINITY : -0.0d;
                }
            }
        }
        return pow;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0079, code lost:
    
        if (r0 != 0.0d) goto L33;
     */
    @Override // org.mozilla.javascript.IdScriptableObject, org.mozilla.javascript.IdFunctionCall
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object execIdCall(org.mozilla.javascript.IdFunctionObject r9, org.mozilla.javascript.Context r10, org.mozilla.javascript.Scriptable r11, org.mozilla.javascript.Scriptable r12, java.lang.Object[] r13) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.NativeMath.execIdCall(org.mozilla.javascript.IdFunctionObject, org.mozilla.javascript.Context, org.mozilla.javascript.Scriptable, org.mozilla.javascript.Scriptable, java.lang.Object[]):java.lang.Object");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:5:0x017f A[ADDED_TO_REGION] */
    @Override // org.mozilla.javascript.IdScriptableObject
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int findPrototypeId(java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.NativeMath.findPrototypeId(java.lang.String):int");
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public String getClassName() {
        return "Math";
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public void initPrototypeId(int i11) {
        double d11;
        String str;
        String str2;
        String str3;
        if (i11 > 19) {
            switch (i11) {
                case 20:
                    d11 = 2.718281828459045d;
                    str = ExifInterface.LONGITUDE_EAST;
                    break;
                case 21:
                    d11 = 3.141592653589793d;
                    str = "PI";
                    break;
                case 22:
                    d11 = 2.302585092994046d;
                    str = "LN10";
                    break;
                case 23:
                    d11 = 0.6931471805599453d;
                    str = "LN2";
                    break;
                case 24:
                    d11 = 1.4426950408889634d;
                    str = "LOG2E";
                    break;
                case 25:
                    d11 = 0.4342944819032518d;
                    str = "LOG10E";
                    break;
                case 26:
                    d11 = 0.7071067811865476d;
                    str = "SQRT1_2";
                    break;
                case 27:
                    d11 = 1.4142135623730951d;
                    str = "SQRT2";
                    break;
                default:
                    throw new IllegalStateException(String.valueOf(i11));
            }
            initPrototypeValue(i11, str, ScriptRuntime.wrapNumber(d11), 7);
            return;
        }
        int i12 = 1;
        switch (i11) {
            case 1:
                str2 = "toSource";
                i12 = 0;
                str3 = str2;
                initPrototypeMethod(MATH_TAG, i11, str3, i12);
                return;
            case 2:
                str3 = "abs";
                initPrototypeMethod(MATH_TAG, i11, str3, i12);
                return;
            case 3:
                str3 = "acos";
                initPrototypeMethod(MATH_TAG, i11, str3, i12);
                return;
            case 4:
                str3 = "asin";
                initPrototypeMethod(MATH_TAG, i11, str3, i12);
                return;
            case 5:
                str3 = "atan";
                initPrototypeMethod(MATH_TAG, i11, str3, i12);
                return;
            case 6:
                str3 = "atan2";
                i12 = 2;
                initPrototypeMethod(MATH_TAG, i11, str3, i12);
                return;
            case 7:
                str3 = "ceil";
                initPrototypeMethod(MATH_TAG, i11, str3, i12);
                return;
            case 8:
                str3 = "cos";
                initPrototypeMethod(MATH_TAG, i11, str3, i12);
                return;
            case 9:
                str3 = i.f96007a;
                initPrototypeMethod(MATH_TAG, i11, str3, i12);
                return;
            case 10:
                str3 = "floor";
                initPrototypeMethod(MATH_TAG, i11, str3, i12);
                return;
            case 11:
                str3 = "log";
                initPrototypeMethod(MATH_TAG, i11, str3, i12);
                return;
            case 12:
                str3 = "max";
                i12 = 2;
                initPrototypeMethod(MATH_TAG, i11, str3, i12);
                return;
            case 13:
                str3 = "min";
                i12 = 2;
                initPrototypeMethod(MATH_TAG, i11, str3, i12);
                return;
            case 14:
                str3 = "pow";
                i12 = 2;
                initPrototypeMethod(MATH_TAG, i11, str3, i12);
                return;
            case 15:
                str2 = "random";
                i12 = 0;
                str3 = str2;
                initPrototypeMethod(MATH_TAG, i11, str3, i12);
                return;
            case 16:
                str3 = ShowOffActivity.f18169n;
                initPrototypeMethod(MATH_TAG, i11, str3, i12);
                return;
            case 17:
                str3 = "sin";
                initPrototypeMethod(MATH_TAG, i11, str3, i12);
                return;
            case 18:
                str3 = "sqrt";
                initPrototypeMethod(MATH_TAG, i11, str3, i12);
                return;
            case 19:
                str3 = "tan";
                initPrototypeMethod(MATH_TAG, i11, str3, i12);
                return;
            default:
                throw new IllegalStateException(String.valueOf(i11));
        }
    }
}

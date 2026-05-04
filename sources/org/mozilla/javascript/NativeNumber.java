package org.mozilla.javascript;

import dp.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
final class NativeNumber extends IdScriptableObject {
    private static final int Id_constructor = 1;
    private static final int Id_toExponential = 7;
    private static final int Id_toFixed = 6;
    private static final int Id_toLocaleString = 3;
    private static final int Id_toPrecision = 8;
    private static final int Id_toSource = 4;
    private static final int Id_toString = 2;
    private static final int Id_valueOf = 5;
    private static final int MAX_PRECISION = 100;
    private static final int MAX_PROTOTYPE_ID = 8;
    private static final Object NUMBER_TAG = "Number";
    static final long serialVersionUID = 3504516769741512101L;
    private double doubleValue;

    public NativeNumber(double d11) {
        this.doubleValue = d11;
    }

    public static void init(Scriptable scriptable, boolean z11) {
        new NativeNumber(0.0d).exportAsJSClass(8, scriptable, z11);
    }

    private static String num_to(double d11, Object[] objArr, int i11, int i12, int i13, int i14) {
        int i15 = 0;
        if (objArr.length != 0) {
            int int32 = ScriptRuntime.toInt32(objArr[0]);
            if (int32 < i13 || int32 > 100) {
                throw ScriptRuntime.constructError("RangeError", ScriptRuntime.getMessage1("msg.bad.precision", ScriptRuntime.toString(objArr[0])));
            }
            i15 = int32;
            i11 = i12;
        }
        StringBuilder sb2 = new StringBuilder();
        DToA.JS_dtostr(sb2, i11, i15 + i14, d11);
        return sb2.toString();
    }

    @Override // org.mozilla.javascript.IdScriptableObject, org.mozilla.javascript.IdFunctionCall
    public Object execIdCall(IdFunctionObject idFunctionObject, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Object obj;
        if (!idFunctionObject.hasTag(NUMBER_TAG)) {
            return super.execIdCall(idFunctionObject, context, scriptable, scriptable2, objArr);
        }
        int methodId = idFunctionObject.methodId();
        if (methodId == 1) {
            double number = objArr.length >= 1 ? ScriptRuntime.toNumber(objArr[0]) : 0.0d;
            return scriptable2 == null ? new NativeNumber(number) : ScriptRuntime.wrapNumber(number);
        }
        if (!(scriptable2 instanceof NativeNumber)) {
            throw IdScriptableObject.incompatibleCallError(idFunctionObject);
        }
        double d11 = ((NativeNumber) scriptable2).doubleValue;
        int i11 = 10;
        switch (methodId) {
            case 2:
            case 3:
                if (objArr.length != 0 && (obj = objArr[0]) != Undefined.instance) {
                    i11 = ScriptRuntime.toInt32(obj);
                }
                return ScriptRuntime.numberToString(d11, i11);
            case 4:
                return "(new Number(" + ScriptRuntime.toString(d11) + a.f48058d;
            case 5:
                return ScriptRuntime.wrapNumber(d11);
            case 6:
                return num_to(d11, objArr, 2, 2, -20, 0);
            case 7:
                return Double.isNaN(d11) ? "NaN" : Double.isInfinite(d11) ? d11 >= 0.0d ? "Infinity" : "-Infinity" : num_to(d11, objArr, 1, 3, 0, 1);
            case 8:
                return (objArr.length == 0 || objArr[0] == Undefined.instance) ? ScriptRuntime.numberToString(d11, 10) : Double.isNaN(d11) ? "NaN" : Double.isInfinite(d11) ? d11 >= 0.0d ? "Infinity" : "-Infinity" : num_to(d11, objArr, 0, 4, 1, 0);
            default:
                throw new IllegalArgumentException(String.valueOf(methodId));
        }
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public void fillConstructorProperties(IdFunctionObject idFunctionObject) {
        idFunctionObject.defineProperty("NaN", ScriptRuntime.NaNobj, 7);
        idFunctionObject.defineProperty("POSITIVE_INFINITY", ScriptRuntime.wrapNumber(Double.POSITIVE_INFINITY), 7);
        idFunctionObject.defineProperty("NEGATIVE_INFINITY", ScriptRuntime.wrapNumber(Double.NEGATIVE_INFINITY), 7);
        idFunctionObject.defineProperty("MAX_VALUE", ScriptRuntime.wrapNumber(Double.MAX_VALUE), 7);
        idFunctionObject.defineProperty("MIN_VALUE", ScriptRuntime.wrapNumber(Double.MIN_VALUE), 7);
        super.fillConstructorProperties(idFunctionObject);
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public int findPrototypeId(String str) {
        String str2;
        int length = str.length();
        int i11 = 7;
        if (length == 7) {
            char charAt = str.charAt(0);
            if (charAt == 't') {
                str2 = "toFixed";
                i11 = 6;
            } else {
                if (charAt == 'v') {
                    str2 = "valueOf";
                    i11 = 5;
                }
                str2 = null;
                i11 = 0;
            }
        } else if (length == 8) {
            char charAt2 = str.charAt(3);
            if (charAt2 == 'o') {
                str2 = "toSource";
                i11 = 4;
            } else {
                if (charAt2 == 't') {
                    str2 = "toString";
                    i11 = 2;
                }
                str2 = null;
                i11 = 0;
            }
        } else if (length == 11) {
            char charAt3 = str.charAt(0);
            if (charAt3 == 'c') {
                str2 = "constructor";
                i11 = 1;
            } else {
                if (charAt3 == 't') {
                    str2 = "toPrecision";
                    i11 = 8;
                }
                str2 = null;
                i11 = 0;
            }
        } else if (length != 13) {
            if (length == 14) {
                str2 = "toLocaleString";
                i11 = 3;
            }
            str2 = null;
            i11 = 0;
        } else {
            str2 = "toExponential";
        }
        if (str2 == null || str2 == str || str2.equals(str)) {
            return i11;
        }
        return 0;
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public String getClassName() {
        return "Number";
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public void initPrototypeId(int i11) {
        String str;
        String str2;
        int i12 = 1;
        switch (i11) {
            case 1:
                str = "constructor";
                initPrototypeMethod(NUMBER_TAG, i11, str, i12);
                return;
            case 2:
                str = "toString";
                initPrototypeMethod(NUMBER_TAG, i11, str, i12);
                return;
            case 3:
                str = "toLocaleString";
                initPrototypeMethod(NUMBER_TAG, i11, str, i12);
                return;
            case 4:
                str2 = "toSource";
                String str3 = str2;
                i12 = 0;
                str = str3;
                initPrototypeMethod(NUMBER_TAG, i11, str, i12);
                return;
            case 5:
                str2 = "valueOf";
                String str32 = str2;
                i12 = 0;
                str = str32;
                initPrototypeMethod(NUMBER_TAG, i11, str, i12);
                return;
            case 6:
                str = "toFixed";
                initPrototypeMethod(NUMBER_TAG, i11, str, i12);
                return;
            case 7:
                str = "toExponential";
                initPrototypeMethod(NUMBER_TAG, i11, str, i12);
                return;
            case 8:
                str = "toPrecision";
                initPrototypeMethod(NUMBER_TAG, i11, str, i12);
                return;
            default:
                throw new IllegalArgumentException(String.valueOf(i11));
        }
    }

    public String toString() {
        return ScriptRuntime.numberToString(this.doubleValue, 10);
    }
}

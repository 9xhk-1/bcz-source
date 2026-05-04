package org.mozilla.javascript;

import com.alipay.sdk.m.n.a;
import java.io.Serializable;
import org.mozilla.javascript.xml.XMLLib;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class NativeGlobal implements Serializable, IdFunctionCall {
    private static final Object FTAG = "Global";
    private static final int INVALID_UTF8 = Integer.MAX_VALUE;
    private static final int Id_decodeURI = 1;
    private static final int Id_decodeURIComponent = 2;
    private static final int Id_encodeURI = 3;
    private static final int Id_encodeURIComponent = 4;
    private static final int Id_escape = 5;
    private static final int Id_eval = 6;
    private static final int Id_isFinite = 7;
    private static final int Id_isNaN = 8;
    private static final int Id_isXMLName = 9;
    private static final int Id_new_CommonError = 14;
    private static final int Id_parseFloat = 10;
    private static final int Id_parseInt = 11;
    private static final int Id_unescape = 12;
    private static final int Id_uneval = 13;
    private static final int LAST_SCOPE_FUNCTION_ID = 13;
    private static final String URI_DECODE_RESERVED = ";/?:@&=+$,#";
    static final long serialVersionUID = 6080442165748707530L;

    public static EcmaError constructError(Context context, String str, String str2, Scriptable scriptable) {
        return ScriptRuntime.constructError(str, str2);
    }

    private static String decode(String str, boolean z11) {
        int i11;
        int i12;
        char c11;
        int length = str.length();
        char[] cArr = null;
        int i13 = 0;
        int i14 = 0;
        while (i13 != length) {
            char charAt = str.charAt(i13);
            if (charAt != '%') {
                if (cArr != null) {
                    cArr[i14] = charAt;
                    i14++;
                }
                i13++;
            } else {
                if (cArr == null) {
                    cArr = new char[length];
                    str.getChars(0, i13, cArr, 0);
                    i14 = i13;
                }
                int i15 = i13 + 3;
                if (i15 > length) {
                    throw uriError();
                }
                int unHex = unHex(str.charAt(i13 + 1), str.charAt(i13 + 2));
                if (unHex < 0) {
                    throw uriError();
                }
                if ((unHex & 128) != 0) {
                    if ((unHex & 192) == 128) {
                        throw uriError();
                    }
                    if ((unHex & 32) == 0) {
                        unHex &= 31;
                        i11 = 1;
                        i12 = 128;
                    } else if ((unHex & 16) == 0) {
                        unHex &= 15;
                        i11 = 2;
                        i12 = 2048;
                    } else if ((unHex & 8) == 0) {
                        unHex &= 7;
                        i11 = 3;
                        i12 = 65536;
                    } else if ((unHex & 4) == 0) {
                        unHex &= 3;
                        i11 = 4;
                        i12 = 2097152;
                    } else {
                        if ((unHex & 2) != 0) {
                            throw uriError();
                        }
                        unHex &= 1;
                        i11 = 5;
                        i12 = 67108864;
                    }
                    if ((i11 * 3) + i15 > length) {
                        throw uriError();
                    }
                    for (int i16 = 0; i16 != i11; i16++) {
                        if (str.charAt(i15) != '%') {
                            throw uriError();
                        }
                        int unHex2 = unHex(str.charAt(i15 + 1), str.charAt(i15 + 2));
                        if (unHex2 < 0 || (unHex2 & 192) != 128) {
                            throw uriError();
                        }
                        unHex = (unHex << 6) | (unHex2 & 63);
                        i15 += 3;
                    }
                    if (unHex < i12 || (unHex >= 55296 && unHex <= 57343)) {
                        unHex = Integer.MAX_VALUE;
                    } else if (unHex == 65534 || unHex == 65535) {
                        unHex = 65533;
                    }
                    if (unHex >= 65536) {
                        int i17 = unHex - 65536;
                        if (i17 > 1048575) {
                            throw uriError();
                        }
                        cArr[i14] = (char) ((i17 >>> 10) + 55296);
                        c11 = (char) ((i17 & 1023) + 56320);
                        i14++;
                        if (z11 || URI_DECODE_RESERVED.indexOf(c11) < 0) {
                            cArr[i14] = c11;
                            i14++;
                        } else {
                            while (i13 != i15) {
                                cArr[i14] = str.charAt(i13);
                                i13++;
                                i14++;
                            }
                        }
                        i13 = i15;
                    }
                }
                c11 = (char) unHex;
                if (z11) {
                }
                cArr[i14] = c11;
                i14++;
                i13 = i15;
            }
        }
        return cArr == null ? str : new String(cArr, 0, i14);
    }

    private static String encode(String str, boolean z11) {
        int length = str.length();
        StringBuffer stringBuffer = null;
        byte[] bArr = null;
        int i11 = 0;
        while (i11 != length) {
            char charAt = str.charAt(i11);
            stringBuffer = stringBuffer;
            if (!encodeUnescaped(charAt, z11)) {
                if (stringBuffer == null) {
                    StringBuffer stringBuffer2 = new StringBuffer(length + 3);
                    stringBuffer2.append(str);
                    stringBuffer2.setLength(i11);
                    bArr = new byte[6];
                    stringBuffer = stringBuffer2;
                }
                if (56320 <= charAt && charAt <= 57343) {
                    throw uriError();
                }
                int i12 = charAt;
                if (charAt >= 55296) {
                    i12 = charAt;
                    if (56319 >= charAt) {
                        i11++;
                        if (i11 == length) {
                            throw uriError();
                        }
                        int charAt2 = str.charAt(i11);
                        if (56320 > charAt2 || charAt2 > 57343) {
                            throw uriError();
                        }
                        i12 = ((charAt - 55296) << 10) + (charAt2 - 56320) + 65536;
                    }
                }
                int oneUcs4ToUtf8Char = oneUcs4ToUtf8Char(bArr, i12);
                for (int i13 = 0; i13 < oneUcs4ToUtf8Char; i13++) {
                    byte b11 = bArr[i13];
                    stringBuffer.append('%');
                    stringBuffer.append(toHexChar((b11 & 255) >>> 4));
                    stringBuffer.append(toHexChar(b11 & 15));
                }
            } else if (stringBuffer != null) {
                stringBuffer.append(charAt);
            }
            i11++;
            stringBuffer = stringBuffer;
        }
        return stringBuffer == null ? str : stringBuffer.toString();
    }

    private static boolean encodeUnescaped(char c11, boolean z11) {
        if (('A' > c11 || c11 > 'Z') && (('a' > c11 || c11 > 'z') && (('0' > c11 || c11 > '9') && "-_.!~*'()".indexOf(c11) < 0))) {
            return z11 && URI_DECODE_RESERVED.indexOf(c11) >= 0;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void init(org.mozilla.javascript.Context r18, org.mozilla.javascript.Scriptable r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.NativeGlobal.init(org.mozilla.javascript.Context, org.mozilla.javascript.Scriptable, boolean):void");
    }

    public static boolean isEvalFunction(Object obj) {
        if (!(obj instanceof IdFunctionObject)) {
            return false;
        }
        IdFunctionObject idFunctionObject = (IdFunctionObject) obj;
        return idFunctionObject.hasTag(FTAG) && idFunctionObject.methodId() == 6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        if ((r12 & (-8)) == 0) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.Object js_escape(java.lang.Object[] r12) {
        /*
            r11 = this;
            r0 = 0
            java.lang.String r1 = org.mozilla.javascript.ScriptRuntime.toString(r12, r0)
            int r2 = r12.length
            r3 = 1
            if (r2 <= r3) goto L25
            r12 = r12[r3]
            double r4 = org.mozilla.javascript.ScriptRuntime.toNumber(r12)
            int r12 = (r4 > r4 ? 1 : (r4 == r4 ? 0 : -1))
            if (r12 != 0) goto L1e
            int r12 = (int) r4
            double r6 = (double) r12
            int r2 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r2 != 0) goto L1e
            r2 = r12 & (-8)
            if (r2 != 0) goto L1e
            goto L26
        L1e:
            java.lang.String r12 = "msg.bad.esc.mask"
            org.mozilla.javascript.EvaluatorException r12 = org.mozilla.javascript.Context.reportRuntimeError0(r12)
            throw r12
        L25:
            r12 = 7
        L26:
            int r2 = r1.length()
            r4 = 0
        L2b:
            if (r0 == r2) goto Lbc
            char r5 = r1.charAt(r0)
            r6 = 43
            if (r12 == 0) goto L72
            r7 = 48
            if (r5 < r7) goto L3d
            r7 = 57
            if (r5 <= r7) goto L6b
        L3d:
            r7 = 65
            if (r5 < r7) goto L45
            r7 = 90
            if (r5 <= r7) goto L6b
        L45:
            r7 = 97
            if (r5 < r7) goto L4d
            r7 = 122(0x7a, float:1.71E-43)
            if (r5 <= r7) goto L6b
        L4d:
            r7 = 64
            if (r5 == r7) goto L6b
            r7 = 42
            if (r5 == r7) goto L6b
            r7 = 95
            if (r5 == r7) goto L6b
            r7 = 45
            if (r5 == r7) goto L6b
            r7 = 46
            if (r5 == r7) goto L6b
            r7 = r12 & 4
            if (r7 == 0) goto L72
            r7 = 47
            if (r5 == r7) goto L6b
            if (r5 != r6) goto L72
        L6b:
            if (r4 == 0) goto Lb8
            char r5 = (char) r5
            r4.append(r5)
            goto Lb8
        L72:
            if (r4 != 0) goto L81
            java.lang.StringBuffer r4 = new java.lang.StringBuffer
            int r7 = r2 + 3
            r4.<init>(r7)
            r4.append(r1)
            r4.setLength(r0)
        L81:
            r7 = 256(0x100, float:3.59E-43)
            r8 = 37
            r9 = 4
            if (r5 >= r7) goto L97
            r7 = 32
            r10 = 2
            if (r5 != r7) goto L93
            if (r12 != r10) goto L93
            r4.append(r6)
            goto Lb8
        L93:
            r4.append(r8)
            goto La0
        L97:
            r4.append(r8)
            r6 = 117(0x75, float:1.64E-43)
            r4.append(r6)
            r10 = r9
        La0:
            int r10 = r10 - r3
            int r10 = r10 * r9
        La2:
            if (r10 < 0) goto Lb8
            int r6 = r5 >> r10
            r6 = r6 & 15
            r7 = 10
            if (r6 >= r7) goto Laf
            int r6 = r6 + 48
            goto Lb1
        Laf:
            int r6 = r6 + 55
        Lb1:
            char r6 = (char) r6
            r4.append(r6)
            int r10 = r10 + (-4)
            goto La2
        Lb8:
            int r0 = r0 + 1
            goto L2b
        Lbc:
            if (r4 != 0) goto Lbf
            return r1
        Lbf:
            java.lang.String r12 = r4.toString()
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.NativeGlobal.js_escape(java.lang.Object[]):java.lang.Object");
    }

    private Object js_eval(Context context, Scriptable scriptable, Object[] objArr) {
        Scriptable topLevelScope = ScriptableObject.getTopLevelScope(scriptable);
        return ScriptRuntime.evalSpecial(context, topLevelScope, topLevelScope, objArr, "eval code", 1);
    }

    private Object js_parseFloat(Object[] objArr) {
        int i11;
        if (objArr.length < 1) {
            return ScriptRuntime.NaNobj;
        }
        boolean z11 = false;
        String scriptRuntime = ScriptRuntime.toString(objArr[0]);
        int length = scriptRuntime.length();
        for (int i12 = 0; i12 != length; i12++) {
            char charAt = scriptRuntime.charAt(i12);
            if (!ScriptRuntime.isStrWhiteSpaceChar(charAt)) {
                if (charAt == '+' || charAt == '-') {
                    int i13 = i12 + 1;
                    if (i13 == length) {
                        return ScriptRuntime.NaNobj;
                    }
                    i11 = i13;
                    charAt = scriptRuntime.charAt(i13);
                } else {
                    i11 = i12;
                }
                if (charAt == 'I') {
                    if (i11 + 8 > length || !scriptRuntime.regionMatches(i11, "Infinity", 0, 8)) {
                        return ScriptRuntime.NaNobj;
                    }
                    return ScriptRuntime.wrapNumber(scriptRuntime.charAt(i12) == '-' ? Double.NEGATIVE_INFINITY : Double.POSITIVE_INFINITY);
                }
                int i14 = -1;
                int i15 = -1;
                while (true) {
                    if (i11 < length) {
                        char charAt2 = scriptRuntime.charAt(i11);
                        if (charAt2 != '+') {
                            if (charAt2 == 'E' || charAt2 == 'e') {
                                if (i14 == -1 && i11 != length - 1) {
                                    i14 = i11;
                                    i11++;
                                }
                            } else if (charAt2 != '-') {
                                if (charAt2 != '.') {
                                    switch (charAt2) {
                                        case '0':
                                        case '1':
                                        case '2':
                                        case '3':
                                        case '4':
                                        case '5':
                                        case '6':
                                        case '7':
                                        case '8':
                                        case '9':
                                            if (i14 != -1) {
                                                z11 = true;
                                                break;
                                            } else {
                                                break;
                                            }
                                    }
                                    i11++;
                                } else if (i15 == -1) {
                                    i15 = i11;
                                    i11++;
                                }
                            }
                        }
                        if (i14 == i11 - 1) {
                            if (i11 == length - 1) {
                                i11--;
                            } else {
                                i11++;
                            }
                        }
                    }
                }
                if (i14 == -1 || z11) {
                    i14 = i11;
                }
                try {
                    return Double.valueOf(scriptRuntime.substring(i12, i14));
                } catch (NumberFormatException unused) {
                    return ScriptRuntime.NaNobj;
                }
            }
        }
        return ScriptRuntime.NaNobj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002c, code lost:
    
        if (r0 != false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.Object js_parseInt(java.lang.Object[] r12) {
        /*
            r11 = this;
            r0 = 0
            java.lang.String r1 = org.mozilla.javascript.ScriptRuntime.toString(r12, r0)
            r2 = 1
            int r12 = org.mozilla.javascript.ScriptRuntime.toInt32(r12, r2)
            int r3 = r1.length()
            if (r3 != 0) goto L13
            java.lang.Double r12 = org.mozilla.javascript.ScriptRuntime.NaNobj
            return r12
        L13:
            r4 = r0
        L14:
            char r5 = r1.charAt(r4)
            boolean r6 = org.mozilla.javascript.ScriptRuntime.isStrWhiteSpaceChar(r5)
            if (r6 != 0) goto L1f
            goto L23
        L1f:
            int r4 = r4 + 1
            if (r4 < r3) goto L14
        L23:
            r6 = 43
            if (r5 == r6) goto L2e
            r6 = 45
            if (r5 != r6) goto L2c
            r0 = r2
        L2c:
            if (r0 == 0) goto L30
        L2e:
            int r4 = r4 + 1
        L30:
            r5 = 88
            r6 = 120(0x78, float:1.68E-43)
            r7 = 16
            r8 = -1
            r9 = 48
            if (r12 != 0) goto L3d
            r12 = r8
            goto L5d
        L3d:
            r10 = 2
            if (r12 < r10) goto L90
            r10 = 36
            if (r12 <= r10) goto L45
            goto L90
        L45:
            if (r12 != r7) goto L5d
            int r10 = r3 - r4
            if (r10 <= r2) goto L5d
            char r10 = r1.charAt(r4)
            if (r10 != r9) goto L5d
            int r10 = r4 + 1
            char r10 = r1.charAt(r10)
            if (r10 == r6) goto L5b
            if (r10 != r5) goto L5d
        L5b:
            int r4 = r4 + 2
        L5d:
            if (r12 != r8) goto L83
            int r3 = r3 - r4
            if (r3 <= r2) goto L80
            char r12 = r1.charAt(r4)
            if (r12 != r9) goto L80
            int r12 = r4 + 1
            char r2 = r1.charAt(r12)
            if (r2 == r6) goto L7d
            if (r2 != r5) goto L73
            goto L7d
        L73:
            if (r9 > r2) goto L80
            r3 = 57
            if (r2 > r3) goto L80
            r7 = 8
            r4 = r12
            goto L84
        L7d:
            int r4 = r4 + 2
            goto L84
        L80:
            r7 = 10
            goto L84
        L83:
            r7 = r12
        L84:
            double r1 = org.mozilla.javascript.ScriptRuntime.stringToNumber(r1, r4, r7)
            if (r0 == 0) goto L8b
            double r1 = -r1
        L8b:
            java.lang.Number r12 = org.mozilla.javascript.ScriptRuntime.wrapNumber(r1)
            return r12
        L90:
            java.lang.Double r12 = org.mozilla.javascript.ScriptRuntime.NaNobj
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.NativeGlobal.js_parseInt(java.lang.Object[]):java.lang.Object");
    }

    private Object js_unescape(Object[] objArr) {
        int i11;
        String scriptRuntime = ScriptRuntime.toString(objArr, 0);
        int indexOf = scriptRuntime.indexOf(37);
        if (indexOf < 0) {
            return scriptRuntime;
        }
        int length = scriptRuntime.length();
        char[] charArray = scriptRuntime.toCharArray();
        int i12 = indexOf;
        while (indexOf != length) {
            char c11 = charArray[indexOf];
            int i13 = indexOf + 1;
            if (c11 == '%' && i13 != length) {
                if (charArray[i13] == 'u') {
                    i11 = indexOf + 2;
                    indexOf += 6;
                } else {
                    indexOf += 3;
                    i11 = i13;
                }
                if (indexOf <= length) {
                    int i14 = 0;
                    while (i11 != indexOf) {
                        i14 = Kit.xDigitToInt(charArray[i11], i14);
                        i11++;
                    }
                    if (i14 >= 0) {
                        c11 = (char) i14;
                        charArray[i12] = c11;
                        i12++;
                    }
                }
            }
            indexOf = i13;
            charArray[i12] = c11;
            i12++;
        }
        return new String(charArray, 0, i12);
    }

    private static int oneUcs4ToUtf8Char(byte[] bArr, int i11) {
        if ((i11 & a.f10855g) == 0) {
            bArr[0] = (byte) i11;
            return 1;
        }
        int i12 = i11 >>> 11;
        int i13 = 2;
        while (i12 != 0) {
            i12 >>>= 5;
            i13++;
        }
        int i14 = i13;
        while (true) {
            i14--;
            if (i14 <= 0) {
                bArr[0] = (byte) ((256 - (1 << (8 - i13))) + i11);
                return i13;
            }
            bArr[i14] = (byte) ((i11 & 63) | 128);
            i11 >>>= 6;
        }
    }

    private static char toHexChar(int i11) {
        if ((i11 >> 4) != 0) {
            Kit.codeBug();
        }
        return (char) (i11 < 10 ? i11 + 48 : i11 + 55);
    }

    private static int unHex(char c11) {
        if ('A' <= c11 && c11 <= 'F') {
            return c11 - '7';
        }
        if ('a' <= c11 && c11 <= 'f') {
            return c11 - 'W';
        }
        if ('0' > c11 || c11 > '9') {
            return -1;
        }
        return c11 - '0';
    }

    private static EcmaError uriError() {
        return ScriptRuntime.constructError("URIError", ScriptRuntime.getMessage0("msg.bad.uri"));
    }

    @Override // org.mozilla.javascript.IdFunctionCall
    public Object execIdCall(IdFunctionObject idFunctionObject, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        if (idFunctionObject.hasTag(FTAG)) {
            int methodId = idFunctionObject.methodId();
            boolean z11 = false;
            switch (methodId) {
                case 1:
                case 2:
                    return decode(ScriptRuntime.toString(objArr, 0), methodId == 1);
                case 3:
                case 4:
                    return encode(ScriptRuntime.toString(objArr, 0), methodId == 3);
                case 5:
                    return js_escape(objArr);
                case 6:
                    return js_eval(context, scriptable, objArr);
                case 7:
                    if (objArr.length >= 1) {
                        double number = ScriptRuntime.toNumber(objArr[0]);
                        z11 = (number != number || number == Double.POSITIVE_INFINITY || number == Double.NEGATIVE_INFINITY) ? false : true;
                    }
                    return ScriptRuntime.wrapBoolean(z11);
                case 8:
                    if (objArr.length >= 1) {
                        double number2 = ScriptRuntime.toNumber(objArr[0]);
                        if (number2 == number2) {
                            r0 = false;
                        }
                    }
                    return ScriptRuntime.wrapBoolean(r0);
                case 9:
                    return ScriptRuntime.wrapBoolean(XMLLib.extractFromScope(scriptable).isXMLName(context, objArr.length == 0 ? Undefined.instance : objArr[0]));
                case 10:
                    return js_parseFloat(objArr);
                case 11:
                    return js_parseInt(objArr);
                case 12:
                    return js_unescape(objArr);
                case 13:
                    return ScriptRuntime.uneval(context, scriptable, objArr.length != 0 ? objArr[0] : Undefined.instance);
                case 14:
                    return NativeError.make(context, scriptable, idFunctionObject, objArr);
            }
        }
        throw idFunctionObject.unknown();
    }

    public static EcmaError constructError(Context context, String str, String str2, Scriptable scriptable, String str3, int i11, int i12, String str4) {
        return ScriptRuntime.constructError(str, str2, str3, i11, str4, i12);
    }

    private static int unHex(char c11, char c12) {
        int unHex = unHex(c11);
        int unHex2 = unHex(c12);
        if (unHex < 0 || unHex2 < 0) {
            return -1;
        }
        return (unHex << 4) | unHex2;
    }
}

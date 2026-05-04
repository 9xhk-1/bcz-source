package org.mozilla.javascript;

import androidx.media3.extractor.text.ttml.TtmlNode;
import ix.l1;
import u30.u0;
import y9.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
final class NativeString extends IdScriptableObject {
    private static final int ConstructorId_charAt = -5;
    private static final int ConstructorId_charCodeAt = -6;
    private static final int ConstructorId_concat = -14;
    private static final int ConstructorId_equalsIgnoreCase = -30;
    private static final int ConstructorId_fromCharCode = -1;
    private static final int ConstructorId_indexOf = -7;
    private static final int ConstructorId_lastIndexOf = -8;
    private static final int ConstructorId_localeCompare = -34;
    private static final int ConstructorId_match = -31;
    private static final int ConstructorId_replace = -33;
    private static final int ConstructorId_search = -32;
    private static final int ConstructorId_slice = -15;
    private static final int ConstructorId_split = -9;
    private static final int ConstructorId_substr = -13;
    private static final int ConstructorId_substring = -10;
    private static final int ConstructorId_toLocaleLowerCase = -35;
    private static final int ConstructorId_toLowerCase = -11;
    private static final int ConstructorId_toUpperCase = -12;
    private static final int Id_anchor = 28;
    private static final int Id_big = 21;
    private static final int Id_blink = 22;
    private static final int Id_bold = 16;
    private static final int Id_charAt = 5;
    private static final int Id_charCodeAt = 6;
    private static final int Id_concat = 14;
    private static final int Id_constructor = 1;
    private static final int Id_equals = 29;
    private static final int Id_equalsIgnoreCase = 30;
    private static final int Id_fixed = 18;
    private static final int Id_fontcolor = 26;
    private static final int Id_fontsize = 25;
    private static final int Id_indexOf = 7;
    private static final int Id_italics = 17;
    private static final int Id_lastIndexOf = 8;
    private static final int Id_length = 1;
    private static final int Id_link = 27;
    private static final int Id_localeCompare = 34;
    private static final int Id_match = 31;
    private static final int Id_replace = 33;
    private static final int Id_search = 32;
    private static final int Id_slice = 15;
    private static final int Id_small = 20;
    private static final int Id_split = 9;
    private static final int Id_strike = 19;
    private static final int Id_sub = 24;
    private static final int Id_substr = 13;
    private static final int Id_substring = 10;
    private static final int Id_sup = 23;
    private static final int Id_toLocaleLowerCase = 35;
    private static final int Id_toLocaleUpperCase = 36;
    private static final int Id_toLowerCase = 11;
    private static final int Id_toSource = 3;
    private static final int Id_toString = 2;
    private static final int Id_toUpperCase = 12;
    private static final int Id_trim = 37;
    private static final int Id_valueOf = 4;
    private static final int MAX_INSTANCE_ID = 1;
    private static final int MAX_PROTOTYPE_ID = 37;
    private static final Object STRING_TAG = "String";
    static final long serialVersionUID = 920268368584188687L;
    private CharSequence string;

    public NativeString(CharSequence charSequence) {
        this.string = charSequence;
    }

    public static void init(Scriptable scriptable, boolean z11) {
        new NativeString("").exportAsJSClass(37, scriptable, z11);
    }

    private static String js_concat(String str, Object[] objArr) {
        int length = objArr.length;
        if (length == 0) {
            return str;
        }
        if (length == 1) {
            return str.concat(ScriptRuntime.toString(objArr[0]));
        }
        int length2 = str.length();
        String[] strArr = new String[length];
        for (int i11 = 0; i11 != length; i11++) {
            String scriptRuntime = ScriptRuntime.toString(objArr[i11]);
            strArr[i11] = scriptRuntime;
            length2 += scriptRuntime.length();
        }
        StringBuffer stringBuffer = new StringBuffer(length2);
        stringBuffer.append(str);
        for (int i12 = 0; i12 != length; i12++) {
            stringBuffer.append(strArr[i12]);
        }
        return stringBuffer.toString();
    }

    private static int js_indexOf(String str, Object[] objArr) {
        String scriptRuntime = ScriptRuntime.toString(objArr, 0);
        double integer = ScriptRuntime.toInteger(objArr, 1);
        if (integer > str.length()) {
            return -1;
        }
        if (integer < 0.0d) {
            integer = 0.0d;
        }
        return str.indexOf(scriptRuntime, (int) integer);
    }

    private static int js_lastIndexOf(String str, Object[] objArr) {
        String scriptRuntime = ScriptRuntime.toString(objArr, 0);
        double number = ScriptRuntime.toNumber(objArr, 1);
        if (number != number || number > str.length()) {
            number = str.length();
        } else if (number < 0.0d) {
            number = 0.0d;
        }
        return str.lastIndexOf(scriptRuntime, (int) number);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:
    
        if (r5 < 0.0d) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
    
        r3 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0042, code lost:
    
        if (r3 >= r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
    
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0046, code lost:
    
        r2 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003e, code lost:
    
        if (r5 > r3) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.CharSequence js_slice(java.lang.CharSequence r9, java.lang.Object[] r10) {
        /*
            int r0 = r10.length
            if (r0 == 0) goto L4d
            r0 = 0
            r0 = r10[r0]
            double r0 = org.mozilla.javascript.ScriptRuntime.toInteger(r0)
            int r2 = r9.length()
            r3 = 0
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 >= 0) goto L1c
            double r5 = (double) r2
            double r0 = r0 + r5
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 >= 0) goto L22
            r0 = r3
            goto L22
        L1c:
            double r5 = (double) r2
            int r7 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r7 <= 0) goto L22
            r0 = r5
        L22:
            int r5 = r10.length
            r6 = 1
            if (r5 != r6) goto L28
            double r2 = (double) r2
            goto L47
        L28:
            r10 = r10[r6]
            double r5 = org.mozilla.javascript.ScriptRuntime.toInteger(r10)
            int r10 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r10 >= 0) goto L3b
            double r7 = (double) r2
            double r5 = r5 + r7
            int r10 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r10 >= 0) goto L39
            goto L40
        L39:
            r3 = r5
            goto L40
        L3b:
            double r3 = (double) r2
            int r10 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r10 <= 0) goto L39
        L40:
            int r10 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r10 >= 0) goto L46
            r2 = r0
            goto L47
        L46:
            r2 = r3
        L47:
            int r10 = (int) r0
            int r0 = (int) r2
            java.lang.CharSequence r9 = r9.subSequence(r10, r0)
        L4d:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.NativeString.js_slice(java.lang.CharSequence, java.lang.Object[]):java.lang.CharSequence");
    }

    private static CharSequence js_substr(CharSequence charSequence, Object[] objArr) {
        double d11;
        if (objArr.length < 1) {
            return charSequence;
        }
        double integer = ScriptRuntime.toInteger(objArr[0]);
        int length = charSequence.length();
        if (integer < 0.0d) {
            integer += length;
            if (integer < 0.0d) {
                integer = 0.0d;
            }
        } else {
            double d12 = length;
            if (integer > d12) {
                integer = d12;
            }
        }
        if (objArr.length == 1) {
            d11 = length;
        } else {
            double integer2 = ScriptRuntime.toInteger(objArr[1]);
            double d13 = (integer2 >= 0.0d ? integer2 : 0.0d) + integer;
            d11 = length;
            if (d13 <= d11) {
                d11 = d13;
            }
        }
        return charSequence.subSequence((int) integer, (int) d11);
    }

    private static CharSequence js_substring(Context context, CharSequence charSequence, Object[] objArr) {
        Object obj;
        int length = charSequence.length();
        double integer = ScriptRuntime.toInteger(objArr, 0);
        double d11 = 0.0d;
        if (integer < 0.0d) {
            integer = 0.0d;
        } else {
            double d12 = length;
            if (integer > d12) {
                integer = d12;
            }
        }
        if (objArr.length <= 1 || (obj = objArr[1]) == Undefined.instance) {
            d11 = length;
        } else {
            double integer2 = ScriptRuntime.toInteger(obj);
            if (integer2 >= 0.0d) {
                d11 = length;
                if (integer2 <= d11) {
                    d11 = integer2;
                }
            }
            if (d11 < integer) {
                if (context.getLanguageVersion() != 120) {
                    double d13 = d11;
                    d11 = integer;
                    integer = d13;
                } else {
                    d11 = integer;
                }
            }
        }
        return charSequence.subSequence((int) integer, (int) d11);
    }

    private static NativeString realThis(Scriptable scriptable, IdFunctionObject idFunctionObject) {
        if (scriptable instanceof NativeString) {
            return (NativeString) scriptable;
        }
        throw IdScriptableObject.incompatibleCallError(idFunctionObject);
    }

    private static String tagify(Object obj, String str, String str2, Object[] objArr) {
        String scriptRuntime = ScriptRuntime.toString(obj);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(u0.f91709e);
        stringBuffer.append(str);
        if (str2 != null) {
            stringBuffer.append(' ');
            stringBuffer.append(str2);
            stringBuffer.append("=\"");
            stringBuffer.append(ScriptRuntime.toString(objArr, 0));
            stringBuffer.append('\"');
        }
        stringBuffer.append(u0.f91710f);
        stringBuffer.append(scriptRuntime);
        stringBuffer.append("</");
        stringBuffer.append(str);
        stringBuffer.append(u0.f91710f);
        return stringBuffer.toString();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.calcSwitchOut(SwitchRegionMaker.java:202)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:61)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:115)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.processFallThroughCases(SwitchRegionMaker.java:105)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:64)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:115)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:281)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:64)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:100)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // org.mozilla.javascript.IdScriptableObject, org.mozilla.javascript.IdFunctionCall
    public java.lang.Object execIdCall(org.mozilla.javascript.IdFunctionObject r9, org.mozilla.javascript.Context r10, org.mozilla.javascript.Scriptable r11, org.mozilla.javascript.Scriptable r12, java.lang.Object[] r13) {
        /*
            Method dump skipped, instructions count: 710
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.NativeString.execIdCall(org.mozilla.javascript.IdFunctionObject, org.mozilla.javascript.Context, org.mozilla.javascript.Scriptable, org.mozilla.javascript.Scriptable, java.lang.Object[]):java.lang.Object");
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public void fillConstructorProperties(IdFunctionObject idFunctionObject) {
        Object obj = STRING_TAG;
        addIdFunctionProperty(idFunctionObject, obj, -1, "fromCharCode", 1);
        addIdFunctionProperty(idFunctionObject, obj, -5, "charAt", 2);
        addIdFunctionProperty(idFunctionObject, obj, -6, "charCodeAt", 2);
        addIdFunctionProperty(idFunctionObject, obj, -7, "indexOf", 2);
        addIdFunctionProperty(idFunctionObject, obj, -8, "lastIndexOf", 2);
        addIdFunctionProperty(idFunctionObject, obj, -9, "split", 3);
        addIdFunctionProperty(idFunctionObject, obj, -10, "substring", 3);
        addIdFunctionProperty(idFunctionObject, obj, -11, "toLowerCase", 1);
        addIdFunctionProperty(idFunctionObject, obj, -12, "toUpperCase", 1);
        addIdFunctionProperty(idFunctionObject, obj, -13, "substr", 3);
        addIdFunctionProperty(idFunctionObject, obj, -14, "concat", 2);
        addIdFunctionProperty(idFunctionObject, obj, -15, "slice", 3);
        addIdFunctionProperty(idFunctionObject, obj, ConstructorId_equalsIgnoreCase, "equalsIgnoreCase", 2);
        addIdFunctionProperty(idFunctionObject, obj, ConstructorId_match, "match", 2);
        addIdFunctionProperty(idFunctionObject, obj, ConstructorId_search, "search", 2);
        addIdFunctionProperty(idFunctionObject, obj, ConstructorId_replace, "replace", 2);
        addIdFunctionProperty(idFunctionObject, obj, ConstructorId_localeCompare, "localeCompare", 2);
        addIdFunctionProperty(idFunctionObject, obj, ConstructorId_toLocaleLowerCase, "toLocaleLowerCase", 1);
        super.fillConstructorProperties(idFunctionObject);
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public int findInstanceIdInfo(String str) {
        return str.equals("length") ? IdScriptableObject.instanceIdInfo(7, 1) : super.findInstanceIdInfo(str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x019c A[ADDED_TO_REGION] */
    @Override // org.mozilla.javascript.IdScriptableObject
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int findPrototypeId(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.NativeString.findPrototypeId(java.lang.String):int");
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public Object get(int i11, Scriptable scriptable) {
        return (i11 < 0 || i11 >= this.string.length()) ? super.get(i11, scriptable) : String.valueOf(this.string.charAt(i11));
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public String getClassName() {
        return "String";
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public String getInstanceIdName(int i11) {
        return i11 == 1 ? "length" : super.getInstanceIdName(i11);
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public Object getInstanceIdValue(int i11) {
        return i11 == 1 ? ScriptRuntime.wrapInt(this.string.length()) : super.getInstanceIdValue(i11);
    }

    public int getLength() {
        return this.string.length();
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public int getMaxInstanceId() {
        return 1;
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public void initPrototypeId(int i11) {
        String str;
        String str2;
        int i12 = 0;
        switch (i11) {
            case 1:
                str = "constructor";
                i12 = 1;
                initPrototypeMethod(STRING_TAG, i11, str, i12);
                return;
            case 2:
                str = "toString";
                initPrototypeMethod(STRING_TAG, i11, str, i12);
                return;
            case 3:
                str = "toSource";
                initPrototypeMethod(STRING_TAG, i11, str, i12);
                return;
            case 4:
                str = "valueOf";
                initPrototypeMethod(STRING_TAG, i11, str, i12);
                return;
            case 5:
                str = "charAt";
                i12 = 1;
                initPrototypeMethod(STRING_TAG, i11, str, i12);
                return;
            case 6:
                str = "charCodeAt";
                i12 = 1;
                initPrototypeMethod(STRING_TAG, i11, str, i12);
                return;
            case 7:
                str = "indexOf";
                i12 = 1;
                initPrototypeMethod(STRING_TAG, i11, str, i12);
                return;
            case 8:
                str = "lastIndexOf";
                i12 = 1;
                initPrototypeMethod(STRING_TAG, i11, str, i12);
                return;
            case 9:
                str2 = "split";
                i12 = 2;
                str = str2;
                initPrototypeMethod(STRING_TAG, i11, str, i12);
                return;
            case 10:
                str2 = "substring";
                i12 = 2;
                str = str2;
                initPrototypeMethod(STRING_TAG, i11, str, i12);
                return;
            case 11:
                str = "toLowerCase";
                initPrototypeMethod(STRING_TAG, i11, str, i12);
                return;
            case 12:
                str = "toUpperCase";
                initPrototypeMethod(STRING_TAG, i11, str, i12);
                return;
            case 13:
                str2 = "substr";
                i12 = 2;
                str = str2;
                initPrototypeMethod(STRING_TAG, i11, str, i12);
                return;
            case 14:
                str = "concat";
                i12 = 1;
                initPrototypeMethod(STRING_TAG, i11, str, i12);
                return;
            case 15:
                str2 = "slice";
                i12 = 2;
                str = str2;
                initPrototypeMethod(STRING_TAG, i11, str, i12);
                return;
            case 16:
                str = TtmlNode.BOLD;
                initPrototypeMethod(STRING_TAG, i11, str, i12);
                return;
            case 17:
                str = "italics";
                initPrototypeMethod(STRING_TAG, i11, str, i12);
                return;
            case 18:
                str = "fixed";
                initPrototypeMethod(STRING_TAG, i11, str, i12);
                return;
            case 19:
                str = "strike";
                initPrototypeMethod(STRING_TAG, i11, str, i12);
                return;
            case 20:
                str = "small";
                initPrototypeMethod(STRING_TAG, i11, str, i12);
                return;
            case 21:
                str = "big";
                initPrototypeMethod(STRING_TAG, i11, str, i12);
                return;
            case 22:
                str = "blink";
                initPrototypeMethod(STRING_TAG, i11, str, i12);
                return;
            case 23:
                str = "sup";
                initPrototypeMethod(STRING_TAG, i11, str, i12);
                return;
            case 24:
                str = "sub";
                initPrototypeMethod(STRING_TAG, i11, str, i12);
                return;
            case 25:
                str = "fontsize";
                initPrototypeMethod(STRING_TAG, i11, str, i12);
                return;
            case 26:
                str = "fontcolor";
                initPrototypeMethod(STRING_TAG, i11, str, i12);
                return;
            case 27:
                str = b.f99687c;
                initPrototypeMethod(STRING_TAG, i11, str, i12);
                return;
            case 28:
                str = l1.a.f62925c;
                initPrototypeMethod(STRING_TAG, i11, str, i12);
                return;
            case 29:
                str = "equals";
                i12 = 1;
                initPrototypeMethod(STRING_TAG, i11, str, i12);
                return;
            case 30:
                str = "equalsIgnoreCase";
                i12 = 1;
                initPrototypeMethod(STRING_TAG, i11, str, i12);
                return;
            case 31:
                str = "match";
                i12 = 1;
                initPrototypeMethod(STRING_TAG, i11, str, i12);
                return;
            case 32:
                str = "search";
                i12 = 1;
                initPrototypeMethod(STRING_TAG, i11, str, i12);
                return;
            case 33:
                str = "replace";
                i12 = 1;
                initPrototypeMethod(STRING_TAG, i11, str, i12);
                return;
            case 34:
                str = "localeCompare";
                i12 = 1;
                initPrototypeMethod(STRING_TAG, i11, str, i12);
                return;
            case 35:
                str = "toLocaleLowerCase";
                initPrototypeMethod(STRING_TAG, i11, str, i12);
                return;
            case 36:
                str = "toLocaleUpperCase";
                initPrototypeMethod(STRING_TAG, i11, str, i12);
                return;
            case 37:
                str = "trim";
                initPrototypeMethod(STRING_TAG, i11, str, i12);
                return;
            default:
                throw new IllegalArgumentException(String.valueOf(i11));
        }
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public void put(int i11, Scriptable scriptable, Object obj) {
        if (i11 < 0 || i11 >= this.string.length()) {
            super.put(i11, scriptable, obj);
        }
    }

    public CharSequence toCharSequence() {
        return this.string;
    }

    public String toString() {
        CharSequence charSequence = this.string;
        return charSequence instanceof String ? (String) charSequence : charSequence.toString();
    }
}

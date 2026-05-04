package org.mozilla.javascript.regexp;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Function;
import org.mozilla.javascript.Kit;
import org.mozilla.javascript.RegExpProxy;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.Undefined;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class RegExpImpl implements RegExpProxy {
    protected String input;
    protected SubString lastMatch;
    protected SubString lastParen;
    protected SubString leftContext;
    protected boolean multiline;
    protected SubString[] parens;
    protected SubString rightContext;

    private static void do_replace(GlobData globData, Context context, RegExpImpl regExpImpl) {
        int i11;
        StringBuilder sb2 = globData.charBuf;
        String str = globData.repstr;
        int i12 = globData.dollar;
        int i13 = 0;
        if (i12 != -1) {
            int[] iArr = new int[1];
            int i14 = 0;
            do {
                sb2.append(str.substring(i14, i12));
                SubString interpretDollar = interpretDollar(context, regExpImpl, str, i12, iArr);
                if (interpretDollar != null) {
                    int i15 = interpretDollar.length;
                    if (i15 > 0) {
                        String str2 = interpretDollar.str;
                        int i16 = interpretDollar.index;
                        sb2.append((CharSequence) str2, i16, i15 + i16);
                    }
                    int i17 = iArr[0];
                    int i18 = i12 + i17;
                    i11 = i12 + i17;
                    i14 = i18;
                } else {
                    i14 = i12;
                    i11 = i12 + 1;
                }
                i12 = str.indexOf(36, i11);
            } while (i12 >= 0);
            i13 = i14;
        }
        int length = str.length();
        if (length > i13) {
            sb2.append(str.substring(i13, length));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0081 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static org.mozilla.javascript.regexp.SubString interpretDollar(org.mozilla.javascript.Context r7, org.mozilla.javascript.regexp.RegExpImpl r8, java.lang.String r9, int r10, int[] r11) {
        /*
            Method dump skipped, instructions count: 196
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.regexp.RegExpImpl.interpretDollar(org.mozilla.javascript.Context, org.mozilla.javascript.regexp.RegExpImpl, java.lang.String, int, int[]):org.mozilla.javascript.regexp.SubString");
    }

    private static Object matchOrReplace(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr, RegExpImpl regExpImpl, GlobData globData, boolean z11) {
        String str;
        NativeRegExp nativeRegExp;
        GlobData globData2 = globData;
        String scriptRuntime = ScriptRuntime.toString(scriptable2);
        globData2.str = scriptRuntime;
        Scriptable topLevelScope = ScriptableObject.getTopLevelScope(scriptable);
        if (objArr.length == 0) {
            nativeRegExp = new NativeRegExp(topLevelScope, NativeRegExp.compileRE(context, "", "", false));
        } else {
            Object obj = objArr[0];
            if (obj instanceof NativeRegExp) {
                nativeRegExp = (NativeRegExp) obj;
            } else {
                String scriptRuntime2 = ScriptRuntime.toString(obj);
                int i11 = globData2.optarg;
                if (i11 < objArr.length) {
                    objArr[0] = scriptRuntime2;
                    str = ScriptRuntime.toString(objArr[i11]);
                } else {
                    str = null;
                }
                nativeRegExp = new NativeRegExp(topLevelScope, NativeRegExp.compileRE(context, scriptRuntime2, str, z11));
            }
        }
        NativeRegExp nativeRegExp2 = nativeRegExp;
        boolean z12 = (nativeRegExp2.getFlags() & 1) != 0;
        globData2.global = z12;
        Object obj2 = null;
        int[] iArr = {0};
        int i12 = globData2.mode;
        if (i12 == 3) {
            Object executeRegExp = nativeRegExp2.executeRegExp(context, scriptable, regExpImpl, scriptRuntime, iArr, 0);
            if (executeRegExp == null || !executeRegExp.equals(Boolean.TRUE)) {
                return -1;
            }
            return Integer.valueOf(regExpImpl.leftContext.length);
        }
        RegExpImpl regExpImpl2 = regExpImpl;
        if (!z12) {
            return nativeRegExp2.executeRegExp(context, scriptable, regExpImpl2, scriptRuntime, iArr, i12 == 2 ? 0 : 1);
        }
        nativeRegExp2.lastIndex = 0.0d;
        int i13 = 0;
        while (iArr[0] <= scriptRuntime.length()) {
            RegExpImpl regExpImpl3 = regExpImpl2;
            Object executeRegExp2 = nativeRegExp2.executeRegExp(context, scriptable, regExpImpl3, scriptRuntime, iArr, 0);
            NativeRegExp nativeRegExp3 = nativeRegExp2;
            String str2 = scriptRuntime;
            int[] iArr2 = iArr;
            if (executeRegExp2 != null && executeRegExp2.equals(Boolean.TRUE)) {
                int i14 = globData2.mode;
                if (i14 == 1) {
                    match_glob(globData2, context, scriptable, i13, regExpImpl3);
                } else {
                    if (i14 != 2) {
                        Kit.codeBug();
                    }
                    SubString subString = regExpImpl3.lastMatch;
                    int i15 = globData2.leftIndex;
                    int i16 = subString.index;
                    globData2.leftIndex = subString.length + i16;
                    replace_glob(globData2, context, scriptable, regExpImpl3, i15, i16 - i15);
                }
                if (regExpImpl3.lastMatch.length == 0) {
                    if (iArr2[0] != str2.length()) {
                        iArr2[0] = iArr2[0] + 1;
                    }
                }
                i13++;
                globData2 = globData;
                regExpImpl2 = regExpImpl3;
                obj2 = executeRegExp2;
                scriptRuntime = str2;
                nativeRegExp2 = nativeRegExp3;
                iArr = iArr2;
            }
            return executeRegExp2;
        }
        return obj2;
    }

    private static void match_glob(GlobData globData, Context context, Scriptable scriptable, int i11, RegExpImpl regExpImpl) {
        if (globData.arrayobj == null) {
            globData.arrayobj = context.newArray(scriptable, 0);
        }
        String subString = regExpImpl.lastMatch.toString();
        Scriptable scriptable2 = globData.arrayobj;
        scriptable2.put(i11, scriptable2, subString);
    }

    private static void replace_glob(GlobData globData, Context context, Scriptable scriptable, RegExpImpl regExpImpl, int i11, int i12) {
        int length;
        String str;
        int i13;
        if (globData.lambda != null) {
            SubString[] subStringArr = regExpImpl.parens;
            int length2 = subStringArr == null ? 0 : subStringArr.length;
            Object[] objArr = new Object[length2 + 3];
            objArr[0] = regExpImpl.lastMatch.toString();
            for (int i14 = 0; i14 < length2; i14++) {
                SubString subString = subStringArr[i14];
                if (subString != null) {
                    objArr[i14 + 1] = subString.toString();
                } else {
                    objArr[i14 + 1] = Undefined.instance;
                }
            }
            objArr[length2 + 1] = Integer.valueOf(regExpImpl.leftContext.length);
            objArr[length2 + 2] = globData.str;
            if (regExpImpl != ScriptRuntime.getRegExpProxy(context)) {
                Kit.codeBug();
            }
            RegExpImpl regExpImpl2 = new RegExpImpl();
            regExpImpl2.multiline = regExpImpl.multiline;
            regExpImpl2.input = regExpImpl.input;
            ScriptRuntime.setRegExpProxy(context, regExpImpl2);
            try {
                Scriptable topLevelScope = ScriptableObject.getTopLevelScope(scriptable);
                str = ScriptRuntime.toString(globData.lambda.call(context, topLevelScope, topLevelScope, objArr));
                ScriptRuntime.setRegExpProxy(context, regExpImpl);
                length = str.length();
            } catch (Throwable th2) {
                ScriptRuntime.setRegExpProxy(context, regExpImpl);
                throw th2;
            }
        } else {
            length = globData.repstr.length();
            int i15 = globData.dollar;
            if (i15 >= 0) {
                int[] iArr = new int[1];
                do {
                    SubString interpretDollar = interpretDollar(context, regExpImpl, globData.repstr, i15, iArr);
                    if (interpretDollar != null) {
                        int i16 = interpretDollar.length;
                        int i17 = iArr[0];
                        length += i16 - i17;
                        i13 = i15 + i17;
                    } else {
                        i13 = i15 + 1;
                    }
                    i15 = globData.repstr.indexOf(36, i13);
                } while (i15 >= 0);
            }
            str = null;
        }
        int i18 = length + i12 + regExpImpl.rightContext.length;
        StringBuilder sb2 = globData.charBuf;
        if (sb2 == null) {
            sb2 = new StringBuilder(i18);
            globData.charBuf = sb2;
        } else {
            sb2.ensureCapacity(sb2.length() + i18);
        }
        sb2.append((CharSequence) regExpImpl.leftContext.str, i11, i12 + i11);
        if (globData.lambda != null) {
            sb2.append(str);
        } else {
            do_replace(globData, context, regExpImpl);
        }
    }

    @Override // org.mozilla.javascript.RegExpProxy
    public Object action(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr, int i11) {
        String scriptRuntime;
        Function function;
        GlobData globData = new GlobData();
        globData.mode = i11;
        if (i11 == 1) {
            globData.optarg = 1;
            Object matchOrReplace = matchOrReplace(context, scriptable, scriptable2, objArr, this, globData, false);
            Scriptable scriptable3 = globData.arrayobj;
            return scriptable3 == null ? matchOrReplace : scriptable3;
        }
        if (i11 != 2) {
            if (i11 != 3) {
                throw Kit.codeBug();
            }
            globData.optarg = 1;
            return matchOrReplace(context, scriptable, scriptable2, objArr, this, globData, false);
        }
        Object obj = objArr.length < 2 ? Undefined.instance : objArr[1];
        if (obj instanceof Function) {
            function = (Function) obj;
            scriptRuntime = null;
        } else {
            scriptRuntime = ScriptRuntime.toString(obj);
            function = null;
        }
        globData.optarg = 2;
        globData.lambda = function;
        globData.repstr = scriptRuntime;
        globData.dollar = scriptRuntime == null ? -1 : scriptRuntime.indexOf(36);
        globData.charBuf = null;
        globData.leftIndex = 0;
        RegExpImpl regExpImpl = this;
        Object matchOrReplace2 = matchOrReplace(context, scriptable, scriptable2, objArr, regExpImpl, globData, true);
        if (globData.charBuf == null) {
            if (globData.global || matchOrReplace2 == null || !matchOrReplace2.equals(Boolean.TRUE)) {
                return globData.str;
            }
            SubString subString = regExpImpl.leftContext;
            replace_glob(globData, context, scriptable, this, subString.index, subString.length);
            globData = globData;
            regExpImpl = this;
        }
        SubString subString2 = regExpImpl.rightContext;
        StringBuilder sb2 = globData.charBuf;
        String str = subString2.str;
        int i12 = subString2.index;
        sb2.append((CharSequence) str, i12, subString2.length + i12);
        return globData.charBuf.toString();
    }

    @Override // org.mozilla.javascript.RegExpProxy
    public Object compileRegExp(Context context, String str, String str2) {
        return NativeRegExp.compileRE(context, str, str2, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x004a, code lost:
    
        r1 = r1 - r5;
     */
    @Override // org.mozilla.javascript.RegExpProxy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int find_split(org.mozilla.javascript.Context r13, org.mozilla.javascript.Scriptable r14, java.lang.String r15, java.lang.String r16, org.mozilla.javascript.Scriptable r17, int[] r18, int[] r19, boolean[] r20, java.lang.String[][] r21) {
        /*
            r12 = this;
            r0 = 0
            r1 = r18[r0]
            int r2 = r15.length()
            int r3 = r13.getLanguageVersion()
            r4 = r17
            org.mozilla.javascript.regexp.NativeRegExp r4 = (org.mozilla.javascript.regexp.NativeRegExp) r4
        Lf:
            r11 = r18[r0]
            r18[r0] = r1
            r10 = 0
            r7 = r12
            r5 = r13
            r6 = r14
            r8 = r15
            r9 = r18
            java.lang.Object r1 = r4.executeRegExp(r5, r6, r7, r8, r9, r10)
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            r6 = 1
            if (r1 == r5) goto L2a
            r18[r0] = r11
            r19[r0] = r6
            r20[r0] = r0
            return r2
        L2a:
            r1 = r18[r0]
            r18[r0] = r11
            r20[r0] = r6
            org.mozilla.javascript.regexp.SubString r5 = r12.lastMatch
            int r5 = r5.length
            r19[r0] = r5
            if (r5 != 0) goto L4a
            r8 = r18[r0]
            if (r1 != r8) goto L4a
            if (r1 != r2) goto L47
            r13 = 120(0x78, float:1.68E-43)
            if (r3 != r13) goto L45
            r19[r0] = r6
            goto L4b
        L45:
            r1 = -1
            goto L4b
        L47:
            int r1 = r1 + 1
            goto Lf
        L4a:
            int r1 = r1 - r5
        L4b:
            org.mozilla.javascript.regexp.SubString[] r13 = r12.parens
            if (r13 != 0) goto L51
            r13 = r0
            goto L52
        L51:
            int r13 = r13.length
        L52:
            java.lang.String[] r14 = new java.lang.String[r13]
            r21[r0] = r14
            r14 = r0
        L57:
            if (r14 >= r13) goto L68
            org.mozilla.javascript.regexp.SubString r15 = r12.getParenSubString(r14)
            r2 = r21[r0]
            java.lang.String r15 = r15.toString()
            r2[r14] = r15
            int r14 = r14 + 1
            goto L57
        L68:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.regexp.RegExpImpl.find_split(org.mozilla.javascript.Context, org.mozilla.javascript.Scriptable, java.lang.String, java.lang.String, org.mozilla.javascript.Scriptable, int[], int[], boolean[], java.lang.String[][]):int");
    }

    public SubString getParenSubString(int i11) {
        SubString subString;
        SubString[] subStringArr = this.parens;
        return (subStringArr == null || i11 >= subStringArr.length || (subString = subStringArr[i11]) == null) ? SubString.emptySubString : subString;
    }

    @Override // org.mozilla.javascript.RegExpProxy
    public boolean isRegExp(Scriptable scriptable) {
        return scriptable instanceof NativeRegExp;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
    
        if (r4.isRegExp(r6) != false) goto L27;
     */
    @Override // org.mozilla.javascript.RegExpProxy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object js_split(org.mozilla.javascript.Context r20, org.mozilla.javascript.Scriptable r21, java.lang.String r22, java.lang.Object[] r23) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.regexp.RegExpImpl.js_split(org.mozilla.javascript.Context, org.mozilla.javascript.Scriptable, java.lang.String, java.lang.Object[]):java.lang.Object");
    }

    @Override // org.mozilla.javascript.RegExpProxy
    public Scriptable wrapRegExp(Context context, Scriptable scriptable, Object obj) {
        return new NativeRegExp(scriptable, (RECompiled) obj);
    }

    private static int find_split(Context context, Scriptable scriptable, String str, String str2, int i11, RegExpProxy regExpProxy, Scriptable scriptable2, int[] iArr, int[] iArr2, boolean[] zArr, String[][] strArr) {
        int indexOf;
        int i12 = iArr[0];
        int length = str.length();
        if (i11 == 120 && scriptable2 == null && str2.length() == 1 && str2.charAt(0) == ' ') {
            if (i12 == 0) {
                while (i12 < length && Character.isWhitespace(str.charAt(i12))) {
                    i12++;
                }
                iArr[0] = i12;
            }
            if (i12 == length) {
                return -1;
            }
            while (i12 < length && !Character.isWhitespace(str.charAt(i12))) {
                i12++;
            }
            int i13 = i12;
            while (i13 < length && Character.isWhitespace(str.charAt(i13))) {
                i13++;
            }
            iArr2[0] = i13 - i12;
            return i12;
        }
        if (i12 > length) {
            return -1;
        }
        if (scriptable2 != null) {
            return regExpProxy.find_split(context, scriptable, str, str2, scriptable2, iArr, iArr2, zArr, strArr);
        }
        if (i11 != 0 && i11 < 130 && length == 0) {
            return -1;
        }
        if (str2.length() != 0) {
            int i14 = iArr[0];
            return (i14 < length && (indexOf = str.indexOf(str2, i14)) != -1) ? indexOf : length;
        }
        if (i11 != 120) {
            if (i12 == length) {
                return -1;
            }
            return i12 + 1;
        }
        if (i12 != length) {
            return i12 + 1;
        }
        iArr2[0] = 1;
        return i12;
    }
}

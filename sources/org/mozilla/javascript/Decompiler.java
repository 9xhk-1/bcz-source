package org.mozilla.javascript;

import j60.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class Decompiler {
    public static final int CASE_GAP_PROP = 3;
    private static final int FUNCTION_END = 164;
    public static final int INDENT_GAP_PROP = 2;
    public static final int INITIAL_INDENT_PROP = 1;
    public static final int ONLY_BODY_FLAG = 1;
    public static final int TO_SOURCE_FLAG = 2;
    private static final boolean printSource = false;
    private char[] sourceBuffer = new char[128];
    private int sourceTop;

    private void append(char c11) {
        int i11 = this.sourceTop;
        if (i11 == this.sourceBuffer.length) {
            increaseSourceCapacity(i11 + 1);
        }
        char[] cArr = this.sourceBuffer;
        int i12 = this.sourceTop;
        cArr[i12] = c11;
        this.sourceTop = i12 + 1;
    }

    private void appendString(String str) {
        int length = str.length();
        int i11 = this.sourceTop + (length >= 32768 ? 2 : 1) + length;
        if (i11 > this.sourceBuffer.length) {
            increaseSourceCapacity(i11);
        }
        if (length >= 32768) {
            char[] cArr = this.sourceBuffer;
            int i12 = this.sourceTop;
            cArr[i12] = (char) (32768 | (length >>> 16));
            this.sourceTop = i12 + 1;
        }
        char[] cArr2 = this.sourceBuffer;
        int i13 = this.sourceTop;
        cArr2[i13] = (char) length;
        int i14 = i13 + 1;
        this.sourceTop = i14;
        str.getChars(0, length, cArr2, i14);
        this.sourceTop = i11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:130:0x0245, code lost:
    
        if (r3 != 164) goto L124;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String decompile(java.lang.String r18, int r19, org.mozilla.javascript.UintMap r20) {
        /*
            Method dump skipped, instructions count: 1378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.Decompiler.decompile(java.lang.String, int, org.mozilla.javascript.UintMap):java.lang.String");
    }

    private static int getNext(String str, int i11, int i12) {
        int i13 = i12 + 1;
        if (i13 < i11) {
            return str.charAt(i13);
        }
        return 0;
    }

    private static int getSourceStringEnd(String str, int i11) {
        return printSourceString(str, i11, false, null);
    }

    private void increaseSourceCapacity(int i11) {
        if (i11 <= this.sourceBuffer.length) {
            Kit.codeBug();
        }
        char[] cArr = this.sourceBuffer;
        int length = cArr.length * 2;
        if (length >= i11) {
            i11 = length;
        }
        char[] cArr2 = new char[i11];
        System.arraycopy(cArr, 0, cArr2, 0, this.sourceTop);
        this.sourceBuffer = cArr2;
    }

    private static int printSourceNumber(String str, int i11, StringBuffer stringBuffer) {
        int i12;
        char charAt = str.charAt(i11);
        int i13 = i11 + 1;
        if (charAt == 'S') {
            r3 = stringBuffer != null ? str.charAt(i13) : 0.0d;
            i12 = i11 + 2;
        } else {
            if (charAt != 'J' && charAt != 'D') {
                throw new RuntimeException();
            }
            if (stringBuffer != null) {
                long charAt2 = (str.charAt(i13) << 48) | (str.charAt(i11 + 2) << 32) | (str.charAt(i11 + 3) << 16) | str.charAt(i11 + 4);
                r3 = charAt == 'J' ? charAt2 : Double.longBitsToDouble(charAt2);
            }
            i12 = i11 + 5;
        }
        if (stringBuffer != null) {
            stringBuffer.append(ScriptRuntime.numberToString(r3, 10));
        }
        return i12;
    }

    private static int printSourceString(String str, int i11, boolean z11, StringBuffer stringBuffer) {
        int charAt = str.charAt(i11);
        int i12 = i11 + 1;
        if ((32768 & charAt) != 0) {
            charAt = ((charAt & 32767) << 16) | str.charAt(i12);
            i12 = i11 + 2;
        }
        if (stringBuffer != null) {
            String substring = str.substring(i12, i12 + charAt);
            if (z11) {
                stringBuffer.append('\"');
                stringBuffer.append(ScriptRuntime.escapeString(substring));
                stringBuffer.append('\"');
            } else {
                stringBuffer.append(substring);
            }
        }
        return i12 + charAt;
    }

    private String sourceToString(int i11) {
        if (i11 < 0 || this.sourceTop < i11) {
            Kit.codeBug();
        }
        return new String(this.sourceBuffer, i11, this.sourceTop - i11);
    }

    public void addEOL(int i11) {
        if (i11 < 0 || i11 > 163) {
            throw new IllegalArgumentException();
        }
        append((char) i11);
        append((char) 1);
    }

    public void addName(String str) {
        addToken(39);
        appendString(str);
    }

    public void addNumber(double d11) {
        addToken(40);
        long j11 = (long) d11;
        if (j11 != d11) {
            long doubleToLongBits = Double.doubleToLongBits(d11);
            append('D');
            append((char) (doubleToLongBits >> 48));
            append((char) (doubleToLongBits >> 32));
            append((char) (doubleToLongBits >> 16));
            append((char) doubleToLongBits);
            return;
        }
        if (j11 < 0) {
            Kit.codeBug();
        }
        if (j11 <= g.f63638t) {
            append('S');
            append((char) j11);
            return;
        }
        append('J');
        append((char) (j11 >> 48));
        append((char) (j11 >> 32));
        append((char) (j11 >> 16));
        append((char) j11);
    }

    public void addRegexp(String str, String str2) {
        addToken(48);
        appendString('/' + str + '/' + str2);
    }

    public void addString(String str) {
        addToken(41);
        appendString(str);
    }

    public void addToken(int i11) {
        if (i11 < 0 || i11 > 163) {
            throw new IllegalArgumentException();
        }
        append((char) i11);
    }

    public int getCurrentOffset() {
        return this.sourceTop;
    }

    public String getEncodedSource() {
        return sourceToString(0);
    }

    public int markFunctionEnd(int i11) {
        int currentOffset = getCurrentOffset();
        append((char) 164);
        return currentOffset;
    }

    public int markFunctionStart(int i11) {
        int currentOffset = getCurrentOffset();
        addToken(109);
        append((char) i11);
        return currentOffset;
    }
}

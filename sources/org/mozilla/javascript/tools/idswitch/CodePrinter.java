package org.mozilla.javascript.tools.idswitch;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
class CodePrinter {
    private static final int LITERAL_CHAR_MAX_SIZE = 6;
    private int offset;
    private String lineTerminator = "\n";
    private int indentStep = 4;
    private int indentTabSize = 8;
    private char[] buffer = new char[4096];

    private int add_area(int i11) {
        int ensure_area = ensure_area(i11);
        this.offset = i11 + ensure_area;
        return ensure_area;
    }

    private static char digit_to_hex_letter(int i11) {
        return (char) (i11 < 10 ? i11 + 48 : i11 + 55);
    }

    private int ensure_area(int i11) {
        int i12 = this.offset;
        int i13 = i11 + i12;
        char[] cArr = this.buffer;
        if (i13 > cArr.length) {
            int length = cArr.length * 2;
            if (i13 <= length) {
                i13 = length;
            }
            char[] cArr2 = new char[i13];
            System.arraycopy(cArr, 0, cArr2, 0, i12);
            this.buffer = cArr2;
        }
        return i12;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int put_string_literal_char(int r3, int r4, boolean r5) {
        /*
            r2 = this;
            r0 = 12
            r1 = 1
            if (r4 == r0) goto L26
            r0 = 13
            if (r4 == r0) goto L23
            r0 = 34
            if (r4 == r0) goto L29
            r0 = 39
            if (r4 == r0) goto L20
            switch(r4) {
                case 8: goto L1d;
                case 9: goto L1a;
                case 10: goto L16;
                default: goto L14;
            }
        L14:
            r5 = 0
            goto L29
        L16:
            r4 = 110(0x6e, float:1.54E-43)
        L18:
            r5 = r1
            goto L29
        L1a:
            r4 = 116(0x74, float:1.63E-43)
            goto L18
        L1d:
            r4 = 98
            goto L18
        L20:
            r5 = r5 ^ 1
            goto L29
        L23:
            r4 = 114(0x72, float:1.6E-43)
            goto L18
        L26:
            r4 = 102(0x66, float:1.43E-43)
            goto L18
        L29:
            r0 = 92
            if (r5 == 0) goto L39
            char[] r5 = r2.buffer
            r5[r3] = r0
            int r0 = r3 + 1
            char r4 = (char) r4
            r5[r0] = r4
            int r3 = r3 + 2
            return r3
        L39:
            r5 = 32
            if (r5 > r4) goto L48
            r5 = 126(0x7e, float:1.77E-43)
            if (r4 > r5) goto L48
            char[] r5 = r2.buffer
            char r4 = (char) r4
            r5[r3] = r4
            int r3 = r3 + r1
            return r3
        L48:
            char[] r5 = r2.buffer
            r5[r3] = r0
            int r0 = r3 + 1
            r1 = 117(0x75, float:1.64E-43)
            r5[r0] = r1
            int r0 = r3 + 2
            int r1 = r4 >> 12
            r1 = r1 & 15
            char r1 = digit_to_hex_letter(r1)
            r5[r0] = r1
            char[] r5 = r2.buffer
            int r0 = r3 + 3
            int r1 = r4 >> 8
            r1 = r1 & 15
            char r1 = digit_to_hex_letter(r1)
            r5[r0] = r1
            char[] r5 = r2.buffer
            int r0 = r3 + 4
            int r1 = r4 >> 4
            r1 = r1 & 15
            char r1 = digit_to_hex_letter(r1)
            r5[r0] = r1
            char[] r5 = r2.buffer
            int r0 = r3 + 5
            r4 = r4 & 15
            char r4 = digit_to_hex_letter(r4)
            r5[r0] = r4
            int r3 = r3 + 6
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.tools.idswitch.CodePrinter.put_string_literal_char(int, int, boolean):int");
    }

    public void clear() {
        this.offset = 0;
    }

    public void erase(int i11, int i12) {
        char[] cArr = this.buffer;
        System.arraycopy(cArr, i12, cArr, i11, this.offset - i12);
        this.offset -= i12 - i11;
    }

    public int getIndentStep() {
        return this.indentStep;
    }

    public int getIndentTabSize() {
        return this.indentTabSize;
    }

    public int getLastChar() {
        int i11 = this.offset;
        if (i11 == 0) {
            return -1;
        }
        return this.buffer[i11 - 1];
    }

    public String getLineTerminator() {
        return this.lineTerminator;
    }

    public int getOffset() {
        return this.offset;
    }

    public void indent(int i11) {
        int i12;
        int i13 = this.indentStep * i11;
        int i14 = this.indentTabSize;
        if (i14 <= 0) {
            i12 = 0;
        } else {
            int i15 = i13 / i14;
            i13 = (i13 % i14) + i15;
            i12 = i15;
        }
        int add_area = add_area(i13);
        int i16 = i12 + add_area;
        int i17 = i13 + add_area;
        while (add_area != i16) {
            this.buffer[add_area] = '\t';
            add_area++;
        }
        while (add_area != i17) {
            this.buffer[add_area] = ' ';
            add_area++;
        }
    }

    public void line(int i11, String str) {
        indent(i11);
        p(str);
        nl();
    }

    public void nl() {
        p('\n');
    }

    public void p(char c11) {
        this.buffer[add_area(1)] = c11;
    }

    public void qchar(int i11) {
        int ensure_area = ensure_area(8);
        this.buffer[ensure_area] = '\'';
        int put_string_literal_char = put_string_literal_char(ensure_area + 1, i11, false);
        this.buffer[put_string_literal_char] = '\'';
        this.offset = put_string_literal_char + 1;
    }

    public void qstring(String str) {
        int length = str.length();
        int ensure_area = ensure_area((length * 6) + 2);
        this.buffer[ensure_area] = '\"';
        int i11 = ensure_area + 1;
        for (int i12 = 0; i12 != length; i12++) {
            i11 = put_string_literal_char(i11, str.charAt(i12), true);
        }
        this.buffer[i11] = '\"';
        this.offset = i11 + 1;
    }

    public void setIndentStep(int i11) {
        this.indentStep = i11;
    }

    public void setIndentTabSize(int i11) {
        this.indentTabSize = i11;
    }

    public void setLineTerminator(String str) {
        this.lineTerminator = str;
    }

    public String toString() {
        return new String(this.buffer, 0, this.offset);
    }

    public void p(String str) {
        int length = str.length();
        str.getChars(0, length, this.buffer, add_area(length));
    }

    public final void p(char[] cArr) {
        p(cArr, 0, cArr.length);
    }

    public void p(char[] cArr, int i11, int i12) {
        int i13 = i12 - i11;
        System.arraycopy(cArr, i11, this.buffer, add_area(i13), i13);
    }

    public void p(int i11) {
        p(Integer.toString(i11));
    }
}

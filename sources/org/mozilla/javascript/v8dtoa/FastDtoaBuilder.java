package org.mozilla.javascript.v8dtoa;

import java.util.Arrays;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class FastDtoaBuilder {
    static final char[] digits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    final char[] chars = new char[25];
    int end = 0;
    boolean formatted = false;
    int point;

    private void toExponentialFormat(int i11, int i12) {
        char c11;
        int i13 = this.end;
        if (i13 - i11 > 1) {
            int i14 = i11 + 1;
            char[] cArr = this.chars;
            System.arraycopy(cArr, i14, cArr, i11 + 2, i13 - i14);
            this.chars[i14] = '.';
            this.end++;
        }
        char[] cArr2 = this.chars;
        int i15 = this.end;
        int i16 = i15 + 1;
        this.end = i16;
        cArr2[i15] = 'e';
        int i17 = i12 - 1;
        if (i17 < 0) {
            i17 = -i17;
            c11 = '-';
        } else {
            c11 = '+';
        }
        int i18 = i15 + 2;
        this.end = i18;
        cArr2[i16] = c11;
        if (i17 > 99) {
            i18 = i15 + 4;
        } else if (i17 > 9) {
            i18 = i15 + 3;
        }
        this.end = i18 + 1;
        while (true) {
            int i19 = i18 - 1;
            this.chars[i18] = digits[i17 % 10];
            i17 /= 10;
            if (i17 == 0) {
                return;
            } else {
                i18 = i19;
            }
        }
    }

    private void toFixedFormat(int i11, int i12) {
        int i13 = this.point;
        int i14 = this.end;
        if (i13 >= i14) {
            if (i13 > i14) {
                Arrays.fill(this.chars, i14, i13, '0');
                int i15 = this.end;
                this.end = i15 + (this.point - i15);
                return;
            }
            return;
        }
        if (i12 > 0) {
            char[] cArr = this.chars;
            System.arraycopy(cArr, i13, cArr, i13 + 1, i14 - i13);
            this.chars[this.point] = '.';
            this.end++;
            return;
        }
        int i16 = i11 + 2;
        int i17 = i16 - i12;
        char[] cArr2 = this.chars;
        System.arraycopy(cArr2, i11, cArr2, i17, i14 - i11);
        char[] cArr3 = this.chars;
        cArr3[i11] = '0';
        cArr3[i11 + 1] = '.';
        if (i12 < 0) {
            Arrays.fill(cArr3, i16, i17, '0');
        }
        this.end += 2 - i12;
    }

    public void append(char c11) {
        char[] cArr = this.chars;
        int i11 = this.end;
        this.end = i11 + 1;
        cArr[i11] = c11;
    }

    public void decreaseLast() {
        this.chars[this.end - 1] = (char) (r0[r1] - 1);
    }

    public String format() {
        if (!this.formatted) {
            int i11 = this.chars[0] == '-' ? 1 : 0;
            int i12 = this.point - i11;
            if (i12 < -5 || i12 > 21) {
                toExponentialFormat(i11, i12);
            } else {
                toFixedFormat(i11, i12);
            }
            this.formatted = true;
        }
        return new String(this.chars, 0, this.end);
    }

    public void reset() {
        this.end = 0;
        this.formatted = false;
    }

    public String toString() {
        return "[chars:" + new String(this.chars, 0, this.end) + ", point:" + this.point + "]";
    }
}

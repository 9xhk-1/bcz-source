package ko;

import com.google.common.base.Preconditions;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.b
@f
/* loaded from: classes7.dex */
public abstract class l extends h {

    /* renamed from: b, reason: collision with root package name */
    public static final int f66909b = 32;

    public static int c(CharSequence seq, int index, int end) {
        Preconditions.checkNotNull(seq);
        if (index >= end) {
            throw new IndexOutOfBoundsException("Index exceeds specified range");
        }
        int i11 = index + 1;
        char charAt = seq.charAt(index);
        if (charAt < 55296 || charAt > 57343) {
            return charAt;
        }
        if (charAt > 56319) {
            throw new IllegalArgumentException("Unexpected low surrogate character '" + charAt + "' with value " + ((int) charAt) + " at index " + index + " in '" + ((Object) seq) + "'");
        }
        if (i11 == end) {
            return -charAt;
        }
        char charAt2 = seq.charAt(i11);
        if (Character.isLowSurrogate(charAt2)) {
            return Character.toCodePoint(charAt, charAt2);
        }
        throw new IllegalArgumentException("Expected low surrogate but got char '" + charAt2 + "' with value " + ((int) charAt2) + " at index " + i11 + " in '" + ((Object) seq) + "'");
    }

    private static char[] f(char[] dest, int index, int size) {
        if (size < 0) {
            throw new AssertionError("Cannot increase internal buffer any further");
        }
        char[] cArr = new char[size];
        if (index > 0) {
            System.arraycopy(dest, 0, cArr, 0, index);
        }
        return cArr;
    }

    @Override // ko.h
    public String b(String string) {
        Preconditions.checkNotNull(string);
        int length = string.length();
        int g11 = g(string, 0, length);
        return g11 == length ? string : e(string, g11);
    }

    @CheckForNull
    public abstract char[] d(int cp2);

    public final String e(String s11, int index) {
        int length = s11.length();
        char[] a11 = k.a();
        int i11 = 0;
        int i12 = 0;
        while (index < length) {
            int c11 = c(s11, index, length);
            if (c11 < 0) {
                throw new IllegalArgumentException("Trailing high surrogate at end of input");
            }
            char[] d11 = d(c11);
            int i13 = (Character.isSupplementaryCodePoint(c11) ? 2 : 1) + index;
            if (d11 != null) {
                int i14 = index - i11;
                int i15 = i12 + i14;
                int length2 = d11.length + i15;
                if (a11.length < length2) {
                    a11 = f(a11, i12, length2 + (length - index) + 32);
                }
                if (i14 > 0) {
                    s11.getChars(i11, index, a11, i12);
                    i12 = i15;
                }
                if (d11.length > 0) {
                    System.arraycopy(d11, 0, a11, i12, d11.length);
                    i12 += d11.length;
                }
                i11 = i13;
            }
            index = g(s11, i13, length);
        }
        int i16 = length - i11;
        if (i16 > 0) {
            int i17 = i16 + i12;
            if (a11.length < i17) {
                a11 = f(a11, i12, i17);
            }
            s11.getChars(i11, length, a11, i12);
            i12 = i17;
        }
        return new String(a11, 0, i12);
    }

    public int g(CharSequence csq, int start, int end) {
        while (start < end) {
            int c11 = c(csq, start, end);
            if (c11 < 0 || d(c11) != null) {
                break;
            }
            start += Character.isSupplementaryCodePoint(c11) ? 2 : 1;
        }
        return start;
    }
}

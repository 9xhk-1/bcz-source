package ko;

import com.google.common.base.Preconditions;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.b
@f
/* loaded from: classes7.dex */
public abstract class d extends h {

    /* renamed from: b, reason: collision with root package name */
    public static final int f66894b = 2;

    public static char[] e(char[] dest, int index, int size) {
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
        for (int i11 = 0; i11 < length; i11++) {
            if (c(string.charAt(i11)) != null) {
                return d(string, i11);
            }
        }
        return string;
    }

    @CheckForNull
    public abstract char[] c(char c11);

    public final String d(String s11, int index) {
        int length = s11.length();
        char[] a11 = k.a();
        int length2 = a11.length;
        int i11 = 0;
        int i12 = 0;
        while (index < length) {
            char[] c11 = c(s11.charAt(index));
            if (c11 != null) {
                int length3 = c11.length;
                int i13 = index - i11;
                int i14 = i12 + i13;
                int i15 = i14 + length3;
                if (length2 < i15) {
                    length2 = ((length - index) * 2) + i15;
                    a11 = e(a11, i12, length2);
                }
                if (i13 > 0) {
                    s11.getChars(i11, index, a11, i12);
                    i12 = i14;
                }
                if (length3 > 0) {
                    System.arraycopy(c11, 0, a11, i12, length3);
                    i12 += length3;
                }
                i11 = index + 1;
            }
            index++;
        }
        int i16 = length - i11;
        if (i16 > 0) {
            int i17 = i16 + i12;
            if (length2 < i17) {
                a11 = e(a11, i12, i17);
            }
            s11.getChars(i11, length, a11, i12);
            i12 = i17;
        }
        return new String(a11, 0, i12);
    }
}

package lx;

import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class k {
    public static final int a(@m80.k CharSequence text, @m80.k j range) {
        g0.p(text, "text");
        g0.p(range, "range");
        int b11 = range.b();
        int a11 = range.a();
        if (b11 < a11 && !kotlin.text.a.r(text.charAt(b11))) {
            do {
                b11++;
                if (b11 >= a11) {
                    break;
                }
            } while (!kotlin.text.a.r(text.charAt(b11)));
        }
        return b11;
    }

    @m80.k
    public static final CharSequence b(@m80.k CharSequence text, @m80.k j range) {
        g0.p(text, "text");
        g0.p(range, "range");
        int a11 = a(text, range);
        CharSequence subSequence = text.subSequence(range.b(), a11);
        range.d(a11);
        return subSequence;
    }

    public static final void c(@m80.k CharSequence text, @m80.k j range) {
        g0.p(text, "text");
        g0.p(range, "range");
        int b11 = range.b();
        int a11 = range.a();
        if (b11 >= a11 || !kotlin.text.a.r(text.charAt(b11))) {
            return;
        }
        do {
            b11++;
            if (b11 >= a11) {
                break;
            }
        } while (kotlin.text.a.r(text.charAt(b11)));
        range.d(b11);
    }

    public static final int d(@m80.k d text, int i11, int i12) {
        g0.p(text, "text");
        while (i11 < i12) {
            char charAt = text.charAt(i11);
            if (!kotlin.text.a.r(charAt) && charAt != '\t') {
                break;
            }
            i11++;
        }
        return i11;
    }
}

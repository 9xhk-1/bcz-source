package l50;

import java.util.Arrays;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class w0 implements e0 {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public char[] f70082b = n.f70036c.d();

    /* renamed from: c, reason: collision with root package name */
    public int f70083c;

    private final int f(int i11, int i12) {
        int i13 = i12 + i11;
        char[] cArr = this.f70082b;
        if (cArr.length <= i13) {
            char[] copyOf = Arrays.copyOf(cArr, g10.u.u(i13, i11 * 2));
            kotlin.jvm.internal.g0.o(copyOf, "copyOf(...)");
            this.f70082b = copyOf;
        }
        return i11;
    }

    @Override // l50.e0
    public void a(char c11) {
        e(1);
        char[] cArr = this.f70082b;
        int i11 = this.f70083c;
        this.f70083c = i11 + 1;
        cArr[i11] = c11;
    }

    @Override // l50.e0
    public void b(@m80.k String text) {
        kotlin.jvm.internal.g0.p(text, "text");
        e(text.length() + 2);
        char[] cArr = this.f70082b;
        int i11 = this.f70083c;
        int i12 = i11 + 1;
        cArr[i11] = '\"';
        int length = text.length();
        text.getChars(0, length, cArr, i12);
        int i13 = length + i12;
        for (int i14 = i12; i14 < i13; i14++) {
            char c11 = cArr[i14];
            if (c11 < q1.a().length && q1.a()[c11] != 0) {
                d(i14 - i12, i14, text);
                return;
            }
        }
        cArr[i13] = '\"';
        this.f70083c = i13 + 1;
    }

    @Override // l50.e0
    public void c(@m80.k String text) {
        kotlin.jvm.internal.g0.p(text, "text");
        int length = text.length();
        if (length == 0) {
            return;
        }
        e(length);
        text.getChars(0, text.length(), this.f70082b, this.f70083c);
        this.f70083c += length;
    }

    public final void d(int i11, int i12, String str) {
        int i13;
        int length = str.length();
        while (i11 < length) {
            int f11 = f(i12, 2);
            char charAt = str.charAt(i11);
            if (charAt < q1.a().length) {
                byte b11 = q1.a()[charAt];
                if (b11 == 0) {
                    i13 = f11 + 1;
                    this.f70082b[f11] = charAt;
                } else {
                    if (b11 == 1) {
                        String str2 = q1.b()[charAt];
                        kotlin.jvm.internal.g0.m(str2);
                        int f12 = f(f11, str2.length());
                        str2.getChars(0, str2.length(), this.f70082b, f12);
                        i12 = f12 + str2.length();
                        this.f70083c = i12;
                    } else {
                        char[] cArr = this.f70082b;
                        cArr[f11] = '\\';
                        cArr[f11 + 1] = (char) b11;
                        i12 = f11 + 2;
                        this.f70083c = i12;
                    }
                    i11++;
                }
            } else {
                i13 = f11 + 1;
                this.f70082b[f11] = charAt;
            }
            i12 = i13;
            i11++;
        }
        int f13 = f(i12, 1);
        this.f70082b[f13] = '\"';
        this.f70083c = f13 + 1;
    }

    public final void e(int i11) {
        f(this.f70083c, i11);
    }

    @Override // l50.e0
    public void release() {
        n.f70036c.c(this.f70082b);
    }

    @m80.k
    public String toString() {
        return new String(this.f70082b, 0, this.f70083c);
    }

    @Override // l50.e0
    public void writeLong(long j11) {
        c(String.valueOf(j11));
    }
}

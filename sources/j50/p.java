package j50;

import java.util.Arrays;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@yz.v0
/* loaded from: classes8.dex */
public final class p extends p2<char[]> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public char[] f63445a;

    /* renamed from: b, reason: collision with root package name */
    public int f63446b;

    public p(@m80.k char[] bufferWithData) {
        kotlin.jvm.internal.g0.p(bufferWithData, "bufferWithData");
        this.f63445a = bufferWithData;
        this.f63446b = bufferWithData.length;
        b(10);
    }

    @Override // j50.p2
    public void b(int i11) {
        char[] cArr = this.f63445a;
        if (cArr.length < i11) {
            char[] copyOf = Arrays.copyOf(cArr, g10.u.u(i11, cArr.length * 2));
            kotlin.jvm.internal.g0.o(copyOf, "copyOf(...)");
            this.f63445a = copyOf;
        }
    }

    @Override // j50.p2
    public int d() {
        return this.f63446b;
    }

    public final void e(char c11) {
        p2.c(this, 0, 1, null);
        char[] cArr = this.f63445a;
        int d11 = d();
        this.f63446b = d11 + 1;
        cArr[d11] = c11;
    }

    @Override // j50.p2
    @m80.k
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public char[] a() {
        char[] copyOf = Arrays.copyOf(this.f63445a, d());
        kotlin.jvm.internal.g0.o(copyOf, "copyOf(...)");
        return copyOf;
    }
}

package j50;

import java.util.Arrays;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@yz.v0
/* loaded from: classes8.dex */
public final class x0 extends p2<int[]> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public int[] f63504a;

    /* renamed from: b, reason: collision with root package name */
    public int f63505b;

    public x0(@m80.k int[] bufferWithData) {
        kotlin.jvm.internal.g0.p(bufferWithData, "bufferWithData");
        this.f63504a = bufferWithData;
        this.f63505b = bufferWithData.length;
        b(10);
    }

    @Override // j50.p2
    public void b(int i11) {
        int[] iArr = this.f63504a;
        if (iArr.length < i11) {
            int[] copyOf = Arrays.copyOf(iArr, g10.u.u(i11, iArr.length * 2));
            kotlin.jvm.internal.g0.o(copyOf, "copyOf(...)");
            this.f63504a = copyOf;
        }
    }

    @Override // j50.p2
    public int d() {
        return this.f63505b;
    }

    public final void e(int i11) {
        p2.c(this, 0, 1, null);
        int[] iArr = this.f63504a;
        int d11 = d();
        this.f63505b = d11 + 1;
        iArr[d11] = i11;
    }

    @Override // j50.p2
    @m80.k
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public int[] a() {
        int[] copyOf = Arrays.copyOf(this.f63504a, d());
        kotlin.jvm.internal.g0.o(copyOf, "copyOf(...)");
        return copyOf;
    }
}

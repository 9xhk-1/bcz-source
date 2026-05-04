package j50;

import java.util.Arrays;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@yz.v0
@f50.f
@kotlin.d
/* loaded from: classes8.dex */
public final class p3 extends p2<yz.t1> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public int[] f63449a;

    /* renamed from: b, reason: collision with root package name */
    public int f63450b;

    public /* synthetic */ p3(int[] iArr, kotlin.jvm.internal.v vVar) {
        this(iArr);
    }

    @Override // j50.p2
    public /* bridge */ /* synthetic */ yz.t1 a() {
        return yz.t1.b(f());
    }

    @Override // j50.p2
    public void b(int i11) {
        if (yz.t1.o(this.f63449a) < i11) {
            int[] iArr = this.f63449a;
            int[] copyOf = Arrays.copyOf(iArr, g10.u.u(i11, yz.t1.o(iArr) * 2));
            kotlin.jvm.internal.g0.o(copyOf, "copyOf(...)");
            this.f63449a = yz.t1.f(copyOf);
        }
    }

    @Override // j50.p2
    public int d() {
        return this.f63450b;
    }

    public final void e(int i11) {
        p2.c(this, 0, 1, null);
        int[] iArr = this.f63449a;
        int d11 = d();
        this.f63450b = d11 + 1;
        yz.t1.u(iArr, d11, i11);
    }

    @m80.k
    public int[] f() {
        int[] copyOf = Arrays.copyOf(this.f63449a, d());
        kotlin.jvm.internal.g0.o(copyOf, "copyOf(...)");
        return yz.t1.f(copyOf);
    }

    public p3(int[] bufferWithData) {
        kotlin.jvm.internal.g0.p(bufferWithData, "bufferWithData");
        this.f63449a = bufferWithData;
        this.f63450b = yz.t1.o(bufferWithData);
        b(10);
    }
}

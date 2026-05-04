package j50;

import java.util.Arrays;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@yz.v0
/* loaded from: classes8.dex */
public final class c0 extends p2<double[]> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public double[] f63338a;

    /* renamed from: b, reason: collision with root package name */
    public int f63339b;

    public c0(@m80.k double[] bufferWithData) {
        kotlin.jvm.internal.g0.p(bufferWithData, "bufferWithData");
        this.f63338a = bufferWithData;
        this.f63339b = bufferWithData.length;
        b(10);
    }

    @Override // j50.p2
    public void b(int i11) {
        double[] dArr = this.f63338a;
        if (dArr.length < i11) {
            double[] copyOf = Arrays.copyOf(dArr, g10.u.u(i11, dArr.length * 2));
            kotlin.jvm.internal.g0.o(copyOf, "copyOf(...)");
            this.f63338a = copyOf;
        }
    }

    @Override // j50.p2
    public int d() {
        return this.f63339b;
    }

    public final void e(double d11) {
        p2.c(this, 0, 1, null);
        double[] dArr = this.f63338a;
        int d12 = d();
        this.f63339b = d12 + 1;
        dArr[d12] = d11;
    }

    @Override // j50.p2
    @m80.k
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public double[] a() {
        double[] copyOf = Arrays.copyOf(this.f63338a, d());
        kotlin.jvm.internal.g0.o(copyOf, "copyOf(...)");
        return copyOf;
    }
}

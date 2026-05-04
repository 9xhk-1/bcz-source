package j50;

import java.util.Arrays;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@yz.v0
@f50.f
@kotlin.d
/* loaded from: classes8.dex */
public final class m3 extends p2<yz.p1> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public byte[] f63428a;

    /* renamed from: b, reason: collision with root package name */
    public int f63429b;

    public /* synthetic */ m3(byte[] bArr, kotlin.jvm.internal.v vVar) {
        this(bArr);
    }

    @Override // j50.p2
    public /* bridge */ /* synthetic */ yz.p1 a() {
        return yz.p1.b(f());
    }

    @Override // j50.p2
    public void b(int i11) {
        if (yz.p1.o(this.f63428a) < i11) {
            byte[] bArr = this.f63428a;
            byte[] copyOf = Arrays.copyOf(bArr, g10.u.u(i11, yz.p1.o(bArr) * 2));
            kotlin.jvm.internal.g0.o(copyOf, "copyOf(...)");
            this.f63428a = yz.p1.f(copyOf);
        }
    }

    @Override // j50.p2
    public int d() {
        return this.f63429b;
    }

    public final void e(byte b11) {
        p2.c(this, 0, 1, null);
        byte[] bArr = this.f63428a;
        int d11 = d();
        this.f63429b = d11 + 1;
        yz.p1.u(bArr, d11, b11);
    }

    @m80.k
    public byte[] f() {
        byte[] copyOf = Arrays.copyOf(this.f63428a, d());
        kotlin.jvm.internal.g0.o(copyOf, "copyOf(...)");
        return yz.p1.f(copyOf);
    }

    public m3(byte[] bufferWithData) {
        kotlin.jvm.internal.g0.p(bufferWithData, "bufferWithData");
        this.f63428a = bufferWithData;
        this.f63429b = yz.p1.o(bufferWithData);
        b(10);
    }
}

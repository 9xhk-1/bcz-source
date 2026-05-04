package j50;

import java.util.Arrays;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@yz.v0
@f50.f
@kotlin.d
/* loaded from: classes8.dex */
public final class v3 extends p2<yz.d2> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public short[] f63487a;

    /* renamed from: b, reason: collision with root package name */
    public int f63488b;

    public /* synthetic */ v3(short[] sArr, kotlin.jvm.internal.v vVar) {
        this(sArr);
    }

    @Override // j50.p2
    public /* bridge */ /* synthetic */ yz.d2 a() {
        return yz.d2.b(f());
    }

    @Override // j50.p2
    public void b(int i11) {
        if (yz.d2.o(this.f63487a) < i11) {
            short[] sArr = this.f63487a;
            short[] copyOf = Arrays.copyOf(sArr, g10.u.u(i11, yz.d2.o(sArr) * 2));
            kotlin.jvm.internal.g0.o(copyOf, "copyOf(...)");
            this.f63487a = yz.d2.f(copyOf);
        }
    }

    @Override // j50.p2
    public int d() {
        return this.f63488b;
    }

    public final void e(short s11) {
        p2.c(this, 0, 1, null);
        short[] sArr = this.f63487a;
        int d11 = d();
        this.f63488b = d11 + 1;
        yz.d2.u(sArr, d11, s11);
    }

    @m80.k
    public short[] f() {
        short[] copyOf = Arrays.copyOf(this.f63487a, d());
        kotlin.jvm.internal.g0.o(copyOf, "copyOf(...)");
        return yz.d2.f(copyOf);
    }

    public v3(short[] bufferWithData) {
        kotlin.jvm.internal.g0.p(bufferWithData, "bufferWithData");
        this.f63487a = bufferWithData;
        this.f63488b = yz.d2.o(bufferWithData);
        b(10);
    }
}

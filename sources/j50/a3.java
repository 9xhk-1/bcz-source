package j50;

import java.util.Arrays;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@yz.v0
/* loaded from: classes8.dex */
public final class a3 extends p2<short[]> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public short[] f63333a;

    /* renamed from: b, reason: collision with root package name */
    public int f63334b;

    public a3(@m80.k short[] bufferWithData) {
        kotlin.jvm.internal.g0.p(bufferWithData, "bufferWithData");
        this.f63333a = bufferWithData;
        this.f63334b = bufferWithData.length;
        b(10);
    }

    @Override // j50.p2
    public void b(int i11) {
        short[] sArr = this.f63333a;
        if (sArr.length < i11) {
            short[] copyOf = Arrays.copyOf(sArr, g10.u.u(i11, sArr.length * 2));
            kotlin.jvm.internal.g0.o(copyOf, "copyOf(...)");
            this.f63333a = copyOf;
        }
    }

    @Override // j50.p2
    public int d() {
        return this.f63334b;
    }

    public final void e(short s11) {
        p2.c(this, 0, 1, null);
        short[] sArr = this.f63333a;
        int d11 = d();
        this.f63334b = d11 + 1;
        sArr[d11] = s11;
    }

    @Override // j50.p2
    @m80.k
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public short[] a() {
        short[] copyOf = Arrays.copyOf(this.f63333a, d());
        kotlin.jvm.internal.g0.o(copyOf, "copyOf(...)");
        return copyOf;
    }
}

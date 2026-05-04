package j50;

import java.util.Arrays;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@yz.v0
/* loaded from: classes8.dex */
public final class j extends p2<byte[]> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public byte[] f63386a;

    /* renamed from: b, reason: collision with root package name */
    public int f63387b;

    public j(@m80.k byte[] bufferWithData) {
        kotlin.jvm.internal.g0.p(bufferWithData, "bufferWithData");
        this.f63386a = bufferWithData;
        this.f63387b = bufferWithData.length;
        b(10);
    }

    @Override // j50.p2
    public void b(int i11) {
        byte[] bArr = this.f63386a;
        if (bArr.length < i11) {
            byte[] copyOf = Arrays.copyOf(bArr, g10.u.u(i11, bArr.length * 2));
            kotlin.jvm.internal.g0.o(copyOf, "copyOf(...)");
            this.f63386a = copyOf;
        }
    }

    @Override // j50.p2
    public int d() {
        return this.f63387b;
    }

    public final void e(byte b11) {
        p2.c(this, 0, 1, null);
        byte[] bArr = this.f63386a;
        int d11 = d();
        this.f63387b = d11 + 1;
        bArr[d11] = b11;
    }

    @Override // j50.p2
    @m80.k
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public byte[] a() {
        byte[] copyOf = Arrays.copyOf(this.f63386a, d());
        kotlin.jvm.internal.g0.o(copyOf, "copyOf(...)");
        return copyOf;
    }
}

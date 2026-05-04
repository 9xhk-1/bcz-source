package j50;

import java.util.Arrays;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@yz.v0
/* loaded from: classes8.dex */
public final class j1 extends p2<long[]> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public long[] f63390a;

    /* renamed from: b, reason: collision with root package name */
    public int f63391b;

    public j1(@m80.k long[] bufferWithData) {
        kotlin.jvm.internal.g0.p(bufferWithData, "bufferWithData");
        this.f63390a = bufferWithData;
        this.f63391b = bufferWithData.length;
        b(10);
    }

    @Override // j50.p2
    public void b(int i11) {
        long[] jArr = this.f63390a;
        if (jArr.length < i11) {
            long[] copyOf = Arrays.copyOf(jArr, g10.u.u(i11, jArr.length * 2));
            kotlin.jvm.internal.g0.o(copyOf, "copyOf(...)");
            this.f63390a = copyOf;
        }
    }

    @Override // j50.p2
    public int d() {
        return this.f63391b;
    }

    public final void e(long j11) {
        p2.c(this, 0, 1, null);
        long[] jArr = this.f63390a;
        int d11 = d();
        this.f63391b = d11 + 1;
        jArr[d11] = j11;
    }

    @Override // j50.p2
    @m80.k
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public long[] a() {
        long[] copyOf = Arrays.copyOf(this.f63390a, d());
        kotlin.jvm.internal.g0.o(copyOf, "copyOf(...)");
        return copyOf;
    }
}

package j50;

import java.util.Arrays;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@yz.v0
@f50.f
@kotlin.d
/* loaded from: classes8.dex */
public final class s3 extends p2<yz.x1> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public long[] f63462a;

    /* renamed from: b, reason: collision with root package name */
    public int f63463b;

    public /* synthetic */ s3(long[] jArr, kotlin.jvm.internal.v vVar) {
        this(jArr);
    }

    @Override // j50.p2
    public /* bridge */ /* synthetic */ yz.x1 a() {
        return yz.x1.b(f());
    }

    @Override // j50.p2
    public void b(int i11) {
        if (yz.x1.o(this.f63462a) < i11) {
            long[] jArr = this.f63462a;
            long[] copyOf = Arrays.copyOf(jArr, g10.u.u(i11, yz.x1.o(jArr) * 2));
            kotlin.jvm.internal.g0.o(copyOf, "copyOf(...)");
            this.f63462a = yz.x1.f(copyOf);
        }
    }

    @Override // j50.p2
    public int d() {
        return this.f63463b;
    }

    public final void e(long j11) {
        p2.c(this, 0, 1, null);
        long[] jArr = this.f63462a;
        int d11 = d();
        this.f63463b = d11 + 1;
        yz.x1.u(jArr, d11, j11);
    }

    @m80.k
    public long[] f() {
        long[] copyOf = Arrays.copyOf(this.f63462a, d());
        kotlin.jvm.internal.g0.o(copyOf, "copyOf(...)");
        return yz.x1.f(copyOf);
    }

    public s3(long[] bufferWithData) {
        kotlin.jvm.internal.g0.p(bufferWithData, "bufferWithData");
        this.f63462a = bufferWithData;
        this.f63463b = yz.x1.o(bufferWithData);
        b(10);
    }
}

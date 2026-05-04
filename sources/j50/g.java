package j50;

import java.util.Arrays;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@yz.v0
/* loaded from: classes8.dex */
public final class g extends p2<boolean[]> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public boolean[] f63359a;

    /* renamed from: b, reason: collision with root package name */
    public int f63360b;

    public g(@m80.k boolean[] bufferWithData) {
        kotlin.jvm.internal.g0.p(bufferWithData, "bufferWithData");
        this.f63359a = bufferWithData;
        this.f63360b = bufferWithData.length;
        b(10);
    }

    @Override // j50.p2
    public void b(int i11) {
        boolean[] zArr = this.f63359a;
        if (zArr.length < i11) {
            boolean[] copyOf = Arrays.copyOf(zArr, g10.u.u(i11, zArr.length * 2));
            kotlin.jvm.internal.g0.o(copyOf, "copyOf(...)");
            this.f63359a = copyOf;
        }
    }

    @Override // j50.p2
    public int d() {
        return this.f63360b;
    }

    public final void e(boolean z11) {
        p2.c(this, 0, 1, null);
        boolean[] zArr = this.f63359a;
        int d11 = d();
        this.f63360b = d11 + 1;
        zArr[d11] = z11;
    }

    @Override // j50.p2
    @m80.k
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean[] a() {
        boolean[] copyOf = Arrays.copyOf(this.f63359a, d());
        kotlin.jvm.internal.g0.o(copyOf, "copyOf(...)");
        return copyOf;
    }
}

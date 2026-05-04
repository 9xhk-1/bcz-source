package j50;

import java.util.Arrays;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@yz.v0
/* loaded from: classes8.dex */
public final class m0 extends p2<float[]> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public float[] f63423a;

    /* renamed from: b, reason: collision with root package name */
    public int f63424b;

    public m0(@m80.k float[] bufferWithData) {
        kotlin.jvm.internal.g0.p(bufferWithData, "bufferWithData");
        this.f63423a = bufferWithData;
        this.f63424b = bufferWithData.length;
        b(10);
    }

    @Override // j50.p2
    public void b(int i11) {
        float[] fArr = this.f63423a;
        if (fArr.length < i11) {
            float[] copyOf = Arrays.copyOf(fArr, g10.u.u(i11, fArr.length * 2));
            kotlin.jvm.internal.g0.o(copyOf, "copyOf(...)");
            this.f63423a = copyOf;
        }
    }

    @Override // j50.p2
    public int d() {
        return this.f63424b;
    }

    public final void e(float f11) {
        p2.c(this, 0, 1, null);
        float[] fArr = this.f63423a;
        int d11 = d();
        this.f63424b = d11 + 1;
        fArr[d11] = f11;
    }

    @Override // j50.p2
    @m80.k
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public float[] a() {
        float[] copyOf = Arrays.copyOf(this.f63423a, d());
        kotlin.jvm.internal.g0.o(copyOf, "copyOf(...)");
        return copyOf;
    }
}

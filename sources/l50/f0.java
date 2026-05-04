package l50;

import java.io.InputStream;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class f0 implements c0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final r f69988a;

    public f0(@m80.k InputStream stream) {
        kotlin.jvm.internal.g0.p(stream, "stream");
        this.f69988a = new r(stream, u30.d.f91599b);
    }

    @Override // l50.c0
    public int a(@m80.k char[] buffer, int i11, int i12) {
        kotlin.jvm.internal.g0.p(buffer, "buffer");
        return this.f69988a.d(buffer, i11, i12);
    }

    public final void b() {
        this.f69988a.e();
    }
}

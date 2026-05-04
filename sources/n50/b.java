package n50;

import kotlin.jvm.internal.g0;
import l50.d0;
import m80.k;
import y40.c0;
import y40.i0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class b extends d0 {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final c0 f74473b;

    public b(@k c0 source) {
        g0.p(source, "source");
        this.f74473b = source;
    }

    @Override // l50.d0
    public boolean b() {
        return this.f74473b.J();
    }

    @Override // l50.d0
    public int c() {
        return i0.e(this.f74473b);
    }
}

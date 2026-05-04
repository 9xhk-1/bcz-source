package b20;

import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class o implements n {

    /* renamed from: a, reason: collision with root package name */
    public v20.c f5746a;

    @Override // b20.n
    @m80.l
    public p10.b a(@m80.k f20.g javaClass) {
        g0.p(javaClass, "javaClass");
        return b().b(javaClass);
    }

    @m80.k
    public final v20.c b() {
        v20.c cVar = this.f5746a;
        if (cVar != null) {
            return cVar;
        }
        g0.S("resolver");
        return null;
    }

    public final void c(@m80.k v20.c cVar) {
        g0.p(cVar, "<set-?>");
        this.f5746a = cVar;
    }
}

package k50;

import l50.t0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class z extends a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(@m80.k g configuration, @m80.k o50.f module) {
        super(configuration, module, null);
        kotlin.jvm.internal.g0.p(configuration, "configuration");
        kotlin.jvm.internal.g0.p(module, "module");
        m();
    }

    public final void m() {
        if (kotlin.jvm.internal.g0.g(getSerializersModule(), o50.h.a())) {
            return;
        }
        getSerializersModule().a(new t0(i()));
    }
}

package kotlin.reflect.jvm.internal.impl.builtins.functions;

import a00.h0;
import d30.n;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.reflect.jvm.internal.impl.builtins.functions.e;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class c extends x20.f {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(@k n storageManager, @k b containingClass) {
        super(storageManager, containingClass);
        g0.p(storageManager, "storageManager");
        g0.p(containingClass, "containingClass");
    }

    @Override // x20.f
    @k
    public List<kotlin.reflect.jvm.internal.impl.descriptors.e> k() {
        p10.b n11 = n();
        g0.n(n11, "null cannot be cast to non-null type org.jetbrains.kotlin.builtins.functions.FunctionClassDescriptor");
        e P0 = ((b) n11).P0();
        return g0.g(P0, e.a.f67204e) ? a00.g0.l(d.E.a((b) n(), false)) : g0.g(P0, e.d.f67207e) ? a00.g0.l(d.E.a((b) n(), true)) : h0.J();
    }
}

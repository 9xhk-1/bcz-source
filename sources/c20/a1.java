package c20;

import c20.t0;
import java.util.Collection;
import java.util.List;
import p10.c1;
import p10.j1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class a1 extends t0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a1(@m80.k b20.k c11) {
        super(c11, null, 2, 0 == true ? 1 : 0);
        kotlin.jvm.internal.g0.p(c11, "c");
    }

    @Override // c20.t0
    public void D(@m80.k n20.f name, @m80.k Collection<p10.q0> result) {
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(result, "result");
    }

    @Override // c20.t0
    @m80.l
    public p10.t0 P() {
        return null;
    }

    @Override // c20.t0
    @m80.k
    public t0.a Z(@m80.k f20.r method, @m80.k List<? extends c1> methodTypeParameters, @m80.k e30.r0 returnType, @m80.k List<? extends j1> valueParameters) {
        kotlin.jvm.internal.g0.p(method, "method");
        kotlin.jvm.internal.g0.p(methodTypeParameters, "methodTypeParameters");
        kotlin.jvm.internal.g0.p(returnType, "returnType");
        kotlin.jvm.internal.g0.p(valueParameters, "valueParameters");
        return new t0.a(returnType, null, valueParameters, methodTypeParameters, false, a00.h0.J());
    }
}

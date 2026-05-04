package s20;

import e30.r0;
import java.util.List;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class b extends g<List<? extends g<?>>> {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final x00.l<p10.a0, r0> f87439b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(@m80.k List<? extends g<?>> value, @m80.k x00.l<? super p10.a0, ? extends r0> computeType) {
        super(value);
        g0.p(value, "value");
        g0.p(computeType, "computeType");
        this.f87439b = computeType;
    }

    @Override // s20.g
    @m80.k
    public r0 a(@m80.k p10.a0 module) {
        g0.p(module, "module");
        r0 invoke = this.f87439b.invoke(module);
        if (!n10.j.c0(invoke) && !n10.j.q0(invoke)) {
            n10.j.D0(invoke);
        }
        return invoke;
    }
}

package y10;

import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition;
import p10.q0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class p implements ExternalOverridabilityCondition {
    @Override // kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    @m80.k
    public ExternalOverridabilityCondition.Result a(@m80.k kotlin.reflect.jvm.internal.impl.descriptors.a superDescriptor, @m80.k kotlin.reflect.jvm.internal.impl.descriptors.a subDescriptor, @m80.l p10.b bVar) {
        kotlin.jvm.internal.g0.p(superDescriptor, "superDescriptor");
        kotlin.jvm.internal.g0.p(subDescriptor, "subDescriptor");
        if (!(subDescriptor instanceof q0) || !(superDescriptor instanceof q0)) {
            return ExternalOverridabilityCondition.Result.UNKNOWN;
        }
        q0 q0Var = (q0) subDescriptor;
        q0 q0Var2 = (q0) superDescriptor;
        return !kotlin.jvm.internal.g0.g(q0Var.getName(), q0Var2.getName()) ? ExternalOverridabilityCondition.Result.UNKNOWN : (c20.d.a(q0Var) && c20.d.a(q0Var2)) ? ExternalOverridabilityCondition.Result.OVERRIDABLE : (c20.d.a(q0Var) || c20.d.a(q0Var2)) ? ExternalOverridabilityCondition.Result.INCOMPATIBLE : ExternalOverridabilityCondition.Result.UNKNOWN;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    @m80.k
    public ExternalOverridabilityCondition.Contract b() {
        return ExternalOverridabilityCondition.Contract.BOTH;
    }
}

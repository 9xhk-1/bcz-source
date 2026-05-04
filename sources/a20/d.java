package a20;

import kotlin.jvm.internal.g0;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import m80.k;
import m80.l;
import p10.q0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class d extends f {

    @k
    public final kotlin.reflect.jvm.internal.impl.descriptors.g H;

    @l
    public final kotlin.reflect.jvm.internal.impl.descriptors.g I;

    @k
    public final q0 J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(@k p10.b ownerDescriptor, @k kotlin.reflect.jvm.internal.impl.descriptors.g getterMethod, @l kotlin.reflect.jvm.internal.impl.descriptors.g gVar, @k q0 overriddenProperty) {
        super(ownerDescriptor, q10.g.A0.b(), getterMethod.k(), getterMethod.getVisibility(), gVar != null, overriddenProperty.getName(), getterMethod.getSource(), null, CallableMemberDescriptor.Kind.DECLARATION, false, null);
        g0.p(ownerDescriptor, "ownerDescriptor");
        g0.p(getterMethod, "getterMethod");
        g0.p(overriddenProperty, "overriddenProperty");
        this.H = getterMethod;
        this.I = gVar;
        this.J = overriddenProperty;
    }
}

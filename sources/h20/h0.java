package h20;

import e30.r0;
import java.util.Collection;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class h0 implements g0<s> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final h0 f58095a = new h0();

    @Override // h20.g0
    @m80.l
    public r0 a(r0 kotlinType) {
        kotlin.jvm.internal.g0.p(kotlinType, "kotlinType");
        return null;
    }

    @Override // h20.g0
    @m80.l
    public String b(@m80.k p10.b classDescriptor) {
        kotlin.jvm.internal.g0.p(classDescriptor, "classDescriptor");
        return null;
    }

    @Override // h20.g0
    public void d(@m80.k r0 kotlinType, @m80.k p10.b descriptor) {
        kotlin.jvm.internal.g0.p(kotlinType, "kotlinType");
        kotlin.jvm.internal.g0.p(descriptor, "descriptor");
    }

    @Override // h20.g0
    @m80.k
    public r0 e(@m80.k Collection<? extends r0> types) {
        kotlin.jvm.internal.g0.p(types, "types");
        throw new AssertionError("There should be no intersection type in existing descriptors, but found: " + a00.r0.r3(types, null, null, null, 0, null, null, 63, null));
    }

    @Override // h20.g0
    @m80.l
    public String f(p10.b classDescriptor) {
        kotlin.jvm.internal.g0.p(classDescriptor, "classDescriptor");
        return null;
    }

    @Override // h20.g0
    @m80.l
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public s c(@m80.k p10.b classDescriptor) {
        kotlin.jvm.internal.g0.p(classDescriptor, "classDescriptor");
        return null;
    }
}

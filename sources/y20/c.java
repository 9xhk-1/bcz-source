package y20;

import e30.r0;
import kotlin.jvm.internal.g0;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class c extends a implements f {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final kotlin.reflect.jvm.internal.impl.descriptors.a f99218c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final n20.f f99219d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(@m80.k kotlin.reflect.jvm.internal.impl.descriptors.a declarationDescriptor, @m80.k r0 receiverType, @l n20.f fVar, @l h hVar) {
        super(receiverType, hVar);
        g0.p(declarationDescriptor, "declarationDescriptor");
        g0.p(receiverType, "receiverType");
        this.f99218c = declarationDescriptor;
        this.f99219d = fVar;
    }

    @Override // y20.f
    @l
    public n20.f a() {
        return this.f99219d;
    }

    @m80.k
    public kotlin.reflect.jvm.internal.impl.descriptors.a d() {
        return this.f99218c;
    }

    @m80.k
    public String toString() {
        return "Cxt { " + d() + " }";
    }
}

package k10;

import kotlin.reflect.jvm.internal.KDeclarationContainerImpl;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nutil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 util.kt\nkotlin/reflect/jvm/internal/CreateKCallableVisitor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,330:1\n1#2:331\n*E\n"})
/* loaded from: classes8.dex */
public class n extends s10.o<kotlin.reflect.jvm.internal.e<?>, yz.g2> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final KDeclarationContainerImpl f64970a;

    public n(@m80.k KDeclarationContainerImpl container) {
        kotlin.jvm.internal.g0.p(container, "container");
        this.f64970a = container;
    }

    @Override // s10.o, p10.j
    @m80.k
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public kotlin.reflect.jvm.internal.e<?> k(@m80.k kotlin.reflect.jvm.internal.impl.descriptors.e descriptor, @m80.k yz.g2 data) {
        kotlin.jvm.internal.g0.p(descriptor, "descriptor");
        kotlin.jvm.internal.g0.p(data, "data");
        return new kotlin.reflect.jvm.internal.g(this.f64970a, descriptor);
    }

    @Override // s10.o, p10.j
    @m80.k
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public kotlin.reflect.jvm.internal.e<?> h(@m80.k p10.q0 descriptor, @m80.k yz.g2 data) {
        kotlin.jvm.internal.g0.p(descriptor, "descriptor");
        kotlin.jvm.internal.g0.p(data, "data");
        int i11 = (descriptor.d0() != null ? 1 : 0) + (descriptor.f0() != null ? 1 : 0);
        if (descriptor.E()) {
            if (i11 == 0) {
                return new kotlin.reflect.jvm.internal.h(this.f64970a, descriptor);
            }
            if (i11 == 1) {
                return new kotlin.reflect.jvm.internal.i(this.f64970a, descriptor);
            }
            if (i11 == 2) {
                return new kotlin.reflect.jvm.internal.j(this.f64970a, descriptor);
            }
        } else {
            if (i11 == 0) {
                return new kotlin.reflect.jvm.internal.m(this.f64970a, descriptor);
            }
            if (i11 == 1) {
                return new kotlin.reflect.jvm.internal.n(this.f64970a, descriptor);
            }
            if (i11 == 2) {
                return new kotlin.reflect.jvm.internal.o(this.f64970a, descriptor);
            }
        }
        throw new KotlinReflectionInternalError("Unsupported property: " + descriptor);
    }
}

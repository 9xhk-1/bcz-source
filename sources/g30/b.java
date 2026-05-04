package g30;

import a00.h0;
import e30.d2;
import e30.r0;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.a;
import kotlin.reflect.jvm.internal.impl.descriptors.e;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import m80.k;
import m80.l;
import p10.c1;
import p10.j1;
import p10.o;
import p10.p;
import p10.t0;
import p10.x0;
import s10.o0;
import s10.s;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class b extends o0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@k p10.b containingDeclaration) {
        super(containingDeclaration, null, q10.g.A0.b(), n20.f.k(ErrorEntity.ERROR_FUNCTION.getDebugText()), CallableMemberDescriptor.Kind.DECLARATION, x0.f78622a);
        g0.p(containingDeclaration, "containingDeclaration");
        M0(null, null, h0.J(), h0.J(), h0.J(), i.d(ErrorTypeKind.RETURN_TYPE_FOR_FUNCTION, new String[0]), Modality.OPEN, o.f78590e);
    }

    @Override // s10.o0, s10.s
    @k
    /* renamed from: G0 */
    public s j1(@k p10.h newOwner, @l kotlin.reflect.jvm.internal.impl.descriptors.e eVar, @k CallableMemberDescriptor.Kind kind, @l n20.f fVar, @k q10.g annotations, @k x0 source) {
        g0.p(newOwner, "newOwner");
        g0.p(kind, "kind");
        g0.p(annotations, "annotations");
        g0.p(source, "source");
        return this;
    }

    @Override // s10.s, kotlin.reflect.jvm.internal.impl.descriptors.a
    @l
    public <V> V P(@k a.InterfaceC0792a<V> key) {
        g0.p(key, "key");
        return null;
    }

    @Override // s10.s, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    public void T(@k Collection<? extends CallableMemberDescriptor> overriddenDescriptors) {
        g0.p(overriddenDescriptors, "overriddenDescriptors");
    }

    @Override // s10.o0, s10.s, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    @k
    /* renamed from: f1, reason: merged with bridge method [inline-methods] */
    public kotlin.reflect.jvm.internal.impl.descriptors.g g0(@k p10.h newOwner, @k Modality modality, @k p visibility, @k CallableMemberDescriptor.Kind kind, boolean z11) {
        g0.p(newOwner, "newOwner");
        g0.p(modality, "modality");
        g0.p(visibility, "visibility");
        g0.p(kind, "kind");
        return this;
    }

    @Override // s10.s, kotlin.reflect.jvm.internal.impl.descriptors.e
    public boolean isSuspend() {
        return false;
    }

    @Override // s10.o0, s10.s, kotlin.reflect.jvm.internal.impl.descriptors.e, kotlin.reflect.jvm.internal.impl.descriptors.g
    @k
    public e.a<kotlin.reflect.jvm.internal.impl.descriptors.g> n() {
        return new a();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements e.a<kotlin.reflect.jvm.internal.impl.descriptors.g> {
        public a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.e.a
        public e.a<kotlin.reflect.jvm.internal.impl.descriptors.g> a(q10.g additionalAnnotations) {
            g0.p(additionalAnnotations, "additionalAnnotations");
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.e.a
        public <V> e.a<kotlin.reflect.jvm.internal.impl.descriptors.g> b(a.InterfaceC0792a<V> userDataKey, V v11) {
            g0.p(userDataKey, "userDataKey");
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.e.a
        public e.a<kotlin.reflect.jvm.internal.impl.descriptors.g> g(List<? extends c1> parameters) {
            g0.p(parameters, "parameters");
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.e.a
        public e.a<kotlin.reflect.jvm.internal.impl.descriptors.g> h(d2 substitution) {
            g0.p(substitution, "substitution");
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.e.a
        public e.a<kotlin.reflect.jvm.internal.impl.descriptors.g> j(r0 type) {
            g0.p(type, "type");
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.e.a
        public e.a<kotlin.reflect.jvm.internal.impl.descriptors.g> k(List<? extends j1> parameters) {
            g0.p(parameters, "parameters");
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.e.a
        public e.a<kotlin.reflect.jvm.internal.impl.descriptors.g> m(p visibility) {
            g0.p(visibility, "visibility");
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.e.a
        public e.a<kotlin.reflect.jvm.internal.impl.descriptors.g> p(n20.f name) {
            g0.p(name, "name");
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.e.a
        public e.a<kotlin.reflect.jvm.internal.impl.descriptors.g> q(Modality modality) {
            g0.p(modality, "modality");
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.e.a
        public e.a<kotlin.reflect.jvm.internal.impl.descriptors.g> r(p10.h owner) {
            g0.p(owner, "owner");
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.e.a
        public e.a<kotlin.reflect.jvm.internal.impl.descriptors.g> s(CallableMemberDescriptor.Kind kind) {
            g0.p(kind, "kind");
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.e.a
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public kotlin.reflect.jvm.internal.impl.descriptors.g build() {
            return b.this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.e.a
        public e.a<kotlin.reflect.jvm.internal.impl.descriptors.g> c() {
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.e.a
        public e.a<kotlin.reflect.jvm.internal.impl.descriptors.g> d() {
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.e.a
        public e.a<kotlin.reflect.jvm.internal.impl.descriptors.g> i() {
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.e.a
        public e.a<kotlin.reflect.jvm.internal.impl.descriptors.g> l() {
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.e.a
        public e.a<kotlin.reflect.jvm.internal.impl.descriptors.g> t() {
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.e.a
        public e.a<kotlin.reflect.jvm.internal.impl.descriptors.g> e(CallableMemberDescriptor callableMemberDescriptor) {
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.e.a
        public e.a<kotlin.reflect.jvm.internal.impl.descriptors.g> f(boolean z11) {
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.e.a
        public e.a<kotlin.reflect.jvm.internal.impl.descriptors.g> n(t0 t0Var) {
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.e.a
        public e.a<kotlin.reflect.jvm.internal.impl.descriptors.g> o(t0 t0Var) {
            return this;
        }
    }
}

package g30;

import a00.h0;
import e30.f2;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.a;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity;
import m80.k;
import m80.l;
import p10.c1;
import p10.j1;
import p10.o;
import p10.p;
import p10.q0;
import p10.r;
import p10.r0;
import p10.s0;
import p10.t0;
import p10.x0;
import s10.k0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class e implements q0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k0 f52674a;

    public e() {
        i iVar = i.f52687a;
        k0 K0 = k0.K0(iVar.h(), q10.g.A0.b(), Modality.OPEN, o.f78590e, true, n20.f.k(ErrorEntity.ERROR_PROPERTY.getDebugText()), CallableMemberDescriptor.Kind.DECLARATION, x0.f78622a, false, false, false, false, false, false);
        K0.X0(iVar.k(), h0.J(), null, null, h0.J());
        this.f52674a = K0;
    }

    @Override // p10.l1
    public boolean B0() {
        return this.f52674a.B0();
    }

    @Override // p10.l1
    public boolean E() {
        return this.f52674a.E();
    }

    @Override // p10.q0
    @l
    public r F() {
        return this.f52674a.F();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @l
    public <V> V P(a.InterfaceC0792a<V> interfaceC0792a) {
        return (V) this.f52674a.P(interfaceC0792a);
    }

    @Override // p10.q0
    @l
    public r Q() {
        return this.f52674a.Q();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    public void T(@k Collection<? extends CallableMemberDescriptor> overriddenDescriptors) {
        g0.p(overriddenDescriptors, "overriddenDescriptors");
        this.f52674a.T(overriddenDescriptors);
    }

    @Override // p10.m1
    public boolean Y() {
        return this.f52674a.Y();
    }

    @Override // p10.h
    @k
    public q0 a() {
        q0 a11 = this.f52674a.a();
        g0.o(a11, "getOriginal(...)");
        return a11;
    }

    @Override // p10.i, p10.h
    @k
    public p10.h b() {
        p10.h b11 = this.f52674a.b();
        g0.o(b11, "getContainingDeclaration(...)");
        return b11;
    }

    @Override // p10.z0
    public q0 c(@k f2 substitutor) {
        g0.p(substitutor, "substitutor");
        return this.f52674a.c(substitutor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @l
    public t0 d0() {
        return this.f52674a.d0();
    }

    @Override // p10.q0, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.a
    @k
    public Collection<? extends q0> e() {
        Collection<? extends q0> e11 = this.f52674a.e();
        g0.o(e11, "getOverriddenDescriptors(...)");
        return e11;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @l
    public t0 f0() {
        return this.f52674a.f0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @k
    public List<j1> g() {
        List<j1> g11 = this.f52674a.g();
        g0.o(g11, "getValueParameters(...)");
        return g11;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    @k
    public CallableMemberDescriptor g0(p10.h hVar, Modality modality, p pVar, CallableMemberDescriptor.Kind kind, boolean z11) {
        q0 g02 = this.f52674a.g0(hVar, modality, pVar, kind, z11);
        g0.o(g02, "copy(...)");
        return g02;
    }

    @Override // q10.a
    @k
    public q10.g getAnnotations() {
        q10.g annotations = this.f52674a.getAnnotations();
        g0.o(annotations, "<get-annotations>(...)");
        return annotations;
    }

    @Override // p10.q0
    @l
    public r0 getGetter() {
        return this.f52674a.getGetter();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    @k
    public CallableMemberDescriptor.Kind getKind() {
        CallableMemberDescriptor.Kind kind = this.f52674a.getKind();
        g0.o(kind, "getKind(...)");
        return kind;
    }

    @Override // p10.c0
    @k
    public n20.f getName() {
        n20.f name = this.f52674a.getName();
        g0.o(name, "getName(...)");
        return name;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @l
    public e30.r0 getReturnType() {
        return this.f52674a.getReturnType();
    }

    @Override // p10.q0
    @l
    public s0 getSetter() {
        return this.f52674a.getSetter();
    }

    @Override // p10.k
    @k
    public x0 getSource() {
        x0 source = this.f52674a.getSource();
        g0.o(source, "getSource(...)");
        return source;
    }

    @Override // p10.i1
    @k
    public e30.r0 getType() {
        e30.r0 type = this.f52674a.getType();
        g0.o(type, "getType(...)");
        return type;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @k
    public List<c1> getTypeParameters() {
        List<c1> typeParameters = this.f52674a.getTypeParameters();
        g0.o(typeParameters, "getTypeParameters(...)");
        return typeParameters;
    }

    @Override // p10.l
    @k
    public p getVisibility() {
        p visibility = this.f52674a.getVisibility();
        g0.o(visibility, "getVisibility(...)");
        return visibility;
    }

    @Override // p10.l1
    public boolean isConst() {
        return this.f52674a.isConst();
    }

    @Override // p10.x
    public boolean isExternal() {
        return this.f52674a.isExternal();
    }

    @Override // p10.x
    @k
    public Modality k() {
        Modality k11 = this.f52674a.k();
        g0.o(k11, "getModality(...)");
        return k11;
    }

    @Override // p10.x
    public boolean k0() {
        return this.f52674a.k0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    public boolean o0() {
        return this.f52674a.o0();
    }

    @Override // p10.x
    public boolean q0() {
        return this.f52674a.q0();
    }

    @Override // p10.l1
    @l
    public s20.g<?> t0() {
        return this.f52674a.t0();
    }

    @Override // p10.q0
    @k
    public List<kotlin.reflect.jvm.internal.impl.descriptors.f> x() {
        List<kotlin.reflect.jvm.internal.impl.descriptors.f> x11 = this.f52674a.x();
        g0.o(x11, "getAccessors(...)");
        return x11;
    }

    @Override // p10.h
    public <R, D> R y(p10.j<R, D> jVar, D d11) {
        return (R) this.f52674a.y(jVar, d11);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @k
    public List<t0> z0() {
        List<t0> z02 = this.f52674a.z0();
        g0.o(z02, "getContextReceiverParameters(...)");
        return z02;
    }
}

package kotlin.reflect.jvm.internal.impl.descriptors;

import e30.d2;
import e30.f2;
import e30.r0;
import java.util.Collection;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.a;
import m80.k;
import m80.l;
import p10.c1;
import p10.h;
import p10.j1;
import p10.p;
import p10.t0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface e extends CallableMemberDescriptor {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface a<D extends e> {
        @k
        a<D> a(@k q10.g gVar);

        @k
        <V> a<D> b(@k a.InterfaceC0792a<V> interfaceC0792a, V v11);

        @l
        D build();

        @k
        a<D> c();

        @k
        a<D> d();

        @k
        a<D> e(@l CallableMemberDescriptor callableMemberDescriptor);

        @k
        a<D> f(boolean z11);

        @k
        a<D> g(@k List<c1> list);

        @k
        a<D> h(@k d2 d2Var);

        @k
        a<D> i();

        @k
        a<D> j(@k r0 r0Var);

        @k
        a<D> k(@k List<j1> list);

        @k
        a<D> l();

        @k
        a<D> m(@k p pVar);

        @k
        a<D> n(@l t0 t0Var);

        @k
        a<D> o(@l t0 t0Var);

        @k
        a<D> p(@k n20.f fVar);

        @k
        a<D> q(@k Modality modality);

        @k
        a<D> r(@k h hVar);

        @k
        a<D> s(@k CallableMemberDescriptor.Kind kind);

        @k
        a<D> t();
    }

    boolean A();

    boolean D0();

    boolean U();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.a, p10.h
    @k
    e a();

    @Override // p10.i, p10.h
    @k
    h b();

    @l
    e c(@k f2 f2Var);

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.a
    @k
    Collection<? extends e> e();

    boolean isInfix();

    boolean isInline();

    boolean isOperator();

    boolean isSuspend();

    @k
    a<? extends e> n();

    @l
    e w0();
}

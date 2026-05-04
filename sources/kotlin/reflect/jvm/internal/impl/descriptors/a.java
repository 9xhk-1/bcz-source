package kotlin.reflect.jvm.internal.impl.descriptors;

import e30.r0;
import java.util.Collection;
import java.util.List;
import m80.k;
import p10.c1;
import p10.i;
import p10.j1;
import p10.l;
import p10.t0;
import p10.z0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface a extends i, l, z0<a> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.a$a, reason: collision with other inner class name */
    public interface InterfaceC0792a<V> {
    }

    @m80.l
    <V> V P(InterfaceC0792a<V> interfaceC0792a);

    @Override // p10.h
    @k
    a a();

    @m80.l
    t0 d0();

    @k
    Collection<? extends a> e();

    @m80.l
    t0 f0();

    @k
    List<j1> g();

    @m80.l
    r0 getReturnType();

    @k
    List<c1> getTypeParameters();

    boolean o0();

    @k
    List<t0> z0();
}

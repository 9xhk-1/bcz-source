package kotlin.reflect.jvm.internal;

import h10.q;
import java.lang.reflect.Member;
import k10.t1;
import k10.u1;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.g0;
import kotlin.reflect.jvm.internal.p;
import p10.q0;
import yz.c0;
import yz.e0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class o<D, E, V> extends p<V> implements h10.q<D, E, V> {

    /* renamed from: o, reason: collision with root package name */
    @m80.k
    public final c0<a<D, E, V>> f67700o;

    /* renamed from: p, reason: collision with root package name */
    @m80.k
    public final c0<Member> f67701p;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a<D, E, V> extends p.c<V> implements q.a<D, E, V> {

        /* renamed from: j, reason: collision with root package name */
        @m80.k
        public final o<D, E, V> f67702j;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@m80.k o<D, E, ? extends V> property) {
            g0.p(property, "property");
            this.f67702j = property;
        }

        @Override // x00.p
        public V invoke(D d11, E e11) {
            return d0().get(d11, e11);
        }

        @Override // kotlin.reflect.jvm.internal.p.a
        @m80.k
        /* renamed from: j0, reason: merged with bridge method [inline-methods] */
        public o<D, E, V> d0() {
            return this.f67702j;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(@m80.k KDeclarationContainerImpl container, @m80.k String name, @m80.k String signature) {
        super(container, name, signature, CallableReference.NO_RECEIVER);
        g0.p(container, "container");
        g0.p(name, "name");
        g0.p(signature, "signature");
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.f67700o = e0.b(lazyThreadSafetyMode, new t1(this));
        this.f67701p = e0.b(lazyThreadSafetyMode, new u1(this));
    }

    public static final a o0(o oVar) {
        return new a(oVar);
    }

    public static final Member r0(o oVar) {
        return oVar.h0();
    }

    @Override // h10.q
    public V get(D d11, E e11) {
        return l0().call(d11, e11);
    }

    @Override // h10.q
    @m80.l
    public Object getDelegate(D d11, E e11) {
        return j0(this.f67701p.getValue(), d11, e11);
    }

    @Override // x00.p
    public V invoke(D d11, E e11) {
        return get(d11, e11);
    }

    @Override // kotlin.reflect.jvm.internal.p
    @m80.k
    /* renamed from: s0, reason: merged with bridge method [inline-methods] */
    public a<D, E, V> l0() {
        return this.f67700o.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(@m80.k KDeclarationContainerImpl container, @m80.k q0 descriptor) {
        super(container, descriptor);
        g0.p(container, "container");
        g0.p(descriptor, "descriptor");
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.f67700o = e0.b(lazyThreadSafetyMode, new t1(this));
        this.f67701p = e0.b(lazyThreadSafetyMode, new u1(this));
    }
}

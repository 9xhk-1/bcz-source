package kotlin.reflect.jvm.internal;

import h10.m;
import k10.g1;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.g0;
import kotlin.reflect.jvm.internal.p;
import p10.q0;
import yz.c0;
import yz.e0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class j<D, E, V> extends o<D, E, V> implements h10.m<D, E, V> {

    /* renamed from: q, reason: collision with root package name */
    @m80.k
    public final c0<a<D, E, V>> f67674q;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a<D, E, V> extends p.d<V> implements m.a<D, E, V> {

        /* renamed from: j, reason: collision with root package name */
        @m80.k
        public final j<D, E, V> f67675j;

        public a(@m80.k j<D, E, V> property) {
            g0.p(property, "property");
            this.f67675j = property;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // x00.q
        public /* bridge */ /* synthetic */ g2 invoke(Object obj, Object obj2, Object obj3) {
            k0(obj, obj2, obj3);
            return g2.f100423a;
        }

        @Override // kotlin.reflect.jvm.internal.p.a
        @m80.k
        /* renamed from: j0, reason: merged with bridge method [inline-methods] */
        public j<D, E, V> d0() {
            return this.f67675j;
        }

        public void k0(D d11, E e11, V v11) {
            d0().set(d11, e11, v11);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(@m80.k KDeclarationContainerImpl container, @m80.k String name, @m80.k String signature) {
        super(container, name, signature);
        g0.p(container, "container");
        g0.p(name, "name");
        g0.p(signature, "signature");
        this.f67674q = e0.b(LazyThreadSafetyMode.PUBLICATION, new g1(this));
    }

    public static final a t0(j jVar) {
        return new a(jVar);
    }

    @Override // h10.m
    public void set(D d11, E e11, V v11) {
        getSetter().call(d11, e11, v11);
    }

    @Override // h10.m, h10.j
    @m80.k
    /* renamed from: v0, reason: merged with bridge method [inline-methods] */
    public a<D, E, V> getSetter() {
        return this.f67674q.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(@m80.k KDeclarationContainerImpl container, @m80.k q0 descriptor) {
        super(container, descriptor);
        g0.p(container, "container");
        g0.p(descriptor, "descriptor");
        this.f67674q = e0.b(LazyThreadSafetyMode.PUBLICATION, new g1(this));
    }
}

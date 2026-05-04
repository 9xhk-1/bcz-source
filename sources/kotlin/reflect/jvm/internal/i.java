package kotlin.reflect.jvm.internal;

import h10.l;
import k10.f1;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.g0;
import kotlin.reflect.jvm.internal.p;
import p10.q0;
import yz.c0;
import yz.e0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class i<T, V> extends n<T, V> implements h10.l<T, V> {

    /* renamed from: q, reason: collision with root package name */
    @m80.k
    public final c0<a<T, V>> f67184q;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a<T, V> extends p.d<V> implements l.a<T, V> {

        /* renamed from: j, reason: collision with root package name */
        @m80.k
        public final i<T, V> f67185j;

        public a(@m80.k i<T, V> property) {
            g0.p(property, "property");
            this.f67185j = property;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // x00.p
        public /* bridge */ /* synthetic */ g2 invoke(Object obj, Object obj2) {
            k0(obj, obj2);
            return g2.f100423a;
        }

        @Override // kotlin.reflect.jvm.internal.p.a
        @m80.k
        /* renamed from: j0, reason: merged with bridge method [inline-methods] */
        public i<T, V> d0() {
            return this.f67185j;
        }

        public void k0(T t11, V v11) {
            d0().set(t11, v11);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(@m80.k KDeclarationContainerImpl container, @m80.k String name, @m80.k String signature, @m80.l Object obj) {
        super(container, name, signature, obj);
        g0.p(container, "container");
        g0.p(name, "name");
        g0.p(signature, "signature");
        this.f67184q = e0.b(LazyThreadSafetyMode.PUBLICATION, new f1(this));
    }

    public static final a t0(i iVar) {
        return new a(iVar);
    }

    @Override // h10.l
    public void set(T t11, V v11) {
        getSetter().call(t11, v11);
    }

    @Override // h10.l, h10.j
    @m80.k
    /* renamed from: v0, reason: merged with bridge method [inline-methods] */
    public a<T, V> getSetter() {
        return this.f67184q.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(@m80.k KDeclarationContainerImpl container, @m80.k q0 descriptor) {
        super(container, descriptor);
        g0.p(container, "container");
        g0.p(descriptor, "descriptor");
        this.f67184q = e0.b(LazyThreadSafetyMode.PUBLICATION, new f1(this));
    }
}

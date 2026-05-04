package kotlin.reflect.jvm.internal;

import h10.k;
import k10.e1;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.g0;
import kotlin.reflect.jvm.internal.p;
import p10.q0;
import yz.c0;
import yz.e0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class h<V> extends m<V> implements h10.k<V> {

    /* renamed from: q, reason: collision with root package name */
    @m80.k
    public final c0<a<V>> f67182q;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a<R> extends p.d<R> implements k.a<R> {

        /* renamed from: j, reason: collision with root package name */
        @m80.k
        public final h<R> f67183j;

        public a(@m80.k h<R> property) {
            g0.p(property, "property");
            this.f67183j = property;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(Object obj) {
            k0(obj);
            return g2.f100423a;
        }

        @Override // kotlin.reflect.jvm.internal.p.a
        @m80.k
        /* renamed from: j0, reason: merged with bridge method [inline-methods] */
        public h<R> d0() {
            return this.f67183j;
        }

        public void k0(R r11) {
            d0().set(r11);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(@m80.k KDeclarationContainerImpl container, @m80.k q0 descriptor) {
        super(container, descriptor);
        g0.p(container, "container");
        g0.p(descriptor, "descriptor");
        this.f67182q = e0.b(LazyThreadSafetyMode.PUBLICATION, new e1(this));
    }

    public static final a t0(h hVar) {
        return new a(hVar);
    }

    @Override // h10.k
    public void set(V v11) {
        getSetter().call(v11);
    }

    @Override // h10.k, h10.j
    @m80.k
    /* renamed from: v0, reason: merged with bridge method [inline-methods] */
    public a<V> getSetter() {
        return this.f67182q.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(@m80.k KDeclarationContainerImpl container, @m80.k String name, @m80.k String signature, @m80.l Object obj) {
        super(container, name, signature, obj);
        g0.p(container, "container");
        g0.p(name, "name");
        g0.p(signature, "signature");
        this.f67182q = e0.b(LazyThreadSafetyMode.PUBLICATION, new e1(this));
    }
}

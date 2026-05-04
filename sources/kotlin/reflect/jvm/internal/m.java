package kotlin.reflect.jvm.internal;

import h10.o;
import k10.p1;
import k10.q1;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.g0;
import kotlin.reflect.jvm.internal.p;
import p10.q0;
import yz.c0;
import yz.e0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class m<V> extends p<V> implements h10.o<V> {

    /* renamed from: o, reason: collision with root package name */
    @m80.k
    public final c0<a<V>> f67694o;

    /* renamed from: p, reason: collision with root package name */
    @m80.k
    public final c0<Object> f67695p;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a<R> extends p.c<R> implements o.a<R> {

        /* renamed from: j, reason: collision with root package name */
        @m80.k
        public final m<R> f67696j;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@m80.k m<? extends R> property) {
            g0.p(property, "property");
            this.f67696j = property;
        }

        @Override // x00.a
        public R invoke() {
            return a().get();
        }

        @Override // kotlin.reflect.jvm.internal.p.a
        @m80.k
        /* renamed from: j0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public m<R> d0() {
            return this.f67696j;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(@m80.k KDeclarationContainerImpl container, @m80.k q0 descriptor) {
        super(container, descriptor);
        g0.p(container, "container");
        g0.p(descriptor, "descriptor");
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.f67694o = e0.b(lazyThreadSafetyMode, new p1(this));
        this.f67695p = e0.b(lazyThreadSafetyMode, new q1(this));
    }

    public static final a o0(m mVar) {
        return new a(mVar);
    }

    public static final Object r0(m mVar) {
        return mVar.j0(mVar.h0(), null, null);
    }

    @Override // h10.o
    public V get() {
        return getGetter().call(new Object[0]);
    }

    @Override // h10.o
    @m80.l
    public Object getDelegate() {
        return this.f67695p.getValue();
    }

    @Override // x00.a
    public V invoke() {
        return get();
    }

    @Override // kotlin.reflect.jvm.internal.p
    @m80.k
    /* renamed from: s0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public a<V> l0() {
        return this.f67694o.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(@m80.k KDeclarationContainerImpl container, @m80.k String name, @m80.k String signature, @m80.l Object obj) {
        super(container, name, signature, obj);
        g0.p(container, "container");
        g0.p(name, "name");
        g0.p(signature, "signature");
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.f67694o = e0.b(lazyThreadSafetyMode, new p1(this));
        this.f67695p = e0.b(lazyThreadSafetyMode, new q1(this));
    }
}

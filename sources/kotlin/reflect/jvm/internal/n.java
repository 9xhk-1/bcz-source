package kotlin.reflect.jvm.internal;

import h10.p;
import java.lang.reflect.Member;
import k10.r1;
import k10.s1;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.g0;
import kotlin.reflect.jvm.internal.p;
import p10.q0;
import yz.c0;
import yz.e0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class n<T, V> extends p<V> implements h10.p<T, V> {

    /* renamed from: o, reason: collision with root package name */
    @m80.k
    public final c0<a<T, V>> f67697o;

    /* renamed from: p, reason: collision with root package name */
    @m80.k
    public final c0<Member> f67698p;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a<T, V> extends p.c<V> implements p.a<T, V> {

        /* renamed from: j, reason: collision with root package name */
        @m80.k
        public final n<T, V> f67699j;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@m80.k n<T, ? extends V> property) {
            g0.p(property, "property");
            this.f67699j = property;
        }

        @Override // x00.l
        public V invoke(T t11) {
            return d0().get(t11);
        }

        @Override // kotlin.reflect.jvm.internal.p.a
        @m80.k
        /* renamed from: j0, reason: merged with bridge method [inline-methods] */
        public n<T, V> d0() {
            return this.f67699j;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(@m80.k KDeclarationContainerImpl container, @m80.k String name, @m80.k String signature, @m80.l Object obj) {
        super(container, name, signature, obj);
        g0.p(container, "container");
        g0.p(name, "name");
        g0.p(signature, "signature");
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.f67697o = e0.b(lazyThreadSafetyMode, new r1(this));
        this.f67698p = e0.b(lazyThreadSafetyMode, new s1(this));
    }

    public static final a o0(n nVar) {
        return new a(nVar);
    }

    public static final Member r0(n nVar) {
        return nVar.h0();
    }

    @Override // h10.p
    public V get(T t11) {
        return l0().call(t11);
    }

    @Override // h10.p
    @m80.l
    public Object getDelegate(T t11) {
        return j0(this.f67698p.getValue(), t11, null);
    }

    @Override // x00.l
    public V invoke(T t11) {
        return get(t11);
    }

    @Override // kotlin.reflect.jvm.internal.p
    @m80.k
    /* renamed from: s0, reason: merged with bridge method [inline-methods] */
    public a<T, V> l0() {
        return this.f67697o.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(@m80.k KDeclarationContainerImpl container, @m80.k q0 descriptor) {
        super(container, descriptor);
        g0.p(container, "container");
        g0.p(descriptor, "descriptor");
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.f67697o = e0.b(lazyThreadSafetyMode, new r1(this));
        this.f67698p = e0.b(lazyThreadSafetyMode, new s1(this));
    }
}

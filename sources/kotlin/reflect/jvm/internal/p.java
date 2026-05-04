package kotlin.reflect.jvm.internal;

import h10.j;
import h10.n;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import k10.a2;
import k10.l2;
import k10.q2;
import k10.v1;
import k10.w1;
import k10.x1;
import k10.y1;
import k10.z1;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import kotlin.reflect.full.IllegalPropertyDelegateAccessException;
import kotlin.reflect.jvm.internal.d;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.t;
import m20.d;
import p10.q0;
import p10.r0;
import p10.s0;
import q10.g;
import s10.l0;
import s10.m0;
import yz.c0;
import yz.e0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nKPropertyImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KPropertyImpl.kt\nkotlin/reflect/jvm/internal/KPropertyImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,334:1\n1#2:335\n*E\n"})
/* loaded from: classes8.dex */
public abstract class p<V> extends e<V> implements h10.n<V> {

    /* renamed from: m, reason: collision with root package name */
    @m80.k
    public static final b f67703m = new b(null);

    /* renamed from: n, reason: collision with root package name */
    @m80.k
    public static final Object f67704n = new Object();

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final KDeclarationContainerImpl f67705g;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public final String f67706h;

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public final String f67707i;

    /* renamed from: j, reason: collision with root package name */
    @m80.l
    public final Object f67708j;

    /* renamed from: k, reason: collision with root package name */
    @m80.k
    public final c0<Field> f67709k;

    /* renamed from: l, reason: collision with root package name */
    @m80.k
    public final t.a<q0> f67710l;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class a<PropertyType, ReturnType> extends e<ReturnType> implements h10.i<ReturnType>, n.a<PropertyType> {
        @Override // kotlin.reflect.jvm.internal.e
        @m80.k
        public KDeclarationContainerImpl V() {
            return d0().V();
        }

        @Override // kotlin.reflect.jvm.internal.e
        @m80.l
        public kotlin.reflect.jvm.internal.calls.a<?> W() {
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.e
        public boolean a0() {
            return d0().a0();
        }

        @m80.k
        public abstract kotlin.reflect.jvm.internal.impl.descriptors.f c0();

        @m80.k
        public abstract p<PropertyType> d0();

        @Override // h10.i
        public boolean isExternal() {
            return c0().isExternal();
        }

        @Override // h10.i
        public boolean isInfix() {
            return c0().isInfix();
        }

        @Override // h10.i
        public boolean isInline() {
            return c0().isInline();
        }

        @Override // h10.i
        public boolean isOperator() {
            return c0().isOperator();
        }

        @Override // h10.c
        public boolean isSuspend() {
            return c0().isSuspend();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(v vVar) {
            this();
        }

        @m80.k
        public final Object a() {
            return p.f67704n;
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class c<V> extends a<V, V> implements n.c<V> {

        /* renamed from: i, reason: collision with root package name */
        public static final /* synthetic */ h10.n<Object>[] f67711i = {o0.u(new PropertyReference1Impl(o0.d(c.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertyGetterDescriptor;"))};

        /* renamed from: g, reason: collision with root package name */
        @m80.k
        public final t.a f67712g = t.c(new x1(this));

        /* renamed from: h, reason: collision with root package name */
        @m80.k
        public final c0 f67713h = e0.b(LazyThreadSafetyMode.PUBLICATION, new y1(this));

        public static final kotlin.reflect.jvm.internal.calls.a g0(c cVar) {
            kotlin.reflect.jvm.internal.calls.a b11;
            b11 = q.b(cVar, true);
            return b11;
        }

        public static final r0 h0(c cVar) {
            r0 getter = cVar.d0().c0().getGetter();
            if (getter != null) {
                return getter;
            }
            l0 d11 = q20.g.d(cVar.d0().c0(), q10.g.A0.b());
            g0.o(d11, "createDefaultGetter(...)");
            return d11;
        }

        @Override // kotlin.reflect.jvm.internal.e
        @m80.k
        public kotlin.reflect.jvm.internal.calls.a<?> U() {
            return (kotlin.reflect.jvm.internal.calls.a) this.f67713h.getValue();
        }

        public boolean equals(@m80.l Object obj) {
            return (obj instanceof c) && g0.g(d0(), ((c) obj).d0());
        }

        @Override // h10.c
        @m80.k
        public String getName() {
            return "<get-" + d0().getName() + u30.u0.f91710f;
        }

        public int hashCode() {
            return d0().hashCode();
        }

        @Override // kotlin.reflect.jvm.internal.p.a
        @m80.k
        /* renamed from: i0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public r0 c0() {
            T b11 = this.f67712g.b(this, f67711i[0]);
            g0.o(b11, "getValue(...)");
            return (r0) b11;
        }

        @m80.k
        public String toString() {
            return "getter of " + d0();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class d<V> extends a<V, g2> implements j.a<V> {

        /* renamed from: i, reason: collision with root package name */
        public static final /* synthetic */ h10.n<Object>[] f67714i = {o0.u(new PropertyReference1Impl(o0.d(d.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertySetterDescriptor;"))};

        /* renamed from: g, reason: collision with root package name */
        @m80.k
        public final t.a f67715g = t.c(new z1(this));

        /* renamed from: h, reason: collision with root package name */
        @m80.k
        public final c0 f67716h = e0.b(LazyThreadSafetyMode.PUBLICATION, new a2(this));

        public static final kotlin.reflect.jvm.internal.calls.a g0(d dVar) {
            kotlin.reflect.jvm.internal.calls.a b11;
            b11 = q.b(dVar, false);
            return b11;
        }

        public static final s0 h0(d dVar) {
            s0 setter = dVar.d0().c0().getSetter();
            if (setter != null) {
                return setter;
            }
            q0 c02 = dVar.d0().c0();
            g.a aVar = q10.g.A0;
            m0 e11 = q20.g.e(c02, aVar.b(), aVar.b());
            g0.o(e11, "createDefaultSetter(...)");
            return e11;
        }

        @Override // kotlin.reflect.jvm.internal.e
        @m80.k
        public kotlin.reflect.jvm.internal.calls.a<?> U() {
            return (kotlin.reflect.jvm.internal.calls.a) this.f67716h.getValue();
        }

        public boolean equals(@m80.l Object obj) {
            return (obj instanceof d) && g0.g(d0(), ((d) obj).d0());
        }

        @Override // h10.c
        @m80.k
        public String getName() {
            return "<set-" + d0().getName() + u30.u0.f91710f;
        }

        public int hashCode() {
            return d0().hashCode();
        }

        @Override // kotlin.reflect.jvm.internal.p.a
        @m80.k
        /* renamed from: i0, reason: merged with bridge method [inline-methods] */
        public s0 c0() {
            T b11 = this.f67715g.b(this, f67714i[0]);
            g0.o(b11, "getValue(...)");
            return (s0) b11;
        }

        @m80.k
        public String toString() {
            return "setter of " + d0();
        }
    }

    public p(KDeclarationContainerImpl kDeclarationContainerImpl, String str, String str2, q0 q0Var, Object obj) {
        this.f67705g = kDeclarationContainerImpl;
        this.f67706h = str;
        this.f67707i = str2;
        this.f67708j = obj;
        this.f67709k = e0.b(LazyThreadSafetyMode.PUBLICATION, new v1(this));
        t.a<q0> b11 = t.b(q0Var, new w1(this));
        g0.o(b11, "lazySoft(...)");
        this.f67710l = b11;
    }

    public static final q0 c0(p pVar) {
        return pVar.V().J(pVar.getName(), pVar.f67707i);
    }

    public static final Field d0(p pVar) {
        Class<?> enclosingClass;
        kotlin.reflect.jvm.internal.d f11 = u.f67731a.f(pVar.c0());
        if (!(f11 instanceof d.c)) {
            if (f11 instanceof d.a) {
                return ((d.a) f11).b();
            }
            if ((f11 instanceof d.b) || (f11 instanceof d.C0788d)) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        d.c cVar = (d.c) f11;
        q0 b11 = cVar.b();
        d.a d11 = m20.i.d(m20.i.f71820a, cVar.e(), cVar.d(), cVar.g(), false, 8, null);
        if (d11 == null) {
            return null;
        }
        if (y10.l.e(b11) || m20.i.f(cVar.e())) {
            enclosingClass = pVar.V().g().getEnclosingClass();
        } else {
            p10.h b12 = b11.b();
            enclosingClass = b12 instanceof p10.b ? q2.s((p10.b) b12) : pVar.V().g();
        }
        if (enclosingClass == null) {
            return null;
        }
        try {
            return enclosingClass.getDeclaredField(d11.e());
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }

    @Override // kotlin.reflect.jvm.internal.e
    @m80.k
    public kotlin.reflect.jvm.internal.calls.a<?> U() {
        return l0().U();
    }

    @Override // kotlin.reflect.jvm.internal.e
    @m80.k
    public KDeclarationContainerImpl V() {
        return this.f67705g;
    }

    @Override // kotlin.reflect.jvm.internal.e
    @m80.l
    public kotlin.reflect.jvm.internal.calls.a<?> W() {
        return l0().W();
    }

    @Override // kotlin.reflect.jvm.internal.e
    public boolean a0() {
        return this.f67708j != CallableReference.NO_RECEIVER;
    }

    public boolean equals(@m80.l Object obj) {
        p<?> d11 = q2.d(obj);
        return d11 != null && g0.g(V(), d11.V()) && g0.g(getName(), d11.getName()) && g0.g(this.f67707i, d11.f67707i) && g0.g(this.f67708j, d11.f67708j);
    }

    @Override // h10.c
    @m80.k
    public String getName() {
        return this.f67706h;
    }

    @m80.l
    public final Member h0() {
        if (!c0().Y()) {
            return null;
        }
        kotlin.reflect.jvm.internal.d f11 = u.f67731a.f(c0());
        if (f11 instanceof d.c) {
            d.c cVar = (d.c) f11;
            if (cVar.f().hasDelegateMethod()) {
                JvmProtoBuf.JvmMethodSignature delegateMethod = cVar.f().getDelegateMethod();
                if (!delegateMethod.hasName() || !delegateMethod.hasDesc()) {
                    return null;
                }
                return V().I(cVar.d().getString(delegateMethod.getName()), cVar.d().getString(delegateMethod.getDesc()));
            }
        }
        return m0();
    }

    public int hashCode() {
        return (((V().hashCode() * 31) + getName().hashCode()) * 31) + this.f67707i.hashCode();
    }

    @m80.l
    public final Object i0() {
        return l10.i.h(this.f67708j, c0());
    }

    @Override // h10.n
    public boolean isConst() {
        return c0().isConst();
    }

    @Override // h10.n
    public boolean isLateinit() {
        return c0().B0();
    }

    @Override // h10.c
    public boolean isSuspend() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @m80.l
    public final Object j0(@m80.l Member member, @m80.l Object obj, @m80.l Object obj2) {
        try {
            Object obj3 = f67704n;
            if ((obj == obj3 || obj2 == obj3) && c0().f0() == null) {
                throw new RuntimeException('\'' + this + "' is not an extension property and thus getExtensionDelegate() is not going to work, use getDelegate() instead");
            }
            Object i02 = a0() ? i0() : obj;
            if (i02 == obj3) {
                i02 = null;
            }
            if (!a0()) {
                obj = obj2;
            }
            if (obj == obj3) {
                obj = null;
            }
            AccessibleObject accessibleObject = member instanceof AccessibleObject ? (AccessibleObject) member : null;
            if (accessibleObject != null) {
                accessibleObject.setAccessible(j10.b.a(this));
            }
            if (member == 0) {
                return null;
            }
            if (member instanceof Field) {
                return ((Field) member).get(i02);
            }
            if (!(member instanceof Method)) {
                throw new AssertionError("delegate field/method " + member + " neither field nor method");
            }
            int length = ((Method) member).getParameterTypes().length;
            if (length == 0) {
                return ((Method) member).invoke(null, null);
            }
            if (length == 1) {
                Method method = (Method) member;
                if (i02 == null) {
                    Class<?> cls = ((Method) member).getParameterTypes()[0];
                    g0.o(cls, "get(...)");
                    i02 = q2.g(cls);
                }
                return method.invoke(null, i02);
            }
            if (length != 2) {
                throw new AssertionError("delegate method " + member + " should take 0, 1, or 2 parameters");
            }
            Method method2 = (Method) member;
            if (obj == null) {
                Class<?> cls2 = ((Method) member).getParameterTypes()[1];
                g0.o(cls2, "get(...)");
                obj = q2.g(cls2);
            }
            return method2.invoke(null, i02, obj);
        } catch (IllegalAccessException e11) {
            throw new IllegalPropertyDelegateAccessException(e11);
        }
    }

    @Override // kotlin.reflect.jvm.internal.e
    @m80.k
    /* renamed from: k0, reason: merged with bridge method [inline-methods] */
    public q0 c0() {
        q0 invoke = this.f67710l.invoke();
        g0.o(invoke, "invoke(...)");
        return invoke;
    }

    @m80.k
    public abstract c<V> l0();

    @m80.l
    public final Field m0() {
        return this.f67709k.getValue();
    }

    @m80.k
    public final String n0() {
        return this.f67707i;
    }

    @m80.k
    public String toString() {
        return l2.f64961a.k(c0());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public p(@m80.k KDeclarationContainerImpl container, @m80.k String name, @m80.k String signature, @m80.l Object obj) {
        this(container, name, signature, null, obj);
        g0.p(container, "container");
        g0.p(name, "name");
        g0.p(signature, "signature");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p(@m80.k kotlin.reflect.jvm.internal.KDeclarationContainerImpl r8, @m80.k p10.q0 r9) {
        /*
            r7 = this;
            java.lang.String r0 = "container"
            kotlin.jvm.internal.g0.p(r8, r0)
            java.lang.String r0 = "descriptor"
            kotlin.jvm.internal.g0.p(r9, r0)
            n20.f r0 = r9.getName()
            java.lang.String r3 = r0.b()
            java.lang.String r0 = "asString(...)"
            kotlin.jvm.internal.g0.o(r3, r0)
            kotlin.reflect.jvm.internal.u r0 = kotlin.reflect.jvm.internal.u.f67731a
            kotlin.reflect.jvm.internal.d r0 = r0.f(r9)
            java.lang.String r4 = r0.a()
            java.lang.Object r6 = kotlin.jvm.internal.CallableReference.NO_RECEIVER
            r1 = r7
            r2 = r8
            r5 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.p.<init>(kotlin.reflect.jvm.internal.KDeclarationContainerImpl, p10.q0):void");
    }
}

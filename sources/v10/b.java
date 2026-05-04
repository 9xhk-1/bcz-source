package v10;

import java.lang.reflect.Method;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final b f92816a = new b();

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    public static a f92817b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public final Method f92818a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public final Method f92819b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public final Method f92820c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public final Method f92821d;

        public a(@m80.l Method method, @m80.l Method method2, @m80.l Method method3, @m80.l Method method4) {
            this.f92818a = method;
            this.f92819b = method2;
            this.f92820c = method3;
            this.f92821d = method4;
        }

        @m80.l
        public final Method a() {
            return this.f92819b;
        }

        @m80.l
        public final Method b() {
            return this.f92821d;
        }

        @m80.l
        public final Method c() {
            return this.f92820c;
        }

        @m80.l
        public final Method d() {
            return this.f92818a;
        }
    }

    public final a a() {
        try {
            return new a(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null));
        } catch (NoSuchMethodException unused) {
            return new a(null, null, null, null);
        }
    }

    public final a b() {
        a aVar = f92817b;
        if (aVar != null) {
            return aVar;
        }
        a a11 = a();
        f92817b = a11;
        return a11;
    }

    @m80.l
    public final Class<?>[] c(@m80.k Class<?> clazz) {
        kotlin.jvm.internal.g0.p(clazz, "clazz");
        Method a11 = b().a();
        if (a11 == null) {
            return null;
        }
        Object invoke = a11.invoke(clazz, null);
        kotlin.jvm.internal.g0.n(invoke, "null cannot be cast to non-null type kotlin.Array<java.lang.Class<*>>");
        return (Class[]) invoke;
    }

    @m80.l
    public final Object[] d(@m80.k Class<?> clazz) {
        kotlin.jvm.internal.g0.p(clazz, "clazz");
        Method b11 = b().b();
        if (b11 == null) {
            return null;
        }
        return (Object[]) b11.invoke(clazz, null);
    }

    @m80.l
    public final Boolean e(@m80.k Class<?> clazz) {
        kotlin.jvm.internal.g0.p(clazz, "clazz");
        Method c11 = b().c();
        if (c11 == null) {
            return null;
        }
        Object invoke = c11.invoke(clazz, null);
        kotlin.jvm.internal.g0.n(invoke, "null cannot be cast to non-null type kotlin.Boolean");
        return (Boolean) invoke;
    }

    @m80.l
    public final Boolean f(@m80.k Class<?> clazz) {
        kotlin.jvm.internal.g0.p(clazz, "clazz");
        Method d11 = b().d();
        if (d11 == null) {
            return null;
        }
        Object invoke = d11.invoke(clazz, null);
        kotlin.jvm.internal.g0.n(invoke, "null cannot be cast to non-null type kotlin.Boolean");
        return (Boolean) invoke;
    }
}

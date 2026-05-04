package v10;

import java.lang.reflect.Method;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final a f92812a = new a();

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    public static C1249a f92813b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: v10.a$a, reason: collision with other inner class name */
    public static final class C1249a {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public final Method f92814a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public final Method f92815b;

        public C1249a(@m80.l Method method, @m80.l Method method2) {
            this.f92814a = method;
            this.f92815b = method2;
        }

        @m80.l
        public final Method a() {
            return this.f92815b;
        }

        @m80.l
        public final Method b() {
            return this.f92814a;
        }
    }

    public final C1249a a(Object obj) {
        Class<?> cls = obj.getClass();
        try {
            return new C1249a(cls.getMethod("getType", null), cls.getMethod("getAccessor", null));
        } catch (NoSuchMethodException unused) {
            return new C1249a(null, null);
        }
    }

    public final C1249a b(Object obj) {
        C1249a c1249a = f92813b;
        if (c1249a != null) {
            return c1249a;
        }
        C1249a a11 = a(obj);
        f92813b = a11;
        return a11;
    }

    @m80.l
    public final Method c(@m80.k Object recordComponent) {
        kotlin.jvm.internal.g0.p(recordComponent, "recordComponent");
        Method a11 = b(recordComponent).a();
        if (a11 == null) {
            return null;
        }
        Object invoke = a11.invoke(recordComponent, null);
        kotlin.jvm.internal.g0.n(invoke, "null cannot be cast to non-null type java.lang.reflect.Method");
        return (Method) invoke;
    }

    @m80.l
    public final Class<?> d(@m80.k Object recordComponent) {
        kotlin.jvm.internal.g0.p(recordComponent, "recordComponent");
        Method b11 = b(recordComponent).b();
        if (b11 == null) {
            return null;
        }
        Object invoke = b11.invoke(recordComponent, null);
        kotlin.jvm.internal.g0.n(invoke, "null cannot be cast to non-null type java.lang.Class<*>");
        return (Class) invoke;
    }
}

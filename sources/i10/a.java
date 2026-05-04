package i10;

import java.lang.annotation.Annotation;
import java.lang.annotation.Repeatable;
import java.lang.reflect.Method;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nKAnnotatedElements.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KAnnotatedElements.kt\nkotlin/reflect/full/Java8RepeatableContainerLoader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,102:1\n1#2:103\n*E\n"})
/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final a f60095a = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public static C0688a f60096b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: i10.a$a, reason: collision with other inner class name */
    public static final class C0688a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final Class<? extends Annotation> f60097a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Method f60098b;

        public C0688a(@l Class<? extends Annotation> cls, @l Method method) {
            this.f60097a = cls;
            this.f60098b = method;
        }

        @l
        public final Class<? extends Annotation> a() {
            return this.f60097a;
        }

        @l
        public final Method b() {
            return this.f60098b;
        }
    }

    public final C0688a a() {
        try {
            g0.n(Repeatable.class, "null cannot be cast to non-null type java.lang.Class<out kotlin.Annotation>");
            return new C0688a(Repeatable.class, Repeatable.class.getMethod("value", null));
        } catch (ClassNotFoundException unused) {
            return new C0688a(null, null);
        }
    }

    @l
    public final Class<? extends Annotation> b(@m80.k Class<? extends Annotation> klass) {
        Annotation annotation;
        Method b11;
        g0.p(klass, "klass");
        C0688a c0688a = f60096b;
        if (c0688a == null) {
            synchronized (this) {
                c0688a = f60096b;
                if (c0688a == null) {
                    c0688a = f60095a.a();
                    f60096b = c0688a;
                }
            }
        }
        Class a11 = c0688a.a();
        if (a11 == null || (annotation = klass.getAnnotation(a11)) == null || (b11 = c0688a.b()) == null) {
            return null;
        }
        Object invoke = b11.invoke(annotation, null);
        g0.n(invoke, "null cannot be cast to non-null type java.lang.Class<out kotlin.Annotation>");
        return (Class) invoke;
    }
}

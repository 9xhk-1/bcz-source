package kotlin.reflect.jvm.internal;

import a00.a0;
import a00.r0;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Comparator;
import java.util.List;
import k10.n2;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m20.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class c {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nRuntimeTypeMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RuntimeTypeMapper.kt\nkotlin/reflect/jvm/internal/JvmFunctionSignature$FakeJavaAnnotationConstructor\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,302:1\n6479#2:303\n*S KotlinDebug\n*F\n+ 1 RuntimeTypeMapper.kt\nkotlin/reflect/jvm/internal/JvmFunctionSignature$FakeJavaAnnotationConstructor\n*L\n88#1:303\n*E\n"})
    public static final class a extends c {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final Class<?> f67086a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final List<Method> f67087b;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 RuntimeTypeMapper.kt\nkotlin/reflect/jvm/internal/JvmFunctionSignature$FakeJavaAnnotationConstructor\n*L\n1#1,102:1\n88#2:103\n*E\n"})
        /* renamed from: kotlin.reflect.jvm.internal.c$a$a, reason: collision with other inner class name */
        public static final class C0781a<T> implements Comparator {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t11, T t12) {
                return e00.g.l(((Method) t11).getName(), ((Method) t12).getName());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@m80.k Class<?> jClass) {
            super(null);
            g0.p(jClass, "jClass");
            this.f67086a = jClass;
            Method[] declaredMethods = jClass.getDeclaredMethods();
            g0.o(declaredMethods, "getDeclaredMethods(...)");
            this.f67087b = a0.fw(declaredMethods, new C0781a());
        }

        public static final CharSequence c(Method method) {
            Class<?> returnType = method.getReturnType();
            g0.o(returnType, "getReturnType(...)");
            return v10.f.f(returnType);
        }

        @Override // kotlin.reflect.jvm.internal.c
        @m80.k
        public String a() {
            return r0.r3(this.f67087b, "", "<init>(", ")V", 0, null, k10.o.f64974a, 24, null);
        }

        @m80.k
        public final List<Method> d() {
            return this.f67087b;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends c {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final Constructor<?> f67088a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@m80.k Constructor<?> constructor) {
            super(null);
            g0.p(constructor, "constructor");
            this.f67088a = constructor;
        }

        public static final CharSequence c(Class cls) {
            g0.m(cls);
            return v10.f.f(cls);
        }

        @Override // kotlin.reflect.jvm.internal.c
        @m80.k
        public String a() {
            Class<?>[] parameterTypes = this.f67088a.getParameterTypes();
            g0.o(parameterTypes, "getParameterTypes(...)");
            return a0.Eh(parameterTypes, "", "<init>(", ")V", 0, null, k10.p.f64977a, 24, null);
        }

        @m80.k
        public final Constructor<?> d() {
            return this.f67088a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: kotlin.reflect.jvm.internal.c$c, reason: collision with other inner class name */
    public static final class C0782c extends c {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final Method f67089a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0782c(@m80.k Method method) {
            super(null);
            g0.p(method, "method");
            this.f67089a = method;
        }

        @Override // kotlin.reflect.jvm.internal.c
        @m80.k
        public String a() {
            String d11;
            d11 = n2.d(this.f67089a);
            return d11;
        }

        @m80.k
        public final Method b() {
            return this.f67089a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d extends c {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final d.b f67090a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final String f67091b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(@m80.k d.b signature) {
            super(null);
            g0.p(signature, "signature");
            this.f67090a = signature;
            this.f67091b = signature.a();
        }

        @Override // kotlin.reflect.jvm.internal.c
        @m80.k
        public String a() {
            return this.f67091b;
        }

        @m80.k
        public final String b() {
            return this.f67090a.d();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class e extends c {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final d.b f67092a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final String f67093b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(@m80.k d.b signature) {
            super(null);
            g0.p(signature, "signature");
            this.f67092a = signature;
            this.f67093b = signature.a();
        }

        @Override // kotlin.reflect.jvm.internal.c
        @m80.k
        public String a() {
            return this.f67093b;
        }

        @m80.k
        public final String b() {
            return this.f67092a.d();
        }

        @m80.k
        public final String c() {
            return this.f67092a.e();
        }
    }

    public /* synthetic */ c(v vVar) {
        this();
    }

    @m80.k
    public abstract String a();

    public c() {
    }
}

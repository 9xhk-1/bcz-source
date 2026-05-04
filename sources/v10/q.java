package v10;

import a00.i0;
import a00.r0;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v0;
import kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind;
import p10.n1;
import p10.o1;
import q30.k0;
import t10.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nReflectJavaClass.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReflectJavaClass.kt\norg/jetbrains/kotlin/descriptors/runtime/structure/ReflectJavaClass\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,209:1\n183#2,2:210\n1#3:212\n1557#4:213\n1628#4,3:214\n11165#5:217\n11500#5,3:218\n11165#5:221\n11500#5,3:222\n11165#5:225\n11500#5,3:226\n*S KotlinDebug\n*F\n+ 1 ReflectJavaClass.kt\norg/jetbrains/kotlin/descriptors/runtime/structure/ReflectJavaClass\n*L\n51#1:210,2\n64#1:213\n64#1:214,3\n118#1:217\n118#1:218,3\n131#1:221\n131#1:222,3\n138#1:225\n138#1:226,3\n*E\n"})
/* loaded from: classes8.dex */
public final class q extends u implements j, a0, f20.g {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final Class<?> f92858a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class a extends FunctionReference implements x00.l<Member, Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f92859a = new a();

        public a() {
            super(1);
        }

        @Override // x00.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Member p02) {
            kotlin.jvm.internal.g0.p(p02, "p0");
            return Boolean.valueOf(p02.isSynthetic());
        }

        @Override // kotlin.jvm.internal.CallableReference, h10.c
        public final String getName() {
            return "isSynthetic";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final h10.h getOwner() {
            return o0.d(Member.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final String getSignature() {
            return "isSynthetic()Z";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class b extends FunctionReference implements x00.l<Constructor<?>, t> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f92860a = new b();

        public b() {
            super(1);
        }

        @Override // x00.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final t invoke(Constructor<?> p02) {
            kotlin.jvm.internal.g0.p(p02, "p0");
            return new t(p02);
        }

        @Override // kotlin.jvm.internal.CallableReference, h10.c
        public final String getName() {
            return "<init>";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final h10.h getOwner() {
            return o0.d(t.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final String getSignature() {
            return "<init>(Ljava/lang/reflect/Constructor;)V";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class c extends FunctionReference implements x00.l<Member, Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f92861a = new c();

        public c() {
            super(1);
        }

        @Override // x00.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Member p02) {
            kotlin.jvm.internal.g0.p(p02, "p0");
            return Boolean.valueOf(p02.isSynthetic());
        }

        @Override // kotlin.jvm.internal.CallableReference, h10.c
        public final String getName() {
            return "isSynthetic";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final h10.h getOwner() {
            return o0.d(Member.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final String getSignature() {
            return "isSynthetic()Z";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class d extends FunctionReference implements x00.l<Field, w> {

        /* renamed from: a, reason: collision with root package name */
        public static final d f92862a = new d();

        public d() {
            super(1);
        }

        @Override // x00.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final w invoke(Field p02) {
            kotlin.jvm.internal.g0.p(p02, "p0");
            return new w(p02);
        }

        @Override // kotlin.jvm.internal.CallableReference, h10.c
        public final String getName() {
            return "<init>";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final h10.h getOwner() {
            return o0.d(w.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final String getSignature() {
            return "<init>(Ljava/lang/reflect/Field;)V";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class e extends FunctionReference implements x00.l<Method, z> {

        /* renamed from: a, reason: collision with root package name */
        public static final e f92863a = new e();

        public e() {
            super(1);
        }

        @Override // x00.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final z invoke(Method p02) {
            kotlin.jvm.internal.g0.p(p02, "p0");
            return new z(p02);
        }

        @Override // kotlin.jvm.internal.CallableReference, h10.c
        public final String getName() {
            return "<init>";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final h10.h getOwner() {
            return o0.d(z.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final String getSignature() {
            return "<init>(Ljava/lang/reflect/Method;)V";
        }
    }

    public q(@m80.k Class<?> klass) {
        kotlin.jvm.internal.g0.p(klass, "klass");
        this.f92858a = klass;
    }

    public static final boolean O(Class cls) {
        String simpleName = cls.getSimpleName();
        kotlin.jvm.internal.g0.o(simpleName, "getSimpleName(...)");
        return simpleName.length() == 0;
    }

    public static final n20.f P(Class cls) {
        String simpleName = cls.getSimpleName();
        if (!n20.f.i(simpleName)) {
            simpleName = null;
        }
        if (simpleName != null) {
            return n20.f.f(simpleName);
        }
        return null;
    }

    public static final boolean Q(q qVar, Method method) {
        if (method.isSynthetic()) {
            return false;
        }
        if (!qVar.J()) {
            return true;
        }
        kotlin.jvm.internal.g0.m(method);
        return !qVar.a0(method);
    }

    @Override // f20.g
    @m80.l
    public LightClassOriginKind B() {
        return null;
    }

    @Override // f20.g
    @m80.k
    public Collection<f20.w> E() {
        Object[] d11 = v10.b.f92816a.d(this.f92858a);
        if (d11 == null) {
            d11 = new Object[0];
        }
        ArrayList arrayList = new ArrayList(d11.length);
        for (Object obj : d11) {
            arrayList.add(new d0(obj));
        }
        return arrayList;
    }

    @Override // f20.g
    public boolean G() {
        Boolean e11 = v10.b.f92816a.e(this.f92858a);
        if (e11 != null) {
            return e11.booleanValue();
        }
        return false;
    }

    @Override // f20.g
    public boolean H() {
        return false;
    }

    @Override // f20.g
    public boolean J() {
        return this.f92858a.isEnum();
    }

    @Override // f20.g
    public boolean L() {
        return this.f92858a.isInterface();
    }

    @Override // f20.g
    @m80.k
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public List<t> f() {
        Constructor<?>[] declaredConstructors = this.f92858a.getDeclaredConstructors();
        kotlin.jvm.internal.g0.o(declaredConstructors, "getDeclaredConstructors(...)");
        return k0.I3(k0.N1(k0.W0(a00.a0.T5(declaredConstructors), a.f92859a), b.f92860a));
    }

    @Override // v10.j
    @m80.k
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public Class<?> e() {
        return this.f92858a;
    }

    @Override // f20.g
    @m80.k
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public List<w> getFields() {
        Field[] declaredFields = this.f92858a.getDeclaredFields();
        kotlin.jvm.internal.g0.o(declaredFields, "getDeclaredFields(...)");
        return k0.I3(k0.N1(k0.W0(a00.a0.T5(declaredFields), c.f92861a), d.f92862a));
    }

    @Override // f20.g
    @m80.k
    /* renamed from: X, reason: merged with bridge method [inline-methods] */
    public List<n20.f> u() {
        Class<?>[] declaredClasses = this.f92858a.getDeclaredClasses();
        kotlin.jvm.internal.g0.o(declaredClasses, "getDeclaredClasses(...)");
        return k0.I3(k0.S1(k0.W0(a00.a0.T5(declaredClasses), n.f92855a), o.f92856a));
    }

    @Override // f20.g
    @m80.k
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public List<z> v() {
        Method[] declaredMethods = this.f92858a.getDeclaredMethods();
        kotlin.jvm.internal.g0.o(declaredMethods, "getDeclaredMethods(...)");
        return k0.I3(k0.N1(k0.P0(a00.a0.T5(declaredMethods), new p(this)), e.f92863a));
    }

    @Override // f20.g
    @m80.l
    /* renamed from: Z, reason: merged with bridge method [inline-methods] */
    public q n() {
        Class<?> declaringClass = this.f92858a.getDeclaringClass();
        if (declaringClass != null) {
            return new q(declaringClass);
        }
        return null;
    }

    public final boolean a0(Method method) {
        String name = method.getName();
        if (kotlin.jvm.internal.g0.g(name, "values")) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            kotlin.jvm.internal.g0.o(parameterTypes, "getParameterTypes(...)");
            return parameterTypes.length == 0;
        }
        if (kotlin.jvm.internal.g0.g(name, "valueOf")) {
            return Arrays.equals(method.getParameterTypes(), new Class[]{String.class});
        }
        return false;
    }

    @Override // f20.g
    @m80.k
    public Collection<f20.j> c() {
        Class cls;
        cls = Object.class;
        if (kotlin.jvm.internal.g0.g(this.f92858a, cls)) {
            return a00.h0.J();
        }
        v0 v0Var = new v0(2);
        Object genericSuperclass = this.f92858a.getGenericSuperclass();
        v0Var.a(genericSuperclass != null ? genericSuperclass : Object.class);
        v0Var.b(this.f92858a.getGenericInterfaces());
        List Q = a00.h0.Q(v0Var.d(new Type[v0Var.c()]));
        ArrayList arrayList = new ArrayList(i0.d0(Q, 10));
        Iterator it = Q.iterator();
        while (it.hasNext()) {
            arrayList.add(new s((Type) it.next()));
        }
        return arrayList;
    }

    @Override // f20.g
    @m80.k
    public n20.c d() {
        return f.e(this.f92858a).a();
    }

    public boolean equals(@m80.l Object obj) {
        return (obj instanceof q) && kotlin.jvm.internal.g0.g(this.f92858a, ((q) obj).f92858a);
    }

    @Override // f20.d
    public /* bridge */ /* synthetic */ Collection getAnnotations() {
        return getAnnotations();
    }

    @Override // v10.a0
    public int getModifiers() {
        return this.f92858a.getModifiers();
    }

    @Override // f20.t
    @m80.k
    public n20.f getName() {
        if (!this.f92858a.isAnonymousClass()) {
            n20.f f11 = n20.f.f(this.f92858a.getSimpleName());
            kotlin.jvm.internal.g0.m(f11);
            return f11;
        }
        String name = this.f92858a.getName();
        kotlin.jvm.internal.g0.o(name, "getName(...)");
        n20.f f12 = n20.f.f(u30.k0.Q5(name, ".", null, 2, null));
        kotlin.jvm.internal.g0.m(f12);
        return f12;
    }

    @Override // f20.z
    @m80.k
    public List<f0> getTypeParameters() {
        TypeVariable<Class<?>>[] typeParameters = this.f92858a.getTypeParameters();
        kotlin.jvm.internal.g0.o(typeParameters, "getTypeParameters(...)");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Class<?>> typeVariable : typeParameters) {
            arrayList.add(new f0(typeVariable));
        }
        return arrayList;
    }

    @Override // f20.s
    @m80.k
    public o1 getVisibility() {
        int modifiers = getModifiers();
        return Modifier.isPublic(modifiers) ? n1.h.f78584c : Modifier.isPrivate(modifiers) ? n1.e.f78581c : Modifier.isProtected(modifiers) ? Modifier.isStatic(modifiers) ? a.c.f89206c : a.b.f89205c : a.C1171a.f89204c;
    }

    public int hashCode() {
        return this.f92858a.hashCode();
    }

    @Override // f20.d
    public /* bridge */ /* synthetic */ f20.a i(n20.c cVar) {
        return i(cVar);
    }

    @Override // f20.s
    public boolean isAbstract() {
        return Modifier.isAbstract(getModifiers());
    }

    @Override // f20.s
    public boolean isFinal() {
        return Modifier.isFinal(getModifiers());
    }

    @Override // f20.s
    public boolean j() {
        return Modifier.isStatic(getModifiers());
    }

    @Override // f20.g
    public boolean k() {
        Boolean f11 = v10.b.f92816a.f(this.f92858a);
        if (f11 != null) {
            return f11.booleanValue();
        }
        return false;
    }

    @Override // f20.g
    public boolean p() {
        return this.f92858a.isAnnotation();
    }

    @m80.k
    public String toString() {
        return q.class.getName() + ": " + this.f92858a;
    }

    @Override // f20.g
    @m80.k
    public q30.m<f20.j> w() {
        Class<?>[] c11 = v10.b.f92816a.c(this.f92858a);
        if (c11 != null) {
            ArrayList arrayList = new ArrayList(c11.length);
            for (Class<?> cls : c11) {
                arrayList.add(new s(cls));
            }
            q30.m<f20.j> E1 = r0.E1(arrayList);
            if (E1 != null) {
                return E1;
            }
        }
        return q30.x.l();
    }

    @Override // f20.d
    public boolean x() {
        return false;
    }

    @Override // v10.j, f20.d
    @m80.k
    public List<g> getAnnotations() {
        Annotation[] declaredAnnotations;
        List<g> b11;
        AnnotatedElement e11 = e();
        return (e11 == null || (declaredAnnotations = e11.getDeclaredAnnotations()) == null || (b11 = k.b(declaredAnnotations)) == null) ? a00.h0.J() : b11;
    }

    @Override // v10.j, f20.d
    @m80.l
    public g i(n20.c fqName) {
        Annotation[] declaredAnnotations;
        kotlin.jvm.internal.g0.p(fqName, "fqName");
        AnnotatedElement e11 = e();
        if (e11 == null || (declaredAnnotations = e11.getDeclaredAnnotations()) == null) {
            return null;
        }
        return k.a(declaredAnnotations, fqName);
    }
}

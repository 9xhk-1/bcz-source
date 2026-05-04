package v10;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nReflectJavaMember.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReflectJavaMember.kt\norg/jetbrains/kotlin/descriptors/runtime/structure/Java8ParameterNamesLoader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,105:1\n1#2:106\n11165#3:107\n11500#3,3:108\n*S KotlinDebug\n*F\n+ 1 ReflectJavaMember.kt\norg/jetbrains/kotlin/descriptors/runtime/structure/Java8ParameterNamesLoader\n*L\n100#1:107\n100#1:108,3\n*E\n"})
/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final c f92823a = new c();

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    public static a f92824b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public final Method f92825a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public final Method f92826b;

        public a(@m80.l Method method, @m80.l Method method2) {
            this.f92825a = method;
            this.f92826b = method2;
        }

        @m80.l
        public final Method a() {
            return this.f92826b;
        }

        @m80.l
        public final Method b() {
            return this.f92825a;
        }
    }

    @m80.k
    public final a a(@m80.k Member member) {
        kotlin.jvm.internal.g0.p(member, "member");
        Class<?> cls = member.getClass();
        try {
            return new a(cls.getMethod("getParameters", null), f.j(cls).loadClass("java.lang.reflect.Parameter").getMethod("getName", null));
        } catch (NoSuchMethodException unused) {
            return new a(null, null);
        }
    }

    @m80.l
    public final List<String> b(@m80.k Member member) {
        Method a11;
        kotlin.jvm.internal.g0.p(member, "member");
        a aVar = f92824b;
        if (aVar == null) {
            synchronized (this) {
                aVar = f92824b;
                if (aVar == null) {
                    aVar = f92823a.a(member);
                    f92824b = aVar;
                }
            }
        }
        Method b11 = aVar.b();
        if (b11 == null || (a11 = aVar.a()) == null) {
            return null;
        }
        Object invoke = b11.invoke(member, null);
        kotlin.jvm.internal.g0.n(invoke, "null cannot be cast to non-null type kotlin.Array<*>");
        Object[] objArr = (Object[]) invoke;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            Object invoke2 = a11.invoke(obj, null);
            kotlin.jvm.internal.g0.n(invoke2, "null cannot be cast to non-null type kotlin.String");
            arrayList.add((String) invoke2);
        }
        return arrayList;
    }
}

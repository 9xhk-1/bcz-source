package v10;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.internal.u0;
import v10.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nReflectJavaAnnotation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReflectJavaAnnotation.kt\norg/jetbrains/kotlin/descriptors/runtime/structure/ReflectJavaAnnotation\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,43:1\n11165#2:44\n11500#2,3:45\n*S KotlinDebug\n*F\n+ 1 ReflectJavaAnnotation.kt\norg/jetbrains/kotlin/descriptors/runtime/structure/ReflectJavaAnnotation\n*L\n26#1:44\n26#1:45,3\n*E\n"})
/* loaded from: classes8.dex */
public final class g extends u implements f20.a {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final Annotation f92839a;

    public g(@m80.k Annotation annotation) {
        kotlin.jvm.internal.g0.p(annotation, "annotation");
        this.f92839a = annotation;
    }

    @m80.k
    public final Annotation O() {
        return this.f92839a;
    }

    @Override // f20.a
    @m80.k
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public q l() {
        return new q(w00.b.d(w00.b.a(this.f92839a)));
    }

    @Override // f20.a
    @m80.k
    public n20.b a() {
        return f.e(w00.b.d(w00.b.a(this.f92839a)));
    }

    public boolean equals(@m80.l Object obj) {
        return (obj instanceof g) && this.f92839a == ((g) obj).f92839a;
    }

    @Override // f20.a
    @m80.k
    public Collection<f20.b> getArguments() {
        Method[] declaredMethods = w00.b.d(w00.b.a(this.f92839a)).getDeclaredMethods();
        kotlin.jvm.internal.g0.o(declaredMethods, "getDeclaredMethods(...)");
        ArrayList arrayList = new ArrayList(declaredMethods.length);
        for (Method method : declaredMethods) {
            h.a aVar = h.f92844b;
            Object invoke = method.invoke(this.f92839a, null);
            kotlin.jvm.internal.g0.o(invoke, "invoke(...)");
            arrayList.add(aVar.a(invoke, n20.f.f(method.getName())));
        }
        return arrayList;
    }

    @Override // f20.a
    public boolean h() {
        return false;
    }

    public int hashCode() {
        return System.identityHashCode(this.f92839a);
    }

    @m80.k
    public String toString() {
        return g.class.getName() + ": " + this.f92839a;
    }

    @Override // f20.a
    public boolean z() {
        return false;
    }
}

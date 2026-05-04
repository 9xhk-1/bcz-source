package v10;

import a00.r0;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nReflectJavaTypeParameter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReflectJavaTypeParameter.kt\norg/jetbrains/kotlin/descriptors/runtime/structure/ReflectJavaTypeParameter\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,50:1\n11165#2:51\n11500#2,3:52\n*S KotlinDebug\n*F\n+ 1 ReflectJavaTypeParameter.kt\norg/jetbrains/kotlin/descriptors/runtime/structure/ReflectJavaTypeParameter\n*L\n29#1:51\n29#1:52,3\n*E\n"})
/* loaded from: classes8.dex */
public final class f0 extends u implements j, f20.y {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final TypeVariable<?> f92838a;

    public f0(@m80.k TypeVariable<?> typeVariable) {
        kotlin.jvm.internal.g0.p(typeVariable, "typeVariable");
        this.f92838a = typeVariable;
    }

    @Override // f20.y
    @m80.k
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public List<s> getUpperBounds() {
        Type[] bounds = this.f92838a.getBounds();
        kotlin.jvm.internal.g0.o(bounds, "getBounds(...)");
        ArrayList arrayList = new ArrayList(bounds.length);
        for (Type type : bounds) {
            arrayList.add(new s(type));
        }
        s sVar = (s) r0.p5(arrayList);
        return kotlin.jvm.internal.g0.g(sVar != null ? sVar.O() : null, Object.class) ? a00.h0.J() : arrayList;
    }

    @Override // v10.j
    @m80.l
    public AnnotatedElement e() {
        TypeVariable<?> typeVariable = this.f92838a;
        if (typeVariable instanceof AnnotatedElement) {
            return (AnnotatedElement) typeVariable;
        }
        return null;
    }

    public boolean equals(@m80.l Object obj) {
        return (obj instanceof f0) && kotlin.jvm.internal.g0.g(this.f92838a, ((f0) obj).f92838a);
    }

    @Override // f20.d
    public /* bridge */ /* synthetic */ Collection getAnnotations() {
        return getAnnotations();
    }

    @Override // f20.t
    @m80.k
    public n20.f getName() {
        n20.f f11 = n20.f.f(this.f92838a.getName());
        kotlin.jvm.internal.g0.o(f11, "identifier(...)");
        return f11;
    }

    public int hashCode() {
        return this.f92838a.hashCode();
    }

    @Override // f20.d
    public /* bridge */ /* synthetic */ f20.a i(n20.c cVar) {
        return i(cVar);
    }

    @m80.k
    public String toString() {
        return f0.class.getName() + ": " + this.f92838a;
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

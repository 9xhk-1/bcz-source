package v10;

import a00.r0;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.u0;
import p10.n1;
import p10.o1;
import t10.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nReflectJavaMember.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReflectJavaMember.kt\norg/jetbrains/kotlin/descriptors/runtime/structure/ReflectJavaMember\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,105:1\n1#2:106\n*E\n"})
/* loaded from: classes8.dex */
public abstract class y extends u implements j, a0, f20.q {
    @Override // f20.q
    @m80.k
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public q D() {
        Class<?> declaringClass = P().getDeclaringClass();
        kotlin.jvm.internal.g0.o(declaringClass, "getDeclaringClass(...)");
        return new q(declaringClass);
    }

    @m80.k
    public abstract Member P();

    @m80.k
    public final List<f20.b0> Q(@m80.k Type[] parameterTypes, @m80.k Annotation[][] parameterAnnotations, boolean z11) {
        String str;
        kotlin.jvm.internal.g0.p(parameterTypes, "parameterTypes");
        kotlin.jvm.internal.g0.p(parameterAnnotations, "parameterAnnotations");
        ArrayList arrayList = new ArrayList(parameterTypes.length);
        List<String> b11 = c.f92823a.b(P());
        int size = b11 != null ? b11.size() - parameterTypes.length : 0;
        int length = parameterTypes.length;
        int i11 = 0;
        while (i11 < length) {
            e0 a11 = e0.f92833a.a(parameterTypes[i11]);
            if (b11 != null) {
                str = (String) r0.b3(b11, i11 + size);
                if (str == null) {
                    throw new IllegalStateException(("No parameter with index " + i11 + '+' + size + " (name=" + getName() + " type=" + a11 + ") in " + this).toString());
                }
            } else {
                str = null;
            }
            arrayList.add(new g0(a11, parameterAnnotations[i11], str, z11 && i11 == a00.a0.Oe(parameterTypes)));
            i11++;
        }
        return arrayList;
    }

    @Override // v10.j
    @m80.k
    public AnnotatedElement e() {
        Member P = P();
        kotlin.jvm.internal.g0.n(P, "null cannot be cast to non-null type java.lang.reflect.AnnotatedElement");
        return (AnnotatedElement) P;
    }

    public boolean equals(@m80.l Object obj) {
        return (obj instanceof y) && kotlin.jvm.internal.g0.g(P(), ((y) obj).P());
    }

    @Override // f20.d
    public /* bridge */ /* synthetic */ Collection getAnnotations() {
        return getAnnotations();
    }

    @Override // v10.a0
    public int getModifiers() {
        return P().getModifiers();
    }

    @Override // f20.t
    @m80.k
    public n20.f getName() {
        n20.f f11;
        String name = P().getName();
        return (name == null || (f11 = n20.f.f(name)) == null) ? n20.h.f74301b : f11;
    }

    @Override // f20.s
    @m80.k
    public o1 getVisibility() {
        int modifiers = getModifiers();
        return Modifier.isPublic(modifiers) ? n1.h.f78584c : Modifier.isPrivate(modifiers) ? n1.e.f78581c : Modifier.isProtected(modifiers) ? Modifier.isStatic(modifiers) ? a.c.f89206c : a.b.f89205c : a.C1171a.f89204c;
    }

    public int hashCode() {
        return P().hashCode();
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

    @m80.k
    public String toString() {
        return getClass().getName() + ": " + P();
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

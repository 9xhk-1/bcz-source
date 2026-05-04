package v10;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nReflectJavaConstructor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReflectJavaConstructor.kt\norg/jetbrains/kotlin/descriptors/runtime/structure/ReflectJavaConstructor\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,51:1\n11165#2:52\n11500#2,3:53\n*S KotlinDebug\n*F\n+ 1 ReflectJavaConstructor.kt\norg/jetbrains/kotlin/descriptors/runtime/structure/ReflectJavaConstructor\n*L\n49#1:52\n49#1:53,3\n*E\n"})
/* loaded from: classes8.dex */
public final class t extends y implements f20.k {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final Constructor<?> f92867a;

    public t(@m80.k Constructor<?> member) {
        kotlin.jvm.internal.g0.p(member, "member");
        this.f92867a = member;
    }

    @Override // v10.y
    @m80.k
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public Constructor<?> P() {
        return this.f92867a;
    }

    @Override // f20.k
    @m80.k
    public List<f20.b0> g() {
        Type[] genericParameterTypes = P().getGenericParameterTypes();
        kotlin.jvm.internal.g0.m(genericParameterTypes);
        if (genericParameterTypes.length == 0) {
            return a00.h0.J();
        }
        Class<?> declaringClass = P().getDeclaringClass();
        if (declaringClass.getDeclaringClass() != null && !Modifier.isStatic(declaringClass.getModifiers())) {
            genericParameterTypes = (Type[]) a00.q.l1(genericParameterTypes, 1, genericParameterTypes.length);
        }
        Annotation[][] parameterAnnotations = P().getParameterAnnotations();
        if (parameterAnnotations.length < genericParameterTypes.length) {
            throw new IllegalStateException("Illegal generic signature: " + P());
        }
        if (parameterAnnotations.length > genericParameterTypes.length) {
            kotlin.jvm.internal.g0.m(parameterAnnotations);
            parameterAnnotations = (Annotation[][]) a00.q.l1(parameterAnnotations, parameterAnnotations.length - genericParameterTypes.length, parameterAnnotations.length);
        }
        kotlin.jvm.internal.g0.m(genericParameterTypes);
        kotlin.jvm.internal.g0.m(parameterAnnotations);
        return Q(genericParameterTypes, parameterAnnotations, P().isVarArgs());
    }

    @Override // f20.z
    @m80.k
    public List<f0> getTypeParameters() {
        TypeVariable<Constructor<?>>[] typeParameters = P().getTypeParameters();
        kotlin.jvm.internal.g0.o(typeParameters, "getTypeParameters(...)");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Constructor<?>> typeVariable : typeParameters) {
            arrayList.add(new f0(typeVariable));
        }
        return arrayList;
    }
}

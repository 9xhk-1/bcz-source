package v10;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.u0;
import v10.e0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nReflectJavaMethod.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReflectJavaMethod.kt\norg/jetbrains/kotlin/descriptors/runtime/structure/ReflectJavaMethod\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,37:1\n1#2:38\n11165#3:39\n11500#3,3:40\n*S KotlinDebug\n*F\n+ 1 ReflectJavaMethod.kt\norg/jetbrains/kotlin/descriptors/runtime/structure/ReflectJavaMethod\n*L\n35#1:39\n35#1:40,3\n*E\n"})
/* loaded from: classes8.dex */
public final class z extends y implements f20.r {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final Method f92871a;

    public z(@m80.k Method member) {
        kotlin.jvm.internal.g0.p(member, "member");
        this.f92871a = member;
    }

    @Override // f20.r
    public boolean N() {
        return q() != null;
    }

    @Override // v10.y
    @m80.k
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public Method P() {
        return this.f92871a;
    }

    @Override // f20.r
    @m80.k
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public e0 getReturnType() {
        e0.a aVar = e0.f92833a;
        Type genericReturnType = P().getGenericReturnType();
        kotlin.jvm.internal.g0.o(genericReturnType, "getGenericReturnType(...)");
        return aVar.a(genericReturnType);
    }

    @Override // f20.r
    @m80.k
    public List<f20.b0> g() {
        Type[] genericParameterTypes = P().getGenericParameterTypes();
        kotlin.jvm.internal.g0.o(genericParameterTypes, "getGenericParameterTypes(...)");
        Annotation[][] parameterAnnotations = P().getParameterAnnotations();
        kotlin.jvm.internal.g0.o(parameterAnnotations, "getParameterAnnotations(...)");
        return Q(genericParameterTypes, parameterAnnotations, P().isVarArgs());
    }

    @Override // f20.z
    @m80.k
    public List<f0> getTypeParameters() {
        TypeVariable<Method>[] typeParameters = P().getTypeParameters();
        kotlin.jvm.internal.g0.o(typeParameters, "getTypeParameters(...)");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Method> typeVariable : typeParameters) {
            arrayList.add(new f0(typeVariable));
        }
        return arrayList;
    }

    @Override // f20.r
    @m80.l
    public f20.b q() {
        Object defaultValue = P().getDefaultValue();
        if (defaultValue != null) {
            return h.f92844b.a(defaultValue, null);
        }
        return null;
    }
}

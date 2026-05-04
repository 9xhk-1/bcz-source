package v10;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.u0;
import v10.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nReflectJavaAnnotationArguments.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReflectJavaAnnotationArguments.kt\norg/jetbrains/kotlin/descriptors/runtime/structure/ReflectJavaArrayAnnotationArgument\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,79:1\n11165#2:80\n11500#2,3:81\n*S KotlinDebug\n*F\n+ 1 ReflectJavaAnnotationArguments.kt\norg/jetbrains/kotlin/descriptors/runtime/structure/ReflectJavaArrayAnnotationArgument\n*L\n48#1:80\n48#1:81,3\n*E\n"})
/* loaded from: classes8.dex */
public final class l extends h implements f20.e {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final Object[] f92850c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(@m80.l n20.f fVar, @m80.k Object[] values) {
        super(fVar, null);
        kotlin.jvm.internal.g0.p(values, "values");
        this.f92850c = values;
    }

    @Override // f20.e
    @m80.k
    public List<h> getElements() {
        Object[] objArr = this.f92850c;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            h.a aVar = h.f92844b;
            kotlin.jvm.internal.g0.m(obj);
            arrayList.add(aVar.a(obj, null));
        }
        return arrayList;
    }
}

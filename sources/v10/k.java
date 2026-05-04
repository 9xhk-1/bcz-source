package v10;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nReflectJavaAnnotationOwner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReflectJavaAnnotationOwner.kt\norg/jetbrains/kotlin/descriptors/runtime/structure/ReflectJavaAnnotationOwnerKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,43:1\n11165#2:44\n11500#2,3:45\n1310#2,2:48\n1#3:50\n*S KotlinDebug\n*F\n+ 1 ReflectJavaAnnotationOwner.kt\norg/jetbrains/kotlin/descriptors/runtime/structure/ReflectJavaAnnotationOwnerKt\n*L\n37#1:44\n37#1:45,3\n41#1:48,2\n*E\n"})
/* loaded from: classes8.dex */
public final class k {
    @m80.l
    public static final g a(@m80.k Annotation[] annotationArr, @m80.k n20.c fqName) {
        Annotation annotation;
        kotlin.jvm.internal.g0.p(annotationArr, "<this>");
        kotlin.jvm.internal.g0.p(fqName, "fqName");
        int length = annotationArr.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                annotation = null;
                break;
            }
            annotation = annotationArr[i11];
            if (kotlin.jvm.internal.g0.g(f.e(w00.b.d(w00.b.a(annotation))).a(), fqName)) {
                break;
            }
            i11++;
        }
        if (annotation != null) {
            return new g(annotation);
        }
        return null;
    }

    @m80.k
    public static final List<g> b(@m80.k Annotation[] annotationArr) {
        kotlin.jvm.internal.g0.p(annotationArr, "<this>");
        ArrayList arrayList = new ArrayList(annotationArr.length);
        for (Annotation annotation : annotationArr) {
            arrayList.add(new g(annotation));
        }
        return arrayList;
    }
}

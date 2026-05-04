package j50;

import java.lang.annotation.Annotation;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nEnums.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Enums.kt\nkotlinx/serialization/internal/EnumsKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,148:1\n13537#2,2:149\n13472#2,2:151\n13539#2:153\n13472#2,2:154\n13537#2,2:156\n13472#2,2:158\n13539#2:160\n*S KotlinDebug\n*F\n+ 1 Enums.kt\nkotlinx/serialization/internal/EnumsKt\n*L\n68#1:149,2\n71#1:151,2\n68#1:153\n88#1:154,2\n91#1:156,2\n94#1:158,2\n91#1:160\n*E\n"})
/* loaded from: classes8.dex */
public final class l0 {
    @yz.v0
    @m80.k
    public static final <T extends Enum<T>> f50.i<T> a(@m80.k String serialName, @m80.k T[] values, @m80.k String[] names, @m80.k Annotation[][] entryAnnotations, @m80.l Annotation[] annotationArr) {
        kotlin.jvm.internal.g0.p(serialName, "serialName");
        kotlin.jvm.internal.g0.p(values, "values");
        kotlin.jvm.internal.g0.p(names, "names");
        kotlin.jvm.internal.g0.p(entryAnnotations, "entryAnnotations");
        i0 i0Var = new i0(serialName, values.length);
        if (annotationArr != null) {
            for (Annotation annotation : annotationArr) {
                i0Var.y(annotation);
            }
        }
        int length = values.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            T t11 = values[i11];
            int i13 = i12 + 1;
            String str = (String) a00.a0.hf(names, i12);
            if (str == null) {
                str = t11.name();
            }
            l2.r(i0Var, str, false, 2, null);
            Annotation[] annotationArr2 = (Annotation[]) a00.a0.hf(entryAnnotations, i12);
            if (annotationArr2 != null) {
                for (Annotation annotation2 : annotationArr2) {
                    i0Var.x(annotation2);
                }
            }
            i11++;
            i12 = i13;
        }
        return new k0(serialName, values, i0Var);
    }

    @yz.v0
    @m80.k
    public static final <T extends Enum<T>> f50.i<T> b(@m80.k String serialName, @m80.k T[] values, @m80.k String[] names, @m80.k Annotation[][] annotations) {
        kotlin.jvm.internal.g0.p(serialName, "serialName");
        kotlin.jvm.internal.g0.p(values, "values");
        kotlin.jvm.internal.g0.p(names, "names");
        kotlin.jvm.internal.g0.p(annotations, "annotations");
        i0 i0Var = new i0(serialName, values.length);
        int length = values.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            T t11 = values[i11];
            int i13 = i12 + 1;
            String str = (String) a00.a0.hf(names, i12);
            if (str == null) {
                str = t11.name();
            }
            l2.r(i0Var, str, false, 2, null);
            Annotation[] annotationArr = (Annotation[]) a00.a0.hf(annotations, i12);
            if (annotationArr != null) {
                for (Annotation annotation : annotationArr) {
                    i0Var.x(annotation);
                }
            }
            i11++;
            i12 = i13;
        }
        return new k0(serialName, values, i0Var);
    }

    @yz.v0
    @m80.k
    public static final <T extends Enum<T>> f50.i<T> c(@m80.k String serialName, @m80.k T[] values) {
        kotlin.jvm.internal.g0.p(serialName, "serialName");
        kotlin.jvm.internal.g0.p(values, "values");
        return new k0(serialName, values);
    }
}

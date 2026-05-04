package p7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nConvert.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Convert.kt\ncom/baicizhan/app/biz/userbook/ConvertKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,34:1\n1563#2:35\n1634#2,3:36\n37#3,2:39\n11561#4:41\n11896#4,3:42\n*S KotlinDebug\n*F\n+ 1 Convert.kt\ncom/baicizhan/app/biz/userbook/ConvertKt\n*L\n15#1:35\n15#1:36,3\n15#1:39,2\n27#1:41\n27#1:42,3\n*E\n"})
/* loaded from: classes3.dex */
public final class a {
    @m80.k
    public static final k3.k0 a(@m80.k w8.a aVar) {
        kotlin.jvm.internal.g0.p(aVar, "<this>");
        int i11 = aVar.f95698b;
        String str = aVar.f95699c;
        List<w8.d> list = aVar.f95697a;
        ArrayList arrayList = new ArrayList(a00.i0.d0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(b((w8.d) it.next()));
        }
        return new k3.k0((k3.m0[]) arrayList.toArray(new k3.m0[0]), i11, str);
    }

    @m80.k
    public static final k3.m0 b(@m80.k w8.d dVar) {
        kotlin.jvm.internal.g0.p(dVar, "<this>");
        return new k3.m0(dVar.f95721a, dVar.f95722b, dVar.f95723c, dVar.f95724d);
    }

    @m80.k
    public static final w8.c c(@m80.k k3.l0 l0Var) {
        kotlin.jvm.internal.g0.p(l0Var, "<this>");
        long parseLong = Long.parseLong(l0Var.g());
        int f11 = l0Var.f();
        k3.n0[] h11 = l0Var.h();
        ArrayList arrayList = new ArrayList(h11.length);
        for (k3.n0 n0Var : h11) {
            arrayList.add(d(n0Var));
        }
        return new w8.c(parseLong, f11, arrayList);
    }

    @m80.k
    public static final w8.e d(@m80.k k3.n0 n0Var) {
        kotlin.jvm.internal.g0.p(n0Var, "<this>");
        return new w8.e(n0Var.f(), n0Var.e());
    }
}

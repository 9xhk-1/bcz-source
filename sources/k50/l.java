package k50;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.u0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nJsonElementBuilders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsonElementBuilders.kt\nkotlinx/serialization/json/JsonElementBuildersKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,231:1\n29#1,3:232\n52#1,3:235\n29#1,3:238\n52#1,3:241\n1563#2:244\n1634#2,3:245\n1563#2:248\n1634#2,3:249\n1563#2:252\n1634#2,3:253\n*S KotlinDebug\n*F\n+ 1 JsonElementBuilders.kt\nkotlinx/serialization/json/JsonElementBuildersKt\n*L\n82#1:232,3\n90#1:235,3\n189#1:238,3\n197#1:241,3\n207#1:244\n207#1:245,3\n217#1:248\n217#1:249,3\n227#1:252\n227#1:253,3\n*E\n"})
/* loaded from: classes8.dex */
public final class l {
    public static final boolean a(@m80.k c cVar, @m80.l Boolean bool) {
        kotlin.jvm.internal.g0.p(cVar, "<this>");
        return cVar.a(o.b(bool));
    }

    public static final boolean b(@m80.k c cVar, @m80.l Number number) {
        kotlin.jvm.internal.g0.p(cVar, "<this>");
        return cVar.a(o.c(number));
    }

    public static final boolean c(@m80.k c cVar, @m80.l String str) {
        kotlin.jvm.internal.g0.p(cVar, "<this>");
        return cVar.a(o.d(str));
    }

    @f50.f
    public static final boolean d(@m80.k c cVar, @m80.l Void r12) {
        kotlin.jvm.internal.g0.p(cVar, "<this>");
        return cVar.a(f0.INSTANCE);
    }

    @w00.j(name = "addAllBooleans")
    @f50.f
    public static final boolean e(@m80.k c cVar, @m80.k Collection<Boolean> values) {
        kotlin.jvm.internal.g0.p(cVar, "<this>");
        kotlin.jvm.internal.g0.p(values, "values");
        Collection<Boolean> collection = values;
        ArrayList arrayList = new ArrayList(a00.i0.d0(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(o.b((Boolean) it.next()));
        }
        return cVar.b(arrayList);
    }

    @w00.j(name = "addAllNumbers")
    @f50.f
    public static final boolean f(@m80.k c cVar, @m80.k Collection<? extends Number> values) {
        kotlin.jvm.internal.g0.p(cVar, "<this>");
        kotlin.jvm.internal.g0.p(values, "values");
        Collection<? extends Number> collection = values;
        ArrayList arrayList = new ArrayList(a00.i0.d0(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(o.c((Number) it.next()));
        }
        return cVar.b(arrayList);
    }

    @w00.j(name = "addAllStrings")
    @f50.f
    public static final boolean g(@m80.k c cVar, @m80.k Collection<String> values) {
        kotlin.jvm.internal.g0.p(cVar, "<this>");
        kotlin.jvm.internal.g0.p(values, "values");
        Collection<String> collection = values;
        ArrayList arrayList = new ArrayList(a00.i0.d0(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(o.d((String) it.next()));
        }
        return cVar.b(arrayList);
    }

    public static final boolean h(@m80.k c cVar, @m80.k x00.l<? super c, g2> builderAction) {
        kotlin.jvm.internal.g0.p(cVar, "<this>");
        kotlin.jvm.internal.g0.p(builderAction, "builderAction");
        c cVar2 = new c();
        builderAction.invoke(cVar2);
        return cVar.a(cVar2.c());
    }

    public static final boolean i(@m80.k c cVar, @m80.k x00.l<? super j0, g2> builderAction) {
        kotlin.jvm.internal.g0.p(cVar, "<this>");
        kotlin.jvm.internal.g0.p(builderAction, "builderAction");
        j0 j0Var = new j0();
        builderAction.invoke(j0Var);
        return cVar.a(j0Var.a());
    }

    @m80.k
    public static final b j(@m80.k x00.l<? super c, g2> builderAction) {
        kotlin.jvm.internal.g0.p(builderAction, "builderAction");
        c cVar = new c();
        builderAction.invoke(cVar);
        return cVar.c();
    }

    @m80.k
    public static final i0 k(@m80.k x00.l<? super j0, g2> builderAction) {
        kotlin.jvm.internal.g0.p(builderAction, "builderAction");
        j0 j0Var = new j0();
        builderAction.invoke(j0Var);
        return j0Var.a();
    }

    @m80.l
    public static final k l(@m80.k j0 j0Var, @m80.k String key, @m80.l Boolean bool) {
        kotlin.jvm.internal.g0.p(j0Var, "<this>");
        kotlin.jvm.internal.g0.p(key, "key");
        return j0Var.b(key, o.b(bool));
    }

    @m80.l
    public static final k m(@m80.k j0 j0Var, @m80.k String key, @m80.l Number number) {
        kotlin.jvm.internal.g0.p(j0Var, "<this>");
        kotlin.jvm.internal.g0.p(key, "key");
        return j0Var.b(key, o.c(number));
    }

    @m80.l
    public static final k n(@m80.k j0 j0Var, @m80.k String key, @m80.l String str) {
        kotlin.jvm.internal.g0.p(j0Var, "<this>");
        kotlin.jvm.internal.g0.p(key, "key");
        return j0Var.b(key, o.d(str));
    }

    @m80.l
    @f50.f
    public static final k o(@m80.k j0 j0Var, @m80.k String key, @m80.l Void r22) {
        kotlin.jvm.internal.g0.p(j0Var, "<this>");
        kotlin.jvm.internal.g0.p(key, "key");
        return j0Var.b(key, f0.INSTANCE);
    }

    @m80.l
    public static final k p(@m80.k j0 j0Var, @m80.k String key, @m80.k x00.l<? super c, g2> builderAction) {
        kotlin.jvm.internal.g0.p(j0Var, "<this>");
        kotlin.jvm.internal.g0.p(key, "key");
        kotlin.jvm.internal.g0.p(builderAction, "builderAction");
        c cVar = new c();
        builderAction.invoke(cVar);
        return j0Var.b(key, cVar.c());
    }

    @m80.l
    public static final k q(@m80.k j0 j0Var, @m80.k String key, @m80.k x00.l<? super j0, g2> builderAction) {
        kotlin.jvm.internal.g0.p(j0Var, "<this>");
        kotlin.jvm.internal.g0.p(key, "key");
        kotlin.jvm.internal.g0.p(builderAction, "builderAction");
        j0 j0Var2 = new j0();
        builderAction.invoke(j0Var2);
        return j0Var.b(key, j0Var2.a());
    }
}

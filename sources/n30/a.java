package n30;

import java.util.Collection;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import x20.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nscopeUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 scopeUtils.kt\norg/jetbrains/kotlin/util/collectionUtils/ScopeUtilsKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 CollectionUtil.kt\norg/jetbrains/kotlin/utils/CollectionUtilKt\n*L\n1#1,111:1\n4344#2,2:112\n865#3,2:114\n9#4,6:116\n*S KotlinDebug\n*F\n+ 1 scopeUtils.kt\norg/jetbrains/kotlin/util/collectionUtils/ScopeUtilsKt\n*L\n85#1:112,2\n88#1:114,2\n109#1:116,6\n*E\n"})
/* loaded from: classes8.dex */
public final class a {
    /* JADX WARN: Multi-variable type inference failed */
    @l
    public static final <T> Collection<T> a(@l Collection<? extends T> collection, @k Collection<? extends T> collection2) {
        g0.p(collection2, "collection");
        if (collection2.isEmpty()) {
            return collection;
        }
        if (collection == 0) {
            return collection2;
        }
        if (collection instanceof LinkedHashSet) {
            ((LinkedHashSet) collection).addAll(collection2);
            return collection;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        linkedHashSet.addAll(collection2);
        return linkedHashSet;
    }

    @k
    public static final o30.k<x20.k> b(@k Iterable<? extends x20.k> scopes) {
        g0.p(scopes, "scopes");
        o30.k<x20.k> kVar = new o30.k<>();
        for (x20.k kVar2 : scopes) {
            x20.k kVar3 = kVar2;
            if (kVar3 != null && kVar3 != k.c.f97119b) {
                kVar.add(kVar2);
            }
        }
        return kVar;
    }
}

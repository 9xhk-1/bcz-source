package ey;

import a00.r0;
import java.util.List;
import java.util.ListIterator;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nMergedApplicationConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MergedApplicationConfig.kt\nio/ktor/server/config/MergedApplicationConfigKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,74:1\n1#2:75\n1827#3,8:76\n*S KotlinDebug\n*F\n+ 1 MergedApplicationConfig.kt\nio/ktor/server/config/MergedApplicationConfigKt\n*L\n17#1:76,8\n*E\n"})
/* loaded from: classes8.dex */
public final class n {
    @yz.n(level = DeprecationLevel.ERROR, message = "Use mergeWith/withFallback instead.")
    @m80.k
    public static final a a(@m80.k List<? extends a> list) {
        g0.p(list, "<this>");
        if (list.isEmpty()) {
            throw new IllegalArgumentException("List of configs can not be empty");
        }
        Object u32 = r0.u3(list);
        if (!list.isEmpty()) {
            ListIterator<? extends a> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                u32 = c(listIterator.previous(), (a) u32);
            }
        }
        return (a) u32;
    }

    @m80.k
    public static final a b(@m80.k a aVar, @m80.k a other) {
        g0.p(aVar, "<this>");
        g0.p(other, "other");
        return new m(other, aVar);
    }

    @m80.k
    public static final a c(@m80.k a aVar, @m80.k a other) {
        g0.p(aVar, "<this>");
        g0.p(other, "other");
        return new m(aVar, other);
    }
}

package com.baicizhan.client.business.util;

import kotlin.Pair;
import kotlin.Triple;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nstandard_ext.kt\nKotlin\n*S Kotlin\n*F\n+ 1 standard_ext.kt\ncom/baicizhan/client/business/util/Standard_extKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,53:1\n18#1,3:55\n18#1,3:58\n1#2:54\n13805#3,2:61\n*S KotlinDebug\n*F\n+ 1 standard_ext.kt\ncom/baicizhan/client/business/util/Standard_extKt\n*L\n26#1:55,3\n28#1:58,3\n44#1:61,2\n*E\n"})
/* loaded from: classes4.dex */
public final class Standard_extKt {
    public static final <T> boolean anyOf(@m80.l T t11, @m80.k T[] array) {
        g0.p(array, "array");
        if (t11 == null) {
            return false;
        }
        for (T t12 : array) {
            if (g0.g(t11, t12)) {
                return true;
            }
        }
        return false;
    }

    @m80.l
    public static final <R> R available(@m80.l String str, @m80.k x00.l<? super String, ? extends R> block) {
        g0.p(block, "block");
        if (str == null || str.length() == 0) {
            return null;
        }
        return block.invoke(str);
    }

    @m80.k
    public static final String availableWith(@m80.l String str, @m80.k String str2) {
        g0.p(str2, "default");
        if (str == null || str.length() == 0) {
            str = null;
        }
        if (str != null) {
            return str;
        }
        String str3 = str2.length() != 0 ? str2 : null;
        if (str3 != null) {
            return str3;
        }
        if (str2.length() > 0) {
            return "";
        }
        throw new IllegalStateException("Check failed.");
    }

    @m80.l
    public static final String getAvailable(@m80.l String str) {
        if (str == null || str.length() <= 0) {
            return null;
        }
        return str;
    }

    @m80.k
    public static final String orBy(@m80.l String str, @m80.l String str2) {
        return (str == null || str.length() == 0) ? str2 == null ? "" : str2 : str;
    }

    @m80.k
    public static final <A, B, C> Triple<A, B, C> triplet(@m80.k Pair<? extends A, ? extends B> pair, C c11) {
        g0.p(pair, "<this>");
        return new Triple<>(pair.getFirst(), pair.getSecond(), c11);
    }
}

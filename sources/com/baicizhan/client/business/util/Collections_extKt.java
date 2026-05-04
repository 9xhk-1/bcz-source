package com.baicizhan.client.business.util;

import java.util.Collection;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\ncollections_ext.kt\nKotlin\n*S Kotlin\n*F\n+ 1 collections_ext.kt\ncom/baicizhan/client/business/util/Collections_extKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,35:1\n13805#2,2:36\n*S KotlinDebug\n*F\n+ 1 collections_ext.kt\ncom/baicizhan/client/business/util/Collections_extKt\n*L\n30#1:36,2\n*E\n"})
/* loaded from: classes4.dex */
public final class Collections_extKt {
    @m80.l
    public static final <E, T extends Collection<? extends E>, R> R available(@m80.l T t11, @m80.k x00.l<? super T, ? extends R> block) {
        g0.p(block, "block");
        if (t11 == null || t11.isEmpty()) {
            return null;
        }
        return block.invoke(t11);
    }

    @m80.l
    public static final <E, T extends Collection<? extends E>> T getAvailable(@m80.l T t11) {
        if (t11 == null || t11.isEmpty()) {
            return null;
        }
        return t11;
    }

    public static final <T> boolean hasAny(@m80.k Collection<? extends T> collection, @m80.k T... params) {
        g0.p(collection, "<this>");
        g0.p(params, "params");
        for (T t11 : params) {
            if (collection.contains(t11)) {
                return true;
            }
        }
        return false;
    }
}

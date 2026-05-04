package com.huawei.hms.common.data;

import com.baicizhan.main.plusreview.activity.DefaultReviewActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class FreezableUtils {
    public static <T, E extends Freezable<T>> ArrayList<T> freeze(ArrayList<E> arrayList) {
        return freezeIterable(arrayList);
    }

    public static <T, E extends Freezable<T>> ArrayList<T> freezeIterable(Iterable<E> iterable) {
        DefaultReviewActivity.r rVar = (ArrayList<T>) new ArrayList();
        if (iterable != null) {
            Iterator<E> it = iterable.iterator();
            while (it.hasNext()) {
                rVar.add(it.next().freeze());
            }
        }
        return rVar;
    }

    public static <T, E extends Freezable<T>> ArrayList<T> freeze(E[] eArr) {
        return freezeIterable(Arrays.asList(eArr));
    }
}

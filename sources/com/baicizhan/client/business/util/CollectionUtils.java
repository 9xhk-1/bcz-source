package com.baicizhan.client.business.util;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class CollectionUtils {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface Filter<T> {
        boolean filter(T t11);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface Mapper<T, R> {
        R map(T t11);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface Processor<T> {
        void process(T t11);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface Reducer<T, R> {
        R reduce(R acc, T t11);
    }

    private CollectionUtils() {
    }

    public static <T> int count(Collection<T> collection, Filter<T> filter) {
        if (isEmpty((Collection<?>) collection)) {
            return 0;
        }
        return count(collection.iterator(), filter);
    }

    public static <T> List<T> filter(Collection<T> list, Filter<T> filter) {
        if (list == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        for (T t11 : list) {
            if (filter.filter(t11)) {
                arrayList.add(t11);
            }
        }
        return arrayList;
    }

    public static <T> void filterInPlace(Iterator<T> iterator, Filter<T> filter, Collection<T> remained) {
        if (iterator == null || !iterator.hasNext()) {
            return;
        }
        while (iterator.hasNext()) {
            T next = iterator.next();
            if (!filter.filter(next)) {
                iterator.remove();
                if (remained != null) {
                    remained.add(next);
                }
            }
        }
    }

    public static <T> void foreach(Collection<T> collection, Processor<T> processor) {
        if (isEmpty((Collection<?>) collection)) {
            return;
        }
        foreach(collection.iterator(), processor);
    }

    public static boolean isEmpty(Collection<?> collection) {
        return collection == null || collection.size() == 0;
    }

    public static <T, R> List<R> map(Collection<T> collection, Mapper<T, R> mapper) {
        return isEmpty((Collection<?>) collection) ? Collections.EMPTY_LIST : map(collection.iterator(), mapper);
    }

    public static <T, R> R reduce(Collection<T> collection, Reducer<T, R> reducer, R r11) {
        return isEmpty((Collection<?>) collection) ? r11 : (R) reduce(collection.iterator(), reducer, r11);
    }

    public static <T> List<T> sparseArrayToList(SparseArray<T> sparseArray) {
        if (sparseArray.size() == 0) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < sparseArray.size(); i11++) {
            T valueAt = sparseArray.valueAt(i11);
            if (valueAt != null) {
                arrayList.add(valueAt);
            }
        }
        return arrayList;
    }

    public static boolean isEmpty(Map<?, ?> map) {
        return map == null || map.size() == 0;
    }

    public static <T> int count(Iterator<T> iterator, Filter<T> filter) {
        int i11 = 0;
        if (iterator != null && iterator.hasNext()) {
            while (iterator.hasNext()) {
                if (filter.filter(iterator.next())) {
                    i11++;
                }
            }
        }
        return i11;
    }

    public static <T> void foreach(Iterator<T> iterator, Processor<T> processor) {
        if (iterator == null || !iterator.hasNext()) {
            return;
        }
        while (iterator.hasNext()) {
            processor.process(iterator.next());
        }
    }

    public static <T, R> List<R> map(Iterator<T> iterator, Mapper<T, R> mapper) {
        if (iterator != null && iterator.hasNext()) {
            ArrayList arrayList = new ArrayList();
            while (iterator.hasNext()) {
                arrayList.add(mapper.map(iterator.next()));
            }
            return arrayList;
        }
        return Collections.EMPTY_LIST;
    }

    public static <T, R> R reduce(Iterator<T> iterator, Reducer<T, R> reducer, R init) {
        while (iterator.hasNext()) {
            init = reducer.reduce(init, iterator.next());
        }
        return init;
    }

    public static <T> List<T> filter(Iterator<T> iterator, Filter<T> filter) {
        if (iterator != null && iterator.hasNext()) {
            ArrayList arrayList = new ArrayList();
            while (iterator.hasNext()) {
                T next = iterator.next();
                if (filter.filter(next)) {
                    arrayList.add(next);
                }
            }
            return arrayList;
        }
        return Collections.EMPTY_LIST;
    }
}

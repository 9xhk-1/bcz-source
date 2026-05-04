package xb;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class e {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface a<T> {
        boolean filter(T t11);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface b<T, R> {
        R map(T t11);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface c<T> {
        void process(T t11);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface d<T, R> {
        R reduce(R acc, T t11);
    }

    public static <T> int a(Collection<T> collection, a<T> filter) {
        if (h(collection)) {
            return 0;
        }
        return b(collection.iterator(), filter);
    }

    public static <T> int b(Iterator<T> iterator, a<T> filter) {
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

    public static <T> List<T> c(Collection<T> list, a<T> filter) {
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

    public static <T> List<T> d(Iterator<T> iterator, a<T> filter) {
        if (iterator == null || !iterator.hasNext()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        while (iterator.hasNext()) {
            T next = iterator.next();
            if (filter.filter(next)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public static <T> void e(Iterator<T> iterator, a<T> filter, Collection<T> remained) {
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

    public static <T> void f(Collection<T> collection, c<T> processor) {
        if (h(collection)) {
            return;
        }
        g(collection.iterator(), processor);
    }

    public static <T> void g(Iterator<T> iterator, c<T> processor) {
        if (iterator == null || !iterator.hasNext()) {
            return;
        }
        while (iterator.hasNext()) {
            processor.process(iterator.next());
        }
    }

    public static boolean h(Collection<?> collection) {
        return collection == null || collection.size() == 0;
    }

    public static boolean i(Map<?, ?> map) {
        return map == null || map.size() == 0;
    }

    public static <T, R> List<R> j(Collection<T> collection, b<T, R> mapper) {
        return h(collection) ? Collections.EMPTY_LIST : k(collection.iterator(), mapper);
    }

    public static <T, R> List<R> k(Iterator<T> iterator, b<T, R> mapper) {
        if (iterator == null || !iterator.hasNext()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        while (iterator.hasNext()) {
            arrayList.add(mapper.map(iterator.next()));
        }
        return arrayList;
    }

    public static <T, R> R l(Collection<T> collection, d<T, R> dVar, R r11) {
        return h(collection) ? r11 : (R) m(collection.iterator(), dVar, r11);
    }

    public static <T, R> R m(Iterator<T> iterator, d<T, R> reducer, R init) {
        while (iterator.hasNext()) {
            init = reducer.reduce(init, iterator.next());
        }
        return init;
    }

    public static <T> List<T> n(SparseArray<T> sparseArray) {
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
}

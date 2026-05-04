package a00;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class m1 extends l1 {
    @yz.n(message = "Use maxByOrNull instead.", replaceWith = @yz.w0(expression = "this.maxByOrNull(selector)", imports = {}))
    @o00.f
    @yz.o(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <K, V, R extends Comparable<? super R>> Map.Entry<K, V> L0(Map<? extends K, ? extends V> map, x00.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> selector) {
        Map.Entry<K, V> entry;
        kotlin.jvm.internal.g0.p(map, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry<K, V> entry2 = (Object) it.next();
            if (it.hasNext()) {
                R invoke = selector.invoke(entry2);
                do {
                    Map.Entry<K, V> entry3 = (Object) it.next();
                    R invoke2 = selector.invoke(entry3);
                    if (invoke.compareTo(invoke2) < 0) {
                        entry2 = entry3;
                        invoke = invoke2;
                    }
                } while (it.hasNext());
            }
            entry = entry2;
        } else {
            entry = null;
        }
        return entry;
    }

    @yz.n(message = "Use maxWithOrNull instead.", replaceWith = @yz.w0(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @o00.f
    @yz.o(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <K, V> Map.Entry<K, V> M0(Map<? extends K, ? extends V> map, Comparator<? super Map.Entry<? extends K, ? extends V>> comparator) {
        kotlin.jvm.internal.g0.p(map, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        return (Map.Entry) r0.a4(map.entrySet(), comparator);
    }

    @yz.n(message = "Use minByOrNull instead.", replaceWith = @yz.w0(expression = "this.minByOrNull(selector)", imports = {}))
    @yz.o(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <K, V, R extends Comparable<? super R>> Map.Entry<K, V> N0(Map<? extends K, ? extends V> map, x00.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> selector) {
        Map.Entry<K, V> entry;
        kotlin.jvm.internal.g0.p(map, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry<K, V> entry2 = (Object) it.next();
            if (it.hasNext()) {
                R invoke = selector.invoke(entry2);
                do {
                    Map.Entry<K, V> entry3 = (Object) it.next();
                    R invoke2 = selector.invoke(entry3);
                    if (invoke.compareTo(invoke2) > 0) {
                        entry2 = entry3;
                        invoke = invoke2;
                    }
                } while (it.hasNext());
            }
            entry = entry2;
        } else {
            entry = null;
        }
        return entry;
    }

    @yz.n(message = "Use minWithOrNull instead.", replaceWith = @yz.w0(expression = "this.minWithOrNull(comparator)", imports = {}))
    @yz.o(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Map.Entry O0(Map map, Comparator comparator) {
        kotlin.jvm.internal.g0.p(map, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        return (Map.Entry) r0.s4(map.entrySet(), comparator);
    }
}

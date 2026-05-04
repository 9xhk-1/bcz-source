package a00;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import kotlin.DeprecationLevel;
import kotlin.NotImplementedError;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class l0 extends k0 {
    @yz.y0(version = "1.2")
    @o00.f
    public static final <T> void l0(List<T> list, T t11) {
        kotlin.jvm.internal.g0.p(list, "<this>");
        Collections.fill(list, t11);
    }

    @yz.y0(version = "1.2")
    @o00.f
    public static final <T> void m0(List<T> list) {
        kotlin.jvm.internal.g0.p(list, "<this>");
        Collections.shuffle(list);
    }

    @yz.y0(version = "1.2")
    @o00.f
    public static final <T> void n0(List<T> list, Random random) {
        kotlin.jvm.internal.g0.p(list, "<this>");
        kotlin.jvm.internal.g0.p(random, "random");
        Collections.shuffle(list, random);
    }

    public static <T extends Comparable<? super T>> void o0(@m80.k List<T> list) {
        kotlin.jvm.internal.g0.p(list, "<this>");
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "Use sortWith(comparator) instead.", replaceWith = @yz.w0(expression = "this.sortWith(comparator)", imports = {}))
    @o00.f
    public static final <T> void p0(List<T> list, Comparator<? super T> comparator) {
        kotlin.jvm.internal.g0.p(list, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        throw new NotImplementedError(null, 1, null);
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "Use sortWith(Comparator(comparison)) instead.", replaceWith = @yz.w0(expression = "this.sortWith(Comparator(comparison))", imports = {}))
    @o00.f
    public static final <T> void q0(List<T> list, x00.p<? super T, ? super T, Integer> comparison) {
        kotlin.jvm.internal.g0.p(list, "<this>");
        kotlin.jvm.internal.g0.p(comparison, "comparison");
        throw new NotImplementedError(null, 1, null);
    }

    public static <T> void r0(@m80.k List<T> list, @m80.k Comparator<? super T> comparator) {
        kotlin.jvm.internal.g0.p(list, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}

package e00;

import java.util.Comparator;
import kotlin.jvm.internal.g0;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class i extends h {
    @y0(version = "1.4")
    public static final <T> T A0(T t11, @m80.k T[] other, @m80.k Comparator<? super T> comparator) {
        g0.p(other, "other");
        g0.p(comparator, "comparator");
        for (T t12 : other) {
            if (comparator.compare(t11, t12) < 0) {
                t11 = t12;
            }
        }
        return t11;
    }

    @y0(version = "1.1")
    public static final <T> T B0(T t11, T t12, T t13, @m80.k Comparator<? super T> comparator) {
        g0.p(comparator, "comparator");
        return (T) C0(t11, C0(t12, t13, comparator), comparator);
    }

    @y0(version = "1.1")
    public static final <T> T C0(T t11, T t12, @m80.k Comparator<? super T> comparator) {
        g0.p(comparator, "comparator");
        return comparator.compare(t11, t12) <= 0 ? t11 : t12;
    }

    @y0(version = "1.4")
    public static final <T> T D0(T t11, @m80.k T[] other, @m80.k Comparator<? super T> comparator) {
        g0.p(other, "other");
        g0.p(comparator, "comparator");
        for (T t12 : other) {
            if (comparator.compare(t11, t12) > 0) {
                t11 = t12;
            }
        }
        return t11;
    }

    @y0(version = "1.1")
    public static final <T> T y0(T t11, T t12, T t13, @m80.k Comparator<? super T> comparator) {
        g0.p(comparator, "comparator");
        return (T) z0(t11, z0(t12, t13, comparator), comparator);
    }

    @y0(version = "1.1")
    public static final <T> T z0(T t11, T t12, @m80.k Comparator<? super T> comparator) {
        g0.p(comparator, "comparator");
        return comparator.compare(t11, t12) >= 0 ? t11 : t12;
    }
}

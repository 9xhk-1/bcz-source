package a00;

import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class n0 extends m0 {
    @m80.k
    public static <T> List<T> c1(@m80.k List<? extends T> list) {
        kotlin.jvm.internal.g0.p(list, "<this>");
        return new s1(list);
    }

    @w00.j(name = "asReversedMutable")
    @m80.k
    public static <T> List<T> d1(@m80.k List<T> list) {
        kotlin.jvm.internal.g0.p(list, "<this>");
        return new r1(list);
    }

    public static final int e1(List<?> list, int i11) {
        if (i11 >= 0 && i11 <= h0.L(list)) {
            return h0.L(list) - i11;
        }
        throw new IndexOutOfBoundsException("Element index " + i11 + " must be in range [" + new g10.l(0, h0.L(list)) + "].");
    }

    public static final int f1(List<?> list, int i11) {
        return h0.L(list) - i11;
    }

    public static final int g1(List<?> list, int i11) {
        if (i11 >= 0 && i11 <= list.size()) {
            return list.size() - i11;
        }
        throw new IndexOutOfBoundsException("Position index " + i11 + " must be in range [" + new g10.l(0, list.size()) + "].");
    }
}

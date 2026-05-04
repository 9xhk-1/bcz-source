package b00;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nListBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListBuilder.kt\nkotlin/collections/builders/ListBuilderKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,722:1\n1#2:723\n*E\n"})
/* loaded from: classes8.dex */
public final class b {
    @k
    public static final <E> E[] d(int i11) {
        if (i11 >= 0) {
            return (E[]) new Object[i11];
        }
        throw new IllegalArgumentException("capacity must be non-negative.");
    }

    @k
    public static final <T> T[] e(@k T[] tArr, int i11) {
        g0.p(tArr, "<this>");
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, i11);
        g0.o(tArr2, "copyOf(...)");
        return tArr2;
    }

    public static final <E> void f(@k E[] eArr, int i11) {
        g0.p(eArr, "<this>");
        eArr[i11] = null;
    }

    public static final <E> void g(@k E[] eArr, int i11, int i12) {
        g0.p(eArr, "<this>");
        while (i11 < i12) {
            f(eArr, i11);
            i11++;
        }
    }

    public static final <T> boolean h(T[] tArr, int i11, int i12, List<?> list) {
        if (i12 != list.size()) {
            return false;
        }
        for (int i13 = 0; i13 < i12; i13++) {
            if (!g0.g(tArr[i11 + i13], list.get(i13))) {
                return false;
            }
        }
        return true;
    }

    public static final <T> int i(T[] tArr, int i11, int i12) {
        int i13 = 1;
        for (int i14 = 0; i14 < i12; i14++) {
            T t11 = tArr[i11 + i14];
            i13 = (i13 * 31) + (t11 != null ? t11.hashCode() : 0);
        }
        return i13;
    }

    public static final <T> String j(T[] tArr, int i11, int i12, Collection<? extends T> collection) {
        StringBuilder sb2 = new StringBuilder((i12 * 3) + 2);
        sb2.append("[");
        for (int i13 = 0; i13 < i12; i13++) {
            if (i13 > 0) {
                sb2.append(j2.O);
            }
            T t11 = tArr[i11 + i13];
            if (t11 == collection) {
                sb2.append("(this Collection)");
            } else {
                sb2.append(t11);
            }
        }
        sb2.append("]");
        String sb3 = sb2.toString();
        g0.o(sb3, "toString(...)");
        return sb3;
    }
}

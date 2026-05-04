package a00;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Pair;
import org.junit.jupiter.api.j2;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nArrays.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrays.kt\nkotlin/collections/ArraysKt__ArraysKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,165:1\n1#2:166\n*E\n"})
/* loaded from: classes8.dex */
public class p extends o {
    /* JADX WARN: Multi-variable type inference failed */
    @w00.j(name = "contentDeepEquals")
    @yz.y0(version = "1.3")
    @yz.v0
    public static <T> boolean g(@m80.l T[] tArr, @m80.l T[] tArr2) {
        if (tArr == tArr2) {
            return true;
        }
        if (tArr == 0 || tArr2 == 0 || tArr.length != tArr2.length) {
            return false;
        }
        int length = tArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            Object[] objArr = tArr[i11];
            Object[] objArr2 = tArr2[i11];
            if (objArr != objArr2) {
                if (objArr == 0 || objArr2 == 0) {
                    return false;
                }
                if ((objArr instanceof Object[]) && (objArr2 instanceof Object[])) {
                    if (!g(objArr, objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof byte[]) && (objArr2 instanceof byte[])) {
                    if (!Arrays.equals((byte[]) objArr, (byte[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof short[]) && (objArr2 instanceof short[])) {
                    if (!Arrays.equals((short[]) objArr, (short[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof int[]) && (objArr2 instanceof int[])) {
                    if (!Arrays.equals((int[]) objArr, (int[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof long[]) && (objArr2 instanceof long[])) {
                    if (!Arrays.equals((long[]) objArr, (long[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof float[]) && (objArr2 instanceof float[])) {
                    if (!Arrays.equals((float[]) objArr, (float[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof double[]) && (objArr2 instanceof double[])) {
                    if (!Arrays.equals((double[]) objArr, (double[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof char[]) && (objArr2 instanceof char[])) {
                    if (!Arrays.equals((char[]) objArr, (char[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof boolean[]) && (objArr2 instanceof boolean[])) {
                    if (!Arrays.equals((boolean[]) objArr, (boolean[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof yz.p1) && (objArr2 instanceof yz.p1)) {
                    if (!d00.g.Y0(((yz.p1) objArr).w(), ((yz.p1) objArr2).w())) {
                        return false;
                    }
                } else if ((objArr instanceof yz.d2) && (objArr2 instanceof yz.d2)) {
                    if (!d00.g.W0(((yz.d2) objArr).w(), ((yz.d2) objArr2).w())) {
                        return false;
                    }
                } else if ((objArr instanceof yz.t1) && (objArr2 instanceof yz.t1)) {
                    if (!d00.g.X0(((yz.t1) objArr).w(), ((yz.t1) objArr2).w())) {
                        return false;
                    }
                } else if ((objArr instanceof yz.x1) && (objArr2 instanceof yz.x1)) {
                    if (!d00.g.Z0(((yz.x1) objArr).w(), ((yz.x1) objArr2).w())) {
                        return false;
                    }
                } else if (!kotlin.jvm.internal.g0.g(objArr, objArr2)) {
                    return false;
                }
            }
        }
        return true;
    }

    @w00.j(name = "contentDeepToString")
    @yz.y0(version = "1.3")
    @m80.k
    @yz.v0
    public static final <T> String h(@m80.l T[] tArr) {
        if (tArr == null) {
            return "null";
        }
        StringBuilder sb2 = new StringBuilder((g10.u.B(tArr.length, 429496729) * 5) + 2);
        i(tArr, sb2, new ArrayList());
        return sb2.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> void i(T[] tArr, StringBuilder sb2, List<Object[]> list) {
        if (list.contains(tArr)) {
            sb2.append("[...]");
            return;
        }
        list.add(tArr);
        sb2.append('[');
        int length = tArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (i11 != 0) {
                sb2.append(j2.O);
            }
            Object[] objArr = tArr[i11];
            if (objArr == 0) {
                sb2.append("null");
            } else if (objArr instanceof Object[]) {
                i(objArr, sb2, list);
                g2 g2Var = g2.f100423a;
            } else if (objArr instanceof byte[]) {
                String arrays = Arrays.toString((byte[]) objArr);
                kotlin.jvm.internal.g0.o(arrays, "toString(...)");
                sb2.append(arrays);
            } else if (objArr instanceof short[]) {
                String arrays2 = Arrays.toString((short[]) objArr);
                kotlin.jvm.internal.g0.o(arrays2, "toString(...)");
                sb2.append(arrays2);
            } else if (objArr instanceof int[]) {
                String arrays3 = Arrays.toString((int[]) objArr);
                kotlin.jvm.internal.g0.o(arrays3, "toString(...)");
                sb2.append(arrays3);
            } else if (objArr instanceof long[]) {
                String arrays4 = Arrays.toString((long[]) objArr);
                kotlin.jvm.internal.g0.o(arrays4, "toString(...)");
                sb2.append(arrays4);
            } else if (objArr instanceof float[]) {
                String arrays5 = Arrays.toString((float[]) objArr);
                kotlin.jvm.internal.g0.o(arrays5, "toString(...)");
                sb2.append(arrays5);
            } else if (objArr instanceof double[]) {
                String arrays6 = Arrays.toString((double[]) objArr);
                kotlin.jvm.internal.g0.o(arrays6, "toString(...)");
                sb2.append(arrays6);
            } else if (objArr instanceof char[]) {
                String arrays7 = Arrays.toString((char[]) objArr);
                kotlin.jvm.internal.g0.o(arrays7, "toString(...)");
                sb2.append(arrays7);
            } else if (objArr instanceof boolean[]) {
                String arrays8 = Arrays.toString((boolean[]) objArr);
                kotlin.jvm.internal.g0.o(arrays8, "toString(...)");
                sb2.append(arrays8);
            } else if (objArr instanceof yz.p1) {
                sb2.append(d00.g.e1(((yz.p1) objArr).w()));
            } else if (objArr instanceof yz.d2) {
                sb2.append(d00.g.g1(((yz.d2) objArr).w()));
            } else if (objArr instanceof yz.t1) {
                sb2.append(d00.g.f1(((yz.t1) objArr).w()));
            } else if (objArr instanceof yz.x1) {
                sb2.append(d00.g.h1(((yz.x1) objArr).w()));
            } else {
                sb2.append(objArr.toString());
            }
        }
        sb2.append(l50.b.f69930l);
        list.remove(h0.L(list));
    }

    @m80.k
    public static final <T> List<T> j(@m80.k T[][] tArr) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        int i11 = 0;
        for (T[] tArr2 : tArr) {
            i11 += tArr2.length;
        }
        ArrayList arrayList = new ArrayList(i11);
        for (T[] tArr3 : tArr) {
            m0.u0(arrayList, tArr3);
        }
        return arrayList;
    }

    /* JADX WARN: Incorrect types in method signature: <C:[Ljava/lang/Object;:TR;R:Ljava/lang/Object;>(TC;Lx00/a<+TR;>;)TR; */
    @yz.y0(version = "1.3")
    @o00.f
    public static final Object k(Object[] objArr, x00.a defaultValue) {
        kotlin.jvm.internal.g0.p(defaultValue, "defaultValue");
        return objArr.length == 0 ? defaultValue.invoke() : objArr;
    }

    @yz.y0(version = "1.3")
    @o00.f
    public static final boolean l(Object[] objArr) {
        return objArr == null || objArr.length == 0;
    }

    @m80.k
    public static final <T, R> Pair<List<T>, List<R>> m(@m80.k Pair<? extends T, ? extends R>[] pairArr) {
        kotlin.jvm.internal.g0.p(pairArr, "<this>");
        ArrayList arrayList = new ArrayList(pairArr.length);
        ArrayList arrayList2 = new ArrayList(pairArr.length);
        for (Pair<? extends T, ? extends R> pair : pairArr) {
            arrayList.add(pair.getFirst());
            arrayList2.add(pair.getSecond());
        }
        return yz.h1.a(arrayList, arrayList2);
    }
}

package androidx.compose.ui.util;

import a00.a0;
import a00.h0;
import a00.m0;
import a00.r0;
import androidx.collection.MutableScatterSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.u0;
import m80.k;
import org.junit.jupiter.api.j2;
import x00.l;
import x00.p;
import yz.g2;
import yz.v0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nListUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,622:1\n34#1,6:623\n34#1,6:629\n34#1,6:635\n34#1,6:641\n34#1,6:647\n34#1,6:653\n34#1,6:659\n34#1,6:665\n34#1,6:671\n70#1,6:677\n70#1,4:683\n75#1:688\n34#1,6:689\n34#1,6:695\n34#1,6:701\n34#1,6:707\n34#1,6:713\n1#2:687\n*S KotlinDebug\n*F\n+ 1 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n88#1:623,6\n103#1:629,6\n118#1:635,6\n135#1:641,6\n152#1:647,6\n198#1:653,6\n232#1:659,6\n252#1:665,6\n271#1:671,6\n288#1:677,6\n305#1:683,4\n305#1:688\n441#1:689,6\n485#1:695,6\n531#1:701,6\n547#1:707,6\n564#1:713,6\n*E\n"})
/* loaded from: classes2.dex */
public final class ListUtilsKt {
    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> void appendElement(Appendable appendable, T t11, l<? super T, ? extends CharSequence> lVar) {
        if (lVar != null) {
            appendable.append(lVar.invoke(t11));
            return;
        }
        if (t11 == 0 ? true : t11 instanceof CharSequence) {
            appendable.append((CharSequence) t11);
        } else if (t11 instanceof Character) {
            appendable.append(((Character) t11).charValue());
        } else {
            appendable.append(String.valueOf(t11));
        }
    }

    public static final <T> boolean fastAll(@k List<? extends T> list, @k l<? super T, Boolean> lVar) {
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (!lVar.invoke(list.get(i11)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final <T> boolean fastAny(@k List<? extends T> list, @k l<? super T, Boolean> lVar) {
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (lVar.invoke(list.get(i11)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @k
    public static final <T, K> List<T> fastDistinctBy(@k List<? extends T> list, @k l<? super T, ? extends K> lVar) {
        MutableScatterSet mutableScatterSet = new MutableScatterSet(list.size());
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            T t11 = list.get(i11);
            if (mutableScatterSet.add(lVar.invoke(t11))) {
                arrayList.add(t11);
            }
        }
        return arrayList;
    }

    @k
    public static final <T> List<T> fastFilter(@k List<? extends T> list, @k l<? super T, Boolean> lVar) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            T t11 = list.get(i11);
            if (lVar.invoke(t11).booleanValue()) {
                arrayList.add(t11);
            }
        }
        return arrayList;
    }

    @k
    public static final <T> List<T> fastFilterNotNull(@k List<? extends T> list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            T t11 = list.get(i11);
            if (t11 != null) {
                arrayList.add(t11);
            }
        }
        return arrayList;
    }

    @k
    public static final <T, R> List<R> fastFilteredMap(@k List<? extends T> list, @k l<? super T, Boolean> lVar, @k l<? super T, ? extends R> lVar2) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            T t11 = list.get(i11);
            if (lVar.invoke(t11).booleanValue()) {
                arrayList.add(lVar2.invoke(t11));
            }
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [T, java.lang.Object] */
    public static final <T> T fastFirst(@k List<? extends T> list, @k l<? super T, Boolean> lVar) {
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            T t11 = list.get(i11);
            if (lVar.invoke(t11).booleanValue()) {
                return t11;
            }
        }
        throwNoSuchElementException("Collection contains no element matching the predicate.");
        throw new KotlinNothingValueException();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [T, java.lang.Object] */
    @m80.l
    public static final <T> T fastFirstOrNull(@k List<? extends T> list, @k l<? super T, Boolean> lVar) {
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            T t11 = list.get(i11);
            if (lVar.invoke(t11).booleanValue()) {
                return t11;
            }
        }
        return null;
    }

    @k
    public static final <T, R> List<R> fastFlatMap(@k List<? extends T> list, @k l<? super T, ? extends Iterable<? extends R>> lVar) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            m0.s0(arrayList, lVar.invoke(list.get(i11)));
        }
        return arrayList;
    }

    public static final <T, R> R fastFold(@k List<? extends T> list, R r11, @k p<? super R, ? super T, ? extends R> pVar) {
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            r11 = pVar.invoke(r11, list.get(i11));
        }
        return r11;
    }

    public static final <T> void fastForEach(@k List<? extends T> list, @k l<? super T, g2> lVar) {
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            lVar.invoke(list.get(i11));
        }
    }

    public static final <T> void fastForEachIndexed(@k List<? extends T> list, @k p<? super Integer, ? super T, g2> pVar) {
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            pVar.invoke(Integer.valueOf(i11), list.get(i11));
        }
    }

    public static final <T> void fastForEachReversed(@k List<? extends T> list, @k l<? super T, g2> lVar) {
        int size = list.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i11 = size - 1;
            lVar.invoke(list.get(size));
            if (i11 < 0) {
                return;
            } else {
                size = i11;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T, A extends Appendable> A fastJoinTo(List<? extends T> list, A a11, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i11, CharSequence charSequence4, l<? super T, ? extends CharSequence> lVar) {
        a11.append(charSequence2);
        int size = list.size();
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            T t11 = list.get(i13);
            i12++;
            if (i12 > 1) {
                a11.append(charSequence);
            }
            if (i11 >= 0 && i12 > i11) {
                break;
            }
            appendElement(a11, t11, lVar);
        }
        if (i11 >= 0 && i12 > i11) {
            a11.append(charSequence4);
        }
        a11.append(charSequence3);
        return a11;
    }

    @k
    public static final <T> String fastJoinToString(@k List<? extends T> list, @k CharSequence charSequence, @k CharSequence charSequence2, @k CharSequence charSequence3, int i11, @k CharSequence charSequence4, @m80.l l<? super T, ? extends CharSequence> lVar) {
        return ((StringBuilder) fastJoinTo(list, new StringBuilder(), charSequence, charSequence2, charSequence3, i11, charSequence4, lVar)).toString();
    }

    public static /* synthetic */ String fastJoinToString$default(List list, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i11, CharSequence charSequence4, l lVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            charSequence = j2.O;
        }
        if ((i12 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i12 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i12 & 8) != 0) {
            i11 = -1;
        }
        if ((i12 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i12 & 32) != 0) {
            lVar = null;
        }
        CharSequence charSequence5 = charSequence4;
        l lVar2 = lVar;
        return fastJoinToString(list, charSequence, charSequence2, charSequence3, i11, charSequence5, lVar2);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [T, java.lang.Object] */
    @m80.l
    public static final <T> T fastLastOrNull(@k List<? extends T> list, @k l<? super T, Boolean> lVar) {
        int size = list.size() - 1;
        if (size < 0) {
            return null;
        }
        while (true) {
            int i11 = size - 1;
            T t11 = list.get(size);
            if (lVar.invoke(t11).booleanValue()) {
                return t11;
            }
            if (i11 < 0) {
                return null;
            }
            size = i11;
        }
    }

    @k
    public static final <T, R> List<R> fastMap(@k List<? extends T> list, @k l<? super T, ? extends R> lVar) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(lVar.invoke(list.get(i11)));
        }
        return arrayList;
    }

    @k
    public static final <T, R> List<R> fastMapIndexed(@k List<? extends T> list, @k p<? super Integer, ? super T, ? extends R> pVar) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(pVar.invoke(Integer.valueOf(i11), list.get(i11)));
        }
        return arrayList;
    }

    @k
    public static final <T, R> List<R> fastMapIndexedNotNull(@k List<? extends T> list, @k p<? super Integer, ? super T, ? extends R> pVar) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            R invoke = pVar.invoke(Integer.valueOf(i11), list.get(i11));
            if (invoke != null) {
                arrayList.add(invoke);
            }
        }
        return arrayList;
    }

    @k
    public static final <T, R> List<R> fastMapNotNull(@k List<? extends T> list, @k l<? super T, ? extends R> lVar) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            R invoke = lVar.invoke(list.get(i11));
            if (invoke != null) {
                arrayList.add(invoke);
            }
        }
        return arrayList;
    }

    @k
    public static final <T, R, C extends Collection<? super R>> C fastMapTo(@k List<? extends T> list, @k C c11, @k l<? super T, ? extends R> lVar) {
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            c11.add(lVar.invoke(list.get(i11)));
        }
        return c11;
    }

    @m80.l
    public static final <T, R extends Comparable<? super R>> T fastMaxBy(@k List<? extends T> list, @k l<? super T, ? extends R> lVar) {
        if (list.isEmpty()) {
            return null;
        }
        T t11 = list.get(0);
        R invoke = lVar.invoke(t11);
        int L = h0.L(list);
        int i11 = 1;
        if (1 <= L) {
            while (true) {
                T t12 = list.get(i11);
                R invoke2 = lVar.invoke(t12);
                if (invoke.compareTo(invoke2) < 0) {
                    t11 = t12;
                    invoke = invoke2;
                }
                if (i11 == L) {
                    break;
                }
                i11++;
            }
        }
        return (T) t11;
    }

    @k
    public static final <T, R extends Comparable<? super R>> R fastMaxOfOrDefault(@k List<? extends T> list, @k R r11, @k l<? super T, ? extends R> lVar) {
        if (list.isEmpty()) {
            return r11;
        }
        R invoke = lVar.invoke(list.get(0));
        int L = h0.L(list);
        int i11 = 1;
        if (1 <= L) {
            while (true) {
                R invoke2 = lVar.invoke(list.get(i11));
                if (invoke2.compareTo(invoke) > 0) {
                    invoke = invoke2;
                }
                if (i11 == L) {
                    break;
                }
                i11++;
            }
        }
        return invoke;
    }

    @m80.l
    public static final <T, R extends Comparable<? super R>> R fastMaxOfOrNull(@k List<? extends T> list, @k l<? super T, ? extends R> lVar) {
        if (list.isEmpty()) {
            return null;
        }
        R invoke = lVar.invoke(list.get(0));
        int L = h0.L(list);
        int i11 = 1;
        if (1 <= L) {
            while (true) {
                R invoke2 = lVar.invoke(list.get(i11));
                if (invoke2.compareTo(invoke) > 0) {
                    invoke = invoke2;
                }
                if (i11 == L) {
                    break;
                }
                i11++;
            }
        }
        return invoke;
    }

    @m80.l
    public static final <T, R extends Comparable<? super R>> T fastMinByOrNull(@k List<? extends T> list, @k l<? super T, ? extends R> lVar) {
        if (list.isEmpty()) {
            return null;
        }
        T t11 = list.get(0);
        R invoke = lVar.invoke(t11);
        int L = h0.L(list);
        int i11 = 1;
        if (1 <= L) {
            while (true) {
                T t12 = list.get(i11);
                R invoke2 = lVar.invoke(t12);
                if (invoke.compareTo(invoke2) > 0) {
                    t11 = t12;
                    invoke = invoke2;
                }
                if (i11 == L) {
                    break;
                }
                i11++;
            }
        }
        return (T) t11;
    }

    public static final <S, T extends S> S fastReduce(@k List<? extends T> list, @k p<? super S, ? super T, ? extends S> pVar) {
        if (list.isEmpty()) {
            throwUnsupportedOperationException("Empty collection can't be reduced.");
        }
        S s11 = (Object) r0.G2(list);
        int L = h0.L(list);
        int i11 = 1;
        if (1 <= L) {
            while (true) {
                s11 = pVar.invoke(s11, list.get(i11));
                if (i11 == L) {
                    break;
                }
                i11++;
            }
        }
        return s11;
    }

    public static final <T> int fastSumBy(@k List<? extends T> list, @k l<? super T, Integer> lVar) {
        int size = list.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += lVar.invoke(list.get(i12)).intValue();
        }
        return i11;
    }

    @k
    public static final <T, R, V> List<V> fastZip(@k List<? extends T> list, @k List<? extends R> list2, @k p<? super T, ? super R, ? extends V> pVar) {
        int min = Math.min(list.size(), list2.size());
        ArrayList arrayList = new ArrayList(min);
        for (int i11 = 0; i11 < min; i11++) {
            arrayList.add(pVar.invoke(list.get(i11), list2.get(i11)));
        }
        return arrayList;
    }

    @k
    public static final <T, R> List<R> fastZipWithNext(@k List<? extends T> list, @k p<? super T, ? super T, ? extends R> pVar) {
        if (list.size() <= 1) {
            return h0.J();
        }
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        a0.e eVar = list.get(0);
        int L = h0.L(list);
        while (i11 < L) {
            i11++;
            T t11 = list.get(i11);
            arrayList.add(pVar.invoke(eVar, t11));
            eVar = t11;
        }
        return arrayList;
    }

    @v0
    @k
    public static final Void throwNoSuchElementException(@k String str) {
        throw new NoSuchElementException(str);
    }

    @v0
    public static final void throwUnsupportedOperationException(@k String str) {
        throw new UnsupportedOperationException(str);
    }
}

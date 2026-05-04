package androidx.compose.runtime.snapshots;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.u0;
import m80.k;
import org.junit.jupiter.api.j2;
import x00.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nListUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,227:1\n33#1,6:229\n33#1,6:235\n33#1,6:241\n33#1,6:247\n33#1,4:253\n38#1:264\n33#1,6:265\n63#1,6:271\n1#2:228\n372#3,7:257\n*S KotlinDebug\n*F\n+ 1 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n50#1:229,6\n83#1:235,6\n91#1:241,6\n106#1:247,6\n115#1:253,4\n115#1:264\n205#1:265,6\n224#1:271,6\n117#1:257,7\n*E\n"})
/* loaded from: classes.dex */
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
    public static final <T> List<T> fastFilterIndexed(@k List<? extends T> list, @k p<? super Integer, ? super T, Boolean> pVar) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            T t11 = list.get(i11);
            if (pVar.invoke(Integer.valueOf(i11), t11).booleanValue()) {
                arrayList.add(t11);
            }
        }
        return arrayList;
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

    @k
    public static final <T, K> Map<K, List<T>> fastGroupBy(@k List<? extends T> list, @k l<? super T, ? extends K> lVar) {
        HashMap hashMap = new HashMap(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            T t11 = list.get(i11);
            K invoke = lVar.invoke(t11);
            Object obj = hashMap.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                hashMap.put(invoke, obj);
            }
            ((ArrayList) obj).add(t11);
        }
        return hashMap;
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
    public static final <T> Set<T> fastToSet(@k List<? extends T> list) {
        HashSet hashSet = new HashSet(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            hashSet.add(list.get(i11));
        }
        return hashSet;
    }
}

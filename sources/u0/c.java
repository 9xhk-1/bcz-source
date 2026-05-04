package u0;

import a00.h0;
import a00.l1;
import a00.r0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.u0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w00.j(name = "-Collections")
@u0({"SMAP\nCollections.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Collections.kt\ncoil/util/-Collections\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,93:1\n1#2:94\n*E\n"})
/* loaded from: classes3.dex */
public final class c {
    @m80.l
    public static final <R, T> T a(@m80.k List<? extends R> list, @m80.k x00.l<? super R, ? extends T> lVar) {
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            T invoke = lVar.invoke(list.get(i11));
            if (invoke != null) {
                return invoke;
            }
        }
        return null;
    }

    public static final <T, R> R b(@m80.k List<? extends T> list, R r11, @m80.k x00.p<? super R, ? super T, ? extends R> pVar) {
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            r11 = pVar.invoke(r11, list.get(i11));
        }
        return r11;
    }

    public static final <T> void c(@m80.k List<? extends T> list, @m80.k x00.p<? super Integer, ? super T, g2> pVar) {
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            pVar.invoke(Integer.valueOf(i11), list.get(i11));
        }
    }

    public static final <T> void d(@m80.k List<? extends T> list, @m80.k x00.l<? super T, g2> lVar) {
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            lVar.invoke(list.get(i11));
        }
    }

    @m80.k
    public static final <K, V, R> Map<K, R> e(@m80.k Map<K, ? extends V> map, @m80.k x00.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> lVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<K, ? extends V> entry : map.entrySet()) {
            R invoke = lVar.invoke(entry);
            if (invoke != null) {
                linkedHashMap.put(entry.getKey(), invoke);
            }
        }
        return linkedHashMap;
    }

    public static final <T> void f(@m80.k List<T> list, @m80.k x00.l<? super T, Boolean> lVar) {
        int size = list.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            int i13 = i12 - i11;
            if (lVar.invoke(list.get(i13)).booleanValue()) {
                list.remove(i13);
                i11++;
            }
        }
    }

    @m80.k
    public static final <T> List<T> g(@m80.k List<? extends T> list) {
        int size = list.size();
        return size != 0 ? size != 1 ? Collections.unmodifiableList(new ArrayList(list)) : Collections.singletonList(r0.G2(list)) : h0.J();
    }

    @m80.k
    public static final <K, V> Map<K, V> h(@m80.k Map<K, ? extends V> map) {
        int size = map.size();
        if (size == 0) {
            return l1.z();
        }
        if (size != 1) {
            return Collections.unmodifiableMap(new LinkedHashMap(map));
        }
        Map.Entry entry = (Map.Entry) r0.E2(map.entrySet());
        return Collections.singletonMap(entry.getKey(), entry.getValue());
    }
}

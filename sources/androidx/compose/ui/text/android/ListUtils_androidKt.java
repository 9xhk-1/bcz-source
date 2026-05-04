package androidx.compose.ui.text.android;

import a00.a0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.u0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nListUtils.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListUtils.android.kt\nandroidx/compose/ui/text/android/ListUtils_androidKt\n*L\n1#1,84:1\n33#1,6:85\n*S KotlinDebug\n*F\n+ 1 ListUtils.android.kt\nandroidx/compose/ui/text/android/ListUtils_androidKt\n*L\n55#1:85,6\n*E\n"})
/* loaded from: classes2.dex */
public final class ListUtils_androidKt {
    public static final <T> void fastForEach(@m80.k List<? extends T> list, @m80.k x00.l<? super T, g2> lVar) {
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            lVar.invoke(list.get(i11));
        }
    }

    @m80.k
    public static final <T, R, C extends Collection<? super R>> C fastMapTo(@m80.k List<? extends T> list, @m80.k C c11, @m80.k x00.l<? super T, ? extends R> lVar) {
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            c11.add(lVar.invoke(list.get(i11)));
        }
        return c11;
    }

    @m80.k
    public static final <T, R> List<R> fastZipWithNext(@m80.k List<? extends T> list, @m80.k x00.p<? super T, ? super T, ? extends R> pVar) {
        if (list.size() <= 1) {
            return a00.h0.J();
        }
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        a0.e eVar = list.get(0);
        int L = a00.h0.L(list);
        while (i11 < L) {
            i11++;
            T t11 = list.get(i11);
            arrayList.add(pVar.invoke(eVar, t11));
            eVar = t11;
        }
        return arrayList;
    }
}

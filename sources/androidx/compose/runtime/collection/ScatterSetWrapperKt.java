package androidx.compose.runtime.collection;

import androidx.collection.ScatterSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nScatterSetWrapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterSetWrapper.kt\nandroidx/compose/runtime/collection/ScatterSetWrapperKt\n+ 2 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,56:1\n231#2,3:57\n200#2,7:60\n211#2,3:68\n214#2,9:72\n234#2:81\n256#2,2:84\n231#2,3:86\n200#2,7:89\n211#2,3:97\n214#2,9:101\n234#2:110\n258#2:111\n1399#3:67\n1270#3:71\n1399#3:96\n1270#3:100\n1855#4,2:82\n1747#4,3:112\n*S KotlinDebug\n*F\n+ 1 ScatterSetWrapper.kt\nandroidx/compose/runtime/collection/ScatterSetWrapperKt\n*L\n43#1:57,3\n43#1:60,7\n43#1:68,3\n43#1:72,9\n43#1:81\n52#1:84,2\n52#1:86,3\n52#1:89,7\n52#1:97,3\n52#1:101,9\n52#1:110\n52#1:111\n43#1:67\n43#1:71\n52#1:96\n52#1:100\n46#1:82,2\n54#1:112,3\n*E\n"})
/* loaded from: classes.dex */
public final class ScatterSetWrapperKt {
    public static final boolean fastAny(@k Set<? extends Object> set, @k l<Object, Boolean> lVar) {
        if (!(set instanceof ScatterSetWrapper)) {
            Set<? extends Object> set2 = set;
            if ((set2 instanceof Collection) && set2.isEmpty()) {
                return false;
            }
            Iterator<T> it = set2.iterator();
            while (it.hasNext()) {
                if (lVar.invoke(it.next()).booleanValue()) {
                    return true;
                }
            }
            return false;
        }
        ScatterSet set$runtime_release = ((ScatterSetWrapper) set).getSet$runtime_release();
        Object[] objArr = set$runtime_release.elements;
        long[] jArr = set$runtime_release.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j11 = jArr[i11];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j11) < 128 && lVar.invoke(objArr[(i11 << 3) + i13]).booleanValue()) {
                            return true;
                        }
                        j11 >>= 8;
                    }
                    if (i12 != 8) {
                        break;
                    }
                }
                if (i11 == length) {
                    break;
                }
                i11++;
            }
        }
        return false;
    }

    public static final <T> void fastForEach(@k Set<? extends T> set, @k l<? super T, g2> lVar) {
        if (!(set instanceof ScatterSetWrapper)) {
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                lVar.invoke(it.next());
            }
            return;
        }
        ScatterSet<T> set$runtime_release = ((ScatterSetWrapper) set).getSet$runtime_release();
        Object[] objArr = set$runtime_release.elements;
        long[] jArr = set$runtime_release.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i11 = 0;
        while (true) {
            long j11 = jArr[i11];
            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i11 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((255 & j11) < 128) {
                        lVar.invoke(objArr[(i11 << 3) + i13]);
                    }
                    j11 >>= 8;
                }
                if (i12 != 8) {
                    return;
                }
            }
            if (i11 == length) {
                return;
            } else {
                i11++;
            }
        }
    }

    @k
    public static final <T> Set<T> wrapIntoSet(@k ScatterSet<T> scatterSet) {
        return new ScatterSetWrapper(scatterSet);
    }
}

package androidx.room;

import a00.v1;
import a00.w1;
import androidx.room.InvalidationTracker;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import u30.f0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nInvalidationTracker.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InvalidationTracker.android.kt\nandroidx/room/ObserverWrapper\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,592:1\n13497#2,3:593\n1755#3,3:596\n1863#3,2:599\n*S KotlinDebug\n*F\n+ 1 InvalidationTracker.android.kt\nandroidx/room/ObserverWrapper\n*L\n532#1:593,3\n550#1:596,3\n558#1:599,2\n*E\n"})
/* loaded from: classes3.dex */
public final class ObserverWrapper {

    @m80.k
    private final InvalidationTracker.Observer observer;

    @m80.k
    private final Set<String> singleTableSet;

    @m80.k
    private final int[] tableIds;

    @m80.k
    private final String[] tableNames;

    public ObserverWrapper(@m80.k InvalidationTracker.Observer observer, @m80.k int[] tableIds, @m80.k String[] tableNames) {
        g0.p(observer, "observer");
        g0.p(tableIds, "tableIds");
        g0.p(tableNames, "tableNames");
        this.observer = observer;
        this.tableIds = tableIds;
        this.tableNames = tableNames;
        if (tableIds.length != tableNames.length) {
            throw new IllegalStateException("Check failed.");
        }
        this.singleTableSet = !(tableNames.length == 0) ? v1.f(tableNames[0]) : w1.k();
    }

    @m80.k
    public final InvalidationTracker.Observer getObserver$room_runtime_release() {
        return this.observer;
    }

    @m80.k
    public final int[] getTableIds$room_runtime_release() {
        return this.tableIds;
    }

    public final void notifyByTableIds$room_runtime_release(@m80.k Set<Integer> invalidatedTablesIds) {
        Set<String> k11;
        g0.p(invalidatedTablesIds, "invalidatedTablesIds");
        int[] iArr = this.tableIds;
        int length = iArr.length;
        if (length != 0) {
            int i11 = 0;
            if (length != 1) {
                Set d11 = v1.d();
                int[] iArr2 = this.tableIds;
                int length2 = iArr2.length;
                int i12 = 0;
                while (i11 < length2) {
                    int i13 = i12 + 1;
                    if (invalidatedTablesIds.contains(Integer.valueOf(iArr2[i11]))) {
                        d11.add(this.tableNames[i12]);
                    }
                    i11++;
                    i12 = i13;
                }
                k11 = v1.a(d11);
            } else {
                k11 = invalidatedTablesIds.contains(Integer.valueOf(iArr[0])) ? this.singleTableSet : w1.k();
            }
        } else {
            k11 = w1.k();
        }
        if (k11.isEmpty()) {
            return;
        }
        this.observer.onInvalidated(k11);
    }

    public final void notifyByTableNames$room_runtime_release(@m80.k Set<String> invalidatedTablesNames) {
        Set<String> k11;
        g0.p(invalidatedTablesNames, "invalidatedTablesNames");
        int length = this.tableNames.length;
        if (length == 0) {
            k11 = w1.k();
        } else if (length != 1) {
            Set d11 = v1.d();
            for (String str : invalidatedTablesNames) {
                String[] strArr = this.tableNames;
                int length2 = strArr.length;
                int i11 = 0;
                while (true) {
                    if (i11 < length2) {
                        String str2 = strArr[i11];
                        if (f0.c2(str2, str, true)) {
                            d11.add(str2);
                            break;
                        }
                        i11++;
                    }
                }
            }
            k11 = v1.a(d11);
        } else {
            Set<String> set = invalidatedTablesNames;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                Iterator<T> it = set.iterator();
                while (it.hasNext()) {
                    if (f0.c2((String) it.next(), this.tableNames[0], true)) {
                        k11 = this.singleTableSet;
                        break;
                    }
                }
            }
            k11 = w1.k();
        }
        if (k11.isEmpty()) {
            return;
        }
        this.observer.onInvalidated(k11);
    }
}

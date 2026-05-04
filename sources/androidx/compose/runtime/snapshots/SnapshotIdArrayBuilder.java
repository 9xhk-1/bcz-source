package androidx.compose.runtime.snapshots;

import androidx.collection.MutableLongList;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Arrays;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nSnapshotId.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotId.jvm.kt\nandroidx/compose/runtime/snapshots/SnapshotIdArrayBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 LongList.kt\nandroidx/collection/LongListKt\n+ 4 LongList.kt\nandroidx/collection/MutableLongList\n+ 5 LongList.kt\nandroidx/collection/LongList\n*L\n1#1,146:1\n1#2:147\n1#2:149\n939#3:148\n908#3:152\n673#4,2:150\n65#5:153\n251#5,6:154\n*S KotlinDebug\n*F\n+ 1 SnapshotId.jvm.kt\nandroidx/compose/runtime/snapshots/SnapshotIdArrayBuilder\n*L\n128#1:149\n128#1:148\n128#1:152\n128#1:150,2\n135#1:153\n138#1:154,6\n*E\n"})
/* loaded from: classes.dex */
public final class SnapshotIdArrayBuilder {
    public static final int $stable = 8;

    @k
    private final MutableLongList list;

    public SnapshotIdArrayBuilder(@l long[] jArr) {
        MutableLongList mutableLongList;
        if (jArr != null) {
            long[] copyOf = Arrays.copyOf(jArr, jArr.length);
            mutableLongList = new MutableLongList(copyOf.length);
            mutableLongList.addAll(mutableLongList._size, copyOf);
        } else {
            mutableLongList = new MutableLongList(0, 1, null);
        }
        this.list = mutableLongList;
    }

    public final void add(long j11) {
        this.list.add(j11);
    }

    @l
    public final long[] toArray() {
        MutableLongList mutableLongList = this.list;
        int i11 = mutableLongList._size;
        if (i11 == 0) {
            return null;
        }
        long[] jArr = new long[i11];
        long[] jArr2 = mutableLongList.content;
        for (int i12 = 0; i12 < i11; i12++) {
            jArr[i12] = jArr2[i12];
        }
        return jArr;
    }
}

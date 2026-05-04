package androidx.compose.runtime.snapshots;

import a00.i0;
import androidx.compose.runtime.Immutable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import q30.q;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSnapshotIdSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotIdSet.kt\nandroidx/compose/runtime/snapshots/SnapshotIdSet\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SnapshotId.jvm.kt\nandroidx/compose/runtime/snapshots/SnapshotId_jvmKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,315:1\n274#1,7:318\n281#1,15:329\n276#1:344\n274#1,7:345\n281#1,15:356\n276#1:371\n274#1,7:372\n281#1,15:383\n276#1:398\n274#1,7:399\n281#1,15:410\n276#1:425\n274#1,7:426\n281#1,15:437\n276#1:452\n280#1:453\n281#1,15:458\n1#2:316\n143#3:317\n83#3,4:325\n83#3,4:352\n83#3,4:379\n83#3,4:406\n83#3,4:433\n83#3,4:454\n83#3,4:473\n68#3:477\n1549#4:478\n1620#4,3:479\n*S KotlinDebug\n*F\n+ 1 SnapshotIdSet.kt\nandroidx/compose/runtime/snapshots/SnapshotIdSet\n*L\n198#1:318,7\n198#1:329,15\n198#1:344\n218#1:345,7\n218#1:356,15\n218#1:371\n222#1:372,7\n222#1:383,15\n222#1:398\n242#1:399,7\n242#1:410,15\n242#1:425\n245#1:426,7\n245#1:437,15\n245#1:452\n275#1:453\n275#1:458,15\n131#1:317\n198#1:325,4\n218#1:352,4\n222#1:379,4\n242#1:406,4\n245#1:433,4\n275#1:454,4\n280#1:473,4\n299#1:477\n306#1:478\n306#1:479,3\n*E\n"})
@Immutable
/* loaded from: classes.dex */
public final class SnapshotIdSet implements Iterable<Long>, y00.a {
    public static final int $stable = 0;

    @k
    public static final Companion Companion = new Companion(null);

    @k
    private static final SnapshotIdSet EMPTY = new SnapshotIdSet(0, 0, 0, null);

    @l
    private final long[] belowBound;
    private final long lowerBound;
    private final long lowerSet;
    private final long upperSet;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        @k
        public final SnapshotIdSet getEMPTY() {
            return SnapshotIdSet.EMPTY;
        }

        private Companion() {
        }
    }

    private SnapshotIdSet(long j11, long j12, long j13, long[] jArr) {
        this.upperSet = j11;
        this.lowerSet = j12;
        this.lowerBound = j13;
        this.belowBound = jArr;
    }

    private final SnapshotIdSet fastFold(SnapshotIdSet snapshotIdSet, p<? super SnapshotIdSet, ? super Long, SnapshotIdSet> pVar) {
        long[] jArr = this.belowBound;
        if (jArr != null) {
            for (long j11 : jArr) {
                snapshotIdSet = pVar.invoke(snapshotIdSet, Long.valueOf(j11));
            }
        }
        if (this.lowerSet != 0) {
            for (int i11 = 0; i11 < 64; i11++) {
                if ((this.lowerSet & (1 << i11)) != 0) {
                    snapshotIdSet = pVar.invoke(snapshotIdSet, Long.valueOf(this.lowerBound + i11));
                }
            }
        }
        if (this.upperSet != 0) {
            for (int i12 = 0; i12 < 64; i12++) {
                if ((this.upperSet & (1 << i12)) != 0) {
                    snapshotIdSet = pVar.invoke(snapshotIdSet, Long.valueOf(this.lowerBound + i12 + 64));
                }
            }
        }
        return snapshotIdSet;
    }

    @k
    public final SnapshotIdSet and(@k SnapshotIdSet snapshotIdSet) {
        SnapshotIdSet snapshotIdSet2 = EMPTY;
        if (g0.g(snapshotIdSet, snapshotIdSet2) || g0.g(this, snapshotIdSet2)) {
            return snapshotIdSet2;
        }
        long j11 = snapshotIdSet.lowerBound;
        long j12 = this.lowerBound;
        if (j11 == j12) {
            long[] jArr = snapshotIdSet.belowBound;
            long[] jArr2 = this.belowBound;
            if (jArr == jArr2) {
                long j13 = this.upperSet;
                long j14 = snapshotIdSet.upperSet;
                long j15 = j13 & j14;
                long j16 = this.lowerSet;
                long j17 = snapshotIdSet.lowerSet;
                return (j15 == 0 && (j16 & j17) == 0 && jArr2 == null) ? snapshotIdSet2 : new SnapshotIdSet(j13 & j14, j16 & j17, j12, jArr2);
            }
        }
        SnapshotIdSet snapshotIdSet3 = snapshotIdSet2;
        int i11 = 0;
        if (this.belowBound == null) {
            long[] jArr3 = this.belowBound;
            if (jArr3 != null) {
                for (long j18 : jArr3) {
                    if (snapshotIdSet.get(j18)) {
                        snapshotIdSet3 = snapshotIdSet3.set(j18);
                    }
                }
            }
            SnapshotIdSet snapshotIdSet4 = snapshotIdSet3;
            if (this.lowerSet != 0) {
                for (int i12 = 0; i12 < 64; i12++) {
                    if ((this.lowerSet & (1 << i12)) != 0) {
                        long j19 = this.lowerBound + i12;
                        if (snapshotIdSet.get(j19)) {
                            snapshotIdSet4 = snapshotIdSet4.set(j19);
                        }
                    }
                }
            }
            if (this.upperSet != 0) {
                while (i11 < 64) {
                    if ((this.upperSet & (1 << i11)) != 0) {
                        long j21 = this.lowerBound + i11 + 64;
                        if (snapshotIdSet.get(j21)) {
                            snapshotIdSet4 = snapshotIdSet4.set(j21);
                        }
                    }
                    i11++;
                }
            }
            return snapshotIdSet4;
        }
        long[] jArr4 = snapshotIdSet.belowBound;
        if (jArr4 != null) {
            for (long j22 : jArr4) {
                if (get(j22)) {
                    snapshotIdSet3 = snapshotIdSet3.set(j22);
                }
            }
        }
        SnapshotIdSet snapshotIdSet5 = snapshotIdSet3;
        if (snapshotIdSet.lowerSet != 0) {
            for (int i13 = 0; i13 < 64; i13++) {
                if ((snapshotIdSet.lowerSet & (1 << i13)) != 0) {
                    long j23 = snapshotIdSet.lowerBound + i13;
                    if (get(j23)) {
                        snapshotIdSet5 = snapshotIdSet5.set(j23);
                    }
                }
            }
        }
        if (snapshotIdSet.upperSet != 0) {
            while (i11 < 64) {
                if ((snapshotIdSet.upperSet & (1 << i11)) != 0) {
                    long j24 = snapshotIdSet.lowerBound + i11 + 64;
                    if (get(j24)) {
                        snapshotIdSet5 = snapshotIdSet5.set(j24);
                    }
                }
                i11++;
            }
        }
        return snapshotIdSet5;
    }

    @k
    public final SnapshotIdSet andNot(@k SnapshotIdSet snapshotIdSet) {
        SnapshotIdSet snapshotIdSet2;
        SnapshotIdSet snapshotIdSet3 = EMPTY;
        if (snapshotIdSet == snapshotIdSet3) {
            return this;
        }
        if (this == snapshotIdSet3) {
            return snapshotIdSet3;
        }
        long j11 = snapshotIdSet.lowerBound;
        long j12 = this.lowerBound;
        if (j11 == j12) {
            long[] jArr = snapshotIdSet.belowBound;
            long[] jArr2 = this.belowBound;
            if (jArr == jArr2) {
                return new SnapshotIdSet((~snapshotIdSet.upperSet) & this.upperSet, (~snapshotIdSet.lowerSet) & this.lowerSet, j12, jArr2);
            }
        }
        long[] jArr3 = snapshotIdSet.belowBound;
        if (jArr3 != null) {
            snapshotIdSet2 = this;
            for (long j13 : jArr3) {
                snapshotIdSet2 = snapshotIdSet2.clear(j13);
            }
        } else {
            snapshotIdSet2 = this;
        }
        if (snapshotIdSet.lowerSet != 0) {
            for (int i11 = 0; i11 < 64; i11++) {
                if ((snapshotIdSet.lowerSet & (1 << i11)) != 0) {
                    snapshotIdSet2 = snapshotIdSet2.clear(snapshotIdSet.lowerBound + i11);
                }
            }
        }
        if (snapshotIdSet.upperSet != 0) {
            for (int i12 = 0; i12 < 64; i12++) {
                if ((snapshotIdSet.upperSet & (1 << i12)) != 0) {
                    snapshotIdSet2 = snapshotIdSet2.clear(snapshotIdSet.lowerBound + i12 + 64);
                }
            }
        }
        return snapshotIdSet2;
    }

    @k
    public final SnapshotIdSet clear(long j11) {
        long[] jArr;
        int binarySearch;
        long j12 = this.lowerBound;
        long j13 = j11 - j12;
        if (j13 >= 0 && j13 < 64) {
            long j14 = 1 << ((int) j13);
            long j15 = this.lowerSet;
            if ((j15 & j14) != 0) {
                return new SnapshotIdSet(this.upperSet, j15 & (~j14), j12, this.belowBound);
            }
        } else if (j13 >= 64 && j13 < 128) {
            long j16 = 1 << (((int) j13) - 64);
            long j17 = this.upperSet;
            if ((j17 & j16) != 0) {
                return new SnapshotIdSet(j17 & (~j16), this.lowerSet, j12, this.belowBound);
            }
        } else if (j13 < 0 && (jArr = this.belowBound) != null && (binarySearch = SnapshotId_jvmKt.binarySearch(jArr, j11)) >= 0) {
            return new SnapshotIdSet(this.upperSet, this.lowerSet, this.lowerBound, SnapshotId_jvmKt.withIdRemovedAt(jArr, binarySearch));
        }
        return this;
    }

    public final void fastForEach(@k x00.l<? super Long, g2> lVar) {
        long[] jArr = this.belowBound;
        if (jArr != null) {
            for (long j11 : jArr) {
                lVar.invoke(Long.valueOf(j11));
            }
        }
        if (this.lowerSet != 0) {
            for (int i11 = 0; i11 < 64; i11++) {
                if ((this.lowerSet & (1 << i11)) != 0) {
                    lVar.invoke(Long.valueOf(this.lowerBound + i11));
                }
            }
        }
        if (this.upperSet != 0) {
            for (int i12 = 0; i12 < 64; i12++) {
                if ((this.upperSet & (1 << i12)) != 0) {
                    lVar.invoke(Long.valueOf(this.lowerBound + i12 + 64));
                }
            }
        }
    }

    public final boolean get(long j11) {
        long[] jArr;
        long j12 = j11 - this.lowerBound;
        return (j12 < 0 || j12 >= 64) ? (j12 < 64 || j12 >= 128) ? j12 <= 0 && (jArr = this.belowBound) != null && SnapshotId_jvmKt.binarySearch(jArr, j11) >= 0 : ((1 << (((int) j12) + (-64))) & this.upperSet) != 0 : ((1 << ((int) j12)) & this.lowerSet) != 0;
    }

    @Override // java.lang.Iterable
    @k
    public Iterator<Long> iterator() {
        return q.b(new SnapshotIdSet$iterator$1(this, null)).iterator();
    }

    public final long lowest(long j11) {
        long[] jArr = this.belowBound;
        if (jArr != null) {
            return jArr[0];
        }
        if (this.lowerSet != 0) {
            return this.lowerBound + Long.numberOfTrailingZeros(r0);
        }
        return this.upperSet != 0 ? this.lowerBound + 64 + Long.numberOfTrailingZeros(r0) : j11;
    }

    @k
    public final SnapshotIdSet or(@k SnapshotIdSet snapshotIdSet) {
        SnapshotIdSet snapshotIdSet2;
        SnapshotIdSet snapshotIdSet3 = EMPTY;
        if (snapshotIdSet == snapshotIdSet3) {
            return this;
        }
        if (this == snapshotIdSet3) {
            return snapshotIdSet;
        }
        long j11 = snapshotIdSet.lowerBound;
        long j12 = this.lowerBound;
        if (j11 == j12) {
            long[] jArr = snapshotIdSet.belowBound;
            long[] jArr2 = this.belowBound;
            if (jArr == jArr2) {
                return new SnapshotIdSet(snapshotIdSet.upperSet | this.upperSet, snapshotIdSet.lowerSet | this.lowerSet, j12, jArr2);
            }
        }
        int i11 = 0;
        if (this.belowBound == null) {
            long[] jArr3 = this.belowBound;
            if (jArr3 != null) {
                for (long j13 : jArr3) {
                    snapshotIdSet = snapshotIdSet.set(j13);
                }
            }
            if (this.lowerSet != 0) {
                for (int i12 = 0; i12 < 64; i12++) {
                    if ((this.lowerSet & (1 << i12)) != 0) {
                        snapshotIdSet = snapshotIdSet.set(this.lowerBound + i12);
                    }
                }
            }
            if (this.upperSet != 0) {
                while (i11 < 64) {
                    if ((this.upperSet & (1 << i11)) != 0) {
                        snapshotIdSet = snapshotIdSet.set(this.lowerBound + i11 + 64);
                    }
                    i11++;
                }
            }
            return snapshotIdSet;
        }
        long[] jArr4 = snapshotIdSet.belowBound;
        if (jArr4 != null) {
            snapshotIdSet2 = this;
            for (long j14 : jArr4) {
                snapshotIdSet2 = snapshotIdSet2.set(j14);
            }
        } else {
            snapshotIdSet2 = this;
        }
        if (snapshotIdSet.lowerSet != 0) {
            for (int i13 = 0; i13 < 64; i13++) {
                if ((snapshotIdSet.lowerSet & (1 << i13)) != 0) {
                    snapshotIdSet2 = snapshotIdSet2.set(snapshotIdSet.lowerBound + i13);
                }
            }
        }
        if (snapshotIdSet.upperSet != 0) {
            while (i11 < 64) {
                if ((snapshotIdSet.upperSet & (1 << i11)) != 0) {
                    snapshotIdSet2 = snapshotIdSet2.set(snapshotIdSet.lowerBound + i11 + 64);
                }
                i11++;
            }
        }
        return snapshotIdSet2;
    }

    @k
    public final SnapshotIdSet set(long j11) {
        long j12;
        long j13;
        long[] jArr;
        long j14 = this.lowerBound;
        long j15 = j11 - j14;
        long j16 = 0;
        if (j15 >= 0 && j15 < 64) {
            long j17 = 1 << ((int) j15);
            long j18 = this.lowerSet;
            if ((j18 & j17) == 0) {
                return new SnapshotIdSet(this.upperSet, j18 | j17, j14, this.belowBound);
            }
        } else if (j15 >= 64 && j15 < 128) {
            long j19 = 1 << (((int) j15) - 64);
            long j21 = this.upperSet;
            if ((j21 & j19) == 0) {
                return new SnapshotIdSet(j21 | j19, this.lowerSet, j14, this.belowBound);
            }
        } else if (j15 < 128) {
            long[] jArr2 = this.belowBound;
            if (jArr2 == null) {
                return new SnapshotIdSet(this.upperSet, this.lowerSet, j14, new long[]{j11});
            }
            int binarySearch = SnapshotId_jvmKt.binarySearch(jArr2, j11);
            if (binarySearch < 0) {
                return new SnapshotIdSet(this.upperSet, this.lowerSet, this.lowerBound, SnapshotId_jvmKt.withIdInsertedAt(jArr2, -(binarySearch + 1), j11));
            }
        } else if (!get(j11)) {
            long j22 = this.upperSet;
            long j23 = this.lowerSet;
            long j24 = this.lowerBound;
            long j25 = 64;
            long j26 = ((j11 + 1) / j25) * j25;
            if (j26 < 0) {
                j26 = 9223372036854775680L;
            }
            SnapshotIdArrayBuilder snapshotIdArrayBuilder = null;
            long j27 = j22;
            while (true) {
                if (j24 >= j26) {
                    j12 = j23;
                    j13 = j24;
                    break;
                }
                if (j23 != j16) {
                    if (snapshotIdArrayBuilder == null) {
                        snapshotIdArrayBuilder = new SnapshotIdArrayBuilder(this.belowBound);
                    }
                    int i11 = 0;
                    while (i11 < 64) {
                        long j28 = j16;
                        if ((j23 & (1 << i11)) != j16) {
                            snapshotIdArrayBuilder.add(j24 + i11);
                        }
                        i11++;
                        j16 = j28;
                    }
                }
                j12 = j16;
                if (j27 == j12) {
                    j13 = j26;
                    break;
                }
                j24 += j25;
                j23 = j27;
                j16 = j12;
                j27 = j16;
            }
            if (snapshotIdArrayBuilder == null || (jArr = snapshotIdArrayBuilder.toArray()) == null) {
                jArr = this.belowBound;
            }
            return new SnapshotIdSet(j27, j12, j13, jArr).set(j11);
        }
        return this;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(" [");
        ArrayList arrayList = new ArrayList(i0.d0(this, 10));
        Iterator<Long> it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(it.next().longValue()));
        }
        sb2.append(ListUtilsKt.fastJoinToString$default(arrayList, null, null, null, 0, null, null, 63, null));
        sb2.append(l50.b.f69930l);
        return sb2.toString();
    }
}

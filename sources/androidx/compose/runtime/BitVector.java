package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Arrays;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import l50.b;
import m80.k;
import org.junit.jupiter.api.j2;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/BitVector\n+ 2 SlotTable.kt\nandroidx/compose/runtime/SlotTableKt\n*L\n1#1,3963:1\n3500#1,5:3967\n3505#1,27:3973\n3500#1,5:4000\n3505#1,27:4006\n3810#2:3964\n3810#2:3965\n3810#2:3966\n3580#2:3972\n3580#2:4005\n3580#2:4033\n3580#2:4034\n3580#2:4035\n3810#2:4036\n3810#2:4037\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/BitVector\n*L\n3490#1:3967,5\n3490#1:3973,27\n3492#1:4000,5\n3492#1:4006,27\n3467#1:3964\n3473#1:3965\n3487#1:3966\n3490#1:3972\n3492#1:4005\n3504#1:4033\n3510#1:4034\n3527#1:4035\n3544#1:4036\n3555#1:4037\n*E\n"})
/* loaded from: classes.dex */
public final class BitVector {
    public static final int $stable = 8;
    private long first;

    @k
    private long[] others;
    private long second;

    public BitVector() {
        long[] jArr;
        jArr = SlotTableKt.EmptyLongArray;
        this.others = jArr;
    }

    private final int nextBit(int i11, l<? super Long, Long> lVar) {
        int numberOfTrailingZeros;
        if (i11 < 64 && (numberOfTrailingZeros = Long.numberOfTrailingZeros((lVar.invoke(Long.valueOf(this.first)).longValue() >>> i11) << i11)) < 64) {
            return numberOfTrailingZeros;
        }
        if (i11 < 128) {
            int i12 = i11 - 64;
            int numberOfTrailingZeros2 = Long.numberOfTrailingZeros((lVar.invoke(Long.valueOf(this.second)).longValue() >>> i12) << i12);
            if (numberOfTrailingZeros2 < 64) {
                return numberOfTrailingZeros2 + 64;
            }
        }
        int max = Math.max(i11, 128);
        int i13 = (max / 64) - 2;
        long[] jArr = this.others;
        int length = jArr.length;
        for (int i14 = i13; i14 < length; i14++) {
            long longValue = lVar.invoke(Long.valueOf(jArr[i14])).longValue();
            if (i14 == i13) {
                int i15 = max % 64;
                longValue = (longValue >>> i15) << i15;
            }
            int numberOfTrailingZeros3 = Long.numberOfTrailingZeros(longValue);
            if (numberOfTrailingZeros3 < 64) {
                return (i14 * 64) + 128 + numberOfTrailingZeros3;
            }
        }
        return Integer.MAX_VALUE;
    }

    public final boolean get(int i11) {
        int i12;
        if (i11 < 64) {
            return ((1 << i11) & this.first) != 0;
        }
        if (i11 < 128) {
            return ((1 << (i11 - 64)) & this.second) != 0;
        }
        long[] jArr = this.others;
        int length = jArr.length;
        if (length != 0 && (i11 / 64) - 2 < length) {
            return ((1 << (i11 % 64)) & jArr[i12]) != 0;
        }
        return false;
    }

    public final int getSize() {
        return (this.others.length + 2) * 64;
    }

    public final int nextClear(int i11) {
        int numberOfTrailingZeros;
        if (i11 < 64 && (numberOfTrailingZeros = Long.numberOfTrailingZeros(((~this.first) >>> i11) << i11)) < 64) {
            return numberOfTrailingZeros;
        }
        if (i11 < 128) {
            int i12 = i11 - 64;
            int numberOfTrailingZeros2 = Long.numberOfTrailingZeros(((~this.second) >>> i12) << i12);
            if (numberOfTrailingZeros2 < 64) {
                return numberOfTrailingZeros2 + 64;
            }
        }
        int max = Math.max(i11, 128);
        int i13 = (max / 64) - 2;
        long[] jArr = this.others;
        int length = jArr.length;
        for (int i14 = i13; i14 < length; i14++) {
            long j11 = ~jArr[i14];
            if (i14 == i13) {
                int i15 = max % 64;
                j11 = (j11 >>> i15) << i15;
            }
            int numberOfTrailingZeros3 = Long.numberOfTrailingZeros(j11);
            if (numberOfTrailingZeros3 < 64) {
                return (i14 * 64) + 128 + numberOfTrailingZeros3;
            }
        }
        return Integer.MAX_VALUE;
    }

    public final int nextSet(int i11) {
        int numberOfTrailingZeros;
        if (i11 < 64 && (numberOfTrailingZeros = Long.numberOfTrailingZeros((this.first >>> i11) << i11)) < 64) {
            return numberOfTrailingZeros;
        }
        if (i11 < 128) {
            int i12 = i11 - 64;
            int numberOfTrailingZeros2 = Long.numberOfTrailingZeros((this.second >>> i12) << i12);
            if (numberOfTrailingZeros2 < 64) {
                return numberOfTrailingZeros2 + 64;
            }
        }
        int max = Math.max(i11, 128);
        int i13 = (max / 64) - 2;
        long[] jArr = this.others;
        int length = jArr.length;
        for (int i14 = i13; i14 < length; i14++) {
            long j11 = jArr[i14];
            if (i14 == i13) {
                int i15 = max % 64;
                j11 = (j11 >>> i15) << i15;
            }
            int numberOfTrailingZeros3 = Long.numberOfTrailingZeros(j11);
            if (numberOfTrailingZeros3 < 64) {
                return (i14 * 64) + 128 + numberOfTrailingZeros3;
            }
        }
        return Integer.MAX_VALUE;
    }

    public final void set(int i11, boolean z11) {
        if (i11 < 64) {
            this.first = ((z11 ? 1L : 0L) << i11) | ((~(1 << i11)) & this.first);
            return;
        }
        if (i11 < 128) {
            this.second = ((z11 ? 1L : 0L) << i11) | ((~(1 << (i11 - 64))) & this.second);
            return;
        }
        int i12 = i11 / 64;
        int i13 = i12 - 2;
        int i14 = i11 % 64;
        long j11 = 1 << i14;
        long[] jArr = this.others;
        if (i13 >= jArr.length) {
            jArr = Arrays.copyOf(jArr, i12 - 1);
            g0.o(jArr, "copyOf(...)");
            this.others = jArr;
        }
        jArr[i13] = ((z11 ? 1L : 0L) << i14) | ((~j11) & jArr[i13]);
    }

    public final void setRange(int i11, int i12) {
        long j11 = i11 < i12 ? -1L : 0L;
        this.first = ((((i11 < 64 ? 1 : 0) * j11) >>> (64 - (Math.min(64, i12) - i11))) << i11) | this.first;
        if (i12 > 64) {
            int max = Math.max(i11, 64);
            this.second = (((j11 * (max < 128 ? 1 : 0)) >>> (128 - (Math.min(128, i12) - max))) << max) | this.second;
            if (i12 > 128) {
                for (int max2 = Math.max(max, 128); max2 < i12; max2++) {
                    set(max2, true);
                }
            }
        }
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("BitVector [");
        int size = getSize();
        boolean z11 = true;
        for (int i11 = 0; i11 < size; i11++) {
            if (get(i11)) {
                if (!z11) {
                    sb2.append(j2.O);
                }
                sb2.append(i11);
                z11 = false;
            }
        }
        sb2.append(b.f69930l);
        String sb3 = sb2.toString();
        g0.o(sb3, "toString(...)");
        return sb3;
    }
}

package androidx.collection;

import a00.a0;
import kotlin.Pair;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import w00.g;
import yz.v0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1787:1\n1254#1,6:1789\n1220#1:1795\n1220#1:1796\n1220#1:1797\n1297#1:1798\n1#2:1788\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1230#1:1789,6\n1262#1:1795\n1265#1:1796\n1268#1:1797\n1303#1:1798\n*E\n"})
/* loaded from: classes.dex */
public final class ScatterMapKt {
    public static final long AllEmpty = -9187201950435737472L;
    public static final long BitmaskLsb = 72340172838076673L;
    public static final long BitmaskMsb = -9187201950435737472L;
    public static final int ClonedMetadataCount = 7;
    public static final int DefaultScatterCapacity = 6;
    public static final long Deleted = 254;
    public static final long Empty = 128;

    @g
    @k
    public static final long[] EmptyGroup = {-9187201950435737345L, -1};

    @k
    private static final MutableScatterMap EmptyScatterMap = new MutableScatterMap(0);
    public static final int GroupWidth = 8;
    public static final int MurmurHashC1 = -862048943;
    public static final long Sentinel = 255;

    public static final void convertMetadataForCleanup(@k long[] metadata, int i11) {
        g0.p(metadata, "metadata");
        int i12 = (i11 + 7) >> 3;
        for (int i13 = 0; i13 < i12; i13++) {
            long j11 = metadata[i13] & (-9187201950435737472L);
            metadata[i13] = (-72340172838076674L) & ((~j11) + (j11 >>> 7));
        }
        int Ne = a0.Ne(metadata);
        int i14 = Ne - 1;
        metadata[i14] = (metadata[i14] & 72057594037927935L) | (-72057594037927936L);
        metadata[Ne] = metadata[0];
    }

    @k
    public static final <K, V> ScatterMap<K, V> emptyScatterMap() {
        MutableScatterMap mutableScatterMap = EmptyScatterMap;
        g0.n(mutableScatterMap, "null cannot be cast to non-null type androidx.collection.ScatterMap<K of androidx.collection.ScatterMapKt.emptyScatterMap, V of androidx.collection.ScatterMapKt.emptyScatterMap>");
        return mutableScatterMap;
    }

    public static final int get(long j11) {
        return Long.numberOfTrailingZeros(j11) >> 3;
    }

    public static final long group(@k long[] metadata, int i11) {
        g0.p(metadata, "metadata");
        int i12 = i11 >> 3;
        int i13 = (i11 & 7) << 3;
        return (((-i13) >> 63) & (metadata[i12 + 1] << (64 - i13))) | (metadata[i12] >>> i13);
    }

    public static final int h1(int i11) {
        return i11 >>> 7;
    }

    public static final int h2(int i11) {
        return i11 & 127;
    }

    public static final boolean hasNext(long j11) {
        return j11 != 0;
    }

    public static final int hash(@l Object obj) {
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        return hashCode ^ (hashCode << 16);
    }

    public static final boolean isDeleted(@k long[] metadata, int i11) {
        g0.p(metadata, "metadata");
        return ((metadata[i11 >> 3] >> ((i11 & 7) << 3)) & 255) == 254;
    }

    public static final boolean isEmpty(@k long[] metadata, int i11) {
        g0.p(metadata, "metadata");
        return ((metadata[i11 >> 3] >> ((i11 & 7) << 3)) & 255) == 128;
    }

    @v0
    public static final boolean isFull(long j11) {
        return j11 < 128;
    }

    public static final int loadedCapacity(int i11) {
        if (i11 == 7) {
            return 6;
        }
        return i11 - (i11 / 8);
    }

    @v0
    public static final int lowestBitSet(long j11) {
        return Long.numberOfTrailingZeros(j11) >> 3;
    }

    public static final long maskEmpty(long j11) {
        return j11 & ((~j11) << 6) & (-9187201950435737472L);
    }

    @v0
    public static final long maskEmptyOrDeleted(long j11) {
        return j11 & ((~j11) << 7) & (-9187201950435737472L);
    }

    @v0
    public static final long match(long j11, int i11) {
        long j12 = j11 ^ (i11 * BitmaskLsb);
        return (~j12) & (j12 - BitmaskLsb) & (-9187201950435737472L);
    }

    @k
    public static final <K, V> MutableScatterMap<K, V> mutableScatterMapOf() {
        return new MutableScatterMap<>(0, 1, null);
    }

    public static final long next(long j11) {
        return j11 & (j11 - 1);
    }

    public static final int nextCapacity(int i11) {
        if (i11 == 0) {
            return 6;
        }
        return (i11 * 2) + 1;
    }

    public static final int normalizeCapacity(int i11) {
        if (i11 > 0) {
            return (-1) >>> Integer.numberOfLeadingZeros(i11);
        }
        return 0;
    }

    @v0
    public static final long readRawMetadata(@k long[] data, int i11) {
        g0.p(data, "data");
        return (data[i11 >> 3] >> ((i11 & 7) << 3)) & 255;
    }

    public static final int unloadedCapacity(int i11) {
        if (i11 == 7) {
            return 8;
        }
        return i11 + ((i11 - 1) / 7);
    }

    public static final void writeMetadata(@k long[] data, int i11, int i12, long j11) {
        g0.p(data, "data");
        int i13 = i12 >> 3;
        int i14 = (i12 & 7) << 3;
        long j12 = (j11 << i14) | (data[i13] & (~(255 << i14)));
        data[i13] = j12;
        data[(((i12 - 7) & i11) + (i11 & 7)) >> 3] = j12;
    }

    public static final void writeRawMetadata(@k long[] data, int i11, long j11) {
        g0.p(data, "data");
        int i12 = i11 >> 3;
        int i13 = (i11 & 7) << 3;
        data[i12] = (j11 << i13) | (data[i12] & (~(255 << i13)));
    }

    public static final boolean isFull(@k long[] metadata, int i11) {
        g0.p(metadata, "metadata");
        return ((metadata[i11 >> 3] >> ((i11 & 7) << 3)) & 255) < 128;
    }

    @k
    public static final <K, V> MutableScatterMap<K, V> mutableScatterMapOf(@k Pair<? extends K, ? extends V>... pairs) {
        g0.p(pairs, "pairs");
        MutableScatterMap<K, V> mutableScatterMap = new MutableScatterMap<>(pairs.length);
        mutableScatterMap.putAll(pairs);
        return mutableScatterMap;
    }

    @v0
    public static /* synthetic */ void getBitmaskLsb$annotations() {
    }

    @v0
    public static /* synthetic */ void getBitmaskMsb$annotations() {
    }

    @v0
    public static /* synthetic */ void getSentinel$annotations() {
    }
}

package androidx.collection;

import com.google.common.collect.q7;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import yz.v0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSieveCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SieveCache.kt\nandroidx/collection/SieveCacheKt\n*L\n1#1,1148:1\n1147#1:1149\n1147#1:1150\n*S KotlinDebug\n*F\n+ 1 SieveCache.kt\nandroidx/collection/SieveCacheKt\n*L\n1097#1:1149\n1099#1:1150\n*E\n"})
/* loaded from: classes.dex */
public final class SieveCacheKt {
    public static final long EmptyNode = 4611686018427387903L;

    @k
    private static final long[] EmptyNodes = new long[0];
    public static final long InvalidMapping = 9223372034707292159L;
    public static final int InvalidMappingLink = Integer.MAX_VALUE;
    private static final long MaxSize = 2147483646;
    public static final int NodeInvalidLink = Integer.MAX_VALUE;
    public static final long NodeLinkMask = 2147483647L;
    public static final long NodeLinksMask = 4611686018427387903L;
    public static final long NodeMetaAndNextMask = -4611686016279904257L;
    public static final long NodeMetaAndPreviousMask = -2147483648L;
    public static final long NodeMetaMask = -4611686018427387904L;
    public static final long NodeVisitedBit = 4611686018427387904L;

    public static final long clearVisitedBit(long j11) {
        return j11 & 4611686018427387903L;
    }

    public static final long createDstMapping(long j11, int i11) {
        return (j11 & q7.f33754l) | i11;
    }

    public static final long createLinkToNext(int i11) {
        return (i11 & NodeLinkMask) | 4611686016279904256L;
    }

    public static final long createLinks(long j11, int i11, int i12, @k long[] mapping) {
        g0.p(mapping, "mapping");
        return (((j11 & (-4611686018427387904L)) | (i11 == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (mapping[i11] & 4294967295L))) << 31) | (i12 != Integer.MAX_VALUE ? (int) (mapping[i12] & 4294967295L) : Integer.MAX_VALUE);
    }

    public static final long createMapping(int i11, int i12) {
        return i12 | (i11 << 32);
    }

    public static final long createSrcMapping(long j11, int i11) {
        return (j11 & 4294967295L) | (i11 << 32);
    }

    public static final long eraseSrcMapping(long j11) {
        return (j11 & 4294967295L) | q7.f33754l;
    }

    public static final int getDst(long j11) {
        return (int) (j11 & 4294967295L);
    }

    @k
    public static final long[] getEmptyNodes() {
        return EmptyNodes;
    }

    public static final int getNextNode(long j11) {
        return (int) (j11 & NodeLinkMask);
    }

    public static final int getPreviousNode(long j11) {
        return (int) ((j11 >> 31) & NodeLinkMask);
    }

    public static final int getSrc(long j11) {
        return (int) ((j11 >> 32) & 4294967295L);
    }

    public static final int getVisited(long j11) {
        return (int) ((j11 >> 62) & 1);
    }

    public static final long setLinkToNext(long j11, int i11) {
        return (j11 & NodeMetaAndPreviousMask) | (i11 & NodeLinkMask);
    }

    public static final long setLinkToPrevious(long j11, int i11) {
        return (j11 & NodeMetaAndNextMask) | ((i11 & NodeLinkMask) << 31);
    }

    public static final long createLinks(long j11, int i11, int i12, @k int[] mapping) {
        g0.p(mapping, "mapping");
        return (((j11 & (-4611686018427387904L)) | (i11 == Integer.MAX_VALUE ? Integer.MAX_VALUE : mapping[i11])) << 31) | (i12 != Integer.MAX_VALUE ? mapping[i12] : Integer.MAX_VALUE);
    }

    @v0
    public static /* synthetic */ void getNodeInvalidLink$annotations() {
    }

    @v0
    public static /* synthetic */ void getNodeLinkMask$annotations() {
    }

    @v0
    public static /* synthetic */ void getNextNode$annotations(long j11) {
    }

    @v0
    public static /* synthetic */ void getPreviousNode$annotations(long j11) {
    }
}

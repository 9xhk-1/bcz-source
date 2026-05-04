package androidx.compose.ui.spatial;

import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nRectList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RectList.kt\nandroidx/compose/ui/spatial/RectListKt\n*L\n1#1,968:1\n870#1:969\n870#1:970\n870#1:971\n870#1:972\n*S KotlinDebug\n*F\n+ 1 RectList.kt\nandroidx/compose/ui/spatial/RectListKt\n*L\n803#1:969\n804#1:970\n805#1:971\n821#1:972\n*E\n"})
/* loaded from: classes2.dex */
public final class RectListKt {
    public static final int AxisEast = 3;
    public static final int AxisNorth = 0;
    public static final int AxisSouth = 1;
    public static final int AxisWest = 2;
    public static final long EverythingButLastChildOffset = -2301339409586323457L;
    public static final long EverythingButParentId = -4503599560261633L;
    public static final int InitialSize = 64;
    public static final int LongsPerItem = 3;
    public static final int Lower26Bits = 67108863;
    public static final int Lower9Bits = 511;
    private static final long PackedIntsHighestBit = -9223372034707292160L;
    private static final long PackedIntsLowestBit = 4294967297L;
    public static final long TombStone = 2305843009213693951L;

    public static final int distanceScore(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        if (i11 == 0) {
            return distanceScoreAlongAxis(i13, i19, i14, i12, i18, i16);
        }
        if (i11 == 1) {
            return distanceScoreAlongAxis(i17, i15, i14, i12, i18, i16);
        }
        if (i11 == 2) {
            return distanceScoreAlongAxis(i12, i18, i15, i13, i19, i17);
        }
        if (i11 != 3) {
            return Integer.MAX_VALUE;
        }
        return distanceScoreAlongAxis(i16, i14, i15, i13, i19, i17);
    }

    public static final int distanceScoreAlongAxis(int i11, int i12, int i13, int i14, int i15, int i16) {
        return ((i11 - i12) + 1) * ((((i13 - i14) + Math.max(i14, i16)) - Math.min(i13, i15)) + 1);
    }

    public static final long metaMarkUpdated(long j11) {
        return j11 | 2305843009213693952L;
    }

    public static final long metaUnMarkUpdated(long j11) {
        return j11 & (-2305843009213693953L);
    }

    public static final long metaWithLastChildOffset(long j11, int i11) {
        return (j11 & EverythingButLastChildOffset) | ((i11 & 511) << 52);
    }

    public static final long metaWithParentId(long j11, int i11) {
        return (j11 & EverythingButParentId) | ((i11 & Lower26Bits) << 26);
    }

    public static final long metaWithUpdated(long j11, boolean z11) {
        return (j11 & (-2305843009213693953L)) | ((z11 ? 1L : 0L) << 61);
    }

    public static final long packMeta(int i11, int i12, int i13, boolean z11, boolean z12, boolean z13) {
        return ((z12 ? 1L : 0L) << 62) | ((z13 ? 1L : 0L) << 63) | ((z11 ? 1L : 0L) << 61) | ((i13 & 511) << 52) | ((i12 & Lower26Bits) << 26) | (i11 & Lower26Bits);
    }

    public static final long packXY(int i11, int i12) {
        return (i12 & 4294967295L) | (i11 << 32);
    }

    public static final boolean rectIntersectsRect(long j11, long j12, long j13, long j14) {
        return ((((j14 - j11) - 4294967297L) | ((j12 - j13) - 4294967297L)) & (-9223372034707292160L)) == 0;
    }

    public static final long toLong(boolean z11) {
        return z11 ? 1L : 0L;
    }

    public static final int unpackMetaFocusable(long j11) {
        return ((int) (j11 >> 62)) & 1;
    }

    public static final int unpackMetaGesturable(long j11) {
        return ((int) (j11 >> 63)) & 1;
    }

    public static final int unpackMetaLastChildOffset(long j11) {
        return ((int) (j11 >> 52)) & 511;
    }

    public static final int unpackMetaParentId(long j11) {
        return ((int) (j11 >> 26)) & Lower26Bits;
    }

    public static final int unpackMetaUpdated(long j11) {
        return ((int) (j11 >> 61)) & 1;
    }

    public static final int unpackMetaValue(long j11) {
        return ((int) j11) & Lower26Bits;
    }

    public static final int unpackX(long j11) {
        return (int) (j11 >> 32);
    }

    public static final int unpackY(long j11) {
        return (int) j11;
    }
}

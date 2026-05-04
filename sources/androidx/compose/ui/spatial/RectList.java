package androidx.compose.ui.spatial;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import java.util.Arrays;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import w00.g;
import x00.l;
import x00.q;
import x00.r;
import x00.s;
import x00.t;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nRectList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RectList.kt\nandroidx/compose/ui/spatial/RectList\n+ 2 RectList.kt\nandroidx/compose/ui/spatial/RectListKt\n*L\n1#1,968:1\n102#1,8:969\n787#2:977\n787#2:978\n803#2:979\n870#2:980\n804#2:981\n870#2:982\n805#2:983\n870#2:984\n806#2,3:985\n810#2:988\n828#2,2:989\n810#2:991\n810#2:992\n787#2:993\n787#2:994\n823#2:995\n810#2:996\n787#2:997\n787#2:998\n823#2:999\n837#2:1000\n839#2:1001\n818#2:1002\n803#2:1003\n870#2:1004\n804#2:1005\n870#2:1006\n805#2:1007\n870#2:1008\n806#2,3:1009\n810#2:1012\n812#2:1013\n815#2:1014\n812#2:1015\n837#2,3:1016\n787#2:1019\n837#2,3:1020\n787#2:1023\n823#2:1024\n815#2:1025\n818#2:1026\n810#2:1027\n823#2:1028\n810#2:1029\n837#2:1030\n839#2:1031\n837#2:1032\n839#2:1033\n810#2:1034\n810#2:1035\n810#2:1036\n787#2:1037\n787#2:1038\n860#2,2:1039\n810#2:1041\n810#2:1042\n837#2:1043\n839#2:1044\n837#2:1045\n839#2:1046\n787#2:1047\n860#2,2:1048\n810#2:1050\n860#2,2:1051\n837#2:1053\n839#2:1054\n837#2:1055\n839#2:1056\n810#2:1057\n837#2:1058\n839#2:1059\n837#2:1060\n839#2:1061\n810#2:1062\n837#2:1063\n839#2:1064\n837#2:1065\n839#2:1066\n837#2:1067\n839#2:1068\n837#2:1069\n839#2:1070\n810#2:1071\n825#2:1072\n835#2:1073\n810#2:1074\n810#2:1075\n812#2:1076\n837#2:1077\n839#2:1078\n837#2:1079\n839#2:1080\n*S KotlinDebug\n*F\n+ 1 RectList.kt\nandroidx/compose/ui/spatial/RectList\n*L\n148#1:969,8\n151#1:977\n152#1:978\n154#1:979\n154#1:980\n154#1:981\n154#1:982\n154#1:983\n154#1:984\n154#1:985,3\n176#1:988\n183#1:989,2\n205#1:991\n234#1:992\n235#1:993\n236#1:994\n237#1:995\n260#1:996\n262#1:997\n263#1:998\n264#1:999\n265#1:1000\n266#1:1001\n268#1:1002\n281#1:1003\n281#1:1004\n281#1:1005\n281#1:1006\n281#1:1007\n281#1:1008\n281#1:1009,3\n320#1:1012\n321#1:1013\n322#1:1014\n328#1:1015\n331#1:1016,3\n331#1:1019\n333#1:1020,3\n333#1:1023\n334#1:1024\n335#1:1025\n339#1:1026\n355#1:1027\n356#1:1028\n372#1:1029\n376#1:1030\n377#1:1031\n378#1:1032\n379#1:1033\n396#1:1034\n418#1:1035\n435#1:1036\n454#1:1037\n455#1:1038\n463#1:1039,2\n467#1:1041\n485#1:1042\n486#1:1043\n487#1:1044\n488#1:1045\n489#1:1046\n505#1:1047\n513#1:1048,2\n515#1:1050\n544#1:1051,2\n546#1:1053\n547#1:1054\n548#1:1055\n549#1:1056\n550#1:1057\n582#1:1058\n583#1:1059\n584#1:1060\n585#1:1061\n634#1:1062\n635#1:1063\n636#1:1064\n637#1:1065\n638#1:1066\n669#1:1067\n670#1:1068\n671#1:1069\n672#1:1070\n682#1:1071\n719#1:1072\n731#1:1073\n735#1:1074\n753#1:1075\n754#1:1076\n755#1:1077\n756#1:1078\n757#1:1079\n758#1:1080\n*E\n"})
/* loaded from: classes2.dex */
public final class RectList {
    public static final int $stable = 8;

    @g
    public int itemsSize;

    @g
    @k
    public long[] items = new long[192];

    @g
    @k
    public long[] stack = new long[192];

    private final int allocateItemsIndex() {
        long[] jArr = this.items;
        int i11 = this.itemsSize;
        int i12 = i11 + 3;
        this.itemsSize = i12;
        int length = jArr.length;
        if (length <= i12) {
            resizeStorage(length, i11, jArr);
        }
        return i11;
    }

    public static /* synthetic */ void insert$default(RectList rectList, int i11, int i12, int i13, int i14, int i15, int i16, boolean z11, boolean z12, int i17, Object obj) {
        boolean z13;
        RectList rectList2;
        int i18;
        int i19;
        int i21;
        int i22;
        int i23;
        int i24 = (i17 & 32) != 0 ? -1 : i16;
        boolean z14 = (i17 & 64) != 0 ? false : z11;
        if ((i17 & 128) != 0) {
            z13 = false;
            i18 = i11;
            i19 = i12;
            i21 = i13;
            i22 = i14;
            i23 = i15;
            rectList2 = rectList;
        } else {
            z13 = z12;
            rectList2 = rectList;
            i18 = i11;
            i19 = i12;
            i21 = i13;
            i22 = i14;
            i23 = i15;
        }
        rectList2.insert(i18, i19, i21, i22, i23, i24, z14, z13);
    }

    private final void resizeStorage(int i11, int i12, long[] jArr) {
        int max = Math.max(i11 * 2, i12 + 3);
        long[] copyOf = Arrays.copyOf(jArr, max);
        g0.o(copyOf, "copyOf(...)");
        this.items = copyOf;
        long[] copyOf2 = Arrays.copyOf(this.stack, max);
        g0.o(copyOf2, "copyOf(...)");
        this.stack = copyOf2;
    }

    public final void clearUpdated() {
        long[] jArr = this.items;
        int i11 = this.itemsSize;
        for (int i12 = 0; i12 < jArr.length - 2 && i12 < i11; i12 += 3) {
            int i13 = i12 + 2;
            jArr[i13] = jArr[i13] & (-2305843009213693953L);
        }
    }

    public final boolean contains(int i11) {
        int i12 = i11 & RectListKt.Lower26Bits;
        long[] jArr = this.items;
        int i13 = this.itemsSize;
        for (int i14 = 0; i14 < jArr.length - 2 && i14 < i13; i14 += 3) {
            if ((((int) jArr[i14 + 2]) & RectListKt.Lower26Bits) == i12) {
                return true;
            }
        }
        return false;
    }

    @k
    public final String debugString() {
        StringBuilder sb2 = new StringBuilder();
        long[] jArr = this.items;
        int i11 = this.itemsSize;
        for (int i12 = 0; i12 < jArr.length - 2 && i12 < i11; i12 += 3) {
            long j11 = jArr[i12];
            long j12 = jArr[i12 + 1];
            long j13 = jArr[i12 + 2];
            sb2.append("id=" + (((int) j13) & RectListKt.Lower26Bits) + ", rect=[" + ((int) (j11 >> 32)) + ',' + ((int) j11) + ',' + ((int) (j12 >> 32)) + ',' + ((int) j12) + "], parent=" + (((int) (j13 >> 26)) & RectListKt.Lower26Bits));
            g0.o(sb2, "append(...)");
            sb2.append('\n');
            g0.o(sb2, "append(...)");
        }
        String sb3 = sb2.toString();
        g0.o(sb3, "toString(...)");
        return sb3;
    }

    public final void defragment() {
        long[] jArr = this.items;
        int i11 = this.itemsSize;
        long[] jArr2 = this.stack;
        int i12 = 0;
        for (int i13 = 0; i13 < jArr.length - 2 && i12 < jArr2.length - 2 && i13 < i11; i13 += 3) {
            int i14 = i13 + 2;
            if (jArr[i14] != RectListKt.TombStone) {
                jArr2[i12] = jArr[i13];
                jArr2[i12 + 1] = jArr[i13 + 1];
                jArr2[i12 + 2] = jArr[i14];
                i12 += 3;
            }
        }
        this.itemsSize = i12;
        this.items = jArr2;
        this.stack = jArr;
    }

    public final void findKNearestNeighbors(int i11, int i12, int i13, int i14, int i15, int i16, @k t<? super Integer, ? super Integer, ? super Integer, ? super Integer, ? super Integer, ? super Integer, g2> tVar) {
        int i17;
        int[] neighborsScoredByDistance$ui_release = neighborsScoredByDistance$ui_release(i11, i13, i14, i15, i16);
        long[] jArr = this.items;
        int i18 = 1;
        int i19 = 0;
        int i21 = 0;
        while (i19 <= i12) {
            int i22 = Integer.MAX_VALUE;
            int i23 = 0;
            while (i23 < neighborsScoredByDistance$ui_release.length) {
                int i24 = neighborsScoredByDistance$ui_release[i23];
                if (i24 > i18) {
                    i22 = Math.min(i22, i24);
                }
                if (i24 == i18) {
                    int i25 = i23 * 3;
                    long j11 = jArr[i25];
                    long j12 = jArr[i25 + 1];
                    i17 = i18;
                    tVar.invoke(Integer.valueOf(i24), Integer.valueOf(((int) jArr[i25 + 2]) & RectListKt.Lower26Bits), Integer.valueOf((int) (j11 >> 32)), Integer.valueOf((int) j11), Integer.valueOf((int) (j12 >> 32)), Integer.valueOf((int) j12));
                    i21++;
                    if (i21 == i12) {
                        return;
                    }
                } else {
                    i17 = i18;
                }
                i23++;
                i18 = i17;
            }
            i19++;
            i18 = i22;
        }
    }

    public final int findNearestNeighbor(int i11, int i12, int i13, int i14, int i15) {
        long[] jArr = this.items;
        int i16 = this.itemsSize;
        int i17 = Integer.MAX_VALUE;
        int i18 = -1;
        for (int i19 = 0; i19 < jArr.length - 2 && i19 < i16; i19 += 3) {
            long j11 = jArr[i19];
            int i21 = i19 + 1;
            long j12 = jArr[i21];
            int distanceScore = RectListKt.distanceScore(i11, i12, i13, i14, i15, (int) (j11 >> 32), (int) j11, (int) (j12 >> 32), (int) j12);
            boolean z11 = (distanceScore < i17) & (distanceScore > 0);
            if (z11) {
                i17 = distanceScore;
            }
            if (z11) {
                i18 = i21;
            }
        }
        if (i18 < 0 || i18 >= jArr.length) {
            return -1;
        }
        return ((int) jArr[i18]) & RectListKt.Lower26Bits;
    }

    public final void forEachIntersectingRectWithValueAt(int i11, @k s<? super Integer, ? super Integer, ? super Integer, ? super Integer, ? super Integer, g2> sVar) {
        long[] jArr = this.items;
        int i12 = this.itemsSize;
        long j11 = jArr[i11];
        long j12 = jArr[i11 + 1];
        for (int i13 = 0; i13 < jArr.length - 2 && i13 < i12; i13 += 3) {
            if (i13 != i11) {
                long j13 = jArr[i13];
                long j14 = jArr[i13 + 1];
                if (((((j12 - j13) - InlineClassHelperKt.Uint64Low32) | ((j14 - j11) - InlineClassHelperKt.Uint64Low32)) & (-9223372034707292160L)) == 0) {
                    sVar.invoke(Integer.valueOf((int) (j13 >> 32)), Integer.valueOf((int) j13), Integer.valueOf((int) (j14 >> 32)), Integer.valueOf((int) j14), Integer.valueOf(((int) jArr[i13 + 2]) & RectListKt.Lower26Bits));
                }
            }
        }
    }

    public final void forEachIntersection(int i11, int i12, int i13, int i14, @k l<? super Integer, g2> lVar) {
        long j11 = (i11 << 32) | (i12 & 4294967295L);
        long j12 = (i13 << 32) | (i14 & 4294967295L);
        long[] jArr = this.items;
        int i15 = this.itemsSize;
        for (int i16 = 0; i16 < jArr.length - 2 && i16 < i15; i16 += 3) {
            if (((((j12 - jArr[i16]) - InlineClassHelperKt.Uint64Low32) | ((jArr[i16 + 1] - j11) - InlineClassHelperKt.Uint64Low32)) & (-9223372034707292160L)) == 0) {
                lVar.invoke(Integer.valueOf(((int) jArr[i16 + 2]) & RectListKt.Lower26Bits));
            }
        }
    }

    public final void forEachRect(@k s<? super Integer, ? super Integer, ? super Integer, ? super Integer, ? super Integer, g2> sVar) {
        long[] jArr = this.items;
        int i11 = this.itemsSize;
        for (int i12 = 0; i12 < jArr.length - 2 && i12 < i11; i12 += 3) {
            long j11 = jArr[i12];
            long j12 = jArr[i12 + 1];
            sVar.invoke(Integer.valueOf(((int) jArr[i12 + 2]) & RectListKt.Lower26Bits), Integer.valueOf((int) (j11 >> 32)), Integer.valueOf((int) j11), Integer.valueOf((int) (j12 >> 32)), Integer.valueOf((int) j12));
        }
    }

    public final void forEachUpdatedRect(@k q<? super Integer, ? super Long, ? super Long, g2> qVar) {
        long[] jArr = this.items;
        int i11 = this.itemsSize;
        for (int i12 = 0; i12 < jArr.length - 2 && i12 < i11; i12 += 3) {
            long j11 = jArr[i12 + 2];
            if ((((int) (j11 >> 61)) & 1) != 0) {
                qVar.invoke(Integer.valueOf(((int) j11) & RectListKt.Lower26Bits), Long.valueOf(jArr[i12]), Long.valueOf(jArr[i12 + 1]));
            }
        }
    }

    public final int getSize() {
        return this.itemsSize / 3;
    }

    public final int indexOf(int i11) {
        int i12 = i11 & RectListKt.Lower26Bits;
        long[] jArr = this.items;
        int i13 = this.itemsSize;
        for (int i14 = 0; i14 < jArr.length - 2 && i14 < i13; i14 += 3) {
            if ((((int) jArr[i14 + 2]) & RectListKt.Lower26Bits) == i12) {
                return i14;
            }
        }
        return -1;
    }

    public final void insert(int i11, int i12, int i13, int i14, int i15, int i16, boolean z11, boolean z12) {
        long[] jArr = this.items;
        int i17 = this.itemsSize;
        int i18 = i17 + 3;
        this.itemsSize = i18;
        int length = jArr.length;
        if (length <= i18) {
            resizeStorage(length, i17, jArr);
        }
        long[] jArr2 = this.items;
        jArr2[i17] = (i12 << 32) | (i13 & 4294967295L);
        jArr2[i17 + 1] = (i14 << 32) | (i15 & 4294967295L);
        long j11 = ((z12 ? 1L : 0L) << 63) | ((z11 ? 1L : 0L) << 62) | (1 << 61) | (0 << 52);
        int i19 = i16 & RectListKt.Lower26Bits;
        jArr2[i17 + 2] = j11 | (i19 << 26) | (i11 & RectListKt.Lower26Bits);
        if (i16 < 0) {
            return;
        }
        for (int i21 = i17 - 3; i21 >= 0; i21 -= 3) {
            int i22 = i21 + 2;
            long j12 = jArr2[i22];
            if ((((int) j12) & RectListKt.Lower26Bits) == i19) {
                jArr2[i22] = (j12 & RectListKt.EverythingButLastChildOffset) | (((i17 - i21) & 511) << 52);
                return;
            }
        }
    }

    public final void markUpdated(int i11) {
        int i12 = i11 & RectListKt.Lower26Bits;
        long[] jArr = this.items;
        int i13 = this.itemsSize;
        for (int i14 = 0; i14 < jArr.length - 2 && i14 < i13; i14 += 3) {
            int i15 = i14 + 2;
            long j11 = jArr[i15];
            if ((((int) j11) & RectListKt.Lower26Bits) == i12) {
                jArr[i15] = 2305843009213693952L | j11;
                return;
            }
        }
    }

    public final long metaFor(int i11) {
        int i12 = i11 & RectListKt.Lower26Bits;
        long[] jArr = this.items;
        int i13 = this.itemsSize;
        for (int i14 = 0; i14 < jArr.length - 2 && i14 < i13; i14 += 3) {
            long j11 = jArr[i14 + 2];
            if ((((int) j11) & RectListKt.Lower26Bits) == i12) {
                return j11;
            }
        }
        return RectListKt.TombStone;
    }

    public final boolean move(int i11, int i12, int i13, int i14, int i15) {
        int i16 = i11 & RectListKt.Lower26Bits;
        long[] jArr = this.items;
        int i17 = this.itemsSize;
        for (int i18 = 0; i18 < jArr.length - 2 && i18 < i17; i18 += 3) {
            int i19 = i18 + 2;
            long j11 = jArr[i19];
            if ((((int) j11) & RectListKt.Lower26Bits) == i16) {
                long j12 = jArr[i18];
                jArr[i18] = (i13 & 4294967295L) | (i12 << 32);
                int i21 = i18;
                jArr[i18 + 1] = (i15 & 4294967295L) | (i14 << 32);
                jArr[i19] = 2305843009213693952L | j11;
                int i22 = i12 - ((int) (j12 >> 32));
                int i23 = i13 - ((int) j12);
                if ((i22 != 0) | (i23 != 0)) {
                    updateSubhierarchy((RectListKt.EverythingButParentId & j11) | (((i21 + 3) & RectListKt.Lower26Bits) << 26), i22, i23);
                }
                return true;
            }
        }
        return false;
    }

    @k
    public final int[] neighborsScoredByDistance$ui_release(int i11, int i12, int i13, int i14, int i15) {
        long[] jArr = this.items;
        int i16 = this.itemsSize / 3;
        int[] iArr = new int[i16];
        for (int i17 = 0; i17 < i16; i17++) {
            int i18 = i17 * 3;
            if (i18 < 0 || i18 >= jArr.length - 1) {
                break;
            }
            long j11 = jArr[i18];
            long j12 = jArr[i18 + 1];
            iArr[i17] = RectListKt.distanceScore(i11, i12, i13, i14, i15, (int) (j11 >> 32), (int) j11, (int) (j12 >> 32), (int) j12);
        }
        return iArr;
    }

    public final boolean remove(int i11) {
        int i12 = i11 & RectListKt.Lower26Bits;
        long[] jArr = this.items;
        int i13 = this.itemsSize;
        for (int i14 = 0; i14 < jArr.length - 2 && i14 < i13; i14 += 3) {
            int i15 = i14 + 2;
            if ((((int) jArr[i15]) & RectListKt.Lower26Bits) == i12) {
                jArr[i14] = -1;
                jArr[i14 + 1] = -1;
                jArr[i15] = 2305843009213693951L;
                return true;
            }
        }
        return false;
    }

    public final boolean update(int i11, int i12, int i13, int i14, int i15) {
        int i16 = i11 & RectListKt.Lower26Bits;
        long[] jArr = this.items;
        int i17 = this.itemsSize;
        for (int i18 = 0; i18 < jArr.length - 2 && i18 < i17; i18 += 3) {
            int i19 = i18 + 2;
            long j11 = jArr[i19];
            if ((((int) j11) & RectListKt.Lower26Bits) == i16) {
                jArr[i18] = (i12 << 32) | (i13 & 4294967295L);
                jArr[i18 + 1] = (i14 << 32) | (i15 & 4294967295L);
                jArr[i19] = 2305843009213693952L | j11;
                return true;
            }
        }
        return false;
    }

    public final void updateSubhierarchy(int i11, int i12, int i13) {
        updateSubhierarchy(((this.itemsSize & 511) << 52) | (0 << 26) | (i11 & RectListKt.Lower26Bits), i12, i13);
    }

    public final boolean withRect(int i11, @k r<? super Integer, ? super Integer, ? super Integer, ? super Integer, g2> rVar) {
        int i12 = i11 & RectListKt.Lower26Bits;
        long[] jArr = this.items;
        int i13 = this.itemsSize;
        for (int i14 = 0; i14 < jArr.length - 2 && i14 < i13; i14 += 3) {
            if ((((int) jArr[i14 + 2]) & RectListKt.Lower26Bits) == i12) {
                long j11 = jArr[i14];
                long j12 = jArr[i14 + 1];
                rVar.invoke(Integer.valueOf((int) (j11 >> 32)), Integer.valueOf((int) j11), Integer.valueOf((int) (j12 >> 32)), Integer.valueOf((int) j12));
                return true;
            }
        }
        return false;
    }

    private final void updateSubhierarchy(long j11, int i11, int i12) {
        int i13;
        char c11;
        char c12;
        long[] jArr = this.items;
        long[] jArr2 = this.stack;
        int size = getSize();
        jArr2[0] = j11;
        int i14 = 1;
        while (i14 > 0) {
            i14--;
            long j12 = jArr2[i14];
            int i15 = RectListKt.Lower26Bits;
            int i16 = ((int) j12) & RectListKt.Lower26Bits;
            char c13 = 26;
            int i17 = ((int) (j12 >> 26)) & RectListKt.Lower26Bits;
            char c14 = '4';
            char c15 = 511;
            int i18 = ((int) (j12 >> 52)) & 511;
            int i19 = i18 == 511 ? size : i18 + i17;
            if (i17 < 0) {
                return;
            }
            while (i17 < jArr.length - 2 && i17 < i19) {
                int i21 = i17 + 2;
                long j13 = jArr[i21];
                int i22 = i15;
                char c16 = c13;
                if ((((int) (j13 >> c16)) & i22) == i16) {
                    long j14 = jArr[i17];
                    int i23 = i17 + 1;
                    c11 = c14;
                    long j15 = jArr[i23];
                    i13 = i16;
                    jArr[i17] = ((((int) j14) + i12) & 4294967295L) | ((((int) (j14 >> 32)) + i11) << 32);
                    jArr[i23] = ((((int) j15) + i12) & 4294967295L) | ((((int) (j15 >> 32)) + i11) << 32);
                    jArr[i21] = 2305843009213693952L | j13;
                    c12 = 511;
                    if ((((int) (j13 >> c11)) & 511) > 0) {
                        jArr2[i14] = (((i17 + 3) & i22) << c16) | (RectListKt.EverythingButParentId & j13);
                        i14++;
                    }
                } else {
                    i13 = i16;
                    c11 = c14;
                    c12 = c15;
                }
                i17 += 3;
                i15 = i22;
                c13 = c16;
                c15 = c12;
                c14 = c11;
                i16 = i13;
            }
        }
    }

    public final void forEachIntersection(int i11, int i12, @k l<? super Integer, g2> lVar) {
        long j11 = (i12 & 4294967295L) | (i11 << 32);
        long[] jArr = this.items;
        int i13 = this.itemsSize;
        for (int i14 = 0; i14 < jArr.length - 2 && i14 < i13; i14 += 3) {
            if (((((j11 - jArr[i14]) - InlineClassHelperKt.Uint64Low32) | ((jArr[i14 + 1] - j11) - InlineClassHelperKt.Uint64Low32)) & (-9223372034707292160L)) == 0) {
                lVar.invoke(Integer.valueOf(((int) jArr[i14 + 2]) & RectListKt.Lower26Bits));
            }
        }
    }
}

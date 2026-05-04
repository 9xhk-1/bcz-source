package androidx.collection;

import a00.a0;
import a00.q;
import androidx.collection.internal.RuntimeHelpersKt;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import x00.p;
import yz.v0;
import yz.w1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nFloatFloatMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatFloatMap.kt\nandroidx/collection/MutableFloatFloatMap\n+ 2 RuntimeHelpers.kt\nandroidx/collection/internal/RuntimeHelpersKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 5 FloatFloatMap.kt\nandroidx/collection/FloatFloatMap\n+ 6 FloatSet.kt\nandroidx/collection/FloatSet\n+ 7 FloatList.kt\nandroidx/collection/FloatList\n+ 8 FloatSet.kt\nandroidx/collection/FloatSetKt\n*L\n1#1,1036:1\n59#2,5:1037\n1#3:1042\n1254#4,6:1043\n1399#4:1059\n1270#4:1063\n1399#4:1080\n1270#4:1084\n1399#4:1105\n1270#4:1109\n1230#4:1126\n1254#4,6:1127\n1242#4:1133\n1241#4,4:1134\n1254#4,6:1138\n1175#4:1147\n1179#4:1148\n1372#4,3:1149\n1386#4,3:1152\n1312#4:1155\n1303#4:1156\n1297#4:1157\n1309#4:1158\n1393#4:1159\n1265#4:1160\n1220#4:1161\n1262#4:1162\n1220#4:1163\n1230#4:1164\n1254#4,6:1165\n1242#4:1171\n1241#4,4:1172\n1372#4,3:1176\n1399#4:1179\n1297#4:1180\n1144#4,14:1181\n1220#4:1195\n1175#4:1199\n1179#4:1200\n1254#4,6:1201\n1220#4:1207\n1179#4:1208\n1254#4,6:1209\n1254#4,6:1215\n1179#4:1221\n1254#4,6:1222\n1268#4:1228\n1220#4:1229\n1175#4:1233\n1179#4:1234\n1230#4:1235\n1254#4,6:1236\n1242#4:1242\n1241#4,4:1243\n389#5,4:1049\n361#5,6:1053\n371#5,3:1060\n374#5,9:1064\n393#5:1073\n361#5,6:1074\n371#5,3:1081\n374#5,9:1085\n257#6,4:1094\n227#6,7:1098\n238#6,3:1106\n241#6,9:1110\n261#6:1119\n237#7,6:1120\n882#8,3:1144\n882#8,3:1196\n882#8,3:1230\n*S KotlinDebug\n*F\n+ 1 FloatFloatMap.kt\nandroidx/collection/MutableFloatFloatMap\n*L\n641#1:1037,5\n669#1:1043,6\n741#1:1059\n741#1:1063\n772#1:1080\n772#1:1084\n793#1:1105\n793#1:1109\n807#1:1126\n807#1:1127,6\n807#1:1133\n807#1:1134,4\n815#1:1138,6\n828#1:1147\n829#1:1148\n836#1:1149,3\n837#1:1152,3\n838#1:1155\n839#1:1156\n839#1:1157\n843#1:1158\n846#1:1159\n855#1:1160\n855#1:1161\n861#1:1162\n861#1:1163\n862#1:1164\n862#1:1165,6\n862#1:1171\n862#1:1172,4\n877#1:1176,3\n878#1:1179\n880#1:1180\n926#1:1181,14\n932#1:1195\n947#1:1199\n958#1:1200\n959#1:1201,6\n969#1:1207\n972#1:1208\n973#1:1209,6\n974#1:1215,6\n984#1:1221\n985#1:1222,6\n1024#1:1228\n1024#1:1229\n1027#1:1233\n1029#1:1234\n1029#1:1235\n1029#1:1236,6\n1029#1:1242\n1029#1:1243,4\n741#1:1049,4\n741#1:1053,6\n741#1:1060,3\n741#1:1064,9\n741#1:1073\n772#1:1074,6\n772#1:1081,3\n772#1:1085,9\n793#1:1094,4\n793#1:1098,7\n793#1:1106,3\n793#1:1110,9\n793#1:1119\n798#1:1120,6\n827#1:1144,3\n946#1:1196,3\n1026#1:1230,3\n*E\n"})
/* loaded from: classes.dex */
public final class MutableFloatFloatMap extends FloatFloatMap {
    private int growthLimit;

    public MutableFloatFloatMap() {
        this(0, 1, null);
    }

    private final int findFirstAvailableSlot(int i11) {
        int i12 = this._capacity;
        int i13 = i11 & i12;
        int i14 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j11 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j12 = j11 & ((~j11) << 7) & (-9187201950435737472L);
            if (j12 != 0) {
                return (i13 + (Long.numberOfTrailingZeros(j12) >> 3)) & i12;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
        }
    }

    private final int findInsertIndex(float f11) {
        int hashCode = Float.hashCode(f11) * (-862048943);
        int i11 = hashCode ^ (hashCode << 16);
        int i12 = i11 >>> 7;
        int i13 = i11 & 127;
        int i14 = this._capacity;
        int i15 = i12 & i14;
        int i16 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i17 = i15 >> 3;
            int i18 = (i15 & 7) << 3;
            long j11 = ((jArr[i17 + 1] << (64 - i18)) & ((-i18) >> 63)) | (jArr[i17] >>> i18);
            long j12 = i13;
            int i19 = i16;
            long j13 = j11 ^ (j12 * ScatterMapKt.BitmaskLsb);
            for (long j14 = (~j13) & (j13 - ScatterMapKt.BitmaskLsb) & (-9187201950435737472L); j14 != 0; j14 &= j14 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j14) >> 3) + i15) & i14;
                if (this.keys[numberOfTrailingZeros] == f11) {
                    return numberOfTrailingZeros;
                }
            }
            if ((((~j11) << 6) & j11 & (-9187201950435737472L)) != 0) {
                int findFirstAvailableSlot = findFirstAvailableSlot(i12);
                if (this.growthLimit == 0 && ((this.metadata[findFirstAvailableSlot >> 3] >> ((findFirstAvailableSlot & 7) << 3)) & 255) != 254) {
                    adjustStorage$collection();
                    findFirstAvailableSlot = findFirstAvailableSlot(i12);
                }
                this._size++;
                int i21 = this.growthLimit;
                long[] jArr2 = this.metadata;
                int i22 = findFirstAvailableSlot >> 3;
                long j15 = jArr2[i22];
                int i23 = (findFirstAvailableSlot & 7) << 3;
                this.growthLimit = i21 - (((j15 >> i23) & 255) == 128 ? 1 : 0);
                int i24 = this._capacity;
                long j16 = ((~(255 << i23)) & j15) | (j12 << i23);
                jArr2[i22] = j16;
                jArr2[(((findFirstAvailableSlot - 7) & i24) + (i24 & 7)) >> 3] = j16;
                return ~findFirstAvailableSlot;
            }
            i16 = i19 + 8;
            i15 = (i15 + i16) & i14;
        }
    }

    private final void initializeGrowth() {
        this.growthLimit = ScatterMapKt.loadedCapacity(getCapacity()) - this._size;
    }

    private final void initializeMetadata(int i11) {
        long[] jArr;
        if (i11 == 0) {
            jArr = ScatterMapKt.EmptyGroup;
        } else {
            long[] jArr2 = new long[((i11 + 15) & (-8)) >> 3];
            q.U1(jArr2, -9187201950435737472L, 0, 0, 6, null);
            jArr = jArr2;
        }
        this.metadata = jArr;
        int i12 = i11 >> 3;
        long j11 = 255 << ((i11 & 7) << 3);
        jArr[i12] = (jArr[i12] & (~j11)) | j11;
        initializeGrowth();
    }

    private final void initializeStorage(int i11) {
        int max = i11 > 0 ? Math.max(7, ScatterMapKt.normalizeCapacity(i11)) : 0;
        this._capacity = max;
        initializeMetadata(max);
        this.keys = new float[max];
        this.values = new float[max];
    }

    public final void adjustStorage$collection() {
        int compare;
        if (this._capacity > 8) {
            compare = Long.compare(w1.i(w1.i(this._size) * 32) ^ Long.MIN_VALUE, w1.i(w1.i(this._capacity) * 25) ^ Long.MIN_VALUE);
            if (compare <= 0) {
                dropDeletes$collection();
                return;
            }
        }
        resizeStorage$collection(ScatterMapKt.nextCapacity(this._capacity));
    }

    public final void clear() {
        this._size = 0;
        long[] jArr = this.metadata;
        if (jArr != ScatterMapKt.EmptyGroup) {
            q.U1(jArr, -9187201950435737472L, 0, 0, 6, null);
            long[] jArr2 = this.metadata;
            int i11 = this._capacity;
            int i12 = i11 >> 3;
            long j11 = 255 << ((i11 & 7) << 3);
            jArr2[i12] = (jArr2[i12] & (~j11)) | j11;
        }
        initializeGrowth();
    }

    public final void dropDeletes$collection() {
        long j11;
        long[] jArr = this.metadata;
        int i11 = this._capacity;
        float[] fArr = this.keys;
        float[] fArr2 = this.values;
        int i12 = (i11 + 7) >> 3;
        boolean z11 = false;
        for (int i13 = 0; i13 < i12; i13++) {
            long j12 = jArr[i13] & (-9187201950435737472L);
            jArr[i13] = (-72340172838076674L) & ((~j12) + (j12 >>> 7));
        }
        int Ne = a0.Ne(jArr);
        int i14 = Ne - 1;
        long j13 = 72057594037927935L;
        jArr[i14] = (jArr[i14] & 72057594037927935L) | (-72057594037927936L);
        jArr[Ne] = jArr[0];
        int i15 = 0;
        while (i15 != i11) {
            int i16 = i15 >> 3;
            int i17 = (i15 & 7) << 3;
            long j14 = (jArr[i16] >> i17) & 255;
            if (j14 != 128 && j14 == 254) {
                int hashCode = Float.hashCode(fArr[i15]) * (-862048943);
                int i18 = (hashCode ^ (hashCode << 16)) >>> 7;
                int findFirstAvailableSlot = findFirstAvailableSlot(i18);
                int i19 = i18 & i11;
                boolean z12 = z11;
                if (((findFirstAvailableSlot - i19) & i11) / 8 == ((i15 - i19) & i11) / 8) {
                    jArr[i16] = ((r8 & 127) << i17) | ((~(255 << i17)) & jArr[i16]);
                    jArr[a0.Ne(jArr)] = (jArr[z12 ? 1 : 0] & j13) | Long.MIN_VALUE;
                    i15++;
                    z11 = z12 ? 1 : 0;
                } else {
                    int i21 = findFirstAvailableSlot >> 3;
                    long j15 = jArr[i21];
                    int i22 = (findFirstAvailableSlot & 7) << 3;
                    if (((j15 >> i22) & 255) == 128) {
                        j11 = j13;
                        jArr[i21] = ((r8 & 127) << i22) | (j15 & (~(255 << i22)));
                        jArr[i16] = (jArr[i16] & (~(255 << i17))) | (128 << i17);
                        fArr[findFirstAvailableSlot] = fArr[i15];
                        fArr[i15] = 0.0f;
                        fArr2[findFirstAvailableSlot] = fArr2[i15];
                        fArr2[i15] = 0.0f;
                    } else {
                        j11 = j13;
                        jArr[i21] = ((r8 & 127) << i22) | (j15 & (~(255 << i22)));
                        float f11 = fArr[findFirstAvailableSlot];
                        fArr[findFirstAvailableSlot] = fArr[i15];
                        fArr[i15] = f11;
                        float f12 = fArr2[findFirstAvailableSlot];
                        fArr2[findFirstAvailableSlot] = fArr2[i15];
                        fArr2[i15] = f12;
                        i15--;
                    }
                    jArr[a0.Ne(jArr)] = (jArr[z12 ? 1 : 0] & j11) | Long.MIN_VALUE;
                    i15++;
                    z11 = z12 ? 1 : 0;
                    j13 = j11;
                }
            } else {
                i15++;
            }
        }
        initializeGrowth();
    }

    public final float getOrPut(float f11, @k x00.a<Float> defaultValue) {
        g0.p(defaultValue, "defaultValue");
        int findKeyIndex = findKeyIndex(f11);
        if (findKeyIndex >= 0) {
            return this.values[findKeyIndex];
        }
        float floatValue = defaultValue.invoke().floatValue();
        put(f11, floatValue);
        return floatValue;
    }

    public final void minusAssign(float f11) {
        remove(f11);
    }

    public final void plusAssign(@k FloatFloatMap from) {
        g0.p(from, "from");
        putAll(from);
    }

    public final void put(float f11, float f12) {
        set(f11, f12);
    }

    public final void putAll(@k FloatFloatMap from) {
        g0.p(from, "from");
        float[] fArr = from.keys;
        float[] fArr2 = from.values;
        long[] jArr = from.metadata;
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
                        int i14 = (i11 << 3) + i13;
                        set(fArr[i14], fArr2[i14]);
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

    public final void remove(float f11) {
        int findKeyIndex = findKeyIndex(f11);
        if (findKeyIndex >= 0) {
            removeValueAt(findKeyIndex);
        }
    }

    public final void removeIf(@k p<? super Float, ? super Float, Boolean> predicate) {
        g0.p(predicate, "predicate");
        long[] jArr = this.metadata;
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
                        int i14 = (i11 << 3) + i13;
                        if (predicate.invoke(Float.valueOf(this.keys[i14]), Float.valueOf(this.values[i14])).booleanValue()) {
                            removeValueAt(i14);
                        }
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

    @v0
    public final void removeValueAt(int i11) {
        this._size--;
        long[] jArr = this.metadata;
        int i12 = this._capacity;
        int i13 = i11 >> 3;
        int i14 = (i11 & 7) << 3;
        long j11 = (jArr[i13] & (~(255 << i14))) | (254 << i14);
        jArr[i13] = j11;
        jArr[(((i11 - 7) & i12) + (i12 & 7)) >> 3] = j11;
    }

    public final void resizeStorage$collection(int i11) {
        long[] jArr;
        MutableFloatFloatMap mutableFloatFloatMap = this;
        long[] jArr2 = mutableFloatFloatMap.metadata;
        float[] fArr = mutableFloatFloatMap.keys;
        float[] fArr2 = mutableFloatFloatMap.values;
        int i12 = mutableFloatFloatMap._capacity;
        initializeStorage(i11);
        long[] jArr3 = mutableFloatFloatMap.metadata;
        float[] fArr3 = mutableFloatFloatMap.keys;
        float[] fArr4 = mutableFloatFloatMap.values;
        int i13 = mutableFloatFloatMap._capacity;
        int i14 = 0;
        while (i14 < i12) {
            if (((jArr2[i14 >> 3] >> ((i14 & 7) << 3)) & 255) < 128) {
                float f11 = fArr[i14];
                int hashCode = Float.hashCode(f11) * (-862048943);
                int i15 = hashCode ^ (hashCode << 16);
                int findFirstAvailableSlot = mutableFloatFloatMap.findFirstAvailableSlot(i15 >>> 7);
                long j11 = i15 & 127;
                int i16 = findFirstAvailableSlot >> 3;
                int i17 = (findFirstAvailableSlot & 7) << 3;
                jArr = jArr2;
                long j12 = (jArr3[i16] & (~(255 << i17))) | (j11 << i17);
                jArr3[i16] = j12;
                jArr3[(((findFirstAvailableSlot - 7) & i13) + (i13 & 7)) >> 3] = j12;
                fArr3[findFirstAvailableSlot] = f11;
                fArr4[findFirstAvailableSlot] = fArr2[i14];
            } else {
                jArr = jArr2;
            }
            i14++;
            mutableFloatFloatMap = this;
            jArr2 = jArr;
        }
    }

    public final void set(float f11, float f12) {
        int findInsertIndex = findInsertIndex(f11);
        if (findInsertIndex < 0) {
            findInsertIndex = ~findInsertIndex;
        }
        this.keys[findInsertIndex] = f11;
        this.values[findInsertIndex] = f12;
    }

    public final int trim() {
        int i11 = this._capacity;
        int normalizeCapacity = ScatterMapKt.normalizeCapacity(ScatterMapKt.unloadedCapacity(this._size));
        if (normalizeCapacity >= i11) {
            return 0;
        }
        resizeStorage$collection(normalizeCapacity);
        return i11 - this._capacity;
    }

    public MutableFloatFloatMap(int i11) {
        super(null);
        if (!(i11 >= 0)) {
            RuntimeHelpersKt.throwIllegalArgumentException("Capacity must be a positive value.");
        }
        initializeStorage(ScatterMapKt.unloadedCapacity(i11));
    }

    public final void minusAssign(@k float[] keys) {
        g0.p(keys, "keys");
        for (float f11 : keys) {
            remove(f11);
        }
    }

    public final float put(float f11, float f12, float f13) {
        int findInsertIndex = findInsertIndex(f11);
        if (findInsertIndex < 0) {
            findInsertIndex = ~findInsertIndex;
        } else {
            f13 = this.values[findInsertIndex];
        }
        this.keys[findInsertIndex] = f11;
        this.values[findInsertIndex] = f12;
        return f13;
    }

    public final boolean remove(float f11, float f12) {
        int findKeyIndex = findKeyIndex(f11);
        if (findKeyIndex < 0 || this.values[findKeyIndex] != f12) {
            return false;
        }
        removeValueAt(findKeyIndex);
        return true;
    }

    public final void minusAssign(@k FloatSet keys) {
        g0.p(keys, "keys");
        float[] fArr = keys.elements;
        long[] jArr = keys.metadata;
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
                        remove(fArr[(i11 << 3) + i13]);
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

    public /* synthetic */ MutableFloatFloatMap(int i11, int i12, v vVar) {
        this((i12 & 1) != 0 ? 6 : i11);
    }

    public final void minusAssign(@k FloatList keys) {
        g0.p(keys, "keys");
        float[] fArr = keys.content;
        int i11 = keys._size;
        for (int i12 = 0; i12 < i11; i12++) {
            remove(fArr[i12]);
        }
    }
}

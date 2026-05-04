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
@u0({"SMAP\nFloatIntMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatIntMap.kt\nandroidx/collection/MutableFloatIntMap\n+ 2 RuntimeHelpers.kt\nandroidx/collection/internal/RuntimeHelpersKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 5 FloatIntMap.kt\nandroidx/collection/FloatIntMap\n+ 6 FloatSet.kt\nandroidx/collection/FloatSet\n+ 7 FloatList.kt\nandroidx/collection/FloatList\n+ 8 FloatSet.kt\nandroidx/collection/FloatSetKt\n*L\n1#1,1034:1\n59#2,5:1035\n1#3:1040\n1254#4,6:1041\n1399#4:1057\n1270#4:1061\n1399#4:1078\n1270#4:1082\n1399#4:1103\n1270#4:1107\n1230#4:1124\n1254#4,6:1125\n1242#4:1131\n1241#4,4:1132\n1254#4,6:1136\n1175#4:1145\n1179#4:1146\n1372#4,3:1147\n1386#4,3:1150\n1312#4:1153\n1303#4:1154\n1297#4:1155\n1309#4:1156\n1393#4:1157\n1265#4:1158\n1220#4:1159\n1262#4:1160\n1220#4:1161\n1230#4:1162\n1254#4,6:1163\n1242#4:1169\n1241#4,4:1170\n1372#4,3:1174\n1399#4:1177\n1297#4:1178\n1144#4,14:1179\n1220#4:1193\n1175#4:1197\n1179#4:1198\n1254#4,6:1199\n1220#4:1205\n1179#4:1206\n1254#4,6:1207\n1254#4,6:1213\n1179#4:1219\n1254#4,6:1220\n1268#4:1226\n1220#4:1227\n1175#4:1231\n1179#4:1232\n1230#4:1233\n1254#4,6:1234\n1242#4:1240\n1241#4,4:1241\n387#5,4:1047\n359#5,6:1051\n369#5,3:1058\n372#5,9:1062\n391#5:1071\n359#5,6:1072\n369#5,3:1079\n372#5,9:1083\n257#6,4:1092\n227#6,7:1096\n238#6,3:1104\n241#6,9:1108\n261#6:1117\n237#7,6:1118\n882#8,3:1142\n882#8,3:1194\n882#8,3:1228\n*S KotlinDebug\n*F\n+ 1 FloatIntMap.kt\nandroidx/collection/MutableFloatIntMap\n*L\n639#1:1035,5\n667#1:1041,6\n739#1:1057\n739#1:1061\n770#1:1078\n770#1:1082\n791#1:1103\n791#1:1107\n805#1:1124\n805#1:1125,6\n805#1:1131\n805#1:1132,4\n813#1:1136,6\n826#1:1145\n827#1:1146\n834#1:1147,3\n835#1:1150,3\n836#1:1153\n837#1:1154\n837#1:1155\n841#1:1156\n844#1:1157\n853#1:1158\n853#1:1159\n859#1:1160\n859#1:1161\n860#1:1162\n860#1:1163,6\n860#1:1169\n860#1:1170,4\n875#1:1174,3\n876#1:1177\n878#1:1178\n924#1:1179,14\n930#1:1193\n945#1:1197\n956#1:1198\n957#1:1199,6\n967#1:1205\n970#1:1206\n971#1:1207,6\n972#1:1213,6\n982#1:1219\n983#1:1220,6\n1022#1:1226\n1022#1:1227\n1025#1:1231\n1027#1:1232\n1027#1:1233\n1027#1:1234,6\n1027#1:1240\n1027#1:1241,4\n739#1:1047,4\n739#1:1051,6\n739#1:1058,3\n739#1:1062,9\n739#1:1071\n770#1:1072,6\n770#1:1079,3\n770#1:1083,9\n791#1:1092,4\n791#1:1096,7\n791#1:1104,3\n791#1:1108,9\n791#1:1117\n796#1:1118,6\n825#1:1142,3\n944#1:1194,3\n1024#1:1228,3\n*E\n"})
/* loaded from: classes.dex */
public final class MutableFloatIntMap extends FloatIntMap {
    private int growthLimit;

    public MutableFloatIntMap() {
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
        this.values = new int[max];
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
        int[] iArr = this.values;
        int i12 = (i11 + 7) >> 3;
        int i13 = 0;
        for (int i14 = 0; i14 < i12; i14++) {
            long j12 = jArr[i14] & (-9187201950435737472L);
            jArr[i14] = (-72340172838076674L) & ((~j12) + (j12 >>> 7));
        }
        int Ne = a0.Ne(jArr);
        int i15 = Ne - 1;
        long j13 = 72057594037927935L;
        jArr[i15] = (jArr[i15] & 72057594037927935L) | (-72057594037927936L);
        jArr[Ne] = jArr[0];
        int i16 = 0;
        while (i16 != i11) {
            int i17 = i16 >> 3;
            int i18 = (i16 & 7) << 3;
            long j14 = (jArr[i17] >> i18) & 255;
            if (j14 != 128 && j14 == 254) {
                int hashCode = Float.hashCode(fArr[i16]) * (-862048943);
                int i19 = (hashCode ^ (hashCode << 16)) >>> 7;
                int findFirstAvailableSlot = findFirstAvailableSlot(i19);
                int i21 = i19 & i11;
                int i22 = i13;
                if (((findFirstAvailableSlot - i21) & i11) / 8 == ((i16 - i21) & i11) / 8) {
                    jArr[i17] = ((r8 & 127) << i18) | ((~(255 << i18)) & jArr[i17]);
                    jArr[a0.Ne(jArr)] = (jArr[i22] & j13) | Long.MIN_VALUE;
                    i16++;
                    i13 = i22;
                } else {
                    int i23 = findFirstAvailableSlot >> 3;
                    long j15 = jArr[i23];
                    int i24 = (findFirstAvailableSlot & 7) << 3;
                    if (((j15 >> i24) & 255) == 128) {
                        j11 = j13;
                        jArr[i23] = ((r8 & 127) << i24) | (j15 & (~(255 << i24)));
                        jArr[i17] = (jArr[i17] & (~(255 << i18))) | (128 << i18);
                        fArr[findFirstAvailableSlot] = fArr[i16];
                        fArr[i16] = 0.0f;
                        iArr[findFirstAvailableSlot] = iArr[i16];
                        iArr[i16] = i22;
                    } else {
                        j11 = j13;
                        jArr[i23] = ((r8 & 127) << i24) | (j15 & (~(255 << i24)));
                        float f11 = fArr[findFirstAvailableSlot];
                        fArr[findFirstAvailableSlot] = fArr[i16];
                        fArr[i16] = f11;
                        int i25 = iArr[findFirstAvailableSlot];
                        iArr[findFirstAvailableSlot] = iArr[i16];
                        iArr[i16] = i25;
                        i16--;
                    }
                    jArr[a0.Ne(jArr)] = (jArr[i22] & j11) | Long.MIN_VALUE;
                    i16++;
                    i13 = i22;
                    j13 = j11;
                }
            } else {
                i16++;
            }
        }
        initializeGrowth();
    }

    public final int getOrPut(float f11, @k x00.a<Integer> defaultValue) {
        g0.p(defaultValue, "defaultValue");
        int findKeyIndex = findKeyIndex(f11);
        if (findKeyIndex >= 0) {
            return this.values[findKeyIndex];
        }
        int intValue = defaultValue.invoke().intValue();
        put(f11, intValue);
        return intValue;
    }

    public final void minusAssign(float f11) {
        remove(f11);
    }

    public final void plusAssign(@k FloatIntMap from) {
        g0.p(from, "from");
        putAll(from);
    }

    public final void put(float f11, int i11) {
        set(f11, i11);
    }

    public final void putAll(@k FloatIntMap from) {
        g0.p(from, "from");
        float[] fArr = from.keys;
        int[] iArr = from.values;
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
                        set(fArr[i14], iArr[i14]);
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

    public final void removeIf(@k p<? super Float, ? super Integer, Boolean> predicate) {
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
                        if (predicate.invoke(Float.valueOf(this.keys[i14]), Integer.valueOf(this.values[i14])).booleanValue()) {
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
        MutableFloatIntMap mutableFloatIntMap = this;
        long[] jArr2 = mutableFloatIntMap.metadata;
        float[] fArr = mutableFloatIntMap.keys;
        int[] iArr = mutableFloatIntMap.values;
        int i12 = mutableFloatIntMap._capacity;
        initializeStorage(i11);
        long[] jArr3 = mutableFloatIntMap.metadata;
        float[] fArr2 = mutableFloatIntMap.keys;
        int[] iArr2 = mutableFloatIntMap.values;
        int i13 = mutableFloatIntMap._capacity;
        int i14 = 0;
        while (i14 < i12) {
            if (((jArr2[i14 >> 3] >> ((i14 & 7) << 3)) & 255) < 128) {
                float f11 = fArr[i14];
                int hashCode = Float.hashCode(f11) * (-862048943);
                int i15 = hashCode ^ (hashCode << 16);
                int findFirstAvailableSlot = mutableFloatIntMap.findFirstAvailableSlot(i15 >>> 7);
                long j11 = i15 & 127;
                int i16 = findFirstAvailableSlot >> 3;
                int i17 = (findFirstAvailableSlot & 7) << 3;
                jArr = jArr2;
                long j12 = (jArr3[i16] & (~(255 << i17))) | (j11 << i17);
                jArr3[i16] = j12;
                jArr3[(((findFirstAvailableSlot - 7) & i13) + (i13 & 7)) >> 3] = j12;
                fArr2[findFirstAvailableSlot] = f11;
                iArr2[findFirstAvailableSlot] = iArr[i14];
            } else {
                jArr = jArr2;
            }
            i14++;
            mutableFloatIntMap = this;
            jArr2 = jArr;
        }
    }

    public final void set(float f11, int i11) {
        int findInsertIndex = findInsertIndex(f11);
        if (findInsertIndex < 0) {
            findInsertIndex = ~findInsertIndex;
        }
        this.keys[findInsertIndex] = f11;
        this.values[findInsertIndex] = i11;
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

    public MutableFloatIntMap(int i11) {
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

    public final int put(float f11, int i11, int i12) {
        int findInsertIndex = findInsertIndex(f11);
        if (findInsertIndex < 0) {
            findInsertIndex = ~findInsertIndex;
        } else {
            i12 = this.values[findInsertIndex];
        }
        this.keys[findInsertIndex] = f11;
        this.values[findInsertIndex] = i11;
        return i12;
    }

    public final boolean remove(float f11, int i11) {
        int findKeyIndex = findKeyIndex(f11);
        if (findKeyIndex < 0 || this.values[findKeyIndex] != i11) {
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

    public /* synthetic */ MutableFloatIntMap(int i11, int i12, v vVar) {
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

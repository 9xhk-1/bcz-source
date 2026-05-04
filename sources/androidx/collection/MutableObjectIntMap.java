package androidx.collection;

import a00.a0;
import a00.q;
import androidx.collection.internal.RuntimeHelpersKt;
import java.util.Iterator;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import q30.m;
import x00.p;
import yz.v0;
import yz.w1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nObjectIntMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObjectIntMap.kt\nandroidx/collection/MutableObjectIntMap\n+ 2 RuntimeHelpers.kt\nandroidx/collection/internal/RuntimeHelpersKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 5 ObjectIntMap.kt\nandroidx/collection/ObjectIntMap\n+ 6 ScatterSet.kt\nandroidx/collection/ScatterSet\n*L\n1#1,1051:1\n59#2,5:1052\n1#3:1057\n1254#4,6:1058\n1399#4:1074\n1270#4:1078\n1399#4:1095\n1270#4:1099\n1399#4:1119\n1270#4:1123\n1230#4:1134\n1254#4,6:1135\n1242#4:1141\n1241#4,4:1142\n1254#4,6:1146\n1165#4,3:1152\n1175#4:1155\n1179#4:1156\n1372#4,3:1157\n1386#4,3:1160\n1312#4:1163\n1303#4:1164\n1297#4:1165\n1309#4:1166\n1393#4:1167\n1265#4:1168\n1220#4:1169\n1262#4:1170\n1220#4:1171\n1230#4:1172\n1254#4,6:1173\n1242#4:1179\n1241#4,4:1180\n1372#4,3:1184\n1399#4:1187\n1297#4:1188\n1144#4,14:1189\n1220#4:1203\n1165#4,3:1204\n1175#4:1207\n1179#4:1208\n1254#4,6:1209\n1220#4:1215\n1179#4:1216\n1254#4,6:1217\n1254#4,6:1223\n1179#4:1229\n1254#4,6:1230\n1268#4:1236\n1220#4:1237\n1165#4,3:1238\n1175#4:1241\n1179#4:1242\n1230#4:1243\n1254#4,6:1244\n1242#4:1250\n1241#4,4:1251\n395#5,4:1064\n367#5,6:1068\n377#5,3:1075\n380#5,9:1079\n399#5:1088\n367#5,6:1089\n377#5,3:1096\n380#5,9:1100\n231#6,3:1109\n200#6,7:1112\n211#6,3:1120\n214#6,9:1124\n234#6:1133\n*S KotlinDebug\n*F\n+ 1 ObjectIntMap.kt\nandroidx/collection/MutableObjectIntMap\n*L\n647#1:1052,5\n675#1:1058,6\n744#1:1074\n744#1:1078\n775#1:1095\n775#1:1099\n811#1:1119\n811#1:1123\n820#1:1134\n820#1:1135,6\n820#1:1141\n820#1:1142,4\n829#1:1146,6\n842#1:1152,3\n843#1:1155\n844#1:1156\n851#1:1157,3\n852#1:1160,3\n853#1:1163\n854#1:1164\n854#1:1165\n858#1:1166\n861#1:1167\n870#1:1168\n870#1:1169\n876#1:1170\n876#1:1171\n877#1:1172\n877#1:1173,6\n877#1:1179\n877#1:1180,4\n892#1:1184,3\n893#1:1187\n895#1:1188\n941#1:1189,14\n947#1:1203\n961#1:1204,3\n962#1:1207\n973#1:1208\n974#1:1209,6\n984#1:1215\n987#1:1216\n988#1:1217,6\n989#1:1223,6\n999#1:1229\n1000#1:1230,6\n1039#1:1236\n1039#1:1237\n1041#1:1238,3\n1042#1:1241\n1044#1:1242\n1044#1:1243\n1044#1:1244,6\n1044#1:1250\n1044#1:1251,4\n744#1:1064,4\n744#1:1068,6\n744#1:1075,3\n744#1:1079,9\n744#1:1088\n775#1:1089,6\n775#1:1096,3\n775#1:1100,9\n811#1:1109,3\n811#1:1112,7\n811#1:1120,3\n811#1:1124,9\n811#1:1133\n*E\n"})
/* loaded from: classes.dex */
public final class MutableObjectIntMap<K> extends ObjectIntMap<K> {
    private int growthLimit;

    public MutableObjectIntMap() {
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

    private final int findIndex(K k11) {
        int hashCode = (k11 != null ? k11.hashCode() : 0) * (-862048943);
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
            int i19 = i13;
            long j13 = j11 ^ (j12 * ScatterMapKt.BitmaskLsb);
            for (long j14 = (~j13) & (j13 - ScatterMapKt.BitmaskLsb) & (-9187201950435737472L); j14 != 0; j14 &= j14 - 1) {
                int numberOfTrailingZeros = (i15 + (Long.numberOfTrailingZeros(j14) >> 3)) & i14;
                if (g0.g(this.keys[numberOfTrailingZeros], k11)) {
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
            i16 += 8;
            i15 = (i15 + i16) & i14;
            i13 = i19;
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
        this.keys = new Object[max];
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
        q.M1(this.keys, null, 0, this._capacity);
        initializeGrowth();
    }

    public final void dropDeletes$collection() {
        long j11;
        long[] jArr = this.metadata;
        int i11 = this._capacity;
        Object[] objArr = this.keys;
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
                Object obj = objArr[i16];
                int hashCode = (obj != null ? obj.hashCode() : i13) * (-862048943);
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
                        objArr[findFirstAvailableSlot] = objArr[i16];
                        objArr[i16] = null;
                        iArr[findFirstAvailableSlot] = iArr[i16];
                        iArr[i16] = i22;
                    } else {
                        j11 = j13;
                        jArr[i23] = ((r8 & 127) << i24) | (j15 & (~(255 << i24)));
                        Object obj2 = objArr[findFirstAvailableSlot];
                        objArr[findFirstAvailableSlot] = objArr[i16];
                        objArr[i16] = obj2;
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

    public final int getOrPut(K k11, @k x00.a<Integer> defaultValue) {
        g0.p(defaultValue, "defaultValue");
        int findKeyIndex = findKeyIndex(k11);
        if (findKeyIndex >= 0) {
            return this.values[findKeyIndex];
        }
        int intValue = defaultValue.invoke().intValue();
        set(k11, intValue);
        return intValue;
    }

    public final void minusAssign(K k11) {
        remove(k11);
    }

    public final void plusAssign(@k ObjectIntMap<K> from) {
        g0.p(from, "from");
        putAll(from);
    }

    public final void put(K k11, int i11) {
        set(k11, i11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void putAll(@k ObjectIntMap<K> from) {
        g0.p(from, "from");
        Object[] objArr = from.keys;
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
                        set(objArr[i14], iArr[i14]);
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

    public final void remove(K k11) {
        int findKeyIndex = findKeyIndex(k11);
        if (findKeyIndex >= 0) {
            removeValueAt(findKeyIndex);
        }
    }

    public final void removeIf(@k p<? super K, ? super Integer, Boolean> predicate) {
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
                        if (predicate.invoke(this.keys[i14], Integer.valueOf(this.values[i14])).booleanValue()) {
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
        this.keys[i11] = null;
    }

    public final void resizeStorage$collection(int i11) {
        int i12;
        long[] jArr = this.metadata;
        Object[] objArr = this.keys;
        int[] iArr = this.values;
        int i13 = this._capacity;
        initializeStorage(i11);
        long[] jArr2 = this.metadata;
        Object[] objArr2 = this.keys;
        int[] iArr2 = this.values;
        int i14 = this._capacity;
        int i15 = 0;
        while (i15 < i13) {
            if (((jArr[i15 >> 3] >> ((i15 & 7) << 3)) & 255) < 128) {
                Object obj = objArr[i15];
                int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
                int i16 = hashCode ^ (hashCode << 16);
                int findFirstAvailableSlot = findFirstAvailableSlot(i16 >>> 7);
                i12 = i15;
                long j11 = i16 & 127;
                int i17 = findFirstAvailableSlot >> 3;
                int i18 = (findFirstAvailableSlot & 7) << 3;
                long j12 = (j11 << i18) | (jArr2[i17] & (~(255 << i18)));
                jArr2[i17] = j12;
                jArr2[(((findFirstAvailableSlot - 7) & i14) + (i14 & 7)) >> 3] = j12;
                objArr2[findFirstAvailableSlot] = obj;
                iArr2[findFirstAvailableSlot] = iArr[i12];
            } else {
                i12 = i15;
            }
            i15 = i12 + 1;
        }
    }

    public final void set(K k11, int i11) {
        int findIndex = findIndex(k11);
        if (findIndex < 0) {
            findIndex = ~findIndex;
        }
        this.keys[findIndex] = k11;
        this.values[findIndex] = i11;
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

    public /* synthetic */ MutableObjectIntMap(int i11, int i12, v vVar) {
        this((i12 & 1) != 0 ? 6 : i11);
    }

    public final void minusAssign(@k K[] keys) {
        g0.p(keys, "keys");
        for (K k11 : keys) {
            remove(k11);
        }
    }

    public final int put(K k11, int i11, int i12) {
        int findIndex = findIndex(k11);
        if (findIndex < 0) {
            findIndex = ~findIndex;
        } else {
            i12 = this.values[findIndex];
        }
        this.keys[findIndex] = k11;
        this.values[findIndex] = i11;
        return i12;
    }

    public MutableObjectIntMap(int i11) {
        super(null);
        if (!(i11 >= 0)) {
            RuntimeHelpersKt.throwIllegalArgumentException("Capacity must be a positive value.");
        }
        initializeStorage(ScatterMapKt.unloadedCapacity(i11));
    }

    public final boolean remove(K k11, int i11) {
        int findKeyIndex = findKeyIndex(k11);
        if (findKeyIndex < 0 || this.values[findKeyIndex] != i11) {
            return false;
        }
        removeValueAt(findKeyIndex);
        return true;
    }

    public final void minusAssign(@k Iterable<? extends K> keys) {
        g0.p(keys, "keys");
        Iterator<? extends K> it = keys.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    public final void minusAssign(@k m<? extends K> keys) {
        g0.p(keys, "keys");
        Iterator<? extends K> it = keys.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(@k ScatterSet<K> keys) {
        g0.p(keys, "keys");
        Object[] objArr = keys.elements;
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
                        remove(objArr[(i11 << 3) + i13]);
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
}

package androidx.collection;

import androidx.collection.internal.RuntimeHelpersKt;
import com.huawei.hms.framework.common.ContainerUtils;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import l50.b;
import m80.k;
import m80.l;
import org.junit.jupiter.api.j2;
import w00.g;
import x00.p;
import yz.g2;
import yz.v0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nFloatIntMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatIntMap.kt\nandroidx/collection/FloatIntMap\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 3 FloatSet.kt\nandroidx/collection/FloatSetKt\n*L\n1#1,1034:1\n359#1,6:1037\n369#1,3:1044\n372#1,9:1048\n359#1,6:1057\n369#1,3:1064\n372#1,9:1068\n359#1,6:1077\n369#1,3:1084\n372#1,9:1088\n387#1,4:1097\n359#1,6:1101\n369#1,3:1108\n372#1,9:1112\n391#1:1121\n387#1,4:1122\n359#1,6:1126\n369#1,3:1133\n372#1,9:1137\n391#1:1146\n387#1,4:1147\n359#1,6:1151\n369#1,3:1158\n372#1,9:1162\n391#1:1171\n402#1,3:1172\n359#1,6:1175\n369#1,3:1182\n372#1,9:1186\n405#1:1195\n387#1,4:1196\n359#1,6:1200\n369#1,3:1207\n372#1,9:1211\n391#1:1220\n387#1,4:1221\n359#1,6:1225\n369#1,3:1232\n372#1,9:1236\n391#1:1245\n387#1,4:1246\n359#1,6:1250\n369#1,3:1257\n372#1,9:1261\n391#1:1270\n387#1,4:1271\n359#1,6:1275\n369#1,3:1282\n372#1,9:1286\n391#1:1295\n387#1,4:1296\n359#1,6:1300\n369#1,3:1307\n372#1,9:1311\n391#1:1320\n387#1,4:1321\n359#1,6:1325\n369#1,3:1332\n372#1,9:1336\n391#1:1345\n484#1,11:1362\n387#1,4:1373\n359#1,6:1377\n369#1,3:1384\n372#1,2:1388\n495#1,10:1390\n375#1,6:1400\n391#1:1406\n505#1,2:1407\n484#1,11:1409\n387#1,4:1420\n359#1,6:1424\n369#1,3:1431\n372#1,2:1435\n495#1,10:1437\n375#1,6:1447\n391#1:1453\n505#1,2:1454\n484#1,11:1456\n387#1,4:1467\n359#1,6:1471\n369#1,3:1478\n372#1,2:1482\n495#1,10:1484\n375#1,6:1494\n391#1:1500\n505#1,2:1501\n484#1,11:1503\n387#1,4:1514\n359#1,6:1518\n369#1,3:1525\n372#1,2:1529\n495#1,10:1531\n375#1,6:1541\n391#1:1547\n505#1,2:1548\n484#1,11:1550\n387#1,4:1561\n359#1,6:1565\n369#1,3:1572\n372#1,2:1576\n495#1,10:1578\n375#1,6:1588\n391#1:1594\n505#1,2:1595\n1399#2:1035\n1270#2:1036\n1399#2:1043\n1270#2:1047\n1399#2:1063\n1270#2:1067\n1399#2:1083\n1270#2:1087\n1399#2:1107\n1270#2:1111\n1399#2:1132\n1270#2:1136\n1399#2:1157\n1270#2:1161\n1399#2:1181\n1270#2:1185\n1399#2:1206\n1270#2:1210\n1399#2:1231\n1270#2:1235\n1399#2:1256\n1270#2:1260\n1399#2:1281\n1270#2:1285\n1399#2:1306\n1270#2:1310\n1399#2:1331\n1270#2:1335\n1179#2:1349\n1175#2:1350\n1372#2,3:1351\n1386#2,3:1354\n1312#2:1357\n1303#2:1358\n1297#2:1359\n1309#2:1360\n1393#2:1361\n1399#2:1383\n1270#2:1387\n1399#2:1430\n1270#2:1434\n1399#2:1477\n1270#2:1481\n1399#2:1524\n1270#2:1528\n1399#2:1571\n1270#2:1575\n882#3,3:1346\n*S KotlinDebug\n*F\n+ 1 FloatIntMap.kt\nandroidx/collection/FloatIntMap\n*L\n390#1:1037,6\n390#1:1044,3\n390#1:1048,9\n397#1:1057,6\n397#1:1064,3\n397#1:1068,9\n404#1:1077,6\n404#1:1084,3\n404#1:1088,9\n409#1:1097,4\n409#1:1101,6\n409#1:1108,3\n409#1:1112,9\n409#1:1121\n415#1:1122,4\n415#1:1126,6\n415#1:1133,3\n415#1:1137,9\n415#1:1146\n425#1:1147,4\n425#1:1151,6\n425#1:1158,3\n425#1:1162,9\n425#1:1171\n437#1:1172,3\n437#1:1175,6\n437#1:1182,3\n437#1:1186,9\n437#1:1195\n459#1:1196,4\n459#1:1200,6\n459#1:1207,3\n459#1:1211,9\n459#1:1220\n494#1:1221,4\n494#1:1225,6\n494#1:1232,3\n494#1:1236,9\n494#1:1245\n494#1:1246,4\n494#1:1250,6\n494#1:1257,3\n494#1:1261,9\n494#1:1270\n515#1:1271,4\n515#1:1275,6\n515#1:1282,3\n515#1:1286,9\n515#1:1295\n539#1:1296,4\n539#1:1300,6\n539#1:1307,3\n539#1:1311,9\n539#1:1320\n561#1:1321,4\n561#1:1325,6\n561#1:1332,3\n561#1:1336,9\n561#1:1345\n-1#1:1362,11\n-1#1:1373,4\n-1#1:1377,6\n-1#1:1384,3\n-1#1:1388,2\n-1#1:1390,10\n-1#1:1400,6\n-1#1:1406\n-1#1:1407,2\n-1#1:1409,11\n-1#1:1420,4\n-1#1:1424,6\n-1#1:1431,3\n-1#1:1435,2\n-1#1:1437,10\n-1#1:1447,6\n-1#1:1453\n-1#1:1454,2\n-1#1:1456,11\n-1#1:1467,4\n-1#1:1471,6\n-1#1:1478,3\n-1#1:1482,2\n-1#1:1484,10\n-1#1:1494,6\n-1#1:1500\n-1#1:1501,2\n-1#1:1503,11\n-1#1:1514,4\n-1#1:1518,6\n-1#1:1525,3\n-1#1:1529,2\n-1#1:1531,10\n-1#1:1541,6\n-1#1:1547\n-1#1:1548,2\n-1#1:1550,11\n-1#1:1561,4\n-1#1:1565,6\n-1#1:1572,3\n-1#1:1576,2\n-1#1:1578,10\n-1#1:1588,6\n-1#1:1594\n-1#1:1595,2\n364#1:1035\n371#1:1036\n390#1:1043\n390#1:1047\n397#1:1063\n397#1:1067\n404#1:1083\n404#1:1087\n409#1:1107\n409#1:1111\n415#1:1132\n415#1:1136\n425#1:1157\n425#1:1161\n437#1:1181\n437#1:1185\n459#1:1206\n459#1:1210\n494#1:1231\n494#1:1235\n494#1:1256\n494#1:1260\n515#1:1281\n515#1:1285\n539#1:1306\n539#1:1310\n561#1:1331\n561#1:1335\n581#1:1349\n584#1:1350\n588#1:1351,3\n589#1:1354,3\n590#1:1357\n591#1:1358\n591#1:1359\n595#1:1360\n598#1:1361\n-1#1:1383\n-1#1:1387\n-1#1:1430\n-1#1:1434\n-1#1:1477\n-1#1:1481\n-1#1:1524\n-1#1:1528\n-1#1:1571\n-1#1:1575\n580#1:1346,3\n*E\n"})
/* loaded from: classes.dex */
public abstract class FloatIntMap {

    @g
    public int _capacity;

    @g
    public int _size;

    @g
    @k
    public float[] keys;

    @g
    @k
    public long[] metadata;

    @g
    @k
    public int[] values;

    public /* synthetic */ FloatIntMap(v vVar) {
        this();
    }

    public static /* synthetic */ String joinToString$default(FloatIntMap floatIntMap, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i11, CharSequence charSequence4, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        if ((i12 & 1) != 0) {
            charSequence = j2.O;
        }
        if ((i12 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i12 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i12 & 8) != 0) {
            i11 = -1;
        }
        if ((i12 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence5 = charSequence4;
        CharSequence charSequence6 = charSequence3;
        return floatIntMap.joinToString(charSequence, charSequence2, charSequence6, i11, charSequence5);
    }

    public final boolean all(@k p<? super Float, ? super Integer, Boolean> predicate) {
        g0.p(predicate, "predicate");
        float[] fArr = this.keys;
        int[] iArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i11 = 0;
        while (true) {
            long j11 = jArr[i11];
            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i11 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((255 & j11) < 128) {
                        int i14 = (i11 << 3) + i13;
                        if (!predicate.invoke(Float.valueOf(fArr[i14]), Integer.valueOf(iArr[i14])).booleanValue()) {
                            return false;
                        }
                    }
                    j11 >>= 8;
                }
                if (i12 != 8) {
                    return true;
                }
            }
            if (i11 == length) {
                return true;
            }
            i11++;
        }
    }

    public final boolean any() {
        return this._size != 0;
    }

    public final boolean contains(float f11) {
        return containsKey(f11);
    }

    public final boolean containsKey(float f11) {
        return findKeyIndex(f11) >= 0;
    }

    public final boolean containsValue(int i11) {
        int[] iArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i12 = 0;
            while (true) {
                long j11 = jArr[i12];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i13 = 8 - ((~(i12 - length)) >>> 31);
                    for (int i14 = 0; i14 < i13; i14++) {
                        if ((255 & j11) < 128 && i11 == iArr[(i12 << 3) + i14]) {
                            return true;
                        }
                        j11 >>= 8;
                    }
                    if (i13 != 8) {
                        break;
                    }
                }
                if (i12 == length) {
                    break;
                }
                i12++;
            }
        }
        return false;
    }

    public final int count() {
        return getSize();
    }

    public boolean equals(@l Object obj) {
        boolean z11;
        boolean z12;
        boolean z13 = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FloatIntMap)) {
            return false;
        }
        FloatIntMap floatIntMap = (FloatIntMap) obj;
        if (floatIntMap.getSize() != getSize()) {
            return false;
        }
        float[] fArr = this.keys;
        int[] iArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i11 = 0;
        loop0: while (true) {
            long j11 = jArr[i11];
            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i11 - length)) >>> 31);
                int i13 = 0;
                while (i13 < i12) {
                    if ((255 & j11) < 128) {
                        int i14 = (i11 << 3) + i13;
                        float f11 = fArr[i14];
                        int i15 = iArr[i14];
                        int findKeyIndex = floatIntMap.findKeyIndex(f11);
                        if (findKeyIndex < 0) {
                            break loop0;
                        }
                        z12 = z13;
                        if (i15 != floatIntMap.values[findKeyIndex]) {
                            break loop0;
                        }
                    } else {
                        z12 = z13;
                    }
                    j11 >>= 8;
                    i13++;
                    z13 = z12;
                }
                z11 = z13;
                if (i12 != 8) {
                    return z11;
                }
            } else {
                z11 = z13;
            }
            if (i11 == length) {
                return z11;
            }
            i11++;
            z13 = z11;
        }
        return false;
    }

    @v0
    public final int findKeyIndex(float f11) {
        int hashCode = Float.hashCode(f11) * (-862048943);
        int i11 = hashCode ^ (hashCode << 16);
        int i12 = i11 & 127;
        int i13 = this._capacity;
        int i14 = (i11 >>> 7) & i13;
        int i15 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j11 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j12 = (i12 * ScatterMapKt.BitmaskLsb) ^ j11;
            for (long j13 = (~j12) & (j12 - ScatterMapKt.BitmaskLsb) & (-9187201950435737472L); j13 != 0; j13 &= j13 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j13) >> 3) + i14) & i13;
                if (this.keys[numberOfTrailingZeros] == f11) {
                    return numberOfTrailingZeros;
                }
            }
            if ((j11 & ((~j11) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
        }
    }

    public final void forEach(@k p<? super Float, ? super Integer, g2> block) {
        g0.p(block, "block");
        float[] fArr = this.keys;
        int[] iArr = this.values;
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
                        block.invoke(Float.valueOf(fArr[i14]), Integer.valueOf(iArr[i14]));
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
    public final void forEachIndexed(@k x00.l<? super Integer, g2> block) {
        g0.p(block, "block");
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
                        block.invoke(Integer.valueOf((i11 << 3) + i13));
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

    public final void forEachKey(@k x00.l<? super Float, g2> block) {
        g0.p(block, "block");
        float[] fArr = this.keys;
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
                        block.invoke(Float.valueOf(fArr[(i11 << 3) + i13]));
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

    public final void forEachValue(@k x00.l<? super Integer, g2> block) {
        g0.p(block, "block");
        int[] iArr = this.values;
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
                        block.invoke(Integer.valueOf(iArr[(i11 << 3) + i13]));
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

    public final int get(float f11) {
        int findKeyIndex = findKeyIndex(f11);
        if (findKeyIndex < 0) {
            RuntimeHelpersKt.throwNoSuchElementException("Cannot find value for key " + f11);
        }
        return this.values[findKeyIndex];
    }

    public final int getCapacity() {
        return this._capacity;
    }

    public final int getOrDefault(float f11, int i11) {
        int findKeyIndex = findKeyIndex(f11);
        return findKeyIndex >= 0 ? this.values[findKeyIndex] : i11;
    }

    public final int getOrElse(float f11, @k x00.a<Integer> defaultValue) {
        g0.p(defaultValue, "defaultValue");
        int findKeyIndex = findKeyIndex(f11);
        return findKeyIndex < 0 ? defaultValue.invoke().intValue() : this.values[findKeyIndex];
    }

    public final int getSize() {
        return this._size;
    }

    public int hashCode() {
        float[] fArr = this.keys;
        int[] iArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i11 = 0;
        int i12 = 0;
        while (true) {
            long j11 = jArr[i11];
            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i13 = 8 - ((~(i11 - length)) >>> 31);
                for (int i14 = 0; i14 < i13; i14++) {
                    if ((255 & j11) < 128) {
                        int i15 = (i11 << 3) + i14;
                        float f11 = fArr[i15];
                        i12 += Integer.hashCode(iArr[i15]) ^ Float.hashCode(f11);
                    }
                    j11 >>= 8;
                }
                if (i13 != 8) {
                    return i12;
                }
            }
            if (i11 == length) {
                return i12;
            }
            i11++;
        }
    }

    public final boolean isEmpty() {
        return this._size == 0;
    }

    public final boolean isNotEmpty() {
        return this._size != 0;
    }

    @w00.k
    @k
    public final String joinToString() {
        return joinToString$default(this, null, null, null, 0, null, 31, null);
    }

    public final boolean none() {
        return this._size == 0;
    }

    @k
    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(b.f69927i);
        float[] fArr = this.keys;
        int[] iArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            int i12 = 0;
            while (true) {
                long j11 = jArr[i11];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i13 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i14 = 0; i14 < i13; i14++) {
                        if ((255 & j11) < 128) {
                            int i15 = (i11 << 3) + i14;
                            float f11 = fArr[i15];
                            int i16 = iArr[i15];
                            sb2.append(f11);
                            sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
                            sb2.append(i16);
                            i12++;
                            if (i12 < this._size) {
                                sb2.append(',');
                                sb2.append(' ');
                            }
                        }
                        j11 >>= 8;
                    }
                    if (i13 != 8) {
                        break;
                    }
                }
                if (i11 == length) {
                    break;
                }
                i11++;
            }
        }
        sb2.append(b.f69928j);
        String sb3 = sb2.toString();
        g0.o(sb3, "toString(...)");
        return sb3;
    }

    private FloatIntMap() {
        this.metadata = ScatterMapKt.EmptyGroup;
        this.keys = FloatSetKt.getEmptyFloatArray();
        this.values = IntSetKt.getEmptyIntArray();
    }

    public final boolean any(@k p<? super Float, ? super Integer, Boolean> predicate) {
        g0.p(predicate, "predicate");
        float[] fArr = this.keys;
        int[] iArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j11 = jArr[i11];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j11) < 128) {
                            int i14 = (i11 << 3) + i13;
                            if (predicate.invoke(Float.valueOf(fArr[i14]), Integer.valueOf(iArr[i14])).booleanValue()) {
                                return true;
                            }
                        }
                        j11 >>= 8;
                    }
                    if (i12 != 8) {
                        break;
                    }
                }
                if (i11 == length) {
                    break;
                }
                i11++;
            }
        }
        return false;
    }

    public final int count(@k p<? super Float, ? super Integer, Boolean> predicate) {
        g0.p(predicate, "predicate");
        float[] fArr = this.keys;
        int[] iArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i11 = 0;
        int i12 = 0;
        while (true) {
            long j11 = jArr[i11];
            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i13 = 8 - ((~(i11 - length)) >>> 31);
                for (int i14 = 0; i14 < i13; i14++) {
                    if ((255 & j11) < 128) {
                        int i15 = (i11 << 3) + i14;
                        if (predicate.invoke(Float.valueOf(fArr[i15]), Integer.valueOf(iArr[i15])).booleanValue()) {
                            i12++;
                        }
                    }
                    j11 >>= 8;
                }
                if (i13 != 8) {
                    return i12;
                }
            }
            if (i11 == length) {
                return i12;
            }
            i11++;
        }
    }

    @w00.k
    @k
    public final String joinToString(@k CharSequence separator) {
        g0.p(separator, "separator");
        return joinToString$default(this, separator, null, null, 0, null, 30, null);
    }

    @w00.k
    @k
    public final String joinToString(@k CharSequence separator, @k CharSequence prefix) {
        g0.p(separator, "separator");
        g0.p(prefix, "prefix");
        return joinToString$default(this, separator, prefix, null, 0, null, 28, null);
    }

    @w00.k
    @k
    public final String joinToString(@k CharSequence separator, @k CharSequence prefix, @k CharSequence postfix) {
        g0.p(separator, "separator");
        g0.p(prefix, "prefix");
        g0.p(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, 0, null, 24, null);
    }

    public static /* synthetic */ String joinToString$default(FloatIntMap floatIntMap, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i11, CharSequence charSequence4, p transform, int i12, Object obj) {
        long[] jArr;
        long[] jArr2;
        int i13;
        if (obj == null) {
            CharSequence separator = (i12 & 1) != 0 ? j2.O : charSequence;
            CharSequence prefix = (i12 & 2) != 0 ? "" : charSequence2;
            CharSequence postfix = (i12 & 4) == 0 ? charSequence3 : "";
            int i14 = (i12 & 8) != 0 ? -1 : i11;
            CharSequence truncated = (i12 & 16) != 0 ? "..." : charSequence4;
            g0.p(separator, "separator");
            g0.p(prefix, "prefix");
            g0.p(postfix, "postfix");
            g0.p(truncated, "truncated");
            g0.p(transform, "transform");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(prefix);
            float[] fArr = floatIntMap.keys;
            int[] iArr = floatIntMap.values;
            long[] jArr3 = floatIntMap.metadata;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i15 = 0;
                int i16 = 0;
                loop0: while (true) {
                    long j11 = jArr3[i15];
                    int i17 = i15;
                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i18 = 8;
                        int i19 = 8 - ((~(i17 - length)) >>> 31);
                        int i21 = 0;
                        while (i21 < i19) {
                            if ((j11 & 255) < 128) {
                                int i22 = (i17 << 3) + i21;
                                float f11 = fArr[i22];
                                int i23 = iArr[i22];
                                if (i16 == i14) {
                                    sb2.append(truncated);
                                    break loop0;
                                }
                                if (i16 != 0) {
                                    sb2.append(separator);
                                }
                                i13 = i18;
                                Float valueOf = Float.valueOf(f11);
                                jArr2 = jArr3;
                                sb2.append((CharSequence) transform.invoke(valueOf, Integer.valueOf(i23)));
                                i16++;
                            } else {
                                jArr2 = jArr3;
                                i13 = i18;
                            }
                            j11 >>= i13;
                            i21++;
                            i18 = i13;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        if (i19 != i18) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                    }
                    if (i17 == length) {
                        break;
                    }
                    i15 = i17 + 1;
                    jArr3 = jArr;
                }
                String sb3 = sb2.toString();
                g0.o(sb3, "toString(...)");
                return sb3;
            }
            sb2.append(postfix);
            String sb32 = sb2.toString();
            g0.o(sb32, "toString(...)");
            return sb32;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
    }

    @w00.k
    @k
    public final String joinToString(@k CharSequence separator, @k CharSequence prefix, @k CharSequence postfix, int i11) {
        g0.p(separator, "separator");
        g0.p(prefix, "prefix");
        g0.p(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, i11, null, 16, null);
    }

    @w00.k
    @k
    public final String joinToString(@k CharSequence separator, @k CharSequence prefix, @k CharSequence postfix, int i11, @k CharSequence truncated) {
        float[] fArr;
        float[] fArr2;
        int i12;
        g0.p(separator, "separator");
        g0.p(prefix, "prefix");
        g0.p(postfix, "postfix");
        g0.p(truncated, "truncated");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        float[] fArr3 = this.keys;
        int[] iArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i13 = 0;
            int i14 = 0;
            loop0: while (true) {
                long j11 = jArr[i13];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i15 = 8;
                    int i16 = 8 - ((~(i13 - length)) >>> 31);
                    int i17 = 0;
                    while (i17 < i16) {
                        if ((j11 & 255) < 128) {
                            int i18 = (i13 << 3) + i17;
                            i12 = i15;
                            float f11 = fArr3[i18];
                            int i19 = iArr[i18];
                            fArr2 = fArr3;
                            if (i14 == i11) {
                                sb2.append(truncated);
                                break loop0;
                            }
                            if (i14 != 0) {
                                sb2.append(separator);
                            }
                            sb2.append(f11);
                            sb2.append('=');
                            sb2.append(i19);
                            i14++;
                        } else {
                            fArr2 = fArr3;
                            i12 = i15;
                        }
                        j11 >>= i12;
                        i17++;
                        fArr3 = fArr2;
                        i15 = i12;
                    }
                    fArr = fArr3;
                    if (i16 != i15) {
                        break;
                    }
                } else {
                    fArr = fArr3;
                }
                if (i13 == length) {
                    break;
                }
                i13++;
                fArr3 = fArr;
            }
        }
        sb2.append(postfix);
        String sb3 = sb2.toString();
        g0.o(sb3, "toString(...)");
        return sb3;
    }

    @v0
    public static /* synthetic */ void getKeys$annotations() {
    }

    @v0
    public static /* synthetic */ void getMetadata$annotations() {
    }

    @v0
    public static /* synthetic */ void getValues$annotations() {
    }

    public static /* synthetic */ void get_capacity$collection$annotations() {
    }

    public static /* synthetic */ void get_size$collection$annotations() {
    }

    @w00.k
    @k
    public final String joinToString(@k CharSequence charSequence, @k CharSequence prefix, @k CharSequence postfix, int i11, @k CharSequence truncated, @k p<? super Float, ? super Integer, ? extends CharSequence> transform) {
        CharSequence separator = charSequence;
        g0.p(separator, "separator");
        g0.p(prefix, "prefix");
        g0.p(postfix, "postfix");
        g0.p(truncated, "truncated");
        g0.p(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        float[] fArr = this.keys;
        int[] iArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i12 = 0;
            int i13 = 0;
            loop0: while (true) {
                long j11 = jArr[i12];
                int i14 = i12;
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i15 = 8 - ((~(i14 - length)) >>> 31);
                    int i16 = 0;
                    while (i16 < i15) {
                        if ((j11 & 255) < 128) {
                            int i17 = (i14 << 3) + i16;
                            float f11 = fArr[i17];
                            int i18 = iArr[i17];
                            if (i13 == i11) {
                                sb2.append(truncated);
                                break loop0;
                            }
                            if (i13 != 0) {
                                sb2.append(separator);
                            }
                            sb2.append(transform.invoke(Float.valueOf(f11), Integer.valueOf(i18)));
                            i13++;
                        }
                        j11 >>= 8;
                        i16++;
                        separator = charSequence;
                    }
                    if (i15 != 8) {
                        break;
                    }
                }
                if (i14 == length) {
                    break;
                }
                i12 = i14 + 1;
                separator = charSequence;
            }
        }
        sb2.append(postfix);
        String sb3 = sb2.toString();
        g0.o(sb3, "toString(...)");
        return sb3;
    }

    @w00.k
    @k
    public final String joinToString(@k CharSequence charSequence, @k CharSequence prefix, @k CharSequence postfix, int i11, @k p<? super Float, ? super Integer, ? extends CharSequence> transform) {
        int i12;
        CharSequence separator = charSequence;
        g0.p(separator, "separator");
        g0.p(prefix, "prefix");
        g0.p(postfix, "postfix");
        g0.p(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        float[] fArr = this.keys;
        int[] iArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i13 = 0;
            int i14 = 0;
            loop0: while (true) {
                long j11 = jArr[i13];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i15 = 8;
                    int i16 = 8 - ((~(i13 - length)) >>> 31);
                    int i17 = 0;
                    while (i17 < i16) {
                        if ((j11 & 255) < 128) {
                            int i18 = (i13 << 3) + i17;
                            float f11 = fArr[i18];
                            int i19 = iArr[i18];
                            i12 = i15;
                            if (i14 == i11) {
                                sb2.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i14 != 0) {
                                sb2.append(separator);
                            }
                            sb2.append(transform.invoke(Float.valueOf(f11), Integer.valueOf(i19)));
                            i14++;
                        } else {
                            i12 = i15;
                        }
                        j11 >>= i12;
                        i17++;
                        separator = charSequence;
                        i15 = i12;
                    }
                    if (i16 != i15) {
                        break;
                    }
                }
                if (i13 == length) {
                    break;
                }
                i13++;
                separator = charSequence;
            }
        }
        sb2.append(postfix);
        String sb3 = sb2.toString();
        g0.o(sb3, "toString(...)");
        return sb3;
    }

    @w00.k
    @k
    public final String joinToString(@k CharSequence separator, @k CharSequence prefix, @k CharSequence postfix, @k p<? super Float, ? super Integer, ? extends CharSequence> transform) {
        int i11;
        g0.p(separator, "separator");
        g0.p(prefix, "prefix");
        g0.p(postfix, "postfix");
        g0.p(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        float[] fArr = this.keys;
        int[] iArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i12 = 0;
            int i13 = 0;
            loop0: while (true) {
                long j11 = jArr[i12];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i14 = 8;
                    int i15 = 8 - ((~(i12 - length)) >>> 31);
                    int i16 = 0;
                    while (i16 < i15) {
                        if ((j11 & 255) < 128) {
                            int i17 = (i12 << 3) + i16;
                            float f11 = fArr[i17];
                            int i18 = iArr[i17];
                            i11 = i14;
                            if (i13 == -1) {
                                sb2.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i13 != 0) {
                                sb2.append(separator);
                            }
                            sb2.append(transform.invoke(Float.valueOf(f11), Integer.valueOf(i18)));
                            i13++;
                        } else {
                            i11 = i14;
                        }
                        j11 >>= i11;
                        i16++;
                        i14 = i11;
                    }
                    if (i15 != i14) {
                        break;
                    }
                }
                if (i12 == length) {
                    break;
                }
                i12++;
            }
        }
        sb2.append(postfix);
        String sb3 = sb2.toString();
        g0.o(sb3, "toString(...)");
        return sb3;
    }

    @w00.k
    @k
    public final String joinToString(@k CharSequence separator, @k CharSequence prefix, @k p<? super Float, ? super Integer, ? extends CharSequence> transform) {
        int i11;
        g0.p(separator, "separator");
        g0.p(prefix, "prefix");
        g0.p(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        float[] fArr = this.keys;
        int[] iArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i12 = 0;
            int i13 = 0;
            loop0: while (true) {
                long j11 = jArr[i12];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i14 = 8;
                    int i15 = 8 - ((~(i12 - length)) >>> 31);
                    int i16 = 0;
                    while (i16 < i15) {
                        if ((j11 & 255) < 128) {
                            int i17 = (i12 << 3) + i16;
                            float f11 = fArr[i17];
                            int i18 = iArr[i17];
                            if (i13 == -1) {
                                sb2.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i13 != 0) {
                                sb2.append(separator);
                            }
                            Float valueOf = Float.valueOf(f11);
                            i11 = i14;
                            sb2.append(transform.invoke(valueOf, Integer.valueOf(i18)));
                            i13++;
                        } else {
                            i11 = i14;
                        }
                        j11 >>= i11;
                        i16++;
                        i14 = i11;
                    }
                    if (i15 != i14) {
                        break;
                    }
                }
                if (i12 == length) {
                    break;
                }
                i12++;
            }
            String sb3 = sb2.toString();
            g0.o(sb3, "toString(...)");
            return sb3;
        }
        sb2.append((CharSequence) "");
        String sb32 = sb2.toString();
        g0.o(sb32, "toString(...)");
        return sb32;
    }

    @w00.k
    @k
    public final String joinToString(@k CharSequence separator, @k p<? super Float, ? super Integer, ? extends CharSequence> transform) {
        int i11;
        g0.p(separator, "separator");
        g0.p(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        float[] fArr = this.keys;
        int[] iArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i12 = 0;
            int i13 = 0;
            loop0: while (true) {
                long j11 = jArr[i12];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i14 = 8;
                    int i15 = 8 - ((~(i12 - length)) >>> 31);
                    int i16 = 0;
                    while (i16 < i15) {
                        if ((j11 & 255) < 128) {
                            int i17 = (i12 << 3) + i16;
                            float f11 = fArr[i17];
                            int i18 = iArr[i17];
                            i11 = i14;
                            if (i13 == -1) {
                                sb2.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i13 != 0) {
                                sb2.append(separator);
                            }
                            sb2.append(transform.invoke(Float.valueOf(f11), Integer.valueOf(i18)));
                            i13++;
                        } else {
                            i11 = i14;
                        }
                        j11 >>= i11;
                        i16++;
                        i14 = i11;
                    }
                    if (i15 != i14) {
                        break;
                    }
                }
                if (i12 == length) {
                    break;
                }
                i12++;
            }
            String sb3 = sb2.toString();
            g0.o(sb3, "toString(...)");
            return sb3;
        }
        sb2.append((CharSequence) "");
        String sb32 = sb2.toString();
        g0.o(sb32, "toString(...)");
        return sb32;
    }

    @w00.k
    @k
    public final String joinToString(@k p<? super Float, ? super Integer, ? extends CharSequence> transform) {
        int i11;
        g0.p(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        float[] fArr = this.keys;
        int[] iArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i12 = 0;
            int i13 = 0;
            loop0: while (true) {
                long j11 = jArr[i12];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i14 = 8;
                    int i15 = 8 - ((~(i12 - length)) >>> 31);
                    int i16 = 0;
                    while (i16 < i15) {
                        if ((j11 & 255) < 128) {
                            int i17 = (i12 << 3) + i16;
                            float f11 = fArr[i17];
                            int i18 = iArr[i17];
                            if (i13 == -1) {
                                sb2.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i13 != 0) {
                                sb2.append((CharSequence) j2.O);
                            }
                            Float valueOf = Float.valueOf(f11);
                            i11 = i14;
                            sb2.append(transform.invoke(valueOf, Integer.valueOf(i18)));
                            i13++;
                        } else {
                            i11 = i14;
                        }
                        j11 >>= i11;
                        i16++;
                        i14 = i11;
                    }
                    if (i15 != i14) {
                        break;
                    }
                }
                if (i12 == length) {
                    break;
                }
                i12++;
            }
        }
        sb2.append((CharSequence) "");
        String sb3 = sb2.toString();
        g0.o(sb3, "toString(...)");
        return sb3;
    }
}

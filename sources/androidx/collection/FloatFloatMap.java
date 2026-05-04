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
@u0({"SMAP\nFloatFloatMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatFloatMap.kt\nandroidx/collection/FloatFloatMap\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 3 FloatSet.kt\nandroidx/collection/FloatSetKt\n*L\n1#1,1036:1\n361#1,6:1039\n371#1,3:1046\n374#1,9:1050\n361#1,6:1059\n371#1,3:1066\n374#1,9:1070\n361#1,6:1079\n371#1,3:1086\n374#1,9:1090\n389#1,4:1099\n361#1,6:1103\n371#1,3:1110\n374#1,9:1114\n393#1:1123\n389#1,4:1124\n361#1,6:1128\n371#1,3:1135\n374#1,9:1139\n393#1:1148\n389#1,4:1149\n361#1,6:1153\n371#1,3:1160\n374#1,9:1164\n393#1:1173\n404#1,3:1174\n361#1,6:1177\n371#1,3:1184\n374#1,9:1188\n407#1:1197\n389#1,4:1198\n361#1,6:1202\n371#1,3:1209\n374#1,9:1213\n393#1:1222\n389#1,4:1223\n361#1,6:1227\n371#1,3:1234\n374#1,9:1238\n393#1:1247\n389#1,4:1248\n361#1,6:1252\n371#1,3:1259\n374#1,9:1263\n393#1:1272\n389#1,4:1273\n361#1,6:1277\n371#1,3:1284\n374#1,9:1288\n393#1:1297\n389#1,4:1298\n361#1,6:1302\n371#1,3:1309\n374#1,9:1313\n393#1:1322\n389#1,4:1323\n361#1,6:1327\n371#1,3:1334\n374#1,9:1338\n393#1:1347\n486#1,11:1364\n389#1,4:1375\n361#1,6:1379\n371#1,3:1386\n374#1,2:1390\n497#1,10:1392\n377#1,6:1402\n393#1:1408\n507#1,2:1409\n486#1,11:1411\n389#1,4:1422\n361#1,6:1426\n371#1,3:1433\n374#1,2:1437\n497#1,10:1439\n377#1,6:1449\n393#1:1455\n507#1,2:1456\n486#1,11:1458\n389#1,4:1469\n361#1,6:1473\n371#1,3:1480\n374#1,2:1484\n497#1,10:1486\n377#1,6:1496\n393#1:1502\n507#1,2:1503\n486#1,11:1505\n389#1,4:1516\n361#1,6:1520\n371#1,3:1527\n374#1,2:1531\n497#1,10:1533\n377#1,6:1543\n393#1:1549\n507#1,2:1550\n486#1,11:1552\n389#1,4:1563\n361#1,6:1567\n371#1,3:1574\n374#1,2:1578\n497#1,10:1580\n377#1,6:1590\n393#1:1596\n507#1,2:1597\n1399#2:1037\n1270#2:1038\n1399#2:1045\n1270#2:1049\n1399#2:1065\n1270#2:1069\n1399#2:1085\n1270#2:1089\n1399#2:1109\n1270#2:1113\n1399#2:1134\n1270#2:1138\n1399#2:1159\n1270#2:1163\n1399#2:1183\n1270#2:1187\n1399#2:1208\n1270#2:1212\n1399#2:1233\n1270#2:1237\n1399#2:1258\n1270#2:1262\n1399#2:1283\n1270#2:1287\n1399#2:1308\n1270#2:1312\n1399#2:1333\n1270#2:1337\n1179#2:1351\n1175#2:1352\n1372#2,3:1353\n1386#2,3:1356\n1312#2:1359\n1303#2:1360\n1297#2:1361\n1309#2:1362\n1393#2:1363\n1399#2:1385\n1270#2:1389\n1399#2:1432\n1270#2:1436\n1399#2:1479\n1270#2:1483\n1399#2:1526\n1270#2:1530\n1399#2:1573\n1270#2:1577\n882#3,3:1348\n*S KotlinDebug\n*F\n+ 1 FloatFloatMap.kt\nandroidx/collection/FloatFloatMap\n*L\n392#1:1039,6\n392#1:1046,3\n392#1:1050,9\n399#1:1059,6\n399#1:1066,3\n399#1:1070,9\n406#1:1079,6\n406#1:1086,3\n406#1:1090,9\n411#1:1099,4\n411#1:1103,6\n411#1:1110,3\n411#1:1114,9\n411#1:1123\n417#1:1124,4\n417#1:1128,6\n417#1:1135,3\n417#1:1139,9\n417#1:1148\n427#1:1149,4\n427#1:1153,6\n427#1:1160,3\n427#1:1164,9\n427#1:1173\n439#1:1174,3\n439#1:1177,6\n439#1:1184,3\n439#1:1188,9\n439#1:1197\n461#1:1198,4\n461#1:1202,6\n461#1:1209,3\n461#1:1213,9\n461#1:1222\n496#1:1223,4\n496#1:1227,6\n496#1:1234,3\n496#1:1238,9\n496#1:1247\n496#1:1248,4\n496#1:1252,6\n496#1:1259,3\n496#1:1263,9\n496#1:1272\n517#1:1273,4\n517#1:1277,6\n517#1:1284,3\n517#1:1288,9\n517#1:1297\n541#1:1298,4\n541#1:1302,6\n541#1:1309,3\n541#1:1313,9\n541#1:1322\n563#1:1323,4\n563#1:1327,6\n563#1:1334,3\n563#1:1338,9\n563#1:1347\n-1#1:1364,11\n-1#1:1375,4\n-1#1:1379,6\n-1#1:1386,3\n-1#1:1390,2\n-1#1:1392,10\n-1#1:1402,6\n-1#1:1408\n-1#1:1409,2\n-1#1:1411,11\n-1#1:1422,4\n-1#1:1426,6\n-1#1:1433,3\n-1#1:1437,2\n-1#1:1439,10\n-1#1:1449,6\n-1#1:1455\n-1#1:1456,2\n-1#1:1458,11\n-1#1:1469,4\n-1#1:1473,6\n-1#1:1480,3\n-1#1:1484,2\n-1#1:1486,10\n-1#1:1496,6\n-1#1:1502\n-1#1:1503,2\n-1#1:1505,11\n-1#1:1516,4\n-1#1:1520,6\n-1#1:1527,3\n-1#1:1531,2\n-1#1:1533,10\n-1#1:1543,6\n-1#1:1549\n-1#1:1550,2\n-1#1:1552,11\n-1#1:1563,4\n-1#1:1567,6\n-1#1:1574,3\n-1#1:1578,2\n-1#1:1580,10\n-1#1:1590,6\n-1#1:1596\n-1#1:1597,2\n366#1:1037\n373#1:1038\n392#1:1045\n392#1:1049\n399#1:1065\n399#1:1069\n406#1:1085\n406#1:1089\n411#1:1109\n411#1:1113\n417#1:1134\n417#1:1138\n427#1:1159\n427#1:1163\n439#1:1183\n439#1:1187\n461#1:1208\n461#1:1212\n496#1:1233\n496#1:1237\n496#1:1258\n496#1:1262\n517#1:1283\n517#1:1287\n541#1:1308\n541#1:1312\n563#1:1333\n563#1:1337\n583#1:1351\n586#1:1352\n590#1:1353,3\n591#1:1356,3\n592#1:1359\n593#1:1360\n593#1:1361\n597#1:1362\n600#1:1363\n-1#1:1385\n-1#1:1389\n-1#1:1432\n-1#1:1436\n-1#1:1479\n-1#1:1483\n-1#1:1526\n-1#1:1530\n-1#1:1573\n-1#1:1577\n582#1:1348,3\n*E\n"})
/* loaded from: classes.dex */
public abstract class FloatFloatMap {

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
    public float[] values;

    public /* synthetic */ FloatFloatMap(v vVar) {
        this();
    }

    public static /* synthetic */ String joinToString$default(FloatFloatMap floatFloatMap, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i11, CharSequence charSequence4, int i12, Object obj) {
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
        return floatFloatMap.joinToString(charSequence, charSequence2, charSequence6, i11, charSequence5);
    }

    public final boolean all(@k p<? super Float, ? super Float, Boolean> predicate) {
        g0.p(predicate, "predicate");
        float[] fArr = this.keys;
        float[] fArr2 = this.values;
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
                        if (!predicate.invoke(Float.valueOf(fArr[i14]), Float.valueOf(fArr2[i14])).booleanValue()) {
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

    public final boolean containsValue(float f11) {
        float[] fArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j11 = jArr[i11];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j11) < 128 && f11 == fArr[(i11 << 3) + i13]) {
                            return true;
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
        if (!(obj instanceof FloatFloatMap)) {
            return false;
        }
        FloatFloatMap floatFloatMap = (FloatFloatMap) obj;
        if (floatFloatMap.getSize() != getSize()) {
            return false;
        }
        float[] fArr = this.keys;
        float[] fArr2 = this.values;
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
                        float f12 = fArr2[i14];
                        int findKeyIndex = floatFloatMap.findKeyIndex(f11);
                        if (findKeyIndex < 0) {
                            break loop0;
                        }
                        z12 = z13;
                        if (f12 != floatFloatMap.values[findKeyIndex]) {
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

    public final void forEach(@k p<? super Float, ? super Float, g2> block) {
        g0.p(block, "block");
        float[] fArr = this.keys;
        float[] fArr2 = this.values;
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
                        block.invoke(Float.valueOf(fArr[i14]), Float.valueOf(fArr2[i14]));
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

    public final void forEachValue(@k x00.l<? super Float, g2> block) {
        g0.p(block, "block");
        float[] fArr = this.values;
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

    public final float get(float f11) {
        int findKeyIndex = findKeyIndex(f11);
        if (findKeyIndex < 0) {
            RuntimeHelpersKt.throwNoSuchElementException("Cannot find value for key " + f11);
        }
        return this.values[findKeyIndex];
    }

    public final int getCapacity() {
        return this._capacity;
    }

    public final float getOrDefault(float f11, float f12) {
        int findKeyIndex = findKeyIndex(f11);
        return findKeyIndex >= 0 ? this.values[findKeyIndex] : f12;
    }

    public final float getOrElse(float f11, @k x00.a<Float> defaultValue) {
        g0.p(defaultValue, "defaultValue");
        int findKeyIndex = findKeyIndex(f11);
        return findKeyIndex < 0 ? defaultValue.invoke().floatValue() : this.values[findKeyIndex];
    }

    public final int getSize() {
        return this._size;
    }

    public int hashCode() {
        float[] fArr = this.keys;
        float[] fArr2 = this.values;
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
                        i12 += Float.hashCode(fArr2[i15]) ^ Float.hashCode(f11);
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
        float[] fArr2 = this.values;
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
                            float f12 = fArr2[i15];
                            sb2.append(f11);
                            sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
                            sb2.append(f12);
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

    private FloatFloatMap() {
        this.metadata = ScatterMapKt.EmptyGroup;
        this.keys = FloatSetKt.getEmptyFloatArray();
        this.values = FloatSetKt.getEmptyFloatArray();
    }

    public final boolean any(@k p<? super Float, ? super Float, Boolean> predicate) {
        g0.p(predicate, "predicate");
        float[] fArr = this.keys;
        float[] fArr2 = this.values;
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
                            if (predicate.invoke(Float.valueOf(fArr[i14]), Float.valueOf(fArr2[i14])).booleanValue()) {
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

    public final int count(@k p<? super Float, ? super Float, Boolean> predicate) {
        g0.p(predicate, "predicate");
        float[] fArr = this.keys;
        float[] fArr2 = this.values;
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
                        if (predicate.invoke(Float.valueOf(fArr[i15]), Float.valueOf(fArr2[i15])).booleanValue()) {
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

    public static /* synthetic */ String joinToString$default(FloatFloatMap floatFloatMap, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i11, CharSequence charSequence4, p transform, int i12, Object obj) {
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
            float[] fArr = floatFloatMap.keys;
            float[] fArr2 = floatFloatMap.values;
            long[] jArr3 = floatFloatMap.metadata;
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
                                float f12 = fArr2[i22];
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
                                sb2.append((CharSequence) transform.invoke(valueOf, Float.valueOf(f12)));
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
        float[] fArr4 = this.values;
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
                            float f12 = fArr4[i18];
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
                            sb2.append(f12);
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
    public final String joinToString(@k CharSequence charSequence, @k CharSequence prefix, @k CharSequence postfix, int i11, @k CharSequence truncated, @k p<? super Float, ? super Float, ? extends CharSequence> transform) {
        CharSequence separator = charSequence;
        g0.p(separator, "separator");
        g0.p(prefix, "prefix");
        g0.p(postfix, "postfix");
        g0.p(truncated, "truncated");
        g0.p(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        float[] fArr = this.keys;
        float[] fArr2 = this.values;
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
                            float f12 = fArr2[i17];
                            if (i13 == i11) {
                                sb2.append(truncated);
                                break loop0;
                            }
                            if (i13 != 0) {
                                sb2.append(separator);
                            }
                            sb2.append(transform.invoke(Float.valueOf(f11), Float.valueOf(f12)));
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
    public final String joinToString(@k CharSequence charSequence, @k CharSequence prefix, @k CharSequence postfix, int i11, @k p<? super Float, ? super Float, ? extends CharSequence> transform) {
        int i12;
        CharSequence separator = charSequence;
        g0.p(separator, "separator");
        g0.p(prefix, "prefix");
        g0.p(postfix, "postfix");
        g0.p(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        float[] fArr = this.keys;
        float[] fArr2 = this.values;
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
                            float f12 = fArr2[i18];
                            i12 = i15;
                            if (i14 == i11) {
                                sb2.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i14 != 0) {
                                sb2.append(separator);
                            }
                            sb2.append(transform.invoke(Float.valueOf(f11), Float.valueOf(f12)));
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
    public final String joinToString(@k CharSequence separator, @k CharSequence prefix, @k CharSequence postfix, @k p<? super Float, ? super Float, ? extends CharSequence> transform) {
        int i11;
        g0.p(separator, "separator");
        g0.p(prefix, "prefix");
        g0.p(postfix, "postfix");
        g0.p(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        float[] fArr = this.keys;
        float[] fArr2 = this.values;
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
                            float f12 = fArr2[i17];
                            i11 = i14;
                            if (i13 == -1) {
                                sb2.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i13 != 0) {
                                sb2.append(separator);
                            }
                            sb2.append(transform.invoke(Float.valueOf(f11), Float.valueOf(f12)));
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
    public final String joinToString(@k CharSequence separator, @k CharSequence prefix, @k p<? super Float, ? super Float, ? extends CharSequence> transform) {
        int i11;
        g0.p(separator, "separator");
        g0.p(prefix, "prefix");
        g0.p(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        float[] fArr = this.keys;
        float[] fArr2 = this.values;
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
                            float f12 = fArr2[i17];
                            if (i13 == -1) {
                                sb2.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i13 != 0) {
                                sb2.append(separator);
                            }
                            Float valueOf = Float.valueOf(f11);
                            i11 = i14;
                            sb2.append(transform.invoke(valueOf, Float.valueOf(f12)));
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
    public final String joinToString(@k CharSequence separator, @k p<? super Float, ? super Float, ? extends CharSequence> transform) {
        int i11;
        g0.p(separator, "separator");
        g0.p(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        float[] fArr = this.keys;
        float[] fArr2 = this.values;
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
                            float f12 = fArr2[i17];
                            i11 = i14;
                            if (i13 == -1) {
                                sb2.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i13 != 0) {
                                sb2.append(separator);
                            }
                            sb2.append(transform.invoke(Float.valueOf(f11), Float.valueOf(f12)));
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
    public final String joinToString(@k p<? super Float, ? super Float, ? extends CharSequence> transform) {
        int i11;
        g0.p(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        float[] fArr = this.keys;
        float[] fArr2 = this.values;
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
                            float f12 = fArr2[i17];
                            if (i13 == -1) {
                                sb2.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i13 != 0) {
                                sb2.append((CharSequence) j2.O);
                            }
                            Float valueOf = Float.valueOf(f11);
                            i11 = i14;
                            sb2.append(transform.invoke(valueOf, Float.valueOf(f12)));
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

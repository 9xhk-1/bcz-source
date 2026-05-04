package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
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
@u0({"SMAP\nIntObjectMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntObjectMap.kt\nandroidx/collection/IntObjectMap\n+ 2 IntSet.kt\nandroidx/collection/IntSetKt\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1017:1\n577#1:1018\n578#1:1022\n580#1,2:1024\n582#1,4:1027\n586#1:1034\n587#1:1038\n588#1:1040\n589#1,4:1043\n595#1:1048\n596#1,8:1050\n577#1:1058\n578#1:1062\n580#1,2:1064\n582#1,4:1067\n586#1:1074\n587#1:1078\n588#1:1080\n589#1,4:1083\n595#1:1088\n596#1,8:1090\n354#1,6:1100\n364#1,3:1107\n367#1,9:1111\n354#1,6:1120\n364#1,3:1127\n367#1,9:1131\n354#1,6:1140\n364#1,3:1147\n367#1,9:1151\n382#1,4:1160\n354#1,6:1164\n364#1,3:1171\n367#1,9:1175\n386#1:1184\n382#1,4:1185\n354#1,6:1189\n364#1,3:1196\n367#1,9:1200\n386#1:1209\n382#1,4:1210\n354#1,6:1214\n364#1,3:1221\n367#1,9:1225\n386#1:1234\n577#1:1235\n578#1:1239\n580#1,2:1241\n582#1,4:1244\n586#1:1251\n587#1:1255\n588#1:1257\n589#1,4:1260\n595#1:1265\n596#1,8:1267\n397#1,3:1275\n354#1,6:1278\n364#1,3:1285\n367#1,9:1289\n400#1:1298\n382#1,4:1299\n354#1,6:1303\n364#1,3:1310\n367#1,9:1314\n386#1:1323\n382#1,4:1324\n354#1,6:1328\n364#1,3:1335\n367#1,9:1339\n386#1:1348\n382#1,4:1349\n354#1,6:1353\n364#1,3:1360\n367#1,9:1364\n386#1:1373\n382#1,4:1374\n354#1,6:1378\n364#1,3:1385\n367#1,9:1389\n386#1:1398\n382#1,4:1399\n354#1,6:1403\n364#1,3:1410\n367#1,9:1414\n386#1:1423\n382#1,4:1424\n354#1,6:1428\n364#1,3:1435\n367#1,9:1439\n386#1:1448\n479#1,11:1465\n382#1,4:1476\n354#1,6:1480\n364#1,3:1487\n367#1,2:1491\n490#1,10:1493\n370#1,6:1503\n386#1:1509\n500#1,2:1510\n479#1,11:1512\n382#1,4:1523\n354#1,6:1527\n364#1,3:1534\n367#1,2:1538\n490#1,10:1540\n370#1,6:1550\n386#1:1556\n500#1,2:1557\n479#1,11:1559\n382#1,4:1570\n354#1,6:1574\n364#1,3:1581\n367#1,2:1585\n490#1,10:1587\n370#1,6:1597\n386#1:1603\n500#1,2:1604\n479#1,11:1606\n382#1,4:1617\n354#1,6:1621\n364#1,3:1628\n367#1,2:1632\n490#1,10:1634\n370#1,6:1644\n386#1:1650\n500#1,2:1651\n479#1,11:1653\n382#1,4:1664\n354#1,6:1668\n364#1,3:1675\n367#1,2:1679\n490#1,10:1681\n370#1,6:1691\n386#1:1697\n500#1,2:1698\n880#2,3:1019\n880#2,3:1059\n880#2,3:1236\n880#2,3:1449\n1179#3:1023\n1175#3:1026\n1372#3,3:1031\n1386#3,3:1035\n1312#3:1039\n1303#3:1041\n1297#3:1042\n1309#3:1047\n1393#3:1049\n1179#3:1063\n1175#3:1066\n1372#3,3:1071\n1386#3,3:1075\n1312#3:1079\n1303#3:1081\n1297#3:1082\n1309#3:1087\n1393#3:1089\n1399#3:1098\n1270#3:1099\n1399#3:1106\n1270#3:1110\n1399#3:1126\n1270#3:1130\n1399#3:1146\n1270#3:1150\n1399#3:1170\n1270#3:1174\n1399#3:1195\n1270#3:1199\n1399#3:1220\n1270#3:1224\n1179#3:1240\n1175#3:1243\n1372#3,3:1248\n1386#3,3:1252\n1312#3:1256\n1303#3:1258\n1297#3:1259\n1309#3:1264\n1393#3:1266\n1399#3:1284\n1270#3:1288\n1399#3:1309\n1270#3:1313\n1399#3:1334\n1270#3:1338\n1399#3:1359\n1270#3:1363\n1399#3:1384\n1270#3:1388\n1399#3:1409\n1270#3:1413\n1399#3:1434\n1270#3:1438\n1179#3:1452\n1175#3:1453\n1372#3,3:1454\n1386#3,3:1457\n1312#3:1460\n1303#3:1461\n1297#3:1462\n1309#3:1463\n1393#3:1464\n1399#3:1486\n1270#3:1490\n1399#3:1533\n1270#3:1537\n1399#3:1580\n1270#3:1584\n1399#3:1627\n1270#3:1631\n1399#3:1674\n1270#3:1678\n*S KotlinDebug\n*F\n+ 1 IntObjectMap.kt\nandroidx/collection/IntObjectMap\n*L\n324#1:1018\n324#1:1022\n324#1:1024,2\n324#1:1027,4\n324#1:1034\n324#1:1038\n324#1:1040\n324#1:1043,4\n324#1:1048\n324#1:1050,8\n333#1:1058\n333#1:1062\n333#1:1064,2\n333#1:1067,4\n333#1:1074\n333#1:1078\n333#1:1080\n333#1:1083,4\n333#1:1088\n333#1:1090,8\n385#1:1100,6\n385#1:1107,3\n385#1:1111,9\n392#1:1120,6\n392#1:1127,3\n392#1:1131,9\n399#1:1140,6\n399#1:1147,3\n399#1:1151,9\n404#1:1160,4\n404#1:1164,6\n404#1:1171,3\n404#1:1175,9\n404#1:1184\n410#1:1185,4\n410#1:1189,6\n410#1:1196,3\n410#1:1200,9\n410#1:1209\n420#1:1210,4\n420#1:1214,6\n420#1:1221,3\n420#1:1225,9\n420#1:1234\n428#1:1235\n428#1:1239\n428#1:1241,2\n428#1:1244,4\n428#1:1251\n428#1:1255\n428#1:1257\n428#1:1260,4\n428#1:1265\n428#1:1267,8\n432#1:1275,3\n432#1:1278,6\n432#1:1285,3\n432#1:1289,9\n432#1:1298\n454#1:1299,4\n454#1:1303,6\n454#1:1310,3\n454#1:1314,9\n454#1:1323\n489#1:1324,4\n489#1:1328,6\n489#1:1335,3\n489#1:1339,9\n489#1:1348\n489#1:1349,4\n489#1:1353,6\n489#1:1360,3\n489#1:1364,9\n489#1:1373\n510#1:1374,4\n510#1:1378,6\n510#1:1385,3\n510#1:1389,9\n510#1:1398\n534#1:1399,4\n534#1:1403,6\n534#1:1410,3\n534#1:1414,9\n534#1:1423\n559#1:1424,4\n559#1:1428,6\n559#1:1435,3\n559#1:1439,9\n559#1:1448\n-1#1:1465,11\n-1#1:1476,4\n-1#1:1480,6\n-1#1:1487,3\n-1#1:1491,2\n-1#1:1493,10\n-1#1:1503,6\n-1#1:1509\n-1#1:1510,2\n-1#1:1512,11\n-1#1:1523,4\n-1#1:1527,6\n-1#1:1534,3\n-1#1:1538,2\n-1#1:1540,10\n-1#1:1550,6\n-1#1:1556\n-1#1:1557,2\n-1#1:1559,11\n-1#1:1570,4\n-1#1:1574,6\n-1#1:1581,3\n-1#1:1585,2\n-1#1:1587,10\n-1#1:1597,6\n-1#1:1603\n-1#1:1604,2\n-1#1:1606,11\n-1#1:1617,4\n-1#1:1621,6\n-1#1:1628,3\n-1#1:1632,2\n-1#1:1634,10\n-1#1:1644,6\n-1#1:1650\n-1#1:1651,2\n-1#1:1653,11\n-1#1:1664,4\n-1#1:1668,6\n-1#1:1675,3\n-1#1:1679,2\n-1#1:1681,10\n-1#1:1691,6\n-1#1:1697\n-1#1:1698,2\n324#1:1019,3\n333#1:1059,3\n428#1:1236,3\n577#1:1449,3\n324#1:1023\n324#1:1026\n324#1:1031,3\n324#1:1035,3\n324#1:1039\n324#1:1041\n324#1:1042\n324#1:1047\n324#1:1049\n333#1:1063\n333#1:1066\n333#1:1071,3\n333#1:1075,3\n333#1:1079\n333#1:1081\n333#1:1082\n333#1:1087\n333#1:1089\n359#1:1098\n366#1:1099\n385#1:1106\n385#1:1110\n392#1:1126\n392#1:1130\n399#1:1146\n399#1:1150\n404#1:1170\n404#1:1174\n410#1:1195\n410#1:1199\n420#1:1220\n420#1:1224\n428#1:1240\n428#1:1243\n428#1:1248,3\n428#1:1252,3\n428#1:1256\n428#1:1258\n428#1:1259\n428#1:1264\n428#1:1266\n432#1:1284\n432#1:1288\n454#1:1309\n454#1:1313\n489#1:1334\n489#1:1338\n489#1:1359\n489#1:1363\n510#1:1384\n510#1:1388\n534#1:1409\n534#1:1413\n559#1:1434\n559#1:1438\n578#1:1452\n581#1:1453\n585#1:1454,3\n586#1:1457,3\n587#1:1460\n588#1:1461\n588#1:1462\n592#1:1463\n595#1:1464\n-1#1:1486\n-1#1:1490\n-1#1:1533\n-1#1:1537\n-1#1:1580\n-1#1:1584\n-1#1:1627\n-1#1:1631\n-1#1:1674\n-1#1:1678\n*E\n"})
/* loaded from: classes.dex */
public abstract class IntObjectMap<V> {

    @g
    public int _capacity;

    @g
    public int _size;

    @g
    @k
    public int[] keys;

    @g
    @k
    public long[] metadata;

    @g
    @k
    public Object[] values;

    public /* synthetic */ IntObjectMap(v vVar) {
        this();
    }

    public static /* synthetic */ String joinToString$default(IntObjectMap intObjectMap, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i11, CharSequence charSequence4, int i12, Object obj) {
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
        return intObjectMap.joinToString(charSequence, charSequence2, charSequence6, i11, charSequence5);
    }

    public final boolean all(@k p<? super Integer, ? super V, Boolean> predicate) {
        g0.p(predicate, "predicate");
        int[] iArr = this.keys;
        Object[] objArr = this.values;
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
                        if (!predicate.invoke(Integer.valueOf(iArr[i14]), objArr[i14]).booleanValue()) {
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

    public final boolean contains(int i11) {
        return containsKey(i11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0067, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0069, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean containsKey(int r19) {
        /*
            r18 = this;
            r0 = r18
            int r1 = java.lang.Integer.hashCode(r19)
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r0._capacity
            int r1 = r1 >>> 7
            r1 = r1 & r3
            r4 = 0
            r5 = r4
        L16:
            long[] r6 = r0.metadata
            int r7 = r1 >> 3
            r8 = r1 & 7
            int r8 = r8 << 3
            r9 = r6[r7]
            long r9 = r9 >>> r8
            r11 = 1
            int r7 = r7 + r11
            r12 = r6[r7]
            int r6 = 64 - r8
            long r6 = r12 << r6
            long r12 = (long) r8
            long r12 = -r12
            r8 = 63
            long r12 = r12 >> r8
            long r6 = r6 & r12
            long r6 = r6 | r9
            long r8 = (long) r2
            r12 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r8 = r8 * r12
            long r8 = r8 ^ r6
            long r12 = r8 - r12
            long r8 = ~r8
            long r8 = r8 & r12
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r12
        L42:
            r14 = 0
            int r10 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r10 == 0) goto L60
            int r10 = java.lang.Long.numberOfTrailingZeros(r8)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r3
            int[] r14 = r0.keys
            r14 = r14[r10]
            r15 = r19
            if (r14 != r15) goto L59
            goto L6a
        L59:
            r16 = 1
            long r16 = r8 - r16
            long r8 = r8 & r16
            goto L42
        L60:
            long r8 = ~r6
            r10 = 6
            long r8 = r8 << r10
            long r6 = r6 & r8
            long r6 = r6 & r12
            int r6 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r6 == 0) goto L6e
            r10 = -1
        L6a:
            if (r10 < 0) goto L6d
            return r11
        L6d:
            return r4
        L6e:
            int r5 = r5 + 8
            int r1 = r1 + r5
            r1 = r1 & r3
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.IntObjectMap.containsKey(int):boolean");
    }

    public final boolean containsValue(V v11) {
        Object[] objArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j11 = jArr[i11];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j11) < 128 && g0.g(v11, objArr[(i11 << 3) + i13])) {
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
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IntObjectMap)) {
            return false;
        }
        IntObjectMap intObjectMap = (IntObjectMap) obj;
        if (intObjectMap.getSize() != getSize()) {
            return false;
        }
        int[] iArr = this.keys;
        Object[] objArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            loop0: while (true) {
                long j11 = jArr[i11];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j11) < 128) {
                            int i14 = (i11 << 3) + i13;
                            int i15 = iArr[i14];
                            Object obj2 = objArr[i14];
                            if (obj2 == null) {
                                if (intObjectMap.get(i15) != null || !intObjectMap.containsKey(i15)) {
                                    break loop0;
                                }
                            } else if (!g0.g(obj2, intObjectMap.get(i15))) {
                                return false;
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
            return false;
        }
        return true;
    }

    public final int findKeyIndex$collection(int i11) {
        int hashCode = Integer.hashCode(i11) * (-862048943);
        int i12 = hashCode ^ (hashCode << 16);
        int i13 = i12 & 127;
        int i14 = this._capacity;
        int i15 = (i12 >>> 7) & i14;
        int i16 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i17 = i15 >> 3;
            int i18 = (i15 & 7) << 3;
            long j11 = ((jArr[i17 + 1] << (64 - i18)) & ((-i18) >> 63)) | (jArr[i17] >>> i18);
            long j12 = (i13 * ScatterMapKt.BitmaskLsb) ^ j11;
            for (long j13 = (~j12) & (j12 - ScatterMapKt.BitmaskLsb) & (-9187201950435737472L); j13 != 0; j13 &= j13 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j13) >> 3) + i15) & i14;
                if (this.keys[numberOfTrailingZeros] == i11) {
                    return numberOfTrailingZeros;
                }
            }
            if ((j11 & ((~j11) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i16 += 8;
            i15 = (i15 + i16) & i14;
        }
    }

    public final void forEach(@k p<? super Integer, ? super V, g2> block) {
        g0.p(block, "block");
        int[] iArr = this.keys;
        Object[] objArr = this.values;
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
                        block.invoke(Integer.valueOf(iArr[i14]), objArr[i14]);
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

    public final void forEachKey(@k x00.l<? super Integer, g2> block) {
        g0.p(block, "block");
        int[] iArr = this.keys;
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

    public final void forEachValue(@k x00.l<? super V, g2> block) {
        g0.p(block, "block");
        Object[] objArr = this.values;
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
                        block.invoke(objArr[(i11 << 3) + i13]);
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

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0061, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0063, code lost:
    
        r10 = -1;
     */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final V get(int r14) {
        /*
            r13 = this;
            int r0 = java.lang.Integer.hashCode(r14)
            r1 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r0 = r0 * r1
            int r1 = r0 << 16
            r0 = r0 ^ r1
            r1 = r0 & 127(0x7f, float:1.78E-43)
            int r2 = r13._capacity
            int r0 = r0 >>> 7
            r0 = r0 & r2
            r3 = 0
        L13:
            long[] r4 = r13.metadata
            int r5 = r0 >> 3
            r6 = r0 & 7
            int r6 = r6 << 3
            r7 = r4[r5]
            long r7 = r7 >>> r6
            int r5 = r5 + 1
            r9 = r4[r5]
            int r4 = 64 - r6
            long r4 = r9 << r4
            long r9 = (long) r6
            long r9 = -r9
            r6 = 63
            long r9 = r9 >> r6
            long r4 = r4 & r9
            long r4 = r4 | r7
            long r6 = (long) r1
            r8 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r6 = r6 * r8
            long r6 = r6 ^ r4
            long r8 = r6 - r8
            long r6 = ~r6
            long r6 = r6 & r8
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
        L3f:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L5a
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r0
            r10 = r10 & r2
            int[] r11 = r13.keys
            r11 = r11[r10]
            if (r11 != r14) goto L54
            goto L64
        L54:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L3f
        L5a:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L6d
            r10 = -1
        L64:
            if (r10 < 0) goto L6b
            java.lang.Object[] r14 = r13.values
            r14 = r14[r10]
            return r14
        L6b:
            r14 = 0
            return r14
        L6d:
            int r3 = r3 + 8
            int r0 = r0 + r3
            r0 = r0 & r2
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.IntObjectMap.get(int):java.lang.Object");
    }

    public final int getCapacity() {
        return this._capacity;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0061, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0063, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final V getOrDefault(int r14, V r15) {
        /*
            r13 = this;
            int r0 = java.lang.Integer.hashCode(r14)
            r1 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r0 = r0 * r1
            int r1 = r0 << 16
            r0 = r0 ^ r1
            r1 = r0 & 127(0x7f, float:1.78E-43)
            int r2 = r13._capacity
            int r0 = r0 >>> 7
            r0 = r0 & r2
            r3 = 0
        L13:
            long[] r4 = r13.metadata
            int r5 = r0 >> 3
            r6 = r0 & 7
            int r6 = r6 << 3
            r7 = r4[r5]
            long r7 = r7 >>> r6
            int r5 = r5 + 1
            r9 = r4[r5]
            int r4 = 64 - r6
            long r4 = r9 << r4
            long r9 = (long) r6
            long r9 = -r9
            r6 = 63
            long r9 = r9 >> r6
            long r4 = r4 & r9
            long r4 = r4 | r7
            long r6 = (long) r1
            r8 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r6 = r6 * r8
            long r6 = r6 ^ r4
            long r8 = r6 - r8
            long r6 = ~r6
            long r6 = r6 & r8
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
        L3f:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L5a
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r0
            r10 = r10 & r2
            int[] r11 = r13.keys
            r11 = r11[r10]
            if (r11 != r14) goto L54
            goto L64
        L54:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L3f
        L5a:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L6c
            r10 = -1
        L64:
            if (r10 < 0) goto L6b
            java.lang.Object[] r14 = r13.values
            r14 = r14[r10]
            return r14
        L6b:
            return r15
        L6c:
            int r3 = r3 + 8
            int r0 = r0 + r3
            r0 = r0 & r2
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.IntObjectMap.getOrDefault(int, java.lang.Object):java.lang.Object");
    }

    public final V getOrElse(int i11, @k x00.a<? extends V> defaultValue) {
        g0.p(defaultValue, "defaultValue");
        V v11 = get(i11);
        return v11 == null ? defaultValue.invoke() : v11;
    }

    public final int getSize() {
        return this._size;
    }

    public int hashCode() {
        int[] iArr = this.keys;
        Object[] objArr = this.values;
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
                        int i16 = iArr[i15];
                        Object obj = objArr[i15];
                        i12 += (obj != null ? obj.hashCode() : 0) ^ Integer.hashCode(i16);
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
        int[] iArr = this.keys;
        Object[] objArr = this.values;
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
                            int i16 = iArr[i15];
                            Object obj = objArr[i15];
                            sb2.append(i16);
                            sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb2.append(obj);
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

    private IntObjectMap() {
        this.metadata = ScatterMapKt.EmptyGroup;
        this.keys = IntSetKt.getEmptyIntArray();
        this.values = ContainerHelpersKt.EMPTY_OBJECTS;
    }

    public final boolean any(@k p<? super Integer, ? super V, Boolean> predicate) {
        g0.p(predicate, "predicate");
        int[] iArr = this.keys;
        Object[] objArr = this.values;
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
                            if (predicate.invoke(Integer.valueOf(iArr[i14]), objArr[i14]).booleanValue()) {
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

    public final int count(@k p<? super Integer, ? super V, Boolean> predicate) {
        g0.p(predicate, "predicate");
        int[] iArr = this.keys;
        Object[] objArr = this.values;
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
                        if (predicate.invoke(Integer.valueOf(iArr[i15]), objArr[i15]).booleanValue()) {
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

    public static /* synthetic */ String joinToString$default(IntObjectMap intObjectMap, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i11, CharSequence charSequence4, p transform, int i12, Object obj) {
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
            int[] iArr = intObjectMap.keys;
            Object[] objArr = intObjectMap.values;
            long[] jArr3 = intObjectMap.metadata;
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
                                int i23 = iArr[i22];
                                i13 = i18;
                                Object obj2 = objArr[i22];
                                if (i16 == i14) {
                                    sb2.append(truncated);
                                    break loop0;
                                }
                                if (i16 != 0) {
                                    sb2.append(separator);
                                }
                                jArr2 = jArr3;
                                sb2.append((CharSequence) transform.invoke(Integer.valueOf(i23), obj2));
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
            }
            sb2.append(postfix);
            String sb3 = sb2.toString();
            g0.o(sb3, "toString(...)");
            return sb3;
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
        int[] iArr;
        int[] iArr2;
        int i12;
        g0.p(separator, "separator");
        g0.p(prefix, "prefix");
        g0.p(postfix, "postfix");
        g0.p(truncated, "truncated");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        int[] iArr3 = this.keys;
        Object[] objArr = this.values;
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
                            int i19 = iArr3[i18];
                            Object obj = objArr[i18];
                            iArr2 = iArr3;
                            if (i14 == i11) {
                                sb2.append(truncated);
                                break loop0;
                            }
                            if (i14 != 0) {
                                sb2.append(separator);
                            }
                            sb2.append(i19);
                            sb2.append('=');
                            sb2.append(obj);
                            i14++;
                        } else {
                            iArr2 = iArr3;
                            i12 = i15;
                        }
                        j11 >>= i12;
                        i17++;
                        iArr3 = iArr2;
                        i15 = i12;
                    }
                    iArr = iArr3;
                    if (i16 != i15) {
                        break;
                    }
                } else {
                    iArr = iArr3;
                }
                if (i13 == length) {
                    break;
                }
                i13++;
                iArr3 = iArr;
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
    public final String joinToString(@k CharSequence charSequence, @k CharSequence prefix, @k CharSequence postfix, int i11, @k CharSequence truncated, @k p<? super Integer, ? super V, ? extends CharSequence> transform) {
        int[] iArr;
        int[] iArr2;
        CharSequence separator = charSequence;
        g0.p(separator, "separator");
        g0.p(prefix, "prefix");
        g0.p(postfix, "postfix");
        g0.p(truncated, "truncated");
        g0.p(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        int[] iArr3 = this.keys;
        Object[] objArr = this.values;
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
                            int i18 = iArr3[i17];
                            Object obj = objArr[i17];
                            iArr2 = iArr3;
                            if (i13 == i11) {
                                sb2.append(truncated);
                                break loop0;
                            }
                            if (i13 != 0) {
                                sb2.append(separator);
                            }
                            sb2.append(transform.invoke(Integer.valueOf(i18), obj));
                            i13++;
                        } else {
                            iArr2 = iArr3;
                        }
                        j11 >>= 8;
                        i16++;
                        separator = charSequence;
                        iArr3 = iArr2;
                    }
                    iArr = iArr3;
                    if (i15 != 8) {
                        break;
                    }
                } else {
                    iArr = iArr3;
                }
                if (i14 == length) {
                    break;
                }
                i12 = i14 + 1;
                separator = charSequence;
                iArr3 = iArr;
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

    @w00.k
    @k
    public final String joinToString(@k CharSequence separator, @k CharSequence prefix, @k CharSequence postfix, int i11, @k p<? super Integer, ? super V, ? extends CharSequence> transform) {
        int i12;
        g0.p(separator, "separator");
        g0.p(prefix, "prefix");
        g0.p(postfix, "postfix");
        g0.p(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        int[] iArr = this.keys;
        Object[] objArr = this.values;
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
                            int i19 = iArr[i18];
                            i12 = i15;
                            Object obj = objArr[i18];
                            if (i14 == i11) {
                                sb2.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i14 != 0) {
                                sb2.append(separator);
                            }
                            sb2.append(transform.invoke(Integer.valueOf(i19), obj));
                            i14++;
                        } else {
                            i12 = i15;
                        }
                        j11 >>= i12;
                        i17++;
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
            }
        }
        sb2.append(postfix);
        String sb3 = sb2.toString();
        g0.o(sb3, "toString(...)");
        return sb3;
    }

    @w00.k
    @k
    public final String joinToString(@k CharSequence separator, @k CharSequence prefix, @k CharSequence postfix, @k p<? super Integer, ? super V, ? extends CharSequence> transform) {
        int i11;
        g0.p(separator, "separator");
        g0.p(prefix, "prefix");
        g0.p(postfix, "postfix");
        g0.p(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        int[] iArr = this.keys;
        Object[] objArr = this.values;
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
                            int i18 = iArr[i17];
                            i11 = i14;
                            Object obj = objArr[i17];
                            if (i13 == -1) {
                                sb2.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i13 != 0) {
                                sb2.append(separator);
                            }
                            sb2.append(transform.invoke(Integer.valueOf(i18), obj));
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
    public final String joinToString(@k CharSequence separator, @k CharSequence prefix, @k p<? super Integer, ? super V, ? extends CharSequence> transform) {
        int i11;
        g0.p(separator, "separator");
        g0.p(prefix, "prefix");
        g0.p(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        int[] iArr = this.keys;
        Object[] objArr = this.values;
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
                            int i18 = iArr[i17];
                            Object obj = objArr[i17];
                            i11 = i14;
                            if (i13 == -1) {
                                sb2.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i13 != 0) {
                                sb2.append(separator);
                            }
                            sb2.append(transform.invoke(Integer.valueOf(i18), obj));
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
    public final String joinToString(@k CharSequence separator, @k p<? super Integer, ? super V, ? extends CharSequence> transform) {
        int i11;
        g0.p(separator, "separator");
        g0.p(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        int[] iArr = this.keys;
        Object[] objArr = this.values;
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
                            int i18 = iArr[i17];
                            i11 = i14;
                            Object obj = objArr[i17];
                            if (i13 == -1) {
                                sb2.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i13 != 0) {
                                sb2.append(separator);
                            }
                            sb2.append(transform.invoke(Integer.valueOf(i18), obj));
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
    public final String joinToString(@k p<? super Integer, ? super V, ? extends CharSequence> transform) {
        int i11;
        g0.p(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        int[] iArr = this.keys;
        Object[] objArr = this.values;
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
                            int i18 = iArr[i17];
                            Object obj = objArr[i17];
                            i11 = i14;
                            if (i13 == -1) {
                                sb2.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i13 != 0) {
                                sb2.append((CharSequence) j2.O);
                            }
                            sb2.append(transform.invoke(Integer.valueOf(i18), obj));
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

package androidx.collection;

import a00.a0;
import a00.q;
import androidx.annotation.IntRange;
import androidx.collection.internal.RuntimeHelpersKt;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import yz.w1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nFloatSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatSet.kt\nandroidx/collection/MutableFloatSet\n+ 2 RuntimeHelpers.kt\nandroidx/collection/internal/RuntimeHelpersKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 6 FloatSet.kt\nandroidx/collection/FloatSet\n+ 7 FloatSet.kt\nandroidx/collection/FloatSetKt\n*L\n1#1,886:1\n59#2,5:887\n1#3:892\n1254#4,6:893\n1399#4:912\n1270#4:916\n1179#4:932\n1175#4:935\n1372#4,3:939\n1386#4,3:943\n1312#4:947\n1303#4:949\n1297#4:950\n1309#4:955\n1393#4:957\n1179#4:971\n1175#4:974\n1372#4,3:978\n1386#4,3:982\n1312#4:986\n1303#4:988\n1297#4:989\n1309#4:994\n1393#4:996\n1399#4:1018\n1270#4:1022\n1230#4:1033\n1254#4,6:1034\n1242#4:1040\n1241#4,4:1041\n1254#4,6:1045\n1175#4:1054\n1179#4:1055\n1372#4,3:1056\n1386#4,3:1059\n1312#4:1062\n1303#4:1063\n1297#4:1064\n1309#4:1065\n1393#4:1066\n1265#4:1067\n1220#4:1068\n1262#4:1069\n1220#4:1070\n1230#4:1071\n1254#4,6:1072\n1242#4:1078\n1241#4,4:1079\n1372#4,3:1083\n1399#4:1086\n1297#4:1087\n1144#4,14:1088\n1220#4:1102\n1175#4:1106\n1179#4:1107\n1254#4,6:1108\n1220#4:1114\n1179#4:1115\n1254#4,6:1116\n1254#4,6:1122\n1179#4:1128\n1254#4,6:1129\n1268#4:1135\n1220#4:1136\n1175#4:1140\n1179#4:1141\n1230#4:1142\n1254#4,6:1143\n1242#4:1149\n1241#4,4:1150\n13344#5,2:899\n13344#5,2:1005\n257#6,4:901\n227#6,7:905\n238#6,3:913\n241#6,9:917\n261#6:926\n427#6:927\n428#6:931\n430#6,2:933\n432#6,3:936\n435#6:942\n436#6:946\n437#6:948\n438#6,4:951\n444#6:956\n445#6,8:958\n427#6:966\n428#6:970\n430#6,2:972\n432#6,3:975\n435#6:981\n436#6:985\n437#6:987\n438#6,4:990\n444#6:995\n445#6,8:997\n257#6,4:1007\n227#6,7:1011\n238#6,3:1019\n241#6,9:1023\n261#6:1032\n882#7,3:928\n882#7,3:967\n882#7,3:1051\n882#7,3:1103\n882#7,3:1137\n*S KotlinDebug\n*F\n+ 1 FloatSet.kt\nandroidx/collection/MutableFloatSet\n*L\n479#1:887,5\n506#1:893,6\n579#1:912\n579#1:916\n590#1:932\n590#1:935\n590#1:939,3\n590#1:943,3\n590#1:947\n590#1:949\n590#1:950\n590#1:955\n590#1:957\n604#1:971\n604#1:974\n604#1:978,3\n604#1:982,3\n604#1:986\n604#1:988\n604#1:989\n604#1:994\n604#1:996\n649#1:1018\n649#1:1022\n657#1:1033\n657#1:1034,6\n657#1:1040\n657#1:1041,4\n665#1:1045,6\n678#1:1054\n679#1:1055\n686#1:1056,3\n687#1:1059,3\n688#1:1062\n689#1:1063\n689#1:1064\n693#1:1065\n696#1:1066\n705#1:1067\n705#1:1068\n711#1:1069\n711#1:1070\n712#1:1071\n712#1:1072,6\n712#1:1078\n712#1:1079,4\n726#1:1083,3\n727#1:1086\n729#1:1087\n775#1:1088,14\n781#1:1102\n796#1:1106\n807#1:1107\n808#1:1108,6\n818#1:1114\n821#1:1115\n822#1:1116,6\n823#1:1122,6\n830#1:1128\n831#1:1129,6\n864#1:1135\n864#1:1136\n867#1:1140\n869#1:1141\n869#1:1142\n869#1:1143,6\n869#1:1149\n869#1:1150,4\n557#1:899,2\n628#1:1005,2\n579#1:901,4\n579#1:905,7\n579#1:913,3\n579#1:917,9\n579#1:926\n590#1:927\n590#1:931\n590#1:933,2\n590#1:936,3\n590#1:942\n590#1:946\n590#1:948\n590#1:951,4\n590#1:956\n590#1:958,8\n604#1:966\n604#1:970\n604#1:972,2\n604#1:975,3\n604#1:981\n604#1:985\n604#1:987\n604#1:990,4\n604#1:995\n604#1:997,8\n649#1:1007,4\n649#1:1011,7\n649#1:1019,3\n649#1:1023,9\n649#1:1032\n590#1:928,3\n604#1:967,3\n677#1:1051,3\n795#1:1103,3\n866#1:1137,3\n*E\n"})
/* loaded from: classes.dex */
public final class MutableFloatSet extends FloatSet {
    private int growthLimit;

    public MutableFloatSet() {
        this(0, 1, null);
    }

    private final int findAbsoluteInsertIndex(float f11) {
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
                if (this.elements[numberOfTrailingZeros] == f11) {
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
                return findFirstAvailableSlot;
            }
            i16 = i19 + 8;
            i15 = (i15 + i16) & i14;
        }
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
        this.elements = new float[max];
    }

    private final void removeElementAt(int i11) {
        this._size--;
        long[] jArr = this.metadata;
        int i12 = this._capacity;
        int i13 = i11 >> 3;
        int i14 = (i11 & 7) << 3;
        long j11 = (jArr[i13] & (~(255 << i14))) | (254 << i14);
        jArr[i13] = j11;
        jArr[(((i11 - 7) & i12) + (i12 & 7)) >> 3] = j11;
    }

    public final boolean add(float f11) {
        int i11 = this._size;
        this.elements[findAbsoluteInsertIndex(f11)] = f11;
        return this._size != i11;
    }

    public final boolean addAll(@k float[] elements) {
        g0.p(elements, "elements");
        int i11 = this._size;
        plusAssign(elements);
        return i11 != this._size;
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
        float[] fArr = this.elements;
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
                    jArr[i16] = ((r7 & 127) << i17) | ((~(255 << i17)) & jArr[i16]);
                    jArr[a0.Ne(jArr)] = (jArr[z12 ? 1 : 0] & j13) | Long.MIN_VALUE;
                    i15++;
                    z11 = z12 ? 1 : 0;
                } else {
                    int i21 = findFirstAvailableSlot >> 3;
                    long j15 = jArr[i21];
                    int i22 = (findFirstAvailableSlot & 7) << 3;
                    if (((j15 >> i22) & 255) == 128) {
                        j11 = j13;
                        jArr[i21] = ((r7 & 127) << i22) | (j15 & (~(255 << i22)));
                        jArr[i16] = (jArr[i16] & (~(255 << i17))) | (128 << i17);
                        fArr[findFirstAvailableSlot] = fArr[i15];
                        fArr[i15] = 0.0f;
                    } else {
                        j11 = j13;
                        jArr[i21] = ((r7 & 127) << i22) | (j15 & (~(255 << i22)));
                        float f11 = fArr[findFirstAvailableSlot];
                        fArr[findFirstAvailableSlot] = fArr[i15];
                        fArr[i15] = f11;
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

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0063, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0065, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void minusAssign(float r14) {
        /*
            r13 = this;
            int r0 = java.lang.Float.hashCode(r14)
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
            if (r12 == 0) goto L5c
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r0
            r10 = r10 & r2
            float[] r11 = r13.elements
            r11 = r11[r10]
            int r11 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r11 != 0) goto L56
            goto L66
        L56:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L3f
        L5c:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L6c
            r10 = -1
        L66:
            if (r10 < 0) goto L6b
            r13.removeElementAt(r10)
        L6b:
            return
        L6c:
            int r3 = r3 + 8
            int r0 = r0 + r3
            r0 = r0 & r2
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableFloatSet.minusAssign(float):void");
    }

    public final void plusAssign(float f11) {
        this.elements[findAbsoluteInsertIndex(f11)] = f11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0066, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0068, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean remove(float r17) {
        /*
            r16 = this;
            r0 = r16
            int r1 = java.lang.Float.hashCode(r17)
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
            if (r10 == 0) goto L5f
            int r10 = java.lang.Long.numberOfTrailingZeros(r8)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r3
            float[] r14 = r0.elements
            r14 = r14[r10]
            int r14 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            if (r14 != 0) goto L59
            goto L69
        L59:
            r14 = 1
            long r14 = r8 - r14
            long r8 = r8 & r14
            goto L42
        L5f:
            long r8 = ~r6
            r10 = 6
            long r8 = r8 << r10
            long r6 = r6 & r8
            long r6 = r6 & r12
            int r6 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r6 == 0) goto L72
            r10 = -1
        L69:
            if (r10 < 0) goto L6c
            r4 = r11
        L6c:
            if (r4 == 0) goto L71
            r0.removeElementAt(r10)
        L71:
            return r4
        L72:
            int r5 = r5 + 8
            int r1 = r1 + r5
            r1 = r1 & r3
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableFloatSet.remove(float):boolean");
    }

    public final boolean removeAll(@k float[] elements) {
        g0.p(elements, "elements");
        int i11 = this._size;
        minusAssign(elements);
        return i11 != this._size;
    }

    public final void resizeStorage$collection(int i11) {
        long[] jArr = this.metadata;
        float[] fArr = this.elements;
        int i12 = this._capacity;
        initializeStorage(i11);
        long[] jArr2 = this.metadata;
        float[] fArr2 = this.elements;
        int i13 = this._capacity;
        for (int i14 = 0; i14 < i12; i14++) {
            if (((jArr[i14 >> 3] >> ((i14 & 7) << 3)) & 255) < 128) {
                float f11 = fArr[i14];
                int hashCode = Float.hashCode(f11) * (-862048943);
                int i15 = hashCode ^ (hashCode << 16);
                int findFirstAvailableSlot = findFirstAvailableSlot(i15 >>> 7);
                long j11 = i15 & 127;
                int i16 = findFirstAvailableSlot >> 3;
                int i17 = (findFirstAvailableSlot & 7) << 3;
                long j12 = (jArr2[i16] & (~(255 << i17))) | (j11 << i17);
                jArr2[i16] = j12;
                jArr2[(((findFirstAvailableSlot - 7) & i13) + (i13 & 7)) >> 3] = j12;
                fArr2[findFirstAvailableSlot] = f11;
            }
        }
    }

    @IntRange(from = 0)
    public final int trim() {
        int i11 = this._capacity;
        int normalizeCapacity = ScatterMapKt.normalizeCapacity(ScatterMapKt.unloadedCapacity(this._size));
        if (normalizeCapacity >= i11) {
            return 0;
        }
        resizeStorage$collection(normalizeCapacity);
        return i11 - this._capacity;
    }

    public MutableFloatSet(int i11) {
        super(null);
        if (!(i11 >= 0)) {
            RuntimeHelpersKt.throwIllegalArgumentException("Capacity must be a positive value.");
        }
        initializeStorage(ScatterMapKt.unloadedCapacity(i11));
    }

    public final void plusAssign(@k float[] elements) {
        g0.p(elements, "elements");
        for (float f11 : elements) {
            plusAssign(f11);
        }
    }

    public final boolean addAll(@k FloatSet elements) {
        g0.p(elements, "elements");
        int i11 = this._size;
        plusAssign(elements);
        return i11 != this._size;
    }

    public final boolean removeAll(@k FloatSet elements) {
        g0.p(elements, "elements");
        int i11 = this._size;
        minusAssign(elements);
        return i11 != this._size;
    }

    public final void plusAssign(@k FloatSet elements) {
        g0.p(elements, "elements");
        float[] fArr = elements.elements;
        long[] jArr = elements.metadata;
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
                        plusAssign(fArr[(i11 << 3) + i13]);
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

    public /* synthetic */ MutableFloatSet(int i11, int i12, v vVar) {
        this((i12 & 1) != 0 ? 6 : i11);
    }

    public final void minusAssign(@k float[] elements) {
        g0.p(elements, "elements");
        for (float f11 : elements) {
            minusAssign(f11);
        }
    }

    public final void minusAssign(@k FloatSet elements) {
        g0.p(elements, "elements");
        float[] fArr = elements.elements;
        long[] jArr = elements.metadata;
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
                        minusAssign(fArr[(i11 << 3) + i13]);
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

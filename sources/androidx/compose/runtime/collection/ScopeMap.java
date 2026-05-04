package androidx.compose.runtime.collection;

import a00.w1;
import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterMapKt;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import w00.h;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@h
@u0({"SMAP\nScopeMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScopeMap.kt\nandroidx/compose/runtime/collection/ScopeMap\n+ 2 ScatterMap.kt\nandroidx/collection/MutableScatterMap\n+ 3 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 5 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 6 ScatterSet.kt\nandroidx/collection/MutableScatterSet\n*L\n1#1,176:1\n67#1,6:217\n75#1,4:248\n694#2,15:177\n842#2:252\n844#2:266\n845#2,3:294\n848#2:303\n842#2:304\n844#2,4:318\n848#2:328\n231#3,3:192\n200#3,7:195\n211#3,3:203\n214#3,9:207\n234#3:216\n231#3,3:223\n200#3,7:226\n211#3,3:234\n214#3,9:238\n234#3:247\n200#3,7:269\n211#3,3:277\n214#3,2:281\n217#3,6:287\n1399#4:202\n1270#4:206\n1399#4:233\n1270#4:237\n1399#4:259\n1270#4:263\n1399#4:276\n1270#4:280\n1399#4:311\n1270#4:315\n1399#4:339\n1270#4:343\n329#5,6:253\n339#5,3:260\n342#5,2:264\n345#5,6:297\n329#5,6:305\n339#5,3:312\n342#5,2:316\n345#5,6:322\n357#5,4:329\n329#5,6:333\n339#5,3:340\n342#5,9:344\n361#5:353\n809#6,2:267\n812#6,4:283\n816#6:293\n*S KotlinDebug\n*F\n+ 1 ScopeMap.kt\nandroidx/compose/runtime/collection/ScopeMap\n*L\n81#1:217,6\n81#1:248,4\n36#1:177,15\n123#1:252\n123#1:266\n123#1:294,3\n123#1:303\n142#1:304\n142#1:318,4\n142#1:328\n72#1:192,3\n72#1:195,7\n72#1:203,3\n72#1:207,9\n72#1:216\n81#1:223,3\n81#1:226,7\n81#1:234,3\n81#1:238,9\n81#1:247\n127#1:269,7\n127#1:277,3\n127#1:281,2\n127#1:287,6\n72#1:202\n72#1:206\n81#1:233\n81#1:237\n123#1:259\n123#1:263\n127#1:276\n127#1:280\n142#1:311\n142#1:315\n162#1:339\n162#1:343\n123#1:253,6\n123#1:260,3\n123#1:264,2\n123#1:297,6\n142#1:305,6\n142#1:312,3\n142#1:316,2\n142#1:322,6\n162#1:329,4\n162#1:333,6\n162#1:340,3\n162#1:344,9\n162#1:353\n127#1:267,2\n127#1:283,4\n127#1:293\n*E\n"})
/* loaded from: classes.dex */
public final class ScopeMap<Key, Scope> {

    @k
    private final MutableScatterMap<Object, Object> map;

    private /* synthetic */ ScopeMap(MutableScatterMap mutableScatterMap) {
        this.map = mutableScatterMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r6v1, types: [androidx.collection.MutableScatterSet] */
    /* renamed from: add-impl, reason: not valid java name */
    public static final void m2045addimpl(MutableScatterMap<Object, Object> mutableScatterMap, @k Key key, @k Scope scope) {
        int findInsertIndex = mutableScatterMap.findInsertIndex(key);
        int i11 = 0;
        int i12 = 1;
        boolean z11 = findInsertIndex < 0;
        v vVar = null;
        Scope scope2 = z11 ? null : mutableScatterMap.values[findInsertIndex];
        if (scope2 != null) {
            if (scope2 instanceof MutableScatterSet) {
                g0.n(scope2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");
                ((MutableScatterSet) scope2).add(scope);
            } else if (scope2 != scope) {
                ?? mutableScatterSet = new MutableScatterSet(i11, i12, vVar);
                g0.n(scope2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                mutableScatterSet.add(scope2);
                mutableScatterSet.add(scope);
                scope = mutableScatterSet;
            }
            scope = scope2;
        }
        if (!z11) {
            mutableScatterMap.values[findInsertIndex] = scope;
            return;
        }
        int i13 = ~findInsertIndex;
        mutableScatterMap.keys[i13] = key;
        mutableScatterMap.values[i13] = scope;
    }

    /* renamed from: anyScopeOf-impl, reason: not valid java name */
    public static final boolean m2046anyScopeOfimpl(MutableScatterMap<Object, Object> mutableScatterMap, @k Key key, @k l<? super Scope, Boolean> lVar) {
        Object obj = mutableScatterMap.get(key);
        if (obj != null) {
            if (obj instanceof MutableScatterSet) {
                MutableScatterSet mutableScatterSet = (MutableScatterSet) obj;
                Object[] objArr = mutableScatterSet.elements;
                long[] jArr = mutableScatterSet.metadata;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i11 = 0;
                    while (true) {
                        long j11 = jArr[i11];
                        if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i12 = 8 - ((~(i11 - length)) >>> 31);
                            for (int i13 = 0; i13 < i12; i13++) {
                                if ((255 & j11) < 128 && lVar.invoke(objArr[(i11 << 3) + i13]).booleanValue()) {
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
            } else if (lVar.invoke(obj).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @k
    /* renamed from: asMap-impl, reason: not valid java name */
    public static final Map<Key, Set<Scope>> m2047asMapimpl(MutableScatterMap<Object, Object> mutableScatterMap) {
        Set q11;
        HashMap hashMap = new HashMap();
        Object[] objArr = mutableScatterMap.keys;
        Object[] objArr2 = mutableScatterMap.values;
        long[] jArr = mutableScatterMap.metadata;
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
                            Object obj = objArr[i14];
                            Object obj2 = objArr2[i14];
                            g0.n(obj, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.ScopeMap");
                            if (obj2 instanceof MutableScatterSet) {
                                g0.n(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");
                                q11 = ((MutableScatterSet) obj2).asSet();
                            } else {
                                g0.n(obj2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                q11 = w1.q(obj2);
                            }
                            hashMap.put(obj, q11);
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
        return hashMap;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ScopeMap m2048boximpl(MutableScatterMap mutableScatterMap) {
        return new ScopeMap(mutableScatterMap);
    }

    /* renamed from: clear-impl, reason: not valid java name */
    public static final void m2049clearimpl(MutableScatterMap<Object, Object> mutableScatterMap) {
        mutableScatterMap.clear();
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ MutableScatterMap m2051constructorimpl$default(MutableScatterMap mutableScatterMap, int i11, v vVar) {
        if ((i11 & 1) != 0) {
            mutableScatterMap = ScatterMapKt.mutableScatterMapOf();
        }
        return m2050constructorimpl(mutableScatterMap);
    }

    /* renamed from: contains-impl, reason: not valid java name */
    public static final boolean m2052containsimpl(MutableScatterMap<Object, Object> mutableScatterMap, @k Key key) {
        return mutableScatterMap.containsKey(key);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m2053equalsimpl(MutableScatterMap<Object, Object> mutableScatterMap, Object obj) {
        return (obj instanceof ScopeMap) && g0.g(mutableScatterMap, ((ScopeMap) obj).m2063unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2054equalsimpl0(MutableScatterMap<Object, Object> mutableScatterMap, MutableScatterMap<Object, Object> mutableScatterMap2) {
        return g0.g(mutableScatterMap, mutableScatterMap2);
    }

    /* renamed from: forEachScopeOf-impl, reason: not valid java name */
    public static final void m2055forEachScopeOfimpl(MutableScatterMap<Object, Object> mutableScatterMap, @k Key key, @k l<? super Scope, g2> lVar) {
        Object obj = mutableScatterMap.get(key);
        if (obj == null) {
            return;
        }
        if (!(obj instanceof MutableScatterSet)) {
            lVar.invoke(obj);
            return;
        }
        MutableScatterSet mutableScatterSet = (MutableScatterSet) obj;
        Object[] objArr = mutableScatterSet.elements;
        long[] jArr = mutableScatterSet.metadata;
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
                        lVar.invoke(objArr[(i11 << 3) + i13]);
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

    /* renamed from: getSize-impl, reason: not valid java name */
    public static final int m2056getSizeimpl(MutableScatterMap<Object, Object> mutableScatterMap) {
        return mutableScatterMap.getSize();
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m2057hashCodeimpl(MutableScatterMap<Object, Object> mutableScatterMap) {
        return mutableScatterMap.hashCode();
    }

    /* renamed from: remove-impl, reason: not valid java name */
    public static final boolean m2058removeimpl(MutableScatterMap<Object, Object> mutableScatterMap, @k Key key, @k Scope scope) {
        Object obj = mutableScatterMap.get(key);
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof MutableScatterSet)) {
            if (!g0.g(obj, scope)) {
                return false;
            }
            mutableScatterMap.remove(key);
            return true;
        }
        MutableScatterSet mutableScatterSet = (MutableScatterSet) obj;
        boolean remove = mutableScatterSet.remove(scope);
        if (remove && mutableScatterSet.isEmpty()) {
            mutableScatterMap.remove(key);
        }
        return remove;
    }

    /* renamed from: removeScope-impl, reason: not valid java name */
    public static final void m2059removeScopeimpl(MutableScatterMap<Object, Object> mutableScatterMap, @k Scope scope) {
        boolean z11;
        long[] jArr = mutableScatterMap.metadata;
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
                        Object obj = mutableScatterMap.keys[i14];
                        Object obj2 = mutableScatterMap.values[i14];
                        if (obj2 instanceof MutableScatterSet) {
                            g0.n(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");
                            MutableScatterSet mutableScatterSet = (MutableScatterSet) obj2;
                            mutableScatterSet.remove(scope);
                            z11 = mutableScatterSet.isEmpty();
                        } else {
                            z11 = obj2 == scope;
                        }
                        if (z11) {
                            mutableScatterMap.removeValueAt(i14);
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

    /* renamed from: removeScopeIf-impl, reason: not valid java name */
    public static final void m2060removeScopeIfimpl(MutableScatterMap<Object, Object> mutableScatterMap, @k l<? super Scope, Boolean> lVar) {
        long[] jArr;
        long[] jArr2;
        long j11;
        char c11;
        long j12;
        int i11;
        boolean booleanValue;
        MutableScatterSet mutableScatterSet;
        long[] jArr3;
        int i12;
        MutableScatterSet mutableScatterSet2;
        long[] jArr4 = mutableScatterMap.metadata;
        int length = jArr4.length - 2;
        if (length < 0) {
            return;
        }
        int i13 = 0;
        while (true) {
            long j13 = jArr4[i13];
            char c12 = 7;
            long j14 = -9187201950435737472L;
            if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i14 = 8;
                int i15 = 8 - ((~(i13 - length)) >>> 31);
                int i16 = 0;
                while (i16 < i15) {
                    if ((j13 & 255) < 128) {
                        int i17 = (i13 << 3) + i16;
                        c11 = c12;
                        Object obj = mutableScatterMap.keys[i17];
                        Object obj2 = mutableScatterMap.values[i17];
                        j12 = j14;
                        if (obj2 instanceof MutableScatterSet) {
                            g0.n(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");
                            MutableScatterSet mutableScatterSet3 = (MutableScatterSet) obj2;
                            Object[] objArr = mutableScatterSet3.elements;
                            long[] jArr5 = mutableScatterSet3.metadata;
                            int length2 = jArr5.length - 2;
                            if (length2 >= 0) {
                                int i18 = i14;
                                MutableScatterSet mutableScatterSet4 = mutableScatterSet3;
                                int i19 = 0;
                                while (true) {
                                    long j15 = jArr5[i19];
                                    j11 = j13;
                                    if ((((~j15) << c11) & j15 & j12) != j12) {
                                        int i21 = 8 - ((~(i19 - length2)) >>> 31);
                                        int i22 = 0;
                                        while (i22 < i21) {
                                            if ((j15 & 255) < 128) {
                                                jArr3 = jArr4;
                                                int i23 = (i19 << 3) + i22;
                                                i12 = i22;
                                                if (lVar.invoke(objArr[i23]).booleanValue()) {
                                                    mutableScatterSet2 = mutableScatterSet4;
                                                    mutableScatterSet2.removeElementAt(i23);
                                                    j15 >>= i18;
                                                    mutableScatterSet4 = mutableScatterSet2;
                                                    i22 = i12 + 1;
                                                    jArr4 = jArr3;
                                                }
                                            } else {
                                                jArr3 = jArr4;
                                                i12 = i22;
                                            }
                                            mutableScatterSet2 = mutableScatterSet4;
                                            j15 >>= i18;
                                            mutableScatterSet4 = mutableScatterSet2;
                                            i22 = i12 + 1;
                                            jArr4 = jArr3;
                                        }
                                        jArr2 = jArr4;
                                        mutableScatterSet = mutableScatterSet4;
                                        if (i21 != i18) {
                                            break;
                                        }
                                    } else {
                                        jArr2 = jArr4;
                                        mutableScatterSet = mutableScatterSet4;
                                    }
                                    if (i19 == length2) {
                                        break;
                                    }
                                    i19++;
                                    mutableScatterSet4 = mutableScatterSet;
                                    j13 = j11;
                                    jArr4 = jArr2;
                                    i18 = 8;
                                }
                            } else {
                                jArr2 = jArr4;
                                j11 = j13;
                                mutableScatterSet = mutableScatterSet3;
                            }
                            booleanValue = mutableScatterSet.isEmpty();
                        } else {
                            jArr2 = jArr4;
                            j11 = j13;
                            g0.n(obj2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                            booleanValue = lVar.invoke(obj2).booleanValue();
                        }
                        if (booleanValue) {
                            mutableScatterMap.removeValueAt(i17);
                        }
                        i11 = 8;
                    } else {
                        jArr2 = jArr4;
                        j11 = j13;
                        c11 = c12;
                        j12 = j14;
                        i11 = i14;
                    }
                    j13 = j11 >> i11;
                    i16++;
                    i14 = i11;
                    c12 = c11;
                    j14 = j12;
                    jArr4 = jArr2;
                }
                jArr = jArr4;
                if (i15 != i14) {
                    return;
                }
            } else {
                jArr = jArr4;
            }
            if (i13 == length) {
                return;
            }
            i13++;
            jArr4 = jArr;
        }
    }

    /* renamed from: set-impl, reason: not valid java name */
    public static final void m2061setimpl(MutableScatterMap<Object, Object> mutableScatterMap, @k Key key, @k Scope scope) {
        mutableScatterMap.set(key, scope);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m2062toStringimpl(MutableScatterMap<Object, Object> mutableScatterMap) {
        return "ScopeMap(map=" + mutableScatterMap + ')';
    }

    public boolean equals(Object obj) {
        return m2053equalsimpl(this.map, obj);
    }

    @k
    public final MutableScatterMap<Object, Object> getMap() {
        return this.map;
    }

    public int hashCode() {
        return m2057hashCodeimpl(this.map);
    }

    public String toString() {
        return m2062toStringimpl(this.map);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ MutableScatterMap m2063unboximpl() {
        return this.map;
    }

    @k
    /* renamed from: constructor-impl, reason: not valid java name */
    public static <Key, Scope> MutableScatterMap<Object, Object> m2050constructorimpl(@k MutableScatterMap<Object, Object> mutableScatterMap) {
        return mutableScatterMap;
    }
}

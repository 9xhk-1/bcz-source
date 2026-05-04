package androidx.compose.runtime.collection;

import a00.q;
import androidx.collection.MutableObjectList;
import androidx.collection.MutableScatterMap;
import androidx.collection.ObjectList;
import androidx.collection.ObjectListKt;
import g10.u;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import kotlin.jvm.internal.x0;
import m80.k;
import w00.h;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@h
@u0({"SMAP\nMultiValueMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiValueMap.kt\nandroidx/compose/runtime/collection/MultiValueMap\n+ 2 ScatterMap.kt\nandroidx/collection/MutableScatterMap\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 ObjectList.kt\nandroidx/collection/ObjectListKt\n+ 5 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 6 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 7 ObjectList.kt\nandroidx/collection/ObjectList\n+ 8 ObjectList.kt\nandroidx/collection/MutableObjectList\n*L\n1#1,141:1\n694#2,5:142\n701#2,8:151\n4658#3,4:147\n1516#4:159\n372#5,3:160\n329#5,6:163\n339#5,3:170\n342#5,9:174\n375#5:183\n1399#6:169\n1270#6:173\n287#7,6:184\n84#7:194\n943#8,4:190\n947#8,8:195\n*S KotlinDebug\n*F\n+ 1 MultiValueMap.kt\nandroidx/compose/runtime/collection/MultiValueMap\n*L\n44#1:142,5\n44#1:151,8\n45#1:147,4\n107#1:159\n108#1:160,3\n108#1:163,6\n108#1:170,3\n108#1:174,9\n108#1:183\n108#1:169\n108#1:173\n121#1:184,6\n132#1:194\n132#1:190,4\n132#1:195,8\n*E\n"})
/* loaded from: classes.dex */
public final class MultiValueMap<K, V> {

    @k
    private final MutableScatterMap<Object, Object> map;

    private /* synthetic */ MultiValueMap(MutableScatterMap mutableScatterMap) {
        this.map = mutableScatterMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: add-impl, reason: not valid java name */
    public static final void m2026addimpl(MutableScatterMap<Object, Object> mutableScatterMap, @k K k11, @k V v11) {
        int findInsertIndex = mutableScatterMap.findInsertIndex(k11);
        boolean z11 = findInsertIndex < 0;
        Object obj = z11 ? null : mutableScatterMap.values[findInsertIndex];
        x0.F(obj);
        if (obj != null) {
            if (obj instanceof MutableObjectList) {
                g0.n(obj, "null cannot be cast to non-null type androidx.collection.MutableObjectList<kotlin.Any>");
                MutableObjectList mutableObjectList = (MutableObjectList) obj;
                mutableObjectList.add(v11);
                v11 = mutableObjectList;
            } else {
                v11 = (V) ObjectListKt.mutableObjectListOf(obj, v11);
            }
        }
        if (!z11) {
            mutableScatterMap.values[findInsertIndex] = v11;
            return;
        }
        int i11 = ~findInsertIndex;
        mutableScatterMap.keys[i11] = k11;
        mutableScatterMap.values[i11] = v11;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ MultiValueMap m2027boximpl(MutableScatterMap mutableScatterMap) {
        return new MultiValueMap(mutableScatterMap);
    }

    /* renamed from: clear-impl, reason: not valid java name */
    public static final void m2028clearimpl(MutableScatterMap<Object, Object> mutableScatterMap) {
        mutableScatterMap.clear();
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ MutableScatterMap m2030constructorimpl$default(MutableScatterMap mutableScatterMap, int i11, v vVar) {
        int i12 = 1;
        if ((i11 & 1) != 0) {
            mutableScatterMap = new MutableScatterMap(0, i12, null);
        }
        return m2029constructorimpl(mutableScatterMap);
    }

    /* renamed from: contains-impl, reason: not valid java name */
    public static final boolean m2031containsimpl(MutableScatterMap<Object, Object> mutableScatterMap, @k K k11) {
        return mutableScatterMap.contains(k11);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m2032equalsimpl(MutableScatterMap<Object, Object> mutableScatterMap, Object obj) {
        return (obj instanceof MultiValueMap) && g0.g(mutableScatterMap, ((MultiValueMap) obj).m2044unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2033equalsimpl0(MutableScatterMap<Object, Object> mutableScatterMap, MutableScatterMap<Object, Object> mutableScatterMap2) {
        return g0.g(mutableScatterMap, mutableScatterMap2);
    }

    /* renamed from: forEachValue-impl, reason: not valid java name */
    public static final void m2034forEachValueimpl(MutableScatterMap<Object, Object> mutableScatterMap, @k K k11, @k l<? super V, g2> lVar) {
        Object obj = mutableScatterMap.get(k11);
        if (obj != null) {
            if (!(obj instanceof MutableObjectList)) {
                lVar.invoke(obj);
                return;
            }
            ObjectList objectList = (ObjectList) obj;
            Object[] objArr = objectList.content;
            int i11 = objectList._size;
            for (int i12 = 0; i12 < i11; i12++) {
                Object obj2 = objArr[i12];
                g0.n(obj2, "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
                lVar.invoke(obj2);
            }
        }
    }

    @k
    /* renamed from: get-impl, reason: not valid java name */
    public static final ObjectList<V> m2035getimpl(MutableScatterMap<Object, Object> mutableScatterMap, @k K k11) {
        Object obj = mutableScatterMap.get(k11);
        return obj == null ? ObjectListKt.emptyObjectList() : obj instanceof MutableObjectList ? (ObjectList) obj : ObjectListKt.objectListOf(obj);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m2036hashCodeimpl(MutableScatterMap<Object, Object> mutableScatterMap) {
        return mutableScatterMap.hashCode();
    }

    /* renamed from: isEmpty-impl, reason: not valid java name */
    public static final boolean m2037isEmptyimpl(MutableScatterMap<Object, Object> mutableScatterMap) {
        return mutableScatterMap.isEmpty();
    }

    /* renamed from: isNotEmpty-impl, reason: not valid java name */
    public static final boolean m2038isNotEmptyimpl(MutableScatterMap<Object, Object> mutableScatterMap) {
        return mutableScatterMap.isNotEmpty();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @m80.l
    /* renamed from: removeFirst-impl, reason: not valid java name */
    public static final V m2039removeFirstimpl(MutableScatterMap<Object, Object> mutableScatterMap, @k K k11) {
        V v11 = (V) mutableScatterMap.get(k11);
        if (v11 == 0) {
            return null;
        }
        if (!(v11 instanceof MutableObjectList)) {
            mutableScatterMap.remove(k11);
            return v11;
        }
        MutableObjectList mutableObjectList = (MutableObjectList) v11;
        V v12 = (V) mutableObjectList.removeAt(0);
        if (mutableObjectList.isEmpty()) {
            mutableScatterMap.remove(k11);
        }
        if (mutableObjectList.getSize() == 1) {
            mutableScatterMap.set(k11, mutableObjectList.first());
        }
        return v12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @m80.l
    /* renamed from: removeLast-impl, reason: not valid java name */
    public static final V m2040removeLastimpl(MutableScatterMap<Object, Object> mutableScatterMap, @k K k11) {
        V v11 = (V) mutableScatterMap.get(k11);
        if (v11 == 0) {
            return null;
        }
        if (!(v11 instanceof MutableObjectList)) {
            mutableScatterMap.remove(k11);
            return v11;
        }
        MutableObjectList mutableObjectList = (MutableObjectList) v11;
        V v12 = (V) ExtensionsKt.removeLast(mutableObjectList);
        g0.n(v12, "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
        if (mutableObjectList.isEmpty()) {
            mutableScatterMap.remove(k11);
        }
        if (mutableObjectList.getSize() == 1) {
            mutableScatterMap.set(k11, mutableObjectList.first());
        }
        return v12;
    }

    /* renamed from: removeValueIf-impl, reason: not valid java name */
    public static final void m2041removeValueIfimpl(MutableScatterMap<Object, Object> mutableScatterMap, @k K k11, @k l<? super V, Boolean> lVar) {
        Object obj = mutableScatterMap.get(k11);
        if (obj != null) {
            if (!(obj instanceof MutableObjectList)) {
                if (lVar.invoke(obj).booleanValue()) {
                    mutableScatterMap.remove(k11);
                    return;
                }
                return;
            }
            MutableObjectList mutableObjectList = (MutableObjectList) obj;
            int i11 = mutableObjectList._size;
            Object[] objArr = mutableObjectList.content;
            int i12 = 0;
            g10.l W1 = u.W1(0, i11);
            int d11 = W1.d();
            int f11 = W1.f();
            if (d11 <= f11) {
                while (true) {
                    objArr[d11 - i12] = objArr[d11];
                    if (lVar.invoke(objArr[d11]).booleanValue()) {
                        i12++;
                    }
                    if (d11 == f11) {
                        break;
                    } else {
                        d11++;
                    }
                }
            }
            q.M1(objArr, null, i11 - i12, i11);
            mutableObjectList._size -= i12;
            if (mutableObjectList.isEmpty()) {
                mutableScatterMap.remove(k11);
            }
            if (mutableObjectList.getSize() == 0) {
                mutableScatterMap.set(k11, mutableObjectList.first());
            }
        }
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m2042toStringimpl(MutableScatterMap<Object, Object> mutableScatterMap) {
        return "MultiValueMap(map=" + mutableScatterMap + ')';
    }

    @k
    /* renamed from: values-impl, reason: not valid java name */
    public static final ObjectList<V> m2043valuesimpl(MutableScatterMap<Object, Object> mutableScatterMap) {
        if (mutableScatterMap.isEmpty()) {
            return ObjectListKt.emptyObjectList();
        }
        MutableObjectList mutableObjectList = new MutableObjectList(0, 1, null);
        Object[] objArr = mutableScatterMap.values;
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
                            Object obj = objArr[(i11 << 3) + i13];
                            if (obj instanceof MutableObjectList) {
                                g0.n(obj, "null cannot be cast to non-null type androidx.collection.MutableObjectList<V of androidx.compose.runtime.collection.MultiValueMap>");
                                mutableObjectList.addAll((MutableObjectList) obj);
                            } else {
                                g0.n(obj, "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
                                mutableObjectList.add(obj);
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
        return mutableObjectList;
    }

    public boolean equals(Object obj) {
        return m2032equalsimpl(this.map, obj);
    }

    public int hashCode() {
        return m2036hashCodeimpl(this.map);
    }

    public String toString() {
        return m2042toStringimpl(this.map);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ MutableScatterMap m2044unboximpl() {
        return this.map;
    }

    @k
    /* renamed from: constructor-impl, reason: not valid java name */
    public static <K, V> MutableScatterMap<Object, Object> m2029constructorimpl(@k MutableScatterMap<Object, Object> mutableScatterMap) {
        return mutableScatterMap;
    }
}

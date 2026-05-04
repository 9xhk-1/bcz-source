package androidx.navigation;

import a00.a0;
import a00.h0;
import a00.i0;
import a00.p;
import a00.q;
import a00.r0;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.AnyRes;
import androidx.annotation.RestrictTo;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import l70.f;
import m80.k;
import m80.l;
import n6.m;
import okhttp3.i;
import u30.f0;
import w00.g;
import w00.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public abstract class NavType<T> {
    private final boolean isNullableAllowed;

    @k
    private final String name = "nav_type";

    @k
    public static final Companion Companion = new Companion(null);

    @g
    @k
    public static final NavType<Integer> IntType = new NavType<Integer>() { // from class: androidx.navigation.NavType$Companion$IntType$1
        @Override // androidx.navigation.NavType
        public String getName() {
            return TypedValues.Custom.S_INT;
        }

        @Override // androidx.navigation.NavType
        public /* bridge */ /* synthetic */ void put(Bundle bundle, String str, Integer num) {
            put(bundle, str, num.intValue());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        public Integer get(Bundle bundle, String key) {
            g0.p(bundle, "bundle");
            g0.p(key, "key");
            Object obj = bundle.get(key);
            g0.n(obj, "null cannot be cast to non-null type kotlin.Int");
            return (Integer) obj;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        public Integer parseValue(String value) {
            int parseInt;
            g0.p(value, "value");
            if (f0.J2(value, "0x", false, 2, null)) {
                String substring = value.substring(2);
                g0.o(substring, "substring(...)");
                parseInt = Integer.parseInt(substring, kotlin.text.a.a(16));
            } else {
                parseInt = Integer.parseInt(value);
            }
            return Integer.valueOf(parseInt);
        }

        public void put(Bundle bundle, String key, int i11) {
            g0.p(bundle, "bundle");
            g0.p(key, "key");
            bundle.putInt(key, i11);
        }
    };

    @g
    @k
    public static final NavType<Integer> ReferenceType = new NavType<Integer>() { // from class: androidx.navigation.NavType$Companion$ReferenceType$1
        @Override // androidx.navigation.NavType
        public String getName() {
            return TypedValues.Custom.S_REFERENCE;
        }

        @Override // androidx.navigation.NavType
        public /* bridge */ /* synthetic */ void put(Bundle bundle, String str, Integer num) {
            put(bundle, str, num.intValue());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        @AnyRes
        public Integer get(Bundle bundle, String key) {
            g0.p(bundle, "bundle");
            g0.p(key, "key");
            Object obj = bundle.get(key);
            g0.n(obj, "null cannot be cast to non-null type kotlin.Int");
            return (Integer) obj;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        public Integer parseValue(String value) {
            int parseInt;
            g0.p(value, "value");
            if (f0.J2(value, "0x", false, 2, null)) {
                String substring = value.substring(2);
                g0.o(substring, "substring(...)");
                parseInt = Integer.parseInt(substring, kotlin.text.a.a(16));
            } else {
                parseInt = Integer.parseInt(value);
            }
            return Integer.valueOf(parseInt);
        }

        public void put(Bundle bundle, String key, @AnyRes int i11) {
            g0.p(bundle, "bundle");
            g0.p(key, "key");
            bundle.putInt(key, i11);
        }
    };

    @g
    @k
    public static final NavType<int[]> IntArrayType = new CollectionNavType<int[]>() { // from class: androidx.navigation.NavType$Companion$IntArrayType$1
        @Override // androidx.navigation.CollectionNavType
        public int[] emptyCollection() {
            return new int[0];
        }

        @Override // androidx.navigation.NavType
        public String getName() {
            return "integer[]";
        }

        @Override // androidx.navigation.NavType
        public int[] get(Bundle bundle, String key) {
            g0.p(bundle, "bundle");
            g0.p(key, "key");
            return (int[]) bundle.get(key);
        }

        @Override // androidx.navigation.NavType
        public void put(Bundle bundle, String key, int[] iArr) {
            g0.p(bundle, "bundle");
            g0.p(key, "key");
            bundle.putIntArray(key, iArr);
        }

        @Override // androidx.navigation.CollectionNavType
        public List<String> serializeAsValues(int[] iArr) {
            List<Integer> bz2;
            if (iArr == null || (bz2 = a0.bz(iArr)) == null) {
                return h0.J();
            }
            List<Integer> list = bz2;
            ArrayList arrayList = new ArrayList(i0.d0(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Number) it.next()).intValue()));
            }
            return arrayList;
        }

        @Override // androidx.navigation.NavType
        public boolean valueEquals(int[] iArr, int[] iArr2) {
            return p.g(iArr != null ? q.R4(iArr) : null, iArr2 != null ? q.R4(iArr2) : null);
        }

        @Override // androidx.navigation.NavType
        public int[] parseValue(String value) {
            g0.p(value, "value");
            return new int[]{NavType.IntType.parseValue(value).intValue()};
        }

        @Override // androidx.navigation.NavType
        public int[] parseValue(String value, int[] iArr) {
            int[] s32;
            g0.p(value, "value");
            return (iArr == null || (s32 = q.s3(iArr, parseValue(value))) == null) ? parseValue(value) : s32;
        }
    };

    @g
    @k
    public static final NavType<List<Integer>> IntListType = new CollectionNavType<List<? extends Integer>>() { // from class: androidx.navigation.NavType$Companion$IntListType$1
        @Override // androidx.navigation.NavType
        public String getName() {
            return "List<Int>";
        }

        @Override // androidx.navigation.CollectionNavType
        public /* bridge */ /* synthetic */ List serializeAsValues(List<? extends Integer> list) {
            return serializeAsValues2((List<Integer>) list);
        }

        @Override // androidx.navigation.CollectionNavType
        public List<? extends Integer> emptyCollection() {
            return h0.J();
        }

        @Override // androidx.navigation.NavType
        public List<Integer> get(Bundle bundle, String key) {
            g0.p(bundle, "bundle");
            g0.p(key, "key");
            int[] iArr = (int[]) bundle.get(key);
            if (iArr != null) {
                return a0.bz(iArr);
            }
            return null;
        }

        @Override // androidx.navigation.NavType
        public void put(Bundle bundle, String key, List<Integer> list) {
            g0.p(bundle, "bundle");
            g0.p(key, "key");
            bundle.putIntArray(key, list != null ? r0.Z5(list) : null);
        }

        /* renamed from: serializeAsValues, reason: avoid collision after fix types in other method */
        public List<String> serializeAsValues2(List<Integer> list) {
            if (list == null) {
                return h0.J();
            }
            List<Integer> list2 = list;
            ArrayList arrayList = new ArrayList(i0.d0(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Number) it.next()).intValue()));
            }
            return arrayList;
        }

        @Override // androidx.navigation.NavType
        public boolean valueEquals(List<Integer> list, List<Integer> list2) {
            return p.g(list != null ? (Integer[]) list.toArray(new Integer[0]) : null, list2 != null ? (Integer[]) list2.toArray(new Integer[0]) : null);
        }

        @Override // androidx.navigation.NavType
        public List<Integer> parseValue(String value) {
            g0.p(value, "value");
            return a00.g0.l(NavType.IntType.parseValue(value));
        }

        @Override // androidx.navigation.NavType
        public List<Integer> parseValue(String value, List<Integer> list) {
            List<Integer> I4;
            g0.p(value, "value");
            return (list == null || (I4 = r0.I4(list, parseValue(value))) == null) ? parseValue(value) : I4;
        }
    };

    @g
    @k
    public static final NavType<Long> LongType = new NavType<Long>() { // from class: androidx.navigation.NavType$Companion$LongType$1
        @Override // androidx.navigation.NavType
        public String getName() {
            return "long";
        }

        @Override // androidx.navigation.NavType
        public /* bridge */ /* synthetic */ void put(Bundle bundle, String str, Long l11) {
            put(bundle, str, l11.longValue());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        public Long get(Bundle bundle, String key) {
            g0.p(bundle, "bundle");
            g0.p(key, "key");
            Object obj = bundle.get(key);
            g0.n(obj, "null cannot be cast to non-null type kotlin.Long");
            return (Long) obj;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        public Long parseValue(String value) {
            String str;
            long parseLong;
            g0.p(value, "value");
            if (f0.b2(value, "L", false, 2, null)) {
                str = value.substring(0, value.length() - 1);
                g0.o(str, "substring(...)");
            } else {
                str = value;
            }
            if (f0.J2(value, "0x", false, 2, null)) {
                String substring = str.substring(2);
                g0.o(substring, "substring(...)");
                parseLong = Long.parseLong(substring, kotlin.text.a.a(16));
            } else {
                parseLong = Long.parseLong(str);
            }
            return Long.valueOf(parseLong);
        }

        public void put(Bundle bundle, String key, long j11) {
            g0.p(bundle, "bundle");
            g0.p(key, "key");
            bundle.putLong(key, j11);
        }
    };

    @g
    @k
    public static final NavType<long[]> LongArrayType = new CollectionNavType<long[]>() { // from class: androidx.navigation.NavType$Companion$LongArrayType$1
        @Override // androidx.navigation.CollectionNavType
        public long[] emptyCollection() {
            return new long[0];
        }

        @Override // androidx.navigation.NavType
        public String getName() {
            return "long[]";
        }

        @Override // androidx.navigation.NavType
        public long[] get(Bundle bundle, String key) {
            g0.p(bundle, "bundle");
            g0.p(key, "key");
            return (long[]) bundle.get(key);
        }

        @Override // androidx.navigation.NavType
        public void put(Bundle bundle, String key, long[] jArr) {
            g0.p(bundle, "bundle");
            g0.p(key, "key");
            bundle.putLongArray(key, jArr);
        }

        @Override // androidx.navigation.CollectionNavType
        public List<String> serializeAsValues(long[] jArr) {
            List<Long> cz2;
            if (jArr == null || (cz2 = a0.cz(jArr)) == null) {
                return h0.J();
            }
            List<Long> list = cz2;
            ArrayList arrayList = new ArrayList(i0.d0(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Number) it.next()).longValue()));
            }
            return arrayList;
        }

        @Override // androidx.navigation.NavType
        public boolean valueEquals(long[] jArr, long[] jArr2) {
            return p.g(jArr != null ? q.S4(jArr) : null, jArr2 != null ? q.S4(jArr2) : null);
        }

        @Override // androidx.navigation.NavType
        public long[] parseValue(String value) {
            g0.p(value, "value");
            return new long[]{NavType.LongType.parseValue(value).longValue()};
        }

        @Override // androidx.navigation.NavType
        public long[] parseValue(String value, long[] jArr) {
            long[] v32;
            g0.p(value, "value");
            return (jArr == null || (v32 = q.v3(jArr, parseValue(value))) == null) ? parseValue(value) : v32;
        }
    };

    @g
    @k
    public static final NavType<List<Long>> LongListType = new CollectionNavType<List<? extends Long>>() { // from class: androidx.navigation.NavType$Companion$LongListType$1
        @Override // androidx.navigation.NavType
        public String getName() {
            return "List<Long>";
        }

        @Override // androidx.navigation.CollectionNavType
        public /* bridge */ /* synthetic */ List serializeAsValues(List<? extends Long> list) {
            return serializeAsValues2((List<Long>) list);
        }

        @Override // androidx.navigation.CollectionNavType
        public List<? extends Long> emptyCollection() {
            return h0.J();
        }

        @Override // androidx.navigation.NavType
        public List<Long> get(Bundle bundle, String key) {
            g0.p(bundle, "bundle");
            g0.p(key, "key");
            long[] jArr = (long[]) bundle.get(key);
            if (jArr != null) {
                return a0.cz(jArr);
            }
            return null;
        }

        @Override // androidx.navigation.NavType
        public void put(Bundle bundle, String key, List<Long> list) {
            g0.p(bundle, "bundle");
            g0.p(key, "key");
            bundle.putLongArray(key, list != null ? r0.b6(list) : null);
        }

        /* renamed from: serializeAsValues, reason: avoid collision after fix types in other method */
        public List<String> serializeAsValues2(List<Long> list) {
            if (list == null) {
                return h0.J();
            }
            List<Long> list2 = list;
            ArrayList arrayList = new ArrayList(i0.d0(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Number) it.next()).longValue()));
            }
            return arrayList;
        }

        @Override // androidx.navigation.NavType
        public boolean valueEquals(List<Long> list, List<Long> list2) {
            return p.g(list != null ? (Long[]) list.toArray(new Long[0]) : null, list2 != null ? (Long[]) list2.toArray(new Long[0]) : null);
        }

        @Override // androidx.navigation.NavType
        public List<Long> parseValue(String value) {
            g0.p(value, "value");
            return a00.g0.l(NavType.LongType.parseValue(value));
        }

        @Override // androidx.navigation.NavType
        public List<Long> parseValue(String value, List<Long> list) {
            List<Long> I4;
            g0.p(value, "value");
            return (list == null || (I4 = r0.I4(list, parseValue(value))) == null) ? parseValue(value) : I4;
        }
    };

    @g
    @k
    public static final NavType<Float> FloatType = new NavType<Float>() { // from class: androidx.navigation.NavType$Companion$FloatType$1
        @Override // androidx.navigation.NavType
        public String getName() {
            return TypedValues.Custom.S_FLOAT;
        }

        @Override // androidx.navigation.NavType
        public /* bridge */ /* synthetic */ void put(Bundle bundle, String str, Float f11) {
            put(bundle, str, f11.floatValue());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        public Float get(Bundle bundle, String key) {
            g0.p(bundle, "bundle");
            g0.p(key, "key");
            Object obj = bundle.get(key);
            g0.n(obj, "null cannot be cast to non-null type kotlin.Float");
            return (Float) obj;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        public Float parseValue(String value) {
            g0.p(value, "value");
            return Float.valueOf(Float.parseFloat(value));
        }

        public void put(Bundle bundle, String key, float f11) {
            g0.p(bundle, "bundle");
            g0.p(key, "key");
            bundle.putFloat(key, f11);
        }
    };

    @g
    @k
    public static final NavType<float[]> FloatArrayType = new CollectionNavType<float[]>() { // from class: androidx.navigation.NavType$Companion$FloatArrayType$1
        @Override // androidx.navigation.CollectionNavType
        public float[] emptyCollection() {
            return new float[0];
        }

        @Override // androidx.navigation.NavType
        public String getName() {
            return "float[]";
        }

        @Override // androidx.navigation.NavType
        public float[] get(Bundle bundle, String key) {
            g0.p(bundle, "bundle");
            g0.p(key, "key");
            return (float[]) bundle.get(key);
        }

        @Override // androidx.navigation.NavType
        public void put(Bundle bundle, String key, float[] fArr) {
            g0.p(bundle, "bundle");
            g0.p(key, "key");
            bundle.putFloatArray(key, fArr);
        }

        @Override // androidx.navigation.CollectionNavType
        public List<String> serializeAsValues(float[] fArr) {
            List<Float> az2;
            if (fArr == null || (az2 = a0.az(fArr)) == null) {
                return h0.J();
            }
            List<Float> list = az2;
            ArrayList arrayList = new ArrayList(i0.d0(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Number) it.next()).floatValue()));
            }
            return arrayList;
        }

        @Override // androidx.navigation.NavType
        public boolean valueEquals(float[] fArr, float[] fArr2) {
            return p.g(fArr != null ? q.Q4(fArr) : null, fArr2 != null ? q.Q4(fArr2) : null);
        }

        @Override // androidx.navigation.NavType
        public float[] parseValue(String value) {
            g0.p(value, "value");
            return new float[]{NavType.FloatType.parseValue(value).floatValue()};
        }

        @Override // androidx.navigation.NavType
        public float[] parseValue(String value, float[] fArr) {
            float[] p32;
            g0.p(value, "value");
            return (fArr == null || (p32 = q.p3(fArr, parseValue(value))) == null) ? parseValue(value) : p32;
        }
    };

    @g
    @k
    public static final NavType<List<Float>> FloatListType = new CollectionNavType<List<? extends Float>>() { // from class: androidx.navigation.NavType$Companion$FloatListType$1
        @Override // androidx.navigation.NavType
        public String getName() {
            return "List<Float>";
        }

        @Override // androidx.navigation.CollectionNavType
        public /* bridge */ /* synthetic */ List serializeAsValues(List<? extends Float> list) {
            return serializeAsValues2((List<Float>) list);
        }

        @Override // androidx.navigation.CollectionNavType
        public List<? extends Float> emptyCollection() {
            return h0.J();
        }

        @Override // androidx.navigation.NavType
        public List<Float> get(Bundle bundle, String key) {
            g0.p(bundle, "bundle");
            g0.p(key, "key");
            float[] fArr = (float[]) bundle.get(key);
            if (fArr != null) {
                return a0.az(fArr);
            }
            return null;
        }

        @Override // androidx.navigation.NavType
        public void put(Bundle bundle, String key, List<Float> list) {
            g0.p(bundle, "bundle");
            g0.p(key, "key");
            bundle.putFloatArray(key, list != null ? r0.X5(list) : null);
        }

        /* renamed from: serializeAsValues, reason: avoid collision after fix types in other method */
        public List<String> serializeAsValues2(List<Float> list) {
            if (list == null) {
                return h0.J();
            }
            List<Float> list2 = list;
            ArrayList arrayList = new ArrayList(i0.d0(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Number) it.next()).floatValue()));
            }
            return arrayList;
        }

        @Override // androidx.navigation.NavType
        public boolean valueEquals(List<Float> list, List<Float> list2) {
            return p.g(list != null ? (Float[]) list.toArray(new Float[0]) : null, list2 != null ? (Float[]) list2.toArray(new Float[0]) : null);
        }

        @Override // androidx.navigation.NavType
        public List<Float> parseValue(String value) {
            g0.p(value, "value");
            return a00.g0.l(NavType.FloatType.parseValue(value));
        }

        @Override // androidx.navigation.NavType
        public List<Float> parseValue(String value, List<Float> list) {
            List<Float> I4;
            g0.p(value, "value");
            return (list == null || (I4 = r0.I4(list, parseValue(value))) == null) ? parseValue(value) : I4;
        }
    };

    @g
    @k
    public static final NavType<Boolean> BoolType = new NavType<Boolean>() { // from class: androidx.navigation.NavType$Companion$BoolType$1
        @Override // androidx.navigation.NavType
        public String getName() {
            return TypedValues.Custom.S_BOOLEAN;
        }

        @Override // androidx.navigation.NavType
        public /* bridge */ /* synthetic */ void put(Bundle bundle, String str, Boolean bool) {
            put(bundle, str, bool.booleanValue());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        public Boolean get(Bundle bundle, String key) {
            g0.p(bundle, "bundle");
            g0.p(key, "key");
            return (Boolean) bundle.get(key);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        public Boolean parseValue(String value) {
            boolean z11;
            g0.p(value, "value");
            if (g0.g(value, m.f74525c)) {
                z11 = true;
            } else {
                if (!g0.g(value, "false")) {
                    throw new IllegalArgumentException("A boolean NavType only accepts \"true\" or \"false\" values.");
                }
                z11 = false;
            }
            return Boolean.valueOf(z11);
        }

        public void put(Bundle bundle, String key, boolean z11) {
            g0.p(bundle, "bundle");
            g0.p(key, "key");
            bundle.putBoolean(key, z11);
        }
    };

    @g
    @k
    public static final NavType<boolean[]> BoolArrayType = new CollectionNavType<boolean[]>() { // from class: androidx.navigation.NavType$Companion$BoolArrayType$1
        @Override // androidx.navigation.CollectionNavType
        public boolean[] emptyCollection() {
            return new boolean[0];
        }

        @Override // androidx.navigation.NavType
        public String getName() {
            return "boolean[]";
        }

        @Override // androidx.navigation.NavType
        public boolean[] get(Bundle bundle, String key) {
            g0.p(bundle, "bundle");
            g0.p(key, "key");
            return (boolean[]) bundle.get(key);
        }

        @Override // androidx.navigation.NavType
        public void put(Bundle bundle, String key, boolean[] zArr) {
            g0.p(bundle, "bundle");
            g0.p(key, "key");
            bundle.putBooleanArray(key, zArr);
        }

        @Override // androidx.navigation.CollectionNavType
        public List<String> serializeAsValues(boolean[] zArr) {
            List<Boolean> fz2;
            if (zArr == null || (fz2 = a0.fz(zArr)) == null) {
                return h0.J();
            }
            List<Boolean> list = fz2;
            ArrayList arrayList = new ArrayList(i0.d0(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Boolean) it.next()).booleanValue()));
            }
            return arrayList;
        }

        @Override // androidx.navigation.NavType
        public boolean valueEquals(boolean[] zArr, boolean[] zArr2) {
            return p.g(zArr != null ? q.M4(zArr) : null, zArr2 != null ? q.M4(zArr2) : null);
        }

        @Override // androidx.navigation.NavType
        public boolean[] parseValue(String value) {
            g0.p(value, "value");
            return new boolean[]{NavType.BoolType.parseValue(value).booleanValue()};
        }

        @Override // androidx.navigation.NavType
        public boolean[] parseValue(String value, boolean[] zArr) {
            boolean[] E3;
            g0.p(value, "value");
            return (zArr == null || (E3 = q.E3(zArr, parseValue(value))) == null) ? parseValue(value) : E3;
        }
    };

    @g
    @k
    public static final NavType<List<Boolean>> BoolListType = new CollectionNavType<List<? extends Boolean>>() { // from class: androidx.navigation.NavType$Companion$BoolListType$1
        @Override // androidx.navigation.NavType
        public String getName() {
            return "List<Boolean>";
        }

        @Override // androidx.navigation.CollectionNavType
        public /* bridge */ /* synthetic */ List serializeAsValues(List<? extends Boolean> list) {
            return serializeAsValues2((List<Boolean>) list);
        }

        @Override // androidx.navigation.CollectionNavType
        public List<? extends Boolean> emptyCollection() {
            return h0.J();
        }

        @Override // androidx.navigation.NavType
        public List<Boolean> get(Bundle bundle, String key) {
            g0.p(bundle, "bundle");
            g0.p(key, "key");
            boolean[] zArr = (boolean[]) bundle.get(key);
            if (zArr != null) {
                return a0.fz(zArr);
            }
            return null;
        }

        @Override // androidx.navigation.NavType
        public void put(Bundle bundle, String key, List<Boolean> list) {
            g0.p(bundle, "bundle");
            g0.p(key, "key");
            bundle.putBooleanArray(key, list != null ? r0.S5(list) : null);
        }

        /* renamed from: serializeAsValues, reason: avoid collision after fix types in other method */
        public List<String> serializeAsValues2(List<Boolean> list) {
            if (list == null) {
                return h0.J();
            }
            List<Boolean> list2 = list;
            ArrayList arrayList = new ArrayList(i0.d0(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Boolean) it.next()).booleanValue()));
            }
            return arrayList;
        }

        @Override // androidx.navigation.NavType
        public boolean valueEquals(List<Boolean> list, List<Boolean> list2) {
            return p.g(list != null ? (Boolean[]) list.toArray(new Boolean[0]) : null, list2 != null ? (Boolean[]) list2.toArray(new Boolean[0]) : null);
        }

        @Override // androidx.navigation.NavType
        public List<Boolean> parseValue(String value) {
            g0.p(value, "value");
            return a00.g0.l(NavType.BoolType.parseValue(value));
        }

        @Override // androidx.navigation.NavType
        public List<Boolean> parseValue(String value, List<Boolean> list) {
            List<Boolean> I4;
            g0.p(value, "value");
            return (list == null || (I4 = r0.I4(list, parseValue(value))) == null) ? parseValue(value) : I4;
        }
    };

    @g
    @k
    public static final NavType<String> StringType = new NavType<String>() { // from class: androidx.navigation.NavType$Companion$StringType$1
        @Override // androidx.navigation.NavType
        public String getName() {
            return TypedValues.Custom.S_STRING;
        }

        @Override // androidx.navigation.NavType
        public String get(Bundle bundle, String key) {
            g0.p(bundle, "bundle");
            g0.p(key, "key");
            return (String) bundle.get(key);
        }

        @Override // androidx.navigation.NavType
        public String parseValue(String value) {
            g0.p(value, "value");
            if (g0.g(value, "null")) {
                return null;
            }
            return value;
        }

        @Override // androidx.navigation.NavType
        public void put(Bundle bundle, String key, String str) {
            g0.p(bundle, "bundle");
            g0.p(key, "key");
            bundle.putString(key, str);
        }

        @Override // androidx.navigation.NavType
        public String serializeAsValue(String str) {
            String encode = str != null ? Uri.encode(str) : null;
            return encode == null ? "null" : encode;
        }
    };

    @g
    @k
    public static final NavType<String[]> StringArrayType = new CollectionNavType<String[]>() { // from class: androidx.navigation.NavType$Companion$StringArrayType$1
        @Override // androidx.navigation.CollectionNavType
        public String[] emptyCollection() {
            return new String[0];
        }

        @Override // androidx.navigation.NavType
        public String getName() {
            return "string[]";
        }

        @Override // androidx.navigation.NavType
        public String[] get(Bundle bundle, String key) {
            g0.p(bundle, "bundle");
            g0.p(key, "key");
            return (String[]) bundle.get(key);
        }

        @Override // androidx.navigation.NavType
        public void put(Bundle bundle, String key, String[] strArr) {
            g0.p(bundle, "bundle");
            g0.p(key, "key");
            bundle.putStringArray(key, strArr);
        }

        @Override // androidx.navigation.CollectionNavType
        public List<String> serializeAsValues(String[] strArr) {
            if (strArr == null) {
                return h0.J();
            }
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str : strArr) {
                arrayList.add(Uri.encode(str));
            }
            return arrayList;
        }

        @Override // androidx.navigation.NavType
        public boolean valueEquals(String[] strArr, String[] strArr2) {
            return p.g(strArr, strArr2);
        }

        @Override // androidx.navigation.NavType
        public String[] parseValue(String value) {
            g0.p(value, "value");
            return new String[]{value};
        }

        @Override // androidx.navigation.NavType
        public String[] parseValue(String value, String[] strArr) {
            String[] strArr2;
            g0.p(value, "value");
            return (strArr == null || (strArr2 = (String[]) q.y3(strArr, parseValue(value))) == null) ? parseValue(value) : strArr2;
        }
    };

    @g
    @k
    public static final NavType<List<String>> StringListType = new CollectionNavType<List<? extends String>>() { // from class: androidx.navigation.NavType$Companion$StringListType$1
        @Override // androidx.navigation.NavType
        public String getName() {
            return "List<String>";
        }

        @Override // androidx.navigation.CollectionNavType
        public /* bridge */ /* synthetic */ List serializeAsValues(List<? extends String> list) {
            return serializeAsValues2((List<String>) list);
        }

        @Override // androidx.navigation.CollectionNavType
        public List<? extends String> emptyCollection() {
            return h0.J();
        }

        @Override // androidx.navigation.NavType
        public List<String> get(Bundle bundle, String key) {
            g0.p(bundle, "bundle");
            g0.p(key, "key");
            String[] strArr = (String[]) bundle.get(key);
            if (strArr != null) {
                return a0.dz(strArr);
            }
            return null;
        }

        @Override // androidx.navigation.NavType
        public void put(Bundle bundle, String key, List<String> list) {
            g0.p(bundle, "bundle");
            g0.p(key, "key");
            bundle.putStringArray(key, list != null ? (String[]) list.toArray(new String[0]) : null);
        }

        /* renamed from: serializeAsValues, reason: avoid collision after fix types in other method */
        public List<String> serializeAsValues2(List<String> list) {
            if (list == null) {
                return h0.J();
            }
            List<String> list2 = list;
            ArrayList arrayList = new ArrayList(i0.d0(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(Uri.encode((String) it.next()));
            }
            return arrayList;
        }

        @Override // androidx.navigation.NavType
        public boolean valueEquals(List<String> list, List<String> list2) {
            return p.g(list != null ? (String[]) list.toArray(new String[0]) : null, list2 != null ? (String[]) list2.toArray(new String[0]) : null);
        }

        @Override // androidx.navigation.NavType
        public List<String> parseValue(String value) {
            g0.p(value, "value");
            return a00.g0.l(value);
        }

        @Override // androidx.navigation.NavType
        public List<String> parseValue(String value, List<String> list) {
            List<String> I4;
            g0.p(value, "value");
            return (list == null || (I4 = r0.I4(list, parseValue(value))) == null) ? parseValue(value) : I4;
        }
    };

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        @o
        @k
        public NavType<?> fromArgType(@l String str, @l String str2) {
            String str3;
            NavType<Integer> navType = NavType.IntType;
            if (g0.g(navType.getName(), str)) {
                return navType;
            }
            NavType navType2 = NavType.IntArrayType;
            if (g0.g(navType2.getName(), str)) {
                return navType2;
            }
            NavType<List<Integer>> navType3 = NavType.IntListType;
            if (g0.g(navType3.getName(), str)) {
                return navType3;
            }
            NavType<Long> navType4 = NavType.LongType;
            if (g0.g(navType4.getName(), str)) {
                return navType4;
            }
            NavType navType5 = NavType.LongArrayType;
            if (g0.g(navType5.getName(), str)) {
                return navType5;
            }
            NavType<List<Long>> navType6 = NavType.LongListType;
            if (g0.g(navType6.getName(), str)) {
                return navType6;
            }
            NavType<Boolean> navType7 = NavType.BoolType;
            if (g0.g(navType7.getName(), str)) {
                return navType7;
            }
            NavType navType8 = NavType.BoolArrayType;
            if (g0.g(navType8.getName(), str)) {
                return navType8;
            }
            NavType<List<Boolean>> navType9 = NavType.BoolListType;
            if (g0.g(navType9.getName(), str)) {
                return navType9;
            }
            NavType<String> navType10 = NavType.StringType;
            if (g0.g(navType10.getName(), str)) {
                return navType10;
            }
            NavType navType11 = NavType.StringArrayType;
            if (g0.g(navType11.getName(), str)) {
                return navType11;
            }
            NavType<List<String>> navType12 = NavType.StringListType;
            if (g0.g(navType12.getName(), str)) {
                return navType12;
            }
            NavType<Float> navType13 = NavType.FloatType;
            if (g0.g(navType13.getName(), str)) {
                return navType13;
            }
            NavType navType14 = NavType.FloatArrayType;
            if (g0.g(navType14.getName(), str)) {
                return navType14;
            }
            NavType<List<Float>> navType15 = NavType.FloatListType;
            if (g0.g(navType15.getName(), str)) {
                return navType15;
            }
            NavType<Integer> navType16 = NavType.ReferenceType;
            if (g0.g(navType16.getName(), str)) {
                return navType16;
            }
            if (str == null || str.length() == 0) {
                return navType10;
            }
            try {
                if (!f0.J2(str, ".", false, 2, null) || str2 == null) {
                    str3 = str;
                } else {
                    str3 = str2 + str;
                }
                boolean b22 = f0.b2(str, i.f77289p, false, 2, null);
                if (b22) {
                    str3 = str3.substring(0, str3.length() - 2);
                    g0.o(str3, "substring(...)");
                }
                Class<?> clazz = Class.forName(str3);
                g0.o(clazz, "clazz");
                NavType<?> parseSerializableOrParcelableType$navigation_common_release = parseSerializableOrParcelableType$navigation_common_release(clazz, b22);
                if (parseSerializableOrParcelableType$navigation_common_release != null) {
                    return parseSerializableOrParcelableType$navigation_common_release;
                }
                throw new IllegalArgumentException((str3 + " is not Serializable or Parcelable.").toString());
            } catch (ClassNotFoundException e11) {
                throw new RuntimeException(e11);
            }
        }

        @o
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @k
        public final NavType<Object> inferFromValue(@k String value) {
            g0.p(value, "value");
            try {
                try {
                    try {
                        try {
                            NavType<Integer> navType = NavType.IntType;
                            navType.parseValue(value);
                            g0.n(navType, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                            return navType;
                        } catch (IllegalArgumentException unused) {
                            NavType<Boolean> navType2 = NavType.BoolType;
                            navType2.parseValue(value);
                            g0.n(navType2, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                            return navType2;
                        }
                    } catch (IllegalArgumentException unused2) {
                        NavType<Long> navType3 = NavType.LongType;
                        navType3.parseValue(value);
                        g0.n(navType3, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                        return navType3;
                    }
                } catch (IllegalArgumentException unused3) {
                    NavType<String> navType4 = NavType.StringType;
                    g0.n(navType4, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                    return navType4;
                }
            } catch (IllegalArgumentException unused4) {
                NavType<Float> navType5 = NavType.FloatType;
                navType5.parseValue(value);
                g0.n(navType5, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return navType5;
            }
        }

        @o
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @k
        public final NavType<Object> inferFromValueType(@l Object obj) {
            if (obj instanceof Integer) {
                NavType<Integer> navType = NavType.IntType;
                g0.n(navType, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return navType;
            }
            if (obj instanceof int[]) {
                NavType<int[]> navType2 = NavType.IntArrayType;
                g0.n(navType2, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return navType2;
            }
            if (obj instanceof Long) {
                NavType<Long> navType3 = NavType.LongType;
                g0.n(navType3, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return navType3;
            }
            if (obj instanceof long[]) {
                NavType<long[]> navType4 = NavType.LongArrayType;
                g0.n(navType4, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return navType4;
            }
            if (obj instanceof Float) {
                NavType<Float> navType5 = NavType.FloatType;
                g0.n(navType5, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return navType5;
            }
            if (obj instanceof float[]) {
                NavType<float[]> navType6 = NavType.FloatArrayType;
                g0.n(navType6, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return navType6;
            }
            if (obj instanceof Boolean) {
                NavType<Boolean> navType7 = NavType.BoolType;
                g0.n(navType7, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return navType7;
            }
            if (obj instanceof boolean[]) {
                NavType<boolean[]> navType8 = NavType.BoolArrayType;
                g0.n(navType8, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return navType8;
            }
            if ((obj instanceof String) || obj == null) {
                NavType<String> navType9 = NavType.StringType;
                g0.n(navType9, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return navType9;
            }
            if ((obj instanceof Object[]) && (((Object[]) obj) instanceof String[])) {
                NavType<String[]> navType10 = NavType.StringArrayType;
                g0.n(navType10, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return navType10;
            }
            if (obj.getClass().isArray()) {
                Class<?> componentType = obj.getClass().getComponentType();
                g0.m(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    Class<?> componentType2 = obj.getClass().getComponentType();
                    g0.n(componentType2, "null cannot be cast to non-null type java.lang.Class<android.os.Parcelable>");
                    return new ParcelableArrayType(componentType2);
                }
            }
            if (obj.getClass().isArray()) {
                Class<?> componentType3 = obj.getClass().getComponentType();
                g0.m(componentType3);
                if (Serializable.class.isAssignableFrom(componentType3)) {
                    Class<?> componentType4 = obj.getClass().getComponentType();
                    g0.n(componentType4, "null cannot be cast to non-null type java.lang.Class<java.io.Serializable>");
                    return new SerializableArrayType(componentType4);
                }
            }
            if (obj instanceof Parcelable) {
                return new ParcelableType(obj.getClass());
            }
            if (obj instanceof Enum) {
                return new EnumType(obj.getClass());
            }
            if (obj instanceof Serializable) {
                return new SerializableType(obj.getClass());
            }
            throw new IllegalArgumentException("Object of type " + obj.getClass().getName() + " is not supported for navigation arguments.");
        }

        @l
        public final NavType<?> parseSerializableOrParcelableType$navigation_common_release(@k Class<?> clazz, boolean z11) {
            g0.p(clazz, "clazz");
            if (Parcelable.class.isAssignableFrom(clazz)) {
                return z11 ? new ParcelableArrayType(clazz) : new ParcelableType(clazz);
            }
            if (Enum.class.isAssignableFrom(clazz) && !z11) {
                return new EnumType(clazz);
            }
            if (Serializable.class.isAssignableFrom(clazz)) {
                return z11 ? new SerializableArrayType(clazz) : new SerializableType(clazz);
            }
            return null;
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class ParcelableArrayType<D extends Parcelable> extends NavType<D[]> {

        @k
        private final Class<D[]> arrayType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ParcelableArrayType(@k Class<D> type) {
            super(true);
            g0.p(type, "type");
            if (!Parcelable.class.isAssignableFrom(type)) {
                throw new IllegalArgumentException((type + " does not implement Parcelable.").toString());
            }
            try {
                Class<D[]> cls = (Class<D[]>) Class.forName("[L" + type.getName() + f.f70689d);
                g0.n(cls, "null cannot be cast to non-null type java.lang.Class<kotlin.Array<D of androidx.navigation.NavType.ParcelableArrayType>>");
                this.arrayType = cls;
            } catch (ClassNotFoundException e11) {
                throw new RuntimeException(e11);
            }
        }

        public boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !g0.g(ParcelableArrayType.class, obj.getClass())) {
                return false;
            }
            return g0.g(this.arrayType, ((ParcelableArrayType) obj).arrayType);
        }

        @Override // androidx.navigation.NavType
        @k
        public String getName() {
            String name = this.arrayType.getName();
            g0.o(name, "arrayType.name");
            return name;
        }

        public int hashCode() {
            return this.arrayType.hashCode();
        }

        @Override // androidx.navigation.NavType
        @l
        public D[] get(@k Bundle bundle, @k String key) {
            g0.p(bundle, "bundle");
            g0.p(key, "key");
            return (D[]) ((Parcelable[]) bundle.get(key));
        }

        @Override // androidx.navigation.NavType
        @k
        public D[] parseValue(@k String value) {
            g0.p(value, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // androidx.navigation.NavType
        public void put(@k Bundle bundle, @k String key, @l D[] dArr) {
            g0.p(bundle, "bundle");
            g0.p(key, "key");
            this.arrayType.cast(dArr);
            bundle.putParcelableArray(key, dArr);
        }

        @Override // androidx.navigation.NavType
        public boolean valueEquals(@l D[] dArr, @l D[] dArr2) {
            return p.g(dArr, dArr2);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class ParcelableType<D> extends NavType<D> {

        @k
        private final Class<D> type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ParcelableType(@k Class<D> type) {
            super(true);
            g0.p(type, "type");
            if (Parcelable.class.isAssignableFrom(type) || Serializable.class.isAssignableFrom(type)) {
                this.type = type;
                return;
            }
            throw new IllegalArgumentException((type + " does not implement Parcelable or Serializable.").toString());
        }

        public boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !g0.g(ParcelableType.class, obj.getClass())) {
                return false;
            }
            return g0.g(this.type, ((ParcelableType) obj).type);
        }

        @Override // androidx.navigation.NavType
        @l
        public D get(@k Bundle bundle, @k String key) {
            g0.p(bundle, "bundle");
            g0.p(key, "key");
            return (D) bundle.get(key);
        }

        @Override // androidx.navigation.NavType
        @k
        public String getName() {
            String name = this.type.getName();
            g0.o(name, "type.name");
            return name;
        }

        public int hashCode() {
            return this.type.hashCode();
        }

        @Override // androidx.navigation.NavType
        public D parseValue(@k String value) {
            g0.p(value, "value");
            throw new UnsupportedOperationException("Parcelables don't support default values.");
        }

        @Override // androidx.navigation.NavType
        public void put(@k Bundle bundle, @k String key, D d11) {
            g0.p(bundle, "bundle");
            g0.p(key, "key");
            this.type.cast(d11);
            if (d11 == null || (d11 instanceof Parcelable)) {
                bundle.putParcelable(key, (Parcelable) d11);
            } else if (d11 instanceof Serializable) {
                bundle.putSerializable(key, (Serializable) d11);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class SerializableArrayType<D extends Serializable> extends NavType<D[]> {

        @k
        private final Class<D[]> arrayType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SerializableArrayType(@k Class<D> type) {
            super(true);
            g0.p(type, "type");
            if (!Serializable.class.isAssignableFrom(type)) {
                throw new IllegalArgumentException((type + " does not implement Serializable.").toString());
            }
            try {
                Class<D[]> cls = (Class<D[]>) Class.forName("[L" + type.getName() + f.f70689d);
                g0.n(cls, "null cannot be cast to non-null type java.lang.Class<kotlin.Array<D of androidx.navigation.NavType.SerializableArrayType>>");
                this.arrayType = cls;
            } catch (ClassNotFoundException e11) {
                throw new RuntimeException(e11);
            }
        }

        public boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !g0.g(SerializableArrayType.class, obj.getClass())) {
                return false;
            }
            return g0.g(this.arrayType, ((SerializableArrayType) obj).arrayType);
        }

        @Override // androidx.navigation.NavType
        @k
        public String getName() {
            String name = this.arrayType.getName();
            g0.o(name, "arrayType.name");
            return name;
        }

        public int hashCode() {
            return this.arrayType.hashCode();
        }

        @Override // androidx.navigation.NavType
        @l
        public D[] get(@k Bundle bundle, @k String key) {
            g0.p(bundle, "bundle");
            g0.p(key, "key");
            return (D[]) ((Serializable[]) bundle.get(key));
        }

        @Override // androidx.navigation.NavType
        @k
        public D[] parseValue(@k String value) {
            g0.p(value, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.navigation.NavType
        public void put(@k Bundle bundle, @k String key, @l D[] dArr) {
            g0.p(bundle, "bundle");
            g0.p(key, "key");
            this.arrayType.cast(dArr);
            bundle.putSerializable(key, dArr);
        }

        @Override // androidx.navigation.NavType
        public boolean valueEquals(@l D[] dArr, @l D[] dArr2) {
            return p.g(dArr, dArr2);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nNavType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavType.kt\nandroidx/navigation/NavType$SerializableType\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1212:1\n1#2:1213\n*E\n"})
    public static class SerializableType<D extends Serializable> extends NavType<D> {

        @k
        private final Class<D> type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SerializableType(@k Class<D> type) {
            super(true);
            g0.p(type, "type");
            if (!Serializable.class.isAssignableFrom(type)) {
                throw new IllegalArgumentException((type + " does not implement Serializable.").toString());
            }
            if (!type.isEnum()) {
                this.type = type;
                return;
            }
            throw new IllegalArgumentException((type + " is an Enum. You should use EnumType instead.").toString());
        }

        public boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof SerializableType) {
                return g0.g(this.type, ((SerializableType) obj).type);
            }
            return false;
        }

        @Override // androidx.navigation.NavType
        @k
        public String getName() {
            String name = this.type.getName();
            g0.o(name, "type.name");
            return name;
        }

        public int hashCode() {
            return this.type.hashCode();
        }

        @Override // androidx.navigation.NavType
        @l
        public D get(@k Bundle bundle, @k String key) {
            g0.p(bundle, "bundle");
            g0.p(key, "key");
            return (D) bundle.get(key);
        }

        @Override // androidx.navigation.NavType
        @k
        public D parseValue(@k String value) {
            g0.p(value, "value");
            throw new UnsupportedOperationException("Serializables don't support default values.");
        }

        @Override // androidx.navigation.NavType
        public void put(@k Bundle bundle, @k String key, @k D value) {
            g0.p(bundle, "bundle");
            g0.p(key, "key");
            g0.p(value, "value");
            this.type.cast(value);
            bundle.putSerializable(key, value);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SerializableType(boolean z11, @k Class<D> type) {
            super(z11);
            g0.p(type, "type");
            if (Serializable.class.isAssignableFrom(type)) {
                this.type = type;
                return;
            }
            throw new IllegalArgumentException((type + " does not implement Serializable.").toString());
        }
    }

    public NavType(boolean z11) {
        this.isNullableAllowed = z11;
    }

    @o
    @k
    public static NavType<?> fromArgType(@l String str, @l String str2) {
        return Companion.fromArgType(str, str2);
    }

    @o
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @k
    public static final NavType<Object> inferFromValue(@k String str) {
        return Companion.inferFromValue(str);
    }

    @o
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @k
    public static final NavType<Object> inferFromValueType(@l Object obj) {
        return Companion.inferFromValueType(obj);
    }

    @l
    public abstract T get(@k Bundle bundle, @k String str);

    @k
    public String getName() {
        return this.name;
    }

    public boolean isNullableAllowed() {
        return this.isNullableAllowed;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final T parseAndPut(@k Bundle bundle, @k String key, @k String value) {
        g0.p(bundle, "bundle");
        g0.p(key, "key");
        g0.p(value, "value");
        T parseValue = parseValue(value);
        put(bundle, key, parseValue);
        return parseValue;
    }

    public abstract T parseValue(@k String str);

    public T parseValue(@k String value, T t11) {
        g0.p(value, "value");
        return parseValue(value);
    }

    public abstract void put(@k Bundle bundle, @k String str, T t11);

    @k
    public String serializeAsValue(T t11) {
        return String.valueOf(t11);
    }

    @k
    public String toString() {
        return getName();
    }

    public boolean valueEquals(T t11, T t12) {
        return g0.g(t11, t12);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nNavType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavType.kt\nandroidx/navigation/NavType$EnumType\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,1212:1\n1#2:1213\n1282#3,2:1214\n*S KotlinDebug\n*F\n+ 1 NavType.kt\nandroidx/navigation/NavType$EnumType\n*L\n1135#1:1214,2\n*E\n"})
    public static final class EnumType<D extends Enum<?>> extends SerializableType<D> {

        @k
        private final Class<D> type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EnumType(@k Class<D> type) {
            super(false, type);
            g0.p(type, "type");
            if (type.isEnum()) {
                this.type = type;
                return;
            }
            throw new IllegalArgumentException((type + " is not an Enum type.").toString());
        }

        @Override // androidx.navigation.NavType.SerializableType, androidx.navigation.NavType
        @k
        public String getName() {
            String name = this.type.getName();
            g0.o(name, "type.name");
            return name;
        }

        @Override // androidx.navigation.NavType.SerializableType, androidx.navigation.NavType
        @k
        public D parseValue(@k String value) {
            D d11;
            g0.p(value, "value");
            D[] enumConstants = this.type.getEnumConstants();
            g0.o(enumConstants, "type.enumConstants");
            int length = enumConstants.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    d11 = null;
                    break;
                }
                d11 = enumConstants[i11];
                if (f0.c2(d11.name(), value, true)) {
                    break;
                }
                i11++;
            }
            D d12 = d11;
            if (d12 != null) {
                return d12;
            }
            throw new IllegalArgumentException("Enum value " + value + " not found for type " + this.type.getName() + '.');
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final T parseAndPut(@k Bundle bundle, @k String key, @l String str, T t11) {
        g0.p(bundle, "bundle");
        g0.p(key, "key");
        if (!bundle.containsKey(key)) {
            throw new IllegalArgumentException("There is no previous value in this bundle.");
        }
        if (str == null) {
            return t11;
        }
        T parseValue = parseValue(str, t11);
        put(bundle, key, parseValue);
        return parseValue;
    }
}

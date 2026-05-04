package androidx.navigation.serialization;

import a00.a0;
import a00.h0;
import a00.i0;
import a00.p;
import a00.q;
import a00.r0;
import android.net.Uri;
import android.os.Bundle;
import androidx.navigation.CollectionNavType;
import androidx.navigation.NavType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import u30.f0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class InternalNavType {

    @k
    public static final InternalNavType INSTANCE = new InternalNavType();

    @k
    private static final NavType<Integer> IntNullableType = new NavType<Integer>() { // from class: androidx.navigation.serialization.InternalNavType$IntNullableType$1
        @Override // androidx.navigation.NavType
        public String getName() {
            return "integer_nullable";
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        public Integer get(Bundle bundle, String key) {
            g0.p(bundle, "bundle");
            g0.p(key, "key");
            Object obj = bundle.get(key);
            if (obj instanceof Integer) {
                return (Integer) obj;
            }
            return null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        public Integer parseValue(String value) {
            g0.p(value, "value");
            if (g0.g(value, "null")) {
                return null;
            }
            return NavType.IntType.parseValue(value);
        }

        @Override // androidx.navigation.NavType
        public void put(Bundle bundle, String key, Integer num) {
            g0.p(bundle, "bundle");
            g0.p(key, "key");
            if (num == null) {
                bundle.putSerializable(key, null);
            } else {
                NavType.IntType.put(bundle, key, num);
            }
        }
    };

    @k
    private static final NavType<Boolean> BoolNullableType = new NavType<Boolean>() { // from class: androidx.navigation.serialization.InternalNavType$BoolNullableType$1
        @Override // androidx.navigation.NavType
        public String getName() {
            return "boolean_nullable";
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        public Boolean get(Bundle bundle, String key) {
            g0.p(bundle, "bundle");
            g0.p(key, "key");
            Object obj = bundle.get(key);
            if (obj instanceof Boolean) {
                return (Boolean) obj;
            }
            return null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        public Boolean parseValue(String value) {
            g0.p(value, "value");
            if (g0.g(value, "null")) {
                return null;
            }
            return NavType.BoolType.parseValue(value);
        }

        @Override // androidx.navigation.NavType
        public void put(Bundle bundle, String key, Boolean bool) {
            g0.p(bundle, "bundle");
            g0.p(key, "key");
            if (bool == null) {
                bundle.putSerializable(key, null);
            } else {
                NavType.BoolType.put(bundle, key, bool);
            }
        }
    };

    @k
    private static final NavType<Double> DoubleType = new NavType<Double>() { // from class: androidx.navigation.serialization.InternalNavType$DoubleType$1
        @Override // androidx.navigation.NavType
        public String getName() {
            return "double";
        }

        @Override // androidx.navigation.NavType
        public /* bridge */ /* synthetic */ void put(Bundle bundle, String str, Double d11) {
            put(bundle, str, d11.doubleValue());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        public Double get(Bundle bundle, String key) {
            g0.p(bundle, "bundle");
            g0.p(key, "key");
            Object obj = bundle.get(key);
            g0.n(obj, "null cannot be cast to non-null type kotlin.Double");
            return (Double) obj;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        public Double parseValue(String value) {
            g0.p(value, "value");
            return Double.valueOf(Double.parseDouble(value));
        }

        public void put(Bundle bundle, String key, double d11) {
            g0.p(bundle, "bundle");
            g0.p(key, "key");
            bundle.putDouble(key, d11);
        }
    };

    @k
    private static final NavType<Double> DoubleNullableType = new NavType<Double>() { // from class: androidx.navigation.serialization.InternalNavType$DoubleNullableType$1
        @Override // androidx.navigation.NavType
        public String getName() {
            return "double_nullable";
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        public Double get(Bundle bundle, String key) {
            g0.p(bundle, "bundle");
            g0.p(key, "key");
            Object obj = bundle.get(key);
            if (obj instanceof Double) {
                return (Double) obj;
            }
            return null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        public Double parseValue(String value) {
            g0.p(value, "value");
            if (g0.g(value, "null")) {
                return null;
            }
            return InternalNavType.INSTANCE.getDoubleType().parseValue(value);
        }

        @Override // androidx.navigation.NavType
        public void put(Bundle bundle, String key, Double d11) {
            g0.p(bundle, "bundle");
            g0.p(key, "key");
            if (d11 == null) {
                bundle.putSerializable(key, null);
            } else {
                InternalNavType.INSTANCE.getDoubleType().put(bundle, key, d11);
            }
        }
    };

    @k
    private static final NavType<Float> FloatNullableType = new NavType<Float>() { // from class: androidx.navigation.serialization.InternalNavType$FloatNullableType$1
        @Override // androidx.navigation.NavType
        public String getName() {
            return "float_nullable";
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        public Float get(Bundle bundle, String key) {
            g0.p(bundle, "bundle");
            g0.p(key, "key");
            Object obj = bundle.get(key);
            if (obj instanceof Float) {
                return (Float) obj;
            }
            return null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        public Float parseValue(String value) {
            g0.p(value, "value");
            if (g0.g(value, "null")) {
                return null;
            }
            return NavType.FloatType.parseValue(value);
        }

        @Override // androidx.navigation.NavType
        public void put(Bundle bundle, String key, Float f11) {
            g0.p(bundle, "bundle");
            g0.p(key, "key");
            if (f11 == null) {
                bundle.putSerializable(key, null);
            } else {
                NavType.FloatType.put(bundle, key, f11);
            }
        }
    };

    @k
    private static final NavType<Long> LongNullableType = new NavType<Long>() { // from class: androidx.navigation.serialization.InternalNavType$LongNullableType$1
        @Override // androidx.navigation.NavType
        public String getName() {
            return "long_nullable";
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        public Long get(Bundle bundle, String key) {
            g0.p(bundle, "bundle");
            g0.p(key, "key");
            Object obj = bundle.get(key);
            if (obj instanceof Long) {
                return (Long) obj;
            }
            return null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        public Long parseValue(String value) {
            g0.p(value, "value");
            if (g0.g(value, "null")) {
                return null;
            }
            return NavType.LongType.parseValue(value);
        }

        @Override // androidx.navigation.NavType
        public void put(Bundle bundle, String key, Long l11) {
            g0.p(bundle, "bundle");
            g0.p(key, "key");
            if (l11 == null) {
                bundle.putSerializable(key, null);
            } else {
                NavType.LongType.put(bundle, key, l11);
            }
        }
    };

    @k
    private static final NavType<String> StringNonNullableType = new NavType<String>() { // from class: androidx.navigation.serialization.InternalNavType$StringNonNullableType$1
        @Override // androidx.navigation.NavType
        public String getName() {
            return "string_non_nullable";
        }

        @Override // androidx.navigation.NavType
        public String parseValue(String value) {
            g0.p(value, "value");
            return value;
        }

        @Override // androidx.navigation.NavType
        public String get(Bundle bundle, String key) {
            g0.p(bundle, "bundle");
            g0.p(key, "key");
            String string = bundle.getString(key);
            return string == null ? "null" : string;
        }

        @Override // androidx.navigation.NavType
        public void put(Bundle bundle, String key, String value) {
            g0.p(bundle, "bundle");
            g0.p(key, "key");
            g0.p(value, "value");
            bundle.putString(key, value);
        }

        @Override // androidx.navigation.NavType
        public String serializeAsValue(String value) {
            g0.p(value, "value");
            String encode = Uri.encode(value);
            g0.o(encode, "encode(value)");
            return encode;
        }
    };

    @k
    private static final NavType<String[]> StringNullableArrayType = new CollectionNavType<String[]>() { // from class: androidx.navigation.serialization.InternalNavType$StringNullableArrayType$1
        @Override // androidx.navigation.CollectionNavType
        public String[] emptyCollection() {
            return new String[0];
        }

        @Override // androidx.navigation.NavType
        public String getName() {
            return "string_nullable[]";
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
            return new String[]{NavType.StringType.parseValue(value)};
        }

        @Override // androidx.navigation.NavType
        public String[] parseValue(String value, String[] strArr) {
            String[] strArr2;
            g0.p(value, "value");
            return (strArr == null || (strArr2 = (String[]) q.y3(strArr, parseValue(value))) == null) ? parseValue(value) : strArr2;
        }
    };

    @k
    private static final NavType<List<String>> StringNullableListType = new CollectionNavType<List<? extends String>>() { // from class: androidx.navigation.serialization.InternalNavType$StringNullableListType$1
        @Override // androidx.navigation.NavType
        public String getName() {
            return "List<String?>";
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
            return a00.g0.l(NavType.StringType.parseValue(value));
        }

        @Override // androidx.navigation.NavType
        public List<String> parseValue(String value, List<String> list) {
            List<String> I4;
            g0.p(value, "value");
            return (list == null || (I4 = r0.I4(list, parseValue(value))) == null) ? parseValue(value) : I4;
        }
    };

    @k
    private static final NavType<double[]> DoubleArrayType = new CollectionNavType<double[]>() { // from class: androidx.navigation.serialization.InternalNavType$DoubleArrayType$1
        @Override // androidx.navigation.CollectionNavType
        public double[] emptyCollection() {
            return new double[0];
        }

        @Override // androidx.navigation.NavType
        public String getName() {
            return "double[]";
        }

        @Override // androidx.navigation.NavType
        public double[] get(Bundle bundle, String key) {
            g0.p(bundle, "bundle");
            g0.p(key, "key");
            return (double[]) bundle.get(key);
        }

        @Override // androidx.navigation.NavType
        public void put(Bundle bundle, String key, double[] dArr) {
            g0.p(bundle, "bundle");
            g0.p(key, "key");
            bundle.putDoubleArray(key, dArr);
        }

        @Override // androidx.navigation.CollectionNavType
        public List<String> serializeAsValues(double[] dArr) {
            List<Double> Zy;
            if (dArr == null || (Zy = a0.Zy(dArr)) == null) {
                return h0.J();
            }
            List<Double> list = Zy;
            ArrayList arrayList = new ArrayList(i0.d0(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Number) it.next()).doubleValue()));
            }
            return arrayList;
        }

        @Override // androidx.navigation.NavType
        public boolean valueEquals(double[] dArr, double[] dArr2) {
            return p.g(dArr != null ? q.P4(dArr) : null, dArr2 != null ? q.P4(dArr2) : null);
        }

        @Override // androidx.navigation.NavType
        public double[] parseValue(String value) {
            g0.p(value, "value");
            return new double[]{InternalNavType.INSTANCE.getDoubleType().parseValue(value).doubleValue()};
        }

        @Override // androidx.navigation.NavType
        public double[] parseValue(String value, double[] dArr) {
            double[] m32;
            g0.p(value, "value");
            return (dArr == null || (m32 = q.m3(dArr, parseValue(value))) == null) ? parseValue(value) : m32;
        }
    };

    @k
    private static final NavType<List<Double>> DoubleListType = new CollectionNavType<List<? extends Double>>() { // from class: androidx.navigation.serialization.InternalNavType$DoubleListType$1
        @Override // androidx.navigation.NavType
        public String getName() {
            return "List<Double>";
        }

        @Override // androidx.navigation.CollectionNavType
        public /* bridge */ /* synthetic */ List serializeAsValues(List<? extends Double> list) {
            return serializeAsValues2((List<Double>) list);
        }

        @Override // androidx.navigation.CollectionNavType
        public List<? extends Double> emptyCollection() {
            return h0.J();
        }

        @Override // androidx.navigation.NavType
        public List<Double> get(Bundle bundle, String key) {
            g0.p(bundle, "bundle");
            g0.p(key, "key");
            Object obj = bundle.get(key);
            double[] dArr = obj instanceof double[] ? (double[]) obj : null;
            if (dArr != null) {
                return a0.Zy(dArr);
            }
            return null;
        }

        @Override // androidx.navigation.NavType
        public void put(Bundle bundle, String key, List<Double> list) {
            g0.p(bundle, "bundle");
            g0.p(key, "key");
            bundle.putDoubleArray(key, list != null ? r0.W5(list) : null);
        }

        /* renamed from: serializeAsValues, reason: avoid collision after fix types in other method */
        public List<String> serializeAsValues2(List<Double> list) {
            if (list == null) {
                return h0.J();
            }
            List<Double> list2 = list;
            ArrayList arrayList = new ArrayList(i0.d0(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Number) it.next()).doubleValue()));
            }
            return arrayList;
        }

        @Override // androidx.navigation.NavType
        public boolean valueEquals(List<Double> list, List<Double> list2) {
            return p.g(list != null ? (Double[]) list.toArray(new Double[0]) : null, list2 != null ? (Double[]) list2.toArray(new Double[0]) : null);
        }

        @Override // androidx.navigation.NavType
        public List<Double> parseValue(String value) {
            g0.p(value, "value");
            return a00.g0.l(InternalNavType.INSTANCE.getDoubleType().parseValue(value));
        }

        @Override // androidx.navigation.NavType
        public List<Double> parseValue(String value, List<Double> list) {
            List<Double> I4;
            g0.p(value, "value");
            return (list == null || (I4 = r0.I4(list, parseValue(value))) == null) ? parseValue(value) : I4;
        }
    };

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nNavTypeConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavTypeConverter.kt\nandroidx/navigation/serialization/InternalNavType$EnumListType\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,577:1\n1#2:578\n1549#3:579\n1620#3,3:580\n*S KotlinDebug\n*F\n+ 1 NavTypeConverter.kt\nandroidx/navigation/serialization/InternalNavType$EnumListType\n*L\n496#1:579\n496#1:580,3\n*E\n"})
    public static final class EnumListType<D extends Enum<?>> extends CollectionNavType<List<? extends D>> {

        @k
        private final NavType.EnumType<D> enumNavType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EnumListType(@k Class<D> type) {
            super(true);
            g0.p(type, "type");
            this.enumNavType = new NavType.EnumType<>(type);
        }

        public boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof EnumListType) {
                return g0.g(this.enumNavType, ((EnumListType) obj).enumNavType);
            }
            return false;
        }

        @Override // androidx.navigation.NavType
        @k
        public String getName() {
            return "List<" + this.enumNavType.getName() + "}>";
        }

        public int hashCode() {
            return this.enumNavType.hashCode();
        }

        @Override // androidx.navigation.CollectionNavType
        @k
        public List<D> emptyCollection() {
            return h0.J();
        }

        @Override // androidx.navigation.NavType
        @l
        public List<D> get(@k Bundle bundle, @k String key) {
            g0.p(bundle, "bundle");
            g0.p(key, "key");
            Object obj = bundle.get(key);
            if (obj instanceof List) {
                return (List) obj;
            }
            return null;
        }

        @Override // androidx.navigation.NavType
        public void put(@k Bundle bundle, @k String key, @l List<? extends D> list) {
            g0.p(bundle, "bundle");
            g0.p(key, "key");
            bundle.putSerializable(key, list != null ? new ArrayList(list) : null);
        }

        @Override // androidx.navigation.CollectionNavType
        @k
        public List<String> serializeAsValues(@l List<? extends D> list) {
            if (list == null) {
                return h0.J();
            }
            List<? extends D> list2 = list;
            ArrayList arrayList = new ArrayList(i0.d0(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((Enum) it.next()).toString());
            }
            return arrayList;
        }

        @Override // androidx.navigation.NavType
        public boolean valueEquals(@l List<? extends D> list, @l List<? extends D> list2) {
            return g0.g(list != null ? new ArrayList(list) : null, list2 != null ? new ArrayList(list2) : null);
        }

        @Override // androidx.navigation.NavType
        @k
        public List<D> parseValue(@k String value) {
            g0.p(value, "value");
            return a00.g0.l(this.enumNavType.parseValue(value));
        }

        @Override // androidx.navigation.NavType
        @l
        public List<D> parseValue(@k String value, @l List<? extends D> list) {
            List<D> I4;
            g0.p(value, "value");
            return (list == null || (I4 = r0.I4(list, parseValue(value))) == null) ? parseValue(value) : I4;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SerializableNullableType<D extends Serializable> extends NavType<D> {

        @k
        private final Class<D> type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SerializableNullableType(@k Class<D> type) {
            super(true);
            g0.p(type, "type");
            this.type = type;
            if (Serializable.class.isAssignableFrom(type)) {
                return;
            }
            throw new IllegalArgumentException((type + " does not implement Serializable.").toString());
        }

        public boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof SerializableNullableType) {
                return g0.g(this.type, ((SerializableNullableType) obj).type);
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
            Object obj = bundle.get(key);
            if (obj instanceof Serializable) {
                return (D) obj;
            }
            return null;
        }

        @Override // androidx.navigation.NavType
        @l
        public D parseValue(@k String value) {
            g0.p(value, "value");
            throw new UnsupportedOperationException("Serializables don't support default values.");
        }

        @Override // androidx.navigation.NavType
        public void put(@k Bundle bundle, @k String key, @l D d11) {
            g0.p(bundle, "bundle");
            g0.p(key, "key");
            bundle.putSerializable(key, this.type.cast(d11));
        }
    }

    private InternalNavType() {
    }

    @k
    public final NavType<Boolean> getBoolNullableType() {
        return BoolNullableType;
    }

    @k
    public final NavType<double[]> getDoubleArrayType() {
        return DoubleArrayType;
    }

    @k
    public final NavType<List<Double>> getDoubleListType() {
        return DoubleListType;
    }

    @k
    public final NavType<Double> getDoubleNullableType() {
        return DoubleNullableType;
    }

    @k
    public final NavType<Double> getDoubleType() {
        return DoubleType;
    }

    @k
    public final NavType<Float> getFloatNullableType() {
        return FloatNullableType;
    }

    @k
    public final NavType<Integer> getIntNullableType() {
        return IntNullableType;
    }

    @k
    public final NavType<Long> getLongNullableType() {
        return LongNullableType;
    }

    @k
    public final NavType<String> getStringNonNullableType() {
        return StringNonNullableType;
    }

    @k
    public final NavType<String[]> getStringNullableArrayType() {
        return StringNullableArrayType;
    }

    @k
    public final NavType<List<String>> getStringNullableListType() {
        return StringNullableListType;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nNavTypeConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavTypeConverter.kt\nandroidx/navigation/serialization/InternalNavType$EnumNullableType\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,577:1\n1#2:578\n1282#3,2:579\n*S KotlinDebug\n*F\n+ 1 NavTypeConverter.kt\nandroidx/navigation/serialization/InternalNavType$EnumNullableType\n*L\n527#1:579,2\n*E\n"})
    public static final class EnumNullableType<D extends Enum<?>> extends SerializableNullableType<D> {

        @k
        private final Class<D> type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EnumNullableType(@k Class<D> type) {
            super(type);
            g0.p(type, "type");
            if (type.isEnum()) {
                this.type = type;
                return;
            }
            throw new IllegalArgumentException((type + " is not an Enum type.").toString());
        }

        @Override // androidx.navigation.serialization.InternalNavType.SerializableNullableType, androidx.navigation.NavType
        @k
        public String getName() {
            String name = this.type.getName();
            g0.o(name, "type.name");
            return name;
        }

        @Override // androidx.navigation.serialization.InternalNavType.SerializableNullableType, androidx.navigation.NavType
        @l
        public D parseValue(@k String value) {
            g0.p(value, "value");
            D d11 = null;
            if (g0.g(value, "null")) {
                return null;
            }
            D[] enumConstants = this.type.getEnumConstants();
            g0.m(enumConstants);
            int length = enumConstants.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    break;
                }
                D d12 = enumConstants[i11];
                D d13 = d12;
                g0.m(d13);
                if (f0.c2(d13.name(), value, true)) {
                    d11 = d12;
                    break;
                }
                i11++;
            }
            D d14 = d11;
            if (d14 != null) {
                return d14;
            }
            throw new IllegalArgumentException("Enum value " + value + " not found for type " + this.type.getName() + '.');
        }
    }
}

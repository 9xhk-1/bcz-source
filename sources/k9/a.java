package k9;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.SparseArray;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f66049a = "baicizhandb";

    /* renamed from: b, reason: collision with root package name */
    public static final com.google.gson.d f66050b = new com.google.gson.d();

    /* renamed from: c, reason: collision with root package name */
    public static final Map<Class<?>, String> f66051c;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: k9.a$a, reason: collision with other inner class name */
    public class C0764a<T> implements f<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Class f66052a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Map f66053b;

        public C0764a(final Class val$resultClass, final Map val$columnMap) {
            this.f66052a = val$resultClass;
            this.f66053b = val$columnMap;
        }

        @Override // k9.a.f
        public T a(Cursor cursor) throws Exception {
            return (T) a.g(cursor, this.f66052a, this.f66053b);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b<T> implements f<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Class f66054a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Map f66055b;

        public b(final Class val$resultClass, final Map val$columnMap) {
            this.f66054a = val$resultClass;
            this.f66055b = val$columnMap;
        }

        @Override // k9.a.f
        public T a(Cursor cursor) {
            try {
                return (T) a.g(cursor, this.f66054a, this.f66055b);
            } catch (Exception e11) {
                qb.c.c("baicizhandb", "", e11);
                return null;
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T, K] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c<K, T> implements g<Map<K, T>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Class f66056a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Map f66057b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ h f66058c;

        public c(final Class val$resultClass, final Map val$columnMap, final h val$keyGetter) {
            this.f66056a = val$resultClass;
            this.f66057b = val$columnMap;
            this.f66058c = val$keyGetter;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // k9.a.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map<K, T> a(Map<K, T> result, Cursor cursor) throws Exception {
            Object g11 = a.g(cursor, this.f66056a, this.f66057b);
            result.put(this.f66058c.get(g11), g11);
            return result;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d<T> implements g<SparseArray<T>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Class f66059a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Map f66060b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ h f66061c;

        public d(final Class val$resultClass, final Map val$columnMap, final h val$keyGetter) {
            this.f66059a = val$resultClass;
            this.f66060b = val$columnMap;
            this.f66061c = val$keyGetter;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // k9.a.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public SparseArray<T> a(SparseArray<T> result, Cursor cursor) throws Exception {
            Object g11 = a.g(cursor, this.f66059a, this.f66060b);
            result.put(((Integer) this.f66061c.get(g11)).intValue(), g11);
            return result;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class e<T> implements g<Set<T>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Class f66062a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Map f66063b;

        public e(final Class val$resultClass, final Map val$columnMap) {
            this.f66062a = val$resultClass;
            this.f66063b = val$columnMap;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // k9.a.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Set<T> a(Set<T> result, Cursor cursor) throws Exception {
            result.add(a.g(cursor, this.f66062a, this.f66063b));
            return result;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface f<T> {
        T a(Cursor cursor) throws Exception;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface g<T> {
        T a(T result, Cursor cursor) throws Exception;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface h<K, T> {
        K get(T t11);
    }

    static {
        HashMap hashMap = new HashMap();
        f66051c = hashMap;
        hashMap.put(Integer.TYPE, "getInt");
        hashMap.put(Integer.class, "getInt");
        hashMap.put(Double.TYPE, "getDouble");
        hashMap.put(Double.class, "getDouble");
        hashMap.put(Character.TYPE, "getString");
        hashMap.put(Character.class, "getString");
        hashMap.put(Long.TYPE, "getLong");
        hashMap.put(Long.class, "getLong");
        hashMap.put(Float.TYPE, "getFloat");
        hashMap.put(Float.class, "getFloat");
        hashMap.put(Short.TYPE, "getShort");
        hashMap.put(Short.class, "getShort");
        hashMap.put(byte[].class, "getBlob");
        hashMap.put(Byte[].class, "getBlob");
        hashMap.put(String.class, "getString");
    }

    public static int A(Cursor cursor) {
        try {
            if (j(cursor)) {
                if (cursor != null) {
                    cursor.close();
                }
                return 0;
            }
            cursor.moveToFirst();
            int i11 = cursor.getInt(0);
            cursor.close();
            return i11;
        } catch (Exception unused) {
            if (cursor != null) {
                cursor.close();
            }
            return 0;
        } catch (Throwable th2) {
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }

    public static <T> T B(Cursor cursor, Class<T> cls) {
        try {
            if (j(cursor)) {
                if (cursor != null) {
                    cursor.close();
                }
                return null;
            }
            cursor.moveToFirst();
            T t11 = (T) l(cursor.getString(0), cls);
            cursor.close();
            return t11;
        } catch (Exception unused) {
            if (cursor != null) {
                cursor.close();
            }
            return null;
        } catch (Throwable th2) {
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }

    public static long C(Cursor cursor) {
        try {
            if (j(cursor)) {
                if (cursor != null) {
                    cursor.close();
                }
                return 0L;
            }
            cursor.moveToFirst();
            long j11 = cursor.getInt(0);
            cursor.close();
            return j11;
        } catch (Exception unused) {
            if (cursor != null) {
                cursor.close();
            }
            return 0L;
        } catch (Throwable th2) {
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }

    public static String D(Cursor cursor) {
        try {
            if (j(cursor)) {
                if (cursor != null) {
                    cursor.close();
                }
                return null;
            }
            cursor.moveToFirst();
            String string = cursor.getString(0);
            cursor.close();
            return string;
        } catch (Exception unused) {
            if (cursor != null) {
                cursor.close();
            }
            return null;
        } catch (Throwable th2) {
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }

    public static <T> ContentValues[] b(Collection<T> insts, Class<T> fromClass, Map<String, String> columnMap, String[] fieldNames) throws Exception {
        ContentValues[] contentValuesArr = new ContentValues[insts.size()];
        Iterator<T> it = insts.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            contentValuesArr[i11] = f(it.next(), fromClass, columnMap, fieldNames);
            i11++;
        }
        return contentValuesArr;
    }

    public static <T> ContentValues[] c(Iterator<T> iterator, Class<T> fromClass, Map<String, String> columnMap, String[] fieldNames) throws Exception {
        LinkedList linkedList = new LinkedList();
        while (iterator.hasNext()) {
            linkedList.add(f(iterator.next(), fromClass, columnMap, fieldNames));
        }
        ContentValues[] contentValuesArr = new ContentValues[linkedList.size()];
        linkedList.toArray(contentValuesArr);
        return contentValuesArr;
    }

    public static <T> T d(Cursor cursor, Class<T> cls, int i11) throws Exception {
        String str = f66051c.get(cls);
        if (str == null) {
            return null;
        }
        return (T) cursor.getClass().getMethod(str, Integer.TYPE).invoke(cursor, Integer.valueOf(i11));
    }

    public static <T> T e(Cursor cursor, Class<T> cls, String str) throws Exception {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex == -1) {
            return null;
        }
        return (T) d(cursor, cls, columnIndex);
    }

    public static <T> ContentValues f(T instance, Class<T> fromClass, Map<String, String> columnMap, String[] fieldNames) throws Exception {
        Field[] declaredFields;
        String str;
        ContentValues contentValues = new ContentValues();
        if (fieldNames == null || fieldNames.length == 0) {
            declaredFields = fromClass.getDeclaredFields();
        } else {
            declaredFields = new Field[fieldNames.length];
            for (int i11 = 0; i11 < fieldNames.length; i11++) {
                declaredFields[i11] = fromClass.getDeclaredField(fieldNames[i11]);
            }
        }
        if (declaredFields == null || declaredFields.length == 0) {
            return null;
        }
        AccessibleObject.setAccessible(declaredFields, true);
        for (Field field : declaredFields) {
            int modifiers = field.getModifiers();
            if (!Modifier.isStatic(modifiers) && !Modifier.isTransient(modifiers)) {
                Class<?> type = field.getType();
                String name = field.getName();
                if (columnMap != null) {
                    str = columnMap.get(name);
                    if (str == null) {
                        continue;
                    }
                } else {
                    str = name;
                }
                if (type == Integer.class || type == Integer.TYPE) {
                    contentValues.put(str, Integer.valueOf(field.getInt(instance)));
                } else if (type == Long.class || type == Long.TYPE) {
                    contentValues.put(str, Long.valueOf(field.getLong(instance)));
                } else if (type == String.class) {
                    contentValues.put(str, (String) field.get(instance));
                } else if (type == byte[].class) {
                    contentValues.put(str, (byte[]) field.get(instance));
                } else if (type == Short.class || type == Short.TYPE) {
                    contentValues.put(str, Short.valueOf(field.getShort(instance)));
                } else if (type == Double.class || type == Double.TYPE) {
                    contentValues.put(str, Double.valueOf(field.getDouble(instance)));
                } else if (type == Float.class || type == Float.TYPE) {
                    contentValues.put(str, Float.valueOf(field.getFloat(instance)));
                } else {
                    if (!k9.b.class.isAssignableFrom(type)) {
                        throw new Exception("field[" + name + "] with type " + type.getSimpleName() + " not supported.");
                    }
                    contentValues.put(str, k(field.get(instance)));
                }
            }
        }
        return contentValues;
    }

    public static <T> T g(Cursor cursor, Class<T> cls, Map<String, String> map) throws Exception {
        if (j(cursor)) {
            return null;
        }
        if (k9.b.class.isAssignableFrom(cls)) {
            return (T) l(cursor.getString(0), cls);
        }
        if (f66051c.containsKey(cls)) {
            return (T) d(cursor, cls, 0);
        }
        T newInstance = cls.newInstance();
        i(newInstance, cursor, cls, map);
        return newInstance;
    }

    public static int h(Cursor cursor) {
        if (cursor == null) {
            return 0;
        }
        return cursor.getCount();
    }

    public static <T> void i(T instance, Cursor cursor, Class<T> resultClass, Map<String, String> columnMap) throws Exception {
        String str;
        Object e11;
        Field[] declaredFields = resultClass.getDeclaredFields();
        AccessibleObject.setAccessible(declaredFields, true);
        for (Field field : declaredFields) {
            int modifiers = field.getModifiers();
            if (!Modifier.isStatic(modifiers) && !Modifier.isTransient(modifiers)) {
                Class<?> type = field.getType();
                String name = field.getName();
                if (columnMap == null || (str = columnMap.get(name)) == null) {
                    str = name;
                }
                int columnIndex = cursor.getColumnIndex(str);
                if (columnIndex != -1) {
                    if (k9.b.class.isAssignableFrom(type)) {
                        e11 = l(cursor.getString(columnIndex), type);
                    } else if (f66051c.containsKey(type)) {
                        e11 = e(cursor, type, str);
                    } else {
                        qb.c.d("baicizhandb", "field type " + type.getName() + " not supported", new Object[0]);
                    }
                    if (e11 != null) {
                        try {
                            field.set(instance, e11);
                        } catch (Exception unused) {
                            String str2 = ct.d.f46854h + name.substring(0, 1).toUpperCase(Locale.CHINA);
                            if (name.length() > 1) {
                                str2 = str2 + name.substring(1);
                            }
                            resultClass.getMethod(str2, type).invoke(instance, e11);
                        }
                    }
                }
            }
        }
    }

    public static boolean j(Cursor cursor) {
        return cursor == null || cursor.getCount() == 0;
    }

    public static <T> String k(T column) {
        return column == null ? "" : f66050b.z(column);
    }

    public static <T> T l(String str, Class<T> cls) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (T) f66050b.o(str, bp.a.get((Class) cls).getType());
    }

    public static <T> List<T> m(Cursor cursor, final Class<T> resultClass) {
        return n(cursor, resultClass, null);
    }

    public static <T> List<T> n(Cursor cursor, final Class<T> resultClass, final Map<String, String> columnMap) {
        return o(cursor, new C0764a(resultClass, columnMap));
    }

    public static <T> List<T> o(Cursor cursor, f<T> transformer) {
        try {
            try {
                if (j(cursor)) {
                    List<T> list = Collections.EMPTY_LIST;
                    if (cursor != null) {
                        cursor.close();
                    }
                    return list;
                }
                ArrayList arrayList = new ArrayList(cursor.getCount());
                cursor.moveToFirst();
                while (!cursor.isAfterLast()) {
                    arrayList.add(transformer.a(cursor));
                    cursor.moveToNext();
                }
                cursor.close();
                return arrayList;
            } catch (Exception e11) {
                qb.c.c("baicizhandb", "", e11);
                List<T> list2 = Collections.EMPTY_LIST;
                if (cursor != null) {
                    cursor.close();
                }
                return list2;
            }
        } catch (Throwable th2) {
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }

    public static <T> T p(Cursor cursor, Class<T> cls) {
        return (T) q(cursor, cls, null);
    }

    public static <T> T q(Cursor cursor, Class<T> cls, Map<String, String> map) {
        return (T) r(cursor, new b(cls, map));
    }

    public static <T> T r(Cursor cursor, f<T> transformer) {
        try {
            try {
                if (j(cursor)) {
                    if (cursor != null) {
                        cursor.close();
                    }
                    return null;
                }
                if (cursor.moveToFirst()) {
                    T a11 = transformer.a(cursor);
                    cursor.close();
                    return a11;
                }
                qb.c.d("baicizhandb", "mapToUnique cursor is empty and cannot move.", new Object[0]);
                cursor.close();
                return null;
            } catch (Exception e11) {
                qb.c.c("baicizhandb", "", e11);
                if (cursor != null) {
                    cursor.close();
                }
                return null;
            }
        } catch (Throwable th2) {
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }

    public static <T> T s(Cursor cursor, g<T> reducer, T result) {
        try {
            try {
                if (j(cursor)) {
                    if (cursor != null) {
                        cursor.close();
                    }
                    return result;
                }
                cursor.moveToFirst();
                while (!cursor.isAfterLast()) {
                    result = reducer.a(result, cursor);
                    cursor.moveToNext();
                }
                cursor.close();
                return result;
            } catch (Exception e11) {
                qb.c.c("baicizhandb", "", e11);
                if (cursor != null) {
                    cursor.close();
                }
                return result;
            }
        } catch (Throwable th2) {
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }

    public static <K, T> Map<K, T> t(Cursor cursor, final Class<T> resultClass, final Map<String, String> columnMap, final h<K, T> keyGetter) {
        return (Map) s(cursor, new c(resultClass, columnMap, keyGetter), new HashMap());
    }

    public static <T> Set<T> u(Cursor cursor, final Class<T> resultClass, final Map<String, String> columnMap) {
        return (Set) s(cursor, new e(resultClass, columnMap), new HashSet());
    }

    public static <T> SparseArray<T> v(Cursor cursor, final Class<T> resultClass, final Map<String, String> columnMap, final h<Integer, T> keyGetter) {
        return (SparseArray) s(cursor, new d(resultClass, columnMap, keyGetter), new SparseArray());
    }

    public static int w(Context context, Uri uri, ContentValues[] values, int batchSize) {
        ContentResolver contentResolver = context.getContentResolver();
        if (batchSize <= 0 || values.length <= batchSize) {
            return contentResolver.bulkInsert(uri, values);
        }
        ContentValues[] contentValuesArr = new ContentValues[batchSize];
        int i11 = 0;
        int i12 = 0;
        while (i11 < values.length) {
            int i13 = i11 + batchSize;
            System.arraycopy(values, i11, contentValuesArr, 0, Math.min(values.length, i13) - i11);
            i12 += contentResolver.bulkInsert(uri, contentValuesArr);
            i11 = i13;
        }
        return i12;
    }

    public static byte[] x(Cursor cursor) {
        try {
            try {
                if (j(cursor)) {
                    if (cursor != null) {
                        cursor.close();
                    }
                    return null;
                }
                cursor.moveToFirst();
                byte[] blob = cursor.getBlob(0);
                cursor.close();
                return blob;
            } catch (Exception e11) {
                qb.c.c("baicizhandb", "", e11);
                if (cursor != null) {
                    cursor.close();
                }
                return null;
            }
        } catch (Throwable th2) {
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }

    public static double y(Cursor cursor) {
        try {
            if (j(cursor)) {
                if (cursor != null) {
                    cursor.close();
                }
                return 0.0d;
            }
            cursor.moveToFirst();
            double d11 = cursor.getDouble(0);
            cursor.close();
            return d11;
        } catch (Exception unused) {
            if (cursor != null) {
                cursor.close();
            }
            return 0.0d;
        } catch (Throwable th2) {
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }

    public static float z(Cursor cursor) {
        try {
            if (j(cursor)) {
                return 0.0f;
            }
            cursor.moveToFirst();
            return cursor.getFloat(0);
        } catch (Exception unused) {
            return 0.0f;
        } finally {
            cursor.close();
        }
    }
}

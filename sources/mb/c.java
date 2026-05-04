package mb;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class c {

    /* renamed from: e, reason: collision with root package name */
    public static final Map<Class<?>, String> f73056e;

    /* renamed from: f, reason: collision with root package name */
    public static final int f73057f = 10;

    /* renamed from: a, reason: collision with root package name */
    public SQLiteDatabase f73058a;

    /* renamed from: b, reason: collision with root package name */
    public Cursor f73059b = null;

    /* renamed from: c, reason: collision with root package name */
    public String f73060c;

    /* renamed from: d, reason: collision with root package name */
    public String[] f73061d;

    static {
        HashMap hashMap = new HashMap();
        f73056e = hashMap;
        hashMap.put(Integer.TYPE, "Int");
        hashMap.put(Double.TYPE, Double.class.getSimpleName());
        hashMap.put(Character.TYPE, "String");
        hashMap.put(Long.TYPE, Long.class.getSimpleName());
        hashMap.put(Float.TYPE, Float.class.getSimpleName());
        hashMap.put(Short.TYPE, Short.class.getSimpleName());
        hashMap.put(Integer.class, "Int");
        hashMap.put(Double.class, Double.class.getSimpleName());
        hashMap.put(Character.class, "String");
        hashMap.put(Long.class, Long.class.getSimpleName());
        hashMap.put(Float.class, Float.class.getSimpleName());
        hashMap.put(Short.class, Short.class.getSimpleName());
        hashMap.put(String.class, String.class.getSimpleName());
        hashMap.put(byte[].class, "Blob");
    }

    public c(SQLiteDatabase db2, String sql, Object... args) {
        this.f73061d = null;
        this.f73058a = db2;
        this.f73060c = sql;
        if (args == null || args.length <= 0) {
            return;
        }
        this.f73061d = new String[args.length];
        for (int i11 = 0; i11 < args.length; i11++) {
            String[] strArr = this.f73061d;
            Object obj = args[i11];
            strArr[i11] = obj == null ? null : obj.toString();
        }
    }

    public void a() {
        b();
    }

    public void b() {
        Cursor cursor = this.f73059b;
        if (cursor == null || cursor.isClosed()) {
            return;
        }
        try {
            this.f73059b.close();
        } catch (Exception unused) {
        }
        this.f73059b = null;
    }

    public final <T> T c(Cursor cursor, Class<T> cls, int i11) throws Exception {
        String str = f73056e.get(cls);
        if (str == null) {
            return null;
        }
        return (T) cursor.getClass().getMethod(ct.d.f46852f + str, Integer.TYPE).invoke(cursor, Integer.valueOf(i11));
    }

    public boolean d() throws SQLException {
        String[] strArr = this.f73061d;
        if (strArr == null || strArr.length == 0) {
            this.f73058a.execSQL(this.f73060c);
            return true;
        }
        this.f73058a.execSQL(this.f73060c, strArr);
        return true;
    }

    public int e() throws SQLException {
        String[] strArr = this.f73061d;
        if (strArr == null || strArr.length == 0) {
            this.f73058a.execSQL(this.f73060c);
        } else {
            this.f73058a.execSQL(this.f73060c, strArr);
        }
        return k();
    }

    public Cursor f() throws Exception {
        b();
        Cursor rawQuery = this.f73058a.rawQuery(this.f73060c, this.f73061d);
        this.f73059b = rawQuery;
        return rawQuery;
    }

    public <T> List<T> g(Class<T> resultClass) throws Exception {
        return h(resultClass, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <T> java.util.List<T> h(java.lang.Class<T> r11, int r12) throws java.lang.Exception {
        /*
            r10 = this;
            r10.b()
            android.database.sqlite.SQLiteDatabase r0 = r10.f73058a
            java.lang.String r1 = r10.f73060c
            java.lang.String[] r2 = r10.f73061d
            android.database.Cursor r4 = r0.rawQuery(r1, r2)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.HashSet r8 = new java.util.HashSet     // Catch: java.lang.Throwable -> L8f
            r8.<init>()     // Catch: java.lang.Throwable -> L8f
            int r1 = r4.getColumnCount()     // Catch: java.lang.Throwable -> L8f
            r2 = 0
            r3 = r2
        L1d:
            if (r3 >= r1) goto L62
            java.lang.String r5 = r4.getColumnName(r3)     // Catch: java.lang.Throwable -> L43
            java.lang.String r6 = ""
            java.lang.String r7 = "\\."
            java.lang.String[] r5 = r5.split(r7)     // Catch: java.lang.Throwable -> L43
            r7 = r2
        L2c:
            int r9 = r5.length     // Catch: java.lang.Throwable -> L43
            if (r7 >= r9) goto L5f
            if (r7 <= 0) goto L48
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L43
            r9.<init>()     // Catch: java.lang.Throwable -> L43
            r9.append(r6)     // Catch: java.lang.Throwable -> L43
            java.lang.String r6 = "."
            r9.append(r6)     // Catch: java.lang.Throwable -> L43
            java.lang.String r6 = r9.toString()     // Catch: java.lang.Throwable -> L43
            goto L48
        L43:
            r0 = move-exception
            r11 = r0
            r3 = r10
            goto La1
        L48:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L43
            r9.<init>()     // Catch: java.lang.Throwable -> L43
            r9.append(r6)     // Catch: java.lang.Throwable -> L43
            r6 = r5[r7]     // Catch: java.lang.Throwable -> L43
            r9.append(r6)     // Catch: java.lang.Throwable -> L43
            java.lang.String r6 = r9.toString()     // Catch: java.lang.Throwable -> L43
            r8.add(r6)     // Catch: java.lang.Throwable -> L43
            int r7 = r7 + 1
            goto L2c
        L5f:
            int r3 = r3 + 1
            goto L1d
        L62:
            if (r12 <= 0) goto L65
            goto L68
        L65:
            r12 = 2147483647(0x7fffffff, float:NaN)
        L68:
            boolean r1 = r4.moveToNext()     // Catch: java.lang.Throwable -> L8f
            if (r1 == 0) goto L9c
            int r1 = r12 + (-1)
            if (r12 <= 0) goto L9c
            boolean r12 = r11.isPrimitive()     // Catch: java.lang.Throwable -> L8f
            if (r12 != 0) goto L80
            java.util.Map<java.lang.Class<?>, java.lang.String> r12 = mb.c.f73056e     // Catch: java.lang.Throwable -> L8f
            boolean r12 = r12.containsKey(r11)     // Catch: java.lang.Throwable -> L8f
            if (r12 == 0) goto L83
        L80:
            r3 = r10
            r5 = r11
            goto L92
        L83:
            r6 = 0
            r7 = 0
            r3 = r10
            r5 = r11
            java.lang.Object r11 = r3.n(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L8c
            goto L96
        L8c:
            r0 = move-exception
        L8d:
            r11 = r0
            goto La1
        L8f:
            r0 = move-exception
            r3 = r10
            goto L8d
        L92:
            java.lang.Object r11 = r10.l(r4, r5)     // Catch: java.lang.Throwable -> L8c
        L96:
            r0.add(r11)     // Catch: java.lang.Throwable -> L8c
            r12 = r1
            r11 = r5
            goto L68
        L9c:
            r3 = r10
            r4.close()
            return r0
        La1:
            if (r4 == 0) goto La6
            r4.close()
        La6:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: mb.c.h(java.lang.Class, int):java.util.List");
    }

    public <T> T i(Class<T> resultClass) throws Exception {
        List<T> h11 = h(resultClass, 1);
        if (h11 == null || h11.size() <= 0) {
            return null;
        }
        return h11.get(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003b A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int j() throws java.sql.SQLException {
        /*
            r3 = this;
            java.lang.String[] r0 = r3.f73061d
            if (r0 == 0) goto L10
            int r1 = r0.length
            if (r1 != 0) goto L8
            goto L10
        L8:
            android.database.sqlite.SQLiteDatabase r1 = r3.f73058a
            java.lang.String r2 = r3.f73060c
            r1.execSQL(r2, r0)
            goto L17
        L10:
            android.database.sqlite.SQLiteDatabase r0 = r3.f73058a
            java.lang.String r1 = r3.f73060c
            r0.execSQL(r1)
        L17:
            android.database.sqlite.SQLiteDatabase r0 = r3.f73058a
            java.lang.String r1 = "SELECT changes() AS affected_row_count"
            r2 = 0
            android.database.Cursor r0 = r0.rawQuery(r1, r2)
            if (r0 == 0) goto L38
            boolean r1 = r0.moveToNext()     // Catch: java.lang.Throwable -> L33
            if (r1 == 0) goto L38
            java.lang.String r1 = "affected_row_count"
            int r1 = r0.getColumnIndex(r1)     // Catch: java.lang.Throwable -> L33
            int r1 = r0.getInt(r1)     // Catch: java.lang.Throwable -> L33
            goto L39
        L33:
            r1 = move-exception
            r0.close()
            throw r1
        L38:
            r1 = 0
        L39:
            if (r0 == 0) goto L3e
            r0.close()
        L3e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: mb.c.j():int");
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0022 A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int k() throws java.sql.SQLException {
        /*
            r3 = this;
            r3.b()
            android.database.sqlite.SQLiteDatabase r0 = r3.f73058a
            r1 = 0
            java.lang.String r2 = "SELECT LAST_INSERT_ROWID()"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)
            if (r0 == 0) goto L1f
            boolean r1 = r0.moveToNext()     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto L1f
            r1 = 0
            int r1 = r0.getInt(r1)     // Catch: java.lang.Throwable -> L1a
            goto L20
        L1a:
            r1 = move-exception
            r0.close()
            throw r1
        L1f:
            r1 = -1
        L20:
            if (r0 == 0) goto L25
            r0.close()
        L25:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: mb.c.k():int");
    }

    public final <T> T l(Cursor cursor, Class<T> cls) throws Exception {
        return (T) c(cursor, cls, 0);
    }

    public final <T> T m(Cursor cursor, Class<T> cls, String str) throws Exception {
        return (T) c(cursor, cls, cursor.getColumnIndex(str));
    }

    public final <T> T n(Cursor cursor, Class<T> resultClass, String prefix, int level, final Set<String> columnLabels) throws Exception {
        T t11;
        int i11;
        int i12;
        Object m11;
        T t12 = null;
        if (level >= 10) {
            return null;
        }
        Field[] declaredFields = resultClass.getDeclaredFields();
        if (declaredFields == null || declaredFields.length == 0) {
            return null;
        }
        int i13 = 1;
        AccessibleObject.setAccessible(declaredFields, true);
        T newInstance = resultClass.newInstance();
        String str = prefix == null ? "" : prefix;
        int length = declaredFields.length;
        int i14 = 0;
        int i15 = 0;
        while (i14 < length) {
            Field field = declaredFields[i14];
            String name = field.getName();
            Class<?> type = field.getType();
            try {
                StringBuffer stringBuffer = new StringBuffer();
                int i16 = 0;
                while (i16 < name.length()) {
                    try {
                        char charAt = name.charAt(i16);
                        t11 = t12;
                        if (charAt < 'A' || charAt > 'Z') {
                            i12 = i13;
                            stringBuffer.append(charAt);
                        } else {
                            try {
                                StringBuilder sb2 = new StringBuilder();
                                i12 = i13;
                                try {
                                    sb2.append("_");
                                    sb2.append(Character.toLowerCase(charAt));
                                    stringBuffer.append(sb2.toString());
                                } catch (Exception unused) {
                                }
                            } catch (Exception unused2) {
                                i11 = i13;
                                i14++;
                                i13 = i11;
                                t12 = t11;
                            }
                        }
                        i16++;
                        t12 = t11;
                        i13 = i12;
                    } catch (Exception unused3) {
                        t11 = t12;
                    }
                }
                t11 = t12;
                i12 = i13;
                String str2 = str + stringBuffer.toString();
                if (resultClass.isPrimitive() || f73056e.containsKey(type)) {
                    m11 = m(cursor, type, str2);
                } else if (columnLabels.contains(str2)) {
                    m11 = n(cursor, type, str2 + ".", level + 1, columnLabels);
                } else {
                    m11 = t11;
                }
            } catch (Exception unused4) {
                t11 = t12;
            }
            if (m11 != null) {
                try {
                    try {
                        field.set(newInstance, m11);
                        i15 = i12;
                        i11 = i15;
                    } catch (Exception unused5) {
                    }
                } catch (Exception unused6) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(ct.d.f46854h);
                    try {
                        try {
                            sb3.append(name.substring(0, i12).toUpperCase(Locale.CHINA));
                            String sb4 = sb3.toString();
                            i11 = 1;
                            if (name.length() > 1) {
                                try {
                                    sb4 = sb4 + name.substring(1);
                                } catch (Exception unused7) {
                                }
                            }
                            try {
                                resultClass.getMethod(sb4, type).invoke(newInstance, m11);
                                i15 = 1;
                            } catch (Exception unused8) {
                            }
                        } catch (Exception unused9) {
                            i11 = 1;
                        }
                    } catch (Exception unused10) {
                        i11 = i12;
                    }
                }
                i14++;
                i13 = i11;
                t12 = t11;
            }
            i11 = i12;
            i14++;
            i13 = i11;
            t12 = t11;
        }
        return i15 != 0 ? newInstance : t12;
    }

    public void o(String... args) throws Exception {
        if (args == null || args.length == 0) {
            return;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (String str : args) {
            stringBuffer.append(" " + str);
        }
        this.f73061d = args;
        if (qb.d.b()) {
            qb.c.b("", "sql args %s", stringBuffer.toString());
        }
    }
}

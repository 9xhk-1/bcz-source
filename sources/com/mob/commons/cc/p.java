package com.mob.commons.cc;

import com.mob.commons.cc.i;
import com.mob.commons.cc.o;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.net.URL;
import java.net.URLConnection;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;

/* loaded from: classes7.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    public int f40264a;

    /* renamed from: b, reason: collision with root package name */
    public String f40265b;

    /* renamed from: c, reason: collision with root package name */
    public int f40266c;

    /* renamed from: d, reason: collision with root package name */
    public String f40267d;

    /* renamed from: e, reason: collision with root package name */
    public String f40268e;

    /* renamed from: f, reason: collision with root package name */
    public String f40269f;

    /* renamed from: g, reason: collision with root package name */
    public int f40270g;

    /* renamed from: h, reason: collision with root package name */
    public String f40271h;

    /* renamed from: i, reason: collision with root package name */
    public int f40272i;

    /* renamed from: j, reason: collision with root package name */
    public int f40273j;

    /* renamed from: k, reason: collision with root package name */
    public String f40274k;

    /* renamed from: l, reason: collision with root package name */
    public String f40275l;

    /* renamed from: m, reason: collision with root package name */
    public String f40276m;

    /* renamed from: n, reason: collision with root package name */
    public Object f40277n;

    /* renamed from: o, reason: collision with root package name */
    public int f40278o;

    /* renamed from: p, reason: collision with root package name */
    public String f40279p;

    /* renamed from: q, reason: collision with root package name */
    public int f40280q;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f40281a;

        /* renamed from: b, reason: collision with root package name */
        public j f40282b;

        /* renamed from: c, reason: collision with root package name */
        public List<Object> f40283c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f40284d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f40285e;

        /* renamed from: f, reason: collision with root package name */
        public ArrayList<p> f40286f;

        /* renamed from: g, reason: collision with root package name */
        public ArrayList<Object> f40287g;

        public Object a() {
            return this.f40282b.a();
        }

        public Object b(String str) {
            return this.f40282b.a(str);
        }

        public void a(Object obj) {
            this.f40282b.a(obj);
        }

        public Class<?> a(String str) {
            return this.f40282b.b(str);
        }

        public void a(String str, Class<?> cls) {
            this.f40282b.a(str, cls);
        }

        public void a(String str, Object obj) {
            this.f40282b.a(str, obj);
        }

        public void a(String str, Class<?> cls, Object obj) {
            this.f40282b.a(str, cls, obj);
        }
    }

    public p(int i11) {
        this.f40264a = i11;
    }

    public void a(o.a aVar) throws Throwable {
        switch (this.f40264a) {
            case 1:
                this.f40271h = (String) aVar.a();
                this.f40279p = (String) aVar.a();
                break;
            case 2:
                this.f40277n = aVar.a();
                break;
            case 3:
                this.f40271h = (String) aVar.a();
                break;
            case 4:
                this.f40273j = ((Integer) aVar.a()).intValue();
                break;
            case 5:
                this.f40273j = ((Integer) aVar.a()).intValue();
                break;
            case 6:
                this.f40280q = ((Integer) aVar.a()).intValue();
                break;
            case 7:
                this.f40278o = ((Integer) aVar.a()).intValue();
                break;
            case 9:
                this.f40271h = (String) aVar.a();
                break;
            case 10:
                this.f40267d = (String) aVar.a();
                this.f40268e = (String) aVar.a();
                break;
            case 11:
                this.f40274k = (String) aVar.a();
                break;
            case 12:
                this.f40276m = (String) aVar.a();
                this.f40272i = ((Integer) aVar.a()).intValue();
                break;
            case 13:
                this.f40275l = (String) aVar.a();
                this.f40274k = (String) aVar.a();
                break;
            case 14:
                this.f40275l = (String) aVar.a();
                this.f40276m = (String) aVar.a();
                this.f40272i = ((Integer) aVar.a()).intValue();
                break;
            case 16:
                this.f40272i = ((Integer) aVar.a()).intValue();
                break;
            case 17:
                this.f40275l = (String) aVar.a();
                break;
            case 18:
                this.f40275l = (String) aVar.a();
                this.f40272i = ((Integer) aVar.a()).intValue();
                break;
            case 19:
                this.f40271h = (String) aVar.a();
                break;
            case 20:
                this.f40269f = (String) aVar.a();
                break;
            case 21:
                this.f40269f = (String) aVar.a();
                int intValue = ((Integer) aVar.a()).intValue();
                this.f40270g = intValue;
                this.f40270g = intValue + aVar.b();
                break;
            case 22:
                this.f40269f = (String) aVar.a();
                int intValue2 = ((Integer) aVar.a()).intValue();
                this.f40270g = intValue2;
                this.f40270g = intValue2 + aVar.b();
                break;
            case 24:
                this.f40274k = (String) aVar.a();
                break;
            case 26:
                this.f40275l = (String) aVar.a();
                this.f40274k = (String) aVar.a();
                break;
            case 27:
                this.f40275l = (String) aVar.a();
                break;
            case 29:
                this.f40271h = (String) aVar.a();
                this.f40272i = ((Integer) aVar.a()).intValue();
                break;
            case 31:
                this.f40271h = (String) aVar.a();
                this.f40272i = ((Integer) aVar.a()).intValue();
                break;
            case 32:
                this.f40272i = ((Integer) aVar.a()).intValue();
                break;
            case 35:
                this.f40267d = (String) aVar.a();
                this.f40268e = (String) aVar.a();
                break;
        }
    }

    public void b(Object obj, j jVar) throws Throwable {
        Field field;
        Object a11 = jVar.a();
        if (obj instanceof Map) {
            ((Map) obj).put(this.f40274k, a11);
            return;
        }
        for (Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
            try {
                field = cls.getDeclaredField(this.f40274k);
            } catch (Throwable unused) {
                field = null;
            }
            if (field != null && !Modifier.isStatic(field.getModifiers())) {
                field.setAccessible(true);
                field.set(obj, a11);
                return;
            }
        }
        p pVar = new p(12);
        pVar.f40265b = this.f40265b;
        pVar.f40266c = this.f40266c;
        pVar.f40276m = ct.d.f46854h + Character.toUpperCase(this.f40274k.charAt(0)) + this.f40274k.substring(1);
        pVar.f40272i = 1;
        pVar.a(obj, new Object[]{a11}, jVar);
    }

    public p() {
    }

    public void b(Class<?> cls, j jVar) throws Throwable {
        Field field;
        Object a11 = jVar.a();
        while (cls != null) {
            try {
                field = cls.getDeclaredField(this.f40274k);
            } catch (Throwable unused) {
                field = null;
            }
            if (field != null && Modifier.isStatic(field.getModifiers())) {
                field.setAccessible(true);
                field.set(null, a11);
                return;
            }
            cls = cls.getSuperclass();
        }
        p pVar = new p(14);
        pVar.f40265b = this.f40265b;
        pVar.f40266c = this.f40266c;
        pVar.f40275l = this.f40275l;
        pVar.f40276m = ct.d.f46854h + Character.toUpperCase(this.f40274k.charAt(0)) + this.f40274k.substring(1);
        pVar.f40272i = 1;
        pVar.a(cls, new Object[]{a11}, jVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:454:0x0a32  */
    /* JADX WARN: Removed duplicated region for block: B:461:0x0a7b A[LOOP:11: B:459:0x0a78->B:461:0x0a7b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:465:0x0a88  */
    /* JADX WARN: Removed duplicated region for block: B:472:0x0a9b  */
    /* JADX WARN: Removed duplicated region for block: B:477:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:478:0x0a4b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(com.mob.commons.cc.p.a r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 3608
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mob.commons.cc.p.a(com.mob.commons.cc.p$a):void");
    }

    public void a(Object obj, j jVar) throws Throwable {
        Field field;
        if (obj instanceof Map) {
            jVar.a(((Map) obj).get(this.f40274k));
            return;
        }
        if ("length".equals(this.f40274k) && obj.getClass().isArray()) {
            jVar.a(Integer.valueOf(Array.getLength(obj)));
            return;
        }
        for (Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
            try {
                field = cls.getDeclaredField(this.f40274k);
            } catch (Throwable unused) {
                field = null;
            }
            if (field != null && !Modifier.isStatic(field.getModifiers())) {
                field.setAccessible(true);
                jVar.a(field.get(obj));
                return;
            }
        }
        p pVar = new p(12);
        pVar.f40265b = this.f40265b;
        pVar.f40266c = this.f40266c;
        pVar.f40276m = ct.d.f46852f + Character.toUpperCase(this.f40274k.charAt(0)) + this.f40274k.substring(1);
        pVar.f40272i = 0;
        pVar.a(obj, new Object[0], jVar);
    }

    public void a(Class<?> cls, j jVar) throws Throwable {
        Field field;
        while (true) {
            if (cls != null) {
                if ("class".equals(this.f40274k)) {
                    jVar.a(cls);
                    return;
                }
                if (cls.equals(n.class) && "version".equals(this.f40274k)) {
                    jVar.a(Integer.valueOf(n.f40255a));
                    return;
                }
                if (cls.isEnum()) {
                    Object[] enumConstants = cls.getEnumConstants();
                    if (enumConstants != null) {
                        for (Object obj : enumConstants) {
                            if (((Enum) obj).name().equals(this.f40274k)) {
                                jVar.a(obj);
                                return;
                            }
                        }
                    } else {
                        continue;
                    }
                } else {
                    try {
                        field = cls.getDeclaredField(this.f40274k);
                    } catch (Throwable unused) {
                        field = null;
                    }
                    if (field != null && Modifier.isStatic(field.getModifiers())) {
                        field.setAccessible(true);
                        jVar.a(field.get(null));
                        return;
                    }
                    cls = cls.getSuperclass();
                }
            } else {
                p pVar = new p(14);
                pVar.f40265b = this.f40265b;
                pVar.f40266c = this.f40266c;
                pVar.f40275l = this.f40275l;
                pVar.f40276m = ct.d.f46852f + Character.toUpperCase(this.f40274k.charAt(0)) + this.f40274k.substring(1);
                pVar.f40272i = 1;
                pVar.a(cls, new Object[0], jVar);
                return;
            }
        }
    }

    public void a(Class<?> cls, Object[] objArr, j jVar) throws Throwable {
        int i11;
        q qVar;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Class<?> cls2 = cls;
        int i12 = 0;
        if ("new".equals(this.f40276m)) {
            if (List.class.isAssignableFrom(cls2)) {
                if (objArr.length == 0) {
                    jVar.a(new ArrayList());
                    return;
                }
                if (objArr.length == 1 && objArr[0] == null) {
                    jVar.a(new ArrayList());
                    return;
                }
                if (objArr.length == 1 && (obj6 = objArr[0]) != null && (obj6 instanceof Integer)) {
                    jVar.a(new ArrayList(((Integer) objArr[0]).intValue()));
                    return;
                }
                if (objArr.length == 1 && (obj5 = objArr[0]) != null && (obj5 instanceof Collection)) {
                    jVar.a(new ArrayList((Collection) objArr[0]));
                    return;
                }
                if (objArr.length == 1 && (obj4 = objArr[0]) != null && obj4.getClass().isArray()) {
                    int length = Array.getLength(objArr[0]);
                    ArrayList arrayList = new ArrayList(length);
                    for (int i13 = 0; i13 < length; i13++) {
                        arrayList.add(Array.get(objArr[0], i13));
                    }
                    jVar.a(arrayList);
                    return;
                }
                throw new NoSuchMethodException("method name: new at line: " + this.f40265b + pn.j.f81006c + this.f40266c + pn.j.f81007d);
            }
            if (Map.class.isAssignableFrom(cls2)) {
                if (objArr.length == 0) {
                    jVar.a(new HashMap());
                    return;
                }
                if (objArr.length == 1 && (obj3 = objArr[0]) != null && (obj3 instanceof Map)) {
                    jVar.a(new HashMap((Map) objArr[0]));
                    return;
                }
                if (objArr.length == 1) {
                    HashMap hashMap = new HashMap();
                    Class<?> cls3 = Class.forName("org.json.JSONObject");
                    a((Map) hashMap, a(objArr[0], cls3), cls3, Class.forName("org.json.JSONArray"));
                    jVar.a(hashMap);
                    return;
                }
                if (objArr.length == 2 && (obj = objArr[0]) != null && (obj instanceof Integer) && (obj2 = objArr[1]) != null && (obj2 instanceof Float)) {
                    jVar.a(new HashMap(((Integer) objArr[0]).intValue(), ((Float) objArr[1]).floatValue()));
                    return;
                }
                throw new NoSuchMethodException("method name: new at line: " + this.f40265b + pn.j.f81006c + this.f40266c + pn.j.f81007d);
            }
            if (cls2.equals(r.class)) {
                if (objArr.length == 2) {
                    jVar.a(new r((Number) objArr[0], (Number) objArr[1], null));
                    return;
                }
                if (objArr.length == 3) {
                    jVar.a(new r((Number) objArr[0], (Number) objArr[1], (Number) objArr[2]));
                    return;
                }
                throw new NoSuchMethodException("method name: new at line: " + this.f40265b + pn.j.f81006c + this.f40266c + pn.j.f81007d);
            }
            boolean[][] zArr = new boolean[2][];
            Constructor a11 = k.a(cls2, objArr, zArr);
            if (a11 != null) {
                Object[] a12 = !zArr[1][0] ? k.a(jVar, a11.getParameterTypes(), objArr, zArr[0]) : objArr;
                a11.setAccessible(true);
                jVar.a(a11.newInstance(a12));
                return;
            }
            for (Constructor<?> constructor : cls2.getDeclaredConstructors()) {
                Class<?>[] parameterTypes = constructor.getParameterTypes();
                boolean[] zArr2 = new boolean[1];
                boolean[] a13 = k.a(parameterTypes, objArr, zArr2);
                if (a13 != null) {
                    Object[] a14 = !zArr2[0] ? k.a(jVar, parameterTypes, objArr, a13) : objArr;
                    constructor.setAccessible(true);
                    jVar.a(constructor.newInstance(a14));
                    return;
                }
            }
            throw new NoSuchMethodException("method name: new at line: " + this.f40265b + pn.j.f81006c + this.f40266c + pn.j.f81007d);
        }
        if ("fromJson".equals(this.f40276m) && Map.class.isAssignableFrom(cls2) && objArr.length == 1 && objArr[0] != null) {
            this.f40276m = "new";
            a(cls, objArr, jVar);
            return;
        }
        if ("copy".equals(this.f40276m) && cls2.equals(Array.class)) {
            int i14 = this.f40272i;
            if (i14 == 5) {
                System.arraycopy(objArr[0], Integer.valueOf(String.valueOf(objArr[1])).intValue(), objArr[2], Integer.valueOf(String.valueOf(objArr[3])).intValue(), Integer.valueOf(String.valueOf(objArr[44])).intValue());
            } else if (i14 == 2) {
                Object obj7 = objArr[0];
                System.arraycopy(obj7, 0, objArr[1], 0, Math.min(Array.getLength(obj7), Array.getLength(objArr[1])));
            }
            throw new NoSuchMethodException("method name: copy at line: " + this.f40265b + pn.j.f81006c + this.f40266c + pn.j.f81007d);
        }
        if ("quit".equals(this.f40276m) && cls2.equals(n.class)) {
            jVar.e();
            return;
        }
        Class<?> cls4 = cls2;
        while (true) {
            Class<?> cls5 = Void.TYPE;
            if (cls4 != null) {
                try {
                    qVar = jVar.a(cls4, this.f40276m);
                } catch (Throwable unused) {
                    qVar = null;
                }
                if (qVar != null) {
                    LinkedList<Object> b11 = qVar.b(objArr);
                    if (b11.size() > 0) {
                        jVar.a(b11.get(0));
                        return;
                    }
                    return;
                }
                boolean[][] zArr3 = new boolean[2][];
                Method a15 = k.a(cls4, this.f40276m, true, objArr, zArr3);
                if (a15 != null) {
                    Object[] a16 = !zArr3[1][0] ? k.a(jVar, a15.getParameterTypes(), objArr, zArr3[0]) : objArr;
                    a15.setAccessible(true);
                    if (a15.getReturnType() == cls5) {
                        a15.invoke(null, a16);
                        return;
                    } else {
                        jVar.a(a15.invoke(null, a16));
                        return;
                    }
                }
                cls4 = cls4.getSuperclass();
            } else {
                while (cls2 != null) {
                    Method[] declaredMethods = cls2.getDeclaredMethods();
                    int length2 = declaredMethods.length;
                    int i15 = i12;
                    while (i15 < length2) {
                        Method method = declaredMethods[i15];
                        if (method.getName().equals(this.f40276m) && Modifier.isStatic(method.getModifiers())) {
                            Class<?>[] parameterTypes2 = method.getParameterTypes();
                            boolean[] zArr4 = new boolean[1];
                            i11 = i12;
                            boolean[] a17 = k.a(parameterTypes2, objArr, zArr4);
                            if (a17 != null) {
                                Object[] a18 = !zArr4[i11] ? k.a(jVar, parameterTypes2, objArr, a17) : objArr;
                                method.setAccessible(true);
                                if (method.getReturnType() == cls5) {
                                    method.invoke(null, a18);
                                    return;
                                } else {
                                    jVar.a(method.invoke(null, a18));
                                    return;
                                }
                            }
                        } else {
                            i11 = i12;
                        }
                        i15++;
                        i12 = i11;
                    }
                    cls2 = cls2.getSuperclass();
                }
                throw new NoSuchMethodException("method name: " + this.f40276m + " at line: " + this.f40265b + pn.j.f81006c + this.f40266c + pn.j.f81007d);
            }
        }
    }

    private Object a(Object obj, Class<?> cls) throws Throwable {
        if (obj instanceof ByteArrayOutputStream) {
            return a(((ByteArrayOutputStream) obj).toByteArray(), cls);
        }
        if (obj instanceof byte[]) {
            return a(new String((byte[]) obj, "utf-8"), cls);
        }
        if (!(obj instanceof StringBuffer) && !(obj instanceof StringBuilder)) {
            if (obj instanceof String) {
                return cls.getConstructor(String.class).newInstance(obj);
            }
            if (obj.getClass().equals(cls)) {
                return obj;
            }
            throw new ClassCastException("Failed to cast " + obj + " to be " + cls.getName() + " at line: " + this.f40265b + pn.j.f81006c + this.f40266c + pn.j.f81007d);
        }
        return a(obj.toString(), cls);
    }

    private void a(Map map, Object obj, Class<?> cls, Class<?> cls2) throws Throwable {
        Field declaredField = cls.getDeclaredField("nameValuePairs");
        declaredField.setAccessible(true);
        Map map2 = (Map) declaredField.get(obj);
        Field declaredField2 = cls.getDeclaredField("NULL");
        declaredField2.setAccessible(true);
        Object obj2 = declaredField2.get(null);
        for (Map.Entry entry : map2.entrySet()) {
            map.put(entry.getKey(), a(entry.getValue(), obj2, cls, cls2));
        }
    }

    private Object a(Object obj, Object obj2, Class<?> cls, Class<?> cls2) throws Throwable {
        if (obj == null || obj2.equals(obj)) {
            return null;
        }
        if (obj.getClass().equals(cls)) {
            HashMap hashMap = new HashMap();
            a((Map) hashMap, obj, cls, cls2);
            return hashMap;
        }
        if (!obj.getClass().equals(cls2)) {
            return obj;
        }
        Field declaredField = cls2.getDeclaredField("values");
        declaredField.setAccessible(true);
        List list = (List) declaredField.get(obj);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(a(it.next(), obj2, cls, cls2));
        }
        return arrayList;
    }

    public void a(Object obj, Object[] objArr, j jVar) throws Throwable {
        Object obj2;
        Class<?>[] parameterTypes;
        boolean[] zArr;
        boolean[] a11;
        Object obj3;
        Class<?>[] clsArr;
        int i11 = 0;
        if (vb.a.f93813p.equals(this.f40276m) && objArr.length > 0 && (objArr[0] instanceof q)) {
            synchronized (obj) {
                try {
                    q qVar = (q) objArr[0];
                    int length = objArr.length - 1;
                    Object[] objArr2 = new Object[length];
                    if (objArr.length > 1) {
                        System.arraycopy(objArr, 1, objArr2, 0, length);
                    }
                    LinkedList<Object> b11 = qVar.b(objArr2);
                    if (!b11.isEmpty()) {
                        jVar.a(b11.get(0));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return;
        }
        if (obj instanceof Map) {
            if (("proxy".equals(this.f40276m) || "unsafeProxy".equals(this.f40276m)) && objArr.length == 1 && (obj3 = objArr[0]) != null) {
                if (obj3 instanceof Class) {
                    clsArr = new Class[]{(Class) obj3};
                } else if (obj3 instanceof List) {
                    List list = (List) obj3;
                    clsArr = (Class[]) list.toArray(new Class[list.size()]);
                } else {
                    throw new NoSuchMethodException("method name: " + this.f40276m + " at line: " + this.f40265b + pn.j.f81006c + this.f40266c + pn.j.f81007d);
                }
                jVar.a(jVar.a((Map<?, ?>) obj, "proxy".equals(this.f40276m), clsArr));
                return;
            }
            if ("iterator".equals(this.f40276m) && objArr.length == 0) {
                jVar.a(((Map) obj).entrySet().iterator());
                return;
            }
            if ("toJson".equals(this.f40276m) && objArr.length == 0) {
                jVar.a(Class.forName("org.json.JSONObject").getDeclaredConstructor(Map.class).newInstance(obj));
                return;
            }
            Object obj4 = ((Map) obj).get(this.f40276m);
            if (obj4 != null && (obj4 instanceof q)) {
                LinkedList<Object> b12 = ((q) obj4).b(objArr);
                if (b12.size() > 0) {
                    jVar.a(b12.get(0));
                    return;
                }
                return;
            }
        } else if (obj instanceof Collection) {
            Collection collection = (Collection) obj;
            int size = collection.size();
            if ("toArray".equals(this.f40276m) && objArr.length == 1 && (obj2 = objArr[0]) != null && (obj2 instanceof Class)) {
                Object newInstance = Array.newInstance((Class<?>) obj2, size);
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    Array.set(newInstance, i11, it.next());
                    i11++;
                }
                jVar.a(newInstance);
                return;
            }
        } else if (obj.getClass().isArray()) {
            if ("toList".equals(this.f40276m) && objArr.length == 0) {
                ArrayList arrayList = new ArrayList();
                int length2 = Array.getLength(obj);
                while (i11 < length2) {
                    arrayList.add(Array.get(obj, i11));
                    i11++;
                }
                jVar.a(arrayList);
                return;
            }
        } else if (obj instanceof q) {
            q qVar2 = (q) obj;
            if ("currying".equals(this.f40276m)) {
                jVar.a(qVar2.a(jVar, this.f40265b, this.f40266c));
                return;
            } else if ("test".equals(this.f40276m)) {
                jVar.a(qVar2.a(objArr));
                return;
            }
        }
        Class<?> cls = obj.getClass();
        for (Class<?> cls2 = cls; cls2 != null; cls2 = cls2.getSuperclass()) {
            boolean[][] zArr2 = new boolean[2][];
            Method a12 = k.a(cls2, this.f40276m, false, objArr, zArr2);
            if (a12 != null) {
                if (!zArr2[1][0]) {
                    objArr = k.a(jVar, a12.getParameterTypes(), objArr, zArr2[0]);
                }
                a12.setAccessible(true);
                if (a12.getReturnType() == Void.TYPE) {
                    a12.invoke(obj, objArr);
                    return;
                } else {
                    jVar.a(a12.invoke(obj, objArr));
                    return;
                }
            }
        }
        while (cls != null) {
            for (Method method : cls.getDeclaredMethods()) {
                if (method.getName().equals(this.f40276m) && !Modifier.isStatic(method.getModifiers()) && (a11 = k.a((parameterTypes = method.getParameterTypes()), objArr, (zArr = new boolean[1]))) != null) {
                    if (!zArr[0]) {
                        objArr = k.a(jVar, parameterTypes, objArr, a11);
                    }
                    method.setAccessible(true);
                    if (method.getReturnType() == Void.TYPE) {
                        method.invoke(obj, objArr);
                        return;
                    } else {
                        jVar.a(method.invoke(obj, objArr));
                        return;
                    }
                }
            }
            cls = cls.getSuperclass();
        }
        if (obj instanceof i) {
            i.a aVar = new i.a();
            aVar.f40232a = this.f40276m;
            aVar.f40233b = objArr;
            aVar.f40234c = this.f40265b;
            aVar.f40235d = this.f40266c;
            i.b a13 = ((i) obj).a(aVar);
            if (a13 != null) {
                Throwable th3 = a13.f40238c;
                if (th3 == null) {
                    if (a13.f40237b) {
                        return;
                    }
                    jVar.a(a13.f40236a);
                    return;
                }
                throw th3;
            }
        }
        throw new NoSuchMethodException("method name: " + this.f40276m + " at line: " + this.f40265b + pn.j.f81006c + this.f40266c + pn.j.f81007d);
    }

    private URLConnection a(URL url) throws Throwable {
        URLConnection openConnection = url.openConnection();
        if (openConnection instanceof HttpsURLConnection) {
            Field field = Class.forName("org.apache.http.conn.ssl.SSLSocketFactory").getField("STRICT_HOSTNAME_VERIFIER");
            field.setAccessible(true);
            HostnameVerifier hostnameVerifier = (HostnameVerifier) field.get(null);
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) openConnection;
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            TrustManager[] trustManagerArr = new TrustManager[0];
            try {
                trustManagerArr = new TrustManager[]{(TrustManager) k.b(httpsURLConnection.getURL().getHost())};
            } catch (Throwable unused) {
            }
            sSLContext.init(null, trustManagerArr, new SecureRandom());
            httpsURLConnection.setSSLSocketFactory(sSLContext.getSocketFactory());
            httpsURLConnection.setHostnameVerifier(hostnameVerifier);
        }
        return openConnection;
    }
}

package com.mob.commons.cc;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Stack;

/* loaded from: classes7.dex */
public class j {

    /* renamed from: b, reason: collision with root package name */
    private HashMap<String, Object> f40240b;

    /* renamed from: f, reason: collision with root package name */
    private j f40244f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f40245g;

    /* renamed from: a, reason: collision with root package name */
    private Stack<Object> f40239a = new Stack<>();

    /* renamed from: c, reason: collision with root package name */
    private HashMap<String, Class<?>> f40241c = new HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private HashMap<String, Class<?>> f40242d = new HashMap<>();

    /* renamed from: e, reason: collision with root package name */
    private HashMap<String, HashMap<String, q>> f40243e = new HashMap<>();

    public j(HashMap<String, Object> hashMap) {
        this.f40240b = new HashMap<>(hashMap);
    }

    private Object b(Class<?> cls, Object obj) {
        if (cls.equals(Short.class) && (obj instanceof Byte)) {
            return Short.valueOf(((Byte) obj).shortValue());
        }
        if (cls.equals(Integer.class) && ((obj instanceof Byte) || (obj instanceof Short))) {
            return Integer.valueOf(String.valueOf(obj));
        }
        if (cls.equals(Long.class) && ((obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Integer))) {
            return Long.valueOf(String.valueOf(obj));
        }
        if (cls.equals(Float.class) && ((obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long))) {
            return Float.valueOf(String.valueOf(obj));
        }
        if (cls.equals(Double.class) && ((obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Float))) {
            return Double.valueOf(String.valueOf(obj));
        }
        if (cls.equals(BigInteger.class) && ((obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Float) || (obj instanceof Double))) {
            return new BigInteger(String.valueOf(obj));
        }
        if (cls.equals(BigDecimal.class) && ((obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Float) || (obj instanceof Double) || (obj instanceof BigInteger))) {
            return new BigDecimal(String.valueOf(obj));
        }
        if (a(cls, obj)) {
            return obj;
        }
        throw new RuntimeException("Type not match! Require " + cls.getName() + " but found " + obj.getClass().getName());
    }

    public void a(Object obj) {
        this.f40239a.push(obj);
    }

    public j c() {
        return this.f40244f;
    }

    public int d() {
        return this.f40239a.size();
    }

    public void e() {
        this.f40245g = true;
    }

    public boolean f() {
        return this.f40245g;
    }

    public Object a() {
        return this.f40239a.pop();
    }

    public void a(String str, Class<?> cls, Object obj) {
        if (!this.f40240b.containsKey(str)) {
            if (cls != null && obj != null) {
                obj = b(cls, obj);
            }
            this.f40240b.put(str, obj);
            if (cls != null) {
                this.f40241c.put(str, cls);
                return;
            }
            return;
        }
        throw new RuntimeException("\"" + str + "\" has defined");
    }

    private boolean a(Class<?> cls, Object obj) {
        if (cls == null) {
            return true;
        }
        if ((cls.equals(Double.TYPE) && obj != null && (obj instanceof Double)) || ((cls.equals(Float.TYPE) && obj != null && (obj instanceof Float)) || ((cls.equals(Long.TYPE) && obj != null && (obj instanceof Long)) || ((cls.equals(Integer.TYPE) && obj != null && (obj instanceof Integer)) || ((cls.equals(Short.TYPE) && obj != null && (obj instanceof Short)) || ((cls.equals(Byte.TYPE) && obj != null && (obj instanceof Byte)) || ((cls.equals(Boolean.TYPE) && obj != null && (obj instanceof Boolean)) || (cls.equals(Character.TYPE) && obj != null && (obj instanceof Character))))))))) {
            return true;
        }
        return cls.isInstance(obj);
    }

    public void a(String str, Object obj) {
        if (this.f40240b.containsKey(str)) {
            Class<?> cls = this.f40241c.get(str);
            if (cls != null && obj != null) {
                obj = b(cls, obj);
            }
            this.f40240b.put(str, obj);
            return;
        }
        if (this.f40244f != null) {
            Class<?> cls2 = this.f40241c.get(str);
            if (cls2 != null && cls2.isInstance(obj)) {
                throw new RuntimeException("Type not match! Require " + cls2.getName());
            }
            this.f40244f.a(str, obj);
            return;
        }
        throw new RuntimeException("\"" + str + "\" has not defined");
    }

    public Class<?> b(String str) {
        for (j jVar = this; jVar != null; jVar = jVar.f40244f) {
            if (jVar.f40242d.containsKey(str)) {
                return jVar.f40242d.get(str);
            }
        }
        throw new RuntimeException("Can not find class " + str);
    }

    public j b() {
        j jVar = new j(new HashMap());
        jVar.f40244f = this;
        return jVar;
    }

    public Object a(String str) {
        for (j jVar = this; jVar != null; jVar = jVar.f40244f) {
            if (jVar.f40240b.containsKey(str)) {
                return jVar.f40240b.get(str);
            }
        }
        throw new RuntimeException("Can not find \"" + str + "\"");
    }

    public void a(String str, Class<?> cls) {
        this.f40242d.put(str, cls);
    }

    public void a(Class<?> cls, String str, q qVar) {
        if (!"new".equals(str)) {
            HashMap<String, q> hashMap = this.f40243e.get(cls.getName());
            if (hashMap == null) {
                hashMap = new HashMap<>();
                this.f40243e.put(cls.getName(), hashMap);
            }
            hashMap.put(str, qVar);
            return;
        }
        throw new RuntimeException("Can not override \"new\" method");
    }

    public q a(Class<?> cls, String str) throws Throwable {
        HashMap<String, q> hashMap = this.f40243e.get(cls.getName());
        if (hashMap != null) {
            q qVar = hashMap.get(str);
            if (qVar != null) {
                return qVar;
            }
            throw new NoSuchMethodError();
        }
        throw new NoSuchMethodError();
    }

    public Object a(final Map<?, ?> map, final boolean z11, Class<?>... clsArr) {
        return Proxy.newProxyInstance(getClass().getClassLoader(), clsArr, new InvocationHandler() { // from class: com.mob.commons.cc.j.1
            @Override // java.lang.reflect.InvocationHandler
            public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
                try {
                    q qVar = (q) map.get(method.getName());
                    if (qVar != null) {
                        if (objArr == null) {
                            objArr = new Object[0];
                        }
                        LinkedList<Object> b11 = z11 ? qVar.b(objArr) : qVar.b(objArr);
                        if (b11.isEmpty()) {
                            return null;
                        }
                        return b11.get(0);
                    }
                } catch (Throwable unused) {
                }
                Throwable th2 = null;
                if (th2 == null) {
                    return null;
                }
                throw th2;
            }
        });
    }
}

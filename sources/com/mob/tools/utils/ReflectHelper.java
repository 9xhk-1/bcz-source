package com.mob.tools.utils;

import android.content.BroadcastReceiver;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import com.mob.commons.a.l;
import com.mob.tools.proguard.PublicMemberKeeper;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public class ReflectHelper implements PublicMemberKeeper {

    /* renamed from: a, reason: collision with root package name */
    private static HashSet<String> f41397a;

    /* renamed from: b, reason: collision with root package name */
    private static HashMap<String, Class<?>> f41398b;

    /* renamed from: c, reason: collision with root package name */
    private static HashMap<Class<?>, String> f41399c;

    /* renamed from: d, reason: collision with root package name */
    private static LinkedHashMap<String, Method> f41400d;

    /* renamed from: e, reason: collision with root package name */
    private static LinkedHashMap<String, Constructor<?>> f41401e;

    public interface a<ArgType, RetType> {
        RetType a(ArgType argtype);
    }

    static {
        HashSet<String> hashSet = new HashSet<>();
        f41397a = hashSet;
        hashSet.add(l.a("0090igeg4k;egfmfeegelgg"));
        f41397a.add(l.a("007^igeg(k<egfmeffd"));
        f41397a.add(l.a("008NigegQkAegfmeleffd"));
        f41397a.add("java.net");
        f41397a.add(l.a("0096igeg0k)egfmed7e;effe"));
        HashMap<String, Class<?>> hashMap = new HashMap<>();
        f41398b = hashMap;
        hashMap.put(l.a("006i*fdedgdfe;j"), Double.TYPE);
        f41398b.put(l.a("005!gifefdeg'e"), Float.TYPE);
        f41398b.put("long", Long.TYPE);
        f41398b.put(l.a("003,efelHe"), Integer.TYPE);
        f41398b.put("short", Short.TYPE);
        f41398b.put("byte", Byte.TYPE);
        f41398b.put(l.a("004%ehMdKegei"), Character.TYPE);
        f41398b.put(TypedValues.Custom.S_BOOLEAN, Boolean.TYPE);
        f41398b.put("Object", Object.class);
        f41398b.put("String", String.class);
        f41398b.put("Thread", Thread.class);
        f41398b.put(l.a("008]heedeleleggdfe*j"), Runnable.class);
        f41398b.put(l.a("006VfiejghAejm"), System.class);
        f41398b.put(l.a("006iCfdedgdfe$j"), Double.class);
        f41398b.put("Float", Float.class);
        f41398b.put("Long", Long.class);
        f41398b.put("Integer", Integer.class);
        f41398b.put(l.a("005@fi(dEfdeiBe"), Short.class);
        f41398b.put("Byte", Byte.class);
        f41398b.put(l.a("009)hgBd]egeiegeh0ejOei"), Character.class);
        f41398b.put("Boolean", Boolean.class);
        f41399c = new HashMap<>();
        for (Map.Entry<String, Class<?>> entry : f41398b.entrySet()) {
            f41399c.put(entry.getValue(), entry.getKey());
        }
        f41400d = new LinkedHashMap<String, Method>() { // from class: com.mob.tools.utils.ReflectHelper.1
            @Override // java.util.LinkedHashMap
            public boolean removeEldestEntry(Map.Entry<String, Method> entry2) {
                return size() > 10;
            }
        };
        f41401e = new LinkedHashMap<String, Constructor<?>>() { // from class: com.mob.tools.utils.ReflectHelper.2
            @Override // java.util.LinkedHashMap
            public boolean removeEldestEntry(Map.Entry<String, Constructor<?>> entry2) {
                return size() > 10;
            }
        };
    }

    private static synchronized Class<?> a(String str) {
        Class<?> cls;
        synchronized (ReflectHelper.class) {
            cls = f41398b.get(str);
            if (cls == null) {
                Iterator<String> it = f41397a.iterator();
                while (it.hasNext()) {
                    try {
                        importClass(it.next() + "." + str);
                    } catch (Throwable unused) {
                    }
                    cls = f41398b.get(str);
                    if (cls != null) {
                        break;
                    }
                }
            }
        }
        return cls;
    }

    private static boolean b(Class<?>[] clsArr, Class<?>[] clsArr2) {
        if (clsArr.length - clsArr2.length == 1) {
            int i11 = 0;
            while (true) {
                if (i11 < clsArr2.length) {
                    Class<?> cls = clsArr2[i11];
                    if (cls != null && !a(clsArr[i11], cls) && !clsArr[i11].isAssignableFrom(clsArr2[i11])) {
                        break;
                    }
                    i11++;
                } else if (clsArr[clsArr.length - 1].isArray()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static Object createProxy(HashMap<String, a<Object, Object[]>> hashMap, Class<?>... clsArr) throws Throwable {
        HashMap hashMap2 = new HashMap();
        for (final Map.Entry<String, a<Object, Object[]>> entry : hashMap.entrySet()) {
            hashMap2.put(entry.getKey(), new a<Object[], Object>() { // from class: com.mob.tools.utils.ReflectHelper.3
                @Override // com.mob.tools.utils.ReflectHelper.a
                public Object a(Object[] objArr) {
                    return ((Object[]) ((a) entry.getValue()).a(objArr))[0];
                }
            });
        }
        return createProxy((Map<String, a<Object[], Object>>) hashMap2, clsArr);
    }

    public static Class<?> getClass(String str) throws Throwable {
        Class<?> a11 = a(str);
        if (a11 != null) {
            return a11;
        }
        try {
            a11 = Class.forName(str);
            f41398b.put(str, a11);
            return a11;
        } catch (Throwable unused) {
            return a11;
        }
    }

    public static <T> T getInstanceField(Object obj, String str) throws Throwable {
        try {
            return (T) a(obj, str);
        } catch (Throwable th2) {
            if (th2 instanceof NoSuchFieldException) {
                throw th2;
            }
            throw new Throwable("className: " + obj.getClass() + ", fieldName: " + str, th2);
        }
    }

    public static String getName(Class<?> cls) throws Throwable {
        String str = f41399c.get(cls);
        if (str == null) {
            str = cls.getSimpleName();
            if (f41398b.containsKey(str)) {
                f41399c.remove(f41398b.get(str));
            }
            f41398b.put(str, cls);
            f41399c.put(cls, str);
        }
        return str;
    }

    public static <T> T getStaticField(String str, String str2) throws Throwable {
        try {
            return (T) a(str, str2);
        } catch (Throwable th2) {
            if (th2 instanceof NoSuchFieldException) {
                throw th2;
            }
            throw new Throwable("className: " + str + ", fieldName: " + str2, th2);
        }
    }

    public static String importClass(String str) throws Throwable {
        return importClass(null, str);
    }

    public static <T> T invokeInstanceMethod(Object obj, String str, Object[] objArr, Class<?>[] clsArr) throws Throwable {
        return (T) a(null, obj, str, objArr, clsArr);
    }

    public static <T> T invokeStaticMethod(String str, String str2, Object[] objArr, Class<?>[] clsArr) throws Throwable {
        return (T) a(str, null, str2, objArr, clsArr);
    }

    public static Object newInstance(String str, Object... objArr) throws Throwable {
        try {
            return a(str, objArr);
        } catch (Throwable th2) {
            if (th2 instanceof NoSuchMethodException) {
                throw th2;
            }
            throw new Throwable("className: " + str + ", methodName: <init>", th2);
        }
    }

    public static void setInstanceField(Object obj, String str, Object obj2) throws Throwable {
        try {
            a(obj, str, obj2);
        } catch (Throwable th2) {
            if (th2 instanceof NoSuchFieldException) {
                throw th2;
            }
            throw new Throwable("className: " + obj.getClass() + ", fieldName: " + str + ", value: " + String.valueOf(obj2), th2);
        }
    }

    public static void setStaticField(String str, String str2, Object obj) throws Throwable {
        try {
            a(str, str2, obj);
        } catch (Throwable th2) {
            if (th2 instanceof NoSuchFieldException) {
                throw th2;
            }
            throw new Throwable("className: " + str + ", fieldName: " + str2 + ", value: " + String.valueOf(obj), th2);
        }
    }

    public static synchronized String importClass(String str, String str2) throws Throwable {
        synchronized (ReflectHelper.class) {
            if (str2.endsWith(".*")) {
                f41397a.add(str2.substring(0, str2.length() - 2));
                return "*";
            }
            Class<?> cls = Class.forName(str2);
            if (str == null) {
                str = cls.getSimpleName();
            }
            if (f41398b.containsKey(str)) {
                f41399c.remove(f41398b.get(str));
            }
            f41398b.put(str, cls);
            f41399c.put(cls, str);
            return str;
        }
    }

    public static <T> T invokeInstanceMethod(Object obj, String str, Object... objArr) throws Throwable {
        try {
            return (T) a(null, obj, str, objArr);
        } catch (Throwable th2) {
            if (th2 instanceof NoSuchMethodException) {
                throw th2;
            }
            throw new Throwable("className: " + obj.getClass() + ", methodName: " + str, th2);
        }
    }

    public static <T> T invokeStaticMethod(String str, String str2, Object... objArr) throws Throwable {
        try {
            return (T) a(str, null, str2, objArr);
        } catch (Throwable th2) {
            if (th2 instanceof NoSuchMethodException) {
                throw th2;
            }
            throw new Throwable("className: " + str + ", methodName: " + str2, th2);
        }
    }

    public static Object createProxy(final Map<String, a<Object[], Object>> map, Class<?>... clsArr) throws Throwable {
        if (clsArr.length == 0) {
            return null;
        }
        return Proxy.newProxyInstance(clsArr[0].getClassLoader(), clsArr, new InvocationHandler() { // from class: com.mob.tools.utils.ReflectHelper.4
            @Override // java.lang.reflect.InvocationHandler
            public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
                a aVar = (a) map.get(method.getName());
                if (aVar != null) {
                    return aVar.a(objArr);
                }
                throw new NoSuchMethodException();
            }
        });
    }

    private static Class<?>[] a(Object[] objArr) {
        Class<?>[] clsArr = new Class[objArr.length];
        for (int i11 = 0; i11 < objArr.length; i11++) {
            Object obj = objArr[i11];
            if (obj instanceof BroadcastReceiver) {
                clsArr[i11] = BroadcastReceiver.class;
            } else {
                clsArr[i11] = obj == null ? null : obj.getClass();
            }
        }
        return clsArr;
    }

    private static Object b(String str, Object... objArr) throws Throwable {
        Class<?> a11;
        String str2 = str;
        int i11 = 0;
        while (str2.startsWith("[")) {
            i11++;
            str2 = str2.substring(1);
        }
        int[] iArr = null;
        if (i11 == objArr.length) {
            int[] iArr2 = new int[i11];
            for (int i12 = 0; i12 < i11; i12++) {
                try {
                    iArr2[i12] = Integer.parseInt(String.valueOf(objArr[i12]));
                } catch (Throwable unused) {
                }
            }
            iArr = iArr2;
        }
        if (iArr != null) {
            if ("B".equals(str2)) {
                a11 = Byte.TYPE;
            } else if (ExifInterface.LATITUDE_SOUTH.equals(str2)) {
                a11 = Short.TYPE;
            } else if ("I".equals(str2)) {
                a11 = Integer.TYPE;
            } else if ("J".equals(str2)) {
                a11 = Long.TYPE;
            } else if ("F".equals(str2)) {
                a11 = Float.TYPE;
            } else if ("D".equals(str2)) {
                a11 = Double.TYPE;
            } else if ("Z".equals(str2)) {
                a11 = Boolean.TYPE;
            } else if ("C".equals(str2)) {
                a11 = Character.TYPE;
            } else {
                a11 = a(str2);
            }
            if (a11 != null) {
                return Array.newInstance(a11, iArr);
            }
        }
        throw new NoSuchMethodException("className: [" + str + ", methodName: <init>");
    }

    private static boolean a(Class<?> cls, Class<?> cls2) {
        if (cls == Byte.TYPE && cls2 == Byte.class) {
            return true;
        }
        if (cls == Short.TYPE && (cls2 == Short.class || cls2 == Byte.class || cls2 == Character.class)) {
            return true;
        }
        if (cls == Character.TYPE && (cls2 == Character.class || cls2 == Short.class || cls2 == Byte.class)) {
            return true;
        }
        if (cls == Integer.TYPE && (cls2 == Integer.class || cls2 == Short.class || cls2 == Byte.class || cls2 == Character.class)) {
            return true;
        }
        if (cls == Long.TYPE && (cls2 == Long.class || cls2 == Integer.class || cls2 == Short.class || cls2 == Byte.class || cls2 == Character.class)) {
            return true;
        }
        if (cls == Float.TYPE && (cls2 == Float.class || cls2 == Long.class || cls2 == Integer.class || cls2 == Short.class || cls2 == Byte.class || cls2 == Character.class)) {
            return true;
        }
        if (cls == Double.TYPE && (cls2 == Double.class || cls2 == Float.class || cls2 == Long.class || cls2 == Integer.class || cls2 == Short.class || cls2 == Byte.class || cls2 == Character.class)) {
            return true;
        }
        return cls == Boolean.TYPE && cls2 == Boolean.class;
    }

    private static boolean a(Class<?>[] clsArr, Class<?>[] clsArr2) {
        if (clsArr.length != clsArr2.length) {
            return false;
        }
        for (int i11 = 0; i11 < clsArr2.length; i11++) {
            Class<?> cls = clsArr2[i11];
            if (cls != null && !a(clsArr[i11], cls) && !clsArr[i11].isAssignableFrom(clsArr2[i11])) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d7, code lost:
    
        r0 = r0 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.Object a(java.lang.String r13, java.lang.Object... r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mob.tools.utils.ReflectHelper.a(java.lang.String, java.lang.Object[]):java.lang.Object");
    }

    private static Object b(Object obj, String str) throws Throwable {
        int i11;
        int i12;
        if (obj instanceof List) {
            if (str.startsWith("[") && str.endsWith("]")) {
                try {
                    i12 = Integer.parseInt(str.substring(1, str.length() - 1));
                } catch (Throwable unused) {
                    i12 = -1;
                }
                if (i12 != -1) {
                    return ((List) obj).get(i12);
                }
            }
        } else {
            if (l.a("006=fe:jSelggPed").equals(str)) {
                return Integer.valueOf(Array.getLength(obj));
            }
            if (str.startsWith("[") && str.endsWith("]")) {
                try {
                    i11 = Integer.parseInt(str.substring(1, str.length() - 1));
                } catch (Throwable unused2) {
                    i11 = -1;
                }
                if (i11 != -1) {
                    return Array.get(obj, i11);
                }
            }
        }
        throw new NoSuchFieldException("className: " + obj.getClass() + ", fieldName: " + str);
    }

    private static void b(Object obj, String str, Object obj2) throws Throwable {
        int i11;
        int i12;
        if (obj instanceof List) {
            if (str.startsWith("[") && str.endsWith("]")) {
                try {
                    i12 = Integer.parseInt(str.substring(1, str.length() - 1));
                } catch (Throwable unused) {
                    i12 = -1;
                }
                if (i12 != -1) {
                    ((List) obj).set(i12, obj2);
                    return;
                }
            }
        } else if (str.startsWith("[") && str.endsWith("]")) {
            try {
                i11 = Integer.parseInt(str.substring(1, str.length() - 1));
            } catch (Throwable unused2) {
                i11 = -1;
            }
            if (i11 != -1) {
                String name = obj.getClass().getName();
                while (name.startsWith("[")) {
                    name = name.substring(1);
                }
                Class<?> cls = obj2.getClass();
                if (!"B".equals(name)) {
                    Object obj3 = null;
                    if (ExifInterface.LATITUDE_SOUTH.equals(name)) {
                        if (cls == Short.class) {
                            obj3 = obj2;
                        } else if (cls == Byte.class) {
                            obj3 = Short.valueOf(((Byte) obj2).byteValue());
                        }
                        if (obj3 != null) {
                            Array.set(obj, i11, obj3);
                            return;
                        }
                    } else if ("I".equals(name)) {
                        if (cls == Integer.class) {
                            obj3 = obj2;
                        } else if (cls == Short.class) {
                            obj3 = Integer.valueOf(((Short) obj2).shortValue());
                        } else if (cls == Byte.class) {
                            obj3 = Integer.valueOf(((Byte) obj2).byteValue());
                        }
                        if (obj3 != null) {
                            Array.set(obj, i11, obj3);
                            return;
                        }
                    } else if ("J".equals(name)) {
                        if (cls == Long.class) {
                            obj3 = obj2;
                        } else if (cls == Integer.class) {
                            obj3 = Long.valueOf(((Integer) obj2).intValue());
                        } else if (cls == Short.class) {
                            obj3 = Long.valueOf(((Short) obj2).shortValue());
                        } else if (cls == Byte.class) {
                            obj3 = Long.valueOf(((Byte) obj2).byteValue());
                        }
                        if (obj3 != null) {
                            Array.set(obj, i11, obj3);
                            return;
                        }
                    } else if ("F".equals(name)) {
                        if (cls == Float.class) {
                            obj3 = obj2;
                        } else if (cls == Long.class) {
                            obj3 = Float.valueOf(((Long) obj2).longValue());
                        } else if (cls == Integer.class) {
                            obj3 = Float.valueOf(((Integer) obj2).intValue());
                        } else if (cls == Short.class) {
                            obj3 = Float.valueOf(((Short) obj2).shortValue());
                        } else if (cls == Byte.class) {
                            obj3 = Float.valueOf(((Byte) obj2).byteValue());
                        }
                        if (obj3 != null) {
                            Array.set(obj, i11, obj3);
                            return;
                        }
                    } else if ("D".equals(name)) {
                        if (cls == Double.class) {
                            obj3 = obj2;
                        } else if (cls == Float.class) {
                            obj3 = Double.valueOf(((Float) obj2).floatValue());
                        } else if (cls == Long.class) {
                            obj3 = Double.valueOf(((Long) obj2).longValue());
                        } else if (cls == Integer.class) {
                            obj3 = Double.valueOf(((Integer) obj2).intValue());
                        } else if (cls == Short.class) {
                            obj3 = Double.valueOf(((Short) obj2).shortValue());
                        } else if (cls == Byte.class) {
                            obj3 = Double.valueOf(((Byte) obj2).byteValue());
                        }
                        if (obj3 != null) {
                            Array.set(obj, i11, obj3);
                            return;
                        }
                    } else if ("Z".equals(name)) {
                        if (cls == Boolean.class) {
                            Array.set(obj, i11, obj2);
                            return;
                        }
                    } else if ("C".equals(name)) {
                        if (cls == Character.class) {
                            Array.set(obj, i11, obj2);
                            return;
                        }
                    } else if (name.equals(cls.getName())) {
                        Array.set(obj, i11, obj2);
                        return;
                    }
                } else if (cls == Byte.class) {
                    Array.set(obj, i11, obj2);
                    return;
                }
            }
        }
        throw new NoSuchFieldException("className: " + obj.getClass() + ", fieldName: " + str + ", value: " + String.valueOf(obj2));
    }

    private static <T> T a(String str, Object obj, String str2, Object[] objArr, Class<?>[] clsArr) throws Throwable {
        Class<?> cls;
        if (objArr == null) {
            objArr = new Object[0];
        }
        if (clsArr == null) {
            clsArr = new Class[0];
        }
        if (obj == null) {
            cls = a(str);
        } else {
            cls = obj.getClass();
        }
        String str3 = cls.getName() + "#" + str2 + "#" + objArr.length;
        Method method = f41400d.get(str3);
        Class<?> cls2 = Void.TYPE;
        if (method != null) {
            method.setAccessible(true);
            if (method.getReturnType() == cls2) {
                method.invoke(obj, objArr);
                return null;
            }
            return (T) method.invoke(obj, objArr);
        }
        while (cls != null) {
            try {
                Method declaredMethod = cls.getDeclaredMethod(str2, clsArr);
                f41400d.put(str3, declaredMethod);
                declaredMethod.setAccessible(true);
                if (declaredMethod.getReturnType() == cls2) {
                    declaredMethod.invoke(obj, objArr);
                    return null;
                }
                return (T) declaredMethod.invoke(obj, objArr);
            } catch (InvocationTargetException e11) {
                throw e11;
            } catch (Throwable unused) {
                cls = cls.getSuperclass();
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("className: ");
        Object obj2 = str;
        if (obj != null) {
            obj2 = obj.getClass();
        }
        sb2.append(obj2);
        sb2.append(", methodName: ");
        sb2.append(str2);
        throw new NoSuchMethodException(sb2.toString());
    }

    private static <T> T a(String str, Object obj, String str2, Object... objArr) throws Throwable {
        Class<?> cls;
        Class<?>[] a11;
        if (obj == null) {
            cls = a(str);
        } else {
            cls = obj.getClass();
        }
        boolean z11 = false;
        if (str2.equals(l.a("009VggYje@hiXjed5fd4i")) && objArr != null && objArr.length == 2) {
            a11 = new Class[]{String.class, Class[].class};
            if (objArr[1] == String.class) {
                objArr[1] = new Class[]{String.class};
            }
        } else {
            a11 = (str2.equals(l.a("011Ggg<jeWgj$jk0efeh.jZfh7i")) && objArr != null && objArr.length == 1) ? new Class[]{Integer.TYPE} : (str2.equals(l.a("006)efel'kOfdekBj")) && objArr != null && objArr.length == 2) ? new Class[]{Object.class, Object[].class} : (str2.equals(l.a("013!gh2jeFfkeheh>j9ghghefgdfe:j")) && objArr != null && objArr.length == 1) ? new Class[]{Boolean.TYPE} : a(objArr);
        }
        StringBuffer stringBuffer = new StringBuffer();
        int length = a11.length;
        for (int i11 = 0; i11 < length; i11++) {
            Class<?> cls2 = a11[i11];
            stringBuffer.append(cls2 == null ? "" : cls2.getName());
        }
        String str3 = cls.getName() + "#" + str2 + "#" + objArr.length + stringBuffer.toString();
        Method method = f41400d.get(str3);
        Class<?> cls3 = Void.TYPE;
        if (method != null) {
            boolean isStatic = Modifier.isStatic(method.getModifiers());
            if (obj == null) {
                z11 = isStatic;
            } else if (!isStatic) {
                z11 = true;
            }
            if (z11 && a(method.getParameterTypes(), a11)) {
                method.setAccessible(true);
                if (method.getReturnType() == cls3) {
                    method.invoke(obj, objArr);
                    return null;
                }
                return (T) method.invoke(obj, objArr);
            }
        }
        while (cls != null) {
            try {
                Method declaredMethod = cls.getDeclaredMethod(str2, a11);
                f41400d.put(str3, declaredMethod);
                declaredMethod.setAccessible(true);
                if (declaredMethod.getReturnType() == cls3) {
                    declaredMethod.invoke(obj, objArr);
                    return null;
                }
                return (T) declaredMethod.invoke(obj, objArr);
            } catch (InvocationTargetException e11) {
                throw e11;
            } catch (Throwable unused) {
                cls = cls.getSuperclass();
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("className: ");
        Object obj2 = str;
        if (obj != null) {
            obj2 = obj.getClass();
        }
        sb2.append(obj2);
        sb2.append(", methodName: ");
        sb2.append(str2);
        throw new NoSuchMethodException(sb2.toString());
    }

    private static <T> T a(String str, String str2) throws Throwable {
        Field field;
        ArrayList arrayList = new ArrayList();
        for (Class<?> a11 = a(str); a11 != null; a11 = a11.getSuperclass()) {
            arrayList.add(a11);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                field = ((Class) it.next()).getDeclaredField(str2);
            } catch (Throwable unused) {
                field = null;
            }
            if (field != null && Modifier.isStatic(field.getModifiers())) {
                field.setAccessible(true);
                return (T) field.get(null);
            }
        }
        throw new NoSuchFieldException("className: " + str + ", fieldName: " + str2);
    }

    private static void a(String str, String str2, Object obj) throws Throwable {
        Field field;
        ArrayList arrayList = new ArrayList();
        for (Class<?> a11 = a(str); a11 != null; a11 = a11.getSuperclass()) {
            arrayList.add(a11);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                field = ((Class) it.next()).getDeclaredField(str2);
            } catch (Throwable unused) {
                field = null;
            }
            if (field != null && Modifier.isStatic(field.getModifiers())) {
                field.setAccessible(true);
                field.set(null, obj);
                return;
            }
        }
        throw new NoSuchFieldException("className: " + str + ", fieldName: " + str2 + ", value: " + String.valueOf(obj));
    }

    private static <T> T a(Object obj, String str) throws Throwable {
        Field field;
        if (!(obj instanceof List) && !obj.getClass().isArray()) {
            if (obj instanceof Map) {
                return (T) ((Map) obj).get(str);
            }
            ArrayList arrayList = new ArrayList();
            for (Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
                arrayList.add(cls);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                try {
                    field = ((Class) it.next()).getDeclaredField(str);
                } catch (Throwable unused) {
                    field = null;
                }
                if (field != null && !Modifier.isStatic(field.getModifiers())) {
                    field.setAccessible(true);
                    return (T) field.get(obj);
                }
            }
            throw new NoSuchFieldException("className: " + obj.getClass() + ", fieldName: " + str);
        }
        return (T) b(obj, str);
    }

    private static void a(Object obj, String str, Object obj2) throws Throwable {
        Field field;
        if (!(obj instanceof List) && !obj.getClass().isArray()) {
            if (obj instanceof Map) {
                ((Map) obj).put(str, obj2);
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
                arrayList.add(cls);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                try {
                    field = ((Class) it.next()).getDeclaredField(str);
                } catch (Throwable unused) {
                    field = null;
                }
                if (field != null && !Modifier.isStatic(field.getModifiers())) {
                    field.setAccessible(true);
                    field.set(obj, obj2);
                    return;
                }
            }
            throw new NoSuchFieldException("className: " + obj.getClass() + ", fieldName: " + str + ", value: " + String.valueOf(obj2));
        }
        b(obj, str, obj2);
    }
}

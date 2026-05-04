package com.mob.commons.cc;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.io.BufferedReader;
import java.io.StringReader;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes7.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    private static HashMap<String, HashMap<String, ArrayList<HashMap<String, Object>>>> f40249a = new HashMap<>();

    public static class a implements InvocationHandler {

        /* renamed from: a, reason: collision with root package name */
        private Object f40250a;

        /* renamed from: b, reason: collision with root package name */
        private String f40251b;

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            String name = method.getName();
            if (!name.equals("checkClientTrusted")) {
                try {
                    if (name.equals("checkServerTrusted")) {
                        Object[] objArr2 = (Object[]) objArr[0];
                        String str = (String) objArr[1];
                        if (objArr2 == null) {
                            throw new IllegalArgumentException("there were no certificates.");
                        }
                        if (objArr2.length == 1) {
                            Method declaredMethod = objArr2[0].getClass().getDeclaredMethod("checkValidity", null);
                            declaredMethod.setAccessible(true);
                            declaredMethod.invoke(objArr2[0], null);
                        } else {
                            if (this.f40250a == null) {
                                throw new CertificateException("there were one more certificates but no trust manager found.");
                            }
                            if (k.a()) {
                                Object newInstance = Class.forName("android.net.http.X509TrustManagerExtensions").getConstructor(X509TrustManager.class).newInstance(this.f40250a);
                                Method declaredMethod2 = newInstance.getClass().getDeclaredMethod("checkServerTrusted", Array.newInstance(Class.forName("java.security.cert.X509Certificate"), 0).getClass(), String.class, String.class);
                                declaredMethod2.setAccessible(true);
                                declaredMethod2.invoke(newInstance, objArr2, str, this.f40251b);
                            } else {
                                Method declaredMethod3 = this.f40250a.getClass().getDeclaredMethod("checkServerTrusted", Array.newInstance(Class.forName("java.security.cert.X509Certificate"), 0).getClass(), String.class);
                                declaredMethod3.setAccessible(true);
                                declaredMethod3.invoke(this.f40250a, objArr2, str);
                            }
                        }
                    } else {
                        if (name.equals("getAcceptedIssuers")) {
                            return Array.newInstance(Class.forName("java.security.cert.X509Certificate"), 0);
                        }
                        if (name.equals("hashCode")) {
                            return Integer.valueOf(hashCode());
                        }
                        if (name.equals("toString")) {
                            return toString();
                        }
                    }
                } catch (Throwable unused) {
                }
            }
            return null;
        }

        private a(String str) {
            try {
                this.f40251b = str;
                Method declaredMethod = Class.forName("javax.net.ssl.TrustManagerFactory").getDeclaredMethod("getInstance", String.class);
                declaredMethod.setAccessible(true);
                Object invoke = declaredMethod.invoke(null, wr.k.f96725f);
                Method method = invoke.getClass().getMethod("init", Class.forName("java.security.KeyStore"));
                method.setAccessible(true);
                method.invoke(invoke, null);
                Method method2 = invoke.getClass().getMethod("getTrustManagers", null);
                method2.setAccessible(true);
                Object[] objArr = (Object[]) method2.invoke(invoke, null);
                if (objArr == null || objArr.length == 0) {
                    throw new NoSuchAlgorithmException("no trust manager found.");
                }
                this.f40250a = objArr[0];
            } catch (Exception unused) {
                this.f40250a = null;
            }
        }
    }

    public static void a(String str) throws Throwable {
        ArrayList arrayList = new ArrayList();
        BufferedReader bufferedReader = new BufferedReader(new StringReader(str));
        HashMap<String, ArrayList<HashMap<String, Object>>> hashMap = null;
        for (String readLine = bufferedReader.readLine(); readLine != null; readLine = bufferedReader.readLine()) {
            String substring = readLine.substring(0, 2);
            String substring2 = readLine.substring(2);
            if (":P".equals(substring)) {
                arrayList.addAll(Arrays.asList(substring2.split(",")));
            } else if (":C".equals(substring)) {
                hashMap = new HashMap<>();
                f40249a.put((String) arrayList.get(Integer.parseInt(substring2)), hashMap);
            } else {
                HashMap<String, Object> hashMap2 = new HashMap<>();
                hashMap2.put("+", Boolean.valueOf(substring2.startsWith("+")));
                String[] split = substring2.substring(1).split("#");
                String str2 = (String) arrayList.get(Integer.parseInt(split[0]));
                if (split.length > 1) {
                    String[] split2 = split[1].split(",");
                    String[] strArr = new String[split2.length];
                    for (int i11 = 0; i11 < split2.length; i11++) {
                        strArr[i11] = (String) arrayList.get(Integer.parseInt(split2[i11]));
                    }
                    hashMap2.put("#", strArr);
                } else {
                    hashMap2.put("#", new String[0]);
                }
                ArrayList<HashMap<String, Object>> arrayList2 = hashMap.get(str2);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>();
                    hashMap.put(str2, arrayList2);
                }
                arrayList2.add(hashMap2);
            }
        }
        bufferedReader.close();
    }

    public static Object b(String str) throws Throwable {
        return Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{X509TrustManager.class}, new a(str));
    }

    private static Class<?> c(String str) throws Throwable {
        return "int".equals(str) ? Integer.TYPE : "double".equals(str) ? Double.TYPE : "long".equals(str) ? Long.TYPE : TypedValues.Custom.S_FLOAT.equals(str) ? Float.TYPE : TypedValues.Custom.S_BOOLEAN.equals(str) ? Boolean.TYPE : "short".equals(str) ? Short.TYPE : "byte".equals(str) ? Byte.TYPE : "char".equals(str) ? Character.TYPE : "void".equals(str) ? Void.TYPE : Class.forName(str);
    }

    /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
        java.util.NoSuchElementException
        	at java.base/java.util.TreeMap.key(TreeMap.java:1602)
        	at java.base/java.util.TreeMap.lastKey(TreeMap.java:298)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    public static java.lang.reflect.Constructor a(java.lang.Class<?> r7, java.lang.Object[] r8, boolean[][] r9) throws java.lang.Throwable {
        /*
            java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.String, java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>>>> r0 = com.mob.commons.cc.k.f40249a
            java.lang.String r1 = r7.getName()
            java.lang.Object r0 = r0.get(r1)
            java.util.HashMap r0 = (java.util.HashMap) r0
            if (r0 == 0) goto L61
            java.lang.String r1 = "<init>"
            java.lang.Object r0 = r0.get(r1)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            if (r0 == 0) goto L61
            java.util.Iterator r0 = r0.iterator()
        L1c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L61
            java.lang.Object r1 = r0.next()
            java.util.HashMap r1 = (java.util.HashMap) r1
            java.lang.String r2 = "#"
            boolean r3 = r1.containsKey(r2)
            r4 = 0
            if (r3 == 0) goto L38
            java.lang.Object r1 = r1.get(r2)
            java.lang.String[] r1 = (java.lang.String[]) r1
            goto L3a
        L38:
            java.lang.String[] r1 = new java.lang.String[r4]
        L3a:
            int r2 = r1.length
            int r3 = r8.length
            if (r2 != r3) goto L1c
            int r2 = r1.length
            java.lang.Class[] r3 = new java.lang.Class[r2]
            r5 = r4
        L42:
            if (r5 >= r2) goto L4f
            r6 = r1[r5]
            java.lang.Class r6 = c(r6)
            r3[r5] = r6
            int r5 = r5 + 1
            goto L42
        L4f:
            r1 = 1
            boolean[] r2 = new boolean[r1]
            boolean[] r5 = a(r3, r8, r2)
            if (r5 == 0) goto L1c
            r9[r4] = r5
            r9[r1] = r2
            java.lang.reflect.Constructor r7 = r7.getDeclaredConstructor(r3)
            return r7
        L61:
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mob.commons.cc.k.a(java.lang.Class, java.lang.Object[], boolean[][]):java.lang.reflect.Constructor");
    }

    /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
        java.util.NoSuchElementException
        	at java.base/java.util.TreeMap.key(TreeMap.java:1602)
        	at java.base/java.util.TreeMap.lastKey(TreeMap.java:298)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    public static java.lang.reflect.Method a(java.lang.Class<?> r8, java.lang.String r9, boolean r10, java.lang.Object[] r11, boolean[][] r12) throws java.lang.Throwable {
        /*
            java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.String, java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>>>> r0 = com.mob.commons.cc.k.f40249a
            java.lang.String r1 = r8.getName()
            java.lang.Object r0 = r0.get(r1)
            java.util.HashMap r0 = (java.util.HashMap) r0
            if (r0 == 0) goto L87
            java.lang.Object r0 = r0.get(r9)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            if (r0 == 0) goto L87
            java.util.Iterator r0 = r0.iterator()
        L1a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L87
            java.lang.Object r1 = r0.next()
            java.util.HashMap r1 = (java.util.HashMap) r1
            java.lang.String r2 = "+"
            boolean r3 = r1.containsKey(r2)
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L42
            java.lang.Object r2 = r1.get(r2)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = "true"
            boolean r2 = r3.equalsIgnoreCase(r2)
            if (r2 == 0) goto L42
            r2 = r5
            goto L43
        L42:
            r2 = r4
        L43:
            if (r10 == 0) goto L47
            if (r2 != 0) goto L4b
        L47:
            if (r10 != 0) goto L4d
            if (r2 != 0) goto L4d
        L4b:
            r2 = r5
            goto L4e
        L4d:
            r2 = r4
        L4e:
            java.lang.String r3 = "#"
            boolean r6 = r1.containsKey(r3)
            if (r6 == 0) goto L5d
            java.lang.Object r1 = r1.get(r3)
            java.lang.String[] r1 = (java.lang.String[]) r1
            goto L5f
        L5d:
            java.lang.String[] r1 = new java.lang.String[r4]
        L5f:
            if (r2 == 0) goto L1a
            int r2 = r1.length
            int r3 = r11.length
            if (r2 != r3) goto L1a
            int r2 = r1.length
            java.lang.Class[] r3 = new java.lang.Class[r2]
            r6 = r4
        L69:
            if (r6 >= r2) goto L76
            r7 = r1[r6]
            java.lang.Class r7 = c(r7)
            r3[r6] = r7
            int r6 = r6 + 1
            goto L69
        L76:
            boolean[] r1 = new boolean[r5]
            boolean[] r2 = a(r3, r11, r1)
            if (r2 == 0) goto L1a
            r12[r4] = r2
            r12[r5] = r1
            java.lang.reflect.Method r8 = r8.getDeclaredMethod(r9, r3)
            return r8
        L87:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mob.commons.cc.k.a(java.lang.Class, java.lang.String, boolean, java.lang.Object[], boolean[][]):java.lang.reflect.Method");
    }

    public static boolean[] a(Class<?>[] clsArr, Object[] objArr, boolean[] zArr) {
        zArr[0] = true;
        if (clsArr.length != objArr.length) {
            return null;
        }
        boolean[] zArr2 = new boolean[clsArr.length];
        for (int i11 = 0; i11 < objArr.length; i11++) {
            Object obj = objArr[i11];
            if (obj != null) {
                Class<?> cls = clsArr[i11];
                if (cls.isInterface() && (obj instanceof q)) {
                    zArr2[i11] = true;
                    zArr[0] = false;
                } else {
                    Class<?> cls2 = obj.getClass();
                    if (!a(cls, cls2) && !cls.isAssignableFrom(cls2)) {
                        return null;
                    }
                    zArr2[i11] = false;
                }
            }
        }
        return zArr2;
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

    public static Object[] a(j jVar, Class<?>[] clsArr, Object[] objArr, boolean[] zArr) {
        Object[] objArr2 = new Object[zArr.length];
        for (int i11 = 0; i11 < zArr.length; i11++) {
            Object obj = objArr[i11];
            if (obj != null) {
                if (zArr[i11]) {
                    HashMap hashMap = new HashMap();
                    String[] a11 = a(clsArr[i11]);
                    if (a11 != null) {
                        for (String str : a11) {
                            hashMap.put(str, objArr[i11]);
                        }
                    }
                    objArr2[i11] = jVar.a((Map<?, ?>) hashMap, true, clsArr[i11]);
                } else {
                    objArr2[i11] = obj;
                }
            }
        }
        return objArr2;
    }

    private static String[] a(Class<?> cls) {
        HashMap<String, ArrayList<HashMap<String, Object>>> hashMap = f40249a.get(cls.getName());
        String[] strArr = hashMap == null ? null : (String[]) hashMap.keySet().toArray(new String[0]);
        if (strArr != null) {
            return strArr;
        }
        HashSet hashSet = new HashSet();
        while (cls != null) {
            for (Method method : cls.getDeclaredMethods()) {
                hashSet.add(method.getName());
            }
            cls = cls.getSuperclass();
        }
        if (hashSet.isEmpty()) {
            return null;
        }
        return (String[]) hashSet.toArray(new String[0]);
    }

    public static boolean a() {
        try {
            Field field = Class.forName("android.os.Build$VERSION").getField("SDK_INT");
            field.setAccessible(true);
            return field.getInt(null) >= 17;
        } catch (Throwable unused) {
            return true;
        }
    }
}

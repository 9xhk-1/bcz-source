package org.mozilla.javascript;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import okhttp3.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
class JavaMembers {

    /* renamed from: cl, reason: collision with root package name */
    private Class<?> f78360cl;
    NativeJavaMethod ctors;
    private Map<String, FieldAndMethods> fieldAndMethods;
    private Map<String, Object> members;
    private Map<String, FieldAndMethods> staticFieldAndMethods;
    private Map<String, Object> staticMembers;

    public JavaMembers(Scriptable scriptable, Class<?> cls) {
        this(scriptable, cls, false);
    }

    private static Method[] discoverAccessibleMethods(Class<?> cls, boolean z11, boolean z12) {
        HashMap hashMap = new HashMap();
        discoverAccessibleMethods(cls, hashMap, z11, z12);
        return (Method[]) hashMap.values().toArray(new Method[hashMap.size()]);
    }

    private static MemberBox extractGetMethod(MemberBox[] memberBoxArr, boolean z11) {
        for (MemberBox memberBox : memberBoxArr) {
            if (memberBox.argTypes.length == 0 && (!z11 || memberBox.isStatic())) {
                if (memberBox.method().getReturnType() != Void.TYPE) {
                    return memberBox;
                }
                return null;
            }
        }
        return null;
    }

    private static MemberBox extractSetMethod(Class<?> cls, MemberBox[] memberBoxArr, boolean z11) {
        for (int i11 = 1; i11 <= 2; i11++) {
            for (MemberBox memberBox : memberBoxArr) {
                if (!z11 || memberBox.isStatic()) {
                    Class<?>[] clsArr = memberBox.argTypes;
                    if (clsArr.length != 1) {
                        continue;
                    } else if (i11 != 1) {
                        if (i11 != 2) {
                            Kit.codeBug();
                        }
                        if (clsArr[0].isAssignableFrom(cls)) {
                            return memberBox;
                        }
                    } else if (clsArr[0] == cls) {
                        return memberBox;
                    }
                }
            }
        }
        return null;
    }

    private MemberBox findExplicitFunction(String str, boolean z11) {
        MemberBox[] memberBoxArr;
        int indexOf = str.indexOf(40);
        if (indexOf < 0) {
            return null;
        }
        Map<String, Object> map = z11 ? this.staticMembers : this.members;
        if (z11 && indexOf == 0) {
            memberBoxArr = this.ctors.methods;
        } else {
            String substring = str.substring(0, indexOf);
            Object obj = map.get(substring);
            if (!z11 && obj == null) {
                obj = this.staticMembers.get(substring);
            }
            memberBoxArr = obj instanceof NativeJavaMethod ? ((NativeJavaMethod) obj).methods : null;
        }
        if (memberBoxArr != null) {
            for (MemberBox memberBox : memberBoxArr) {
                String liveConnectSignature = liveConnectSignature(memberBox.argTypes);
                if (liveConnectSignature.length() + indexOf == str.length() && str.regionMatches(indexOf, liveConnectSignature, 0, liveConnectSignature.length())) {
                    return memberBox;
                }
            }
        }
        return null;
    }

    private MemberBox findGetter(boolean z11, Map<String, Object> map, String str, String str2) {
        String concat = str.concat(str2);
        if (!map.containsKey(concat)) {
            return null;
        }
        Object obj = map.get(concat);
        if (obj instanceof NativeJavaMethod) {
            return extractGetMethod(((NativeJavaMethod) obj).methods, z11);
        }
        return null;
    }

    private Constructor<?>[] getAccessibleConstructors(boolean z11) {
        Class<?> cls;
        if (z11 && (cls = this.f78360cl) != ScriptRuntime.ClassClass) {
            try {
                Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
                AccessibleObject.setAccessible(declaredConstructors, true);
                return declaredConstructors;
            } catch (SecurityException unused) {
                Context.reportWarning("Could not access constructor  of class " + this.f78360cl.getName() + " due to lack of privileges.");
            }
        }
        return this.f78360cl.getConstructors();
    }

    private Field[] getAccessibleFields(boolean z11, boolean z12) {
        if (z12 || z11) {
            try {
                ArrayList arrayList = new ArrayList();
                for (Class<?> cls = this.f78360cl; cls != null; cls = cls.getSuperclass()) {
                    for (Field field : cls.getDeclaredFields()) {
                        int modifiers = field.getModifiers();
                        if (z12 || Modifier.isPublic(modifiers) || Modifier.isProtected(modifiers)) {
                            if (!field.isAccessible()) {
                                field.setAccessible(true);
                            }
                            arrayList.add(field);
                        }
                    }
                }
                return (Field[]) arrayList.toArray(new Field[arrayList.size()]);
            } catch (SecurityException unused) {
            }
        }
        return this.f78360cl.getFields();
    }

    private Object getExplicitFunction(Scriptable scriptable, String str, Object obj, boolean z11) {
        Map<String, Object> map = z11 ? this.staticMembers : this.members;
        MemberBox findExplicitFunction = findExplicitFunction(str, z11);
        if (findExplicitFunction == null) {
            return null;
        }
        Scriptable functionPrototype = ScriptableObject.getFunctionPrototype(scriptable);
        if (findExplicitFunction.isCtor()) {
            NativeJavaConstructor nativeJavaConstructor = new NativeJavaConstructor(findExplicitFunction);
            nativeJavaConstructor.setPrototype(functionPrototype);
            map.put(str, nativeJavaConstructor);
            return nativeJavaConstructor;
        }
        Object obj2 = map.get(findExplicitFunction.getName());
        if (!(obj2 instanceof NativeJavaMethod) || ((NativeJavaMethod) obj2).methods.length <= 1) {
            return obj2;
        }
        NativeJavaMethod nativeJavaMethod = new NativeJavaMethod(findExplicitFunction, str);
        nativeJavaMethod.setPrototype(functionPrototype);
        map.put(str, nativeJavaMethod);
        return nativeJavaMethod;
    }

    public static String javaSignature(Class<?> cls) {
        if (!cls.isArray()) {
            return cls.getName();
        }
        int i11 = 0;
        do {
            i11++;
            cls = cls.getComponentType();
        } while (cls.isArray());
        String name = cls.getName();
        if (i11 == 1) {
            return name.concat(i.f77289p);
        }
        StringBuilder sb2 = new StringBuilder(name.length() + (i11 * 2));
        sb2.append(name);
        while (i11 != 0) {
            i11--;
            sb2.append(i.f77289p);
        }
        return sb2.toString();
    }

    public static String liveConnectSignature(Class<?>[] clsArr) {
        int length = clsArr.length;
        if (length == 0) {
            return "()";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append('(');
        for (int i11 = 0; i11 != length; i11++) {
            if (i11 != 0) {
                sb2.append(',');
            }
            sb2.append(javaSignature(clsArr[i11]));
        }
        sb2.append(')');
        return sb2.toString();
    }

    public static JavaMembers lookupClass(Scriptable scriptable, Class<?> cls, Class<?> cls2, boolean z11) {
        ClassCache classCache = ClassCache.get(scriptable);
        Map<Class<?>, JavaMembers> classCacheMap = classCache.getClassCacheMap();
        Class<?> cls3 = cls;
        while (true) {
            JavaMembers javaMembers = classCacheMap.get(cls3);
            if (javaMembers != null) {
                if (cls3 != cls) {
                    classCacheMap.put(cls, javaMembers);
                }
                return javaMembers;
            }
            try {
                JavaMembers javaMembers2 = new JavaMembers(classCache.getAssociatedScope(), cls3, z11);
                if (classCache.isCachingEnabled()) {
                    classCacheMap.put(cls3, javaMembers2);
                    if (cls3 != cls) {
                        classCacheMap.put(cls, javaMembers2);
                    }
                }
                return javaMembers2;
            } catch (SecurityException e11) {
                if (cls2 == null || !cls2.isInterface()) {
                    Class<?> superclass = cls3.getSuperclass();
                    if (superclass == null) {
                        if (!cls3.isInterface()) {
                            throw e11;
                        }
                        superclass = ScriptRuntime.ObjectClass;
                    }
                    cls3 = superclass;
                } else {
                    cls3 = cls2;
                    cls2 = null;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x019a, code lost:
    
        r11 = 2;
     */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0217  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void reflect(org.mozilla.javascript.Scriptable r17, boolean r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 659
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.JavaMembers.reflect(org.mozilla.javascript.Scriptable, boolean, boolean):void");
    }

    public Object get(Scriptable scriptable, String str, Object obj, boolean z11) {
        Object obj2;
        Class<?> type;
        Object obj3 = (z11 ? this.staticMembers : this.members).get(str);
        if (!z11 && obj3 == null) {
            obj3 = this.staticMembers.get(str);
        }
        if (obj3 == null && (obj3 = getExplicitFunction(scriptable, str, obj, z11)) == null) {
            return Scriptable.NOT_FOUND;
        }
        if (obj3 instanceof Scriptable) {
            return obj3;
        }
        Context context = Context.getContext();
        try {
            if (obj3 instanceof BeanProperty) {
                BeanProperty beanProperty = (BeanProperty) obj3;
                MemberBox memberBox = beanProperty.getter;
                if (memberBox == null) {
                    return Scriptable.NOT_FOUND;
                }
                obj2 = memberBox.invoke(obj, Context.emptyArgs);
                type = beanProperty.getter.method().getReturnType();
            } else {
                Field field = (Field) obj3;
                if (z11) {
                    obj = null;
                }
                obj2 = field.get(obj);
                type = field.getType();
            }
            return context.getWrapFactory().wrap(context, ScriptableObject.getTopLevelScope(scriptable), obj2, type);
        } catch (Exception e11) {
            throw Context.throwAsScriptRuntimeEx(e11);
        }
    }

    public Map<String, FieldAndMethods> getFieldAndMethodsObjects(Scriptable scriptable, Object obj, boolean z11) {
        Map<String, FieldAndMethods> map = z11 ? this.staticFieldAndMethods : this.fieldAndMethods;
        if (map == null) {
            return null;
        }
        HashMap hashMap = new HashMap(map.size());
        for (FieldAndMethods fieldAndMethods : map.values()) {
            FieldAndMethods fieldAndMethods2 = new FieldAndMethods(scriptable, fieldAndMethods.methods, fieldAndMethods.field);
            fieldAndMethods2.javaObject = obj;
            hashMap.put(fieldAndMethods.field.getName(), fieldAndMethods2);
        }
        return hashMap;
    }

    public Object[] getIds(boolean z11) {
        Map<String, Object> map = z11 ? this.staticMembers : this.members;
        return map.keySet().toArray(new Object[map.size()]);
    }

    public boolean has(String str, boolean z11) {
        return ((z11 ? this.staticMembers : this.members).get(str) == null && findExplicitFunction(str, z11) == null) ? false : true;
    }

    public void put(Scriptable scriptable, String str, Object obj, Object obj2, boolean z11) {
        Map<String, Object> map = z11 ? this.staticMembers : this.members;
        Object obj3 = map.get(str);
        if (!z11 && obj3 == null) {
            obj3 = this.staticMembers.get(str);
        }
        if (obj3 == null) {
            throw reportMemberNotFound(str);
        }
        if (obj3 instanceof FieldAndMethods) {
            obj3 = ((FieldAndMethods) map.get(str)).field;
        }
        if (!(obj3 instanceof BeanProperty)) {
            if (!(obj3 instanceof Field)) {
                throw Context.reportRuntimeError1(obj3 == null ? "msg.java.internal.private" : "msg.java.method.assign", str);
            }
            Field field = (Field) obj3;
            try {
                field.set(obj, Context.jsToJava(obj2, field.getType()));
                return;
            } catch (IllegalAccessException e11) {
                if ((field.getModifiers() & 16) == 0) {
                    throw Context.throwAsScriptRuntimeEx(e11);
                }
                return;
            } catch (IllegalArgumentException unused) {
                throw Context.reportRuntimeError3("msg.java.internal.field.type", obj2.getClass().getName(), field, obj.getClass().getName());
            }
        }
        BeanProperty beanProperty = (BeanProperty) obj3;
        MemberBox memberBox = beanProperty.setter;
        if (memberBox == null) {
            throw reportMemberNotFound(str);
        }
        NativeJavaMethod nativeJavaMethod = beanProperty.setters;
        if (nativeJavaMethod != null && obj2 != null) {
            nativeJavaMethod.call(Context.getContext(), ScriptableObject.getTopLevelScope(scriptable), scriptable, new Object[]{obj2});
            return;
        }
        try {
            beanProperty.setter.invoke(obj, new Object[]{Context.jsToJava(obj2, memberBox.argTypes[0])});
        } catch (Exception e12) {
            throw Context.throwAsScriptRuntimeEx(e12);
        }
    }

    public RuntimeException reportMemberNotFound(String str) {
        return Context.reportRuntimeError2("msg.java.member.not.found", this.f78360cl.getName(), str);
    }

    public JavaMembers(Scriptable scriptable, Class<?> cls, boolean z11) {
        try {
            Context enterContext = ContextFactory.getGlobal().enterContext();
            ClassShutter classShutter = enterContext.getClassShutter();
            if (classShutter != null && !classShutter.visibleToScripts(cls.getName())) {
                throw Context.reportRuntimeError1("msg.access.prohibited", cls.getName());
            }
            this.members = new HashMap();
            this.staticMembers = new HashMap();
            this.f78360cl = cls;
            reflect(scriptable, z11, enterContext.hasFeature(13));
            Context.exit();
        } catch (Throwable th2) {
            Context.exit();
            throw th2;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class MethodSignature {
        private final Class<?>[] args;
        private final String name;

        private MethodSignature(String str, Class<?>[] clsArr) {
            this.name = str;
            this.args = clsArr;
        }

        public boolean equals(Object obj) {
            if (obj instanceof MethodSignature) {
                MethodSignature methodSignature = (MethodSignature) obj;
                if (methodSignature.name.equals(this.name) && Arrays.equals(this.args, methodSignature.args)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return this.name.hashCode() ^ this.args.length;
        }

        public MethodSignature(Method method) {
            this(method.getName(), method.getParameterTypes());
        }
    }

    private static void discoverAccessibleMethods(Class<?> cls, Map<MethodSignature, Method> map, boolean z11, boolean z12) {
        if (Modifier.isPublic(cls.getModifiers()) || z12) {
            try {
                if (!z11 && !z12) {
                    for (Method method : cls.getMethods()) {
                        MethodSignature methodSignature = new MethodSignature(method);
                        if (!map.containsKey(methodSignature)) {
                            map.put(methodSignature, method);
                        }
                    }
                    return;
                }
                while (cls != null) {
                    try {
                        for (Method method2 : cls.getDeclaredMethods()) {
                            int modifiers = method2.getModifiers();
                            if (Modifier.isPublic(modifiers) || Modifier.isProtected(modifiers) || z12) {
                                MethodSignature methodSignature2 = new MethodSignature(method2);
                                if (!map.containsKey(methodSignature2)) {
                                    if (z12 && !method2.isAccessible()) {
                                        method2.setAccessible(true);
                                    }
                                    map.put(methodSignature2, method2);
                                }
                            }
                        }
                        cls = cls.getSuperclass();
                    } catch (SecurityException unused) {
                        for (Method method3 : cls.getMethods()) {
                            MethodSignature methodSignature3 = new MethodSignature(method3);
                            if (!map.containsKey(methodSignature3)) {
                                map.put(methodSignature3, method3);
                            }
                        }
                        return;
                    }
                }
                return;
            } catch (SecurityException unused2) {
                Context.reportWarning("Could not discover accessible methods of class " + cls.getName() + " due to lack of privileges, attemping superclasses/interfaces.");
            }
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            discoverAccessibleMethods(cls2, map, z11, z12);
        }
        Class<? super Object> superclass = cls.getSuperclass();
        if (superclass != null) {
            discoverAccessibleMethods(superclass, map, z11, z12);
        }
    }

    private static MemberBox extractSetMethod(MemberBox[] memberBoxArr, boolean z11) {
        for (MemberBox memberBox : memberBoxArr) {
            if ((!z11 || memberBox.isStatic()) && memberBox.method().getReturnType() == Void.TYPE && memberBox.argTypes.length == 1) {
                return memberBox;
            }
        }
        return null;
    }
}

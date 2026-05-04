package org.mozilla.javascript;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.security.CodeSource;
import java.security.ProtectionDomain;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import l70.f;
import org.mozilla.classfile.ClassFileWriter;
import org.mozilla.javascript.ObjToIntMap;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class JavaAdapter implements IdFunctionCall {
    private static final Object FTAG = "JavaAdapter";
    private static final int Id_JavaAdapter = 1;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class JavaAdapterSignature {
        Class<?>[] interfaces;
        ObjToIntMap names;
        Class<?> superClass;

        public JavaAdapterSignature(Class<?> cls, Class<?>[] clsArr, ObjToIntMap objToIntMap) {
            this.superClass = cls;
            this.interfaces = clsArr;
            this.names = objToIntMap;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof JavaAdapterSignature)) {
                return false;
            }
            JavaAdapterSignature javaAdapterSignature = (JavaAdapterSignature) obj;
            if (this.superClass != javaAdapterSignature.superClass) {
                return false;
            }
            Class<?>[] clsArr = this.interfaces;
            Class<?>[] clsArr2 = javaAdapterSignature.interfaces;
            if (clsArr != clsArr2) {
                if (clsArr.length == clsArr2.length) {
                    int i11 = 0;
                    while (true) {
                        Class<?>[] clsArr3 = this.interfaces;
                        if (i11 >= clsArr3.length) {
                            break;
                        }
                        if (clsArr3[i11] != javaAdapterSignature.interfaces[i11]) {
                            return false;
                        }
                        i11++;
                    }
                } else {
                    return false;
                }
            }
            if (this.names.size() != javaAdapterSignature.names.size()) {
                return false;
            }
            ObjToIntMap.Iterator iterator = new ObjToIntMap.Iterator(this.names);
            iterator.start();
            while (!iterator.done()) {
                String str = (String) iterator.getKey();
                int value = iterator.getValue();
                if (value != javaAdapterSignature.names.get(str, value + 1)) {
                    return false;
                }
                iterator.next();
            }
            return true;
        }

        public int hashCode() {
            return (this.superClass.hashCode() + Arrays.hashCode(this.interfaces)) ^ this.names.size();
        }
    }

    public static int appendMethodSignature(Class<?>[] clsArr, Class<?> cls, StringBuilder sb2) {
        sb2.append('(');
        int length = clsArr.length + 1;
        for (Class<?> cls2 : clsArr) {
            appendTypeString(sb2, cls2);
            if (cls2 == Long.TYPE || cls2 == Double.TYPE) {
                length++;
            }
        }
        sb2.append(')');
        appendTypeString(sb2, cls);
        return length;
    }

    private static void appendOverridableMethods(Class<?> cls, ArrayList<Method> arrayList, HashSet<String> hashSet) {
        Method[] declaredMethods = cls.getDeclaredMethods();
        for (int i11 = 0; i11 < declaredMethods.length; i11++) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(declaredMethods[i11].getName());
            Method method = declaredMethods[i11];
            sb2.append(getMethodSignature(method, method.getParameterTypes()));
            String sb3 = sb2.toString();
            if (!hashSet.contains(sb3)) {
                int modifiers = declaredMethods[i11].getModifiers();
                if (!Modifier.isStatic(modifiers)) {
                    if (Modifier.isFinal(modifiers)) {
                        hashSet.add(sb3);
                    } else if (Modifier.isPublic(modifiers) || Modifier.isProtected(modifiers)) {
                        arrayList.add(declaredMethods[i11]);
                        hashSet.add(sb3);
                    }
                }
            }
        }
    }

    private static StringBuilder appendTypeString(StringBuilder sb2, Class<?> cls) {
        while (cls.isArray()) {
            sb2.append('[');
            cls = cls.getComponentType();
        }
        if (cls.isPrimitive()) {
            sb2.append(cls == Boolean.TYPE ? 'Z' : cls == Long.TYPE ? 'J' : Character.toUpperCase(cls.getName().charAt(0)));
            return sb2;
        }
        sb2.append('L');
        sb2.append(cls.getName().replace('.', '/'));
        sb2.append(f.f70689d);
        return sb2;
    }

    public static Object callMethod(ContextFactory contextFactory, final Scriptable scriptable, final Function function, final Object[] objArr, final long j11) {
        if (function == null) {
            return Undefined.instance;
        }
        if (contextFactory == null) {
            contextFactory = ContextFactory.getGlobal();
        }
        final Scriptable parentScope = function.getParentScope();
        if (j11 == 0) {
            return Context.call(contextFactory, function, parentScope, scriptable, objArr);
        }
        Context currentContext = Context.getCurrentContext();
        return currentContext != null ? doCall(currentContext, parentScope, scriptable, function, objArr, j11) : contextFactory.call(new ContextAction() { // from class: org.mozilla.javascript.JavaAdapter.1
            @Override // org.mozilla.javascript.ContextAction
            public Object run(Context context) {
                return JavaAdapter.doCall(context, Scriptable.this, scriptable, function, objArr, j11);
            }
        });
    }

    public static Object convertResult(Object obj, Class<?> cls) {
        if (obj != Undefined.instance || cls == ScriptRuntime.ObjectClass || cls == ScriptRuntime.StringClass) {
            return Context.jsToJava(obj, cls);
        }
        return null;
    }

    public static byte[] createAdapterCode(ObjToIntMap objToIntMap, String str, Class<?> cls, Class<?>[] clsArr, String str2) {
        String str3;
        ClassFileWriter classFileWriter;
        String str4 = str;
        ClassFileWriter classFileWriter2 = new ClassFileWriter(str4, cls.getName(), "<adapter>");
        classFileWriter2.D("factory", "Lorg/mozilla/javascript/ContextFactory;", (short) 17);
        classFileWriter2.D("delegee", "Lorg/mozilla/javascript/Scriptable;", (short) 17);
        classFileWriter2.D("self", "Lorg/mozilla/javascript/Scriptable;", (short) 17);
        int length = clsArr == null ? 0 : clsArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            Class<?> cls2 = clsArr[i11];
            if (cls2 != null) {
                classFileWriter2.J(cls2.getName());
            }
        }
        String replace = cls.getName().replace('.', '/');
        for (Constructor<?> constructor : cls.getConstructors()) {
            generateCtor(classFileWriter2, str4, replace, constructor);
        }
        generateSerialCtor(classFileWriter2, str4, replace);
        if (str2 != null) {
            generateEmptyCtor(classFileWriter2, str4, replace, str2);
        }
        ObjToIntMap objToIntMap2 = new ObjToIntMap();
        ObjToIntMap objToIntMap3 = new ObjToIntMap();
        int i12 = 0;
        while (i12 < length) {
            Method[] methods = clsArr[i12].getMethods();
            int i13 = 0;
            while (i13 < methods.length) {
                Method method = methods[i13];
                int modifiers = method.getModifiers();
                if (Modifier.isStatic(modifiers) || Modifier.isFinal(modifiers)) {
                    classFileWriter = classFileWriter2;
                } else {
                    ClassFileWriter classFileWriter3 = classFileWriter2;
                    String name = method.getName();
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    if (!objToIntMap.has(name)) {
                        try {
                            cls.getMethod(name, parameterTypes);
                        } catch (NoSuchMethodException unused) {
                        }
                        classFileWriter = classFileWriter3;
                    }
                    String str5 = name + getMethodSignature(method, parameterTypes);
                    if (!objToIntMap2.has(str5)) {
                        Class<?> returnType = method.getReturnType();
                        classFileWriter = classFileWriter3;
                        generateMethod(classFileWriter, str4, name, parameterTypes, returnType, true);
                        objToIntMap2.put(str5, 0);
                        objToIntMap3.put(name, 0);
                    }
                    classFileWriter = classFileWriter3;
                }
                i13++;
                str4 = str;
                classFileWriter2 = classFileWriter;
            }
            i12++;
            str4 = str;
        }
        ClassFileWriter classFileWriter4 = classFileWriter2;
        Method[] overridableMethods = getOverridableMethods(cls);
        int i14 = 0;
        while (i14 < overridableMethods.length) {
            Method method2 = overridableMethods[i14];
            boolean isAbstract = Modifier.isAbstract(method2.getModifiers());
            String name2 = method2.getName();
            if (isAbstract || objToIntMap.has(name2)) {
                Class<?>[] parameterTypes2 = method2.getParameterTypes();
                String methodSignature = getMethodSignature(method2, parameterTypes2);
                String str6 = name2 + methodSignature;
                if (!objToIntMap2.has(str6)) {
                    generateMethod(classFileWriter4, str, name2, parameterTypes2, method2.getReturnType(), true);
                    ClassFileWriter classFileWriter5 = classFileWriter4;
                    objToIntMap2.put(str6, 0);
                    objToIntMap3.put(name2, 0);
                    if (isAbstract) {
                        classFileWriter4 = classFileWriter5;
                        str3 = replace;
                    } else {
                        classFileWriter4 = classFileWriter5;
                        str3 = replace;
                        generateSuper(classFileWriter4, str, str3, name2, methodSignature, parameterTypes2, method2.getReturnType());
                    }
                    i14++;
                    replace = str3;
                }
            }
            str3 = replace;
            i14++;
            replace = str3;
        }
        ObjToIntMap.Iterator iterator = new ObjToIntMap.Iterator(objToIntMap);
        iterator.start();
        while (!iterator.done()) {
            String str7 = (String) iterator.getKey();
            if (!objToIntMap3.has(str7)) {
                int value = iterator.getValue();
                Class[] clsArr2 = new Class[value];
                for (int i15 = 0; i15 < value; i15++) {
                    clsArr2[i15] = ScriptRuntime.ObjectClass;
                }
                ClassFileWriter classFileWriter6 = classFileWriter4;
                generateMethod(classFileWriter6, str, str7, clsArr2, ScriptRuntime.ObjectClass, false);
                classFileWriter4 = classFileWriter6;
            }
            iterator.next();
        }
        return classFileWriter4.Q0();
    }

    public static Scriptable createAdapterWrapper(Scriptable scriptable, Object obj) {
        NativeJavaObject nativeJavaObject = new NativeJavaObject(ScriptableObject.getTopLevelScope(scriptable), obj, null, true);
        nativeJavaObject.setPrototype(scriptable);
        return nativeJavaObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object doCall(Context context, Scriptable scriptable, Scriptable scriptable2, Function function, Object[] objArr, long j11) {
        for (int i11 = 0; i11 != objArr.length; i11++) {
            if (0 != ((1 << i11) & j11)) {
                Object obj = objArr[i11];
                if (!(obj instanceof Scriptable)) {
                    objArr[i11] = context.getWrapFactory().wrap(context, scriptable, obj, null);
                }
            }
        }
        return function.call(context, scriptable, scriptable2, objArr);
    }

    private static void generateCtor(ClassFileWriter classFileWriter, String str, String str2, Constructor<?> constructor) {
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        short s11 = 3;
        if (parameterTypes.length == 0) {
            classFileWriter.O0("<init>", "(Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/ContextFactory;)V", (short) 1);
            classFileWriter.r(42);
            classFileWriter.K(183, str2, "<init>", "()V");
        } else {
            StringBuilder sb2 = new StringBuilder("(Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/ContextFactory;");
            int length = sb2.length();
            for (Class<?> cls : parameterTypes) {
                appendTypeString(sb2, cls);
            }
            sb2.append(")V");
            classFileWriter.O0("<init>", sb2.toString(), (short) 1);
            classFileWriter.r(42);
            for (Class<?> cls2 : parameterTypes) {
                s11 = (short) (s11 + generatePushParam(classFileWriter, s11, cls2));
            }
            sb2.delete(1, length);
            classFileWriter.K(183, str2, "<init>", sb2.toString());
        }
        classFileWriter.r(42);
        classFileWriter.r(43);
        classFileWriter.v(181, str, "delegee", "Lorg/mozilla/javascript/Scriptable;");
        classFileWriter.r(42);
        classFileWriter.r(44);
        classFileWriter.v(181, str, "factory", "Lorg/mozilla/javascript/ContextFactory;");
        classFileWriter.r(42);
        classFileWriter.r(43);
        classFileWriter.r(42);
        classFileWriter.K(184, "org/mozilla/javascript/JavaAdapter", "createAdapterWrapper", "(Lorg/mozilla/javascript/Scriptable;Ljava/lang/Object;)Lorg/mozilla/javascript/Scriptable;");
        classFileWriter.v(181, str, "self", "Lorg/mozilla/javascript/Scriptable;");
        classFileWriter.r(177);
        classFileWriter.P0(s11);
    }

    private static void generateEmptyCtor(ClassFileWriter classFileWriter, String str, String str2, String str3) {
        classFileWriter.O0("<init>", "()V", (short) 1);
        classFileWriter.r(42);
        classFileWriter.K(183, str2, "<init>", "()V");
        classFileWriter.r(42);
        classFileWriter.r(1);
        classFileWriter.v(181, str, "factory", "Lorg/mozilla/javascript/ContextFactory;");
        classFileWriter.u(187, str3);
        classFileWriter.r(89);
        classFileWriter.K(183, str3, "<init>", "()V");
        classFileWriter.K(184, "org/mozilla/javascript/JavaAdapter", "runScript", "(Lorg/mozilla/javascript/Script;)Lorg/mozilla/javascript/Scriptable;");
        classFileWriter.r(76);
        classFileWriter.r(42);
        classFileWriter.r(43);
        classFileWriter.v(181, str, "delegee", "Lorg/mozilla/javascript/Scriptable;");
        classFileWriter.r(42);
        classFileWriter.r(43);
        classFileWriter.r(42);
        classFileWriter.K(184, "org/mozilla/javascript/JavaAdapter", "createAdapterWrapper", "(Lorg/mozilla/javascript/Scriptable;Ljava/lang/Object;)Lorg/mozilla/javascript/Scriptable;");
        classFileWriter.v(181, str, "self", "Lorg/mozilla/javascript/Scriptable;");
        classFileWriter.r(177);
        classFileWriter.P0((short) 2);
    }

    private static void generateMethod(ClassFileWriter classFileWriter, String str, String str2, Class<?>[] clsArr, Class<?> cls, boolean z11) {
        StringBuilder sb2 = new StringBuilder();
        int appendMethodSignature = appendMethodSignature(clsArr, cls, sb2);
        classFileWriter.O0(str2, sb2.toString(), (short) 1);
        classFileWriter.r(42);
        classFileWriter.v(180, str, "factory", "Lorg/mozilla/javascript/ContextFactory;");
        classFileWriter.r(42);
        classFileWriter.v(180, str, "self", "Lorg/mozilla/javascript/Scriptable;");
        classFileWriter.r(42);
        classFileWriter.v(180, str, "delegee", "Lorg/mozilla/javascript/Scriptable;");
        classFileWriter.Y(str2);
        classFileWriter.K(184, "org/mozilla/javascript/JavaAdapter", "getFunction", "(Lorg/mozilla/javascript/Scriptable;Ljava/lang/String;)Lorg/mozilla/javascript/Function;");
        generatePushWrappedArgs(classFileWriter, clsArr, clsArr.length);
        if (clsArr.length > 64) {
            throw Context.reportRuntimeError0("JavaAdapter can not subclass methods with more then 64 arguments.");
        }
        long j11 = 0;
        for (int i11 = 0; i11 != clsArr.length; i11++) {
            if (!clsArr[i11].isPrimitive()) {
                j11 |= 1 << i11;
            }
        }
        classFileWriter.X(j11);
        classFileWriter.K(184, "org/mozilla/javascript/JavaAdapter", "callMethod", "(Lorg/mozilla/javascript/ContextFactory;Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/Function;[Ljava/lang/Object;J)Ljava/lang/Object;");
        generateReturnResult(classFileWriter, cls, z11);
        classFileWriter.P0((short) appendMethodSignature);
    }

    private static void generatePopResult(ClassFileWriter classFileWriter, Class<?> cls) {
        if (!cls.isPrimitive()) {
            classFileWriter.r(176);
            return;
        }
        char charAt = cls.getName().charAt(0);
        if (charAt == 'f') {
            classFileWriter.r(174);
            return;
        }
        if (charAt != 'i') {
            if (charAt == 'l') {
                classFileWriter.r(173);
                return;
            } else if (charAt != 's' && charAt != 'z') {
                switch (charAt) {
                    case 'd':
                        classFileWriter.r(175);
                        break;
                }
                return;
            }
        }
        classFileWriter.r(172);
    }

    private static int generatePushParam(ClassFileWriter classFileWriter, int i11, Class<?> cls) {
        if (!cls.isPrimitive()) {
            classFileWriter.w(i11);
            return 1;
        }
        char charAt = cls.getName().charAt(0);
        if (charAt == 'f') {
            classFileWriter.B(i11);
            return 1;
        }
        if (charAt != 'i') {
            if (charAt == 'l') {
                classFileWriter.L(i11);
                return 2;
            }
            if (charAt != 's' && charAt != 'z') {
                switch (charAt) {
                    case 'b':
                    case 'c':
                        break;
                    case 'd':
                        classFileWriter.y(i11);
                        return 2;
                    default:
                        throw Kit.codeBug();
                }
            }
        }
        classFileWriter.H(i11);
        return 1;
    }

    public static void generatePushWrappedArgs(ClassFileWriter classFileWriter, Class<?>[] clsArr, int i11) {
        classFileWriter.W(i11);
        classFileWriter.u(189, "java/lang/Object");
        int i12 = 1;
        for (int i13 = 0; i13 != clsArr.length; i13++) {
            classFileWriter.r(89);
            classFileWriter.W(i13);
            i12 += generateWrapArg(classFileWriter, i12, clsArr[i13]);
            classFileWriter.r(83);
        }
    }

    public static void generateReturnResult(ClassFileWriter classFileWriter, Class<?> cls, boolean z11) {
        if (cls == Void.TYPE) {
            classFileWriter.r(87);
            classFileWriter.r(177);
            return;
        }
        if (cls == Boolean.TYPE) {
            classFileWriter.K(184, "org/mozilla/javascript/Context", "toBoolean", "(Ljava/lang/Object;)Z");
            classFileWriter.r(172);
            return;
        }
        if (cls == Character.TYPE) {
            classFileWriter.K(184, "org/mozilla/javascript/Context", "toString", "(Ljava/lang/Object;)Ljava/lang/String;");
            classFileWriter.r(3);
            classFileWriter.K(182, "java/lang/String", "charAt", "(I)C");
            classFileWriter.r(172);
            return;
        }
        if (!cls.isPrimitive()) {
            String name = cls.getName();
            if (z11) {
                classFileWriter.T(name);
                classFileWriter.K(184, "java/lang/Class", "forName", "(Ljava/lang/String;)Ljava/lang/Class;");
                classFileWriter.K(184, "org/mozilla/javascript/JavaAdapter", "convertResult", "(Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;");
            }
            classFileWriter.u(192, name);
            classFileWriter.r(176);
            return;
        }
        classFileWriter.K(184, "org/mozilla/javascript/Context", "toNumber", "(Ljava/lang/Object;)D");
        char charAt = cls.getName().charAt(0);
        if (charAt != 'b') {
            if (charAt == 'd') {
                classFileWriter.r(175);
                return;
            }
            if (charAt == 'f') {
                classFileWriter.r(144);
                classFileWriter.r(174);
                return;
            } else if (charAt != 'i') {
                if (charAt == 'l') {
                    classFileWriter.r(143);
                    classFileWriter.r(173);
                    return;
                } else if (charAt != 's') {
                    throw new RuntimeException("Unexpected return type " + cls.toString());
                }
            }
        }
        classFileWriter.r(142);
        classFileWriter.r(172);
    }

    private static void generateSerialCtor(ClassFileWriter classFileWriter, String str, String str2) {
        classFileWriter.O0("<init>", "(Lorg/mozilla/javascript/ContextFactory;Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/Scriptable;)V", (short) 1);
        classFileWriter.r(42);
        classFileWriter.K(183, str2, "<init>", "()V");
        classFileWriter.r(42);
        classFileWriter.r(43);
        classFileWriter.v(181, str, "factory", "Lorg/mozilla/javascript/ContextFactory;");
        classFileWriter.r(42);
        classFileWriter.r(44);
        classFileWriter.v(181, str, "delegee", "Lorg/mozilla/javascript/Scriptable;");
        classFileWriter.r(42);
        classFileWriter.r(45);
        classFileWriter.v(181, str, "self", "Lorg/mozilla/javascript/Scriptable;");
        classFileWriter.r(177);
        classFileWriter.P0((short) 4);
    }

    private static void generateSuper(ClassFileWriter classFileWriter, String str, String str2, String str3, String str4, Class<?>[] clsArr, Class<?> cls) {
        classFileWriter.O0("super$" + str3, str4, (short) 1);
        classFileWriter.s(25, 0);
        int i11 = 1;
        for (Class<?> cls2 : clsArr) {
            i11 += generatePushParam(classFileWriter, i11, cls2);
        }
        classFileWriter.K(183, str2, str3, str4);
        if (cls.equals(Void.TYPE)) {
            classFileWriter.r(177);
        } else {
            generatePopResult(classFileWriter, cls);
        }
        classFileWriter.P0((short) (i11 + 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0067, code lost:
    
        if (r9 != 's') goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int generateWrapArg(org.mozilla.classfile.ClassFileWriter r7, int r8, java.lang.Class<?> r9) {
        /*
            boolean r0 = r9.isPrimitive()
            r1 = 1
            if (r0 != 0) goto Ld
            r9 = 25
            r7.s(r9, r8)
            return r1
        Ld:
            java.lang.Class r0 = java.lang.Boolean.TYPE
            java.lang.String r2 = "<init>"
            r3 = 183(0xb7, float:2.56E-43)
            r4 = 89
            r5 = 187(0xbb, float:2.62E-43)
            r6 = 21
            if (r9 != r0) goto L2c
            java.lang.String r9 = "java/lang/Boolean"
            r7.u(r5, r9)
            r7.r(r4)
            r7.s(r6, r8)
            java.lang.String r8 = "(Z)V"
            r7.K(r3, r9, r2, r8)
            return r1
        L2c:
            java.lang.Class r0 = java.lang.Character.TYPE
            if (r9 != r0) goto L3f
            r7.s(r6, r8)
            java.lang.String r8 = "valueOf"
            java.lang.String r9 = "(C)Ljava/lang/String;"
            r0 = 184(0xb8, float:2.58E-43)
            java.lang.String r2 = "java/lang/String"
            r7.K(r0, r2, r8, r9)
            return r1
        L3f:
            java.lang.String r0 = "java/lang/Double"
            r7.u(r5, r0)
            r7.r(r4)
            java.lang.String r9 = r9.getName()
            r4 = 0
            char r9 = r9.charAt(r4)
            r4 = 98
            if (r9 == r4) goto L87
            r4 = 100
            r5 = 2
            if (r9 == r4) goto L81
            r4 = 102(0x66, float:1.43E-43)
            if (r9 == r4) goto L76
            r4 = 105(0x69, float:1.47E-43)
            if (r9 == r4) goto L87
            r4 = 108(0x6c, float:1.51E-43)
            if (r9 == r4) goto L6a
            r4 = 115(0x73, float:1.61E-43)
            if (r9 == r4) goto L87
            goto L8f
        L6a:
            r9 = 22
            r7.s(r9, r8)
            r8 = 138(0x8a, float:1.93E-43)
            r7.r(r8)
        L74:
            r1 = r5
            goto L8f
        L76:
            r9 = 23
            r7.s(r9, r8)
            r8 = 141(0x8d, float:1.98E-43)
            r7.r(r8)
            goto L8f
        L81:
            r9 = 24
            r7.s(r9, r8)
            goto L74
        L87:
            r7.s(r6, r8)
            r8 = 135(0x87, float:1.89E-43)
            r7.r(r8)
        L8f:
            java.lang.String r8 = "(D)V"
            r7.K(r3, r0, r2, r8)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.JavaAdapter.generateWrapArg(org.mozilla.classfile.ClassFileWriter, int, java.lang.Class):int");
    }

    private static Class<?> getAdapterClass(Scriptable scriptable, Class<?> cls, Class<?>[] clsArr, Scriptable scriptable2) {
        ClassCache classCache = ClassCache.get(scriptable);
        Map<JavaAdapterSignature, Class<?>> interfaceAdapterCacheMap = classCache.getInterfaceAdapterCacheMap();
        ObjToIntMap objectFunctionNames = getObjectFunctionNames(scriptable2);
        JavaAdapterSignature javaAdapterSignature = new JavaAdapterSignature(cls, clsArr, objectFunctionNames);
        Class<?> cls2 = interfaceAdapterCacheMap.get(javaAdapterSignature);
        if (cls2 != null) {
            return cls2;
        }
        String str = "adapter" + classCache.newClassSerialNumber();
        Class<?> loadAdapterClass = loadAdapterClass(str, createAdapterCode(objectFunctionNames, str, cls, clsArr, null));
        if (classCache.isCachingEnabled()) {
            interfaceAdapterCacheMap.put(javaAdapterSignature, loadAdapterClass);
        }
        return loadAdapterClass;
    }

    public static Object getAdapterSelf(Class<?> cls, Object obj) throws NoSuchFieldException, IllegalAccessException {
        return cls.getDeclaredField("self").get(obj);
    }

    public static int[] getArgsToConvert(Class<?>[] clsArr) {
        int i11 = 0;
        for (int i12 = 0; i12 != clsArr.length; i12++) {
            if (!clsArr[i12].isPrimitive()) {
                i11++;
            }
        }
        if (i11 == 0) {
            return null;
        }
        int[] iArr = new int[i11];
        int i13 = 0;
        for (int i14 = 0; i14 != clsArr.length; i14++) {
            if (!clsArr[i14].isPrimitive()) {
                iArr[i13] = i14;
                i13++;
            }
        }
        return iArr;
    }

    public static Function getFunction(Scriptable scriptable, String str) {
        Object property = ScriptableObject.getProperty(scriptable, str);
        if (property == Scriptable.NOT_FOUND) {
            return null;
        }
        if (property instanceof Function) {
            return (Function) property;
        }
        throw ScriptRuntime.notFunctionError(property, str);
    }

    private static String getMethodSignature(Method method, Class<?>[] clsArr) {
        StringBuilder sb2 = new StringBuilder();
        appendMethodSignature(clsArr, method.getReturnType(), sb2);
        return sb2.toString();
    }

    private static ObjToIntMap getObjectFunctionNames(Scriptable scriptable) {
        Object[] propertyIds = ScriptableObject.getPropertyIds(scriptable);
        ObjToIntMap objToIntMap = new ObjToIntMap(propertyIds.length);
        for (int i11 = 0; i11 != propertyIds.length; i11++) {
            Object obj = propertyIds[i11];
            if (obj instanceof String) {
                String str = (String) obj;
                Object property = ScriptableObject.getProperty(scriptable, str);
                if (property instanceof Function) {
                    int int32 = ScriptRuntime.toInt32(ScriptableObject.getProperty((Function) property, "length"));
                    if (int32 < 0) {
                        int32 = 0;
                    }
                    objToIntMap.put(str, int32);
                }
            }
        }
        return objToIntMap;
    }

    public static Method[] getOverridableMethods(Class<?> cls) {
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        for (Class<?> cls2 = cls; cls2 != null; cls2 = cls2.getSuperclass()) {
            appendOverridableMethods(cls2, arrayList, hashSet);
        }
        while (cls != null) {
            for (Class<?> cls3 : cls.getInterfaces()) {
                appendOverridableMethods(cls3, arrayList, hashSet);
            }
            cls = cls.getSuperclass();
        }
        return (Method[]) arrayList.toArray(new Method[arrayList.size()]);
    }

    public static void init(Context context, Scriptable scriptable, boolean z11) {
        IdFunctionObject idFunctionObject = new IdFunctionObject(new JavaAdapter(), FTAG, 1, "JavaAdapter", 1, scriptable);
        idFunctionObject.markAsConstructor(null);
        if (z11) {
            idFunctionObject.sealObject();
        }
        idFunctionObject.exportAsScopeProperty();
    }

    public static Object js_createAdapter(Context context, Scriptable scriptable, Object[] objArr) {
        Object newInstance;
        int length = objArr.length;
        if (length == 0) {
            throw ScriptRuntime.typeError0("msg.adapter.zero.args");
        }
        int i11 = 0;
        while (i11 < length - 1) {
            Object obj = objArr[i11];
            if (obj instanceof NativeObject) {
                break;
            }
            if (!(obj instanceof NativeJavaClass)) {
                throw ScriptRuntime.typeError2("msg.not.java.class.arg", String.valueOf(i11), ScriptRuntime.toString(obj));
            }
            i11++;
        }
        Class[] clsArr = new Class[i11];
        Class<?> cls = null;
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            Class<?> classObject = ((NativeJavaClass) objArr[i13]).getClassObject();
            if (classObject.isInterface()) {
                clsArr[i12] = classObject;
                i12++;
            } else {
                if (cls != null) {
                    throw ScriptRuntime.typeError2("msg.only.one.super", cls.getName(), classObject.getName());
                }
                cls = classObject;
            }
        }
        if (cls == null) {
            cls = ScriptRuntime.ObjectClass;
        }
        Class[] clsArr2 = new Class[i12];
        System.arraycopy(clsArr, 0, clsArr2, 0, i12);
        Scriptable ensureScriptable = ScriptableObject.ensureScriptable(objArr[i11]);
        Class<?> adapterClass = getAdapterClass(scriptable, cls, clsArr2, ensureScriptable);
        int i14 = length - i11;
        int i15 = i14 - 1;
        try {
            if (i15 > 0) {
                Object[] objArr2 = new Object[i14 + 1];
                objArr2[0] = ensureScriptable;
                objArr2[1] = context.getFactory();
                System.arraycopy(objArr, i11 + 1, objArr2, 2, i15);
                NativeJavaMethod nativeJavaMethod = new NativeJavaClass(scriptable, adapterClass, true).members.ctors;
                int findCachedFunction = nativeJavaMethod.findCachedFunction(context, objArr2);
                if (findCachedFunction < 0) {
                    throw Context.reportRuntimeError2("msg.no.java.ctor", adapterClass.getName(), NativeJavaMethod.scriptSignature(objArr));
                }
                newInstance = NativeJavaClass.constructInternal(objArr2, nativeJavaMethod.methods[findCachedFunction]);
            } else {
                newInstance = adapterClass.getConstructor(ScriptRuntime.ScriptableClass, ScriptRuntime.ContextFactoryClass).newInstance(ensureScriptable, context.getFactory());
            }
            Object adapterSelf = getAdapterSelf(adapterClass, newInstance);
            if (adapterSelf instanceof Wrapper) {
                Object unwrap = ((Wrapper) adapterSelf).unwrap();
                if (unwrap instanceof Scriptable) {
                    if (unwrap instanceof ScriptableObject) {
                        ScriptRuntime.setObjectProtoAndParent((ScriptableObject) unwrap, scriptable);
                    }
                    return unwrap;
                }
            }
            return adapterSelf;
        } catch (Exception e11) {
            throw Context.throwAsScriptRuntimeEx(e11);
        }
    }

    public static Class<?> loadAdapterClass(String str, byte[] bArr) {
        ProtectionDomain scriptProtectionDomain;
        Class<?> staticSecurityDomainClass = SecurityController.getStaticSecurityDomainClass();
        if (staticSecurityDomainClass == CodeSource.class || staticSecurityDomainClass == ProtectionDomain.class) {
            scriptProtectionDomain = SecurityUtilities.getScriptProtectionDomain();
            if (scriptProtectionDomain == null) {
                scriptProtectionDomain = JavaAdapter.class.getProtectionDomain();
            }
            if (staticSecurityDomainClass == CodeSource.class) {
                if (scriptProtectionDomain != null) {
                    scriptProtectionDomain = scriptProtectionDomain.getCodeSource();
                }
            }
            GeneratedClassLoader createLoader = SecurityController.createLoader(null, scriptProtectionDomain);
            Class<?> defineClass = createLoader.defineClass(str, bArr);
            createLoader.linkClass(defineClass);
            return defineClass;
        }
        scriptProtectionDomain = null;
        GeneratedClassLoader createLoader2 = SecurityController.createLoader(null, scriptProtectionDomain);
        Class<?> defineClass2 = createLoader2.defineClass(str, bArr);
        createLoader2.linkClass(defineClass2);
        return defineClass2;
    }

    public static Object readAdapterObject(Scriptable scriptable, ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        Context currentContext = Context.getCurrentContext();
        ContextFactory factory = currentContext != null ? currentContext.getFactory() : null;
        Class<?> cls = Class.forName((String) objectInputStream.readObject());
        String[] strArr = (String[]) objectInputStream.readObject();
        Class[] clsArr = new Class[strArr.length];
        for (int i11 = 0; i11 < strArr.length; i11++) {
            clsArr[i11] = Class.forName(strArr[i11]);
        }
        Scriptable scriptable2 = (Scriptable) objectInputStream.readObject();
        Class<?> adapterClass = getAdapterClass(scriptable, cls, clsArr, scriptable2);
        Class<?> cls2 = ScriptRuntime.ContextFactoryClass;
        Class<Scriptable> cls3 = ScriptRuntime.ScriptableClass;
        try {
            return adapterClass.getConstructor(cls2, cls3, cls3).newInstance(factory, scriptable2, scriptable);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
            throw new ClassNotFoundException("adapter");
        }
    }

    public static Scriptable runScript(final Script script) {
        return (Scriptable) ContextFactory.getGlobal().call(new ContextAction() { // from class: org.mozilla.javascript.JavaAdapter.2
            @Override // org.mozilla.javascript.ContextAction
            public Object run(Context context) {
                ScriptableObject global = ScriptRuntime.getGlobal(context);
                Script.this.exec(context, global);
                return global;
            }
        });
    }

    public static void writeAdapterObject(Object obj, ObjectOutputStream objectOutputStream) throws IOException {
        Class<?> cls = obj.getClass();
        objectOutputStream.writeObject(cls.getSuperclass().getName());
        Class<?>[] interfaces = cls.getInterfaces();
        String[] strArr = new String[interfaces.length];
        for (int i11 = 0; i11 < interfaces.length; i11++) {
            strArr[i11] = interfaces[i11].getName();
        }
        objectOutputStream.writeObject(strArr);
        try {
            objectOutputStream.writeObject(cls.getField("delegee").get(obj));
        } catch (IllegalAccessException | NoSuchFieldException unused) {
            throw new IOException();
        }
    }

    @Override // org.mozilla.javascript.IdFunctionCall
    public Object execIdCall(IdFunctionObject idFunctionObject, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        if (idFunctionObject.hasTag(FTAG) && idFunctionObject.methodId() == 1) {
            return js_createAdapter(context, scriptable, objArr);
        }
        throw idFunctionObject.unknown();
    }
}

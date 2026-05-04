package org.mozilla.javascript;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.LinkedList;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class NativeJavaMethod extends BaseFunction {
    private static final int PREFERENCE_AMBIGUOUS = 3;
    private static final int PREFERENCE_EQUAL = 0;
    private static final int PREFERENCE_FIRST_ARG = 1;
    private static final int PREFERENCE_SECOND_ARG = 2;
    private static final boolean debug = false;
    static final long serialVersionUID = -3440381785576412928L;
    private String functionName;
    MemberBox[] methods;
    private transient LinkedList<ResolvedOverload> overloadCache;

    public NativeJavaMethod(MemberBox[] memberBoxArr) {
        this.functionName = memberBoxArr[0].getName();
        this.methods = memberBoxArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00a2, code lost:
    
        if ((r14.member().getModifiers() & r5) == 0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00ee, code lost:
    
        r3 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00f0, code lost:
    
        if (r12 != r3) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00f2, code lost:
    
        r7 = r6;
        r8 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00f6, code lost:
    
        if (r13 != r3) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00f9, code lost:
    
        if (r2 != null) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00fb, code lost:
    
        r17 = 1;
        r2 = new int[r19.length - 1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0105, code lost:
    
        r2[r8] = r6;
        r8 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0103, code lost:
    
        r17 = 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int findFunction(org.mozilla.javascript.Context r18, org.mozilla.javascript.MemberBox[] r19, java.lang.Object[] r20) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.NativeJavaMethod.findFunction(org.mozilla.javascript.Context, org.mozilla.javascript.MemberBox[], java.lang.Object[]):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0041, code lost:
    
        if (r4.isAssignableFrom(r3) != false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int preferSignature(java.lang.Object[] r9, java.lang.Class<?>[] r10, boolean r11, java.lang.Class<?>[] r12, boolean r13) {
        /*
            r0 = 0
            r1 = r0
        L2:
            int r2 = r9.length
            if (r0 >= r2) goto L4c
            r2 = 1
            if (r11 == 0) goto L10
            int r3 = r10.length
            if (r0 < r3) goto L10
            int r3 = r10.length
            int r3 = r3 - r2
            r3 = r10[r3]
            goto L12
        L10:
            r3 = r10[r0]
        L12:
            if (r13 == 0) goto L1c
            int r4 = r12.length
            if (r0 < r4) goto L1c
            int r4 = r12.length
            int r4 = r4 - r2
            r4 = r12[r4]
            goto L1e
        L1c:
            r4 = r12[r0]
        L1e:
            if (r3 != r4) goto L21
            goto L49
        L21:
            r5 = r9[r0]
            int r6 = org.mozilla.javascript.NativeJavaObject.getConversionWeight(r5, r3)
            int r5 = org.mozilla.javascript.NativeJavaObject.getConversionWeight(r5, r4)
            r7 = 3
            if (r6 >= r5) goto L2f
            goto L45
        L2f:
            r8 = 2
            if (r6 <= r5) goto L34
        L32:
            r2 = r8
            goto L45
        L34:
            if (r6 != 0) goto L44
            boolean r5 = r3.isAssignableFrom(r4)
            if (r5 == 0) goto L3d
            goto L32
        L3d:
            boolean r3 = r4.isAssignableFrom(r3)
            if (r3 == 0) goto L44
            goto L45
        L44:
            r2 = r7
        L45:
            r1 = r1 | r2
            if (r1 != r7) goto L49
            return r1
        L49:
            int r0 = r0 + 1
            goto L2
        L4c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.NativeJavaMethod.preferSignature(java.lang.Object[], java.lang.Class[], boolean, java.lang.Class[], boolean):int");
    }

    public static String scriptSignature(Object[] objArr) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i11 = 0; i11 != objArr.length; i11++) {
            Object obj = objArr[i11];
            String name = obj == null ? "null" : obj instanceof Boolean ? TypedValues.Custom.S_BOOLEAN : obj instanceof String ? TypedValues.Custom.S_STRING : obj instanceof Number ? "number" : obj instanceof Scriptable ? obj instanceof Undefined ? "undefined" : obj instanceof Wrapper ? ((Wrapper) obj).unwrap().getClass().getName() : obj instanceof Function ? "function" : "object" : JavaMembers.javaSignature(obj.getClass());
            if (i11 != 0) {
                stringBuffer.append(',');
            }
            stringBuffer.append(name);
        }
        return stringBuffer.toString();
    }

    @Override // org.mozilla.javascript.BaseFunction, org.mozilla.javascript.Function, org.mozilla.javascript.Callable
    public Object call(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Object[] objArr2;
        Object obj;
        Object obj2;
        if (this.methods.length == 0) {
            throw new RuntimeException("No methods defined for call");
        }
        int findCachedFunction = findCachedFunction(context, objArr);
        int i11 = 0;
        if (findCachedFunction < 0) {
            throw Context.reportRuntimeError1("msg.java.no_such_method", this.methods[0].method().getDeclaringClass().getName() + '.' + getFunctionName() + '(' + scriptSignature(objArr) + ')');
        }
        MemberBox memberBox = this.methods[findCachedFunction];
        Class<?>[] clsArr = memberBox.argTypes;
        if (memberBox.vararg) {
            objArr2 = new Object[clsArr.length];
            for (int i12 = 0; i12 < clsArr.length - 1; i12++) {
                objArr2[i12] = Context.jsToJava(objArr[i12], clsArr[i12]);
            }
            if (objArr.length == clsArr.length && (objArr[objArr.length - 1] == null || (objArr[objArr.length - 1] instanceof NativeArray) || (objArr[objArr.length - 1] instanceof NativeJavaArray))) {
                obj2 = Context.jsToJava(objArr[objArr.length - 1], clsArr[clsArr.length - 1]);
            } else {
                Class<?> componentType = clsArr[clsArr.length - 1].getComponentType();
                Object newInstance = Array.newInstance(componentType, (objArr.length - clsArr.length) + 1);
                while (i11 < Array.getLength(newInstance)) {
                    Array.set(newInstance, i11, Context.jsToJava(objArr[(clsArr.length - 1) + i11], componentType));
                    i11++;
                }
                obj2 = newInstance;
            }
            objArr2[clsArr.length - 1] = obj2;
        } else {
            objArr2 = objArr;
            while (i11 < objArr2.length) {
                Object obj3 = objArr2[i11];
                Object jsToJava = Context.jsToJava(obj3, clsArr[i11]);
                if (jsToJava != obj3) {
                    if (objArr == objArr2) {
                        objArr2 = (Object[]) objArr2.clone();
                    }
                    objArr2[i11] = jsToJava;
                }
                i11++;
            }
        }
        if (!memberBox.isStatic()) {
            Class<?> declaringClass = memberBox.getDeclaringClass();
            for (Scriptable scriptable3 = scriptable2; scriptable3 != null; scriptable3 = scriptable3.getPrototype()) {
                if (scriptable3 instanceof Wrapper) {
                    Object unwrap = ((Wrapper) scriptable3).unwrap();
                    if (declaringClass.isInstance(unwrap)) {
                        obj = unwrap;
                    }
                }
            }
            throw Context.reportRuntimeError3("msg.nonjava.method", getFunctionName(), ScriptRuntime.toString(scriptable2), declaringClass.getName());
        }
        obj = null;
        Object invoke = memberBox.invoke(obj, objArr2);
        Class<?> returnType = memberBox.method().getReturnType();
        Object wrap = context.getWrapFactory().wrap(context, scriptable, invoke, returnType);
        return (wrap == null && returnType == Void.TYPE) ? Undefined.instance : wrap;
    }

    @Override // org.mozilla.javascript.BaseFunction
    public String decompile(int i11, int i12) {
        StringBuffer stringBuffer = new StringBuffer();
        boolean z11 = (i12 & 1) != 0;
        if (!z11) {
            stringBuffer.append("function ");
            stringBuffer.append(getFunctionName());
            stringBuffer.append("() {");
        }
        stringBuffer.append("/*\n");
        stringBuffer.append(toString());
        stringBuffer.append(z11 ? "*/\n" : "*/}\n");
        return stringBuffer.toString();
    }

    public int findCachedFunction(Context context, Object[] objArr) {
        MemberBox[] memberBoxArr = this.methods;
        if (memberBoxArr.length <= 1) {
            return findFunction(context, memberBoxArr, objArr);
        }
        LinkedList<ResolvedOverload> linkedList = this.overloadCache;
        if (linkedList != null) {
            Iterator<ResolvedOverload> it = linkedList.iterator();
            while (it.hasNext()) {
                ResolvedOverload next = it.next();
                if (next.matches(objArr)) {
                    return next.index;
                }
            }
        } else {
            this.overloadCache = new LinkedList<>();
        }
        int findFunction = findFunction(context, this.methods, objArr);
        if (this.overloadCache.size() >= this.methods.length * 2) {
            return findFunction;
        }
        synchronized (this.overloadCache) {
            try {
                ResolvedOverload resolvedOverload = new ResolvedOverload(objArr, findFunction);
                if (!this.overloadCache.contains(resolvedOverload)) {
                    this.overloadCache.addFirst(resolvedOverload);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return findFunction;
    }

    @Override // org.mozilla.javascript.BaseFunction
    public String getFunctionName() {
        return this.functionName;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        int length = this.methods.length;
        for (int i11 = 0; i11 != length; i11++) {
            if (this.methods[i11].isMethod()) {
                Method method = this.methods[i11].method();
                stringBuffer.append(JavaMembers.javaSignature(method.getReturnType()));
                stringBuffer.append(' ');
                stringBuffer.append(method.getName());
            } else {
                stringBuffer.append(this.methods[i11].getName());
            }
            stringBuffer.append(JavaMembers.liveConnectSignature(this.methods[i11].argTypes));
            stringBuffer.append('\n');
        }
        return stringBuffer.toString();
    }

    public NativeJavaMethod(MemberBox[] memberBoxArr, String str) {
        this.functionName = str;
        this.methods = memberBoxArr;
    }

    public NativeJavaMethod(MemberBox memberBox, String str) {
        this.functionName = str;
        this.methods = new MemberBox[]{memberBox};
    }

    public NativeJavaMethod(Method method, String str) {
        this(new MemberBox(method), str);
    }

    private static void printDebug(String str, MemberBox memberBox, Object[] objArr) {
    }
}

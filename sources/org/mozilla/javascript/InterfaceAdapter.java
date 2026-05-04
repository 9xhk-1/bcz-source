package org.mozilla.javascript;

import java.lang.reflect.Method;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class InterfaceAdapter {
    private final Object proxyHelper;

    private InterfaceAdapter(ContextFactory contextFactory, Class<?> cls) {
        this.proxyHelper = VMBridge.instance.getInterfaceProxyHelper(contextFactory, new Class[]{cls});
    }

    public static Object create(Context context, Class<?> cls, ScriptableObject scriptableObject) {
        if (!cls.isInterface()) {
            throw new IllegalArgumentException();
        }
        Scriptable topCallScope = ScriptRuntime.getTopCallScope(context);
        ClassCache classCache = ClassCache.get(topCallScope);
        InterfaceAdapter interfaceAdapter = (InterfaceAdapter) classCache.getInterfaceAdapter(cls);
        ContextFactory factory = context.getFactory();
        if (interfaceAdapter == null) {
            Method[] methods = cls.getMethods();
            if (scriptableObject instanceof Callable) {
                int length = methods.length;
                if (length == 0) {
                    throw Context.reportRuntimeError1("msg.no.empty.interface.conversion", cls.getName());
                }
                if (length > 1) {
                    String name = methods[0].getName();
                    for (int i11 = 1; i11 < length; i11++) {
                        if (!name.equals(methods[i11].getName())) {
                            throw Context.reportRuntimeError1("msg.no.function.interface.conversion", cls.getName());
                        }
                    }
                }
            }
            interfaceAdapter = new InterfaceAdapter(factory, cls);
            classCache.cacheInterfaceAdapter(cls, interfaceAdapter);
        }
        InterfaceAdapter interfaceAdapter2 = interfaceAdapter;
        return VMBridge.instance.newInterfaceProxy(interfaceAdapter2.proxyHelper, factory, interfaceAdapter2, scriptableObject, topCallScope);
    }

    public Object invoke(ContextFactory contextFactory, final Object obj, final Scriptable scriptable, final Object obj2, final Method method, final Object[] objArr) {
        return contextFactory.call(new ContextAction() { // from class: org.mozilla.javascript.InterfaceAdapter.1
            @Override // org.mozilla.javascript.ContextAction
            public Object run(Context context) {
                return InterfaceAdapter.this.invokeImpl(context, obj, scriptable, obj2, method, objArr);
            }
        });
    }

    public Object invokeImpl(Context context, Object obj, Scriptable scriptable, Object obj2, Method method, Object[] objArr) {
        Callable callable;
        boolean z11 = obj instanceof Callable;
        Class<?> cls = Void.TYPE;
        if (z11) {
            callable = (Callable) obj;
        } else {
            String name = method.getName();
            Object property = ScriptableObject.getProperty((Scriptable) obj, name);
            if (property == Scriptable.NOT_FOUND) {
                Context.reportWarning(ScriptRuntime.getMessage1("msg.undefined.function.interface", name));
                Class<?> returnType = method.getReturnType();
                if (returnType == cls) {
                    return null;
                }
                return Context.jsToJava(null, returnType);
            }
            if (!(property instanceof Callable)) {
                throw Context.reportRuntimeError1("msg.not.function.interface", name);
            }
            callable = (Callable) property;
        }
        WrapFactory wrapFactory = context.getWrapFactory();
        if (objArr == null) {
            objArr = ScriptRuntime.emptyArgs;
        } else {
            int length = objArr.length;
            for (int i11 = 0; i11 != length; i11++) {
                Object obj3 = objArr[i11];
                if (!(obj3 instanceof String) && !(obj3 instanceof Number) && !(obj3 instanceof Boolean)) {
                    objArr[i11] = wrapFactory.wrap(context, scriptable, obj3, null);
                }
            }
        }
        Object call = callable.call(context, scriptable, wrapFactory.wrapAsJavaObject(context, scriptable, obj2, null), objArr);
        Class<?> returnType2 = method.getReturnType();
        if (returnType2 == cls) {
            return null;
        }
        return Context.jsToJava(call, returnType2);
    }
}

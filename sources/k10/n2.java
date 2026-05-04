package k10;

import java.lang.reflect.Method;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class n2 {
    public static final CharSequence a(Class cls) {
        kotlin.jvm.internal.g0.m(cls);
        return v10.f.f(cls);
    }

    public static final String d(Method method) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(method.getName());
        Class<?>[] parameterTypes = method.getParameterTypes();
        kotlin.jvm.internal.g0.o(parameterTypes, "getParameterTypes(...)");
        sb2.append(a00.a0.Eh(parameterTypes, "", pn.j.f81006c, pn.j.f81007d, 0, null, m2.f64969a, 24, null));
        Class<?> returnType = method.getReturnType();
        kotlin.jvm.internal.g0.o(returnType, "getReturnType(...)");
        sb2.append(v10.f.f(returnType));
        return sb2.toString();
    }
}

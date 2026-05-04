package u10;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Iterator;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final m f91525a = new m();

    @m80.k
    public final String a(@m80.k Constructor<?> constructor) {
        g0.p(constructor, "constructor");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(pn.j.f81006c);
        Iterator a11 = kotlin.jvm.internal.h.a(constructor.getParameterTypes());
        while (a11.hasNext()) {
            Class cls = (Class) a11.next();
            g0.m(cls);
            sb2.append(v10.f.f(cls));
        }
        sb2.append(")V");
        String sb3 = sb2.toString();
        g0.o(sb3, "toString(...)");
        return sb3;
    }

    @m80.k
    public final String b(@m80.k Field field) {
        g0.p(field, "field");
        Class<?> type = field.getType();
        g0.o(type, "getType(...)");
        return v10.f.f(type);
    }

    @m80.k
    public final String c(@m80.k Method method) {
        g0.p(method, "method");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(pn.j.f81006c);
        Iterator a11 = kotlin.jvm.internal.h.a(method.getParameterTypes());
        while (a11.hasNext()) {
            Class cls = (Class) a11.next();
            g0.m(cls);
            sb2.append(v10.f.f(cls));
        }
        sb2.append(pn.j.f81007d);
        Class<?> returnType = method.getReturnType();
        g0.o(returnType, "getReturnType(...)");
        sb2.append(v10.f.f(returnType));
        String sb3 = sb2.toString();
        g0.o(sb3, "toString(...)");
        return sb3;
    }
}

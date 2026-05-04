package tx;

import a00.k1;
import a00.l1;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.net.SocketOption;
import java.nio.channels.DatagramChannel;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nSocketOptionsPlatformCapabilities.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SocketOptionsPlatformCapabilities.kt\nio/ktor/network/sockets/SocketOptionsPlatformCapabilities\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,101:1\n3829#2:102\n4344#2,2:103\n1310#2,2:111\n1310#2,2:113\n1310#2,2:115\n1202#3,2:105\n1230#3,4:107\n*S KotlinDebug\n*F\n+ 1 SocketOptionsPlatformCapabilities.kt\nio/ktor/network/sockets/SocketOptionsPlatformCapabilities\n*L\n19#1:102\n19#1:103,2\n34#1:111,2\n51#1:113,2\n69#1:115,2\n24#1:105,2\n24#1:107,4\n*E\n"})
/* loaded from: classes8.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final r0 f91181a = new r0();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final Map<String, Field> f91182b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public static final Method f91183c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    public static final Method f91184d;

    /* renamed from: e, reason: collision with root package name */
    @m80.l
    public static final Method f91185e;

    static {
        Map z11;
        Method method;
        Method method2;
        try {
            Field[] fields = Class.forName("java.net.StandardSocketOptions").getFields();
            if (fields != null) {
                ArrayList arrayList = new ArrayList();
                for (Field field : fields) {
                    int modifiers = field.getModifiers();
                    if (Modifier.isStatic(modifiers) && Modifier.isFinal(modifiers) && Modifier.isPublic(modifiers)) {
                        arrayList.add(field);
                    }
                }
                z11 = new LinkedHashMap(g10.u.u(k1.j(a00.i0.d0(arrayList, 10)), 16));
                for (Object obj : arrayList) {
                    String name = ((Field) obj).getName();
                    kotlin.jvm.internal.g0.o(name, "getName(...)");
                    z11.put(name, obj);
                }
            } else {
                z11 = l1.z();
            }
        } catch (Throwable unused) {
            z11 = l1.z();
        }
        f91182b = z11;
        Method method3 = null;
        try {
            Class<?> cls = Class.forName("java.nio.channels.SocketChannel");
            Method[] methods = cls.getMethods();
            kotlin.jvm.internal.g0.o(methods, "getMethods(...)");
            int length = methods.length;
            for (int i11 = 0; i11 < length; i11++) {
                method = methods[i11];
                int modifiers2 = method.getModifiers();
                if (Modifier.isPublic(modifiers2) && !Modifier.isStatic(modifiers2) && kotlin.jvm.internal.g0.g(method.getName(), "setOption") && method.getParameterTypes().length == 2 && kotlin.jvm.internal.g0.g(method.getReturnType(), cls) && kotlin.jvm.internal.g0.g(method.getParameterTypes()[0], SocketOption.class) && kotlin.jvm.internal.g0.g(method.getParameterTypes()[1], Object.class)) {
                    break;
                }
            }
        } catch (Throwable unused2) {
        }
        method = null;
        f91183c = method;
        try {
            Class<?> cls2 = Class.forName("java.nio.channels.ServerSocketChannel");
            Method[] methods2 = cls2.getMethods();
            kotlin.jvm.internal.g0.o(methods2, "getMethods(...)");
            int length2 = methods2.length;
            for (int i12 = 0; i12 < length2; i12++) {
                method2 = methods2[i12];
                int modifiers3 = method2.getModifiers();
                if (Modifier.isPublic(modifiers3) && !Modifier.isStatic(modifiers3) && kotlin.jvm.internal.g0.g(method2.getName(), "setOption") && method2.getParameterTypes().length == 2 && kotlin.jvm.internal.g0.g(method2.getReturnType(), cls2) && kotlin.jvm.internal.g0.g(method2.getParameterTypes()[0], SocketOption.class) && kotlin.jvm.internal.g0.g(method2.getParameterTypes()[1], Object.class)) {
                    break;
                }
            }
        } catch (Throwable unused3) {
        }
        method2 = null;
        f91184d = method2;
        try {
            Class<?> cls3 = Class.forName("java.nio.channels.DatagramChannel");
            Method[] methods3 = cls3.getMethods();
            kotlin.jvm.internal.g0.o(methods3, "getMethods(...)");
            int length3 = methods3.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length3) {
                    break;
                }
                Method method4 = methods3[i13];
                int modifiers4 = method4.getModifiers();
                if (Modifier.isPublic(modifiers4) && !Modifier.isStatic(modifiers4) && kotlin.jvm.internal.g0.g(method4.getName(), "setOption") && method4.getParameterTypes().length == 2 && kotlin.jvm.internal.g0.g(method4.getReturnType(), cls3) && kotlin.jvm.internal.g0.g(method4.getParameterTypes()[0], SocketOption.class) && kotlin.jvm.internal.g0.g(method4.getParameterTypes()[1], Object.class)) {
                    method3 = method4;
                    break;
                }
                i13++;
            }
        } catch (Throwable unused4) {
        }
        f91185e = method3;
    }

    public final void a(@m80.k DatagramChannel channel) {
        kotlin.jvm.internal.g0.p(channel, "channel");
        Object d11 = d(s0.f91186a);
        Method method = f91185e;
        kotlin.jvm.internal.g0.m(method);
        method.invoke(channel, d11, Boolean.TRUE);
    }

    public final void b(@m80.k ServerSocketChannel channel) {
        kotlin.jvm.internal.g0.p(channel, "channel");
        Object d11 = d(s0.f91186a);
        Method method = f91184d;
        kotlin.jvm.internal.g0.m(method);
        method.invoke(channel, d11, Boolean.TRUE);
    }

    public final void c(@m80.k SocketChannel channel) {
        kotlin.jvm.internal.g0.p(channel, "channel");
        Object d11 = d(s0.f91186a);
        Method method = f91183c;
        kotlin.jvm.internal.g0.m(method);
        method.invoke(channel, d11, Boolean.TRUE);
    }

    public final Object d(String str) {
        Object obj;
        Field field = f91182b.get(str);
        if (field != null && (obj = field.get(null)) != null) {
            return obj;
        }
        throw new IOException("Socket option " + str + " is not supported");
    }
}

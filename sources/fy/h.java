package fy;

import a00.h0;
import a00.r0;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.nio.file.WatchEvent;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.reflect.KParameter;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nAutoReloadUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutoReloadUtils.kt\nio/ktor/server/engine/internal/AutoReloadUtilsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,79:1\n1#2:80\n1734#3,3:81\n1782#3,4:84\n*S KotlinDebug\n*F\n+ 1 AutoReloadUtils.kt\nio/ktor/server/engine/internal/AutoReloadUtilsKt\n*L\n59#1:81,3\n36#1:84,4\n*E\n"})
/* loaded from: classes8.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final ThreadLocal<List<String>> f52427a = new ThreadLocal<>();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final Class<zx.f> f52428b = zx.f.class;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final Class<zx.a> f52429c = zx.a.class;

    @m80.l
    public static final <R> h10.i<R> d(@m80.k List<? extends h10.i<? extends R>> list) {
        g0.p(list, "<this>");
        return (h10.i) r0.A3(r0.z5(list, e00.g.h(new x00.l() { // from class: fy.e
            @Override // x00.l
            public final Object invoke(Object obj) {
                Comparable e11;
                e11 = h.e((h10.i) obj);
                return e11;
            }
        }, new x00.l() { // from class: fy.f
            @Override // x00.l
            public final Object invoke(Object obj) {
                Comparable f11;
                f11 = h.f((h10.i) obj);
                return f11;
            }
        }, new x00.l() { // from class: fy.g
            @Override // x00.l
            public final Object invoke(Object obj) {
                Comparable g11;
                g11 = h.g((h10.i) obj);
                return g11;
            }
        })));
    }

    public static final Comparable e(h10.i it) {
        g0.p(it, "it");
        boolean z11 = false;
        if (!it.getParameters().isEmpty() && m(it.getParameters().get(0))) {
            z11 = true;
        }
        return Boolean.valueOf(z11);
    }

    public static final Comparable f(h10.i it) {
        g0.p(it, "it");
        List<KParameter> parameters = it.getParameters();
        int i11 = 0;
        if (!(parameters instanceof Collection) || !parameters.isEmpty()) {
            Iterator<T> it2 = parameters.iterator();
            while (it2.hasNext()) {
                if (!((KParameter) it2.next()).isOptional() && (i11 = i11 + 1) < 0) {
                    h0.a0();
                }
            }
        }
        return Integer.valueOf(i11);
    }

    public static final Comparable g(h10.i it) {
        g0.p(it, "it");
        return Integer.valueOf(it.getParameters().size());
    }

    @m80.k
    public static final Class<zx.a> h() {
        return f52429c;
    }

    @m80.k
    public static final Class<zx.f> i() {
        return f52428b;
    }

    @m80.k
    public static final ThreadLocal<List<String>> j() {
        return f52427a;
    }

    @m80.l
    public static final WatchEvent.Modifier k() {
        if (System.getenv("ANDROID_DATA") != null) {
            return null;
        }
        try {
            Class<?> cls = Class.forName("com.sun.nio.file.SensitivityWatchEventModifier");
            Object obj = cls.getField("HIGH").get(cls);
            if (c.a(obj)) {
                return d.a(obj);
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static final boolean l(@m80.k h10.i<?> iVar) {
        g0.p(iVar, "<this>");
        if (iVar.isOperator() || iVar.isInfix() || iVar.isInline() || iVar.isAbstract() || iVar.isSuspend()) {
            return false;
        }
        KParameter d11 = i10.c.d(iVar);
        if (d11 != null && !m(d11) && !n(d11)) {
            return false;
        }
        Method g11 = j10.e.g(iVar);
        if (g11 != null) {
            if (g11.isSynthetic()) {
                return false;
            }
            if (Modifier.isStatic(g11.getModifiers()) && iVar.getParameters().isEmpty()) {
                return false;
            }
        }
        List<KParameter> parameters = iVar.getParameters();
        if ((parameters instanceof Collection) && parameters.isEmpty()) {
            return true;
        }
        for (KParameter kParameter : parameters) {
            if (!m(kParameter) && !n(kParameter) && kParameter.getKind() != KParameter.Kind.INSTANCE && !kParameter.isOptional()) {
                return false;
            }
        }
        return true;
    }

    public static final boolean m(@m80.k KParameter parameter) {
        g0.p(parameter, "parameter");
        return o(parameter, f52429c);
    }

    public static final boolean n(@m80.k KParameter parameter) {
        g0.p(parameter, "parameter");
        return o(parameter, f52428b);
    }

    public static final boolean o(@m80.k KParameter parameter, @m80.k Class<?> type) {
        g0.p(parameter, "parameter");
        g0.p(type, "type");
        Type i11 = j10.e.i(parameter.getType());
        Class<?> cls = i11 instanceof Class ? (Class) i11 : null;
        if (cls != null) {
            return type.isAssignableFrom(cls);
        }
        return false;
    }

    @m80.l
    public static final Class<?> p(@m80.k ClassLoader classLoader, @m80.k String name) {
        g0.p(classLoader, "<this>");
        g0.p(name, "name");
        try {
            return classLoader.loadClass(name);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    @m80.l
    public static final h10.d<?> q(@m80.k Class<?> cls) {
        g0.p(cls, "<this>");
        Metadata metadata = (Metadata) cls.getAnnotation(Metadata.class);
        if (metadata == null || metadata.k() != 1) {
            metadata = null;
        }
        if (metadata != null) {
            return w00.b.i(cls);
        }
        return null;
    }
}

package i90;

import java.lang.reflect.Method;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class b {

    /* renamed from: e, reason: collision with root package name */
    public static final Method f60444e = b();

    /* renamed from: f, reason: collision with root package name */
    public static final String f60445f = "!!NO_NAME!!";

    /* renamed from: a, reason: collision with root package name */
    public final Object f60446a;

    /* renamed from: b, reason: collision with root package name */
    public Method f60447b;

    /* renamed from: c, reason: collision with root package name */
    public Method f60448c;

    /* renamed from: d, reason: collision with root package name */
    public String f60449d;

    public b(Object obj) {
        this.f60446a = obj;
    }

    public static Method b() {
        try {
            return Object.class.getMethod("hashCode", null);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public static Object e(Object obj, Method method) {
        try {
            return method.invoke(obj, null);
        } catch (Exception unused) {
            return null;
        }
    }

    public final String a() {
        if (this.f60449d == null) {
            this.f60449d = (String) e(this.f60446a, a.f60442g);
        }
        String str = this.f60449d;
        if (str == f60445f) {
            return null;
        }
        return str;
    }

    public final Method c() {
        if (this.f60448c == null) {
            this.f60448c = (Method) e(this.f60446a, a.f60441f);
        }
        Method method = this.f60448c;
        if (method == f60444e) {
            return null;
        }
        return method;
    }

    public final Method d() {
        if (this.f60447b == null) {
            this.f60447b = (Method) e(this.f60446a, a.f60440e);
        }
        Method method = this.f60447b;
        if (method == f60444e) {
            return null;
        }
        return method;
    }
}

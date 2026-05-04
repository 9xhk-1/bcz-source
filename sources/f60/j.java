package f60;

import java.lang.reflect.Method;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class j {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final a f51131d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @m80.l
    public final Method f51132a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    public final Method f51133b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public final Method f51134c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        @m80.k
        public final j a() {
            Method method;
            Method method2;
            Method method3 = null;
            try {
                Class<?> cls = Class.forName("dalvik.system.CloseGuard");
                Method method4 = cls.getMethod(ct.d.f46852f, null);
                method2 = cls.getMethod("open", String.class);
                method = cls.getMethod("warnIfOpen", null);
                method3 = method4;
            } catch (Exception unused) {
                method = null;
                method2 = null;
            }
            return new j(method3, method2, method);
        }

        public a() {
        }
    }

    public j(@m80.l Method method, @m80.l Method method2, @m80.l Method method3) {
        this.f51132a = method;
        this.f51133b = method2;
        this.f51134c = method3;
    }

    @m80.l
    public final Object a(@m80.k String closer) {
        g0.p(closer, "closer");
        Method method = this.f51132a;
        if (method != null) {
            try {
                Object invoke = method.invoke(null, null);
                Method method2 = this.f51133b;
                g0.m(method2);
                method2.invoke(invoke, closer);
                return invoke;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public final boolean b(@m80.l Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            Method method = this.f51134c;
            g0.m(method);
            method.invoke(obj, null);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}

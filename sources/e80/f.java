package e80;

import java.lang.reflect.Method;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Deprecated
/* loaded from: classes9.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final Method f49587a = a();

    public static Method a() {
        try {
            return Throwable.class.getMethod("initCause", Throwable.class);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public static void b(Throwable th2, Throwable th3) {
        Method method = f49587a;
        if (method != null) {
            try {
                method.invoke(th2, th3);
            } catch (Exception unused) {
            }
        }
    }
}

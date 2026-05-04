package xw;

import java.lang.reflect.Method;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class c implements e {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final e f98396b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final String f98397c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    public final Method f98398d;

    public c(@m80.k Class<?> logClass, @m80.k e fallback) {
        Method method;
        g0.p(logClass, "logClass");
        g0.p(fallback, "fallback");
        this.f98396b = fallback;
        this.f98397c = "Ktor Client";
        try {
            method = logClass.getDeclaredMethod("i", String.class, String.class);
        } catch (Throwable unused) {
            method = null;
        }
        this.f98398d = method;
    }

    @Override // xw.e
    public void log(@m80.k String message) {
        g0.p(message, "message");
        Method method = this.f98398d;
        if (method == null) {
            this.f98396b.log(message);
            return;
        }
        try {
            method.invoke(null, this.f98397c, message);
        } catch (Throwable unused) {
            this.f98396b.log(message);
        }
    }
}

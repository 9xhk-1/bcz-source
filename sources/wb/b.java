package wb;

import java.lang.Thread;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class b implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    public Thread.UncaughtExceptionHandler f96120a;

    public b(Thread.UncaughtExceptionHandler defaultUEH) {
        this.f96120a = defaultUEH;
    }

    public void a() {
        this.f96120a = null;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable ex2) {
        if (ex2 != null && (ex2 instanceof Exception)) {
            a.g((Exception) ex2);
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f96120a;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, ex2);
        }
    }
}

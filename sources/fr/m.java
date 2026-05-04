package fr;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes7.dex */
public final class m {

    /* renamed from: d, reason: collision with root package name */
    public static final m f52294d = new m();

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f52296b = gr.a.a();

    /* renamed from: a, reason: collision with root package name */
    public final Executor f52295a = new a();

    /* renamed from: c, reason: collision with root package name */
    public final Executor f52297c = gr.a.b();

    public static final class a implements Executor {
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            runnable.run();
        }
    }

    public static ExecutorService a() {
        return f52294d.f52296b;
    }

    public static Executor b() {
        return f52294d.f52295a;
    }

    public static Executor c() {
        return f52294d.f52297c;
    }
}

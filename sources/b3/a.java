package b3;

import a3.q;
import com.badlogic.gdx.utils.GdxRuntimeException;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class a implements q {

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f5748a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: b3.a$a, reason: collision with other inner class name */
    public class ThreadFactoryC0102a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f5749a;

        public ThreadFactoryC0102a(String str) {
            this.f5749a = str;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, this.f5749a);
            thread.setDaemon(true);
            return thread;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b<T> implements Callable<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c f5751a;

        public b(c cVar) {
            this.f5751a = cVar;
        }

        @Override // java.util.concurrent.Callable
        public T call() throws Exception {
            return (T) this.f5751a.call();
        }
    }

    public a(int i11) {
        this(i11, "AsynchExecutor-Thread");
    }

    public <T> b3.b<T> b(c<T> cVar) {
        if (this.f5748a.isShutdown()) {
            throw new GdxRuntimeException("Cannot run tasks on an executor that has been shutdown (disposed)");
        }
        return new b3.b<>(this.f5748a.submit(new b(cVar)));
    }

    @Override // a3.q
    public void dispose() {
        this.f5748a.shutdown();
        try {
            this.f5748a.awaitTermination(Long.MAX_VALUE, TimeUnit.SECONDS);
        } catch (InterruptedException e11) {
            throw new GdxRuntimeException("Couldn't shutdown loading thread", e11);
        }
    }

    public a(int i11, String str) {
        this.f5748a = Executors.newFixedThreadPool(i11, new ThreadFactoryC0102a(str));
    }
}

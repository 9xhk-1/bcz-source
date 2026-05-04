package dw;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class c<Params, Progress, Result> {

    /* renamed from: b, reason: collision with root package name */
    public final b f48185b;

    /* renamed from: c, reason: collision with root package name */
    public final C0577c f48186c;

    /* renamed from: a, reason: collision with root package name */
    public volatile int f48184a = 1;

    /* renamed from: d, reason: collision with root package name */
    public a f48187d = new a(Looper.getMainLooper());

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            d dVar = (d) message.obj;
            int i11 = message.what;
            if (i11 == 1) {
                c cVar = dVar.f48190a;
                cVar.b(dVar.f48191b[0]);
                cVar.f48184a = 3;
                message.obj = null;
                return;
            }
            if (i11 == 2) {
                dVar.f48190a.getClass();
            } else {
                if (i11 != 3) {
                    return;
                }
                dVar.f48190a.getClass();
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends f<Params, Result> {
        public b() {
            super(0);
        }

        @Override // java.util.concurrent.Callable
        public final Result call() {
            c.this.getClass();
            Process.setThreadPriority(5);
            c cVar = c.this;
            cVar.getClass();
            return (Result) cVar.a();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: dw.c$c, reason: collision with other inner class name */
    public class C0577c extends c<Params, Progress, Result>.e {
        public C0577c(b bVar) {
            super(bVar);
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            return 0;
        }

        @Override // java.util.concurrent.FutureTask
        public final void done() {
            try {
                Result result = get();
                c cVar = c.this;
                cVar.f48187d.obtainMessage(1, new d(cVar, result)).sendToTarget();
            } catch (InterruptedException unused) {
                throw new RuntimeException("An error occur while execute doInBackground().");
            } catch (CancellationException unused2) {
                c.this.f48187d.obtainMessage(3, new d(c.this, null)).sendToTarget();
            } catch (ExecutionException unused3) {
                throw new RuntimeException("An error occur while execute doInBackground().");
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d<Data> {

        /* renamed from: a, reason: collision with root package name */
        public final c f48190a;

        /* renamed from: b, reason: collision with root package name */
        public final Data[] f48191b;

        public d(c cVar, Data... dataArr) {
            this.f48190a = cVar;
            this.f48191b = dataArr;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public abstract class e extends FutureTask<Result> implements Comparable<Object> {
        public e(b bVar) {
            super(bVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class f<Params, Result> implements Callable<Result> {
        public f() {
        }

        public /* synthetic */ f(int i11) {
            this();
        }
    }

    public c() {
        b bVar = new b();
        this.f48185b = bVar;
        this.f48186c = new C0577c(bVar);
    }

    public abstract String a();

    public abstract void b(Result result);
}

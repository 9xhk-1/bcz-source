package w2;

import a3.x0;
import com.badlogic.gdx.Net;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final ThreadPoolExecutor f94703a;

    /* renamed from: b, reason: collision with root package name */
    public final com.badlogic.gdx.utils.l<Net.b, HttpURLConnection> f94704b;

    /* renamed from: c, reason: collision with root package name */
    public final com.badlogic.gdx.utils.l<Net.b, Net.d> f94705c;

    /* renamed from: d, reason: collision with root package name */
    public final com.badlogic.gdx.utils.l<Net.b, Future<?>> f94706d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        public AtomicInteger f94707a = new AtomicInteger();

        public a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "NetThread" + this.f94707a.getAndIncrement());
            thread.setDaemon(true);
            return thread;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f94709a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Net.b f94710b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ HttpURLConnection f94711c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Net.d f94712d;

        public b(boolean z11, Net.b bVar, HttpURLConnection httpURLConnection, Net.d dVar) {
            this.f94709a = z11;
            this.f94710b = bVar;
            this.f94711c = httpURLConnection;
            this.f94712d = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (this.f94709a) {
                    String a11 = this.f94710b.a();
                    if (a11 != null) {
                        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(this.f94711c.getOutputStream(), kp.k.f68584e);
                        try {
                            outputStreamWriter.write(a11);
                            x0.a(outputStreamWriter);
                        } catch (Throwable th2) {
                            x0.a(outputStreamWriter);
                            throw th2;
                        }
                    } else {
                        InputStream c11 = this.f94710b.c();
                        if (c11 != null) {
                            OutputStream outputStream = this.f94711c.getOutputStream();
                            try {
                                x0.c(c11, outputStream);
                                x0.a(outputStream);
                            } catch (Throwable th3) {
                                x0.a(outputStream);
                                throw th3;
                            }
                        }
                    }
                }
                this.f94711c.connect();
                c cVar = new c(this.f94711c);
                try {
                    Net.d c12 = f.this.c(this.f94710b);
                    if (c12 != null) {
                        c12.b(cVar);
                    }
                } finally {
                    f.this.f(this.f94710b);
                    this.f94711c.disconnect();
                }
            } catch (Exception e11) {
                this.f94711c.disconnect();
                try {
                    this.f94712d.c(e11);
                } finally {
                    f.this.f(this.f94710b);
                }
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c implements Net.c {

        /* renamed from: a, reason: collision with root package name */
        public final HttpURLConnection f94714a;

        /* renamed from: b, reason: collision with root package name */
        public e f94715b;

        public c(HttpURLConnection httpURLConnection) throws IOException {
            this.f94714a = httpURLConnection;
            try {
                this.f94715b = new e(httpURLConnection.getResponseCode());
            } catch (IOException unused) {
                this.f94715b = new e(-1);
            }
        }

        @Override // com.badlogic.gdx.Net.c
        public Map<String, List<String>> a() {
            return this.f94714a.getHeaderFields();
        }

        @Override // com.badlogic.gdx.Net.c
        public InputStream b() {
            return e();
        }

        @Override // com.badlogic.gdx.Net.c
        public String c(String str) {
            return this.f94714a.getHeaderField(str);
        }

        @Override // com.badlogic.gdx.Net.c
        public String d() {
            InputStream e11 = e();
            if (e11 == null) {
                return "";
            }
            try {
                return x0.l(e11, this.f94714a.getContentLength(), kp.k.f68584e);
            } catch (IOException unused) {
                return "";
            } finally {
                x0.a(e11);
            }
        }

        public final InputStream e() {
            try {
                return this.f94714a.getInputStream();
            } catch (IOException unused) {
                return this.f94714a.getErrorStream();
            }
        }

        @Override // com.badlogic.gdx.Net.c
        public byte[] getResult() {
            InputStream e11 = e();
            if (e11 == null) {
                return x0.f1707b;
            }
            try {
                return x0.i(e11, this.f94714a.getContentLength());
            } catch (IOException unused) {
                return x0.f1707b;
            } finally {
                x0.a(e11);
            }
        }

        @Override // com.badlogic.gdx.Net.c
        public e getStatus() {
            return this.f94715b;
        }
    }

    public f() {
        this(Integer.MAX_VALUE);
    }

    public void a(Net.b bVar) {
        Net.d c11 = c(bVar);
        if (c11 != null) {
            c11.a();
            b(bVar);
            f(bVar);
        }
    }

    public final void b(Net.b bVar) {
        Future<?> k11 = this.f94706d.k(bVar);
        if (k11 != null) {
            k11.cancel(false);
        }
    }

    public synchronized Net.d c(Net.b bVar) {
        return this.f94705c.k(bVar);
    }

    public boolean d(Net.b bVar) {
        return c(bVar) != null;
    }

    public synchronized void e(Net.b bVar, Net.d dVar, HttpURLConnection httpURLConnection) {
        this.f94704b.r(bVar, httpURLConnection);
        this.f94705c.r(bVar, dVar);
    }

    public synchronized void f(Net.b bVar) {
        this.f94704b.u(bVar);
        this.f94705c.u(bVar);
        this.f94706d.u(bVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00b9 A[Catch: Exception -> 0x0038, LOOP:0: B:22:0x00b3->B:24:0x00b9, LOOP_END, TryCatch #0 {Exception -> 0x0038, blocks: (B:7:0x0013, B:9:0x0025, B:11:0x002d, B:15:0x003d, B:17:0x0045, B:20:0x004c, B:21:0x008d, B:22:0x00b3, B:24:0x00b9, B:26:0x00cf, B:42:0x0056, B:45:0x005e, B:47:0x0064, B:48:0x0075), top: B:6:0x0013 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void g(com.badlogic.gdx.Net.b r9, com.badlogic.gdx.Net.d r10) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.f.g(com.badlogic.gdx.Net$b, com.badlogic.gdx.Net$d):void");
    }

    public f(int i11) {
        boolean z11 = i11 == Integer.MAX_VALUE;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(z11 ? 0 : i11, i11, 60L, TimeUnit.SECONDS, (BlockingQueue<Runnable>) (z11 ? new SynchronousQueue() : new LinkedBlockingQueue()), new a());
        this.f94703a = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(!z11);
        this.f94704b = new com.badlogic.gdx.utils.l<>();
        this.f94705c = new com.badlogic.gdx.utils.l<>();
        this.f94706d = new com.badlogic.gdx.utils.l<>();
    }
}

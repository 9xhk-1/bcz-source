package com.microsoft.thrifty.service;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import ws.i;
import xs.d;
import xs.e;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nAsyncClientBase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AsyncClientBase.kt\ncom/microsoft/thrifty/service/AsyncClientBase\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,230:1\n1#2:231\n*E\n"})
/* loaded from: classes7.dex */
public class a extends ClientBase implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC0480a f40020a;

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f40021b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final BlockingQueue<d<?>> f40022c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final b f40023d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.microsoft.thrifty.service.a$a, reason: collision with other inner class name */
    public interface InterfaceC0480a {
        void a();

        void onError(@k Throwable th2);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class b extends Thread {
        public b() {
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0050 A[Catch: RejectedExecutionException -> 0x0062, TRY_ENTER, TryCatch #3 {RejectedExecutionException -> 0x0062, blocks: (B:11:0x0050, B:15:0x0059), top: B:9:0x004e }] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0059 A[Catch: RejectedExecutionException -> 0x0062, TRY_LEAVE, TryCatch #3 {RejectedExecutionException -> 0x0062, blocks: (B:11:0x0050, B:15:0x0059), top: B:9:0x004e }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void a() throws com.microsoft.thrifty.ThriftException, java.io.IOException, java.lang.InterruptedException {
            /*
                r5 = this;
                com.microsoft.thrifty.service.a r0 = com.microsoft.thrifty.service.a.this
                java.util.concurrent.BlockingQueue r0 = com.microsoft.thrifty.service.a.b9(r0)
                java.lang.Object r0 = r0.take()
                xs.d r0 = (xs.d) r0
                com.microsoft.thrifty.service.a r1 = com.microsoft.thrifty.service.a.this
                java.util.concurrent.atomic.AtomicBoolean r1 = r1.getRunning()
                boolean r1 = r1.get()
                if (r1 != 0) goto L26
                com.microsoft.thrifty.service.a r1 = com.microsoft.thrifty.service.a.this
                kotlin.jvm.internal.g0.m(r0)
                java.util.concurrent.CancellationException r2 = new java.util.concurrent.CancellationException
                r2.<init>()
                com.microsoft.thrifty.service.a.a9(r1, r0, r2)
                return
            L26:
                r1 = 0
                com.microsoft.thrifty.service.a r2 = com.microsoft.thrifty.service.a.this     // Catch: java.lang.Exception -> L31 com.microsoft.thrifty.service.ClientBase.ServerException -> L33 java.lang.RuntimeException -> L35 java.io.IOException -> L37
                kotlin.jvm.internal.g0.m(r0)     // Catch: java.lang.Exception -> L31 com.microsoft.thrifty.service.ClientBase.ServerException -> L33 java.lang.RuntimeException -> L35 java.io.IOException -> L37
                java.lang.Object r2 = r2.invokeRequest(r0)     // Catch: java.lang.Exception -> L31 com.microsoft.thrifty.service.ClientBase.ServerException -> L33 java.lang.RuntimeException -> L35 java.io.IOException -> L37
                goto L4e
            L31:
                r2 = move-exception
                goto L39
            L33:
                r2 = move-exception
                goto L49
            L35:
                r1 = move-exception
                goto L78
            L37:
                r1 = move-exception
                goto L81
            L39:
                boolean r3 = r2 instanceof ts.e
                if (r3 == 0) goto L41
            L3d:
                r4 = r2
                r2 = r1
                r1 = r4
                goto L4e
            L41:
                java.lang.AssertionError r0 = new java.lang.AssertionError
                java.lang.String r1 = "Unexpected exception"
                r0.<init>(r1, r2)
                throw r0
            L49:
                com.microsoft.thrifty.ThriftException r2 = r2.getThriftException()
                goto L3d
            L4e:
                if (r1 == 0) goto L59
                com.microsoft.thrifty.service.a r3 = com.microsoft.thrifty.service.a.this     // Catch: java.util.concurrent.RejectedExecutionException -> L62
                kotlin.jvm.internal.g0.m(r0)     // Catch: java.util.concurrent.RejectedExecutionException -> L62
                com.microsoft.thrifty.service.a.a9(r3, r0, r1)     // Catch: java.util.concurrent.RejectedExecutionException -> L62
                goto L77
            L59:
                com.microsoft.thrifty.service.a r3 = com.microsoft.thrifty.service.a.this     // Catch: java.util.concurrent.RejectedExecutionException -> L62
                kotlin.jvm.internal.g0.m(r0)     // Catch: java.util.concurrent.RejectedExecutionException -> L62
                com.microsoft.thrifty.service.a.Z8(r3, r0, r2)     // Catch: java.util.concurrent.RejectedExecutionException -> L62
                goto L77
            L62:
                if (r1 == 0) goto L6d
                xs.e<T> r0 = r0.callback
                kotlin.jvm.internal.g0.m(r0)
                r0.onError(r1)
                goto L77
            L6d:
                xs.e<T> r0 = r0.callback
                java.lang.String r1 = "null cannot be cast to non-null type com.microsoft.thrifty.service.ServiceMethodCallback<kotlin.Any?>"
                kotlin.jvm.internal.g0.n(r0, r1)
                r0.onSuccess(r2)
            L77:
                return
            L78:
                com.microsoft.thrifty.service.a r2 = com.microsoft.thrifty.service.a.this
                kotlin.jvm.internal.g0.m(r0)
                com.microsoft.thrifty.service.a.a9(r2, r0, r1)
                throw r1
            L81:
                com.microsoft.thrifty.service.a r2 = com.microsoft.thrifty.service.a.this
                kotlin.jvm.internal.g0.m(r0)
                com.microsoft.thrifty.service.a.a9(r2, r0, r1)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.microsoft.thrifty.service.a.b.a():void");
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Throwable th2;
            while (a.this.getRunning().get()) {
                try {
                    a();
                } catch (Throwable th3) {
                    th2 = th3;
                }
            }
            th2 = null;
            try {
                a.this.c9(th2);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@k i protocol, @k InterfaceC0480a listener) {
        super(protocol);
        g0.p(protocol, "protocol");
        g0.p(listener, "listener");
        this.f40020a = listener;
        this.f40021b = Executors.newSingleThreadExecutor();
        this.f40022c = new LinkedBlockingQueue();
        b bVar = new b();
        this.f40023d = bVar;
        bVar.setDaemon(true);
        bVar.start();
    }

    public static final void d9(Throwable th2, a this$0) {
        g0.p(this$0, "this$0");
        if (th2 != null) {
            this$0.f40020a.onError(th2);
        } else {
            this$0.f40020a.a();
        }
    }

    public static final void f9(d call, Object obj) {
        g0.p(call, "$call");
        e<T> eVar = call.callback;
        g0.n(eVar, "null cannot be cast to non-null type com.microsoft.thrifty.service.ServiceMethodCallback<kotlin.Any?>");
        eVar.onSuccess(obj);
    }

    public static final void h9(d call, Throwable error) {
        g0.p(call, "$call");
        g0.p(error, "$error");
        e<T> eVar = call.callback;
        g0.m(eVar);
        eVar.onError(error);
    }

    public final void c9(final Throwable th2) {
        if (getRunning().compareAndSet(true, false)) {
            this.f40023d.interrupt();
            closeProtocol();
            if (!this.f40022c.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                this.f40022c.drainTo(arrayList);
                CancellationException cancellationException = new CancellationException();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    try {
                        g9((d) it.next(), cancellationException);
                    } catch (Exception unused) {
                    }
                }
            }
            this.f40021b.execute(new Runnable() { // from class: xs.b
                @Override // java.lang.Runnable
                public final void run() {
                    com.microsoft.thrifty.service.a.d9(th2, this);
                }
            });
            try {
                this.f40021b.shutdown();
            } catch (Exception unused2) {
            }
        }
    }

    @Override // com.microsoft.thrifty.service.ClientBase, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        c9(null);
    }

    public final void e9(final d<?> dVar, final Object obj) {
        this.f40021b.execute(new Runnable() { // from class: xs.a
            @Override // java.lang.Runnable
            public final void run() {
                com.microsoft.thrifty.service.a.f9(d.this, obj);
            }
        });
    }

    public final void enqueue(@k d<?> methodCall) {
        g0.p(methodCall, "methodCall");
        if (!getRunning().get()) {
            throw new IllegalStateException("Cannot write to a closed service client");
        }
        if (!this.f40022c.offer(methodCall)) {
            throw new IllegalStateException("Call queue is full");
        }
    }

    public final void g9(final d<?> dVar, final Throwable th2) {
        this.f40021b.execute(new Runnable() { // from class: xs.c
            @Override // java.lang.Runnable
            public final void run() {
                com.microsoft.thrifty.service.a.h9(d.this, th2);
            }
        });
    }
}

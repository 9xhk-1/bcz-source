package com.baicizhan.client.framework.asynctask;

import android.os.Handler;
import android.os.Message;
import com.baicizhan.client.framework.asynctask.LAsyncTaskParallel;
import java.util.LinkedList;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public abstract class LAsyncTask<Params, Progress, Result> {

    /* renamed from: l, reason: collision with root package name */
    public static final int f17506l = 1;

    /* renamed from: m, reason: collision with root package name */
    public static final int f17507m = 2;

    /* renamed from: n, reason: collision with root package name */
    public static final com.baicizhan.client.framework.asynctask.a f17508n = com.baicizhan.client.framework.asynctask.a.g();

    /* renamed from: o, reason: collision with root package name */
    public static final d f17509o = new d(null);

    /* renamed from: a, reason: collision with root package name */
    public final f<Params, Result> f17510a;

    /* renamed from: b, reason: collision with root package name */
    public final jb.a<Result> f17511b;

    /* renamed from: c, reason: collision with root package name */
    public volatile LAsyncTaskStatus f17512c = LAsyncTaskStatus.PENDING;

    /* renamed from: d, reason: collision with root package name */
    public int f17513d = 1;

    /* renamed from: e, reason: collision with root package name */
    public int f17514e = 0;

    /* renamed from: f, reason: collision with root package name */
    public String f17515f = null;

    /* renamed from: g, reason: collision with root package name */
    public LAsyncTaskParallel f17516g = null;

    /* renamed from: h, reason: collision with root package name */
    public boolean f17517h = false;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicBoolean f17518i = new AtomicBoolean(false);

    /* renamed from: j, reason: collision with root package name */
    public final AtomicBoolean f17519j = new AtomicBoolean(false);

    /* renamed from: k, reason: collision with root package name */
    public boolean f17520k = false;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum LAsyncTaskStatus {
        PENDING,
        RUNNING,
        FINISHED
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends f<Params, Result> {
        public a() {
            super(null);
        }

        @Override // java.util.concurrent.Callable
        public Result call() throws Exception {
            if (LAsyncTask.this.f17511b.isCancelled()) {
                return null;
            }
            LAsyncTask lAsyncTask = LAsyncTask.this;
            return (Result) lAsyncTask.B(lAsyncTask.f(this.f17526a));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends jb.a<Result> {
        public b(Callable callable, LAsyncTask task) {
            super(callable, task);
        }

        @Override // jb.a
        public void a() {
            LAsyncTask.this.d();
        }

        @Override // java.util.concurrent.FutureTask
        public void done() {
            try {
                LAsyncTask.this.B(get());
            } catch (InterruptedException unused) {
            } catch (CancellationException unused2) {
                LAsyncTask.this.B(null);
            } catch (ExecutionException unused3) {
                LAsyncTask.this.B(null);
            } catch (Throwable th2) {
                throw new RuntimeException("An error occured while executing doInBackground()", th2);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f17523a;

        static {
            int[] iArr = new int[LAsyncTaskStatus.values().length];
            f17523a = iArr;
            try {
                iArr[LAsyncTaskStatus.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17523a[LAsyncTaskStatus.FINISHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d extends Handler {
        public d() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message msg) {
            e eVar = (e) msg.obj;
            int i11 = msg.what;
            if (i11 == 1) {
                eVar.f17524a.j(eVar.f17525b[0]);
            } else {
                if (i11 != 2) {
                    return;
                }
                eVar.f17524a.z(eVar.f17525b);
            }
        }

        public /* synthetic */ d(a aVar) {
            this();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class e<Data> {

        /* renamed from: a, reason: collision with root package name */
        public final LAsyncTask f17524a;

        /* renamed from: b, reason: collision with root package name */
        public final Data[] f17525b;

        public e(LAsyncTask task, Data... data) {
            this.f17524a = task;
            this.f17525b = data;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class f<Params, Result> implements Callable<Result> {

        /* renamed from: a, reason: collision with root package name */
        public Params[] f17526a;

        public f() {
        }

        public /* synthetic */ f(a aVar) {
            this();
        }
    }

    public LAsyncTask() {
        a aVar = new a();
        this.f17510a = aVar;
        this.f17511b = new b(aVar, this);
    }

    public static LinkedList<LAsyncTask<?, ?, ?>> D(int tag) {
        return f17508n.i(tag);
    }

    public static LinkedList<LAsyncTask<?, ?, ?>> E(int tag, String key) {
        return f17508n.j(tag, key);
    }

    public static LinkedList<LAsyncTask<?, ?, ?>> F(int tag) {
        return f17508n.k(tag);
    }

    public static LinkedList<LAsyncTask<?, ?, ?>> G(int tag, String key) {
        return f17508n.l(tag, key);
    }

    public static LAsyncTask<?, ?, ?> H(String key) {
        return f17508n.q(key);
    }

    public static LinkedList<LAsyncTask<?, ?, ?>> I(int tag) {
        return f17508n.r(tag);
    }

    public static LinkedList<LAsyncTask<?, ?, ?>> J(int tag, String key) {
        return f17508n.s(tag, key);
    }

    public static LAsyncTask<?, ?, ?> K(String key) {
        return f17508n.v(key);
    }

    public static LAsyncTask<?, ?, ?> L(String key) {
        return f17508n.x(key);
    }

    public static LinkedList<LAsyncTask<?, ?, ?>> M(int tag) {
        return f17508n.y(tag);
    }

    public static int i(int tag) {
        return f17508n.e(tag);
    }

    public void A(int concurrence) {
        if (concurrence == 1) {
            O(new LAsyncTaskParallel(LAsyncTaskParallel.LAsyncTaskParallelType.SERIAL, LAsyncTaskParallel.a.b()));
            return;
        }
        if (concurrence == 2) {
            O(new LAsyncTaskParallel(LAsyncTaskParallel.LAsyncTaskParallelType.TWO_PARALLEL, LAsyncTaskParallel.a.b()));
            return;
        }
        if (concurrence == 3) {
            O(new LAsyncTaskParallel(LAsyncTaskParallel.LAsyncTaskParallelType.THREE_PARALLEL, LAsyncTaskParallel.a.b()));
        } else if (concurrence != 4) {
            O(new LAsyncTaskParallel(LAsyncTaskParallel.LAsyncTaskParallelType.MAX_PARALLEL, LAsyncTaskParallel.a.b()));
        } else {
            O(new LAsyncTaskParallel(LAsyncTaskParallel.LAsyncTaskParallelType.FOUR_PARALLEL, LAsyncTaskParallel.a.b()));
        }
    }

    public final Result B(Result result) {
        if (!this.f17518i.compareAndSet(false, true)) {
            return null;
        }
        f17509o.obtainMessage(1, new e(this, result)).sendToTarget();
        return result;
    }

    public final void C(Progress... values) {
        if (r()) {
            return;
        }
        f17509o.obtainMessage(2, new e(this, values)).sendToTarget();
    }

    public String N(String key) {
        if (this.f17512c != LAsyncTaskStatus.PENDING) {
            throw new IllegalStateException("the task is already running");
        }
        String str = this.f17515f;
        this.f17515f = key;
        return str;
    }

    public void O(LAsyncTaskParallel parallel) {
        if (this.f17512c != LAsyncTaskStatus.PENDING) {
            throw new IllegalStateException("the task is already running");
        }
        if (parallel == null) {
            return;
        }
        this.f17516g = parallel;
    }

    public int P(int priority) {
        if (this.f17512c != LAsyncTaskStatus.PENDING) {
            throw new IllegalStateException("the task is already running");
        }
        int i11 = this.f17513d;
        this.f17513d = priority;
        return i11;
    }

    public void Q(boolean isSelfExecute) {
        if (this.f17512c != LAsyncTaskStatus.PENDING) {
            throw new IllegalStateException("the task is already running");
        }
        this.f17517h = isSelfExecute;
    }

    public int R(int tag) {
        if (this.f17512c != LAsyncTaskStatus.PENDING) {
            throw new IllegalStateException("the task is already running");
        }
        int i11 = this.f17514e;
        this.f17514e = tag;
        return i11;
    }

    public void S(boolean isTimeout) {
        this.f17520k = isTimeout;
    }

    public void d() {
        e(true);
    }

    public final boolean e(boolean mayInterruptIfRunning) {
        if (!this.f17517h) {
            f17508n.o(this);
        }
        boolean cancel = this.f17511b.cancel(mayInterruptIfRunning);
        if (this.f17519j.compareAndSet(false, true)) {
            x();
        }
        return cancel;
    }

    public abstract Result f(Params... params);

    public final LAsyncTask<Params, Progress, Result> g(Params... params) {
        return h(f17508n, params);
    }

    public final LAsyncTask<Params, Progress, Result> h(Executor exec, Params... params) {
        if (this.f17512c != LAsyncTaskStatus.PENDING) {
            int i11 = c.f17523a[this.f17512c.ordinal()];
            if (i11 == 1) {
                throw new IllegalStateException("Cannot execute task: the task is already running.");
            }
            if (i11 == 2) {
                throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
        }
        this.f17512c = LAsyncTaskStatus.RUNNING;
        y();
        this.f17510a.f17526a = params;
        exec.execute(this.f17511b);
        return this;
    }

    public final void j(Result result) {
        if (r()) {
            v(result);
        } else {
            w(result);
        }
        this.f17512c = LAsyncTaskStatus.FINISHED;
    }

    public final Result k() throws InterruptedException, ExecutionException {
        return this.f17511b.get();
    }

    public final Result l(long timeout, TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.f17511b.get(timeout, unit);
    }

    public String m() {
        return this.f17515f;
    }

    public LAsyncTaskParallel n() {
        return this.f17516g;
    }

    public int o() {
        return this.f17513d;
    }

    public final LAsyncTaskStatus p() {
        return this.f17512c;
    }

    public int q() {
        return this.f17514e;
    }

    public final boolean r() {
        return this.f17511b.isCancelled();
    }

    public boolean s() {
        return this.f17517h;
    }

    public boolean t() {
        return this.f17520k;
    }

    public void v(Result result) {
        u();
    }

    public void u() {
    }

    public void x() {
    }

    public void y() {
    }

    public void w(Result result) {
    }

    public void z(Progress... values) {
    }
}

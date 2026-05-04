package jb;

import com.baicizhan.client.framework.asynctask.LAsyncTask;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public abstract class a<V> extends FutureTask<V> {

    /* renamed from: a, reason: collision with root package name */
    public LAsyncTask<?, ?, ?> f64001a;

    public a(Callable<V> callable, LAsyncTask<?, ?, ?> task) {
        super(callable);
        this.f64001a = task;
    }

    public abstract void a();

    public LAsyncTask<?, ?, ?> b() {
        return this.f64001a;
    }

    public a(Runnable runnable, V result, LAsyncTask<?, ?, ?> task) {
        super(runnable, result);
        this.f64001a = task;
    }
}

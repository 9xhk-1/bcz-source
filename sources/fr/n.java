package fr;

import gr.j;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes7.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public static gr.j f52298a = new gr.j();

    public static k<List<k<?>>> a(Collection<? extends k<?>> collection) {
        return gr.j.b(collection);
    }

    public static k<List<k<?>>> b(k<?>... kVarArr) {
        return gr.j.b(Arrays.asList(kVarArr));
    }

    public static <TResult> TResult c(k<TResult> kVar) throws ExecutionException, InterruptedException {
        gr.j.e("await must not be called on the UI thread");
        if (kVar.isComplete()) {
            return (TResult) gr.j.d(kVar);
        }
        j.d dVar = new j.d();
        kVar.addOnSuccessListener(dVar).addOnFailureListener(dVar);
        dVar.f54084a.await();
        return (TResult) gr.j.d(kVar);
    }

    public static <TResult> TResult d(k<TResult> kVar, long j11, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        gr.j.e("await must not be called on the UI thread");
        if (!kVar.isComplete()) {
            j.d dVar = new j.d();
            kVar.addOnSuccessListener(dVar).addOnFailureListener(dVar);
            if (!dVar.f54084a.await(j11, timeUnit)) {
                throw new TimeoutException("Timed out waiting for Task");
            }
        }
        return (TResult) gr.j.d(kVar);
    }

    public static <TResult> k<TResult> e(Callable<TResult> callable) {
        return f52298a.c(m.b(), callable);
    }

    public static <TResult> k<TResult> f(Callable<TResult> callable) {
        return f52298a.c(m.a(), callable);
    }

    public static <TResult> k<TResult> g(Executor executor, Callable<TResult> callable) {
        return f52298a.c(executor, callable);
    }

    public static <TResult> k<TResult> h() {
        gr.i iVar = new gr.i();
        iVar.d();
        return iVar;
    }

    public static <TResult> k<TResult> i(Exception exc) {
        l lVar = new l();
        lVar.c(exc);
        return lVar.b();
    }

    public static <TResult> k<TResult> j(TResult tresult) {
        return gr.j.a(tresult);
    }

    public static k<Void> k(Collection<? extends k<?>> collection) {
        return gr.j.g(collection);
    }

    public static k<Void> l(k<?>... kVarArr) {
        return gr.j.g(Arrays.asList(kVarArr));
    }

    public static <TResult> k<List<TResult>> m(Collection<? extends k<TResult>> collection) {
        return gr.j.f(collection);
    }

    public static <TResult> k<List<TResult>> n(k<?>... kVarArr) {
        return gr.j.f(Arrays.asList(kVarArr));
    }
}

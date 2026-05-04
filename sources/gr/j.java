package gr;

import android.os.Looper;
import fr.k;
import fr.l;
import fr.m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* loaded from: classes7.dex */
public final class j {

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f54079a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Callable f54080b;

        public a(l lVar, Callable callable) {
            this.f54079a = lVar;
            this.f54080b = callable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.f54079a.d(this.f54080b.call());
            } catch (Exception e11) {
                this.f54079a.c(e11);
            }
        }
    }

    public static class b implements fr.d<Void, List<k<?>>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Collection f54082a;

        public b(Collection collection) {
            this.f54082a = collection;
        }

        @Override // fr.d
        public final /* synthetic */ List<k<?>> a(k<Void> kVar) throws Exception {
            ArrayList arrayList = new ArrayList(this.f54082a.size());
            arrayList.addAll(this.f54082a);
            return arrayList;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [TResult] */
    public static class c<TResult> implements fr.d<Void, List<TResult>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Collection f54083a;

        public c(Collection collection) {
            this.f54083a = collection;
        }

        @Override // fr.d
        public final /* synthetic */ Object a(k<Void> kVar) throws Exception {
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f54083a.iterator();
            while (it.hasNext()) {
                arrayList.add(((k) it.next()).getResult());
            }
            return arrayList;
        }
    }

    public static class d<TResult> implements fr.f, fr.h, fr.i<TResult> {

        /* renamed from: a, reason: collision with root package name */
        public final CountDownLatch f54084a = new CountDownLatch(1);

        @Override // fr.f
        public final void a() {
            this.f54084a.countDown();
        }

        @Override // fr.h
        public final void onFailure(Exception exc) {
            this.f54084a.countDown();
        }

        @Override // fr.i
        public final void onSuccess(TResult tresult) {
            this.f54084a.countDown();
        }
    }

    public static <TResult> k<TResult> a(TResult tresult) {
        l lVar = new l();
        lVar.d(tresult);
        return lVar.b();
    }

    public static k<List<k<?>>> b(Collection<? extends k<?>> collection) {
        return g(collection).continueWith(new b(collection));
    }

    public static <TResult> TResult d(k<TResult> kVar) throws ExecutionException {
        if (kVar.isSuccessful()) {
            return kVar.getResult();
        }
        throw new ExecutionException(kVar.getException());
    }

    public static void e(String str) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException(str);
        }
    }

    public static <TResult> k<List<TResult>> f(Collection<? extends k<?>> collection) {
        return (k<List<TResult>>) g(collection).continueWith(new c(collection));
    }

    public static k<Void> g(Collection<? extends k<?>> collection) {
        if (collection.isEmpty()) {
            return a(null);
        }
        Iterator<? extends k<?>> it = collection.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                throw new NullPointerException("task can not is null");
            }
        }
        i iVar = new i();
        e eVar = new e(collection.size(), iVar);
        for (k<?> kVar : collection) {
            kVar.addOnSuccessListener(m.b(), eVar);
            kVar.addOnFailureListener(m.b(), eVar);
            kVar.addOnCanceledListener(m.b(), eVar);
        }
        return iVar;
    }

    public final <TResult> k<TResult> c(Executor executor, Callable<TResult> callable) {
        l lVar = new l();
        try {
            executor.execute(new a(lVar, callable));
        } catch (Exception e11) {
            lVar.c(e11);
        }
        return lVar.b();
    }
}

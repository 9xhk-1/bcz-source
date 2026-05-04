package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import androidx.annotation.CheckResult;
import androidx.annotation.DrawableRes;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RawRes;
import cl.p;
import fl.o;
import java.io.File;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import yk.b;
import yk.q;
import yk.r;
import yk.u;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class k implements ComponentCallbacks2, yk.l, h<j<Drawable>> {
    private static final bl.g DECODE_TYPE_BITMAP = bl.g.decodeTypeOf(Bitmap.class).lock();
    private static final bl.g DECODE_TYPE_GIF = bl.g.decodeTypeOf(wk.c.class).lock();
    private static final bl.g DOWNLOAD_ONLY_OPTIONS = bl.g.diskCacheStrategyOf(kk.j.f66723c).priority(Priority.LOW).skipMemoryCache(true);
    private final Runnable addSelfToLifecycle;
    private boolean clearOnStop;
    private final yk.b connectivityMonitor;
    protected final Context context;
    private final CopyOnWriteArrayList<bl.f<Object>> defaultRequestListeners;
    protected final com.bumptech.glide.c glide;
    final yk.j lifecycle;
    private boolean pauseAllRequestsOnTrimMemoryModerate;

    @GuardedBy("this")
    private bl.g requestOptions;

    @GuardedBy("this")
    private final r requestTracker;

    @GuardedBy("this")
    private final u targetTracker;

    @GuardedBy("this")
    private final q treeNode;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            k kVar = k.this;
            kVar.lifecycle.b(kVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements b.a {

        /* renamed from: a, reason: collision with root package name */
        @GuardedBy("RequestManager.this")
        public final r f28709a;

        public c(@NonNull r rVar) {
            this.f28709a = rVar;
        }

        @Override // yk.b.a
        public void a(boolean z11) {
            if (z11) {
                synchronized (k.this) {
                    this.f28709a.g();
                }
            }
        }
    }

    public k(@NonNull com.bumptech.glide.c cVar, @NonNull yk.j jVar, @NonNull q qVar, @NonNull Context context) {
        this(cVar, jVar, qVar, new r(), cVar.i(), context);
    }

    public final synchronized void a() {
        try {
            Iterator<p<?>> it = this.targetTracker.b().iterator();
            while (it.hasNext()) {
                clear(it.next());
            }
            this.targetTracker.a();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public k addDefaultRequestListener(bl.f<Object> fVar) {
        this.defaultRequestListeners.add(fVar);
        return this;
    }

    @NonNull
    public synchronized k applyDefaultRequestOptions(@NonNull bl.g gVar) {
        c(gVar);
        return this;
    }

    @NonNull
    @CheckResult
    public <ResourceType> j<ResourceType> as(@NonNull Class<ResourceType> cls) {
        return new j<>(this.glide, this, cls, this.context);
    }

    @NonNull
    @CheckResult
    public j<Bitmap> asBitmap() {
        return as(Bitmap.class).apply((bl.a<?>) DECODE_TYPE_BITMAP);
    }

    @NonNull
    @CheckResult
    public j<Drawable> asDrawable() {
        return as(Drawable.class);
    }

    @NonNull
    @CheckResult
    public j<File> asFile() {
        return as(File.class).apply((bl.a<?>) bl.g.skipMemoryCacheOf(true));
    }

    @NonNull
    @CheckResult
    public j<wk.c> asGif() {
        return as(wk.c.class).apply((bl.a<?>) DECODE_TYPE_GIF);
    }

    public final void b(@NonNull p<?> pVar) {
        boolean untrack = untrack(pVar);
        bl.d f11 = pVar.f();
        if (untrack || this.glide.x(pVar) || f11 == null) {
            return;
        }
        pVar.k(null);
        f11.clear();
    }

    public final synchronized void c(@NonNull bl.g gVar) {
        this.requestOptions = this.requestOptions.apply(gVar);
    }

    public void clear(@NonNull View view) {
        clear(new b(view));
    }

    @NonNull
    public synchronized k clearOnStop() {
        this.clearOnStop = true;
        return this;
    }

    @NonNull
    @CheckResult
    public j<File> download(@Nullable Object obj) {
        return downloadOnly().load(obj);
    }

    @NonNull
    @CheckResult
    public j<File> downloadOnly() {
        return as(File.class).apply((bl.a<?>) DOWNLOAD_ONLY_OPTIONS);
    }

    public List<bl.f<Object>> getDefaultRequestListeners() {
        return this.defaultRequestListeners;
    }

    public synchronized bl.g getDefaultRequestOptions() {
        return this.requestOptions;
    }

    @NonNull
    public <T> l<?, T> getDefaultTransitionOptions(Class<T> cls) {
        return this.glide.k().e(cls);
    }

    public synchronized boolean isPaused() {
        return this.requestTracker.d();
    }

    @Override // yk.l
    public synchronized void onDestroy() {
        this.targetTracker.onDestroy();
        a();
        this.requestTracker.c();
        this.lifecycle.a(this);
        this.lifecycle.a(this.connectivityMonitor);
        o.A(this.addSelfToLifecycle);
        this.glide.C(this);
    }

    @Override // yk.l
    public synchronized void onStart() {
        resumeRequests();
        this.targetTracker.onStart();
    }

    @Override // yk.l
    public synchronized void onStop() {
        try {
            this.targetTracker.onStop();
            if (this.clearOnStop) {
                a();
            } else {
                pauseRequests();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i11) {
        if (i11 == 60 && this.pauseAllRequestsOnTrimMemoryModerate) {
            pauseAllRequestsRecursive();
        }
    }

    public synchronized void pauseAllRequests() {
        this.requestTracker.e();
    }

    public synchronized void pauseAllRequestsRecursive() {
        pauseAllRequests();
        Iterator<k> it = this.treeNode.b().iterator();
        while (it.hasNext()) {
            it.next().pauseAllRequests();
        }
    }

    public synchronized void pauseRequests() {
        this.requestTracker.f();
    }

    public synchronized void pauseRequestsRecursive() {
        pauseRequests();
        Iterator<k> it = this.treeNode.b().iterator();
        while (it.hasNext()) {
            it.next().pauseRequests();
        }
    }

    public synchronized void resumeRequests() {
        this.requestTracker.h();
    }

    public synchronized void resumeRequestsRecursive() {
        o.b();
        resumeRequests();
        Iterator<k> it = this.treeNode.b().iterator();
        while (it.hasNext()) {
            it.next().resumeRequests();
        }
    }

    @NonNull
    public synchronized k setDefaultRequestOptions(@NonNull bl.g gVar) {
        setRequestOptions(gVar);
        return this;
    }

    public void setPauseAllRequestsOnTrimMemoryModerate(boolean z11) {
        this.pauseAllRequestsOnTrimMemoryModerate = z11;
    }

    public synchronized void setRequestOptions(@NonNull bl.g gVar) {
        this.requestOptions = gVar.mo5628clone().autoClone();
    }

    public synchronized String toString() {
        return super.toString() + "{tracker=" + this.requestTracker + ", treeNode=" + this.treeNode + com.alipay.sdk.m.u.i.f11099d;
    }

    public synchronized void track(@NonNull p<?> pVar, @NonNull bl.d dVar) {
        this.targetTracker.c(pVar);
        this.requestTracker.i(dVar);
    }

    public synchronized boolean untrack(@NonNull p<?> pVar) {
        bl.d f11 = pVar.f();
        if (f11 == null) {
            return true;
        }
        if (!this.requestTracker.b(f11)) {
            return false;
        }
        this.targetTracker.d(pVar);
        pVar.k(null);
        return true;
    }

    public void clear(@Nullable p<?> pVar) {
        if (pVar == null) {
            return;
        }
        b(pVar);
    }

    public k(com.bumptech.glide.c cVar, yk.j jVar, q qVar, r rVar, yk.c cVar2, Context context) {
        this.targetTracker = new u();
        a aVar = new a();
        this.addSelfToLifecycle = aVar;
        this.glide = cVar;
        this.lifecycle = jVar;
        this.treeNode = qVar;
        this.requestTracker = rVar;
        this.context = context;
        yk.b a11 = cVar2.a(context.getApplicationContext(), new c(rVar));
        this.connectivityMonitor = a11;
        cVar.w(this);
        if (o.u()) {
            o.z(aVar);
        } else {
            jVar.b(this);
        }
        jVar.b(a11);
        this.defaultRequestListeners = new CopyOnWriteArrayList<>(cVar.k().c());
        setRequestOptions(cVar.k().d());
    }

    @Override // com.bumptech.glide.h
    @NonNull
    @CheckResult
    public j<Drawable> load(@Nullable Bitmap bitmap) {
        return asDrawable().load(bitmap);
    }

    @Override // com.bumptech.glide.h
    @NonNull
    @CheckResult
    public j<Drawable> load(@Nullable Drawable drawable) {
        return asDrawable().load(drawable);
    }

    @Override // com.bumptech.glide.h
    @NonNull
    @CheckResult
    public j<Drawable> load(@Nullable String str) {
        return asDrawable().load(str);
    }

    @Override // com.bumptech.glide.h
    @NonNull
    @CheckResult
    public j<Drawable> load(@Nullable Uri uri) {
        return asDrawable().load(uri);
    }

    @Override // com.bumptech.glide.h
    @NonNull
    @CheckResult
    public j<Drawable> load(@Nullable File file) {
        return asDrawable().load(file);
    }

    @Override // com.bumptech.glide.h
    @NonNull
    @CheckResult
    public j<Drawable> load(@Nullable @DrawableRes @RawRes Integer num) {
        return asDrawable().load(num);
    }

    @Override // com.bumptech.glide.h
    @CheckResult
    @Deprecated
    public j<Drawable> load(@Nullable URL url) {
        return asDrawable().load(url);
    }

    @Override // com.bumptech.glide.h
    @NonNull
    @CheckResult
    public j<Drawable> load(@Nullable byte[] bArr) {
        return asDrawable().load(bArr);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    @Override // com.bumptech.glide.h
    @NonNull
    @CheckResult
    public j<Drawable> load(@Nullable Object obj) {
        return asDrawable().load(obj);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b extends cl.f<View, Object> {
        public b(@NonNull View view) {
            super(view);
        }

        @Override // cl.p
        public void m(@Nullable Drawable drawable) {
        }

        @Override // cl.f
        public void n(@Nullable Drawable drawable) {
        }

        @Override // cl.p
        public void h(@NonNull Object obj, @Nullable dl.f<? super Object> fVar) {
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }
}

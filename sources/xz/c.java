package xz;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class c {

    /* renamed from: f, reason: collision with root package name */
    public static ExecutorService f98680f = Executors.newCachedThreadPool();

    /* renamed from: a, reason: collision with root package name */
    public Resources f98681a;

    /* renamed from: b, reason: collision with root package name */
    public WeakReference<Context> f98682b;

    /* renamed from: c, reason: collision with root package name */
    public xz.b f98683c;

    /* renamed from: d, reason: collision with root package name */
    public Bitmap f98684d;

    /* renamed from: e, reason: collision with root package name */
    public b f98685e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Runnable {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: xz.c$a$a, reason: collision with other inner class name */
        public class RunnableC1334a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ BitmapDrawable f98687a;

            public RunnableC1334a(BitmapDrawable bitmapDrawable) {
                this.f98687a = bitmapDrawable;
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.f98685e.a(this.f98687a);
            }
        }

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BitmapDrawable bitmapDrawable = new BitmapDrawable(c.this.f98681a, xz.a.a((Context) c.this.f98682b.get(), c.this.f98684d, c.this.f98683c));
            if (c.this.f98685e != null) {
                new Handler(Looper.getMainLooper()).post(new RunnableC1334a(bitmapDrawable));
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface b {
        void a(BitmapDrawable bitmapDrawable);
    }

    public c(View view, xz.b bVar, b bVar2) {
        this.f98681a = view.getResources();
        this.f98683c = bVar;
        this.f98685e = bVar2;
        this.f98682b = new WeakReference<>(view.getContext());
        view.setDrawingCacheEnabled(true);
        view.destroyDrawingCache();
        view.setDrawingCacheQuality(524288);
        this.f98684d = view.getDrawingCache();
    }

    public void f() {
        f98680f.execute(new a());
    }

    public c(Context context, Bitmap bitmap, xz.b bVar, b bVar2) {
        this.f98681a = context.getResources();
        this.f98683c = bVar;
        this.f98685e = bVar2;
        this.f98682b = new WeakReference<>(context);
        this.f98684d = bitmap;
    }
}

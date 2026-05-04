package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.squareup.picasso.Picasso;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public abstract class a<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Picasso f41757a;

    /* renamed from: b, reason: collision with root package name */
    public final y f41758b;

    /* renamed from: c, reason: collision with root package name */
    public final WeakReference<T> f41759c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f41760d;

    /* renamed from: e, reason: collision with root package name */
    public final int f41761e;

    /* renamed from: f, reason: collision with root package name */
    public final int f41762f;

    /* renamed from: g, reason: collision with root package name */
    public final int f41763g;

    /* renamed from: h, reason: collision with root package name */
    public final Drawable f41764h;

    /* renamed from: i, reason: collision with root package name */
    public final String f41765i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f41766j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f41767k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f41768l;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.squareup.picasso.a$a, reason: collision with other inner class name */
    public static class C0499a<M> extends WeakReference<M> {

        /* renamed from: a, reason: collision with root package name */
        public final a f41769a;

        public C0499a(a aVar, M m11, ReferenceQueue<? super M> referenceQueue) {
            super(m11, referenceQueue);
            this.f41769a = aVar;
        }
    }

    public a(Picasso picasso, T t11, y yVar, int i11, int i12, int i13, Drawable drawable, String str, Object obj, boolean z11) {
        this.f41757a = picasso;
        this.f41758b = yVar;
        this.f41759c = t11 == null ? null : new C0499a(this, t11, picasso.f41736k);
        this.f41761e = i11;
        this.f41762f = i12;
        this.f41760d = z11;
        this.f41763g = i13;
        this.f41764h = drawable;
        this.f41765i = str;
        this.f41766j = obj == null ? this : obj;
    }

    public void a() {
        this.f41768l = true;
    }

    public abstract void b(Bitmap bitmap, Picasso.LoadedFrom loadedFrom);

    public abstract void c(Exception exc);

    public String d() {
        return this.f41765i;
    }

    public int e() {
        return this.f41761e;
    }

    public int f() {
        return this.f41762f;
    }

    public Picasso g() {
        return this.f41757a;
    }

    public Picasso.Priority h() {
        return this.f41758b.f41994t;
    }

    public y i() {
        return this.f41758b;
    }

    public Object j() {
        return this.f41766j;
    }

    public T k() {
        WeakReference<T> weakReference = this.f41759c;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public boolean l() {
        return this.f41768l;
    }

    public boolean m() {
        return this.f41767k;
    }
}

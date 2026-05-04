package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import android.widget.ImageView;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import cl.r;
import com.bumptech.glide.c;
import fl.h;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class e extends ContextWrapper {

    /* renamed from: k, reason: collision with root package name */
    @VisibleForTesting
    public static final l<?, ?> f28675k = new b();

    /* renamed from: a, reason: collision with root package name */
    public final lk.b f28676a;

    /* renamed from: b, reason: collision with root package name */
    public final h.b<Registry> f28677b;

    /* renamed from: c, reason: collision with root package name */
    public final cl.k f28678c;

    /* renamed from: d, reason: collision with root package name */
    public final c.a f28679d;

    /* renamed from: e, reason: collision with root package name */
    public final List<bl.f<Object>> f28680e;

    /* renamed from: f, reason: collision with root package name */
    public final Map<Class<?>, l<?, ?>> f28681f;

    /* renamed from: g, reason: collision with root package name */
    public final kk.k f28682g;

    /* renamed from: h, reason: collision with root package name */
    public final f f28683h;

    /* renamed from: i, reason: collision with root package name */
    public final int f28684i;

    /* renamed from: j, reason: collision with root package name */
    @Nullable
    @GuardedBy("this")
    public bl.g f28685j;

    public e(@NonNull Context context, @NonNull lk.b bVar, @NonNull h.b<Registry> bVar2, @NonNull cl.k kVar, @NonNull c.a aVar, @NonNull Map<Class<?>, l<?, ?>> map, @NonNull List<bl.f<Object>> list, @NonNull kk.k kVar2, @NonNull f fVar, int i11) {
        super(context.getApplicationContext());
        this.f28676a = bVar;
        this.f28678c = kVar;
        this.f28679d = aVar;
        this.f28680e = list;
        this.f28681f = map;
        this.f28682g = kVar2;
        this.f28683h = fVar;
        this.f28684i = i11;
        this.f28677b = fl.h.a(bVar2);
    }

    @NonNull
    public <X> r<ImageView, X> a(@NonNull ImageView imageView, @NonNull Class<X> cls) {
        return this.f28678c.a(imageView, cls);
    }

    @NonNull
    public lk.b b() {
        return this.f28676a;
    }

    public List<bl.f<Object>> c() {
        return this.f28680e;
    }

    public synchronized bl.g d() {
        try {
            if (this.f28685j == null) {
                this.f28685j = this.f28679d.build().lock();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f28685j;
    }

    @NonNull
    public <T> l<?, T> e(@NonNull Class<T> cls) {
        l<?, T> lVar = (l) this.f28681f.get(cls);
        if (lVar == null) {
            for (Map.Entry<Class<?>, l<?, ?>> entry : this.f28681f.entrySet()) {
                if (entry.getKey().isAssignableFrom(cls)) {
                    lVar = (l) entry.getValue();
                }
            }
        }
        return lVar == null ? (l<?, T>) f28675k : lVar;
    }

    @NonNull
    public kk.k f() {
        return this.f28682g;
    }

    public f g() {
        return this.f28683h;
    }

    public int h() {
        return this.f28684i;
    }

    @NonNull
    public Registry i() {
        return this.f28677b.get();
    }
}

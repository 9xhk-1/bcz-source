package com.bumptech.glide;

import android.content.Context;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import com.bumptech.glide.c;
import com.bumptech.glide.f;
import fl.m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import mk.a;
import mk.l;
import yk.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    public kk.k f28656c;

    /* renamed from: d, reason: collision with root package name */
    public lk.e f28657d;

    /* renamed from: e, reason: collision with root package name */
    public lk.b f28658e;

    /* renamed from: f, reason: collision with root package name */
    public mk.j f28659f;

    /* renamed from: g, reason: collision with root package name */
    public nk.a f28660g;

    /* renamed from: h, reason: collision with root package name */
    public nk.a f28661h;

    /* renamed from: i, reason: collision with root package name */
    public a.InterfaceC0886a f28662i;

    /* renamed from: j, reason: collision with root package name */
    public mk.l f28663j;

    /* renamed from: k, reason: collision with root package name */
    public yk.c f28664k;

    /* renamed from: n, reason: collision with root package name */
    @Nullable
    public p.b f28667n;

    /* renamed from: o, reason: collision with root package name */
    public nk.a f28668o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f28669p;

    /* renamed from: q, reason: collision with root package name */
    @Nullable
    public List<bl.f<Object>> f28670q;

    /* renamed from: a, reason: collision with root package name */
    public final Map<Class<?>, l<?, ?>> f28654a = new ArrayMap();

    /* renamed from: b, reason: collision with root package name */
    public final f.a f28655b = new f.a();

    /* renamed from: l, reason: collision with root package name */
    public int f28665l = 4;

    /* renamed from: m, reason: collision with root package name */
    public c.a f28666m = new a();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements c.a {
        public a() {
        }

        @Override // com.bumptech.glide.c.a
        @NonNull
        public bl.g build() {
            return new bl.g();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements c.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ bl.g f28672a;

        public b(bl.g gVar) {
            this.f28672a = gVar;
        }

        @Override // com.bumptech.glide.c.a
        @NonNull
        public bl.g build() {
            bl.g gVar = this.f28672a;
            return gVar != null ? gVar : new bl.g();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements f.b {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.bumptech.glide.d$d, reason: collision with other inner class name */
    public static final class C0336d implements f.b {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class e implements f.b {

        /* renamed from: a, reason: collision with root package name */
        public final int f28674a;

        public e(int i11) {
            this.f28674a = i11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class f implements f.b {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class g implements f.b {
    }

    public d A(boolean z11) {
        this.f28655b.d(new g(), z11);
        return this;
    }

    @NonNull
    public d a(@NonNull bl.f<Object> fVar) {
        if (this.f28670q == null) {
            this.f28670q = new ArrayList();
        }
        this.f28670q.add(fVar);
        return this;
    }

    @NonNull
    public com.bumptech.glide.c b(@NonNull Context context, List<zk.c> list, zk.a aVar) {
        if (this.f28660g == null) {
            this.f28660g = nk.a.k();
        }
        if (this.f28661h == null) {
            this.f28661h = nk.a.g();
        }
        if (this.f28668o == null) {
            this.f28668o = nk.a.d();
        }
        if (this.f28663j == null) {
            this.f28663j = new l.a(context).a();
        }
        if (this.f28664k == null) {
            this.f28664k = new yk.e();
        }
        if (this.f28657d == null) {
            int b11 = this.f28663j.b();
            if (b11 > 0) {
                this.f28657d = new lk.k(b11);
            } else {
                this.f28657d = new lk.f();
            }
        }
        if (this.f28658e == null) {
            this.f28658e = new lk.j(this.f28663j.a());
        }
        if (this.f28659f == null) {
            this.f28659f = new mk.i(this.f28663j.d());
        }
        if (this.f28662i == null) {
            this.f28662i = new mk.h(context);
        }
        if (this.f28656c == null) {
            this.f28656c = new kk.k(this.f28659f, this.f28662i, this.f28661h, this.f28660g, nk.a.n(), this.f28668o, this.f28669p);
        }
        List<bl.f<Object>> list2 = this.f28670q;
        if (list2 == null) {
            this.f28670q = Collections.EMPTY_LIST;
        } else {
            this.f28670q = Collections.unmodifiableList(list2);
        }
        return new com.bumptech.glide.c(context, this.f28656c, this.f28659f, this.f28657d, this.f28658e, new p(this.f28667n), this.f28664k, this.f28665l, this.f28666m, this.f28654a, this.f28670q, list, aVar, this.f28655b.c());
    }

    @NonNull
    public d c(@Nullable nk.a aVar) {
        this.f28668o = aVar;
        return this;
    }

    @NonNull
    public d d(@Nullable lk.b bVar) {
        this.f28658e = bVar;
        return this;
    }

    @NonNull
    public d e(@Nullable lk.e eVar) {
        this.f28657d = eVar;
        return this;
    }

    @NonNull
    public d f(@Nullable yk.c cVar) {
        this.f28664k = cVar;
        return this;
    }

    @NonNull
    public d g(@Nullable bl.g gVar) {
        return h(new b(gVar));
    }

    @NonNull
    public d h(@NonNull c.a aVar) {
        this.f28666m = (c.a) m.e(aVar);
        return this;
    }

    @NonNull
    public <T> d i(@NonNull Class<T> cls, @Nullable l<?, T> lVar) {
        this.f28654a.put(cls, lVar);
        return this;
    }

    @NonNull
    public d k(@Nullable a.InterfaceC0886a interfaceC0886a) {
        this.f28662i = interfaceC0886a;
        return this;
    }

    @NonNull
    public d l(@Nullable nk.a aVar) {
        this.f28661h = aVar;
        return this;
    }

    public d n(kk.k kVar) {
        this.f28656c = kVar;
        return this;
    }

    public d o(boolean z11) {
        this.f28655b.d(new c(), z11 && Build.VERSION.SDK_INT >= 29);
        return this;
    }

    @NonNull
    public d p(boolean z11) {
        this.f28669p = z11;
        return this;
    }

    @NonNull
    public d q(int i11) {
        if (i11 < 2 || i11 > 6) {
            throw new IllegalArgumentException("Log level must be one of Log.VERBOSE, Log.DEBUG, Log.INFO, Log.WARN, or Log.ERROR");
        }
        this.f28665l = i11;
        return this;
    }

    public d r(boolean z11) {
        this.f28655b.d(new C0336d(), z11);
        return this;
    }

    @NonNull
    public d s(@Nullable mk.j jVar) {
        this.f28659f = jVar;
        return this;
    }

    @NonNull
    public d t(@NonNull l.a aVar) {
        return u(aVar.a());
    }

    @NonNull
    public d u(@Nullable mk.l lVar) {
        this.f28663j = lVar;
        return this;
    }

    public d v(boolean z11) {
        this.f28655b.d(new f(), z11);
        return this;
    }

    public void x(@Nullable p.b bVar) {
        this.f28667n = bVar;
    }

    @Deprecated
    public d y(@Nullable nk.a aVar) {
        return z(aVar);
    }

    @NonNull
    public d z(@Nullable nk.a aVar) {
        this.f28660g = aVar;
        return this;
    }

    @Deprecated
    public d j(boolean z11) {
        return this;
    }

    @Deprecated
    public d m(boolean z11) {
        return this;
    }

    @Deprecated
    public d w(boolean z11) {
        return this;
    }
}

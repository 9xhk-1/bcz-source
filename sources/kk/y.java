package kk;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.d;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import kk.f;
import pk.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class y implements f, f.a {

    /* renamed from: h, reason: collision with root package name */
    public static final String f66836h = "SourceGenerator";

    /* renamed from: a, reason: collision with root package name */
    public final g<?> f66837a;

    /* renamed from: b, reason: collision with root package name */
    public final f.a f66838b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f66839c;

    /* renamed from: d, reason: collision with root package name */
    public volatile c f66840d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f66841e;

    /* renamed from: f, reason: collision with root package name */
    public volatile o.a<?> f66842f;

    /* renamed from: g, reason: collision with root package name */
    public volatile d f66843g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements d.a<Object> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ o.a f66844a;

        public a(o.a aVar) {
            this.f66844a = aVar;
        }

        @Override // com.bumptech.glide.load.data.d.a
        public void b(@Nullable Object obj) {
            if (y.this.g(this.f66844a)) {
                y.this.h(this.f66844a, obj);
            }
        }

        @Override // com.bumptech.glide.load.data.d.a
        public void c(@NonNull Exception exc) {
            if (y.this.g(this.f66844a)) {
                y.this.i(this.f66844a, exc);
            }
        }
    }

    public y(g<?> gVar, f.a aVar) {
        this.f66837a = gVar;
        this.f66838b = aVar;
    }

    @Override // kk.f
    public boolean a() {
        if (this.f66841e != null) {
            Object obj = this.f66841e;
            this.f66841e = null;
            try {
                if (!d(obj)) {
                    return true;
                }
            } catch (IOException e11) {
                if (Log.isLoggable(f66836h, 3)) {
                    Log.d(f66836h, "Failed to properly rewind or write data to cache", e11);
                }
            }
        }
        if (this.f66840d != null && this.f66840d.a()) {
            return true;
        }
        this.f66840d = null;
        this.f66842f = null;
        boolean z11 = false;
        while (!z11 && f()) {
            List<o.a<?>> g11 = this.f66837a.g();
            int i11 = this.f66839c;
            this.f66839c = i11 + 1;
            this.f66842f = g11.get(i11);
            if (this.f66842f != null && (this.f66837a.e().c(this.f66842f.f80730c.getDataSource()) || this.f66837a.u(this.f66842f.f80730c.getDataClass()))) {
                j(this.f66842f);
                z11 = true;
            }
        }
        return z11;
    }

    @Override // kk.f.a
    public void b(ik.b bVar, Object obj, com.bumptech.glide.load.data.d<?> dVar, DataSource dataSource, ik.b bVar2) {
        this.f66838b.b(bVar, obj, dVar, this.f66842f.f80730c.getDataSource(), bVar);
    }

    @Override // kk.f.a
    public void c(ik.b bVar, Exception exc, com.bumptech.glide.load.data.d<?> dVar, DataSource dataSource) {
        this.f66838b.c(bVar, exc, dVar, this.f66842f.f80730c.getDataSource());
    }

    @Override // kk.f
    public void cancel() {
        o.a<?> aVar = this.f66842f;
        if (aVar != null) {
            aVar.f80730c.cancel();
        }
    }

    public final boolean d(Object obj) throws IOException {
        Throwable th2;
        long b11 = fl.i.b();
        boolean z11 = false;
        try {
            com.bumptech.glide.load.data.e<T> o11 = this.f66837a.o(obj);
            Object a11 = o11.a();
            ik.a<X> q11 = this.f66837a.q(a11);
            e eVar = new e(q11, a11, this.f66837a.k());
            d dVar = new d(this.f66842f.f80728a, this.f66837a.p());
            mk.a d11 = this.f66837a.d();
            d11.a(dVar, eVar);
            if (Log.isLoggable(f66836h, 2)) {
                Log.v(f66836h, "Finished encoding source to cache, key: " + dVar + ", data: " + obj + ", encoder: " + q11 + ", duration: " + fl.i.a(b11));
            }
            if (d11.b(dVar) != null) {
                this.f66843g = dVar;
                this.f66840d = new c(Collections.singletonList(this.f66842f.f80728a), this.f66837a, this);
                this.f66842f.f80730c.cleanup();
                return true;
            }
            if (Log.isLoggable(f66836h, 3)) {
                Log.d(f66836h, "Attempt to write: " + this.f66843g + ", data: " + obj + " to the disk cache failed, maybe the disk cache is disabled? Trying to decode the data directly...");
            }
            try {
                this.f66838b.b(this.f66842f.f80728a, o11.a(), this.f66842f.f80730c, this.f66842f.f80730c.getDataSource(), this.f66842f.f80728a);
                return false;
            } catch (Throwable th3) {
                th2 = th3;
                z11 = true;
                if (z11) {
                    throw th2;
                }
                this.f66842f.f80730c.cleanup();
                throw th2;
            }
        } catch (Throwable th4) {
            th2 = th4;
        }
    }

    @Override // kk.f.a
    public void e() {
        throw new UnsupportedOperationException();
    }

    public final boolean f() {
        return this.f66839c < this.f66837a.g().size();
    }

    public boolean g(o.a<?> aVar) {
        o.a<?> aVar2 = this.f66842f;
        return aVar2 != null && aVar2 == aVar;
    }

    public void h(o.a<?> aVar, Object obj) {
        j e11 = this.f66837a.e();
        if (obj != null && e11.c(aVar.f80730c.getDataSource())) {
            this.f66841e = obj;
            this.f66838b.e();
        } else {
            f.a aVar2 = this.f66838b;
            ik.b bVar = aVar.f80728a;
            com.bumptech.glide.load.data.d<?> dVar = aVar.f80730c;
            aVar2.b(bVar, obj, dVar, dVar.getDataSource(), this.f66843g);
        }
    }

    public void i(o.a<?> aVar, @NonNull Exception exc) {
        f.a aVar2 = this.f66838b;
        d dVar = this.f66843g;
        com.bumptech.glide.load.data.d<?> dVar2 = aVar.f80730c;
        aVar2.c(dVar, exc, dVar2, dVar2.getDataSource());
    }

    public final void j(o.a<?> aVar) {
        this.f66842f.f80730c.loadData(this.f66837a.l(), new a(aVar));
    }
}

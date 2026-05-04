package ic;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import bl.g;
import cl.e;
import cl.p;
import com.bumptech.glide.R;
import com.bumptech.glide.j;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import dl.f;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import x00.l;
import yz.c0;
import yz.e0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@SuppressLint({"CheckResult"})
/* loaded from: classes4.dex */
public final class b<T> implements ic.c {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f60476c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    public static final String f60477d = b.class.getSimpleName();

    /* renamed from: a, reason: collision with root package name */
    @k
    public final j<T> f60478a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final c0 f60479b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: ic.b$b, reason: collision with other inner class name */
    public static final class C0698b extends e<T> {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ l<Bitmap, g2> f60480d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ ImageView f60481e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ x00.a<g2> f60482f;

        /* JADX WARN: Multi-variable type inference failed */
        public C0698b(l<? super Bitmap, g2> lVar, ImageView imageView, x00.a<g2> aVar) {
            this.f60480d = lVar;
            this.f60481e = imageView;
            this.f60482f = aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // cl.p
        public void h(T resource, f<? super T> fVar) {
            g0.p(resource, "resource");
            if (!(resource instanceof Bitmap)) {
                throw new RuntimeException("Type should be a bitmap!");
            }
            this.f60480d.invoke(resource);
            ImageView imageView = this.f60481e;
            if (imageView != null) {
                imageView.setImageBitmap((Bitmap) resource);
            }
        }

        @Override // cl.p
        public void i(Drawable drawable) {
            qb.c.b(b.f60477d, "onLoadCleared", new Object[0]);
        }

        @Override // cl.e, cl.p
        public void m(Drawable drawable) {
            x00.a<g2> aVar = this.f60482f;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements bl.f<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ hc.d f60483a;

        public c(hc.d dVar) {
            this.f60483a = dVar;
        }

        @Override // bl.f
        public boolean a(GlideException glideException, Object obj, p<T> target, boolean z11) {
            g2 g2Var;
            g0.p(target, "target");
            String str = b.f60477d;
            if (glideException != null) {
                glideException.logRootCauses("onLoadFailed");
                g2Var = g2.f100423a;
            } else {
                g2Var = null;
            }
            qb.c.d(str, "into: " + glideException + "\n" + g2Var, new Object[0]);
            hc.d dVar = this.f60483a;
            if (dVar != null) {
                dVar.a(glideException);
            }
            return false;
        }

        @Override // bl.f
        public boolean b(T resource, Object model, p<T> pVar, DataSource dataSource, boolean z11) {
            g0.p(resource, "resource");
            g0.p(model, "model");
            g0.p(dataSource, "dataSource");
            hc.d dVar = this.f60483a;
            if (dVar == null) {
                return false;
            }
            dVar.onSuccess();
            return false;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d implements bl.f<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ hc.d f60484a;

        public d(hc.d dVar) {
            this.f60484a = dVar;
        }

        @Override // bl.f
        public boolean a(GlideException glideException, Object obj, p<T> target, boolean z11) {
            g2 g2Var;
            g0.p(target, "target");
            String str = b.f60477d;
            if (glideException != null) {
                glideException.logRootCauses("onLoadFailed");
                g2Var = g2.f100423a;
            } else {
                g2Var = null;
            }
            qb.c.d(str, "preload: " + glideException + "\n" + g2Var, new Object[0]);
            hc.d dVar = this.f60484a;
            if (dVar != null) {
                dVar.a(glideException);
            }
            return false;
        }

        @Override // bl.f
        public boolean b(T resource, Object model, p<T> pVar, DataSource dataSource, boolean z11) {
            g0.p(resource, "resource");
            g0.p(model, "model");
            g0.p(dataSource, "dataSource");
            hc.d dVar = this.f60484a;
            if (dVar == null) {
                return false;
            }
            dVar.onSuccess();
            return false;
        }
    }

    public b(@k j<T> requestBuilder) {
        g0.p(requestBuilder, "requestBuilder");
        this.f60478a = requestBuilder;
        this.f60479b = e0.c(new x00.a() { // from class: ic.a
            @Override // x00.a
            public final Object invoke() {
                g s11;
                s11 = b.s();
                return s11;
            }
        });
    }

    public static final g s() {
        return new g();
    }

    @Override // ic.c
    public void a(@k l<? super Bitmap, g2> result, @m80.l x00.a<g2> aVar, @m80.l ImageView imageView) {
        g0.p(result, "result");
        this.f60478a.apply((bl.a<?>) r()).into((j<T>) new C0698b(result, imageView, aVar));
    }

    @Override // ic.c
    public void b(@k ImageView v11, @m80.l hc.d dVar, boolean z11) {
        g0.p(v11, "v");
        if (!z11) {
            v11.setTag(R.id.glide_custom_view_target_tag, null);
        }
        this.f60478a.apply((bl.a<?>) r()).listener(new c(dVar)).into(v11);
    }

    @Override // ic.c
    public void c(int i11, int i12, @m80.l hc.d dVar) {
        j<T> listener = this.f60478a.apply((bl.a<?>) r()).listener(new d(dVar));
        if (i11 <= 0 || i12 <= 0) {
            listener.preload();
        } else {
            listener.preload(i11, i12);
        }
    }

    @Override // ic.c
    @k
    public ic.c f(int i11) {
        r().error(i11);
        return this;
    }

    @Override // ic.c
    public void g(@k ImageView v11, @m80.l hc.d dVar) {
        g0.p(v11, "v");
        b(v11, dVar, true);
    }

    @Override // ic.c
    @k
    public Bitmap get() {
        T t11 = this.f60478a.apply((bl.a<?>) r()).submit().get();
        if (t11 instanceof Bitmap) {
            return (Bitmap) t11;
        }
        throw new RuntimeException("Type should be a bitmap!");
    }

    @Override // ic.c
    @k
    public ic.c h() {
        r().diskCacheStrategy(kk.j.f66722b);
        r().skipMemoryCache(true);
        return this;
    }

    @Override // ic.c
    @k
    public ic.c i(@k Drawable drawable) {
        g0.p(drawable, "drawable");
        r().placeholder(drawable);
        return this;
    }

    @Override // ic.c
    @k
    public ic.c j(int i11) {
        r().placeholder(i11);
        return this;
    }

    @Override // ic.c
    @k
    public ic.c k(@k Drawable drawable) {
        g0.p(drawable, "drawable");
        r().error(drawable);
        return this;
    }

    @Override // ic.c
    public void l(@k l<? super Bitmap, g2> result, @m80.l x00.a<g2> aVar) {
        g0.p(result, "result");
        a(result, aVar, null);
    }

    @Override // ic.c
    @k
    public ic.c m(int i11) {
        r().timeout(i11);
        return this;
    }

    @Override // ic.c
    @k
    public ic.c n(int i11, int i12) {
        r().override(i11, i12);
        return this;
    }

    @Override // ic.c
    public void o(@k ImageView v11) {
        g0.p(v11, "v");
        g(v11, null);
    }

    public final g r() {
        return (g) this.f60479b.getValue();
    }
}

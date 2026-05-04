package ic;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.squareup.picasso.MemoryPolicy;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.e0;
import com.squareup.picasso.f;
import com.squareup.picasso.z;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class d implements ic.c {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f60485c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    public static final String f60486d = ic.c.class.getSimpleName();

    /* renamed from: a, reason: collision with root package name */
    @k
    public final z f60487a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f60488b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements f {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ hc.d f60492a;

        public c(hc.d dVar) {
            this.f60492a = dVar;
        }

        @Override // com.squareup.picasso.f
        public void onError(Exception exc) {
            qb.c.d(d.f60486d, "into: " + exc, new Object[0]);
            hc.d dVar = this.f60492a;
            if (dVar != null) {
                dVar.a(exc);
            }
        }

        @Override // com.squareup.picasso.f
        public void onSuccess() {
            hc.d dVar = this.f60492a;
            if (dVar != null) {
                dVar.onSuccess();
            }
        }
    }

    public d(@k z requestCreator, boolean z11) {
        g0.p(requestCreator, "requestCreator");
        this.f60487a = requestCreator;
        this.f60488b = z11;
    }

    @Override // ic.c
    public void a(@k l<? super Bitmap, g2> result, @m80.l x00.a<g2> aVar, @m80.l ImageView imageView) {
        g0.p(result, "result");
        if (!this.f60488b) {
            throw new RuntimeException("Type should be a bitmap!");
        }
        this.f60487a.v(new b(aVar, result, imageView));
    }

    @Override // ic.c
    public void b(@k ImageView v11, @m80.l hc.d dVar, boolean z11) {
        g0.p(v11, "v");
        this.f60487a.p(v11, new c(dVar));
    }

    @Override // ic.c
    public /* bridge */ void c(int i11, int i12, @m80.l hc.d dVar) {
        super.c(i11, i12, dVar);
    }

    @Override // ic.c
    @k
    public ic.c f(int i11) {
        this.f60487a.g(i11);
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
        Bitmap l11 = this.f60487a.l();
        g0.o(l11, "get(...)");
        return l11;
    }

    @Override // ic.c
    @k
    public ic.c h() {
        this.f60487a.w(MemoryPolicy.NO_CACHE, new MemoryPolicy[0]);
        return this;
    }

    @Override // ic.c
    @k
    public ic.c i(@k Drawable drawable) {
        g0.p(drawable, "drawable");
        this.f60487a.D(drawable);
        return this;
    }

    @Override // ic.c
    @k
    public ic.c j(int i11) {
        this.f60487a.C(i11);
        return this;
    }

    @Override // ic.c
    @k
    public ic.c k(@k Drawable drawable) {
        g0.p(drawable, "drawable");
        this.f60487a.h(drawable);
        return this;
    }

    @Override // ic.c
    public void l(@k l<? super Bitmap, g2> result, @m80.l x00.a<g2> aVar) {
        g0.p(result, "result");
        a(result, aVar, null);
    }

    @Override // ic.c
    @k
    public ic.c n(int i11, int i12) {
        this.f60487a.G(i11, i12);
        return this;
    }

    @Override // ic.c
    public void o(@k ImageView v11) {
        g0.p(v11, "v");
        g(v11, null);
    }

    public /* synthetic */ d(z zVar, boolean z11, int i11, v vVar) {
        this(zVar, (i11 & 2) != 0 ? false : z11);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b implements e0 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x00.a<g2> f60489a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l<Bitmap, g2> f60490b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ImageView f60491c;

        /* JADX WARN: Multi-variable type inference failed */
        public b(x00.a<g2> aVar, l<? super Bitmap, g2> lVar, ImageView imageView) {
            this.f60489a = aVar;
            this.f60490b = lVar;
            this.f60491c = imageView;
        }

        @Override // com.squareup.picasso.e0
        public void onBitmapFailed(Exception exc, Drawable drawable) {
            qb.c.d(d.f60486d, "into target: " + exc, new Object[0]);
            x00.a<g2> aVar = this.f60489a;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        @Override // com.squareup.picasso.e0
        public void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
            if (bitmap != null) {
                this.f60490b.invoke(bitmap);
            }
            ImageView imageView = this.f60491c;
            if (imageView != null) {
                imageView.setImageBitmap(bitmap);
            }
        }

        @Override // com.squareup.picasso.e0
        public void onPrepareLoad(Drawable drawable) {
        }
    }

    @Override // ic.c
    @k
    public ic.c m(int i11) {
        return this;
    }
}

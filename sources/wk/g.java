package wk;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.k;
import fl.m;
import fl.o;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public final hk.a f96442a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f96443b;

    /* renamed from: c, reason: collision with root package name */
    public final List<b> f96444c;

    /* renamed from: d, reason: collision with root package name */
    public final k f96445d;

    /* renamed from: e, reason: collision with root package name */
    public final lk.e f96446e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f96447f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f96448g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f96449h;

    /* renamed from: i, reason: collision with root package name */
    public com.bumptech.glide.j<Bitmap> f96450i;

    /* renamed from: j, reason: collision with root package name */
    public a f96451j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f96452k;

    /* renamed from: l, reason: collision with root package name */
    public a f96453l;

    /* renamed from: m, reason: collision with root package name */
    public Bitmap f96454m;

    /* renamed from: n, reason: collision with root package name */
    public ik.h<Bitmap> f96455n;

    /* renamed from: o, reason: collision with root package name */
    public a f96456o;

    /* renamed from: p, reason: collision with root package name */
    @Nullable
    public d f96457p;

    /* renamed from: q, reason: collision with root package name */
    public int f96458q;

    /* renamed from: r, reason: collision with root package name */
    public int f96459r;

    /* renamed from: s, reason: collision with root package name */
    public int f96460s;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @VisibleForTesting
    public static class a extends cl.e<Bitmap> {

        /* renamed from: d, reason: collision with root package name */
        public final Handler f96461d;

        /* renamed from: e, reason: collision with root package name */
        public final int f96462e;

        /* renamed from: f, reason: collision with root package name */
        public final long f96463f;

        /* renamed from: g, reason: collision with root package name */
        public Bitmap f96464g;

        public a(Handler handler, int i11, long j11) {
            this.f96461d = handler;
            this.f96462e = i11;
            this.f96463f = j11;
        }

        public Bitmap a() {
            return this.f96464g;
        }

        @Override // cl.p
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void h(@NonNull Bitmap bitmap, @Nullable dl.f<? super Bitmap> fVar) {
            this.f96464g = bitmap;
            this.f96461d.sendMessageAtTime(this.f96461d.obtainMessage(1, this), this.f96463f);
        }

        @Override // cl.p
        public void i(@Nullable Drawable drawable) {
            this.f96464g = null;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface b {
        void a();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements Handler.Callback {

        /* renamed from: b, reason: collision with root package name */
        public static final int f96465b = 1;

        /* renamed from: c, reason: collision with root package name */
        public static final int f96466c = 2;

        public c() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i11 = message.what;
            if (i11 == 1) {
                g.this.o((a) message.obj);
                return true;
            }
            if (i11 != 2) {
                return false;
            }
            g.this.f96445d.clear((a) message.obj);
            return false;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @VisibleForTesting
    public interface d {
        void a();
    }

    public g(com.bumptech.glide.c cVar, hk.a aVar, int i11, int i12, ik.h<Bitmap> hVar, Bitmap bitmap) {
        this(cVar.h(), com.bumptech.glide.c.F(cVar.j()), aVar, null, k(com.bumptech.glide.c.F(cVar.j()), i11, i12), hVar, bitmap);
    }

    public static ik.b g() {
        return new el.e(Double.valueOf(Math.random()));
    }

    public static com.bumptech.glide.j<Bitmap> k(k kVar, int i11, int i12) {
        return kVar.asBitmap().apply((bl.a<?>) bl.g.diskCacheStrategyOf(kk.j.f66722b).useAnimationPool(true).skipMemoryCache(true).override(i11, i12));
    }

    public void a() {
        this.f96444c.clear();
        p();
        u();
        a aVar = this.f96451j;
        if (aVar != null) {
            this.f96445d.clear(aVar);
            this.f96451j = null;
        }
        a aVar2 = this.f96453l;
        if (aVar2 != null) {
            this.f96445d.clear(aVar2);
            this.f96453l = null;
        }
        a aVar3 = this.f96456o;
        if (aVar3 != null) {
            this.f96445d.clear(aVar3);
            this.f96456o = null;
        }
        this.f96442a.clear();
        this.f96452k = true;
    }

    public ByteBuffer b() {
        return this.f96442a.getData().asReadOnlyBuffer();
    }

    public Bitmap c() {
        a aVar = this.f96451j;
        return aVar != null ? aVar.a() : this.f96454m;
    }

    public int d() {
        a aVar = this.f96451j;
        if (aVar != null) {
            return aVar.f96462e;
        }
        return -1;
    }

    public Bitmap e() {
        return this.f96454m;
    }

    public int f() {
        return this.f96442a.k();
    }

    public ik.h<Bitmap> h() {
        return this.f96455n;
    }

    public int i() {
        return this.f96460s;
    }

    public int j() {
        return this.f96442a.n();
    }

    public int l() {
        return this.f96442a.h() + this.f96458q;
    }

    public int m() {
        return this.f96459r;
    }

    public final void n() {
        if (!this.f96447f || this.f96448g) {
            return;
        }
        if (this.f96449h) {
            m.b(this.f96456o == null, "Pending target must be null when starting from the first frame");
            this.f96442a.e();
            this.f96449h = false;
        }
        a aVar = this.f96456o;
        if (aVar != null) {
            this.f96456o = null;
            o(aVar);
            return;
        }
        this.f96448g = true;
        long uptimeMillis = SystemClock.uptimeMillis() + this.f96442a.o();
        this.f96442a.j();
        this.f96453l = new a(this.f96443b, this.f96442a.f(), uptimeMillis);
        this.f96450i.apply((bl.a<?>) bl.g.signatureOf(g())).load((Object) this.f96442a).into((com.bumptech.glide.j<Bitmap>) this.f96453l);
    }

    @VisibleForTesting
    public void o(a aVar) {
        d dVar = this.f96457p;
        if (dVar != null) {
            dVar.a();
        }
        this.f96448g = false;
        if (this.f96452k) {
            this.f96443b.obtainMessage(2, aVar).sendToTarget();
            return;
        }
        if (!this.f96447f) {
            if (this.f96449h) {
                this.f96443b.obtainMessage(2, aVar).sendToTarget();
                return;
            } else {
                this.f96456o = aVar;
                return;
            }
        }
        if (aVar.a() != null) {
            p();
            a aVar2 = this.f96451j;
            this.f96451j = aVar;
            for (int size = this.f96444c.size() - 1; size >= 0; size--) {
                this.f96444c.get(size).a();
            }
            if (aVar2 != null) {
                this.f96443b.obtainMessage(2, aVar2).sendToTarget();
            }
        }
        n();
    }

    public final void p() {
        Bitmap bitmap = this.f96454m;
        if (bitmap != null) {
            this.f96446e.e(bitmap);
            this.f96454m = null;
        }
    }

    public void q(ik.h<Bitmap> hVar, Bitmap bitmap) {
        this.f96455n = (ik.h) m.e(hVar);
        this.f96454m = (Bitmap) m.e(bitmap);
        this.f96450i = this.f96450i.apply((bl.a<?>) new bl.g().transform(hVar));
        this.f96458q = o.i(bitmap);
        this.f96459r = bitmap.getWidth();
        this.f96460s = bitmap.getHeight();
    }

    public void r() {
        m.b(!this.f96447f, "Can't restart a running animation");
        this.f96449h = true;
        a aVar = this.f96456o;
        if (aVar != null) {
            this.f96445d.clear(aVar);
            this.f96456o = null;
        }
    }

    @VisibleForTesting
    public void s(@Nullable d dVar) {
        this.f96457p = dVar;
    }

    public final void t() {
        if (this.f96447f) {
            return;
        }
        this.f96447f = true;
        this.f96452k = false;
        n();
    }

    public final void u() {
        this.f96447f = false;
    }

    public void v(b bVar) {
        if (this.f96452k) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
        if (this.f96444c.contains(bVar)) {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
        boolean isEmpty = this.f96444c.isEmpty();
        this.f96444c.add(bVar);
        if (isEmpty) {
            t();
        }
    }

    public void w(b bVar) {
        this.f96444c.remove(bVar);
        if (this.f96444c.isEmpty()) {
            u();
        }
    }

    public g(lk.e eVar, k kVar, hk.a aVar, Handler handler, com.bumptech.glide.j<Bitmap> jVar, ik.h<Bitmap> hVar, Bitmap bitmap) {
        this.f96444c = new ArrayList();
        this.f96445d = kVar;
        handler = handler == null ? new Handler(Looper.getMainLooper(), new c()) : handler;
        this.f96446e = eVar;
        this.f96443b = handler;
        this.f96450i = jVar;
        this.f96442a = aVar;
        q(hVar, bitmap);
    }
}

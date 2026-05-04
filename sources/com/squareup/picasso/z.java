package com.squareup.picasso;

import android.app.Notification;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import android.widget.RemoteViews;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.x;
import com.squareup.picasso.y;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class z {

    /* renamed from: m, reason: collision with root package name */
    public static final AtomicInteger f42012m = new AtomicInteger();

    /* renamed from: a, reason: collision with root package name */
    public final Picasso f42013a;

    /* renamed from: b, reason: collision with root package name */
    public final y.b f42014b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f42015c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f42016d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f42017e;

    /* renamed from: f, reason: collision with root package name */
    public int f42018f;

    /* renamed from: g, reason: collision with root package name */
    public int f42019g;

    /* renamed from: h, reason: collision with root package name */
    public int f42020h;

    /* renamed from: i, reason: collision with root package name */
    public int f42021i;

    /* renamed from: j, reason: collision with root package name */
    public Drawable f42022j;

    /* renamed from: k, reason: collision with root package name */
    public Drawable f42023k;

    /* renamed from: l, reason: collision with root package name */
    public Object f42024l;

    public z(Picasso picasso, Uri uri, int i11) {
        this.f42017e = true;
        if (picasso.f41740o) {
            throw new IllegalStateException("Picasso instance already shut down. Cannot submit new requests.");
        }
        this.f42013a = picasso;
        this.f42014b = new y.b(uri, i11, picasso.f41737l);
    }

    public z A() {
        this.f42014b.n();
        return this;
    }

    public final void B(x xVar) {
        Bitmap w11;
        if (MemoryPolicy.shouldReadFromMemoryCache(this.f42020h) && (w11 = this.f42013a.w(xVar.d())) != null) {
            xVar.b(w11, Picasso.LoadedFrom.MEMORY);
            return;
        }
        int i11 = this.f42018f;
        if (i11 != 0) {
            xVar.o(i11);
        }
        this.f42013a.j(xVar);
    }

    public z C(@DrawableRes int i11) {
        if (!this.f42017e) {
            throw new IllegalStateException("Already explicitly declared as no placeholder.");
        }
        if (i11 == 0) {
            throw new IllegalArgumentException("Placeholder image resource invalid.");
        }
        if (this.f42022j != null) {
            throw new IllegalStateException("Placeholder image already set.");
        }
        this.f42018f = i11;
        return this;
    }

    public z D(@NonNull Drawable drawable) {
        if (!this.f42017e) {
            throw new IllegalStateException("Already explicitly declared as no placeholder.");
        }
        if (this.f42018f != 0) {
            throw new IllegalStateException("Placeholder image already set.");
        }
        this.f42022j = drawable;
        return this;
    }

    public z E(@NonNull Picasso.Priority priority) {
        this.f42014b.o(priority);
        return this;
    }

    public z F() {
        this.f42014b.p();
        return this;
    }

    public z G(int i11, int i12) {
        this.f42014b.q(i11, i12);
        return this;
    }

    public z H(int i11, int i12) {
        Resources resources = this.f42013a.f41730e.getResources();
        return G(resources.getDimensionPixelSize(i11), resources.getDimensionPixelSize(i12));
    }

    public z I(float f11) {
        this.f42014b.r(f11);
        return this;
    }

    public z J(float f11, float f12, float f13) {
        this.f42014b.s(f11, f12, f13);
        return this;
    }

    public z K(@NonNull String str) {
        this.f42014b.v(str);
        return this;
    }

    public z L(@NonNull Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("Tag invalid.");
        }
        if (this.f42024l != null) {
            throw new IllegalStateException("Tag already set.");
        }
        this.f42024l = obj;
        return this;
    }

    public z M(@NonNull g0 g0Var) {
        this.f42014b.w(g0Var);
        return this;
    }

    public z N(@NonNull List<? extends g0> list) {
        this.f42014b.x(list);
        return this;
    }

    public z O() {
        this.f42016d = false;
        return this;
    }

    public z a() {
        this.f42014b.c(17);
        return this;
    }

    public z b(int i11) {
        this.f42014b.c(i11);
        return this;
    }

    public z c() {
        this.f42014b.d();
        return this;
    }

    public z d() {
        this.f42024l = null;
        return this;
    }

    public z e(@NonNull Bitmap.Config config) {
        this.f42014b.j(config);
        return this;
    }

    public final y f(long j11) {
        int andIncrement = f42012m.getAndIncrement();
        y a11 = this.f42014b.a();
        a11.f41975a = andIncrement;
        a11.f41976b = j11;
        boolean z11 = this.f42013a.f41739n;
        if (z11) {
            h0.u(h0.f41868j, h0.f41871m, a11.h(), a11.toString());
        }
        y E = this.f42013a.E(a11);
        if (E != a11) {
            E.f41975a = andIncrement;
            E.f41976b = j11;
            if (z11) {
                h0.u(h0.f41868j, h0.f41872n, E.e(), "into " + E);
            }
        }
        return E;
    }

    public z g(@DrawableRes int i11) {
        if (i11 == 0) {
            throw new IllegalArgumentException("Error image resource invalid.");
        }
        if (this.f42023k != null) {
            throw new IllegalStateException("Error image already set.");
        }
        this.f42019g = i11;
        return this;
    }

    public z h(@NonNull Drawable drawable) {
        if (drawable == null) {
            throw new IllegalArgumentException("Error image may not be null.");
        }
        if (this.f42019g != 0) {
            throw new IllegalStateException("Error image already set.");
        }
        this.f42023k = drawable;
        return this;
    }

    public void i() {
        j(null);
    }

    public void j(@Nullable f fVar) {
        long nanoTime = System.nanoTime();
        if (this.f42016d) {
            throw new IllegalStateException("Fit cannot be used with fetch.");
        }
        if (this.f42014b.k()) {
            if (!this.f42014b.l()) {
                this.f42014b.o(Picasso.Priority.LOW);
            }
            y f11 = f(nanoTime);
            String h11 = h0.h(f11, new StringBuilder());
            if (!MemoryPolicy.shouldReadFromMemoryCache(this.f42020h) || this.f42013a.w(h11) == null) {
                this.f42013a.D(new l(this.f42013a, f11, this.f42020h, this.f42021i, this.f42024l, h11, fVar));
                return;
            }
            if (this.f42013a.f41739n) {
                h0.u(h0.f41868j, h0.A, f11.h(), "from " + Picasso.LoadedFrom.MEMORY);
            }
            if (fVar != null) {
                fVar.onSuccess();
            }
        }
    }

    public z k() {
        this.f42016d = true;
        return this;
    }

    public Bitmap l() throws IOException {
        long nanoTime = System.nanoTime();
        h0.d();
        if (this.f42016d) {
            throw new IllegalStateException("Fit cannot be used with get.");
        }
        if (!this.f42014b.k()) {
            return null;
        }
        y f11 = f(nanoTime);
        n nVar = new n(this.f42013a, f11, this.f42020h, this.f42021i, this.f42024l, h0.h(f11, new StringBuilder()));
        Picasso picasso = this.f42013a;
        return c.g(picasso, picasso.f41731f, picasso.f41732g, picasso.f41733h, nVar).t();
    }

    public final Drawable m() {
        int i11 = this.f42018f;
        return i11 != 0 ? this.f42013a.f41730e.getDrawable(i11) : this.f42022j;
    }

    public Object n() {
        return this.f42024l;
    }

    public void o(ImageView imageView) {
        p(imageView, null);
    }

    public void p(ImageView imageView, f fVar) {
        Bitmap w11;
        long nanoTime = System.nanoTime();
        h0.c();
        if (imageView == null) {
            throw new IllegalArgumentException("Target must not be null.");
        }
        if (!this.f42014b.k()) {
            this.f42013a.c(imageView);
            if (this.f42017e) {
                u.d(imageView, m());
                return;
            }
            return;
        }
        if (this.f42016d) {
            if (this.f42014b.m()) {
                throw new IllegalStateException("Fit cannot be used with resize.");
            }
            int width = imageView.getWidth();
            int height = imageView.getHeight();
            if (width == 0 || height == 0) {
                if (this.f42017e) {
                    u.d(imageView, m());
                }
                this.f42013a.h(imageView, new i(this, imageView, fVar));
                return;
            }
            this.f42014b.q(width, height);
        }
        y f11 = f(nanoTime);
        String g11 = h0.g(f11);
        if (!MemoryPolicy.shouldReadFromMemoryCache(this.f42020h) || (w11 = this.f42013a.w(g11)) == null) {
            if (this.f42017e) {
                u.d(imageView, m());
            }
            this.f42013a.j(new o(this.f42013a, imageView, f11, this.f42020h, this.f42021i, this.f42019g, this.f42023k, g11, this.f42024l, fVar, this.f42015c));
            return;
        }
        this.f42013a.c(imageView);
        Picasso picasso = this.f42013a;
        Context context = picasso.f41730e;
        Picasso.LoadedFrom loadedFrom = Picasso.LoadedFrom.MEMORY;
        u.c(imageView, context, w11, loadedFrom, this.f42015c, picasso.f41738m);
        if (this.f42013a.f41739n) {
            h0.u(h0.f41868j, h0.A, f11.h(), "from " + loadedFrom);
        }
        if (fVar != null) {
            fVar.onSuccess();
        }
    }

    public void q(@NonNull RemoteViews remoteViews, @IdRes int i11, int i12, @NonNull Notification notification) {
        r(remoteViews, i11, i12, notification, null);
    }

    public void r(@NonNull RemoteViews remoteViews, @IdRes int i11, int i12, @NonNull Notification notification, @Nullable String str) {
        s(remoteViews, i11, i12, notification, str, null);
    }

    public void s(@NonNull RemoteViews remoteViews, @IdRes int i11, int i12, @NonNull Notification notification, @Nullable String str, f fVar) {
        long nanoTime = System.nanoTime();
        if (remoteViews == null) {
            throw new IllegalArgumentException("RemoteViews must not be null.");
        }
        if (notification == null) {
            throw new IllegalArgumentException("Notification must not be null.");
        }
        if (this.f42016d) {
            throw new IllegalStateException("Fit cannot be used with RemoteViews.");
        }
        if (this.f42022j != null || this.f42018f != 0 || this.f42023k != null) {
            throw new IllegalArgumentException("Cannot use placeholder or error drawables with remote views.");
        }
        y f11 = f(nanoTime);
        B(new x.b(this.f42013a, f11, remoteViews, i11, i12, notification, str, this.f42020h, this.f42021i, h0.h(f11, new StringBuilder()), this.f42024l, this.f42019g, fVar));
    }

    public void t(@NonNull RemoteViews remoteViews, @IdRes int i11, @NonNull int[] iArr) {
        u(remoteViews, i11, iArr, null);
    }

    public void u(@NonNull RemoteViews remoteViews, @IdRes int i11, @NonNull int[] iArr, f fVar) {
        long nanoTime = System.nanoTime();
        if (remoteViews == null) {
            throw new IllegalArgumentException("remoteViews must not be null.");
        }
        if (iArr == null) {
            throw new IllegalArgumentException("appWidgetIds must not be null.");
        }
        if (this.f42016d) {
            throw new IllegalStateException("Fit cannot be used with remote views.");
        }
        if (this.f42022j != null || this.f42018f != 0 || this.f42023k != null) {
            throw new IllegalArgumentException("Cannot use placeholder or error drawables with remote views.");
        }
        y f11 = f(nanoTime);
        B(new x.a(this.f42013a, f11, remoteViews, i11, iArr, this.f42020h, this.f42021i, h0.h(f11, new StringBuilder()), this.f42024l, this.f42019g, fVar));
    }

    public void v(@NonNull e0 e0Var) {
        Bitmap w11;
        long nanoTime = System.nanoTime();
        h0.c();
        if (e0Var == null) {
            throw new IllegalArgumentException("Target must not be null.");
        }
        if (this.f42016d) {
            throw new IllegalStateException("Fit cannot be used with a Target.");
        }
        if (!this.f42014b.k()) {
            this.f42013a.e(e0Var);
            e0Var.onPrepareLoad(this.f42017e ? m() : null);
            return;
        }
        y f11 = f(nanoTime);
        String g11 = h0.g(f11);
        if (!MemoryPolicy.shouldReadFromMemoryCache(this.f42020h) || (w11 = this.f42013a.w(g11)) == null) {
            e0Var.onPrepareLoad(this.f42017e ? m() : null);
            this.f42013a.j(new f0(this.f42013a, e0Var, f11, this.f42020h, this.f42021i, this.f42023k, g11, this.f42024l, this.f42019g));
        } else {
            this.f42013a.e(e0Var);
            e0Var.onBitmapLoaded(w11, Picasso.LoadedFrom.MEMORY);
        }
    }

    public z w(@NonNull MemoryPolicy memoryPolicy, @NonNull MemoryPolicy... memoryPolicyArr) {
        if (memoryPolicy == null) {
            throw new IllegalArgumentException("Memory policy cannot be null.");
        }
        this.f42020h = memoryPolicy.index | this.f42020h;
        if (memoryPolicyArr == null) {
            throw new IllegalArgumentException("Memory policy cannot be null.");
        }
        if (memoryPolicyArr.length > 0) {
            for (MemoryPolicy memoryPolicy2 : memoryPolicyArr) {
                if (memoryPolicy2 == null) {
                    throw new IllegalArgumentException("Memory policy cannot be null.");
                }
                this.f42020h = memoryPolicy2.index | this.f42020h;
            }
        }
        return this;
    }

    public z x(@NonNull NetworkPolicy networkPolicy, @NonNull NetworkPolicy... networkPolicyArr) {
        if (networkPolicy == null) {
            throw new IllegalArgumentException("Network policy cannot be null.");
        }
        this.f42021i = networkPolicy.index | this.f42021i;
        if (networkPolicyArr == null) {
            throw new IllegalArgumentException("Network policy cannot be null.");
        }
        if (networkPolicyArr.length > 0) {
            for (NetworkPolicy networkPolicy2 : networkPolicyArr) {
                if (networkPolicy2 == null) {
                    throw new IllegalArgumentException("Network policy cannot be null.");
                }
                this.f42021i = networkPolicy2.index | this.f42021i;
            }
        }
        return this;
    }

    public z y() {
        this.f42015c = true;
        return this;
    }

    public z z() {
        if (this.f42018f != 0) {
            throw new IllegalStateException("Placeholder resource already set.");
        }
        if (this.f42022j != null) {
            throw new IllegalStateException("Placeholder image already set.");
        }
        this.f42017e = false;
        return this;
    }

    @VisibleForTesting
    public z() {
        this.f42017e = true;
        this.f42013a = null;
        this.f42014b = new y.b(null, 0, null);
    }
}

package com.squareup.picasso;

import android.graphics.Bitmap;
import android.net.Uri;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class y {

    /* renamed from: u, reason: collision with root package name */
    public static final long f41974u = TimeUnit.SECONDS.toNanos(5);

    /* renamed from: a, reason: collision with root package name */
    public int f41975a;

    /* renamed from: b, reason: collision with root package name */
    public long f41976b;

    /* renamed from: c, reason: collision with root package name */
    public int f41977c;

    /* renamed from: d, reason: collision with root package name */
    public final Uri f41978d;

    /* renamed from: e, reason: collision with root package name */
    public final int f41979e;

    /* renamed from: f, reason: collision with root package name */
    public final String f41980f;

    /* renamed from: g, reason: collision with root package name */
    public final List<g0> f41981g;

    /* renamed from: h, reason: collision with root package name */
    public final int f41982h;

    /* renamed from: i, reason: collision with root package name */
    public final int f41983i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f41984j;

    /* renamed from: k, reason: collision with root package name */
    public final int f41985k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f41986l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f41987m;

    /* renamed from: n, reason: collision with root package name */
    public final float f41988n;

    /* renamed from: o, reason: collision with root package name */
    public final float f41989o;

    /* renamed from: p, reason: collision with root package name */
    public final float f41990p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f41991q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f41992r;

    /* renamed from: s, reason: collision with root package name */
    public final Bitmap.Config f41993s;

    /* renamed from: t, reason: collision with root package name */
    public final Picasso.Priority f41994t;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public Uri f41995a;

        /* renamed from: b, reason: collision with root package name */
        public int f41996b;

        /* renamed from: c, reason: collision with root package name */
        public String f41997c;

        /* renamed from: d, reason: collision with root package name */
        public int f41998d;

        /* renamed from: e, reason: collision with root package name */
        public int f41999e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f42000f;

        /* renamed from: g, reason: collision with root package name */
        public int f42001g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f42002h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f42003i;

        /* renamed from: j, reason: collision with root package name */
        public float f42004j;

        /* renamed from: k, reason: collision with root package name */
        public float f42005k;

        /* renamed from: l, reason: collision with root package name */
        public float f42006l;

        /* renamed from: m, reason: collision with root package name */
        public boolean f42007m;

        /* renamed from: n, reason: collision with root package name */
        public boolean f42008n;

        /* renamed from: o, reason: collision with root package name */
        public List<g0> f42009o;

        /* renamed from: p, reason: collision with root package name */
        public Bitmap.Config f42010p;

        /* renamed from: q, reason: collision with root package name */
        public Picasso.Priority f42011q;

        public y a() {
            boolean z11 = this.f42002h;
            if (z11 && this.f42000f) {
                throw new IllegalStateException("Center crop and center inside can not be used together.");
            }
            if (this.f42000f && this.f41998d == 0 && this.f41999e == 0) {
                throw new IllegalStateException("Center crop requires calling resize with positive width and height.");
            }
            if (z11 && this.f41998d == 0 && this.f41999e == 0) {
                throw new IllegalStateException("Center inside requires calling resize with positive width and height.");
            }
            if (this.f42011q == null) {
                this.f42011q = Picasso.Priority.NORMAL;
            }
            return new y(this.f41995a, this.f41996b, this.f41997c, this.f42009o, this.f41998d, this.f41999e, this.f42000f, this.f42002h, this.f42001g, this.f42003i, this.f42004j, this.f42005k, this.f42006l, this.f42007m, this.f42008n, this.f42010p, this.f42011q);
        }

        public b b() {
            return c(17);
        }

        public b c(int i11) {
            if (this.f42002h) {
                throw new IllegalStateException("Center crop can not be used after calling centerInside");
            }
            this.f42000f = true;
            this.f42001g = i11;
            return this;
        }

        public b d() {
            if (this.f42000f) {
                throw new IllegalStateException("Center inside can not be used after calling centerCrop");
            }
            this.f42002h = true;
            return this;
        }

        public b e() {
            this.f42000f = false;
            this.f42001g = 17;
            return this;
        }

        public b f() {
            this.f42002h = false;
            return this;
        }

        public b g() {
            this.f42003i = false;
            return this;
        }

        public b h() {
            this.f41998d = 0;
            this.f41999e = 0;
            this.f42000f = false;
            this.f42002h = false;
            return this;
        }

        public b i() {
            this.f42004j = 0.0f;
            this.f42005k = 0.0f;
            this.f42006l = 0.0f;
            this.f42007m = false;
            return this;
        }

        public b j(@NonNull Bitmap.Config config) {
            if (config == null) {
                throw new IllegalArgumentException("config == null");
            }
            this.f42010p = config;
            return this;
        }

        public boolean k() {
            return (this.f41995a == null && this.f41996b == 0) ? false : true;
        }

        public boolean l() {
            return this.f42011q != null;
        }

        public boolean m() {
            return (this.f41998d == 0 && this.f41999e == 0) ? false : true;
        }

        public b n() {
            if (this.f41999e == 0 && this.f41998d == 0) {
                throw new IllegalStateException("onlyScaleDown can not be applied without resize");
            }
            this.f42003i = true;
            return this;
        }

        public b o(@NonNull Picasso.Priority priority) {
            if (priority == null) {
                throw new IllegalArgumentException("Priority invalid.");
            }
            if (this.f42011q != null) {
                throw new IllegalStateException("Priority already set.");
            }
            this.f42011q = priority;
            return this;
        }

        public b p() {
            this.f42008n = true;
            return this;
        }

        public b q(@Px int i11, @Px int i12) {
            if (i11 < 0) {
                throw new IllegalArgumentException("Width must be positive number or 0.");
            }
            if (i12 < 0) {
                throw new IllegalArgumentException("Height must be positive number or 0.");
            }
            if (i12 == 0 && i11 == 0) {
                throw new IllegalArgumentException("At least one dimension has to be positive number.");
            }
            this.f41998d = i11;
            this.f41999e = i12;
            return this;
        }

        public b r(float f11) {
            this.f42004j = f11;
            return this;
        }

        public b s(float f11, float f12, float f13) {
            this.f42004j = f11;
            this.f42005k = f12;
            this.f42006l = f13;
            this.f42007m = true;
            return this;
        }

        public b t(@DrawableRes int i11) {
            if (i11 == 0) {
                throw new IllegalArgumentException("Image resource ID may not be 0.");
            }
            this.f41996b = i11;
            this.f41995a = null;
            return this;
        }

        public b u(@NonNull Uri uri) {
            if (uri == null) {
                throw new IllegalArgumentException("Image URI may not be null.");
            }
            this.f41995a = uri;
            this.f41996b = 0;
            return this;
        }

        public b v(@Nullable String str) {
            this.f41997c = str;
            return this;
        }

        public b w(@NonNull g0 g0Var) {
            if (g0Var == null) {
                throw new IllegalArgumentException("Transformation must not be null.");
            }
            if (g0Var.key() == null) {
                throw new IllegalArgumentException("Transformation key must not be null.");
            }
            if (this.f42009o == null) {
                this.f42009o = new ArrayList(2);
            }
            this.f42009o.add(g0Var);
            return this;
        }

        public b x(@NonNull List<? extends g0> list) {
            if (list == null) {
                throw new IllegalArgumentException("Transformation list must not be null.");
            }
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                w(list.get(i11));
            }
            return this;
        }

        public b(@NonNull Uri uri) {
            u(uri);
        }

        public b(@DrawableRes int i11) {
            t(i11);
        }

        public b(Uri uri, int i11, Bitmap.Config config) {
            this.f41995a = uri;
            this.f41996b = i11;
            this.f42010p = config;
        }

        public b(y yVar) {
            this.f41995a = yVar.f41978d;
            this.f41996b = yVar.f41979e;
            this.f41997c = yVar.f41980f;
            this.f41998d = yVar.f41982h;
            this.f41999e = yVar.f41983i;
            this.f42000f = yVar.f41984j;
            this.f42002h = yVar.f41986l;
            this.f42001g = yVar.f41985k;
            this.f42004j = yVar.f41988n;
            this.f42005k = yVar.f41989o;
            this.f42006l = yVar.f41990p;
            this.f42007m = yVar.f41991q;
            this.f42008n = yVar.f41992r;
            this.f42003i = yVar.f41987m;
            if (yVar.f41981g != null) {
                this.f42009o = new ArrayList(yVar.f41981g);
            }
            this.f42010p = yVar.f41993s;
            this.f42011q = yVar.f41994t;
        }
    }

    public b a() {
        return new b();
    }

    public String b() {
        Uri uri = this.f41978d;
        return uri != null ? String.valueOf(uri.getPath()) : Integer.toHexString(this.f41979e);
    }

    public boolean c() {
        return this.f41981g != null;
    }

    public boolean d() {
        return (this.f41982h == 0 && this.f41983i == 0) ? false : true;
    }

    public String e() {
        long nanoTime = System.nanoTime() - this.f41976b;
        if (nanoTime > f41974u) {
            return h() + '+' + TimeUnit.NANOSECONDS.toSeconds(nanoTime) + io.ktor.util.date.b.f61997c;
        }
        return h() + '+' + TimeUnit.NANOSECONDS.toMillis(nanoTime) + "ms";
    }

    public boolean f() {
        return d() || this.f41988n != 0.0f;
    }

    public boolean g() {
        return f() || c();
    }

    public String h() {
        return "[R" + this.f41975a + l50.b.f69930l;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Request{");
        int i11 = this.f41979e;
        if (i11 > 0) {
            sb2.append(i11);
        } else {
            sb2.append(this.f41978d);
        }
        List<g0> list = this.f41981g;
        if (list != null && !list.isEmpty()) {
            for (g0 g0Var : this.f41981g) {
                sb2.append(' ');
                sb2.append(g0Var.key());
            }
        }
        if (this.f41980f != null) {
            sb2.append(" stableKey(");
            sb2.append(this.f41980f);
            sb2.append(')');
        }
        if (this.f41982h > 0) {
            sb2.append(" resize(");
            sb2.append(this.f41982h);
            sb2.append(',');
            sb2.append(this.f41983i);
            sb2.append(')');
        }
        if (this.f41984j) {
            sb2.append(" centerCrop");
        }
        if (this.f41986l) {
            sb2.append(" centerInside");
        }
        if (this.f41988n != 0.0f) {
            sb2.append(" rotation(");
            sb2.append(this.f41988n);
            if (this.f41991q) {
                sb2.append(" @ ");
                sb2.append(this.f41989o);
                sb2.append(',');
                sb2.append(this.f41990p);
            }
            sb2.append(')');
        }
        if (this.f41992r) {
            sb2.append(" purgeable");
        }
        if (this.f41993s != null) {
            sb2.append(' ');
            sb2.append(this.f41993s);
        }
        sb2.append(l50.b.f69928j);
        return sb2.toString();
    }

    public y(Uri uri, int i11, String str, List<g0> list, int i12, int i13, boolean z11, boolean z12, int i14, boolean z13, float f11, float f12, float f13, boolean z14, boolean z15, Bitmap.Config config, Picasso.Priority priority) {
        this.f41978d = uri;
        this.f41979e = i11;
        this.f41980f = str;
        if (list == null) {
            this.f41981g = null;
        } else {
            this.f41981g = Collections.unmodifiableList(list);
        }
        this.f41982h = i12;
        this.f41983i = i13;
        this.f41984j = z11;
        this.f41986l = z12;
        this.f41985k = i14;
        this.f41987m = z13;
        this.f41988n = f11;
        this.f41989o = f12;
        this.f41990p = f13;
        this.f41991q = z14;
        this.f41992r = z15;
        this.f41993s = config;
        this.f41994t = priority;
    }
}

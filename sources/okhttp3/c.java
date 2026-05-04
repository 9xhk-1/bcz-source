package okhttp3;

import androidx.collection.SieveCacheKt;
import java.util.concurrent.TimeUnit;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import org.junit.jupiter.api.j2;
import u30.k0;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class c {

    /* renamed from: n, reason: collision with root package name */
    @m80.k
    public static final b f77156n = new b(null);

    /* renamed from: o, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final c f77157o = new a().g().a();

    /* renamed from: p, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final c f77158p = new a().j().e(Integer.MAX_VALUE, TimeUnit.SECONDS).a();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f77159a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f77160b;

    /* renamed from: c, reason: collision with root package name */
    public final int f77161c;

    /* renamed from: d, reason: collision with root package name */
    public final int f77162d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f77163e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f77164f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f77165g;

    /* renamed from: h, reason: collision with root package name */
    public final int f77166h;

    /* renamed from: i, reason: collision with root package name */
    public final int f77167i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f77168j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f77169k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f77170l;

    /* renamed from: m, reason: collision with root package name */
    @m80.l
    public String f77171m;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nCacheControl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CacheControl.kt\nokhttp3/CacheControl$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,416:1\n1#2:417\n*E\n"})
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public boolean f77172a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f77173b;

        /* renamed from: c, reason: collision with root package name */
        public int f77174c = -1;

        /* renamed from: d, reason: collision with root package name */
        public int f77175d = -1;

        /* renamed from: e, reason: collision with root package name */
        public int f77176e = -1;

        /* renamed from: f, reason: collision with root package name */
        public boolean f77177f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f77178g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f77179h;

        @m80.k
        public final c a() {
            return new c(this.f77172a, this.f77173b, this.f77174c, -1, false, false, false, this.f77175d, this.f77176e, this.f77177f, this.f77178g, this.f77179h, null, null);
        }

        public final int b(long j11) {
            if (j11 > SieveCacheKt.NodeLinkMask) {
                return Integer.MAX_VALUE;
            }
            return (int) j11;
        }

        @m80.k
        public final a c() {
            this.f77179h = true;
            return this;
        }

        @m80.k
        public final a d(int i11, @m80.k TimeUnit timeUnit) {
            g0.p(timeUnit, "timeUnit");
            if (i11 >= 0) {
                this.f77174c = b(timeUnit.toSeconds(i11));
                return this;
            }
            throw new IllegalArgumentException(("maxAge < 0: " + i11).toString());
        }

        @m80.k
        public final a e(int i11, @m80.k TimeUnit timeUnit) {
            g0.p(timeUnit, "timeUnit");
            if (i11 >= 0) {
                this.f77175d = b(timeUnit.toSeconds(i11));
                return this;
            }
            throw new IllegalArgumentException(("maxStale < 0: " + i11).toString());
        }

        @m80.k
        public final a f(int i11, @m80.k TimeUnit timeUnit) {
            g0.p(timeUnit, "timeUnit");
            if (i11 >= 0) {
                this.f77176e = b(timeUnit.toSeconds(i11));
                return this;
            }
            throw new IllegalArgumentException(("minFresh < 0: " + i11).toString());
        }

        @m80.k
        public final a g() {
            this.f77172a = true;
            return this;
        }

        @m80.k
        public final a h() {
            this.f77173b = true;
            return this;
        }

        @m80.k
        public final a i() {
            this.f77178g = true;
            return this;
        }

        @m80.k
        public final a j() {
            this.f77177f = true;
            return this;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(v vVar) {
            this();
        }

        public static /* synthetic */ int b(b bVar, String str, String str2, int i11, int i12, Object obj) {
            if ((i12 & 2) != 0) {
                i11 = 0;
            }
            return bVar.a(str, str2, i11);
        }

        public final int a(String str, String str2, int i11) {
            int length = str.length();
            while (i11 < length) {
                if (k0.m3(str2, str.charAt(i11), false, 2, null)) {
                    return i11;
                }
                i11++;
            }
            return str.length();
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00dc  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00e6  */
        @w00.o
        @m80.k
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final okhttp3.c c(@m80.k okhttp3.h r33) {
            /*
                Method dump skipped, instructions count: 426
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.c.b.c(okhttp3.h):okhttp3.c");
        }

        public b() {
        }
    }

    public /* synthetic */ c(boolean z11, boolean z12, int i11, int i12, boolean z13, boolean z14, boolean z15, int i13, int i14, boolean z16, boolean z17, boolean z18, String str, v vVar) {
        this(z11, z12, i11, i12, z13, z14, z15, i13, i14, z16, z17, z18, str);
    }

    @w00.o
    @m80.k
    public static final c v(@m80.k h hVar) {
        return f77156n.c(hVar);
    }

    @w00.j(name = "-deprecated_immutable")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @w0(expression = "immutable", imports = {}))
    public final boolean a() {
        return this.f77170l;
    }

    @w00.j(name = "-deprecated_maxAgeSeconds")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @w0(expression = "maxAgeSeconds", imports = {}))
    public final int b() {
        return this.f77161c;
    }

    @w00.j(name = "-deprecated_maxStaleSeconds")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @w0(expression = "maxStaleSeconds", imports = {}))
    public final int c() {
        return this.f77166h;
    }

    @w00.j(name = "-deprecated_minFreshSeconds")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @w0(expression = "minFreshSeconds", imports = {}))
    public final int d() {
        return this.f77167i;
    }

    @w00.j(name = "-deprecated_mustRevalidate")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @w0(expression = "mustRevalidate", imports = {}))
    public final boolean e() {
        return this.f77165g;
    }

    @w00.j(name = "-deprecated_noCache")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @w0(expression = "noCache", imports = {}))
    public final boolean f() {
        return this.f77159a;
    }

    @w00.j(name = "-deprecated_noStore")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @w0(expression = "noStore", imports = {}))
    public final boolean g() {
        return this.f77160b;
    }

    @w00.j(name = "-deprecated_noTransform")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @w0(expression = "noTransform", imports = {}))
    public final boolean h() {
        return this.f77169k;
    }

    @w00.j(name = "-deprecated_onlyIfCached")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @w0(expression = "onlyIfCached", imports = {}))
    public final boolean i() {
        return this.f77168j;
    }

    @w00.j(name = "-deprecated_sMaxAgeSeconds")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @w0(expression = "sMaxAgeSeconds", imports = {}))
    public final int j() {
        return this.f77162d;
    }

    @w00.j(name = "immutable")
    public final boolean k() {
        return this.f77170l;
    }

    public final boolean l() {
        return this.f77163e;
    }

    public final boolean m() {
        return this.f77164f;
    }

    @w00.j(name = "maxAgeSeconds")
    public final int n() {
        return this.f77161c;
    }

    @w00.j(name = "maxStaleSeconds")
    public final int o() {
        return this.f77166h;
    }

    @w00.j(name = "minFreshSeconds")
    public final int p() {
        return this.f77167i;
    }

    @w00.j(name = "mustRevalidate")
    public final boolean q() {
        return this.f77165g;
    }

    @w00.j(name = "noCache")
    public final boolean r() {
        return this.f77159a;
    }

    @w00.j(name = "noStore")
    public final boolean s() {
        return this.f77160b;
    }

    @w00.j(name = "noTransform")
    public final boolean t() {
        return this.f77169k;
    }

    @m80.k
    public String toString() {
        String str = this.f77171m;
        if (str != null) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f77159a) {
            sb2.append("no-cache, ");
        }
        if (this.f77160b) {
            sb2.append("no-store, ");
        }
        if (this.f77161c != -1) {
            sb2.append("max-age=");
            sb2.append(this.f77161c);
            sb2.append(j2.O);
        }
        if (this.f77162d != -1) {
            sb2.append("s-maxage=");
            sb2.append(this.f77162d);
            sb2.append(j2.O);
        }
        if (this.f77163e) {
            sb2.append("private, ");
        }
        if (this.f77164f) {
            sb2.append("public, ");
        }
        if (this.f77165g) {
            sb2.append("must-revalidate, ");
        }
        if (this.f77166h != -1) {
            sb2.append("max-stale=");
            sb2.append(this.f77166h);
            sb2.append(j2.O);
        }
        if (this.f77167i != -1) {
            sb2.append("min-fresh=");
            sb2.append(this.f77167i);
            sb2.append(j2.O);
        }
        if (this.f77168j) {
            sb2.append("only-if-cached, ");
        }
        if (this.f77169k) {
            sb2.append("no-transform, ");
        }
        if (this.f77170l) {
            sb2.append("immutable, ");
        }
        if (sb2.length() == 0) {
            return "";
        }
        sb2.delete(sb2.length() - 2, sb2.length());
        String sb3 = sb2.toString();
        g0.o(sb3, "StringBuilder().apply(builderAction).toString()");
        this.f77171m = sb3;
        return sb3;
    }

    @w00.j(name = "onlyIfCached")
    public final boolean u() {
        return this.f77168j;
    }

    @w00.j(name = "sMaxAgeSeconds")
    public final int w() {
        return this.f77162d;
    }

    public c(boolean z11, boolean z12, int i11, int i12, boolean z13, boolean z14, boolean z15, int i13, int i14, boolean z16, boolean z17, boolean z18, String str) {
        this.f77159a = z11;
        this.f77160b = z12;
        this.f77161c = i11;
        this.f77162d = i12;
        this.f77163e = z13;
        this.f77164f = z14;
        this.f77165g = z15;
        this.f77166h = i13;
        this.f77167i = i14;
        this.f77168j = z16;
        this.f77169k = z17;
        this.f77170l = z18;
        this.f77171m = str;
    }
}

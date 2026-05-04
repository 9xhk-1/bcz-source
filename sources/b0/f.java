package b0;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import b0.b;
import b0.c;
import b0.f;
import c40.m0;
import coil.decode.ExifOrientationPolicy;
import coil.memory.MemoryCache;
import coil.request.CachePolicy;
import coil.request.ImageRequest;
import coil.size.Precision;
import kotlin.DeprecationLevel;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import t0.a;
import t0.c;
import t50.b;
import t50.q;
import u0.t;
import u0.w;
import u0.x;
import yz.c0;
import yz.e0;
import yz.f0;
import yz.g2;
import yz.n;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public interface f {
    @l
    g0.a a();

    @k
    b b();

    @k
    o0.b c();

    @k
    o0.d d(@k ImageRequest imageRequest);

    @l
    Object e(@k ImageRequest imageRequest, @k j00.c<? super o0.g> cVar);

    @k
    a f();

    @l
    MemoryCache g();

    void shutdown();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nImageLoader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageLoader.kt\ncoil/ImageLoader$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,595:1\n1#2:596\n*E\n"})
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Context f5594a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public o0.b f5595b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public c0<? extends MemoryCache> f5596c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public c0<? extends g0.a> f5597d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public c0<? extends b.a> f5598e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public c.d f5599f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public b0.b f5600g;

        /* renamed from: h, reason: collision with root package name */
        @k
        public t f5601h;

        /* renamed from: i, reason: collision with root package name */
        @l
        public w f5602i;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: b0.f$a$a, reason: collision with other inner class name */
        public static final class C0101a extends Lambda implements x00.a<MemoryCache> {
            public C0101a() {
                super(0);
            }

            @Override // x00.a
            @k
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final MemoryCache invoke() {
                return new MemoryCache.a(a.this.f5594a).a();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class b extends Lambda implements x00.a<g0.a> {
            public b() {
                super(0);
            }

            @Override // x00.a
            @k
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final g0.a invoke() {
                return x.f91489a.a(a.this.f5594a);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class c extends Lambda implements x00.a<q> {

            /* renamed from: a, reason: collision with root package name */
            public static final c f5605a = new c();

            public c() {
                super(0);
            }

            @Override // x00.a
            @k
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final q invoke() {
                return new q();
            }
        }

        public a(@k Context context) {
            this.f5594a = context.getApplicationContext();
            this.f5595b = u0.k.b();
            this.f5596c = null;
            this.f5597d = null;
            this.f5598e = null;
            this.f5599f = null;
            this.f5600g = null;
            this.f5601h = new t(false, false, false, 0, null, 31, null);
            this.f5602i = null;
        }

        @k
        public final a B(@k c.d dVar) {
            this.f5599f = dVar;
            return this;
        }

        @k
        public final a C(@DrawableRes int i11) {
            return D(u0.d.a(this.f5594a, i11));
        }

        @k
        public final a D(@l Drawable drawable) {
            o0.b a11;
            a11 = r1.a((r32 & 1) != 0 ? r1.f75426a : null, (r32 & 2) != 0 ? r1.f75427b : null, (r32 & 4) != 0 ? r1.f75428c : null, (r32 & 8) != 0 ? r1.f75429d : null, (r32 & 16) != 0 ? r1.f75430e : null, (r32 & 32) != 0 ? r1.f75431f : null, (r32 & 64) != 0 ? r1.f75432g : null, (r32 & 128) != 0 ? r1.f75433h : false, (r32 & 256) != 0 ? r1.f75434i : false, (r32 & 512) != 0 ? r1.f75435j : null, (r32 & 1024) != 0 ? r1.f75436k : null, (r32 & 2048) != 0 ? r1.f75437l : drawable != null ? drawable.mutate() : null, (r32 & 4096) != 0 ? r1.f75438m : null, (r32 & 8192) != 0 ? r1.f75439n : null, (r32 & 16384) != 0 ? this.f5595b.f75440o : null);
            this.f5595b = a11;
            return this;
        }

        @k
        public final a E(@k m0 m0Var) {
            o0.b a11;
            a11 = r1.a((r32 & 1) != 0 ? r1.f75426a : null, (r32 & 2) != 0 ? r1.f75427b : m0Var, (r32 & 4) != 0 ? r1.f75428c : null, (r32 & 8) != 0 ? r1.f75429d : null, (r32 & 16) != 0 ? r1.f75430e : null, (r32 & 32) != 0 ? r1.f75431f : null, (r32 & 64) != 0 ? r1.f75432g : null, (r32 & 128) != 0 ? r1.f75433h : false, (r32 & 256) != 0 ? r1.f75434i : false, (r32 & 512) != 0 ? r1.f75435j : null, (r32 & 1024) != 0 ? r1.f75436k : null, (r32 & 2048) != 0 ? r1.f75437l : null, (r32 & 4096) != 0 ? r1.f75438m : null, (r32 & 8192) != 0 ? r1.f75439n : null, (r32 & 16384) != 0 ? this.f5595b.f75440o : null);
            this.f5595b = a11;
            return this;
        }

        @k
        public final a F(@k m0 m0Var) {
            o0.b a11;
            a11 = r1.a((r32 & 1) != 0 ? r1.f75426a : m0Var, (r32 & 2) != 0 ? r1.f75427b : null, (r32 & 4) != 0 ? r1.f75428c : null, (r32 & 8) != 0 ? r1.f75429d : null, (r32 & 16) != 0 ? r1.f75430e : null, (r32 & 32) != 0 ? r1.f75431f : null, (r32 & 64) != 0 ? r1.f75432g : null, (r32 & 128) != 0 ? r1.f75433h : false, (r32 & 256) != 0 ? r1.f75434i : false, (r32 & 512) != 0 ? r1.f75435j : null, (r32 & 1024) != 0 ? r1.f75436k : null, (r32 & 2048) != 0 ? r1.f75437l : null, (r32 & 4096) != 0 ? r1.f75438m : null, (r32 & 8192) != 0 ? r1.f75439n : null, (r32 & 16384) != 0 ? this.f5595b.f75440o : null);
            this.f5595b = a11;
            return this;
        }

        @n(level = DeprecationLevel.ERROR, message = "Migrate to 'interceptorDispatcher'.", replaceWith = @w0(expression = "interceptorDispatcher(if (enable) Dispatchers.Main.immediate else Dispatchers.IO)", imports = {"kotlinx.coroutines.Dispatchers"}))
        @k
        public final a G(boolean z11) {
            u0.l.K();
            throw new KotlinNothingValueException();
        }

        @k
        public final a H(@l w wVar) {
            this.f5602i = wVar;
            return this;
        }

        @k
        public final a I(@l MemoryCache memoryCache) {
            this.f5596c = f0.e(memoryCache);
            return this;
        }

        @k
        public final a J(@k x00.a<? extends MemoryCache> aVar) {
            this.f5596c = e0.c(aVar);
            return this;
        }

        @k
        public final a K(@k CachePolicy cachePolicy) {
            o0.b a11;
            a11 = r1.a((r32 & 1) != 0 ? r1.f75426a : null, (r32 & 2) != 0 ? r1.f75427b : null, (r32 & 4) != 0 ? r1.f75428c : null, (r32 & 8) != 0 ? r1.f75429d : null, (r32 & 16) != 0 ? r1.f75430e : null, (r32 & 32) != 0 ? r1.f75431f : null, (r32 & 64) != 0 ? r1.f75432g : null, (r32 & 128) != 0 ? r1.f75433h : false, (r32 & 256) != 0 ? r1.f75434i : false, (r32 & 512) != 0 ? r1.f75435j : null, (r32 & 1024) != 0 ? r1.f75436k : null, (r32 & 2048) != 0 ? r1.f75437l : null, (r32 & 4096) != 0 ? r1.f75438m : cachePolicy, (r32 & 8192) != 0 ? r1.f75439n : null, (r32 & 16384) != 0 ? this.f5595b.f75440o : null);
            this.f5595b = a11;
            return this;
        }

        @k
        public final a L(@k CachePolicy cachePolicy) {
            o0.b a11;
            a11 = r1.a((r32 & 1) != 0 ? r1.f75426a : null, (r32 & 2) != 0 ? r1.f75427b : null, (r32 & 4) != 0 ? r1.f75428c : null, (r32 & 8) != 0 ? r1.f75429d : null, (r32 & 16) != 0 ? r1.f75430e : null, (r32 & 32) != 0 ? r1.f75431f : null, (r32 & 64) != 0 ? r1.f75432g : null, (r32 & 128) != 0 ? r1.f75433h : false, (r32 & 256) != 0 ? r1.f75434i : false, (r32 & 512) != 0 ? r1.f75435j : null, (r32 & 1024) != 0 ? r1.f75436k : null, (r32 & 2048) != 0 ? r1.f75437l : null, (r32 & 4096) != 0 ? r1.f75438m : null, (r32 & 8192) != 0 ? r1.f75439n : null, (r32 & 16384) != 0 ? this.f5595b.f75440o : cachePolicy);
            this.f5595b = a11;
            return this;
        }

        @k
        public final a M(boolean z11) {
            this.f5601h = t.b(this.f5601h, false, z11, false, 0, null, 29, null);
            return this;
        }

        @k
        public final a N(@k q qVar) {
            return k(qVar);
        }

        @k
        public final a O(@k x00.a<? extends q> aVar) {
            return l(aVar);
        }

        @k
        public final a P(@DrawableRes int i11) {
            return Q(u0.d.a(this.f5594a, i11));
        }

        @k
        public final a Q(@l Drawable drawable) {
            o0.b a11;
            a11 = r1.a((r32 & 1) != 0 ? r1.f75426a : null, (r32 & 2) != 0 ? r1.f75427b : null, (r32 & 4) != 0 ? r1.f75428c : null, (r32 & 8) != 0 ? r1.f75429d : null, (r32 & 16) != 0 ? r1.f75430e : null, (r32 & 32) != 0 ? r1.f75431f : null, (r32 & 64) != 0 ? r1.f75432g : null, (r32 & 128) != 0 ? r1.f75433h : false, (r32 & 256) != 0 ? r1.f75434i : false, (r32 & 512) != 0 ? r1.f75435j : drawable != null ? drawable.mutate() : null, (r32 & 1024) != 0 ? r1.f75436k : null, (r32 & 2048) != 0 ? r1.f75437l : null, (r32 & 4096) != 0 ? r1.f75438m : null, (r32 & 8192) != 0 ? r1.f75439n : null, (r32 & 16384) != 0 ? this.f5595b.f75440o : null);
            this.f5595b = a11;
            return this;
        }

        @k
        public final a R(@k Precision precision) {
            o0.b a11;
            a11 = r1.a((r32 & 1) != 0 ? r1.f75426a : null, (r32 & 2) != 0 ? r1.f75427b : null, (r32 & 4) != 0 ? r1.f75428c : null, (r32 & 8) != 0 ? r1.f75429d : null, (r32 & 16) != 0 ? r1.f75430e : null, (r32 & 32) != 0 ? r1.f75431f : precision, (r32 & 64) != 0 ? r1.f75432g : null, (r32 & 128) != 0 ? r1.f75433h : false, (r32 & 256) != 0 ? r1.f75434i : false, (r32 & 512) != 0 ? r1.f75435j : null, (r32 & 1024) != 0 ? r1.f75436k : null, (r32 & 2048) != 0 ? r1.f75437l : null, (r32 & 4096) != 0 ? r1.f75438m : null, (r32 & 8192) != 0 ? r1.f75439n : null, (r32 & 16384) != 0 ? this.f5595b.f75440o : null);
            this.f5595b = a11;
            return this;
        }

        @k
        public final a S(boolean z11) {
            this.f5601h = t.b(this.f5601h, false, false, z11, 0, null, 27, null);
            return this;
        }

        @n(level = DeprecationLevel.ERROR, message = "Migrate to 'memoryCache'.", replaceWith = @w0(expression = "memoryCache { MemoryCache.Builder(context).weakReferencesEnabled(enable).build() }", imports = {"coil.memory.MemoryCache"}))
        @k
        public final a T(boolean z11) {
            u0.l.K();
            throw new KotlinNothingValueException();
        }

        @k
        public final a U(@k m0 m0Var) {
            o0.b a11;
            a11 = r1.a((r32 & 1) != 0 ? r1.f75426a : null, (r32 & 2) != 0 ? r1.f75427b : null, (r32 & 4) != 0 ? r1.f75428c : null, (r32 & 8) != 0 ? r1.f75429d : m0Var, (r32 & 16) != 0 ? r1.f75430e : null, (r32 & 32) != 0 ? r1.f75431f : null, (r32 & 64) != 0 ? r1.f75432g : null, (r32 & 128) != 0 ? r1.f75433h : false, (r32 & 256) != 0 ? r1.f75434i : false, (r32 & 512) != 0 ? r1.f75435j : null, (r32 & 1024) != 0 ? r1.f75436k : null, (r32 & 2048) != 0 ? r1.f75437l : null, (r32 & 4096) != 0 ? r1.f75438m : null, (r32 & 8192) != 0 ? r1.f75439n : null, (r32 & 16384) != 0 ? this.f5595b.f75440o : null);
            this.f5595b = a11;
            return this;
        }

        @n(level = DeprecationLevel.ERROR, message = "Migrate to 'transitionFactory'.", replaceWith = @w0(expression = "transitionFactory { _, _ -> transition }", imports = {}))
        @k
        public final a V(@k t0.c cVar) {
            u0.l.K();
            throw new KotlinNothingValueException();
        }

        @k
        public final a W(@k c.a aVar) {
            o0.b a11;
            a11 = r1.a((r32 & 1) != 0 ? r1.f75426a : null, (r32 & 2) != 0 ? r1.f75427b : null, (r32 & 4) != 0 ? r1.f75428c : null, (r32 & 8) != 0 ? r1.f75429d : null, (r32 & 16) != 0 ? r1.f75430e : aVar, (r32 & 32) != 0 ? r1.f75431f : null, (r32 & 64) != 0 ? r1.f75432g : null, (r32 & 128) != 0 ? r1.f75433h : false, (r32 & 256) != 0 ? r1.f75434i : false, (r32 & 512) != 0 ? r1.f75435j : null, (r32 & 1024) != 0 ? r1.f75436k : null, (r32 & 2048) != 0 ? r1.f75437l : null, (r32 & 4096) != 0 ? r1.f75438m : null, (r32 & 8192) != 0 ? r1.f75439n : null, (r32 & 16384) != 0 ? this.f5595b.f75440o : null);
            this.f5595b = a11;
            return this;
        }

        @k
        public final a c(boolean z11) {
            this.f5601h = t.b(this.f5601h, z11, false, false, 0, null, 30, null);
            return this;
        }

        @k
        public final a d(boolean z11) {
            o0.b a11;
            a11 = r1.a((r32 & 1) != 0 ? r1.f75426a : null, (r32 & 2) != 0 ? r1.f75427b : null, (r32 & 4) != 0 ? r1.f75428c : null, (r32 & 8) != 0 ? r1.f75429d : null, (r32 & 16) != 0 ? r1.f75430e : null, (r32 & 32) != 0 ? r1.f75431f : null, (r32 & 64) != 0 ? r1.f75432g : null, (r32 & 128) != 0 ? r1.f75433h : z11, (r32 & 256) != 0 ? r1.f75434i : false, (r32 & 512) != 0 ? r1.f75435j : null, (r32 & 1024) != 0 ? r1.f75436k : null, (r32 & 2048) != 0 ? r1.f75437l : null, (r32 & 4096) != 0 ? r1.f75438m : null, (r32 & 8192) != 0 ? r1.f75439n : null, (r32 & 16384) != 0 ? this.f5595b.f75440o : null);
            this.f5595b = a11;
            return this;
        }

        @k
        public final a e(boolean z11) {
            o0.b a11;
            a11 = r1.a((r32 & 1) != 0 ? r1.f75426a : null, (r32 & 2) != 0 ? r1.f75427b : null, (r32 & 4) != 0 ? r1.f75428c : null, (r32 & 8) != 0 ? r1.f75429d : null, (r32 & 16) != 0 ? r1.f75430e : null, (r32 & 32) != 0 ? r1.f75431f : null, (r32 & 64) != 0 ? r1.f75432g : null, (r32 & 128) != 0 ? r1.f75433h : false, (r32 & 256) != 0 ? r1.f75434i : z11, (r32 & 512) != 0 ? r1.f75435j : null, (r32 & 1024) != 0 ? r1.f75436k : null, (r32 & 2048) != 0 ? r1.f75437l : null, (r32 & 4096) != 0 ? r1.f75438m : null, (r32 & 8192) != 0 ? r1.f75439n : null, (r32 & 16384) != 0 ? this.f5595b.f75440o : null);
            this.f5595b = a11;
            return this;
        }

        @n(level = DeprecationLevel.ERROR, message = "Migrate to 'memoryCache'.", replaceWith = @w0(expression = "memoryCache { MemoryCache.Builder(context).maxSizePercent(percent).build() }", imports = {"coil.memory.MemoryCache"}))
        @k
        public final a f(@FloatRange(from = 0.0d, to = 1.0d) double d11) {
            u0.l.K();
            throw new KotlinNothingValueException();
        }

        @k
        public final a g(@k Bitmap.Config config) {
            o0.b a11;
            a11 = r1.a((r32 & 1) != 0 ? r1.f75426a : null, (r32 & 2) != 0 ? r1.f75427b : null, (r32 & 4) != 0 ? r1.f75428c : null, (r32 & 8) != 0 ? r1.f75429d : null, (r32 & 16) != 0 ? r1.f75430e : null, (r32 & 32) != 0 ? r1.f75431f : null, (r32 & 64) != 0 ? r1.f75432g : config, (r32 & 128) != 0 ? r1.f75433h : false, (r32 & 256) != 0 ? r1.f75434i : false, (r32 & 512) != 0 ? r1.f75435j : null, (r32 & 1024) != 0 ? r1.f75436k : null, (r32 & 2048) != 0 ? r1.f75437l : null, (r32 & 4096) != 0 ? r1.f75438m : null, (r32 & 8192) != 0 ? r1.f75439n : null, (r32 & 16384) != 0 ? this.f5595b.f75440o : null);
            this.f5595b = a11;
            return this;
        }

        @k
        public final a h(@k ExifOrientationPolicy exifOrientationPolicy) {
            this.f5601h = t.b(this.f5601h, false, false, false, 0, exifOrientationPolicy, 15, null);
            return this;
        }

        @k
        public final a i(int i11) {
            if (i11 <= 0) {
                throw new IllegalArgumentException("maxParallelism must be > 0.");
            }
            this.f5601h = t.b(this.f5601h, false, false, false, i11, null, 23, null);
            return this;
        }

        @k
        public final f j() {
            Context context = this.f5594a;
            o0.b bVar = this.f5595b;
            c0<? extends MemoryCache> c0Var = this.f5596c;
            if (c0Var == null) {
                c0Var = e0.c(new C0101a());
            }
            c0<? extends g0.a> c0Var2 = this.f5597d;
            if (c0Var2 == null) {
                c0Var2 = e0.c(new b());
            }
            c0<? extends b.a> c0Var3 = this.f5598e;
            if (c0Var3 == null) {
                c0Var3 = e0.c(c.f5605a);
            }
            c.d dVar = this.f5599f;
            if (dVar == null) {
                dVar = c.d.f5591b;
            }
            b0.b bVar2 = this.f5600g;
            if (bVar2 == null) {
                bVar2 = new b0.b();
            }
            return new i(context, bVar, c0Var, c0Var2, c0Var3, dVar, bVar2, this.f5601h, this.f5602i);
        }

        @k
        public final a k(@k b.a aVar) {
            this.f5598e = f0.e(aVar);
            return this;
        }

        @k
        public final a l(@k x00.a<? extends b.a> aVar) {
            this.f5598e = e0.c(aVar);
            return this;
        }

        @n(level = DeprecationLevel.ERROR, message = "Replace with 'components'.", replaceWith = @w0(expression = "components(registry)", imports = {}))
        @k
        public final a m(@k b0.b bVar) {
            u0.l.K();
            throw new KotlinNothingValueException();
        }

        @n(level = DeprecationLevel.ERROR, message = "Replace with 'components'.", replaceWith = @w0(expression = "components(builder)", imports = {}))
        public final /* synthetic */ a n(x00.l lVar) {
            u0.l.K();
            throw new KotlinNothingValueException();
        }

        @k
        public final a o(@k b0.b bVar) {
            this.f5600g = bVar;
            return this;
        }

        public final /* synthetic */ a p(x00.l<? super b.a, g2> lVar) {
            b.a aVar = new b.a();
            lVar.invoke(aVar);
            return o(aVar.i());
        }

        @k
        public final a q(int i11) {
            c.a aVar;
            if (i11 > 0) {
                aVar = new a.C1169a(i11, false, 2, null);
            } else {
                aVar = c.a.f89103b;
            }
            W(aVar);
            return this;
        }

        @k
        public final a r(boolean z11) {
            return q(z11 ? 100 : 0);
        }

        @k
        public final a s(@k m0 m0Var) {
            o0.b a11;
            a11 = r1.a((r32 & 1) != 0 ? r1.f75426a : null, (r32 & 2) != 0 ? r1.f75427b : null, (r32 & 4) != 0 ? r1.f75428c : m0Var, (r32 & 8) != 0 ? r1.f75429d : null, (r32 & 16) != 0 ? r1.f75430e : null, (r32 & 32) != 0 ? r1.f75431f : null, (r32 & 64) != 0 ? r1.f75432g : null, (r32 & 128) != 0 ? r1.f75433h : false, (r32 & 256) != 0 ? r1.f75434i : false, (r32 & 512) != 0 ? r1.f75435j : null, (r32 & 1024) != 0 ? r1.f75436k : null, (r32 & 2048) != 0 ? r1.f75437l : null, (r32 & 4096) != 0 ? r1.f75438m : null, (r32 & 8192) != 0 ? r1.f75439n : null, (r32 & 16384) != 0 ? this.f5595b.f75440o : null);
            this.f5595b = a11;
            return this;
        }

        @k
        public final a t(@l g0.a aVar) {
            this.f5597d = f0.e(aVar);
            return this;
        }

        @k
        public final a u(@k x00.a<? extends g0.a> aVar) {
            this.f5597d = e0.c(aVar);
            return this;
        }

        @k
        public final a v(@k CachePolicy cachePolicy) {
            o0.b a11;
            a11 = r1.a((r32 & 1) != 0 ? r1.f75426a : null, (r32 & 2) != 0 ? r1.f75427b : null, (r32 & 4) != 0 ? r1.f75428c : null, (r32 & 8) != 0 ? r1.f75429d : null, (r32 & 16) != 0 ? r1.f75430e : null, (r32 & 32) != 0 ? r1.f75431f : null, (r32 & 64) != 0 ? r1.f75432g : null, (r32 & 128) != 0 ? r1.f75433h : false, (r32 & 256) != 0 ? r1.f75434i : false, (r32 & 512) != 0 ? r1.f75435j : null, (r32 & 1024) != 0 ? r1.f75436k : null, (r32 & 2048) != 0 ? r1.f75437l : null, (r32 & 4096) != 0 ? r1.f75438m : null, (r32 & 8192) != 0 ? r1.f75439n : cachePolicy, (r32 & 16384) != 0 ? this.f5595b.f75440o : null);
            this.f5595b = a11;
            return this;
        }

        @k
        public final a w(@k m0 m0Var) {
            o0.b a11;
            a11 = r1.a((r32 & 1) != 0 ? r1.f75426a : null, (r32 & 2) != 0 ? r1.f75427b : m0Var, (r32 & 4) != 0 ? r1.f75428c : m0Var, (r32 & 8) != 0 ? r1.f75429d : m0Var, (r32 & 16) != 0 ? r1.f75430e : null, (r32 & 32) != 0 ? r1.f75431f : null, (r32 & 64) != 0 ? r1.f75432g : null, (r32 & 128) != 0 ? r1.f75433h : false, (r32 & 256) != 0 ? r1.f75434i : false, (r32 & 512) != 0 ? r1.f75435j : null, (r32 & 1024) != 0 ? r1.f75436k : null, (r32 & 2048) != 0 ? r1.f75437l : null, (r32 & 4096) != 0 ? r1.f75438m : null, (r32 & 8192) != 0 ? r1.f75439n : null, (r32 & 16384) != 0 ? this.f5595b.f75440o : null);
            this.f5595b = a11;
            return this;
        }

        @k
        public final a x(@DrawableRes int i11) {
            return y(u0.d.a(this.f5594a, i11));
        }

        @k
        public final a y(@l Drawable drawable) {
            o0.b a11;
            a11 = r1.a((r32 & 1) != 0 ? r1.f75426a : null, (r32 & 2) != 0 ? r1.f75427b : null, (r32 & 4) != 0 ? r1.f75428c : null, (r32 & 8) != 0 ? r1.f75429d : null, (r32 & 16) != 0 ? r1.f75430e : null, (r32 & 32) != 0 ? r1.f75431f : null, (r32 & 64) != 0 ? r1.f75432g : null, (r32 & 128) != 0 ? r1.f75433h : false, (r32 & 256) != 0 ? r1.f75434i : false, (r32 & 512) != 0 ? r1.f75435j : null, (r32 & 1024) != 0 ? r1.f75436k : drawable != null ? drawable.mutate() : null, (r32 & 2048) != 0 ? r1.f75437l : null, (r32 & 4096) != 0 ? r1.f75438m : null, (r32 & 8192) != 0 ? r1.f75439n : null, (r32 & 16384) != 0 ? this.f5595b.f75440o : null);
            this.f5595b = a11;
            return this;
        }

        @k
        public final a z(@k final b0.c cVar) {
            return B(new c.d() { // from class: b0.e
                @Override // b0.c.d
                public final c b(ImageRequest imageRequest) {
                    c A;
                    A = f.a.A(c.this, imageRequest);
                    return A;
                }
            });
        }

        public a(@k i iVar) {
            this.f5594a = iVar.m().getApplicationContext();
            this.f5595b = iVar.c();
            this.f5596c = iVar.s();
            this.f5597d = iVar.o();
            this.f5598e = iVar.k();
            this.f5599f = iVar.p();
            this.f5600g = iVar.l();
            this.f5601h = iVar.t();
            this.f5602i = iVar.q();
        }

        public static final b0.c A(b0.c cVar, ImageRequest imageRequest) {
            return cVar;
        }
    }
}

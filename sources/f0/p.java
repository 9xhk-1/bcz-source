package f0;

import android.graphics.Bitmap;
import android.graphics.Movie;
import c40.i2;
import f0.h;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.u0;
import l60.r0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class p implements h {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final a f50333d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final String f50334e = "coil#repeat_count";

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public static final String f50335f = "coil#animated_transformation";

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public static final String f50336g = "coil#animation_start_callback";

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public static final String f50337h = "coil#animation_end_callback";

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final k0 f50338a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final o0.j f50339b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f50340c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b implements h.a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f50341a;

        @w00.k
        public b() {
            this(false, 1, null);
        }

        @Override // f0.h.a
        @m80.l
        public h a(@m80.k i0.m mVar, @m80.k o0.j jVar, @m80.k b0.f fVar) {
            if (o.c(g.f50287a, mVar.e().k())) {
                return new p(mVar.e(), jVar, this.f50341a);
            }
            return null;
        }

        public boolean equals(@m80.l Object obj) {
            return obj instanceof b;
        }

        public int hashCode() {
            return b.class.hashCode();
        }

        @w00.k
        public b(boolean z11) {
            this.f50341a = z11;
        }

        public /* synthetic */ b(boolean z11, int i11, kotlin.jvm.internal.v vVar) {
            this((i11 & 1) != 0 ? true : z11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nGifDecoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GifDecoder.kt\ncoil/decode/GifDecoder$decode$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,93:1\n1#2:94\n*E\n"})
    public static final class c extends Lambda implements x00.a<f> {
        public c() {
            super(0);
        }

        @Override // x00.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final f invoke() {
            l60.m e11 = p.this.f50340c ? r0.e(new n(p.this.f50338a.k())) : p.this.f50338a.k();
            try {
                Movie decodeStream = Movie.decodeStream(e11.R8());
                r00.b.a(e11, null);
                if (decodeStream == null || decodeStream.width() <= 0 || decodeStream.height() <= 0) {
                    throw new IllegalStateException("Failed to decode GIF.");
                }
                h0.c cVar = new h0.c(decodeStream, (decodeStream.isOpaque() && p.this.f50339b.d()) ? Bitmap.Config.RGB_565 : u0.g.i(p.this.f50339b.f()) ? Bitmap.Config.ARGB_8888 : p.this.f50339b.f(), p.this.f50339b.o());
                Integer h11 = coil.request.a.h(p.this.f50339b.m());
                cVar.h(h11 != null ? h11.intValue() : -1);
                x00.a<g2> d11 = coil.request.a.d(p.this.f50339b.m());
                x00.a<g2> c11 = coil.request.a.c(p.this.f50339b.m());
                if (d11 != null || c11 != null) {
                    cVar.registerAnimationCallback(u0.g.c(d11, c11));
                }
                cVar.g(coil.request.a.b(p.this.f50339b.m()));
                return new f(cVar, false);
            } finally {
            }
        }
    }

    @w00.k
    public p(@m80.k k0 k0Var, @m80.k o0.j jVar) {
        this(k0Var, jVar, false, 4, null);
    }

    @Override // f0.h
    @m80.l
    public Object a(@m80.k j00.c<? super f> cVar) {
        return i2.c(null, new c(), cVar, 1, null);
    }

    @w00.k
    public p(@m80.k k0 k0Var, @m80.k o0.j jVar, boolean z11) {
        this.f50338a = k0Var;
        this.f50339b = jVar;
        this.f50340c = z11;
    }

    public /* synthetic */ p(k0 k0Var, o0.j jVar, boolean z11, int i11, kotlin.jvm.internal.v vVar) {
        this(k0Var, jVar, (i11 & 4) != 0 ? true : z11);
    }
}

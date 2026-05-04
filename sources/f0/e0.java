package f0;

import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Size;
import androidx.annotation.RequiresApi;
import c40.r0;
import f0.h;
import f0.k0;
import java.nio.ByteBuffer;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.u0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(28)
/* loaded from: classes3.dex */
public final class e0 implements h {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final k0 f50262a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final o0.j f50263b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f50264c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements h.a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f50265a;

        @w00.k
        public a() {
            this(false, 1, null);
        }

        @Override // f0.h.a
        @m80.l
        public h a(@m80.k i0.m mVar, @m80.k o0.j jVar, @m80.k b0.f fVar) {
            if (b(mVar.e().k())) {
                return new e0(mVar.e(), jVar, this.f50265a);
            }
            return null;
        }

        public final boolean b(l60.m mVar) {
            g gVar = g.f50287a;
            if (o.c(gVar, mVar) || o.b(gVar, mVar)) {
                return true;
            }
            return Build.VERSION.SDK_INT >= 30 && o.a(gVar, mVar);
        }

        public boolean equals(@m80.l Object obj) {
            return obj instanceof a;
        }

        public int hashCode() {
            return a.class.hashCode();
        }

        @w00.k
        public a(boolean z11) {
            this.f50265a = z11;
        }

        public /* synthetic */ a(boolean z11, int i11, kotlin.jvm.internal.v vVar) {
            this((i11 & 1) != 0 ? true : z11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "coil.decode.ImageDecoderDecoder", f = "ImageDecoderDecoder.kt", i = {0, 0, 1}, l = {50, 90}, m = "decode", n = {"this", "isSampled", "isSampled"}, s = {"L$0", "L$1", "L$0"})
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f50266a;

        /* renamed from: b, reason: collision with root package name */
        public Object f50267b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f50268c;

        /* renamed from: e, reason: collision with root package name */
        public int f50270e;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f50268c = obj;
            this.f50270e |= Integer.MIN_VALUE;
            return e0.this.a(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nImageDecoderDecoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageDecoderDecoder.kt\ncoil/decode/ImageDecoderDecoder$decode$drawable$1\n+ 2 ImageDecoder.kt\nandroidx/core/graphics/ImageDecoderKt\n*L\n1#1,187:1\n52#2:188\n*S KotlinDebug\n*F\n+ 1 ImageDecoderDecoder.kt\ncoil/decode/ImageDecoderDecoder$decode$drawable$1\n*L\n54#1:188\n*E\n"})
    public static final class c extends Lambda implements x00.a<Drawable> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Ref.BooleanRef f50272b;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u0({"SMAP\nImageDecoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageDecoder.kt\nandroidx/core/graphics/ImageDecoderKt$decodeDrawable$1\n+ 2 ImageDecoderDecoder.kt\ncoil/decode/ImageDecoderDecoder$decode$drawable$1\n+ 3 Size.kt\nandroidx/core/util/SizeKt\n+ 4 Utils.kt\ncoil/util/-GifUtils\n*L\n1#1,56:1\n56#2,4:57\n60#2:63\n61#2:65\n62#2,23:67\n37#3:61\n49#3:62\n59#4:64\n63#4:66\n*S KotlinDebug\n*F\n+ 1 ImageDecoderDecoder.kt\ncoil/decode/ImageDecoderDecoder$decode$drawable$1\n*L\n59#1:61\n59#1:62\n60#1:64\n61#1:66\n*E\n"})
        public static final class a implements ImageDecoder$OnHeaderDecodedListener {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Ref.ObjectRef f50273a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e0 f50274b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Ref.BooleanRef f50275c;

            public a(Ref.ObjectRef objectRef, e0 e0Var, Ref.BooleanRef booleanRef) {
                this.f50273a = objectRef;
                this.f50274b = e0Var;
                this.f50275c = booleanRef;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final void onHeaderDecoded(@m80.k ImageDecoder imageDecoder, @m80.k ImageDecoder.ImageInfo imageInfo, @m80.k ImageDecoder.Source source) {
                Size size;
                this.f50273a.element = imageDecoder;
                size = imageInfo.getSize();
                int width = size.getWidth();
                int height = size.getHeight();
                q0.g p11 = this.f50274b.f50263b.p();
                int j11 = q0.b.f(p11) ? width : u0.g.j(p11.f(), this.f50274b.f50263b.o());
                q0.g p12 = this.f50274b.f50263b.p();
                int j12 = q0.b.f(p12) ? height : u0.g.j(p12.e(), this.f50274b.f50263b.o());
                if (width > 0 && height > 0 && (width != j11 || height != j12)) {
                    double c11 = g.c(width, height, j11, j12, this.f50274b.f50263b.o());
                    Ref.BooleanRef booleanRef = this.f50275c;
                    boolean z11 = c11 < 1.0d;
                    booleanRef.element = z11;
                    if (z11 || !this.f50274b.f50263b.c()) {
                        imageDecoder.setTargetSize(c10.d.K0(width * c11), c10.d.K0(c11 * height));
                    }
                }
                this.f50274b.h(imageDecoder);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Ref.BooleanRef booleanRef) {
            super(0);
            this.f50272b = booleanRef;
        }

        @Override // x00.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Drawable invoke() {
            Drawable decodeDrawable;
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            e0 e0Var = e0.this;
            k0 k11 = e0Var.k(e0Var.f50262a);
            try {
                decodeDrawable = ImageDecoder.decodeDrawable(e0.this.i(k11), androidx.core.graphics.r.a(new a(objectRef, e0.this, this.f50272b)));
                return decodeDrawable;
            } finally {
                ImageDecoder a11 = f0.a(objectRef.element);
                if (a11 != null) {
                    a11.close();
                }
                k11.close();
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "coil.decode.ImageDecoderDecoder", f = "ImageDecoderDecoder.kt", i = {0, 0}, l = {158}, m = "wrapDrawable", n = {"this", "baseDrawable"}, s = {"L$0", "L$1"})
    public static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f50276a;

        /* renamed from: b, reason: collision with root package name */
        public Object f50277b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f50278c;

        /* renamed from: e, reason: collision with root package name */
        public int f50280e;

        public d(j00.c<? super d> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f50278c = obj;
            this.f50280e |= Integer.MIN_VALUE;
            return e0.this.j(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "coil.decode.ImageDecoderDecoder$wrapDrawable$2", f = "ImageDecoderDecoder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f50281a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Drawable f50282b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x00.a<g2> f50283c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ x00.a<g2> f50284d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Drawable drawable, x00.a<g2> aVar, x00.a<g2> aVar2, j00.c<? super e> cVar) {
            super(2, cVar);
            this.f50282b = drawable;
            this.f50283c = aVar;
            this.f50284d = aVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.k
        public final j00.c<g2> create(@m80.l Object obj, @m80.k j00.c<?> cVar) {
            return new e(this.f50282b, this.f50283c, this.f50284d, cVar);
        }

        @Override // x00.p
        @m80.l
        public final Object invoke(@m80.k r0 r0Var, @m80.l j00.c<? super g2> cVar) {
            return ((e) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f50281a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            v.a(this.f50282b).registerAnimationCallback(u0.g.b(this.f50283c, this.f50284d));
            return g2.f100423a;
        }
    }

    @w00.k
    public e0(@m80.k k0 k0Var, @m80.k o0.j jVar) {
        this(k0Var, jVar, false, 4, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // f0.h
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@m80.k j00.c<? super f0.f> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof f0.e0.b
            if (r0 == 0) goto L13
            r0 = r7
            f0.e0$b r0 = (f0.e0.b) r0
            int r1 = r0.f50270e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f50270e = r1
            goto L18
        L13:
            f0.e0$b r0 = new f0.e0$b
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f50268c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f50270e
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L45
            if (r2 == r5) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r0 = r0.f50266a
            kotlin.jvm.internal.Ref$BooleanRef r0 = (kotlin.jvm.internal.Ref.BooleanRef) r0
            kotlin.e.n(r7)
            goto L73
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L39:
            java.lang.Object r2 = r0.f50267b
            kotlin.jvm.internal.Ref$BooleanRef r2 = (kotlin.jvm.internal.Ref.BooleanRef) r2
            java.lang.Object r5 = r0.f50266a
            f0.e0 r5 = (f0.e0) r5
            kotlin.e.n(r7)
            goto L63
        L45:
            kotlin.e.n(r7)
            kotlin.jvm.internal.Ref$BooleanRef r7 = new kotlin.jvm.internal.Ref$BooleanRef
            r7.<init>()
            f0.e0$c r2 = new f0.e0$c
            r2.<init>(r7)
            r0.f50266a = r6
            r0.f50267b = r7
            r0.f50270e = r5
            java.lang.Object r2 = c40.i2.c(r4, r2, r0, r5, r4)
            if (r2 != r1) goto L5f
            goto L71
        L5f:
            r5 = r2
            r2 = r7
            r7 = r5
            r5 = r6
        L63:
            android.graphics.drawable.Drawable r7 = (android.graphics.drawable.Drawable) r7
            r0.f50266a = r2
            r0.f50267b = r4
            r0.f50270e = r3
            java.lang.Object r7 = r5.j(r7, r0)
            if (r7 != r1) goto L72
        L71:
            return r1
        L72:
            r0 = r2
        L73:
            android.graphics.drawable.Drawable r7 = (android.graphics.drawable.Drawable) r7
            boolean r0 = r0.element
            f0.f r1 = new f0.f
            r1.<init>(r7, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.e0.a(j00.c):java.lang.Object");
    }

    public final void h(ImageDecoder imageDecoder) {
        imageDecoder.setAllocator(u0.g.i(this.f50263b.f()) ? 3 : 1);
        imageDecoder.setMemorySizePolicy(!this.f50263b.d() ? 1 : 0);
        if (this.f50263b.e() != null) {
            imageDecoder.setTargetColorSpace(this.f50263b.e());
        }
        imageDecoder.setUnpremultipliedRequired(!this.f50263b.n());
        s0.a b11 = coil.request.a.b(this.f50263b.m());
        imageDecoder.setPostProcessor(b11 != null ? u0.g.d(b11) : null);
    }

    public final ImageDecoder.Source i(k0 k0Var) {
        ImageDecoder.Source createSource;
        ImageDecoder.Source createSource2;
        ImageDecoder.Source createSource3;
        ImageDecoder.Source createSource4;
        ImageDecoder.Source createSource5;
        ImageDecoder.Source createSource6;
        ImageDecoder.Source createSource7;
        okio.f c11 = k0Var.c();
        if (c11 != null) {
            createSource7 = ImageDecoder.createSource(c11.toFile());
            return createSource7;
        }
        k0.a f11 = k0Var.f();
        if (f11 instanceof f0.a) {
            createSource6 = ImageDecoder.createSource(this.f50263b.g().getAssets(), ((f0.a) f11).c());
            return createSource6;
        }
        if (f11 instanceof f0.e) {
            createSource5 = ImageDecoder.createSource(this.f50263b.g().getContentResolver(), ((f0.e) f11).a());
            return createSource5;
        }
        if (f11 instanceof m0) {
            m0 m0Var = (m0) f11;
            if (kotlin.jvm.internal.g0.g(m0Var.b(), this.f50263b.g().getPackageName())) {
                createSource4 = ImageDecoder.createSource(this.f50263b.g().getResources(), m0Var.c());
                return createSource4;
            }
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 31) {
            createSource3 = ImageDecoder.createSource(k0Var.k().w2());
            return createSource3;
        }
        if (i11 == 30) {
            createSource2 = ImageDecoder.createSource(ByteBuffer.wrap(k0Var.k().w2()));
            return createSource2;
        }
        createSource = ImageDecoder.createSource(k0Var.a().toFile());
        return createSource;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(android.graphics.drawable.Drawable r8, j00.c<? super android.graphics.drawable.Drawable> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof f0.e0.d
            if (r0 == 0) goto L13
            r0 = r9
            f0.e0$d r0 = (f0.e0.d) r0
            int r1 = r0.f50280e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f50280e = r1
            goto L18
        L13:
            f0.e0$d r0 = new f0.e0$d
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f50278c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f50280e
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r8 = r0.f50277b
            android.graphics.drawable.Drawable r8 = (android.graphics.drawable.Drawable) r8
            java.lang.Object r0 = r0.f50276a
            f0.e0 r0 = (f0.e0) r0
            kotlin.e.n(r9)
            goto L92
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            kotlin.e.n(r9)
            boolean r9 = f0.q.a(r8)
            if (r9 != 0) goto L43
            return r8
        L43:
            android.graphics.drawable.AnimatedImageDrawable r9 = f0.v.a(r8)
            o0.j r2 = r7.f50263b
            coil.request.b r2 = r2.m()
            java.lang.Integer r2 = coil.request.a.h(r2)
            if (r2 == 0) goto L58
            int r2 = r2.intValue()
            goto L59
        L58:
            r2 = -1
        L59:
            f0.w.a(r9, r2)
            o0.j r9 = r7.f50263b
            coil.request.b r9 = r9.m()
            x00.a r9 = coil.request.a.d(r9)
            o0.j r2 = r7.f50263b
            coil.request.b r2 = r2.m()
            x00.a r2 = coil.request.a.c(r2)
            if (r9 != 0) goto L77
            if (r2 == 0) goto L75
            goto L77
        L75:
            r0 = r7
            goto L92
        L77:
            c40.v2 r4 = c40.h1.e()
            c40.v2 r4 = r4.q()
            f0.e0$e r5 = new f0.e0$e
            r6 = 0
            r5.<init>(r8, r9, r2, r6)
            r0.f50276a = r7
            r0.f50277b = r8
            r0.f50280e = r3
            java.lang.Object r9 = c40.i.h(r4, r5, r0)
            if (r9 != r1) goto L75
            return r1
        L92:
            h0.d r9 = new h0.d
            o0.j r0 = r0.f50263b
            coil.size.Scale r0 = r0.o()
            r9.<init>(r8, r0)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.e0.j(android.graphics.drawable.Drawable, j00.c):java.lang.Object");
    }

    public final k0 k(k0 k0Var) {
        return (this.f50264c && o.c(g.f50287a, k0Var.k())) ? l0.a(l60.r0.e(new n(k0Var.k())), this.f50263b.g()) : k0Var;
    }

    @w00.k
    public e0(@m80.k k0 k0Var, @m80.k o0.j jVar, boolean z11) {
        this.f50262a = k0Var;
        this.f50263b = jVar;
        this.f50264c = z11;
    }

    public /* synthetic */ e0(k0 k0Var, o0.j jVar, boolean z11, int i11, kotlin.jvm.internal.v vVar) {
        this(k0Var, jVar, (i11 & 4) != 0 ? true : z11);
    }
}

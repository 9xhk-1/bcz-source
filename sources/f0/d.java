package f0;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import coil.decode.ExifOrientationPolicy;
import com.jiongji.andriod.card.R;
import f0.h;
import f0.k0;
import kotlin.DeprecationLevel;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.u0;
import l60.g1;
import l60.r0;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nBitmapFactoryDecoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BitmapFactoryDecoder.kt\ncoil/decode/BitmapFactoryDecoder\n+ 2 Semaphore.kt\nkotlinx/coroutines/sync/SemaphoreKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Bitmaps.kt\ncoil/util/-Bitmaps\n+ 5 BitmapDrawable.kt\nandroidx/core/graphics/drawable/BitmapDrawableKt\n+ 6 Utils.kt\ncoil/util/-Utils\n*L\n1#1,227:1\n82#2,9:228\n1#3:237\n50#4:238\n28#5:239\n219#6:240\n223#6:241\n*S KotlinDebug\n*F\n+ 1 BitmapFactoryDecoder.kt\ncoil/decode/BitmapFactoryDecoder\n*L\n45#1:228,9\n92#1:238\n92#1:239\n144#1:240\n145#1:241\n*E\n"})
/* loaded from: classes3.dex */
public final class d implements h {

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final a f50246e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    public static final int f50247f = 4;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final k0 f50248a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final o0.j f50249b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final n40.h f50250c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final ExifOrientationPolicy f50251d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends l60.w {

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Exception f50252b;

        public b(@m80.k g1 g1Var) {
            super(g1Var);
        }

        @Override // l60.w, l60.g1
        public long L3(@m80.k l60.k kVar, long j11) {
            try {
                return super.L3(kVar, j11);
            } catch (Exception e11) {
                this.f50252b = e11;
                throw e11;
            }
        }

        @m80.l
        public final Exception m() {
            return this.f50252b;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "coil.decode.BitmapFactoryDecoder", f = "BitmapFactoryDecoder.kt", i = {0, 0, 1}, l = {R.styleable.Theme_drawable_tab_home, 46}, m = "decode", n = {"this", "$this$withPermit$iv", "$this$withPermit$iv"}, s = {"L$0", "L$1", "L$0"})
    /* renamed from: f0.d$d, reason: collision with other inner class name */
    public static final class C0602d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f50255a;

        /* renamed from: b, reason: collision with root package name */
        public Object f50256b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f50257c;

        /* renamed from: e, reason: collision with root package name */
        public int f50259e;

        public C0602d(j00.c<? super C0602d> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f50257c = obj;
            this.f50259e |= Integer.MIN_VALUE;
            return d.this.a(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class e extends Lambda implements x00.a<f> {
        public e() {
            super(0);
        }

        @Override // x00.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final f invoke() {
            return d.this.e(new BitmapFactory.Options());
        }
    }

    public d(@m80.k k0 k0Var, @m80.k o0.j jVar, @m80.k n40.h hVar, @m80.k ExifOrientationPolicy exifOrientationPolicy) {
        this.f50248a = k0Var;
        this.f50249b = jVar;
        this.f50250c = hVar;
        this.f50251d = exifOrientationPolicy;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // f0.h
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@m80.k j00.c<? super f0.f> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof f0.d.C0602d
            if (r0 == 0) goto L13
            r0 = r8
            f0.d$d r0 = (f0.d.C0602d) r0
            int r1 = r0.f50259e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f50259e = r1
            goto L18
        L13:
            f0.d$d r0 = new f0.d$d
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f50257c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f50259e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L47
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r0 = r0.f50255a
            n40.h r0 = (n40.h) r0
            kotlin.e.n(r8)     // Catch: java.lang.Throwable -> L30
            goto L70
        L30:
            r8 = move-exception
            goto L7a
        L32:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3a:
            java.lang.Object r2 = r0.f50256b
            n40.h r2 = (n40.h) r2
            java.lang.Object r5 = r0.f50255a
            f0.d r5 = (f0.d) r5
            kotlin.e.n(r8)
            r8 = r2
            goto L5a
        L47:
            kotlin.e.n(r8)
            n40.h r8 = r7.f50250c
            r0.f50255a = r7
            r0.f50256b = r8
            r0.f50259e = r4
            java.lang.Object r2 = r8.a(r0)
            if (r2 != r1) goto L59
            goto L6c
        L59:
            r5 = r7
        L5a:
            f0.d$e r2 = new f0.d$e     // Catch: java.lang.Throwable -> L76
            r2.<init>()     // Catch: java.lang.Throwable -> L76
            r0.f50255a = r8     // Catch: java.lang.Throwable -> L76
            r5 = 0
            r0.f50256b = r5     // Catch: java.lang.Throwable -> L76
            r0.f50259e = r3     // Catch: java.lang.Throwable -> L76
            java.lang.Object r0 = c40.i2.c(r5, r2, r0, r4, r5)     // Catch: java.lang.Throwable -> L76
            if (r0 != r1) goto L6d
        L6c:
            return r1
        L6d:
            r6 = r0
            r0 = r8
            r8 = r6
        L70:
            f0.f r8 = (f0.f) r8     // Catch: java.lang.Throwable -> L30
            r0.release()
            return r8
        L76:
            r0 = move-exception
            r6 = r0
            r0 = r8
            r8 = r6
        L7a:
            r0.release()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.d.a(j00.c):java.lang.Object");
    }

    public final void c(BitmapFactory.Options options, i iVar) {
        Bitmap.Config config;
        Bitmap.Config config2;
        Bitmap.Config config3;
        Bitmap.Config f11 = this.f50249b.f();
        if (iVar.b() || l.a(iVar)) {
            f11 = u0.a.h(f11);
        }
        if (this.f50249b.d() && f11 == Bitmap.Config.ARGB_8888 && kotlin.jvm.internal.g0.g(options.outMimeType, "image/jpeg")) {
            f11 = Bitmap.Config.RGB_565;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            config = options.outConfig;
            config2 = Bitmap.Config.RGBA_F16;
            if (config == config2) {
                config3 = Bitmap.Config.HARDWARE;
                if (f11 != config3) {
                    f11 = Bitmap.Config.RGBA_F16;
                }
            }
        }
        options.inPreferredConfig = f11;
    }

    public final void d(BitmapFactory.Options options, i iVar) {
        k0.a f11 = this.f50248a.f();
        if ((f11 instanceof m0) && q0.b.f(this.f50249b.p())) {
            options.inSampleSize = 1;
            options.inScaled = true;
            options.inDensity = ((m0) f11).a();
            options.inTargetDensity = this.f50249b.g().getResources().getDisplayMetrics().densityDpi;
            return;
        }
        if (options.outWidth <= 0 || options.outHeight <= 0) {
            options.inSampleSize = 1;
            options.inScaled = false;
            return;
        }
        int i11 = l.b(iVar) ? options.outHeight : options.outWidth;
        int i12 = l.b(iVar) ? options.outWidth : options.outHeight;
        q0.g p11 = this.f50249b.p();
        int J = q0.b.f(p11) ? i11 : u0.l.J(p11.f(), this.f50249b.o());
        q0.g p12 = this.f50249b.p();
        int J2 = q0.b.f(p12) ? i12 : u0.l.J(p12.e(), this.f50249b.o());
        int a11 = g.a(i11, i12, J, J2, this.f50249b.o());
        options.inSampleSize = a11;
        double b11 = g.b(i11 / a11, i12 / a11, J, J2, this.f50249b.o());
        if (this.f50249b.c()) {
            b11 = g10.u.z(b11, 1.0d);
        }
        boolean z11 = b11 == 1.0d;
        options.inScaled = !z11;
        if (z11) {
            return;
        }
        if (b11 > 1.0d) {
            options.inDensity = c10.d.K0(Integer.MAX_VALUE / b11);
            options.inTargetDensity = Integer.MAX_VALUE;
        } else {
            options.inDensity = Integer.MAX_VALUE;
            options.inTargetDensity = c10.d.K0(Integer.MAX_VALUE * b11);
        }
    }

    public final f e(BitmapFactory.Options options) {
        b bVar = new b(this.f50248a.k());
        l60.m e11 = r0.e(bVar);
        boolean z11 = true;
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(e11.peek().R8(), null, options);
        Exception m11 = bVar.m();
        if (m11 != null) {
            throw m11;
        }
        options.inJustDecodeBounds = false;
        k kVar = k.f50295a;
        i a11 = kVar.a(options.outMimeType, e11, this.f50251d);
        Exception m12 = bVar.m();
        if (m12 != null) {
            throw m12;
        }
        options.inMutable = false;
        if (Build.VERSION.SDK_INT >= 26 && this.f50249b.e() != null) {
            options.inPreferredColorSpace = this.f50249b.e();
        }
        options.inPremultiplied = this.f50249b.n();
        c(options, a11);
        d(options, a11);
        try {
            Bitmap decodeStream = BitmapFactory.decodeStream(e11.R8(), null, options);
            r00.b.a(e11, null);
            Exception m13 = bVar.m();
            if (m13 != null) {
                throw m13;
            }
            if (decodeStream == null) {
                throw new IllegalStateException("BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the input source (e.g. network, disk, or memory) as it's not encoded as a valid image format.");
            }
            decodeStream.setDensity(this.f50249b.g().getResources().getDisplayMetrics().densityDpi);
            BitmapDrawable bitmapDrawable = new BitmapDrawable(this.f50249b.g().getResources(), kVar.b(decodeStream, a11));
            if (options.inSampleSize <= 1 && !options.inScaled) {
                z11 = false;
            }
            return new f(bitmapDrawable, z11);
        } finally {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements h.a {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final ExifOrientationPolicy f50253a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final n40.h f50254b;

        public c(int i11, @m80.k ExifOrientationPolicy exifOrientationPolicy) {
            this.f50253a = exifOrientationPolicy;
            this.f50254b = n40.l.b(i11, 0, 2, null);
        }

        @Override // f0.h.a
        @m80.k
        public h a(@m80.k i0.m mVar, @m80.k o0.j jVar, @m80.k b0.f fVar) {
            return new d(mVar.e(), jVar, this.f50254b, this.f50253a);
        }

        public boolean equals(@m80.l Object obj) {
            return obj instanceof c;
        }

        public int hashCode() {
            return c.class.hashCode();
        }

        public /* synthetic */ c(int i11, ExifOrientationPolicy exifOrientationPolicy, int i12, kotlin.jvm.internal.v vVar) {
            this((i12 & 1) != 0 ? 4 : i11, (i12 & 2) != 0 ? ExifOrientationPolicy.RESPECT_PERFORMANCE : exifOrientationPolicy);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @y0(version = "999.9")
        public c() {
            this(0, null, 3, 0 == true ? 1 : 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @yz.n(level = DeprecationLevel.HIDDEN, message = "Kept for binary compatibility.")
        public /* synthetic */ c(int i11) {
            this(i11, null, 2, 0 == true ? 1 : 0);
        }

        public /* synthetic */ c(int i11, int i12, kotlin.jvm.internal.v vVar) {
            this((i12 & 1) != 0 ? 4 : i11);
        }
    }

    public /* synthetic */ d(k0 k0Var, o0.j jVar, n40.h hVar, ExifOrientationPolicy exifOrientationPolicy, int i11, kotlin.jvm.internal.v vVar) {
        this(k0Var, jVar, (i11 & 4) != 0 ? n40.l.b(Integer.MAX_VALUE, 0, 2, null) : hVar, (i11 & 8) != 0 ? ExifOrientationPolicy.RESPECT_PERFORMANCE : exifOrientationPolicy);
    }

    @yz.n(level = DeprecationLevel.HIDDEN, message = "Kept for binary compatibility.")
    public /* synthetic */ d(k0 k0Var, o0.j jVar) {
        this(k0Var, jVar, null, null, 12, null);
    }

    public /* synthetic */ d(k0 k0Var, o0.j jVar, n40.h hVar, int i11, kotlin.jvm.internal.v vVar) {
        this(k0Var, jVar, (i11 & 4) != 0 ? n40.l.b(Integer.MAX_VALUE, 0, 2, null) : hVar);
    }

    @yz.n(level = DeprecationLevel.HIDDEN, message = "Kept for binary compatibility.")
    public /* synthetic */ d(k0 k0Var, o0.j jVar, n40.h hVar) {
        this(k0Var, jVar, hVar, null, 8, null);
    }
}

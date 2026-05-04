package coil.compose;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.BitmapPainterKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import c40.h1;
import c40.l3;
import c40.r0;
import c40.s0;
import coil.compose.a;
import coil.request.ImageRequest;
import coil.size.Precision;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import kotlinx.coroutines.flow.o0;
import kotlinx.coroutines.flow.y;
import t0.c;
import yz.g2;
import yz.w;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Stable
@u0({"SMAP\nAsyncImagePainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AsyncImagePainter.kt\ncoil/compose/AsyncImagePainter\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 ImageRequest.kt\ncoil/request/ImageRequest$Builder\n*L\n1#1,474:1\n81#2:475\n107#2,2:476\n81#2:481\n107#2,2:482\n81#2:484\n107#2,2:485\n81#2:487\n107#2,2:488\n81#2:490\n107#2,2:491\n76#3:478\n109#3,2:479\n1#4:493\n845#5,9:494\n*S KotlinDebug\n*F\n+ 1 AsyncImagePainter.kt\ncoil/compose/AsyncImagePainter\n*L\n228#1:475\n228#1:476,2\n230#1:481\n230#1:482,2\n252#1:484\n252#1:485,2\n256#1:487\n256#1:488,2\n260#1:490\n260#1:491,2\n229#1:478\n229#1:479,2\n329#1:494,9\n*E\n"})
/* loaded from: classes3.dex */
public final class AsyncImagePainter extends Painter implements RememberObserver {

    /* renamed from: q, reason: collision with root package name */
    public static final int f9552q = 0;

    /* renamed from: a, reason: collision with root package name */
    @m80.l
    public r0 f9554a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final y<Size> f9555b = o0.a(Size.m2325boximpl(Size.Companion.m2346getZeroNHjbRc()));

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final MutableState f9556c = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final MutableFloatState f9557d = PrimitiveSnapshotStateKt.mutableFloatStateOf(1.0f);

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final MutableState f9558e = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public c f9559f;

    /* renamed from: g, reason: collision with root package name */
    @m80.l
    public Painter f9560g;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public x00.l<? super c, ? extends c> f9561h;

    /* renamed from: i, reason: collision with root package name */
    @m80.l
    public x00.l<? super c, g2> f9562i;

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public ContentScale f9563j;

    /* renamed from: k, reason: collision with root package name */
    public int f9564k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f9565l;

    /* renamed from: m, reason: collision with root package name */
    @m80.k
    public final MutableState f9566m;

    /* renamed from: n, reason: collision with root package name */
    @m80.k
    public final MutableState f9567n;

    /* renamed from: o, reason: collision with root package name */
    @m80.k
    public final MutableState f9568o;

    /* renamed from: p, reason: collision with root package name */
    @m80.k
    public static final b f9551p = new b(null);

    /* renamed from: r, reason: collision with root package name */
    @m80.k
    public static final x00.l<c, c> f9553r = a.f9571a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(v vVar) {
            this();
        }

        @m80.k
        public final x00.l<c, c> a() {
            return AsyncImagePainter.f9553r;
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static abstract class c {

        /* renamed from: a, reason: collision with root package name */
        public static final int f9572a = 0;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @StabilityInferred(parameters = 1)
        public static final class a extends c {

            /* renamed from: b, reason: collision with root package name */
            @m80.k
            public static final a f9573b = new a();

            /* renamed from: c, reason: collision with root package name */
            public static final int f9574c = 0;

            public a() {
                super(null);
            }

            @Override // coil.compose.AsyncImagePainter.c
            @m80.l
            public Painter a() {
                return null;
            }

            public boolean equals(@m80.l Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return -1515560141;
            }

            @m80.k
            public String toString() {
                return "Empty";
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @StabilityInferred(parameters = 0)
        public static final class b extends c {

            /* renamed from: d, reason: collision with root package name */
            public static final int f9575d = 8;

            /* renamed from: b, reason: collision with root package name */
            @m80.l
            public final Painter f9576b;

            /* renamed from: c, reason: collision with root package name */
            @m80.k
            public final o0.e f9577c;

            public b(@m80.l Painter painter, @m80.k o0.e eVar) {
                super(null);
                this.f9576b = painter;
                this.f9577c = eVar;
            }

            public static /* synthetic */ b e(b bVar, Painter painter, o0.e eVar, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    painter = bVar.f9576b;
                }
                if ((i11 & 2) != 0) {
                    eVar = bVar.f9577c;
                }
                return bVar.d(painter, eVar);
            }

            @Override // coil.compose.AsyncImagePainter.c
            @m80.l
            public Painter a() {
                return this.f9576b;
            }

            @m80.l
            public final Painter b() {
                return this.f9576b;
            }

            @m80.k
            public final o0.e c() {
                return this.f9577c;
            }

            @m80.k
            public final b d(@m80.l Painter painter, @m80.k o0.e eVar) {
                return new b(painter, eVar);
            }

            public boolean equals(@m80.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return g0.g(this.f9576b, bVar.f9576b) && g0.g(this.f9577c, bVar.f9577c);
            }

            @m80.k
            public final o0.e f() {
                return this.f9577c;
            }

            public int hashCode() {
                Painter painter = this.f9576b;
                return ((painter == null ? 0 : painter.hashCode()) * 31) + this.f9577c.hashCode();
            }

            @m80.k
            public String toString() {
                return "Error(painter=" + this.f9576b + ", result=" + this.f9577c + ')';
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @StabilityInferred(parameters = 0)
        /* renamed from: coil.compose.AsyncImagePainter$c$c, reason: collision with other inner class name */
        public static final class C0153c extends c {

            /* renamed from: c, reason: collision with root package name */
            public static final int f9578c = 8;

            /* renamed from: b, reason: collision with root package name */
            @m80.l
            public final Painter f9579b;

            public C0153c(@m80.l Painter painter) {
                super(null);
                this.f9579b = painter;
            }

            public static /* synthetic */ C0153c d(C0153c c0153c, Painter painter, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    painter = c0153c.f9579b;
                }
                return c0153c.c(painter);
            }

            @Override // coil.compose.AsyncImagePainter.c
            @m80.l
            public Painter a() {
                return this.f9579b;
            }

            @m80.l
            public final Painter b() {
                return this.f9579b;
            }

            @m80.k
            public final C0153c c(@m80.l Painter painter) {
                return new C0153c(painter);
            }

            public boolean equals(@m80.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0153c) && g0.g(this.f9579b, ((C0153c) obj).f9579b);
            }

            public int hashCode() {
                Painter painter = this.f9579b;
                if (painter == null) {
                    return 0;
                }
                return painter.hashCode();
            }

            @m80.k
            public String toString() {
                return "Loading(painter=" + this.f9579b + ')';
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @StabilityInferred(parameters = 0)
        public static final class d extends c {

            /* renamed from: d, reason: collision with root package name */
            public static final int f9580d = 8;

            /* renamed from: b, reason: collision with root package name */
            @m80.k
            public final Painter f9581b;

            /* renamed from: c, reason: collision with root package name */
            @m80.k
            public final o0.m f9582c;

            public d(@m80.k Painter painter, @m80.k o0.m mVar) {
                super(null);
                this.f9581b = painter;
                this.f9582c = mVar;
            }

            public static /* synthetic */ d e(d dVar, Painter painter, o0.m mVar, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    painter = dVar.f9581b;
                }
                if ((i11 & 2) != 0) {
                    mVar = dVar.f9582c;
                }
                return dVar.d(painter, mVar);
            }

            @Override // coil.compose.AsyncImagePainter.c
            @m80.k
            public Painter a() {
                return this.f9581b;
            }

            @m80.k
            public final Painter b() {
                return this.f9581b;
            }

            @m80.k
            public final o0.m c() {
                return this.f9582c;
            }

            @m80.k
            public final d d(@m80.k Painter painter, @m80.k o0.m mVar) {
                return new d(painter, mVar);
            }

            public boolean equals(@m80.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return g0.g(this.f9581b, dVar.f9581b) && g0.g(this.f9582c, dVar.f9582c);
            }

            @m80.k
            public final o0.m f() {
                return this.f9582c;
            }

            public int hashCode() {
                return (this.f9581b.hashCode() * 31) + this.f9582c.hashCode();
            }

            @m80.k
            public String toString() {
                return "Success(painter=" + this.f9581b + ", result=" + this.f9582c + ')';
            }
        }

        public /* synthetic */ c(v vVar) {
            this();
        }

        @m80.l
        public abstract Painter a();

        public c() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "coil.compose.AsyncImagePainter$onRemembered$1", f = "AsyncImagePainter.kt", i = {}, l = {307}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f9583a;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class a extends Lambda implements x00.a<ImageRequest> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ AsyncImagePainter f9585a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(AsyncImagePainter asyncImagePainter) {
                super(0);
                this.f9585a = asyncImagePainter;
            }

            @Override // x00.a
            @m80.k
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ImageRequest invoke() {
                return this.f9585a.o();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "coil.compose.AsyncImagePainter$onRemembered$1$2", f = "AsyncImagePainter.kt", i = {}, l = {306}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements x00.p<ImageRequest, j00.c<? super c>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f9586a;

            /* renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f9587b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ AsyncImagePainter f9588c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(AsyncImagePainter asyncImagePainter, j00.c<? super b> cVar) {
                super(2, cVar);
                this.f9588c = asyncImagePainter;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @m80.k
            public final j00.c<g2> create(@m80.l Object obj, @m80.k j00.c<?> cVar) {
                b bVar = new b(this.f9588c, cVar);
                bVar.f9587b = obj;
                return bVar;
            }

            @Override // x00.p
            @m80.l
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@m80.k ImageRequest imageRequest, @m80.l j00.c<? super c> cVar) {
                return ((b) create(imageRequest, cVar)).invokeSuspend(g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @m80.l
            public final Object invokeSuspend(@m80.k Object obj) {
                AsyncImagePainter asyncImagePainter;
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f9586a;
                if (i11 == 0) {
                    kotlin.e.n(obj);
                    ImageRequest imageRequest = (ImageRequest) this.f9587b;
                    AsyncImagePainter asyncImagePainter2 = this.f9588c;
                    b0.f l12 = asyncImagePainter2.l();
                    ImageRequest I = this.f9588c.I(imageRequest);
                    this.f9587b = asyncImagePainter2;
                    this.f9586a = 1;
                    obj = l12.e(I, this);
                    if (obj == l11) {
                        return l11;
                    }
                    asyncImagePainter = asyncImagePainter2;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    asyncImagePainter = (AsyncImagePainter) this.f9587b;
                    kotlin.e.n(obj);
                }
                return asyncImagePainter.H((o0.g) obj);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public /* synthetic */ class c implements kotlinx.coroutines.flow.j, b0 {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ AsyncImagePainter f9589a;

            public c(AsyncImagePainter asyncImagePainter) {
                this.f9589a = asyncImagePainter;
            }

            @Override // kotlinx.coroutines.flow.j
            @m80.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(@m80.k c cVar, @m80.k j00.c<? super g2> cVar2) {
                Object j11 = d.j(this.f9589a, cVar, cVar2);
                return j11 == kotlin.coroutines.intrinsics.b.l() ? j11 : g2.f100423a;
            }

            public final boolean equals(@m80.l Object obj) {
                if ((obj instanceof kotlinx.coroutines.flow.j) && (obj instanceof b0)) {
                    return g0.g(getFunctionDelegate(), ((b0) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.b0
            @m80.k
            public final w<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.f9589a, AsyncImagePainter.class, "updateState", "updateState(Lcoil/compose/AsyncImagePainter$State;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        public d(j00.c<? super d> cVar) {
            super(2, cVar);
        }

        public static final /* synthetic */ Object j(AsyncImagePainter asyncImagePainter, c cVar, j00.c cVar2) {
            asyncImagePainter.J(cVar);
            return g2.f100423a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.k
        public final j00.c<g2> create(@m80.l Object obj, @m80.k j00.c<?> cVar) {
            return AsyncImagePainter.this.new d(cVar);
        }

        @Override // x00.p
        @m80.l
        public final Object invoke(@m80.k r0 r0Var, @m80.l j00.c<? super g2> cVar) {
            return ((d) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f9583a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                kotlinx.coroutines.flow.i Y0 = kotlinx.coroutines.flow.k.Y0(SnapshotStateKt.snapshotFlow(new a(AsyncImagePainter.this)), new b(AsyncImagePainter.this, null));
                c cVar = new c(AsyncImagePainter.this);
                this.f9583a = 1;
                if (Y0.collect(cVar, this) == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            return g2.f100423a;
        }
    }

    public AsyncImagePainter(@m80.k ImageRequest imageRequest, @m80.k b0.f fVar) {
        c.a aVar = c.a.f9573b;
        this.f9559f = aVar;
        this.f9561h = f9553r;
        this.f9563j = ContentScale.Companion.getFit();
        this.f9564k = DrawScope.Companion.m3063getDefaultFilterQualityfv9h1I();
        this.f9566m = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(aVar, null, 2, null);
        this.f9567n = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(imageRequest, null, 2, null);
        this.f9568o = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(fVar, null, 2, null);
    }

    private final void g() {
        r0 r0Var = this.f9554a;
        if (r0Var != null) {
            s0.f(r0Var, null, 1, null);
        }
        this.f9554a = null;
    }

    private final float h() {
        return this.f9557d.getFloatValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final ColorFilter i() {
        return (ColorFilter) this.f9558e.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Painter n() {
        return (Painter) this.f9556c.getValue();
    }

    private final void t(float f11) {
        this.f9557d.setFloatValue(f11);
    }

    private final void u(ColorFilter colorFilter) {
        this.f9558e.setValue(colorFilter);
    }

    private final void z(Painter painter) {
        this.f9556c.setValue(painter);
    }

    public final void A(boolean z11) {
        this.f9565l = z11;
    }

    public final void B(@m80.k ImageRequest imageRequest) {
        this.f9567n.setValue(imageRequest);
    }

    public final void C(c cVar) {
        this.f9566m.setValue(cVar);
    }

    public final void D(@m80.k x00.l<? super c, ? extends c> lVar) {
        this.f9561h = lVar;
    }

    public final void E(Painter painter) {
        this.f9560g = painter;
        z(painter);
    }

    public final void F(c cVar) {
        this.f9559f = cVar;
        C(cVar);
    }

    public final Painter G(Drawable drawable) {
        return drawable instanceof BitmapDrawable ? BitmapPainterKt.m3183BitmapPainterQZhYCtY$default(AndroidImageBitmap_androidKt.asImageBitmap(((BitmapDrawable) drawable).getBitmap()), 0L, 0L, this.f9564k, 6, null) : new sm.a(drawable.mutate());
    }

    public final c H(o0.g gVar) {
        if (gVar instanceof o0.m) {
            o0.m mVar = (o0.m) gVar;
            return new c.d(G(mVar.a()), mVar);
        }
        if (!(gVar instanceof o0.e)) {
            throw new NoWhenBranchMatchedException();
        }
        Drawable a11 = gVar.a();
        return new c.b(a11 != null ? G(a11) : null, (o0.e) gVar);
    }

    public final ImageRequest I(ImageRequest imageRequest) {
        ImageRequest.Builder m02 = ImageRequest.S(imageRequest, null, 1, null).m0(new e());
        if (imageRequest.q().o() == null) {
            m02.h0(new q0.h() { // from class: coil.compose.AsyncImagePainter$updateRequest$2$1
                @Override // q0.h
                @m80.l
                public final Object a(@m80.k j00.c<? super q0.g> cVar) {
                    final y yVar;
                    yVar = AsyncImagePainter.this.f9555b;
                    return kotlinx.coroutines.flow.k.w0(new kotlinx.coroutines.flow.i<q0.g>() { // from class: coil.compose.AsyncImagePainter$updateRequest$2$1$size$$inlined$mapNotNull$1

                        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
                        @u0({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 AsyncImagePainter.kt\ncoil/compose/AsyncImagePainter$updateRequest$2$1\n*L\n1#1,222:1\n61#2:223\n62#2:225\n337#3:224\n*E\n"})
                        /* renamed from: coil.compose.AsyncImagePainter$updateRequest$2$1$size$$inlined$mapNotNull$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.j {

                            /* renamed from: a, reason: collision with root package name */
                            public final /* synthetic */ kotlinx.coroutines.flow.j f9570a;

                            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
                            @l00.d(c = "coil.compose.AsyncImagePainter$updateRequest$2$1$size$$inlined$mapNotNull$1$2", f = "AsyncImagePainter.kt", i = {}, l = {225}, m = "emit", n = {}, s = {})
                            @u0({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                            /* renamed from: coil.compose.AsyncImagePainter$updateRequest$2$1$size$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                Object L$0;
                                int label;
                                /* synthetic */ Object result;

                                public AnonymousClass1(j00.c cVar) {
                                    super(cVar);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                @m80.l
                                public final Object invokeSuspend(@m80.k Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public AnonymousClass2(kotlinx.coroutines.flow.j jVar) {
                                this.f9570a = jVar;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                            /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                            @Override // kotlinx.coroutines.flow.j
                            @m80.l
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final java.lang.Object emit(java.lang.Object r7, @m80.k j00.c r8) {
                                /*
                                    r6 = this;
                                    boolean r0 = r8 instanceof coil.compose.AsyncImagePainter$updateRequest$2$1$size$$inlined$mapNotNull$1.AnonymousClass2.AnonymousClass1
                                    if (r0 == 0) goto L13
                                    r0 = r8
                                    coil.compose.AsyncImagePainter$updateRequest$2$1$size$$inlined$mapNotNull$1$2$1 r0 = (coil.compose.AsyncImagePainter$updateRequest$2$1$size$$inlined$mapNotNull$1.AnonymousClass2.AnonymousClass1) r0
                                    int r1 = r0.label
                                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                    r3 = r1 & r2
                                    if (r3 == 0) goto L13
                                    int r1 = r1 - r2
                                    r0.label = r1
                                    goto L18
                                L13:
                                    coil.compose.AsyncImagePainter$updateRequest$2$1$size$$inlined$mapNotNull$1$2$1 r0 = new coil.compose.AsyncImagePainter$updateRequest$2$1$size$$inlined$mapNotNull$1$2$1
                                    r0.<init>(r8)
                                L18:
                                    java.lang.Object r8 = r0.result
                                    java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                                    int r2 = r0.label
                                    r3 = 1
                                    if (r2 == 0) goto L31
                                    if (r2 != r3) goto L29
                                    kotlin.e.n(r8)
                                    goto L4b
                                L29:
                                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                                    r7.<init>(r8)
                                    throw r7
                                L31:
                                    kotlin.e.n(r8)
                                    kotlinx.coroutines.flow.j r8 = r6.f9570a
                                    androidx.compose.ui.geometry.Size r7 = (androidx.compose.ui.geometry.Size) r7
                                    long r4 = r7.m2342unboximpl()
                                    q0.g r7 = coil.compose.a.b(r4)
                                    if (r7 == 0) goto L4b
                                    r0.label = r3
                                    java.lang.Object r7 = r8.emit(r7, r0)
                                    if (r7 != r1) goto L4b
                                    return r1
                                L4b:
                                    yz.g2 r7 = yz.g2.f100423a
                                    return r7
                                */
                                throw new UnsupportedOperationException("Method not decompiled: coil.compose.AsyncImagePainter$updateRequest$2$1$size$$inlined$mapNotNull$1.AnonymousClass2.emit(java.lang.Object, j00.c):java.lang.Object");
                            }
                        }

                        @Override // kotlinx.coroutines.flow.i
                        @m80.l
                        public Object collect(@m80.k kotlinx.coroutines.flow.j<? super q0.g> jVar, @m80.k j00.c cVar2) {
                            Object collect = kotlinx.coroutines.flow.i.this.collect(new AnonymousClass2(jVar), cVar2);
                            return collect == kotlin.coroutines.intrinsics.b.l() ? collect : g2.f100423a;
                        }
                    }, cVar);
                }
            });
        }
        if (imageRequest.q().n() == null) {
            m02.Y(q.l(this.f9563j));
        }
        if (imageRequest.q().m() != Precision.EXACT) {
            m02.P(Precision.INEXACT);
        }
        return m02.f();
    }

    public final void J(c cVar) {
        c cVar2 = this.f9559f;
        c invoke = this.f9561h.invoke(cVar);
        F(invoke);
        Painter s11 = s(cVar2, invoke);
        if (s11 == null) {
            s11 = invoke.a();
        }
        E(s11);
        if (this.f9554a != null && cVar2.a() != invoke.a()) {
            Object a11 = cVar2.a();
            RememberObserver rememberObserver = a11 instanceof RememberObserver ? (RememberObserver) a11 : null;
            if (rememberObserver != null) {
                rememberObserver.onForgotten();
            }
            Object a12 = invoke.a();
            RememberObserver rememberObserver2 = a12 instanceof RememberObserver ? (RememberObserver) a12 : null;
            if (rememberObserver2 != null) {
                rememberObserver2.onRemembered();
            }
        }
        x00.l<? super c, g2> lVar = this.f9562i;
        if (lVar != null) {
            lVar.invoke(invoke);
        }
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public boolean applyAlpha(float f11) {
        t(f11);
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public boolean applyColorFilter(@m80.l ColorFilter colorFilter) {
        u(colorFilter);
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public long mo3180getIntrinsicSizeNHjbRc() {
        Painter n11 = n();
        return n11 != null ? n11.mo3180getIntrinsicSizeNHjbRc() : Size.Companion.m2345getUnspecifiedNHjbRc();
    }

    @m80.k
    public final ContentScale j() {
        return this.f9563j;
    }

    public final int k() {
        return this.f9564k;
    }

    @m80.k
    public final b0.f l() {
        return (b0.f) this.f9568o.getValue();
    }

    @m80.l
    public final x00.l<c, g2> m() {
        return this.f9562i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @m80.k
    public final ImageRequest o() {
        return (ImageRequest) this.f9567n.getValue();
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
        g();
        Object obj = this.f9560g;
        RememberObserver rememberObserver = obj instanceof RememberObserver ? (RememberObserver) obj : null;
        if (rememberObserver != null) {
            rememberObserver.onAbandoned();
        }
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public void onDraw(@m80.k DrawScope drawScope) {
        this.f9555b.setValue(Size.m2325boximpl(drawScope.mo3060getSizeNHjbRc()));
        Painter n11 = n();
        if (n11 != null) {
            n11.m3186drawx_KDEd0(drawScope, drawScope.mo3060getSizeNHjbRc(), h(), i());
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        g();
        Object obj = this.f9560g;
        RememberObserver rememberObserver = obj instanceof RememberObserver ? (RememberObserver) obj : null;
        if (rememberObserver != null) {
            rememberObserver.onForgotten();
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
        if (this.f9554a != null) {
            return;
        }
        r0 a11 = s0.a(l3.c(null, 1, null).plus(h1.e().q()));
        this.f9554a = a11;
        Object obj = this.f9560g;
        RememberObserver rememberObserver = obj instanceof RememberObserver ? (RememberObserver) obj : null;
        if (rememberObserver != null) {
            rememberObserver.onRemembered();
        }
        if (!this.f9565l) {
            c40.k.f(a11, null, null, new d(null), 3, null);
        } else {
            Drawable F = ImageRequest.S(o(), null, 1, null).n(l().c()).f().F();
            J(new c.C0153c(F != null ? G(F) : null));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @m80.k
    public final c p() {
        return (c) this.f9566m.getValue();
    }

    @m80.k
    public final x00.l<c, c> q() {
        return this.f9561h;
    }

    public final boolean r() {
        return this.f9565l;
    }

    public final coil.compose.e s(c cVar, c cVar2) {
        o0.g f11;
        a.C0154a c0154a;
        if (!(cVar2 instanceof c.d)) {
            if (cVar2 instanceof c.b) {
                f11 = ((c.b) cVar2).f();
            }
            return null;
        }
        f11 = ((c.d) cVar2).f();
        c.a P = f11.b().P();
        c0154a = coil.compose.a.f9653a;
        t0.c a11 = P.a(c0154a, f11);
        if (a11 instanceof t0.a) {
            t0.a aVar = (t0.a) a11;
            return new coil.compose.e(cVar instanceof c.C0153c ? cVar.a() : null, cVar2.a(), this.f9563j, aVar.b(), ((f11 instanceof o0.m) && ((o0.m) f11).h()) ? false : true, aVar.c());
        }
        return null;
    }

    public final void v(@m80.k ContentScale contentScale) {
        this.f9563j = contentScale;
    }

    public final void w(int i11) {
        this.f9564k = i11;
    }

    public final void x(@m80.k b0.f fVar) {
        this.f9568o.setValue(fVar);
    }

    public final void y(@m80.l x00.l<? super c, g2> lVar) {
        this.f9562i = lVar;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends Lambda implements x00.l<c, c> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f9571a = new a();

        public a() {
            super(1);
        }

        @Override // x00.l
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c invoke(@m80.k c cVar) {
            return cVar;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nImageRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageRequest.kt\ncoil/request/ImageRequest$Builder$target$4\n+ 2 AsyncImagePainter.kt\ncoil/compose/AsyncImagePainter\n+ 3 ImageRequest.kt\ncoil/request/ImageRequest$Builder$target$2\n+ 4 ImageRequest.kt\ncoil/request/ImageRequest$Builder$target$3\n*L\n1#1,1057:1\n331#2,2:1058\n847#3:1060\n848#4:1061\n*E\n"})
    public static final class e implements r0.c {
        public e() {
        }

        @Override // r0.c
        public void b(@m80.l Drawable drawable) {
            AsyncImagePainter.this.J(new c.C0153c(drawable != null ? AsyncImagePainter.this.G(drawable) : null));
        }

        @Override // r0.c
        public void a(@m80.k Drawable drawable) {
        }

        @Override // r0.c
        public void g(@m80.l Drawable drawable) {
        }
    }
}

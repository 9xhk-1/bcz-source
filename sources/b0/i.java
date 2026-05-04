package b0;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import b0.c;
import b0.f;
import c40.h1;
import c40.l3;
import c40.n0;
import c40.r0;
import c40.s0;
import c40.x0;
import coil.memory.MemoryCache;
import coil.request.ImageRequest;
import com.tencent.open.SocialConstants;
import f0.d;
import i0.a;
import i0.b;
import i0.c;
import i0.e;
import i0.f;
import i0.j;
import i0.k;
import i0.l;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import t50.b;
import u0.j;
import u0.t;
import u0.w;
import u0.y;
import x00.p;
import yz.c0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nRealImageLoader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealImageLoader.kt\ncoil/RealImageLoader\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n+ 3 ComponentRegistry.kt\ncoil/ComponentRegistry$Builder\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Utils.kt\ncoil/util/-Utils\n+ 6 Bitmaps.kt\ncoil/util/-Bitmaps\n+ 7 BitmapDrawable.kt\nandroidx/core/graphics/drawable/BitmapDrawableKt\n+ 8 Logs.kt\ncoil/util/-Logs\n*L\n1#1,292:1\n270#1,15:322\n270#1,15:341\n48#2,4:293\n138#3:297\n138#3:298\n138#3:299\n138#3:300\n138#3:301\n138#3:302\n146#3:303\n146#3:304\n154#3:305\n154#3:306\n154#3:307\n154#3:308\n154#3:309\n154#3:310\n154#3:311\n154#3:312\n1#4:313\n1#4:315\n173#5:314\n50#6:316\n28#7:317\n21#8,4:318\n21#8,4:337\n21#8,4:356\n*S KotlinDebug\n*F\n+ 1 RealImageLoader.kt\ncoil/RealImageLoader\n*L\n237#1:322,15\n251#1:341,15\n78#1:293,4\n85#1:297\n86#1:298\n87#1:299\n88#1:300\n89#1:301\n90#1:302\n92#1:303\n93#1:304\n95#1:305\n96#1:306\n97#1:307\n98#1:308\n99#1:309\n100#1:310\n101#1:311\n102#1:312\n166#1:315\n166#1:314\n167#1:316\n167#1:317\n234#1:318,4\n248#1:337,4\n257#1:356,4\n*E\n"})
/* loaded from: classes3.dex */
public final class i implements b0.f {

    /* renamed from: p, reason: collision with root package name */
    @k
    public static final a f5609p = new a(null);

    /* renamed from: q, reason: collision with root package name */
    @k
    public static final String f5610q = "RealImageLoader";

    /* renamed from: r, reason: collision with root package name */
    public static final int f5611r = 0;

    /* renamed from: s, reason: collision with root package name */
    public static final int f5612s = 1;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Context f5613a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final o0.b f5614b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final c0<MemoryCache> f5615c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final c0<g0.a> f5616d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final c0<b.a> f5617e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final c.d f5618f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final b0.b f5619g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final t f5620h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final w f5621i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final r0 f5622j = s0.a(l3.c(null, 1, null).plus(h1.e().q()).plus(new f(n0.f7891d0, this)));

    /* renamed from: k, reason: collision with root package name */
    @k
    public final y f5623k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final o0.l f5624l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final b0.b f5625m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final List<k0.b> f5626n;

    /* renamed from: o, reason: collision with root package name */
    @k
    public final AtomicBoolean f5627o;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "coil.RealImageLoader$enqueue$job$1", f = "RealImageLoader.kt", i = {}, l = {113}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<r0, j00.c<? super o0.g>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f5628a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ImageRequest f5630c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ImageRequest imageRequest, j00.c<? super b> cVar) {
            super(2, cVar);
            this.f5630c = imageRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final j00.c<g2> create(@l Object obj, @k j00.c<?> cVar) {
            return i.this.new b(this.f5630c, cVar);
        }

        @Override // x00.p
        @l
        public final Object invoke(@k r0 r0Var, @l j00.c<? super o0.g> cVar) {
            return ((b) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            w q11;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f5628a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                i iVar = i.this;
                ImageRequest imageRequest = this.f5630c;
                this.f5628a = 1;
                obj = iVar.j(imageRequest, 0, this);
                if (obj == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            i iVar2 = i.this;
            o0.g gVar = (o0.g) obj;
            if ((gVar instanceof o0.e) && (q11 = iVar2.q()) != null) {
                j.b(q11, i.f5610q, ((o0.e) gVar).e());
            }
            return obj;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "coil.RealImageLoader$execute$2", f = "RealImageLoader.kt", i = {}, l = {136}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements p<r0, j00.c<? super o0.g>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f5631a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f5632b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ImageRequest f5633c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ i f5634d;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "coil.RealImageLoader$execute$2$job$1", f = "RealImageLoader.kt", i = {}, l = {129}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements p<r0, j00.c<? super o0.g>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f5635a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f5636b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ImageRequest f5637c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(i iVar, ImageRequest imageRequest, j00.c<? super a> cVar) {
                super(2, cVar);
                this.f5636b = iVar;
                this.f5637c = imageRequest;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final j00.c<g2> create(@l Object obj, @k j00.c<?> cVar) {
                return new a(this.f5636b, this.f5637c, cVar);
            }

            @Override // x00.p
            @l
            public final Object invoke(@k r0 r0Var, @l j00.c<? super o0.g> cVar) {
                return ((a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@k Object obj) {
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f5635a;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.e.n(obj);
                    return obj;
                }
                kotlin.e.n(obj);
                i iVar = this.f5636b;
                ImageRequest imageRequest = this.f5637c;
                this.f5635a = 1;
                Object j11 = iVar.j(imageRequest, 1, this);
                return j11 == l11 ? l11 : j11;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ImageRequest imageRequest, i iVar, j00.c<? super c> cVar) {
            super(2, cVar);
            this.f5633c = imageRequest;
            this.f5634d = iVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final j00.c<g2> create(@l Object obj, @k j00.c<?> cVar) {
            c cVar2 = new c(this.f5633c, this.f5634d, cVar);
            cVar2.f5632b = obj;
            return cVar2;
        }

        @Override // x00.p
        @l
        public final Object invoke(@k r0 r0Var, @l j00.c<? super o0.g> cVar) {
            return ((c) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            x0<? extends o0.g> b11;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f5631a;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                return obj;
            }
            kotlin.e.n(obj);
            b11 = c40.k.b((r0) this.f5632b, h1.e().q(), null, new a(this.f5634d, this.f5633c, null), 2, null);
            if (this.f5633c.M() instanceof r0.d) {
                u0.l.t(((r0.d) this.f5633c.M()).getView()).b(b11);
            }
            this.f5631a = 1;
            Object i12 = b11.i(this);
            return i12 == l11 ? l11 : i12;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "coil.RealImageLoader", f = "RealImageLoader.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2}, l = {162, 174, 178}, m = "executeMain", n = {"this", "requestDelegate", SocialConstants.TYPE_REQUEST, "eventListener", "this", "requestDelegate", SocialConstants.TYPE_REQUEST, "eventListener", "placeholderBitmap", "this", "requestDelegate", SocialConstants.TYPE_REQUEST, "eventListener"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3"})
    public static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f5638a;

        /* renamed from: b, reason: collision with root package name */
        public Object f5639b;

        /* renamed from: c, reason: collision with root package name */
        public Object f5640c;

        /* renamed from: d, reason: collision with root package name */
        public Object f5641d;

        /* renamed from: e, reason: collision with root package name */
        public Object f5642e;

        /* renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f5643f;

        /* renamed from: h, reason: collision with root package name */
        public int f5645h;

        public d(j00.c<? super d> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f5643f = obj;
            this.f5645h |= Integer.MIN_VALUE;
            return i.this.j(null, 0, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "coil.RealImageLoader$executeMain$result$1", f = "RealImageLoader.kt", i = {}, l = {187}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements p<r0, j00.c<? super o0.g>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f5646a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ImageRequest f5647b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ i f5648c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ q0.g f5649d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ b0.c f5650e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Bitmap f5651f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ImageRequest imageRequest, i iVar, q0.g gVar, b0.c cVar, Bitmap bitmap, j00.c<? super e> cVar2) {
            super(2, cVar2);
            this.f5647b = imageRequest;
            this.f5648c = iVar;
            this.f5649d = gVar;
            this.f5650e = cVar;
            this.f5651f = bitmap;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final j00.c<g2> create(@l Object obj, @k j00.c<?> cVar) {
            return new e(this.f5647b, this.f5648c, this.f5649d, this.f5650e, this.f5651f, cVar);
        }

        @Override // x00.p
        @l
        public final Object invoke(@k r0 r0Var, @l j00.c<? super o0.g> cVar) {
            return ((e) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f5646a;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                return obj;
            }
            kotlin.e.n(obj);
            k0.c cVar = new k0.c(this.f5647b, this.f5648c.f5626n, 0, this.f5647b, this.f5649d, this.f5650e, this.f5651f != null);
            ImageRequest imageRequest = this.f5647b;
            this.f5646a = 1;
            Object c11 = cVar.c(imageRequest, this);
            return c11 == l11 ? l11 : c11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 RealImageLoader.kt\ncoil/RealImageLoader\n*L\n1#1,110:1\n78#2:111\n*E\n"})
    public static final class f extends kotlin.coroutines.a implements n0 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i f5652a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(n0.b bVar, i iVar) {
            super(bVar);
            this.f5652a = iVar;
        }

        @Override // c40.n0
        public void handleException(@k kotlin.coroutines.d dVar, @k Throwable th2) {
            w q11 = this.f5652a.q();
            if (q11 != null) {
                j.b(q11, i.f5610q, th2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i(@k Context context, @k o0.b bVar, @k c0<? extends MemoryCache> c0Var, @k c0<? extends g0.a> c0Var2, @k c0<? extends b.a> c0Var3, @k c.d dVar, @k b0.b bVar2, @k t tVar, @l w wVar) {
        this.f5613a = context;
        this.f5614b = bVar;
        this.f5615c = c0Var;
        this.f5616d = c0Var2;
        this.f5617e = c0Var3;
        this.f5618f = dVar;
        this.f5619g = bVar2;
        this.f5620h = tVar;
        this.f5621i = wVar;
        y yVar = new y(this);
        this.f5623k = yVar;
        o0.l lVar = new o0.l(this, yVar, wVar);
        this.f5624l = lVar;
        this.f5625m = bVar2.h().h(new m0.c(), okhttp3.i.class).h(new m0.g(), String.class).h(new m0.b(), Uri.class).h(new m0.f(), Uri.class).h(new m0.e(), Integer.class).h(new m0.a(), byte[].class).f(new l0.c(), Uri.class).f(new l0.a(tVar.c()), File.class).c(new k.b(c0Var3, c0Var2, tVar.g()), Uri.class).c(new j.a(), File.class).c(new a.C0686a(), Uri.class).c(new e.a(), Uri.class).c(new l.b(), Uri.class).c(new f.a(), Drawable.class).c(new b.a(), Bitmap.class).c(new c.a(), ByteBuffer.class).a(new d.c(tVar.e(), tVar.d())).i();
        this.f5626n = a00.r0.J4(b().c(), new k0.a(this, yVar, lVar, wVar));
        this.f5627o = new AtomicBoolean(false);
    }

    public static Object n(i iVar) {
        return iVar.f5616d;
    }

    public static Object r(i iVar) {
        return iVar.f5615c;
    }

    @Override // b0.f
    @m80.l
    public g0.a a() {
        return this.f5616d.getValue();
    }

    @Override // b0.f
    @m80.k
    public b0.b b() {
        return this.f5625m;
    }

    @Override // b0.f
    @m80.k
    public o0.b c() {
        return this.f5614b;
    }

    @Override // b0.f
    @m80.k
    public o0.d d(@m80.k ImageRequest imageRequest) {
        x0<? extends o0.g> b11;
        b11 = c40.k.b(this.f5622j, null, null, new b(imageRequest, null), 3, null);
        return imageRequest.M() instanceof r0.d ? u0.l.t(((r0.d) imageRequest.M()).getView()).b(b11) : new o0.i(b11);
    }

    @Override // b0.f
    @m80.l
    public Object e(@m80.k ImageRequest imageRequest, @m80.k j00.c<? super o0.g> cVar) {
        return s0.g(new c(imageRequest, this, null), cVar);
    }

    @Override // b0.f
    @m80.k
    public f.a f() {
        return new f.a(this);
    }

    @Override // b0.f
    @m80.l
    public MemoryCache g() {
        return this.f5615c.getValue();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:0|1|(2:3|(16:5|6|(1:(4:(1:(7:11|12|13|14|(1:16)(2:20|(1:22))|17|18)(2:35|36))(13:37|38|39|40|41|42|43|44|45|46|47|(5:50|14|(0)(0)|17|18)|49)|24|25|(3:27|28|29)(2:30|31))(3:60|61|62))(4:93|94|95|(2:97|(3:99|(1:101)|49)(13:102|64|65|(3:67|(1:69)(1:85)|(9:71|(1:73)(1:84)|74|(1:76)|77|(1:79)|80|(9:82|41|42|43|44|45|46|47|(0))|49))|86|(0)(0)|74|(0)|77|(0)|80|(0)|49))(2:103|104))|63|64|65|(0)|86|(0)(0)|74|(0)|77|(0)|80|(0)|49))|107|6|(0)(0)|63|64|65|(0)|86|(0)(0)|74|(0)|77|(0)|80|(0)|49|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0106, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0107, code lost:
    
        r6 = r2;
        r4 = r5;
        r5 = r8;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x018d A[Catch: all -> 0x004b, TryCatch #5 {all -> 0x004b, blocks: (B:13:0x0046, B:14:0x0187, B:16:0x018d, B:20:0x0198, B:22:0x019c), top: B:12:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0198 A[Catch: all -> 0x004b, TryCatch #5 {all -> 0x004b, blocks: (B:13:0x0046, B:14:0x0187, B:16:0x018d, B:20:0x0198, B:22:0x019c), top: B:12:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01be A[Catch: all -> 0x01cf, TRY_LEAVE, TryCatch #7 {all -> 0x01cf, blocks: (B:25:0x01ba, B:27:0x01be, B:30:0x01d1, B:31:0x01d4), top: B:24:0x01ba }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01d1 A[Catch: all -> 0x01cf, TRY_ENTER, TryCatch #7 {all -> 0x01cf, blocks: (B:25:0x01ba, B:27:0x01be, B:30:0x01d1, B:31:0x01d4), top: B:24:0x01ba }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00fb A[Catch: all -> 0x0106, TryCatch #3 {all -> 0x0106, blocks: (B:65:0x00f5, B:67:0x00fb, B:69:0x0101, B:71:0x010e, B:73:0x0116, B:74:0x0128, B:76:0x012e, B:77:0x0131, B:79:0x013a, B:80:0x013d, B:84:0x0124), top: B:64:0x00f5 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0116 A[Catch: all -> 0x0106, TryCatch #3 {all -> 0x0106, blocks: (B:65:0x00f5, B:67:0x00fb, B:69:0x0101, B:71:0x010e, B:73:0x0116, B:74:0x0128, B:76:0x012e, B:77:0x0131, B:79:0x013a, B:80:0x013d, B:84:0x0124), top: B:64:0x00f5 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x012e A[Catch: all -> 0x0106, TryCatch #3 {all -> 0x0106, blocks: (B:65:0x00f5, B:67:0x00fb, B:69:0x0101, B:71:0x010e, B:73:0x0116, B:74:0x0128, B:76:0x012e, B:77:0x0131, B:79:0x013a, B:80:0x013d, B:84:0x0124), top: B:64:0x00f5 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x013a A[Catch: all -> 0x0106, TryCatch #3 {all -> 0x0106, blocks: (B:65:0x00f5, B:67:0x00fb, B:69:0x0101, B:71:0x010e, B:73:0x0116, B:74:0x0128, B:76:0x012e, B:77:0x0131, B:79:0x013a, B:80:0x013d, B:84:0x0124), top: B:64:0x00f5 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0124 A[Catch: all -> 0x0106, TryCatch #3 {all -> 0x0106, blocks: (B:65:0x00f5, B:67:0x00fb, B:69:0x0101, B:71:0x010e, B:73:0x0116, B:74:0x0128, B:76:0x012e, B:77:0x0131, B:79:0x013a, B:80:0x013d, B:84:0x0124), top: B:64:0x00f5 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0099  */
    @androidx.annotation.MainThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(coil.request.ImageRequest r20, int r21, j00.c<? super o0.g> r22) {
        /*
            Method dump skipped, instructions count: 473
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.i.j(coil.request.ImageRequest, int, j00.c):java.lang.Object");
    }

    @m80.k
    public final c0<b.a> k() {
        return this.f5617e;
    }

    @m80.k
    public final b0.b l() {
        return this.f5619g;
    }

    @m80.k
    public final Context m() {
        return this.f5613a;
    }

    @m80.k
    public final c0<g0.a> o() {
        return this.f5616d;
    }

    @m80.k
    public final c.d p() {
        return this.f5618f;
    }

    @m80.l
    public final w q() {
        return this.f5621i;
    }

    @m80.k
    public final c0<MemoryCache> s() {
        return this.f5615c;
    }

    @Override // b0.f
    public void shutdown() {
        if (this.f5627o.getAndSet(true)) {
            return;
        }
        s0.f(this.f5622j, null, 1, null);
        this.f5623k.j();
        MemoryCache g11 = g();
        if (g11 != null) {
            g11.clear();
        }
    }

    @m80.k
    public final t t() {
        return this.f5620h;
    }

    public final void u(ImageRequest imageRequest, b0.c cVar) {
        w wVar = this.f5621i;
        if (wVar != null && wVar.getLevel() <= 4) {
            wVar.a(f5610q, 4, "🏗  Cancelled - " + imageRequest.m(), null);
        }
        cVar.a(imageRequest);
        ImageRequest.a A = imageRequest.A();
        if (A != null) {
            A.a(imageRequest);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x003a, code lost:
    
        if (r8 != null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v(o0.e r7, r0.c r8, b0.c r9) {
        /*
            r6 = this;
            coil.request.ImageRequest r0 = r7.b()
            u0.w r1 = r6.f5621i
            if (r1 == 0) goto L36
            int r2 = r1.getLevel()
            r3 = 4
            if (r2 > r3) goto L36
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "🚨 Failed - "
            r2.append(r4)
            java.lang.Object r4 = r0.m()
            r2.append(r4)
            java.lang.String r4 = " - "
            r2.append(r4)
            java.lang.Throwable r4 = r7.e()
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r4 = 0
            java.lang.String r5 = "RealImageLoader"
            r1.a(r5, r3, r2, r4)
        L36:
            boolean r1 = r8 instanceof t0.d
            if (r1 != 0) goto L3d
            if (r8 == 0) goto L69
            goto L50
        L3d:
            coil.request.ImageRequest r1 = r7.b()
            t0.c$a r1 = r1.P()
            r2 = r8
            t0.d r2 = (t0.d) r2
            t0.c r1 = r1.a(r2, r7)
            boolean r2 = r1 instanceof t0.b
            if (r2 == 0) goto L58
        L50:
            android.graphics.drawable.Drawable r1 = r7.a()
            r8.g(r1)
            goto L69
        L58:
            coil.request.ImageRequest r8 = r7.b()
            r9.t(r8, r1)
            r1.a()
            coil.request.ImageRequest r8 = r7.b()
            r9.u(r8, r1)
        L69:
            r9.b(r0, r7)
            coil.request.ImageRequest$a r8 = r0.A()
            if (r8 == 0) goto L75
            r8.b(r0, r7)
        L75:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.i.v(o0.e, r0.c, b0.c):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0045, code lost:
    
        if (r8 != null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w(o0.m r7, r0.c r8, b0.c r9) {
        /*
            r6 = this;
            coil.request.ImageRequest r0 = r7.b()
            coil.decode.DataSource r1 = r7.e()
            u0.w r2 = r6.f5621i
            if (r2 == 0) goto L41
            int r3 = r2.getLevel()
            r4 = 4
            if (r3 > r4) goto L41
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = u0.l.l(r1)
            r3.append(r5)
            java.lang.String r5 = " Successful ("
            r3.append(r5)
            java.lang.String r1 = r1.name()
            r3.append(r1)
            java.lang.String r1 = ") - "
            r3.append(r1)
            java.lang.Object r1 = r0.m()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r3 = 0
            java.lang.String r5 = "RealImageLoader"
            r2.a(r5, r4, r1, r3)
        L41:
            boolean r1 = r8 instanceof t0.d
            if (r1 != 0) goto L48
            if (r8 == 0) goto L74
            goto L5b
        L48:
            coil.request.ImageRequest r1 = r7.b()
            t0.c$a r1 = r1.P()
            r2 = r8
            t0.d r2 = (t0.d) r2
            t0.c r1 = r1.a(r2, r7)
            boolean r2 = r1 instanceof t0.b
            if (r2 == 0) goto L63
        L5b:
            android.graphics.drawable.Drawable r1 = r7.a()
            r8.a(r1)
            goto L74
        L63:
            coil.request.ImageRequest r8 = r7.b()
            r9.t(r8, r1)
            r1.a()
            coil.request.ImageRequest r8 = r7.b()
            r9.u(r8, r1)
        L74:
            r9.c(r0, r7)
            coil.request.ImageRequest$a r8 = r0.A()
            if (r8 == 0) goto L80
            r8.c(r0, r7)
        L80:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.i.w(o0.m, r0.c, b0.c):void");
    }

    public final void x(int i11) {
        MemoryCache value;
        c0<MemoryCache> c0Var = this.f5615c;
        if (c0Var == null || (value = c0Var.getValue()) == null) {
            return;
        }
        value.b(i11);
    }

    public final void y(o0.g gVar, r0.c cVar, b0.c cVar2, x00.a<g2> aVar) {
        if (!(cVar instanceof t0.d)) {
            aVar.invoke();
            return;
        }
        t0.c a11 = gVar.b().P().a((t0.d) cVar, gVar);
        if (a11 instanceof t0.b) {
            aVar.invoke();
            return;
        }
        cVar2.t(gVar.b(), a11);
        a11.a();
        cVar2.u(gVar.b(), a11);
    }
}

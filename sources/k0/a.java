package k0;

import a00.a0;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.VisibleForTesting;
import c40.r0;
import coil.decode.DataSource;
import coil.memory.MemoryCache;
import coil.request.ImageRequest;
import com.jiongji.andriod.card.R;
import com.tencent.open.SocialConstants;
import i0.m;
import java.util.List;
import k0.b;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import o0.j;
import o0.l;
import u0.w;
import u0.y;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nEngineInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EngineInterceptor.kt\ncoil/intercept/EngineInterceptor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Utils.kt\ncoil/util/-Utils\n+ 4 Logs.kt\ncoil/util/-Logs\n*L\n1#1,306:1\n1#2:307\n1#2:309\n1#2:311\n184#3:308\n188#3:310\n21#4,4:312\n21#4,4:316\n21#4,4:320\n*S KotlinDebug\n*F\n+ 1 EngineInterceptor.kt\ncoil/intercept/EngineInterceptor\n*L\n120#1:309\n121#1:311\n120#1:308\n121#1:310\n234#1:312,4\n266#1:316,4\n272#1:320,4\n*E\n"})
/* loaded from: classes3.dex */
public final class a implements k0.b {

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final C0746a f64783f = new C0746a(null);

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final String f64784g = "EngineInterceptor";

    /* renamed from: a, reason: collision with root package name */
    @k
    public final b0.f f64785a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final y f64786b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final l f64787c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    public final w f64788d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final coil.memory.c f64789e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: k0.a$a, reason: collision with other inner class name */
    public static final class C0746a {
        public /* synthetic */ C0746a(v vVar) {
            this();
        }

        public C0746a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Drawable f64790a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f64791b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final DataSource f64792c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public final String f64793d;

        public b(@k Drawable drawable, boolean z11, @k DataSource dataSource, @m80.l String str) {
            this.f64790a = drawable;
            this.f64791b = z11;
            this.f64792c = dataSource;
            this.f64793d = str;
        }

        public static /* synthetic */ b b(b bVar, Drawable drawable, boolean z11, DataSource dataSource, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                drawable = bVar.f64790a;
            }
            if ((i11 & 2) != 0) {
                z11 = bVar.f64791b;
            }
            if ((i11 & 4) != 0) {
                dataSource = bVar.f64792c;
            }
            if ((i11 & 8) != 0) {
                str = bVar.f64793d;
            }
            return bVar.a(drawable, z11, dataSource, str);
        }

        @k
        public final b a(@k Drawable drawable, boolean z11, @k DataSource dataSource, @m80.l String str) {
            return new b(drawable, z11, dataSource, str);
        }

        @k
        public final DataSource c() {
            return this.f64792c;
        }

        @m80.l
        public final String d() {
            return this.f64793d;
        }

        @k
        public final Drawable e() {
            return this.f64790a;
        }

        public final boolean f() {
            return this.f64791b;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "coil.intercept.EngineInterceptor", f = "EngineInterceptor.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {203}, m = "decode", n = {"this", "fetchResult", "components", SocialConstants.TYPE_REQUEST, "mappedData", "options", "eventListener", "decoder", "searchIndex"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "I$0"})
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f64794a;

        /* renamed from: b, reason: collision with root package name */
        public Object f64795b;

        /* renamed from: c, reason: collision with root package name */
        public Object f64796c;

        /* renamed from: d, reason: collision with root package name */
        public Object f64797d;

        /* renamed from: e, reason: collision with root package name */
        public Object f64798e;

        /* renamed from: f, reason: collision with root package name */
        public Object f64799f;

        /* renamed from: g, reason: collision with root package name */
        public Object f64800g;

        /* renamed from: h, reason: collision with root package name */
        public Object f64801h;

        /* renamed from: i, reason: collision with root package name */
        public int f64802i;

        /* renamed from: j, reason: collision with root package name */
        public /* synthetic */ Object f64803j;

        /* renamed from: l, reason: collision with root package name */
        public int f64805l;

        public c(j00.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@k Object obj) {
            this.f64803j = obj;
            this.f64805l |= Integer.MIN_VALUE;
            return a.this.i(null, null, null, null, null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "coil.intercept.EngineInterceptor", f = "EngineInterceptor.kt", i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1}, l = {126, 130, 148}, m = "execute", n = {"this", SocialConstants.TYPE_REQUEST, "mappedData", "eventListener", "options", "components", "fetchResult", "this", SocialConstants.TYPE_REQUEST, "eventListener", "options", "fetchResult"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$0", "L$1", "L$2", "L$3", "L$4"})
    public static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f64806a;

        /* renamed from: b, reason: collision with root package name */
        public Object f64807b;

        /* renamed from: c, reason: collision with root package name */
        public Object f64808c;

        /* renamed from: d, reason: collision with root package name */
        public Object f64809d;

        /* renamed from: e, reason: collision with root package name */
        public Object f64810e;

        /* renamed from: f, reason: collision with root package name */
        public Object f64811f;

        /* renamed from: g, reason: collision with root package name */
        public Object f64812g;

        /* renamed from: h, reason: collision with root package name */
        public Object f64813h;

        /* renamed from: i, reason: collision with root package name */
        public /* synthetic */ Object f64814i;

        /* renamed from: k, reason: collision with root package name */
        public int f64816k;

        public d(j00.c<? super d> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@k Object obj) {
            this.f64814i = obj;
            this.f64816k |= Integer.MIN_VALUE;
            return a.this.j(null, null, null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "coil.intercept.EngineInterceptor$execute$executeResult$1", f = "EngineInterceptor.kt", i = {}, l = {131}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements p<r0, j00.c<? super b>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f64817a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Ref.ObjectRef<i0.h> f64819c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Ref.ObjectRef<b0.b> f64820d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ ImageRequest f64821e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Object f64822f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ Ref.ObjectRef<j> f64823g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ b0.c f64824h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Ref.ObjectRef<i0.h> objectRef, Ref.ObjectRef<b0.b> objectRef2, ImageRequest imageRequest, Object obj, Ref.ObjectRef<j> objectRef3, b0.c cVar, j00.c<? super e> cVar2) {
            super(2, cVar2);
            this.f64819c = objectRef;
            this.f64820d = objectRef2;
            this.f64821e = imageRequest;
            this.f64822f = obj;
            this.f64823g = objectRef3;
            this.f64824h = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final j00.c<g2> create(@m80.l Object obj, @k j00.c<?> cVar) {
            return a.this.new e(this.f64819c, this.f64820d, this.f64821e, this.f64822f, this.f64823g, this.f64824h, cVar);
        }

        @Override // x00.p
        @m80.l
        public final Object invoke(@k r0 r0Var, @m80.l j00.c<? super b> cVar) {
            return ((e) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@k Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f64817a;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                return obj;
            }
            kotlin.e.n(obj);
            a aVar = a.this;
            m mVar = (m) this.f64819c.element;
            b0.b bVar = this.f64820d.element;
            ImageRequest imageRequest = this.f64821e;
            Object obj2 = this.f64822f;
            j jVar = this.f64823g.element;
            b0.c cVar = this.f64824h;
            this.f64817a = 1;
            Object i12 = aVar.i(mVar, bVar, imageRequest, obj2, jVar, cVar, this);
            return i12 == l11 ? l11 : i12;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "coil.intercept.EngineInterceptor", f = "EngineInterceptor.kt", i = {0, 0, 0, 0, 0, 0, 0, 0}, l = {169}, m = "fetch", n = {"this", "components", SocialConstants.TYPE_REQUEST, "mappedData", "options", "eventListener", "fetcher", "searchIndex"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0"})
    public static final class f extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f64825a;

        /* renamed from: b, reason: collision with root package name */
        public Object f64826b;

        /* renamed from: c, reason: collision with root package name */
        public Object f64827c;

        /* renamed from: d, reason: collision with root package name */
        public Object f64828d;

        /* renamed from: e, reason: collision with root package name */
        public Object f64829e;

        /* renamed from: f, reason: collision with root package name */
        public Object f64830f;

        /* renamed from: g, reason: collision with root package name */
        public Object f64831g;

        /* renamed from: h, reason: collision with root package name */
        public int f64832h;

        /* renamed from: i, reason: collision with root package name */
        public /* synthetic */ Object f64833i;

        /* renamed from: k, reason: collision with root package name */
        public int f64835k;

        public f(j00.c<? super f> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@k Object obj) {
            this.f64833i = obj;
            this.f64835k |= Integer.MIN_VALUE;
            return a.this.k(null, null, null, null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "coil.intercept.EngineInterceptor", f = "EngineInterceptor.kt", i = {0, 0}, l = {75}, m = "intercept", n = {"this", "chain"}, s = {"L$0", "L$1"})
    public static final class g extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f64836a;

        /* renamed from: b, reason: collision with root package name */
        public Object f64837b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f64838c;

        /* renamed from: e, reason: collision with root package name */
        public int f64840e;

        public g(j00.c<? super g> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@k Object obj) {
            this.f64838c = obj;
            this.f64840e |= Integer.MIN_VALUE;
            return a.this.a(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "coil.intercept.EngineInterceptor$intercept$2", f = "EngineInterceptor.kt", i = {}, l = {77}, m = "invokeSuspend", n = {}, s = {})
    @u0({"SMAP\nEngineInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EngineInterceptor.kt\ncoil/intercept/EngineInterceptor$intercept$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,306:1\n1#2:307\n*E\n"})
    public static final class h extends SuspendLambda implements p<r0, j00.c<? super o0.m>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f64841a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ImageRequest f64843c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Object f64844d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ j f64845e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ b0.c f64846f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ MemoryCache.Key f64847g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ b.a f64848h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ImageRequest imageRequest, Object obj, j jVar, b0.c cVar, MemoryCache.Key key, b.a aVar, j00.c<? super h> cVar2) {
            super(2, cVar2);
            this.f64843c = imageRequest;
            this.f64844d = obj;
            this.f64845e = jVar;
            this.f64846f = cVar;
            this.f64847g = key;
            this.f64848h = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final j00.c<g2> create(@m80.l Object obj, @k j00.c<?> cVar) {
            return a.this.new h(this.f64843c, this.f64844d, this.f64845e, this.f64846f, this.f64847g, this.f64848h, cVar);
        }

        @Override // x00.p
        @m80.l
        public final Object invoke(@k r0 r0Var, @m80.l j00.c<? super o0.m> cVar) {
            return ((h) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@k Object obj) {
            Object j11;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f64841a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                a aVar = a.this;
                ImageRequest imageRequest = this.f64843c;
                Object obj2 = this.f64844d;
                j jVar = this.f64845e;
                b0.c cVar = this.f64846f;
                this.f64841a = 1;
                j11 = aVar.j(imageRequest, obj2, jVar, cVar, this);
                if (j11 == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                j11 = obj;
            }
            b bVar = (b) j11;
            a.this.f64786b.g();
            boolean h11 = a.this.f64789e.h(this.f64847g, this.f64843c, bVar);
            Drawable e11 = bVar.e();
            ImageRequest imageRequest2 = this.f64843c;
            DataSource c11 = bVar.c();
            MemoryCache.Key key = this.f64847g;
            if (!h11) {
                key = null;
            }
            return new o0.m(e11, imageRequest2, c11, key, bVar.d(), bVar.f(), u0.l.C(this.f64848h));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "coil.intercept.EngineInterceptor$transform$3", f = "EngineInterceptor.kt", i = {0, 0, 0}, l = {R.styleable.Theme_drawable_walk_sound2}, m = "invokeSuspend", n = {"$this$withContext", "$this$foldIndices$iv", "i$iv"}, s = {"L$0", "L$1", "I$0"})
    @u0({"SMAP\nEngineInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EngineInterceptor.kt\ncoil/intercept/EngineInterceptor$transform$3\n+ 2 Collections.kt\ncoil/util/-Collections\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Bitmaps.kt\ncoil/util/-Bitmaps\n+ 5 BitmapDrawable.kt\nandroidx/core/graphics/drawable/BitmapDrawableKt\n*L\n1#1,306:1\n32#2,3:307\n36#2:311\n1#3:310\n50#4:312\n28#5:313\n*S KotlinDebug\n*F\n+ 1 EngineInterceptor.kt\ncoil/intercept/EngineInterceptor$transform$3\n*L\n245#1:307,3\n245#1:311\n249#1:312\n249#1:313\n*E\n"})
    public static final class i extends SuspendLambda implements p<r0, j00.c<? super b>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f64849a;

        /* renamed from: b, reason: collision with root package name */
        public Object f64850b;

        /* renamed from: c, reason: collision with root package name */
        public int f64851c;

        /* renamed from: d, reason: collision with root package name */
        public int f64852d;

        /* renamed from: e, reason: collision with root package name */
        public int f64853e;

        /* renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f64854f;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ b f64856h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ j f64857i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ List<s0.d> f64858j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ b0.c f64859k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ ImageRequest f64860l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public i(b bVar, j jVar, List<? extends s0.d> list, b0.c cVar, ImageRequest imageRequest, j00.c<? super i> cVar2) {
            super(2, cVar2);
            this.f64856h = bVar;
            this.f64857i = jVar;
            this.f64858j = list;
            this.f64859k = cVar;
            this.f64860l = imageRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final j00.c<g2> create(@m80.l Object obj, @k j00.c<?> cVar) {
            i iVar = a.this.new i(this.f64856h, this.f64857i, this.f64858j, this.f64859k, this.f64860l, cVar);
            iVar.f64854f = obj;
            return iVar;
        }

        @Override // x00.p
        @m80.l
        public final Object invoke(@k r0 r0Var, @m80.l j00.c<? super b> cVar) {
            return ((i) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x007a  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0056  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x0070 -> B:5:0x0073). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@m80.k java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r10.f64853e
                r2 = 1
                if (r1 == 0) goto L27
                if (r1 != r2) goto L1f
                int r1 = r10.f64852d
                int r3 = r10.f64851c
                java.lang.Object r4 = r10.f64850b
                o0.j r4 = (o0.j) r4
                java.lang.Object r5 = r10.f64849a
                java.util.List r5 = (java.util.List) r5
                java.lang.Object r6 = r10.f64854f
                c40.r0 r6 = (c40.r0) r6
                kotlin.e.n(r11)
                goto L73
            L1f:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L27:
                kotlin.e.n(r11)
                java.lang.Object r11 = r10.f64854f
                c40.r0 r11 = (c40.r0) r11
                k0.a r1 = k0.a.this
                k0.a$b r3 = r10.f64856h
                android.graphics.drawable.Drawable r3 = r3.e()
                o0.j r4 = r10.f64857i
                java.util.List<s0.d> r5 = r10.f64858j
                android.graphics.Bitmap r1 = k0.a.b(r1, r3, r4, r5)
                b0.c r3 = r10.f64859k
                coil.request.ImageRequest r4 = r10.f64860l
                r3.F(r4, r1)
                java.util.List<s0.d> r3 = r10.f64858j
                o0.j r4 = r10.f64857i
                int r5 = r3.size()
                r6 = 0
                r9 = r6
                r6 = r11
                r11 = r1
                r1 = r5
                r5 = r3
                r3 = r9
            L54:
                if (r3 >= r1) goto L7a
                java.lang.Object r7 = r5.get(r3)
                s0.d r7 = (s0.d) r7
                q0.g r8 = r4.p()
                r10.f64854f = r6
                r10.f64849a = r5
                r10.f64850b = r4
                r10.f64851c = r3
                r10.f64852d = r1
                r10.f64853e = r2
                java.lang.Object r11 = r7.a(r11, r8, r10)
                if (r11 != r0) goto L73
                return r0
            L73:
                android.graphics.Bitmap r11 = (android.graphics.Bitmap) r11
                c40.s0.j(r6)
                int r3 = r3 + r2
                goto L54
            L7a:
                b0.c r0 = r10.f64859k
                coil.request.ImageRequest r1 = r10.f64860l
                r0.I(r1, r11)
                k0.a$b r2 = r10.f64856h
                coil.request.ImageRequest r0 = r10.f64860l
                android.content.Context r0 = r0.l()
                android.content.res.Resources r0 = r0.getResources()
                android.graphics.drawable.BitmapDrawable r3 = new android.graphics.drawable.BitmapDrawable
                r3.<init>(r0, r11)
                r7 = 14
                r8 = 0
                r4 = 0
                r5 = 0
                r6 = 0
                k0.a$b r11 = k0.a.b.b(r2, r3, r4, r5, r6, r7, r8)
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: k0.a.i.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public a(@k b0.f fVar, @k y yVar, @k l lVar, @m80.l w wVar) {
        this.f64785a = fVar;
        this.f64786b = yVar;
        this.f64787c = lVar;
        this.f64788d = wVar;
        this.f64789e = new coil.memory.c(fVar, lVar, wVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // k0.b
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@m80.k k0.b.a r14, @m80.k j00.c<? super o0.g> r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof k0.a.g
            if (r0 == 0) goto L13
            r0 = r15
            k0.a$g r0 = (k0.a.g) r0
            int r1 = r0.f64840e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f64840e = r1
            goto L18
        L13:
            k0.a$g r0 = new k0.a$g
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f64838c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f64840e
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r14 = r0.f64837b
            k0.b$a r14 = (k0.b.a) r14
            java.lang.Object r0 = r0.f64836a
            r1 = r0
            k0.a r1 = (k0.a) r1
            kotlin.e.n(r15)     // Catch: java.lang.Throwable -> L32
            return r15
        L32:
            r0 = move-exception
            r15 = r0
            r5 = r13
            goto Lae
        L37:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L3f:
            kotlin.e.n(r15)
            coil.request.ImageRequest r6 = r14.f()     // Catch: java.lang.Throwable -> La9
            java.lang.Object r15 = r6.m()     // Catch: java.lang.Throwable -> La9
            q0.g r2 = r14.getSize()     // Catch: java.lang.Throwable -> La9
            b0.c r9 = u0.l.m(r14)     // Catch: java.lang.Throwable -> La9
            o0.l r4 = r13.f64787c     // Catch: java.lang.Throwable -> La9
            o0.j r8 = r4.f(r6, r2)     // Catch: java.lang.Throwable -> La9
            coil.size.Scale r4 = r8.o()     // Catch: java.lang.Throwable -> La9
            r9.E(r6, r15)     // Catch: java.lang.Throwable -> La9
            b0.f r5 = r13.f64785a     // Catch: java.lang.Throwable -> La9
            b0.b r5 = r5.b()     // Catch: java.lang.Throwable -> La9
            java.lang.Object r7 = r5.g(r15, r8)     // Catch: java.lang.Throwable -> La9
            r9.j(r6, r7)     // Catch: java.lang.Throwable -> La9
            coil.memory.c r15 = r13.f64789e     // Catch: java.lang.Throwable -> La9
            coil.memory.MemoryCache$Key r10 = r15.f(r6, r7, r8, r9)     // Catch: java.lang.Throwable -> La9
            if (r10 == 0) goto L80
            coil.memory.c r15 = r13.f64789e     // Catch: java.lang.Throwable -> L7b
            coil.memory.MemoryCache$b r15 = r15.a(r6, r10, r2, r4)     // Catch: java.lang.Throwable -> L7b
            goto L81
        L7b:
            r0 = move-exception
            r15 = r0
            r1 = r13
            r5 = r1
            goto Lae
        L80:
            r15 = 0
        L81:
            if (r15 == 0) goto L8a
            coil.memory.c r0 = r13.f64789e     // Catch: java.lang.Throwable -> L7b
            o0.m r14 = r0.g(r14, r6, r10, r15)     // Catch: java.lang.Throwable -> L7b
            return r14
        L8a:
            c40.m0 r15 = r6.v()     // Catch: java.lang.Throwable -> La9
            k0.a$h r4 = new k0.a$h     // Catch: java.lang.Throwable -> La9
            r12 = 0
            r5 = r13
            r11 = r14
            r4.<init>(r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> La4
            r0.f64836a = r5     // Catch: java.lang.Throwable -> La4
            r0.f64837b = r11     // Catch: java.lang.Throwable -> La4
            r0.f64840e = r3     // Catch: java.lang.Throwable -> La4
            java.lang.Object r14 = c40.i.h(r15, r4, r0)     // Catch: java.lang.Throwable -> La4
            if (r14 != r1) goto La3
            return r1
        La3:
            return r14
        La4:
            r0 = move-exception
            r15 = r0
            r1 = r5
            r14 = r11
            goto Lae
        La9:
            r0 = move-exception
            r5 = r13
            r11 = r14
            r15 = r0
            r1 = r5
        Lae:
            boolean r0 = r15 instanceof java.util.concurrent.CancellationException
            if (r0 != 0) goto Lbd
            o0.l r0 = r1.f64787c
            coil.request.ImageRequest r14 = r14.f()
            o0.e r14 = r0.a(r14, r15)
            return r14
        Lbd:
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.a.a(k0.b$a, j00.c):java.lang.Object");
    }

    public final Bitmap h(Drawable drawable, j jVar, List<? extends s0.d> list) {
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            Bitmap.Config d11 = u0.a.d(bitmap);
            if (a0.B8(u0.l.w(), d11)) {
                return bitmap;
            }
            w wVar = this.f64788d;
            if (wVar != null && wVar.getLevel() <= 4) {
                wVar.a(f64784g, 4, "Converting bitmap with config " + d11 + " to apply transformations: " + list + '.', null);
            }
        } else {
            w wVar2 = this.f64788d;
            if (wVar2 != null && wVar2.getLevel() <= 4) {
                wVar2.a(f64784g, 4, "Converting drawable of type " + drawable.getClass().getCanonicalName() + " to apply transformations: " + list + '.', null);
            }
        }
        return u0.p.f91463a.a(drawable, jVar.f(), jVar.p(), jVar.o(), jVar.c());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0097 -> B:10:0x009e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(i0.m r8, b0.b r9, coil.request.ImageRequest r10, java.lang.Object r11, o0.j r12, b0.c r13, j00.c<? super k0.a.b> r14) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.a.i(i0.m, b0.b, coil.request.ImageRequest, java.lang.Object, o0.j, b0.c, j00.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x01d3, code lost:
    
        if (r0 == r9) goto L74;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0137 A[Catch: all -> 0x0089, TRY_LEAVE, TryCatch #3 {all -> 0x0089, blocks: (B:42:0x0079, B:44:0x012c, B:46:0x0137), top: B:41:0x0079 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0175 A[Catch: all -> 0x0058, TryCatch #2 {all -> 0x0058, blocks: (B:26:0x0053, B:27:0x0167, B:51:0x014c, B:67:0x0175, B:69:0x0180, B:71:0x01ef, B:72:0x01f4), top: B:8:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x011d  */
    /* JADX WARN: Type inference failed for: r2v11, types: [T, o0.j] */
    /* JADX WARN: Type inference failed for: r2v16, types: [T, b0.b] */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v8, types: [T, b0.b] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(coil.request.ImageRequest r24, java.lang.Object r25, o0.j r26, b0.c r27, j00.c<? super k0.a.b> r28) {
        /*
            Method dump skipped, instructions count: 522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.a.j(coil.request.ImageRequest, java.lang.Object, o0.j, b0.c, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x009c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0091 -> B:10:0x0095). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(b0.b r8, coil.request.ImageRequest r9, java.lang.Object r10, o0.j r11, b0.c r12, j00.c<? super i0.h> r13) {
        /*
            Method dump skipped, instructions count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.a.k(b0.b, coil.request.ImageRequest, java.lang.Object, o0.j, b0.c, j00.c):java.lang.Object");
    }

    @m80.l
    @VisibleForTesting
    public final Object l(@k b bVar, @k ImageRequest imageRequest, @k j jVar, @k b0.c cVar, @k j00.c<? super b> cVar2) {
        List<s0.d> O = imageRequest.O();
        if (O.isEmpty()) {
            return bVar;
        }
        if ((bVar.e() instanceof BitmapDrawable) || imageRequest.g()) {
            return c40.i.h(imageRequest.N(), new i(bVar, jVar, O, cVar, imageRequest, null), cVar2);
        }
        w wVar = this.f64788d;
        if (wVar != null && wVar.getLevel() <= 4) {
            wVar.a(f64784g, 4, "allowConversionToBitmap=false, skipping transformations for type " + bVar.e().getClass().getCanonicalName() + '.', null);
        }
        return bVar;
    }
}

package io.ktor.client.engine.cio;

import a00.h0;
import c40.b2;
import c40.n2;
import c40.r0;
import c40.s0;
import com.jiongji.andriod.card.R;
import cx.f0;
import io.ktor.client.call.UnsupportedContentTypeException;
import io.ktor.utils.io.i0;
import io.ktor.utils.io.j0;
import io.ktor.utils.io.m0;
import ix.f1;
import ix.g1;
import ix.q0;
import ix.y0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import mx.v;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nutils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 utils.kt\nio/ktor/client/engine/cio/UtilsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Closeable.kt\nio/ktor/utils/io/core/CloseableKt\n*L\n1#1,311:1\n1#2:312\n12#3,14:313\n*S KotlinDebug\n*F\n+ 1 utils.kt\nio/ktor/client/engine/cio/UtilsKt\n*L\n243#1:313,14\n*E\n"})
/* loaded from: classes8.dex */
public final class c0 {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.engine.cio.UtilsKt$readResponse$2", f = "utils.kt", i = {}, l = {173}, m = "invokeSuspend", n = {}, s = {})
    @u0({"SMAP\nutils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 utils.kt\nio/ktor/client/engine/cio/UtilsKt$readResponse$2\n+ 2 Closeable.kt\nio/ktor/utils/io/core/CloseableKt\n*L\n1#1,311:1\n12#2,14:312\n*S KotlinDebug\n*F\n+ 1 utils.kt\nio/ktor/client/engine/cio/UtilsKt$readResponse$2\n*L\n176#1:312,14\n*E\n"})
    public static final class a extends SuspendLambda implements x00.p<r0, j00.c<? super f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f60810a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ io.ktor.utils.io.g f60811b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ io.ktor.utils.io.m f60812c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ kotlin.coroutines.d f60813d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ bz.b f60814e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ cx.z f60815f;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "io.ktor.client.engine.cio.UtilsKt$readResponse$2$1$body$httpBodyParser$1", f = "utils.kt", i = {}, l = {201}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: io.ktor.client.engine.cio.c0$a$a, reason: collision with other inner class name */
        public static final class C0701a extends SuspendLambda implements x00.p<m0, j00.c<? super g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f60816a;

            /* renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f60817b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ f1 f60818c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ long f60819d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ String f60820e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ kx.m f60821f;

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ io.ktor.utils.io.g f60822g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0701a(f1 f1Var, long j11, String str, kx.m mVar, io.ktor.utils.io.g gVar, j00.c<? super C0701a> cVar) {
                super(2, cVar);
                this.f60818c = f1Var;
                this.f60819d = j11;
                this.f60820e = str;
                this.f60821f = mVar;
                this.f60822g = gVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                C0701a c0701a = new C0701a(this.f60818c, this.f60819d, this.f60820e, this.f60821f, this.f60822g, cVar);
                c0701a.f60817b = obj;
                return c0701a;
            }

            @Override // x00.p
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public final Object invoke(m0 m0Var, j00.c<? super g2> cVar) {
                return ((C0701a) create(m0Var, cVar)).invokeSuspend(g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f60816a;
                if (i11 == 0) {
                    kotlin.e.n(obj);
                    m0 m0Var = (m0) this.f60817b;
                    f1 f1Var = this.f60818c;
                    long j11 = this.f60819d;
                    String str = this.f60820e;
                    kx.m mVar = this.f60821f;
                    io.ktor.utils.io.g gVar = this.f60822g;
                    io.ktor.utils.io.m a11 = m0Var.a();
                    this.f60816a = 1;
                    if (kx.n.g(f1Var, j11, str, mVar, gVar, a11, this) == l11) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(io.ktor.utils.io.g gVar, io.ktor.utils.io.m mVar, kotlin.coroutines.d dVar, bz.b bVar, cx.z zVar, j00.c<? super a> cVar) {
            super(2, cVar);
            this.f60811b = gVar;
            this.f60812c = mVar;
            this.f60813d = dVar;
            this.f60814e = bVar;
            this.f60815f = zVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return new a(this.f60811b, this.f60812c, this.f60813d, this.f60814e, this.f60815f, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super f0> cVar) {
            return ((a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Removed duplicated region for block: B:35:0x013f A[Catch: all -> 0x0063, TryCatch #1 {all -> 0x0063, blocks: (B:9:0x0037, B:11:0x0058, B:13:0x005e, B:14:0x0069, B:16:0x0077, B:17:0x007d, B:19:0x00b2, B:24:0x00ca, B:26:0x00da, B:28:0x00f0, B:31:0x00f7, B:33:0x012e, B:35:0x013f, B:38:0x0152, B:43:0x0127), top: B:8:0x0037 }] */
        /* JADX WARN: Removed duplicated region for block: B:42:0x014f  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r24) {
            /*
                Method dump skipped, instructions count: 366
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.engine.cio.c0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.engine.cio.UtilsKt", f = "utils.kt", i = {0, 0, 0, 1, 1, 2, 2, 3, 3, 3}, l = {R.styleable.Theme_drawable_tab_review, R.styleable.Theme_drawable_tab_surrounding, R.styleable.Theme_drawable_test_nodate, R.styleable.Theme_drawable_walk_sound4}, m = "startTunnel", n = {"output", "input", "builder", "input", "builder", "input", "builder", "builder", "$this$use$iv", "closed$iv"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "I$0"})
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f60823a;

        /* renamed from: b, reason: collision with root package name */
        public Object f60824b;

        /* renamed from: c, reason: collision with root package name */
        public Object f60825c;

        /* renamed from: d, reason: collision with root package name */
        public int f60826d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f60827e;

        /* renamed from: f, reason: collision with root package name */
        public int f60828f;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f60827e = obj;
            this.f60828f |= Integer.MIN_VALUE;
            return c0.k(null, null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.engine.cio.UtilsKt$withoutClosePropagation$2", f = "utils.kt", i = {}, l = {290, 291}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements x00.p<j0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f60829a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f60830b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ io.ktor.utils.io.m f60831c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(io.ktor.utils.io.m mVar, j00.c<? super c> cVar) {
            super(2, cVar);
            this.f60831c = mVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            c cVar2 = new c(this.f60831c, cVar);
            cVar2.f60830b = obj;
            return cVar2;
        }

        @Override // x00.p
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(j0 j0Var, j00.c<? super g2> cVar) {
            return ((c) create(j0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
        
            if (r6.g(r5) == r0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
        
            if (io.ktor.utils.io.j.g(r6, r1, Long.MAX_VALUE, r5) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r5.f60829a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.e.n(r6)
                goto L44
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                kotlin.e.n(r6)
                goto L39
            L1e:
                kotlin.e.n(r6)
                java.lang.Object r6 = r5.f60830b
                io.ktor.utils.io.j0 r6 = (io.ktor.utils.io.j0) r6
                io.ktor.utils.io.g r6 = r6.a()
                io.ktor.utils.io.m r1 = r5.f60831c
                r5.f60829a = r3
                r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                java.lang.Object r6 = io.ktor.utils.io.j.g(r6, r1, r3, r5)
                if (r6 != r0) goto L39
                goto L43
            L39:
                io.ktor.utils.io.m r6 = r5.f60831c
                r5.f60829a = r2
                java.lang.Object r6 = r6.g(r5)
                if (r6 != r0) goto L44
            L43:
                return r0
            L44:
                yz.g2 r6 = yz.g2.f100423a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.engine.cio.c0.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.engine.cio.UtilsKt$writeBody$2", f = "utils.kt", i = {}, l = {130, 135, 137, 135, 137}, m = "invokeSuspend", n = {}, s = {})
    @u0({"SMAP\nutils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 utils.kt\nio/ktor/client/engine/cio/UtilsKt$writeBody$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,311:1\n1#2:312\n*E\n"})
    public static final class d extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f60832a;

        /* renamed from: b, reason: collision with root package name */
        public int f60833b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ cx.z f60834c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ mx.v f60835d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ io.ktor.utils.io.m f60836e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ i0 f60837f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ io.ktor.utils.io.m f60838g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ boolean f60839h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(cx.z zVar, mx.v vVar, io.ktor.utils.io.m mVar, i0 i0Var, io.ktor.utils.io.m mVar2, boolean z11, j00.c<? super d> cVar) {
            super(2, cVar);
            this.f60834c = zVar;
            this.f60835d = vVar;
            this.f60836e = mVar;
            this.f60837f = i0Var;
            this.f60838g = mVar2;
            this.f60839h = z11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return new d(this.f60834c, this.f60835d, this.f60836e, this.f60837f, this.f60838g, this.f60839h, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((d) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:63:0x0077, code lost:
        
            if (io.ktor.utils.io.q.l(r10, r9) == r0) goto L66;
         */
        /* JADX WARN: Code restructure failed: missing block: B:66:0x005c, code lost:
        
            if (r10.g(r9) == r0) goto L66;
         */
        /* JADX WARN: Code restructure failed: missing block: B:70:0x0050, code lost:
        
            if (io.ktor.client.engine.cio.c0.i(r10, r1, r8, r9) == r0) goto L66;
         */
        /* JADX WARN: Code restructure failed: missing block: B:78:0x00ae, code lost:
        
            if (r1.g(r9) != r0) goto L57;
         */
        /* JADX WARN: Removed duplicated region for block: B:17:0x00e1  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x00e5  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00ea  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x008c  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x0090  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0095  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                Method dump skipped, instructions count: 240
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.engine.cio.c0.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.engine.cio.UtilsKt", f = "utils.kt", i = {0, 0, 0, 1, 1, 1, 2, 2}, l = {91, 92, 95}, m = "writeHeaders", n = {"output", "builder", "closeChannel", "output", "builder", "closeChannel", "builder", "cause"}, s = {"L$0", "L$1", "Z$0", "L$0", "L$1", "Z$0", "L$0", "L$1"})
    public static final class e extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f60840a;

        /* renamed from: b, reason: collision with root package name */
        public Object f60841b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f60842c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f60843d;

        /* renamed from: e, reason: collision with root package name */
        public int f60844e;

        public e(j00.c<? super e> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f60843d = obj;
            this.f60844e |= Integer.MIN_VALUE;
            return c0.r(null, null, false, false, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.engine.cio.UtilsKt$writeRequest$2", f = "utils.kt", i = {}, l = {31, 32}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f60845a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ cx.z f60846b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ io.ktor.utils.io.m f60847c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f60848d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f60849e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ kotlin.coroutines.d f60850f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(cx.z zVar, io.ktor.utils.io.m mVar, boolean z11, boolean z12, kotlin.coroutines.d dVar, j00.c<? super f> cVar) {
            super(2, cVar);
            this.f60846b = zVar;
            this.f60847c = mVar;
            this.f60848d = z11;
            this.f60849e = z12;
            this.f60850f = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return new f(this.f60846b, this.f60847c, this.f60848d, this.f60849e, this.f60850f, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((f) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0043, code lost:
        
            if (io.ktor.client.engine.cio.c0.q(r3, r4, r5, false, r10, 8, null) == r0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
        
            if (io.ktor.client.engine.cio.c0.r(r11, r1, r4, r5, r10) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r10.f60845a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.e.n(r11)
                goto L46
            L12:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L1a:
                kotlin.e.n(r11)
                goto L32
            L1e:
                kotlin.e.n(r11)
                cx.z r11 = r10.f60846b
                io.ktor.utils.io.m r1 = r10.f60847c
                boolean r4 = r10.f60848d
                boolean r5 = r10.f60849e
                r10.f60845a = r3
                java.lang.Object r11 = io.ktor.client.engine.cio.c0.r(r11, r1, r4, r5, r10)
                if (r11 != r0) goto L32
                goto L45
            L32:
                cx.z r3 = r10.f60846b
                io.ktor.utils.io.m r4 = r10.f60847c
                kotlin.coroutines.d r5 = r10.f60850f
                r10.f60845a = r2
                r6 = 0
                r8 = 8
                r9 = 0
                r7 = r10
                java.lang.Object r11 = io.ktor.client.engine.cio.c0.q(r3, r4, r5, r6, r7, r8, r9)
                if (r11 != r0) goto L46
            L45:
                return r0
            L46:
                yz.g2 r11 = yz.g2.f100423a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.engine.cio.c0.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final boolean d(@m80.l String str, @m80.k mx.v body) {
        g0.p(body, "body");
        return (str == null || (body instanceof v.c)) ? false : true;
    }

    public static final mx.v e(mx.v vVar) {
        return vVar instanceof v.b ? e(((v.b) vVar).n()) : vVar;
    }

    @m80.k
    public static final io.ktor.utils.io.m f(@m80.k io.ktor.utils.io.m mVar, @m80.k kotlin.coroutines.d coroutineContext, boolean z11) {
        g0.p(mVar, "<this>");
        g0.p(coroutineContext, "coroutineContext");
        return z11 ? mVar : n(mVar, coroutineContext, false, 2, null);
    }

    public static final boolean g(@m80.l String str, @m80.l String str2, @m80.l String str3) {
        return str == null || g0.g(str2, c80.f.f8329r) || g0.g(str3, c80.f.f8329r);
    }

    public static final boolean h(@m80.k g1 g1Var) {
        g0.p(g1Var, "<this>");
        return g1Var.p0() / 100 == 1;
    }

    public static final Object i(cx.z zVar, mx.v vVar, io.ktor.utils.io.m mVar, j00.c<? super g2> cVar) {
        if (vVar instanceof v.a) {
            Object s11 = io.ktor.utils.io.q.s(mVar, ((v.a) vVar).m(), 0, 0, cVar, 6, null);
            return s11 == kotlin.coroutines.intrinsics.b.l() ? s11 : g2.f100423a;
        }
        if (vVar instanceof v.e) {
            Object f11 = io.ktor.utils.io.j.f(((v.e) vVar).m(), mVar, cVar);
            return f11 == kotlin.coroutines.intrinsics.b.l() ? f11 : g2.f100423a;
        }
        if (vVar instanceof v.f) {
            Object m11 = ((v.f) vVar).m(mVar, cVar);
            return m11 == kotlin.coroutines.intrinsics.b.l() ? m11 : g2.f100423a;
        }
        if (vVar instanceof v.b) {
            Object i11 = i(zVar, ((v.b) vVar).n(), mVar, cVar);
            return i11 == kotlin.coroutines.intrinsics.b.l() ? i11 : g2.f100423a;
        }
        if (vVar instanceof v.d) {
            throw new IllegalStateException("unreachable code");
        }
        if (vVar instanceof v.c) {
            throw new IllegalStateException("unreachable code");
        }
        throw new NoWhenBranchMatchedException();
    }

    @m80.l
    public static final Object j(@m80.k bz.b bVar, @m80.k cx.z zVar, @m80.k io.ktor.utils.io.g gVar, @m80.k io.ktor.utils.io.m mVar, @m80.k kotlin.coroutines.d dVar, @m80.k j00.c<? super f0> cVar) {
        return c40.i.h(dVar, new a(gVar, mVar, dVar, bVar, zVar, null), cVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x018a, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x018d, code lost:
    
        throw r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0122, code lost:
    
        if (r13 != r1) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x016e A[Catch: all -> 0x0056, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0056, blocks: (B:20:0x016e, B:45:0x004e, B:66:0x0061, B:67:0x0118, B:70:0x0073, B:71:0x0107), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0181 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0116 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r10v0, types: [cx.z] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v2, types: [kx.c0] */
    /* JADX WARN: Type inference failed for: r10v20, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v24, types: [kx.c0] */
    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v35, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r10v36 */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object k(@m80.k cx.z r10, @m80.k io.ktor.utils.io.m r11, @m80.k io.ktor.utils.io.g r12, @m80.k j00.c<? super yz.g2> r13) {
        /*
            Method dump skipped, instructions count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.engine.cio.c0.k(cx.z, io.ktor.utils.io.m, io.ktor.utils.io.g, j00.c):java.lang.Object");
    }

    @m80.k
    public static final Map<String, List<String>> l(@m80.k kx.s sVar) {
        g0.p(sVar, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int m11 = sVar.m();
        for (int i11 = 0; i11 < m11; i11++) {
            String obj = sVar.n(i11).toString();
            String obj2 = sVar.q(i11).toString();
            List list = (List) linkedHashMap.get(obj);
            if ((list != null ? Boolean.valueOf(list.add(obj2)) : null) == null) {
                linkedHashMap.put(obj, h0.U(obj2));
            }
        }
        return linkedHashMap;
    }

    @m80.k
    public static final io.ktor.utils.io.m m(@m80.k final io.ktor.utils.io.m mVar, @m80.k kotlin.coroutines.d coroutineContext, boolean z11) {
        g0.p(mVar, "<this>");
        g0.p(coroutineContext, "coroutineContext");
        if (z11) {
            n2.A(coroutineContext).z0(new x00.l() { // from class: io.ktor.client.engine.cio.a0
                @Override // x00.l
                public final Object invoke(Object obj) {
                    g2 o11;
                    o11 = c0.o(io.ktor.utils.io.m.this, (Throwable) obj);
                    return o11;
                }
            });
        }
        return io.ktor.utils.io.j.R(b2.f7824a, coroutineContext, true, new c(mVar, null)).b();
    }

    public static /* synthetic */ io.ktor.utils.io.m n(io.ktor.utils.io.m mVar, kotlin.coroutines.d dVar, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        return m(mVar, dVar, z11);
    }

    public static final g2 o(io.ktor.utils.io.m mVar, Throwable th2) {
        io.ktor.utils.io.q.e(mVar, th2);
        return g2.f100423a;
    }

    @m80.l
    public static final Object p(@m80.k cx.z zVar, @m80.k io.ktor.utils.io.m mVar, @m80.k kotlin.coroutines.d dVar, boolean z11, @m80.k j00.c<? super g2> cVar) {
        io.ktor.utils.io.m b11;
        mx.v e11 = e(zVar.b());
        if (e11 instanceof v.c) {
            if (z11) {
                io.ktor.utils.io.n.c(mVar);
            }
            return g2.f100423a;
        }
        if (e11 instanceof v.d) {
            throw new UnsupportedContentTypeException(e11);
        }
        q0 e12 = zVar.e();
        y0 y0Var = y0.f63006a;
        String str = e12.get(y0Var.z());
        if (str == null) {
            Long a11 = e11.a();
            str = a11 != null ? a11.toString() : null;
        }
        i0 e13 = g(str, e11.d().get(y0Var.G0()), zVar.e().get(y0Var.G0())) ? kx.h.e(mVar, dVar) : null;
        c40.k.f(s0.a(dVar.plus(new c40.q0("Request body writer"))), null, null, new d(zVar, e11, (e13 == null || (b11 = e13.b()) == null) ? mVar : b11, e13, mVar, z11, null), 3, null);
        return g2.f100423a;
    }

    public static /* synthetic */ Object q(cx.z zVar, io.ktor.utils.io.m mVar, kotlin.coroutines.d dVar, boolean z11, j00.c cVar, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            z11 = true;
        }
        return p(zVar, mVar, dVar, z11, cVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0193, code lost:
    
        if (r1.g(r2) != r3) goto L79;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object r(@m80.k cx.z r17, @m80.k io.ktor.utils.io.m r18, boolean r19, boolean r20, @m80.k j00.c<? super yz.g2> r21) {
        /*
            Method dump skipped, instructions count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.engine.cio.c0.r(cx.z, io.ktor.utils.io.m, boolean, boolean, j00.c):java.lang.Object");
    }

    public static /* synthetic */ Object s(cx.z zVar, io.ktor.utils.io.m mVar, boolean z11, boolean z12, j00.c cVar, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            z12 = true;
        }
        return r(zVar, mVar, z11, z12, cVar);
    }

    public static final g2 t(kx.c0 c0Var, String key, String value) {
        g0.p(key, "key");
        g0.p(value, "value");
        y0 y0Var = y0.f63006a;
        if (g0.g(key, y0Var.z()) || g0.g(key, y0Var.K())) {
            return g2.f100423a;
        }
        c0Var.f(key, value);
        return g2.f100423a;
    }

    @m80.l
    public static final Object u(@m80.k cx.z zVar, @m80.k io.ktor.utils.io.m mVar, @m80.k kotlin.coroutines.d dVar, boolean z11, boolean z12, @m80.k j00.c<? super g2> cVar) {
        Object h11 = c40.i.h(dVar, new f(zVar, mVar, z11, z12, dVar, null), cVar);
        return h11 == kotlin.coroutines.intrinsics.b.l() ? h11 : g2.f100423a;
    }

    public static /* synthetic */ Object v(cx.z zVar, io.ktor.utils.io.m mVar, kotlin.coroutines.d dVar, boolean z11, boolean z12, j00.c cVar, int i11, Object obj) {
        if ((i11 & 16) != 0) {
            z12 = true;
        }
        return u(zVar, mVar, dVar, z11, z12, cVar);
    }
}

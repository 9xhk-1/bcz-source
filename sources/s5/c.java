package s5;

import c4.j;
import c4.o;
import c40.r0;
import com.baicizhan.app.preferences.g;
import com.microsoft.thrifty.service.a;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.x0;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.e0;
import kotlinx.coroutines.flow.x;
import l7.i0;
import l7.p;
import m80.k;
import m80.l;
import oa0.r;
import u8.a;
import u8.h;
import ws.i;
import y7.d;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r(binds = {s5.a.class})
@u0({"SMAP\nPromotionPopupRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PromotionPopupRepo.kt\ncom/baicizhan/app/biz/game/repo/monetization/PromotionPopupRepoImpl\n+ 2 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService\n+ 3 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt\n+ 4 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService$thrift$1\n+ 5 Koin.kt\norg/koin/core/Koin\n+ 6 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,111:1\n6#2:112\n64#3,2:113\n66#3:116\n67#3,2:122\n6#4:115\n124#5,4:117\n142#6:121\n*S KotlinDebug\n*F\n+ 1 PromotionPopupRepo.kt\ncom/baicizhan/app/biz/game/repo/monetization/PromotionPopupRepoImpl\n*L\n39#1:112\n39#1:113,2\n39#1:116\n39#1:122,2\n39#1:115\n39#1:117,4\n39#1:121\n*E\n"})
/* loaded from: classes3.dex */
public final class c implements s5.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final p f87820a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.baicizhan.app.preferences.a f87821b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.baicizhan.app.biz.auth.r f87822c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final x<Boolean> f87823d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.monetization.PromotionPopupRepoImpl", f = "PromotionPopupRepo.kt", i = {1, 2}, l = {93, 94, 98}, m = "fetch", n = {"pop", "pop"}, s = {"L$0", "L$0"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f87824a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f87825b;

        /* renamed from: d, reason: collision with root package name */
        public int f87827d;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f87825b = obj;
            this.f87827d |= Integer.MIN_VALUE;
            return c.this.b(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.monetization.PromotionPopupRepoImpl$getAppHomePageMemberStageInfo$2", f = "PromotionPopupRepo.kt", i = {0, 0, 0}, l = {60}, m = "invokeSuspend", n = {"$this$withContext", "$this$invokeSuspend_u24lambda_u240", "$i$a$-runCatching-PromotionPopupRepoImpl$getAppHomePageMemberStageInfo$2$1"}, s = {"L$0", "L$1", "I$0"}, v = 1)
    public static final class b extends SuspendLambda implements x00.p<r0, j00.c<? super u8.a>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f87828a;

        /* renamed from: b, reason: collision with root package name */
        public int f87829b;

        /* renamed from: c, reason: collision with root package name */
        public int f87830c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f87831d;

        public b(j00.c<? super b> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            b bVar = c.this.new b(cVar);
            bVar.f87831d = obj;
            return bVar;
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super u8.a> cVar) {
            return ((b) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object m6308constructorimpl;
            r0 r0Var = (r0) this.f87831d;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f87830c;
            try {
                if (i11 == 0) {
                    kotlin.e.n(obj);
                    c cVar = c.this;
                    Result.a aVar = Result.Companion;
                    g l12 = cVar.l();
                    this.f87831d = l00.k.a(r0Var);
                    this.f87828a = l00.k.a(r0Var);
                    this.f87829b = 0;
                    this.f87830c = 1;
                    obj = l12.c(d.f87840b, null, this);
                    if (obj == l11) {
                        return l11;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.e.n(obj);
                }
                byte[] bArr = (byte[]) obj;
                m6308constructorimpl = Result.m6308constructorimpl(bArr != null ? (u8.a) l7.d.c(bArr, u8.a.f91887d) : null);
            } catch (Throwable th2) {
                Result.a aVar2 = Result.Companion;
                m6308constructorimpl = Result.m6308constructorimpl(kotlin.e.a(th2));
            }
            u8.a aVar3 = (u8.a) (Result.m6314isFailureimpl(m6308constructorimpl) ? null : m6308constructorimpl);
            return aVar3 == null ? new a.b().build() : aVar3;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1\n*L\n1#1,122:1\n*E\n"})
    /* renamed from: s5.c$c, reason: collision with other inner class name */
    public static final class C1141c implements x00.l<w7.d<h>, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h10.d f87833a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l7.e f87834b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l7.c f87835c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1$1\n*L\n1#1,77:1\n*E\n"})
        /* renamed from: s5.c$c$a */
        public static final class a implements x00.l<d.a, g2> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ l7.e f87836a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l7.c f87837b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ h10.d f87838c;

            public a(l7.e eVar, l7.c cVar, h10.d dVar) {
                this.f87836a = eVar;
                this.f87837b = cVar;
                this.f87838c = dVar;
            }

            public final void a(d.a randomRetry) {
                g0.p(randomRetry, "$this$randomRetry");
                Integer a11 = this.f87836a.a();
                if (a11 != null) {
                    randomRetry.i(a11.intValue());
                }
                Long b11 = this.f87836a.b();
                if (b11 != null) {
                    randomRetry.h(new Long[]{Long.valueOf(b11.longValue())});
                }
                randomRetry.j(this.f87837b.b(this.f87838c));
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(d.a aVar) {
                a(aVar);
                return g2.f100423a;
            }
        }

        public C1141c(h10.d dVar, l7.e eVar, l7.c cVar) {
            this.f87833a = dVar;
            this.f87834b = eVar;
            this.f87835c = cVar;
        }

        public final void a(w7.d<h> thriftBuilder) {
            g0.p(thriftBuilder, "$this$thriftBuilder");
            y7.f.a(thriftBuilder, new a(this.f87834b, this.f87835c, this.f87833a));
            x00.p<i, a.InterfaceC0480a, ?> pVar = i0.o().get(this.f87833a);
            g0.n(pVar, "null cannot be cast to non-null type kotlin.Function2<com.microsoft.thrifty.protocol.Protocol, com.microsoft.thrifty.service.AsyncClientBase.Listener, T of com.baicizhan.app.biz.thrift.ThriftServiceImplKt.thriftImpl>");
            thriftBuilder.f((x00.p) x0.q(pVar, 2));
            thriftBuilder.g(i0.a.b.f70581a);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(w7.d<h> dVar) {
            a(dVar);
            return g2.f100423a;
        }
    }

    public c(@k p thriftService, @k com.baicizhan.app.preferences.a factory, @k com.baicizhan.app.biz.auth.r tokenProvider) {
        g0.p(thriftService, "thriftService");
        g0.p(factory, "factory");
        g0.p(tokenProvider, "tokenProvider");
        this.f87820a = thriftService;
        this.f87821b = factory;
        this.f87822c = tokenProvider;
        x<Boolean> a11 = e0.a(1, 0, BufferOverflow.DROP_OLDEST);
        a11.d(Boolean.TRUE);
        this.f87823d = a11;
    }

    @Override // s5.a
    @l
    public Object a(@k j00.c<? super g2> cVar) {
        Object a11 = l().a(cVar);
        return a11 == kotlin.coroutines.intrinsics.b.l() ? a11 : g2.f100423a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0087, code lost:
    
        if (r9.emit(r4, r0) == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0089, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0072, code lost:
    
        if (r9.e(s5.d.f87840b, r6, r0) != r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0054, code lost:
    
        if (r9 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // s5.a
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(@m80.k j00.c<? super yz.g2> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof s5.c.a
            if (r0 == 0) goto L13
            r0 = r9
            s5.c$a r0 = (s5.c.a) r0
            int r1 = r0.f87827d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f87827d = r1
            goto L18
        L13:
            s5.c$a r0 = new s5.c$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f87825b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f87827d
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L47
            if (r2 == r5) goto L43
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r0 = r0.f87824a
            u8.a r0 = (u8.a) r0
            kotlin.e.n(r9)
            goto L8a
        L33:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L3b:
            java.lang.Object r2 = r0.f87824a
            u8.a r2 = (u8.a) r2
            kotlin.e.n(r9)
            goto L75
        L43:
            kotlin.e.n(r9)
            goto L57
        L47:
            kotlin.e.n(r9)
            u8.h r9 = r8.m()
            r0.f87827d = r5
            java.lang.Object r9 = r9.U7(r0)
            if (r9 != r1) goto L57
            goto L89
        L57:
            r2 = r9
            u8.a r2 = (u8.a) r2
            com.baicizhan.app.preferences.g r9 = r8.l()
            ts.a<u8.a, u8.a$b> r6 = u8.a.f91887d
            byte[] r6 = l7.d.a(r2, r6)
            java.lang.Object r7 = l00.k.a(r2)
            r0.f87824a = r7
            r0.f87827d = r4
            java.lang.String r4 = "KEY_APP_HOME_PAGE_SALE_INFO"
            java.lang.Object r9 = r9.e(r4, r6, r0)
            if (r9 != r1) goto L75
            goto L89
        L75:
            kotlinx.coroutines.flow.x<java.lang.Boolean> r9 = r8.f87823d
            java.lang.Boolean r4 = l00.a.a(r5)
            java.lang.Object r2 = l00.k.a(r2)
            r0.f87824a = r2
            r0.f87827d = r3
            java.lang.Object r9 = r9.emit(r4, r0)
            if (r9 != r1) goto L8a
        L89:
            return r1
        L8a:
            yz.g2 r9 = yz.g2.f100423a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: s5.c.b(j00.c):java.lang.Object");
    }

    @Override // s5.a
    @l
    public Object c(long j11, @k j00.c<? super g2> cVar) {
        Object i11 = l().i(d.f87841c, j11, cVar);
        return i11 == kotlin.coroutines.intrinsics.b.l() ? i11 : g2.f100423a;
    }

    @Override // s5.a
    @l
    public Object d(@k j00.c<? super Long> cVar) {
        return l().h(d.f87843e, 0L, cVar);
    }

    @Override // s5.a
    @l
    public Object e(@k j00.c<? super u8.a> cVar) {
        return c40.i.h(o.b(), new b(null), cVar);
    }

    @Override // s5.a
    @l
    public Object f(long j11, @k j00.c<? super g2> cVar) {
        Object i11 = l().i(d.f87843e, j11, cVar);
        return i11 == kotlin.coroutines.intrinsics.b.l() ? i11 : g2.f100423a;
    }

    @Override // s5.a
    @l
    public Object g(int i11, @k j00.c<? super g2> cVar) {
        Object f11 = l().f(d.f87842d, i11, cVar);
        return f11 == kotlin.coroutines.intrinsics.b.l() ? f11 : g2.f100423a;
    }

    @Override // s5.a
    @l
    public Object h(@k j00.c<? super Long> cVar) {
        return l().h(d.f87841c, 0L, cVar);
    }

    @Override // s5.a
    @l
    public Object i(@k j00.c<? super Integer> cVar) {
        return l().d(d.f87842d, 0, cVar);
    }

    @Override // s5.a
    @k
    public kotlinx.coroutines.flow.i<Boolean> j() {
        return this.f87823d;
    }

    public final g l() {
        com.baicizhan.app.preferences.a aVar = this.f87821b;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("PromotionPopupScope-");
        Long b11 = this.f87822c.b();
        g0.m(b11);
        sb2.append(b11.longValue());
        return aVar.a(sb2.toString());
    }

    public final h m() {
        return (h) w7.f.b(new C1141c(o0.d(h.class), new l7.e(null, null, 3, null), (l7.c) j.f7801a.a().P().h().i(o0.d(l7.c.class), null, null)));
    }
}

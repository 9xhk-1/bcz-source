package x5;

import c4.o;
import c40.r0;
import c40.x2;
import com.baicizhan.app.biz.base.BizInternalException;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.e0;
import kotlinx.coroutines.flow.x;
import m80.k;
import m80.l;
import oa0.r;
import p8.o0;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r(binds = {x5.b.class})
/* loaded from: classes3.dex */
public final class e implements x5.b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.baicizhan.app.preferences.a f97481a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.baicizhan.app.biz.auth.r f97482b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final x<Boolean> f97483c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.sentence.SentenceGameRepoV2Impl$getSentenceInfo$2", f = "SentenceGameRepoV2.kt", i = {}, l = {72}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class a extends SuspendLambda implements p<r0, j00.c<? super o0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f97484a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f97486c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i11, j00.c<? super a> cVar) {
            super(2, cVar);
            this.f97486c = i11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return e.this.new a(this.f97486c, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super o0> cVar) {
            return ((a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            o0 o0Var;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f97484a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                com.baicizhan.app.preferences.g g11 = e.this.g();
                String str = "sentence_current_info_" + this.f97486c;
                this.f97484a = 1;
                obj = g11.c(str, null, this);
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
            if (bArr != null && (o0Var = (o0) l7.d.c(bArr, o0.f80027h)) != null) {
                return o0Var;
            }
            throw new BizInternalException("SentenceCurrentInfo not found for skuId=" + this.f97486c, null, 0, 6, null);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.sentence.SentenceGameRepoV2Impl$updateSkuInfoInner$2", f = "SentenceGameRepoV2.kt", i = {0, 0, 0}, l = {57}, m = "invokeSuspend", n = {"$this$withContext", "$this$invokeSuspend_u24lambda_u240", "$i$a$-runCatching-SentenceGameRepoV2Impl$updateSkuInfoInner$2$1"}, s = {"L$0", "L$3", "I$1"}, v = 1)
    public static final class b extends SuspendLambda implements p<r0, j00.c<? super Result<? extends Boolean>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f97487a;

        /* renamed from: b, reason: collision with root package name */
        public Object f97488b;

        /* renamed from: c, reason: collision with root package name */
        public Object f97489c;

        /* renamed from: d, reason: collision with root package name */
        public int f97490d;

        /* renamed from: e, reason: collision with root package name */
        public int f97491e;

        /* renamed from: f, reason: collision with root package name */
        public int f97492f;

        /* renamed from: g, reason: collision with root package name */
        public /* synthetic */ Object f97493g;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ int f97495i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ o0 f97496j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i11, o0 o0Var, j00.c<? super b> cVar) {
            super(2, cVar);
            this.f97495i = i11;
            this.f97496j = o0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            b bVar = e.this.new b(this.f97495i, this.f97496j, cVar);
            bVar.f97493g = obj;
            return bVar;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(r0 r0Var, j00.c<? super Result<Boolean>> cVar) {
            return ((b) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object m6308constructorimpl;
            e eVar;
            int i11;
            o0 o0Var;
            r0 r0Var = (r0) this.f97493g;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i12 = this.f97492f;
            try {
                if (i12 == 0) {
                    kotlin.e.n(obj);
                    eVar = e.this;
                    int i13 = this.f97495i;
                    o0 o0Var2 = this.f97496j;
                    Result.a aVar = Result.Companion;
                    com.baicizhan.app.preferences.g g11 = eVar.g();
                    String str = "sentence_current_info_" + i13;
                    byte[] a11 = l7.d.a(o0Var2, o0.f80027h);
                    this.f97493g = l00.k.a(r0Var);
                    this.f97487a = eVar;
                    this.f97488b = o0Var2;
                    this.f97489c = l00.k.a(r0Var);
                    this.f97490d = i13;
                    this.f97491e = 0;
                    this.f97492f = 1;
                    if (g11.e(str, a11, this) == l11) {
                        return l11;
                    }
                    i11 = i13;
                    o0Var = o0Var2;
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i11 = this.f97490d;
                    o0Var = (o0) this.f97488b;
                    eVar = (e) this.f97487a;
                    kotlin.e.n(obj);
                }
                z6.b.j(z6.b.f101032b, f.f97497a, "Updated sku info: skuId=" + i11 + ", data=" + o0Var, null, 4, null);
                m6308constructorimpl = Result.m6308constructorimpl(l00.a.a(eVar.f97483c.d(l00.a.a(true))));
            } catch (Throwable th2) {
                Result.a aVar2 = Result.Companion;
                m6308constructorimpl = Result.m6308constructorimpl(kotlin.e.a(th2));
            }
            int i14 = this.f97495i;
            Throwable m6311exceptionOrNullimpl = Result.m6311exceptionOrNullimpl(m6308constructorimpl);
            if (m6311exceptionOrNullimpl == null) {
                return Result.m6307boximpl(m6308constructorimpl);
            }
            z6.b.f101032b.e(f.f97497a, "Failed to update sku info for skuId=" + i14, m6311exceptionOrNullimpl);
            throw m6311exceptionOrNullimpl;
        }

        @Override // x00.p
        public /* bridge */ /* synthetic */ Object invoke(r0 r0Var, j00.c<? super Result<? extends Boolean>> cVar) {
            return invoke2(r0Var, (j00.c<? super Result<Boolean>>) cVar);
        }
    }

    public e(@k com.baicizhan.app.preferences.a factory, @k com.baicizhan.app.biz.auth.r tokenProvider) {
        g0.p(factory, "factory");
        g0.p(tokenProvider, "tokenProvider");
        this.f97481a = factory;
        this.f97482b = tokenProvider;
        x<Boolean> a11 = e0.a(1, 0, BufferOverflow.DROP_OLDEST);
        a11.d(Boolean.FALSE);
        this.f97483c = a11;
    }

    @Override // x5.b
    @l
    public Object a(int i11, @k j00.c<? super o0> cVar) {
        return c40.i.h(o.b(), new a(i11, null), cVar);
    }

    @Override // x5.b
    @k
    public kotlinx.coroutines.flow.i<Boolean> b() {
        return this.f97483c;
    }

    @Override // x5.b
    @l
    public Object c(@k o0 o0Var, @k j00.c<? super g2> cVar) {
        Object h11 = h(o0Var.f80028a, o0Var, cVar);
        return h11 == kotlin.coroutines.intrinsics.b.l() ? h11 : g2.f100423a;
    }

    public final com.baicizhan.app.preferences.g g() {
        com.baicizhan.app.preferences.a aVar = this.f97481a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("sentence_game_repo_v2-");
        Long b11 = this.f97482b.b();
        g0.m(b11);
        sb2.append(b11.longValue());
        return aVar.a(sb2.toString());
    }

    public final Object h(int i11, o0 o0Var, j00.c<? super g2> cVar) {
        Object h11 = c40.i.h(o.b().plus(x2.f8011a), new b(i11, o0Var, null), cVar);
        return h11 == kotlin.coroutines.intrinsics.b.l() ? h11 : g2.f100423a;
    }
}

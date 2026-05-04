package mx;

import ix.g1;
import java.io.Closeable;
import java.io.OutputStream;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import mx.v;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class x extends v.f {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final x00.p<OutputStream, j00.c<? super g2>, Object> f73839b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final ix.k f73840c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    public final g1 f73841d;

    /* renamed from: e, reason: collision with root package name */
    @m80.l
    public final Long f73842e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.http.content.OutputStreamContent$writeTo$2", f = "OutputStreamContent.kt", i = {}, l = {28}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements x00.l<j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f73843a;

        /* renamed from: b, reason: collision with root package name */
        public int f73844b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ io.ktor.utils.io.m f73845c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ x f73846d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(io.ktor.utils.io.m mVar, x xVar, j00.c<? super a> cVar) {
            super(1, cVar);
            this.f73845c = mVar;
            this.f73846d = xVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(j00.c<?> cVar) {
            return new a(this.f73845c, this.f73846d, cVar);
        }

        @Override // x00.l
        public final Object invoke(j00.c<? super g2> cVar) {
            return ((a) create(cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Closeable closeable;
            Throwable th2;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f73844b;
            if (i11 == 0) {
                kotlin.e.n(obj);
                OutputStream c11 = mz.a.c(this.f73845c);
                try {
                    x00.p pVar = this.f73846d.f73839b;
                    this.f73843a = c11;
                    this.f73844b = 1;
                    if (pVar.invoke(c11, this) == l11) {
                        return l11;
                    }
                    closeable = c11;
                } catch (Throwable th3) {
                    closeable = c11;
                    th2 = th3;
                    throw th2;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                closeable = (Closeable) this.f73843a;
                try {
                    kotlin.e.n(obj);
                } catch (Throwable th4) {
                    th2 = th4;
                    try {
                        throw th2;
                    } catch (Throwable th5) {
                        r00.b.a(closeable, th2);
                        throw th5;
                    }
                }
            }
            g2 g2Var = g2.f100423a;
            r00.b.a(closeable, null);
            return g2Var;
        }
    }

    public /* synthetic */ x(x00.p pVar, ix.k kVar, g1 g1Var, Long l11, int i11, kotlin.jvm.internal.v vVar) {
        this(pVar, kVar, (i11 & 4) != 0 ? null : g1Var, (i11 & 8) != 0 ? null : l11);
    }

    @Override // mx.v
    @m80.l
    public Long a() {
        return this.f73842e;
    }

    @Override // mx.v
    @m80.k
    public ix.k b() {
        return this.f73840c;
    }

    @Override // mx.v
    @m80.l
    public g1 h() {
        return this.f73841d;
    }

    @Override // mx.v.f
    @m80.l
    public Object m(@m80.k io.ktor.utils.io.m mVar, @m80.k j00.c<? super g2> cVar) {
        Object f11 = b.f(new a(mVar, this, null), cVar);
        return f11 == kotlin.coroutines.intrinsics.b.l() ? f11 : g2.f100423a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public x(@m80.k x00.p<? super OutputStream, ? super j00.c<? super g2>, ? extends Object> body, @m80.k ix.k contentType, @m80.l g1 g1Var, @m80.l Long l11) {
        kotlin.jvm.internal.g0.p(body, "body");
        kotlin.jvm.internal.g0.p(contentType, "contentType");
        this.f73839b = body;
        this.f73840c = contentType;
        this.f73841d = g1Var;
        this.f73842e = l11;
    }
}

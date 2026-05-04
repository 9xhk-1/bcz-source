package kx;

import c40.r0;
import c40.x0;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kx.y;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class y {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends y {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final y40.c0 f69072a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@m80.k y40.c0 body) {
            super(null);
            g0.p(body, "body");
            this.f69072a = body;
        }

        @Override // kx.y
        public void a() {
            this.f69072a.close();
        }

        @m80.k
        public final y40.c0 b() {
            return this.f69072a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends y {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final x0<s> f69073a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final io.ktor.utils.io.g f69074b;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "io.ktor.http.cio.MultipartEvent$MultipartPart$release$2", f = "Multipart.kt", i = {}, l = {60}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements x00.p<r0, j00.c<? super Long>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f69075a;

            public a(j00.c<? super a> cVar) {
                super(2, cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                return b.this.new a(cVar);
            }

            @Override // x00.p
            public final Object invoke(r0 r0Var, j00.c<? super Long> cVar) {
                return ((a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f69075a;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.e.n(obj);
                    return obj;
                }
                kotlin.e.n(obj);
                io.ktor.utils.io.g c11 = b.this.c();
                this.f69075a = 1;
                Object j11 = io.ktor.utils.io.j.j(c11, 0L, this, 1, null);
                return j11 == l11 ? l11 : j11;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@m80.k x0<s> headers, @m80.k io.ktor.utils.io.g body) {
            super(null);
            g0.p(headers, "headers");
            g0.p(body, "body");
            this.f69073a = headers;
            this.f69074b = body;
        }

        public static final g2 e(b bVar, Throwable th2) {
            if (th2 != null) {
                bVar.f69073a.S().p();
            }
            return g2.f100423a;
        }

        @Override // kx.y
        public void a() {
            this.f69073a.z0(new x00.l() { // from class: kx.z
                @Override // x00.l
                public final Object invoke(Object obj) {
                    g2 e11;
                    e11 = y.b.e(y.b.this, (Throwable) obj);
                    return e11;
                }
            });
            c40.j.b(null, new a(null), 1, null);
        }

        @m80.k
        public final io.ktor.utils.io.g c() {
            return this.f69074b;
        }

        @m80.k
        public final x0<s> d() {
            return this.f69073a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c extends y {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final y40.c0 f69077a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@m80.k y40.c0 body) {
            super(null);
            g0.p(body, "body");
            this.f69077a = body;
        }

        @Override // kx.y
        public void a() {
            this.f69077a.close();
        }

        @m80.k
        public final y40.c0 b() {
            return this.f69077a;
        }
    }

    public /* synthetic */ y(kotlin.jvm.internal.v vVar) {
        this();
    }

    public abstract void a();

    public y() {
    }
}

package io.ktor.server.engine;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface a {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: io.ktor.server.engine.a$a, reason: collision with other inner class name */
    public static class C0709a {

        /* renamed from: a, reason: collision with root package name */
        public final int f61286a;

        /* renamed from: b, reason: collision with root package name */
        public int f61287b;

        /* renamed from: c, reason: collision with root package name */
        public int f61288c;

        /* renamed from: d, reason: collision with root package name */
        public int f61289d;

        /* renamed from: e, reason: collision with root package name */
        public long f61290e;

        /* renamed from: f, reason: collision with root package name */
        public long f61291f;

        /* renamed from: g, reason: collision with root package name */
        @m80.k
        public List<o1> f61292g;

        public C0709a() {
            int b11 = fy.b.b();
            this.f61286a = b11;
            this.f61287b = (b11 / 2) + 1;
            this.f61288c = (b11 / 2) + 1;
            this.f61289d = b11;
            this.f61290e = 1000L;
            this.f61291f = 5000L;
            this.f61292g = new ArrayList();
        }

        public final int a() {
            return this.f61289d;
        }

        public final int b() {
            return this.f61287b;
        }

        @m80.k
        public final List<o1> c() {
            return this.f61292g;
        }

        public final int d() {
            return this.f61286a;
        }

        public final long e() {
            return this.f61290e;
        }

        public final long f() {
            return this.f61291f;
        }

        public final int g() {
            return this.f61288c;
        }

        public final void h(int i11) {
            this.f61289d = i11;
        }

        public final void i(int i11) {
            this.f61287b = i11;
        }

        public final void j(@m80.k List<o1> list) {
            kotlin.jvm.internal.g0.p(list, "<set-?>");
            this.f61292g = list;
        }

        public final void k(long j11) {
            this.f61290e = j11;
        }

        public final void l(long j11) {
            this.f61291f = j11;
        }

        public final void m(int i11) {
            this.f61288c = i11;
        }

        public final void n(@m80.k C0709a other) {
            kotlin.jvm.internal.g0.p(other, "other");
            this.f61287b = other.f61287b;
            this.f61288c = other.f61288c;
            this.f61289d = other.f61289d;
            this.f61290e = other.f61290e;
            this.f61291f = other.f61291f;
            this.f61292g.addAll(other.f61292g);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "io.ktor.server.engine.ApplicationEngine$startSuspend$2", f = "ApplicationEngine.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: io.ktor.server.engine.a$b$a, reason: collision with other inner class name */
        public static final class C0710a extends SuspendLambda implements x00.p<c40.r0, j00.c<? super a>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f61293a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a f61294b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ boolean f61295c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0710a(a aVar, boolean z11, j00.c<? super C0710a> cVar) {
                super(2, cVar);
                this.f61294b = aVar;
                this.f61295c = z11;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
                return new C0710a(this.f61294b, this.f61295c, cVar);
            }

            @Override // x00.p
            public final Object invoke(c40.r0 r0Var, j00.c<? super a> cVar) {
                return ((C0710a) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f61293a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                return this.f61294b.b(this.f61295c);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "io.ktor.server.engine.ApplicationEngine$stopSuspend$2", f = "ApplicationEngine.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: io.ktor.server.engine.a$b$b, reason: collision with other inner class name */
        public static final class C0711b extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f61296a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a f61297b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ long f61298c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ long f61299d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0711b(a aVar, long j11, long j12, j00.c<? super C0711b> cVar) {
                super(2, cVar);
                this.f61297b = aVar;
                this.f61298c = j11;
                this.f61299d = j12;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
                return new C0711b(this.f61297b, this.f61298c, this.f61299d, cVar);
            }

            @Override // x00.p
            public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
                return ((C0711b) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f61296a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                this.f61297b.d(this.f61298c, this.f61299d);
                return yz.g2.f100423a;
            }
        }

        public static /* synthetic */ a a(a aVar, boolean z11, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: start");
            }
            if ((i11 & 1) != 0) {
                z11 = false;
            }
            return aVar.b(z11);
        }

        @m80.l
        public static Object b(@m80.k a aVar, boolean z11, @m80.k j00.c<? super a> cVar) {
            return c40.i.h(fy.b.e(c40.h1.f7863a), new C0710a(aVar, z11, null), cVar);
        }

        public static /* synthetic */ Object c(a aVar, boolean z11, j00.c cVar, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startSuspend");
            }
            if ((i11 & 1) != 0) {
                z11 = false;
            }
            return aVar.e(z11, cVar);
        }

        public static /* synthetic */ void d(a aVar, long j11, long j12, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stop");
            }
            if ((i11 & 1) != 0) {
                j11 = 500;
            }
            if ((i11 & 2) != 0) {
                j12 = 500;
            }
            aVar.d(j11, j12);
        }

        @m80.l
        public static Object e(@m80.k a aVar, long j11, long j12, @m80.k j00.c<? super yz.g2> cVar) {
            Object h11 = c40.i.h(fy.b.e(c40.h1.f7863a), new C0711b(aVar, j11, j12, null), cVar);
            return h11 == kotlin.coroutines.intrinsics.b.l() ? h11 : yz.g2.f100423a;
        }

        public static /* synthetic */ Object f(a aVar, long j11, long j12, j00.c cVar, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stopSuspend");
            }
            if ((i11 & 1) != 0) {
                j11 = 500;
            }
            if ((i11 & 2) != 0) {
                j12 = 500;
            }
            return aVar.h(j11, j12, cVar);
        }
    }

    @m80.k
    zx.f a();

    @m80.k
    a b(boolean z11);

    void d(long j11, long j12);

    @m80.l
    Object e(boolean z11, @m80.k j00.c<? super a> cVar);

    @m80.l
    Object h(long j11, long j12, @m80.k j00.c<? super yz.g2> cVar);

    @m80.l
    Object i(@m80.k j00.c<? super List<? extends o1>> cVar);
}

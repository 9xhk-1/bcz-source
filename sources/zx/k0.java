package zx;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface k0 extends b {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "io.ktor.server.application.PipelineCall$DefaultImpls", f = "PipelineCall.kt", i = {0}, l = {92}, m = "receiveNullable", n = {"typeInfo"}, s = {"L$0"})
        /* renamed from: zx.k0$a$a, reason: collision with other inner class name */
        public static final class C1402a<T> extends ContinuationImpl {

            /* renamed from: a, reason: collision with root package name */
            public Object f103050a;

            /* renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f103051b;

            /* renamed from: c, reason: collision with root package name */
            public int f103052c;

            public C1402a(j00.c<? super C1402a> cVar) {
                super(cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @m80.l
            public final Object invokeSuspend(@m80.k Object obj) {
                this.f103051b = obj;
                this.f103052c |= Integer.MIN_VALUE;
                return a.a(null, null, this);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x007e A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0080  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0036  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        @m80.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static <T> java.lang.Object a(@m80.k zx.k0 r6, @m80.k gz.a r7, @m80.k j00.c<? super T> r8) {
            /*
                boolean r0 = r8 instanceof zx.k0.a.C1402a
                if (r0 == 0) goto L13
                r0 = r8
                zx.k0$a$a r0 = (zx.k0.a.C1402a) r0
                int r1 = r0.f103052c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f103052c = r1
                goto L18
            L13:
                zx.k0$a$a r0 = new zx.k0$a$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f103051b
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                int r2 = r0.f103052c
                r3 = 1
                if (r2 == 0) goto L36
                if (r2 != r3) goto L2e
                java.lang.Object r6 = r0.f103050a
                r7 = r6
                gz.a r7 = (gz.a) r7
                kotlin.e.n(r8)
                goto L76
            L2e:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L36:
                kotlin.e.n(r8)
                xy.b r8 = r6.getAttributes()
                xy.a r2 = py.b.b()
                java.lang.Object r8 = r8.a(r2)
                py.f r8 = (py.f) r8
                if (r8 != 0) goto L56
                xy.b r2 = r6.getAttributes()
                xy.a r4 = py.b.b()
                py.f r5 = py.f.f81329a
                r2.e(r4, r5)
            L56:
                zx.l0.d(r6, r7)
                if (r8 != 0) goto L63
                py.g r8 = r6.f()
                io.ktor.utils.io.g r8 = r8.i()
            L63:
                py.g r2 = r6.f()
                py.c r2 = r2.b()
                r0.f103050a = r7
                r0.f103052c = r3
                java.lang.Object r8 = r2.p(r6, r8, r0)
                if (r8 != r1) goto L76
                return r1
            L76:
                mx.u r6 = mx.u.f73831a
                boolean r6 = kotlin.jvm.internal.g0.g(r8, r6)
                if (r6 == 0) goto L80
                r6 = 0
                return r6
            L80:
                py.f r6 = py.f.f81329a
                if (r8 == r6) goto L9c
                h10.d r6 = r7.b()
                boolean r6 = r6.B(r8)
                if (r6 == 0) goto L8f
                return r8
            L8f:
                io.ktor.server.plugins.CannotTransformContentToTypeException r6 = new io.ktor.server.plugins.CannotTransformContentToTypeException
                h10.r r7 = r7.a()
                kotlin.jvm.internal.g0.m(r7)
                r6.<init>(r7)
                throw r6
            L9c:
                io.ktor.server.request.RequestAlreadyConsumedException r6 = new io.ktor.server.request.RequestAlreadyConsumedException
                r6.<init>()
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: zx.k0.a.a(zx.k0, gz.a, j00.c):java.lang.Object");
        }

        @m80.l
        public static Object b(@m80.k k0 k0Var, @m80.l Object obj, @m80.l gz.a aVar, @m80.k j00.c<? super g2> cVar) {
            qy.t.b(k0Var.k(), aVar);
            qy.m b11 = k0Var.k().b();
            if (obj == null) {
                obj = mx.u.f73831a;
            }
            Object p11 = b11.p(k0Var, obj, cVar);
            return p11 == kotlin.coroutines.intrinsics.b.l() ? p11 : g2.f100423a;
        }
    }

    @Override // zx.b
    @m80.l
    Object E(@m80.l Object obj, @m80.l gz.a aVar, @m80.k j00.c<? super g2> cVar);

    @Override // zx.b
    @m80.l
    <T> Object L(@m80.k gz.a aVar, @m80.k j00.c<? super T> cVar);

    @Override // zx.b
    @m80.k
    py.g f();

    @Override // zx.b
    @m80.k
    qy.o k();
}

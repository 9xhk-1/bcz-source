package sw;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class w implements sw.a<x00.s<? super v, ? super ex.c, ? super io.ktor.utils.io.g, ? super gz.a, ? super j00.c<? super Object>, ? extends Object>> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final w f88993a = new w();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.plugins.api.TransformResponseBodyHook$install$1", f = "KtorCallContexts.kt", i = {0, 0}, l = {104, 111}, m = "invokeSuspend", n = {"$this$intercept", "typeInfo"}, s = {"L$0", "L$1"})
    public static final class a extends SuspendLambda implements x00.q<io.ktor.util.pipeline.d<ex.d, mw.a>, ex.d, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f88994a;

        /* renamed from: b, reason: collision with root package name */
        public int f88995b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f88996c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ x00.s<v, ex.c, io.ktor.utils.io.g, gz.a, j00.c<Object>, Object> f88997d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(x00.s<? super v, ? super ex.c, ? super io.ktor.utils.io.g, ? super gz.a, ? super j00.c<Object>, ? extends Object> sVar, j00.c<? super a> cVar) {
            super(3, cVar);
            this.f88997d = sVar;
        }

        @Override // x00.q
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(io.ktor.util.pipeline.d<ex.d, mw.a> dVar, ex.d dVar2, j00.c<? super g2> cVar) {
            a aVar = new a(this.f88997d, cVar);
            aVar.f88996c = dVar;
            return aVar.invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x00aa, code lost:
        
            if (r3.i(r4, r10) == r0) goto L30;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r10.f88995b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L29
                if (r1 == r3) goto L1c
                if (r1 != r2) goto L14
                kotlin.e.n(r11)
                r9 = r10
                goto Lad
            L14:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L1c:
                java.lang.Object r1 = r10.f88994a
                gz.a r1 = (gz.a) r1
                java.lang.Object r3 = r10.f88996c
                io.ktor.util.pipeline.d r3 = (io.ktor.util.pipeline.d) r3
                kotlin.e.n(r11)
                r9 = r10
                goto L67
            L29:
                kotlin.e.n(r11)
                java.lang.Object r11 = r10.f88996c
                io.ktor.util.pipeline.d r11 = (io.ktor.util.pipeline.d) r11
                java.lang.Object r1 = r11.e()
                ex.d r1 = (ex.d) r1
                gz.a r8 = r1.a()
                java.lang.Object r7 = r1.b()
                boolean r1 = r7 instanceof io.ktor.utils.io.g
                if (r1 != 0) goto L45
                yz.g2 r11 = yz.g2.f100423a
                return r11
            L45:
                x00.s<sw.v, ex.c, io.ktor.utils.io.g, gz.a, j00.c<java.lang.Object>, java.lang.Object> r4 = r10.f88997d
                sw.v r5 = new sw.v
                r5.<init>()
                java.lang.Object r1 = r11.d()
                mw.a r1 = (mw.a) r1
                ex.c r6 = r1.i()
                r10.f88996c = r11
                r10.f88994a = r8
                r10.f88995b = r3
                r9 = r10
                java.lang.Object r1 = r4.invoke(r5, r6, r7, r8, r9)
                if (r1 != r0) goto L64
                goto Lac
            L64:
                r3 = r11
                r11 = r1
                r1 = r8
            L67:
                if (r11 != 0) goto L6c
                yz.g2 r11 = yz.g2.f100423a
                return r11
            L6c:
                boolean r4 = r11 instanceof mx.u
                if (r4 != 0) goto L9a
                h10.d r4 = r1.b()
                boolean r4 = r4.B(r11)
                if (r4 == 0) goto L7b
                goto L9a
            L7b:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "transformResponseBody returned "
                r2.append(r3)
                r2.append(r11)
                java.lang.String r11 = " but expected value of type "
                r2.append(r11)
                r2.append(r1)
                java.lang.String r11 = r2.toString()
                r0.<init>(r11)
                throw r0
            L9a:
                ex.d r4 = new ex.d
                r4.<init>(r1, r11)
                r11 = 0
                r9.f88996c = r11
                r9.f88994a = r11
                r9.f88995b = r2
                java.lang.Object r11 = r3.i(r4, r10)
                if (r11 != r0) goto Lad
            Lac:
                return r0
            Lad:
                yz.g2 r11 = yz.g2.f100423a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: sw.w.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Override // sw.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(@m80.k lw.c client, @m80.k x00.s<? super v, ? super ex.c, ? super io.ktor.utils.io.g, ? super gz.a, ? super j00.c<Object>, ? extends Object> handler) {
        g0.p(client, "client");
        g0.p(handler, "handler");
        client.o0().C(ex.f.f50195h.e(), new a(handler, null));
    }
}

package u4;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import l3.g2;
import m80.k;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final g2 f91754a = a.f91756a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final String f91755b = "UIActionWrap";

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements g2 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f91756a = new a();

        @Override // l3.g2
        public final Object a(j00.c<? super yz.g2> cVar) {
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b implements g2 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l<j00.c<? super yz.g2>, Object> f91757a;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.app.biz.game.impl.home.base.UIActionWrapKt$safeAction$1", f = "UIActionWrap.kt", i = {0, 0}, l = {10}, m = "execute", n = {"$this$execute_u24lambda_u240", "$i$a$-runCatching-UIActionWrapKt$safeAction$1$execute$2"}, s = {"L$0", "I$0"}, v = 1)
        public static final class a extends ContinuationImpl {

            /* renamed from: a, reason: collision with root package name */
            public Object f91758a;

            /* renamed from: b, reason: collision with root package name */
            public int f91759b;

            /* renamed from: c, reason: collision with root package name */
            public /* synthetic */ Object f91760c;

            /* renamed from: e, reason: collision with root package name */
            public int f91762e;

            public a(j00.c<? super a> cVar) {
                super(cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f91760c = obj;
                this.f91762e |= Integer.MIN_VALUE;
                return b.this.a(this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(l<? super j00.c<? super yz.g2>, ? extends Object> lVar) {
            this.f91757a = lVar;
        }

        /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(9:5|6|7|(1:(2:10|11)(2:20|21))(3:22|23|(1:25))|12|13|(1:15)|16|17))|28|6|7|(0)(0)|12|13|(0)|16|17) */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x002d, code lost:
        
            r5 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0057, code lost:
        
            r0 = kotlin.Result.Companion;
            r5 = kotlin.Result.m6308constructorimpl(kotlin.e.a(r5));
         */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0067  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
        @Override // l3.g2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object a(j00.c<? super yz.g2> r5) {
            /*
                r4 = this;
                boolean r0 = r5 instanceof u4.g.b.a
                if (r0 == 0) goto L13
                r0 = r5
                u4.g$b$a r0 = (u4.g.b.a) r0
                int r1 = r0.f91762e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f91762e = r1
                goto L18
            L13:
                u4.g$b$a r0 = new u4.g$b$a
                r0.<init>(r5)
            L18:
                java.lang.Object r5 = r0.f91760c
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                int r2 = r0.f91762e
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                java.lang.Object r0 = r0.f91758a
                u4.g$b r0 = (u4.g.b) r0
                kotlin.e.n(r5)     // Catch: java.lang.Throwable -> L2d
                goto L50
            L2d:
                r5 = move-exception
                goto L57
            L2f:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L37:
                kotlin.e.n(r5)
                x00.l<j00.c<? super yz.g2>, java.lang.Object> r5 = r4.f91757a
                kotlin.Result$a r2 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L2d
                java.lang.Object r2 = l00.k.a(r4)     // Catch: java.lang.Throwable -> L2d
                r0.f91758a = r2     // Catch: java.lang.Throwable -> L2d
                r2 = 0
                r0.f91759b = r2     // Catch: java.lang.Throwable -> L2d
                r0.f91762e = r3     // Catch: java.lang.Throwable -> L2d
                java.lang.Object r5 = r5.invoke(r0)     // Catch: java.lang.Throwable -> L2d
                if (r5 != r1) goto L50
                return r1
            L50:
                yz.g2 r5 = yz.g2.f100423a     // Catch: java.lang.Throwable -> L2d
                java.lang.Object r5 = kotlin.Result.m6308constructorimpl(r5)     // Catch: java.lang.Throwable -> L2d
                goto L61
            L57:
                kotlin.Result$a r0 = kotlin.Result.Companion
                java.lang.Object r5 = kotlin.e.a(r5)
                java.lang.Object r5 = kotlin.Result.m6308constructorimpl(r5)
            L61:
                java.lang.Throwable r5 = kotlin.Result.m6311exceptionOrNullimpl(r5)
                if (r5 == 0) goto L70
                z6.b r0 = z6.b.f101032b
                java.lang.String r1 = "UIActionWrap"
                java.lang.String r2 = ""
                r0.e(r1, r2, r5)
            L70:
                yz.g2 r5 = yz.g2.f100423a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: u4.g.b.a(j00.c):java.lang.Object");
        }
    }

    @k
    public static final g2 a() {
        return f91754a;
    }

    @k
    public static final g2 b(@k l<? super j00.c<? super yz.g2>, ? extends Object> block) {
        g0.p(block, "block");
        return new b(block);
    }
}

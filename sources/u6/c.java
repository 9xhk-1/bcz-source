package u6;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import l00.d;
import m80.k;
import m80.l;
import oa0.r;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final u5.b f91865a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @d(c = "com.baicizhan.app.biz.game.uc.userbook.GetTopicCollectionStatus", f = "GetTopicCollectionStatus.kt", i = {0, 0, 0}, l = {15}, m = "invoke", n = {"$this$invoke_u24lambda_u240", "topicId", "$i$a$-runCatching-GetTopicCollectionStatus$invoke$2"}, s = {"L$0", "I$0", "I$1"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public int f91866a;

        /* renamed from: b, reason: collision with root package name */
        public int f91867b;

        /* renamed from: c, reason: collision with root package name */
        public Object f91868c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f91869d;

        /* renamed from: f, reason: collision with root package name */
        public int f91871f;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f91869d = obj;
            this.f91871f |= Integer.MIN_VALUE;
            return c.this.a(0, this);
        }
    }

    public c(@k u5.b plugin) {
        g0.p(plugin, "plugin");
        this.f91865a = plugin;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(2:10|11)(2:20|21))(3:22|23|(1:25))|12|13|(2:15|16)(1:18)))|28|6|7|(0)(0)|12|13|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x002d, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        r6 = kotlin.Result.Companion;
        r5 = kotlin.Result.m6308constructorimpl(kotlin.e.a(r5));
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(int r5, @m80.k j00.c<? super k3.h4> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof u6.c.a
            if (r0 == 0) goto L13
            r0 = r6
            u6.c$a r0 = (u6.c.a) r0
            int r1 = r0.f91871f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f91871f = r1
            goto L18
        L13:
            u6.c$a r0 = new u6.c$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f91869d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f91871f
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r5 = r0.f91868c
            u6.c r5 = (u6.c) r5
            kotlin.e.n(r6)     // Catch: java.lang.Throwable -> L2d
            goto L56
        L2d:
            r5 = move-exception
            goto L5d
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            kotlin.e.n(r6)
            kotlin.Result$a r6 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L2d
            u5.b r6 = r4.f91865a     // Catch: java.lang.Throwable -> L2d
            u5.a$c r6 = r6.b()     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r2 = l00.k.a(r4)     // Catch: java.lang.Throwable -> L2d
            r0.f91868c = r2     // Catch: java.lang.Throwable -> L2d
            r0.f91866a = r5     // Catch: java.lang.Throwable -> L2d
            r2 = 0
            r0.f91867b = r2     // Catch: java.lang.Throwable -> L2d
            r0.f91871f = r3     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r6 = r6.c(r5, r0)     // Catch: java.lang.Throwable -> L2d
            if (r6 != r1) goto L56
            return r1
        L56:
            k3.h4 r6 = (k3.h4) r6     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r5 = kotlin.Result.m6308constructorimpl(r6)     // Catch: java.lang.Throwable -> L2d
            goto L67
        L5d:
            kotlin.Result$a r6 = kotlin.Result.Companion
            java.lang.Object r5 = kotlin.e.a(r5)
            java.lang.Object r5 = kotlin.Result.m6308constructorimpl(r5)
        L67:
            k3.h4 r6 = new k3.h4
            java.util.List r0 = a00.h0.J()
            java.util.List r1 = a00.h0.J()
            r6.<init>(r0, r1)
            boolean r0 = kotlin.Result.m6314isFailureimpl(r5)
            if (r0 == 0) goto L7b
            r5 = r6
        L7b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: u6.c.a(int, j00.c):java.lang.Object");
    }
}

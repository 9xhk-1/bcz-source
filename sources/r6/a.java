package r6;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@oa0.r
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final C1031a f83089c = new C1031a(null);

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final String f83090d = "purchased_book";

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final s5.b f83091a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final s3.f f83092b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: r6.a$a, reason: collision with other inner class name */
    public static final class C1031a {
        public /* synthetic */ C1031a(kotlin.jvm.internal.v vVar) {
            this();
        }

        public C1031a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.sync.atomic.CheckFetchPurchasedBookUC", f = "CheckFetchPurchasedBookUC.kt", i = {}, l = {17, 20}, m = "invoke", n = {}, s = {}, v = 1)
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f83093a;

        /* renamed from: c, reason: collision with root package name */
        public int f83095c;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f83093a = obj;
            this.f83095c |= Integer.MIN_VALUE;
            return a.this.b(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.sync.atomic.CheckFetchPurchasedBookUC$invoke$2", f = "CheckFetchPurchasedBookUC.kt", i = {}, l = {18}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class c extends SuspendLambda implements x00.l<j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f83096a;

        public c(j00.c<? super c> cVar) {
            super(1, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(j00.c<?> cVar) {
            return a.this.new c(cVar);
        }

        @Override // x00.l
        public final Object invoke(j00.c<? super g2> cVar) {
            return ((c) create(cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f83096a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                s5.b bVar = a.this.f83091a;
                this.f83096a = 1;
                if (bVar.b(this) == l11) {
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

    public a(@m80.k s5.b purchasedBook, @m80.k s3.f oncePerUserFetcher) {
        g0.p(purchasedBook, "purchasedBook");
        g0.p(oncePerUserFetcher, "oncePerUserFetcher");
        this.f83091a = purchasedBook;
        this.f83092b = oncePerUserFetcher;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0056, code lost:
    
        if (r7.a(r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004b, code lost:
    
        if (r7.f(r6.a.f83090d, r2, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@m80.k j00.c<? super yz.g2> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof r6.a.b
            if (r0 == 0) goto L13
            r0 = r7
            r6.a$b r0 = (r6.a.b) r0
            int r1 = r0.f83095c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f83095c = r1
            goto L18
        L13:
            r6.a$b r0 = new r6.a$b
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f83093a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f83095c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.e.n(r7)
            goto L59
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            kotlin.e.n(r7)
            goto L4e
        L38:
            kotlin.e.n(r7)
            s3.f r7 = r6.f83092b
            r6.a$c r2 = new r6.a$c
            r5 = 0
            r2.<init>(r5)
            r0.f83095c = r4
            java.lang.String r4 = "purchased_book"
            java.lang.Object r7 = r7.f(r4, r2, r0)
            if (r7 != r1) goto L4e
            goto L58
        L4e:
            s5.b r7 = r6.f83091a
            r0.f83095c = r3
            java.lang.Object r7 = r7.a(r0)
            if (r7 != r1) goto L59
        L58:
            return r1
        L59:
            yz.g2 r7 = yz.g2.f100423a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: r6.a.b(j00.c):java.lang.Object");
    }
}

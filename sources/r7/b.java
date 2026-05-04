package r7;

import c4.o;
import c40.l3;
import c40.r0;
import c40.s0;
import c40.x0;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import oa0.r;
import p7.v;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r(binds = {e.class})
/* loaded from: classes3.dex */
public final class b implements e {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final f f83337a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final h f83338b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public x0<g2> f83339c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.userbook.repo.BookSyncer$doSync$2$1", f = "IBookSync.kt", i = {1, 2}, l = {37, 39, 48}, m = "invokeSuspend", n = {"need", "need"}, s = {"Z$0", "Z$0"}, v = 1)
    @u0({"SMAP\nIBookSync.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IBookSync.kt\ncom/baicizhan/app/biz/userbook/repo/BookSyncer$doSync$2$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,57:1\n1563#2:58\n1634#2,3:59\n*S KotlinDebug\n*F\n+ 1 IBookSync.kt\ncom/baicizhan/app/biz/userbook/repo/BookSyncer$doSync$2$1\n*L\n39#1:58\n39#1:59,3\n*E\n"})
    public static final class a extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public boolean f83340a;

        /* renamed from: b, reason: collision with root package name */
        public int f83341b;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ r0 f83343d;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.app.biz.userbook.repo.BookSyncer$doSync$2$1$1$1", f = "IBookSync.kt", i = {}, l = {44, 46}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        /* renamed from: r7.b$a$a, reason: collision with other inner class name */
        public static final class C1037a extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f83344a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p7.p f83345b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ b f83346c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1037a(p7.p pVar, b bVar, j00.c<? super C1037a> cVar) {
                super(2, cVar);
                this.f83345b = pVar;
                this.f83346c = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                return new C1037a(this.f83345b, this.f83346c, cVar);
            }

            @Override // x00.p
            public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
                return ((C1037a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:13:0x00ca, code lost:
            
                if (r2.e(r4, r17) == r1) goto L17;
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x00cc, code lost:
            
                return r1;
             */
            /* JADX WARN: Code restructure failed: missing block: B:18:0x00a1, code lost:
            
                if (r2.i(r5, r17) == r1) goto L17;
             */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r18) {
                /*
                    r17 = this;
                    r0 = r17
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                    int r2 = r0.f83344a
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L22
                    if (r2 == r4) goto L1d
                    if (r2 != r3) goto L15
                    kotlin.e.n(r18)
                    goto Lcd
                L15:
                    java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                    java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                    r1.<init>(r2)
                    throw r1
                L1d:
                    kotlin.e.n(r18)
                    goto La4
                L22:
                    kotlin.e.n(r18)
                    z6.b r5 = z6.b.f101032b
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    r2.<init>()
                    java.lang.String r11 = "book sync "
                    r2.append(r11)
                    p7.p r6 = r0.f83345b
                    long r6 = r6.m()
                    r2.append(r6)
                    java.lang.String r6 = " , local "
                    r2.append(r6)
                    p7.p r6 = r0.f83345b
                    long r6 = r6.k()
                    r2.append(r6)
                    java.lang.String r6 = " remote "
                    r2.append(r6)
                    p7.p r6 = r0.f83345b
                    long r6 = r6.l()
                    r2.append(r6)
                    java.lang.String r7 = r2.toString()
                    r9 = 4
                    r10 = 0
                    java.lang.String r6 = "UserBookService"
                    r8 = 0
                    z6.b.j(r5, r6, r7, r8, r9, r10)
                    p7.p r2 = r0.f83345b
                    long r6 = r2.l()
                    p7.p r2 = r0.f83345b
                    long r8 = r2.k()
                    int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                    if (r2 <= 0) goto La4
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    r2.<init>()
                    r2.append(r11)
                    p7.p r6 = r0.f83345b
                    long r6 = r6.m()
                    r2.append(r6)
                    java.lang.String r7 = r2.toString()
                    r9 = 4
                    r10 = 0
                    java.lang.String r6 = "UserBookService"
                    r8 = 0
                    z6.b.j(r5, r6, r7, r8, r9, r10)
                    r7.b r2 = r0.f83346c
                    r7.h r2 = r7.b.d(r2)
                    p7.p r5 = r0.f83345b
                    long r5 = r5.m()
                    r0.f83344a = r4
                    java.lang.Object r2 = r2.i(r5, r0)
                    if (r2 != r1) goto La4
                    goto Lcc
                La4:
                    r7.b r2 = r0.f83346c
                    r7.f r2 = r7.b.c(r2)
                    p7.p r4 = r0.f83345b
                    long r13 = r4.l()
                    r15 = 31
                    r16 = 0
                    r5 = 0
                    r7 = 0
                    r8 = 0
                    r10 = 0
                    r11 = 0
                    p7.p r4 = p7.p.h(r4, r5, r7, r8, r10, r11, r13, r15, r16)
                    java.util.List r4 = a00.g0.l(r4)
                    r0.f83344a = r3
                    java.lang.Object r2 = r2.e(r4, r0)
                    if (r2 != r1) goto Lcd
                Lcc:
                    return r1
                Lcd:
                    yz.g2 r1 = yz.g2.f100423a
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: r7.b.a.C1037a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(r0 r0Var, j00.c<? super a> cVar) {
            super(2, cVar);
            this.f83343d = r0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return b.this.new a(this.f83343d, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x00b2, code lost:
        
            if (c40.f.a(r10, r11) == r0) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x00b4, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0075, code lost:
        
            if (r12 == r0) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0043, code lost:
        
            if (r12 == r0) goto L24;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r11.f83341b
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L28
                if (r1 == r4) goto L24
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                kotlin.e.n(r12)
                goto Lb5
            L16:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L1e:
                boolean r1 = r11.f83340a
                kotlin.e.n(r12)
                goto L78
            L24:
                kotlin.e.n(r12)
                goto L46
            L28:
                kotlin.e.n(r12)
                z6.b r5 = z6.b.f101032b
                r9 = 4
                r10 = 0
                java.lang.String r6 = "UserBookService"
                java.lang.String r7 = "start sync "
                r8 = 0
                z6.b.j(r5, r6, r7, r8, r9, r10)
                r7.b r12 = r7.b.this
                r7.f r12 = r7.b.c(r12)
                r11.f83341b = r4
                java.lang.Object r12 = r12.a(r11)
                if (r12 != r0) goto L46
                goto Lb4
            L46:
                java.lang.Boolean r12 = (java.lang.Boolean) r12
                boolean r1 = r12.booleanValue()
                z6.b r4 = z6.b.f101032b
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r5 = "book sync "
                r12.append(r5)
                r12.append(r1)
                java.lang.String r6 = r12.toString()
                r8 = 4
                r9 = 0
                java.lang.String r5 = "UserBookService"
                r7 = 0
                z6.b.j(r4, r5, r6, r7, r8, r9)
                r7.b r12 = r7.b.this
                r7.f r12 = r7.b.c(r12)
                r11.f83340a = r1
                r11.f83341b = r3
                java.lang.Object r12 = r12.B(r11)
                if (r12 != r0) goto L78
                goto Lb4
            L78:
                java.lang.Iterable r12 = (java.lang.Iterable) r12
                c40.r0 r3 = r11.f83343d
                r7.b r9 = r7.b.this
                java.util.ArrayList r10 = new java.util.ArrayList
                r4 = 10
                int r4 = a00.i0.d0(r12, r4)
                r10.<init>(r4)
                java.util.Iterator r12 = r12.iterator()
            L8d:
                boolean r4 = r12.hasNext()
                if (r4 == 0) goto Laa
                java.lang.Object r4 = r12.next()
                p7.p r4 = (p7.p) r4
                r7.b$a$a r6 = new r7.b$a$a
                r5 = 0
                r6.<init>(r4, r9, r5)
                r7 = 3
                r8 = 0
                r4 = 0
                c40.x0 r4 = c40.i.b(r3, r4, r5, r6, r7, r8)
                r10.add(r4)
                goto L8d
            Laa:
                r11.f83340a = r1
                r11.f83341b = r2
                java.lang.Object r12 = c40.f.a(r10, r11)
                if (r12 != r0) goto Lb5
            Lb4:
                return r0
            Lb5:
                yz.g2 r12 = yz.g2.f100423a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: r7.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.userbook.repo.BookSyncer", f = "IBookSync.kt", i = {1}, l = {27, 29}, m = "sync", n = {"curTask"}, s = {"L$0"}, v = 1)
    /* renamed from: r7.b$b, reason: collision with other inner class name */
    public static final class C1038b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f83347a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f83348b;

        /* renamed from: d, reason: collision with root package name */
        public int f83350d;

        public C1038b(j00.c<? super C1038b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f83348b = obj;
            this.f83350d |= Integer.MIN_VALUE;
            return b.this.a(this);
        }
    }

    public b(@m80.k f bookRepo, @m80.k h wordsRepo) {
        g0.p(bookRepo, "bookRepo");
        g0.p(wordsRepo, "wordsRepo");
        this.f83337a = bookRepo;
        this.f83338b = wordsRepo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0068, code lost:
    
        if (r12.i(r0) == r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006a, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0055, code lost:
    
        if (r12 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // r7.e
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@m80.k j00.c<? super yz.g2> r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof r7.b.C1038b
            if (r0 == 0) goto L13
            r0 = r12
            r7.b$b r0 = (r7.b.C1038b) r0
            int r1 = r0.f83350d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f83350d = r1
            goto L18
        L13:
            r7.b$b r0 = new r7.b$b
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f83348b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f83350d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r0 = r0.f83347a
            c40.x0 r0 = (c40.x0) r0
            kotlin.e.n(r12)
            goto L6b
        L30:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L38:
            kotlin.e.n(r12)
            goto L58
        L3c:
            kotlin.e.n(r12)
            z6.b r5 = z6.b.f101032b
            r9 = 4
            r10 = 0
            java.lang.String r6 = "UserBookService"
            java.lang.String r7 = "SYNC"
            r8 = 0
            z6.b.j(r5, r6, r7, r8, r9, r10)
            c40.x0<yz.g2> r12 = r11.f83339c
            if (r12 != 0) goto L5a
            r0.f83350d = r4
            java.lang.Object r12 = r11.e(r0)
            if (r12 != r1) goto L58
            goto L6a
        L58:
            c40.x0 r12 = (c40.x0) r12
        L5a:
            r11.f83339c = r12
            java.lang.Object r2 = l00.k.a(r12)
            r0.f83347a = r2
            r0.f83350d = r3
            java.lang.Object r12 = r12.i(r0)
            if (r12 != r1) goto L6b
        L6a:
            return r1
        L6b:
            yz.g2 r12 = yz.g2.f100423a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: r7.b.a(j00.c):java.lang.Object");
    }

    public final Object e(j00.c<? super x0<g2>> cVar) {
        x0 b11;
        z6.b.j(z6.b.f101032b, v.f79629a, "real SYNC", null, 4, null);
        r0 a11 = s0.a(o.b().plus(l3.c(null, 1, null)));
        b11 = c40.k.b(a11, null, null, new a(a11, null), 3, null);
        return b11;
    }

    @Override // r7.e
    @m80.l
    public Object i(@m80.k j00.c<? super g2> cVar) {
        x0<g2> x0Var = this.f83339c;
        if (x0Var == null) {
            return g2.f100423a;
        }
        Object i11 = x0Var.i(cVar);
        return i11 == kotlin.coroutines.intrinsics.b.l() ? i11 : g2.f100423a;
    }
}

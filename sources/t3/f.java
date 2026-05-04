package t3;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nIStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IStorage.kt\ncom/baicizhan/app/biz/base/cache/DbStorage\n+ 2 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n*L\n1#1,68:1\n58#2,6:69\n*S KotlinDebug\n*F\n+ 1 IStorage.kt\ncom/baicizhan/app/biz/base/cache/DbStorage\n*L\n34#1:69,6\n*E\n"})
/* loaded from: classes3.dex */
public final class f implements l, c4.j {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f89253b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f89254c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final yz.c0 f89255d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.base.cache.DbStorage", f = "IStorage.kt", i = {}, l = {50, 50}, m = "clean", n = {}, s = {}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f89256a;

        /* renamed from: c, reason: collision with root package name */
        public int f89258c;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f89256a = obj;
            this.f89258c |= Integer.MIN_VALUE;
            return f.this.a(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.base.cache.DbStorage", f = "IStorage.kt", i = {}, l = {46, 46}, m = "getByteArray", n = {}, s = {}, v = 1)
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f89259a;

        /* renamed from: c, reason: collision with root package name */
        public int f89261c;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f89259a = obj;
            this.f89261c |= Integer.MIN_VALUE;
            return f.this.c(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.base.cache.DbStorage$getOrCreateDb$2", f = "IStorage.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class c extends SuspendLambda implements x00.p<l.e, j00.c<? super a4.a>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f89262a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f89263b;

        public c(j00.c<? super c> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            c cVar2 = new c(cVar);
            cVar2.f89263b = obj;
            return cVar2;
        }

        @Override // x00.p
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(l.e eVar, j00.c<? super a4.a> cVar) {
            return ((c) create(eVar, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            l.e eVar = (l.e) this.f89263b;
            kotlin.coroutines.intrinsics.b.l();
            if (this.f89262a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            return a4.a.f1882a.b(eVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.base.cache.DbStorage", f = "IStorage.kt", i = {0, 1}, l = {42, 42}, m = "putByteArray", n = {"byteArray", "byteArray"}, s = {"L$0", "L$0"}, v = 1)
    public static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f89264a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f89265b;

        /* renamed from: d, reason: collision with root package name */
        public int f89267d;

        public d(j00.c<? super d> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f89265b = obj;
            this.f89267d |= Integer.MIN_VALUE;
            return f.this.b(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nKoinComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KoinComponent.kt\norg/koin/core/component/KoinComponentKt$inject$1\n+ 2 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n+ 3 Scope.kt\norg/koin/core/scope/Scope\n+ 4 Koin.kt\norg/koin/core/Koin\n*L\n1#1,64:1\n45#2,2:65\n48#2:68\n142#3:67\n127#4:69\n*S KotlinDebug\n*F\n+ 1 KoinComponent.kt\norg/koin/core/component/KoinComponentKt$inject$1\n*L\n63#1:65,2\n63#1:68\n63#1:67\n63#1:69\n*E\n"})
    public static final class e implements x00.a<v3.b> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ pa0.a f89268a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ za0.a f89269b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x00.a f89270c;

        public e(pa0.a aVar, za0.a aVar2, x00.a aVar3) {
            this.f89268a = aVar;
            this.f89269b = aVar2;
            this.f89270c = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, v3.b] */
        @Override // x00.a
        public final v3.b invoke() {
            pa0.a aVar = this.f89268a;
            return (aVar instanceof pa0.c ? ((pa0.c) aVar).getScope() : aVar.r().P().h()).i(o0.d(v3.b.class), this.f89269b, this.f89270c);
        }
    }

    public f(@m80.k String key, boolean z11) {
        g0.p(key, "key");
        this.f89253b = key;
        this.f89254c = z11;
        this.f89255d = yz.e0.b(jb0.c.f64013a.b(), new e(this, null, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
    
        if (r6.R(r2, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0041, code lost:
    
        if (r6 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // t3.l
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@m80.k j00.c<? super yz.g2> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof t3.f.a
            if (r0 == 0) goto L13
            r0 = r6
            t3.f$a r0 = (t3.f.a) r0
            int r1 = r0.f89258c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f89258c = r1
            goto L18
        L13:
            t3.f$a r0 = new t3.f$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f89256a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f89258c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.e.n(r6)
            goto L55
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            kotlin.e.n(r6)
            goto L44
        L38:
            kotlin.e.n(r6)
            r0.f89258c = r4
            java.lang.Object r6 = r5.f(r0)
            if (r6 != r1) goto L44
            goto L54
        L44:
            a4.a r6 = (a4.a) r6
            e8.g r6 = r6.o()
            java.lang.String r2 = r5.f89253b
            r0.f89258c = r3
            java.lang.Object r6 = r6.R(r2, r0)
            if (r6 != r1) goto L55
        L54:
            return r1
        L55:
            yz.g2 r6 = yz.g2.f100423a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.f.a(j00.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0067, code lost:
    
        if (r7.U(r2, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004b, code lost:
    
        if (r7 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // t3.l
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(@m80.k byte[] r6, @m80.k j00.c<? super yz.g2> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof t3.f.d
            if (r0 == 0) goto L13
            r0 = r7
            t3.f$d r0 = (t3.f.d) r0
            int r1 = r0.f89267d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f89267d = r1
            goto L18
        L13:
            t3.f$d r0 = new t3.f$d
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f89265b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f89267d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r6 = r0.f89264a
            byte[] r6 = (byte[]) r6
            kotlin.e.n(r7)
            goto L6a
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            java.lang.Object r6 = r0.f89264a
            byte[] r6 = (byte[]) r6
            kotlin.e.n(r7)
            goto L4e
        L40:
            kotlin.e.n(r7)
            r0.f89264a = r6
            r0.f89267d = r4
            java.lang.Object r7 = r5.f(r0)
            if (r7 != r1) goto L4e
            goto L69
        L4e:
            a4.a r7 = (a4.a) r7
            e8.g r7 = r7.o()
            e8.h r2 = new e8.h
            java.lang.String r4 = r5.f89253b
            r2.<init>(r4, r6)
            java.lang.Object r6 = l00.k.a(r6)
            r0.f89264a = r6
            r0.f89267d = r3
            java.lang.Object r6 = r7.U(r2, r0)
            if (r6 != r1) goto L6a
        L69:
            return r1
        L6a:
            yz.g2 r6 = yz.g2.f100423a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.f.b(byte[], j00.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
    
        if (r6 != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0041, code lost:
    
        if (r6 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // t3.l
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(@m80.k j00.c<? super byte[]> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof t3.f.b
            if (r0 == 0) goto L13
            r0 = r6
            t3.f$b r0 = (t3.f.b) r0
            int r1 = r0.f89261c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f89261c = r1
            goto L18
        L13:
            t3.f$b r0 = new t3.f$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f89259a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f89261c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.e.n(r6)
            goto L59
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            kotlin.e.n(r6)
            goto L44
        L38:
            kotlin.e.n(r6)
            r0.f89261c = r4
            java.lang.Object r6 = r5.f(r0)
            if (r6 != r1) goto L44
            goto L58
        L44:
            a4.a r6 = (a4.a) r6
            e8.g r6 = r6.o()
            java.lang.String r2 = r5.f89253b
            j.j r6 = r6.X(r2)
            r0.f89261c = r3
            java.lang.Object r6 = k.e.f(r6, r0)
            if (r6 != r1) goto L59
        L58:
            return r1
        L59:
            e8.h r6 = (e8.h) r6
            if (r6 == 0) goto L62
            byte[] r6 = r6.f()
            return r6
        L62:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.f.c(j00.c):java.lang.Object");
    }

    public final v3.b e() {
        return (v3.b) this.f89255d.getValue();
    }

    public final Object f(j00.c<? super a4.a> cVar) {
        return e().a(a4.a.f1882a.a(), m.f89273b, this.f89254c, new c(null), cVar);
    }

    @Override // c4.j, pa0.a
    @m80.k
    public /* bridge */ na0.a r() {
        return super.r();
    }

    public /* synthetic */ f(String str, boolean z11, int i11, kotlin.jvm.internal.v vVar) {
        this(str, (i11 & 2) != 0 ? false : z11);
    }
}

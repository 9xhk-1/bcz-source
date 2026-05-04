package e8;

import e8.g;
import j.j;
import j.p;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.g0;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class g extends p {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class a<T> extends j<T> {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f49573b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ g f49574c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@k g gVar, @k String cacheKey, l<? super l.d, ? extends T> mapper) {
            super(mapper);
            g0.p(cacheKey, "cacheKey");
            g0.p(mapper, "mapper");
            this.f49574c = gVar;
            this.f49573b = cacheKey;
        }

        public static final g2 m(a aVar, l.f executeQuery) {
            g0.p(executeQuery, "$this$executeQuery");
            executeQuery.bindString(0, aVar.f49573b);
            return g2.f100423a;
        }

        @Override // j.i
        @k
        public <R> l.c<R> c(@k l<? super l.d, ? extends l.c<R>> mapper) {
            g0.p(mapper, "mapper");
            return this.f49574c.C().c5(-997127678, "SELECT UserCacheRecord.cacheKey, UserCacheRecord.payload FROM UserCacheRecord WHERE cacheKey = ?", mapper, 1, new l() { // from class: e8.f
                @Override // x00.l
                public final Object invoke(Object obj) {
                    g2 m11;
                    m11 = g.a.m(g.a.this, (l.f) obj);
                    return m11;
                }
            });
        }

        @Override // j.j
        public void j(@k j.a listener) {
            g0.p(listener, "listener");
            this.f49574c.C().Y1(new String[]{"UserCacheRecord"}, listener);
        }

        @Override // j.j
        public void k(@k j.a listener) {
            g0.p(listener, "listener");
            this.f49574c.C().F6(new String[]{"UserCacheRecord"}, listener);
        }

        @k
        public final String n() {
            return this.f49573b;
        }

        @k
        public String toString() {
            return "UserCache.sq:queryByKey";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.biz.cache.UserCacheQueries", f = "UserCacheQueries.kt", i = {0}, l = {50}, m = "deleteByKey", n = {"cacheKey"}, s = {"L$0"}, v = 1)
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f49575a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f49576b;

        /* renamed from: d, reason: collision with root package name */
        public int f49578d;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@k Object obj) {
            this.f49576b = obj;
            this.f49578d |= Integer.MIN_VALUE;
            return g.this.R(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.biz.cache.UserCacheQueries", f = "UserCacheQueries.kt", i = {0}, l = {36}, m = "insertOrUpdateRecord", n = {"UserCacheRecord"}, s = {"L$0"}, v = 1)
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f49579a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f49580b;

        /* renamed from: d, reason: collision with root package name */
        public int f49582d;

        public c(j00.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@k Object obj) {
            this.f49580b = obj;
            this.f49582d |= Integer.MIN_VALUE;
            return g.this.U(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements x00.p<String, byte[], h> {

        /* renamed from: a, reason: collision with root package name */
        public static final d f49583a = new d();

        public d() {
            super(2, h.class, "<init>", "<init>(Ljava/lang/String;[B)V", 0);
        }

        @Override // x00.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final h invoke(String p02, byte[] bArr) {
            g0.p(p02, "p0");
            return new h(p02, bArr);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(@k l.e driver) {
        super(driver);
        g0.p(driver, "driver");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2 S(String str, l.f execute) {
        g0.p(execute, "$this$execute");
        execute.bindString(0, str);
        return g2.f100423a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2 T(l emit) {
        g0.p(emit, "emit");
        emit.invoke("UserCacheRecord");
        return g2.f100423a;
    }

    public static final g2 V(h hVar, l.f execute) {
        g0.p(execute, "$this$execute");
        execute.bindString(0, hVar.e());
        execute.e(1, hVar.f());
        return g2.f100423a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2 W(l emit) {
        g0.p(emit, "emit");
        emit.invoke("UserCacheRecord");
        return g2.f100423a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object Z(x00.p pVar, l.d cursor) {
        g0.p(cursor, "cursor");
        String string = cursor.getString(0);
        g0.m(string);
        return pVar.invoke(string, cursor.getBytes(1));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object R(@m80.k final java.lang.String r8, @m80.k j00.c<? super java.lang.Long> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof e8.g.b
            if (r0 == 0) goto L13
            r0 = r9
            e8.g$b r0 = (e8.g.b) r0
            int r1 = r0.f49578d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f49578d = r1
            goto L18
        L13:
            e8.g$b r0 = new e8.g$b
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f49576b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f49578d
            r3 = -250363781(0xfffffffff113c07b, float:-7.3163186E29)
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 != r4) goto L30
            java.lang.Object r8 = r0.f49575a
            java.lang.String r8 = (java.lang.String) r8
            kotlin.e.n(r9)
            goto L5d
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            kotlin.e.n(r9)
            l.e r9 = r7.C()
            java.lang.Integer r2 = l00.a.f(r3)
            e8.d r5 = new e8.d
            r5.<init>()
            java.lang.String r6 = "DELETE FROM UserCacheRecord WHERE cacheKey = ?"
            l.c r9 = r9.v3(r2, r6, r4, r5)
            java.lang.Object r8 = l00.k.a(r8)
            r0.f49575a = r8
            r0.f49578d = r4
            java.lang.Object r9 = r9.i(r0)
            if (r9 != r1) goto L5d
            return r1
        L5d:
            java.lang.Number r9 = (java.lang.Number) r9
            long r8 = r9.longValue()
            e8.e r0 = new e8.e
            r0.<init>()
            r7.D(r3, r0)
            java.lang.Long r8 = l00.a.g(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.g.R(java.lang.String, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object U(@m80.k final e8.h r9, @m80.k j00.c<? super java.lang.Long> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof e8.g.c
            if (r0 == 0) goto L13
            r0 = r10
            e8.g$c r0 = (e8.g.c) r0
            int r1 = r0.f49582d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f49582d = r1
            goto L18
        L13:
            e8.g$c r0 = new e8.g$c
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f49580b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f49582d
            r3 = -164892680(0xfffffffff62beff8, float:-8.718261E32)
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 != r4) goto L30
            java.lang.Object r9 = r0.f49579a
            e8.h r9 = (e8.h) r9
            kotlin.e.n(r10)
            goto L5e
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L38:
            kotlin.e.n(r10)
            l.e r10 = r8.C()
            java.lang.Integer r2 = l00.a.f(r3)
            e8.a r5 = new e8.a
            r5.<init>()
            java.lang.String r6 = "INSERT OR REPLACE INTO UserCacheRecord(cacheKey, payload)\nVALUES (?, ?)"
            r7 = 2
            l.c r10 = r10.v3(r2, r6, r7, r5)
            java.lang.Object r9 = l00.k.a(r9)
            r0.f49579a = r9
            r0.f49582d = r4
            java.lang.Object r10 = r10.i(r0)
            if (r10 != r1) goto L5e
            return r1
        L5e:
            java.lang.Number r10 = (java.lang.Number) r10
            long r9 = r10.longValue()
            e8.b r0 = new e8.b
            r0.<init>()
            r8.D(r3, r0)
            java.lang.Long r9 = l00.a.g(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.g.U(e8.h, j00.c):java.lang.Object");
    }

    @k
    public final j<h> X(@k String cacheKey) {
        g0.p(cacheKey, "cacheKey");
        return Y(cacheKey, d.f49583a);
    }

    @k
    public final <T> j<T> Y(@k String cacheKey, @k final x00.p<? super String, ? super byte[], ? extends T> mapper) {
        g0.p(cacheKey, "cacheKey");
        g0.p(mapper, "mapper");
        return new a(this, cacheKey, new l() { // from class: e8.c
            @Override // x00.l
            public final Object invoke(Object obj) {
                Object Z;
                Z = g.Z(x00.p.this, (l.d) obj);
                return Z;
            }
        });
    }
}

package v7;

import c4.j;
import com.microsoft.thrifty.service.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.x0;
import l7.i0;
import l7.p;
import m80.k;
import m80.l;
import oa0.r;
import t7.g;
import t7.i;
import t8.t;
import y7.d;
import yz.c0;
import yz.e0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r(binds = {v7.b.class})
@u0({"SMAP\nIWordListResRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IWordListResRepo.kt\ncom/baicizhan/app/biz/wordlist/resource/WordResRepoImpl\n+ 2 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService\n+ 3 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt\n+ 4 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService$thrift$1\n+ 5 Koin.kt\norg/koin/core/Koin\n+ 6 Scope.kt\norg/koin/core/scope/Scope\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 8 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n*L\n1#1,72:1\n6#2:73\n64#3,2:74\n66#3:77\n67#3,2:83\n6#4:76\n124#5,4:78\n127#5:97\n142#6:82\n142#6:95\n1563#7:85\n1634#7,3:86\n41#8,6:89\n48#8:96\n*S KotlinDebug\n*F\n+ 1 IWordListResRepo.kt\ncom/baicizhan/app/biz/wordlist/resource/WordResRepoImpl\n*L\n33#1:73\n33#1:74,2\n33#1:77\n33#1:83,2\n33#1:76\n33#1:78,4\n28#1:97\n33#1:82\n28#1:95\n61#1:85\n61#1:86,3\n28#1:89,6\n28#1:96\n*E\n"})
/* loaded from: classes3.dex */
public final class f implements v7.b, j {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final v3.b f93156b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final p f93157c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final c0 f93158d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.wordlist.resource.WordResRepoImpl$getOrCreateDb$2", f = "IWordListResRepo.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class a extends SuspendLambda implements x00.p<l.e, j00.c<? super i>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f93159a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f93160b;

        public a(j00.c<? super a> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            a aVar = new a(cVar);
            aVar.f93160b = obj;
            return aVar;
        }

        @Override // x00.p
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(l.e eVar, j00.c<? super i> cVar) {
            return ((a) create(eVar, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            l.e eVar = (l.e) this.f93160b;
            kotlin.coroutines.intrinsics.b.l();
            if (this.f93159a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            return i.f89843e.b(eVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.wordlist.resource.WordResRepoImpl", f = "IWordListResRepo.kt", i = {0, 1, 1, 2, 2, 2, 3, 3, 3, 3, 3, 4, 4, 4, 5, 5, 6, 6}, l = {41, 43, 44, 45, 54, 56, 56}, m = "loadRecords", n = {"bookId", "bookId", "hasCache", "records", "bookId", "hasCache", "records", "$this$loadRecords_u24lambda_u240", "bookId", "hasCache", "$i$a$-apply-WordResRepoImpl$loadRecords$2", "records", "bookId", "hasCache", "bookId", "hasCache", "bookId", "hasCache"}, s = {"I$0", "I$0", "Z$0", "L$0", "I$0", "Z$0", "L$0", "L$2", "I$0", "Z$0", "I$1", "L$0", "I$0", "Z$0", "I$0", "Z$0", "I$0", "Z$0"}, v = 1)
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public int f93161a;

        /* renamed from: b, reason: collision with root package name */
        public int f93162b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f93163c;

        /* renamed from: d, reason: collision with root package name */
        public Object f93164d;

        /* renamed from: e, reason: collision with root package name */
        public Object f93165e;

        /* renamed from: f, reason: collision with root package name */
        public Object f93166f;

        /* renamed from: g, reason: collision with root package name */
        public /* synthetic */ Object f93167g;

        /* renamed from: i, reason: collision with root package name */
        public int f93169i;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f93167g = obj;
            this.f93169i |= Integer.MIN_VALUE;
            return f.this.b(0, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.wordlist.resource.WordResRepoImpl$loadRecords$2$1", f = "IWordListResRepo.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "invokeSuspend", n = {"$this$forEach$iv", "element$iv", "record", "$i$f$forEach", "$i$a$-forEach-WordResRepoImpl$loadRecords$2$1$2"}, s = {"L$0", "L$3", "L$4", "I$0", "I$1"}, v = 1)
    @u0({"SMAP\nIWordListResRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IWordListResRepo.kt\ncom/baicizhan/app/biz/wordlist/resource/WordResRepoImpl$loadRecords$2$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,72:1\n774#2:73\n865#2,2:74\n1869#2,2:76\n*S KotlinDebug\n*F\n+ 1 IWordListResRepo.kt\ncom/baicizhan/app/biz/wordlist/resource/WordResRepoImpl$loadRecords$2$1\n*L\n46#1:73\n46#1:74,2\n49#1:76,2\n*E\n"})
    public static final class c extends SuspendLambda implements x00.p<j.r, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f93170a;

        /* renamed from: b, reason: collision with root package name */
        public Object f93171b;

        /* renamed from: c, reason: collision with root package name */
        public Object f93172c;

        /* renamed from: d, reason: collision with root package name */
        public Object f93173d;

        /* renamed from: e, reason: collision with root package name */
        public Object f93174e;

        /* renamed from: f, reason: collision with root package name */
        public int f93175f;

        /* renamed from: g, reason: collision with root package name */
        public int f93176g;

        /* renamed from: h, reason: collision with root package name */
        public int f93177h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ List<t> f93178i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ i f93179j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List<t> list, i iVar, j00.c<? super c> cVar) {
            super(2, cVar);
            this.f93178i = list;
            this.f93179j = iVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return new c(this.f93178i, this.f93179j, cVar);
        }

        @Override // x00.p
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(j.r rVar, j00.c<? super g2> cVar) {
            return ((c) create(rVar, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Iterator it;
            i iVar;
            Iterable iterable;
            int i11;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i12 = this.f93177h;
            if (i12 == 0) {
                kotlin.e.n(obj);
                List<t> list = this.f93178i;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    String str = ((t) obj2).f90265d;
                    if (!(str == null || str.length() == 0)) {
                        arrayList.add(obj2);
                    }
                }
                i iVar2 = this.f93179j;
                it = arrayList.iterator();
                iVar = iVar2;
                iterable = arrayList;
                i11 = 0;
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i11 = this.f93175f;
                it = (Iterator) this.f93172c;
                iVar = (i) this.f93171b;
                iterable = (Iterable) this.f93170a;
                kotlin.e.n(obj);
            }
            while (it.hasNext()) {
                Object next = it.next();
                t tVar = (t) next;
                g k11 = iVar.k();
                t7.k a11 = v7.a.a(tVar);
                this.f93170a = l00.k.a(iterable);
                this.f93171b = iVar;
                this.f93172c = it;
                this.f93173d = l00.k.a(next);
                this.f93174e = l00.k.a(tVar);
                this.f93175f = i11;
                this.f93176g = 0;
                this.f93177h = 1;
                if (k11.R(a11, this) == l11) {
                    return l11;
                }
            }
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.wordlist.resource.WordResRepoImpl", f = "IWordListResRepo.kt", i = {0, 0, 1, 1}, l = {60, 62}, m = "loadRecordsByTopicId", n = {"topicIds", "bookId", "topicIds", "bookId"}, s = {"L$0", "I$0", "L$0", "I$0"}, v = 1)
    public static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public int f93180a;

        /* renamed from: b, reason: collision with root package name */
        public Object f93181b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f93182c;

        /* renamed from: e, reason: collision with root package name */
        public int f93184e;

        public d(j00.c<? super d> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f93182c = obj;
            this.f93184e |= Integer.MIN_VALUE;
            return f.this.a(0, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1\n*L\n1#1,122:1\n*E\n"})
    public static final class e implements x00.l<w7.d<t8.g>, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h10.d f93185a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l7.e f93186b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l7.c f93187c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1$1\n*L\n1#1,77:1\n*E\n"})
        public static final class a implements x00.l<d.a, g2> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ l7.e f93188a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l7.c f93189b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ h10.d f93190c;

            public a(l7.e eVar, l7.c cVar, h10.d dVar) {
                this.f93188a = eVar;
                this.f93189b = cVar;
                this.f93190c = dVar;
            }

            public final void a(d.a randomRetry) {
                g0.p(randomRetry, "$this$randomRetry");
                Integer a11 = this.f93188a.a();
                if (a11 != null) {
                    randomRetry.i(a11.intValue());
                }
                Long b11 = this.f93188a.b();
                if (b11 != null) {
                    randomRetry.h(new Long[]{Long.valueOf(b11.longValue())});
                }
                randomRetry.j(this.f93189b.b(this.f93190c));
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(d.a aVar) {
                a(aVar);
                return g2.f100423a;
            }
        }

        public e(h10.d dVar, l7.e eVar, l7.c cVar) {
            this.f93185a = dVar;
            this.f93186b = eVar;
            this.f93187c = cVar;
        }

        public final void a(w7.d<t8.g> thriftBuilder) {
            g0.p(thriftBuilder, "$this$thriftBuilder");
            y7.f.a(thriftBuilder, new a(this.f93186b, this.f93187c, this.f93185a));
            x00.p<ws.i, a.InterfaceC0480a, ?> pVar = i0.o().get(this.f93185a);
            g0.n(pVar, "null cannot be cast to non-null type kotlin.Function2<com.microsoft.thrifty.protocol.Protocol, com.microsoft.thrifty.service.AsyncClientBase.Listener, T of com.baicizhan.app.biz.thrift.ThriftServiceImplKt.thriftImpl>");
            thriftBuilder.f((x00.p) x0.q(pVar, 2));
            thriftBuilder.g(i0.a.b.f70581a);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(w7.d<t8.g> dVar) {
            a(dVar);
            return g2.f100423a;
        }
    }

    public f(@k v3.b dbPoll, @k p thrift) {
        g0.p(dbPoll, "dbPoll");
        g0.p(thrift, "thrift");
        this.f93156b = dbPoll;
        this.f93157c = thrift;
        this.f93158d = e0.c(new x00.a() { // from class: v7.e
            @Override // x00.a
            public final Object invoke() {
                com.baicizhan.app.preferences.g j11;
                j11 = f.j(f.this);
                return j11;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object f(j00.c<? super i> cVar) {
        return v3.b.b(this.f93156b, i.f89843e.a(), v7.c.f93154b, false, new a(null), cVar, 4, null);
    }

    private final com.baicizhan.app.preferences.g g() {
        return (com.baicizhan.app.preferences.g) this.f93158d.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final com.baicizhan.app.preferences.g j(f fVar) {
        return (com.baicizhan.app.preferences.g) (fVar instanceof pa0.c ? ((pa0.c) fVar).getScope() : fVar.r().P().h()).i(o0.d(com.baicizhan.app.preferences.g.class), null, new x00.a() { // from class: v7.d
            @Override // x00.a
            public final Object invoke() {
                ya0.a k11;
                k11 = f.k();
                return k11;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ya0.a k() {
        return ya0.b.d(v7.c.f93153a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x004f, code lost:
    
        if (r12 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0071 A[LOOP:0: B:17:0x006b->B:19:0x0071, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0098 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0099 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // v7.b
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(int r10, @m80.k java.util.List<java.lang.Integer> r11, @m80.k j00.c<? super java.util.List<t7.k>> r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof v7.f.d
            if (r0 == 0) goto L13
            r0 = r12
            v7.f$d r0 = (v7.f.d) r0
            int r1 = r0.f93184e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f93184e = r1
            goto L18
        L13:
            v7.f$d r0 = new v7.f$d
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f93182c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f93184e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r10 = r0.f93181b
            java.util.List r10 = (java.util.List) r10
            kotlin.e.n(r12)
            return r12
        L30:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L38:
            int r10 = r0.f93180a
            java.lang.Object r11 = r0.f93181b
            java.util.List r11 = (java.util.List) r11
            kotlin.e.n(r12)
            goto L52
        L42:
            kotlin.e.n(r12)
            r0.f93181b = r11
            r0.f93180a = r10
            r0.f93184e = r4
            java.lang.Object r12 = r9.f(r0)
            if (r12 != r1) goto L52
            goto L98
        L52:
            t7.i r12 = (t7.i) r12
            t7.g r12 = r12.k()
            long r4 = (long) r10
            r2 = r11
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r6 = new java.util.ArrayList
            r7 = 10
            int r7 = a00.i0.d0(r2, r7)
            r6.<init>(r7)
            java.util.Iterator r2 = r2.iterator()
        L6b:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L84
            java.lang.Object r7 = r2.next()
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            long r7 = (long) r7
            java.lang.Long r7 = l00.a.g(r7)
            r6.add(r7)
            goto L6b
        L84:
            j.j r12 = r12.X(r4, r6)
            java.lang.Object r11 = l00.k.a(r11)
            r0.f93181b = r11
            r0.f93180a = r10
            r0.f93184e = r3
            java.lang.Object r10 = k.e.c(r12, r0)
            if (r10 != r1) goto L99
        L98:
            return r1
        L99:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: v7.f.a(int, java.util.List, j00.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0123, code lost:
    
        if (r14 != r0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0111, code lost:
    
        if (r14.g(r3, true, r4) != r0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x008a, code lost:
    
        if (r14 == r0) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    @Override // v7.b
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(int r13, @m80.k j00.c<? super java.util.List<t7.k>> r14) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v7.f.b(int, j00.c):java.lang.Object");
    }

    public final t8.g i() {
        return (t8.g) w7.f.b(new e(o0.d(t8.g.class), new l7.e(null, null, 3, null), (l7.c) j.f7801a.a().P().h().i(o0.d(l7.c.class), null, null)));
    }

    @Override // c4.j, pa0.a
    @k
    public /* bridge */ na0.a r() {
        return super.r();
    }
}

package p7;

import j.j;
import java.util.Collection;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.u0;
import p7.l0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nUserBookWordsQueries.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserBookWordsQueries.kt\ncom/baicizhan/app/biz/userbook/UserBookWordsQueries\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,218:1\n1869#2,2:219\n*S KotlinDebug\n*F\n+ 1 UserBookWordsQueries.kt\ncom/baicizhan/app/biz/userbook/UserBookWordsQueries\n*L\n137#1:219,2\n*E\n"})
/* loaded from: classes3.dex */
public final class l0 extends j.p {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class a<T> extends j.j<T> {

        /* renamed from: b, reason: collision with root package name */
        public final long f79365b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l0 f79366c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(l0 l0Var, @m80.k long j11, x00.l<? super l.d, ? extends T> mapper) {
            super(mapper);
            kotlin.jvm.internal.g0.p(mapper, "mapper");
            this.f79366c = l0Var;
            this.f79365b = j11;
        }

        public static final g2 m(a aVar, l.f executeQuery) {
            kotlin.jvm.internal.g0.p(executeQuery, "$this$executeQuery");
            executeQuery.c(0, Long.valueOf(aVar.f79365b));
            return g2.f100423a;
        }

        @Override // j.i
        @m80.k
        public <R> l.c<R> c(@m80.k x00.l<? super l.d, ? extends l.c<R>> mapper) {
            kotlin.jvm.internal.g0.p(mapper, "mapper");
            return this.f79366c.C().c5(366449753, "SELECT UserBookWordRecord.topicId, UserBookWordRecord.userBookId, UserBookWordRecord.bookId, UserBookWordRecord.createdAt, UserBookWordRecord.word, UserBookWordRecord.mean, UserBookWordRecord.audioUs, UserBookWordRecord.audioUk FROM UserBookWordRecord WHERE userBookId = ?", mapper, 1, new x00.l() { // from class: p7.k0
                @Override // x00.l
                public final Object invoke(Object obj) {
                    g2 m11;
                    m11 = l0.a.m(l0.a.this, (l.f) obj);
                    return m11;
                }
            });
        }

        @Override // j.j
        public void j(@m80.k j.a listener) {
            kotlin.jvm.internal.g0.p(listener, "listener");
            this.f79366c.C().Y1(new String[]{"UserBookWordRecord"}, listener);
        }

        @Override // j.j
        public void k(@m80.k j.a listener) {
            kotlin.jvm.internal.g0.p(listener, "listener");
            this.f79366c.C().F6(new String[]{"UserBookWordRecord"}, listener);
        }

        public final long n() {
            return this.f79365b;
        }

        @m80.k
        public String toString() {
            return "UserBookWords.sq:queryByUserBookId";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nUserBookWordsQueries.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserBookWordsQueries.kt\ncom/baicizhan/app/biz/userbook/UserBookWordsQueries$QueryTopicIdsByTopicIdsQuery\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,218:1\n1869#2,2:219\n*S KotlinDebug\n*F\n+ 1 UserBookWordsQueries.kt\ncom/baicizhan/app/biz/userbook/UserBookWordsQueries$QueryTopicIdsByTopicIdsQuery\n*L\n209#1:219,2\n*E\n"})
    public final class b<T> extends j.j<T> {

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final Collection<Long> f79367b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l0 f79368c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@m80.k l0 l0Var, @m80.k Collection<Long> topicId, x00.l<? super l.d, ? extends T> mapper) {
            super(mapper);
            kotlin.jvm.internal.g0.p(topicId, "topicId");
            kotlin.jvm.internal.g0.p(mapper, "mapper");
            this.f79368c = l0Var;
            this.f79367b = topicId;
        }

        public static final g2 m(b bVar, l.f executeQuery) {
            kotlin.jvm.internal.g0.p(executeQuery, "$this$executeQuery");
            Iterator<T> it = bVar.f79367b.iterator();
            int i11 = 0;
            while (it.hasNext()) {
                executeQuery.c(i11, Long.valueOf(((Number) it.next()).longValue()));
                i11++;
            }
            return g2.f100423a;
        }

        @Override // j.i
        @m80.k
        public <R> l.c<R> c(@m80.k x00.l<? super l.d, ? extends l.c<R>> mapper) {
            kotlin.jvm.internal.g0.p(mapper, "mapper");
            String B = this.f79368c.B(this.f79367b.size());
            return this.f79368c.C().c5(null, "SELECT topicId FROM UserBookWordRecord WHERE topicId IN " + B, mapper, this.f79367b.size(), new x00.l() { // from class: p7.m0
                @Override // x00.l
                public final Object invoke(Object obj) {
                    g2 m11;
                    m11 = l0.b.m(l0.b.this, (l.f) obj);
                    return m11;
                }
            });
        }

        @Override // j.j
        public void j(@m80.k j.a listener) {
            kotlin.jvm.internal.g0.p(listener, "listener");
            this.f79368c.C().Y1(new String[]{"UserBookWordRecord"}, listener);
        }

        @Override // j.j
        public void k(@m80.k j.a listener) {
            kotlin.jvm.internal.g0.p(listener, "listener");
            this.f79368c.C().F6(new String[]{"UserBookWordRecord"}, listener);
        }

        @m80.k
        public final Collection<Long> n() {
            return this.f79367b;
        }

        @m80.k
        public String toString() {
            return "UserBookWords.sq:queryTopicIdsByTopicIds";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nUserBookWordsQueries.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserBookWordsQueries.kt\ncom/baicizhan/app/biz/userbook/UserBookWordsQueries$QueryWordCountInUserBookIdsGroupByUserBookIdQuery\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,218:1\n1869#2,2:219\n*S KotlinDebug\n*F\n+ 1 UserBookWordsQueries.kt\ncom/baicizhan/app/biz/userbook/UserBookWordsQueries$QueryWordCountInUserBookIdsGroupByUserBookIdQuery\n*L\n184#1:219,2\n*E\n"})
    public final class c<T> extends j.j<T> {

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final Collection<Long> f79369b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l0 f79370c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@m80.k l0 l0Var, @m80.k Collection<Long> userBookId, x00.l<? super l.d, ? extends T> mapper) {
            super(mapper);
            kotlin.jvm.internal.g0.p(userBookId, "userBookId");
            kotlin.jvm.internal.g0.p(mapper, "mapper");
            this.f79370c = l0Var;
            this.f79369b = userBookId;
        }

        public static final g2 m(c cVar, l.f executeQuery) {
            kotlin.jvm.internal.g0.p(executeQuery, "$this$executeQuery");
            Iterator<T> it = cVar.f79369b.iterator();
            int i11 = 0;
            while (it.hasNext()) {
                executeQuery.c(i11, Long.valueOf(((Number) it.next()).longValue()));
                i11++;
            }
            return g2.f100423a;
        }

        @Override // j.i
        @m80.k
        public <R> l.c<R> c(@m80.k x00.l<? super l.d, ? extends l.c<R>> mapper) {
            kotlin.jvm.internal.g0.p(mapper, "mapper");
            String B = this.f79370c.B(this.f79369b.size());
            return this.f79370c.C().c5(null, "SELECT userBookId, COUNT(*) FROM UserBookWordRecord WHERE userBookId IN " + B + " GROUP BY userBookId", mapper, this.f79369b.size(), new x00.l() { // from class: p7.n0
                @Override // x00.l
                public final Object invoke(Object obj) {
                    g2 m11;
                    m11 = l0.c.m(l0.c.this, (l.f) obj);
                    return m11;
                }
            });
        }

        @Override // j.j
        public void j(@m80.k j.a listener) {
            kotlin.jvm.internal.g0.p(listener, "listener");
            this.f79370c.C().Y1(new String[]{"UserBookWordRecord"}, listener);
        }

        @Override // j.j
        public void k(@m80.k j.a listener) {
            kotlin.jvm.internal.g0.p(listener, "listener");
            this.f79370c.C().F6(new String[]{"UserBookWordRecord"}, listener);
        }

        @m80.k
        public final Collection<Long> n() {
            return this.f79369b;
        }

        @m80.k
        public String toString() {
            return "UserBookWords.sq:queryWordCountInUserBookIdsGroupByUserBookId";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.userbook.UserBookWordsQueries", f = "UserBookWordsQueries.kt", i = {0, 0}, l = {109}, m = "deleteByTopicIdAndUserBookId", n = {"topicId", "userBookId"}, s = {"J$0", "J$1"}, v = 1)
    public static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f79371a;

        /* renamed from: b, reason: collision with root package name */
        public long f79372b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f79373c;

        /* renamed from: e, reason: collision with root package name */
        public int f79375e;

        public d(j00.c<? super d> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f79373c = obj;
            this.f79375e |= Integer.MIN_VALUE;
            return l0.this.a0(0L, 0L, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.userbook.UserBookWordsQueries", f = "UserBookWordsQueries.kt", i = {0, 0, 0}, l = {141}, m = "deleteByTopicIdsAndUserBookId", n = {"topicId", "topicIdIndexes", "userBookId"}, s = {"L$0", "L$1", "J$0"}, v = 1)
    public static final class e extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f79376a;

        /* renamed from: b, reason: collision with root package name */
        public Object f79377b;

        /* renamed from: c, reason: collision with root package name */
        public long f79378c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f79379d;

        /* renamed from: f, reason: collision with root package name */
        public int f79381f;

        public e(j00.c<? super e> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f79379d = obj;
            this.f79381f |= Integer.MIN_VALUE;
            return l0.this.d0(null, 0L, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.userbook.UserBookWordsQueries", f = "UserBookWordsQueries.kt", i = {0}, l = {123}, m = "deleteByUserBookId", n = {"userBookId"}, s = {"J$0"}, v = 1)
    public static final class f extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f79382a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f79383b;

        /* renamed from: d, reason: collision with root package name */
        public int f79385d;

        public f(j00.c<? super f> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f79383b = obj;
            this.f79385d |= Integer.MIN_VALUE;
            return l0.this.g0(0L, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.userbook.UserBookWordsQueries", f = "UserBookWordsQueries.kt", i = {0}, l = {94}, m = "insertOrIgnoreRecord", n = {"UserBookWordRecord"}, s = {"L$0"}, v = 1)
    public static final class g extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f79386a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f79387b;

        /* renamed from: d, reason: collision with root package name */
        public int f79389d;

        public g(j00.c<? super g> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f79387b = obj;
            this.f79389d |= Integer.MIN_VALUE;
            return l0.this.j0(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.userbook.UserBookWordsQueries", f = "UserBookWordsQueries.kt", i = {0}, l = {70}, m = "insertOrReplaceRecord", n = {"UserBookWordRecord"}, s = {"L$0"}, v = 1)
    public static final class h extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f79390a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f79391b;

        /* renamed from: d, reason: collision with root package name */
        public int f79393d;

        public h(j00.c<? super h> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f79391b = obj;
            this.f79393d |= Integer.MIN_VALUE;
            return l0.this.m0(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class i extends FunctionReferenceImpl implements x00.v<Long, Long, Long, Long, String, String, String, String, w> {

        /* renamed from: a, reason: collision with root package name */
        public static final i f79394a = new i();

        public i() {
            super(8, w.class, "<init>", "<init>(JJJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", 0);
        }

        public final w a(long j11, long j12, long j13, long j14, String p42, String p52, String p62, String p72) {
            kotlin.jvm.internal.g0.p(p42, "p4");
            kotlin.jvm.internal.g0.p(p52, "p5");
            kotlin.jvm.internal.g0.p(p62, "p6");
            kotlin.jvm.internal.g0.p(p72, "p7");
            return new w(j11, j12, j13, j14, p42, p52, p62, p72);
        }

        @Override // x00.v
        public /* bridge */ /* synthetic */ w invoke(Long l11, Long l12, Long l13, Long l14, String str, String str2, String str3, String str4) {
            return a(l11.longValue(), l12.longValue(), l13.longValue(), l14.longValue(), str, str2, str3, str4);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class j extends FunctionReferenceImpl implements x00.p<Long, Long, p7.b> {

        /* renamed from: a, reason: collision with root package name */
        public static final j f79395a = new j();

        public j() {
            super(2, p7.b.class, "<init>", "<init>(JJ)V", 0);
        }

        public final p7.b a(long j11, long j12) {
            return new p7.b(j11, j12);
        }

        @Override // x00.p
        public /* bridge */ /* synthetic */ p7.b invoke(Long l11, Long l12) {
            return a(l11.longValue(), l12.longValue());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(@m80.k l.e driver) {
        super(driver);
        kotlin.jvm.internal.g0.p(driver, "driver");
    }

    public static final g2 b0(long j11, long j12, l.f execute) {
        kotlin.jvm.internal.g0.p(execute, "$this$execute");
        execute.c(0, Long.valueOf(j11));
        execute.c(1, Long.valueOf(j12));
        return g2.f100423a;
    }

    public static final g2 c0(x00.l emit) {
        kotlin.jvm.internal.g0.p(emit, "emit");
        emit.invoke("UserBookWordRecord");
        return g2.f100423a;
    }

    public static final g2 e0(Collection collection, long j11, l.f execute) {
        kotlin.jvm.internal.g0.p(execute, "$this$execute");
        Iterator it = collection.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            execute.c(i11, Long.valueOf(((Number) it.next()).longValue()));
            i11++;
        }
        execute.c(i11, Long.valueOf(j11));
        return g2.f100423a;
    }

    public static final g2 f0(x00.l emit) {
        kotlin.jvm.internal.g0.p(emit, "emit");
        emit.invoke("UserBookWordRecord");
        return g2.f100423a;
    }

    public static final g2 h0(long j11, l.f execute) {
        kotlin.jvm.internal.g0.p(execute, "$this$execute");
        execute.c(0, Long.valueOf(j11));
        return g2.f100423a;
    }

    public static final g2 i0(x00.l emit) {
        kotlin.jvm.internal.g0.p(emit, "emit");
        emit.invoke("UserBookWordRecord");
        return g2.f100423a;
    }

    public static final g2 k0(w wVar, l.f execute) {
        kotlin.jvm.internal.g0.p(execute, "$this$execute");
        execute.c(0, Long.valueOf(wVar.p()));
        execute.c(1, Long.valueOf(wVar.q()));
        execute.c(2, Long.valueOf(wVar.m()));
        execute.c(3, Long.valueOf(wVar.n()));
        execute.bindString(4, wVar.r());
        execute.bindString(5, wVar.o());
        execute.bindString(6, wVar.l());
        execute.bindString(7, wVar.k());
        return g2.f100423a;
    }

    public static final g2 l0(x00.l emit) {
        kotlin.jvm.internal.g0.p(emit, "emit");
        emit.invoke("UserBookWordRecord");
        return g2.f100423a;
    }

    public static final g2 n0(w wVar, l.f execute) {
        kotlin.jvm.internal.g0.p(execute, "$this$execute");
        execute.c(0, Long.valueOf(wVar.p()));
        execute.c(1, Long.valueOf(wVar.q()));
        execute.c(2, Long.valueOf(wVar.m()));
        execute.c(3, Long.valueOf(wVar.n()));
        execute.bindString(4, wVar.r());
        execute.bindString(5, wVar.o());
        execute.bindString(6, wVar.l());
        execute.bindString(7, wVar.k());
        return g2.f100423a;
    }

    public static final g2 o0(x00.l emit) {
        kotlin.jvm.internal.g0.p(emit, "emit");
        emit.invoke("UserBookWordRecord");
        return g2.f100423a;
    }

    public static final Object r0(x00.v vVar, l.d cursor) {
        kotlin.jvm.internal.g0.p(cursor, "cursor");
        Long l11 = cursor.getLong(0);
        kotlin.jvm.internal.g0.m(l11);
        Long l12 = cursor.getLong(1);
        kotlin.jvm.internal.g0.m(l12);
        Long l13 = cursor.getLong(2);
        kotlin.jvm.internal.g0.m(l13);
        Long l14 = cursor.getLong(3);
        kotlin.jvm.internal.g0.m(l14);
        String string = cursor.getString(4);
        kotlin.jvm.internal.g0.m(string);
        String string2 = cursor.getString(5);
        kotlin.jvm.internal.g0.m(string2);
        String string3 = cursor.getString(6);
        kotlin.jvm.internal.g0.m(string3);
        String string4 = cursor.getString(7);
        kotlin.jvm.internal.g0.m(string4);
        return vVar.invoke(l11, l12, l13, l14, string, string2, string3, string4);
    }

    public static final long t0(l.d cursor) {
        kotlin.jvm.internal.g0.p(cursor, "cursor");
        Long l11 = cursor.getLong(0);
        kotlin.jvm.internal.g0.m(l11);
        return l11.longValue();
    }

    public static final Object w0(x00.p pVar, l.d cursor) {
        kotlin.jvm.internal.g0.p(cursor, "cursor");
        Long l11 = cursor.getLong(0);
        kotlin.jvm.internal.g0.m(l11);
        Long l12 = cursor.getLong(1);
        kotlin.jvm.internal.g0.m(l12);
        return pVar.invoke(l11, l12);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a0(final long r9, final long r11, @m80.k j00.c<? super java.lang.Long> r13) {
        /*
            r8 = this;
            boolean r0 = r13 instanceof p7.l0.d
            if (r0 == 0) goto L13
            r0 = r13
            p7.l0$d r0 = (p7.l0.d) r0
            int r1 = r0.f79375e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f79375e = r1
            goto L18
        L13:
            p7.l0$d r0 = new p7.l0$d
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f79373c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f79375e
            r3 = 225173427(0xd6bdfb3, float:7.2684234E-31)
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            kotlin.e.n(r13)
            goto L58
        L2c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L34:
            kotlin.e.n(r13)
            l.e r13 = r8.C()
            java.lang.Integer r2 = l00.a.f(r3)
            p7.i0 r5 = new p7.i0
            r5.<init>()
            java.lang.String r6 = "DELETE FROM UserBookWordRecord WHERE topicId = ? AND userBookId = ?"
            r7 = 2
            l.c r13 = r13.v3(r2, r6, r7, r5)
            r0.f79371a = r9
            r0.f79372b = r11
            r0.f79375e = r4
            java.lang.Object r13 = r13.i(r0)
            if (r13 != r1) goto L58
            return r1
        L58:
            java.lang.Number r13 = (java.lang.Number) r13
            long r9 = r13.longValue()
            p7.j0 r11 = new p7.j0
            r11.<init>()
            r8.D(r3, r11)
            java.lang.Long r9 = l00.a.g(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.l0.a0(long, long, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d0(@m80.k final java.util.Collection<java.lang.Long> r9, final long r10, @m80.k j00.c<? super java.lang.Long> r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof p7.l0.e
            if (r0 == 0) goto L13
            r0 = r12
            p7.l0$e r0 = (p7.l0.e) r0
            int r1 = r0.f79381f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f79381f = r1
            goto L18
        L13:
            p7.l0$e r0 = new p7.l0$e
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f79379d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f79381f
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r9 = r0.f79377b
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r9 = r0.f79376a
            java.util.Collection r9 = (java.util.Collection) r9
            kotlin.e.n(r12)
            goto L84
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L39:
            kotlin.e.n(r12)
            int r12 = r9.size()
            java.lang.String r12 = r8.B(r12)
            l.e r2 = r8.C()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "DELETE FROM UserBookWordRecord WHERE topicId IN "
            r4.append(r5)
            r4.append(r12)
            java.lang.String r5 = " AND userBookId = ?"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            int r5 = r9.size()
            int r5 = r5 + r3
            p7.g0 r6 = new p7.g0
            r6.<init>()
            r7 = 0
            l.c r2 = r2.v3(r7, r4, r5, r6)
            java.lang.Object r9 = l00.k.a(r9)
            r0.f79376a = r9
            java.lang.Object r9 = l00.k.a(r12)
            r0.f79377b = r9
            r0.f79378c = r10
            r0.f79381f = r3
            java.lang.Object r12 = r2.i(r0)
            if (r12 != r1) goto L84
            return r1
        L84:
            java.lang.Number r12 = (java.lang.Number) r12
            long r9 = r12.longValue()
            p7.h0 r11 = new p7.h0
            r11.<init>()
            r12 = -1446567514(0xffffffffa9c721a6, float:-8.8432123E-14)
            r8.D(r12, r11)
            java.lang.Long r9 = l00.a.g(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.l0.d0(java.util.Collection, long, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g0(final long r8, @m80.k j00.c<? super java.lang.Long> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof p7.l0.f
            if (r0 == 0) goto L13
            r0 = r10
            p7.l0$f r0 = (p7.l0.f) r0
            int r1 = r0.f79385d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f79385d = r1
            goto L18
        L13:
            p7.l0$f r0 = new p7.l0$f
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f79383b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f79385d
            r3 = -2003323450(0xffffffff8897b5c6, float:-9.130717E-34)
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            kotlin.e.n(r10)
            goto L55
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            kotlin.e.n(r10)
            l.e r10 = r7.C()
            java.lang.Integer r2 = l00.a.f(r3)
            p7.b0 r5 = new p7.b0
            r5.<init>()
            java.lang.String r6 = "DELETE FROM UserBookWordRecord WHERE userBookId = ?"
            l.c r10 = r10.v3(r2, r6, r4, r5)
            r0.f79382a = r8
            r0.f79385d = r4
            java.lang.Object r10 = r10.i(r0)
            if (r10 != r1) goto L55
            return r1
        L55:
            java.lang.Number r10 = (java.lang.Number) r10
            long r8 = r10.longValue()
            p7.c0 r10 = new p7.c0
            r10.<init>()
            r7.D(r3, r10)
            java.lang.Long r8 = l00.a.g(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.l0.g0(long, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j0(@m80.k final p7.w r9, @m80.k j00.c<? super java.lang.Long> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof p7.l0.g
            if (r0 == 0) goto L13
            r0 = r10
            p7.l0$g r0 = (p7.l0.g) r0
            int r1 = r0.f79389d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f79389d = r1
            goto L18
        L13:
            p7.l0$g r0 = new p7.l0$g
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f79387b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f79389d
            r3 = 272322388(0x103b4f54, float:3.694036E-29)
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 != r4) goto L30
            java.lang.Object r9 = r0.f79386a
            p7.w r9 = (p7.w) r9
            kotlin.e.n(r10)
            goto L5f
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L38:
            kotlin.e.n(r10)
            l.e r10 = r8.C()
            java.lang.Integer r2 = l00.a.f(r3)
            p7.e0 r5 = new p7.e0
            r5.<init>()
            java.lang.String r6 = "INSERT OR IGNORE INTO UserBookWordRecord(topicId, userBookId, bookId, createdAt, word, mean, audioUs, audioUk)\nVALUES (?, ?, ?, ?, ?, ?, ?, ?)"
            r7 = 8
            l.c r10 = r10.v3(r2, r6, r7, r5)
            java.lang.Object r9 = l00.k.a(r9)
            r0.f79386a = r9
            r0.f79389d = r4
            java.lang.Object r10 = r10.i(r0)
            if (r10 != r1) goto L5f
            return r1
        L5f:
            java.lang.Number r10 = (java.lang.Number) r10
            long r9 = r10.longValue()
            p7.f0 r0 = new p7.f0
            r0.<init>()
            r8.D(r3, r0)
            java.lang.Long r9 = l00.a.g(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.l0.j0(p7.w, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m0(@m80.k final p7.w r9, @m80.k j00.c<? super java.lang.Long> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof p7.l0.h
            if (r0 == 0) goto L13
            r0 = r10
            p7.l0$h r0 = (p7.l0.h) r0
            int r1 = r0.f79393d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f79393d = r1
            goto L18
        L13:
            p7.l0$h r0 = new p7.l0$h
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f79391b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f79393d
            r3 = -1144592460(0xffffffffbbc6e7b4, float:-0.0060701016)
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 != r4) goto L30
            java.lang.Object r9 = r0.f79390a
            p7.w r9 = (p7.w) r9
            kotlin.e.n(r10)
            goto L5f
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L38:
            kotlin.e.n(r10)
            l.e r10 = r8.C()
            java.lang.Integer r2 = l00.a.f(r3)
            p7.y r5 = new p7.y
            r5.<init>()
            java.lang.String r6 = "INSERT OR REPLACE INTO UserBookWordRecord(topicId, userBookId, bookId, createdAt, word, mean, audioUs, audioUk)\nVALUES (?, ?, ?, ?, ?, ?, ?, ?)"
            r7 = 8
            l.c r10 = r10.v3(r2, r6, r7, r5)
            java.lang.Object r9 = l00.k.a(r9)
            r0.f79390a = r9
            r0.f79393d = r4
            java.lang.Object r10 = r10.i(r0)
            if (r10 != r1) goto L5f
            return r1
        L5f:
            java.lang.Number r10 = (java.lang.Number) r10
            long r9 = r10.longValue()
            p7.z r0 = new p7.z
            r0.<init>()
            r8.D(r3, r0)
            java.lang.Long r9 = l00.a.g(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.l0.m0(p7.w, j00.c):java.lang.Object");
    }

    @m80.k
    public final j.j<w> p0(long j11) {
        return q0(j11, i.f79394a);
    }

    @m80.k
    public final <T> j.j<T> q0(long j11, @m80.k final x00.v<? super Long, ? super Long, ? super Long, ? super Long, ? super String, ? super String, ? super String, ? super String, ? extends T> mapper) {
        kotlin.jvm.internal.g0.p(mapper, "mapper");
        return new a(this, j11, new x00.l() { // from class: p7.d0
            @Override // x00.l
            public final Object invoke(Object obj) {
                Object r02;
                r02 = l0.r0(x00.v.this, (l.d) obj);
                return r02;
            }
        });
    }

    @m80.k
    public final j.j<Long> s0(@m80.k Collection<Long> topicId) {
        kotlin.jvm.internal.g0.p(topicId, "topicId");
        return new b(this, topicId, new x00.l() { // from class: p7.a0
            @Override // x00.l
            public final Object invoke(Object obj) {
                long t02;
                t02 = l0.t0((l.d) obj);
                return Long.valueOf(t02);
            }
        });
    }

    @m80.k
    public final j.j<p7.b> u0(@m80.k Collection<Long> userBookId) {
        kotlin.jvm.internal.g0.p(userBookId, "userBookId");
        return v0(userBookId, j.f79395a);
    }

    @m80.k
    public final <T> j.j<T> v0(@m80.k Collection<Long> userBookId, @m80.k final x00.p<? super Long, ? super Long, ? extends T> mapper) {
        kotlin.jvm.internal.g0.p(userBookId, "userBookId");
        kotlin.jvm.internal.g0.p(mapper, "mapper");
        return new c(this, userBookId, new x00.l() { // from class: p7.x
            @Override // x00.l
            public final Object invoke(Object obj) {
                Object w02;
                w02 = l0.w0(x00.p.this, (l.d) obj);
                return w02;
            }
        });
    }
}

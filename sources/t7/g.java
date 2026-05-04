package t7;

import j.j;
import java.util.Collection;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import t7.g;
import x00.s;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class g extends j.p {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nResourceQueries.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResourceQueries.kt\ncom/baicizhan/app/biz/wordlist/ResourceQueries$QueryByBookIdAndTopicIdsQuery\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,124:1\n1869#2,2:125\n*S KotlinDebug\n*F\n+ 1 ResourceQueries.kt\ncom/baicizhan/app/biz/wordlist/ResourceQueries$QueryByBookIdAndTopicIdsQuery\n*L\n115#1:125,2\n*E\n"})
    public final class a<T> extends j.j<T> {

        /* renamed from: b, reason: collision with root package name */
        public final long f89831b;

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public final Collection<Long> f89832c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ g f89833d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g gVar, @m80.k long j11, @m80.k Collection<Long> topicId, x00.l<? super l.d, ? extends T> mapper) {
            super(mapper);
            g0.p(topicId, "topicId");
            g0.p(mapper, "mapper");
            this.f89833d = gVar;
            this.f89831b = j11;
            this.f89832c = topicId;
        }

        public static final g2 m(a aVar, l.f executeQuery) {
            g0.p(executeQuery, "$this$executeQuery");
            executeQuery.c(0, Long.valueOf(aVar.f89831b));
            Iterator<T> it = aVar.f89832c.iterator();
            int i11 = 1;
            while (it.hasNext()) {
                executeQuery.c(i11, Long.valueOf(((Number) it.next()).longValue()));
                i11++;
            }
            return g2.f100423a;
        }

        @Override // j.i
        @m80.k
        public <R> l.c<R> c(@m80.k x00.l<? super l.d, ? extends l.c<R>> mapper) {
            g0.p(mapper, "mapper");
            String B = this.f89833d.B(this.f89832c.size());
            return this.f89833d.C().c5(null, "SELECT WordListResourceRecord.bookId, WordListResourceRecord.topicId, WordListResourceRecord.word, WordListResourceRecord.meanCn, WordListResourceRecord.accentUsaAudioUri FROM WordListResourceRecord WHERE bookId = ? AND topicId IN " + B, mapper, this.f89832c.size() + 1, new x00.l() { // from class: t7.f
                @Override // x00.l
                public final Object invoke(Object obj) {
                    g2 m11;
                    m11 = g.a.m(g.a.this, (l.f) obj);
                    return m11;
                }
            });
        }

        @Override // j.j
        public void j(@m80.k j.a listener) {
            g0.p(listener, "listener");
            this.f89833d.C().Y1(new String[]{"WordListResourceRecord"}, listener);
        }

        @Override // j.j
        public void k(@m80.k j.a listener) {
            g0.p(listener, "listener");
            this.f89833d.C().F6(new String[]{"WordListResourceRecord"}, listener);
        }

        public final long n() {
            return this.f89831b;
        }

        @m80.k
        public final Collection<Long> o() {
            return this.f89832c;
        }

        @m80.k
        public String toString() {
            return "Resource.sq:queryByBookIdAndTopicIds";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class b<T> extends j.j<T> {

        /* renamed from: b, reason: collision with root package name */
        public final long f89834b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ g f89835c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(g gVar, @m80.k long j11, x00.l<? super l.d, ? extends T> mapper) {
            super(mapper);
            g0.p(mapper, "mapper");
            this.f89835c = gVar;
            this.f89834b = j11;
        }

        public static final g2 m(b bVar, l.f executeQuery) {
            g0.p(executeQuery, "$this$executeQuery");
            executeQuery.c(0, Long.valueOf(bVar.f89834b));
            return g2.f100423a;
        }

        @Override // j.i
        @m80.k
        public <R> l.c<R> c(@m80.k x00.l<? super l.d, ? extends l.c<R>> mapper) {
            g0.p(mapper, "mapper");
            return this.f89835c.C().c5(-1646329139, "SELECT WordListResourceRecord.bookId, WordListResourceRecord.topicId, WordListResourceRecord.word, WordListResourceRecord.meanCn, WordListResourceRecord.accentUsaAudioUri FROM WordListResourceRecord WHERE bookId = ?", mapper, 1, new x00.l() { // from class: t7.h
                @Override // x00.l
                public final Object invoke(Object obj) {
                    g2 m11;
                    m11 = g.b.m(g.b.this, (l.f) obj);
                    return m11;
                }
            });
        }

        @Override // j.j
        public void j(@m80.k j.a listener) {
            g0.p(listener, "listener");
            this.f89835c.C().Y1(new String[]{"WordListResourceRecord"}, listener);
        }

        @Override // j.j
        public void k(@m80.k j.a listener) {
            g0.p(listener, "listener");
            this.f89835c.C().F6(new String[]{"WordListResourceRecord"}, listener);
        }

        public final long n() {
            return this.f89834b;
        }

        @m80.k
        public String toString() {
            return "Resource.sq:queryByBookId";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.wordlist.ResourceQueries", f = "ResourceQueries.kt", i = {0}, l = {70}, m = "insertOrReplaceRecord", n = {"WordListResourceRecord"}, s = {"L$0"}, v = 1)
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f89836a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f89837b;

        /* renamed from: d, reason: collision with root package name */
        public int f89839d;

        public c(j00.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f89837b = obj;
            this.f89839d |= Integer.MIN_VALUE;
            return g.this.R(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements s<Long, Long, String, String, String, k> {

        /* renamed from: a, reason: collision with root package name */
        public static final d f89840a = new d();

        public d() {
            super(5, k.class, "<init>", "<init>(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", 0);
        }

        public final k a(long j11, long j12, String p22, String p32, String p42) {
            g0.p(p22, "p2");
            g0.p(p32, "p3");
            g0.p(p42, "p4");
            return new k(j11, j12, p22, p32, p42);
        }

        @Override // x00.s
        public /* bridge */ /* synthetic */ k invoke(Long l11, Long l12, String str, String str2, String str3) {
            return a(l11.longValue(), l12.longValue(), str, str2, str3);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class e extends FunctionReferenceImpl implements s<Long, Long, String, String, String, k> {

        /* renamed from: a, reason: collision with root package name */
        public static final e f89841a = new e();

        public e() {
            super(5, k.class, "<init>", "<init>(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", 0);
        }

        public final k a(long j11, long j12, String p22, String p32, String p42) {
            g0.p(p22, "p2");
            g0.p(p32, "p3");
            g0.p(p42, "p4");
            return new k(j11, j12, p22, p32, p42);
        }

        @Override // x00.s
        public /* bridge */ /* synthetic */ k invoke(Long l11, Long l12, String str, String str2, String str3) {
            return a(l11.longValue(), l12.longValue(), str, str2, str3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(@m80.k l.e driver) {
        super(driver);
        g0.p(driver, "driver");
    }

    public static final g2 S(k kVar, l.f execute) {
        g0.p(execute, "$this$execute");
        execute.c(0, Long.valueOf(kVar.i()));
        execute.c(1, Long.valueOf(kVar.k()));
        execute.bindString(2, kVar.l());
        execute.bindString(3, kVar.j());
        execute.bindString(4, kVar.h());
        return g2.f100423a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2 T(x00.l emit) {
        g0.p(emit, "emit");
        emit.invoke("WordListResourceRecord");
        return g2.f100423a;
    }

    public static final Object W(s sVar, l.d cursor) {
        g0.p(cursor, "cursor");
        Long l11 = cursor.getLong(0);
        g0.m(l11);
        Long l12 = cursor.getLong(1);
        g0.m(l12);
        String string = cursor.getString(2);
        g0.m(string);
        String string2 = cursor.getString(3);
        g0.m(string2);
        String string3 = cursor.getString(4);
        g0.m(string3);
        return sVar.invoke(l11, l12, string, string2, string3);
    }

    public static final Object Z(s sVar, l.d cursor) {
        g0.p(cursor, "cursor");
        Long l11 = cursor.getLong(0);
        g0.m(l11);
        Long l12 = cursor.getLong(1);
        g0.m(l12);
        String string = cursor.getString(2);
        g0.m(string);
        String string2 = cursor.getString(3);
        g0.m(string2);
        String string3 = cursor.getString(4);
        g0.m(string3);
        return sVar.invoke(l11, l12, string, string2, string3);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object R(@m80.k final t7.k r9, @m80.k j00.c<? super java.lang.Long> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof t7.g.c
            if (r0 == 0) goto L13
            r0 = r10
            t7.g$c r0 = (t7.g.c) r0
            int r1 = r0.f89839d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f89839d = r1
            goto L18
        L13:
            t7.g$c r0 = new t7.g$c
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f89837b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f89839d
            r3 = 1848534483(0x6e2e65d3, float:1.3493372E28)
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 != r4) goto L30
            java.lang.Object r9 = r0.f89836a
            t7.k r9 = (t7.k) r9
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
            t7.c r5 = new t7.c
            r5.<init>()
            java.lang.String r6 = "INSERT OR REPLACE INTO WordListResourceRecord(bookId, topicId, word, meanCn, accentUsaAudioUri)\nVALUES (?, ?, ?, ?, ?)"
            r7 = 5
            l.c r10 = r10.v3(r2, r6, r7, r5)
            java.lang.Object r9 = l00.k.a(r9)
            r0.f89836a = r9
            r0.f89839d = r4
            java.lang.Object r10 = r10.i(r0)
            if (r10 != r1) goto L5e
            return r1
        L5e:
            java.lang.Number r10 = (java.lang.Number) r10
            long r9 = r10.longValue()
            t7.d r0 = new t7.d
            r0.<init>()
            r8.D(r3, r0)
            java.lang.Long r9 = l00.a.g(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: t7.g.R(t7.k, j00.c):java.lang.Object");
    }

    @m80.k
    public final j.j<k> U(long j11) {
        return V(j11, d.f89840a);
    }

    @m80.k
    public final <T> j.j<T> V(long j11, @m80.k final s<? super Long, ? super Long, ? super String, ? super String, ? super String, ? extends T> mapper) {
        g0.p(mapper, "mapper");
        return new b(this, j11, new x00.l() { // from class: t7.b
            @Override // x00.l
            public final Object invoke(Object obj) {
                Object W;
                W = g.W(s.this, (l.d) obj);
                return W;
            }
        });
    }

    @m80.k
    public final j.j<k> X(long j11, @m80.k Collection<Long> topicId) {
        g0.p(topicId, "topicId");
        return Y(j11, topicId, e.f89841a);
    }

    @m80.k
    public final <T> j.j<T> Y(long j11, @m80.k Collection<Long> topicId, @m80.k final s<? super Long, ? super Long, ? super String, ? super String, ? super String, ? extends T> mapper) {
        g0.p(topicId, "topicId");
        g0.p(mapper, "mapper");
        return new a(this, j11, topicId, new x00.l() { // from class: t7.e
            @Override // x00.l
            public final Object invoke(Object obj) {
                Object Z;
                Z = g.Z(s.this, (l.d) obj);
                return Z;
            }
        });
    }
}

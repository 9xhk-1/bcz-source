package f4;

import f4.e1;
import j.j;
import java.util.Collection;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nGameRoundQueries.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameRoundQueries.kt\ncom/baicizhan/app/biz/game/GameRoundQueries\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,262:1\n1869#2,2:263\n*S KotlinDebug\n*F\n+ 1 GameRoundQueries.kt\ncom/baicizhan/app/biz/game/GameRoundQueries\n*L\n132#1:263,2\n*E\n"})
/* loaded from: classes3.dex */
public final class e1 extends j.p {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class a<T> extends j.j<T> {

        /* renamed from: b, reason: collision with root package name */
        public final long f50527b;

        /* renamed from: c, reason: collision with root package name */
        public final long f50528c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e1 f50529d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e1 e1Var, long j11, @m80.k long j12, x00.l<? super l.d, ? extends T> mapper) {
            super(mapper);
            kotlin.jvm.internal.g0.p(mapper, "mapper");
            this.f50529d = e1Var;
            this.f50527b = j11;
            this.f50528c = j12;
        }

        public static final yz.g2 m(a aVar, l.f executeQuery) {
            kotlin.jvm.internal.g0.p(executeQuery, "$this$executeQuery");
            executeQuery.c(0, Long.valueOf(aVar.f50527b));
            executeQuery.c(1, Long.valueOf(aVar.f50528c));
            return yz.g2.f100423a;
        }

        @Override // j.i
        @m80.k
        public <R> l.c<R> c(@m80.k x00.l<? super l.d, ? extends l.c<R>> mapper) {
            kotlin.jvm.internal.g0.p(mapper, "mapper");
            return this.f50529d.C().c5(1534856250, "SELECT gameRound.roundId, gameRound.bookId, gameRound.words, gameRound.roundCate, gameRound.lifeCount, gameRound.roundType, gameRound.roundTime, gameRound.roundState FROM gameRound WHERE bookId = ? AND roundType = ?", mapper, 2, new x00.l() { // from class: f4.d1
                @Override // x00.l
                public final Object invoke(Object obj) {
                    yz.g2 m11;
                    m11 = e1.a.m(e1.a.this, (l.f) obj);
                    return m11;
                }
            });
        }

        @Override // j.j
        public void j(@m80.k j.a listener) {
            kotlin.jvm.internal.g0.p(listener, "listener");
            this.f50529d.C().Y1(new String[]{"gameRound"}, listener);
        }

        @Override // j.j
        public void k(@m80.k j.a listener) {
            kotlin.jvm.internal.g0.p(listener, "listener");
            this.f50529d.C().F6(new String[]{"gameRound"}, listener);
        }

        public final long n() {
            return this.f50527b;
        }

        public final long o() {
            return this.f50528c;
        }

        @m80.k
        public String toString() {
            return "GameRound.sq:queryGameRoundByBookIdAndRoundType";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class b<T> extends j.j<T> {

        /* renamed from: b, reason: collision with root package name */
        public final long f50530b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e1 f50531c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(e1 e1Var, @m80.k long j11, x00.l<? super l.d, ? extends T> mapper) {
            super(mapper);
            kotlin.jvm.internal.g0.p(mapper, "mapper");
            this.f50531c = e1Var;
            this.f50530b = j11;
        }

        public static final yz.g2 m(b bVar, l.f executeQuery) {
            kotlin.jvm.internal.g0.p(executeQuery, "$this$executeQuery");
            executeQuery.c(0, Long.valueOf(bVar.f50530b));
            return yz.g2.f100423a;
        }

        @Override // j.i
        @m80.k
        public <R> l.c<R> c(@m80.k x00.l<? super l.d, ? extends l.c<R>> mapper) {
            kotlin.jvm.internal.g0.p(mapper, "mapper");
            return this.f50531c.C().c5(1884362697, "SELECT gameRound.roundId, gameRound.bookId, gameRound.words, gameRound.roundCate, gameRound.lifeCount, gameRound.roundType, gameRound.roundTime, gameRound.roundState FROM gameRound WHERE bookId = ?", mapper, 1, new x00.l() { // from class: f4.f1
                @Override // x00.l
                public final Object invoke(Object obj) {
                    yz.g2 m11;
                    m11 = e1.b.m(e1.b.this, (l.f) obj);
                    return m11;
                }
            });
        }

        @Override // j.j
        public void j(@m80.k j.a listener) {
            kotlin.jvm.internal.g0.p(listener, "listener");
            this.f50531c.C().Y1(new String[]{"gameRound"}, listener);
        }

        @Override // j.j
        public void k(@m80.k j.a listener) {
            kotlin.jvm.internal.g0.p(listener, "listener");
            this.f50531c.C().F6(new String[]{"gameRound"}, listener);
        }

        public final long n() {
            return this.f50530b;
        }

        @m80.k
        public String toString() {
            return "GameRound.sq:queryGameRoundByBookId";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class c<T> extends j.j<T> {

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final String f50532b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e1 f50533c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@m80.k e1 e1Var, @m80.k String roundId, x00.l<? super l.d, ? extends T> mapper) {
            super(mapper);
            kotlin.jvm.internal.g0.p(roundId, "roundId");
            kotlin.jvm.internal.g0.p(mapper, "mapper");
            this.f50533c = e1Var;
            this.f50532b = roundId;
        }

        public static final yz.g2 m(c cVar, l.f executeQuery) {
            kotlin.jvm.internal.g0.p(executeQuery, "$this$executeQuery");
            executeQuery.bindString(0, cVar.f50532b);
            return yz.g2.f100423a;
        }

        @Override // j.i
        @m80.k
        public <R> l.c<R> c(@m80.k x00.l<? super l.d, ? extends l.c<R>> mapper) {
            kotlin.jvm.internal.g0.p(mapper, "mapper");
            return this.f50533c.C().c5(-393485820, "SELECT gameRound.roundId, gameRound.bookId, gameRound.words, gameRound.roundCate, gameRound.lifeCount, gameRound.roundType, gameRound.roundTime, gameRound.roundState FROM gameRound WHERE roundId = ?", mapper, 1, new x00.l() { // from class: f4.g1
                @Override // x00.l
                public final Object invoke(Object obj) {
                    yz.g2 m11;
                    m11 = e1.c.m(e1.c.this, (l.f) obj);
                    return m11;
                }
            });
        }

        @Override // j.j
        public void j(@m80.k j.a listener) {
            kotlin.jvm.internal.g0.p(listener, "listener");
            this.f50533c.C().Y1(new String[]{"gameRound"}, listener);
        }

        @Override // j.j
        public void k(@m80.k j.a listener) {
            kotlin.jvm.internal.g0.p(listener, "listener");
            this.f50533c.C().F6(new String[]{"gameRound"}, listener);
        }

        @m80.k
        public final String n() {
            return this.f50532b;
        }

        @m80.k
        public String toString() {
            return "GameRound.sq:queryGameRoundByRoundId";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class d<T> extends j.j<T> {

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final String f50534b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e1 f50535c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(@m80.k e1 e1Var, @m80.k String roundId, x00.l<? super l.d, ? extends T> mapper) {
            super(mapper);
            kotlin.jvm.internal.g0.p(roundId, "roundId");
            kotlin.jvm.internal.g0.p(mapper, "mapper");
            this.f50535c = e1Var;
            this.f50534b = roundId;
        }

        public static final yz.g2 m(d dVar, l.f executeQuery) {
            kotlin.jvm.internal.g0.p(executeQuery, "$this$executeQuery");
            executeQuery.bindString(0, dVar.f50534b);
            return yz.g2.f100423a;
        }

        @Override // j.i
        @m80.k
        public <R> l.c<R> c(@m80.k x00.l<? super l.d, ? extends l.c<R>> mapper) {
            kotlin.jvm.internal.g0.p(mapper, "mapper");
            return this.f50535c.C().c5(576000993, "SELECT roundState FROM gameRound WHERE roundId = ?", mapper, 1, new x00.l() { // from class: f4.h1
                @Override // x00.l
                public final Object invoke(Object obj) {
                    yz.g2 m11;
                    m11 = e1.d.m(e1.d.this, (l.f) obj);
                    return m11;
                }
            });
        }

        @Override // j.j
        public void j(@m80.k j.a listener) {
            kotlin.jvm.internal.g0.p(listener, "listener");
            this.f50535c.C().Y1(new String[]{"gameRound"}, listener);
        }

        @Override // j.j
        public void k(@m80.k j.a listener) {
            kotlin.jvm.internal.g0.p(listener, "listener");
            this.f50535c.C().F6(new String[]{"gameRound"}, listener);
        }

        @m80.k
        public final String n() {
            return this.f50534b;
        }

        @m80.k
        public String toString() {
            return "GameRound.sq:queryRoundStateByRoundId";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.GameRoundQueries", f = "GameRoundQueries.kt", i = {0}, l = {149}, m = "deleteByBookId", n = {"bookId"}, s = {"J$0"}, v = 1)
    public static final class e extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f50536a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f50537b;

        /* renamed from: d, reason: collision with root package name */
        public int f50539d;

        public e(j00.c<? super e> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f50537b = obj;
            this.f50539d |= Integer.MIN_VALUE;
            return e1.this.a0(0L, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.GameRoundQueries", f = "GameRoundQueries.kt", i = {0}, l = {118}, m = "deleteByRoundId", n = {"roundId"}, s = {"L$0"}, v = 1)
    public static final class f extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f50540a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f50541b;

        /* renamed from: d, reason: collision with root package name */
        public int f50543d;

        public f(j00.c<? super f> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f50541b = obj;
            this.f50543d |= Integer.MIN_VALUE;
            return e1.this.d0(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.GameRoundQueries", f = "GameRoundQueries.kt", i = {0, 0}, l = {135}, m = "deleteByRoundTypes", n = {"roundType", "roundTypeIndexes"}, s = {"L$0", "L$1"}, v = 1)
    public static final class g extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f50544a;

        /* renamed from: b, reason: collision with root package name */
        public Object f50545b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f50546c;

        /* renamed from: e, reason: collision with root package name */
        public int f50548e;

        public g(j00.c<? super g> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f50546c = obj;
            this.f50548e |= Integer.MIN_VALUE;
            return e1.this.g0(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.GameRoundQueries", f = "GameRoundQueries.kt", i = {0}, l = {173}, m = "insertOrReplaceIntoGameRound", n = {"gameRound"}, s = {"L$0"}, v = 1)
    public static final class h extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f50549a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f50550b;

        /* renamed from: d, reason: collision with root package name */
        public int f50552d;

        public h(j00.c<? super h> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f50550b = obj;
            this.f50552d |= Integer.MIN_VALUE;
            return e1.this.j0(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class i extends FunctionReferenceImpl implements x00.v<String, Long, String, Long, Long, Long, Long, String, o0> {

        /* renamed from: a, reason: collision with root package name */
        public static final i f50553a = new i();

        public i() {
            super(8, o0.class, "<init>", "<init>(Ljava/lang/String;JLjava/lang/String;JJJJLjava/lang/String;)V", 0);
        }

        public final o0 a(String p02, long j11, String p22, long j12, long j13, long j14, long j15, String p72) {
            kotlin.jvm.internal.g0.p(p02, "p0");
            kotlin.jvm.internal.g0.p(p22, "p2");
            kotlin.jvm.internal.g0.p(p72, "p7");
            return new o0(p02, j11, p22, j12, j13, j14, j15, p72);
        }

        @Override // x00.v
        public /* bridge */ /* synthetic */ o0 invoke(String str, Long l11, String str2, Long l12, Long l13, Long l14, Long l15, String str3) {
            return a(str, l11.longValue(), str2, l12.longValue(), l13.longValue(), l14.longValue(), l15.longValue(), str3);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class j extends FunctionReferenceImpl implements x00.v<String, Long, String, Long, Long, Long, Long, String, o0> {

        /* renamed from: a, reason: collision with root package name */
        public static final j f50554a = new j();

        public j() {
            super(8, o0.class, "<init>", "<init>(Ljava/lang/String;JLjava/lang/String;JJJJLjava/lang/String;)V", 0);
        }

        public final o0 a(String p02, long j11, String p22, long j12, long j13, long j14, long j15, String p72) {
            kotlin.jvm.internal.g0.p(p02, "p0");
            kotlin.jvm.internal.g0.p(p22, "p2");
            kotlin.jvm.internal.g0.p(p72, "p7");
            return new o0(p02, j11, p22, j12, j13, j14, j15, p72);
        }

        @Override // x00.v
        public /* bridge */ /* synthetic */ o0 invoke(String str, Long l11, String str2, Long l12, Long l13, Long l14, Long l15, String str3) {
            return a(str, l11.longValue(), str2, l12.longValue(), l13.longValue(), l14.longValue(), l15.longValue(), str3);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class k extends FunctionReferenceImpl implements x00.v<String, Long, String, Long, Long, Long, Long, String, o0> {

        /* renamed from: a, reason: collision with root package name */
        public static final k f50555a = new k();

        public k() {
            super(8, o0.class, "<init>", "<init>(Ljava/lang/String;JLjava/lang/String;JJJJLjava/lang/String;)V", 0);
        }

        public final o0 a(String p02, long j11, String p22, long j12, long j13, long j14, long j15, String p72) {
            kotlin.jvm.internal.g0.p(p02, "p0");
            kotlin.jvm.internal.g0.p(p22, "p2");
            kotlin.jvm.internal.g0.p(p72, "p7");
            return new o0(p02, j11, p22, j12, j13, j14, j15, p72);
        }

        @Override // x00.v
        public /* bridge */ /* synthetic */ o0 invoke(String str, Long l11, String str2, Long l12, Long l13, Long l14, Long l15, String str3) {
            return a(str, l11.longValue(), str2, l12.longValue(), l13.longValue(), l14.longValue(), l15.longValue(), str3);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.GameRoundQueries", f = "GameRoundQueries.kt", i = {0, 0}, l = {104}, m = "updateGameRound", n = {"roundState", "roundId"}, s = {"L$0", "L$1"}, v = 1)
    public static final class l extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f50556a;

        /* renamed from: b, reason: collision with root package name */
        public Object f50557b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f50558c;

        /* renamed from: e, reason: collision with root package name */
        public int f50560e;

        public l(j00.c<? super l> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f50558c = obj;
            this.f50560e |= Integer.MIN_VALUE;
            return e1.this.x0(null, null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(@m80.k l.e driver) {
        super(driver);
        kotlin.jvm.internal.g0.p(driver, "driver");
    }

    public static final yz.g2 b0(long j11, l.f execute) {
        kotlin.jvm.internal.g0.p(execute, "$this$execute");
        execute.c(0, Long.valueOf(j11));
        return yz.g2.f100423a;
    }

    public static final yz.g2 c0(x00.l emit) {
        kotlin.jvm.internal.g0.p(emit, "emit");
        emit.invoke("gameRound");
        return yz.g2.f100423a;
    }

    public static final yz.g2 e0(String str, l.f execute) {
        kotlin.jvm.internal.g0.p(execute, "$this$execute");
        execute.bindString(0, str);
        return yz.g2.f100423a;
    }

    public static final yz.g2 f0(x00.l emit) {
        kotlin.jvm.internal.g0.p(emit, "emit");
        emit.invoke("gameRound");
        return yz.g2.f100423a;
    }

    public static final yz.g2 h0(Collection collection, l.f execute) {
        kotlin.jvm.internal.g0.p(execute, "$this$execute");
        Iterator it = collection.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            execute.c(i11, Long.valueOf(((Number) it.next()).longValue()));
            i11++;
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 i0(x00.l emit) {
        kotlin.jvm.internal.g0.p(emit, "emit");
        emit.invoke("gameRound");
        return yz.g2.f100423a;
    }

    public static final yz.g2 k0(o0 o0Var, l.f execute) {
        kotlin.jvm.internal.g0.p(execute, "$this$execute");
        execute.bindString(0, o0Var.n());
        execute.c(1, Long.valueOf(o0Var.k()));
        execute.bindString(2, o0Var.r());
        execute.c(3, Long.valueOf(o0Var.m()));
        execute.c(4, Long.valueOf(o0Var.l()));
        execute.c(5, Long.valueOf(o0Var.q()));
        execute.c(6, Long.valueOf(o0Var.p()));
        execute.bindString(7, o0Var.o());
        return yz.g2.f100423a;
    }

    public static final yz.g2 l0(x00.l emit) {
        kotlin.jvm.internal.g0.p(emit, "emit");
        emit.invoke("gameRound");
        return yz.g2.f100423a;
    }

    public static final Object o0(x00.v vVar, l.d cursor) {
        kotlin.jvm.internal.g0.p(cursor, "cursor");
        String string = cursor.getString(0);
        kotlin.jvm.internal.g0.m(string);
        Long l11 = cursor.getLong(1);
        kotlin.jvm.internal.g0.m(l11);
        String string2 = cursor.getString(2);
        kotlin.jvm.internal.g0.m(string2);
        Long l12 = cursor.getLong(3);
        kotlin.jvm.internal.g0.m(l12);
        Long l13 = cursor.getLong(4);
        kotlin.jvm.internal.g0.m(l13);
        Long l14 = cursor.getLong(5);
        kotlin.jvm.internal.g0.m(l14);
        Long l15 = cursor.getLong(6);
        kotlin.jvm.internal.g0.m(l15);
        String string3 = cursor.getString(7);
        kotlin.jvm.internal.g0.m(string3);
        return vVar.invoke(string, l11, string2, l12, l13, l14, l15, string3);
    }

    public static final Object r0(x00.v vVar, l.d cursor) {
        kotlin.jvm.internal.g0.p(cursor, "cursor");
        String string = cursor.getString(0);
        kotlin.jvm.internal.g0.m(string);
        Long l11 = cursor.getLong(1);
        kotlin.jvm.internal.g0.m(l11);
        String string2 = cursor.getString(2);
        kotlin.jvm.internal.g0.m(string2);
        Long l12 = cursor.getLong(3);
        kotlin.jvm.internal.g0.m(l12);
        Long l13 = cursor.getLong(4);
        kotlin.jvm.internal.g0.m(l13);
        Long l14 = cursor.getLong(5);
        kotlin.jvm.internal.g0.m(l14);
        Long l15 = cursor.getLong(6);
        kotlin.jvm.internal.g0.m(l15);
        String string3 = cursor.getString(7);
        kotlin.jvm.internal.g0.m(string3);
        return vVar.invoke(string, l11, string2, l12, l13, l14, l15, string3);
    }

    public static final Object u0(x00.v vVar, l.d cursor) {
        kotlin.jvm.internal.g0.p(cursor, "cursor");
        String string = cursor.getString(0);
        kotlin.jvm.internal.g0.m(string);
        Long l11 = cursor.getLong(1);
        kotlin.jvm.internal.g0.m(l11);
        String string2 = cursor.getString(2);
        kotlin.jvm.internal.g0.m(string2);
        Long l12 = cursor.getLong(3);
        kotlin.jvm.internal.g0.m(l12);
        Long l13 = cursor.getLong(4);
        kotlin.jvm.internal.g0.m(l13);
        Long l14 = cursor.getLong(5);
        kotlin.jvm.internal.g0.m(l14);
        Long l15 = cursor.getLong(6);
        kotlin.jvm.internal.g0.m(l15);
        String string3 = cursor.getString(7);
        kotlin.jvm.internal.g0.m(string3);
        return vVar.invoke(string, l11, string2, l12, l13, l14, l15, string3);
    }

    public static final String w0(l.d cursor) {
        kotlin.jvm.internal.g0.p(cursor, "cursor");
        String string = cursor.getString(0);
        kotlin.jvm.internal.g0.m(string);
        return string;
    }

    public static final yz.g2 y0(String str, String str2, l.f execute) {
        kotlin.jvm.internal.g0.p(execute, "$this$execute");
        execute.bindString(0, str);
        execute.bindString(1, str2);
        return yz.g2.f100423a;
    }

    public static final yz.g2 z0(x00.l emit) {
        kotlin.jvm.internal.g0.p(emit, "emit");
        emit.invoke("gameRound");
        return yz.g2.f100423a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a0(final long r8, @m80.k j00.c<? super java.lang.Long> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof f4.e1.e
            if (r0 == 0) goto L13
            r0 = r10
            f4.e1$e r0 = (f4.e1.e) r0
            int r1 = r0.f50539d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f50539d = r1
            goto L18
        L13:
            f4.e1$e r0 = new f4.e1$e
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f50537b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f50539d
            r3 = 1420405664(0x54a9aba0, float:5.8298309E12)
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
            f4.s0 r5 = new f4.s0
            r5.<init>()
            java.lang.String r6 = "DELETE FROM gameRound WHERE bookId = ?"
            l.c r10 = r10.v3(r2, r6, r4, r5)
            r0.f50536a = r8
            r0.f50539d = r4
            java.lang.Object r10 = r10.i(r0)
            if (r10 != r1) goto L55
            return r1
        L55:
            java.lang.Number r10 = (java.lang.Number) r10
            long r8 = r10.longValue()
            f4.t0 r10 = new f4.t0
            r10.<init>()
            r7.D(r3, r10)
            java.lang.Long r8 = l00.a.g(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: f4.e1.a0(long, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d0(@m80.k final java.lang.String r8, @m80.k j00.c<? super java.lang.Long> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof f4.e1.f
            if (r0 == 0) goto L13
            r0 = r9
            f4.e1$f r0 = (f4.e1.f) r0
            int r1 = r0.f50543d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f50543d = r1
            goto L18
        L13:
            f4.e1$f r0 = new f4.e1$f
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f50541b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f50543d
            r3 = -1891251955(0xffffffff8f45c90d, float:-9.751571E-30)
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 != r4) goto L30
            java.lang.Object r8 = r0.f50540a
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
            f4.p0 r5 = new f4.p0
            r5.<init>()
            java.lang.String r6 = "DELETE FROM gameRound WHERE roundId = ?"
            l.c r9 = r9.v3(r2, r6, r4, r5)
            java.lang.Object r8 = l00.k.a(r8)
            r0.f50540a = r8
            r0.f50543d = r4
            java.lang.Object r9 = r9.i(r0)
            if (r9 != r1) goto L5d
            return r1
        L5d:
            java.lang.Number r9 = (java.lang.Number) r9
            long r8 = r9.longValue()
            f4.u0 r0 = new f4.u0
            r0.<init>()
            r7.D(r3, r0)
            java.lang.Long r8 = l00.a.g(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: f4.e1.d0(java.lang.String, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g0(@m80.k final java.util.Collection<java.lang.Long> r9, @m80.k j00.c<? super java.lang.Long> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof f4.e1.g
            if (r0 == 0) goto L13
            r0 = r10
            f4.e1$g r0 = (f4.e1.g) r0
            int r1 = r0.f50548e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f50548e = r1
            goto L18
        L13:
            f4.e1$g r0 = new f4.e1$g
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f50546c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f50548e
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r9 = r0.f50545b
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r9 = r0.f50544a
            java.util.Collection r9 = (java.util.Collection) r9
            kotlin.e.n(r10)
            goto L7c
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L39:
            kotlin.e.n(r10)
            int r10 = r9.size()
            java.lang.String r10 = r8.B(r10)
            l.e r2 = r8.C()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "DELETE FROM gameRound WHERE roundType IN "
            r4.append(r5)
            r4.append(r10)
            java.lang.String r4 = r4.toString()
            int r5 = r9.size()
            f4.b1 r6 = new f4.b1
            r6.<init>()
            r7 = 0
            l.c r2 = r2.v3(r7, r4, r5, r6)
            java.lang.Object r9 = l00.k.a(r9)
            r0.f50544a = r9
            java.lang.Object r9 = l00.k.a(r10)
            r0.f50545b = r9
            r0.f50548e = r3
            java.lang.Object r10 = r2.i(r0)
            if (r10 != r1) goto L7c
            return r1
        L7c:
            java.lang.Number r10 = (java.lang.Number) r10
            long r9 = r10.longValue()
            f4.c1 r0 = new f4.c1
            r0.<init>()
            r1 = -895107257(0xffffffffcaa5bf47, float:-5431203.5)
            r8.D(r1, r0)
            java.lang.Long r9 = l00.a.g(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: f4.e1.g0(java.util.Collection, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j0(@m80.k final f4.o0 r9, @m80.k j00.c<? super java.lang.Long> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof f4.e1.h
            if (r0 == 0) goto L13
            r0 = r10
            f4.e1$h r0 = (f4.e1.h) r0
            int r1 = r0.f50552d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f50552d = r1
            goto L18
        L13:
            f4.e1$h r0 = new f4.e1$h
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f50550b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f50552d
            r3 = -1426527554(0xffffffffaaf8eabe, float:-4.4216535E-13)
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 != r4) goto L30
            java.lang.Object r9 = r0.f50549a
            f4.o0 r9 = (f4.o0) r9
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
            f4.q0 r5 = new f4.q0
            r5.<init>()
            java.lang.String r6 = "INSERT OR REPLACE INTO gameRound (roundId, bookId, words, roundCate, lifeCount, roundType, roundTime, roundState)\nVALUES (?, ?, ?, ?, ?, ?, ?, ?)"
            r7 = 8
            l.c r10 = r10.v3(r2, r6, r7, r5)
            java.lang.Object r9 = l00.k.a(r9)
            r0.f50549a = r9
            r0.f50552d = r4
            java.lang.Object r10 = r10.i(r0)
            if (r10 != r1) goto L5f
            return r1
        L5f:
            java.lang.Number r10 = (java.lang.Number) r10
            long r9 = r10.longValue()
            f4.r0 r0 = new f4.r0
            r0.<init>()
            r8.D(r3, r0)
            java.lang.Long r9 = l00.a.g(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: f4.e1.j0(f4.o0, j00.c):java.lang.Object");
    }

    @m80.k
    public final j.j<o0> m0(long j11) {
        return n0(j11, i.f50553a);
    }

    @m80.k
    public final <T> j.j<T> n0(long j11, @m80.k final x00.v<? super String, ? super Long, ? super String, ? super Long, ? super Long, ? super Long, ? super Long, ? super String, ? extends T> mapper) {
        kotlin.jvm.internal.g0.p(mapper, "mapper");
        return new b(this, j11, new x00.l() { // from class: f4.z0
            @Override // x00.l
            public final Object invoke(Object obj) {
                Object o02;
                o02 = e1.o0(x00.v.this, (l.d) obj);
                return o02;
            }
        });
    }

    @m80.k
    public final j.j<o0> p0(long j11, long j12) {
        return q0(j11, j12, j.f50554a);
    }

    @m80.k
    public final <T> j.j<T> q0(long j11, long j12, @m80.k final x00.v<? super String, ? super Long, ? super String, ? super Long, ? super Long, ? super Long, ? super Long, ? super String, ? extends T> mapper) {
        kotlin.jvm.internal.g0.p(mapper, "mapper");
        return new a(this, j11, j12, new x00.l() { // from class: f4.x0
            @Override // x00.l
            public final Object invoke(Object obj) {
                Object r02;
                r02 = e1.r0(x00.v.this, (l.d) obj);
                return r02;
            }
        });
    }

    @m80.k
    public final j.j<o0> s0(@m80.k String roundId) {
        kotlin.jvm.internal.g0.p(roundId, "roundId");
        return t0(roundId, k.f50555a);
    }

    @m80.k
    public final <T> j.j<T> t0(@m80.k String roundId, @m80.k final x00.v<? super String, ? super Long, ? super String, ? super Long, ? super Long, ? super Long, ? super Long, ? super String, ? extends T> mapper) {
        kotlin.jvm.internal.g0.p(roundId, "roundId");
        kotlin.jvm.internal.g0.p(mapper, "mapper");
        return new c(this, roundId, new x00.l() { // from class: f4.y0
            @Override // x00.l
            public final Object invoke(Object obj) {
                Object u02;
                u02 = e1.u0(x00.v.this, (l.d) obj);
                return u02;
            }
        });
    }

    @m80.k
    public final j.j<String> v0(@m80.k String roundId) {
        kotlin.jvm.internal.g0.p(roundId, "roundId");
        return new d(this, roundId, new x00.l() { // from class: f4.a1
            @Override // x00.l
            public final Object invoke(Object obj) {
                String w02;
                w02 = e1.w0((l.d) obj);
                return w02;
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object x0(@m80.k final java.lang.String r9, @m80.k final java.lang.String r10, @m80.k j00.c<? super java.lang.Long> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof f4.e1.l
            if (r0 == 0) goto L13
            r0 = r11
            f4.e1$l r0 = (f4.e1.l) r0
            int r1 = r0.f50560e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f50560e = r1
            goto L18
        L13:
            f4.e1$l r0 = new f4.e1$l
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f50558c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f50560e
            r3 = 1376123257(0x5205f979, float:1.43854027E11)
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 != r4) goto L34
            java.lang.Object r9 = r0.f50557b
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r9 = r0.f50556a
            java.lang.String r9 = (java.lang.String) r9
            kotlin.e.n(r11)
            goto L68
        L34:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3c:
            kotlin.e.n(r11)
            l.e r11 = r8.C()
            java.lang.Integer r2 = l00.a.f(r3)
            f4.v0 r5 = new f4.v0
            r5.<init>()
            java.lang.String r6 = "UPDATE gameRound SET roundState = ? WHERE roundId = ?"
            r7 = 2
            l.c r11 = r11.v3(r2, r6, r7, r5)
            java.lang.Object r9 = l00.k.a(r9)
            r0.f50556a = r9
            java.lang.Object r9 = l00.k.a(r10)
            r0.f50557b = r9
            r0.f50560e = r4
            java.lang.Object r11 = r11.i(r0)
            if (r11 != r1) goto L68
            return r1
        L68:
            java.lang.Number r11 = (java.lang.Number) r11
            long r9 = r11.longValue()
            f4.w0 r11 = new f4.w0
            r11.<init>()
            r8.D(r3, r11)
            java.lang.Long r9 = l00.a.g(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: f4.e1.x0(java.lang.String, java.lang.String, j00.c):java.lang.Object");
    }
}

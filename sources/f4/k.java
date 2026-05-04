package f4;

import com.baicizhan.client.business.dataset.provider.a;
import f4.k;
import j.j;
import java.util.Collection;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class k extends j.p {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class a<T> extends j.j<T> {

        /* renamed from: b, reason: collision with root package name */
        public final long f50673b;

        /* renamed from: c, reason: collision with root package name */
        public final long f50674c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ k f50675d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(k kVar, long j11, @m80.k long j12, x00.l<? super l.d, ? extends T> mapper) {
            super(mapper);
            kotlin.jvm.internal.g0.p(mapper, "mapper");
            this.f50675d = kVar;
            this.f50673b = j11;
            this.f50674c = j12;
        }

        public static final yz.g2 m(a aVar, l.f executeQuery) {
            kotlin.jvm.internal.g0.p(executeQuery, "$this$executeQuery");
            executeQuery.c(0, Long.valueOf(aVar.f50673b));
            executeQuery.c(1, Long.valueOf(aVar.f50674c));
            return yz.g2.f100423a;
        }

        @Override // j.i
        @m80.k
        public <R> l.c<R> c(@m80.k x00.l<? super l.d, ? extends l.c<R>> mapper) {
            kotlin.jvm.internal.g0.p(mapper, "mapper");
            return this.f50675d.C().c5(-1648209605, "SELECT abilityScore.id, abilityScore.bookId, abilityScore.topicId, abilityScore.score, abilityScore.evef, abilityScore.evefTime, abilityScore.evcf, abilityScore.evcfTime, abilityScore.efcf, abilityScore.efcfTime, abilityScore.efu, abilityScore.efuTime, abilityScore.efs, abilityScore.efsTime, abilityScore.cfs, abilityScore.cfsTime, abilityScore.cfa, abilityScore.cfaTime, abilityScore.efpcf, abilityScore.efpcfTime, abilityScore.efd, abilityScore.efdTime, abilityScore.efau, abilityScore.efauTime, abilityScore.updateTime FROM abilityScore WHERE bookId = ? AND topicId = ?", mapper, 2, new x00.l() { // from class: f4.j
                @Override // x00.l
                public final Object invoke(Object obj) {
                    yz.g2 m11;
                    m11 = k.a.m(k.a.this, (l.f) obj);
                    return m11;
                }
            });
        }

        @Override // j.j
        public void j(@m80.k j.a listener) {
            kotlin.jvm.internal.g0.p(listener, "listener");
            this.f50675d.C().Y1(new String[]{"abilityScore"}, listener);
        }

        @Override // j.j
        public void k(@m80.k j.a listener) {
            kotlin.jvm.internal.g0.p(listener, "listener");
            this.f50675d.C().F6(new String[]{"abilityScore"}, listener);
        }

        public final long n() {
            return this.f50673b;
        }

        public final long o() {
            return this.f50674c;
        }

        @m80.k
        public String toString() {
            return "AbilityScore.sq:queryAbiilityScoreByBookIdAndTopicId";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nAbilityScoreQueries.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbilityScoreQueries.kt\ncom/baicizhan/app/biz/game/AbilityScoreQueries$QueryAbilityScoresByBookIdAndTopicIdsQuery\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,502:1\n1869#2,2:503\n*S KotlinDebug\n*F\n+ 1 AbilityScoreQueries.kt\ncom/baicizhan/app/biz/game/AbilityScoreQueries$QueryAbilityScoresByBookIdAndTopicIdsQuery\n*L\n446#1:503,2\n*E\n"})
    public final class b<T> extends j.j<T> {

        /* renamed from: b, reason: collision with root package name */
        public final long f50676b;

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public final Collection<Long> f50677c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ k f50678d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(k kVar, @m80.k long j11, @m80.k Collection<Long> topicId, x00.l<? super l.d, ? extends T> mapper) {
            super(mapper);
            kotlin.jvm.internal.g0.p(topicId, "topicId");
            kotlin.jvm.internal.g0.p(mapper, "mapper");
            this.f50678d = kVar;
            this.f50676b = j11;
            this.f50677c = topicId;
        }

        public static final yz.g2 m(b bVar, l.f executeQuery) {
            kotlin.jvm.internal.g0.p(executeQuery, "$this$executeQuery");
            executeQuery.c(0, Long.valueOf(bVar.f50676b));
            Iterator<T> it = bVar.f50677c.iterator();
            int i11 = 1;
            while (it.hasNext()) {
                executeQuery.c(i11, Long.valueOf(((Number) it.next()).longValue()));
                i11++;
            }
            return yz.g2.f100423a;
        }

        @Override // j.i
        @m80.k
        public <R> l.c<R> c(@m80.k x00.l<? super l.d, ? extends l.c<R>> mapper) {
            kotlin.jvm.internal.g0.p(mapper, "mapper");
            String B = this.f50678d.B(this.f50677c.size());
            return this.f50678d.C().c5(null, "SELECT abilityScore.id, abilityScore.bookId, abilityScore.topicId, abilityScore.score, abilityScore.evef, abilityScore.evefTime, abilityScore.evcf, abilityScore.evcfTime, abilityScore.efcf, abilityScore.efcfTime, abilityScore.efu, abilityScore.efuTime, abilityScore.efs, abilityScore.efsTime, abilityScore.cfs, abilityScore.cfsTime, abilityScore.cfa, abilityScore.cfaTime, abilityScore.efpcf, abilityScore.efpcfTime, abilityScore.efd, abilityScore.efdTime, abilityScore.efau, abilityScore.efauTime, abilityScore.updateTime FROM abilityScore WHERE bookId = ? AND topicId IN " + B, mapper, this.f50677c.size() + 1, new x00.l() { // from class: f4.l
                @Override // x00.l
                public final Object invoke(Object obj) {
                    yz.g2 m11;
                    m11 = k.b.m(k.b.this, (l.f) obj);
                    return m11;
                }
            });
        }

        @Override // j.j
        public void j(@m80.k j.a listener) {
            kotlin.jvm.internal.g0.p(listener, "listener");
            this.f50678d.C().Y1(new String[]{"abilityScore"}, listener);
        }

        @Override // j.j
        public void k(@m80.k j.a listener) {
            kotlin.jvm.internal.g0.p(listener, "listener");
            this.f50678d.C().F6(new String[]{"abilityScore"}, listener);
        }

        public final long n() {
            return this.f50676b;
        }

        @m80.k
        public final Collection<Long> o() {
            return this.f50677c;
        }

        @m80.k
        public String toString() {
            return "AbilityScore.sq:queryAbilityScoresByBookIdAndTopicIds";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class c<T> extends j.j<T> {

        /* renamed from: b, reason: collision with root package name */
        public final long f50679b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ k f50680c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(k kVar, @m80.k long j11, x00.l<? super l.d, ? extends T> mapper) {
            super(mapper);
            kotlin.jvm.internal.g0.p(mapper, "mapper");
            this.f50680c = kVar;
            this.f50679b = j11;
        }

        public static final yz.g2 m(c cVar, l.f executeQuery) {
            kotlin.jvm.internal.g0.p(executeQuery, "$this$executeQuery");
            executeQuery.c(0, Long.valueOf(cVar.f50679b));
            return yz.g2.f100423a;
        }

        @Override // j.i
        @m80.k
        public <R> l.c<R> c(@m80.k x00.l<? super l.d, ? extends l.c<R>> mapper) {
            kotlin.jvm.internal.g0.p(mapper, "mapper");
            return this.f50680c.C().c5(-969262243, "SELECT abilityScore.id, abilityScore.bookId, abilityScore.topicId, abilityScore.score, abilityScore.evef, abilityScore.evefTime, abilityScore.evcf, abilityScore.evcfTime, abilityScore.efcf, abilityScore.efcfTime, abilityScore.efu, abilityScore.efuTime, abilityScore.efs, abilityScore.efsTime, abilityScore.cfs, abilityScore.cfsTime, abilityScore.cfa, abilityScore.cfaTime, abilityScore.efpcf, abilityScore.efpcfTime, abilityScore.efd, abilityScore.efdTime, abilityScore.efau, abilityScore.efauTime, abilityScore.updateTime FROM abilityScore WHERE bookId = ?", mapper, 1, new x00.l() { // from class: f4.m
                @Override // x00.l
                public final Object invoke(Object obj) {
                    yz.g2 m11;
                    m11 = k.c.m(k.c.this, (l.f) obj);
                    return m11;
                }
            });
        }

        @Override // j.j
        public void j(@m80.k j.a listener) {
            kotlin.jvm.internal.g0.p(listener, "listener");
            this.f50680c.C().Y1(new String[]{"abilityScore"}, listener);
        }

        @Override // j.j
        public void k(@m80.k j.a listener) {
            kotlin.jvm.internal.g0.p(listener, "listener");
            this.f50680c.C().F6(new String[]{"abilityScore"}, listener);
        }

        public final long n() {
            return this.f50679b;
        }

        @m80.k
        public String toString() {
            return "AbilityScore.sq:queryByBookId";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nAbilityScoreQueries.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbilityScoreQueries.kt\ncom/baicizhan/app/biz/game/AbilityScoreQueries$QueryByIdsQuery\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,502:1\n1869#2,2:503\n*S KotlinDebug\n*F\n+ 1 AbilityScoreQueries.kt\ncom/baicizhan/app/biz/game/AbilityScoreQueries$QueryByIdsQuery\n*L\n493#1:503,2\n*E\n"})
    public final class d<T> extends j.j<T> {

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final Collection<Long> f50681b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ k f50682c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(@m80.k k kVar, @m80.k Collection<Long> id2, x00.l<? super l.d, ? extends T> mapper) {
            super(mapper);
            kotlin.jvm.internal.g0.p(id2, "id");
            kotlin.jvm.internal.g0.p(mapper, "mapper");
            this.f50682c = kVar;
            this.f50681b = id2;
        }

        public static final yz.g2 m(d dVar, l.f executeQuery) {
            kotlin.jvm.internal.g0.p(executeQuery, "$this$executeQuery");
            Iterator<T> it = dVar.f50681b.iterator();
            int i11 = 0;
            while (it.hasNext()) {
                executeQuery.c(i11, Long.valueOf(((Number) it.next()).longValue()));
                i11++;
            }
            return yz.g2.f100423a;
        }

        @Override // j.i
        @m80.k
        public <R> l.c<R> c(@m80.k x00.l<? super l.d, ? extends l.c<R>> mapper) {
            kotlin.jvm.internal.g0.p(mapper, "mapper");
            String B = this.f50682c.B(this.f50681b.size());
            return this.f50682c.C().c5(null, "SELECT abilityScore.id, abilityScore.bookId, abilityScore.topicId, abilityScore.score, abilityScore.evef, abilityScore.evefTime, abilityScore.evcf, abilityScore.evcfTime, abilityScore.efcf, abilityScore.efcfTime, abilityScore.efu, abilityScore.efuTime, abilityScore.efs, abilityScore.efsTime, abilityScore.cfs, abilityScore.cfsTime, abilityScore.cfa, abilityScore.cfaTime, abilityScore.efpcf, abilityScore.efpcfTime, abilityScore.efd, abilityScore.efdTime, abilityScore.efau, abilityScore.efauTime, abilityScore.updateTime FROM abilityScore WHERE id IN " + B, mapper, this.f50681b.size(), new x00.l() { // from class: f4.n
                @Override // x00.l
                public final Object invoke(Object obj) {
                    yz.g2 m11;
                    m11 = k.d.m(k.d.this, (l.f) obj);
                    return m11;
                }
            });
        }

        @Override // j.j
        public void j(@m80.k j.a listener) {
            kotlin.jvm.internal.g0.p(listener, "listener");
            this.f50682c.C().Y1(new String[]{"abilityScore"}, listener);
        }

        @Override // j.j
        public void k(@m80.k j.a listener) {
            kotlin.jvm.internal.g0.p(listener, "listener");
            this.f50682c.C().F6(new String[]{"abilityScore"}, listener);
        }

        @m80.k
        public final Collection<Long> n() {
            return this.f50681b;
        }

        @m80.k
        public String toString() {
            return "AbilityScore.sq:queryByIds";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.AbilityScoreQueries", f = "AbilityScoreQueries.kt", i = {0}, l = {314}, m = "insertOrIgnoreAbilityScore", n = {"abilityScore"}, s = {"L$0"}, v = 1)
    public static final class e extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f50683a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f50684b;

        /* renamed from: d, reason: collision with root package name */
        public int f50686d;

        public e(j00.c<? super e> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f50684b = obj;
            this.f50686d |= Integer.MIN_VALUE;
            return k.this.V(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class f extends FunctionReferenceImpl implements x00.x<f4.a> {

        /* renamed from: a, reason: collision with root package name */
        public static final f f50687a = new f();

        public f() {
            super(25, f4.a.class, "<init>", "<init>(JJJDDJDJDJDJDJDJDJDJDJDJJ)V", 0);
        }

        public final f4.a a(long j11, long j12, long j13, double d11, double d12, long j14, double d13, long j15, double d14, long j16, double d15, long j17, double d16, long j18, double d17, long j19, double d18, long j21, double d19, long j22, double d21, long j23, double d22, long j24, long j25) {
            return new f4.a(j11, j12, j13, d11, d12, j14, d13, j15, d14, j16, d15, j17, d16, j18, d17, j19, d18, j21, d19, j22, d21, j23, d22, j24, j25);
        }

        @Override // x00.x
        public final /* bridge */ /* synthetic */ f4.a invoke(Object[] objArr) {
            if (objArr.length == 25) {
                return a(((Number) objArr[0]).longValue(), ((Number) objArr[1]).longValue(), ((Number) objArr[2]).longValue(), ((Number) objArr[3]).doubleValue(), ((Number) objArr[4]).doubleValue(), ((Number) objArr[5]).longValue(), ((Number) objArr[6]).doubleValue(), ((Number) objArr[7]).longValue(), ((Number) objArr[8]).doubleValue(), ((Number) objArr[9]).longValue(), ((Number) objArr[10]).doubleValue(), ((Number) objArr[11]).longValue(), ((Number) objArr[12]).doubleValue(), ((Number) objArr[13]).longValue(), ((Number) objArr[14]).doubleValue(), ((Number) objArr[15]).longValue(), ((Number) objArr[16]).doubleValue(), ((Number) objArr[17]).longValue(), ((Number) objArr[18]).doubleValue(), ((Number) objArr[19]).longValue(), ((Number) objArr[20]).doubleValue(), ((Number) objArr[21]).longValue(), ((Number) objArr[22]).doubleValue(), ((Number) objArr[23]).longValue(), ((Number) objArr[24]).longValue());
            }
            throw new IllegalArgumentException("Expected 25 arguments");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class g extends FunctionReferenceImpl implements x00.x<f4.a> {

        /* renamed from: a, reason: collision with root package name */
        public static final g f50688a = new g();

        public g() {
            super(25, f4.a.class, "<init>", "<init>(JJJDDJDJDJDJDJDJDJDJDJDJJ)V", 0);
        }

        public final f4.a a(long j11, long j12, long j13, double d11, double d12, long j14, double d13, long j15, double d14, long j16, double d15, long j17, double d16, long j18, double d17, long j19, double d18, long j21, double d19, long j22, double d21, long j23, double d22, long j24, long j25) {
            return new f4.a(j11, j12, j13, d11, d12, j14, d13, j15, d14, j16, d15, j17, d16, j18, d17, j19, d18, j21, d19, j22, d21, j23, d22, j24, j25);
        }

        @Override // x00.x
        public final /* bridge */ /* synthetic */ f4.a invoke(Object[] objArr) {
            if (objArr.length == 25) {
                return a(((Number) objArr[0]).longValue(), ((Number) objArr[1]).longValue(), ((Number) objArr[2]).longValue(), ((Number) objArr[3]).doubleValue(), ((Number) objArr[4]).doubleValue(), ((Number) objArr[5]).longValue(), ((Number) objArr[6]).doubleValue(), ((Number) objArr[7]).longValue(), ((Number) objArr[8]).doubleValue(), ((Number) objArr[9]).longValue(), ((Number) objArr[10]).doubleValue(), ((Number) objArr[11]).longValue(), ((Number) objArr[12]).doubleValue(), ((Number) objArr[13]).longValue(), ((Number) objArr[14]).doubleValue(), ((Number) objArr[15]).longValue(), ((Number) objArr[16]).doubleValue(), ((Number) objArr[17]).longValue(), ((Number) objArr[18]).doubleValue(), ((Number) objArr[19]).longValue(), ((Number) objArr[20]).doubleValue(), ((Number) objArr[21]).longValue(), ((Number) objArr[22]).doubleValue(), ((Number) objArr[23]).longValue(), ((Number) objArr[24]).longValue());
            }
            throw new IllegalArgumentException("Expected 25 arguments");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class h extends FunctionReferenceImpl implements x00.x<f4.a> {

        /* renamed from: a, reason: collision with root package name */
        public static final h f50689a = new h();

        public h() {
            super(25, f4.a.class, "<init>", "<init>(JJJDDJDJDJDJDJDJDJDJDJDJJ)V", 0);
        }

        public final f4.a a(long j11, long j12, long j13, double d11, double d12, long j14, double d13, long j15, double d14, long j16, double d15, long j17, double d16, long j18, double d17, long j19, double d18, long j21, double d19, long j22, double d21, long j23, double d22, long j24, long j25) {
            return new f4.a(j11, j12, j13, d11, d12, j14, d13, j15, d14, j16, d15, j17, d16, j18, d17, j19, d18, j21, d19, j22, d21, j23, d22, j24, j25);
        }

        @Override // x00.x
        public final /* bridge */ /* synthetic */ f4.a invoke(Object[] objArr) {
            if (objArr.length == 25) {
                return a(((Number) objArr[0]).longValue(), ((Number) objArr[1]).longValue(), ((Number) objArr[2]).longValue(), ((Number) objArr[3]).doubleValue(), ((Number) objArr[4]).doubleValue(), ((Number) objArr[5]).longValue(), ((Number) objArr[6]).doubleValue(), ((Number) objArr[7]).longValue(), ((Number) objArr[8]).doubleValue(), ((Number) objArr[9]).longValue(), ((Number) objArr[10]).doubleValue(), ((Number) objArr[11]).longValue(), ((Number) objArr[12]).doubleValue(), ((Number) objArr[13]).longValue(), ((Number) objArr[14]).doubleValue(), ((Number) objArr[15]).longValue(), ((Number) objArr[16]).doubleValue(), ((Number) objArr[17]).longValue(), ((Number) objArr[18]).doubleValue(), ((Number) objArr[19]).longValue(), ((Number) objArr[20]).doubleValue(), ((Number) objArr[21]).longValue(), ((Number) objArr[22]).doubleValue(), ((Number) objArr[23]).longValue(), ((Number) objArr[24]).longValue());
            }
            throw new IllegalArgumentException("Expected 25 arguments");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class i extends FunctionReferenceImpl implements x00.x<f4.a> {

        /* renamed from: a, reason: collision with root package name */
        public static final i f50690a = new i();

        public i() {
            super(25, f4.a.class, "<init>", "<init>(JJJDDJDJDJDJDJDJDJDJDJDJJ)V", 0);
        }

        public final f4.a a(long j11, long j12, long j13, double d11, double d12, long j14, double d13, long j15, double d14, long j16, double d15, long j17, double d16, long j18, double d17, long j19, double d18, long j21, double d19, long j22, double d21, long j23, double d22, long j24, long j25) {
            return new f4.a(j11, j12, j13, d11, d12, j14, d13, j15, d14, j16, d15, j17, d16, j18, d17, j19, d18, j21, d19, j22, d21, j23, d22, j24, j25);
        }

        @Override // x00.x
        public final /* bridge */ /* synthetic */ f4.a invoke(Object[] objArr) {
            if (objArr.length == 25) {
                return a(((Number) objArr[0]).longValue(), ((Number) objArr[1]).longValue(), ((Number) objArr[2]).longValue(), ((Number) objArr[3]).doubleValue(), ((Number) objArr[4]).doubleValue(), ((Number) objArr[5]).longValue(), ((Number) objArr[6]).doubleValue(), ((Number) objArr[7]).longValue(), ((Number) objArr[8]).doubleValue(), ((Number) objArr[9]).longValue(), ((Number) objArr[10]).doubleValue(), ((Number) objArr[11]).longValue(), ((Number) objArr[12]).doubleValue(), ((Number) objArr[13]).longValue(), ((Number) objArr[14]).doubleValue(), ((Number) objArr[15]).longValue(), ((Number) objArr[16]).doubleValue(), ((Number) objArr[17]).longValue(), ((Number) objArr[18]).doubleValue(), ((Number) objArr[19]).longValue(), ((Number) objArr[20]).doubleValue(), ((Number) objArr[21]).longValue(), ((Number) objArr[22]).doubleValue(), ((Number) objArr[23]).longValue(), ((Number) objArr[24]).longValue());
            }
            throw new IllegalArgumentException("Expected 25 arguments");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.AbilityScoreQueries", f = "AbilityScoreQueries.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {401}, m = "updateAbilityScoreByBookIdAndTopicId", n = {a.b.C0242a.f16107c, "evef", "evefTime", "evcf", "evcfTime", "efcf", "efcfTime", "efu", "efuTime", "efs", "efsTime", "cfs", "cfsTime", "cfa", "cfaTime", "efpcf", "efpcfTime", "efd", "efdTime", "efau", "efauTime", "updateTime", "bookId", "topicId"}, s = {"D$0", "D$1", "J$0", "D$2", "J$1", "D$3", "J$2", "D$4", "J$3", "D$5", "J$4", "D$6", "J$5", "D$7", "J$6", "D$8", "J$7", "D$9", "J$8", "D$10", "J$9", "J$10", "J$11", "J$12"}, v = 1)
    public static final class j extends ContinuationImpl {
        public int A;

        /* renamed from: a, reason: collision with root package name */
        public double f50691a;

        /* renamed from: b, reason: collision with root package name */
        public double f50692b;

        /* renamed from: c, reason: collision with root package name */
        public double f50693c;

        /* renamed from: d, reason: collision with root package name */
        public double f50694d;

        /* renamed from: e, reason: collision with root package name */
        public double f50695e;

        /* renamed from: f, reason: collision with root package name */
        public double f50696f;

        /* renamed from: g, reason: collision with root package name */
        public double f50697g;

        /* renamed from: h, reason: collision with root package name */
        public double f50698h;

        /* renamed from: i, reason: collision with root package name */
        public double f50699i;

        /* renamed from: j, reason: collision with root package name */
        public double f50700j;

        /* renamed from: k, reason: collision with root package name */
        public double f50701k;

        /* renamed from: l, reason: collision with root package name */
        public long f50702l;

        /* renamed from: m, reason: collision with root package name */
        public long f50703m;

        /* renamed from: n, reason: collision with root package name */
        public long f50704n;

        /* renamed from: o, reason: collision with root package name */
        public long f50705o;

        /* renamed from: p, reason: collision with root package name */
        public long f50706p;

        /* renamed from: q, reason: collision with root package name */
        public long f50707q;

        /* renamed from: r, reason: collision with root package name */
        public long f50708r;

        /* renamed from: s, reason: collision with root package name */
        public long f50709s;

        /* renamed from: t, reason: collision with root package name */
        public long f50710t;

        /* renamed from: u, reason: collision with root package name */
        public long f50711u;

        /* renamed from: v, reason: collision with root package name */
        public long f50712v;

        /* renamed from: w, reason: collision with root package name */
        public long f50713w;

        /* renamed from: x, reason: collision with root package name */
        public long f50714x;

        /* renamed from: y, reason: collision with root package name */
        public /* synthetic */ Object f50715y;

        public j(j00.c<? super j> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f50715y = obj;
            this.A |= Integer.MIN_VALUE;
            return k.this.k0(0.0d, 0.0d, 0L, 0.0d, 0L, 0.0d, 0L, 0.0d, 0L, 0.0d, 0L, 0.0d, 0L, 0.0d, 0L, 0.0d, 0L, 0.0d, 0L, 0.0d, 0L, 0L, 0L, 0L, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(@m80.k l.e driver) {
        super(driver);
        kotlin.jvm.internal.g0.p(driver, "driver");
    }

    public static final yz.g2 W(f4.a aVar, l.f execute) {
        kotlin.jvm.internal.g0.p(execute, "$this$execute");
        execute.c(0, Long.valueOf(aVar.B()));
        execute.c(1, Long.valueOf(aVar.Y()));
        execute.b(2, Double.valueOf(aVar.X()));
        execute.b(3, Double.valueOf(aVar.U()));
        execute.c(4, Long.valueOf(aVar.V()));
        execute.b(5, Double.valueOf(aVar.S()));
        execute.c(6, Long.valueOf(aVar.T()));
        execute.b(7, Double.valueOf(aVar.I()));
        execute.c(8, Long.valueOf(aVar.J()));
        execute.b(9, Double.valueOf(aVar.Q()));
        execute.c(10, Long.valueOf(aVar.R()));
        execute.b(11, Double.valueOf(aVar.O()));
        execute.c(12, Long.valueOf(aVar.P()));
        execute.b(13, Double.valueOf(aVar.E()));
        execute.c(14, Long.valueOf(aVar.F()));
        execute.b(15, Double.valueOf(aVar.C()));
        execute.c(16, Long.valueOf(aVar.D()));
        execute.b(17, Double.valueOf(aVar.M()));
        execute.c(18, Long.valueOf(aVar.N()));
        execute.b(19, Double.valueOf(aVar.K()));
        execute.c(20, Long.valueOf(aVar.L()));
        execute.b(21, Double.valueOf(aVar.G()));
        execute.c(22, Long.valueOf(aVar.H()));
        execute.c(23, Long.valueOf(aVar.Z()));
        return yz.g2.f100423a;
    }

    public static final yz.g2 X(x00.l emit) {
        kotlin.jvm.internal.g0.p(emit, "emit");
        emit.invoke("abilityScore");
        return yz.g2.f100423a;
    }

    public static final Object a0(x00.x xVar, l.d cursor) {
        kotlin.jvm.internal.g0.p(cursor, "cursor");
        Long l11 = cursor.getLong(0);
        kotlin.jvm.internal.g0.m(l11);
        Long l12 = cursor.getLong(1);
        kotlin.jvm.internal.g0.m(l12);
        Long l13 = cursor.getLong(2);
        kotlin.jvm.internal.g0.m(l13);
        Double d11 = cursor.getDouble(3);
        kotlin.jvm.internal.g0.m(d11);
        Double d12 = cursor.getDouble(4);
        kotlin.jvm.internal.g0.m(d12);
        Long l14 = cursor.getLong(5);
        kotlin.jvm.internal.g0.m(l14);
        Double d13 = cursor.getDouble(6);
        kotlin.jvm.internal.g0.m(d13);
        Long l15 = cursor.getLong(7);
        kotlin.jvm.internal.g0.m(l15);
        Double d14 = cursor.getDouble(8);
        kotlin.jvm.internal.g0.m(d14);
        Long l16 = cursor.getLong(9);
        kotlin.jvm.internal.g0.m(l16);
        Double d15 = cursor.getDouble(10);
        kotlin.jvm.internal.g0.m(d15);
        Long l17 = cursor.getLong(11);
        kotlin.jvm.internal.g0.m(l17);
        Double d16 = cursor.getDouble(12);
        kotlin.jvm.internal.g0.m(d16);
        Long l18 = cursor.getLong(13);
        kotlin.jvm.internal.g0.m(l18);
        Double d17 = cursor.getDouble(14);
        kotlin.jvm.internal.g0.m(d17);
        Long l19 = cursor.getLong(15);
        kotlin.jvm.internal.g0.m(l19);
        Double d18 = cursor.getDouble(16);
        kotlin.jvm.internal.g0.m(d18);
        Long l21 = cursor.getLong(17);
        kotlin.jvm.internal.g0.m(l21);
        Double d19 = cursor.getDouble(18);
        kotlin.jvm.internal.g0.m(d19);
        Long l22 = cursor.getLong(19);
        kotlin.jvm.internal.g0.m(l22);
        Double d21 = cursor.getDouble(20);
        kotlin.jvm.internal.g0.m(d21);
        Long l23 = cursor.getLong(21);
        kotlin.jvm.internal.g0.m(l23);
        Double d22 = cursor.getDouble(22);
        kotlin.jvm.internal.g0.m(d22);
        Long l24 = cursor.getLong(23);
        kotlin.jvm.internal.g0.m(l24);
        Long l25 = cursor.getLong(24);
        kotlin.jvm.internal.g0.m(l25);
        return xVar.invoke(l11, l12, l13, d11, d12, l14, d13, l15, d14, l16, d15, l17, d16, l18, d17, l19, d18, l21, d19, l22, d21, l23, d22, l24, l25);
    }

    public static final Object d0(x00.x xVar, l.d cursor) {
        kotlin.jvm.internal.g0.p(cursor, "cursor");
        Long l11 = cursor.getLong(0);
        kotlin.jvm.internal.g0.m(l11);
        Long l12 = cursor.getLong(1);
        kotlin.jvm.internal.g0.m(l12);
        Long l13 = cursor.getLong(2);
        kotlin.jvm.internal.g0.m(l13);
        Double d11 = cursor.getDouble(3);
        kotlin.jvm.internal.g0.m(d11);
        Double d12 = cursor.getDouble(4);
        kotlin.jvm.internal.g0.m(d12);
        Long l14 = cursor.getLong(5);
        kotlin.jvm.internal.g0.m(l14);
        Double d13 = cursor.getDouble(6);
        kotlin.jvm.internal.g0.m(d13);
        Long l15 = cursor.getLong(7);
        kotlin.jvm.internal.g0.m(l15);
        Double d14 = cursor.getDouble(8);
        kotlin.jvm.internal.g0.m(d14);
        Long l16 = cursor.getLong(9);
        kotlin.jvm.internal.g0.m(l16);
        Double d15 = cursor.getDouble(10);
        kotlin.jvm.internal.g0.m(d15);
        Long l17 = cursor.getLong(11);
        kotlin.jvm.internal.g0.m(l17);
        Double d16 = cursor.getDouble(12);
        kotlin.jvm.internal.g0.m(d16);
        Long l18 = cursor.getLong(13);
        kotlin.jvm.internal.g0.m(l18);
        Double d17 = cursor.getDouble(14);
        kotlin.jvm.internal.g0.m(d17);
        Long l19 = cursor.getLong(15);
        kotlin.jvm.internal.g0.m(l19);
        Double d18 = cursor.getDouble(16);
        kotlin.jvm.internal.g0.m(d18);
        Long l21 = cursor.getLong(17);
        kotlin.jvm.internal.g0.m(l21);
        Double d19 = cursor.getDouble(18);
        kotlin.jvm.internal.g0.m(d19);
        Long l22 = cursor.getLong(19);
        kotlin.jvm.internal.g0.m(l22);
        Double d21 = cursor.getDouble(20);
        kotlin.jvm.internal.g0.m(d21);
        Long l23 = cursor.getLong(21);
        kotlin.jvm.internal.g0.m(l23);
        Double d22 = cursor.getDouble(22);
        kotlin.jvm.internal.g0.m(d22);
        Long l24 = cursor.getLong(23);
        kotlin.jvm.internal.g0.m(l24);
        Long l25 = cursor.getLong(24);
        kotlin.jvm.internal.g0.m(l25);
        return xVar.invoke(l11, l12, l13, d11, d12, l14, d13, l15, d14, l16, d15, l17, d16, l18, d17, l19, d18, l21, d19, l22, d21, l23, d22, l24, l25);
    }

    public static final Object g0(x00.x xVar, l.d cursor) {
        kotlin.jvm.internal.g0.p(cursor, "cursor");
        Long l11 = cursor.getLong(0);
        kotlin.jvm.internal.g0.m(l11);
        Long l12 = cursor.getLong(1);
        kotlin.jvm.internal.g0.m(l12);
        Long l13 = cursor.getLong(2);
        kotlin.jvm.internal.g0.m(l13);
        Double d11 = cursor.getDouble(3);
        kotlin.jvm.internal.g0.m(d11);
        Double d12 = cursor.getDouble(4);
        kotlin.jvm.internal.g0.m(d12);
        Long l14 = cursor.getLong(5);
        kotlin.jvm.internal.g0.m(l14);
        Double d13 = cursor.getDouble(6);
        kotlin.jvm.internal.g0.m(d13);
        Long l15 = cursor.getLong(7);
        kotlin.jvm.internal.g0.m(l15);
        Double d14 = cursor.getDouble(8);
        kotlin.jvm.internal.g0.m(d14);
        Long l16 = cursor.getLong(9);
        kotlin.jvm.internal.g0.m(l16);
        Double d15 = cursor.getDouble(10);
        kotlin.jvm.internal.g0.m(d15);
        Long l17 = cursor.getLong(11);
        kotlin.jvm.internal.g0.m(l17);
        Double d16 = cursor.getDouble(12);
        kotlin.jvm.internal.g0.m(d16);
        Long l18 = cursor.getLong(13);
        kotlin.jvm.internal.g0.m(l18);
        Double d17 = cursor.getDouble(14);
        kotlin.jvm.internal.g0.m(d17);
        Long l19 = cursor.getLong(15);
        kotlin.jvm.internal.g0.m(l19);
        Double d18 = cursor.getDouble(16);
        kotlin.jvm.internal.g0.m(d18);
        Long l21 = cursor.getLong(17);
        kotlin.jvm.internal.g0.m(l21);
        Double d19 = cursor.getDouble(18);
        kotlin.jvm.internal.g0.m(d19);
        Long l22 = cursor.getLong(19);
        kotlin.jvm.internal.g0.m(l22);
        Double d21 = cursor.getDouble(20);
        kotlin.jvm.internal.g0.m(d21);
        Long l23 = cursor.getLong(21);
        kotlin.jvm.internal.g0.m(l23);
        Double d22 = cursor.getDouble(22);
        kotlin.jvm.internal.g0.m(d22);
        Long l24 = cursor.getLong(23);
        kotlin.jvm.internal.g0.m(l24);
        Long l25 = cursor.getLong(24);
        kotlin.jvm.internal.g0.m(l25);
        return xVar.invoke(l11, l12, l13, d11, d12, l14, d13, l15, d14, l16, d15, l17, d16, l18, d17, l19, d18, l21, d19, l22, d21, l23, d22, l24, l25);
    }

    public static final Object j0(x00.x xVar, l.d cursor) {
        kotlin.jvm.internal.g0.p(cursor, "cursor");
        Long l11 = cursor.getLong(0);
        kotlin.jvm.internal.g0.m(l11);
        Long l12 = cursor.getLong(1);
        kotlin.jvm.internal.g0.m(l12);
        Long l13 = cursor.getLong(2);
        kotlin.jvm.internal.g0.m(l13);
        Double d11 = cursor.getDouble(3);
        kotlin.jvm.internal.g0.m(d11);
        Double d12 = cursor.getDouble(4);
        kotlin.jvm.internal.g0.m(d12);
        Long l14 = cursor.getLong(5);
        kotlin.jvm.internal.g0.m(l14);
        Double d13 = cursor.getDouble(6);
        kotlin.jvm.internal.g0.m(d13);
        Long l15 = cursor.getLong(7);
        kotlin.jvm.internal.g0.m(l15);
        Double d14 = cursor.getDouble(8);
        kotlin.jvm.internal.g0.m(d14);
        Long l16 = cursor.getLong(9);
        kotlin.jvm.internal.g0.m(l16);
        Double d15 = cursor.getDouble(10);
        kotlin.jvm.internal.g0.m(d15);
        Long l17 = cursor.getLong(11);
        kotlin.jvm.internal.g0.m(l17);
        Double d16 = cursor.getDouble(12);
        kotlin.jvm.internal.g0.m(d16);
        Long l18 = cursor.getLong(13);
        kotlin.jvm.internal.g0.m(l18);
        Double d17 = cursor.getDouble(14);
        kotlin.jvm.internal.g0.m(d17);
        Long l19 = cursor.getLong(15);
        kotlin.jvm.internal.g0.m(l19);
        Double d18 = cursor.getDouble(16);
        kotlin.jvm.internal.g0.m(d18);
        Long l21 = cursor.getLong(17);
        kotlin.jvm.internal.g0.m(l21);
        Double d19 = cursor.getDouble(18);
        kotlin.jvm.internal.g0.m(d19);
        Long l22 = cursor.getLong(19);
        kotlin.jvm.internal.g0.m(l22);
        Double d21 = cursor.getDouble(20);
        kotlin.jvm.internal.g0.m(d21);
        Long l23 = cursor.getLong(21);
        kotlin.jvm.internal.g0.m(l23);
        Double d22 = cursor.getDouble(22);
        kotlin.jvm.internal.g0.m(d22);
        Long l24 = cursor.getLong(23);
        kotlin.jvm.internal.g0.m(l24);
        Long l25 = cursor.getLong(24);
        kotlin.jvm.internal.g0.m(l25);
        return xVar.invoke(l11, l12, l13, d11, d12, l14, d13, l15, d14, l16, d15, l17, d16, l18, d17, l19, d18, l21, d19, l22, d21, l23, d22, l24, l25);
    }

    public static final yz.g2 l0(double d11, double d12, long j11, double d13, long j12, double d14, long j13, double d15, long j14, double d16, long j15, double d17, long j16, double d18, long j17, double d19, long j18, double d21, long j19, double d22, long j21, long j22, long j23, long j24, l.f execute) {
        kotlin.jvm.internal.g0.p(execute, "$this$execute");
        execute.b(0, Double.valueOf(d11));
        execute.b(1, Double.valueOf(d12));
        execute.c(2, Long.valueOf(j11));
        execute.b(3, Double.valueOf(d13));
        execute.c(4, Long.valueOf(j12));
        execute.b(5, Double.valueOf(d14));
        execute.c(6, Long.valueOf(j13));
        execute.b(7, Double.valueOf(d15));
        execute.c(8, Long.valueOf(j14));
        execute.b(9, Double.valueOf(d16));
        execute.c(10, Long.valueOf(j15));
        execute.b(11, Double.valueOf(d17));
        execute.c(12, Long.valueOf(j16));
        execute.b(13, Double.valueOf(d18));
        execute.c(14, Long.valueOf(j17));
        execute.b(15, Double.valueOf(d19));
        execute.c(16, Long.valueOf(j18));
        execute.b(17, Double.valueOf(d21));
        execute.c(18, Long.valueOf(j19));
        execute.b(19, Double.valueOf(d22));
        execute.c(20, Long.valueOf(j21));
        execute.c(21, Long.valueOf(j22));
        execute.c(22, Long.valueOf(j23));
        execute.c(23, Long.valueOf(j24));
        return yz.g2.f100423a;
    }

    public static final yz.g2 m0(x00.l emit) {
        kotlin.jvm.internal.g0.p(emit, "emit");
        emit.invoke("abilityScore");
        return yz.g2.f100423a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object V(@m80.k final f4.a r9, @m80.k j00.c<? super java.lang.Long> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof f4.k.e
            if (r0 == 0) goto L13
            r0 = r10
            f4.k$e r0 = (f4.k.e) r0
            int r1 = r0.f50686d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f50686d = r1
            goto L18
        L13:
            f4.k$e r0 = new f4.k$e
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f50684b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f50686d
            r3 = 1473464060(0x57d346fc, float:4.64603658E14)
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 != r4) goto L30
            java.lang.Object r9 = r0.f50683a
            f4.a r9 = (f4.a) r9
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
            f4.c r5 = new f4.c
            r5.<init>()
            java.lang.String r6 = "INSERT OR IGNORE INTO abilityScore (\n    bookId,\n    topicId,\n    score,\n    evef,\n    evefTime,\n    evcf,\n    evcfTime,\n    efcf,\n    efcfTime,\n    efu,\n    efuTime,\n    efs,\n    efsTime,\n    cfs,\n    cfsTime,\n    cfa,\n    cfaTime,\n    efpcf,\n    efpcfTime,\n    efd,\n    efdTime,\n    efau,\n    efauTime,\n    updateTime\n) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)"
            r7 = 24
            l.c r10 = r10.v3(r2, r6, r7, r5)
            java.lang.Object r9 = l00.k.a(r9)
            r0.f50683a = r9
            r0.f50686d = r4
            java.lang.Object r10 = r10.i(r0)
            if (r10 != r1) goto L5f
            return r1
        L5f:
            java.lang.Number r10 = (java.lang.Number) r10
            long r9 = r10.longValue()
            f4.d r0 = new f4.d
            r0.<init>()
            r8.D(r3, r0)
            java.lang.Long r9 = l00.a.g(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: f4.k.V(f4.a, j00.c):java.lang.Object");
    }

    @m80.k
    public final j.j<f4.a> Y(long j11, long j12) {
        return Z(j11, j12, f.f50687a);
    }

    @m80.k
    public final <T> j.j<T> Z(long j11, long j12, @m80.k final x00.x<? extends T> mapper) {
        kotlin.jvm.internal.g0.p(mapper, "mapper");
        return new a(this, j11, j12, new x00.l() { // from class: f4.e
            @Override // x00.l
            public final Object invoke(Object obj) {
                Object a02;
                a02 = k.a0(x00.x.this, (l.d) obj);
                return a02;
            }
        });
    }

    @m80.k
    public final j.j<f4.a> b0(long j11, @m80.k Collection<Long> topicId) {
        kotlin.jvm.internal.g0.p(topicId, "topicId");
        return c0(j11, topicId, g.f50688a);
    }

    @m80.k
    public final <T> j.j<T> c0(long j11, @m80.k Collection<Long> topicId, @m80.k final x00.x<? extends T> mapper) {
        kotlin.jvm.internal.g0.p(topicId, "topicId");
        kotlin.jvm.internal.g0.p(mapper, "mapper");
        return new b(this, j11, topicId, new x00.l() { // from class: f4.f
            @Override // x00.l
            public final Object invoke(Object obj) {
                Object d02;
                d02 = k.d0(x00.x.this, (l.d) obj);
                return d02;
            }
        });
    }

    @m80.k
    public final j.j<f4.a> e0(long j11) {
        return f0(j11, h.f50689a);
    }

    @m80.k
    public final <T> j.j<T> f0(long j11, @m80.k final x00.x<? extends T> mapper) {
        kotlin.jvm.internal.g0.p(mapper, "mapper");
        return new c(this, j11, new x00.l() { // from class: f4.b
            @Override // x00.l
            public final Object invoke(Object obj) {
                Object g02;
                g02 = k.g0(x00.x.this, (l.d) obj);
                return g02;
            }
        });
    }

    @m80.k
    public final j.j<f4.a> h0(@m80.k Collection<Long> id2) {
        kotlin.jvm.internal.g0.p(id2, "id");
        return i0(id2, i.f50690a);
    }

    @m80.k
    public final <T> j.j<T> i0(@m80.k Collection<Long> id2, @m80.k final x00.x<? extends T> mapper) {
        kotlin.jvm.internal.g0.p(id2, "id");
        kotlin.jvm.internal.g0.p(mapper, "mapper");
        return new d(this, id2, new x00.l() { // from class: f4.g
            @Override // x00.l
            public final Object invoke(Object obj) {
                Object j02;
                j02 = k.j0(x00.x.this, (l.d) obj);
                return j02;
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k0(final double r57, final double r59, final long r61, final double r63, final long r65, final double r67, final long r69, final double r71, final long r73, final double r75, final long r77, final double r79, final long r81, final double r83, final long r85, final double r87, final long r89, final double r91, final long r93, final double r95, final long r97, final long r99, final long r101, final long r103, @m80.k j00.c<? super java.lang.Long> r105) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f4.k.k0(double, double, long, double, long, double, long, double, long, double, long, double, long, double, long, double, long, double, long, double, long, long, long, long, j00.c):java.lang.Object");
    }
}

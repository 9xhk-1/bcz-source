package o6;

import f4.w2;
import h5.p0;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@oa0.r
/* loaded from: classes3.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final p6.q f76240a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final z5.g f76241b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.game.repo.roadmap.a f76242c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.game.repo.gameround.e f76243d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.game.repo.book.b f76244e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.study.ObserveStudySummaryUC", f = "ObserveStudySummaryUC.kt", i = {0, 1, 2, 3}, l = {25, 26, 27, 28}, m = "invoke", n = {"bookId", "bookId", "bookId", "bookId"}, s = {"J$0", "J$0", "J$0", "J$0"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f76245a;

        /* renamed from: b, reason: collision with root package name */
        public Object f76246b;

        /* renamed from: c, reason: collision with root package name */
        public Object f76247c;

        /* renamed from: d, reason: collision with root package name */
        public Object f76248d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f76249e;

        /* renamed from: g, reason: collision with root package name */
        public int f76251g;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f76249e = obj;
            this.f76251g |= Integer.MIN_VALUE;
            return v.this.b(0L, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.study.ObserveStudySummaryUC$invoke$2", f = "ObserveStudySummaryUC.kt", i = {0, 0, 0, 0, 0}, l = {30}, m = "invokeSuspend", n = {"studyRecord", "roadMap", "gameRound", "<destruct>", "gameBook"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4"}, v = 1)
    public static final class b extends SuspendLambda implements x00.s<List<? extends w2>, p8.e0, List<? extends h5.m>, Pair<? extends h5.j, ? extends Pair<? extends Integer, ? extends Integer>>, j00.c<? super p0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f76252a;

        /* renamed from: b, reason: collision with root package name */
        public int f76253b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f76254c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f76255d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f76256e;

        /* renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f76257f;

        public b(j00.c<? super b> cVar) {
            super(5, cVar);
        }

        @Override // x00.s
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(List<w2> list, p8.e0 e0Var, List<h5.m> list2, Pair<h5.j, Pair<Integer, Integer>> pair, j00.c<? super p0> cVar) {
            b bVar = v.this.new b(cVar);
            bVar.f76254c = list;
            bVar.f76255d = e0Var;
            bVar.f76256e = list2;
            bVar.f76257f = pair;
            return bVar.invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List<w2> list = (List) this.f76254c;
            p8.e0 e0Var = (p8.e0) this.f76255d;
            List<h5.m> list2 = (List) this.f76256e;
            Pair pair = (Pair) this.f76257f;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f76253b;
            if (i11 == 0) {
                kotlin.e.n(obj);
                h5.j jVar = (h5.j) pair.component1();
                p6.q qVar = v.this.f76240a;
                this.f76254c = l00.k.a(list);
                this.f76255d = l00.k.a(e0Var);
                this.f76256e = l00.k.a(list2);
                this.f76257f = l00.k.a(pair);
                this.f76252a = l00.k.a(jVar);
                this.f76253b = 1;
                obj = qVar.a(jVar, e0Var, list, list2, this);
                if (obj == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            z6.b.j(z6.b.f101032b, w.f76259a, "observe study summary: " + ((p0) obj), null, 4, null);
            return obj;
        }
    }

    public v(@m80.k p6.q processStudySummary, @m80.k z5.g studyRecordRepo, @m80.k com.baicizhan.app.biz.game.repo.roadmap.a roadMapRepo, @m80.k com.baicizhan.app.biz.game.repo.gameround.e gameRoundRepo, @m80.k com.baicizhan.app.biz.game.repo.book.b gameBookScheduleRepo) {
        g0.p(processStudySummary, "processStudySummary");
        g0.p(studyRecordRepo, "studyRecordRepo");
        g0.p(roadMapRepo, "roadMapRepo");
        g0.p(gameRoundRepo, "gameRoundRepo");
        g0.p(gameBookScheduleRepo, "gameBookScheduleRepo");
        this.f76240a = processStudySummary;
        this.f76241b = studyRecordRepo;
        this.f76242c = roadMapRepo;
        this.f76243d = gameRoundRepo;
        this.f76244e = gameBookScheduleRepo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x009b, code lost:
    
        if (r4 == r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0088, code lost:
    
        if (r11 != r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0076, code lost:
    
        if (r11 == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(long r9, @m80.k j00.c<? super kotlinx.coroutines.flow.i<h5.p0>> r11) {
        /*
            Method dump skipped, instructions count: 196
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o6.v.b(long, j00.c):java.lang.Object");
    }
}

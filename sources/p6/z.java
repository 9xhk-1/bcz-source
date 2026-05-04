package p6;

import a00.r0;
import f4.w2;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.u0;
import m3.k2;
import q30.k0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@oa0.r
@u0({"SMAP\nSelectNewLearningWordsUC.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectNewLearningWordsUC.kt\ncom/baicizhan/app/biz/game/uc/study/algorithm/SelectNewLearningWordsUC\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,125:1\n1563#2:126\n1634#2,3:127\n1208#2,2:131\n1236#2,4:133\n1#3:130\n*S KotlinDebug\n*F\n+ 1 SelectNewLearningWordsUC.kt\ncom/baicizhan/app/biz/game/uc/study/algorithm/SelectNewLearningWordsUC\n*L\n38#1:126\n38#1:127,3\n94#1:131,2\n94#1:133,4\n*E\n"})
/* loaded from: classes3.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final z5.g f79325a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.game.repo.roadmap.a f79326b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final f6.a f79327c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final f6.c f79328d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.study.algorithm.SelectNewLearningWordsUC", f = "SelectNewLearningWordsUC.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 2}, l = {28, 31, 41}, m = "invoke", n = {"bookId", "maxCount", "unitNo", "learned", "bookId", "maxCount", "unitNo", "learned", "roadMapInfo", "bookId", "maxCount", "unitNo"}, s = {"J$0", "I$0", "I$1", "L$0", "J$0", "I$0", "I$1", "L$0", "L$1", "J$0", "I$0", "I$1"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f79329a;

        /* renamed from: b, reason: collision with root package name */
        public int f79330b;

        /* renamed from: c, reason: collision with root package name */
        public int f79331c;

        /* renamed from: d, reason: collision with root package name */
        public Object f79332d;

        /* renamed from: e, reason: collision with root package name */
        public Object f79333e;

        /* renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f79334f;

        /* renamed from: h, reason: collision with root package name */
        public int f79336h;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f79334f = obj;
            this.f79336h |= Integer.MIN_VALUE;
            return z.this.i(0L, 0, 0, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.study.algorithm.SelectNewLearningWordsUC", f = "SelectNewLearningWordsUC.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1}, l = {79, 83}, m = "selectWordsWithUnit", n = {"roadMapInfo", "learned", "cakeModules", "bookId", "selectUnitNo", "maxCount", "roadMapInfo", "learned", "cakeModules", "bookId", "selectUnitNo", "maxCount", "curIdx"}, s = {"L$0", "L$1", "L$2", "J$0", "I$0", "I$1", "L$0", "L$1", "L$2", "J$0", "I$0", "I$1", "I$2"}, v = 1)
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f79337a;

        /* renamed from: b, reason: collision with root package name */
        public Object f79338b;

        /* renamed from: c, reason: collision with root package name */
        public Object f79339c;

        /* renamed from: d, reason: collision with root package name */
        public Object f79340d;

        /* renamed from: e, reason: collision with root package name */
        public int f79341e;

        /* renamed from: f, reason: collision with root package name */
        public int f79342f;

        /* renamed from: g, reason: collision with root package name */
        public int f79343g;

        /* renamed from: h, reason: collision with root package name */
        public /* synthetic */ Object f79344h;

        /* renamed from: j, reason: collision with root package name */
        public int f79346j;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f79344h = obj;
            this.f79346j |= Integer.MIN_VALUE;
            return z.this.n(0L, null, null, 0, 0, this);
        }
    }

    public z(@m80.k z5.g recordRepo, @m80.k com.baicizhan.app.biz.game.repo.roadmap.a roadMapRepo, @m80.k f6.a getCurStudyIdxUC, @m80.k f6.c getCurUnitNoUC) {
        kotlin.jvm.internal.g0.p(recordRepo, "recordRepo");
        kotlin.jvm.internal.g0.p(roadMapRepo, "roadMapRepo");
        kotlin.jvm.internal.g0.p(getCurStudyIdxUC, "getCurStudyIdxUC");
        kotlin.jvm.internal.g0.p(getCurUnitNoUC, "getCurUnitNoUC");
        this.f79325a = recordRepo;
        this.f79326b = roadMapRepo;
        this.f79327c = getCurStudyIdxUC;
        this.f79328d = getCurUnitNoUC;
    }

    public static final boolean j(w2 it) {
        kotlin.jvm.internal.g0.p(it, "it");
        return !z5.i.r(it) || z5.i.e(it);
    }

    public static final boolean l(Set set, int i11) {
        return !set.contains(Long.valueOf(i11));
    }

    public static final k2 m(int i11) {
        return new k2(i11, 0, 0);
    }

    public static final Integer o(List list, int i11) {
        return Integer.valueOf((i11 + 1) % list.size());
    }

    public static final Pair p(List list, Map map, int i11) {
        long intValue = ((Number) list.get(i11)).intValue();
        return new Pair(Long.valueOf(intValue), map.get(Long.valueOf(intValue)));
    }

    public static final boolean q(Pair pair) {
        kotlin.jvm.internal.g0.p(pair, "pair");
        w2 w2Var = (w2) pair.getSecond();
        return w2Var == null || !z5.i.e(w2Var);
    }

    public static final k2 r(Pair it) {
        kotlin.jvm.internal.g0.p(it, "it");
        int longValue = (int) ((Number) it.getFirst()).longValue();
        w2 w2Var = (w2) it.getSecond();
        int l11 = w2Var != null ? (int) w2Var.l() : 0;
        w2 w2Var2 = (w2) it.getSecond();
        return new k2(longValue, l11, w2Var2 != null ? w3.g.g((int) w2Var2.o(), -((int) w2Var2.l())) : 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(long r19, int r21, int r22, @m80.k j00.c<? super java.util.List<m3.k2>> r23) {
        /*
            Method dump skipped, instructions count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p6.z.i(long, int, int, j00.c):java.lang.Object");
    }

    public final List<k2> k(List<Integer> list, final Set<Long> set, int i11) {
        List<k2> I3 = k0.I3(k0.N1(k0.E3(k0.P0(r0.E1(list), new x00.l() { // from class: p6.w
            @Override // x00.l
            public final Object invoke(Object obj) {
                boolean l11;
                l11 = z.l(set, ((Integer) obj).intValue());
                return Boolean.valueOf(l11);
            }
        }), i11), new x00.l() { // from class: p6.x
            @Override // x00.l
            public final Object invoke(Object obj) {
                k2 m11;
                m11 = z.m(((Integer) obj).intValue());
                return m11;
            }
        }));
        z6.b bVar = z6.b.f101032b;
        z6.b.j(bVar, a0.f79162a, "New learning words selection completed - selectedCount: " + I3.size() + ", availableUnlearnedWords: " + (list.size() - set.size()), null, 4, null);
        if (I3.isEmpty()) {
            z6.b.d(bVar, a0.f79162a, "No unlearned words found", null, 4, null);
        }
        return I3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0084, code lost:
    
        if (r2 == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0137 A[LOOP:0: B:15:0x0131->B:17:0x0137, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(long r9, p8.e0 r11, java.util.List<f4.w2> r12, int r13, int r14, j00.c<? super java.util.List<m3.k2>> r15) {
        /*
            Method dump skipped, instructions count: 457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p6.z.n(long, p8.e0, java.util.List, int, int, j00.c):java.lang.Object");
    }
}

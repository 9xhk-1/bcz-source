package p6;

import f4.w2;
import java.util.Comparator;
import java.util.Map;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@oa0.r
@u0({"SMAP\nSelectReviewWordsUC.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectReviewWordsUC.kt\ncom/baicizhan/app/biz/game/uc/study/algorithm/SelectReviewWordsUC\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,74:1\n1573#2:75\n1604#2,4:76\n1563#2:94\n1634#2,3:95\n1563#2:98\n1634#2,3:99\n996#3:80\n1025#3,3:81\n1028#3,3:91\n382#4,7:84\n*S KotlinDebug\n*F\n+ 1 SelectReviewWordsUC.kt\ncom/baicizhan/app/biz/game/uc/study/algorithm/SelectReviewWordsUC\n*L\n24#1:75\n24#1:76,4\n42#1:94\n42#1:95,3\n56#1:98\n56#1:99,3\n34#1:80\n34#1:81,3\n34#1:91,3\n34#1:84,7\n*E\n"})
/* loaded from: classes3.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final z5.g f79165a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.game.repo.roadmap.a f79166b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 SelectReviewWordsUC.kt\ncom/baicizhan/app/biz/game/uc/study/algorithm/SelectReviewWordsUC\n*L\n1#1,328:1\n29#2:329\n*E\n"})
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return e00.g.l(Long.valueOf(((w2) t11).o()), Long.valueOf(((w2) t12).o()));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$thenBy$1\n+ 2 SelectReviewWordsUC.kt\ncom/baicizhan/app/biz/game/uc/study/algorithm/SelectReviewWordsUC\n*L\n1#1,328:1\n31#2:329\n*E\n"})
    public static final class b<T> implements Comparator {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Comparator f79167a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Map f79168b;

        public b(Comparator comparator, Map map) {
            this.f79167a = comparator;
            this.f79168b = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            int compare = this.f79167a.compare(t11, t12);
            if (compare != 0) {
                return compare;
            }
            Integer num = (Integer) this.f79168b.get(Long.valueOf(((w2) t11).q()));
            if (num == null) {
                num = r0;
            }
            Integer num2 = (Integer) this.f79168b.get(Long.valueOf(((w2) t12).q()));
            return e00.g.l(num, num2 != null ? num2 : Integer.MAX_VALUE);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.study.algorithm.SelectReviewWordsUC", f = "SelectReviewWordsUC.kt", i = {0, 0, 0, 1, 1, 1, 1}, l = {24, 25}, m = "invoke", n = {"bookId", "maxCount", "today", "roadMapOrderMap", "bookId", "maxCount", "today"}, s = {"J$0", "I$0", "J$1", "L$0", "J$0", "I$0", "J$1"}, v = 1)
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f79169a;

        /* renamed from: b, reason: collision with root package name */
        public long f79170b;

        /* renamed from: c, reason: collision with root package name */
        public int f79171c;

        /* renamed from: d, reason: collision with root package name */
        public Object f79172d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f79173e;

        /* renamed from: g, reason: collision with root package name */
        public int f79175g;

        public c(j00.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f79173e = obj;
            this.f79175g |= Integer.MIN_VALUE;
            return c0.this.b(0L, 0, this);
        }
    }

    public c0(@m80.k z5.g repo, @m80.k com.baicizhan.app.biz.game.repo.roadmap.a roadMapRepo) {
        kotlin.jvm.internal.g0.p(repo, "repo");
        kotlin.jvm.internal.g0.p(roadMapRepo, "roadMapRepo");
        this.f79165a = repo;
        this.f79166b = roadMapRepo;
    }

    public static final boolean c(long j11, w2 it) {
        kotlin.jvm.internal.g0.p(it, "it");
        return z5.i.a(it, j11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [int] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [int] */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(long r27, int r29, @m80.k j00.c<? super java.util.List<m3.k2>> r30) {
        /*
            Method dump skipped, instructions count: 715
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p6.c0.b(long, int, j00.c):java.lang.Object");
    }
}

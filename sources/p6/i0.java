package p6;

import f4.w2;
import java.util.Map;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.u0;
import m3.k2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@oa0.r
@u0({"SMAP\nSelectSpellWordsUC.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectSpellWordsUC.kt\ncom/baicizhan/app/biz/game/uc/study/algorithm/SelectSpellWordsUC\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,51:1\n682#2:52\n712#2,4:53\n*S KotlinDebug\n*F\n+ 1 SelectSpellWordsUC.kt\ncom/baicizhan/app/biz/game/uc/study/algorithm/SelectSpellWordsUC\n*L\n26#1:52\n26#1:53,4\n*E\n"})
/* loaded from: classes3.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final z5.g f79222a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.game.repo.roadmap.a f79223b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.study.algorithm.SelectSpellWordsUC", f = "SelectSpellWordsUC.kt", i = {0, 0, 0, 1, 1, 1, 1}, l = {20, 23}, m = "invoke", n = {"bookId", "maxCount", "today", "roadMap", "bookId", "maxCount", "today"}, s = {"J$0", "I$0", "J$1", "L$0", "J$0", "I$0", "J$1"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f79224a;

        /* renamed from: b, reason: collision with root package name */
        public long f79225b;

        /* renamed from: c, reason: collision with root package name */
        public int f79226c;

        /* renamed from: d, reason: collision with root package name */
        public Object f79227d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f79228e;

        /* renamed from: g, reason: collision with root package name */
        public int f79230g;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f79228e = obj;
            this.f79230g |= Integer.MIN_VALUE;
            return i0.this.e(0L, 0, 0L, this);
        }
    }

    public i0(@m80.k z5.g repo, @m80.k com.baicizhan.app.biz.game.repo.roadmap.a roadMapRepo) {
        kotlin.jvm.internal.g0.p(repo, "repo");
        kotlin.jvm.internal.g0.p(roadMapRepo, "roadMapRepo");
        this.f79222a = repo;
        this.f79223b = roadMapRepo;
    }

    public static final boolean f(long j11, w2 it) {
        kotlin.jvm.internal.g0.p(it, "it");
        return z5.i.m(it, j11);
    }

    public static final boolean g(Map map, int i11) {
        return map.containsKey(Long.valueOf(i11));
    }

    public static final w2 h(Map map, int i11) {
        Object obj = map.get(Long.valueOf(i11));
        kotlin.jvm.internal.g0.m(obj);
        return (w2) obj;
    }

    public static final k2 i(w2 it) {
        kotlin.jvm.internal.g0.p(it, "it");
        return new k2((int) it.q(), (int) it.l(), w3.g.g((int) it.o(), -((int) it.l())));
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0094, code lost:
    
        if (r6 == r8) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00fb A[LOOP:0: B:12:0x00f5->B:14:0x00fb, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(long r21, int r23, long r24, @m80.k j00.c<? super java.util.List<m3.k2>> r26) {
        /*
            Method dump skipped, instructions count: 421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p6.i0.e(long, int, long, j00.c):java.lang.Object");
    }
}

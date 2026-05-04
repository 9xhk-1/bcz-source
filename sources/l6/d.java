package l6;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@oa0.r
@u0({"SMAP\nCheckGameResourceUC.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CheckGameResourceUC.kt\ncom/baicizhan/app/biz/game/uc/resource/CheckGameResourceUC\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,47:1\n1563#2:48\n1634#2,3:49\n1563#2:52\n1634#2,3:53\n1563#2:56\n1634#2,3:57\n*S KotlinDebug\n*F\n+ 1 CheckGameResourceUC.kt\ncom/baicizhan/app/biz/game/uc/resource/CheckGameResourceUC\n*L\n23#1:48\n23#1:49,3\n26#1:52\n26#1:53,3\n33#1:56\n33#1:57,3\n*E\n"})
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.game.repo.gameround.e f70179a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final v5.g f70180b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final f f70181c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final t f70182d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final n6.c f70183e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.resource.CheckGameResourceUC", f = "CheckGameResourceUC.kt", i = {0, 0, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4}, l = {21, 22, 26, 33, 40}, m = "invoke", n = {"gameId", "mode", "gameId", "gameRound", "mode", "gameId", "gameRound", "topicIds", "mode", "curMode", "gameId", "gameRound", "topicIds", "resource", "mode", "curMode", "gameId", "gameRound", "topicIds", "resource", "needUpdate", "mode", "curMode"}, s = {"L$0", "I$0", "L$0", "L$1", "I$0", "L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "I$1"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f70184a;

        /* renamed from: b, reason: collision with root package name */
        public Object f70185b;

        /* renamed from: c, reason: collision with root package name */
        public Object f70186c;

        /* renamed from: d, reason: collision with root package name */
        public Object f70187d;

        /* renamed from: e, reason: collision with root package name */
        public Object f70188e;

        /* renamed from: f, reason: collision with root package name */
        public int f70189f;

        /* renamed from: g, reason: collision with root package name */
        public int f70190g;

        /* renamed from: h, reason: collision with root package name */
        public /* synthetic */ Object f70191h;

        /* renamed from: j, reason: collision with root package name */
        public int f70193j;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f70191h = obj;
            this.f70193j |= Integer.MIN_VALUE;
            return d.this.a(null, 0, this);
        }
    }

    public d(@m80.k com.baicizhan.app.biz.game.repo.gameround.e gameRoundRepo, @m80.k v5.g wordResourceRepo, @m80.k f checkNeedUpdateUC, @m80.k t getUnReadyResourceUrlUC, @m80.k n6.c getStudyModeSetting) {
        g0.p(gameRoundRepo, "gameRoundRepo");
        g0.p(wordResourceRepo, "wordResourceRepo");
        g0.p(checkNeedUpdateUC, "checkNeedUpdateUC");
        g0.p(getUnReadyResourceUrlUC, "getUnReadyResourceUrlUC");
        g0.p(getStudyModeSetting, "getStudyModeSetting");
        this.f70179a = gameRoundRepo;
        this.f70180b = wordResourceRepo;
        this.f70181c = checkNeedUpdateUC;
        this.f70182d = getUnReadyResourceUrlUC;
        this.f70183e = getStudyModeSetting;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00c4, code lost:
    
        if (r1 == r3) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0108 A[LOOP:1: B:45:0x0102->B:47:0x0108, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0135 A[LOOP:2: B:50:0x012f->B:52:0x0135, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@m80.k java.lang.String r26, int r27, @m80.k j00.c<? super java.lang.Boolean> r28) {
        /*
            Method dump skipped, instructions count: 676
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l6.d.a(java.lang.String, int, j00.c):java.lang.Object");
    }
}

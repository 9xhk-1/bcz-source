package f5;

import com.baicizhan.main.receiver.LearnOperationReceiver;
import f4.w2;
import java.util.Map;
import k3.v0;
import k3.w0;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import oa0.r;
import z5.g;
import z5.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r(binds = {w0.class})
@u0({"SMAP\nGameWordListServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameWordListServiceImpl.kt\ncom/baicizhan/app/biz/game/impl/wordlist/GameWordListServiceImpl\n+ 2 TimeMeasurer.kt\ncom/baicizhan/app/biz/base/TimeMeasurerKt\n+ 3 BizCatch.kt\ncom/baicizhan/app/biz/base/BizCatchKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,115:1\n12#2,3:116\n15#2,10:131\n12#3,12:119\n1563#4:141\n1634#4,3:142\n1563#4:145\n1634#4,3:146\n1563#4:149\n1634#4,3:150\n1208#4,2:153\n1236#4,4:155\n*S KotlinDebug\n*F\n+ 1 GameWordListServiceImpl.kt\ncom/baicizhan/app/biz/game/impl/wordlist/GameWordListServiceImpl\n*L\n-1#1:116,3\n-1#1:131,10\n-1#1:119,12\n44#1:141\n44#1:142,3\n52#1:145\n52#1:146,3\n63#1:149\n63#1:150,3\n77#1:153,2\n77#1:155,4\n*E\n"})
/* loaded from: classes3.dex */
public final class b implements w0 {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g f50967b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.baicizhan.app.biz.game.repo.roadmap.a f50968c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final e6.g f50969d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final v6.a f50970e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.wordlist.GameWordListServiceImpl", f = "GameWordListServiceImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {35, 36}, m = "getWordList", n = {"tag$iv", "bookId", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-GameWordListServiceImpl$getWordList$2", "$i$f$bizCatch", "$i$a$-bizCatch-GameWordListServiceImpl$getWordList$2$1", "curBookId", "tag$iv", "roadMap", "bookId", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-GameWordListServiceImpl$getWordList$2", "$i$f$bizCatch", "$i$a$-bizCatch-GameWordListServiceImpl$getWordList$2$1", "curBookId"}, s = {"L$0", "I$0", "I$1", "J$0", "I$2", "I$3", "I$4", "J$1", "L$0", "L$1", "I$0", "I$1", "J$0", "I$2", "I$3", "I$4", "J$1"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public int f50971a;

        /* renamed from: b, reason: collision with root package name */
        public int f50972b;

        /* renamed from: c, reason: collision with root package name */
        public int f50973c;

        /* renamed from: d, reason: collision with root package name */
        public int f50974d;

        /* renamed from: e, reason: collision with root package name */
        public int f50975e;

        /* renamed from: f, reason: collision with root package name */
        public Object f50976f;

        /* renamed from: g, reason: collision with root package name */
        public Object f50977g;

        /* renamed from: h, reason: collision with root package name */
        public long f50978h;

        /* renamed from: i, reason: collision with root package name */
        public long f50979i;

        /* renamed from: j, reason: collision with root package name */
        public /* synthetic */ Object f50980j;

        /* renamed from: l, reason: collision with root package name */
        public int f50982l;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f50980j = obj;
            this.f50982l |= Integer.MIN_VALUE;
            return b.this.y1(0, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.wordlist.GameWordListServiceImpl", f = "GameWordListServiceImpl.kt", i = {0, 0}, l = {77}, m = "getWordWordListItems", n = {"roadMap", "curBookId"}, s = {"L$0", "J$0"}, v = 1)
    /* renamed from: f5.b$b, reason: collision with other inner class name */
    public static final class C0607b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f50983a;

        /* renamed from: b, reason: collision with root package name */
        public long f50984b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f50985c;

        /* renamed from: e, reason: collision with root package name */
        public int f50987e;

        public C0607b(j00.c<? super C0607b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f50985c = obj;
            this.f50987e |= Integer.MIN_VALUE;
            return b.this.E(null, 0L, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.wordlist.GameWordListServiceImpl", f = "GameWordListServiceImpl.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {70}, m = "isTrainingSupported", n = {"tag$iv", "bookId", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-GameWordListServiceImpl$isTrainingSupported$2", "$i$f$bizCatch", "$i$a$-bizCatch-GameWordListServiceImpl$isTrainingSupported$2$1"}, s = {"L$0", "I$0", "I$1", "J$0", "I$2", "I$3", "I$4"}, v = 1)
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public int f50988a;

        /* renamed from: b, reason: collision with root package name */
        public int f50989b;

        /* renamed from: c, reason: collision with root package name */
        public int f50990c;

        /* renamed from: d, reason: collision with root package name */
        public int f50991d;

        /* renamed from: e, reason: collision with root package name */
        public int f50992e;

        /* renamed from: f, reason: collision with root package name */
        public Object f50993f;

        /* renamed from: g, reason: collision with root package name */
        public long f50994g;

        /* renamed from: h, reason: collision with root package name */
        public /* synthetic */ Object f50995h;

        /* renamed from: j, reason: collision with root package name */
        public int f50997j;

        public c(j00.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f50995h = obj;
            this.f50997j |= Integer.MIN_VALUE;
            return b.this.H0(0, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.wordlist.GameWordListServiceImpl", f = "GameWordListServiceImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {63, 64}, m = LearnOperationReceiver.f24791b, n = {"topicIds", "tag$iv", "bookId", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-GameWordListServiceImpl$kill$2", "$i$f$bizCatch", "$i$a$-bizCatch-GameWordListServiceImpl$kill$2$1", "curBookId", "topicIds", "tag$iv", "bookId", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-GameWordListServiceImpl$kill$2", "$i$f$bizCatch", "$i$a$-bizCatch-GameWordListServiceImpl$kill$2$1", "curBookId"}, s = {"L$0", "L$1", "I$0", "I$1", "J$0", "I$2", "I$3", "I$4", "J$1", "L$0", "L$1", "I$0", "I$1", "J$0", "I$2", "I$3", "I$4", "J$1"}, v = 1)
    public static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public int f50998a;

        /* renamed from: b, reason: collision with root package name */
        public int f50999b;

        /* renamed from: c, reason: collision with root package name */
        public int f51000c;

        /* renamed from: d, reason: collision with root package name */
        public int f51001d;

        /* renamed from: e, reason: collision with root package name */
        public int f51002e;

        /* renamed from: f, reason: collision with root package name */
        public Object f51003f;

        /* renamed from: g, reason: collision with root package name */
        public Object f51004g;

        /* renamed from: h, reason: collision with root package name */
        public long f51005h;

        /* renamed from: i, reason: collision with root package name */
        public long f51006i;

        /* renamed from: j, reason: collision with root package name */
        public /* synthetic */ Object f51007j;

        /* renamed from: l, reason: collision with root package name */
        public int f51009l;

        public d(j00.c<? super d> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f51007j = obj;
            this.f51009l |= Integer.MIN_VALUE;
            return b.this.t1(0, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.wordlist.GameWordListServiceImpl", f = "GameWordListServiceImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {52, 53}, m = "reLearn", n = {"topicIds", "tag$iv", "bookId", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-GameWordListServiceImpl$reLearn$2", "$i$f$bizCatch", "$i$a$-bizCatch-GameWordListServiceImpl$reLearn$2$1", "curBookId", "topicIds", "tag$iv", "bookId", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-GameWordListServiceImpl$reLearn$2", "$i$f$bizCatch", "$i$a$-bizCatch-GameWordListServiceImpl$reLearn$2$1", "curBookId"}, s = {"L$0", "L$1", "I$0", "I$1", "J$0", "I$2", "I$3", "I$4", "J$1", "L$0", "L$1", "I$0", "I$1", "J$0", "I$2", "I$3", "I$4", "J$1"}, v = 1)
    public static final class e extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public int f51010a;

        /* renamed from: b, reason: collision with root package name */
        public int f51011b;

        /* renamed from: c, reason: collision with root package name */
        public int f51012c;

        /* renamed from: d, reason: collision with root package name */
        public int f51013d;

        /* renamed from: e, reason: collision with root package name */
        public int f51014e;

        /* renamed from: f, reason: collision with root package name */
        public Object f51015f;

        /* renamed from: g, reason: collision with root package name */
        public Object f51016g;

        /* renamed from: h, reason: collision with root package name */
        public long f51017h;

        /* renamed from: i, reason: collision with root package name */
        public long f51018i;

        /* renamed from: j, reason: collision with root package name */
        public /* synthetic */ Object f51019j;

        /* renamed from: l, reason: collision with root package name */
        public int f51021l;

        public e(j00.c<? super e> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f51019j = obj;
            this.f51021l |= Integer.MIN_VALUE;
            return b.this.H1(0, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.wordlist.GameWordListServiceImpl", f = "GameWordListServiceImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {44, 45}, m = "unKill", n = {"topicIds", "tag$iv", "bookId", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-GameWordListServiceImpl$unKill$2", "$i$f$bizCatch", "$i$a$-bizCatch-GameWordListServiceImpl$unKill$2$1", "curBookId", "topicIds", "tag$iv", "bookId", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-GameWordListServiceImpl$unKill$2", "$i$f$bizCatch", "$i$a$-bizCatch-GameWordListServiceImpl$unKill$2$1", "curBookId"}, s = {"L$0", "L$1", "I$0", "I$1", "J$0", "I$2", "I$3", "I$4", "J$1", "L$0", "L$1", "I$0", "I$1", "J$0", "I$2", "I$3", "I$4", "J$1"}, v = 1)
    public static final class f extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public int f51022a;

        /* renamed from: b, reason: collision with root package name */
        public int f51023b;

        /* renamed from: c, reason: collision with root package name */
        public int f51024c;

        /* renamed from: d, reason: collision with root package name */
        public int f51025d;

        /* renamed from: e, reason: collision with root package name */
        public int f51026e;

        /* renamed from: f, reason: collision with root package name */
        public Object f51027f;

        /* renamed from: g, reason: collision with root package name */
        public Object f51028g;

        /* renamed from: h, reason: collision with root package name */
        public long f51029h;

        /* renamed from: i, reason: collision with root package name */
        public long f51030i;

        /* renamed from: j, reason: collision with root package name */
        public /* synthetic */ Object f51031j;

        /* renamed from: l, reason: collision with root package name */
        public int f51033l;

        public f(j00.c<? super f> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f51031j = obj;
            this.f51033l |= Integer.MIN_VALUE;
            return b.this.W0(0, null, this);
        }
    }

    public b(@k g studyRepo, @k com.baicizhan.app.biz.game.repo.roadmap.a roadMapRep, @k e6.g modifyWordStatusUC, @k v6.a checkTrainingSupportUC) {
        g0.p(studyRepo, "studyRepo");
        g0.p(roadMapRep, "roadMapRep");
        g0.p(modifyWordStatusUC, "modifyWordStatusUC");
        g0.p(checkTrainingSupportUC, "checkTrainingSupportUC");
        this.f50967b = studyRepo;
        this.f50968c = roadMapRep;
        this.f50969d = modifyWordStatusUC;
        this.f50970e = checkTrainingSupportUC;
    }

    public static final v0 J(Map map, b bVar, int i11) {
        w2 w2Var = (w2) map.get(Long.valueOf(i11));
        return new v0(i11, w2Var != null ? (int) w2Var.l() : 0, w2Var != null && i.e(w2Var), w2Var != null ? w2Var.m() : 0L, w2Var != null ? (int) w2Var.o() : 0, bVar.v(w2Var));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0068 A[LOOP:0: B:11:0x0062->B:13:0x0068, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object E(java.util.List<java.lang.Integer> r5, long r6, j00.c<? super java.util.List<k3.v0>> r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof f5.b.C0607b
            if (r0 == 0) goto L13
            r0 = r8
            f5.b$b r0 = (f5.b.C0607b) r0
            int r1 = r0.f50987e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f50987e = r1
            goto L18
        L13:
            f5.b$b r0 = new f5.b$b
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f50985c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f50987e
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f50983a
            java.util.List r5 = (java.util.List) r5
            kotlin.e.n(r8)
            goto L47
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.e.n(r8)
            z5.g r8 = r4.f50967b
            r0.f50983a = r5
            r0.f50984b = r6
            r0.f50987e = r3
            java.lang.Object r8 = r8.g(r6, r0)
            if (r8 != r1) goto L47
            return r1
        L47:
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            r6 = 10
            int r6 = a00.i0.d0(r8, r6)
            int r6 = a00.k1.j(r6)
            r7 = 16
            int r6 = g10.u.u(r6, r7)
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
            r7.<init>(r6)
            java.util.Iterator r6 = r8.iterator()
        L62:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L7b
            java.lang.Object r8 = r6.next()
            r0 = r8
            f4.w2 r0 = (f4.w2) r0
            long r0 = r0.q()
            java.lang.Long r0 = l00.a.g(r0)
            r7.put(r0, r8)
            goto L62
        L7b:
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            q30.m r5 = a00.r0.E1(r5)
            f5.a r6 = new f5.a
            r6.<init>()
            q30.m r5 = q30.k0.N1(r5, r6)
            java.util.List r5 = q30.k0.I3(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: f5.b.E(java.util.List, long, j00.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bd A[Catch: all -> 0x00ac, TryCatch #2 {all -> 0x00ac, blocks: (B:14:0x0071, B:23:0x00b6, B:25:0x00bd, B:27:0x00c1, B:29:0x00c5, B:31:0x00c9, B:33:0x00cd, B:44:0x0131, B:35:0x00d5, B:37:0x00e0, B:39:0x00f4, B:41:0x0108, B:43:0x011d), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011d A[Catch: all -> 0x00ac, TryCatch #2 {all -> 0x00ac, blocks: (B:14:0x0071, B:23:0x00b6, B:25:0x00bd, B:27:0x00c1, B:29:0x00c5, B:31:0x00c9, B:33:0x00cd, B:44:0x0131, B:35:0x00d5, B:37:0x00e0, B:39:0x00f4, B:41:0x0108, B:43:0x011d), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, long] */
    @Override // k3.w0
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object H0(int r11, @m80.k j00.c<? super java.lang.Boolean> r12) throws com.baicizhan.app.api.service.BizException, java.util.concurrent.CancellationException {
        /*
            Method dump skipped, instructions count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f5.b.H0(int, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x013e A[Catch: all -> 0x0156, TryCatch #2 {all -> 0x0156, blocks: (B:22:0x0137, B:24:0x013e, B:26:0x0142, B:28:0x0146, B:30:0x014a, B:32:0x014e, B:43:0x01b4, B:34:0x0158, B:36:0x0163, B:38:0x0177, B:40:0x018b, B:42:0x01a0), top: B:21:0x0137 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01a0 A[Catch: all -> 0x0156, TryCatch #2 {all -> 0x0156, blocks: (B:22:0x0137, B:24:0x013e, B:26:0x0142, B:28:0x0146, B:30:0x014a, B:32:0x014e, B:43:0x01b4, B:34:0x0158, B:36:0x0163, B:38:0x0177, B:40:0x018b, B:42:0x01a0), top: B:21:0x0137 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    @Override // k3.w0
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object H1(int r17, @m80.k java.util.List<java.lang.Integer> r18, @m80.k j00.c<? super java.util.List<k3.v0>> r19) throws com.baicizhan.app.api.service.BizException, java.util.concurrent.CancellationException {
        /*
            Method dump skipped, instructions count: 491
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f5.b.H1(int, java.util.List, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x013e A[Catch: all -> 0x0156, TryCatch #2 {all -> 0x0156, blocks: (B:22:0x0137, B:24:0x013e, B:26:0x0142, B:28:0x0146, B:30:0x014a, B:32:0x014e, B:43:0x01b4, B:34:0x0158, B:36:0x0163, B:38:0x0177, B:40:0x018b, B:42:0x01a0), top: B:21:0x0137 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01a0 A[Catch: all -> 0x0156, TryCatch #2 {all -> 0x0156, blocks: (B:22:0x0137, B:24:0x013e, B:26:0x0142, B:28:0x0146, B:30:0x014a, B:32:0x014e, B:43:0x01b4, B:34:0x0158, B:36:0x0163, B:38:0x0177, B:40:0x018b, B:42:0x01a0), top: B:21:0x0137 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    @Override // k3.w0
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object W0(int r17, @m80.k java.util.List<java.lang.Integer> r18, @m80.k j00.c<? super java.util.List<k3.v0>> r19) throws com.baicizhan.app.api.service.BizException, java.util.concurrent.CancellationException {
        /*
            Method dump skipped, instructions count: 491
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f5.b.W0(int, java.util.List, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x013e A[Catch: all -> 0x0156, TryCatch #2 {all -> 0x0156, blocks: (B:22:0x0137, B:24:0x013e, B:26:0x0142, B:28:0x0146, B:30:0x014a, B:32:0x014e, B:43:0x01b4, B:34:0x0158, B:36:0x0163, B:38:0x0177, B:40:0x018b, B:42:0x01a0), top: B:21:0x0137 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01a0 A[Catch: all -> 0x0156, TryCatch #2 {all -> 0x0156, blocks: (B:22:0x0137, B:24:0x013e, B:26:0x0142, B:28:0x0146, B:30:0x014a, B:32:0x014e, B:43:0x01b4, B:34:0x0158, B:36:0x0163, B:38:0x0177, B:40:0x018b, B:42:0x01a0), top: B:21:0x0137 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    @Override // k3.w0
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object t1(int r17, @m80.k java.util.List<java.lang.Integer> r18, @m80.k j00.c<? super java.util.List<k3.v0>> r19) throws com.baicizhan.app.api.service.BizException, java.util.concurrent.CancellationException {
        /*
            Method dump skipped, instructions count: 491
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f5.b.t1(int, java.util.List, j00.c):java.lang.Object");
    }

    public final int v(w2 w2Var) {
        long l11 = w3.g.l();
        if (w2Var == null) {
            return 3;
        }
        if (i.r(w2Var) && !i.e(w2Var)) {
            return 3;
        }
        if (i.p(w2Var, l11) && !i.j(w2Var)) {
            return 1;
        }
        if (i.q(w2Var, l11)) {
            return 2;
        }
        if (i.e(w2Var)) {
            return 6;
        }
        return i.f(w2Var) ? 5 : 4;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x010c A[Catch: all -> 0x0124, TryCatch #1 {all -> 0x0124, blocks: (B:22:0x0105, B:24:0x010c, B:26:0x0110, B:28:0x0114, B:30:0x0118, B:32:0x011c, B:43:0x0182, B:34:0x0126, B:36:0x0131, B:38:0x0145, B:40:0x0159, B:42:0x016e), top: B:21:0x0105 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x016e A[Catch: all -> 0x0124, TryCatch #1 {all -> 0x0124, blocks: (B:22:0x0105, B:24:0x010c, B:26:0x0110, B:28:0x0114, B:30:0x0118, B:32:0x011c, B:43:0x0182, B:34:0x0126, B:36:0x0131, B:38:0x0145, B:40:0x0159, B:42:0x016e), top: B:21:0x0105 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    @Override // k3.w0
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object y1(int r20, @m80.k j00.c<? super java.util.List<k3.v0>> r21) throws com.baicizhan.app.api.service.BizException, java.util.concurrent.CancellationException {
        /*
            Method dump skipped, instructions count: 441
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f5.b.y1(int, j00.c):java.lang.Object");
    }
}

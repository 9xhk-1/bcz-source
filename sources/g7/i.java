package g7;

import k3.c3;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import oa0.r;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r(binds = {c3.class})
@u0({"SMAP\nStudyServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StudyServiceImpl.kt\ncom/baicizhan/app/biz/study/StudyServiceImpl\n+ 2 TimeMeasurer.kt\ncom/baicizhan/app/biz/base/TimeMeasurerKt\n+ 3 BizCatch.kt\ncom/baicizhan/app/biz/base/BizCatchKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,36:1\n12#2,3:37\n15#2,10:58\n12#3,2:40\n14#3,10:48\n1563#4:42\n1634#4,3:43\n37#5,2:46\n*S KotlinDebug\n*F\n+ 1 StudyServiceImpl.kt\ncom/baicizhan/app/biz/study/StudyServiceImpl\n*L\n-1#1:37,3\n-1#1:58,10\n-1#1:40,2\n-1#1:48,10\n21#1:42\n21#1:43,3\n23#1:46,2\n*E\n"})
/* loaded from: classes3.dex */
public final class i implements c3 {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final f f53109b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final c f53110c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.study.StudyServiceImpl", f = "StudyServiceImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 0}, l = {29}, m = "getAchievement", n = {"tag$iv", "$this$getAchievement_u240", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-StudyServiceImpl$getAchievement$2", "$i$f$bizCatch", "$i$a$-bizCatch-StudyServiceImpl$getAchievement$2$1", "$i$a$-run-StudyServiceImpl$getAchievement$2$1$1"}, s = {"L$0", "L$1", "I$0", "J$0", "I$1", "I$2", "I$3", "I$4"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f53111a;

        /* renamed from: b, reason: collision with root package name */
        public Object f53112b;

        /* renamed from: c, reason: collision with root package name */
        public int f53113c;

        /* renamed from: d, reason: collision with root package name */
        public int f53114d;

        /* renamed from: e, reason: collision with root package name */
        public int f53115e;

        /* renamed from: f, reason: collision with root package name */
        public int f53116f;

        /* renamed from: g, reason: collision with root package name */
        public int f53117g;

        /* renamed from: h, reason: collision with root package name */
        public long f53118h;

        /* renamed from: i, reason: collision with root package name */
        public /* synthetic */ Object f53119i;

        /* renamed from: k, reason: collision with root package name */
        public int f53121k;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f53119i = obj;
            this.f53121k |= Integer.MIN_VALUE;
            return i.this.h0(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.study.StudyServiceImpl", f = "StudyServiceImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 0}, l = {21}, m = "goldenPosition", n = {"tag$iv", "$this$goldenPosition_u240", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-StudyServiceImpl$goldenPosition$2", "$i$f$bizCatch", "$i$a$-bizCatch-StudyServiceImpl$goldenPosition$2$1", "$i$a$-run-StudyServiceImpl$goldenPosition$2$1$1"}, s = {"L$0", "L$1", "I$0", "J$0", "I$1", "I$2", "I$3", "I$4"}, v = 1)
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f53122a;

        /* renamed from: b, reason: collision with root package name */
        public Object f53123b;

        /* renamed from: c, reason: collision with root package name */
        public int f53124c;

        /* renamed from: d, reason: collision with root package name */
        public int f53125d;

        /* renamed from: e, reason: collision with root package name */
        public int f53126e;

        /* renamed from: f, reason: collision with root package name */
        public int f53127f;

        /* renamed from: g, reason: collision with root package name */
        public int f53128g;

        /* renamed from: h, reason: collision with root package name */
        public long f53129h;

        /* renamed from: i, reason: collision with root package name */
        public /* synthetic */ Object f53130i;

        /* renamed from: k, reason: collision with root package name */
        public int f53132k;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f53130i = obj;
            this.f53132k |= Integer.MIN_VALUE;
            return i.this.c0(this);
        }
    }

    public i(@m80.k f trainRepo, @m80.k c achievementRepo) {
        g0.p(trainRepo, "trainRepo");
        g0.p(achievementRepo, "achievementRepo");
        this.f53109b = trainRepo;
        this.f53110c = achievementRepo;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008b A[Catch: all -> 0x0037, LOOP:0: B:13:0x0085->B:15:0x008b, LOOP_END, TryCatch #1 {all -> 0x0037, blocks: (B:11:0x0033, B:12:0x0074, B:13:0x0085, B:15:0x008b, B:17:0x0099), top: B:10:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e8 A[Catch: all -> 0x0100, TryCatch #0 {all -> 0x0100, blocks: (B:27:0x00e1, B:29:0x00e8, B:31:0x00ec, B:33:0x00f0, B:35:0x00f4, B:37:0x00f8, B:48:0x015f, B:39:0x0103, B:41:0x010e, B:43:0x0122, B:45:0x0136, B:47:0x014b), top: B:26:0x00e1 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x014b A[Catch: all -> 0x0100, TryCatch #0 {all -> 0x0100, blocks: (B:27:0x00e1, B:29:0x00e8, B:31:0x00ec, B:33:0x00f0, B:35:0x00f4, B:37:0x00f8, B:48:0x015f, B:39:0x0103, B:41:0x010e, B:43:0x0122, B:45:0x0136, B:47:0x014b), top: B:26:0x00e1 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // k3.c3
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c0(@m80.k j00.c<? super k3.z0> r12) {
        /*
            Method dump skipped, instructions count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g7.i.c0(j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bc A[Catch: all -> 0x00d4, TryCatch #1 {all -> 0x00d4, blocks: (B:22:0x00b5, B:24:0x00bc, B:26:0x00c0, B:28:0x00c4, B:30:0x00c8, B:32:0x00cc, B:43:0x0133, B:34:0x00d7, B:36:0x00e2, B:38:0x00f6, B:40:0x010a, B:42:0x011f), top: B:21:0x00b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011f A[Catch: all -> 0x00d4, TryCatch #1 {all -> 0x00d4, blocks: (B:22:0x00b5, B:24:0x00bc, B:26:0x00c0, B:28:0x00c4, B:30:0x00c8, B:32:0x00cc, B:43:0x0133, B:34:0x00d7, B:36:0x00e2, B:38:0x00f6, B:40:0x010a, B:42:0x011f), top: B:21:0x00b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // k3.c3
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object h0(@m80.k j00.c<? super k3.b> r12) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g7.i.h0(j00.c):java.lang.Object");
    }
}

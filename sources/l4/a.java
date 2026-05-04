package l4;

import com.baicizhan.app.biz.game.uc.schedule.g;
import com.baicizhan.app.biz.game.uc.schedule.h;
import com.baicizhan.app.biz.game.uc.schedule.j;
import k3.r0;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import oa0.r;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r(binds = {r0.class})
@u0({"SMAP\nGameScheduleServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameScheduleServiceImpl.kt\ncom/baicizhan/app/biz/game/impl/gameschedule/GameScheduleServiceImpl\n+ 2 TimeMeasurer.kt\ncom/baicizhan/app/biz/base/TimeMeasurerKt\n+ 3 BizCatch.kt\ncom/baicizhan/app/biz/base/BizCatchKt\n*L\n1#1,54:1\n12#2,3:55\n15#2,10:70\n12#3,12:58\n*S KotlinDebug\n*F\n+ 1 GameScheduleServiceImpl.kt\ncom/baicizhan/app/biz/game/impl/gameschedule/GameScheduleServiceImpl\n*L\n-1#1:55,3\n-1#1:70,10\n-1#1:58,12\n*E\n"})
/* loaded from: classes3.dex */
public final class a implements r0 {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g f69850b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.baicizhan.app.biz.game.uc.schedule.a f69851c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.baicizhan.app.biz.game.uc.schedule.c f69852d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final h f69853e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final j f69854f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.gameschedule.GameScheduleServiceImpl", f = "GameScheduleServiceImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 0}, l = {34}, m = "changeSchedule", n = {"tag$iv", "bookId", "group", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-GameScheduleServiceImpl$changeSchedule$2", "$i$f$bizCatch", "$i$a$-bizCatch-GameScheduleServiceImpl$changeSchedule$2$1"}, s = {"L$0", "I$0", "I$1", "I$2", "J$0", "I$3", "I$4", "I$5"}, v = 1)
    /* renamed from: l4.a$a, reason: collision with other inner class name */
    public static final class C0840a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public int f69855a;

        /* renamed from: b, reason: collision with root package name */
        public int f69856b;

        /* renamed from: c, reason: collision with root package name */
        public int f69857c;

        /* renamed from: d, reason: collision with root package name */
        public int f69858d;

        /* renamed from: e, reason: collision with root package name */
        public int f69859e;

        /* renamed from: f, reason: collision with root package name */
        public int f69860f;

        /* renamed from: g, reason: collision with root package name */
        public Object f69861g;

        /* renamed from: h, reason: collision with root package name */
        public long f69862h;

        /* renamed from: i, reason: collision with root package name */
        public /* synthetic */ Object f69863i;

        /* renamed from: k, reason: collision with root package name */
        public int f69865k;

        public C0840a(j00.c<? super C0840a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f69863i = obj;
            this.f69865k |= Integer.MIN_VALUE;
            return a.this.C(0, 0, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.gameschedule.GameScheduleServiceImpl", f = "GameScheduleServiceImpl.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {46}, m = "deleteSchedule", n = {"tag$iv", "bookId", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-GameScheduleServiceImpl$deleteSchedule$2", "$i$f$bizCatch", "$i$a$-bizCatch-GameScheduleServiceImpl$deleteSchedule$2$1"}, s = {"L$0", "I$0", "I$1", "J$0", "I$2", "I$3", "I$4"}, v = 1)
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public int f69866a;

        /* renamed from: b, reason: collision with root package name */
        public int f69867b;

        /* renamed from: c, reason: collision with root package name */
        public int f69868c;

        /* renamed from: d, reason: collision with root package name */
        public int f69869d;

        /* renamed from: e, reason: collision with root package name */
        public int f69870e;

        /* renamed from: f, reason: collision with root package name */
        public Object f69871f;

        /* renamed from: g, reason: collision with root package name */
        public long f69872g;

        /* renamed from: h, reason: collision with root package name */
        public /* synthetic */ Object f69873h;

        /* renamed from: j, reason: collision with root package name */
        public int f69875j;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f69873h = obj;
            this.f69875j |= Integer.MIN_VALUE;
            return a.this.b(0, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.gameschedule.GameScheduleServiceImpl", f = "GameScheduleServiceImpl.kt", i = {0, 0, 0, 0, 0, 0}, l = {28}, m = "getCurrentSchedule", n = {"tag$iv", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-GameScheduleServiceImpl$getCurrentSchedule$2", "$i$f$bizCatch", "$i$a$-bizCatch-GameScheduleServiceImpl$getCurrentSchedule$2$1"}, s = {"L$0", "I$0", "J$0", "I$1", "I$2", "I$3"}, v = 1)
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f69876a;

        /* renamed from: b, reason: collision with root package name */
        public int f69877b;

        /* renamed from: c, reason: collision with root package name */
        public int f69878c;

        /* renamed from: d, reason: collision with root package name */
        public int f69879d;

        /* renamed from: e, reason: collision with root package name */
        public int f69880e;

        /* renamed from: f, reason: collision with root package name */
        public long f69881f;

        /* renamed from: g, reason: collision with root package name */
        public /* synthetic */ Object f69882g;

        /* renamed from: i, reason: collision with root package name */
        public int f69884i;

        public c(j00.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f69882g = obj;
            this.f69884i |= Integer.MIN_VALUE;
            return a.this.t(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.gameschedule.GameScheduleServiceImpl", f = "GameScheduleServiceImpl.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {52}, m = "resetSchedule", n = {"tag$iv", "bookId", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-GameScheduleServiceImpl$resetSchedule$2", "$i$f$bizCatch", "$i$a$-bizCatch-GameScheduleServiceImpl$resetSchedule$2$1"}, s = {"L$0", "I$0", "I$1", "J$0", "I$2", "I$3", "I$4"}, v = 1)
    public static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public int f69885a;

        /* renamed from: b, reason: collision with root package name */
        public int f69886b;

        /* renamed from: c, reason: collision with root package name */
        public int f69887c;

        /* renamed from: d, reason: collision with root package name */
        public int f69888d;

        /* renamed from: e, reason: collision with root package name */
        public int f69889e;

        /* renamed from: f, reason: collision with root package name */
        public Object f69890f;

        /* renamed from: g, reason: collision with root package name */
        public long f69891g;

        /* renamed from: h, reason: collision with root package name */
        public /* synthetic */ Object f69892h;

        /* renamed from: j, reason: collision with root package name */
        public int f69894j;

        public d(j00.c<? super d> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f69892h = obj;
            this.f69894j |= Integer.MIN_VALUE;
            return a.this.n(0, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.gameschedule.GameScheduleServiceImpl", f = "GameScheduleServiceImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 0}, l = {40}, m = "selectNewSchedule", n = {"tag$iv", "bookId", "group", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-GameScheduleServiceImpl$selectNewSchedule$2", "$i$f$bizCatch", "$i$a$-bizCatch-GameScheduleServiceImpl$selectNewSchedule$2$1"}, s = {"L$0", "I$0", "I$1", "I$2", "J$0", "I$3", "I$4", "I$5"}, v = 1)
    public static final class e extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public int f69895a;

        /* renamed from: b, reason: collision with root package name */
        public int f69896b;

        /* renamed from: c, reason: collision with root package name */
        public int f69897c;

        /* renamed from: d, reason: collision with root package name */
        public int f69898d;

        /* renamed from: e, reason: collision with root package name */
        public int f69899e;

        /* renamed from: f, reason: collision with root package name */
        public int f69900f;

        /* renamed from: g, reason: collision with root package name */
        public Object f69901g;

        /* renamed from: h, reason: collision with root package name */
        public long f69902h;

        /* renamed from: i, reason: collision with root package name */
        public /* synthetic */ Object f69903i;

        /* renamed from: k, reason: collision with root package name */
        public int f69905k;

        public e(j00.c<? super e> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f69903i = obj;
            this.f69905k |= Integer.MIN_VALUE;
            return a.this.J0(0, 0, this);
        }
    }

    public a(@k g getCurrentScheduleUC, @k com.baicizhan.app.biz.game.uc.schedule.a changeScheduleUC, @k com.baicizhan.app.biz.game.uc.schedule.c deleteScheduleUC, @k h resetScheduleUC, @k j selectNewScheduleUC) {
        g0.p(getCurrentScheduleUC, "getCurrentScheduleUC");
        g0.p(changeScheduleUC, "changeScheduleUC");
        g0.p(deleteScheduleUC, "deleteScheduleUC");
        g0.p(resetScheduleUC, "resetScheduleUC");
        g0.p(selectNewScheduleUC, "selectNewScheduleUC");
        this.f69850b = getCurrentScheduleUC;
        this.f69851c = changeScheduleUC;
        this.f69852d = deleteScheduleUC;
        this.f69853e = resetScheduleUC;
        this.f69854f = selectNewScheduleUC;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b1 A[Catch: all -> 0x00c9, TryCatch #2 {all -> 0x00c9, blocks: (B:22:0x00aa, B:24:0x00b1, B:26:0x00b5, B:28:0x00b9, B:30:0x00bd, B:32:0x00c1, B:43:0x0128, B:34:0x00cc, B:36:0x00d7, B:38:0x00eb, B:40:0x00ff, B:42:0x0114), top: B:21:0x00aa }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0114 A[Catch: all -> 0x00c9, TryCatch #2 {all -> 0x00c9, blocks: (B:22:0x00aa, B:24:0x00b1, B:26:0x00b5, B:28:0x00b9, B:30:0x00bd, B:32:0x00c1, B:43:0x0128, B:34:0x00cc, B:36:0x00d7, B:38:0x00eb, B:40:0x00ff, B:42:0x0114), top: B:21:0x00aa }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // k3.r0
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object C(int r11, int r12, @m80.k j00.c<? super yz.g2> r13) throws com.baicizhan.app.api.service.BizException, java.util.concurrent.CancellationException {
        /*
            Method dump skipped, instructions count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l4.a.C(int, int, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b1 A[Catch: all -> 0x00c9, TryCatch #2 {all -> 0x00c9, blocks: (B:22:0x00aa, B:24:0x00b1, B:26:0x00b5, B:28:0x00b9, B:30:0x00bd, B:32:0x00c1, B:43:0x0128, B:34:0x00cc, B:36:0x00d7, B:38:0x00eb, B:40:0x00ff, B:42:0x0114), top: B:21:0x00aa }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0114 A[Catch: all -> 0x00c9, TryCatch #2 {all -> 0x00c9, blocks: (B:22:0x00aa, B:24:0x00b1, B:26:0x00b5, B:28:0x00b9, B:30:0x00bd, B:32:0x00c1, B:43:0x0128, B:34:0x00cc, B:36:0x00d7, B:38:0x00eb, B:40:0x00ff, B:42:0x0114), top: B:21:0x00aa }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // k3.r0
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object J0(int r11, int r12, @m80.k j00.c<? super yz.g2> r13) throws com.baicizhan.app.api.service.BizException, java.util.concurrent.CancellationException {
        /*
            Method dump skipped, instructions count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l4.a.J0(int, int, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00af A[Catch: all -> 0x00c7, TryCatch #2 {all -> 0x00c7, blocks: (B:22:0x00a8, B:24:0x00af, B:26:0x00b3, B:28:0x00b7, B:30:0x00bb, B:32:0x00bf, B:43:0x0126, B:34:0x00ca, B:36:0x00d5, B:38:0x00e9, B:40:0x00fd, B:42:0x0112), top: B:21:0x00a8 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0112 A[Catch: all -> 0x00c7, TryCatch #2 {all -> 0x00c7, blocks: (B:22:0x00a8, B:24:0x00af, B:26:0x00b3, B:28:0x00b7, B:30:0x00bb, B:32:0x00bf, B:43:0x0126, B:34:0x00ca, B:36:0x00d5, B:38:0x00e9, B:40:0x00fd, B:42:0x0112), top: B:21:0x00a8 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // k3.r0
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(int r11, @m80.k j00.c<? super yz.g2> r12) throws com.baicizhan.app.api.service.BizException, java.util.concurrent.CancellationException {
        /*
            Method dump skipped, instructions count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l4.a.b(int, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00af A[Catch: all -> 0x00c7, TryCatch #2 {all -> 0x00c7, blocks: (B:22:0x00a8, B:24:0x00af, B:26:0x00b3, B:28:0x00b7, B:30:0x00bb, B:32:0x00bf, B:43:0x0126, B:34:0x00ca, B:36:0x00d5, B:38:0x00e9, B:40:0x00fd, B:42:0x0112), top: B:21:0x00a8 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0112 A[Catch: all -> 0x00c7, TryCatch #2 {all -> 0x00c7, blocks: (B:22:0x00a8, B:24:0x00af, B:26:0x00b3, B:28:0x00b7, B:30:0x00bb, B:32:0x00bf, B:43:0x0126, B:34:0x00ca, B:36:0x00d5, B:38:0x00e9, B:40:0x00fd, B:42:0x0112), top: B:21:0x00a8 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // k3.r0
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object n(int r11, @m80.k j00.c<? super yz.g2> r12) throws com.baicizhan.app.api.service.BizException, java.util.concurrent.CancellationException {
        /*
            Method dump skipped, instructions count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l4.a.n(int, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ac A[Catch: all -> 0x00c4, TryCatch #2 {all -> 0x00c4, blocks: (B:22:0x00a5, B:24:0x00ac, B:26:0x00b0, B:28:0x00b4, B:30:0x00b8, B:32:0x00bc, B:43:0x0123, B:34:0x00c7, B:36:0x00d2, B:38:0x00e6, B:40:0x00fa, B:42:0x010f), top: B:21:0x00a5 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010f A[Catch: all -> 0x00c4, TryCatch #2 {all -> 0x00c4, blocks: (B:22:0x00a5, B:24:0x00ac, B:26:0x00b0, B:28:0x00b4, B:30:0x00b8, B:32:0x00bc, B:43:0x0123, B:34:0x00c7, B:36:0x00d2, B:38:0x00e6, B:40:0x00fa, B:42:0x010f), top: B:21:0x00a5 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // k3.r0
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object t(@m80.k j00.c<? super k3.q0> r12) throws com.baicizhan.app.api.service.BizException, java.util.concurrent.CancellationException {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l4.a.t(j00.c):java.lang.Object");
    }
}

package r4;

import com.baicizhan.app.biz.game.model.RoundType;
import com.baicizhan.app.biz.game.uc.incentive.t;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.igexin.assist.sdk.AssistPushConsts;
import com.jiongji.andriod.card.R;
import io.ktor.server.routing.RoutingBuilderKt;
import io.ktor.server.routing.c1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import l6.x;
import o6.f0;
import o6.p;
import oa0.r;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r
@u0({"SMAP\nAiStudyRouteProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AiStudyRouteProvider.kt\ncom/baicizhan/app/biz/game/impl/h5enhance/study/AiStudyRouteProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,220:1\n1#2:221\n*E\n"})
/* loaded from: classes3.dex */
public final class c implements q4.h {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final x f82918a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final l6.d f82919b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.game.repo.gameround.e f82920c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final t f82921d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final f0 f82922e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final o6.a f82923f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final o6.t f82924g;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public final p f82925h;

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public final l6.p f82926i;

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public final n6.g f82927j;

    /* renamed from: k, reason: collision with root package name */
    @m80.k
    public final n6.a f82928k;

    /* renamed from: l, reason: collision with root package name */
    @m80.k
    public final c6.b f82929l;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f82930a;

        static {
            int[] iArr = new int[RoundType.values().length];
            try {
                iArr[RoundType.AI_LEADS_U.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RoundType.AI_LEADS_U_R.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f82930a = iArr;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.h5enhance.study.AiStudyRouteProvider$provideRoutes$1$1", f = "AiStudyRouteProvider.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2}, l = {70, 71, R.styleable.Theme_drawable_share_close}, m = "invokeSuspend", n = {"$this$post", "$this$bczRsp$iv", "$completion", "gameType", "$this$invokeSuspend_u24lambda_u240_u241", RemoteMessageConst.MessageBody.PARAM, "$i$f$bczRsp", "$i$f$h5RspWrap", "$i$a$-bczRsp-AiStudyRouteProvider$provideRoutes$1$1$1", "$i$a$-runCatching-AiStudyRouteProvider$provideRoutes$1$1$1$game$1", "$this$post", "$this$bczRsp$iv", "$completion", "gameType", q9.h.f81954r, RemoteMessageConst.MessageBody.PARAM, "$i$f$bczRsp", "$i$f$h5RspWrap", "$i$a$-bczRsp-AiStudyRouteProvider$provideRoutes$1$1$1", "$this$post", "$this$bczRsp$iv", "$i$f$bczRsp"}, s = {"L$0", "L$1", "L$4", "L$5", "L$6", "L$7", "I$0", "I$1", "I$3", "I$4", "L$0", "L$1", "L$3", "L$4", "L$5", "L$6", "I$0", "I$1", "I$3", "L$0", "L$1", "I$0"}, v = 1)
    @u0({"SMAP\nAiStudyRouteProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AiStudyRouteProvider.kt\ncom/baicizhan/app/biz/game/impl/h5enhance/study/AiStudyRouteProvider$provideRoutes$1$1\n+ 2 BczParamExt.kt\ncom/baicizhan/app/biz/game/impl/h5enhance/base/BczParamExtKt\n+ 3 Json.kt\nkotlinx/serialization/json/Json\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,220:1\n32#2,12:221\n23#2,3:233\n26#2,2:237\n45#2,15:240\n147#3:236\n1#4:239\n58#5,16:255\n*S KotlinDebug\n*F\n+ 1 AiStudyRouteProvider.kt\ncom/baicizhan/app/biz/game/impl/h5enhance/study/AiStudyRouteProvider$provideRoutes$1$1\n*L\n64#1:221,12\n65#1:233,3\n65#1:237,2\n64#1:240,15\n65#1:236\n64#1:255,16\n*E\n"})
    public static final class b extends SuspendLambda implements x00.p<c1, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f82931a;

        /* renamed from: b, reason: collision with root package name */
        public Object f82932b;

        /* renamed from: c, reason: collision with root package name */
        public Object f82933c;

        /* renamed from: d, reason: collision with root package name */
        public Object f82934d;

        /* renamed from: e, reason: collision with root package name */
        public Object f82935e;

        /* renamed from: f, reason: collision with root package name */
        public Object f82936f;

        /* renamed from: g, reason: collision with root package name */
        public Object f82937g;

        /* renamed from: h, reason: collision with root package name */
        public int f82938h;

        /* renamed from: i, reason: collision with root package name */
        public int f82939i;

        /* renamed from: j, reason: collision with root package name */
        public int f82940j;

        /* renamed from: k, reason: collision with root package name */
        public int f82941k;

        /* renamed from: l, reason: collision with root package name */
        public int f82942l;

        /* renamed from: m, reason: collision with root package name */
        public int f82943m;

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f82944n;

        public b(j00.c<? super b> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            b bVar = c.this.new b(cVar);
            bVar.f82944n = obj;
            return bVar;
        }

        @Override // x00.p
        public final Object invoke(c1 c1Var, j00.c<? super g2> cVar) {
            return ((b) create(c1Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(1:(1:(1:(3:6|7|8)(2:10|11))(13:12|13|14|15|16|17|18|19|20|21|22|23|24))(4:53|54|55|56))(13:86|87|88|89|90|91|(1:93)(1:104)|(1:95)|96|97|98|(1:100)|26)|57|58|59|60|61|(1:63)|64|(3:66|(10:68|16|17|18|19|20|21|22|23|24)|26)(8:70|18|19|20|21|22|23|24)|(1:(0))) */
        /* JADX WARN: Can't wrap try/catch for region: R(7:12|(7:13|14|15|16|17|18|19)|20|21|22|23|24) */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x02b2, code lost:
        
            if (r6.E(r0, r9, r25) != r3) goto L93;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x028a, code lost:
        
            r4 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:71:0x01dc, code lost:
        
            r0 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:72:0x01dd, code lost:
        
            r5 = r9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:74:0x0155, code lost:
        
            r0 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:75:0x0156, code lost:
        
            r24 = r8;
            r8 = r6;
            r6 = r14;
            r14 = r13;
            r13 = r12;
            r12 = r11;
            r11 = r24;
            r24 = r10;
            r10 = r9;
         */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0210  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x022f  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x0189  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x018e A[Catch: all -> 0x01dc, TRY_LEAVE, TryCatch #8 {all -> 0x01dc, blocks: (B:61:0x0183, B:64:0x018a, B:66:0x018e), top: B:60:0x0183 }] */
        /* JADX WARN: Removed duplicated region for block: B:70:0x01df  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r26) {
            /*
                Method dump skipped, instructions count: 696
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: r4.c.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.h5enhance.study.AiStudyRouteProvider$provideRoutes$1$2", f = "AiStudyRouteProvider.kt", i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2}, l = {79, 85, R.styleable.Theme_drawable_share_close}, m = "invokeSuspend", n = {"$this$post", "$this$bczRsp$iv", "$completion", RemoteMessageConst.MessageBody.PARAM, "$i$f$bczRsp", "$i$f$h5RspWrap", "$i$a$-bczRsp-AiStudyRouteProvider$provideRoutes$1$2$1", "$this$post", "$this$bczRsp$iv", "$completion", RemoteMessageConst.MessageBody.PARAM, "$i$f$bczRsp", "$i$f$h5RspWrap", "$i$a$-bczRsp-AiStudyRouteProvider$provideRoutes$1$2$1", HiAnalyticsConstant.Direction.RESPONSE, "$this$post", "$this$bczRsp$iv", "$i$f$bczRsp"}, s = {"L$0", "L$1", "L$4", "L$5", "I$0", "I$1", "I$3", "L$0", "L$1", "L$3", "L$4", "I$0", "I$1", "I$3", "I$4", "L$0", "L$1", "I$0"}, v = 1)
    @u0({"SMAP\nAiStudyRouteProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AiStudyRouteProvider.kt\ncom/baicizhan/app/biz/game/impl/h5enhance/study/AiStudyRouteProvider$provideRoutes$1$2\n+ 2 BczParamExt.kt\ncom/baicizhan/app/biz/game/impl/h5enhance/base/BczParamExtKt\n+ 3 Json.kt\nkotlinx/serialization/json/Json\n+ 4 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,220:1\n32#2,12:221\n23#2,3:233\n26#2,2:237\n45#2,15:239\n147#3:236\n58#4,16:254\n*S KotlinDebug\n*F\n+ 1 AiStudyRouteProvider.kt\ncom/baicizhan/app/biz/game/impl/h5enhance/study/AiStudyRouteProvider$provideRoutes$1$2\n*L\n77#1:221,12\n78#1:233,3\n78#1:237,2\n77#1:239,15\n78#1:236\n77#1:254,16\n*E\n"})
    /* renamed from: r4.c$c, reason: collision with other inner class name */
    public static final class C1029c extends SuspendLambda implements x00.p<c1, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f82946a;

        /* renamed from: b, reason: collision with root package name */
        public Object f82947b;

        /* renamed from: c, reason: collision with root package name */
        public Object f82948c;

        /* renamed from: d, reason: collision with root package name */
        public Object f82949d;

        /* renamed from: e, reason: collision with root package name */
        public Object f82950e;

        /* renamed from: f, reason: collision with root package name */
        public int f82951f;

        /* renamed from: g, reason: collision with root package name */
        public int f82952g;

        /* renamed from: h, reason: collision with root package name */
        public int f82953h;

        /* renamed from: i, reason: collision with root package name */
        public int f82954i;

        /* renamed from: j, reason: collision with root package name */
        public int f82955j;

        /* renamed from: k, reason: collision with root package name */
        public int f82956k;

        /* renamed from: l, reason: collision with root package name */
        public int f82957l;

        /* renamed from: m, reason: collision with root package name */
        public /* synthetic */ Object f82958m;

        public C1029c(j00.c<? super C1029c> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            C1029c c1029c = c.this.new C1029c(cVar);
            c1029c.f82958m = obj;
            return c1029c;
        }

        @Override // x00.p
        public final Object invoke(c1 c1Var, j00.c<? super g2> cVar) {
            return ((C1029c) create(c1Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(6:12|(4:13|14|15|16)|17|18|19|20) */
        /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(1:(1:(1:(3:6|7|8)(2:10|11))(9:12|13|14|15|16|17|18|19|20))(4:45|46|47|48))(10:59|60|61|62|63|64|65|66|(1:68)|22)|49|50|(6:52|16|17|18|19|20)|22|(2:(0)|(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0243, code lost:
        
            if (r3.E(r14, r6, r24) == r9) goto L68;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0221, code lost:
        
            r0 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x016a, code lost:
        
            r0 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x016b, code lost:
        
            r2 = r3;
            r3 = r15;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0199  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x01bc  */
        /* JADX WARN: Type inference failed for: r4v11, types: [j00.c] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r25) {
            /*
                Method dump skipped, instructions count: 585
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: r4.c.C1029c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.h5enhance.study.AiStudyRouteProvider$provideRoutes$1$3", f = "AiStudyRouteProvider.kt", i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1}, l = {94, R.styleable.Theme_drawable_share_close}, m = "invokeSuspend", n = {"$this$post", "$this$bczRsp$iv", "$completion", RemoteMessageConst.MessageBody.PARAM, "$i$f$bczRsp", "$i$f$h5RspWrap", "$i$a$-bczRsp-AiStudyRouteProvider$provideRoutes$1$3$1", "$this$post", "$this$bczRsp$iv", "$i$f$bczRsp"}, s = {"L$0", "L$1", "L$3", "L$4", "I$0", "I$1", "I$3", "L$0", "L$1", "I$0"}, v = 1)
    @u0({"SMAP\nAiStudyRouteProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AiStudyRouteProvider.kt\ncom/baicizhan/app/biz/game/impl/h5enhance/study/AiStudyRouteProvider$provideRoutes$1$3\n+ 2 BczParamExt.kt\ncom/baicizhan/app/biz/game/impl/h5enhance/base/BczParamExtKt\n+ 3 Json.kt\nkotlinx/serialization/json/Json\n+ 4 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,220:1\n32#2,12:221\n23#2,3:233\n26#2,2:237\n45#2,15:239\n147#3:236\n58#4,16:254\n*S KotlinDebug\n*F\n+ 1 AiStudyRouteProvider.kt\ncom/baicizhan/app/biz/game/impl/h5enhance/study/AiStudyRouteProvider$provideRoutes$1$3\n*L\n92#1:221,12\n93#1:233,3\n93#1:237,2\n92#1:239,15\n93#1:236\n92#1:254,16\n*E\n"})
    public static final class d extends SuspendLambda implements x00.p<c1, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f82960a;

        /* renamed from: b, reason: collision with root package name */
        public Object f82961b;

        /* renamed from: c, reason: collision with root package name */
        public Object f82962c;

        /* renamed from: d, reason: collision with root package name */
        public Object f82963d;

        /* renamed from: e, reason: collision with root package name */
        public int f82964e;

        /* renamed from: f, reason: collision with root package name */
        public int f82965f;

        /* renamed from: g, reason: collision with root package name */
        public int f82966g;

        /* renamed from: h, reason: collision with root package name */
        public int f82967h;

        /* renamed from: i, reason: collision with root package name */
        public int f82968i;

        /* renamed from: j, reason: collision with root package name */
        public /* synthetic */ Object f82969j;

        public d(j00.c<? super d> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            d dVar = c.this.new d(cVar);
            dVar.f82969j = obj;
            return dVar;
        }

        @Override // x00.p
        public final Object invoke(c1 c1Var, j00.c<? super g2> cVar) {
            return ((d) create(c1Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(1:(1:(3:5|6|7)(2:9|10))(4:11|12|13|14))(8:51|52|53|54|55|56|(1:58)|23)|15|16|17|18|19|20|21|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x01ab, code lost:
        
            if (r12.E(r5, r8, r20) != r3) goto L57;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x018b, code lost:
        
            r0 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x00ee, code lost:
        
            r0 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00ef, code lost:
        
            r6 = r11;
            r7 = r12;
            r8 = r13;
         */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0111  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x012f  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r21) {
            /*
                Method dump skipped, instructions count: 433
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: r4.c.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.h5enhance.study.AiStudyRouteProvider$provideRoutes$1$4", f = "AiStudyRouteProvider.kt", i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1}, l = {104, R.styleable.Theme_drawable_share_close}, m = "invokeSuspend", n = {"$this$post", "$this$bczRsp$iv", "$completion", RemoteMessageConst.MessageBody.PARAM, "$i$f$bczRsp", "$i$f$h5RspWrap", "$i$a$-bczRsp-AiStudyRouteProvider$provideRoutes$1$4$1", "$this$post", "$this$bczRsp$iv", "$i$f$bczRsp"}, s = {"L$0", "L$1", "L$3", "L$4", "I$0", "I$1", "I$3", "L$0", "L$1", "I$0"}, v = 1)
    @u0({"SMAP\nAiStudyRouteProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AiStudyRouteProvider.kt\ncom/baicizhan/app/biz/game/impl/h5enhance/study/AiStudyRouteProvider$provideRoutes$1$4\n+ 2 BczParamExt.kt\ncom/baicizhan/app/biz/game/impl/h5enhance/base/BczParamExtKt\n+ 3 Json.kt\nkotlinx/serialization/json/Json\n+ 4 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,220:1\n32#2,12:221\n23#2,3:233\n26#2,2:237\n45#2,15:239\n147#3:236\n58#4,16:254\n*S KotlinDebug\n*F\n+ 1 AiStudyRouteProvider.kt\ncom/baicizhan/app/biz/game/impl/h5enhance/study/AiStudyRouteProvider$provideRoutes$1$4\n*L\n102#1:221,12\n103#1:233,3\n103#1:237,2\n102#1:239,15\n103#1:236\n102#1:254,16\n*E\n"})
    public static final class e extends SuspendLambda implements x00.p<c1, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f82971a;

        /* renamed from: b, reason: collision with root package name */
        public Object f82972b;

        /* renamed from: c, reason: collision with root package name */
        public Object f82973c;

        /* renamed from: d, reason: collision with root package name */
        public Object f82974d;

        /* renamed from: e, reason: collision with root package name */
        public int f82975e;

        /* renamed from: f, reason: collision with root package name */
        public int f82976f;

        /* renamed from: g, reason: collision with root package name */
        public int f82977g;

        /* renamed from: h, reason: collision with root package name */
        public int f82978h;

        /* renamed from: i, reason: collision with root package name */
        public int f82979i;

        /* renamed from: j, reason: collision with root package name */
        public /* synthetic */ Object f82980j;

        public e(j00.c<? super e> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            e eVar = c.this.new e(cVar);
            eVar.f82980j = obj;
            return eVar;
        }

        @Override // x00.p
        public final Object invoke(c1 c1Var, j00.c<? super g2> cVar) {
            return ((e) create(c1Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(1:(1:(3:5|6|7)(2:9|10))(4:11|12|13|14))(8:49|50|51|52|53|54|(1:56)|22)|15|16|17|18|19|20|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x017b, code lost:
        
            if (r7.E(r8, r11, r16) == r3) goto L54;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x015b, code lost:
        
            r0 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x00c3, code lost:
        
            r0 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x00c4, code lost:
        
            r8 = r5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00e4, code lost:
        
            r11 = 100000 + ((com.baicizhan.app.biz.base.BizInternalException) r0).getCode();
            r0 = r0.getMessage();
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00f5, code lost:
        
            if (r0 == null) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00f7, code lost:
        
            r12 = "Unknown error";
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00fa, code lost:
        
            r10 = new s4.c(r11, r12, (java.lang.Object) null, 4, (kotlin.jvm.internal.v) null);
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00f9, code lost:
        
            r12 = r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x0103, code lost:
        
            if ((r0 instanceof com.baicizhan.app.net.exception.NetworkException) != false) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x0105, code lost:
        
            r0 = r0.getMessage();
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x010b, code lost:
        
            if (r0 == null) goto L40;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x010d, code lost:
        
            r12 = "Unknown error";
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x0110, code lost:
        
            r10 = new s4.c(s3.c.f87473e, r12, (java.lang.Object) null, 4, (kotlin.jvm.internal.v) null);
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x010f, code lost:
        
            r12 = r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x011c, code lost:
        
            if ((r0 instanceof com.baicizhan.biz.online.thrift.basic.LogicException) != false) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x011e, code lost:
        
            r0 = r0;
            r10 = new s4.c(s3.c.f87471c + r0.code, r0.message_, (java.lang.Object) null, 4, (kotlin.jvm.internal.v) null);
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x0132, code lost:
        
            r10 = new s4.c(s3.c.f87474f, r0.getMessage(), (java.lang.Object) null, 4, (kotlin.jvm.internal.v) null);
         */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00e4  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0101  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                Method dump skipped, instructions count: 385
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: r4.c.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.h5enhance.study.AiStudyRouteProvider$provideRoutes$1$5", f = "AiStudyRouteProvider.kt", i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1}, l = {112, R.styleable.Theme_drawable_share_close}, m = "invokeSuspend", n = {"$this$post", "$this$bczRsp$iv", "$completion", RemoteMessageConst.MessageBody.PARAM, "$i$f$bczRsp", "$i$f$h5RspWrap", "$i$a$-bczRsp-AiStudyRouteProvider$provideRoutes$1$5$1", "$this$post", "$this$bczRsp$iv", "$i$f$bczRsp"}, s = {"L$0", "L$1", "L$3", "L$4", "I$0", "I$1", "I$3", "L$0", "L$1", "I$0"}, v = 1)
    @u0({"SMAP\nAiStudyRouteProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AiStudyRouteProvider.kt\ncom/baicizhan/app/biz/game/impl/h5enhance/study/AiStudyRouteProvider$provideRoutes$1$5\n+ 2 BczParamExt.kt\ncom/baicizhan/app/biz/game/impl/h5enhance/base/BczParamExtKt\n+ 3 Json.kt\nkotlinx/serialization/json/Json\n+ 4 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,220:1\n32#2,12:221\n23#2,3:233\n26#2,2:237\n45#2,15:239\n147#3:236\n58#4,16:254\n*S KotlinDebug\n*F\n+ 1 AiStudyRouteProvider.kt\ncom/baicizhan/app/biz/game/impl/h5enhance/study/AiStudyRouteProvider$provideRoutes$1$5\n*L\n110#1:221,12\n111#1:233,3\n111#1:237,2\n110#1:239,15\n111#1:236\n110#1:254,16\n*E\n"})
    public static final class f extends SuspendLambda implements x00.p<c1, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f82982a;

        /* renamed from: b, reason: collision with root package name */
        public Object f82983b;

        /* renamed from: c, reason: collision with root package name */
        public Object f82984c;

        /* renamed from: d, reason: collision with root package name */
        public Object f82985d;

        /* renamed from: e, reason: collision with root package name */
        public int f82986e;

        /* renamed from: f, reason: collision with root package name */
        public int f82987f;

        /* renamed from: g, reason: collision with root package name */
        public int f82988g;

        /* renamed from: h, reason: collision with root package name */
        public int f82989h;

        /* renamed from: i, reason: collision with root package name */
        public int f82990i;

        /* renamed from: j, reason: collision with root package name */
        public /* synthetic */ Object f82991j;

        public f(j00.c<? super f> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            f fVar = c.this.new f(cVar);
            fVar.f82991j = obj;
            return fVar;
        }

        @Override // x00.p
        public final Object invoke(c1 c1Var, j00.c<? super g2> cVar) {
            return ((f) create(c1Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(1:(1:(3:5|6|7)(2:9|10))(4:11|12|13|14))(8:51|52|53|54|55|56|(1:58)|23)|15|16|17|18|19|20|21|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0199, code lost:
        
            if (r12.E(r5, r8, r16) != r3) goto L57;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0179, code lost:
        
            r0 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x00dc, code lost:
        
            r0 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00dd, code lost:
        
            r6 = r11;
            r7 = r12;
            r8 = r13;
         */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00ff  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x011d  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                Method dump skipped, instructions count: 415
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: r4.c.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.h5enhance.study.AiStudyRouteProvider$provideRoutes$1$6", f = "AiStudyRouteProvider.kt", i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1}, l = {121, R.styleable.Theme_drawable_share_close}, m = "invokeSuspend", n = {"$this$post", "$this$bczRsp$iv", "$completion", RemoteMessageConst.MessageBody.PARAM, "$i$f$bczRsp", "$i$f$h5RspWrap", "$i$a$-bczRsp-AiStudyRouteProvider$provideRoutes$1$6$1", "$this$post", "$this$bczRsp$iv", "$i$f$bczRsp"}, s = {"L$0", "L$1", "L$3", "L$4", "I$0", "I$1", "I$3", "L$0", "L$1", "I$0"}, v = 1)
    @u0({"SMAP\nAiStudyRouteProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AiStudyRouteProvider.kt\ncom/baicizhan/app/biz/game/impl/h5enhance/study/AiStudyRouteProvider$provideRoutes$1$6\n+ 2 BczParamExt.kt\ncom/baicizhan/app/biz/game/impl/h5enhance/base/BczParamExtKt\n+ 3 Json.kt\nkotlinx/serialization/json/Json\n+ 4 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,220:1\n32#2,12:221\n23#2,3:233\n26#2,2:237\n45#2,15:239\n147#3:236\n58#4,16:254\n*S KotlinDebug\n*F\n+ 1 AiStudyRouteProvider.kt\ncom/baicizhan/app/biz/game/impl/h5enhance/study/AiStudyRouteProvider$provideRoutes$1$6\n*L\n119#1:221,12\n120#1:233,3\n120#1:237,2\n119#1:239,15\n120#1:236\n119#1:254,16\n*E\n"})
    public static final class g extends SuspendLambda implements x00.p<c1, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f82993a;

        /* renamed from: b, reason: collision with root package name */
        public Object f82994b;

        /* renamed from: c, reason: collision with root package name */
        public Object f82995c;

        /* renamed from: d, reason: collision with root package name */
        public Object f82996d;

        /* renamed from: e, reason: collision with root package name */
        public int f82997e;

        /* renamed from: f, reason: collision with root package name */
        public int f82998f;

        /* renamed from: g, reason: collision with root package name */
        public int f82999g;

        /* renamed from: h, reason: collision with root package name */
        public int f83000h;

        /* renamed from: i, reason: collision with root package name */
        public int f83001i;

        /* renamed from: j, reason: collision with root package name */
        public /* synthetic */ Object f83002j;

        public g(j00.c<? super g> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            g gVar = c.this.new g(cVar);
            gVar.f83002j = obj;
            return gVar;
        }

        @Override // x00.p
        public final Object invoke(c1 c1Var, j00.c<? super g2> cVar) {
            return ((g) create(c1Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(1:(1:(3:5|6|7)(2:9|10))(4:11|12|13|14))(8:46|47|48|49|50|51|(1:53)|22)|15|16|17|18|19|20|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x019c, code lost:
        
            if (r2.E(r12, r10, r18) == r7) goto L53;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x017c, code lost:
        
            r0 = null;
         */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00fb  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0119  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r19) {
            /*
                Method dump skipped, instructions count: 418
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: r4.c.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.h5enhance.study.AiStudyRouteProvider$provideRoutes$1$7", f = "AiStudyRouteProvider.kt", i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1}, l = {129, R.styleable.Theme_drawable_share_close}, m = "invokeSuspend", n = {"$this$post", "$this$bczRsp$iv", "$completion", RemoteMessageConst.MessageBody.PARAM, "$i$f$bczRsp", "$i$f$h5RspWrap", "$i$a$-bczRsp-AiStudyRouteProvider$provideRoutes$1$7$1", "$this$post", "$this$bczRsp$iv", "$i$f$bczRsp"}, s = {"L$0", "L$1", "L$3", "L$4", "I$0", "I$1", "I$3", "L$0", "L$1", "I$0"}, v = 1)
    @u0({"SMAP\nAiStudyRouteProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AiStudyRouteProvider.kt\ncom/baicizhan/app/biz/game/impl/h5enhance/study/AiStudyRouteProvider$provideRoutes$1$7\n+ 2 BczParamExt.kt\ncom/baicizhan/app/biz/game/impl/h5enhance/base/BczParamExtKt\n+ 3 Json.kt\nkotlinx/serialization/json/Json\n+ 4 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,220:1\n32#2,12:221\n23#2,3:233\n26#2,2:237\n45#2,15:239\n147#3:236\n58#4,16:254\n*S KotlinDebug\n*F\n+ 1 AiStudyRouteProvider.kt\ncom/baicizhan/app/biz/game/impl/h5enhance/study/AiStudyRouteProvider$provideRoutes$1$7\n*L\n127#1:221,12\n128#1:233,3\n128#1:237,2\n127#1:239,15\n128#1:236\n127#1:254,16\n*E\n"})
    public static final class h extends SuspendLambda implements x00.p<c1, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f83004a;

        /* renamed from: b, reason: collision with root package name */
        public Object f83005b;

        /* renamed from: c, reason: collision with root package name */
        public Object f83006c;

        /* renamed from: d, reason: collision with root package name */
        public Object f83007d;

        /* renamed from: e, reason: collision with root package name */
        public int f83008e;

        /* renamed from: f, reason: collision with root package name */
        public int f83009f;

        /* renamed from: g, reason: collision with root package name */
        public int f83010g;

        /* renamed from: h, reason: collision with root package name */
        public int f83011h;

        /* renamed from: i, reason: collision with root package name */
        public int f83012i;

        /* renamed from: j, reason: collision with root package name */
        public /* synthetic */ Object f83013j;

        public h(j00.c<? super h> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            h hVar = c.this.new h(cVar);
            hVar.f83013j = obj;
            return hVar;
        }

        @Override // x00.p
        public final Object invoke(c1 c1Var, j00.c<? super g2> cVar) {
            return ((h) create(c1Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(1:(1:(3:5|6|7)(2:9|10))(4:11|12|13|14))(8:51|52|53|54|55|56|(1:58)|23)|15|16|17|18|19|20|21|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0199, code lost:
        
            if (r12.E(r5, r8, r16) != r3) goto L57;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0179, code lost:
        
            r0 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x00dc, code lost:
        
            r0 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00dd, code lost:
        
            r6 = r11;
            r7 = r12;
            r8 = r13;
         */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00ff  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x011d  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                Method dump skipped, instructions count: 415
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: r4.c.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.h5enhance.study.AiStudyRouteProvider$provideRoutes$1$8", f = "AiStudyRouteProvider.kt", i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1}, l = {138, R.styleable.Theme_drawable_share_close}, m = "invokeSuspend", n = {"$this$post", "$this$bczRsp$iv", "$completion", RemoteMessageConst.MessageBody.PARAM, "$i$f$bczRsp", "$i$f$h5RspWrap", "$i$a$-bczRsp-AiStudyRouteProvider$provideRoutes$1$8$1", "$this$post", "$this$bczRsp$iv", "$i$f$bczRsp"}, s = {"L$0", "L$1", "L$3", "L$4", "I$0", "I$1", "I$3", "L$0", "L$1", "I$0"}, v = 1)
    @u0({"SMAP\nAiStudyRouteProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AiStudyRouteProvider.kt\ncom/baicizhan/app/biz/game/impl/h5enhance/study/AiStudyRouteProvider$provideRoutes$1$8\n+ 2 BczParamExt.kt\ncom/baicizhan/app/biz/game/impl/h5enhance/base/BczParamExtKt\n+ 3 Json.kt\nkotlinx/serialization/json/Json\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,220:1\n32#2,12:221\n23#2,3:233\n26#2,2:237\n45#2,15:243\n147#3:236\n1563#4:239\n1634#4,3:240\n58#5,16:258\n*S KotlinDebug\n*F\n+ 1 AiStudyRouteProvider.kt\ncom/baicizhan/app/biz/game/impl/h5enhance/study/AiStudyRouteProvider$provideRoutes$1$8\n*L\n136#1:221,12\n137#1:233,3\n137#1:237,2\n136#1:243,15\n137#1:236\n138#1:239\n138#1:240,3\n136#1:258,16\n*E\n"})
    public static final class i extends SuspendLambda implements x00.p<c1, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f83015a;

        /* renamed from: b, reason: collision with root package name */
        public Object f83016b;

        /* renamed from: c, reason: collision with root package name */
        public Object f83017c;

        /* renamed from: d, reason: collision with root package name */
        public Object f83018d;

        /* renamed from: e, reason: collision with root package name */
        public int f83019e;

        /* renamed from: f, reason: collision with root package name */
        public int f83020f;

        /* renamed from: g, reason: collision with root package name */
        public int f83021g;

        /* renamed from: h, reason: collision with root package name */
        public int f83022h;

        /* renamed from: i, reason: collision with root package name */
        public int f83023i;

        /* renamed from: j, reason: collision with root package name */
        public /* synthetic */ Object f83024j;

        public i(j00.c<? super i> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            i iVar = c.this.new i(cVar);
            iVar.f83024j = obj;
            return iVar;
        }

        @Override // x00.p
        public final Object invoke(c1 c1Var, j00.c<? super g2> cVar) {
            return ((i) create(c1Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(1:(1:(3:5|6|7)(2:9|10))(4:11|12|13|14))(11:49|50|51|52|53|54|(2:57|55)|58|59|(1:61)|22)|15|16|17|18|19|20|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x01b4, code lost:
        
            if (r7.E(r8, r11, r16) == r3) goto L58;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0194, code lost:
        
            r0 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x00ff, code lost:
        
            r0 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0100, code lost:
        
            r8 = r5;
         */
        /* JADX WARN: Removed duplicated region for block: B:30:0x011d  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x013a  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                Method dump skipped, instructions count: 442
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: r4.c.i.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.h5enhance.study.AiStudyRouteProvider$provideRoutes$2$1", f = "AiStudyRouteProvider.kt", i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1}, l = {149, R.styleable.Theme_drawable_share_close}, m = "invokeSuspend", n = {"$this$post", "$this$bczRsp$iv", "$completion", RemoteMessageConst.MessageBody.PARAM, "$i$f$bczRsp", "$i$f$h5RspWrap", "$i$a$-bczRsp-AiStudyRouteProvider$provideRoutes$2$1$1", "$this$post", "$this$bczRsp$iv", "$i$f$bczRsp"}, s = {"L$0", "L$1", "L$3", "L$4", "I$0", "I$1", "I$3", "L$0", "L$1", "I$0"}, v = 1)
    @u0({"SMAP\nAiStudyRouteProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AiStudyRouteProvider.kt\ncom/baicizhan/app/biz/game/impl/h5enhance/study/AiStudyRouteProvider$provideRoutes$2$1\n+ 2 BczParamExt.kt\ncom/baicizhan/app/biz/game/impl/h5enhance/base/BczParamExtKt\n+ 3 Json.kt\nkotlinx/serialization/json/Json\n+ 4 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,220:1\n32#2,12:221\n23#2,3:233\n26#2,2:237\n45#2,15:239\n147#3:236\n58#4,16:254\n*S KotlinDebug\n*F\n+ 1 AiStudyRouteProvider.kt\ncom/baicizhan/app/biz/game/impl/h5enhance/study/AiStudyRouteProvider$provideRoutes$2$1\n*L\n147#1:221,12\n148#1:233,3\n148#1:237,2\n147#1:239,15\n148#1:236\n147#1:254,16\n*E\n"})
    public static final class j extends SuspendLambda implements x00.p<c1, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f83026a;

        /* renamed from: b, reason: collision with root package name */
        public Object f83027b;

        /* renamed from: c, reason: collision with root package name */
        public Object f83028c;

        /* renamed from: d, reason: collision with root package name */
        public Object f83029d;

        /* renamed from: e, reason: collision with root package name */
        public int f83030e;

        /* renamed from: f, reason: collision with root package name */
        public int f83031f;

        /* renamed from: g, reason: collision with root package name */
        public int f83032g;

        /* renamed from: h, reason: collision with root package name */
        public int f83033h;

        /* renamed from: i, reason: collision with root package name */
        public int f83034i;

        /* renamed from: j, reason: collision with root package name */
        public /* synthetic */ Object f83035j;

        public j(j00.c<? super j> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            j jVar = c.this.new j(cVar);
            jVar.f83035j = obj;
            return jVar;
        }

        @Override // x00.p
        public final Object invoke(c1 c1Var, j00.c<? super g2> cVar) {
            return ((j) create(c1Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(1:(1:(3:5|6|7)(2:9|10))(4:11|12|13|14))(8:49|50|51|52|53|54|(1:56)|22)|15|16|17|18|19|20|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0182, code lost:
        
            if (r7.E(r8, r11, r16) == r3) goto L54;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0162, code lost:
        
            r0 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x00ca, code lost:
        
            r0 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x00cb, code lost:
        
            r8 = r5;
         */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00eb  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0108  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                Method dump skipped, instructions count: 392
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: r4.c.j.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.h5enhance.study.AiStudyRouteProvider$provideRoutes$2$2", f = "AiStudyRouteProvider.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1}, l = {158, R.styleable.Theme_drawable_share_close}, m = "invokeSuspend", n = {"$this$post", "$this$bczRsp$iv", "$completion", "$i$f$bczRsp", "$i$f$h5RspWrap", "$i$a$-bczRsp-AiStudyRouteProvider$provideRoutes$2$2$1", "$this$post", "$this$bczRsp$iv", "$i$f$bczRsp"}, s = {"L$0", "L$1", "L$3", "I$0", "I$1", "I$3", "L$0", "L$1", "I$0"}, v = 1)
    @u0({"SMAP\nAiStudyRouteProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AiStudyRouteProvider.kt\ncom/baicizhan/app/biz/game/impl/h5enhance/study/AiStudyRouteProvider$provideRoutes$2$2\n+ 2 BczParamExt.kt\ncom/baicizhan/app/biz/game/impl/h5enhance/base/BczParamExtKt\n+ 3 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,220:1\n32#2,28:221\n58#3,16:249\n*S KotlinDebug\n*F\n+ 1 AiStudyRouteProvider.kt\ncom/baicizhan/app/biz/game/impl/h5enhance/study/AiStudyRouteProvider$provideRoutes$2$2\n*L\n156#1:221,28\n156#1:249,16\n*E\n"})
    public static final class k extends SuspendLambda implements x00.p<c1, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f83037a;

        /* renamed from: b, reason: collision with root package name */
        public Object f83038b;

        /* renamed from: c, reason: collision with root package name */
        public Object f83039c;

        /* renamed from: d, reason: collision with root package name */
        public int f83040d;

        /* renamed from: e, reason: collision with root package name */
        public int f83041e;

        /* renamed from: f, reason: collision with root package name */
        public int f83042f;

        /* renamed from: g, reason: collision with root package name */
        public int f83043g;

        /* renamed from: h, reason: collision with root package name */
        public int f83044h;

        /* renamed from: i, reason: collision with root package name */
        public /* synthetic */ Object f83045i;

        public k(j00.c<? super k> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            k kVar = c.this.new k(cVar);
            kVar.f83045i = obj;
            return kVar;
        }

        @Override // x00.p
        public final Object invoke(c1 c1Var, j00.c<? super g2> cVar) {
            return ((k) create(c1Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(1:(1:(3:5|6|7)(2:9|10))(4:11|12|13|14))(5:51|52|53|(1:55)|23)|15|16|17|18|19|20|21|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0139, code lost:
        
            if (r12.E(r5, r8, r16) != r3) goto L53;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x011b, code lost:
        
            r0 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x008b, code lost:
        
            r0 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x008c, code lost:
        
            r6 = r11;
            r7 = r12;
            r8 = r13;
         */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00a1  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00bf  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                Method dump skipped, instructions count: 319
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: r4.c.k.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.h5enhance.study.AiStudyRouteProvider", f = "AiStudyRouteProvider.kt", i = {0, 1, 1, 1, 2, 2}, l = {170, 184, 190}, m = "submitGame", n = {AssistPushConsts.MSG_TYPE_PAYLOAD, AssistPushConsts.MSG_TYPE_PAYLOAD, "$this$submitGame_u24lambda_u240", "$i$a$-runCatching-AiStudyRouteProvider$submitGame$roundType$1", AssistPushConsts.MSG_TYPE_PAYLOAD, "roundType"}, s = {"L$0", "L$0", "L$1", "I$0", "L$0", "L$1"}, v = 1)
    public static final class l extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f83047a;

        /* renamed from: b, reason: collision with root package name */
        public Object f83048b;

        /* renamed from: c, reason: collision with root package name */
        public int f83049c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f83050d;

        /* renamed from: f, reason: collision with root package name */
        public int f83052f;

        public l(j00.c<? super l> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f83050d = obj;
            this.f83052f |= Integer.MIN_VALUE;
            return c.this.q(null, this);
        }
    }

    public c(@m80.k x preloadResourceUC, @m80.k l6.d checkGameResourceUC, @m80.k com.baicizhan.app.biz.game.repo.gameround.e gameRound, @m80.k t winWordsGameUC, @m80.k f0 doStartGameUC, @m80.k o6.a commitGameUC, @m80.k o6.t giveUpUC, @m80.k p getCurrentWordsGameUc, @m80.k l6.p getTopicResource, @m80.k n6.g getWordsSettingUC, @m80.k n6.a commitSettingsUC, @m80.k c6.b userGameInfoRepo) {
        g0.p(preloadResourceUC, "preloadResourceUC");
        g0.p(checkGameResourceUC, "checkGameResourceUC");
        g0.p(gameRound, "gameRound");
        g0.p(winWordsGameUC, "winWordsGameUC");
        g0.p(doStartGameUC, "doStartGameUC");
        g0.p(commitGameUC, "commitGameUC");
        g0.p(giveUpUC, "giveUpUC");
        g0.p(getCurrentWordsGameUc, "getCurrentWordsGameUc");
        g0.p(getTopicResource, "getTopicResource");
        g0.p(getWordsSettingUC, "getWordsSettingUC");
        g0.p(commitSettingsUC, "commitSettingsUC");
        g0.p(userGameInfoRepo, "userGameInfoRepo");
        this.f82918a = preloadResourceUC;
        this.f82919b = checkGameResourceUC;
        this.f82920c = gameRound;
        this.f82921d = winWordsGameUC;
        this.f82922e = doStartGameUC;
        this.f82923f = commitGameUC;
        this.f82924g = giveUpUC;
        this.f82925h = getCurrentWordsGameUc;
        this.f82926i = getTopicResource;
        this.f82927j = getWordsSettingUC;
        this.f82928k = commitSettingsUC;
        this.f82929l = userGameInfoRepo;
    }

    public static final g2 o(c cVar, io.ktor.server.routing.g0 route) {
        g0.p(route, "$this$route");
        RoutingBuilderKt.S(route, "/get_current_game", cVar.new b(null));
        RoutingBuilderKt.S(route, "/start_game", cVar.new C1029c(null));
        RoutingBuilderKt.S(route, "/sync_state", cVar.new d(null));
        RoutingBuilderKt.S(route, "/submit_game", cVar.new e(null));
        RoutingBuilderKt.S(route, "/check_resource", cVar.new f(null));
        RoutingBuilderKt.S(route, "/get_topic_resource", cVar.new g(null));
        RoutingBuilderKt.S(route, "/winning_streak", cVar.new h(null));
        RoutingBuilderKt.S(route, "/preload", cVar.new i(null));
        return g2.f100423a;
    }

    public static final g2 p(c cVar, io.ktor.server.routing.g0 route) {
        g0.p(route, "$this$route");
        RoutingBuilderKt.S(route, "/commit_settings", cVar.new j(null));
        RoutingBuilderKt.S(route, "/get_settings", cVar.new k(null));
        return g2.f100423a;
    }

    @Override // q4.h
    public void a(@m80.k io.ktor.server.routing.g0 g0Var) {
        g0.p(g0Var, "<this>");
        RoutingBuilderKt.f0(g0Var, "/api/study", new x00.l() { // from class: r4.a
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 o11;
                o11 = c.o(c.this, (io.ktor.server.routing.g0) obj);
                return o11;
            }
        });
        RoutingBuilderKt.f0(g0Var, "/api/settings", new x00.l() { // from class: r4.b
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 p11;
                p11 = c.p(c.this, (io.ktor.server.routing.g0) obj);
                return p11;
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x007a, code lost:
    
        if (r0.b(r3, r9) == r2) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(m3.n1 r21, j00.c<? super s4.g> r22) {
        /*
            Method dump skipped, instructions count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r4.c.q(m3.n1, j00.c):java.lang.Object");
    }
}

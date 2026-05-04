package d5;

import com.baicizhan.app.biz.game.impl.unity.proto.MsgCode;
import com.baicizhan.app.biz.game.impl.unity.proto.MsgType;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import oa0.r;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r
@u0({"SMAP\nCommandHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommandHandler.kt\ncom/baicizhan/app/biz/game/impl/unity/proto/CommandHandler\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CommandBase.kt\ncom/baicizhan/app/biz/game/impl/unity/command/base/CommandBaseKt\n*L\n1#1,44:1\n1#2:45\n41#3,19:46\n*S KotlinDebug\n*F\n+ 1 CommandHandler.kt\ncom/baicizhan/app/biz/game/impl/unity/proto/CommandHandler\n*L\n18#1:46,19\n*E\n"})
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final g f47233a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.unity.proto.CommandHandler", f = "CommandHandler.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {19}, m = "execute", n = {HiAnalyticsConstant.Direction.REQUEST, "$this$execute_u24lambda_u242", "$completion$iv", "$completion", "$i$a$-runCatching-CommandHandler$execute$4", "$i$f$safeExecute", "$i$a$-safeExecute-CommandHandler$execute$4$1"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0", "I$1", "I$3"}, v = 1)
    /* renamed from: d5.a$a, reason: collision with other inner class name */
    public static final class C0548a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f47234a;

        /* renamed from: b, reason: collision with root package name */
        public Object f47235b;

        /* renamed from: c, reason: collision with root package name */
        public Object f47236c;

        /* renamed from: d, reason: collision with root package name */
        public Object f47237d;

        /* renamed from: e, reason: collision with root package name */
        public int f47238e;

        /* renamed from: f, reason: collision with root package name */
        public int f47239f;

        /* renamed from: g, reason: collision with root package name */
        public int f47240g;

        /* renamed from: h, reason: collision with root package name */
        public int f47241h;

        /* renamed from: i, reason: collision with root package name */
        public /* synthetic */ Object f47242i;

        /* renamed from: k, reason: collision with root package name */
        public int f47244k;

        public C0548a(j00.c<? super C0548a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f47242i = obj;
            this.f47244k |= Integer.MIN_VALUE;
            return a.this.b(null, this);
        }
    }

    public a(@m80.k g registry) {
        g0.p(registry, "registry");
        this.f47233a = registry;
    }

    public static /* synthetic */ m d(a aVar, j jVar, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = MsgCode.InnerError.getValue();
        }
        return aVar.c(jVar, i11);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(2:3|(11:5|6|(1:(4:9|10|11|12)(2:59|60))(3:61|(1:63)(1:86)|(8:68|69|71|72|73|74|75|(1:77)(1:78))(1:67))|13|(1:15)(1:36)|16|17|18|19|(1:21)|(4:23|(1:25)|26|27)(2:29|30)))|87|6|(0)(0)|13|(0)(0)|16|17|18|19|(0)|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0110, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0111, code lost:
    
        r8 = r2;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d1 A[Catch: all -> 0x00ef, TRY_ENTER, TryCatch #5 {all -> 0x00ef, blocks: (B:40:0x00c2, B:43:0x00d1, B:46:0x00e8, B:49:0x00f1, B:51:0x00f5, B:54:0x0100, B:56:0x0113), top: B:39:0x00c2 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f1 A[Catch: all -> 0x00ef, TryCatch #5 {all -> 0x00ef, blocks: (B:40:0x00c2, B:43:0x00d1, B:46:0x00e8, B:49:0x00f1, B:51:0x00f5, B:54:0x0100, B:56:0x0113), top: B:39:0x00c2 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@m80.k d5.j r17, @m80.k j00.c<? super d5.m> r18) {
        /*
            Method dump skipped, instructions count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d5.a.b(d5.j, j00.c):java.lang.Object");
    }

    public final m c(j jVar, int i11) {
        return new m(jVar.m(), MsgType.CallRsp.getValue(), jVar.k(), null, i11, w3.g.n());
    }
}

package k6;

import com.heytap.mcssdk.constant.IntentConstant;
import j00.c;
import java.util.Map;
import k50.i0;
import k50.j0;
import k50.o;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import l00.d;
import m80.k;
import m80.l;
import oa0.r;
import w3.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r
@u0({"SMAP\nReportUC.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReportUC.kt\ncom/baicizhan/app/biz/game/uc/report/ReportUC\n+ 2 JsonElementBuilders.kt\nkotlinx/serialization/json/JsonElementBuildersKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 4 SerialFormat.kt\nkotlinx/serialization/SerialFormatKt\n*L\n1#1,62:1\n29#2,2:63\n31#2:67\n29#2,2:68\n31#2:71\n216#3,2:65\n113#4:70\n113#4:72\n*S KotlinDebug\n*F\n+ 1 ReportUC.kt\ncom/baicizhan/app/biz/game/uc/report/ReportUC\n*L\n27#1:63,2\n27#1:67\n40#1:68,2\n40#1:71\n28#1:65,2\n45#1:70\n48#1:72\n*E\n"})
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final u5.b f65979a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final k50.a f65980b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @d(c = "com.baicizhan.app.biz.game.uc.report.ReportUC", f = "ReportUC.kt", i = {0, 0, 0, 0, 0}, l = {20}, m = "invoke", n = {"groupId", IntentConstant.EVENT_ID, "extra", "$this$invoke_u24lambda_u240", "$i$a$-runCatching-ReportUC$invoke$2"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 1)
    /* renamed from: k6.a$a, reason: collision with other inner class name */
    public static final class C0760a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f65981a;

        /* renamed from: b, reason: collision with root package name */
        public Object f65982b;

        /* renamed from: c, reason: collision with root package name */
        public Object f65983c;

        /* renamed from: d, reason: collision with root package name */
        public Object f65984d;

        /* renamed from: e, reason: collision with root package name */
        public int f65985e;

        /* renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f65986f;

        /* renamed from: h, reason: collision with root package name */
        public int f65988h;

        public C0760a(c<? super C0760a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f65986f = obj;
            this.f65988h |= Integer.MIN_VALUE;
            return a.this.b(null, null, null, this);
        }
    }

    public a(@k u5.b plugin, @k k50.a json) {
        g0.p(plugin, "plugin");
        g0.p(json, "json");
        this.f65979a = plugin;
        this.f65980b = json;
    }

    public final String a(String str, String str2, Map<String, ? extends Object> map) {
        String valueOf = String.valueOf(g.n());
        j0 j0Var = new j0();
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof String) {
                k50.l.n(j0Var, key, (String) value);
            } else if (value instanceof Number) {
                j0Var.b(key, o.c((Number) value));
            } else if (value instanceof Boolean) {
                k50.l.l(j0Var, key, (Boolean) value);
            } else if (value == null) {
                j0Var.b(key, o.a(null));
            } else {
                k50.l.n(j0Var, key, value.toString());
            }
        }
        i0 a11 = j0Var.a();
        j0 j0Var2 = new j0();
        k50.l.n(j0Var2, "product_id", "bcz_app");
        k50.l.n(j0Var2, "stat_group", str);
        k50.l.n(j0Var2, "event_id", str2);
        k50.l.n(j0Var2, "log_time", valueOf);
        k50.a aVar = this.f65980b;
        aVar.getSerializersModule();
        i0.a aVar2 = i0.Companion;
        k50.l.n(j0Var2, "extra_info", aVar.a(aVar2.serializer(), a11));
        i0 a12 = j0Var2.a();
        k50.a aVar3 = this.f65980b;
        aVar3.getSerializersModule();
        return aVar3.a(aVar2.serializer(), a12);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(2:10|11)(2:17|18))(3:19|20|(1:22))|12|13|14))|25|6|7|(0)(0)|12|13|14) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0039, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0081, code lost:
    
        r6 = kotlin.Result.Companion;
        r5 = kotlin.Result.m6308constructorimpl(kotlin.e.a(r5));
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@m80.k java.lang.String r5, @m80.k java.lang.String r6, @m80.k java.util.Map<java.lang.String, ? extends java.lang.Object> r7, @m80.k j00.c<? super yz.g2> r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof k6.a.C0760a
            if (r0 == 0) goto L13
            r0 = r8
            k6.a$a r0 = (k6.a.C0760a) r0
            int r1 = r0.f65988h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f65988h = r1
            goto L18
        L13:
            k6.a$a r0 = new k6.a$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f65986f
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f65988h
            r3 = 1
            if (r2 == 0) goto L43
            if (r2 != r3) goto L3b
            java.lang.Object r5 = r0.f65984d
            k6.a r5 = (k6.a) r5
            java.lang.Object r5 = r0.f65983c
            java.util.Map r5 = (java.util.Map) r5
            java.lang.Object r5 = r0.f65982b
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r5 = r0.f65981a
            java.lang.String r5 = (java.lang.String) r5
            kotlin.e.n(r8)     // Catch: java.lang.Throwable -> L39
            goto L7a
        L39:
            r5 = move-exception
            goto L81
        L3b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L43:
            kotlin.e.n(r8)
            kotlin.Result$a r8 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L39
            u5.b r8 = r4.f65979a     // Catch: java.lang.Throwable -> L39
            u5.a$b r8 = r8.c()     // Catch: java.lang.Throwable -> L39
            java.lang.String r2 = r4.a(r5, r6, r7)     // Catch: java.lang.Throwable -> L39
            java.util.List r2 = a00.g0.l(r2)     // Catch: java.lang.Throwable -> L39
            java.lang.Object r5 = l00.k.a(r5)     // Catch: java.lang.Throwable -> L39
            r0.f65981a = r5     // Catch: java.lang.Throwable -> L39
            java.lang.Object r5 = l00.k.a(r6)     // Catch: java.lang.Throwable -> L39
            r0.f65982b = r5     // Catch: java.lang.Throwable -> L39
            java.lang.Object r5 = l00.k.a(r7)     // Catch: java.lang.Throwable -> L39
            r0.f65983c = r5     // Catch: java.lang.Throwable -> L39
            java.lang.Object r5 = l00.k.a(r4)     // Catch: java.lang.Throwable -> L39
            r0.f65984d = r5     // Catch: java.lang.Throwable -> L39
            r5 = 0
            r0.f65985e = r5     // Catch: java.lang.Throwable -> L39
            r0.f65988h = r3     // Catch: java.lang.Throwable -> L39
            java.lang.Object r5 = r8.a(r2, r0)     // Catch: java.lang.Throwable -> L39
            if (r5 != r1) goto L7a
            return r1
        L7a:
            yz.g2 r5 = yz.g2.f100423a     // Catch: java.lang.Throwable -> L39
            java.lang.Object r5 = kotlin.Result.m6308constructorimpl(r5)     // Catch: java.lang.Throwable -> L39
            goto L8b
        L81:
            kotlin.Result$a r6 = kotlin.Result.Companion
            java.lang.Object r5 = kotlin.e.a(r5)
            java.lang.Object r5 = kotlin.Result.m6308constructorimpl(r5)
        L8b:
            kotlin.Result.m6314isFailureimpl(r5)
            yz.g2 r5 = yz.g2.f100423a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: k6.a.b(java.lang.String, java.lang.String, java.util.Map, j00.c):java.lang.Object");
    }
}

package y6;

import com.baicizhan.app.preferences.g;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import oa0.r;
import yz.c0;
import yz.e0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r(binds = {y6.a.class})
@u0({"SMAP\nLearnScheduleStore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LearnScheduleStore.kt\ncom/baicizhan/app/biz/leaning/data/LearnScheduleStore\n+ 2 Json.kt\nkotlinx/serialization/json/Json\n+ 3 SerialFormat.kt\nkotlinx/serialization/SerialFormatKt\n*L\n1#1,47:1\n147#2:48\n113#3:49\n*S KotlinDebug\n*F\n+ 1 LearnScheduleStore.kt\ncom/baicizhan/app/biz/leaning/data/LearnScheduleStore\n*L\n28#1:48\n37#1:49\n*E\n"})
/* loaded from: classes3.dex */
public final class c implements y6.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.baicizhan.app.preferences.a f99403a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final k50.a f99404b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final c0 f99405c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.leaning.data.LearnScheduleStore", f = "LearnScheduleStore.kt", i = {}, l = {26}, m = "getLearnSchedule", n = {}, s = {}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f99406a;

        /* renamed from: c, reason: collision with root package name */
        public int f99408c;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f99406a = obj;
            this.f99408c |= Integer.MIN_VALUE;
            return c.this.b(this);
        }
    }

    public c(@k com.baicizhan.app.preferences.a bczPreferenceFactory, @k k50.a json) {
        g0.p(bczPreferenceFactory, "bczPreferenceFactory");
        g0.p(json, "json");
        this.f99403a = bczPreferenceFactory;
        this.f99404b = json;
        this.f99405c = e0.c(new x00.a() { // from class: y6.b
            @Override // x00.a
            public final Object invoke() {
                g f11;
                f11 = c.f(c.this);
                return f11;
            }
        });
    }

    public static final g f(c cVar) {
        return cVar.f99403a.a(d.f99409a);
    }

    @Override // y6.a
    @l
    public Object a(@k j00.c<? super g2> cVar) {
        Object a11 = e().a(cVar);
        return a11 == kotlin.coroutines.intrinsics.b.l() ? a11 : g2.f100423a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|(1:(1:9)(2:21|22))(2:23|(1:25))|10|11|12|(2:14|(1:16))|19))|26|6|(0)(0)|10|11|12|(0)|19) */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0061 A[Catch: Exception -> 0x0068, TRY_LEAVE, TryCatch #0 {Exception -> 0x0068, blocks: (B:12:0x0048, B:14:0x0061), top: B:11:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // y6.a
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(@m80.k j00.c<? super com.baicizhan.app.biz.leaning.c> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof y6.c.a
            if (r0 == 0) goto L13
            r0 = r5
            y6.c$a r0 = (y6.c.a) r0
            int r1 = r0.f99408c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f99408c = r1
            goto L18
        L13:
            y6.c$a r0 = new y6.c$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f99406a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f99408c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.e.n(r5)
            goto L45
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.e.n(r5)
            com.baicizhan.app.preferences.g r5 = r4.e()
            r0.f99408c = r3
            java.lang.String r2 = "current_learn_schedule"
            java.lang.String r3 = ""
            java.lang.Object r5 = r5.j(r2, r3, r0)
            if (r5 != r1) goto L45
            return r1
        L45:
            java.lang.String r5 = (java.lang.String) r5
            r0 = 0
            k50.a r1 = r4.f99404b     // Catch: java.lang.Exception -> L68
            r1.getSerializersModule()     // Catch: java.lang.Exception -> L68
            com.baicizhan.app.biz.leaning.c$b r2 = com.baicizhan.app.biz.leaning.c.Companion     // Catch: java.lang.Exception -> L68
            f50.i r2 = r2.serializer()     // Catch: java.lang.Exception -> L68
            f50.i r2 = g50.a.v(r2)     // Catch: java.lang.Exception -> L68
            f50.e r2 = (f50.e) r2     // Catch: java.lang.Exception -> L68
            java.lang.Object r5 = r1.c(r2, r5)     // Catch: java.lang.Exception -> L68
            com.baicizhan.app.biz.leaning.c r5 = (com.baicizhan.app.biz.leaning.c) r5     // Catch: java.lang.Exception -> L68
            if (r5 == 0) goto L68
            int r1 = r5.m()     // Catch: java.lang.Exception -> L68
            if (r1 == 0) goto L68
            return r5
        L68:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: y6.c.b(j00.c):java.lang.Object");
    }

    @Override // y6.a
    @l
    public Object c(@k com.baicizhan.app.biz.leaning.c cVar, @k j00.c<? super g2> cVar2) {
        g e11 = e();
        k50.a aVar = this.f99404b;
        aVar.getSerializersModule();
        Object k11 = e11.k(d.f99410b, aVar.a(com.baicizhan.app.biz.leaning.c.Companion.serializer(), cVar), cVar2);
        return k11 == kotlin.coroutines.intrinsics.b.l() ? k11 : g2.f100423a;
    }

    public final g e() {
        return (g) this.f99405c.getValue();
    }
}

package b5;

import com.igexin.assist.sdk.AssistPushConsts;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@oa0.r(binds = {d5.f.class})
/* loaded from: classes3.dex */
public final class e0 implements d5.f<x0, c1> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final n6.g f5826a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f5827b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public final f50.e<x0> f5828c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.unity.command.GetSettingsCommand", f = "GetSettingsCommand.kt", i = {0}, l = {24}, m = "execute", n = {AssistPushConsts.MSG_TYPE_PAYLOAD}, s = {"L$0"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f5829a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f5830b;

        /* renamed from: d, reason: collision with root package name */
        public int f5832d;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f5830b = obj;
            this.f5832d |= Integer.MIN_VALUE;
            return e0.this.a(null, this);
        }
    }

    public e0(@m80.k n6.g getWordsSettingUC) {
        kotlin.jvm.internal.g0.p(getWordsSettingUC, "getWordsSettingUC");
        this.f5826a = getWordsSettingUC;
        this.f5827b = "biz.settings.getall";
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // d5.f
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@m80.k b5.x0 r5, @m80.k j00.c<? super b5.c1> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof b5.e0.a
            if (r0 == 0) goto L13
            r0 = r6
            b5.e0$a r0 = (b5.e0.a) r0
            int r1 = r0.f5832d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5832d = r1
            goto L18
        L13:
            b5.e0$a r0 = new b5.e0$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f5830b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f5832d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f5829a
            b5.x0 r5 = (b5.x0) r5
            kotlin.e.n(r6)
            goto L49
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.e.n(r6)
            n6.g r6 = r4.f5826a
            java.lang.Object r5 = l00.k.a(r5)
            r0.f5829a = r5
            r0.f5832d = r3
            java.lang.Object r6 = r6.a(r0)
            if (r6 != r1) goto L49
            return r1
        L49:
            java.util.Map r6 = (java.util.Map) r6
            m3.b1 r5 = new m3.b1
            r5.<init>(r6)
            m3.b1 r5 = b5.b.b(r5)
            b5.b r5 = b5.b.a(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.e0.a(b5.x0, j00.c):java.lang.Object");
    }

    @Override // d5.f
    @m80.l
    public f50.e<x0> b() {
        return this.f5828c;
    }

    @Override // d5.f
    @m80.k
    public String c() {
        return this.f5827b;
    }
}

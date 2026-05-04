package n6;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import oa0.r;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r
/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final y5.a f74497a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.settings.GetTypedSettingUC", f = "GetTypedSettingUC.kt", i = {0}, l = {28}, m = "invoke", n = {"def"}, s = {"L$0"}, v = 1)
    public static final class a<T> extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f74498a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f74499b;

        /* renamed from: d, reason: collision with root package name */
        public int f74501d;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f74499b = obj;
            this.f74501d |= Integer.MIN_VALUE;
            return e.this.a(null, this);
        }
    }

    public e(@m80.k y5.a settingRepo) {
        g0.p(settingRepo, "settingRepo");
        this.f74497a = settingRepo;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> java.lang.Object a(@m80.k h5.m0<T> r5, @m80.k j00.c<? super T> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof n6.e.a
            if (r0 == 0) goto L13
            r0 = r6
            n6.e$a r0 = (n6.e.a) r0
            int r1 = r0.f74501d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f74501d = r1
            goto L18
        L13:
            n6.e$a r0 = new n6.e$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f74499b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f74501d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f74498a
            h5.m0 r5 = (h5.m0) r5
            kotlin.e.n(r6)
            goto L4a
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.e.n(r6)
            y5.a r6 = r4.f74497a
            java.lang.String r2 = r5.getKey()
            r0.f74498a = r5
            r0.f74501d = r3
            r3 = 0
            java.lang.Object r6 = r6.d(r2, r3, r0)
            if (r6 != r1) goto L4a
            return r1
        L4a:
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r5 = r5.b(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: n6.e.a(h5.m0, j00.c):java.lang.Object");
    }
}

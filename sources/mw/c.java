package mw;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class c {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.call.SavedCallKt", f = "SavedCall.kt", i = {0}, l = {70}, m = "save", n = {"$this$save"}, s = {"L$0"})
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f73744a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f73745b;

        /* renamed from: c, reason: collision with root package name */
        public int f73746c;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f73745b = obj;
            this.f73746c |= Integer.MIN_VALUE;
            return c.a(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(@m80.k mw.a r4, @m80.k j00.c<? super mw.a> r5) {
        /*
            boolean r0 = r5 instanceof mw.c.a
            if (r0 == 0) goto L13
            r0 = r5
            mw.c$a r0 = (mw.c.a) r0
            int r1 = r0.f73746c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f73746c = r1
            goto L18
        L13:
            mw.c$a r0 = new mw.c$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f73745b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f73746c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f73744a
            mw.a r4 = (mw.a) r4
            kotlin.e.n(r5)
            goto L4b
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.e.n(r5)
            ex.c r5 = r4.i()
            io.ktor.utils.io.g r5 = r5.b()
            r0.f73744a = r4
            r0.f73746c = r3
            java.lang.Object r5 = io.ktor.utils.io.j.G(r5, r0)
            if (r5 != r1) goto L4b
            return r1
        L4b:
            y40.c0 r5 = (y40.c0) r5
            byte[] r5 = y40.g0.c(r5)
            mw.d r0 = new mw.d
            lw.c r1 = r4.e()
            cx.w r2 = r4.h()
            ex.c r4 = r4.i()
            r0.<init>(r1, r2, r4, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: mw.c.a(mw.a, j00.c):java.lang.Object");
    }
}

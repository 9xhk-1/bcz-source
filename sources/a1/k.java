package a1;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class k {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.airbnb.lottie.compose.LottieCompositionResultKt", f = "LottieCompositionResult.kt", i = {}, l = {85}, m = "awaitOrNull", n = {}, s = {})
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f1338a;

        /* renamed from: b, reason: collision with root package name */
        public int f1339b;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f1338a = obj;
            this.f1339b |= Integer.MIN_VALUE;
            return k.a(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(@m80.k a1.i r4, @m80.k j00.c<? super com.airbnb.lottie.k> r5) {
        /*
            boolean r0 = r5 instanceof a1.k.a
            if (r0 == 0) goto L13
            r0 = r5
            a1.k$a r0 = (a1.k.a) r0
            int r1 = r0.f1339b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1339b = r1
            goto L18
        L13:
            a1.k$a r0 = new a1.k$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f1338a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f1339b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.e.n(r5)     // Catch: java.lang.Throwable -> L40
            goto L3d
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.e.n(r5)
            r0.f1339b = r3     // Catch: java.lang.Throwable -> L40
            java.lang.Object r5 = r4.i(r0)     // Catch: java.lang.Throwable -> L40
            if (r5 != r1) goto L3d
            return r1
        L3d:
            com.airbnb.lottie.k r5 = (com.airbnb.lottie.k) r5     // Catch: java.lang.Throwable -> L40
            return r5
        L40:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.k.a(a1.i, j00.c):java.lang.Object");
    }
}

package androidx.compose.foundation;

import android.view.Surface;
import c40.r0;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "androidx.compose.foundation.BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1", f = "AndroidExternalSurface.android.kt", i = {0}, l = {130, 136}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
/* loaded from: classes.dex */
public final class BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1 extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {
    final /* synthetic */ int $height;
    final /* synthetic */ Surface $surface;
    final /* synthetic */ int $width;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ BaseAndroidExternalSurfaceState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1(BaseAndroidExternalSurfaceState baseAndroidExternalSurfaceState, Surface surface, int i11, int i12, j00.c<? super BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1> cVar) {
        super(2, cVar);
        this.this$0 = baseAndroidExternalSurfaceState;
        this.$surface = surface;
        this.$width = i11;
        this.$height = i12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
        BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1 baseAndroidExternalSurfaceState$dispatchSurfaceCreated$1 = new BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1(this.this$0, this.$surface, this.$width, this.$height, cVar);
        baseAndroidExternalSurfaceState$dispatchSurfaceCreated$1.L$0 = obj;
        return baseAndroidExternalSurfaceState$dispatchSurfaceCreated$1;
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
        return ((BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0064, code lost:
    
        if (r3.invoke(r4, r5, r6, r7, r9) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0066, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
    
        if (c40.n2.l(r10, r9) == r0) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r9.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L22
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.e.n(r10)
            goto L67
        L12:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1a:
            java.lang.Object r1 = r9.L$0
            c40.r0 r1 = (c40.r0) r1
            kotlin.e.n(r10)
            goto L3d
        L22:
            kotlin.e.n(r10)
            java.lang.Object r10 = r9.L$0
            r1 = r10
            c40.r0 r1 = (c40.r0) r1
            androidx.compose.foundation.BaseAndroidExternalSurfaceState r10 = r9.this$0
            c40.l2 r10 = androidx.compose.foundation.BaseAndroidExternalSurfaceState.access$getJob$p(r10)
            if (r10 == 0) goto L3d
            r9.L$0 = r1
            r9.label = r3
            java.lang.Object r10 = c40.n2.l(r10, r9)
            if (r10 != r0) goto L3d
            goto L66
        L3d:
            androidx.compose.foundation.BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1$receiver$1 r4 = new androidx.compose.foundation.BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1$receiver$1
            androidx.compose.foundation.BaseAndroidExternalSurfaceState r10 = r9.this$0
            r4.<init>(r10, r1)
            androidx.compose.foundation.BaseAndroidExternalSurfaceState r10 = r9.this$0
            x00.s r3 = androidx.compose.foundation.BaseAndroidExternalSurfaceState.access$getOnSurface$p(r10)
            if (r3 == 0) goto L67
            android.view.Surface r5 = r9.$surface
            int r10 = r9.$width
            java.lang.Integer r6 = l00.a.f(r10)
            int r10 = r9.$height
            java.lang.Integer r7 = l00.a.f(r10)
            r10 = 0
            r9.L$0 = r10
            r9.label = r2
            r8 = r9
            java.lang.Object r10 = r3.invoke(r4, r5, r6, r7, r8)
            if (r10 != r0) goto L67
        L66:
            return r0
        L67:
            yz.g2 r10 = yz.g2.f100423a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

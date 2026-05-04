package androidx.core.view;

import android.view.View;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "androidx.core.view.ViewKt$allViews$1", f = "View.kt", i = {0}, l = {409, 411}, m = "invokeSuspend", n = {"$this$sequence"}, s = {"L$0"})
/* loaded from: classes2.dex */
public final class ViewKt$allViews$1 extends RestrictedSuspendLambda implements x00.p<q30.o<? super View>, j00.c<? super yz.g2>, Object> {
    final /* synthetic */ View $this_allViews;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewKt$allViews$1(View view, j00.c<? super ViewKt$allViews$1> cVar) {
        super(2, cVar);
        this.$this_allViews = view;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @m80.k
    public final j00.c<yz.g2> create(@m80.l Object obj, @m80.k j00.c<?> cVar) {
        ViewKt$allViews$1 viewKt$allViews$1 = new ViewKt$allViews$1(this.$this_allViews, cVar);
        viewKt$allViews$1.L$0 = obj;
        return viewKt$allViews$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004c, code lost:
    
        if (r1.f(r5, r4) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004e, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0034, code lost:
    
        if (r1.b(r5, r4) == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@m80.k java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r4.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L22
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.e.n(r5)
            goto L4f
        L12:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L1a:
            java.lang.Object r1 = r4.L$0
            q30.o r1 = (q30.o) r1
            kotlin.e.n(r5)
            goto L37
        L22:
            kotlin.e.n(r5)
            java.lang.Object r5 = r4.L$0
            r1 = r5
            q30.o r1 = (q30.o) r1
            android.view.View r5 = r4.$this_allViews
            r4.L$0 = r1
            r4.label = r3
            java.lang.Object r5 = r1.b(r5, r4)
            if (r5 != r0) goto L37
            goto L4e
        L37:
            android.view.View r5 = r4.$this_allViews
            boolean r3 = r5 instanceof android.view.ViewGroup
            if (r3 == 0) goto L4f
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            q30.m r5 = androidx.core.view.ViewGroupKt.getDescendants(r5)
            r3 = 0
            r4.L$0 = r3
            r4.label = r2
            java.lang.Object r5 = r1.f(r5, r4)
            if (r5 != r0) goto L4f
        L4e:
            return r0
        L4f:
            yz.g2 r5 = yz.g2.f100423a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.ViewKt$allViews$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // x00.p
    @m80.l
    public final Object invoke(@m80.k q30.o<? super View> oVar, @m80.l j00.c<? super yz.g2> cVar) {
        return ((ViewKt$allViews$1) create(oVar, cVar)).invokeSuspend(yz.g2.f100423a);
    }
}

package androidx.compose.ui.tooling;

import j00.c;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.internal.u0;
import l00.d;
import q30.o;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.ui.tooling.ShadowViewInfo$allNodes$1", f = "ShadowViewInfo.android.kt", i = {0, 1}, l = {43, 44}, m = "invokeSuspend", n = {"$this$sequence", "$this$sequence"}, s = {"L$0", "L$0"})
@u0({"SMAP\nShadowViewInfo.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShadowViewInfo.android.kt\nandroidx/compose/ui/tooling/ShadowViewInfo$allNodes$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,115:1\n1373#2:116\n1461#2,5:117\n1855#2,2:122\n*S KotlinDebug\n*F\n+ 1 ShadowViewInfo.android.kt\nandroidx/compose/ui/tooling/ShadowViewInfo$allNodes$1\n*L\n44#1:116\n44#1:117,5\n44#1:122,2\n*E\n"})
/* loaded from: classes2.dex */
public final class ShadowViewInfo$allNodes$1 extends RestrictedSuspendLambda implements p<o<? super ShadowViewInfo>, c<? super g2>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ ShadowViewInfo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShadowViewInfo$allNodes$1(ShadowViewInfo shadowViewInfo, c<? super ShadowViewInfo$allNodes$1> cVar) {
        super(2, cVar);
        this.this$0 = shadowViewInfo;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        ShadowViewInfo$allNodes$1 shadowViewInfo$allNodes$1 = new ShadowViewInfo$allNodes$1(this.this$0, cVar);
        shadowViewInfo$allNodes$1.L$0 = obj;
        return shadowViewInfo$allNodes$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x003c, code lost:
    
        if (r1.b(r6, r5) == r0) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0070  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r5.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L2a
            if (r1 == r3) goto L22
            if (r1 != r2) goto L1a
            java.lang.Object r1 = r5.L$1
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r3 = r5.L$0
            q30.o r3 = (q30.o) r3
            kotlin.e.n(r6)
            goto L6a
        L1a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L22:
            java.lang.Object r1 = r5.L$0
            q30.o r1 = (q30.o) r1
            kotlin.e.n(r6)
            goto L3f
        L2a:
            kotlin.e.n(r6)
            java.lang.Object r6 = r5.L$0
            r1 = r6
            q30.o r1 = (q30.o) r1
            androidx.compose.ui.tooling.ShadowViewInfo r6 = r5.this$0
            r5.L$0 = r1
            r5.label = r3
            java.lang.Object r6 = r1.b(r6, r5)
            if (r6 != r0) goto L3f
            goto L82
        L3f:
            androidx.compose.ui.tooling.ShadowViewInfo r6 = r5.this$0
            java.util.List r6 = r6.getChildren()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r6 = r6.iterator()
        L50:
            boolean r4 = r6.hasNext()
            if (r4 == 0) goto L64
            java.lang.Object r4 = r6.next()
            androidx.compose.ui.tooling.ShadowViewInfo r4 = (androidx.compose.ui.tooling.ShadowViewInfo) r4
            q30.m r4 = r4.getAllNodes()
            a00.m0.t0(r3, r4)
            goto L50
        L64:
            java.util.Iterator r6 = r3.iterator()
            r3 = r1
            r1 = r6
        L6a:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L83
            java.lang.Object r6 = r1.next()
            androidx.compose.ui.tooling.ShadowViewInfo r6 = (androidx.compose.ui.tooling.ShadowViewInfo) r6
            r5.L$0 = r3
            r5.L$1 = r1
            r5.label = r2
            java.lang.Object r6 = r3.b(r6, r5)
            if (r6 != r0) goto L6a
        L82:
            return r0
        L83:
            yz.g2 r6 = yz.g2.f100423a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.tooling.ShadowViewInfo$allNodes$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // x00.p
    public final Object invoke(o<? super ShadowViewInfo> oVar, c<? super g2> cVar) {
        return ((ShadowViewInfo$allNodes$1) create(oVar, cVar)).invokeSuspend(g2.f100423a);
    }
}

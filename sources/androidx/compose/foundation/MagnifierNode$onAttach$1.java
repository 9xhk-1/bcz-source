package androidx.compose.foundation;

import c40.r0;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "androidx.compose.foundation.MagnifierNode$onAttach$1", f = "Magnifier.android.kt", i = {}, l = {382, 386}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class MagnifierNode$onAttach$1 extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {
    int label;
    final /* synthetic */ MagnifierNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MagnifierNode$onAttach$1(MagnifierNode magnifierNode, j00.c<? super MagnifierNode$onAttach$1> cVar) {
        super(2, cVar);
        this.this$0 = magnifierNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
        return new MagnifierNode$onAttach$1(this.this$0, cVar);
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
        return ((MagnifierNode$onAttach$1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0038 -> B:8:0x0021). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0042 -> B:6:0x0045). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r4.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.e.n(r5)
            goto L45
        L12:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L1a:
            kotlin.e.n(r5)
            goto L32
        L1e:
            kotlin.e.n(r5)
        L21:
            androidx.compose.foundation.MagnifierNode r5 = r4.this$0
            e40.o r5 = androidx.compose.foundation.MagnifierNode.access$getDrawSignalChannel$p(r5)
            if (r5 == 0) goto L32
            r4.label = r3
            java.lang.Object r5 = r5.H(r4)
            if (r5 != r0) goto L32
            goto L44
        L32:
            androidx.compose.foundation.MagnifierNode r5 = r4.this$0
            androidx.compose.foundation.PlatformMagnifier r5 = androidx.compose.foundation.MagnifierNode.access$getMagnifier$p(r5)
            if (r5 == 0) goto L21
            androidx.compose.foundation.MagnifierNode$onAttach$1$1 r5 = new x00.l<java.lang.Long, yz.g2>() { // from class: androidx.compose.foundation.MagnifierNode$onAttach$1.1
                static {
                    /*
                        androidx.compose.foundation.MagnifierNode$onAttach$1$1 r0 = new androidx.compose.foundation.MagnifierNode$onAttach$1$1
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:androidx.compose.foundation.MagnifierNode$onAttach$1$1) androidx.compose.foundation.MagnifierNode$onAttach$1.1.INSTANCE androidx.compose.foundation.MagnifierNode$onAttach$1$1
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.MagnifierNode$onAttach$1.AnonymousClass1.<clinit>():void");
                }

                {
                    /*
                        r1 = this;
                        r0 = 1
                        r1.<init>(r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.MagnifierNode$onAttach$1.AnonymousClass1.<init>():void");
                }

                public final void invoke(long r1) {
                    /*
                        r0 = this;
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.MagnifierNode$onAttach$1.AnonymousClass1.invoke(long):void");
                }

                @Override // x00.l
                public /* bridge */ /* synthetic */ yz.g2 invoke(java.lang.Long r3) {
                    /*
                        r2 = this;
                        java.lang.Number r3 = (java.lang.Number) r3
                        long r0 = r3.longValue()
                        r2.invoke(r0)
                        yz.g2 r3 = yz.g2.f100423a
                        return r3
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.MagnifierNode$onAttach$1.AnonymousClass1.invoke(java.lang.Object):java.lang.Object");
                }
            }
            r4.label = r2
            java.lang.Object r5 = androidx.compose.runtime.MonotonicFrameClockKt.withFrameMillis(r5, r4)
            if (r5 != r0) goto L45
        L44:
            return r0
        L45:
            androidx.compose.foundation.MagnifierNode r5 = r4.this$0
            androidx.compose.foundation.PlatformMagnifier r5 = androidx.compose.foundation.MagnifierNode.access$getMagnifier$p(r5)
            if (r5 == 0) goto L21
            r5.updateContent()
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.MagnifierNode$onAttach$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

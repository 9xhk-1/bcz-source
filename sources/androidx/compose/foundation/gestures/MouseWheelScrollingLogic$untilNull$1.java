package androidx.compose.foundation.gestures;

import j00.c;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.internal.u0;
import l00.d;
import q30.o;
import x00.a;
import x00.p;
import yz.g2;

/* JADX INFO: Add missing generic type declarations: [E] */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$untilNull$1", f = "MouseWheelScrollable.kt", i = {0}, l = {179}, m = "invokeSuspend", n = {"$this$sequence"}, s = {"L$0"})
@u0({"SMAP\nMouseWheelScrollable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MouseWheelScrollable.kt\nandroidx/compose/foundation/gestures/MouseWheelScrollingLogic$untilNull$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,363:1\n1#2:364\n*E\n"})
/* loaded from: classes.dex */
public final class MouseWheelScrollingLogic$untilNull$1<E> extends RestrictedSuspendLambda implements p<o<? super E>, c<? super g2>, Object> {
    final /* synthetic */ a<E> $builderAction;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MouseWheelScrollingLogic$untilNull$1(a<? extends E> aVar, c<? super MouseWheelScrollingLogic$untilNull$1> cVar) {
        super(2, cVar);
        this.$builderAction = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        MouseWheelScrollingLogic$untilNull$1 mouseWheelScrollingLogic$untilNull$1 = new MouseWheelScrollingLogic$untilNull$1(this.$builderAction, cVar);
        mouseWheelScrollingLogic$untilNull$1.L$0 = obj;
        return mouseWheelScrollingLogic$untilNull$1;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x003a -> B:5:0x003b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0037 -> B:5:0x003b). Please report as a decompilation issue!!! */
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
            r2 = 1
            if (r1 == 0) goto L1d
            if (r1 != r2) goto L15
            java.lang.Object r1 = r4.L$1
            java.lang.Object r3 = r4.L$0
            q30.o r3 = (q30.o) r3
            kotlin.e.n(r5)
            goto L3b
        L15:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L1d:
            kotlin.e.n(r5)
            java.lang.Object r5 = r4.L$0
            q30.o r5 = (q30.o) r5
            r3 = r5
        L25:
            x00.a<E> r5 = r4.$builderAction
            java.lang.Object r1 = r5.invoke()
            if (r1 == 0) goto L3a
            r4.L$0 = r3
            r4.L$1 = r1
            r4.label = r2
            java.lang.Object r5 = r3.b(r1, r4)
            if (r5 != r0) goto L3b
            return r0
        L3a:
            r1 = 0
        L3b:
            if (r1 != 0) goto L25
            yz.g2 r5 = yz.g2.f100423a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.MouseWheelScrollingLogic$untilNull$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // x00.p
    public final Object invoke(o<? super E> oVar, c<? super g2> cVar) {
        return ((MouseWheelScrollingLogic$untilNull$1) create(oVar, cVar)).invokeSuspend(g2.f100423a);
    }
}

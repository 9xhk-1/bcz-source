package androidx.activity.contextaware;

import android.content.Context;
import c40.p;
import j00.c;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.b;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.u0;
import l00.f;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nContextAware.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextAware.kt\nandroidx/activity/contextaware/ContextAwareKt\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,88:1\n314#2,11:89\n*S KotlinDebug\n*F\n+ 1 ContextAware.kt\nandroidx/activity/contextaware/ContextAwareKt\n*L\n76#1:89,11\n*E\n"})
/* loaded from: classes.dex */
public final class ContextAwareKt {
    @l
    public static final <R> Object withContextAvailable(@k ContextAware contextAware, @k x00.l<Context, R> lVar, @k c<R> cVar) {
        Context peekAvailableContext = contextAware.peekAvailableContext();
        if (peekAvailableContext != null) {
            return lVar.invoke(peekAvailableContext);
        }
        p pVar = new p(IntrinsicsKt__IntrinsicsJvmKt.e(cVar), 1);
        pVar.y();
        ContextAwareKt$withContextAvailable$2$listener$1 contextAwareKt$withContextAvailable$2$listener$1 = new ContextAwareKt$withContextAvailable$2$listener$1(pVar, lVar);
        contextAware.addOnContextAvailableListener(contextAwareKt$withContextAvailable$2$listener$1);
        pVar.p(new ContextAwareKt$withContextAvailable$2$1(contextAware, contextAwareKt$withContextAvailable$2$listener$1));
        Object F = pVar.F();
        if (F == b.l()) {
            f.c(cVar);
        }
        return F;
    }

    private static final <R> Object withContextAvailable$$forInline(ContextAware contextAware, x00.l<Context, R> lVar, c<R> cVar) {
        Context peekAvailableContext = contextAware.peekAvailableContext();
        if (peekAvailableContext != null) {
            return lVar.invoke(peekAvailableContext);
        }
        d0.e(0);
        p pVar = new p(IntrinsicsKt__IntrinsicsJvmKt.e(cVar), 1);
        pVar.y();
        ContextAwareKt$withContextAvailable$2$listener$1 contextAwareKt$withContextAvailable$2$listener$1 = new ContextAwareKt$withContextAvailable$2$listener$1(pVar, lVar);
        contextAware.addOnContextAvailableListener(contextAwareKt$withContextAvailable$2$listener$1);
        pVar.p(new ContextAwareKt$withContextAvailable$2$1(contextAware, contextAwareKt$withContextAvailable$2$listener$1));
        g2 g2Var = g2.f100423a;
        Object F = pVar.F();
        if (F == b.l()) {
            f.c(cVar);
        }
        d0.e(1);
        return F;
    }
}

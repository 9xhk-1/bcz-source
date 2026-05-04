package androidx.compose.ui;

import androidx.compose.ui.SessionMutex;
import c40.r0;
import j00.c;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import l00.d;
import x00.l;
import x00.p;
import yz.g2;

/* JADX INFO: Add missing generic type declarations: [R] */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.ui.SessionMutex$withSessionCancellingPrevious$2", f = "SessionMutex.kt", i = {0, 1}, l = {61, 63}, m = "invokeSuspend", n = {"newSession", "newSession"}, s = {"L$0", "L$0"})
/* loaded from: classes.dex */
public final class SessionMutex$withSessionCancellingPrevious$2<R> extends SuspendLambda implements p<r0, c<? super R>, Object> {
    final /* synthetic */ AtomicReference<SessionMutex.Session<T>> $arg0;
    final /* synthetic */ p<T, c<? super R>, Object> $session;
    final /* synthetic */ l<r0, T> $sessionInitializer;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SessionMutex$withSessionCancellingPrevious$2(l<? super r0, ? extends T> lVar, AtomicReference<SessionMutex.Session<T>> atomicReference, p<? super T, ? super c<? super R>, ? extends Object> pVar, c<? super SessionMutex$withSessionCancellingPrevious$2> cVar) {
        super(2, cVar);
        this.$sessionInitializer = lVar;
        this.$arg0 = atomicReference;
        this.$session = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        SessionMutex$withSessionCancellingPrevious$2 sessionMutex$withSessionCancellingPrevious$2 = new SessionMutex$withSessionCancellingPrevious$2(this.$sessionInitializer, this.$arg0, this.$session, cVar);
        sessionMutex$withSessionCancellingPrevious$2.L$0 = obj;
        return sessionMutex$withSessionCancellingPrevious$2;
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, c<? super R> cVar) {
        return ((SessionMutex$withSessionCancellingPrevious$2) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x005b, code lost:
    
        if (c40.n2.l(r8, r7) == r0) goto L23;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r7.label
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L29
            if (r1 == r4) goto L21
            if (r1 != r3) goto L19
            java.lang.Object r0 = r7.L$0
            androidx.compose.ui.SessionMutex$Session r0 = (androidx.compose.ui.SessionMutex.Session) r0
            kotlin.e.n(r8)     // Catch: java.lang.Throwable -> L17
            goto L70
        L17:
            r8 = move-exception
            goto L78
        L19:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L21:
            java.lang.Object r1 = r7.L$0
            androidx.compose.ui.SessionMutex$Session r1 = (androidx.compose.ui.SessionMutex.Session) r1
            kotlin.e.n(r8)
            goto L5e
        L29:
            kotlin.e.n(r8)
            java.lang.Object r8 = r7.L$0
            c40.r0 r8 = (c40.r0) r8
            androidx.compose.ui.SessionMutex$Session r1 = new androidx.compose.ui.SessionMutex$Session
            kotlin.coroutines.d r5 = r8.getCoroutineContext()
            c40.l2 r5 = c40.n2.A(r5)
            x00.l<c40.r0, T> r6 = r7.$sessionInitializer
            java.lang.Object r8 = r6.invoke(r8)
            r1.<init>(r5, r8)
            java.util.concurrent.atomic.AtomicReference<androidx.compose.ui.SessionMutex$Session<T>> r8 = r7.$arg0
            java.lang.Object r8 = r8.getAndSet(r1)
            androidx.compose.ui.SessionMutex$Session r8 = (androidx.compose.ui.SessionMutex.Session) r8
            if (r8 == 0) goto L5e
            c40.l2 r8 = r8.getJob()
            if (r8 == 0) goto L5e
            r7.L$0 = r1
            r7.label = r4
            java.lang.Object r8 = c40.n2.l(r8, r7)
            if (r8 != r0) goto L5e
            goto L6e
        L5e:
            x00.p<T, j00.c<? super R>, java.lang.Object> r8 = r7.$session     // Catch: java.lang.Throwable -> L76
            java.lang.Object r4 = r1.getValue()     // Catch: java.lang.Throwable -> L76
            r7.L$0 = r1     // Catch: java.lang.Throwable -> L76
            r7.label = r3     // Catch: java.lang.Throwable -> L76
            java.lang.Object r8 = r8.invoke(r4, r7)     // Catch: java.lang.Throwable -> L76
            if (r8 != r0) goto L6f
        L6e:
            return r0
        L6f:
            r0 = r1
        L70:
            java.util.concurrent.atomic.AtomicReference<androidx.compose.ui.SessionMutex$Session<T>> r1 = r7.$arg0
            androidx.camera.view.q.a(r1, r0, r2)
            return r8
        L76:
            r8 = move-exception
            r0 = r1
        L78:
            java.util.concurrent.atomic.AtomicReference<androidx.compose.ui.SessionMutex$Session<T>> r1 = r7.$arg0
            androidx.camera.view.q.a(r1, r0, r2)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.SessionMutex$withSessionCancellingPrevious$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

package kotlin.coroutines.jvm.internal;

import j00.c;
import java.io.Serializable;
import kotlin.Result;
import kotlin.coroutines.intrinsics.b;
import kotlin.jvm.internal.g0;
import l00.e;
import l00.f;
import m80.k;
import m80.l;
import yz.g2;
import yz.v0;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@y0(version = "1.3")
@v0
/* loaded from: classes8.dex */
public abstract class BaseContinuationImpl implements c<Object>, l00.c, Serializable {

    @l
    private final c<Object> completion;

    public BaseContinuationImpl(@l c<Object> cVar) {
        this.completion = cVar;
    }

    @k
    public c<g2> create(@k c<?> completion) {
        g0.p(completion, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @Override // l00.c
    @l
    public l00.c getCallerFrame() {
        c<Object> cVar = this.completion;
        if (cVar instanceof l00.c) {
            return (l00.c) cVar;
        }
        return null;
    }

    @l
    public final c<Object> getCompletion() {
        return this.completion;
    }

    @Override // l00.c
    @l
    public StackTraceElement getStackTraceElement() {
        return e.e(this);
    }

    @l
    public abstract Object invokeSuspend(@k Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j00.c
    public final void resumeWith(@k Object obj) {
        Object invokeSuspend;
        c cVar = this;
        while (true) {
            f.b(cVar);
            BaseContinuationImpl baseContinuationImpl = (BaseContinuationImpl) cVar;
            c cVar2 = baseContinuationImpl.completion;
            g0.m(cVar2);
            try {
                invokeSuspend = baseContinuationImpl.invokeSuspend(obj);
            } catch (Throwable th2) {
                Result.a aVar = Result.Companion;
                obj = Result.m6308constructorimpl(kotlin.e.a(th2));
            }
            if (invokeSuspend == b.l()) {
                return;
            }
            Result.a aVar2 = Result.Companion;
            obj = Result.m6308constructorimpl(invokeSuspend);
            baseContinuationImpl.releaseIntercepted();
            if (!(cVar2 instanceof BaseContinuationImpl)) {
                cVar2.resumeWith(obj);
                return;
            }
            cVar = cVar2;
        }
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb2.append(stackTraceElement);
        return sb2.toString();
    }

    @k
    public c<g2> create(@l Object obj, @k c<?> completion) {
        g0.p(completion, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public void releaseIntercepted() {
    }
}

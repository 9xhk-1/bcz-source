package androidx.tracing;

import j00.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.u0;
import l00.d;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.tracing.TraceKt", f = "Trace.kt", i = {0, 0}, l = {76}, m = "traceAsync", n = {"methodName", "cookie"}, s = {"L$0", "I$0"})
@u0({"SMAP\nTrace.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Trace.kt\nandroidx/tracing/TraceKt$traceAsync$1\n*L\n1#1,111:1\n*E\n"})
/* loaded from: classes3.dex */
public final class TraceKt$traceAsync$1<T> extends ContinuationImpl {
    int I$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public TraceKt$traceAsync$1(c<? super TraceKt$traceAsync$1> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return TraceKt.traceAsync(null, 0, null, this);
    }
}

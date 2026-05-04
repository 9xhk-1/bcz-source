package kotlinx.coroutines.debug.internal;

import c40.p0;
import c40.q0;
import f40.i;
import java.io.Serializable;
import java.lang.Thread;
import java.util.List;
import kotlin.coroutines.c;
import kotlin.coroutines.d;
import m80.k;
import m80.l;
import yz.v0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@v0
/* loaded from: classes8.dex */
public final class DebuggerInfo implements Serializable {

    @l
    private final Long coroutineId;

    @l
    private final String dispatcher;

    @k
    private final List<StackTraceElement> lastObservedStackTrace;

    @l
    private final String lastObservedThreadName;

    @l
    private final String lastObservedThreadState;

    @l
    private final String name;
    private final long sequenceNumber;

    @k
    private final String state;

    public DebuggerInfo(@k i iVar, @k d dVar) {
        Thread.State state;
        p0 p0Var = (p0) dVar.get(p0.f7906b);
        this.coroutineId = p0Var != null ? Long.valueOf(p0Var.H()) : null;
        c cVar = (c) dVar.get(c.f66933w0);
        this.dispatcher = cVar != null ? cVar.toString() : null;
        q0 q0Var = (q0) dVar.get(q0.f7924b);
        this.name = q0Var != null ? q0Var.H() : null;
        this.state = iVar.g();
        Thread thread = iVar.lastObservedThread;
        this.lastObservedThreadState = (thread == null || (state = thread.getState()) == null) ? null : state.toString();
        Thread thread2 = iVar.lastObservedThread;
        this.lastObservedThreadName = thread2 != null ? thread2.getName() : null;
        this.lastObservedStackTrace = iVar.h();
        this.sequenceNumber = iVar.f50930b;
    }

    @l
    public final Long getCoroutineId() {
        return this.coroutineId;
    }

    @l
    public final String getDispatcher() {
        return this.dispatcher;
    }

    @k
    public final List<StackTraceElement> getLastObservedStackTrace() {
        return this.lastObservedStackTrace;
    }

    @l
    public final String getLastObservedThreadName() {
        return this.lastObservedThreadName;
    }

    @l
    public final String getLastObservedThreadState() {
        return this.lastObservedThreadState;
    }

    @l
    public final String getName() {
        return this.name;
    }

    public final long getSequenceNumber() {
        return this.sequenceNumber;
    }

    @k
    public final String getState() {
        return this.state;
    }
}

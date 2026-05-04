package com.baicizhan.main.unity;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@Keep
/* loaded from: classes4.dex */
public final class CallFrame {
    public static final int $stable = 0;

    @k
    private final String FrameId;

    @k
    private final String Method;

    public CallFrame(@k String FrameId, @k String Method) {
        g0.p(FrameId, "FrameId");
        g0.p(Method, "Method");
        this.FrameId = FrameId;
        this.Method = Method;
    }

    public static /* synthetic */ CallFrame copy$default(CallFrame callFrame, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = callFrame.FrameId;
        }
        if ((i11 & 2) != 0) {
            str2 = callFrame.Method;
        }
        return callFrame.copy(str, str2);
    }

    @k
    public final String component1() {
        return this.FrameId;
    }

    @k
    public final String component2() {
        return this.Method;
    }

    @k
    public final CallFrame copy(@k String FrameId, @k String Method) {
        g0.p(FrameId, "FrameId");
        g0.p(Method, "Method");
        return new CallFrame(FrameId, Method);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CallFrame)) {
            return false;
        }
        CallFrame callFrame = (CallFrame) obj;
        return g0.g(this.FrameId, callFrame.FrameId) && g0.g(this.Method, callFrame.Method);
    }

    @k
    public final String getFrameId() {
        return this.FrameId;
    }

    @k
    public final String getMethod() {
        return this.Method;
    }

    public int hashCode() {
        return (this.FrameId.hashCode() * 31) + this.Method.hashCode();
    }

    @k
    public String toString() {
        return "CallFrame(FrameId=" + this.FrameId + ", Method=" + this.Method + j.f81007d;
    }
}

package com.baicizhan.main.unity.data;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@Keep
/* loaded from: classes4.dex */
public final class UnityMessage {
    public static final int $stable = 8;
    private final int code;

    @k
    private final String command;

    @k
    private final String mid;

    @l
    private final Object payload;
    private final long timestamp;
    private final int type;

    public UnityMessage(@k String mid, int i11, @k String command, long j11, int i12, @l Object obj) {
        g0.p(mid, "mid");
        g0.p(command, "command");
        this.mid = mid;
        this.type = i11;
        this.command = command;
        this.timestamp = j11;
        this.code = i12;
        this.payload = obj;
    }

    public static /* synthetic */ UnityMessage copy$default(UnityMessage unityMessage, String str, int i11, String str2, long j11, int i12, Object obj, int i13, Object obj2) {
        if ((i13 & 1) != 0) {
            str = unityMessage.mid;
        }
        if ((i13 & 2) != 0) {
            i11 = unityMessage.type;
        }
        if ((i13 & 4) != 0) {
            str2 = unityMessage.command;
        }
        if ((i13 & 8) != 0) {
            j11 = unityMessage.timestamp;
        }
        if ((i13 & 16) != 0) {
            i12 = unityMessage.code;
        }
        if ((i13 & 32) != 0) {
            obj = unityMessage.payload;
        }
        long j12 = j11;
        String str3 = str2;
        return unityMessage.copy(str, i11, str3, j12, i12, obj);
    }

    @k
    public final String component1() {
        return this.mid;
    }

    public final int component2() {
        return this.type;
    }

    @k
    public final String component3() {
        return this.command;
    }

    public final long component4() {
        return this.timestamp;
    }

    public final int component5() {
        return this.code;
    }

    @l
    public final Object component6() {
        return this.payload;
    }

    @k
    public final UnityMessage copy(@k String mid, int i11, @k String command, long j11, int i12, @l Object obj) {
        g0.p(mid, "mid");
        g0.p(command, "command");
        return new UnityMessage(mid, i11, command, j11, i12, obj);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnityMessage)) {
            return false;
        }
        UnityMessage unityMessage = (UnityMessage) obj;
        return g0.g(this.mid, unityMessage.mid) && this.type == unityMessage.type && g0.g(this.command, unityMessage.command) && this.timestamp == unityMessage.timestamp && this.code == unityMessage.code && g0.g(this.payload, unityMessage.payload);
    }

    public final int getCode() {
        return this.code;
    }

    @k
    public final String getCommand() {
        return this.command;
    }

    @k
    public final String getMid() {
        return this.mid;
    }

    @l
    public final Object getPayload() {
        return this.payload;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = ((((((((this.mid.hashCode() * 31) + Integer.hashCode(this.type)) * 31) + this.command.hashCode()) * 31) + Long.hashCode(this.timestamp)) * 31) + Integer.hashCode(this.code)) * 31;
        Object obj = this.payload;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    @k
    public String toString() {
        return "UnityMessage(mid=" + this.mid + ", type=" + this.type + ", command=" + this.command + ", timestamp=" + this.timestamp + ", code=" + this.code + ", payload=" + this.payload + j.f81007d;
    }

    public /* synthetic */ UnityMessage(String str, int i11, String str2, long j11, int i12, Object obj, int i13, v vVar) {
        this(str, i11, str2, j11, (i13 & 16) != 0 ? -1 : i12, (i13 & 32) != 0 ? null : obj);
    }
}

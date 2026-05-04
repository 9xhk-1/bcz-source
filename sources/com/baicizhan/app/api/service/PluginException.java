package com.baicizhan.app.api.service;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class PluginException extends Exception {
    private final int code;

    @k
    private final String msg;

    /* renamed from: throws, reason: not valid java name */
    @l
    private final Throwable f37throws;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PluginException(int i11, @k String msg, @l Throwable th2) {
        super(msg, th2);
        g0.p(msg, "msg");
        this.code = i11;
        this.msg = msg;
        this.f37throws = th2;
    }

    public static /* synthetic */ PluginException copy$default(PluginException pluginException, int i11, String str, Throwable th2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = pluginException.code;
        }
        if ((i12 & 2) != 0) {
            str = pluginException.msg;
        }
        if ((i12 & 4) != 0) {
            th2 = pluginException.f37throws;
        }
        return pluginException.copy(i11, str, th2);
    }

    public final int component1() {
        return this.code;
    }

    @k
    public final String component2() {
        return this.msg;
    }

    @l
    public final Throwable component3() {
        return this.f37throws;
    }

    @k
    public final PluginException copy(int i11, @k String msg, @l Throwable th2) {
        g0.p(msg, "msg");
        return new PluginException(i11, msg, th2);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PluginException)) {
            return false;
        }
        PluginException pluginException = (PluginException) obj;
        return this.code == pluginException.code && g0.g(this.msg, pluginException.msg) && g0.g(this.f37throws, pluginException.f37throws);
    }

    public final int getCode() {
        return this.code;
    }

    @k
    public final String getMsg() {
        return this.msg;
    }

    @l
    public final Throwable getThrows() {
        return this.f37throws;
    }

    public int hashCode() {
        int hashCode = ((Integer.hashCode(this.code) * 31) + this.msg.hashCode()) * 31;
        Throwable th2 = this.f37throws;
        return hashCode + (th2 == null ? 0 : th2.hashCode());
    }

    @Override // java.lang.Throwable
    @k
    public String toString() {
        return "PluginException(code=" + this.code + ", msg=" + this.msg + ", throws=" + this.f37throws + ')';
    }

    public /* synthetic */ PluginException(int i11, String str, Throwable th2, int i12, v vVar) {
        this(i11, str, (i12 & 4) != 0 ? null : th2);
    }
}

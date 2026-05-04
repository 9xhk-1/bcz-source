package com.baicizhan.app.biz.base;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class BizInternalException extends RuntimeException {
    private int code;

    @k
    private String msg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BizInternalException(@l String str, @k Throwable throwable, int i11) {
        super(str, throwable);
        g0.p(throwable, "throwable");
        this.code = i11;
        this.msg = str == null ? "出错了~~" : str;
    }

    public final int getCode() {
        return this.code;
    }

    @k
    public final String getMsg() {
        return this.msg;
    }

    public final void setCode(int i11) {
        this.code = i11;
    }

    public final void setMsg(@k String str) {
        g0.p(str, "<set-?>");
        this.msg = str;
    }

    public /* synthetic */ BizInternalException(String str, Throwable th2, int i11, int i12, v vVar) {
        this(str, (i12 & 2) != 0 ? new RuntimeException("default") : th2, (i12 & 4) != 0 ? 0 : i11);
    }
}

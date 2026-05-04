package com.alipay.sdk.m.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class c extends b {

    /* renamed from: f, reason: collision with root package name */
    public final String f10570f;

    public c(String str) {
        this.f10570f = str;
    }

    @Override // com.alipay.sdk.m.h.b
    public void a() throws Exception {
        this.f10567a = (byte) 1;
        byte[] bytes = this.f10570f.getBytes("UTF-8");
        this.f10569c = bytes;
        this.f10568b = (byte) bytes.length;
    }
}

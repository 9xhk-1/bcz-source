package com.huawei.hms.jos;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class AntiAddictionCallbackInstance {

    /* renamed from: b, reason: collision with root package name */
    private static AntiAddictionCallbackInstance f36030b = new AntiAddictionCallbackInstance();

    /* renamed from: a, reason: collision with root package name */
    private AntiAddictionCallback f36031a;

    private AntiAddictionCallbackInstance() {
    }

    public static AntiAddictionCallbackInstance getInstance() {
        return f36030b;
    }

    public AntiAddictionCallback getAntiAddictionCallback() {
        return this.f36031a;
    }

    public void setAntiAddictionCallback(AntiAddictionCallback antiAddictionCallback) {
        this.f36031a = antiAddictionCallback;
    }
}

package com.huawei.hms.jos;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class ExitCallbackInstance {

    /* renamed from: a, reason: collision with root package name */
    private ExitCallback f36056a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private static final ExitCallbackInstance f36057a = new ExitCallbackInstance();
    }

    private ExitCallbackInstance() {
    }

    public static synchronized ExitCallbackInstance getInstance() {
        ExitCallbackInstance exitCallbackInstance;
        synchronized (ExitCallbackInstance.class) {
            exitCallbackInstance = b.f36057a;
        }
        return exitCallbackInstance;
    }

    public ExitCallback getCallBack() {
        return this.f36056a;
    }

    public void setCallBack(ExitCallback exitCallback) {
        this.f36056a = exitCallback;
    }
}

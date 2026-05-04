package com.huawei.hms.jos;

import com.huawei.hms.support.account.request.AccountAuthParams;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class AppParams {

    /* renamed from: a, reason: collision with root package name */
    private AccountAuthParams f36032a;

    /* renamed from: b, reason: collision with root package name */
    private AntiAddictionCallback f36033b;

    /* renamed from: c, reason: collision with root package name */
    private String f36034c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f36035d = true;

    /* renamed from: e, reason: collision with root package name */
    private CallerInfo f36036e;

    /* renamed from: f, reason: collision with root package name */
    private ExitCallback f36037f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        private AccountAuthParams f36038a;

        /* renamed from: b, reason: collision with root package name */
        private AntiAddictionCallback f36039b;

        /* renamed from: c, reason: collision with root package name */
        private String f36040c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f36041d = true;

        /* renamed from: e, reason: collision with root package name */
        private CallerInfo f36042e;

        /* renamed from: f, reason: collision with root package name */
        private ExitCallback f36043f;

        public AppParams build() {
            AppParams appParams = new AppParams();
            appParams.setAuthScope(this.f36038a);
            appParams.setAntiAddictionCallback(this.f36039b);
            appParams.setChannelId(this.f36040c);
            appParams.setShowLoginLoading(Boolean.valueOf(this.f36041d));
            appParams.setCallerInfo(this.f36042e);
            appParams.setExitCallback(this.f36043f);
            return appParams;
        }

        public Builder setAntiAddictionCallback(AntiAddictionCallback antiAddictionCallback) {
            this.f36039b = antiAddictionCallback;
            return this;
        }

        public Builder setAuthScope(AccountAuthParams accountAuthParams) {
            this.f36038a = accountAuthParams;
            return this;
        }

        public Builder setCallerInfo(CallerInfo callerInfo) {
            this.f36042e = callerInfo;
            return this;
        }

        public Builder setChannelId(String str) {
            this.f36040c = str;
            return this;
        }

        public Builder setExitCallback(ExitCallback exitCallback) {
            this.f36043f = exitCallback;
            return this;
        }

        public Builder setShowLoginLoading(Boolean bool) {
            this.f36041d = bool.booleanValue();
            return this;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class CallerInfo {

        /* renamed from: a, reason: collision with root package name */
        private String f36044a;

        /* renamed from: b, reason: collision with root package name */
        private String f36045b;

        public CallerInfo(String str, String str2) {
            this.f36044a = str;
            this.f36045b = str2;
        }

        public String getGepInfo() {
            return this.f36045b;
        }

        public String getThirdId() {
            return this.f36044a;
        }
    }

    public AppParams() {
    }

    public AntiAddictionCallback getAntiAddictionCallback() {
        return this.f36033b;
    }

    public AccountAuthParams getAuthScope() {
        return this.f36032a;
    }

    public CallerInfo getCallerInfo() {
        return this.f36036e;
    }

    public String getChannelId() {
        return this.f36034c;
    }

    public ExitCallback getExitCallback() {
        return this.f36037f;
    }

    public boolean getShowLoginLoading() {
        return this.f36035d;
    }

    public void setAntiAddictionCallback(AntiAddictionCallback antiAddictionCallback) {
        this.f36033b = antiAddictionCallback;
    }

    public void setAuthScope(AccountAuthParams accountAuthParams) {
        this.f36032a = accountAuthParams;
    }

    public void setCallerInfo(CallerInfo callerInfo) {
        this.f36036e = callerInfo;
    }

    public void setChannelId(String str) {
        this.f36034c = str;
    }

    public void setExitCallback(ExitCallback exitCallback) {
        this.f36037f = exitCallback;
        ExitCallbackInstance.getInstance().setCallBack(exitCallback);
    }

    public void setShowLoginLoading(Boolean bool) {
        this.f36035d = bool.booleanValue();
    }

    public AppParams(AccountAuthParams accountAuthParams) {
        this.f36032a = accountAuthParams;
    }

    public AppParams(AccountAuthParams accountAuthParams, AntiAddictionCallback antiAddictionCallback) {
        this.f36032a = accountAuthParams;
        this.f36033b = antiAddictionCallback;
    }
}

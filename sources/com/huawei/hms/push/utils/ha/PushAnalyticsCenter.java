package com.huawei.hms.push.utils.ha;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class PushAnalyticsCenter {

    /* renamed from: a, reason: collision with root package name */
    public PushBaseAnalytics f36232a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static PushAnalyticsCenter f36233a = new PushAnalyticsCenter();
    }

    public static PushAnalyticsCenter getInstance() {
        return a.f36233a;
    }

    public PushBaseAnalytics getPushAnalytics() {
        return this.f36232a;
    }

    public void register(PushBaseAnalytics pushBaseAnalytics) {
        this.f36232a = pushBaseAnalytics;
    }
}

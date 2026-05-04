package com.huawei.hms.jos.apps;

import android.app.Activity;
import android.content.Context;
import com.huawei.hms.api.Api;
import com.huawei.hms.jos.JosBaseClientImpl;
import com.huawei.hms.jos.JosClientBuilder;
import com.huawei.hms.jos.JosOptions;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class AppsBaseClientImpl extends JosBaseClientImpl {

    /* renamed from: c, reason: collision with root package name */
    private static final AppsClientBuilder f36065c = new AppsClientBuilder();

    /* renamed from: d, reason: collision with root package name */
    private static final Api<JosOptions> f36066d = new Api<>("HuaweiApp.API");

    public AppsBaseClientImpl(Activity activity) {
        super(activity, f36066d, new JosOptions(), (JosClientBuilder) f36065c);
    }

    public AppsBaseClientImpl(Context context) {
        super(context, f36066d, new AppOptions(), f36065c);
    }
}

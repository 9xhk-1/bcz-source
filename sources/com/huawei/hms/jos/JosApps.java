package com.huawei.hms.jos;

import android.app.Activity;
import android.content.Context;
import com.huawei.hms.jos.manager.InnerActivityManager;
import com.huawei.hms.jos.product.ProductClient;
import com.huawei.hms.jos.product.ProductClientImpl;
import com.huawei.hms.support.hwid.result.AuthHuaweiId;
import com.huawei.hms.utils.Checker;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class JosApps {
    public static AppUpdateClient getAppUpdateClient(Activity activity) {
        Checker.assertNonNull(activity);
        InnerActivityManager.get().setCurrentActivity(activity);
        return new AppUpdateClientImpl();
    }

    public static JosAppsClient getJosAppsClient(Activity activity) {
        Checker.assertNonNull(activity);
        InnerActivityManager.get().setCurrentActivity(activity);
        return new a(activity);
    }

    public static ProductClient getProductClient(Activity activity) {
        Checker.assertNonNull(activity);
        InnerActivityManager.get().setCurrentActivity(activity);
        return new ProductClientImpl(activity);
    }

    public static AppUpdateClient getAppUpdateClient(Context context) {
        Checker.assertNonNull(context);
        return new AppUpdateClientImpl();
    }

    @Deprecated
    public static JosAppsClient getJosAppsClient(Activity activity, AuthHuaweiId authHuaweiId) {
        Checker.assertNonNull(activity);
        InnerActivityManager.get().setCurrentActivity(activity);
        return new a(activity);
    }

    @Deprecated
    public static ProductClient getProductClient(Context context) {
        Checker.assertNonNull(context);
        return new ProductClientImpl(context);
    }
}

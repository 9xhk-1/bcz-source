package com.huawei.hms.apptouch;

import android.content.Context;
import android.content.Intent;
import fr.k;
import java.util.List;

/* loaded from: classes7.dex */
public interface AppTouchClient {
    k<AppInfo> getAppInfo();

    k<AppInfo> getAppInfoByName(String str);

    List<String> getHMSPackageName(Context context);

    Intent getResolveErrorIntent(Context context);

    boolean hasPrivacy();

    int isHMSCoreAvailable(Context context);

    k<AppInfoSetResponse> setAppInfos(List<AppInfo> list);
}

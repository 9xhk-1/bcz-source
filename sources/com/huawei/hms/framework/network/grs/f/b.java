package com.huawei.hms.framework.network.grs.f;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.AssetsUtil;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.network.grs.GrsApp;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class b {

    /* renamed from: b, reason: collision with root package name */
    private static final Map<String, b> f35657b = new ConcurrentHashMap(16);

    /* renamed from: c, reason: collision with root package name */
    private static final Object f35658c = new Object();

    /* renamed from: a, reason: collision with root package name */
    private a f35659a;

    public b(Context context, boolean z11) {
        a(context, z11);
        f35657b.put(context.getPackageName(), this);
    }

    public static b a(String str) {
        return f35657b.get(str);
    }

    public Set<String> b() {
        return this.f35659a.b();
    }

    public com.huawei.hms.framework.network.grs.local.model.a a() {
        return this.f35659a.a();
    }

    public String a(Context context, com.huawei.hms.framework.network.grs.e.a aVar, GrsBaseInfo grsBaseInfo, String str, String str2, boolean z11) {
        String a11;
        synchronized (f35658c) {
            a11 = this.f35659a.a(context, aVar, grsBaseInfo, str, str2, z11);
        }
        return a11;
    }

    public Map<String, String> a(Context context, com.huawei.hms.framework.network.grs.e.a aVar, GrsBaseInfo grsBaseInfo, String str, boolean z11) {
        Map<String, String> a11;
        synchronized (f35658c) {
            a11 = this.f35659a.a(context, aVar, grsBaseInfo, str, z11);
        }
        return a11;
    }

    private void a(Context context, boolean z11) {
        long currentTimeMillis;
        String[] split;
        StringBuilder sb2;
        long currentTimeMillis2 = System.currentTimeMillis();
        String a11 = com.huawei.hms.framework.network.grs.h.c.a("grs_route_config_files_list.txt", context);
        Logger.i("LocalManagerProxy", "Io.getConfigContent timeCost:" + (System.currentTimeMillis() - currentTimeMillis2));
        Logger.i("LocalManagerProxy", "initLocalManager configFileListContent:" + a11);
        if (TextUtils.isEmpty(a11)) {
            Logger.i("LocalManagerProxy", "Get config files list by AssetsManager");
            currentTimeMillis = System.currentTimeMillis();
            split = AssetsUtil.list(context, GrsApp.getInstance().getBrand(""));
            sb2 = new StringBuilder();
        } else {
            currentTimeMillis = System.currentTimeMillis();
            Logger.i("LocalManagerProxy", "Get config files list use configFileListContent: " + a11);
            split = a11.split("#");
            sb2 = new StringBuilder();
        }
        sb2.append("list timeCost:");
        sb2.append(System.currentTimeMillis() - currentTimeMillis);
        Logger.i("LocalManagerProxy", sb2.toString());
        List<String> arrayList = split == null ? new ArrayList<>() : Arrays.asList(split);
        String appConfigName = GrsApp.getInstance().getAppConfigName();
        Logger.i("LocalManagerProxy", "appConfigName is: " + appConfigName);
        Logger.i("LocalManagerProxy", "contains APP_20_CONFIG_FILE_NAME: " + arrayList.contains("grs_app_global_route_config.json"));
        this.f35659a = new d(false, z11);
        if (arrayList.contains("grs_app_global_route_config.json") || !TextUtils.isEmpty(appConfigName)) {
            this.f35659a = new d(context, appConfigName, z11);
        }
        if (!this.f35659a.c() && arrayList.contains("grs_sdk_global_route_config.json")) {
            this.f35659a = new c(context, z11);
        }
        this.f35659a.a(context, arrayList);
        StringBuilder sb3 = new StringBuilder();
        sb3.append("on initLocalManager finish, check appGrs: ");
        sb3.append(this.f35659a.f35652a == null);
        Logger.i("LocalManagerProxy", sb3.toString());
    }
}

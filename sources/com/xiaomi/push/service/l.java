package com.xiaomi.push.service;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import java.util.List;
import org.junit.jupiter.api.j2;

/* loaded from: classes8.dex */
public class l {
    public static ComponentName a(Context context, Intent intent) {
        if (intent == null) {
            return null;
        }
        try {
            ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent, 65536);
            if (resolveActivity == null) {
                return null;
            }
            ActivityInfo activityInfo = resolveActivity.activityInfo;
            return new ComponentName(activityInfo.packageName, activityInfo.name);
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean b(Context context, String str) {
        boolean z11 = false;
        try {
            List<ProviderInfo> queryContentProviders = context.getPackageManager().queryContentProviders((String) null, 0, 8);
            if (queryContentProviders != null && !queryContentProviders.isEmpty()) {
                for (ProviderInfo providerInfo : queryContentProviders) {
                    if (providerInfo.enabled && providerInfo.exported && providerInfo.authority.equals(str)) {
                        z11 = true;
                    }
                }
            }
            return z11;
        } catch (Exception e11) {
            com.xiaomi.channel.commonutils.logger.b.m5639a("checkProvider " + e11);
            return z11;
        }
    }

    public static boolean a(Context context, ComponentName componentName) {
        try {
            new Intent().setComponent(componentName);
            context.getPackageManager().getActivityInfo(componentName, 128);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean b(Context context, String str, String str2) {
        try {
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent(str2);
            intent.setPackage(str);
            return packageManager.resolveActivity(intent, 65536) != null;
        } catch (Exception e11) {
            com.xiaomi.channel.commonutils.logger.b.m5639a("checkActivity action: " + str2 + j2.O + e11);
            return false;
        }
    }

    public static boolean a(Context context, String str) {
        try {
            ServiceInfo[] serviceInfoArr = context.getPackageManager().getPackageInfo(str, 4).services;
            if (serviceInfoArr != null) {
                for (ServiceInfo serviceInfo : serviceInfoArr) {
                    if (serviceInfo.exported && serviceInfo.enabled && "com.xiaomi.mipush.sdk.PushMessageHandler".equals(serviceInfo.name) && !context.getPackageName().equals(serviceInfo.packageName)) {
                        return true;
                    }
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException e11) {
            com.xiaomi.channel.commonutils.logger.b.m5639a("checkService " + e11);
            return false;
        }
    }

    public static boolean a(Context context, String str, String str2) {
        try {
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent(str2);
            intent.setPackage(str);
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 32);
            if (queryIntentServices != null) {
                if (!queryIntentServices.isEmpty()) {
                    return true;
                }
            }
            return false;
        } catch (Exception e11) {
            com.xiaomi.channel.commonutils.logger.b.m5639a("checkService action: " + str2 + j2.O + e11);
            return false;
        }
    }
}

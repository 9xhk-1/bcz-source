package com.vivo.push.d;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
final class f extends com.vivo.push.l {
    public f(com.vivo.push.o oVar) {
        super(oVar);
    }

    public static boolean a(Context context) {
        Intent intent = new Intent("com.vivo.pushservice.action.PUSH_SERVICE");
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(intent, 576);
        if (queryIntentServices == null || queryIntentServices.size() <= 0) {
            com.vivo.push.util.p.a("OnChangePushStatusTask", "enableService error: can not find push service.");
            return false;
        }
        PackageManager packageManager = context.getPackageManager();
        ComponentName componentName = new ComponentName(context, queryIntentServices.get(0).serviceInfo.name);
        if (packageManager.getComponentEnabledSetting(componentName) == 1) {
            com.vivo.push.util.p.d("OnChangePushStatusTask", "push service has enabled");
            return false;
        }
        packageManager.setComponentEnabledSetting(componentName, 1, 1);
        com.vivo.push.util.p.d("OnChangePushStatusTask", "enableService push service.");
        return true;
    }

    public static boolean b(Context context) {
        Intent intent = new Intent("com.vivo.pushservice.action.PUSH_SERVICE");
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(intent, 576);
        if (queryIntentServices == null || queryIntentServices.size() <= 0) {
            com.vivo.push.util.p.a("OnChangePushStatusTask", "disableService error: can not find push service.");
            return false;
        }
        PackageManager packageManager = context.getPackageManager();
        ComponentName componentName = new ComponentName(context, queryIntentServices.get(0).serviceInfo.name);
        if (packageManager.getComponentEnabledSetting(componentName) == 2) {
            com.vivo.push.util.p.d("OnChangePushStatusTask", "push service has disabled");
            return false;
        }
        packageManager.setComponentEnabledSetting(componentName, 2, 1);
        com.vivo.push.util.p.d("OnChangePushStatusTask", "disableService push service.");
        return true;
    }

    private static List<ResolveInfo> c(Context context) {
        List<ResolveInfo> list;
        Intent intent = new Intent("com.vivo.pushservice.action.RECEIVE");
        intent.setPackage(context.getPackageName());
        try {
            list = context.getPackageManager().queryBroadcastReceivers(intent, 576);
        } catch (Exception unused) {
            list = null;
        }
        if (list != null && list.size() > 0) {
            return list;
        }
        Intent intent2 = new Intent("com.vivo.pushclient.action.RECEIVE");
        intent2.setPackage(context.getPackageName());
        try {
            return context.getPackageManager().queryBroadcastReceivers(intent2, 576);
        } catch (Exception unused2) {
            return list;
        }
    }

    @Override // com.vivo.push.l
    public final void a(com.vivo.push.o oVar) {
        if (this.f45035a.getPackageName().equals(com.vivo.push.util.t.b(this.f45035a))) {
            return;
        }
        com.vivo.push.b.j jVar = (com.vivo.push.b.j) oVar;
        int d11 = jVar.d();
        int e11 = jVar.e();
        com.vivo.push.util.p.d("OnChangePushStatusTask", "OnChangePushStatusTask serviceStatus is " + d11 + " ; receiverStatus is " + e11);
        if (d11 == 2) {
            b(this.f45035a);
        } else if (d11 == 1) {
            a(this.f45035a);
        } else if (d11 == 0) {
            Context context = this.f45035a;
            Intent intent = new Intent("com.vivo.pushservice.action.PUSH_SERVICE");
            intent.setPackage(context.getPackageName());
            List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(intent, 576);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                PackageManager packageManager = context.getPackageManager();
                ComponentName componentName = new ComponentName(context, queryIntentServices.get(0).serviceInfo.name);
                if (packageManager.getComponentEnabledSetting(componentName) != 0) {
                    packageManager.setComponentEnabledSetting(componentName, 0, 1);
                    com.vivo.push.util.p.d("OnChangePushStatusTask", "defaultService push service.");
                } else {
                    com.vivo.push.util.p.d("OnChangePushStatusTask", "push service has defaulted");
                }
            } else {
                com.vivo.push.util.p.a("OnChangePushStatusTask", "defaultService error: can not find push service.");
            }
        }
        if (e11 == 2) {
            Context context2 = this.f45035a;
            List<ResolveInfo> c11 = c(context2);
            if (c11 != null && c11.size() > 0) {
                String str = c11.get(0).activityInfo.name;
                if (TextUtils.isEmpty(str)) {
                    com.vivo.push.util.p.d("OnChangePushStatusTask", "disableReceiver error: className is null. ");
                } else {
                    PackageManager packageManager2 = context2.getPackageManager();
                    ComponentName componentName2 = new ComponentName(context2, str);
                    if (packageManager2.getComponentEnabledSetting(componentName2) != 2) {
                        packageManager2.setComponentEnabledSetting(componentName2, 2, 1);
                        com.vivo.push.util.p.d("OnChangePushStatusTask", "push service disableReceiver ");
                    } else {
                        com.vivo.push.util.p.d("OnChangePushStatusTask", "push service has disableReceiver ");
                    }
                }
            } else {
                com.vivo.push.util.p.a("OnChangePushStatusTask", "disableReceiver error: can not find push service.");
            }
            com.vivo.push.sdk.a.a().b();
            return;
        }
        if (e11 == 1) {
            Context context3 = this.f45035a;
            List<ResolveInfo> c12 = c(context3);
            if (c12 != null && c12.size() > 0) {
                String str2 = c12.get(0).activityInfo.name;
                if (TextUtils.isEmpty(str2)) {
                    com.vivo.push.util.p.d("OnChangePushStatusTask", "enableReceiver error: className is null. ");
                    return;
                }
                PackageManager packageManager3 = context3.getPackageManager();
                ComponentName componentName3 = new ComponentName(context3, str2);
                if (packageManager3.getComponentEnabledSetting(componentName3) != 1) {
                    packageManager3.setComponentEnabledSetting(componentName3, 1, 1);
                    com.vivo.push.util.p.d("OnChangePushStatusTask", "push service enableReceiver ");
                    return;
                } else {
                    com.vivo.push.util.p.d("OnChangePushStatusTask", "push service has enableReceiver ");
                    return;
                }
            }
            com.vivo.push.util.p.a("OnChangePushStatusTask", "enableReceiver error: can not find push service.");
            return;
        }
        if (e11 == 0) {
            Context context4 = this.f45035a;
            List<ResolveInfo> c13 = c(context4);
            if (c13 != null && c13.size() > 0) {
                String str3 = c13.get(0).activityInfo.name;
                if (TextUtils.isEmpty(str3)) {
                    com.vivo.push.util.p.d("OnChangePushStatusTask", "defaultReceiver error: className is null. ");
                    return;
                }
                PackageManager packageManager4 = context4.getPackageManager();
                ComponentName componentName4 = new ComponentName(context4, str3);
                if (packageManager4.getComponentEnabledSetting(componentName4) != 0) {
                    packageManager4.setComponentEnabledSetting(componentName4, 0, 1);
                    com.vivo.push.util.p.d("OnChangePushStatusTask", "push service defaultReceiver ");
                    return;
                } else {
                    com.vivo.push.util.p.d("OnChangePushStatusTask", "push service has defaulted");
                    return;
                }
            }
            com.vivo.push.util.p.a("OnChangePushStatusTask", "defaultReceiver error: can not find push service.");
        }
    }
}

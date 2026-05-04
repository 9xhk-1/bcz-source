package com.huawei.hms.update.manager;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AndroidException;
import com.huawei.hms.activity.BridgeActivity;
import com.huawei.hms.android.SystemUtils;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.update.UpdateConstants;
import com.huawei.hms.update.ui.AbsUpdateWizard;
import com.huawei.hms.update.ui.AppTouchWizard;
import com.huawei.hms.update.ui.UpdateBean;
import com.huawei.hms.utils.AgHmsUpdateState;
import com.huawei.hms.utils.HMSPackageManager;
import com.huawei.hms.utils.PackageManagerHelper;
import com.huawei.hms.utils.RegionUtils;
import com.huawei.hms.utils.ResourceLoaderUtil;
import com.huawei.hms.utils.StringUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class UpdateManager {
    private static boolean a(Context context, String str) {
        PackageManagerHelper.PackageStates packageStates = new PackageManagerHelper(context).getPackageStates(str);
        HMSLog.i("UpdateManager", "app is: " + str + ";status is:" + packageStates);
        return PackageManagerHelper.PackageStates.ENABLED == packageStates;
    }

    private static boolean b(Context context) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            applicationInfo = context.getPackageManager().getPackageInfo("com.huawei.appmarket", 128).applicationInfo;
        } catch (AndroidException e11) {
            HMSLog.e("UpdateManager", "In isAgNewVersion, Failed to read meta data from base version setting channel.", e11);
        } catch (RuntimeException e12) {
            HMSLog.e("UpdateManager", "In isAgNewVersion, Failed to read meta data from base version setting channel.", e12);
        }
        if (applicationInfo != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("com.huawei.hms.client.service.name:base")) {
            String string = applicationInfo.metaData.getString("com.huawei.hms.client.service.name:base");
            if (!TextUtils.isEmpty(string) && string.split(":").length == 2) {
                if (StringUtil.convertVersion2Integer(string.split(":")[1]) >= 50004100) {
                    return true;
                }
                HMSLog.i("UpdateManager", "In isAgNewVersion, configuration not found for base version setting");
                return false;
            }
            HMSLog.i("UpdateManager", "In isAgNewVersion, configuration not found for base version setting");
            return false;
        }
        HMSLog.i("UpdateManager", "In isAgNewVersion, configuration not found for base version setting");
        return false;
    }

    private static void c(Context context, ArrayList<Integer> arrayList) {
        if (!AgHmsUpdateState.getInstance().isUpdateHms() && a(context, "com.huawei.appmarket") && !"com.huawei.appmarket".equals(context.getPackageName()) && b(context)) {
            arrayList.add(5);
        } else if (!c(context)) {
            arrayList.add(6);
        } else {
            arrayList.add(7);
            arrayList.add(6);
        }
    }

    public static Intent getStartUpdateIntent(Activity activity, UpdateBean updateBean) {
        int i11;
        if (activity == null || updateBean == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        a((ArrayList<Integer>) arrayList);
        if (TextUtils.isEmpty(updateBean.getClientAppName())) {
            a(activity, (ArrayList<Integer>) arrayList);
        } else {
            a((Context) activity, (ArrayList<Integer>) arrayList);
        }
        if (arrayList.size() > 0) {
            i11 = ((Integer) arrayList.get(0)).intValue();
        } else {
            HMSLog.i("UpdateManager", "typeList is empty, no upgrade solution");
            i11 = -2;
        }
        updateBean.setTypeList(arrayList);
        Intent intentStartBridgeActivity = BridgeActivity.getIntentStartBridgeActivity(activity, AbsUpdateWizard.getClassName(i11));
        intentStartBridgeActivity.putExtra(BridgeActivity.EXTRA_DELEGATE_UPDATE_INFO, updateBean);
        return intentStartBridgeActivity;
    }

    public static void startUpdate(Activity activity, int i11, UpdateBean updateBean) {
        Intent startUpdateIntent = getStartUpdateIntent(activity, updateBean);
        if (startUpdateIntent != null) {
            activity.startActivityForResult(startUpdateIntent, i11);
        }
    }

    public static Intent startUpdateIntent(Activity activity) {
        if (activity == null) {
            HMSLog.i("UpdateManager", "<startUpdateIntent> activity is null");
            return null;
        }
        UpdateBean updateBean = new UpdateBean();
        updateBean.setHmsOrApkUpgrade(true);
        updateBean.setClientPackageName(HMSPackageManager.getInstance(activity.getApplicationContext()).getHMSPackageName());
        if (TextUtils.isEmpty(updateBean.getClientPackageName())) {
            updateBean.setClientPackageName("com.huawei.hwid");
        }
        updateBean.setClientVersionCode(HMSPackageManager.getInstance(activity.getApplicationContext()).getHmsVersionCode());
        updateBean.setClientAppId("C10132067");
        updateBean.setNeedConfirm(false);
        if (ResourceLoaderUtil.getmContext() == null) {
            ResourceLoaderUtil.setmContext(activity.getApplicationContext());
        }
        updateBean.setClientAppName(ResourceLoaderUtil.getString("hms_update_title"));
        return a(activity, updateBean);
    }

    private static Intent a(Activity activity, UpdateBean updateBean) {
        int i11;
        Intent intentStartBridgeActivity;
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(updateBean.getClientAppName())) {
            a((Context) activity, (ArrayList<Integer>) arrayList);
        } else {
            a(activity, (ArrayList<Integer>) arrayList);
        }
        updateBean.setTypeList(arrayList);
        if (arrayList.size() > 1) {
            intentStartBridgeActivity = BridgeActivity.getIntentStartBridgeActivity(activity, AbsUpdateWizard.getClassName(((Integer) arrayList.get(1)).intValue()));
        } else {
            if (arrayList.size() > 0) {
                i11 = ((Integer) arrayList.get(0)).intValue();
            } else {
                HMSLog.i("UpdateManager", "typeList is empty, no upgrade solution");
                i11 = -2;
            }
            intentStartBridgeActivity = BridgeActivity.getIntentStartBridgeActivity(activity, AbsUpdateWizard.getClassName(i11));
        }
        intentStartBridgeActivity.putExtra(BridgeActivity.EXTRA_DELEGATE_UPDATE_INFO, updateBean);
        return intentStartBridgeActivity;
    }

    private static boolean c(Context context) {
        List<ResolveInfo> list;
        String str = null;
        try {
            list = context.getPackageManager().queryIntentServices(new Intent(AppTouchWizard.APPTOUCH_UPDATE_HMS_ACTION), 0);
        } catch (Exception e11) {
            HMSLog.e("UpdateManager", "query apptouch action failed. " + e11.getMessage());
            list = null;
        }
        if (list != null && !list.isEmpty()) {
            Iterator<ResolveInfo> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ServiceInfo serviceInfo = it.next().serviceInfo;
                if (serviceInfo != null) {
                    String str2 = serviceInfo.packageName;
                    if (!TextUtils.isEmpty(str2) && SystemUtils.isSystemApp(context.getApplicationContext(), str2)) {
                        str = str2;
                        break;
                    }
                }
            }
        }
        return str != null;
    }

    public static Intent getStartUpdateIntent(Context context, UpdateBean updateBean) {
        int i11;
        if (context == null || updateBean == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        a((ArrayList<Integer>) arrayList);
        if (!TextUtils.isEmpty(updateBean.getClientAppName())) {
            a(context, (ArrayList<Integer>) arrayList);
        } else {
            b(context, arrayList);
        }
        if (arrayList.size() > 0) {
            i11 = ((Integer) arrayList.get(0)).intValue();
        } else {
            HMSLog.i("UpdateManager", "typeList is empty, no upgrade solution");
            i11 = -2;
        }
        updateBean.setTypeList(arrayList);
        Intent intentStartBridgeActivity = BridgeActivity.getIntentStartBridgeActivity(context, AbsUpdateWizard.getClassName(i11));
        intentStartBridgeActivity.putExtra(BridgeActivity.EXTRA_DELEGATE_UPDATE_INFO, updateBean);
        return intentStartBridgeActivity;
    }

    private static void b(Context context, ArrayList<Integer> arrayList) {
        if (!a(context, "com.huawei.appmarket") || "com.huawei.appmarket".equals(context.getPackageName())) {
            return;
        }
        arrayList.add(5);
    }

    private static void a(Context context, ArrayList<Integer> arrayList) {
        if (SystemUtils.isTVDevice()) {
            arrayList.add(5);
            return;
        }
        if (SystemUtils.isSystemApp(context.getApplicationContext(), "com.huawei.appmarket") && a(context) && RegionUtils.isChinaROM(context)) {
            arrayList.clear();
            arrayList.add(0);
            arrayList.add(6);
            return;
        }
        c(context, arrayList);
    }

    private static void a(Activity activity, ArrayList<Integer> arrayList) {
        if (!a(activity, "com.huawei.appmarket") || "com.huawei.appmarket".equals(activity.getPackageName())) {
            return;
        }
        arrayList.add(5);
    }

    private static boolean a(Context context) {
        int packageVersionCode = new PackageManagerHelper(context).getPackageVersionCode("com.huawei.appmarket");
        HMSLog.i("UpdateManager", "getHiappVersion is " + packageVersionCode);
        return ((long) packageVersionCode) >= UpdateConstants.SILENT_INSTALL_VERSION_HIAPP;
    }

    private static void a(ArrayList<Integer> arrayList) {
        String manufacturer = SystemUtils.getManufacturer();
        if (TextUtils.isEmpty(manufacturer) || manufacturer.equalsIgnoreCase("unknown") || manufacturer.equalsIgnoreCase(SystemUtils.PRODUCT_HUAWEI)) {
            return;
        }
        arrayList.add(9);
    }
}

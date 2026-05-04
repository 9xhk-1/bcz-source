package com.huawei.hms.adapter.ui;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.huawei.hms.activity.BridgeActivity;
import com.huawei.hms.activity.IBridgeActivityDelegate;
import com.huawei.hms.adapter.AvailableUtil;
import com.huawei.hms.adapter.internal.CommonCode;
import com.huawei.hms.adapter.sysobs.SystemManager;
import com.huawei.hms.availableupdate.c;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.update.kpms.KpmsConstant;
import com.huawei.hms.update.ui.UpdateBean;
import com.huawei.hms.utils.HMSPackageManager;
import com.huawei.hms.utils.PackageManagerHelper;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class UpdateAdapter implements IBridgeActivityDelegate {

    /* renamed from: a, reason: collision with root package name */
    private WeakReference<Activity> f35325a;

    /* renamed from: b, reason: collision with root package name */
    private Context f35326b;

    /* renamed from: c, reason: collision with root package name */
    private int f35327c;

    /* renamed from: d, reason: collision with root package name */
    private UpdateBean f35328d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f35329e = false;

    private static Object a(String str, String str2, Object[] objArr) throws Throwable {
        if (TextUtils.isEmpty(str)) {
            HMSLog.e("UpdateAdapter", "className is empty.");
            return null;
        }
        if (TextUtils.isEmpty(str2)) {
            HMSLog.e("UpdateAdapter", "methodName is empty.");
            return null;
        }
        if (objArr == null) {
            HMSLog.e("UpdateAdapter", "args is null.");
            return null;
        }
        Class<?>[] clsArr = new Class[objArr.length];
        for (int i11 = 0; i11 < objArr.length; i11++) {
            Object obj = objArr[i11];
            if (obj instanceof Activity) {
                clsArr[i11] = Activity.class;
            } else if (obj instanceof Context) {
                clsArr[i11] = Context.class;
            } else if (obj instanceof UpdateBean) {
                clsArr[i11] = UpdateBean.class;
            } else if (obj instanceof Integer) {
                clsArr[i11] = Integer.TYPE;
            } else if (obj instanceof Boolean) {
                clsArr[i11] = Boolean.TYPE;
            } else {
                HMSLog.e("UpdateAdapter", "not set args[" + i11 + "] type");
            }
        }
        Class<?> cls = Class.forName(str);
        return cls.getMethod(str2, clsArr).invoke(cls.getDeclaredConstructor(null).newInstance(null), objArr);
    }

    private Activity b() {
        WeakReference<Activity> weakReference = this.f35325a;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    private void c() {
        SystemManager.getInstance().notifyUpdateResult(8);
        a();
    }

    public static Object invokeMethod(String str, String str2, Object[] objArr) {
        try {
            return a(str, str2, objArr);
        } catch (Throwable th2) {
            HMSLog.e("UpdateAdapter", "invoke " + str + "." + str2 + " fail. " + th2.getMessage());
            return null;
        }
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public int getRequestCode() {
        return 1001;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityCreate(Activity activity) {
        if (activity == null) {
            HMSLog.i("UpdateAdapter", "activity == null");
            c();
            return;
        }
        if (activity.isFinishing()) {
            HMSLog.i("UpdateAdapter", "activity is finishing");
            c();
            return;
        }
        this.f35326b = activity.getApplicationContext();
        this.f35325a = new WeakReference<>(activity);
        if (c.f35464b.a(b())) {
            Intent intent = activity.getIntent();
            if (intent == null) {
                c();
                return;
            }
            try {
                this.f35327c = intent.getIntExtra(CommonCode.MapKey.UPDATE_VERSION, 0);
            } catch (Throwable th2) {
                HMSLog.e("UpdateAdapter", "get update_version:" + th2.getMessage());
            }
            if (this.f35327c == 0) {
                c();
                return;
            }
            if (intent.hasExtra("installHMS")) {
                this.f35329e = true;
            }
            if (a(intent, activity)) {
                return;
            }
            try {
                if (AvailableUtil.isInstallerLibExist(this.f35326b)) {
                    UpdateBean updateBean = (UpdateBean) a("com.huawei.hms.adapter.ui.InstallerAdapter", "setUpdateBean", new Object[]{activity, Integer.valueOf(this.f35327c), Boolean.valueOf(this.f35329e)});
                    this.f35328d = updateBean;
                    a("com.huawei.hms.adapter.ui.InstallerAdapter", "startUpdateHms", new Object[]{activity, updateBean, 1001});
                    this.f35328d = null;
                }
            } catch (Throwable th3) {
                HMSLog.e("UpdateAdapter", "InstallerAdapter.startUpdateHms is failed. message：" + th3.getMessage());
                c();
            }
        }
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityDestroy() {
        HMSLog.i("UpdateAdapter", "onBridgeActivityDestroy");
        c.f35464b.b(b());
        this.f35325a = null;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public boolean onBridgeActivityResult(int i11, int i12, Intent intent) {
        int i13;
        if (i11 != getRequestCode()) {
            this.f35328d = null;
            return false;
        }
        HMSLog.i("UpdateAdapter", "onBridgeActivityResult " + i12);
        if (AvailableUtil.isInstallerLibExist(this.f35326b) && i12 == 1214) {
            HMSLog.i("UpdateAdapter", "Enter update escape route");
            Activity b11 = b();
            if (b11 == null) {
                HMSLog.e("UpdateAdapter", "bridgeActivity is null, update escape failed ");
                this.f35328d = null;
                return true;
            }
            invokeMethod("com.huawei.hms.update.manager.UpdateManager", "startUpdate", new Object[]{b11, 1001, this.f35328d});
            this.f35328d = null;
        }
        if (i12 == -1) {
            if (intent != null) {
                try {
                    i13 = intent.getIntExtra(KpmsConstant.KIT_UPDATE_RESULT, 0);
                } catch (Throwable unused) {
                    HMSLog.w("UpdateAdapter", "get kit_update_result failed, throwable occur.");
                    i13 = 0;
                }
                if (i13 == 1) {
                    HMSLog.i("UpdateAdapter", "new framework update process,Error resolved successfully!");
                    SystemManager.getInstance().notifyUpdateResult(0);
                    this.f35328d = null;
                    a();
                    return true;
                }
                a(intent);
            }
        } else if (i12 == 0) {
            HMSLog.i("UpdateAdapter", "Activity.RESULT_CANCELED");
            this.f35328d = null;
            Activity b12 = b();
            if (b12 == null) {
                return true;
            }
            String hMSPackageName = HMSPackageManager.getInstance(b12.getApplicationContext()).getHMSPackageName();
            if (TextUtils.isEmpty(hMSPackageName)) {
                hMSPackageName = "com.huawei.hwid";
            }
            if (this.f35329e || a(b12, hMSPackageName, this.f35327c)) {
                HMSLog.i("UpdateAdapter", "Resolve error, process canceled by user clicking back button!");
                SystemManager.getInstance().notifyUpdateResult(13);
            } else {
                SystemManager.getInstance().notifyUpdateResult(0);
            }
        } else if (i12 == 1) {
            SystemManager.getInstance().notifyUpdateResult(28);
        }
        a();
        return true;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeConfigurationChanged() {
        HMSLog.i("UpdateAdapter", "onBridgeConfigurationChanged");
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onKeyUp(int i11, KeyEvent keyEvent) {
        HMSLog.i("UpdateAdapter", "On key up when resolve conn error");
    }

    private boolean a(Intent intent, Activity activity) {
        if (!intent.getBooleanExtra(CommonCode.MapKey.NEW_UPDATE, false)) {
            return false;
        }
        HMSLog.i("UpdateAdapter", "4.0 framework HMSCore upgrade process");
        String hMSPackageName = HMSPackageManager.getInstance(activity.getApplicationContext()).getHMSPackageName();
        if (TextUtils.isEmpty(hMSPackageName)) {
            HMSLog.w("UpdateAdapter", "hmsPackageName is empty, update invalid.");
            c();
            return true;
        }
        ComponentName componentName = new ComponentName(hMSPackageName, "com.huawei.hms.fwksdk.stub.UpdateStubActivity");
        Intent intent2 = new Intent();
        intent2.putExtra(KpmsConstant.CALLER_PACKAGE_NAME, activity.getApplicationContext().getPackageName());
        intent2.putExtra(KpmsConstant.UPDATE_PACKAGE_NAME, hMSPackageName);
        intent2.setComponent(componentName);
        activity.startActivityForResult(intent2, 1001);
        return true;
    }

    private void a(Intent intent) {
        int i11 = -1;
        try {
            i11 = intent.getIntExtra(BridgeActivity.EXTRA_RESULT, -1);
        } catch (Throwable unused) {
            HMSLog.w("UpdateAdapter", "get extra_result failed, throwable occur.");
        }
        if (i11 == 0) {
            HMSLog.i("UpdateAdapter", "Error resolved successfully!");
            SystemManager.getInstance().notifyUpdateResult(0);
        } else if (i11 == 13) {
            HMSLog.i("UpdateAdapter", "Resolve error process canceled by user!");
            SystemManager.getInstance().notifyUpdateResult(13);
        } else if (i11 == 8) {
            HMSLog.i("UpdateAdapter", "Internal error occurred, recommended retry.");
            SystemManager.getInstance().notifyUpdateResult(8);
        } else {
            HMSLog.i("UpdateAdapter", "Other error codes.");
            SystemManager.getInstance().notifyUpdateResult(i11);
        }
    }

    private void a() {
        Activity b11 = b();
        if (b11 == null || b11.isFinishing()) {
            return;
        }
        b11.finish();
    }

    private boolean a(Context context, String str, int i11) {
        if (context != null && !TextUtils.isEmpty(str) && i11 != 0) {
            PackageManagerHelper packageManagerHelper = new PackageManagerHelper(context);
            return PackageManagerHelper.PackageStates.NOT_INSTALLED.equals(packageManagerHelper.getPackageStates(str)) || packageManagerHelper.getPackageVersionCode(str) < i11;
        }
        HMSLog.w("UpdateAdapter", "Please check your params, one of params is invalid.");
        return false;
    }
}

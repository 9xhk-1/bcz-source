package com.huawei.hms.adapter.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.KeyEvent;
import com.huawei.hms.activity.IBridgeActivityDelegate;
import com.huawei.hms.adapter.sysobs.SystemManager;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.update.ui.NotInstalledHmsDialogHelper;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class NotInstalledHmsAdapter implements IBridgeActivityDelegate {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f35319c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static boolean f35320d;

    /* renamed from: a, reason: collision with root package name */
    private Activity f35321a;

    /* renamed from: b, reason: collision with root package name */
    private Dialog f35322b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a implements DialogInterface.OnCancelListener {

        /* renamed from: a, reason: collision with root package name */
        private final Activity f35323a;

        public a(Activity activity) {
            this.f35323a = activity;
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            HMSLog.i("NotInstalledHmsAdapter", "<Dialog onCancel>");
            SystemManager.getInstance().notifyUpdateResult(13);
            this.f35323a.finish();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b implements DialogInterface.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        private final Activity f35324a;

        public b(Activity activity) {
            this.f35324a = activity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i11) {
            HMSLog.i("NotInstalledHmsAdapter", "<Dialog onClick>");
            SystemManager.getInstance().notifyUpdateResult(30);
            this.f35324a.finish();
        }
    }

    private void a(Activity activity) {
        Dialog dialog = this.f35322b;
        if (dialog != null && dialog.isShowing()) {
            this.f35322b.setOnCancelListener(null);
            this.f35322b.cancel();
        }
        this.f35322b = NotInstalledHmsDialogHelper.getDialogBuilder(activity).setPositiveButton(NotInstalledHmsDialogHelper.getConfirmResId(activity), new b(activity)).setOnCancelListener(new a(activity)).show();
    }

    public static boolean getShowLock() {
        synchronized (f35319c) {
            try {
                HMSLog.i("NotInstalledHmsAdapter", "<canShowDialog> sIsShowingDialog: " + f35320d);
                if (f35320d) {
                    return false;
                }
                f35320d = true;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public int getRequestCode() {
        HMSLog.i("NotInstalledHmsAdapter", "<getRequestCode>");
        return 0;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityCreate(Activity activity) {
        HMSLog.i("NotInstalledHmsAdapter", "<onBridgeActivityCreate>");
        if (activity == null || activity.isFinishing()) {
            HMSLog.e("NotInstalledHmsAdapter", "<onBridgeActivityCreate> activity is null or finishing");
        } else {
            this.f35321a = activity;
            a(activity);
        }
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityDestroy() {
        HMSLog.i("NotInstalledHmsAdapter", "<onBridgeActivityDestroy>");
        synchronized (f35319c) {
            f35320d = false;
        }
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public boolean onBridgeActivityResult(int i11, int i12, Intent intent) {
        HMSLog.i("NotInstalledHmsAdapter", "<onBridgeActivityResult>");
        return false;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeConfigurationChanged() {
        HMSLog.i("NotInstalledHmsAdapter", "<onBridgeConfigurationChanged>");
        Activity activity = this.f35321a;
        if (activity == null || activity.isFinishing()) {
            HMSLog.e("NotInstalledHmsAdapter", "<onBridgeConfigurationChanged> mActivity is null or finishing");
        } else {
            a(this.f35321a);
        }
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onKeyUp(int i11, KeyEvent keyEvent) {
        HMSLog.i("NotInstalledHmsAdapter", "<onKeyUp>");
    }
}

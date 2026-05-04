package com.huawei.hms.update.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.text.format.Formatter;
import android.util.AndroidException;
import android.view.View;
import com.huawei.hms.android.SystemUtils;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.update.ui.HwAlertDialog;
import com.huawei.hms.utils.ResourceLoaderUtil;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class InstallConfirm extends AbstractDialog {

    /* renamed from: g, reason: collision with root package name */
    private static boolean f36620g;

    /* renamed from: c, reason: collision with root package name */
    private String f36621c = ResourceLoaderUtil.getString("hms_update_title");

    /* renamed from: d, reason: collision with root package name */
    private String f36622d;

    /* renamed from: e, reason: collision with root package name */
    private InstallConfirm f36623e;

    /* renamed from: f, reason: collision with root package name */
    private Dialog f36624f;

    public void intAppName(String str) {
        this.f36621c = str;
    }

    @Override // com.huawei.hms.update.ui.AbstractDialog
    public Dialog onCreateDialog() {
        this.f36623e = this;
        Activity activity = getActivity();
        this.f36621c = a(activity, activity.getPackageName());
        if (TextUtils.isEmpty(this.f36622d)) {
            this.f36622d = Formatter.formatFileSize(activity, SystemUtils.getMegabyte(40.0d));
        }
        int a11 = HwDialogUtil.a(activity);
        HMSLog.i("InstallConfirm", "currentUiModeType is: " + a11);
        return a11 != 6 ? a(activity) : b(activity);
    }

    public void setHmsApkSize(String str) {
        this.f36622d = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(boolean z11) {
        f36620g = z11;
    }

    private Dialog b(final Activity activity) {
        if (ConfigChangeHolder.getInstance().isChanged() && f36620g) {
            Dialog dialog = this.f36624f;
            if (dialog != null) {
                return dialog;
            }
            Dialog createNewDialog = new ReconfirmInstallDialog(activity, this.f36623e).createNewDialog();
            this.f36624f = createNewDialog;
            if (createNewDialog != null) {
                return createNewDialog;
            }
        }
        b(false);
        int stringId = ResourceLoaderUtil.getStringId("hms_update_title");
        int stringId2 = ResourceLoaderUtil.getStringId("hms_install_confirm_message");
        int stringId3 = ResourceLoaderUtil.getStringId("hms_install");
        int stringId4 = ResourceLoaderUtil.getStringId("hms_cancel");
        WatchInstallDialog watchInstallDialog = new WatchInstallDialog(activity);
        watchInstallDialog.setTitle(stringId);
        watchInstallDialog.setMessage(activity.getString(stringId2, this.f36621c, this.f36622d));
        watchInstallDialog.setInstallResourceId(stringId3);
        watchInstallDialog.setCancelResourceId(stringId4);
        watchInstallDialog.setOnInstallClick(new View.OnClickListener() { // from class: com.huawei.hms.update.ui.InstallConfirm.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                InstallConfirm.this.fireDoWork();
            }
        });
        watchInstallDialog.setOnCancelClick(new View.OnClickListener() { // from class: com.huawei.hms.update.ui.InstallConfirm.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                InstallConfirm installConfirm = InstallConfirm.this;
                installConfirm.f36624f = new ReconfirmInstallDialog(activity, installConfirm.f36623e).createNewDialog();
                if (InstallConfirm.this.f36624f == null) {
                    InstallConfirm.this.cancel();
                    return;
                }
                InstallConfirm installConfirm2 = InstallConfirm.this;
                installConfirm2.replaceAlertDialog(installConfirm2.f36624f);
                InstallConfirm.b(true);
            }
        });
        return watchInstallDialog;
    }

    private Dialog a(final Activity activity) {
        HwAlertDialog.Builder builder = new HwAlertDialog.Builder(activity, getDialogThemeId());
        if (ConfigChangeHolder.getInstance().isChanged() && f36620g) {
            Dialog dialog = this.f36624f;
            if (dialog != null) {
                return dialog;
            }
            Dialog createNewDialog = new ReconfirmInstallDialog(builder, activity, this.f36623e).createNewDialog();
            this.f36624f = createNewDialog;
            if (createNewDialog != null) {
                return createNewDialog;
            }
        }
        b(false);
        int drawableId = ResourceLoaderUtil.getDrawableId("hms_core_icon");
        int stringId = ResourceLoaderUtil.getStringId("hms_update_title_new");
        int stringId2 = ResourceLoaderUtil.getStringId("hms_install_confirm_message");
        int stringId3 = ResourceLoaderUtil.getStringId("hms_install");
        builder.setIcon(drawableId);
        builder.setTitle(stringId);
        builder.setMessage(activity.getString(stringId2, this.f36621c, this.f36622d));
        builder.setPositiveButton(stringId3, new DialogInterface.OnClickListener() { // from class: com.huawei.hms.update.ui.InstallConfirm.1
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i11) {
                InstallConfirm.this.fireDoWork();
            }
        });
        builder.setNegativeButton(ResourceLoaderUtil.getStringId("hms_cancel"), new DialogInterface.OnClickListener() { // from class: com.huawei.hms.update.ui.InstallConfirm.2
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i11) {
                HwAlertDialog.Builder builder2 = new HwAlertDialog.Builder(activity, InstallConfirm.this.getDialogThemeId());
                InstallConfirm installConfirm = InstallConfirm.this;
                installConfirm.f36624f = new ReconfirmInstallDialog(builder2, activity, installConfirm.f36623e).createNewDialog();
                if (InstallConfirm.this.f36624f == null) {
                    InstallConfirm.this.cancel();
                    return;
                }
                InstallConfirm installConfirm2 = InstallConfirm.this;
                installConfirm2.replaceAlertDialog(installConfirm2.f36624f);
                InstallConfirm.b(true);
            }
        });
        return builder.create();
    }

    private static String a(Context context, String str) {
        if (context == null) {
            HMSLog.e("InstallConfirm", "In getAppName, context is null.");
            return "";
        }
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            HMSLog.e("InstallConfirm", "In getAppName, Failed to get 'PackageManager' instance.");
            return "";
        }
        try {
            if (TextUtils.isEmpty(str)) {
                str = context.getPackageName();
            }
            CharSequence applicationLabel = packageManager.getApplicationLabel(packageManager.getApplicationInfo(str, 128));
            return applicationLabel == null ? "" : applicationLabel.toString();
        } catch (AndroidException e11) {
            HMSLog.e("InstallConfirm", "In getAppName, Failed to get app name." + e11.getMessage());
            return "";
        } catch (RuntimeException e12) {
            HMSLog.e("InstallConfirm", "In getAppName, Failed to get app name." + e12.getMessage());
            return "";
        }
    }
}

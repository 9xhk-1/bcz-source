package com.huawei.hms.update.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.view.View;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.update.ui.HwAlertDialog;
import com.huawei.hms.utils.ResourceLoaderUtil;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class ReconfirmInstallDialog {

    /* renamed from: a, reason: collision with root package name */
    private final HwAlertDialog.Builder f36632a;

    /* renamed from: b, reason: collision with root package name */
    private final Activity f36633b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractDialog f36634c;

    public ReconfirmInstallDialog(Activity activity, AbstractDialog abstractDialog) {
        this(null, activity, abstractDialog);
    }

    private Dialog b(int i11, int i12, int i13) {
        WatchInstallDialog watchInstallDialog = new WatchInstallDialog(this.f36633b);
        watchInstallDialog.setMessage(System.lineSeparator() + this.f36633b.getString(i13));
        watchInstallDialog.setInstallResourceId(i11);
        watchInstallDialog.setCancelResourceId(i12);
        watchInstallDialog.setOnInstallClick(new View.OnClickListener() { // from class: com.huawei.hms.update.ui.ReconfirmInstallDialog.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                HMSLog.i("ReconfirmInstallDialog", "start fireDoWork...");
                ReconfirmInstallDialog.this.f36634c.fireDoWork();
            }
        });
        watchInstallDialog.setOnCancelClick(new View.OnClickListener() { // from class: com.huawei.hms.update.ui.ReconfirmInstallDialog.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                HMSLog.i("ReconfirmInstallDialog", "start cancel...");
                ReconfirmInstallDialog.this.f36634c.cancel();
            }
        });
        return watchInstallDialog;
    }

    public Dialog createNewDialog() {
        try {
            int stringId = ResourceLoaderUtil.getStringId("hms_install_after_cancel");
            int stringId2 = ResourceLoaderUtil.getStringId("hms_cancel_after_cancel");
            int stringId3 = ResourceLoaderUtil.getStringId("hms_cancel_install_message");
            Activity activity = this.f36633b;
            if (activity != null && this.f36634c != null) {
                if (!activity.isFinishing()) {
                    return HwDialogUtil.a(this.f36633b) != 6 ? a(stringId, stringId2, stringId3) : b(stringId, stringId2, stringId3);
                }
                HMSLog.e("ReconfirmInstallDialog", "this mActivity is finished.");
                return null;
            }
            HMSLog.e("ReconfirmInstallDialog", "error:  mActivity or mDialog is null: " + this.f36633b + this.f36634c);
            return null;
        } catch (Exception e11) {
            HMSLog.e("ReconfirmInstallDialog", "createNewDialog exception: " + e11.getMessage());
            return null;
        }
    }

    public ReconfirmInstallDialog(HwAlertDialog.Builder builder, Activity activity, AbstractDialog abstractDialog) {
        this.f36632a = builder;
        this.f36633b = activity;
        this.f36634c = abstractDialog;
    }

    private Dialog a(int i11, int i12, int i13) {
        HwAlertDialog.Builder builder = this.f36632a;
        if (builder == null) {
            HMSLog.e("ReconfirmInstallDialog", "error: mBuilder is null");
            return null;
        }
        builder.setMessage(this.f36633b.getString(i13));
        this.f36632a.setPositiveButton(i11, new DialogInterface.OnClickListener() { // from class: com.huawei.hms.update.ui.ReconfirmInstallDialog.1
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i14) {
                HMSLog.i("ReconfirmInstallDialog", "start fireDoWork...");
                ReconfirmInstallDialog.this.f36634c.fireDoWork();
            }
        });
        this.f36632a.setNegativeButton(i12, new DialogInterface.OnClickListener() { // from class: com.huawei.hms.update.ui.ReconfirmInstallDialog.2
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i14) {
                HMSLog.i("ReconfirmInstallDialog", "start cancel...");
                ReconfirmInstallDialog.this.f36634c.cancel();
            }
        });
        return this.f36632a.create();
    }
}

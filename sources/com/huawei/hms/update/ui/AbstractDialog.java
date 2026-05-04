package com.huawei.hms.update.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.util.Log;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.UIUtil;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class AbstractDialog {

    /* renamed from: a, reason: collision with root package name */
    private Dialog f36528a;

    /* renamed from: b, reason: collision with root package name */
    private AbsUpdateWizard f36529b;

    public void cancel() {
        Dialog dialog = this.f36528a;
        if (dialog != null) {
            dialog.cancel();
        }
    }

    public void dismiss() {
        Dialog dialog = this.f36528a;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    public void fireCancel() {
        AbsUpdateWizard absUpdateWizard = this.f36529b;
        if (absUpdateWizard != null) {
            absUpdateWizard.onCancel(this);
        }
    }

    public void fireDoWork() {
        AbsUpdateWizard absUpdateWizard = this.f36529b;
        if (absUpdateWizard != null) {
            absUpdateWizard.onDoWork(this);
        }
    }

    public Activity getActivity() {
        AbsUpdateWizard absUpdateWizard = this.f36529b;
        if (absUpdateWizard != null) {
            return absUpdateWizard.getActivity();
        }
        return null;
    }

    public int getDialogThemeId() {
        return UIUtil.getDialogThemeId(getActivity());
    }

    public boolean isShowing() {
        Dialog dialog = this.f36528a;
        if (dialog != null) {
            return dialog.isShowing();
        }
        return false;
    }

    public abstract Dialog onCreateDialog();

    public void replaceAlertDialog(Dialog dialog) {
        Dialog dialog2 = this.f36528a;
        if (dialog2 != null) {
            dialog2.setOnCancelListener(null);
            this.f36528a.cancel();
        }
        this.f36528a = dialog;
        if (dialog != null) {
            dialog.setCanceledOnTouchOutside(false);
            dialog.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.huawei.hms.update.ui.AbstractDialog.2
                @Override // android.content.DialogInterface.OnCancelListener
                public void onCancel(DialogInterface dialogInterface) {
                    AbstractDialog.this.fireCancel();
                }
            });
            dialog.show();
        }
    }

    public void setMessage(CharSequence charSequence) {
        Log.w("AbstractDialog", "unsupported.");
    }

    public void setTitle(CharSequence charSequence) {
        Log.w("AbstractDialog", "unsupported.");
    }

    public void show(AbsUpdateWizard absUpdateWizard) {
        this.f36529b = absUpdateWizard;
        if (getActivity() == null || getActivity().isFinishing()) {
            HMSLog.e("AbstractDialog", "In show, The activity is null or finishing.");
            return;
        }
        Dialog onCreateDialog = onCreateDialog();
        this.f36528a = onCreateDialog;
        onCreateDialog.setCanceledOnTouchOutside(false);
        this.f36528a.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.huawei.hms.update.ui.AbstractDialog.1
            @Override // android.content.DialogInterface.OnCancelListener
            public void onCancel(DialogInterface dialogInterface) {
                AbstractDialog.this.fireCancel();
            }
        });
        this.f36528a.show();
    }
}

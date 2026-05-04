package com.huawei.hms.update.ui;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import com.huawei.hms.utils.ResourceLoaderUtil;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class CheckProgress extends AbstractDialog {
    private Dialog a() {
        ProgressDialog progressDialog = new ProgressDialog(getActivity(), getDialogThemeId());
        progressDialog.setMessage(ResourceLoaderUtil.getString("hms_checking"));
        progressDialog.setCanceledOnTouchOutside(false);
        return progressDialog;
    }

    private Dialog b() {
        WatchProgressDialog watchProgressDialog = new WatchProgressDialog(getActivity());
        watchProgressDialog.setCanceledOnTouchOutside(false);
        return watchProgressDialog;
    }

    @Override // com.huawei.hms.update.ui.AbstractDialog
    public int getDialogThemeId() {
        return a(getActivity()) != 0 ? 0 : 3;
    }

    @Override // com.huawei.hms.update.ui.AbstractDialog
    public Dialog onCreateDialog() {
        return HwDialogUtil.a(getActivity()) != 6 ? a() : b();
    }

    private static int a(Context context) {
        if (context == null) {
            return 0;
        }
        return context.getResources().getIdentifier("androidhwext:style/Theme.Emui", null, null);
    }
}

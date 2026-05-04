package com.huawei.hms.common.internal;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import com.huawei.hms.support.log.HMSLog;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class DialogRedirect implements DialogInterface.OnClickListener {
    public static DialogRedirect getInstance(Activity activity, Intent intent, int i11) {
        return new DialogRedirectImpl(intent, activity, i11);
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i11) {
        try {
            try {
                redirect();
                if (dialogInterface == null) {
                }
            } finally {
                if (dialogInterface != null) {
                    dialogInterface.dismiss();
                }
            }
        } catch (Throwable unused) {
            HMSLog.e("DialogRedirect", "Failed to start resolution intent");
        }
    }

    public abstract void redirect();
}

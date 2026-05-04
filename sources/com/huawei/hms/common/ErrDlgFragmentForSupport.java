package com.huawei.hms.common;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.os.Bundle;
import com.huawei.hms.common.internal.Preconditions;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class ErrDlgFragmentForSupport extends DialogFragment {

    /* renamed from: a, reason: collision with root package name */
    private Dialog f35483a = null;

    /* renamed from: b, reason: collision with root package name */
    private DialogInterface.OnCancelListener f35484b = null;

    public static ErrDlgFragmentForSupport newInstance(Dialog dialog) {
        return newInstance(dialog, null);
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f35484b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        if (this.f35483a == null) {
            setShowsDialog(false);
        }
        return this.f35483a;
    }

    @Override // android.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        Preconditions.checkNotNull(fragmentManager, "FragmentManager cannot be null!");
        super.show(fragmentManager, str);
    }

    public static ErrDlgFragmentForSupport newInstance(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        Preconditions.checkNotNull(dialog, "Dialog cannot be null!");
        ErrDlgFragmentForSupport errDlgFragmentForSupport = new ErrDlgFragmentForSupport();
        errDlgFragmentForSupport.f35483a = dialog;
        dialog.setOnCancelListener(null);
        errDlgFragmentForSupport.f35483a.setOnDismissListener(null);
        errDlgFragmentForSupport.f35484b = onCancelListener;
        return errDlgFragmentForSupport;
    }
}

package androidx.appcompat.app;

import android.app.Dialog;
import android.os.Bundle;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.fragment.app.DialogFragment;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public class AppCompatDialogFragment extends DialogFragment {
    public AppCompatDialogFragment() {
    }

    @Override // androidx.fragment.app.DialogFragment
    @NonNull
    public Dialog onCreateDialog(@Nullable Bundle bundle) {
        return new AppCompatDialog(getContext(), getTheme());
    }

    @Override // androidx.fragment.app.DialogFragment
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setupDialog(@NonNull Dialog dialog, int i11) {
        if (!(dialog instanceof AppCompatDialog)) {
            super.setupDialog(dialog, i11);
            return;
        }
        AppCompatDialog appCompatDialog = (AppCompatDialog) dialog;
        if (i11 != 1 && i11 != 2) {
            if (i11 != 3) {
                return;
            } else {
                dialog.getWindow().addFlags(24);
            }
        }
        appCompatDialog.supportRequestWindowFeature(1);
    }

    public AppCompatDialogFragment(@LayoutRes int i11) {
        super(i11);
    }
}

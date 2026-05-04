package androidx.core.app;

import android.app.Dialog;
import android.os.Build;
import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public class DialogCompat {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(28)
    public static class Api28Impl {
        private Api28Impl() {
        }

        @DoNotInline
        public static <T> T requireViewById(Dialog dialog, int i11) {
            return (T) dialog.requireViewById(i11);
        }
    }

    private DialogCompat() {
    }

    @NonNull
    public static View requireViewById(@NonNull Dialog dialog, int i11) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (View) Api28Impl.requireViewById(dialog, i11);
        }
        View findViewById = dialog.findViewById(i11);
        if (findViewById != null) {
            return findViewById;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this Dialog");
    }
}

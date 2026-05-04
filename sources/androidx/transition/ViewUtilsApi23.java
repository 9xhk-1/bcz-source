package androidx.transition;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(23)
/* loaded from: classes3.dex */
class ViewUtilsApi23 extends ViewUtilsApi22 {
    private static boolean sTryHiddenSetTransitionVisibility = true;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(29)
    public static class Api29Impl {
        private Api29Impl() {
        }

        @DoNotInline
        public static void setTransitionVisibility(View view, int i11) {
            view.setTransitionVisibility(i11);
        }
    }

    @Override // androidx.transition.ViewUtilsApi19
    @SuppressLint({"NewApi"})
    public void setTransitionVisibility(@NonNull View view, int i11) {
        if (Build.VERSION.SDK_INT == 28) {
            super.setTransitionVisibility(view, i11);
        } else if (sTryHiddenSetTransitionVisibility) {
            try {
                Api29Impl.setTransitionVisibility(view, i11);
            } catch (NoSuchMethodError unused) {
                sTryHiddenSetTransitionVisibility = false;
            }
        }
    }
}

package androidx.transition;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(22)
/* loaded from: classes3.dex */
class ViewUtilsApi22 extends ViewUtilsApi21 {
    private static boolean sTryHiddenSetLeftTopRightBottom = true;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(29)
    public static class Api29Impl {
        private Api29Impl() {
        }

        @DoNotInline
        public static void setLeftTopRightBottom(View view, int i11, int i12, int i13, int i14) {
            view.setLeftTopRightBottom(i11, i12, i13, i14);
        }
    }

    @Override // androidx.transition.ViewUtilsApi19
    @SuppressLint({"NewApi"})
    public void setLeftTopRightBottom(@NonNull View view, int i11, int i12, int i13, int i14) {
        if (sTryHiddenSetLeftTopRightBottom) {
            try {
                Api29Impl.setLeftTopRightBottom(view, i11, i12, i13, i14);
            } catch (NoSuchMethodError unused) {
                sTryHiddenSetLeftTopRightBottom = false;
            }
        }
    }
}

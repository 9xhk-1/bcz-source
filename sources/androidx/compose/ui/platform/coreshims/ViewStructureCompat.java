package androidx.compose.ui.platform.coreshims;

import android.os.Bundle;
import android.view.ViewStructure;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes2.dex */
public class ViewStructureCompat {
    private final Object mWrappedObj;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(23)
    public static class Api23Impl {
        private Api23Impl() {
        }

        public static Bundle getExtras(ViewStructure viewStructure) {
            return viewStructure.getExtras();
        }

        public static void setClassName(ViewStructure viewStructure, String str) {
            viewStructure.setClassName(str);
        }

        public static void setContentDescription(ViewStructure viewStructure, CharSequence charSequence) {
            viewStructure.setContentDescription(charSequence);
        }

        public static void setDimens(ViewStructure viewStructure, int i11, int i12, int i13, int i14, int i15, int i16) {
            viewStructure.setDimens(i11, i12, i13, i14, i15, i16);
        }

        public static void setId(ViewStructure viewStructure, int i11, String str, String str2, String str3) {
            viewStructure.setId(i11, str, str2, str3);
        }

        public static void setText(ViewStructure viewStructure, CharSequence charSequence) {
            viewStructure.setText(charSequence);
        }

        public static void setTextStyle(ViewStructure viewStructure, float f11, int i11, int i12, int i13) {
            viewStructure.setTextStyle(f11, i11, i12, i13);
        }
    }

    private ViewStructureCompat(ViewStructure viewStructure) {
        this.mWrappedObj = viewStructure;
    }

    @RequiresApi(23)
    public static ViewStructureCompat toViewStructureCompat(ViewStructure viewStructure) {
        return new ViewStructureCompat(viewStructure);
    }

    public Bundle getExtras() {
        return Api23Impl.getExtras((ViewStructure) this.mWrappedObj);
    }

    public void setClassName(String str) {
        Api23Impl.setClassName((ViewStructure) this.mWrappedObj, str);
    }

    public void setContentDescription(CharSequence charSequence) {
        Api23Impl.setContentDescription((ViewStructure) this.mWrappedObj, charSequence);
    }

    public void setDimens(int i11, int i12, int i13, int i14, int i15, int i16) {
        Api23Impl.setDimens((ViewStructure) this.mWrappedObj, i11, i12, i13, i14, i15, i16);
    }

    public void setId(int i11, String str, String str2, String str3) {
        Api23Impl.setId((ViewStructure) this.mWrappedObj, i11, str, str2, str3);
    }

    public void setText(CharSequence charSequence) {
        Api23Impl.setText((ViewStructure) this.mWrappedObj, charSequence);
    }

    public void setTextStyle(float f11, int i11, int i12, int i13) {
        Api23Impl.setTextStyle((ViewStructure) this.mWrappedObj, f11, i11, i12, i13);
    }

    @RequiresApi(23)
    public ViewStructure toViewStructure() {
        return (ViewStructure) this.mWrappedObj;
    }
}

package androidx.core.view;

import android.view.ViewStructure;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public class ViewStructureCompat {
    private final Object mWrappedObj;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(23)
    public static class Api23Impl {
        private Api23Impl() {
        }

        @DoNotInline
        public static void setClassName(ViewStructure viewStructure, String str) {
            viewStructure.setClassName(str);
        }

        @DoNotInline
        public static void setContentDescription(ViewStructure viewStructure, CharSequence charSequence) {
            viewStructure.setContentDescription(charSequence);
        }

        @DoNotInline
        public static void setDimens(ViewStructure viewStructure, int i11, int i12, int i13, int i14, int i15, int i16) {
            viewStructure.setDimens(i11, i12, i13, i14, i15, i16);
        }

        @DoNotInline
        public static void setText(ViewStructure viewStructure, CharSequence charSequence) {
            viewStructure.setText(charSequence);
        }
    }

    private ViewStructureCompat(@NonNull ViewStructure viewStructure) {
        this.mWrappedObj = viewStructure;
    }

    @NonNull
    @RequiresApi(23)
    public static ViewStructureCompat toViewStructureCompat(@NonNull ViewStructure viewStructure) {
        return new ViewStructureCompat(viewStructure);
    }

    public void setClassName(@NonNull String str) {
        Api23Impl.setClassName((ViewStructure) this.mWrappedObj, str);
    }

    public void setContentDescription(@NonNull CharSequence charSequence) {
        Api23Impl.setContentDescription((ViewStructure) this.mWrappedObj, charSequence);
    }

    public void setDimens(int i11, int i12, int i13, int i14, int i15, int i16) {
        Api23Impl.setDimens((ViewStructure) this.mWrappedObj, i11, i12, i13, i14, i15, i16);
    }

    public void setText(@NonNull CharSequence charSequence) {
        Api23Impl.setText((ViewStructure) this.mWrappedObj, charSequence);
    }

    @NonNull
    @RequiresApi(23)
    public ViewStructure toViewStructure() {
        return (ViewStructure) this.mWrappedObj;
    }
}

package androidx.core.graphics.drawable;

import android.graphics.drawable.Drawable;
import androidx.annotation.RestrictTo;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes2.dex */
public interface WrappedDrawable {
    Drawable getWrappedDrawable();

    void setWrappedDrawable(Drawable drawable);
}

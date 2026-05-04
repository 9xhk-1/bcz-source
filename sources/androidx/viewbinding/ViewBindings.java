package androidx.viewbinding;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.IdRes;
import androidx.annotation.Nullable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class ViewBindings {
    private ViewBindings() {
    }

    @Nullable
    public static <T extends View> T findChildViewById(View view, @IdRes int i11) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            T t11 = (T) viewGroup.getChildAt(i12).findViewById(i11);
            if (t11 != null) {
                return t11;
            }
        }
        return null;
    }
}

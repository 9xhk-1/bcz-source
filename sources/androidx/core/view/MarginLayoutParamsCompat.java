package androidx.core.view;

import android.view.ViewGroup;
import androidx.annotation.NonNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Deprecated
/* loaded from: classes2.dex */
public final class MarginLayoutParamsCompat {
    private MarginLayoutParamsCompat() {
    }

    @Deprecated
    public static int getLayoutDirection(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams) {
        int layoutDirection = marginLayoutParams.getLayoutDirection();
        if (layoutDirection == 0 || layoutDirection == 1) {
            return layoutDirection;
        }
        return 0;
    }

    @Deprecated
    public static int getMarginEnd(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.getMarginEnd();
    }

    @Deprecated
    public static int getMarginStart(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.getMarginStart();
    }

    @Deprecated
    public static boolean isMarginRelative(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.isMarginRelative();
    }

    @Deprecated
    public static void resolveLayoutDirection(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams, int i11) {
        marginLayoutParams.resolveLayoutDirection(i11);
    }

    @Deprecated
    public static void setLayoutDirection(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams, int i11) {
        marginLayoutParams.setLayoutDirection(i11);
    }

    @Deprecated
    public static void setMarginEnd(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams, int i11) {
        marginLayoutParams.setMarginEnd(i11);
    }

    @Deprecated
    public static void setMarginStart(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams, int i11) {
        marginLayoutParams.setMarginStart(i11);
    }
}

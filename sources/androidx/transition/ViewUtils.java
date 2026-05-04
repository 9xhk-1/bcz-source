package androidx.transition;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
class ViewUtils {
    static final Property<View, Rect> CLIP_BOUNDS;
    private static final ViewUtilsApi19 IMPL;
    private static final String TAG = "ViewUtils";
    static final Property<View, Float> TRANSITION_ALPHA;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            IMPL = new ViewUtilsApi29();
        } else {
            IMPL = new ViewUtilsApi23();
        }
        TRANSITION_ALPHA = new Property<View, Float>(Float.class, "translationAlpha") { // from class: androidx.transition.ViewUtils.1
            @Override // android.util.Property
            public Float get(View view) {
                return Float.valueOf(ViewUtils.getTransitionAlpha(view));
            }

            @Override // android.util.Property
            public void set(View view, Float f11) {
                ViewUtils.setTransitionAlpha(view, f11.floatValue());
            }
        };
        CLIP_BOUNDS = new Property<View, Rect>(Rect.class, "clipBounds") { // from class: androidx.transition.ViewUtils.2
            @Override // android.util.Property
            public Rect get(View view) {
                return view.getClipBounds();
            }

            @Override // android.util.Property
            public void set(View view, Rect rect) {
                view.setClipBounds(rect);
            }
        };
    }

    private ViewUtils() {
    }

    public static void clearNonTransitionAlpha(@NonNull View view) {
        IMPL.clearNonTransitionAlpha(view);
    }

    public static float getTransitionAlpha(@NonNull View view) {
        return IMPL.getTransitionAlpha(view);
    }

    public static void saveNonTransitionAlpha(@NonNull View view) {
        IMPL.saveNonTransitionAlpha(view);
    }

    public static void setAnimationMatrix(@NonNull View view, @Nullable Matrix matrix) {
        IMPL.setAnimationMatrix(view, matrix);
    }

    public static void setLeftTopRightBottom(@NonNull View view, int i11, int i12, int i13, int i14) {
        IMPL.setLeftTopRightBottom(view, i11, i12, i13, i14);
    }

    public static void setTransitionAlpha(@NonNull View view, float f11) {
        IMPL.setTransitionAlpha(view, f11);
    }

    public static void setTransitionVisibility(@NonNull View view, int i11) {
        IMPL.setTransitionVisibility(view, i11);
    }

    public static void transformMatrixToGlobal(@NonNull View view, @NonNull Matrix matrix) {
        IMPL.transformMatrixToGlobal(view, matrix);
    }

    public static void transformMatrixToLocal(@NonNull View view, @NonNull Matrix matrix) {
        IMPL.transformMatrixToLocal(view, matrix);
    }
}

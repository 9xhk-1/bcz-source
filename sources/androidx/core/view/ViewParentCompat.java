package androidx.core.view;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class ViewParentCompat {
    private static final String TAG = "ViewParentCompat";
    private static int[] sTempNestedScrollConsumed;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(21)
    public static class Api21Impl {
        private Api21Impl() {
        }

        @DoNotInline
        public static boolean onNestedFling(ViewParent viewParent, View view, float f11, float f12, boolean z11) {
            return viewParent.onNestedFling(view, f11, f12, z11);
        }

        @DoNotInline
        public static boolean onNestedPreFling(ViewParent viewParent, View view, float f11, float f12) {
            return viewParent.onNestedPreFling(view, f11, f12);
        }

        @DoNotInline
        public static void onNestedPreScroll(ViewParent viewParent, View view, int i11, int i12, int[] iArr) {
            viewParent.onNestedPreScroll(view, i11, i12, iArr);
        }

        @DoNotInline
        public static void onNestedScroll(ViewParent viewParent, View view, int i11, int i12, int i13, int i14) {
            viewParent.onNestedScroll(view, i11, i12, i13, i14);
        }

        @DoNotInline
        public static void onNestedScrollAccepted(ViewParent viewParent, View view, View view2, int i11) {
            viewParent.onNestedScrollAccepted(view, view2, i11);
        }

        @DoNotInline
        public static boolean onStartNestedScroll(ViewParent viewParent, View view, View view2, int i11) {
            return viewParent.onStartNestedScroll(view, view2, i11);
        }

        @DoNotInline
        public static void onStopNestedScroll(ViewParent viewParent, View view) {
            viewParent.onStopNestedScroll(view);
        }
    }

    private ViewParentCompat() {
    }

    private static int[] getTempNestedScrollConsumed() {
        int[] iArr = sTempNestedScrollConsumed;
        if (iArr == null) {
            sTempNestedScrollConsumed = new int[2];
        } else {
            iArr[0] = 0;
            iArr[1] = 0;
        }
        return sTempNestedScrollConsumed;
    }

    public static void notifySubtreeAccessibilityStateChanged(@NonNull ViewParent viewParent, @NonNull View view, @NonNull View view2, int i11) {
        viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i11);
    }

    public static boolean onNestedFling(@NonNull ViewParent viewParent, @NonNull View view, float f11, float f12, boolean z11) {
        try {
            return Api21Impl.onNestedFling(viewParent, view, f11, f12, z11);
        } catch (AbstractMethodError e11) {
            Log.e(TAG, "ViewParent " + viewParent + " does not implement interface method onNestedFling", e11);
            return false;
        }
    }

    public static boolean onNestedPreFling(@NonNull ViewParent viewParent, @NonNull View view, float f11, float f12) {
        try {
            return Api21Impl.onNestedPreFling(viewParent, view, f11, f12);
        } catch (AbstractMethodError e11) {
            Log.e(TAG, "ViewParent " + viewParent + " does not implement interface method onNestedPreFling", e11);
            return false;
        }
    }

    public static void onNestedPreScroll(@NonNull ViewParent viewParent, @NonNull View view, int i11, int i12, @NonNull int[] iArr) {
        onNestedPreScroll(viewParent, view, i11, i12, iArr, 0);
    }

    public static void onNestedScroll(@NonNull ViewParent viewParent, @NonNull View view, int i11, int i12, int i13, int i14) {
        onNestedScroll(viewParent, view, i11, i12, i13, i14, 0, getTempNestedScrollConsumed());
    }

    public static void onNestedScrollAccepted(@NonNull ViewParent viewParent, @NonNull View view, @NonNull View view2, int i11) {
        onNestedScrollAccepted(viewParent, view, view2, i11, 0);
    }

    public static boolean onStartNestedScroll(@NonNull ViewParent viewParent, @NonNull View view, @NonNull View view2, int i11) {
        return onStartNestedScroll(viewParent, view, view2, i11, 0);
    }

    public static void onStopNestedScroll(@NonNull ViewParent viewParent, @NonNull View view) {
        onStopNestedScroll(viewParent, view, 0);
    }

    @Deprecated
    public static boolean requestSendAccessibilityEvent(ViewParent viewParent, View view, AccessibilityEvent accessibilityEvent) {
        return viewParent.requestSendAccessibilityEvent(view, accessibilityEvent);
    }

    public static void onNestedPreScroll(@NonNull ViewParent viewParent, @NonNull View view, int i11, int i12, @NonNull int[] iArr, int i13) {
        if (viewParent instanceof NestedScrollingParent2) {
            ((NestedScrollingParent2) viewParent).onNestedPreScroll(view, i11, i12, iArr, i13);
            return;
        }
        if (i13 == 0) {
            try {
                Api21Impl.onNestedPreScroll(viewParent, view, i11, i12, iArr);
            } catch (AbstractMethodError e11) {
                Log.e(TAG, "ViewParent " + viewParent + " does not implement interface method onNestedPreScroll", e11);
            }
        }
    }

    public static void onNestedScrollAccepted(@NonNull ViewParent viewParent, @NonNull View view, @NonNull View view2, int i11, int i12) {
        if (viewParent instanceof NestedScrollingParent2) {
            ((NestedScrollingParent2) viewParent).onNestedScrollAccepted(view, view2, i11, i12);
            return;
        }
        if (i12 == 0) {
            try {
                Api21Impl.onNestedScrollAccepted(viewParent, view, view2, i11);
            } catch (AbstractMethodError e11) {
                Log.e(TAG, "ViewParent " + viewParent + " does not implement interface method onNestedScrollAccepted", e11);
            }
        }
    }

    public static boolean onStartNestedScroll(@NonNull ViewParent viewParent, @NonNull View view, @NonNull View view2, int i11, int i12) {
        if (viewParent instanceof NestedScrollingParent2) {
            return ((NestedScrollingParent2) viewParent).onStartNestedScroll(view, view2, i11, i12);
        }
        if (i12 != 0) {
            return false;
        }
        try {
            return Api21Impl.onStartNestedScroll(viewParent, view, view2, i11);
        } catch (AbstractMethodError e11) {
            Log.e(TAG, "ViewParent " + viewParent + " does not implement interface method onStartNestedScroll", e11);
            return false;
        }
    }

    public static void onStopNestedScroll(@NonNull ViewParent viewParent, @NonNull View view, int i11) {
        if (viewParent instanceof NestedScrollingParent2) {
            ((NestedScrollingParent2) viewParent).onStopNestedScroll(view, i11);
            return;
        }
        if (i11 == 0) {
            try {
                Api21Impl.onStopNestedScroll(viewParent, view);
            } catch (AbstractMethodError e11) {
                Log.e(TAG, "ViewParent " + viewParent + " does not implement interface method onStopNestedScroll", e11);
            }
        }
    }

    public static void onNestedScroll(@NonNull ViewParent viewParent, @NonNull View view, int i11, int i12, int i13, int i14, int i15) {
        onNestedScroll(viewParent, view, i11, i12, i13, i14, i15, getTempNestedScrollConsumed());
    }

    public static void onNestedScroll(@NonNull ViewParent viewParent, @NonNull View view, int i11, int i12, int i13, int i14, int i15, @NonNull int[] iArr) {
        if (viewParent instanceof NestedScrollingParent3) {
            ((NestedScrollingParent3) viewParent).onNestedScroll(view, i11, i12, i13, i14, i15, iArr);
            return;
        }
        iArr[0] = iArr[0] + i13;
        iArr[1] = iArr[1] + i14;
        if (viewParent instanceof NestedScrollingParent2) {
            ((NestedScrollingParent2) viewParent).onNestedScroll(view, i11, i12, i13, i14, i15);
            return;
        }
        if (i15 == 0) {
            try {
                Api21Impl.onNestedScroll(viewParent, view, i11, i12, i13, i14);
            } catch (AbstractMethodError e11) {
                Log.e(TAG, "ViewParent " + viewParent + " does not implement interface method onNestedScroll", e11);
            }
        }
    }
}

package androidx.core.view;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import androidx.annotation.DoNotInline;
import androidx.annotation.FloatRange;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.UiThread;
import androidx.collection.SimpleArrayMap;
import androidx.core.R;
import androidx.core.util.Preconditions;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsAnimationCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeProviderCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.core.view.autofill.AutofillIdCompat;
import androidx.core.view.contentcapture.ContentCaptureSessionCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@SuppressLint({"PrivateConstructorForUtilityClass"})
/* loaded from: classes2.dex */
public class ViewCompat {
    public static final int ACCESSIBILITY_LIVE_REGION_ASSERTIVE = 2;
    public static final int ACCESSIBILITY_LIVE_REGION_NONE = 0;
    public static final int ACCESSIBILITY_LIVE_REGION_POLITE = 1;

    @Deprecated
    public static final int IMPORTANT_FOR_ACCESSIBILITY_AUTO = 0;

    @Deprecated
    public static final int IMPORTANT_FOR_ACCESSIBILITY_NO = 2;

    @Deprecated
    public static final int IMPORTANT_FOR_ACCESSIBILITY_NO_HIDE_DESCENDANTS = 4;

    @Deprecated
    public static final int IMPORTANT_FOR_ACCESSIBILITY_YES = 1;
    public static final int IMPORTANT_FOR_CONTENT_CAPTURE_AUTO = 0;
    public static final int IMPORTANT_FOR_CONTENT_CAPTURE_NO = 2;
    public static final int IMPORTANT_FOR_CONTENT_CAPTURE_NO_EXCLUDE_DESCENDANTS = 8;
    public static final int IMPORTANT_FOR_CONTENT_CAPTURE_YES = 1;
    public static final int IMPORTANT_FOR_CONTENT_CAPTURE_YES_EXCLUDE_DESCENDANTS = 4;

    @Deprecated
    public static final int LAYER_TYPE_HARDWARE = 2;

    @Deprecated
    public static final int LAYER_TYPE_NONE = 0;

    @Deprecated
    public static final int LAYER_TYPE_SOFTWARE = 1;

    @Deprecated
    public static final int LAYOUT_DIRECTION_INHERIT = 2;

    @Deprecated
    public static final int LAYOUT_DIRECTION_LOCALE = 3;

    @Deprecated
    public static final int LAYOUT_DIRECTION_LTR = 0;

    @Deprecated
    public static final int LAYOUT_DIRECTION_RTL = 1;

    @Deprecated
    public static final int MEASURED_HEIGHT_STATE_SHIFT = 16;

    @Deprecated
    public static final int MEASURED_SIZE_MASK = 16777215;

    @Deprecated
    public static final int MEASURED_STATE_MASK = -16777216;

    @Deprecated
    public static final int MEASURED_STATE_TOO_SMALL = 16777216;

    @Deprecated
    public static final int OVER_SCROLL_ALWAYS = 0;

    @Deprecated
    public static final int OVER_SCROLL_IF_CONTENT_SCROLLS = 1;

    @Deprecated
    public static final int OVER_SCROLL_NEVER = 2;
    public static final int SCROLL_AXIS_HORIZONTAL = 1;
    public static final int SCROLL_AXIS_NONE = 0;
    public static final int SCROLL_AXIS_VERTICAL = 2;
    public static final int SCROLL_INDICATOR_BOTTOM = 2;
    public static final int SCROLL_INDICATOR_END = 32;
    public static final int SCROLL_INDICATOR_LEFT = 4;
    public static final int SCROLL_INDICATOR_RIGHT = 8;
    public static final int SCROLL_INDICATOR_START = 16;
    public static final int SCROLL_INDICATOR_TOP = 1;
    private static final String TAG = "ViewCompat";
    public static final int TYPE_NON_TOUCH = 1;
    public static final int TYPE_TOUCH = 0;
    private static boolean sAccessibilityDelegateCheckFailed = false;
    private static Field sAccessibilityDelegateField;
    private static Method sChildrenDrawingOrderMethod;
    private static Method sDispatchFinishTemporaryDetach;
    private static Method sDispatchStartTemporaryDetach;
    private static boolean sTempDetachBound;
    private static ThreadLocal<Rect> sThreadLocalRect;
    private static WeakHashMap<View, String> sTransitionNameMap;
    private static WeakHashMap<View, ViewPropertyAnimatorCompat> sViewPropertyAnimatorMap;
    private static final int[] ACCESSIBILITY_ACTIONS_RESOURCE_IDS = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
    private static final OnReceiveContentViewBehavior NO_OP_ON_RECEIVE_CONTENT_VIEW_BEHAVIOR = new OnReceiveContentViewBehavior() { // from class: androidx.core.view.e0
        @Override // androidx.core.view.OnReceiveContentViewBehavior
        public final ContentInfoCompat onReceiveContent(ContentInfoCompat contentInfoCompat) {
            return ViewCompat.a(contentInfoCompat);
        }
    };
    private static final AccessibilityPaneVisibilityManager sAccessibilityPaneVisibilityManager = new AccessibilityPaneVisibilityManager();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class AccessibilityViewProperty<T> {
        private final int mContentChangeType;
        private final int mFrameworkMinimumSdk;
        private final int mTagKey;
        private final Class<T> mType;

        public AccessibilityViewProperty(int i11, Class<T> cls, int i12) {
            this(i11, cls, 0, i12);
        }

        private boolean frameworkAvailable() {
            return Build.VERSION.SDK_INT >= this.mFrameworkMinimumSdk;
        }

        public boolean booleanNullToFalseEquals(Boolean bool, Boolean bool2) {
            return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
        }

        public abstract T frameworkGet(View view);

        public abstract void frameworkSet(View view, T t11);

        public T get(View view) {
            if (frameworkAvailable()) {
                return frameworkGet(view);
            }
            T t11 = (T) view.getTag(this.mTagKey);
            if (this.mType.isInstance(t11)) {
                return t11;
            }
            return null;
        }

        public void set(View view, T t11) {
            if (frameworkAvailable()) {
                frameworkSet(view, t11);
            } else if (shouldUpdate(get(view), t11)) {
                ViewCompat.ensureAccessibilityDelegateCompat(view);
                view.setTag(this.mTagKey, t11);
                ViewCompat.notifyViewAccessibilityStateChangedIfNeeded(view, this.mContentChangeType);
            }
        }

        public boolean shouldUpdate(T t11, T t12) {
            return !t12.equals(t11);
        }

        public AccessibilityViewProperty(int i11, Class<T> cls, int i12, int i13) {
            this.mTagKey = i11;
            this.mType = cls;
            this.mContentChangeType = i12;
            this.mFrameworkMinimumSdk = i13;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(20)
    public static class Api20Impl {
        private Api20Impl() {
        }

        @DoNotInline
        public static WindowInsets dispatchApplyWindowInsets(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        @DoNotInline
        public static WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        @DoNotInline
        public static void requestApplyInsets(View view) {
            view.requestApplyInsets();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(21)
    public static class Api21Impl {
        private Api21Impl() {
        }

        @DoNotInline
        public static void callCompatInsetAnimationCallback(@NonNull WindowInsets windowInsets, @NonNull View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        @DoNotInline
        public static WindowInsetsCompat computeSystemWindowInsets(@NonNull View view, @NonNull WindowInsetsCompat windowInsetsCompat, @NonNull Rect rect) {
            WindowInsets windowInsets = windowInsetsCompat.toWindowInsets();
            if (windowInsets != null) {
                return WindowInsetsCompat.toWindowInsetsCompat(view.computeSystemWindowInsets(windowInsets, rect), view);
            }
            rect.setEmpty();
            return windowInsetsCompat;
        }

        @DoNotInline
        public static boolean dispatchNestedFling(@NonNull View view, float f11, float f12, boolean z11) {
            return view.dispatchNestedFling(f11, f12, z11);
        }

        @DoNotInline
        public static boolean dispatchNestedPreFling(@NonNull View view, float f11, float f12) {
            return view.dispatchNestedPreFling(f11, f12);
        }

        @DoNotInline
        public static boolean dispatchNestedPreScroll(View view, int i11, int i12, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i11, i12, iArr, iArr2);
        }

        @DoNotInline
        public static boolean dispatchNestedScroll(View view, int i11, int i12, int i13, int i14, int[] iArr) {
            return view.dispatchNestedScroll(i11, i12, i13, i14, iArr);
        }

        @DoNotInline
        public static ColorStateList getBackgroundTintList(View view) {
            return view.getBackgroundTintList();
        }

        @DoNotInline
        public static PorterDuff.Mode getBackgroundTintMode(View view) {
            return view.getBackgroundTintMode();
        }

        @DoNotInline
        public static float getElevation(View view) {
            return view.getElevation();
        }

        @Nullable
        @DoNotInline
        public static WindowInsetsCompat getRootWindowInsets(@NonNull View view) {
            return WindowInsetsCompat.Api21ReflectionHolder.getRootWindowInsets(view);
        }

        @DoNotInline
        public static String getTransitionName(View view) {
            return view.getTransitionName();
        }

        @DoNotInline
        public static float getTranslationZ(View view) {
            return view.getTranslationZ();
        }

        @DoNotInline
        public static float getZ(@NonNull View view) {
            return view.getZ();
        }

        @DoNotInline
        public static boolean hasNestedScrollingParent(View view) {
            return view.hasNestedScrollingParent();
        }

        @DoNotInline
        public static boolean isImportantForAccessibility(View view) {
            return view.isImportantForAccessibility();
        }

        @DoNotInline
        public static boolean isNestedScrollingEnabled(View view) {
            return view.isNestedScrollingEnabled();
        }

        @DoNotInline
        public static void setBackgroundTintList(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        @DoNotInline
        public static void setBackgroundTintMode(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        @DoNotInline
        public static void setElevation(View view, float f11) {
            view.setElevation(f11);
        }

        @DoNotInline
        public static void setNestedScrollingEnabled(View view, boolean z11) {
            view.setNestedScrollingEnabled(z11);
        }

        @DoNotInline
        public static void setOnApplyWindowInsetsListener(@NonNull final View view, @Nullable final OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(R.id.tag_on_apply_window_listener, onApplyWindowInsetsListener);
            }
            if (onApplyWindowInsetsListener == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
            } else {
                view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: androidx.core.view.ViewCompat.Api21Impl.1
                    WindowInsetsCompat mLastInsets = null;

                    @Override // android.view.View.OnApplyWindowInsetsListener
                    public WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                        WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(windowInsets, view2);
                        int i11 = Build.VERSION.SDK_INT;
                        if (i11 < 30) {
                            Api21Impl.callCompatInsetAnimationCallback(windowInsets, view);
                            if (windowInsetsCompat.equals(this.mLastInsets)) {
                                return onApplyWindowInsetsListener.onApplyWindowInsets(view2, windowInsetsCompat).toWindowInsets();
                            }
                        }
                        this.mLastInsets = windowInsetsCompat;
                        WindowInsetsCompat onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(view2, windowInsetsCompat);
                        if (i11 >= 30) {
                            return onApplyWindowInsets.toWindowInsets();
                        }
                        ViewCompat.requestApplyInsets(view2);
                        return onApplyWindowInsets.toWindowInsets();
                    }
                });
            }
        }

        @DoNotInline
        public static void setTransitionName(View view, String str) {
            view.setTransitionName(str);
        }

        @DoNotInline
        public static void setTranslationZ(View view, float f11) {
            view.setTranslationZ(f11);
        }

        @DoNotInline
        public static void setZ(@NonNull View view, float f11) {
            view.setZ(f11);
        }

        @DoNotInline
        public static boolean startNestedScroll(View view, int i11) {
            return view.startNestedScroll(i11);
        }

        @DoNotInline
        public static void stopNestedScroll(View view) {
            view.stopNestedScroll();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(23)
    public static class Api23Impl {
        private Api23Impl() {
        }

        @Nullable
        public static WindowInsetsCompat getRootWindowInsets(@NonNull View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(rootWindowInsets);
            windowInsetsCompat.setRootWindowInsets(windowInsetsCompat);
            windowInsetsCompat.copyRootViewBounds(view.getRootView());
            return windowInsetsCompat;
        }

        @DoNotInline
        public static int getScrollIndicators(@NonNull View view) {
            return view.getScrollIndicators();
        }

        @DoNotInline
        public static void setScrollIndicators(@NonNull View view, int i11) {
            view.setScrollIndicators(i11);
        }

        @DoNotInline
        public static void setScrollIndicators(@NonNull View view, int i11, int i12) {
            view.setScrollIndicators(i11, i12);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(24)
    public static class Api24Impl {
        private Api24Impl() {
        }

        @DoNotInline
        public static void cancelDragAndDrop(@NonNull View view) {
            view.cancelDragAndDrop();
        }

        @DoNotInline
        public static void dispatchFinishTemporaryDetach(View view) {
            view.dispatchFinishTemporaryDetach();
        }

        @DoNotInline
        public static void dispatchStartTemporaryDetach(View view) {
            view.dispatchStartTemporaryDetach();
        }

        @DoNotInline
        public static void setPointerIcon(@NonNull View view, PointerIcon pointerIcon) {
            view.setPointerIcon(pointerIcon);
        }

        @DoNotInline
        public static boolean startDragAndDrop(@NonNull View view, @Nullable ClipData clipData, @NonNull View.DragShadowBuilder dragShadowBuilder, @Nullable Object obj, int i11) {
            return view.startDragAndDrop(clipData, dragShadowBuilder, obj, i11);
        }

        @DoNotInline
        public static void updateDragShadow(@NonNull View view, @NonNull View.DragShadowBuilder dragShadowBuilder) {
            view.updateDragShadow(dragShadowBuilder);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(26)
    public static class Api26Impl {
        private Api26Impl() {
        }

        @DoNotInline
        public static void addKeyboardNavigationClusters(@NonNull View view, Collection<View> collection, int i11) {
            view.addKeyboardNavigationClusters(collection, i11);
        }

        @DoNotInline
        public static AutofillId getAutofillId(View view) {
            return view.getAutofillId();
        }

        @DoNotInline
        public static int getImportantForAutofill(View view) {
            return view.getImportantForAutofill();
        }

        @DoNotInline
        public static int getNextClusterForwardId(@NonNull View view) {
            return view.getNextClusterForwardId();
        }

        @DoNotInline
        public static boolean hasExplicitFocusable(@NonNull View view) {
            return view.hasExplicitFocusable();
        }

        @DoNotInline
        public static boolean isFocusedByDefault(@NonNull View view) {
            return view.isFocusedByDefault();
        }

        @DoNotInline
        public static boolean isImportantForAutofill(View view) {
            return view.isImportantForAutofill();
        }

        @DoNotInline
        public static boolean isKeyboardNavigationCluster(@NonNull View view) {
            return view.isKeyboardNavigationCluster();
        }

        @DoNotInline
        public static View keyboardNavigationClusterSearch(@NonNull View view, View view2, int i11) {
            return view.keyboardNavigationClusterSearch(view2, i11);
        }

        @DoNotInline
        public static boolean restoreDefaultFocus(@NonNull View view) {
            return view.restoreDefaultFocus();
        }

        @DoNotInline
        public static void setAutofillHints(@NonNull View view, String... strArr) {
            view.setAutofillHints(strArr);
        }

        @DoNotInline
        public static void setFocusedByDefault(@NonNull View view, boolean z11) {
            view.setFocusedByDefault(z11);
        }

        @DoNotInline
        public static void setImportantForAutofill(View view, int i11) {
            view.setImportantForAutofill(i11);
        }

        @DoNotInline
        public static void setKeyboardNavigationCluster(@NonNull View view, boolean z11) {
            view.setKeyboardNavigationCluster(z11);
        }

        @DoNotInline
        public static void setNextClusterForwardId(View view, int i11) {
            view.setNextClusterForwardId(i11);
        }

        @DoNotInline
        public static void setTooltipText(@NonNull View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(28)
    public static class Api28Impl {
        private Api28Impl() {
        }

        @DoNotInline
        public static void addOnUnhandledKeyEventListener(@NonNull View view, @NonNull final OnUnhandledKeyEventListenerCompat onUnhandledKeyEventListenerCompat) {
            int i11 = R.id.tag_unhandled_key_listeners;
            SimpleArrayMap simpleArrayMap = (SimpleArrayMap) view.getTag(i11);
            if (simpleArrayMap == null) {
                simpleArrayMap = new SimpleArrayMap();
                view.setTag(i11, simpleArrayMap);
            }
            Objects.requireNonNull(onUnhandledKeyEventListenerCompat);
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener = new View.OnUnhandledKeyEventListener() { // from class: androidx.core.view.f0
                @Override // android.view.View.OnUnhandledKeyEventListener
                public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                    return ViewCompat.OnUnhandledKeyEventListenerCompat.this.onUnhandledKeyEvent(view2, keyEvent);
                }
            };
            simpleArrayMap.put(onUnhandledKeyEventListenerCompat, onUnhandledKeyEventListener);
            view.addOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        @DoNotInline
        public static CharSequence getAccessibilityPaneTitle(View view) {
            return view.getAccessibilityPaneTitle();
        }

        @DoNotInline
        public static boolean isAccessibilityHeading(View view) {
            return view.isAccessibilityHeading();
        }

        @DoNotInline
        public static boolean isScreenReaderFocusable(View view) {
            return view.isScreenReaderFocusable();
        }

        @DoNotInline
        public static void removeOnUnhandledKeyEventListener(@NonNull View view, @NonNull OnUnhandledKeyEventListenerCompat onUnhandledKeyEventListenerCompat) {
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
            SimpleArrayMap simpleArrayMap = (SimpleArrayMap) view.getTag(R.id.tag_unhandled_key_listeners);
            if (simpleArrayMap == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) simpleArrayMap.get(onUnhandledKeyEventListenerCompat)) == null) {
                return;
            }
            view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        @DoNotInline
        public static <T> T requireViewById(View view, int i11) {
            return (T) view.requireViewById(i11);
        }

        @DoNotInline
        public static void setAccessibilityHeading(View view, boolean z11) {
            view.setAccessibilityHeading(z11);
        }

        @DoNotInline
        public static void setAccessibilityPaneTitle(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        @DoNotInline
        public static void setAutofillId(View view, AutofillIdCompat autofillIdCompat) {
            view.setAutofillId(autofillIdCompat == null ? null : autofillIdCompat.toAutofillId());
        }

        @DoNotInline
        public static void setScreenReaderFocusable(View view, boolean z11) {
            view.setScreenReaderFocusable(z11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(29)
    public static class Api29Impl {
        private Api29Impl() {
        }

        @DoNotInline
        public static View.AccessibilityDelegate getAccessibilityDelegate(View view) {
            return view.getAccessibilityDelegate();
        }

        @DoNotInline
        public static ContentCaptureSession getContentCaptureSession(View view) {
            return view.getContentCaptureSession();
        }

        @DoNotInline
        public static List<Rect> getSystemGestureExclusionRects(View view) {
            return view.getSystemGestureExclusionRects();
        }

        @DoNotInline
        public static void saveAttributeDataForStyleable(@NonNull View view, @NonNull Context context, @NonNull int[] iArr, @Nullable AttributeSet attributeSet, @NonNull TypedArray typedArray, int i11, int i12) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i11, i12);
        }

        @DoNotInline
        public static void setContentCaptureSession(View view, ContentCaptureSessionCompat contentCaptureSessionCompat) {
            view.setContentCaptureSession(contentCaptureSessionCompat == null ? null : contentCaptureSessionCompat.toContentCaptureSession());
        }

        @DoNotInline
        public static void setSystemGestureExclusionRects(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(30)
    public static class Api30Impl {
        private Api30Impl() {
        }

        @DoNotInline
        public static int getImportantForContentCapture(View view) {
            return view.getImportantForContentCapture();
        }

        @DoNotInline
        public static CharSequence getStateDescription(View view) {
            return view.getStateDescription();
        }

        @Nullable
        public static WindowInsetsControllerCompat getWindowInsetsController(@NonNull View view) {
            WindowInsetsController windowInsetsController = view.getWindowInsetsController();
            if (windowInsetsController != null) {
                return WindowInsetsControllerCompat.toWindowInsetsControllerCompat(windowInsetsController);
            }
            return null;
        }

        @DoNotInline
        public static boolean isImportantForContentCapture(View view) {
            return view.isImportantForContentCapture();
        }

        @DoNotInline
        public static void setImportantForContentCapture(View view, int i11) {
            view.setImportantForContentCapture(i11);
        }

        @DoNotInline
        public static void setStateDescription(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(31)
    public static final class Api31Impl {
        private Api31Impl() {
        }

        @Nullable
        @DoNotInline
        public static String[] getReceiveContentMimeTypes(@NonNull View view) {
            return view.getReceiveContentMimeTypes();
        }

        @Nullable
        @DoNotInline
        public static ContentInfoCompat performReceiveContent(@NonNull View view, @NonNull ContentInfoCompat contentInfoCompat) {
            ContentInfo contentInfo = contentInfoCompat.toContentInfo();
            ContentInfo performReceiveContent = view.performReceiveContent(contentInfo);
            if (performReceiveContent == null) {
                return null;
            }
            return performReceiveContent == contentInfo ? contentInfoCompat : ContentInfoCompat.toContentInfoCompat(performReceiveContent);
        }

        @DoNotInline
        public static void setOnReceiveContentListener(@NonNull View view, @Nullable String[] strArr, @Nullable OnReceiveContentListener onReceiveContentListener) {
            if (onReceiveContentListener == null) {
                view.setOnReceiveContentListener(strArr, null);
            } else {
                view.setOnReceiveContentListener(strArr, new OnReceiveContentListenerAdapter(onReceiveContentListener));
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface FocusDirection {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface FocusRealDirection {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface FocusRelativeDirection {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface NestedScrollType {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(31)
    public static final class OnReceiveContentListenerAdapter implements android.view.OnReceiveContentListener {

        @NonNull
        private final OnReceiveContentListener mJetpackListener;

        public OnReceiveContentListenerAdapter(@NonNull OnReceiveContentListener onReceiveContentListener) {
            this.mJetpackListener = onReceiveContentListener;
        }

        @Nullable
        public ContentInfo onReceiveContent(@NonNull View view, @NonNull ContentInfo contentInfo) {
            ContentInfoCompat contentInfoCompat = ContentInfoCompat.toContentInfoCompat(contentInfo);
            ContentInfoCompat onReceiveContent = this.mJetpackListener.onReceiveContent(view, contentInfoCompat);
            if (onReceiveContent == null) {
                return null;
            }
            return onReceiveContent == contentInfoCompat ? contentInfo : onReceiveContent.toContentInfo();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface OnUnhandledKeyEventListenerCompat {
        boolean onUnhandledKeyEvent(@NonNull View view, @NonNull KeyEvent keyEvent);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface ScrollAxis {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface ScrollIndicators {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UnhandledKeyEventManager {
        private static final ArrayList<WeakReference<View>> sViewsWithListeners = new ArrayList<>();

        @Nullable
        private WeakHashMap<View, Boolean> mViewsContainingListeners = null;
        private SparseArray<WeakReference<View>> mCapturedKeys = null;
        private WeakReference<KeyEvent> mLastDispatchedPreViewKeyEvent = null;

        public static UnhandledKeyEventManager at(View view) {
            int i11 = R.id.tag_unhandled_key_event_manager;
            UnhandledKeyEventManager unhandledKeyEventManager = (UnhandledKeyEventManager) view.getTag(i11);
            if (unhandledKeyEventManager != null) {
                return unhandledKeyEventManager;
            }
            UnhandledKeyEventManager unhandledKeyEventManager2 = new UnhandledKeyEventManager();
            view.setTag(i11, unhandledKeyEventManager2);
            return unhandledKeyEventManager2;
        }

        @Nullable
        private View dispatchInOrder(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.mViewsContainingListeners;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View dispatchInOrder = dispatchInOrder(viewGroup.getChildAt(childCount), keyEvent);
                        if (dispatchInOrder != null) {
                            return dispatchInOrder;
                        }
                    }
                }
                if (onUnhandledKeyEvent(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        private SparseArray<WeakReference<View>> getCapturedKeys() {
            if (this.mCapturedKeys == null) {
                this.mCapturedKeys = new SparseArray<>();
            }
            return this.mCapturedKeys;
        }

        private boolean onUnhandledKeyEvent(@NonNull View view, @NonNull KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((OnUnhandledKeyEventListenerCompat) arrayList.get(size)).onUnhandledKeyEvent(view, keyEvent)) {
                    return true;
                }
            }
            return false;
        }

        private void recalcViewsWithUnhandled() {
            WeakHashMap<View, Boolean> weakHashMap = this.mViewsContainingListeners;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList = sViewsWithListeners;
            if (arrayList.isEmpty()) {
                return;
            }
            synchronized (arrayList) {
                try {
                    if (this.mViewsContainingListeners == null) {
                        this.mViewsContainingListeners = new WeakHashMap<>();
                    }
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ArrayList<WeakReference<View>> arrayList2 = sViewsWithListeners;
                        View view = arrayList2.get(size).get();
                        if (view == null) {
                            arrayList2.remove(size);
                        } else {
                            this.mViewsContainingListeners.put(view, Boolean.TRUE);
                            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                this.mViewsContainingListeners.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public static void registerListeningView(View view) {
            ArrayList<WeakReference<View>> arrayList = sViewsWithListeners;
            synchronized (arrayList) {
                try {
                    Iterator<WeakReference<View>> it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (it.next().get() == view) {
                            return;
                        }
                    }
                    sViewsWithListeners.add(new WeakReference<>(view));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public static void unregisterListeningView(View view) {
            synchronized (sViewsWithListeners) {
                int i11 = 0;
                while (true) {
                    try {
                        ArrayList<WeakReference<View>> arrayList = sViewsWithListeners;
                        if (i11 >= arrayList.size()) {
                            return;
                        }
                        if (arrayList.get(i11).get() == view) {
                            arrayList.remove(i11);
                            return;
                        }
                        i11++;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }

        public boolean dispatch(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                recalcViewsWithUnhandled();
            }
            View dispatchInOrder = dispatchInOrder(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (dispatchInOrder != null && !KeyEvent.isModifierKey(keyCode)) {
                    getCapturedKeys().put(keyCode, new WeakReference<>(dispatchInOrder));
                }
            }
            return dispatchInOrder != null;
        }

        public boolean preDispatch(KeyEvent keyEvent) {
            WeakReference<View> weakReference;
            int indexOfKey;
            WeakReference<KeyEvent> weakReference2 = this.mLastDispatchedPreViewKeyEvent;
            if (weakReference2 != null && weakReference2.get() == keyEvent) {
                return false;
            }
            this.mLastDispatchedPreViewKeyEvent = new WeakReference<>(keyEvent);
            SparseArray<WeakReference<View>> capturedKeys = getCapturedKeys();
            if (keyEvent.getAction() != 1 || (indexOfKey = capturedKeys.indexOfKey(keyEvent.getKeyCode())) < 0) {
                weakReference = null;
            } else {
                weakReference = capturedKeys.valueAt(indexOfKey);
                capturedKeys.removeAt(indexOfKey);
            }
            if (weakReference == null) {
                weakReference = capturedKeys.get(keyEvent.getKeyCode());
            }
            if (weakReference == null) {
                return false;
            }
            View view = weakReference.get();
            if (view != null && view.isAttachedToWindow()) {
                onUnhandledKeyEvent(view, keyEvent);
            }
            return true;
        }
    }

    @Deprecated
    public ViewCompat() {
    }

    private static AccessibilityViewProperty<Boolean> accessibilityHeadingProperty() {
        return new AccessibilityViewProperty<Boolean>(R.id.tag_accessibility_heading, Boolean.class, 28) { // from class: androidx.core.view.ViewCompat.4
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
            @RequiresApi(28)
            public Boolean frameworkGet(View view) {
                return Boolean.valueOf(Api28Impl.isAccessibilityHeading(view));
            }

            @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
            @RequiresApi(28)
            public void frameworkSet(View view, Boolean bool) {
                Api28Impl.setAccessibilityHeading(view, bool.booleanValue());
            }

            @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
            public boolean shouldUpdate(Boolean bool, Boolean bool2) {
                return !booleanNullToFalseEquals(bool, bool2);
            }
        };
    }

    public static int addAccessibilityAction(@NonNull View view, @NonNull CharSequence charSequence, @NonNull AccessibilityViewCommand accessibilityViewCommand) {
        int availableActionIdFromResources = getAvailableActionIdFromResources(view, charSequence);
        if (availableActionIdFromResources != -1) {
            addAccessibilityAction(view, new AccessibilityNodeInfoCompat.AccessibilityActionCompat(availableActionIdFromResources, charSequence, accessibilityViewCommand));
        }
        return availableActionIdFromResources;
    }

    public static void addKeyboardNavigationClusters(@NonNull View view, @NonNull Collection<View> collection, int i11) {
        if (Build.VERSION.SDK_INT >= 26) {
            Api26Impl.addKeyboardNavigationClusters(view, collection, i11);
        }
    }

    public static void addOnUnhandledKeyEventListener(@NonNull View view, @NonNull OnUnhandledKeyEventListenerCompat onUnhandledKeyEventListenerCompat) {
        if (Build.VERSION.SDK_INT >= 28) {
            Api28Impl.addOnUnhandledKeyEventListener(view, onUnhandledKeyEventListenerCompat);
            return;
        }
        int i11 = R.id.tag_unhandled_key_listeners;
        ArrayList arrayList = (ArrayList) view.getTag(i11);
        if (arrayList == null) {
            arrayList = new ArrayList();
            view.setTag(i11, arrayList);
        }
        arrayList.add(onUnhandledKeyEventListenerCompat);
        if (arrayList.size() == 1) {
            UnhandledKeyEventManager.registerListeningView(view);
        }
    }

    @NonNull
    @Deprecated
    public static ViewPropertyAnimatorCompat animate(@NonNull View view) {
        if (sViewPropertyAnimatorMap == null) {
            sViewPropertyAnimatorMap = new WeakHashMap<>();
        }
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompat = sViewPropertyAnimatorMap.get(view);
        if (viewPropertyAnimatorCompat != null) {
            return viewPropertyAnimatorCompat;
        }
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompat2 = new ViewPropertyAnimatorCompat(view);
        sViewPropertyAnimatorMap.put(view, viewPropertyAnimatorCompat2);
        return viewPropertyAnimatorCompat2;
    }

    private static void bindTempDetach() {
        try {
            sDispatchStartTemporaryDetach = View.class.getDeclaredMethod("dispatchStartTemporaryDetach", null);
            sDispatchFinishTemporaryDetach = View.class.getDeclaredMethod("dispatchFinishTemporaryDetach", null);
        } catch (NoSuchMethodException e11) {
            Log.e(TAG, "Couldn't find method", e11);
        }
        sTempDetachBound = true;
    }

    @Deprecated
    public static boolean canScrollHorizontally(View view, int i11) {
        return view.canScrollHorizontally(i11);
    }

    @Deprecated
    public static boolean canScrollVertically(View view, int i11) {
        return view.canScrollVertically(i11);
    }

    public static void cancelDragAndDrop(@NonNull View view) {
        Api24Impl.cancelDragAndDrop(view);
    }

    @Deprecated
    public static int combineMeasuredStates(int i11, int i12) {
        return View.combineMeasuredStates(i11, i12);
    }

    private static void compatOffsetLeftAndRight(View view, int i11) {
        view.offsetLeftAndRight(i11);
        if (view.getVisibility() == 0) {
            tickleInvalidationFlag(view);
            Object parent = view.getParent();
            if (parent instanceof View) {
                tickleInvalidationFlag((View) parent);
            }
        }
    }

    private static void compatOffsetTopAndBottom(View view, int i11) {
        view.offsetTopAndBottom(i11);
        if (view.getVisibility() == 0) {
            tickleInvalidationFlag(view);
            Object parent = view.getParent();
            if (parent instanceof View) {
                tickleInvalidationFlag((View) parent);
            }
        }
    }

    @NonNull
    public static WindowInsetsCompat computeSystemWindowInsets(@NonNull View view, @NonNull WindowInsetsCompat windowInsetsCompat, @NonNull Rect rect) {
        return Api21Impl.computeSystemWindowInsets(view, windowInsetsCompat, rect);
    }

    @NonNull
    public static WindowInsetsCompat dispatchApplyWindowInsets(@NonNull View view, @NonNull WindowInsetsCompat windowInsetsCompat) {
        WindowInsets windowInsets = windowInsetsCompat.toWindowInsets();
        if (windowInsets != null) {
            WindowInsets dispatchApplyWindowInsets = Api20Impl.dispatchApplyWindowInsets(view, windowInsets);
            if (!dispatchApplyWindowInsets.equals(windowInsets)) {
                return WindowInsetsCompat.toWindowInsetsCompat(dispatchApplyWindowInsets, view);
            }
        }
        return windowInsetsCompat;
    }

    public static void dispatchFinishTemporaryDetach(@NonNull View view) {
        Api24Impl.dispatchFinishTemporaryDetach(view);
    }

    public static boolean dispatchNestedFling(@NonNull View view, float f11, float f12, boolean z11) {
        return Api21Impl.dispatchNestedFling(view, f11, f12, z11);
    }

    public static boolean dispatchNestedPreFling(@NonNull View view, float f11, float f12) {
        return Api21Impl.dispatchNestedPreFling(view, f11, f12);
    }

    public static boolean dispatchNestedPreScroll(@NonNull View view, int i11, int i12, @Nullable int[] iArr, @Nullable int[] iArr2) {
        return Api21Impl.dispatchNestedPreScroll(view, i11, i12, iArr, iArr2);
    }

    public static boolean dispatchNestedScroll(@NonNull View view, int i11, int i12, int i13, int i14, @Nullable int[] iArr) {
        return Api21Impl.dispatchNestedScroll(view, i11, i12, i13, i14, iArr);
    }

    public static void dispatchStartTemporaryDetach(@NonNull View view) {
        Api24Impl.dispatchStartTemporaryDetach(view);
    }

    @UiThread
    public static boolean dispatchUnhandledKeyEventBeforeCallback(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return UnhandledKeyEventManager.at(view).dispatch(view, keyEvent);
    }

    @UiThread
    public static boolean dispatchUnhandledKeyEventBeforeHierarchy(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return UnhandledKeyEventManager.at(view).preDispatch(keyEvent);
    }

    public static void enableAccessibleClickableSpanSupport(@NonNull View view) {
        ensureAccessibilityDelegateCompat(view);
    }

    public static void ensureAccessibilityDelegateCompat(@NonNull View view) {
        AccessibilityDelegateCompat accessibilityDelegate = getAccessibilityDelegate(view);
        if (accessibilityDelegate == null) {
            accessibilityDelegate = new AccessibilityDelegateCompat();
        }
        setAccessibilityDelegate(view, accessibilityDelegate);
    }

    @Deprecated
    public static int generateViewId() {
        return View.generateViewId();
    }

    @Nullable
    public static AccessibilityDelegateCompat getAccessibilityDelegate(@NonNull View view) {
        View.AccessibilityDelegate accessibilityDelegateInternal = getAccessibilityDelegateInternal(view);
        if (accessibilityDelegateInternal == null) {
            return null;
        }
        return accessibilityDelegateInternal instanceof AccessibilityDelegateCompat.AccessibilityDelegateAdapter ? ((AccessibilityDelegateCompat.AccessibilityDelegateAdapter) accessibilityDelegateInternal).mCompat : new AccessibilityDelegateCompat(accessibilityDelegateInternal);
    }

    @Nullable
    private static View.AccessibilityDelegate getAccessibilityDelegateInternal(@NonNull View view) {
        return Build.VERSION.SDK_INT >= 29 ? Api29Impl.getAccessibilityDelegate(view) : getAccessibilityDelegateThroughReflection(view);
    }

    @Nullable
    private static View.AccessibilityDelegate getAccessibilityDelegateThroughReflection(@NonNull View view) {
        if (sAccessibilityDelegateCheckFailed) {
            return null;
        }
        if (sAccessibilityDelegateField == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                sAccessibilityDelegateField = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                sAccessibilityDelegateCheckFailed = true;
                return null;
            }
        }
        try {
            Object obj = sAccessibilityDelegateField.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            sAccessibilityDelegateCheckFailed = true;
            return null;
        }
    }

    @Deprecated
    public static int getAccessibilityLiveRegion(@NonNull View view) {
        return view.getAccessibilityLiveRegion();
    }

    @Nullable
    public static AccessibilityNodeProviderCompat getAccessibilityNodeProvider(@NonNull View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = view.getAccessibilityNodeProvider();
        if (accessibilityNodeProvider != null) {
            return new AccessibilityNodeProviderCompat(accessibilityNodeProvider);
        }
        return null;
    }

    @Nullable
    @UiThread
    public static CharSequence getAccessibilityPaneTitle(@NonNull View view) {
        return paneTitleProperty().get(view);
    }

    private static List<AccessibilityNodeInfoCompat.AccessibilityActionCompat> getActionList(View view) {
        int i11 = R.id.tag_accessibility_actions;
        ArrayList arrayList = (ArrayList) view.getTag(i11);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(i11, arrayList2);
        return arrayList2;
    }

    @Deprecated
    public static float getAlpha(View view) {
        return view.getAlpha();
    }

    @Nullable
    public static AutofillIdCompat getAutofillId(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return AutofillIdCompat.toAutofillIdCompat(Api26Impl.getAutofillId(view));
        }
        return null;
    }

    private static int getAvailableActionIdFromResources(View view, @NonNull CharSequence charSequence) {
        List<AccessibilityNodeInfoCompat.AccessibilityActionCompat> actionList = getActionList(view);
        for (int i11 = 0; i11 < actionList.size(); i11++) {
            if (TextUtils.equals(charSequence, actionList.get(i11).getLabel())) {
                return actionList.get(i11).getId();
            }
        }
        int i12 = -1;
        int i13 = 0;
        while (true) {
            int[] iArr = ACCESSIBILITY_ACTIONS_RESOURCE_IDS;
            if (i13 >= iArr.length || i12 != -1) {
                break;
            }
            int i14 = iArr[i13];
            boolean z11 = true;
            for (int i15 = 0; i15 < actionList.size(); i15++) {
                z11 &= actionList.get(i15).getId() != i14;
            }
            if (z11) {
                i12 = i14;
            }
            i13++;
        }
        return i12;
    }

    @Nullable
    public static ColorStateList getBackgroundTintList(@NonNull View view) {
        return Api21Impl.getBackgroundTintList(view);
    }

    @Nullable
    public static PorterDuff.Mode getBackgroundTintMode(@NonNull View view) {
        return Api21Impl.getBackgroundTintMode(view);
    }

    @Nullable
    @Deprecated
    public static Rect getClipBounds(@NonNull View view) {
        return view.getClipBounds();
    }

    @Nullable
    public static ContentCaptureSessionCompat getContentCaptureSession(@NonNull View view) {
        ContentCaptureSession contentCaptureSession;
        if (Build.VERSION.SDK_INT < 29 || (contentCaptureSession = Api29Impl.getContentCaptureSession(view)) == null) {
            return null;
        }
        return ContentCaptureSessionCompat.toContentCaptureSessionCompat(contentCaptureSession, view);
    }

    @Nullable
    @Deprecated
    public static Display getDisplay(@NonNull View view) {
        return view.getDisplay();
    }

    public static float getElevation(@NonNull View view) {
        return Api21Impl.getElevation(view);
    }

    private static Rect getEmptyTempRect() {
        if (sThreadLocalRect == null) {
            sThreadLocalRect = new ThreadLocal<>();
        }
        Rect rect = sThreadLocalRect.get();
        if (rect == null) {
            rect = new Rect();
            sThreadLocalRect.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static OnReceiveContentViewBehavior getFallback(@NonNull View view) {
        return view instanceof OnReceiveContentViewBehavior ? (OnReceiveContentViewBehavior) view : NO_OP_ON_RECEIVE_CONTENT_VIEW_BEHAVIOR;
    }

    @Deprecated
    public static boolean getFitsSystemWindows(@NonNull View view) {
        return view.getFitsSystemWindows();
    }

    @Deprecated
    public static int getImportantForAccessibility(@NonNull View view) {
        return view.getImportantForAccessibility();
    }

    @SuppressLint({"InlinedApi"})
    public static int getImportantForAutofill(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return Api26Impl.getImportantForAutofill(view);
        }
        return 0;
    }

    public static int getImportantForContentCapture(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return Api30Impl.getImportantForContentCapture(view);
        }
        return 0;
    }

    @Deprecated
    public static int getLabelFor(@NonNull View view) {
        return view.getLabelFor();
    }

    @Deprecated
    public static int getLayerType(View view) {
        return view.getLayerType();
    }

    @Deprecated
    public static int getLayoutDirection(@NonNull View view) {
        return view.getLayoutDirection();
    }

    @Nullable
    @Deprecated
    public static Matrix getMatrix(View view) {
        return view.getMatrix();
    }

    @Deprecated
    public static int getMeasuredHeightAndState(View view) {
        return view.getMeasuredHeightAndState();
    }

    @Deprecated
    public static int getMeasuredState(View view) {
        return view.getMeasuredState();
    }

    @Deprecated
    public static int getMeasuredWidthAndState(View view) {
        return view.getMeasuredWidthAndState();
    }

    @Deprecated
    public static int getMinimumHeight(@NonNull View view) {
        return view.getMinimumHeight();
    }

    @Deprecated
    public static int getMinimumWidth(@NonNull View view) {
        return view.getMinimumWidth();
    }

    public static int getNextClusterForwardId(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return Api26Impl.getNextClusterForwardId(view);
        }
        return -1;
    }

    @Nullable
    public static String[] getOnReceiveContentMimeTypes(@NonNull View view) {
        return Build.VERSION.SDK_INT >= 31 ? Api31Impl.getReceiveContentMimeTypes(view) : (String[]) view.getTag(R.id.tag_on_receive_content_mime_types);
    }

    @Deprecated
    public static int getOverScrollMode(View view) {
        return view.getOverScrollMode();
    }

    @Px
    @Deprecated
    public static int getPaddingEnd(@NonNull View view) {
        return view.getPaddingEnd();
    }

    @Px
    @Deprecated
    public static int getPaddingStart(@NonNull View view) {
        return view.getPaddingStart();
    }

    @Nullable
    @Deprecated
    public static ViewParent getParentForAccessibility(@NonNull View view) {
        return view.getParentForAccessibility();
    }

    @Deprecated
    public static float getPivotX(View view) {
        return view.getPivotX();
    }

    @Deprecated
    public static float getPivotY(View view) {
        return view.getPivotY();
    }

    @Nullable
    public static WindowInsetsCompat getRootWindowInsets(@NonNull View view) {
        return Api23Impl.getRootWindowInsets(view);
    }

    @Deprecated
    public static float getRotation(View view) {
        return view.getRotation();
    }

    @Deprecated
    public static float getRotationX(View view) {
        return view.getRotationX();
    }

    @Deprecated
    public static float getRotationY(View view) {
        return view.getRotationY();
    }

    @Deprecated
    public static float getScaleX(View view) {
        return view.getScaleX();
    }

    @Deprecated
    public static float getScaleY(View view) {
        return view.getScaleY();
    }

    public static int getScrollIndicators(@NonNull View view) {
        return Api23Impl.getScrollIndicators(view);
    }

    @Nullable
    @UiThread
    public static CharSequence getStateDescription(@NonNull View view) {
        return stateDescriptionProperty().get(view);
    }

    @NonNull
    public static List<Rect> getSystemGestureExclusionRects(@NonNull View view) {
        return Build.VERSION.SDK_INT >= 29 ? Api29Impl.getSystemGestureExclusionRects(view) : Collections.EMPTY_LIST;
    }

    @Nullable
    public static String getTransitionName(@NonNull View view) {
        return Api21Impl.getTransitionName(view);
    }

    @Deprecated
    public static float getTranslationX(View view) {
        return view.getTranslationX();
    }

    @Deprecated
    public static float getTranslationY(View view) {
        return view.getTranslationY();
    }

    public static float getTranslationZ(@NonNull View view) {
        return Api21Impl.getTranslationZ(view);
    }

    @Nullable
    @Deprecated
    public static WindowInsetsControllerCompat getWindowInsetsController(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return Api30Impl.getWindowInsetsController(view);
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                Window window = ((Activity) context).getWindow();
                if (window != null) {
                    return WindowCompat.getInsetsController(window, view);
                }
                return null;
            }
        }
        return null;
    }

    @Deprecated
    public static int getWindowSystemUiVisibility(@NonNull View view) {
        return view.getWindowSystemUiVisibility();
    }

    @Deprecated
    public static float getX(View view) {
        return view.getX();
    }

    @Deprecated
    public static float getY(View view) {
        return view.getY();
    }

    public static float getZ(@NonNull View view) {
        return Api21Impl.getZ(view);
    }

    public static boolean hasAccessibilityDelegate(@NonNull View view) {
        return getAccessibilityDelegateInternal(view) != null;
    }

    public static boolean hasExplicitFocusable(@NonNull View view) {
        return Build.VERSION.SDK_INT >= 26 ? Api26Impl.hasExplicitFocusable(view) : view.hasFocusable();
    }

    public static boolean hasNestedScrollingParent(@NonNull View view) {
        return Api21Impl.hasNestedScrollingParent(view);
    }

    @Deprecated
    public static boolean hasOnClickListeners(@NonNull View view) {
        return view.hasOnClickListeners();
    }

    @Deprecated
    public static boolean hasOverlappingRendering(@NonNull View view) {
        return view.hasOverlappingRendering();
    }

    @Deprecated
    public static boolean hasTransientState(@NonNull View view) {
        return view.hasTransientState();
    }

    @UiThread
    public static boolean isAccessibilityHeading(@NonNull View view) {
        Boolean bool = accessibilityHeadingProperty().get(view);
        return bool != null && bool.booleanValue();
    }

    @Deprecated
    public static boolean isAttachedToWindow(@NonNull View view) {
        return view.isAttachedToWindow();
    }

    public static boolean isFocusedByDefault(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return Api26Impl.isFocusedByDefault(view);
        }
        return false;
    }

    public static boolean isImportantForAccessibility(@NonNull View view) {
        return Api21Impl.isImportantForAccessibility(view);
    }

    public static boolean isImportantForAutofill(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return Api26Impl.isImportantForAutofill(view);
        }
        return true;
    }

    public static boolean isImportantForContentCapture(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return Api30Impl.isImportantForContentCapture(view);
        }
        return false;
    }

    @Deprecated
    public static boolean isInLayout(@NonNull View view) {
        return view.isInLayout();
    }

    public static boolean isKeyboardNavigationCluster(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return Api26Impl.isKeyboardNavigationCluster(view);
        }
        return false;
    }

    @Deprecated
    public static boolean isLaidOut(@NonNull View view) {
        return view.isLaidOut();
    }

    @Deprecated
    public static boolean isLayoutDirectionResolved(@NonNull View view) {
        return view.isLayoutDirectionResolved();
    }

    public static boolean isNestedScrollingEnabled(@NonNull View view) {
        return Api21Impl.isNestedScrollingEnabled(view);
    }

    @Deprecated
    public static boolean isOpaque(View view) {
        return view.isOpaque();
    }

    @Deprecated
    public static boolean isPaddingRelative(@NonNull View view) {
        return view.isPaddingRelative();
    }

    @UiThread
    public static boolean isScreenReaderFocusable(@NonNull View view) {
        Boolean bool = screenReaderFocusableProperty().get(view);
        return bool != null && bool.booleanValue();
    }

    @Deprecated
    public static void jumpDrawablesToCurrentState(View view) {
        view.jumpDrawablesToCurrentState();
    }

    @Nullable
    public static View keyboardNavigationClusterSearch(@NonNull View view, @Nullable View view2, int i11) {
        if (Build.VERSION.SDK_INT >= 26) {
            return Api26Impl.keyboardNavigationClusterSearch(view, view2, i11);
        }
        return null;
    }

    public static void notifyViewAccessibilityStateChangedIfNeeded(View view, int i11) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z11 = getAccessibilityPaneTitle(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z11) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z11 ? 32 : 2048);
                obtain.setContentChangeTypes(i11);
                if (z11) {
                    obtain.getText().add(getAccessibilityPaneTitle(view));
                    setImportantForAccessibilityIfNeeded(view);
                }
                view.sendAccessibilityEventUnchecked(obtain);
                return;
            }
            if (i11 == 32) {
                AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain2);
                obtain2.setEventType(32);
                obtain2.setContentChangeTypes(i11);
                obtain2.setSource(view);
                view.onPopulateAccessibilityEvent(obtain2);
                obtain2.getText().add(getAccessibilityPaneTitle(view));
                accessibilityManager.sendAccessibilityEvent(obtain2);
                return;
            }
            if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i11);
                } catch (AbstractMethodError e11) {
                    Log.e(TAG, view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e11);
                }
            }
        }
    }

    public static void offsetLeftAndRight(@NonNull View view, int i11) {
        view.offsetLeftAndRight(i11);
    }

    public static void offsetTopAndBottom(@NonNull View view, int i11) {
        view.offsetTopAndBottom(i11);
    }

    @NonNull
    public static WindowInsetsCompat onApplyWindowInsets(@NonNull View view, @NonNull WindowInsetsCompat windowInsetsCompat) {
        WindowInsets windowInsets = windowInsetsCompat.toWindowInsets();
        if (windowInsets != null) {
            WindowInsets onApplyWindowInsets = Api20Impl.onApplyWindowInsets(view, windowInsets);
            if (!onApplyWindowInsets.equals(windowInsets)) {
                return WindowInsetsCompat.toWindowInsetsCompat(onApplyWindowInsets, view);
            }
        }
        return windowInsetsCompat;
    }

    @Deprecated
    public static void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        view.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    @Deprecated
    public static void onInitializeAccessibilityNodeInfo(@NonNull View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        view.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoCompat.unwrap());
    }

    @Deprecated
    public static void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        view.onPopulateAccessibilityEvent(accessibilityEvent);
    }

    private static AccessibilityViewProperty<CharSequence> paneTitleProperty() {
        return new AccessibilityViewProperty<CharSequence>(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28) { // from class: androidx.core.view.ViewCompat.2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
            @RequiresApi(28)
            public CharSequence frameworkGet(View view) {
                return Api28Impl.getAccessibilityPaneTitle(view);
            }

            @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
            @RequiresApi(28)
            public void frameworkSet(View view, CharSequence charSequence) {
                Api28Impl.setAccessibilityPaneTitle(view, charSequence);
            }

            @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
            public boolean shouldUpdate(CharSequence charSequence, CharSequence charSequence2) {
                return !TextUtils.equals(charSequence, charSequence2);
            }
        };
    }

    @Deprecated
    public static boolean performAccessibilityAction(@NonNull View view, int i11, @Nullable Bundle bundle) {
        return view.performAccessibilityAction(i11, bundle);
    }

    public static boolean performHapticFeedback(@NonNull View view, int i11) {
        int feedbackConstantOrFallback = HapticFeedbackConstantsCompat.getFeedbackConstantOrFallback(i11);
        if (feedbackConstantOrFallback == -1) {
            return false;
        }
        return view.performHapticFeedback(feedbackConstantOrFallback);
    }

    @Nullable
    public static ContentInfoCompat performReceiveContent(@NonNull View view, @NonNull ContentInfoCompat contentInfoCompat) {
        if (Log.isLoggable(TAG, 3)) {
            Log.d(TAG, "performReceiveContent: " + contentInfoCompat + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return Api31Impl.performReceiveContent(view, contentInfoCompat);
        }
        OnReceiveContentListener onReceiveContentListener = (OnReceiveContentListener) view.getTag(R.id.tag_on_receive_content_listener);
        if (onReceiveContentListener == null) {
            return getFallback(view).onReceiveContent(contentInfoCompat);
        }
        ContentInfoCompat onReceiveContent = onReceiveContentListener.onReceiveContent(view, contentInfoCompat);
        if (onReceiveContent == null) {
            return null;
        }
        return getFallback(view).onReceiveContent(onReceiveContent);
    }

    @Deprecated
    public static void postInvalidateOnAnimation(@NonNull View view) {
        view.postInvalidateOnAnimation();
    }

    @Deprecated
    public static void postOnAnimation(@NonNull View view, @NonNull Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    @SuppressLint({"LambdaLast"})
    @Deprecated
    public static void postOnAnimationDelayed(@NonNull View view, @NonNull Runnable runnable, long j11) {
        view.postOnAnimationDelayed(runnable, j11);
    }

    public static void removeAccessibilityAction(@NonNull View view, int i11) {
        removeActionWithId(i11, view);
        notifyViewAccessibilityStateChangedIfNeeded(view, 0);
    }

    private static void removeActionWithId(int i11, View view) {
        List<AccessibilityNodeInfoCompat.AccessibilityActionCompat> actionList = getActionList(view);
        for (int i12 = 0; i12 < actionList.size(); i12++) {
            if (actionList.get(i12).getId() == i11) {
                actionList.remove(i12);
                return;
            }
        }
    }

    public static void removeOnUnhandledKeyEventListener(@NonNull View view, @NonNull OnUnhandledKeyEventListenerCompat onUnhandledKeyEventListenerCompat) {
        if (Build.VERSION.SDK_INT >= 28) {
            Api28Impl.removeOnUnhandledKeyEventListener(view, onUnhandledKeyEventListenerCompat);
            return;
        }
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
        if (arrayList != null) {
            arrayList.remove(onUnhandledKeyEventListenerCompat);
            if (arrayList.size() == 0) {
                UnhandledKeyEventManager.unregisterListeningView(view);
            }
        }
    }

    public static void replaceAccessibilityAction(@NonNull View view, @NonNull AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat, @Nullable CharSequence charSequence, @Nullable AccessibilityViewCommand accessibilityViewCommand) {
        if (accessibilityViewCommand == null && charSequence == null) {
            removeAccessibilityAction(view, accessibilityActionCompat.getId());
        } else {
            addAccessibilityAction(view, accessibilityActionCompat.createReplacementAction(charSequence, accessibilityViewCommand));
        }
    }

    public static void requestApplyInsets(@NonNull View view) {
        Api20Impl.requestApplyInsets(view);
    }

    @NonNull
    public static <T extends View> T requireViewById(@NonNull View view, @IdRes int i11) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (T) Api28Impl.requireViewById(view, i11);
        }
        T t11 = (T) view.findViewById(i11);
        if (t11 != null) {
            return t11;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this View");
    }

    @Deprecated
    public static int resolveSizeAndState(int i11, int i12, int i13) {
        return View.resolveSizeAndState(i11, i12, i13);
    }

    public static boolean restoreDefaultFocus(@NonNull View view) {
        return Build.VERSION.SDK_INT >= 26 ? Api26Impl.restoreDefaultFocus(view) : view.requestFocus();
    }

    public static void saveAttributeDataForStyleable(@NonNull View view, @NonNull @SuppressLint({"ContextFirst"}) Context context, @NonNull int[] iArr, @Nullable AttributeSet attributeSet, @NonNull TypedArray typedArray, int i11, int i12) {
        if (Build.VERSION.SDK_INT >= 29) {
            Api29Impl.saveAttributeDataForStyleable(view, context, iArr, attributeSet, typedArray, i11, i12);
        }
    }

    private static AccessibilityViewProperty<Boolean> screenReaderFocusableProperty() {
        return new AccessibilityViewProperty<Boolean>(R.id.tag_screen_reader_focusable, Boolean.class, 28) { // from class: androidx.core.view.ViewCompat.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
            @RequiresApi(28)
            public Boolean frameworkGet(@NonNull View view) {
                return Boolean.valueOf(Api28Impl.isScreenReaderFocusable(view));
            }

            @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
            @RequiresApi(28)
            public void frameworkSet(@NonNull View view, Boolean bool) {
                Api28Impl.setScreenReaderFocusable(view, bool.booleanValue());
            }

            @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
            public boolean shouldUpdate(Boolean bool, Boolean bool2) {
                return !booleanNullToFalseEquals(bool, bool2);
            }
        };
    }

    public static void setAccessibilityDelegate(@NonNull View view, @Nullable AccessibilityDelegateCompat accessibilityDelegateCompat) {
        if (accessibilityDelegateCompat == null && (getAccessibilityDelegateInternal(view) instanceof AccessibilityDelegateCompat.AccessibilityDelegateAdapter)) {
            accessibilityDelegateCompat = new AccessibilityDelegateCompat();
        }
        setImportantForAccessibilityIfNeeded(view);
        view.setAccessibilityDelegate(accessibilityDelegateCompat == null ? null : accessibilityDelegateCompat.getBridge());
    }

    @UiThread
    public static void setAccessibilityHeading(@NonNull View view, boolean z11) {
        accessibilityHeadingProperty().set(view, Boolean.valueOf(z11));
    }

    @Deprecated
    public static void setAccessibilityLiveRegion(@NonNull View view, int i11) {
        view.setAccessibilityLiveRegion(i11);
    }

    @UiThread
    public static void setAccessibilityPaneTitle(@NonNull View view, @Nullable CharSequence charSequence) {
        paneTitleProperty().set(view, charSequence);
        if (charSequence != null) {
            sAccessibilityPaneVisibilityManager.addAccessibilityPane(view);
        } else {
            sAccessibilityPaneVisibilityManager.removeAccessibilityPane(view);
        }
    }

    @Deprecated
    public static void setActivated(View view, boolean z11) {
        view.setActivated(z11);
    }

    @Deprecated
    public static void setAlpha(View view, @FloatRange(from = 0.0d, to = 1.0d) float f11) {
        view.setAlpha(f11);
    }

    public static void setAutofillHints(@NonNull View view, @Nullable String... strArr) {
        if (Build.VERSION.SDK_INT >= 26) {
            Api26Impl.setAutofillHints(view, strArr);
        }
    }

    public static void setAutofillId(@NonNull View view, @Nullable AutofillIdCompat autofillIdCompat) {
        if (Build.VERSION.SDK_INT >= 28) {
            Api28Impl.setAutofillId(view, autofillIdCompat);
        }
    }

    @Deprecated
    public static void setBackground(@NonNull View view, @Nullable Drawable drawable) {
        view.setBackground(drawable);
    }

    public static void setBackgroundTintList(@NonNull View view, @Nullable ColorStateList colorStateList) {
        Api21Impl.setBackgroundTintList(view, colorStateList);
    }

    public static void setBackgroundTintMode(@NonNull View view, @Nullable PorterDuff.Mode mode) {
        Api21Impl.setBackgroundTintMode(view, mode);
    }

    @SuppressLint({"BanUncheckedReflection"})
    @Deprecated
    public static void setChildrenDrawingOrderEnabled(ViewGroup viewGroup, boolean z11) {
        if (sChildrenDrawingOrderMethod == null) {
            try {
                sChildrenDrawingOrderMethod = ViewGroup.class.getDeclaredMethod("setChildrenDrawingOrderEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException e11) {
                Log.e(TAG, "Unable to find childrenDrawingOrderEnabled", e11);
            }
            sChildrenDrawingOrderMethod.setAccessible(true);
        }
        try {
            sChildrenDrawingOrderMethod.invoke(viewGroup, Boolean.valueOf(z11));
        } catch (IllegalAccessException e12) {
            Log.e(TAG, "Unable to invoke childrenDrawingOrderEnabled", e12);
        } catch (IllegalArgumentException e13) {
            Log.e(TAG, "Unable to invoke childrenDrawingOrderEnabled", e13);
        } catch (InvocationTargetException e14) {
            Log.e(TAG, "Unable to invoke childrenDrawingOrderEnabled", e14);
        }
    }

    @Deprecated
    public static void setClipBounds(@NonNull View view, @Nullable Rect rect) {
        view.setClipBounds(rect);
    }

    public static void setContentCaptureSession(@NonNull View view, @Nullable ContentCaptureSessionCompat contentCaptureSessionCompat) {
        if (Build.VERSION.SDK_INT >= 29) {
            Api29Impl.setContentCaptureSession(view, contentCaptureSessionCompat);
        }
    }

    public static void setElevation(@NonNull View view, float f11) {
        Api21Impl.setElevation(view, f11);
    }

    @Deprecated
    public static void setFitsSystemWindows(View view, boolean z11) {
        view.setFitsSystemWindows(z11);
    }

    public static void setFocusedByDefault(@NonNull View view, boolean z11) {
        if (Build.VERSION.SDK_INT >= 26) {
            Api26Impl.setFocusedByDefault(view, z11);
        }
    }

    @Deprecated
    public static void setHasTransientState(@NonNull View view, boolean z11) {
        view.setHasTransientState(z11);
    }

    @UiThread
    @Deprecated
    public static void setImportantForAccessibility(@NonNull View view, int i11) {
        view.setImportantForAccessibility(i11);
    }

    private static void setImportantForAccessibilityIfNeeded(View view) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    public static void setImportantForAutofill(@NonNull View view, int i11) {
        if (Build.VERSION.SDK_INT >= 26) {
            Api26Impl.setImportantForAutofill(view, i11);
        }
    }

    public static void setImportantForContentCapture(@NonNull View view, int i11) {
        if (Build.VERSION.SDK_INT >= 30) {
            Api30Impl.setImportantForContentCapture(view, i11);
        }
    }

    public static void setKeyboardNavigationCluster(@NonNull View view, boolean z11) {
        if (Build.VERSION.SDK_INT >= 26) {
            Api26Impl.setKeyboardNavigationCluster(view, z11);
        }
    }

    @Deprecated
    public static void setLabelFor(@NonNull View view, @IdRes int i11) {
        view.setLabelFor(i11);
    }

    @Deprecated
    public static void setLayerPaint(@NonNull View view, @Nullable Paint paint) {
        view.setLayerPaint(paint);
    }

    @Deprecated
    public static void setLayerType(View view, int i11, Paint paint) {
        view.setLayerType(i11, paint);
    }

    @Deprecated
    public static void setLayoutDirection(@NonNull View view, int i11) {
        view.setLayoutDirection(i11);
    }

    public static void setNestedScrollingEnabled(@NonNull View view, boolean z11) {
        Api21Impl.setNestedScrollingEnabled(view, z11);
    }

    public static void setNextClusterForwardId(@NonNull View view, int i11) {
        if (Build.VERSION.SDK_INT >= 26) {
            Api26Impl.setNextClusterForwardId(view, i11);
        }
    }

    public static void setOnApplyWindowInsetsListener(@NonNull View view, @Nullable OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        Api21Impl.setOnApplyWindowInsetsListener(view, onApplyWindowInsetsListener);
    }

    public static void setOnReceiveContentListener(@NonNull View view, @Nullable String[] strArr, @Nullable OnReceiveContentListener onReceiveContentListener) {
        if (Build.VERSION.SDK_INT >= 31) {
            Api31Impl.setOnReceiveContentListener(view, strArr, onReceiveContentListener);
            return;
        }
        if (strArr == null || strArr.length == 0) {
            strArr = null;
        }
        boolean z11 = false;
        if (onReceiveContentListener != null) {
            Preconditions.checkArgument(strArr != null, "When the listener is set, MIME types must also be set");
        }
        if (strArr != null) {
            int length = strArr.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    break;
                }
                if (strArr[i11].startsWith("*")) {
                    z11 = true;
                    break;
                }
                i11++;
            }
            Preconditions.checkArgument(!z11, "A MIME type set here must not start with *: " + Arrays.toString(strArr));
        }
        view.setTag(R.id.tag_on_receive_content_mime_types, strArr);
        view.setTag(R.id.tag_on_receive_content_listener, onReceiveContentListener);
    }

    @Deprecated
    public static void setOverScrollMode(View view, int i11) {
        view.setOverScrollMode(i11);
    }

    @Deprecated
    public static void setPaddingRelative(@NonNull View view, @Px int i11, @Px int i12, @Px int i13, @Px int i14) {
        view.setPaddingRelative(i11, i12, i13, i14);
    }

    @Deprecated
    public static void setPivotX(View view, float f11) {
        view.setPivotX(f11);
    }

    @Deprecated
    public static void setPivotY(View view, float f11) {
        view.setPivotY(f11);
    }

    public static void setPointerIcon(@NonNull View view, @Nullable PointerIconCompat pointerIconCompat) {
        Api24Impl.setPointerIcon(view, (PointerIcon) (pointerIconCompat != null ? pointerIconCompat.getPointerIcon() : null));
    }

    @Deprecated
    public static void setRotation(View view, float f11) {
        view.setRotation(f11);
    }

    @Deprecated
    public static void setRotationX(View view, float f11) {
        view.setRotationX(f11);
    }

    @Deprecated
    public static void setRotationY(View view, float f11) {
        view.setRotationY(f11);
    }

    @Deprecated
    public static void setSaveFromParentEnabled(View view, boolean z11) {
        view.setSaveFromParentEnabled(z11);
    }

    @Deprecated
    public static void setScaleX(View view, float f11) {
        view.setScaleX(f11);
    }

    @Deprecated
    public static void setScaleY(View view, float f11) {
        view.setScaleY(f11);
    }

    @UiThread
    public static void setScreenReaderFocusable(@NonNull View view, boolean z11) {
        screenReaderFocusableProperty().set(view, Boolean.valueOf(z11));
    }

    public static void setScrollIndicators(@NonNull View view, int i11) {
        Api23Impl.setScrollIndicators(view, i11);
    }

    @UiThread
    public static void setStateDescription(@NonNull View view, @Nullable CharSequence charSequence) {
        stateDescriptionProperty().set(view, charSequence);
    }

    public static void setSystemGestureExclusionRects(@NonNull View view, @NonNull List<Rect> list) {
        if (Build.VERSION.SDK_INT >= 29) {
            Api29Impl.setSystemGestureExclusionRects(view, list);
        }
    }

    public static void setTooltipText(@NonNull View view, @Nullable CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            Api26Impl.setTooltipText(view, charSequence);
        }
    }

    public static void setTransitionName(@NonNull View view, @Nullable String str) {
        Api21Impl.setTransitionName(view, str);
    }

    @Deprecated
    public static void setTranslationX(View view, float f11) {
        view.setTranslationX(f11);
    }

    @Deprecated
    public static void setTranslationY(View view, float f11) {
        view.setTranslationY(f11);
    }

    public static void setTranslationZ(@NonNull View view, float f11) {
        Api21Impl.setTranslationZ(view, f11);
    }

    public static void setWindowInsetsAnimationCallback(@NonNull View view, @Nullable WindowInsetsAnimationCompat.Callback callback) {
        WindowInsetsAnimationCompat.setCallback(view, callback);
    }

    @Deprecated
    public static void setX(View view, float f11) {
        view.setX(f11);
    }

    @Deprecated
    public static void setY(View view, float f11) {
        view.setY(f11);
    }

    public static void setZ(@NonNull View view, float f11) {
        Api21Impl.setZ(view, f11);
    }

    public static boolean startDragAndDrop(@NonNull View view, @Nullable ClipData clipData, @NonNull View.DragShadowBuilder dragShadowBuilder, @Nullable Object obj, int i11) {
        return Api24Impl.startDragAndDrop(view, clipData, dragShadowBuilder, obj, i11);
    }

    public static boolean startNestedScroll(@NonNull View view, int i11) {
        return Api21Impl.startNestedScroll(view, i11);
    }

    private static AccessibilityViewProperty<CharSequence> stateDescriptionProperty() {
        return new AccessibilityViewProperty<CharSequence>(R.id.tag_state_description, CharSequence.class, 64, 30) { // from class: androidx.core.view.ViewCompat.3
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
            @RequiresApi(30)
            public CharSequence frameworkGet(View view) {
                return Api30Impl.getStateDescription(view);
            }

            @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
            @RequiresApi(30)
            public void frameworkSet(View view, CharSequence charSequence) {
                Api30Impl.setStateDescription(view, charSequence);
            }

            @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
            public boolean shouldUpdate(CharSequence charSequence, CharSequence charSequence2) {
                return !TextUtils.equals(charSequence, charSequence2);
            }
        };
    }

    public static void stopNestedScroll(@NonNull View view) {
        Api21Impl.stopNestedScroll(view);
    }

    private static void tickleInvalidationFlag(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    public static void updateDragShadow(@NonNull View view, @NonNull View.DragShadowBuilder dragShadowBuilder) {
        Api24Impl.updateDragShadow(view, dragShadowBuilder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean dispatchNestedPreScroll(@NonNull View view, int i11, int i12, @Nullable int[] iArr, @Nullable int[] iArr2, int i13) {
        if (view instanceof NestedScrollingChild2) {
            return ((NestedScrollingChild2) view).dispatchNestedPreScroll(i11, i12, iArr, iArr2, i13);
        }
        if (i13 == 0) {
            return dispatchNestedPreScroll(view, i11, i12, iArr, iArr2);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void dispatchNestedScroll(@NonNull View view, int i11, int i12, int i13, int i14, @Nullable int[] iArr, int i15, @NonNull int[] iArr2) {
        if (view instanceof NestedScrollingChild3) {
            ((NestedScrollingChild3) view).dispatchNestedScroll(i11, i12, i13, i14, iArr, i15, iArr2);
        } else {
            dispatchNestedScroll(view, i11, i12, i13, i14, iArr, i15);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean hasNestedScrollingParent(@NonNull View view, int i11) {
        if (view instanceof NestedScrollingChild2) {
            ((NestedScrollingChild2) view).hasNestedScrollingParent(i11);
            return false;
        }
        if (i11 == 0) {
            return hasNestedScrollingParent(view);
        }
        return false;
    }

    @Deprecated
    public static void postInvalidateOnAnimation(@NonNull View view, int i11, int i12, int i13, int i14) {
        view.postInvalidateOnAnimation(i11, i12, i13, i14);
    }

    public static void setScrollIndicators(@NonNull View view, int i11, int i12) {
        Api23Impl.setScrollIndicators(view, i11, i12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean startNestedScroll(@NonNull View view, int i11, int i12) {
        if (view instanceof NestedScrollingChild2) {
            return ((NestedScrollingChild2) view).startNestedScroll(i11, i12);
        }
        if (i12 == 0) {
            return startNestedScroll(view, i11);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void stopNestedScroll(@NonNull View view, int i11) {
        if (view instanceof NestedScrollingChild2) {
            ((NestedScrollingChild2) view).stopNestedScroll(i11);
        } else if (i11 == 0) {
            stopNestedScroll(view);
        }
    }

    public static boolean performHapticFeedback(@NonNull View view, int i11, int i12) {
        int feedbackConstantOrFallback = HapticFeedbackConstantsCompat.getFeedbackConstantOrFallback(i11);
        if (feedbackConstantOrFallback == -1) {
            return false;
        }
        return view.performHapticFeedback(feedbackConstantOrFallback, i12);
    }

    private static void addAccessibilityAction(@NonNull View view, @NonNull AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat) {
        ensureAccessibilityDelegateCompat(view);
        removeActionWithId(accessibilityActionCompat.getId(), view);
        getActionList(view).add(accessibilityActionCompat);
        notifyViewAccessibilityStateChangedIfNeeded(view, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean dispatchNestedScroll(@NonNull View view, int i11, int i12, int i13, int i14, @Nullable int[] iArr, int i15) {
        if (view instanceof NestedScrollingChild2) {
            return ((NestedScrollingChild2) view).dispatchNestedScroll(i11, i12, i13, i14, iArr, i15);
        }
        if (i15 == 0) {
            return dispatchNestedScroll(view, i11, i12, i13, i14, iArr);
        }
        return false;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AccessibilityPaneVisibilityManager implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {
        private final WeakHashMap<View, Boolean> mPanesToVisible = new WeakHashMap<>();

        private void checkPaneVisibility(Map.Entry<View, Boolean> entry) {
            View key = entry.getKey();
            boolean booleanValue = entry.getValue().booleanValue();
            boolean z11 = key.isShown() && key.getWindowVisibility() == 0;
            if (booleanValue != z11) {
                ViewCompat.notifyViewAccessibilityStateChangedIfNeeded(key, z11 ? 16 : 32);
                entry.setValue(Boolean.valueOf(z11));
            }
        }

        private void registerForLayoutCallback(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        private void unregisterForLayoutCallback(View view) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }

        public void addAccessibilityPane(View view) {
            this.mPanesToVisible.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(this);
            if (view.isAttachedToWindow()) {
                registerForLayoutCallback(view);
            }
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                Iterator<Map.Entry<View, Boolean>> it = this.mPanesToVisible.entrySet().iterator();
                while (it.hasNext()) {
                    checkPaneVisibility(it.next());
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            registerForLayoutCallback(view);
        }

        public void removeAccessibilityPane(View view) {
            this.mPanesToVisible.remove(view);
            view.removeOnAttachStateChangeListener(this);
            unregisterForLayoutCallback(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    public static /* synthetic */ ContentInfoCompat a(ContentInfoCompat contentInfoCompat) {
        return contentInfoCompat;
    }
}

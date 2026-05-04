package com.google.android.material.badge;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.R;
import com.google.android.material.badge.BadgeState;
import com.google.android.material.internal.ParcelableSparseArray;
import com.google.android.material.internal.e0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@xm.b
/* loaded from: classes7.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f30581a = false;

    /* renamed from: b, reason: collision with root package name */
    public static final String f30582b = "BadgeUtils";

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Toolbar f30583a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f30584b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.google.android.material.badge.a f30585c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ FrameLayout f30586d;

        public a(Toolbar toolbar, int i11, com.google.android.material.badge.a aVar, FrameLayout frameLayout) {
            this.f30583a = toolbar;
            this.f30584b = i11;
            this.f30585c = aVar;
            this.f30586d = frameLayout;
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionMenuItemView a11 = e0.a(this.f30583a, this.f30584b);
            if (a11 != null) {
                b.n(this.f30585c, this.f30583a.getResources());
                b.d(this.f30585c, a11, this.f30586d);
                b.b(this.f30585c, a11);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.google.android.material.badge.b$b, reason: collision with other inner class name */
    public class C0365b extends AccessibilityDelegateCompat {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.google.android.material.badge.a f30587a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0365b(View.AccessibilityDelegate accessibilityDelegate, com.google.android.material.badge.a aVar) {
            super(accessibilityDelegate);
            this.f30587a = aVar;
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.setContentDescription(this.f30587a.r());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c extends AccessibilityDelegateCompat {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.google.android.material.badge.a f30588a;

        public c(com.google.android.material.badge.a aVar) {
            this.f30588a = aVar;
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.setContentDescription(this.f30588a.r());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d extends AccessibilityDelegateCompat {
        public d(View.AccessibilityDelegate accessibilityDelegate) {
            super(accessibilityDelegate);
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.setContentDescription(null);
        }
    }

    public static void b(@NonNull com.google.android.material.badge.a aVar, @NonNull View view) {
        View.AccessibilityDelegate accessibilityDelegate;
        if (Build.VERSION.SDK_INT < 29 || !ViewCompat.hasAccessibilityDelegate(view)) {
            ViewCompat.setAccessibilityDelegate(view, new c(aVar));
        } else {
            accessibilityDelegate = view.getAccessibilityDelegate();
            ViewCompat.setAccessibilityDelegate(view, new C0365b(accessibilityDelegate, aVar));
        }
    }

    public static void c(@NonNull com.google.android.material.badge.a aVar, @NonNull View view) {
        d(aVar, view, null);
    }

    public static void d(@NonNull com.google.android.material.badge.a aVar, @NonNull View view, @Nullable FrameLayout frameLayout) {
        m(aVar, view, frameLayout);
        if (aVar.s() != null) {
            aVar.s().setForeground(aVar);
        } else {
            if (f30581a) {
                throw new IllegalArgumentException("Trying to reference null customBadgeParent");
            }
            view.getOverlay().add(aVar);
        }
    }

    public static void e(@NonNull com.google.android.material.badge.a aVar, @NonNull Toolbar toolbar, @IdRes int i11) {
        f(aVar, toolbar, i11, null);
    }

    public static void f(@NonNull com.google.android.material.badge.a aVar, @NonNull Toolbar toolbar, @IdRes int i11, @Nullable FrameLayout frameLayout) {
        toolbar.post(new a(toolbar, i11, aVar, frameLayout));
    }

    @NonNull
    public static SparseArray<com.google.android.material.badge.a> g(Context context, @NonNull ParcelableSparseArray parcelableSparseArray) {
        SparseArray<com.google.android.material.badge.a> sparseArray = new SparseArray<>(parcelableSparseArray.size());
        for (int i11 = 0; i11 < parcelableSparseArray.size(); i11++) {
            int keyAt = parcelableSparseArray.keyAt(i11);
            BadgeState.State state = (BadgeState.State) parcelableSparseArray.valueAt(i11);
            sparseArray.put(keyAt, state != null ? com.google.android.material.badge.a.h(context, state) : null);
        }
        return sparseArray;
    }

    @NonNull
    public static ParcelableSparseArray h(@NonNull SparseArray<com.google.android.material.badge.a> sparseArray) {
        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
        for (int i11 = 0; i11 < sparseArray.size(); i11++) {
            int keyAt = sparseArray.keyAt(i11);
            com.google.android.material.badge.a valueAt = sparseArray.valueAt(i11);
            parcelableSparseArray.put(keyAt, valueAt != null ? valueAt.G() : null);
        }
        return parcelableSparseArray;
    }

    public static void i(@NonNull View view) {
        View.AccessibilityDelegate accessibilityDelegate;
        if (Build.VERSION.SDK_INT < 29 || !ViewCompat.hasAccessibilityDelegate(view)) {
            ViewCompat.setAccessibilityDelegate(view, null);
        } else {
            accessibilityDelegate = view.getAccessibilityDelegate();
            ViewCompat.setAccessibilityDelegate(view, new d(accessibilityDelegate));
        }
    }

    public static void j(@Nullable com.google.android.material.badge.a aVar, @NonNull View view) {
        if (aVar == null) {
            return;
        }
        if (f30581a || aVar.s() != null) {
            aVar.s().setForeground(null);
        } else {
            view.getOverlay().remove(aVar);
        }
    }

    public static void k(@Nullable com.google.android.material.badge.a aVar, @NonNull Toolbar toolbar, @IdRes int i11) {
        if (aVar == null) {
            return;
        }
        ActionMenuItemView a11 = e0.a(toolbar, i11);
        if (a11 != null) {
            l(aVar);
            j(aVar, a11);
            i(a11);
        } else {
            Log.w(f30582b, "Trying to remove badge from a null menuItemView: " + i11);
        }
    }

    @VisibleForTesting
    public static void l(com.google.android.material.badge.a aVar) {
        aVar.h0(0);
        aVar.i0(0);
    }

    public static void m(@NonNull com.google.android.material.badge.a aVar, @NonNull View view, @Nullable FrameLayout frameLayout) {
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        aVar.setBounds(rect);
        aVar.P0(view, frameLayout);
    }

    @VisibleForTesting
    public static void n(com.google.android.material.badge.a aVar, Resources resources) {
        aVar.h0(resources.getDimensionPixelOffset(R.dimen.mtrl_badge_toolbar_action_menu_item_horizontal_offset));
        aVar.i0(resources.getDimensionPixelOffset(R.dimen.mtrl_badge_toolbar_action_menu_item_vertical_offset));
    }

    public static void o(@NonNull Rect rect, float f11, float f12, float f13, float f14) {
        rect.set((int) (f11 - f13), (int) (f12 - f14), (int) (f11 + f13), (int) (f12 + f14));
    }
}

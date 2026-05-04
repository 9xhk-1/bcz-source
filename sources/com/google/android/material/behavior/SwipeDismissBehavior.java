package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.customview.widget.ViewDragHelper;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* renamed from: l, reason: collision with root package name */
    public static final int f30606l = 0;

    /* renamed from: m, reason: collision with root package name */
    public static final int f30607m = 1;

    /* renamed from: n, reason: collision with root package name */
    public static final int f30608n = 2;

    /* renamed from: o, reason: collision with root package name */
    public static final int f30609o = 0;

    /* renamed from: p, reason: collision with root package name */
    public static final int f30610p = 1;

    /* renamed from: q, reason: collision with root package name */
    public static final int f30611q = 2;

    /* renamed from: r, reason: collision with root package name */
    public static final float f30612r = 0.5f;

    /* renamed from: s, reason: collision with root package name */
    public static final float f30613s = 0.0f;

    /* renamed from: t, reason: collision with root package name */
    public static final float f30614t = 0.5f;

    /* renamed from: a, reason: collision with root package name */
    public ViewDragHelper f30615a;

    /* renamed from: b, reason: collision with root package name */
    public c f30616b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f30617c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f30618d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f30620f;

    /* renamed from: e, reason: collision with root package name */
    public float f30619e = 0.0f;

    /* renamed from: g, reason: collision with root package name */
    public int f30621g = 2;

    /* renamed from: h, reason: collision with root package name */
    public float f30622h = 0.5f;

    /* renamed from: i, reason: collision with root package name */
    public float f30623i = 0.0f;

    /* renamed from: j, reason: collision with root package name */
    public float f30624j = 0.5f;

    /* renamed from: k, reason: collision with root package name */
    public final ViewDragHelper.Callback f30625k = new a();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends ViewDragHelper.Callback {

        /* renamed from: d, reason: collision with root package name */
        public static final int f30626d = -1;

        /* renamed from: a, reason: collision with root package name */
        public int f30627a;

        /* renamed from: b, reason: collision with root package name */
        public int f30628b = -1;

        public a() {
        }

        public final boolean a(@NonNull View view, float f11) {
            if (f11 == 0.0f) {
                return Math.abs(view.getLeft() - this.f30627a) >= Math.round(((float) view.getWidth()) * SwipeDismissBehavior.this.f30622h);
            }
            boolean z11 = ViewCompat.getLayoutDirection(view) == 1;
            int i11 = SwipeDismissBehavior.this.f30621g;
            if (i11 == 2) {
                return true;
            }
            if (i11 == 0) {
                return z11 ? f11 < 0.0f : f11 > 0.0f;
            }
            if (i11 == 1) {
                if (z11) {
                    return f11 > 0.0f;
                }
                if (f11 < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int clampViewPositionHorizontal(@NonNull View view, int i11, int i12) {
            int width;
            int width2;
            int width3;
            boolean z11 = ViewCompat.getLayoutDirection(view) == 1;
            int i13 = SwipeDismissBehavior.this.f30621g;
            if (i13 == 0) {
                if (z11) {
                    width = this.f30627a - view.getWidth();
                    width2 = this.f30627a;
                } else {
                    width = this.f30627a;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                }
            } else if (i13 != 1) {
                width = this.f30627a - view.getWidth();
                width2 = view.getWidth() + this.f30627a;
            } else if (z11) {
                width = this.f30627a;
                width3 = view.getWidth();
                width2 = width3 + width;
            } else {
                width = this.f30627a - view.getWidth();
                width2 = this.f30627a;
            }
            return SwipeDismissBehavior.k(width, i11, width2);
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int clampViewPositionVertical(@NonNull View view, int i11, int i12) {
            return view.getTop();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int getViewHorizontalDragRange(@NonNull View view) {
            return view.getWidth();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewCaptured(@NonNull View view, int i11) {
            this.f30628b = i11;
            this.f30627a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                SwipeDismissBehavior.this.f30618d = true;
                parent.requestDisallowInterceptTouchEvent(true);
                SwipeDismissBehavior.this.f30618d = false;
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewDragStateChanged(int i11) {
            c cVar = SwipeDismissBehavior.this.f30616b;
            if (cVar != null) {
                cVar.a(i11);
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewPositionChanged(@NonNull View view, int i11, int i12, int i13, int i14) {
            float width = view.getWidth() * SwipeDismissBehavior.this.f30623i;
            float width2 = view.getWidth() * SwipeDismissBehavior.this.f30624j;
            float abs = Math.abs(i11 - this.f30627a);
            if (abs <= width) {
                view.setAlpha(1.0f);
            } else if (abs >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.j(0.0f, 1.0f - SwipeDismissBehavior.m(width, width2, abs), 1.0f));
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewReleased(@NonNull View view, float f11, float f12) {
            int i11;
            boolean z11;
            c cVar;
            this.f30628b = -1;
            int width = view.getWidth();
            if (a(view, f11)) {
                if (f11 >= 0.0f) {
                    int left = view.getLeft();
                    int i12 = this.f30627a;
                    if (left >= i12) {
                        i11 = i12 + width;
                        z11 = true;
                    }
                }
                i11 = this.f30627a - width;
                z11 = true;
            } else {
                i11 = this.f30627a;
                z11 = false;
            }
            if (SwipeDismissBehavior.this.f30615a.settleCapturedViewAt(i11, view.getTop())) {
                ViewCompat.postOnAnimation(view, new d(view, z11));
            } else {
                if (!z11 || (cVar = SwipeDismissBehavior.this.f30616b) == null) {
                    return;
                }
                cVar.b(view);
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public boolean tryCaptureView(View view, int i11) {
            int i12 = this.f30628b;
            return (i12 == -1 || i12 == i11) && SwipeDismissBehavior.this.i(view);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements AccessibilityViewCommand {
        public b() {
        }

        @Override // androidx.core.view.accessibility.AccessibilityViewCommand
        public boolean perform(@NonNull View view, @Nullable AccessibilityViewCommand.CommandArguments commandArguments) {
            if (!SwipeDismissBehavior.this.i(view)) {
                return false;
            }
            boolean z11 = ViewCompat.getLayoutDirection(view) == 1;
            int i11 = SwipeDismissBehavior.this.f30621g;
            ViewCompat.offsetLeftAndRight(view, (!(i11 == 0 && z11) && (i11 != 1 || z11)) ? view.getWidth() : -view.getWidth());
            view.setAlpha(0.0f);
            c cVar = SwipeDismissBehavior.this.f30616b;
            if (cVar != null) {
                cVar.b(view);
            }
            return true;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface c {
        void a(int i11);

        void b(View view);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final View f30631a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f30632b;

        public d(View view, boolean z11) {
            this.f30631a = view;
            this.f30632b = z11;
        }

        @Override // java.lang.Runnable
        public void run() {
            c cVar;
            ViewDragHelper viewDragHelper = SwipeDismissBehavior.this.f30615a;
            if (viewDragHelper != null && viewDragHelper.continueSettling(true)) {
                ViewCompat.postOnAnimation(this.f30631a, this);
            } else {
                if (!this.f30632b || (cVar = SwipeDismissBehavior.this.f30616b) == null) {
                    return;
                }
                cVar.b(this.f30631a);
            }
        }
    }

    public static float j(float f11, float f12, float f13) {
        return Math.min(Math.max(f11, f12), f13);
    }

    public static int k(int i11, int i12, int i13) {
        return Math.min(Math.max(i11, i12), i13);
    }

    public static float m(float f11, float f12, float f13) {
        return (f13 - f11) / (f12 - f11);
    }

    public boolean i(@NonNull View view) {
        return true;
    }

    public final void l(ViewGroup viewGroup) {
        if (this.f30615a == null) {
            this.f30615a = this.f30620f ? ViewDragHelper.create(viewGroup, this.f30619e, this.f30625k) : ViewDragHelper.create(viewGroup, this.f30625k);
        }
    }

    public int n() {
        ViewDragHelper viewDragHelper = this.f30615a;
        if (viewDragHelper != null) {
            return viewDragHelper.getViewDragState();
        }
        return 0;
    }

    @Nullable
    @VisibleForTesting
    public c o() {
        return this.f30616b;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onInterceptTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull MotionEvent motionEvent) {
        boolean z11 = this.f30617c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z11 = coordinatorLayout.isPointInChildBounds(v11, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f30617c = z11;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f30617c = false;
        }
        if (z11) {
            l(coordinatorLayout);
            if (!this.f30618d && this.f30615a.shouldInterceptTouchEvent(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, int i11) {
        boolean onLayoutChild = super.onLayoutChild(coordinatorLayout, v11, i11);
        if (ViewCompat.getImportantForAccessibility(v11) == 0) {
            ViewCompat.setImportantForAccessibility(v11, 1);
            v(v11);
        }
        return onLayoutChild;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v11, MotionEvent motionEvent) {
        if (this.f30615a == null) {
            return false;
        }
        if (this.f30618d && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f30615a.processTouchEvent(motionEvent);
        return true;
    }

    public void p(float f11) {
        this.f30622h = j(0.0f, f11, 1.0f);
    }

    public void q(float f11) {
        this.f30624j = j(0.0f, f11, 1.0f);
    }

    public void r(@Nullable c cVar) {
        this.f30616b = cVar;
    }

    public void s(float f11) {
        this.f30619e = f11;
        this.f30620f = true;
    }

    public void t(float f11) {
        this.f30623i = j(0.0f, f11, 1.0f);
    }

    public void u(int i11) {
        this.f30621g = i11;
    }

    public final void v(View view) {
        ViewCompat.removeAccessibilityAction(view, 1048576);
        if (i(view)) {
            ViewCompat.replaceAccessibilityAction(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_DISMISS, null, new b());
        }
    }
}

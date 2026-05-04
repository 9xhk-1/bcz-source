package com.google.android.material.bottomsheet;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import com.google.android.material.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDragHandleView;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class BottomSheetDragHandleView extends AppCompatImageView implements AccessibilityManager.AccessibilityStateChangeListener {

    /* renamed from: j, reason: collision with root package name */
    public static final int f30767j = R.style.Widget_Material3_BottomSheet_DragHandle;

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    public final AccessibilityManager f30768a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    public BottomSheetBehavior<?> f30769b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f30770c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f30771d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f30772e;

    /* renamed from: f, reason: collision with root package name */
    public final String f30773f;

    /* renamed from: g, reason: collision with root package name */
    public final String f30774g;

    /* renamed from: h, reason: collision with root package name */
    public final String f30775h;

    /* renamed from: i, reason: collision with root package name */
    public final BottomSheetBehavior.g f30776i;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends AccessibilityDelegateCompat {
        public b() {
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onPopulateAccessibilityEvent(View view, @NonNull AccessibilityEvent accessibilityEvent) {
            super.onPopulateAccessibilityEvent(view, accessibilityEvent);
            if (accessibilityEvent.getEventType() == 1) {
                BottomSheetDragHandleView.this.e();
            }
        }
    }

    public BottomSheetDragHandleView(@NonNull Context context) {
        this(context, null);
    }

    @Nullable
    public static View g(View view) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }

    private void setBottomSheetBehavior(@Nullable BottomSheetBehavior<?> bottomSheetBehavior) {
        BottomSheetBehavior<?> bottomSheetBehavior2 = this.f30769b;
        if (bottomSheetBehavior2 != null) {
            bottomSheetBehavior2.s0(this.f30776i);
            this.f30769b.x0(null);
        }
        this.f30769b = bottomSheetBehavior;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.x0(this);
            h(this.f30769b.getState());
            this.f30769b.B(this.f30776i);
        }
        i();
    }

    public final void d(String str) {
        if (this.f30768a == null) {
            return;
        }
        AccessibilityEvent obtain = AccessibilityEvent.obtain(16384);
        obtain.getText().add(str);
        this.f30768a.sendAccessibilityEvent(obtain);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
    
        if (r1 != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e() {
        /*
            r6 = this;
            boolean r0 = r6.f30771d
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.String r0 = r6.f30775h
            r6.d(r0)
            com.google.android.material.bottomsheet.BottomSheetBehavior<?> r0 = r6.f30769b
            boolean r0 = r0.l0()
            r2 = 1
            if (r0 != 0) goto L1d
            com.google.android.material.bottomsheet.BottomSheetBehavior<?> r0 = r6.f30769b
            boolean r0 = r0.V0()
            if (r0 != 0) goto L1d
            r1 = r2
        L1d:
            com.google.android.material.bottomsheet.BottomSheetBehavior<?> r0 = r6.f30769b
            int r0 = r0.getState()
            r3 = 6
            r4 = 3
            r5 = 4
            if (r0 != r5) goto L2b
            if (r1 == 0) goto L38
            goto L39
        L2b:
            if (r0 != r4) goto L32
            if (r1 == 0) goto L30
            goto L39
        L30:
            r3 = r5
            goto L39
        L32:
            boolean r0 = r6.f30772e
            if (r0 == 0) goto L37
            goto L38
        L37:
            r4 = r5
        L38:
            r3 = r4
        L39:
            com.google.android.material.bottomsheet.BottomSheetBehavior<?> r0 = r6.f30769b
            r0.g(r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetDragHandleView.e():boolean");
    }

    @Nullable
    public final BottomSheetBehavior<?> f() {
        View view = this;
        while (true) {
            view = g(view);
            if (view == null) {
                return null;
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.LayoutParams) {
                CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior();
                if (behavior instanceof BottomSheetBehavior) {
                    return (BottomSheetBehavior) behavior;
                }
            }
        }
    }

    public final void h(int i11) {
        if (i11 == 4) {
            this.f30772e = true;
        } else if (i11 == 3) {
            this.f30772e = false;
        }
        ViewCompat.replaceAccessibilityAction(this, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLICK, this.f30772e ? this.f30773f : this.f30774g, new AccessibilityViewCommand() { // from class: zm.c
            @Override // androidx.core.view.accessibility.AccessibilityViewCommand
            public final boolean perform(View view, AccessibilityViewCommand.CommandArguments commandArguments) {
                boolean e11;
                e11 = BottomSheetDragHandleView.this.e();
                return e11;
            }
        });
    }

    public final void i() {
        this.f30771d = this.f30770c && this.f30769b != null;
        ViewCompat.setImportantForAccessibility(this, this.f30769b == null ? 2 : 1);
        setClickable(this.f30771d);
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public void onAccessibilityStateChanged(boolean z11) {
        this.f30770c = z11;
        i();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setBottomSheetBehavior(f());
        AccessibilityManager accessibilityManager = this.f30768a;
        if (accessibilityManager != null) {
            accessibilityManager.addAccessibilityStateChangeListener(this);
            onAccessibilityStateChanged(this.f30768a.isEnabled());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        AccessibilityManager accessibilityManager = this.f30768a;
        if (accessibilityManager != null) {
            accessibilityManager.removeAccessibilityStateChangeListener(this);
        }
        setBottomSheetBehavior(null);
        super.onDetachedFromWindow();
    }

    public BottomSheetDragHandleView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.bottomSheetDragHandleStyle);
    }

    public BottomSheetDragHandleView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(zn.a.c(context, attributeSet, i11, f30767j), attributeSet, i11);
        this.f30773f = getResources().getString(R.string.bottomsheet_action_expand);
        this.f30774g = getResources().getString(R.string.bottomsheet_action_collapse);
        this.f30775h = getResources().getString(R.string.bottomsheet_drag_handle_clicked);
        this.f30776i = new a();
        this.f30768a = (AccessibilityManager) getContext().getSystemService("accessibility");
        i();
        ViewCompat.setAccessibilityDelegate(this, new b());
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends BottomSheetBehavior.g {
        public a() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void c(@NonNull View view, int i11) {
            BottomSheetDragHandleView.this.h(i11);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void b(@NonNull View view, float f11) {
        }
    }
}

package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.content.ContextCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import com.google.android.material.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes7.dex */
public class m0 {

    /* renamed from: a, reason: collision with root package name */
    @RequiresApi(16)
    public static final int f31611a = 768;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f31612a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f31613b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f31614c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ d f31615d;

        public a(boolean z11, boolean z12, boolean z13, d dVar) {
            this.f31612a = z11;
            this.f31613b = z12;
            this.f31614c = z13;
            this.f31615d = dVar;
        }

        @Override // com.google.android.material.internal.m0.d
        @NonNull
        public WindowInsetsCompat a(View view, @NonNull WindowInsetsCompat windowInsetsCompat, @NonNull e eVar) {
            if (this.f31612a) {
                eVar.f31621d += windowInsetsCompat.getSystemWindowInsetBottom();
            }
            boolean s11 = m0.s(view);
            if (this.f31613b) {
                if (s11) {
                    eVar.f31620c += windowInsetsCompat.getSystemWindowInsetLeft();
                } else {
                    eVar.f31618a += windowInsetsCompat.getSystemWindowInsetLeft();
                }
            }
            if (this.f31614c) {
                if (s11) {
                    eVar.f31618a += windowInsetsCompat.getSystemWindowInsetRight();
                } else {
                    eVar.f31620c += windowInsetsCompat.getSystemWindowInsetRight();
                }
            }
            eVar.a(view);
            d dVar = this.f31615d;
            return dVar != null ? dVar.a(view, windowInsetsCompat, eVar) : windowInsetsCompat;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements OnApplyWindowInsetsListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d f31616a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e f31617b;

        public b(d dVar, e eVar) {
            this.f31616a = dVar;
            this.f31617b = eVar;
        }

        @Override // androidx.core.view.OnApplyWindowInsetsListener
        public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
            return this.f31616a.a(view, windowInsetsCompat, new e(this.f31617b));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface d {
        WindowInsetsCompat a(View view, WindowInsetsCompat windowInsetsCompat, e eVar);
    }

    public static void A(@NonNull View view) {
        B(view, true);
    }

    public static void B(@NonNull View view, boolean z11) {
        WindowInsetsControllerCompat windowInsetsController;
        if (!z11 || (windowInsetsController = ViewCompat.getWindowInsetsController(view)) == null) {
            n(view).showSoftInput(view, 1);
        } else {
            windowInsetsController.show(WindowInsetsCompat.Type.ime());
        }
    }

    public static void b(@Nullable View view, @NonNull ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (view != null) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    @NonNull
    public static Rect c(@NonNull View view, @NonNull View view2) {
        int[] iArr = new int[2];
        view2.getLocationOnScreen(iArr);
        int i11 = iArr[0];
        int i12 = iArr[1];
        int[] iArr2 = new int[2];
        view.getLocationOnScreen(iArr2);
        int i13 = i11 - iArr2[0];
        int i14 = i12 - iArr2[1];
        return new Rect(i13, i14, view2.getWidth() + i13, view2.getHeight() + i14);
    }

    @NonNull
    public static Rect d(@NonNull View view) {
        return e(view, 0);
    }

    @NonNull
    public static Rect e(@NonNull View view, int i11) {
        return new Rect(view.getLeft(), view.getTop() + i11, view.getRight(), view.getBottom() + i11);
    }

    public static void f(@NonNull View view, @Nullable AttributeSet attributeSet, int i11, int i12) {
        g(view, attributeSet, i11, i12, null);
    }

    public static void g(@NonNull View view, @Nullable AttributeSet attributeSet, int i11, int i12, @Nullable d dVar) {
        TypedArray obtainStyledAttributes = view.getContext().obtainStyledAttributes(attributeSet, R.styleable.Insets, i11, i12);
        boolean z11 = obtainStyledAttributes.getBoolean(R.styleable.Insets_paddingBottomSystemWindowInsets, false);
        boolean z12 = obtainStyledAttributes.getBoolean(R.styleable.Insets_paddingLeftSystemWindowInsets, false);
        boolean z13 = obtainStyledAttributes.getBoolean(R.styleable.Insets_paddingRightSystemWindowInsets, false);
        obtainStyledAttributes.recycle();
        h(view, new a(z11, z12, z13, dVar));
    }

    public static void h(@NonNull View view, @NonNull d dVar) {
        ViewCompat.setOnApplyWindowInsetsListener(view, new b(dVar, new e(ViewCompat.getPaddingStart(view), view.getPaddingTop(), ViewCompat.getPaddingEnd(view), view.getPaddingBottom())));
        w(view);
    }

    public static float i(@NonNull Context context, @Dimension(unit = 0) int i11) {
        return TypedValue.applyDimension(1, i11, context.getResources().getDisplayMetrics());
    }

    @Nullable
    public static Integer j(@NonNull View view) {
        ColorStateList g11 = kn.d.g(view.getBackground());
        if (g11 != null) {
            return Integer.valueOf(g11.getDefaultColor());
        }
        return null;
    }

    @NonNull
    public static List<View> k(@Nullable View view) {
        ArrayList arrayList = new ArrayList();
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                arrayList.add(viewGroup.getChildAt(i11));
            }
        }
        return arrayList;
    }

    @Nullable
    public static ViewGroup l(@Nullable View view) {
        if (view == null) {
            return null;
        }
        View rootView = view.getRootView();
        ViewGroup viewGroup = (ViewGroup) rootView.findViewById(android.R.id.content);
        if (viewGroup != null) {
            return viewGroup;
        }
        if (rootView == view || !(rootView instanceof ViewGroup)) {
            return null;
        }
        return (ViewGroup) rootView;
    }

    @Nullable
    public static k0 m(@NonNull View view) {
        return o(l(view));
    }

    @Nullable
    public static InputMethodManager n(@NonNull View view) {
        return (InputMethodManager) ContextCompat.getSystemService(view.getContext(), InputMethodManager.class);
    }

    @Nullable
    public static k0 o(@Nullable View view) {
        if (view == null) {
            return null;
        }
        return new j0(view);
    }

    public static float p(@NonNull View view) {
        float f11 = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            f11 += ViewCompat.getElevation((View) parent);
        }
        return f11;
    }

    public static void q(@NonNull View view) {
        r(view, true);
    }

    public static void r(@NonNull View view, boolean z11) {
        WindowInsetsControllerCompat windowInsetsController;
        if (z11 && (windowInsetsController = ViewCompat.getWindowInsetsController(view)) != null) {
            windowInsetsController.hide(WindowInsetsCompat.Type.ime());
            return;
        }
        InputMethodManager n11 = n(view);
        if (n11 != null) {
            n11.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public static boolean s(View view) {
        return ViewCompat.getLayoutDirection(view) == 1;
    }

    public static PorterDuff.Mode t(int i11, PorterDuff.Mode mode) {
        if (i11 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i11 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i11 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i11) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static void u(@Nullable View view, @NonNull ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (view != null) {
            v(view.getViewTreeObserver(), onGlobalLayoutListener);
        }
    }

    public static void v(@NonNull ViewTreeObserver viewTreeObserver, @NonNull ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
    }

    public static void w(@NonNull View view) {
        if (ViewCompat.isAttachedToWindow(view)) {
            ViewCompat.requestApplyInsets(view);
        } else {
            view.addOnAttachStateChangeListener(new c());
        }
    }

    public static void x(@NonNull View view) {
        y(view, true);
    }

    public static void y(@NonNull final View view, final boolean z11) {
        view.requestFocus();
        view.post(new Runnable() { // from class: com.google.android.material.internal.l0
            @Override // java.lang.Runnable
            public final void run() {
                m0.B(view, z11);
            }
        });
    }

    public static void z(@NonNull View view, @NonNull Rect rect) {
        view.setLeft(rect.left);
        view.setTop(rect.top);
        view.setRight(rect.right);
        view.setBottom(rect.bottom);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public int f31618a;

        /* renamed from: b, reason: collision with root package name */
        public int f31619b;

        /* renamed from: c, reason: collision with root package name */
        public int f31620c;

        /* renamed from: d, reason: collision with root package name */
        public int f31621d;

        public e(int i11, int i12, int i13, int i14) {
            this.f31618a = i11;
            this.f31619b = i12;
            this.f31620c = i13;
            this.f31621d = i14;
        }

        public void a(View view) {
            ViewCompat.setPaddingRelative(view, this.f31618a, this.f31619b, this.f31620c, this.f31621d);
        }

        public e(@NonNull e eVar) {
            this.f31618a = eVar.f31618a;
            this.f31619b = eVar.f31619b;
            this.f31620c = eVar.f31620c;
            this.f31621d = eVar.f31621d;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements View.OnAttachStateChangeListener {
        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(@NonNull View view) {
            view.removeOnAttachStateChangeListener(this);
            ViewCompat.requestApplyInsets(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }
}

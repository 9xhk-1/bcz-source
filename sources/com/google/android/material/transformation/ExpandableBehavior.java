package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import java.util.List;
import mn.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Deprecated
/* loaded from: classes7.dex */
public abstract class ExpandableBehavior extends CoordinatorLayout.Behavior<View> {

    /* renamed from: b, reason: collision with root package name */
    public static final int f32688b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static final int f32689c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f32690d = 2;

    /* renamed from: a, reason: collision with root package name */
    public int f32691a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f32692a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f32693b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b f32694c;

        public a(View view, int i11, b bVar) {
            this.f32692a = view;
            this.f32693b = i11;
            this.f32694c = bVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            this.f32692a.getViewTreeObserver().removeOnPreDrawListener(this);
            if (ExpandableBehavior.this.f32691a == this.f32693b) {
                ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                b bVar = this.f32694c;
                expandableBehavior.l((View) bVar, this.f32692a, bVar.b(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
        this.f32691a = 0;
    }

    @Nullable
    public static <T extends ExpandableBehavior> T k(@NonNull View view, @NonNull Class<T> cls) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.LayoutParams)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior();
        if (behavior instanceof ExpandableBehavior) {
            return cls.cast(behavior);
        }
        throw new IllegalArgumentException("The view is not associated with ExpandableBehavior");
    }

    public final boolean i(boolean z11) {
        if (!z11) {
            return this.f32691a == 1;
        }
        int i11 = this.f32691a;
        return i11 == 0 || i11 == 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public b j(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view) {
        List<View> dependencies = coordinatorLayout.getDependencies(view);
        int size = dependencies.size();
        for (int i11 = 0; i11 < size; i11++) {
            View view2 = dependencies.get(i11);
            if (layoutDependsOn(coordinatorLayout, view, view2)) {
                return (b) view2;
            }
        }
        return null;
    }

    public abstract boolean l(View view, View view2, boolean z11, boolean z12);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public abstract boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    @CallSuper
    public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
        b bVar = (b) view2;
        if (!i(bVar.b())) {
            return false;
        }
        this.f32691a = bVar.b() ? 1 : 2;
        return l((View) bVar, view, bVar.b(), true);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    @CallSuper
    public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i11) {
        b j11;
        if (ViewCompat.isLaidOut(view) || (j11 = j(coordinatorLayout, view)) == null || !i(j11.b())) {
            return false;
        }
        int i12 = j11.b() ? 1 : 2;
        this.f32691a = i12;
        view.getViewTreeObserver().addOnPreDrawListener(new a(view, i12, j11));
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32691a = 0;
    }
}

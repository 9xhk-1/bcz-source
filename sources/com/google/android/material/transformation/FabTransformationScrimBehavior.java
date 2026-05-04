package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;
import vm.c;
import vm.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Deprecated
/* loaded from: classes7.dex */
public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {

    /* renamed from: h, reason: collision with root package name */
    public static final long f32717h = 75;

    /* renamed from: i, reason: collision with root package name */
    public static final long f32718i = 150;

    /* renamed from: j, reason: collision with root package name */
    public static final long f32719j = 0;

    /* renamed from: k, reason: collision with root package name */
    public static final long f32720k = 150;

    /* renamed from: f, reason: collision with root package name */
    public final j f32721f;

    /* renamed from: g, reason: collision with root package name */
    public final j f32722g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f32723a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f32724b;

        public a(boolean z11, View view) {
            this.f32723a = z11;
            this.f32724b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f32723a) {
                return;
            }
            this.f32724b.setVisibility(4);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f32723a) {
                this.f32724b.setVisibility(0);
            }
        }
    }

    public FabTransformationScrimBehavior() {
        this.f32721f = new j(75L, 150L);
        this.f32722g = new j(0L, 150L);
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return view2 instanceof FloatingActionButton;
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    @NonNull
    public AnimatorSet n(@NonNull View view, @NonNull View view2, boolean z11, boolean z12) {
        ArrayList arrayList = new ArrayList();
        o(view2, z11, z12, arrayList, new ArrayList());
        AnimatorSet animatorSet = new AnimatorSet();
        c.a(animatorSet, arrayList);
        animatorSet.addListener(new a(z11, view2));
        return animatorSet;
    }

    public final void o(@NonNull View view, boolean z11, boolean z12, @NonNull List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator ofFloat;
        j jVar = z11 ? this.f32721f : this.f32722g;
        if (z11) {
            if (!z12) {
                view.setAlpha(0.0f);
            }
            ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 1.0f);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f);
        }
        jVar.a(ofFloat);
        list.add(ofFloat);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull MotionEvent motionEvent) {
        return super.onTouchEvent(coordinatorLayout, view, motionEvent);
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32721f = new j(75L, 150L);
        this.f32722g = new j(0L, 150L);
    }
}

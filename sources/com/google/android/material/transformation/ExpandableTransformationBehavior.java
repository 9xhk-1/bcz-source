package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Deprecated
/* loaded from: classes7.dex */
public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    public AnimatorSet f32696e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ExpandableTransformationBehavior.this.f32696e = null;
        }
    }

    public ExpandableTransformationBehavior() {
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior
    @CallSuper
    public boolean l(View view, View view2, boolean z11, boolean z12) {
        AnimatorSet animatorSet = this.f32696e;
        boolean z13 = animatorSet != null;
        if (z13) {
            animatorSet.cancel();
        }
        AnimatorSet n11 = n(view, view2, z11, z13);
        this.f32696e = n11;
        n11.addListener(new a());
        this.f32696e.start();
        if (!z12) {
            this.f32696e.end();
        }
        return true;
    }

    @NonNull
    public abstract AnimatorSet n(View view, View view2, boolean z11, boolean z12);

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}

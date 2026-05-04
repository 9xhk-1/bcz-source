package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class f extends s {

    /* renamed from: n, reason: collision with root package name */
    public static final int f32409n = 100;

    /* renamed from: o, reason: collision with root package name */
    public static final int f32410o = 150;

    /* renamed from: p, reason: collision with root package name */
    public static final float f32411p = 0.8f;

    /* renamed from: e, reason: collision with root package name */
    public final int f32412e;

    /* renamed from: f, reason: collision with root package name */
    public final int f32413f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final TimeInterpolator f32414g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final TimeInterpolator f32415h;

    /* renamed from: i, reason: collision with root package name */
    @Nullable
    public EditText f32416i;

    /* renamed from: j, reason: collision with root package name */
    public final View.OnClickListener f32417j;

    /* renamed from: k, reason: collision with root package name */
    public final View.OnFocusChangeListener f32418k;

    /* renamed from: l, reason: collision with root package name */
    public AnimatorSet f32419l;

    /* renamed from: m, reason: collision with root package name */
    public ValueAnimator f32420m;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            f.this.f32481b.f0(true);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            f.this.f32481b.f0(false);
        }
    }

    public f(@NonNull r rVar) {
        super(rVar);
        this.f32417j = new View.OnClickListener() { // from class: com.google.android.material.textfield.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                f.v(f.this, view);
            }
        };
        this.f32418k = new View.OnFocusChangeListener() { // from class: com.google.android.material.textfield.b
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z11) {
                r0.A(f.this.E());
            }
        };
        Context context = rVar.getContext();
        int i11 = R.attr.motionDurationShort3;
        this.f32412e = pn.j.f(context, i11, 100);
        this.f32413f = pn.j.f(rVar.getContext(), i11, 150);
        this.f32414g = pn.j.g(rVar.getContext(), R.attr.motionEasingLinearInterpolator, vm.b.f94060a);
        this.f32415h = pn.j.g(rVar.getContext(), R.attr.motionEasingEmphasizedInterpolator, vm.b.f94063d);
    }

    public static /* synthetic */ void v(f fVar, View view) {
        EditText editText = fVar.f32416i;
        if (editText == null) {
            return;
        }
        Editable text = editText.getText();
        if (text != null) {
            text.clear();
        }
        fVar.r();
    }

    public static /* synthetic */ void x(f fVar, ValueAnimator valueAnimator) {
        fVar.getClass();
        fVar.f32483d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static /* synthetic */ void y(f fVar, ValueAnimator valueAnimator) {
        fVar.getClass();
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        fVar.f32483d.setScaleX(floatValue);
        fVar.f32483d.setScaleY(floatValue);
    }

    public final void A(boolean z11) {
        boolean z12 = this.f32481b.I() == z11;
        if (z11 && !this.f32419l.isRunning()) {
            this.f32420m.cancel();
            this.f32419l.start();
            if (z12) {
                this.f32419l.end();
                return;
            }
            return;
        }
        if (z11) {
            return;
        }
        this.f32419l.cancel();
        this.f32420m.start();
        if (z12) {
            this.f32420m.end();
        }
    }

    public final ValueAnimator B(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(this.f32414g);
        ofFloat.setDuration(this.f32412e);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                f.x(f.this, valueAnimator);
            }
        });
        return ofFloat;
    }

    public final ValueAnimator C() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(this.f32415h);
        ofFloat.setDuration(this.f32413f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.e
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                f.y(f.this, valueAnimator);
            }
        });
        return ofFloat;
    }

    public final void D() {
        ValueAnimator C = C();
        ValueAnimator B = B(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f32419l = animatorSet;
        animatorSet.playTogether(C, B);
        this.f32419l.addListener(new a());
        ValueAnimator B2 = B(1.0f, 0.0f);
        this.f32420m = B2;
        B2.addListener(new b());
    }

    public final boolean E() {
        EditText editText = this.f32416i;
        if (editText != null) {
            return (editText.hasFocus() || this.f32483d.hasFocus()) && this.f32416i.getText().length() > 0;
        }
        return false;
    }

    @Override // com.google.android.material.textfield.s
    public void a(@NonNull Editable editable) {
        if (this.f32481b.y() != null) {
            return;
        }
        A(E());
    }

    @Override // com.google.android.material.textfield.s
    public int c() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // com.google.android.material.textfield.s
    public int d() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // com.google.android.material.textfield.s
    public View.OnFocusChangeListener e() {
        return this.f32418k;
    }

    @Override // com.google.android.material.textfield.s
    public View.OnClickListener f() {
        return this.f32417j;
    }

    @Override // com.google.android.material.textfield.s
    public View.OnFocusChangeListener g() {
        return this.f32418k;
    }

    @Override // com.google.android.material.textfield.s
    public void n(@Nullable EditText editText) {
        this.f32416i = editText;
        this.f32480a.setEndIconVisible(E());
    }

    @Override // com.google.android.material.textfield.s
    public void q(boolean z11) {
        if (this.f32481b.y() == null) {
            return;
        }
        A(z11);
    }

    @Override // com.google.android.material.textfield.s
    public void s() {
        D();
    }

    @Override // com.google.android.material.textfield.s
    public void u() {
        EditText editText = this.f32416i;
        if (editText != null) {
            editText.post(new Runnable() { // from class: com.google.android.material.textfield.d
                @Override // java.lang.Runnable
                public final void run() {
                    f.this.A(true);
                }
            });
        }
    }
}

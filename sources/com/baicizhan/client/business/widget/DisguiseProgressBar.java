package com.baicizhan.client.business.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.ProgressBar;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class DisguiseProgressBar extends ProgressBar {

    /* renamed from: b, reason: collision with root package name */
    public static final int f17074b = 1000;

    /* renamed from: c, reason: collision with root package name */
    public static final int f17075c = 3000;

    /* renamed from: d, reason: collision with root package name */
    public static final int f17076d = 6000;

    /* renamed from: e, reason: collision with root package name */
    public static final int f17077e = 300;

    /* renamed from: a, reason: collision with root package name */
    public AnimatorSet f17078a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator animation) {
            DisguiseProgressBar.this.setProgress((int) ((Float) animation.getAnimatedValue()).floatValue());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        public b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator animation) {
            DisguiseProgressBar.this.setProgress((int) ((Float) animation.getAnimatedValue()).floatValue());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements ValueAnimator.AnimatorUpdateListener {
        public c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator animation) {
            DisguiseProgressBar.this.setProgress((int) ((Float) animation.getAnimatedValue()).floatValue());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator animation) {
            DisguiseProgressBar.this.setProgress((int) ((Float) animation.getAnimatedValue()).floatValue());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class e implements ValueAnimator.AnimatorUpdateListener {
        public e() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator animation) {
            float floatValue = ((Float) animation.getAnimatedValue()).floatValue();
            DisguiseProgressBar.this.setAlpha(floatValue);
            if (floatValue <= 0.0f) {
                DisguiseProgressBar.this.setVisibility(8);
            }
        }
    }

    public DisguiseProgressBar(Context context) {
        super(context);
        setMax(1000);
    }

    public void a() {
        AnimatorSet animatorSet = this.f17078a;
        if (animatorSet != null) {
            animatorSet.cancel();
            ArrayList<Animator> childAnimations = this.f17078a.getChildAnimations();
            if (childAnimations != null) {
                Iterator<Animator> it = childAnimations.iterator();
                while (it.hasNext()) {
                    Animator next = it.next();
                    next.removeAllListeners();
                    if (next instanceof ValueAnimator) {
                        ((ValueAnimator) next).removeAllUpdateListeners();
                    }
                }
            }
        }
    }

    public void b() {
        a();
        ValueAnimator duration = ValueAnimator.ofFloat(getProgress(), 1000.0f).setDuration(300L);
        duration.addUpdateListener(new d());
        ValueAnimator duration2 = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(300L);
        duration2.addUpdateListener(new e());
        AnimatorSet animatorSet = new AnimatorSet();
        this.f17078a = animatorSet;
        animatorSet.playTogether(duration, duration2);
        this.f17078a.start();
    }

    public void c(float progress) {
        setVisibility(0);
        setAlpha(1.0f);
        a();
        int i11 = (int) (progress * 1000.0f);
        if (i11 >= 1000) {
            b();
            return;
        }
        ValueAnimator duration = ValueAnimator.ofFloat(Math.min(getProgress(), i11), i11).setDuration((i11 - r1) * 2);
        duration.addUpdateListener(new c());
        AnimatorSet animatorSet = new AnimatorSet();
        this.f17078a = animatorSet;
        animatorSet.play(duration);
        this.f17078a.start();
    }

    public void d() {
        setVisibility(0);
        setAlpha(1.0f);
        a();
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 500.0f).setDuration(3000L);
        duration.setInterpolator(new AccelerateInterpolator());
        duration.addUpdateListener(new a());
        ValueAnimator duration2 = ValueAnimator.ofFloat(500.0f, 900.0f).setDuration(6000L);
        duration2.setInterpolator(new DecelerateInterpolator());
        duration2.addUpdateListener(new b());
        AnimatorSet animatorSet = new AnimatorSet();
        this.f17078a = animatorSet;
        animatorSet.playSequentially(duration, duration2);
        this.f17078a.start();
    }

    public DisguiseProgressBar(Context context, AttributeSet attrs) {
        super(context, attrs, R.attr.progressBarStyleHorizontal);
        setMax(1000);
    }
}

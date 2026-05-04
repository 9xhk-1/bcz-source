package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import com.google.android.material.R;
import com.google.android.material.circularreveal.c;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;
import vm.f;
import vm.i;
import vm.j;
import vm.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Deprecated
/* loaded from: classes7.dex */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: f, reason: collision with root package name */
    public final Rect f32698f;

    /* renamed from: g, reason: collision with root package name */
    public final RectF f32699g;

    /* renamed from: h, reason: collision with root package name */
    public final RectF f32700h;

    /* renamed from: i, reason: collision with root package name */
    public final int[] f32701i;

    /* renamed from: j, reason: collision with root package name */
    public float f32702j;

    /* renamed from: k, reason: collision with root package name */
    public float f32703k;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f32704a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f32705b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f32706c;

        public a(boolean z11, View view, View view2) {
            this.f32704a = z11;
            this.f32705b = view;
            this.f32706c = view2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f32704a) {
                return;
            }
            this.f32705b.setVisibility(4);
            this.f32706c.setAlpha(1.0f);
            this.f32706c.setVisibility(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f32704a) {
                this.f32705b.setVisibility(0);
                this.f32706c.setAlpha(0.0f);
                this.f32706c.setVisibility(4);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f32708a;

        public b(View view) {
            this.f32708a = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f32708a.invalidate();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.google.android.material.circularreveal.c f32710a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Drawable f32711b;

        public c(com.google.android.material.circularreveal.c cVar, Drawable drawable) {
            this.f32710a = cVar;
            this.f32711b = drawable;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f32710a.setCircularRevealOverlayDrawable(null);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f32710a.setCircularRevealOverlayDrawable(this.f32711b);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.google.android.material.circularreveal.c f32713a;

        public d(com.google.android.material.circularreveal.c cVar) {
            this.f32713a = cVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            c.e revealInfo = this.f32713a.getRevealInfo();
            revealInfo.f31075c = Float.MAX_VALUE;
            this.f32713a.setRevealInfo(revealInfo);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class e {

        /* renamed from: a, reason: collision with root package name */
        @Nullable
        public i f32715a;

        /* renamed from: b, reason: collision with root package name */
        public k f32716b;
    }

    public FabTransformationBehavior() {
        this.f32698f = new Rect();
        this.f32699g = new RectF();
        this.f32700h = new RectF();
        this.f32701i = new int[2];
    }

    public final void A(@NonNull View view, @NonNull View view2, boolean z11, @NonNull e eVar, @NonNull List<Animator> list) {
        float u11 = u(view, view2, eVar.f32716b);
        float v11 = v(view, view2, eVar.f32716b);
        Pair<j, j> r11 = r(u11, v11, z11, eVar);
        j jVar = (j) r11.first;
        j jVar2 = (j) r11.second;
        Property property = View.TRANSLATION_X;
        if (!z11) {
            u11 = this.f32702j;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, u11);
        Property property2 = View.TRANSLATION_Y;
        if (!z11) {
            v11 = this.f32703k;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, v11);
        jVar.a(ofFloat);
        jVar2.a(ofFloat2);
        list.add(ofFloat);
        list.add(ofFloat2);
    }

    @TargetApi(21)
    public final void B(View view, @NonNull View view2, boolean z11, boolean z12, @NonNull e eVar, @NonNull List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator ofFloat;
        float elevation = ViewCompat.getElevation(view2) - ViewCompat.getElevation(view);
        if (z11) {
            if (!z12) {
                view2.setTranslationZ(-elevation);
            }
            ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, 0.0f);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, -elevation);
        }
        eVar.f32715a.h("elevation").a(ofFloat);
        list.add(ofFloat);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void C(@NonNull View view, View view2, boolean z11, boolean z12, @NonNull e eVar, float f11, float f12, @NonNull List<Animator> list, @NonNull List<Animator.AnimatorListener> list2) {
        Animator animator;
        if (view2 instanceof com.google.android.material.circularreveal.c) {
            com.google.android.material.circularreveal.c cVar = (com.google.android.material.circularreveal.c) view2;
            float s11 = s(view, view2, eVar.f32716b);
            float t11 = t(view, view2, eVar.f32716b);
            ((FloatingActionButton) view).k(this.f32698f);
            float width = this.f32698f.width() / 2.0f;
            j h11 = eVar.f32715a.h("expansion");
            if (z11) {
                if (!z12) {
                    cVar.setRevealInfo(new c.e(s11, t11, width));
                }
                if (z12) {
                    width = cVar.getRevealInfo().f31075c;
                }
                animator = com.google.android.material.circularreveal.a.a(cVar, s11, t11, on.a.b(s11, t11, 0.0f, 0.0f, f11, f12));
                animator.addListener(new d(cVar));
                F(view2, h11.c(), (int) s11, (int) t11, width, list);
            } else {
                float f13 = cVar.getRevealInfo().f31075c;
                Animator a11 = com.google.android.material.circularreveal.a.a(cVar, s11, t11, width);
                int i11 = (int) s11;
                int i12 = (int) t11;
                F(view2, h11.c(), i11, i12, f13, list);
                E(view2, h11.c(), h11.d(), eVar.f32715a.i(), i11, i12, width, list);
                animator = a11;
            }
            h11.a(animator);
            list.add(animator);
            list2.add(com.google.android.material.circularreveal.a.c(cVar));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void D(View view, View view2, boolean z11, boolean z12, @NonNull e eVar, @NonNull List<Animator> list, @NonNull List<Animator.AnimatorListener> list2) {
        ObjectAnimator ofInt;
        if ((view2 instanceof com.google.android.material.circularreveal.c) && (view instanceof ImageView)) {
            com.google.android.material.circularreveal.c cVar = (com.google.android.material.circularreveal.c) view2;
            Drawable drawable = ((ImageView) view).getDrawable();
            if (drawable == null) {
                return;
            }
            drawable.mutate();
            if (z11) {
                if (!z12) {
                    drawable.setAlpha(255);
                }
                ofInt = ObjectAnimator.ofInt(drawable, f.f94067b, 0);
            } else {
                ofInt = ObjectAnimator.ofInt(drawable, f.f94067b, 255);
            }
            ofInt.addUpdateListener(new b(view2));
            eVar.f32715a.h("iconFade").a(ofInt);
            list.add(ofInt);
            list2.add(new c(cVar, drawable));
        }
    }

    public final void E(View view, long j11, long j12, long j13, int i11, int i12, float f11, @NonNull List<Animator> list) {
        long j14 = j11 + j12;
        if (j14 < j13) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i11, i12, f11, f11);
            createCircularReveal.setStartDelay(j14);
            createCircularReveal.setDuration(j13 - j14);
            list.add(createCircularReveal);
        }
    }

    public final void F(View view, long j11, int i11, int i12, float f11, @NonNull List<Animator> list) {
        if (j11 > 0) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i11, i12, f11, f11);
            createCircularReveal.setStartDelay(0L);
            createCircularReveal.setDuration(j11);
            list.add(createCircularReveal);
        }
    }

    public final void G(@NonNull View view, @NonNull View view2, boolean z11, boolean z12, @NonNull e eVar, @NonNull List<Animator> list, List<Animator.AnimatorListener> list2, @NonNull RectF rectF) {
        j jVar;
        j jVar2;
        ObjectAnimator ofFloat;
        ObjectAnimator ofFloat2;
        float u11 = u(view, view2, eVar.f32716b);
        float v11 = v(view, view2, eVar.f32716b);
        Pair<j, j> r11 = r(u11, v11, z11, eVar);
        j jVar3 = (j) r11.first;
        j jVar4 = (j) r11.second;
        if (z11) {
            if (!z12) {
                view2.setTranslationX(-u11);
                view2.setTranslationY(-v11);
            }
            ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, 0.0f);
            ofFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, 0.0f);
            jVar = jVar4;
            jVar2 = jVar3;
            p(view2, eVar, jVar2, jVar, -u11, -v11, 0.0f, 0.0f, rectF);
        } else {
            jVar = jVar4;
            jVar2 = jVar3;
            ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, -u11);
            ofFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, -v11);
        }
        jVar2.a(ofFloat);
        jVar.a(ofFloat2);
        list.add(ofFloat);
        list.add(ofFloat2);
    }

    public final int H(@NonNull View view) {
        ColorStateList backgroundTintList = ViewCompat.getBackgroundTintList(view);
        if (backgroundTintList != null) {
            return backgroundTintList.getColorForState(view.getDrawableState(), backgroundTintList.getDefaultColor());
        }
        return 0;
    }

    public abstract e I(Context context, boolean z11);

    @Nullable
    public final ViewGroup J(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    @CallSuper
    public boolean layoutDependsOn(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        }
        if (!(view2 instanceof FloatingActionButton)) {
            return false;
        }
        int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
        return expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId();
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    @NonNull
    public AnimatorSet n(@NonNull View view, @NonNull View view2, boolean z11, boolean z12) {
        e I = I(view2.getContext(), z11);
        if (z11) {
            this.f32702j = view.getTranslationX();
            this.f32703k = view.getTranslationY();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        B(view, view2, z11, z12, I, arrayList, arrayList2);
        RectF rectF = this.f32699g;
        G(view, view2, z11, z12, I, arrayList, arrayList2, rectF);
        float width = rectF.width();
        float height = rectF.height();
        A(view, view2, z11, I, arrayList);
        D(view, view2, z11, z12, I, arrayList, arrayList2);
        C(view, view2, z11, z12, I, width, height, arrayList, arrayList2);
        z(view, view2, z11, z12, I, arrayList, arrayList2);
        y(view, view2, z11, z12, I, arrayList, arrayList2);
        AnimatorSet animatorSet = new AnimatorSet();
        vm.c.a(animatorSet, arrayList);
        animatorSet.addListener(new a(z11, view2, view));
        int size = arrayList2.size();
        for (int i11 = 0; i11 < size; i11++) {
            animatorSet.addListener(arrayList2.get(i11));
        }
        return animatorSet;
    }

    @Nullable
    public final ViewGroup o(@NonNull View view) {
        View findViewById = view.findViewById(R.id.mtrl_child_content_container);
        return findViewById != null ? J(findViewById) : ((view instanceof TransformationChildLayout) || (view instanceof TransformationChildCard)) ? J(((ViewGroup) view).getChildAt(0)) : J(view);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    @CallSuper
    public void onAttachedToLayoutParams(@NonNull CoordinatorLayout.LayoutParams layoutParams) {
        if (layoutParams.dodgeInsetEdges == 0) {
            layoutParams.dodgeInsetEdges = 80;
        }
    }

    public final void p(@NonNull View view, @NonNull e eVar, @NonNull j jVar, @NonNull j jVar2, float f11, float f12, float f13, float f14, @NonNull RectF rectF) {
        float w11 = w(eVar, jVar, f11, f13);
        float w12 = w(eVar, jVar2, f12, f14);
        Rect rect = this.f32698f;
        view.getWindowVisibleDisplayFrame(rect);
        RectF rectF2 = this.f32699g;
        rectF2.set(rect);
        RectF rectF3 = this.f32700h;
        x(view, rectF3);
        rectF3.offset(w11, w12);
        rectF3.intersect(rectF2);
        rectF.set(rectF3);
    }

    public final void q(@NonNull View view, @NonNull RectF rectF) {
        x(view, rectF);
        rectF.offset(this.f32702j, this.f32703k);
    }

    @NonNull
    public final Pair<j, j> r(float f11, float f12, boolean z11, @NonNull e eVar) {
        j h11;
        j h12;
        if (f11 == 0.0f || f12 == 0.0f) {
            h11 = eVar.f32715a.h("translationXLinear");
            h12 = eVar.f32715a.h("translationYLinear");
        } else if ((!z11 || f12 >= 0.0f) && (z11 || f12 <= 0.0f)) {
            h11 = eVar.f32715a.h("translationXCurveDownwards");
            h12 = eVar.f32715a.h("translationYCurveDownwards");
        } else {
            h11 = eVar.f32715a.h("translationXCurveUpwards");
            h12 = eVar.f32715a.h("translationYCurveUpwards");
        }
        return new Pair<>(h11, h12);
    }

    public final float s(@NonNull View view, @NonNull View view2, @NonNull k kVar) {
        RectF rectF = this.f32699g;
        RectF rectF2 = this.f32700h;
        q(view, rectF);
        x(view2, rectF2);
        rectF2.offset(-u(view, view2, kVar), 0.0f);
        return rectF.centerX() - rectF2.left;
    }

    public final float t(@NonNull View view, @NonNull View view2, @NonNull k kVar) {
        RectF rectF = this.f32699g;
        RectF rectF2 = this.f32700h;
        q(view, rectF);
        x(view2, rectF2);
        rectF2.offset(0.0f, -v(view, view2, kVar));
        return rectF.centerY() - rectF2.top;
    }

    public final float u(@NonNull View view, @NonNull View view2, @NonNull k kVar) {
        float centerX;
        float centerX2;
        float f11;
        RectF rectF = this.f32699g;
        RectF rectF2 = this.f32700h;
        q(view, rectF);
        x(view2, rectF2);
        int i11 = kVar.f94081a & 7;
        if (i11 == 1) {
            centerX = rectF2.centerX();
            centerX2 = rectF.centerX();
        } else if (i11 == 3) {
            centerX = rectF2.left;
            centerX2 = rectF.left;
        } else {
            if (i11 != 5) {
                f11 = 0.0f;
                return f11 + kVar.f94082b;
            }
            centerX = rectF2.right;
            centerX2 = rectF.right;
        }
        f11 = centerX - centerX2;
        return f11 + kVar.f94082b;
    }

    public final float v(@NonNull View view, @NonNull View view2, @NonNull k kVar) {
        float centerY;
        float centerY2;
        float f11;
        RectF rectF = this.f32699g;
        RectF rectF2 = this.f32700h;
        q(view, rectF);
        x(view2, rectF2);
        int i11 = kVar.f94081a & 112;
        if (i11 == 16) {
            centerY = rectF2.centerY();
            centerY2 = rectF.centerY();
        } else if (i11 == 48) {
            centerY = rectF2.top;
            centerY2 = rectF.top;
        } else {
            if (i11 != 80) {
                f11 = 0.0f;
                return f11 + kVar.f94083c;
            }
            centerY = rectF2.bottom;
            centerY2 = rectF.bottom;
        }
        f11 = centerY - centerY2;
        return f11 + kVar.f94083c;
    }

    public final float w(@NonNull e eVar, @NonNull j jVar, float f11, float f12) {
        long c11 = jVar.c();
        long d11 = jVar.d();
        j h11 = eVar.f32715a.h("expansion");
        return vm.b.a(f11, f12, jVar.e().getInterpolation((((h11.c() + h11.d()) + 17) - c11) / d11));
    }

    public final void x(@NonNull View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        view.getLocationInWindow(this.f32701i);
        rectF.offsetTo(r0[0], r0[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    public final void y(View view, View view2, boolean z11, boolean z12, @NonNull e eVar, @NonNull List<Animator> list, List<Animator.AnimatorListener> list2) {
        ViewGroup o11;
        ObjectAnimator ofFloat;
        if (view2 instanceof ViewGroup) {
            if (((view2 instanceof com.google.android.material.circularreveal.c) && com.google.android.material.circularreveal.b.f31057o == 0) || (o11 = o(view2)) == null) {
                return;
            }
            if (z11) {
                if (!z12) {
                    vm.e.f94066a.set(o11, Float.valueOf(0.0f));
                }
                ofFloat = ObjectAnimator.ofFloat(o11, vm.e.f94066a, 1.0f);
            } else {
                ofFloat = ObjectAnimator.ofFloat(o11, vm.e.f94066a, 0.0f);
            }
            eVar.f32715a.h("contentFade").a(ofFloat);
            list.add(ofFloat);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void z(@NonNull View view, View view2, boolean z11, boolean z12, @NonNull e eVar, @NonNull List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator ofInt;
        if (view2 instanceof com.google.android.material.circularreveal.c) {
            com.google.android.material.circularreveal.c cVar = (com.google.android.material.circularreveal.c) view2;
            int H = H(view);
            int i11 = 16777215 & H;
            if (z11) {
                if (!z12) {
                    cVar.setCircularRevealScrimColor(H);
                }
                ofInt = ObjectAnimator.ofInt(cVar, c.d.f31071a, i11);
            } else {
                ofInt = ObjectAnimator.ofInt(cVar, c.d.f31071a, H);
            }
            ofInt.setEvaluator(vm.d.b());
            eVar.f32715a.h("color").a(ofInt);
            list.add(ofInt);
        }
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32698f = new Rect();
        this.f32699g = new RectF();
        this.f32700h = new RectF();
        this.f32701i = new int[2];
    }
}

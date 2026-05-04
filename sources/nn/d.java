package nn;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.content.ContextCompat;
import androidx.core.util.Preconditions;
import com.google.android.material.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import vn.k;
import vn.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(21)
/* loaded from: classes7.dex */
public class d extends com.google.android.material.floatingactionbutton.a {

    /* renamed from: c0, reason: collision with root package name */
    @Nullable
    public StateListAnimator f75212c0;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a extends k {
        public a(p pVar) {
            super(pVar);
        }

        @Override // vn.k, android.graphics.drawable.Drawable
        public boolean isStateful() {
            return true;
        }
    }

    public d(FloatingActionButton floatingActionButton, un.c cVar) {
        super(floatingActionButton, cVar);
    }

    @Override // com.google.android.material.floatingactionbutton.a
    public void D() {
        j0();
    }

    @Override // com.google.android.material.floatingactionbutton.a
    public void G(float f11, float f12, float f13) {
        if (this.f31402w.getStateListAnimator() == this.f75212c0) {
            StateListAnimator n02 = n0(f11, f12, f13);
            this.f75212c0 = n02;
            this.f31402w.setStateListAnimator(n02);
        }
        if (d0()) {
            j0();
        }
    }

    @Override // com.google.android.material.floatingactionbutton.a
    public boolean O() {
        return false;
    }

    @Override // com.google.android.material.floatingactionbutton.a
    public void Z(@Nullable ColorStateList colorStateList) {
        Drawable drawable = this.f31382c;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(tn.b.e(colorStateList));
        } else {
            super.Z(colorStateList);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.a
    public boolean d0() {
        return this.f31403x.a() || !f0();
    }

    @Override // com.google.android.material.floatingactionbutton.a
    @NonNull
    public k l() {
        return new a((p) Preconditions.checkNotNull(this.f31380a));
    }

    @NonNull
    public c m0(int i11, ColorStateList colorStateList) {
        Context context = this.f31402w.getContext();
        c cVar = new c((p) Preconditions.checkNotNull(this.f31380a));
        cVar.f(ContextCompat.getColor(context, R.color.design_fab_stroke_top_outer_color), ContextCompat.getColor(context, R.color.design_fab_stroke_top_inner_color), ContextCompat.getColor(context, R.color.design_fab_stroke_end_inner_color), ContextCompat.getColor(context, R.color.design_fab_stroke_end_outer_color));
        cVar.e(i11);
        cVar.d(colorStateList);
        return cVar;
    }

    @Override // com.google.android.material.floatingactionbutton.a
    public float n() {
        return this.f31402w.getElevation();
    }

    @NonNull
    public final StateListAnimator n0(float f11, float f12, float f13) {
        StateListAnimator stateListAnimator = new StateListAnimator();
        stateListAnimator.addState(com.google.android.material.floatingactionbutton.a.W, o0(f11, f13));
        stateListAnimator.addState(com.google.android.material.floatingactionbutton.a.X, o0(f11, f12));
        stateListAnimator.addState(com.google.android.material.floatingactionbutton.a.Y, o0(f11, f12));
        stateListAnimator.addState(com.google.android.material.floatingactionbutton.a.Z, o0(f11, f12));
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofFloat(this.f31402w, "elevation", f11).setDuration(0L));
        if (Build.VERSION.SDK_INT <= 24) {
            FloatingActionButton floatingActionButton = this.f31402w;
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, floatingActionButton.getTranslationZ()).setDuration(100L));
        }
        arrayList.add(ObjectAnimator.ofFloat(this.f31402w, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, 0.0f).setDuration(100L));
        animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
        animatorSet.setInterpolator(com.google.android.material.floatingactionbutton.a.D);
        stateListAnimator.addState(com.google.android.material.floatingactionbutton.a.f31378a0, animatorSet);
        stateListAnimator.addState(com.google.android.material.floatingactionbutton.a.f31379b0, o0(0.0f, 0.0f));
        return stateListAnimator;
    }

    @NonNull
    public final Animator o0(float f11, float f12) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.f31402w, "elevation", f11).setDuration(0L)).with(ObjectAnimator.ofFloat(this.f31402w, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, f12).setDuration(100L));
        animatorSet.setInterpolator(com.google.android.material.floatingactionbutton.a.D);
        return animatorSet;
    }

    @Override // com.google.android.material.floatingactionbutton.a
    public void s(@NonNull Rect rect) {
        if (this.f31403x.a()) {
            super.s(rect);
        } else if (f0()) {
            rect.set(0, 0, 0, 0);
        } else {
            int sizeDimension = (this.f31390k - this.f31402w.getSizeDimension()) / 2;
            rect.set(sizeDimension, sizeDimension, sizeDimension, sizeDimension);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.a
    public void y(ColorStateList colorStateList, @Nullable PorterDuff.Mode mode, ColorStateList colorStateList2, int i11) {
        Drawable drawable;
        k l11 = l();
        this.f31381b = l11;
        l11.setTintList(colorStateList);
        if (mode != null) {
            this.f31381b.setTintMode(mode);
        }
        this.f31381b.a0(this.f31402w.getContext());
        if (i11 > 0) {
            this.f31383d = m0(i11, colorStateList);
            drawable = new LayerDrawable(new Drawable[]{(Drawable) Preconditions.checkNotNull(this.f31383d), (Drawable) Preconditions.checkNotNull(this.f31381b)});
        } else {
            this.f31383d = null;
            drawable = this.f31381b;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(tn.b.e(colorStateList2), drawable, null);
        this.f31382c = rippleDrawable;
        this.f31384e = rippleDrawable;
    }

    @Override // com.google.android.material.floatingactionbutton.a
    public void B() {
    }

    @Override // com.google.android.material.floatingactionbutton.a
    public void h0() {
    }

    @Override // com.google.android.material.floatingactionbutton.a
    public void F(int[] iArr) {
    }
}

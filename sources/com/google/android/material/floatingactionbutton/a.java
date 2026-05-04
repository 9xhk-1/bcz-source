package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.util.Preconditions;
import androidx.core.view.ViewCompat;
import com.google.android.material.R;
import com.google.android.material.internal.x;
import java.util.ArrayList;
import java.util.Iterator;
import vn.p;
import vn.t;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class a {
    public static final long E = 100;
    public static final long F = 100;
    public static final int G = 0;
    public static final int H = 1;
    public static final int I = 2;
    public static final float J = 1.5f;
    public static final float K = 0.0f;
    public static final float L = 0.4f;
    public static final float M = 0.4f;
    public static final float N = 1.0f;
    public static final float O = 1.0f;
    public static final float P = 1.0f;
    public static final float Q = 0.0f;
    public static final float R = 0.0f;

    @Nullable
    public ViewTreeObserver.OnPreDrawListener C;

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    public p f31380a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    public vn.k f31381b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    public Drawable f31382c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    public nn.c f31383d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    public Drawable f31384e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f31385f;

    /* renamed from: h, reason: collision with root package name */
    public float f31387h;

    /* renamed from: i, reason: collision with root package name */
    public float f31388i;

    /* renamed from: j, reason: collision with root package name */
    public float f31389j;

    /* renamed from: k, reason: collision with root package name */
    public int f31390k;

    /* renamed from: l, reason: collision with root package name */
    @NonNull
    public final x f31391l;

    /* renamed from: m, reason: collision with root package name */
    @Nullable
    public Animator f31392m;

    /* renamed from: n, reason: collision with root package name */
    @Nullable
    public vm.i f31393n;

    /* renamed from: o, reason: collision with root package name */
    @Nullable
    public vm.i f31394o;

    /* renamed from: p, reason: collision with root package name */
    public float f31395p;

    /* renamed from: r, reason: collision with root package name */
    public int f31397r;

    /* renamed from: t, reason: collision with root package name */
    public ArrayList<Animator.AnimatorListener> f31399t;

    /* renamed from: u, reason: collision with root package name */
    public ArrayList<Animator.AnimatorListener> f31400u;

    /* renamed from: v, reason: collision with root package name */
    public ArrayList<j> f31401v;

    /* renamed from: w, reason: collision with root package name */
    public final FloatingActionButton f31402w;

    /* renamed from: x, reason: collision with root package name */
    public final un.c f31403x;
    public static final TimeInterpolator D = vm.b.f94062c;
    public static final int S = R.attr.motionDurationLong2;
    public static final int T = R.attr.motionEasingEmphasizedInterpolator;
    public static final int U = R.attr.motionDurationMedium1;
    public static final int V = R.attr.motionEasingEmphasizedAccelerateInterpolator;
    public static final int[] W = {android.R.attr.state_pressed, android.R.attr.state_enabled};
    public static final int[] X = {android.R.attr.state_hovered, android.R.attr.state_focused, android.R.attr.state_enabled};
    public static final int[] Y = {android.R.attr.state_focused, android.R.attr.state_enabled};
    public static final int[] Z = {android.R.attr.state_hovered, android.R.attr.state_enabled};

    /* renamed from: a0, reason: collision with root package name */
    public static final int[] f31378a0 = {android.R.attr.state_enabled};

    /* renamed from: b0, reason: collision with root package name */
    public static final int[] f31379b0 = new int[0];

    /* renamed from: g, reason: collision with root package name */
    public boolean f31386g = true;

    /* renamed from: q, reason: collision with root package name */
    public float f31396q = 1.0f;

    /* renamed from: s, reason: collision with root package name */
    public int f31398s = 0;

    /* renamed from: y, reason: collision with root package name */
    public final Rect f31404y = new Rect();

    /* renamed from: z, reason: collision with root package name */
    public final RectF f31405z = new RectF();
    public final RectF A = new RectF();
    public final Matrix B = new Matrix();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.google.android.material.floatingactionbutton.a$a, reason: collision with other inner class name */
    public class C0374a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public boolean f31406a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f31407b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ k f31408c;

        public C0374a(boolean z11, k kVar) {
            this.f31407b = z11;
            this.f31408c = kVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f31406a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a.this.f31398s = 0;
            a.this.f31392m = null;
            if (this.f31406a) {
                return;
            }
            FloatingActionButton floatingActionButton = a.this.f31402w;
            boolean z11 = this.f31407b;
            floatingActionButton.c(z11 ? 8 : 4, z11);
            k kVar = this.f31408c;
            if (kVar != null) {
                kVar.b();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            a.this.f31402w.c(0, this.f31407b);
            a.this.f31398s = 1;
            a.this.f31392m = animator;
            this.f31406a = false;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f31410a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ k f31411b;

        public b(boolean z11, k kVar) {
            this.f31410a = z11;
            this.f31411b = kVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a.this.f31398s = 0;
            a.this.f31392m = null;
            k kVar = this.f31411b;
            if (kVar != null) {
                kVar.a();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            a.this.f31402w.c(0, this.f31410a);
            a.this.f31398s = 2;
            a.this.f31392m = animator;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c extends vm.h {
        public c() {
        }

        @Override // vm.h, android.animation.TypeEvaluator
        /* renamed from: a */
        public Matrix evaluate(float f11, @NonNull Matrix matrix, @NonNull Matrix matrix2) {
            a.this.f31396q = f11;
            return super.evaluate(f11, matrix, matrix2);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ float f31414a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ float f31415b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ float f31416c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ float f31417d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ float f31418e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ float f31419f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ float f31420g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ Matrix f31421h;

        public d(float f11, float f12, float f13, float f14, float f15, float f16, float f17, Matrix matrix) {
            this.f31414a = f11;
            this.f31415b = f12;
            this.f31416c = f13;
            this.f31417d = f14;
            this.f31418e = f15;
            this.f31419f = f16;
            this.f31420g = f17;
            this.f31421h = matrix;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            a.this.f31402w.setAlpha(vm.b.b(this.f31414a, this.f31415b, 0.0f, 0.2f, floatValue));
            a.this.f31402w.setScaleX(vm.b.a(this.f31416c, this.f31417d, floatValue));
            a.this.f31402w.setScaleY(vm.b.a(this.f31418e, this.f31417d, floatValue));
            a.this.f31396q = vm.b.a(this.f31419f, this.f31420g, floatValue);
            a.this.h(vm.b.a(this.f31419f, this.f31420g, floatValue), this.f31421h);
            a.this.f31402w.setImageMatrix(this.f31421h);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class e implements TypeEvaluator<Float> {

        /* renamed from: a, reason: collision with root package name */
        public FloatEvaluator f31423a = new FloatEvaluator();

        public e() {
        }

        @Override // android.animation.TypeEvaluator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float evaluate(float f11, Float f12, Float f13) {
            float floatValue = this.f31423a.evaluate(f11, (Number) f12, (Number) f13).floatValue();
            if (floatValue < 0.1f) {
                floatValue = 0.0f;
            }
            return Float.valueOf(floatValue);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class f implements ViewTreeObserver.OnPreDrawListener {
        public f() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            a.this.I();
            return true;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class g extends m {
        public g() {
            super(a.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.a.m
        public float a() {
            return 0.0f;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class h extends m {
        public h() {
            super(a.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.a.m
        public float a() {
            a aVar = a.this;
            return aVar.f31387h + aVar.f31388i;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class i extends m {
        public i() {
            super(a.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.a.m
        public float a() {
            a aVar = a.this;
            return aVar.f31387h + aVar.f31389j;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface j {
        void a();

        void b();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface k {
        void a();

        void b();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class l extends m {
        public l() {
            super(a.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.a.m
        public float a() {
            return a.this.f31387h;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public abstract class m extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        public boolean f31430a;

        /* renamed from: b, reason: collision with root package name */
        public float f31431b;

        /* renamed from: c, reason: collision with root package name */
        public float f31432c;

        public m() {
        }

        public abstract float a();

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a.this.k0((int) this.f31432c);
            this.f31430a = false;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            if (!this.f31430a) {
                vn.k kVar = a.this.f31381b;
                this.f31431b = kVar == null ? 0.0f : kVar.y();
                this.f31432c = a();
                this.f31430a = true;
            }
            a aVar = a.this;
            float f11 = this.f31431b;
            aVar.k0((int) (f11 + ((this.f31432c - f11) * valueAnimator.getAnimatedFraction())));
        }

        public /* synthetic */ m(a aVar, C0374a c0374a) {
            this();
        }
    }

    public a(FloatingActionButton floatingActionButton, un.c cVar) {
        this.f31402w = floatingActionButton;
        this.f31403x = cVar;
        x xVar = new x();
        this.f31391l = xVar;
        xVar.a(W, k(new i()));
        xVar.a(X, k(new h()));
        xVar.a(Y, k(new h()));
        xVar.a(Z, k(new h()));
        xVar.a(f31378a0, k(new l()));
        xVar.a(f31379b0, k(new g()));
        this.f31395p = floatingActionButton.getRotation();
    }

    public boolean A() {
        return this.f31402w.getVisibility() != 0 ? this.f31398s == 2 : this.f31398s != 1;
    }

    public void B() {
        this.f31391l.c();
    }

    public void C() {
        vn.k kVar = this.f31381b;
        if (kVar != null) {
            vn.l.f(this.f31402w, kVar);
        }
        if (O()) {
            this.f31402w.getViewTreeObserver().addOnPreDrawListener(r());
        }
    }

    public void E() {
        ViewTreeObserver viewTreeObserver = this.f31402w.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.C;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            this.C = null;
        }
    }

    public void F(int[] iArr) {
        this.f31391l.d(iArr);
    }

    public void G(float f11, float f12, float f13) {
        B();
        j0();
        k0(f11);
    }

    public void H(@NonNull Rect rect) {
        Preconditions.checkNotNull(this.f31384e, "Didn't initialize content background");
        if (!d0()) {
            this.f31403x.setBackgroundDrawable(this.f31384e);
        } else {
            this.f31403x.setBackgroundDrawable(new InsetDrawable(this.f31384e, rect.left, rect.top, rect.right, rect.bottom));
        }
    }

    public void I() {
        float rotation = this.f31402w.getRotation();
        if (this.f31395p != rotation) {
            this.f31395p = rotation;
            h0();
        }
    }

    public void J() {
        ArrayList<j> arrayList = this.f31401v;
        if (arrayList != null) {
            Iterator<j> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
    }

    public void K() {
        ArrayList<j> arrayList = this.f31401v;
        if (arrayList != null) {
            Iterator<j> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }
    }

    public void L(@NonNull Animator.AnimatorListener animatorListener) {
        ArrayList<Animator.AnimatorListener> arrayList = this.f31400u;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(animatorListener);
    }

    public void M(@NonNull Animator.AnimatorListener animatorListener) {
        ArrayList<Animator.AnimatorListener> arrayList = this.f31399t;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(animatorListener);
    }

    public void N(@NonNull j jVar) {
        ArrayList<j> arrayList = this.f31401v;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(jVar);
    }

    public boolean O() {
        return true;
    }

    public void P(@Nullable ColorStateList colorStateList) {
        vn.k kVar = this.f31381b;
        if (kVar != null) {
            kVar.setTintList(colorStateList);
        }
        nn.c cVar = this.f31383d;
        if (cVar != null) {
            cVar.d(colorStateList);
        }
    }

    public void Q(@Nullable PorterDuff.Mode mode) {
        vn.k kVar = this.f31381b;
        if (kVar != null) {
            kVar.setTintMode(mode);
        }
    }

    public final void R(float f11) {
        if (this.f31387h != f11) {
            this.f31387h = f11;
            G(f11, this.f31388i, this.f31389j);
        }
    }

    public void S(boolean z11) {
        this.f31385f = z11;
    }

    public final void T(@Nullable vm.i iVar) {
        this.f31394o = iVar;
    }

    public final void U(float f11) {
        if (this.f31388i != f11) {
            this.f31388i = f11;
            G(this.f31387h, f11, this.f31389j);
        }
    }

    public final void V(float f11) {
        this.f31396q = f11;
        Matrix matrix = this.B;
        h(f11, matrix);
        this.f31402w.setImageMatrix(matrix);
    }

    public final void W(int i11) {
        if (this.f31397r != i11) {
            this.f31397r = i11;
            i0();
        }
    }

    public void X(int i11) {
        this.f31390k = i11;
    }

    public final void Y(float f11) {
        if (this.f31389j != f11) {
            this.f31389j = f11;
            G(this.f31387h, this.f31388i, f11);
        }
    }

    public void Z(@Nullable ColorStateList colorStateList) {
        Drawable drawable = this.f31382c;
        if (drawable != null) {
            DrawableCompat.setTintList(drawable, tn.b.e(colorStateList));
        }
    }

    public void a0(boolean z11) {
        this.f31386g = z11;
        j0();
    }

    public final void b0(@NonNull p pVar) {
        this.f31380a = pVar;
        vn.k kVar = this.f31381b;
        if (kVar != null) {
            kVar.setShapeAppearanceModel(pVar);
        }
        Object obj = this.f31382c;
        if (obj instanceof t) {
            ((t) obj).setShapeAppearanceModel(pVar);
        }
        nn.c cVar = this.f31383d;
        if (cVar != null) {
            cVar.g(pVar);
        }
    }

    public final void c0(@Nullable vm.i iVar) {
        this.f31393n = iVar;
    }

    public boolean d0() {
        return true;
    }

    public void e(@NonNull Animator.AnimatorListener animatorListener) {
        if (this.f31400u == null) {
            this.f31400u = new ArrayList<>();
        }
        this.f31400u.add(animatorListener);
    }

    public final boolean e0() {
        return ViewCompat.isLaidOut(this.f31402w) && !this.f31402w.isInEditMode();
    }

    public void f(@NonNull Animator.AnimatorListener animatorListener) {
        if (this.f31399t == null) {
            this.f31399t = new ArrayList<>();
        }
        this.f31399t.add(animatorListener);
    }

    public final boolean f0() {
        return !this.f31385f || this.f31402w.getSizeDimension() >= this.f31390k;
    }

    public void g(@NonNull j jVar) {
        if (this.f31401v == null) {
            this.f31401v = new ArrayList<>();
        }
        this.f31401v.add(jVar);
    }

    public void g0(@Nullable k kVar, boolean z11) {
        AnimatorSet j11;
        a aVar;
        if (A()) {
            return;
        }
        Animator animator = this.f31392m;
        if (animator != null) {
            animator.cancel();
        }
        boolean z12 = this.f31393n == null;
        if (!e0()) {
            this.f31402w.c(0, z11);
            this.f31402w.setAlpha(1.0f);
            this.f31402w.setScaleY(1.0f);
            this.f31402w.setScaleX(1.0f);
            V(1.0f);
            if (kVar != null) {
                kVar.a();
                return;
            }
            return;
        }
        if (this.f31402w.getVisibility() != 0) {
            this.f31402w.setAlpha(0.0f);
            this.f31402w.setScaleY(z12 ? 0.4f : 0.0f);
            this.f31402w.setScaleX(z12 ? 0.4f : 0.0f);
            V(z12 ? 0.4f : 0.0f);
        }
        vm.i iVar = this.f31393n;
        if (iVar != null) {
            j11 = i(iVar, 1.0f, 1.0f, 1.0f);
            aVar = this;
        } else {
            j11 = j(1.0f, 1.0f, 1.0f, S, T);
            aVar = this;
        }
        j11.addListener(new b(z11, kVar));
        ArrayList<Animator.AnimatorListener> arrayList = aVar.f31399t;
        if (arrayList != null) {
            Iterator<Animator.AnimatorListener> it = arrayList.iterator();
            while (it.hasNext()) {
                j11.addListener(it.next());
            }
        }
        j11.start();
    }

    public final void h(float f11, @NonNull Matrix matrix) {
        matrix.reset();
        if (this.f31402w.getDrawable() == null || this.f31397r == 0) {
            return;
        }
        RectF rectF = this.f31405z;
        RectF rectF2 = this.A;
        rectF.set(0.0f, 0.0f, r0.getIntrinsicWidth(), r0.getIntrinsicHeight());
        int i11 = this.f31397r;
        rectF2.set(0.0f, 0.0f, i11, i11);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        int i12 = this.f31397r;
        matrix.postScale(f11, f11, i12 / 2.0f, i12 / 2.0f);
    }

    public void h0() {
        vn.k kVar = this.f31381b;
        if (kVar != null) {
            kVar.x0((int) this.f31395p);
        }
    }

    @NonNull
    public final AnimatorSet i(@NonNull vm.i iVar, float f11, float f12, float f13) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f31402w, (Property<FloatingActionButton, Float>) View.ALPHA, f11);
        iVar.h("opacity").a(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f31402w, (Property<FloatingActionButton, Float>) View.SCALE_X, f12);
        iVar.h("scale").a(ofFloat2);
        l0(ofFloat2);
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f31402w, (Property<FloatingActionButton, Float>) View.SCALE_Y, f12);
        iVar.h("scale").a(ofFloat3);
        l0(ofFloat3);
        arrayList.add(ofFloat3);
        h(f13, this.B);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this.f31402w, new vm.g(), new c(), new Matrix(this.B));
        iVar.h("iconScale").a(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        vm.c.a(animatorSet, arrayList);
        return animatorSet;
    }

    public final void i0() {
        V(this.f31396q);
    }

    public final AnimatorSet j(float f11, float f12, float f13, int i11, int i12) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new d(this.f31402w.getAlpha(), f11, this.f31402w.getScaleX(), f12, this.f31402w.getScaleY(), this.f31396q, f13, new Matrix(this.B)));
        arrayList.add(ofFloat);
        vm.c.a(animatorSet, arrayList);
        animatorSet.setDuration(pn.j.f(this.f31402w.getContext(), i11, this.f31402w.getContext().getResources().getInteger(R.integer.material_motion_duration_long_1)));
        animatorSet.setInterpolator(pn.j.g(this.f31402w.getContext(), i12, vm.b.f94061b));
        return animatorSet;
    }

    public final void j0() {
        Rect rect = this.f31404y;
        s(rect);
        H(rect);
        this.f31403x.setShadowPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    @NonNull
    public final ValueAnimator k(@NonNull m mVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(D);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(mVar);
        valueAnimator.addUpdateListener(mVar);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    public void k0(float f11) {
        vn.k kVar = this.f31381b;
        if (kVar != null) {
            kVar.o0(f11);
        }
    }

    public vn.k l() {
        return new vn.k((p) Preconditions.checkNotNull(this.f31380a));
    }

    public final void l0(ObjectAnimator objectAnimator) {
        if (Build.VERSION.SDK_INT != 26) {
            return;
        }
        objectAnimator.setEvaluator(new e());
    }

    @Nullable
    public final Drawable m() {
        return this.f31384e;
    }

    public float n() {
        return this.f31387h;
    }

    public boolean o() {
        return this.f31385f;
    }

    @Nullable
    public final vm.i p() {
        return this.f31394o;
    }

    public float q() {
        return this.f31388i;
    }

    @NonNull
    public final ViewTreeObserver.OnPreDrawListener r() {
        if (this.C == null) {
            this.C = new f();
        }
        return this.C;
    }

    public void s(@NonNull Rect rect) {
        int w11 = w();
        int max = Math.max(w11, (int) Math.ceil(this.f31386g ? n() + this.f31389j : 0.0f));
        int max2 = Math.max(w11, (int) Math.ceil(r1 * 1.5f));
        rect.set(max, max2, max, max2);
    }

    public float t() {
        return this.f31389j;
    }

    @Nullable
    public final p u() {
        return this.f31380a;
    }

    @Nullable
    public final vm.i v() {
        return this.f31393n;
    }

    public int w() {
        if (this.f31385f) {
            return Math.max((this.f31390k - this.f31402w.getSizeDimension()) / 2, 0);
        }
        return 0;
    }

    public void x(@Nullable k kVar, boolean z11) {
        a aVar;
        AnimatorSet j11;
        if (z()) {
            return;
        }
        Animator animator = this.f31392m;
        if (animator != null) {
            animator.cancel();
        }
        if (!e0()) {
            this.f31402w.c(z11 ? 8 : 4, z11);
            if (kVar != null) {
                kVar.b();
                return;
            }
            return;
        }
        vm.i iVar = this.f31394o;
        if (iVar != null) {
            j11 = i(iVar, 0.0f, 0.0f, 0.0f);
            aVar = this;
        } else {
            aVar = this;
            j11 = aVar.j(0.0f, 0.4f, 0.4f, U, V);
        }
        j11.addListener(new C0374a(z11, kVar));
        ArrayList<Animator.AnimatorListener> arrayList = aVar.f31400u;
        if (arrayList != null) {
            Iterator<Animator.AnimatorListener> it = arrayList.iterator();
            while (it.hasNext()) {
                j11.addListener(it.next());
            }
        }
        j11.start();
    }

    public void y(ColorStateList colorStateList, @Nullable PorterDuff.Mode mode, ColorStateList colorStateList2, int i11) {
        vn.k l11 = l();
        this.f31381b = l11;
        l11.setTintList(colorStateList);
        if (mode != null) {
            this.f31381b.setTintMode(mode);
        }
        this.f31381b.w0(-12303292);
        this.f31381b.a0(this.f31402w.getContext());
        tn.a aVar = new tn.a(this.f31381b.getShapeAppearanceModel());
        aVar.setTintList(tn.b.e(colorStateList2));
        this.f31382c = aVar;
        this.f31384e = new LayerDrawable(new Drawable[]{(Drawable) Preconditions.checkNotNull(this.f31381b), aVar});
    }

    public boolean z() {
        return this.f31402w.getVisibility() == 0 ? this.f31398s == 1 : this.f31398s != 2;
    }

    public void D() {
    }
}

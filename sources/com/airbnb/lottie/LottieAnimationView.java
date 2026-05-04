package com.airbnb.lottie;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.annotation.AttrRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RawRes;
import androidx.annotation.RequiresApi;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatImageView;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class LottieAnimationView extends AppCompatImageView {

    /* renamed from: o, reason: collision with root package name */
    public static final String f9879o = "LottieAnimationView";

    /* renamed from: p, reason: collision with root package name */
    public static final q0<Throwable> f9880p = new q0() { // from class: com.airbnb.lottie.i
        @Override // com.airbnb.lottie.q0
        public final void onResult(Object obj) {
            LottieAnimationView.b((Throwable) obj);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final q0<k> f9881a;

    /* renamed from: b, reason: collision with root package name */
    public final q0<Throwable> f9882b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    public q0<Throwable> f9883c;

    /* renamed from: d, reason: collision with root package name */
    @DrawableRes
    public int f9884d;

    /* renamed from: e, reason: collision with root package name */
    public final o0 f9885e;

    /* renamed from: f, reason: collision with root package name */
    public String f9886f;

    /* renamed from: g, reason: collision with root package name */
    @RawRes
    public int f9887g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f9888h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f9889i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f9890j;

    /* renamed from: k, reason: collision with root package name */
    public final Set<c> f9891k;

    /* renamed from: l, reason: collision with root package name */
    public final Set<s0> f9892l;

    /* renamed from: m, reason: collision with root package name */
    @Nullable
    public w0<k> f9893m;

    /* renamed from: n, reason: collision with root package name */
    @Nullable
    public k f9894n;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public String f9895a;

        /* renamed from: b, reason: collision with root package name */
        public int f9896b;

        /* renamed from: c, reason: collision with root package name */
        public float f9897c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f9898d;

        /* renamed from: e, reason: collision with root package name */
        public String f9899e;

        /* renamed from: f, reason: collision with root package name */
        public int f9900f;

        /* renamed from: g, reason: collision with root package name */
        public int f9901g;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i11) {
                return new SavedState[i11];
            }
        }

        public /* synthetic */ SavedState(Parcel parcel, a aVar) {
            this(parcel);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            parcel.writeString(this.f9895a);
            parcel.writeFloat(this.f9897c);
            parcel.writeInt(this.f9898d ? 1 : 0);
            parcel.writeString(this.f9899e);
            parcel.writeInt(this.f9900f);
            parcel.writeInt(this.f9901g);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f9895a = parcel.readString();
            this.f9897c = parcel.readFloat();
            this.f9898d = parcel.readInt() == 1;
            this.f9899e = parcel.readString();
            this.f9900f = parcel.readInt();
            this.f9901g = parcel.readInt();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements q0<Throwable> {
        public a() {
        }

        @Override // com.airbnb.lottie.q0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResult(Throwable th2) {
            if (LottieAnimationView.this.f9884d != 0) {
                LottieAnimationView lottieAnimationView = LottieAnimationView.this;
                lottieAnimationView.setImageResource(lottieAnimationView.f9884d);
            }
            (LottieAnimationView.this.f9883c == null ? LottieAnimationView.f9880p : LottieAnimationView.this.f9883c).onResult(th2);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b<T> extends k1.j<T> {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ k1.l f9903d;

        public b(k1.l lVar) {
            this.f9903d = lVar;
        }

        @Override // k1.j
        public T a(k1.b<T> bVar) {
            return (T) this.f9903d.a(bVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum c {
        SET_ANIMATION,
        SET_PROGRESS,
        SET_REPEAT_MODE,
        SET_REPEAT_COUNT,
        SET_IMAGE_ASSETS,
        PLAY_OPTION
    }

    public LottieAnimationView(Context context) {
        super(context);
        this.f9881a = new q0() { // from class: com.airbnb.lottie.g
            @Override // com.airbnb.lottie.q0
            public final void onResult(Object obj) {
                LottieAnimationView.this.setComposition((k) obj);
            }
        };
        this.f9882b = new a();
        this.f9884d = 0;
        this.f9885e = new o0();
        this.f9888h = false;
        this.f9889i = false;
        this.f9890j = true;
        this.f9891k = new HashSet();
        this.f9892l = new HashSet();
        v(null, R.attr.lottieAnimationViewStyle);
    }

    public static /* synthetic */ u0 a(LottieAnimationView lottieAnimationView, String str) {
        return lottieAnimationView.f9890j ? x.q(lottieAnimationView.getContext(), str) : x.r(lottieAnimationView.getContext(), str, null);
    }

    public static /* synthetic */ void b(Throwable th2) {
        if (!j1.j.k(th2)) {
            throw new IllegalStateException("Unable to parse composition", th2);
        }
        j1.f.f("Unable to load composition.", th2);
    }

    public static /* synthetic */ u0 c(LottieAnimationView lottieAnimationView, int i11) {
        return lottieAnimationView.f9890j ? x.E(lottieAnimationView.getContext(), i11) : x.F(lottieAnimationView.getContext(), i11, null);
    }

    private void setCompositionTask(w0<k> w0Var) {
        this.f9891k.add(c.SET_ANIMATION);
        o();
        n();
        this.f9893m = w0Var.d(this.f9881a).c(this.f9882b);
    }

    @MainThread
    public void A() {
        this.f9891k.add(c.PLAY_OPTION);
        this.f9885e.q0();
    }

    public void B() {
        this.f9885e.r0();
    }

    public void C() {
        this.f9892l.clear();
    }

    public void D() {
        this.f9885e.s0();
    }

    public void E(Animator.AnimatorListener animatorListener) {
        this.f9885e.t0(animatorListener);
    }

    @RequiresApi(api = 19)
    public void F(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f9885e.u0(animatorPauseListener);
    }

    public boolean G(@NonNull s0 s0Var) {
        return this.f9892l.remove(s0Var);
    }

    public void H(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f9885e.v0(animatorUpdateListener);
    }

    public List<c1.d> I(c1.d dVar) {
        return this.f9885e.x0(dVar);
    }

    @MainThread
    public void J() {
        this.f9891k.add(c.PLAY_OPTION);
        this.f9885e.y0();
    }

    public void K() {
        this.f9885e.z0();
    }

    public void L(InputStream inputStream, @Nullable String str) {
        setCompositionTask(x.t(inputStream, str));
    }

    public void M(String str, @Nullable String str2) {
        L(new ByteArrayInputStream(str.getBytes()), str2);
    }

    public void N(String str, @Nullable String str2) {
        setCompositionTask(x.H(getContext(), str, str2));
    }

    public final void O() {
        boolean w11 = w();
        setImageDrawable(null);
        setImageDrawable(this.f9885e);
        if (w11) {
            this.f9885e.y0();
        }
    }

    public void P(int i11, int i12) {
        this.f9885e.N0(i11, i12);
    }

    public void Q(String str, String str2, boolean z11) {
        this.f9885e.P0(str, str2, z11);
    }

    public void R(@FloatRange(from = 0.0d, to = 1.0d) float f11, @FloatRange(from = 0.0d, to = 1.0d) float f12) {
        this.f9885e.Q0(f11, f12);
    }

    @Nullable
    public Bitmap S(String str, @Nullable Bitmap bitmap) {
        return this.f9885e.e1(str, bitmap);
    }

    public void g(Animator.AnimatorListener animatorListener) {
        this.f9885e.r(animatorListener);
    }

    public boolean getClipToCompositionBounds() {
        return this.f9885e.M();
    }

    @Nullable
    public k getComposition() {
        return this.f9894n;
    }

    public long getDuration() {
        k kVar = this.f9894n;
        if (kVar != null) {
            return (long) kVar.d();
        }
        return 0L;
    }

    public int getFrame() {
        return this.f9885e.Q();
    }

    @Nullable
    public String getImageAssetsFolder() {
        return this.f9885e.T();
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.f9885e.V();
    }

    public float getMaxFrame() {
        return this.f9885e.W();
    }

    public float getMinFrame() {
        return this.f9885e.X();
    }

    @Nullable
    public y0 getPerformanceTracker() {
        return this.f9885e.Y();
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public float getProgress() {
        return this.f9885e.Z();
    }

    public RenderMode getRenderMode() {
        return this.f9885e.a0();
    }

    public int getRepeatCount() {
        return this.f9885e.b0();
    }

    public int getRepeatMode() {
        return this.f9885e.c0();
    }

    public float getSpeed() {
        return this.f9885e.d0();
    }

    @RequiresApi(api = 19)
    public void h(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f9885e.s(animatorPauseListener);
    }

    public void i(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f9885e.t(animatorUpdateListener);
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        Drawable drawable = getDrawable();
        if ((drawable instanceof o0) && ((o0) drawable).a0() == RenderMode.SOFTWARE) {
            this.f9885e.invalidateSelf();
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@NonNull Drawable drawable) {
        Drawable drawable2 = getDrawable();
        o0 o0Var = this.f9885e;
        if (drawable2 == o0Var) {
            super.invalidateDrawable(o0Var);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    public boolean j(@NonNull s0 s0Var) {
        k kVar = this.f9894n;
        if (kVar != null) {
            s0Var.b(kVar);
        }
        return this.f9892l.add(s0Var);
    }

    public <T> void k(c1.d dVar, T t11, k1.j<T> jVar) {
        this.f9885e.u(dVar, t11, jVar);
    }

    public <T> void l(c1.d dVar, T t11, k1.l<T> lVar) {
        this.f9885e.u(dVar, t11, new b(lVar));
    }

    @MainThread
    public void m() {
        this.f9891k.add(c.PLAY_OPTION);
        this.f9885e.y();
    }

    public final void n() {
        w0<k> w0Var = this.f9893m;
        if (w0Var != null) {
            w0Var.i(this.f9881a);
            this.f9893m.h(this.f9882b);
        }
    }

    public final void o() {
        this.f9894n = null;
        this.f9885e.z();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode() || !this.f9889i) {
            return;
        }
        this.f9885e.q0();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        int i11;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f9886f = savedState.f9895a;
        Set<c> set = this.f9891k;
        c cVar = c.SET_ANIMATION;
        if (!set.contains(cVar) && !TextUtils.isEmpty(this.f9886f)) {
            setAnimation(this.f9886f);
        }
        this.f9887g = savedState.f9896b;
        if (!this.f9891k.contains(cVar) && (i11 = this.f9887g) != 0) {
            setAnimation(i11);
        }
        if (!this.f9891k.contains(c.SET_PROGRESS)) {
            setProgress(savedState.f9897c);
        }
        if (!this.f9891k.contains(c.PLAY_OPTION) && savedState.f9898d) {
            A();
        }
        if (!this.f9891k.contains(c.SET_IMAGE_ASSETS)) {
            setImageAssetsFolder(savedState.f9899e);
        }
        if (!this.f9891k.contains(c.SET_REPEAT_MODE)) {
            setRepeatMode(savedState.f9900f);
        }
        if (this.f9891k.contains(c.SET_REPEAT_COUNT)) {
            return;
        }
        setRepeatCount(savedState.f9901g);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f9895a = this.f9886f;
        savedState.f9896b = this.f9887g;
        savedState.f9897c = this.f9885e.Z();
        savedState.f9898d = this.f9885e.k0();
        savedState.f9899e = this.f9885e.T();
        savedState.f9900f = this.f9885e.c0();
        savedState.f9901g = this.f9885e.b0();
        return savedState;
    }

    @Deprecated
    public void p() {
        this.f9885e.D();
    }

    public void q(boolean z11) {
        this.f9885e.G(z11);
    }

    public final w0<k> r(final String str) {
        return isInEditMode() ? new w0<>(new Callable() { // from class: com.airbnb.lottie.h
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return LottieAnimationView.a(LottieAnimationView.this, str);
            }
        }, true) : this.f9890j ? x.o(getContext(), str) : x.p(getContext(), str, null);
    }

    public final w0<k> s(@RawRes final int i11) {
        return isInEditMode() ? new w0<>(new Callable() { // from class: com.airbnb.lottie.j
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return LottieAnimationView.c(LottieAnimationView.this, i11);
            }
        }, true) : this.f9890j ? x.C(getContext(), i11) : x.D(getContext(), i11, null);
    }

    public void setAnimation(@RawRes int i11) {
        this.f9887g = i11;
        this.f9886f = null;
        setCompositionTask(s(i11));
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        M(str, null);
    }

    public void setAnimationFromUrl(String str) {
        setCompositionTask(this.f9890j ? x.G(getContext(), str) : x.H(getContext(), str, null));
    }

    public void setApplyingOpacityToLayersEnabled(boolean z11) {
        this.f9885e.B0(z11);
    }

    public void setCacheComposition(boolean z11) {
        this.f9890j = z11;
    }

    public void setClipToCompositionBounds(boolean z11) {
        this.f9885e.C0(z11);
    }

    public void setComposition(@NonNull k kVar) {
        if (e.f9935a) {
            Log.v(f9879o, "Set Composition \n" + kVar);
        }
        this.f9885e.setCallback(this);
        this.f9894n = kVar;
        this.f9888h = true;
        boolean D0 = this.f9885e.D0(kVar);
        this.f9888h = false;
        if (getDrawable() != this.f9885e || D0) {
            if (!D0) {
                O();
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            Iterator<s0> it = this.f9892l.iterator();
            while (it.hasNext()) {
                it.next().b(kVar);
            }
        }
    }

    public void setFailureListener(@Nullable q0<Throwable> q0Var) {
        this.f9883c = q0Var;
    }

    public void setFallbackResource(@DrawableRes int i11) {
        this.f9884d = i11;
    }

    public void setFontAssetDelegate(com.airbnb.lottie.c cVar) {
        this.f9885e.E0(cVar);
    }

    public void setFrame(int i11) {
        this.f9885e.F0(i11);
    }

    public void setIgnoreDisabledSystemAnimations(boolean z11) {
        this.f9885e.G0(z11);
    }

    public void setImageAssetDelegate(d dVar) {
        this.f9885e.H0(dVar);
    }

    public void setImageAssetsFolder(String str) {
        this.f9885e.I0(str);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        n();
        super.setImageBitmap(bitmap);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        n();
        super.setImageDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i11) {
        n();
        super.setImageResource(i11);
    }

    public void setMaintainOriginalImageBounds(boolean z11) {
        this.f9885e.J0(z11);
    }

    public void setMaxFrame(int i11) {
        this.f9885e.K0(i11);
    }

    public void setMaxProgress(@FloatRange(from = 0.0d, to = 1.0d) float f11) {
        this.f9885e.M0(f11);
    }

    public void setMinAndMaxFrame(String str) {
        this.f9885e.O0(str);
    }

    public void setMinFrame(int i11) {
        this.f9885e.R0(i11);
    }

    public void setMinProgress(float f11) {
        this.f9885e.T0(f11);
    }

    public void setOutlineMasksAndMattes(boolean z11) {
        this.f9885e.U0(z11);
    }

    public void setPerformanceTrackingEnabled(boolean z11) {
        this.f9885e.V0(z11);
    }

    public void setProgress(@FloatRange(from = 0.0d, to = 1.0d) float f11) {
        this.f9891k.add(c.SET_PROGRESS);
        this.f9885e.W0(f11);
    }

    public void setRenderMode(RenderMode renderMode) {
        this.f9885e.X0(renderMode);
    }

    public void setRepeatCount(int i11) {
        this.f9891k.add(c.SET_REPEAT_COUNT);
        this.f9885e.Y0(i11);
    }

    public void setRepeatMode(int i11) {
        this.f9891k.add(c.SET_REPEAT_MODE);
        this.f9885e.Z0(i11);
    }

    public void setSafeMode(boolean z11) {
        this.f9885e.a1(z11);
    }

    public void setSpeed(float f11) {
        this.f9885e.b1(f11);
    }

    public void setTextDelegate(a1 a1Var) {
        this.f9885e.d1(a1Var);
    }

    public boolean t() {
        return this.f9885e.g0();
    }

    public boolean u() {
        return this.f9885e.h0();
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        o0 o0Var;
        if (!this.f9888h && drawable == (o0Var = this.f9885e) && o0Var.j0()) {
            z();
        } else if (!this.f9888h && (drawable instanceof o0)) {
            o0 o0Var2 = (o0) drawable;
            if (o0Var2.j0()) {
                o0Var2.p0();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    public final void v(@Nullable AttributeSet attributeSet, @AttrRes int i11) {
        String string;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.LottieAnimationView, i11, 0);
        this.f9890j = obtainStyledAttributes.getBoolean(R.styleable.LottieAnimationView_lottie_cacheComposition, true);
        int i12 = R.styleable.LottieAnimationView_lottie_rawRes;
        boolean hasValue = obtainStyledAttributes.hasValue(i12);
        int i13 = R.styleable.LottieAnimationView_lottie_fileName;
        boolean hasValue2 = obtainStyledAttributes.hasValue(i13);
        int i14 = R.styleable.LottieAnimationView_lottie_url;
        boolean hasValue3 = obtainStyledAttributes.hasValue(i14);
        if (hasValue && hasValue2) {
            throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
        }
        if (hasValue) {
            int resourceId = obtainStyledAttributes.getResourceId(i12, 0);
            if (resourceId != 0) {
                setAnimation(resourceId);
            }
        } else if (hasValue2) {
            String string2 = obtainStyledAttributes.getString(i13);
            if (string2 != null) {
                setAnimation(string2);
            }
        } else if (hasValue3 && (string = obtainStyledAttributes.getString(i14)) != null) {
            setAnimationFromUrl(string);
        }
        setFallbackResource(obtainStyledAttributes.getResourceId(R.styleable.LottieAnimationView_lottie_fallbackRes, 0));
        if (obtainStyledAttributes.getBoolean(R.styleable.LottieAnimationView_lottie_autoPlay, false)) {
            this.f9889i = true;
        }
        if (obtainStyledAttributes.getBoolean(R.styleable.LottieAnimationView_lottie_loop, false)) {
            this.f9885e.Y0(-1);
        }
        int i15 = R.styleable.LottieAnimationView_lottie_repeatMode;
        if (obtainStyledAttributes.hasValue(i15)) {
            setRepeatMode(obtainStyledAttributes.getInt(i15, 1));
        }
        int i16 = R.styleable.LottieAnimationView_lottie_repeatCount;
        if (obtainStyledAttributes.hasValue(i16)) {
            setRepeatCount(obtainStyledAttributes.getInt(i16, -1));
        }
        int i17 = R.styleable.LottieAnimationView_lottie_speed;
        if (obtainStyledAttributes.hasValue(i17)) {
            setSpeed(obtainStyledAttributes.getFloat(i17, 1.0f));
        }
        int i18 = R.styleable.LottieAnimationView_lottie_clipToCompositionBounds;
        if (obtainStyledAttributes.hasValue(i18)) {
            setClipToCompositionBounds(obtainStyledAttributes.getBoolean(i18, true));
        }
        setImageAssetsFolder(obtainStyledAttributes.getString(R.styleable.LottieAnimationView_lottie_imageAssetsFolder));
        setProgress(obtainStyledAttributes.getFloat(R.styleable.LottieAnimationView_lottie_progress, 0.0f));
        q(obtainStyledAttributes.getBoolean(R.styleable.LottieAnimationView_lottie_enableMergePathsForKitKatAndAbove, false));
        int i19 = R.styleable.LottieAnimationView_lottie_colorFilter;
        if (obtainStyledAttributes.hasValue(i19)) {
            k(new c1.d("**"), t0.K, new k1.j(new z0(AppCompatResources.getColorStateList(getContext(), obtainStyledAttributes.getResourceId(i19, -1)).getDefaultColor())));
        }
        int i21 = R.styleable.LottieAnimationView_lottie_renderMode;
        if (obtainStyledAttributes.hasValue(i21)) {
            RenderMode renderMode = RenderMode.AUTOMATIC;
            int i22 = obtainStyledAttributes.getInt(i21, renderMode.ordinal());
            if (i22 >= RenderMode.values().length) {
                i22 = renderMode.ordinal();
            }
            setRenderMode(RenderMode.values()[i22]);
        }
        setIgnoreDisabledSystemAnimations(obtainStyledAttributes.getBoolean(R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, false));
        obtainStyledAttributes.recycle();
        this.f9885e.c1(Boolean.valueOf(j1.j.f(getContext()) != 0.0f));
    }

    public boolean w() {
        return this.f9885e.j0();
    }

    public boolean x() {
        return this.f9885e.n0();
    }

    @Deprecated
    public void y(boolean z11) {
        this.f9885e.Y0(z11 ? -1 : 0);
    }

    @MainThread
    public void z() {
        this.f9889i = false;
        this.f9885e.p0();
    }

    public void setMaxFrame(String str) {
        this.f9885e.L0(str);
    }

    public void setMinFrame(String str) {
        this.f9885e.S0(str);
    }

    public void setAnimation(String str) {
        this.f9886f = str;
        this.f9887g = 0;
        setCompositionTask(r(str));
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9881a = new q0() { // from class: com.airbnb.lottie.g
            @Override // com.airbnb.lottie.q0
            public final void onResult(Object obj) {
                LottieAnimationView.this.setComposition((k) obj);
            }
        };
        this.f9882b = new a();
        this.f9884d = 0;
        this.f9885e = new o0();
        this.f9888h = false;
        this.f9889i = false;
        this.f9890j = true;
        this.f9891k = new HashSet();
        this.f9892l = new HashSet();
        v(attributeSet, R.attr.lottieAnimationViewStyle);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f9881a = new q0() { // from class: com.airbnb.lottie.g
            @Override // com.airbnb.lottie.q0
            public final void onResult(Object obj) {
                LottieAnimationView.this.setComposition((k) obj);
            }
        };
        this.f9882b = new a();
        this.f9884d = 0;
        this.f9885e = new o0();
        this.f9888h = false;
        this.f9889i = false;
        this.f9890j = true;
        this.f9891k = new HashSet();
        this.f9892l = new HashSet();
        v(attributeSet, i11);
    }
}

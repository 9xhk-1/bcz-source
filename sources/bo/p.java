package bo;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.view.GravityCompat;
import androidx.transition.TransitionValues;
import com.google.android.material.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class p extends q<w> {

    /* renamed from: f, reason: collision with root package name */
    public static final int f7117f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static final int f7118g = 1;

    /* renamed from: h, reason: collision with root package name */
    public static final int f7119h = 2;

    /* renamed from: i, reason: collision with root package name */
    @AttrRes
    public static final int f7120i = R.attr.motionDurationLong1;

    /* renamed from: j, reason: collision with root package name */
    @AttrRes
    public static final int f7121j = R.attr.motionEasingEmphasizedInterpolator;

    /* renamed from: d, reason: collision with root package name */
    public final int f7122d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f7123e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface a {
    }

    public p(int i11, boolean z11) {
        super(n(i11, z11), o());
        this.f7122d = i11;
        this.f7123e = z11;
    }

    public static w n(int i11, boolean z11) {
        if (i11 == 0) {
            return new s(z11 ? GravityCompat.END : GravityCompat.START);
        }
        if (i11 == 1) {
            return new s(z11 ? 80 : 48);
        }
        if (i11 == 2) {
            return new r(z11);
        }
        throw new IllegalArgumentException("Invalid axis: " + i11);
    }

    private static w o() {
        return new e();
    }

    @Override // bo.q
    public /* bridge */ /* synthetic */ void a(@NonNull w wVar) {
        super.a(wVar);
    }

    @Override // bo.q
    public /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    @Override // bo.q
    @AttrRes
    public int f(boolean z11) {
        return f7120i;
    }

    @Override // bo.q
    @AttrRes
    public int g(boolean z11) {
        return f7121j;
    }

    @Override // bo.q
    @NonNull
    public /* bridge */ /* synthetic */ w h() {
        return super.h();
    }

    @Override // bo.q
    @Nullable
    public /* bridge */ /* synthetic */ w i() {
        return super.i();
    }

    @Override // bo.q, androidx.transition.Transition
    public /* bridge */ /* synthetic */ boolean isSeekingSupported() {
        return super.isSeekingSupported();
    }

    @Override // bo.q
    public /* bridge */ /* synthetic */ boolean l(@NonNull w wVar) {
        return super.l(wVar);
    }

    @Override // bo.q
    public /* bridge */ /* synthetic */ void m(@Nullable w wVar) {
        super.m(wVar);
    }

    @Override // bo.q, androidx.transition.Visibility
    public /* bridge */ /* synthetic */ Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return super.onAppear(viewGroup, view, transitionValues, transitionValues2);
    }

    @Override // bo.q, androidx.transition.Visibility
    public /* bridge */ /* synthetic */ Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
    }

    public int p() {
        return this.f7122d;
    }

    public boolean q() {
        return this.f7123e;
    }
}

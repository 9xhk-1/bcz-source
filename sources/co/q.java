package co;

import android.animation.Animator;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.view.GravityCompat;
import com.google.android.material.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(21)
/* loaded from: classes7.dex */
public final class q extends r<x> {

    /* renamed from: f, reason: collision with root package name */
    public static final int f9490f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static final int f9491g = 1;

    /* renamed from: h, reason: collision with root package name */
    public static final int f9492h = 2;

    /* renamed from: i, reason: collision with root package name */
    @AttrRes
    public static final int f9493i = R.attr.motionDurationLong1;

    /* renamed from: j, reason: collision with root package name */
    @AttrRes
    public static final int f9494j = R.attr.motionEasingEmphasizedInterpolator;

    /* renamed from: d, reason: collision with root package name */
    public final int f9495d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f9496e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface a {
    }

    public q(int i11, boolean z11) {
        super(n(i11, z11), o());
        this.f9495d = i11;
        this.f9496e = z11;
    }

    public static x n(int i11, boolean z11) {
        if (i11 == 0) {
            return new t(z11 ? GravityCompat.END : GravityCompat.START);
        }
        if (i11 == 1) {
            return new t(z11 ? 80 : 48);
        }
        if (i11 == 2) {
            return new s(z11);
        }
        throw new IllegalArgumentException("Invalid axis: " + i11);
    }

    private static x o() {
        return new e();
    }

    @Override // co.r
    public /* bridge */ /* synthetic */ void a(@NonNull x xVar) {
        super.a(xVar);
    }

    @Override // co.r
    public /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    @Override // co.r
    @AttrRes
    public int f(boolean z11) {
        return f9493i;
    }

    @Override // co.r
    @AttrRes
    public int g(boolean z11) {
        return f9494j;
    }

    @Override // co.r
    @NonNull
    public /* bridge */ /* synthetic */ x h() {
        return super.h();
    }

    @Override // co.r
    @Nullable
    public /* bridge */ /* synthetic */ x i() {
        return super.i();
    }

    @Override // co.r
    public /* bridge */ /* synthetic */ boolean l(@NonNull x xVar) {
        return super.l(xVar);
    }

    @Override // co.r
    public /* bridge */ /* synthetic */ void m(@Nullable x xVar) {
        super.m(xVar);
    }

    @Override // co.r, android.transition.Visibility
    public /* bridge */ /* synthetic */ Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return super.onAppear(viewGroup, view, transitionValues, transitionValues2);
    }

    @Override // co.r, android.transition.Visibility
    public /* bridge */ /* synthetic */ Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
    }

    public int p() {
        return this.f9495d;
    }

    public boolean q() {
        return this.f9496e;
    }
}

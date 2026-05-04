package co;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.material.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(21)
/* loaded from: classes7.dex */
public final class o extends r<d> {

    /* renamed from: d, reason: collision with root package name */
    public static final float f9481d = 0.8f;

    /* renamed from: e, reason: collision with root package name */
    public static final float f9482e = 0.3f;

    /* renamed from: f, reason: collision with root package name */
    @AttrRes
    public static final int f9483f = R.attr.motionDurationMedium4;

    /* renamed from: g, reason: collision with root package name */
    @AttrRes
    public static final int f9484g = R.attr.motionDurationShort3;

    /* renamed from: h, reason: collision with root package name */
    @AttrRes
    public static final int f9485h = R.attr.motionEasingEmphasizedDecelerateInterpolator;

    /* renamed from: i, reason: collision with root package name */
    @AttrRes
    public static final int f9486i = R.attr.motionEasingEmphasizedAccelerateInterpolator;

    public o() {
        super(n(), o());
    }

    public static d n() {
        d dVar = new d();
        dVar.e(0.3f);
        return dVar;
    }

    private static x o() {
        s sVar = new s();
        sVar.o(false);
        sVar.l(0.8f);
        return sVar;
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
    @NonNull
    public TimeInterpolator e(boolean z11) {
        return vm.b.f94060a;
    }

    @Override // co.r
    @AttrRes
    public int f(boolean z11) {
        return z11 ? f9483f : f9484g;
    }

    @Override // co.r
    @AttrRes
    public int g(boolean z11) {
        return z11 ? f9485h : f9486i;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [co.d, co.x] */
    @Override // co.r
    @NonNull
    public /* bridge */ /* synthetic */ d h() {
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
}

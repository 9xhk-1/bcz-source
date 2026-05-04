package bo;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.transition.TransitionValues;
import com.google.android.material.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class n extends q<d> {

    /* renamed from: d, reason: collision with root package name */
    public static final float f7108d = 0.8f;

    /* renamed from: e, reason: collision with root package name */
    public static final float f7109e = 0.3f;

    /* renamed from: f, reason: collision with root package name */
    @AttrRes
    public static final int f7110f = R.attr.motionDurationMedium4;

    /* renamed from: g, reason: collision with root package name */
    @AttrRes
    public static final int f7111g = R.attr.motionDurationShort3;

    /* renamed from: h, reason: collision with root package name */
    @AttrRes
    public static final int f7112h = R.attr.motionEasingEmphasizedDecelerateInterpolator;

    /* renamed from: i, reason: collision with root package name */
    @AttrRes
    public static final int f7113i = R.attr.motionEasingEmphasizedAccelerateInterpolator;

    public n() {
        super(n(), o());
    }

    public static d n() {
        d dVar = new d();
        dVar.e(0.3f);
        return dVar;
    }

    private static w o() {
        r rVar = new r();
        rVar.o(false);
        rVar.l(0.8f);
        return rVar;
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
    @NonNull
    public TimeInterpolator e(boolean z11) {
        return vm.b.f94060a;
    }

    @Override // bo.q
    @AttrRes
    public int f(boolean z11) {
        return z11 ? f7110f : f7111g;
    }

    @Override // bo.q
    @AttrRes
    public int g(boolean z11) {
        return z11 ? f7112h : f7113i;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [bo.d, bo.w] */
    @Override // bo.q
    @NonNull
    public /* bridge */ /* synthetic */ d h() {
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
}

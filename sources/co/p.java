package co;

import android.animation.Animator;
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
public final class p extends r<e> {

    /* renamed from: d, reason: collision with root package name */
    public static final float f9487d = 0.92f;

    /* renamed from: e, reason: collision with root package name */
    @AttrRes
    public static final int f9488e = R.attr.motionDurationLong1;

    /* renamed from: f, reason: collision with root package name */
    @AttrRes
    public static final int f9489f = R.attr.motionEasingEmphasizedInterpolator;

    public p() {
        super(n(), o());
    }

    public static e n() {
        return new e();
    }

    private static x o() {
        s sVar = new s();
        sVar.o(false);
        sVar.l(0.92f);
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
    @AttrRes
    public int f(boolean z11) {
        return f9488e;
    }

    @Override // co.r
    @AttrRes
    public int g(boolean z11) {
        return f9489f;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [co.e, co.x] */
    @Override // co.r
    @NonNull
    public /* bridge */ /* synthetic */ e h() {
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

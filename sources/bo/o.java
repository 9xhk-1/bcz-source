package bo;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.transition.TransitionValues;
import com.google.android.material.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class o extends q<e> {

    /* renamed from: d, reason: collision with root package name */
    public static final float f7114d = 0.92f;

    /* renamed from: e, reason: collision with root package name */
    @AttrRes
    public static final int f7115e = R.attr.motionDurationLong1;

    /* renamed from: f, reason: collision with root package name */
    @AttrRes
    public static final int f7116f = R.attr.motionEasingEmphasizedInterpolator;

    public o() {
        super(n(), o());
    }

    public static e n() {
        return new e();
    }

    private static w o() {
        r rVar = new r();
        rVar.o(false);
        rVar.l(0.92f);
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
    @AttrRes
    public int f(boolean z11) {
        return f7115e;
    }

    @Override // bo.q
    @AttrRes
    public int g(boolean z11) {
        return f7116f;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [bo.e, bo.w] */
    @Override // bo.q
    @NonNull
    public /* bridge */ /* synthetic */ e h() {
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

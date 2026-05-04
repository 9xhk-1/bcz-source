package co;

import android.animation.Animator;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(21)
/* loaded from: classes7.dex */
public final class n extends r<s> {

    /* renamed from: e, reason: collision with root package name */
    public static final float f9479e = 0.85f;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f9480d;

    public n(boolean z11) {
        super(n(z11), o());
        this.f9480d = z11;
    }

    public static s n(boolean z11) {
        s sVar = new s(z11);
        sVar.m(0.85f);
        sVar.l(0.85f);
        return sVar;
    }

    public static x o() {
        return new d();
    }

    @Override // co.r
    public /* bridge */ /* synthetic */ void a(@NonNull x xVar) {
        super.a(xVar);
    }

    @Override // co.r
    public /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [co.s, co.x] */
    @Override // co.r
    @NonNull
    public /* bridge */ /* synthetic */ s h() {
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

    public boolean p() {
        return this.f9480d;
    }
}

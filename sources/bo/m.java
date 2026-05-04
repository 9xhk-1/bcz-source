package bo;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.transition.TransitionValues;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class m extends q<r> {

    /* renamed from: e, reason: collision with root package name */
    public static final float f7106e = 0.85f;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f7107d;

    public m(boolean z11) {
        super(n(z11), o());
        this.f7107d = z11;
    }

    public static r n(boolean z11) {
        r rVar = new r(z11);
        rVar.m(0.85f);
        rVar.l(0.85f);
        return rVar;
    }

    public static w o() {
        return new d();
    }

    @Override // bo.q
    public /* bridge */ /* synthetic */ void a(@NonNull w wVar) {
        super.a(wVar);
    }

    @Override // bo.q
    public /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [bo.r, bo.w] */
    @Override // bo.q
    @NonNull
    public /* bridge */ /* synthetic */ r h() {
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

    public boolean p() {
        return this.f7107d;
    }
}

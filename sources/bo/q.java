package bo;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.transition.TransitionValues;
import androidx.transition.Visibility;
import bo.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class q<P extends w> extends Visibility {

    /* renamed from: a, reason: collision with root package name */
    public final P f7124a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    public w f7125b;

    /* renamed from: c, reason: collision with root package name */
    public final List<w> f7126c = new ArrayList();

    public q(P p11, @Nullable w wVar) {
        this.f7124a = p11;
        this.f7125b = wVar;
    }

    public static void b(List<Animator> list, @Nullable w wVar, ViewGroup viewGroup, View view, boolean z11) {
        if (wVar == null) {
            return;
        }
        Animator b11 = z11 ? wVar.b(viewGroup, view) : wVar.a(viewGroup, view);
        if (b11 != null) {
            list.add(b11);
        }
    }

    public void a(@NonNull w wVar) {
        this.f7126c.add(wVar);
    }

    public void c() {
        this.f7126c.clear();
    }

    public final Animator d(@NonNull ViewGroup viewGroup, @NonNull View view, boolean z11) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        b(arrayList, this.f7124a, viewGroup, view, z11);
        b(arrayList, this.f7125b, viewGroup, view, z11);
        Iterator<w> it = this.f7126c.iterator();
        while (it.hasNext()) {
            b(arrayList, it.next(), viewGroup, view, z11);
        }
        j(viewGroup.getContext(), z11);
        vm.c.a(animatorSet, arrayList);
        return animatorSet;
    }

    @NonNull
    public TimeInterpolator e(boolean z11) {
        return vm.b.f94061b;
    }

    @AttrRes
    public int f(boolean z11) {
        return 0;
    }

    @AttrRes
    public int g(boolean z11) {
        return 0;
    }

    @NonNull
    public P h() {
        return this.f7124a;
    }

    @Nullable
    public w i() {
        return this.f7125b;
    }

    @Override // androidx.transition.Transition
    public boolean isSeekingSupported() {
        return true;
    }

    public final void j(@NonNull Context context, boolean z11) {
        v.r(this, context, f(z11));
        v.s(this, context, g(z11), e(z11));
    }

    public boolean l(@NonNull w wVar) {
        return this.f7126c.remove(wVar);
    }

    public void m(@Nullable w wVar) {
        this.f7125b = wVar;
    }

    @Override // androidx.transition.Visibility
    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return d(viewGroup, view, true);
    }

    @Override // androidx.transition.Visibility
    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return d(viewGroup, view, false);
    }
}

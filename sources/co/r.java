package co;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import co.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(21)
/* loaded from: classes7.dex */
public abstract class r<P extends x> extends Visibility {

    /* renamed from: a, reason: collision with root package name */
    public final P f9497a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    public x f9498b;

    /* renamed from: c, reason: collision with root package name */
    public final List<x> f9499c = new ArrayList();

    public r(P p11, @Nullable x xVar) {
        this.f9497a = p11;
        this.f9498b = xVar;
    }

    public static void b(List<Animator> list, @Nullable x xVar, ViewGroup viewGroup, View view, boolean z11) {
        if (xVar == null) {
            return;
        }
        Animator b11 = z11 ? xVar.b(viewGroup, view) : xVar.a(viewGroup, view);
        if (b11 != null) {
            list.add(b11);
        }
    }

    public void a(@NonNull x xVar) {
        this.f9499c.add(xVar);
    }

    public void c() {
        this.f9499c.clear();
    }

    public final Animator d(@NonNull ViewGroup viewGroup, @NonNull View view, boolean z11) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        b(arrayList, this.f9497a, viewGroup, view, z11);
        b(arrayList, this.f9498b, viewGroup, view, z11);
        Iterator<x> it = this.f9499c.iterator();
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
        return this.f9497a;
    }

    @Nullable
    public x i() {
        return this.f9498b;
    }

    public final void j(@NonNull Context context, boolean z11) {
        w.r(this, context, f(z11));
        w.s(this, context, g(z11), e(z11));
    }

    public boolean l(@NonNull x xVar) {
        return this.f9499c.remove(xVar);
    }

    public void m(@Nullable x xVar) {
        this.f9498b = xVar;
    }

    @Override // android.transition.Visibility
    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return d(viewGroup, view, true);
    }

    @Override // android.transition.Visibility
    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return d(viewGroup, view, false);
    }
}

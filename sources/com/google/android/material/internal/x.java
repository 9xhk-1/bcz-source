package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.util.StateSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes7.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList<b> f31672a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    public b f31673b = null;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    public ValueAnimator f31674c = null;

    /* renamed from: d, reason: collision with root package name */
    public final Animator.AnimatorListener f31675d = new a();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            x xVar = x.this;
            if (xVar.f31674c == animator) {
                xVar.f31674c = null;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final int[] f31677a;

        /* renamed from: b, reason: collision with root package name */
        public final ValueAnimator f31678b;

        public b(int[] iArr, ValueAnimator valueAnimator) {
            this.f31677a = iArr;
            this.f31678b = valueAnimator;
        }
    }

    public void a(int[] iArr, ValueAnimator valueAnimator) {
        b bVar = new b(iArr, valueAnimator);
        valueAnimator.addListener(this.f31675d);
        this.f31672a.add(bVar);
    }

    public final void b() {
        ValueAnimator valueAnimator = this.f31674c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f31674c = null;
        }
    }

    public void c() {
        ValueAnimator valueAnimator = this.f31674c;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.f31674c = null;
        }
    }

    public void d(int[] iArr) {
        b bVar;
        int size = this.f31672a.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                bVar = null;
                break;
            }
            bVar = this.f31672a.get(i11);
            if (StateSet.stateSetMatches(bVar.f31677a, iArr)) {
                break;
            } else {
                i11++;
            }
        }
        b bVar2 = this.f31673b;
        if (bVar == bVar2) {
            return;
        }
        if (bVar2 != null) {
            b();
        }
        this.f31673b = bVar;
        if (bVar != null) {
            e(bVar);
        }
    }

    public final void e(@NonNull b bVar) {
        ValueAnimator valueAnimator = bVar.f31678b;
        this.f31674c = valueAnimator;
        valueAnimator.start();
    }
}

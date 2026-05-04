package androidx.core.transition;

import android.transition.Transition;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$listener$1\n*L\n1#1,76:1\n*E\n"})
/* loaded from: classes2.dex */
public final class TransitionKt$addListener$listener$1 implements Transition.TransitionListener {
    final /* synthetic */ l<Transition, g2> $onCancel;
    final /* synthetic */ l<Transition, g2> $onEnd;
    final /* synthetic */ l<Transition, g2> $onPause;
    final /* synthetic */ l<Transition, g2> $onResume;
    final /* synthetic */ l<Transition, g2> $onStart;

    /* JADX WARN: Multi-variable type inference failed */
    public TransitionKt$addListener$listener$1(l<? super Transition, g2> lVar, l<? super Transition, g2> lVar2, l<? super Transition, g2> lVar3, l<? super Transition, g2> lVar4, l<? super Transition, g2> lVar5) {
        this.$onEnd = lVar;
        this.$onResume = lVar2;
        this.$onPause = lVar3;
        this.$onCancel = lVar4;
        this.$onStart = lVar5;
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionCancel(@k Transition transition) {
        this.$onCancel.invoke(transition);
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionEnd(@k Transition transition) {
        this.$onEnd.invoke(transition);
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionPause(@k Transition transition) {
        this.$onPause.invoke(transition);
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionResume(@k Transition transition) {
        this.$onResume.invoke(transition);
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionStart(@k Transition transition) {
        this.$onStart.invoke(transition);
    }
}

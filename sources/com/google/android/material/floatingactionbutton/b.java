package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import androidx.annotation.AnimatorRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import java.util.List;
import vm.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public interface b {
    i a();

    void b();

    @Nullable
    i c();

    boolean d();

    void e(@NonNull Animator.AnimatorListener animatorListener);

    void f(@Nullable i iVar);

    @AnimatorRes
    int g();

    List<Animator.AnimatorListener> getListeners();

    AnimatorSet h();

    void i(@Nullable ExtendedFloatingActionButton.l lVar);

    void j();

    void k();

    void l(@NonNull Animator.AnimatorListener animatorListener);

    void onAnimationStart(Animator animator);
}

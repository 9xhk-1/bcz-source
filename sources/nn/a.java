package nn;

import android.animation.Animator;
import androidx.annotation.Nullable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    public Animator f75186a;

    public void a() {
        Animator animator = this.f75186a;
        if (animator != null) {
            animator.cancel();
        }
    }

    public void b() {
        this.f75186a = null;
    }

    public void c(Animator animator) {
        a();
        this.f75186a = animator;
    }
}

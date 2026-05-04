package rn;

import android.animation.Animator;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import java.util.ArrayList;
import java.util.List;
import rn.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class h<T extends Animator> {

    /* renamed from: a, reason: collision with root package name */
    public i f84390a;

    /* renamed from: b, reason: collision with root package name */
    public final List<g.a> f84391b = new ArrayList();

    public h(int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            this.f84391b.add(new g.a());
        }
    }

    public abstract void a();

    public float b(int i11, int i12, int i13) {
        return (i11 - i12) / i13;
    }

    public abstract void c();

    public abstract void d(@NonNull Animatable2Compat.AnimationCallback animationCallback);

    public void e(@NonNull i iVar) {
        this.f84390a = iVar;
    }

    public abstract void f();

    @VisibleForTesting
    public abstract void g();

    @VisibleForTesting
    public abstract void h(float f11);

    public abstract void i();

    public abstract void j();
}

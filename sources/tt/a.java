package tt;

import android.animation.Animator;
import android.animation.ValueAnimator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import qt.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public abstract class a<T extends Animator> {

    /* renamed from: d, reason: collision with root package name */
    public static final int f90880d = 350;

    /* renamed from: b, reason: collision with root package name */
    public b.a f90882b;

    /* renamed from: a, reason: collision with root package name */
    public long f90881a = 350;

    /* renamed from: c, reason: collision with root package name */
    public T f90883c = a();

    public a(@Nullable b.a aVar) {
        this.f90882b = aVar;
    }

    @NonNull
    public abstract T a();

    /* renamed from: b */
    public a j(long j11) {
        this.f90881a = j11;
        T t11 = this.f90883c;
        if (t11 instanceof ValueAnimator) {
            t11.setDuration(j11);
        }
        return this;
    }

    public void c() {
        T t11 = this.f90883c;
        if (t11 == null || !t11.isStarted()) {
            return;
        }
        this.f90883c.end();
    }

    /* renamed from: d */
    public abstract a m(float f11);

    public void e() {
        T t11 = this.f90883c;
        if (t11 == null || t11.isRunning()) {
            return;
        }
        this.f90883c.start();
    }
}

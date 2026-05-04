package vm;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public long f94076a;

    /* renamed from: b, reason: collision with root package name */
    public long f94077b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    public TimeInterpolator f94078c;

    /* renamed from: d, reason: collision with root package name */
    public int f94079d;

    /* renamed from: e, reason: collision with root package name */
    public int f94080e;

    public j(long j11, long j12) {
        this.f94078c = null;
        this.f94079d = 0;
        this.f94080e = 1;
        this.f94076a = j11;
        this.f94077b = j12;
    }

    @NonNull
    public static j b(@NonNull ValueAnimator valueAnimator) {
        j jVar = new j(valueAnimator.getStartDelay(), valueAnimator.getDuration(), f(valueAnimator));
        jVar.f94079d = valueAnimator.getRepeatCount();
        jVar.f94080e = valueAnimator.getRepeatMode();
        return jVar;
    }

    public static TimeInterpolator f(@NonNull ValueAnimator valueAnimator) {
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        return ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) ? b.f94061b : interpolator instanceof AccelerateInterpolator ? b.f94062c : interpolator instanceof DecelerateInterpolator ? b.f94063d : interpolator;
    }

    public void a(@NonNull Animator animator) {
        animator.setStartDelay(c());
        animator.setDuration(d());
        animator.setInterpolator(e());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(g());
            valueAnimator.setRepeatMode(h());
        }
    }

    public long c() {
        return this.f94076a;
    }

    public long d() {
        return this.f94077b;
    }

    @Nullable
    public TimeInterpolator e() {
        TimeInterpolator timeInterpolator = this.f94078c;
        return timeInterpolator != null ? timeInterpolator : b.f94061b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (c() == jVar.c() && d() == jVar.d() && g() == jVar.g() && h() == jVar.h()) {
            return e().getClass().equals(jVar.e().getClass());
        }
        return false;
    }

    public int g() {
        return this.f94079d;
    }

    public int h() {
        return this.f94080e;
    }

    public int hashCode() {
        return (((((((((int) (c() ^ (c() >>> 32))) * 31) + ((int) (d() ^ (d() >>> 32)))) * 31) + e().getClass().hashCode()) * 31) + g()) * 31) + h();
    }

    @NonNull
    public String toString() {
        return '\n' + getClass().getName() + l50.b.f69927i + Integer.toHexString(System.identityHashCode(this)) + " delay: " + c() + " duration: " + d() + " interpolator: " + e().getClass() + " repeatCount: " + g() + " repeatMode: " + h() + "}\n";
    }

    public j(long j11, long j12, @NonNull TimeInterpolator timeInterpolator) {
        this.f94079d = 0;
        this.f94080e = 1;
        this.f94076a = j11;
        this.f94077b = j12;
        this.f94078c = timeInterpolator;
    }
}

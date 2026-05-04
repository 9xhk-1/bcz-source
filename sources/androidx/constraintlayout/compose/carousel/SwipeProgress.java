package androidx.constraintlayout.compose.carousel;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
/* loaded from: classes2.dex */
public final class SwipeProgress<T> {
    public static final int $stable = 0;
    private final float fraction;
    private final T from;

    /* renamed from: to, reason: collision with root package name */
    private final T f4250to;

    public SwipeProgress(T t11, T t12, float f11) {
        this.from = t11;
        this.f4250to = t12;
        this.fraction = f11;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SwipeProgress)) {
            return false;
        }
        SwipeProgress swipeProgress = (SwipeProgress) obj;
        return g0.g(this.from, swipeProgress.from) && g0.g(this.f4250to, swipeProgress.f4250to) && this.fraction == swipeProgress.fraction;
    }

    public final float getFraction() {
        return this.fraction;
    }

    public final T getFrom() {
        return this.from;
    }

    public final T getTo() {
        return this.f4250to;
    }

    public int hashCode() {
        T t11 = this.from;
        int hashCode = (t11 != null ? t11.hashCode() : 0) * 31;
        T t12 = this.f4250to;
        return ((hashCode + (t12 != null ? t12.hashCode() : 0)) * 31) + Float.hashCode(this.fraction);
    }

    @k
    public String toString() {
        return "SwipeProgress(from=" + this.from + ", to=" + this.f4250to + ", fraction=" + this.fraction + ')';
    }
}

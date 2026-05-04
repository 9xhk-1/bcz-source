package androidx.compose.ui.graphics;

import androidx.annotation.RestrictTo;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class Interval<T> {

    @m80.l
    private final T data;
    private final float end;
    private final float start;

    public Interval(float f11, float f12, @m80.l T t11) {
        this.start = f11;
        this.end = f12;
        this.data = t11;
    }

    public final boolean contains(float f11) {
        return f11 <= this.end && this.start <= f11;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Interval interval = (Interval) obj;
            return this.start == interval.start && this.end == interval.end && kotlin.jvm.internal.g0.g(this.data, interval.data);
        }
        return false;
    }

    @m80.l
    public final T getData() {
        return this.data;
    }

    public final float getEnd() {
        return this.end;
    }

    public final float getStart() {
        return this.start;
    }

    public int hashCode() {
        int hashCode = ((Float.hashCode(this.start) * 31) + Float.hashCode(this.end)) * 31;
        T t11 = this.data;
        return hashCode + (t11 != null ? t11.hashCode() : 0);
    }

    public final boolean overlaps(@m80.k Interval<T> interval) {
        return this.start <= interval.end && this.end >= interval.start;
    }

    @m80.k
    public String toString() {
        return "Interval(start=" + this.start + ", end=" + this.end + ", data=" + this.data + ')';
    }

    public final boolean overlaps(float f11, float f12) {
        return this.start <= f12 && this.end >= f11;
    }

    public /* synthetic */ Interval(float f11, float f12, Object obj, int i11, kotlin.jvm.internal.v vVar) {
        this(f11, f12, (i11 & 4) != 0 ? null : obj);
    }
}

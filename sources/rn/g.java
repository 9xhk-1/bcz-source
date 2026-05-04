package rn;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Px;
import rn.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class g<S extends b> {

    /* renamed from: a, reason: collision with root package name */
    public S f84385a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        @FloatRange(from = 0.0d, to = 1.0d)
        public float f84386a;

        /* renamed from: b, reason: collision with root package name */
        @FloatRange(from = 0.0d, to = 1.0d)
        public float f84387b;

        /* renamed from: c, reason: collision with root package name */
        @ColorInt
        public int f84388c;

        /* renamed from: d, reason: collision with root package name */
        @Px
        public int f84389d;
    }

    public g(S s11) {
        this.f84385a = s11;
    }

    public abstract void a(@NonNull Canvas canvas, @NonNull Rect rect, @FloatRange(from = -1.0d, to = 1.0d) float f11, boolean z11, boolean z12);

    public abstract void b(@NonNull Canvas canvas, @NonNull Paint paint, @ColorInt int i11, @IntRange(from = 0, to = 255) int i12);

    public abstract void c(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull a aVar, @IntRange(from = 0, to = 255) int i11);

    public abstract void d(@NonNull Canvas canvas, @NonNull Paint paint, @FloatRange(from = 0.0d, to = 1.0d) float f11, @FloatRange(from = 0.0d, to = 1.0d) float f12, @ColorInt int i11, @IntRange(from = 0, to = 255) int i12, @Px int i13);

    public abstract int e();

    public abstract int f();

    public void g(@NonNull Canvas canvas, @NonNull Rect rect, @FloatRange(from = 0.0d, to = 1.0d) float f11, boolean z11, boolean z12) {
        this.f84385a.e();
        a(canvas, rect, f11, z11, z12);
    }
}

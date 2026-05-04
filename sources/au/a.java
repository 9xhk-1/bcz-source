package au;

import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rd.animation.type.AnimationType;
import com.rd.draw.data.Orientation;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class a {
    public static int a(@Nullable wt.a aVar, int i11) {
        if (aVar == null) {
            return 0;
        }
        return aVar.g() == Orientation.HORIZONTAL ? g(aVar, i11) : h(aVar, i11);
    }

    public static int b(@NonNull wt.a aVar, float f11, float f12) {
        int c11 = aVar.c();
        int m11 = aVar.m();
        int s11 = aVar.s();
        int h11 = aVar.h();
        int d11 = aVar.g() == Orientation.HORIZONTAL ? aVar.d() : aVar.v();
        int i11 = 0;
        int i12 = 0;
        while (i11 < c11) {
            int i13 = (m11 * 2) + (s11 / 2) + (i11 > 0 ? h11 : h11 / 2) + i12;
            boolean z11 = f11 >= ((float) i12) && f11 <= ((float) i13);
            boolean z12 = f12 >= 0.0f && f12 <= ((float) d11);
            if (z11 && z12) {
                return i11;
            }
            i11++;
            i12 = i13;
        }
        return -1;
    }

    public static int c(@NonNull wt.a aVar, int i11) {
        int c11 = aVar.c();
        int m11 = aVar.m();
        int s11 = aVar.s();
        int h11 = aVar.h();
        int i12 = 0;
        for (int i13 = 0; i13 < c11; i13++) {
            int i14 = s11 / 2;
            int i15 = i12 + m11 + i14;
            if (i11 == i13) {
                return i15;
            }
            i12 = i15 + m11 + h11 + i14;
        }
        return aVar.b() == AnimationType.DROP ? i12 + (m11 * 2) : i12;
    }

    public static int d(@Nullable wt.a aVar, float f11, float f12) {
        if (aVar == null) {
            return -1;
        }
        if (aVar.g() != Orientation.HORIZONTAL) {
            f12 = f11;
            f11 = f12;
        }
        return b(aVar, f11, f12);
    }

    public static Pair<Integer, Float> e(@NonNull wt.a aVar, int i11, float f11, boolean z11) {
        int c11 = aVar.c();
        int q11 = aVar.q();
        if (z11) {
            i11 = (c11 - 1) - i11;
        }
        boolean z12 = false;
        if (i11 < 0) {
            i11 = 0;
        } else {
            int i12 = c11 - 1;
            if (i11 > i12) {
                i11 = i12;
            }
        }
        boolean z13 = i11 > q11;
        if (!z11 ? i11 + 1 < q11 : i11 - 1 < q11) {
            z12 = true;
        }
        if (z13 || z12) {
            aVar.W(i11);
            q11 = i11;
        }
        if (q11 != i11 || f11 == 0.0f) {
            f11 = 1.0f - f11;
        } else {
            i11 = z11 ? i11 - 1 : i11 + 1;
        }
        return new Pair<>(Integer.valueOf(i11), Float.valueOf(f11 <= 1.0f ? f11 < 0.0f ? 0.0f : f11 : 1.0f));
    }

    public static int f(@NonNull wt.a aVar) {
        int m11 = aVar.m();
        return aVar.b() == AnimationType.DROP ? m11 * 3 : m11;
    }

    public static int g(@Nullable wt.a aVar, int i11) {
        if (aVar == null) {
            return 0;
        }
        return (aVar.g() == Orientation.HORIZONTAL ? c(aVar, i11) : f(aVar)) + aVar.j();
    }

    public static int h(@Nullable wt.a aVar, int i11) {
        if (aVar == null) {
            return 0;
        }
        return (aVar.g() == Orientation.HORIZONTAL ? f(aVar) : c(aVar, i11)) + aVar.l();
    }
}

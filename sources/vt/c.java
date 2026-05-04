package vt;

import android.util.Pair;
import android.view.View;
import androidx.annotation.NonNull;
import com.rd.animation.type.AnimationType;
import com.rd.draw.data.Orientation;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class c {
    public Pair<Integer, Integer> a(@NonNull wt.a aVar, int i11, int i12) {
        int i13;
        int i14;
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i12);
        int size2 = View.MeasureSpec.getSize(i12);
        int c11 = aVar.c();
        int m11 = aVar.m();
        int s11 = aVar.s();
        int h11 = aVar.h();
        int j11 = aVar.j();
        int l11 = aVar.l();
        int k11 = aVar.k();
        int i15 = aVar.i();
        int i16 = m11 * 2;
        Orientation g11 = aVar.g();
        if (c11 != 0) {
            i14 = (i16 * c11) + (s11 * 2 * c11) + (h11 * (c11 - 1));
            i13 = i16 + s11;
            if (g11 != Orientation.HORIZONTAL) {
                i14 = i13;
                i13 = i14;
            }
        } else {
            i13 = 0;
            i14 = 0;
        }
        if (aVar.b() == AnimationType.DROP) {
            if (g11 == Orientation.HORIZONTAL) {
                i13 *= 2;
            } else {
                i14 *= 2;
            }
        }
        Orientation orientation = Orientation.HORIZONTAL;
        int i17 = i14 + j11 + k11;
        int i18 = i13 + l11 + i15;
        if (mode != 1073741824) {
            size = mode == Integer.MIN_VALUE ? Math.min(i17, size) : i17;
        }
        if (mode2 != 1073741824) {
            size2 = mode2 == Integer.MIN_VALUE ? Math.min(i18, size2) : i18;
        }
        if (size < 0) {
            size = 0;
        }
        int i19 = size2 >= 0 ? size2 : 0;
        aVar.b0(size);
        aVar.H(i19);
        return new Pair<>(Integer.valueOf(size), Integer.valueOf(i19));
    }
}

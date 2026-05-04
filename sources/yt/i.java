package yt;

import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.annotation.NonNull;
import com.rd.draw.data.Orientation;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class i extends a {
    public i(@NonNull Paint paint, @NonNull wt.a aVar) {
        super(paint, aVar);
    }

    public void a(@NonNull Canvas canvas, @NonNull rt.b bVar, int i11, int i12, int i13) {
        if (bVar instanceof st.f) {
            st.f fVar = (st.f) bVar;
            int p11 = this.f100323b.p();
            int t11 = this.f100323b.t();
            int m11 = this.f100323b.m();
            int q11 = this.f100323b.q();
            int r11 = this.f100323b.r();
            int f11 = this.f100323b.f();
            int a11 = fVar.a();
            if (this.f100323b.A()) {
                if (i11 == r11) {
                    a11 = fVar.a();
                } else {
                    if (i11 == q11) {
                        a11 = fVar.b();
                    }
                    p11 = t11;
                }
            } else if (i11 == f11) {
                a11 = fVar.a();
            } else {
                if (i11 == q11) {
                    a11 = fVar.b();
                }
                p11 = t11;
            }
            this.f100322a.setColor(p11);
            if (this.f100323b.g() == Orientation.HORIZONTAL) {
                canvas.drawCircle(a11, i13, m11, this.f100322a);
            } else {
                canvas.drawCircle(i12, a11, m11, this.f100322a);
            }
        }
    }
}

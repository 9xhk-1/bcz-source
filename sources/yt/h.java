package yt;

import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.annotation.NonNull;
import com.rd.draw.data.Orientation;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class h extends a {
    public h(@NonNull Paint paint, @NonNull wt.a aVar) {
        super(paint, aVar);
    }

    public void a(@NonNull Canvas canvas, @NonNull rt.b bVar, int i11, int i12) {
        if (bVar instanceof st.e) {
            int a11 = ((st.e) bVar).a();
            int t11 = this.f100323b.t();
            int p11 = this.f100323b.p();
            int m11 = this.f100323b.m();
            this.f100322a.setColor(t11);
            float f11 = i11;
            float f12 = i12;
            float f13 = m11;
            canvas.drawCircle(f11, f12, f13, this.f100322a);
            this.f100322a.setColor(p11);
            if (this.f100323b.g() == Orientation.HORIZONTAL) {
                canvas.drawCircle(a11, f12, f13, this.f100322a);
            } else {
                canvas.drawCircle(f11, a11, f13, this.f100322a);
            }
        }
    }
}

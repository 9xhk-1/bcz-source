package yt;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import com.rd.draw.data.Orientation;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class j extends k {
    public j(@NonNull Paint paint, @NonNull wt.a aVar) {
        super(paint, aVar);
    }

    @Override // yt.k
    public void a(@NonNull Canvas canvas, @NonNull rt.b bVar, int i11, int i12) {
        if (bVar instanceof st.g) {
            st.g gVar = (st.g) bVar;
            int b11 = gVar.b();
            int a11 = gVar.a();
            int e11 = gVar.e() / 2;
            int m11 = this.f100323b.m();
            int t11 = this.f100323b.t();
            int p11 = this.f100323b.p();
            if (this.f100323b.g() == Orientation.HORIZONTAL) {
                RectF rectF = this.f100326c;
                rectF.left = b11;
                rectF.right = a11;
                rectF.top = i12 - e11;
                rectF.bottom = e11 + i12;
            } else {
                RectF rectF2 = this.f100326c;
                rectF2.left = i11 - e11;
                rectF2.right = e11 + i11;
                rectF2.top = b11;
                rectF2.bottom = a11;
            }
            this.f100322a.setColor(t11);
            float f11 = i11;
            float f12 = i12;
            float f13 = m11;
            canvas.drawCircle(f11, f12, f13, this.f100322a);
            this.f100322a.setColor(p11);
            canvas.drawRoundRect(this.f100326c, f13, f13, this.f100322a);
        }
    }
}

package yt;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import com.rd.draw.data.Orientation;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class k extends a {

    /* renamed from: c, reason: collision with root package name */
    public RectF f100326c;

    public k(@NonNull Paint paint, @NonNull wt.a aVar) {
        super(paint, aVar);
        this.f100326c = new RectF();
    }

    public void a(@NonNull Canvas canvas, @NonNull rt.b bVar, int i11, int i12) {
        if (bVar instanceof st.h) {
            st.h hVar = (st.h) bVar;
            int b11 = hVar.b();
            int a11 = hVar.a();
            int m11 = this.f100323b.m();
            int t11 = this.f100323b.t();
            int p11 = this.f100323b.p();
            if (this.f100323b.g() == Orientation.HORIZONTAL) {
                RectF rectF = this.f100326c;
                rectF.left = b11;
                rectF.right = a11;
                rectF.top = i12 - m11;
                rectF.bottom = i12 + m11;
            } else {
                RectF rectF2 = this.f100326c;
                rectF2.left = i11 - m11;
                rectF2.right = i11 + m11;
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

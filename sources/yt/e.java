package yt;

import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.annotation.NonNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class e extends a {

    /* renamed from: c, reason: collision with root package name */
    public Paint f100325c;

    public e(@NonNull Paint paint, @NonNull wt.a aVar) {
        super(paint, aVar);
        Paint paint2 = new Paint();
        this.f100325c = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        this.f100325c.setAntiAlias(true);
    }

    public void a(@NonNull Canvas canvas, @NonNull rt.b bVar, int i11, int i12, int i13) {
        if (bVar instanceof st.c) {
            st.c cVar = (st.c) bVar;
            int t11 = this.f100323b.t();
            float m11 = this.f100323b.m();
            int s11 = this.f100323b.s();
            int q11 = this.f100323b.q();
            int r11 = this.f100323b.r();
            int f11 = this.f100323b.f();
            if (this.f100323b.A()) {
                if (i11 == r11) {
                    t11 = cVar.a();
                    m11 = cVar.e();
                    s11 = cVar.g();
                } else if (i11 == q11) {
                    t11 = cVar.b();
                    m11 = cVar.f();
                    s11 = cVar.h();
                }
            } else if (i11 == q11) {
                t11 = cVar.a();
                m11 = cVar.e();
                s11 = cVar.g();
            } else if (i11 == f11) {
                t11 = cVar.b();
                m11 = cVar.f();
                s11 = cVar.h();
            }
            this.f100325c.setColor(t11);
            this.f100325c.setStrokeWidth(this.f100323b.s());
            float f12 = i12;
            float f13 = i13;
            canvas.drawCircle(f12, f13, this.f100323b.m(), this.f100325c);
            this.f100325c.setStrokeWidth(s11);
            canvas.drawCircle(f12, f13, m11, this.f100325c);
        }
    }
}

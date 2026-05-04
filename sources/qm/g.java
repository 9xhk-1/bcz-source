package qm;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import km.k;
import rm.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class g implements e {

    /* renamed from: a, reason: collision with root package name */
    public Path f82370a = new Path();

    @Override // qm.e
    public void a(Canvas canvas, k kVar, l lVar, float f11, float f12, Paint paint) {
        float q11 = kVar.q();
        float f13 = q11 / 2.0f;
        float e11 = (q11 - (rm.k.e(kVar.p1()) * 2.0f)) / 2.0f;
        int B0 = kVar.B0();
        paint.setStyle(Paint.Style.FILL);
        Path path = this.f82370a;
        path.reset();
        float f14 = f12 - f13;
        path.moveTo(f11, f14);
        float f15 = f11 + f13;
        float f16 = f12 + f13;
        path.lineTo(f15, f16);
        float f17 = f11 - f13;
        path.lineTo(f17, f16);
        double d11 = q11;
        if (d11 > 0.0d) {
            path.lineTo(f11, f14);
            float f18 = f17 + e11;
            float f19 = f16 - e11;
            path.moveTo(f18, f19);
            path.lineTo(f15 - e11, f19);
            path.lineTo(f11, f14 + e11);
            path.lineTo(f18, f19);
        }
        path.close();
        canvas.drawPath(path, paint);
        path.reset();
        if (d11 <= 0.0d || B0 == 1122867) {
            return;
        }
        paint.setColor(B0);
        path.moveTo(f11, f14 + e11);
        float f21 = f16 - e11;
        path.lineTo(f15 - e11, f21);
        path.lineTo(f17 + e11, f21);
        path.close();
        canvas.drawPath(path, paint);
        path.reset();
    }
}

package qm;

import android.graphics.Canvas;
import android.graphics.Paint;
import km.k;
import rm.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class c implements e {
    @Override // qm.e
    public void a(Canvas canvas, k kVar, l lVar, float f11, float f12, Paint paint) {
        float q11 = kVar.q();
        float f13 = q11 / 2.0f;
        float e11 = rm.k.e(kVar.p1());
        float f14 = (q11 - (e11 * 2.0f)) / 2.0f;
        float f15 = f14 / 2.0f;
        int B0 = kVar.B0();
        if (q11 <= 0.0d) {
            paint.setStyle(Paint.Style.FILL);
            canvas.drawCircle(f11, f12, f13, paint);
            return;
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(f14);
        canvas.drawCircle(f11, f12, f15 + e11, paint);
        if (B0 != 1122867) {
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(B0);
            canvas.drawCircle(f11, f12, e11, paint);
        }
    }
}

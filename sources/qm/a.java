package qm;

import android.graphics.Canvas;
import android.graphics.Paint;
import km.k;
import rm.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class a implements e {
    @Override // qm.e
    public void a(Canvas canvas, k kVar, l lVar, float f11, float f12, Paint paint) {
        float q11 = kVar.q() / 2.0f;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(rm.k.e(1.0f));
        float f13 = q11 * 2.0f;
        float f14 = f12 + f13;
        canvas.drawLine(f11, f14, f11 + f13, f12, paint);
        canvas.drawLine(f11, f14, f11 - f13, f12, paint);
    }
}

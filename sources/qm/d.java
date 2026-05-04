package qm;

import android.graphics.Canvas;
import android.graphics.Paint;
import km.k;
import rm.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class d implements e {
    @Override // qm.e
    public void a(Canvas canvas, k kVar, l lVar, float f11, float f12, Paint paint) {
        float q11 = kVar.q() / 2.0f;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(rm.k.e(1.0f));
        canvas.drawLine(f11 - q11, f12, f11 + q11, f12, paint);
        canvas.drawLine(f11, f12 - q11, f11, f12 + q11, paint);
    }
}

package com.esotericsoftware.spine.android;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.badlogic.gdx.utils.a;
import com.esotericsoftware.spine.android.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class a {
    public void a(kl.b bVar, Canvas canvas, com.badlogic.gdx.utils.a<b.C0343b> aVar) {
        Paint paint = new Paint();
        paint.setColor(-16776961);
        paint.setStyle(Paint.Style.FILL);
        a.b<com.esotericsoftware.spine.b> it = bVar.g().i().iterator();
        while (it.hasNext()) {
            com.esotericsoftware.spine.b next = it.next();
            float B = next.B();
            float C = next.C();
            canvas.drawRect(new RectF(B - 2.5f, C - 2.5f, B + 2.5f, C + 2.5f), paint);
        }
    }
}

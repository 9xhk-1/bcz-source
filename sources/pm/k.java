package pm;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public abstract class k extends l {
    public k(cm.a aVar, rm.l lVar) {
        super(aVar, lVar);
    }

    public final boolean o() {
        return rm.k.C() >= 18;
    }

    public void p(Canvas canvas, Path path, int i11, int i12) {
        int i13 = (i11 & 16777215) | (i12 << 24);
        if (o()) {
            int save = canvas.save();
            canvas.clipPath(path);
            canvas.drawColor(i13);
            canvas.restoreToCount(save);
            return;
        }
        Paint.Style style = this.f80886c.getStyle();
        int color = this.f80886c.getColor();
        this.f80886c.setStyle(Paint.Style.FILL);
        this.f80886c.setColor(i13);
        canvas.drawPath(path, this.f80886c);
        this.f80886c.setColor(color);
        this.f80886c.setStyle(style);
    }

    public void q(Canvas canvas, Path path, Drawable drawable) {
        if (!o()) {
            throw new RuntimeException("Fill-drawables not (yet) supported below API level 18, this code was run on API level " + rm.k.C() + ".");
        }
        int save = canvas.save();
        canvas.clipPath(path);
        drawable.setBounds((int) this.f80939a.h(), (int) this.f80939a.j(), (int) this.f80939a.i(), (int) this.f80939a.f());
        drawable.draw(canvas);
        canvas.restoreToCount(save);
    }
}

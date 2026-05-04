package va;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class l extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public int f93779a;

    /* renamed from: b, reason: collision with root package name */
    public List<b> f93780b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public List<a> f93781c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public Paint f93782d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public RectF f93783a;

        public a() {
        }

        public RectF b() {
            return this.f93783a;
        }

        public void c(float left, float top, float right, float bottom) {
            this.f93783a = new RectF(left, top, right, bottom);
        }

        public void d(RectF rect) {
            this.f93783a = rect;
        }

        public a(RectF rect) {
            this.f93783a = rect;
        }

        public a(float left, float top, float right, float bottom) {
            this.f93783a = new RectF(left, top, right, bottom);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public float f93784a;

        /* renamed from: b, reason: collision with root package name */
        public RectF f93785b;

        public b() {
        }

        public float c() {
            return this.f93784a;
        }

        public RectF d() {
            return this.f93785b;
        }

        public void e(float cornerRadius) {
            this.f93784a = cornerRadius;
        }

        public void f(float left, float top, float right, float bottom) {
            this.f93785b = new RectF(left, top, right, bottom);
        }

        public void g(RectF rect) {
            this.f93785b = rect;
        }

        public b(RectF rect, float cornerRadius) {
            this.f93785b = rect;
            this.f93784a = cornerRadius;
        }

        public b(float left, float top, float right, float bottom, float cornerRadius) {
            this.f93785b = new RectF(left, top, right, bottom);
            this.f93784a = cornerRadius;
        }
    }

    public l() {
        Paint paint = new Paint(1);
        this.f93782d = paint;
        paint.setColor(-65536);
        this.f93782d.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public static l a() {
        return new l();
    }

    public l b(a hollow) {
        if (hollow == null) {
            return this;
        }
        this.f93781c.add(hollow);
        return this;
    }

    public l c(List<a> hollows) {
        if (hollows == null) {
            return this;
        }
        this.f93781c = hollows;
        return this;
    }

    public l d(b hollow) {
        if (hollow == null) {
            return this;
        }
        this.f93780b.add(hollow);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds.width() == 0 || bounds.height() == 0) {
            try {
                throw new RuntimeException("bounds error");
            } catch (Throwable th2) {
                qb.c.a("leijie", "", th2);
                return;
            }
        }
        try {
            Bitmap createBitmap = Bitmap.createBitmap(bounds.width(), bounds.height(), Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap);
            canvas2.drawColor(this.f93779a);
            for (b bVar : this.f93780b) {
                canvas2.drawRoundRect(bVar.f93785b, bVar.f93784a, bVar.f93784a, this.f93782d);
            }
            Iterator<a> it = this.f93781c.iterator();
            while (it.hasNext()) {
                canvas2.drawArc(it.next().f93783a, 0.0f, 360.0f, false, this.f93782d);
            }
            canvas.drawBitmap(createBitmap, 0.0f, 0.0f, (Paint) null);
        } catch (Throwable th3) {
            qb.c.c("HollowDrawable", "", th3);
        }
    }

    public l e(List<b> hollows) {
        if (hollows == null) {
            return this;
        }
        this.f93780b = hollows;
        return this;
    }

    public boolean f(float x11, float y11) {
        Iterator<b> it = this.f93780b.iterator();
        while (it.hasNext()) {
            if (it.next().f93785b.contains(x11, y11)) {
                return true;
            }
        }
        Iterator<a> it2 = this.f93781c.iterator();
        while (it2.hasNext()) {
            if (it2.next().f93783a.contains(x11, y11)) {
                return true;
            }
        }
        return false;
    }

    public l g(int color) {
        this.f93779a = color;
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter cf2) {
    }
}

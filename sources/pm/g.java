package pm;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public abstract class g extends o {

    /* renamed from: b, reason: collision with root package name */
    public cm.a f80885b;

    /* renamed from: c, reason: collision with root package name */
    public Paint f80886c;

    /* renamed from: d, reason: collision with root package name */
    public Paint f80887d;

    /* renamed from: e, reason: collision with root package name */
    public Paint f80888e;

    /* renamed from: f, reason: collision with root package name */
    public Paint f80889f;

    public g(cm.a aVar, rm.l lVar) {
        super(lVar);
        this.f80885b = aVar;
        Paint paint = new Paint(1);
        this.f80886c = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f80888e = new Paint(4);
        Paint paint2 = new Paint(1);
        this.f80889f = paint2;
        paint2.setColor(Color.rgb(63, 63, 63));
        this.f80889f.setTextAlign(Paint.Align.CENTER);
        this.f80889f.setTextSize(rm.k.e(9.0f));
        Paint paint3 = new Paint(1);
        this.f80887d = paint3;
        paint3.setStyle(Paint.Style.STROKE);
        this.f80887d.setStrokeWidth(2.0f);
        this.f80887d.setColor(Color.rgb(255, 187, 115));
    }

    public void a(km.e eVar) {
        this.f80889f.setTypeface(eVar.p());
        this.f80889f.setTextSize(eVar.T0());
    }

    public abstract void b(Canvas canvas);

    public abstract void c(Canvas canvas);

    public abstract void d(Canvas canvas, im.d[] dVarArr);

    public abstract void e(Canvas canvas, String str, float f11, float f12, int i11);

    public abstract void f(Canvas canvas);

    public Paint g() {
        return this.f80887d;
    }

    public Paint h() {
        return this.f80886c;
    }

    public Paint i() {
        return this.f80889f;
    }

    public abstract void j();

    public boolean k(jm.e eVar) {
        return ((float) eVar.getData().r()) < ((float) eVar.getMaxVisibleCount()) * this.f80939a.w();
    }
}

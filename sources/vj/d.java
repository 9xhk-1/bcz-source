package vj;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.client.business.util.KotlinExtKt;
import com.jiongji.andriod.card.R;
import kotlin.jvm.internal.g0;
import yz.c0;
import yz.e0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class d extends Drawable {

    /* renamed from: f, reason: collision with root package name */
    public static final int f93973f = 8;

    /* renamed from: a, reason: collision with root package name */
    public final int f93974a;

    /* renamed from: b, reason: collision with root package name */
    public final int f93975b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final a f93976c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final c0 f93977d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final c0 f93978e;

    public d(int i11, int i12, @m80.k a level) {
        g0.p(level, "level");
        this.f93974a = i11;
        this.f93975b = i12;
        this.f93976c = level;
        this.f93977d = e0.c(new x00.a() { // from class: vj.b
            @Override // x00.a
            public final Object invoke() {
                Paint g11;
                g11 = d.g();
                return g11;
            }
        });
        this.f93978e = e0.c(new x00.a() { // from class: vj.c
            @Override // x00.a
            public final Object invoke() {
                Paint f11;
                f11 = d.f();
                return f11;
            }
        });
    }

    public static final Paint f() {
        Paint paint = new Paint();
        paint.setColor(KotlinExtKt.getColorInt(R.color.color_surface_container_high));
        return paint;
    }

    public static final Paint g() {
        Paint paint = new Paint();
        paint.setColor(KotlinExtKt.getColorInt(R.color.main_color_blue_dark));
        return paint;
    }

    @m80.k
    public final a c() {
        return this.f93976c;
    }

    public final Paint d() {
        return (Paint) this.f93977d.getValue();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@m80.k Canvas canvas) {
        g0.p(canvas, "canvas");
        int width = getBounds().width();
        int height = getBounds().height();
        int dpValue = (height - KotlinExtKt.getDpValue(12)) / 5;
        float f11 = width;
        float f12 = f11 / 2.0f;
        int i11 = 0;
        while (i11 < 5) {
            float f13 = height;
            canvas.drawRoundRect(0.0f, (f13 - dpValue) - ((KotlinExtKt.getDpValue(3) + dpValue) * i11), f11, f13 - ((KotlinExtKt.getDpValue(3) + dpValue) * i11), f12, f12, this.f93976c.a() > i11 ? d() : e());
            i11++;
        }
    }

    public final Paint e() {
        return (Paint) this.f93978e.getValue();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f93975b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f93974a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@m80.l ColorFilter colorFilter) {
    }
}

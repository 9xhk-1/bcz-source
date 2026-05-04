package em;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.charts.Chart;
import com.github.mikephil.charting.data.Entry;
import java.lang.ref.WeakReference;
import rm.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class e implements d {

    /* renamed from: a, reason: collision with root package name */
    public Context f49909a;

    /* renamed from: b, reason: collision with root package name */
    public Drawable f49910b;

    /* renamed from: e, reason: collision with root package name */
    public WeakReference<Chart> f49913e;

    /* renamed from: c, reason: collision with root package name */
    public g f49911c = new g();

    /* renamed from: d, reason: collision with root package name */
    public g f49912d = new g();

    /* renamed from: f, reason: collision with root package name */
    public rm.c f49914f = new rm.c();

    /* renamed from: g, reason: collision with root package name */
    public Rect f49915g = new Rect();

    public e(Context context, int i11) {
        this.f49909a = context;
        this.f49910b = context.getResources().getDrawable(i11, null);
    }

    @Override // em.d
    public void a(Canvas canvas, float f11, float f12) {
        if (this.f49910b == null) {
            return;
        }
        g c11 = c(f11, f12);
        rm.c cVar = this.f49914f;
        float f13 = cVar.f84257c;
        float f14 = cVar.f84258d;
        if (f13 == 0.0f) {
            f13 = this.f49910b.getIntrinsicWidth();
        }
        if (f14 == 0.0f) {
            f14 = this.f49910b.getIntrinsicHeight();
        }
        this.f49910b.copyBounds(this.f49915g);
        Drawable drawable = this.f49910b;
        Rect rect = this.f49915g;
        int i11 = rect.left;
        int i12 = rect.top;
        drawable.setBounds(i11, i12, ((int) f13) + i11, ((int) f14) + i12);
        int save = canvas.save();
        canvas.translate(f11 + c11.f84265c, f12 + c11.f84266d);
        this.f49910b.draw(canvas);
        canvas.restoreToCount(save);
        this.f49910b.setBounds(this.f49915g);
    }

    @Override // em.d
    public g c(float f11, float f12) {
        Drawable drawable;
        Drawable drawable2;
        g offset = getOffset();
        g gVar = this.f49912d;
        gVar.f84265c = offset.f84265c;
        gVar.f84266d = offset.f84266d;
        Chart d11 = d();
        rm.c cVar = this.f49914f;
        float f13 = cVar.f84257c;
        float f14 = cVar.f84258d;
        if (f13 == 0.0f && (drawable2 = this.f49910b) != null) {
            f13 = drawable2.getIntrinsicWidth();
        }
        if (f14 == 0.0f && (drawable = this.f49910b) != null) {
            f14 = drawable.getIntrinsicHeight();
        }
        g gVar2 = this.f49912d;
        float f15 = gVar2.f84265c;
        if (f11 + f15 < 0.0f) {
            gVar2.f84265c = -f11;
        } else if (d11 != null && f11 + f13 + f15 > d11.getWidth()) {
            this.f49912d.f84265c = (d11.getWidth() - f11) - f13;
        }
        g gVar3 = this.f49912d;
        float f16 = gVar3.f84266d;
        if (f12 + f16 < 0.0f) {
            gVar3.f84266d = -f12;
        } else if (d11 != null && f12 + f14 + f16 > d11.getHeight()) {
            this.f49912d.f84266d = (d11.getHeight() - f12) - f14;
        }
        return this.f49912d;
    }

    public Chart d() {
        WeakReference<Chart> weakReference = this.f49913e;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public rm.c e() {
        return this.f49914f;
    }

    public void f(Chart chart) {
        this.f49913e = new WeakReference<>(chart);
    }

    public void g(float f11, float f12) {
        g gVar = this.f49911c;
        gVar.f84265c = f11;
        gVar.f84266d = f12;
    }

    @Override // em.d
    public g getOffset() {
        return this.f49911c;
    }

    public void h(g gVar) {
        this.f49911c = gVar;
        if (gVar == null) {
            this.f49911c = new g();
        }
    }

    public void i(rm.c cVar) {
        this.f49914f = cVar;
        if (cVar == null) {
            this.f49914f = new rm.c();
        }
    }

    @Override // em.d
    public void b(Entry entry, im.d dVar) {
    }
}

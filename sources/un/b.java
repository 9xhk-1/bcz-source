package un;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.ColorUtils;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes7.dex */
public class b {

    /* renamed from: i, reason: collision with root package name */
    public static final int f92384i = 68;

    /* renamed from: j, reason: collision with root package name */
    public static final int f92385j = 20;

    /* renamed from: k, reason: collision with root package name */
    public static final int f92386k = 0;

    /* renamed from: l, reason: collision with root package name */
    public static final int[] f92387l = new int[3];

    /* renamed from: m, reason: collision with root package name */
    public static final float[] f92388m = {0.0f, 0.5f, 1.0f};

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f92389n = new int[4];

    /* renamed from: o, reason: collision with root package name */
    public static final float[] f92390o = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final Paint f92391a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final Paint f92392b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final Paint f92393c;

    /* renamed from: d, reason: collision with root package name */
    public int f92394d;

    /* renamed from: e, reason: collision with root package name */
    public int f92395e;

    /* renamed from: f, reason: collision with root package name */
    public int f92396f;

    /* renamed from: g, reason: collision with root package name */
    public final Path f92397g;

    /* renamed from: h, reason: collision with root package name */
    public final Paint f92398h;

    public b() {
        this(-16777216);
    }

    public void a(@NonNull Canvas canvas, @Nullable Matrix matrix, @NonNull RectF rectF, int i11, float f11, float f12) {
        float f13;
        boolean z11 = f12 < 0.0f;
        Path path = this.f92397g;
        if (z11) {
            int[] iArr = f92389n;
            iArr[0] = 0;
            iArr[1] = this.f92396f;
            iArr[2] = this.f92395e;
            iArr[3] = this.f92394d;
            f13 = f11;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            f13 = f11;
            path.arcTo(rectF, f13, f12);
            path.close();
            float f14 = -i11;
            rectF.inset(f14, f14);
            int[] iArr2 = f92389n;
            iArr2[0] = 0;
            iArr2[1] = this.f92394d;
            iArr2[2] = this.f92395e;
            iArr2[3] = this.f92396f;
        }
        float width = rectF.width() / 2.0f;
        if (width <= 0.0f) {
            return;
        }
        float f15 = 1.0f - (i11 / width);
        float[] fArr = f92390o;
        fArr[1] = f15;
        fArr[2] = ((1.0f - f15) / 2.0f) + f15;
        this.f92392b.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), width, f92389n, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z11) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, this.f92398h);
        }
        canvas.drawArc(rectF, f13, f12, true, this.f92392b);
        canvas.restore();
    }

    public void b(@NonNull Canvas canvas, @Nullable Matrix matrix, @NonNull RectF rectF, int i11) {
        rectF.bottom += i11;
        rectF.offset(0.0f, -i11);
        int[] iArr = f92387l;
        iArr[0] = this.f92396f;
        iArr[1] = this.f92395e;
        iArr[2] = this.f92394d;
        Paint paint = this.f92393c;
        float f11 = rectF.left;
        paint.setShader(new LinearGradient(f11, rectF.top, f11, rectF.bottom, iArr, f92388m, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.f92393c);
        canvas.restore();
    }

    public void c(@NonNull Canvas canvas, @Nullable Matrix matrix, @NonNull RectF rectF, int i11, float f11, float f12, @NonNull float[] fArr) {
        if (f12 > 0.0f) {
            f11 += f12;
            f12 = -f12;
        }
        float f13 = f11;
        float f14 = f12;
        a(canvas, matrix, rectF, i11, f13, f14);
        Path path = this.f92397g;
        path.rewind();
        path.moveTo(fArr[0], fArr[1]);
        path.arcTo(rectF, f13, f14);
        path.close();
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        canvas.drawPath(path, this.f92398h);
        canvas.drawPath(path, this.f92391a);
        canvas.restore();
    }

    @NonNull
    public Paint d() {
        return this.f92391a;
    }

    public void e(int i11) {
        this.f92394d = ColorUtils.setAlphaComponent(i11, 68);
        this.f92395e = ColorUtils.setAlphaComponent(i11, 20);
        this.f92396f = ColorUtils.setAlphaComponent(i11, 0);
        this.f92391a.setColor(this.f92394d);
    }

    public b(int i11) {
        this.f92397g = new Path();
        Paint paint = new Paint();
        this.f92398h = paint;
        this.f92391a = new Paint();
        e(i11);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.f92392b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f92393c = new Paint(paint2);
    }
}

package rm;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import com.huawei.hms.framework.common.ExceptionCode;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static DisplayMetrics f84287a = null;

    /* renamed from: b, reason: collision with root package name */
    public static int f84288b = 50;

    /* renamed from: c, reason: collision with root package name */
    public static int f84289c = 8000;

    /* renamed from: d, reason: collision with root package name */
    public static final double f84290d = 0.017453292519943295d;

    /* renamed from: e, reason: collision with root package name */
    public static final float f84291e = 0.017453292f;

    /* renamed from: f, reason: collision with root package name */
    public static final double f84292f = Double.longBitsToDouble(1);

    /* renamed from: g, reason: collision with root package name */
    public static final float f84293g = Float.intBitsToFloat(1);

    /* renamed from: h, reason: collision with root package name */
    public static Rect f84294h = new Rect();

    /* renamed from: i, reason: collision with root package name */
    public static Paint.FontMetrics f84295i = new Paint.FontMetrics();

    /* renamed from: j, reason: collision with root package name */
    public static Rect f84296j = new Rect();

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f84297k = {1, 10, 100, 1000, 10000, 100000, 1000000, ExceptionCode.CRASH_EXCEPTION, 100000000, 1000000000};

    /* renamed from: l, reason: collision with root package name */
    public static hm.l f84298l = q();

    /* renamed from: m, reason: collision with root package name */
    public static Rect f84299m = new Rect();

    /* renamed from: n, reason: collision with root package name */
    public static Rect f84300n = new Rect();

    /* renamed from: o, reason: collision with root package name */
    public static Paint.FontMetrics f84301o = new Paint.FontMetrics();

    public static g A(g gVar, float f11, float f12) {
        g c11 = g.c(0.0f, 0.0f);
        B(gVar, f11, f12, c11);
        return c11;
    }

    public static void B(g gVar, float f11, float f12, g gVar2) {
        double d11 = f11;
        double d12 = f12;
        gVar2.f84265c = (float) (gVar.f84265c + (Math.cos(Math.toRadians(d12)) * d11));
        gVar2.f84266d = (float) (gVar.f84266d + (d11 * Math.sin(Math.toRadians(d12))));
    }

    public static int C() {
        return Build.VERSION.SDK_INT;
    }

    public static c D(float f11, float f12, float f13) {
        return F(f11, f12, f13 * 0.017453292f);
    }

    public static c E(c cVar, float f11) {
        return F(cVar.f84257c, cVar.f84258d, f11 * 0.017453292f);
    }

    public static c F(float f11, float f12, float f13) {
        double d11 = f13;
        return c.b(Math.abs(((float) Math.cos(d11)) * f11) + Math.abs(((float) Math.sin(d11)) * f12), Math.abs(f11 * ((float) Math.sin(d11))) + Math.abs(f12 * ((float) Math.cos(d11))));
    }

    public static c G(c cVar, float f11) {
        return F(cVar.f84257c, cVar.f84258d, f11);
    }

    public static void H(Context context) {
        if (context == null) {
            f84288b = ViewConfiguration.getMinimumFlingVelocity();
            f84289c = ViewConfiguration.getMaximumFlingVelocity();
            Log.e("MPChartLib-Utils", "Utils.init(...) PROVIDED CONTEXT OBJECT IS NULL");
        } else {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            f84288b = viewConfiguration.getScaledMinimumFlingVelocity();
            f84289c = viewConfiguration.getScaledMaximumFlingVelocity();
            f84287a = context.getResources().getDisplayMetrics();
        }
    }

    @Deprecated
    public static void I(Resources resources) {
        f84287a = resources.getDisplayMetrics();
        f84288b = ViewConfiguration.getMinimumFlingVelocity();
        f84289c = ViewConfiguration.getMaximumFlingVelocity();
    }

    public static double J(double d11) {
        if (d11 == Double.POSITIVE_INFINITY) {
            return d11;
        }
        double d12 = d11 + 0.0d;
        return Double.longBitsToDouble(Double.doubleToRawLongBits(d12) + (d12 >= 0.0d ? 1L : -1L));
    }

    @SuppressLint({"NewApi"})
    public static void K(View view) {
        view.postInvalidateOnAnimation();
    }

    public static float L(double d11) {
        if (Double.isInfinite(d11) || Double.isNaN(d11) || d11 == 0.0d) {
            return 0.0f;
        }
        return Math.round(d11 * r0) / ((float) Math.pow(10.0d, 1 - ((int) Math.ceil((float) Math.log10(d11 < 0.0d ? -d11 : d11)))));
    }

    public static void M(MotionEvent motionEvent, VelocityTracker velocityTracker) {
        velocityTracker.computeCurrentVelocity(1000, f84289c);
        int actionIndex = motionEvent.getActionIndex();
        int pointerId = motionEvent.getPointerId(actionIndex);
        float xVelocity = velocityTracker.getXVelocity(pointerId);
        float yVelocity = velocityTracker.getYVelocity(pointerId);
        int pointerCount = motionEvent.getPointerCount();
        for (int i11 = 0; i11 < pointerCount; i11++) {
            if (i11 != actionIndex) {
                int pointerId2 = motionEvent.getPointerId(i11);
                if ((velocityTracker.getXVelocity(pointerId2) * xVelocity) + (velocityTracker.getYVelocity(pointerId2) * yVelocity) < 0.0f) {
                    velocityTracker.clear();
                    return;
                }
            }
        }
    }

    public static int a(Paint paint, String str) {
        Rect rect = f84294h;
        rect.set(0, 0, 0, 0);
        paint.getTextBounds(str, 0, str.length(), rect);
        return rect.height();
    }

    public static c b(Paint paint, String str) {
        c b11 = c.b(0.0f, 0.0f);
        c(paint, str, b11);
        return b11;
    }

    public static void c(Paint paint, String str, c cVar) {
        Rect rect = f84296j;
        rect.set(0, 0, 0, 0);
        paint.getTextBounds(str, 0, str.length(), rect);
        cVar.f84257c = rect.width();
        cVar.f84258d = rect.height();
    }

    public static int d(Paint paint, String str) {
        return (int) paint.measureText(str);
    }

    public static float e(float f11) {
        DisplayMetrics displayMetrics = f84287a;
        if (displayMetrics != null) {
            return f11 * displayMetrics.density;
        }
        Log.e("MPChartLib-Utils", "Utils NOT INITIALIZED. You need to call Utils.init(...) at least once before calling Utils.convertDpToPixel(...). Otherwise conversion does not take place.");
        return f11;
    }

    public static int[] f(List<Integer> list) {
        int[] iArr = new int[list.size()];
        i(list, iArr);
        return iArr;
    }

    public static float g(float f11) {
        DisplayMetrics displayMetrics = f84287a;
        if (displayMetrics != null) {
            return f11 / displayMetrics.density;
        }
        Log.e("MPChartLib-Utils", "Utils NOT INITIALIZED. You need to call Utils.init(...) at least once before calling Utils.convertPixelsToDp(...). Otherwise conversion does not take place.");
        return f11;
    }

    public static String[] h(List<String> list) {
        int size = list.size();
        String[] strArr = new String[size];
        for (int i11 = 0; i11 < size; i11++) {
            strArr[i11] = list.get(i11);
        }
        return strArr;
    }

    public static void i(List<Integer> list, int[] iArr) {
        int length = iArr.length < list.size() ? iArr.length : list.size();
        for (int i11 = 0; i11 < length; i11++) {
            iArr[i11] = list.get(i11).intValue();
        }
    }

    public static void j(List<String> list, String[] strArr) {
        int length = strArr.length < list.size() ? strArr.length : list.size();
        for (int i11 = 0; i11 < length; i11++) {
            strArr[i11] = list.get(i11);
        }
    }

    public static void k(Canvas canvas, Drawable drawable, int i11, int i12, int i13, int i14) {
        g b11 = g.b();
        b11.f84265c = i11 - (i13 / 2);
        b11.f84266d = i12 - (i14 / 2);
        drawable.copyBounds(f84299m);
        Rect rect = f84299m;
        int i15 = rect.left;
        int i16 = rect.top;
        drawable.setBounds(i15, i16, i15 + i13, i13 + i16);
        int save = canvas.save();
        canvas.translate(b11.f84265c, b11.f84266d);
        drawable.draw(canvas);
        canvas.restoreToCount(save);
    }

    public static void l(Canvas canvas, StaticLayout staticLayout, float f11, float f12, TextPaint textPaint, g gVar, float f13) {
        float fontMetrics = textPaint.getFontMetrics(f84301o);
        float width = staticLayout.getWidth();
        float lineCount = staticLayout.getLineCount() * fontMetrics;
        float f14 = 0.0f - f84300n.left;
        float f15 = lineCount + 0.0f;
        Paint.Align textAlign = textPaint.getTextAlign();
        textPaint.setTextAlign(Paint.Align.LEFT);
        if (f13 != 0.0f) {
            float f16 = f14 - (width * 0.5f);
            float f17 = f15 - (lineCount * 0.5f);
            if (gVar.f84265c != 0.5f || gVar.f84266d != 0.5f) {
                c D = D(width, lineCount, f13);
                f11 -= D.f84257c * (gVar.f84265c - 0.5f);
                f12 -= D.f84258d * (gVar.f84266d - 0.5f);
                c.c(D);
            }
            canvas.save();
            canvas.translate(f11, f12);
            canvas.rotate(f13);
            canvas.translate(f16, f17);
            staticLayout.draw(canvas);
            canvas.restore();
        } else {
            float f18 = gVar.f84265c;
            if (f18 != 0.0f || gVar.f84266d != 0.0f) {
                f14 -= width * f18;
                f15 -= lineCount * gVar.f84266d;
            }
            canvas.save();
            canvas.translate(f14 + f11, f15 + f12);
            staticLayout.draw(canvas);
            canvas.restore();
        }
        textPaint.setTextAlign(textAlign);
    }

    public static void m(Canvas canvas, String str, float f11, float f12, TextPaint textPaint, c cVar, g gVar, float f13) {
        l(canvas, new StaticLayout(str, 0, str.length(), textPaint, (int) Math.max(Math.ceil(cVar.f84257c), 1.0d), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false), f11, f12, textPaint, gVar, f13);
    }

    public static void n(Canvas canvas, String str, float f11, float f12, Paint paint, g gVar, float f13) {
        float fontMetrics = paint.getFontMetrics(f84301o);
        paint.getTextBounds(str, 0, str.length(), f84300n);
        float f14 = 0.0f - f84300n.left;
        float f15 = (-f84301o.ascent) + 0.0f;
        Paint.Align textAlign = paint.getTextAlign();
        paint.setTextAlign(Paint.Align.LEFT);
        if (f13 != 0.0f) {
            float width = f14 - (f84300n.width() * 0.5f);
            float f16 = f15 - (fontMetrics * 0.5f);
            if (gVar.f84265c != 0.5f || gVar.f84266d != 0.5f) {
                c D = D(f84300n.width(), fontMetrics, f13);
                f11 -= D.f84257c * (gVar.f84265c - 0.5f);
                f12 -= D.f84258d * (gVar.f84266d - 0.5f);
                c.c(D);
            }
            canvas.save();
            canvas.translate(f11, f12);
            canvas.rotate(f13);
            canvas.drawText(str, width, f16, paint);
            canvas.restore();
        } else {
            if (gVar.f84265c != 0.0f || gVar.f84266d != 0.0f) {
                f14 -= f84300n.width() * gVar.f84265c;
                f15 -= fontMetrics * gVar.f84266d;
            }
            canvas.drawText(str, f14 + f11, f15 + f12, paint);
        }
        paint.setTextAlign(textAlign);
    }

    public static String o(float f11, int i11, boolean z11) {
        return p(f11, i11, z11, '.');
    }

    public static String p(float f11, int i11, boolean z11, char c11) {
        boolean z12;
        float f12 = f11;
        int i12 = 35;
        char[] cArr = new char[35];
        if (f12 == 0.0f) {
            return "0";
        }
        int i13 = 0;
        boolean z13 = f12 < 1.0f && f12 > -1.0f;
        if (f12 < 0.0f) {
            f12 = -f12;
            z12 = true;
        } else {
            z12 = false;
        }
        int[] iArr = f84297k;
        int length = i11 > iArr.length ? iArr.length - 1 : i11;
        long round = Math.round(f12 * iArr[length]);
        int i14 = 34;
        boolean z14 = false;
        while (true) {
            if (round == 0 && i13 >= length + 1) {
                break;
            }
            char[] cArr2 = cArr;
            int i15 = (int) (round % 10);
            round /= 10;
            int i16 = i14 - 1;
            cArr2[i14] = (char) (i15 + 48);
            int i17 = i13 + 1;
            if (i17 == length) {
                i14 -= 2;
                cArr2[i16] = ',';
                i13 += 2;
                z14 = true;
            } else {
                if (z11 && round != 0 && i17 > length) {
                    if (z14) {
                        if ((i17 - length) % 4 == 0) {
                            i14 -= 2;
                            cArr2[i16] = c11;
                            i13 += 2;
                        }
                    } else if ((i17 - length) % 4 == 3) {
                        i14 -= 2;
                        cArr2[i16] = c11;
                        i13 += 2;
                    }
                }
                i13 = i17;
                i14 = i16;
            }
            cArr = cArr2;
            i12 = 35;
        }
        if (z13) {
            cArr[i14] = '0';
            i13++;
            i14--;
        }
        if (z12) {
            cArr[i14] = '-';
            i13++;
        }
        int i18 = i12 - i13;
        return String.valueOf(cArr, i18, 35 - i18);
    }

    public static hm.l q() {
        return new hm.d(1);
    }

    public static int r(float f11) {
        float L = L(f11);
        if (Float.isInfinite(L)) {
            return 0;
        }
        return ((int) Math.ceil(-Math.log10(L))) + 2;
    }

    public static hm.l s() {
        return f84298l;
    }

    public static float t(Paint paint) {
        return u(paint, f84295i);
    }

    public static float u(Paint paint, Paint.FontMetrics fontMetrics) {
        paint.getFontMetrics(fontMetrics);
        return fontMetrics.descent - fontMetrics.ascent;
    }

    public static float v(Paint paint) {
        return w(paint, f84295i);
    }

    public static float w(Paint paint, Paint.FontMetrics fontMetrics) {
        paint.getFontMetrics(fontMetrics);
        return (fontMetrics.ascent - fontMetrics.top) + fontMetrics.bottom;
    }

    public static int x() {
        return f84289c;
    }

    public static int y() {
        return f84288b;
    }

    public static float z(float f11) {
        while (f11 < 0.0f) {
            f11 += 360.0f;
        }
        return f11 % 360.0f;
    }
}

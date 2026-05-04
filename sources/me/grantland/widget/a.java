package me.grantland.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextWatcher;
import android.text.method.SingleLineTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import com.jiongji.andriod.card.R;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class a {

    /* renamed from: p, reason: collision with root package name */
    public static final String f73155p = "AutoFitTextHelper";

    /* renamed from: q, reason: collision with root package name */
    public static final boolean f73156q = true;

    /* renamed from: r, reason: collision with root package name */
    public static final int f73157r = 8;

    /* renamed from: s, reason: collision with root package name */
    public static final float f73158s = 0.5f;

    /* renamed from: a, reason: collision with root package name */
    public TextView f73159a;

    /* renamed from: b, reason: collision with root package name */
    public TextPaint f73160b;

    /* renamed from: c, reason: collision with root package name */
    public float f73161c;

    /* renamed from: d, reason: collision with root package name */
    public int f73162d;

    /* renamed from: e, reason: collision with root package name */
    public float f73163e;

    /* renamed from: f, reason: collision with root package name */
    public float f73164f;

    /* renamed from: g, reason: collision with root package name */
    public float f73165g;

    /* renamed from: h, reason: collision with root package name */
    public float f73166h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f73167i;

    /* renamed from: j, reason: collision with root package name */
    public int f73168j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f73169k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f73170l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList<c> f73171m;

    /* renamed from: n, reason: collision with root package name */
    public TextWatcher f73172n;

    /* renamed from: o, reason: collision with root package name */
    public View.OnLayoutChangeListener f73173o;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @TargetApi(11)
    /* renamed from: me.grantland.widget.a$a, reason: collision with other inner class name */
    public class ViewOnLayoutChangeListenerC0884a implements View.OnLayoutChangeListener {
        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
            a.this.d();
        }

        public ViewOnLayoutChangeListenerC0884a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements TextWatcher {
        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int start, int before, int count) {
            a.this.d();
        }

        public b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int start, int count, int after) {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface c {
        void b(float textSize, float oldTextSize);
    }

    public a(TextView view) {
        this.f73172n = new b();
        this.f73173o = new ViewOnLayoutChangeListenerC0884a();
        float f11 = view.getContext().getResources().getDisplayMetrics().scaledDensity;
        this.f73159a = view;
        this.f73160b = new TextPaint();
        F(view.getTextSize());
        this.f73162d = l(view);
        this.f73163e = f11 * 8.0f;
        this.f73164f = this.f73161c;
        this.f73166h = 0.5f;
    }

    public static void e(TextView view, TextPaint paint, float minTextSize, float maxTextSize, float textSizeWhenMaxLine, int maxLines, float precision, int fixedTargetWidth) {
        if (maxLines <= 0 || maxLines == Integer.MAX_VALUE) {
            return;
        }
        int width = fixedTargetWidth > 0 ? fixedTargetWidth : (view.getWidth() - view.getPaddingLeft()) - view.getPaddingRight();
        if (width <= 0) {
            return;
        }
        CharSequence text = view.getText();
        TransformationMethod transformationMethod = view.getTransformationMethod();
        if (transformationMethod != null) {
            text = transformationMethod.getTransformation(text, view);
        }
        Context context = view.getContext();
        Resources system = Resources.getSystem();
        if (context != null) {
            system = context.getResources();
        }
        DisplayMetrics displayMetrics = system.getDisplayMetrics();
        paint.set(view.getPaint());
        paint.setTextSize(maxTextSize);
        if ((maxLines == 1 && paint.measureText(text, 0, text.length()) > width) || j(text, paint, maxTextSize, width, displayMetrics) > maxLines) {
            maxTextSize = i(text, paint, width, maxLines, 0.0f, maxTextSize, precision, displayMetrics);
        }
        if (new StaticLayout(text, paint, width, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true).getLineCount() >= maxLines && textSizeWhenMaxLine > 0.0f) {
            minTextSize = textSizeWhenMaxLine;
        } else if (maxTextSize >= minTextSize) {
            minTextSize = maxTextSize;
        }
        view.setTextSize(0, minTextSize);
    }

    public static a f(TextView view) {
        return h(view, null, 0);
    }

    public static a g(TextView view, AttributeSet attrs) {
        return h(view, attrs, 0);
    }

    public static a h(TextView view, AttributeSet attrs, int defStyle) {
        a aVar = new a(view);
        boolean z11 = true;
        if (attrs != null) {
            Context context = view.getContext();
            int n11 = (int) aVar.n();
            int q11 = (int) aVar.q();
            float o11 = aVar.o();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, R.styleable.AutofitTextView, defStyle, 0);
            boolean z12 = obtainStyledAttributes.getBoolean(3, true);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, n11);
            int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(4, q11);
            float f11 = obtainStyledAttributes.getFloat(2, o11);
            boolean z13 = obtainStyledAttributes.getBoolean(0, false);
            obtainStyledAttributes.recycle();
            aVar.B(0, dimensionPixelSize).K(0, dimensionPixelSize2).C(f11).w(z13);
            z11 = z12;
        }
        aVar.v(z11);
        return aVar;
    }

    public static float i(CharSequence text, TextPaint paint, float targetWidth, int maxLines, float low, float high, float precision, DisplayMetrics displayMetrics) {
        StaticLayout staticLayout;
        int i11;
        CharSequence charSequence;
        float f11;
        float f12 = (low + high) / 2.0f;
        paint.setTextSize(TypedValue.applyDimension(0, f12, displayMetrics));
        if (maxLines != 1) {
            staticLayout = new StaticLayout(text, paint, (int) targetWidth, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            i11 = staticLayout.getLineCount();
        } else {
            staticLayout = null;
            i11 = 1;
        }
        StaticLayout staticLayout2 = staticLayout;
        if (i11 <= maxLines) {
            if (i11 < maxLines) {
                return i(text, paint, targetWidth, maxLines, f12, high, precision, displayMetrics);
            }
            if (maxLines == 1) {
                charSequence = text;
                f11 = paint.measureText(charSequence, 0, text.length());
            } else {
                charSequence = text;
                f11 = 0.0f;
                for (int i12 = 0; i12 < i11; i12++) {
                    if (staticLayout2.getLineWidth(i12) > f11) {
                        f11 = staticLayout2.getLineWidth(i12);
                    }
                }
            }
            float f13 = f11;
            if (high - low >= precision) {
                return f13 > targetWidth ? i(charSequence, paint, targetWidth, maxLines, low, f12, precision, displayMetrics) : f13 < targetWidth ? i(text, paint, targetWidth, maxLines, f12, high, precision, displayMetrics) : f12;
            }
        } else if (high - low >= precision) {
            return i(text, paint, targetWidth, maxLines, low, f12, precision, displayMetrics);
        }
        return low;
    }

    public static int j(CharSequence text, TextPaint paint, float size, float width, DisplayMetrics displayMetrics) {
        paint.setTextSize(TypedValue.applyDimension(0, size, displayMetrics));
        return new StaticLayout(text, paint, (int) width, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true).getLineCount();
    }

    public static int l(TextView view) {
        TransformationMethod transformationMethod = view.getTransformationMethod();
        if (transformationMethod == null || !(transformationMethod instanceof SingleLineTransformationMethod)) {
            return view.getMaxLines();
        }
        return 1;
    }

    public a A(float size) {
        return B(2, size);
    }

    public a B(int unit, float size) {
        Context context = this.f73159a.getContext();
        Resources system = Resources.getSystem();
        if (context != null) {
            system = context.getResources();
        }
        E(TypedValue.applyDimension(unit, size, system.getDisplayMetrics()));
        return this;
    }

    public a C(float precision) {
        if (this.f73166h != precision) {
            this.f73166h = precision;
            d();
        }
        return this;
    }

    public final void D(float size) {
        if (size != this.f73164f) {
            this.f73164f = size;
            d();
        }
    }

    public final void E(float size) {
        if (size != this.f73163e) {
            this.f73163e = size;
            d();
        }
    }

    public final void F(float size) {
        if (this.f73161c != size) {
            this.f73161c = size;
        }
    }

    public final void G(float size) {
        if (size != this.f73165g) {
            this.f73165g = size;
            d();
        }
    }

    public void H(float size) {
        I(2, size);
    }

    public void I(int unit, float size) {
        if (this.f73170l) {
            return;
        }
        Context context = this.f73159a.getContext();
        Resources system = Resources.getSystem();
        if (context != null) {
            system = context.getResources();
        }
        F(TypedValue.applyDimension(unit, size, system.getDisplayMetrics()));
    }

    public a J(float size) {
        return K(2, size);
    }

    public a K(int unit, float size) {
        Context context = this.f73159a.getContext();
        Resources system = Resources.getSystem();
        if (context != null) {
            system = context.getResources();
        }
        G(TypedValue.applyDimension(unit, size, system.getDisplayMetrics()));
        return this;
    }

    @TargetApi(11)
    public final void b() {
        this.f73159a.addOnLayoutChangeListener(this.f73173o);
    }

    public a c(c listener) {
        if (this.f73171m == null) {
            this.f73171m = new ArrayList<>();
        }
        this.f73171m.add(listener);
        return this;
    }

    public final void d() {
        float textSize = this.f73159a.getTextSize();
        if (this.f73168j <= 0 && this.f73167i) {
            this.f73168j = (this.f73159a.getWidth() - this.f73159a.getPaddingLeft()) - this.f73159a.getPaddingRight();
        }
        this.f73170l = true;
        e(this.f73159a, this.f73160b, this.f73163e, this.f73164f, this.f73165g, this.f73162d, this.f73166h, this.f73168j);
        this.f73170l = false;
        float textSize2 = this.f73159a.getTextSize();
        if (textSize2 != textSize) {
            u(textSize2, textSize);
        }
    }

    public int k() {
        return this.f73162d;
    }

    public float m() {
        return this.f73164f;
    }

    public float n() {
        return this.f73163e;
    }

    public float o() {
        return this.f73166h;
    }

    public float p() {
        return this.f73161c;
    }

    public float q() {
        return this.f73165g;
    }

    public boolean r() {
        return this.f73169k;
    }

    @TargetApi(11)
    public final void s() {
        this.f73159a.removeOnLayoutChangeListener(this.f73173o);
    }

    public a t(c listener) {
        ArrayList<c> arrayList = this.f73171m;
        if (arrayList != null) {
            arrayList.remove(listener);
        }
        return this;
    }

    public final void u(float textSize, float oldTextSize) {
        ArrayList<c> arrayList = this.f73171m;
        if (arrayList == null) {
            return;
        }
        Iterator<c> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().b(textSize, oldTextSize);
        }
    }

    public a v(boolean enabled) {
        if (this.f73169k != enabled) {
            this.f73169k = enabled;
            if (enabled) {
                this.f73159a.addTextChangedListener(this.f73172n);
                b();
                d();
                return this;
            }
            this.f73159a.removeTextChangedListener(this.f73172n);
            s();
            this.f73159a.setTextSize(0, this.f73161c);
        }
        return this;
    }

    public a w(boolean lock) {
        this.f73167i = lock;
        return this;
    }

    public a x(int lines) {
        if (this.f73162d != lines) {
            this.f73162d = lines;
            d();
        }
        return this;
    }

    public a y(float size) {
        return z(2, size);
    }

    public a z(int unit, float size) {
        Context context = this.f73159a.getContext();
        Resources system = Resources.getSystem();
        if (context != null) {
            system = context.getResources();
        }
        D(TypedValue.applyDimension(unit, size, system.getDisplayMetrics()));
        return this;
    }
}

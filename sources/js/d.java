package js;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.ImageView;
import com.squareup.picasso.g0;
import java.util.Arrays;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    public float[] f64652b = {0.0f, 0.0f, 0.0f, 0.0f};

    /* renamed from: c, reason: collision with root package name */
    public boolean f64653c = false;

    /* renamed from: d, reason: collision with root package name */
    public float f64654d = 0.0f;

    /* renamed from: e, reason: collision with root package name */
    public ColorStateList f64655e = ColorStateList.valueOf(-16777216);

    /* renamed from: f, reason: collision with root package name */
    public ImageView.ScaleType f64656f = ImageView.ScaleType.FIT_CENTER;

    /* renamed from: a, reason: collision with root package name */
    public final DisplayMetrics f64651a = Resources.getSystem().getDisplayMetrics();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements g0 {
        public a() {
        }

        @Override // com.squareup.picasso.g0
        public String key() {
            return "r:" + Arrays.toString(d.this.f64652b) + "b:" + d.this.f64654d + "c:" + d.this.f64655e + "o:" + d.this.f64653c;
        }

        @Override // com.squareup.picasso.g0
        public Bitmap transform(Bitmap bitmap) {
            Bitmap C = c.d(bitmap).z(d.this.f64656f).w(d.this.f64652b[0], d.this.f64652b[1], d.this.f64652b[2], d.this.f64652b[3]).u(d.this.f64654d).t(d.this.f64655e).y(d.this.f64653c).C();
            if (!bitmap.equals(C)) {
                bitmap.recycle();
            }
            return C;
        }
    }

    public d f(int i11) {
        this.f64655e = ColorStateList.valueOf(i11);
        return this;
    }

    public d g(ColorStateList colorStateList) {
        this.f64655e = colorStateList;
        return this;
    }

    public d h(float f11) {
        this.f64654d = f11;
        return this;
    }

    public d i(float f11) {
        this.f64654d = TypedValue.applyDimension(1, f11, this.f64651a);
        return this;
    }

    public g0 j() {
        return new a();
    }

    public d k(float f11) {
        float[] fArr = this.f64652b;
        fArr[0] = f11;
        fArr[1] = f11;
        fArr[2] = f11;
        fArr[3] = f11;
        return this;
    }

    public d l(int i11, float f11) {
        this.f64652b[i11] = f11;
        return this;
    }

    public d m(float f11) {
        return k(TypedValue.applyDimension(1, f11, this.f64651a));
    }

    public d n(int i11, float f11) {
        return l(i11, TypedValue.applyDimension(1, f11, this.f64651a));
    }

    public d o(boolean z11) {
        this.f64653c = z11;
        return this;
    }

    public d p(ImageView.ScaleType scaleType) {
        this.f64656f = scaleType;
        return this;
    }
}

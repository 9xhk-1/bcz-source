package b1;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.Nullable;
import c1.h;
import j1.f;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class a {

    /* renamed from: d, reason: collision with root package name */
    public final AssetManager f5658d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    public com.airbnb.lottie.c f5659e;

    /* renamed from: a, reason: collision with root package name */
    public final h<String> f5655a = new h<>();

    /* renamed from: b, reason: collision with root package name */
    public final Map<h<String>, Typeface> f5656b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final Map<String, Typeface> f5657c = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public String f5660f = ".ttf";

    public a(Drawable.Callback callback, @Nullable com.airbnb.lottie.c cVar) {
        this.f5659e = cVar;
        if (callback instanceof View) {
            this.f5658d = ((View) callback).getContext().getAssets();
        } else {
            f.e("LottieDrawable must be inside of a view for images to work.");
            this.f5658d = null;
        }
    }

    public final Typeface a(String str) {
        String b11;
        Typeface typeface = this.f5657c.get(str);
        if (typeface != null) {
            return typeface;
        }
        com.airbnb.lottie.c cVar = this.f5659e;
        Typeface a11 = cVar != null ? cVar.a(str) : null;
        com.airbnb.lottie.c cVar2 = this.f5659e;
        if (cVar2 != null && a11 == null && (b11 = cVar2.b(str)) != null) {
            a11 = Typeface.createFromAsset(this.f5658d, b11);
        }
        if (a11 == null) {
            a11 = Typeface.createFromAsset(this.f5658d, "fonts/" + str + this.f5660f);
        }
        this.f5657c.put(str, a11);
        return a11;
    }

    public Typeface b(String str, String str2) {
        this.f5655a.b(str, str2);
        Typeface typeface = this.f5656b.get(this.f5655a);
        if (typeface != null) {
            return typeface;
        }
        Typeface e11 = e(a(str), str2);
        this.f5656b.put(this.f5655a, e11);
        return e11;
    }

    public void c(String str) {
        this.f5660f = str;
    }

    public void d(@Nullable com.airbnb.lottie.c cVar) {
        this.f5659e = cVar;
    }

    public final Typeface e(Typeface typeface, String str) {
        boolean contains = str.contains("Italic");
        boolean contains2 = str.contains("Bold");
        int i11 = (contains && contains2) ? 3 : contains ? 2 : contains2 ? 1 : 0;
        return typeface.getStyle() == i11 ? typeface : Typeface.create(typeface, i11);
    }
}

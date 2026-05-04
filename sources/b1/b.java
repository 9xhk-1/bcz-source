package b1;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import androidx.annotation.Nullable;
import com.airbnb.lottie.d;
import com.airbnb.lottie.p0;
import j1.f;
import j1.j;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class b {

    /* renamed from: e, reason: collision with root package name */
    public static final Object f5661e = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Context f5662a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5663b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    public d f5664c;

    /* renamed from: d, reason: collision with root package name */
    public final Map<String, p0> f5665d;

    public b(Drawable.Callback callback, String str, d dVar, Map<String, p0> map) {
        if (TextUtils.isEmpty(str) || str.charAt(str.length() - 1) == '/') {
            this.f5663b = str;
        } else {
            this.f5663b = str + '/';
        }
        if (callback instanceof View) {
            this.f5662a = ((View) callback).getContext();
            this.f5665d = map;
            e(dVar);
        } else {
            f.e("LottieDrawable must be inside of a view for images to work.");
            this.f5665d = new HashMap();
            this.f5662a = null;
        }
    }

    @Nullable
    public Bitmap a(String str) {
        p0 p0Var = this.f5665d.get(str);
        if (p0Var == null) {
            return null;
        }
        Bitmap a11 = p0Var.a();
        if (a11 != null) {
            return a11;
        }
        d dVar = this.f5664c;
        if (dVar != null) {
            Bitmap a12 = dVar.a(p0Var);
            if (a12 != null) {
                d(str, a12);
            }
            return a12;
        }
        String c11 = p0Var.c();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = 160;
        if (c11.startsWith("data:") && c11.indexOf("base64,") > 0) {
            try {
                byte[] decode = Base64.decode(c11.substring(c11.indexOf(44) + 1), 0);
                return d(str, BitmapFactory.decodeByteArray(decode, 0, decode.length, options));
            } catch (IllegalArgumentException e11) {
                f.f("data URL did not have correct base64 format.", e11);
                return null;
            }
        }
        try {
            if (TextUtils.isEmpty(this.f5663b)) {
                throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
            }
            try {
                return d(str, j.m(BitmapFactory.decodeStream(this.f5662a.getAssets().open(this.f5663b + c11), null, options), p0Var.f(), p0Var.d()));
            } catch (IllegalArgumentException e12) {
                f.f("Unable to decode image.", e12);
                return null;
            }
        } catch (IOException e13) {
            f.f("Unable to open asset.", e13);
            return null;
        }
    }

    @Nullable
    public p0 b(String str) {
        return this.f5665d.get(str);
    }

    public boolean c(Context context) {
        return (context == null && this.f5662a == null) || this.f5662a.equals(context);
    }

    public final Bitmap d(String str, @Nullable Bitmap bitmap) {
        synchronized (f5661e) {
            this.f5665d.get(str).h(bitmap);
        }
        return bitmap;
    }

    public void e(@Nullable d dVar) {
        this.f5664c = dVar;
    }

    @Nullable
    public Bitmap f(String str, @Nullable Bitmap bitmap) {
        if (bitmap != null) {
            Bitmap a11 = this.f5665d.get(str).a();
            d(str, bitmap);
            return a11;
        }
        p0 p0Var = this.f5665d.get(str);
        Bitmap a12 = p0Var.a();
        p0Var.h(null);
        return a12;
    }
}

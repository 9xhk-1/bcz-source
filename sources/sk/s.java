package sk;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import androidx.annotation.Nullable;
import java.util.concurrent.locks.Lock;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public static final String f88795a = "DrawableToBitmap";

    /* renamed from: b, reason: collision with root package name */
    public static final lk.e f88796b = new a();

    @Nullable
    public static kk.u<Bitmap> a(lk.e eVar, Drawable drawable, int i11, int i12) {
        Bitmap bitmap;
        Drawable current = drawable.getCurrent();
        boolean z11 = false;
        if (current instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) current).getBitmap();
        } else if (current instanceof Animatable) {
            bitmap = null;
        } else {
            bitmap = b(eVar, current, i11, i12);
            z11 = true;
        }
        if (!z11) {
            eVar = f88796b;
        }
        return h.c(bitmap, eVar);
    }

    @Nullable
    public static Bitmap b(lk.e eVar, Drawable drawable, int i11, int i12) {
        if (i11 == Integer.MIN_VALUE && drawable.getIntrinsicWidth() <= 0) {
            if (Log.isLoggable(f88795a, 5)) {
                Log.w(f88795a, "Unable to draw " + drawable + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width");
            }
            return null;
        }
        if (i12 == Integer.MIN_VALUE && drawable.getIntrinsicHeight() <= 0) {
            if (Log.isLoggable(f88795a, 5)) {
                Log.w(f88795a, "Unable to draw " + drawable + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height");
            }
            return null;
        }
        if (drawable.getIntrinsicWidth() > 0) {
            i11 = drawable.getIntrinsicWidth();
        }
        if (drawable.getIntrinsicHeight() > 0) {
            i12 = drawable.getIntrinsicHeight();
        }
        Lock i13 = z0.i();
        i13.lock();
        Bitmap f11 = eVar.f(i11, i12, Bitmap.Config.ARGB_8888);
        try {
            Canvas canvas = new Canvas(f11);
            drawable.setBounds(0, 0, i11, i12);
            drawable.draw(canvas);
            canvas.setBitmap(null);
            return f11;
        } finally {
            i13.unlock();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends lk.f {
        @Override // lk.f, lk.e
        public void e(Bitmap bitmap) {
        }
    }
}

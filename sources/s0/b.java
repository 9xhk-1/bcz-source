package s0;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import q0.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nCircleCropTransformation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CircleCropTransformation.kt\ncoil/transform/CircleCropTransformation\n+ 2 Bitmap.kt\nandroidx/core/graphics/BitmapKt\n*L\n1#1,41:1\n95#2:42\n43#2,3:43\n*S KotlinDebug\n*F\n+ 1 CircleCropTransformation.kt\ncoil/transform/CircleCropTransformation\n*L\n27#1:42\n28#1:43,3\n*E\n"})
/* loaded from: classes3.dex */
public final class b implements d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f87062a = b.class.getName();

    @Override // s0.d
    @l
    public Object a(@k Bitmap bitmap, @k g gVar, @k j00.c<? super Bitmap> cVar) {
        Paint paint = new Paint(3);
        int min = Math.min(bitmap.getWidth(), bitmap.getHeight());
        float f11 = min / 2.0f;
        Bitmap createBitmap = Bitmap.createBitmap(min, min, u0.a.d(bitmap));
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawCircle(f11, f11, f11, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, f11 - (bitmap.getWidth() / 2.0f), f11 - (bitmap.getHeight() / 2.0f), paint);
        return createBitmap;
    }

    public boolean equals(@l Object obj) {
        return obj instanceof b;
    }

    @Override // s0.d
    @k
    public String getCacheKey() {
        return this.f87062a;
    }

    public int hashCode() {
        return b.class.hashCode();
    }
}

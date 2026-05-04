package f0;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.exifinterface.media.ExifInterface;
import coil.decode.ExifOrientationPolicy;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nExifUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExifUtils.kt\ncoil/decode/ExifUtils\n+ 2 Bitmap.kt\nandroidx/core/graphics/BitmapKt\n*L\n1#1,132:1\n95#2:133\n95#2:134\n43#2,3:135\n*S KotlinDebug\n*F\n+ 1 ExifUtils.kt\ncoil/decode/ExifUtils\n*L\n65#1:133\n67#1:134\n70#1:135,3\n*E\n"})
/* loaded from: classes3.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final k f50295a = new k();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final Paint f50296b = new Paint(3);

    @m80.k
    public final i a(@m80.l String str, @m80.k l60.m mVar, @m80.k ExifOrientationPolicy exifOrientationPolicy) {
        if (!l.c(exifOrientationPolicy, str)) {
            return i.f50290d;
        }
        ExifInterface exifInterface = new ExifInterface(new j(mVar.peek().R8()));
        return new i(exifInterface.isFlipped(), exifInterface.getRotationDegrees());
    }

    @m80.k
    public final Bitmap b(@m80.k Bitmap bitmap, @m80.k i iVar) {
        if (!iVar.b() && !l.a(iVar)) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float width = bitmap.getWidth() / 2.0f;
        float height = bitmap.getHeight() / 2.0f;
        if (iVar.b()) {
            matrix.postScale(-1.0f, 1.0f, width, height);
        }
        if (l.a(iVar)) {
            matrix.postRotate(iVar.a(), width, height);
        }
        RectF rectF = new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
        matrix.mapRect(rectF);
        float f11 = rectF.left;
        if (f11 != 0.0f || rectF.top != 0.0f) {
            matrix.postTranslate(-f11, -rectF.top);
        }
        Bitmap createBitmap = l.b(iVar) ? Bitmap.createBitmap(bitmap.getHeight(), bitmap.getWidth(), u0.a.d(bitmap)) : Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), u0.a.d(bitmap));
        new Canvas(createBitmap).drawBitmap(bitmap, matrix, f50296b);
        bitmap.recycle();
        return createBitmap;
    }
}

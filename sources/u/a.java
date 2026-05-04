package u;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class a {
    public static int a(BitmapFactory.Options options, int reqWidth, int reqHeight) {
        int i11 = options.outHeight;
        int i12 = options.outWidth;
        if (i11 <= reqHeight && i12 <= reqWidth) {
            return 1;
        }
        int round = Math.round(i11 / reqHeight);
        int round2 = Math.round(i12 / reqWidth);
        return round < round2 ? round : round2;
    }

    public static Bitmap b(Resources res, int resId, int reqWidth, int reqHeight) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(res, resId, options);
        options.inSampleSize = a(options, reqWidth, reqHeight);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeResource(res, resId, options);
    }

    public static Bitmap c(String path) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(path, options);
        options.inSampleSize = a(options, 480, 800);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeFile(path, options);
    }
}

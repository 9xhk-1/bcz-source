package w;

import android.content.Context;
import android.graphics.Bitmap;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import java.util.Hashtable;
import java.util.Vector;
import kp.i;
import kp.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class a {

    /* renamed from: b, reason: collision with root package name */
    public static final String f94423b = "BitmapDecoder";

    /* renamed from: c, reason: collision with root package name */
    public static final int f94424c = 1500;

    /* renamed from: a, reason: collision with root package name */
    public com.google.zxing.f f94425a = new com.google.zxing.f();

    public a(Context context) {
        Hashtable hashtable = new Hashtable(2);
        Vector vector = new Vector();
        if (vector.isEmpty()) {
            vector = new Vector();
            vector.addAll(d.f94438c);
            vector.addAll(d.f94439d);
            vector.addAll(d.f94440e);
        }
        hashtable.put(DecodeHintType.POSSIBLE_FORMATS, vector);
        hashtable.put(DecodeHintType.CHARACTER_SET, k.f68584e);
        hashtable.put(DecodeHintType.TRY_HARDER, Boolean.TRUE);
        this.f94425a.e(hashtable);
    }

    public com.google.zxing.k a(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        try {
            if (bitmap.getWidth() > bitmap.getHeight() && bitmap.getWidth() > 1500) {
                bitmap = Bitmap.createScaledBitmap(bitmap, 1500, (bitmap.getHeight() * 1500) / bitmap.getWidth(), true);
            } else if (bitmap.getWidth() <= bitmap.getHeight() && bitmap.getHeight() > 1500) {
                bitmap = Bitmap.createScaledBitmap(bitmap, (bitmap.getWidth() * 1500) / bitmap.getHeight(), 1500, true);
            }
            Bitmap bitmap2 = bitmap;
            int width = bitmap2.getWidth();
            int height = bitmap2.getHeight();
            int[] iArr = new int[width * height];
            qb.c.i(f94423b, "decodeFromPicture: %dM w %d h %d", Integer.valueOf((bitmap2.getByteCount() / 1024) / 1024), Integer.valueOf(width), Integer.valueOf(height));
            bitmap2.getPixels(iArr, 0, width, 0, 0, width, height);
            return this.f94425a.d(new com.google.zxing.b(new i(new com.google.zxing.i(width, height, iArr))));
        } catch (NotFoundException e11) {
            qb.c.c(f94423b, "", e11);
            return null;
        }
    }
}

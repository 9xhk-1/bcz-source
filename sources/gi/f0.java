package gi;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;
import com.jiongji.andriod.card.R;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class f0 {

    /* renamed from: a, reason: collision with root package name */
    public static Map<Integer, Bitmap> f53761a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f53762b = {R.drawable.ic_result_mid_right, R.drawable.ic_result_mid_wrong, R.drawable.right_big_normal_default, R.drawable.wrong_big_normal_default, R.drawable.ic_state_check, R.drawable.ic_state_slash, R.drawable.ic_state_right, R.drawable.ic_state_wrong, R.drawable.image_broke_normal_default};

    public static Bitmap a(Context context, int resId) {
        Bitmap bitmap = f53761a.get(Integer.valueOf(resId));
        if (bitmap != null) {
            return bitmap;
        }
        c(context.getResources(), resId);
        return f53761a.get(Integer.valueOf(resId));
    }

    public static void b(Context context, int... resIds) {
        Resources resources = context.getResources();
        for (int i11 : resIds) {
            if (!f53761a.containsKey(Integer.valueOf(i11))) {
                c(resources, i11);
            }
        }
    }

    public static void c(Resources resources, int resId) {
        Bitmap decodeResource = BitmapFactory.decodeResource(resources, resId);
        if (decodeResource != null) {
            f53761a.put(Integer.valueOf(resId), decodeResource);
        }
    }

    public static void d() {
        f53761a.clear();
    }

    public static void e(ImageView imageView, int resId) {
        imageView.setImageBitmap(a(imageView.getContext(), resId));
    }
}

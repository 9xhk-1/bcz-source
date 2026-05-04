package bg;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.Log;
import android.util.LruCache;
import com.baicizhan.client.business.util.TimeUtil;
import com.baicizhan.online.user_study_api.UserDakaSpecialDay;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.e0;
import java.util.Calendar;
import java.util.List;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final LruCache<String, Bitmap> f6812a = new a(1048576);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends LruCache<String, Bitmap> {
        public a(int maxSize) {
            super(maxSize);
        }

        @Override // android.util.LruCache
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int sizeOf(String key, Bitmap bitmap) {
            return bitmap.getByteCount() / 1024;
        }
    }

    public static /* synthetic */ g2 a(UserDakaSpecialDay userDakaSpecialDay, Bitmap bitmap) {
        b(userDakaSpecialDay.img_url, bitmap);
        return null;
    }

    public static void b(String url, Bitmap bitmap) {
        if (bitmap != null) {
            LruCache<String, Bitmap> lruCache = f6812a;
            if (lruCache.get(url) == null) {
                lruCache.put(url, bitmap);
            }
        }
    }

    public static Bitmap c(String url) {
        return f6812a.get(url);
    }

    public static void d(Context context, List<UserDakaSpecialDay> specialDates) {
        if (Looper.getMainLooper() != Looper.myLooper() || specialDates == null || specialDates.isEmpty()) {
            return;
        }
        Calendar calendar = Calendar.getInstance(context.getResources().getConfiguration().locale);
        for (final UserDakaSpecialDay userDakaSpecialDay : specialDates) {
            Calendar calendar2 = Calendar.getInstance(context.getResources().getConfiguration().locale);
            calendar2.setTimeInMillis(TimeUtil.convert2Time(userDakaSpecialDay.date));
            if (bg.a.e(calendar, calendar2) || (calendar2.getTimeInMillis() >= calendar.getTimeInMillis() && bg.a.f(calendar, calendar2))) {
                hc.c.p(userDakaSpecialDay.img_url).l(new l() { // from class: bg.b
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        return c.a(UserDakaSpecialDay.this, (Bitmap) obj);
                    }
                }, null);
                return;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b implements e0 {

        /* renamed from: a, reason: collision with root package name */
        public final String f6813a;

        public b(String url) {
            this.f6813a = url;
        }

        @Override // com.squareup.picasso.e0
        public void onBitmapFailed(Exception e11, Drawable drawable) {
            qb.c.c("PreloadSpecialImage", "", e11);
        }

        @Override // com.squareup.picasso.e0
        public void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
            Log.d("whiz", "cache special bmp: " + bitmap);
            c.b(this.f6813a, bitmap);
        }

        @Override // com.squareup.picasso.e0
        public void onPrepareLoad(Drawable drawable) {
        }
    }
}

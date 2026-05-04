package com.baicizhan.client.business.util;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.ImageView;
import com.jiongji.andriod.card.R;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.g0;
import java.io.File;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class PicassoUtil {
    public static final String TAG = "PicassoUtil";
    private static com.squareup.picasso.p sPicassoMemoryCache;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum Corners {
        NONE(0),
        TOP(8),
        BOTTOM(4),
        LEFT(2),
        RIGHT(1),
        TOP_LEFT(10),
        TOP_RIGHT(9),
        BOTTOM_LEFT(6),
        BOTTOM_RIGHT(5),
        ALL(15);

        private int code;

        Corners(int code) {
            this.code = code;
        }

        public int getCode() {
            return this.code;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class LoadErrorListener implements Picasso.d {
        @Override // com.squareup.picasso.Picasso.d
        public void onImageLoadFailed(Picasso picasso, Uri uri, Exception e11) {
            qb.c.c(PicassoUtil.TAG, "loadfailed " + uri.toString(), e11);
        }

        private LoadErrorListener() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class RoundedTransformation implements g0 {
        private final Corners corners;
        private final int radius;
        private String uniqueCode;

        public RoundedTransformation(final int radius, Corners corners) {
            this.radius = radius;
            this.corners = corners;
            this.uniqueCode = "rounded(radius=" + radius + ", corners=" + corners + pn.j.f81007d;
        }

        @Override // com.squareup.picasso.g0
        public String key() {
            return this.uniqueCode;
        }

        @Override // com.squareup.picasso.g0
        public Bitmap transform(final Bitmap source) {
            boolean z11;
            float f11;
            int width = source.getWidth();
            int height = source.getHeight();
            Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            Paint paint = new Paint();
            Rect rect = new Rect(0, 0, width, height);
            RectF rectF = new RectF(rect);
            float f12 = this.radius;
            paint.setAntiAlias(true);
            canvas.drawARGB(0, 0, 0, 0);
            paint.setColor(-15658735);
            canvas.drawRoundRect(rectF, f12, f12, paint);
            boolean z12 = (this.corners.getCode() & Corners.TOP.getCode()) > 0;
            boolean z13 = (this.corners.getCode() & Corners.BOTTOM.getCode()) > 0;
            boolean z14 = (this.corners.getCode() & Corners.LEFT.getCode()) > 0;
            boolean z15 = (this.corners.getCode() & Corners.RIGHT.getCode()) > 0;
            if (z14) {
                z11 = z15;
                f11 = f12;
            } else {
                z11 = z15;
                f11 = 0.0f;
            }
            float f13 = z12 ? f12 : 0.0f;
            float f14 = width;
            if (z11) {
                f14 -= f12;
            }
            float f15 = height;
            if (z13) {
                f15 -= f12;
            }
            canvas.drawRect(f11, f13, f14, f15, paint);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            canvas.drawBitmap(source, rect, rect, paint);
            source.recycle();
            return createBitmap;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserCountImageAdapter extends StrongRefTarget {
        private UserCountImageLoader mLoader;
        private ImageView mTargetView;

        public UserCountImageAdapter(ImageView view, UserCountImageLoader loader) {
            this.mTargetView = view;
            this.mLoader = loader;
        }

        @Override // com.baicizhan.client.business.util.StrongRefTarget
        public void onBitmapFailedImpl(Drawable drawable) {
            ImageView imageView = this.mTargetView;
            if (imageView != null) {
                imageView.setImageDrawable(drawable);
            }
            UserCountImageLoader userCountImageLoader = this.mLoader;
            if (userCountImageLoader != null) {
                userCountImageLoader.onImageLoaded(drawable);
            }
        }

        @Override // com.baicizhan.client.business.util.StrongRefTarget
        public void onBitmapLoadedImpl(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
            ImageView imageView = this.mTargetView;
            if (imageView != null) {
                imageView.setImageBitmap(bitmap);
            }
            UserCountImageLoader userCountImageLoader = this.mLoader;
            if (userCountImageLoader != null) {
                userCountImageLoader.onImageLoaded(bitmap);
            }
        }

        @Override // com.baicizhan.client.business.util.StrongRefTarget
        public void onPrepareLoadImpl(Drawable drawable) {
            ImageView imageView = this.mTargetView;
            if (imageView != null) {
                imageView.setImageDrawable(drawable);
            }
            UserCountImageLoader userCountImageLoader = this.mLoader;
            if (userCountImageLoader != null) {
                userCountImageLoader.onImageLoaded(drawable);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface UserCountImageLoader {
        void onImageLoaded(Object bitmap);
    }

    public static BitmapDrawable flip(Resources res, BitmapDrawable d11) {
        Matrix matrix = new Matrix();
        matrix.preScale(-1.0f, 1.0f);
        Bitmap bitmap = d11.getBitmap();
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false);
        createBitmap.setDensity(160);
        return new BitmapDrawable(res, createBitmap);
    }

    public static Point getBitmapSize(File file) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(file.getAbsolutePath(), options);
        Point point = new Point();
        point.x = options.outWidth;
        point.y = options.outHeight;
        return point;
    }

    public static void initPicasso(Context context) {
        initPicasso(context, true);
    }

    public static void loadAccountUserImage(Context context, String url, ImageView imageView, int errorDrawable) {
        loadAccountUserImage(context, url, imageView, 0, errorDrawable);
    }

    public static com.squareup.picasso.z loadFromZpk(String zpkPath, String imageName) {
        return Picasso.k().s(ZpkConfig.getImageUri(zpkPath, imageName));
    }

    public static void loadUserImage(Context context, ImageView view, String imageUrl) {
        Picasso.k().c(view);
        if (imageUrl == null || TextUtils.isEmpty(imageUrl.trim())) {
            view.setImageResource(R.drawable.defaultavatarbig_normal_default);
        } else {
            Picasso.k().u(imageUrl).C(R.drawable.defaultavatarbig_normal_default).g(R.drawable.defaultavatarbig_normal_default).o(view);
        }
    }

    public static void loadWikiDeformation(Context context, ImageView view, String imageUrl) {
        Picasso.k().c(view);
        if (imageUrl == null || TextUtils.isEmpty(imageUrl.trim())) {
            view.setImageResource(R.drawable.wiki_xiangxing_defult);
        } else {
            Picasso.k().u(imageUrl).C(R.drawable.wiki_xiangxing_defult).g(R.drawable.wiki_xiangxing_broken).o(view);
        }
    }

    public static void loadWikiSentenceImage(Context context, ImageView view, String imageUrl) {
        Picasso.k().c(view);
        if (imageUrl == null || TextUtils.isEmpty(imageUrl.trim())) {
            view.setImageResource(R.drawable.wiki_picture_defult);
        } else {
            Picasso.k().u(imageUrl).C(R.drawable.wiki_picture_defult).g(R.drawable.wiki_picture_broken).o(view);
        }
    }

    public static void releaseMemory() {
        com.squareup.picasso.p pVar = sPicassoMemoryCache;
        if (pVar != null) {
            pVar.clear();
        }
    }

    public static void initPicasso(Context context, boolean useCustomCache) {
        Picasso b11;
        if (useCustomCache) {
            sPicassoMemoryCache = new com.squareup.picasso.p(5242880);
            b11 = new Picasso.b(context).a(new ZpkPicassoRequestHandler()).i(sPicassoMemoryCache).g(new LoadErrorListener()).b();
        } else {
            b11 = new Picasso.b(context).a(new ZpkPicassoRequestHandler()).g(new LoadErrorListener()).b();
        }
        Picasso.B(b11);
    }

    public static void loadAccountUserImage(Context context, String url, ImageView imageView, int placeholder, int errorDrawable) {
        loadAccountUserImage(context, url, imageView, placeholder, errorDrawable, null);
    }

    public static void loadAccountUserImage(Context context, String url, int errorDrawable, UserCountImageLoader loader) {
        loadAccountUserImage(context, url, null, 0, errorDrawable, loader);
    }

    public static void loadAccountUserImage(Context context, String url, ImageView imageView, int placeholder, int errorDrawable, UserCountImageLoader loader) {
        if (!TextUtils.isEmpty(url)) {
            com.squareup.picasso.z u11 = Picasso.k().u(url);
            if (placeholder != 0) {
                u11.C(placeholder);
            }
            if (errorDrawable != 0) {
                u11.g(errorDrawable);
            }
            u11.v(new UserCountImageAdapter(imageView, loader));
            return;
        }
        if (placeholder <= 0) {
            placeholder = errorDrawable > 0 ? errorDrawable : 0;
        }
        if (placeholder > 0 && (imageView != null || loader != null)) {
            Picasso.k().r(placeholder).v(new UserCountImageAdapter(imageView, loader));
        } else {
            if (placeholder != 0 || loader == null) {
                return;
            }
            loader.onImageLoaded(null);
        }
    }
}

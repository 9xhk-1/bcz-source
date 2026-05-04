package com.baicizhan.client.business.util.photo;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import androidx.core.content.FileProvider;
import com.baicizhan.client.business.util.FileUtils;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.concurrent.Callable;
import rx.c;
import va.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class PhotoPuller {
    public static final int REQUEST_PICK = 9162;
    public static final int REQUEST_TAKE = 11615;
    public static final String TAG = "PhotoPuller";

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Compress {
        private boolean asPng = false;
        private Uri destination;
        private int maxHeight;
        private int maxSaveSize;
        private int maxWidth;
        private Uri source;

        private Compress(Uri source, Uri destination) {
            this.source = source;
            this.destination = destination;
        }

        public static Compress of(Uri source, Uri destination) {
            return new Compress(source, destination);
        }

        public Compress asPng(boolean asPng) {
            this.asPng = asPng;
            return this;
        }

        public Compress withMaxSaveSize(int size) {
            this.maxSaveSize = size;
            return this;
        }

        public Compress withMaxSize(int width, int height) {
            this.maxWidth = width;
            this.maxHeight = height;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int calculateBitmapSampleSize(Context context, Compress compress) throws IOException {
        BitmapFactory.Options options = new BitmapFactory.Options();
        int i11 = 1;
        options.inJustDecodeBounds = true;
        InputStream inputStream = null;
        try {
            InputStream openInputStream = context.getContentResolver().openInputStream(compress.source);
            try {
                BitmapFactory.decodeStream(openInputStream, null, options);
                FileUtils.closeQuietly(openInputStream);
                while (true) {
                    if (options.outHeight / i11 <= compress.maxHeight && options.outWidth / i11 <= compress.maxWidth) {
                        return i11;
                    }
                    i11 <<= 1;
                }
            } catch (Throwable th2) {
                th = th2;
                inputStream = openInputStream;
                FileUtils.closeQuietly(inputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static c<Uri> compress(final Context context, final Compress compress) {
        return c.z2(new Callable<Uri>() { // from class: com.baicizhan.client.business.util.photo.PhotoPuller.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Uri call() throws Exception {
                int calculateBitmapSampleSize;
                BitmapFactory.Options options;
                InputStream openInputStream;
                InputStream inputStream = null;
                try {
                    try {
                        calculateBitmapSampleSize = (Compress.this.maxWidth <= 0 || Compress.this.maxHeight <= 0) ? 1 : PhotoPuller.calculateBitmapSampleSize(context, Compress.this);
                        options = new BitmapFactory.Options();
                        options.inSampleSize = calculateBitmapSampleSize;
                        openInputStream = context.getContentResolver().openInputStream(Compress.this.source);
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (IOException e11) {
                    e = e11;
                }
                try {
                    Bitmap decodeStream = BitmapFactory.decodeStream(openInputStream, null, options);
                    FileUtils.closeQuietly(openInputStream);
                    if (Compress.this.maxSaveSize > 0) {
                        decodeStream = PhotoPuller.compressBelowSaveSize(context, decodeStream, calculateBitmapSampleSize, Compress.this);
                    }
                    PhotoPuller.save(context, decodeStream, Compress.this);
                    FileUtils.closeQuietly(openInputStream);
                } catch (IOException e12) {
                    e = e12;
                    inputStream = openInputStream;
                    qb.c.d(PhotoPuller.TAG, "compress failed. " + e, new Object[0]);
                    FileUtils.closeQuietly(inputStream);
                    return Compress.this.destination;
                } catch (Throwable th3) {
                    th = th3;
                    inputStream = openInputStream;
                    FileUtils.closeQuietly(inputStream);
                    throw th;
                }
                return Compress.this.destination;
            }
        }).w5(bc0.c.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static Bitmap compressBelowSaveSize(Context context, Bitmap bitmap, int initSampleSize, Compress compress) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream;
        InputStream inputStream = null;
        try {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
            } catch (OutOfMemoryError e11) {
                e = e11;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            bitmap.compress(compress.asPng ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
            if (byteArrayOutputStream.toByteArray().length <= compress.maxSaveSize * 1024) {
                FileUtils.closeQuietly(byteArrayOutputStream);
                return bitmap;
            }
            byteArrayOutputStream.reset();
            int i11 = initSampleSize << 1;
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = i11;
                InputStream openInputStream = context.getContentResolver().openInputStream(compress.source);
                try {
                    Bitmap decodeStream = BitmapFactory.decodeStream(openInputStream, null, options);
                    FileUtils.closeQuietly(openInputStream);
                    Bitmap compressBelowSaveSize = compressBelowSaveSize(context, decodeStream, i11, compress);
                    FileUtils.closeQuietly(openInputStream);
                    FileUtils.closeQuietly(byteArrayOutputStream);
                    return compressBelowSaveSize;
                } catch (Throwable th3) {
                    th = th3;
                    inputStream = openInputStream;
                    FileUtils.closeQuietly(inputStream);
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (OutOfMemoryError e12) {
            e = e12;
            inputStream = byteArrayOutputStream;
            qb.c.c(TAG, "OutOfMemoryError occurred when compress. ", e);
            FileUtils.closeQuietly(inputStream);
            return bitmap;
        } catch (Throwable th5) {
            th = th5;
            inputStream = byteArrayOutputStream;
            FileUtils.closeQuietly(inputStream);
            throw th;
        }
    }

    public static void pick(Activity activity) {
        try {
            activity.startActivityForResult(new Intent("android.intent.action.GET_CONTENT").setType("image/*"), 9162);
        } catch (Exception e11) {
            qb.c.c(TAG, "pick:", e11);
            g.i("无效的图片", 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void save(Context context, Bitmap bitmap, Compress compress) throws IOException {
        OutputStream outputStream = null;
        try {
            outputStream = context.getContentResolver().openOutputStream(compress.destination);
            if (outputStream != null) {
                bitmap.compress(compress.asPng ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG, 100, outputStream);
            }
            FileUtils.closeQuietly(outputStream);
        } catch (Throwable th2) {
            FileUtils.closeQuietly(outputStream);
            throw th2;
        }
    }

    public static String take(Activity activity) {
        try {
            File file = new File(activity.getCacheDir(), "photo_take");
            Uri uriForFile = FileProvider.getUriForFile(activity, "com.jiongji.andriod.card.fileprovider", file);
            Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
            intent.putExtra("output", uriForFile);
            if (intent.resolveActivity(activity.getPackageManager()) == null) {
                g.i("无法打开相机", 0);
                return null;
            }
            Iterator<ResolveInfo> it = activity.getPackageManager().queryIntentActivities(intent, 65536).iterator();
            while (it.hasNext()) {
                activity.grantUriPermission(it.next().activityInfo.packageName, uriForFile, 3);
            }
            activity.startActivityForResult(intent, 11615);
            return file.getAbsolutePath();
        } catch (Exception e11) {
            qb.c.c(TAG, "take:", e11);
            g.i("无法打开相机", 0);
            return null;
        }
    }
}

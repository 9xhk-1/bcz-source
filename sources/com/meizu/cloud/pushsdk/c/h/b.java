package com.meizu.cloud.pushsdk.c.h;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.NetworkOnMainThreadException;
import android.widget.ImageView;
import com.meizu.cloud.pushsdk.c.a.c;
import com.meizu.cloud.pushsdk.c.c.k;
import com.meizu.cloud.pushsdk.c.g.g;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLConnection;

/* loaded from: classes7.dex */
public class b {
    public static int a(int i11, int i12, int i13, int i14) {
        double min = Math.min(i11 / i13, i12 / i14);
        float f11 = 1.0f;
        while (true) {
            float f12 = 2.0f * f11;
            if (f12 > min) {
                return (int) f11;
            }
            f11 = f12;
        }
    }

    public static com.meizu.cloud.pushsdk.c.b.a b(com.meizu.cloud.pushsdk.c.b.a aVar) {
        aVar.a(0);
        aVar.a("parseError");
        aVar.b(aVar.getMessage());
        return aVar;
    }

    private static int a(int i11, int i12, int i13, int i14, ImageView.ScaleType scaleType) {
        if (i11 != 0 || i12 != 0) {
            if (scaleType != ImageView.ScaleType.FIT_XY) {
                if (i11 == 0) {
                    return (int) (i13 * (i12 / i14));
                }
                if (i12 == 0) {
                    return i11;
                }
                double d11 = i14 / i13;
                if (scaleType == ImageView.ScaleType.CENTER_CROP) {
                    double d12 = i12;
                    return ((double) i11) * d11 < d12 ? (int) (d12 / d11) : i11;
                }
                double d13 = i12;
                return ((double) i11) * d11 > d13 ? (int) (d13 / d11) : i11;
            }
            if (i11 != 0) {
                return i11;
            }
        }
        return i13;
    }

    public static c<Bitmap> a(k kVar, int i11, int i12, Bitmap.Config config, ImageView.ScaleType scaleType) {
        Bitmap bitmap;
        byte[] bArr = new byte[0];
        try {
            bArr = g.a(kVar.b().a()).i();
        } catch (IOException e11) {
            e11.printStackTrace();
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (i11 != 0 || i12 != 0) {
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            int i13 = options.outWidth;
            int i14 = options.outHeight;
            int a11 = a(i11, i12, i13, i14, scaleType);
            int a12 = a(i12, i11, i14, i13, scaleType);
            options.inJustDecodeBounds = false;
            options.inSampleSize = a(i13, i14, a11, a12);
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            if (a(decodeByteArray, a11, a12)) {
                bitmap = Bitmap.createScaledBitmap(decodeByteArray, a11, a12, true);
                decodeByteArray.recycle();
            } else {
                bitmap = decodeByteArray;
            }
        } else {
            options.inPreferredConfig = config;
            bitmap = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        }
        return bitmap == null ? c.a(b(new com.meizu.cloud.pushsdk.c.b.a(kVar))) : c.a(bitmap);
    }

    public static com.meizu.cloud.pushsdk.c.b.a a(com.meizu.cloud.pushsdk.c.b.a aVar) {
        aVar.a("connectionError");
        aVar.a(0);
        aVar.b(aVar.getMessage());
        return aVar;
    }

    public static com.meizu.cloud.pushsdk.c.b.a a(com.meizu.cloud.pushsdk.c.b.a aVar, com.meizu.cloud.pushsdk.c.a.b bVar, int i11) {
        com.meizu.cloud.pushsdk.c.b.a a11 = bVar.a(aVar);
        a11.a(i11);
        a11.a("responseFromServerError");
        return a11;
    }

    public static com.meizu.cloud.pushsdk.c.b.a a(Exception exc) {
        com.meizu.cloud.pushsdk.c.b.a aVar = new com.meizu.cloud.pushsdk.c.b.a(exc);
        aVar.a(exc instanceof NetworkOnMainThreadException ? "networkOnMainThreadError" : "connectionError");
        aVar.a(0);
        return aVar;
    }

    public static String a(String str) {
        String contentTypeFor = URLConnection.getFileNameMap().getContentTypeFor(str);
        return contentTypeFor == null ? "application/octet-stream" : contentTypeFor;
    }

    public static void a(k kVar, String str, String str2) throws IOException {
        FileOutputStream fileOutputStream;
        byte[] bArr = new byte[2048];
        InputStream inputStream = null;
        try {
            InputStream b11 = kVar.b().b();
            try {
                File file = new File(str);
                if (!file.exists()) {
                    file.mkdirs();
                }
                fileOutputStream = new FileOutputStream(new File(file, str2));
                while (true) {
                    try {
                        int read = b11.read(bArr);
                        if (read == -1) {
                            break;
                        } else {
                            fileOutputStream.write(bArr, 0, read);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        inputStream = b11;
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException e11) {
                                e11.printStackTrace();
                            }
                        }
                        if (fileOutputStream == null) {
                            throw th;
                        }
                        try {
                            fileOutputStream.close();
                            throw th;
                        } catch (IOException e12) {
                            e12.printStackTrace();
                            throw th;
                        }
                    }
                }
                fileOutputStream.flush();
                try {
                    b11.close();
                } catch (IOException e13) {
                    e13.printStackTrace();
                }
                try {
                    fileOutputStream.close();
                } catch (IOException e14) {
                    e14.printStackTrace();
                }
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = null;
            }
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
        }
    }

    private static boolean a(Bitmap bitmap, int i11, int i12) {
        if (bitmap == null) {
            return false;
        }
        return bitmap.getWidth() > i11 || bitmap.getHeight() > i12;
    }
}

package com.igexin.push.a;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Movie;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import com.getui.gtc.base.GtcProvider;
import com.getui.gtc.base.crypt.CryptTools;
import com.getui.gtc.base.http.Call;
import com.getui.gtc.base.http.GtHttpClient;
import com.getui.gtc.base.http.Interceptor;
import com.getui.gtc.base.http.MediaType;
import com.getui.gtc.base.http.Request;
import com.getui.gtc.base.http.Response;
import com.getui.gtc.base.http.ResponseBody;
import com.getui.gtc.base.util.NetworkUtil;
import com.getui.gtc.base.util.io.IOUtils;
import java.io.File;
import java.io.IOException;

/* loaded from: classes7.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private static final String f37317a = "GT-ImageLoader";

    /* renamed from: b, reason: collision with root package name */
    private static final GtHttpClient f37318b = new GtHttpClient.Builder().addInterceptor(new Interceptor() { // from class: com.igexin.push.a.e.2
        @Override // com.getui.gtc.base.http.Interceptor
        public final Response intercept(Interceptor.Chain chain) throws IOException {
            byte[] readFile;
            Request request = chain.request();
            if (!e.f37317a.equals(request.tag())) {
                return chain.proceed(request);
            }
            try {
                File file = new File(GtcProvider.context().getCacheDir(), CryptTools.digestToHexString("MD5", request.url().toString().getBytes()));
                if (file.exists() && (readFile = IOUtils.readFile(file)) != null && readFile.length > 0) {
                    return new Response.Builder().request(request).code(200).body(ResponseBody.create(MediaType.parse("image/cache"), readFile)).message("cache success").build();
                }
            } catch (Throwable unused) {
            }
            Response proceed = chain.proceed(request);
            ResponseBody body = proceed.body();
            byte[] bytes = body.bytes();
            try {
                IOUtils.saveToFile(bytes, new File(GtcProvider.context().getCacheDir(), CryptTools.digestToHexString("MD5", request.url().toString().getBytes())));
            } catch (Throwable unused2) {
            }
            return proceed.newBuilder().body(ResponseBody.create(body.contentType(), bytes)).build();
        }
    }).addInterceptor(new Interceptor() { // from class: com.igexin.push.a.e.1
        @Override // com.getui.gtc.base.http.Interceptor
        public final Response intercept(Interceptor.Chain chain) throws IOException {
            if (NetworkUtil.isNetWorkAvailable(GtcProvider.context())) {
                return chain.proceed(chain.request());
            }
            throw new IllegalStateException("network is not available");
        }
    }).build();

    public interface a<T> {
        void a(T t11);

        void a(Throwable th2);
    }

    public static class b<T> implements a<T> {

        /* renamed from: a, reason: collision with root package name */
        private static final Handler f37329a = new Handler(Looper.getMainLooper());

        /* renamed from: b, reason: collision with root package name */
        private final a<T> f37330b;

        public b(a<T> aVar) {
            this.f37330b = aVar;
        }

        @Override // com.igexin.push.a.e.a
        public final void a(final T t11) {
            if (this.f37330b != null) {
                f37329a.post(new Runnable() { // from class: com.igexin.push.a.e.b.1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.lang.Runnable
                    public final void run() {
                        b.this.f37330b.a((a) t11);
                    }
                });
            }
        }

        @Override // com.igexin.push.a.e.a
        public final void a(final Throwable th2) {
            if (this.f37330b != null) {
                f37329a.post(new Runnable() { // from class: com.igexin.push.a.e.b.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        b.this.f37330b.a(th2);
                    }
                });
            }
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public int f37335a = 20;

        /* renamed from: b, reason: collision with root package name */
        public boolean f37336b = true;

        /* renamed from: c, reason: collision with root package name */
        public boolean f37337c = true;

        /* renamed from: d, reason: collision with root package name */
        public boolean f37338d = true;

        /* renamed from: e, reason: collision with root package name */
        public boolean f37339e = true;
    }

    private static Bitmap a(Resources resources, int i11, int i12, int i13, boolean z11) throws IOException {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(resources, i11, options);
        if (i12 > 0 || i13 > 0) {
            a(i12, i13, options, z11);
        }
        options.inJustDecodeBounds = false;
        Bitmap decodeResource = BitmapFactory.decodeResource(resources, i11, options);
        if (decodeResource != null) {
            return decodeResource;
        }
        throw new IOException("Failed to decode data.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(final String str, final int i11, final Call.Callback callback) {
        f37318b.newCall(new Request.Builder().url(str).tag(f37317a).method("GET").build()).enqueue(new Call.Callback() { // from class: com.igexin.push.a.e.6
            @Override // com.getui.gtc.base.http.Call.Callback
            public final void onFailure(Call call, Exception exc) {
                try {
                    if (i11 <= 0) {
                        callback.onFailure(call, exc);
                    } else {
                        Thread.sleep(500L);
                        e.b(str, i11 - 1, callback);
                    }
                } catch (Throwable th2) {
                    callback.onFailure(call, new RuntimeException(th2));
                }
            }

            @Override // com.getui.gtc.base.http.Call.Callback
            public final void onResponse(Call call, Response response) {
                callback.onResponse(call, response);
            }
        });
    }

    public static Bitmap a(Bitmap bitmap, int i11, boolean z11, boolean z12, boolean z13, boolean z14) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setFlags(1);
        float f11 = i11;
        canvas.drawRoundRect(new RectF(new Rect(0, 0, width, height)), f11, f11, paint);
        if (!z11) {
            canvas.drawRect(new RectF(0.0f, 0.0f, f11, f11), paint);
        }
        if (!z12) {
            canvas.drawRect(new RectF(width - i11, 0.0f, width, f11), paint);
        }
        if (!z13) {
            canvas.drawRect(new RectF(width - i11, height - i11, width, height), paint);
        }
        if (!z14) {
            canvas.drawRect(new RectF(0.0f, height - i11, f11, height), paint);
        }
        Paint paint2 = new Paint();
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint2);
        bitmap.recycle();
        return createBitmap;
    }

    public static void b(String str, a<Movie> aVar) {
        final b bVar = new b(aVar);
        b(str, 2, new Call.Callback() { // from class: com.igexin.push.a.e.5
            @Override // com.getui.gtc.base.http.Call.Callback
            public final void onFailure(Call call, Exception exc) {
                b.this.a((Throwable) exc);
            }

            @Override // com.getui.gtc.base.http.Call.Callback
            public final void onResponse(Call call, Response response) {
                try {
                    Movie a11 = e.a(response.getBody());
                    if (a11 != null) {
                        b.this.a((b) a11);
                        return;
                    }
                    b.this.a((Throwable) new IllegalStateException("decode gif failed:" + call.request()));
                } catch (Throwable th2) {
                    b.this.a(th2);
                }
            }
        });
    }

    public static Bitmap a(byte[] bArr, int i11, int i12, boolean z11) throws IOException {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        if (i11 > 0 || i12 > 0) {
            a(i11, i12, options, z11);
        }
        options.inJustDecodeBounds = false;
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        if (decodeByteArray != null) {
            return decodeByteArray;
        }
        throw new IOException("Failed to decode data.");
    }

    private static Movie a(Resources resources, int i11) {
        return Movie.decodeStream(resources.openRawResource(i11));
    }

    public static Movie a(byte[] bArr) {
        return Movie.decodeByteArray(bArr, 0, bArr.length);
    }

    private static void a(int i11, int i12, BitmapFactory.Options options, boolean z11) {
        int max;
        double d11;
        int i13 = options.outWidth;
        int i14 = options.outHeight;
        if (i14 > i12 || i13 > i11) {
            if (i12 == 0) {
                d11 = i13 / i11;
            } else if (i11 == 0) {
                d11 = i14 / i12;
            } else {
                int floor = (int) Math.floor(i14 / i12);
                int floor2 = (int) Math.floor(i13 / i11);
                max = z11 ? Math.max(floor, floor2) : Math.min(floor, floor2);
            }
            max = (int) Math.floor(d11);
        } else {
            max = 1;
        }
        options.inSampleSize = max;
    }

    public static void a(String str, final int i11, a<Bitmap> aVar) {
        final b bVar = new b(aVar);
        b(str, 2, new Call.Callback() { // from class: com.igexin.push.a.e.3

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f37321c = 0;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ boolean f37322d = true;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ c f37323e = null;

            @Override // com.getui.gtc.base.http.Call.Callback
            public final void onFailure(Call call, Exception exc) {
                b.this.a((Throwable) exc);
            }

            @Override // com.getui.gtc.base.http.Call.Callback
            public final void onResponse(Call call, Response response) {
                int i12;
                try {
                    Bitmap a11 = e.a(response.getBody(), i11, this.f37321c, this.f37322d);
                    c cVar = this.f37323e;
                    if (cVar != null && (i12 = cVar.f37335a) > 0) {
                        a11 = e.a(a11, i12, cVar.f37336b, cVar.f37337c, cVar.f37338d, cVar.f37339e);
                    }
                    if (a11 != null) {
                        b.this.a((b) a11);
                        return;
                    }
                    b.this.a((Throwable) new IllegalStateException("decode bitmap failed:" + call.request()));
                } catch (Throwable th2) {
                    b.this.a(th2);
                }
            }
        });
    }

    public static void a(String str, a<byte[]> aVar) {
        final b bVar = new b(aVar);
        b(str, 2, new Call.Callback() { // from class: com.igexin.push.a.e.4
            @Override // com.getui.gtc.base.http.Call.Callback
            public final void onFailure(Call call, Exception exc) {
                b.this.a((Throwable) exc);
            }

            @Override // com.getui.gtc.base.http.Call.Callback
            public final void onResponse(Call call, Response response) {
                try {
                    byte[] body = response.getBody();
                    if (body != null) {
                        b.this.a((b) body);
                        return;
                    }
                    b.this.a((Throwable) new IllegalStateException("decode gif failed:" + call.request()));
                } catch (Throwable th2) {
                    b.this.a(th2);
                }
            }
        });
    }

    public static boolean a(String str) {
        try {
            return new File(GtcProvider.context().getCacheDir(), CryptTools.digestToHexString("MD5", str.toString().getBytes())).exists();
        } catch (Throwable unused) {
            return false;
        }
    }
}

package com.tencent.open.utils;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Environment;
import android.os.Handler;
import android.os.Message;
import com.tencent.open.log.SLog;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URL;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class c {

    /* renamed from: c, reason: collision with root package name */
    private static String f44577c;

    /* renamed from: a, reason: collision with root package name */
    private String f44578a;

    /* renamed from: b, reason: collision with root package name */
    private d f44579b;

    /* renamed from: d, reason: collision with root package name */
    private long f44580d;

    /* renamed from: e, reason: collision with root package name */
    private Handler f44581e;

    /* renamed from: f, reason: collision with root package name */
    private WeakReference<Activity> f44582f;

    /* renamed from: g, reason: collision with root package name */
    private Runnable f44583g = new Runnable() { // from class: com.tencent.open.utils.c.2
        @Override // java.lang.Runnable
        public void run() {
            boolean z11;
            SLog.v("AsynLoadImg", "saveFileRunnable:");
            String str = "share_qq_" + m.g(c.this.f44578a) + ".jpg";
            String str2 = c.f44577c + str;
            File file = new File(str2);
            Message obtainMessage = c.this.f44581e.obtainMessage();
            if (file.exists()) {
                obtainMessage.arg1 = 0;
                obtainMessage.obj = str2;
                SLog.v("AsynLoadImg", "file exists: time:" + (System.currentTimeMillis() - c.this.f44580d));
            } else {
                Bitmap a11 = c.a(c.this.f44578a);
                if (a11 != null) {
                    z11 = c.this.a(a11, str);
                } else {
                    SLog.v("AsynLoadImg", "saveFileRunnable:get bmp fail---");
                    z11 = false;
                }
                if (z11) {
                    obtainMessage.arg1 = 0;
                    obtainMessage.obj = str2;
                } else {
                    obtainMessage.arg1 = 1;
                }
                SLog.v("AsynLoadImg", "file not exists: download time:" + (System.currentTimeMillis() - c.this.f44580d));
            }
            c.this.f44581e.sendMessage(obtainMessage);
        }
    };

    public c(Activity activity) {
        this.f44582f = new WeakReference<>(activity);
        this.f44581e = new Handler(activity.getMainLooper()) { // from class: com.tencent.open.utils.c.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                SLog.v("AsynLoadImg", "handleMessage:" + message.arg1);
                if (message.arg1 == 0) {
                    c.this.f44579b.a(message.arg1, (String) message.obj);
                } else {
                    c.this.f44579b.a(message.arg1, (String) null);
                }
            }
        };
    }

    public void a(String str, d dVar) {
        SLog.v("AsynLoadImg", "--save---");
        if (str != null && !str.equals("")) {
            if (!m.a()) {
                dVar.a(2, (String) null);
                return;
            }
            if (this.f44582f.get() != null) {
                Activity activity = this.f44582f.get();
                File h11 = m.h(activity, "Images");
                File externalStorageDirectory = Environment.getExternalStorageDirectory();
                if (h11 == null) {
                    SLog.e("AsynLoadImg", "externalImageFile is null");
                    dVar.a(2, (String) null);
                    return;
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(k.d(activity) ? h11.getAbsolutePath() : externalStorageDirectory.getAbsolutePath());
                    sb2.append("/tmp/");
                    f44577c = sb2.toString();
                }
            }
            this.f44580d = System.currentTimeMillis();
            this.f44578a = str;
            this.f44579b = dVar;
            new Thread(this.f44583g).start();
            return;
        }
        dVar.a(1, (String) null);
    }

    public boolean a(Bitmap bitmap, String str) {
        BufferedOutputStream bufferedOutputStream;
        String str2 = f44577c;
        BufferedOutputStream bufferedOutputStream2 = null;
        try {
            try {
                File file = new File(str2);
                if (!file.exists()) {
                    file.mkdir();
                }
                SLog.v("AsynLoadImg", "saveFile:" + str);
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(new File(str2 + str)));
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e11) {
            e = e11;
        }
        try {
            bitmap.compress(Bitmap.CompressFormat.JPEG, 80, bufferedOutputStream);
            bufferedOutputStream.flush();
            try {
                bufferedOutputStream.close();
                return true;
            } catch (IOException e12) {
                e12.printStackTrace();
                return true;
            }
        } catch (IOException e13) {
            e = e13;
            bufferedOutputStream2 = bufferedOutputStream;
            e.printStackTrace();
            SLog.e("AsynLoadImg", "saveFile bmp fail---", e);
            if (bufferedOutputStream2 == null) {
                return false;
            }
            try {
                bufferedOutputStream2.close();
                return false;
            } catch (IOException e14) {
                e14.printStackTrace();
                return false;
            }
        } catch (Throwable th3) {
            th = th3;
            bufferedOutputStream2 = bufferedOutputStream;
            if (bufferedOutputStream2 != null) {
                try {
                    bufferedOutputStream2.close();
                } catch (IOException e15) {
                    e15.printStackTrace();
                }
            }
            throw th;
        }
    }

    public static Bitmap a(String str) {
        SLog.v("AsynLoadImg", "getbitmap:" + str);
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setDoInput(true);
            httpURLConnection.connect();
            InputStream inputStream = httpURLConnection.getInputStream();
            Bitmap decodeStream = BitmapFactory.decodeStream(inputStream);
            inputStream.close();
            SLog.v("AsynLoadImg", "image download finished." + str);
            return decodeStream;
        } catch (IOException e11) {
            e11.printStackTrace();
            SLog.v("AsynLoadImg", "getbitmap bmp fail---");
            return null;
        } catch (OutOfMemoryError e12) {
            e12.printStackTrace();
            SLog.v("AsynLoadImg", "getbitmap bmp fail---");
            return null;
        }
    }
}

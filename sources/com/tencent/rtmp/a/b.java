package com.tencent.rtmp.a;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Rect;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.huawei.hms.framework.common.ContainerUtils;
import com.tencent.liteav.basic.log.TXCLog;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class b implements com.tencent.rtmp.a.a {

    /* renamed from: a, reason: collision with root package name */
    private final BitmapFactory.Options f44665a = new BitmapFactory.Options();

    /* renamed from: b, reason: collision with root package name */
    private HandlerThread f44666b;

    /* renamed from: c, reason: collision with root package name */
    private Handler f44667c;

    /* renamed from: d, reason: collision with root package name */
    private List<c> f44668d;

    /* renamed from: e, reason: collision with root package name */
    private Map<String, BitmapRegionDecoder> f44669e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private WeakReference<b> f44671a;

        /* renamed from: b, reason: collision with root package name */
        private String f44672b;

        public a(b bVar, String str) {
            this.f44671a = new WeakReference<>(bVar);
            this.f44672b = str;
        }

        private float a(String str) {
            String str2;
            String str3;
            String[] split = str.split(":");
            if (split.length == 3) {
                String str4 = split[0];
                str3 = split[1];
                str2 = split[2];
            } else if (split.length == 2) {
                str3 = split[0];
                str2 = split[1];
            } else if (split.length == 1) {
                str2 = split[0];
                str3 = null;
            } else {
                str2 = null;
                str3 = null;
            }
            float floatValue = str3 != null ? 0.0f + (Float.valueOf(str3).floatValue() * 60.0f) : 0.0f;
            return str2 != null ? floatValue + Float.valueOf(str2).floatValue() : floatValue;
        }

        @Override // java.lang.Runnable
        public void run() {
            InputStream a11;
            String readLine;
            int i11;
            b bVar = this.f44671a.get();
            BufferedReader bufferedReader = null;
            try {
                try {
                    try {
                        a11 = bVar.a(this.f44672b);
                    } catch (IOException unused) {
                        return;
                    }
                } catch (IOException e11) {
                    e = e11;
                }
                if (a11 == null) {
                }
                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(a11));
                try {
                    String readLine2 = bufferedReader2.readLine();
                    if (readLine2 != null && readLine2.length() != 0 && readLine2.contains("WEBVTT")) {
                        do {
                            readLine = bufferedReader2.readLine();
                            if (readLine != null && readLine.contains("-->")) {
                                String[] split = readLine.split(" --> ");
                                if (split.length == 2) {
                                    String readLine3 = bufferedReader2.readLine();
                                    c cVar = new c();
                                    cVar.f44676a = a(split[0]);
                                    cVar.f44677b = a(split[1]);
                                    cVar.f44678c = readLine3;
                                    int indexOf = readLine3.indexOf("#");
                                    if (indexOf != -1) {
                                        cVar.f44679d = readLine3.substring(0, indexOf);
                                    }
                                    int indexOf2 = readLine3.indexOf(ContainerUtils.KEY_VALUE_DELIMITER);
                                    if (indexOf2 != -1 && (i11 = indexOf2 + 1) < readLine3.length()) {
                                        String[] split2 = readLine3.substring(i11, readLine3.length()).split(",");
                                        if (split2.length == 4) {
                                            cVar.f44680e = Integer.valueOf(split2[0]).intValue();
                                            cVar.f44681f = Integer.valueOf(split2[1]).intValue();
                                            cVar.f44682g = Integer.valueOf(split2[2]).intValue();
                                            cVar.f44683h = Integer.valueOf(split2[3]).intValue();
                                        }
                                    }
                                    if (bVar != null && bVar.f44668d != null) {
                                        bVar.f44668d.add(cVar);
                                    }
                                }
                            }
                        } while (readLine != null);
                        bufferedReader2.close();
                        return;
                    }
                    TXCLog.e("TXImageSprite", "DownloadAndParseVTTFileTask : getVTT File Error!");
                    if (bVar != null) {
                        bVar.b();
                    }
                    try {
                        bufferedReader2.close();
                    } catch (IOException unused2) {
                    }
                } catch (IOException e12) {
                    e = e12;
                    bufferedReader = bufferedReader2;
                    TXCLog.e("TXImageSprite", "load image sprite failed.", e);
                    if (bufferedReader != null) {
                        bufferedReader.close();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bufferedReader = bufferedReader2;
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException unused3) {
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.tencent.rtmp.a.b$b, reason: collision with other inner class name */
    public static class RunnableC0528b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private WeakReference<b> f44673a;

        /* renamed from: b, reason: collision with root package name */
        private String f44674b;

        /* renamed from: c, reason: collision with root package name */
        private String f44675c;

        public RunnableC0528b(b bVar, String str, String str2) {
            this.f44673a = new WeakReference<>(bVar);
            this.f44674b = str;
            this.f44675c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i11;
            b bVar = this.f44673a.get();
            if (this.f44673a == null || bVar == null) {
                return;
            }
            InputStream inputStream = null;
            try {
                try {
                    try {
                        inputStream = bVar.a(this.f44675c);
                        int lastIndexOf = this.f44675c.lastIndexOf("/");
                        if (lastIndexOf != -1 && (i11 = lastIndexOf + 1) < this.f44675c.length()) {
                            String str = this.f44675c;
                            String substring = str.substring(i11, str.length());
                            if (bVar.f44669e != null) {
                                bVar.f44669e.put(substring, BitmapRegionDecoder.newInstance(inputStream, true));
                            }
                        }
                        if (inputStream != null) {
                            inputStream.close();
                        }
                    } catch (IOException e11) {
                        TXCLog.e("TXImageSprite", "load bitmap from network failed.", e11);
                        if (inputStream != null) {
                            inputStream.close();
                        }
                    }
                } catch (IOException unused) {
                }
            } catch (Throwable th2) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th2;
            }
        }
    }

    public b() {
        ArrayList arrayList = new ArrayList();
        this.f44668d = arrayList;
        this.f44668d = Collections.synchronizedList(arrayList);
        HashMap hashMap = new HashMap();
        this.f44669e = hashMap;
        this.f44669e = Collections.synchronizedMap(hashMap);
    }

    @Override // com.tencent.rtmp.a.a
    public Bitmap getThumbnail(float f11) {
        c a11;
        if (this.f44668d.size() == 0 || (a11 = a(0, this.f44668d.size() - 1, f11)) == null) {
            return null;
        }
        BitmapRegionDecoder bitmapRegionDecoder = this.f44669e.get(a11.f44679d);
        if (bitmapRegionDecoder == null) {
            return null;
        }
        Rect rect = new Rect();
        int i11 = a11.f44680e;
        rect.left = i11;
        int i12 = a11.f44681f;
        rect.top = i12;
        rect.right = i11 + a11.f44682g;
        rect.bottom = i12 + a11.f44683h;
        return bitmapRegionDecoder.decodeRegion(rect, this.f44665a);
    }

    @Override // com.tencent.rtmp.a.a
    public void release() {
        b();
        HandlerThread handlerThread = this.f44666b;
        if (handlerThread == null || this.f44667c == null) {
            return;
        }
        handlerThread.quitSafely();
        this.f44667c = null;
        this.f44666b = null;
    }

    @Override // com.tencent.rtmp.a.a
    public void setVTTUrlAndImageUrls(String str, List<String> list) {
        if (TextUtils.isEmpty(str)) {
            TXCLog.e("TXImageSprite", "setVTTUrlAndImageUrls: vttUrl can't be null!");
            return;
        }
        b();
        a();
        this.f44667c.post(new a(this, str));
        if (list == null || list.size() == 0) {
            return;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            this.f44667c.post(new RunnableC0528b(this, str, it.next()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (this.f44667c != null) {
            TXCLog.i("TXImageSprite", " remove all tasks!");
            this.f44667c.removeCallbacksAndMessages(null);
            this.f44667c.post(new Runnable() { // from class: com.tencent.rtmp.a.b.1
                @Override // java.lang.Runnable
                public void run() {
                    if (b.this.f44668d != null) {
                        b.this.f44668d.clear();
                    }
                    if (b.this.f44669e != null) {
                        for (BitmapRegionDecoder bitmapRegionDecoder : b.this.f44669e.values()) {
                            if (bitmapRegionDecoder != null) {
                                bitmapRegionDecoder.recycle();
                            }
                        }
                        b.this.f44669e.clear();
                    }
                }
            });
        }
    }

    private c a(int i11, int i12, float f11) {
        int i13 = ((i12 - i11) / 2) + i11;
        if (this.f44668d.get(i13).f44676a <= f11 && this.f44668d.get(i13).f44677b > f11) {
            return this.f44668d.get(i13);
        }
        if (i11 >= i12) {
            return this.f44668d.get(i11);
        }
        if (f11 >= this.f44668d.get(i13).f44677b) {
            return a(i13 + 1, i12, f11);
        }
        if (f11 < this.f44668d.get(i13).f44676a) {
            return a(i11, i13 - 1, f11);
        }
        return null;
    }

    private void a() {
        if (this.f44666b == null) {
            HandlerThread handlerThread = new HandlerThread("SuperVodThumbnailsWorkThread");
            this.f44666b = handlerThread;
            handlerThread.start();
            this.f44667c = new Handler(this.f44666b.getLooper());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public InputStream a(String str) throws IOException {
        URLConnection openConnection = new URL(str).openConnection();
        openConnection.connect();
        openConnection.getInputStream();
        openConnection.setConnectTimeout(15000);
        openConnection.setReadTimeout(15000);
        return openConnection.getInputStream();
    }
}

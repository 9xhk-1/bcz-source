package com.tencent.liteav.a;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.tencent.liteav.audio.TXEAudioDef;
import com.tencent.liteav.audio.f;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.structs.TXSNALPacket;
import com.tencent.liteav.basic.util.h;
import com.tencent.liteav.videoencoder.TXSVideoEncoderParam;
import com.tencent.liteav.videoencoder.c;
import java.io.File;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.Date;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class a implements f, c {

    /* renamed from: c, reason: collision with root package name */
    private com.tencent.liteav.muxer.c f42904c;

    /* renamed from: d, reason: collision with root package name */
    private C0506a f42905d;

    /* renamed from: e, reason: collision with root package name */
    private b f42906e;

    /* renamed from: f, reason: collision with root package name */
    private long f42907f = 0;

    /* renamed from: g, reason: collision with root package name */
    private long f42908g = -1;

    /* renamed from: h, reason: collision with root package name */
    private boolean f42909h = false;

    /* renamed from: i, reason: collision with root package name */
    private Handler f42910i = new Handler(Looper.getMainLooper()) { // from class: com.tencent.liteav.a.a.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (a.this.f42906e != null) {
                int i11 = message.what;
                if (i11 == 1) {
                    a.this.f42906e.a(((Long) message.obj).longValue());
                    return;
                }
                if (i11 != 2) {
                    return;
                }
                TXCLog.d("TXCStreamRecord", "record complete. errcode = " + message.arg1 + ", errmsg = " + ((String) message.obj) + ", outputPath = " + a.this.f42905d.f42917f + ", coverImage = " + a.this.f42905d.f42918g);
                if (message.arg1 == 0 && a.this.f42905d.f42918g != null && !a.this.f42905d.f42918g.isEmpty() && !h.a(a.this.f42905d.f42917f, a.this.f42905d.f42918g)) {
                    TXCLog.e("TXCStreamRecord", "saveVideoThumb error. sourcePath = " + a.this.f42905d.f42917f + ", coverImagePath = " + a.this.f42905d.f42918g);
                }
                if (message.arg1 != 0) {
                    try {
                        File file = new File(a.this.f42905d.f42917f);
                        if (file.exists()) {
                            file.delete();
                        }
                    } catch (Exception e11) {
                        TXCLog.e("TXCStreamRecord", "delete file failed.", e11);
                    }
                }
                a.this.f42906e.a(message.arg1, (String) message.obj, a.this.f42905d.f42917f, a.this.f42905d.f42918g);
            }
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private com.tencent.liteav.audio.impl.Record.b f42902a = new com.tencent.liteav.audio.impl.Record.b();

    /* renamed from: b, reason: collision with root package name */
    private com.tencent.liteav.videoencoder.a f42903b = new com.tencent.liteav.videoencoder.a();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.tencent.liteav.a.a$a, reason: collision with other inner class name */
    public static class C0506a {

        /* renamed from: e, reason: collision with root package name */
        public Object f42916e;

        /* renamed from: f, reason: collision with root package name */
        public String f42917f;

        /* renamed from: g, reason: collision with root package name */
        public String f42918g;

        /* renamed from: a, reason: collision with root package name */
        public int f42912a = 544;

        /* renamed from: b, reason: collision with root package name */
        public int f42913b = TXEAudioDef.TXE_OPUS_SAMPLE_NUM;

        /* renamed from: c, reason: collision with root package name */
        public int f42914c = 20;

        /* renamed from: d, reason: collision with root package name */
        public int f42915d = 1000;

        /* renamed from: h, reason: collision with root package name */
        public int f42919h = 0;

        /* renamed from: i, reason: collision with root package name */
        public int f42920i = 0;

        /* renamed from: j, reason: collision with root package name */
        public int f42921j = 16;

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("TXCStreamRecordParams: [width=" + this.f42912a);
            sb2.append("; height=" + this.f42913b);
            sb2.append("; fps=" + this.f42914c);
            sb2.append("; bitrate=" + this.f42915d);
            sb2.append("; channels=" + this.f42919h);
            sb2.append("; samplerate=" + this.f42920i);
            sb2.append("; bits=" + this.f42921j);
            sb2.append("; EGLContext=" + this.f42916e);
            sb2.append("; coveriamge=" + this.f42918g);
            sb2.append("; outputpath=" + this.f42917f + "]");
            return sb2.toString();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface b {
        void a(int i11, String str, String str2, String str3);

        void a(long j11);
    }

    public a(Context context) {
        this.f42904c = new com.tencent.liteav.muxer.c(context, 2);
    }

    private String c(int i11) {
        String str;
        switch (i11) {
            case 10000002:
                str = "Video encoder is not activated";
                break;
            case 10000003:
                str = "Illegal video input parameters";
                break;
            case 10000004:
                str = "Video encoding failed to initialize";
                break;
            case 10000005:
                str = "Video encoding failed";
                break;
            default:
                str = "";
                break;
        }
        Handler handler = this.f42910i;
        handler.sendMessage(Message.obtain(handler, 2, 1, 0, str));
        return str;
    }

    @Override // com.tencent.liteav.videoencoder.c
    public void a(int i11) {
    }

    @Override // com.tencent.liteav.videoencoder.c
    public void b(int i11) {
    }

    @Override // com.tencent.liteav.videoencoder.c
    public void a(int i11, long j11, long j12) {
    }

    @Override // com.tencent.liteav.audio.f
    public void a(int i11, String str) {
    }

    @Override // com.tencent.liteav.audio.f
    public void b(byte[] bArr, long j11, int i11, int i12, int i13) {
        this.f42904c.a(bArr, 0, bArr.length, j11 * 1000, 1);
    }

    @Override // com.tencent.liteav.audio.f
    public void a(byte[] bArr, long j11, int i11, int i12, int i13) {
    }

    @Override // com.tencent.liteav.audio.f
    public void a(byte[] bArr, long j11, int i11, int i12, int i13, boolean z11) {
    }

    public void a(b bVar) {
        this.f42906e = bVar;
    }

    public void a(C0506a c0506a) {
        int i11;
        int i12;
        this.f42905d = c0506a;
        this.f42907f = 0L;
        this.f42908g = -1L;
        this.f42904c.a(c0506a.f42917f);
        int i13 = c0506a.f42919h;
        if (i13 > 0 && (i11 = c0506a.f42920i) > 0 && (i12 = c0506a.f42921j) > 0) {
            this.f42902a.a(10, i11, i13, i12, new WeakReference<>(this));
            C0506a c0506a2 = this.f42905d;
            this.f42904c.b(h.a(c0506a2.f42920i, c0506a2.f42919h, 2));
            this.f42909h = true;
        }
        this.f42903b.setListener(this);
        TXSVideoEncoderParam tXSVideoEncoderParam = new TXSVideoEncoderParam();
        C0506a c0506a3 = this.f42905d;
        tXSVideoEncoderParam.width = c0506a3.f42912a;
        tXSVideoEncoderParam.height = c0506a3.f42913b;
        tXSVideoEncoderParam.fps = c0506a3.f42914c;
        tXSVideoEncoderParam.glContext = c0506a3.f42916e;
        tXSVideoEncoderParam.annexb = true;
        tXSVideoEncoderParam.appendSpsPps = false;
        this.f42903b.setBitrate(c0506a3.f42915d);
        this.f42903b.start(tXSVideoEncoderParam);
    }

    public void a() {
        this.f42909h = false;
        this.f42902a.a();
        this.f42903b.stop();
        if (this.f42904c.b() < 0) {
            Handler handler = this.f42910i;
            handler.sendMessage(Message.obtain(handler, 2, 1, 0, "mp4合成失败"));
        } else {
            Handler handler2 = this.f42910i;
            handler2.sendMessage(Message.obtain(handler2, 2, 0, 0, ""));
        }
    }

    public void a(int i11, long j11) {
        com.tencent.liteav.videoencoder.a aVar = this.f42903b;
        C0506a c0506a = this.f42905d;
        aVar.pushVideoFrame(i11, c0506a.f42912a, c0506a.f42913b, j11);
    }

    public void a(byte[] bArr, long j11) {
        if (this.f42909h) {
            this.f42902a.a(bArr, j11);
        } else {
            TXCLog.e("TXCStreamRecord", "drainAudio fail because of not init yet!");
        }
    }

    public static String a(Context context, String str) {
        if (context == null) {
            return null;
        }
        try {
            String valueOf = String.valueOf(System.currentTimeMillis() / 1000);
            String format = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date(Long.valueOf(valueOf + "000").longValue()));
            String a11 = a(context);
            if (TextUtils.isEmpty(a11)) {
                return null;
            }
            return new File(a11, String.format("TXUGC_%s" + str, format)).getAbsolutePath();
        } catch (Exception e11) {
            TXCLog.e("TXCStreamRecord", "create file path failed.", e11);
            return null;
        }
    }

    private static String a(Context context) {
        if (context == null) {
            return null;
        }
        if (!"mounted".equals(Environment.getExternalStorageState()) && Environment.isExternalStorageRemovable()) {
            return context.getFilesDir().getPath();
        }
        File externalFilesDir = context.getExternalFilesDir(Environment.DIRECTORY_MOVIES);
        if (externalFilesDir != null) {
            return externalFilesDir.getPath();
        }
        return null;
    }

    @Override // com.tencent.liteav.videoencoder.c
    public void a(TXSNALPacket tXSNALPacket, int i11) {
        if (i11 == 0) {
            com.tencent.liteav.muxer.c cVar = this.f42904c;
            byte[] bArr = tXSNALPacket.nalData;
            cVar.b(bArr, 0, bArr.length, tXSNALPacket.pts * 1000, tXSNALPacket.info.flags);
            if (this.f42908g < 0) {
                this.f42908g = tXSNALPacket.pts;
            }
            long j11 = tXSNALPacket.pts;
            if (j11 > this.f42907f + 500) {
                Handler handler = this.f42910i;
                handler.sendMessage(Message.obtain(handler, 1, new Long(j11 - this.f42908g)));
                this.f42907f = tXSNALPacket.pts;
                return;
            }
            return;
        }
        TXCLog.e("TXCStreamRecord", "video encode error! errmsg: " + c(i11));
    }

    @Override // com.tencent.liteav.videoencoder.c
    public void a(MediaFormat mediaFormat) {
        this.f42904c.a(mediaFormat);
        if (!this.f42904c.c() || this.f42904c.a() >= 0) {
            return;
        }
        Handler handler = this.f42910i;
        handler.sendMessage(Message.obtain(handler, 2, 1, 0, "mp4 wrapper failed to start"));
    }
}

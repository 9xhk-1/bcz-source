package com.tencent.liteav.audio.impl.Record;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import androidx.media3.common.MimeTypes;
import com.tencent.ijk.media.player.IjkMediaMeta;
import com.tencent.liteav.audio.f;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import com.tencent.liteav.basic.util.h;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.Vector;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class b extends Thread {

    /* renamed from: a, reason: collision with root package name */
    private MediaCodec.BufferInfo f42950a;

    /* renamed from: b, reason: collision with root package name */
    private MediaCodecInfo f42951b;

    /* renamed from: c, reason: collision with root package name */
    private MediaFormat f42952c;

    /* renamed from: d, reason: collision with root package name */
    private MediaCodec f42953d;

    /* renamed from: e, reason: collision with root package name */
    private Vector<byte[]> f42954e;

    /* renamed from: f, reason: collision with root package name */
    private WeakReference<f> f42955f;

    /* renamed from: g, reason: collision with root package name */
    private volatile boolean f42956g;

    /* renamed from: h, reason: collision with root package name */
    private volatile boolean f42957h;

    /* renamed from: i, reason: collision with root package name */
    private final Object f42958i;

    /* renamed from: j, reason: collision with root package name */
    private long f42959j;

    /* renamed from: k, reason: collision with root package name */
    private int f42960k;

    /* renamed from: l, reason: collision with root package name */
    private int f42961l;

    /* renamed from: m, reason: collision with root package name */
    private int f42962m;

    /* renamed from: n, reason: collision with root package name */
    private byte[] f42963n;

    static {
        h.d();
    }

    @TargetApi(16)
    public b() {
        super("TXAudioRecordThread");
        this.f42956g = false;
        this.f42957h = false;
        this.f42958i = new Object();
        this.f42959j = 0L;
        this.f42960k = 48000;
        this.f42961l = 1;
        this.f42962m = 16;
    }

    private void b() {
        MediaCodecInfo a11 = a(MimeTypes.AUDIO_AAC);
        this.f42951b = a11;
        if (a11 == null) {
            TXCLog.e("AudioCenter:TXCAudioHWEncoder", "Unable to find an appropriate codec for audio/mp4a-latm");
            return;
        }
        TXCLog.i("AudioCenter:TXCAudioHWEncoder", "selected codec: " + this.f42951b.getName());
        int i11 = this.f42960k;
        int i12 = i11 >= 32000 ? 64000 : 32000;
        MediaFormat createAudioFormat = MediaFormat.createAudioFormat(MimeTypes.AUDIO_AAC, i11, this.f42961l);
        this.f42952c = createAudioFormat;
        createAudioFormat.setInteger(IjkMediaMeta.IJKM_KEY_BITRATE, i12);
        this.f42952c.setInteger("channel-count", this.f42961l);
        this.f42952c.setInteger("sample-rate", this.f42960k);
        this.f42952c.setInteger("aac-profile", 2);
        TXCLog.i("AudioCenter:TXCAudioHWEncoder", "format: " + this.f42952c);
        try {
            d();
        } catch (Exception e11) {
            TXCLog.e("AudioCenter:TXCAudioHWEncoder", "start media codec failed.", e11);
        }
        start();
    }

    private void c() {
        this.f42957h = true;
    }

    @TargetApi(16)
    private void d() throws IOException {
        if (this.f42953d != null) {
            return;
        }
        MediaCodec createEncoderByType = MediaCodec.createEncoderByType(MimeTypes.AUDIO_AAC);
        this.f42953d = createEncoderByType;
        createEncoderByType.configure(this.f42952c, (Surface) null, (MediaCrypto) null, 1);
        this.f42953d.start();
        TXCLog.i("AudioCenter:TXCAudioHWEncoder", "prepare finishing");
        this.f42956g = true;
    }

    private void e() {
        MediaCodec mediaCodec = this.f42953d;
        if (mediaCodec != null) {
            mediaCodec.stop();
            this.f42953d.release();
            this.f42953d = null;
        }
        this.f42956g = false;
    }

    private long f() {
        long timeTick = TXCTimeUtil.getTimeTick();
        long j11 = this.f42959j;
        return timeTick < j11 ? (j11 - timeTick) + timeTick : timeTick;
    }

    public void a(int i11, int i12, int i13, int i14, WeakReference<f> weakReference) {
        this.f42955f = weakReference;
        this.f42950a = new MediaCodec.BufferInfo();
        this.f42954e = new Vector<>();
        this.f42960k = i12;
        this.f42961l = i13;
        this.f42962m = i14;
        b();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        boolean isEmpty;
        byte[] remove;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(1024);
        while (!this.f42957h) {
            if (this.f42956g) {
                synchronized (this.f42954e) {
                    isEmpty = this.f42954e.isEmpty();
                }
                if (isEmpty) {
                    try {
                        Thread.sleep(10L);
                    } catch (InterruptedException unused) {
                    }
                } else {
                    synchronized (this.f42954e) {
                        remove = this.f42954e.remove(0);
                    }
                    if (remove != null) {
                        try {
                            allocateDirect.clear();
                            if (remove.length > allocateDirect.capacity()) {
                                allocateDirect = ByteBuffer.allocateDirect(remove.length);
                            }
                            allocateDirect.clear();
                            allocateDirect.put(remove);
                            allocateDirect.flip();
                            a(allocateDirect, remove.length, f());
                        } catch (Exception e11) {
                            TXCLog.e("AudioCenter:TXCAudioHWEncoder", "encode frame failed.", e11);
                        }
                    }
                }
            } else {
                synchronized (this.f42958i) {
                    try {
                        this.f42958i.wait();
                    } catch (InterruptedException unused2) {
                    }
                }
            }
        }
        e();
    }

    public void a(byte[] bArr, long j11) {
        Vector<byte[]> vector = this.f42954e;
        if (vector != null && bArr != null) {
            synchronized (vector) {
                try {
                    Vector<byte[]> vector2 = this.f42954e;
                    if (vector2 == null) {
                        return;
                    } else {
                        vector2.add(bArr);
                    }
                } finally {
                }
            }
        }
        synchronized (this.f42958i) {
            this.f42958i.notify();
        }
    }

    private void b(byte[] bArr, long j11) {
        f fVar;
        WeakReference<f> weakReference = this.f42955f;
        if (weakReference == null || (fVar = weakReference.get()) == null) {
            return;
        }
        fVar.b(bArr, j11, this.f42960k, this.f42961l, this.f42962m);
    }

    public void a() {
        c();
    }

    private void a(ByteBuffer byteBuffer, int i11, long j11) {
        int dequeueOutputBuffer;
        if (this.f42957h) {
            return;
        }
        ByteBuffer[] inputBuffers = this.f42953d.getInputBuffers();
        int dequeueInputBuffer = this.f42953d.dequeueInputBuffer(10000L);
        if (dequeueInputBuffer >= 0) {
            ByteBuffer byteBuffer2 = inputBuffers[dequeueInputBuffer];
            byteBuffer2.clear();
            if (byteBuffer != null) {
                byteBuffer2.put(byteBuffer);
            }
            if (i11 <= 0) {
                TXCLog.i("AudioCenter:TXCAudioHWEncoder", "send BUFFER_FLAG_END_OF_STREAM");
                this.f42953d.queueInputBuffer(dequeueInputBuffer, 0, 0, j11, 4);
            } else {
                this.f42953d.queueInputBuffer(dequeueInputBuffer, 0, i11, j11, 0);
            }
        }
        ByteBuffer[] outputBuffers = this.f42953d.getOutputBuffers();
        do {
            dequeueOutputBuffer = this.f42953d.dequeueOutputBuffer(this.f42950a, 10000L);
            if (dequeueOutputBuffer != -1) {
                if (dequeueOutputBuffer == -3) {
                    outputBuffers = this.f42953d.getOutputBuffers();
                } else if (dequeueOutputBuffer == -2) {
                    this.f42953d.getOutputFormat();
                } else if (dequeueOutputBuffer >= 0) {
                    ByteBuffer byteBuffer3 = outputBuffers[dequeueOutputBuffer];
                    if ((this.f42950a.flags & 2) != 0) {
                        TXCLog.d("AudioCenter:TXCAudioHWEncoder", "drain:BUFFER_FLAG_CODEC_CONFIG");
                        this.f42950a.size = 0;
                    }
                    MediaCodec.BufferInfo bufferInfo = this.f42950a;
                    if (bufferInfo.size != 0) {
                        bufferInfo.presentationTimeUs = f();
                        byte[] bArr = new byte[byteBuffer3.limit()];
                        this.f42963n = bArr;
                        byteBuffer3.get(bArr);
                        b(this.f42963n, this.f42950a.presentationTimeUs);
                        this.f42959j = this.f42950a.presentationTimeUs;
                    }
                    this.f42953d.releaseOutputBuffer(dequeueOutputBuffer, false);
                }
            }
        } while (dequeueOutputBuffer >= 0);
    }

    private static final MediaCodecInfo a(String str) {
        TXCLog.v("AudioCenter:TXCAudioHWEncoder", "selectAudioCodec:");
        int codecCount = MediaCodecList.getCodecCount();
        for (int i11 = 0; i11 < codecCount; i11++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i11);
            if (codecInfoAt.isEncoder()) {
                String[] supportedTypes = codecInfoAt.getSupportedTypes();
                for (int i12 = 0; i12 < supportedTypes.length; i12++) {
                    TXCLog.i("AudioCenter:TXCAudioHWEncoder", "supportedType:" + codecInfoAt.getName() + ",MIME=" + supportedTypes[i12]);
                    if (supportedTypes[i12].equalsIgnoreCase(str)) {
                        return codecInfoAt;
                    }
                }
            }
        }
        return null;
    }
}

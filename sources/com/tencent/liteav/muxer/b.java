package com.tencent.liteav.muxer;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.text.TextUtils;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.tencent.liteav.basic.log.TXCLog;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.ConcurrentLinkedQueue;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@TargetApi(18)
/* loaded from: classes5.dex */
public class b implements com.tencent.liteav.muxer.a {

    /* renamed from: a, reason: collision with root package name */
    public static float f43623a = 0.5f;

    /* renamed from: b, reason: collision with root package name */
    public static float f43624b = 0.8f;

    /* renamed from: c, reason: collision with root package name */
    public static float f43625c = 1.25f;

    /* renamed from: d, reason: collision with root package name */
    public static float f43626d = 2.0f;

    /* renamed from: f, reason: collision with root package name */
    private MediaMuxer f43628f;

    /* renamed from: e, reason: collision with root package name */
    private int f43627e = 2;

    /* renamed from: g, reason: collision with root package name */
    private String f43629g = null;

    /* renamed from: h, reason: collision with root package name */
    private MediaFormat f43630h = null;

    /* renamed from: i, reason: collision with root package name */
    private MediaFormat f43631i = null;

    /* renamed from: j, reason: collision with root package name */
    private int f43632j = 0;

    /* renamed from: k, reason: collision with root package name */
    private int f43633k = 0;

    /* renamed from: l, reason: collision with root package name */
    private boolean f43634l = false;

    /* renamed from: m, reason: collision with root package name */
    private boolean f43635m = false;

    /* renamed from: n, reason: collision with root package name */
    private ConcurrentLinkedQueue<a> f43636n = new ConcurrentLinkedQueue<>();

    /* renamed from: o, reason: collision with root package name */
    private ConcurrentLinkedQueue<a> f43637o = new ConcurrentLinkedQueue<>();

    /* renamed from: p, reason: collision with root package name */
    private long f43638p = -1;

    /* renamed from: q, reason: collision with root package name */
    private long f43639q = -1;

    /* renamed from: r, reason: collision with root package name */
    private long f43640r = -1;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        ByteBuffer f43641a;

        /* renamed from: b, reason: collision with root package name */
        MediaCodec.BufferInfo f43642b;

        public a(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
            this.f43641a = byteBuffer;
            this.f43642b = bufferInfo;
        }

        public ByteBuffer a() {
            return this.f43641a;
        }

        public MediaCodec.BufferInfo b() {
            return this.f43642b;
        }
    }

    private void d(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        float f11;
        float f12;
        long j11 = bufferInfo.presentationTimeUs;
        long j12 = this.f43638p;
        long j13 = j11 - j12;
        if (j12 < 0 || j13 < 0) {
            TXCLog.w("TXCMP4HWMuxer", "drop sample. first frame offset timeus = " + this.f43638p + ", current sample timeus = " + bufferInfo.presentationTimeUs);
            return;
        }
        if (j13 < this.f43640r) {
            TXCLog.e("TXCMP4HWMuxer", "audio is not in chronological order. current audio's pts pts(" + j13 + ") must larger than pre audio's pts(" + this.f43640r + j.f81007d);
            j13 = this.f43640r + 1;
        } else {
            this.f43640r = j13;
        }
        int i11 = this.f43627e;
        if (i11 != 2) {
            if (i11 == 3) {
                f11 = j13;
                f12 = f43624b;
            } else if (i11 == 4) {
                f11 = j13;
                f12 = f43623a;
            } else if (i11 == 1) {
                f11 = j13;
                f12 = f43625c;
            } else if (i11 == 0) {
                f11 = j13;
                f12 = f43626d;
            }
            j13 = (long) (f11 * f12);
        }
        bufferInfo.presentationTimeUs = j13;
        try {
            this.f43628f.writeSampleData(this.f43632j, byteBuffer, bufferInfo);
        } catch (IllegalArgumentException e11) {
            TXCLog.e("TXCMP4HWMuxer", "write sample IllegalArgumentException: " + e11);
        } catch (IllegalStateException e12) {
            TXCLog.e("TXCMP4HWMuxer", "write sample IllegalStateException: " + e12);
        }
    }

    private void e() {
        while (this.f43636n.size() > 0) {
            a poll = this.f43636n.poll();
            c(poll.a(), poll.b());
        }
        while (this.f43637o.size() > 0) {
            a poll2 = this.f43637o.poll();
            d(poll2.a(), poll2.b());
        }
    }

    @Override // com.tencent.liteav.muxer.a
    public synchronized void a(MediaFormat mediaFormat) {
        TXCLog.d("TXCMP4HWMuxer", "addVideoTrack:" + mediaFormat);
        this.f43630h = mediaFormat;
        this.f43636n.clear();
    }

    @Override // com.tencent.liteav.muxer.a
    public synchronized void b(MediaFormat mediaFormat) {
        TXCLog.d("TXCMP4HWMuxer", "addAudioTrack:" + mediaFormat);
        this.f43631i = mediaFormat;
        this.f43637o.clear();
    }

    @Override // com.tencent.liteav.muxer.a
    public synchronized boolean c() {
        return this.f43630h != null;
    }

    private void c(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        float f11;
        float f12;
        long j11 = bufferInfo.presentationTimeUs - this.f43638p;
        if (j11 < 0) {
            TXCLog.e("TXCMP4HWMuxer", "pts error! first frame offset timeus = " + this.f43638p + ", current timeus = " + bufferInfo.presentationTimeUs);
            j11 = this.f43639q;
            if (j11 <= 0) {
                j11 = 0;
            }
        }
        if (j11 < this.f43639q) {
            TXCLog.w("TXCMP4HWMuxer", "video is not in chronological order. current frame's pts(" + j11 + ") smaller than pre frame's pts(" + this.f43639q + j.f81007d);
        } else {
            this.f43639q = j11;
        }
        int i11 = this.f43627e;
        if (i11 != 2) {
            if (i11 == 3) {
                f11 = j11;
                f12 = f43624b;
            } else if (i11 == 4) {
                f11 = j11;
                f12 = f43623a;
            } else if (i11 == 1) {
                f11 = j11;
                f12 = f43625c;
            } else if (i11 == 0) {
                f11 = j11;
                f12 = f43626d;
            }
            j11 = (long) (f11 * f12);
        }
        bufferInfo.presentationTimeUs = j11;
        try {
            byteBuffer.position(bufferInfo.offset);
            byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
            this.f43628f.writeSampleData(this.f43633k, byteBuffer, bufferInfo);
            if ((bufferInfo.flags & 1) != 0) {
                this.f43635m = true;
            }
        } catch (IllegalArgumentException e11) {
            TXCLog.e("TXCMP4HWMuxer", "write frame info.presentationTimeUs: " + bufferInfo.presentationTimeUs + ", IllegalArgumentException: " + e11);
        } catch (IllegalStateException e12) {
            TXCLog.e("TXCMP4HWMuxer", "write frame info.presentationTimeUs: " + bufferInfo.presentationTimeUs + ", IllegalStateException: " + e12);
        }
    }

    @Override // com.tencent.liteav.muxer.a
    public synchronized int a() {
        String str = this.f43629g;
        if (str != null && !str.isEmpty()) {
            if (!c()) {
                TXCLog.e("TXCMP4HWMuxer", "video track not set yet!");
                return -2;
            }
            if (this.f43628f != null) {
                TXCLog.w("TXCMP4HWMuxer", "start has been called. stop must be called before start");
                return 0;
            }
            TXCLog.d("TXCMP4HWMuxer", TtmlNode.START);
            try {
                MediaMuxer mediaMuxer = new MediaMuxer(this.f43629g, 0);
                this.f43628f = mediaMuxer;
                MediaFormat mediaFormat = this.f43630h;
                if (mediaFormat != null) {
                    try {
                        this.f43633k = mediaMuxer.addTrack(mediaFormat);
                    } catch (IllegalArgumentException e11) {
                        TXCLog.e("TXCMP4HWMuxer", "addVideoTrack IllegalArgumentException: " + e11);
                        return -5;
                    } catch (IllegalStateException e12) {
                        TXCLog.e("TXCMP4HWMuxer", "addVideoTrack IllegalStateException: " + e12);
                        return -6;
                    }
                }
                MediaFormat mediaFormat2 = this.f43631i;
                if (mediaFormat2 != null) {
                    try {
                        this.f43632j = this.f43628f.addTrack(mediaFormat2);
                    } catch (IllegalArgumentException e13) {
                        TXCLog.e("TXCMP4HWMuxer", "addAudioTrack IllegalArgumentException: " + e13);
                        return -7;
                    } catch (IllegalStateException e14) {
                        TXCLog.e("TXCMP4HWMuxer", "addAudioTrack IllegalStateException: " + e14);
                        return -8;
                    }
                }
                this.f43628f.start();
                this.f43638p = -1L;
                this.f43634l = true;
                this.f43635m = false;
                this.f43639q = -1L;
                this.f43640r = -1L;
                return 0;
            } catch (IOException e15) {
                TXCLog.e("TXCMP4HWMuxer", "create MediaMuxer exception:" + e15);
                return -4;
            }
        }
        TXCLog.e("TXCMP4HWMuxer", "target path not set yet!");
        return -1;
    }

    @Override // com.tencent.liteav.muxer.a
    public synchronized int b() {
        if (this.f43628f != null) {
            TXCLog.d("TXCMP4HWMuxer", "stop. start flag = " + this.f43634l + ", video key frame set = " + this.f43635m);
            try {
                try {
                    if (this.f43634l && this.f43635m) {
                        this.f43628f.stop();
                    }
                    this.f43628f.release();
                    this.f43634l = false;
                    this.f43628f = null;
                    this.f43635m = false;
                    this.f43636n.clear();
                    this.f43637o.clear();
                    this.f43630h = null;
                    this.f43631i = null;
                    this.f43639q = -1L;
                    this.f43640r = -1L;
                } catch (Exception e11) {
                    TXCLog.e("TXCMP4HWMuxer", "muxer stop/release exception: " + e11);
                    this.f43634l = false;
                    this.f43628f = null;
                    this.f43635m = false;
                    this.f43636n.clear();
                    this.f43637o.clear();
                    this.f43630h = null;
                    this.f43631i = null;
                    this.f43639q = -1L;
                    this.f43640r = -1L;
                    return -1;
                }
            } catch (Throwable th2) {
                this.f43634l = false;
                this.f43628f = null;
                this.f43635m = false;
                this.f43636n.clear();
                this.f43637o.clear();
                this.f43630h = null;
                this.f43631i = null;
                this.f43639q = -1L;
                this.f43640r = -1L;
                throw th2;
            }
        }
        return 0;
    }

    private long d() {
        a peek;
        long j11 = this.f43636n.size() > 0 ? this.f43636n.peek().b().presentationTimeUs : 0L;
        if (this.f43637o.size() > 0 && (peek = this.f43637o.peek()) != null && peek.b() != null) {
            long j12 = this.f43637o.peek().b().presentationTimeUs;
            if (j11 > j12) {
                return j12;
            }
        }
        return j11;
    }

    @Override // com.tencent.liteav.muxer.a
    public synchronized void a(String str) {
        try {
            this.f43629g = str;
            if (!TextUtils.isEmpty(str)) {
                File file = new File(this.f43629g);
                File parentFile = file.getParentFile();
                if (!parentFile.exists()) {
                    parentFile.mkdirs();
                }
                if (file.exists()) {
                    file.delete();
                }
                try {
                    file.createNewFile();
                } catch (IOException e11) {
                    TXCLog.e("TXCMP4HWMuxer", "create new file failed.", e11);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.tencent.liteav.muxer.a
    public synchronized void b(byte[] bArr, int i11, int i12, long j11, int i13) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i12);
        allocateDirect.put(bArr, i11, i12);
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        bufferInfo.presentationTimeUs = j11;
        bufferInfo.offset = 0;
        bufferInfo.size = i12;
        bufferInfo.flags = i13;
        a(allocateDirect, bufferInfo);
    }

    @Override // com.tencent.liteav.muxer.a
    public synchronized void a(byte[] bArr, int i11, int i12, long j11, int i13) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i12);
        allocateDirect.put(bArr, i11, i12);
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        bufferInfo.presentationTimeUs = j11;
        bufferInfo.offset = 0;
        bufferInfo.size = i12;
        bufferInfo.flags = i13;
        b(allocateDirect, bufferInfo);
    }

    public synchronized void b(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        if (this.f43628f != null && this.f43638p >= 0) {
            d(byteBuffer, bufferInfo);
            return;
        }
        TXCLog.d("TXCMP4HWMuxer", "cache sample before muexer ready. ptsUs: " + bufferInfo.presentationTimeUs);
        a(false, byteBuffer, bufferInfo);
    }

    public synchronized void a(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        if (this.f43628f == null) {
            a(true, byteBuffer, bufferInfo);
            TXCLog.w("TXCMP4HWMuxer", "cache frame before muexer ready. ptsUs: " + bufferInfo.presentationTimeUs);
            return;
        }
        if (this.f43638p < 0) {
            a(true, byteBuffer, bufferInfo);
            this.f43638p = d();
            TXCLog.i("TXCMP4HWMuxer", "first frame offset = " + this.f43638p);
            e();
        } else {
            c(byteBuffer, bufferInfo);
        }
    }

    private void a(boolean z11, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        if (byteBuffer == null || bufferInfo == null) {
            return;
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(byteBuffer.capacity());
        byteBuffer.rewind();
        if (bufferInfo.size > 0) {
            byteBuffer.position(bufferInfo.offset);
            byteBuffer.limit(bufferInfo.size);
        }
        allocateDirect.rewind();
        allocateDirect.put(byteBuffer);
        MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
        bufferInfo2.set(bufferInfo.offset, bufferInfo.size, bufferInfo.presentationTimeUs, bufferInfo.flags);
        a aVar = new a(allocateDirect, bufferInfo2);
        if (z11) {
            if (this.f43636n.size() >= 200) {
                TXCLog.e("TXCMP4HWMuxer", "drop video frame. video cache size is larger than 200");
                return;
            } else {
                this.f43636n.add(aVar);
                return;
            }
        }
        if (this.f43637o.size() >= 600) {
            TXCLog.e("TXCMP4HWMuxer", "drop audio frame. audio cache size is larger than 600");
        } else {
            this.f43637o.add(aVar);
        }
    }
}

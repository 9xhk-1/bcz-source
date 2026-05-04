package com.tencent.liteav.muxer;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.text.TextUtils;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.muxer.jni.TXSWMuxerJNI;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.ConcurrentLinkedQueue;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@TargetApi(18)
/* loaded from: classes5.dex */
public class d implements com.tencent.liteav.muxer.a {

    /* renamed from: a, reason: collision with root package name */
    public static float f43645a = 0.5f;

    /* renamed from: b, reason: collision with root package name */
    public static float f43646b = 0.8f;

    /* renamed from: c, reason: collision with root package name */
    public static float f43647c = 1.25f;

    /* renamed from: d, reason: collision with root package name */
    public static float f43648d = 2.0f;

    /* renamed from: f, reason: collision with root package name */
    private TXSWMuxerJNI f43650f;

    /* renamed from: e, reason: collision with root package name */
    private int f43649e = 2;

    /* renamed from: g, reason: collision with root package name */
    private String f43651g = null;

    /* renamed from: h, reason: collision with root package name */
    private MediaFormat f43652h = null;

    /* renamed from: i, reason: collision with root package name */
    private MediaFormat f43653i = null;

    /* renamed from: j, reason: collision with root package name */
    private int f43654j = 0;

    /* renamed from: k, reason: collision with root package name */
    private int f43655k = 0;

    /* renamed from: l, reason: collision with root package name */
    private boolean f43656l = false;

    /* renamed from: m, reason: collision with root package name */
    private boolean f43657m = false;

    /* renamed from: n, reason: collision with root package name */
    private ConcurrentLinkedQueue<a> f43658n = new ConcurrentLinkedQueue<>();

    /* renamed from: o, reason: collision with root package name */
    private ConcurrentLinkedQueue<a> f43659o = new ConcurrentLinkedQueue<>();

    /* renamed from: p, reason: collision with root package name */
    private long f43660p = -1;

    /* renamed from: q, reason: collision with root package name */
    private long f43661q = -1;

    /* renamed from: r, reason: collision with root package name */
    private long f43662r = -1;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        ByteBuffer f43663a;

        /* renamed from: b, reason: collision with root package name */
        MediaCodec.BufferInfo f43664b;

        public a(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
            this.f43663a = byteBuffer;
            this.f43664b = bufferInfo;
        }

        public ByteBuffer a() {
            return this.f43663a;
        }

        public MediaCodec.BufferInfo b() {
            return this.f43664b;
        }
    }

    private ByteBuffer d() {
        ByteBuffer byteBuffer = this.f43653i.getByteBuffer("csd-0");
        if (byteBuffer != null) {
            byteBuffer.position(0);
        }
        return byteBuffer;
    }

    private ByteBuffer e() {
        return this.f43652h.getByteBuffer("csd-0");
    }

    private ByteBuffer f() {
        return this.f43652h.getByteBuffer("csd-1");
    }

    private long g() {
        a peek;
        long j11 = this.f43658n.size() > 0 ? this.f43658n.peek().b().presentationTimeUs : 0L;
        if (this.f43659o.size() > 0 && (peek = this.f43659o.peek()) != null && peek.b() != null) {
            long j12 = this.f43659o.peek().b().presentationTimeUs;
            if (j11 > j12) {
                return j12;
            }
        }
        return j11;
    }

    private void h() {
        while (this.f43658n.size() > 0) {
            a poll = this.f43658n.poll();
            c(poll.a(), poll.b());
        }
        while (this.f43659o.size() > 0) {
            a poll2 = this.f43659o.poll();
            d(poll2.a(), poll2.b());
        }
    }

    private void i() {
        while (this.f43658n.size() > 0) {
            a poll = this.f43658n.poll();
            a(poll.b().presentationTimeUs);
            c(poll.a(), poll.b());
        }
    }

    @Override // com.tencent.liteav.muxer.a
    public synchronized void a(MediaFormat mediaFormat) {
        TXCLog.d("TXCMP4SWMuxer", "addVideoTrack:" + mediaFormat);
        this.f43652h = mediaFormat;
        this.f43658n.clear();
    }

    @Override // com.tencent.liteav.muxer.a
    public synchronized void b(MediaFormat mediaFormat) {
        TXCLog.d("TXCMP4SWMuxer", "addAudioTrack:" + mediaFormat);
        this.f43653i = mediaFormat;
        this.f43659o.clear();
    }

    @Override // com.tencent.liteav.muxer.a
    public synchronized boolean c() {
        return this.f43652h != null;
    }

    private void d(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        float f11;
        float f12;
        long j11 = bufferInfo.presentationTimeUs;
        long j12 = this.f43660p;
        long j13 = j11 - j12;
        if (j12 >= 0 && j13 >= 0) {
            if (j13 < this.f43662r) {
                TXCLog.e("TXCMP4SWMuxer", "audio is not in chronological order. current audio's pts pts(" + j13 + ") must larger than pre audio's pts(" + this.f43662r + j.f81007d);
                j13 = this.f43662r + 1;
            } else {
                this.f43662r = j13;
            }
            int i11 = this.f43649e;
            if (i11 != 2) {
                if (i11 == 3) {
                    f11 = j13;
                    f12 = f43646b;
                } else if (i11 == 4) {
                    f11 = j13;
                    f12 = f43645a;
                } else if (i11 == 1) {
                    f11 = j13;
                    f12 = f43647c;
                } else if (i11 == 0) {
                    f11 = j13;
                    f12 = f43648d;
                }
                j13 = (long) (f11 * f12);
            }
            bufferInfo.presentationTimeUs = j13;
            try {
                byteBuffer.position(bufferInfo.offset);
                byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
                this.f43650f.a(byteBuffer, 0, bufferInfo.offset, bufferInfo.size, bufferInfo.flags, bufferInfo.presentationTimeUs);
                return;
            } catch (IllegalArgumentException e11) {
                TXCLog.e("TXCMP4SWMuxer", "write sample IllegalArgumentException: " + e11);
                return;
            } catch (IllegalStateException e12) {
                TXCLog.e("TXCMP4SWMuxer", "write sample IllegalStateException: " + e12);
                return;
            }
        }
        TXCLog.w("TXCMP4SWMuxer", "drop sample. first frame offset timeus = " + this.f43660p + ", current sample timeus = " + bufferInfo.presentationTimeUs);
    }

    private void c(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        float f11;
        float f12;
        long j11 = bufferInfo.presentationTimeUs - this.f43660p;
        if (j11 < 0) {
            TXCLog.e("TXCMP4SWMuxer", "pts error! first frame offset timeus = " + this.f43660p + ", current timeus = " + bufferInfo.presentationTimeUs);
            j11 = this.f43661q;
            if (j11 <= 0) {
                j11 = 0;
            }
        }
        if (j11 < this.f43661q) {
            TXCLog.w("TXCMP4SWMuxer", "video is not in chronological order. current frame's pts(" + j11 + ") smaller than pre frame's pts(" + this.f43661q + j.f81007d);
        } else {
            this.f43661q = j11;
        }
        int i11 = this.f43649e;
        if (i11 != 2) {
            if (i11 == 3) {
                f11 = j11;
                f12 = f43646b;
            } else if (i11 == 4) {
                f11 = j11;
                f12 = f43645a;
            } else if (i11 == 1) {
                f11 = j11;
                f12 = f43647c;
            } else if (i11 == 0) {
                f11 = j11;
                f12 = f43648d;
            }
            j11 = (long) (f11 * f12);
        }
        bufferInfo.presentationTimeUs = j11;
        try {
            byteBuffer.position(bufferInfo.offset);
            byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
            this.f43650f.a(byteBuffer, 1, bufferInfo.offset, bufferInfo.size, bufferInfo.flags == 1 ? 1 : 0, bufferInfo.presentationTimeUs);
            if ((bufferInfo.flags & 1) != 0) {
                this.f43657m = true;
            }
        } catch (IllegalArgumentException e11) {
            TXCLog.e("TXCMP4SWMuxer", "write frame IllegalArgumentException: " + e11);
        } catch (IllegalStateException e12) {
            TXCLog.e("TXCMP4SWMuxer", "write frame IllegalStateException: " + e12);
        }
    }

    @Override // com.tencent.liteav.muxer.a
    public synchronized int a() {
        String str = this.f43651g;
        if (str != null && !str.isEmpty()) {
            if (!c()) {
                TXCLog.e("TXCMP4SWMuxer", "video track not set yet!");
                return -2;
            }
            if (this.f43650f != null) {
                TXCLog.w("TXCMP4SWMuxer", "start has been called. stop must be called before start");
                return 0;
            }
            TXCLog.d("TXCMP4SWMuxer", TtmlNode.START);
            this.f43650f = new TXSWMuxerJNI();
            TXSWMuxerJNI.AVOptions aVOptions = new TXSWMuxerJNI.AVOptions();
            MediaFormat mediaFormat = this.f43652h;
            if (mediaFormat != null) {
                int integer = mediaFormat.getInteger("width");
                aVOptions.videoHeight = this.f43652h.getInteger("height");
                aVOptions.videoWidth = integer;
                aVOptions.videoGOP = this.f43652h.containsKey("i-frame-interval") ? this.f43652h.getInteger("i-frame-interval") : 3;
            }
            MediaFormat mediaFormat2 = this.f43653i;
            if (mediaFormat2 != null) {
                int integer2 = mediaFormat2.getInteger("channel-count");
                int integer3 = this.f43653i.getInteger("sample-rate");
                aVOptions.audioChannels = integer2;
                aVOptions.audioSampleRate = integer3;
            }
            ByteBuffer e11 = e();
            ByteBuffer f11 = f();
            ByteBuffer d11 = this.f43653i != null ? d() : null;
            if (e11 != null && f11 != null) {
                if (this.f43653i != null && d11 == null) {
                    TXCLog.e("TXCMP4SWMuxer", "audio format contains error csd!");
                    return -3;
                }
                this.f43650f.a(e11, e11.capacity(), f11, f11.capacity());
                if (this.f43653i != null) {
                    this.f43650f.a(d11, d11.capacity());
                }
                this.f43650f.a(aVOptions);
                this.f43650f.a(this.f43651g);
                this.f43650f.a();
                this.f43660p = -1L;
                this.f43656l = true;
                this.f43657m = false;
                this.f43661q = -1L;
                this.f43662r = -1L;
                return 0;
            }
            TXCLog.e("TXCMP4SWMuxer", "video format contains error csd!");
            return -3;
        }
        TXCLog.e("TXCMP4SWMuxer", "target path not set yet!");
        return -1;
    }

    @Override // com.tencent.liteav.muxer.a
    public synchronized int b() {
        if (this.f43650f != null) {
            h();
            TXCLog.d("TXCMP4SWMuxer", "stop. start flag = " + this.f43656l + ", video key frame set = " + this.f43657m);
            try {
                try {
                    if (this.f43656l && this.f43657m) {
                        this.f43650f.b();
                    }
                    this.f43650f.c();
                    this.f43656l = false;
                    this.f43650f = null;
                    this.f43657m = false;
                    this.f43658n.clear();
                    this.f43659o.clear();
                    this.f43652h = null;
                    this.f43653i = null;
                    this.f43661q = -1L;
                    this.f43662r = -1L;
                } catch (Exception e11) {
                    TXCLog.e("TXCMP4SWMuxer", "muxer stop/release exception: " + e11);
                    this.f43656l = false;
                    this.f43650f = null;
                    this.f43657m = false;
                    this.f43658n.clear();
                    this.f43659o.clear();
                    this.f43652h = null;
                    this.f43653i = null;
                    this.f43661q = -1L;
                    this.f43662r = -1L;
                    return -1;
                }
            } catch (Throwable th2) {
                this.f43656l = false;
                this.f43650f = null;
                this.f43657m = false;
                this.f43658n.clear();
                this.f43659o.clear();
                this.f43652h = null;
                this.f43653i = null;
                this.f43661q = -1L;
                this.f43662r = -1L;
                throw th2;
            }
        }
        return 0;
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
    public synchronized void a(String str) {
        try {
            this.f43651g = str;
            if (!TextUtils.isEmpty(str)) {
                File file = new File(this.f43651g);
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
                    TXCLog.e("TXCMP4SWMuxer", "create new file failed.", e11);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void b(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        a(false, byteBuffer, bufferInfo);
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

    public synchronized void a(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        if (this.f43650f == null) {
            a(true, byteBuffer, bufferInfo);
            TXCLog.w("TXCMP4SWMuxer", "cache frame before muexer ready. ptsUs: " + bufferInfo.presentationTimeUs);
            return;
        }
        if (this.f43660p < 0) {
            a(true, byteBuffer, bufferInfo);
            this.f43660p = g();
            TXCLog.i("TXCMP4SWMuxer", "first frame offset = " + this.f43660p);
            i();
        } else {
            a(bufferInfo.presentationTimeUs);
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
            if (this.f43658n.size() < 200) {
                this.f43658n.add(aVar);
                return;
            } else {
                TXCLog.e("TXCMP4SWMuxer", "drop video frame. video cache size is larger than 200");
                return;
            }
        }
        this.f43659o.add(aVar);
    }

    private void a(long j11) {
        while (this.f43659o.size() > 0) {
            if (this.f43659o.peek().b() == null) {
                TXCLog.e("TXCMP4SWMuxer", "flushAudioCache, bufferInfo is null");
                this.f43659o.remove();
            } else {
                if (this.f43659o.peek().b().presentationTimeUs >= j11) {
                    return;
                }
                a poll = this.f43659o.poll();
                d(poll.a(), poll.b());
            }
        }
    }
}

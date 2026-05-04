package com.tencent.liteav.videodecoder;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.view.Surface;
import androidx.media3.common.MimeTypes;
import com.tencent.ijk.media.player.misc.IjkMediaFormat;
import com.tencent.liteav.audio.TXEAudioDef;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.module.Monitor;
import com.tencent.liteav.basic.structs.TXSNALPacket;
import com.tencent.liteav.basic.util.TXCCommonUtil;
import com.tencent.liteav.basic.util.h;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Locale;
import org.json.JSONArray;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class f implements b {

    /* renamed from: r, reason: collision with root package name */
    private g f44274r;

    /* renamed from: u, reason: collision with root package name */
    private WeakReference<com.tencent.liteav.basic.b.b> f44277u;

    /* renamed from: a, reason: collision with root package name */
    private MediaCodec.BufferInfo f44257a = new MediaCodec.BufferInfo();

    /* renamed from: b, reason: collision with root package name */
    private MediaCodec f44258b = null;

    /* renamed from: c, reason: collision with root package name */
    private String f44259c = MimeTypes.VIDEO_H264;

    /* renamed from: d, reason: collision with root package name */
    private int f44260d = 540;

    /* renamed from: e, reason: collision with root package name */
    private int f44261e = TXEAudioDef.TXE_OPUS_SAMPLE_NUM;

    /* renamed from: f, reason: collision with root package name */
    private long f44262f = 0;

    /* renamed from: g, reason: collision with root package name */
    private long f44263g = 0;

    /* renamed from: h, reason: collision with root package name */
    private boolean f44264h = true;

    /* renamed from: i, reason: collision with root package name */
    private boolean f44265i = false;

    /* renamed from: j, reason: collision with root package name */
    private boolean f44266j = false;

    /* renamed from: k, reason: collision with root package name */
    private Surface f44267k = null;

    /* renamed from: l, reason: collision with root package name */
    private int f44268l = 0;

    /* renamed from: m, reason: collision with root package name */
    private ArrayList<TXSNALPacket> f44269m = new ArrayList<>();

    /* renamed from: n, reason: collision with root package name */
    private ArrayList<Long> f44270n = new ArrayList<>();

    /* renamed from: o, reason: collision with root package name */
    private long f44271o = 0;

    /* renamed from: p, reason: collision with root package name */
    private int f44272p = 0;

    /* renamed from: q, reason: collision with root package name */
    private JSONArray f44273q = null;

    /* renamed from: s, reason: collision with root package name */
    private d f44275s = new d();

    /* renamed from: t, reason: collision with root package name */
    private boolean f44276t = false;

    /* JADX WARN: Removed duplicated region for block: B:32:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0105  */
    @android.annotation.TargetApi(16)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void b() {
        /*
            Method dump skipped, instructions count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.videodecoder.f.b():void");
    }

    private void c() {
        int i11;
        MediaFormat outputFormat = this.f44258b.getOutputFormat();
        TXCLog.i("MediaCodecDecoder", "decode output format changed: " + outputFormat);
        int abs = Math.abs(outputFormat.getInteger("crop-right") - outputFormat.getInteger("crop-left")) + 1;
        int abs2 = Math.abs(outputFormat.getInteger("crop-bottom") - outputFormat.getInteger("crop-top")) + 1;
        int integer = outputFormat.getInteger("width");
        int integer2 = outputFormat.getInteger("height");
        int min = Math.min(abs, integer);
        int min2 = Math.min(abs2, integer2);
        int i12 = this.f44260d;
        if (min == i12 && min2 == (i11 = this.f44261e)) {
            if (this.f44264h) {
                this.f44264h = false;
                g gVar = this.f44274r;
                if (gVar != null) {
                    gVar.onVideoSizeChange(i12, i11);
                    return;
                }
                return;
            }
            return;
        }
        if (this.f44266j && !e.b(min, min2, 20)) {
            e();
            Monitor.a(2, String.format(Locale.getDefault(), "outputFormatChange: dynamic change resolution but change to a not support resolution: %s, oldwidth = %d,oldheight = %d, newwidth = %d, newheight=", TXCCommonUtil.getDeviceInfo(), Integer.valueOf(this.f44260d), Integer.valueOf(this.f44261e), Integer.valueOf(min), Integer.valueOf(min2)), "", 0);
        }
        this.f44260d = min;
        this.f44261e = min2;
        try {
            g gVar2 = this.f44274r;
            if (gVar2 != null) {
                gVar2.onVideoSizeChange(min, min2);
            }
        } catch (Exception e11) {
            TXCLog.e("MediaCodecDecoder", "onVideoSizeChange failed.", e11);
        }
        TXCLog.i("MediaCodecDecoder", "decode: video size change to w:" + min + ",h:" + min2);
    }

    private void d() {
        if (this.f44262f == 0) {
            TXCLog.w("MediaCodecDecoder", "decode first frame sucess");
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j11 = this.f44262f;
        if (j11 > 0 && currentTimeMillis > j11 + 1000) {
            long j12 = this.f44263g;
            if (currentTimeMillis > 2000 + j12 && j12 != 0) {
                TXCLog.e("MediaCodecDecoder", "frame interval[" + (currentTimeMillis - this.f44262f) + "] > 1000");
                this.f44263g = currentTimeMillis;
            }
        }
        if (this.f44263g == 0) {
            this.f44263g = currentTimeMillis;
        }
        this.f44262f = currentTimeMillis;
    }

    private void e() {
        if (this.f44265i) {
            return;
        }
        this.f44265i = true;
        TXCLog.e("MediaCodecDecoder", "[Video][Decoder] notify HWDecoder error, isH265:" + this.f44266j);
        if (this.f44266j) {
            h.a(this.f44277u, -2304, "h265 Decoding failed");
            Monitor.a(2, String.format(Locale.getDefault(), "VideoDecoder: hevc hardware decoder error. %s, %d, %d", TXCCommonUtil.getDeviceInfo(), Integer.valueOf(e.b(1920, pd.a.f80340j, 20) ? 1 : 0), Integer.valueOf(e.a(1920, pd.a.f80340j, 20) ? 1 : 0)), "", 0);
        } else {
            h.a(this.f44277u, 2106, "Failed to enable hardware decoding，use software decoding.");
        }
        g gVar = this.f44274r;
        if (gVar != null) {
            gVar.onDecodeFailed(-1);
        }
    }

    private void f() {
        int i11 = this.f44268l;
        if (i11 < 40) {
            this.f44268l = i11 + 1;
        } else {
            e();
            this.f44268l = 0;
        }
    }

    @Override // com.tencent.liteav.videodecoder.b
    public int GetDecodeCost() {
        return this.f44272p;
    }

    public void a(JSONArray jSONArray) {
        this.f44273q = jSONArray;
    }

    @Override // com.tencent.liteav.videodecoder.b
    public int config(Surface surface) {
        if (surface == null) {
            return -1;
        }
        this.f44267k = surface;
        return 0;
    }

    @Override // com.tencent.liteav.videodecoder.b
    public void decode(TXSNALPacket tXSNALPacket) {
        a(tXSNALPacket.codecId == 1);
        if (tXSNALPacket.codecId == 0) {
            a(tXSNALPacket);
        }
        this.f44269m.add(tXSNALPacket);
        while (!this.f44269m.isEmpty()) {
            int size = this.f44269m.size();
            try {
                b();
            } catch (Exception e11) {
                TXCLog.e("MediaCodecDecoder", "decode: doDecode Exception!! " + e11.toString());
            }
            if (size == this.f44269m.size()) {
                return;
            }
        }
    }

    @Override // com.tencent.liteav.videodecoder.b
    public void enableLimitDecCache(boolean z11) {
        this.f44276t = z11;
        TXCLog.i("MediaCodecDecoder", "decode: enable limit dec cache: " + z11);
    }

    @Override // com.tencent.liteav.videodecoder.b
    public void setListener(g gVar) {
        this.f44274r = gVar;
    }

    @Override // com.tencent.liteav.videodecoder.b
    public void setNotifyListener(WeakReference<com.tencent.liteav.basic.b.b> weakReference) {
        this.f44277u = weakReference;
    }

    @Override // com.tencent.liteav.videodecoder.b
    public int start(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, boolean z11, boolean z12) {
        return a(byteBuffer, byteBuffer2, z12);
    }

    @Override // com.tencent.liteav.videodecoder.b
    public void stop() {
        a();
    }

    public void a(int i11, int i12) {
        if (i11 <= 0 || i12 <= 0) {
            return;
        }
        this.f44260d = i11;
        this.f44261e = i12;
        TXCLog.w("MediaCodecDecoder", "decode: init with video size: " + this.f44260d + j2.O + this.f44261e);
    }

    private void a(MediaFormat mediaFormat) {
        String str = com.tencent.liteav.basic.util.e.f43440d;
        if (str.toLowerCase().contains("qcom") && Build.VERSION.SDK_INT >= 28) {
            mediaFormat.setInteger("vendor.qti-ext-dec-low-latency.enable", 1);
            mediaFormat.setInteger("vendor.qti-ext-dec-picture-order.enable", 1);
        } else if (str.toLowerCase().contains("kirin") && Build.VERSION.SDK_INT >= 29) {
            mediaFormat.setInteger("vendor.hisi-ext-low-latency-video-dec.video-scene-for-low-latency-req", 1);
            mediaFormat.setInteger("vendor.hisi-ext-low-latency-video-dec.video-scene-for-low-latency-rdy", -1);
        }
        if (Build.VERSION.SDK_INT >= 30) {
            mediaFormat.setInteger("low-latency", 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x013d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int a(java.nio.ByteBuffer r8, java.nio.ByteBuffer r9, boolean r10) {
        /*
            Method dump skipped, instructions count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.videodecoder.f.a(java.nio.ByteBuffer, java.nio.ByteBuffer, boolean):int");
    }

    private void a() {
        MediaCodec mediaCodec = this.f44258b;
        if (mediaCodec != null) {
            try {
                try {
                    mediaCodec.stop();
                    TXCLog.w("MediaCodecDecoder", "decode: stop decoder sucess");
                } catch (Exception e11) {
                    TXCLog.e("MediaCodecDecoder", "decode: stop decoder Exception: " + e11.toString());
                    try {
                        try {
                            this.f44258b.release();
                            TXCLog.w("MediaCodecDecoder", "decode: release decoder sucess");
                        } finally {
                        }
                    } catch (Exception e12) {
                        TXCLog.e("MediaCodecDecoder", "decode: release decoder exception: " + e12.toString());
                    }
                }
                try {
                    try {
                        this.f44258b.release();
                        TXCLog.w("MediaCodecDecoder", "decode: release decoder sucess");
                    } catch (Exception e13) {
                        TXCLog.e("MediaCodecDecoder", "decode: release decoder exception: " + e13.toString());
                    }
                } finally {
                }
            } catch (Throwable th2) {
                try {
                    try {
                        this.f44258b.release();
                        TXCLog.w("MediaCodecDecoder", "decode: release decoder sucess");
                    } catch (Exception e14) {
                        TXCLog.e("MediaCodecDecoder", "decode: release decoder exception: " + e14.toString());
                        throw th2;
                    }
                    throw th2;
                } finally {
                }
            }
        }
        this.f44269m.clear();
        this.f44262f = 0L;
        this.f44264h = true;
        this.f44265i = false;
    }

    private void a(int i11, long j11, long j12, int i12) {
        this.f44258b.releaseOutputBuffer(i11, true);
        if ((this.f44257a.flags & 4) != 0) {
            TXCLog.i("MediaCodecDecoder", "output EOS");
        }
        try {
            g gVar = this.f44274r;
            if (gVar != null) {
                gVar.onDecodeFrame(null, this.f44260d, this.f44261e, j11, j12, i12);
            }
        } catch (Exception e11) {
            TXCLog.e("MediaCodecDecoder", "onDecodeFrame failed.", e11);
        }
        d();
    }

    private void a(boolean z11) {
        if (this.f44266j != z11) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("[Video][Decoder] nal data format changed, from:");
            boolean z12 = this.f44266j;
            String str = IjkMediaFormat.CODEC_NAME_H264;
            sb2.append(z12 ? "h265" : IjkMediaFormat.CODEC_NAME_H264);
            sb2.append(" to:");
            if (z11) {
                str = "h265";
            }
            sb2.append(str);
            TXCLog.i("MediaCodecDecoder", sb2.toString());
            this.f44266j = z11;
            if (z11 && !e.b(this.f44260d, this.f44261e, 20)) {
                a();
                e();
                return;
            }
            a();
            a(null, null, this.f44266j);
            g gVar = this.f44274r;
            if (gVar != null) {
                gVar.onDecoderChange(this.f44259c, this.f44266j);
            }
        }
    }

    private void a(TXSNALPacket tXSNALPacket) {
        byte[] bArr;
        int i11;
        byte[] bArr2;
        if (this.f44276t && tXSNALPacket.nalType == 0) {
            int i12 = 0;
            while (true) {
                try {
                    bArr = tXSNALPacket.nalData;
                    if (i12 >= bArr.length) {
                        i11 = -1;
                        break;
                    }
                    byte b11 = bArr[i12];
                    if (b11 == 0 && bArr[i12 + 1] == 0 && bArr[i12 + 2] == 0 && bArr[i12 + 3] == 1) {
                        i11 = i12 + 4;
                        if ((bArr[i11] & 31) == 7) {
                            break;
                        }
                    }
                    if (b11 == 0 && bArr[i12 + 1] == 0 && bArr[i12 + 2] == 0) {
                        i11 = i12 + 3;
                        if ((bArr[i11] & 31) == 7) {
                            break;
                        }
                    }
                    i12 += 2;
                } catch (Exception e11) {
                    TXCLog.e("MediaCodecDecoder", "modify dec buffer error ", e11);
                    return;
                }
            }
            if (i11 >= 0) {
                int length = bArr.length - i11;
                int i13 = i11;
                while (true) {
                    bArr2 = tXSNALPacket.nalData;
                    if (i13 >= bArr2.length) {
                        break;
                    }
                    byte b12 = bArr2[i13];
                    if ((b12 != 0 || bArr2[i13 + 1] != 0 || bArr2[i13 + 2] != 1) && (b12 != 0 || bArr2[i13 + 1] != 0 || bArr2[i13 + 2] != 0 || bArr2[i13 + 3] != 1)) {
                        i13++;
                    }
                }
                length = i13 - i11;
                byte[] bArr3 = new byte[length];
                System.arraycopy(bArr2, i11, bArr3, 0, length);
                byte[] a11 = this.f44275s.a(bArr3);
                if (a11 != null) {
                    byte[] bArr4 = tXSNALPacket.nalData;
                    byte[] bArr5 = new byte[(bArr4.length + a11.length) - length];
                    if (i11 > 0) {
                        System.arraycopy(bArr4, 0, bArr5, 0, i11);
                    }
                    System.arraycopy(a11, 0, bArr5, i11, a11.length);
                    byte[] bArr6 = tXSNALPacket.nalData;
                    System.arraycopy(bArr6, i11 + length, bArr5, a11.length + i11, (bArr6.length - length) - i11);
                    tXSNALPacket.nalData = bArr5;
                }
            }
        }
    }
}

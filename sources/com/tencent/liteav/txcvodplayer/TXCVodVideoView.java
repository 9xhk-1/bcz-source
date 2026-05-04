package com.tencent.liteav.txcvodplayer;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Surface;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.collection.SieveCacheKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.tencent.ijk.media.player.IMediaPlayer;
import com.tencent.ijk.media.player.IjkBitrateItem;
import com.tencent.ijk.media.player.IjkLibLoader;
import com.tencent.ijk.media.player.IjkMediaMeta;
import com.tencent.ijk.media.player.IjkMediaPlayer;
import com.tencent.ijk.media.player.IjkTimedText;
import com.tencent.ijk.media.player.MediaInfo;
import com.tencent.ijk.media.player.TextureMediaPlayer;
import com.tencent.liteav.TXLiteAVCode;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.h;
import com.tencent.liteav.txcvodplayer.a;
import com.tencent.rtmp.TXLiveConstants;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class TXCVodVideoView extends FrameLayout {
    private int A;
    private int B;
    private String C;
    private float D;
    private com.tencent.liteav.txcvodplayer.a.a E;
    private com.tencent.liteav.txcvodplayer.a.b F;
    private long G;
    private boolean H;
    private int I;
    private float J;
    private float K;
    private boolean L;
    private int M;
    private boolean N;
    private b O;
    private boolean P;
    private IMediaPlayer.OnCompletionListener Q;
    private IMediaPlayer.OnInfoListener R;
    private int S;
    private IMediaPlayer.OnErrorListener T;
    private IMediaPlayer.OnHevcVideoDecoderErrorListener U;
    private IMediaPlayer.OnVideoDecoderErrorListener V;
    private IMediaPlayer.OnBufferingUpdateListener W;

    /* renamed from: a, reason: collision with root package name */
    protected boolean f44134a;

    /* renamed from: aa, reason: collision with root package name */
    private IMediaPlayer.OnSeekCompleteListener f44135aa;

    /* renamed from: ab, reason: collision with root package name */
    private IMediaPlayer.OnTimedTextListener f44136ab;

    /* renamed from: ac, reason: collision with root package name */
    private IjkMediaPlayer.OnNativeInvokeListener f44137ac;

    /* renamed from: ad, reason: collision with root package name */
    private IMediaPlayer.OnHLSKeyErrorListener f44138ad;

    /* renamed from: ae, reason: collision with root package name */
    private int f44139ae;

    /* renamed from: af, reason: collision with root package name */
    private e f44140af;

    /* renamed from: ag, reason: collision with root package name */
    private Handler f44141ag;

    /* renamed from: ah, reason: collision with root package name */
    private boolean f44142ah;

    /* renamed from: b, reason: collision with root package name */
    protected boolean f44143b;

    /* renamed from: c, reason: collision with root package name */
    protected boolean f44144c;

    /* renamed from: d, reason: collision with root package name */
    protected final int f44145d;

    /* renamed from: e, reason: collision with root package name */
    IMediaPlayer.OnVideoSizeChangedListener f44146e;

    /* renamed from: f, reason: collision with root package name */
    IMediaPlayer.OnPreparedListener f44147f;

    /* renamed from: g, reason: collision with root package name */
    a.InterfaceC0518a f44148g;

    /* renamed from: h, reason: collision with root package name */
    private String f44149h;

    /* renamed from: i, reason: collision with root package name */
    private Uri f44150i;

    /* renamed from: j, reason: collision with root package name */
    private int f44151j;

    /* renamed from: k, reason: collision with root package name */
    private int f44152k;

    /* renamed from: l, reason: collision with root package name */
    private a.b f44153l;

    /* renamed from: m, reason: collision with root package name */
    private IMediaPlayer f44154m;

    /* renamed from: n, reason: collision with root package name */
    private int f44155n;

    /* renamed from: o, reason: collision with root package name */
    private int f44156o;

    /* renamed from: p, reason: collision with root package name */
    private int f44157p;

    /* renamed from: q, reason: collision with root package name */
    private int f44158q;

    /* renamed from: r, reason: collision with root package name */
    private int f44159r;

    /* renamed from: s, reason: collision with root package name */
    private int f44160s;

    /* renamed from: t, reason: collision with root package name */
    private int f44161t;

    /* renamed from: u, reason: collision with root package name */
    private int f44162u;

    /* renamed from: v, reason: collision with root package name */
    private int f44163v;

    /* renamed from: w, reason: collision with root package name */
    private int f44164w;

    /* renamed from: x, reason: collision with root package name */
    private Context f44165x;

    /* renamed from: y, reason: collision with root package name */
    private d f44166y;

    /* renamed from: z, reason: collision with root package name */
    private com.tencent.liteav.txcvodplayer.a f44167z;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a extends Handler {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference<TXCVodVideoView> f44184a;

        /* renamed from: b, reason: collision with root package name */
        private final int f44185b;

        public a(TXCVodVideoView tXCVodVideoView, Looper looper) {
            super(looper);
            this.f44185b = 500;
            this.f44184a = new WeakReference<>(tXCVodVideoView);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            TXCVodVideoView tXCVodVideoView = this.f44184a.get();
            if (tXCVodVideoView == null || tXCVodVideoView.f44140af == null) {
                return;
            }
            switch (message.what) {
                case 100:
                    IMediaPlayer unwrappedMediaPlayer = tXCVodVideoView.getUnwrappedMediaPlayer();
                    if (unwrappedMediaPlayer != null) {
                        IjkMediaPlayer ijkMediaPlayer = (IjkMediaPlayer) unwrappedMediaPlayer;
                        float videoOutputFramesPerSecond = ijkMediaPlayer.getVideoOutputFramesPerSecond();
                        float videoDecodeFramesPerSecond = ijkMediaPlayer.getVideoDecodeFramesPerSecond();
                        long videoCachedBytes = ijkMediaPlayer.getVideoCachedBytes() + ijkMediaPlayer.getAudioCachedBytes();
                        long bitRate = ijkMediaPlayer.getBitRate();
                        long tcpSpeed = ijkMediaPlayer.getTcpSpeed();
                        Bundle bundle = new Bundle();
                        bundle.putFloat("fps", videoOutputFramesPerSecond);
                        bundle.putFloat("dps", videoDecodeFramesPerSecond);
                        bundle.putLong("cachedBytes", videoCachedBytes);
                        bundle.putLong("bitRate", bitRate);
                        bundle.putLong("tcpSpeed", tcpSpeed);
                        tXCVodVideoView.f44140af.a(bundle);
                        removeMessages(100);
                        sendEmptyMessageDelayed(100, 500L);
                        break;
                    }
                    break;
                case 101:
                    tXCVodVideoView.f44140af.a(message.arg1, message.getData());
                    break;
                case 102:
                    tXCVodVideoView.c(true);
                    tXCVodVideoView.a(2103, "VOD network reconnected", "reconnect");
                    break;
                case 103:
                    long currentPosition = tXCVodVideoView.getCurrentPosition();
                    Bundle bundle2 = new Bundle();
                    long bufferDuration = tXCVodVideoView.getBufferDuration();
                    long duration = tXCVodVideoView.getDuration();
                    bundle2.putInt(TXLiveConstants.EVT_PLAY_PROGRESS, (int) (currentPosition / 1000));
                    bundle2.putInt(TXLiveConstants.EVT_PLAY_DURATION, (int) (duration / 1000));
                    bundle2.putInt("EVT_PLAYABLE_DURATION", (int) (bufferDuration / 1000));
                    bundle2.putInt(TXLiveConstants.EVT_PLAY_PROGRESS_MS, (int) currentPosition);
                    bundle2.putInt(TXLiveConstants.EVT_PLAY_DURATION_MS, (int) duration);
                    bundle2.putInt(TXLiveConstants.EVT_PLAYABLE_DURATION_MS, (int) bufferDuration);
                    tXCVodVideoView.f44140af.a(2005, bundle2);
                    if (tXCVodVideoView.f44154m != null) {
                        removeMessages(103);
                        if (tXCVodVideoView.f44166y.f44235l <= 0) {
                            tXCVodVideoView.f44166y.f44235l = 500;
                        }
                        sendEmptyMessageDelayed(103, tXCVodVideoView.f44166y.f44235l);
                        break;
                    }
                    break;
            }
        }
    }

    public TXCVodVideoView(Context context) {
        super(context);
        this.f44149h = "TXCVodVideoView";
        this.f44151j = 0;
        this.f44152k = 0;
        this.f44153l = null;
        this.f44154m = null;
        this.f44134a = true;
        this.D = 1.0f;
        this.F = com.tencent.liteav.txcvodplayer.a.b.a();
        this.f44143b = true;
        this.f44144c = true;
        this.f44145d = 0;
        this.H = false;
        this.I = -1;
        this.J = 1.0f;
        this.K = 1.0f;
        this.L = false;
        this.P = false;
        this.f44146e = new IMediaPlayer.OnVideoSizeChangedListener() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.9
            @Override // com.tencent.ijk.media.player.IMediaPlayer.OnVideoSizeChangedListener
            public void onVideoSizeChanged(IMediaPlayer iMediaPlayer, int i11, int i12, int i13, int i14) {
                boolean z11 = (TXCVodVideoView.this.f44156o != i12 && Math.abs(TXCVodVideoView.this.f44156o - i12) > 16) || (TXCVodVideoView.this.f44155n != i11 && Math.abs(TXCVodVideoView.this.f44155n - i11) > 16);
                TXCVodVideoView.this.f44155n = iMediaPlayer.getVideoWidth();
                TXCVodVideoView.this.f44156o = iMediaPlayer.getVideoHeight();
                TXCVodVideoView.this.A = iMediaPlayer.getVideoSarNum();
                TXCVodVideoView.this.B = iMediaPlayer.getVideoSarDen();
                if (TXCVodVideoView.this.f44155n != 0 && TXCVodVideoView.this.f44156o != 0) {
                    if (TXCVodVideoView.this.f44167z != null) {
                        TXCVodVideoView.this.f44167z.setVideoSize(TXCVodVideoView.this.f44155n, TXCVodVideoView.this.f44156o);
                        TXCVodVideoView.this.f44167z.setVideoSampleAspectRatio(TXCVodVideoView.this.A, TXCVodVideoView.this.B);
                    }
                    TXCVodVideoView.this.requestLayout();
                }
                if (z11) {
                    Message message = new Message();
                    message.what = 101;
                    message.arg1 = 2009;
                    Bundle bundle = new Bundle();
                    bundle.putString("description", "Resolution change:" + TXCVodVideoView.this.f44155n + "*" + TXCVodVideoView.this.f44156o);
                    bundle.putInt("EVT_PARAM1", TXCVodVideoView.this.f44155n);
                    bundle.putInt("EVT_PARAM2", TXCVodVideoView.this.f44156o);
                    message.setData(bundle);
                    if (TXCVodVideoView.this.f44141ag != null) {
                        TXCVodVideoView.this.f44141ag.sendMessage(message);
                    }
                }
            }
        };
        this.f44147f = new IMediaPlayer.OnPreparedListener() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.10
            @Override // com.tencent.ijk.media.player.IMediaPlayer.OnPreparedListener
            public void onPrepared(IMediaPlayer iMediaPlayer) {
                if (TXCVodVideoView.this.f44151j == 1) {
                    TXCVodVideoView.this.a(2013, "VOD ready", "prepared");
                    TXCVodVideoView tXCVodVideoView = TXCVodVideoView.this;
                    if (!tXCVodVideoView.f44144c) {
                        tXCVodVideoView.f44152k = 4;
                        TXCVodVideoView.this.f44144c = true;
                    }
                    TXCVodVideoView.this.f44151j = 2;
                }
                TXCVodVideoView.this.f44163v = 0;
                if (TXCVodVideoView.this.f44151j == -1) {
                    TXCVodVideoView.this.f44151j = 3;
                    TXCVodVideoView.this.f44152k = 3;
                }
                if (TXCVodVideoView.this.f44141ag != null) {
                    TXCVodVideoView.this.f44141ag.sendEmptyMessage(100);
                    TXCVodVideoView.this.f44141ag.sendEmptyMessage(103);
                }
                TXCVodVideoView.this.f44155n = iMediaPlayer.getVideoWidth();
                TXCVodVideoView.this.f44156o = iMediaPlayer.getVideoHeight();
                if (TXCVodVideoView.this.f44155n == 0 || TXCVodVideoView.this.f44156o == 0) {
                    if (TXCVodVideoView.this.f44152k == 3) {
                        TXCVodVideoView.this.b();
                    }
                } else if (TXCVodVideoView.this.f44167z != null) {
                    TXCVodVideoView.this.f44167z.setVideoSize(TXCVodVideoView.this.f44155n, TXCVodVideoView.this.f44156o);
                    TXCVodVideoView.this.f44167z.setVideoSampleAspectRatio(TXCVodVideoView.this.A, TXCVodVideoView.this.B);
                    if ((!TXCVodVideoView.this.f44167z.shouldWaitForResize() || (TXCVodVideoView.this.f44157p == TXCVodVideoView.this.f44155n && TXCVodVideoView.this.f44158q == TXCVodVideoView.this.f44156o)) && TXCVodVideoView.this.f44152k == 3) {
                        TXCVodVideoView.this.b();
                    }
                }
            }
        };
        this.Q = new IMediaPlayer.OnCompletionListener() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.11
            @Override // com.tencent.ijk.media.player.IMediaPlayer.OnCompletionListener
            public void onCompletion(IMediaPlayer iMediaPlayer) {
                TXCVodVideoView.this.f44151j = 5;
                TXCVodVideoView.this.f44152k = 5;
                TXCVodVideoView.this.a(2006, "Playback completed", "play end");
            }
        };
        this.R = new IMediaPlayer.OnInfoListener() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.12
            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            @Override // com.tencent.ijk.media.player.IMediaPlayer.OnInfoListener
            public boolean onInfo(IMediaPlayer iMediaPlayer, int i11, int i12) {
                if (i11 == 3) {
                    TXCLog.i(TXCVodVideoView.this.f44149h, "MEDIA_INFO_VIDEO_RENDERING_START:");
                    if (!TXCVodVideoView.this.N) {
                        TXCVodVideoView.this.a(2003, "VOD displayed the first frame", "render start");
                    }
                    TXCVodVideoView tXCVodVideoView = TXCVodVideoView.this;
                    tXCVodVideoView.setRate(tXCVodVideoView.D);
                    TXCVodVideoView.this.N = true;
                } else if (i11 == 10011) {
                    TXCVodVideoView.this.a(TXLiteAVCode.EVT_VOD_PLAY_FIRST_VIDEO_PACKET, "Video data received", "first video packet");
                } else if (i11 == 901) {
                    TXCLog.i(TXCVodVideoView.this.f44149h, "MEDIA_INFO_UNSUPPORTED_SUBTITLE:");
                } else if (i11 == 902) {
                    TXCLog.i(TXCVodVideoView.this.f44149h, "MEDIA_INFO_SUBTITLE_TIMED_OUT:");
                } else if (i11 == 10001) {
                    TXCLog.i(TXCVodVideoView.this.f44149h, "MEDIA_INFO_VIDEO_ROTATION_CHANGED: " + i12);
                    TXCVodVideoView.this.f44160s = i12;
                    TXCVodVideoView tXCVodVideoView2 = TXCVodVideoView.this;
                    if (tXCVodVideoView2.f44134a && tXCVodVideoView2.f44160s > 0) {
                        TXCVodVideoView tXCVodVideoView3 = TXCVodVideoView.this;
                        tXCVodVideoView3.f44159r = tXCVodVideoView3.f44160s;
                        if (TXCVodVideoView.this.f44167z != null) {
                            TXCVodVideoView.this.f44167z.setVideoRotation(TXCVodVideoView.this.f44159r);
                        }
                    }
                    TXCVodVideoView.this.a(2011, "Video angle " + TXCVodVideoView.this.f44160s, "rotation " + TXCVodVideoView.this.f44160s);
                } else if (i11 != 10002) {
                    switch (i11) {
                        case 700:
                            TXCLog.i(TXCVodVideoView.this.f44149h, "MEDIA_INFO_VIDEO_TRACK_LAGGING:");
                            break;
                        case 701:
                            TXCLog.i(TXCVodVideoView.this.f44149h, "MEDIA_INFO_BUFFERING_START:");
                            TXCVodVideoView.this.a(2007, "Buffer started", "loading start");
                            break;
                        case 702:
                            TXCLog.i(TXCVodVideoView.this.f44149h, "MEDIA_INFO_BUFFERING_END: eof " + i12);
                            TXCVodVideoView.this.a(2014, "Buffer ended", "loading end");
                            if ((i12 == 0 || TXCVodVideoView.this.f44150i == null || TXCVodVideoView.this.f44150i.getPath() == null || !TXCVodVideoView.this.f44150i.getPath().endsWith(IjkMediaMeta.IJKM_KEY_M3U8)) && TXCVodVideoView.this.f44152k == 3) {
                                TXCVodVideoView.this.a(2004, "Playback started", "playing");
                                break;
                            }
                            break;
                        case IMediaPlayer.MEDIA_INFO_NETWORK_BANDWIDTH /* 703 */:
                            TXCLog.i(TXCVodVideoView.this.f44149h, "MEDIA_INFO_NETWORK_BANDWIDTH: " + i12);
                            break;
                        default:
                            switch (i11) {
                                case 800:
                                    TXCLog.i(TXCVodVideoView.this.f44149h, "MEDIA_INFO_BAD_INTERLEAVING:");
                                    break;
                                case IMediaPlayer.MEDIA_INFO_NOT_SEEKABLE /* 801 */:
                                    TXCLog.i(TXCVodVideoView.this.f44149h, "MEDIA_INFO_NOT_SEEKABLE:");
                                    break;
                                case IMediaPlayer.MEDIA_INFO_METADATA_UPDATE /* 802 */:
                                    TXCLog.i(TXCVodVideoView.this.f44149h, "MEDIA_INFO_METADATA_UPDATE:");
                                    break;
                            }
                    }
                } else {
                    TXCLog.i(TXCVodVideoView.this.f44149h, "MEDIA_INFO_AUDIO_RENDERING_START:");
                }
                return true;
            }
        };
        this.T = new IMediaPlayer.OnErrorListener() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.13
            @Override // com.tencent.ijk.media.player.IMediaPlayer.OnErrorListener
            public boolean onError(IMediaPlayer iMediaPlayer, int i11, int i12) {
                TXCLog.e(TXCVodVideoView.this.f44149h, "onError: " + i11 + "," + i12);
                TXCVodVideoView.this.f44151j = -1;
                TXCVodVideoView.this.f44152k = -1;
                if (i11 == -1004 && i12 == -2303) {
                    TXCVodVideoView.this.a(i12, "The file does not exist", "file not exist");
                    TXCVodVideoView.this.c();
                    return true;
                }
                if (TXCVodVideoView.this.G != TXCVodVideoView.this.getCurrentPosition()) {
                    TXCVodVideoView.this.S = 0;
                }
                TXCVodVideoView.this.G = r4.getCurrentPosition();
                if (TXCVodVideoView.r(TXCVodVideoView.this) >= TXCVodVideoView.this.f44166y.f44224a) {
                    TXCVodVideoView.this.a(-2301, "Disconnected from the network. Playback error", "disconnect");
                    TXCVodVideoView.this.c();
                } else if (TXCVodVideoView.this.f44141ag != null) {
                    TXCVodVideoView.this.f44141ag.sendEmptyMessageDelayed(102, (long) (TXCVodVideoView.this.f44166y.f44225b * 1000.0f));
                }
                return true;
            }
        };
        this.U = new IMediaPlayer.OnHevcVideoDecoderErrorListener() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.14
            @Override // com.tencent.ijk.media.player.IMediaPlayer.OnHevcVideoDecoderErrorListener
            public void onHevcVideoDecoderError(IMediaPlayer iMediaPlayer) {
                Log.d(TXCVodVideoView.this.f44149h, "onHevcVideoDecoderError");
                TXCVodVideoView.this.a(-2304, "Vod H265 decoding failed", "hevc decode fail");
            }
        };
        this.V = new IMediaPlayer.OnVideoDecoderErrorListener() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.15
            @Override // com.tencent.ijk.media.player.IMediaPlayer.OnVideoDecoderErrorListener
            public void onVideoDecoderError(IMediaPlayer iMediaPlayer) {
                Log.d(TXCVodVideoView.this.f44149h, "onVideoDecoderError");
                if (TXCVodVideoView.this.f44151j != 4) {
                    TXCVodVideoView.this.a(2106, "VOD decoding failed", "decode fail");
                }
                if (TXCVodVideoView.this.N || !TXCVodVideoView.this.f44166y.f44227d || Math.min(TXCVodVideoView.this.f44156o, TXCVodVideoView.this.f44155n) >= 1080) {
                    return;
                }
                TXCVodVideoView.this.f44166y.f44227d = false;
                TXCVodVideoView.this.i();
            }
        };
        this.W = new IMediaPlayer.OnBufferingUpdateListener() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.2
            @Override // com.tencent.ijk.media.player.IMediaPlayer.OnBufferingUpdateListener
            public void onBufferingUpdate(IMediaPlayer iMediaPlayer, int i11) {
                TXCVodVideoView.this.f44161t = i11;
                if (TXCVodVideoView.this.f44151j == 3) {
                    TXCVodVideoView.this.f44162u = i11;
                }
            }
        };
        this.f44135aa = new IMediaPlayer.OnSeekCompleteListener() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.3
            @Override // com.tencent.ijk.media.player.IMediaPlayer.OnSeekCompleteListener
            public void onSeekComplete(IMediaPlayer iMediaPlayer) {
                TXCLog.v(TXCVodVideoView.this.f44149h, "seek complete");
                TXCVodVideoView.this.H = false;
                if (TXCVodVideoView.this.I >= 0) {
                    TXCVodVideoView tXCVodVideoView = TXCVodVideoView.this;
                    tXCVodVideoView.a(tXCVodVideoView.I);
                }
            }
        };
        this.f44136ab = new IMediaPlayer.OnTimedTextListener() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.4
            @Override // com.tencent.ijk.media.player.IMediaPlayer.OnTimedTextListener
            public void onTimedText(IMediaPlayer iMediaPlayer, IjkTimedText ijkTimedText) {
            }
        };
        this.f44137ac = new IjkMediaPlayer.OnNativeInvokeListener() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.5
            @Override // com.tencent.ijk.media.player.IjkMediaPlayer.OnNativeInvokeListener
            public boolean onNativeInvoke(int i11, Bundle bundle) {
                if (i11 == 2) {
                    String string = bundle.getString("url");
                    int i12 = bundle.getInt("error");
                    int i13 = bundle.getInt(IjkMediaPlayer.OnNativeInvokeListener.ARG_HTTP_CODE);
                    TXCLog.i(TXCVodVideoView.this.f44149h, "http connect url:" + string + ",error:" + i12 + ",httpCode:" + i13);
                    return false;
                }
                if (i11 != 131074) {
                    if (i11 != 131106) {
                        return false;
                    }
                    String string2 = bundle.getString("url");
                    int i14 = bundle.getInt("error");
                    String str = "dns resolved url:" + string2 + ",error:" + i14;
                    TXCLog.i(TXCVodVideoView.this.f44149h, str);
                    if (i14 == 0) {
                        TXCVodVideoView.this.a(TXLiteAVCode.EVT_VOD_PLAY_DNS_RESOLVED, str, "dns resolved");
                    }
                    return true;
                }
                TXCVodVideoView.this.C = bundle.getString(IjkMediaPlayer.OnNativeInvokeListener.ARG_IP);
                int i15 = bundle.getInt(IjkMediaPlayer.OnNativeInvokeListener.ARG_PORT);
                int i16 = bundle.getInt("error");
                String str2 = "TCP Connect ServerIp:" + TXCVodVideoView.this.C + ",port:" + i15 + ",error:" + i16;
                TXCLog.i(TXCVodVideoView.this.f44149h, str2);
                if (i16 == 0) {
                    TXCVodVideoView.this.a(TXLiteAVCode.EVT_VOD_PLAY_TCP_CONNECT_SUCC, str2, "tcp open");
                }
                return true;
            }
        };
        this.f44138ad = new IMediaPlayer.OnHLSKeyErrorListener() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.6
            @Override // com.tencent.ijk.media.player.IMediaPlayer.OnHLSKeyErrorListener
            public void onHLSKeyError(IMediaPlayer iMediaPlayer) {
                Log.e(TXCVodVideoView.this.f44149h, "onHLSKeyError");
                TXCVodVideoView.this.a(-2305, "HLS decypt key get failed", "hls key error");
                if (TXCVodVideoView.this.f44154m != null) {
                    TXCVodVideoView.this.f44154m.stop();
                    TXCVodVideoView.this.f44154m.release();
                    TXCVodVideoView.this.f44154m = null;
                }
                TXCVodVideoView.this.f44151j = -1;
                TXCVodVideoView.this.f44152k = -1;
            }
        };
        this.f44148g = new a.InterfaceC0518a() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.7
            @Override // com.tencent.liteav.txcvodplayer.a.InterfaceC0518a
            public void a(@NonNull a.b bVar, int i11, int i12, int i13) {
                if (bVar.a() != TXCVodVideoView.this.f44167z) {
                    TXCLog.e(TXCVodVideoView.this.f44149h, "onSurfaceChanged: unmatched render callback\n");
                    return;
                }
                TXCLog.i(TXCVodVideoView.this.f44149h, "onSurfaceChanged");
                TXCVodVideoView.this.f44157p = i12;
                TXCVodVideoView.this.f44158q = i13;
                boolean z11 = false;
                boolean z12 = TXCVodVideoView.this.f44152k == 3;
                if (!TXCVodVideoView.this.f44167z.shouldWaitForResize() || (TXCVodVideoView.this.f44155n == i12 && TXCVodVideoView.this.f44156o == i13)) {
                    z11 = true;
                }
                if (TXCVodVideoView.this.f44154m != null && z12 && z11 && TXCVodVideoView.this.f44152k == 3) {
                    TXCVodVideoView.this.b();
                }
            }

            @Override // com.tencent.liteav.txcvodplayer.a.InterfaceC0518a
            public void a(@NonNull a.b bVar, int i11, int i12) {
                if (bVar.a() != TXCVodVideoView.this.f44167z) {
                    TXCLog.e(TXCVodVideoView.this.f44149h, "onSurfaceCreated: unmatched render callback\n");
                    return;
                }
                TXCLog.i(TXCVodVideoView.this.f44149h, "onSurfaceCreated");
                TXCVodVideoView.this.f44153l = bVar;
                if (TXCVodVideoView.this.f44154m == null) {
                    TXCVodVideoView.this.h();
                } else {
                    TXCVodVideoView tXCVodVideoView = TXCVodVideoView.this;
                    tXCVodVideoView.a(tXCVodVideoView.f44154m, bVar);
                }
            }

            @Override // com.tencent.liteav.txcvodplayer.a.InterfaceC0518a
            public void a(@NonNull a.b bVar) {
                if (bVar.a() != TXCVodVideoView.this.f44167z) {
                    TXCLog.e(TXCVodVideoView.this.f44149h, "onSurfaceDestroyed: unmatched render callback\n");
                    return;
                }
                TXCLog.i(TXCVodVideoView.this.f44149h, "onSurfaceDestroyed");
                TXCVodVideoView.this.f44153l = null;
                if (TXCVodVideoView.this.f44154m != null) {
                    TXCVodVideoView.this.f44154m.setSurface(null);
                }
                TXCVodVideoView.this.a();
            }
        };
        this.f44139ae = 0;
        this.f44142ah = false;
        a(context);
    }

    public static /* synthetic */ int r(TXCVodVideoView tXCVodVideoView) {
        int i11 = tXCVodVideoView.S;
        tXCVodVideoView.S = i11 + 1;
        return i11;
    }

    public int getBitrateIndex() {
        IMediaPlayer iMediaPlayer;
        int i11 = this.M;
        return (i11 == -1 || (iMediaPlayer = this.f44154m) == null) ? i11 : iMediaPlayer.getBitrateIndex();
    }

    public int getBufferDuration() {
        if (this.f44154m == null) {
            return 0;
        }
        getUnwrappedMediaPlayer();
        int duration = (this.f44161t * getDuration()) / 100;
        if (duration < getCurrentPosition()) {
            duration = getCurrentPosition();
        }
        return Math.abs(getDuration() - duration) < 1000 ? getDuration() : duration;
    }

    public int getCurrentPosition() {
        int i11;
        if (this.H && (i11 = this.I) >= 0) {
            return i11;
        }
        int i12 = this.f44163v;
        if (i12 > 0) {
            return i12;
        }
        IMediaPlayer iMediaPlayer = this.f44154m;
        if (iMediaPlayer != null) {
            return (int) iMediaPlayer.getCurrentPosition();
        }
        return 0;
    }

    public int getDuration() {
        IMediaPlayer iMediaPlayer = this.f44154m;
        if (iMediaPlayer != null && this.f44164w < 1) {
            this.f44164w = (int) iMediaPlayer.getDuration();
        }
        return this.f44164w;
    }

    public MediaInfo getMediaInfo() {
        IMediaPlayer iMediaPlayer = this.f44154m;
        if (iMediaPlayer == null) {
            return null;
        }
        return iMediaPlayer.getMediaInfo();
    }

    public int getMetaRotationDegree() {
        return this.f44160s;
    }

    public int getPlayerType() {
        return 0;
    }

    public String getServerIp() {
        return this.C;
    }

    public ArrayList<IjkBitrateItem> getSupportedBitrates() {
        IMediaPlayer iMediaPlayer = this.f44154m;
        return iMediaPlayer != null ? iMediaPlayer.getSupportedBitrates() : new ArrayList<>();
    }

    public IMediaPlayer getUnwrappedMediaPlayer() {
        IMediaPlayer iMediaPlayer = this.f44154m;
        return iMediaPlayer instanceof TextureMediaPlayer ? ((TextureMediaPlayer) iMediaPlayer).getBackEndMediaPlayer() : iMediaPlayer;
    }

    @NonNull
    public String getUrlPathExtention() {
        Uri uri = this.f44150i;
        if (uri == null || uri.getPath() == null) {
            return "";
        }
        String path = this.f44150i.getPath();
        return path.substring(path.lastIndexOf(".") + 1, path.length());
    }

    public int getVideoHeight() {
        return this.f44156o;
    }

    public int getVideoRotationDegree() {
        return this.f44159r;
    }

    public int getVideoWidth() {
        return this.f44155n;
    }

    public void setAudioPlayoutVolume(int i11) {
        IMediaPlayer iMediaPlayer = this.f44154m;
        if (iMediaPlayer != null) {
            iMediaPlayer.setAudioVolume(i11);
        }
    }

    public void setAutoPlay(boolean z11) {
        this.f44144c = z11;
    }

    public void setAutoRotate(boolean z11) {
        this.f44134a = z11;
    }

    public void setBitrateIndex(int i11) {
        TXCLog.i(this.f44149h, "setBitrateIndex " + i11);
        if (this.M == i11) {
            return;
        }
        this.M = i11;
        IMediaPlayer iMediaPlayer = this.f44154m;
        if (iMediaPlayer != null) {
            if (!this.f44166y.f44233j) {
                i();
            } else if (i11 != -1) {
                iMediaPlayer.setBitrateIndex(i11);
            } else {
                iMediaPlayer.enableAdaptiveBitrate();
            }
        }
    }

    public void setConfig(d dVar) {
        if (dVar != null) {
            this.f44166y = dVar;
            this.F.a(dVar.f44234k);
        }
    }

    public void setListener(e eVar) {
        this.f44140af = eVar;
    }

    public void setMute(boolean z11) {
        this.L = z11;
        IMediaPlayer iMediaPlayer = this.f44154m;
        if (iMediaPlayer == null) {
            return;
        }
        if (z11) {
            iMediaPlayer.setVolume(0.0f, 0.0f);
        } else {
            iMediaPlayer.setVolume(this.J, this.K);
        }
    }

    public void setRate(float f11) {
        TXCLog.i(this.f44149h, "setRate " + f11);
        IMediaPlayer iMediaPlayer = this.f44154m;
        if (iMediaPlayer != null) {
            iMediaPlayer.setRate(f11);
        }
        this.D = f11;
    }

    public void setRender(int i11) {
        if (i11 == 0) {
            setRenderView(null);
            return;
        }
        if (i11 == 1) {
            setRenderView(new SurfaceRenderView(this.f44165x));
            return;
        }
        if (i11 != 2) {
            TXCLog.e(this.f44149h, String.format(Locale.getDefault(), "invalid render %d\n", Integer.valueOf(i11)));
            return;
        }
        TextureRenderView textureRenderView = new TextureRenderView(this.f44165x);
        if (this.f44154m != null) {
            textureRenderView.getSurfaceHolder().a(this.f44154m);
            textureRenderView.setVideoSize(this.f44154m.getVideoWidth(), this.f44154m.getVideoHeight());
            textureRenderView.setVideoSampleAspectRatio(this.f44154m.getVideoSarNum(), this.f44154m.getVideoSarDen());
            textureRenderView.setAspectRatio(this.f44139ae);
        }
        setRenderView(textureRenderView);
    }

    public void setRenderMode(int i11) {
        this.f44139ae = i11;
        com.tencent.liteav.txcvodplayer.a aVar = this.f44167z;
        if (aVar != null) {
            aVar.setAspectRatio(i11);
        }
        com.tencent.liteav.txcvodplayer.a aVar2 = this.f44167z;
        if (aVar2 != null) {
            aVar2.setVideoRotation(this.f44159r);
        }
    }

    public void setRenderSurface(final Surface surface) {
        a.b bVar = new a.b() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.1
            @Override // com.tencent.liteav.txcvodplayer.a.b
            public void a(IMediaPlayer iMediaPlayer) {
                iMediaPlayer.setSurface(surface);
            }

            @Override // com.tencent.liteav.txcvodplayer.a.b
            @NonNull
            public com.tencent.liteav.txcvodplayer.a a() {
                return TXCVodVideoView.this.f44167z;
            }
        };
        this.f44153l = bVar;
        IMediaPlayer iMediaPlayer = this.f44154m;
        if (iMediaPlayer != null) {
            a(iMediaPlayer, bVar);
        }
    }

    public void setRenderView(com.tencent.liteav.txcvodplayer.a aVar) {
        int i11;
        int i12;
        TXCLog.i(this.f44149h, "setRenderView " + aVar);
        if (this.f44167z != null) {
            IMediaPlayer iMediaPlayer = this.f44154m;
            if (iMediaPlayer != null) {
                iMediaPlayer.setDisplay(null);
            }
            View view = this.f44167z.getView();
            this.f44167z.removeRenderCallback(this.f44148g);
            this.f44167z = null;
            if (view.getParent() == this) {
                removeView(view);
            }
        }
        if (aVar == null) {
            return;
        }
        this.f44167z = aVar;
        aVar.setAspectRatio(this.f44139ae);
        int i13 = this.f44155n;
        if (i13 > 0 && (i12 = this.f44156o) > 0) {
            aVar.setVideoSize(i13, i12);
        }
        int i14 = this.A;
        if (i14 > 0 && (i11 = this.B) > 0) {
            aVar.setVideoSampleAspectRatio(i14, i11);
        }
        View view2 = this.f44167z.getView();
        view2.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        if (view2.getParent() == null) {
            addView(view2);
        }
        this.f44167z.addRenderCallback(this.f44148g);
        this.f44167z.setVideoRotation(this.f44159r);
    }

    public void setStartTime(float f11) {
        this.f44163v = (int) (f11 * 1000.0f);
    }

    public void setTextureRenderView(TextureRenderView textureRenderView) {
        TXCLog.i(this.f44149h, "setTextureRenderView " + textureRenderView);
        if (this.f44154m != null) {
            textureRenderView.getSurfaceHolder().a(this.f44154m);
            textureRenderView.setVideoSize(this.f44154m.getVideoWidth(), this.f44154m.getVideoHeight());
            textureRenderView.setVideoSampleAspectRatio(this.f44154m.getVideoSarNum(), this.f44154m.getVideoSarDen());
            textureRenderView.setAspectRatio(this.f44139ae);
        }
        setRenderView(textureRenderView);
    }

    public void setVideoPath(String str) {
        setVideoURI(Uri.parse(str));
    }

    public void setVideoRotationDegree(int i11) {
        if (i11 != 0 && i11 != 90 && i11 != 180 && i11 != 270) {
            if (i11 != 360) {
                TXCLog.e(this.f44149h, "not support degree " + i11);
                return;
            }
            i11 = 0;
        }
        this.f44159r = i11;
        com.tencent.liteav.txcvodplayer.a aVar = this.f44167z;
        if (aVar != null) {
            aVar.setVideoRotation(i11);
        }
        com.tencent.liteav.txcvodplayer.a aVar2 = this.f44167z;
        if (aVar2 != null) {
            aVar2.setAspectRatio(this.f44139ae);
        }
    }

    public void setVideoURI(Uri uri) {
        this.f44150i = uri;
        this.f44164w = 0;
        this.S = 0;
        this.C = null;
        TXCLog.i(this.f44149h, "setVideoURI " + uri);
        h();
        requestLayout();
        invalidate();
    }

    public void setVolume(int i11) {
        float f11 = i11 / 100.0f;
        this.J = f11;
        this.K = f11;
        IMediaPlayer iMediaPlayer = this.f44154m;
        if (iMediaPlayer != null) {
            iMediaPlayer.setVolume(f11, f11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @TargetApi(23)
    public boolean h() {
        boolean z11;
        IjkMediaPlayer ijkMediaPlayer;
        TXCLog.i(this.f44149h, "openVideo");
        if (this.f44150i == null) {
            return false;
        }
        a(false);
        if (this.f44143b) {
            ((AudioManager) this.f44165x.getSystemService("audio")).requestAudioFocus(null, 3, 1);
        }
        try {
            try {
                String uri = this.f44150i.toString();
                if (uri.startsWith("/") && !new File(uri).exists()) {
                    throw new FileNotFoundException();
                }
                if (this.f44150i != null) {
                    ijkMediaPlayer = new IjkMediaPlayer(new IjkLibLoader() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.8
                        @Override // com.tencent.ijk.media.player.IjkLibLoader
                        public void loadLibrary(String str) throws UnsatisfiedLinkError, SecurityException {
                            h.a(str);
                        }
                    });
                    IjkMediaPlayer.native_setLogLevel(3);
                    ijkMediaPlayer.setOnNativeInvokeListener(this.f44137ac);
                    if (this.f44166y.f44227d) {
                        ijkMediaPlayer.setOption(4, "mediacodec", 1L);
                        ijkMediaPlayer.setOption(4, "mediacodec-hevc", 1L);
                        this.P = true;
                    } else {
                        ijkMediaPlayer.setOption(4, "mediacodec", 0L);
                        this.P = false;
                    }
                    TXCLog.i(this.f44149h, "ijk mediacodec " + this.f44166y.f44227d);
                    ijkMediaPlayer.setOption(4, "mediacodec-auto-rotate", 0L);
                    ijkMediaPlayer.setOption(4, "mediacodec-handle-resolution-change", 0L);
                    ijkMediaPlayer.setOption(4, "opensles", 0L);
                    ijkMediaPlayer.setOption(4, "overlay-format", 842225234L);
                    ijkMediaPlayer.setOption(4, "framedrop", 1L);
                    ijkMediaPlayer.setOption(4, "soundtouch", 1L);
                    try {
                        ijkMediaPlayer.setOption(4, "max-fps", 30L);
                        if (this.f44144c && this.f44152k != 4) {
                            ijkMediaPlayer.setOption(4, "start-on-prepared", 1L);
                        } else {
                            ijkMediaPlayer.setOption(4, "start-on-prepared", 0L);
                        }
                        ijkMediaPlayer.setOption(4, "load-on-prepared", 1L);
                        ijkMediaPlayer.setOption(1, "http-detect-range-support", 0L);
                        ijkMediaPlayer.setOption(2, "skip_loop_filter", 0L);
                        ijkMediaPlayer.setOption(2, "skip_frame", 0L);
                        ijkMediaPlayer.setOption(1, com.alipay.sdk.m.m.a.f10784h0, (int) (this.f44166y.f44226c * 1000.0f * 1000.0f));
                        ijkMediaPlayer.setOption(1, "reconnect", 1L);
                        ijkMediaPlayer.setOption(4, "enable-accurate-seek", this.f44166y.f44232i ? 1L : 0L);
                        ijkMediaPlayer.setOption(4, "disable-bitrate-sync", (this.f44166y.f44233j || this.M == -1) ? 0L : 1L);
                        ijkMediaPlayer.setOption(1, "dns_cache_timeout", 0L);
                        ijkMediaPlayer.setOption(1, "cache_max_capacity", SieveCacheKt.NodeLinkMask);
                        int i11 = this.f44163v;
                        if (i11 > 0) {
                            ijkMediaPlayer.setOption(4, "seek-at-start", i11);
                            TXCLog.i(this.f44149h, "ijk start time " + this.f44163v);
                        }
                        if (this.f44166y.f44236m > 0) {
                            ijkMediaPlayer.setOption(4, "max-buffer-size", r3 * 1048576);
                            TXCLog.i(this.f44149h, "ijk max buffer size " + this.f44166y.f44236m);
                        }
                        Map<String, String> map = this.f44166y.f44231h;
                        if (map != null) {
                            String str = null;
                            for (String str2 : map.keySet()) {
                                str = str == null ? String.format("%s: %s", str2, this.f44166y.f44231h.get(str2)) : str + "\r\n" + String.format("%s: %s", str2, this.f44166y.f44231h.get(str2));
                            }
                            ijkMediaPlayer.setOption(1, "headers", str);
                        }
                        int i12 = this.M;
                        if (i12 == -1) {
                            ijkMediaPlayer.enableAdaptiveBitrate();
                        } else {
                            ijkMediaPlayer.setBitrateIndex(i12);
                        }
                        IjkMediaPlayer.native_setLogLevel(5);
                        if (this.f44166y.f44228e != null && this.F.e(uri)) {
                            this.F.b(this.f44166y.f44228e);
                            this.F.a(this.f44166y.f44229f);
                            com.tencent.liteav.txcvodplayer.a.a d11 = this.F.d(uri);
                            this.E = d11;
                            if (d11 != null) {
                                if (d11.a() != null) {
                                    ijkMediaPlayer.setOption(1, "cache_file_path", this.E.a());
                                    uri = "ijkio:cache:ffio:" + this.f44150i.toString();
                                } else if (this.E.b() != null) {
                                    ijkMediaPlayer.setOption(1, "cache_db_path", this.E.b());
                                    uri = "ijkhlscache:" + this.f44150i.toString();
                                }
                            }
                        }
                    } catch (FileNotFoundException unused) {
                        z11 = true;
                        this.f44151j = -1;
                        this.f44152k = -1;
                        this.T.onError(this.f44154m, IMediaPlayer.MEDIA_ERROR_IO, -2303);
                        return z11;
                    }
                } else {
                    ijkMediaPlayer = null;
                }
                TXCLog.i(this.f44149h, "ijk media player " + ijkMediaPlayer);
                TextureMediaPlayer textureMediaPlayer = new TextureMediaPlayer(ijkMediaPlayer);
                this.f44154m = textureMediaPlayer;
                textureMediaPlayer.setDataSource(uri);
                this.f44154m.setOnPreparedListener(this.f44147f);
                this.f44154m.setOnVideoSizeChangedListener(this.f44146e);
                this.f44154m.setOnCompletionListener(this.Q);
                this.f44154m.setOnErrorListener(this.T);
                this.f44154m.setOnInfoListener(this.R);
                this.f44154m.setOnBufferingUpdateListener(this.W);
                this.f44154m.setOnSeekCompleteListener(this.f44135aa);
                this.f44154m.setOnTimedTextListener(this.f44136ab);
                this.f44154m.setOnHLSKeyErrorListener(this.f44138ad);
                this.f44154m.setOnHevcVideoDecoderErrorListener(this.U);
                this.f44154m.setOnVideoDecoderErrorListener(this.V);
                this.f44161t = 0;
                a(this.f44154m, this.f44153l);
                this.f44154m.setAudioStreamType(3);
                this.f44154m.setScreenOnWhilePlaying(true);
                this.f44154m.prepareAsync();
                this.f44154m.setVolume(this.J, this.K);
                setMute(this.L);
                b bVar = this.O;
                if (bVar != null) {
                    bVar.a(this.f44154m);
                }
                this.f44151j = 1;
                return true;
            } catch (FileNotFoundException unused2) {
                z11 = true;
            }
        } catch (Exception e11) {
            TXCLog.w(this.f44149h, e11.toString());
            this.f44151j = -1;
            this.f44152k = -1;
            this.T.onError(this.f44154m, 1, 0);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        c(false);
    }

    private boolean j() {
        int i11;
        return (this.f44154m == null || (i11 = this.f44151j) == -1 || i11 == 0 || i11 == 1) ? false : true;
    }

    private void k() {
        setRender(0);
    }

    public void d() {
        this.f44152k = 4;
        TXCLog.i(this.f44149h, ma.b.L);
        if (j() && this.f44154m.isPlaying()) {
            this.f44154m.pause();
            this.f44151j = 4;
        }
    }

    public boolean e() {
        return j() && this.f44154m.isPlaying() && this.f44151j != 4;
    }

    public void f() {
        IMediaPlayer iMediaPlayer = this.f44154m;
        if (iMediaPlayer != null) {
            iMediaPlayer.publishAudioToNetwork();
        }
    }

    public void g() {
        IMediaPlayer iMediaPlayer = this.f44154m;
        if (iMediaPlayer != null) {
            iMediaPlayer.unpublishAudioToNetwork();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(boolean z11) {
        IMediaPlayer iMediaPlayer;
        int i11;
        TXCLog.i(this.f44149h, "replay, isFromErrorState = " + z11);
        if (z11 && (i11 = this.f44162u) > 0) {
            this.f44163v = (i11 * getDuration()) / 100;
        } else if (this.f44163v == 0 && (iMediaPlayer = this.f44154m) != null && this.f44164w > 0) {
            this.f44163v = (int) iMediaPlayer.getCurrentPosition();
        }
        if (h()) {
            return;
        }
        a(false);
    }

    public void b() {
        TXCLog.i(this.f44149h, TtmlNode.START);
        if (j()) {
            this.f44154m.start();
            if (this.f44151j != 3 && !this.H) {
                this.f44151j = 3;
                a(2004, "Playback started", "playing");
            }
        }
        this.f44152k = 3;
    }

    private void a(Context context) {
        this.f44165x = context.getApplicationContext();
        this.f44166y = new d();
        k();
        this.f44155n = 0;
        this.f44156o = 0;
        setFocusable(true);
        setFocusableInTouchMode(true);
        requestFocus();
        this.f44151j = 0;
        this.f44152k = 0;
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            this.f44141ag = new a(this, mainLooper);
        } else {
            this.f44141ag = null;
        }
        this.O = new b();
    }

    public boolean b(boolean z11) {
        if (this.f44151j != 0) {
            return false;
        }
        this.f44143b = z11;
        return true;
    }

    public void c() {
        if (this.f44154m != null) {
            if (this.E != null) {
                if (getDuration() <= 0) {
                    this.F.a(this.E.d(), true);
                } else {
                    this.F.a(this.E.d(), false);
                }
                this.E = null;
            }
            this.f44154m.stop();
            this.f44154m.release();
            this.f44154m = null;
            this.f44150i = null;
            this.f44155n = 0;
            this.f44156o = 0;
            this.D = 1.0f;
            this.H = false;
            this.I = -1;
            this.f44151j = 0;
            this.f44152k = 0;
            this.N = false;
            this.P = false;
            this.M = 0;
            b bVar = this.O;
            if (bVar != null) {
                bVar.a((IMediaPlayer) null);
            }
            if (this.f44143b) {
                ((AudioManager) this.f44165x.getSystemService("audio")).abandonAudioFocus(null);
            }
        }
        Handler handler = this.f44141ag;
        if (handler != null) {
            handler.removeMessages(102);
        }
        TXCLog.i(this.f44149h, "stop");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(IMediaPlayer iMediaPlayer, a.b bVar) {
        if (iMediaPlayer == null) {
            return;
        }
        if (bVar == null) {
            iMediaPlayer.setDisplay(null);
        } else {
            TXCLog.i(this.f44149h, "bindSurfaceHolder");
            bVar.a(iMediaPlayer);
        }
    }

    public void setPlayerType(int i11) {
    }

    public void a() {
        IMediaPlayer iMediaPlayer = this.f44154m;
        if (iMediaPlayer != null) {
            iMediaPlayer.setDisplay(null);
        }
    }

    public void a(boolean z11) {
        if (this.f44154m != null) {
            TXCLog.i(this.f44149h, "release player " + this.f44154m);
            this.f44154m.release();
            this.f44154m = null;
            this.f44151j = 0;
            if (z11) {
                this.f44152k = 0;
                this.f44155n = 0;
                this.f44156o = 0;
            }
            if (this.f44143b) {
                ((AudioManager) this.f44165x.getSystemService("audio")).abandonAudioFocus(null);
            }
        }
    }

    public TXCVodVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44149h = "TXCVodVideoView";
        this.f44151j = 0;
        this.f44152k = 0;
        this.f44153l = null;
        this.f44154m = null;
        this.f44134a = true;
        this.D = 1.0f;
        this.F = com.tencent.liteav.txcvodplayer.a.b.a();
        this.f44143b = true;
        this.f44144c = true;
        this.f44145d = 0;
        this.H = false;
        this.I = -1;
        this.J = 1.0f;
        this.K = 1.0f;
        this.L = false;
        this.P = false;
        this.f44146e = new IMediaPlayer.OnVideoSizeChangedListener() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.9
            @Override // com.tencent.ijk.media.player.IMediaPlayer.OnVideoSizeChangedListener
            public void onVideoSizeChanged(IMediaPlayer iMediaPlayer, int i11, int i12, int i13, int i14) {
                boolean z11 = (TXCVodVideoView.this.f44156o != i12 && Math.abs(TXCVodVideoView.this.f44156o - i12) > 16) || (TXCVodVideoView.this.f44155n != i11 && Math.abs(TXCVodVideoView.this.f44155n - i11) > 16);
                TXCVodVideoView.this.f44155n = iMediaPlayer.getVideoWidth();
                TXCVodVideoView.this.f44156o = iMediaPlayer.getVideoHeight();
                TXCVodVideoView.this.A = iMediaPlayer.getVideoSarNum();
                TXCVodVideoView.this.B = iMediaPlayer.getVideoSarDen();
                if (TXCVodVideoView.this.f44155n != 0 && TXCVodVideoView.this.f44156o != 0) {
                    if (TXCVodVideoView.this.f44167z != null) {
                        TXCVodVideoView.this.f44167z.setVideoSize(TXCVodVideoView.this.f44155n, TXCVodVideoView.this.f44156o);
                        TXCVodVideoView.this.f44167z.setVideoSampleAspectRatio(TXCVodVideoView.this.A, TXCVodVideoView.this.B);
                    }
                    TXCVodVideoView.this.requestLayout();
                }
                if (z11) {
                    Message message = new Message();
                    message.what = 101;
                    message.arg1 = 2009;
                    Bundle bundle = new Bundle();
                    bundle.putString("description", "Resolution change:" + TXCVodVideoView.this.f44155n + "*" + TXCVodVideoView.this.f44156o);
                    bundle.putInt("EVT_PARAM1", TXCVodVideoView.this.f44155n);
                    bundle.putInt("EVT_PARAM2", TXCVodVideoView.this.f44156o);
                    message.setData(bundle);
                    if (TXCVodVideoView.this.f44141ag != null) {
                        TXCVodVideoView.this.f44141ag.sendMessage(message);
                    }
                }
            }
        };
        this.f44147f = new IMediaPlayer.OnPreparedListener() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.10
            @Override // com.tencent.ijk.media.player.IMediaPlayer.OnPreparedListener
            public void onPrepared(IMediaPlayer iMediaPlayer) {
                if (TXCVodVideoView.this.f44151j == 1) {
                    TXCVodVideoView.this.a(2013, "VOD ready", "prepared");
                    TXCVodVideoView tXCVodVideoView = TXCVodVideoView.this;
                    if (!tXCVodVideoView.f44144c) {
                        tXCVodVideoView.f44152k = 4;
                        TXCVodVideoView.this.f44144c = true;
                    }
                    TXCVodVideoView.this.f44151j = 2;
                }
                TXCVodVideoView.this.f44163v = 0;
                if (TXCVodVideoView.this.f44151j == -1) {
                    TXCVodVideoView.this.f44151j = 3;
                    TXCVodVideoView.this.f44152k = 3;
                }
                if (TXCVodVideoView.this.f44141ag != null) {
                    TXCVodVideoView.this.f44141ag.sendEmptyMessage(100);
                    TXCVodVideoView.this.f44141ag.sendEmptyMessage(103);
                }
                TXCVodVideoView.this.f44155n = iMediaPlayer.getVideoWidth();
                TXCVodVideoView.this.f44156o = iMediaPlayer.getVideoHeight();
                if (TXCVodVideoView.this.f44155n == 0 || TXCVodVideoView.this.f44156o == 0) {
                    if (TXCVodVideoView.this.f44152k == 3) {
                        TXCVodVideoView.this.b();
                    }
                } else if (TXCVodVideoView.this.f44167z != null) {
                    TXCVodVideoView.this.f44167z.setVideoSize(TXCVodVideoView.this.f44155n, TXCVodVideoView.this.f44156o);
                    TXCVodVideoView.this.f44167z.setVideoSampleAspectRatio(TXCVodVideoView.this.A, TXCVodVideoView.this.B);
                    if ((!TXCVodVideoView.this.f44167z.shouldWaitForResize() || (TXCVodVideoView.this.f44157p == TXCVodVideoView.this.f44155n && TXCVodVideoView.this.f44158q == TXCVodVideoView.this.f44156o)) && TXCVodVideoView.this.f44152k == 3) {
                        TXCVodVideoView.this.b();
                    }
                }
            }
        };
        this.Q = new IMediaPlayer.OnCompletionListener() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.11
            @Override // com.tencent.ijk.media.player.IMediaPlayer.OnCompletionListener
            public void onCompletion(IMediaPlayer iMediaPlayer) {
                TXCVodVideoView.this.f44151j = 5;
                TXCVodVideoView.this.f44152k = 5;
                TXCVodVideoView.this.a(2006, "Playback completed", "play end");
            }
        };
        this.R = new IMediaPlayer.OnInfoListener() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.12
            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            @Override // com.tencent.ijk.media.player.IMediaPlayer.OnInfoListener
            public boolean onInfo(IMediaPlayer iMediaPlayer, int i11, int i12) {
                if (i11 == 3) {
                    TXCLog.i(TXCVodVideoView.this.f44149h, "MEDIA_INFO_VIDEO_RENDERING_START:");
                    if (!TXCVodVideoView.this.N) {
                        TXCVodVideoView.this.a(2003, "VOD displayed the first frame", "render start");
                    }
                    TXCVodVideoView tXCVodVideoView = TXCVodVideoView.this;
                    tXCVodVideoView.setRate(tXCVodVideoView.D);
                    TXCVodVideoView.this.N = true;
                } else if (i11 == 10011) {
                    TXCVodVideoView.this.a(TXLiteAVCode.EVT_VOD_PLAY_FIRST_VIDEO_PACKET, "Video data received", "first video packet");
                } else if (i11 == 901) {
                    TXCLog.i(TXCVodVideoView.this.f44149h, "MEDIA_INFO_UNSUPPORTED_SUBTITLE:");
                } else if (i11 == 902) {
                    TXCLog.i(TXCVodVideoView.this.f44149h, "MEDIA_INFO_SUBTITLE_TIMED_OUT:");
                } else if (i11 == 10001) {
                    TXCLog.i(TXCVodVideoView.this.f44149h, "MEDIA_INFO_VIDEO_ROTATION_CHANGED: " + i12);
                    TXCVodVideoView.this.f44160s = i12;
                    TXCVodVideoView tXCVodVideoView2 = TXCVodVideoView.this;
                    if (tXCVodVideoView2.f44134a && tXCVodVideoView2.f44160s > 0) {
                        TXCVodVideoView tXCVodVideoView3 = TXCVodVideoView.this;
                        tXCVodVideoView3.f44159r = tXCVodVideoView3.f44160s;
                        if (TXCVodVideoView.this.f44167z != null) {
                            TXCVodVideoView.this.f44167z.setVideoRotation(TXCVodVideoView.this.f44159r);
                        }
                    }
                    TXCVodVideoView.this.a(2011, "Video angle " + TXCVodVideoView.this.f44160s, "rotation " + TXCVodVideoView.this.f44160s);
                } else if (i11 != 10002) {
                    switch (i11) {
                        case 700:
                            TXCLog.i(TXCVodVideoView.this.f44149h, "MEDIA_INFO_VIDEO_TRACK_LAGGING:");
                            break;
                        case 701:
                            TXCLog.i(TXCVodVideoView.this.f44149h, "MEDIA_INFO_BUFFERING_START:");
                            TXCVodVideoView.this.a(2007, "Buffer started", "loading start");
                            break;
                        case 702:
                            TXCLog.i(TXCVodVideoView.this.f44149h, "MEDIA_INFO_BUFFERING_END: eof " + i12);
                            TXCVodVideoView.this.a(2014, "Buffer ended", "loading end");
                            if ((i12 == 0 || TXCVodVideoView.this.f44150i == null || TXCVodVideoView.this.f44150i.getPath() == null || !TXCVodVideoView.this.f44150i.getPath().endsWith(IjkMediaMeta.IJKM_KEY_M3U8)) && TXCVodVideoView.this.f44152k == 3) {
                                TXCVodVideoView.this.a(2004, "Playback started", "playing");
                                break;
                            }
                            break;
                        case IMediaPlayer.MEDIA_INFO_NETWORK_BANDWIDTH /* 703 */:
                            TXCLog.i(TXCVodVideoView.this.f44149h, "MEDIA_INFO_NETWORK_BANDWIDTH: " + i12);
                            break;
                        default:
                            switch (i11) {
                                case 800:
                                    TXCLog.i(TXCVodVideoView.this.f44149h, "MEDIA_INFO_BAD_INTERLEAVING:");
                                    break;
                                case IMediaPlayer.MEDIA_INFO_NOT_SEEKABLE /* 801 */:
                                    TXCLog.i(TXCVodVideoView.this.f44149h, "MEDIA_INFO_NOT_SEEKABLE:");
                                    break;
                                case IMediaPlayer.MEDIA_INFO_METADATA_UPDATE /* 802 */:
                                    TXCLog.i(TXCVodVideoView.this.f44149h, "MEDIA_INFO_METADATA_UPDATE:");
                                    break;
                            }
                    }
                } else {
                    TXCLog.i(TXCVodVideoView.this.f44149h, "MEDIA_INFO_AUDIO_RENDERING_START:");
                }
                return true;
            }
        };
        this.T = new IMediaPlayer.OnErrorListener() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.13
            @Override // com.tencent.ijk.media.player.IMediaPlayer.OnErrorListener
            public boolean onError(IMediaPlayer iMediaPlayer, int i11, int i12) {
                TXCLog.e(TXCVodVideoView.this.f44149h, "onError: " + i11 + "," + i12);
                TXCVodVideoView.this.f44151j = -1;
                TXCVodVideoView.this.f44152k = -1;
                if (i11 == -1004 && i12 == -2303) {
                    TXCVodVideoView.this.a(i12, "The file does not exist", "file not exist");
                    TXCVodVideoView.this.c();
                    return true;
                }
                if (TXCVodVideoView.this.G != TXCVodVideoView.this.getCurrentPosition()) {
                    TXCVodVideoView.this.S = 0;
                }
                TXCVodVideoView.this.G = r4.getCurrentPosition();
                if (TXCVodVideoView.r(TXCVodVideoView.this) >= TXCVodVideoView.this.f44166y.f44224a) {
                    TXCVodVideoView.this.a(-2301, "Disconnected from the network. Playback error", "disconnect");
                    TXCVodVideoView.this.c();
                } else if (TXCVodVideoView.this.f44141ag != null) {
                    TXCVodVideoView.this.f44141ag.sendEmptyMessageDelayed(102, (long) (TXCVodVideoView.this.f44166y.f44225b * 1000.0f));
                }
                return true;
            }
        };
        this.U = new IMediaPlayer.OnHevcVideoDecoderErrorListener() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.14
            @Override // com.tencent.ijk.media.player.IMediaPlayer.OnHevcVideoDecoderErrorListener
            public void onHevcVideoDecoderError(IMediaPlayer iMediaPlayer) {
                Log.d(TXCVodVideoView.this.f44149h, "onHevcVideoDecoderError");
                TXCVodVideoView.this.a(-2304, "Vod H265 decoding failed", "hevc decode fail");
            }
        };
        this.V = new IMediaPlayer.OnVideoDecoderErrorListener() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.15
            @Override // com.tencent.ijk.media.player.IMediaPlayer.OnVideoDecoderErrorListener
            public void onVideoDecoderError(IMediaPlayer iMediaPlayer) {
                Log.d(TXCVodVideoView.this.f44149h, "onVideoDecoderError");
                if (TXCVodVideoView.this.f44151j != 4) {
                    TXCVodVideoView.this.a(2106, "VOD decoding failed", "decode fail");
                }
                if (TXCVodVideoView.this.N || !TXCVodVideoView.this.f44166y.f44227d || Math.min(TXCVodVideoView.this.f44156o, TXCVodVideoView.this.f44155n) >= 1080) {
                    return;
                }
                TXCVodVideoView.this.f44166y.f44227d = false;
                TXCVodVideoView.this.i();
            }
        };
        this.W = new IMediaPlayer.OnBufferingUpdateListener() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.2
            @Override // com.tencent.ijk.media.player.IMediaPlayer.OnBufferingUpdateListener
            public void onBufferingUpdate(IMediaPlayer iMediaPlayer, int i11) {
                TXCVodVideoView.this.f44161t = i11;
                if (TXCVodVideoView.this.f44151j == 3) {
                    TXCVodVideoView.this.f44162u = i11;
                }
            }
        };
        this.f44135aa = new IMediaPlayer.OnSeekCompleteListener() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.3
            @Override // com.tencent.ijk.media.player.IMediaPlayer.OnSeekCompleteListener
            public void onSeekComplete(IMediaPlayer iMediaPlayer) {
                TXCLog.v(TXCVodVideoView.this.f44149h, "seek complete");
                TXCVodVideoView.this.H = false;
                if (TXCVodVideoView.this.I >= 0) {
                    TXCVodVideoView tXCVodVideoView = TXCVodVideoView.this;
                    tXCVodVideoView.a(tXCVodVideoView.I);
                }
            }
        };
        this.f44136ab = new IMediaPlayer.OnTimedTextListener() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.4
            @Override // com.tencent.ijk.media.player.IMediaPlayer.OnTimedTextListener
            public void onTimedText(IMediaPlayer iMediaPlayer, IjkTimedText ijkTimedText) {
            }
        };
        this.f44137ac = new IjkMediaPlayer.OnNativeInvokeListener() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.5
            @Override // com.tencent.ijk.media.player.IjkMediaPlayer.OnNativeInvokeListener
            public boolean onNativeInvoke(int i11, Bundle bundle) {
                if (i11 == 2) {
                    String string = bundle.getString("url");
                    int i12 = bundle.getInt("error");
                    int i13 = bundle.getInt(IjkMediaPlayer.OnNativeInvokeListener.ARG_HTTP_CODE);
                    TXCLog.i(TXCVodVideoView.this.f44149h, "http connect url:" + string + ",error:" + i12 + ",httpCode:" + i13);
                    return false;
                }
                if (i11 != 131074) {
                    if (i11 != 131106) {
                        return false;
                    }
                    String string2 = bundle.getString("url");
                    int i14 = bundle.getInt("error");
                    String str = "dns resolved url:" + string2 + ",error:" + i14;
                    TXCLog.i(TXCVodVideoView.this.f44149h, str);
                    if (i14 == 0) {
                        TXCVodVideoView.this.a(TXLiteAVCode.EVT_VOD_PLAY_DNS_RESOLVED, str, "dns resolved");
                    }
                    return true;
                }
                TXCVodVideoView.this.C = bundle.getString(IjkMediaPlayer.OnNativeInvokeListener.ARG_IP);
                int i15 = bundle.getInt(IjkMediaPlayer.OnNativeInvokeListener.ARG_PORT);
                int i16 = bundle.getInt("error");
                String str2 = "TCP Connect ServerIp:" + TXCVodVideoView.this.C + ",port:" + i15 + ",error:" + i16;
                TXCLog.i(TXCVodVideoView.this.f44149h, str2);
                if (i16 == 0) {
                    TXCVodVideoView.this.a(TXLiteAVCode.EVT_VOD_PLAY_TCP_CONNECT_SUCC, str2, "tcp open");
                }
                return true;
            }
        };
        this.f44138ad = new IMediaPlayer.OnHLSKeyErrorListener() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.6
            @Override // com.tencent.ijk.media.player.IMediaPlayer.OnHLSKeyErrorListener
            public void onHLSKeyError(IMediaPlayer iMediaPlayer) {
                Log.e(TXCVodVideoView.this.f44149h, "onHLSKeyError");
                TXCVodVideoView.this.a(-2305, "HLS decypt key get failed", "hls key error");
                if (TXCVodVideoView.this.f44154m != null) {
                    TXCVodVideoView.this.f44154m.stop();
                    TXCVodVideoView.this.f44154m.release();
                    TXCVodVideoView.this.f44154m = null;
                }
                TXCVodVideoView.this.f44151j = -1;
                TXCVodVideoView.this.f44152k = -1;
            }
        };
        this.f44148g = new a.InterfaceC0518a() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.7
            @Override // com.tencent.liteav.txcvodplayer.a.InterfaceC0518a
            public void a(@NonNull a.b bVar, int i11, int i12, int i13) {
                if (bVar.a() != TXCVodVideoView.this.f44167z) {
                    TXCLog.e(TXCVodVideoView.this.f44149h, "onSurfaceChanged: unmatched render callback\n");
                    return;
                }
                TXCLog.i(TXCVodVideoView.this.f44149h, "onSurfaceChanged");
                TXCVodVideoView.this.f44157p = i12;
                TXCVodVideoView.this.f44158q = i13;
                boolean z11 = false;
                boolean z12 = TXCVodVideoView.this.f44152k == 3;
                if (!TXCVodVideoView.this.f44167z.shouldWaitForResize() || (TXCVodVideoView.this.f44155n == i12 && TXCVodVideoView.this.f44156o == i13)) {
                    z11 = true;
                }
                if (TXCVodVideoView.this.f44154m != null && z12 && z11 && TXCVodVideoView.this.f44152k == 3) {
                    TXCVodVideoView.this.b();
                }
            }

            @Override // com.tencent.liteav.txcvodplayer.a.InterfaceC0518a
            public void a(@NonNull a.b bVar, int i11, int i12) {
                if (bVar.a() != TXCVodVideoView.this.f44167z) {
                    TXCLog.e(TXCVodVideoView.this.f44149h, "onSurfaceCreated: unmatched render callback\n");
                    return;
                }
                TXCLog.i(TXCVodVideoView.this.f44149h, "onSurfaceCreated");
                TXCVodVideoView.this.f44153l = bVar;
                if (TXCVodVideoView.this.f44154m == null) {
                    TXCVodVideoView.this.h();
                } else {
                    TXCVodVideoView tXCVodVideoView = TXCVodVideoView.this;
                    tXCVodVideoView.a(tXCVodVideoView.f44154m, bVar);
                }
            }

            @Override // com.tencent.liteav.txcvodplayer.a.InterfaceC0518a
            public void a(@NonNull a.b bVar) {
                if (bVar.a() != TXCVodVideoView.this.f44167z) {
                    TXCLog.e(TXCVodVideoView.this.f44149h, "onSurfaceDestroyed: unmatched render callback\n");
                    return;
                }
                TXCLog.i(TXCVodVideoView.this.f44149h, "onSurfaceDestroyed");
                TXCVodVideoView.this.f44153l = null;
                if (TXCVodVideoView.this.f44154m != null) {
                    TXCVodVideoView.this.f44154m.setSurface(null);
                }
                TXCVodVideoView.this.a();
            }
        };
        this.f44139ae = 0;
        this.f44142ah = false;
        a(context);
    }

    public void a(int i11) {
        TXCLog.i(this.f44149h, "seek to " + i11);
        if (getUrlPathExtention().equals(IjkMediaMeta.IJKM_KEY_M3U8)) {
            i11 = Math.min(i11, getDuration() - 1000);
        }
        if (i11 >= 0 && j()) {
            if (i11 > getDuration()) {
                i11 = getDuration();
            }
            if (this.H) {
                this.I = i11;
            } else {
                this.I = -1;
                this.f44154m.seekTo(i11);
            }
            this.H = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i11, String str, String str2) {
        if ((i11 == -2304 || i11 == 2106) && this.f44142ah) {
            return;
        }
        Message message = new Message();
        message.what = 101;
        Bundle bundle = new Bundle();
        message.arg1 = i11;
        bundle.putString("description", str);
        message.setData(bundle);
        Handler handler = this.f44141ag;
        if (handler != null) {
            handler.sendMessage(message);
        }
        if (i11 != 2018 && i11 != 2016) {
            TXCLog.i(this.f44149h, "sendSimpleEvent " + i11 + " " + str2);
        }
        this.f44142ah = i11 == -2304 || i11 == 2106;
    }

    public TXCVodVideoView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f44149h = "TXCVodVideoView";
        this.f44151j = 0;
        this.f44152k = 0;
        this.f44153l = null;
        this.f44154m = null;
        this.f44134a = true;
        this.D = 1.0f;
        this.F = com.tencent.liteav.txcvodplayer.a.b.a();
        this.f44143b = true;
        this.f44144c = true;
        this.f44145d = 0;
        this.H = false;
        this.I = -1;
        this.J = 1.0f;
        this.K = 1.0f;
        this.L = false;
        this.P = false;
        this.f44146e = new IMediaPlayer.OnVideoSizeChangedListener() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.9
            @Override // com.tencent.ijk.media.player.IMediaPlayer.OnVideoSizeChangedListener
            public void onVideoSizeChanged(IMediaPlayer iMediaPlayer, int i112, int i12, int i13, int i14) {
                boolean z11 = (TXCVodVideoView.this.f44156o != i12 && Math.abs(TXCVodVideoView.this.f44156o - i12) > 16) || (TXCVodVideoView.this.f44155n != i112 && Math.abs(TXCVodVideoView.this.f44155n - i112) > 16);
                TXCVodVideoView.this.f44155n = iMediaPlayer.getVideoWidth();
                TXCVodVideoView.this.f44156o = iMediaPlayer.getVideoHeight();
                TXCVodVideoView.this.A = iMediaPlayer.getVideoSarNum();
                TXCVodVideoView.this.B = iMediaPlayer.getVideoSarDen();
                if (TXCVodVideoView.this.f44155n != 0 && TXCVodVideoView.this.f44156o != 0) {
                    if (TXCVodVideoView.this.f44167z != null) {
                        TXCVodVideoView.this.f44167z.setVideoSize(TXCVodVideoView.this.f44155n, TXCVodVideoView.this.f44156o);
                        TXCVodVideoView.this.f44167z.setVideoSampleAspectRatio(TXCVodVideoView.this.A, TXCVodVideoView.this.B);
                    }
                    TXCVodVideoView.this.requestLayout();
                }
                if (z11) {
                    Message message = new Message();
                    message.what = 101;
                    message.arg1 = 2009;
                    Bundle bundle = new Bundle();
                    bundle.putString("description", "Resolution change:" + TXCVodVideoView.this.f44155n + "*" + TXCVodVideoView.this.f44156o);
                    bundle.putInt("EVT_PARAM1", TXCVodVideoView.this.f44155n);
                    bundle.putInt("EVT_PARAM2", TXCVodVideoView.this.f44156o);
                    message.setData(bundle);
                    if (TXCVodVideoView.this.f44141ag != null) {
                        TXCVodVideoView.this.f44141ag.sendMessage(message);
                    }
                }
            }
        };
        this.f44147f = new IMediaPlayer.OnPreparedListener() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.10
            @Override // com.tencent.ijk.media.player.IMediaPlayer.OnPreparedListener
            public void onPrepared(IMediaPlayer iMediaPlayer) {
                if (TXCVodVideoView.this.f44151j == 1) {
                    TXCVodVideoView.this.a(2013, "VOD ready", "prepared");
                    TXCVodVideoView tXCVodVideoView = TXCVodVideoView.this;
                    if (!tXCVodVideoView.f44144c) {
                        tXCVodVideoView.f44152k = 4;
                        TXCVodVideoView.this.f44144c = true;
                    }
                    TXCVodVideoView.this.f44151j = 2;
                }
                TXCVodVideoView.this.f44163v = 0;
                if (TXCVodVideoView.this.f44151j == -1) {
                    TXCVodVideoView.this.f44151j = 3;
                    TXCVodVideoView.this.f44152k = 3;
                }
                if (TXCVodVideoView.this.f44141ag != null) {
                    TXCVodVideoView.this.f44141ag.sendEmptyMessage(100);
                    TXCVodVideoView.this.f44141ag.sendEmptyMessage(103);
                }
                TXCVodVideoView.this.f44155n = iMediaPlayer.getVideoWidth();
                TXCVodVideoView.this.f44156o = iMediaPlayer.getVideoHeight();
                if (TXCVodVideoView.this.f44155n == 0 || TXCVodVideoView.this.f44156o == 0) {
                    if (TXCVodVideoView.this.f44152k == 3) {
                        TXCVodVideoView.this.b();
                    }
                } else if (TXCVodVideoView.this.f44167z != null) {
                    TXCVodVideoView.this.f44167z.setVideoSize(TXCVodVideoView.this.f44155n, TXCVodVideoView.this.f44156o);
                    TXCVodVideoView.this.f44167z.setVideoSampleAspectRatio(TXCVodVideoView.this.A, TXCVodVideoView.this.B);
                    if ((!TXCVodVideoView.this.f44167z.shouldWaitForResize() || (TXCVodVideoView.this.f44157p == TXCVodVideoView.this.f44155n && TXCVodVideoView.this.f44158q == TXCVodVideoView.this.f44156o)) && TXCVodVideoView.this.f44152k == 3) {
                        TXCVodVideoView.this.b();
                    }
                }
            }
        };
        this.Q = new IMediaPlayer.OnCompletionListener() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.11
            @Override // com.tencent.ijk.media.player.IMediaPlayer.OnCompletionListener
            public void onCompletion(IMediaPlayer iMediaPlayer) {
                TXCVodVideoView.this.f44151j = 5;
                TXCVodVideoView.this.f44152k = 5;
                TXCVodVideoView.this.a(2006, "Playback completed", "play end");
            }
        };
        this.R = new IMediaPlayer.OnInfoListener() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.12
            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            @Override // com.tencent.ijk.media.player.IMediaPlayer.OnInfoListener
            public boolean onInfo(IMediaPlayer iMediaPlayer, int i112, int i12) {
                if (i112 == 3) {
                    TXCLog.i(TXCVodVideoView.this.f44149h, "MEDIA_INFO_VIDEO_RENDERING_START:");
                    if (!TXCVodVideoView.this.N) {
                        TXCVodVideoView.this.a(2003, "VOD displayed the first frame", "render start");
                    }
                    TXCVodVideoView tXCVodVideoView = TXCVodVideoView.this;
                    tXCVodVideoView.setRate(tXCVodVideoView.D);
                    TXCVodVideoView.this.N = true;
                } else if (i112 == 10011) {
                    TXCVodVideoView.this.a(TXLiteAVCode.EVT_VOD_PLAY_FIRST_VIDEO_PACKET, "Video data received", "first video packet");
                } else if (i112 == 901) {
                    TXCLog.i(TXCVodVideoView.this.f44149h, "MEDIA_INFO_UNSUPPORTED_SUBTITLE:");
                } else if (i112 == 902) {
                    TXCLog.i(TXCVodVideoView.this.f44149h, "MEDIA_INFO_SUBTITLE_TIMED_OUT:");
                } else if (i112 == 10001) {
                    TXCLog.i(TXCVodVideoView.this.f44149h, "MEDIA_INFO_VIDEO_ROTATION_CHANGED: " + i12);
                    TXCVodVideoView.this.f44160s = i12;
                    TXCVodVideoView tXCVodVideoView2 = TXCVodVideoView.this;
                    if (tXCVodVideoView2.f44134a && tXCVodVideoView2.f44160s > 0) {
                        TXCVodVideoView tXCVodVideoView3 = TXCVodVideoView.this;
                        tXCVodVideoView3.f44159r = tXCVodVideoView3.f44160s;
                        if (TXCVodVideoView.this.f44167z != null) {
                            TXCVodVideoView.this.f44167z.setVideoRotation(TXCVodVideoView.this.f44159r);
                        }
                    }
                    TXCVodVideoView.this.a(2011, "Video angle " + TXCVodVideoView.this.f44160s, "rotation " + TXCVodVideoView.this.f44160s);
                } else if (i112 != 10002) {
                    switch (i112) {
                        case 700:
                            TXCLog.i(TXCVodVideoView.this.f44149h, "MEDIA_INFO_VIDEO_TRACK_LAGGING:");
                            break;
                        case 701:
                            TXCLog.i(TXCVodVideoView.this.f44149h, "MEDIA_INFO_BUFFERING_START:");
                            TXCVodVideoView.this.a(2007, "Buffer started", "loading start");
                            break;
                        case 702:
                            TXCLog.i(TXCVodVideoView.this.f44149h, "MEDIA_INFO_BUFFERING_END: eof " + i12);
                            TXCVodVideoView.this.a(2014, "Buffer ended", "loading end");
                            if ((i12 == 0 || TXCVodVideoView.this.f44150i == null || TXCVodVideoView.this.f44150i.getPath() == null || !TXCVodVideoView.this.f44150i.getPath().endsWith(IjkMediaMeta.IJKM_KEY_M3U8)) && TXCVodVideoView.this.f44152k == 3) {
                                TXCVodVideoView.this.a(2004, "Playback started", "playing");
                                break;
                            }
                            break;
                        case IMediaPlayer.MEDIA_INFO_NETWORK_BANDWIDTH /* 703 */:
                            TXCLog.i(TXCVodVideoView.this.f44149h, "MEDIA_INFO_NETWORK_BANDWIDTH: " + i12);
                            break;
                        default:
                            switch (i112) {
                                case 800:
                                    TXCLog.i(TXCVodVideoView.this.f44149h, "MEDIA_INFO_BAD_INTERLEAVING:");
                                    break;
                                case IMediaPlayer.MEDIA_INFO_NOT_SEEKABLE /* 801 */:
                                    TXCLog.i(TXCVodVideoView.this.f44149h, "MEDIA_INFO_NOT_SEEKABLE:");
                                    break;
                                case IMediaPlayer.MEDIA_INFO_METADATA_UPDATE /* 802 */:
                                    TXCLog.i(TXCVodVideoView.this.f44149h, "MEDIA_INFO_METADATA_UPDATE:");
                                    break;
                            }
                    }
                } else {
                    TXCLog.i(TXCVodVideoView.this.f44149h, "MEDIA_INFO_AUDIO_RENDERING_START:");
                }
                return true;
            }
        };
        this.T = new IMediaPlayer.OnErrorListener() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.13
            @Override // com.tencent.ijk.media.player.IMediaPlayer.OnErrorListener
            public boolean onError(IMediaPlayer iMediaPlayer, int i112, int i12) {
                TXCLog.e(TXCVodVideoView.this.f44149h, "onError: " + i112 + "," + i12);
                TXCVodVideoView.this.f44151j = -1;
                TXCVodVideoView.this.f44152k = -1;
                if (i112 == -1004 && i12 == -2303) {
                    TXCVodVideoView.this.a(i12, "The file does not exist", "file not exist");
                    TXCVodVideoView.this.c();
                    return true;
                }
                if (TXCVodVideoView.this.G != TXCVodVideoView.this.getCurrentPosition()) {
                    TXCVodVideoView.this.S = 0;
                }
                TXCVodVideoView.this.G = r4.getCurrentPosition();
                if (TXCVodVideoView.r(TXCVodVideoView.this) >= TXCVodVideoView.this.f44166y.f44224a) {
                    TXCVodVideoView.this.a(-2301, "Disconnected from the network. Playback error", "disconnect");
                    TXCVodVideoView.this.c();
                } else if (TXCVodVideoView.this.f44141ag != null) {
                    TXCVodVideoView.this.f44141ag.sendEmptyMessageDelayed(102, (long) (TXCVodVideoView.this.f44166y.f44225b * 1000.0f));
                }
                return true;
            }
        };
        this.U = new IMediaPlayer.OnHevcVideoDecoderErrorListener() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.14
            @Override // com.tencent.ijk.media.player.IMediaPlayer.OnHevcVideoDecoderErrorListener
            public void onHevcVideoDecoderError(IMediaPlayer iMediaPlayer) {
                Log.d(TXCVodVideoView.this.f44149h, "onHevcVideoDecoderError");
                TXCVodVideoView.this.a(-2304, "Vod H265 decoding failed", "hevc decode fail");
            }
        };
        this.V = new IMediaPlayer.OnVideoDecoderErrorListener() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.15
            @Override // com.tencent.ijk.media.player.IMediaPlayer.OnVideoDecoderErrorListener
            public void onVideoDecoderError(IMediaPlayer iMediaPlayer) {
                Log.d(TXCVodVideoView.this.f44149h, "onVideoDecoderError");
                if (TXCVodVideoView.this.f44151j != 4) {
                    TXCVodVideoView.this.a(2106, "VOD decoding failed", "decode fail");
                }
                if (TXCVodVideoView.this.N || !TXCVodVideoView.this.f44166y.f44227d || Math.min(TXCVodVideoView.this.f44156o, TXCVodVideoView.this.f44155n) >= 1080) {
                    return;
                }
                TXCVodVideoView.this.f44166y.f44227d = false;
                TXCVodVideoView.this.i();
            }
        };
        this.W = new IMediaPlayer.OnBufferingUpdateListener() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.2
            @Override // com.tencent.ijk.media.player.IMediaPlayer.OnBufferingUpdateListener
            public void onBufferingUpdate(IMediaPlayer iMediaPlayer, int i112) {
                TXCVodVideoView.this.f44161t = i112;
                if (TXCVodVideoView.this.f44151j == 3) {
                    TXCVodVideoView.this.f44162u = i112;
                }
            }
        };
        this.f44135aa = new IMediaPlayer.OnSeekCompleteListener() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.3
            @Override // com.tencent.ijk.media.player.IMediaPlayer.OnSeekCompleteListener
            public void onSeekComplete(IMediaPlayer iMediaPlayer) {
                TXCLog.v(TXCVodVideoView.this.f44149h, "seek complete");
                TXCVodVideoView.this.H = false;
                if (TXCVodVideoView.this.I >= 0) {
                    TXCVodVideoView tXCVodVideoView = TXCVodVideoView.this;
                    tXCVodVideoView.a(tXCVodVideoView.I);
                }
            }
        };
        this.f44136ab = new IMediaPlayer.OnTimedTextListener() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.4
            @Override // com.tencent.ijk.media.player.IMediaPlayer.OnTimedTextListener
            public void onTimedText(IMediaPlayer iMediaPlayer, IjkTimedText ijkTimedText) {
            }
        };
        this.f44137ac = new IjkMediaPlayer.OnNativeInvokeListener() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.5
            @Override // com.tencent.ijk.media.player.IjkMediaPlayer.OnNativeInvokeListener
            public boolean onNativeInvoke(int i112, Bundle bundle) {
                if (i112 == 2) {
                    String string = bundle.getString("url");
                    int i12 = bundle.getInt("error");
                    int i13 = bundle.getInt(IjkMediaPlayer.OnNativeInvokeListener.ARG_HTTP_CODE);
                    TXCLog.i(TXCVodVideoView.this.f44149h, "http connect url:" + string + ",error:" + i12 + ",httpCode:" + i13);
                    return false;
                }
                if (i112 != 131074) {
                    if (i112 != 131106) {
                        return false;
                    }
                    String string2 = bundle.getString("url");
                    int i14 = bundle.getInt("error");
                    String str = "dns resolved url:" + string2 + ",error:" + i14;
                    TXCLog.i(TXCVodVideoView.this.f44149h, str);
                    if (i14 == 0) {
                        TXCVodVideoView.this.a(TXLiteAVCode.EVT_VOD_PLAY_DNS_RESOLVED, str, "dns resolved");
                    }
                    return true;
                }
                TXCVodVideoView.this.C = bundle.getString(IjkMediaPlayer.OnNativeInvokeListener.ARG_IP);
                int i15 = bundle.getInt(IjkMediaPlayer.OnNativeInvokeListener.ARG_PORT);
                int i16 = bundle.getInt("error");
                String str2 = "TCP Connect ServerIp:" + TXCVodVideoView.this.C + ",port:" + i15 + ",error:" + i16;
                TXCLog.i(TXCVodVideoView.this.f44149h, str2);
                if (i16 == 0) {
                    TXCVodVideoView.this.a(TXLiteAVCode.EVT_VOD_PLAY_TCP_CONNECT_SUCC, str2, "tcp open");
                }
                return true;
            }
        };
        this.f44138ad = new IMediaPlayer.OnHLSKeyErrorListener() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.6
            @Override // com.tencent.ijk.media.player.IMediaPlayer.OnHLSKeyErrorListener
            public void onHLSKeyError(IMediaPlayer iMediaPlayer) {
                Log.e(TXCVodVideoView.this.f44149h, "onHLSKeyError");
                TXCVodVideoView.this.a(-2305, "HLS decypt key get failed", "hls key error");
                if (TXCVodVideoView.this.f44154m != null) {
                    TXCVodVideoView.this.f44154m.stop();
                    TXCVodVideoView.this.f44154m.release();
                    TXCVodVideoView.this.f44154m = null;
                }
                TXCVodVideoView.this.f44151j = -1;
                TXCVodVideoView.this.f44152k = -1;
            }
        };
        this.f44148g = new a.InterfaceC0518a() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.7
            @Override // com.tencent.liteav.txcvodplayer.a.InterfaceC0518a
            public void a(@NonNull a.b bVar, int i112, int i12, int i13) {
                if (bVar.a() != TXCVodVideoView.this.f44167z) {
                    TXCLog.e(TXCVodVideoView.this.f44149h, "onSurfaceChanged: unmatched render callback\n");
                    return;
                }
                TXCLog.i(TXCVodVideoView.this.f44149h, "onSurfaceChanged");
                TXCVodVideoView.this.f44157p = i12;
                TXCVodVideoView.this.f44158q = i13;
                boolean z11 = false;
                boolean z12 = TXCVodVideoView.this.f44152k == 3;
                if (!TXCVodVideoView.this.f44167z.shouldWaitForResize() || (TXCVodVideoView.this.f44155n == i12 && TXCVodVideoView.this.f44156o == i13)) {
                    z11 = true;
                }
                if (TXCVodVideoView.this.f44154m != null && z12 && z11 && TXCVodVideoView.this.f44152k == 3) {
                    TXCVodVideoView.this.b();
                }
            }

            @Override // com.tencent.liteav.txcvodplayer.a.InterfaceC0518a
            public void a(@NonNull a.b bVar, int i112, int i12) {
                if (bVar.a() != TXCVodVideoView.this.f44167z) {
                    TXCLog.e(TXCVodVideoView.this.f44149h, "onSurfaceCreated: unmatched render callback\n");
                    return;
                }
                TXCLog.i(TXCVodVideoView.this.f44149h, "onSurfaceCreated");
                TXCVodVideoView.this.f44153l = bVar;
                if (TXCVodVideoView.this.f44154m == null) {
                    TXCVodVideoView.this.h();
                } else {
                    TXCVodVideoView tXCVodVideoView = TXCVodVideoView.this;
                    tXCVodVideoView.a(tXCVodVideoView.f44154m, bVar);
                }
            }

            @Override // com.tencent.liteav.txcvodplayer.a.InterfaceC0518a
            public void a(@NonNull a.b bVar) {
                if (bVar.a() != TXCVodVideoView.this.f44167z) {
                    TXCLog.e(TXCVodVideoView.this.f44149h, "onSurfaceDestroyed: unmatched render callback\n");
                    return;
                }
                TXCLog.i(TXCVodVideoView.this.f44149h, "onSurfaceDestroyed");
                TXCVodVideoView.this.f44153l = null;
                if (TXCVodVideoView.this.f44154m != null) {
                    TXCVodVideoView.this.f44154m.setSurface(null);
                }
                TXCVodVideoView.this.a();
            }
        };
        this.f44139ae = 0;
        this.f44142ah = false;
        a(context);
    }
}

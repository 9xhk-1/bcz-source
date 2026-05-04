package com.tencent.ijk.media.player;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Rect;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.ParcelFileDescriptor;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceHolder;
import c6.d;
import com.tencent.ijk.media.player.IjkMediaMeta;
import com.tencent.ijk.media.player.annotations.AccessedByNative;
import com.tencent.ijk.media.player.annotations.CalledByNative;
import com.tencent.ijk.media.player.misc.IAndroidIO;
import com.tencent.ijk.media.player.misc.IMediaDataSource;
import com.tencent.ijk.media.player.misc.IjkTrackInfo;
import com.tencent.ijk.media.player.pragma.DebugLog;
import java.io.FileDescriptor;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class IjkMediaPlayer extends AbstractMediaPlayer {
    public static final int FFP_PROPV_DECODER_AVCODEC = 1;
    public static final int FFP_PROPV_DECODER_MEDIACODEC = 2;
    public static final int FFP_PROPV_DECODER_UNKNOWN = 0;
    public static final int FFP_PROPV_DECODER_VIDEOTOOLBOX = 3;
    public static final int FFP_PROP_FLOAT_AVDELAY = 10004;
    public static final int FFP_PROP_FLOAT_AVDIFF = 10005;
    public static final int FFP_PROP_FLOAT_DROP_FRAME_RATE = 10007;
    public static final int FFP_PROP_FLOAT_PLAYBACK_RATE = 10003;
    public static final int FFP_PROP_INT64_ASYNC_STATISTIC_BUF_BACKWARDS = 20201;
    public static final int FFP_PROP_INT64_ASYNC_STATISTIC_BUF_CAPACITY = 20203;
    public static final int FFP_PROP_INT64_ASYNC_STATISTIC_BUF_FORWARDS = 20202;
    public static final int FFP_PROP_INT64_AUDIO_CACHED_BYTES = 20008;
    public static final int FFP_PROP_INT64_AUDIO_CACHED_DURATION = 20006;
    public static final int FFP_PROP_INT64_AUDIO_CACHED_PACKETS = 20010;
    public static final int FFP_PROP_INT64_AUDIO_DECODER = 20004;
    public static final int FFP_PROP_INT64_BIT_RATE = 20100;
    public static final int FFP_PROP_INT64_CACHE_STATISTIC_COUNT_BYTES = 20208;
    public static final int FFP_PROP_INT64_CACHE_STATISTIC_FILE_FORWARDS = 20206;
    public static final int FFP_PROP_INT64_CACHE_STATISTIC_FILE_POS = 20207;
    public static final int FFP_PROP_INT64_CACHE_STATISTIC_PHYSICAL_POS = 20205;
    public static final int FFP_PROP_INT64_LATEST_SEEK_LOAD_DURATION = 20300;
    public static final int FFP_PROP_INT64_LOGICAL_FILE_SIZE = 20209;
    public static final int FFP_PROP_INT64_SELECTED_AUDIO_STREAM = 20002;
    public static final int FFP_PROP_INT64_SELECTED_TIMEDTEXT_STREAM = 20011;
    public static final int FFP_PROP_INT64_SELECTED_VIDEO_STREAM = 20001;
    public static final int FFP_PROP_INT64_TCP_SPEED = 20200;
    public static final int FFP_PROP_INT64_TRAFFIC_STATISTIC_BYTE_COUNT = 20204;
    public static final int FFP_PROP_INT64_VIDEO_CACHED_BYTES = 20007;
    public static final int FFP_PROP_INT64_VIDEO_CACHED_DURATION = 20005;
    public static final int FFP_PROP_INT64_VIDEO_CACHED_PACKETS = 20009;
    public static final int FFP_PROP_INT64_VIDEO_DECODER = 20003;
    public static final int IJK_LOG_DEBUG = 3;
    public static final int IJK_LOG_DEFAULT = 1;
    public static final int IJK_LOG_ERROR = 6;
    public static final int IJK_LOG_FATAL = 7;
    public static final int IJK_LOG_INFO = 4;
    public static final int IJK_LOG_SILENT = 8;
    public static final int IJK_LOG_UNKNOWN = 0;
    public static final int IJK_LOG_VERBOSE = 2;
    public static final int IJK_LOG_WARN = 5;
    private static final int MEDIA_BUFFERING_UPDATE = 3;
    private static final int MEDIA_ERROR = 100;
    private static final int MEDIA_HEVC_VIDEO_DECODER_ERROR = 211;
    private static final int MEDIA_HLS_KEY_ERROR = 210;
    private static final int MEDIA_INFO = 200;
    private static final int MEDIA_NOP = 0;
    private static final int MEDIA_PLAYBACK_COMPLETE = 2;
    private static final int MEDIA_PREPARED = 1;
    private static final int MEDIA_SEEK_COMPLETE = 4;
    protected static final int MEDIA_SET_VIDEO_SAR = 10001;
    private static final int MEDIA_SET_VIDEO_SIZE = 5;
    private static final int MEDIA_TIMED_TEXT = 99;
    private static final int MEDIA_VIDEO_DECODER_ERROR = 212;
    public static final int OPT_CATEGORY_CODEC = 2;
    public static final int OPT_CATEGORY_FORMAT = 1;
    public static final int OPT_CATEGORY_PLAYER = 4;
    public static final int OPT_CATEGORY_SWS = 3;
    public static final int PROP_FLOAT_VIDEO_DECODE_FRAMES_PER_SECOND = 10001;
    public static final int PROP_FLOAT_VIDEO_OUTPUT_FRAMES_PER_SECOND = 10002;
    public static final int SDL_FCC_RV16 = 909203026;
    public static final int SDL_FCC_RV32 = 842225234;
    public static final int SDL_FCC_YV12 = 842094169;
    private static final String TAG = "com.tencent.ijk.media.player.IjkMediaPlayer";
    private int mBitrateIndex;
    private String mDataSource;
    private EventHandler mEventHandler;

    @AccessedByNative
    private int mListenerContext;

    @AccessedByNative
    private long mNativeAndroidIO;

    @AccessedByNative
    private long mNativeMediaDataSource;

    @AccessedByNative
    private long mNativeMediaPlayer;

    @AccessedByNative
    private int mNativeSurfaceTexture;
    private OnControlMessageListener mOnControlMessageListener;
    private OnMediaCodecSelectListener mOnMediaCodecSelectListener;
    private OnNativeInvokeListener mOnNativeInvokeListener;
    private boolean mScreenOnWhilePlaying;
    private boolean mStayAwake;
    private Surface mSurface;
    private SurfaceHolder mSurfaceHolder;
    private int mVideoHeight;
    private int mVideoSarDen;
    private int mVideoSarNum;
    private int mVideoWidth;
    private PowerManager.WakeLock mWakeLock;
    private static final IjkLibLoader sLocalLibLoader = new IjkLibLoader() { // from class: com.tencent.ijk.media.player.IjkMediaPlayer.1
        @Override // com.tencent.ijk.media.player.IjkLibLoader
        public void loadLibrary(String str) throws UnsatisfiedLinkError, SecurityException {
            System.loadLibrary(str);
        }
    };
    private static volatile boolean mIsLibLoaded = false;
    private static volatile boolean mIsNativeInitialized = false;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class DefaultMediaCodecSelector implements OnMediaCodecSelectListener {
        public static final DefaultMediaCodecSelector sInstance = new DefaultMediaCodecSelector();

        @Override // com.tencent.ijk.media.player.IjkMediaPlayer.OnMediaCodecSelectListener
        @TargetApi(16)
        public String onMediaCodecSelect(IMediaPlayer iMediaPlayer, String str, int i11, int i12) {
            String[] supportedTypes;
            IjkMediaCodecInfo ijkMediaCodecInfo;
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            Log.i(IjkMediaPlayer.TAG, String.format(Locale.US, "onSelectCodec: mime=%s, profile=%d, level=%d", str, Integer.valueOf(i11), Integer.valueOf(i12)));
            ArrayList arrayList = new ArrayList();
            int codecCount = MediaCodecList.getCodecCount();
            for (int i13 = 0; i13 < codecCount; i13++) {
                MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i13);
                Log.d(IjkMediaPlayer.TAG, String.format(Locale.US, "  found codec: %s", codecInfoAt.getName()));
                if (!codecInfoAt.isEncoder() && (supportedTypes = codecInfoAt.getSupportedTypes()) != null) {
                    for (String str2 : supportedTypes) {
                        if (!TextUtils.isEmpty(str2)) {
                            String str3 = IjkMediaPlayer.TAG;
                            Locale locale = Locale.US;
                            Log.d(str3, String.format(locale, "    mime: %s", str2));
                            if (str2.equalsIgnoreCase(str) && (ijkMediaCodecInfo = IjkMediaCodecInfo.setupCandidate(codecInfoAt, str)) != null) {
                                arrayList.add(ijkMediaCodecInfo);
                                Log.i(IjkMediaPlayer.TAG, String.format(locale, "candidate codec: %s rank=%d", codecInfoAt.getName(), Integer.valueOf(ijkMediaCodecInfo.mRank)));
                                ijkMediaCodecInfo.dumpProfileLevels(str);
                            }
                        }
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            IjkMediaCodecInfo ijkMediaCodecInfo2 = (IjkMediaCodecInfo) arrayList.get(0);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                IjkMediaCodecInfo ijkMediaCodecInfo3 = (IjkMediaCodecInfo) it.next();
                if (ijkMediaCodecInfo3.mRank > ijkMediaCodecInfo2.mRank) {
                    ijkMediaCodecInfo2 = ijkMediaCodecInfo3;
                }
            }
            if (ijkMediaCodecInfo2.mRank < 600) {
                Log.w(IjkMediaPlayer.TAG, String.format(Locale.US, "unaccetable codec: %s", ijkMediaCodecInfo2.mCodecInfo.getName()));
                return null;
            }
            Log.i(IjkMediaPlayer.TAG, String.format(Locale.US, "selected codec: %s rank=%d", ijkMediaCodecInfo2.mCodecInfo.getName(), Integer.valueOf(ijkMediaCodecInfo2.mRank)));
            return ijkMediaCodecInfo2.mCodecInfo.getName();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class EventHandler extends Handler {
        private final WeakReference<IjkMediaPlayer> mWeakPlayer;

        public EventHandler(IjkMediaPlayer ijkMediaPlayer, Looper looper) {
            super(looper);
            this.mWeakPlayer = new WeakReference<>(ijkMediaPlayer);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IjkMediaPlayer ijkMediaPlayer = this.mWeakPlayer.get();
            if (ijkMediaPlayer != null) {
                if (ijkMediaPlayer.mNativeMediaPlayer != 0) {
                    int i11 = message.what;
                    if (i11 != 0) {
                        if (i11 == 1) {
                            ijkMediaPlayer.notifyOnPrepared();
                            return;
                        }
                        if (i11 == 2) {
                            ijkMediaPlayer.stayAwake(false);
                            ijkMediaPlayer.notifyOnCompletion();
                            return;
                        }
                        if (i11 == 3) {
                            long j11 = message.arg1;
                            if (j11 < 0) {
                                j11 = 0;
                            }
                            long duration = ijkMediaPlayer.getDuration();
                            long j12 = duration > 0 ? (j11 * 100) / duration : 0L;
                            ijkMediaPlayer.notifyOnBufferingUpdate((int) (j12 < 100 ? j12 : 100L));
                            return;
                        }
                        if (i11 == 4) {
                            ijkMediaPlayer.notifyOnSeekComplete();
                            return;
                        }
                        if (i11 == 5) {
                            ijkMediaPlayer.mVideoWidth = message.arg1;
                            ijkMediaPlayer.mVideoHeight = message.arg2;
                            ijkMediaPlayer.notifyOnVideoSizeChanged(ijkMediaPlayer.mVideoWidth, ijkMediaPlayer.mVideoHeight, ijkMediaPlayer.mVideoSarNum, ijkMediaPlayer.mVideoSarDen);
                            return;
                        }
                        if (i11 == 99) {
                            if (message.obj == null) {
                                ijkMediaPlayer.notifyOnTimedText(null);
                                return;
                            } else {
                                ijkMediaPlayer.notifyOnTimedText(new IjkTimedText(new Rect(0, 0, 1, 1), (String) message.obj));
                                return;
                            }
                        }
                        if (i11 == 100) {
                            DebugLog.e(IjkMediaPlayer.TAG, "Error (" + message.arg1 + "," + message.arg2 + j.f81007d);
                            if (!ijkMediaPlayer.notifyOnError(message.arg1, message.arg2)) {
                                ijkMediaPlayer.notifyOnCompletion();
                            }
                            ijkMediaPlayer.stayAwake(false);
                            return;
                        }
                        if (i11 == 200) {
                            if (message.arg1 == 3) {
                                DebugLog.i(IjkMediaPlayer.TAG, "Info: MEDIA_INFO_VIDEO_RENDERING_START\n");
                            }
                            ijkMediaPlayer.notifyOnInfo(message.arg1, message.arg2);
                            return;
                        }
                        if (i11 == 10001) {
                            ijkMediaPlayer.mVideoSarNum = message.arg1;
                            ijkMediaPlayer.mVideoSarDen = message.arg2;
                            ijkMediaPlayer.notifyOnVideoSizeChanged(ijkMediaPlayer.mVideoWidth, ijkMediaPlayer.mVideoHeight, ijkMediaPlayer.mVideoSarNum, ijkMediaPlayer.mVideoSarDen);
                            return;
                        }
                        switch (i11) {
                            case 210:
                                ijkMediaPlayer.notifyHLSKeyError();
                                break;
                            case 211:
                                ijkMediaPlayer.notifyHevcVideoDecoderError();
                                break;
                            case 212:
                                ijkMediaPlayer.notifyVideoDecoderError();
                                break;
                            default:
                                DebugLog.e(IjkMediaPlayer.TAG, "Unknown message type " + message.what);
                                break;
                        }
                        return;
                    }
                    return;
                }
            }
            DebugLog.w(IjkMediaPlayer.TAG, "IjkMediaPlayer went away with unhandled events");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface OnControlMessageListener {
        String onControlResolveSegmentUrl(int i11);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface OnMediaCodecSelectListener {
        String onMediaCodecSelect(IMediaPlayer iMediaPlayer, String str, int i11, int i12);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface OnNativeInvokeListener {
        public static final String ARG_ERROR = "error";
        public static final String ARG_FAMILIY = "family";
        public static final String ARG_FD = "fd";
        public static final String ARG_HTTP_CODE = "http_code";
        public static final String ARG_IP = "ip";
        public static final String ARG_OFFSET = "offset";
        public static final String ARG_PORT = "port";
        public static final String ARG_RETRY_COUNTER = "retry_counter";
        public static final String ARG_SEGMENT_INDEX = "segment_index";
        public static final String ARG_URL = "url";
        public static final int CTRL_DID_DNS_RESOLVE = 131106;
        public static final int CTRL_DID_TCP_OPEN = 131074;
        public static final int CTRL_WILL_CONCAT_RESOLVE_SEGMENT = 131079;
        public static final int CTRL_WILL_DNS_RESOLVE = 131105;
        public static final int CTRL_WILL_HTTP_OPEN = 131075;
        public static final int CTRL_WILL_LIVE_OPEN = 131077;
        public static final int CTRL_WILL_TCP_OPEN = 131073;
        public static final int EVENT_DID_HTTP_OPEN = 2;
        public static final int EVENT_DID_HTTP_SEEK = 4;
        public static final int EVENT_WILL_HTTP_OPEN = 1;
        public static final int EVENT_WILL_HTTP_SEEK = 3;

        boolean onNativeInvoke(int i11, Bundle bundle);
    }

    public IjkMediaPlayer() {
        this(sLocalLibLoader);
    }

    private native void _enable_adaptive_bitrate();

    private native String _getAudioCodecInfo();

    private static native String _getColorFormatName(int i11);

    private native int _getLoopCount();

    private native Bundle _getMediaMeta();

    private native float _getPropertyFloat(int i11, float f11);

    private native long _getPropertyLong(int i11, long j11);

    private native String _getVideoCodecInfo();

    private native void _injectCacheNode(int i11, long j11, long j12, long j13, long j14);

    private native void _pause() throws IllegalStateException;

    private native void _publishAudio();

    /* JADX INFO: Access modifiers changed from: private */
    public native void _release();

    private native void _reset();

    private native void _setAndroidIOCallback(IAndroidIO iAndroidIO) throws IllegalArgumentException, SecurityException, IllegalStateException;

    private native void _setAudioVolume(int i11);

    private native void _setDataSource(IMediaDataSource iMediaDataSource) throws IllegalArgumentException, SecurityException, IllegalStateException;

    private native void _setDataSource(String str, String[] strArr, String[] strArr2) throws IOException, IllegalArgumentException, SecurityException, IllegalStateException;

    private native void _setDataSourceFd(int i11) throws IOException, IllegalArgumentException, SecurityException, IllegalStateException;

    private native void _setFrameAtTime(String str, long j11, long j12, int i11, int i12) throws IllegalArgumentException, IllegalStateException;

    private native void _setLoopCount(int i11);

    private native void _setOption(int i11, String str, long j11);

    private native void _setOption(int i11, String str, String str2);

    private native void _setPropertyFloat(int i11, float f11);

    private native void _setPropertyLong(int i11, long j11);

    private native void _setStreamSelected(int i11, boolean z11);

    private native void _setVideoSurface(Surface surface);

    private native void _start() throws IllegalStateException;

    private native void _stop() throws IllegalStateException;

    private native void _unPublishAudio();

    public static String getColorFormatName(int i11) {
        return _getColorFormatName(i11);
    }

    private static void initNativeOnce() {
        synchronized (IjkMediaPlayer.class) {
            try {
                if (!mIsNativeInitialized) {
                    native_init();
                    mIsNativeInitialized = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void initPlayer(IjkLibLoader ijkLibLoader) {
        loadLibrariesOnce(ijkLibLoader);
        initNativeOnce();
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            this.mEventHandler = new EventHandler(this, myLooper);
        } else {
            Looper mainLooper = Looper.getMainLooper();
            if (mainLooper != null) {
                this.mEventHandler = new EventHandler(this, mainLooper);
            } else {
                this.mEventHandler = null;
            }
        }
        native_setup(new WeakReference(this));
    }

    public static void loadLibrariesOnce(IjkLibLoader ijkLibLoader) {
        synchronized (IjkMediaPlayer.class) {
            try {
                if (!mIsLibLoaded) {
                    if (ijkLibLoader == null) {
                        ijkLibLoader = sLocalLibLoader;
                    }
                    ijkLibLoader.loadLibrary("txffmpeg");
                    ijkLibLoader.loadLibrary("txsdl");
                    ijkLibLoader.loadLibrary("txplayer");
                    mIsLibLoaded = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private native void native_finalize();

    private static native void native_init();

    private native void native_message_loop(Object obj);

    public static native void native_profileBegin(String str);

    public static native void native_profileEnd();

    public static native void native_setLogLevel(int i11);

    private native void native_setup(Object obj);

    @CalledByNative
    private static boolean onNativeInvoke(Object obj, int i11, Bundle bundle) {
        OnControlMessageListener onControlMessageListener;
        if (obj == null || !(obj instanceof WeakReference)) {
            throw new IllegalStateException("<null weakThiz>.onNativeInvoke()");
        }
        IjkMediaPlayer ijkMediaPlayer = (IjkMediaPlayer) ((WeakReference) obj).get();
        if (ijkMediaPlayer == null) {
            throw new IllegalStateException("<null weakPlayer>.onNativeInvoke()");
        }
        OnNativeInvokeListener onNativeInvokeListener = ijkMediaPlayer.mOnNativeInvokeListener;
        if (onNativeInvokeListener != null && onNativeInvokeListener.onNativeInvoke(i11, bundle)) {
            return true;
        }
        if (i11 != 131079 || (onControlMessageListener = ijkMediaPlayer.mOnControlMessageListener) == null) {
            return false;
        }
        int i12 = bundle.getInt(OnNativeInvokeListener.ARG_SEGMENT_INDEX, -1);
        if (i12 < 0) {
            throw new InvalidParameterException("onNativeInvoke(invalid segment index)");
        }
        String onControlResolveSegmentUrl = onControlMessageListener.onControlResolveSegmentUrl(i12);
        if (onControlResolveSegmentUrl == null) {
            throw new RuntimeException(new IOException("onNativeInvoke() = <NULL newUrl>"));
        }
        bundle.putString("url", onControlResolveSegmentUrl);
        return true;
    }

    @CalledByNative
    private static String onSelectCodec(Object obj, String str, int i11, int i12) {
        IjkMediaPlayer ijkMediaPlayer;
        if (obj == null || !(obj instanceof WeakReference) || (ijkMediaPlayer = (IjkMediaPlayer) ((WeakReference) obj).get()) == null) {
            return null;
        }
        OnMediaCodecSelectListener onMediaCodecSelectListener = ijkMediaPlayer.mOnMediaCodecSelectListener;
        if (onMediaCodecSelectListener == null) {
            onMediaCodecSelectListener = DefaultMediaCodecSelector.sInstance;
        }
        return onMediaCodecSelectListener.onMediaCodecSelect(ijkMediaPlayer, str, i11, i12);
    }

    @CalledByNative
    private static void postEventFromNative(Object obj, int i11, int i12, int i13, Object obj2) {
        IjkMediaPlayer ijkMediaPlayer;
        if (obj == null || (ijkMediaPlayer = (IjkMediaPlayer) ((WeakReference) obj).get()) == null) {
            return;
        }
        if (i11 == 200 && i12 == 2) {
            ijkMediaPlayer.start();
        }
        EventHandler eventHandler = ijkMediaPlayer.mEventHandler;
        if (eventHandler != null) {
            ijkMediaPlayer.mEventHandler.sendMessage(eventHandler.obtainMessage(i11, i12, i13, obj2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"Wakelock"})
    public void stayAwake(boolean z11) {
        PowerManager.WakeLock wakeLock = this.mWakeLock;
        if (wakeLock != null) {
            if (z11 && !wakeLock.isHeld()) {
                this.mWakeLock.acquire();
            } else if (!z11 && this.mWakeLock.isHeld()) {
                this.mWakeLock.release();
            }
        }
        this.mStayAwake = z11;
        updateSurfaceScreenOn();
    }

    private void updateSurfaceScreenOn() {
        SurfaceHolder surfaceHolder = this.mSurfaceHolder;
        if (surfaceHolder != null) {
            surfaceHolder.setKeepScreenOn(this.mScreenOnWhilePlaying && this.mStayAwake);
        }
    }

    public native void _prepareAsync() throws IllegalStateException;

    public native void _set_bitrate_index(int i11);

    public void deselectTrack(int i11) {
        _setStreamSelected(i11, false);
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public void enableAdaptiveBitrate() {
        _enable_adaptive_bitrate();
    }

    public void finalize() throws Throwable {
        super.finalize();
        native_finalize();
    }

    public float getAVDelay() {
        return _getPropertyFloat(FFP_PROP_FLOAT_AVDELAY, 0.0f);
    }

    public float getAVDiff() {
        return _getPropertyFloat(10005, 0.0f);
    }

    public long getAsyncStatisticBufBackwards() {
        return _getPropertyLong(FFP_PROP_INT64_ASYNC_STATISTIC_BUF_BACKWARDS, 0L);
    }

    public long getAsyncStatisticBufCapacity() {
        return _getPropertyLong(FFP_PROP_INT64_ASYNC_STATISTIC_BUF_CAPACITY, 0L);
    }

    public long getAsyncStatisticBufForwards() {
        return _getPropertyLong(FFP_PROP_INT64_ASYNC_STATISTIC_BUF_FORWARDS, 0L);
    }

    public long getAudioCachedBytes() {
        return _getPropertyLong(20008, 0L);
    }

    public long getAudioCachedDuration() {
        return _getPropertyLong(20006, 0L);
    }

    public long getAudioCachedPackets() {
        return _getPropertyLong(20010, 0L);
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public native int getAudioSessionId();

    public long getBitRate() {
        return _getPropertyLong(FFP_PROP_INT64_BIT_RATE, 0L);
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public int getBitrateIndex() {
        return this.mBitrateIndex;
    }

    public long getCacheStatisticCountBytes() {
        return _getPropertyLong(FFP_PROP_INT64_CACHE_STATISTIC_COUNT_BYTES, 0L);
    }

    public long getCacheStatisticFileForwards() {
        return _getPropertyLong(FFP_PROP_INT64_CACHE_STATISTIC_FILE_FORWARDS, 0L);
    }

    public long getCacheStatisticFilePos() {
        return _getPropertyLong(FFP_PROP_INT64_CACHE_STATISTIC_FILE_POS, 0L);
    }

    public long getCacheStatisticPhysicalPos() {
        return _getPropertyLong(FFP_PROP_INT64_CACHE_STATISTIC_PHYSICAL_POS, 0L);
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public native long getCurrentPosition();

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public String getDataSource() {
        return this.mDataSource;
    }

    public float getDropFrameRate() {
        return _getPropertyFloat(10007, 0.0f);
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public native long getDuration();

    public long getFileSize() {
        return _getPropertyLong(FFP_PROP_INT64_LOGICAL_FILE_SIZE, 0L);
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public MediaInfo getMediaInfo() {
        MediaInfo mediaInfo = new MediaInfo();
        mediaInfo.mMediaPlayerName = "ijkplayer";
        String _getVideoCodecInfo = _getVideoCodecInfo();
        if (!TextUtils.isEmpty(_getVideoCodecInfo)) {
            String[] split = _getVideoCodecInfo.split(",");
            if (split.length >= 2) {
                mediaInfo.mVideoDecoder = split[0];
                mediaInfo.mVideoDecoderImpl = split[1];
            } else if (split.length >= 1) {
                mediaInfo.mVideoDecoder = split[0];
                mediaInfo.mVideoDecoderImpl = "";
            }
        }
        String _getAudioCodecInfo = _getAudioCodecInfo();
        if (!TextUtils.isEmpty(_getAudioCodecInfo)) {
            String[] split2 = _getAudioCodecInfo.split(",");
            if (split2.length >= 2) {
                mediaInfo.mAudioDecoder = split2[0];
                mediaInfo.mAudioDecoderImpl = split2[1];
            } else if (split2.length >= 1) {
                mediaInfo.mAudioDecoder = split2[0];
                mediaInfo.mAudioDecoderImpl = "";
            }
        }
        try {
            mediaInfo.mMeta = IjkMediaMeta.parse(_getMediaMeta());
            return mediaInfo;
        } catch (Throwable th2) {
            th2.printStackTrace();
            return mediaInfo;
        }
    }

    public Bundle getMediaMeta() {
        return _getMediaMeta();
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public float getRate() {
        return getSpeed();
    }

    public long getSeekLoadDuration() {
        return _getPropertyLong(FFP_PROP_INT64_LATEST_SEEK_LOAD_DURATION, 0L);
    }

    public int getSelectedTrack(int i11) {
        long _getPropertyLong;
        if (i11 == 1) {
            _getPropertyLong = _getPropertyLong(20001, -1L);
        } else if (i11 == 2) {
            _getPropertyLong = _getPropertyLong(20002, -1L);
        } else {
            if (i11 != 3) {
                return -1;
            }
            _getPropertyLong = _getPropertyLong(20011, -1L);
        }
        return (int) _getPropertyLong;
    }

    public float getSpeed() {
        return _getPropertyFloat(FFP_PROP_FLOAT_PLAYBACK_RATE, 0.0f);
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public ArrayList<IjkBitrateItem> getSupportedBitrates() {
        return getMediaInfo().mMeta.mBitrateItems;
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public Surface getSurface() {
        return this.mSurface;
    }

    public long getTcpSpeed() {
        return _getPropertyLong(FFP_PROP_INT64_TCP_SPEED, 0L);
    }

    public long getTrafficStatisticByteCount() {
        return _getPropertyLong(FFP_PROP_INT64_TRAFFIC_STATISTIC_BYTE_COUNT, 0L);
    }

    public long getVideoCachedBytes() {
        return _getPropertyLong(20007, 0L);
    }

    public long getVideoCachedDuration() {
        return _getPropertyLong(20005, 0L);
    }

    public long getVideoCachedPackets() {
        return _getPropertyLong(20009, 0L);
    }

    public float getVideoDecodeFramesPerSecond() {
        return _getPropertyFloat(10001, 0.0f);
    }

    public int getVideoDecoder() {
        return (int) _getPropertyLong(20003, 0L);
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public int getVideoHeight() {
        return this.mVideoHeight;
    }

    public float getVideoOutputFramesPerSecond() {
        return _getPropertyFloat(10002, 0.0f);
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public int getVideoSarDen() {
        return this.mVideoSarDen;
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public int getVideoSarNum() {
        return this.mVideoSarNum;
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public int getVideoWidth() {
        return this.mVideoWidth;
    }

    public void injectCacheNode(int i11, long j11, long j12, long j13, long j14) {
        _injectCacheNode(i11, j11, j12, j13, j14);
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public boolean isLooping() {
        return _getLoopCount() != 1;
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public boolean isPlayable() {
        return true;
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public native boolean isPlaying();

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public void pause() throws IllegalStateException {
        stayAwake(false);
        _pause();
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public void prepareAsync() throws IllegalStateException {
        _prepareAsync();
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public void publishAudioToNetwork() {
        _publishAudio();
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public void release() {
        stayAwake(false);
        updateSurfaceScreenOn();
        resetListeners();
        new Thread(new Runnable() { // from class: com.tencent.ijk.media.player.IjkMediaPlayer.2
            @Override // java.lang.Runnable
            public void run() {
                IjkMediaPlayer.this._release();
            }
        }).start();
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public void reset() {
        stayAwake(false);
        _reset();
        this.mEventHandler.removeCallbacksAndMessages(null);
        this.mVideoWidth = 0;
        this.mVideoHeight = 0;
    }

    @Override // com.tencent.ijk.media.player.AbstractMediaPlayer
    public void resetListeners() {
        super.resetListeners();
        this.mOnMediaCodecSelectListener = null;
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public native void seekTo(long j11) throws IllegalStateException;

    public void selectTrack(int i11) {
        _setStreamSelected(i11, true);
    }

    public void setAndroidIOCallback(IAndroidIO iAndroidIO) throws IllegalArgumentException, SecurityException, IllegalStateException {
        _setAndroidIOCallback(iAndroidIO);
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public void setAudioVolume(int i11) {
        if (i11 < 0) {
            i11 = 0;
        }
        if (i11 > 100) {
            i11 = 100;
        }
        _setAudioVolume(i11);
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public void setBitrateIndex(int i11) {
        this.mBitrateIndex = i11;
        _set_bitrate_index(i11);
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public void setDataSource(Context context, Uri uri) throws IOException, IllegalArgumentException, SecurityException, IllegalStateException {
        setDataSource(context, uri, (Map<String, String>) null);
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public void setDisplay(SurfaceHolder surfaceHolder) {
        this.mSurfaceHolder = surfaceHolder;
        _setVideoSurface(surfaceHolder != null ? surfaceHolder.getSurface() : null);
        updateSurfaceScreenOn();
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public void setLooping(boolean z11) {
        int i11 = !z11 ? 1 : 0;
        setOption(4, "loop", i11);
        _setLoopCount(i11);
    }

    public void setOnControlMessageListener(OnControlMessageListener onControlMessageListener) {
        this.mOnControlMessageListener = onControlMessageListener;
    }

    public void setOnMediaCodecSelectListener(OnMediaCodecSelectListener onMediaCodecSelectListener) {
        this.mOnMediaCodecSelectListener = onMediaCodecSelectListener;
    }

    public void setOnNativeInvokeListener(OnNativeInvokeListener onNativeInvokeListener) {
        this.mOnNativeInvokeListener = onNativeInvokeListener;
    }

    public void setOption(int i11, String str, String str2) {
        _setOption(i11, str, str2);
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public void setRate(float f11) {
        setSpeed(f11);
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public void setScreenOnWhilePlaying(boolean z11) {
        if (this.mScreenOnWhilePlaying != z11) {
            if (z11 && this.mSurfaceHolder == null) {
                DebugLog.w(TAG, "setScreenOnWhilePlaying(true) is ineffective without a SurfaceHolder");
            }
            this.mScreenOnWhilePlaying = z11;
            updateSurfaceScreenOn();
        }
    }

    public void setSpeed(float f11) {
        _setPropertyFloat(FFP_PROP_FLOAT_PLAYBACK_RATE, f11);
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public void setSurface(Surface surface) {
        if (this.mScreenOnWhilePlaying && surface != null) {
            DebugLog.w(TAG, "setScreenOnWhilePlaying(true) is ineffective for Surface");
        }
        this.mSurfaceHolder = null;
        _setVideoSurface(surface);
        updateSurfaceScreenOn();
        this.mSurface = surface;
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public native void setVolume(float f11, float f12);

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    @SuppressLint({"Wakelock"})
    public void setWakeMode(Context context, int i11) {
        boolean z11;
        PowerManager.WakeLock wakeLock = this.mWakeLock;
        if (wakeLock != null) {
            if (wakeLock.isHeld()) {
                this.mWakeLock.release();
                z11 = true;
            } else {
                z11 = false;
            }
            this.mWakeLock = null;
        } else {
            z11 = false;
        }
        PowerManager.WakeLock newWakeLock = ((PowerManager) context.getSystemService(d.f8118j)).newWakeLock(i11 | 536870912, IjkMediaPlayer.class.getName());
        this.mWakeLock = newWakeLock;
        newWakeLock.setReferenceCounted(false);
        if (z11) {
            this.mWakeLock.acquire();
        }
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public void start() throws IllegalStateException {
        stayAwake(true);
        _start();
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public void stop() throws IllegalStateException {
        stayAwake(false);
        _stop();
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public void unpublishAudioToNetwork() {
        _unPublishAudio();
    }

    public IjkMediaPlayer(IjkLibLoader ijkLibLoader) {
        this.mWakeLock = null;
        initPlayer(ijkLibLoader);
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public IjkTrackInfo[] getTrackInfo() {
        IjkMediaMeta parse;
        Bundle mediaMeta = getMediaMeta();
        if (mediaMeta == null || (parse = IjkMediaMeta.parse(mediaMeta)) == null || parse.mStreams == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<IjkMediaMeta.IjkStreamMeta> it = parse.mStreams.iterator();
        while (it.hasNext()) {
            IjkMediaMeta.IjkStreamMeta next = it.next();
            IjkTrackInfo ijkTrackInfo = new IjkTrackInfo(next);
            if (next.mType.equalsIgnoreCase("video")) {
                ijkTrackInfo.setTrackType(1);
            } else if (next.mType.equalsIgnoreCase("audio")) {
                ijkTrackInfo.setTrackType(2);
            } else if (next.mType.equalsIgnoreCase("timedtext")) {
                ijkTrackInfo.setTrackType(3);
            }
            arrayList.add(ijkTrackInfo);
        }
        return (IjkTrackInfo[]) arrayList.toArray(new IjkTrackInfo[arrayList.size()]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0089, code lost:
    
        if (r1 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008b, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0092, code lost:
    
        android.util.Log.d(com.tencent.ijk.media.player.IjkMediaPlayer.TAG, "Couldn't open file on client side, trying server side");
        setDataSource(r10.toString(), r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a0, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008f, code lost:
    
        if (r1 == null) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[SYNTHETIC] */
    @Override // com.tencent.ijk.media.player.IMediaPlayer
    @android.annotation.TargetApi(14)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setDataSource(android.content.Context r9, android.net.Uri r10, java.util.Map<java.lang.String, java.lang.String> r11) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.SecurityException, java.lang.IllegalStateException {
        /*
            r8 = this;
            java.lang.String r0 = r10.getScheme()
            java.lang.String r1 = "file"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L14
            java.lang.String r9 = r10.getPath()
            r8.setDataSource(r9)
            return
        L14:
            java.lang.String r1 = "content"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L3b
            java.lang.String r0 = "settings"
            java.lang.String r1 = r10.getAuthority()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L3b
            int r10 = android.media.RingtoneManager.getDefaultType(r10)
            android.net.Uri r10 = android.media.RingtoneManager.getActualDefaultRingtoneUri(r9, r10)
            if (r10 == 0) goto L33
            goto L3b
        L33:
            java.io.FileNotFoundException r9 = new java.io.FileNotFoundException
            java.lang.String r10 = "Failed to resolve default ringtone"
            r9.<init>(r10)
            throw r9
        L3b:
            r1 = 0
            android.content.ContentResolver r9 = r9.getContentResolver()     // Catch: java.io.IOException -> L65 java.lang.SecurityException -> L67 java.lang.Throwable -> L80
            java.lang.String r0 = "r"
            android.content.res.AssetFileDescriptor r1 = r9.openAssetFileDescriptor(r10, r0)     // Catch: java.io.IOException -> L65 java.lang.SecurityException -> L67 java.lang.Throwable -> L80
            if (r1 != 0) goto L4e
            if (r1 == 0) goto L4d
            r1.close()
        L4d:
            return
        L4e:
            long r2 = r1.getDeclaredLength()     // Catch: java.io.IOException -> L65 java.lang.SecurityException -> L67 java.lang.Throwable -> L80
            r4 = 0
            int r9 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r9 >= 0) goto L69
            java.io.FileDescriptor r9 = r1.getFileDescriptor()     // Catch: java.lang.Throwable -> L61 java.io.IOException -> L65 java.lang.SecurityException -> L67
            r8.setDataSource(r9)     // Catch: java.lang.Throwable -> L61 java.io.IOException -> L65 java.lang.SecurityException -> L67
            r2 = r8
            goto L79
        L61:
            r0 = move-exception
            r9 = r0
            r2 = r8
            goto L83
        L65:
            r2 = r8
            goto L89
        L67:
            r2 = r8
            goto L8f
        L69:
            java.io.FileDescriptor r3 = r1.getFileDescriptor()     // Catch: java.io.IOException -> L65 java.lang.SecurityException -> L67 java.lang.Throwable -> L80
            long r4 = r1.getStartOffset()     // Catch: java.io.IOException -> L65 java.lang.SecurityException -> L67 java.lang.Throwable -> L80
            long r6 = r1.getDeclaredLength()     // Catch: java.io.IOException -> L65 java.lang.SecurityException -> L67 java.lang.Throwable -> L80
            r2 = r8
            r2.setDataSource(r3, r4, r6)     // Catch: java.lang.Throwable -> L7d java.io.IOException -> L89 java.lang.SecurityException -> L8f
        L79:
            r1.close()
            return
        L7d:
            r0 = move-exception
        L7e:
            r9 = r0
            goto L83
        L80:
            r0 = move-exception
            r2 = r8
            goto L7e
        L83:
            if (r1 == 0) goto L88
            r1.close()
        L88:
            throw r9
        L89:
            if (r1 == 0) goto L92
        L8b:
            r1.close()
            goto L92
        L8f:
            if (r1 == 0) goto L92
            goto L8b
        L92:
            java.lang.String r9 = com.tencent.ijk.media.player.IjkMediaPlayer.TAG
            java.lang.String r0 = "Couldn't open file on client side, trying server side"
            android.util.Log.d(r9, r0)
            java.lang.String r9 = r10.toString()
            r8.setDataSource(r9, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.ijk.media.player.IjkMediaPlayer.setDataSource(android.content.Context, android.net.Uri, java.util.Map):void");
    }

    public void setOption(int i11, String str, long j11) {
        _setOption(i11, str, j11);
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public void setAudioStreamType(int i11) {
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public void setKeepInBackground(boolean z11) {
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public void setLogEnabled(boolean z11) {
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    public void setDataSource(String str) throws IOException, IllegalArgumentException, SecurityException, IllegalStateException {
        this.mDataSource = str;
        _setDataSource(str, null, null);
    }

    public void setDataSource(String str, Map<String, String> map) throws IOException, IllegalArgumentException, SecurityException, IllegalStateException {
        if (map != null && !map.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                sb2.append(entry.getKey());
                sb2.append(":");
                if (!TextUtils.isEmpty(entry.getValue())) {
                    sb2.append(entry.getValue());
                }
                sb2.append("\r\n");
                setOption(1, "headers", sb2.toString());
                setOption(1, "protocol_whitelist", "async,cache,crypto,file,http,https,ijkhttphook,ijkinject,ijklivehook,ijklongurl,ijksegment,ijktcphook,pipe,rtp,tcp,tls,udp,ijkurlhook,data,ijkhttpcache,ijklongurl");
            }
        }
        setDataSource(str);
    }

    @Override // com.tencent.ijk.media.player.IMediaPlayer
    @TargetApi(13)
    public void setDataSource(FileDescriptor fileDescriptor) throws IOException, IllegalArgumentException, IllegalStateException {
        ParcelFileDescriptor dup = ParcelFileDescriptor.dup(fileDescriptor);
        try {
            _setDataSourceFd(dup.getFd());
        } finally {
            dup.close();
        }
    }

    private void setDataSource(FileDescriptor fileDescriptor, long j11, long j12) throws IOException, IllegalArgumentException, IllegalStateException {
        setDataSource(fileDescriptor);
    }

    @Override // com.tencent.ijk.media.player.AbstractMediaPlayer, com.tencent.ijk.media.player.IMediaPlayer
    public void setDataSource(IMediaDataSource iMediaDataSource) throws IllegalArgumentException, SecurityException, IllegalStateException {
        _setDataSource(iMediaDataSource);
    }
}

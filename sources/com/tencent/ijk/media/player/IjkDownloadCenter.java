package com.tencent.ijk.media.player;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.tencent.ijk.media.player.annotations.CalledByNative;
import com.tencent.liteav.basic.util.h;
import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class IjkDownloadCenter {
    private static final int DC_PROP_LONG_DOWNLOAD_SEGMENTS = 1006;
    private static final int DC_PROP_LONG_DOWNLOAD_SIZE = 1003;
    private static final int DC_PROP_LONG_SEGMENTS = 1005;
    private static final int DC_PROP_LONG_SIZE = 1002;
    private static final int DC_PROP_LONG_SPEED = 1004;
    private static final int DC_PROP_STRING_URL = 1001;
    private static final int MSG_ERROR = 500;
    private static final int MSG_FINISH = 600;
    private static final int MSG_PROGRESS = 900;
    private static final int MSG_RESUME = 100;
    private static final int MSG_STOP = 300;
    private static final String TAG = "IjkDownloadCenter";
    private static IjkDownloadCenter instance = null;
    private static volatile boolean mIsLibLoaded = false;
    private static final IjkLibLoader sLocalLibLoader = new IjkLibLoader() { // from class: com.tencent.ijk.media.player.IjkDownloadCenter.1
        @Override // com.tencent.ijk.media.player.IjkLibLoader
        public void loadLibrary(String str) throws UnsatisfiedLinkError, SecurityException {
            h.a(str);
        }
    };
    private EventHandler mEventHandler;
    protected Map<String, String> mHeaders;
    private OnDownloadListener mListener;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class EventHandler extends Handler {
        private final WeakReference<IjkDownloadCenter> mWeakCenter;

        public EventHandler(IjkDownloadCenter ijkDownloadCenter, Looper looper) {
            super(looper);
            this.mWeakCenter = new WeakReference<>(ijkDownloadCenter);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            NativeEvent nativeEvent;
            IjkDownloadMedia ijkDownloadMedia;
            IjkDownloadCenter ijkDownloadCenter = this.mWeakCenter.get();
            if (ijkDownloadCenter == null || ijkDownloadCenter.mListener == null || (ijkDownloadMedia = (nativeEvent = (NativeEvent) message.obj).media) == null) {
                return;
            }
            int i11 = message.what;
            if (i11 == 100) {
                ijkDownloadCenter.mListener.downloadBegin(ijkDownloadCenter, ijkDownloadMedia);
                return;
            }
            if (i11 == 300) {
                ijkDownloadCenter.mListener.downloadEnd(ijkDownloadCenter, ijkDownloadMedia);
                return;
            }
            if (i11 == 500) {
                ijkDownloadCenter.mListener.downloadError(ijkDownloadCenter, ijkDownloadMedia, nativeEvent.error, nativeEvent.reason);
            } else if (i11 == 600) {
                ijkDownloadCenter.mListener.downloadFinish(ijkDownloadCenter, ijkDownloadMedia);
            } else {
                if (i11 != 900) {
                    return;
                }
                ijkDownloadCenter.mListener.downloadProgress(ijkDownloadCenter, ijkDownloadMedia);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class NativeEvent {
        int error;
        IjkDownloadMedia media;
        String reason;

        private NativeEvent() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface OnDownloadListener {
        void downloadBegin(IjkDownloadCenter ijkDownloadCenter, IjkDownloadMedia ijkDownloadMedia);

        void downloadEnd(IjkDownloadCenter ijkDownloadCenter, IjkDownloadMedia ijkDownloadMedia);

        void downloadError(IjkDownloadCenter ijkDownloadCenter, IjkDownloadMedia ijkDownloadMedia, int i11, String str);

        void downloadFinish(IjkDownloadCenter ijkDownloadCenter, IjkDownloadMedia ijkDownloadMedia);

        void downloadProgress(IjkDownloadCenter ijkDownloadCenter, IjkDownloadMedia ijkDownloadMedia);

        int hlsKeyVerify(IjkDownloadCenter ijkDownloadCenter, IjkDownloadMedia ijkDownloadMedia, String str, byte[] bArr);
    }

    public IjkDownloadCenter(IjkLibLoader ijkLibLoader) {
        loadLibrariesOnce(ijkLibLoader);
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            this.mEventHandler = new EventHandler(this, mainLooper);
        } else {
            this.mEventHandler = null;
        }
        native_download_setup(new WeakReference(this));
    }

    private native int download_get_task_prop_long(int i11, int i12);

    private native String download_get_task_prop_string(int i11, int i12);

    public static IjkDownloadCenter getInstance() {
        if (instance == null) {
            instance = new IjkDownloadCenter();
        }
        return instance;
    }

    @CalledByNative
    private static int hlsVerifyForNative(Object obj, int i11, String str, byte[] bArr) {
        IjkDownloadCenter ijkDownloadCenter;
        if (obj == null || (ijkDownloadCenter = (IjkDownloadCenter) ((WeakReference) obj).get()) == null) {
            return 0;
        }
        return ijkDownloadCenter.mListener.hlsKeyVerify(ijkDownloadCenter, ijkDownloadCenter.convertMedia(i11), str, bArr);
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

    private native void native_download_free();

    private native int native_download_hls_start(String str, String str2, String str3);

    private native void native_download_setup(Object obj);

    private native void native_download_stop(int i11);

    @CalledByNative
    private static void postEventFromNative(Object obj, int i11, int i12, int i13, Object obj2) {
        IjkDownloadCenter ijkDownloadCenter;
        if (obj == null || (ijkDownloadCenter = (IjkDownloadCenter) ((WeakReference) obj).get()) == null || ijkDownloadCenter.mEventHandler == null) {
            return;
        }
        NativeEvent nativeEvent = new NativeEvent();
        nativeEvent.media = ijkDownloadCenter.convertMedia(i12);
        nativeEvent.error = i13;
        if (obj2 != null) {
            nativeEvent.reason = (String) obj2;
        }
        ijkDownloadCenter.mEventHandler.sendMessage(ijkDownloadCenter.mEventHandler.obtainMessage(i11, i12, i13, nativeEvent));
    }

    public IjkDownloadMedia convertMedia(int i11) {
        String download_get_task_prop_string = download_get_task_prop_string(1001, i11);
        if (download_get_task_prop_string == null) {
            return null;
        }
        IjkDownloadMedia ijkDownloadMedia = new IjkDownloadMedia();
        ijkDownloadMedia.size = download_get_task_prop_long(1002, i11);
        ijkDownloadMedia.downloadSize = download_get_task_prop_long(1003, i11);
        ijkDownloadMedia.speed = download_get_task_prop_long(1004, i11);
        ijkDownloadMedia.segments = download_get_task_prop_long(1005, i11);
        ijkDownloadMedia.downloadSegments = download_get_task_prop_long(1006, i11);
        ijkDownloadMedia.url = download_get_task_prop_string;
        ijkDownloadMedia.tid = i11;
        return ijkDownloadMedia;
    }

    public int downloadHls(String str, String str2) {
        Map<String, String> map = this.mHeaders;
        String str3 = "";
        if (map != null) {
            for (String str4 : map.keySet()) {
                str3 = str3 == null ? String.format("%s: %s", str4, this.mHeaders.get(str4)) : str3 + "\r\n" + String.format("%s: %s", str4, this.mHeaders.get(str4));
            }
        }
        return native_download_hls_start(str, str2, str3);
    }

    public void finalize() throws Throwable {
        try {
            native_download_free();
        } finally {
            super.finalize();
        }
    }

    public void setHeaders(Map<String, String> map) {
        this.mHeaders = map;
    }

    public IjkDownloadCenter setListener(OnDownloadListener onDownloadListener) {
        this.mListener = onDownloadListener;
        return this;
    }

    public void stop(int i11) {
        native_download_stop(i11);
    }

    public IjkDownloadCenter() {
        this(sLocalLibLoader);
    }
}

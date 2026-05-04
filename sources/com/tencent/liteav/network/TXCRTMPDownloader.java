package com.tencent.liteav.network;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import com.tencent.liteav.network.TXCStreamDownloader;
import com.tencent.liteav.network.TXIStreamDownloader;
import com.tencent.rtmp.TXLiveConstants;
import java.util.Vector;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class TXCRTMPDownloader extends TXIStreamDownloader {
    private final int MSG_EVENT;
    private final int MSG_RECONNECT;
    private final String TAG;
    private int mConnectCountQuic;
    private int mConnectCountTcp;
    private a mCurrentThread;
    private boolean mEnableNearestIP;
    private Handler mHandler;
    private boolean mHasTcpPlayUrl;
    private boolean mIsPlayRtmpAccStream;
    private int mLastNetworkType;
    private String mPlayUrl;
    private boolean mQuicChannel;
    private Object mRTMPThreadLock;
    private String mServerIp;
    private HandlerThread mThread;
    private Vector<e> mVecPlayUrls;

    public TXCRTMPDownloader(Context context) {
        super(context);
        this.TAG = "network.TXCRTMPDownloader";
        this.MSG_RECONNECT = 101;
        this.MSG_EVENT = 102;
        this.mPlayUrl = "";
        this.mQuicChannel = false;
        this.mServerIp = "";
        this.mCurrentThread = null;
        this.mThread = null;
        this.mHandler = null;
        this.mIsPlayRtmpAccStream = false;
        this.mEnableNearestIP = false;
        this.mConnectCountQuic = 0;
        this.mConnectCountTcp = 0;
        this.mLastNetworkType = 0;
        this.mRTMPThreadLock = new Object();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void internalReconnect(boolean z11) {
        Vector<e> vector;
        if (this.mIsRunning) {
            if (this.mIsPlayRtmpAccStream && this.mLastNetworkType != com.tencent.liteav.basic.util.h.d(this.mApplicationContext)) {
                this.mLastNetworkType = com.tencent.liteav.basic.util.h.d(this.mApplicationContext);
                TXIStreamDownloader.a aVar = this.mRestartListener;
                if (aVar != null) {
                    aVar.onRestartDownloader();
                    return;
                }
                return;
            }
            boolean z12 = this.mQuicChannel;
            if (this.mIsPlayRtmpAccStream) {
                if (!this.mEnableNearestIP) {
                    z11 = false;
                }
                if (z12) {
                    z11 = true;
                }
                if (z11 && (vector = this.mVecPlayUrls) != null && !vector.isEmpty()) {
                    e eVar = this.mVecPlayUrls.get(0);
                    this.mVecPlayUrls.remove(0);
                    this.mPlayUrl = eVar.f43771a;
                    this.mQuicChannel = eVar.f43772b;
                }
            }
            if (z12 && this.mHasTcpPlayUrl) {
                sendNotifyEvent(2103);
                startInternal();
                return;
            }
            int i11 = this.connectRetryTimes;
            if (i11 >= this.connectRetryLimit) {
                TXCLog.e("network.TXCRTMPDownloader", "reconnect all times retried, send failed event ");
                sendNotifyEvent(-2301);
                return;
            }
            this.connectRetryTimes = i11 + 1;
            TXCLog.i("network.TXCRTMPDownloader", "reconnect retry count:" + this.connectRetryTimes + " limit:" + this.connectRetryLimit);
            sendNotifyEvent(2103);
            startInternal();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public native TXCStreamDownloader.DownloadStats nativeGetStats(long j11);

    /* JADX INFO: Access modifiers changed from: private */
    public native long nativeInitRtmpHandler(String str, String str2, String str3, boolean z11, boolean z12, boolean z13);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeRequestKeyFrame(long j11, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeSetPayloadType(long j11, int i11);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeStart(long j11);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeStop(long j11);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeUninitRtmpHandler(long j11);

    private void postReconnectMsg() {
        Message message = new Message();
        message.what = 101;
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.sendMessageDelayed(message, this.connectRetryInterval * 1000);
        }
    }

    private void reconnect(final boolean z11) {
        synchronized (this.mRTMPThreadLock) {
            try {
                a aVar = this.mCurrentThread;
                if (aVar != null) {
                    aVar.a();
                    this.mCurrentThread = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.postDelayed(new Runnable() { // from class: com.tencent.liteav.network.TXCRTMPDownloader.1
                @Override // java.lang.Runnable
                public void run() {
                    TXCRTMPDownloader.this.internalReconnect(z11);
                }
            }, this.connectRetryInterval * 1000);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startInternal() {
        if (this.mQuicChannel) {
            this.mConnectCountQuic++;
        } else {
            this.mConnectCountTcp++;
        }
        synchronized (this.mRTMPThreadLock) {
            a aVar = new a(this.mPlayUrl, this.mQuicChannel);
            this.mCurrentThread = aVar;
            aVar.start();
        }
    }

    @Override // com.tencent.liteav.network.TXIStreamDownloader
    public int getConnectCountQuic() {
        return this.mConnectCountQuic;
    }

    @Override // com.tencent.liteav.network.TXIStreamDownloader
    public int getConnectCountTcp() {
        return this.mConnectCountTcp;
    }

    @Override // com.tencent.liteav.network.TXIStreamDownloader
    public String getCurrentStreamUrl() {
        return this.mPlayUrl;
    }

    @Override // com.tencent.liteav.network.TXIStreamDownloader
    public TXCStreamDownloader.DownloadStats getDownloadStats() {
        synchronized (this.mRTMPThreadLock) {
            try {
                a aVar = this.mCurrentThread;
                if (aVar == null) {
                    return null;
                }
                return aVar.b();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.tencent.liteav.network.TXIStreamDownloader
    public boolean isQuicChannel() {
        return this.mQuicChannel;
    }

    @Override // com.tencent.liteav.network.TXIStreamDownloader
    public void requestKeyFrame(String str) {
        synchronized (this.mRTMPThreadLock) {
            try {
                a aVar = this.mCurrentThread;
                if (aVar != null) {
                    aVar.a(str);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.tencent.liteav.network.TXIStreamDownloader
    public void sendNotifyEvent(int i11, String str) {
        if (str.isEmpty()) {
            sendNotifyEvent(i11);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString(TXLiveConstants.EVT_DESCRIPTION, str);
        bundle.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
        bundle.putLong(TXLiveConstants.EVT_UTC_TIME, TXCTimeUtil.getUtcTimeTick());
        com.tencent.liteav.basic.b.b bVar = this.mNotifyListener;
        if (bVar != null) {
            bVar.onNotifyEvent(i11, bundle);
        }
    }

    @Override // com.tencent.liteav.network.TXIStreamDownloader
    public void setPayloadType(int i11) {
        this.mPayloadType = i11;
        synchronized (this.mRTMPThreadLock) {
            try {
                a aVar = this.mCurrentThread;
                if (aVar != null) {
                    aVar.a(this.mPayloadType);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.tencent.liteav.network.TXIStreamDownloader
    public void startDownload(Vector<e> vector, boolean z11, boolean z12, boolean z13, boolean z14) {
        if (this.mIsRunning || vector == null || vector.isEmpty()) {
            return;
        }
        this.mEnableMessage = z13;
        this.mEnableMetaData = z14;
        this.mIsPlayRtmpAccStream = z11;
        this.mEnableNearestIP = z12;
        this.mVecPlayUrls = vector;
        this.mHasTcpPlayUrl = false;
        int i11 = 0;
        while (true) {
            if (i11 >= this.mVecPlayUrls.size()) {
                break;
            }
            if (!this.mVecPlayUrls.elementAt(i11).f43772b) {
                this.mHasTcpPlayUrl = true;
                break;
            }
            i11++;
        }
        e eVar = this.mVecPlayUrls.get(0);
        this.mVecPlayUrls.remove(0);
        this.mPlayUrl = eVar.f43771a;
        this.mQuicChannel = eVar.f43772b;
        this.mIsRunning = true;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("start pull with url:");
        sb2.append(this.mPlayUrl);
        sb2.append(" quic:");
        sb2.append(this.mQuicChannel ? ma.b.H0 : ma.b.I0);
        TXCLog.i("network.TXCRTMPDownloader", sb2.toString());
        this.mConnectCountQuic = 0;
        this.mConnectCountTcp = 0;
        this.connectRetryTimes = 0;
        if (this.mThread == null) {
            HandlerThread handlerThread = new HandlerThread("RTMP_PULL");
            this.mThread = handlerThread;
            handlerThread.start();
        }
        this.mHandler = new Handler(this.mThread.getLooper()) { // from class: com.tencent.liteav.network.TXCRTMPDownloader.2
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                if (message.what == 101) {
                    TXCRTMPDownloader.this.startInternal();
                }
            }
        };
        startInternal();
    }

    @Override // com.tencent.liteav.network.TXIStreamDownloader
    public void stopDownload() {
        if (this.mIsRunning) {
            this.mIsRunning = false;
            this.mVecPlayUrls.removeAllElements();
            this.mVecPlayUrls = null;
            this.mIsPlayRtmpAccStream = false;
            this.mEnableNearestIP = false;
            TXCLog.i("network.TXCRTMPDownloader", "stop pull");
            synchronized (this.mRTMPThreadLock) {
                try {
                    a aVar = this.mCurrentThread;
                    if (aVar != null) {
                        aVar.a();
                        this.mCurrentThread = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            HandlerThread handlerThread = this.mThread;
            if (handlerThread != null) {
                handlerThread.quit();
                this.mThread = null;
            }
            if (this.mHandler != null) {
                this.mHandler = null;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends Thread {

        /* renamed from: b, reason: collision with root package name */
        private long f43673b;

        /* renamed from: c, reason: collision with root package name */
        private String f43674c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f43675d;

        public a(String str, boolean z11) {
            super("RTMPDownLoad");
            this.f43673b = 0L;
            this.f43674c = str;
            this.f43675d = z11;
        }

        public void a() {
            synchronized (this) {
                try {
                    long j11 = this.f43673b;
                    if (j11 != 0) {
                        TXCRTMPDownloader.this.nativeStop(j11);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public TXCStreamDownloader.DownloadStats b() {
            TXCStreamDownloader.DownloadStats nativeGetStats;
            synchronized (this) {
                try {
                    long j11 = this.f43673b;
                    nativeGetStats = j11 != 0 ? TXCRTMPDownloader.this.nativeGetStats(j11) : null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return nativeGetStats;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            synchronized (this) {
                TXCRTMPDownloader tXCRTMPDownloader = TXCRTMPDownloader.this;
                this.f43673b = tXCRTMPDownloader.nativeInitRtmpHandler(tXCRTMPDownloader.mUserID, tXCRTMPDownloader.mOriginUrl, this.f43674c, this.f43675d, tXCRTMPDownloader.mEnableMessage, tXCRTMPDownloader.mEnableMetaData);
            }
            a(TXCRTMPDownloader.this.mPayloadType);
            TXCRTMPDownloader.this.nativeStart(this.f43673b);
            synchronized (this) {
                TXCRTMPDownloader.this.nativeUninitRtmpHandler(this.f43673b);
                this.f43673b = 0L;
            }
        }

        public void a(String str) {
            synchronized (this) {
                try {
                    long j11 = this.f43673b;
                    if (j11 != 0) {
                        TXCRTMPDownloader.this.nativeRequestKeyFrame(j11, str);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public void a(int i11) {
            synchronized (this) {
                try {
                    long j11 = this.f43673b;
                    if (j11 != 0) {
                        TXCRTMPDownloader.this.nativeSetPayloadType(j11, i11);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // com.tencent.liteav.network.TXIStreamDownloader
    public void sendNotifyEvent(int i11) {
        if (i11 != 0 && i11 != 1) {
            super.sendNotifyEvent(i11);
        } else {
            reconnect(i11 == 1);
        }
    }
}

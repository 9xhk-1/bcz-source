package com.tencent.liteav.network;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import com.baicizhan.main.vld.bonding.DeviceBondingActivityKt;
import com.tencent.liteav.basic.datareport.TXCDRApi;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.structs.TXSNALPacket;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import com.tencent.liteav.network.TXIStreamDownloader;
import com.tencent.liteav.network.d;
import com.tencent.liteav.network.l;
import com.tencent.rtmp.TXLiveConstants;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Vector;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class TXCStreamDownloader extends com.tencent.liteav.basic.module.a implements com.tencent.liteav.basic.b.b, TXIStreamDownloader.a, d.a, h, i {
    public static final String TAG = "TXCStreamDownloader";
    private l mAccUrlFetcher;
    private Context mApplicationContext;
    private int mDownloadFormat;
    private TXIStreamDownloader mDownloader;
    private Handler mHandler;
    protected Map<String, String> mHeaders;
    private i mListener = null;
    private byte[] mListenerLock = new byte[0];
    private com.tencent.liteav.basic.b.b mNotifyListener = null;
    private boolean mDownloaderRunning = false;
    private String mOriginPlayUrl = "";
    private boolean mEnableNearestIP = false;
    private int mChannelType = 0;
    private boolean mEnableMessage = false;
    private boolean mEnableMetaData = false;
    private String mFlvSessionKey = "";
    private long mLastTimeStamp = 0;
    private DownloadStats mLastDownloadStats = null;
    private boolean mRecvFirstNal = false;
    private long mSwitchStartTime = 0;
    private long mCurrentNalTs = 0;
    private long mLastIFramelTs = 0;
    private d mStreamSwitcher = null;
    private int mPayLoadType = 0;
    private Runnable mReportNetStatusRunnalbe = new Runnable() { // from class: com.tencent.liteav.network.TXCStreamDownloader.3
        @Override // java.lang.Runnable
        public void run() {
            TXCStreamDownloader.this.reportNetStatus();
        }
    };

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class DownloadStats {
        public long afterParseAudioBytes;
        public long afterParseVideoBytes;
        public long beforeParseAudioBytes;
        public long beforeParseVideoBytes;
        public long connTS;
        public long dnsTS;
        public int errorCode;
        public String errorInfo;
        public long firstAudioTS;
        public long firstVideoTS;
        public String flvSessionKey;
        public String serverIP;
        public long startTS;
        public long videoGop;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public String f43682a;

        /* renamed from: b, reason: collision with root package name */
        public String f43683b;

        /* renamed from: c, reason: collision with root package name */
        public String f43684c;

        /* renamed from: d, reason: collision with root package name */
        public int f43685d;

        /* renamed from: e, reason: collision with root package name */
        public String f43686e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f43687f;
    }

    static {
        com.tencent.liteav.basic.util.h.d();
    }

    public TXCStreamDownloader(Context context, int i11) {
        this.mDownloader = null;
        this.mDownloadFormat = 1;
        this.mHandler = null;
        if (i11 == 0) {
            TXCFLVDownloader tXCFLVDownloader = new TXCFLVDownloader(context);
            this.mDownloader = tXCFLVDownloader;
            tXCFLVDownloader.setFlvSessionKey(this.mFlvSessionKey);
        } else if (i11 == 1 || i11 == 4) {
            this.mDownloader = new TXCRTMPDownloader(context);
        }
        TXIStreamDownloader tXIStreamDownloader = this.mDownloader;
        if (tXIStreamDownloader != null) {
            tXIStreamDownloader.setListener(this);
            this.mDownloader.setNotifyListener(this);
            this.mDownloader.setRestartListener(this);
            this.mDownloader.setMessageNotifyListener(this);
        }
        this.mDownloadFormat = i11;
        this.mAccUrlFetcher = new l(context);
        this.mApplicationContext = context;
        if (context != null) {
            this.mHandler = new Handler(this.mApplicationContext.getMainLooper());
        }
    }

    private DownloadStats getDownloadStats() {
        TXIStreamDownloader tXIStreamDownloader = this.mDownloader;
        if (tXIStreamDownloader != null) {
            return tXIStreamDownloader.getDownloadStats();
        }
        return null;
    }

    private a getRealTimeStreamInfo() {
        a aVar;
        l lVar = this.mAccUrlFetcher;
        if (lVar == null || TextUtils.isEmpty(lVar.a())) {
            aVar = null;
        } else {
            aVar = new a();
            aVar.f43683b = this.mAccUrlFetcher.a();
            aVar.f43684c = this.mAccUrlFetcher.b();
            aVar.f43685d = this.mAccUrlFetcher.c();
            aVar.f43686e = this.mAccUrlFetcher.d();
        }
        TXIStreamDownloader tXIStreamDownloader = this.mDownloader;
        if (tXIStreamDownloader != null && aVar != null) {
            aVar.f43682a = tXIStreamDownloader.getCurrentStreamUrl();
            aVar.f43687f = this.mDownloader.isQuicChannel();
        }
        return aVar;
    }

    private Long getSpeed(long j11, long j12, long j13) {
        if (j11 <= j12) {
            j12 -= j11;
        }
        return Long.valueOf(j13 > 0 ? (j12 * DeviceBondingActivityKt.f25227b) / (j13 * 1024) : 0L);
    }

    private native String nativeGetRTMPProxyUserId();

    private void playStreamWithRawUrl(String str, boolean z11) {
        if (this.mDownloader != null) {
            if (str != null && ((str.startsWith("http://") || str.startsWith("https://")) && str.contains(".flv"))) {
                TXIStreamDownloader tXIStreamDownloader = this.mDownloader;
                int i11 = tXIStreamDownloader.connectRetryLimit;
                int i12 = tXIStreamDownloader.connectRetryInterval;
                this.mDownloader = null;
                TXCFLVDownloader tXCFLVDownloader = new TXCFLVDownloader(this.mApplicationContext);
                this.mDownloader = tXCFLVDownloader;
                tXCFLVDownloader.setFlvSessionKey(this.mFlvSessionKey);
                this.mDownloader.setListener(this);
                this.mDownloader.setNotifyListener(this);
                this.mDownloader.setRestartListener(this);
                TXIStreamDownloader tXIStreamDownloader2 = this.mDownloader;
                tXIStreamDownloader2.connectRetryLimit = i11;
                tXIStreamDownloader2.connectRetryInterval = i12;
                tXIStreamDownloader2.setHeaders(this.mHeaders);
                this.mDownloader.setUserID(getID());
                this.mDownloader.setMessageNotifyListener(this);
                this.mDownloader.setPayloadType(this.mPayLoadType);
            }
            setStatusValue(7112, 1L);
            Vector<e> vector = new Vector<>();
            vector.add(new e(str, false));
            this.mDownloader.setOriginUrl(str);
            this.mDownloader.startDownload(vector, false, false, z11, z11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reportNetStatus() {
        reportNetStatusInternal();
        this.mHandler.postDelayed(this.mReportNetStatusRunnalbe, 2000L);
    }

    private void reportNetStatusInternal() {
        TXCStreamDownloader tXCStreamDownloader;
        long j11;
        long j12;
        long timeTick = TXCTimeUtil.getTimeTick();
        long j13 = timeTick - this.mLastTimeStamp;
        DownloadStats downloadStats = getDownloadStats();
        a realTimeStreamInfo = getRealTimeStreamInfo();
        if (downloadStats != null) {
            DownloadStats downloadStats2 = this.mLastDownloadStats;
            if (downloadStats2 != null) {
                tXCStreamDownloader = this;
                j12 = tXCStreamDownloader.getSpeed(downloadStats2.afterParseVideoBytes, downloadStats.afterParseVideoBytes, j13).longValue();
                j11 = tXCStreamDownloader.getSpeed(tXCStreamDownloader.mLastDownloadStats.afterParseAudioBytes, downloadStats.afterParseAudioBytes, j13).longValue();
            } else {
                tXCStreamDownloader = this;
                j11 = 0;
                j12 = 0;
            }
            if (j12 > 0 || j11 > 0) {
                tXCStreamDownloader.mDownloader.connectRetryTimes = 0;
            }
            setStatusValue(7101, Long.valueOf(j12));
            setStatusValue(7102, Long.valueOf(j11));
            setStatusValue(7103, Long.valueOf(downloadStats.firstVideoTS));
            setStatusValue(7104, Long.valueOf(downloadStats.firstAudioTS));
            setStatusValue(7120, Long.valueOf(downloadStats.videoGop));
            if (realTimeStreamInfo != null) {
                setStatusValue(7105, Long.valueOf(realTimeStreamInfo.f43685d));
                setStatusValue(7106, realTimeStreamInfo.f43686e);
                setStatusValue(7111, Long.valueOf(realTimeStreamInfo.f43687f ? 2L : 1L));
                setStatusValue(7116, realTimeStreamInfo.f43682a);
                setStatusValue(7117, realTimeStreamInfo.f43683b);
                setStatusValue(7118, realTimeStreamInfo.f43684c);
            } else {
                setStatusValue(7105, Long.valueOf(downloadStats.errorCode));
                setStatusValue(7106, downloadStats.errorInfo);
                setStatusValue(7111, 1L);
            }
            setStatusValue(7107, Long.valueOf(downloadStats.startTS));
            setStatusValue(7108, Long.valueOf(downloadStats.dnsTS));
            setStatusValue(7109, Long.valueOf(downloadStats.connTS));
            setStatusValue(7110, String.valueOf(downloadStats.serverIP));
        } else {
            tXCStreamDownloader = this;
        }
        TXIStreamDownloader tXIStreamDownloader = tXCStreamDownloader.mDownloader;
        if (tXIStreamDownloader != null) {
            int connectCountQuic = tXIStreamDownloader.getConnectCountQuic();
            int connectCountTcp = tXCStreamDownloader.mDownloader.getConnectCountTcp();
            setStatusValue(7114, Long.valueOf(connectCountQuic + 1));
            setStatusValue(7115, Long.valueOf(connectCountTcp + 1));
            setStatusValue(7119, tXCStreamDownloader.mDownloader.getRealStreamUrl());
            setStatusValue(7121, String.valueOf(tXCStreamDownloader.mDownloader.getFlvSessionKey()));
        }
        tXCStreamDownloader.mLastTimeStamp = timeTick;
        tXCStreamDownloader.mLastDownloadStats = downloadStats;
    }

    private void tryResetRetryCount() {
        TXIStreamDownloader tXIStreamDownloader = this.mDownloader;
        if (tXIStreamDownloader != null) {
            tXIStreamDownloader.connectRetryTimes = 0;
        }
    }

    public String getRTMPProxyUserId() {
        return nativeGetRTMPProxyUserId();
    }

    @Override // com.tencent.liteav.network.h
    public void onMetaDataMessage(HashMap<String, String> hashMap) {
        com.tencent.liteav.basic.b.b bVar = this.mNotifyListener;
        if (bVar != null) {
            Bundle bundle = new Bundle();
            bundle.putSerializable("EVT_GET_METADATA", hashMap);
            bVar.onNotifyEvent(2028, bundle);
        }
    }

    @Override // com.tencent.liteav.basic.b.b
    public void onNotifyEvent(int i11, Bundle bundle) {
        int i12;
        com.tencent.liteav.basic.b.b bVar = this.mNotifyListener;
        if (bVar != null) {
            Bundle bundle2 = new Bundle();
            if (i11 == -2308) {
                bundle2.putString(TXLiveConstants.EVT_DESCRIPTION, "The server rejected the connection request");
            } else if (i11 == 2012) {
                byte[] byteArray = bundle.getByteArray(TXLiveConstants.EVT_GET_MSG);
                if (byteArray != null && byteArray.length > 0) {
                    bundle2.putByteArray(TXLiveConstants.EVT_GET_MSG, byteArray);
                }
            } else if (i11 == 2028 || i11 == 2031) {
                bundle2 = bundle;
            } else if (i11 == 2103) {
                bundle2.putString(TXLiveConstants.EVT_DESCRIPTION, "retry connecting stream server");
            } else if (i11 == 3010) {
                bundle2.putString(TXLiveConstants.EVT_DESCRIPTION, "No video at this stream address");
            } else if (i11 == -2302) {
                bundle2.putString(TXLiveConstants.EVT_DESCRIPTION, "Failed to get accelerated pull address");
            } else if (i11 == -2301) {
                bundle2.putString(TXLiveConstants.EVT_DESCRIPTION, "failed to connect server for several times, abort connection");
            } else if (i11 == 2001) {
                bundle2.putString(TXLiveConstants.EVT_DESCRIPTION, "connection SUCCESS");
            } else if (i11 == 2002) {
                bundle2.putString(TXLiveConstants.EVT_DESCRIPTION, "begin receiving stream");
            } else if (i11 == 3002) {
                bundle2.putString(TXLiveConstants.EVT_DESCRIPTION, "Failed to connect server");
            } else if (i11 == 3003) {
                bundle2.putString(TXLiveConstants.EVT_DESCRIPTION, "RTMP handshake failed");
            } else if (i11 == 3006) {
                bundle2.putString(TXLiveConstants.EVT_DESCRIPTION, "Write data error");
            } else if (i11 != 3007) {
                bundle2.putString(TXLiveConstants.EVT_DESCRIPTION, "UNKNOWN event = " + i11);
            } else {
                bundle2.putString(TXLiveConstants.EVT_DESCRIPTION, "Read data error");
            }
            String string = bundle != null ? bundle.getString(TXLiveConstants.EVT_DESCRIPTION, "") : "";
            if (string != null && !string.isEmpty()) {
                bundle2.putString(TXLiveConstants.EVT_DESCRIPTION, string);
            }
            bundle2.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
            bundle2.putLong(TXLiveConstants.EVT_UTC_TIME, TXCTimeUtil.getUtcTimeTick());
            bVar.onNotifyEvent(i11, bundle2);
            if (i11 == 3001 || i11 == 3002 || i11 == 3003 || i11 == 3004 || i11 == 3005 || i11 == 3006 || i11 == 3007 || i11 == 3008 || i11 == 3009 || i11 == 3010 || i11 == 2101 || i11 == 2102 || i11 == 2109 || i11 == 2110 || i11 == -2301 || i11 == -2304 || i11 == -2308 || i11 == -2309) {
                setStatusValue(7105, Integer.valueOf(i11));
                setStatusValue(7106, bundle2.getString(TXLiveConstants.EVT_DESCRIPTION));
            }
            i12 = 2001;
        } else {
            i12 = 2001;
        }
        if (i11 == i12) {
            reportNetStatusInternal();
        }
    }

    @Override // com.tencent.liteav.network.TXIStreamDownloader.a
    public void onOldStreamStop() {
        synchronized (this.mListenerLock) {
            try {
                d dVar = this.mStreamSwitcher;
                if (dVar != null) {
                    dVar.b();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.tencent.liteav.network.i
    public void onPullAudio(com.tencent.liteav.basic.structs.a aVar) {
        tryResetRetryCount();
        synchronized (this.mListenerLock) {
            try {
                i iVar = this.mListener;
                if (iVar != null) {
                    iVar.onPullAudio(aVar);
                }
                TXIStreamDownloader tXIStreamDownloader = this.mDownloader;
                if (tXIStreamDownloader != null) {
                    tXIStreamDownloader.PushAudioFrame(aVar.f43401f, aVar.f43403h, aVar.f43400e, aVar.f43402g);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.tencent.liteav.network.i
    public void onPullNAL(TXSNALPacket tXSNALPacket) {
        tryResetRetryCount();
        if (!this.mRecvFirstNal) {
            reportNetStatusInternal();
            this.mRecvFirstNal = true;
        }
        synchronized (this.mListenerLock) {
            try {
                long j11 = tXSNALPacket.pts;
                this.mCurrentNalTs = j11;
                if (tXSNALPacket.nalType == 0) {
                    this.mLastIFramelTs = j11;
                }
                i iVar = this.mListener;
                if (iVar != null) {
                    iVar.onPullNAL(tXSNALPacket);
                }
                TXIStreamDownloader tXIStreamDownloader = this.mDownloader;
                if (tXIStreamDownloader != null) {
                    tXIStreamDownloader.PushVideoFrame(tXSNALPacket.nalData, tXSNALPacket.nalType, tXSNALPacket.dts, tXSNALPacket.pts, tXSNALPacket.codecId);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.tencent.liteav.network.TXIStreamDownloader.a
    public void onRestartDownloader() {
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.tencent.liteav.network.TXCStreamDownloader.1
                @Override // java.lang.Runnable
                public void run() {
                    TXCStreamDownloader.this.stop();
                    TXCStreamDownloader tXCStreamDownloader = TXCStreamDownloader.this;
                    tXCStreamDownloader.start(tXCStreamDownloader.mOriginPlayUrl, TXCStreamDownloader.this.mEnableNearestIP, TXCStreamDownloader.this.mChannelType, TXCStreamDownloader.this.mEnableMessage, TXCStreamDownloader.this.mEnableMetaData);
                }
            });
        }
    }

    @Override // com.tencent.liteav.network.h
    public void onSEIMessage(byte[] bArr) {
        com.tencent.liteav.basic.b.b bVar = this.mNotifyListener;
        if (bVar != null) {
            Bundle bundle = new Bundle();
            bundle.putByteArray(TXLiveConstants.EVT_GET_MSG, bArr);
            bVar.onNotifyEvent(2012, bundle);
        }
    }

    @Override // com.tencent.liteav.network.d.a
    public void onSwitchFinish(TXIStreamDownloader tXIStreamDownloader, boolean z11) {
        synchronized (this.mListenerLock) {
            try {
                int currentTimeMillis = (int) (System.currentTimeMillis() - this.mSwitchStartTime);
                this.mSwitchStartTime = 0L;
                Bundle bundle = new Bundle();
                bundle.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
                bundle.putLong(TXLiveConstants.EVT_UTC_TIME, TXCTimeUtil.getUtcTimeTick());
                if (z11) {
                    this.mDownloader = tXIStreamDownloader;
                    tXIStreamDownloader.setListener(this);
                    this.mDownloader.setNotifyListener(this);
                    this.mDownloader.setRestartListener(this);
                    bundle.putInt("EVT_ID", 2015);
                    bundle.putCharSequence(TXLiveConstants.EVT_DESCRIPTION, "Switched resolution successfully");
                    com.tencent.liteav.basic.b.b bVar = this.mNotifyListener;
                    if (bVar != null) {
                        bVar.onNotifyEvent(2015, bundle);
                    }
                    TXCDRApi.txReportDAU(this.mApplicationContext, com.tencent.liteav.basic.datareport.a.f43326bx, currentTimeMillis, "");
                } else {
                    bundle.putInt("EVT_ID", -2307);
                    bundle.putCharSequence(TXLiveConstants.EVT_DESCRIPTION, "Failed to switch resolution");
                    com.tencent.liteav.basic.b.b bVar2 = this.mNotifyListener;
                    if (bVar2 != null) {
                        bVar2.onNotifyEvent(-2307, bundle);
                    }
                    TXCDRApi.txReportDAU(this.mApplicationContext, com.tencent.liteav.basic.datareport.a.by);
                }
                this.mStreamSwitcher = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void requestKeyFrame(String str) {
        TXIStreamDownloader tXIStreamDownloader;
        if (!this.mDownloaderRunning || str == null || !str.startsWith("room") || (tXIStreamDownloader = this.mDownloader) == null) {
            return;
        }
        tXIStreamDownloader.requestKeyFrame(str);
    }

    public void setFlvSessionKey(String str) {
        this.mFlvSessionKey = str;
        TXIStreamDownloader tXIStreamDownloader = this.mDownloader;
        if (tXIStreamDownloader != null) {
            tXIStreamDownloader.setFlvSessionKey(str);
        }
    }

    public void setHeaders(Map<String, String> map) {
        this.mHeaders = map;
        TXIStreamDownloader tXIStreamDownloader = this.mDownloader;
        if (tXIStreamDownloader != null) {
            tXIStreamDownloader.setHeaders(map);
        }
    }

    @Override // com.tencent.liteav.basic.module.a
    public void setID(String str) {
        super.setID(str);
        TXIStreamDownloader tXIStreamDownloader = this.mDownloader;
        if (tXIStreamDownloader != null) {
            tXIStreamDownloader.setUserID(str);
        }
    }

    public void setListener(i iVar) {
        synchronized (this.mListenerLock) {
            this.mListener = iVar;
        }
    }

    public void setNotifyListener(com.tencent.liteav.basic.b.b bVar) {
        synchronized (this.mListenerLock) {
            this.mNotifyListener = bVar;
        }
    }

    public void setPayloadType(int i11) {
        this.mPayLoadType = i11;
        TXIStreamDownloader tXIStreamDownloader = this.mDownloader;
        if (tXIStreamDownloader != null) {
            tXIStreamDownloader.setPayloadType(i11);
        }
    }

    public void setRetryInterval(int i11) {
        TXIStreamDownloader tXIStreamDownloader = this.mDownloader;
        if (tXIStreamDownloader != null) {
            tXIStreamDownloader.connectRetryInterval = i11;
        }
    }

    public void setRetryTimes(int i11) {
        TXIStreamDownloader tXIStreamDownloader = this.mDownloader;
        if (tXIStreamDownloader != null) {
            tXIStreamDownloader.connectRetryLimit = i11;
        }
    }

    public int start(final String str, boolean z11, int i11, final boolean z12, final boolean z13) {
        TXCLog.i(TAG, "start url:" + str + ",enableNearestIP:" + z11 + ",channeyType:" + i11 + ",enableMessage:" + z12 + ",enableMetaData:" + z13);
        this.mDownloaderRunning = true;
        this.mRecvFirstNal = false;
        this.mOriginPlayUrl = str;
        this.mEnableNearestIP = z11;
        this.mChannelType = i11;
        this.mEnableMessage = z12;
        this.mEnableMetaData = z13;
        setStatusValue(7113, 0L);
        setStatusValue(7114, 0L);
        setStatusValue(7115, 0L);
        if (str.startsWith("room")) {
            setStatusValue(7113, 1L);
            setStatusValue(7112, 2L);
            setStatusValue(7116, str);
            if (this.mDownloader != null) {
                Vector<e> vector = new Vector<>();
                vector.add(new e(str, true));
                this.mDownloader.setOriginUrl(str);
                this.mDownloader.setUserID(getID());
                this.mDownloader.startDownload(vector, false, false, z12, z13);
            }
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.postDelayed(this.mReportNetStatusRunnalbe, 2000L);
            }
            return 0;
        }
        if (!z11 || this.mDownloadFormat != 4) {
            if (this.mDownloader != null) {
                setStatusValue(7112, 1L);
                Vector<e> vector2 = new Vector<>();
                vector2.add(new e(str, false));
                this.mDownloader.setOriginUrl(str);
                this.mDownloader.startDownload(vector2, this.mDownloadFormat == 4, z11, z12, z13);
                Handler handler2 = this.mHandler;
                if (handler2 != null) {
                    handler2.postDelayed(this.mReportNetStatusRunnalbe, 2000L);
                }
            }
            return 0;
        }
        int a11 = this.mAccUrlFetcher.a(str, i11, new l.a() { // from class: com.tencent.liteav.network.TXCStreamDownloader.2
            @Override // com.tencent.liteav.network.l.a
            public void a(int i12, String str2, Vector<e> vector3) {
                String str3;
                if (i12 != 0 || vector3 == null || vector3.isEmpty()) {
                    TXCStreamDownloader.this.onNotifyEvent(-2302, null);
                    TXCDRApi.txReportDAU(TXCStreamDownloader.this.mApplicationContext, com.tencent.liteav.basic.datareport.a.f43296au, i12, str2);
                    TXCLog.e(TXCStreamDownloader.TAG, "getAccelerateStreamPlayUrl failed, play stream with raw url");
                    if (TXCStreamDownloader.this.mDownloaderRunning) {
                        TXCStreamDownloader.this.onNotifyEvent(-2301, null);
                        return;
                    }
                    return;
                }
                if (!TXCStreamDownloader.this.mDownloaderRunning) {
                    TXCDRApi.txReportDAU(TXCStreamDownloader.this.mApplicationContext, com.tencent.liteav.basic.datareport.a.f43296au, -4, "livePlayer have been stopped");
                    return;
                }
                if (TXCStreamDownloader.this.mDownloader != null) {
                    Iterator<e> it = vector3.iterator();
                    int i13 = 0;
                    while (it.hasNext()) {
                        e next = it.next();
                        if (next != null && next.f43772b && (str3 = next.f43771a) != null && str3.length() > 0) {
                            i13++;
                        }
                    }
                    TXCStreamDownloader.this.setStatusValue(7113, Long.valueOf(i13));
                    TXCStreamDownloader.this.setStatusValue(7112, 2L);
                    TXCStreamDownloader.this.mDownloader.setOriginUrl(str);
                    TXCStreamDownloader.this.mDownloader.startDownload(vector3, true, true, z12, z13);
                }
                if (TXCStreamDownloader.this.mHandler != null) {
                    TXCStreamDownloader.this.mHandler.postDelayed(TXCStreamDownloader.this.mReportNetStatusRunnalbe, 2000L);
                }
                TXCDRApi.txReportDAU(TXCStreamDownloader.this.mApplicationContext, com.tencent.liteav.basic.datareport.a.f43296au, i12, TXCStreamDownloader.this.mAccUrlFetcher.b());
            }
        });
        if (a11 != 0) {
            if (a11 == -1) {
                TXCDRApi.txReportDAU(this.mApplicationContext, com.tencent.liteav.basic.datareport.a.f43296au, a11, "invalid playUrl");
            } else if (a11 == -2) {
                TXCDRApi.txReportDAU(this.mApplicationContext, com.tencent.liteav.basic.datareport.a.f43296au, a11, "invalid streamID");
            } else if (a11 == -3) {
                TXCDRApi.txReportDAU(this.mApplicationContext, com.tencent.liteav.basic.datareport.a.f43296au, a11, "invalid signature");
            }
            TXCLog.e(TAG, "getAccelerateStreamPlayUrl failed, result = " + a11 + ", play stream with raw url");
            onNotifyEvent(-2302, null);
            onNotifyEvent(-2301, null);
        }
        return 0;
    }

    public void stop() {
        this.mDownloaderRunning = false;
        this.mRecvFirstNal = false;
        TXIStreamDownloader tXIStreamDownloader = this.mDownloader;
        if (tXIStreamDownloader != null) {
            tXIStreamDownloader.stopDownload();
        }
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mReportNetStatusRunnalbe);
        }
        synchronized (this.mListenerLock) {
            try {
                d dVar = this.mStreamSwitcher;
                if (dVar != null) {
                    dVar.a((i) null);
                    this.mStreamSwitcher.a();
                    this.mStreamSwitcher = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean switchStream(String str) {
        TXIStreamDownloader tXIStreamDownloader;
        synchronized (this.mListenerLock) {
            try {
                if (this.mStreamSwitcher == null && (tXIStreamDownloader = this.mDownloader) != null && (tXIStreamDownloader instanceof TXCFLVDownloader)) {
                    TXCFLVDownloader tXCFLVDownloader = new TXCFLVDownloader(this.mApplicationContext, (TXCFLVDownloader) tXIStreamDownloader);
                    TXIStreamDownloader tXIStreamDownloader2 = this.mDownloader;
                    tXCFLVDownloader.connectRetryLimit = tXIStreamDownloader2.connectRetryLimit;
                    tXCFLVDownloader.connectRetryInterval = tXIStreamDownloader2.connectRetryInterval;
                    tXCFLVDownloader.setHeaders(this.mHeaders);
                    tXCFLVDownloader.setUserID(getID());
                    tXCFLVDownloader.setFlvSessionKey(this.mFlvSessionKey);
                    tXCFLVDownloader.setMessageNotifyListener(this);
                    tXCFLVDownloader.setPayloadType(this.mPayLoadType);
                    d dVar = new d(this);
                    this.mStreamSwitcher = dVar;
                    dVar.a(this);
                    this.mStreamSwitcher.a(this.mDownloader, tXCFLVDownloader, this.mCurrentNalTs, this.mLastIFramelTs, str);
                    this.mSwitchStartTime = System.currentTimeMillis();
                    return true;
                }
                TXCLog.w(TAG, "stream_switch stream is changing ignore this change");
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

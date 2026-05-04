package com.tencent.liteav.network;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.baicizhan.main.vld.bonding.DeviceBondingActivityKt;
import com.huawei.hms.framework.common.ContainerUtils;
import com.huawei.hms.jos.apps.AppsStatusCodes;
import com.tencent.liteav.TXLiteAVCode;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.module.Monitor;
import com.tencent.liteav.basic.module.TXCEventRecorderProxy;
import com.tencent.liteav.basic.module.TXCStatus;
import com.tencent.liteav.basic.structs.TXSNALPacket;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import com.tencent.open.SocialConstants;
import com.tencent.rtmp.TXLiveConstants;
import java.lang.ref.WeakReference;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Vector;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class TXCStreamUploader extends com.tencent.liteav.basic.module.a implements com.tencent.liteav.network.b {
    public static final int RTMPSENDSTRATEGY_LIVE = 1;
    public static final int RTMPSENDSTRATEGY_REALTIME_QUIC = 3;
    public static final int RTMPSENDSTRATEGY_REALTIME_TCP = 2;
    static final String TAG = "TXCStreamUploader";
    public static final int TXE_UPLOAD_MODE_AUDIO_ONLY = 1;
    public static final int TXE_UPLOAD_MODE_LINK_MIC = 2;
    public static final int TXE_UPLOAD_MODE_REAL_TIME = 0;
    public static final int TXE_UPLOAD_PROTOCOL_AV = 1;
    public static final int TXE_UPLOAD_PROTOCOL_RTMP = 0;
    private Context mContext;
    private int mCurrentRecordIdx;
    private HandlerThread mHandlerThread;
    private c mIntelligentRoute;
    private ArrayList<com.tencent.liteav.network.a> mIpList;
    private boolean mIsPushing;
    private int mLastNetworkType;
    HashMap<String, String> mMetaData;
    private m mParam;
    private int mRetryCount;
    private String mRtmpUrl;
    private Thread mThread;
    private Object mThreadLock;
    private o mUploadQualityReport;
    private long mUploaderInstance;
    private boolean mQuicChannel = false;
    private int mChannelType = 0;
    private boolean mEnableNearestIP = true;
    private WeakReference<com.tencent.liteav.basic.b.b> mNotifyListener = null;
    private long mConnectSuccessTimeStamps = 0;
    private long mGoodPushTime = 30000;
    private Handler mHandler = null;
    private final int MSG_RECONNECT = 101;
    private final int MSG_EVENT = 102;
    private final int MSG_REPORT_STATUS = 103;
    private final int MSG_RTMPPROXY_HEARTBEAT = 104;
    private long mLastTimeStamp = 0;
    private UploadStats mLastUploadStats = null;
    private Vector<TXSNALPacket> mVecPendingNAL = new Vector<>();
    private int mConnectCountQuic = 0;
    private int mConnectCountTcp = 0;
    private boolean mRtmpProxyEnable = false;
    private boolean mAudioMuted = false;
    private a mRtmpProxyParam = new a();
    private Vector<String> mRtmpProxyIPList = new Vector<>();
    private int mRtmpProxyIPIndex = 0;
    private long mRtmpProxyInstance = 0;
    private long mRtmpMsgRecvThreadInstance = 0;
    private Object mRtmpProxyLock = new Object();
    private Object mRtmpMsgRecvThreadLock = new Object();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class RtmpProxyUserInfo {
        public String account = "";
        public String playUrl = "";
        public int stmType = 0;

        public RtmpProxyUserInfo() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class UploadStats {
        public long audioCacheLen;
        public long audioDropCount;
        public long bandwidthEst;
        public long channelType;
        public long connTS;
        public long connectTimeCost;
        public String connectionID;
        public String connectionStats;
        public long dnsTS;
        public long dnsparseTimeCost;
        public long handshakeTimeCost;
        public long inAudioBytes;
        public long inVideoBytes;
        public long outAudioBytes;
        public long outVideoBytes;
        public String serverIP;
        public long startTS;
        public long videoCacheLen;
        public long videoDropCount;

        public UploadStats() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a {

        /* renamed from: a, reason: collision with root package name */
        public long f43694a;

        /* renamed from: b, reason: collision with root package name */
        public long f43695b;

        /* renamed from: c, reason: collision with root package name */
        public String f43696c;

        /* renamed from: d, reason: collision with root package name */
        public long f43697d;

        /* renamed from: e, reason: collision with root package name */
        public String f43698e;

        /* renamed from: f, reason: collision with root package name */
        public long f43699f;

        /* renamed from: g, reason: collision with root package name */
        public long f43700g;

        /* renamed from: h, reason: collision with root package name */
        public String f43701h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f43702i;

        /* renamed from: j, reason: collision with root package name */
        public String f43703j;

        public a() {
        }

        public void a() {
            this.f43694a = 0L;
            this.f43695b = 0L;
            this.f43696c = "";
            this.f43697d = 0L;
            this.f43698e = "";
            this.f43699f = 0L;
            this.f43700g = 0L;
            this.f43702i = false;
            this.f43703j = "";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b {

        /* renamed from: a, reason: collision with root package name */
        public String f43705a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f43706b;

        public b(String str, boolean z11) {
            this.f43705a = str;
            this.f43706b = z11;
        }
    }

    static {
        com.tencent.liteav.basic.util.h.d();
    }

    public TXCStreamUploader(Context context, m mVar) {
        this.mUploaderInstance = 0L;
        this.mThread = null;
        this.mThreadLock = null;
        this.mIsPushing = false;
        this.mRtmpUrl = "";
        this.mIntelligentRoute = null;
        this.mLastNetworkType = 0;
        this.mContext = null;
        this.mIpList = null;
        this.mCurrentRecordIdx = 0;
        this.mRetryCount = 0;
        this.mHandlerThread = null;
        this.mParam = null;
        this.mUploadQualityReport = null;
        this.mContext = context;
        if (mVar == null) {
            mVar = new m();
            mVar.f43833a = 0;
            mVar.f43838f = 3;
            mVar.f43837e = 3;
            mVar.f43839g = 40;
            mVar.f43840h = 1000;
            mVar.f43841i = true;
        }
        this.mParam = mVar;
        this.mThreadLock = new Object();
        c cVar = new c();
        this.mIntelligentRoute = cVar;
        cVar.f43733a = this;
        this.mUploaderInstance = 0L;
        this.mRetryCount = 0;
        this.mCurrentRecordIdx = 0;
        this.mIpList = null;
        this.mIsPushing = false;
        this.mThread = null;
        this.mRtmpUrl = null;
        this.mLastNetworkType = 0;
        this.mHandlerThread = null;
        this.mUploadQualityReport = new o(context);
        n.a().a(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getAddressFromUrl(String str) {
        int indexOf;
        String substring;
        int indexOf2;
        return (str == null || (indexOf = str.indexOf("://")) == -1 || (indexOf2 = (substring = str.substring(indexOf + 3)).indexOf("/")) == -1) ? "" : substring.substring(0, indexOf2);
    }

    private boolean getNextRtmpProxyIP() {
        a aVar = this.mRtmpProxyParam;
        aVar.f43699f = 234L;
        aVar.f43700g = 80L;
        Vector<String> vector = this.mRtmpProxyIPList;
        if (vector == null || vector.size() <= 0) {
            return false;
        }
        if (this.mRtmpProxyIPIndex >= this.mRtmpProxyIPList.size()) {
            this.mRtmpProxyIPIndex = 0;
            return false;
        }
        String[] split = this.mRtmpUrl.split("://");
        if (split.length < 2) {
            return false;
        }
        String str = split[1];
        String substring = str.substring(str.indexOf("/"));
        String str2 = this.mRtmpProxyIPList.get(this.mRtmpProxyIPIndex);
        this.mRtmpProxyParam.f43701h = str2;
        this.mRtmpUrl = "room://" + str2 + substring;
        this.mQuicChannel = true;
        this.mRtmpProxyIPIndex = this.mRtmpProxyIPIndex + 1;
        return true;
    }

    private HashMap getParamsFromUrl(String str) {
        String str2;
        HashMap hashMap = new HashMap();
        String[] split = str.split("[?]");
        if (split != null && split.length >= 2 && (str2 = split[1]) != null && str2.length() != 0) {
            for (String str3 : split[1].split("[&]")) {
                if (str3.indexOf(ContainerUtils.KEY_VALUE_DELIMITER) != -1) {
                    String[] split2 = str3.split("[=]");
                    if (split2.length == 2) {
                        hashMap.put(split2[0], split2[1]);
                    }
                }
            }
        }
        return hashMap;
    }

    private b getRtmpRealConnectInfo() {
        int i11;
        if (!this.mEnableNearestIP) {
            return new b(this.mRtmpUrl, false);
        }
        ArrayList<com.tencent.liteav.network.a> arrayList = this.mIpList;
        if (arrayList == null) {
            return new b(this.mRtmpUrl, false);
        }
        if (this.mCurrentRecordIdx >= arrayList.size() || (i11 = this.mCurrentRecordIdx) < 0) {
            return new b(this.mRtmpUrl, false);
        }
        com.tencent.liteav.network.a aVar = this.mIpList.get(i11);
        String[] split = this.mRtmpUrl.split("://");
        if (split.length < 2) {
            return new b(this.mRtmpUrl, false);
        }
        String[] split2 = split[1].split("/");
        if (aVar.f43708a.split(":").length <= 1 || aVar.f43708a.startsWith("[")) {
            split2[0] = aVar.f43708a + ":" + aVar.f43709b;
        } else {
            split2[0] = "[" + aVar.f43708a + "]:" + aVar.f43709b;
        }
        StringBuilder sb2 = new StringBuilder(split2[0]);
        for (int i12 = 1; i12 < split2.length; i12++) {
            sb2.append("/");
            sb2.append(split2[i12]);
        }
        return new b(split[0] + "://" + sb2.toString(), aVar.f43710c);
    }

    private Long getSpeed(long j11, long j12, long j13) {
        if (j11 <= j12) {
            j12 -= j11;
        }
        return Long.valueOf(j13 > 0 ? (j12 * DeviceBondingActivityKt.f25227b) / (j13 * 1024) : 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void internalReconnect(boolean z11) {
        if (this.mIsPushing) {
            if (this.mRtmpProxyEnable) {
                if (this.mLastNetworkType != com.tencent.liteav.basic.util.h.d(this.mContext)) {
                    TXCLog.e(TAG, "reconnect network switch from " + this.mLastNetworkType + " to " + com.tencent.liteav.basic.util.h.d(this.mContext));
                    this.mLastNetworkType = com.tencent.liteav.basic.util.h.d(this.mContext);
                    this.mRetryCount = 0;
                    Monitor.a(2, "WebrtcRoom: need enter again by user", "", 0);
                    sendNotifyEvent(1021, String.format("Network type has changed. Need to re-enter the room", new Object[0]));
                    return;
                }
                int i11 = this.mRetryCount;
                if (i11 >= this.mParam.f43837e) {
                    if (!getNextRtmpProxyIP()) {
                        TXCEventRecorderProxy.a(this.mRtmpUrl, 91002, -1L, -1L, "connect rtmp-proxy server failed(try all addresses)", 0);
                        sendNotifyEvent(TXLiteAVCode.ERR_RTMP_PUSH_NET_ALLADDRESS_FAIL);
                        return;
                    } else {
                        this.mRetryCount = 0;
                        Monitor.a(2, String.format("Network: reconnecting to upload server with quic.[addr:%s][retryCount:%d][retryLimit:%d]", this.mRtmpProxyParam.f43701h, 0, Integer.valueOf(this.mParam.f43837e)), "", 0);
                        sendNotifyEvent(1102);
                        startPushTask(this.mRtmpUrl, this.mQuicChannel, 0);
                        return;
                    }
                }
                int i12 = i11 + 1;
                this.mRetryCount = i12;
                Monitor.a(2, String.format("Network: reconnecting to upload server with quic.[addr:%s][retryCount:%d][retryLimit:%d]", this.mRtmpProxyParam.f43701h, Integer.valueOf(i12), Integer.valueOf(this.mParam.f43837e)), "", 0);
                TXCEventRecorderProxy.a(this.mRtmpUrl, 91003, -1L, -1L, "reconnect rtmp-proxy server(econnect retry count:" + this.mRetryCount + " retry limit:" + this.mParam.f43837e + pn.j.f81007d, 0);
                sendNotifyEvent(1102);
                startPushTask(this.mRtmpUrl, this.mQuicChannel, 0);
                return;
            }
            this.mUploadQualityReport.c();
            if (this.mEnableNearestIP && this.mLastNetworkType != com.tencent.liteav.basic.util.h.d(this.mContext)) {
                TXCLog.e(TAG, "reconnect network switch from " + this.mLastNetworkType + " to " + com.tencent.liteav.basic.util.h.d(this.mContext));
                this.mLastNetworkType = com.tencent.liteav.basic.util.h.d(this.mContext);
                this.mIntelligentRoute.a(this.mRtmpUrl, this.mChannelType);
                this.mRetryCount = 0;
                return;
            }
            boolean z12 = !this.mEnableNearestIP ? false : z11;
            if (this.mQuicChannel) {
                z12 = true;
            }
            if (z12 && !nextRecordIdx(true)) {
                TXCLog.e(TAG, "reconnect: try all addresses failed");
                TXCEventRecorderProxy.a(this.mRtmpUrl, 91002, -1L, -1L, "connect upload server failed(try all addresses failed)", 0);
            }
            b rtmpRealConnectInfo = getRtmpRealConnectInfo();
            String addressFromUrl = getAddressFromUrl(rtmpRealConnectInfo.f43705a);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("reconnect change ip: ");
            sb2.append(addressFromUrl);
            sb2.append(" enableNearestIP: ");
            sb2.append(this.mEnableNearestIP);
            sb2.append(" last channel type: ");
            sb2.append(this.mQuicChannel ? "Q Channel" : "TCP");
            TXCLog.e(TAG, sb2.toString());
            if (this.mQuicChannel) {
                TXCLog.e(TAG, "reconnect last channel type is Q Channel，ignore retry limit");
                Monitor.a(2, String.format("Network: reconnecting to upload server with quic.[addr:%s]", addressFromUrl), "", 0);
                startPushTask(rtmpRealConnectInfo.f43705a, rtmpRealConnectInfo.f43706b, 0);
                sendNotifyEvent(1102);
                return;
            }
            TXCLog.e(TAG, "reconnect retry count:" + this.mRetryCount + " retry limit:" + this.mParam.f43837e);
            int i13 = this.mRetryCount;
            if (i13 >= this.mParam.f43837e) {
                TXCLog.e(TAG, "reconnect: try all times failed");
                TXCEventRecorderProxy.a(this.mRtmpUrl, 91002, -1L, -1L, "connect upload server failed(try all times failed)", 0);
                sendNotifyEvent(TXLiteAVCode.ERR_RTMP_PUSH_NET_ALLADDRESS_FAIL);
                return;
            }
            int i14 = i13 + 1;
            this.mRetryCount = i14;
            Monitor.a(2, String.format("Network: reconnecting to upload server with tcp.[addr:%s][retryCount:%d][retryLimit:%d]", addressFromUrl, Integer.valueOf(i14), Integer.valueOf(this.mParam.f43837e)), "", 0);
            TXCEventRecorderProxy.a(this.mRtmpUrl, 91003, -1L, -1L, "reconnect upload server:(retry count:" + this.mRetryCount + " retry limit:" + this.mParam.f43837e + pn.j.f81007d, 0);
            startPushTask(rtmpRealConnectInfo.f43705a, rtmpRealConnectInfo.f43706b, 0);
            sendNotifyEvent(1102);
        }
    }

    private boolean isQCloudStreamUrl(String str) {
        int indexOf;
        String substring;
        return (str == null || str.length() == 0 || (indexOf = str.indexOf("://")) == -1 || (substring = str.substring(indexOf + 3)) == null || !substring.startsWith("cloud.tencent.com")) ? false : true;
    }

    private native void nativeCacheJNIParams();

    private native void nativeEnableDrop(long j11, boolean z11);

    private native UploadStats nativeGetStats(long j11);

    /* JADX INFO: Access modifiers changed from: private */
    public native long nativeInitRtmpMsgRecvThreadInstance(long j11, long j12);

    /* JADX INFO: Access modifiers changed from: private */
    public native long nativeInitRtmpProxyInstance(long j11, long j12, String str, long j13, String str2, long j14, long j15, String str3, boolean z11, String str4);

    /* JADX INFO: Access modifiers changed from: private */
    public native long nativeInitUploader(String str, String str2, boolean z11, int i11, int i12, int i13, int i14, int i15, int i16, int i17, boolean z12, int i18, HashMap<String, String> hashMap);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeOnThreadRun(long j11);

    private native void nativePushAAC(long j11, byte[] bArr, long j12);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativePushNAL(long j11, byte[] bArr, int i11, long j12, long j13, long j14);

    private native void nativeReleaseJNIParams();

    private native void nativeRtmpMsgRecvThreadStart(long j11);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeRtmpMsgRecvThreadStop(long j11);

    private native void nativeRtmpProxyEnterRoom(long j11);

    private native void nativeRtmpProxyLeaveRoom(long j11);

    private native void nativeRtmpProxySendHeartBeat(long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j21, long j22);

    private native void nativeSendRtmpProxyMsg(long j11, byte[] bArr);

    private native void nativeSetSendStrategy(long j11, int i11, boolean z11);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeSetVideoDropParams(long j11, boolean z11, int i11, int i12);

    private native void nativeStopPush(long j11);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeUninitRtmpMsgRecvThreadInstance(long j11);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeUninitRtmpProxyInstance(long j11);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeUninitUploader(long j11);

    private boolean nextRecordIdx(boolean z11) {
        ArrayList<com.tencent.liteav.network.a> arrayList = this.mIpList;
        if (arrayList != null && arrayList.size() != 0) {
            if (z11) {
                this.mIpList.get(this.mCurrentRecordIdx).f43712e++;
            }
            if (this.mCurrentRecordIdx + 1 < this.mIpList.size()) {
                this.mCurrentRecordIdx++;
                return true;
            }
        }
        return false;
    }

    private void onRtmpProxyRoomEvent(int i11, int i12) {
        if (i11 == 1) {
            sendNotifyEvent(1018, String.format("Already in room，[%d]", Integer.valueOf(i12)));
        } else if (i11 == 2) {
            sendNotifyEvent(1019, String.format("Not in the room，[%d]", Integer.valueOf(i12)));
        }
    }

    private void onRtmpProxyUserListPushed(RtmpProxyUserInfo[] rtmpProxyUserInfoArr) {
        if (rtmpProxyUserInfoArr != null && this.mIsPushing && this.mRtmpProxyEnable && this.mRtmpProxyParam != null) {
            try {
                JSONArray jSONArray = new JSONArray();
                JSONArray jSONArray2 = new JSONArray();
                for (int i11 = 0; i11 < rtmpProxyUserInfoArr.length; i11++) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(uf.b.f92188c, rtmpProxyUserInfoArr[i11].account);
                    jSONObject.put(SocialConstants.PARAM_PLAY_URL, rtmpProxyUserInfoArr[i11].playUrl);
                    if (rtmpProxyUserInfoArr[i11].stmType == 0) {
                        jSONArray.put(jSONObject);
                    } else {
                        jSONArray2.put(jSONObject);
                    }
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("userlist", jSONArray);
                jSONObject2.put("userlist_aux", jSONArray2);
                sendNotifyEvent(1020, jSONObject2.toString());
            } catch (Exception e11) {
                TXCLog.e(TAG, "build json object failed.", e11);
            }
        }
    }

    private void onSendRtmpProxyMsg(byte[] bArr) {
        synchronized (this.mThreadLock) {
            try {
                long j11 = this.mUploaderInstance;
                if (j11 != 0) {
                    nativeSendRtmpProxyMsg(j11, bArr);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void parseProxyInfo(String str) {
        if (str == null || str.length() == 0 || !str.startsWith("room")) {
            return;
        }
        this.mRtmpProxyParam.f43702i = isQCloudStreamUrl(str);
        HashMap paramsFromUrl = getParamsFromUrl(str);
        if (paramsFromUrl == null) {
            return;
        }
        if (paramsFromUrl.containsKey("sdkappid")) {
            this.mRtmpProxyParam.f43694a = Long.valueOf((String) paramsFromUrl.get("sdkappid")).longValue();
        }
        if (paramsFromUrl.containsKey("roomid") && paramsFromUrl.containsKey(uf.b.f92188c) && paramsFromUrl.containsKey("roomsig")) {
            this.mRtmpProxyParam.f43697d = Long.valueOf((String) paramsFromUrl.get("roomid")).longValue();
            this.mRtmpProxyParam.f43696c = (String) paramsFromUrl.get(uf.b.f92188c);
            if (paramsFromUrl.containsKey("bizbuf")) {
                try {
                    this.mRtmpProxyParam.f43703j = URLDecoder.decode((String) paramsFromUrl.get("bizbuf"), "UTF-8");
                } catch (Exception e11) {
                    TXCLog.e(TAG, "decode bizbuf failed.", e11);
                }
            }
            try {
                JSONObject jSONObject = new JSONObject(URLDecoder.decode((String) paramsFromUrl.get("roomsig"), "UTF-8"));
                this.mRtmpProxyParam.f43695b = 0L;
                if (jSONObject.has("Key")) {
                    this.mRtmpProxyParam.f43698e = jSONObject.optString("Key");
                    JSONObject optJSONObject = jSONObject.optJSONObject("RtmpProxy");
                    if (optJSONObject == null || (optJSONObject.has("Ip") && optJSONObject.has("Port") && optJSONObject.has("Type"))) {
                        JSONArray optJSONArray = jSONObject.optJSONArray("AccessList");
                        if (optJSONArray != null && optJSONArray.length() > 0) {
                            for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                                JSONObject jSONObject2 = optJSONArray.getJSONObject(i11);
                                if (jSONObject2 != null && jSONObject2.has("Ip") && jSONObject2.has("Port") && jSONObject2.has("Type")) {
                                    String optString = jSONObject2.optString("Ip");
                                    long optLong = jSONObject2.optLong("Port");
                                    if (jSONObject2.optLong("Type") == 2) {
                                        this.mRtmpProxyIPList.add(optString + ":" + optLong);
                                    }
                                }
                            }
                        }
                        if (!this.mRtmpProxyParam.f43702i) {
                            this.mRtmpUrl = str;
                            this.mQuicChannel = false;
                        } else {
                            if (optJSONObject == null) {
                                return;
                            }
                            this.mRtmpUrl = str.substring(0, str.indexOf("?")) + "/webrtc/" + (this.mRtmpProxyParam.f43694a + "_" + this.mRtmpProxyParam.f43697d + "_" + this.mRtmpProxyParam.f43696c) + "?real_rtmp_ip=" + optJSONObject.optString("Ip") + "&real_rtmp_port=" + optJSONObject.optLong("Port") + "&tinyid=" + this.mRtmpProxyParam.f43695b + "&srctinyid=0";
                            getNextRtmpProxyIP();
                        }
                        this.mRtmpProxyEnable = true;
                    }
                }
            } catch (Exception e12) {
                TXCLog.e(TAG, "parse proxy info failed.", e12);
            }
        }
    }

    private void postReconnectMsg(String str, boolean z11, int i11) {
        Message message = new Message();
        message.what = 101;
        message.obj = str;
        message.arg1 = z11 ? 2 : 1;
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.sendMessageDelayed(message, i11);
        }
    }

    private void reconnect(final boolean z11) {
        stopPushTask();
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.postDelayed(new Runnable() { // from class: com.tencent.liteav.network.TXCStreamUploader.3
                @Override // java.lang.Runnable
                public void run() {
                    TXCStreamUploader.this.internalReconnect(z11);
                }
            }, this.mParam.f43838f * 1000);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reportNetStatus() {
        long j11;
        long j12;
        long j13;
        long timeTick = TXCTimeUtil.getTimeTick();
        long j14 = timeTick - this.mLastTimeStamp;
        UploadStats uploadStats = getUploadStats();
        long j15 = 0;
        if (uploadStats != null) {
            UploadStats uploadStats2 = this.mLastUploadStats;
            if (uploadStats2 != null) {
                long longValue = getSpeed(uploadStats2.inVideoBytes, uploadStats.inVideoBytes, j14).longValue();
                j12 = getSpeed(this.mLastUploadStats.inAudioBytes, uploadStats.inAudioBytes, j14).longValue();
                j13 = getSpeed(this.mLastUploadStats.outVideoBytes, uploadStats.outVideoBytes, j14).longValue();
                j11 = getSpeed(this.mLastUploadStats.outAudioBytes, uploadStats.outAudioBytes, j14).longValue();
                j15 = longValue;
            } else {
                j11 = 0;
                j12 = 0;
                j13 = 0;
            }
            setStatusValue(7005, Long.valueOf(uploadStats.videoCacheLen));
            setStatusValue(AppsStatusCodes.APP_STATE_NO_SUPPORT, Long.valueOf(uploadStats.audioCacheLen));
            setStatusValue(7007, Long.valueOf(uploadStats.videoDropCount));
            setStatusValue(7008, Long.valueOf(uploadStats.audioDropCount));
            setStatusValue(7021, Long.valueOf(uploadStats.bandwidthEst));
            setStatusValue(7009, Long.valueOf(uploadStats.startTS));
            setStatusValue(7010, Long.valueOf(uploadStats.dnsTS));
            setStatusValue(7011, Long.valueOf(uploadStats.connTS));
            setStatusValue(7012, String.valueOf(uploadStats.serverIP));
            setStatusValue(AppsStatusCodes.APP_STATE_NOT_LOGIN, Long.valueOf(this.mQuicChannel ? 2L : 1L));
            setStatusValue(7014, uploadStats.connectionID);
            setStatusValue(7015, uploadStats.connectionStats);
            this.mUploadQualityReport.a(uploadStats.videoDropCount, uploadStats.audioDropCount);
            this.mUploadQualityReport.b(uploadStats.videoCacheLen, uploadStats.audioCacheLen);
        } else {
            setStatusValue(7005, 0L);
            setStatusValue(AppsStatusCodes.APP_STATE_NO_SUPPORT, 0L);
            setStatusValue(7007, 0L);
            setStatusValue(7008, 0L);
            j11 = 0;
            j12 = 0;
            j13 = 0;
        }
        setStatusValue(7001, Long.valueOf(j15));
        setStatusValue(AppsStatusCodes.APP_STATE_NETWORK_ERROR, Long.valueOf(j12));
        setStatusValue(7003, Long.valueOf(j13));
        setStatusValue(7004, Long.valueOf(j11));
        this.mLastTimeStamp = timeTick;
        this.mLastUploadStats = uploadStats;
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.sendEmptyMessageDelayed(103, 2000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void rtmpProxySendHeartBeat() {
        int[] a11 = com.tencent.liteav.basic.util.h.a();
        long j11 = a11[0] / 10;
        long j12 = a11[1] / 10;
        long c11 = TXCStatus.c(getID(), 7004);
        long c12 = TXCStatus.c(getID(), 7003);
        long c13 = TXCStatus.c(getID(), 1001);
        long c14 = TXCStatus.c(getID(), 4001);
        long c15 = TXCStatus.c(getID(), AppsStatusCodes.APP_STATE_NO_SUPPORT);
        long c16 = TXCStatus.c(getID(), 7005);
        long c17 = TXCStatus.c(getID(), 7008);
        long c18 = TXCStatus.c(getID(), 7007);
        synchronized (this.mRtmpProxyLock) {
            nativeRtmpProxySendHeartBeat(this.mRtmpProxyInstance, j11, j12, c11, c12, c13, c14, c15, c16, c17, c18);
        }
    }

    private void sendNotifyEvent(int i11, String str) {
        if (str == null || str.isEmpty()) {
            sendNotifyEvent(i11);
        } else {
            Bundle bundle = new Bundle();
            bundle.putString(TXLiveConstants.EVT_DESCRIPTION, str);
            bundle.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
            bundle.putLong(TXLiveConstants.EVT_UTC_TIME, TXCTimeUtil.getUtcTimeTick());
            com.tencent.liteav.basic.util.h.a(this.mNotifyListener, i11, bundle);
        }
        if (i11 != 1002) {
            if (i11 == 1101) {
                this.mUploadQualityReport.d();
            }
        } else {
            UploadStats uploadStats = getUploadStats();
            if (uploadStats != null) {
                this.mUploadQualityReport.a(uploadStats.dnsparseTimeCost, uploadStats.connectTimeCost, uploadStats.handshakeTimeCost);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startPushTask(final String str, final boolean z11, int i11) {
        TXCLog.i(TAG, "start push task");
        boolean z12 = this.mQuicChannel;
        if (z12 != z11 && z12) {
            Monitor.a(2, String.format("Network: switch push channel from quic to tcp.[retryCount:%d][retryLimit:%d]", Integer.valueOf(this.mRetryCount), Integer.valueOf(this.mParam.f43837e)), "", 0);
        }
        if (z11) {
            int i12 = this.mConnectCountQuic + 1;
            this.mConnectCountQuic = i12;
            setStatusValue(7017, Long.valueOf(i12));
        } else {
            int i13 = this.mConnectCountTcp + 1;
            this.mConnectCountTcp = i13;
            setStatusValue(7018, Long.valueOf(i13));
        }
        Thread thread = new Thread("RTMPUpload") { // from class: com.tencent.liteav.network.TXCStreamUploader.2
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                while (TXCStreamUploader.this.mUploaderInstance != 0) {
                    try {
                        Thread.sleep(100L, 0);
                    } catch (InterruptedException unused) {
                    }
                }
                TXCStreamUploader.this.mUploadQualityReport.b();
                TXCStreamUploader.this.mUploadQualityReport.a(TXCStreamUploader.this.mParam.f43842j);
                TXCStreamUploader.this.mUploadQualityReport.a(TXCStreamUploader.this.mRtmpUrl);
                TXCStreamUploader.this.mUploadQualityReport.a(z11, TXCStreamUploader.this.getAddressFromUrl(str));
                synchronized (TXCStreamUploader.this.mThreadLock) {
                    try {
                        TXCStreamUploader.this.mQuicChannel = z11;
                        int i14 = TXCStreamUploader.this.mParam.f43842j ? TXCStreamUploader.this.mQuicChannel ? 3 : 2 : 1;
                        if (TXCStreamUploader.this.mRtmpProxyEnable) {
                            if (TXCStreamUploader.this.mAudioMuted) {
                                TXCStreamUploader.this.mParam.f43843k = false;
                            }
                        } else if (TXCStreamUploader.this.mIpList == null || TXCStreamUploader.this.mIpList.size() == 0) {
                            i14 = 1;
                        }
                        TXCStreamUploader.this.setStatusValue(7020, Long.valueOf(i14));
                        TXCStreamUploader tXCStreamUploader = TXCStreamUploader.this;
                        tXCStreamUploader.mUploaderInstance = tXCStreamUploader.nativeInitUploader(tXCStreamUploader.mRtmpUrl, str, z11, TXCStreamUploader.this.mParam.f43836d, TXCStreamUploader.this.mParam.f43835c, TXCStreamUploader.this.mParam.f43833a, TXCStreamUploader.this.mParam.f43834b, TXCStreamUploader.this.mParam.f43839g, 16, i14, TXCStreamUploader.this.mParam.f43843k, TXCStreamUploader.this.mParam.f43844l, TXCStreamUploader.this.mMetaData);
                        if (TXCStreamUploader.this.mUploaderInstance != 0) {
                            TXCStreamUploader tXCStreamUploader2 = TXCStreamUploader.this;
                            tXCStreamUploader2.nativeSetVideoDropParams(tXCStreamUploader2.mUploaderInstance, TXCStreamUploader.this.mParam.f43841i, TXCStreamUploader.this.mParam.f43839g, TXCStreamUploader.this.mParam.f43840h);
                            Iterator it = TXCStreamUploader.this.mVecPendingNAL.iterator();
                            boolean z13 = false;
                            while (it.hasNext()) {
                                TXSNALPacket tXSNALPacket = (TXSNALPacket) it.next();
                                if (!z13 && tXSNALPacket.nalType == 0) {
                                    z13 = true;
                                }
                                if (z13) {
                                    TXCStreamUploader tXCStreamUploader3 = TXCStreamUploader.this;
                                    tXCStreamUploader3.nativePushNAL(tXCStreamUploader3.mUploaderInstance, tXSNALPacket.nalData, tXSNALPacket.nalType, tXSNALPacket.frameIndex, tXSNALPacket.pts, tXSNALPacket.dts);
                                }
                            }
                            TXCStreamUploader.this.mVecPendingNAL.removeAllElements();
                        }
                    } finally {
                    }
                }
                if (TXCStreamUploader.this.mRtmpProxyEnable) {
                    synchronized (TXCStreamUploader.this.mRtmpProxyLock) {
                        TXCStreamUploader tXCStreamUploader4 = TXCStreamUploader.this;
                        tXCStreamUploader4.mRtmpProxyInstance = tXCStreamUploader4.nativeInitRtmpProxyInstance(tXCStreamUploader4.mRtmpProxyParam.f43694a, TXCStreamUploader.this.mRtmpProxyParam.f43695b, TXCStreamUploader.this.mRtmpProxyParam.f43696c, TXCStreamUploader.this.mRtmpProxyParam.f43697d, TXCStreamUploader.this.mRtmpProxyParam.f43698e, TXCStreamUploader.this.mRtmpProxyParam.f43699f, TXCStreamUploader.this.mRtmpProxyParam.f43700g, TXCStreamUploader.this.mRtmpProxyParam.f43701h, TXCStreamUploader.this.mRtmpProxyParam.f43702i, TXCStreamUploader.this.mRtmpProxyParam.f43703j);
                    }
                    synchronized (TXCStreamUploader.this.mRtmpMsgRecvThreadLock) {
                        TXCStreamUploader tXCStreamUploader5 = TXCStreamUploader.this;
                        tXCStreamUploader5.mRtmpMsgRecvThreadInstance = tXCStreamUploader5.nativeInitRtmpMsgRecvThreadInstance(tXCStreamUploader5.mRtmpProxyInstance, TXCStreamUploader.this.mUploaderInstance);
                    }
                }
                TXCStreamUploader tXCStreamUploader6 = TXCStreamUploader.this;
                tXCStreamUploader6.nativeOnThreadRun(tXCStreamUploader6.mUploaderInstance);
                if (TXCStreamUploader.this.mRtmpProxyEnable) {
                    synchronized (TXCStreamUploader.this.mRtmpMsgRecvThreadLock) {
                        TXCStreamUploader tXCStreamUploader7 = TXCStreamUploader.this;
                        tXCStreamUploader7.nativeRtmpMsgRecvThreadStop(tXCStreamUploader7.mRtmpMsgRecvThreadInstance);
                        TXCStreamUploader tXCStreamUploader8 = TXCStreamUploader.this;
                        tXCStreamUploader8.nativeUninitRtmpMsgRecvThreadInstance(tXCStreamUploader8.mRtmpMsgRecvThreadInstance);
                        TXCStreamUploader.this.mRtmpMsgRecvThreadInstance = 0L;
                    }
                    synchronized (TXCStreamUploader.this.mRtmpProxyLock) {
                        TXCStreamUploader tXCStreamUploader9 = TXCStreamUploader.this;
                        tXCStreamUploader9.nativeUninitRtmpProxyInstance(tXCStreamUploader9.mRtmpProxyInstance);
                        TXCStreamUploader.this.mRtmpProxyInstance = 0L;
                    }
                }
                synchronized (TXCStreamUploader.this.mThreadLock) {
                    TXCStreamUploader tXCStreamUploader10 = TXCStreamUploader.this;
                    tXCStreamUploader10.nativeUninitUploader(tXCStreamUploader10.mUploaderInstance);
                    TXCStreamUploader.this.mUploaderInstance = 0L;
                }
            }
        };
        this.mThread = thread;
        thread.start();
    }

    private void stopPushTask() {
        TXCLog.i(TAG, "stop push task");
        synchronized (this.mThreadLock) {
            this.mVecPendingNAL.removeAllElements();
            nativeStopPush(this.mUploaderInstance);
        }
    }

    private void tryResetRetryCount() {
        if (this.mConnectSuccessTimeStamps != 0) {
            long timeTick = TXCTimeUtil.getTimeTick() - this.mConnectSuccessTimeStamps;
            m mVar = this.mParam;
            if (timeTick > mVar.f43837e * (mVar.f43838f + 13) * 1000) {
                this.mRetryCount = 0;
                this.mConnectSuccessTimeStamps = 0L;
                TXCLog.i(TAG, "reset retry count");
            }
        }
    }

    public String getConfusionIP(String str) {
        int indexOf;
        String substring;
        int indexOf2;
        if (str == null || (indexOf = str.indexOf(".")) == -1 || (indexOf2 = (substring = str.substring(indexOf + 1)).indexOf(".")) == -1) {
            return str;
        }
        return "A.B." + substring.substring(indexOf2 + 1);
    }

    public UploadStats getUploadStats() {
        UploadStats nativeGetStats;
        synchronized (this.mThreadLock) {
            try {
                nativeGetStats = nativeGetStats(this.mUploaderInstance);
                if (nativeGetStats != null) {
                    nativeGetStats.channelType = this.mQuicChannel ? 2L : 1L;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return nativeGetStats;
    }

    public int init() {
        return 0;
    }

    @Override // com.tencent.liteav.network.b
    public void onFetchDone(int i11, ArrayList<com.tencent.liteav.network.a> arrayList) {
        String str;
        if (this.mIsPushing) {
            if (i11 == 1) {
                TXCLog.w(TAG, "onFetchDone: Network connection failed. Invalid push url!");
                sendNotifyEvent(-1313, "Network connection failed. Invalid push url!");
                return;
            }
            if (i11 != 0 || arrayList == null || arrayList.size() <= 0) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("onFetchDone: code = ");
                sb2.append(i11);
                sb2.append(" ip count = ");
                sb2.append(arrayList != null ? arrayList.size() : 0);
                TXCLog.i(TAG, sb2.toString());
            } else {
                TXCLog.i(TAG, "onFetchDone: connect success, ip count = " + arrayList.size());
                this.mIpList = arrayList;
                this.mCurrentRecordIdx = 0;
                Iterator<com.tencent.liteav.network.a> it = arrayList.iterator();
                String str2 = "";
                int i12 = 0;
                while (it.hasNext()) {
                    com.tencent.liteav.network.a next = it.next();
                    if (next != null && next.f43710c && (str = next.f43708a) != null && str.length() > 0) {
                        i12++;
                    }
                    if (next != null) {
                        str2 = str2 + " " + getConfusionIP(next.f43708a) + ":" + next.f43709b;
                    }
                }
                setStatusValue(7016, Long.valueOf(i12));
                setStatusValue(AppsStatusCodes.APP_STATE_ACCOUNT_NOT_MATCH, "{" + str2 + " }");
            }
            b rtmpRealConnectInfo = getRtmpRealConnectInfo();
            postReconnectMsg(rtmpRealConnectInfo.f43705a, rtmpRealConnectInfo.f43706b, 0);
        }
    }

    public void pushAAC(byte[] bArr, long j11) {
        tryResetRetryCount();
        synchronized (this.mThreadLock) {
            try {
                if (!this.mAudioMuted || !this.mRtmpProxyEnable) {
                    nativePushAAC(this.mUploaderInstance, bArr, j11);
                }
            } finally {
            }
        }
    }

    public void pushNAL(TXSNALPacket tXSNALPacket) {
        byte[] bArr;
        tryResetRetryCount();
        synchronized (this.mThreadLock) {
            try {
                try {
                    long j11 = this.mUploaderInstance;
                    if (j11 == 0) {
                        if (tXSNALPacket.nalType == 0) {
                            this.mVecPendingNAL.removeAllElements();
                        }
                        this.mVecPendingNAL.add(tXSNALPacket);
                    } else if (tXSNALPacket != null && (bArr = tXSNALPacket.nalData) != null && bArr.length > 0) {
                        nativePushNAL(j11, bArr, tXSNALPacket.nalType, tXSNALPacket.frameIndex, tXSNALPacket.pts, tXSNALPacket.dts);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                throw th;
            }
        }
    }

    public void setAudioInfo(int i11, int i12) {
        m mVar = this.mParam;
        if (mVar != null) {
            mVar.f43835c = i12;
            mVar.f43836d = i11;
        }
    }

    public void setAudioMute(boolean z11) {
        synchronized (this.mThreadLock) {
            try {
                this.mAudioMuted = z11;
                if (this.mRtmpProxyEnable) {
                    long j11 = this.mUploaderInstance;
                    if (j11 != 0) {
                        nativeSetSendStrategy(j11, this.mParam.f43842j ? this.mQuicChannel ? 3 : 2 : 1, false);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void setDropEanble(boolean z11) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("drop enable ");
        sb2.append(z11 ? ma.b.H0 : ma.b.I0);
        TXCLog.i(TAG, sb2.toString());
        synchronized (this.mThreadLock) {
            nativeEnableDrop(this.mUploaderInstance, z11);
        }
    }

    public void setMetaData(HashMap<String, String> hashMap) {
        this.mMetaData = hashMap;
    }

    public void setMode(int i11) {
        m mVar = this.mParam;
        if (mVar != null) {
            mVar.f43833a = i11;
        }
    }

    public void setNotifyListener(com.tencent.liteav.basic.b.b bVar) {
        this.mNotifyListener = new WeakReference<>(bVar);
    }

    public void setRetryInterval(int i11) {
        m mVar = this.mParam;
        if (mVar != null) {
            mVar.f43838f = i11;
        }
    }

    public void setRetryTimes(int i11) {
        m mVar = this.mParam;
        if (mVar != null) {
            mVar.f43837e = i11;
        }
    }

    public void setSendStrategy(boolean z11, boolean z12) {
        ArrayList<com.tencent.liteav.network.a> arrayList;
        m mVar = this.mParam;
        mVar.f43842j = z11;
        mVar.f43843k = z12;
        this.mUploadQualityReport.a(z11);
        int i11 = 1;
        int i12 = z11 ? this.mQuicChannel ? 3 : 2 : 1;
        if (this.mRtmpProxyEnable || ((arrayList = this.mIpList) != null && arrayList.size() != 0)) {
            i11 = i12;
        }
        synchronized (this.mThreadLock) {
            try {
                long j11 = this.mUploaderInstance;
                if (j11 != 0) {
                    nativeSetSendStrategy(j11, i11, z12);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        setStatusValue(7020, Long.valueOf(i11));
    }

    public void setVideoDropParams(boolean z11, int i11, int i12) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("drop params wait i frame:");
        sb2.append(z11 ? ma.b.H0 : ma.b.I0);
        sb2.append(" max video count:");
        sb2.append(i11);
        sb2.append(" max video cache time: ");
        sb2.append(i12);
        sb2.append(" ms");
        TXCLog.i(TAG, sb2.toString());
        synchronized (this.mThreadLock) {
            try {
                m mVar = this.mParam;
                mVar.f43841i = z11;
                mVar.f43839g = i11;
                mVar.f43840h = i12;
                long j11 = this.mUploaderInstance;
                if (j11 != 0) {
                    nativeSetVideoDropParams(j11, z11, i11, i12);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public String start(String str, boolean z11, int i11) {
        if (this.mIsPushing) {
            return this.mRtmpUrl;
        }
        this.mIsPushing = true;
        this.mConnectSuccessTimeStamps = 0L;
        this.mRetryCount = 0;
        this.mRtmpUrl = str;
        this.mChannelType = i11;
        this.mConnectCountQuic = 0;
        this.mConnectCountTcp = 0;
        this.mRtmpProxyEnable = false;
        this.mRtmpProxyParam.a();
        this.mRtmpProxyIPList.clear();
        this.mRtmpProxyIPIndex = 0;
        this.mRtmpProxyInstance = 0L;
        this.mRtmpMsgRecvThreadInstance = 0L;
        setStatusValue(7016, 0L);
        setStatusValue(7017, 0L);
        setStatusValue(7018, 0L);
        this.mUploadQualityReport.a();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("start push with url:");
        sb2.append(this.mRtmpUrl);
        sb2.append(" enable nearest ip:");
        sb2.append(z11 ? ma.b.H0 : ma.b.I0);
        sb2.append("channel type:");
        sb2.append(i11);
        TXCLog.i(TAG, sb2.toString());
        if (com.tencent.liteav.basic.util.h.d(this.mContext) == 0) {
            sendNotifyEvent(TXLiteAVCode.ERR_RTMP_PUSH_NO_NETWORK);
            return this.mRtmpUrl;
        }
        this.mEnableNearestIP = z11;
        if (this.mHandlerThread == null) {
            HandlerThread handlerThread = new HandlerThread("RTMP_PUSH");
            this.mHandlerThread = handlerThread;
            handlerThread.start();
        }
        this.mHandler = new Handler(this.mHandlerThread.getLooper()) { // from class: com.tencent.liteav.network.TXCStreamUploader.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                int i12 = message.what;
                if (i12 == 101) {
                    TXCStreamUploader.this.startPushTask((String) message.obj, message.arg1 == 2, 0);
                    return;
                }
                if (i12 == 103) {
                    TXCStreamUploader.this.reportNetStatus();
                } else {
                    if (i12 != 104) {
                        return;
                    }
                    TXCStreamUploader.this.rtmpProxySendHeartBeat();
                    if (TXCStreamUploader.this.mHandler != null) {
                        TXCStreamUploader.this.mHandler.sendEmptyMessageDelayed(104, 2000L);
                    }
                }
            }
        };
        parseProxyInfo(str);
        if (this.mRtmpProxyEnable) {
            this.mLastNetworkType = com.tencent.liteav.basic.util.h.d(this.mContext);
            nativeCacheJNIParams();
            startPushTask(this.mRtmpUrl, this.mQuicChannel, 0);
        } else if (!this.mEnableNearestIP || this.mLastNetworkType == com.tencent.liteav.basic.util.h.d(this.mContext)) {
            startPushTask(this.mRtmpUrl, this.mQuicChannel, 0);
        } else {
            TXCLog.i(TAG, "fetching nearest ip list");
            this.mLastNetworkType = com.tencent.liteav.basic.util.h.d(this.mContext);
            this.mIntelligentRoute.a(str, i11);
        }
        this.mHandler.sendEmptyMessageDelayed(103, 2000L);
        return this.mRtmpUrl;
    }

    public void stop() {
        if (this.mIsPushing) {
            this.mIsPushing = false;
            TXCLog.i(TAG, "stop push");
            if (this.mRtmpProxyEnable) {
                synchronized (this.mRtmpProxyLock) {
                    nativeRtmpProxyLeaveRoom(this.mRtmpProxyInstance);
                }
            }
            synchronized (this.mThreadLock) {
                nativeStopPush(this.mUploaderInstance);
            }
            HandlerThread handlerThread = this.mHandlerThread;
            if (handlerThread != null) {
                handlerThread.getLooper().quit();
                this.mHandlerThread = null;
            }
            if (this.mHandler != null) {
                this.mHandler = null;
            }
            if (this.mRtmpProxyEnable) {
                nativeReleaseJNIParams();
            }
            this.mUploadQualityReport.c();
            this.mUploadQualityReport.a();
        }
    }

    private void sendNotifyEvent(int i11) {
        if (i11 == 0) {
            reconnect(false);
            return;
        }
        if (i11 == 1) {
            reconnect(true);
            return;
        }
        if (i11 == 1001) {
            this.mConnectSuccessTimeStamps = TXCTimeUtil.getTimeTick();
        }
        if (i11 == 1026) {
            if (this.mRtmpProxyEnable) {
                synchronized (this.mRtmpMsgRecvThreadLock) {
                    nativeRtmpMsgRecvThreadStart(this.mRtmpMsgRecvThreadInstance);
                }
                synchronized (this.mRtmpProxyLock) {
                    nativeRtmpProxyEnterRoom(this.mRtmpProxyInstance);
                }
                Handler handler = this.mHandler;
                if (handler != null) {
                    handler.sendEmptyMessageDelayed(104, 2000L);
                    return;
                }
                return;
            }
            return;
        }
        if (this.mNotifyListener != null) {
            Bundle bundle = new Bundle();
            if (i11 == -2308) {
                bundle.putString(TXLiveConstants.EVT_DESCRIPTION, "The server rejects the connection request. It may be that the push URL has been occupied or expired, or the anti-leech link is wrong.");
            } else if (i11 == -1307) {
                bundle.putString(TXLiveConstants.EVT_DESCRIPTION, "failed to connect server for several times, abort connection");
            } else {
                if (i11 == 1026) {
                    if (this.mRtmpProxyEnable) {
                        synchronized (this.mRtmpMsgRecvThreadLock) {
                            nativeRtmpMsgRecvThreadStart(this.mRtmpMsgRecvThreadInstance);
                        }
                        synchronized (this.mRtmpProxyLock) {
                            nativeRtmpProxyEnterRoom(this.mRtmpProxyInstance);
                        }
                        Handler handler2 = this.mHandler;
                        if (handler2 != null) {
                            handler2.sendEmptyMessageDelayed(104, 2000L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (i11 == 3003) {
                    bundle.putString(TXLiveConstants.EVT_DESCRIPTION, "RTMP servers handshake failed");
                } else if (i11 == -1325) {
                    bundle.putString(TXLiveConstants.EVT_DESCRIPTION, "No internet. Please check if WiFi or mobile data is turned on");
                } else if (i11 == -1324) {
                    bundle.putString(TXLiveConstants.EVT_DESCRIPTION, "Failed to connect all IPs, abort connection.");
                } else if (i11 == 1001) {
                    bundle.putString(TXLiveConstants.EVT_DESCRIPTION, "Already connected to rtmp server");
                } else if (i11 == 1002) {
                    bundle.putString(TXLiveConstants.EVT_DESCRIPTION, "rtmp start push stream");
                } else if (i11 == 1101) {
                    bundle.putString(TXLiveConstants.EVT_DESCRIPTION, "Insufficient upstream bandwidth. Data transmission is not timely");
                } else if (i11 == 1102) {
                    bundle.putString(TXLiveConstants.EVT_DESCRIPTION, "Enables network reconnection");
                } else if (i11 == 3008) {
                    bundle.putString(TXLiveConstants.EVT_DESCRIPTION, "No data is sent for more than 30s. Actively disconnect");
                } else if (i11 != 3009) {
                    bundle.putString(TXLiveConstants.EVT_DESCRIPTION, "UNKNOWN");
                } else {
                    bundle.putString(TXLiveConstants.EVT_DESCRIPTION, "Failed to connect server");
                }
            }
            bundle.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
            bundle.putLong(TXLiveConstants.EVT_UTC_TIME, TXCTimeUtil.getUtcTimeTick());
            com.tencent.liteav.basic.util.h.a(this.mNotifyListener, i11, bundle);
        }
    }
}

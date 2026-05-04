package com.tencent.liteav.network;

import android.content.Context;
import android.os.Bundle;
import com.tencent.liteav.basic.structs.TXSNALPacket;
import com.tencent.liteav.network.TXCStreamDownloader;
import com.tencent.rtmp.TXLiveConstants;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public abstract class TXIStreamDownloader {
    protected Context mApplicationContext;
    protected Map<String, String> mHeaders;
    protected int mPayloadType;
    protected i mListener = null;
    protected com.tencent.liteav.basic.b.b mNotifyListener = null;
    protected a mRestartListener = null;
    protected h mMessageNotifyListener = null;
    protected boolean mIsRunning = false;
    protected String mOriginUrl = "";
    public int connectRetryTimes = 0;
    public int connectRetryLimit = 3;
    public int connectRetryInterval = 3;
    protected boolean mEnableMessage = false;
    protected boolean mEnableMetaData = false;
    protected String mFlvSessionKey = "";
    protected String mUserID = "";

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface a {
        void onOldStreamStop();

        void onRestartDownloader();
    }

    public TXIStreamDownloader(Context context) {
        this.mApplicationContext = context;
    }

    public int getConnectCountQuic() {
        return 0;
    }

    public int getConnectCountTcp() {
        return 0;
    }

    public String getCurrentStreamUrl() {
        return null;
    }

    public long getCurrentTS() {
        return 0L;
    }

    public TXCStreamDownloader.DownloadStats getDownloadStats() {
        return null;
    }

    public String getFlvSessionKey() {
        return this.mFlvSessionKey;
    }

    public long getLastIFrameTS() {
        return 0L;
    }

    public String getRealStreamUrl() {
        return null;
    }

    public boolean isQuicChannel() {
        return false;
    }

    public void onRecvAudioData(byte[] bArr, int i11, int i12, int i13) {
        if (this.mListener != null) {
            com.tencent.liteav.basic.structs.a aVar = new com.tencent.liteav.basic.structs.a();
            aVar.f43401f = bArr;
            aVar.f43400e = i11;
            if (i12 == 10) {
                if (i13 == 1) {
                    aVar.f43399d = 2;
                } else {
                    aVar.f43399d = 3;
                }
                if (aVar.f43399d == 2) {
                    aVar.f43398c = 16;
                }
            }
            if (i12 == 2) {
                aVar.f43399d = 5;
            }
            aVar.f43403h = i12;
            aVar.f43402g = i13;
            this.mListener.onPullAudio(aVar);
        }
    }

    public void onRecvMetaData(HashMap<String, String> hashMap) {
        h hVar;
        if (hashMap == null || hashMap.size() <= 0 || (hVar = this.mMessageNotifyListener) == null) {
            return;
        }
        hVar.onMetaDataMessage(hashMap);
    }

    public void onRecvSEIData(byte[] bArr) {
        h hVar;
        if (bArr == null || bArr.length <= 0 || (hVar = this.mMessageNotifyListener) == null) {
            return;
        }
        hVar.onSEIMessage(bArr);
    }

    public void onRecvVideoData(byte[] bArr, int i11, long j11, long j12, int i12) {
        if (this.mListener != null) {
            TXSNALPacket tXSNALPacket = new TXSNALPacket();
            tXSNALPacket.nalData = bArr;
            tXSNALPacket.nalType = i11;
            tXSNALPacket.dts = j11;
            tXSNALPacket.pts = j12;
            tXSNALPacket.codecId = i12;
            this.mListener.onPullNAL(tXSNALPacket);
        }
    }

    public void sendNotifyEvent(int i11) {
        com.tencent.liteav.basic.b.b bVar = this.mNotifyListener;
        if (bVar != null) {
            bVar.onNotifyEvent(i11, null);
        }
    }

    public void setFlvSessionKey(String str) {
        this.mFlvSessionKey = str;
    }

    public void setHeaders(Map<String, String> map) {
        this.mHeaders = map;
    }

    public void setListener(i iVar) {
        this.mListener = iVar;
    }

    public void setMessageNotifyListener(h hVar) {
        this.mMessageNotifyListener = hVar;
    }

    public void setNotifyListener(com.tencent.liteav.basic.b.b bVar) {
        this.mNotifyListener = bVar;
    }

    public void setOriginUrl(String str) {
        this.mOriginUrl = str;
    }

    public void setPayloadType(int i11) {
        this.mPayloadType = i11;
    }

    public void setRestartListener(a aVar) {
        this.mRestartListener = aVar;
    }

    public void setUserID(String str) {
        this.mUserID = str;
    }

    public abstract void startDownload(Vector<e> vector, boolean z11, boolean z12, boolean z13, boolean z14);

    public abstract void stopDownload();

    public void sendNotifyEvent(int i11, String str) {
        if (this.mNotifyListener != null) {
            Bundle bundle = new Bundle();
            bundle.putString(TXLiveConstants.EVT_DESCRIPTION, str);
            this.mNotifyListener.onNotifyEvent(i11, bundle);
        }
    }

    public void requestKeyFrame(String str) {
    }

    public void PushAudioFrame(byte[] bArr, int i11, long j11, int i12) {
    }

    public void PushVideoFrame(byte[] bArr, int i11, long j11, long j12, int i12) {
    }
}

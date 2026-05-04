package com.tencent.liteav.network;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import com.tencent.liteav.network.TXCStreamDownloader;
import com.tencent.liteav.network.TXIStreamDownloader;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.Map;
import java.util.Vector;
import javax.net.ssl.SSLException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class TXCFLVDownloader extends TXIStreamDownloader {
    private final int CONNECT_TIMEOUT;
    private final int FLV_HEAD_SIZE;
    private final int MAX_FRAME_SIZE;
    private final int MSG_CONNECT;
    private final int MSG_DISCONNECT;
    private final int MSG_QUIT;
    private final int MSG_RECONNECT;
    private final int MSG_RECV_DATA;
    private final int MSG_RESUME;
    private final int MSG_SEEK;
    private final int READ_STREAM_SIZE;
    public final String TAG;
    private HttpURLConnection mConnection;
    private long mContentLength;
    private long mCurrentNalTs;
    private long mDownloadedSize;
    private long mFLVParser;
    private Handler mFlvHandler;
    private HandlerThread mFlvThread;
    private boolean mHandleDataInJava;
    private boolean mHasReceivedFirstAudio;
    private boolean mHasReceivedFirstVideo;
    private InputStream mInputStream;
    private long mLastIFramelTs;
    private byte[] mPacketBytes;
    private String mPlayUrl;
    private boolean mRecvData;
    private WeakReference<TXCFLVDownloader> mRefFLVDownloader;
    private TXCStreamDownloader.DownloadStats mStats;
    private boolean mStopJitter;

    public TXCFLVDownloader(Context context) {
        super(context);
        this.TAG = "network.TXCFLVDownloader";
        this.FLV_HEAD_SIZE = 9;
        this.MAX_FRAME_SIZE = 1048576;
        this.MSG_CONNECT = 100;
        this.MSG_RECV_DATA = 101;
        this.MSG_DISCONNECT = 102;
        this.MSG_RECONNECT = 103;
        this.MSG_SEEK = 104;
        this.MSG_RESUME = 105;
        this.MSG_QUIT = 106;
        this.CONNECT_TIMEOUT = 8000;
        this.READ_STREAM_SIZE = 1388;
        this.mFlvThread = null;
        this.mFlvHandler = null;
        this.mInputStream = null;
        this.mConnection = null;
        this.mPacketBytes = null;
        this.mRecvData = false;
        this.mContentLength = 0L;
        this.mDownloadedSize = 0L;
        this.mHandleDataInJava = false;
        this.mFLVParser = 0L;
        this.mCurrentNalTs = 0L;
        this.mLastIFramelTs = 0L;
        this.mStopJitter = true;
        this.mPlayUrl = "";
        this.mHasReceivedFirstVideo = false;
        this.mHasReceivedFirstAudio = false;
        this.mStats = null;
        this.mRefFLVDownloader = null;
        TXCStreamDownloader.DownloadStats downloadStats = new TXCStreamDownloader.DownloadStats();
        this.mStats = downloadStats;
        downloadStats.afterParseAudioBytes = 0L;
        downloadStats.dnsTS = 0L;
        downloadStats.startTS = TXCTimeUtil.getTimeTick();
        TXCLog.i("network.TXCFLVDownloader", "new flv download " + this);
    }

    private void connect() throws Exception {
        String headerField;
        HttpURLConnection httpURLConnection = this.mConnection;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
            this.mConnection = null;
        }
        TXCLog.i("network.TXCFLVDownloader", "[FirstFramePath][Network] TXCFLVDownloader: start network connect. instance:" + hashCode() + " url:" + this.mPlayUrl);
        long currentTimeMillis = System.currentTimeMillis();
        this.mConnection = (HttpURLConnection) new URL(this.mPlayUrl).openConnection();
        this.mStats.dnsTS = TXCTimeUtil.getTimeTick();
        this.mConnection.setConnectTimeout(8000);
        this.mConnection.setReadTimeout(8000);
        this.mConnection.setRequestProperty("Accept-Encoding", "identity");
        this.mConnection.setInstanceFollowRedirects(true);
        Map<String, String> map = this.mHeaders;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                this.mConnection.setRequestProperty(entry.getKey(), entry.getValue());
            }
        }
        this.mConnection.connect();
        if (200 == this.mConnection.getResponseCode()) {
            this.mStats.connTS = TXCTimeUtil.getTimeTick();
        } else {
            this.mStats.errorCode = this.mConnection.getResponseCode();
        }
        this.mInputStream = this.mConnection.getInputStream();
        this.mPacketBytes = new byte[1388];
        this.mRecvData = false;
        this.mContentLength = this.mConnection.getContentLength();
        this.mDownloadedSize = 0L;
        this.mStats.serverIP = InetAddress.getByName(this.mConnection.getURL().getHost()).getHostAddress();
        String str = "connect server success,ServerIp:" + this.mStats.serverIP;
        TXCLog.i("network.TXCFLVDownloader", str);
        TXCLog.i("network.TXCFLVDownloader", "[FirstFramePath][Network] TXCFLVDownloader: connect server success. instance:" + hashCode() + " ip:" + this.mStats.serverIP + " cost:" + (System.currentTimeMillis() - currentTimeMillis) + " rspCode:" + this.mStats.errorCode);
        sendNotifyEvent(2001, str);
        this.mStats.flvSessionKey = this.mConnection.getHeaderField("X-Tlive-SpanId");
        if (TextUtils.isEmpty(this.mFlvSessionKey) || (headerField = this.mConnection.getHeaderField(this.mFlvSessionKey)) == null) {
            return;
        }
        TXCLog.i("network.TXCFLVDownloader", "receive flvSessionKey " + headerField);
        sendNotifyEvent(2031, headerField);
    }

    private void disconnect() throws Exception {
        TXCLog.i("network.TXCFLVDownloader", "[Network]FLVDownloader disconnect.");
        HttpURLConnection httpURLConnection = this.mConnection;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
            this.mConnection = null;
        }
        InputStream inputStream = this.mInputStream;
        if (inputStream != null) {
            inputStream.close();
            this.mInputStream = null;
        }
    }

    private native void nativeCleanData(long j11);

    private native int nativeGetAudioBytes(long j11);

    private native int nativeGetVideoBytes(long j11);

    private native int nativeGetVideoGop(long j11);

    private native long nativeInitFlvHander(String str, int i11, boolean z11, boolean z12);

    private native long nativeInitFlvHanderByRef(long j11);

    private native int nativeParseData(long j11, byte[] bArr, int i11);

    private native void nativeUninitFlvhander(long j11, boolean z11);

    private void onRecvFirstAudioData() {
        if (this.mHasReceivedFirstAudio) {
            return;
        }
        this.mHasReceivedFirstAudio = true;
        this.mStats.firstAudioTS = TXCTimeUtil.getTimeTick();
        TXCLog.i("network.TXCFLVDownloader", "[FirstFramePath][Network][Audio] TXCFlvDownloader: recv first audio frame. instance:" + hashCode());
    }

    private void onRecvFirstVideoData() {
        if (this.mHasReceivedFirstVideo) {
            return;
        }
        this.mHasReceivedFirstVideo = true;
        this.mStats.firstVideoTS = TXCTimeUtil.getTimeTick();
        TXCLog.i("network.TXCFLVDownloader", "[FirstFramePath][Network][Video] TXCFlvDownloader: recv first video frame. instance:" + hashCode());
    }

    private void postConnectMsg() {
        this.mInputStream = null;
        HttpURLConnection httpURLConnection = this.mConnection;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
            this.mConnection = null;
        }
        Message message = new Message();
        message.what = 100;
        message.arg1 = 0;
        Handler handler = this.mFlvHandler;
        if (handler != null) {
            handler.sendMessage(message);
        }
    }

    private void postDisconnectMsg() {
        Handler handler = this.mFlvHandler;
        if (handler != null) {
            handler.sendEmptyMessage(102);
        }
    }

    private void postReconnectMsg() {
        Handler handler = this.mFlvHandler;
        if (handler != null) {
            handler.sendEmptyMessageDelayed(103, this.connectRetryInterval * 1000);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processMsgConnect() {
        long j11;
        try {
            connect();
            if (this.mFLVParser == 0) {
                WeakReference<TXCFLVDownloader> weakReference = this.mRefFLVDownloader;
                if (weakReference != null) {
                    TXCFLVDownloader tXCFLVDownloader = weakReference.get();
                    if (tXCFLVDownloader != null) {
                        if (tXCFLVDownloader.mIsRunning) {
                            TXCLog.i("network.TXCFLVDownloader", "[Network]init flv parser with old downloader:" + tXCFLVDownloader.hashCode());
                            tXCFLVDownloader.mStopJitter = false;
                            j11 = tXCFLVDownloader.mFLVParser;
                            this.mRefFLVDownloader = null;
                        } else {
                            TXCLog.e("network.TXCFLVDownloader", "[Network]old downloader:" + tXCFLVDownloader.hashCode() + " isn't running now. just create new parser.");
                        }
                    }
                    j11 = 0;
                    this.mRefFLVDownloader = null;
                } else {
                    j11 = 0;
                }
                if (j11 != 0) {
                    TXCLog.i("network.TXCFLVDownloader", "[Network]init flv parser with reference parse:" + j11);
                    this.mFLVParser = nativeInitFlvHanderByRef(j11);
                } else {
                    TXCLog.i("network.TXCFLVDownloader", "[Network]init flv parser.");
                    this.mFLVParser = nativeInitFlvHander(this.mUserID, 0, this.mEnableMessage, this.mEnableMetaData);
                }
                int i11 = this.mPayloadType;
                if (i11 != 0) {
                    nativeSetPayloadType(this.mFLVParser, i11);
                }
            }
            Handler handler = this.mFlvHandler;
            if (handler != null) {
                handler.sendEmptyMessage(101);
            }
        } catch (FileNotFoundException e11) {
            TXCLog.e("network.TXCFLVDownloader", "[Network]file not found, reconnect");
            this.mStats.errorCode = -1;
            this.mStats.errorInfo = e11.toString();
            e11.printStackTrace();
            postReconnectMsg();
        } catch (Error e12) {
            TXCLog.e("network.TXCFLVDownloader", "[Network]error, reconnect");
            this.mStats.errorCode = -1;
            this.mStats.errorInfo = e12.toString();
            e12.printStackTrace();
            postReconnectMsg();
        } catch (SocketTimeoutException e13) {
            TXCLog.e("network.TXCFLVDownloader", "[Network]socket timeout, reconnect");
            this.mStats.errorCode = -1;
            this.mStats.errorInfo = e13.toString();
            postReconnectMsg();
        } catch (Exception e14) {
            TXCLog.e("network.TXCFLVDownloader", "[Network]exception, reconnect");
            this.mStats.errorCode = -1;
            this.mStats.errorInfo = e14.toString();
            e14.printStackTrace();
            postReconnectMsg();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processMsgDisConnect() {
        try {
            disconnect();
        } catch (Exception e11) {
            TXCLog.e("network.TXCFLVDownloader", "disconnect failed.", e11);
        }
        long j11 = this.mFLVParser;
        if (j11 != 0) {
            nativeUninitFlvhander(j11, this.mStopJitter);
            this.mFLVParser = 0L;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processMsgReconnect() {
        if (this.mStopJitter) {
            reconnect();
            return;
        }
        TXCLog.i("network.TXCFLVDownloader", "ignore processMsgReconnect when start multi stream switch" + this);
        TXIStreamDownloader.a aVar = this.mRestartListener;
        if (aVar != null) {
            aVar.onOldStreamStop();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processMsgRecvData() {
        InputStream inputStream = this.mInputStream;
        if (inputStream != null) {
            try {
                int i11 = 0;
                int read = inputStream.read(this.mPacketBytes, 0, 1388);
                if (read > 0) {
                    long j11 = read;
                    this.mDownloadedSize += j11;
                    if (!this.mRecvData) {
                        this.mRecvData = true;
                        TXCLog.i("network.TXCFLVDownloader", "[FirstFramePath][Network] TXCFLVDownloader: recv first data packet. instance:" + hashCode());
                    }
                    long j12 = this.mFLVParser;
                    if (j12 != 0) {
                        this.mStats.beforeParseVideoBytes += j11;
                        i11 = nativeParseData(j12, this.mPacketBytes, read);
                        this.mStats.afterParseVideoBytes = nativeGetVideoBytes(this.mFLVParser);
                        this.mStats.afterParseAudioBytes = nativeGetAudioBytes(this.mFLVParser);
                        this.mStats.videoGop = nativeGetVideoGop(this.mFLVParser);
                    }
                    if (i11 > 1048576) {
                        TXCLog.e("network.TXCFLVDownloader", "[Network]flv play parse frame: " + i11 + " > 1048576,start reconnect");
                        postReconnectMsg();
                        return;
                    }
                } else if (read < 0) {
                    TXCLog.e("network.TXCFLVDownloader", "[Network]http read: " + read + " < 0, start reconnect");
                    postReconnectMsg();
                    return;
                }
                Handler handler = this.mFlvHandler;
                if (handler != null) {
                    handler.sendEmptyMessage(101);
                }
            } catch (EOFException e11) {
                TXCLog.e("network.TXCFLVDownloader", "[Network]eof exception start reconnect");
                TXCStreamDownloader.DownloadStats downloadStats = this.mStats;
                downloadStats.errorCode = -1;
                downloadStats.errorInfo = e11.toString();
                postReconnectMsg();
            } catch (Error e12) {
                TXCLog.e("network.TXCFLVDownloader", "[Network]error");
                TXCStreamDownloader.DownloadStats downloadStats2 = this.mStats;
                downloadStats2.errorCode = -1;
                downloadStats2.errorInfo = e12.toString();
                e12.printStackTrace();
                this.mInputStream = null;
                this.mConnection = null;
            } catch (SocketException e13) {
                TXCLog.e("network.TXCFLVDownloader", "[Network]socket exception start reconnect");
                TXCStreamDownloader.DownloadStats downloadStats3 = this.mStats;
                downloadStats3.errorCode = -1;
                downloadStats3.errorInfo = e13.toString();
                postReconnectMsg();
            } catch (SocketTimeoutException e14) {
                TXCLog.e("network.TXCFLVDownloader", "[Network]socket timeout start reconnect");
                TXCStreamDownloader.DownloadStats downloadStats4 = this.mStats;
                downloadStats4.errorCode = -1;
                downloadStats4.errorInfo = e14.toString();
                postReconnectMsg();
            } catch (SSLException e15) {
                TXCLog.e("network.TXCFLVDownloader", "[Network]ssl exception start reconnect");
                TXCStreamDownloader.DownloadStats downloadStats5 = this.mStats;
                downloadStats5.errorCode = -1;
                downloadStats5.errorInfo = e15.toString();
                postReconnectMsg();
            } catch (Exception e16) {
                TXCLog.e("network.TXCFLVDownloader", "[Network]exception");
                TXCStreamDownloader.DownloadStats downloadStats6 = this.mStats;
                downloadStats6.errorCode = -1;
                downloadStats6.errorInfo = e16.toString();
                e16.printStackTrace();
                this.mInputStream = null;
                this.mConnection = null;
            }
        }
    }

    private void reconnect() {
        processMsgDisConnect();
        String str = "ServerIp:" + this.mStats.serverIP + ",errCode:" + this.mStats.errorCode + ",errInfo:" + this.mStats.errorInfo;
        TXCLog.i("network.TXCFLVDownloader", "reconnect:" + str);
        int i11 = this.connectRetryTimes;
        if (i11 >= this.connectRetryLimit) {
            TXCLog.i("network.TXCFLVDownloader", "[Network] reconnect fail. all times retried. limit:" + this.connectRetryLimit);
            sendNotifyEvent(-2301, str);
            return;
        }
        this.connectRetryTimes = i11 + 1;
        TXCLog.i("network.TXCFLVDownloader", "[Network] start reconnect, times:" + this.connectRetryTimes + " limit:" + this.connectRetryLimit);
        processMsgConnect();
        sendNotifyEvent(2103, str);
    }

    private void startInternal() {
        if (this.mFlvThread == null) {
            HandlerThread handlerThread = new HandlerThread("FlvThread");
            this.mFlvThread = handlerThread;
            handlerThread.start();
            TXCLog.i("network.TXCFLVDownloader", "[Network] flv downloader thread id:" + this.mFlvThread.getId() + " instance:" + hashCode());
        }
        if (this.mFlvHandler == null) {
            this.mFlvHandler = new Handler(this.mFlvThread.getLooper()) { // from class: com.tencent.liteav.network.TXCFLVDownloader.1
                @Override // android.os.Handler
                public void handleMessage(Message message) {
                    int i11 = message.what;
                    if (i11 == 106) {
                        try {
                            Looper.myLooper().quit();
                            return;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                    switch (i11) {
                        case 100:
                            TXCFLVDownloader.this.processMsgConnect();
                            break;
                        case 101:
                            TXCFLVDownloader.this.processMsgRecvData();
                            break;
                        case 102:
                            TXCFLVDownloader.this.processMsgDisConnect();
                            break;
                        case 103:
                            TXCFLVDownloader.this.processMsgReconnect();
                            break;
                    }
                }
            };
        }
        postConnectMsg();
    }

    @Override // com.tencent.liteav.network.TXIStreamDownloader
    public void PushAudioFrame(byte[] bArr, int i11, long j11, int i12) {
        nativePushAudioFrame(this.mFLVParser, bArr, i11, j11, i12);
    }

    @Override // com.tencent.liteav.network.TXIStreamDownloader
    public void PushVideoFrame(byte[] bArr, int i11, long j11, long j12, int i12) {
        nativePushVideoFrame(this.mFLVParser, bArr, i11, j11, j12, i12);
    }

    @Override // com.tencent.liteav.network.TXIStreamDownloader
    public long getCurrentTS() {
        return this.mCurrentNalTs;
    }

    @Override // com.tencent.liteav.network.TXIStreamDownloader
    public TXCStreamDownloader.DownloadStats getDownloadStats() {
        TXCStreamDownloader.DownloadStats downloadStats = new TXCStreamDownloader.DownloadStats();
        TXCStreamDownloader.DownloadStats downloadStats2 = this.mStats;
        downloadStats.afterParseAudioBytes = downloadStats2.afterParseAudioBytes;
        downloadStats.afterParseVideoBytes = downloadStats2.afterParseVideoBytes;
        downloadStats.beforeParseVideoBytes = downloadStats2.beforeParseVideoBytes;
        downloadStats.beforeParseAudioBytes = downloadStats2.beforeParseAudioBytes;
        downloadStats.videoGop = downloadStats2.videoGop;
        downloadStats.startTS = downloadStats2.startTS;
        downloadStats.dnsTS = downloadStats2.dnsTS;
        downloadStats.connTS = downloadStats2.connTS;
        downloadStats.firstAudioTS = downloadStats2.firstAudioTS;
        downloadStats.firstVideoTS = downloadStats2.firstVideoTS;
        downloadStats.serverIP = downloadStats2.serverIP;
        downloadStats.flvSessionKey = downloadStats2.flvSessionKey;
        downloadStats.errorCode = downloadStats2.errorCode;
        downloadStats.errorInfo = downloadStats2.errorInfo;
        return downloadStats;
    }

    @Override // com.tencent.liteav.network.TXIStreamDownloader
    public long getLastIFrameTS() {
        return this.mLastIFramelTs;
    }

    @Override // com.tencent.liteav.network.TXIStreamDownloader
    public String getRealStreamUrl() {
        HttpURLConnection httpURLConnection = this.mConnection;
        if (httpURLConnection != null) {
            return httpURLConnection.getURL().toString();
        }
        return null;
    }

    public native void nativePushAudioFrame(long j11, byte[] bArr, int i11, long j12, int i12);

    public native void nativePushVideoFrame(long j11, byte[] bArr, int i11, long j12, long j13, int i12);

    public native void nativeSetPayloadType(long j11, int i11);

    @Override // com.tencent.liteav.network.TXIStreamDownloader
    public void onRecvAudioData(byte[] bArr, int i11, int i12, int i13) {
        if (!this.mHasReceivedFirstAudio) {
            this.mHasReceivedFirstAudio = true;
            this.mStats.firstAudioTS = TXCTimeUtil.getTimeTick();
            TXCLog.i("network.TXCFLVDownloader", "[FirstFramePath][Network][Audio] TXCFlvDownloader: recv first audio frame. instance:" + hashCode());
        }
        this.mStats.afterParseAudioBytes += bArr.length;
        super.onRecvAudioData(bArr, i11, i12, i13);
    }

    @Override // com.tencent.liteav.network.TXIStreamDownloader
    public void onRecvVideoData(byte[] bArr, int i11, long j11, long j12, int i12) {
        if (!this.mHasReceivedFirstVideo) {
            this.mHasReceivedFirstVideo = true;
            this.mStats.firstVideoTS = TXCTimeUtil.getTimeTick();
            TXCLog.i("network.TXCFLVDownloader", "[FirstFramePath][Network][Video] TXCFlvDownloader: recv first video frame. instance:" + hashCode());
        }
        this.mStats.afterParseVideoBytes += bArr.length;
        super.onRecvVideoData(bArr, i11, j11, j12, i12);
    }

    public void recvData(boolean z11) {
        this.mHandleDataInJava = z11;
    }

    @Override // com.tencent.liteav.network.TXIStreamDownloader
    public void setPayloadType(int i11) {
        this.mPayloadType = i11;
        long j11 = this.mFLVParser;
        if (j11 != 0) {
            nativeSetPayloadType(j11, i11);
        }
    }

    @Override // com.tencent.liteav.network.TXIStreamDownloader
    public void startDownload(Vector<e> vector, boolean z11, boolean z12, boolean z13, boolean z14) {
        if (this.mIsRunning || vector == null || vector.isEmpty()) {
            return;
        }
        this.mEnableMessage = z13;
        this.mEnableMetaData = z14;
        this.mIsRunning = true;
        this.mPlayUrl = vector.get(0).f43771a;
        TXCLog.i("network.TXCFLVDownloader", "start pull with url " + this.mPlayUrl);
        startInternal();
    }

    @Override // com.tencent.liteav.network.TXIStreamDownloader
    public void stopDownload() {
        if (this.mIsRunning) {
            this.mIsRunning = false;
            TXCLog.i("network.TXCFLVDownloader", "stop pull");
            try {
                Handler handler = this.mFlvHandler;
                if (handler != null) {
                    handler.removeCallbacksAndMessages(null);
                    this.mFlvHandler.sendEmptyMessage(102);
                    this.mFlvHandler.sendEmptyMessage(106);
                    this.mFlvHandler = null;
                }
            } catch (Exception e11) {
                TXCLog.e("network.TXCFLVDownloader", "stop download failed.", e11);
            }
        }
    }

    public TXCFLVDownloader(Context context, TXCFLVDownloader tXCFLVDownloader) {
        super(context);
        this.TAG = "network.TXCFLVDownloader";
        this.FLV_HEAD_SIZE = 9;
        this.MAX_FRAME_SIZE = 1048576;
        this.MSG_CONNECT = 100;
        this.MSG_RECV_DATA = 101;
        this.MSG_DISCONNECT = 102;
        this.MSG_RECONNECT = 103;
        this.MSG_SEEK = 104;
        this.MSG_RESUME = 105;
        this.MSG_QUIT = 106;
        this.CONNECT_TIMEOUT = 8000;
        this.READ_STREAM_SIZE = 1388;
        this.mFlvThread = null;
        this.mFlvHandler = null;
        this.mInputStream = null;
        this.mConnection = null;
        this.mPacketBytes = null;
        this.mRecvData = false;
        this.mContentLength = 0L;
        this.mDownloadedSize = 0L;
        this.mHandleDataInJava = false;
        this.mFLVParser = 0L;
        this.mCurrentNalTs = 0L;
        this.mLastIFramelTs = 0L;
        this.mStopJitter = true;
        this.mPlayUrl = "";
        this.mHasReceivedFirstVideo = false;
        this.mHasReceivedFirstAudio = false;
        this.mStats = null;
        this.mRefFLVDownloader = null;
        TXCStreamDownloader.DownloadStats downloadStats = new TXCStreamDownloader.DownloadStats();
        this.mStats = downloadStats;
        downloadStats.afterParseAudioBytes = 0L;
        downloadStats.dnsTS = 0L;
        downloadStats.startTS = TXCTimeUtil.getTimeTick();
        this.mRefFLVDownloader = new WeakReference<>(tXCFLVDownloader);
        TXCLog.i("network.TXCFLVDownloader", "new multi flv download " + this);
    }
}

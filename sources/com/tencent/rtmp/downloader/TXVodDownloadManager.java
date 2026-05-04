package com.tencent.rtmp.downloader;

import android.net.Uri;
import android.text.TextUtils;
import com.tencent.ijk.media.player.IjkDownloadCenter;
import com.tencent.ijk.media.player.IjkDownloadMedia;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.network.f;
import com.tencent.liteav.network.g;
import com.tencent.liteav.network.j;
import com.tencent.liteav.network.k;
import com.tencent.rtmp.TXPlayerAuthBuilder;
import java.io.File;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class TXVodDownloadManager {
    public static final int DOWNLOAD_AUTH_FAILED = -5001;
    public static final int DOWNLOAD_DISCONNECT = -5005;
    public static final int DOWNLOAD_FORMAT_ERROR = -5004;
    public static final int DOWNLOAD_HLS_KEY_ERROR = -5006;
    public static final int DOWNLOAD_NO_FILE = -5003;
    public static final int DOWNLOAD_PATH_ERROR = -5007;
    public static final int DOWNLOAD_SUCCESS = 0;
    private static final int IJKDM_EVT_FILE_OPEN_ERROR = 1008;
    private static final int IJKDM_EVT_HLS_KEY_ERROR = 1008;
    private static final int IJKDM_EVT_NET_DISCONNECT = 1001;
    private static final String TAG = "TXVodDownloadManager";
    private static TXVodDownloadManager instance;
    protected IjkDownloadCenter mDownloadCenter;
    IjkDownloadCenter.OnDownloadListener mDownloadCenterListener = new IjkDownloadCenter.OnDownloadListener() { // from class: com.tencent.rtmp.downloader.TXVodDownloadManager.2
        @Override // com.tencent.ijk.media.player.IjkDownloadCenter.OnDownloadListener
        public void downloadBegin(IjkDownloadCenter ijkDownloadCenter, IjkDownloadMedia ijkDownloadMedia) {
            TXVodDownloadMediaInfo convertMedia = TXVodDownloadManager.this.convertMedia(ijkDownloadMedia);
            if (convertMedia != null) {
                TXCLog.i(TXVodDownloadManager.TAG, "downloadBegin " + convertMedia.playPath);
                TXVodDownloadManager.this.mListener.onDownloadStart(convertMedia);
                if (new File(convertMedia.playPath).isFile()) {
                    TXCLog.d(TXVodDownloadManager.TAG, "file state ok");
                } else {
                    TXCLog.e(TXVodDownloadManager.TAG, "file not create!");
                }
            }
        }

        @Override // com.tencent.ijk.media.player.IjkDownloadCenter.OnDownloadListener
        public void downloadEnd(IjkDownloadCenter ijkDownloadCenter, IjkDownloadMedia ijkDownloadMedia) {
            TXVodDownloadMediaInfo convertMedia = TXVodDownloadManager.this.convertMedia(ijkDownloadMedia);
            if (convertMedia != null) {
                TXCLog.i(TXVodDownloadManager.TAG, "downloadEnd " + convertMedia.playPath);
                TXVodDownloadManager.this.mMediaInfoArray.remove(convertMedia);
                TXVodDownloadManager.this.mListener.onDownloadStop(convertMedia);
            }
        }

        @Override // com.tencent.ijk.media.player.IjkDownloadCenter.OnDownloadListener
        public void downloadError(IjkDownloadCenter ijkDownloadCenter, IjkDownloadMedia ijkDownloadMedia, int i11, String str) {
            TXVodDownloadMediaInfo convertMedia = TXVodDownloadManager.this.convertMedia(ijkDownloadMedia);
            if (convertMedia != null) {
                TXCLog.e(TXVodDownloadManager.TAG, "downloadError " + convertMedia.playPath + " " + str);
                TXVodDownloadManager.this.mMediaInfoArray.remove(convertMedia);
                if (convertMedia.isStop) {
                    TXVodDownloadManager.this.mListener.onDownloadStop(convertMedia);
                } else if (i11 == 1008) {
                    TXVodDownloadManager.this.mListener.onDownloadError(convertMedia, TXVodDownloadManager.DOWNLOAD_HLS_KEY_ERROR, str);
                } else {
                    TXVodDownloadManager.this.mListener.onDownloadError(convertMedia, TXVodDownloadManager.DOWNLOAD_DISCONNECT, str);
                }
            }
        }

        @Override // com.tencent.ijk.media.player.IjkDownloadCenter.OnDownloadListener
        public void downloadFinish(IjkDownloadCenter ijkDownloadCenter, IjkDownloadMedia ijkDownloadMedia) {
            TXVodDownloadMediaInfo convertMedia = TXVodDownloadManager.this.convertMedia(ijkDownloadMedia);
            if (convertMedia != null) {
                TXCLog.i(TXVodDownloadManager.TAG, "downloadFinish " + convertMedia.playPath);
                TXVodDownloadManager.this.mMediaInfoArray.remove(convertMedia);
                if (new File(convertMedia.playPath).isFile()) {
                    TXVodDownloadManager.this.mListener.onDownloadFinish(convertMedia);
                } else {
                    TXVodDownloadManager.this.mListener.onDownloadError(convertMedia, TXVodDownloadManager.DOWNLOAD_NO_FILE, "The file has been deleted");
                }
            }
        }

        @Override // com.tencent.ijk.media.player.IjkDownloadCenter.OnDownloadListener
        public void downloadProgress(IjkDownloadCenter ijkDownloadCenter, IjkDownloadMedia ijkDownloadMedia) {
            TXVodDownloadMediaInfo convertMedia = TXVodDownloadManager.this.convertMedia(ijkDownloadMedia);
            if (convertMedia != null) {
                TXVodDownloadManager.this.mListener.onDownloadProgress(convertMedia);
            }
        }

        @Override // com.tencent.ijk.media.player.IjkDownloadCenter.OnDownloadListener
        public int hlsKeyVerify(IjkDownloadCenter ijkDownloadCenter, IjkDownloadMedia ijkDownloadMedia, String str, byte[] bArr) {
            TXVodDownloadMediaInfo convertMedia = TXVodDownloadManager.this.convertMedia(ijkDownloadMedia);
            if (convertMedia != null) {
                return TXVodDownloadManager.this.mListener.hlsKeyVerify(convertMedia, str, bArr);
            }
            return 0;
        }
    };
    protected String mDownloadPath;
    protected Map<String, String> mHeaders;
    protected ITXVodDownloadListener mListener;
    protected ArrayList<TXVodDownloadMediaInfo> mMediaInfoArray;

    private TXVodDownloadManager() {
        IjkDownloadCenter ijkDownloadCenter = IjkDownloadCenter.getInstance();
        this.mDownloadCenter = ijkDownloadCenter;
        ijkDownloadCenter.setListener(this.mDownloadCenterListener);
        this.mMediaInfoArray = new ArrayList<>();
    }

    public static TXVodDownloadManager getInstance() {
        if (instance == null) {
            instance = new TXVodDownloadManager();
        }
        return instance;
    }

    public static String md5(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            String str2 = "";
            for (byte b11 : MessageDigest.getInstance("MD5").digest(str.getBytes())) {
                String hexString = Integer.toHexString(b11 & 255);
                if (hexString.length() == 1) {
                    hexString = "0" + hexString;
                }
                str2 = str2 + hexString;
            }
            return str2;
        } catch (NoSuchAlgorithmException e11) {
            TXCLog.e(TAG, "md5 failed.", e11);
            return "";
        }
    }

    public TXVodDownloadMediaInfo convertMedia(IjkDownloadMedia ijkDownloadMedia) {
        Iterator<TXVodDownloadMediaInfo> it = this.mMediaInfoArray.iterator();
        while (it.hasNext()) {
            TXVodDownloadMediaInfo next = it.next();
            if (next.tid == ijkDownloadMedia.tid) {
                next.downloadSize = ijkDownloadMedia.downloadSize;
                if (next.size == 0) {
                    next.size = ijkDownloadMedia.size;
                }
                next.segments = ijkDownloadMedia.segments;
                next.downloadSegments = ijkDownloadMedia.downloadSegments;
                return next;
            }
        }
        return null;
    }

    public boolean deleteDownloadFile(String str) {
        TXCLog.d(TAG, "delete file " + str);
        Iterator<TXVodDownloadMediaInfo> it = this.mMediaInfoArray.iterator();
        while (it.hasNext()) {
            String str2 = it.next().playPath;
            if (str2 != null && str2.equals(str)) {
                TXCLog.e(TAG, "file is downloading, can not be delete");
                return false;
            }
        }
        new File(str).delete();
        TXCLog.e(TAG, "delete success");
        return true;
    }

    public void downloadMedia(TXVodDownloadMediaInfo tXVodDownloadMediaInfo) {
        String str = tXVodDownloadMediaInfo.url;
        if (str == null) {
            return;
        }
        if (!Uri.parse(str).getPath().endsWith(".m3u8")) {
            TXCLog.e(TAG, "format error: " + str);
            ITXVodDownloadListener iTXVodDownloadListener = this.mListener;
            if (iTXVodDownloadListener != null) {
                iTXVodDownloadListener.onDownloadError(tXVodDownloadMediaInfo, DOWNLOAD_FORMAT_ERROR, "No support format");
                return;
            }
            return;
        }
        String makePlayPath = makePlayPath(str);
        tXVodDownloadMediaInfo.playPath = makePlayPath;
        if (makePlayPath == null) {
            ITXVodDownloadListener iTXVodDownloadListener2 = this.mListener;
            if (iTXVodDownloadListener2 != null) {
                iTXVodDownloadListener2.onDownloadError(tXVodDownloadMediaInfo, DOWNLOAD_PATH_ERROR, "Failed to create local path");
                return;
            }
            return;
        }
        TXVodDownloadDataSource tXVodDownloadDataSource = tXVodDownloadMediaInfo.dataSource;
        if (tXVodDownloadDataSource != null && tXVodDownloadDataSource.token != null) {
            String[] split = str.split("/");
            if (split.length > 0) {
                int lastIndexOf = str.lastIndexOf(split[split.length - 1]);
                str = str.substring(0, lastIndexOf) + "voddrm.token." + tXVodDownloadMediaInfo.dataSource.token + "." + str.substring(lastIndexOf);
            }
        }
        TXCLog.d(TAG, "download hls " + str + " to " + tXVodDownloadMediaInfo.playPath);
        int downloadHls = this.mDownloadCenter.downloadHls(str, tXVodDownloadMediaInfo.playPath);
        tXVodDownloadMediaInfo.tid = downloadHls;
        if (downloadHls < 0) {
            TXCLog.e(TAG, "start download failed");
            ITXVodDownloadListener iTXVodDownloadListener3 = this.mListener;
            if (iTXVodDownloadListener3 != null) {
                iTXVodDownloadListener3.onDownloadError(tXVodDownloadMediaInfo, DOWNLOAD_FORMAT_ERROR, "Internal error");
            }
        }
    }

    public k getClassificationSource(j jVar, int i11) {
        return i11 == 0 ? jVar.d() : jVar.a(TXVodDownloadDataSource.qualityToId(i11), "hls");
    }

    public k getTemplateSource(j jVar, String str) {
        return jVar.b(str, "hls");
    }

    public String makePlayPath(String str) {
        String str2 = this.mDownloadPath + "/txdownload";
        File file = new File(str2);
        if ((!file.exists() || !file.isDirectory()) && !file.mkdir()) {
            TXCLog.e(TAG, "Failed to create download path" + str2);
            return null;
        }
        if (!Uri.parse(str).getPath().endsWith(".m3u8")) {
            TXCLog.e(TAG, "Unsupported format");
            return null;
        }
        return str2 + "/" + md5(str) + ".m3u8.sqlite";
    }

    public void setDownloadPath(String str) {
        if (str == null) {
            return;
        }
        new File(str).mkdirs();
        this.mDownloadPath = str;
    }

    public void setHeaders(Map<String, String> map) {
        this.mHeaders = map;
        this.mDownloadCenter.setHeaders(map);
    }

    public void setListener(ITXVodDownloadListener iTXVodDownloadListener) {
        this.mListener = iTXVodDownloadListener;
    }

    public TXVodDownloadMediaInfo startDownload(final TXVodDownloadDataSource tXVodDownloadDataSource) {
        final TXVodDownloadMediaInfo tXVodDownloadMediaInfo = new TXVodDownloadMediaInfo();
        tXVodDownloadMediaInfo.dataSource = tXVodDownloadDataSource;
        TXPlayerAuthBuilder tXPlayerAuthBuilder = tXVodDownloadDataSource.authBuilder;
        if (tXPlayerAuthBuilder == null) {
            return null;
        }
        f fVar = new f();
        fVar.a(tXPlayerAuthBuilder.isHttps());
        fVar.a(new g() { // from class: com.tencent.rtmp.downloader.TXVodDownloadManager.1
            @Override // com.tencent.liteav.network.g
            public void onNetFailed(f fVar2, String str, int i11) {
                TXVodDownloadManager.this.mMediaInfoArray.remove(tXVodDownloadMediaInfo);
                ITXVodDownloadListener iTXVodDownloadListener = TXVodDownloadManager.this.mListener;
                if (iTXVodDownloadListener != null) {
                    iTXVodDownloadListener.onDownloadError(tXVodDownloadMediaInfo, TXVodDownloadManager.DOWNLOAD_AUTH_FAILED, str);
                }
            }

            @Override // com.tencent.liteav.network.g
            public void onNetSuccess(f fVar2) {
                k templateSource;
                TXVodDownloadMediaInfo tXVodDownloadMediaInfo2 = tXVodDownloadMediaInfo;
                if (tXVodDownloadMediaInfo2.isStop) {
                    TXVodDownloadManager.this.mMediaInfoArray.remove(tXVodDownloadMediaInfo2);
                    ITXVodDownloadListener iTXVodDownloadListener = TXVodDownloadManager.this.mListener;
                    if (iTXVodDownloadListener != null) {
                        iTXVodDownloadListener.onDownloadStop(tXVodDownloadMediaInfo);
                    }
                    TXCLog.w(TXVodDownloadManager.TAG, "Download task canceled");
                    return;
                }
                j a11 = fVar2.a();
                TXVodDownloadDataSource tXVodDownloadDataSource2 = tXVodDownloadDataSource;
                int i11 = tXVodDownloadDataSource2.quality;
                if (i11 != 1000) {
                    templateSource = TXVodDownloadManager.this.getClassificationSource(a11, i11);
                } else {
                    String str = tXVodDownloadDataSource2.templateName;
                    templateSource = str != null ? TXVodDownloadManager.this.getTemplateSource(a11, str) : null;
                }
                if (templateSource != null) {
                    tXVodDownloadMediaInfo.url = templateSource.b();
                    tXVodDownloadMediaInfo.size = templateSource.d();
                    tXVodDownloadMediaInfo.duration = templateSource.c();
                    TXVodDownloadManager.this.downloadMedia(tXVodDownloadMediaInfo);
                    return;
                }
                TXVodDownloadManager.this.mMediaInfoArray.remove(tXVodDownloadMediaInfo);
                ITXVodDownloadListener iTXVodDownloadListener2 = TXVodDownloadManager.this.mListener;
                if (iTXVodDownloadListener2 != null) {
                    iTXVodDownloadListener2.onDownloadError(tXVodDownloadMediaInfo, TXVodDownloadManager.DOWNLOAD_NO_FILE, "No such resolution");
                }
            }
        });
        if (fVar.a(tXPlayerAuthBuilder.getAppId(), tXPlayerAuthBuilder.getFileId(), tXPlayerAuthBuilder.getTimeout(), tXPlayerAuthBuilder.getUs(), tXPlayerAuthBuilder.getExper(), tXPlayerAuthBuilder.getSign()) != 0) {
            TXCLog.e(TAG, "unable to getPlayInfo");
            return null;
        }
        tXVodDownloadMediaInfo.netApi = fVar;
        this.mMediaInfoArray.add(tXVodDownloadMediaInfo);
        return tXVodDownloadMediaInfo;
    }

    public TXVodDownloadMediaInfo startDownloadUrl(String str) {
        TXVodDownloadMediaInfo tXVodDownloadMediaInfo = new TXVodDownloadMediaInfo();
        tXVodDownloadMediaInfo.url = str;
        this.mMediaInfoArray.add(tXVodDownloadMediaInfo);
        downloadMedia(tXVodDownloadMediaInfo);
        return tXVodDownloadMediaInfo;
    }

    public void stopDownload(TXVodDownloadMediaInfo tXVodDownloadMediaInfo) {
        if (tXVodDownloadMediaInfo == null) {
            return;
        }
        tXVodDownloadMediaInfo.isStop = true;
        int i11 = tXVodDownloadMediaInfo.tid;
        if (i11 < 0) {
            TXCLog.w(TAG, "stop download not start task");
            return;
        }
        this.mDownloadCenter.stop(i11);
        TXCLog.d(TAG, "stop download " + tXVodDownloadMediaInfo.url);
    }
}

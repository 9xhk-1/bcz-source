package com.tencent.rtmp.downloader;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public interface ITXVodDownloadListener {
    int hlsKeyVerify(TXVodDownloadMediaInfo tXVodDownloadMediaInfo, String str, byte[] bArr);

    void onDownloadError(TXVodDownloadMediaInfo tXVodDownloadMediaInfo, int i11, String str);

    void onDownloadFinish(TXVodDownloadMediaInfo tXVodDownloadMediaInfo);

    void onDownloadProgress(TXVodDownloadMediaInfo tXVodDownloadMediaInfo);

    void onDownloadStart(TXVodDownloadMediaInfo tXVodDownloadMediaInfo);

    void onDownloadStop(TXVodDownloadMediaInfo tXVodDownloadMediaInfo);
}

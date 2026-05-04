package com.tencent.rtmp.downloader;

import com.tencent.liteav.network.f;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class TXVodDownloadMediaInfo {
    protected TXVodDownloadDataSource dataSource;
    protected int downloadSegments;
    protected int downloadSize;
    protected int duration;
    protected boolean isStop;
    protected f netApi;
    protected String playPath;
    protected float progress;
    protected int segments;
    protected int size;
    protected int tid = -1;
    protected String url;

    public TXVodDownloadDataSource getDataSource() {
        return this.dataSource;
    }

    public int getDownloadSize() {
        return this.downloadSize;
    }

    public int getDuration() {
        return this.duration;
    }

    public String getPlayPath() {
        return this.playPath;
    }

    public float getProgress() {
        int i11;
        int i12 = this.size;
        if (i12 > 0) {
            i11 = this.downloadSize;
        } else {
            i12 = this.segments;
            if (i12 <= 0) {
                return 0.0f;
            }
            i11 = this.downloadSegments;
        }
        return i11 / i12;
    }

    public int getSize() {
        return this.size;
    }

    public int getTaskId() {
        return this.tid;
    }

    public String getUrl() {
        return this.url;
    }
}

package com.tencent.rtmp.downloader;

import com.tencent.rtmp.TXPlayerAuthBuilder;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class TXVodDownloadDataSource {
    public static final int QUALITY_2K = 5;
    public static final int QUALITY_4K = 6;
    public static final int QUALITY_FHD = 4;
    public static final int QUALITY_FLU = 1;
    public static final int QUALITY_HD = 3;
    public static final int QUALITY_OD = 0;
    public static final int QUALITY_SD = 2;
    public static final int QUALITY_UNK = 1000;
    protected TXPlayerAuthBuilder authBuilder;
    protected int quality;
    protected String templateName;
    protected String token;

    public TXVodDownloadDataSource(TXPlayerAuthBuilder tXPlayerAuthBuilder, int i11) {
        this.authBuilder = tXPlayerAuthBuilder;
        this.quality = i11;
    }

    public static String qualityToId(int i11) {
        return i11 == 1 ? "FLU" : i11 == 2 ? "SD" : i11 == 3 ? "HD" : i11 == 4 ? "FHD" : i11 == 5 ? "2K" : i11 == 6 ? "4K" : "";
    }

    public TXPlayerAuthBuilder getAuthBuilder() {
        return this.authBuilder;
    }

    public int getQuality() {
        return this.quality;
    }

    public String getTemplateName() {
        return this.templateName;
    }

    public String getToken() {
        return this.token;
    }

    public void setToken(String str) {
        this.token = str;
    }

    public TXVodDownloadDataSource(TXPlayerAuthBuilder tXPlayerAuthBuilder, String str) {
        this.quality = 1000;
        this.authBuilder = tXPlayerAuthBuilder;
        this.templateName = str;
    }
}

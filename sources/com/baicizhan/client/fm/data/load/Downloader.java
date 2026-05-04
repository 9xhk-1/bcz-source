package com.baicizhan.client.fm.data.load;

import com.baicizhan.client.framework.network.http.download.IDownloadManager;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import qb.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class Downloader {
    static final int DEF_TURN_SIZE = 1;
    List<com.baicizhan.client.framework.network.http.download.a> mDLManagers = new ArrayList(1);
    Set<String> mFailedUrls = new HashSet(1);
    private final FmLoader mLoader;
    private int mTrace;
    int mTurnSize;

    public Downloader(FmLoader loader) {
        if (loader == null) {
            throw new RuntimeException("fm downloader cannot be initialized for null fm loader.");
        }
        this.mLoader = loader;
    }

    public void cancel() {
        Iterator<com.baicizhan.client.framework.network.http.download.a> it = this.mDLManagers.iterator();
        while (it.hasNext()) {
            it.next().stop();
        }
        this.mDLManagers.clear();
    }

    public void download() {
        this.mFailedUrls.clear();
        this.mTurnSize = this.mDLManagers.size();
        this.mTrace = 0;
        for (int i11 = 0; i11 < this.mTurnSize; i11++) {
            final com.baicizhan.client.framework.network.http.download.a aVar = this.mDLManagers.get(i11);
            aVar.r(new IDownloadManager.a() { // from class: com.baicizhan.client.fm.data.load.Downloader.1
                @Override // com.baicizhan.client.framework.network.http.download.IDownloadManager.a
                public void onComplete(boolean success, String target, int errCode) {
                    c.b("whiz", "!!! download success: " + success + "; target: " + target + "; errcode: " + errCode, new Object[0]);
                    if (success) {
                        Downloader.this.mLoader.onDownloaded(true, target, aVar.getUrl());
                        Downloader.this.mTrace++;
                        Downloader downloader = Downloader.this;
                        if (downloader.mTurnSize == downloader.mTrace) {
                            Downloader.this.mDLManagers.clear();
                            Downloader.this.mLoader.onTurnFinished();
                            return;
                        }
                        return;
                    }
                    if (Downloader.this.mFailedUrls.contains(aVar.getUrl())) {
                        Downloader.this.mLoader.onDownloaded(false, target, aVar.getUrl());
                        return;
                    }
                    if (aVar.getUrl().indexOf(Downloader.this.mLoader.mUrlHost) < 0) {
                        Downloader.this.mLoader.onDownloaded(false, target, aVar.getUrl());
                        return;
                    }
                    String str = Downloader.this.mLoader.mUrlHostCand + aVar.getUrl().substring(Downloader.this.mLoader.mUrlHost.length());
                    aVar.t(str).start();
                    c.i("", "single fm download with a candidate url [%s]", str);
                    Downloader.this.mFailedUrls.add(aVar.getUrl());
                }

                @Override // com.baicizhan.client.framework.network.http.download.IDownloadManager.a
                public void onPause() {
                }

                @Override // com.baicizhan.client.framework.network.http.download.IDownloadManager.a
                public void onResume() {
                }

                @Override // com.baicizhan.client.framework.network.http.download.IDownloadManager.a
                public void onStart() {
                }

                @Override // com.baicizhan.client.framework.network.http.download.IDownloadManager.a
                public void onStartDecompress() {
                }

                @Override // com.baicizhan.client.framework.network.http.download.IDownloadManager.a
                public void onStop() {
                }

                @Override // com.baicizhan.client.framework.network.http.download.IDownloadManager.a
                public void onProgress(int i12) {
                }

                @Override // com.baicizhan.client.framework.network.http.download.IDownloadManager.a
                public void onGroupComplete(boolean success, List<String> targets, int errCode) {
                }
            }).start();
        }
    }
}

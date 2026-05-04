package com.baicizhan.client.fm.data.load;

import android.content.Context;
import com.baicizhan.client.business.dataset.models.WordMediaRecord;
import com.baicizhan.client.fm.data.load.AllDownloader;
import com.baicizhan.client.fm.data.load.FmListLoader;
import j9.a;
import java.util.ArrayList;
import java.util.List;
import qb.c;
import qb0.g;
import qb0.h;
import xb.e;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class AllDownloaderCreator implements a.e {
    public static final int ERR_NETWORKS = -1;
    public static final int ERR_NODATA = -2;
    public static final int NO_ERR = 0;
    private AllDownloader.OnAllDownloadListener mAllDownloadListener;
    private boolean mAutoDestroy;
    private int mBookid;
    private Context mContext;
    private boolean mDownloadHigh;
    private h mGetFmInfoSubscription;
    private OnAllDownloaderCreateListener mListener;
    private List<WordMediaRecord> mMediaRecords;
    private List<String> mWordIds;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Builder {
        private AllDownloader.OnAllDownloadListener mAllDownloadListener;
        private int mBookid;
        private Context mContext;
        private OnAllDownloaderCreateListener mListener;
        private boolean mAutoDestroy = false;
        private boolean mDownloadHigh = false;

        public Builder autoDestroy(boolean auto) {
            this.mAutoDestroy = auto;
            return this;
        }

        public AllDownloaderCreator build() {
            AllDownloaderCreator allDownloaderCreator = new AllDownloaderCreator(this.mContext);
            allDownloaderCreator.mAutoDestroy = this.mAutoDestroy;
            allDownloaderCreator.mDownloadHigh = this.mDownloadHigh;
            allDownloaderCreator.mBookid = this.mBookid;
            allDownloaderCreator.mListener = this.mListener;
            allDownloaderCreator.mAllDownloadListener = this.mAllDownloadListener;
            this.mContext = null;
            return allDownloaderCreator;
        }

        public Builder downloadHigh(boolean high) {
            this.mDownloadHigh = high;
            return this;
        }

        public Builder setBookid(int bookid) {
            this.mBookid = bookid;
            return this;
        }

        public Builder setCreateCallback(OnAllDownloaderCreateListener callback) {
            this.mListener = callback;
            return this;
        }

        public Builder setDownloadCallback(AllDownloader.OnAllDownloadListener callback) {
            this.mAllDownloadListener = callback;
            return this;
        }

        public Builder with(Context context) {
            this.mContext = context;
            return this;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface OnAllDownloaderCreateListener {
        void onAllDownloaderCreate(AllDownloader downloader, int errCode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyCallback(AllDownloader downloader, boolean bookLoaded) {
        if (downloader != null) {
            downloader.onGetFmInfos(this.mMediaRecords);
            return;
        }
        if (this.mListener != null) {
            AllDownloader allDownloader = new AllDownloader(this.mContext, this);
            allDownloader.mWordIds = this.mWordIds;
            allDownloader.mMediaRecords = this.mMediaRecords;
            allDownloader.mDownLoadHigh = this.mDownloadHigh;
            allDownloader.mListener = this.mAllDownloadListener;
            if ((e.h(this.mWordIds) || e.h(this.mMediaRecords)) && bookLoaded) {
                this.mListener.onAllDownloaderCreate(allDownloader, -1);
            } else if (e.h(this.mWordIds)) {
                this.mListener.onAllDownloaderCreate(allDownloader, -2);
            } else {
                this.mListener.onAllDownloaderCreate(allDownloader, 0);
            }
        }
    }

    private void tryDestroy() {
        if (this.mAutoDestroy) {
            destroy();
        }
    }

    public void create() {
        h hVar = this.mGetFmInfoSubscription;
        if (hVar != null && !hVar.isUnsubscribed()) {
            this.mGetFmInfoSubscription.unsubscribe();
        }
        this.mGetFmInfoSubscription = FmListLoader.getWordIds(this.mContext, this.mBookid).I3(tb0.a.a()).r5(new g<FmListLoader.FmParams>() { // from class: com.baicizhan.client.fm.data.load.AllDownloaderCreator.1
            @Override // qb0.c
            public void onError(Throwable e11) {
                c.c("", "get word ids failed.", e11);
                AllDownloaderCreator.this.notifyCallback(null, false);
            }

            @Override // qb0.c
            public void onNext(FmListLoader.FmParams fmParams) {
                List<String> list = fmParams.wordids;
                if (list != null && !list.isEmpty()) {
                    AllDownloaderCreator.this.mWordIds = fmParams.wordids;
                }
                List<WordMediaRecord> list2 = fmParams.fmrecords;
                if (list2 != null && !list2.isEmpty()) {
                    AllDownloaderCreator.this.mMediaRecords = fmParams.fmrecords;
                }
                AllDownloaderCreator.this.notifyCallback(null, fmParams.bookLoaded);
            }

            @Override // qb0.c
            public void onCompleted() {
            }
        });
    }

    public void destroy() {
        h hVar = this.mGetFmInfoSubscription;
        if (hVar != null && !hVar.isUnsubscribed()) {
            this.mGetFmInfoSubscription.unsubscribe();
        }
        this.mContext = null;
    }

    public void getFmInfos(final AllDownloader downloader) {
        h hVar = this.mGetFmInfoSubscription;
        if (hVar != null && !hVar.isUnsubscribed()) {
            this.mGetFmInfoSubscription.unsubscribe();
        }
        this.mGetFmInfoSubscription = FmListLoader.getFmInfos(this.mContext, this.mBookid).I3(tb0.a.a()).r5(new g<FmListLoader.FmParams>() { // from class: com.baicizhan.client.fm.data.load.AllDownloaderCreator.2
            @Override // qb0.c
            public void onError(Throwable e11) {
                c.c("", "get fm infos failed.", e11);
                AllDownloaderCreator.this.notifyCallback(downloader, false);
            }

            @Override // qb0.c
            public void onNext(FmListLoader.FmParams fmParams) {
                List<WordMediaRecord> list = fmParams.fmrecords;
                if (list != null && !list.isEmpty()) {
                    AllDownloaderCreator.this.mMediaRecords = fmParams.fmrecords;
                }
                AllDownloaderCreator.this.notifyCallback(downloader, fmParams.bookLoaded);
            }

            @Override // qb0.c
            public void onCompleted() {
            }
        });
    }

    public boolean isAlive() {
        return this.mContext != null;
    }

    private AllDownloaderCreator(Context context) {
        this.mAutoDestroy = false;
        this.mDownloadHigh = false;
        this.mBookid = -1;
        this.mWordIds = new ArrayList();
        this.mContext = context;
    }

    @Override // j9.a.e
    public void onMidRefreshed(boolean success, int errCode) {
    }

    @Override // j9.a.e
    public void onUpdated(boolean success, int errCode) {
    }

    @Override // j9.a.e
    public void onInserted(boolean success, int errCode, List<WordMediaRecord> records) {
    }
}

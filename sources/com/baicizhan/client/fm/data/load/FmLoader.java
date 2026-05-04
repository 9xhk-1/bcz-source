package com.baicizhan.client.fm.data.load;

import com.baicizhan.client.fm.data.ITargetList;
import qb.c;
import rb.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class FmLoader<T extends ITargetList> {
    private static final int DEF_MAX_BUFFER_SIZE = 10;
    public static final int LOAD_DOWNLOAD_FAILED = -2;
    public static final int LOAD_NO_FM = -1;
    public static final int LOAD_SUCCESS = 0;
    private static final int WIFI_MAX_BUFFER_SIZE = 10;
    private static final int _2G_MAX_BUFFER_SIZE = 2;
    private static final int _3G_MAX_BUFFER_SIZE = 3;
    private static final int _4G_MAX_BUFFER_SIZE = 5;
    private int mBufferSize;
    private int mCrawlIndex;
    private OnFmLoadListener mListener;
    T mTargets;
    boolean mLoadHigh = false;
    private int mMaxBufferSize = 10;
    private final Downloader mDownloader = new Downloader(this);
    final String mUrlHost = hostFromCheckInfo();
    final String mUrlHostCand = hostCandFromCheckInfo();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface OnFmLoadListener {
        void onIdle();

        void onLoaded(boolean success, int code, String abspath, String url);
    }

    private void adjustMaxBufferSize() {
        int b11 = d.b(pb.a.a());
        if (b11 != -1) {
            if (b11 == 1) {
                this.mMaxBufferSize = 5;
                return;
            } else if (b11 == 2) {
                this.mMaxBufferSize = 3;
                return;
            } else if (b11 != 3) {
                this.mMaxBufferSize = 10;
                return;
            }
        }
        this.mMaxBufferSize = 2;
    }

    private static String hostCandFromCheckInfo() {
        return gb.d.a();
    }

    private static String hostFromCheckInfo() {
        return gb.d.b();
    }

    private boolean loadHigh() {
        if (d.b(pb.a.a()) == 0) {
            return true;
        }
        return this.mLoadHigh;
    }

    public void cancel() {
        this.mDownloader.cancel();
    }

    public void extractOfflineFms() {
        T t11 = this.mTargets;
        if (t11 == null) {
            return;
        }
        t11.extractOfflines();
    }

    public T getTargets() {
        return this.mTargets;
    }

    public boolean hasOfflineFms() {
        T t11 = this.mTargets;
        if (t11 != null && !t11.isEmpty()) {
            int size = this.mTargets.size();
            for (int i11 = 0; i11 < size; i11++) {
                if (this.mTargets.getLocalPath(i11) != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public void load(int index, OnFmLoadListener l11) {
        this.mCrawlIndex = index;
        this.mBufferSize = 0;
        cancel();
        load(l11);
    }

    public void onDownloaded(boolean success, String abspath, String url) {
        if (success) {
            this.mBufferSize++;
        }
        OnFmLoadListener onFmLoadListener = this.mListener;
        if (onFmLoadListener != null) {
            onFmLoadListener.onLoaded(success, success ? 0 : -2, abspath, url);
        }
    }

    public void onTurnFinished() {
        if (this.mBufferSize < Math.min(this.mMaxBufferSize, this.mTargets.size())) {
            load(this.mListener);
            return;
        }
        OnFmLoadListener onFmLoadListener = this.mListener;
        if (onFmLoadListener != null) {
            onFmLoadListener.onIdle();
        }
    }

    public void setLoadHigh(boolean high) {
        c.b("whiz", "fm download high: " + high, new Object[0]);
        this.mLoadHigh = high;
    }

    public void load(OnFmLoadListener l11) {
        this.mListener = l11;
        T t11 = this.mTargets;
        if (t11 != null && !t11.isEmpty()) {
            adjustMaxBufferSize();
            int size = this.mTargets.size();
            if (this.mCrawlIndex >= size) {
                this.mCrawlIndex = 0;
            }
            boolean loadHigh = loadHigh();
            int i11 = this.mCrawlIndex;
            String localPath = this.mTargets.getLocalPath(i11);
            if (localPath != null) {
                this.mBufferSize++;
                OnFmLoadListener onFmLoadListener = this.mListener;
                if (onFmLoadListener != null) {
                    onFmLoadListener.onLoaded(true, 0, localPath, null);
                }
            } else {
                com.baicizhan.client.framework.network.http.download.a aVar = new com.baicizhan.client.framework.network.http.download.a();
                aVar.t(this.mUrlHost + this.mTargets.getPath(i11, loadHigh)).b(this.mTargets.getSavedPath(i11, loadHigh));
                this.mDownloader.mDLManagers.add(aVar);
            }
            this.mCrawlIndex = (this.mCrawlIndex + 1) % size;
            if (this.mDownloader.mDLManagers.isEmpty()) {
                if (this.mBufferSize < Math.min(this.mMaxBufferSize, this.mTargets.size())) {
                    load(this.mListener);
                    return;
                }
                OnFmLoadListener onFmLoadListener2 = this.mListener;
                if (onFmLoadListener2 != null) {
                    onFmLoadListener2.onIdle();
                    return;
                }
                return;
            }
            this.mDownloader.download();
            return;
        }
        OnFmLoadListener onFmLoadListener3 = this.mListener;
        if (onFmLoadListener3 != null) {
            onFmLoadListener3.onLoaded(false, -1, null, null);
        }
    }
}

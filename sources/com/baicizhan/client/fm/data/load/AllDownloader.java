package com.baicizhan.client.fm.data.load;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import com.baicizhan.client.business.dataset.models.WordMediaRecord;
import com.baicizhan.client.business.util.PathUtil;
import com.baicizhan.client.business.util.SpKeys;
import com.baicizhan.client.fm.data.db.FmDBAccessObservables;
import com.jiongji.andriod.card.R;
import gb.d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kc.r;
import kc.u;
import qb.c;
import qb0.g;
import qb0.h;
import ub.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class AllDownloader {
    public static final int ERR_NETWORKS = -4;
    public static final int ERR_NOWORDS = -2;
    public static final int ERR_OFFLINE = -1;
    public static final int ERR_USR_CANCEL = -3;
    private static final int KEEP_ALIVE = 0;
    private static final int MSG_DONE = 3;
    private static final int MSG_PROGRESS = 0;
    private static final int MSG_UPDATE = 2;
    public static final int NO_ERR = 0;
    private static final int POOL_SIZE = 4;
    private static final int STATE_DOWNLOADING = 2;
    private static final int STATE_INITING = 1;
    private static final int STATE_STOPPED = 0;
    private static final String TAG = "AllDownloader";
    private static final String sHome = PathUtil.getBaicizhanAppRoot();
    private Context mContext;
    AllDownloaderCreator mCreator;
    private int mDownloaded;
    private h mGetUnDownloadedMediasSubscription;
    OnAllDownloadListener mListener;
    List<WordMediaRecord> mMediaRecords;
    private Executor mThreadPoolExecutor;
    private List<WordMediaRecord> mUndndMediaRecords;
    List<String> mWordIds;
    volatile boolean mDownLoadHigh = false;
    private int mState = 0;
    private int mErrCode = 0;
    private final List<SegDownloadTask> mDownloadTasks = new ArrayList(4);
    private boolean mTaskDoneFlag = true;
    private final String mUrlHost = hostFromCheckInfo();
    private final String mUrlHostCand = hostCandFromCheckInfo();
    private DownloadHandler mDownloadHandler = new DownloadHandler(this);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AllDownThreadFactory implements ThreadFactory {
        private final AtomicInteger mCount;

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable r11) {
            return new Thread(r11, "SegDownloadTask #" + this.mCount.getAndIncrement());
        }

        private AllDownThreadFactory() {
            this.mCount = new AtomicInteger(1);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class DownloadHandler extends Handler {
        final WeakReference<AllDownloader> mDownloader;

        public DownloadHandler(AllDownloader downloader) {
            super(Looper.getMainLooper());
            this.mDownloader = new WeakReference<>(downloader);
        }

        @Override // android.os.Handler
        public void handleMessage(Message msg) {
            AllDownloader allDownloader = this.mDownloader.get();
            if (allDownloader == null) {
                return;
            }
            int i11 = msg.what;
            if (i11 == 0) {
                if (allDownloader.isDownloading()) {
                    allDownloader.mDownloaded++;
                    OnAllDownloadListener onAllDownloadListener = allDownloader.mListener;
                    if (onAllDownloadListener != null) {
                        onAllDownloadListener.onAllDownloadProgress((allDownloader.mDownloaded * 100) / allDownloader.mMediaRecords.size(), allDownloader.mDownloaded, allDownloader.mMediaRecords.size());
                        return;
                    }
                    return;
                }
                return;
            }
            if (i11 == 2) {
                OnAllDownloadListener onAllDownloadListener2 = allDownloader.mListener;
                if (onAllDownloadListener2 != null) {
                    if (allDownloader.mMediaRecords == null) {
                        onAllDownloadListener2.onAllDownloadProgress(0, 0, 0);
                        return;
                    } else {
                        onAllDownloadListener2.onAllDownloadProgress((allDownloader.mDownloaded * 100) / allDownloader.mMediaRecords.size(), allDownloader.mDownloaded, allDownloader.mMediaRecords.size());
                        return;
                    }
                }
                return;
            }
            if (i11 != 3) {
                return;
            }
            allDownloader.mTaskDoneFlag &= msg.arg1 != 0;
            allDownloader.mDownloadTasks.remove(msg.obj);
            if (allDownloader.mDownloadTasks.size() == 0) {
                if (allDownloader.mListener != null) {
                    allDownloader.mErrCode = allDownloader.mTaskDoneFlag ? 0 : -4;
                    allDownloader.mListener.onAllDownloaded(allDownloader.mTaskDoneFlag && allDownloader.mDownloaded >= allDownloader.mMediaRecords.size(), allDownloader.mErrCode);
                }
                allDownloader.reset();
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface OnAllDownloadListener {
        void onAllDownloadInit(int progress, int completed, int total);

        void onAllDownloadProgress(int progress, int completed, int total);

        void onAllDownloaded(boolean success, int errCode);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SegDownloadTask extends AsyncTask<List<WordMediaRecord>, Void, Boolean> {
        transient boolean mCanceling = false;
        final String mHost;
        final WeakReference<AllDownloader> weakDownloader;

        public SegDownloadTask(AllDownloader downloader, String host) {
            this.weakDownloader = new WeakReference<>(downloader);
            this.mHost = host;
        }

        public void cancel() {
            this.mCanceling = true;
            AllDownloader allDownloader = this.weakDownloader.get();
            if (allDownloader == null) {
                return;
            }
            allDownloader.sendUpdate();
        }

        @Override // android.os.AsyncTask
        public Boolean doInBackground(final List<WordMediaRecord>... params) {
            AllDownloader allDownloader = this.weakDownloader.get();
            if (allDownloader == null || params == null || params.length == 0) {
                return Boolean.FALSE;
            }
            List<WordMediaRecord> list = params[0];
            if (list == null || list.isEmpty()) {
                return Boolean.FALSE;
            }
            c.b(AllDownloader.TAG, "%d to be downloaded", Integer.valueOf(list.size()));
            ub.a a11 = new a.b().i(10000).f(5000).c(null).a();
            Iterator<WordMediaRecord> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                WordMediaRecord next = it.next();
                if (this.mCanceling) {
                    c.b(AllDownloader.TAG, "download fm cancelled, thread # " + Thread.currentThread().getId(), new Object[0]);
                    super.cancel(true);
                    break;
                }
                String highfmpath = allDownloader.downloadHigh() ? next.getHighfmpath() : next.getFmpath();
                String str = this.mHost + highfmpath;
                String c11 = d.c(AllDownloader.sHome + highfmpath);
                a11.H(str);
                a11.E(c11);
                if (!a11.I()) {
                    c.d(AllDownloader.TAG, "download fm failed, url [%s], errCode [%d]", str, Integer.valueOf(a11.r()));
                    return Boolean.FALSE;
                }
                allDownloader.sendProgress();
            }
            c.b(AllDownloader.TAG, "downloaded fm succeeded", new Object[0]);
            return Boolean.TRUE;
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(Boolean aBoolean) {
            super.onPostExecute((SegDownloadTask) aBoolean);
            AllDownloader allDownloader = this.weakDownloader.get();
            if (allDownloader == null) {
                return;
            }
            allDownloader.sendDone(aBoolean.booleanValue(), this);
        }
    }

    public AllDownloader(Context context, AllDownloaderCreator creator) {
        this.mContext = context;
        this.mCreator = creator;
    }

    private void cancelDownload() {
        Iterator<SegDownloadTask> it = this.mDownloadTasks.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void doDownload() {
        if (!rb.d.f(this.mContext)) {
            this.mErrCode = -1;
            OnAllDownloadListener onAllDownloadListener = this.mListener;
            if (onAllDownloadListener != null) {
                onAllDownloadListener.onAllDownloaded(false, -1);
                return;
            }
            return;
        }
        List<WordMediaRecord> list = this.mMediaRecords;
        if (list == null || list.isEmpty()) {
            this.mErrCode = -2;
            OnAllDownloadListener onAllDownloadListener2 = this.mListener;
            if (onAllDownloadListener2 != null) {
                onAllDownloadListener2.onAllDownloaded(false, -2);
                return;
            }
            return;
        }
        if (this.mUndndMediaRecords == null) {
            this.mErrCode = -2;
            OnAllDownloadListener onAllDownloadListener3 = this.mListener;
            if (onAllDownloadListener3 != null) {
                onAllDownloadListener3.onAllDownloaded(false, -2);
                return;
            }
            return;
        }
        int size = this.mMediaRecords.size() - this.mUndndMediaRecords.size();
        this.mDownloaded = size;
        OnAllDownloadListener onAllDownloadListener4 = this.mListener;
        if (onAllDownloadListener4 != null) {
            onAllDownloadListener4.onAllDownloadProgress((size * 100) / this.mMediaRecords.size(), this.mDownloaded, this.mMediaRecords.size());
        }
        if (this.mDownloaded == this.mMediaRecords.size()) {
            this.mErrCode = 0;
            OnAllDownloadListener onAllDownloadListener5 = this.mListener;
            if (onAllDownloadListener5 != null) {
                onAllDownloadListener5.onAllDownloaded(true, 0);
                return;
            }
            return;
        }
        int b11 = rb.d.b(this.mContext);
        if (b11 != 0) {
            if (b11 != 1 && b11 != 2 && b11 != 3 && b11 != 4) {
                this.mErrCode = -1;
                OnAllDownloadListener onAllDownloadListener6 = this.mListener;
                if (onAllDownloadListener6 != null) {
                    onAllDownloadListener6.onAllDownloaded(false, -1);
                    return;
                }
                return;
            }
            if (!nc.b.b().getBoolean(SpKeys.KEY_GLOBAL_AUDIO_CENTER_CELLULAR_DOWNLOAD, false)) {
                int size2 = this.mUndndMediaRecords.size();
                float f11 = size2;
                String string = this.mDownLoadHigh ? this.mContext.getString(R.string.fm_load_warn_msg_downall_mobile_high, Integer.valueOf(size2), Integer.valueOf((int) (f11 * 0.15f))) : this.mContext.getString(R.string.fm_load_warn_msg_downall_mobile_low, Integer.valueOf(size2), Integer.valueOf((int) (0.05f * f11)));
                Context context = this.mContext;
                mc.a.n((FragmentActivity) context, ((u) new u.a(context).L(R.string.fm_load_warn_title).V(string).d()).f0(new r() { // from class: com.baicizhan.client.fm.data.load.AllDownloader.2
                    @Override // kc.r, kc.q
                    public void onDialogNegativeClick(@NonNull View view) {
                        AllDownloader.this.mErrCode = -3;
                        AllDownloader allDownloader = AllDownloader.this;
                        OnAllDownloadListener onAllDownloadListener7 = allDownloader.mListener;
                        if (onAllDownloadListener7 != null) {
                            onAllDownloadListener7.onAllDownloaded(false, allDownloader.mErrCode);
                        }
                        AllDownloader.this.cancel();
                    }

                    @Override // kc.r, kc.q
                    public void onDialogPositiveClick(@NonNull View view) {
                        nc.b.b().j(SpKeys.KEY_GLOBAL_AUDIO_CENTER_CELLULAR_DOWNLOAD, true);
                        AllDownloader.this.startDownload();
                    }
                }), "wifi-prompt");
                return;
            }
            c.i(TAG, "cellular prompt not needed.", new Object[0]);
        }
        this.mErrCode = 0;
        startDownload();
    }

    private void doinit() {
        if (isPrepared()) {
            getUnDownloadedMedias();
        } else {
            this.mCreator.getFmInfos(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean downloadHigh() {
        if (rb.d.b(this.mContext) == 0) {
            return true;
        }
        return this.mDownLoadHigh;
    }

    private void getUnDownloadedMedias() {
        h hVar = this.mGetUnDownloadedMediasSubscription;
        if (hVar != null && !hVar.isUnsubscribed()) {
            this.mGetUnDownloadedMediasSubscription.unsubscribe();
        }
        this.mGetUnDownloadedMediasSubscription = FmDBAccessObservables.getUnDownloadedMedias(this.mMediaRecords).I3(tb0.a.a()).r5(new g<List<WordMediaRecord>>() { // from class: com.baicizhan.client.fm.data.load.AllDownloader.1
            @Override // qb0.c
            public void onError(Throwable e11) {
                c.c("", "get un downloaded medias failed.", e11);
                AllDownloader.this.onGetUnDownloadedMedias(null);
            }

            @Override // qb0.c
            public void onNext(List<WordMediaRecord> wordMediaRecords) {
                AllDownloader.this.onGetUnDownloadedMedias(wordMediaRecords);
            }

            @Override // qb0.c
            public void onCompleted() {
            }
        });
    }

    private static String hostCandFromCheckInfo() {
        return d.a();
    }

    private static String hostFromCheckInfo() {
        return d.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onGetUnDownloadedMedias(List<WordMediaRecord> undndMedias) {
        this.mUndndMediaRecords = undndMedias;
        if (undndMedias != null) {
            this.mDownloaded = this.mMediaRecords.size() - this.mUndndMediaRecords.size();
        }
        OnAllDownloadListener onAllDownloadListener = this.mListener;
        if (onAllDownloadListener != null) {
            onAllDownloadListener.onAllDownloadInit((this.mDownloaded * 100) / this.mMediaRecords.size(), this.mDownloaded, this.mMediaRecords.size());
        }
        if (!isDownloading()) {
            reset();
        } else {
            resetIniting();
            doDownload();
        }
    }

    private void resetDownloading() {
        this.mState ^= 2;
    }

    private void resetIniting() {
        this.mState ^= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendDone(boolean z11, SegDownloadTask segDownloadTask) {
        this.mDownloadHandler.obtainMessage(3, z11 ? 1 : 0, 0, segDownloadTask).sendToTarget();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendProgress() {
        this.mDownloadHandler.sendEmptyMessage(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendUpdate() {
        this.mDownloadHandler.sendEmptyMessage(2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startDownload() {
        int size = this.mUndndMediaRecords.size();
        if (size == 0) {
            return;
        }
        this.mThreadPoolExecutor = new ThreadPoolExecutor(4, 4, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(10), new AllDownThreadFactory());
        int min = Math.min(4, size);
        int i11 = size / min;
        this.mTaskDoneFlag = true;
        this.mDownloadTasks.clear();
        int i12 = 0;
        while (i12 < min) {
            List<WordMediaRecord> subList = this.mUndndMediaRecords.subList(i12 * i11, i12 == min + (-1) ? size : (i12 + 1) * i11);
            SegDownloadTask segDownloadTask = new SegDownloadTask(this, i12 % 2 == 0 ? this.mUrlHost : this.mUrlHostCand);
            segDownloadTask.executeOnExecutor(this.mThreadPoolExecutor, subList);
            this.mDownloadTasks.add(segDownloadTask);
            i12++;
        }
    }

    public void cancel() {
        if (isDownloading()) {
            resetDownloading();
        }
        cancelDownload();
    }

    public void destroy() {
        h hVar = this.mGetUnDownloadedMediasSubscription;
        if (hVar != null && !hVar.isUnsubscribed()) {
            this.mGetUnDownloadedMediasSubscription.unsubscribe();
        }
        this.mContext = null;
        this.mListener = null;
    }

    public void download() {
        if (isDownloading()) {
            return;
        }
        if (isIniting()) {
            this.mState |= 2;
            return;
        }
        init();
        this.mState |= 3;
        sendUpdate();
    }

    public int getTotalSize() {
        List<String> list = this.mWordIds;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public boolean hasDownloaded() {
        return isPrepared() && this.mDownloaded == this.mMediaRecords.size();
    }

    public void init() {
        int i11 = this.mState;
        if (i11 != 0) {
            return;
        }
        this.mState = i11 | 1;
        doinit();
    }

    public boolean isDownloading() {
        return (this.mState & 2) == 2;
    }

    public boolean isIniting() {
        return (this.mState & 1) == 1;
    }

    public boolean isPrepared() {
        List<WordMediaRecord> list = this.mMediaRecords;
        return (list == null || list.isEmpty()) ? false : true;
    }

    public void onGetFmInfos(List<WordMediaRecord> records) {
        OnAllDownloadListener onAllDownloadListener;
        this.mMediaRecords = records;
        if (isPrepared()) {
            getUnDownloadedMedias();
            return;
        }
        OnAllDownloadListener onAllDownloadListener2 = this.mListener;
        if (onAllDownloadListener2 != null) {
            onAllDownloadListener2.onAllDownloadInit(0, 0, 0);
        }
        if (isDownloading() && (onAllDownloadListener = this.mListener) != null) {
            onAllDownloadListener.onAllDownloaded(false, -2);
        }
        reset();
    }

    public void reset() {
        this.mState = 0;
    }

    public void setDownLoadHigh(boolean high) {
        this.mDownLoadHigh = high;
    }
}

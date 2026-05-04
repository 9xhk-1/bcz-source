package androidx.media3.exoplayer.offline;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.CheckResult;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.database.DatabaseProvider;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.cache.Cache;
import androidx.media3.datasource.cache.CacheDataSource;
import androidx.media3.exoplayer.offline.Downloader;
import androidx.media3.exoplayer.scheduler.Requirements;
import androidx.media3.exoplayer.scheduler.RequirementsWatcher;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class DownloadManager {
    public static final int DEFAULT_MAX_PARALLEL_DOWNLOADS = 3;
    public static final int DEFAULT_MIN_RETRY_COUNT = 5;
    public static final Requirements DEFAULT_REQUIREMENTS = new Requirements(1);
    private static final int MSG_ADD_DOWNLOAD = 7;
    private static final int MSG_CONTENT_LENGTH_CHANGED = 11;
    private static final int MSG_DOWNLOAD_UPDATE = 3;
    private static final int MSG_INITIALIZE = 1;
    private static final int MSG_INITIALIZED = 1;
    private static final int MSG_PROCESSED = 2;
    private static final int MSG_RELEASE = 13;
    private static final int MSG_REMOVE_ALL_DOWNLOADS = 9;
    private static final int MSG_REMOVE_DOWNLOAD = 8;
    private static final int MSG_SET_DOWNLOADS_PAUSED = 2;
    private static final int MSG_SET_MAX_PARALLEL_DOWNLOADS = 5;
    private static final int MSG_SET_MIN_RETRY_COUNT = 6;
    private static final int MSG_SET_NOT_MET_REQUIREMENTS = 3;
    private static final int MSG_SET_STOP_REASON = 4;
    private static final int MSG_TASK_STOPPED = 10;
    private static final int MSG_UPDATE_PROGRESS = 12;
    private static final String TAG = "DownloadManager";
    private int activeTaskCount;
    private final Handler applicationHandler;
    private final Context context;
    private final WritableDownloadIndex downloadIndex;
    private List<Download> downloads;
    private boolean downloadsPaused;
    private boolean initialized;
    private final InternalHandler internalHandler;
    private final CopyOnWriteArraySet<Listener> listeners;
    private int maxParallelDownloads;
    private int minRetryCount;
    private int notMetRequirements;
    private int pendingMessages;
    private final RequirementsWatcher.Listener requirementsListener;
    private RequirementsWatcher requirementsWatcher;
    private boolean waitingForRequirements;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class DownloadUpdate {
        public final Download download;
        public final List<Download> downloads;

        @Nullable
        public final Exception finalException;
        public final boolean isRemove;

        public DownloadUpdate(Download download, boolean z11, List<Download> list, @Nullable Exception exc) {
            this.download = download;
            this.isRemove = z11;
            this.downloads = list;
            this.finalException = exc;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Task extends Thread implements Downloader.ProgressListener {
        private long contentLength;
        private final DownloadProgress downloadProgress;
        private final Downloader downloader;

        @Nullable
        private Exception finalException;

        @Nullable
        private volatile InternalHandler internalHandler;
        private volatile boolean isCanceled;
        private final boolean isRemove;
        private final int minRetryCount;
        private final DownloadRequest request;

        private static int getRetryDelayMillis(int i11) {
            return Math.min((i11 - 1) * 1000, 5000);
        }

        public void cancel(boolean z11) {
            if (z11) {
                this.internalHandler = null;
            }
            if (this.isCanceled) {
                return;
            }
            this.isCanceled = true;
            this.downloader.cancel();
            interrupt();
        }

        @Override // androidx.media3.exoplayer.offline.Downloader.ProgressListener
        public void onProgress(long j11, long j12, float f11) {
            this.downloadProgress.bytesDownloaded = j12;
            this.downloadProgress.percentDownloaded = f11;
            if (j11 != this.contentLength) {
                this.contentLength = j11;
                InternalHandler internalHandler = this.internalHandler;
                if (internalHandler != null) {
                    internalHandler.obtainMessage(11, (int) (j11 >> 32), (int) j11, this).sendToTarget();
                }
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                if (this.isRemove) {
                    this.downloader.remove();
                } else {
                    long j11 = -1;
                    int i11 = 0;
                    while (!this.isCanceled) {
                        try {
                            this.downloader.download(this);
                            break;
                        } catch (IOException e11) {
                            if (!this.isCanceled) {
                                long j12 = this.downloadProgress.bytesDownloaded;
                                if (j12 != j11) {
                                    i11 = 0;
                                    j11 = j12;
                                }
                                i11++;
                                if (i11 > this.minRetryCount) {
                                    throw e11;
                                }
                                Thread.sleep(getRetryDelayMillis(i11));
                            }
                        }
                    }
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (Exception e12) {
                this.finalException = e12;
            }
            InternalHandler internalHandler = this.internalHandler;
            if (internalHandler != null) {
                internalHandler.obtainMessage(10, this).sendToTarget();
            }
        }

        private Task(DownloadRequest downloadRequest, Downloader downloader, DownloadProgress downloadProgress, boolean z11, int i11, InternalHandler internalHandler) {
            this.request = downloadRequest;
            this.downloader = downloader;
            this.downloadProgress = downloadProgress;
            this.isRemove = z11;
            this.minRetryCount = i11;
            this.internalHandler = internalHandler;
            this.contentLength = -1L;
        }
    }

    public DownloadManager(Context context, DatabaseProvider databaseProvider, Cache cache, DataSource.Factory factory, Executor executor) {
        this(context, new DefaultDownloadIndex(databaseProvider), new DefaultDownloaderFactory(new CacheDataSource.Factory().setCache(cache).setUpstreamDataSourceFactory(factory), executor));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean handleMainMessage(Message message) {
        int i11 = message.what;
        if (i11 == 1) {
            onInitialized((List) message.obj);
        } else if (i11 == 2) {
            onMessageProcessed(message.arg1, message.arg2);
        } else {
            if (i11 != 3) {
                throw new IllegalStateException();
            }
            onDownloadUpdate((DownloadUpdate) message.obj);
        }
        return true;
    }

    public static Download mergeRequest(Download download, DownloadRequest downloadRequest, int i11, long j11) {
        int i12 = download.state;
        long j12 = (i12 == 5 || download.isTerminalState()) ? j11 : download.startTimeMs;
        int i13 = 7;
        if (i12 != 5 && i12 != 7) {
            i13 = i11 != 0 ? 1 : 0;
        }
        return new Download(download.request.copyWithMergedRequest(downloadRequest), i13, j12, j11, -1L, i11, 0);
    }

    private void notifyWaitingForRequirementsChanged() {
        Iterator<Listener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onWaitingForRequirementsChanged(this, this.waitingForRequirements);
        }
    }

    private void onDownloadUpdate(DownloadUpdate downloadUpdate) {
        this.downloads = Collections.unmodifiableList(downloadUpdate.downloads);
        Download download = downloadUpdate.download;
        boolean updateWaitingForRequirements = updateWaitingForRequirements();
        if (downloadUpdate.isRemove) {
            Iterator<Listener> it = this.listeners.iterator();
            while (it.hasNext()) {
                it.next().onDownloadRemoved(this, download);
            }
        } else {
            Iterator<Listener> it2 = this.listeners.iterator();
            while (it2.hasNext()) {
                it2.next().onDownloadChanged(this, download, downloadUpdate.finalException);
            }
        }
        if (updateWaitingForRequirements) {
            notifyWaitingForRequirementsChanged();
        }
    }

    private void onInitialized(List<Download> list) {
        this.initialized = true;
        this.downloads = Collections.unmodifiableList(list);
        boolean updateWaitingForRequirements = updateWaitingForRequirements();
        Iterator<Listener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onInitialized(this);
        }
        if (updateWaitingForRequirements) {
            notifyWaitingForRequirementsChanged();
        }
    }

    private void onMessageProcessed(int i11, int i12) {
        this.pendingMessages -= i11;
        this.activeTaskCount = i12;
        if (isIdle()) {
            Iterator<Listener> it = this.listeners.iterator();
            while (it.hasNext()) {
                it.next().onIdle(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onRequirementsStateChanged(RequirementsWatcher requirementsWatcher, int i11) {
        Requirements requirements = requirementsWatcher.getRequirements();
        if (this.notMetRequirements != i11) {
            this.notMetRequirements = i11;
            this.pendingMessages++;
            this.internalHandler.obtainMessage(3, i11, 0).sendToTarget();
        }
        boolean updateWaitingForRequirements = updateWaitingForRequirements();
        Iterator<Listener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onRequirementsStateChanged(this, requirements, i11);
        }
        if (updateWaitingForRequirements) {
            notifyWaitingForRequirementsChanged();
        }
    }

    private void setDownloadsPaused(boolean z11) {
        if (this.downloadsPaused == z11) {
            return;
        }
        this.downloadsPaused = z11;
        this.pendingMessages++;
        this.internalHandler.obtainMessage(2, z11 ? 1 : 0, 0).sendToTarget();
        boolean updateWaitingForRequirements = updateWaitingForRequirements();
        Iterator<Listener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onDownloadsPausedChanged(this, z11);
        }
        if (updateWaitingForRequirements) {
            notifyWaitingForRequirementsChanged();
        }
    }

    private boolean updateWaitingForRequirements() {
        boolean z11;
        if (!this.downloadsPaused && this.notMetRequirements != 0) {
            for (int i11 = 0; i11 < this.downloads.size(); i11++) {
                if (this.downloads.get(i11).state == 0) {
                    z11 = true;
                    break;
                }
            }
        }
        z11 = false;
        boolean z12 = this.waitingForRequirements != z11;
        this.waitingForRequirements = z11;
        return z12;
    }

    public void addDownload(DownloadRequest downloadRequest) {
        addDownload(downloadRequest, 0);
    }

    public void addListener(Listener listener) {
        Assertions.checkNotNull(listener);
        this.listeners.add(listener);
    }

    public Looper getApplicationLooper() {
        return this.applicationHandler.getLooper();
    }

    public List<Download> getCurrentDownloads() {
        return this.downloads;
    }

    public DownloadIndex getDownloadIndex() {
        return this.downloadIndex;
    }

    public boolean getDownloadsPaused() {
        return this.downloadsPaused;
    }

    public int getMaxParallelDownloads() {
        return this.maxParallelDownloads;
    }

    public int getMinRetryCount() {
        return this.minRetryCount;
    }

    public int getNotMetRequirements() {
        return this.notMetRequirements;
    }

    public Requirements getRequirements() {
        return this.requirementsWatcher.getRequirements();
    }

    public boolean isIdle() {
        return this.activeTaskCount == 0 && this.pendingMessages == 0;
    }

    public boolean isInitialized() {
        return this.initialized;
    }

    public boolean isWaitingForRequirements() {
        return this.waitingForRequirements;
    }

    public void pauseDownloads() {
        setDownloadsPaused(true);
    }

    public void release() {
        synchronized (this.internalHandler) {
            try {
                InternalHandler internalHandler = this.internalHandler;
                if (internalHandler.released) {
                    return;
                }
                internalHandler.sendEmptyMessage(13);
                boolean z11 = false;
                while (true) {
                    InternalHandler internalHandler2 = this.internalHandler;
                    if (internalHandler2.released) {
                        break;
                    }
                    try {
                        internalHandler2.wait();
                    } catch (InterruptedException unused) {
                        z11 = true;
                    }
                }
                if (z11) {
                    Thread.currentThread().interrupt();
                }
                this.applicationHandler.removeCallbacksAndMessages(null);
                this.requirementsWatcher.stop();
                this.downloads = Collections.EMPTY_LIST;
                this.pendingMessages = 0;
                this.activeTaskCount = 0;
                this.initialized = false;
                this.notMetRequirements = 0;
                this.waitingForRequirements = false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void removeAllDownloads() {
        this.pendingMessages++;
        this.internalHandler.obtainMessage(9).sendToTarget();
    }

    public void removeDownload(String str) {
        this.pendingMessages++;
        this.internalHandler.obtainMessage(8, str).sendToTarget();
    }

    public void removeListener(Listener listener) {
        this.listeners.remove(listener);
    }

    public void resumeDownloads() {
        setDownloadsPaused(false);
    }

    public void setMaxParallelDownloads(@IntRange(from = 1) int i11) {
        Assertions.checkArgument(i11 > 0);
        if (this.maxParallelDownloads == i11) {
            return;
        }
        this.maxParallelDownloads = i11;
        this.pendingMessages++;
        this.internalHandler.obtainMessage(5, i11, 0).sendToTarget();
    }

    public void setMinRetryCount(int i11) {
        Assertions.checkArgument(i11 >= 0);
        if (this.minRetryCount == i11) {
            return;
        }
        this.minRetryCount = i11;
        this.pendingMessages++;
        this.internalHandler.obtainMessage(6, i11, 0).sendToTarget();
    }

    public void setRequirements(Requirements requirements) {
        if (requirements.equals(this.requirementsWatcher.getRequirements())) {
            return;
        }
        this.requirementsWatcher.stop();
        RequirementsWatcher requirementsWatcher = new RequirementsWatcher(this.context, this.requirementsListener, requirements);
        this.requirementsWatcher = requirementsWatcher;
        onRequirementsStateChanged(this.requirementsWatcher, requirementsWatcher.start());
    }

    public void setStopReason(@Nullable String str, int i11) {
        this.pendingMessages++;
        this.internalHandler.obtainMessage(4, i11, 0, str).sendToTarget();
    }

    public void addDownload(DownloadRequest downloadRequest, int i11) {
        this.pendingMessages++;
        this.internalHandler.obtainMessage(7, i11, 0, downloadRequest).sendToTarget();
    }

    public DownloadManager(Context context, WritableDownloadIndex writableDownloadIndex, DownloaderFactory downloaderFactory) {
        this.context = context.getApplicationContext();
        this.downloadIndex = writableDownloadIndex;
        this.maxParallelDownloads = 3;
        this.minRetryCount = 5;
        this.downloadsPaused = true;
        this.downloads = Collections.EMPTY_LIST;
        this.listeners = new CopyOnWriteArraySet<>();
        Handler createHandlerForCurrentOrMainLooper = Util.createHandlerForCurrentOrMainLooper(new Handler.Callback() { // from class: androidx.media3.exoplayer.offline.h
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                boolean handleMainMessage;
                handleMainMessage = DownloadManager.this.handleMainMessage(message);
                return handleMainMessage;
            }
        });
        this.applicationHandler = createHandlerForCurrentOrMainLooper;
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:DownloadManager");
        handlerThread.start();
        InternalHandler internalHandler = new InternalHandler(handlerThread, writableDownloadIndex, downloaderFactory, createHandlerForCurrentOrMainLooper, this.maxParallelDownloads, this.minRetryCount, this.downloadsPaused);
        this.internalHandler = internalHandler;
        RequirementsWatcher.Listener listener = new RequirementsWatcher.Listener() { // from class: androidx.media3.exoplayer.offline.i
            @Override // androidx.media3.exoplayer.scheduler.RequirementsWatcher.Listener
            public final void onRequirementsStateChanged(RequirementsWatcher requirementsWatcher, int i11) {
                DownloadManager.this.onRequirementsStateChanged(requirementsWatcher, i11);
            }
        };
        this.requirementsListener = listener;
        RequirementsWatcher requirementsWatcher = new RequirementsWatcher(context, listener, DEFAULT_REQUIREMENTS);
        this.requirementsWatcher = requirementsWatcher;
        int start = requirementsWatcher.start();
        this.notMetRequirements = start;
        this.pendingMessages = 1;
        internalHandler.obtainMessage(1, start, 0).sendToTarget();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class InternalHandler extends Handler {
        private static final int UPDATE_PROGRESS_INTERVAL_MS = 5000;
        private int activeDownloadTaskCount;
        private final HashMap<String, Task> activeTasks;
        private final WritableDownloadIndex downloadIndex;
        private final DownloaderFactory downloaderFactory;
        private final ArrayList<Download> downloads;
        private boolean downloadsPaused;
        private boolean hasActiveRemoveTask;
        private final Handler mainHandler;
        private int maxParallelDownloads;
        private int minRetryCount;
        private int notMetRequirements;
        public boolean released;
        private final HandlerThread thread;

        public InternalHandler(HandlerThread handlerThread, WritableDownloadIndex writableDownloadIndex, DownloaderFactory downloaderFactory, Handler handler, int i11, int i12, boolean z11) {
            super(handlerThread.getLooper());
            this.thread = handlerThread;
            this.downloadIndex = writableDownloadIndex;
            this.downloaderFactory = downloaderFactory;
            this.mainHandler = handler;
            this.maxParallelDownloads = i11;
            this.minRetryCount = i12;
            this.downloadsPaused = z11;
            this.downloads = new ArrayList<>();
            this.activeTasks = new HashMap<>();
        }

        private void addDownload(DownloadRequest downloadRequest, int i11) {
            Download download = getDownload(downloadRequest.f4987id, true);
            long currentTimeMillis = System.currentTimeMillis();
            if (download != null) {
                putDownload(DownloadManager.mergeRequest(download, downloadRequest, i11, currentTimeMillis));
            } else {
                putDownload(new Download(downloadRequest, i11 == 0 ? 0 : 1, currentTimeMillis, currentTimeMillis, -1L, i11, 0));
            }
            syncTasks();
        }

        private boolean canDownloadsRun() {
            return !this.downloadsPaused && this.notMetRequirements == 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int compareStartTimes(Download download, Download download2) {
            return Util.compareLong(download.startTimeMs, download2.startTimeMs);
        }

        private static Download copyDownloadWithState(Download download, int i11, int i12) {
            return new Download(download.request, i11, download.startTimeMs, System.currentTimeMillis(), download.contentLength, i12, 0, download.progress);
        }

        @Nullable
        private Download getDownload(String str, boolean z11) {
            int downloadIndex = getDownloadIndex(str);
            if (downloadIndex != -1) {
                return this.downloads.get(downloadIndex);
            }
            if (!z11) {
                return null;
            }
            try {
                return this.downloadIndex.getDownload(str);
            } catch (IOException e11) {
                Log.e(DownloadManager.TAG, "Failed to load download: " + str, e11);
                return null;
            }
        }

        private int getDownloadIndex(String str) {
            for (int i11 = 0; i11 < this.downloads.size(); i11++) {
                if (this.downloads.get(i11).request.f4987id.equals(str)) {
                    return i11;
                }
            }
            return -1;
        }

        private void initialize(int i11) {
            this.notMetRequirements = i11;
            DownloadCursor downloadCursor = null;
            try {
                try {
                    this.downloadIndex.setDownloadingStatesToQueued();
                    downloadCursor = this.downloadIndex.getDownloads(0, 1, 2, 5, 7);
                    while (downloadCursor.moveToNext()) {
                        this.downloads.add(downloadCursor.getDownload());
                    }
                } catch (IOException e11) {
                    Log.e(DownloadManager.TAG, "Failed to load index.", e11);
                    this.downloads.clear();
                }
                this.mainHandler.obtainMessage(1, new ArrayList(this.downloads)).sendToTarget();
                syncTasks();
            } finally {
                Util.closeQuietly(downloadCursor);
            }
        }

        private void onContentLengthChanged(Task task, long j11) {
            Download download = (Download) Assertions.checkNotNull(getDownload(task.request.f4987id, false));
            if (j11 == download.contentLength || j11 == -1) {
                return;
            }
            putDownload(new Download(download.request, download.state, download.startTimeMs, System.currentTimeMillis(), j11, download.stopReason, download.failureReason, download.progress));
        }

        private void onDownloadTaskStopped(Download download, @Nullable Exception exc) {
            Download download2 = new Download(download.request, exc == null ? 3 : 4, download.startTimeMs, System.currentTimeMillis(), download.contentLength, download.stopReason, exc == null ? 0 : 1, download.progress);
            this.downloads.remove(getDownloadIndex(download2.request.f4987id));
            try {
                this.downloadIndex.putDownload(download2);
            } catch (IOException e11) {
                Log.e(DownloadManager.TAG, "Failed to update index.", e11);
            }
            this.mainHandler.obtainMessage(3, new DownloadUpdate(download2, false, new ArrayList(this.downloads), exc)).sendToTarget();
        }

        private void onRemoveTaskStopped(Download download) {
            if (download.state == 7) {
                int i11 = download.stopReason;
                putDownloadWithState(download, i11 == 0 ? 0 : 1, i11);
                syncTasks();
            } else {
                this.downloads.remove(getDownloadIndex(download.request.f4987id));
                try {
                    this.downloadIndex.removeDownload(download.request.f4987id);
                } catch (IOException unused) {
                    Log.e(DownloadManager.TAG, "Failed to remove from database");
                }
                this.mainHandler.obtainMessage(3, new DownloadUpdate(download, true, new ArrayList(this.downloads), null)).sendToTarget();
            }
        }

        private void onTaskStopped(Task task) {
            String str = task.request.f4987id;
            this.activeTasks.remove(str);
            boolean z11 = task.isRemove;
            if (z11) {
                this.hasActiveRemoveTask = false;
            } else {
                int i11 = this.activeDownloadTaskCount - 1;
                this.activeDownloadTaskCount = i11;
                if (i11 == 0) {
                    removeMessages(12);
                }
            }
            if (task.isCanceled) {
                syncTasks();
                return;
            }
            Exception exc = task.finalException;
            if (exc != null) {
                Log.e(DownloadManager.TAG, "Task failed: " + task.request + j2.O + z11, exc);
            }
            Download download = (Download) Assertions.checkNotNull(getDownload(str, false));
            int i12 = download.state;
            if (i12 == 2) {
                Assertions.checkState(!z11);
                onDownloadTaskStopped(download, exc);
            } else {
                if (i12 != 5 && i12 != 7) {
                    throw new IllegalStateException();
                }
                Assertions.checkState(z11);
                onRemoveTaskStopped(download);
            }
            syncTasks();
        }

        private Download putDownload(Download download) {
            int i11 = download.state;
            Assertions.checkState((i11 == 3 || i11 == 4) ? false : true);
            int downloadIndex = getDownloadIndex(download.request.f4987id);
            if (downloadIndex == -1) {
                this.downloads.add(download);
                Collections.sort(this.downloads, new j());
            } else {
                boolean z11 = download.startTimeMs != this.downloads.get(downloadIndex).startTimeMs;
                this.downloads.set(downloadIndex, download);
                if (z11) {
                    Collections.sort(this.downloads, new j());
                }
            }
            try {
                this.downloadIndex.putDownload(download);
            } catch (IOException e11) {
                Log.e(DownloadManager.TAG, "Failed to update index.", e11);
            }
            this.mainHandler.obtainMessage(3, new DownloadUpdate(download, false, new ArrayList(this.downloads), null)).sendToTarget();
            return download;
        }

        private Download putDownloadWithState(Download download, int i11, int i12) {
            Assertions.checkState((i11 == 3 || i11 == 4) ? false : true);
            return putDownload(copyDownloadWithState(download, i11, i12));
        }

        private void release() {
            Iterator<Task> it = this.activeTasks.values().iterator();
            while (it.hasNext()) {
                it.next().cancel(true);
            }
            try {
                this.downloadIndex.setDownloadingStatesToQueued();
            } catch (IOException e11) {
                Log.e(DownloadManager.TAG, "Failed to update index.", e11);
            }
            this.downloads.clear();
            this.thread.quit();
            synchronized (this) {
                this.released = true;
                notifyAll();
            }
        }

        private void removeAllDownloads() {
            ArrayList arrayList = new ArrayList();
            try {
                DownloadCursor downloads = this.downloadIndex.getDownloads(3, 4);
                while (downloads.moveToNext()) {
                    try {
                        arrayList.add(downloads.getDownload());
                    } finally {
                    }
                }
                downloads.close();
            } catch (IOException unused) {
                Log.e(DownloadManager.TAG, "Failed to load downloads.");
            }
            for (int i11 = 0; i11 < this.downloads.size(); i11++) {
                ArrayList<Download> arrayList2 = this.downloads;
                arrayList2.set(i11, copyDownloadWithState(arrayList2.get(i11), 5, 0));
            }
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                this.downloads.add(copyDownloadWithState((Download) arrayList.get(i12), 5, 0));
            }
            Collections.sort(this.downloads, new j());
            try {
                this.downloadIndex.setStatesToRemoving();
            } catch (IOException e11) {
                Log.e(DownloadManager.TAG, "Failed to update index.", e11);
            }
            ArrayList arrayList3 = new ArrayList(this.downloads);
            for (int i13 = 0; i13 < this.downloads.size(); i13++) {
                this.mainHandler.obtainMessage(3, new DownloadUpdate(this.downloads.get(i13), false, arrayList3, null)).sendToTarget();
            }
            syncTasks();
        }

        private void removeDownload(String str) {
            Download download = getDownload(str, true);
            if (download != null) {
                putDownloadWithState(download, 5, 0);
                syncTasks();
            } else {
                Log.e(DownloadManager.TAG, "Failed to remove nonexistent download: " + str);
            }
        }

        private void setDownloadsPaused(boolean z11) {
            this.downloadsPaused = z11;
            syncTasks();
        }

        private void setMaxParallelDownloads(int i11) {
            this.maxParallelDownloads = i11;
            syncTasks();
        }

        private void setMinRetryCount(int i11) {
            this.minRetryCount = i11;
        }

        private void setNotMetRequirements(int i11) {
            this.notMetRequirements = i11;
            syncTasks();
        }

        private void setStopReason(@Nullable String str, int i11) {
            if (str == null) {
                for (int i12 = 0; i12 < this.downloads.size(); i12++) {
                    setStopReason(this.downloads.get(i12), i11);
                }
                try {
                    this.downloadIndex.setStopReason(i11);
                } catch (IOException e11) {
                    Log.e(DownloadManager.TAG, "Failed to set manual stop reason", e11);
                }
            } else {
                Download download = getDownload(str, false);
                if (download != null) {
                    setStopReason(download, i11);
                } else {
                    try {
                        this.downloadIndex.setStopReason(str, i11);
                    } catch (IOException e12) {
                        Log.e(DownloadManager.TAG, "Failed to set manual stop reason: " + str, e12);
                    }
                }
            }
            syncTasks();
        }

        private void syncDownloadingDownload(Task task, Download download, int i11) {
            Assertions.checkState(!task.isRemove);
            if (!canDownloadsRun() || i11 >= this.maxParallelDownloads) {
                putDownloadWithState(download, 0, 0);
                task.cancel(false);
            }
        }

        @Nullable
        @CheckResult
        private Task syncQueuedDownload(@Nullable Task task, Download download) {
            if (task != null) {
                Assertions.checkState(!task.isRemove);
                task.cancel(false);
                return task;
            }
            if (!canDownloadsRun() || this.activeDownloadTaskCount >= this.maxParallelDownloads) {
                return null;
            }
            Download putDownloadWithState = putDownloadWithState(download, 2, 0);
            Task task2 = new Task(putDownloadWithState.request, this.downloaderFactory.createDownloader(putDownloadWithState.request), putDownloadWithState.progress, false, this.minRetryCount, this);
            this.activeTasks.put(putDownloadWithState.request.f4987id, task2);
            int i11 = this.activeDownloadTaskCount;
            this.activeDownloadTaskCount = i11 + 1;
            if (i11 == 0) {
                sendEmptyMessageDelayed(12, 5000L);
            }
            task2.start();
            return task2;
        }

        private void syncRemovingDownload(@Nullable Task task, Download download) {
            if (task != null) {
                if (task.isRemove) {
                    return;
                }
                task.cancel(false);
            } else {
                if (this.hasActiveRemoveTask) {
                    return;
                }
                Task task2 = new Task(download.request, this.downloaderFactory.createDownloader(download.request), download.progress, true, this.minRetryCount, this);
                this.activeTasks.put(download.request.f4987id, task2);
                this.hasActiveRemoveTask = true;
                task2.start();
            }
        }

        private void syncStoppedDownload(@Nullable Task task) {
            if (task != null) {
                Assertions.checkState(!task.isRemove);
                task.cancel(false);
            }
        }

        private void syncTasks() {
            int i11 = 0;
            for (int i12 = 0; i12 < this.downloads.size(); i12++) {
                Download download = this.downloads.get(i12);
                Task task = this.activeTasks.get(download.request.f4987id);
                int i13 = download.state;
                if (i13 == 0) {
                    task = syncQueuedDownload(task, download);
                } else if (i13 == 1) {
                    syncStoppedDownload(task);
                } else if (i13 == 2) {
                    Assertions.checkNotNull(task);
                    syncDownloadingDownload(task, download, i11);
                } else {
                    if (i13 != 5 && i13 != 7) {
                        throw new IllegalStateException();
                    }
                    syncRemovingDownload(task, download);
                }
                if (task != null && !task.isRemove) {
                    i11++;
                }
            }
        }

        private void updateProgress() {
            for (int i11 = 0; i11 < this.downloads.size(); i11++) {
                Download download = this.downloads.get(i11);
                if (download.state == 2) {
                    try {
                        this.downloadIndex.putDownload(download);
                    } catch (IOException e11) {
                        Log.e(DownloadManager.TAG, "Failed to update index.", e11);
                    }
                }
            }
            sendEmptyMessageDelayed(12, 5000L);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i11 = 0;
            switch (message.what) {
                case 1:
                    initialize(message.arg1);
                    i11 = 1;
                    this.mainHandler.obtainMessage(2, i11, this.activeTasks.size()).sendToTarget();
                    return;
                case 2:
                    setDownloadsPaused(message.arg1 != 0);
                    i11 = 1;
                    this.mainHandler.obtainMessage(2, i11, this.activeTasks.size()).sendToTarget();
                    return;
                case 3:
                    setNotMetRequirements(message.arg1);
                    i11 = 1;
                    this.mainHandler.obtainMessage(2, i11, this.activeTasks.size()).sendToTarget();
                    return;
                case 4:
                    setStopReason((String) message.obj, message.arg1);
                    i11 = 1;
                    this.mainHandler.obtainMessage(2, i11, this.activeTasks.size()).sendToTarget();
                    return;
                case 5:
                    setMaxParallelDownloads(message.arg1);
                    i11 = 1;
                    this.mainHandler.obtainMessage(2, i11, this.activeTasks.size()).sendToTarget();
                    return;
                case 6:
                    setMinRetryCount(message.arg1);
                    i11 = 1;
                    this.mainHandler.obtainMessage(2, i11, this.activeTasks.size()).sendToTarget();
                    return;
                case 7:
                    addDownload((DownloadRequest) message.obj, message.arg1);
                    i11 = 1;
                    this.mainHandler.obtainMessage(2, i11, this.activeTasks.size()).sendToTarget();
                    return;
                case 8:
                    removeDownload((String) message.obj);
                    i11 = 1;
                    this.mainHandler.obtainMessage(2, i11, this.activeTasks.size()).sendToTarget();
                    return;
                case 9:
                    removeAllDownloads();
                    i11 = 1;
                    this.mainHandler.obtainMessage(2, i11, this.activeTasks.size()).sendToTarget();
                    return;
                case 10:
                    onTaskStopped((Task) message.obj);
                    this.mainHandler.obtainMessage(2, i11, this.activeTasks.size()).sendToTarget();
                    return;
                case 11:
                    onContentLengthChanged((Task) message.obj, Util.toLong(message.arg1, message.arg2));
                    return;
                case 12:
                    updateProgress();
                    return;
                case 13:
                    release();
                    return;
                default:
                    throw new IllegalStateException();
            }
        }

        private void setStopReason(Download download, int i11) {
            if (i11 == 0) {
                if (download.state == 1) {
                    putDownloadWithState(download, 0, 0);
                }
            } else if (i11 != download.stopReason) {
                int i12 = download.state;
                if (i12 == 0 || i12 == 2) {
                    i12 = 1;
                }
                putDownload(new Download(download.request, i12, download.startTimeMs, System.currentTimeMillis(), download.contentLength, i11, 0, download.progress));
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface Listener {
        default void onIdle(DownloadManager downloadManager) {
        }

        default void onInitialized(DownloadManager downloadManager) {
        }

        default void onDownloadRemoved(DownloadManager downloadManager, Download download) {
        }

        default void onDownloadsPausedChanged(DownloadManager downloadManager, boolean z11) {
        }

        default void onWaitingForRequirementsChanged(DownloadManager downloadManager, boolean z11) {
        }

        default void onDownloadChanged(DownloadManager downloadManager, Download download, @Nullable Exception exc) {
        }

        default void onRequirementsStateChanged(DownloadManager downloadManager, Requirements requirements, int i11) {
        }
    }
}

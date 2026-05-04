package org.apache.thrift.async;

import java.io.IOException;
import java.io.Serializable;
import java.nio.channels.ClosedSelectorException;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.spi.SelectorProvider;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeoutException;
import org.apache.thrift.TException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class TAsyncClientManager {
    private static final Logger LOGGER = LoggerFactory.getLogger(TAsyncClientManager.class.getName());
    private final ConcurrentLinkedQueue<TAsyncMethodCall> pendingCalls = new ConcurrentLinkedQueue<>();
    private final SelectThread selectThread;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class SelectThread extends Thread {
        private final TreeSet<TAsyncMethodCall> timeoutWatchSet = new TreeSet<>(new TAsyncMethodCallTimeoutComparator());
        private final Selector selector = SelectorProvider.provider().openSelector();
        private volatile boolean running = true;

        public SelectThread() throws IOException {
            setName("TAsyncClientManager#SelectorThread " + getId());
            setDaemon(true);
        }

        private void startPendingMethods() {
            while (true) {
                TAsyncMethodCall tAsyncMethodCall = (TAsyncMethodCall) TAsyncClientManager.this.pendingCalls.poll();
                if (tAsyncMethodCall == null) {
                    return;
                }
                try {
                    tAsyncMethodCall.start(this.selector);
                    TAsyncClient client = tAsyncMethodCall.getClient();
                    if (client.hasTimeout() && !client.hasError()) {
                        this.timeoutWatchSet.add(tAsyncMethodCall);
                    }
                } catch (Exception e11) {
                    TAsyncClientManager.LOGGER.warn("Caught exception in TAsyncClientManager!", (Throwable) e11);
                    tAsyncMethodCall.onError(e11);
                }
            }
        }

        private void timeoutMethods() {
            Iterator<TAsyncMethodCall> it = this.timeoutWatchSet.iterator();
            long currentTimeMillis = System.currentTimeMillis();
            while (it.hasNext()) {
                TAsyncMethodCall next = it.next();
                if (currentTimeMillis < next.getTimeoutTimestamp()) {
                    return;
                }
                it.remove();
                next.onError(new TimeoutException("Operation " + next.getClass() + " timed out after " + (currentTimeMillis - next.getStartTime()) + " ms."));
            }
        }

        private void transitionMethods() {
            try {
                Iterator<SelectionKey> it = this.selector.selectedKeys().iterator();
                while (it.hasNext()) {
                    SelectionKey next = it.next();
                    it.remove();
                    if (next.isValid()) {
                        TAsyncMethodCall tAsyncMethodCall = (TAsyncMethodCall) next.attachment();
                        tAsyncMethodCall.transition(next);
                        if (!tAsyncMethodCall.isFinished() && !tAsyncMethodCall.getClient().hasError()) {
                        }
                        this.timeoutWatchSet.remove(tAsyncMethodCall);
                    }
                }
            } catch (ClosedSelectorException e11) {
                TAsyncClientManager.LOGGER.error("Caught ClosedSelectorException in TAsyncClientManager!", (Throwable) e11);
            }
        }

        public void finish() {
            this.running = false;
            this.selector.wakeup();
        }

        public Selector getSelector() {
            return this.selector;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (this.running) {
                try {
                    try {
                        if (this.timeoutWatchSet.size() == 0) {
                            this.selector.select();
                        } else {
                            long timeoutTimestamp = this.timeoutWatchSet.first().getTimeoutTimestamp() - System.currentTimeMillis();
                            if (timeoutTimestamp > 0) {
                                this.selector.select(timeoutTimestamp);
                            } else {
                                this.selector.selectNow();
                            }
                        }
                    } catch (IOException e11) {
                        TAsyncClientManager.LOGGER.error("Caught IOException in TAsyncClientManager!", (Throwable) e11);
                    }
                    transitionMethods();
                    timeoutMethods();
                    startPendingMethods();
                } catch (Exception e12) {
                    TAsyncClientManager.LOGGER.error("Ignoring uncaught exception in SelectThread", (Throwable) e12);
                }
            }
            try {
                this.selector.close();
            } catch (IOException e13) {
                TAsyncClientManager.LOGGER.warn("Could not close selector. This may result in leaked resources!", (Throwable) e13);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class TAsyncMethodCallTimeoutComparator implements Comparator<TAsyncMethodCall>, Serializable {
        private TAsyncMethodCallTimeoutComparator() {
        }

        @Override // java.util.Comparator
        public int compare(TAsyncMethodCall tAsyncMethodCall, TAsyncMethodCall tAsyncMethodCall2) {
            long timeoutTimestamp;
            long timeoutTimestamp2;
            if (tAsyncMethodCall.getTimeoutTimestamp() == tAsyncMethodCall2.getTimeoutTimestamp()) {
                timeoutTimestamp = tAsyncMethodCall.getSequenceId();
                timeoutTimestamp2 = tAsyncMethodCall2.getSequenceId();
            } else {
                timeoutTimestamp = tAsyncMethodCall.getTimeoutTimestamp();
                timeoutTimestamp2 = tAsyncMethodCall2.getTimeoutTimestamp();
            }
            return (int) (timeoutTimestamp - timeoutTimestamp2);
        }
    }

    public TAsyncClientManager() throws IOException {
        SelectThread selectThread = new SelectThread();
        this.selectThread = selectThread;
        selectThread.start();
    }

    public void call(TAsyncMethodCall tAsyncMethodCall) throws TException {
        if (!isRunning()) {
            throw new TException("SelectThread is not running");
        }
        tAsyncMethodCall.prepareMethodCall();
        this.pendingCalls.add(tAsyncMethodCall);
        this.selectThread.getSelector().wakeup();
    }

    public boolean isRunning() {
        return this.selectThread.isAlive();
    }

    public void stop() {
        this.selectThread.finish();
    }
}

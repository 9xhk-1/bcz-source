package org.apache.thrift.server;

import java.io.IOException;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.spi.AbstractSelector;
import java.nio.channels.spi.SelectorProvider;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import org.apache.thrift.server.AbstractNonblockingServer;
import org.apache.thrift.transport.TNonblockingServerTransport;
import org.apache.thrift.transport.TNonblockingTransport;
import org.apache.thrift.transport.TTransportException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class TThreadedSelectorServer extends AbstractNonblockingServer {
    private static final Logger LOGGER = LoggerFactory.getLogger(TThreadedSelectorServer.class.getName());
    private AcceptThread acceptThread;
    private final Args args;
    private final ExecutorService invoker;
    private final Set<SelectorThread> selectorThreads;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class AcceptThread extends Thread {
        private final Selector acceptSelector;
        private final TNonblockingServerTransport serverTransport;
        private final SelectorThreadLoadBalancer threadChooser;

        public AcceptThread(TNonblockingServerTransport tNonblockingServerTransport, SelectorThreadLoadBalancer selectorThreadLoadBalancer) throws IOException {
            this.serverTransport = tNonblockingServerTransport;
            this.threadChooser = selectorThreadLoadBalancer;
            AbstractSelector openSelector = SelectorProvider.provider().openSelector();
            this.acceptSelector = openSelector;
            tNonblockingServerTransport.registerSelector(openSelector);
        }

        private TNonblockingTransport doAccept() {
            try {
                return (TNonblockingTransport) this.serverTransport.accept();
            } catch (TTransportException e11) {
                TThreadedSelectorServer.LOGGER.warn("Exception trying to accept!", (Throwable) e11);
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void doAddAccept(SelectorThread selectorThread, TNonblockingTransport tNonblockingTransport) {
            if (selectorThread.addAcceptedConnection(tNonblockingTransport)) {
                return;
            }
            tNonblockingTransport.close();
        }

        private void handleAccept() {
            final TNonblockingTransport doAccept = doAccept();
            if (doAccept != null) {
                final SelectorThread nextThread = this.threadChooser.nextThread();
                if (TThreadedSelectorServer.this.args.acceptPolicy == Args.AcceptPolicy.FAST_ACCEPT || TThreadedSelectorServer.this.invoker == null) {
                    doAddAccept(nextThread, doAccept);
                    return;
                }
                try {
                    TThreadedSelectorServer.this.invoker.submit(new Runnable() { // from class: org.apache.thrift.server.TThreadedSelectorServer.AcceptThread.1
                        @Override // java.lang.Runnable
                        public void run() {
                            AcceptThread.this.doAddAccept(nextThread, doAccept);
                        }
                    });
                } catch (RejectedExecutionException e11) {
                    TThreadedSelectorServer.LOGGER.warn("ExecutorService rejected accept registration!", (Throwable) e11);
                    doAccept.close();
                }
            }
        }

        private void select() {
            try {
                this.acceptSelector.select();
                Iterator<SelectionKey> it = this.acceptSelector.selectedKeys().iterator();
                while (!TThreadedSelectorServer.this.stopped_ && it.hasNext()) {
                    SelectionKey next = it.next();
                    it.remove();
                    if (next.isValid()) {
                        if (next.isAcceptable()) {
                            handleAccept();
                        } else {
                            TThreadedSelectorServer.LOGGER.warn("Unexpected state in select! " + next.interestOps());
                        }
                    }
                }
            } catch (IOException e11) {
                TThreadedSelectorServer.LOGGER.warn("Got an IOException while selecting!", (Throwable) e11);
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                TServerEventHandler tServerEventHandler = TThreadedSelectorServer.this.eventHandler_;
                if (tServerEventHandler != null) {
                    tServerEventHandler.preServe();
                }
                while (!TThreadedSelectorServer.this.stopped_) {
                    select();
                }
            } catch (Throwable th2) {
                try {
                    TThreadedSelectorServer.LOGGER.error("run() on AcceptThread exiting due to uncaught error", th2);
                    try {
                        this.acceptSelector.close();
                    } catch (IOException e11) {
                        e = e11;
                        TThreadedSelectorServer.LOGGER.error("Got an IOException while closing accept selector!", (Throwable) e);
                        TThreadedSelectorServer.this.stop();
                    }
                } catch (Throwable th3) {
                    try {
                        this.acceptSelector.close();
                    } catch (IOException e12) {
                        TThreadedSelectorServer.LOGGER.error("Got an IOException while closing accept selector!", (Throwable) e12);
                    }
                    TThreadedSelectorServer.this.stop();
                    throw th3;
                }
            }
            try {
                this.acceptSelector.close();
            } catch (IOException e13) {
                e = e13;
                TThreadedSelectorServer.LOGGER.error("Got an IOException while closing accept selector!", (Throwable) e);
                TThreadedSelectorServer.this.stop();
            }
            TThreadedSelectorServer.this.stop();
        }

        public void wakeupSelector() {
            this.acceptSelector.wakeup();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Args extends AbstractNonblockingServer.AbstractNonblockingServerArgs<Args> {
        private AcceptPolicy acceptPolicy;
        private int acceptQueueSizePerThread;
        private ExecutorService executorService;
        public int selectorThreads;
        private TimeUnit stopTimeoutUnit;
        private int stopTimeoutVal;
        private int workerThreads;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum AcceptPolicy {
            FAIR_ACCEPT,
            FAST_ACCEPT
        }

        public Args(TNonblockingServerTransport tNonblockingServerTransport) {
            super(tNonblockingServerTransport);
            this.selectorThreads = 2;
            this.workerThreads = 5;
            this.stopTimeoutVal = 60;
            this.stopTimeoutUnit = TimeUnit.SECONDS;
            this.executorService = null;
            this.acceptQueueSizePerThread = 4;
            this.acceptPolicy = AcceptPolicy.FAST_ACCEPT;
        }

        public Args acceptPolicy(AcceptPolicy acceptPolicy) {
            this.acceptPolicy = acceptPolicy;
            return this;
        }

        public Args acceptQueueSizePerThread(int i11) {
            this.acceptQueueSizePerThread = i11;
            return this;
        }

        public Args executorService(ExecutorService executorService) {
            this.executorService = executorService;
            return this;
        }

        public AcceptPolicy getAcceptPolicy() {
            return this.acceptPolicy;
        }

        public int getAcceptQueueSizePerThread() {
            return this.acceptQueueSizePerThread;
        }

        public ExecutorService getExecutorService() {
            return this.executorService;
        }

        public int getSelectorThreads() {
            return this.selectorThreads;
        }

        public TimeUnit getStopTimeoutUnit() {
            return this.stopTimeoutUnit;
        }

        public int getStopTimeoutVal() {
            return this.stopTimeoutVal;
        }

        public int getWorkerThreads() {
            return this.workerThreads;
        }

        public Args selectorThreads(int i11) {
            this.selectorThreads = i11;
            return this;
        }

        public Args stopTimeoutUnit(TimeUnit timeUnit) {
            this.stopTimeoutUnit = timeUnit;
            return this;
        }

        public Args stopTimeoutVal(int i11) {
            this.stopTimeoutVal = i11;
            return this;
        }

        public void validate() {
            if (this.selectorThreads <= 0) {
                throw new IllegalArgumentException("selectorThreads must be positive.");
            }
            if (this.workerThreads < 0) {
                throw new IllegalArgumentException("workerThreads must be non-negative.");
            }
            if (this.acceptQueueSizePerThread <= 0) {
                throw new IllegalArgumentException("acceptQueueSizePerThread must be positive.");
            }
        }

        public Args workerThreads(int i11) {
            this.workerThreads = i11;
            return this;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class SelectorThread extends AbstractNonblockingServer.AbstractSelectThread {
        private final BlockingQueue<TNonblockingTransport> acceptedQueue;

        public SelectorThread(TThreadedSelectorServer tThreadedSelectorServer) throws IOException {
            this(new LinkedBlockingQueue());
        }

        private void processAcceptedConnections() {
            TNonblockingTransport poll;
            while (!TThreadedSelectorServer.this.stopped_ && (poll = this.acceptedQueue.poll()) != null) {
                registerAccepted(poll);
            }
        }

        private void registerAccepted(TNonblockingTransport tNonblockingTransport) {
            SelectionKey selectionKey = null;
            try {
                selectionKey = tNonblockingTransport.registerSelector(this.selector, 1);
                selectionKey.attach(createFrameBuffer(tNonblockingTransport, selectionKey, this));
            } catch (IOException e11) {
                TThreadedSelectorServer.LOGGER.warn("Failed to register accepted connection to selector!", (Throwable) e11);
                if (selectionKey != null) {
                    cleanupSelectionKey(selectionKey);
                }
                tNonblockingTransport.close();
            }
        }

        private void select() {
            try {
                this.selector.select();
                Iterator<SelectionKey> it = this.selector.selectedKeys().iterator();
                while (!TThreadedSelectorServer.this.stopped_ && it.hasNext()) {
                    SelectionKey next = it.next();
                    it.remove();
                    if (!next.isValid()) {
                        cleanupSelectionKey(next);
                    } else if (next.isReadable()) {
                        handleRead(next);
                    } else if (next.isWritable()) {
                        handleWrite(next);
                    } else {
                        TThreadedSelectorServer.LOGGER.warn("Unexpected state in select! " + next.interestOps());
                    }
                }
            } catch (IOException e11) {
                TThreadedSelectorServer.LOGGER.warn("Got an IOException while selecting!", (Throwable) e11);
            }
        }

        public boolean addAcceptedConnection(TNonblockingTransport tNonblockingTransport) {
            try {
                this.acceptedQueue.put(tNonblockingTransport);
                this.selector.wakeup();
                return true;
            } catch (InterruptedException e11) {
                TThreadedSelectorServer.LOGGER.warn("Interrupted while adding accepted connection!", (Throwable) e11);
                return false;
            }
        }

        public AbstractNonblockingServer.FrameBuffer createFrameBuffer(TNonblockingTransport tNonblockingTransport, SelectionKey selectionKey, AbstractNonblockingServer.AbstractSelectThread abstractSelectThread) {
            return TThreadedSelectorServer.this.processorFactory_.isAsyncProcessor() ? new AbstractNonblockingServer.AsyncFrameBuffer(tNonblockingTransport, selectionKey, abstractSelectThread) : new AbstractNonblockingServer.FrameBuffer(tNonblockingTransport, selectionKey, abstractSelectThread);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (!TThreadedSelectorServer.this.stopped_) {
                try {
                    select();
                    processAcceptedConnections();
                    processInterestChanges();
                } catch (Throwable th2) {
                    try {
                        TThreadedSelectorServer.LOGGER.error("run() on SelectorThread exiting due to uncaught error", th2);
                        try {
                            this.selector.close();
                        } catch (IOException e11) {
                            e = e11;
                            TThreadedSelectorServer.LOGGER.error("Got an IOException while closing selector!", (Throwable) e);
                            TThreadedSelectorServer.this.stop();
                        }
                    } catch (Throwable th3) {
                        try {
                            this.selector.close();
                        } catch (IOException e12) {
                            TThreadedSelectorServer.LOGGER.error("Got an IOException while closing selector!", (Throwable) e12);
                        }
                        TThreadedSelectorServer.this.stop();
                        throw th3;
                    }
                }
            }
            Iterator<SelectionKey> it = this.selector.keys().iterator();
            while (it.hasNext()) {
                cleanupSelectionKey(it.next());
            }
            try {
                this.selector.close();
            } catch (IOException e13) {
                e = e13;
                TThreadedSelectorServer.LOGGER.error("Got an IOException while closing selector!", (Throwable) e);
                TThreadedSelectorServer.this.stop();
            }
            TThreadedSelectorServer.this.stop();
        }

        public SelectorThread(TThreadedSelectorServer tThreadedSelectorServer, int i11) throws IOException {
            this((BlockingQueue<TNonblockingTransport>) TThreadedSelectorServer.createDefaultAcceptQueue(i11));
        }

        public SelectorThread(BlockingQueue<TNonblockingTransport> blockingQueue) throws IOException {
            super();
            this.acceptedQueue = blockingQueue;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SelectorThreadLoadBalancer {
        private Iterator<? extends SelectorThread> nextThreadIterator;
        private final Collection<? extends SelectorThread> threads;

        public <T extends SelectorThread> SelectorThreadLoadBalancer(Collection<T> collection) {
            if (collection.isEmpty()) {
                throw new IllegalArgumentException("At least one selector thread is required");
            }
            List unmodifiableList = Collections.unmodifiableList(new ArrayList(collection));
            this.threads = unmodifiableList;
            this.nextThreadIterator = unmodifiableList.iterator();
        }

        public SelectorThread nextThread() {
            if (!this.nextThreadIterator.hasNext()) {
                this.nextThreadIterator = this.threads.iterator();
            }
            return this.nextThreadIterator.next();
        }
    }

    public TThreadedSelectorServer(Args args) {
        super(args);
        this.selectorThreads = new HashSet();
        args.validate();
        this.invoker = args.executorService == null ? createDefaultExecutor(args) : args.executorService;
        this.args = args;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static BlockingQueue<TNonblockingTransport> createDefaultAcceptQueue(int i11) {
        return i11 == 0 ? new LinkedBlockingQueue() : new ArrayBlockingQueue(i11);
    }

    public static ExecutorService createDefaultExecutor(Args args) {
        if (args.workerThreads > 0) {
            return Executors.newFixedThreadPool(args.workerThreads);
        }
        return null;
    }

    public SelectorThreadLoadBalancer createSelectorThreadLoadBalancer(Collection<? extends SelectorThread> collection) {
        return new SelectorThreadLoadBalancer(collection);
    }

    public Runnable getRunnable(AbstractNonblockingServer.FrameBuffer frameBuffer) {
        return new Invocation(frameBuffer);
    }

    public void gracefullyShutdownInvokerPool() {
        this.invoker.shutdown();
        long millis = this.args.stopTimeoutUnit.toMillis(this.args.stopTimeoutVal);
        long currentTimeMillis = System.currentTimeMillis();
        while (millis >= 0) {
            try {
                this.invoker.awaitTermination(millis, TimeUnit.MILLISECONDS);
                return;
            } catch (InterruptedException unused) {
                long currentTimeMillis2 = System.currentTimeMillis();
                millis -= currentTimeMillis2 - currentTimeMillis;
                currentTimeMillis = currentTimeMillis2;
            }
        }
    }

    public void joinThreads() throws InterruptedException {
        this.acceptThread.join();
        Iterator<SelectorThread> it = this.selectorThreads.iterator();
        while (it.hasNext()) {
            it.next().join();
        }
    }

    @Override // org.apache.thrift.server.AbstractNonblockingServer
    public boolean requestInvoke(AbstractNonblockingServer.FrameBuffer frameBuffer) {
        Runnable runnable = getRunnable(frameBuffer);
        ExecutorService executorService = this.invoker;
        if (executorService == null) {
            runnable.run();
            return true;
        }
        try {
            executorService.execute(runnable);
            return true;
        } catch (RejectedExecutionException e11) {
            LOGGER.warn("ExecutorService rejected execution!", (Throwable) e11);
            return false;
        }
    }

    @Override // org.apache.thrift.server.AbstractNonblockingServer
    public boolean startThreads() {
        for (int i11 = 0; i11 < this.args.selectorThreads; i11++) {
            try {
                this.selectorThreads.add(new SelectorThread(this, this.args.acceptQueueSizePerThread));
            } catch (IOException e11) {
                LOGGER.error("Failed to start threads!", (Throwable) e11);
                return false;
            }
        }
        this.acceptThread = new AcceptThread((TNonblockingServerTransport) this.serverTransport_, createSelectorThreadLoadBalancer(this.selectorThreads));
        Iterator<SelectorThread> it = this.selectorThreads.iterator();
        while (it.hasNext()) {
            it.next().start();
        }
        this.acceptThread.start();
        return true;
    }

    @Override // org.apache.thrift.server.TServer
    public void stop() {
        this.stopped_ = true;
        stopListening();
        AcceptThread acceptThread = this.acceptThread;
        if (acceptThread != null) {
            acceptThread.wakeupSelector();
        }
        Set<SelectorThread> set = this.selectorThreads;
        if (set != null) {
            for (SelectorThread selectorThread : set) {
                if (selectorThread != null) {
                    selectorThread.wakeupSelector();
                }
            }
        }
    }

    @Override // org.apache.thrift.server.AbstractNonblockingServer
    public void waitForShutdown() {
        try {
            joinThreads();
        } catch (InterruptedException e11) {
            LOGGER.error("Interrupted while joining threads!", (Throwable) e11);
        }
        gracefullyShutdownInvokerPool();
    }
}

package org.apache.thrift.server;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.apache.thrift.server.AbstractNonblockingServer;
import org.apache.thrift.transport.TNonblockingServerTransport;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class THsHaServer extends TNonblockingServer {
    private final Args args;
    private final ExecutorService invoker;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Args extends AbstractNonblockingServer.AbstractNonblockingServerArgs<Args> {
        private ExecutorService executorService;
        public int maxWorkerThreads;
        public int minWorkerThreads;
        private TimeUnit stopTimeoutUnit;
        private int stopTimeoutVal;

        public Args(TNonblockingServerTransport tNonblockingServerTransport) {
            super(tNonblockingServerTransport);
            this.minWorkerThreads = 5;
            this.maxWorkerThreads = Integer.MAX_VALUE;
            this.stopTimeoutVal = 60;
            this.stopTimeoutUnit = TimeUnit.SECONDS;
            this.executorService = null;
        }

        public Args executorService(ExecutorService executorService) {
            this.executorService = executorService;
            return this;
        }

        public ExecutorService getExecutorService() {
            return this.executorService;
        }

        public int getMaxWorkerThreads() {
            return this.maxWorkerThreads;
        }

        public int getMinWorkerThreads() {
            return this.minWorkerThreads;
        }

        public TimeUnit getStopTimeoutUnit() {
            return this.stopTimeoutUnit;
        }

        public int getStopTimeoutVal() {
            return this.stopTimeoutVal;
        }

        public Args maxWorkerThreads(int i11) {
            this.maxWorkerThreads = i11;
            return this;
        }

        public Args minWorkerThreads(int i11) {
            this.minWorkerThreads = i11;
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
    }

    public THsHaServer(Args args) {
        super(args);
        this.invoker = args.executorService == null ? createInvokerPool(args) : args.executorService;
        this.args = args;
    }

    public static ExecutorService createInvokerPool(Args args) {
        return new ThreadPoolExecutor(args.minWorkerThreads, args.maxWorkerThreads, args.stopTimeoutVal, args.stopTimeoutUnit, new LinkedBlockingQueue());
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

    @Override // org.apache.thrift.server.TNonblockingServer, org.apache.thrift.server.AbstractNonblockingServer
    public boolean requestInvoke(AbstractNonblockingServer.FrameBuffer frameBuffer) {
        try {
            this.invoker.execute(getRunnable(frameBuffer));
            return true;
        } catch (RejectedExecutionException e11) {
            this.LOGGER.warn("ExecutorService rejected execution!", (Throwable) e11);
            return false;
        }
    }

    @Override // org.apache.thrift.server.TNonblockingServer, org.apache.thrift.server.AbstractNonblockingServer
    public void waitForShutdown() {
        joinSelector();
        gracefullyShutdownInvokerPool();
    }
}

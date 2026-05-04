package org.apache.thrift.server;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.apache.thrift.server.TServer;
import org.apache.thrift.transport.TServerTransport;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TTransportException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class TThreadPoolServer extends TServer {
    private static final Logger LOGGER = LoggerFactory.getLogger(TThreadPoolServer.class.getName());
    private final long beBackoffSlotInMillis;
    private ExecutorService executorService_;
    private Random random;
    private final long requestTimeout;
    private final TimeUnit requestTimeoutUnit;
    private final TimeUnit stopTimeoutUnit;
    private final long stopTimeoutVal;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Args extends TServer.AbstractServerArgs<Args> {
        public int beBackoffSlotLength;
        public TimeUnit beBackoffSlotLengthUnit;
        public ExecutorService executorService;
        public int maxWorkerThreads;
        public int minWorkerThreads;
        public int requestTimeout;
        public TimeUnit requestTimeoutUnit;
        public TimeUnit stopTimeoutUnit;
        public int stopTimeoutVal;

        public Args(TServerTransport tServerTransport) {
            super(tServerTransport);
            this.minWorkerThreads = 5;
            this.maxWorkerThreads = Integer.MAX_VALUE;
            this.stopTimeoutVal = 60;
            TimeUnit timeUnit = TimeUnit.SECONDS;
            this.stopTimeoutUnit = timeUnit;
            this.requestTimeout = 20;
            this.requestTimeoutUnit = timeUnit;
            this.beBackoffSlotLength = 100;
            this.beBackoffSlotLengthUnit = TimeUnit.MILLISECONDS;
        }

        public Args beBackoffSlotLength(int i11) {
            this.beBackoffSlotLength = i11;
            return this;
        }

        public Args beBackoffSlotLengthUnit(TimeUnit timeUnit) {
            this.beBackoffSlotLengthUnit = timeUnit;
            return this;
        }

        public Args executorService(ExecutorService executorService) {
            this.executorService = executorService;
            return this;
        }

        public Args maxWorkerThreads(int i11) {
            this.maxWorkerThreads = i11;
            return this;
        }

        public Args minWorkerThreads(int i11) {
            this.minWorkerThreads = i11;
            return this;
        }

        public Args requestTimeout(int i11) {
            this.requestTimeout = i11;
            return this;
        }

        public Args requestTimeoutUnit(TimeUnit timeUnit) {
            this.requestTimeoutUnit = timeUnit;
            return this;
        }

        public Args stopTimeoutVal(int i11) {
            this.stopTimeoutVal = i11;
            return this;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class WorkerProcess implements Runnable {
        private TTransport client_;

        /* JADX WARN: Code restructure failed: missing block: B:52:0x013b, code lost:
        
            if (r0 != 0) goto L96;
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x0112, code lost:
        
            if (r0 != 0) goto L96;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0175  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x017a  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x017f  */
        /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x015d  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0162  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0167  */
        /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:46:0x0128  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x012d  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x0132  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x00ff  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0104  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x0109  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x0140  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x0145  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x014a  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x0155  */
        /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
        /* JADX WARN: Type inference failed for: r0v16, types: [org.apache.thrift.transport.TTransport] */
        /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                Method dump skipped, instructions count: 396
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: org.apache.thrift.server.TThreadPoolServer.WorkerProcess.run():void");
        }

        private WorkerProcess(TTransport tTransport) {
            this.client_ = tTransport;
        }
    }

    public TThreadPoolServer(Args args) {
        super(args);
        this.random = new Random(System.currentTimeMillis());
        this.stopTimeoutUnit = args.stopTimeoutUnit;
        this.stopTimeoutVal = args.stopTimeoutVal;
        this.requestTimeoutUnit = args.requestTimeoutUnit;
        this.requestTimeout = args.requestTimeout;
        this.beBackoffSlotInMillis = args.beBackoffSlotLengthUnit.toMillis(args.beBackoffSlotLength);
        ExecutorService executorService = args.executorService;
        this.executorService_ = executorService == null ? createDefaultExecutorService(args) : executorService;
    }

    private static ExecutorService createDefaultExecutorService(Args args) {
        return new ThreadPoolExecutor(args.minWorkerThreads, args.maxWorkerThreads, args.stopTimeoutVal, TimeUnit.SECONDS, new SynchronousQueue());
    }

    @Override // org.apache.thrift.server.TServer
    public void serve() {
        try {
            this.serverTransport_.listen();
            TServerEventHandler tServerEventHandler = this.eventHandler_;
            if (tServerEventHandler != null) {
                tServerEventHandler.preServe();
            }
            this.stopped_ = false;
            setServing(true);
            while (!this.stopped_) {
                try {
                    TTransport accept = this.serverTransport_.accept();
                    WorkerProcess workerProcess = new WorkerProcess(accept);
                    long millis = this.requestTimeoutUnit.toMillis(this.requestTimeout);
                    int i11 = 0;
                    while (true) {
                        try {
                            this.executorService_.execute(workerProcess);
                            break;
                        } catch (Throwable th2) {
                            if (th2 instanceof RejectedExecutionException) {
                                i11++;
                                if (millis <= 0) {
                                    accept.close();
                                    LOGGER.warn("Task has been rejected by ExecutorService " + i11 + " times till timedout, reason: " + th2);
                                    break;
                                }
                                try {
                                    long min = Math.min(((long) (this.random.nextDouble() * (1 << Math.min(i11, 20)))) * this.beBackoffSlotInMillis, millis);
                                    TimeUnit.MILLISECONDS.sleep(min);
                                    millis -= min;
                                } catch (InterruptedException unused) {
                                    LOGGER.warn("Interrupted while waiting to place client on executor queue.");
                                    Thread.currentThread().interrupt();
                                }
                            } else {
                                if (th2 instanceof Error) {
                                    LOGGER.error("ExecutorService threw error: " + th2, (Throwable) th2);
                                    throw th2;
                                }
                                LOGGER.warn("ExecutorService threw error: " + th2, (Throwable) th2);
                            }
                        }
                    }
                } catch (TTransportException e11) {
                    if (!this.stopped_) {
                        LOGGER.warn("Transport error occurred during acceptance of message.", (Throwable) e11);
                    }
                }
            }
            this.executorService_.shutdown();
            long millis2 = this.stopTimeoutUnit.toMillis(this.stopTimeoutVal);
            long currentTimeMillis = System.currentTimeMillis();
            while (millis2 >= 0) {
                try {
                    this.executorService_.awaitTermination(millis2, TimeUnit.MILLISECONDS);
                    break;
                } catch (InterruptedException unused2) {
                    long currentTimeMillis2 = System.currentTimeMillis();
                    millis2 -= currentTimeMillis2 - currentTimeMillis;
                    currentTimeMillis = currentTimeMillis2;
                }
            }
            setServing(false);
        } catch (TTransportException e12) {
            LOGGER.error("Error occurred during listening.", (Throwable) e12);
        }
    }

    @Override // org.apache.thrift.server.TServer
    public void stop() {
        this.stopped_ = true;
        this.serverTransport_.interrupt();
    }
}

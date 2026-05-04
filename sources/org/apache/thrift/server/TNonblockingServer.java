package org.apache.thrift.server;

import java.io.IOException;
import java.nio.channels.SelectionKey;
import java.util.Iterator;
import org.apache.thrift.server.AbstractNonblockingServer;
import org.apache.thrift.transport.TNonblockingServerTransport;
import org.apache.thrift.transport.TNonblockingTransport;
import org.apache.thrift.transport.TTransportException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class TNonblockingServer extends AbstractNonblockingServer {
    private SelectAcceptThread selectAcceptThread_;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Args extends AbstractNonblockingServer.AbstractNonblockingServerArgs<Args> {
        public Args(TNonblockingServerTransport tNonblockingServerTransport) {
            super(tNonblockingServerTransport);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class SelectAcceptThread extends AbstractNonblockingServer.AbstractSelectThread {
        private final TNonblockingServerTransport serverTransport;

        public SelectAcceptThread(TNonblockingServerTransport tNonblockingServerTransport) throws IOException {
            super();
            this.serverTransport = tNonblockingServerTransport;
            tNonblockingServerTransport.registerSelector(this.selector);
        }

        private void handleAccept() throws IOException {
            TNonblockingTransport tNonblockingTransport;
            SelectionKey selectionKey = null;
            try {
                tNonblockingTransport = (TNonblockingTransport) this.serverTransport.accept();
            } catch (TTransportException e11) {
                e = e11;
                tNonblockingTransport = null;
            }
            try {
                selectionKey = tNonblockingTransport.registerSelector(this.selector, 1);
                selectionKey.attach(createFrameBuffer(tNonblockingTransport, selectionKey, this));
            } catch (TTransportException e12) {
                e = e12;
                TNonblockingServer.this.LOGGER.warn("Exception trying to accept!", (Throwable) e);
                e.printStackTrace();
                if (selectionKey != null) {
                    cleanupSelectionKey(selectionKey);
                }
                if (tNonblockingTransport != null) {
                    tNonblockingTransport.close();
                }
            }
        }

        private void select() {
            try {
                this.selector.select();
                Iterator<SelectionKey> it = this.selector.selectedKeys().iterator();
                while (!TNonblockingServer.this.stopped_ && it.hasNext()) {
                    SelectionKey next = it.next();
                    it.remove();
                    if (!next.isValid()) {
                        cleanupSelectionKey(next);
                    } else if (next.isAcceptable()) {
                        handleAccept();
                    } else if (next.isReadable()) {
                        handleRead(next);
                    } else if (next.isWritable()) {
                        handleWrite(next);
                    } else {
                        TNonblockingServer.this.LOGGER.warn("Unexpected state in select! " + next.interestOps());
                    }
                }
            } catch (IOException e11) {
                TNonblockingServer.this.LOGGER.warn("Got an IOException while selecting!", (Throwable) e11);
            }
        }

        public AbstractNonblockingServer.FrameBuffer createFrameBuffer(TNonblockingTransport tNonblockingTransport, SelectionKey selectionKey, AbstractNonblockingServer.AbstractSelectThread abstractSelectThread) {
            return TNonblockingServer.this.processorFactory_.isAsyncProcessor() ? new AbstractNonblockingServer.AsyncFrameBuffer(tNonblockingTransport, selectionKey, abstractSelectThread) : new AbstractNonblockingServer.FrameBuffer(tNonblockingTransport, selectionKey, abstractSelectThread);
        }

        public boolean isStopped() {
            return TNonblockingServer.this.stopped_;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                TServerEventHandler tServerEventHandler = TNonblockingServer.this.eventHandler_;
                if (tServerEventHandler != null) {
                    tServerEventHandler.preServe();
                }
                while (!TNonblockingServer.this.stopped_) {
                    select();
                    processInterestChanges();
                }
                Iterator<SelectionKey> it = this.selector.keys().iterator();
                while (it.hasNext()) {
                    cleanupSelectionKey(it.next());
                }
            } catch (Throwable th2) {
                try {
                    TNonblockingServer.this.LOGGER.error("run() exiting due to uncaught error", th2);
                    try {
                        this.selector.close();
                    } catch (IOException e11) {
                        e = e11;
                        TNonblockingServer.this.LOGGER.error("Got an IOException while closing selector!", (Throwable) e);
                        TNonblockingServer.this.stopped_ = true;
                    }
                } catch (Throwable th3) {
                    try {
                        this.selector.close();
                    } catch (IOException e12) {
                        TNonblockingServer.this.LOGGER.error("Got an IOException while closing selector!", (Throwable) e12);
                    }
                    TNonblockingServer.this.stopped_ = true;
                    throw th3;
                }
            }
            try {
                this.selector.close();
            } catch (IOException e13) {
                e = e13;
                TNonblockingServer.this.LOGGER.error("Got an IOException while closing selector!", (Throwable) e);
                TNonblockingServer.this.stopped_ = true;
            }
            TNonblockingServer.this.stopped_ = true;
        }
    }

    public TNonblockingServer(AbstractNonblockingServer.AbstractNonblockingServerArgs abstractNonblockingServerArgs) {
        super(abstractNonblockingServerArgs);
    }

    public boolean isStopped() {
        return this.selectAcceptThread_.isStopped();
    }

    public void joinSelector() {
        try {
            this.selectAcceptThread_.join();
        } catch (InterruptedException unused) {
        }
    }

    @Override // org.apache.thrift.server.AbstractNonblockingServer
    public boolean requestInvoke(AbstractNonblockingServer.FrameBuffer frameBuffer) {
        frameBuffer.invoke();
        return true;
    }

    @Override // org.apache.thrift.server.AbstractNonblockingServer
    public boolean startThreads() {
        try {
            SelectAcceptThread selectAcceptThread = new SelectAcceptThread((TNonblockingServerTransport) this.serverTransport_);
            this.selectAcceptThread_ = selectAcceptThread;
            selectAcceptThread.start();
            return true;
        } catch (IOException e11) {
            this.LOGGER.error("Failed to start selector thread!", (Throwable) e11);
            return false;
        }
    }

    @Override // org.apache.thrift.server.TServer
    public void stop() {
        this.stopped_ = true;
        SelectAcceptThread selectAcceptThread = this.selectAcceptThread_;
        if (selectAcceptThread != null) {
            selectAcceptThread.wakeupSelector();
        }
    }

    @Override // org.apache.thrift.server.AbstractNonblockingServer
    public void waitForShutdown() {
        joinSelector();
    }
}

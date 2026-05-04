package org.apache.thrift.server;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.spi.SelectorProvider;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import org.apache.thrift.TAsyncProcessor;
import org.apache.thrift.TByteArrayOutputStream;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.server.TServer;
import org.apache.thrift.transport.TFramedTransport;
import org.apache.thrift.transport.TIOStreamTransport;
import org.apache.thrift.transport.TMemoryInputTransport;
import org.apache.thrift.transport.TNonblockingServerTransport;
import org.apache.thrift.transport.TNonblockingTransport;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TTransportException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class AbstractNonblockingServer extends TServer {
    protected final Logger LOGGER;
    final long MAX_READ_BUFFER_BYTES;
    final AtomicLong readBufferBytesAllocated;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class AbstractNonblockingServerArgs<T extends AbstractNonblockingServerArgs<T>> extends TServer.AbstractServerArgs<T> {
        public long maxReadBufferBytes;

        public AbstractNonblockingServerArgs(TNonblockingServerTransport tNonblockingServerTransport) {
            super(tNonblockingServerTransport);
            this.maxReadBufferBytes = Long.MAX_VALUE;
            transportFactory(new TFramedTransport.Factory());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public abstract class AbstractSelectThread extends Thread {
        protected final Set<FrameBuffer> selectInterestChanges = new HashSet();
        protected final Selector selector = SelectorProvider.provider().openSelector();

        public AbstractSelectThread() throws IOException {
        }

        public void cleanupSelectionKey(SelectionKey selectionKey) {
            FrameBuffer frameBuffer = (FrameBuffer) selectionKey.attachment();
            if (frameBuffer != null) {
                frameBuffer.close();
            }
            selectionKey.cancel();
        }

        public void handleRead(SelectionKey selectionKey) {
            FrameBuffer frameBuffer = (FrameBuffer) selectionKey.attachment();
            if (!frameBuffer.read()) {
                cleanupSelectionKey(selectionKey);
            } else {
                if (!frameBuffer.isFrameFullyRead() || AbstractNonblockingServer.this.requestInvoke(frameBuffer)) {
                    return;
                }
                cleanupSelectionKey(selectionKey);
            }
        }

        public void handleWrite(SelectionKey selectionKey) {
            if (((FrameBuffer) selectionKey.attachment()).write()) {
                return;
            }
            cleanupSelectionKey(selectionKey);
        }

        public void processInterestChanges() {
            synchronized (this.selectInterestChanges) {
                try {
                    Iterator<FrameBuffer> it = this.selectInterestChanges.iterator();
                    while (it.hasNext()) {
                        it.next().changeSelectInterests();
                    }
                    this.selectInterestChanges.clear();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public void requestSelectInterestChange(FrameBuffer frameBuffer) {
            synchronized (this.selectInterestChanges) {
                this.selectInterestChanges.add(frameBuffer);
            }
            this.selector.wakeup();
        }

        public void wakeupSelector() {
            this.selector.wakeup();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class AsyncFrameBuffer extends FrameBuffer {
        public AsyncFrameBuffer(TNonblockingTransport tNonblockingTransport, SelectionKey selectionKey, AbstractSelectThread abstractSelectThread) {
            super(tNonblockingTransport, selectionKey, abstractSelectThread);
        }

        public TProtocol getInputProtocol() {
            return this.inProt_;
        }

        public TProtocol getOutputProtocol() {
            return this.outProt_;
        }

        @Override // org.apache.thrift.server.AbstractNonblockingServer.FrameBuffer
        public void invoke() {
            this.frameTrans_.reset(this.buffer_.array());
            this.response_.reset();
            try {
                TServerEventHandler tServerEventHandler = AbstractNonblockingServer.this.eventHandler_;
                if (tServerEventHandler != null) {
                    tServerEventHandler.processContext(this.context_, this.inTrans_, this.outTrans_);
                }
                ((TAsyncProcessor) AbstractNonblockingServer.this.processorFactory_.getProcessor(this.inTrans_)).process(this);
            } catch (TException e11) {
                AbstractNonblockingServer.this.LOGGER.warn("Exception while invoking!", (Throwable) e11);
                this.state_ = FrameBufferState.AWAITING_CLOSE;
                requestSelectInterestChange();
            } catch (Throwable th2) {
                AbstractNonblockingServer.this.LOGGER.error("Unexpected throwable while invoking!", th2);
                this.state_ = FrameBufferState.AWAITING_CLOSE;
                requestSelectInterestChange();
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class FrameBuffer {
        protected final ServerContext context_;
        protected final TMemoryInputTransport frameTrans_;
        protected final TProtocol inProt_;
        protected final TTransport inTrans_;
        protected final TProtocol outProt_;
        protected final TTransport outTrans_;
        protected final TByteArrayOutputStream response_;
        protected final AbstractSelectThread selectThread_;
        protected final SelectionKey selectionKey_;
        protected final TNonblockingTransport trans_;
        private final Logger LOGGER = LoggerFactory.getLogger(getClass().getName());
        protected FrameBufferState state_ = FrameBufferState.READING_FRAME_SIZE;
        protected ByteBuffer buffer_ = ByteBuffer.allocate(4);

        public FrameBuffer(TNonblockingTransport tNonblockingTransport, SelectionKey selectionKey, AbstractSelectThread abstractSelectThread) {
            this.trans_ = tNonblockingTransport;
            this.selectionKey_ = selectionKey;
            this.selectThread_ = abstractSelectThread;
            TMemoryInputTransport tMemoryInputTransport = new TMemoryInputTransport();
            this.frameTrans_ = tMemoryInputTransport;
            TByteArrayOutputStream tByteArrayOutputStream = new TByteArrayOutputStream();
            this.response_ = tByteArrayOutputStream;
            TTransport transport = AbstractNonblockingServer.this.inputTransportFactory_.getTransport(tMemoryInputTransport);
            this.inTrans_ = transport;
            TTransport transport2 = AbstractNonblockingServer.this.outputTransportFactory_.getTransport(new TIOStreamTransport(tByteArrayOutputStream));
            this.outTrans_ = transport2;
            TProtocol protocol = AbstractNonblockingServer.this.inputProtocolFactory_.getProtocol(transport);
            this.inProt_ = protocol;
            TProtocol protocol2 = AbstractNonblockingServer.this.outputProtocolFactory_.getProtocol(transport2);
            this.outProt_ = protocol2;
            TServerEventHandler tServerEventHandler = AbstractNonblockingServer.this.eventHandler_;
            if (tServerEventHandler != null) {
                this.context_ = tServerEventHandler.createContext(protocol, protocol2);
            } else {
                this.context_ = null;
            }
        }

        private boolean internalRead() {
            try {
                return this.trans_.read(this.buffer_) >= 0;
            } catch (IOException e11) {
                this.LOGGER.warn("Got an IOException in internalRead!", (Throwable) e11);
                return false;
            }
        }

        private void prepareRead() {
            this.selectionKey_.interestOps(1);
            this.buffer_ = ByteBuffer.allocate(4);
            this.state_ = FrameBufferState.READING_FRAME_SIZE;
        }

        public void changeSelectInterests() {
            FrameBufferState frameBufferState = this.state_;
            if (frameBufferState == FrameBufferState.AWAITING_REGISTER_WRITE) {
                this.selectionKey_.interestOps(4);
                this.state_ = FrameBufferState.WRITING;
                return;
            }
            if (frameBufferState == FrameBufferState.AWAITING_REGISTER_READ) {
                prepareRead();
                return;
            }
            if (frameBufferState == FrameBufferState.AWAITING_CLOSE) {
                close();
                this.selectionKey_.cancel();
                return;
            }
            this.LOGGER.error("changeSelectInterest was called, but state is invalid (" + this.state_ + j.f81007d);
        }

        public void close() {
            FrameBufferState frameBufferState = this.state_;
            if (frameBufferState == FrameBufferState.READING_FRAME || frameBufferState == FrameBufferState.READ_FRAME_COMPLETE || frameBufferState == FrameBufferState.AWAITING_CLOSE) {
                AbstractNonblockingServer.this.readBufferBytesAllocated.addAndGet(-this.buffer_.array().length);
            }
            this.trans_.close();
            TServerEventHandler tServerEventHandler = AbstractNonblockingServer.this.eventHandler_;
            if (tServerEventHandler != null) {
                tServerEventHandler.deleteContext(this.context_, this.inProt_, this.outProt_);
            }
        }

        public void invoke() {
            this.frameTrans_.reset(this.buffer_.array());
            this.response_.reset();
            try {
                TServerEventHandler tServerEventHandler = AbstractNonblockingServer.this.eventHandler_;
                if (tServerEventHandler != null) {
                    tServerEventHandler.processContext(this.context_, this.inTrans_, this.outTrans_);
                }
                AbstractNonblockingServer.this.processorFactory_.getProcessor(this.inTrans_).process(this.inProt_, this.outProt_);
                responseReady();
            } catch (TException e11) {
                this.LOGGER.warn("Exception while invoking!", (Throwable) e11);
                this.state_ = FrameBufferState.AWAITING_CLOSE;
                requestSelectInterestChange();
            } catch (Throwable th2) {
                this.LOGGER.error("Unexpected throwable while invoking!", th2);
                this.state_ = FrameBufferState.AWAITING_CLOSE;
                requestSelectInterestChange();
            }
        }

        public boolean isFrameFullyRead() {
            return this.state_ == FrameBufferState.READ_FRAME_COMPLETE;
        }

        public boolean read() {
            if (this.state_ == FrameBufferState.READING_FRAME_SIZE) {
                if (!internalRead()) {
                    return false;
                }
                if (this.buffer_.remaining() != 0) {
                    return true;
                }
                int i11 = this.buffer_.getInt(0);
                if (i11 <= 0) {
                    this.LOGGER.error("Read an invalid frame size of " + i11 + ". Are you using TFramedTransport on the client side?");
                    return false;
                }
                long j11 = i11;
                AbstractNonblockingServer abstractNonblockingServer = AbstractNonblockingServer.this;
                if (j11 > abstractNonblockingServer.MAX_READ_BUFFER_BYTES) {
                    this.LOGGER.error("Read a frame size of " + i11 + ", which is bigger than the maximum allowable buffer size for ALL connections.");
                    return false;
                }
                long j12 = abstractNonblockingServer.readBufferBytesAllocated.get() + j11;
                AbstractNonblockingServer abstractNonblockingServer2 = AbstractNonblockingServer.this;
                if (j12 > abstractNonblockingServer2.MAX_READ_BUFFER_BYTES) {
                    return true;
                }
                int i12 = i11 + 4;
                abstractNonblockingServer2.readBufferBytesAllocated.addAndGet(i12);
                ByteBuffer allocate = ByteBuffer.allocate(i12);
                this.buffer_ = allocate;
                allocate.putInt(i11);
                this.state_ = FrameBufferState.READING_FRAME;
            }
            if (this.state_ == FrameBufferState.READING_FRAME) {
                if (!internalRead()) {
                    return false;
                }
                if (this.buffer_.remaining() == 0) {
                    this.selectionKey_.interestOps(0);
                    this.state_ = FrameBufferState.READ_FRAME_COMPLETE;
                }
                return true;
            }
            this.LOGGER.error("Read was called but state is invalid (" + this.state_ + j.f81007d);
            return false;
        }

        public void requestSelectInterestChange() {
            Thread currentThread = Thread.currentThread();
            AbstractSelectThread abstractSelectThread = this.selectThread_;
            if (currentThread == abstractSelectThread) {
                changeSelectInterests();
            } else {
                abstractSelectThread.requestSelectInterestChange(this);
            }
        }

        public void responseReady() {
            AbstractNonblockingServer.this.readBufferBytesAllocated.addAndGet(-this.buffer_.array().length);
            if (this.response_.len() == 0) {
                this.state_ = FrameBufferState.AWAITING_REGISTER_READ;
                this.buffer_ = null;
            } else {
                this.buffer_ = ByteBuffer.wrap(this.response_.get(), 0, this.response_.len());
                this.state_ = FrameBufferState.AWAITING_REGISTER_WRITE;
            }
            requestSelectInterestChange();
        }

        public boolean write() {
            if (this.state_ != FrameBufferState.WRITING) {
                this.LOGGER.error("Write was called, but state is invalid (" + this.state_ + j.f81007d);
                return false;
            }
            try {
                if (this.trans_.write(this.buffer_) < 0) {
                    return false;
                }
                if (this.buffer_.remaining() != 0) {
                    return true;
                }
                prepareRead();
                return true;
            } catch (IOException e11) {
                this.LOGGER.warn("Got an IOException during write!", (Throwable) e11);
                return false;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum FrameBufferState {
        READING_FRAME_SIZE,
        READING_FRAME,
        READ_FRAME_COMPLETE,
        AWAITING_REGISTER_WRITE,
        WRITING,
        AWAITING_REGISTER_READ,
        AWAITING_CLOSE
    }

    public AbstractNonblockingServer(AbstractNonblockingServerArgs abstractNonblockingServerArgs) {
        super(abstractNonblockingServerArgs);
        this.LOGGER = LoggerFactory.getLogger(getClass().getName());
        this.readBufferBytesAllocated = new AtomicLong(0L);
        this.MAX_READ_BUFFER_BYTES = abstractNonblockingServerArgs.maxReadBufferBytes;
    }

    public abstract boolean requestInvoke(FrameBuffer frameBuffer);

    @Override // org.apache.thrift.server.TServer
    public void serve() {
        if (startThreads() && startListening()) {
            setServing(true);
            waitForShutdown();
            setServing(false);
            stopListening();
        }
    }

    public boolean startListening() {
        try {
            this.serverTransport_.listen();
            return true;
        } catch (TTransportException e11) {
            this.LOGGER.error("Failed to start listening on server socket!", (Throwable) e11);
            return false;
        }
    }

    public abstract boolean startThreads();

    public void stopListening() {
        this.serverTransport_.close();
    }

    public abstract void waitForShutdown();
}

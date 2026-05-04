package org.apache.thrift.async;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.util.concurrent.atomic.AtomicLong;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.protocol.TProtocolFactory;
import org.apache.thrift.transport.TFramedTransport;
import org.apache.thrift.transport.TMemoryBuffer;
import org.apache.thrift.transport.TNonblockingTransport;
import org.apache.thrift.transport.TTransportException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class TAsyncMethodCall<T> {
    private static final int INITIAL_MEMORY_BUFFER_SIZE = 128;
    private static AtomicLong sequenceIdCounter = new AtomicLong(0);
    private final AsyncMethodCallback<T> callback;
    protected final TAsyncClient client;
    private ByteBuffer frameBuffer;
    private final boolean isOneway;
    private final TProtocolFactory protocolFactory;
    private ByteBuffer sizeBuffer;
    private final long timeout;
    protected final TNonblockingTransport transport;
    private State state = null;
    private final byte[] sizeBufferArray = new byte[4];
    private long startTime = System.currentTimeMillis();
    private long sequenceId = sequenceIdCounter.getAndIncrement();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: org.apache.thrift.async.TAsyncMethodCall$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$apache$thrift$async$TAsyncMethodCall$State;

        static {
            int[] iArr = new int[State.values().length];
            $SwitchMap$org$apache$thrift$async$TAsyncMethodCall$State = iArr;
            try {
                iArr[State.CONNECTING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$apache$thrift$async$TAsyncMethodCall$State[State.WRITING_REQUEST_SIZE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$apache$thrift$async$TAsyncMethodCall$State[State.WRITING_REQUEST_BODY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$apache$thrift$async$TAsyncMethodCall$State[State.READING_RESPONSE_SIZE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$apache$thrift$async$TAsyncMethodCall$State[State.READING_RESPONSE_BODY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum State {
        CONNECTING,
        WRITING_REQUEST_SIZE,
        WRITING_REQUEST_BODY,
        READING_RESPONSE_SIZE,
        READING_RESPONSE_BODY,
        RESPONSE_READ,
        ERROR
    }

    public TAsyncMethodCall(TAsyncClient tAsyncClient, TProtocolFactory tProtocolFactory, TNonblockingTransport tNonblockingTransport, AsyncMethodCallback<T> asyncMethodCallback, boolean z11) {
        this.transport = tNonblockingTransport;
        this.callback = asyncMethodCallback;
        this.protocolFactory = tProtocolFactory;
        this.client = tAsyncClient;
        this.isOneway = z11;
        this.timeout = tAsyncClient.getTimeout();
    }

    private void cleanUpAndFireCallback(SelectionKey selectionKey) {
        this.state = State.RESPONSE_READ;
        selectionKey.interestOps(0);
        selectionKey.attach(null);
        this.client.onComplete();
        this.callback.onComplete(this);
    }

    private void doConnecting(SelectionKey selectionKey) throws IOException {
        if (!selectionKey.isConnectable() || !this.transport.finishConnect()) {
            throw new IOException("not connectable or finishConnect returned false after we got an OP_CONNECT");
        }
        registerForFirstWrite(selectionKey);
    }

    private void doReadingResponseBody(SelectionKey selectionKey) throws IOException {
        if (this.transport.read(this.frameBuffer) < 0) {
            throw new IOException("Read call frame failed");
        }
        if (this.frameBuffer.remaining() == 0) {
            cleanUpAndFireCallback(selectionKey);
        }
    }

    private void doReadingResponseSize() throws IOException {
        if (this.transport.read(this.sizeBuffer) < 0) {
            throw new IOException("Read call frame size failed");
        }
        if (this.sizeBuffer.remaining() == 0) {
            this.state = State.READING_RESPONSE_BODY;
            this.frameBuffer = ByteBuffer.allocate(TFramedTransport.decodeFrameSize(this.sizeBufferArray));
        }
    }

    private void doWritingRequestBody(SelectionKey selectionKey) throws IOException {
        if (this.transport.write(this.frameBuffer) < 0) {
            throw new IOException("Write call frame failed");
        }
        if (this.frameBuffer.remaining() == 0) {
            if (this.isOneway) {
                cleanUpAndFireCallback(selectionKey);
                return;
            }
            this.state = State.READING_RESPONSE_SIZE;
            this.sizeBuffer.rewind();
            selectionKey.interestOps(1);
        }
    }

    private void doWritingRequestSize() throws IOException {
        if (this.transport.write(this.sizeBuffer) < 0) {
            throw new IOException("Write call frame size failed");
        }
        if (this.sizeBuffer.remaining() == 0) {
            this.state = State.WRITING_REQUEST_BODY;
        }
    }

    public TAsyncClient getClient() {
        return this.client;
    }

    public ByteBuffer getFrameBuffer() {
        return this.frameBuffer;
    }

    public long getSequenceId() {
        return this.sequenceId;
    }

    public long getStartTime() {
        return this.startTime;
    }

    public State getState() {
        return this.state;
    }

    public long getTimeoutTimestamp() {
        return this.timeout + this.startTime;
    }

    public boolean hasTimeout() {
        return this.timeout > 0;
    }

    public boolean isFinished() {
        return this.state == State.RESPONSE_READ;
    }

    public void onError(Exception exc) {
        this.client.onError(exc);
        this.callback.onError(exc);
        this.state = State.ERROR;
    }

    public void prepareMethodCall() throws TException {
        TMemoryBuffer tMemoryBuffer = new TMemoryBuffer(128);
        write_args(this.protocolFactory.getProtocol(tMemoryBuffer));
        int length = tMemoryBuffer.length();
        this.frameBuffer = ByteBuffer.wrap(tMemoryBuffer.getArray(), 0, length);
        TFramedTransport.encodeFrameSize(length, this.sizeBufferArray);
        this.sizeBuffer = ByteBuffer.wrap(this.sizeBufferArray);
    }

    public void registerForFirstWrite(SelectionKey selectionKey) throws IOException {
        this.state = State.WRITING_REQUEST_SIZE;
        selectionKey.interestOps(4);
    }

    public void start(Selector selector) throws IOException {
        SelectionKey registerSelector;
        if (this.transport.isOpen()) {
            this.state = State.WRITING_REQUEST_SIZE;
            registerSelector = this.transport.registerSelector(selector, 4);
        } else {
            this.state = State.CONNECTING;
            registerSelector = this.transport.registerSelector(selector, 8);
            if (this.transport.startConnect()) {
                registerForFirstWrite(registerSelector);
            }
        }
        registerSelector.attach(this);
    }

    public void transition(SelectionKey selectionKey) {
        if (!selectionKey.isValid()) {
            selectionKey.cancel();
            onError(new TTransportException("Selection key not valid!"));
            return;
        }
        try {
            int i11 = AnonymousClass1.$SwitchMap$org$apache$thrift$async$TAsyncMethodCall$State[this.state.ordinal()];
            if (i11 == 1) {
                doConnecting(selectionKey);
                return;
            }
            if (i11 == 2) {
                doWritingRequestSize();
                return;
            }
            if (i11 == 3) {
                doWritingRequestBody(selectionKey);
                return;
            }
            if (i11 == 4) {
                doReadingResponseSize();
                return;
            }
            if (i11 == 5) {
                doReadingResponseBody(selectionKey);
                return;
            }
            throw new IllegalStateException("Method call in state " + this.state + " but selector called transition method. Seems like a bug...");
        } catch (Exception e11) {
            selectionKey.cancel();
            selectionKey.attach(null);
            onError(e11);
        }
    }

    public abstract void write_args(TProtocol tProtocol) throws TException;
}

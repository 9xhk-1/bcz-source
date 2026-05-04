package org.apache.thrift.transport;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class TNonblockingSocket extends TNonblockingTransport {
    private static final Logger LOGGER = LoggerFactory.getLogger(TNonblockingSocket.class.getName());
    private final SocketAddress socketAddress_;
    private final SocketChannel socketChannel_;

    public TNonblockingSocket(String str, int i11) throws IOException {
        this(str, i11, 0);
    }

    @Override // org.apache.thrift.transport.TTransport, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            this.socketChannel_.close();
        } catch (IOException e11) {
            LOGGER.warn("Could not close socket.", (Throwable) e11);
        }
    }

    @Override // org.apache.thrift.transport.TNonblockingTransport
    public boolean finishConnect() throws IOException {
        return this.socketChannel_.finishConnect();
    }

    public SocketChannel getSocketChannel() {
        return this.socketChannel_;
    }

    @Override // org.apache.thrift.transport.TTransport
    public boolean isOpen() {
        return this.socketChannel_.isOpen() && this.socketChannel_.isConnected();
    }

    @Override // org.apache.thrift.transport.TTransport
    public void open() throws TTransportException {
        throw new RuntimeException("open() is not implemented for TNonblockingSocket");
    }

    @Override // org.apache.thrift.transport.TNonblockingTransport
    public int read(ByteBuffer byteBuffer) throws IOException {
        return this.socketChannel_.read(byteBuffer);
    }

    @Override // org.apache.thrift.transport.TNonblockingTransport
    public SelectionKey registerSelector(Selector selector, int i11) throws IOException {
        return this.socketChannel_.register(selector, i11);
    }

    public void setTimeout(int i11) {
        try {
            this.socketChannel_.socket().setSoTimeout(i11);
        } catch (SocketException e11) {
            LOGGER.warn("Could not set socket timeout.", (Throwable) e11);
        }
    }

    @Override // org.apache.thrift.transport.TNonblockingTransport
    public boolean startConnect() throws IOException {
        return this.socketChannel_.connect(this.socketAddress_);
    }

    @Override // org.apache.thrift.transport.TNonblockingTransport
    public int write(ByteBuffer byteBuffer) throws IOException {
        return this.socketChannel_.write(byteBuffer);
    }

    public TNonblockingSocket(String str, int i11, int i12) throws IOException {
        this(SocketChannel.open(), i12, new InetSocketAddress(str, i11));
    }

    @Override // org.apache.thrift.transport.TTransport
    public int read(byte[] bArr, int i11, int i12) throws TTransportException {
        if ((this.socketChannel_.validOps() & 1) != 1) {
            throw new TTransportException(1, "Cannot read from write-only socket channel");
        }
        try {
            return this.socketChannel_.read(ByteBuffer.wrap(bArr, i11, i12));
        } catch (IOException e11) {
            throw new TTransportException(0, e11);
        }
    }

    @Override // org.apache.thrift.transport.TTransport
    public void write(byte[] bArr, int i11, int i12) throws TTransportException {
        if ((this.socketChannel_.validOps() & 4) != 4) {
            throw new TTransportException(1, "Cannot write to write-only socket channel");
        }
        try {
            this.socketChannel_.write(ByteBuffer.wrap(bArr, i11, i12));
        } catch (IOException e11) {
            throw new TTransportException(0, e11);
        }
    }

    public TNonblockingSocket(SocketChannel socketChannel) throws IOException {
        this(socketChannel, 0, (SocketAddress) null);
        if (!socketChannel.isConnected()) {
            throw new IOException("Socket must already be connected");
        }
    }

    private TNonblockingSocket(SocketChannel socketChannel, int i11, SocketAddress socketAddress) throws IOException {
        this.socketChannel_ = socketChannel;
        this.socketAddress_ = socketAddress;
        socketChannel.configureBlocking(false);
        Socket socket = socketChannel.socket();
        socket.setSoLinger(false, 0);
        socket.setTcpNoDelay(true);
        socket.setKeepAlive(true);
        setTimeout(i11);
    }

    @Override // org.apache.thrift.transport.TTransport
    public void flush() throws TTransportException {
    }
}

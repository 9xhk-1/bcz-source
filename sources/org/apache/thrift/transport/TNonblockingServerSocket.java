package org.apache.thrift.transport;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.SocketException;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import org.apache.thrift.transport.TServerTransport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class TNonblockingServerSocket extends TNonblockingServerTransport {
    private static final Logger LOGGER = LoggerFactory.getLogger(TNonblockingServerSocket.class.getName());
    private int clientTimeout_;
    private ServerSocketChannel serverSocketChannel;
    private ServerSocket serverSocket_;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class NonblockingAbstractServerSocketArgs extends TServerTransport.AbstractServerTransportArgs<NonblockingAbstractServerSocketArgs> {
    }

    public TNonblockingServerSocket(int i11) throws TTransportException {
        this(i11, 0);
    }

    @Override // org.apache.thrift.transport.TServerTransport, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ServerSocket serverSocket = this.serverSocket_;
        if (serverSocket != null) {
            try {
                serverSocket.close();
            } catch (IOException e11) {
                LOGGER.warn("WARNING: Could not close server socket: " + e11.getMessage());
            }
            this.serverSocket_ = null;
        }
    }

    public int getPort() {
        ServerSocket serverSocket = this.serverSocket_;
        if (serverSocket == null) {
            return -1;
        }
        return serverSocket.getLocalPort();
    }

    @Override // org.apache.thrift.transport.TServerTransport
    public void interrupt() {
        close();
    }

    @Override // org.apache.thrift.transport.TServerTransport
    public void listen() throws TTransportException {
        ServerSocket serverSocket = this.serverSocket_;
        if (serverSocket != null) {
            try {
                serverSocket.setSoTimeout(0);
            } catch (SocketException e11) {
                e11.printStackTrace();
            }
        }
    }

    @Override // org.apache.thrift.transport.TNonblockingServerTransport
    public void registerSelector(Selector selector) {
        try {
            this.serverSocketChannel.register(selector, 16);
        } catch (ClosedChannelException unused) {
        }
    }

    public TNonblockingServerSocket(int i11, int i12) throws TTransportException {
        this(new NonblockingAbstractServerSocketArgs().port(i11).clientTimeout(i12));
    }

    @Override // org.apache.thrift.transport.TServerTransport
    public TNonblockingSocket acceptImpl() throws TTransportException {
        if (this.serverSocket_ == null) {
            throw new TTransportException(1, "No underlying server socket.");
        }
        try {
            SocketChannel accept = this.serverSocketChannel.accept();
            if (accept == null) {
                return null;
            }
            TNonblockingSocket tNonblockingSocket = new TNonblockingSocket(accept);
            tNonblockingSocket.setTimeout(this.clientTimeout_);
            return tNonblockingSocket;
        } catch (IOException e11) {
            throw new TTransportException(e11);
        }
    }

    public TNonblockingServerSocket(InetSocketAddress inetSocketAddress) throws TTransportException {
        this(inetSocketAddress, 0);
    }

    public TNonblockingServerSocket(InetSocketAddress inetSocketAddress, int i11) throws TTransportException {
        this(new NonblockingAbstractServerSocketArgs().bindAddr(inetSocketAddress).clientTimeout(i11));
    }

    public TNonblockingServerSocket(NonblockingAbstractServerSocketArgs nonblockingAbstractServerSocketArgs) throws TTransportException {
        this.serverSocketChannel = null;
        this.serverSocket_ = null;
        this.clientTimeout_ = 0;
        this.clientTimeout_ = nonblockingAbstractServerSocketArgs.clientTimeout;
        try {
            ServerSocketChannel open = ServerSocketChannel.open();
            this.serverSocketChannel = open;
            open.configureBlocking(false);
            ServerSocket socket = this.serverSocketChannel.socket();
            this.serverSocket_ = socket;
            socket.setReuseAddress(true);
            this.serverSocket_.bind(nonblockingAbstractServerSocketArgs.bindAddr, nonblockingAbstractServerSocketArgs.backlog);
        } catch (IOException unused) {
            this.serverSocket_ = null;
            throw new TTransportException("Could not create ServerSocket on address " + nonblockingAbstractServerSocketArgs.bindAddr.toString() + ".");
        }
    }
}

package org.apache.thrift.transport;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.SocketException;
import org.apache.thrift.transport.TServerTransport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class TServerSocket extends TServerTransport {
    private static final Logger LOGGER = LoggerFactory.getLogger(TServerSocket.class.getName());
    private int clientTimeout_;
    private ServerSocket serverSocket_;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ServerSocketTransportArgs extends TServerTransport.AbstractServerTransportArgs<ServerSocketTransportArgs> {
        ServerSocket serverSocket;

        public ServerSocketTransportArgs serverSocket(ServerSocket serverSocket) {
            this.serverSocket = serverSocket;
            return this;
        }
    }

    public TServerSocket(ServerSocket serverSocket) throws TTransportException {
        this(serverSocket, 0);
    }

    @Override // org.apache.thrift.transport.TServerTransport, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ServerSocket serverSocket = this.serverSocket_;
        if (serverSocket != null) {
            try {
                serverSocket.close();
            } catch (IOException e11) {
                LOGGER.warn("Could not close server socket.", (Throwable) e11);
            }
            this.serverSocket_ = null;
        }
    }

    public ServerSocket getServerSocket() {
        return this.serverSocket_;
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
                LOGGER.error("Could not set socket timeout.", (Throwable) e11);
            }
        }
    }

    public TServerSocket(ServerSocket serverSocket, int i11) throws TTransportException {
        this(new ServerSocketTransportArgs().serverSocket(serverSocket).clientTimeout(i11));
    }

    @Override // org.apache.thrift.transport.TServerTransport
    public TSocket acceptImpl() throws TTransportException {
        ServerSocket serverSocket = this.serverSocket_;
        if (serverSocket == null) {
            throw new TTransportException(1, "No underlying server socket.");
        }
        try {
            TSocket tSocket = new TSocket(serverSocket.accept());
            tSocket.setTimeout(this.clientTimeout_);
            return tSocket;
        } catch (IOException e11) {
            throw new TTransportException(e11);
        }
    }

    public TServerSocket(int i11) throws TTransportException {
        this(i11, 0);
    }

    public TServerSocket(int i11, int i12) throws TTransportException {
        this(new InetSocketAddress(i11), i12);
    }

    public TServerSocket(InetSocketAddress inetSocketAddress) throws TTransportException {
        this(inetSocketAddress, 0);
    }

    public TServerSocket(InetSocketAddress inetSocketAddress, int i11) throws TTransportException {
        this(new ServerSocketTransportArgs().bindAddr(inetSocketAddress).clientTimeout(i11));
    }

    public TServerSocket(ServerSocketTransportArgs serverSocketTransportArgs) throws TTransportException {
        this.serverSocket_ = null;
        this.clientTimeout_ = 0;
        this.clientTimeout_ = serverSocketTransportArgs.clientTimeout;
        ServerSocket serverSocket = serverSocketTransportArgs.serverSocket;
        if (serverSocket != null) {
            this.serverSocket_ = serverSocket;
            return;
        }
        try {
            ServerSocket serverSocket2 = new ServerSocket();
            this.serverSocket_ = serverSocket2;
            serverSocket2.setReuseAddress(true);
            this.serverSocket_.bind(serverSocketTransportArgs.bindAddr, serverSocketTransportArgs.backlog);
        } catch (IOException e11) {
            close();
            throw new TTransportException("Could not create ServerSocket on address " + serverSocketTransportArgs.bindAddr.toString() + ".", e11);
        }
    }
}

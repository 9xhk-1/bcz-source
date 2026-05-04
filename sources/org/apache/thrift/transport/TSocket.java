package org.apache.thrift.transport;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class TSocket extends TIOStreamTransport {
    private static final Logger LOGGER = LoggerFactory.getLogger(TSocket.class.getName());
    private int connectTimeout_;
    private String host_;
    private int port_;
    private int socketTimeout_;
    private Socket socket_;

    public TSocket(Socket socket) throws TTransportException {
        this.host_ = null;
        this.port_ = 0;
        this.socketTimeout_ = 0;
        this.connectTimeout_ = 0;
        this.socket_ = socket;
        try {
            socket.setSoLinger(false, 0);
            this.socket_.setTcpNoDelay(true);
            this.socket_.setKeepAlive(true);
        } catch (SocketException e11) {
            LOGGER.warn("Could not configure socket.", (Throwable) e11);
        }
        if (isOpen()) {
            try {
                this.inputStream_ = new BufferedInputStream(this.socket_.getInputStream(), 1024);
                this.outputStream_ = new BufferedOutputStream(this.socket_.getOutputStream(), 1024);
            } catch (IOException e12) {
                close();
                throw new TTransportException(1, e12);
            }
        }
    }

    private void initSocket() {
        Socket socket = new Socket();
        this.socket_ = socket;
        try {
            socket.setSoLinger(false, 0);
            this.socket_.setTcpNoDelay(true);
            this.socket_.setKeepAlive(true);
            this.socket_.setSoTimeout(this.socketTimeout_);
        } catch (SocketException e11) {
            LOGGER.error("Could not configure socket.", (Throwable) e11);
        }
    }

    @Override // org.apache.thrift.transport.TIOStreamTransport, org.apache.thrift.transport.TTransport, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        super.close();
        Socket socket = this.socket_;
        if (socket != null) {
            try {
                socket.close();
            } catch (IOException e11) {
                LOGGER.warn("Could not close socket.", (Throwable) e11);
            }
            this.socket_ = null;
        }
    }

    public Socket getSocket() {
        if (this.socket_ == null) {
            initSocket();
        }
        return this.socket_;
    }

    @Override // org.apache.thrift.transport.TIOStreamTransport, org.apache.thrift.transport.TTransport
    public boolean isOpen() {
        Socket socket = this.socket_;
        if (socket == null) {
            return false;
        }
        return socket.isConnected();
    }

    @Override // org.apache.thrift.transport.TIOStreamTransport, org.apache.thrift.transport.TTransport
    public void open() throws TTransportException {
        if (isOpen()) {
            throw new TTransportException(2, "Socket already connected.");
        }
        if (this.host_.length() == 0) {
            throw new TTransportException(1, "Cannot open null host.");
        }
        if (this.port_ <= 0) {
            throw new TTransportException(1, "Cannot open without port.");
        }
        if (this.socket_ == null) {
            initSocket();
        }
        try {
            this.socket_.connect(new InetSocketAddress(this.host_, this.port_), this.connectTimeout_);
            this.inputStream_ = new BufferedInputStream(this.socket_.getInputStream(), 1024);
            this.outputStream_ = new BufferedOutputStream(this.socket_.getOutputStream(), 1024);
        } catch (IOException e11) {
            close();
            throw new TTransportException(1, e11);
        }
    }

    public void setConnectTimeout(int i11) {
        this.connectTimeout_ = i11;
    }

    public void setSocketTimeout(int i11) {
        this.socketTimeout_ = i11;
        try {
            this.socket_.setSoTimeout(i11);
        } catch (SocketException e11) {
            LOGGER.warn("Could not set socket timeout.", (Throwable) e11);
        }
    }

    public void setTimeout(int i11) {
        setConnectTimeout(i11);
        setSocketTimeout(i11);
    }

    public TSocket(String str, int i11) {
        this(str, i11, 0);
    }

    public TSocket(String str, int i11, int i12) {
        this(str, i11, i12, i12);
    }

    public TSocket(String str, int i11, int i12, int i13) {
        this.socket_ = null;
        this.host_ = str;
        this.port_ = i11;
        this.socketTimeout_ = i12;
        this.connectTimeout_ = i13;
        initSocket();
    }
}

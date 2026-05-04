package androidx.core.net;

import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.SocketImpl;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
class DatagramSocketWrapper extends Socket {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class DatagramSocketImplWrapper extends SocketImpl {
        public DatagramSocketImplWrapper(DatagramSocket datagramSocket, FileDescriptor fileDescriptor) {
            ((SocketImpl) this).localport = datagramSocket.getLocalPort();
            ((SocketImpl) this).fd = fileDescriptor;
        }

        @Override // java.net.SocketImpl
        public void accept(SocketImpl socketImpl) throws IOException {
            throw new UnsupportedOperationException();
        }

        @Override // java.net.SocketImpl
        public int available() throws IOException {
            throw new UnsupportedOperationException();
        }

        @Override // java.net.SocketImpl
        public void bind(InetAddress inetAddress, int i11) throws IOException {
            throw new UnsupportedOperationException();
        }

        @Override // java.net.SocketImpl
        public void close() throws IOException {
            throw new UnsupportedOperationException();
        }

        @Override // java.net.SocketImpl
        public void connect(String str, int i11) throws IOException {
            throw new UnsupportedOperationException();
        }

        @Override // java.net.SocketImpl
        public void create(boolean z11) throws IOException {
            throw new UnsupportedOperationException();
        }

        @Override // java.net.SocketImpl
        public InputStream getInputStream() throws IOException {
            throw new UnsupportedOperationException();
        }

        @Override // java.net.SocketOptions
        public Object getOption(int i11) throws SocketException {
            throw new UnsupportedOperationException();
        }

        @Override // java.net.SocketImpl
        public OutputStream getOutputStream() throws IOException {
            throw new UnsupportedOperationException();
        }

        @Override // java.net.SocketImpl
        public void listen(int i11) throws IOException {
            throw new UnsupportedOperationException();
        }

        @Override // java.net.SocketImpl
        public void sendUrgentData(int i11) throws IOException {
            throw new UnsupportedOperationException();
        }

        @Override // java.net.SocketOptions
        public void setOption(int i11, Object obj) throws SocketException {
            throw new UnsupportedOperationException();
        }

        @Override // java.net.SocketImpl
        public void connect(InetAddress inetAddress, int i11) throws IOException {
            throw new UnsupportedOperationException();
        }

        @Override // java.net.SocketImpl
        public void connect(SocketAddress socketAddress, int i11) throws IOException {
            throw new UnsupportedOperationException();
        }
    }

    public DatagramSocketWrapper(DatagramSocket datagramSocket, FileDescriptor fileDescriptor) throws SocketException {
        super(new DatagramSocketImplWrapper(datagramSocket, fileDescriptor));
    }
}

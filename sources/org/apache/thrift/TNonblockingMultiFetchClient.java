package org.apache.thrift;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class TNonblockingMultiFetchClient {
    private static final Logger LOGGER = LoggerFactory.getLogger(TNonblockingMultiFetchClient.class.getName());
    private int fetchTimeoutSeconds;
    private int maxRecvBufBytesPerServer;
    private ByteBuffer requestBuf;
    private ByteBuffer requestBufDuplication;
    private List<InetSocketAddress> servers;
    private TNonblockingMultiFetchStats stats = new TNonblockingMultiFetchStats();
    private ByteBuffer[] recvBuf = null;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class MultiFetch implements Runnable {
        private Selector selector;

        private MultiFetch() {
        }

        public void close() {
            try {
                if (this.selector.isOpen()) {
                    Iterator<SelectionKey> it = this.selector.keys().iterator();
                    while (it.hasNext()) {
                        ((SocketChannel) it.next().channel()).close();
                    }
                    this.selector.close();
                }
            } catch (IOException e11) {
                TNonblockingMultiFetchClient.LOGGER.error("free resource error: " + e11.toString());
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            char c11;
            char c12;
            Integer num;
            SocketChannel socketChannel;
            int read;
            SelectionKey selectionKey;
            long currentTimeMillis = System.currentTimeMillis();
            int size = TNonblockingMultiFetchClient.this.servers.size();
            TNonblockingMultiFetchClient.this.stats.setNumTotalServers(size);
            TNonblockingMultiFetchClient.this.recvBuf = new ByteBuffer[size];
            ByteBuffer[] byteBufferArr = new ByteBuffer[size];
            long[] jArr = new long[size];
            int[] iArr = new int[size];
            boolean[] zArr = new boolean[size];
            try {
                this.selector = Selector.open();
                int i11 = 0;
                while (true) {
                    c11 = 4;
                    if (i11 >= size) {
                        break;
                    }
                    byteBufferArr[i11] = TNonblockingMultiFetchClient.this.requestBuf.duplicate();
                    TNonblockingMultiFetchClient.this.recvBuf[i11] = ByteBuffer.allocate(4);
                    TNonblockingMultiFetchClient.this.stats.incTotalRecvBufBytes(4);
                    InetSocketAddress inetSocketAddress = (InetSocketAddress) TNonblockingMultiFetchClient.this.servers.get(i11);
                    SocketChannel socketChannel2 = null;
                    SelectionKey selectionKey2 = null;
                    try {
                        SocketChannel open = SocketChannel.open();
                        try {
                            open.configureBlocking(false);
                            open.connect(inetSocketAddress);
                            selectionKey2 = open.register(this.selector, open.validOps());
                            selectionKey2.attach(Integer.valueOf(i11));
                        } catch (Exception e11) {
                            e = e11;
                            selectionKey = selectionKey2;
                            socketChannel2 = open;
                            TNonblockingMultiFetchClient.this.stats.incNumConnectErrorServers();
                            TNonblockingMultiFetchClient.LOGGER.error(String.format("set up socket to server %s error: %s", inetSocketAddress.toString(), e.toString()));
                            if (socketChannel2 != null) {
                                try {
                                    socketChannel2.close();
                                } catch (Exception unused) {
                                }
                            }
                            if (selectionKey != null) {
                                selectionKey.cancel();
                            }
                            i11++;
                        }
                    } catch (Exception e12) {
                        e = e12;
                        selectionKey = null;
                    }
                    i11++;
                }
                while (TNonblockingMultiFetchClient.this.stats.getNumReadCompletedServers() + TNonblockingMultiFetchClient.this.stats.getNumConnectErrorServers() < TNonblockingMultiFetchClient.this.stats.getNumTotalServers() && !Thread.currentThread().isInterrupted()) {
                    try {
                        this.selector.select();
                        Iterator<SelectionKey> it = this.selector.selectedKeys().iterator();
                        while (it.hasNext()) {
                            SelectionKey next = it.next();
                            it.remove();
                            Integer num2 = (Integer) next.attachment();
                            int intValue = num2.intValue();
                            if (next.isValid() && next.isConnectable()) {
                                try {
                                    ((SocketChannel) next.channel()).finishConnect();
                                } catch (Exception e13) {
                                    TNonblockingMultiFetchClient.this.stats.incNumConnectErrorServers();
                                    TNonblockingMultiFetchClient.LOGGER.error(String.format("socket %d connects to server %s error: %s", num2, ((InetSocketAddress) TNonblockingMultiFetchClient.this.servers.get(intValue)).toString(), e13.toString()));
                                }
                            }
                            if (next.isValid() && next.isWritable() && byteBufferArr[intValue].hasRemaining()) {
                                try {
                                    ((SocketChannel) next.channel()).write(byteBufferArr[intValue]);
                                } catch (Exception e14) {
                                    TNonblockingMultiFetchClient.LOGGER.error(String.format("socket %d writes to server %s error: %s", num2, ((InetSocketAddress) TNonblockingMultiFetchClient.this.servers.get(intValue)).toString(), e14.toString()));
                                }
                            }
                            if (next.isValid() && next.isReadable()) {
                                try {
                                    socketChannel = (SocketChannel) next.channel();
                                    read = socketChannel.read(TNonblockingMultiFetchClient.this.recvBuf[intValue]);
                                } catch (Exception e15) {
                                    e = e15;
                                    c12 = c11;
                                    num = num2;
                                }
                                if (read > 0) {
                                    c12 = c11;
                                    num = num2;
                                    try {
                                        jArr[intValue] = jArr[intValue] + read;
                                    } catch (Exception e16) {
                                        e = e16;
                                        TNonblockingMultiFetchClient.LOGGER.error(String.format("socket %d reads from server %s error: %s", num, ((InetSocketAddress) TNonblockingMultiFetchClient.this.servers.get(intValue)).toString(), e.toString()));
                                        c11 = c12;
                                    }
                                    if (!zArr[intValue] && TNonblockingMultiFetchClient.this.recvBuf[intValue].remaining() == 0) {
                                        int i12 = TNonblockingMultiFetchClient.this.recvBuf[intValue].getInt(0);
                                        iArr[intValue] = i12;
                                        if (i12 <= 0) {
                                            TNonblockingMultiFetchClient.this.stats.incNumInvalidFrameSize();
                                            TNonblockingMultiFetchClient.LOGGER.error(String.format("Read an invalid frame size %d from %s. Does the server use TFramedTransport? ", Integer.valueOf(iArr[intValue]), ((InetSocketAddress) TNonblockingMultiFetchClient.this.servers.get(intValue)).toString()));
                                            socketChannel.close();
                                        } else {
                                            if (i12 + 4 > TNonblockingMultiFetchClient.this.stats.getMaxResponseBytes()) {
                                                TNonblockingMultiFetchClient.this.stats.setMaxResponseBytes(iArr[intValue] + 4);
                                            }
                                            if (iArr[intValue] + 4 > TNonblockingMultiFetchClient.this.maxRecvBufBytesPerServer) {
                                                TNonblockingMultiFetchClient.this.stats.incNumOverflowedRecvBuf();
                                                TNonblockingMultiFetchClient.LOGGER.error(String.format("Read frame size %d from %s, total buffer size would exceed limit %d", Integer.valueOf(iArr[intValue]), ((InetSocketAddress) TNonblockingMultiFetchClient.this.servers.get(intValue)).toString(), Integer.valueOf(TNonblockingMultiFetchClient.this.maxRecvBufBytesPerServer)));
                                                socketChannel.close();
                                            } else {
                                                TNonblockingMultiFetchClient.this.recvBuf[intValue] = ByteBuffer.allocate(iArr[intValue] + 4);
                                                TNonblockingMultiFetchClient.this.recvBuf[intValue].putInt(iArr[intValue]);
                                                TNonblockingMultiFetchClient.this.stats.incTotalRecvBufBytes(iArr[intValue]);
                                                zArr[intValue] = true;
                                            }
                                        }
                                        c11 = c12;
                                    }
                                    if (zArr[intValue] && jArr[intValue] >= iArr[intValue] + 4) {
                                        socketChannel.close();
                                        TNonblockingMultiFetchClient.this.stats.incNumReadCompletedServers();
                                        TNonblockingMultiFetchClient.this.stats.setReadTime(System.currentTimeMillis() - currentTimeMillis);
                                    }
                                    c11 = c12;
                                }
                            }
                            c12 = c11;
                            c11 = c12;
                        }
                    } catch (Exception e17) {
                        TNonblockingMultiFetchClient.LOGGER.error("selector selects error: " + e17.toString());
                        c11 = c11;
                    }
                }
            } catch (IOException e18) {
                TNonblockingMultiFetchClient.LOGGER.error("selector opens error: " + e18.toString());
            }
        }
    }

    public TNonblockingMultiFetchClient(int i11, int i12, ByteBuffer byteBuffer, List<InetSocketAddress> list) {
        this.maxRecvBufBytesPerServer = i11;
        this.fetchTimeoutSeconds = i12;
        this.requestBuf = byteBuffer;
        this.servers = list;
    }

    public synchronized ByteBuffer[] fetch() {
        this.recvBuf = null;
        this.stats.clear();
        List<InetSocketAddress> list = this.servers;
        if (list != null && list.size() != 0 && this.requestBuf != null && this.fetchTimeoutSeconds > 0) {
            ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
            MultiFetch multiFetch = new MultiFetch();
            FutureTask futureTask = new FutureTask(multiFetch, null);
            newSingleThreadExecutor.execute(futureTask);
            try {
                try {
                    futureTask.get(this.fetchTimeoutSeconds, TimeUnit.SECONDS);
                } catch (ExecutionException e11) {
                    futureTask.cancel(true);
                    LOGGER.error("exception during fetch: " + e11.toString());
                }
            } catch (InterruptedException e12) {
                futureTask.cancel(true);
                LOGGER.error("interrupted during fetch: " + e12.toString());
            } catch (TimeoutException e13) {
                futureTask.cancel(true);
                LOGGER.error("timeout for fetch: " + e13.toString());
            }
            newSingleThreadExecutor.shutdownNow();
            multiFetch.close();
            return this.recvBuf;
        }
        return this.recvBuf;
    }

    public synchronized TNonblockingMultiFetchStats getFetchStats() {
        return this.stats;
    }

    public synchronized int getFetchTimeoutSeconds() {
        return this.fetchTimeoutSeconds;
    }

    public synchronized int getMaxRecvBufBytesPerServer() {
        return this.maxRecvBufBytesPerServer;
    }

    public synchronized ByteBuffer getRequestBuf() {
        try {
            ByteBuffer byteBuffer = this.requestBuf;
            if (byteBuffer == null) {
                return null;
            }
            if (this.requestBufDuplication == null) {
                this.requestBufDuplication = byteBuffer.duplicate();
            }
            return this.requestBufDuplication;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized List<InetSocketAddress> getServerList() {
        List<InetSocketAddress> list = this.servers;
        if (list == null) {
            return null;
        }
        return Collections.unmodifiableList(list);
    }
}

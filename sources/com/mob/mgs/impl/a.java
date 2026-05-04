package com.mob.mgs.impl;

import com.mob.MobSDK;
import com.mob.tools.utils.DeviceHelper;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketException;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static a f40555a = new a();

    /* renamed from: b, reason: collision with root package name */
    private ExecutorService f40556b = Executors.newSingleThreadExecutor();

    /* renamed from: c, reason: collision with root package name */
    private ExecutorService f40557c = Executors.newSingleThreadExecutor();

    /* renamed from: d, reason: collision with root package name */
    private ConcurrentHashMap<String, LinkedBlockingQueue<Boolean>> f40558d = new ConcurrentHashMap<>();

    /* renamed from: e, reason: collision with root package name */
    private ConcurrentHashMap<Integer, String> f40559e = new ConcurrentHashMap<>();

    /* renamed from: f, reason: collision with root package name */
    private ConcurrentHashMap<Integer, SelectionKey> f40560f = new ConcurrentHashMap<>();

    /* renamed from: g, reason: collision with root package name */
    private Socket f40561g = null;

    /* renamed from: h, reason: collision with root package name */
    private int f40562h = 5;

    /* renamed from: j, reason: collision with root package name */
    private volatile boolean f40564j = false;

    /* renamed from: i, reason: collision with root package name */
    private ScheduledExecutorService f40563i = Executors.newSingleThreadScheduledExecutor();

    private a() {
    }

    public static /* synthetic */ int g(a aVar) {
        int i11 = aVar.f40562h;
        aVar.f40562h = i11 - 1;
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        try {
            this.f40558d.clear();
            this.f40559e.clear();
            this.f40560f.clear();
        } catch (Throwable th2) {
            e.a().b(th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        if (this.f40564j) {
            e.a().a("[GuardConnect] HB already started");
            return;
        }
        try {
            this.f40563i.scheduleWithFixedDelay(new Runnable() { // from class: com.mob.mgs.impl.a.4
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        e.a().a("[GuardConnect] sendPing clientSocket: " + a.this.f40561g);
                        if (a.this.f40561g != null) {
                            OutputStream outputStream = a.this.f40561g.getOutputStream();
                            outputStream.write("p".getBytes());
                            outputStream.flush();
                        }
                    } catch (Throwable th2) {
                        e.a().a(th2);
                    }
                }
            }, 0L, 240L, TimeUnit.SECONDS);
        } catch (Throwable th2) {
            e.a().a("[GuardConnect] HB timer error", th2);
        }
    }

    private void e() {
        try {
            Socket socket = this.f40561g;
            if (socket != null) {
                socket.close();
                this.f40561g = null;
            }
        } catch (Throwable th2) {
            e.a().b(th2);
        }
    }

    public void b() {
        this.f40556b.execute(new Runnable() { // from class: com.mob.mgs.impl.a.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (a.this.f40561g != null) {
                        a.this.f40561g.close();
                        a.this.f40561g = null;
                    }
                    a.this.f40561g = new Socket(DeviceHelper.getInstance(MobSDK.getContext()).getIPAddress(), 59898);
                    if (a.this.f40561g.isConnected()) {
                        a.this.f40562h = 5;
                        e.a().a("[GuardConnect] clientSocket connected");
                        try {
                            String packageName = MobSDK.getContext().getPackageName();
                            OutputStream outputStream = a.this.f40561g.getOutputStream();
                            outputStream.write(("lg_" + packageName).getBytes("utf-8"));
                            outputStream.flush();
                        } catch (Throwable th2) {
                            e.a().b(th2);
                        }
                        a.this.d();
                    }
                    InputStream inputStream = a.this.f40561g.getInputStream();
                    while (a.this.f40561g.isConnected() && !a.this.f40561g.isClosed()) {
                        byte[] bArr = new byte[1024];
                        int read = inputStream.read(bArr);
                        if (read == -1) {
                            e.a().a("[GuardConnect] client received server disconnect");
                            a.this.a(false);
                        } else {
                            String str = new String(bArr, 0, read);
                            e.a().a("[GuardConnect] client received server msg: " + str);
                            if ("chk".equals(str)) {
                                try {
                                    String packageName2 = MobSDK.getContext().getPackageName();
                                    OutputStream outputStream2 = a.this.f40561g.getOutputStream();
                                    outputStream2.write(("chk_cb_" + packageName2).getBytes("utf-8"));
                                    outputStream2.flush();
                                    e.a().a("[GuardConnect] client send alive check msg callback to server: chk_cb_" + packageName2);
                                } catch (Throwable th3) {
                                    e.a().b(th3);
                                }
                            }
                        }
                    }
                } catch (SocketException e11) {
                    e.a().a("[GuardConnect] client received socket exception: " + e11.getMessage());
                    e.a().a(e11);
                    a.this.a(true);
                } catch (Throwable th4) {
                    e.a().a("[GuardConnect] clientSocket exception: " + th4.getMessage());
                    e.a().a(th4);
                }
            }
        });
    }

    public static a a() {
        return f40555a;
    }

    public void a(final BlockingQueue<Boolean> blockingQueue) {
        this.f40556b.execute(new Runnable() { // from class: com.mob.mgs.impl.a.1
            @Override // java.lang.Runnable
            public void run() {
                Selector open;
                try {
                    ServerSocketChannel open2 = ServerSocketChannel.open();
                    open2.configureBlocking(false);
                    try {
                        open2.socket().bind(new InetSocketAddress(59898));
                        e.a().a("[GuardConnect] registerServerSocket success");
                        blockingQueue.offer(Boolean.TRUE);
                        open = Selector.open();
                        open2.register(open, 16);
                    } catch (Throwable unused) {
                        e.a().a("[GuardConnect] registerServerSocket failed");
                        blockingQueue.offer(Boolean.FALSE);
                        return;
                    }
                } catch (Throwable th2) {
                    e.a().a("[GuardConnect] serverSocket exception: " + th2.getMessage());
                    e.a().b(th2);
                    a.this.c();
                    return;
                }
                while (open != null && open.isOpen()) {
                    if (open.select() > 0) {
                        Iterator<SelectionKey> it = open.selectedKeys().iterator();
                        while (it.hasNext()) {
                            SelectionKey next = it.next();
                            it.remove();
                            if (next.isValid() && next.isAcceptable()) {
                                SocketChannel accept = ((ServerSocketChannel) next.channel()).accept();
                                accept.configureBlocking(false);
                                accept.register(open, 1);
                            }
                            if (next.isValid() && next.isReadable()) {
                                SocketChannel socketChannel = (SocketChannel) next.channel();
                                ByteBuffer allocate = ByteBuffer.allocate(1024);
                                int read = socketChannel.read(allocate);
                                e.a().a("[GuardConnect] serverSocket received bytes:" + read);
                                if (read > 0) {
                                    String str = new String(allocate.array(), 0, read);
                                    e.a().a("[GuardConnect] serverSocket received msg:" + str);
                                    if (!"p".equals(str)) {
                                        if (str.startsWith("lg_")) {
                                            try {
                                                int port = ((InetSocketAddress) socketChannel.socket().getRemoteSocketAddress()).getPort();
                                                String substring = str.substring(3);
                                                a.this.f40559e.put(Integer.valueOf(port), substring);
                                                a.this.f40560f.put(Integer.valueOf(port), next);
                                                c.a().b(substring);
                                            } catch (Throwable th3) {
                                                e.a().a(th3);
                                            }
                                        } else if (str.startsWith("chk_cb_")) {
                                            a.this.a(str.substring(7));
                                        }
                                    }
                                } else {
                                    try {
                                        int port2 = ((InetSocketAddress) socketChannel.socket().getRemoteSocketAddress()).getPort();
                                        String str2 = (String) a.this.f40559e.remove(Integer.valueOf(port2));
                                        a.this.f40560f.remove(Integer.valueOf(port2));
                                        e.a().a("[GuardConnect] serverSocket received client disconnect pkg: " + str2);
                                        c.a().a(str2, false);
                                    } catch (Throwable th4) {
                                        e.a().a(th4);
                                    }
                                    try {
                                        socketChannel.close();
                                    } catch (Throwable th5) {
                                        e.a().a(th5);
                                    }
                                }
                                e.a().a("[GuardConnect] serverSocket exception: " + th2.getMessage());
                                e.a().b(th2);
                                a.this.c();
                                return;
                            }
                        }
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        LinkedBlockingQueue<Boolean> remove = this.f40558d.remove(str);
        if (remove != null) {
            remove.offer(Boolean.TRUE);
        }
    }

    public int a(String str, LinkedBlockingQueue linkedBlockingQueue) {
        int i11 = 0;
        for (Map.Entry<Integer, String> entry : this.f40559e.entrySet()) {
            if (entry.getValue().equals(str) && entry.getKey() != null) {
                this.f40558d.put(str, linkedBlockingQueue);
                SelectionKey selectionKey = this.f40560f.get(entry.getKey());
                if (selectionKey != null) {
                    i11 = a(selectionKey) ? 1 : 2;
                }
            }
        }
        return i11;
    }

    private boolean a(SelectionKey selectionKey) {
        try {
            if (!selectionKey.isValid()) {
                return false;
            }
            ((SocketChannel) selectionKey.channel()).write(ByteBuffer.wrap("chk".getBytes("utf-8")));
            return true;
        } catch (Throwable th2) {
            e.a().a(th2);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final boolean z11) {
        e.a().a("[GuardConnect] onServerDisconnect maxRegisterClientFailedCount: " + this.f40562h + ", isConnectException: " + z11);
        e();
        this.f40557c.execute(new Runnable() { // from class: com.mob.mgs.impl.a.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (c.a().c()) {
                        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
                        a.this.a(linkedBlockingQueue);
                        try {
                            if (((Boolean) linkedBlockingQueue.take()).booleanValue()) {
                                c.a().a((String) null, true);
                                return;
                            }
                        } catch (Throwable th2) {
                            e.a().a(th2);
                        }
                    }
                    if (a.this.f40562h > 0) {
                        if (z11 && a.this.f40562h < 5) {
                            try {
                                Thread.sleep((5 - a.this.f40562h) * 1000);
                            } catch (Throwable unused) {
                            }
                        }
                        a.g(a.this);
                        a.this.b();
                    }
                } catch (Throwable th3) {
                    e.a().a(th3);
                }
            }
        });
    }
}

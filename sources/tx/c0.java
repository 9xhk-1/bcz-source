package tx;

import java.net.SocketOption;
import java.net.StandardSocketOptions;
import java.nio.channels.DatagramChannel;
import java.nio.channels.SelectableChannel;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import tx.p0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nJavaSocketOptions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JavaSocketOptions.kt\nio/ktor/network/sockets/JavaSocketOptionsKt\n+ 2 TypeOfService.kt\nio/ktor/network/sockets/TypeOfService\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,140:1\n23#2:141\n23#2:142\n23#2:144\n23#2:145\n1#3:143\n*S KotlinDebug\n*F\n+ 1 JavaSocketOptions.kt\nio/ktor/network/sockets/JavaSocketOptionsKt\n*L\n28#1:141\n30#1:142\n98#1:144\n100#1:145\n*E\n"})
/* loaded from: classes8.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f91068a;

    static {
        boolean z11;
        try {
            Class.forName("java.net.StandardSocketOptions");
            z11 = true;
        } catch (ClassNotFoundException unused) {
            z11 = false;
        }
        f91068a = z11;
    }

    public static final void a(@m80.k SelectableChannel selectableChannel, @m80.k p0 options) {
        kotlin.jvm.internal.g0.p(selectableChannel, "<this>");
        kotlin.jvm.internal.g0.p(options, "options");
        if (selectableChannel instanceof SocketChannel) {
            if (!a1.j(options.g(), a1.f91061b.e())) {
                if (f91068a) {
                    ((SocketChannel) selectableChannel).setOption((SocketOption<SocketOption>) StandardSocketOptions.IP_TOS, (SocketOption) Integer.valueOf(options.g() & 255));
                } else {
                    ((SocketChannel) selectableChannel).socket().setTrafficClass(options.g() & 255);
                }
            }
            if (options.e()) {
                if (f91068a) {
                    ((SocketChannel) selectableChannel).setOption((SocketOption<SocketOption>) StandardSocketOptions.SO_REUSEADDR, (SocketOption) Boolean.TRUE);
                } else {
                    ((SocketChannel) selectableChannel).socket().setReuseAddress(true);
                }
            }
            if (options.f()) {
                r0.f91181a.c((SocketChannel) selectableChannel);
            }
            if (options instanceof p0.d) {
                p0.d dVar = (p0.d) options;
                Integer valueOf = Integer.valueOf(dVar.m());
                if (valueOf.intValue() <= 0) {
                    valueOf = null;
                }
                if (valueOf != null) {
                    int intValue = valueOf.intValue();
                    if (f91068a) {
                        ((SocketChannel) selectableChannel).setOption((SocketOption<SocketOption>) StandardSocketOptions.SO_RCVBUF, (SocketOption) Integer.valueOf(intValue));
                    } else {
                        ((SocketChannel) selectableChannel).socket().setReceiveBufferSize(intValue);
                    }
                }
                Integer valueOf2 = Integer.valueOf(dVar.n());
                if (valueOf2.intValue() <= 0) {
                    valueOf2 = null;
                }
                if (valueOf2 != null) {
                    int intValue2 = valueOf2.intValue();
                    if (f91068a) {
                        ((SocketChannel) selectableChannel).setOption((SocketOption<SocketOption>) StandardSocketOptions.SO_SNDBUF, (SocketOption) Integer.valueOf(intValue2));
                    } else {
                        ((SocketChannel) selectableChannel).socket().setSendBufferSize(intValue2);
                    }
                }
            }
            if (options instanceof p0.e) {
                p0.e eVar = (p0.e) options;
                Integer valueOf3 = Integer.valueOf(eVar.u());
                if (valueOf3.intValue() < 0) {
                    valueOf3 = null;
                }
                if (valueOf3 != null) {
                    int intValue3 = valueOf3.intValue();
                    if (f91068a) {
                        ((SocketChannel) selectableChannel).setOption((SocketOption<SocketOption>) StandardSocketOptions.SO_LINGER, (SocketOption) Integer.valueOf(intValue3));
                    } else {
                        ((SocketChannel) selectableChannel).socket().setSoLinger(true, intValue3);
                    }
                }
                Boolean t11 = eVar.t();
                if (t11 != null) {
                    boolean booleanValue = t11.booleanValue();
                    if (f91068a) {
                        ((SocketChannel) selectableChannel).setOption((SocketOption<SocketOption>) StandardSocketOptions.SO_KEEPALIVE, (SocketOption) t11);
                    } else {
                        ((SocketChannel) selectableChannel).socket().setKeepAlive(booleanValue);
                    }
                }
                if (f91068a) {
                    ((SocketChannel) selectableChannel).setOption((SocketOption<SocketOption>) StandardSocketOptions.TCP_NODELAY, (SocketOption) Boolean.valueOf(eVar.v()));
                } else {
                    ((SocketChannel) selectableChannel).socket().setTcpNoDelay(eVar.v());
                }
            }
        }
        if (selectableChannel instanceof ServerSocketChannel) {
            if (options.e()) {
                if (f91068a) {
                    ((ServerSocketChannel) selectableChannel).setOption((SocketOption<SocketOption>) StandardSocketOptions.SO_REUSEADDR, (SocketOption) Boolean.TRUE);
                } else {
                    ((ServerSocketChannel) selectableChannel).socket().setReuseAddress(true);
                }
            }
            if (options.f()) {
                r0.f91181a.b((ServerSocketChannel) selectableChannel);
            }
        }
        if (selectableChannel instanceof DatagramChannel) {
            if (!a1.j(options.g(), a1.f91061b.e())) {
                if (f91068a) {
                    ((DatagramChannel) selectableChannel).setOption((SocketOption<SocketOption>) StandardSocketOptions.IP_TOS, (SocketOption) Integer.valueOf(options.g() & 255));
                } else {
                    ((DatagramChannel) selectableChannel).socket().setTrafficClass(options.g() & 255);
                }
            }
            if (options.e()) {
                if (f91068a) {
                    ((DatagramChannel) selectableChannel).setOption((SocketOption<SocketOption>) StandardSocketOptions.SO_REUSEADDR, (SocketOption) Boolean.TRUE);
                } else {
                    ((DatagramChannel) selectableChannel).socket().setReuseAddress(true);
                }
            }
            if (options.f()) {
                r0.f91181a.a((DatagramChannel) selectableChannel);
            }
            if (options instanceof p0.f) {
                if (f91068a) {
                    ((DatagramChannel) selectableChannel).setOption((SocketOption<SocketOption>) StandardSocketOptions.SO_BROADCAST, (SocketOption) Boolean.valueOf(((p0.f) options).t()));
                } else {
                    ((DatagramChannel) selectableChannel).socket().setBroadcast(((p0.f) options).t());
                }
            }
            if (options instanceof p0.d) {
                p0.d dVar2 = (p0.d) options;
                Integer valueOf4 = Integer.valueOf(dVar2.m());
                if (valueOf4.intValue() <= 0) {
                    valueOf4 = null;
                }
                if (valueOf4 != null) {
                    int intValue4 = valueOf4.intValue();
                    if (f91068a) {
                        ((DatagramChannel) selectableChannel).setOption((SocketOption<SocketOption>) StandardSocketOptions.SO_RCVBUF, (SocketOption) Integer.valueOf(intValue4));
                    } else {
                        ((DatagramChannel) selectableChannel).socket().setReceiveBufferSize(intValue4);
                    }
                }
                Integer valueOf5 = Integer.valueOf(dVar2.n());
                Integer num = valueOf5.intValue() > 0 ? valueOf5 : null;
                if (num != null) {
                    int intValue5 = num.intValue();
                    if (f91068a) {
                        ((DatagramChannel) selectableChannel).setOption((SocketOption<SocketOption>) StandardSocketOptions.SO_SNDBUF, (SocketOption) Integer.valueOf(intValue5));
                    } else {
                        ((DatagramChannel) selectableChannel).socket().setSendBufferSize(intValue5);
                    }
                }
            }
        }
    }

    public static final boolean b() {
        return f91068a;
    }

    public static final void c(@m80.k SelectableChannel selectableChannel) {
        kotlin.jvm.internal.g0.p(selectableChannel, "<this>");
        selectableChannel.configureBlocking(false);
    }
}

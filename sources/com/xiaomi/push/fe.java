package com.xiaomi.push;

import java.net.UnknownHostException;

/* loaded from: classes8.dex */
final class fe {

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        ey f45555a;

        /* renamed from: a, reason: collision with other field name */
        String f390a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Throwable] */
    public static a a(Exception exc) {
        m5934a(exc);
        boolean z11 = exc instanceof gg;
        Exception exc2 = exc;
        if (z11) {
            gg ggVar = (gg) exc;
            exc2 = exc;
            if (ggVar.a() != null) {
                exc2 = ggVar.a();
            }
        }
        a aVar = new a();
        String message = exc2.getMessage();
        if (exc2.getCause() != null) {
            message = exc2.getCause().getMessage();
        }
        String str = exc2.getClass().getSimpleName() + ":" + message;
        int a11 = fx.a(exc2);
        if (a11 != 0) {
            aVar.f45555a = ey.a(ey.GSLB_REQUEST_SUCCESS.a() + a11);
        }
        if (aVar.f45555a == null) {
            aVar.f45555a = ey.GSLB_TCP_ERR_OTHER;
        }
        if (aVar.f45555a == ey.GSLB_TCP_ERR_OTHER) {
            aVar.f390a = str;
        }
        return aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Throwable] */
    public static a b(Exception exc) {
        ey eyVar;
        ey eyVar2;
        Throwable cause;
        m5934a(exc);
        boolean z11 = exc instanceof gg;
        Exception exc2 = exc;
        if (z11) {
            gg ggVar = (gg) exc;
            exc2 = exc;
            if (ggVar.a() != null) {
                exc2 = ggVar.a();
            }
        }
        a aVar = new a();
        String message = exc2.getMessage();
        if (exc2.getCause() != null) {
            message = exc2.getCause().getMessage();
        }
        int a11 = fx.a(exc2);
        String str = exc2.getClass().getSimpleName() + ":" + message;
        if (a11 != 0) {
            ey a12 = ey.a(ey.CONN_SUCCESS.a() + a11);
            aVar.f45555a = a12;
            if (a12 == ey.CONN_BOSH_ERR && (cause = exc2.getCause()) != null && (cause instanceof UnknownHostException)) {
                eyVar = ey.CONN_BOSH_UNKNOWNHOST;
            }
            eyVar2 = aVar.f45555a;
            if (eyVar2 == ey.CONN_TCP_ERR_OTHER && eyVar2 != ey.CONN_XMPP_ERR && eyVar2 != ey.CONN_BOSH_ERR) {
                return aVar;
            }
            aVar.f390a = str;
            return aVar;
        }
        eyVar = ey.CONN_XMPP_ERR;
        aVar.f45555a = eyVar;
        eyVar2 = aVar.f45555a;
        if (eyVar2 == ey.CONN_TCP_ERR_OTHER) {
        }
        aVar.f390a = str;
        return aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Throwable] */
    public static a c(Exception exc) {
        ey eyVar;
        ey eyVar2;
        m5934a(exc);
        boolean z11 = exc instanceof gg;
        Exception exc2 = exc;
        if (z11) {
            gg ggVar = (gg) exc;
            exc2 = exc;
            if (ggVar.a() != null) {
                exc2 = ggVar.a();
            }
        }
        a aVar = new a();
        String message = exc2.getMessage();
        if (exc2.getCause() != null) {
            message = exc2.getCause().getMessage();
        }
        int a11 = fx.a(exc2);
        String str = exc2.getClass().getSimpleName() + ":" + message;
        if (a11 == 105) {
            eyVar = ey.BIND_TCP_READ_TIMEOUT;
        } else if (a11 == 199) {
            eyVar = ey.BIND_TCP_ERR;
        } else {
            if (a11 == 499) {
                aVar.f45555a = ey.BIND_BOSH_ERR;
                if (message.startsWith("Terminal binding condition encountered: item-not-found")) {
                    eyVar = ey.BIND_BOSH_ITEM_NOT_FOUND;
                }
                eyVar2 = aVar.f45555a;
                if (eyVar2 == ey.BIND_TCP_ERR && eyVar2 != ey.BIND_XMPP_ERR && eyVar2 != ey.BIND_BOSH_ERR) {
                    return aVar;
                }
                aVar.f390a = str;
                return aVar;
            }
            eyVar = a11 != 109 ? a11 != 110 ? ey.BIND_XMPP_ERR : ey.BIND_TCP_BROKEN_PIPE : ey.BIND_TCP_CONNRESET;
        }
        aVar.f45555a = eyVar;
        eyVar2 = aVar.f45555a;
        if (eyVar2 == ey.BIND_TCP_ERR) {
        }
        aVar.f390a = str;
        return aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Throwable] */
    public static a d(Exception exc) {
        ey eyVar;
        ey eyVar2;
        m5934a(exc);
        boolean z11 = exc instanceof gg;
        Exception exc2 = exc;
        if (z11) {
            gg ggVar = (gg) exc;
            exc2 = exc;
            if (ggVar.a() != null) {
                exc2 = ggVar.a();
            }
        }
        a aVar = new a();
        String message = exc2.getMessage();
        int a11 = fx.a(exc2);
        String str = exc2.getClass().getSimpleName() + ":" + message;
        if (a11 == 105) {
            eyVar = ey.CHANNEL_TCP_READTIMEOUT;
        } else if (a11 == 199) {
            eyVar = ey.CHANNEL_TCP_ERR;
        } else {
            if (a11 == 499) {
                aVar.f45555a = ey.CHANNEL_BOSH_EXCEPTION;
                if (message.startsWith("Terminal binding condition encountered: item-not-found")) {
                    eyVar = ey.CHANNEL_BOSH_ITEMNOTFIND;
                }
                eyVar2 = aVar.f45555a;
                if (eyVar2 == ey.CHANNEL_TCP_ERR && eyVar2 != ey.CHANNEL_XMPPEXCEPTION && eyVar2 != ey.CHANNEL_BOSH_EXCEPTION) {
                    return aVar;
                }
                aVar.f390a = str;
                return aVar;
            }
            eyVar = a11 != 109 ? a11 != 110 ? ey.CHANNEL_XMPPEXCEPTION : ey.CHANNEL_TCP_BROKEN_PIPE : ey.CHANNEL_TCP_CONNRESET;
        }
        aVar.f45555a = eyVar;
        eyVar2 = aVar.f45555a;
        if (eyVar2 == ey.CHANNEL_TCP_ERR) {
        }
        aVar.f390a = str;
        return aVar;
    }

    /* renamed from: a, reason: collision with other method in class */
    private static void m5934a(Exception exc) {
        exc.getClass();
    }
}

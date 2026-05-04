package com.microsoft.thrifty.service;

import androidx.core.app.NotificationCompat;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import com.microsoft.thrifty.ThriftException;
import j00.c;
import java.io.Closeable;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import l00.d;
import m80.k;
import m80.l;
import ts.e;
import ws.h;
import ws.i;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nClientBase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClientBase.kt\ncom/microsoft/thrifty/service/ClientBase\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,216:1\n1#2:217\n*E\n"})
/* loaded from: classes7.dex */
public class ClientBase implements Closeable {

    @k
    private final i protocol;

    @k
    private final AtomicBoolean running;

    @k
    private final AtomicInteger seqId;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class ServerException extends Exception {

        @k
        private final ThriftException thriftException;

        public ServerException(@k ThriftException thriftException) {
            g0.p(thriftException, "thriftException");
            this.thriftException = thriftException;
        }

        @k
        public final ThriftException getThriftException() {
            return this.thriftException;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @d(c = "com.microsoft.thrifty.service.ClientBase", f = "ClientBase.kt", i = {0, 0, 0, 0}, l = {170}, m = "invokeRequestSuspend", n = {"this", NotificationCompat.CATEGORY_CALL, "isOneWay", CmcdConfiguration.KEY_SESSION_ID}, s = {"L$0", "L$1", "I$0", "I$1"})
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f40013a;

        /* renamed from: b, reason: collision with root package name */
        public Object f40014b;

        /* renamed from: c, reason: collision with root package name */
        public int f40015c;

        /* renamed from: d, reason: collision with root package name */
        public int f40016d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f40017e;

        /* renamed from: g, reason: collision with root package name */
        public int f40019g;

        public a(c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f40017e = obj;
            this.f40019g |= Integer.MIN_VALUE;
            return ClientBase.this.invokeRequestSuspend(null, this);
        }
    }

    public ClientBase(@k i protocol) {
        g0.p(protocol, "protocol");
        this.protocol = protocol;
        this.seqId = new AtomicInteger(0);
        this.running = new AtomicBoolean(true);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.running.compareAndSet(true, false)) {
            closeProtocol();
        }
    }

    public final void closeProtocol() {
        try {
            this.protocol.close();
        } catch (IOException unused) {
        }
    }

    @l
    public final Object execute(@k xs.d<?> methodCall) throws Exception {
        g0.p(methodCall, "methodCall");
        if (!this.running.get()) {
            throw new IllegalStateException("Cannot write to a closed service client");
        }
        try {
            return invokeRequest(methodCall);
        } catch (ServerException e11) {
            throw e11.getThriftException();
        }
    }

    @k
    public final AtomicBoolean getRunning() {
        return this.running;
    }

    @l
    public final Object invokeRequest(@k xs.d<?> call) throws Exception {
        g0.p(call, "call");
        boolean z11 = call.callTypeId == 4;
        int incrementAndGet = this.seqId.incrementAndGet();
        this.protocol.U3(call.name, call.callTypeId, incrementAndGet);
        call.send(this.protocol);
        this.protocol.t4();
        if (z11) {
            return g2.f100423a;
        }
        h T8 = this.protocol.T8();
        int i11 = T8.f96843b;
        if (i11 != incrementAndGet) {
            throw new ThriftException(ThriftException.Kind.BAD_SEQUENCE_ID, "Unrecognized sequence ID");
        }
        byte b11 = T8.f96842a;
        if (b11 == 3) {
            ThriftException a11 = ThriftException.Companion.a(this.protocol);
            this.protocol.V0();
            throw new ServerException(a11);
        }
        if (b11 != 2) {
            throw new ThriftException(ThriftException.Kind.INVALID_MESSAGE_TYPE, "Invalid message type: " + ((int) T8.f96842a));
        }
        if (i11 != this.seqId.get()) {
            throw new ThriftException(ThriftException.Kind.BAD_SEQUENCE_ID, "Out-of-order response");
        }
        if (g0.g(T8.f96844c, call.name)) {
            try {
                Object receive = call.receive(this.protocol, T8);
                this.protocol.V0();
                return receive;
            } catch (Exception e11) {
                if (e11 instanceof e) {
                    this.protocol.V0();
                }
                throw e11;
            }
        }
        throw new ThriftException(ThriftException.Kind.WRONG_METHOD_NAME, "Unexpected method name in reply; expected " + call.name + " but received " + T8.f96844c);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeRequestSuspend(@m80.k xs.d<?> r8, @m80.k j00.c<java.lang.Object> r9) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.microsoft.thrifty.service.ClientBase.invokeRequestSuspend(xs.d, j00.c):java.lang.Object");
    }
}

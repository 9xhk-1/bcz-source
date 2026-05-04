package com.baicizhan.online.playground_api;

import com.baicizhan.biz.online.thrift.basic.LogicException;
import com.baicizhan.biz.online.thrift.basic.SystemException;
import com.microsoft.thrifty.ThriftException;
import com.microsoft.thrifty.service.a;
import com.microsoft.thrifty.service.b;
import j00.c;
import j00.g;
import java.io.IOException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.g0;
import l00.f;
import m80.k;
import m80.l;
import ws.h;
import ws.i;
import xs.d;
import xs.e;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public final class PlaygroundApiServiceClient extends b implements PlaygroundApiService {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Get_lavaquest_game_infoCall extends d<LavaquestGameInfo> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Get_lavaquest_game_infoCall(@k e<LavaquestGameInfo> callback) {
            super("get_lavaquest_game_info", (byte) 1, callback);
            g0.p(callback, "callback");
        }

        @Override // xs.d
        public void send(@k i protocol) throws IOException {
            g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.r0();
            protocol.E6();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // xs.d
        @k
        public LavaquestGameInfo receive(@k i protocol, @k h metadata) throws Exception {
            g0.p(protocol, "protocol");
            g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            LavaquestGameInfo lavaquestGameInfo = null;
            while (true) {
                ws.d a62 = protocol.a6();
                byte b11 = a62.f96796b;
                if (b11 == 0) {
                    break;
                }
                short s11 = a62.f96797c;
                if (s11 != 0) {
                    if (s11 != 1) {
                        if (s11 != 2) {
                            at.b.a(protocol, b11);
                        } else if (b11 == 12) {
                            logicException = LogicException.ADAPTER.read(protocol);
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 12) {
                        systemException = SystemException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 12) {
                    lavaquestGameInfo = LavaquestGameInfo.ADAPTER.read(protocol);
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (systemException != null) {
                throw systemException;
            }
            if (logicException != null) {
                throw logicException;
            }
            if (lavaquestGameInfo != null) {
                return lavaquestGameInfo;
            }
            throw new ThriftException(ThriftException.Kind.MISSING_RESULT, "Missing result");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class ResurrectCall extends d<g2> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ResurrectCall(@k e<g2> callback) {
            super("resurrect", (byte) 1, callback);
            g0.p(callback, "callback");
        }

        @Override // xs.d
        public /* bridge */ /* synthetic */ g2 receive(i iVar, h hVar) {
            receive2(iVar, hVar);
            return g2.f100423a;
        }

        @Override // xs.d
        public void send(@k i protocol) throws IOException {
            g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.r0();
            protocol.E6();
        }

        /* renamed from: receive, reason: avoid collision after fix types in other method */
        public void receive2(@k i protocol, @k h metadata) throws Exception {
            g0.p(protocol, "protocol");
            g0.p(metadata, "metadata");
            protocol.u0();
            SystemException systemException = null;
            LogicException logicException = null;
            while (true) {
                ws.d a62 = protocol.a6();
                byte b11 = a62.f96796b;
                if (b11 == 0) {
                    break;
                }
                short s11 = a62.f96797c;
                if (s11 != 1) {
                    if (s11 != 2) {
                        at.b.a(protocol, b11);
                    } else if (b11 == 12) {
                        logicException = LogicException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 12) {
                    systemException = SystemException.ADAPTER.read(protocol);
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (systemException != null) {
                throw systemException;
            }
            if (logicException != null) {
                throw logicException;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaygroundApiServiceClient(@k i protocol, @k a.InterfaceC0480a listener) {
        super(protocol, listener);
        g0.p(protocol, "protocol");
        g0.p(listener, "listener");
    }

    @Override // com.baicizhan.online.playground_api.PlaygroundApiService
    @l
    public Object get_lavaquest_game_info(@k c<? super LavaquestGameInfo> cVar) {
        final g gVar = new g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new Get_lavaquest_game_infoCall(new e<LavaquestGameInfo>() { // from class: com.baicizhan.online.playground_api.PlaygroundApiServiceClient$get_lavaquest_game_info$2$1
            @Override // xs.e
            public void onError(@k Throwable error) {
                g0.p(error, "error");
                c<LavaquestGameInfo> cVar2 = gVar;
                Result.a aVar = Result.Companion;
                cVar2.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
            }

            @Override // xs.e
            public void onSuccess(@k LavaquestGameInfo result) {
                g0.p(result, "result");
                c<LavaquestGameInfo> cVar2 = gVar;
                Result.a aVar = Result.Companion;
                cVar2.resumeWith(Result.m6308constructorimpl(result));
            }
        }));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            f.c(cVar);
        }
        return b11;
    }

    @Override // com.baicizhan.online.playground_api.PlaygroundApiService
    @l
    public Object resurrect(@k c<? super g2> cVar) {
        final g gVar = new g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new ResurrectCall(new e<g2>() { // from class: com.baicizhan.online.playground_api.PlaygroundApiServiceClient$resurrect$2$1
            @Override // xs.e
            public void onError(@k Throwable error) {
                g0.p(error, "error");
                c<g2> cVar2 = gVar;
                Result.a aVar = Result.Companion;
                cVar2.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
            }

            @Override // xs.e
            public void onSuccess(@k g2 result) {
                g0.p(result, "result");
                c<g2> cVar2 = gVar;
                Result.a aVar = Result.Companion;
                cVar2.resumeWith(Result.m6308constructorimpl(result));
            }
        }));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            f.c(cVar);
        }
        return b11 == kotlin.coroutines.intrinsics.b.l() ? b11 : g2.f100423a;
    }
}

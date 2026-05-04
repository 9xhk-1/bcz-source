package org.apache.thrift.server;

import org.apache.thrift.server.TServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class TSimpleServer extends TServer {
    private static final Logger LOGGER = LoggerFactory.getLogger(TSimpleServer.class.getName());

    public TSimpleServer(TServer.AbstractServerArgs abstractServerArgs) {
        super(abstractServerArgs);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00aa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0010 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0089  */
    @Override // org.apache.thrift.server.TServer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void serve() {
        /*
            Method dump skipped, instructions count: 189
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.thrift.server.TSimpleServer.serve():void");
    }

    @Override // org.apache.thrift.server.TServer
    public void stop() {
        this.stopped_ = true;
        this.serverTransport_.interrupt();
    }
}

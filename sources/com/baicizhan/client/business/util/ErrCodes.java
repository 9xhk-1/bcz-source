package com.baicizhan.client.business.util;

import org.apache.thrift.TException;
import org.apache.thrift.transport.TTransportException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class ErrCodes {
    public static final int ERR_FILE = -300;
    public static final int ERR_NET = -100;
    public static final int ERR_SERVER = -101;
    public static final int ERR_TOKEN_LOST = -200;
    public static final int ERR_UNKNOWN = -1000;
    public static final int NO_ERR = 0;

    private ErrCodes() {
    }

    public static final String buildErrMessage(int code, String append) {
        if (code == -1000) {
            return "Unknown err, info > " + append;
        }
        if (code == -300) {
            return "File I/O error, info > " + append;
        }
        if (code == -200) {
            return "The user token does not exist, info > " + append;
        }
        if (code == -101) {
            return "The server is not ok, info > " + append;
        }
        if (code != -100) {
            return append;
        }
        return "The network is not ok, info > " + append;
    }

    public static final int parseNetRelatedErrCode(int code) {
        if (code == 0 || -101 == code) {
            return 0;
        }
        if (-100 == code) {
            return ERR_FILE;
        }
        if (code < 0) {
            return -100;
        }
        return code > 200 ? -101 : -1000;
    }

    public static final int parseNetRelatedErrCode(TException exception) {
        if (exception == null) {
            return -1000;
        }
        return ((exception instanceof TTransportException) && 3 == ((TTransportException) exception).getType()) ? -100 : -101;
    }
}

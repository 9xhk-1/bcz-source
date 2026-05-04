package org.apache.thrift.protocol;

import org.apache.thrift.TException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class TProtocolException extends TException {
    public static final int BAD_VERSION = 4;
    public static final int DEPTH_LIMIT = 6;
    public static final int INVALID_DATA = 1;
    public static final int NEGATIVE_SIZE = 2;
    public static final int NOT_IMPLEMENTED = 5;
    public static final int SIZE_LIMIT = 3;
    public static final int UNKNOWN = 0;
    private static final long serialVersionUID = 1;
    protected int type_;

    public TProtocolException() {
        this.type_ = 0;
    }

    public int getType() {
        return this.type_;
    }

    public TProtocolException(int i11) {
        this.type_ = i11;
    }

    public TProtocolException(int i11, String str) {
        super(str);
        this.type_ = i11;
    }

    public TProtocolException(String str) {
        super(str);
        this.type_ = 0;
    }

    public TProtocolException(int i11, Throwable th2) {
        super(th2);
        this.type_ = i11;
    }

    public TProtocolException(Throwable th2) {
        super(th2);
        this.type_ = 0;
    }

    public TProtocolException(String str, Throwable th2) {
        super(str, th2);
        this.type_ = 0;
    }

    public TProtocolException(int i11, String str, Throwable th2) {
        super(str, th2);
        this.type_ = i11;
    }
}

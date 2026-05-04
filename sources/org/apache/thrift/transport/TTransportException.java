package org.apache.thrift.transport;

import org.apache.thrift.TException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class TTransportException extends TException {
    public static final int ALREADY_OPEN = 2;
    public static final int END_OF_FILE = 4;
    public static final int NOT_OPEN = 1;
    public static final int TIMED_OUT = 3;
    public static final int UNKNOWN = 0;
    private static final long serialVersionUID = 1;
    protected int type_;

    public TTransportException() {
        this.type_ = 0;
    }

    public int getType() {
        return this.type_;
    }

    public TTransportException(int i11) {
        this.type_ = i11;
    }

    public TTransportException(int i11, String str) {
        super(str);
        this.type_ = i11;
    }

    public TTransportException(String str) {
        super(str);
        this.type_ = 0;
    }

    public TTransportException(int i11, Throwable th2) {
        super(th2);
        this.type_ = i11;
    }

    public TTransportException(Throwable th2) {
        super(th2);
        this.type_ = 0;
    }

    public TTransportException(String str, Throwable th2) {
        super(str, th2);
        this.type_ = 0;
    }

    public TTransportException(int i11, String str, Throwable th2) {
        super(str, th2);
        this.type_ = i11;
    }
}

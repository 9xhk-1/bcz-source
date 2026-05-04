package org.apache.thrift.scheme;

import org.apache.thrift.TBase;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TProtocol;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public interface IScheme<T extends TBase> {
    void read(TProtocol tProtocol, T t11) throws TException;

    void write(TProtocol tProtocol, T t11) throws TException;
}

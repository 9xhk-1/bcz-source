package org.apache.thrift.protocol;

import java.io.Serializable;
import org.apache.thrift.transport.TTransport;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public interface TProtocolFactory extends Serializable {
    TProtocol getProtocol(TTransport tTransport);
}

package org.apache.thrift;

import java.io.Serializable;
import org.apache.thrift.TBase;
import org.apache.thrift.TFieldIdEnum;
import org.apache.thrift.protocol.TProtocol;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public interface TBase<T extends TBase<?, ?>, F extends TFieldIdEnum> extends Comparable<T>, Serializable {
    void clear();

    /* renamed from: deepCopy */
    TBase<T, F> deepCopy2();

    F fieldForId(int i11);

    Object getFieldValue(F f11);

    boolean isSet(F f11);

    void read(TProtocol tProtocol) throws TException;

    void setFieldValue(F f11, Object obj);

    void write(TProtocol tProtocol) throws TException;
}

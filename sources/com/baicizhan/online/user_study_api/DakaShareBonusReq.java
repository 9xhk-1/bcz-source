package com.baicizhan.online.user_study_api;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TBase;
import org.apache.thrift.TBaseHelper;
import org.apache.thrift.TException;
import org.apache.thrift.TFieldIdEnum;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.protocol.TField;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.protocol.TProtocolUtil;
import org.apache.thrift.protocol.TStruct;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;
import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.transport.TIOStreamTransport;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class DakaShareBonusReq implements TBase<DakaShareBonusReq, _Fields>, Serializable, Cloneable, Comparable<DakaShareBonusReq> {
    private static final int __CHANNEL_ISSET_ID = 1;
    private static final int __CLIENT_TIMESTAMP_MS_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public int channel;
    public long client_timestamp_ms;
    private static final TStruct STRUCT_DESC = new TStruct("DakaShareBonusReq");
    private static final TField CLIENT_TIMESTAMP_MS_FIELD_DESC = new TField("client_timestamp_ms", (byte) 10, 1);
    private static final TField CHANNEL_FIELD_DESC = new TField("channel", (byte) 8, 2);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.user_study_api.DakaShareBonusReq$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_study_api$DakaShareBonusReq$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$user_study_api$DakaShareBonusReq$_Fields = iArr;
            try {
                iArr[_Fields.CLIENT_TIMESTAMP_MS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$DakaShareBonusReq$_Fields[_Fields.CHANNEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class DakaShareBonusReqStandardScheme extends StandardScheme<DakaShareBonusReq> {
        private DakaShareBonusReqStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, DakaShareBonusReq struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    break;
                }
                short s11 = readFieldBegin.f77768id;
                if (s11 != 1) {
                    if (s11 != 2) {
                        TProtocolUtil.skip(iprot, b11);
                    } else if (b11 == 8) {
                        struct.channel = iprot.readI32();
                        struct.setChannelIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 10) {
                    struct.client_timestamp_ms = iprot.readI64();
                    struct.setClient_timestamp_msIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (!struct.isSetClient_timestamp_ms()) {
                throw new TProtocolException("Required field 'client_timestamp_ms' was not found in serialized data! Struct: " + toString());
            }
            if (struct.isSetChannel()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'channel' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, DakaShareBonusReq struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(DakaShareBonusReq.STRUCT_DESC);
            oprot.writeFieldBegin(DakaShareBonusReq.CLIENT_TIMESTAMP_MS_FIELD_DESC);
            oprot.writeI64(struct.client_timestamp_ms);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(DakaShareBonusReq.CHANNEL_FIELD_DESC);
            oprot.writeI32(struct.channel);
            oprot.writeFieldEnd();
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class DakaShareBonusReqStandardSchemeFactory implements SchemeFactory {
        private DakaShareBonusReqStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public DakaShareBonusReqStandardScheme getScheme() {
            return new DakaShareBonusReqStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class DakaShareBonusReqTupleScheme extends TupleScheme<DakaShareBonusReq> {
        private DakaShareBonusReqTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, DakaShareBonusReq struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.client_timestamp_ms = tTupleProtocol.readI64();
            struct.setClient_timestamp_msIsSet(true);
            struct.channel = tTupleProtocol.readI32();
            struct.setChannelIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, DakaShareBonusReq struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI64(struct.client_timestamp_ms);
            tTupleProtocol.writeI32(struct.channel);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class DakaShareBonusReqTupleSchemeFactory implements SchemeFactory {
        private DakaShareBonusReqTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public DakaShareBonusReqTupleScheme getScheme() {
            return new DakaShareBonusReqTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        CLIENT_TIMESTAMP_MS(1, "client_timestamp_ms"),
        CHANNEL(2, "channel");

        private static final Map<String, _Fields> byName = new HashMap();
        private final String _fieldName;
        private final short _thriftId;

        static {
            Iterator it = EnumSet.allOf(_Fields.class).iterator();
            while (it.hasNext()) {
                _Fields _fields = (_Fields) it.next();
                byName.put(_fields.getFieldName(), _fields);
            }
        }

        _Fields(short thriftId, String fieldName) {
            this._thriftId = thriftId;
            this._fieldName = fieldName;
        }

        public static _Fields findByName(String name) {
            return byName.get(name);
        }

        public static _Fields findByThriftId(int fieldId) {
            if (fieldId == 1) {
                return CLIENT_TIMESTAMP_MS;
            }
            if (fieldId != 2) {
                return null;
            }
            return CHANNEL;
        }

        public static _Fields findByThriftIdOrThrow(int fieldId) {
            _Fields findByThriftId = findByThriftId(fieldId);
            if (findByThriftId != null) {
                return findByThriftId;
            }
            throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
        }

        @Override // org.apache.thrift.TFieldIdEnum
        public String getFieldName() {
            return this._fieldName;
        }

        @Override // org.apache.thrift.TFieldIdEnum
        public short getThriftFieldId() {
            return this._thriftId;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        schemes = hashMap;
        hashMap.put(StandardScheme.class, new DakaShareBonusReqStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new DakaShareBonusReqTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.CLIENT_TIMESTAMP_MS, (_Fields) new FieldMetaData("client_timestamp_ms", (byte) 1, new FieldValueMetaData((byte) 10)));
        enumMap.put((EnumMap) _Fields.CHANNEL, (_Fields) new FieldMetaData("channel", (byte) 1, new FieldValueMetaData((byte) 8)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(DakaShareBonusReq.class, unmodifiableMap);
    }

    public DakaShareBonusReq() {
        this.__isset_bitfield = (byte) 0;
    }

    private void readObject(ObjectInputStream in2) throws IOException, ClassNotFoundException {
        try {
            this.__isset_bitfield = (byte) 0;
            read(new TCompactProtocol(new TIOStreamTransport(in2)));
        } catch (TException e11) {
            throw new IOException(e11);
        }
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        try {
            write(new TCompactProtocol(new TIOStreamTransport(out)));
        } catch (TException e11) {
            throw new IOException(e11);
        }
    }

    @Override // org.apache.thrift.TBase
    public void clear() {
        setClient_timestamp_msIsSet(false);
        this.client_timestamp_ms = 0L;
        setChannelIsSet(false);
        this.channel = 0;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof DakaShareBonusReq)) {
            return equals((DakaShareBonusReq) that);
        }
        return false;
    }

    public int getChannel() {
        return this.channel;
    }

    public long getClient_timestamp_ms() {
        return this.client_timestamp_ms;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetChannel() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetClient_timestamp_ms() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public DakaShareBonusReq setChannel(int channel) {
        this.channel = channel;
        setChannelIsSet(true);
        return this;
    }

    public void setChannelIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public DakaShareBonusReq setClient_timestamp_ms(long client_timestamp_ms) {
        this.client_timestamp_ms = client_timestamp_ms;
        setClient_timestamp_msIsSet(true);
        return this;
    }

    public void setClient_timestamp_msIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public String toString() {
        return "DakaShareBonusReq(client_timestamp_ms:" + this.client_timestamp_ms + org.junit.jupiter.api.j2.O + "channel:" + this.channel + pn.j.f81007d;
    }

    public void unsetChannel() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetClient_timestamp_ms() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(DakaShareBonusReq other) {
        int compareTo;
        int compareTo2;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo3 = Boolean.valueOf(isSetClient_timestamp_ms()).compareTo(Boolean.valueOf(other.isSetClient_timestamp_ms()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (isSetClient_timestamp_ms() && (compareTo2 = TBaseHelper.compareTo(this.client_timestamp_ms, other.client_timestamp_ms)) != 0) {
            return compareTo2;
        }
        int compareTo4 = Boolean.valueOf(isSetChannel()).compareTo(Boolean.valueOf(other.isSetChannel()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (!isSetChannel() || (compareTo = TBaseHelper.compareTo(this.channel, other.channel)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<DakaShareBonusReq, _Fields> deepCopy2() {
        return new DakaShareBonusReq(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$DakaShareBonusReq$_Fields[field.ordinal()];
        if (i11 == 1) {
            return Long.valueOf(getClient_timestamp_ms());
        }
        if (i11 == 2) {
            return Integer.valueOf(getChannel());
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$DakaShareBonusReq$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetClient_timestamp_ms();
        }
        if (i11 == 2) {
            return isSetChannel();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$DakaShareBonusReq$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetClient_timestamp_ms();
                return;
            } else {
                setClient_timestamp_ms(((Long) value).longValue());
                return;
            }
        }
        if (i11 != 2) {
            return;
        }
        if (value == null) {
            unsetChannel();
        } else {
            setChannel(((Integer) value).intValue());
        }
    }

    public DakaShareBonusReq(long client_timestamp_ms, int channel) {
        this();
        this.client_timestamp_ms = client_timestamp_ms;
        setClient_timestamp_msIsSet(true);
        this.channel = channel;
        setChannelIsSet(true);
    }

    public boolean equals(DakaShareBonusReq that) {
        return that != null && this.client_timestamp_ms == that.client_timestamp_ms && this.channel == that.channel;
    }

    public DakaShareBonusReq(DakaShareBonusReq other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        this.client_timestamp_ms = other.client_timestamp_ms;
        this.channel = other.channel;
    }

    public void validate() throws TException {
    }
}

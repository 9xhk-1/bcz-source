package com.baicizhan.online.user_study_api;

import com.meizu.cloud.pushsdk.constants.PushConstants;
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
public class MemberInfo implements TBase<MemberInfo, _Fields>, Serializable, Cloneable, Comparable<MemberInfo> {
    private static final int __EXPIRE_TIME_ISSET_ID = 1;
    private static final int __VIP_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public int expire_time;
    public boolean vip;
    private static final TStruct STRUCT_DESC = new TStruct("MemberInfo");
    private static final TField VIP_FIELD_DESC = new TField("vip", (byte) 2, 1);
    private static final TField EXPIRE_TIME_FIELD_DESC = new TField(PushConstants.REGISTER_STATUS_EXPIRE_TIME, (byte) 8, 2);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.user_study_api.MemberInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_study_api$MemberInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$user_study_api$MemberInfo$_Fields = iArr;
            try {
                iArr[_Fields.VIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$MemberInfo$_Fields[_Fields.EXPIRE_TIME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class MemberInfoStandardScheme extends StandardScheme<MemberInfo> {
        private MemberInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, MemberInfo struct) throws TException {
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
                        struct.expire_time = iprot.readI32();
                        struct.setExpire_timeIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 2) {
                    struct.vip = iprot.readBool();
                    struct.setVipIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (!struct.isSetVip()) {
                throw new TProtocolException("Required field 'vip' was not found in serialized data! Struct: " + toString());
            }
            if (struct.isSetExpire_time()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'expire_time' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, MemberInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(MemberInfo.STRUCT_DESC);
            oprot.writeFieldBegin(MemberInfo.VIP_FIELD_DESC);
            oprot.writeBool(struct.vip);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(MemberInfo.EXPIRE_TIME_FIELD_DESC);
            oprot.writeI32(struct.expire_time);
            oprot.writeFieldEnd();
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class MemberInfoStandardSchemeFactory implements SchemeFactory {
        private MemberInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public MemberInfoStandardScheme getScheme() {
            return new MemberInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class MemberInfoTupleScheme extends TupleScheme<MemberInfo> {
        private MemberInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, MemberInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.vip = tTupleProtocol.readBool();
            struct.setVipIsSet(true);
            struct.expire_time = tTupleProtocol.readI32();
            struct.setExpire_timeIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, MemberInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeBool(struct.vip);
            tTupleProtocol.writeI32(struct.expire_time);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class MemberInfoTupleSchemeFactory implements SchemeFactory {
        private MemberInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public MemberInfoTupleScheme getScheme() {
            return new MemberInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        VIP(1, "vip"),
        EXPIRE_TIME(2, PushConstants.REGISTER_STATUS_EXPIRE_TIME);

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
                return VIP;
            }
            if (fieldId != 2) {
                return null;
            }
            return EXPIRE_TIME;
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
        hashMap.put(StandardScheme.class, new MemberInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new MemberInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.VIP, (_Fields) new FieldMetaData("vip", (byte) 1, new FieldValueMetaData((byte) 2)));
        enumMap.put((EnumMap) _Fields.EXPIRE_TIME, (_Fields) new FieldMetaData(PushConstants.REGISTER_STATUS_EXPIRE_TIME, (byte) 1, new FieldValueMetaData((byte) 8)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(MemberInfo.class, unmodifiableMap);
    }

    public MemberInfo() {
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
        setVipIsSet(false);
        this.vip = false;
        setExpire_timeIsSet(false);
        this.expire_time = 0;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof MemberInfo)) {
            return equals((MemberInfo) that);
        }
        return false;
    }

    public int getExpire_time() {
        return this.expire_time;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetExpire_time() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetVip() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isVip() {
        return this.vip;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public MemberInfo setExpire_time(int expire_time) {
        this.expire_time = expire_time;
        setExpire_timeIsSet(true);
        return this;
    }

    public void setExpire_timeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public MemberInfo setVip(boolean vip) {
        this.vip = vip;
        setVipIsSet(true);
        return this;
    }

    public void setVipIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public String toString() {
        return "MemberInfo(vip:" + this.vip + org.junit.jupiter.api.j2.O + "expire_time:" + this.expire_time + pn.j.f81007d;
    }

    public void unsetExpire_time() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetVip() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(MemberInfo other) {
        int compareTo;
        int compareTo2;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo3 = Boolean.valueOf(isSetVip()).compareTo(Boolean.valueOf(other.isSetVip()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (isSetVip() && (compareTo2 = TBaseHelper.compareTo(this.vip, other.vip)) != 0) {
            return compareTo2;
        }
        int compareTo4 = Boolean.valueOf(isSetExpire_time()).compareTo(Boolean.valueOf(other.isSetExpire_time()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (!isSetExpire_time() || (compareTo = TBaseHelper.compareTo(this.expire_time, other.expire_time)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<MemberInfo, _Fields> deepCopy2() {
        return new MemberInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$MemberInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return Boolean.valueOf(isVip());
        }
        if (i11 == 2) {
            return Integer.valueOf(getExpire_time());
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$MemberInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetVip();
        }
        if (i11 == 2) {
            return isSetExpire_time();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$MemberInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetVip();
                return;
            } else {
                setVip(((Boolean) value).booleanValue());
                return;
            }
        }
        if (i11 != 2) {
            return;
        }
        if (value == null) {
            unsetExpire_time();
        } else {
            setExpire_time(((Integer) value).intValue());
        }
    }

    public MemberInfo(boolean vip, int expire_time) {
        this();
        this.vip = vip;
        setVipIsSet(true);
        this.expire_time = expire_time;
        setExpire_timeIsSet(true);
    }

    public boolean equals(MemberInfo that) {
        return that != null && this.vip == that.vip && this.expire_time == that.expire_time;
    }

    public MemberInfo(MemberInfo other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        this.vip = other.vip;
        this.expire_time = other.expire_time;
    }

    public void validate() throws TException {
    }
}

package com.baicizhan.online.bs_socials;

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
import org.apache.thrift.meta_data.StructMetaData;
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
import org.junit.jupiter.api.j2;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class BBFriendRankInfo implements TBase<BBFriendRankInfo, _Fields>, Serializable, Cloneable, Comparable<BBFriendRankInfo> {
    private static final int __LEARN_COUNT_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public BBFriendInfo friend_info;
    public int learn_count;
    private static final TStruct STRUCT_DESC = new TStruct("BBFriendRankInfo");
    private static final TField FRIEND_INFO_FIELD_DESC = new TField("friend_info", (byte) 12, 1);
    private static final TField LEARN_COUNT_FIELD_DESC = new TField("learn_count", (byte) 8, 2);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.bs_socials.BBFriendRankInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_socials$BBFriendRankInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$bs_socials$BBFriendRankInfo$_Fields = iArr;
            try {
                iArr[_Fields.FRIEND_INFO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_socials$BBFriendRankInfo$_Fields[_Fields.LEARN_COUNT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBFriendRankInfoStandardScheme extends StandardScheme<BBFriendRankInfo> {
        private BBFriendRankInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, BBFriendRankInfo struct) throws TException {
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
                        struct.learn_count = iprot.readI32();
                        struct.setLearn_countIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 12) {
                    BBFriendInfo bBFriendInfo = new BBFriendInfo();
                    struct.friend_info = bBFriendInfo;
                    bBFriendInfo.read(iprot);
                    struct.setFriend_infoIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (struct.isSetLearn_count()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'learn_count' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, BBFriendRankInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(BBFriendRankInfo.STRUCT_DESC);
            if (struct.friend_info != null) {
                oprot.writeFieldBegin(BBFriendRankInfo.FRIEND_INFO_FIELD_DESC);
                struct.friend_info.write(oprot);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(BBFriendRankInfo.LEARN_COUNT_FIELD_DESC);
            oprot.writeI32(struct.learn_count);
            oprot.writeFieldEnd();
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBFriendRankInfoStandardSchemeFactory implements SchemeFactory {
        private BBFriendRankInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BBFriendRankInfoStandardScheme getScheme() {
            return new BBFriendRankInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBFriendRankInfoTupleScheme extends TupleScheme<BBFriendRankInfo> {
        private BBFriendRankInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, BBFriendRankInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            BBFriendInfo bBFriendInfo = new BBFriendInfo();
            struct.friend_info = bBFriendInfo;
            bBFriendInfo.read(tTupleProtocol);
            struct.setFriend_infoIsSet(true);
            struct.learn_count = tTupleProtocol.readI32();
            struct.setLearn_countIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, BBFriendRankInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.friend_info.write(tTupleProtocol);
            tTupleProtocol.writeI32(struct.learn_count);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBFriendRankInfoTupleSchemeFactory implements SchemeFactory {
        private BBFriendRankInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BBFriendRankInfoTupleScheme getScheme() {
            return new BBFriendRankInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        FRIEND_INFO(1, "friend_info"),
        LEARN_COUNT(2, "learn_count");

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
                return FRIEND_INFO;
            }
            if (fieldId != 2) {
                return null;
            }
            return LEARN_COUNT;
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
        hashMap.put(StandardScheme.class, new BBFriendRankInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new BBFriendRankInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.FRIEND_INFO, (_Fields) new FieldMetaData("friend_info", (byte) 1, new StructMetaData((byte) 12, BBFriendInfo.class)));
        enumMap.put((EnumMap) _Fields.LEARN_COUNT, (_Fields) new FieldMetaData("learn_count", (byte) 1, new FieldValueMetaData((byte) 8)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(BBFriendRankInfo.class, unmodifiableMap);
    }

    public BBFriendRankInfo() {
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
        this.friend_info = null;
        setLearn_countIsSet(false);
        this.learn_count = 0;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof BBFriendRankInfo)) {
            return equals((BBFriendRankInfo) that);
        }
        return false;
    }

    public BBFriendInfo getFriend_info() {
        return this.friend_info;
    }

    public int getLearn_count() {
        return this.learn_count;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetFriend_info() {
        return this.friend_info != null;
    }

    public boolean isSetLearn_count() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public BBFriendRankInfo setFriend_info(BBFriendInfo friend_info) {
        this.friend_info = friend_info;
        return this;
    }

    public void setFriend_infoIsSet(boolean value) {
        if (value) {
            return;
        }
        this.friend_info = null;
    }

    public BBFriendRankInfo setLearn_count(int learn_count) {
        this.learn_count = learn_count;
        setLearn_countIsSet(true);
        return this;
    }

    public void setLearn_countIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("BBFriendRankInfo(");
        sb2.append("friend_info:");
        BBFriendInfo bBFriendInfo = this.friend_info;
        if (bBFriendInfo == null) {
            sb2.append("null");
        } else {
            sb2.append(bBFriendInfo);
        }
        sb2.append(j2.O);
        sb2.append("learn_count:");
        sb2.append(this.learn_count);
        sb2.append(j.f81007d);
        return sb2.toString();
    }

    public void unsetFriend_info() {
        this.friend_info = null;
    }

    public void unsetLearn_count() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void validate() throws TException {
        BBFriendInfo bBFriendInfo = this.friend_info;
        if (bBFriendInfo != null) {
            if (bBFriendInfo != null) {
                bBFriendInfo.validate();
            }
        } else {
            throw new TProtocolException("Required field 'friend_info' was not present! Struct: " + toString());
        }
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(BBFriendRankInfo other) {
        int compareTo;
        int compareTo2;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo3 = Boolean.valueOf(isSetFriend_info()).compareTo(Boolean.valueOf(other.isSetFriend_info()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (isSetFriend_info() && (compareTo2 = TBaseHelper.compareTo((Comparable) this.friend_info, (Comparable) other.friend_info)) != 0) {
            return compareTo2;
        }
        int compareTo4 = Boolean.valueOf(isSetLearn_count()).compareTo(Boolean.valueOf(other.isSetLearn_count()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (!isSetLearn_count() || (compareTo = TBaseHelper.compareTo(this.learn_count, other.learn_count)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<BBFriendRankInfo, _Fields> deepCopy2() {
        return new BBFriendRankInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_socials$BBFriendRankInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return getFriend_info();
        }
        if (i11 == 2) {
            return Integer.valueOf(getLearn_count());
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_socials$BBFriendRankInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetFriend_info();
        }
        if (i11 == 2) {
            return isSetLearn_count();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_socials$BBFriendRankInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetFriend_info();
                return;
            } else {
                setFriend_info((BBFriendInfo) value);
                return;
            }
        }
        if (i11 != 2) {
            return;
        }
        if (value == null) {
            unsetLearn_count();
        } else {
            setLearn_count(((Integer) value).intValue());
        }
    }

    public BBFriendRankInfo(BBFriendInfo friend_info, int learn_count) {
        this();
        this.friend_info = friend_info;
        this.learn_count = learn_count;
        setLearn_countIsSet(true);
    }

    public boolean equals(BBFriendRankInfo that) {
        if (that == null) {
            return false;
        }
        boolean isSetFriend_info = isSetFriend_info();
        boolean isSetFriend_info2 = that.isSetFriend_info();
        return (!(isSetFriend_info || isSetFriend_info2) || (isSetFriend_info && isSetFriend_info2 && this.friend_info.equals(that.friend_info))) && this.learn_count == that.learn_count;
    }

    public BBFriendRankInfo(BBFriendRankInfo other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        if (other.isSetFriend_info()) {
            this.friend_info = new BBFriendInfo(other.friend_info);
        }
        this.learn_count = other.learn_count;
    }
}

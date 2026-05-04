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
import org.apache.thrift.meta_data.EnumMetaData;
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
public class BBFriendMsg implements TBase<BBFriendMsg, _Fields>, Serializable, Cloneable, Comparable<BBFriendMsg> {
    private static final int __MSG_ID_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public BBFriendInfo friend_info;
    public int msg_id;
    public BBFriendMsgType msg_type;
    private static final TStruct STRUCT_DESC = new TStruct("BBFriendMsg");
    private static final TField MSG_ID_FIELD_DESC = new TField("msg_id", (byte) 8, 1);
    private static final TField FRIEND_INFO_FIELD_DESC = new TField("friend_info", (byte) 12, 2);
    private static final TField MSG_TYPE_FIELD_DESC = new TField("msg_type", (byte) 8, 3);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.bs_socials.BBFriendMsg$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_socials$BBFriendMsg$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$bs_socials$BBFriendMsg$_Fields = iArr;
            try {
                iArr[_Fields.MSG_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_socials$BBFriendMsg$_Fields[_Fields.FRIEND_INFO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_socials$BBFriendMsg$_Fields[_Fields.MSG_TYPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBFriendMsgStandardScheme extends StandardScheme<BBFriendMsg> {
        private BBFriendMsgStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, BBFriendMsg struct) throws TException {
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
                        if (s11 != 3) {
                            TProtocolUtil.skip(iprot, b11);
                        } else if (b11 == 8) {
                            struct.msg_type = BBFriendMsgType.findByValue(iprot.readI32());
                            struct.setMsg_typeIsSet(true);
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
                } else if (b11 == 8) {
                    struct.msg_id = iprot.readI32();
                    struct.setMsg_idIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (struct.isSetMsg_id()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'msg_id' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, BBFriendMsg struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(BBFriendMsg.STRUCT_DESC);
            oprot.writeFieldBegin(BBFriendMsg.MSG_ID_FIELD_DESC);
            oprot.writeI32(struct.msg_id);
            oprot.writeFieldEnd();
            if (struct.friend_info != null) {
                oprot.writeFieldBegin(BBFriendMsg.FRIEND_INFO_FIELD_DESC);
                struct.friend_info.write(oprot);
                oprot.writeFieldEnd();
            }
            if (struct.msg_type != null) {
                oprot.writeFieldBegin(BBFriendMsg.MSG_TYPE_FIELD_DESC);
                oprot.writeI32(struct.msg_type.getValue());
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBFriendMsgStandardSchemeFactory implements SchemeFactory {
        private BBFriendMsgStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BBFriendMsgStandardScheme getScheme() {
            return new BBFriendMsgStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBFriendMsgTupleScheme extends TupleScheme<BBFriendMsg> {
        private BBFriendMsgTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, BBFriendMsg struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.msg_id = tTupleProtocol.readI32();
            struct.setMsg_idIsSet(true);
            BBFriendInfo bBFriendInfo = new BBFriendInfo();
            struct.friend_info = bBFriendInfo;
            bBFriendInfo.read(tTupleProtocol);
            struct.setFriend_infoIsSet(true);
            struct.msg_type = BBFriendMsgType.findByValue(tTupleProtocol.readI32());
            struct.setMsg_typeIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, BBFriendMsg struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.msg_id);
            struct.friend_info.write(tTupleProtocol);
            tTupleProtocol.writeI32(struct.msg_type.getValue());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBFriendMsgTupleSchemeFactory implements SchemeFactory {
        private BBFriendMsgTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BBFriendMsgTupleScheme getScheme() {
            return new BBFriendMsgTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        MSG_ID(1, "msg_id"),
        FRIEND_INFO(2, "friend_info"),
        MSG_TYPE(3, "msg_type");

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
                return MSG_ID;
            }
            if (fieldId == 2) {
                return FRIEND_INFO;
            }
            if (fieldId != 3) {
                return null;
            }
            return MSG_TYPE;
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
        hashMap.put(StandardScheme.class, new BBFriendMsgStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new BBFriendMsgTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.MSG_ID, (_Fields) new FieldMetaData("msg_id", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.FRIEND_INFO, (_Fields) new FieldMetaData("friend_info", (byte) 1, new StructMetaData((byte) 12, BBFriendInfo.class)));
        enumMap.put((EnumMap) _Fields.MSG_TYPE, (_Fields) new FieldMetaData("msg_type", (byte) 1, new EnumMetaData((byte) 16, BBFriendMsgType.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(BBFriendMsg.class, unmodifiableMap);
    }

    public BBFriendMsg() {
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
        setMsg_idIsSet(false);
        this.msg_id = 0;
        this.friend_info = null;
        this.msg_type = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof BBFriendMsg)) {
            return equals((BBFriendMsg) that);
        }
        return false;
    }

    public BBFriendInfo getFriend_info() {
        return this.friend_info;
    }

    public int getMsg_id() {
        return this.msg_id;
    }

    public BBFriendMsgType getMsg_type() {
        return this.msg_type;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetFriend_info() {
        return this.friend_info != null;
    }

    public boolean isSetMsg_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetMsg_type() {
        return this.msg_type != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public BBFriendMsg setFriend_info(BBFriendInfo friend_info) {
        this.friend_info = friend_info;
        return this;
    }

    public void setFriend_infoIsSet(boolean value) {
        if (value) {
            return;
        }
        this.friend_info = null;
    }

    public BBFriendMsg setMsg_id(int msg_id) {
        this.msg_id = msg_id;
        setMsg_idIsSet(true);
        return this;
    }

    public void setMsg_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public BBFriendMsg setMsg_type(BBFriendMsgType msg_type) {
        this.msg_type = msg_type;
        return this;
    }

    public void setMsg_typeIsSet(boolean value) {
        if (value) {
            return;
        }
        this.msg_type = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("BBFriendMsg(");
        sb2.append("msg_id:");
        sb2.append(this.msg_id);
        sb2.append(j2.O);
        sb2.append("friend_info:");
        BBFriendInfo bBFriendInfo = this.friend_info;
        if (bBFriendInfo == null) {
            sb2.append("null");
        } else {
            sb2.append(bBFriendInfo);
        }
        sb2.append(j2.O);
        sb2.append("msg_type:");
        BBFriendMsgType bBFriendMsgType = this.msg_type;
        if (bBFriendMsgType == null) {
            sb2.append("null");
        } else {
            sb2.append(bBFriendMsgType);
        }
        sb2.append(j.f81007d);
        return sb2.toString();
    }

    public void unsetFriend_info() {
        this.friend_info = null;
    }

    public void unsetMsg_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetMsg_type() {
        this.msg_type = null;
    }

    public void validate() throws TException {
        BBFriendInfo bBFriendInfo = this.friend_info;
        if (bBFriendInfo == null) {
            throw new TProtocolException("Required field 'friend_info' was not present! Struct: " + toString());
        }
        if (this.msg_type != null) {
            if (bBFriendInfo != null) {
                bBFriendInfo.validate();
            }
        } else {
            throw new TProtocolException("Required field 'msg_type' was not present! Struct: " + toString());
        }
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(BBFriendMsg other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo4 = Boolean.valueOf(isSetMsg_id()).compareTo(Boolean.valueOf(other.isSetMsg_id()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (isSetMsg_id() && (compareTo3 = TBaseHelper.compareTo(this.msg_id, other.msg_id)) != 0) {
            return compareTo3;
        }
        int compareTo5 = Boolean.valueOf(isSetFriend_info()).compareTo(Boolean.valueOf(other.isSetFriend_info()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (isSetFriend_info() && (compareTo2 = TBaseHelper.compareTo((Comparable) this.friend_info, (Comparable) other.friend_info)) != 0) {
            return compareTo2;
        }
        int compareTo6 = Boolean.valueOf(isSetMsg_type()).compareTo(Boolean.valueOf(other.isSetMsg_type()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (!isSetMsg_type() || (compareTo = TBaseHelper.compareTo((Comparable) this.msg_type, (Comparable) other.msg_type)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<BBFriendMsg, _Fields> deepCopy2() {
        return new BBFriendMsg(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_socials$BBFriendMsg$_Fields[field.ordinal()];
        if (i11 == 1) {
            return Integer.valueOf(getMsg_id());
        }
        if (i11 == 2) {
            return getFriend_info();
        }
        if (i11 == 3) {
            return getMsg_type();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_socials$BBFriendMsg$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetMsg_id();
        }
        if (i11 == 2) {
            return isSetFriend_info();
        }
        if (i11 == 3) {
            return isSetMsg_type();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_socials$BBFriendMsg$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetMsg_id();
                return;
            } else {
                setMsg_id(((Integer) value).intValue());
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetFriend_info();
                return;
            } else {
                setFriend_info((BBFriendInfo) value);
                return;
            }
        }
        if (i11 != 3) {
            return;
        }
        if (value == null) {
            unsetMsg_type();
        } else {
            setMsg_type((BBFriendMsgType) value);
        }
    }

    public BBFriendMsg(int msg_id, BBFriendInfo friend_info, BBFriendMsgType msg_type) {
        this();
        this.msg_id = msg_id;
        setMsg_idIsSet(true);
        this.friend_info = friend_info;
        this.msg_type = msg_type;
    }

    public boolean equals(BBFriendMsg that) {
        if (that == null || this.msg_id != that.msg_id) {
            return false;
        }
        boolean isSetFriend_info = isSetFriend_info();
        boolean isSetFriend_info2 = that.isSetFriend_info();
        if ((isSetFriend_info || isSetFriend_info2) && !(isSetFriend_info && isSetFriend_info2 && this.friend_info.equals(that.friend_info))) {
            return false;
        }
        boolean isSetMsg_type = isSetMsg_type();
        boolean isSetMsg_type2 = that.isSetMsg_type();
        if (isSetMsg_type || isSetMsg_type2) {
            return isSetMsg_type && isSetMsg_type2 && this.msg_type.equals(that.msg_type);
        }
        return true;
    }

    public BBFriendMsg(BBFriendMsg other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        this.msg_id = other.msg_id;
        if (other.isSetFriend_info()) {
            this.friend_info = new BBFriendInfo(other.friend_info);
        }
        if (other.isSetMsg_type()) {
            this.msg_type = other.msg_type;
        }
    }
}

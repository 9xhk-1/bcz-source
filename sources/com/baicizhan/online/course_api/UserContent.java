package com.baicizhan.online.course_api;

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
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class UserContent implements TBase<UserContent, _Fields>, Serializable, Cloneable, Comparable<UserContent> {
    private static final int __END_TIME_ISSET_ID = 1;
    private static final int __SHOW_TIME_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public String content;
    public int end_time;
    public String msg_id;
    public String nickname;
    public int show_time;
    private static final TStruct STRUCT_DESC = new TStruct("UserContent");
    private static final TField NICKNAME_FIELD_DESC = new TField("nickname", (byte) 11, 1);
    private static final TField CONTENT_FIELD_DESC = new TField("content", (byte) 11, 2);
    private static final TField SHOW_TIME_FIELD_DESC = new TField("show_time", (byte) 8, 3);
    private static final TField MSG_ID_FIELD_DESC = new TField("msg_id", (byte) 11, 4);
    private static final TField END_TIME_FIELD_DESC = new TField("end_time", (byte) 8, 5);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.course_api.UserContent$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$course_api$UserContent$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$course_api$UserContent$_Fields = iArr;
            try {
                iArr[_Fields.NICKNAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$course_api$UserContent$_Fields[_Fields.CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$course_api$UserContent$_Fields[_Fields.SHOW_TIME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$course_api$UserContent$_Fields[_Fields.MSG_ID.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$course_api$UserContent$_Fields[_Fields.END_TIME.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserContentStandardScheme extends StandardScheme<UserContent> {
        private UserContentStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, UserContent struct) throws TException {
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
                            if (s11 != 4) {
                                if (s11 != 5) {
                                    TProtocolUtil.skip(iprot, b11);
                                } else if (b11 == 8) {
                                    struct.end_time = iprot.readI32();
                                    struct.setEnd_timeIsSet(true);
                                } else {
                                    TProtocolUtil.skip(iprot, b11);
                                }
                            } else if (b11 == 11) {
                                struct.msg_id = iprot.readString();
                                struct.setMsg_idIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 8) {
                            struct.show_time = iprot.readI32();
                            struct.setShow_timeIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 11) {
                        struct.content = iprot.readString();
                        struct.setContentIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 11) {
                    struct.nickname = iprot.readString();
                    struct.setNicknameIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (!struct.isSetShow_time()) {
                throw new TProtocolException("Required field 'show_time' was not found in serialized data! Struct: " + toString());
            }
            if (struct.isSetEnd_time()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'end_time' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, UserContent struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(UserContent.STRUCT_DESC);
            if (struct.nickname != null) {
                oprot.writeFieldBegin(UserContent.NICKNAME_FIELD_DESC);
                oprot.writeString(struct.nickname);
                oprot.writeFieldEnd();
            }
            if (struct.content != null) {
                oprot.writeFieldBegin(UserContent.CONTENT_FIELD_DESC);
                oprot.writeString(struct.content);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(UserContent.SHOW_TIME_FIELD_DESC);
            oprot.writeI32(struct.show_time);
            oprot.writeFieldEnd();
            if (struct.msg_id != null) {
                oprot.writeFieldBegin(UserContent.MSG_ID_FIELD_DESC);
                oprot.writeString(struct.msg_id);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(UserContent.END_TIME_FIELD_DESC);
            oprot.writeI32(struct.end_time);
            oprot.writeFieldEnd();
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserContentStandardSchemeFactory implements SchemeFactory {
        private UserContentStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public UserContentStandardScheme getScheme() {
            return new UserContentStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserContentTupleScheme extends TupleScheme<UserContent> {
        private UserContentTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, UserContent struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.nickname = tTupleProtocol.readString();
            struct.setNicknameIsSet(true);
            struct.content = tTupleProtocol.readString();
            struct.setContentIsSet(true);
            struct.show_time = tTupleProtocol.readI32();
            struct.setShow_timeIsSet(true);
            struct.msg_id = tTupleProtocol.readString();
            struct.setMsg_idIsSet(true);
            struct.end_time = tTupleProtocol.readI32();
            struct.setEnd_timeIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, UserContent struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeString(struct.nickname);
            tTupleProtocol.writeString(struct.content);
            tTupleProtocol.writeI32(struct.show_time);
            tTupleProtocol.writeString(struct.msg_id);
            tTupleProtocol.writeI32(struct.end_time);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserContentTupleSchemeFactory implements SchemeFactory {
        private UserContentTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public UserContentTupleScheme getScheme() {
            return new UserContentTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        NICKNAME(1, "nickname"),
        CONTENT(2, "content"),
        SHOW_TIME(3, "show_time"),
        MSG_ID(4, "msg_id"),
        END_TIME(5, "end_time");

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
                return NICKNAME;
            }
            if (fieldId == 2) {
                return CONTENT;
            }
            if (fieldId == 3) {
                return SHOW_TIME;
            }
            if (fieldId == 4) {
                return MSG_ID;
            }
            if (fieldId != 5) {
                return null;
            }
            return END_TIME;
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
        hashMap.put(StandardScheme.class, new UserContentStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new UserContentTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.NICKNAME, (_Fields) new FieldMetaData("nickname", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.CONTENT, (_Fields) new FieldMetaData("content", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.SHOW_TIME, (_Fields) new FieldMetaData("show_time", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.MSG_ID, (_Fields) new FieldMetaData("msg_id", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.END_TIME, (_Fields) new FieldMetaData("end_time", (byte) 1, new FieldValueMetaData((byte) 8)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(UserContent.class, unmodifiableMap);
    }

    public UserContent() {
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
        this.nickname = null;
        this.content = null;
        setShow_timeIsSet(false);
        this.show_time = 0;
        this.msg_id = null;
        setEnd_timeIsSet(false);
        this.end_time = 0;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof UserContent)) {
            return equals((UserContent) that);
        }
        return false;
    }

    public String getContent() {
        return this.content;
    }

    public int getEnd_time() {
        return this.end_time;
    }

    public String getMsg_id() {
        return this.msg_id;
    }

    public String getNickname() {
        return this.nickname;
    }

    public int getShow_time() {
        return this.show_time;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetContent() {
        return this.content != null;
    }

    public boolean isSetEnd_time() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetMsg_id() {
        return this.msg_id != null;
    }

    public boolean isSetNickname() {
        return this.nickname != null;
    }

    public boolean isSetShow_time() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public UserContent setContent(String content) {
        this.content = content;
        return this;
    }

    public void setContentIsSet(boolean value) {
        if (value) {
            return;
        }
        this.content = null;
    }

    public UserContent setEnd_time(int end_time) {
        this.end_time = end_time;
        setEnd_timeIsSet(true);
        return this;
    }

    public void setEnd_timeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public UserContent setMsg_id(String msg_id) {
        this.msg_id = msg_id;
        return this;
    }

    public void setMsg_idIsSet(boolean value) {
        if (value) {
            return;
        }
        this.msg_id = null;
    }

    public UserContent setNickname(String nickname) {
        this.nickname = nickname;
        return this;
    }

    public void setNicknameIsSet(boolean value) {
        if (value) {
            return;
        }
        this.nickname = null;
    }

    public UserContent setShow_time(int show_time) {
        this.show_time = show_time;
        setShow_timeIsSet(true);
        return this;
    }

    public void setShow_timeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("UserContent(");
        sb2.append("nickname:");
        String str = this.nickname;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(j2.O);
        sb2.append("content:");
        String str2 = this.content;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(str2);
        }
        sb2.append(j2.O);
        sb2.append("show_time:");
        sb2.append(this.show_time);
        sb2.append(j2.O);
        sb2.append("msg_id:");
        String str3 = this.msg_id;
        if (str3 == null) {
            sb2.append("null");
        } else {
            sb2.append(str3);
        }
        sb2.append(j2.O);
        sb2.append("end_time:");
        sb2.append(this.end_time);
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetContent() {
        this.content = null;
    }

    public void unsetEnd_time() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetMsg_id() {
        this.msg_id = null;
    }

    public void unsetNickname() {
        this.nickname = null;
    }

    public void unsetShow_time() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void validate() throws TException {
        if (this.nickname == null) {
            throw new TProtocolException("Required field 'nickname' was not present! Struct: " + toString());
        }
        if (this.content == null) {
            throw new TProtocolException("Required field 'content' was not present! Struct: " + toString());
        }
        if (this.msg_id != null) {
            return;
        }
        throw new TProtocolException("Required field 'msg_id' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(UserContent other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        int compareTo5;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo6 = Boolean.valueOf(isSetNickname()).compareTo(Boolean.valueOf(other.isSetNickname()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (isSetNickname() && (compareTo5 = TBaseHelper.compareTo(this.nickname, other.nickname)) != 0) {
            return compareTo5;
        }
        int compareTo7 = Boolean.valueOf(isSetContent()).compareTo(Boolean.valueOf(other.isSetContent()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (isSetContent() && (compareTo4 = TBaseHelper.compareTo(this.content, other.content)) != 0) {
            return compareTo4;
        }
        int compareTo8 = Boolean.valueOf(isSetShow_time()).compareTo(Boolean.valueOf(other.isSetShow_time()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (isSetShow_time() && (compareTo3 = TBaseHelper.compareTo(this.show_time, other.show_time)) != 0) {
            return compareTo3;
        }
        int compareTo9 = Boolean.valueOf(isSetMsg_id()).compareTo(Boolean.valueOf(other.isSetMsg_id()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (isSetMsg_id() && (compareTo2 = TBaseHelper.compareTo(this.msg_id, other.msg_id)) != 0) {
            return compareTo2;
        }
        int compareTo10 = Boolean.valueOf(isSetEnd_time()).compareTo(Boolean.valueOf(other.isSetEnd_time()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (!isSetEnd_time() || (compareTo = TBaseHelper.compareTo(this.end_time, other.end_time)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<UserContent, _Fields> deepCopy2() {
        return new UserContent(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$course_api$UserContent$_Fields[field.ordinal()];
        if (i11 == 1) {
            return getNickname();
        }
        if (i11 == 2) {
            return getContent();
        }
        if (i11 == 3) {
            return Integer.valueOf(getShow_time());
        }
        if (i11 == 4) {
            return getMsg_id();
        }
        if (i11 == 5) {
            return Integer.valueOf(getEnd_time());
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$course_api$UserContent$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetNickname();
        }
        if (i11 == 2) {
            return isSetContent();
        }
        if (i11 == 3) {
            return isSetShow_time();
        }
        if (i11 == 4) {
            return isSetMsg_id();
        }
        if (i11 == 5) {
            return isSetEnd_time();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$course_api$UserContent$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetNickname();
                return;
            } else {
                setNickname((String) value);
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetContent();
                return;
            } else {
                setContent((String) value);
                return;
            }
        }
        if (i11 == 3) {
            if (value == null) {
                unsetShow_time();
                return;
            } else {
                setShow_time(((Integer) value).intValue());
                return;
            }
        }
        if (i11 == 4) {
            if (value == null) {
                unsetMsg_id();
                return;
            } else {
                setMsg_id((String) value);
                return;
            }
        }
        if (i11 != 5) {
            return;
        }
        if (value == null) {
            unsetEnd_time();
        } else {
            setEnd_time(((Integer) value).intValue());
        }
    }

    public UserContent(String nickname, String content, int show_time, String msg_id, int end_time) {
        this();
        this.nickname = nickname;
        this.content = content;
        this.show_time = show_time;
        setShow_timeIsSet(true);
        this.msg_id = msg_id;
        this.end_time = end_time;
        setEnd_timeIsSet(true);
    }

    public boolean equals(UserContent that) {
        if (that == null) {
            return false;
        }
        boolean isSetNickname = isSetNickname();
        boolean isSetNickname2 = that.isSetNickname();
        if ((isSetNickname || isSetNickname2) && !(isSetNickname && isSetNickname2 && this.nickname.equals(that.nickname))) {
            return false;
        }
        boolean isSetContent = isSetContent();
        boolean isSetContent2 = that.isSetContent();
        if (((isSetContent || isSetContent2) && !(isSetContent && isSetContent2 && this.content.equals(that.content))) || this.show_time != that.show_time) {
            return false;
        }
        boolean isSetMsg_id = isSetMsg_id();
        boolean isSetMsg_id2 = that.isSetMsg_id();
        return (!(isSetMsg_id || isSetMsg_id2) || (isSetMsg_id && isSetMsg_id2 && this.msg_id.equals(that.msg_id))) && this.end_time == that.end_time;
    }

    public UserContent(UserContent other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        if (other.isSetNickname()) {
            this.nickname = other.nickname;
        }
        if (other.isSetContent()) {
            this.content = other.content;
        }
        this.show_time = other.show_time;
        if (other.isSetMsg_id()) {
            this.msg_id = other.msg_id;
        }
        this.end_time = other.end_time;
    }
}

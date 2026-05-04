package com.baicizhan.online.course_api;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.BitSet;
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
public class ProContent implements TBase<ProContent, _Fields>, Serializable, Cloneable, Comparable<ProContent> {
    private static final int __END_TIME_ISSET_ID = 1;
    private static final int __SHOW_TIME_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public String content;
    public int end_time;
    public String nickname;
    private _Fields[] optionals;
    public int show_time;
    public String url;
    private static final TStruct STRUCT_DESC = new TStruct("ProContent");
    private static final TField NICKNAME_FIELD_DESC = new TField("nickname", (byte) 11, 1);
    private static final TField CONTENT_FIELD_DESC = new TField("content", (byte) 11, 2);
    private static final TField URL_FIELD_DESC = new TField("url", (byte) 11, 3);
    private static final TField SHOW_TIME_FIELD_DESC = new TField("show_time", (byte) 8, 4);
    private static final TField END_TIME_FIELD_DESC = new TField("end_time", (byte) 8, 5);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.course_api.ProContent$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$course_api$ProContent$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$course_api$ProContent$_Fields = iArr;
            try {
                iArr[_Fields.NICKNAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$course_api$ProContent$_Fields[_Fields.CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$course_api$ProContent$_Fields[_Fields.URL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$course_api$ProContent$_Fields[_Fields.SHOW_TIME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$course_api$ProContent$_Fields[_Fields.END_TIME.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ProContentStandardScheme extends StandardScheme<ProContent> {
        private ProContentStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, ProContent struct) throws TException {
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
                            } else if (b11 == 8) {
                                struct.show_time = iprot.readI32();
                                struct.setShow_timeIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 11) {
                            struct.url = iprot.readString();
                            struct.setUrlIsSet(true);
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
        public void write(TProtocol oprot, ProContent struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(ProContent.STRUCT_DESC);
            if (struct.nickname != null) {
                oprot.writeFieldBegin(ProContent.NICKNAME_FIELD_DESC);
                oprot.writeString(struct.nickname);
                oprot.writeFieldEnd();
            }
            if (struct.content != null) {
                oprot.writeFieldBegin(ProContent.CONTENT_FIELD_DESC);
                oprot.writeString(struct.content);
                oprot.writeFieldEnd();
            }
            if (struct.url != null && struct.isSetUrl()) {
                oprot.writeFieldBegin(ProContent.URL_FIELD_DESC);
                oprot.writeString(struct.url);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(ProContent.SHOW_TIME_FIELD_DESC);
            oprot.writeI32(struct.show_time);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(ProContent.END_TIME_FIELD_DESC);
            oprot.writeI32(struct.end_time);
            oprot.writeFieldEnd();
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ProContentStandardSchemeFactory implements SchemeFactory {
        private ProContentStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public ProContentStandardScheme getScheme() {
            return new ProContentStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ProContentTupleScheme extends TupleScheme<ProContent> {
        private ProContentTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, ProContent struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.nickname = tTupleProtocol.readString();
            struct.setNicknameIsSet(true);
            struct.content = tTupleProtocol.readString();
            struct.setContentIsSet(true);
            struct.show_time = tTupleProtocol.readI32();
            struct.setShow_timeIsSet(true);
            struct.end_time = tTupleProtocol.readI32();
            struct.setEnd_timeIsSet(true);
            if (tTupleProtocol.readBitSet(1).get(0)) {
                struct.url = tTupleProtocol.readString();
                struct.setUrlIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, ProContent struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeString(struct.nickname);
            tTupleProtocol.writeString(struct.content);
            tTupleProtocol.writeI32(struct.show_time);
            tTupleProtocol.writeI32(struct.end_time);
            BitSet bitSet = new BitSet();
            if (struct.isSetUrl()) {
                bitSet.set(0);
            }
            tTupleProtocol.writeBitSet(bitSet, 1);
            if (struct.isSetUrl()) {
                tTupleProtocol.writeString(struct.url);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ProContentTupleSchemeFactory implements SchemeFactory {
        private ProContentTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public ProContentTupleScheme getScheme() {
            return new ProContentTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        NICKNAME(1, "nickname"),
        CONTENT(2, "content"),
        URL(3, "url"),
        SHOW_TIME(4, "show_time"),
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
                return URL;
            }
            if (fieldId == 4) {
                return SHOW_TIME;
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
        hashMap.put(StandardScheme.class, new ProContentStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new ProContentTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.NICKNAME, (_Fields) new FieldMetaData("nickname", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.CONTENT, (_Fields) new FieldMetaData("content", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.URL, (_Fields) new FieldMetaData("url", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.SHOW_TIME, (_Fields) new FieldMetaData("show_time", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.END_TIME, (_Fields) new FieldMetaData("end_time", (byte) 1, new FieldValueMetaData((byte) 8)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(ProContent.class, unmodifiableMap);
    }

    public ProContent() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.URL};
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
        this.url = null;
        setShow_timeIsSet(false);
        this.show_time = 0;
        setEnd_timeIsSet(false);
        this.end_time = 0;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof ProContent)) {
            return equals((ProContent) that);
        }
        return false;
    }

    public String getContent() {
        return this.content;
    }

    public int getEnd_time() {
        return this.end_time;
    }

    public String getNickname() {
        return this.nickname;
    }

    public int getShow_time() {
        return this.show_time;
    }

    public String getUrl() {
        return this.url;
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

    public boolean isSetNickname() {
        return this.nickname != null;
    }

    public boolean isSetShow_time() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetUrl() {
        return this.url != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public ProContent setContent(String content) {
        this.content = content;
        return this;
    }

    public void setContentIsSet(boolean value) {
        if (value) {
            return;
        }
        this.content = null;
    }

    public ProContent setEnd_time(int end_time) {
        this.end_time = end_time;
        setEnd_timeIsSet(true);
        return this;
    }

    public void setEnd_timeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public ProContent setNickname(String nickname) {
        this.nickname = nickname;
        return this;
    }

    public void setNicknameIsSet(boolean value) {
        if (value) {
            return;
        }
        this.nickname = null;
    }

    public ProContent setShow_time(int show_time) {
        this.show_time = show_time;
        setShow_timeIsSet(true);
        return this;
    }

    public void setShow_timeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public ProContent setUrl(String url) {
        this.url = url;
        return this;
    }

    public void setUrlIsSet(boolean value) {
        if (value) {
            return;
        }
        this.url = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ProContent(");
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
        if (isSetUrl()) {
            sb2.append(j2.O);
            sb2.append("url:");
            String str3 = this.url;
            if (str3 == null) {
                sb2.append("null");
            } else {
                sb2.append(str3);
            }
        }
        sb2.append(j2.O);
        sb2.append("show_time:");
        sb2.append(this.show_time);
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

    public void unsetNickname() {
        this.nickname = null;
    }

    public void unsetShow_time() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetUrl() {
        this.url = null;
    }

    public void validate() throws TException {
        if (this.nickname == null) {
            throw new TProtocolException("Required field 'nickname' was not present! Struct: " + toString());
        }
        if (this.content != null) {
            return;
        }
        throw new TProtocolException("Required field 'content' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(ProContent other) {
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
        int compareTo8 = Boolean.valueOf(isSetUrl()).compareTo(Boolean.valueOf(other.isSetUrl()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (isSetUrl() && (compareTo3 = TBaseHelper.compareTo(this.url, other.url)) != 0) {
            return compareTo3;
        }
        int compareTo9 = Boolean.valueOf(isSetShow_time()).compareTo(Boolean.valueOf(other.isSetShow_time()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (isSetShow_time() && (compareTo2 = TBaseHelper.compareTo(this.show_time, other.show_time)) != 0) {
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
    public TBase<ProContent, _Fields> deepCopy2() {
        return new ProContent(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$course_api$ProContent$_Fields[field.ordinal()];
        if (i11 == 1) {
            return getNickname();
        }
        if (i11 == 2) {
            return getContent();
        }
        if (i11 == 3) {
            return getUrl();
        }
        if (i11 == 4) {
            return Integer.valueOf(getShow_time());
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
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$course_api$ProContent$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetNickname();
        }
        if (i11 == 2) {
            return isSetContent();
        }
        if (i11 == 3) {
            return isSetUrl();
        }
        if (i11 == 4) {
            return isSetShow_time();
        }
        if (i11 == 5) {
            return isSetEnd_time();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$course_api$ProContent$_Fields[field.ordinal()];
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
                unsetUrl();
                return;
            } else {
                setUrl((String) value);
                return;
            }
        }
        if (i11 == 4) {
            if (value == null) {
                unsetShow_time();
                return;
            } else {
                setShow_time(((Integer) value).intValue());
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

    public boolean equals(ProContent that) {
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
        if ((isSetContent || isSetContent2) && !(isSetContent && isSetContent2 && this.content.equals(that.content))) {
            return false;
        }
        boolean isSetUrl = isSetUrl();
        boolean isSetUrl2 = that.isSetUrl();
        return (!(isSetUrl || isSetUrl2) || (isSetUrl && isSetUrl2 && this.url.equals(that.url))) && this.show_time == that.show_time && this.end_time == that.end_time;
    }

    public ProContent(String nickname, String content, int show_time, int end_time) {
        this();
        this.nickname = nickname;
        this.content = content;
        this.show_time = show_time;
        setShow_timeIsSet(true);
        this.end_time = end_time;
        setEnd_timeIsSet(true);
    }

    public ProContent(ProContent other) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.URL};
        this.__isset_bitfield = other.__isset_bitfield;
        if (other.isSetNickname()) {
            this.nickname = other.nickname;
        }
        if (other.isSetContent()) {
            this.content = other.content;
        }
        if (other.isSetUrl()) {
            this.url = other.url;
        }
        this.show_time = other.show_time;
        this.end_time = other.end_time;
    }
}

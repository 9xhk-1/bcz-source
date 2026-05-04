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
public class CommentReq implements TBase<CommentReq, _Fields>, Serializable, Cloneable, Comparable<CommentReq> {
    private static final int __ARTICLE_ID_ISSET_ID = 1;
    private static final int __COURSE_ID_ISSET_ID = 0;
    private static final int __TIME_ISSET_ID = 2;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public int article_id;
    public String content;
    public int course_id;
    public long time;
    private static final TStruct STRUCT_DESC = new TStruct("CommentReq");
    private static final TField COURSE_ID_FIELD_DESC = new TField("course_id", (byte) 8, 1);
    private static final TField ARTICLE_ID_FIELD_DESC = new TField(ma.b.f72902e1, (byte) 8, 2);
    private static final TField CONTENT_FIELD_DESC = new TField("content", (byte) 11, 3);
    private static final TField TIME_FIELD_DESC = new TField("time", (byte) 10, 4);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.course_api.CommentReq$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$course_api$CommentReq$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$course_api$CommentReq$_Fields = iArr;
            try {
                iArr[_Fields.COURSE_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$course_api$CommentReq$_Fields[_Fields.ARTICLE_ID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$course_api$CommentReq$_Fields[_Fields.CONTENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$course_api$CommentReq$_Fields[_Fields.TIME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class CommentReqStandardScheme extends StandardScheme<CommentReq> {
        private CommentReqStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, CommentReq struct) throws TException {
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
                                TProtocolUtil.skip(iprot, b11);
                            } else if (b11 == 10) {
                                struct.time = iprot.readI64();
                                struct.setTimeIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 11) {
                            struct.content = iprot.readString();
                            struct.setContentIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 8) {
                        struct.article_id = iprot.readI32();
                        struct.setArticle_idIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 8) {
                    struct.course_id = iprot.readI32();
                    struct.setCourse_idIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (!struct.isSetCourse_id()) {
                throw new TProtocolException("Required field 'course_id' was not found in serialized data! Struct: " + toString());
            }
            if (!struct.isSetArticle_id()) {
                throw new TProtocolException("Required field 'article_id' was not found in serialized data! Struct: " + toString());
            }
            if (struct.isSetTime()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'time' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, CommentReq struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(CommentReq.STRUCT_DESC);
            oprot.writeFieldBegin(CommentReq.COURSE_ID_FIELD_DESC);
            oprot.writeI32(struct.course_id);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(CommentReq.ARTICLE_ID_FIELD_DESC);
            oprot.writeI32(struct.article_id);
            oprot.writeFieldEnd();
            if (struct.content != null) {
                oprot.writeFieldBegin(CommentReq.CONTENT_FIELD_DESC);
                oprot.writeString(struct.content);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(CommentReq.TIME_FIELD_DESC);
            oprot.writeI64(struct.time);
            oprot.writeFieldEnd();
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class CommentReqStandardSchemeFactory implements SchemeFactory {
        private CommentReqStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public CommentReqStandardScheme getScheme() {
            return new CommentReqStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class CommentReqTupleScheme extends TupleScheme<CommentReq> {
        private CommentReqTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, CommentReq struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.course_id = tTupleProtocol.readI32();
            struct.setCourse_idIsSet(true);
            struct.article_id = tTupleProtocol.readI32();
            struct.setArticle_idIsSet(true);
            struct.content = tTupleProtocol.readString();
            struct.setContentIsSet(true);
            struct.time = tTupleProtocol.readI64();
            struct.setTimeIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, CommentReq struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.course_id);
            tTupleProtocol.writeI32(struct.article_id);
            tTupleProtocol.writeString(struct.content);
            tTupleProtocol.writeI64(struct.time);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class CommentReqTupleSchemeFactory implements SchemeFactory {
        private CommentReqTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public CommentReqTupleScheme getScheme() {
            return new CommentReqTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        COURSE_ID(1, "course_id"),
        ARTICLE_ID(2, ma.b.f72902e1),
        CONTENT(3, "content"),
        TIME(4, "time");

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
                return COURSE_ID;
            }
            if (fieldId == 2) {
                return ARTICLE_ID;
            }
            if (fieldId == 3) {
                return CONTENT;
            }
            if (fieldId != 4) {
                return null;
            }
            return TIME;
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
        hashMap.put(StandardScheme.class, new CommentReqStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new CommentReqTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.COURSE_ID, (_Fields) new FieldMetaData("course_id", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.ARTICLE_ID, (_Fields) new FieldMetaData(ma.b.f72902e1, (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.CONTENT, (_Fields) new FieldMetaData("content", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.TIME, (_Fields) new FieldMetaData("time", (byte) 1, new FieldValueMetaData((byte) 10)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(CommentReq.class, unmodifiableMap);
    }

    public CommentReq() {
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
        setCourse_idIsSet(false);
        this.course_id = 0;
        setArticle_idIsSet(false);
        this.article_id = 0;
        this.content = null;
        setTimeIsSet(false);
        this.time = 0L;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof CommentReq)) {
            return equals((CommentReq) that);
        }
        return false;
    }

    public int getArticle_id() {
        return this.article_id;
    }

    public String getContent() {
        return this.content;
    }

    public int getCourse_id() {
        return this.course_id;
    }

    public long getTime() {
        return this.time;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetArticle_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetContent() {
        return this.content != null;
    }

    public boolean isSetCourse_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetTime() {
        return EncodingUtils.testBit(this.__isset_bitfield, 2);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public CommentReq setArticle_id(int article_id) {
        this.article_id = article_id;
        setArticle_idIsSet(true);
        return this;
    }

    public void setArticle_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public CommentReq setContent(String content) {
        this.content = content;
        return this;
    }

    public void setContentIsSet(boolean value) {
        if (value) {
            return;
        }
        this.content = null;
    }

    public CommentReq setCourse_id(int course_id) {
        this.course_id = course_id;
        setCourse_idIsSet(true);
        return this;
    }

    public void setCourse_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public CommentReq setTime(long time) {
        this.time = time;
        setTimeIsSet(true);
        return this;
    }

    public void setTimeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 2, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("CommentReq(");
        sb2.append("course_id:");
        sb2.append(this.course_id);
        sb2.append(j2.O);
        sb2.append("article_id:");
        sb2.append(this.article_id);
        sb2.append(j2.O);
        sb2.append("content:");
        String str = this.content;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(j2.O);
        sb2.append("time:");
        sb2.append(this.time);
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetArticle_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetContent() {
        this.content = null;
    }

    public void unsetCourse_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetTime() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 2);
    }

    public void validate() throws TException {
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
    public int compareTo(CommentReq other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo5 = Boolean.valueOf(isSetCourse_id()).compareTo(Boolean.valueOf(other.isSetCourse_id()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (isSetCourse_id() && (compareTo4 = TBaseHelper.compareTo(this.course_id, other.course_id)) != 0) {
            return compareTo4;
        }
        int compareTo6 = Boolean.valueOf(isSetArticle_id()).compareTo(Boolean.valueOf(other.isSetArticle_id()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (isSetArticle_id() && (compareTo3 = TBaseHelper.compareTo(this.article_id, other.article_id)) != 0) {
            return compareTo3;
        }
        int compareTo7 = Boolean.valueOf(isSetContent()).compareTo(Boolean.valueOf(other.isSetContent()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (isSetContent() && (compareTo2 = TBaseHelper.compareTo(this.content, other.content)) != 0) {
            return compareTo2;
        }
        int compareTo8 = Boolean.valueOf(isSetTime()).compareTo(Boolean.valueOf(other.isSetTime()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (!isSetTime() || (compareTo = TBaseHelper.compareTo(this.time, other.time)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<CommentReq, _Fields> deepCopy2() {
        return new CommentReq(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$course_api$CommentReq$_Fields[field.ordinal()];
        if (i11 == 1) {
            return Integer.valueOf(getCourse_id());
        }
        if (i11 == 2) {
            return Integer.valueOf(getArticle_id());
        }
        if (i11 == 3) {
            return getContent();
        }
        if (i11 == 4) {
            return Long.valueOf(getTime());
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$course_api$CommentReq$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetCourse_id();
        }
        if (i11 == 2) {
            return isSetArticle_id();
        }
        if (i11 == 3) {
            return isSetContent();
        }
        if (i11 == 4) {
            return isSetTime();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$course_api$CommentReq$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetCourse_id();
                return;
            } else {
                setCourse_id(((Integer) value).intValue());
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetArticle_id();
                return;
            } else {
                setArticle_id(((Integer) value).intValue());
                return;
            }
        }
        if (i11 == 3) {
            if (value == null) {
                unsetContent();
                return;
            } else {
                setContent((String) value);
                return;
            }
        }
        if (i11 != 4) {
            return;
        }
        if (value == null) {
            unsetTime();
        } else {
            setTime(((Long) value).longValue());
        }
    }

    public CommentReq(int course_id, int article_id, String content, long time) {
        this();
        this.course_id = course_id;
        setCourse_idIsSet(true);
        this.article_id = article_id;
        setArticle_idIsSet(true);
        this.content = content;
        this.time = time;
        setTimeIsSet(true);
    }

    public boolean equals(CommentReq that) {
        if (that == null || this.course_id != that.course_id || this.article_id != that.article_id) {
            return false;
        }
        boolean isSetContent = isSetContent();
        boolean isSetContent2 = that.isSetContent();
        return (!(isSetContent || isSetContent2) || (isSetContent && isSetContent2 && this.content.equals(that.content))) && this.time == that.time;
    }

    public CommentReq(CommentReq other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        this.course_id = other.course_id;
        this.article_id = other.article_id;
        if (other.isSetContent()) {
            this.content = other.content;
        }
        this.time = other.time;
    }
}

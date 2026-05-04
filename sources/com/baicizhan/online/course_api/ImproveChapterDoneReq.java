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
public class ImproveChapterDoneReq implements TBase<ImproveChapterDoneReq, _Fields>, Serializable, Cloneable, Comparable<ImproveChapterDoneReq> {
    private static final int __CHAPTER_ID_ISSET_ID = 0;
    private static final int __PROGRESS_ISSET_ID = 1;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public long chapter_id;
    public int progress;
    private static final TStruct STRUCT_DESC = new TStruct("ImproveChapterDoneReq");
    private static final TField CHAPTER_ID_FIELD_DESC = new TField("chapter_id", (byte) 10, 1);
    private static final TField PROGRESS_FIELD_DESC = new TField("progress", (byte) 8, 2);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.course_api.ImproveChapterDoneReq$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$course_api$ImproveChapterDoneReq$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$course_api$ImproveChapterDoneReq$_Fields = iArr;
            try {
                iArr[_Fields.CHAPTER_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$course_api$ImproveChapterDoneReq$_Fields[_Fields.PROGRESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ImproveChapterDoneReqStandardScheme extends StandardScheme<ImproveChapterDoneReq> {
        private ImproveChapterDoneReqStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, ImproveChapterDoneReq struct) throws TException {
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
                        struct.progress = iprot.readI32();
                        struct.setProgressIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 10) {
                    struct.chapter_id = iprot.readI64();
                    struct.setChapter_idIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (!struct.isSetChapter_id()) {
                throw new TProtocolException("Required field 'chapter_id' was not found in serialized data! Struct: " + toString());
            }
            if (struct.isSetProgress()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'progress' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, ImproveChapterDoneReq struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(ImproveChapterDoneReq.STRUCT_DESC);
            oprot.writeFieldBegin(ImproveChapterDoneReq.CHAPTER_ID_FIELD_DESC);
            oprot.writeI64(struct.chapter_id);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(ImproveChapterDoneReq.PROGRESS_FIELD_DESC);
            oprot.writeI32(struct.progress);
            oprot.writeFieldEnd();
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ImproveChapterDoneReqStandardSchemeFactory implements SchemeFactory {
        private ImproveChapterDoneReqStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public ImproveChapterDoneReqStandardScheme getScheme() {
            return new ImproveChapterDoneReqStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ImproveChapterDoneReqTupleScheme extends TupleScheme<ImproveChapterDoneReq> {
        private ImproveChapterDoneReqTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, ImproveChapterDoneReq struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.chapter_id = tTupleProtocol.readI64();
            struct.setChapter_idIsSet(true);
            struct.progress = tTupleProtocol.readI32();
            struct.setProgressIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, ImproveChapterDoneReq struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI64(struct.chapter_id);
            tTupleProtocol.writeI32(struct.progress);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ImproveChapterDoneReqTupleSchemeFactory implements SchemeFactory {
        private ImproveChapterDoneReqTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public ImproveChapterDoneReqTupleScheme getScheme() {
            return new ImproveChapterDoneReqTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        CHAPTER_ID(1, "chapter_id"),
        PROGRESS(2, "progress");

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
                return CHAPTER_ID;
            }
            if (fieldId != 2) {
                return null;
            }
            return PROGRESS;
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
        hashMap.put(StandardScheme.class, new ImproveChapterDoneReqStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new ImproveChapterDoneReqTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.CHAPTER_ID, (_Fields) new FieldMetaData("chapter_id", (byte) 1, new FieldValueMetaData((byte) 10)));
        enumMap.put((EnumMap) _Fields.PROGRESS, (_Fields) new FieldMetaData("progress", (byte) 1, new FieldValueMetaData((byte) 8)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(ImproveChapterDoneReq.class, unmodifiableMap);
    }

    public ImproveChapterDoneReq() {
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
        setChapter_idIsSet(false);
        this.chapter_id = 0L;
        setProgressIsSet(false);
        this.progress = 0;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof ImproveChapterDoneReq)) {
            return equals((ImproveChapterDoneReq) that);
        }
        return false;
    }

    public long getChapter_id() {
        return this.chapter_id;
    }

    public int getProgress() {
        return this.progress;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetChapter_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetProgress() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public ImproveChapterDoneReq setChapter_id(long chapter_id) {
        this.chapter_id = chapter_id;
        setChapter_idIsSet(true);
        return this;
    }

    public void setChapter_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public ImproveChapterDoneReq setProgress(int progress) {
        this.progress = progress;
        setProgressIsSet(true);
        return this;
    }

    public void setProgressIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public String toString() {
        return "ImproveChapterDoneReq(chapter_id:" + this.chapter_id + j2.O + "progress:" + this.progress + pn.j.f81007d;
    }

    public void unsetChapter_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetProgress() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(ImproveChapterDoneReq other) {
        int compareTo;
        int compareTo2;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo3 = Boolean.valueOf(isSetChapter_id()).compareTo(Boolean.valueOf(other.isSetChapter_id()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (isSetChapter_id() && (compareTo2 = TBaseHelper.compareTo(this.chapter_id, other.chapter_id)) != 0) {
            return compareTo2;
        }
        int compareTo4 = Boolean.valueOf(isSetProgress()).compareTo(Boolean.valueOf(other.isSetProgress()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (!isSetProgress() || (compareTo = TBaseHelper.compareTo(this.progress, other.progress)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<ImproveChapterDoneReq, _Fields> deepCopy2() {
        return new ImproveChapterDoneReq(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$course_api$ImproveChapterDoneReq$_Fields[field.ordinal()];
        if (i11 == 1) {
            return Long.valueOf(getChapter_id());
        }
        if (i11 == 2) {
            return Integer.valueOf(getProgress());
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$course_api$ImproveChapterDoneReq$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetChapter_id();
        }
        if (i11 == 2) {
            return isSetProgress();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$course_api$ImproveChapterDoneReq$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetChapter_id();
                return;
            } else {
                setChapter_id(((Long) value).longValue());
                return;
            }
        }
        if (i11 != 2) {
            return;
        }
        if (value == null) {
            unsetProgress();
        } else {
            setProgress(((Integer) value).intValue());
        }
    }

    public ImproveChapterDoneReq(long chapter_id, int progress) {
        this();
        this.chapter_id = chapter_id;
        setChapter_idIsSet(true);
        this.progress = progress;
        setProgressIsSet(true);
    }

    public boolean equals(ImproveChapterDoneReq that) {
        return that != null && this.chapter_id == that.chapter_id && this.progress == that.progress;
    }

    public ImproveChapterDoneReq(ImproveChapterDoneReq other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        this.chapter_id = other.chapter_id;
        this.progress = other.progress;
    }

    public void validate() throws TException {
    }
}

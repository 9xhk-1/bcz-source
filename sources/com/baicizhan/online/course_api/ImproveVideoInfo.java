package com.baicizhan.online.course_api;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TBase;
import org.apache.thrift.TBaseHelper;
import org.apache.thrift.TException;
import org.apache.thrift.TFieldIdEnum;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
import org.apache.thrift.meta_data.ListMetaData;
import org.apache.thrift.meta_data.StructMetaData;
import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.protocol.TField;
import org.apache.thrift.protocol.TList;
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
public class ImproveVideoInfo implements TBase<ImproveVideoInfo, _Fields>, Serializable, Cloneable, Comparable<ImproveVideoInfo> {
    private static final int __DURATION_ISSET_ID = 0;
    private static final int __VIDEO_STATUS_ISSET_ID = 1;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public long duration;
    public String next_url;
    private _Fields[] optionals;
    public List<QuestionItem> questions;
    public int video_status;
    public String video_url;
    private static final TStruct STRUCT_DESC = new TStruct("ImproveVideoInfo");
    private static final TField VIDEO_URL_FIELD_DESC = new TField("video_url", (byte) 11, 1);
    private static final TField DURATION_FIELD_DESC = new TField("duration", (byte) 10, 2);
    private static final TField QUESTIONS_FIELD_DESC = new TField("questions", (byte) 15, 3);
    private static final TField NEXT_URL_FIELD_DESC = new TField("next_url", (byte) 11, 4);
    private static final TField VIDEO_STATUS_FIELD_DESC = new TField("video_status", (byte) 8, 5);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.course_api.ImproveVideoInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$course_api$ImproveVideoInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$course_api$ImproveVideoInfo$_Fields = iArr;
            try {
                iArr[_Fields.VIDEO_URL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$course_api$ImproveVideoInfo$_Fields[_Fields.DURATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$course_api$ImproveVideoInfo$_Fields[_Fields.QUESTIONS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$course_api$ImproveVideoInfo$_Fields[_Fields.NEXT_URL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$course_api$ImproveVideoInfo$_Fields[_Fields.VIDEO_STATUS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ImproveVideoInfoStandardScheme extends StandardScheme<ImproveVideoInfo> {
        private ImproveVideoInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, ImproveVideoInfo struct) throws TException {
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
                                    struct.video_status = iprot.readI32();
                                    struct.setVideo_statusIsSet(true);
                                } else {
                                    TProtocolUtil.skip(iprot, b11);
                                }
                            } else if (b11 == 11) {
                                struct.next_url = iprot.readString();
                                struct.setNext_urlIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 15) {
                            TList readListBegin = iprot.readListBegin();
                            struct.questions = new ArrayList(readListBegin.size);
                            for (int i11 = 0; i11 < readListBegin.size; i11++) {
                                QuestionItem questionItem = new QuestionItem();
                                questionItem.read(iprot);
                                struct.questions.add(questionItem);
                            }
                            iprot.readListEnd();
                            struct.setQuestionsIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 10) {
                        struct.duration = iprot.readI64();
                        struct.setDurationIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 11) {
                    struct.video_url = iprot.readString();
                    struct.setVideo_urlIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (struct.isSetDuration()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'duration' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, ImproveVideoInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(ImproveVideoInfo.STRUCT_DESC);
            if (struct.video_url != null) {
                oprot.writeFieldBegin(ImproveVideoInfo.VIDEO_URL_FIELD_DESC);
                oprot.writeString(struct.video_url);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(ImproveVideoInfo.DURATION_FIELD_DESC);
            oprot.writeI64(struct.duration);
            oprot.writeFieldEnd();
            if (struct.questions != null && struct.isSetQuestions()) {
                oprot.writeFieldBegin(ImproveVideoInfo.QUESTIONS_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 12, struct.questions.size()));
                Iterator<QuestionItem> it = struct.questions.iterator();
                while (it.hasNext()) {
                    it.next().write(oprot);
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            if (struct.next_url != null && struct.isSetNext_url()) {
                oprot.writeFieldBegin(ImproveVideoInfo.NEXT_URL_FIELD_DESC);
                oprot.writeString(struct.next_url);
                oprot.writeFieldEnd();
            }
            if (struct.isSetVideo_status()) {
                oprot.writeFieldBegin(ImproveVideoInfo.VIDEO_STATUS_FIELD_DESC);
                oprot.writeI32(struct.video_status);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ImproveVideoInfoStandardSchemeFactory implements SchemeFactory {
        private ImproveVideoInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public ImproveVideoInfoStandardScheme getScheme() {
            return new ImproveVideoInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ImproveVideoInfoTupleScheme extends TupleScheme<ImproveVideoInfo> {
        private ImproveVideoInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, ImproveVideoInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.video_url = tTupleProtocol.readString();
            struct.setVideo_urlIsSet(true);
            struct.duration = tTupleProtocol.readI64();
            struct.setDurationIsSet(true);
            BitSet readBitSet = tTupleProtocol.readBitSet(3);
            if (readBitSet.get(0)) {
                TList tList = new TList((byte) 12, tTupleProtocol.readI32());
                struct.questions = new ArrayList(tList.size);
                for (int i11 = 0; i11 < tList.size; i11++) {
                    QuestionItem questionItem = new QuestionItem();
                    questionItem.read(tTupleProtocol);
                    struct.questions.add(questionItem);
                }
                struct.setQuestionsIsSet(true);
            }
            if (readBitSet.get(1)) {
                struct.next_url = tTupleProtocol.readString();
                struct.setNext_urlIsSet(true);
            }
            if (readBitSet.get(2)) {
                struct.video_status = tTupleProtocol.readI32();
                struct.setVideo_statusIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, ImproveVideoInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeString(struct.video_url);
            tTupleProtocol.writeI64(struct.duration);
            BitSet bitSet = new BitSet();
            if (struct.isSetQuestions()) {
                bitSet.set(0);
            }
            if (struct.isSetNext_url()) {
                bitSet.set(1);
            }
            if (struct.isSetVideo_status()) {
                bitSet.set(2);
            }
            tTupleProtocol.writeBitSet(bitSet, 3);
            if (struct.isSetQuestions()) {
                tTupleProtocol.writeI32(struct.questions.size());
                Iterator<QuestionItem> it = struct.questions.iterator();
                while (it.hasNext()) {
                    it.next().write(tTupleProtocol);
                }
            }
            if (struct.isSetNext_url()) {
                tTupleProtocol.writeString(struct.next_url);
            }
            if (struct.isSetVideo_status()) {
                tTupleProtocol.writeI32(struct.video_status);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ImproveVideoInfoTupleSchemeFactory implements SchemeFactory {
        private ImproveVideoInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public ImproveVideoInfoTupleScheme getScheme() {
            return new ImproveVideoInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        VIDEO_URL(1, "video_url"),
        DURATION(2, "duration"),
        QUESTIONS(3, "questions"),
        NEXT_URL(4, "next_url"),
        VIDEO_STATUS(5, "video_status");

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
                return VIDEO_URL;
            }
            if (fieldId == 2) {
                return DURATION;
            }
            if (fieldId == 3) {
                return QUESTIONS;
            }
            if (fieldId == 4) {
                return NEXT_URL;
            }
            if (fieldId != 5) {
                return null;
            }
            return VIDEO_STATUS;
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
        hashMap.put(StandardScheme.class, new ImproveVideoInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new ImproveVideoInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.VIDEO_URL, (_Fields) new FieldMetaData("video_url", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.DURATION, (_Fields) new FieldMetaData("duration", (byte) 1, new FieldValueMetaData((byte) 10)));
        enumMap.put((EnumMap) _Fields.QUESTIONS, (_Fields) new FieldMetaData("questions", (byte) 2, new ListMetaData((byte) 15, new StructMetaData((byte) 12, QuestionItem.class))));
        enumMap.put((EnumMap) _Fields.NEXT_URL, (_Fields) new FieldMetaData("next_url", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.VIDEO_STATUS, (_Fields) new FieldMetaData("video_status", (byte) 2, new FieldValueMetaData((byte) 8)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(ImproveVideoInfo.class, unmodifiableMap);
    }

    public ImproveVideoInfo() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.QUESTIONS, _Fields.NEXT_URL, _Fields.VIDEO_STATUS};
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

    public void addToQuestions(QuestionItem elem) {
        if (this.questions == null) {
            this.questions = new ArrayList();
        }
        this.questions.add(elem);
    }

    @Override // org.apache.thrift.TBase
    public void clear() {
        this.video_url = null;
        setDurationIsSet(false);
        this.duration = 0L;
        this.questions = null;
        this.next_url = null;
        setVideo_statusIsSet(false);
        this.video_status = 0;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof ImproveVideoInfo)) {
            return equals((ImproveVideoInfo) that);
        }
        return false;
    }

    public long getDuration() {
        return this.duration;
    }

    public String getNext_url() {
        return this.next_url;
    }

    public List<QuestionItem> getQuestions() {
        return this.questions;
    }

    public Iterator<QuestionItem> getQuestionsIterator() {
        List<QuestionItem> list = this.questions;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getQuestionsSize() {
        List<QuestionItem> list = this.questions;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public int getVideo_status() {
        return this.video_status;
    }

    public String getVideo_url() {
        return this.video_url;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetDuration() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetNext_url() {
        return this.next_url != null;
    }

    public boolean isSetQuestions() {
        return this.questions != null;
    }

    public boolean isSetVideo_status() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetVideo_url() {
        return this.video_url != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public ImproveVideoInfo setDuration(long duration) {
        this.duration = duration;
        setDurationIsSet(true);
        return this;
    }

    public void setDurationIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public ImproveVideoInfo setNext_url(String next_url) {
        this.next_url = next_url;
        return this;
    }

    public void setNext_urlIsSet(boolean value) {
        if (value) {
            return;
        }
        this.next_url = null;
    }

    public ImproveVideoInfo setQuestions(List<QuestionItem> questions) {
        this.questions = questions;
        return this;
    }

    public void setQuestionsIsSet(boolean value) {
        if (value) {
            return;
        }
        this.questions = null;
    }

    public ImproveVideoInfo setVideo_status(int video_status) {
        this.video_status = video_status;
        setVideo_statusIsSet(true);
        return this;
    }

    public void setVideo_statusIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public ImproveVideoInfo setVideo_url(String video_url) {
        this.video_url = video_url;
        return this;
    }

    public void setVideo_urlIsSet(boolean value) {
        if (value) {
            return;
        }
        this.video_url = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ImproveVideoInfo(");
        sb2.append("video_url:");
        String str = this.video_url;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(j2.O);
        sb2.append("duration:");
        sb2.append(this.duration);
        if (isSetQuestions()) {
            sb2.append(j2.O);
            sb2.append("questions:");
            List<QuestionItem> list = this.questions;
            if (list == null) {
                sb2.append("null");
            } else {
                sb2.append(list);
            }
        }
        if (isSetNext_url()) {
            sb2.append(j2.O);
            sb2.append("next_url:");
            String str2 = this.next_url;
            if (str2 == null) {
                sb2.append("null");
            } else {
                sb2.append(str2);
            }
        }
        if (isSetVideo_status()) {
            sb2.append(j2.O);
            sb2.append("video_status:");
            sb2.append(this.video_status);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetDuration() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetNext_url() {
        this.next_url = null;
    }

    public void unsetQuestions() {
        this.questions = null;
    }

    public void unsetVideo_status() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetVideo_url() {
        this.video_url = null;
    }

    public void validate() throws TException {
        if (this.video_url != null) {
            return;
        }
        throw new TProtocolException("Required field 'video_url' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(ImproveVideoInfo other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        int compareTo5;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo6 = Boolean.valueOf(isSetVideo_url()).compareTo(Boolean.valueOf(other.isSetVideo_url()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (isSetVideo_url() && (compareTo5 = TBaseHelper.compareTo(this.video_url, other.video_url)) != 0) {
            return compareTo5;
        }
        int compareTo7 = Boolean.valueOf(isSetDuration()).compareTo(Boolean.valueOf(other.isSetDuration()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (isSetDuration() && (compareTo4 = TBaseHelper.compareTo(this.duration, other.duration)) != 0) {
            return compareTo4;
        }
        int compareTo8 = Boolean.valueOf(isSetQuestions()).compareTo(Boolean.valueOf(other.isSetQuestions()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (isSetQuestions() && (compareTo3 = TBaseHelper.compareTo((List) this.questions, (List) other.questions)) != 0) {
            return compareTo3;
        }
        int compareTo9 = Boolean.valueOf(isSetNext_url()).compareTo(Boolean.valueOf(other.isSetNext_url()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (isSetNext_url() && (compareTo2 = TBaseHelper.compareTo(this.next_url, other.next_url)) != 0) {
            return compareTo2;
        }
        int compareTo10 = Boolean.valueOf(isSetVideo_status()).compareTo(Boolean.valueOf(other.isSetVideo_status()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (!isSetVideo_status() || (compareTo = TBaseHelper.compareTo(this.video_status, other.video_status)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<ImproveVideoInfo, _Fields> deepCopy2() {
        return new ImproveVideoInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$course_api$ImproveVideoInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return getVideo_url();
        }
        if (i11 == 2) {
            return Long.valueOf(getDuration());
        }
        if (i11 == 3) {
            return getQuestions();
        }
        if (i11 == 4) {
            return getNext_url();
        }
        if (i11 == 5) {
            return Integer.valueOf(getVideo_status());
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$course_api$ImproveVideoInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetVideo_url();
        }
        if (i11 == 2) {
            return isSetDuration();
        }
        if (i11 == 3) {
            return isSetQuestions();
        }
        if (i11 == 4) {
            return isSetNext_url();
        }
        if (i11 == 5) {
            return isSetVideo_status();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$course_api$ImproveVideoInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetVideo_url();
                return;
            } else {
                setVideo_url((String) value);
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetDuration();
                return;
            } else {
                setDuration(((Long) value).longValue());
                return;
            }
        }
        if (i11 == 3) {
            if (value == null) {
                unsetQuestions();
                return;
            } else {
                setQuestions((List) value);
                return;
            }
        }
        if (i11 == 4) {
            if (value == null) {
                unsetNext_url();
                return;
            } else {
                setNext_url((String) value);
                return;
            }
        }
        if (i11 != 5) {
            return;
        }
        if (value == null) {
            unsetVideo_status();
        } else {
            setVideo_status(((Integer) value).intValue());
        }
    }

    public boolean equals(ImproveVideoInfo that) {
        if (that == null) {
            return false;
        }
        boolean isSetVideo_url = isSetVideo_url();
        boolean isSetVideo_url2 = that.isSetVideo_url();
        if (((isSetVideo_url || isSetVideo_url2) && !(isSetVideo_url && isSetVideo_url2 && this.video_url.equals(that.video_url))) || this.duration != that.duration) {
            return false;
        }
        boolean isSetQuestions = isSetQuestions();
        boolean isSetQuestions2 = that.isSetQuestions();
        if ((isSetQuestions || isSetQuestions2) && !(isSetQuestions && isSetQuestions2 && this.questions.equals(that.questions))) {
            return false;
        }
        boolean isSetNext_url = isSetNext_url();
        boolean isSetNext_url2 = that.isSetNext_url();
        if ((isSetNext_url || isSetNext_url2) && !(isSetNext_url && isSetNext_url2 && this.next_url.equals(that.next_url))) {
            return false;
        }
        boolean isSetVideo_status = isSetVideo_status();
        boolean isSetVideo_status2 = that.isSetVideo_status();
        if (isSetVideo_status || isSetVideo_status2) {
            return isSetVideo_status && isSetVideo_status2 && this.video_status == that.video_status;
        }
        return true;
    }

    public ImproveVideoInfo(String video_url, long duration) {
        this();
        this.video_url = video_url;
        this.duration = duration;
        setDurationIsSet(true);
    }

    public ImproveVideoInfo(ImproveVideoInfo other) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.QUESTIONS, _Fields.NEXT_URL, _Fields.VIDEO_STATUS};
        this.__isset_bitfield = other.__isset_bitfield;
        if (other.isSetVideo_url()) {
            this.video_url = other.video_url;
        }
        this.duration = other.duration;
        if (other.isSetQuestions()) {
            ArrayList arrayList = new ArrayList(other.questions.size());
            Iterator<QuestionItem> it = other.questions.iterator();
            while (it.hasNext()) {
                arrayList.add(new QuestionItem(it.next()));
            }
            this.questions = arrayList;
        }
        if (other.isSetNext_url()) {
            this.next_url = other.next_url;
        }
        this.video_status = other.video_status;
    }
}

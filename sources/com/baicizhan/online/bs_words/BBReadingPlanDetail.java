package com.baicizhan.online.bs_words;

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
public class BBReadingPlanDetail implements TBase<BBReadingPlanDetail, _Fields>, Serializable, Cloneable, Comparable<BBReadingPlanDetail> {
    private static final int __CHAPTER_NUM_ISSET_ID = 1;
    private static final int __DURATION_ISSET_ID = 2;
    private static final int __FILE_SIZE_ISSET_ID = 3;
    private static final int __PLAN_ID_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public String audio_file_name;
    public String audio_url;
    public String chapter_name;
    public int chapter_num;
    public int duration;
    public int file_size;
    public int plan_id;
    private static final TStruct STRUCT_DESC = new TStruct("BBReadingPlanDetail");
    private static final TField PLAN_ID_FIELD_DESC = new TField("plan_id", (byte) 8, 1);
    private static final TField CHAPTER_NUM_FIELD_DESC = new TField("chapter_num", (byte) 8, 2);
    private static final TField AUDIO_URL_FIELD_DESC = new TField("audio_url", (byte) 11, 3);
    private static final TField DURATION_FIELD_DESC = new TField("duration", (byte) 8, 4);
    private static final TField CHAPTER_NAME_FIELD_DESC = new TField("chapter_name", (byte) 11, 5);
    private static final TField AUDIO_FILE_NAME_FIELD_DESC = new TField("audio_file_name", (byte) 11, 6);
    private static final TField FILE_SIZE_FIELD_DESC = new TField("file_size", (byte) 8, 7);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.bs_words.BBReadingPlanDetail$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_words$BBReadingPlanDetail$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$bs_words$BBReadingPlanDetail$_Fields = iArr;
            try {
                iArr[_Fields.PLAN_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_words$BBReadingPlanDetail$_Fields[_Fields.CHAPTER_NUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_words$BBReadingPlanDetail$_Fields[_Fields.AUDIO_URL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_words$BBReadingPlanDetail$_Fields[_Fields.DURATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_words$BBReadingPlanDetail$_Fields[_Fields.CHAPTER_NAME.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_words$BBReadingPlanDetail$_Fields[_Fields.AUDIO_FILE_NAME.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_words$BBReadingPlanDetail$_Fields[_Fields.FILE_SIZE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBReadingPlanDetailStandardScheme extends StandardScheme<BBReadingPlanDetail> {
        private BBReadingPlanDetailStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, BBReadingPlanDetail struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    iprot.readStructEnd();
                    if (!struct.isSetPlan_id()) {
                        throw new TProtocolException("Required field 'plan_id' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetChapter_num()) {
                        throw new TProtocolException("Required field 'chapter_num' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetDuration()) {
                        throw new TProtocolException("Required field 'duration' was not found in serialized data! Struct: " + toString());
                    }
                    if (struct.isSetFile_size()) {
                        struct.validate();
                        return;
                    }
                    throw new TProtocolException("Required field 'file_size' was not found in serialized data! Struct: " + toString());
                }
                switch (readFieldBegin.f77768id) {
                    case 1:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.plan_id = iprot.readI32();
                            struct.setPlan_idIsSet(true);
                            break;
                        }
                    case 2:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.chapter_num = iprot.readI32();
                            struct.setChapter_numIsSet(true);
                            break;
                        }
                    case 3:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.audio_url = iprot.readString();
                            struct.setAudio_urlIsSet(true);
                            break;
                        }
                    case 4:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.duration = iprot.readI32();
                            struct.setDurationIsSet(true);
                            break;
                        }
                    case 5:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.chapter_name = iprot.readString();
                            struct.setChapter_nameIsSet(true);
                            break;
                        }
                    case 6:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.audio_file_name = iprot.readString();
                            struct.setAudio_file_nameIsSet(true);
                            break;
                        }
                    case 7:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.file_size = iprot.readI32();
                            struct.setFile_sizeIsSet(true);
                            break;
                        }
                    default:
                        TProtocolUtil.skip(iprot, b11);
                        break;
                }
                iprot.readFieldEnd();
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, BBReadingPlanDetail struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(BBReadingPlanDetail.STRUCT_DESC);
            oprot.writeFieldBegin(BBReadingPlanDetail.PLAN_ID_FIELD_DESC);
            oprot.writeI32(struct.plan_id);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(BBReadingPlanDetail.CHAPTER_NUM_FIELD_DESC);
            oprot.writeI32(struct.chapter_num);
            oprot.writeFieldEnd();
            if (struct.audio_url != null) {
                oprot.writeFieldBegin(BBReadingPlanDetail.AUDIO_URL_FIELD_DESC);
                oprot.writeString(struct.audio_url);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(BBReadingPlanDetail.DURATION_FIELD_DESC);
            oprot.writeI32(struct.duration);
            oprot.writeFieldEnd();
            if (struct.chapter_name != null) {
                oprot.writeFieldBegin(BBReadingPlanDetail.CHAPTER_NAME_FIELD_DESC);
                oprot.writeString(struct.chapter_name);
                oprot.writeFieldEnd();
            }
            if (struct.audio_file_name != null) {
                oprot.writeFieldBegin(BBReadingPlanDetail.AUDIO_FILE_NAME_FIELD_DESC);
                oprot.writeString(struct.audio_file_name);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(BBReadingPlanDetail.FILE_SIZE_FIELD_DESC);
            oprot.writeI32(struct.file_size);
            oprot.writeFieldEnd();
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBReadingPlanDetailStandardSchemeFactory implements SchemeFactory {
        private BBReadingPlanDetailStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BBReadingPlanDetailStandardScheme getScheme() {
            return new BBReadingPlanDetailStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBReadingPlanDetailTupleScheme extends TupleScheme<BBReadingPlanDetail> {
        private BBReadingPlanDetailTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, BBReadingPlanDetail struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.plan_id = tTupleProtocol.readI32();
            struct.setPlan_idIsSet(true);
            struct.chapter_num = tTupleProtocol.readI32();
            struct.setChapter_numIsSet(true);
            struct.audio_url = tTupleProtocol.readString();
            struct.setAudio_urlIsSet(true);
            struct.duration = tTupleProtocol.readI32();
            struct.setDurationIsSet(true);
            struct.chapter_name = tTupleProtocol.readString();
            struct.setChapter_nameIsSet(true);
            struct.audio_file_name = tTupleProtocol.readString();
            struct.setAudio_file_nameIsSet(true);
            struct.file_size = tTupleProtocol.readI32();
            struct.setFile_sizeIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, BBReadingPlanDetail struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.plan_id);
            tTupleProtocol.writeI32(struct.chapter_num);
            tTupleProtocol.writeString(struct.audio_url);
            tTupleProtocol.writeI32(struct.duration);
            tTupleProtocol.writeString(struct.chapter_name);
            tTupleProtocol.writeString(struct.audio_file_name);
            tTupleProtocol.writeI32(struct.file_size);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBReadingPlanDetailTupleSchemeFactory implements SchemeFactory {
        private BBReadingPlanDetailTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BBReadingPlanDetailTupleScheme getScheme() {
            return new BBReadingPlanDetailTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        PLAN_ID(1, "plan_id"),
        CHAPTER_NUM(2, "chapter_num"),
        AUDIO_URL(3, "audio_url"),
        DURATION(4, "duration"),
        CHAPTER_NAME(5, "chapter_name"),
        AUDIO_FILE_NAME(6, "audio_file_name"),
        FILE_SIZE(7, "file_size");

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
            switch (fieldId) {
                case 1:
                    return PLAN_ID;
                case 2:
                    return CHAPTER_NUM;
                case 3:
                    return AUDIO_URL;
                case 4:
                    return DURATION;
                case 5:
                    return CHAPTER_NAME;
                case 6:
                    return AUDIO_FILE_NAME;
                case 7:
                    return FILE_SIZE;
                default:
                    return null;
            }
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
        hashMap.put(StandardScheme.class, new BBReadingPlanDetailStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new BBReadingPlanDetailTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.PLAN_ID, (_Fields) new FieldMetaData("plan_id", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.CHAPTER_NUM, (_Fields) new FieldMetaData("chapter_num", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.AUDIO_URL, (_Fields) new FieldMetaData("audio_url", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.DURATION, (_Fields) new FieldMetaData("duration", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.CHAPTER_NAME, (_Fields) new FieldMetaData("chapter_name", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.AUDIO_FILE_NAME, (_Fields) new FieldMetaData("audio_file_name", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.FILE_SIZE, (_Fields) new FieldMetaData("file_size", (byte) 1, new FieldValueMetaData((byte) 8)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(BBReadingPlanDetail.class, unmodifiableMap);
    }

    public BBReadingPlanDetail() {
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
        setPlan_idIsSet(false);
        this.plan_id = 0;
        setChapter_numIsSet(false);
        this.chapter_num = 0;
        this.audio_url = null;
        setDurationIsSet(false);
        this.duration = 0;
        this.chapter_name = null;
        this.audio_file_name = null;
        setFile_sizeIsSet(false);
        this.file_size = 0;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof BBReadingPlanDetail)) {
            return equals((BBReadingPlanDetail) that);
        }
        return false;
    }

    public String getAudio_file_name() {
        return this.audio_file_name;
    }

    public String getAudio_url() {
        return this.audio_url;
    }

    public String getChapter_name() {
        return this.chapter_name;
    }

    public int getChapter_num() {
        return this.chapter_num;
    }

    public int getDuration() {
        return this.duration;
    }

    public int getFile_size() {
        return this.file_size;
    }

    public int getPlan_id() {
        return this.plan_id;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetAudio_file_name() {
        return this.audio_file_name != null;
    }

    public boolean isSetAudio_url() {
        return this.audio_url != null;
    }

    public boolean isSetChapter_name() {
        return this.chapter_name != null;
    }

    public boolean isSetChapter_num() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetDuration() {
        return EncodingUtils.testBit(this.__isset_bitfield, 2);
    }

    public boolean isSetFile_size() {
        return EncodingUtils.testBit(this.__isset_bitfield, 3);
    }

    public boolean isSetPlan_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public BBReadingPlanDetail setAudio_file_name(String audio_file_name) {
        this.audio_file_name = audio_file_name;
        return this;
    }

    public void setAudio_file_nameIsSet(boolean value) {
        if (value) {
            return;
        }
        this.audio_file_name = null;
    }

    public BBReadingPlanDetail setAudio_url(String audio_url) {
        this.audio_url = audio_url;
        return this;
    }

    public void setAudio_urlIsSet(boolean value) {
        if (value) {
            return;
        }
        this.audio_url = null;
    }

    public BBReadingPlanDetail setChapter_name(String chapter_name) {
        this.chapter_name = chapter_name;
        return this;
    }

    public void setChapter_nameIsSet(boolean value) {
        if (value) {
            return;
        }
        this.chapter_name = null;
    }

    public BBReadingPlanDetail setChapter_num(int chapter_num) {
        this.chapter_num = chapter_num;
        setChapter_numIsSet(true);
        return this;
    }

    public void setChapter_numIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public BBReadingPlanDetail setDuration(int duration) {
        this.duration = duration;
        setDurationIsSet(true);
        return this;
    }

    public void setDurationIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 2, value);
    }

    public BBReadingPlanDetail setFile_size(int file_size) {
        this.file_size = file_size;
        setFile_sizeIsSet(true);
        return this;
    }

    public void setFile_sizeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 3, value);
    }

    public BBReadingPlanDetail setPlan_id(int plan_id) {
        this.plan_id = plan_id;
        setPlan_idIsSet(true);
        return this;
    }

    public void setPlan_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("BBReadingPlanDetail(");
        sb2.append("plan_id:");
        sb2.append(this.plan_id);
        sb2.append(j2.O);
        sb2.append("chapter_num:");
        sb2.append(this.chapter_num);
        sb2.append(j2.O);
        sb2.append("audio_url:");
        String str = this.audio_url;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(j2.O);
        sb2.append("duration:");
        sb2.append(this.duration);
        sb2.append(j2.O);
        sb2.append("chapter_name:");
        String str2 = this.chapter_name;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(str2);
        }
        sb2.append(j2.O);
        sb2.append("audio_file_name:");
        String str3 = this.audio_file_name;
        if (str3 == null) {
            sb2.append("null");
        } else {
            sb2.append(str3);
        }
        sb2.append(j2.O);
        sb2.append("file_size:");
        sb2.append(this.file_size);
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetAudio_file_name() {
        this.audio_file_name = null;
    }

    public void unsetAudio_url() {
        this.audio_url = null;
    }

    public void unsetChapter_name() {
        this.chapter_name = null;
    }

    public void unsetChapter_num() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetDuration() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 2);
    }

    public void unsetFile_size() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 3);
    }

    public void unsetPlan_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void validate() throws TException {
        if (this.audio_url == null) {
            throw new TProtocolException("Required field 'audio_url' was not present! Struct: " + toString());
        }
        if (this.chapter_name == null) {
            throw new TProtocolException("Required field 'chapter_name' was not present! Struct: " + toString());
        }
        if (this.audio_file_name != null) {
            return;
        }
        throw new TProtocolException("Required field 'audio_file_name' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(BBReadingPlanDetail other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        int compareTo5;
        int compareTo6;
        int compareTo7;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo8 = Boolean.valueOf(isSetPlan_id()).compareTo(Boolean.valueOf(other.isSetPlan_id()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (isSetPlan_id() && (compareTo7 = TBaseHelper.compareTo(this.plan_id, other.plan_id)) != 0) {
            return compareTo7;
        }
        int compareTo9 = Boolean.valueOf(isSetChapter_num()).compareTo(Boolean.valueOf(other.isSetChapter_num()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (isSetChapter_num() && (compareTo6 = TBaseHelper.compareTo(this.chapter_num, other.chapter_num)) != 0) {
            return compareTo6;
        }
        int compareTo10 = Boolean.valueOf(isSetAudio_url()).compareTo(Boolean.valueOf(other.isSetAudio_url()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (isSetAudio_url() && (compareTo5 = TBaseHelper.compareTo(this.audio_url, other.audio_url)) != 0) {
            return compareTo5;
        }
        int compareTo11 = Boolean.valueOf(isSetDuration()).compareTo(Boolean.valueOf(other.isSetDuration()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (isSetDuration() && (compareTo4 = TBaseHelper.compareTo(this.duration, other.duration)) != 0) {
            return compareTo4;
        }
        int compareTo12 = Boolean.valueOf(isSetChapter_name()).compareTo(Boolean.valueOf(other.isSetChapter_name()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (isSetChapter_name() && (compareTo3 = TBaseHelper.compareTo(this.chapter_name, other.chapter_name)) != 0) {
            return compareTo3;
        }
        int compareTo13 = Boolean.valueOf(isSetAudio_file_name()).compareTo(Boolean.valueOf(other.isSetAudio_file_name()));
        if (compareTo13 != 0) {
            return compareTo13;
        }
        if (isSetAudio_file_name() && (compareTo2 = TBaseHelper.compareTo(this.audio_file_name, other.audio_file_name)) != 0) {
            return compareTo2;
        }
        int compareTo14 = Boolean.valueOf(isSetFile_size()).compareTo(Boolean.valueOf(other.isSetFile_size()));
        if (compareTo14 != 0) {
            return compareTo14;
        }
        if (!isSetFile_size() || (compareTo = TBaseHelper.compareTo(this.file_size, other.file_size)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<BBReadingPlanDetail, _Fields> deepCopy2() {
        return new BBReadingPlanDetail(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_words$BBReadingPlanDetail$_Fields[field.ordinal()]) {
            case 1:
                return Integer.valueOf(getPlan_id());
            case 2:
                return Integer.valueOf(getChapter_num());
            case 3:
                return getAudio_url();
            case 4:
                return Integer.valueOf(getDuration());
            case 5:
                return getChapter_name();
            case 6:
                return getAudio_file_name();
            case 7:
                return Integer.valueOf(getFile_size());
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_words$BBReadingPlanDetail$_Fields[field.ordinal()]) {
            case 1:
                return isSetPlan_id();
            case 2:
                return isSetChapter_num();
            case 3:
                return isSetAudio_url();
            case 4:
                return isSetDuration();
            case 5:
                return isSetChapter_name();
            case 6:
                return isSetAudio_file_name();
            case 7:
                return isSetFile_size();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_words$BBReadingPlanDetail$_Fields[field.ordinal()]) {
            case 1:
                if (value != null) {
                    setPlan_id(((Integer) value).intValue());
                    break;
                } else {
                    unsetPlan_id();
                    break;
                }
            case 2:
                if (value != null) {
                    setChapter_num(((Integer) value).intValue());
                    break;
                } else {
                    unsetChapter_num();
                    break;
                }
            case 3:
                if (value != null) {
                    setAudio_url((String) value);
                    break;
                } else {
                    unsetAudio_url();
                    break;
                }
            case 4:
                if (value != null) {
                    setDuration(((Integer) value).intValue());
                    break;
                } else {
                    unsetDuration();
                    break;
                }
            case 5:
                if (value != null) {
                    setChapter_name((String) value);
                    break;
                } else {
                    unsetChapter_name();
                    break;
                }
            case 6:
                if (value != null) {
                    setAudio_file_name((String) value);
                    break;
                } else {
                    unsetAudio_file_name();
                    break;
                }
            case 7:
                if (value != null) {
                    setFile_size(((Integer) value).intValue());
                    break;
                } else {
                    unsetFile_size();
                    break;
                }
        }
    }

    public BBReadingPlanDetail(int plan_id, int chapter_num, String audio_url, int duration, String chapter_name, String audio_file_name, int file_size) {
        this();
        this.plan_id = plan_id;
        setPlan_idIsSet(true);
        this.chapter_num = chapter_num;
        setChapter_numIsSet(true);
        this.audio_url = audio_url;
        this.duration = duration;
        setDurationIsSet(true);
        this.chapter_name = chapter_name;
        this.audio_file_name = audio_file_name;
        this.file_size = file_size;
        setFile_sizeIsSet(true);
    }

    public boolean equals(BBReadingPlanDetail that) {
        if (that == null || this.plan_id != that.plan_id || this.chapter_num != that.chapter_num) {
            return false;
        }
        boolean isSetAudio_url = isSetAudio_url();
        boolean isSetAudio_url2 = that.isSetAudio_url();
        if (((isSetAudio_url || isSetAudio_url2) && !(isSetAudio_url && isSetAudio_url2 && this.audio_url.equals(that.audio_url))) || this.duration != that.duration) {
            return false;
        }
        boolean isSetChapter_name = isSetChapter_name();
        boolean isSetChapter_name2 = that.isSetChapter_name();
        if ((isSetChapter_name || isSetChapter_name2) && !(isSetChapter_name && isSetChapter_name2 && this.chapter_name.equals(that.chapter_name))) {
            return false;
        }
        boolean isSetAudio_file_name = isSetAudio_file_name();
        boolean isSetAudio_file_name2 = that.isSetAudio_file_name();
        return (!(isSetAudio_file_name || isSetAudio_file_name2) || (isSetAudio_file_name && isSetAudio_file_name2 && this.audio_file_name.equals(that.audio_file_name))) && this.file_size == that.file_size;
    }

    public BBReadingPlanDetail(BBReadingPlanDetail other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        this.plan_id = other.plan_id;
        this.chapter_num = other.chapter_num;
        if (other.isSetAudio_url()) {
            this.audio_url = other.audio_url;
        }
        this.duration = other.duration;
        if (other.isSetChapter_name()) {
            this.chapter_name = other.chapter_name;
        }
        if (other.isSetAudio_file_name()) {
            this.audio_file_name = other.audio_file_name;
        }
        this.file_size = other.file_size;
    }
}

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
public class BBExamAudio implements TBase<BBExamAudio, _Fields>, Serializable, Cloneable, Comparable<BBExamAudio> {
    private static final int __DURATION_ISSET_ID = 0;
    private static final int __FILE_SIZE_ISSET_ID = 1;
    private static final int __SEQ_ISSET_ID = 2;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public String audio_file_name;
    public String audio_name;
    public String audio_url;
    public int duration;
    public int file_size;
    public int seq;
    private static final TStruct STRUCT_DESC = new TStruct("BBExamAudio");
    private static final TField AUDIO_URL_FIELD_DESC = new TField("audio_url", (byte) 11, 1);
    private static final TField DURATION_FIELD_DESC = new TField("duration", (byte) 8, 2);
    private static final TField AUDIO_NAME_FIELD_DESC = new TField("audio_name", (byte) 11, 3);
    private static final TField AUDIO_FILE_NAME_FIELD_DESC = new TField("audio_file_name", (byte) 11, 4);
    private static final TField FILE_SIZE_FIELD_DESC = new TField("file_size", (byte) 8, 5);
    private static final TField SEQ_FIELD_DESC = new TField(ma.b.f72887a, (byte) 8, 6);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.bs_words.BBExamAudio$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_words$BBExamAudio$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$bs_words$BBExamAudio$_Fields = iArr;
            try {
                iArr[_Fields.AUDIO_URL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_words$BBExamAudio$_Fields[_Fields.DURATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_words$BBExamAudio$_Fields[_Fields.AUDIO_NAME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_words$BBExamAudio$_Fields[_Fields.AUDIO_FILE_NAME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_words$BBExamAudio$_Fields[_Fields.FILE_SIZE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_words$BBExamAudio$_Fields[_Fields.SEQ.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBExamAudioStandardScheme extends StandardScheme<BBExamAudio> {
        private BBExamAudioStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, BBExamAudio struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    iprot.readStructEnd();
                    if (!struct.isSetDuration()) {
                        throw new TProtocolException("Required field 'duration' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetFile_size()) {
                        throw new TProtocolException("Required field 'file_size' was not found in serialized data! Struct: " + toString());
                    }
                    if (struct.isSetSeq()) {
                        struct.validate();
                        return;
                    }
                    throw new TProtocolException("Required field 'seq' was not found in serialized data! Struct: " + toString());
                }
                switch (readFieldBegin.f77768id) {
                    case 1:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.audio_url = iprot.readString();
                            struct.setAudio_urlIsSet(true);
                            break;
                        }
                    case 2:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.duration = iprot.readI32();
                            struct.setDurationIsSet(true);
                            break;
                        }
                    case 3:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.audio_name = iprot.readString();
                            struct.setAudio_nameIsSet(true);
                            break;
                        }
                    case 4:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.audio_file_name = iprot.readString();
                            struct.setAudio_file_nameIsSet(true);
                            break;
                        }
                    case 5:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.file_size = iprot.readI32();
                            struct.setFile_sizeIsSet(true);
                            break;
                        }
                    case 6:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.seq = iprot.readI32();
                            struct.setSeqIsSet(true);
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
        public void write(TProtocol oprot, BBExamAudio struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(BBExamAudio.STRUCT_DESC);
            if (struct.audio_url != null) {
                oprot.writeFieldBegin(BBExamAudio.AUDIO_URL_FIELD_DESC);
                oprot.writeString(struct.audio_url);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(BBExamAudio.DURATION_FIELD_DESC);
            oprot.writeI32(struct.duration);
            oprot.writeFieldEnd();
            if (struct.audio_name != null) {
                oprot.writeFieldBegin(BBExamAudio.AUDIO_NAME_FIELD_DESC);
                oprot.writeString(struct.audio_name);
                oprot.writeFieldEnd();
            }
            if (struct.audio_file_name != null) {
                oprot.writeFieldBegin(BBExamAudio.AUDIO_FILE_NAME_FIELD_DESC);
                oprot.writeString(struct.audio_file_name);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(BBExamAudio.FILE_SIZE_FIELD_DESC);
            oprot.writeI32(struct.file_size);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(BBExamAudio.SEQ_FIELD_DESC);
            oprot.writeI32(struct.seq);
            oprot.writeFieldEnd();
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBExamAudioStandardSchemeFactory implements SchemeFactory {
        private BBExamAudioStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BBExamAudioStandardScheme getScheme() {
            return new BBExamAudioStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBExamAudioTupleScheme extends TupleScheme<BBExamAudio> {
        private BBExamAudioTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, BBExamAudio struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.audio_url = tTupleProtocol.readString();
            struct.setAudio_urlIsSet(true);
            struct.duration = tTupleProtocol.readI32();
            struct.setDurationIsSet(true);
            struct.audio_name = tTupleProtocol.readString();
            struct.setAudio_nameIsSet(true);
            struct.audio_file_name = tTupleProtocol.readString();
            struct.setAudio_file_nameIsSet(true);
            struct.file_size = tTupleProtocol.readI32();
            struct.setFile_sizeIsSet(true);
            struct.seq = tTupleProtocol.readI32();
            struct.setSeqIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, BBExamAudio struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeString(struct.audio_url);
            tTupleProtocol.writeI32(struct.duration);
            tTupleProtocol.writeString(struct.audio_name);
            tTupleProtocol.writeString(struct.audio_file_name);
            tTupleProtocol.writeI32(struct.file_size);
            tTupleProtocol.writeI32(struct.seq);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBExamAudioTupleSchemeFactory implements SchemeFactory {
        private BBExamAudioTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BBExamAudioTupleScheme getScheme() {
            return new BBExamAudioTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        AUDIO_URL(1, "audio_url"),
        DURATION(2, "duration"),
        AUDIO_NAME(3, "audio_name"),
        AUDIO_FILE_NAME(4, "audio_file_name"),
        FILE_SIZE(5, "file_size"),
        SEQ(6, ma.b.f72887a);

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
                    return AUDIO_URL;
                case 2:
                    return DURATION;
                case 3:
                    return AUDIO_NAME;
                case 4:
                    return AUDIO_FILE_NAME;
                case 5:
                    return FILE_SIZE;
                case 6:
                    return SEQ;
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
        hashMap.put(StandardScheme.class, new BBExamAudioStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new BBExamAudioTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.AUDIO_URL, (_Fields) new FieldMetaData("audio_url", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.DURATION, (_Fields) new FieldMetaData("duration", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.AUDIO_NAME, (_Fields) new FieldMetaData("audio_name", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.AUDIO_FILE_NAME, (_Fields) new FieldMetaData("audio_file_name", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.FILE_SIZE, (_Fields) new FieldMetaData("file_size", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.SEQ, (_Fields) new FieldMetaData(ma.b.f72887a, (byte) 1, new FieldValueMetaData((byte) 8)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(BBExamAudio.class, unmodifiableMap);
    }

    public BBExamAudio() {
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
        this.audio_url = null;
        setDurationIsSet(false);
        this.duration = 0;
        this.audio_name = null;
        this.audio_file_name = null;
        setFile_sizeIsSet(false);
        this.file_size = 0;
        setSeqIsSet(false);
        this.seq = 0;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof BBExamAudio)) {
            return equals((BBExamAudio) that);
        }
        return false;
    }

    public String getAudio_file_name() {
        return this.audio_file_name;
    }

    public String getAudio_name() {
        return this.audio_name;
    }

    public String getAudio_url() {
        return this.audio_url;
    }

    public int getDuration() {
        return this.duration;
    }

    public int getFile_size() {
        return this.file_size;
    }

    public int getSeq() {
        return this.seq;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetAudio_file_name() {
        return this.audio_file_name != null;
    }

    public boolean isSetAudio_name() {
        return this.audio_name != null;
    }

    public boolean isSetAudio_url() {
        return this.audio_url != null;
    }

    public boolean isSetDuration() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetFile_size() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetSeq() {
        return EncodingUtils.testBit(this.__isset_bitfield, 2);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public BBExamAudio setAudio_file_name(String audio_file_name) {
        this.audio_file_name = audio_file_name;
        return this;
    }

    public void setAudio_file_nameIsSet(boolean value) {
        if (value) {
            return;
        }
        this.audio_file_name = null;
    }

    public BBExamAudio setAudio_name(String audio_name) {
        this.audio_name = audio_name;
        return this;
    }

    public void setAudio_nameIsSet(boolean value) {
        if (value) {
            return;
        }
        this.audio_name = null;
    }

    public BBExamAudio setAudio_url(String audio_url) {
        this.audio_url = audio_url;
        return this;
    }

    public void setAudio_urlIsSet(boolean value) {
        if (value) {
            return;
        }
        this.audio_url = null;
    }

    public BBExamAudio setDuration(int duration) {
        this.duration = duration;
        setDurationIsSet(true);
        return this;
    }

    public void setDurationIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public BBExamAudio setFile_size(int file_size) {
        this.file_size = file_size;
        setFile_sizeIsSet(true);
        return this;
    }

    public void setFile_sizeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public BBExamAudio setSeq(int seq) {
        this.seq = seq;
        setSeqIsSet(true);
        return this;
    }

    public void setSeqIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 2, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("BBExamAudio(");
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
        sb2.append("audio_name:");
        String str2 = this.audio_name;
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
        sb2.append(j2.O);
        sb2.append("seq:");
        sb2.append(this.seq);
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetAudio_file_name() {
        this.audio_file_name = null;
    }

    public void unsetAudio_name() {
        this.audio_name = null;
    }

    public void unsetAudio_url() {
        this.audio_url = null;
    }

    public void unsetDuration() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetFile_size() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetSeq() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 2);
    }

    public void validate() throws TException {
        if (this.audio_url == null) {
            throw new TProtocolException("Required field 'audio_url' was not present! Struct: " + toString());
        }
        if (this.audio_name == null) {
            throw new TProtocolException("Required field 'audio_name' was not present! Struct: " + toString());
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
    public int compareTo(BBExamAudio other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        int compareTo5;
        int compareTo6;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo7 = Boolean.valueOf(isSetAudio_url()).compareTo(Boolean.valueOf(other.isSetAudio_url()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (isSetAudio_url() && (compareTo6 = TBaseHelper.compareTo(this.audio_url, other.audio_url)) != 0) {
            return compareTo6;
        }
        int compareTo8 = Boolean.valueOf(isSetDuration()).compareTo(Boolean.valueOf(other.isSetDuration()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (isSetDuration() && (compareTo5 = TBaseHelper.compareTo(this.duration, other.duration)) != 0) {
            return compareTo5;
        }
        int compareTo9 = Boolean.valueOf(isSetAudio_name()).compareTo(Boolean.valueOf(other.isSetAudio_name()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (isSetAudio_name() && (compareTo4 = TBaseHelper.compareTo(this.audio_name, other.audio_name)) != 0) {
            return compareTo4;
        }
        int compareTo10 = Boolean.valueOf(isSetAudio_file_name()).compareTo(Boolean.valueOf(other.isSetAudio_file_name()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (isSetAudio_file_name() && (compareTo3 = TBaseHelper.compareTo(this.audio_file_name, other.audio_file_name)) != 0) {
            return compareTo3;
        }
        int compareTo11 = Boolean.valueOf(isSetFile_size()).compareTo(Boolean.valueOf(other.isSetFile_size()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (isSetFile_size() && (compareTo2 = TBaseHelper.compareTo(this.file_size, other.file_size)) != 0) {
            return compareTo2;
        }
        int compareTo12 = Boolean.valueOf(isSetSeq()).compareTo(Boolean.valueOf(other.isSetSeq()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (!isSetSeq() || (compareTo = TBaseHelper.compareTo(this.seq, other.seq)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<BBExamAudio, _Fields> deepCopy2() {
        return new BBExamAudio(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_words$BBExamAudio$_Fields[field.ordinal()]) {
            case 1:
                return getAudio_url();
            case 2:
                return Integer.valueOf(getDuration());
            case 3:
                return getAudio_name();
            case 4:
                return getAudio_file_name();
            case 5:
                return Integer.valueOf(getFile_size());
            case 6:
                return Integer.valueOf(getSeq());
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_words$BBExamAudio$_Fields[field.ordinal()]) {
            case 1:
                return isSetAudio_url();
            case 2:
                return isSetDuration();
            case 3:
                return isSetAudio_name();
            case 4:
                return isSetAudio_file_name();
            case 5:
                return isSetFile_size();
            case 6:
                return isSetSeq();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_words$BBExamAudio$_Fields[field.ordinal()]) {
            case 1:
                if (value != null) {
                    setAudio_url((String) value);
                    break;
                } else {
                    unsetAudio_url();
                    break;
                }
            case 2:
                if (value != null) {
                    setDuration(((Integer) value).intValue());
                    break;
                } else {
                    unsetDuration();
                    break;
                }
            case 3:
                if (value != null) {
                    setAudio_name((String) value);
                    break;
                } else {
                    unsetAudio_name();
                    break;
                }
            case 4:
                if (value != null) {
                    setAudio_file_name((String) value);
                    break;
                } else {
                    unsetAudio_file_name();
                    break;
                }
            case 5:
                if (value != null) {
                    setFile_size(((Integer) value).intValue());
                    break;
                } else {
                    unsetFile_size();
                    break;
                }
            case 6:
                if (value != null) {
                    setSeq(((Integer) value).intValue());
                    break;
                } else {
                    unsetSeq();
                    break;
                }
        }
    }

    public BBExamAudio(String audio_url, int duration, String audio_name, String audio_file_name, int file_size, int seq) {
        this();
        this.audio_url = audio_url;
        this.duration = duration;
        setDurationIsSet(true);
        this.audio_name = audio_name;
        this.audio_file_name = audio_file_name;
        this.file_size = file_size;
        setFile_sizeIsSet(true);
        this.seq = seq;
        setSeqIsSet(true);
    }

    public boolean equals(BBExamAudio that) {
        if (that == null) {
            return false;
        }
        boolean isSetAudio_url = isSetAudio_url();
        boolean isSetAudio_url2 = that.isSetAudio_url();
        if (((isSetAudio_url || isSetAudio_url2) && !(isSetAudio_url && isSetAudio_url2 && this.audio_url.equals(that.audio_url))) || this.duration != that.duration) {
            return false;
        }
        boolean isSetAudio_name = isSetAudio_name();
        boolean isSetAudio_name2 = that.isSetAudio_name();
        if ((isSetAudio_name || isSetAudio_name2) && !(isSetAudio_name && isSetAudio_name2 && this.audio_name.equals(that.audio_name))) {
            return false;
        }
        boolean isSetAudio_file_name = isSetAudio_file_name();
        boolean isSetAudio_file_name2 = that.isSetAudio_file_name();
        return (!(isSetAudio_file_name || isSetAudio_file_name2) || (isSetAudio_file_name && isSetAudio_file_name2 && this.audio_file_name.equals(that.audio_file_name))) && this.file_size == that.file_size && this.seq == that.seq;
    }

    public BBExamAudio(BBExamAudio other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        if (other.isSetAudio_url()) {
            this.audio_url = other.audio_url;
        }
        this.duration = other.duration;
        if (other.isSetAudio_name()) {
            this.audio_name = other.audio_name;
        }
        if (other.isSetAudio_file_name()) {
            this.audio_file_name = other.audio_file_name;
        }
        this.file_size = other.file_size;
        this.seq = other.seq;
    }
}

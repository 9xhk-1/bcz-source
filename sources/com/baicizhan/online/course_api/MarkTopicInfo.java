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
public class MarkTopicInfo implements TBase<MarkTopicInfo, _Fields>, Serializable, Cloneable, Comparable<MarkTopicInfo> {
    private static final int __TOPIC_ID_ISSET_ID = 0;
    private static final int __WORD_ADD_TIME_ISSET_ID = 1;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public String accent;
    public String audio_url;
    public String cn_means;
    private _Fields[] optionals;
    public int topic_id;
    public String word;
    public long word_add_time;
    private static final TStruct STRUCT_DESC = new TStruct("MarkTopicInfo");
    private static final TField TOPIC_ID_FIELD_DESC = new TField("topic_id", (byte) 8, 1);
    private static final TField WORD_FIELD_DESC = new TField("word", (byte) 11, 2);
    private static final TField AUDIO_URL_FIELD_DESC = new TField("audio_url", (byte) 11, 3);
    private static final TField CN_MEANS_FIELD_DESC = new TField("cn_means", (byte) 11, 4);
    private static final TField WORD_ADD_TIME_FIELD_DESC = new TField("word_add_time", (byte) 10, 5);
    private static final TField ACCENT_FIELD_DESC = new TField("accent", (byte) 11, 6);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.course_api.MarkTopicInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$course_api$MarkTopicInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$course_api$MarkTopicInfo$_Fields = iArr;
            try {
                iArr[_Fields.TOPIC_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$course_api$MarkTopicInfo$_Fields[_Fields.WORD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$course_api$MarkTopicInfo$_Fields[_Fields.AUDIO_URL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$course_api$MarkTopicInfo$_Fields[_Fields.CN_MEANS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$course_api$MarkTopicInfo$_Fields[_Fields.WORD_ADD_TIME.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$baicizhan$online$course_api$MarkTopicInfo$_Fields[_Fields.ACCENT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class MarkTopicInfoStandardScheme extends StandardScheme<MarkTopicInfo> {
        private MarkTopicInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, MarkTopicInfo struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    iprot.readStructEnd();
                    if (struct.isSetTopic_id()) {
                        struct.validate();
                        return;
                    }
                    throw new TProtocolException("Required field 'topic_id' was not found in serialized data! Struct: " + toString());
                }
                switch (readFieldBegin.f77768id) {
                    case 1:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.topic_id = iprot.readI32();
                            struct.setTopic_idIsSet(true);
                            break;
                        }
                    case 2:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.word = iprot.readString();
                            struct.setWordIsSet(true);
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
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.cn_means = iprot.readString();
                            struct.setCn_meansIsSet(true);
                            break;
                        }
                    case 5:
                        if (b11 != 10) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.word_add_time = iprot.readI64();
                            struct.setWord_add_timeIsSet(true);
                            break;
                        }
                    case 6:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.accent = iprot.readString();
                            struct.setAccentIsSet(true);
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
        public void write(TProtocol oprot, MarkTopicInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(MarkTopicInfo.STRUCT_DESC);
            oprot.writeFieldBegin(MarkTopicInfo.TOPIC_ID_FIELD_DESC);
            oprot.writeI32(struct.topic_id);
            oprot.writeFieldEnd();
            if (struct.word != null) {
                oprot.writeFieldBegin(MarkTopicInfo.WORD_FIELD_DESC);
                oprot.writeString(struct.word);
                oprot.writeFieldEnd();
            }
            if (struct.audio_url != null) {
                oprot.writeFieldBegin(MarkTopicInfo.AUDIO_URL_FIELD_DESC);
                oprot.writeString(struct.audio_url);
                oprot.writeFieldEnd();
            }
            if (struct.cn_means != null) {
                oprot.writeFieldBegin(MarkTopicInfo.CN_MEANS_FIELD_DESC);
                oprot.writeString(struct.cn_means);
                oprot.writeFieldEnd();
            }
            if (struct.isSetWord_add_time()) {
                oprot.writeFieldBegin(MarkTopicInfo.WORD_ADD_TIME_FIELD_DESC);
                oprot.writeI64(struct.word_add_time);
                oprot.writeFieldEnd();
            }
            if (struct.accent != null && struct.isSetAccent()) {
                oprot.writeFieldBegin(MarkTopicInfo.ACCENT_FIELD_DESC);
                oprot.writeString(struct.accent);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class MarkTopicInfoStandardSchemeFactory implements SchemeFactory {
        private MarkTopicInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public MarkTopicInfoStandardScheme getScheme() {
            return new MarkTopicInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class MarkTopicInfoTupleScheme extends TupleScheme<MarkTopicInfo> {
        private MarkTopicInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, MarkTopicInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.topic_id = tTupleProtocol.readI32();
            struct.setTopic_idIsSet(true);
            struct.word = tTupleProtocol.readString();
            struct.setWordIsSet(true);
            struct.audio_url = tTupleProtocol.readString();
            struct.setAudio_urlIsSet(true);
            struct.cn_means = tTupleProtocol.readString();
            struct.setCn_meansIsSet(true);
            BitSet readBitSet = tTupleProtocol.readBitSet(2);
            if (readBitSet.get(0)) {
                struct.word_add_time = tTupleProtocol.readI64();
                struct.setWord_add_timeIsSet(true);
            }
            if (readBitSet.get(1)) {
                struct.accent = tTupleProtocol.readString();
                struct.setAccentIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, MarkTopicInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.topic_id);
            tTupleProtocol.writeString(struct.word);
            tTupleProtocol.writeString(struct.audio_url);
            tTupleProtocol.writeString(struct.cn_means);
            BitSet bitSet = new BitSet();
            if (struct.isSetWord_add_time()) {
                bitSet.set(0);
            }
            if (struct.isSetAccent()) {
                bitSet.set(1);
            }
            tTupleProtocol.writeBitSet(bitSet, 2);
            if (struct.isSetWord_add_time()) {
                tTupleProtocol.writeI64(struct.word_add_time);
            }
            if (struct.isSetAccent()) {
                tTupleProtocol.writeString(struct.accent);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class MarkTopicInfoTupleSchemeFactory implements SchemeFactory {
        private MarkTopicInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public MarkTopicInfoTupleScheme getScheme() {
            return new MarkTopicInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        TOPIC_ID(1, "topic_id"),
        WORD(2, "word"),
        AUDIO_URL(3, "audio_url"),
        CN_MEANS(4, "cn_means"),
        WORD_ADD_TIME(5, "word_add_time"),
        ACCENT(6, "accent");

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
                    return TOPIC_ID;
                case 2:
                    return WORD;
                case 3:
                    return AUDIO_URL;
                case 4:
                    return CN_MEANS;
                case 5:
                    return WORD_ADD_TIME;
                case 6:
                    return ACCENT;
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
        hashMap.put(StandardScheme.class, new MarkTopicInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new MarkTopicInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.TOPIC_ID, (_Fields) new FieldMetaData("topic_id", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.WORD, (_Fields) new FieldMetaData("word", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.AUDIO_URL, (_Fields) new FieldMetaData("audio_url", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.CN_MEANS, (_Fields) new FieldMetaData("cn_means", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.WORD_ADD_TIME, (_Fields) new FieldMetaData("word_add_time", (byte) 2, new FieldValueMetaData((byte) 10)));
        enumMap.put((EnumMap) _Fields.ACCENT, (_Fields) new FieldMetaData("accent", (byte) 2, new FieldValueMetaData((byte) 11)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(MarkTopicInfo.class, unmodifiableMap);
    }

    public MarkTopicInfo() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.WORD_ADD_TIME, _Fields.ACCENT};
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
        setTopic_idIsSet(false);
        this.topic_id = 0;
        this.word = null;
        this.audio_url = null;
        this.cn_means = null;
        setWord_add_timeIsSet(false);
        this.word_add_time = 0L;
        this.accent = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof MarkTopicInfo)) {
            return equals((MarkTopicInfo) that);
        }
        return false;
    }

    public String getAccent() {
        return this.accent;
    }

    public String getAudio_url() {
        return this.audio_url;
    }

    public String getCn_means() {
        return this.cn_means;
    }

    public int getTopic_id() {
        return this.topic_id;
    }

    public String getWord() {
        return this.word;
    }

    public long getWord_add_time() {
        return this.word_add_time;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetAccent() {
        return this.accent != null;
    }

    public boolean isSetAudio_url() {
        return this.audio_url != null;
    }

    public boolean isSetCn_means() {
        return this.cn_means != null;
    }

    public boolean isSetTopic_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetWord() {
        return this.word != null;
    }

    public boolean isSetWord_add_time() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public MarkTopicInfo setAccent(String accent) {
        this.accent = accent;
        return this;
    }

    public void setAccentIsSet(boolean value) {
        if (value) {
            return;
        }
        this.accent = null;
    }

    public MarkTopicInfo setAudio_url(String audio_url) {
        this.audio_url = audio_url;
        return this;
    }

    public void setAudio_urlIsSet(boolean value) {
        if (value) {
            return;
        }
        this.audio_url = null;
    }

    public MarkTopicInfo setCn_means(String cn_means) {
        this.cn_means = cn_means;
        return this;
    }

    public void setCn_meansIsSet(boolean value) {
        if (value) {
            return;
        }
        this.cn_means = null;
    }

    public MarkTopicInfo setTopic_id(int topic_id) {
        this.topic_id = topic_id;
        setTopic_idIsSet(true);
        return this;
    }

    public void setTopic_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public MarkTopicInfo setWord(String word) {
        this.word = word;
        return this;
    }

    public void setWordIsSet(boolean value) {
        if (value) {
            return;
        }
        this.word = null;
    }

    public MarkTopicInfo setWord_add_time(long word_add_time) {
        this.word_add_time = word_add_time;
        setWord_add_timeIsSet(true);
        return this;
    }

    public void setWord_add_timeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("MarkTopicInfo(");
        sb2.append("topic_id:");
        sb2.append(this.topic_id);
        sb2.append(j2.O);
        sb2.append("word:");
        String str = this.word;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(j2.O);
        sb2.append("audio_url:");
        String str2 = this.audio_url;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(str2);
        }
        sb2.append(j2.O);
        sb2.append("cn_means:");
        String str3 = this.cn_means;
        if (str3 == null) {
            sb2.append("null");
        } else {
            sb2.append(str3);
        }
        if (isSetWord_add_time()) {
            sb2.append(j2.O);
            sb2.append("word_add_time:");
            sb2.append(this.word_add_time);
        }
        if (isSetAccent()) {
            sb2.append(j2.O);
            sb2.append("accent:");
            String str4 = this.accent;
            if (str4 == null) {
                sb2.append("null");
            } else {
                sb2.append(str4);
            }
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetAccent() {
        this.accent = null;
    }

    public void unsetAudio_url() {
        this.audio_url = null;
    }

    public void unsetCn_means() {
        this.cn_means = null;
    }

    public void unsetTopic_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetWord() {
        this.word = null;
    }

    public void unsetWord_add_time() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void validate() throws TException {
        if (this.word == null) {
            throw new TProtocolException("Required field 'word' was not present! Struct: " + toString());
        }
        if (this.audio_url == null) {
            throw new TProtocolException("Required field 'audio_url' was not present! Struct: " + toString());
        }
        if (this.cn_means != null) {
            return;
        }
        throw new TProtocolException("Required field 'cn_means' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(MarkTopicInfo other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        int compareTo5;
        int compareTo6;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo7 = Boolean.valueOf(isSetTopic_id()).compareTo(Boolean.valueOf(other.isSetTopic_id()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (isSetTopic_id() && (compareTo6 = TBaseHelper.compareTo(this.topic_id, other.topic_id)) != 0) {
            return compareTo6;
        }
        int compareTo8 = Boolean.valueOf(isSetWord()).compareTo(Boolean.valueOf(other.isSetWord()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (isSetWord() && (compareTo5 = TBaseHelper.compareTo(this.word, other.word)) != 0) {
            return compareTo5;
        }
        int compareTo9 = Boolean.valueOf(isSetAudio_url()).compareTo(Boolean.valueOf(other.isSetAudio_url()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (isSetAudio_url() && (compareTo4 = TBaseHelper.compareTo(this.audio_url, other.audio_url)) != 0) {
            return compareTo4;
        }
        int compareTo10 = Boolean.valueOf(isSetCn_means()).compareTo(Boolean.valueOf(other.isSetCn_means()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (isSetCn_means() && (compareTo3 = TBaseHelper.compareTo(this.cn_means, other.cn_means)) != 0) {
            return compareTo3;
        }
        int compareTo11 = Boolean.valueOf(isSetWord_add_time()).compareTo(Boolean.valueOf(other.isSetWord_add_time()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (isSetWord_add_time() && (compareTo2 = TBaseHelper.compareTo(this.word_add_time, other.word_add_time)) != 0) {
            return compareTo2;
        }
        int compareTo12 = Boolean.valueOf(isSetAccent()).compareTo(Boolean.valueOf(other.isSetAccent()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (!isSetAccent() || (compareTo = TBaseHelper.compareTo(this.accent, other.accent)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<MarkTopicInfo, _Fields> deepCopy2() {
        return new MarkTopicInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$course_api$MarkTopicInfo$_Fields[field.ordinal()]) {
            case 1:
                return Integer.valueOf(getTopic_id());
            case 2:
                return getWord();
            case 3:
                return getAudio_url();
            case 4:
                return getCn_means();
            case 5:
                return Long.valueOf(getWord_add_time());
            case 6:
                return getAccent();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$course_api$MarkTopicInfo$_Fields[field.ordinal()]) {
            case 1:
                return isSetTopic_id();
            case 2:
                return isSetWord();
            case 3:
                return isSetAudio_url();
            case 4:
                return isSetCn_means();
            case 5:
                return isSetWord_add_time();
            case 6:
                return isSetAccent();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$course_api$MarkTopicInfo$_Fields[field.ordinal()]) {
            case 1:
                if (value != null) {
                    setTopic_id(((Integer) value).intValue());
                    break;
                } else {
                    unsetTopic_id();
                    break;
                }
            case 2:
                if (value != null) {
                    setWord((String) value);
                    break;
                } else {
                    unsetWord();
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
                    setCn_means((String) value);
                    break;
                } else {
                    unsetCn_means();
                    break;
                }
            case 5:
                if (value != null) {
                    setWord_add_time(((Long) value).longValue());
                    break;
                } else {
                    unsetWord_add_time();
                    break;
                }
            case 6:
                if (value != null) {
                    setAccent((String) value);
                    break;
                } else {
                    unsetAccent();
                    break;
                }
        }
    }

    public boolean equals(MarkTopicInfo that) {
        if (that == null || this.topic_id != that.topic_id) {
            return false;
        }
        boolean isSetWord = isSetWord();
        boolean isSetWord2 = that.isSetWord();
        if ((isSetWord || isSetWord2) && !(isSetWord && isSetWord2 && this.word.equals(that.word))) {
            return false;
        }
        boolean isSetAudio_url = isSetAudio_url();
        boolean isSetAudio_url2 = that.isSetAudio_url();
        if ((isSetAudio_url || isSetAudio_url2) && !(isSetAudio_url && isSetAudio_url2 && this.audio_url.equals(that.audio_url))) {
            return false;
        }
        boolean isSetCn_means = isSetCn_means();
        boolean isSetCn_means2 = that.isSetCn_means();
        if ((isSetCn_means || isSetCn_means2) && !(isSetCn_means && isSetCn_means2 && this.cn_means.equals(that.cn_means))) {
            return false;
        }
        boolean isSetWord_add_time = isSetWord_add_time();
        boolean isSetWord_add_time2 = that.isSetWord_add_time();
        if ((isSetWord_add_time || isSetWord_add_time2) && !(isSetWord_add_time && isSetWord_add_time2 && this.word_add_time == that.word_add_time)) {
            return false;
        }
        boolean isSetAccent = isSetAccent();
        boolean isSetAccent2 = that.isSetAccent();
        if (isSetAccent || isSetAccent2) {
            return isSetAccent && isSetAccent2 && this.accent.equals(that.accent);
        }
        return true;
    }

    public MarkTopicInfo(int topic_id, String word, String audio_url, String cn_means) {
        this();
        this.topic_id = topic_id;
        setTopic_idIsSet(true);
        this.word = word;
        this.audio_url = audio_url;
        this.cn_means = cn_means;
    }

    public MarkTopicInfo(MarkTopicInfo other) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.WORD_ADD_TIME, _Fields.ACCENT};
        this.__isset_bitfield = other.__isset_bitfield;
        this.topic_id = other.topic_id;
        if (other.isSetWord()) {
            this.word = other.word;
        }
        if (other.isSetAudio_url()) {
            this.audio_url = other.audio_url;
        }
        if (other.isSetCn_means()) {
            this.cn_means = other.cn_means;
        }
        this.word_add_time = other.word_add_time;
        if (other.isSetAccent()) {
            this.accent = other.accent;
        }
    }
}

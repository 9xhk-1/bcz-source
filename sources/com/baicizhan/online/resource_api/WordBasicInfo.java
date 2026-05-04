package com.baicizhan.online.resource_api;

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
public class WordBasicInfo implements TBase<WordBasicInfo, _Fields>, Serializable, Cloneable, Comparable<WordBasicInfo> {
    private static final int __TOPIC_ID_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public String accent_uk;
    public String accent_uk_audio_uri;
    public String accent_usa;
    public String accent_usa_audio_uri;
    public String deformation_img_uri;
    public String etyma;
    private _Fields[] optionals;
    public int topic_id;
    public String word;
    private static final TStruct STRUCT_DESC = new TStruct("WordBasicInfo");
    private static final TField TOPIC_ID_FIELD_DESC = new TField("topic_id", (byte) 8, 1);
    private static final TField WORD_FIELD_DESC = new TField("word", (byte) 11, 2);
    private static final TField ACCENT_USA_FIELD_DESC = new TField("accent_usa", (byte) 11, 3);
    private static final TField ACCENT_UK_FIELD_DESC = new TField("accent_uk", (byte) 11, 4);
    private static final TField ACCENT_USA_AUDIO_URI_FIELD_DESC = new TField("accent_usa_audio_uri", (byte) 11, 5);
    private static final TField ACCENT_UK_AUDIO_URI_FIELD_DESC = new TField("accent_uk_audio_uri", (byte) 11, 6);
    private static final TField DEFORMATION_IMG_URI_FIELD_DESC = new TField("deformation_img_uri", (byte) 11, 7);
    private static final TField ETYMA_FIELD_DESC = new TField("etyma", (byte) 11, 8);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.resource_api.WordBasicInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$resource_api$WordBasicInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$resource_api$WordBasicInfo$_Fields = iArr;
            try {
                iArr[_Fields.TOPIC_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$WordBasicInfo$_Fields[_Fields.WORD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$WordBasicInfo$_Fields[_Fields.ACCENT_USA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$WordBasicInfo$_Fields[_Fields.ACCENT_UK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$WordBasicInfo$_Fields[_Fields.ACCENT_USA_AUDIO_URI.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$WordBasicInfo$_Fields[_Fields.ACCENT_UK_AUDIO_URI.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$WordBasicInfo$_Fields[_Fields.DEFORMATION_IMG_URI.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$WordBasicInfo$_Fields[_Fields.ETYMA.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class WordBasicInfoStandardScheme extends StandardScheme<WordBasicInfo> {
        private WordBasicInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, WordBasicInfo struct) throws TException {
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
                            struct.accent_usa = iprot.readString();
                            struct.setAccent_usaIsSet(true);
                            break;
                        }
                    case 4:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.accent_uk = iprot.readString();
                            struct.setAccent_ukIsSet(true);
                            break;
                        }
                    case 5:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.accent_usa_audio_uri = iprot.readString();
                            struct.setAccent_usa_audio_uriIsSet(true);
                            break;
                        }
                    case 6:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.accent_uk_audio_uri = iprot.readString();
                            struct.setAccent_uk_audio_uriIsSet(true);
                            break;
                        }
                    case 7:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.deformation_img_uri = iprot.readString();
                            struct.setDeformation_img_uriIsSet(true);
                            break;
                        }
                    case 8:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.etyma = iprot.readString();
                            struct.setEtymaIsSet(true);
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
        public void write(TProtocol oprot, WordBasicInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(WordBasicInfo.STRUCT_DESC);
            oprot.writeFieldBegin(WordBasicInfo.TOPIC_ID_FIELD_DESC);
            oprot.writeI32(struct.topic_id);
            oprot.writeFieldEnd();
            if (struct.word != null) {
                oprot.writeFieldBegin(WordBasicInfo.WORD_FIELD_DESC);
                oprot.writeString(struct.word);
                oprot.writeFieldEnd();
            }
            if (struct.accent_usa != null && struct.isSetAccent_usa()) {
                oprot.writeFieldBegin(WordBasicInfo.ACCENT_USA_FIELD_DESC);
                oprot.writeString(struct.accent_usa);
                oprot.writeFieldEnd();
            }
            if (struct.accent_uk != null && struct.isSetAccent_uk()) {
                oprot.writeFieldBegin(WordBasicInfo.ACCENT_UK_FIELD_DESC);
                oprot.writeString(struct.accent_uk);
                oprot.writeFieldEnd();
            }
            if (struct.accent_usa_audio_uri != null && struct.isSetAccent_usa_audio_uri()) {
                oprot.writeFieldBegin(WordBasicInfo.ACCENT_USA_AUDIO_URI_FIELD_DESC);
                oprot.writeString(struct.accent_usa_audio_uri);
                oprot.writeFieldEnd();
            }
            if (struct.accent_uk_audio_uri != null && struct.isSetAccent_uk_audio_uri()) {
                oprot.writeFieldBegin(WordBasicInfo.ACCENT_UK_AUDIO_URI_FIELD_DESC);
                oprot.writeString(struct.accent_uk_audio_uri);
                oprot.writeFieldEnd();
            }
            if (struct.deformation_img_uri != null && struct.isSetDeformation_img_uri()) {
                oprot.writeFieldBegin(WordBasicInfo.DEFORMATION_IMG_URI_FIELD_DESC);
                oprot.writeString(struct.deformation_img_uri);
                oprot.writeFieldEnd();
            }
            if (struct.etyma != null && struct.isSetEtyma()) {
                oprot.writeFieldBegin(WordBasicInfo.ETYMA_FIELD_DESC);
                oprot.writeString(struct.etyma);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class WordBasicInfoStandardSchemeFactory implements SchemeFactory {
        private WordBasicInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public WordBasicInfoStandardScheme getScheme() {
            return new WordBasicInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class WordBasicInfoTupleScheme extends TupleScheme<WordBasicInfo> {
        private WordBasicInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, WordBasicInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.topic_id = tTupleProtocol.readI32();
            struct.setTopic_idIsSet(true);
            struct.word = tTupleProtocol.readString();
            struct.setWordIsSet(true);
            BitSet readBitSet = tTupleProtocol.readBitSet(6);
            if (readBitSet.get(0)) {
                struct.accent_usa = tTupleProtocol.readString();
                struct.setAccent_usaIsSet(true);
            }
            if (readBitSet.get(1)) {
                struct.accent_uk = tTupleProtocol.readString();
                struct.setAccent_ukIsSet(true);
            }
            if (readBitSet.get(2)) {
                struct.accent_usa_audio_uri = tTupleProtocol.readString();
                struct.setAccent_usa_audio_uriIsSet(true);
            }
            if (readBitSet.get(3)) {
                struct.accent_uk_audio_uri = tTupleProtocol.readString();
                struct.setAccent_uk_audio_uriIsSet(true);
            }
            if (readBitSet.get(4)) {
                struct.deformation_img_uri = tTupleProtocol.readString();
                struct.setDeformation_img_uriIsSet(true);
            }
            if (readBitSet.get(5)) {
                struct.etyma = tTupleProtocol.readString();
                struct.setEtymaIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, WordBasicInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.topic_id);
            tTupleProtocol.writeString(struct.word);
            BitSet bitSet = new BitSet();
            if (struct.isSetAccent_usa()) {
                bitSet.set(0);
            }
            if (struct.isSetAccent_uk()) {
                bitSet.set(1);
            }
            if (struct.isSetAccent_usa_audio_uri()) {
                bitSet.set(2);
            }
            if (struct.isSetAccent_uk_audio_uri()) {
                bitSet.set(3);
            }
            if (struct.isSetDeformation_img_uri()) {
                bitSet.set(4);
            }
            if (struct.isSetEtyma()) {
                bitSet.set(5);
            }
            tTupleProtocol.writeBitSet(bitSet, 6);
            if (struct.isSetAccent_usa()) {
                tTupleProtocol.writeString(struct.accent_usa);
            }
            if (struct.isSetAccent_uk()) {
                tTupleProtocol.writeString(struct.accent_uk);
            }
            if (struct.isSetAccent_usa_audio_uri()) {
                tTupleProtocol.writeString(struct.accent_usa_audio_uri);
            }
            if (struct.isSetAccent_uk_audio_uri()) {
                tTupleProtocol.writeString(struct.accent_uk_audio_uri);
            }
            if (struct.isSetDeformation_img_uri()) {
                tTupleProtocol.writeString(struct.deformation_img_uri);
            }
            if (struct.isSetEtyma()) {
                tTupleProtocol.writeString(struct.etyma);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class WordBasicInfoTupleSchemeFactory implements SchemeFactory {
        private WordBasicInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public WordBasicInfoTupleScheme getScheme() {
            return new WordBasicInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        TOPIC_ID(1, "topic_id"),
        WORD(2, "word"),
        ACCENT_USA(3, "accent_usa"),
        ACCENT_UK(4, "accent_uk"),
        ACCENT_USA_AUDIO_URI(5, "accent_usa_audio_uri"),
        ACCENT_UK_AUDIO_URI(6, "accent_uk_audio_uri"),
        DEFORMATION_IMG_URI(7, "deformation_img_uri"),
        ETYMA(8, "etyma");

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
                    return ACCENT_USA;
                case 4:
                    return ACCENT_UK;
                case 5:
                    return ACCENT_USA_AUDIO_URI;
                case 6:
                    return ACCENT_UK_AUDIO_URI;
                case 7:
                    return DEFORMATION_IMG_URI;
                case 8:
                    return ETYMA;
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
        hashMap.put(StandardScheme.class, new WordBasicInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new WordBasicInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.TOPIC_ID, (_Fields) new FieldMetaData("topic_id", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.WORD, (_Fields) new FieldMetaData("word", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.ACCENT_USA, (_Fields) new FieldMetaData("accent_usa", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.ACCENT_UK, (_Fields) new FieldMetaData("accent_uk", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.ACCENT_USA_AUDIO_URI, (_Fields) new FieldMetaData("accent_usa_audio_uri", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.ACCENT_UK_AUDIO_URI, (_Fields) new FieldMetaData("accent_uk_audio_uri", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.DEFORMATION_IMG_URI, (_Fields) new FieldMetaData("deformation_img_uri", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.ETYMA, (_Fields) new FieldMetaData("etyma", (byte) 2, new FieldValueMetaData((byte) 11)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(WordBasicInfo.class, unmodifiableMap);
    }

    public WordBasicInfo() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.ACCENT_USA, _Fields.ACCENT_UK, _Fields.ACCENT_USA_AUDIO_URI, _Fields.ACCENT_UK_AUDIO_URI, _Fields.DEFORMATION_IMG_URI, _Fields.ETYMA};
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
        this.accent_usa = null;
        this.accent_uk = null;
        this.accent_usa_audio_uri = null;
        this.accent_uk_audio_uri = null;
        this.deformation_img_uri = null;
        this.etyma = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof WordBasicInfo)) {
            return equals((WordBasicInfo) that);
        }
        return false;
    }

    public String getAccent_uk() {
        return this.accent_uk;
    }

    public String getAccent_uk_audio_uri() {
        return this.accent_uk_audio_uri;
    }

    public String getAccent_usa() {
        return this.accent_usa;
    }

    public String getAccent_usa_audio_uri() {
        return this.accent_usa_audio_uri;
    }

    public String getDeformation_img_uri() {
        return this.deformation_img_uri;
    }

    public String getEtyma() {
        return this.etyma;
    }

    public int getTopic_id() {
        return this.topic_id;
    }

    public String getWord() {
        return this.word;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetAccent_uk() {
        return this.accent_uk != null;
    }

    public boolean isSetAccent_uk_audio_uri() {
        return this.accent_uk_audio_uri != null;
    }

    public boolean isSetAccent_usa() {
        return this.accent_usa != null;
    }

    public boolean isSetAccent_usa_audio_uri() {
        return this.accent_usa_audio_uri != null;
    }

    public boolean isSetDeformation_img_uri() {
        return this.deformation_img_uri != null;
    }

    public boolean isSetEtyma() {
        return this.etyma != null;
    }

    public boolean isSetTopic_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetWord() {
        return this.word != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public WordBasicInfo setAccent_uk(String accent_uk) {
        this.accent_uk = accent_uk;
        return this;
    }

    public void setAccent_ukIsSet(boolean value) {
        if (value) {
            return;
        }
        this.accent_uk = null;
    }

    public WordBasicInfo setAccent_uk_audio_uri(String accent_uk_audio_uri) {
        this.accent_uk_audio_uri = accent_uk_audio_uri;
        return this;
    }

    public void setAccent_uk_audio_uriIsSet(boolean value) {
        if (value) {
            return;
        }
        this.accent_uk_audio_uri = null;
    }

    public WordBasicInfo setAccent_usa(String accent_usa) {
        this.accent_usa = accent_usa;
        return this;
    }

    public void setAccent_usaIsSet(boolean value) {
        if (value) {
            return;
        }
        this.accent_usa = null;
    }

    public WordBasicInfo setAccent_usa_audio_uri(String accent_usa_audio_uri) {
        this.accent_usa_audio_uri = accent_usa_audio_uri;
        return this;
    }

    public void setAccent_usa_audio_uriIsSet(boolean value) {
        if (value) {
            return;
        }
        this.accent_usa_audio_uri = null;
    }

    public WordBasicInfo setDeformation_img_uri(String deformation_img_uri) {
        this.deformation_img_uri = deformation_img_uri;
        return this;
    }

    public void setDeformation_img_uriIsSet(boolean value) {
        if (value) {
            return;
        }
        this.deformation_img_uri = null;
    }

    public WordBasicInfo setEtyma(String etyma) {
        this.etyma = etyma;
        return this;
    }

    public void setEtymaIsSet(boolean value) {
        if (value) {
            return;
        }
        this.etyma = null;
    }

    public WordBasicInfo setTopic_id(int topic_id) {
        this.topic_id = topic_id;
        setTopic_idIsSet(true);
        return this;
    }

    public void setTopic_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public WordBasicInfo setWord(String word) {
        this.word = word;
        return this;
    }

    public void setWordIsSet(boolean value) {
        if (value) {
            return;
        }
        this.word = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("WordBasicInfo(");
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
        if (isSetAccent_usa()) {
            sb2.append(j2.O);
            sb2.append("accent_usa:");
            String str2 = this.accent_usa;
            if (str2 == null) {
                sb2.append("null");
            } else {
                sb2.append(str2);
            }
        }
        if (isSetAccent_uk()) {
            sb2.append(j2.O);
            sb2.append("accent_uk:");
            String str3 = this.accent_uk;
            if (str3 == null) {
                sb2.append("null");
            } else {
                sb2.append(str3);
            }
        }
        if (isSetAccent_usa_audio_uri()) {
            sb2.append(j2.O);
            sb2.append("accent_usa_audio_uri:");
            String str4 = this.accent_usa_audio_uri;
            if (str4 == null) {
                sb2.append("null");
            } else {
                sb2.append(str4);
            }
        }
        if (isSetAccent_uk_audio_uri()) {
            sb2.append(j2.O);
            sb2.append("accent_uk_audio_uri:");
            String str5 = this.accent_uk_audio_uri;
            if (str5 == null) {
                sb2.append("null");
            } else {
                sb2.append(str5);
            }
        }
        if (isSetDeformation_img_uri()) {
            sb2.append(j2.O);
            sb2.append("deformation_img_uri:");
            String str6 = this.deformation_img_uri;
            if (str6 == null) {
                sb2.append("null");
            } else {
                sb2.append(str6);
            }
        }
        if (isSetEtyma()) {
            sb2.append(j2.O);
            sb2.append("etyma:");
            String str7 = this.etyma;
            if (str7 == null) {
                sb2.append("null");
            } else {
                sb2.append(str7);
            }
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetAccent_uk() {
        this.accent_uk = null;
    }

    public void unsetAccent_uk_audio_uri() {
        this.accent_uk_audio_uri = null;
    }

    public void unsetAccent_usa() {
        this.accent_usa = null;
    }

    public void unsetAccent_usa_audio_uri() {
        this.accent_usa_audio_uri = null;
    }

    public void unsetDeformation_img_uri() {
        this.deformation_img_uri = null;
    }

    public void unsetEtyma() {
        this.etyma = null;
    }

    public void unsetTopic_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetWord() {
        this.word = null;
    }

    public void validate() throws TException {
        if (this.word != null) {
            return;
        }
        throw new TProtocolException("Required field 'word' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(WordBasicInfo other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        int compareTo5;
        int compareTo6;
        int compareTo7;
        int compareTo8;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo9 = Boolean.valueOf(isSetTopic_id()).compareTo(Boolean.valueOf(other.isSetTopic_id()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (isSetTopic_id() && (compareTo8 = TBaseHelper.compareTo(this.topic_id, other.topic_id)) != 0) {
            return compareTo8;
        }
        int compareTo10 = Boolean.valueOf(isSetWord()).compareTo(Boolean.valueOf(other.isSetWord()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (isSetWord() && (compareTo7 = TBaseHelper.compareTo(this.word, other.word)) != 0) {
            return compareTo7;
        }
        int compareTo11 = Boolean.valueOf(isSetAccent_usa()).compareTo(Boolean.valueOf(other.isSetAccent_usa()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (isSetAccent_usa() && (compareTo6 = TBaseHelper.compareTo(this.accent_usa, other.accent_usa)) != 0) {
            return compareTo6;
        }
        int compareTo12 = Boolean.valueOf(isSetAccent_uk()).compareTo(Boolean.valueOf(other.isSetAccent_uk()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (isSetAccent_uk() && (compareTo5 = TBaseHelper.compareTo(this.accent_uk, other.accent_uk)) != 0) {
            return compareTo5;
        }
        int compareTo13 = Boolean.valueOf(isSetAccent_usa_audio_uri()).compareTo(Boolean.valueOf(other.isSetAccent_usa_audio_uri()));
        if (compareTo13 != 0) {
            return compareTo13;
        }
        if (isSetAccent_usa_audio_uri() && (compareTo4 = TBaseHelper.compareTo(this.accent_usa_audio_uri, other.accent_usa_audio_uri)) != 0) {
            return compareTo4;
        }
        int compareTo14 = Boolean.valueOf(isSetAccent_uk_audio_uri()).compareTo(Boolean.valueOf(other.isSetAccent_uk_audio_uri()));
        if (compareTo14 != 0) {
            return compareTo14;
        }
        if (isSetAccent_uk_audio_uri() && (compareTo3 = TBaseHelper.compareTo(this.accent_uk_audio_uri, other.accent_uk_audio_uri)) != 0) {
            return compareTo3;
        }
        int compareTo15 = Boolean.valueOf(isSetDeformation_img_uri()).compareTo(Boolean.valueOf(other.isSetDeformation_img_uri()));
        if (compareTo15 != 0) {
            return compareTo15;
        }
        if (isSetDeformation_img_uri() && (compareTo2 = TBaseHelper.compareTo(this.deformation_img_uri, other.deformation_img_uri)) != 0) {
            return compareTo2;
        }
        int compareTo16 = Boolean.valueOf(isSetEtyma()).compareTo(Boolean.valueOf(other.isSetEtyma()));
        if (compareTo16 != 0) {
            return compareTo16;
        }
        if (!isSetEtyma() || (compareTo = TBaseHelper.compareTo(this.etyma, other.etyma)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<WordBasicInfo, _Fields> deepCopy2() {
        return new WordBasicInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$WordBasicInfo$_Fields[field.ordinal()]) {
            case 1:
                return Integer.valueOf(getTopic_id());
            case 2:
                return getWord();
            case 3:
                return getAccent_usa();
            case 4:
                return getAccent_uk();
            case 5:
                return getAccent_usa_audio_uri();
            case 6:
                return getAccent_uk_audio_uri();
            case 7:
                return getDeformation_img_uri();
            case 8:
                return getEtyma();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$WordBasicInfo$_Fields[field.ordinal()]) {
            case 1:
                return isSetTopic_id();
            case 2:
                return isSetWord();
            case 3:
                return isSetAccent_usa();
            case 4:
                return isSetAccent_uk();
            case 5:
                return isSetAccent_usa_audio_uri();
            case 6:
                return isSetAccent_uk_audio_uri();
            case 7:
                return isSetDeformation_img_uri();
            case 8:
                return isSetEtyma();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$WordBasicInfo$_Fields[field.ordinal()]) {
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
                    setAccent_usa((String) value);
                    break;
                } else {
                    unsetAccent_usa();
                    break;
                }
            case 4:
                if (value != null) {
                    setAccent_uk((String) value);
                    break;
                } else {
                    unsetAccent_uk();
                    break;
                }
            case 5:
                if (value != null) {
                    setAccent_usa_audio_uri((String) value);
                    break;
                } else {
                    unsetAccent_usa_audio_uri();
                    break;
                }
            case 6:
                if (value != null) {
                    setAccent_uk_audio_uri((String) value);
                    break;
                } else {
                    unsetAccent_uk_audio_uri();
                    break;
                }
            case 7:
                if (value != null) {
                    setDeformation_img_uri((String) value);
                    break;
                } else {
                    unsetDeformation_img_uri();
                    break;
                }
            case 8:
                if (value != null) {
                    setEtyma((String) value);
                    break;
                } else {
                    unsetEtyma();
                    break;
                }
        }
    }

    public boolean equals(WordBasicInfo that) {
        if (that == null || this.topic_id != that.topic_id) {
            return false;
        }
        boolean isSetWord = isSetWord();
        boolean isSetWord2 = that.isSetWord();
        if ((isSetWord || isSetWord2) && !(isSetWord && isSetWord2 && this.word.equals(that.word))) {
            return false;
        }
        boolean isSetAccent_usa = isSetAccent_usa();
        boolean isSetAccent_usa2 = that.isSetAccent_usa();
        if ((isSetAccent_usa || isSetAccent_usa2) && !(isSetAccent_usa && isSetAccent_usa2 && this.accent_usa.equals(that.accent_usa))) {
            return false;
        }
        boolean isSetAccent_uk = isSetAccent_uk();
        boolean isSetAccent_uk2 = that.isSetAccent_uk();
        if ((isSetAccent_uk || isSetAccent_uk2) && !(isSetAccent_uk && isSetAccent_uk2 && this.accent_uk.equals(that.accent_uk))) {
            return false;
        }
        boolean isSetAccent_usa_audio_uri = isSetAccent_usa_audio_uri();
        boolean isSetAccent_usa_audio_uri2 = that.isSetAccent_usa_audio_uri();
        if ((isSetAccent_usa_audio_uri || isSetAccent_usa_audio_uri2) && !(isSetAccent_usa_audio_uri && isSetAccent_usa_audio_uri2 && this.accent_usa_audio_uri.equals(that.accent_usa_audio_uri))) {
            return false;
        }
        boolean isSetAccent_uk_audio_uri = isSetAccent_uk_audio_uri();
        boolean isSetAccent_uk_audio_uri2 = that.isSetAccent_uk_audio_uri();
        if ((isSetAccent_uk_audio_uri || isSetAccent_uk_audio_uri2) && !(isSetAccent_uk_audio_uri && isSetAccent_uk_audio_uri2 && this.accent_uk_audio_uri.equals(that.accent_uk_audio_uri))) {
            return false;
        }
        boolean isSetDeformation_img_uri = isSetDeformation_img_uri();
        boolean isSetDeformation_img_uri2 = that.isSetDeformation_img_uri();
        if ((isSetDeformation_img_uri || isSetDeformation_img_uri2) && !(isSetDeformation_img_uri && isSetDeformation_img_uri2 && this.deformation_img_uri.equals(that.deformation_img_uri))) {
            return false;
        }
        boolean isSetEtyma = isSetEtyma();
        boolean isSetEtyma2 = that.isSetEtyma();
        if (isSetEtyma || isSetEtyma2) {
            return isSetEtyma && isSetEtyma2 && this.etyma.equals(that.etyma);
        }
        return true;
    }

    public WordBasicInfo(int topic_id, String word) {
        this();
        this.topic_id = topic_id;
        setTopic_idIsSet(true);
        this.word = word;
    }

    public WordBasicInfo(WordBasicInfo other) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.ACCENT_USA, _Fields.ACCENT_UK, _Fields.ACCENT_USA_AUDIO_URI, _Fields.ACCENT_UK_AUDIO_URI, _Fields.DEFORMATION_IMG_URI, _Fields.ETYMA};
        this.__isset_bitfield = other.__isset_bitfield;
        this.topic_id = other.topic_id;
        if (other.isSetWord()) {
            this.word = other.word;
        }
        if (other.isSetAccent_usa()) {
            this.accent_usa = other.accent_usa;
        }
        if (other.isSetAccent_uk()) {
            this.accent_uk = other.accent_uk;
        }
        if (other.isSetAccent_usa_audio_uri()) {
            this.accent_usa_audio_uri = other.accent_usa_audio_uri;
        }
        if (other.isSetAccent_uk_audio_uri()) {
            this.accent_uk_audio_uri = other.accent_uk_audio_uri;
        }
        if (other.isSetDeformation_img_uri()) {
            this.deformation_img_uri = other.deformation_img_uri;
        }
        if (other.isSetEtyma()) {
            this.etyma = other.etyma;
        }
    }
}

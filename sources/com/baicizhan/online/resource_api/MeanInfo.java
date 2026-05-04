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
public class MeanInfo implements TBase<MeanInfo, _Fields>, Serializable, Cloneable, Comparable<MeanInfo> {
    private static final int __ID_ISSET_ID = 0;
    private static final int __TOPIC_ID_ISSET_ID = 1;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public String accent_uk;
    public String accent_uk_audio_uri;
    public String accent_usa;
    public String accent_usa_audio_uri;

    /* renamed from: id, reason: collision with root package name */
    public long f28159id;
    public String mean;
    public String mean_type;
    private _Fields[] optionals;
    public int topic_id;
    private static final TStruct STRUCT_DESC = new TStruct("MeanInfo");
    private static final TField ID_FIELD_DESC = new TField("id", (byte) 10, 1);
    private static final TField TOPIC_ID_FIELD_DESC = new TField("topic_id", (byte) 8, 2);
    private static final TField MEAN_TYPE_FIELD_DESC = new TField("mean_type", (byte) 11, 3);
    private static final TField MEAN_FIELD_DESC = new TField(com.baicizhan.main.wikiv2.studyv2.data.t.f26099a, (byte) 11, 4);
    private static final TField ACCENT_USA_FIELD_DESC = new TField("accent_usa", (byte) 11, 5);
    private static final TField ACCENT_UK_FIELD_DESC = new TField("accent_uk", (byte) 11, 6);
    private static final TField ACCENT_USA_AUDIO_URI_FIELD_DESC = new TField("accent_usa_audio_uri", (byte) 11, 7);
    private static final TField ACCENT_UK_AUDIO_URI_FIELD_DESC = new TField("accent_uk_audio_uri", (byte) 11, 8);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.resource_api.MeanInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$resource_api$MeanInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$resource_api$MeanInfo$_Fields = iArr;
            try {
                iArr[_Fields.ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$MeanInfo$_Fields[_Fields.TOPIC_ID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$MeanInfo$_Fields[_Fields.MEAN_TYPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$MeanInfo$_Fields[_Fields.MEAN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$MeanInfo$_Fields[_Fields.ACCENT_USA.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$MeanInfo$_Fields[_Fields.ACCENT_UK.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$MeanInfo$_Fields[_Fields.ACCENT_USA_AUDIO_URI.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$MeanInfo$_Fields[_Fields.ACCENT_UK_AUDIO_URI.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class MeanInfoStandardScheme extends StandardScheme<MeanInfo> {
        private MeanInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, MeanInfo struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    iprot.readStructEnd();
                    if (!struct.isSetId()) {
                        throw new TProtocolException("Required field 'id' was not found in serialized data! Struct: " + toString());
                    }
                    if (struct.isSetTopic_id()) {
                        struct.validate();
                        return;
                    }
                    throw new TProtocolException("Required field 'topic_id' was not found in serialized data! Struct: " + toString());
                }
                switch (readFieldBegin.f77768id) {
                    case 1:
                        if (b11 != 10) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.f28159id = iprot.readI64();
                            struct.setIdIsSet(true);
                            break;
                        }
                    case 2:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.topic_id = iprot.readI32();
                            struct.setTopic_idIsSet(true);
                            break;
                        }
                    case 3:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.mean_type = iprot.readString();
                            struct.setMean_typeIsSet(true);
                            break;
                        }
                    case 4:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.mean = iprot.readString();
                            struct.setMeanIsSet(true);
                            break;
                        }
                    case 5:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.accent_usa = iprot.readString();
                            struct.setAccent_usaIsSet(true);
                            break;
                        }
                    case 6:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.accent_uk = iprot.readString();
                            struct.setAccent_ukIsSet(true);
                            break;
                        }
                    case 7:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.accent_usa_audio_uri = iprot.readString();
                            struct.setAccent_usa_audio_uriIsSet(true);
                            break;
                        }
                    case 8:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.accent_uk_audio_uri = iprot.readString();
                            struct.setAccent_uk_audio_uriIsSet(true);
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
        public void write(TProtocol oprot, MeanInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(MeanInfo.STRUCT_DESC);
            oprot.writeFieldBegin(MeanInfo.ID_FIELD_DESC);
            oprot.writeI64(struct.f28159id);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(MeanInfo.TOPIC_ID_FIELD_DESC);
            oprot.writeI32(struct.topic_id);
            oprot.writeFieldEnd();
            if (struct.mean_type != null) {
                oprot.writeFieldBegin(MeanInfo.MEAN_TYPE_FIELD_DESC);
                oprot.writeString(struct.mean_type);
                oprot.writeFieldEnd();
            }
            if (struct.mean != null) {
                oprot.writeFieldBegin(MeanInfo.MEAN_FIELD_DESC);
                oprot.writeString(struct.mean);
                oprot.writeFieldEnd();
            }
            if (struct.accent_usa != null && struct.isSetAccent_usa()) {
                oprot.writeFieldBegin(MeanInfo.ACCENT_USA_FIELD_DESC);
                oprot.writeString(struct.accent_usa);
                oprot.writeFieldEnd();
            }
            if (struct.accent_uk != null && struct.isSetAccent_uk()) {
                oprot.writeFieldBegin(MeanInfo.ACCENT_UK_FIELD_DESC);
                oprot.writeString(struct.accent_uk);
                oprot.writeFieldEnd();
            }
            if (struct.accent_usa_audio_uri != null && struct.isSetAccent_usa_audio_uri()) {
                oprot.writeFieldBegin(MeanInfo.ACCENT_USA_AUDIO_URI_FIELD_DESC);
                oprot.writeString(struct.accent_usa_audio_uri);
                oprot.writeFieldEnd();
            }
            if (struct.accent_uk_audio_uri != null && struct.isSetAccent_uk_audio_uri()) {
                oprot.writeFieldBegin(MeanInfo.ACCENT_UK_AUDIO_URI_FIELD_DESC);
                oprot.writeString(struct.accent_uk_audio_uri);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class MeanInfoStandardSchemeFactory implements SchemeFactory {
        private MeanInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public MeanInfoStandardScheme getScheme() {
            return new MeanInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class MeanInfoTupleScheme extends TupleScheme<MeanInfo> {
        private MeanInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, MeanInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.f28159id = tTupleProtocol.readI64();
            struct.setIdIsSet(true);
            struct.topic_id = tTupleProtocol.readI32();
            struct.setTopic_idIsSet(true);
            struct.mean_type = tTupleProtocol.readString();
            struct.setMean_typeIsSet(true);
            struct.mean = tTupleProtocol.readString();
            struct.setMeanIsSet(true);
            BitSet readBitSet = tTupleProtocol.readBitSet(4);
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
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, MeanInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI64(struct.f28159id);
            tTupleProtocol.writeI32(struct.topic_id);
            tTupleProtocol.writeString(struct.mean_type);
            tTupleProtocol.writeString(struct.mean);
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
            tTupleProtocol.writeBitSet(bitSet, 4);
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
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class MeanInfoTupleSchemeFactory implements SchemeFactory {
        private MeanInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public MeanInfoTupleScheme getScheme() {
            return new MeanInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        ID(1, "id"),
        TOPIC_ID(2, "topic_id"),
        MEAN_TYPE(3, "mean_type"),
        MEAN(4, com.baicizhan.main.wikiv2.studyv2.data.t.f26099a),
        ACCENT_USA(5, "accent_usa"),
        ACCENT_UK(6, "accent_uk"),
        ACCENT_USA_AUDIO_URI(7, "accent_usa_audio_uri"),
        ACCENT_UK_AUDIO_URI(8, "accent_uk_audio_uri");

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
                    return ID;
                case 2:
                    return TOPIC_ID;
                case 3:
                    return MEAN_TYPE;
                case 4:
                    return MEAN;
                case 5:
                    return ACCENT_USA;
                case 6:
                    return ACCENT_UK;
                case 7:
                    return ACCENT_USA_AUDIO_URI;
                case 8:
                    return ACCENT_UK_AUDIO_URI;
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
        hashMap.put(StandardScheme.class, new MeanInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new MeanInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.ID, (_Fields) new FieldMetaData("id", (byte) 1, new FieldValueMetaData((byte) 10)));
        enumMap.put((EnumMap) _Fields.TOPIC_ID, (_Fields) new FieldMetaData("topic_id", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.MEAN_TYPE, (_Fields) new FieldMetaData("mean_type", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.MEAN, (_Fields) new FieldMetaData(com.baicizhan.main.wikiv2.studyv2.data.t.f26099a, (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.ACCENT_USA, (_Fields) new FieldMetaData("accent_usa", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.ACCENT_UK, (_Fields) new FieldMetaData("accent_uk", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.ACCENT_USA_AUDIO_URI, (_Fields) new FieldMetaData("accent_usa_audio_uri", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.ACCENT_UK_AUDIO_URI, (_Fields) new FieldMetaData("accent_uk_audio_uri", (byte) 2, new FieldValueMetaData((byte) 11)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(MeanInfo.class, unmodifiableMap);
    }

    public MeanInfo() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.ACCENT_USA, _Fields.ACCENT_UK, _Fields.ACCENT_USA_AUDIO_URI, _Fields.ACCENT_UK_AUDIO_URI};
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
        setIdIsSet(false);
        this.f28159id = 0L;
        setTopic_idIsSet(false);
        this.topic_id = 0;
        this.mean_type = null;
        this.mean = null;
        this.accent_usa = null;
        this.accent_uk = null;
        this.accent_usa_audio_uri = null;
        this.accent_uk_audio_uri = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof MeanInfo)) {
            return equals((MeanInfo) that);
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

    public long getId() {
        return this.f28159id;
    }

    public String getMean() {
        return this.mean;
    }

    public String getMean_type() {
        return this.mean_type;
    }

    public int getTopic_id() {
        return this.topic_id;
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

    public boolean isSetId() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetMean() {
        return this.mean != null;
    }

    public boolean isSetMean_type() {
        return this.mean_type != null;
    }

    public boolean isSetTopic_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public MeanInfo setAccent_uk(String accent_uk) {
        this.accent_uk = accent_uk;
        return this;
    }

    public void setAccent_ukIsSet(boolean value) {
        if (value) {
            return;
        }
        this.accent_uk = null;
    }

    public MeanInfo setAccent_uk_audio_uri(String accent_uk_audio_uri) {
        this.accent_uk_audio_uri = accent_uk_audio_uri;
        return this;
    }

    public void setAccent_uk_audio_uriIsSet(boolean value) {
        if (value) {
            return;
        }
        this.accent_uk_audio_uri = null;
    }

    public MeanInfo setAccent_usa(String accent_usa) {
        this.accent_usa = accent_usa;
        return this;
    }

    public void setAccent_usaIsSet(boolean value) {
        if (value) {
            return;
        }
        this.accent_usa = null;
    }

    public MeanInfo setAccent_usa_audio_uri(String accent_usa_audio_uri) {
        this.accent_usa_audio_uri = accent_usa_audio_uri;
        return this;
    }

    public void setAccent_usa_audio_uriIsSet(boolean value) {
        if (value) {
            return;
        }
        this.accent_usa_audio_uri = null;
    }

    public MeanInfo setId(long id2) {
        this.f28159id = id2;
        setIdIsSet(true);
        return this;
    }

    public void setIdIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public MeanInfo setMean(String mean) {
        this.mean = mean;
        return this;
    }

    public void setMeanIsSet(boolean value) {
        if (value) {
            return;
        }
        this.mean = null;
    }

    public MeanInfo setMean_type(String mean_type) {
        this.mean_type = mean_type;
        return this;
    }

    public void setMean_typeIsSet(boolean value) {
        if (value) {
            return;
        }
        this.mean_type = null;
    }

    public MeanInfo setTopic_id(int topic_id) {
        this.topic_id = topic_id;
        setTopic_idIsSet(true);
        return this;
    }

    public void setTopic_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("MeanInfo(");
        sb2.append("id:");
        sb2.append(this.f28159id);
        sb2.append(j2.O);
        sb2.append("topic_id:");
        sb2.append(this.topic_id);
        sb2.append(j2.O);
        sb2.append("mean_type:");
        String str = this.mean_type;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(j2.O);
        sb2.append("mean:");
        String str2 = this.mean;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(str2);
        }
        if (isSetAccent_usa()) {
            sb2.append(j2.O);
            sb2.append("accent_usa:");
            String str3 = this.accent_usa;
            if (str3 == null) {
                sb2.append("null");
            } else {
                sb2.append(str3);
            }
        }
        if (isSetAccent_uk()) {
            sb2.append(j2.O);
            sb2.append("accent_uk:");
            String str4 = this.accent_uk;
            if (str4 == null) {
                sb2.append("null");
            } else {
                sb2.append(str4);
            }
        }
        if (isSetAccent_usa_audio_uri()) {
            sb2.append(j2.O);
            sb2.append("accent_usa_audio_uri:");
            String str5 = this.accent_usa_audio_uri;
            if (str5 == null) {
                sb2.append("null");
            } else {
                sb2.append(str5);
            }
        }
        if (isSetAccent_uk_audio_uri()) {
            sb2.append(j2.O);
            sb2.append("accent_uk_audio_uri:");
            String str6 = this.accent_uk_audio_uri;
            if (str6 == null) {
                sb2.append("null");
            } else {
                sb2.append(str6);
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

    public void unsetId() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetMean() {
        this.mean = null;
    }

    public void unsetMean_type() {
        this.mean_type = null;
    }

    public void unsetTopic_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void validate() throws TException {
        if (this.mean_type == null) {
            throw new TProtocolException("Required field 'mean_type' was not present! Struct: " + toString());
        }
        if (this.mean != null) {
            return;
        }
        throw new TProtocolException("Required field 'mean' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(MeanInfo other) {
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
        int compareTo9 = Boolean.valueOf(isSetId()).compareTo(Boolean.valueOf(other.isSetId()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (isSetId() && (compareTo8 = TBaseHelper.compareTo(this.f28159id, other.f28159id)) != 0) {
            return compareTo8;
        }
        int compareTo10 = Boolean.valueOf(isSetTopic_id()).compareTo(Boolean.valueOf(other.isSetTopic_id()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (isSetTopic_id() && (compareTo7 = TBaseHelper.compareTo(this.topic_id, other.topic_id)) != 0) {
            return compareTo7;
        }
        int compareTo11 = Boolean.valueOf(isSetMean_type()).compareTo(Boolean.valueOf(other.isSetMean_type()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (isSetMean_type() && (compareTo6 = TBaseHelper.compareTo(this.mean_type, other.mean_type)) != 0) {
            return compareTo6;
        }
        int compareTo12 = Boolean.valueOf(isSetMean()).compareTo(Boolean.valueOf(other.isSetMean()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (isSetMean() && (compareTo5 = TBaseHelper.compareTo(this.mean, other.mean)) != 0) {
            return compareTo5;
        }
        int compareTo13 = Boolean.valueOf(isSetAccent_usa()).compareTo(Boolean.valueOf(other.isSetAccent_usa()));
        if (compareTo13 != 0) {
            return compareTo13;
        }
        if (isSetAccent_usa() && (compareTo4 = TBaseHelper.compareTo(this.accent_usa, other.accent_usa)) != 0) {
            return compareTo4;
        }
        int compareTo14 = Boolean.valueOf(isSetAccent_uk()).compareTo(Boolean.valueOf(other.isSetAccent_uk()));
        if (compareTo14 != 0) {
            return compareTo14;
        }
        if (isSetAccent_uk() && (compareTo3 = TBaseHelper.compareTo(this.accent_uk, other.accent_uk)) != 0) {
            return compareTo3;
        }
        int compareTo15 = Boolean.valueOf(isSetAccent_usa_audio_uri()).compareTo(Boolean.valueOf(other.isSetAccent_usa_audio_uri()));
        if (compareTo15 != 0) {
            return compareTo15;
        }
        if (isSetAccent_usa_audio_uri() && (compareTo2 = TBaseHelper.compareTo(this.accent_usa_audio_uri, other.accent_usa_audio_uri)) != 0) {
            return compareTo2;
        }
        int compareTo16 = Boolean.valueOf(isSetAccent_uk_audio_uri()).compareTo(Boolean.valueOf(other.isSetAccent_uk_audio_uri()));
        if (compareTo16 != 0) {
            return compareTo16;
        }
        if (!isSetAccent_uk_audio_uri() || (compareTo = TBaseHelper.compareTo(this.accent_uk_audio_uri, other.accent_uk_audio_uri)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<MeanInfo, _Fields> deepCopy2() {
        return new MeanInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$MeanInfo$_Fields[field.ordinal()]) {
            case 1:
                return Long.valueOf(getId());
            case 2:
                return Integer.valueOf(getTopic_id());
            case 3:
                return getMean_type();
            case 4:
                return getMean();
            case 5:
                return getAccent_usa();
            case 6:
                return getAccent_uk();
            case 7:
                return getAccent_usa_audio_uri();
            case 8:
                return getAccent_uk_audio_uri();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$MeanInfo$_Fields[field.ordinal()]) {
            case 1:
                return isSetId();
            case 2:
                return isSetTopic_id();
            case 3:
                return isSetMean_type();
            case 4:
                return isSetMean();
            case 5:
                return isSetAccent_usa();
            case 6:
                return isSetAccent_uk();
            case 7:
                return isSetAccent_usa_audio_uri();
            case 8:
                return isSetAccent_uk_audio_uri();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$MeanInfo$_Fields[field.ordinal()]) {
            case 1:
                if (value != null) {
                    setId(((Long) value).longValue());
                    break;
                } else {
                    unsetId();
                    break;
                }
            case 2:
                if (value != null) {
                    setTopic_id(((Integer) value).intValue());
                    break;
                } else {
                    unsetTopic_id();
                    break;
                }
            case 3:
                if (value != null) {
                    setMean_type((String) value);
                    break;
                } else {
                    unsetMean_type();
                    break;
                }
            case 4:
                if (value != null) {
                    setMean((String) value);
                    break;
                } else {
                    unsetMean();
                    break;
                }
            case 5:
                if (value != null) {
                    setAccent_usa((String) value);
                    break;
                } else {
                    unsetAccent_usa();
                    break;
                }
            case 6:
                if (value != null) {
                    setAccent_uk((String) value);
                    break;
                } else {
                    unsetAccent_uk();
                    break;
                }
            case 7:
                if (value != null) {
                    setAccent_usa_audio_uri((String) value);
                    break;
                } else {
                    unsetAccent_usa_audio_uri();
                    break;
                }
            case 8:
                if (value != null) {
                    setAccent_uk_audio_uri((String) value);
                    break;
                } else {
                    unsetAccent_uk_audio_uri();
                    break;
                }
        }
    }

    public boolean equals(MeanInfo that) {
        if (that == null || this.f28159id != that.f28159id || this.topic_id != that.topic_id) {
            return false;
        }
        boolean isSetMean_type = isSetMean_type();
        boolean isSetMean_type2 = that.isSetMean_type();
        if ((isSetMean_type || isSetMean_type2) && !(isSetMean_type && isSetMean_type2 && this.mean_type.equals(that.mean_type))) {
            return false;
        }
        boolean isSetMean = isSetMean();
        boolean isSetMean2 = that.isSetMean();
        if ((isSetMean || isSetMean2) && !(isSetMean && isSetMean2 && this.mean.equals(that.mean))) {
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
        if (isSetAccent_uk_audio_uri || isSetAccent_uk_audio_uri2) {
            return isSetAccent_uk_audio_uri && isSetAccent_uk_audio_uri2 && this.accent_uk_audio_uri.equals(that.accent_uk_audio_uri);
        }
        return true;
    }

    public MeanInfo(long id2, int topic_id, String mean_type, String mean) {
        this();
        this.f28159id = id2;
        setIdIsSet(true);
        this.topic_id = topic_id;
        setTopic_idIsSet(true);
        this.mean_type = mean_type;
        this.mean = mean;
    }

    public MeanInfo(MeanInfo other) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.ACCENT_USA, _Fields.ACCENT_UK, _Fields.ACCENT_USA_AUDIO_URI, _Fields.ACCENT_UK_AUDIO_URI};
        this.__isset_bitfield = other.__isset_bitfield;
        this.f28159id = other.f28159id;
        this.topic_id = other.topic_id;
        if (other.isSetMean_type()) {
            this.mean_type = other.mean_type;
        }
        if (other.isSetMean()) {
            this.mean = other.mean;
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
    }
}

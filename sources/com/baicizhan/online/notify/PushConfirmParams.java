package com.baicizhan.online.notify;

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
import kc.o;
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
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class PushConfirmParams implements TBase<PushConfirmParams, _Fields>, Serializable, Cloneable, Comparable<PushConfirmParams> {
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    public String channel;
    public String hint;
    public String manufacturer;
    public String message_id;
    public String model;
    private _Fields[] optionals;
    private static final TStruct STRUCT_DESC = new TStruct("PushConfirmParams");
    private static final TField CHANNEL_FIELD_DESC = new TField("channel", (byte) 11, 1);
    private static final TField MESSAGE_ID_FIELD_DESC = new TField("message_id", (byte) 11, 2);
    private static final TField MODEL_FIELD_DESC = new TField("model", (byte) 11, 3);
    private static final TField MANUFACTURER_FIELD_DESC = new TField("manufacturer", (byte) 11, 4);
    private static final TField HINT_FIELD_DESC = new TField(o.L, (byte) 11, 5);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.notify.PushConfirmParams$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$notify$PushConfirmParams$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$notify$PushConfirmParams$_Fields = iArr;
            try {
                iArr[_Fields.CHANNEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$notify$PushConfirmParams$_Fields[_Fields.MESSAGE_ID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$notify$PushConfirmParams$_Fields[_Fields.MODEL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$notify$PushConfirmParams$_Fields[_Fields.MANUFACTURER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$notify$PushConfirmParams$_Fields[_Fields.HINT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class PushConfirmParamsStandardScheme extends StandardScheme<PushConfirmParams> {
        private PushConfirmParamsStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, PushConfirmParams struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    iprot.readStructEnd();
                    struct.validate();
                    return;
                }
                short s11 = readFieldBegin.f77768id;
                if (s11 != 1) {
                    if (s11 != 2) {
                        if (s11 != 3) {
                            if (s11 != 4) {
                                if (s11 != 5) {
                                    TProtocolUtil.skip(iprot, b11);
                                } else if (b11 == 11) {
                                    struct.hint = iprot.readString();
                                    struct.setHintIsSet(true);
                                } else {
                                    TProtocolUtil.skip(iprot, b11);
                                }
                            } else if (b11 == 11) {
                                struct.manufacturer = iprot.readString();
                                struct.setManufacturerIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 11) {
                            struct.model = iprot.readString();
                            struct.setModelIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 11) {
                        struct.message_id = iprot.readString();
                        struct.setMessage_idIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 11) {
                    struct.channel = iprot.readString();
                    struct.setChannelIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, PushConfirmParams struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(PushConfirmParams.STRUCT_DESC);
            if (struct.channel != null) {
                oprot.writeFieldBegin(PushConfirmParams.CHANNEL_FIELD_DESC);
                oprot.writeString(struct.channel);
                oprot.writeFieldEnd();
            }
            if (struct.message_id != null) {
                oprot.writeFieldBegin(PushConfirmParams.MESSAGE_ID_FIELD_DESC);
                oprot.writeString(struct.message_id);
                oprot.writeFieldEnd();
            }
            if (struct.model != null) {
                oprot.writeFieldBegin(PushConfirmParams.MODEL_FIELD_DESC);
                oprot.writeString(struct.model);
                oprot.writeFieldEnd();
            }
            if (struct.manufacturer != null) {
                oprot.writeFieldBegin(PushConfirmParams.MANUFACTURER_FIELD_DESC);
                oprot.writeString(struct.manufacturer);
                oprot.writeFieldEnd();
            }
            if (struct.hint != null && struct.isSetHint()) {
                oprot.writeFieldBegin(PushConfirmParams.HINT_FIELD_DESC);
                oprot.writeString(struct.hint);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class PushConfirmParamsStandardSchemeFactory implements SchemeFactory {
        private PushConfirmParamsStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public PushConfirmParamsStandardScheme getScheme() {
            return new PushConfirmParamsStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class PushConfirmParamsTupleScheme extends TupleScheme<PushConfirmParams> {
        private PushConfirmParamsTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, PushConfirmParams struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.channel = tTupleProtocol.readString();
            struct.setChannelIsSet(true);
            struct.message_id = tTupleProtocol.readString();
            struct.setMessage_idIsSet(true);
            struct.model = tTupleProtocol.readString();
            struct.setModelIsSet(true);
            struct.manufacturer = tTupleProtocol.readString();
            struct.setManufacturerIsSet(true);
            if (tTupleProtocol.readBitSet(1).get(0)) {
                struct.hint = tTupleProtocol.readString();
                struct.setHintIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, PushConfirmParams struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeString(struct.channel);
            tTupleProtocol.writeString(struct.message_id);
            tTupleProtocol.writeString(struct.model);
            tTupleProtocol.writeString(struct.manufacturer);
            BitSet bitSet = new BitSet();
            if (struct.isSetHint()) {
                bitSet.set(0);
            }
            tTupleProtocol.writeBitSet(bitSet, 1);
            if (struct.isSetHint()) {
                tTupleProtocol.writeString(struct.hint);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class PushConfirmParamsTupleSchemeFactory implements SchemeFactory {
        private PushConfirmParamsTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public PushConfirmParamsTupleScheme getScheme() {
            return new PushConfirmParamsTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        CHANNEL(1, "channel"),
        MESSAGE_ID(2, "message_id"),
        MODEL(3, "model"),
        MANUFACTURER(4, "manufacturer"),
        HINT(5, o.L);

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
                return CHANNEL;
            }
            if (fieldId == 2) {
                return MESSAGE_ID;
            }
            if (fieldId == 3) {
                return MODEL;
            }
            if (fieldId == 4) {
                return MANUFACTURER;
            }
            if (fieldId != 5) {
                return null;
            }
            return HINT;
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
        hashMap.put(StandardScheme.class, new PushConfirmParamsStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new PushConfirmParamsTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.CHANNEL, (_Fields) new FieldMetaData("channel", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.MESSAGE_ID, (_Fields) new FieldMetaData("message_id", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.MODEL, (_Fields) new FieldMetaData("model", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.MANUFACTURER, (_Fields) new FieldMetaData("manufacturer", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.HINT, (_Fields) new FieldMetaData(o.L, (byte) 2, new FieldValueMetaData((byte) 11)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(PushConfirmParams.class, unmodifiableMap);
    }

    public PushConfirmParams() {
        this.optionals = new _Fields[]{_Fields.HINT};
    }

    private void readObject(ObjectInputStream in2) throws IOException, ClassNotFoundException {
        try {
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
        this.channel = null;
        this.message_id = null;
        this.model = null;
        this.manufacturer = null;
        this.hint = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof PushConfirmParams)) {
            return equals((PushConfirmParams) that);
        }
        return false;
    }

    public String getChannel() {
        return this.channel;
    }

    public String getHint() {
        return this.hint;
    }

    public String getManufacturer() {
        return this.manufacturer;
    }

    public String getMessage_id() {
        return this.message_id;
    }

    public String getModel() {
        return this.model;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetChannel() {
        return this.channel != null;
    }

    public boolean isSetHint() {
        return this.hint != null;
    }

    public boolean isSetManufacturer() {
        return this.manufacturer != null;
    }

    public boolean isSetMessage_id() {
        return this.message_id != null;
    }

    public boolean isSetModel() {
        return this.model != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public PushConfirmParams setChannel(String channel) {
        this.channel = channel;
        return this;
    }

    public void setChannelIsSet(boolean value) {
        if (value) {
            return;
        }
        this.channel = null;
    }

    public PushConfirmParams setHint(String hint) {
        this.hint = hint;
        return this;
    }

    public void setHintIsSet(boolean value) {
        if (value) {
            return;
        }
        this.hint = null;
    }

    public PushConfirmParams setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
        return this;
    }

    public void setManufacturerIsSet(boolean value) {
        if (value) {
            return;
        }
        this.manufacturer = null;
    }

    public PushConfirmParams setMessage_id(String message_id) {
        this.message_id = message_id;
        return this;
    }

    public void setMessage_idIsSet(boolean value) {
        if (value) {
            return;
        }
        this.message_id = null;
    }

    public PushConfirmParams setModel(String model) {
        this.model = model;
        return this;
    }

    public void setModelIsSet(boolean value) {
        if (value) {
            return;
        }
        this.model = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("PushConfirmParams(");
        sb2.append("channel:");
        String str = this.channel;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(j2.O);
        sb2.append("message_id:");
        String str2 = this.message_id;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(str2);
        }
        sb2.append(j2.O);
        sb2.append("model:");
        String str3 = this.model;
        if (str3 == null) {
            sb2.append("null");
        } else {
            sb2.append(str3);
        }
        sb2.append(j2.O);
        sb2.append("manufacturer:");
        String str4 = this.manufacturer;
        if (str4 == null) {
            sb2.append("null");
        } else {
            sb2.append(str4);
        }
        if (isSetHint()) {
            sb2.append(j2.O);
            sb2.append("hint:");
            String str5 = this.hint;
            if (str5 == null) {
                sb2.append("null");
            } else {
                sb2.append(str5);
            }
        }
        sb2.append(j.f81007d);
        return sb2.toString();
    }

    public void unsetChannel() {
        this.channel = null;
    }

    public void unsetHint() {
        this.hint = null;
    }

    public void unsetManufacturer() {
        this.manufacturer = null;
    }

    public void unsetMessage_id() {
        this.message_id = null;
    }

    public void unsetModel() {
        this.model = null;
    }

    public void validate() throws TException {
        if (this.channel == null) {
            throw new TProtocolException("Required field 'channel' was not present! Struct: " + toString());
        }
        if (this.message_id == null) {
            throw new TProtocolException("Required field 'message_id' was not present! Struct: " + toString());
        }
        if (this.model == null) {
            throw new TProtocolException("Required field 'model' was not present! Struct: " + toString());
        }
        if (this.manufacturer != null) {
            return;
        }
        throw new TProtocolException("Required field 'manufacturer' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(PushConfirmParams other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        int compareTo5;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo6 = Boolean.valueOf(isSetChannel()).compareTo(Boolean.valueOf(other.isSetChannel()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (isSetChannel() && (compareTo5 = TBaseHelper.compareTo(this.channel, other.channel)) != 0) {
            return compareTo5;
        }
        int compareTo7 = Boolean.valueOf(isSetMessage_id()).compareTo(Boolean.valueOf(other.isSetMessage_id()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (isSetMessage_id() && (compareTo4 = TBaseHelper.compareTo(this.message_id, other.message_id)) != 0) {
            return compareTo4;
        }
        int compareTo8 = Boolean.valueOf(isSetModel()).compareTo(Boolean.valueOf(other.isSetModel()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (isSetModel() && (compareTo3 = TBaseHelper.compareTo(this.model, other.model)) != 0) {
            return compareTo3;
        }
        int compareTo9 = Boolean.valueOf(isSetManufacturer()).compareTo(Boolean.valueOf(other.isSetManufacturer()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (isSetManufacturer() && (compareTo2 = TBaseHelper.compareTo(this.manufacturer, other.manufacturer)) != 0) {
            return compareTo2;
        }
        int compareTo10 = Boolean.valueOf(isSetHint()).compareTo(Boolean.valueOf(other.isSetHint()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (!isSetHint() || (compareTo = TBaseHelper.compareTo(this.hint, other.hint)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<PushConfirmParams, _Fields> deepCopy2() {
        return new PushConfirmParams(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$notify$PushConfirmParams$_Fields[field.ordinal()];
        if (i11 == 1) {
            return getChannel();
        }
        if (i11 == 2) {
            return getMessage_id();
        }
        if (i11 == 3) {
            return getModel();
        }
        if (i11 == 4) {
            return getManufacturer();
        }
        if (i11 == 5) {
            return getHint();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$notify$PushConfirmParams$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetChannel();
        }
        if (i11 == 2) {
            return isSetMessage_id();
        }
        if (i11 == 3) {
            return isSetModel();
        }
        if (i11 == 4) {
            return isSetManufacturer();
        }
        if (i11 == 5) {
            return isSetHint();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$notify$PushConfirmParams$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetChannel();
                return;
            } else {
                setChannel((String) value);
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetMessage_id();
                return;
            } else {
                setMessage_id((String) value);
                return;
            }
        }
        if (i11 == 3) {
            if (value == null) {
                unsetModel();
                return;
            } else {
                setModel((String) value);
                return;
            }
        }
        if (i11 == 4) {
            if (value == null) {
                unsetManufacturer();
                return;
            } else {
                setManufacturer((String) value);
                return;
            }
        }
        if (i11 != 5) {
            return;
        }
        if (value == null) {
            unsetHint();
        } else {
            setHint((String) value);
        }
    }

    public PushConfirmParams(String channel, String message_id, String model, String manufacturer) {
        this();
        this.channel = channel;
        this.message_id = message_id;
        this.model = model;
        this.manufacturer = manufacturer;
    }

    public boolean equals(PushConfirmParams that) {
        if (that == null) {
            return false;
        }
        boolean isSetChannel = isSetChannel();
        boolean isSetChannel2 = that.isSetChannel();
        if ((isSetChannel || isSetChannel2) && !(isSetChannel && isSetChannel2 && this.channel.equals(that.channel))) {
            return false;
        }
        boolean isSetMessage_id = isSetMessage_id();
        boolean isSetMessage_id2 = that.isSetMessage_id();
        if ((isSetMessage_id || isSetMessage_id2) && !(isSetMessage_id && isSetMessage_id2 && this.message_id.equals(that.message_id))) {
            return false;
        }
        boolean isSetModel = isSetModel();
        boolean isSetModel2 = that.isSetModel();
        if ((isSetModel || isSetModel2) && !(isSetModel && isSetModel2 && this.model.equals(that.model))) {
            return false;
        }
        boolean isSetManufacturer = isSetManufacturer();
        boolean isSetManufacturer2 = that.isSetManufacturer();
        if ((isSetManufacturer || isSetManufacturer2) && !(isSetManufacturer && isSetManufacturer2 && this.manufacturer.equals(that.manufacturer))) {
            return false;
        }
        boolean isSetHint = isSetHint();
        boolean isSetHint2 = that.isSetHint();
        if (isSetHint || isSetHint2) {
            return isSetHint && isSetHint2 && this.hint.equals(that.hint);
        }
        return true;
    }

    public PushConfirmParams(PushConfirmParams other) {
        this.optionals = new _Fields[]{_Fields.HINT};
        if (other.isSetChannel()) {
            this.channel = other.channel;
        }
        if (other.isSetMessage_id()) {
            this.message_id = other.message_id;
        }
        if (other.isSetModel()) {
            this.model = other.model;
        }
        if (other.isSetManufacturer()) {
            this.manufacturer = other.manufacturer;
        }
        if (other.isSetHint()) {
            this.hint = other.hint;
        }
    }
}

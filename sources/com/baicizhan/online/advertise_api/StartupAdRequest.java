package com.baicizhan.online.advertise_api;

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
public class StartupAdRequest implements TBase<StartupAdRequest, _Fields>, Serializable, Cloneable, Comparable<StartupAdRequest> {
    private static final int __SCREEN_LENGTH_ISSET_ID = 0;
    private static final int __SCREEN_WIDTH_ISSET_ID = 1;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public String android_id;
    public String oaid;
    private _Fields[] optionals;
    public int screen_length;
    public int screen_width;
    private static final TStruct STRUCT_DESC = new TStruct("StartupAdRequest");
    private static final TField SCREEN_LENGTH_FIELD_DESC = new TField("screen_length", (byte) 8, 1);
    private static final TField SCREEN_WIDTH_FIELD_DESC = new TField("screen_width", (byte) 8, 2);
    private static final TField ANDROID_ID_FIELD_DESC = new TField("android_id", (byte) 11, 3);
    private static final TField OAID_FIELD_DESC = new TField("oaid", (byte) 11, 4);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.advertise_api.StartupAdRequest$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$advertise_api$StartupAdRequest$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$advertise_api$StartupAdRequest$_Fields = iArr;
            try {
                iArr[_Fields.SCREEN_LENGTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$advertise_api$StartupAdRequest$_Fields[_Fields.SCREEN_WIDTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$advertise_api$StartupAdRequest$_Fields[_Fields.ANDROID_ID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$advertise_api$StartupAdRequest$_Fields[_Fields.OAID.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class StartupAdRequestStandardScheme extends StandardScheme<StartupAdRequest> {
        private StartupAdRequestStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, StartupAdRequest struct) throws TException {
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
                                TProtocolUtil.skip(iprot, b11);
                            } else if (b11 == 11) {
                                struct.oaid = iprot.readString();
                                struct.setOaidIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 11) {
                            struct.android_id = iprot.readString();
                            struct.setAndroid_idIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 8) {
                        struct.screen_width = iprot.readI32();
                        struct.setScreen_widthIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 8) {
                    struct.screen_length = iprot.readI32();
                    struct.setScreen_lengthIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, StartupAdRequest struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(StartupAdRequest.STRUCT_DESC);
            if (struct.isSetScreen_length()) {
                oprot.writeFieldBegin(StartupAdRequest.SCREEN_LENGTH_FIELD_DESC);
                oprot.writeI32(struct.screen_length);
                oprot.writeFieldEnd();
            }
            if (struct.isSetScreen_width()) {
                oprot.writeFieldBegin(StartupAdRequest.SCREEN_WIDTH_FIELD_DESC);
                oprot.writeI32(struct.screen_width);
                oprot.writeFieldEnd();
            }
            if (struct.android_id != null && struct.isSetAndroid_id()) {
                oprot.writeFieldBegin(StartupAdRequest.ANDROID_ID_FIELD_DESC);
                oprot.writeString(struct.android_id);
                oprot.writeFieldEnd();
            }
            if (struct.oaid != null && struct.isSetOaid()) {
                oprot.writeFieldBegin(StartupAdRequest.OAID_FIELD_DESC);
                oprot.writeString(struct.oaid);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class StartupAdRequestStandardSchemeFactory implements SchemeFactory {
        private StartupAdRequestStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public StartupAdRequestStandardScheme getScheme() {
            return new StartupAdRequestStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class StartupAdRequestTupleScheme extends TupleScheme<StartupAdRequest> {
        private StartupAdRequestTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, StartupAdRequest struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            BitSet readBitSet = tTupleProtocol.readBitSet(4);
            if (readBitSet.get(0)) {
                struct.screen_length = tTupleProtocol.readI32();
                struct.setScreen_lengthIsSet(true);
            }
            if (readBitSet.get(1)) {
                struct.screen_width = tTupleProtocol.readI32();
                struct.setScreen_widthIsSet(true);
            }
            if (readBitSet.get(2)) {
                struct.android_id = tTupleProtocol.readString();
                struct.setAndroid_idIsSet(true);
            }
            if (readBitSet.get(3)) {
                struct.oaid = tTupleProtocol.readString();
                struct.setOaidIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, StartupAdRequest struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            BitSet bitSet = new BitSet();
            if (struct.isSetScreen_length()) {
                bitSet.set(0);
            }
            if (struct.isSetScreen_width()) {
                bitSet.set(1);
            }
            if (struct.isSetAndroid_id()) {
                bitSet.set(2);
            }
            if (struct.isSetOaid()) {
                bitSet.set(3);
            }
            tTupleProtocol.writeBitSet(bitSet, 4);
            if (struct.isSetScreen_length()) {
                tTupleProtocol.writeI32(struct.screen_length);
            }
            if (struct.isSetScreen_width()) {
                tTupleProtocol.writeI32(struct.screen_width);
            }
            if (struct.isSetAndroid_id()) {
                tTupleProtocol.writeString(struct.android_id);
            }
            if (struct.isSetOaid()) {
                tTupleProtocol.writeString(struct.oaid);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class StartupAdRequestTupleSchemeFactory implements SchemeFactory {
        private StartupAdRequestTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public StartupAdRequestTupleScheme getScheme() {
            return new StartupAdRequestTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        SCREEN_LENGTH(1, "screen_length"),
        SCREEN_WIDTH(2, "screen_width"),
        ANDROID_ID(3, "android_id"),
        OAID(4, "oaid");

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
                return SCREEN_LENGTH;
            }
            if (fieldId == 2) {
                return SCREEN_WIDTH;
            }
            if (fieldId == 3) {
                return ANDROID_ID;
            }
            if (fieldId != 4) {
                return null;
            }
            return OAID;
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
        hashMap.put(StandardScheme.class, new StartupAdRequestStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new StartupAdRequestTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.SCREEN_LENGTH, (_Fields) new FieldMetaData("screen_length", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.SCREEN_WIDTH, (_Fields) new FieldMetaData("screen_width", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.ANDROID_ID, (_Fields) new FieldMetaData("android_id", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.OAID, (_Fields) new FieldMetaData("oaid", (byte) 2, new FieldValueMetaData((byte) 11)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(StartupAdRequest.class, unmodifiableMap);
    }

    public StartupAdRequest() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.SCREEN_LENGTH, _Fields.SCREEN_WIDTH, _Fields.ANDROID_ID, _Fields.OAID};
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
        setScreen_lengthIsSet(false);
        this.screen_length = 0;
        setScreen_widthIsSet(false);
        this.screen_width = 0;
        this.android_id = null;
        this.oaid = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof StartupAdRequest)) {
            return equals((StartupAdRequest) that);
        }
        return false;
    }

    public String getAndroid_id() {
        return this.android_id;
    }

    public String getOaid() {
        return this.oaid;
    }

    public int getScreen_length() {
        return this.screen_length;
    }

    public int getScreen_width() {
        return this.screen_width;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetAndroid_id() {
        return this.android_id != null;
    }

    public boolean isSetOaid() {
        return this.oaid != null;
    }

    public boolean isSetScreen_length() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetScreen_width() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public StartupAdRequest setAndroid_id(String android_id) {
        this.android_id = android_id;
        return this;
    }

    public void setAndroid_idIsSet(boolean value) {
        if (value) {
            return;
        }
        this.android_id = null;
    }

    public StartupAdRequest setOaid(String oaid) {
        this.oaid = oaid;
        return this;
    }

    public void setOaidIsSet(boolean value) {
        if (value) {
            return;
        }
        this.oaid = null;
    }

    public StartupAdRequest setScreen_length(int screen_length) {
        this.screen_length = screen_length;
        setScreen_lengthIsSet(true);
        return this;
    }

    public void setScreen_lengthIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public StartupAdRequest setScreen_width(int screen_width) {
        this.screen_width = screen_width;
        setScreen_widthIsSet(true);
        return this;
    }

    public void setScreen_widthIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public String toString() {
        boolean z11;
        StringBuilder sb2 = new StringBuilder("StartupAdRequest(");
        boolean z12 = false;
        if (isSetScreen_length()) {
            sb2.append("screen_length:");
            sb2.append(this.screen_length);
            z11 = false;
        } else {
            z11 = true;
        }
        if (isSetScreen_width()) {
            if (!z11) {
                sb2.append(j2.O);
            }
            sb2.append("screen_width:");
            sb2.append(this.screen_width);
            z11 = false;
        }
        if (isSetAndroid_id()) {
            if (!z11) {
                sb2.append(j2.O);
            }
            sb2.append("android_id:");
            String str = this.android_id;
            if (str == null) {
                sb2.append("null");
            } else {
                sb2.append(str);
            }
        } else {
            z12 = z11;
        }
        if (isSetOaid()) {
            if (!z12) {
                sb2.append(j2.O);
            }
            sb2.append("oaid:");
            String str2 = this.oaid;
            if (str2 == null) {
                sb2.append("null");
            } else {
                sb2.append(str2);
            }
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetAndroid_id() {
        this.android_id = null;
    }

    public void unsetOaid() {
        this.oaid = null;
    }

    public void unsetScreen_length() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetScreen_width() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(StartupAdRequest other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo5 = Boolean.valueOf(isSetScreen_length()).compareTo(Boolean.valueOf(other.isSetScreen_length()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (isSetScreen_length() && (compareTo4 = TBaseHelper.compareTo(this.screen_length, other.screen_length)) != 0) {
            return compareTo4;
        }
        int compareTo6 = Boolean.valueOf(isSetScreen_width()).compareTo(Boolean.valueOf(other.isSetScreen_width()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (isSetScreen_width() && (compareTo3 = TBaseHelper.compareTo(this.screen_width, other.screen_width)) != 0) {
            return compareTo3;
        }
        int compareTo7 = Boolean.valueOf(isSetAndroid_id()).compareTo(Boolean.valueOf(other.isSetAndroid_id()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (isSetAndroid_id() && (compareTo2 = TBaseHelper.compareTo(this.android_id, other.android_id)) != 0) {
            return compareTo2;
        }
        int compareTo8 = Boolean.valueOf(isSetOaid()).compareTo(Boolean.valueOf(other.isSetOaid()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (!isSetOaid() || (compareTo = TBaseHelper.compareTo(this.oaid, other.oaid)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<StartupAdRequest, _Fields> deepCopy2() {
        return new StartupAdRequest(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$advertise_api$StartupAdRequest$_Fields[field.ordinal()];
        if (i11 == 1) {
            return Integer.valueOf(getScreen_length());
        }
        if (i11 == 2) {
            return Integer.valueOf(getScreen_width());
        }
        if (i11 == 3) {
            return getAndroid_id();
        }
        if (i11 == 4) {
            return getOaid();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$advertise_api$StartupAdRequest$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetScreen_length();
        }
        if (i11 == 2) {
            return isSetScreen_width();
        }
        if (i11 == 3) {
            return isSetAndroid_id();
        }
        if (i11 == 4) {
            return isSetOaid();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$advertise_api$StartupAdRequest$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetScreen_length();
                return;
            } else {
                setScreen_length(((Integer) value).intValue());
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetScreen_width();
                return;
            } else {
                setScreen_width(((Integer) value).intValue());
                return;
            }
        }
        if (i11 == 3) {
            if (value == null) {
                unsetAndroid_id();
                return;
            } else {
                setAndroid_id((String) value);
                return;
            }
        }
        if (i11 != 4) {
            return;
        }
        if (value == null) {
            unsetOaid();
        } else {
            setOaid((String) value);
        }
    }

    public boolean equals(StartupAdRequest that) {
        if (that == null) {
            return false;
        }
        boolean isSetScreen_length = isSetScreen_length();
        boolean isSetScreen_length2 = that.isSetScreen_length();
        if ((isSetScreen_length || isSetScreen_length2) && !(isSetScreen_length && isSetScreen_length2 && this.screen_length == that.screen_length)) {
            return false;
        }
        boolean isSetScreen_width = isSetScreen_width();
        boolean isSetScreen_width2 = that.isSetScreen_width();
        if ((isSetScreen_width || isSetScreen_width2) && !(isSetScreen_width && isSetScreen_width2 && this.screen_width == that.screen_width)) {
            return false;
        }
        boolean isSetAndroid_id = isSetAndroid_id();
        boolean isSetAndroid_id2 = that.isSetAndroid_id();
        if ((isSetAndroid_id || isSetAndroid_id2) && !(isSetAndroid_id && isSetAndroid_id2 && this.android_id.equals(that.android_id))) {
            return false;
        }
        boolean isSetOaid = isSetOaid();
        boolean isSetOaid2 = that.isSetOaid();
        if (isSetOaid || isSetOaid2) {
            return isSetOaid && isSetOaid2 && this.oaid.equals(that.oaid);
        }
        return true;
    }

    public StartupAdRequest(StartupAdRequest other) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.SCREEN_LENGTH, _Fields.SCREEN_WIDTH, _Fields.ANDROID_ID, _Fields.OAID};
        this.__isset_bitfield = other.__isset_bitfield;
        this.screen_length = other.screen_length;
        this.screen_width = other.screen_width;
        if (other.isSetAndroid_id()) {
            this.android_id = other.android_id;
        }
        if (other.isSetOaid()) {
            this.oaid = other.oaid;
        }
    }

    public void validate() throws TException {
    }
}

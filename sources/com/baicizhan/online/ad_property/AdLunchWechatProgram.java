package com.baicizhan.online.ad_property;

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
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class AdLunchWechatProgram implements TBase<AdLunchWechatProgram, _Fields>, Serializable, Cloneable, Comparable<AdLunchWechatProgram> {
    private static final int __PROGRAM_TYPE_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public String bind_app;
    private _Fields[] optionals;
    public String program_id;
    public String program_path;
    public int program_type;
    private static final TStruct STRUCT_DESC = new TStruct("AdLunchWechatProgram");
    private static final TField PROGRAM_ID_FIELD_DESC = new TField("program_id", (byte) 11, 1);
    private static final TField PROGRAM_PATH_FIELD_DESC = new TField("program_path", (byte) 11, 2);
    private static final TField PROGRAM_TYPE_FIELD_DESC = new TField("program_type", (byte) 8, 3);
    private static final TField BIND_APP_FIELD_DESC = new TField("bind_app", (byte) 11, 4);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.ad_property.AdLunchWechatProgram$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$ad_property$AdLunchWechatProgram$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$ad_property$AdLunchWechatProgram$_Fields = iArr;
            try {
                iArr[_Fields.PROGRAM_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$ad_property$AdLunchWechatProgram$_Fields[_Fields.PROGRAM_PATH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$ad_property$AdLunchWechatProgram$_Fields[_Fields.PROGRAM_TYPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$ad_property$AdLunchWechatProgram$_Fields[_Fields.BIND_APP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AdLunchWechatProgramStandardScheme extends StandardScheme<AdLunchWechatProgram> {
        private AdLunchWechatProgramStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, AdLunchWechatProgram struct) throws TException {
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
                                struct.bind_app = iprot.readString();
                                struct.setBind_appIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 8) {
                            struct.program_type = iprot.readI32();
                            struct.setProgram_typeIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 11) {
                        struct.program_path = iprot.readString();
                        struct.setProgram_pathIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 11) {
                    struct.program_id = iprot.readString();
                    struct.setProgram_idIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, AdLunchWechatProgram struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(AdLunchWechatProgram.STRUCT_DESC);
            if (struct.program_id != null && struct.isSetProgram_id()) {
                oprot.writeFieldBegin(AdLunchWechatProgram.PROGRAM_ID_FIELD_DESC);
                oprot.writeString(struct.program_id);
                oprot.writeFieldEnd();
            }
            if (struct.program_path != null && struct.isSetProgram_path()) {
                oprot.writeFieldBegin(AdLunchWechatProgram.PROGRAM_PATH_FIELD_DESC);
                oprot.writeString(struct.program_path);
                oprot.writeFieldEnd();
            }
            if (struct.isSetProgram_type()) {
                oprot.writeFieldBegin(AdLunchWechatProgram.PROGRAM_TYPE_FIELD_DESC);
                oprot.writeI32(struct.program_type);
                oprot.writeFieldEnd();
            }
            if (struct.bind_app != null && struct.isSetBind_app()) {
                oprot.writeFieldBegin(AdLunchWechatProgram.BIND_APP_FIELD_DESC);
                oprot.writeString(struct.bind_app);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AdLunchWechatProgramStandardSchemeFactory implements SchemeFactory {
        private AdLunchWechatProgramStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public AdLunchWechatProgramStandardScheme getScheme() {
            return new AdLunchWechatProgramStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AdLunchWechatProgramTupleScheme extends TupleScheme<AdLunchWechatProgram> {
        private AdLunchWechatProgramTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, AdLunchWechatProgram struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            BitSet readBitSet = tTupleProtocol.readBitSet(4);
            if (readBitSet.get(0)) {
                struct.program_id = tTupleProtocol.readString();
                struct.setProgram_idIsSet(true);
            }
            if (readBitSet.get(1)) {
                struct.program_path = tTupleProtocol.readString();
                struct.setProgram_pathIsSet(true);
            }
            if (readBitSet.get(2)) {
                struct.program_type = tTupleProtocol.readI32();
                struct.setProgram_typeIsSet(true);
            }
            if (readBitSet.get(3)) {
                struct.bind_app = tTupleProtocol.readString();
                struct.setBind_appIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, AdLunchWechatProgram struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            BitSet bitSet = new BitSet();
            if (struct.isSetProgram_id()) {
                bitSet.set(0);
            }
            if (struct.isSetProgram_path()) {
                bitSet.set(1);
            }
            if (struct.isSetProgram_type()) {
                bitSet.set(2);
            }
            if (struct.isSetBind_app()) {
                bitSet.set(3);
            }
            tTupleProtocol.writeBitSet(bitSet, 4);
            if (struct.isSetProgram_id()) {
                tTupleProtocol.writeString(struct.program_id);
            }
            if (struct.isSetProgram_path()) {
                tTupleProtocol.writeString(struct.program_path);
            }
            if (struct.isSetProgram_type()) {
                tTupleProtocol.writeI32(struct.program_type);
            }
            if (struct.isSetBind_app()) {
                tTupleProtocol.writeString(struct.bind_app);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AdLunchWechatProgramTupleSchemeFactory implements SchemeFactory {
        private AdLunchWechatProgramTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public AdLunchWechatProgramTupleScheme getScheme() {
            return new AdLunchWechatProgramTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        PROGRAM_ID(1, "program_id"),
        PROGRAM_PATH(2, "program_path"),
        PROGRAM_TYPE(3, "program_type"),
        BIND_APP(4, "bind_app");

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
                return PROGRAM_ID;
            }
            if (fieldId == 2) {
                return PROGRAM_PATH;
            }
            if (fieldId == 3) {
                return PROGRAM_TYPE;
            }
            if (fieldId != 4) {
                return null;
            }
            return BIND_APP;
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
        hashMap.put(StandardScheme.class, new AdLunchWechatProgramStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new AdLunchWechatProgramTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.PROGRAM_ID, (_Fields) new FieldMetaData("program_id", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.PROGRAM_PATH, (_Fields) new FieldMetaData("program_path", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.PROGRAM_TYPE, (_Fields) new FieldMetaData("program_type", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.BIND_APP, (_Fields) new FieldMetaData("bind_app", (byte) 2, new FieldValueMetaData((byte) 11)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(AdLunchWechatProgram.class, unmodifiableMap);
    }

    public AdLunchWechatProgram() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.PROGRAM_ID, _Fields.PROGRAM_PATH, _Fields.PROGRAM_TYPE, _Fields.BIND_APP};
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
        this.program_id = null;
        this.program_path = null;
        setProgram_typeIsSet(false);
        this.program_type = 0;
        this.bind_app = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof AdLunchWechatProgram)) {
            return equals((AdLunchWechatProgram) that);
        }
        return false;
    }

    public String getBind_app() {
        return this.bind_app;
    }

    public String getProgram_id() {
        return this.program_id;
    }

    public String getProgram_path() {
        return this.program_path;
    }

    public int getProgram_type() {
        return this.program_type;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetBind_app() {
        return this.bind_app != null;
    }

    public boolean isSetProgram_id() {
        return this.program_id != null;
    }

    public boolean isSetProgram_path() {
        return this.program_path != null;
    }

    public boolean isSetProgram_type() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public AdLunchWechatProgram setBind_app(String bind_app) {
        this.bind_app = bind_app;
        return this;
    }

    public void setBind_appIsSet(boolean value) {
        if (value) {
            return;
        }
        this.bind_app = null;
    }

    public AdLunchWechatProgram setProgram_id(String program_id) {
        this.program_id = program_id;
        return this;
    }

    public void setProgram_idIsSet(boolean value) {
        if (value) {
            return;
        }
        this.program_id = null;
    }

    public AdLunchWechatProgram setProgram_path(String program_path) {
        this.program_path = program_path;
        return this;
    }

    public void setProgram_pathIsSet(boolean value) {
        if (value) {
            return;
        }
        this.program_path = null;
    }

    public AdLunchWechatProgram setProgram_type(int program_type) {
        this.program_type = program_type;
        setProgram_typeIsSet(true);
        return this;
    }

    public void setProgram_typeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public String toString() {
        boolean z11;
        StringBuilder sb2 = new StringBuilder("AdLunchWechatProgram(");
        boolean z12 = false;
        if (isSetProgram_id()) {
            sb2.append("program_id:");
            String str = this.program_id;
            if (str == null) {
                sb2.append("null");
            } else {
                sb2.append(str);
            }
            z11 = false;
        } else {
            z11 = true;
        }
        if (isSetProgram_path()) {
            if (!z11) {
                sb2.append(j2.O);
            }
            sb2.append("program_path:");
            String str2 = this.program_path;
            if (str2 == null) {
                sb2.append("null");
            } else {
                sb2.append(str2);
            }
            z11 = false;
        }
        if (isSetProgram_type()) {
            if (!z11) {
                sb2.append(j2.O);
            }
            sb2.append("program_type:");
            sb2.append(this.program_type);
        } else {
            z12 = z11;
        }
        if (isSetBind_app()) {
            if (!z12) {
                sb2.append(j2.O);
            }
            sb2.append("bind_app:");
            String str3 = this.bind_app;
            if (str3 == null) {
                sb2.append("null");
            } else {
                sb2.append(str3);
            }
        }
        sb2.append(j.f81007d);
        return sb2.toString();
    }

    public void unsetBind_app() {
        this.bind_app = null;
    }

    public void unsetProgram_id() {
        this.program_id = null;
    }

    public void unsetProgram_path() {
        this.program_path = null;
    }

    public void unsetProgram_type() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(AdLunchWechatProgram other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo5 = Boolean.valueOf(isSetProgram_id()).compareTo(Boolean.valueOf(other.isSetProgram_id()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (isSetProgram_id() && (compareTo4 = TBaseHelper.compareTo(this.program_id, other.program_id)) != 0) {
            return compareTo4;
        }
        int compareTo6 = Boolean.valueOf(isSetProgram_path()).compareTo(Boolean.valueOf(other.isSetProgram_path()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (isSetProgram_path() && (compareTo3 = TBaseHelper.compareTo(this.program_path, other.program_path)) != 0) {
            return compareTo3;
        }
        int compareTo7 = Boolean.valueOf(isSetProgram_type()).compareTo(Boolean.valueOf(other.isSetProgram_type()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (isSetProgram_type() && (compareTo2 = TBaseHelper.compareTo(this.program_type, other.program_type)) != 0) {
            return compareTo2;
        }
        int compareTo8 = Boolean.valueOf(isSetBind_app()).compareTo(Boolean.valueOf(other.isSetBind_app()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (!isSetBind_app() || (compareTo = TBaseHelper.compareTo(this.bind_app, other.bind_app)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<AdLunchWechatProgram, _Fields> deepCopy2() {
        return new AdLunchWechatProgram(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$ad_property$AdLunchWechatProgram$_Fields[field.ordinal()];
        if (i11 == 1) {
            return getProgram_id();
        }
        if (i11 == 2) {
            return getProgram_path();
        }
        if (i11 == 3) {
            return Integer.valueOf(getProgram_type());
        }
        if (i11 == 4) {
            return getBind_app();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$ad_property$AdLunchWechatProgram$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetProgram_id();
        }
        if (i11 == 2) {
            return isSetProgram_path();
        }
        if (i11 == 3) {
            return isSetProgram_type();
        }
        if (i11 == 4) {
            return isSetBind_app();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$ad_property$AdLunchWechatProgram$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetProgram_id();
                return;
            } else {
                setProgram_id((String) value);
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetProgram_path();
                return;
            } else {
                setProgram_path((String) value);
                return;
            }
        }
        if (i11 == 3) {
            if (value == null) {
                unsetProgram_type();
                return;
            } else {
                setProgram_type(((Integer) value).intValue());
                return;
            }
        }
        if (i11 != 4) {
            return;
        }
        if (value == null) {
            unsetBind_app();
        } else {
            setBind_app((String) value);
        }
    }

    public boolean equals(AdLunchWechatProgram that) {
        if (that == null) {
            return false;
        }
        boolean isSetProgram_id = isSetProgram_id();
        boolean isSetProgram_id2 = that.isSetProgram_id();
        if ((isSetProgram_id || isSetProgram_id2) && !(isSetProgram_id && isSetProgram_id2 && this.program_id.equals(that.program_id))) {
            return false;
        }
        boolean isSetProgram_path = isSetProgram_path();
        boolean isSetProgram_path2 = that.isSetProgram_path();
        if ((isSetProgram_path || isSetProgram_path2) && !(isSetProgram_path && isSetProgram_path2 && this.program_path.equals(that.program_path))) {
            return false;
        }
        boolean isSetProgram_type = isSetProgram_type();
        boolean isSetProgram_type2 = that.isSetProgram_type();
        if ((isSetProgram_type || isSetProgram_type2) && !(isSetProgram_type && isSetProgram_type2 && this.program_type == that.program_type)) {
            return false;
        }
        boolean isSetBind_app = isSetBind_app();
        boolean isSetBind_app2 = that.isSetBind_app();
        if (isSetBind_app || isSetBind_app2) {
            return isSetBind_app && isSetBind_app2 && this.bind_app.equals(that.bind_app);
        }
        return true;
    }

    public AdLunchWechatProgram(AdLunchWechatProgram other) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.PROGRAM_ID, _Fields.PROGRAM_PATH, _Fields.PROGRAM_TYPE, _Fields.BIND_APP};
        this.__isset_bitfield = other.__isset_bitfield;
        if (other.isSetProgram_id()) {
            this.program_id = other.program_id;
        }
        if (other.isSetProgram_path()) {
            this.program_path = other.program_path;
        }
        this.program_type = other.program_type;
        if (other.isSetBind_app()) {
            this.bind_app = other.bind_app;
        }
    }

    public void validate() throws TException {
    }
}

package com.baicizhan.online.user_study_api;

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

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class WikiComponent implements TBase<WikiComponent, _Fields>, Serializable, Cloneable, Comparable<WikiComponent> {
    private static final int __ENABLE_ISSET_ID = 2;
    private static final int __ID_ISSET_ID = 0;
    private static final int __PRIORITY_ISSET_ID = 1;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public int enable;

    /* renamed from: id, reason: collision with root package name */
    public int f28170id;
    public int priority;
    private static final TStruct STRUCT_DESC = new TStruct("WikiComponent");
    private static final TField ID_FIELD_DESC = new TField("id", (byte) 8, 1);
    private static final TField PRIORITY_FIELD_DESC = new TField("priority", (byte) 8, 2);
    private static final TField ENABLE_FIELD_DESC = new TField(k3.u0.f65628b, (byte) 8, 3);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.user_study_api.WikiComponent$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_study_api$WikiComponent$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$user_study_api$WikiComponent$_Fields = iArr;
            try {
                iArr[_Fields.ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$WikiComponent$_Fields[_Fields.PRIORITY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$WikiComponent$_Fields[_Fields.ENABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class WikiComponentStandardScheme extends StandardScheme<WikiComponent> {
        private WikiComponentStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, WikiComponent struct) throws TException {
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
                            TProtocolUtil.skip(iprot, b11);
                        } else if (b11 == 8) {
                            struct.enable = iprot.readI32();
                            struct.setEnableIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 8) {
                        struct.priority = iprot.readI32();
                        struct.setPriorityIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 8) {
                    struct.f28170id = iprot.readI32();
                    struct.setIdIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (!struct.isSetId()) {
                throw new TProtocolException("Required field 'id' was not found in serialized data! Struct: " + toString());
            }
            if (!struct.isSetPriority()) {
                throw new TProtocolException("Required field 'priority' was not found in serialized data! Struct: " + toString());
            }
            if (struct.isSetEnable()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'enable' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, WikiComponent struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(WikiComponent.STRUCT_DESC);
            oprot.writeFieldBegin(WikiComponent.ID_FIELD_DESC);
            oprot.writeI32(struct.f28170id);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(WikiComponent.PRIORITY_FIELD_DESC);
            oprot.writeI32(struct.priority);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(WikiComponent.ENABLE_FIELD_DESC);
            oprot.writeI32(struct.enable);
            oprot.writeFieldEnd();
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class WikiComponentStandardSchemeFactory implements SchemeFactory {
        private WikiComponentStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public WikiComponentStandardScheme getScheme() {
            return new WikiComponentStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class WikiComponentTupleScheme extends TupleScheme<WikiComponent> {
        private WikiComponentTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, WikiComponent struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.f28170id = tTupleProtocol.readI32();
            struct.setIdIsSet(true);
            struct.priority = tTupleProtocol.readI32();
            struct.setPriorityIsSet(true);
            struct.enable = tTupleProtocol.readI32();
            struct.setEnableIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, WikiComponent struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.f28170id);
            tTupleProtocol.writeI32(struct.priority);
            tTupleProtocol.writeI32(struct.enable);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class WikiComponentTupleSchemeFactory implements SchemeFactory {
        private WikiComponentTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public WikiComponentTupleScheme getScheme() {
            return new WikiComponentTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        ID(1, "id"),
        PRIORITY(2, "priority"),
        ENABLE(3, k3.u0.f65628b);

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
                return ID;
            }
            if (fieldId == 2) {
                return PRIORITY;
            }
            if (fieldId != 3) {
                return null;
            }
            return ENABLE;
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
        hashMap.put(StandardScheme.class, new WikiComponentStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new WikiComponentTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.ID, (_Fields) new FieldMetaData("id", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.PRIORITY, (_Fields) new FieldMetaData("priority", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.ENABLE, (_Fields) new FieldMetaData(k3.u0.f65628b, (byte) 1, new FieldValueMetaData((byte) 8)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(WikiComponent.class, unmodifiableMap);
    }

    public WikiComponent() {
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
        setIdIsSet(false);
        this.f28170id = 0;
        setPriorityIsSet(false);
        this.priority = 0;
        setEnableIsSet(false);
        this.enable = 0;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof WikiComponent)) {
            return equals((WikiComponent) that);
        }
        return false;
    }

    public int getEnable() {
        return this.enable;
    }

    public int getId() {
        return this.f28170id;
    }

    public int getPriority() {
        return this.priority;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetEnable() {
        return EncodingUtils.testBit(this.__isset_bitfield, 2);
    }

    public boolean isSetId() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetPriority() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public WikiComponent setEnable(int enable) {
        this.enable = enable;
        setEnableIsSet(true);
        return this;
    }

    public void setEnableIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 2, value);
    }

    public WikiComponent setId(int id2) {
        this.f28170id = id2;
        setIdIsSet(true);
        return this;
    }

    public void setIdIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public WikiComponent setPriority(int priority) {
        this.priority = priority;
        setPriorityIsSet(true);
        return this;
    }

    public void setPriorityIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public String toString() {
        return "WikiComponent(id:" + this.f28170id + org.junit.jupiter.api.j2.O + "priority:" + this.priority + org.junit.jupiter.api.j2.O + "enable:" + this.enable + pn.j.f81007d;
    }

    public void unsetEnable() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 2);
    }

    public void unsetId() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetPriority() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(WikiComponent other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo4 = Boolean.valueOf(isSetId()).compareTo(Boolean.valueOf(other.isSetId()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (isSetId() && (compareTo3 = TBaseHelper.compareTo(this.f28170id, other.f28170id)) != 0) {
            return compareTo3;
        }
        int compareTo5 = Boolean.valueOf(isSetPriority()).compareTo(Boolean.valueOf(other.isSetPriority()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (isSetPriority() && (compareTo2 = TBaseHelper.compareTo(this.priority, other.priority)) != 0) {
            return compareTo2;
        }
        int compareTo6 = Boolean.valueOf(isSetEnable()).compareTo(Boolean.valueOf(other.isSetEnable()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (!isSetEnable() || (compareTo = TBaseHelper.compareTo(this.enable, other.enable)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<WikiComponent, _Fields> deepCopy2() {
        return new WikiComponent(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$WikiComponent$_Fields[field.ordinal()];
        if (i11 == 1) {
            return Integer.valueOf(getId());
        }
        if (i11 == 2) {
            return Integer.valueOf(getPriority());
        }
        if (i11 == 3) {
            return Integer.valueOf(getEnable());
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$WikiComponent$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetId();
        }
        if (i11 == 2) {
            return isSetPriority();
        }
        if (i11 == 3) {
            return isSetEnable();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$WikiComponent$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetId();
                return;
            } else {
                setId(((Integer) value).intValue());
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetPriority();
                return;
            } else {
                setPriority(((Integer) value).intValue());
                return;
            }
        }
        if (i11 != 3) {
            return;
        }
        if (value == null) {
            unsetEnable();
        } else {
            setEnable(((Integer) value).intValue());
        }
    }

    public WikiComponent(int id2, int priority, int enable) {
        this();
        this.f28170id = id2;
        setIdIsSet(true);
        this.priority = priority;
        setPriorityIsSet(true);
        this.enable = enable;
        setEnableIsSet(true);
    }

    public boolean equals(WikiComponent that) {
        return that != null && this.f28170id == that.f28170id && this.priority == that.priority && this.enable == that.enable;
    }

    public WikiComponent(WikiComponent other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        this.f28170id = other.f28170id;
        this.priority = other.priority;
        this.enable = other.enable;
    }

    public void validate() throws TException {
    }
}

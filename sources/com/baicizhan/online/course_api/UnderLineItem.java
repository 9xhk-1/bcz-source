package com.baicizhan.online.course_api;

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
public class UnderLineItem implements TBase<UnderLineItem, _Fields>, Serializable, Cloneable, Comparable<UnderLineItem> {
    private static final int __END_INDEX_ISSET_ID = 1;
    private static final int __START_INDEX_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public int end_index;
    public int start_index;
    private static final TStruct STRUCT_DESC = new TStruct("UnderLineItem");
    private static final TField START_INDEX_FIELD_DESC = new TField("start_index", (byte) 8, 1);
    private static final TField END_INDEX_FIELD_DESC = new TField("end_index", (byte) 8, 2);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.course_api.UnderLineItem$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$course_api$UnderLineItem$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$course_api$UnderLineItem$_Fields = iArr;
            try {
                iArr[_Fields.START_INDEX.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$course_api$UnderLineItem$_Fields[_Fields.END_INDEX.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UnderLineItemStandardScheme extends StandardScheme<UnderLineItem> {
        private UnderLineItemStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, UnderLineItem struct) throws TException {
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
                        TProtocolUtil.skip(iprot, b11);
                    } else if (b11 == 8) {
                        struct.end_index = iprot.readI32();
                        struct.setEnd_indexIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 8) {
                    struct.start_index = iprot.readI32();
                    struct.setStart_indexIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (!struct.isSetStart_index()) {
                throw new TProtocolException("Required field 'start_index' was not found in serialized data! Struct: " + toString());
            }
            if (struct.isSetEnd_index()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'end_index' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, UnderLineItem struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(UnderLineItem.STRUCT_DESC);
            oprot.writeFieldBegin(UnderLineItem.START_INDEX_FIELD_DESC);
            oprot.writeI32(struct.start_index);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(UnderLineItem.END_INDEX_FIELD_DESC);
            oprot.writeI32(struct.end_index);
            oprot.writeFieldEnd();
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UnderLineItemStandardSchemeFactory implements SchemeFactory {
        private UnderLineItemStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public UnderLineItemStandardScheme getScheme() {
            return new UnderLineItemStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UnderLineItemTupleScheme extends TupleScheme<UnderLineItem> {
        private UnderLineItemTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, UnderLineItem struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.start_index = tTupleProtocol.readI32();
            struct.setStart_indexIsSet(true);
            struct.end_index = tTupleProtocol.readI32();
            struct.setEnd_indexIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, UnderLineItem struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.start_index);
            tTupleProtocol.writeI32(struct.end_index);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UnderLineItemTupleSchemeFactory implements SchemeFactory {
        private UnderLineItemTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public UnderLineItemTupleScheme getScheme() {
            return new UnderLineItemTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        START_INDEX(1, "start_index"),
        END_INDEX(2, "end_index");

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
                return START_INDEX;
            }
            if (fieldId != 2) {
                return null;
            }
            return END_INDEX;
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
        hashMap.put(StandardScheme.class, new UnderLineItemStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new UnderLineItemTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.START_INDEX, (_Fields) new FieldMetaData("start_index", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.END_INDEX, (_Fields) new FieldMetaData("end_index", (byte) 1, new FieldValueMetaData((byte) 8)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(UnderLineItem.class, unmodifiableMap);
    }

    public UnderLineItem() {
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
        setStart_indexIsSet(false);
        this.start_index = 0;
        setEnd_indexIsSet(false);
        this.end_index = 0;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof UnderLineItem)) {
            return equals((UnderLineItem) that);
        }
        return false;
    }

    public int getEnd_index() {
        return this.end_index;
    }

    public int getStart_index() {
        return this.start_index;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetEnd_index() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetStart_index() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public UnderLineItem setEnd_index(int end_index) {
        this.end_index = end_index;
        setEnd_indexIsSet(true);
        return this;
    }

    public void setEnd_indexIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public UnderLineItem setStart_index(int start_index) {
        this.start_index = start_index;
        setStart_indexIsSet(true);
        return this;
    }

    public void setStart_indexIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public String toString() {
        return "UnderLineItem(start_index:" + this.start_index + j2.O + "end_index:" + this.end_index + pn.j.f81007d;
    }

    public void unsetEnd_index() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetStart_index() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(UnderLineItem other) {
        int compareTo;
        int compareTo2;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo3 = Boolean.valueOf(isSetStart_index()).compareTo(Boolean.valueOf(other.isSetStart_index()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (isSetStart_index() && (compareTo2 = TBaseHelper.compareTo(this.start_index, other.start_index)) != 0) {
            return compareTo2;
        }
        int compareTo4 = Boolean.valueOf(isSetEnd_index()).compareTo(Boolean.valueOf(other.isSetEnd_index()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (!isSetEnd_index() || (compareTo = TBaseHelper.compareTo(this.end_index, other.end_index)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<UnderLineItem, _Fields> deepCopy2() {
        return new UnderLineItem(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$course_api$UnderLineItem$_Fields[field.ordinal()];
        if (i11 == 1) {
            return Integer.valueOf(getStart_index());
        }
        if (i11 == 2) {
            return Integer.valueOf(getEnd_index());
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$course_api$UnderLineItem$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetStart_index();
        }
        if (i11 == 2) {
            return isSetEnd_index();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$course_api$UnderLineItem$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetStart_index();
                return;
            } else {
                setStart_index(((Integer) value).intValue());
                return;
            }
        }
        if (i11 != 2) {
            return;
        }
        if (value == null) {
            unsetEnd_index();
        } else {
            setEnd_index(((Integer) value).intValue());
        }
    }

    public UnderLineItem(int start_index, int end_index) {
        this();
        this.start_index = start_index;
        setStart_indexIsSet(true);
        this.end_index = end_index;
        setEnd_indexIsSet(true);
    }

    public boolean equals(UnderLineItem that) {
        return that != null && this.start_index == that.start_index && this.end_index == that.end_index;
    }

    public UnderLineItem(UnderLineItem other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        this.start_index = other.start_index;
        this.end_index = other.end_index;
    }

    public void validate() throws TException {
    }
}

package com.baicizhan.online.game_api;

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
public class PurchaseReq implements TBase<PurchaseReq, _Fields>, Serializable, Cloneable, Comparable<PurchaseReq> {
    private static final int __ITEM_ID_ISSET_ID = 0;
    private static final int __QUANTITY_ISSET_ID = 1;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public String idempotent_key;
    public int item_id;
    public int quantity;
    private static final TStruct STRUCT_DESC = new TStruct("PurchaseReq");
    private static final TField ITEM_ID_FIELD_DESC = new TField("item_id", (byte) 8, 1);
    private static final TField QUANTITY_FIELD_DESC = new TField("quantity", (byte) 8, 2);
    private static final TField IDEMPOTENT_KEY_FIELD_DESC = new TField("idempotent_key", (byte) 11, 3);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.game_api.PurchaseReq$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$game_api$PurchaseReq$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$game_api$PurchaseReq$_Fields = iArr;
            try {
                iArr[_Fields.ITEM_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$PurchaseReq$_Fields[_Fields.QUANTITY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$PurchaseReq$_Fields[_Fields.IDEMPOTENT_KEY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class PurchaseReqStandardScheme extends StandardScheme<PurchaseReq> {
        private PurchaseReqStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, PurchaseReq struct) throws TException {
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
                        } else if (b11 == 11) {
                            struct.idempotent_key = iprot.readString();
                            struct.setIdempotent_keyIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 8) {
                        struct.quantity = iprot.readI32();
                        struct.setQuantityIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 8) {
                    struct.item_id = iprot.readI32();
                    struct.setItem_idIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (!struct.isSetItem_id()) {
                throw new TProtocolException("Required field 'item_id' was not found in serialized data! Struct: " + toString());
            }
            if (struct.isSetQuantity()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'quantity' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, PurchaseReq struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(PurchaseReq.STRUCT_DESC);
            oprot.writeFieldBegin(PurchaseReq.ITEM_ID_FIELD_DESC);
            oprot.writeI32(struct.item_id);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(PurchaseReq.QUANTITY_FIELD_DESC);
            oprot.writeI32(struct.quantity);
            oprot.writeFieldEnd();
            if (struct.idempotent_key != null) {
                oprot.writeFieldBegin(PurchaseReq.IDEMPOTENT_KEY_FIELD_DESC);
                oprot.writeString(struct.idempotent_key);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class PurchaseReqStandardSchemeFactory implements SchemeFactory {
        private PurchaseReqStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public PurchaseReqStandardScheme getScheme() {
            return new PurchaseReqStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class PurchaseReqTupleScheme extends TupleScheme<PurchaseReq> {
        private PurchaseReqTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, PurchaseReq struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.item_id = tTupleProtocol.readI32();
            struct.setItem_idIsSet(true);
            struct.quantity = tTupleProtocol.readI32();
            struct.setQuantityIsSet(true);
            struct.idempotent_key = tTupleProtocol.readString();
            struct.setIdempotent_keyIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, PurchaseReq struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.item_id);
            tTupleProtocol.writeI32(struct.quantity);
            tTupleProtocol.writeString(struct.idempotent_key);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class PurchaseReqTupleSchemeFactory implements SchemeFactory {
        private PurchaseReqTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public PurchaseReqTupleScheme getScheme() {
            return new PurchaseReqTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        ITEM_ID(1, "item_id"),
        QUANTITY(2, "quantity"),
        IDEMPOTENT_KEY(3, "idempotent_key");

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
                return ITEM_ID;
            }
            if (fieldId == 2) {
                return QUANTITY;
            }
            if (fieldId != 3) {
                return null;
            }
            return IDEMPOTENT_KEY;
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
        hashMap.put(StandardScheme.class, new PurchaseReqStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new PurchaseReqTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.ITEM_ID, (_Fields) new FieldMetaData("item_id", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.QUANTITY, (_Fields) new FieldMetaData("quantity", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.IDEMPOTENT_KEY, (_Fields) new FieldMetaData("idempotent_key", (byte) 1, new FieldValueMetaData((byte) 11)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(PurchaseReq.class, unmodifiableMap);
    }

    public PurchaseReq() {
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
        setItem_idIsSet(false);
        this.item_id = 0;
        setQuantityIsSet(false);
        this.quantity = 0;
        this.idempotent_key = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof PurchaseReq)) {
            return equals((PurchaseReq) that);
        }
        return false;
    }

    public String getIdempotent_key() {
        return this.idempotent_key;
    }

    public int getItem_id() {
        return this.item_id;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetIdempotent_key() {
        return this.idempotent_key != null;
    }

    public boolean isSetItem_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetQuantity() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public PurchaseReq setIdempotent_key(String idempotent_key) {
        this.idempotent_key = idempotent_key;
        return this;
    }

    public void setIdempotent_keyIsSet(boolean value) {
        if (value) {
            return;
        }
        this.idempotent_key = null;
    }

    public PurchaseReq setItem_id(int item_id) {
        this.item_id = item_id;
        setItem_idIsSet(true);
        return this;
    }

    public void setItem_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public PurchaseReq setQuantity(int quantity) {
        this.quantity = quantity;
        setQuantityIsSet(true);
        return this;
    }

    public void setQuantityIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("PurchaseReq(");
        sb2.append("item_id:");
        sb2.append(this.item_id);
        sb2.append(j2.O);
        sb2.append("quantity:");
        sb2.append(this.quantity);
        sb2.append(j2.O);
        sb2.append("idempotent_key:");
        String str = this.idempotent_key;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetIdempotent_key() {
        this.idempotent_key = null;
    }

    public void unsetItem_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetQuantity() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void validate() throws TException {
        if (this.idempotent_key != null) {
            return;
        }
        throw new TProtocolException("Required field 'idempotent_key' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(PurchaseReq other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo4 = Boolean.valueOf(isSetItem_id()).compareTo(Boolean.valueOf(other.isSetItem_id()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (isSetItem_id() && (compareTo3 = TBaseHelper.compareTo(this.item_id, other.item_id)) != 0) {
            return compareTo3;
        }
        int compareTo5 = Boolean.valueOf(isSetQuantity()).compareTo(Boolean.valueOf(other.isSetQuantity()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (isSetQuantity() && (compareTo2 = TBaseHelper.compareTo(this.quantity, other.quantity)) != 0) {
            return compareTo2;
        }
        int compareTo6 = Boolean.valueOf(isSetIdempotent_key()).compareTo(Boolean.valueOf(other.isSetIdempotent_key()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (!isSetIdempotent_key() || (compareTo = TBaseHelper.compareTo(this.idempotent_key, other.idempotent_key)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<PurchaseReq, _Fields> deepCopy2() {
        return new PurchaseReq(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$PurchaseReq$_Fields[field.ordinal()];
        if (i11 == 1) {
            return Integer.valueOf(getItem_id());
        }
        if (i11 == 2) {
            return Integer.valueOf(getQuantity());
        }
        if (i11 == 3) {
            return getIdempotent_key();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$PurchaseReq$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetItem_id();
        }
        if (i11 == 2) {
            return isSetQuantity();
        }
        if (i11 == 3) {
            return isSetIdempotent_key();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$PurchaseReq$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetItem_id();
                return;
            } else {
                setItem_id(((Integer) value).intValue());
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetQuantity();
                return;
            } else {
                setQuantity(((Integer) value).intValue());
                return;
            }
        }
        if (i11 != 3) {
            return;
        }
        if (value == null) {
            unsetIdempotent_key();
        } else {
            setIdempotent_key((String) value);
        }
    }

    public PurchaseReq(int item_id, int quantity, String idempotent_key) {
        this();
        this.item_id = item_id;
        setItem_idIsSet(true);
        this.quantity = quantity;
        setQuantityIsSet(true);
        this.idempotent_key = idempotent_key;
    }

    public boolean equals(PurchaseReq that) {
        if (that == null || this.item_id != that.item_id || this.quantity != that.quantity) {
            return false;
        }
        boolean isSetIdempotent_key = isSetIdempotent_key();
        boolean isSetIdempotent_key2 = that.isSetIdempotent_key();
        if (isSetIdempotent_key || isSetIdempotent_key2) {
            return isSetIdempotent_key && isSetIdempotent_key2 && this.idempotent_key.equals(that.idempotent_key);
        }
        return true;
    }

    public PurchaseReq(PurchaseReq other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        this.item_id = other.item_id;
        this.quantity = other.quantity;
        if (other.isSetIdempotent_key()) {
            this.idempotent_key = other.idempotent_key;
        }
    }
}

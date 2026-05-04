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
public class BookAd implements TBase<BookAd, _Fields>, Serializable, Cloneable, Comparable<BookAd> {
    private static final int __BOOK_ID_ISSET_ID = 0;
    private static final int __JUMP_TYPE_ISSET_ID = 1;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public String aid;
    public int book_id;
    public int jump_type;
    public String local_link;
    private _Fields[] optionals;
    public String show_name;
    public String taobao_link;
    private static final TStruct STRUCT_DESC = new TStruct("BookAd");
    private static final TField BOOK_ID_FIELD_DESC = new TField("book_id", (byte) 8, 1);
    private static final TField SHOW_NAME_FIELD_DESC = new TField("show_name", (byte) 11, 2);
    private static final TField JUMP_TYPE_FIELD_DESC = new TField("jump_type", (byte) 8, 3);
    private static final TField LOCAL_LINK_FIELD_DESC = new TField("local_link", (byte) 11, 4);
    private static final TField TAOBAO_LINK_FIELD_DESC = new TField("taobao_link", (byte) 11, 5);
    private static final TField AID_FIELD_DESC = new TField("aid", (byte) 11, 6);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.advertise_api.BookAd$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$advertise_api$BookAd$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$advertise_api$BookAd$_Fields = iArr;
            try {
                iArr[_Fields.BOOK_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$advertise_api$BookAd$_Fields[_Fields.SHOW_NAME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$advertise_api$BookAd$_Fields[_Fields.JUMP_TYPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$advertise_api$BookAd$_Fields[_Fields.LOCAL_LINK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$advertise_api$BookAd$_Fields[_Fields.TAOBAO_LINK.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$baicizhan$online$advertise_api$BookAd$_Fields[_Fields.AID.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BookAdStandardScheme extends StandardScheme<BookAd> {
        private BookAdStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, BookAd struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    iprot.readStructEnd();
                    if (!struct.isSetBook_id()) {
                        throw new TProtocolException("Required field 'book_id' was not found in serialized data! Struct: " + toString());
                    }
                    if (struct.isSetJump_type()) {
                        struct.validate();
                        return;
                    }
                    throw new TProtocolException("Required field 'jump_type' was not found in serialized data! Struct: " + toString());
                }
                switch (readFieldBegin.f77768id) {
                    case 1:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.book_id = iprot.readI32();
                            struct.setBook_idIsSet(true);
                            break;
                        }
                    case 2:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.show_name = iprot.readString();
                            struct.setShow_nameIsSet(true);
                            break;
                        }
                    case 3:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.jump_type = iprot.readI32();
                            struct.setJump_typeIsSet(true);
                            break;
                        }
                    case 4:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.local_link = iprot.readString();
                            struct.setLocal_linkIsSet(true);
                            break;
                        }
                    case 5:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.taobao_link = iprot.readString();
                            struct.setTaobao_linkIsSet(true);
                            break;
                        }
                    case 6:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.aid = iprot.readString();
                            struct.setAidIsSet(true);
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
        public void write(TProtocol oprot, BookAd struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(BookAd.STRUCT_DESC);
            oprot.writeFieldBegin(BookAd.BOOK_ID_FIELD_DESC);
            oprot.writeI32(struct.book_id);
            oprot.writeFieldEnd();
            if (struct.show_name != null) {
                oprot.writeFieldBegin(BookAd.SHOW_NAME_FIELD_DESC);
                oprot.writeString(struct.show_name);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(BookAd.JUMP_TYPE_FIELD_DESC);
            oprot.writeI32(struct.jump_type);
            oprot.writeFieldEnd();
            if (struct.local_link != null) {
                oprot.writeFieldBegin(BookAd.LOCAL_LINK_FIELD_DESC);
                oprot.writeString(struct.local_link);
                oprot.writeFieldEnd();
            }
            if (struct.taobao_link != null) {
                oprot.writeFieldBegin(BookAd.TAOBAO_LINK_FIELD_DESC);
                oprot.writeString(struct.taobao_link);
                oprot.writeFieldEnd();
            }
            if (struct.aid != null && struct.isSetAid()) {
                oprot.writeFieldBegin(BookAd.AID_FIELD_DESC);
                oprot.writeString(struct.aid);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BookAdStandardSchemeFactory implements SchemeFactory {
        private BookAdStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BookAdStandardScheme getScheme() {
            return new BookAdStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BookAdTupleScheme extends TupleScheme<BookAd> {
        private BookAdTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, BookAd struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.book_id = tTupleProtocol.readI32();
            struct.setBook_idIsSet(true);
            struct.show_name = tTupleProtocol.readString();
            struct.setShow_nameIsSet(true);
            struct.jump_type = tTupleProtocol.readI32();
            struct.setJump_typeIsSet(true);
            struct.local_link = tTupleProtocol.readString();
            struct.setLocal_linkIsSet(true);
            struct.taobao_link = tTupleProtocol.readString();
            struct.setTaobao_linkIsSet(true);
            if (tTupleProtocol.readBitSet(1).get(0)) {
                struct.aid = tTupleProtocol.readString();
                struct.setAidIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, BookAd struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.book_id);
            tTupleProtocol.writeString(struct.show_name);
            tTupleProtocol.writeI32(struct.jump_type);
            tTupleProtocol.writeString(struct.local_link);
            tTupleProtocol.writeString(struct.taobao_link);
            BitSet bitSet = new BitSet();
            if (struct.isSetAid()) {
                bitSet.set(0);
            }
            tTupleProtocol.writeBitSet(bitSet, 1);
            if (struct.isSetAid()) {
                tTupleProtocol.writeString(struct.aid);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BookAdTupleSchemeFactory implements SchemeFactory {
        private BookAdTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BookAdTupleScheme getScheme() {
            return new BookAdTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        BOOK_ID(1, "book_id"),
        SHOW_NAME(2, "show_name"),
        JUMP_TYPE(3, "jump_type"),
        LOCAL_LINK(4, "local_link"),
        TAOBAO_LINK(5, "taobao_link"),
        AID(6, "aid");

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
                    return BOOK_ID;
                case 2:
                    return SHOW_NAME;
                case 3:
                    return JUMP_TYPE;
                case 4:
                    return LOCAL_LINK;
                case 5:
                    return TAOBAO_LINK;
                case 6:
                    return AID;
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
        hashMap.put(StandardScheme.class, new BookAdStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new BookAdTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.BOOK_ID, (_Fields) new FieldMetaData("book_id", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.SHOW_NAME, (_Fields) new FieldMetaData("show_name", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.JUMP_TYPE, (_Fields) new FieldMetaData("jump_type", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.LOCAL_LINK, (_Fields) new FieldMetaData("local_link", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.TAOBAO_LINK, (_Fields) new FieldMetaData("taobao_link", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.AID, (_Fields) new FieldMetaData("aid", (byte) 2, new FieldValueMetaData((byte) 11)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(BookAd.class, unmodifiableMap);
    }

    public BookAd() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.AID};
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
        setBook_idIsSet(false);
        this.book_id = 0;
        this.show_name = null;
        setJump_typeIsSet(false);
        this.jump_type = 0;
        this.local_link = null;
        this.taobao_link = null;
        this.aid = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof BookAd)) {
            return equals((BookAd) that);
        }
        return false;
    }

    public String getAid() {
        return this.aid;
    }

    public int getBook_id() {
        return this.book_id;
    }

    public int getJump_type() {
        return this.jump_type;
    }

    public String getLocal_link() {
        return this.local_link;
    }

    public String getShow_name() {
        return this.show_name;
    }

    public String getTaobao_link() {
        return this.taobao_link;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetAid() {
        return this.aid != null;
    }

    public boolean isSetBook_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetJump_type() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetLocal_link() {
        return this.local_link != null;
    }

    public boolean isSetShow_name() {
        return this.show_name != null;
    }

    public boolean isSetTaobao_link() {
        return this.taobao_link != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public BookAd setAid(String aid) {
        this.aid = aid;
        return this;
    }

    public void setAidIsSet(boolean value) {
        if (value) {
            return;
        }
        this.aid = null;
    }

    public BookAd setBook_id(int book_id) {
        this.book_id = book_id;
        setBook_idIsSet(true);
        return this;
    }

    public void setBook_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public BookAd setJump_type(int jump_type) {
        this.jump_type = jump_type;
        setJump_typeIsSet(true);
        return this;
    }

    public void setJump_typeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public BookAd setLocal_link(String local_link) {
        this.local_link = local_link;
        return this;
    }

    public void setLocal_linkIsSet(boolean value) {
        if (value) {
            return;
        }
        this.local_link = null;
    }

    public BookAd setShow_name(String show_name) {
        this.show_name = show_name;
        return this;
    }

    public void setShow_nameIsSet(boolean value) {
        if (value) {
            return;
        }
        this.show_name = null;
    }

    public BookAd setTaobao_link(String taobao_link) {
        this.taobao_link = taobao_link;
        return this;
    }

    public void setTaobao_linkIsSet(boolean value) {
        if (value) {
            return;
        }
        this.taobao_link = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("BookAd(");
        sb2.append("book_id:");
        sb2.append(this.book_id);
        sb2.append(j2.O);
        sb2.append("show_name:");
        String str = this.show_name;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(j2.O);
        sb2.append("jump_type:");
        sb2.append(this.jump_type);
        sb2.append(j2.O);
        sb2.append("local_link:");
        String str2 = this.local_link;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(str2);
        }
        sb2.append(j2.O);
        sb2.append("taobao_link:");
        String str3 = this.taobao_link;
        if (str3 == null) {
            sb2.append("null");
        } else {
            sb2.append(str3);
        }
        if (isSetAid()) {
            sb2.append(j2.O);
            sb2.append("aid:");
            String str4 = this.aid;
            if (str4 == null) {
                sb2.append("null");
            } else {
                sb2.append(str4);
            }
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetAid() {
        this.aid = null;
    }

    public void unsetBook_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetJump_type() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetLocal_link() {
        this.local_link = null;
    }

    public void unsetShow_name() {
        this.show_name = null;
    }

    public void unsetTaobao_link() {
        this.taobao_link = null;
    }

    public void validate() throws TException {
        if (this.show_name == null) {
            throw new TProtocolException("Required field 'show_name' was not present! Struct: " + toString());
        }
        if (this.local_link == null) {
            throw new TProtocolException("Required field 'local_link' was not present! Struct: " + toString());
        }
        if (this.taobao_link != null) {
            return;
        }
        throw new TProtocolException("Required field 'taobao_link' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(BookAd other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        int compareTo5;
        int compareTo6;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo7 = Boolean.valueOf(isSetBook_id()).compareTo(Boolean.valueOf(other.isSetBook_id()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (isSetBook_id() && (compareTo6 = TBaseHelper.compareTo(this.book_id, other.book_id)) != 0) {
            return compareTo6;
        }
        int compareTo8 = Boolean.valueOf(isSetShow_name()).compareTo(Boolean.valueOf(other.isSetShow_name()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (isSetShow_name() && (compareTo5 = TBaseHelper.compareTo(this.show_name, other.show_name)) != 0) {
            return compareTo5;
        }
        int compareTo9 = Boolean.valueOf(isSetJump_type()).compareTo(Boolean.valueOf(other.isSetJump_type()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (isSetJump_type() && (compareTo4 = TBaseHelper.compareTo(this.jump_type, other.jump_type)) != 0) {
            return compareTo4;
        }
        int compareTo10 = Boolean.valueOf(isSetLocal_link()).compareTo(Boolean.valueOf(other.isSetLocal_link()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (isSetLocal_link() && (compareTo3 = TBaseHelper.compareTo(this.local_link, other.local_link)) != 0) {
            return compareTo3;
        }
        int compareTo11 = Boolean.valueOf(isSetTaobao_link()).compareTo(Boolean.valueOf(other.isSetTaobao_link()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (isSetTaobao_link() && (compareTo2 = TBaseHelper.compareTo(this.taobao_link, other.taobao_link)) != 0) {
            return compareTo2;
        }
        int compareTo12 = Boolean.valueOf(isSetAid()).compareTo(Boolean.valueOf(other.isSetAid()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (!isSetAid() || (compareTo = TBaseHelper.compareTo(this.aid, other.aid)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<BookAd, _Fields> deepCopy2() {
        return new BookAd(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$advertise_api$BookAd$_Fields[field.ordinal()]) {
            case 1:
                return Integer.valueOf(getBook_id());
            case 2:
                return getShow_name();
            case 3:
                return Integer.valueOf(getJump_type());
            case 4:
                return getLocal_link();
            case 5:
                return getTaobao_link();
            case 6:
                return getAid();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$advertise_api$BookAd$_Fields[field.ordinal()]) {
            case 1:
                return isSetBook_id();
            case 2:
                return isSetShow_name();
            case 3:
                return isSetJump_type();
            case 4:
                return isSetLocal_link();
            case 5:
                return isSetTaobao_link();
            case 6:
                return isSetAid();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$advertise_api$BookAd$_Fields[field.ordinal()]) {
            case 1:
                if (value != null) {
                    setBook_id(((Integer) value).intValue());
                    break;
                } else {
                    unsetBook_id();
                    break;
                }
            case 2:
                if (value != null) {
                    setShow_name((String) value);
                    break;
                } else {
                    unsetShow_name();
                    break;
                }
            case 3:
                if (value != null) {
                    setJump_type(((Integer) value).intValue());
                    break;
                } else {
                    unsetJump_type();
                    break;
                }
            case 4:
                if (value != null) {
                    setLocal_link((String) value);
                    break;
                } else {
                    unsetLocal_link();
                    break;
                }
            case 5:
                if (value != null) {
                    setTaobao_link((String) value);
                    break;
                } else {
                    unsetTaobao_link();
                    break;
                }
            case 6:
                if (value != null) {
                    setAid((String) value);
                    break;
                } else {
                    unsetAid();
                    break;
                }
        }
    }

    public boolean equals(BookAd that) {
        if (that == null || this.book_id != that.book_id) {
            return false;
        }
        boolean isSetShow_name = isSetShow_name();
        boolean isSetShow_name2 = that.isSetShow_name();
        if (((isSetShow_name || isSetShow_name2) && !(isSetShow_name && isSetShow_name2 && this.show_name.equals(that.show_name))) || this.jump_type != that.jump_type) {
            return false;
        }
        boolean isSetLocal_link = isSetLocal_link();
        boolean isSetLocal_link2 = that.isSetLocal_link();
        if ((isSetLocal_link || isSetLocal_link2) && !(isSetLocal_link && isSetLocal_link2 && this.local_link.equals(that.local_link))) {
            return false;
        }
        boolean isSetTaobao_link = isSetTaobao_link();
        boolean isSetTaobao_link2 = that.isSetTaobao_link();
        if ((isSetTaobao_link || isSetTaobao_link2) && !(isSetTaobao_link && isSetTaobao_link2 && this.taobao_link.equals(that.taobao_link))) {
            return false;
        }
        boolean isSetAid = isSetAid();
        boolean isSetAid2 = that.isSetAid();
        if (isSetAid || isSetAid2) {
            return isSetAid && isSetAid2 && this.aid.equals(that.aid);
        }
        return true;
    }

    public BookAd(int book_id, String show_name, int jump_type, String local_link, String taobao_link) {
        this();
        this.book_id = book_id;
        setBook_idIsSet(true);
        this.show_name = show_name;
        this.jump_type = jump_type;
        setJump_typeIsSet(true);
        this.local_link = local_link;
        this.taobao_link = taobao_link;
    }

    public BookAd(BookAd other) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.AID};
        this.__isset_bitfield = other.__isset_bitfield;
        this.book_id = other.book_id;
        if (other.isSetShow_name()) {
            this.show_name = other.show_name;
        }
        this.jump_type = other.jump_type;
        if (other.isSetLocal_link()) {
            this.local_link = other.local_link;
        }
        if (other.isSetTaobao_link()) {
            this.taobao_link = other.taobao_link;
        }
        if (other.isSetAid()) {
            this.aid = other.aid;
        }
    }
}

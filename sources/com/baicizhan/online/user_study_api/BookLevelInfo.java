package com.baicizhan.online.user_study_api;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TBase;
import org.apache.thrift.TBaseHelper;
import org.apache.thrift.TException;
import org.apache.thrift.TFieldIdEnum;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
import org.apache.thrift.meta_data.ListMetaData;
import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.protocol.TField;
import org.apache.thrift.protocol.TList;
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
public class BookLevelInfo implements TBase<BookLevelInfo, _Fields>, Serializable, Cloneable, Comparable<BookLevelInfo> {
    private static final int __ROLE_ID_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public List<String> cate_ids;
    public String cate_name;
    public List<String> next_cates;
    private _Fields[] optionals;
    public int role_id;
    private static final TStruct STRUCT_DESC = new TStruct("BookLevelInfo");
    private static final TField ROLE_ID_FIELD_DESC = new TField("role_id", (byte) 8, 1);
    private static final TField CATE_IDS_FIELD_DESC = new TField("cate_ids", (byte) 15, 2);
    private static final TField NEXT_CATES_FIELD_DESC = new TField("next_cates", (byte) 15, 3);
    private static final TField CATE_NAME_FIELD_DESC = new TField(ma.b.f72942s, (byte) 11, 4);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.user_study_api.BookLevelInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_study_api$BookLevelInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$user_study_api$BookLevelInfo$_Fields = iArr;
            try {
                iArr[_Fields.ROLE_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$BookLevelInfo$_Fields[_Fields.CATE_IDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$BookLevelInfo$_Fields[_Fields.NEXT_CATES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$BookLevelInfo$_Fields[_Fields.CATE_NAME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BookLevelInfoStandardScheme extends StandardScheme<BookLevelInfo> {
        private BookLevelInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, BookLevelInfo struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    break;
                }
                short s11 = readFieldBegin.f77768id;
                if (s11 != 1) {
                    int i11 = 0;
                    if (s11 != 2) {
                        if (s11 != 3) {
                            if (s11 != 4) {
                                TProtocolUtil.skip(iprot, b11);
                            } else if (b11 == 11) {
                                struct.cate_name = iprot.readString();
                                struct.setCate_nameIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 15) {
                            TList readListBegin = iprot.readListBegin();
                            struct.next_cates = new ArrayList(readListBegin.size);
                            while (i11 < readListBegin.size) {
                                struct.next_cates.add(iprot.readString());
                                i11++;
                            }
                            iprot.readListEnd();
                            struct.setNext_catesIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 15) {
                        TList readListBegin2 = iprot.readListBegin();
                        struct.cate_ids = new ArrayList(readListBegin2.size);
                        while (i11 < readListBegin2.size) {
                            struct.cate_ids.add(iprot.readString());
                            i11++;
                        }
                        iprot.readListEnd();
                        struct.setCate_idsIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 8) {
                    struct.role_id = iprot.readI32();
                    struct.setRole_idIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (struct.isSetRole_id()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'role_id' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, BookLevelInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(BookLevelInfo.STRUCT_DESC);
            oprot.writeFieldBegin(BookLevelInfo.ROLE_ID_FIELD_DESC);
            oprot.writeI32(struct.role_id);
            oprot.writeFieldEnd();
            if (struct.cate_ids != null) {
                oprot.writeFieldBegin(BookLevelInfo.CATE_IDS_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 11, struct.cate_ids.size()));
                Iterator<String> it = struct.cate_ids.iterator();
                while (it.hasNext()) {
                    oprot.writeString(it.next());
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            if (struct.next_cates != null) {
                oprot.writeFieldBegin(BookLevelInfo.NEXT_CATES_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 11, struct.next_cates.size()));
                Iterator<String> it2 = struct.next_cates.iterator();
                while (it2.hasNext()) {
                    oprot.writeString(it2.next());
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            if (struct.cate_name != null && struct.isSetCate_name()) {
                oprot.writeFieldBegin(BookLevelInfo.CATE_NAME_FIELD_DESC);
                oprot.writeString(struct.cate_name);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BookLevelInfoStandardSchemeFactory implements SchemeFactory {
        private BookLevelInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BookLevelInfoStandardScheme getScheme() {
            return new BookLevelInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BookLevelInfoTupleScheme extends TupleScheme<BookLevelInfo> {
        private BookLevelInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, BookLevelInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.role_id = tTupleProtocol.readI32();
            struct.setRole_idIsSet(true);
            TList tList = new TList((byte) 11, tTupleProtocol.readI32());
            struct.cate_ids = new ArrayList(tList.size);
            for (int i11 = 0; i11 < tList.size; i11++) {
                struct.cate_ids.add(tTupleProtocol.readString());
            }
            struct.setCate_idsIsSet(true);
            TList tList2 = new TList((byte) 11, tTupleProtocol.readI32());
            struct.next_cates = new ArrayList(tList2.size);
            for (int i12 = 0; i12 < tList2.size; i12++) {
                struct.next_cates.add(tTupleProtocol.readString());
            }
            struct.setNext_catesIsSet(true);
            if (tTupleProtocol.readBitSet(1).get(0)) {
                struct.cate_name = tTupleProtocol.readString();
                struct.setCate_nameIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, BookLevelInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.role_id);
            tTupleProtocol.writeI32(struct.cate_ids.size());
            Iterator<String> it = struct.cate_ids.iterator();
            while (it.hasNext()) {
                tTupleProtocol.writeString(it.next());
            }
            tTupleProtocol.writeI32(struct.next_cates.size());
            Iterator<String> it2 = struct.next_cates.iterator();
            while (it2.hasNext()) {
                tTupleProtocol.writeString(it2.next());
            }
            BitSet bitSet = new BitSet();
            if (struct.isSetCate_name()) {
                bitSet.set(0);
            }
            tTupleProtocol.writeBitSet(bitSet, 1);
            if (struct.isSetCate_name()) {
                tTupleProtocol.writeString(struct.cate_name);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BookLevelInfoTupleSchemeFactory implements SchemeFactory {
        private BookLevelInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BookLevelInfoTupleScheme getScheme() {
            return new BookLevelInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        ROLE_ID(1, "role_id"),
        CATE_IDS(2, "cate_ids"),
        NEXT_CATES(3, "next_cates"),
        CATE_NAME(4, ma.b.f72942s);

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
                return ROLE_ID;
            }
            if (fieldId == 2) {
                return CATE_IDS;
            }
            if (fieldId == 3) {
                return NEXT_CATES;
            }
            if (fieldId != 4) {
                return null;
            }
            return CATE_NAME;
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
        hashMap.put(StandardScheme.class, new BookLevelInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new BookLevelInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.ROLE_ID, (_Fields) new FieldMetaData("role_id", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.CATE_IDS, (_Fields) new FieldMetaData("cate_ids", (byte) 1, new ListMetaData((byte) 15, new FieldValueMetaData((byte) 11))));
        enumMap.put((EnumMap) _Fields.NEXT_CATES, (_Fields) new FieldMetaData("next_cates", (byte) 1, new ListMetaData((byte) 15, new FieldValueMetaData((byte) 11))));
        enumMap.put((EnumMap) _Fields.CATE_NAME, (_Fields) new FieldMetaData(ma.b.f72942s, (byte) 2, new FieldValueMetaData((byte) 11)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(BookLevelInfo.class, unmodifiableMap);
    }

    public BookLevelInfo() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.CATE_NAME};
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

    public void addToCate_ids(String elem) {
        if (this.cate_ids == null) {
            this.cate_ids = new ArrayList();
        }
        this.cate_ids.add(elem);
    }

    public void addToNext_cates(String elem) {
        if (this.next_cates == null) {
            this.next_cates = new ArrayList();
        }
        this.next_cates.add(elem);
    }

    @Override // org.apache.thrift.TBase
    public void clear() {
        setRole_idIsSet(false);
        this.role_id = 0;
        this.cate_ids = null;
        this.next_cates = null;
        this.cate_name = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof BookLevelInfo)) {
            return equals((BookLevelInfo) that);
        }
        return false;
    }

    public List<String> getCate_ids() {
        return this.cate_ids;
    }

    public Iterator<String> getCate_idsIterator() {
        List<String> list = this.cate_ids;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getCate_idsSize() {
        List<String> list = this.cate_ids;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public String getCate_name() {
        return this.cate_name;
    }

    public List<String> getNext_cates() {
        return this.next_cates;
    }

    public Iterator<String> getNext_catesIterator() {
        List<String> list = this.next_cates;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getNext_catesSize() {
        List<String> list = this.next_cates;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public int getRole_id() {
        return this.role_id;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetCate_ids() {
        return this.cate_ids != null;
    }

    public boolean isSetCate_name() {
        return this.cate_name != null;
    }

    public boolean isSetNext_cates() {
        return this.next_cates != null;
    }

    public boolean isSetRole_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public BookLevelInfo setCate_ids(List<String> cate_ids) {
        this.cate_ids = cate_ids;
        return this;
    }

    public void setCate_idsIsSet(boolean value) {
        if (value) {
            return;
        }
        this.cate_ids = null;
    }

    public BookLevelInfo setCate_name(String cate_name) {
        this.cate_name = cate_name;
        return this;
    }

    public void setCate_nameIsSet(boolean value) {
        if (value) {
            return;
        }
        this.cate_name = null;
    }

    public BookLevelInfo setNext_cates(List<String> next_cates) {
        this.next_cates = next_cates;
        return this;
    }

    public void setNext_catesIsSet(boolean value) {
        if (value) {
            return;
        }
        this.next_cates = null;
    }

    public BookLevelInfo setRole_id(int role_id) {
        this.role_id = role_id;
        setRole_idIsSet(true);
        return this;
    }

    public void setRole_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("BookLevelInfo(");
        sb2.append("role_id:");
        sb2.append(this.role_id);
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("cate_ids:");
        List<String> list = this.cate_ids;
        if (list == null) {
            sb2.append("null");
        } else {
            sb2.append(list);
        }
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("next_cates:");
        List<String> list2 = this.next_cates;
        if (list2 == null) {
            sb2.append("null");
        } else {
            sb2.append(list2);
        }
        if (isSetCate_name()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("cate_name:");
            String str = this.cate_name;
            if (str == null) {
                sb2.append("null");
            } else {
                sb2.append(str);
            }
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetCate_ids() {
        this.cate_ids = null;
    }

    public void unsetCate_name() {
        this.cate_name = null;
    }

    public void unsetNext_cates() {
        this.next_cates = null;
    }

    public void unsetRole_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void validate() throws TException {
        if (this.cate_ids == null) {
            throw new TProtocolException("Required field 'cate_ids' was not present! Struct: " + toString());
        }
        if (this.next_cates != null) {
            return;
        }
        throw new TProtocolException("Required field 'next_cates' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(BookLevelInfo other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo5 = Boolean.valueOf(isSetRole_id()).compareTo(Boolean.valueOf(other.isSetRole_id()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (isSetRole_id() && (compareTo4 = TBaseHelper.compareTo(this.role_id, other.role_id)) != 0) {
            return compareTo4;
        }
        int compareTo6 = Boolean.valueOf(isSetCate_ids()).compareTo(Boolean.valueOf(other.isSetCate_ids()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (isSetCate_ids() && (compareTo3 = TBaseHelper.compareTo((List) this.cate_ids, (List) other.cate_ids)) != 0) {
            return compareTo3;
        }
        int compareTo7 = Boolean.valueOf(isSetNext_cates()).compareTo(Boolean.valueOf(other.isSetNext_cates()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (isSetNext_cates() && (compareTo2 = TBaseHelper.compareTo((List) this.next_cates, (List) other.next_cates)) != 0) {
            return compareTo2;
        }
        int compareTo8 = Boolean.valueOf(isSetCate_name()).compareTo(Boolean.valueOf(other.isSetCate_name()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (!isSetCate_name() || (compareTo = TBaseHelper.compareTo(this.cate_name, other.cate_name)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<BookLevelInfo, _Fields> deepCopy2() {
        return new BookLevelInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$BookLevelInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return Integer.valueOf(getRole_id());
        }
        if (i11 == 2) {
            return getCate_ids();
        }
        if (i11 == 3) {
            return getNext_cates();
        }
        if (i11 == 4) {
            return getCate_name();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$BookLevelInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetRole_id();
        }
        if (i11 == 2) {
            return isSetCate_ids();
        }
        if (i11 == 3) {
            return isSetNext_cates();
        }
        if (i11 == 4) {
            return isSetCate_name();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$BookLevelInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetRole_id();
                return;
            } else {
                setRole_id(((Integer) value).intValue());
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetCate_ids();
                return;
            } else {
                setCate_ids((List) value);
                return;
            }
        }
        if (i11 == 3) {
            if (value == null) {
                unsetNext_cates();
                return;
            } else {
                setNext_cates((List) value);
                return;
            }
        }
        if (i11 != 4) {
            return;
        }
        if (value == null) {
            unsetCate_name();
        } else {
            setCate_name((String) value);
        }
    }

    public boolean equals(BookLevelInfo that) {
        if (that == null || this.role_id != that.role_id) {
            return false;
        }
        boolean isSetCate_ids = isSetCate_ids();
        boolean isSetCate_ids2 = that.isSetCate_ids();
        if ((isSetCate_ids || isSetCate_ids2) && !(isSetCate_ids && isSetCate_ids2 && this.cate_ids.equals(that.cate_ids))) {
            return false;
        }
        boolean isSetNext_cates = isSetNext_cates();
        boolean isSetNext_cates2 = that.isSetNext_cates();
        if ((isSetNext_cates || isSetNext_cates2) && !(isSetNext_cates && isSetNext_cates2 && this.next_cates.equals(that.next_cates))) {
            return false;
        }
        boolean isSetCate_name = isSetCate_name();
        boolean isSetCate_name2 = that.isSetCate_name();
        if (isSetCate_name || isSetCate_name2) {
            return isSetCate_name && isSetCate_name2 && this.cate_name.equals(that.cate_name);
        }
        return true;
    }

    public BookLevelInfo(int role_id, List<String> cate_ids, List<String> next_cates) {
        this();
        this.role_id = role_id;
        setRole_idIsSet(true);
        this.cate_ids = cate_ids;
        this.next_cates = next_cates;
    }

    public BookLevelInfo(BookLevelInfo other) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.CATE_NAME};
        this.__isset_bitfield = other.__isset_bitfield;
        this.role_id = other.role_id;
        if (other.isSetCate_ids()) {
            this.cate_ids = new ArrayList(other.cate_ids);
        }
        if (other.isSetNext_cates()) {
            this.next_cates = new ArrayList(other.next_cates);
        }
        if (other.isSetCate_name()) {
            this.cate_name = other.cate_name;
        }
    }
}

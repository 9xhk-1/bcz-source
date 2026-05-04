package com.baicizhan.online.user_book;

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
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class AddBookReq implements TBase<AddBookReq, _Fields>, Serializable, Cloneable, Comparable<AddBookReq> {
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    public String book_name;
    private _Fields[] optionals;
    public List<Integer> tags;
    private static final TStruct STRUCT_DESC = new TStruct("AddBookReq");
    private static final TField BOOK_NAME_FIELD_DESC = new TField("book_name", (byte) 11, 1);
    private static final TField TAGS_FIELD_DESC = new TField("tags", (byte) 15, 2);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.user_book.AddBookReq$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_book$AddBookReq$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$user_book$AddBookReq$_Fields = iArr;
            try {
                iArr[_Fields.BOOK_NAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_book$AddBookReq$_Fields[_Fields.TAGS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AddBookReqStandardScheme extends StandardScheme<AddBookReq> {
        private AddBookReqStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, AddBookReq struct) throws TException {
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
                        TProtocolUtil.skip(iprot, b11);
                    } else if (b11 == 15) {
                        TList readListBegin = iprot.readListBegin();
                        struct.tags = new ArrayList(readListBegin.size);
                        for (int i11 = 0; i11 < readListBegin.size; i11++) {
                            struct.tags.add(Integer.valueOf(iprot.readI32()));
                        }
                        iprot.readListEnd();
                        struct.setTagsIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 11) {
                    struct.book_name = iprot.readString();
                    struct.setBook_nameIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, AddBookReq struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(AddBookReq.STRUCT_DESC);
            if (struct.book_name != null) {
                oprot.writeFieldBegin(AddBookReq.BOOK_NAME_FIELD_DESC);
                oprot.writeString(struct.book_name);
                oprot.writeFieldEnd();
            }
            if (struct.tags != null && struct.isSetTags()) {
                oprot.writeFieldBegin(AddBookReq.TAGS_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 8, struct.tags.size()));
                Iterator<Integer> it = struct.tags.iterator();
                while (it.hasNext()) {
                    oprot.writeI32(it.next().intValue());
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AddBookReqStandardSchemeFactory implements SchemeFactory {
        private AddBookReqStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public AddBookReqStandardScheme getScheme() {
            return new AddBookReqStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AddBookReqTupleScheme extends TupleScheme<AddBookReq> {
        private AddBookReqTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, AddBookReq struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.book_name = tTupleProtocol.readString();
            struct.setBook_nameIsSet(true);
            if (tTupleProtocol.readBitSet(1).get(0)) {
                TList tList = new TList((byte) 8, tTupleProtocol.readI32());
                struct.tags = new ArrayList(tList.size);
                for (int i11 = 0; i11 < tList.size; i11++) {
                    struct.tags.add(Integer.valueOf(tTupleProtocol.readI32()));
                }
                struct.setTagsIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, AddBookReq struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeString(struct.book_name);
            BitSet bitSet = new BitSet();
            if (struct.isSetTags()) {
                bitSet.set(0);
            }
            tTupleProtocol.writeBitSet(bitSet, 1);
            if (struct.isSetTags()) {
                tTupleProtocol.writeI32(struct.tags.size());
                Iterator<Integer> it = struct.tags.iterator();
                while (it.hasNext()) {
                    tTupleProtocol.writeI32(it.next().intValue());
                }
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AddBookReqTupleSchemeFactory implements SchemeFactory {
        private AddBookReqTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public AddBookReqTupleScheme getScheme() {
            return new AddBookReqTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        BOOK_NAME(1, "book_name"),
        TAGS(2, "tags");

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
                return BOOK_NAME;
            }
            if (fieldId != 2) {
                return null;
            }
            return TAGS;
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
        hashMap.put(StandardScheme.class, new AddBookReqStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new AddBookReqTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.BOOK_NAME, (_Fields) new FieldMetaData("book_name", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.TAGS, (_Fields) new FieldMetaData("tags", (byte) 2, new ListMetaData((byte) 15, new FieldValueMetaData((byte) 8))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(AddBookReq.class, unmodifiableMap);
    }

    public AddBookReq() {
        this.optionals = new _Fields[]{_Fields.TAGS};
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

    public void addToTags(int elem) {
        if (this.tags == null) {
            this.tags = new ArrayList();
        }
        this.tags.add(Integer.valueOf(elem));
    }

    @Override // org.apache.thrift.TBase
    public void clear() {
        this.book_name = null;
        this.tags = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof AddBookReq)) {
            return equals((AddBookReq) that);
        }
        return false;
    }

    public String getBook_name() {
        return this.book_name;
    }

    public List<Integer> getTags() {
        return this.tags;
    }

    public Iterator<Integer> getTagsIterator() {
        List<Integer> list = this.tags;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getTagsSize() {
        List<Integer> list = this.tags;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetBook_name() {
        return this.book_name != null;
    }

    public boolean isSetTags() {
        return this.tags != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public AddBookReq setBook_name(String book_name) {
        this.book_name = book_name;
        return this;
    }

    public void setBook_nameIsSet(boolean value) {
        if (value) {
            return;
        }
        this.book_name = null;
    }

    public AddBookReq setTags(List<Integer> tags) {
        this.tags = tags;
        return this;
    }

    public void setTagsIsSet(boolean value) {
        if (value) {
            return;
        }
        this.tags = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AddBookReq(");
        sb2.append("book_name:");
        String str = this.book_name;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        if (isSetTags()) {
            sb2.append(j2.O);
            sb2.append("tags:");
            List<Integer> list = this.tags;
            if (list == null) {
                sb2.append("null");
            } else {
                sb2.append(list);
            }
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetBook_name() {
        this.book_name = null;
    }

    public void unsetTags() {
        this.tags = null;
    }

    public void validate() throws TException {
        if (this.book_name != null) {
            return;
        }
        throw new TProtocolException("Required field 'book_name' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(AddBookReq other) {
        int compareTo;
        int compareTo2;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo3 = Boolean.valueOf(isSetBook_name()).compareTo(Boolean.valueOf(other.isSetBook_name()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (isSetBook_name() && (compareTo2 = TBaseHelper.compareTo(this.book_name, other.book_name)) != 0) {
            return compareTo2;
        }
        int compareTo4 = Boolean.valueOf(isSetTags()).compareTo(Boolean.valueOf(other.isSetTags()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (!isSetTags() || (compareTo = TBaseHelper.compareTo((List) this.tags, (List) other.tags)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<AddBookReq, _Fields> deepCopy2() {
        return new AddBookReq(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_book$AddBookReq$_Fields[field.ordinal()];
        if (i11 == 1) {
            return getBook_name();
        }
        if (i11 == 2) {
            return getTags();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_book$AddBookReq$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetBook_name();
        }
        if (i11 == 2) {
            return isSetTags();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_book$AddBookReq$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetBook_name();
                return;
            } else {
                setBook_name((String) value);
                return;
            }
        }
        if (i11 != 2) {
            return;
        }
        if (value == null) {
            unsetTags();
        } else {
            setTags((List) value);
        }
    }

    public AddBookReq(String book_name) {
        this();
        this.book_name = book_name;
    }

    public boolean equals(AddBookReq that) {
        if (that == null) {
            return false;
        }
        boolean isSetBook_name = isSetBook_name();
        boolean isSetBook_name2 = that.isSetBook_name();
        if ((isSetBook_name || isSetBook_name2) && !(isSetBook_name && isSetBook_name2 && this.book_name.equals(that.book_name))) {
            return false;
        }
        boolean isSetTags = isSetTags();
        boolean isSetTags2 = that.isSetTags();
        if (isSetTags || isSetTags2) {
            return isSetTags && isSetTags2 && this.tags.equals(that.tags);
        }
        return true;
    }

    public AddBookReq(AddBookReq other) {
        this.optionals = new _Fields[]{_Fields.TAGS};
        if (other.isSetBook_name()) {
            this.book_name = other.book_name;
        }
        if (other.isSetTags()) {
            this.tags = new ArrayList(other.tags);
        }
    }
}

package com.baicizhan.online.user_book;

import com.baicizhan.main.collectreview.ui.CollectReviewActivity;
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
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class UserBookItem implements TBase<UserBookItem, _Fields>, Serializable, Cloneable, Comparable<UserBookItem> {
    private static final int __DAILY_PLAN_COUNT_ISSET_ID = 3;
    private static final int __UPDATED_AT_ISSET_ID = 2;
    private static final int __USER_BOOK_ID_ISSET_ID = 0;
    private static final int __WORD_NUM_ISSET_ID = 1;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public String book_name;
    public String cover;
    public int daily_plan_count;
    private _Fields[] optionals;
    public List<Integer> tags;
    public long updated_at;
    public long user_book_id;
    public int word_num;
    private static final TStruct STRUCT_DESC = new TStruct("UserBookItem");
    private static final TField USER_BOOK_ID_FIELD_DESC = new TField(CollectReviewActivity.G, (byte) 10, 1);
    private static final TField BOOK_NAME_FIELD_DESC = new TField("book_name", (byte) 11, 2);
    private static final TField WORD_NUM_FIELD_DESC = new TField("word_num", (byte) 8, 3);
    private static final TField COVER_FIELD_DESC = new TField("cover", (byte) 11, 4);
    private static final TField UPDATED_AT_FIELD_DESC = new TField("updated_at", (byte) 10, 5);
    private static final TField DAILY_PLAN_COUNT_FIELD_DESC = new TField("daily_plan_count", (byte) 8, 6);
    private static final TField TAGS_FIELD_DESC = new TField("tags", (byte) 15, 7);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.user_book.UserBookItem$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_book$UserBookItem$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$user_book$UserBookItem$_Fields = iArr;
            try {
                iArr[_Fields.USER_BOOK_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_book$UserBookItem$_Fields[_Fields.BOOK_NAME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_book$UserBookItem$_Fields[_Fields.WORD_NUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_book$UserBookItem$_Fields[_Fields.COVER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_book$UserBookItem$_Fields[_Fields.UPDATED_AT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_book$UserBookItem$_Fields[_Fields.DAILY_PLAN_COUNT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_book$UserBookItem$_Fields[_Fields.TAGS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserBookItemStandardScheme extends StandardScheme<UserBookItem> {
        private UserBookItemStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, UserBookItem struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    iprot.readStructEnd();
                    if (!struct.isSetUser_book_id()) {
                        throw new TProtocolException("Required field 'user_book_id' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetWord_num()) {
                        throw new TProtocolException("Required field 'word_num' was not found in serialized data! Struct: " + toString());
                    }
                    if (struct.isSetUpdated_at()) {
                        struct.validate();
                        return;
                    }
                    throw new TProtocolException("Required field 'updated_at' was not found in serialized data! Struct: " + toString());
                }
                switch (readFieldBegin.f77768id) {
                    case 1:
                        if (b11 == 10) {
                            struct.user_book_id = iprot.readI64();
                            struct.setUser_book_idIsSet(true);
                            break;
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        }
                    case 2:
                        if (b11 == 11) {
                            struct.book_name = iprot.readString();
                            struct.setBook_nameIsSet(true);
                            break;
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        }
                    case 3:
                        if (b11 == 8) {
                            struct.word_num = iprot.readI32();
                            struct.setWord_numIsSet(true);
                            break;
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        }
                    case 4:
                        if (b11 == 11) {
                            struct.cover = iprot.readString();
                            struct.setCoverIsSet(true);
                            break;
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        }
                    case 5:
                        if (b11 == 10) {
                            struct.updated_at = iprot.readI64();
                            struct.setUpdated_atIsSet(true);
                            break;
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        }
                    case 6:
                        if (b11 == 8) {
                            struct.daily_plan_count = iprot.readI32();
                            struct.setDaily_plan_countIsSet(true);
                            break;
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        }
                    case 7:
                        if (b11 == 15) {
                            TList readListBegin = iprot.readListBegin();
                            struct.tags = new ArrayList(readListBegin.size);
                            for (int i11 = 0; i11 < readListBegin.size; i11++) {
                                struct.tags.add(Integer.valueOf(iprot.readI32()));
                            }
                            iprot.readListEnd();
                            struct.setTagsIsSet(true);
                            break;
                        } else {
                            TProtocolUtil.skip(iprot, b11);
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
        public void write(TProtocol oprot, UserBookItem struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(UserBookItem.STRUCT_DESC);
            oprot.writeFieldBegin(UserBookItem.USER_BOOK_ID_FIELD_DESC);
            oprot.writeI64(struct.user_book_id);
            oprot.writeFieldEnd();
            if (struct.book_name != null) {
                oprot.writeFieldBegin(UserBookItem.BOOK_NAME_FIELD_DESC);
                oprot.writeString(struct.book_name);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(UserBookItem.WORD_NUM_FIELD_DESC);
            oprot.writeI32(struct.word_num);
            oprot.writeFieldEnd();
            if (struct.cover != null) {
                oprot.writeFieldBegin(UserBookItem.COVER_FIELD_DESC);
                oprot.writeString(struct.cover);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(UserBookItem.UPDATED_AT_FIELD_DESC);
            oprot.writeI64(struct.updated_at);
            oprot.writeFieldEnd();
            if (struct.isSetDaily_plan_count()) {
                oprot.writeFieldBegin(UserBookItem.DAILY_PLAN_COUNT_FIELD_DESC);
                oprot.writeI32(struct.daily_plan_count);
                oprot.writeFieldEnd();
            }
            if (struct.tags != null && struct.isSetTags()) {
                oprot.writeFieldBegin(UserBookItem.TAGS_FIELD_DESC);
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
    public static class UserBookItemStandardSchemeFactory implements SchemeFactory {
        private UserBookItemStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public UserBookItemStandardScheme getScheme() {
            return new UserBookItemStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserBookItemTupleScheme extends TupleScheme<UserBookItem> {
        private UserBookItemTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, UserBookItem struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.user_book_id = tTupleProtocol.readI64();
            struct.setUser_book_idIsSet(true);
            struct.book_name = tTupleProtocol.readString();
            struct.setBook_nameIsSet(true);
            struct.word_num = tTupleProtocol.readI32();
            struct.setWord_numIsSet(true);
            struct.cover = tTupleProtocol.readString();
            struct.setCoverIsSet(true);
            struct.updated_at = tTupleProtocol.readI64();
            struct.setUpdated_atIsSet(true);
            BitSet readBitSet = tTupleProtocol.readBitSet(2);
            if (readBitSet.get(0)) {
                struct.daily_plan_count = tTupleProtocol.readI32();
                struct.setDaily_plan_countIsSet(true);
            }
            if (readBitSet.get(1)) {
                TList tList = new TList((byte) 8, tTupleProtocol.readI32());
                struct.tags = new ArrayList(tList.size);
                for (int i11 = 0; i11 < tList.size; i11++) {
                    struct.tags.add(Integer.valueOf(tTupleProtocol.readI32()));
                }
                struct.setTagsIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, UserBookItem struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI64(struct.user_book_id);
            tTupleProtocol.writeString(struct.book_name);
            tTupleProtocol.writeI32(struct.word_num);
            tTupleProtocol.writeString(struct.cover);
            tTupleProtocol.writeI64(struct.updated_at);
            BitSet bitSet = new BitSet();
            if (struct.isSetDaily_plan_count()) {
                bitSet.set(0);
            }
            if (struct.isSetTags()) {
                bitSet.set(1);
            }
            tTupleProtocol.writeBitSet(bitSet, 2);
            if (struct.isSetDaily_plan_count()) {
                tTupleProtocol.writeI32(struct.daily_plan_count);
            }
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
    public static class UserBookItemTupleSchemeFactory implements SchemeFactory {
        private UserBookItemTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public UserBookItemTupleScheme getScheme() {
            return new UserBookItemTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        USER_BOOK_ID(1, CollectReviewActivity.G),
        BOOK_NAME(2, "book_name"),
        WORD_NUM(3, "word_num"),
        COVER(4, "cover"),
        UPDATED_AT(5, "updated_at"),
        DAILY_PLAN_COUNT(6, "daily_plan_count"),
        TAGS(7, "tags");

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
                    return USER_BOOK_ID;
                case 2:
                    return BOOK_NAME;
                case 3:
                    return WORD_NUM;
                case 4:
                    return COVER;
                case 5:
                    return UPDATED_AT;
                case 6:
                    return DAILY_PLAN_COUNT;
                case 7:
                    return TAGS;
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
        hashMap.put(StandardScheme.class, new UserBookItemStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new UserBookItemTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.USER_BOOK_ID, (_Fields) new FieldMetaData(CollectReviewActivity.G, (byte) 1, new FieldValueMetaData((byte) 10)));
        enumMap.put((EnumMap) _Fields.BOOK_NAME, (_Fields) new FieldMetaData("book_name", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.WORD_NUM, (_Fields) new FieldMetaData("word_num", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.COVER, (_Fields) new FieldMetaData("cover", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.UPDATED_AT, (_Fields) new FieldMetaData("updated_at", (byte) 1, new FieldValueMetaData((byte) 10)));
        enumMap.put((EnumMap) _Fields.DAILY_PLAN_COUNT, (_Fields) new FieldMetaData("daily_plan_count", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.TAGS, (_Fields) new FieldMetaData("tags", (byte) 2, new ListMetaData((byte) 15, new FieldValueMetaData((byte) 8))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(UserBookItem.class, unmodifiableMap);
    }

    public UserBookItem() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.DAILY_PLAN_COUNT, _Fields.TAGS};
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

    public void addToTags(int elem) {
        if (this.tags == null) {
            this.tags = new ArrayList();
        }
        this.tags.add(Integer.valueOf(elem));
    }

    @Override // org.apache.thrift.TBase
    public void clear() {
        setUser_book_idIsSet(false);
        this.user_book_id = 0L;
        this.book_name = null;
        setWord_numIsSet(false);
        this.word_num = 0;
        this.cover = null;
        setUpdated_atIsSet(false);
        this.updated_at = 0L;
        setDaily_plan_countIsSet(false);
        this.daily_plan_count = 0;
        this.tags = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof UserBookItem)) {
            return equals((UserBookItem) that);
        }
        return false;
    }

    public String getBook_name() {
        return this.book_name;
    }

    public String getCover() {
        return this.cover;
    }

    public int getDaily_plan_count() {
        return this.daily_plan_count;
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

    public long getUpdated_at() {
        return this.updated_at;
    }

    public long getUser_book_id() {
        return this.user_book_id;
    }

    public int getWord_num() {
        return this.word_num;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetBook_name() {
        return this.book_name != null;
    }

    public boolean isSetCover() {
        return this.cover != null;
    }

    public boolean isSetDaily_plan_count() {
        return EncodingUtils.testBit(this.__isset_bitfield, 3);
    }

    public boolean isSetTags() {
        return this.tags != null;
    }

    public boolean isSetUpdated_at() {
        return EncodingUtils.testBit(this.__isset_bitfield, 2);
    }

    public boolean isSetUser_book_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetWord_num() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public UserBookItem setBook_name(String book_name) {
        this.book_name = book_name;
        return this;
    }

    public void setBook_nameIsSet(boolean value) {
        if (value) {
            return;
        }
        this.book_name = null;
    }

    public UserBookItem setCover(String cover) {
        this.cover = cover;
        return this;
    }

    public void setCoverIsSet(boolean value) {
        if (value) {
            return;
        }
        this.cover = null;
    }

    public UserBookItem setDaily_plan_count(int daily_plan_count) {
        this.daily_plan_count = daily_plan_count;
        setDaily_plan_countIsSet(true);
        return this;
    }

    public void setDaily_plan_countIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 3, value);
    }

    public UserBookItem setTags(List<Integer> tags) {
        this.tags = tags;
        return this;
    }

    public void setTagsIsSet(boolean value) {
        if (value) {
            return;
        }
        this.tags = null;
    }

    public UserBookItem setUpdated_at(long updated_at) {
        this.updated_at = updated_at;
        setUpdated_atIsSet(true);
        return this;
    }

    public void setUpdated_atIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 2, value);
    }

    public UserBookItem setUser_book_id(long user_book_id) {
        this.user_book_id = user_book_id;
        setUser_book_idIsSet(true);
        return this;
    }

    public void setUser_book_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public UserBookItem setWord_num(int word_num) {
        this.word_num = word_num;
        setWord_numIsSet(true);
        return this;
    }

    public void setWord_numIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("UserBookItem(");
        sb2.append("user_book_id:");
        sb2.append(this.user_book_id);
        sb2.append(j2.O);
        sb2.append("book_name:");
        String str = this.book_name;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(j2.O);
        sb2.append("word_num:");
        sb2.append(this.word_num);
        sb2.append(j2.O);
        sb2.append("cover:");
        String str2 = this.cover;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(str2);
        }
        sb2.append(j2.O);
        sb2.append("updated_at:");
        sb2.append(this.updated_at);
        if (isSetDaily_plan_count()) {
            sb2.append(j2.O);
            sb2.append("daily_plan_count:");
            sb2.append(this.daily_plan_count);
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

    public void unsetCover() {
        this.cover = null;
    }

    public void unsetDaily_plan_count() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 3);
    }

    public void unsetTags() {
        this.tags = null;
    }

    public void unsetUpdated_at() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 2);
    }

    public void unsetUser_book_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetWord_num() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void validate() throws TException {
        if (this.book_name == null) {
            throw new TProtocolException("Required field 'book_name' was not present! Struct: " + toString());
        }
        if (this.cover != null) {
            return;
        }
        throw new TProtocolException("Required field 'cover' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(UserBookItem other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        int compareTo5;
        int compareTo6;
        int compareTo7;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo8 = Boolean.valueOf(isSetUser_book_id()).compareTo(Boolean.valueOf(other.isSetUser_book_id()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (isSetUser_book_id() && (compareTo7 = TBaseHelper.compareTo(this.user_book_id, other.user_book_id)) != 0) {
            return compareTo7;
        }
        int compareTo9 = Boolean.valueOf(isSetBook_name()).compareTo(Boolean.valueOf(other.isSetBook_name()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (isSetBook_name() && (compareTo6 = TBaseHelper.compareTo(this.book_name, other.book_name)) != 0) {
            return compareTo6;
        }
        int compareTo10 = Boolean.valueOf(isSetWord_num()).compareTo(Boolean.valueOf(other.isSetWord_num()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (isSetWord_num() && (compareTo5 = TBaseHelper.compareTo(this.word_num, other.word_num)) != 0) {
            return compareTo5;
        }
        int compareTo11 = Boolean.valueOf(isSetCover()).compareTo(Boolean.valueOf(other.isSetCover()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (isSetCover() && (compareTo4 = TBaseHelper.compareTo(this.cover, other.cover)) != 0) {
            return compareTo4;
        }
        int compareTo12 = Boolean.valueOf(isSetUpdated_at()).compareTo(Boolean.valueOf(other.isSetUpdated_at()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (isSetUpdated_at() && (compareTo3 = TBaseHelper.compareTo(this.updated_at, other.updated_at)) != 0) {
            return compareTo3;
        }
        int compareTo13 = Boolean.valueOf(isSetDaily_plan_count()).compareTo(Boolean.valueOf(other.isSetDaily_plan_count()));
        if (compareTo13 != 0) {
            return compareTo13;
        }
        if (isSetDaily_plan_count() && (compareTo2 = TBaseHelper.compareTo(this.daily_plan_count, other.daily_plan_count)) != 0) {
            return compareTo2;
        }
        int compareTo14 = Boolean.valueOf(isSetTags()).compareTo(Boolean.valueOf(other.isSetTags()));
        if (compareTo14 != 0) {
            return compareTo14;
        }
        if (!isSetTags() || (compareTo = TBaseHelper.compareTo((List) this.tags, (List) other.tags)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<UserBookItem, _Fields> deepCopy2() {
        return new UserBookItem(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_book$UserBookItem$_Fields[field.ordinal()]) {
            case 1:
                return Long.valueOf(getUser_book_id());
            case 2:
                return getBook_name();
            case 3:
                return Integer.valueOf(getWord_num());
            case 4:
                return getCover();
            case 5:
                return Long.valueOf(getUpdated_at());
            case 6:
                return Integer.valueOf(getDaily_plan_count());
            case 7:
                return getTags();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_book$UserBookItem$_Fields[field.ordinal()]) {
            case 1:
                return isSetUser_book_id();
            case 2:
                return isSetBook_name();
            case 3:
                return isSetWord_num();
            case 4:
                return isSetCover();
            case 5:
                return isSetUpdated_at();
            case 6:
                return isSetDaily_plan_count();
            case 7:
                return isSetTags();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_book$UserBookItem$_Fields[field.ordinal()]) {
            case 1:
                if (value != null) {
                    setUser_book_id(((Long) value).longValue());
                    break;
                } else {
                    unsetUser_book_id();
                    break;
                }
            case 2:
                if (value != null) {
                    setBook_name((String) value);
                    break;
                } else {
                    unsetBook_name();
                    break;
                }
            case 3:
                if (value != null) {
                    setWord_num(((Integer) value).intValue());
                    break;
                } else {
                    unsetWord_num();
                    break;
                }
            case 4:
                if (value != null) {
                    setCover((String) value);
                    break;
                } else {
                    unsetCover();
                    break;
                }
            case 5:
                if (value != null) {
                    setUpdated_at(((Long) value).longValue());
                    break;
                } else {
                    unsetUpdated_at();
                    break;
                }
            case 6:
                if (value != null) {
                    setDaily_plan_count(((Integer) value).intValue());
                    break;
                } else {
                    unsetDaily_plan_count();
                    break;
                }
            case 7:
                if (value != null) {
                    setTags((List) value);
                    break;
                } else {
                    unsetTags();
                    break;
                }
        }
    }

    public boolean equals(UserBookItem that) {
        if (that == null || this.user_book_id != that.user_book_id) {
            return false;
        }
        boolean isSetBook_name = isSetBook_name();
        boolean isSetBook_name2 = that.isSetBook_name();
        if (((isSetBook_name || isSetBook_name2) && !(isSetBook_name && isSetBook_name2 && this.book_name.equals(that.book_name))) || this.word_num != that.word_num) {
            return false;
        }
        boolean isSetCover = isSetCover();
        boolean isSetCover2 = that.isSetCover();
        if (((isSetCover || isSetCover2) && !(isSetCover && isSetCover2 && this.cover.equals(that.cover))) || this.updated_at != that.updated_at) {
            return false;
        }
        boolean isSetDaily_plan_count = isSetDaily_plan_count();
        boolean isSetDaily_plan_count2 = that.isSetDaily_plan_count();
        if ((isSetDaily_plan_count || isSetDaily_plan_count2) && !(isSetDaily_plan_count && isSetDaily_plan_count2 && this.daily_plan_count == that.daily_plan_count)) {
            return false;
        }
        boolean isSetTags = isSetTags();
        boolean isSetTags2 = that.isSetTags();
        if (isSetTags || isSetTags2) {
            return isSetTags && isSetTags2 && this.tags.equals(that.tags);
        }
        return true;
    }

    public UserBookItem(long user_book_id, String book_name, int word_num, String cover, long updated_at) {
        this();
        this.user_book_id = user_book_id;
        setUser_book_idIsSet(true);
        this.book_name = book_name;
        this.word_num = word_num;
        setWord_numIsSet(true);
        this.cover = cover;
        this.updated_at = updated_at;
        setUpdated_atIsSet(true);
    }

    public UserBookItem(UserBookItem other) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.DAILY_PLAN_COUNT, _Fields.TAGS};
        this.__isset_bitfield = other.__isset_bitfield;
        this.user_book_id = other.user_book_id;
        if (other.isSetBook_name()) {
            this.book_name = other.book_name;
        }
        this.word_num = other.word_num;
        if (other.isSetCover()) {
            this.cover = other.cover;
        }
        this.updated_at = other.updated_at;
        this.daily_plan_count = other.daily_plan_count;
        if (other.isSetTags()) {
            this.tags = new ArrayList(other.tags);
        }
    }
}

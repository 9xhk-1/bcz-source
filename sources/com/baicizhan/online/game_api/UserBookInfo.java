package com.baicizhan.online.game_api;

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
/* loaded from: classes5.dex */
public class UserBookInfo implements TBase<UserBookInfo, _Fields>, Serializable, Cloneable, Comparable<UserBookInfo> {
    private static final int __BOOK_ID_ISSET_ID = 0;
    private static final int __COUNT_PER_ROUND_ISSET_ID = 1;
    private static final int __PREMIUM_BOOK_ISSET_ID = 2;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public int book_id;
    public String book_img;
    public String book_name;
    public int count_per_round;
    public List<Integer> modes;
    private _Fields[] optionals;
    public int premium_book;
    private static final TStruct STRUCT_DESC = new TStruct("UserBookInfo");
    private static final TField BOOK_ID_FIELD_DESC = new TField("book_id", (byte) 8, 1);
    private static final TField BOOK_NAME_FIELD_DESC = new TField("book_name", (byte) 11, 2);
    private static final TField MODES_FIELD_DESC = new TField("modes", (byte) 15, 3);
    private static final TField COUNT_PER_ROUND_FIELD_DESC = new TField("count_per_round", (byte) 8, 4);
    private static final TField PREMIUM_BOOK_FIELD_DESC = new TField("premium_book", (byte) 8, 5);
    private static final TField BOOK_IMG_FIELD_DESC = new TField("book_img", (byte) 11, 6);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.game_api.UserBookInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$game_api$UserBookInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$game_api$UserBookInfo$_Fields = iArr;
            try {
                iArr[_Fields.BOOK_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$UserBookInfo$_Fields[_Fields.BOOK_NAME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$UserBookInfo$_Fields[_Fields.MODES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$UserBookInfo$_Fields[_Fields.COUNT_PER_ROUND.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$UserBookInfo$_Fields[_Fields.PREMIUM_BOOK.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$UserBookInfo$_Fields[_Fields.BOOK_IMG.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserBookInfoStandardScheme extends StandardScheme<UserBookInfo> {
        private UserBookInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, UserBookInfo struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    iprot.readStructEnd();
                    if (!struct.isSetBook_id()) {
                        throw new TProtocolException("Required field 'book_id' was not found in serialized data! Struct: " + toString());
                    }
                    if (struct.isSetCount_per_round()) {
                        struct.validate();
                        return;
                    }
                    throw new TProtocolException("Required field 'count_per_round' was not found in serialized data! Struct: " + toString());
                }
                switch (readFieldBegin.f77768id) {
                    case 1:
                        if (b11 == 8) {
                            struct.book_id = iprot.readI32();
                            struct.setBook_idIsSet(true);
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
                        if (b11 == 15) {
                            TList readListBegin = iprot.readListBegin();
                            struct.modes = new ArrayList(readListBegin.size);
                            for (int i11 = 0; i11 < readListBegin.size; i11++) {
                                struct.modes.add(Integer.valueOf(iprot.readI32()));
                            }
                            iprot.readListEnd();
                            struct.setModesIsSet(true);
                            break;
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        }
                    case 4:
                        if (b11 == 8) {
                            struct.count_per_round = iprot.readI32();
                            struct.setCount_per_roundIsSet(true);
                            break;
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        }
                    case 5:
                        if (b11 == 8) {
                            struct.premium_book = iprot.readI32();
                            struct.setPremium_bookIsSet(true);
                            break;
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        }
                    case 6:
                        if (b11 == 11) {
                            struct.book_img = iprot.readString();
                            struct.setBook_imgIsSet(true);
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
        public void write(TProtocol oprot, UserBookInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(UserBookInfo.STRUCT_DESC);
            oprot.writeFieldBegin(UserBookInfo.BOOK_ID_FIELD_DESC);
            oprot.writeI32(struct.book_id);
            oprot.writeFieldEnd();
            if (struct.book_name != null) {
                oprot.writeFieldBegin(UserBookInfo.BOOK_NAME_FIELD_DESC);
                oprot.writeString(struct.book_name);
                oprot.writeFieldEnd();
            }
            if (struct.modes != null) {
                oprot.writeFieldBegin(UserBookInfo.MODES_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 8, struct.modes.size()));
                Iterator<Integer> it = struct.modes.iterator();
                while (it.hasNext()) {
                    oprot.writeI32(it.next().intValue());
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(UserBookInfo.COUNT_PER_ROUND_FIELD_DESC);
            oprot.writeI32(struct.count_per_round);
            oprot.writeFieldEnd();
            if (struct.isSetPremium_book()) {
                oprot.writeFieldBegin(UserBookInfo.PREMIUM_BOOK_FIELD_DESC);
                oprot.writeI32(struct.premium_book);
                oprot.writeFieldEnd();
            }
            if (struct.book_img != null && struct.isSetBook_img()) {
                oprot.writeFieldBegin(UserBookInfo.BOOK_IMG_FIELD_DESC);
                oprot.writeString(struct.book_img);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserBookInfoStandardSchemeFactory implements SchemeFactory {
        private UserBookInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public UserBookInfoStandardScheme getScheme() {
            return new UserBookInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserBookInfoTupleScheme extends TupleScheme<UserBookInfo> {
        private UserBookInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, UserBookInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.book_id = tTupleProtocol.readI32();
            struct.setBook_idIsSet(true);
            struct.book_name = tTupleProtocol.readString();
            struct.setBook_nameIsSet(true);
            TList tList = new TList((byte) 8, tTupleProtocol.readI32());
            struct.modes = new ArrayList(tList.size);
            for (int i11 = 0; i11 < tList.size; i11++) {
                struct.modes.add(Integer.valueOf(tTupleProtocol.readI32()));
            }
            struct.setModesIsSet(true);
            struct.count_per_round = tTupleProtocol.readI32();
            struct.setCount_per_roundIsSet(true);
            BitSet readBitSet = tTupleProtocol.readBitSet(2);
            if (readBitSet.get(0)) {
                struct.premium_book = tTupleProtocol.readI32();
                struct.setPremium_bookIsSet(true);
            }
            if (readBitSet.get(1)) {
                struct.book_img = tTupleProtocol.readString();
                struct.setBook_imgIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, UserBookInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.book_id);
            tTupleProtocol.writeString(struct.book_name);
            tTupleProtocol.writeI32(struct.modes.size());
            Iterator<Integer> it = struct.modes.iterator();
            while (it.hasNext()) {
                tTupleProtocol.writeI32(it.next().intValue());
            }
            tTupleProtocol.writeI32(struct.count_per_round);
            BitSet bitSet = new BitSet();
            if (struct.isSetPremium_book()) {
                bitSet.set(0);
            }
            if (struct.isSetBook_img()) {
                bitSet.set(1);
            }
            tTupleProtocol.writeBitSet(bitSet, 2);
            if (struct.isSetPremium_book()) {
                tTupleProtocol.writeI32(struct.premium_book);
            }
            if (struct.isSetBook_img()) {
                tTupleProtocol.writeString(struct.book_img);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserBookInfoTupleSchemeFactory implements SchemeFactory {
        private UserBookInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public UserBookInfoTupleScheme getScheme() {
            return new UserBookInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        BOOK_ID(1, "book_id"),
        BOOK_NAME(2, "book_name"),
        MODES(3, "modes"),
        COUNT_PER_ROUND(4, "count_per_round"),
        PREMIUM_BOOK(5, "premium_book"),
        BOOK_IMG(6, "book_img");

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
                    return BOOK_NAME;
                case 3:
                    return MODES;
                case 4:
                    return COUNT_PER_ROUND;
                case 5:
                    return PREMIUM_BOOK;
                case 6:
                    return BOOK_IMG;
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
        hashMap.put(StandardScheme.class, new UserBookInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new UserBookInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.BOOK_ID, (_Fields) new FieldMetaData("book_id", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.BOOK_NAME, (_Fields) new FieldMetaData("book_name", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.MODES, (_Fields) new FieldMetaData("modes", (byte) 1, new ListMetaData((byte) 15, new FieldValueMetaData((byte) 8))));
        enumMap.put((EnumMap) _Fields.COUNT_PER_ROUND, (_Fields) new FieldMetaData("count_per_round", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.PREMIUM_BOOK, (_Fields) new FieldMetaData("premium_book", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.BOOK_IMG, (_Fields) new FieldMetaData("book_img", (byte) 2, new FieldValueMetaData((byte) 11)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(UserBookInfo.class, unmodifiableMap);
    }

    public UserBookInfo() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.PREMIUM_BOOK, _Fields.BOOK_IMG};
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

    public void addToModes(int elem) {
        if (this.modes == null) {
            this.modes = new ArrayList();
        }
        this.modes.add(Integer.valueOf(elem));
    }

    @Override // org.apache.thrift.TBase
    public void clear() {
        setBook_idIsSet(false);
        this.book_id = 0;
        this.book_name = null;
        this.modes = null;
        setCount_per_roundIsSet(false);
        this.count_per_round = 0;
        setPremium_bookIsSet(false);
        this.premium_book = 0;
        this.book_img = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof UserBookInfo)) {
            return equals((UserBookInfo) that);
        }
        return false;
    }

    public int getBook_id() {
        return this.book_id;
    }

    public String getBook_img() {
        return this.book_img;
    }

    public String getBook_name() {
        return this.book_name;
    }

    public int getCount_per_round() {
        return this.count_per_round;
    }

    public List<Integer> getModes() {
        return this.modes;
    }

    public Iterator<Integer> getModesIterator() {
        List<Integer> list = this.modes;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getModesSize() {
        List<Integer> list = this.modes;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public int getPremium_book() {
        return this.premium_book;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetBook_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetBook_img() {
        return this.book_img != null;
    }

    public boolean isSetBook_name() {
        return this.book_name != null;
    }

    public boolean isSetCount_per_round() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetModes() {
        return this.modes != null;
    }

    public boolean isSetPremium_book() {
        return EncodingUtils.testBit(this.__isset_bitfield, 2);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public UserBookInfo setBook_id(int book_id) {
        this.book_id = book_id;
        setBook_idIsSet(true);
        return this;
    }

    public void setBook_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public UserBookInfo setBook_img(String book_img) {
        this.book_img = book_img;
        return this;
    }

    public void setBook_imgIsSet(boolean value) {
        if (value) {
            return;
        }
        this.book_img = null;
    }

    public UserBookInfo setBook_name(String book_name) {
        this.book_name = book_name;
        return this;
    }

    public void setBook_nameIsSet(boolean value) {
        if (value) {
            return;
        }
        this.book_name = null;
    }

    public UserBookInfo setCount_per_round(int count_per_round) {
        this.count_per_round = count_per_round;
        setCount_per_roundIsSet(true);
        return this;
    }

    public void setCount_per_roundIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public UserBookInfo setModes(List<Integer> modes) {
        this.modes = modes;
        return this;
    }

    public void setModesIsSet(boolean value) {
        if (value) {
            return;
        }
        this.modes = null;
    }

    public UserBookInfo setPremium_book(int premium_book) {
        this.premium_book = premium_book;
        setPremium_bookIsSet(true);
        return this;
    }

    public void setPremium_bookIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 2, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("UserBookInfo(");
        sb2.append("book_id:");
        sb2.append(this.book_id);
        sb2.append(j2.O);
        sb2.append("book_name:");
        String str = this.book_name;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(j2.O);
        sb2.append("modes:");
        List<Integer> list = this.modes;
        if (list == null) {
            sb2.append("null");
        } else {
            sb2.append(list);
        }
        sb2.append(j2.O);
        sb2.append("count_per_round:");
        sb2.append(this.count_per_round);
        if (isSetPremium_book()) {
            sb2.append(j2.O);
            sb2.append("premium_book:");
            sb2.append(this.premium_book);
        }
        if (isSetBook_img()) {
            sb2.append(j2.O);
            sb2.append("book_img:");
            String str2 = this.book_img;
            if (str2 == null) {
                sb2.append("null");
            } else {
                sb2.append(str2);
            }
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetBook_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetBook_img() {
        this.book_img = null;
    }

    public void unsetBook_name() {
        this.book_name = null;
    }

    public void unsetCount_per_round() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetModes() {
        this.modes = null;
    }

    public void unsetPremium_book() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 2);
    }

    public void validate() throws TException {
        if (this.book_name == null) {
            throw new TProtocolException("Required field 'book_name' was not present! Struct: " + toString());
        }
        if (this.modes != null) {
            return;
        }
        throw new TProtocolException("Required field 'modes' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(UserBookInfo other) {
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
        int compareTo8 = Boolean.valueOf(isSetBook_name()).compareTo(Boolean.valueOf(other.isSetBook_name()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (isSetBook_name() && (compareTo5 = TBaseHelper.compareTo(this.book_name, other.book_name)) != 0) {
            return compareTo5;
        }
        int compareTo9 = Boolean.valueOf(isSetModes()).compareTo(Boolean.valueOf(other.isSetModes()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (isSetModes() && (compareTo4 = TBaseHelper.compareTo((List) this.modes, (List) other.modes)) != 0) {
            return compareTo4;
        }
        int compareTo10 = Boolean.valueOf(isSetCount_per_round()).compareTo(Boolean.valueOf(other.isSetCount_per_round()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (isSetCount_per_round() && (compareTo3 = TBaseHelper.compareTo(this.count_per_round, other.count_per_round)) != 0) {
            return compareTo3;
        }
        int compareTo11 = Boolean.valueOf(isSetPremium_book()).compareTo(Boolean.valueOf(other.isSetPremium_book()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (isSetPremium_book() && (compareTo2 = TBaseHelper.compareTo(this.premium_book, other.premium_book)) != 0) {
            return compareTo2;
        }
        int compareTo12 = Boolean.valueOf(isSetBook_img()).compareTo(Boolean.valueOf(other.isSetBook_img()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (!isSetBook_img() || (compareTo = TBaseHelper.compareTo(this.book_img, other.book_img)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<UserBookInfo, _Fields> deepCopy2() {
        return new UserBookInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$UserBookInfo$_Fields[field.ordinal()]) {
            case 1:
                return Integer.valueOf(getBook_id());
            case 2:
                return getBook_name();
            case 3:
                return getModes();
            case 4:
                return Integer.valueOf(getCount_per_round());
            case 5:
                return Integer.valueOf(getPremium_book());
            case 6:
                return getBook_img();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$UserBookInfo$_Fields[field.ordinal()]) {
            case 1:
                return isSetBook_id();
            case 2:
                return isSetBook_name();
            case 3:
                return isSetModes();
            case 4:
                return isSetCount_per_round();
            case 5:
                return isSetPremium_book();
            case 6:
                return isSetBook_img();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$UserBookInfo$_Fields[field.ordinal()]) {
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
                    setBook_name((String) value);
                    break;
                } else {
                    unsetBook_name();
                    break;
                }
            case 3:
                if (value != null) {
                    setModes((List) value);
                    break;
                } else {
                    unsetModes();
                    break;
                }
            case 4:
                if (value != null) {
                    setCount_per_round(((Integer) value).intValue());
                    break;
                } else {
                    unsetCount_per_round();
                    break;
                }
            case 5:
                if (value != null) {
                    setPremium_book(((Integer) value).intValue());
                    break;
                } else {
                    unsetPremium_book();
                    break;
                }
            case 6:
                if (value != null) {
                    setBook_img((String) value);
                    break;
                } else {
                    unsetBook_img();
                    break;
                }
        }
    }

    public boolean equals(UserBookInfo that) {
        if (that == null || this.book_id != that.book_id) {
            return false;
        }
        boolean isSetBook_name = isSetBook_name();
        boolean isSetBook_name2 = that.isSetBook_name();
        if ((isSetBook_name || isSetBook_name2) && !(isSetBook_name && isSetBook_name2 && this.book_name.equals(that.book_name))) {
            return false;
        }
        boolean isSetModes = isSetModes();
        boolean isSetModes2 = that.isSetModes();
        if (((isSetModes || isSetModes2) && !(isSetModes && isSetModes2 && this.modes.equals(that.modes))) || this.count_per_round != that.count_per_round) {
            return false;
        }
        boolean isSetPremium_book = isSetPremium_book();
        boolean isSetPremium_book2 = that.isSetPremium_book();
        if ((isSetPremium_book || isSetPremium_book2) && !(isSetPremium_book && isSetPremium_book2 && this.premium_book == that.premium_book)) {
            return false;
        }
        boolean isSetBook_img = isSetBook_img();
        boolean isSetBook_img2 = that.isSetBook_img();
        if (isSetBook_img || isSetBook_img2) {
            return isSetBook_img && isSetBook_img2 && this.book_img.equals(that.book_img);
        }
        return true;
    }

    public UserBookInfo(int book_id, String book_name, List<Integer> modes, int count_per_round) {
        this();
        this.book_id = book_id;
        setBook_idIsSet(true);
        this.book_name = book_name;
        this.modes = modes;
        this.count_per_round = count_per_round;
        setCount_per_roundIsSet(true);
    }

    public UserBookInfo(UserBookInfo other) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.PREMIUM_BOOK, _Fields.BOOK_IMG};
        this.__isset_bitfield = other.__isset_bitfield;
        this.book_id = other.book_id;
        if (other.isSetBook_name()) {
            this.book_name = other.book_name;
        }
        if (other.isSetModes()) {
            this.modes = new ArrayList(other.modes);
        }
        this.count_per_round = other.count_per_round;
        this.premium_book = other.premium_book;
        if (other.isSetBook_img()) {
            this.book_img = other.book_img;
        }
    }
}

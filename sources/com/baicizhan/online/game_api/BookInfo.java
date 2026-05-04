package com.baicizhan.online.game_api;

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
public class BookInfo implements TBase<BookInfo, _Fields>, Serializable, Cloneable, Comparable<BookInfo> {
    private static final int __BOOK_ID_ISSET_ID = 0;
    private static final int __LEARNED_ISSET_ID = 2;
    private static final int __MASTERED_ISSET_ID = 3;
    private static final int __REMAIN_DAY_ISSET_ID = 5;
    private static final int __STATUS_ISSET_ID = 4;
    private static final int __TOTAL_COUNT_ISSET_ID = 1;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public int book_id;
    public String book_name;
    public String cover;
    public int learned;
    public int mastered;
    private _Fields[] optionals;
    public int remain_day;
    public int status;
    public int total_count;
    private static final TStruct STRUCT_DESC = new TStruct("BookInfo");
    private static final TField BOOK_ID_FIELD_DESC = new TField("book_id", (byte) 8, 1);
    private static final TField BOOK_NAME_FIELD_DESC = new TField("book_name", (byte) 11, 2);
    private static final TField TOTAL_COUNT_FIELD_DESC = new TField("total_count", (byte) 8, 3);
    private static final TField LEARNED_FIELD_DESC = new TField("learned", (byte) 8, 4);
    private static final TField MASTERED_FIELD_DESC = new TField("mastered", (byte) 8, 5);
    private static final TField COVER_FIELD_DESC = new TField("cover", (byte) 11, 6);
    private static final TField STATUS_FIELD_DESC = new TField("status", (byte) 8, 7);
    private static final TField REMAIN_DAY_FIELD_DESC = new TField("remain_day", (byte) 8, 8);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.game_api.BookInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$game_api$BookInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$game_api$BookInfo$_Fields = iArr;
            try {
                iArr[_Fields.BOOK_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$BookInfo$_Fields[_Fields.BOOK_NAME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$BookInfo$_Fields[_Fields.TOTAL_COUNT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$BookInfo$_Fields[_Fields.LEARNED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$BookInfo$_Fields[_Fields.MASTERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$BookInfo$_Fields[_Fields.COVER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$BookInfo$_Fields[_Fields.STATUS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$BookInfo$_Fields[_Fields.REMAIN_DAY.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BookInfoStandardScheme extends StandardScheme<BookInfo> {
        private BookInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, BookInfo struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    iprot.readStructEnd();
                    if (!struct.isSetBook_id()) {
                        throw new TProtocolException("Required field 'book_id' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetTotal_count()) {
                        throw new TProtocolException("Required field 'total_count' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetLearned()) {
                        throw new TProtocolException("Required field 'learned' was not found in serialized data! Struct: " + toString());
                    }
                    if (struct.isSetMastered()) {
                        struct.validate();
                        return;
                    }
                    throw new TProtocolException("Required field 'mastered' was not found in serialized data! Struct: " + toString());
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
                            struct.book_name = iprot.readString();
                            struct.setBook_nameIsSet(true);
                            break;
                        }
                    case 3:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.total_count = iprot.readI32();
                            struct.setTotal_countIsSet(true);
                            break;
                        }
                    case 4:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.learned = iprot.readI32();
                            struct.setLearnedIsSet(true);
                            break;
                        }
                    case 5:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.mastered = iprot.readI32();
                            struct.setMasteredIsSet(true);
                            break;
                        }
                    case 6:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.cover = iprot.readString();
                            struct.setCoverIsSet(true);
                            break;
                        }
                    case 7:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.status = iprot.readI32();
                            struct.setStatusIsSet(true);
                            break;
                        }
                    case 8:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.remain_day = iprot.readI32();
                            struct.setRemain_dayIsSet(true);
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
        public void write(TProtocol oprot, BookInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(BookInfo.STRUCT_DESC);
            oprot.writeFieldBegin(BookInfo.BOOK_ID_FIELD_DESC);
            oprot.writeI32(struct.book_id);
            oprot.writeFieldEnd();
            if (struct.book_name != null) {
                oprot.writeFieldBegin(BookInfo.BOOK_NAME_FIELD_DESC);
                oprot.writeString(struct.book_name);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(BookInfo.TOTAL_COUNT_FIELD_DESC);
            oprot.writeI32(struct.total_count);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(BookInfo.LEARNED_FIELD_DESC);
            oprot.writeI32(struct.learned);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(BookInfo.MASTERED_FIELD_DESC);
            oprot.writeI32(struct.mastered);
            oprot.writeFieldEnd();
            if (struct.cover != null && struct.isSetCover()) {
                oprot.writeFieldBegin(BookInfo.COVER_FIELD_DESC);
                oprot.writeString(struct.cover);
                oprot.writeFieldEnd();
            }
            if (struct.isSetStatus()) {
                oprot.writeFieldBegin(BookInfo.STATUS_FIELD_DESC);
                oprot.writeI32(struct.status);
                oprot.writeFieldEnd();
            }
            if (struct.isSetRemain_day()) {
                oprot.writeFieldBegin(BookInfo.REMAIN_DAY_FIELD_DESC);
                oprot.writeI32(struct.remain_day);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BookInfoStandardSchemeFactory implements SchemeFactory {
        private BookInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BookInfoStandardScheme getScheme() {
            return new BookInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BookInfoTupleScheme extends TupleScheme<BookInfo> {
        private BookInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, BookInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.book_id = tTupleProtocol.readI32();
            struct.setBook_idIsSet(true);
            struct.book_name = tTupleProtocol.readString();
            struct.setBook_nameIsSet(true);
            struct.total_count = tTupleProtocol.readI32();
            struct.setTotal_countIsSet(true);
            struct.learned = tTupleProtocol.readI32();
            struct.setLearnedIsSet(true);
            struct.mastered = tTupleProtocol.readI32();
            struct.setMasteredIsSet(true);
            BitSet readBitSet = tTupleProtocol.readBitSet(3);
            if (readBitSet.get(0)) {
                struct.cover = tTupleProtocol.readString();
                struct.setCoverIsSet(true);
            }
            if (readBitSet.get(1)) {
                struct.status = tTupleProtocol.readI32();
                struct.setStatusIsSet(true);
            }
            if (readBitSet.get(2)) {
                struct.remain_day = tTupleProtocol.readI32();
                struct.setRemain_dayIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, BookInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.book_id);
            tTupleProtocol.writeString(struct.book_name);
            tTupleProtocol.writeI32(struct.total_count);
            tTupleProtocol.writeI32(struct.learned);
            tTupleProtocol.writeI32(struct.mastered);
            BitSet bitSet = new BitSet();
            if (struct.isSetCover()) {
                bitSet.set(0);
            }
            if (struct.isSetStatus()) {
                bitSet.set(1);
            }
            if (struct.isSetRemain_day()) {
                bitSet.set(2);
            }
            tTupleProtocol.writeBitSet(bitSet, 3);
            if (struct.isSetCover()) {
                tTupleProtocol.writeString(struct.cover);
            }
            if (struct.isSetStatus()) {
                tTupleProtocol.writeI32(struct.status);
            }
            if (struct.isSetRemain_day()) {
                tTupleProtocol.writeI32(struct.remain_day);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BookInfoTupleSchemeFactory implements SchemeFactory {
        private BookInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BookInfoTupleScheme getScheme() {
            return new BookInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        BOOK_ID(1, "book_id"),
        BOOK_NAME(2, "book_name"),
        TOTAL_COUNT(3, "total_count"),
        LEARNED(4, "learned"),
        MASTERED(5, "mastered"),
        COVER(6, "cover"),
        STATUS(7, "status"),
        REMAIN_DAY(8, "remain_day");

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
                    return TOTAL_COUNT;
                case 4:
                    return LEARNED;
                case 5:
                    return MASTERED;
                case 6:
                    return COVER;
                case 7:
                    return STATUS;
                case 8:
                    return REMAIN_DAY;
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
        hashMap.put(StandardScheme.class, new BookInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new BookInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.BOOK_ID, (_Fields) new FieldMetaData("book_id", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.BOOK_NAME, (_Fields) new FieldMetaData("book_name", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.TOTAL_COUNT, (_Fields) new FieldMetaData("total_count", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.LEARNED, (_Fields) new FieldMetaData("learned", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.MASTERED, (_Fields) new FieldMetaData("mastered", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.COVER, (_Fields) new FieldMetaData("cover", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.STATUS, (_Fields) new FieldMetaData("status", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.REMAIN_DAY, (_Fields) new FieldMetaData("remain_day", (byte) 2, new FieldValueMetaData((byte) 8)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(BookInfo.class, unmodifiableMap);
    }

    public BookInfo() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.COVER, _Fields.STATUS, _Fields.REMAIN_DAY};
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
        this.book_name = null;
        setTotal_countIsSet(false);
        this.total_count = 0;
        setLearnedIsSet(false);
        this.learned = 0;
        setMasteredIsSet(false);
        this.mastered = 0;
        this.cover = null;
        setStatusIsSet(false);
        this.status = 0;
        setRemain_dayIsSet(false);
        this.remain_day = 0;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof BookInfo)) {
            return equals((BookInfo) that);
        }
        return false;
    }

    public int getBook_id() {
        return this.book_id;
    }

    public String getBook_name() {
        return this.book_name;
    }

    public String getCover() {
        return this.cover;
    }

    public int getLearned() {
        return this.learned;
    }

    public int getMastered() {
        return this.mastered;
    }

    public int getRemain_day() {
        return this.remain_day;
    }

    public int getStatus() {
        return this.status;
    }

    public int getTotal_count() {
        return this.total_count;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetBook_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetBook_name() {
        return this.book_name != null;
    }

    public boolean isSetCover() {
        return this.cover != null;
    }

    public boolean isSetLearned() {
        return EncodingUtils.testBit(this.__isset_bitfield, 2);
    }

    public boolean isSetMastered() {
        return EncodingUtils.testBit(this.__isset_bitfield, 3);
    }

    public boolean isSetRemain_day() {
        return EncodingUtils.testBit(this.__isset_bitfield, 5);
    }

    public boolean isSetStatus() {
        return EncodingUtils.testBit(this.__isset_bitfield, 4);
    }

    public boolean isSetTotal_count() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public BookInfo setBook_id(int book_id) {
        this.book_id = book_id;
        setBook_idIsSet(true);
        return this;
    }

    public void setBook_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public BookInfo setBook_name(String book_name) {
        this.book_name = book_name;
        return this;
    }

    public void setBook_nameIsSet(boolean value) {
        if (value) {
            return;
        }
        this.book_name = null;
    }

    public BookInfo setCover(String cover) {
        this.cover = cover;
        return this;
    }

    public void setCoverIsSet(boolean value) {
        if (value) {
            return;
        }
        this.cover = null;
    }

    public BookInfo setLearned(int learned) {
        this.learned = learned;
        setLearnedIsSet(true);
        return this;
    }

    public void setLearnedIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 2, value);
    }

    public BookInfo setMastered(int mastered) {
        this.mastered = mastered;
        setMasteredIsSet(true);
        return this;
    }

    public void setMasteredIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 3, value);
    }

    public BookInfo setRemain_day(int remain_day) {
        this.remain_day = remain_day;
        setRemain_dayIsSet(true);
        return this;
    }

    public void setRemain_dayIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 5, value);
    }

    public BookInfo setStatus(int status) {
        this.status = status;
        setStatusIsSet(true);
        return this;
    }

    public void setStatusIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 4, value);
    }

    public BookInfo setTotal_count(int total_count) {
        this.total_count = total_count;
        setTotal_countIsSet(true);
        return this;
    }

    public void setTotal_countIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("BookInfo(");
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
        sb2.append("total_count:");
        sb2.append(this.total_count);
        sb2.append(j2.O);
        sb2.append("learned:");
        sb2.append(this.learned);
        sb2.append(j2.O);
        sb2.append("mastered:");
        sb2.append(this.mastered);
        if (isSetCover()) {
            sb2.append(j2.O);
            sb2.append("cover:");
            String str2 = this.cover;
            if (str2 == null) {
                sb2.append("null");
            } else {
                sb2.append(str2);
            }
        }
        if (isSetStatus()) {
            sb2.append(j2.O);
            sb2.append("status:");
            sb2.append(this.status);
        }
        if (isSetRemain_day()) {
            sb2.append(j2.O);
            sb2.append("remain_day:");
            sb2.append(this.remain_day);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetBook_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetBook_name() {
        this.book_name = null;
    }

    public void unsetCover() {
        this.cover = null;
    }

    public void unsetLearned() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 2);
    }

    public void unsetMastered() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 3);
    }

    public void unsetRemain_day() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 5);
    }

    public void unsetStatus() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 4);
    }

    public void unsetTotal_count() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
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
    public int compareTo(BookInfo other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        int compareTo5;
        int compareTo6;
        int compareTo7;
        int compareTo8;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo9 = Boolean.valueOf(isSetBook_id()).compareTo(Boolean.valueOf(other.isSetBook_id()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (isSetBook_id() && (compareTo8 = TBaseHelper.compareTo(this.book_id, other.book_id)) != 0) {
            return compareTo8;
        }
        int compareTo10 = Boolean.valueOf(isSetBook_name()).compareTo(Boolean.valueOf(other.isSetBook_name()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (isSetBook_name() && (compareTo7 = TBaseHelper.compareTo(this.book_name, other.book_name)) != 0) {
            return compareTo7;
        }
        int compareTo11 = Boolean.valueOf(isSetTotal_count()).compareTo(Boolean.valueOf(other.isSetTotal_count()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (isSetTotal_count() && (compareTo6 = TBaseHelper.compareTo(this.total_count, other.total_count)) != 0) {
            return compareTo6;
        }
        int compareTo12 = Boolean.valueOf(isSetLearned()).compareTo(Boolean.valueOf(other.isSetLearned()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (isSetLearned() && (compareTo5 = TBaseHelper.compareTo(this.learned, other.learned)) != 0) {
            return compareTo5;
        }
        int compareTo13 = Boolean.valueOf(isSetMastered()).compareTo(Boolean.valueOf(other.isSetMastered()));
        if (compareTo13 != 0) {
            return compareTo13;
        }
        if (isSetMastered() && (compareTo4 = TBaseHelper.compareTo(this.mastered, other.mastered)) != 0) {
            return compareTo4;
        }
        int compareTo14 = Boolean.valueOf(isSetCover()).compareTo(Boolean.valueOf(other.isSetCover()));
        if (compareTo14 != 0) {
            return compareTo14;
        }
        if (isSetCover() && (compareTo3 = TBaseHelper.compareTo(this.cover, other.cover)) != 0) {
            return compareTo3;
        }
        int compareTo15 = Boolean.valueOf(isSetStatus()).compareTo(Boolean.valueOf(other.isSetStatus()));
        if (compareTo15 != 0) {
            return compareTo15;
        }
        if (isSetStatus() && (compareTo2 = TBaseHelper.compareTo(this.status, other.status)) != 0) {
            return compareTo2;
        }
        int compareTo16 = Boolean.valueOf(isSetRemain_day()).compareTo(Boolean.valueOf(other.isSetRemain_day()));
        if (compareTo16 != 0) {
            return compareTo16;
        }
        if (!isSetRemain_day() || (compareTo = TBaseHelper.compareTo(this.remain_day, other.remain_day)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<BookInfo, _Fields> deepCopy2() {
        return new BookInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$BookInfo$_Fields[field.ordinal()]) {
            case 1:
                return Integer.valueOf(getBook_id());
            case 2:
                return getBook_name();
            case 3:
                return Integer.valueOf(getTotal_count());
            case 4:
                return Integer.valueOf(getLearned());
            case 5:
                return Integer.valueOf(getMastered());
            case 6:
                return getCover();
            case 7:
                return Integer.valueOf(getStatus());
            case 8:
                return Integer.valueOf(getRemain_day());
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$BookInfo$_Fields[field.ordinal()]) {
            case 1:
                return isSetBook_id();
            case 2:
                return isSetBook_name();
            case 3:
                return isSetTotal_count();
            case 4:
                return isSetLearned();
            case 5:
                return isSetMastered();
            case 6:
                return isSetCover();
            case 7:
                return isSetStatus();
            case 8:
                return isSetRemain_day();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$BookInfo$_Fields[field.ordinal()]) {
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
                    setTotal_count(((Integer) value).intValue());
                    break;
                } else {
                    unsetTotal_count();
                    break;
                }
            case 4:
                if (value != null) {
                    setLearned(((Integer) value).intValue());
                    break;
                } else {
                    unsetLearned();
                    break;
                }
            case 5:
                if (value != null) {
                    setMastered(((Integer) value).intValue());
                    break;
                } else {
                    unsetMastered();
                    break;
                }
            case 6:
                if (value != null) {
                    setCover((String) value);
                    break;
                } else {
                    unsetCover();
                    break;
                }
            case 7:
                if (value != null) {
                    setStatus(((Integer) value).intValue());
                    break;
                } else {
                    unsetStatus();
                    break;
                }
            case 8:
                if (value != null) {
                    setRemain_day(((Integer) value).intValue());
                    break;
                } else {
                    unsetRemain_day();
                    break;
                }
        }
    }

    public boolean equals(BookInfo that) {
        if (that == null || this.book_id != that.book_id) {
            return false;
        }
        boolean isSetBook_name = isSetBook_name();
        boolean isSetBook_name2 = that.isSetBook_name();
        if (((isSetBook_name || isSetBook_name2) && (!isSetBook_name || !isSetBook_name2 || !this.book_name.equals(that.book_name))) || this.total_count != that.total_count || this.learned != that.learned || this.mastered != that.mastered) {
            return false;
        }
        boolean isSetCover = isSetCover();
        boolean isSetCover2 = that.isSetCover();
        if ((isSetCover || isSetCover2) && !(isSetCover && isSetCover2 && this.cover.equals(that.cover))) {
            return false;
        }
        boolean isSetStatus = isSetStatus();
        boolean isSetStatus2 = that.isSetStatus();
        if ((isSetStatus || isSetStatus2) && !(isSetStatus && isSetStatus2 && this.status == that.status)) {
            return false;
        }
        boolean isSetRemain_day = isSetRemain_day();
        boolean isSetRemain_day2 = that.isSetRemain_day();
        if (isSetRemain_day || isSetRemain_day2) {
            return isSetRemain_day && isSetRemain_day2 && this.remain_day == that.remain_day;
        }
        return true;
    }

    public BookInfo(int book_id, String book_name, int total_count, int learned, int mastered) {
        this();
        this.book_id = book_id;
        setBook_idIsSet(true);
        this.book_name = book_name;
        this.total_count = total_count;
        setTotal_countIsSet(true);
        this.learned = learned;
        setLearnedIsSet(true);
        this.mastered = mastered;
        setMasteredIsSet(true);
    }

    public BookInfo(BookInfo other) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.COVER, _Fields.STATUS, _Fields.REMAIN_DAY};
        this.__isset_bitfield = other.__isset_bitfield;
        this.book_id = other.book_id;
        if (other.isSetBook_name()) {
            this.book_name = other.book_name;
        }
        this.total_count = other.total_count;
        this.learned = other.learned;
        this.mastered = other.mastered;
        if (other.isSetCover()) {
            this.cover = other.cover;
        }
        this.status = other.status;
        this.remain_day = other.remain_day;
    }
}

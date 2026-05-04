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
import org.apache.thrift.meta_data.StructMetaData;
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
public class RoundReq implements TBase<RoundReq, _Fields>, Serializable, Cloneable, Comparable<RoundReq> {
    private static final int __BOOK_ID_ISSET_ID = 0;
    private static final int __ROUND_CATE_ISSET_ID = 4;
    private static final int __ROUND_TIME_ISSET_ID = 2;
    private static final int __ROUND_TYPE_ISSET_ID = 3;
    private static final int __STUDY_RECORD_VERSION_ISSET_ID = 1;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public int book_id;
    private _Fields[] optionals;
    public int round_cate;
    public int round_time;
    public int round_type;
    public long study_record_version;
    public List<RoundWordItem> words;
    private static final TStruct STRUCT_DESC = new TStruct("RoundReq");
    private static final TField BOOK_ID_FIELD_DESC = new TField("book_id", (byte) 8, 1);
    private static final TField WORDS_FIELD_DESC = new TField(xd.a.f98002r, (byte) 15, 2);
    private static final TField STUDY_RECORD_VERSION_FIELD_DESC = new TField("study_record_version", (byte) 10, 3);
    private static final TField ROUND_TIME_FIELD_DESC = new TField("round_time", (byte) 8, 4);
    private static final TField ROUND_TYPE_FIELD_DESC = new TField("round_type", (byte) 8, 5);
    private static final TField ROUND_CATE_FIELD_DESC = new TField("round_cate", (byte) 8, 6);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.game_api.RoundReq$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$game_api$RoundReq$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$game_api$RoundReq$_Fields = iArr;
            try {
                iArr[_Fields.BOOK_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$RoundReq$_Fields[_Fields.WORDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$RoundReq$_Fields[_Fields.STUDY_RECORD_VERSION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$RoundReq$_Fields[_Fields.ROUND_TIME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$RoundReq$_Fields[_Fields.ROUND_TYPE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$RoundReq$_Fields[_Fields.ROUND_CATE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class RoundReqStandardScheme extends StandardScheme<RoundReq> {
        private RoundReqStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, RoundReq struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    iprot.readStructEnd();
                    if (!struct.isSetBook_id()) {
                        throw new TProtocolException("Required field 'book_id' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetStudy_record_version()) {
                        throw new TProtocolException("Required field 'study_record_version' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetRound_time()) {
                        throw new TProtocolException("Required field 'round_time' was not found in serialized data! Struct: " + toString());
                    }
                    if (struct.isSetRound_type()) {
                        struct.validate();
                        return;
                    }
                    throw new TProtocolException("Required field 'round_type' was not found in serialized data! Struct: " + toString());
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
                        if (b11 == 15) {
                            TList readListBegin = iprot.readListBegin();
                            struct.words = new ArrayList(readListBegin.size);
                            for (int i11 = 0; i11 < readListBegin.size; i11++) {
                                RoundWordItem roundWordItem = new RoundWordItem();
                                roundWordItem.read(iprot);
                                struct.words.add(roundWordItem);
                            }
                            iprot.readListEnd();
                            struct.setWordsIsSet(true);
                            break;
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        }
                    case 3:
                        if (b11 == 10) {
                            struct.study_record_version = iprot.readI64();
                            struct.setStudy_record_versionIsSet(true);
                            break;
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        }
                    case 4:
                        if (b11 == 8) {
                            struct.round_time = iprot.readI32();
                            struct.setRound_timeIsSet(true);
                            break;
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        }
                    case 5:
                        if (b11 == 8) {
                            struct.round_type = iprot.readI32();
                            struct.setRound_typeIsSet(true);
                            break;
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        }
                    case 6:
                        if (b11 == 8) {
                            struct.round_cate = iprot.readI32();
                            struct.setRound_cateIsSet(true);
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
        public void write(TProtocol oprot, RoundReq struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(RoundReq.STRUCT_DESC);
            oprot.writeFieldBegin(RoundReq.BOOK_ID_FIELD_DESC);
            oprot.writeI32(struct.book_id);
            oprot.writeFieldEnd();
            if (struct.words != null) {
                oprot.writeFieldBegin(RoundReq.WORDS_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 12, struct.words.size()));
                Iterator<RoundWordItem> it = struct.words.iterator();
                while (it.hasNext()) {
                    it.next().write(oprot);
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(RoundReq.STUDY_RECORD_VERSION_FIELD_DESC);
            oprot.writeI64(struct.study_record_version);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(RoundReq.ROUND_TIME_FIELD_DESC);
            oprot.writeI32(struct.round_time);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(RoundReq.ROUND_TYPE_FIELD_DESC);
            oprot.writeI32(struct.round_type);
            oprot.writeFieldEnd();
            if (struct.isSetRound_cate()) {
                oprot.writeFieldBegin(RoundReq.ROUND_CATE_FIELD_DESC);
                oprot.writeI32(struct.round_cate);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class RoundReqStandardSchemeFactory implements SchemeFactory {
        private RoundReqStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public RoundReqStandardScheme getScheme() {
            return new RoundReqStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class RoundReqTupleScheme extends TupleScheme<RoundReq> {
        private RoundReqTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, RoundReq struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.book_id = tTupleProtocol.readI32();
            struct.setBook_idIsSet(true);
            TList tList = new TList((byte) 12, tTupleProtocol.readI32());
            struct.words = new ArrayList(tList.size);
            for (int i11 = 0; i11 < tList.size; i11++) {
                RoundWordItem roundWordItem = new RoundWordItem();
                roundWordItem.read(tTupleProtocol);
                struct.words.add(roundWordItem);
            }
            struct.setWordsIsSet(true);
            struct.study_record_version = tTupleProtocol.readI64();
            struct.setStudy_record_versionIsSet(true);
            struct.round_time = tTupleProtocol.readI32();
            struct.setRound_timeIsSet(true);
            struct.round_type = tTupleProtocol.readI32();
            struct.setRound_typeIsSet(true);
            if (tTupleProtocol.readBitSet(1).get(0)) {
                struct.round_cate = tTupleProtocol.readI32();
                struct.setRound_cateIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, RoundReq struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.book_id);
            tTupleProtocol.writeI32(struct.words.size());
            Iterator<RoundWordItem> it = struct.words.iterator();
            while (it.hasNext()) {
                it.next().write(tTupleProtocol);
            }
            tTupleProtocol.writeI64(struct.study_record_version);
            tTupleProtocol.writeI32(struct.round_time);
            tTupleProtocol.writeI32(struct.round_type);
            BitSet bitSet = new BitSet();
            if (struct.isSetRound_cate()) {
                bitSet.set(0);
            }
            tTupleProtocol.writeBitSet(bitSet, 1);
            if (struct.isSetRound_cate()) {
                tTupleProtocol.writeI32(struct.round_cate);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class RoundReqTupleSchemeFactory implements SchemeFactory {
        private RoundReqTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public RoundReqTupleScheme getScheme() {
            return new RoundReqTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        BOOK_ID(1, "book_id"),
        WORDS(2, xd.a.f98002r),
        STUDY_RECORD_VERSION(3, "study_record_version"),
        ROUND_TIME(4, "round_time"),
        ROUND_TYPE(5, "round_type"),
        ROUND_CATE(6, "round_cate");

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
                    return WORDS;
                case 3:
                    return STUDY_RECORD_VERSION;
                case 4:
                    return ROUND_TIME;
                case 5:
                    return ROUND_TYPE;
                case 6:
                    return ROUND_CATE;
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
        hashMap.put(StandardScheme.class, new RoundReqStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new RoundReqTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.BOOK_ID, (_Fields) new FieldMetaData("book_id", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.WORDS, (_Fields) new FieldMetaData(xd.a.f98002r, (byte) 1, new ListMetaData((byte) 15, new StructMetaData((byte) 12, RoundWordItem.class))));
        enumMap.put((EnumMap) _Fields.STUDY_RECORD_VERSION, (_Fields) new FieldMetaData("study_record_version", (byte) 1, new FieldValueMetaData((byte) 10)));
        enumMap.put((EnumMap) _Fields.ROUND_TIME, (_Fields) new FieldMetaData("round_time", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.ROUND_TYPE, (_Fields) new FieldMetaData("round_type", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.ROUND_CATE, (_Fields) new FieldMetaData("round_cate", (byte) 2, new FieldValueMetaData((byte) 8)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(RoundReq.class, unmodifiableMap);
    }

    public RoundReq() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.ROUND_CATE};
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

    public void addToWords(RoundWordItem elem) {
        if (this.words == null) {
            this.words = new ArrayList();
        }
        this.words.add(elem);
    }

    @Override // org.apache.thrift.TBase
    public void clear() {
        setBook_idIsSet(false);
        this.book_id = 0;
        this.words = null;
        setStudy_record_versionIsSet(false);
        this.study_record_version = 0L;
        setRound_timeIsSet(false);
        this.round_time = 0;
        setRound_typeIsSet(false);
        this.round_type = 0;
        setRound_cateIsSet(false);
        this.round_cate = 0;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof RoundReq)) {
            return equals((RoundReq) that);
        }
        return false;
    }

    public int getBook_id() {
        return this.book_id;
    }

    public int getRound_cate() {
        return this.round_cate;
    }

    public int getRound_time() {
        return this.round_time;
    }

    public int getRound_type() {
        return this.round_type;
    }

    public long getStudy_record_version() {
        return this.study_record_version;
    }

    public List<RoundWordItem> getWords() {
        return this.words;
    }

    public Iterator<RoundWordItem> getWordsIterator() {
        List<RoundWordItem> list = this.words;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getWordsSize() {
        List<RoundWordItem> list = this.words;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetBook_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetRound_cate() {
        return EncodingUtils.testBit(this.__isset_bitfield, 4);
    }

    public boolean isSetRound_time() {
        return EncodingUtils.testBit(this.__isset_bitfield, 2);
    }

    public boolean isSetRound_type() {
        return EncodingUtils.testBit(this.__isset_bitfield, 3);
    }

    public boolean isSetStudy_record_version() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetWords() {
        return this.words != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public RoundReq setBook_id(int book_id) {
        this.book_id = book_id;
        setBook_idIsSet(true);
        return this;
    }

    public void setBook_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public RoundReq setRound_cate(int round_cate) {
        this.round_cate = round_cate;
        setRound_cateIsSet(true);
        return this;
    }

    public void setRound_cateIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 4, value);
    }

    public RoundReq setRound_time(int round_time) {
        this.round_time = round_time;
        setRound_timeIsSet(true);
        return this;
    }

    public void setRound_timeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 2, value);
    }

    public RoundReq setRound_type(int round_type) {
        this.round_type = round_type;
        setRound_typeIsSet(true);
        return this;
    }

    public void setRound_typeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 3, value);
    }

    public RoundReq setStudy_record_version(long study_record_version) {
        this.study_record_version = study_record_version;
        setStudy_record_versionIsSet(true);
        return this;
    }

    public void setStudy_record_versionIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public RoundReq setWords(List<RoundWordItem> words) {
        this.words = words;
        return this;
    }

    public void setWordsIsSet(boolean value) {
        if (value) {
            return;
        }
        this.words = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("RoundReq(");
        sb2.append("book_id:");
        sb2.append(this.book_id);
        sb2.append(j2.O);
        sb2.append("words:");
        List<RoundWordItem> list = this.words;
        if (list == null) {
            sb2.append("null");
        } else {
            sb2.append(list);
        }
        sb2.append(j2.O);
        sb2.append("study_record_version:");
        sb2.append(this.study_record_version);
        sb2.append(j2.O);
        sb2.append("round_time:");
        sb2.append(this.round_time);
        sb2.append(j2.O);
        sb2.append("round_type:");
        sb2.append(this.round_type);
        if (isSetRound_cate()) {
            sb2.append(j2.O);
            sb2.append("round_cate:");
            sb2.append(this.round_cate);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetBook_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetRound_cate() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 4);
    }

    public void unsetRound_time() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 2);
    }

    public void unsetRound_type() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 3);
    }

    public void unsetStudy_record_version() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetWords() {
        this.words = null;
    }

    public void validate() throws TException {
        if (this.words != null) {
            return;
        }
        throw new TProtocolException("Required field 'words' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(RoundReq other) {
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
        int compareTo8 = Boolean.valueOf(isSetWords()).compareTo(Boolean.valueOf(other.isSetWords()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (isSetWords() && (compareTo5 = TBaseHelper.compareTo((List) this.words, (List) other.words)) != 0) {
            return compareTo5;
        }
        int compareTo9 = Boolean.valueOf(isSetStudy_record_version()).compareTo(Boolean.valueOf(other.isSetStudy_record_version()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (isSetStudy_record_version() && (compareTo4 = TBaseHelper.compareTo(this.study_record_version, other.study_record_version)) != 0) {
            return compareTo4;
        }
        int compareTo10 = Boolean.valueOf(isSetRound_time()).compareTo(Boolean.valueOf(other.isSetRound_time()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (isSetRound_time() && (compareTo3 = TBaseHelper.compareTo(this.round_time, other.round_time)) != 0) {
            return compareTo3;
        }
        int compareTo11 = Boolean.valueOf(isSetRound_type()).compareTo(Boolean.valueOf(other.isSetRound_type()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (isSetRound_type() && (compareTo2 = TBaseHelper.compareTo(this.round_type, other.round_type)) != 0) {
            return compareTo2;
        }
        int compareTo12 = Boolean.valueOf(isSetRound_cate()).compareTo(Boolean.valueOf(other.isSetRound_cate()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (!isSetRound_cate() || (compareTo = TBaseHelper.compareTo(this.round_cate, other.round_cate)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<RoundReq, _Fields> deepCopy2() {
        return new RoundReq(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$RoundReq$_Fields[field.ordinal()]) {
            case 1:
                return Integer.valueOf(getBook_id());
            case 2:
                return getWords();
            case 3:
                return Long.valueOf(getStudy_record_version());
            case 4:
                return Integer.valueOf(getRound_time());
            case 5:
                return Integer.valueOf(getRound_type());
            case 6:
                return Integer.valueOf(getRound_cate());
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$RoundReq$_Fields[field.ordinal()]) {
            case 1:
                return isSetBook_id();
            case 2:
                return isSetWords();
            case 3:
                return isSetStudy_record_version();
            case 4:
                return isSetRound_time();
            case 5:
                return isSetRound_type();
            case 6:
                return isSetRound_cate();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$RoundReq$_Fields[field.ordinal()]) {
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
                    setWords((List) value);
                    break;
                } else {
                    unsetWords();
                    break;
                }
            case 3:
                if (value != null) {
                    setStudy_record_version(((Long) value).longValue());
                    break;
                } else {
                    unsetStudy_record_version();
                    break;
                }
            case 4:
                if (value != null) {
                    setRound_time(((Integer) value).intValue());
                    break;
                } else {
                    unsetRound_time();
                    break;
                }
            case 5:
                if (value != null) {
                    setRound_type(((Integer) value).intValue());
                    break;
                } else {
                    unsetRound_type();
                    break;
                }
            case 6:
                if (value != null) {
                    setRound_cate(((Integer) value).intValue());
                    break;
                } else {
                    unsetRound_cate();
                    break;
                }
        }
    }

    public boolean equals(RoundReq that) {
        if (that == null || this.book_id != that.book_id) {
            return false;
        }
        boolean isSetWords = isSetWords();
        boolean isSetWords2 = that.isSetWords();
        if (((isSetWords || isSetWords2) && (!isSetWords || !isSetWords2 || !this.words.equals(that.words))) || this.study_record_version != that.study_record_version || this.round_time != that.round_time || this.round_type != that.round_type) {
            return false;
        }
        boolean isSetRound_cate = isSetRound_cate();
        boolean isSetRound_cate2 = that.isSetRound_cate();
        if (isSetRound_cate || isSetRound_cate2) {
            return isSetRound_cate && isSetRound_cate2 && this.round_cate == that.round_cate;
        }
        return true;
    }

    public RoundReq(int book_id, List<RoundWordItem> words, long study_record_version, int round_time, int round_type) {
        this();
        this.book_id = book_id;
        setBook_idIsSet(true);
        this.words = words;
        this.study_record_version = study_record_version;
        setStudy_record_versionIsSet(true);
        this.round_time = round_time;
        setRound_timeIsSet(true);
        this.round_type = round_type;
        setRound_typeIsSet(true);
    }

    public RoundReq(RoundReq other) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.ROUND_CATE};
        this.__isset_bitfield = other.__isset_bitfield;
        this.book_id = other.book_id;
        if (other.isSetWords()) {
            ArrayList arrayList = new ArrayList(other.words.size());
            Iterator<RoundWordItem> it = other.words.iterator();
            while (it.hasNext()) {
                arrayList.add(new RoundWordItem(it.next()));
            }
            this.words = arrayList;
        }
        this.study_record_version = other.study_record_version;
        this.round_time = other.round_time;
        this.round_type = other.round_type;
        this.round_cate = other.round_cate;
    }
}

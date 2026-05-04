package com.baicizhan.online.game_api;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
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
public class RoundInfo implements TBase<RoundInfo, _Fields>, Serializable, Cloneable, Comparable<RoundInfo> {
    private static final int __LIFE_COUNT_ISSET_ID = 1;
    private static final int __ROUND_CATE_ISSET_ID = 0;
    private static final int __ROUND_TIME_ISSET_ID = 3;
    private static final int __ROUND_TYPE_ISSET_ID = 2;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public int life_count;
    public int round_cate;
    public String round_id;
    public int round_time;
    public int round_type;
    public List<RoundWordItem> words;
    private static final TStruct STRUCT_DESC = new TStruct("RoundInfo");
    private static final TField ROUND_ID_FIELD_DESC = new TField("round_id", (byte) 11, 1);
    private static final TField ROUND_CATE_FIELD_DESC = new TField("round_cate", (byte) 8, 2);
    private static final TField LIFE_COUNT_FIELD_DESC = new TField("life_count", (byte) 8, 3);
    private static final TField WORDS_FIELD_DESC = new TField(xd.a.f98002r, (byte) 15, 4);
    private static final TField ROUND_TYPE_FIELD_DESC = new TField("round_type", (byte) 8, 5);
    private static final TField ROUND_TIME_FIELD_DESC = new TField("round_time", (byte) 8, 6);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.game_api.RoundInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$game_api$RoundInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$game_api$RoundInfo$_Fields = iArr;
            try {
                iArr[_Fields.ROUND_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$RoundInfo$_Fields[_Fields.ROUND_CATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$RoundInfo$_Fields[_Fields.LIFE_COUNT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$RoundInfo$_Fields[_Fields.WORDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$RoundInfo$_Fields[_Fields.ROUND_TYPE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$RoundInfo$_Fields[_Fields.ROUND_TIME.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class RoundInfoStandardScheme extends StandardScheme<RoundInfo> {
        private RoundInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, RoundInfo struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    iprot.readStructEnd();
                    if (!struct.isSetRound_cate()) {
                        throw new TProtocolException("Required field 'round_cate' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetLife_count()) {
                        throw new TProtocolException("Required field 'life_count' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetRound_type()) {
                        throw new TProtocolException("Required field 'round_type' was not found in serialized data! Struct: " + toString());
                    }
                    if (struct.isSetRound_time()) {
                        struct.validate();
                        return;
                    }
                    throw new TProtocolException("Required field 'round_time' was not found in serialized data! Struct: " + toString());
                }
                switch (readFieldBegin.f77768id) {
                    case 1:
                        if (b11 == 11) {
                            struct.round_id = iprot.readString();
                            struct.setRound_idIsSet(true);
                            break;
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        }
                    case 2:
                        if (b11 == 8) {
                            struct.round_cate = iprot.readI32();
                            struct.setRound_cateIsSet(true);
                            break;
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        }
                    case 3:
                        if (b11 == 8) {
                            struct.life_count = iprot.readI32();
                            struct.setLife_countIsSet(true);
                            break;
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        }
                    case 4:
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
                            struct.round_time = iprot.readI32();
                            struct.setRound_timeIsSet(true);
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
        public void write(TProtocol oprot, RoundInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(RoundInfo.STRUCT_DESC);
            if (struct.round_id != null) {
                oprot.writeFieldBegin(RoundInfo.ROUND_ID_FIELD_DESC);
                oprot.writeString(struct.round_id);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(RoundInfo.ROUND_CATE_FIELD_DESC);
            oprot.writeI32(struct.round_cate);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(RoundInfo.LIFE_COUNT_FIELD_DESC);
            oprot.writeI32(struct.life_count);
            oprot.writeFieldEnd();
            if (struct.words != null) {
                oprot.writeFieldBegin(RoundInfo.WORDS_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 12, struct.words.size()));
                Iterator<RoundWordItem> it = struct.words.iterator();
                while (it.hasNext()) {
                    it.next().write(oprot);
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(RoundInfo.ROUND_TYPE_FIELD_DESC);
            oprot.writeI32(struct.round_type);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(RoundInfo.ROUND_TIME_FIELD_DESC);
            oprot.writeI32(struct.round_time);
            oprot.writeFieldEnd();
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class RoundInfoStandardSchemeFactory implements SchemeFactory {
        private RoundInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public RoundInfoStandardScheme getScheme() {
            return new RoundInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class RoundInfoTupleScheme extends TupleScheme<RoundInfo> {
        private RoundInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, RoundInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.round_id = tTupleProtocol.readString();
            struct.setRound_idIsSet(true);
            struct.round_cate = tTupleProtocol.readI32();
            struct.setRound_cateIsSet(true);
            struct.life_count = tTupleProtocol.readI32();
            struct.setLife_countIsSet(true);
            TList tList = new TList((byte) 12, tTupleProtocol.readI32());
            struct.words = new ArrayList(tList.size);
            for (int i11 = 0; i11 < tList.size; i11++) {
                RoundWordItem roundWordItem = new RoundWordItem();
                roundWordItem.read(tTupleProtocol);
                struct.words.add(roundWordItem);
            }
            struct.setWordsIsSet(true);
            struct.round_type = tTupleProtocol.readI32();
            struct.setRound_typeIsSet(true);
            struct.round_time = tTupleProtocol.readI32();
            struct.setRound_timeIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, RoundInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeString(struct.round_id);
            tTupleProtocol.writeI32(struct.round_cate);
            tTupleProtocol.writeI32(struct.life_count);
            tTupleProtocol.writeI32(struct.words.size());
            Iterator<RoundWordItem> it = struct.words.iterator();
            while (it.hasNext()) {
                it.next().write(tTupleProtocol);
            }
            tTupleProtocol.writeI32(struct.round_type);
            tTupleProtocol.writeI32(struct.round_time);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class RoundInfoTupleSchemeFactory implements SchemeFactory {
        private RoundInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public RoundInfoTupleScheme getScheme() {
            return new RoundInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        ROUND_ID(1, "round_id"),
        ROUND_CATE(2, "round_cate"),
        LIFE_COUNT(3, "life_count"),
        WORDS(4, xd.a.f98002r),
        ROUND_TYPE(5, "round_type"),
        ROUND_TIME(6, "round_time");

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
                    return ROUND_ID;
                case 2:
                    return ROUND_CATE;
                case 3:
                    return LIFE_COUNT;
                case 4:
                    return WORDS;
                case 5:
                    return ROUND_TYPE;
                case 6:
                    return ROUND_TIME;
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
        hashMap.put(StandardScheme.class, new RoundInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new RoundInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.ROUND_ID, (_Fields) new FieldMetaData("round_id", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.ROUND_CATE, (_Fields) new FieldMetaData("round_cate", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.LIFE_COUNT, (_Fields) new FieldMetaData("life_count", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.WORDS, (_Fields) new FieldMetaData(xd.a.f98002r, (byte) 1, new ListMetaData((byte) 15, new StructMetaData((byte) 12, RoundWordItem.class))));
        enumMap.put((EnumMap) _Fields.ROUND_TYPE, (_Fields) new FieldMetaData("round_type", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.ROUND_TIME, (_Fields) new FieldMetaData("round_time", (byte) 1, new FieldValueMetaData((byte) 8)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(RoundInfo.class, unmodifiableMap);
    }

    public RoundInfo() {
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

    public void addToWords(RoundWordItem elem) {
        if (this.words == null) {
            this.words = new ArrayList();
        }
        this.words.add(elem);
    }

    @Override // org.apache.thrift.TBase
    public void clear() {
        this.round_id = null;
        setRound_cateIsSet(false);
        this.round_cate = 0;
        setLife_countIsSet(false);
        this.life_count = 0;
        this.words = null;
        setRound_typeIsSet(false);
        this.round_type = 0;
        setRound_timeIsSet(false);
        this.round_time = 0;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof RoundInfo)) {
            return equals((RoundInfo) that);
        }
        return false;
    }

    public int getLife_count() {
        return this.life_count;
    }

    public int getRound_cate() {
        return this.round_cate;
    }

    public String getRound_id() {
        return this.round_id;
    }

    public int getRound_time() {
        return this.round_time;
    }

    public int getRound_type() {
        return this.round_type;
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

    public boolean isSetLife_count() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetRound_cate() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetRound_id() {
        return this.round_id != null;
    }

    public boolean isSetRound_time() {
        return EncodingUtils.testBit(this.__isset_bitfield, 3);
    }

    public boolean isSetRound_type() {
        return EncodingUtils.testBit(this.__isset_bitfield, 2);
    }

    public boolean isSetWords() {
        return this.words != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public RoundInfo setLife_count(int life_count) {
        this.life_count = life_count;
        setLife_countIsSet(true);
        return this;
    }

    public void setLife_countIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public RoundInfo setRound_cate(int round_cate) {
        this.round_cate = round_cate;
        setRound_cateIsSet(true);
        return this;
    }

    public void setRound_cateIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public RoundInfo setRound_id(String round_id) {
        this.round_id = round_id;
        return this;
    }

    public void setRound_idIsSet(boolean value) {
        if (value) {
            return;
        }
        this.round_id = null;
    }

    public RoundInfo setRound_time(int round_time) {
        this.round_time = round_time;
        setRound_timeIsSet(true);
        return this;
    }

    public void setRound_timeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 3, value);
    }

    public RoundInfo setRound_type(int round_type) {
        this.round_type = round_type;
        setRound_typeIsSet(true);
        return this;
    }

    public void setRound_typeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 2, value);
    }

    public RoundInfo setWords(List<RoundWordItem> words) {
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
        StringBuilder sb2 = new StringBuilder("RoundInfo(");
        sb2.append("round_id:");
        String str = this.round_id;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(j2.O);
        sb2.append("round_cate:");
        sb2.append(this.round_cate);
        sb2.append(j2.O);
        sb2.append("life_count:");
        sb2.append(this.life_count);
        sb2.append(j2.O);
        sb2.append("words:");
        List<RoundWordItem> list = this.words;
        if (list == null) {
            sb2.append("null");
        } else {
            sb2.append(list);
        }
        sb2.append(j2.O);
        sb2.append("round_type:");
        sb2.append(this.round_type);
        sb2.append(j2.O);
        sb2.append("round_time:");
        sb2.append(this.round_time);
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetLife_count() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetRound_cate() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetRound_id() {
        this.round_id = null;
    }

    public void unsetRound_time() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 3);
    }

    public void unsetRound_type() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 2);
    }

    public void unsetWords() {
        this.words = null;
    }

    public void validate() throws TException {
        if (this.round_id == null) {
            throw new TProtocolException("Required field 'round_id' was not present! Struct: " + toString());
        }
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
    public int compareTo(RoundInfo other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        int compareTo5;
        int compareTo6;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo7 = Boolean.valueOf(isSetRound_id()).compareTo(Boolean.valueOf(other.isSetRound_id()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (isSetRound_id() && (compareTo6 = TBaseHelper.compareTo(this.round_id, other.round_id)) != 0) {
            return compareTo6;
        }
        int compareTo8 = Boolean.valueOf(isSetRound_cate()).compareTo(Boolean.valueOf(other.isSetRound_cate()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (isSetRound_cate() && (compareTo5 = TBaseHelper.compareTo(this.round_cate, other.round_cate)) != 0) {
            return compareTo5;
        }
        int compareTo9 = Boolean.valueOf(isSetLife_count()).compareTo(Boolean.valueOf(other.isSetLife_count()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (isSetLife_count() && (compareTo4 = TBaseHelper.compareTo(this.life_count, other.life_count)) != 0) {
            return compareTo4;
        }
        int compareTo10 = Boolean.valueOf(isSetWords()).compareTo(Boolean.valueOf(other.isSetWords()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (isSetWords() && (compareTo3 = TBaseHelper.compareTo((List) this.words, (List) other.words)) != 0) {
            return compareTo3;
        }
        int compareTo11 = Boolean.valueOf(isSetRound_type()).compareTo(Boolean.valueOf(other.isSetRound_type()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (isSetRound_type() && (compareTo2 = TBaseHelper.compareTo(this.round_type, other.round_type)) != 0) {
            return compareTo2;
        }
        int compareTo12 = Boolean.valueOf(isSetRound_time()).compareTo(Boolean.valueOf(other.isSetRound_time()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (!isSetRound_time() || (compareTo = TBaseHelper.compareTo(this.round_time, other.round_time)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<RoundInfo, _Fields> deepCopy2() {
        return new RoundInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$RoundInfo$_Fields[field.ordinal()]) {
            case 1:
                return getRound_id();
            case 2:
                return Integer.valueOf(getRound_cate());
            case 3:
                return Integer.valueOf(getLife_count());
            case 4:
                return getWords();
            case 5:
                return Integer.valueOf(getRound_type());
            case 6:
                return Integer.valueOf(getRound_time());
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$RoundInfo$_Fields[field.ordinal()]) {
            case 1:
                return isSetRound_id();
            case 2:
                return isSetRound_cate();
            case 3:
                return isSetLife_count();
            case 4:
                return isSetWords();
            case 5:
                return isSetRound_type();
            case 6:
                return isSetRound_time();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$RoundInfo$_Fields[field.ordinal()]) {
            case 1:
                if (value != null) {
                    setRound_id((String) value);
                    break;
                } else {
                    unsetRound_id();
                    break;
                }
            case 2:
                if (value != null) {
                    setRound_cate(((Integer) value).intValue());
                    break;
                } else {
                    unsetRound_cate();
                    break;
                }
            case 3:
                if (value != null) {
                    setLife_count(((Integer) value).intValue());
                    break;
                } else {
                    unsetLife_count();
                    break;
                }
            case 4:
                if (value != null) {
                    setWords((List) value);
                    break;
                } else {
                    unsetWords();
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
                    setRound_time(((Integer) value).intValue());
                    break;
                } else {
                    unsetRound_time();
                    break;
                }
        }
    }

    public RoundInfo(String round_id, int round_cate, int life_count, List<RoundWordItem> words, int round_type, int round_time) {
        this();
        this.round_id = round_id;
        this.round_cate = round_cate;
        setRound_cateIsSet(true);
        this.life_count = life_count;
        setLife_countIsSet(true);
        this.words = words;
        this.round_type = round_type;
        setRound_typeIsSet(true);
        this.round_time = round_time;
        setRound_timeIsSet(true);
    }

    public boolean equals(RoundInfo that) {
        if (that == null) {
            return false;
        }
        boolean isSetRound_id = isSetRound_id();
        boolean isSetRound_id2 = that.isSetRound_id();
        if (((isSetRound_id || isSetRound_id2) && (!isSetRound_id || !isSetRound_id2 || !this.round_id.equals(that.round_id))) || this.round_cate != that.round_cate || this.life_count != that.life_count) {
            return false;
        }
        boolean isSetWords = isSetWords();
        boolean isSetWords2 = that.isSetWords();
        return (!(isSetWords || isSetWords2) || (isSetWords && isSetWords2 && this.words.equals(that.words))) && this.round_type == that.round_type && this.round_time == that.round_time;
    }

    public RoundInfo(RoundInfo other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        if (other.isSetRound_id()) {
            this.round_id = other.round_id;
        }
        this.round_cate = other.round_cate;
        this.life_count = other.life_count;
        if (other.isSetWords()) {
            ArrayList arrayList = new ArrayList(other.words.size());
            Iterator<RoundWordItem> it = other.words.iterator();
            while (it.hasNext()) {
                arrayList.add(new RoundWordItem(it.next()));
            }
            this.words = arrayList;
        }
        this.round_type = other.round_type;
        this.round_time = other.round_time;
    }
}

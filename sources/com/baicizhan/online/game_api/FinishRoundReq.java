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
public class FinishRoundReq implements TBase<FinishRoundReq, _Fields>, Serializable, Cloneable, Comparable<FinishRoundReq> {
    private static final int __COMBO_ISSET_ID = 2;
    private static final int __CORRECTRATE_ISSET_ID = 3;
    private static final int __LIFE_COUNT_ISSET_ID = 4;
    private static final int __LOCAL_VERSION_ISSET_ID = 0;
    private static final int __STUDY_SCORE_ISSET_ID = 1;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public int combo;
    public int correctRate;
    public int life_count;
    public long local_version;
    private _Fields[] optionals;
    public String round_id;
    public int study_score;
    public List<StudyRecordItem> words;
    private static final TStruct STRUCT_DESC = new TStruct("FinishRoundReq");
    private static final TField ROUND_ID_FIELD_DESC = new TField("round_id", (byte) 11, 1);
    private static final TField LOCAL_VERSION_FIELD_DESC = new TField("local_version", (byte) 10, 2);
    private static final TField WORDS_FIELD_DESC = new TField(xd.a.f98002r, (byte) 15, 3);
    private static final TField STUDY_SCORE_FIELD_DESC = new TField("study_score", (byte) 8, 4);
    private static final TField COMBO_FIELD_DESC = new TField("combo", (byte) 8, 5);
    private static final TField CORRECT_RATE_FIELD_DESC = new TField("correctRate", (byte) 8, 6);
    private static final TField LIFE_COUNT_FIELD_DESC = new TField("life_count", (byte) 8, 7);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.game_api.FinishRoundReq$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$game_api$FinishRoundReq$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$game_api$FinishRoundReq$_Fields = iArr;
            try {
                iArr[_Fields.ROUND_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$FinishRoundReq$_Fields[_Fields.LOCAL_VERSION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$FinishRoundReq$_Fields[_Fields.WORDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$FinishRoundReq$_Fields[_Fields.STUDY_SCORE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$FinishRoundReq$_Fields[_Fields.COMBO.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$FinishRoundReq$_Fields[_Fields.CORRECT_RATE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$FinishRoundReq$_Fields[_Fields.LIFE_COUNT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class FinishRoundReqStandardScheme extends StandardScheme<FinishRoundReq> {
        private FinishRoundReqStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, FinishRoundReq struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    iprot.readStructEnd();
                    if (!struct.isSetLocal_version()) {
                        throw new TProtocolException("Required field 'local_version' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetStudy_score()) {
                        throw new TProtocolException("Required field 'study_score' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetCombo()) {
                        throw new TProtocolException("Required field 'combo' was not found in serialized data! Struct: " + toString());
                    }
                    if (struct.isSetCorrectRate()) {
                        struct.validate();
                        return;
                    }
                    throw new TProtocolException("Required field 'correctRate' was not found in serialized data! Struct: " + toString());
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
                        if (b11 == 10) {
                            struct.local_version = iprot.readI64();
                            struct.setLocal_versionIsSet(true);
                            break;
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        }
                    case 3:
                        if (b11 == 15) {
                            TList readListBegin = iprot.readListBegin();
                            struct.words = new ArrayList(readListBegin.size);
                            for (int i11 = 0; i11 < readListBegin.size; i11++) {
                                StudyRecordItem studyRecordItem = new StudyRecordItem();
                                studyRecordItem.read(iprot);
                                struct.words.add(studyRecordItem);
                            }
                            iprot.readListEnd();
                            struct.setWordsIsSet(true);
                            break;
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        }
                    case 4:
                        if (b11 == 8) {
                            struct.study_score = iprot.readI32();
                            struct.setStudy_scoreIsSet(true);
                            break;
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        }
                    case 5:
                        if (b11 == 8) {
                            struct.combo = iprot.readI32();
                            struct.setComboIsSet(true);
                            break;
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        }
                    case 6:
                        if (b11 == 8) {
                            struct.correctRate = iprot.readI32();
                            struct.setCorrectRateIsSet(true);
                            break;
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        }
                    case 7:
                        if (b11 == 8) {
                            struct.life_count = iprot.readI32();
                            struct.setLife_countIsSet(true);
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
        public void write(TProtocol oprot, FinishRoundReq struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(FinishRoundReq.STRUCT_DESC);
            if (struct.round_id != null) {
                oprot.writeFieldBegin(FinishRoundReq.ROUND_ID_FIELD_DESC);
                oprot.writeString(struct.round_id);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(FinishRoundReq.LOCAL_VERSION_FIELD_DESC);
            oprot.writeI64(struct.local_version);
            oprot.writeFieldEnd();
            if (struct.words != null) {
                oprot.writeFieldBegin(FinishRoundReq.WORDS_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 12, struct.words.size()));
                Iterator<StudyRecordItem> it = struct.words.iterator();
                while (it.hasNext()) {
                    it.next().write(oprot);
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(FinishRoundReq.STUDY_SCORE_FIELD_DESC);
            oprot.writeI32(struct.study_score);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(FinishRoundReq.COMBO_FIELD_DESC);
            oprot.writeI32(struct.combo);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(FinishRoundReq.CORRECT_RATE_FIELD_DESC);
            oprot.writeI32(struct.correctRate);
            oprot.writeFieldEnd();
            if (struct.isSetLife_count()) {
                oprot.writeFieldBegin(FinishRoundReq.LIFE_COUNT_FIELD_DESC);
                oprot.writeI32(struct.life_count);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class FinishRoundReqStandardSchemeFactory implements SchemeFactory {
        private FinishRoundReqStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public FinishRoundReqStandardScheme getScheme() {
            return new FinishRoundReqStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class FinishRoundReqTupleScheme extends TupleScheme<FinishRoundReq> {
        private FinishRoundReqTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, FinishRoundReq struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.round_id = tTupleProtocol.readString();
            struct.setRound_idIsSet(true);
            struct.local_version = tTupleProtocol.readI64();
            struct.setLocal_versionIsSet(true);
            TList tList = new TList((byte) 12, tTupleProtocol.readI32());
            struct.words = new ArrayList(tList.size);
            for (int i11 = 0; i11 < tList.size; i11++) {
                StudyRecordItem studyRecordItem = new StudyRecordItem();
                studyRecordItem.read(tTupleProtocol);
                struct.words.add(studyRecordItem);
            }
            struct.setWordsIsSet(true);
            struct.study_score = tTupleProtocol.readI32();
            struct.setStudy_scoreIsSet(true);
            struct.combo = tTupleProtocol.readI32();
            struct.setComboIsSet(true);
            struct.correctRate = tTupleProtocol.readI32();
            struct.setCorrectRateIsSet(true);
            if (tTupleProtocol.readBitSet(1).get(0)) {
                struct.life_count = tTupleProtocol.readI32();
                struct.setLife_countIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, FinishRoundReq struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeString(struct.round_id);
            tTupleProtocol.writeI64(struct.local_version);
            tTupleProtocol.writeI32(struct.words.size());
            Iterator<StudyRecordItem> it = struct.words.iterator();
            while (it.hasNext()) {
                it.next().write(tTupleProtocol);
            }
            tTupleProtocol.writeI32(struct.study_score);
            tTupleProtocol.writeI32(struct.combo);
            tTupleProtocol.writeI32(struct.correctRate);
            BitSet bitSet = new BitSet();
            if (struct.isSetLife_count()) {
                bitSet.set(0);
            }
            tTupleProtocol.writeBitSet(bitSet, 1);
            if (struct.isSetLife_count()) {
                tTupleProtocol.writeI32(struct.life_count);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class FinishRoundReqTupleSchemeFactory implements SchemeFactory {
        private FinishRoundReqTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public FinishRoundReqTupleScheme getScheme() {
            return new FinishRoundReqTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        ROUND_ID(1, "round_id"),
        LOCAL_VERSION(2, "local_version"),
        WORDS(3, xd.a.f98002r),
        STUDY_SCORE(4, "study_score"),
        COMBO(5, "combo"),
        CORRECT_RATE(6, "correctRate"),
        LIFE_COUNT(7, "life_count");

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
                    return LOCAL_VERSION;
                case 3:
                    return WORDS;
                case 4:
                    return STUDY_SCORE;
                case 5:
                    return COMBO;
                case 6:
                    return CORRECT_RATE;
                case 7:
                    return LIFE_COUNT;
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
        hashMap.put(StandardScheme.class, new FinishRoundReqStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new FinishRoundReqTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.ROUND_ID, (_Fields) new FieldMetaData("round_id", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.LOCAL_VERSION, (_Fields) new FieldMetaData("local_version", (byte) 1, new FieldValueMetaData((byte) 10)));
        enumMap.put((EnumMap) _Fields.WORDS, (_Fields) new FieldMetaData(xd.a.f98002r, (byte) 1, new ListMetaData((byte) 15, new StructMetaData((byte) 12, StudyRecordItem.class))));
        enumMap.put((EnumMap) _Fields.STUDY_SCORE, (_Fields) new FieldMetaData("study_score", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.COMBO, (_Fields) new FieldMetaData("combo", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.CORRECT_RATE, (_Fields) new FieldMetaData("correctRate", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.LIFE_COUNT, (_Fields) new FieldMetaData("life_count", (byte) 2, new FieldValueMetaData((byte) 8)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(FinishRoundReq.class, unmodifiableMap);
    }

    public FinishRoundReq() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.LIFE_COUNT};
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

    public void addToWords(StudyRecordItem elem) {
        if (this.words == null) {
            this.words = new ArrayList();
        }
        this.words.add(elem);
    }

    @Override // org.apache.thrift.TBase
    public void clear() {
        this.round_id = null;
        setLocal_versionIsSet(false);
        this.local_version = 0L;
        this.words = null;
        setStudy_scoreIsSet(false);
        this.study_score = 0;
        setComboIsSet(false);
        this.combo = 0;
        setCorrectRateIsSet(false);
        this.correctRate = 0;
        setLife_countIsSet(false);
        this.life_count = 0;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof FinishRoundReq)) {
            return equals((FinishRoundReq) that);
        }
        return false;
    }

    public int getCombo() {
        return this.combo;
    }

    public int getCorrectRate() {
        return this.correctRate;
    }

    public int getLife_count() {
        return this.life_count;
    }

    public long getLocal_version() {
        return this.local_version;
    }

    public String getRound_id() {
        return this.round_id;
    }

    public int getStudy_score() {
        return this.study_score;
    }

    public List<StudyRecordItem> getWords() {
        return this.words;
    }

    public Iterator<StudyRecordItem> getWordsIterator() {
        List<StudyRecordItem> list = this.words;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getWordsSize() {
        List<StudyRecordItem> list = this.words;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetCombo() {
        return EncodingUtils.testBit(this.__isset_bitfield, 2);
    }

    public boolean isSetCorrectRate() {
        return EncodingUtils.testBit(this.__isset_bitfield, 3);
    }

    public boolean isSetLife_count() {
        return EncodingUtils.testBit(this.__isset_bitfield, 4);
    }

    public boolean isSetLocal_version() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetRound_id() {
        return this.round_id != null;
    }

    public boolean isSetStudy_score() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetWords() {
        return this.words != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public FinishRoundReq setCombo(int combo) {
        this.combo = combo;
        setComboIsSet(true);
        return this;
    }

    public void setComboIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 2, value);
    }

    public FinishRoundReq setCorrectRate(int correctRate) {
        this.correctRate = correctRate;
        setCorrectRateIsSet(true);
        return this;
    }

    public void setCorrectRateIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 3, value);
    }

    public FinishRoundReq setLife_count(int life_count) {
        this.life_count = life_count;
        setLife_countIsSet(true);
        return this;
    }

    public void setLife_countIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 4, value);
    }

    public FinishRoundReq setLocal_version(long local_version) {
        this.local_version = local_version;
        setLocal_versionIsSet(true);
        return this;
    }

    public void setLocal_versionIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public FinishRoundReq setRound_id(String round_id) {
        this.round_id = round_id;
        return this;
    }

    public void setRound_idIsSet(boolean value) {
        if (value) {
            return;
        }
        this.round_id = null;
    }

    public FinishRoundReq setStudy_score(int study_score) {
        this.study_score = study_score;
        setStudy_scoreIsSet(true);
        return this;
    }

    public void setStudy_scoreIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public FinishRoundReq setWords(List<StudyRecordItem> words) {
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
        StringBuilder sb2 = new StringBuilder("FinishRoundReq(");
        sb2.append("round_id:");
        String str = this.round_id;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(j2.O);
        sb2.append("local_version:");
        sb2.append(this.local_version);
        sb2.append(j2.O);
        sb2.append("words:");
        List<StudyRecordItem> list = this.words;
        if (list == null) {
            sb2.append("null");
        } else {
            sb2.append(list);
        }
        sb2.append(j2.O);
        sb2.append("study_score:");
        sb2.append(this.study_score);
        sb2.append(j2.O);
        sb2.append("combo:");
        sb2.append(this.combo);
        sb2.append(j2.O);
        sb2.append("correctRate:");
        sb2.append(this.correctRate);
        if (isSetLife_count()) {
            sb2.append(j2.O);
            sb2.append("life_count:");
            sb2.append(this.life_count);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetCombo() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 2);
    }

    public void unsetCorrectRate() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 3);
    }

    public void unsetLife_count() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 4);
    }

    public void unsetLocal_version() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetRound_id() {
        this.round_id = null;
    }

    public void unsetStudy_score() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
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
    public int compareTo(FinishRoundReq other) {
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
        int compareTo8 = Boolean.valueOf(isSetRound_id()).compareTo(Boolean.valueOf(other.isSetRound_id()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (isSetRound_id() && (compareTo7 = TBaseHelper.compareTo(this.round_id, other.round_id)) != 0) {
            return compareTo7;
        }
        int compareTo9 = Boolean.valueOf(isSetLocal_version()).compareTo(Boolean.valueOf(other.isSetLocal_version()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (isSetLocal_version() && (compareTo6 = TBaseHelper.compareTo(this.local_version, other.local_version)) != 0) {
            return compareTo6;
        }
        int compareTo10 = Boolean.valueOf(isSetWords()).compareTo(Boolean.valueOf(other.isSetWords()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (isSetWords() && (compareTo5 = TBaseHelper.compareTo((List) this.words, (List) other.words)) != 0) {
            return compareTo5;
        }
        int compareTo11 = Boolean.valueOf(isSetStudy_score()).compareTo(Boolean.valueOf(other.isSetStudy_score()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (isSetStudy_score() && (compareTo4 = TBaseHelper.compareTo(this.study_score, other.study_score)) != 0) {
            return compareTo4;
        }
        int compareTo12 = Boolean.valueOf(isSetCombo()).compareTo(Boolean.valueOf(other.isSetCombo()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (isSetCombo() && (compareTo3 = TBaseHelper.compareTo(this.combo, other.combo)) != 0) {
            return compareTo3;
        }
        int compareTo13 = Boolean.valueOf(isSetCorrectRate()).compareTo(Boolean.valueOf(other.isSetCorrectRate()));
        if (compareTo13 != 0) {
            return compareTo13;
        }
        if (isSetCorrectRate() && (compareTo2 = TBaseHelper.compareTo(this.correctRate, other.correctRate)) != 0) {
            return compareTo2;
        }
        int compareTo14 = Boolean.valueOf(isSetLife_count()).compareTo(Boolean.valueOf(other.isSetLife_count()));
        if (compareTo14 != 0) {
            return compareTo14;
        }
        if (!isSetLife_count() || (compareTo = TBaseHelper.compareTo(this.life_count, other.life_count)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<FinishRoundReq, _Fields> deepCopy2() {
        return new FinishRoundReq(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$FinishRoundReq$_Fields[field.ordinal()]) {
            case 1:
                return getRound_id();
            case 2:
                return Long.valueOf(getLocal_version());
            case 3:
                return getWords();
            case 4:
                return Integer.valueOf(getStudy_score());
            case 5:
                return Integer.valueOf(getCombo());
            case 6:
                return Integer.valueOf(getCorrectRate());
            case 7:
                return Integer.valueOf(getLife_count());
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$FinishRoundReq$_Fields[field.ordinal()]) {
            case 1:
                return isSetRound_id();
            case 2:
                return isSetLocal_version();
            case 3:
                return isSetWords();
            case 4:
                return isSetStudy_score();
            case 5:
                return isSetCombo();
            case 6:
                return isSetCorrectRate();
            case 7:
                return isSetLife_count();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$FinishRoundReq$_Fields[field.ordinal()]) {
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
                    setLocal_version(((Long) value).longValue());
                    break;
                } else {
                    unsetLocal_version();
                    break;
                }
            case 3:
                if (value != null) {
                    setWords((List) value);
                    break;
                } else {
                    unsetWords();
                    break;
                }
            case 4:
                if (value != null) {
                    setStudy_score(((Integer) value).intValue());
                    break;
                } else {
                    unsetStudy_score();
                    break;
                }
            case 5:
                if (value != null) {
                    setCombo(((Integer) value).intValue());
                    break;
                } else {
                    unsetCombo();
                    break;
                }
            case 6:
                if (value != null) {
                    setCorrectRate(((Integer) value).intValue());
                    break;
                } else {
                    unsetCorrectRate();
                    break;
                }
            case 7:
                if (value != null) {
                    setLife_count(((Integer) value).intValue());
                    break;
                } else {
                    unsetLife_count();
                    break;
                }
        }
    }

    public boolean equals(FinishRoundReq that) {
        if (that == null) {
            return false;
        }
        boolean isSetRound_id = isSetRound_id();
        boolean isSetRound_id2 = that.isSetRound_id();
        if (((isSetRound_id || isSetRound_id2) && !(isSetRound_id && isSetRound_id2 && this.round_id.equals(that.round_id))) || this.local_version != that.local_version) {
            return false;
        }
        boolean isSetWords = isSetWords();
        boolean isSetWords2 = that.isSetWords();
        if (((isSetWords || isSetWords2) && (!isSetWords || !isSetWords2 || !this.words.equals(that.words))) || this.study_score != that.study_score || this.combo != that.combo || this.correctRate != that.correctRate) {
            return false;
        }
        boolean isSetLife_count = isSetLife_count();
        boolean isSetLife_count2 = that.isSetLife_count();
        if (isSetLife_count || isSetLife_count2) {
            return isSetLife_count && isSetLife_count2 && this.life_count == that.life_count;
        }
        return true;
    }

    public FinishRoundReq(String round_id, long local_version, List<StudyRecordItem> words, int study_score, int combo, int correctRate) {
        this();
        this.round_id = round_id;
        this.local_version = local_version;
        setLocal_versionIsSet(true);
        this.words = words;
        this.study_score = study_score;
        setStudy_scoreIsSet(true);
        this.combo = combo;
        setComboIsSet(true);
        this.correctRate = correctRate;
        setCorrectRateIsSet(true);
    }

    public FinishRoundReq(FinishRoundReq other) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.LIFE_COUNT};
        this.__isset_bitfield = other.__isset_bitfield;
        if (other.isSetRound_id()) {
            this.round_id = other.round_id;
        }
        this.local_version = other.local_version;
        if (other.isSetWords()) {
            ArrayList arrayList = new ArrayList(other.words.size());
            Iterator<StudyRecordItem> it = other.words.iterator();
            while (it.hasNext()) {
                arrayList.add(new StudyRecordItem(it.next()));
            }
            this.words = arrayList;
        }
        this.study_score = other.study_score;
        this.combo = other.combo;
        this.correctRate = other.correctRate;
        this.life_count = other.life_count;
    }
}

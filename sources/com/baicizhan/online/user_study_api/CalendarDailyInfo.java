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

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class CalendarDailyInfo implements TBase<CalendarDailyInfo, _Fields>, Serializable, Cloneable, Comparable<CalendarDailyInfo> {
    private static final int __DAILY_WORD_COUNT_ISSET_ID = 1;
    private static final int __RESIGN_STATE_ISSET_ID = 2;
    private static final int __STATE_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public int daily_word_count;
    public String hint;
    private _Fields[] optionals;
    public String resign_message;
    public int resign_state;
    public int state;
    public List<CalendarDailyWord> words;
    private static final TStruct STRUCT_DESC = new TStruct("CalendarDailyInfo");
    private static final TField STATE_FIELD_DESC = new TField("state", (byte) 8, 1);
    private static final TField HINT_FIELD_DESC = new TField(kc.o.L, (byte) 11, 2);
    private static final TField DAILY_WORD_COUNT_FIELD_DESC = new TField("daily_word_count", (byte) 8, 3);
    private static final TField WORDS_FIELD_DESC = new TField(xd.a.f98002r, (byte) 15, 4);
    private static final TField RESIGN_STATE_FIELD_DESC = new TField("resign_state", (byte) 8, 5);
    private static final TField RESIGN_MESSAGE_FIELD_DESC = new TField("resign_message", (byte) 11, 6);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.user_study_api.CalendarDailyInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_study_api$CalendarDailyInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$user_study_api$CalendarDailyInfo$_Fields = iArr;
            try {
                iArr[_Fields.STATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$CalendarDailyInfo$_Fields[_Fields.HINT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$CalendarDailyInfo$_Fields[_Fields.DAILY_WORD_COUNT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$CalendarDailyInfo$_Fields[_Fields.WORDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$CalendarDailyInfo$_Fields[_Fields.RESIGN_STATE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$CalendarDailyInfo$_Fields[_Fields.RESIGN_MESSAGE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class CalendarDailyInfoStandardScheme extends StandardScheme<CalendarDailyInfo> {
        private CalendarDailyInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, CalendarDailyInfo struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    iprot.readStructEnd();
                    if (struct.isSetState()) {
                        struct.validate();
                        return;
                    }
                    throw new TProtocolException("Required field 'state' was not found in serialized data! Struct: " + toString());
                }
                switch (readFieldBegin.f77768id) {
                    case 1:
                        if (b11 == 8) {
                            struct.state = iprot.readI32();
                            struct.setStateIsSet(true);
                            break;
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        }
                    case 2:
                        if (b11 == 11) {
                            struct.hint = iprot.readString();
                            struct.setHintIsSet(true);
                            break;
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        }
                    case 3:
                        if (b11 == 8) {
                            struct.daily_word_count = iprot.readI32();
                            struct.setDaily_word_countIsSet(true);
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
                                CalendarDailyWord calendarDailyWord = new CalendarDailyWord();
                                calendarDailyWord.read(iprot);
                                struct.words.add(calendarDailyWord);
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
                            struct.resign_state = iprot.readI32();
                            struct.setResign_stateIsSet(true);
                            break;
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        }
                    case 6:
                        if (b11 == 11) {
                            struct.resign_message = iprot.readString();
                            struct.setResign_messageIsSet(true);
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
        public void write(TProtocol oprot, CalendarDailyInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(CalendarDailyInfo.STRUCT_DESC);
            oprot.writeFieldBegin(CalendarDailyInfo.STATE_FIELD_DESC);
            oprot.writeI32(struct.state);
            oprot.writeFieldEnd();
            if (struct.hint != null && struct.isSetHint()) {
                oprot.writeFieldBegin(CalendarDailyInfo.HINT_FIELD_DESC);
                oprot.writeString(struct.hint);
                oprot.writeFieldEnd();
            }
            if (struct.isSetDaily_word_count()) {
                oprot.writeFieldBegin(CalendarDailyInfo.DAILY_WORD_COUNT_FIELD_DESC);
                oprot.writeI32(struct.daily_word_count);
                oprot.writeFieldEnd();
            }
            if (struct.words != null && struct.isSetWords()) {
                oprot.writeFieldBegin(CalendarDailyInfo.WORDS_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 12, struct.words.size()));
                Iterator<CalendarDailyWord> it = struct.words.iterator();
                while (it.hasNext()) {
                    it.next().write(oprot);
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            if (struct.isSetResign_state()) {
                oprot.writeFieldBegin(CalendarDailyInfo.RESIGN_STATE_FIELD_DESC);
                oprot.writeI32(struct.resign_state);
                oprot.writeFieldEnd();
            }
            if (struct.resign_message != null && struct.isSetResign_message()) {
                oprot.writeFieldBegin(CalendarDailyInfo.RESIGN_MESSAGE_FIELD_DESC);
                oprot.writeString(struct.resign_message);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class CalendarDailyInfoStandardSchemeFactory implements SchemeFactory {
        private CalendarDailyInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public CalendarDailyInfoStandardScheme getScheme() {
            return new CalendarDailyInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class CalendarDailyInfoTupleScheme extends TupleScheme<CalendarDailyInfo> {
        private CalendarDailyInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, CalendarDailyInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.state = tTupleProtocol.readI32();
            struct.setStateIsSet(true);
            BitSet readBitSet = tTupleProtocol.readBitSet(5);
            if (readBitSet.get(0)) {
                struct.hint = tTupleProtocol.readString();
                struct.setHintIsSet(true);
            }
            if (readBitSet.get(1)) {
                struct.daily_word_count = tTupleProtocol.readI32();
                struct.setDaily_word_countIsSet(true);
            }
            if (readBitSet.get(2)) {
                TList tList = new TList((byte) 12, tTupleProtocol.readI32());
                struct.words = new ArrayList(tList.size);
                for (int i11 = 0; i11 < tList.size; i11++) {
                    CalendarDailyWord calendarDailyWord = new CalendarDailyWord();
                    calendarDailyWord.read(tTupleProtocol);
                    struct.words.add(calendarDailyWord);
                }
                struct.setWordsIsSet(true);
            }
            if (readBitSet.get(3)) {
                struct.resign_state = tTupleProtocol.readI32();
                struct.setResign_stateIsSet(true);
            }
            if (readBitSet.get(4)) {
                struct.resign_message = tTupleProtocol.readString();
                struct.setResign_messageIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, CalendarDailyInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.state);
            BitSet bitSet = new BitSet();
            if (struct.isSetHint()) {
                bitSet.set(0);
            }
            if (struct.isSetDaily_word_count()) {
                bitSet.set(1);
            }
            if (struct.isSetWords()) {
                bitSet.set(2);
            }
            if (struct.isSetResign_state()) {
                bitSet.set(3);
            }
            if (struct.isSetResign_message()) {
                bitSet.set(4);
            }
            tTupleProtocol.writeBitSet(bitSet, 5);
            if (struct.isSetHint()) {
                tTupleProtocol.writeString(struct.hint);
            }
            if (struct.isSetDaily_word_count()) {
                tTupleProtocol.writeI32(struct.daily_word_count);
            }
            if (struct.isSetWords()) {
                tTupleProtocol.writeI32(struct.words.size());
                Iterator<CalendarDailyWord> it = struct.words.iterator();
                while (it.hasNext()) {
                    it.next().write(tTupleProtocol);
                }
            }
            if (struct.isSetResign_state()) {
                tTupleProtocol.writeI32(struct.resign_state);
            }
            if (struct.isSetResign_message()) {
                tTupleProtocol.writeString(struct.resign_message);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class CalendarDailyInfoTupleSchemeFactory implements SchemeFactory {
        private CalendarDailyInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public CalendarDailyInfoTupleScheme getScheme() {
            return new CalendarDailyInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        STATE(1, "state"),
        HINT(2, kc.o.L),
        DAILY_WORD_COUNT(3, "daily_word_count"),
        WORDS(4, xd.a.f98002r),
        RESIGN_STATE(5, "resign_state"),
        RESIGN_MESSAGE(6, "resign_message");

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
                    return STATE;
                case 2:
                    return HINT;
                case 3:
                    return DAILY_WORD_COUNT;
                case 4:
                    return WORDS;
                case 5:
                    return RESIGN_STATE;
                case 6:
                    return RESIGN_MESSAGE;
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
        hashMap.put(StandardScheme.class, new CalendarDailyInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new CalendarDailyInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.STATE, (_Fields) new FieldMetaData("state", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.HINT, (_Fields) new FieldMetaData(kc.o.L, (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.DAILY_WORD_COUNT, (_Fields) new FieldMetaData("daily_word_count", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.WORDS, (_Fields) new FieldMetaData(xd.a.f98002r, (byte) 2, new ListMetaData((byte) 15, new StructMetaData((byte) 12, CalendarDailyWord.class))));
        enumMap.put((EnumMap) _Fields.RESIGN_STATE, (_Fields) new FieldMetaData("resign_state", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.RESIGN_MESSAGE, (_Fields) new FieldMetaData("resign_message", (byte) 2, new FieldValueMetaData((byte) 11)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(CalendarDailyInfo.class, unmodifiableMap);
    }

    public CalendarDailyInfo() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.HINT, _Fields.DAILY_WORD_COUNT, _Fields.WORDS, _Fields.RESIGN_STATE, _Fields.RESIGN_MESSAGE};
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

    public void addToWords(CalendarDailyWord elem) {
        if (this.words == null) {
            this.words = new ArrayList();
        }
        this.words.add(elem);
    }

    @Override // org.apache.thrift.TBase
    public void clear() {
        setStateIsSet(false);
        this.state = 0;
        this.hint = null;
        setDaily_word_countIsSet(false);
        this.daily_word_count = 0;
        this.words = null;
        setResign_stateIsSet(false);
        this.resign_state = 0;
        this.resign_message = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof CalendarDailyInfo)) {
            return equals((CalendarDailyInfo) that);
        }
        return false;
    }

    public int getDaily_word_count() {
        return this.daily_word_count;
    }

    public String getHint() {
        return this.hint;
    }

    public String getResign_message() {
        return this.resign_message;
    }

    public int getResign_state() {
        return this.resign_state;
    }

    public int getState() {
        return this.state;
    }

    public List<CalendarDailyWord> getWords() {
        return this.words;
    }

    public Iterator<CalendarDailyWord> getWordsIterator() {
        List<CalendarDailyWord> list = this.words;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getWordsSize() {
        List<CalendarDailyWord> list = this.words;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetDaily_word_count() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetHint() {
        return this.hint != null;
    }

    public boolean isSetResign_message() {
        return this.resign_message != null;
    }

    public boolean isSetResign_state() {
        return EncodingUtils.testBit(this.__isset_bitfield, 2);
    }

    public boolean isSetState() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetWords() {
        return this.words != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public CalendarDailyInfo setDaily_word_count(int daily_word_count) {
        this.daily_word_count = daily_word_count;
        setDaily_word_countIsSet(true);
        return this;
    }

    public void setDaily_word_countIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public CalendarDailyInfo setHint(String hint) {
        this.hint = hint;
        return this;
    }

    public void setHintIsSet(boolean value) {
        if (value) {
            return;
        }
        this.hint = null;
    }

    public CalendarDailyInfo setResign_message(String resign_message) {
        this.resign_message = resign_message;
        return this;
    }

    public void setResign_messageIsSet(boolean value) {
        if (value) {
            return;
        }
        this.resign_message = null;
    }

    public CalendarDailyInfo setResign_state(int resign_state) {
        this.resign_state = resign_state;
        setResign_stateIsSet(true);
        return this;
    }

    public void setResign_stateIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 2, value);
    }

    public CalendarDailyInfo setState(int state) {
        this.state = state;
        setStateIsSet(true);
        return this;
    }

    public void setStateIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public CalendarDailyInfo setWords(List<CalendarDailyWord> words) {
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
        StringBuilder sb2 = new StringBuilder("CalendarDailyInfo(");
        sb2.append("state:");
        sb2.append(this.state);
        if (isSetHint()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("hint:");
            String str = this.hint;
            if (str == null) {
                sb2.append("null");
            } else {
                sb2.append(str);
            }
        }
        if (isSetDaily_word_count()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("daily_word_count:");
            sb2.append(this.daily_word_count);
        }
        if (isSetWords()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("words:");
            List<CalendarDailyWord> list = this.words;
            if (list == null) {
                sb2.append("null");
            } else {
                sb2.append(list);
            }
        }
        if (isSetResign_state()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("resign_state:");
            sb2.append(this.resign_state);
        }
        if (isSetResign_message()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("resign_message:");
            String str2 = this.resign_message;
            if (str2 == null) {
                sb2.append("null");
            } else {
                sb2.append(str2);
            }
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetDaily_word_count() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetHint() {
        this.hint = null;
    }

    public void unsetResign_message() {
        this.resign_message = null;
    }

    public void unsetResign_state() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 2);
    }

    public void unsetState() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetWords() {
        this.words = null;
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(CalendarDailyInfo other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        int compareTo5;
        int compareTo6;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo7 = Boolean.valueOf(isSetState()).compareTo(Boolean.valueOf(other.isSetState()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (isSetState() && (compareTo6 = TBaseHelper.compareTo(this.state, other.state)) != 0) {
            return compareTo6;
        }
        int compareTo8 = Boolean.valueOf(isSetHint()).compareTo(Boolean.valueOf(other.isSetHint()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (isSetHint() && (compareTo5 = TBaseHelper.compareTo(this.hint, other.hint)) != 0) {
            return compareTo5;
        }
        int compareTo9 = Boolean.valueOf(isSetDaily_word_count()).compareTo(Boolean.valueOf(other.isSetDaily_word_count()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (isSetDaily_word_count() && (compareTo4 = TBaseHelper.compareTo(this.daily_word_count, other.daily_word_count)) != 0) {
            return compareTo4;
        }
        int compareTo10 = Boolean.valueOf(isSetWords()).compareTo(Boolean.valueOf(other.isSetWords()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (isSetWords() && (compareTo3 = TBaseHelper.compareTo((List) this.words, (List) other.words)) != 0) {
            return compareTo3;
        }
        int compareTo11 = Boolean.valueOf(isSetResign_state()).compareTo(Boolean.valueOf(other.isSetResign_state()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (isSetResign_state() && (compareTo2 = TBaseHelper.compareTo(this.resign_state, other.resign_state)) != 0) {
            return compareTo2;
        }
        int compareTo12 = Boolean.valueOf(isSetResign_message()).compareTo(Boolean.valueOf(other.isSetResign_message()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (!isSetResign_message() || (compareTo = TBaseHelper.compareTo(this.resign_message, other.resign_message)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<CalendarDailyInfo, _Fields> deepCopy2() {
        return new CalendarDailyInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$CalendarDailyInfo$_Fields[field.ordinal()]) {
            case 1:
                return Integer.valueOf(getState());
            case 2:
                return getHint();
            case 3:
                return Integer.valueOf(getDaily_word_count());
            case 4:
                return getWords();
            case 5:
                return Integer.valueOf(getResign_state());
            case 6:
                return getResign_message();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$CalendarDailyInfo$_Fields[field.ordinal()]) {
            case 1:
                return isSetState();
            case 2:
                return isSetHint();
            case 3:
                return isSetDaily_word_count();
            case 4:
                return isSetWords();
            case 5:
                return isSetResign_state();
            case 6:
                return isSetResign_message();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$CalendarDailyInfo$_Fields[field.ordinal()]) {
            case 1:
                if (value != null) {
                    setState(((Integer) value).intValue());
                    break;
                } else {
                    unsetState();
                    break;
                }
            case 2:
                if (value != null) {
                    setHint((String) value);
                    break;
                } else {
                    unsetHint();
                    break;
                }
            case 3:
                if (value != null) {
                    setDaily_word_count(((Integer) value).intValue());
                    break;
                } else {
                    unsetDaily_word_count();
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
                    setResign_state(((Integer) value).intValue());
                    break;
                } else {
                    unsetResign_state();
                    break;
                }
            case 6:
                if (value != null) {
                    setResign_message((String) value);
                    break;
                } else {
                    unsetResign_message();
                    break;
                }
        }
    }

    public boolean equals(CalendarDailyInfo that) {
        if (that == null || this.state != that.state) {
            return false;
        }
        boolean isSetHint = isSetHint();
        boolean isSetHint2 = that.isSetHint();
        if ((isSetHint || isSetHint2) && !(isSetHint && isSetHint2 && this.hint.equals(that.hint))) {
            return false;
        }
        boolean isSetDaily_word_count = isSetDaily_word_count();
        boolean isSetDaily_word_count2 = that.isSetDaily_word_count();
        if ((isSetDaily_word_count || isSetDaily_word_count2) && !(isSetDaily_word_count && isSetDaily_word_count2 && this.daily_word_count == that.daily_word_count)) {
            return false;
        }
        boolean isSetWords = isSetWords();
        boolean isSetWords2 = that.isSetWords();
        if ((isSetWords || isSetWords2) && !(isSetWords && isSetWords2 && this.words.equals(that.words))) {
            return false;
        }
        boolean isSetResign_state = isSetResign_state();
        boolean isSetResign_state2 = that.isSetResign_state();
        if ((isSetResign_state || isSetResign_state2) && !(isSetResign_state && isSetResign_state2 && this.resign_state == that.resign_state)) {
            return false;
        }
        boolean isSetResign_message = isSetResign_message();
        boolean isSetResign_message2 = that.isSetResign_message();
        if (isSetResign_message || isSetResign_message2) {
            return isSetResign_message && isSetResign_message2 && this.resign_message.equals(that.resign_message);
        }
        return true;
    }

    public CalendarDailyInfo(int state) {
        this();
        this.state = state;
        setStateIsSet(true);
    }

    public CalendarDailyInfo(CalendarDailyInfo other) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.HINT, _Fields.DAILY_WORD_COUNT, _Fields.WORDS, _Fields.RESIGN_STATE, _Fields.RESIGN_MESSAGE};
        this.__isset_bitfield = other.__isset_bitfield;
        this.state = other.state;
        if (other.isSetHint()) {
            this.hint = other.hint;
        }
        this.daily_word_count = other.daily_word_count;
        if (other.isSetWords()) {
            ArrayList arrayList = new ArrayList(other.words.size());
            Iterator<CalendarDailyWord> it = other.words.iterator();
            while (it.hasNext()) {
                arrayList.add(new CalendarDailyWord(it.next()));
            }
            this.words = arrayList;
        }
        this.resign_state = other.resign_state;
        if (other.isSetResign_message()) {
            this.resign_message = other.resign_message;
        }
    }

    public void validate() throws TException {
    }
}

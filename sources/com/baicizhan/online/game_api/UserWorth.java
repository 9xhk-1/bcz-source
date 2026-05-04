package com.baicizhan.online.game_api;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
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
public class UserWorth implements TBase<UserWorth, _Fields>, Serializable, Cloneable, Comparable<UserWorth> {
    private static final int __LISTEN_COUNT_ISSET_ID = 3;
    private static final int __READING_COUNT_ISSET_ID = 4;
    private static final int __TOTAL_DAKA_DAYS_ISSET_ID = 1;
    private static final int __WIN_STREAK_DAYS_ISSET_ID = 0;
    private static final int __WORD_DONE_COUNT_ISSET_ID = 2;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public int listen_count;
    public int reading_count;
    public int total_daka_days;
    public int win_streak_days;
    public int word_done_count;
    private static final TStruct STRUCT_DESC = new TStruct("UserWorth");
    private static final TField WIN_STREAK_DAYS_FIELD_DESC = new TField("win_streak_days", (byte) 8, 1);
    private static final TField TOTAL_DAKA_DAYS_FIELD_DESC = new TField("total_daka_days", (byte) 8, 2);
    private static final TField WORD_DONE_COUNT_FIELD_DESC = new TField("word_done_count", (byte) 8, 3);
    private static final TField LISTEN_COUNT_FIELD_DESC = new TField("listen_count", (byte) 8, 4);
    private static final TField READING_COUNT_FIELD_DESC = new TField("reading_count", (byte) 8, 5);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.game_api.UserWorth$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$game_api$UserWorth$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$game_api$UserWorth$_Fields = iArr;
            try {
                iArr[_Fields.WIN_STREAK_DAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$UserWorth$_Fields[_Fields.TOTAL_DAKA_DAYS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$UserWorth$_Fields[_Fields.WORD_DONE_COUNT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$UserWorth$_Fields[_Fields.LISTEN_COUNT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$UserWorth$_Fields[_Fields.READING_COUNT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserWorthStandardScheme extends StandardScheme<UserWorth> {
        private UserWorthStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, UserWorth struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    break;
                }
                short s11 = readFieldBegin.f77768id;
                if (s11 != 1) {
                    if (s11 != 2) {
                        if (s11 != 3) {
                            if (s11 != 4) {
                                if (s11 != 5) {
                                    TProtocolUtil.skip(iprot, b11);
                                } else if (b11 == 8) {
                                    struct.reading_count = iprot.readI32();
                                    struct.setReading_countIsSet(true);
                                } else {
                                    TProtocolUtil.skip(iprot, b11);
                                }
                            } else if (b11 == 8) {
                                struct.listen_count = iprot.readI32();
                                struct.setListen_countIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 8) {
                            struct.word_done_count = iprot.readI32();
                            struct.setWord_done_countIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 8) {
                        struct.total_daka_days = iprot.readI32();
                        struct.setTotal_daka_daysIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 8) {
                    struct.win_streak_days = iprot.readI32();
                    struct.setWin_streak_daysIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (!struct.isSetWin_streak_days()) {
                throw new TProtocolException("Required field 'win_streak_days' was not found in serialized data! Struct: " + toString());
            }
            if (!struct.isSetTotal_daka_days()) {
                throw new TProtocolException("Required field 'total_daka_days' was not found in serialized data! Struct: " + toString());
            }
            if (!struct.isSetWord_done_count()) {
                throw new TProtocolException("Required field 'word_done_count' was not found in serialized data! Struct: " + toString());
            }
            if (!struct.isSetListen_count()) {
                throw new TProtocolException("Required field 'listen_count' was not found in serialized data! Struct: " + toString());
            }
            if (struct.isSetReading_count()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'reading_count' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, UserWorth struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(UserWorth.STRUCT_DESC);
            oprot.writeFieldBegin(UserWorth.WIN_STREAK_DAYS_FIELD_DESC);
            oprot.writeI32(struct.win_streak_days);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(UserWorth.TOTAL_DAKA_DAYS_FIELD_DESC);
            oprot.writeI32(struct.total_daka_days);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(UserWorth.WORD_DONE_COUNT_FIELD_DESC);
            oprot.writeI32(struct.word_done_count);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(UserWorth.LISTEN_COUNT_FIELD_DESC);
            oprot.writeI32(struct.listen_count);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(UserWorth.READING_COUNT_FIELD_DESC);
            oprot.writeI32(struct.reading_count);
            oprot.writeFieldEnd();
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserWorthStandardSchemeFactory implements SchemeFactory {
        private UserWorthStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public UserWorthStandardScheme getScheme() {
            return new UserWorthStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserWorthTupleScheme extends TupleScheme<UserWorth> {
        private UserWorthTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, UserWorth struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.win_streak_days = tTupleProtocol.readI32();
            struct.setWin_streak_daysIsSet(true);
            struct.total_daka_days = tTupleProtocol.readI32();
            struct.setTotal_daka_daysIsSet(true);
            struct.word_done_count = tTupleProtocol.readI32();
            struct.setWord_done_countIsSet(true);
            struct.listen_count = tTupleProtocol.readI32();
            struct.setListen_countIsSet(true);
            struct.reading_count = tTupleProtocol.readI32();
            struct.setReading_countIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, UserWorth struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.win_streak_days);
            tTupleProtocol.writeI32(struct.total_daka_days);
            tTupleProtocol.writeI32(struct.word_done_count);
            tTupleProtocol.writeI32(struct.listen_count);
            tTupleProtocol.writeI32(struct.reading_count);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserWorthTupleSchemeFactory implements SchemeFactory {
        private UserWorthTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public UserWorthTupleScheme getScheme() {
            return new UserWorthTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        WIN_STREAK_DAYS(1, "win_streak_days"),
        TOTAL_DAKA_DAYS(2, "total_daka_days"),
        WORD_DONE_COUNT(3, "word_done_count"),
        LISTEN_COUNT(4, "listen_count"),
        READING_COUNT(5, "reading_count");

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
                return WIN_STREAK_DAYS;
            }
            if (fieldId == 2) {
                return TOTAL_DAKA_DAYS;
            }
            if (fieldId == 3) {
                return WORD_DONE_COUNT;
            }
            if (fieldId == 4) {
                return LISTEN_COUNT;
            }
            if (fieldId != 5) {
                return null;
            }
            return READING_COUNT;
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
        hashMap.put(StandardScheme.class, new UserWorthStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new UserWorthTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.WIN_STREAK_DAYS, (_Fields) new FieldMetaData("win_streak_days", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.TOTAL_DAKA_DAYS, (_Fields) new FieldMetaData("total_daka_days", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.WORD_DONE_COUNT, (_Fields) new FieldMetaData("word_done_count", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.LISTEN_COUNT, (_Fields) new FieldMetaData("listen_count", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.READING_COUNT, (_Fields) new FieldMetaData("reading_count", (byte) 1, new FieldValueMetaData((byte) 8)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(UserWorth.class, unmodifiableMap);
    }

    public UserWorth() {
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

    @Override // org.apache.thrift.TBase
    public void clear() {
        setWin_streak_daysIsSet(false);
        this.win_streak_days = 0;
        setTotal_daka_daysIsSet(false);
        this.total_daka_days = 0;
        setWord_done_countIsSet(false);
        this.word_done_count = 0;
        setListen_countIsSet(false);
        this.listen_count = 0;
        setReading_countIsSet(false);
        this.reading_count = 0;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof UserWorth)) {
            return equals((UserWorth) that);
        }
        return false;
    }

    public int getListen_count() {
        return this.listen_count;
    }

    public int getReading_count() {
        return this.reading_count;
    }

    public int getTotal_daka_days() {
        return this.total_daka_days;
    }

    public int getWin_streak_days() {
        return this.win_streak_days;
    }

    public int getWord_done_count() {
        return this.word_done_count;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetListen_count() {
        return EncodingUtils.testBit(this.__isset_bitfield, 3);
    }

    public boolean isSetReading_count() {
        return EncodingUtils.testBit(this.__isset_bitfield, 4);
    }

    public boolean isSetTotal_daka_days() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetWin_streak_days() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetWord_done_count() {
        return EncodingUtils.testBit(this.__isset_bitfield, 2);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public UserWorth setListen_count(int listen_count) {
        this.listen_count = listen_count;
        setListen_countIsSet(true);
        return this;
    }

    public void setListen_countIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 3, value);
    }

    public UserWorth setReading_count(int reading_count) {
        this.reading_count = reading_count;
        setReading_countIsSet(true);
        return this;
    }

    public void setReading_countIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 4, value);
    }

    public UserWorth setTotal_daka_days(int total_daka_days) {
        this.total_daka_days = total_daka_days;
        setTotal_daka_daysIsSet(true);
        return this;
    }

    public void setTotal_daka_daysIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public UserWorth setWin_streak_days(int win_streak_days) {
        this.win_streak_days = win_streak_days;
        setWin_streak_daysIsSet(true);
        return this;
    }

    public void setWin_streak_daysIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public UserWorth setWord_done_count(int word_done_count) {
        this.word_done_count = word_done_count;
        setWord_done_countIsSet(true);
        return this;
    }

    public void setWord_done_countIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 2, value);
    }

    public String toString() {
        return "UserWorth(win_streak_days:" + this.win_streak_days + j2.O + "total_daka_days:" + this.total_daka_days + j2.O + "word_done_count:" + this.word_done_count + j2.O + "listen_count:" + this.listen_count + j2.O + "reading_count:" + this.reading_count + pn.j.f81007d;
    }

    public void unsetListen_count() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 3);
    }

    public void unsetReading_count() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 4);
    }

    public void unsetTotal_daka_days() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetWin_streak_days() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetWord_done_count() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 2);
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(UserWorth other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        int compareTo5;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo6 = Boolean.valueOf(isSetWin_streak_days()).compareTo(Boolean.valueOf(other.isSetWin_streak_days()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (isSetWin_streak_days() && (compareTo5 = TBaseHelper.compareTo(this.win_streak_days, other.win_streak_days)) != 0) {
            return compareTo5;
        }
        int compareTo7 = Boolean.valueOf(isSetTotal_daka_days()).compareTo(Boolean.valueOf(other.isSetTotal_daka_days()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (isSetTotal_daka_days() && (compareTo4 = TBaseHelper.compareTo(this.total_daka_days, other.total_daka_days)) != 0) {
            return compareTo4;
        }
        int compareTo8 = Boolean.valueOf(isSetWord_done_count()).compareTo(Boolean.valueOf(other.isSetWord_done_count()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (isSetWord_done_count() && (compareTo3 = TBaseHelper.compareTo(this.word_done_count, other.word_done_count)) != 0) {
            return compareTo3;
        }
        int compareTo9 = Boolean.valueOf(isSetListen_count()).compareTo(Boolean.valueOf(other.isSetListen_count()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (isSetListen_count() && (compareTo2 = TBaseHelper.compareTo(this.listen_count, other.listen_count)) != 0) {
            return compareTo2;
        }
        int compareTo10 = Boolean.valueOf(isSetReading_count()).compareTo(Boolean.valueOf(other.isSetReading_count()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (!isSetReading_count() || (compareTo = TBaseHelper.compareTo(this.reading_count, other.reading_count)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<UserWorth, _Fields> deepCopy2() {
        return new UserWorth(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$UserWorth$_Fields[field.ordinal()];
        if (i11 == 1) {
            return Integer.valueOf(getWin_streak_days());
        }
        if (i11 == 2) {
            return Integer.valueOf(getTotal_daka_days());
        }
        if (i11 == 3) {
            return Integer.valueOf(getWord_done_count());
        }
        if (i11 == 4) {
            return Integer.valueOf(getListen_count());
        }
        if (i11 == 5) {
            return Integer.valueOf(getReading_count());
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$UserWorth$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetWin_streak_days();
        }
        if (i11 == 2) {
            return isSetTotal_daka_days();
        }
        if (i11 == 3) {
            return isSetWord_done_count();
        }
        if (i11 == 4) {
            return isSetListen_count();
        }
        if (i11 == 5) {
            return isSetReading_count();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$UserWorth$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetWin_streak_days();
                return;
            } else {
                setWin_streak_days(((Integer) value).intValue());
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetTotal_daka_days();
                return;
            } else {
                setTotal_daka_days(((Integer) value).intValue());
                return;
            }
        }
        if (i11 == 3) {
            if (value == null) {
                unsetWord_done_count();
                return;
            } else {
                setWord_done_count(((Integer) value).intValue());
                return;
            }
        }
        if (i11 == 4) {
            if (value == null) {
                unsetListen_count();
                return;
            } else {
                setListen_count(((Integer) value).intValue());
                return;
            }
        }
        if (i11 != 5) {
            return;
        }
        if (value == null) {
            unsetReading_count();
        } else {
            setReading_count(((Integer) value).intValue());
        }
    }

    public UserWorth(int win_streak_days, int total_daka_days, int word_done_count, int listen_count, int reading_count) {
        this();
        this.win_streak_days = win_streak_days;
        setWin_streak_daysIsSet(true);
        this.total_daka_days = total_daka_days;
        setTotal_daka_daysIsSet(true);
        this.word_done_count = word_done_count;
        setWord_done_countIsSet(true);
        this.listen_count = listen_count;
        setListen_countIsSet(true);
        this.reading_count = reading_count;
        setReading_countIsSet(true);
    }

    public boolean equals(UserWorth that) {
        return that != null && this.win_streak_days == that.win_streak_days && this.total_daka_days == that.total_daka_days && this.word_done_count == that.word_done_count && this.listen_count == that.listen_count && this.reading_count == that.reading_count;
    }

    public UserWorth(UserWorth other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        this.win_streak_days = other.win_streak_days;
        this.total_daka_days = other.total_daka_days;
        this.word_done_count = other.word_done_count;
        this.listen_count = other.listen_count;
        this.reading_count = other.reading_count;
    }

    public void validate() throws TException {
    }
}

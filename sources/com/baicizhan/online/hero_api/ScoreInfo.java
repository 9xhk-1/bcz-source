package com.baicizhan.online.hero_api;

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
public class ScoreInfo implements TBase<ScoreInfo, _Fields>, Serializable, Cloneable, Comparable<ScoreInfo> {
    private static final int __BEGIN_TIME_ISSET_ID = 1;
    private static final int __END_TIME_ISSET_ID = 2;
    private static final int __WINNER_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public long begin_time;
    public long end_time;
    public String prize;
    public int winner;
    private static final TStruct STRUCT_DESC = new TStruct("ScoreInfo");
    private static final TField WINNER_FIELD_DESC = new TField("winner", (byte) 8, 1);
    private static final TField PRIZE_FIELD_DESC = new TField("prize", (byte) 11, 2);
    private static final TField BEGIN_TIME_FIELD_DESC = new TField("begin_time", (byte) 10, 3);
    private static final TField END_TIME_FIELD_DESC = new TField("end_time", (byte) 10, 4);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.hero_api.ScoreInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$hero_api$ScoreInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$hero_api$ScoreInfo$_Fields = iArr;
            try {
                iArr[_Fields.WINNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$hero_api$ScoreInfo$_Fields[_Fields.PRIZE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$hero_api$ScoreInfo$_Fields[_Fields.BEGIN_TIME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$hero_api$ScoreInfo$_Fields[_Fields.END_TIME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ScoreInfoStandardScheme extends StandardScheme<ScoreInfo> {
        private ScoreInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, ScoreInfo struct) throws TException {
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
                                TProtocolUtil.skip(iprot, b11);
                            } else if (b11 == 10) {
                                struct.end_time = iprot.readI64();
                                struct.setEnd_timeIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 10) {
                            struct.begin_time = iprot.readI64();
                            struct.setBegin_timeIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 11) {
                        struct.prize = iprot.readString();
                        struct.setPrizeIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 8) {
                    struct.winner = iprot.readI32();
                    struct.setWinnerIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (!struct.isSetWinner()) {
                throw new TProtocolException("Required field 'winner' was not found in serialized data! Struct: " + toString());
            }
            if (!struct.isSetBegin_time()) {
                throw new TProtocolException("Required field 'begin_time' was not found in serialized data! Struct: " + toString());
            }
            if (struct.isSetEnd_time()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'end_time' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, ScoreInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(ScoreInfo.STRUCT_DESC);
            oprot.writeFieldBegin(ScoreInfo.WINNER_FIELD_DESC);
            oprot.writeI32(struct.winner);
            oprot.writeFieldEnd();
            if (struct.prize != null) {
                oprot.writeFieldBegin(ScoreInfo.PRIZE_FIELD_DESC);
                oprot.writeString(struct.prize);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(ScoreInfo.BEGIN_TIME_FIELD_DESC);
            oprot.writeI64(struct.begin_time);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(ScoreInfo.END_TIME_FIELD_DESC);
            oprot.writeI64(struct.end_time);
            oprot.writeFieldEnd();
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ScoreInfoStandardSchemeFactory implements SchemeFactory {
        private ScoreInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public ScoreInfoStandardScheme getScheme() {
            return new ScoreInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ScoreInfoTupleScheme extends TupleScheme<ScoreInfo> {
        private ScoreInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, ScoreInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.winner = tTupleProtocol.readI32();
            struct.setWinnerIsSet(true);
            struct.prize = tTupleProtocol.readString();
            struct.setPrizeIsSet(true);
            struct.begin_time = tTupleProtocol.readI64();
            struct.setBegin_timeIsSet(true);
            struct.end_time = tTupleProtocol.readI64();
            struct.setEnd_timeIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, ScoreInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.winner);
            tTupleProtocol.writeString(struct.prize);
            tTupleProtocol.writeI64(struct.begin_time);
            tTupleProtocol.writeI64(struct.end_time);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ScoreInfoTupleSchemeFactory implements SchemeFactory {
        private ScoreInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public ScoreInfoTupleScheme getScheme() {
            return new ScoreInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        WINNER(1, "winner"),
        PRIZE(2, "prize"),
        BEGIN_TIME(3, "begin_time"),
        END_TIME(4, "end_time");

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
                return WINNER;
            }
            if (fieldId == 2) {
                return PRIZE;
            }
            if (fieldId == 3) {
                return BEGIN_TIME;
            }
            if (fieldId != 4) {
                return null;
            }
            return END_TIME;
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
        hashMap.put(StandardScheme.class, new ScoreInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new ScoreInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.WINNER, (_Fields) new FieldMetaData("winner", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.PRIZE, (_Fields) new FieldMetaData("prize", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.BEGIN_TIME, (_Fields) new FieldMetaData("begin_time", (byte) 1, new FieldValueMetaData((byte) 10)));
        enumMap.put((EnumMap) _Fields.END_TIME, (_Fields) new FieldMetaData("end_time", (byte) 1, new FieldValueMetaData((byte) 10)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(ScoreInfo.class, unmodifiableMap);
    }

    public ScoreInfo() {
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
        setWinnerIsSet(false);
        this.winner = 0;
        this.prize = null;
        setBegin_timeIsSet(false);
        this.begin_time = 0L;
        setEnd_timeIsSet(false);
        this.end_time = 0L;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof ScoreInfo)) {
            return equals((ScoreInfo) that);
        }
        return false;
    }

    public long getBegin_time() {
        return this.begin_time;
    }

    public long getEnd_time() {
        return this.end_time;
    }

    public String getPrize() {
        return this.prize;
    }

    public int getWinner() {
        return this.winner;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetBegin_time() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetEnd_time() {
        return EncodingUtils.testBit(this.__isset_bitfield, 2);
    }

    public boolean isSetPrize() {
        return this.prize != null;
    }

    public boolean isSetWinner() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public ScoreInfo setBegin_time(long begin_time) {
        this.begin_time = begin_time;
        setBegin_timeIsSet(true);
        return this;
    }

    public void setBegin_timeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public ScoreInfo setEnd_time(long end_time) {
        this.end_time = end_time;
        setEnd_timeIsSet(true);
        return this;
    }

    public void setEnd_timeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 2, value);
    }

    public ScoreInfo setPrize(String prize) {
        this.prize = prize;
        return this;
    }

    public void setPrizeIsSet(boolean value) {
        if (value) {
            return;
        }
        this.prize = null;
    }

    public ScoreInfo setWinner(int winner) {
        this.winner = winner;
        setWinnerIsSet(true);
        return this;
    }

    public void setWinnerIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ScoreInfo(");
        sb2.append("winner:");
        sb2.append(this.winner);
        sb2.append(j2.O);
        sb2.append("prize:");
        String str = this.prize;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(j2.O);
        sb2.append("begin_time:");
        sb2.append(this.begin_time);
        sb2.append(j2.O);
        sb2.append("end_time:");
        sb2.append(this.end_time);
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetBegin_time() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetEnd_time() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 2);
    }

    public void unsetPrize() {
        this.prize = null;
    }

    public void unsetWinner() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void validate() throws TException {
        if (this.prize != null) {
            return;
        }
        throw new TProtocolException("Required field 'prize' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(ScoreInfo other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo5 = Boolean.valueOf(isSetWinner()).compareTo(Boolean.valueOf(other.isSetWinner()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (isSetWinner() && (compareTo4 = TBaseHelper.compareTo(this.winner, other.winner)) != 0) {
            return compareTo4;
        }
        int compareTo6 = Boolean.valueOf(isSetPrize()).compareTo(Boolean.valueOf(other.isSetPrize()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (isSetPrize() && (compareTo3 = TBaseHelper.compareTo(this.prize, other.prize)) != 0) {
            return compareTo3;
        }
        int compareTo7 = Boolean.valueOf(isSetBegin_time()).compareTo(Boolean.valueOf(other.isSetBegin_time()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (isSetBegin_time() && (compareTo2 = TBaseHelper.compareTo(this.begin_time, other.begin_time)) != 0) {
            return compareTo2;
        }
        int compareTo8 = Boolean.valueOf(isSetEnd_time()).compareTo(Boolean.valueOf(other.isSetEnd_time()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (!isSetEnd_time() || (compareTo = TBaseHelper.compareTo(this.end_time, other.end_time)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<ScoreInfo, _Fields> deepCopy2() {
        return new ScoreInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$hero_api$ScoreInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return Integer.valueOf(getWinner());
        }
        if (i11 == 2) {
            return getPrize();
        }
        if (i11 == 3) {
            return Long.valueOf(getBegin_time());
        }
        if (i11 == 4) {
            return Long.valueOf(getEnd_time());
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$hero_api$ScoreInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetWinner();
        }
        if (i11 == 2) {
            return isSetPrize();
        }
        if (i11 == 3) {
            return isSetBegin_time();
        }
        if (i11 == 4) {
            return isSetEnd_time();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$hero_api$ScoreInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetWinner();
                return;
            } else {
                setWinner(((Integer) value).intValue());
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetPrize();
                return;
            } else {
                setPrize((String) value);
                return;
            }
        }
        if (i11 == 3) {
            if (value == null) {
                unsetBegin_time();
                return;
            } else {
                setBegin_time(((Long) value).longValue());
                return;
            }
        }
        if (i11 != 4) {
            return;
        }
        if (value == null) {
            unsetEnd_time();
        } else {
            setEnd_time(((Long) value).longValue());
        }
    }

    public ScoreInfo(int winner, String prize, long begin_time, long end_time) {
        this();
        this.winner = winner;
        setWinnerIsSet(true);
        this.prize = prize;
        this.begin_time = begin_time;
        setBegin_timeIsSet(true);
        this.end_time = end_time;
        setEnd_timeIsSet(true);
    }

    public boolean equals(ScoreInfo that) {
        if (that == null || this.winner != that.winner) {
            return false;
        }
        boolean isSetPrize = isSetPrize();
        boolean isSetPrize2 = that.isSetPrize();
        return (!(isSetPrize || isSetPrize2) || (isSetPrize && isSetPrize2 && this.prize.equals(that.prize))) && this.begin_time == that.begin_time && this.end_time == that.end_time;
    }

    public ScoreInfo(ScoreInfo other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        this.winner = other.winner;
        if (other.isSetPrize()) {
            this.prize = other.prize;
        }
        this.begin_time = other.begin_time;
        this.end_time = other.end_time;
    }
}

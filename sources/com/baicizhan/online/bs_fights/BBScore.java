package com.baicizhan.online.bs_fights;

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
public class BBScore implements TBase<BBScore, _Fields>, Serializable, Cloneable, Comparable<BBScore> {
    private static final int __DRAW_COUNT_ISSET_ID = 1;
    private static final int __LOSE_COUNT_ISSET_ID = 2;
    private static final int __WIN_COUNT_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public int draw_count;
    public int lose_count;
    public int win_count;
    private static final TStruct STRUCT_DESC = new TStruct("BBScore");
    private static final TField WIN_COUNT_FIELD_DESC = new TField("win_count", (byte) 8, 1);
    private static final TField DRAW_COUNT_FIELD_DESC = new TField("draw_count", (byte) 8, 2);
    private static final TField LOSE_COUNT_FIELD_DESC = new TField("lose_count", (byte) 8, 3);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.bs_fights.BBScore$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_fights$BBScore$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$bs_fights$BBScore$_Fields = iArr;
            try {
                iArr[_Fields.WIN_COUNT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_fights$BBScore$_Fields[_Fields.DRAW_COUNT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_fights$BBScore$_Fields[_Fields.LOSE_COUNT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBScoreStandardScheme extends StandardScheme<BBScore> {
        private BBScoreStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, BBScore struct) throws TException {
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
                            TProtocolUtil.skip(iprot, b11);
                        } else if (b11 == 8) {
                            struct.lose_count = iprot.readI32();
                            struct.setLose_countIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 8) {
                        struct.draw_count = iprot.readI32();
                        struct.setDraw_countIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 8) {
                    struct.win_count = iprot.readI32();
                    struct.setWin_countIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (!struct.isSetWin_count()) {
                throw new TProtocolException("Required field 'win_count' was not found in serialized data! Struct: " + toString());
            }
            if (!struct.isSetDraw_count()) {
                throw new TProtocolException("Required field 'draw_count' was not found in serialized data! Struct: " + toString());
            }
            if (struct.isSetLose_count()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'lose_count' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, BBScore struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(BBScore.STRUCT_DESC);
            oprot.writeFieldBegin(BBScore.WIN_COUNT_FIELD_DESC);
            oprot.writeI32(struct.win_count);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(BBScore.DRAW_COUNT_FIELD_DESC);
            oprot.writeI32(struct.draw_count);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(BBScore.LOSE_COUNT_FIELD_DESC);
            oprot.writeI32(struct.lose_count);
            oprot.writeFieldEnd();
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBScoreStandardSchemeFactory implements SchemeFactory {
        private BBScoreStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BBScoreStandardScheme getScheme() {
            return new BBScoreStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBScoreTupleScheme extends TupleScheme<BBScore> {
        private BBScoreTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, BBScore struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.win_count = tTupleProtocol.readI32();
            struct.setWin_countIsSet(true);
            struct.draw_count = tTupleProtocol.readI32();
            struct.setDraw_countIsSet(true);
            struct.lose_count = tTupleProtocol.readI32();
            struct.setLose_countIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, BBScore struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.win_count);
            tTupleProtocol.writeI32(struct.draw_count);
            tTupleProtocol.writeI32(struct.lose_count);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBScoreTupleSchemeFactory implements SchemeFactory {
        private BBScoreTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BBScoreTupleScheme getScheme() {
            return new BBScoreTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        WIN_COUNT(1, "win_count"),
        DRAW_COUNT(2, "draw_count"),
        LOSE_COUNT(3, "lose_count");

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
                return WIN_COUNT;
            }
            if (fieldId == 2) {
                return DRAW_COUNT;
            }
            if (fieldId != 3) {
                return null;
            }
            return LOSE_COUNT;
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
        hashMap.put(StandardScheme.class, new BBScoreStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new BBScoreTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.WIN_COUNT, (_Fields) new FieldMetaData("win_count", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.DRAW_COUNT, (_Fields) new FieldMetaData("draw_count", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.LOSE_COUNT, (_Fields) new FieldMetaData("lose_count", (byte) 1, new FieldValueMetaData((byte) 8)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(BBScore.class, unmodifiableMap);
    }

    public BBScore() {
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
        setWin_countIsSet(false);
        this.win_count = 0;
        setDraw_countIsSet(false);
        this.draw_count = 0;
        setLose_countIsSet(false);
        this.lose_count = 0;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof BBScore)) {
            return equals((BBScore) that);
        }
        return false;
    }

    public int getDraw_count() {
        return this.draw_count;
    }

    public int getLose_count() {
        return this.lose_count;
    }

    public int getWin_count() {
        return this.win_count;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetDraw_count() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetLose_count() {
        return EncodingUtils.testBit(this.__isset_bitfield, 2);
    }

    public boolean isSetWin_count() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public BBScore setDraw_count(int draw_count) {
        this.draw_count = draw_count;
        setDraw_countIsSet(true);
        return this;
    }

    public void setDraw_countIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public BBScore setLose_count(int lose_count) {
        this.lose_count = lose_count;
        setLose_countIsSet(true);
        return this;
    }

    public void setLose_countIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 2, value);
    }

    public BBScore setWin_count(int win_count) {
        this.win_count = win_count;
        setWin_countIsSet(true);
        return this;
    }

    public void setWin_countIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public String toString() {
        return "BBScore(win_count:" + this.win_count + j2.O + "draw_count:" + this.draw_count + j2.O + "lose_count:" + this.lose_count + pn.j.f81007d;
    }

    public void unsetDraw_count() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetLose_count() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 2);
    }

    public void unsetWin_count() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(BBScore other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo4 = Boolean.valueOf(isSetWin_count()).compareTo(Boolean.valueOf(other.isSetWin_count()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (isSetWin_count() && (compareTo3 = TBaseHelper.compareTo(this.win_count, other.win_count)) != 0) {
            return compareTo3;
        }
        int compareTo5 = Boolean.valueOf(isSetDraw_count()).compareTo(Boolean.valueOf(other.isSetDraw_count()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (isSetDraw_count() && (compareTo2 = TBaseHelper.compareTo(this.draw_count, other.draw_count)) != 0) {
            return compareTo2;
        }
        int compareTo6 = Boolean.valueOf(isSetLose_count()).compareTo(Boolean.valueOf(other.isSetLose_count()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (!isSetLose_count() || (compareTo = TBaseHelper.compareTo(this.lose_count, other.lose_count)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<BBScore, _Fields> deepCopy2() {
        return new BBScore(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BBScore$_Fields[field.ordinal()];
        if (i11 == 1) {
            return Integer.valueOf(getWin_count());
        }
        if (i11 == 2) {
            return Integer.valueOf(getDraw_count());
        }
        if (i11 == 3) {
            return Integer.valueOf(getLose_count());
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BBScore$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetWin_count();
        }
        if (i11 == 2) {
            return isSetDraw_count();
        }
        if (i11 == 3) {
            return isSetLose_count();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BBScore$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetWin_count();
                return;
            } else {
                setWin_count(((Integer) value).intValue());
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetDraw_count();
                return;
            } else {
                setDraw_count(((Integer) value).intValue());
                return;
            }
        }
        if (i11 != 3) {
            return;
        }
        if (value == null) {
            unsetLose_count();
        } else {
            setLose_count(((Integer) value).intValue());
        }
    }

    public BBScore(int win_count, int draw_count, int lose_count) {
        this();
        this.win_count = win_count;
        setWin_countIsSet(true);
        this.draw_count = draw_count;
        setDraw_countIsSet(true);
        this.lose_count = lose_count;
        setLose_countIsSet(true);
    }

    public boolean equals(BBScore that) {
        return that != null && this.win_count == that.win_count && this.draw_count == that.draw_count && this.lose_count == that.lose_count;
    }

    public BBScore(BBScore other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        this.win_count = other.win_count;
        this.draw_count = other.draw_count;
        this.lose_count = other.lose_count;
    }

    public void validate() throws TException {
    }
}

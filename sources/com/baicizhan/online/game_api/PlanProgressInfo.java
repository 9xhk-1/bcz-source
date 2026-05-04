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
public class PlanProgressInfo implements TBase<PlanProgressInfo, _Fields>, Serializable, Cloneable, Comparable<PlanProgressInfo> {
    private static final int __FINISH_ROUND_ISSET_ID = 1;
    private static final int __TARGET_ROUND_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public CompassInfo compass_info;
    public int finish_round;
    public List<RoundInfo> rounds;
    public int target_round;
    private static final TStruct STRUCT_DESC = new TStruct("PlanProgressInfo");
    private static final TField TARGET_ROUND_FIELD_DESC = new TField("target_round", (byte) 8, 1);
    private static final TField FINISH_ROUND_FIELD_DESC = new TField("finish_round", (byte) 8, 2);
    private static final TField COMPASS_INFO_FIELD_DESC = new TField("compass_info", (byte) 12, 3);
    private static final TField ROUNDS_FIELD_DESC = new TField("rounds", (byte) 15, 4);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.game_api.PlanProgressInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$game_api$PlanProgressInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$game_api$PlanProgressInfo$_Fields = iArr;
            try {
                iArr[_Fields.TARGET_ROUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$PlanProgressInfo$_Fields[_Fields.FINISH_ROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$PlanProgressInfo$_Fields[_Fields.COMPASS_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$PlanProgressInfo$_Fields[_Fields.ROUNDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class PlanProgressInfoStandardScheme extends StandardScheme<PlanProgressInfo> {
        private PlanProgressInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, PlanProgressInfo struct) throws TException {
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
                            } else if (b11 == 15) {
                                TList readListBegin = iprot.readListBegin();
                                struct.rounds = new ArrayList(readListBegin.size);
                                for (int i11 = 0; i11 < readListBegin.size; i11++) {
                                    RoundInfo roundInfo = new RoundInfo();
                                    roundInfo.read(iprot);
                                    struct.rounds.add(roundInfo);
                                }
                                iprot.readListEnd();
                                struct.setRoundsIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 12) {
                            CompassInfo compassInfo = new CompassInfo();
                            struct.compass_info = compassInfo;
                            compassInfo.read(iprot);
                            struct.setCompass_infoIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 8) {
                        struct.finish_round = iprot.readI32();
                        struct.setFinish_roundIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 8) {
                    struct.target_round = iprot.readI32();
                    struct.setTarget_roundIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (!struct.isSetTarget_round()) {
                throw new TProtocolException("Required field 'target_round' was not found in serialized data! Struct: " + toString());
            }
            if (struct.isSetFinish_round()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'finish_round' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, PlanProgressInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(PlanProgressInfo.STRUCT_DESC);
            oprot.writeFieldBegin(PlanProgressInfo.TARGET_ROUND_FIELD_DESC);
            oprot.writeI32(struct.target_round);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(PlanProgressInfo.FINISH_ROUND_FIELD_DESC);
            oprot.writeI32(struct.finish_round);
            oprot.writeFieldEnd();
            if (struct.compass_info != null) {
                oprot.writeFieldBegin(PlanProgressInfo.COMPASS_INFO_FIELD_DESC);
                struct.compass_info.write(oprot);
                oprot.writeFieldEnd();
            }
            if (struct.rounds != null) {
                oprot.writeFieldBegin(PlanProgressInfo.ROUNDS_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 12, struct.rounds.size()));
                Iterator<RoundInfo> it = struct.rounds.iterator();
                while (it.hasNext()) {
                    it.next().write(oprot);
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class PlanProgressInfoStandardSchemeFactory implements SchemeFactory {
        private PlanProgressInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public PlanProgressInfoStandardScheme getScheme() {
            return new PlanProgressInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class PlanProgressInfoTupleScheme extends TupleScheme<PlanProgressInfo> {
        private PlanProgressInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, PlanProgressInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.target_round = tTupleProtocol.readI32();
            struct.setTarget_roundIsSet(true);
            struct.finish_round = tTupleProtocol.readI32();
            struct.setFinish_roundIsSet(true);
            CompassInfo compassInfo = new CompassInfo();
            struct.compass_info = compassInfo;
            compassInfo.read(tTupleProtocol);
            struct.setCompass_infoIsSet(true);
            TList tList = new TList((byte) 12, tTupleProtocol.readI32());
            struct.rounds = new ArrayList(tList.size);
            for (int i11 = 0; i11 < tList.size; i11++) {
                RoundInfo roundInfo = new RoundInfo();
                roundInfo.read(tTupleProtocol);
                struct.rounds.add(roundInfo);
            }
            struct.setRoundsIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, PlanProgressInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.target_round);
            tTupleProtocol.writeI32(struct.finish_round);
            struct.compass_info.write(tTupleProtocol);
            tTupleProtocol.writeI32(struct.rounds.size());
            Iterator<RoundInfo> it = struct.rounds.iterator();
            while (it.hasNext()) {
                it.next().write(tTupleProtocol);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class PlanProgressInfoTupleSchemeFactory implements SchemeFactory {
        private PlanProgressInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public PlanProgressInfoTupleScheme getScheme() {
            return new PlanProgressInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        TARGET_ROUND(1, "target_round"),
        FINISH_ROUND(2, "finish_round"),
        COMPASS_INFO(3, "compass_info"),
        ROUNDS(4, "rounds");

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
                return TARGET_ROUND;
            }
            if (fieldId == 2) {
                return FINISH_ROUND;
            }
            if (fieldId == 3) {
                return COMPASS_INFO;
            }
            if (fieldId != 4) {
                return null;
            }
            return ROUNDS;
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
        hashMap.put(StandardScheme.class, new PlanProgressInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new PlanProgressInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.TARGET_ROUND, (_Fields) new FieldMetaData("target_round", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.FINISH_ROUND, (_Fields) new FieldMetaData("finish_round", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.COMPASS_INFO, (_Fields) new FieldMetaData("compass_info", (byte) 1, new StructMetaData((byte) 12, CompassInfo.class)));
        enumMap.put((EnumMap) _Fields.ROUNDS, (_Fields) new FieldMetaData("rounds", (byte) 1, new ListMetaData((byte) 15, new StructMetaData((byte) 12, RoundInfo.class))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(PlanProgressInfo.class, unmodifiableMap);
    }

    public PlanProgressInfo() {
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

    public void addToRounds(RoundInfo elem) {
        if (this.rounds == null) {
            this.rounds = new ArrayList();
        }
        this.rounds.add(elem);
    }

    @Override // org.apache.thrift.TBase
    public void clear() {
        setTarget_roundIsSet(false);
        this.target_round = 0;
        setFinish_roundIsSet(false);
        this.finish_round = 0;
        this.compass_info = null;
        this.rounds = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof PlanProgressInfo)) {
            return equals((PlanProgressInfo) that);
        }
        return false;
    }

    public CompassInfo getCompass_info() {
        return this.compass_info;
    }

    public int getFinish_round() {
        return this.finish_round;
    }

    public List<RoundInfo> getRounds() {
        return this.rounds;
    }

    public Iterator<RoundInfo> getRoundsIterator() {
        List<RoundInfo> list = this.rounds;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getRoundsSize() {
        List<RoundInfo> list = this.rounds;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public int getTarget_round() {
        return this.target_round;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetCompass_info() {
        return this.compass_info != null;
    }

    public boolean isSetFinish_round() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetRounds() {
        return this.rounds != null;
    }

    public boolean isSetTarget_round() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public PlanProgressInfo setCompass_info(CompassInfo compass_info) {
        this.compass_info = compass_info;
        return this;
    }

    public void setCompass_infoIsSet(boolean value) {
        if (value) {
            return;
        }
        this.compass_info = null;
    }

    public PlanProgressInfo setFinish_round(int finish_round) {
        this.finish_round = finish_round;
        setFinish_roundIsSet(true);
        return this;
    }

    public void setFinish_roundIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public PlanProgressInfo setRounds(List<RoundInfo> rounds) {
        this.rounds = rounds;
        return this;
    }

    public void setRoundsIsSet(boolean value) {
        if (value) {
            return;
        }
        this.rounds = null;
    }

    public PlanProgressInfo setTarget_round(int target_round) {
        this.target_round = target_round;
        setTarget_roundIsSet(true);
        return this;
    }

    public void setTarget_roundIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("PlanProgressInfo(");
        sb2.append("target_round:");
        sb2.append(this.target_round);
        sb2.append(j2.O);
        sb2.append("finish_round:");
        sb2.append(this.finish_round);
        sb2.append(j2.O);
        sb2.append("compass_info:");
        CompassInfo compassInfo = this.compass_info;
        if (compassInfo == null) {
            sb2.append("null");
        } else {
            sb2.append(compassInfo);
        }
        sb2.append(j2.O);
        sb2.append("rounds:");
        List<RoundInfo> list = this.rounds;
        if (list == null) {
            sb2.append("null");
        } else {
            sb2.append(list);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetCompass_info() {
        this.compass_info = null;
    }

    public void unsetFinish_round() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetRounds() {
        this.rounds = null;
    }

    public void unsetTarget_round() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void validate() throws TException {
        CompassInfo compassInfo = this.compass_info;
        if (compassInfo == null) {
            throw new TProtocolException("Required field 'compass_info' was not present! Struct: " + toString());
        }
        if (this.rounds != null) {
            if (compassInfo != null) {
                compassInfo.validate();
            }
        } else {
            throw new TProtocolException("Required field 'rounds' was not present! Struct: " + toString());
        }
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(PlanProgressInfo other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo5 = Boolean.valueOf(isSetTarget_round()).compareTo(Boolean.valueOf(other.isSetTarget_round()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (isSetTarget_round() && (compareTo4 = TBaseHelper.compareTo(this.target_round, other.target_round)) != 0) {
            return compareTo4;
        }
        int compareTo6 = Boolean.valueOf(isSetFinish_round()).compareTo(Boolean.valueOf(other.isSetFinish_round()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (isSetFinish_round() && (compareTo3 = TBaseHelper.compareTo(this.finish_round, other.finish_round)) != 0) {
            return compareTo3;
        }
        int compareTo7 = Boolean.valueOf(isSetCompass_info()).compareTo(Boolean.valueOf(other.isSetCompass_info()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (isSetCompass_info() && (compareTo2 = TBaseHelper.compareTo((Comparable) this.compass_info, (Comparable) other.compass_info)) != 0) {
            return compareTo2;
        }
        int compareTo8 = Boolean.valueOf(isSetRounds()).compareTo(Boolean.valueOf(other.isSetRounds()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (!isSetRounds() || (compareTo = TBaseHelper.compareTo((List) this.rounds, (List) other.rounds)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<PlanProgressInfo, _Fields> deepCopy2() {
        return new PlanProgressInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$PlanProgressInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return Integer.valueOf(getTarget_round());
        }
        if (i11 == 2) {
            return Integer.valueOf(getFinish_round());
        }
        if (i11 == 3) {
            return getCompass_info();
        }
        if (i11 == 4) {
            return getRounds();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$PlanProgressInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetTarget_round();
        }
        if (i11 == 2) {
            return isSetFinish_round();
        }
        if (i11 == 3) {
            return isSetCompass_info();
        }
        if (i11 == 4) {
            return isSetRounds();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$PlanProgressInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetTarget_round();
                return;
            } else {
                setTarget_round(((Integer) value).intValue());
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetFinish_round();
                return;
            } else {
                setFinish_round(((Integer) value).intValue());
                return;
            }
        }
        if (i11 == 3) {
            if (value == null) {
                unsetCompass_info();
                return;
            } else {
                setCompass_info((CompassInfo) value);
                return;
            }
        }
        if (i11 != 4) {
            return;
        }
        if (value == null) {
            unsetRounds();
        } else {
            setRounds((List) value);
        }
    }

    public PlanProgressInfo(int target_round, int finish_round, CompassInfo compass_info, List<RoundInfo> rounds) {
        this();
        this.target_round = target_round;
        setTarget_roundIsSet(true);
        this.finish_round = finish_round;
        setFinish_roundIsSet(true);
        this.compass_info = compass_info;
        this.rounds = rounds;
    }

    public boolean equals(PlanProgressInfo that) {
        if (that == null || this.target_round != that.target_round || this.finish_round != that.finish_round) {
            return false;
        }
        boolean isSetCompass_info = isSetCompass_info();
        boolean isSetCompass_info2 = that.isSetCompass_info();
        if ((isSetCompass_info || isSetCompass_info2) && !(isSetCompass_info && isSetCompass_info2 && this.compass_info.equals(that.compass_info))) {
            return false;
        }
        boolean isSetRounds = isSetRounds();
        boolean isSetRounds2 = that.isSetRounds();
        if (isSetRounds || isSetRounds2) {
            return isSetRounds && isSetRounds2 && this.rounds.equals(that.rounds);
        }
        return true;
    }

    public PlanProgressInfo(PlanProgressInfo other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        this.target_round = other.target_round;
        this.finish_round = other.finish_round;
        if (other.isSetCompass_info()) {
            this.compass_info = new CompassInfo(other.compass_info);
        }
        if (other.isSetRounds()) {
            ArrayList arrayList = new ArrayList(other.rounds.size());
            Iterator<RoundInfo> it = other.rounds.iterator();
            while (it.hasNext()) {
                arrayList.add(new RoundInfo(it.next()));
            }
            this.rounds = arrayList;
        }
    }
}

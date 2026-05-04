package com.baicizhan.online.bs_fights;

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
import org.apache.thrift.meta_data.StructMetaData;
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
public class BBResult implements TBase<BBResult, _Fields>, Serializable, Cloneable, Comparable<BBResult> {
    private static final int __NEED_WAIT_ISSET_ID = 1;
    private static final int __RES_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;

    /* renamed from: a, reason: collision with root package name */
    public BBAnswer f28146a;

    /* renamed from: b, reason: collision with root package name */
    public BBAnswer f28147b;
    public String fight_id;
    public int need_wait;
    private _Fields[] optionals;
    public int res;
    public BBFightShareInfo share_info;
    private static final TStruct STRUCT_DESC = new TStruct("BBResult");
    private static final TField A_FIELD_DESC = new TField("a", (byte) 12, 1);
    private static final TField B_FIELD_DESC = new TField(yr.e.f100279a, (byte) 12, 2);
    private static final TField RES_FIELD_DESC = new TField("res", (byte) 8, 3);
    private static final TField SHARE_INFO_FIELD_DESC = new TField("share_info", (byte) 12, 4);
    private static final TField FIGHT_ID_FIELD_DESC = new TField("fight_id", (byte) 11, 5);
    private static final TField NEED_WAIT_FIELD_DESC = new TField("need_wait", (byte) 8, 6);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.bs_fights.BBResult$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_fights$BBResult$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$bs_fights$BBResult$_Fields = iArr;
            try {
                iArr[_Fields.A.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_fights$BBResult$_Fields[_Fields.B.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_fights$BBResult$_Fields[_Fields.RES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_fights$BBResult$_Fields[_Fields.SHARE_INFO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_fights$BBResult$_Fields[_Fields.FIGHT_ID.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_fights$BBResult$_Fields[_Fields.NEED_WAIT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBResultStandardScheme extends StandardScheme<BBResult> {
        private BBResultStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, BBResult struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    iprot.readStructEnd();
                    if (struct.isSetNeed_wait()) {
                        struct.validate();
                        return;
                    }
                    throw new TProtocolException("Required field 'need_wait' was not found in serialized data! Struct: " + toString());
                }
                switch (readFieldBegin.f77768id) {
                    case 1:
                        if (b11 != 12) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            BBAnswer bBAnswer = new BBAnswer();
                            struct.f28146a = bBAnswer;
                            bBAnswer.read(iprot);
                            struct.setAIsSet(true);
                            break;
                        }
                    case 2:
                        if (b11 != 12) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            BBAnswer bBAnswer2 = new BBAnswer();
                            struct.f28147b = bBAnswer2;
                            bBAnswer2.read(iprot);
                            struct.setBIsSet(true);
                            break;
                        }
                    case 3:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.res = iprot.readI32();
                            struct.setResIsSet(true);
                            break;
                        }
                    case 4:
                        if (b11 != 12) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            BBFightShareInfo bBFightShareInfo = new BBFightShareInfo();
                            struct.share_info = bBFightShareInfo;
                            bBFightShareInfo.read(iprot);
                            struct.setShare_infoIsSet(true);
                            break;
                        }
                    case 5:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.fight_id = iprot.readString();
                            struct.setFight_idIsSet(true);
                            break;
                        }
                    case 6:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.need_wait = iprot.readI32();
                            struct.setNeed_waitIsSet(true);
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
        public void write(TProtocol oprot, BBResult struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(BBResult.STRUCT_DESC);
            if (struct.f28146a != null && struct.isSetA()) {
                oprot.writeFieldBegin(BBResult.A_FIELD_DESC);
                struct.f28146a.write(oprot);
                oprot.writeFieldEnd();
            }
            if (struct.f28147b != null && struct.isSetB()) {
                oprot.writeFieldBegin(BBResult.B_FIELD_DESC);
                struct.f28147b.write(oprot);
                oprot.writeFieldEnd();
            }
            if (struct.isSetRes()) {
                oprot.writeFieldBegin(BBResult.RES_FIELD_DESC);
                oprot.writeI32(struct.res);
                oprot.writeFieldEnd();
            }
            if (struct.share_info != null && struct.isSetShare_info()) {
                oprot.writeFieldBegin(BBResult.SHARE_INFO_FIELD_DESC);
                struct.share_info.write(oprot);
                oprot.writeFieldEnd();
            }
            if (struct.fight_id != null && struct.isSetFight_id()) {
                oprot.writeFieldBegin(BBResult.FIGHT_ID_FIELD_DESC);
                oprot.writeString(struct.fight_id);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(BBResult.NEED_WAIT_FIELD_DESC);
            oprot.writeI32(struct.need_wait);
            oprot.writeFieldEnd();
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBResultStandardSchemeFactory implements SchemeFactory {
        private BBResultStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BBResultStandardScheme getScheme() {
            return new BBResultStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBResultTupleScheme extends TupleScheme<BBResult> {
        private BBResultTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, BBResult struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.need_wait = tTupleProtocol.readI32();
            struct.setNeed_waitIsSet(true);
            BitSet readBitSet = tTupleProtocol.readBitSet(5);
            if (readBitSet.get(0)) {
                BBAnswer bBAnswer = new BBAnswer();
                struct.f28146a = bBAnswer;
                bBAnswer.read(tTupleProtocol);
                struct.setAIsSet(true);
            }
            if (readBitSet.get(1)) {
                BBAnswer bBAnswer2 = new BBAnswer();
                struct.f28147b = bBAnswer2;
                bBAnswer2.read(tTupleProtocol);
                struct.setBIsSet(true);
            }
            if (readBitSet.get(2)) {
                struct.res = tTupleProtocol.readI32();
                struct.setResIsSet(true);
            }
            if (readBitSet.get(3)) {
                BBFightShareInfo bBFightShareInfo = new BBFightShareInfo();
                struct.share_info = bBFightShareInfo;
                bBFightShareInfo.read(tTupleProtocol);
                struct.setShare_infoIsSet(true);
            }
            if (readBitSet.get(4)) {
                struct.fight_id = tTupleProtocol.readString();
                struct.setFight_idIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, BBResult struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.need_wait);
            BitSet bitSet = new BitSet();
            if (struct.isSetA()) {
                bitSet.set(0);
            }
            if (struct.isSetB()) {
                bitSet.set(1);
            }
            if (struct.isSetRes()) {
                bitSet.set(2);
            }
            if (struct.isSetShare_info()) {
                bitSet.set(3);
            }
            if (struct.isSetFight_id()) {
                bitSet.set(4);
            }
            tTupleProtocol.writeBitSet(bitSet, 5);
            if (struct.isSetA()) {
                struct.f28146a.write(tTupleProtocol);
            }
            if (struct.isSetB()) {
                struct.f28147b.write(tTupleProtocol);
            }
            if (struct.isSetRes()) {
                tTupleProtocol.writeI32(struct.res);
            }
            if (struct.isSetShare_info()) {
                struct.share_info.write(tTupleProtocol);
            }
            if (struct.isSetFight_id()) {
                tTupleProtocol.writeString(struct.fight_id);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBResultTupleSchemeFactory implements SchemeFactory {
        private BBResultTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BBResultTupleScheme getScheme() {
            return new BBResultTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        A(1, "a"),
        B(2, yr.e.f100279a),
        RES(3, "res"),
        SHARE_INFO(4, "share_info"),
        FIGHT_ID(5, "fight_id"),
        NEED_WAIT(6, "need_wait");

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
                    return A;
                case 2:
                    return B;
                case 3:
                    return RES;
                case 4:
                    return SHARE_INFO;
                case 5:
                    return FIGHT_ID;
                case 6:
                    return NEED_WAIT;
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
        hashMap.put(StandardScheme.class, new BBResultStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new BBResultTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.A, (_Fields) new FieldMetaData("a", (byte) 2, new StructMetaData((byte) 12, BBAnswer.class)));
        enumMap.put((EnumMap) _Fields.B, (_Fields) new FieldMetaData(yr.e.f100279a, (byte) 2, new StructMetaData((byte) 12, BBAnswer.class)));
        enumMap.put((EnumMap) _Fields.RES, (_Fields) new FieldMetaData("res", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.SHARE_INFO, (_Fields) new FieldMetaData("share_info", (byte) 2, new StructMetaData((byte) 12, BBFightShareInfo.class)));
        enumMap.put((EnumMap) _Fields.FIGHT_ID, (_Fields) new FieldMetaData("fight_id", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.NEED_WAIT, (_Fields) new FieldMetaData("need_wait", (byte) 1, new FieldValueMetaData((byte) 8)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(BBResult.class, unmodifiableMap);
    }

    public BBResult() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.A, _Fields.B, _Fields.RES, _Fields.SHARE_INFO, _Fields.FIGHT_ID};
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
        this.f28146a = null;
        this.f28147b = null;
        setResIsSet(false);
        this.res = 0;
        this.share_info = null;
        this.fight_id = null;
        setNeed_waitIsSet(false);
        this.need_wait = 0;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof BBResult)) {
            return equals((BBResult) that);
        }
        return false;
    }

    public BBAnswer getA() {
        return this.f28146a;
    }

    public BBAnswer getB() {
        return this.f28147b;
    }

    public String getFight_id() {
        return this.fight_id;
    }

    public int getNeed_wait() {
        return this.need_wait;
    }

    public int getRes() {
        return this.res;
    }

    public BBFightShareInfo getShare_info() {
        return this.share_info;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetA() {
        return this.f28146a != null;
    }

    public boolean isSetB() {
        return this.f28147b != null;
    }

    public boolean isSetFight_id() {
        return this.fight_id != null;
    }

    public boolean isSetNeed_wait() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetRes() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetShare_info() {
        return this.share_info != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public BBResult setA(BBAnswer a11) {
        this.f28146a = a11;
        return this;
    }

    public void setAIsSet(boolean value) {
        if (value) {
            return;
        }
        this.f28146a = null;
    }

    public BBResult setB(BBAnswer b11) {
        this.f28147b = b11;
        return this;
    }

    public void setBIsSet(boolean value) {
        if (value) {
            return;
        }
        this.f28147b = null;
    }

    public BBResult setFight_id(String fight_id) {
        this.fight_id = fight_id;
        return this;
    }

    public void setFight_idIsSet(boolean value) {
        if (value) {
            return;
        }
        this.fight_id = null;
    }

    public BBResult setNeed_wait(int need_wait) {
        this.need_wait = need_wait;
        setNeed_waitIsSet(true);
        return this;
    }

    public void setNeed_waitIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public BBResult setRes(int res) {
        this.res = res;
        setResIsSet(true);
        return this;
    }

    public void setResIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public BBResult setShare_info(BBFightShareInfo share_info) {
        this.share_info = share_info;
        return this;
    }

    public void setShare_infoIsSet(boolean value) {
        if (value) {
            return;
        }
        this.share_info = null;
    }

    public String toString() {
        boolean z11;
        StringBuilder sb2 = new StringBuilder("BBResult(");
        boolean z12 = false;
        if (isSetA()) {
            sb2.append("a:");
            BBAnswer bBAnswer = this.f28146a;
            if (bBAnswer == null) {
                sb2.append("null");
            } else {
                sb2.append(bBAnswer);
            }
            z11 = false;
        } else {
            z11 = true;
        }
        if (isSetB()) {
            if (!z11) {
                sb2.append(j2.O);
            }
            sb2.append("b:");
            BBAnswer bBAnswer2 = this.f28147b;
            if (bBAnswer2 == null) {
                sb2.append("null");
            } else {
                sb2.append(bBAnswer2);
            }
            z11 = false;
        }
        if (isSetRes()) {
            if (!z11) {
                sb2.append(j2.O);
            }
            sb2.append("res:");
            sb2.append(this.res);
            z11 = false;
        }
        if (isSetShare_info()) {
            if (!z11) {
                sb2.append(j2.O);
            }
            sb2.append("share_info:");
            BBFightShareInfo bBFightShareInfo = this.share_info;
            if (bBFightShareInfo == null) {
                sb2.append("null");
            } else {
                sb2.append(bBFightShareInfo);
            }
            z11 = false;
        }
        if (isSetFight_id()) {
            if (!z11) {
                sb2.append(j2.O);
            }
            sb2.append("fight_id:");
            String str = this.fight_id;
            if (str == null) {
                sb2.append("null");
            } else {
                sb2.append(str);
            }
        } else {
            z12 = z11;
        }
        if (!z12) {
            sb2.append(j2.O);
        }
        sb2.append("need_wait:");
        sb2.append(this.need_wait);
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetA() {
        this.f28146a = null;
    }

    public void unsetB() {
        this.f28147b = null;
    }

    public void unsetFight_id() {
        this.fight_id = null;
    }

    public void unsetNeed_wait() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetRes() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetShare_info() {
        this.share_info = null;
    }

    public void validate() throws TException {
        BBAnswer bBAnswer = this.f28146a;
        if (bBAnswer != null) {
            bBAnswer.validate();
        }
        BBAnswer bBAnswer2 = this.f28147b;
        if (bBAnswer2 != null) {
            bBAnswer2.validate();
        }
        BBFightShareInfo bBFightShareInfo = this.share_info;
        if (bBFightShareInfo != null) {
            bBFightShareInfo.validate();
        }
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(BBResult other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        int compareTo5;
        int compareTo6;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo7 = Boolean.valueOf(isSetA()).compareTo(Boolean.valueOf(other.isSetA()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (isSetA() && (compareTo6 = TBaseHelper.compareTo((Comparable) this.f28146a, (Comparable) other.f28146a)) != 0) {
            return compareTo6;
        }
        int compareTo8 = Boolean.valueOf(isSetB()).compareTo(Boolean.valueOf(other.isSetB()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (isSetB() && (compareTo5 = TBaseHelper.compareTo((Comparable) this.f28147b, (Comparable) other.f28147b)) != 0) {
            return compareTo5;
        }
        int compareTo9 = Boolean.valueOf(isSetRes()).compareTo(Boolean.valueOf(other.isSetRes()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (isSetRes() && (compareTo4 = TBaseHelper.compareTo(this.res, other.res)) != 0) {
            return compareTo4;
        }
        int compareTo10 = Boolean.valueOf(isSetShare_info()).compareTo(Boolean.valueOf(other.isSetShare_info()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (isSetShare_info() && (compareTo3 = TBaseHelper.compareTo((Comparable) this.share_info, (Comparable) other.share_info)) != 0) {
            return compareTo3;
        }
        int compareTo11 = Boolean.valueOf(isSetFight_id()).compareTo(Boolean.valueOf(other.isSetFight_id()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (isSetFight_id() && (compareTo2 = TBaseHelper.compareTo(this.fight_id, other.fight_id)) != 0) {
            return compareTo2;
        }
        int compareTo12 = Boolean.valueOf(isSetNeed_wait()).compareTo(Boolean.valueOf(other.isSetNeed_wait()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (!isSetNeed_wait() || (compareTo = TBaseHelper.compareTo(this.need_wait, other.need_wait)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<BBResult, _Fields> deepCopy2() {
        return new BBResult(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BBResult$_Fields[field.ordinal()]) {
            case 1:
                return getA();
            case 2:
                return getB();
            case 3:
                return Integer.valueOf(getRes());
            case 4:
                return getShare_info();
            case 5:
                return getFight_id();
            case 6:
                return Integer.valueOf(getNeed_wait());
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BBResult$_Fields[field.ordinal()]) {
            case 1:
                return isSetA();
            case 2:
                return isSetB();
            case 3:
                return isSetRes();
            case 4:
                return isSetShare_info();
            case 5:
                return isSetFight_id();
            case 6:
                return isSetNeed_wait();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BBResult$_Fields[field.ordinal()]) {
            case 1:
                if (value != null) {
                    setA((BBAnswer) value);
                    break;
                } else {
                    unsetA();
                    break;
                }
            case 2:
                if (value != null) {
                    setB((BBAnswer) value);
                    break;
                } else {
                    unsetB();
                    break;
                }
            case 3:
                if (value != null) {
                    setRes(((Integer) value).intValue());
                    break;
                } else {
                    unsetRes();
                    break;
                }
            case 4:
                if (value != null) {
                    setShare_info((BBFightShareInfo) value);
                    break;
                } else {
                    unsetShare_info();
                    break;
                }
            case 5:
                if (value != null) {
                    setFight_id((String) value);
                    break;
                } else {
                    unsetFight_id();
                    break;
                }
            case 6:
                if (value != null) {
                    setNeed_wait(((Integer) value).intValue());
                    break;
                } else {
                    unsetNeed_wait();
                    break;
                }
        }
    }

    public boolean equals(BBResult that) {
        if (that == null) {
            return false;
        }
        boolean isSetA = isSetA();
        boolean isSetA2 = that.isSetA();
        if ((isSetA || isSetA2) && !(isSetA && isSetA2 && this.f28146a.equals(that.f28146a))) {
            return false;
        }
        boolean isSetB = isSetB();
        boolean isSetB2 = that.isSetB();
        if ((isSetB || isSetB2) && !(isSetB && isSetB2 && this.f28147b.equals(that.f28147b))) {
            return false;
        }
        boolean isSetRes = isSetRes();
        boolean isSetRes2 = that.isSetRes();
        if ((isSetRes || isSetRes2) && !(isSetRes && isSetRes2 && this.res == that.res)) {
            return false;
        }
        boolean isSetShare_info = isSetShare_info();
        boolean isSetShare_info2 = that.isSetShare_info();
        if ((isSetShare_info || isSetShare_info2) && !(isSetShare_info && isSetShare_info2 && this.share_info.equals(that.share_info))) {
            return false;
        }
        boolean isSetFight_id = isSetFight_id();
        boolean isSetFight_id2 = that.isSetFight_id();
        return (!(isSetFight_id || isSetFight_id2) || (isSetFight_id && isSetFight_id2 && this.fight_id.equals(that.fight_id))) && this.need_wait == that.need_wait;
    }

    public BBResult(int need_wait) {
        this();
        this.need_wait = need_wait;
        setNeed_waitIsSet(true);
    }

    public BBResult(BBResult other) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.A, _Fields.B, _Fields.RES, _Fields.SHARE_INFO, _Fields.FIGHT_ID};
        this.__isset_bitfield = other.__isset_bitfield;
        if (other.isSetA()) {
            this.f28146a = new BBAnswer(other.f28146a);
        }
        if (other.isSetB()) {
            this.f28147b = new BBAnswer(other.f28147b);
        }
        this.res = other.res;
        if (other.isSetShare_info()) {
            this.share_info = new BBFightShareInfo(other.share_info);
        }
        if (other.isSetFight_id()) {
            this.fight_id = other.fight_id;
        }
        this.need_wait = other.need_wait;
    }
}

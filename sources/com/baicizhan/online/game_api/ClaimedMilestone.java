package com.baicizhan.online.game_api;

import androidx.constraintlayout.core.motion.utils.TypedValues;
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
public class ClaimedMilestone implements TBase<ClaimedMilestone, _Fields>, Serializable, Cloneable, Comparable<ClaimedMilestone> {
    private static final int __CLAIMED_DATE_ISSET_ID = 1;
    private static final int __TARGET_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public List<AwardItem> awards;
    public int claimed_date;
    public int target;
    private static final TStruct STRUCT_DESC = new TStruct("ClaimedMilestone");
    private static final TField TARGET_FIELD_DESC = new TField(TypedValues.AttributesType.S_TARGET, (byte) 8, 1);
    private static final TField AWARDS_FIELD_DESC = new TField("awards", (byte) 15, 2);
    private static final TField CLAIMED_DATE_FIELD_DESC = new TField("claimed_date", (byte) 8, 3);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.game_api.ClaimedMilestone$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$game_api$ClaimedMilestone$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$game_api$ClaimedMilestone$_Fields = iArr;
            try {
                iArr[_Fields.TARGET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$ClaimedMilestone$_Fields[_Fields.AWARDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$ClaimedMilestone$_Fields[_Fields.CLAIMED_DATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ClaimedMilestoneStandardScheme extends StandardScheme<ClaimedMilestone> {
        private ClaimedMilestoneStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, ClaimedMilestone struct) throws TException {
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
                            struct.claimed_date = iprot.readI32();
                            struct.setClaimed_dateIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 15) {
                        TList readListBegin = iprot.readListBegin();
                        struct.awards = new ArrayList(readListBegin.size);
                        for (int i11 = 0; i11 < readListBegin.size; i11++) {
                            AwardItem awardItem = new AwardItem();
                            awardItem.read(iprot);
                            struct.awards.add(awardItem);
                        }
                        iprot.readListEnd();
                        struct.setAwardsIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 8) {
                    struct.target = iprot.readI32();
                    struct.setTargetIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (!struct.isSetTarget()) {
                throw new TProtocolException("Required field 'target' was not found in serialized data! Struct: " + toString());
            }
            if (struct.isSetClaimed_date()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'claimed_date' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, ClaimedMilestone struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(ClaimedMilestone.STRUCT_DESC);
            oprot.writeFieldBegin(ClaimedMilestone.TARGET_FIELD_DESC);
            oprot.writeI32(struct.target);
            oprot.writeFieldEnd();
            if (struct.awards != null) {
                oprot.writeFieldBegin(ClaimedMilestone.AWARDS_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 12, struct.awards.size()));
                Iterator<AwardItem> it = struct.awards.iterator();
                while (it.hasNext()) {
                    it.next().write(oprot);
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(ClaimedMilestone.CLAIMED_DATE_FIELD_DESC);
            oprot.writeI32(struct.claimed_date);
            oprot.writeFieldEnd();
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ClaimedMilestoneStandardSchemeFactory implements SchemeFactory {
        private ClaimedMilestoneStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public ClaimedMilestoneStandardScheme getScheme() {
            return new ClaimedMilestoneStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ClaimedMilestoneTupleScheme extends TupleScheme<ClaimedMilestone> {
        private ClaimedMilestoneTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, ClaimedMilestone struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.target = tTupleProtocol.readI32();
            struct.setTargetIsSet(true);
            TList tList = new TList((byte) 12, tTupleProtocol.readI32());
            struct.awards = new ArrayList(tList.size);
            for (int i11 = 0; i11 < tList.size; i11++) {
                AwardItem awardItem = new AwardItem();
                awardItem.read(tTupleProtocol);
                struct.awards.add(awardItem);
            }
            struct.setAwardsIsSet(true);
            struct.claimed_date = tTupleProtocol.readI32();
            struct.setClaimed_dateIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, ClaimedMilestone struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.target);
            tTupleProtocol.writeI32(struct.awards.size());
            Iterator<AwardItem> it = struct.awards.iterator();
            while (it.hasNext()) {
                it.next().write(tTupleProtocol);
            }
            tTupleProtocol.writeI32(struct.claimed_date);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ClaimedMilestoneTupleSchemeFactory implements SchemeFactory {
        private ClaimedMilestoneTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public ClaimedMilestoneTupleScheme getScheme() {
            return new ClaimedMilestoneTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        TARGET(1, TypedValues.AttributesType.S_TARGET),
        AWARDS(2, "awards"),
        CLAIMED_DATE(3, "claimed_date");

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
                return TARGET;
            }
            if (fieldId == 2) {
                return AWARDS;
            }
            if (fieldId != 3) {
                return null;
            }
            return CLAIMED_DATE;
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
        hashMap.put(StandardScheme.class, new ClaimedMilestoneStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new ClaimedMilestoneTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.TARGET, (_Fields) new FieldMetaData(TypedValues.AttributesType.S_TARGET, (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.AWARDS, (_Fields) new FieldMetaData("awards", (byte) 1, new ListMetaData((byte) 15, new StructMetaData((byte) 12, AwardItem.class))));
        enumMap.put((EnumMap) _Fields.CLAIMED_DATE, (_Fields) new FieldMetaData("claimed_date", (byte) 1, new FieldValueMetaData((byte) 8)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(ClaimedMilestone.class, unmodifiableMap);
    }

    public ClaimedMilestone() {
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

    public void addToAwards(AwardItem elem) {
        if (this.awards == null) {
            this.awards = new ArrayList();
        }
        this.awards.add(elem);
    }

    @Override // org.apache.thrift.TBase
    public void clear() {
        setTargetIsSet(false);
        this.target = 0;
        this.awards = null;
        setClaimed_dateIsSet(false);
        this.claimed_date = 0;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof ClaimedMilestone)) {
            return equals((ClaimedMilestone) that);
        }
        return false;
    }

    public List<AwardItem> getAwards() {
        return this.awards;
    }

    public Iterator<AwardItem> getAwardsIterator() {
        List<AwardItem> list = this.awards;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getAwardsSize() {
        List<AwardItem> list = this.awards;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public int getClaimed_date() {
        return this.claimed_date;
    }

    public int getTarget() {
        return this.target;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetAwards() {
        return this.awards != null;
    }

    public boolean isSetClaimed_date() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetTarget() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public ClaimedMilestone setAwards(List<AwardItem> awards) {
        this.awards = awards;
        return this;
    }

    public void setAwardsIsSet(boolean value) {
        if (value) {
            return;
        }
        this.awards = null;
    }

    public ClaimedMilestone setClaimed_date(int claimed_date) {
        this.claimed_date = claimed_date;
        setClaimed_dateIsSet(true);
        return this;
    }

    public void setClaimed_dateIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public ClaimedMilestone setTarget(int target) {
        this.target = target;
        setTargetIsSet(true);
        return this;
    }

    public void setTargetIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ClaimedMilestone(");
        sb2.append("target:");
        sb2.append(this.target);
        sb2.append(j2.O);
        sb2.append("awards:");
        List<AwardItem> list = this.awards;
        if (list == null) {
            sb2.append("null");
        } else {
            sb2.append(list);
        }
        sb2.append(j2.O);
        sb2.append("claimed_date:");
        sb2.append(this.claimed_date);
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetAwards() {
        this.awards = null;
    }

    public void unsetClaimed_date() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetTarget() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void validate() throws TException {
        if (this.awards != null) {
            return;
        }
        throw new TProtocolException("Required field 'awards' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(ClaimedMilestone other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo4 = Boolean.valueOf(isSetTarget()).compareTo(Boolean.valueOf(other.isSetTarget()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (isSetTarget() && (compareTo3 = TBaseHelper.compareTo(this.target, other.target)) != 0) {
            return compareTo3;
        }
        int compareTo5 = Boolean.valueOf(isSetAwards()).compareTo(Boolean.valueOf(other.isSetAwards()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (isSetAwards() && (compareTo2 = TBaseHelper.compareTo((List) this.awards, (List) other.awards)) != 0) {
            return compareTo2;
        }
        int compareTo6 = Boolean.valueOf(isSetClaimed_date()).compareTo(Boolean.valueOf(other.isSetClaimed_date()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (!isSetClaimed_date() || (compareTo = TBaseHelper.compareTo(this.claimed_date, other.claimed_date)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<ClaimedMilestone, _Fields> deepCopy2() {
        return new ClaimedMilestone(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$ClaimedMilestone$_Fields[field.ordinal()];
        if (i11 == 1) {
            return Integer.valueOf(getTarget());
        }
        if (i11 == 2) {
            return getAwards();
        }
        if (i11 == 3) {
            return Integer.valueOf(getClaimed_date());
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$ClaimedMilestone$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetTarget();
        }
        if (i11 == 2) {
            return isSetAwards();
        }
        if (i11 == 3) {
            return isSetClaimed_date();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$ClaimedMilestone$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetTarget();
                return;
            } else {
                setTarget(((Integer) value).intValue());
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetAwards();
                return;
            } else {
                setAwards((List) value);
                return;
            }
        }
        if (i11 != 3) {
            return;
        }
        if (value == null) {
            unsetClaimed_date();
        } else {
            setClaimed_date(((Integer) value).intValue());
        }
    }

    public ClaimedMilestone(int target, List<AwardItem> awards, int claimed_date) {
        this();
        this.target = target;
        setTargetIsSet(true);
        this.awards = awards;
        this.claimed_date = claimed_date;
        setClaimed_dateIsSet(true);
    }

    public boolean equals(ClaimedMilestone that) {
        if (that == null || this.target != that.target) {
            return false;
        }
        boolean isSetAwards = isSetAwards();
        boolean isSetAwards2 = that.isSetAwards();
        return (!(isSetAwards || isSetAwards2) || (isSetAwards && isSetAwards2 && this.awards.equals(that.awards))) && this.claimed_date == that.claimed_date;
    }

    public ClaimedMilestone(ClaimedMilestone other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        this.target = other.target;
        if (other.isSetAwards()) {
            ArrayList arrayList = new ArrayList(other.awards.size());
            Iterator<AwardItem> it = other.awards.iterator();
            while (it.hasNext()) {
                arrayList.add(new AwardItem(it.next()));
            }
            this.awards = arrayList;
        }
        this.claimed_date = other.claimed_date;
    }
}

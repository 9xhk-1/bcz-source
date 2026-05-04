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
public class ComboReq implements TBase<ComboReq, _Fields>, Serializable, Cloneable, Comparable<ComboReq> {
    private static final int __COMBO_ISSET_ID = 0;
    private static final int __RESETAT_ISSET_ID = 1;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public List<ClaimedMilestone> claimed;
    public int combo;
    public List<PropsItem> consumed;
    private _Fields[] optionals;
    public long resetAt;
    private static final TStruct STRUCT_DESC = new TStruct("ComboReq");
    private static final TField COMBO_FIELD_DESC = new TField("combo", (byte) 8, 1);
    private static final TField RESET_AT_FIELD_DESC = new TField("resetAt", (byte) 10, 2);
    private static final TField CONSUMED_FIELD_DESC = new TField("consumed", (byte) 15, 3);
    private static final TField CLAIMED_FIELD_DESC = new TField("claimed", (byte) 15, 4);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.game_api.ComboReq$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$game_api$ComboReq$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$game_api$ComboReq$_Fields = iArr;
            try {
                iArr[_Fields.COMBO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$ComboReq$_Fields[_Fields.RESET_AT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$ComboReq$_Fields[_Fields.CONSUMED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$ComboReq$_Fields[_Fields.CLAIMED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ComboReqStandardScheme extends StandardScheme<ComboReq> {
        private ComboReqStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, ComboReq struct) throws TException {
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
                        int i11 = 0;
                        if (s11 != 3) {
                            if (s11 != 4) {
                                TProtocolUtil.skip(iprot, b11);
                            } else if (b11 == 15) {
                                TList readListBegin = iprot.readListBegin();
                                struct.claimed = new ArrayList(readListBegin.size);
                                while (i11 < readListBegin.size) {
                                    ClaimedMilestone claimedMilestone = new ClaimedMilestone();
                                    claimedMilestone.read(iprot);
                                    struct.claimed.add(claimedMilestone);
                                    i11++;
                                }
                                iprot.readListEnd();
                                struct.setClaimedIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 15) {
                            TList readListBegin2 = iprot.readListBegin();
                            struct.consumed = new ArrayList(readListBegin2.size);
                            while (i11 < readListBegin2.size) {
                                PropsItem propsItem = new PropsItem();
                                propsItem.read(iprot);
                                struct.consumed.add(propsItem);
                                i11++;
                            }
                            iprot.readListEnd();
                            struct.setConsumedIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 10) {
                        struct.resetAt = iprot.readI64();
                        struct.setResetAtIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 8) {
                    struct.combo = iprot.readI32();
                    struct.setComboIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (!struct.isSetCombo()) {
                throw new TProtocolException("Required field 'combo' was not found in serialized data! Struct: " + toString());
            }
            if (struct.isSetResetAt()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'resetAt' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, ComboReq struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(ComboReq.STRUCT_DESC);
            oprot.writeFieldBegin(ComboReq.COMBO_FIELD_DESC);
            oprot.writeI32(struct.combo);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(ComboReq.RESET_AT_FIELD_DESC);
            oprot.writeI64(struct.resetAt);
            oprot.writeFieldEnd();
            if (struct.consumed != null && struct.isSetConsumed()) {
                oprot.writeFieldBegin(ComboReq.CONSUMED_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 12, struct.consumed.size()));
                Iterator<PropsItem> it = struct.consumed.iterator();
                while (it.hasNext()) {
                    it.next().write(oprot);
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            if (struct.claimed != null && struct.isSetClaimed()) {
                oprot.writeFieldBegin(ComboReq.CLAIMED_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 12, struct.claimed.size()));
                Iterator<ClaimedMilestone> it2 = struct.claimed.iterator();
                while (it2.hasNext()) {
                    it2.next().write(oprot);
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ComboReqStandardSchemeFactory implements SchemeFactory {
        private ComboReqStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public ComboReqStandardScheme getScheme() {
            return new ComboReqStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ComboReqTupleScheme extends TupleScheme<ComboReq> {
        private ComboReqTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, ComboReq struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.combo = tTupleProtocol.readI32();
            struct.setComboIsSet(true);
            struct.resetAt = tTupleProtocol.readI64();
            struct.setResetAtIsSet(true);
            BitSet readBitSet = tTupleProtocol.readBitSet(2);
            if (readBitSet.get(0)) {
                TList tList = new TList((byte) 12, tTupleProtocol.readI32());
                struct.consumed = new ArrayList(tList.size);
                for (int i11 = 0; i11 < tList.size; i11++) {
                    PropsItem propsItem = new PropsItem();
                    propsItem.read(tTupleProtocol);
                    struct.consumed.add(propsItem);
                }
                struct.setConsumedIsSet(true);
            }
            if (readBitSet.get(1)) {
                TList tList2 = new TList((byte) 12, tTupleProtocol.readI32());
                struct.claimed = new ArrayList(tList2.size);
                for (int i12 = 0; i12 < tList2.size; i12++) {
                    ClaimedMilestone claimedMilestone = new ClaimedMilestone();
                    claimedMilestone.read(tTupleProtocol);
                    struct.claimed.add(claimedMilestone);
                }
                struct.setClaimedIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, ComboReq struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.combo);
            tTupleProtocol.writeI64(struct.resetAt);
            BitSet bitSet = new BitSet();
            if (struct.isSetConsumed()) {
                bitSet.set(0);
            }
            if (struct.isSetClaimed()) {
                bitSet.set(1);
            }
            tTupleProtocol.writeBitSet(bitSet, 2);
            if (struct.isSetConsumed()) {
                tTupleProtocol.writeI32(struct.consumed.size());
                Iterator<PropsItem> it = struct.consumed.iterator();
                while (it.hasNext()) {
                    it.next().write(tTupleProtocol);
                }
            }
            if (struct.isSetClaimed()) {
                tTupleProtocol.writeI32(struct.claimed.size());
                Iterator<ClaimedMilestone> it2 = struct.claimed.iterator();
                while (it2.hasNext()) {
                    it2.next().write(tTupleProtocol);
                }
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ComboReqTupleSchemeFactory implements SchemeFactory {
        private ComboReqTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public ComboReqTupleScheme getScheme() {
            return new ComboReqTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        COMBO(1, "combo"),
        RESET_AT(2, "resetAt"),
        CONSUMED(3, "consumed"),
        CLAIMED(4, "claimed");

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
                return COMBO;
            }
            if (fieldId == 2) {
                return RESET_AT;
            }
            if (fieldId == 3) {
                return CONSUMED;
            }
            if (fieldId != 4) {
                return null;
            }
            return CLAIMED;
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
        hashMap.put(StandardScheme.class, new ComboReqStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new ComboReqTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.COMBO, (_Fields) new FieldMetaData("combo", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.RESET_AT, (_Fields) new FieldMetaData("resetAt", (byte) 1, new FieldValueMetaData((byte) 10)));
        enumMap.put((EnumMap) _Fields.CONSUMED, (_Fields) new FieldMetaData("consumed", (byte) 2, new ListMetaData((byte) 15, new StructMetaData((byte) 12, PropsItem.class))));
        enumMap.put((EnumMap) _Fields.CLAIMED, (_Fields) new FieldMetaData("claimed", (byte) 2, new ListMetaData((byte) 15, new StructMetaData((byte) 12, ClaimedMilestone.class))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(ComboReq.class, unmodifiableMap);
    }

    public ComboReq() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.CONSUMED, _Fields.CLAIMED};
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

    public void addToClaimed(ClaimedMilestone elem) {
        if (this.claimed == null) {
            this.claimed = new ArrayList();
        }
        this.claimed.add(elem);
    }

    public void addToConsumed(PropsItem elem) {
        if (this.consumed == null) {
            this.consumed = new ArrayList();
        }
        this.consumed.add(elem);
    }

    @Override // org.apache.thrift.TBase
    public void clear() {
        setComboIsSet(false);
        this.combo = 0;
        setResetAtIsSet(false);
        this.resetAt = 0L;
        this.consumed = null;
        this.claimed = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof ComboReq)) {
            return equals((ComboReq) that);
        }
        return false;
    }

    public List<ClaimedMilestone> getClaimed() {
        return this.claimed;
    }

    public Iterator<ClaimedMilestone> getClaimedIterator() {
        List<ClaimedMilestone> list = this.claimed;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getClaimedSize() {
        List<ClaimedMilestone> list = this.claimed;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public int getCombo() {
        return this.combo;
    }

    public List<PropsItem> getConsumed() {
        return this.consumed;
    }

    public Iterator<PropsItem> getConsumedIterator() {
        List<PropsItem> list = this.consumed;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getConsumedSize() {
        List<PropsItem> list = this.consumed;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public long getResetAt() {
        return this.resetAt;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetClaimed() {
        return this.claimed != null;
    }

    public boolean isSetCombo() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetConsumed() {
        return this.consumed != null;
    }

    public boolean isSetResetAt() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public ComboReq setClaimed(List<ClaimedMilestone> claimed) {
        this.claimed = claimed;
        return this;
    }

    public void setClaimedIsSet(boolean value) {
        if (value) {
            return;
        }
        this.claimed = null;
    }

    public ComboReq setCombo(int combo) {
        this.combo = combo;
        setComboIsSet(true);
        return this;
    }

    public void setComboIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public ComboReq setConsumed(List<PropsItem> consumed) {
        this.consumed = consumed;
        return this;
    }

    public void setConsumedIsSet(boolean value) {
        if (value) {
            return;
        }
        this.consumed = null;
    }

    public ComboReq setResetAt(long resetAt) {
        this.resetAt = resetAt;
        setResetAtIsSet(true);
        return this;
    }

    public void setResetAtIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ComboReq(");
        sb2.append("combo:");
        sb2.append(this.combo);
        sb2.append(j2.O);
        sb2.append("resetAt:");
        sb2.append(this.resetAt);
        if (isSetConsumed()) {
            sb2.append(j2.O);
            sb2.append("consumed:");
            List<PropsItem> list = this.consumed;
            if (list == null) {
                sb2.append("null");
            } else {
                sb2.append(list);
            }
        }
        if (isSetClaimed()) {
            sb2.append(j2.O);
            sb2.append("claimed:");
            List<ClaimedMilestone> list2 = this.claimed;
            if (list2 == null) {
                sb2.append("null");
            } else {
                sb2.append(list2);
            }
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetClaimed() {
        this.claimed = null;
    }

    public void unsetCombo() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetConsumed() {
        this.consumed = null;
    }

    public void unsetResetAt() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(ComboReq other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo5 = Boolean.valueOf(isSetCombo()).compareTo(Boolean.valueOf(other.isSetCombo()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (isSetCombo() && (compareTo4 = TBaseHelper.compareTo(this.combo, other.combo)) != 0) {
            return compareTo4;
        }
        int compareTo6 = Boolean.valueOf(isSetResetAt()).compareTo(Boolean.valueOf(other.isSetResetAt()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (isSetResetAt() && (compareTo3 = TBaseHelper.compareTo(this.resetAt, other.resetAt)) != 0) {
            return compareTo3;
        }
        int compareTo7 = Boolean.valueOf(isSetConsumed()).compareTo(Boolean.valueOf(other.isSetConsumed()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (isSetConsumed() && (compareTo2 = TBaseHelper.compareTo((List) this.consumed, (List) other.consumed)) != 0) {
            return compareTo2;
        }
        int compareTo8 = Boolean.valueOf(isSetClaimed()).compareTo(Boolean.valueOf(other.isSetClaimed()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (!isSetClaimed() || (compareTo = TBaseHelper.compareTo((List) this.claimed, (List) other.claimed)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<ComboReq, _Fields> deepCopy2() {
        return new ComboReq(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$ComboReq$_Fields[field.ordinal()];
        if (i11 == 1) {
            return Integer.valueOf(getCombo());
        }
        if (i11 == 2) {
            return Long.valueOf(getResetAt());
        }
        if (i11 == 3) {
            return getConsumed();
        }
        if (i11 == 4) {
            return getClaimed();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$ComboReq$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetCombo();
        }
        if (i11 == 2) {
            return isSetResetAt();
        }
        if (i11 == 3) {
            return isSetConsumed();
        }
        if (i11 == 4) {
            return isSetClaimed();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$ComboReq$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetCombo();
                return;
            } else {
                setCombo(((Integer) value).intValue());
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetResetAt();
                return;
            } else {
                setResetAt(((Long) value).longValue());
                return;
            }
        }
        if (i11 == 3) {
            if (value == null) {
                unsetConsumed();
                return;
            } else {
                setConsumed((List) value);
                return;
            }
        }
        if (i11 != 4) {
            return;
        }
        if (value == null) {
            unsetClaimed();
        } else {
            setClaimed((List) value);
        }
    }

    public boolean equals(ComboReq that) {
        if (that == null || this.combo != that.combo || this.resetAt != that.resetAt) {
            return false;
        }
        boolean isSetConsumed = isSetConsumed();
        boolean isSetConsumed2 = that.isSetConsumed();
        if ((isSetConsumed || isSetConsumed2) && !(isSetConsumed && isSetConsumed2 && this.consumed.equals(that.consumed))) {
            return false;
        }
        boolean isSetClaimed = isSetClaimed();
        boolean isSetClaimed2 = that.isSetClaimed();
        if (isSetClaimed || isSetClaimed2) {
            return isSetClaimed && isSetClaimed2 && this.claimed.equals(that.claimed);
        }
        return true;
    }

    public ComboReq(int combo, long resetAt) {
        this();
        this.combo = combo;
        setComboIsSet(true);
        this.resetAt = resetAt;
        setResetAtIsSet(true);
    }

    public ComboReq(ComboReq other) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.CONSUMED, _Fields.CLAIMED};
        this.__isset_bitfield = other.__isset_bitfield;
        this.combo = other.combo;
        this.resetAt = other.resetAt;
        if (other.isSetConsumed()) {
            ArrayList arrayList = new ArrayList(other.consumed.size());
            Iterator<PropsItem> it = other.consumed.iterator();
            while (it.hasNext()) {
                arrayList.add(new PropsItem(it.next()));
            }
            this.consumed = arrayList;
        }
        if (other.isSetClaimed()) {
            ArrayList arrayList2 = new ArrayList(other.claimed.size());
            Iterator<ClaimedMilestone> it2 = other.claimed.iterator();
            while (it2.hasNext()) {
                arrayList2.add(new ClaimedMilestone(it2.next()));
            }
            this.claimed = arrayList2;
        }
    }

    public void validate() throws TException {
    }
}

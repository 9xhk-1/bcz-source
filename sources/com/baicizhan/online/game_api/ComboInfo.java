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
public class ComboInfo implements TBase<ComboInfo, _Fields>, Serializable, Cloneable, Comparable<ComboInfo> {
    private static final int __CURRENT_COMBO_ISSET_ID = 0;
    private static final int __MAX_COMBO_ISSET_ID = 2;
    private static final int __UPDATEAT_ISSET_ID = 1;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public int current_combo;
    public int max_combo;
    private _Fields[] optionals;
    public List<PropsItem> props;
    public long updateAt;
    private static final TStruct STRUCT_DESC = new TStruct("ComboInfo");
    private static final TField CURRENT_COMBO_FIELD_DESC = new TField("current_combo", (byte) 8, 1);
    private static final TField UPDATE_AT_FIELD_DESC = new TField("updateAt", (byte) 10, 2);
    private static final TField PROPS_FIELD_DESC = new TField("props", (byte) 15, 3);
    private static final TField MAX_COMBO_FIELD_DESC = new TField("max_combo", (byte) 8, 4);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.game_api.ComboInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$game_api$ComboInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$game_api$ComboInfo$_Fields = iArr;
            try {
                iArr[_Fields.CURRENT_COMBO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$ComboInfo$_Fields[_Fields.UPDATE_AT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$ComboInfo$_Fields[_Fields.PROPS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$ComboInfo$_Fields[_Fields.MAX_COMBO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ComboInfoStandardScheme extends StandardScheme<ComboInfo> {
        private ComboInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, ComboInfo struct) throws TException {
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
                            } else if (b11 == 8) {
                                struct.max_combo = iprot.readI32();
                                struct.setMax_comboIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 15) {
                            TList readListBegin = iprot.readListBegin();
                            struct.props = new ArrayList(readListBegin.size);
                            for (int i11 = 0; i11 < readListBegin.size; i11++) {
                                PropsItem propsItem = new PropsItem();
                                propsItem.read(iprot);
                                struct.props.add(propsItem);
                            }
                            iprot.readListEnd();
                            struct.setPropsIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 10) {
                        struct.updateAt = iprot.readI64();
                        struct.setUpdateAtIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 8) {
                    struct.current_combo = iprot.readI32();
                    struct.setCurrent_comboIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (!struct.isSetCurrent_combo()) {
                throw new TProtocolException("Required field 'current_combo' was not found in serialized data! Struct: " + toString());
            }
            if (struct.isSetUpdateAt()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'updateAt' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, ComboInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(ComboInfo.STRUCT_DESC);
            oprot.writeFieldBegin(ComboInfo.CURRENT_COMBO_FIELD_DESC);
            oprot.writeI32(struct.current_combo);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(ComboInfo.UPDATE_AT_FIELD_DESC);
            oprot.writeI64(struct.updateAt);
            oprot.writeFieldEnd();
            if (struct.props != null && struct.isSetProps()) {
                oprot.writeFieldBegin(ComboInfo.PROPS_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 12, struct.props.size()));
                Iterator<PropsItem> it = struct.props.iterator();
                while (it.hasNext()) {
                    it.next().write(oprot);
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            if (struct.isSetMax_combo()) {
                oprot.writeFieldBegin(ComboInfo.MAX_COMBO_FIELD_DESC);
                oprot.writeI32(struct.max_combo);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ComboInfoStandardSchemeFactory implements SchemeFactory {
        private ComboInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public ComboInfoStandardScheme getScheme() {
            return new ComboInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ComboInfoTupleScheme extends TupleScheme<ComboInfo> {
        private ComboInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, ComboInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.current_combo = tTupleProtocol.readI32();
            struct.setCurrent_comboIsSet(true);
            struct.updateAt = tTupleProtocol.readI64();
            struct.setUpdateAtIsSet(true);
            BitSet readBitSet = tTupleProtocol.readBitSet(2);
            if (readBitSet.get(0)) {
                TList tList = new TList((byte) 12, tTupleProtocol.readI32());
                struct.props = new ArrayList(tList.size);
                for (int i11 = 0; i11 < tList.size; i11++) {
                    PropsItem propsItem = new PropsItem();
                    propsItem.read(tTupleProtocol);
                    struct.props.add(propsItem);
                }
                struct.setPropsIsSet(true);
            }
            if (readBitSet.get(1)) {
                struct.max_combo = tTupleProtocol.readI32();
                struct.setMax_comboIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, ComboInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.current_combo);
            tTupleProtocol.writeI64(struct.updateAt);
            BitSet bitSet = new BitSet();
            if (struct.isSetProps()) {
                bitSet.set(0);
            }
            if (struct.isSetMax_combo()) {
                bitSet.set(1);
            }
            tTupleProtocol.writeBitSet(bitSet, 2);
            if (struct.isSetProps()) {
                tTupleProtocol.writeI32(struct.props.size());
                Iterator<PropsItem> it = struct.props.iterator();
                while (it.hasNext()) {
                    it.next().write(tTupleProtocol);
                }
            }
            if (struct.isSetMax_combo()) {
                tTupleProtocol.writeI32(struct.max_combo);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ComboInfoTupleSchemeFactory implements SchemeFactory {
        private ComboInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public ComboInfoTupleScheme getScheme() {
            return new ComboInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        CURRENT_COMBO(1, "current_combo"),
        UPDATE_AT(2, "updateAt"),
        PROPS(3, "props"),
        MAX_COMBO(4, "max_combo");

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
                return CURRENT_COMBO;
            }
            if (fieldId == 2) {
                return UPDATE_AT;
            }
            if (fieldId == 3) {
                return PROPS;
            }
            if (fieldId != 4) {
                return null;
            }
            return MAX_COMBO;
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
        hashMap.put(StandardScheme.class, new ComboInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new ComboInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.CURRENT_COMBO, (_Fields) new FieldMetaData("current_combo", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.UPDATE_AT, (_Fields) new FieldMetaData("updateAt", (byte) 1, new FieldValueMetaData((byte) 10)));
        enumMap.put((EnumMap) _Fields.PROPS, (_Fields) new FieldMetaData("props", (byte) 2, new ListMetaData((byte) 15, new StructMetaData((byte) 12, PropsItem.class))));
        enumMap.put((EnumMap) _Fields.MAX_COMBO, (_Fields) new FieldMetaData("max_combo", (byte) 2, new FieldValueMetaData((byte) 8)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(ComboInfo.class, unmodifiableMap);
    }

    public ComboInfo() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.PROPS, _Fields.MAX_COMBO};
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

    public void addToProps(PropsItem elem) {
        if (this.props == null) {
            this.props = new ArrayList();
        }
        this.props.add(elem);
    }

    @Override // org.apache.thrift.TBase
    public void clear() {
        setCurrent_comboIsSet(false);
        this.current_combo = 0;
        setUpdateAtIsSet(false);
        this.updateAt = 0L;
        this.props = null;
        setMax_comboIsSet(false);
        this.max_combo = 0;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof ComboInfo)) {
            return equals((ComboInfo) that);
        }
        return false;
    }

    public int getCurrent_combo() {
        return this.current_combo;
    }

    public int getMax_combo() {
        return this.max_combo;
    }

    public List<PropsItem> getProps() {
        return this.props;
    }

    public Iterator<PropsItem> getPropsIterator() {
        List<PropsItem> list = this.props;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getPropsSize() {
        List<PropsItem> list = this.props;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public long getUpdateAt() {
        return this.updateAt;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetCurrent_combo() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetMax_combo() {
        return EncodingUtils.testBit(this.__isset_bitfield, 2);
    }

    public boolean isSetProps() {
        return this.props != null;
    }

    public boolean isSetUpdateAt() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public ComboInfo setCurrent_combo(int current_combo) {
        this.current_combo = current_combo;
        setCurrent_comboIsSet(true);
        return this;
    }

    public void setCurrent_comboIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public ComboInfo setMax_combo(int max_combo) {
        this.max_combo = max_combo;
        setMax_comboIsSet(true);
        return this;
    }

    public void setMax_comboIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 2, value);
    }

    public ComboInfo setProps(List<PropsItem> props) {
        this.props = props;
        return this;
    }

    public void setPropsIsSet(boolean value) {
        if (value) {
            return;
        }
        this.props = null;
    }

    public ComboInfo setUpdateAt(long updateAt) {
        this.updateAt = updateAt;
        setUpdateAtIsSet(true);
        return this;
    }

    public void setUpdateAtIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ComboInfo(");
        sb2.append("current_combo:");
        sb2.append(this.current_combo);
        sb2.append(j2.O);
        sb2.append("updateAt:");
        sb2.append(this.updateAt);
        if (isSetProps()) {
            sb2.append(j2.O);
            sb2.append("props:");
            List<PropsItem> list = this.props;
            if (list == null) {
                sb2.append("null");
            } else {
                sb2.append(list);
            }
        }
        if (isSetMax_combo()) {
            sb2.append(j2.O);
            sb2.append("max_combo:");
            sb2.append(this.max_combo);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetCurrent_combo() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetMax_combo() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 2);
    }

    public void unsetProps() {
        this.props = null;
    }

    public void unsetUpdateAt() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(ComboInfo other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo5 = Boolean.valueOf(isSetCurrent_combo()).compareTo(Boolean.valueOf(other.isSetCurrent_combo()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (isSetCurrent_combo() && (compareTo4 = TBaseHelper.compareTo(this.current_combo, other.current_combo)) != 0) {
            return compareTo4;
        }
        int compareTo6 = Boolean.valueOf(isSetUpdateAt()).compareTo(Boolean.valueOf(other.isSetUpdateAt()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (isSetUpdateAt() && (compareTo3 = TBaseHelper.compareTo(this.updateAt, other.updateAt)) != 0) {
            return compareTo3;
        }
        int compareTo7 = Boolean.valueOf(isSetProps()).compareTo(Boolean.valueOf(other.isSetProps()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (isSetProps() && (compareTo2 = TBaseHelper.compareTo((List) this.props, (List) other.props)) != 0) {
            return compareTo2;
        }
        int compareTo8 = Boolean.valueOf(isSetMax_combo()).compareTo(Boolean.valueOf(other.isSetMax_combo()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (!isSetMax_combo() || (compareTo = TBaseHelper.compareTo(this.max_combo, other.max_combo)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<ComboInfo, _Fields> deepCopy2() {
        return new ComboInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$ComboInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return Integer.valueOf(getCurrent_combo());
        }
        if (i11 == 2) {
            return Long.valueOf(getUpdateAt());
        }
        if (i11 == 3) {
            return getProps();
        }
        if (i11 == 4) {
            return Integer.valueOf(getMax_combo());
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$ComboInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetCurrent_combo();
        }
        if (i11 == 2) {
            return isSetUpdateAt();
        }
        if (i11 == 3) {
            return isSetProps();
        }
        if (i11 == 4) {
            return isSetMax_combo();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$ComboInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetCurrent_combo();
                return;
            } else {
                setCurrent_combo(((Integer) value).intValue());
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetUpdateAt();
                return;
            } else {
                setUpdateAt(((Long) value).longValue());
                return;
            }
        }
        if (i11 == 3) {
            if (value == null) {
                unsetProps();
                return;
            } else {
                setProps((List) value);
                return;
            }
        }
        if (i11 != 4) {
            return;
        }
        if (value == null) {
            unsetMax_combo();
        } else {
            setMax_combo(((Integer) value).intValue());
        }
    }

    public boolean equals(ComboInfo that) {
        if (that == null || this.current_combo != that.current_combo || this.updateAt != that.updateAt) {
            return false;
        }
        boolean isSetProps = isSetProps();
        boolean isSetProps2 = that.isSetProps();
        if ((isSetProps || isSetProps2) && !(isSetProps && isSetProps2 && this.props.equals(that.props))) {
            return false;
        }
        boolean isSetMax_combo = isSetMax_combo();
        boolean isSetMax_combo2 = that.isSetMax_combo();
        if (isSetMax_combo || isSetMax_combo2) {
            return isSetMax_combo && isSetMax_combo2 && this.max_combo == that.max_combo;
        }
        return true;
    }

    public ComboInfo(int current_combo, long updateAt) {
        this();
        this.current_combo = current_combo;
        setCurrent_comboIsSet(true);
        this.updateAt = updateAt;
        setUpdateAtIsSet(true);
    }

    public ComboInfo(ComboInfo other) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.PROPS, _Fields.MAX_COMBO};
        this.__isset_bitfield = other.__isset_bitfield;
        this.current_combo = other.current_combo;
        this.updateAt = other.updateAt;
        if (other.isSetProps()) {
            ArrayList arrayList = new ArrayList(other.props.size());
            Iterator<PropsItem> it = other.props.iterator();
            while (it.hasNext()) {
                arrayList.add(new PropsItem(it.next()));
            }
            this.props = arrayList;
        }
        this.max_combo = other.max_combo;
    }

    public void validate() throws TException {
    }
}

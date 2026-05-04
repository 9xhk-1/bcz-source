package com.baicizhan.online.bcz_system_api;

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
import org.apache.thrift.meta_data.MapMetaData;
import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.protocol.TField;
import org.apache.thrift.protocol.TList;
import org.apache.thrift.protocol.TMap;
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
public class GuideForNewStrategy implements TBase<GuideForNewStrategy, _Fields>, Serializable, Cloneable, Comparable<GuideForNewStrategy> {
    private static final int __ROLE_STRATEGY_ISSET_ID = 1;
    private static final int __USER_GROUP_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public List<Integer> actionSequence;
    public Map<Integer, String> action_urls;
    private _Fields[] optionals;
    public int role_strategy;
    public int user_group;
    private static final TStruct STRUCT_DESC = new TStruct("GuideForNewStrategy");
    private static final TField USER_GROUP_FIELD_DESC = new TField("user_group", (byte) 8, 1);
    private static final TField ACTION_SEQUENCE_FIELD_DESC = new TField("actionSequence", (byte) 15, 2);
    private static final TField ROLE_STRATEGY_FIELD_DESC = new TField("role_strategy", (byte) 8, 3);
    private static final TField ACTION_URLS_FIELD_DESC = new TField("action_urls", (byte) 13, 4);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.bcz_system_api.GuideForNewStrategy$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bcz_system_api$GuideForNewStrategy$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$bcz_system_api$GuideForNewStrategy$_Fields = iArr;
            try {
                iArr[_Fields.USER_GROUP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bcz_system_api$GuideForNewStrategy$_Fields[_Fields.ACTION_SEQUENCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bcz_system_api$GuideForNewStrategy$_Fields[_Fields.ROLE_STRATEGY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bcz_system_api$GuideForNewStrategy$_Fields[_Fields.ACTION_URLS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class GuideForNewStrategyStandardScheme extends StandardScheme<GuideForNewStrategy> {
        private GuideForNewStrategyStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, GuideForNewStrategy struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    break;
                }
                short s11 = readFieldBegin.f77768id;
                if (s11 != 1) {
                    int i11 = 0;
                    if (s11 != 2) {
                        if (s11 != 3) {
                            if (s11 != 4) {
                                TProtocolUtil.skip(iprot, b11);
                            } else if (b11 == 13) {
                                TMap readMapBegin = iprot.readMapBegin();
                                struct.action_urls = new HashMap(readMapBegin.size * 2);
                                while (i11 < readMapBegin.size) {
                                    struct.action_urls.put(Integer.valueOf(iprot.readI32()), iprot.readString());
                                    i11++;
                                }
                                iprot.readMapEnd();
                                struct.setAction_urlsIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 8) {
                            struct.role_strategy = iprot.readI32();
                            struct.setRole_strategyIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 15) {
                        TList readListBegin = iprot.readListBegin();
                        struct.actionSequence = new ArrayList(readListBegin.size);
                        while (i11 < readListBegin.size) {
                            struct.actionSequence.add(Integer.valueOf(iprot.readI32()));
                            i11++;
                        }
                        iprot.readListEnd();
                        struct.setActionSequenceIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 8) {
                    struct.user_group = iprot.readI32();
                    struct.setUser_groupIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (struct.isSetUser_group()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'user_group' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, GuideForNewStrategy struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(GuideForNewStrategy.STRUCT_DESC);
            oprot.writeFieldBegin(GuideForNewStrategy.USER_GROUP_FIELD_DESC);
            oprot.writeI32(struct.user_group);
            oprot.writeFieldEnd();
            if (struct.actionSequence != null) {
                oprot.writeFieldBegin(GuideForNewStrategy.ACTION_SEQUENCE_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 8, struct.actionSequence.size()));
                Iterator<Integer> it = struct.actionSequence.iterator();
                while (it.hasNext()) {
                    oprot.writeI32(it.next().intValue());
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            if (struct.isSetRole_strategy()) {
                oprot.writeFieldBegin(GuideForNewStrategy.ROLE_STRATEGY_FIELD_DESC);
                oprot.writeI32(struct.role_strategy);
                oprot.writeFieldEnd();
            }
            if (struct.action_urls != null && struct.isSetAction_urls()) {
                oprot.writeFieldBegin(GuideForNewStrategy.ACTION_URLS_FIELD_DESC);
                oprot.writeMapBegin(new TMap((byte) 8, (byte) 11, struct.action_urls.size()));
                for (Map.Entry<Integer, String> entry : struct.action_urls.entrySet()) {
                    oprot.writeI32(entry.getKey().intValue());
                    oprot.writeString(entry.getValue());
                }
                oprot.writeMapEnd();
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class GuideForNewStrategyStandardSchemeFactory implements SchemeFactory {
        private GuideForNewStrategyStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public GuideForNewStrategyStandardScheme getScheme() {
            return new GuideForNewStrategyStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class GuideForNewStrategyTupleScheme extends TupleScheme<GuideForNewStrategy> {
        private GuideForNewStrategyTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, GuideForNewStrategy struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.user_group = tTupleProtocol.readI32();
            struct.setUser_groupIsSet(true);
            TList tList = new TList((byte) 8, tTupleProtocol.readI32());
            struct.actionSequence = new ArrayList(tList.size);
            for (int i11 = 0; i11 < tList.size; i11++) {
                struct.actionSequence.add(Integer.valueOf(tTupleProtocol.readI32()));
            }
            struct.setActionSequenceIsSet(true);
            BitSet readBitSet = tTupleProtocol.readBitSet(2);
            if (readBitSet.get(0)) {
                struct.role_strategy = tTupleProtocol.readI32();
                struct.setRole_strategyIsSet(true);
            }
            if (readBitSet.get(1)) {
                TMap tMap = new TMap((byte) 8, (byte) 11, tTupleProtocol.readI32());
                struct.action_urls = new HashMap(tMap.size * 2);
                for (int i12 = 0; i12 < tMap.size; i12++) {
                    struct.action_urls.put(Integer.valueOf(tTupleProtocol.readI32()), tTupleProtocol.readString());
                }
                struct.setAction_urlsIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, GuideForNewStrategy struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.user_group);
            tTupleProtocol.writeI32(struct.actionSequence.size());
            Iterator<Integer> it = struct.actionSequence.iterator();
            while (it.hasNext()) {
                tTupleProtocol.writeI32(it.next().intValue());
            }
            BitSet bitSet = new BitSet();
            if (struct.isSetRole_strategy()) {
                bitSet.set(0);
            }
            if (struct.isSetAction_urls()) {
                bitSet.set(1);
            }
            tTupleProtocol.writeBitSet(bitSet, 2);
            if (struct.isSetRole_strategy()) {
                tTupleProtocol.writeI32(struct.role_strategy);
            }
            if (struct.isSetAction_urls()) {
                tTupleProtocol.writeI32(struct.action_urls.size());
                for (Map.Entry<Integer, String> entry : struct.action_urls.entrySet()) {
                    tTupleProtocol.writeI32(entry.getKey().intValue());
                    tTupleProtocol.writeString(entry.getValue());
                }
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class GuideForNewStrategyTupleSchemeFactory implements SchemeFactory {
        private GuideForNewStrategyTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public GuideForNewStrategyTupleScheme getScheme() {
            return new GuideForNewStrategyTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        USER_GROUP(1, "user_group"),
        ACTION_SEQUENCE(2, "actionSequence"),
        ROLE_STRATEGY(3, "role_strategy"),
        ACTION_URLS(4, "action_urls");

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
                return USER_GROUP;
            }
            if (fieldId == 2) {
                return ACTION_SEQUENCE;
            }
            if (fieldId == 3) {
                return ROLE_STRATEGY;
            }
            if (fieldId != 4) {
                return null;
            }
            return ACTION_URLS;
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
        hashMap.put(StandardScheme.class, new GuideForNewStrategyStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new GuideForNewStrategyTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.USER_GROUP, (_Fields) new FieldMetaData("user_group", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.ACTION_SEQUENCE, (_Fields) new FieldMetaData("actionSequence", (byte) 1, new ListMetaData((byte) 15, new FieldValueMetaData((byte) 8))));
        enumMap.put((EnumMap) _Fields.ROLE_STRATEGY, (_Fields) new FieldMetaData("role_strategy", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.ACTION_URLS, (_Fields) new FieldMetaData("action_urls", (byte) 2, new MapMetaData((byte) 13, new FieldValueMetaData((byte) 8), new FieldValueMetaData((byte) 11))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(GuideForNewStrategy.class, unmodifiableMap);
    }

    public GuideForNewStrategy() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.ROLE_STRATEGY, _Fields.ACTION_URLS};
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

    public void addToActionSequence(int elem) {
        if (this.actionSequence == null) {
            this.actionSequence = new ArrayList();
        }
        this.actionSequence.add(Integer.valueOf(elem));
    }

    @Override // org.apache.thrift.TBase
    public void clear() {
        setUser_groupIsSet(false);
        this.user_group = 0;
        this.actionSequence = null;
        setRole_strategyIsSet(false);
        this.role_strategy = 0;
        this.action_urls = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof GuideForNewStrategy)) {
            return equals((GuideForNewStrategy) that);
        }
        return false;
    }

    public List<Integer> getActionSequence() {
        return this.actionSequence;
    }

    public Iterator<Integer> getActionSequenceIterator() {
        List<Integer> list = this.actionSequence;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getActionSequenceSize() {
        List<Integer> list = this.actionSequence;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public Map<Integer, String> getAction_urls() {
        return this.action_urls;
    }

    public int getAction_urlsSize() {
        Map<Integer, String> map = this.action_urls;
        if (map == null) {
            return 0;
        }
        return map.size();
    }

    public int getRole_strategy() {
        return this.role_strategy;
    }

    public int getUser_group() {
        return this.user_group;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetActionSequence() {
        return this.actionSequence != null;
    }

    public boolean isSetAction_urls() {
        return this.action_urls != null;
    }

    public boolean isSetRole_strategy() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetUser_group() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public void putToAction_urls(int key, String val) {
        if (this.action_urls == null) {
            this.action_urls = new HashMap();
        }
        this.action_urls.put(Integer.valueOf(key), val);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public GuideForNewStrategy setActionSequence(List<Integer> actionSequence) {
        this.actionSequence = actionSequence;
        return this;
    }

    public void setActionSequenceIsSet(boolean value) {
        if (value) {
            return;
        }
        this.actionSequence = null;
    }

    public GuideForNewStrategy setAction_urls(Map<Integer, String> action_urls) {
        this.action_urls = action_urls;
        return this;
    }

    public void setAction_urlsIsSet(boolean value) {
        if (value) {
            return;
        }
        this.action_urls = null;
    }

    public GuideForNewStrategy setRole_strategy(int role_strategy) {
        this.role_strategy = role_strategy;
        setRole_strategyIsSet(true);
        return this;
    }

    public void setRole_strategyIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public GuideForNewStrategy setUser_group(int user_group) {
        this.user_group = user_group;
        setUser_groupIsSet(true);
        return this;
    }

    public void setUser_groupIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("GuideForNewStrategy(");
        sb2.append("user_group:");
        sb2.append(this.user_group);
        sb2.append(j2.O);
        sb2.append("actionSequence:");
        List<Integer> list = this.actionSequence;
        if (list == null) {
            sb2.append("null");
        } else {
            sb2.append(list);
        }
        if (isSetRole_strategy()) {
            sb2.append(j2.O);
            sb2.append("role_strategy:");
            sb2.append(this.role_strategy);
        }
        if (isSetAction_urls()) {
            sb2.append(j2.O);
            sb2.append("action_urls:");
            Map<Integer, String> map = this.action_urls;
            if (map == null) {
                sb2.append("null");
            } else {
                sb2.append(map);
            }
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetActionSequence() {
        this.actionSequence = null;
    }

    public void unsetAction_urls() {
        this.action_urls = null;
    }

    public void unsetRole_strategy() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetUser_group() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void validate() throws TException {
        if (this.actionSequence != null) {
            return;
        }
        throw new TProtocolException("Required field 'actionSequence' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(GuideForNewStrategy other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo5 = Boolean.valueOf(isSetUser_group()).compareTo(Boolean.valueOf(other.isSetUser_group()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (isSetUser_group() && (compareTo4 = TBaseHelper.compareTo(this.user_group, other.user_group)) != 0) {
            return compareTo4;
        }
        int compareTo6 = Boolean.valueOf(isSetActionSequence()).compareTo(Boolean.valueOf(other.isSetActionSequence()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (isSetActionSequence() && (compareTo3 = TBaseHelper.compareTo((List) this.actionSequence, (List) other.actionSequence)) != 0) {
            return compareTo3;
        }
        int compareTo7 = Boolean.valueOf(isSetRole_strategy()).compareTo(Boolean.valueOf(other.isSetRole_strategy()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (isSetRole_strategy() && (compareTo2 = TBaseHelper.compareTo(this.role_strategy, other.role_strategy)) != 0) {
            return compareTo2;
        }
        int compareTo8 = Boolean.valueOf(isSetAction_urls()).compareTo(Boolean.valueOf(other.isSetAction_urls()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (!isSetAction_urls() || (compareTo = TBaseHelper.compareTo((Map) this.action_urls, (Map) other.action_urls)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<GuideForNewStrategy, _Fields> deepCopy2() {
        return new GuideForNewStrategy(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$GuideForNewStrategy$_Fields[field.ordinal()];
        if (i11 == 1) {
            return Integer.valueOf(getUser_group());
        }
        if (i11 == 2) {
            return getActionSequence();
        }
        if (i11 == 3) {
            return Integer.valueOf(getRole_strategy());
        }
        if (i11 == 4) {
            return getAction_urls();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$GuideForNewStrategy$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetUser_group();
        }
        if (i11 == 2) {
            return isSetActionSequence();
        }
        if (i11 == 3) {
            return isSetRole_strategy();
        }
        if (i11 == 4) {
            return isSetAction_urls();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$GuideForNewStrategy$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetUser_group();
                return;
            } else {
                setUser_group(((Integer) value).intValue());
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetActionSequence();
                return;
            } else {
                setActionSequence((List) value);
                return;
            }
        }
        if (i11 == 3) {
            if (value == null) {
                unsetRole_strategy();
                return;
            } else {
                setRole_strategy(((Integer) value).intValue());
                return;
            }
        }
        if (i11 != 4) {
            return;
        }
        if (value == null) {
            unsetAction_urls();
        } else {
            setAction_urls((Map) value);
        }
    }

    public boolean equals(GuideForNewStrategy that) {
        if (that == null || this.user_group != that.user_group) {
            return false;
        }
        boolean isSetActionSequence = isSetActionSequence();
        boolean isSetActionSequence2 = that.isSetActionSequence();
        if ((isSetActionSequence || isSetActionSequence2) && !(isSetActionSequence && isSetActionSequence2 && this.actionSequence.equals(that.actionSequence))) {
            return false;
        }
        boolean isSetRole_strategy = isSetRole_strategy();
        boolean isSetRole_strategy2 = that.isSetRole_strategy();
        if ((isSetRole_strategy || isSetRole_strategy2) && !(isSetRole_strategy && isSetRole_strategy2 && this.role_strategy == that.role_strategy)) {
            return false;
        }
        boolean isSetAction_urls = isSetAction_urls();
        boolean isSetAction_urls2 = that.isSetAction_urls();
        if (isSetAction_urls || isSetAction_urls2) {
            return isSetAction_urls && isSetAction_urls2 && this.action_urls.equals(that.action_urls);
        }
        return true;
    }

    public GuideForNewStrategy(int user_group, List<Integer> actionSequence) {
        this();
        this.user_group = user_group;
        setUser_groupIsSet(true);
        this.actionSequence = actionSequence;
    }

    public GuideForNewStrategy(GuideForNewStrategy other) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.ROLE_STRATEGY, _Fields.ACTION_URLS};
        this.__isset_bitfield = other.__isset_bitfield;
        this.user_group = other.user_group;
        if (other.isSetActionSequence()) {
            this.actionSequence = new ArrayList(other.actionSequence);
        }
        this.role_strategy = other.role_strategy;
        if (other.isSetAction_urls()) {
            this.action_urls = new HashMap(other.action_urls);
        }
    }
}

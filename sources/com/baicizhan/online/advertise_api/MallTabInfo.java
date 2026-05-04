package com.baicizhan.online.advertise_api;

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
public class MallTabInfo implements TBase<MallTabInfo, _Fields>, Serializable, Cloneable, Comparable<MallTabInfo> {
    private static final int __RECOMMENDTYPE_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public List<MallIconItem> mall;
    private _Fields[] optionals;
    public int recommendType;
    public List<MallIconItem> taobao;
    private static final TStruct STRUCT_DESC = new TStruct("MallTabInfo");
    private static final TField RECOMMEND_TYPE_FIELD_DESC = new TField("recommendType", (byte) 8, 1);
    private static final TField TAOBAO_FIELD_DESC = new TField(s9.b.f88139c, (byte) 15, 2);
    private static final TField MALL_FIELD_DESC = new TField(q9.h.f81939c, (byte) 15, 3);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.advertise_api.MallTabInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$advertise_api$MallTabInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$advertise_api$MallTabInfo$_Fields = iArr;
            try {
                iArr[_Fields.RECOMMEND_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$advertise_api$MallTabInfo$_Fields[_Fields.TAOBAO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$advertise_api$MallTabInfo$_Fields[_Fields.MALL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class MallTabInfoStandardScheme extends StandardScheme<MallTabInfo> {
        private MallTabInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, MallTabInfo struct) throws TException {
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
                            TProtocolUtil.skip(iprot, b11);
                        } else if (b11 == 15) {
                            TList readListBegin = iprot.readListBegin();
                            struct.mall = new ArrayList(readListBegin.size);
                            while (i11 < readListBegin.size) {
                                MallIconItem mallIconItem = new MallIconItem();
                                mallIconItem.read(iprot);
                                struct.mall.add(mallIconItem);
                                i11++;
                            }
                            iprot.readListEnd();
                            struct.setMallIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 15) {
                        TList readListBegin2 = iprot.readListBegin();
                        struct.taobao = new ArrayList(readListBegin2.size);
                        while (i11 < readListBegin2.size) {
                            MallIconItem mallIconItem2 = new MallIconItem();
                            mallIconItem2.read(iprot);
                            struct.taobao.add(mallIconItem2);
                            i11++;
                        }
                        iprot.readListEnd();
                        struct.setTaobaoIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 8) {
                    struct.recommendType = iprot.readI32();
                    struct.setRecommendTypeIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (struct.isSetRecommendType()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'recommendType' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, MallTabInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(MallTabInfo.STRUCT_DESC);
            oprot.writeFieldBegin(MallTabInfo.RECOMMEND_TYPE_FIELD_DESC);
            oprot.writeI32(struct.recommendType);
            oprot.writeFieldEnd();
            if (struct.taobao != null && struct.isSetTaobao()) {
                oprot.writeFieldBegin(MallTabInfo.TAOBAO_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 12, struct.taobao.size()));
                Iterator<MallIconItem> it = struct.taobao.iterator();
                while (it.hasNext()) {
                    it.next().write(oprot);
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            if (struct.mall != null && struct.isSetMall()) {
                oprot.writeFieldBegin(MallTabInfo.MALL_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 12, struct.mall.size()));
                Iterator<MallIconItem> it2 = struct.mall.iterator();
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
    public static class MallTabInfoStandardSchemeFactory implements SchemeFactory {
        private MallTabInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public MallTabInfoStandardScheme getScheme() {
            return new MallTabInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class MallTabInfoTupleScheme extends TupleScheme<MallTabInfo> {
        private MallTabInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, MallTabInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.recommendType = tTupleProtocol.readI32();
            struct.setRecommendTypeIsSet(true);
            BitSet readBitSet = tTupleProtocol.readBitSet(2);
            if (readBitSet.get(0)) {
                TList tList = new TList((byte) 12, tTupleProtocol.readI32());
                struct.taobao = new ArrayList(tList.size);
                for (int i11 = 0; i11 < tList.size; i11++) {
                    MallIconItem mallIconItem = new MallIconItem();
                    mallIconItem.read(tTupleProtocol);
                    struct.taobao.add(mallIconItem);
                }
                struct.setTaobaoIsSet(true);
            }
            if (readBitSet.get(1)) {
                TList tList2 = new TList((byte) 12, tTupleProtocol.readI32());
                struct.mall = new ArrayList(tList2.size);
                for (int i12 = 0; i12 < tList2.size; i12++) {
                    MallIconItem mallIconItem2 = new MallIconItem();
                    mallIconItem2.read(tTupleProtocol);
                    struct.mall.add(mallIconItem2);
                }
                struct.setMallIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, MallTabInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.recommendType);
            BitSet bitSet = new BitSet();
            if (struct.isSetTaobao()) {
                bitSet.set(0);
            }
            if (struct.isSetMall()) {
                bitSet.set(1);
            }
            tTupleProtocol.writeBitSet(bitSet, 2);
            if (struct.isSetTaobao()) {
                tTupleProtocol.writeI32(struct.taobao.size());
                Iterator<MallIconItem> it = struct.taobao.iterator();
                while (it.hasNext()) {
                    it.next().write(tTupleProtocol);
                }
            }
            if (struct.isSetMall()) {
                tTupleProtocol.writeI32(struct.mall.size());
                Iterator<MallIconItem> it2 = struct.mall.iterator();
                while (it2.hasNext()) {
                    it2.next().write(tTupleProtocol);
                }
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class MallTabInfoTupleSchemeFactory implements SchemeFactory {
        private MallTabInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public MallTabInfoTupleScheme getScheme() {
            return new MallTabInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        RECOMMEND_TYPE(1, "recommendType"),
        TAOBAO(2, s9.b.f88139c),
        MALL(3, q9.h.f81939c);

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
                return RECOMMEND_TYPE;
            }
            if (fieldId == 2) {
                return TAOBAO;
            }
            if (fieldId != 3) {
                return null;
            }
            return MALL;
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
        hashMap.put(StandardScheme.class, new MallTabInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new MallTabInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.RECOMMEND_TYPE, (_Fields) new FieldMetaData("recommendType", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.TAOBAO, (_Fields) new FieldMetaData(s9.b.f88139c, (byte) 2, new ListMetaData((byte) 15, new StructMetaData((byte) 12, MallIconItem.class))));
        enumMap.put((EnumMap) _Fields.MALL, (_Fields) new FieldMetaData(q9.h.f81939c, (byte) 2, new ListMetaData((byte) 15, new StructMetaData((byte) 12, MallIconItem.class))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(MallTabInfo.class, unmodifiableMap);
    }

    public MallTabInfo() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.TAOBAO, _Fields.MALL};
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

    public void addToMall(MallIconItem elem) {
        if (this.mall == null) {
            this.mall = new ArrayList();
        }
        this.mall.add(elem);
    }

    public void addToTaobao(MallIconItem elem) {
        if (this.taobao == null) {
            this.taobao = new ArrayList();
        }
        this.taobao.add(elem);
    }

    @Override // org.apache.thrift.TBase
    public void clear() {
        setRecommendTypeIsSet(false);
        this.recommendType = 0;
        this.taobao = null;
        this.mall = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof MallTabInfo)) {
            return equals((MallTabInfo) that);
        }
        return false;
    }

    public List<MallIconItem> getMall() {
        return this.mall;
    }

    public Iterator<MallIconItem> getMallIterator() {
        List<MallIconItem> list = this.mall;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getMallSize() {
        List<MallIconItem> list = this.mall;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public int getRecommendType() {
        return this.recommendType;
    }

    public List<MallIconItem> getTaobao() {
        return this.taobao;
    }

    public Iterator<MallIconItem> getTaobaoIterator() {
        List<MallIconItem> list = this.taobao;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getTaobaoSize() {
        List<MallIconItem> list = this.taobao;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetMall() {
        return this.mall != null;
    }

    public boolean isSetRecommendType() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetTaobao() {
        return this.taobao != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public MallTabInfo setMall(List<MallIconItem> mall) {
        this.mall = mall;
        return this;
    }

    public void setMallIsSet(boolean value) {
        if (value) {
            return;
        }
        this.mall = null;
    }

    public MallTabInfo setRecommendType(int recommendType) {
        this.recommendType = recommendType;
        setRecommendTypeIsSet(true);
        return this;
    }

    public void setRecommendTypeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public MallTabInfo setTaobao(List<MallIconItem> taobao) {
        this.taobao = taobao;
        return this;
    }

    public void setTaobaoIsSet(boolean value) {
        if (value) {
            return;
        }
        this.taobao = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("MallTabInfo(");
        sb2.append("recommendType:");
        sb2.append(this.recommendType);
        if (isSetTaobao()) {
            sb2.append(j2.O);
            sb2.append("taobao:");
            List<MallIconItem> list = this.taobao;
            if (list == null) {
                sb2.append("null");
            } else {
                sb2.append(list);
            }
        }
        if (isSetMall()) {
            sb2.append(j2.O);
            sb2.append("mall:");
            List<MallIconItem> list2 = this.mall;
            if (list2 == null) {
                sb2.append("null");
            } else {
                sb2.append(list2);
            }
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetMall() {
        this.mall = null;
    }

    public void unsetRecommendType() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetTaobao() {
        this.taobao = null;
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(MallTabInfo other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo4 = Boolean.valueOf(isSetRecommendType()).compareTo(Boolean.valueOf(other.isSetRecommendType()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (isSetRecommendType() && (compareTo3 = TBaseHelper.compareTo(this.recommendType, other.recommendType)) != 0) {
            return compareTo3;
        }
        int compareTo5 = Boolean.valueOf(isSetTaobao()).compareTo(Boolean.valueOf(other.isSetTaobao()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (isSetTaobao() && (compareTo2 = TBaseHelper.compareTo((List) this.taobao, (List) other.taobao)) != 0) {
            return compareTo2;
        }
        int compareTo6 = Boolean.valueOf(isSetMall()).compareTo(Boolean.valueOf(other.isSetMall()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (!isSetMall() || (compareTo = TBaseHelper.compareTo((List) this.mall, (List) other.mall)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<MallTabInfo, _Fields> deepCopy2() {
        return new MallTabInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$advertise_api$MallTabInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return Integer.valueOf(getRecommendType());
        }
        if (i11 == 2) {
            return getTaobao();
        }
        if (i11 == 3) {
            return getMall();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$advertise_api$MallTabInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetRecommendType();
        }
        if (i11 == 2) {
            return isSetTaobao();
        }
        if (i11 == 3) {
            return isSetMall();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$advertise_api$MallTabInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetRecommendType();
                return;
            } else {
                setRecommendType(((Integer) value).intValue());
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetTaobao();
                return;
            } else {
                setTaobao((List) value);
                return;
            }
        }
        if (i11 != 3) {
            return;
        }
        if (value == null) {
            unsetMall();
        } else {
            setMall((List) value);
        }
    }

    public boolean equals(MallTabInfo that) {
        if (that == null || this.recommendType != that.recommendType) {
            return false;
        }
        boolean isSetTaobao = isSetTaobao();
        boolean isSetTaobao2 = that.isSetTaobao();
        if ((isSetTaobao || isSetTaobao2) && !(isSetTaobao && isSetTaobao2 && this.taobao.equals(that.taobao))) {
            return false;
        }
        boolean isSetMall = isSetMall();
        boolean isSetMall2 = that.isSetMall();
        if (isSetMall || isSetMall2) {
            return isSetMall && isSetMall2 && this.mall.equals(that.mall);
        }
        return true;
    }

    public MallTabInfo(int recommendType) {
        this();
        this.recommendType = recommendType;
        setRecommendTypeIsSet(true);
    }

    public MallTabInfo(MallTabInfo other) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.TAOBAO, _Fields.MALL};
        this.__isset_bitfield = other.__isset_bitfield;
        this.recommendType = other.recommendType;
        if (other.isSetTaobao()) {
            ArrayList arrayList = new ArrayList(other.taobao.size());
            Iterator<MallIconItem> it = other.taobao.iterator();
            while (it.hasNext()) {
                arrayList.add(new MallIconItem(it.next()));
            }
            this.taobao = arrayList;
        }
        if (other.isSetMall()) {
            ArrayList arrayList2 = new ArrayList(other.mall.size());
            Iterator<MallIconItem> it2 = other.mall.iterator();
            while (it2.hasNext()) {
                arrayList2.add(new MallIconItem(it2.next()));
            }
            this.mall = arrayList2;
        }
    }

    public void validate() throws TException {
    }
}

package com.baicizhan.online.advertise_api;

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
import org.apache.thrift.TBase;
import org.apache.thrift.TBaseHelper;
import org.apache.thrift.TException;
import org.apache.thrift.TFieldIdEnum;
import org.apache.thrift.meta_data.EnumMetaData;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
import org.apache.thrift.meta_data.ListMetaData;
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
public class AdvertiseLoadingInfo implements TBase<AdvertiseLoadingInfo, _Fields>, Serializable, Cloneable, Comparable<AdvertiseLoadingInfo> {
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    public List<Integer> ad_ids;
    public AdvertiseLoadingModule module_name;
    private static final TStruct STRUCT_DESC = new TStruct("AdvertiseLoadingInfo");
    private static final TField MODULE_NAME_FIELD_DESC = new TField("module_name", (byte) 8, 1);
    private static final TField AD_IDS_FIELD_DESC = new TField("ad_ids", (byte) 15, 2);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.advertise_api.AdvertiseLoadingInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$advertise_api$AdvertiseLoadingInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$advertise_api$AdvertiseLoadingInfo$_Fields = iArr;
            try {
                iArr[_Fields.MODULE_NAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$advertise_api$AdvertiseLoadingInfo$_Fields[_Fields.AD_IDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AdvertiseLoadingInfoStandardScheme extends StandardScheme<AdvertiseLoadingInfo> {
        private AdvertiseLoadingInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, AdvertiseLoadingInfo struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    iprot.readStructEnd();
                    struct.validate();
                    return;
                }
                short s11 = readFieldBegin.f77768id;
                if (s11 != 1) {
                    if (s11 != 2) {
                        TProtocolUtil.skip(iprot, b11);
                    } else if (b11 == 15) {
                        TList readListBegin = iprot.readListBegin();
                        struct.ad_ids = new ArrayList(readListBegin.size);
                        for (int i11 = 0; i11 < readListBegin.size; i11++) {
                            struct.ad_ids.add(Integer.valueOf(iprot.readI32()));
                        }
                        iprot.readListEnd();
                        struct.setAd_idsIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 8) {
                    struct.module_name = AdvertiseLoadingModule.findByValue(iprot.readI32());
                    struct.setModule_nameIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, AdvertiseLoadingInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(AdvertiseLoadingInfo.STRUCT_DESC);
            if (struct.module_name != null) {
                oprot.writeFieldBegin(AdvertiseLoadingInfo.MODULE_NAME_FIELD_DESC);
                oprot.writeI32(struct.module_name.getValue());
                oprot.writeFieldEnd();
            }
            if (struct.ad_ids != null) {
                oprot.writeFieldBegin(AdvertiseLoadingInfo.AD_IDS_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 8, struct.ad_ids.size()));
                Iterator<Integer> it = struct.ad_ids.iterator();
                while (it.hasNext()) {
                    oprot.writeI32(it.next().intValue());
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AdvertiseLoadingInfoStandardSchemeFactory implements SchemeFactory {
        private AdvertiseLoadingInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public AdvertiseLoadingInfoStandardScheme getScheme() {
            return new AdvertiseLoadingInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AdvertiseLoadingInfoTupleScheme extends TupleScheme<AdvertiseLoadingInfo> {
        private AdvertiseLoadingInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, AdvertiseLoadingInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.module_name = AdvertiseLoadingModule.findByValue(tTupleProtocol.readI32());
            struct.setModule_nameIsSet(true);
            TList tList = new TList((byte) 8, tTupleProtocol.readI32());
            struct.ad_ids = new ArrayList(tList.size);
            for (int i11 = 0; i11 < tList.size; i11++) {
                struct.ad_ids.add(Integer.valueOf(tTupleProtocol.readI32()));
            }
            struct.setAd_idsIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, AdvertiseLoadingInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.module_name.getValue());
            tTupleProtocol.writeI32(struct.ad_ids.size());
            Iterator<Integer> it = struct.ad_ids.iterator();
            while (it.hasNext()) {
                tTupleProtocol.writeI32(it.next().intValue());
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AdvertiseLoadingInfoTupleSchemeFactory implements SchemeFactory {
        private AdvertiseLoadingInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public AdvertiseLoadingInfoTupleScheme getScheme() {
            return new AdvertiseLoadingInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        MODULE_NAME(1, "module_name"),
        AD_IDS(2, "ad_ids");

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
                return MODULE_NAME;
            }
            if (fieldId != 2) {
                return null;
            }
            return AD_IDS;
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
        hashMap.put(StandardScheme.class, new AdvertiseLoadingInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new AdvertiseLoadingInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.MODULE_NAME, (_Fields) new FieldMetaData("module_name", (byte) 1, new EnumMetaData((byte) 16, AdvertiseLoadingModule.class)));
        enumMap.put((EnumMap) _Fields.AD_IDS, (_Fields) new FieldMetaData("ad_ids", (byte) 1, new ListMetaData((byte) 15, new FieldValueMetaData((byte) 8))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(AdvertiseLoadingInfo.class, unmodifiableMap);
    }

    public AdvertiseLoadingInfo() {
    }

    private void readObject(ObjectInputStream in2) throws IOException, ClassNotFoundException {
        try {
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

    public void addToAd_ids(int elem) {
        if (this.ad_ids == null) {
            this.ad_ids = new ArrayList();
        }
        this.ad_ids.add(Integer.valueOf(elem));
    }

    @Override // org.apache.thrift.TBase
    public void clear() {
        this.module_name = null;
        this.ad_ids = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof AdvertiseLoadingInfo)) {
            return equals((AdvertiseLoadingInfo) that);
        }
        return false;
    }

    public List<Integer> getAd_ids() {
        return this.ad_ids;
    }

    public Iterator<Integer> getAd_idsIterator() {
        List<Integer> list = this.ad_ids;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getAd_idsSize() {
        List<Integer> list = this.ad_ids;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public AdvertiseLoadingModule getModule_name() {
        return this.module_name;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetAd_ids() {
        return this.ad_ids != null;
    }

    public boolean isSetModule_name() {
        return this.module_name != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public AdvertiseLoadingInfo setAd_ids(List<Integer> ad_ids) {
        this.ad_ids = ad_ids;
        return this;
    }

    public void setAd_idsIsSet(boolean value) {
        if (value) {
            return;
        }
        this.ad_ids = null;
    }

    public AdvertiseLoadingInfo setModule_name(AdvertiseLoadingModule module_name) {
        this.module_name = module_name;
        return this;
    }

    public void setModule_nameIsSet(boolean value) {
        if (value) {
            return;
        }
        this.module_name = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertiseLoadingInfo(");
        sb2.append("module_name:");
        AdvertiseLoadingModule advertiseLoadingModule = this.module_name;
        if (advertiseLoadingModule == null) {
            sb2.append("null");
        } else {
            sb2.append(advertiseLoadingModule);
        }
        sb2.append(j2.O);
        sb2.append("ad_ids:");
        List<Integer> list = this.ad_ids;
        if (list == null) {
            sb2.append("null");
        } else {
            sb2.append(list);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetAd_ids() {
        this.ad_ids = null;
    }

    public void unsetModule_name() {
        this.module_name = null;
    }

    public void validate() throws TException {
        if (this.module_name == null) {
            throw new TProtocolException("Required field 'module_name' was not present! Struct: " + toString());
        }
        if (this.ad_ids != null) {
            return;
        }
        throw new TProtocolException("Required field 'ad_ids' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    public AdvertiseLoadingInfo(AdvertiseLoadingModule module_name, List<Integer> ad_ids) {
        this();
        this.module_name = module_name;
        this.ad_ids = ad_ids;
    }

    @Override // java.lang.Comparable
    public int compareTo(AdvertiseLoadingInfo other) {
        int compareTo;
        int compareTo2;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo3 = Boolean.valueOf(isSetModule_name()).compareTo(Boolean.valueOf(other.isSetModule_name()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (isSetModule_name() && (compareTo2 = TBaseHelper.compareTo((Comparable) this.module_name, (Comparable) other.module_name)) != 0) {
            return compareTo2;
        }
        int compareTo4 = Boolean.valueOf(isSetAd_ids()).compareTo(Boolean.valueOf(other.isSetAd_ids()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (!isSetAd_ids() || (compareTo = TBaseHelper.compareTo((List) this.ad_ids, (List) other.ad_ids)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<AdvertiseLoadingInfo, _Fields> deepCopy2() {
        return new AdvertiseLoadingInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$advertise_api$AdvertiseLoadingInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return getModule_name();
        }
        if (i11 == 2) {
            return getAd_ids();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$advertise_api$AdvertiseLoadingInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetModule_name();
        }
        if (i11 == 2) {
            return isSetAd_ids();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$advertise_api$AdvertiseLoadingInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetModule_name();
                return;
            } else {
                setModule_name((AdvertiseLoadingModule) value);
                return;
            }
        }
        if (i11 != 2) {
            return;
        }
        if (value == null) {
            unsetAd_ids();
        } else {
            setAd_ids((List) value);
        }
    }

    public boolean equals(AdvertiseLoadingInfo that) {
        if (that == null) {
            return false;
        }
        boolean isSetModule_name = isSetModule_name();
        boolean isSetModule_name2 = that.isSetModule_name();
        if ((isSetModule_name || isSetModule_name2) && !(isSetModule_name && isSetModule_name2 && this.module_name.equals(that.module_name))) {
            return false;
        }
        boolean isSetAd_ids = isSetAd_ids();
        boolean isSetAd_ids2 = that.isSetAd_ids();
        if (isSetAd_ids || isSetAd_ids2) {
            return isSetAd_ids && isSetAd_ids2 && this.ad_ids.equals(that.ad_ids);
        }
        return true;
    }

    public AdvertiseLoadingInfo(AdvertiseLoadingInfo other) {
        if (other.isSetModule_name()) {
            this.module_name = other.module_name;
        }
        if (other.isSetAd_ids()) {
            this.ad_ids = new ArrayList(other.ad_ids);
        }
    }
}

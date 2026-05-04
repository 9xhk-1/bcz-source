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
import org.apache.thrift.meta_data.FieldMetaData;
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

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class BczOwnAd implements TBase<BczOwnAd, _Fields>, Serializable, Cloneable, Comparable<BczOwnAd> {
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    public List<BczLaunchAdItem> ads;
    private static final TStruct STRUCT_DESC = new TStruct("BczOwnAd");
    private static final TField ADS_FIELD_DESC = new TField("ads", (byte) 15, 1);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.advertise_api.BczOwnAd$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$advertise_api$BczOwnAd$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$advertise_api$BczOwnAd$_Fields = iArr;
            try {
                iArr[_Fields.ADS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BczOwnAdStandardScheme extends StandardScheme<BczOwnAd> {
        private BczOwnAdStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, BczOwnAd struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    iprot.readStructEnd();
                    struct.validate();
                    return;
                }
                if (readFieldBegin.f77768id != 1) {
                    TProtocolUtil.skip(iprot, b11);
                } else if (b11 == 15) {
                    TList readListBegin = iprot.readListBegin();
                    struct.ads = new ArrayList(readListBegin.size);
                    for (int i11 = 0; i11 < readListBegin.size; i11++) {
                        BczLaunchAdItem bczLaunchAdItem = new BczLaunchAdItem();
                        bczLaunchAdItem.read(iprot);
                        struct.ads.add(bczLaunchAdItem);
                    }
                    iprot.readListEnd();
                    struct.setAdsIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, BczOwnAd struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(BczOwnAd.STRUCT_DESC);
            if (struct.ads != null) {
                oprot.writeFieldBegin(BczOwnAd.ADS_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 12, struct.ads.size()));
                Iterator<BczLaunchAdItem> it = struct.ads.iterator();
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
    public static class BczOwnAdStandardSchemeFactory implements SchemeFactory {
        private BczOwnAdStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BczOwnAdStandardScheme getScheme() {
            return new BczOwnAdStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BczOwnAdTupleScheme extends TupleScheme<BczOwnAd> {
        private BczOwnAdTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, BczOwnAd struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            TList tList = new TList((byte) 12, tTupleProtocol.readI32());
            struct.ads = new ArrayList(tList.size);
            for (int i11 = 0; i11 < tList.size; i11++) {
                BczLaunchAdItem bczLaunchAdItem = new BczLaunchAdItem();
                bczLaunchAdItem.read(tTupleProtocol);
                struct.ads.add(bczLaunchAdItem);
            }
            struct.setAdsIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, BczOwnAd struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.ads.size());
            Iterator<BczLaunchAdItem> it = struct.ads.iterator();
            while (it.hasNext()) {
                it.next().write(tTupleProtocol);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BczOwnAdTupleSchemeFactory implements SchemeFactory {
        private BczOwnAdTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BczOwnAdTupleScheme getScheme() {
            return new BczOwnAdTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        ADS(1, "ads");

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
            if (fieldId != 1) {
                return null;
            }
            return ADS;
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
        hashMap.put(StandardScheme.class, new BczOwnAdStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new BczOwnAdTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.ADS, (_Fields) new FieldMetaData("ads", (byte) 1, new ListMetaData((byte) 15, new StructMetaData((byte) 12, BczLaunchAdItem.class))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(BczOwnAd.class, unmodifiableMap);
    }

    public BczOwnAd() {
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

    public void addToAds(BczLaunchAdItem elem) {
        if (this.ads == null) {
            this.ads = new ArrayList();
        }
        this.ads.add(elem);
    }

    @Override // org.apache.thrift.TBase
    public void clear() {
        this.ads = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof BczOwnAd)) {
            return equals((BczOwnAd) that);
        }
        return false;
    }

    public List<BczLaunchAdItem> getAds() {
        return this.ads;
    }

    public Iterator<BczLaunchAdItem> getAdsIterator() {
        List<BczLaunchAdItem> list = this.ads;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getAdsSize() {
        List<BczLaunchAdItem> list = this.ads;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetAds() {
        return this.ads != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public BczOwnAd setAds(List<BczLaunchAdItem> ads) {
        this.ads = ads;
        return this;
    }

    public void setAdsIsSet(boolean value) {
        if (value) {
            return;
        }
        this.ads = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("BczOwnAd(");
        sb2.append("ads:");
        List<BczLaunchAdItem> list = this.ads;
        if (list == null) {
            sb2.append("null");
        } else {
            sb2.append(list);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetAds() {
        this.ads = null;
    }

    public void validate() throws TException {
        if (this.ads != null) {
            return;
        }
        throw new TProtocolException("Required field 'ads' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    public BczOwnAd(List<BczLaunchAdItem> ads) {
        this();
        this.ads = ads;
    }

    @Override // java.lang.Comparable
    public int compareTo(BczOwnAd other) {
        int compareTo;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(isSetAds()).compareTo(Boolean.valueOf(other.isSetAds()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (!isSetAds() || (compareTo = TBaseHelper.compareTo((List) this.ads, (List) other.ads)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<BczOwnAd, _Fields> deepCopy2() {
        return new BczOwnAd(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        if (AnonymousClass1.$SwitchMap$com$baicizhan$online$advertise_api$BczOwnAd$_Fields[field.ordinal()] == 1) {
            return getAds();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        if (AnonymousClass1.$SwitchMap$com$baicizhan$online$advertise_api$BczOwnAd$_Fields[field.ordinal()] == 1) {
            return isSetAds();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        if (AnonymousClass1.$SwitchMap$com$baicizhan$online$advertise_api$BczOwnAd$_Fields[field.ordinal()] != 1) {
            return;
        }
        if (value == null) {
            unsetAds();
        } else {
            setAds((List) value);
        }
    }

    public boolean equals(BczOwnAd that) {
        if (that == null) {
            return false;
        }
        boolean isSetAds = isSetAds();
        boolean isSetAds2 = that.isSetAds();
        if (isSetAds || isSetAds2) {
            return isSetAds && isSetAds2 && this.ads.equals(that.ads);
        }
        return true;
    }

    public BczOwnAd(BczOwnAd other) {
        if (other.isSetAds()) {
            ArrayList arrayList = new ArrayList(other.ads.size());
            Iterator<BczLaunchAdItem> it = other.ads.iterator();
            while (it.hasNext()) {
                arrayList.add(new BczLaunchAdItem(it.next()));
            }
            this.ads = arrayList;
        }
    }
}

package com.baicizhan.online.advertise_api;

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
import org.apache.thrift.TBase;
import org.apache.thrift.TBaseHelper;
import org.apache.thrift.TException;
import org.apache.thrift.TFieldIdEnum;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.StructMetaData;
import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.protocol.TField;
import org.apache.thrift.protocol.TProtocol;
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
public class BczLaunchAd implements TBase<BczLaunchAd, _Fields>, Serializable, Cloneable, Comparable<BczLaunchAd> {
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private _Fields[] optionals;
    public BczOwnAd own_ad;
    public ThirdAd third_ad;
    private static final TStruct STRUCT_DESC = new TStruct("BczLaunchAd");
    private static final TField OWN_AD_FIELD_DESC = new TField("own_ad", (byte) 12, 1);
    private static final TField THIRD_AD_FIELD_DESC = new TField("third_ad", (byte) 12, 2);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.advertise_api.BczLaunchAd$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$advertise_api$BczLaunchAd$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$advertise_api$BczLaunchAd$_Fields = iArr;
            try {
                iArr[_Fields.OWN_AD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$advertise_api$BczLaunchAd$_Fields[_Fields.THIRD_AD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BczLaunchAdStandardScheme extends StandardScheme<BczLaunchAd> {
        private BczLaunchAdStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, BczLaunchAd struct) throws TException {
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
                    } else if (b11 == 12) {
                        ThirdAd thirdAd = new ThirdAd();
                        struct.third_ad = thirdAd;
                        thirdAd.read(iprot);
                        struct.setThird_adIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 12) {
                    BczOwnAd bczOwnAd = new BczOwnAd();
                    struct.own_ad = bczOwnAd;
                    bczOwnAd.read(iprot);
                    struct.setOwn_adIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, BczLaunchAd struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(BczLaunchAd.STRUCT_DESC);
            if (struct.own_ad != null && struct.isSetOwn_ad()) {
                oprot.writeFieldBegin(BczLaunchAd.OWN_AD_FIELD_DESC);
                struct.own_ad.write(oprot);
                oprot.writeFieldEnd();
            }
            if (struct.third_ad != null && struct.isSetThird_ad()) {
                oprot.writeFieldBegin(BczLaunchAd.THIRD_AD_FIELD_DESC);
                struct.third_ad.write(oprot);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BczLaunchAdStandardSchemeFactory implements SchemeFactory {
        private BczLaunchAdStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BczLaunchAdStandardScheme getScheme() {
            return new BczLaunchAdStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BczLaunchAdTupleScheme extends TupleScheme<BczLaunchAd> {
        private BczLaunchAdTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, BczLaunchAd struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            BitSet readBitSet = tTupleProtocol.readBitSet(2);
            if (readBitSet.get(0)) {
                BczOwnAd bczOwnAd = new BczOwnAd();
                struct.own_ad = bczOwnAd;
                bczOwnAd.read(tTupleProtocol);
                struct.setOwn_adIsSet(true);
            }
            if (readBitSet.get(1)) {
                ThirdAd thirdAd = new ThirdAd();
                struct.third_ad = thirdAd;
                thirdAd.read(tTupleProtocol);
                struct.setThird_adIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, BczLaunchAd struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            BitSet bitSet = new BitSet();
            if (struct.isSetOwn_ad()) {
                bitSet.set(0);
            }
            if (struct.isSetThird_ad()) {
                bitSet.set(1);
            }
            tTupleProtocol.writeBitSet(bitSet, 2);
            if (struct.isSetOwn_ad()) {
                struct.own_ad.write(tTupleProtocol);
            }
            if (struct.isSetThird_ad()) {
                struct.third_ad.write(tTupleProtocol);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BczLaunchAdTupleSchemeFactory implements SchemeFactory {
        private BczLaunchAdTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BczLaunchAdTupleScheme getScheme() {
            return new BczLaunchAdTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        OWN_AD(1, "own_ad"),
        THIRD_AD(2, "third_ad");

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
                return OWN_AD;
            }
            if (fieldId != 2) {
                return null;
            }
            return THIRD_AD;
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
        hashMap.put(StandardScheme.class, new BczLaunchAdStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new BczLaunchAdTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.OWN_AD, (_Fields) new FieldMetaData("own_ad", (byte) 2, new StructMetaData((byte) 12, BczOwnAd.class)));
        enumMap.put((EnumMap) _Fields.THIRD_AD, (_Fields) new FieldMetaData("third_ad", (byte) 2, new StructMetaData((byte) 12, ThirdAd.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(BczLaunchAd.class, unmodifiableMap);
    }

    public BczLaunchAd() {
        this.optionals = new _Fields[]{_Fields.OWN_AD, _Fields.THIRD_AD};
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

    @Override // org.apache.thrift.TBase
    public void clear() {
        this.own_ad = null;
        this.third_ad = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof BczLaunchAd)) {
            return equals((BczLaunchAd) that);
        }
        return false;
    }

    public BczOwnAd getOwn_ad() {
        return this.own_ad;
    }

    public ThirdAd getThird_ad() {
        return this.third_ad;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetOwn_ad() {
        return this.own_ad != null;
    }

    public boolean isSetThird_ad() {
        return this.third_ad != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public BczLaunchAd setOwn_ad(BczOwnAd own_ad) {
        this.own_ad = own_ad;
        return this;
    }

    public void setOwn_adIsSet(boolean value) {
        if (value) {
            return;
        }
        this.own_ad = null;
    }

    public BczLaunchAd setThird_ad(ThirdAd third_ad) {
        this.third_ad = third_ad;
        return this;
    }

    public void setThird_adIsSet(boolean value) {
        if (value) {
            return;
        }
        this.third_ad = null;
    }

    public String toString() {
        boolean z11;
        StringBuilder sb2 = new StringBuilder("BczLaunchAd(");
        if (isSetOwn_ad()) {
            sb2.append("own_ad:");
            BczOwnAd bczOwnAd = this.own_ad;
            if (bczOwnAd == null) {
                sb2.append("null");
            } else {
                sb2.append(bczOwnAd);
            }
            z11 = false;
        } else {
            z11 = true;
        }
        if (isSetThird_ad()) {
            if (!z11) {
                sb2.append(j2.O);
            }
            sb2.append("third_ad:");
            ThirdAd thirdAd = this.third_ad;
            if (thirdAd == null) {
                sb2.append("null");
            } else {
                sb2.append(thirdAd);
            }
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetOwn_ad() {
        this.own_ad = null;
    }

    public void unsetThird_ad() {
        this.third_ad = null;
    }

    public void validate() throws TException {
        BczOwnAd bczOwnAd = this.own_ad;
        if (bczOwnAd != null) {
            bczOwnAd.validate();
        }
        ThirdAd thirdAd = this.third_ad;
        if (thirdAd != null) {
            thirdAd.validate();
        }
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(BczLaunchAd other) {
        int compareTo;
        int compareTo2;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo3 = Boolean.valueOf(isSetOwn_ad()).compareTo(Boolean.valueOf(other.isSetOwn_ad()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (isSetOwn_ad() && (compareTo2 = TBaseHelper.compareTo((Comparable) this.own_ad, (Comparable) other.own_ad)) != 0) {
            return compareTo2;
        }
        int compareTo4 = Boolean.valueOf(isSetThird_ad()).compareTo(Boolean.valueOf(other.isSetThird_ad()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (!isSetThird_ad() || (compareTo = TBaseHelper.compareTo((Comparable) this.third_ad, (Comparable) other.third_ad)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<BczLaunchAd, _Fields> deepCopy2() {
        return new BczLaunchAd(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$advertise_api$BczLaunchAd$_Fields[field.ordinal()];
        if (i11 == 1) {
            return getOwn_ad();
        }
        if (i11 == 2) {
            return getThird_ad();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$advertise_api$BczLaunchAd$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetOwn_ad();
        }
        if (i11 == 2) {
            return isSetThird_ad();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$advertise_api$BczLaunchAd$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetOwn_ad();
                return;
            } else {
                setOwn_ad((BczOwnAd) value);
                return;
            }
        }
        if (i11 != 2) {
            return;
        }
        if (value == null) {
            unsetThird_ad();
        } else {
            setThird_ad((ThirdAd) value);
        }
    }

    public BczLaunchAd(BczLaunchAd other) {
        this.optionals = new _Fields[]{_Fields.OWN_AD, _Fields.THIRD_AD};
        if (other.isSetOwn_ad()) {
            this.own_ad = new BczOwnAd(other.own_ad);
        }
        if (other.isSetThird_ad()) {
            this.third_ad = new ThirdAd(other.third_ad);
        }
    }

    public boolean equals(BczLaunchAd that) {
        if (that == null) {
            return false;
        }
        boolean isSetOwn_ad = isSetOwn_ad();
        boolean isSetOwn_ad2 = that.isSetOwn_ad();
        if ((isSetOwn_ad || isSetOwn_ad2) && !(isSetOwn_ad && isSetOwn_ad2 && this.own_ad.equals(that.own_ad))) {
            return false;
        }
        boolean isSetThird_ad = isSetThird_ad();
        boolean isSetThird_ad2 = that.isSetThird_ad();
        if (isSetThird_ad || isSetThird_ad2) {
            return isSetThird_ad && isSetThird_ad2 && this.third_ad.equals(that.third_ad);
        }
        return true;
    }
}

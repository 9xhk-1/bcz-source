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

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class MainViewGameTopAdv implements TBase<MainViewGameTopAdv, _Fields>, Serializable, Cloneable, Comparable<MainViewGameTopAdv> {
    private static final TStruct STRUCT_DESC = new TStruct("MainViewGameTopAdv");
    private static final TField TOP_AD_FIELD_DESC = new TField("top_ad", (byte) 12, 1);
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private _Fields[] optionals;
    public MainViewBottomAdv top_ad;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.advertise_api.MainViewGameTopAdv$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$advertise_api$MainViewGameTopAdv$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$advertise_api$MainViewGameTopAdv$_Fields = iArr;
            try {
                iArr[_Fields.TOP_AD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class MainViewGameTopAdvStandardScheme extends StandardScheme<MainViewGameTopAdv> {
        private MainViewGameTopAdvStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, MainViewGameTopAdv struct) throws TException {
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
                } else if (b11 == 12) {
                    MainViewBottomAdv mainViewBottomAdv = new MainViewBottomAdv();
                    struct.top_ad = mainViewBottomAdv;
                    mainViewBottomAdv.read(iprot);
                    struct.setTop_adIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, MainViewGameTopAdv struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(MainViewGameTopAdv.STRUCT_DESC);
            if (struct.top_ad != null && struct.isSetTop_ad()) {
                oprot.writeFieldBegin(MainViewGameTopAdv.TOP_AD_FIELD_DESC);
                struct.top_ad.write(oprot);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class MainViewGameTopAdvStandardSchemeFactory implements SchemeFactory {
        private MainViewGameTopAdvStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public MainViewGameTopAdvStandardScheme getScheme() {
            return new MainViewGameTopAdvStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class MainViewGameTopAdvTupleScheme extends TupleScheme<MainViewGameTopAdv> {
        private MainViewGameTopAdvTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, MainViewGameTopAdv struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            if (tTupleProtocol.readBitSet(1).get(0)) {
                MainViewBottomAdv mainViewBottomAdv = new MainViewBottomAdv();
                struct.top_ad = mainViewBottomAdv;
                mainViewBottomAdv.read(tTupleProtocol);
                struct.setTop_adIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, MainViewGameTopAdv struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            BitSet bitSet = new BitSet();
            if (struct.isSetTop_ad()) {
                bitSet.set(0);
            }
            tTupleProtocol.writeBitSet(bitSet, 1);
            if (struct.isSetTop_ad()) {
                struct.top_ad.write(tTupleProtocol);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class MainViewGameTopAdvTupleSchemeFactory implements SchemeFactory {
        private MainViewGameTopAdvTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public MainViewGameTopAdvTupleScheme getScheme() {
            return new MainViewGameTopAdvTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        TOP_AD(1, "top_ad");

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
            return TOP_AD;
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
        hashMap.put(StandardScheme.class, new MainViewGameTopAdvStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new MainViewGameTopAdvTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.TOP_AD, (_Fields) new FieldMetaData("top_ad", (byte) 2, new StructMetaData((byte) 12, MainViewBottomAdv.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(MainViewGameTopAdv.class, unmodifiableMap);
    }

    public MainViewGameTopAdv() {
        this.optionals = new _Fields[]{_Fields.TOP_AD};
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
        this.top_ad = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof MainViewGameTopAdv)) {
            return equals((MainViewGameTopAdv) that);
        }
        return false;
    }

    public MainViewBottomAdv getTop_ad() {
        return this.top_ad;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetTop_ad() {
        return this.top_ad != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public MainViewGameTopAdv setTop_ad(MainViewBottomAdv top_ad) {
        this.top_ad = top_ad;
        return this;
    }

    public void setTop_adIsSet(boolean value) {
        if (value) {
            return;
        }
        this.top_ad = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("MainViewGameTopAdv(");
        if (isSetTop_ad()) {
            sb2.append("top_ad:");
            MainViewBottomAdv mainViewBottomAdv = this.top_ad;
            if (mainViewBottomAdv == null) {
                sb2.append("null");
            } else {
                sb2.append(mainViewBottomAdv);
            }
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetTop_ad() {
        this.top_ad = null;
    }

    public void validate() throws TException {
        MainViewBottomAdv mainViewBottomAdv = this.top_ad;
        if (mainViewBottomAdv != null) {
            mainViewBottomAdv.validate();
        }
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(MainViewGameTopAdv other) {
        int compareTo;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(isSetTop_ad()).compareTo(Boolean.valueOf(other.isSetTop_ad()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (!isSetTop_ad() || (compareTo = TBaseHelper.compareTo((Comparable) this.top_ad, (Comparable) other.top_ad)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<MainViewGameTopAdv, _Fields> deepCopy2() {
        return new MainViewGameTopAdv(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        if (AnonymousClass1.$SwitchMap$com$baicizhan$online$advertise_api$MainViewGameTopAdv$_Fields[field.ordinal()] == 1) {
            return getTop_ad();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        if (AnonymousClass1.$SwitchMap$com$baicizhan$online$advertise_api$MainViewGameTopAdv$_Fields[field.ordinal()] == 1) {
            return isSetTop_ad();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        if (AnonymousClass1.$SwitchMap$com$baicizhan$online$advertise_api$MainViewGameTopAdv$_Fields[field.ordinal()] != 1) {
            return;
        }
        if (value == null) {
            unsetTop_ad();
        } else {
            setTop_ad((MainViewBottomAdv) value);
        }
    }

    public MainViewGameTopAdv(MainViewGameTopAdv other) {
        this.optionals = new _Fields[]{_Fields.TOP_AD};
        if (other.isSetTop_ad()) {
            this.top_ad = new MainViewBottomAdv(other.top_ad);
        }
    }

    public boolean equals(MainViewGameTopAdv that) {
        if (that == null) {
            return false;
        }
        boolean isSetTop_ad = isSetTop_ad();
        boolean isSetTop_ad2 = that.isSetTop_ad();
        if (isSetTop_ad || isSetTop_ad2) {
            return isSetTop_ad && isSetTop_ad2 && this.top_ad.equals(that.top_ad);
        }
        return true;
    }
}

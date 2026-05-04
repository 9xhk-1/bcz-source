package com.baicizhan.online.ad_property;

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
import org.apache.thrift.meta_data.FieldValueMetaData;
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
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class AdLunchApp implements TBase<AdLunchApp, _Fields>, Serializable, Cloneable, Comparable<AdLunchApp> {
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    public String deeplink;
    private _Fields[] optionals;
    private static final TStruct STRUCT_DESC = new TStruct("AdLunchApp");
    private static final TField DEEPLINK_FIELD_DESC = new TField("deeplink", (byte) 11, 1);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.ad_property.AdLunchApp$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$ad_property$AdLunchApp$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$ad_property$AdLunchApp$_Fields = iArr;
            try {
                iArr[_Fields.DEEPLINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AdLunchAppStandardScheme extends StandardScheme<AdLunchApp> {
        private AdLunchAppStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, AdLunchApp struct) throws TException {
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
                } else if (b11 == 11) {
                    struct.deeplink = iprot.readString();
                    struct.setDeeplinkIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, AdLunchApp struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(AdLunchApp.STRUCT_DESC);
            if (struct.deeplink != null && struct.isSetDeeplink()) {
                oprot.writeFieldBegin(AdLunchApp.DEEPLINK_FIELD_DESC);
                oprot.writeString(struct.deeplink);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AdLunchAppStandardSchemeFactory implements SchemeFactory {
        private AdLunchAppStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public AdLunchAppStandardScheme getScheme() {
            return new AdLunchAppStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AdLunchAppTupleScheme extends TupleScheme<AdLunchApp> {
        private AdLunchAppTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, AdLunchApp struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            if (tTupleProtocol.readBitSet(1).get(0)) {
                struct.deeplink = tTupleProtocol.readString();
                struct.setDeeplinkIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, AdLunchApp struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            BitSet bitSet = new BitSet();
            if (struct.isSetDeeplink()) {
                bitSet.set(0);
            }
            tTupleProtocol.writeBitSet(bitSet, 1);
            if (struct.isSetDeeplink()) {
                tTupleProtocol.writeString(struct.deeplink);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AdLunchAppTupleSchemeFactory implements SchemeFactory {
        private AdLunchAppTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public AdLunchAppTupleScheme getScheme() {
            return new AdLunchAppTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        DEEPLINK(1, "deeplink");

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
            return DEEPLINK;
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
        hashMap.put(StandardScheme.class, new AdLunchAppStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new AdLunchAppTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.DEEPLINK, (_Fields) new FieldMetaData("deeplink", (byte) 2, new FieldValueMetaData((byte) 11)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(AdLunchApp.class, unmodifiableMap);
    }

    public AdLunchApp() {
        this.optionals = new _Fields[]{_Fields.DEEPLINK};
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
        this.deeplink = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof AdLunchApp)) {
            return equals((AdLunchApp) that);
        }
        return false;
    }

    public String getDeeplink() {
        return this.deeplink;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetDeeplink() {
        return this.deeplink != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public AdLunchApp setDeeplink(String deeplink) {
        this.deeplink = deeplink;
        return this;
    }

    public void setDeeplinkIsSet(boolean value) {
        if (value) {
            return;
        }
        this.deeplink = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AdLunchApp(");
        if (isSetDeeplink()) {
            sb2.append("deeplink:");
            String str = this.deeplink;
            if (str == null) {
                sb2.append("null");
            } else {
                sb2.append(str);
            }
        }
        sb2.append(j.f81007d);
        return sb2.toString();
    }

    public void unsetDeeplink() {
        this.deeplink = null;
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(AdLunchApp other) {
        int compareTo;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(isSetDeeplink()).compareTo(Boolean.valueOf(other.isSetDeeplink()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (!isSetDeeplink() || (compareTo = TBaseHelper.compareTo(this.deeplink, other.deeplink)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<AdLunchApp, _Fields> deepCopy2() {
        return new AdLunchApp(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        if (AnonymousClass1.$SwitchMap$com$baicizhan$online$ad_property$AdLunchApp$_Fields[field.ordinal()] == 1) {
            return getDeeplink();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        if (AnonymousClass1.$SwitchMap$com$baicizhan$online$ad_property$AdLunchApp$_Fields[field.ordinal()] == 1) {
            return isSetDeeplink();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        if (AnonymousClass1.$SwitchMap$com$baicizhan$online$ad_property$AdLunchApp$_Fields[field.ordinal()] != 1) {
            return;
        }
        if (value == null) {
            unsetDeeplink();
        } else {
            setDeeplink((String) value);
        }
    }

    public AdLunchApp(AdLunchApp other) {
        this.optionals = new _Fields[]{_Fields.DEEPLINK};
        if (other.isSetDeeplink()) {
            this.deeplink = other.deeplink;
        }
    }

    public boolean equals(AdLunchApp that) {
        if (that == null) {
            return false;
        }
        boolean isSetDeeplink = isSetDeeplink();
        boolean isSetDeeplink2 = that.isSetDeeplink();
        if (isSetDeeplink || isSetDeeplink2) {
            return isSetDeeplink && isSetDeeplink2 && this.deeplink.equals(that.deeplink);
        }
        return true;
    }

    public void validate() throws TException {
    }
}

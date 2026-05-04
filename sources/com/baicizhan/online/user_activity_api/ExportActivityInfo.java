package com.baicizhan.online.user_activity_api;

import com.baicizhan.client.business.util.navigate.NavigationIntentInfoKt;
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
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class ExportActivityInfo implements TBase<ExportActivityInfo, _Fields>, Serializable, Cloneable, Comparable<ExportActivityInfo> {
    private static final int __BALANCE_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public String activity_url;
    public int balance;
    public ExportBanner banner;
    private _Fields[] optionals;
    public List<ExportTemplateInfo> template_infos;
    private static final TStruct STRUCT_DESC = new TStruct("ExportActivityInfo");
    private static final TField TEMPLATE_INFOS_FIELD_DESC = new TField("template_infos", (byte) 15, 1);
    private static final TField BALANCE_FIELD_DESC = new TField("balance", (byte) 8, 2);
    private static final TField ACTIVITY_URL_FIELD_DESC = new TField(NavigationIntentInfoKt.KEY_ACTIVITY_URL, (byte) 11, 3);
    private static final TField BANNER_FIELD_DESC = new TField("banner", (byte) 12, 4);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.user_activity_api.ExportActivityInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_activity_api$ExportActivityInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$user_activity_api$ExportActivityInfo$_Fields = iArr;
            try {
                iArr[_Fields.TEMPLATE_INFOS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_activity_api$ExportActivityInfo$_Fields[_Fields.BALANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_activity_api$ExportActivityInfo$_Fields[_Fields.ACTIVITY_URL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_activity_api$ExportActivityInfo$_Fields[_Fields.BANNER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ExportActivityInfoStandardScheme extends StandardScheme<ExportActivityInfo> {
        private ExportActivityInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, ExportActivityInfo struct) throws TException {
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
                            } else if (b11 == 12) {
                                ExportBanner exportBanner = new ExportBanner();
                                struct.banner = exportBanner;
                                exportBanner.read(iprot);
                                struct.setBannerIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 11) {
                            struct.activity_url = iprot.readString();
                            struct.setActivity_urlIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 8) {
                        struct.balance = iprot.readI32();
                        struct.setBalanceIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 15) {
                    TList readListBegin = iprot.readListBegin();
                    struct.template_infos = new ArrayList(readListBegin.size);
                    for (int i11 = 0; i11 < readListBegin.size; i11++) {
                        ExportTemplateInfo exportTemplateInfo = new ExportTemplateInfo();
                        exportTemplateInfo.read(iprot);
                        struct.template_infos.add(exportTemplateInfo);
                    }
                    iprot.readListEnd();
                    struct.setTemplate_infosIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (struct.isSetBalance()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'balance' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, ExportActivityInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(ExportActivityInfo.STRUCT_DESC);
            if (struct.template_infos != null) {
                oprot.writeFieldBegin(ExportActivityInfo.TEMPLATE_INFOS_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 12, struct.template_infos.size()));
                Iterator<ExportTemplateInfo> it = struct.template_infos.iterator();
                while (it.hasNext()) {
                    it.next().write(oprot);
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(ExportActivityInfo.BALANCE_FIELD_DESC);
            oprot.writeI32(struct.balance);
            oprot.writeFieldEnd();
            if (struct.activity_url != null) {
                oprot.writeFieldBegin(ExportActivityInfo.ACTIVITY_URL_FIELD_DESC);
                oprot.writeString(struct.activity_url);
                oprot.writeFieldEnd();
            }
            if (struct.banner != null && struct.isSetBanner()) {
                oprot.writeFieldBegin(ExportActivityInfo.BANNER_FIELD_DESC);
                struct.banner.write(oprot);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ExportActivityInfoStandardSchemeFactory implements SchemeFactory {
        private ExportActivityInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public ExportActivityInfoStandardScheme getScheme() {
            return new ExportActivityInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ExportActivityInfoTupleScheme extends TupleScheme<ExportActivityInfo> {
        private ExportActivityInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, ExportActivityInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            TList tList = new TList((byte) 12, tTupleProtocol.readI32());
            struct.template_infos = new ArrayList(tList.size);
            for (int i11 = 0; i11 < tList.size; i11++) {
                ExportTemplateInfo exportTemplateInfo = new ExportTemplateInfo();
                exportTemplateInfo.read(tTupleProtocol);
                struct.template_infos.add(exportTemplateInfo);
            }
            struct.setTemplate_infosIsSet(true);
            struct.balance = tTupleProtocol.readI32();
            struct.setBalanceIsSet(true);
            struct.activity_url = tTupleProtocol.readString();
            struct.setActivity_urlIsSet(true);
            if (tTupleProtocol.readBitSet(1).get(0)) {
                ExportBanner exportBanner = new ExportBanner();
                struct.banner = exportBanner;
                exportBanner.read(tTupleProtocol);
                struct.setBannerIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, ExportActivityInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.template_infos.size());
            Iterator<ExportTemplateInfo> it = struct.template_infos.iterator();
            while (it.hasNext()) {
                it.next().write(tTupleProtocol);
            }
            tTupleProtocol.writeI32(struct.balance);
            tTupleProtocol.writeString(struct.activity_url);
            BitSet bitSet = new BitSet();
            if (struct.isSetBanner()) {
                bitSet.set(0);
            }
            tTupleProtocol.writeBitSet(bitSet, 1);
            if (struct.isSetBanner()) {
                struct.banner.write(tTupleProtocol);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ExportActivityInfoTupleSchemeFactory implements SchemeFactory {
        private ExportActivityInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public ExportActivityInfoTupleScheme getScheme() {
            return new ExportActivityInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        TEMPLATE_INFOS(1, "template_infos"),
        BALANCE(2, "balance"),
        ACTIVITY_URL(3, NavigationIntentInfoKt.KEY_ACTIVITY_URL),
        BANNER(4, "banner");

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
                return TEMPLATE_INFOS;
            }
            if (fieldId == 2) {
                return BALANCE;
            }
            if (fieldId == 3) {
                return ACTIVITY_URL;
            }
            if (fieldId != 4) {
                return null;
            }
            return BANNER;
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
        hashMap.put(StandardScheme.class, new ExportActivityInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new ExportActivityInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.TEMPLATE_INFOS, (_Fields) new FieldMetaData("template_infos", (byte) 1, new ListMetaData((byte) 15, new StructMetaData((byte) 12, ExportTemplateInfo.class))));
        enumMap.put((EnumMap) _Fields.BALANCE, (_Fields) new FieldMetaData("balance", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.ACTIVITY_URL, (_Fields) new FieldMetaData(NavigationIntentInfoKt.KEY_ACTIVITY_URL, (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.BANNER, (_Fields) new FieldMetaData("banner", (byte) 2, new StructMetaData((byte) 12, ExportBanner.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(ExportActivityInfo.class, unmodifiableMap);
    }

    public ExportActivityInfo() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.BANNER};
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

    public void addToTemplate_infos(ExportTemplateInfo elem) {
        if (this.template_infos == null) {
            this.template_infos = new ArrayList();
        }
        this.template_infos.add(elem);
    }

    @Override // org.apache.thrift.TBase
    public void clear() {
        this.template_infos = null;
        setBalanceIsSet(false);
        this.balance = 0;
        this.activity_url = null;
        this.banner = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof ExportActivityInfo)) {
            return equals((ExportActivityInfo) that);
        }
        return false;
    }

    public String getActivity_url() {
        return this.activity_url;
    }

    public int getBalance() {
        return this.balance;
    }

    public ExportBanner getBanner() {
        return this.banner;
    }

    public List<ExportTemplateInfo> getTemplate_infos() {
        return this.template_infos;
    }

    public Iterator<ExportTemplateInfo> getTemplate_infosIterator() {
        List<ExportTemplateInfo> list = this.template_infos;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getTemplate_infosSize() {
        List<ExportTemplateInfo> list = this.template_infos;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetActivity_url() {
        return this.activity_url != null;
    }

    public boolean isSetBalance() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetBanner() {
        return this.banner != null;
    }

    public boolean isSetTemplate_infos() {
        return this.template_infos != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public ExportActivityInfo setActivity_url(String activity_url) {
        this.activity_url = activity_url;
        return this;
    }

    public void setActivity_urlIsSet(boolean value) {
        if (value) {
            return;
        }
        this.activity_url = null;
    }

    public ExportActivityInfo setBalance(int balance) {
        this.balance = balance;
        setBalanceIsSet(true);
        return this;
    }

    public void setBalanceIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public ExportActivityInfo setBanner(ExportBanner banner) {
        this.banner = banner;
        return this;
    }

    public void setBannerIsSet(boolean value) {
        if (value) {
            return;
        }
        this.banner = null;
    }

    public ExportActivityInfo setTemplate_infos(List<ExportTemplateInfo> template_infos) {
        this.template_infos = template_infos;
        return this;
    }

    public void setTemplate_infosIsSet(boolean value) {
        if (value) {
            return;
        }
        this.template_infos = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ExportActivityInfo(");
        sb2.append("template_infos:");
        List<ExportTemplateInfo> list = this.template_infos;
        if (list == null) {
            sb2.append("null");
        } else {
            sb2.append(list);
        }
        sb2.append(j2.O);
        sb2.append("balance:");
        sb2.append(this.balance);
        sb2.append(j2.O);
        sb2.append("activity_url:");
        String str = this.activity_url;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        if (isSetBanner()) {
            sb2.append(j2.O);
            sb2.append("banner:");
            ExportBanner exportBanner = this.banner;
            if (exportBanner == null) {
                sb2.append("null");
            } else {
                sb2.append(exportBanner);
            }
        }
        sb2.append(j.f81007d);
        return sb2.toString();
    }

    public void unsetActivity_url() {
        this.activity_url = null;
    }

    public void unsetBalance() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetBanner() {
        this.banner = null;
    }

    public void unsetTemplate_infos() {
        this.template_infos = null;
    }

    public void validate() throws TException {
        if (this.template_infos == null) {
            throw new TProtocolException("Required field 'template_infos' was not present! Struct: " + toString());
        }
        if (this.activity_url == null) {
            throw new TProtocolException("Required field 'activity_url' was not present! Struct: " + toString());
        }
        ExportBanner exportBanner = this.banner;
        if (exportBanner != null) {
            exportBanner.validate();
        }
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(ExportActivityInfo other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo5 = Boolean.valueOf(isSetTemplate_infos()).compareTo(Boolean.valueOf(other.isSetTemplate_infos()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (isSetTemplate_infos() && (compareTo4 = TBaseHelper.compareTo((List) this.template_infos, (List) other.template_infos)) != 0) {
            return compareTo4;
        }
        int compareTo6 = Boolean.valueOf(isSetBalance()).compareTo(Boolean.valueOf(other.isSetBalance()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (isSetBalance() && (compareTo3 = TBaseHelper.compareTo(this.balance, other.balance)) != 0) {
            return compareTo3;
        }
        int compareTo7 = Boolean.valueOf(isSetActivity_url()).compareTo(Boolean.valueOf(other.isSetActivity_url()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (isSetActivity_url() && (compareTo2 = TBaseHelper.compareTo(this.activity_url, other.activity_url)) != 0) {
            return compareTo2;
        }
        int compareTo8 = Boolean.valueOf(isSetBanner()).compareTo(Boolean.valueOf(other.isSetBanner()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (!isSetBanner() || (compareTo = TBaseHelper.compareTo((Comparable) this.banner, (Comparable) other.banner)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<ExportActivityInfo, _Fields> deepCopy2() {
        return new ExportActivityInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_activity_api$ExportActivityInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return getTemplate_infos();
        }
        if (i11 == 2) {
            return Integer.valueOf(getBalance());
        }
        if (i11 == 3) {
            return getActivity_url();
        }
        if (i11 == 4) {
            return getBanner();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_activity_api$ExportActivityInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetTemplate_infos();
        }
        if (i11 == 2) {
            return isSetBalance();
        }
        if (i11 == 3) {
            return isSetActivity_url();
        }
        if (i11 == 4) {
            return isSetBanner();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_activity_api$ExportActivityInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetTemplate_infos();
                return;
            } else {
                setTemplate_infos((List) value);
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetBalance();
                return;
            } else {
                setBalance(((Integer) value).intValue());
                return;
            }
        }
        if (i11 == 3) {
            if (value == null) {
                unsetActivity_url();
                return;
            } else {
                setActivity_url((String) value);
                return;
            }
        }
        if (i11 != 4) {
            return;
        }
        if (value == null) {
            unsetBanner();
        } else {
            setBanner((ExportBanner) value);
        }
    }

    public boolean equals(ExportActivityInfo that) {
        if (that == null) {
            return false;
        }
        boolean isSetTemplate_infos = isSetTemplate_infos();
        boolean isSetTemplate_infos2 = that.isSetTemplate_infos();
        if (((isSetTemplate_infos || isSetTemplate_infos2) && !(isSetTemplate_infos && isSetTemplate_infos2 && this.template_infos.equals(that.template_infos))) || this.balance != that.balance) {
            return false;
        }
        boolean isSetActivity_url = isSetActivity_url();
        boolean isSetActivity_url2 = that.isSetActivity_url();
        if ((isSetActivity_url || isSetActivity_url2) && !(isSetActivity_url && isSetActivity_url2 && this.activity_url.equals(that.activity_url))) {
            return false;
        }
        boolean isSetBanner = isSetBanner();
        boolean isSetBanner2 = that.isSetBanner();
        if (isSetBanner || isSetBanner2) {
            return isSetBanner && isSetBanner2 && this.banner.equals(that.banner);
        }
        return true;
    }

    public ExportActivityInfo(List<ExportTemplateInfo> template_infos, int balance, String activity_url) {
        this();
        this.template_infos = template_infos;
        this.balance = balance;
        setBalanceIsSet(true);
        this.activity_url = activity_url;
    }

    public ExportActivityInfo(ExportActivityInfo other) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.BANNER};
        this.__isset_bitfield = other.__isset_bitfield;
        if (other.isSetTemplate_infos()) {
            ArrayList arrayList = new ArrayList(other.template_infos.size());
            Iterator<ExportTemplateInfo> it = other.template_infos.iterator();
            while (it.hasNext()) {
                arrayList.add(new ExportTemplateInfo(it.next()));
            }
            this.template_infos = arrayList;
        }
        this.balance = other.balance;
        if (other.isSetActivity_url()) {
            this.activity_url = other.activity_url;
        }
        if (other.isSetBanner()) {
            this.banner = new ExportBanner(other.banner);
        }
    }
}

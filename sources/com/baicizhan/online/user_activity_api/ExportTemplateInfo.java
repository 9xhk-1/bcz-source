package com.baicizhan.online.user_activity_api;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TBase;
import org.apache.thrift.TBaseHelper;
import org.apache.thrift.TException;
import org.apache.thrift.TFieldIdEnum;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.protocol.TField;
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
public class ExportTemplateInfo implements TBase<ExportTemplateInfo, _Fields>, Serializable, Cloneable, Comparable<ExportTemplateInfo> {
    private static final int __COST_ISSET_ID = 1;
    private static final int __T_ID_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public int cost;
    public String img_url;
    public int t_id;
    public String title;
    private static final TStruct STRUCT_DESC = new TStruct("ExportTemplateInfo");
    private static final TField T_ID_FIELD_DESC = new TField("t_id", (byte) 8, 1);
    private static final TField IMG_URL_FIELD_DESC = new TField(com.baicizhan.main.activity.schedule_v2.e.f19255e, (byte) 11, 2);
    private static final TField TITLE_FIELD_DESC = new TField("title", (byte) 11, 3);
    private static final TField COST_FIELD_DESC = new TField("cost", (byte) 8, 4);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.user_activity_api.ExportTemplateInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_activity_api$ExportTemplateInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$user_activity_api$ExportTemplateInfo$_Fields = iArr;
            try {
                iArr[_Fields.T_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_activity_api$ExportTemplateInfo$_Fields[_Fields.IMG_URL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_activity_api$ExportTemplateInfo$_Fields[_Fields.TITLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_activity_api$ExportTemplateInfo$_Fields[_Fields.COST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ExportTemplateInfoStandardScheme extends StandardScheme<ExportTemplateInfo> {
        private ExportTemplateInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, ExportTemplateInfo struct) throws TException {
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
                                struct.cost = iprot.readI32();
                                struct.setCostIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 11) {
                            struct.title = iprot.readString();
                            struct.setTitleIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 11) {
                        struct.img_url = iprot.readString();
                        struct.setImg_urlIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 8) {
                    struct.t_id = iprot.readI32();
                    struct.setT_idIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (!struct.isSetT_id()) {
                throw new TProtocolException("Required field 't_id' was not found in serialized data! Struct: " + toString());
            }
            if (struct.isSetCost()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'cost' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, ExportTemplateInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(ExportTemplateInfo.STRUCT_DESC);
            oprot.writeFieldBegin(ExportTemplateInfo.T_ID_FIELD_DESC);
            oprot.writeI32(struct.t_id);
            oprot.writeFieldEnd();
            if (struct.img_url != null) {
                oprot.writeFieldBegin(ExportTemplateInfo.IMG_URL_FIELD_DESC);
                oprot.writeString(struct.img_url);
                oprot.writeFieldEnd();
            }
            if (struct.title != null) {
                oprot.writeFieldBegin(ExportTemplateInfo.TITLE_FIELD_DESC);
                oprot.writeString(struct.title);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(ExportTemplateInfo.COST_FIELD_DESC);
            oprot.writeI32(struct.cost);
            oprot.writeFieldEnd();
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ExportTemplateInfoStandardSchemeFactory implements SchemeFactory {
        private ExportTemplateInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public ExportTemplateInfoStandardScheme getScheme() {
            return new ExportTemplateInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ExportTemplateInfoTupleScheme extends TupleScheme<ExportTemplateInfo> {
        private ExportTemplateInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, ExportTemplateInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.t_id = tTupleProtocol.readI32();
            struct.setT_idIsSet(true);
            struct.img_url = tTupleProtocol.readString();
            struct.setImg_urlIsSet(true);
            struct.title = tTupleProtocol.readString();
            struct.setTitleIsSet(true);
            struct.cost = tTupleProtocol.readI32();
            struct.setCostIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, ExportTemplateInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.t_id);
            tTupleProtocol.writeString(struct.img_url);
            tTupleProtocol.writeString(struct.title);
            tTupleProtocol.writeI32(struct.cost);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ExportTemplateInfoTupleSchemeFactory implements SchemeFactory {
        private ExportTemplateInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public ExportTemplateInfoTupleScheme getScheme() {
            return new ExportTemplateInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        T_ID(1, "t_id"),
        IMG_URL(2, com.baicizhan.main.activity.schedule_v2.e.f19255e),
        TITLE(3, "title"),
        COST(4, "cost");

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
                return T_ID;
            }
            if (fieldId == 2) {
                return IMG_URL;
            }
            if (fieldId == 3) {
                return TITLE;
            }
            if (fieldId != 4) {
                return null;
            }
            return COST;
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
        hashMap.put(StandardScheme.class, new ExportTemplateInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new ExportTemplateInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.T_ID, (_Fields) new FieldMetaData("t_id", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.IMG_URL, (_Fields) new FieldMetaData(com.baicizhan.main.activity.schedule_v2.e.f19255e, (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.TITLE, (_Fields) new FieldMetaData("title", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.COST, (_Fields) new FieldMetaData("cost", (byte) 1, new FieldValueMetaData((byte) 8)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(ExportTemplateInfo.class, unmodifiableMap);
    }

    public ExportTemplateInfo() {
        this.__isset_bitfield = (byte) 0;
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

    @Override // org.apache.thrift.TBase
    public void clear() {
        setT_idIsSet(false);
        this.t_id = 0;
        this.img_url = null;
        this.title = null;
        setCostIsSet(false);
        this.cost = 0;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof ExportTemplateInfo)) {
            return equals((ExportTemplateInfo) that);
        }
        return false;
    }

    public int getCost() {
        return this.cost;
    }

    public String getImg_url() {
        return this.img_url;
    }

    public int getT_id() {
        return this.t_id;
    }

    public String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetCost() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetImg_url() {
        return this.img_url != null;
    }

    public boolean isSetT_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetTitle() {
        return this.title != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public ExportTemplateInfo setCost(int cost) {
        this.cost = cost;
        setCostIsSet(true);
        return this;
    }

    public void setCostIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public ExportTemplateInfo setImg_url(String img_url) {
        this.img_url = img_url;
        return this;
    }

    public void setImg_urlIsSet(boolean value) {
        if (value) {
            return;
        }
        this.img_url = null;
    }

    public ExportTemplateInfo setT_id(int t_id) {
        this.t_id = t_id;
        setT_idIsSet(true);
        return this;
    }

    public void setT_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public ExportTemplateInfo setTitle(String title) {
        this.title = title;
        return this;
    }

    public void setTitleIsSet(boolean value) {
        if (value) {
            return;
        }
        this.title = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ExportTemplateInfo(");
        sb2.append("t_id:");
        sb2.append(this.t_id);
        sb2.append(j2.O);
        sb2.append("img_url:");
        String str = this.img_url;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(j2.O);
        sb2.append("title:");
        String str2 = this.title;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(str2);
        }
        sb2.append(j2.O);
        sb2.append("cost:");
        sb2.append(this.cost);
        sb2.append(j.f81007d);
        return sb2.toString();
    }

    public void unsetCost() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetImg_url() {
        this.img_url = null;
    }

    public void unsetT_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetTitle() {
        this.title = null;
    }

    public void validate() throws TException {
        if (this.img_url == null) {
            throw new TProtocolException("Required field 'img_url' was not present! Struct: " + toString());
        }
        if (this.title != null) {
            return;
        }
        throw new TProtocolException("Required field 'title' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(ExportTemplateInfo other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo5 = Boolean.valueOf(isSetT_id()).compareTo(Boolean.valueOf(other.isSetT_id()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (isSetT_id() && (compareTo4 = TBaseHelper.compareTo(this.t_id, other.t_id)) != 0) {
            return compareTo4;
        }
        int compareTo6 = Boolean.valueOf(isSetImg_url()).compareTo(Boolean.valueOf(other.isSetImg_url()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (isSetImg_url() && (compareTo3 = TBaseHelper.compareTo(this.img_url, other.img_url)) != 0) {
            return compareTo3;
        }
        int compareTo7 = Boolean.valueOf(isSetTitle()).compareTo(Boolean.valueOf(other.isSetTitle()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (isSetTitle() && (compareTo2 = TBaseHelper.compareTo(this.title, other.title)) != 0) {
            return compareTo2;
        }
        int compareTo8 = Boolean.valueOf(isSetCost()).compareTo(Boolean.valueOf(other.isSetCost()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (!isSetCost() || (compareTo = TBaseHelper.compareTo(this.cost, other.cost)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<ExportTemplateInfo, _Fields> deepCopy2() {
        return new ExportTemplateInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_activity_api$ExportTemplateInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return Integer.valueOf(getT_id());
        }
        if (i11 == 2) {
            return getImg_url();
        }
        if (i11 == 3) {
            return getTitle();
        }
        if (i11 == 4) {
            return Integer.valueOf(getCost());
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_activity_api$ExportTemplateInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetT_id();
        }
        if (i11 == 2) {
            return isSetImg_url();
        }
        if (i11 == 3) {
            return isSetTitle();
        }
        if (i11 == 4) {
            return isSetCost();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_activity_api$ExportTemplateInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetT_id();
                return;
            } else {
                setT_id(((Integer) value).intValue());
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetImg_url();
                return;
            } else {
                setImg_url((String) value);
                return;
            }
        }
        if (i11 == 3) {
            if (value == null) {
                unsetTitle();
                return;
            } else {
                setTitle((String) value);
                return;
            }
        }
        if (i11 != 4) {
            return;
        }
        if (value == null) {
            unsetCost();
        } else {
            setCost(((Integer) value).intValue());
        }
    }

    public ExportTemplateInfo(int t_id, String img_url, String title, int cost) {
        this();
        this.t_id = t_id;
        setT_idIsSet(true);
        this.img_url = img_url;
        this.title = title;
        this.cost = cost;
        setCostIsSet(true);
    }

    public boolean equals(ExportTemplateInfo that) {
        if (that == null || this.t_id != that.t_id) {
            return false;
        }
        boolean isSetImg_url = isSetImg_url();
        boolean isSetImg_url2 = that.isSetImg_url();
        if ((isSetImg_url || isSetImg_url2) && !(isSetImg_url && isSetImg_url2 && this.img_url.equals(that.img_url))) {
            return false;
        }
        boolean isSetTitle = isSetTitle();
        boolean isSetTitle2 = that.isSetTitle();
        return (!(isSetTitle || isSetTitle2) || (isSetTitle && isSetTitle2 && this.title.equals(that.title))) && this.cost == that.cost;
    }

    public ExportTemplateInfo(ExportTemplateInfo other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        this.t_id = other.t_id;
        if (other.isSetImg_url()) {
            this.img_url = other.img_url;
        }
        if (other.isSetTitle()) {
            this.title = other.title;
        }
        this.cost = other.cost;
    }
}

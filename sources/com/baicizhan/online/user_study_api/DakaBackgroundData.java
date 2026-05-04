package com.baicizhan.online.user_study_api;

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

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class DakaBackgroundData implements TBase<DakaBackgroundData, _Fields>, Serializable, Cloneable, Comparable<DakaBackgroundData> {
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    public List<DakaBackgroundCategoryInfo> category_info;
    public String logo;
    public String qr_image;
    public String title;
    private static final TStruct STRUCT_DESC = new TStruct("DakaBackgroundData");
    private static final TField CATEGORY_INFO_FIELD_DESC = new TField("category_info", (byte) 15, 1);
    private static final TField LOGO_FIELD_DESC = new TField("logo", (byte) 11, 2);
    private static final TField TITLE_FIELD_DESC = new TField("title", (byte) 11, 3);
    private static final TField QR_IMAGE_FIELD_DESC = new TField("qr_image", (byte) 11, 4);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.user_study_api.DakaBackgroundData$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_study_api$DakaBackgroundData$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$user_study_api$DakaBackgroundData$_Fields = iArr;
            try {
                iArr[_Fields.CATEGORY_INFO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$DakaBackgroundData$_Fields[_Fields.LOGO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$DakaBackgroundData$_Fields[_Fields.TITLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$DakaBackgroundData$_Fields[_Fields.QR_IMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class DakaBackgroundDataStandardScheme extends StandardScheme<DakaBackgroundData> {
        private DakaBackgroundDataStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, DakaBackgroundData struct) throws TException {
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
                        if (s11 != 3) {
                            if (s11 != 4) {
                                TProtocolUtil.skip(iprot, b11);
                            } else if (b11 == 11) {
                                struct.qr_image = iprot.readString();
                                struct.setQr_imageIsSet(true);
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
                        struct.logo = iprot.readString();
                        struct.setLogoIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 15) {
                    TList readListBegin = iprot.readListBegin();
                    struct.category_info = new ArrayList(readListBegin.size);
                    for (int i11 = 0; i11 < readListBegin.size; i11++) {
                        DakaBackgroundCategoryInfo dakaBackgroundCategoryInfo = new DakaBackgroundCategoryInfo();
                        dakaBackgroundCategoryInfo.read(iprot);
                        struct.category_info.add(dakaBackgroundCategoryInfo);
                    }
                    iprot.readListEnd();
                    struct.setCategory_infoIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, DakaBackgroundData struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(DakaBackgroundData.STRUCT_DESC);
            if (struct.category_info != null) {
                oprot.writeFieldBegin(DakaBackgroundData.CATEGORY_INFO_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 12, struct.category_info.size()));
                Iterator<DakaBackgroundCategoryInfo> it = struct.category_info.iterator();
                while (it.hasNext()) {
                    it.next().write(oprot);
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            if (struct.logo != null) {
                oprot.writeFieldBegin(DakaBackgroundData.LOGO_FIELD_DESC);
                oprot.writeString(struct.logo);
                oprot.writeFieldEnd();
            }
            if (struct.title != null) {
                oprot.writeFieldBegin(DakaBackgroundData.TITLE_FIELD_DESC);
                oprot.writeString(struct.title);
                oprot.writeFieldEnd();
            }
            if (struct.qr_image != null) {
                oprot.writeFieldBegin(DakaBackgroundData.QR_IMAGE_FIELD_DESC);
                oprot.writeString(struct.qr_image);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class DakaBackgroundDataStandardSchemeFactory implements SchemeFactory {
        private DakaBackgroundDataStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public DakaBackgroundDataStandardScheme getScheme() {
            return new DakaBackgroundDataStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class DakaBackgroundDataTupleScheme extends TupleScheme<DakaBackgroundData> {
        private DakaBackgroundDataTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, DakaBackgroundData struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            TList tList = new TList((byte) 12, tTupleProtocol.readI32());
            struct.category_info = new ArrayList(tList.size);
            for (int i11 = 0; i11 < tList.size; i11++) {
                DakaBackgroundCategoryInfo dakaBackgroundCategoryInfo = new DakaBackgroundCategoryInfo();
                dakaBackgroundCategoryInfo.read(tTupleProtocol);
                struct.category_info.add(dakaBackgroundCategoryInfo);
            }
            struct.setCategory_infoIsSet(true);
            struct.logo = tTupleProtocol.readString();
            struct.setLogoIsSet(true);
            struct.title = tTupleProtocol.readString();
            struct.setTitleIsSet(true);
            struct.qr_image = tTupleProtocol.readString();
            struct.setQr_imageIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, DakaBackgroundData struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.category_info.size());
            Iterator<DakaBackgroundCategoryInfo> it = struct.category_info.iterator();
            while (it.hasNext()) {
                it.next().write(tTupleProtocol);
            }
            tTupleProtocol.writeString(struct.logo);
            tTupleProtocol.writeString(struct.title);
            tTupleProtocol.writeString(struct.qr_image);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class DakaBackgroundDataTupleSchemeFactory implements SchemeFactory {
        private DakaBackgroundDataTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public DakaBackgroundDataTupleScheme getScheme() {
            return new DakaBackgroundDataTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        CATEGORY_INFO(1, "category_info"),
        LOGO(2, "logo"),
        TITLE(3, "title"),
        QR_IMAGE(4, "qr_image");

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
                return CATEGORY_INFO;
            }
            if (fieldId == 2) {
                return LOGO;
            }
            if (fieldId == 3) {
                return TITLE;
            }
            if (fieldId != 4) {
                return null;
            }
            return QR_IMAGE;
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
        hashMap.put(StandardScheme.class, new DakaBackgroundDataStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new DakaBackgroundDataTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.CATEGORY_INFO, (_Fields) new FieldMetaData("category_info", (byte) 1, new ListMetaData((byte) 15, new StructMetaData((byte) 12, DakaBackgroundCategoryInfo.class))));
        enumMap.put((EnumMap) _Fields.LOGO, (_Fields) new FieldMetaData("logo", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.TITLE, (_Fields) new FieldMetaData("title", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.QR_IMAGE, (_Fields) new FieldMetaData("qr_image", (byte) 1, new FieldValueMetaData((byte) 11)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(DakaBackgroundData.class, unmodifiableMap);
    }

    public DakaBackgroundData() {
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

    public void addToCategory_info(DakaBackgroundCategoryInfo elem) {
        if (this.category_info == null) {
            this.category_info = new ArrayList();
        }
        this.category_info.add(elem);
    }

    @Override // org.apache.thrift.TBase
    public void clear() {
        this.category_info = null;
        this.logo = null;
        this.title = null;
        this.qr_image = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof DakaBackgroundData)) {
            return equals((DakaBackgroundData) that);
        }
        return false;
    }

    public List<DakaBackgroundCategoryInfo> getCategory_info() {
        return this.category_info;
    }

    public Iterator<DakaBackgroundCategoryInfo> getCategory_infoIterator() {
        List<DakaBackgroundCategoryInfo> list = this.category_info;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getCategory_infoSize() {
        List<DakaBackgroundCategoryInfo> list = this.category_info;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public String getLogo() {
        return this.logo;
    }

    public String getQr_image() {
        return this.qr_image;
    }

    public String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetCategory_info() {
        return this.category_info != null;
    }

    public boolean isSetLogo() {
        return this.logo != null;
    }

    public boolean isSetQr_image() {
        return this.qr_image != null;
    }

    public boolean isSetTitle() {
        return this.title != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public DakaBackgroundData setCategory_info(List<DakaBackgroundCategoryInfo> category_info) {
        this.category_info = category_info;
        return this;
    }

    public void setCategory_infoIsSet(boolean value) {
        if (value) {
            return;
        }
        this.category_info = null;
    }

    public DakaBackgroundData setLogo(String logo) {
        this.logo = logo;
        return this;
    }

    public void setLogoIsSet(boolean value) {
        if (value) {
            return;
        }
        this.logo = null;
    }

    public DakaBackgroundData setQr_image(String qr_image) {
        this.qr_image = qr_image;
        return this;
    }

    public void setQr_imageIsSet(boolean value) {
        if (value) {
            return;
        }
        this.qr_image = null;
    }

    public DakaBackgroundData setTitle(String title) {
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
        StringBuilder sb2 = new StringBuilder("DakaBackgroundData(");
        sb2.append("category_info:");
        List<DakaBackgroundCategoryInfo> list = this.category_info;
        if (list == null) {
            sb2.append("null");
        } else {
            sb2.append(list);
        }
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("logo:");
        String str = this.logo;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("title:");
        String str2 = this.title;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(str2);
        }
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("qr_image:");
        String str3 = this.qr_image;
        if (str3 == null) {
            sb2.append("null");
        } else {
            sb2.append(str3);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetCategory_info() {
        this.category_info = null;
    }

    public void unsetLogo() {
        this.logo = null;
    }

    public void unsetQr_image() {
        this.qr_image = null;
    }

    public void unsetTitle() {
        this.title = null;
    }

    public void validate() throws TException {
        if (this.category_info == null) {
            throw new TProtocolException("Required field 'category_info' was not present! Struct: " + toString());
        }
        if (this.logo == null) {
            throw new TProtocolException("Required field 'logo' was not present! Struct: " + toString());
        }
        if (this.title == null) {
            throw new TProtocolException("Required field 'title' was not present! Struct: " + toString());
        }
        if (this.qr_image != null) {
            return;
        }
        throw new TProtocolException("Required field 'qr_image' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    public DakaBackgroundData(List<DakaBackgroundCategoryInfo> category_info, String logo, String title, String qr_image) {
        this();
        this.category_info = category_info;
        this.logo = logo;
        this.title = title;
        this.qr_image = qr_image;
    }

    @Override // java.lang.Comparable
    public int compareTo(DakaBackgroundData other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo5 = Boolean.valueOf(isSetCategory_info()).compareTo(Boolean.valueOf(other.isSetCategory_info()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (isSetCategory_info() && (compareTo4 = TBaseHelper.compareTo((List) this.category_info, (List) other.category_info)) != 0) {
            return compareTo4;
        }
        int compareTo6 = Boolean.valueOf(isSetLogo()).compareTo(Boolean.valueOf(other.isSetLogo()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (isSetLogo() && (compareTo3 = TBaseHelper.compareTo(this.logo, other.logo)) != 0) {
            return compareTo3;
        }
        int compareTo7 = Boolean.valueOf(isSetTitle()).compareTo(Boolean.valueOf(other.isSetTitle()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (isSetTitle() && (compareTo2 = TBaseHelper.compareTo(this.title, other.title)) != 0) {
            return compareTo2;
        }
        int compareTo8 = Boolean.valueOf(isSetQr_image()).compareTo(Boolean.valueOf(other.isSetQr_image()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (!isSetQr_image() || (compareTo = TBaseHelper.compareTo(this.qr_image, other.qr_image)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<DakaBackgroundData, _Fields> deepCopy2() {
        return new DakaBackgroundData(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$DakaBackgroundData$_Fields[field.ordinal()];
        if (i11 == 1) {
            return getCategory_info();
        }
        if (i11 == 2) {
            return getLogo();
        }
        if (i11 == 3) {
            return getTitle();
        }
        if (i11 == 4) {
            return getQr_image();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$DakaBackgroundData$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetCategory_info();
        }
        if (i11 == 2) {
            return isSetLogo();
        }
        if (i11 == 3) {
            return isSetTitle();
        }
        if (i11 == 4) {
            return isSetQr_image();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$DakaBackgroundData$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetCategory_info();
                return;
            } else {
                setCategory_info((List) value);
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetLogo();
                return;
            } else {
                setLogo((String) value);
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
            unsetQr_image();
        } else {
            setQr_image((String) value);
        }
    }

    public boolean equals(DakaBackgroundData that) {
        if (that == null) {
            return false;
        }
        boolean isSetCategory_info = isSetCategory_info();
        boolean isSetCategory_info2 = that.isSetCategory_info();
        if ((isSetCategory_info || isSetCategory_info2) && !(isSetCategory_info && isSetCategory_info2 && this.category_info.equals(that.category_info))) {
            return false;
        }
        boolean isSetLogo = isSetLogo();
        boolean isSetLogo2 = that.isSetLogo();
        if ((isSetLogo || isSetLogo2) && !(isSetLogo && isSetLogo2 && this.logo.equals(that.logo))) {
            return false;
        }
        boolean isSetTitle = isSetTitle();
        boolean isSetTitle2 = that.isSetTitle();
        if ((isSetTitle || isSetTitle2) && !(isSetTitle && isSetTitle2 && this.title.equals(that.title))) {
            return false;
        }
        boolean isSetQr_image = isSetQr_image();
        boolean isSetQr_image2 = that.isSetQr_image();
        if (isSetQr_image || isSetQr_image2) {
            return isSetQr_image && isSetQr_image2 && this.qr_image.equals(that.qr_image);
        }
        return true;
    }

    public DakaBackgroundData(DakaBackgroundData other) {
        if (other.isSetCategory_info()) {
            ArrayList arrayList = new ArrayList(other.category_info.size());
            Iterator<DakaBackgroundCategoryInfo> it = other.category_info.iterator();
            while (it.hasNext()) {
                arrayList.add(new DakaBackgroundCategoryInfo(it.next()));
            }
            this.category_info = arrayList;
        }
        if (other.isSetLogo()) {
            this.logo = other.logo;
        }
        if (other.isSetTitle()) {
            this.title = other.title;
        }
        if (other.isSetQr_image()) {
            this.qr_image = other.qr_image;
        }
    }
}

package com.baicizhan.online.user_study_api;

import com.baicizhan.client.business.dataset.provider.a;
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
public class ExtraInfo implements TBase<ExtraInfo, _Fields>, Serializable, Cloneable, Comparable<ExtraInfo> {
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    public List<Integer> book_ids;
    public String generalReviewUrl;
    public String newStudyUrl;
    public String reviewUrl;
    private static final TStruct STRUCT_DESC = new TStruct("ExtraInfo");
    private static final TField NEW_STUDY_URL_FIELD_DESC = new TField("newStudyUrl", (byte) 11, 1);
    private static final TField REVIEW_URL_FIELD_DESC = new TField("reviewUrl", (byte) 11, 2);
    private static final TField GENERAL_REVIEW_URL_FIELD_DESC = new TField("generalReviewUrl", (byte) 11, 3);
    private static final TField BOOK_IDS_FIELD_DESC = new TField(a.f.C0247a.f16190b, (byte) 15, 4);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.user_study_api.ExtraInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_study_api$ExtraInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$user_study_api$ExtraInfo$_Fields = iArr;
            try {
                iArr[_Fields.NEW_STUDY_URL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$ExtraInfo$_Fields[_Fields.REVIEW_URL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$ExtraInfo$_Fields[_Fields.GENERAL_REVIEW_URL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$ExtraInfo$_Fields[_Fields.BOOK_IDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ExtraInfoStandardScheme extends StandardScheme<ExtraInfo> {
        private ExtraInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, ExtraInfo struct) throws TException {
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
                            } else if (b11 == 15) {
                                TList readListBegin = iprot.readListBegin();
                                struct.book_ids = new ArrayList(readListBegin.size);
                                for (int i11 = 0; i11 < readListBegin.size; i11++) {
                                    struct.book_ids.add(Integer.valueOf(iprot.readI32()));
                                }
                                iprot.readListEnd();
                                struct.setBook_idsIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 11) {
                            struct.generalReviewUrl = iprot.readString();
                            struct.setGeneralReviewUrlIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 11) {
                        struct.reviewUrl = iprot.readString();
                        struct.setReviewUrlIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 11) {
                    struct.newStudyUrl = iprot.readString();
                    struct.setNewStudyUrlIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, ExtraInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(ExtraInfo.STRUCT_DESC);
            if (struct.newStudyUrl != null) {
                oprot.writeFieldBegin(ExtraInfo.NEW_STUDY_URL_FIELD_DESC);
                oprot.writeString(struct.newStudyUrl);
                oprot.writeFieldEnd();
            }
            if (struct.reviewUrl != null) {
                oprot.writeFieldBegin(ExtraInfo.REVIEW_URL_FIELD_DESC);
                oprot.writeString(struct.reviewUrl);
                oprot.writeFieldEnd();
            }
            if (struct.generalReviewUrl != null) {
                oprot.writeFieldBegin(ExtraInfo.GENERAL_REVIEW_URL_FIELD_DESC);
                oprot.writeString(struct.generalReviewUrl);
                oprot.writeFieldEnd();
            }
            if (struct.book_ids != null) {
                oprot.writeFieldBegin(ExtraInfo.BOOK_IDS_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 8, struct.book_ids.size()));
                Iterator<Integer> it = struct.book_ids.iterator();
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
    public static class ExtraInfoStandardSchemeFactory implements SchemeFactory {
        private ExtraInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public ExtraInfoStandardScheme getScheme() {
            return new ExtraInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ExtraInfoTupleScheme extends TupleScheme<ExtraInfo> {
        private ExtraInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, ExtraInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.newStudyUrl = tTupleProtocol.readString();
            struct.setNewStudyUrlIsSet(true);
            struct.reviewUrl = tTupleProtocol.readString();
            struct.setReviewUrlIsSet(true);
            struct.generalReviewUrl = tTupleProtocol.readString();
            struct.setGeneralReviewUrlIsSet(true);
            TList tList = new TList((byte) 8, tTupleProtocol.readI32());
            struct.book_ids = new ArrayList(tList.size);
            for (int i11 = 0; i11 < tList.size; i11++) {
                struct.book_ids.add(Integer.valueOf(tTupleProtocol.readI32()));
            }
            struct.setBook_idsIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, ExtraInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeString(struct.newStudyUrl);
            tTupleProtocol.writeString(struct.reviewUrl);
            tTupleProtocol.writeString(struct.generalReviewUrl);
            tTupleProtocol.writeI32(struct.book_ids.size());
            Iterator<Integer> it = struct.book_ids.iterator();
            while (it.hasNext()) {
                tTupleProtocol.writeI32(it.next().intValue());
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ExtraInfoTupleSchemeFactory implements SchemeFactory {
        private ExtraInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public ExtraInfoTupleScheme getScheme() {
            return new ExtraInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        NEW_STUDY_URL(1, "newStudyUrl"),
        REVIEW_URL(2, "reviewUrl"),
        GENERAL_REVIEW_URL(3, "generalReviewUrl"),
        BOOK_IDS(4, a.f.C0247a.f16190b);

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
                return NEW_STUDY_URL;
            }
            if (fieldId == 2) {
                return REVIEW_URL;
            }
            if (fieldId == 3) {
                return GENERAL_REVIEW_URL;
            }
            if (fieldId != 4) {
                return null;
            }
            return BOOK_IDS;
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
        hashMap.put(StandardScheme.class, new ExtraInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new ExtraInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.NEW_STUDY_URL, (_Fields) new FieldMetaData("newStudyUrl", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.REVIEW_URL, (_Fields) new FieldMetaData("reviewUrl", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.GENERAL_REVIEW_URL, (_Fields) new FieldMetaData("generalReviewUrl", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.BOOK_IDS, (_Fields) new FieldMetaData(a.f.C0247a.f16190b, (byte) 1, new ListMetaData((byte) 15, new FieldValueMetaData((byte) 8))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(ExtraInfo.class, unmodifiableMap);
    }

    public ExtraInfo() {
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

    public void addToBook_ids(int elem) {
        if (this.book_ids == null) {
            this.book_ids = new ArrayList();
        }
        this.book_ids.add(Integer.valueOf(elem));
    }

    @Override // org.apache.thrift.TBase
    public void clear() {
        this.newStudyUrl = null;
        this.reviewUrl = null;
        this.generalReviewUrl = null;
        this.book_ids = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof ExtraInfo)) {
            return equals((ExtraInfo) that);
        }
        return false;
    }

    public List<Integer> getBook_ids() {
        return this.book_ids;
    }

    public Iterator<Integer> getBook_idsIterator() {
        List<Integer> list = this.book_ids;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getBook_idsSize() {
        List<Integer> list = this.book_ids;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public String getGeneralReviewUrl() {
        return this.generalReviewUrl;
    }

    public String getNewStudyUrl() {
        return this.newStudyUrl;
    }

    public String getReviewUrl() {
        return this.reviewUrl;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetBook_ids() {
        return this.book_ids != null;
    }

    public boolean isSetGeneralReviewUrl() {
        return this.generalReviewUrl != null;
    }

    public boolean isSetNewStudyUrl() {
        return this.newStudyUrl != null;
    }

    public boolean isSetReviewUrl() {
        return this.reviewUrl != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public ExtraInfo setBook_ids(List<Integer> book_ids) {
        this.book_ids = book_ids;
        return this;
    }

    public void setBook_idsIsSet(boolean value) {
        if (value) {
            return;
        }
        this.book_ids = null;
    }

    public ExtraInfo setGeneralReviewUrl(String generalReviewUrl) {
        this.generalReviewUrl = generalReviewUrl;
        return this;
    }

    public void setGeneralReviewUrlIsSet(boolean value) {
        if (value) {
            return;
        }
        this.generalReviewUrl = null;
    }

    public ExtraInfo setNewStudyUrl(String newStudyUrl) {
        this.newStudyUrl = newStudyUrl;
        return this;
    }

    public void setNewStudyUrlIsSet(boolean value) {
        if (value) {
            return;
        }
        this.newStudyUrl = null;
    }

    public ExtraInfo setReviewUrl(String reviewUrl) {
        this.reviewUrl = reviewUrl;
        return this;
    }

    public void setReviewUrlIsSet(boolean value) {
        if (value) {
            return;
        }
        this.reviewUrl = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ExtraInfo(");
        sb2.append("newStudyUrl:");
        String str = this.newStudyUrl;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("reviewUrl:");
        String str2 = this.reviewUrl;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(str2);
        }
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("generalReviewUrl:");
        String str3 = this.generalReviewUrl;
        if (str3 == null) {
            sb2.append("null");
        } else {
            sb2.append(str3);
        }
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("book_ids:");
        List<Integer> list = this.book_ids;
        if (list == null) {
            sb2.append("null");
        } else {
            sb2.append(list);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetBook_ids() {
        this.book_ids = null;
    }

    public void unsetGeneralReviewUrl() {
        this.generalReviewUrl = null;
    }

    public void unsetNewStudyUrl() {
        this.newStudyUrl = null;
    }

    public void unsetReviewUrl() {
        this.reviewUrl = null;
    }

    public void validate() throws TException {
        if (this.newStudyUrl == null) {
            throw new TProtocolException("Required field 'newStudyUrl' was not present! Struct: " + toString());
        }
        if (this.reviewUrl == null) {
            throw new TProtocolException("Required field 'reviewUrl' was not present! Struct: " + toString());
        }
        if (this.generalReviewUrl == null) {
            throw new TProtocolException("Required field 'generalReviewUrl' was not present! Struct: " + toString());
        }
        if (this.book_ids != null) {
            return;
        }
        throw new TProtocolException("Required field 'book_ids' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    public ExtraInfo(String newStudyUrl, String reviewUrl, String generalReviewUrl, List<Integer> book_ids) {
        this();
        this.newStudyUrl = newStudyUrl;
        this.reviewUrl = reviewUrl;
        this.generalReviewUrl = generalReviewUrl;
        this.book_ids = book_ids;
    }

    @Override // java.lang.Comparable
    public int compareTo(ExtraInfo other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo5 = Boolean.valueOf(isSetNewStudyUrl()).compareTo(Boolean.valueOf(other.isSetNewStudyUrl()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (isSetNewStudyUrl() && (compareTo4 = TBaseHelper.compareTo(this.newStudyUrl, other.newStudyUrl)) != 0) {
            return compareTo4;
        }
        int compareTo6 = Boolean.valueOf(isSetReviewUrl()).compareTo(Boolean.valueOf(other.isSetReviewUrl()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (isSetReviewUrl() && (compareTo3 = TBaseHelper.compareTo(this.reviewUrl, other.reviewUrl)) != 0) {
            return compareTo3;
        }
        int compareTo7 = Boolean.valueOf(isSetGeneralReviewUrl()).compareTo(Boolean.valueOf(other.isSetGeneralReviewUrl()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (isSetGeneralReviewUrl() && (compareTo2 = TBaseHelper.compareTo(this.generalReviewUrl, other.generalReviewUrl)) != 0) {
            return compareTo2;
        }
        int compareTo8 = Boolean.valueOf(isSetBook_ids()).compareTo(Boolean.valueOf(other.isSetBook_ids()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (!isSetBook_ids() || (compareTo = TBaseHelper.compareTo((List) this.book_ids, (List) other.book_ids)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<ExtraInfo, _Fields> deepCopy2() {
        return new ExtraInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$ExtraInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return getNewStudyUrl();
        }
        if (i11 == 2) {
            return getReviewUrl();
        }
        if (i11 == 3) {
            return getGeneralReviewUrl();
        }
        if (i11 == 4) {
            return getBook_ids();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$ExtraInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetNewStudyUrl();
        }
        if (i11 == 2) {
            return isSetReviewUrl();
        }
        if (i11 == 3) {
            return isSetGeneralReviewUrl();
        }
        if (i11 == 4) {
            return isSetBook_ids();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$ExtraInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetNewStudyUrl();
                return;
            } else {
                setNewStudyUrl((String) value);
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetReviewUrl();
                return;
            } else {
                setReviewUrl((String) value);
                return;
            }
        }
        if (i11 == 3) {
            if (value == null) {
                unsetGeneralReviewUrl();
                return;
            } else {
                setGeneralReviewUrl((String) value);
                return;
            }
        }
        if (i11 != 4) {
            return;
        }
        if (value == null) {
            unsetBook_ids();
        } else {
            setBook_ids((List) value);
        }
    }

    public boolean equals(ExtraInfo that) {
        if (that == null) {
            return false;
        }
        boolean isSetNewStudyUrl = isSetNewStudyUrl();
        boolean isSetNewStudyUrl2 = that.isSetNewStudyUrl();
        if ((isSetNewStudyUrl || isSetNewStudyUrl2) && !(isSetNewStudyUrl && isSetNewStudyUrl2 && this.newStudyUrl.equals(that.newStudyUrl))) {
            return false;
        }
        boolean isSetReviewUrl = isSetReviewUrl();
        boolean isSetReviewUrl2 = that.isSetReviewUrl();
        if ((isSetReviewUrl || isSetReviewUrl2) && !(isSetReviewUrl && isSetReviewUrl2 && this.reviewUrl.equals(that.reviewUrl))) {
            return false;
        }
        boolean isSetGeneralReviewUrl = isSetGeneralReviewUrl();
        boolean isSetGeneralReviewUrl2 = that.isSetGeneralReviewUrl();
        if ((isSetGeneralReviewUrl || isSetGeneralReviewUrl2) && !(isSetGeneralReviewUrl && isSetGeneralReviewUrl2 && this.generalReviewUrl.equals(that.generalReviewUrl))) {
            return false;
        }
        boolean isSetBook_ids = isSetBook_ids();
        boolean isSetBook_ids2 = that.isSetBook_ids();
        if (isSetBook_ids || isSetBook_ids2) {
            return isSetBook_ids && isSetBook_ids2 && this.book_ids.equals(that.book_ids);
        }
        return true;
    }

    public ExtraInfo(ExtraInfo other) {
        if (other.isSetNewStudyUrl()) {
            this.newStudyUrl = other.newStudyUrl;
        }
        if (other.isSetReviewUrl()) {
            this.reviewUrl = other.reviewUrl;
        }
        if (other.isSetGeneralReviewUrl()) {
            this.generalReviewUrl = other.generalReviewUrl;
        }
        if (other.isSetBook_ids()) {
            this.book_ids = new ArrayList(other.book_ids);
        }
    }
}

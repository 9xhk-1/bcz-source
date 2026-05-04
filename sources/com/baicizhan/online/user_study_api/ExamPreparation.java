package com.baicizhan.online.user_study_api;

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

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class ExamPreparation implements TBase<ExamPreparation, _Fields>, Serializable, Cloneable, Comparable<ExamPreparation> {
    private static final int __USERTYPE_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public String generalReviewUrl;
    public String newStudyUrl;
    public String questionnaireUrl;
    public String reviewUrl;
    public int userType;
    private static final TStruct STRUCT_DESC = new TStruct("ExamPreparation");
    private static final TField USER_TYPE_FIELD_DESC = new TField("userType", (byte) 8, 1);
    private static final TField QUESTIONNAIRE_URL_FIELD_DESC = new TField("questionnaireUrl", (byte) 11, 2);
    private static final TField NEW_STUDY_URL_FIELD_DESC = new TField("newStudyUrl", (byte) 11, 3);
    private static final TField REVIEW_URL_FIELD_DESC = new TField("reviewUrl", (byte) 11, 4);
    private static final TField GENERAL_REVIEW_URL_FIELD_DESC = new TField("generalReviewUrl", (byte) 11, 5);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.user_study_api.ExamPreparation$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_study_api$ExamPreparation$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$user_study_api$ExamPreparation$_Fields = iArr;
            try {
                iArr[_Fields.USER_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$ExamPreparation$_Fields[_Fields.QUESTIONNAIRE_URL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$ExamPreparation$_Fields[_Fields.NEW_STUDY_URL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$ExamPreparation$_Fields[_Fields.REVIEW_URL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$ExamPreparation$_Fields[_Fields.GENERAL_REVIEW_URL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ExamPreparationStandardScheme extends StandardScheme<ExamPreparation> {
        private ExamPreparationStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, ExamPreparation struct) throws TException {
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
                                if (s11 != 5) {
                                    TProtocolUtil.skip(iprot, b11);
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
                    } else if (b11 == 11) {
                        struct.questionnaireUrl = iprot.readString();
                        struct.setQuestionnaireUrlIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 8) {
                    struct.userType = iprot.readI32();
                    struct.setUserTypeIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (struct.isSetUserType()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'userType' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, ExamPreparation struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(ExamPreparation.STRUCT_DESC);
            oprot.writeFieldBegin(ExamPreparation.USER_TYPE_FIELD_DESC);
            oprot.writeI32(struct.userType);
            oprot.writeFieldEnd();
            if (struct.questionnaireUrl != null) {
                oprot.writeFieldBegin(ExamPreparation.QUESTIONNAIRE_URL_FIELD_DESC);
                oprot.writeString(struct.questionnaireUrl);
                oprot.writeFieldEnd();
            }
            if (struct.newStudyUrl != null) {
                oprot.writeFieldBegin(ExamPreparation.NEW_STUDY_URL_FIELD_DESC);
                oprot.writeString(struct.newStudyUrl);
                oprot.writeFieldEnd();
            }
            if (struct.reviewUrl != null) {
                oprot.writeFieldBegin(ExamPreparation.REVIEW_URL_FIELD_DESC);
                oprot.writeString(struct.reviewUrl);
                oprot.writeFieldEnd();
            }
            if (struct.generalReviewUrl != null) {
                oprot.writeFieldBegin(ExamPreparation.GENERAL_REVIEW_URL_FIELD_DESC);
                oprot.writeString(struct.generalReviewUrl);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ExamPreparationStandardSchemeFactory implements SchemeFactory {
        private ExamPreparationStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public ExamPreparationStandardScheme getScheme() {
            return new ExamPreparationStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ExamPreparationTupleScheme extends TupleScheme<ExamPreparation> {
        private ExamPreparationTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, ExamPreparation struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.userType = tTupleProtocol.readI32();
            struct.setUserTypeIsSet(true);
            struct.questionnaireUrl = tTupleProtocol.readString();
            struct.setQuestionnaireUrlIsSet(true);
            struct.newStudyUrl = tTupleProtocol.readString();
            struct.setNewStudyUrlIsSet(true);
            struct.reviewUrl = tTupleProtocol.readString();
            struct.setReviewUrlIsSet(true);
            struct.generalReviewUrl = tTupleProtocol.readString();
            struct.setGeneralReviewUrlIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, ExamPreparation struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.userType);
            tTupleProtocol.writeString(struct.questionnaireUrl);
            tTupleProtocol.writeString(struct.newStudyUrl);
            tTupleProtocol.writeString(struct.reviewUrl);
            tTupleProtocol.writeString(struct.generalReviewUrl);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ExamPreparationTupleSchemeFactory implements SchemeFactory {
        private ExamPreparationTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public ExamPreparationTupleScheme getScheme() {
            return new ExamPreparationTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        USER_TYPE(1, "userType"),
        QUESTIONNAIRE_URL(2, "questionnaireUrl"),
        NEW_STUDY_URL(3, "newStudyUrl"),
        REVIEW_URL(4, "reviewUrl"),
        GENERAL_REVIEW_URL(5, "generalReviewUrl");

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
                return USER_TYPE;
            }
            if (fieldId == 2) {
                return QUESTIONNAIRE_URL;
            }
            if (fieldId == 3) {
                return NEW_STUDY_URL;
            }
            if (fieldId == 4) {
                return REVIEW_URL;
            }
            if (fieldId != 5) {
                return null;
            }
            return GENERAL_REVIEW_URL;
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
        hashMap.put(StandardScheme.class, new ExamPreparationStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new ExamPreparationTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.USER_TYPE, (_Fields) new FieldMetaData("userType", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.QUESTIONNAIRE_URL, (_Fields) new FieldMetaData("questionnaireUrl", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.NEW_STUDY_URL, (_Fields) new FieldMetaData("newStudyUrl", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.REVIEW_URL, (_Fields) new FieldMetaData("reviewUrl", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.GENERAL_REVIEW_URL, (_Fields) new FieldMetaData("generalReviewUrl", (byte) 1, new FieldValueMetaData((byte) 11)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(ExamPreparation.class, unmodifiableMap);
    }

    public ExamPreparation() {
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
        setUserTypeIsSet(false);
        this.userType = 0;
        this.questionnaireUrl = null;
        this.newStudyUrl = null;
        this.reviewUrl = null;
        this.generalReviewUrl = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof ExamPreparation)) {
            return equals((ExamPreparation) that);
        }
        return false;
    }

    public String getGeneralReviewUrl() {
        return this.generalReviewUrl;
    }

    public String getNewStudyUrl() {
        return this.newStudyUrl;
    }

    public String getQuestionnaireUrl() {
        return this.questionnaireUrl;
    }

    public String getReviewUrl() {
        return this.reviewUrl;
    }

    public int getUserType() {
        return this.userType;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetGeneralReviewUrl() {
        return this.generalReviewUrl != null;
    }

    public boolean isSetNewStudyUrl() {
        return this.newStudyUrl != null;
    }

    public boolean isSetQuestionnaireUrl() {
        return this.questionnaireUrl != null;
    }

    public boolean isSetReviewUrl() {
        return this.reviewUrl != null;
    }

    public boolean isSetUserType() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public ExamPreparation setGeneralReviewUrl(String generalReviewUrl) {
        this.generalReviewUrl = generalReviewUrl;
        return this;
    }

    public void setGeneralReviewUrlIsSet(boolean value) {
        if (value) {
            return;
        }
        this.generalReviewUrl = null;
    }

    public ExamPreparation setNewStudyUrl(String newStudyUrl) {
        this.newStudyUrl = newStudyUrl;
        return this;
    }

    public void setNewStudyUrlIsSet(boolean value) {
        if (value) {
            return;
        }
        this.newStudyUrl = null;
    }

    public ExamPreparation setQuestionnaireUrl(String questionnaireUrl) {
        this.questionnaireUrl = questionnaireUrl;
        return this;
    }

    public void setQuestionnaireUrlIsSet(boolean value) {
        if (value) {
            return;
        }
        this.questionnaireUrl = null;
    }

    public ExamPreparation setReviewUrl(String reviewUrl) {
        this.reviewUrl = reviewUrl;
        return this;
    }

    public void setReviewUrlIsSet(boolean value) {
        if (value) {
            return;
        }
        this.reviewUrl = null;
    }

    public ExamPreparation setUserType(int userType) {
        this.userType = userType;
        setUserTypeIsSet(true);
        return this;
    }

    public void setUserTypeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ExamPreparation(");
        sb2.append("userType:");
        sb2.append(this.userType);
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("questionnaireUrl:");
        String str = this.questionnaireUrl;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("newStudyUrl:");
        String str2 = this.newStudyUrl;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(str2);
        }
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("reviewUrl:");
        String str3 = this.reviewUrl;
        if (str3 == null) {
            sb2.append("null");
        } else {
            sb2.append(str3);
        }
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("generalReviewUrl:");
        String str4 = this.generalReviewUrl;
        if (str4 == null) {
            sb2.append("null");
        } else {
            sb2.append(str4);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetGeneralReviewUrl() {
        this.generalReviewUrl = null;
    }

    public void unsetNewStudyUrl() {
        this.newStudyUrl = null;
    }

    public void unsetQuestionnaireUrl() {
        this.questionnaireUrl = null;
    }

    public void unsetReviewUrl() {
        this.reviewUrl = null;
    }

    public void unsetUserType() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void validate() throws TException {
        if (this.questionnaireUrl == null) {
            throw new TProtocolException("Required field 'questionnaireUrl' was not present! Struct: " + toString());
        }
        if (this.newStudyUrl == null) {
            throw new TProtocolException("Required field 'newStudyUrl' was not present! Struct: " + toString());
        }
        if (this.reviewUrl == null) {
            throw new TProtocolException("Required field 'reviewUrl' was not present! Struct: " + toString());
        }
        if (this.generalReviewUrl != null) {
            return;
        }
        throw new TProtocolException("Required field 'generalReviewUrl' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(ExamPreparation other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        int compareTo5;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo6 = Boolean.valueOf(isSetUserType()).compareTo(Boolean.valueOf(other.isSetUserType()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (isSetUserType() && (compareTo5 = TBaseHelper.compareTo(this.userType, other.userType)) != 0) {
            return compareTo5;
        }
        int compareTo7 = Boolean.valueOf(isSetQuestionnaireUrl()).compareTo(Boolean.valueOf(other.isSetQuestionnaireUrl()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (isSetQuestionnaireUrl() && (compareTo4 = TBaseHelper.compareTo(this.questionnaireUrl, other.questionnaireUrl)) != 0) {
            return compareTo4;
        }
        int compareTo8 = Boolean.valueOf(isSetNewStudyUrl()).compareTo(Boolean.valueOf(other.isSetNewStudyUrl()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (isSetNewStudyUrl() && (compareTo3 = TBaseHelper.compareTo(this.newStudyUrl, other.newStudyUrl)) != 0) {
            return compareTo3;
        }
        int compareTo9 = Boolean.valueOf(isSetReviewUrl()).compareTo(Boolean.valueOf(other.isSetReviewUrl()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (isSetReviewUrl() && (compareTo2 = TBaseHelper.compareTo(this.reviewUrl, other.reviewUrl)) != 0) {
            return compareTo2;
        }
        int compareTo10 = Boolean.valueOf(isSetGeneralReviewUrl()).compareTo(Boolean.valueOf(other.isSetGeneralReviewUrl()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (!isSetGeneralReviewUrl() || (compareTo = TBaseHelper.compareTo(this.generalReviewUrl, other.generalReviewUrl)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<ExamPreparation, _Fields> deepCopy2() {
        return new ExamPreparation(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$ExamPreparation$_Fields[field.ordinal()];
        if (i11 == 1) {
            return Integer.valueOf(getUserType());
        }
        if (i11 == 2) {
            return getQuestionnaireUrl();
        }
        if (i11 == 3) {
            return getNewStudyUrl();
        }
        if (i11 == 4) {
            return getReviewUrl();
        }
        if (i11 == 5) {
            return getGeneralReviewUrl();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$ExamPreparation$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetUserType();
        }
        if (i11 == 2) {
            return isSetQuestionnaireUrl();
        }
        if (i11 == 3) {
            return isSetNewStudyUrl();
        }
        if (i11 == 4) {
            return isSetReviewUrl();
        }
        if (i11 == 5) {
            return isSetGeneralReviewUrl();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$ExamPreparation$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetUserType();
                return;
            } else {
                setUserType(((Integer) value).intValue());
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetQuestionnaireUrl();
                return;
            } else {
                setQuestionnaireUrl((String) value);
                return;
            }
        }
        if (i11 == 3) {
            if (value == null) {
                unsetNewStudyUrl();
                return;
            } else {
                setNewStudyUrl((String) value);
                return;
            }
        }
        if (i11 == 4) {
            if (value == null) {
                unsetReviewUrl();
                return;
            } else {
                setReviewUrl((String) value);
                return;
            }
        }
        if (i11 != 5) {
            return;
        }
        if (value == null) {
            unsetGeneralReviewUrl();
        } else {
            setGeneralReviewUrl((String) value);
        }
    }

    public ExamPreparation(int userType, String questionnaireUrl, String newStudyUrl, String reviewUrl, String generalReviewUrl) {
        this();
        this.userType = userType;
        setUserTypeIsSet(true);
        this.questionnaireUrl = questionnaireUrl;
        this.newStudyUrl = newStudyUrl;
        this.reviewUrl = reviewUrl;
        this.generalReviewUrl = generalReviewUrl;
    }

    public boolean equals(ExamPreparation that) {
        if (that == null || this.userType != that.userType) {
            return false;
        }
        boolean isSetQuestionnaireUrl = isSetQuestionnaireUrl();
        boolean isSetQuestionnaireUrl2 = that.isSetQuestionnaireUrl();
        if ((isSetQuestionnaireUrl || isSetQuestionnaireUrl2) && !(isSetQuestionnaireUrl && isSetQuestionnaireUrl2 && this.questionnaireUrl.equals(that.questionnaireUrl))) {
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
        if (isSetGeneralReviewUrl || isSetGeneralReviewUrl2) {
            return isSetGeneralReviewUrl && isSetGeneralReviewUrl2 && this.generalReviewUrl.equals(that.generalReviewUrl);
        }
        return true;
    }

    public ExamPreparation(ExamPreparation other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        this.userType = other.userType;
        if (other.isSetQuestionnaireUrl()) {
            this.questionnaireUrl = other.questionnaireUrl;
        }
        if (other.isSetNewStudyUrl()) {
            this.newStudyUrl = other.newStudyUrl;
        }
        if (other.isSetReviewUrl()) {
            this.reviewUrl = other.reviewUrl;
        }
        if (other.isSetGeneralReviewUrl()) {
            this.generalReviewUrl = other.generalReviewUrl;
        }
    }
}

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
import org.apache.thrift.TBase;
import org.apache.thrift.TBaseHelper;
import org.apache.thrift.TException;
import org.apache.thrift.TFieldIdEnum;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.StructMetaData;
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
public class StudyHome implements TBase<StudyHome, _Fields>, Serializable, Cloneable, Comparable<StudyHome> {
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    public HomeButton learning_button;
    public StudyHomeProgress progress;
    public HomeButton review_button;
    public StudyHomeToday today_progresss;
    private static final TStruct STRUCT_DESC = new TStruct("StudyHome");
    private static final TField PROGRESS_FIELD_DESC = new TField("progress", (byte) 12, 1);
    private static final TField TODAY_PROGRESSS_FIELD_DESC = new TField("today_progresss", (byte) 12, 2);
    private static final TField LEARNING_BUTTON_FIELD_DESC = new TField("learning_button", (byte) 12, 3);
    private static final TField REVIEW_BUTTON_FIELD_DESC = new TField("review_button", (byte) 12, 4);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.user_study_api.StudyHome$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_study_api$StudyHome$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$user_study_api$StudyHome$_Fields = iArr;
            try {
                iArr[_Fields.PROGRESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$StudyHome$_Fields[_Fields.TODAY_PROGRESSS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$StudyHome$_Fields[_Fields.LEARNING_BUTTON.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$StudyHome$_Fields[_Fields.REVIEW_BUTTON.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class StudyHomeStandardScheme extends StandardScheme<StudyHome> {
        private StudyHomeStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, StudyHome struct) throws TException {
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
                            } else if (b11 == 12) {
                                HomeButton homeButton = new HomeButton();
                                struct.review_button = homeButton;
                                homeButton.read(iprot);
                                struct.setReview_buttonIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 12) {
                            HomeButton homeButton2 = new HomeButton();
                            struct.learning_button = homeButton2;
                            homeButton2.read(iprot);
                            struct.setLearning_buttonIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 12) {
                        StudyHomeToday studyHomeToday = new StudyHomeToday();
                        struct.today_progresss = studyHomeToday;
                        studyHomeToday.read(iprot);
                        struct.setToday_progresssIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 12) {
                    StudyHomeProgress studyHomeProgress = new StudyHomeProgress();
                    struct.progress = studyHomeProgress;
                    studyHomeProgress.read(iprot);
                    struct.setProgressIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, StudyHome struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(StudyHome.STRUCT_DESC);
            if (struct.progress != null) {
                oprot.writeFieldBegin(StudyHome.PROGRESS_FIELD_DESC);
                struct.progress.write(oprot);
                oprot.writeFieldEnd();
            }
            if (struct.today_progresss != null) {
                oprot.writeFieldBegin(StudyHome.TODAY_PROGRESSS_FIELD_DESC);
                struct.today_progresss.write(oprot);
                oprot.writeFieldEnd();
            }
            if (struct.learning_button != null) {
                oprot.writeFieldBegin(StudyHome.LEARNING_BUTTON_FIELD_DESC);
                struct.learning_button.write(oprot);
                oprot.writeFieldEnd();
            }
            if (struct.review_button != null) {
                oprot.writeFieldBegin(StudyHome.REVIEW_BUTTON_FIELD_DESC);
                struct.review_button.write(oprot);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class StudyHomeStandardSchemeFactory implements SchemeFactory {
        private StudyHomeStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public StudyHomeStandardScheme getScheme() {
            return new StudyHomeStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class StudyHomeTupleScheme extends TupleScheme<StudyHome> {
        private StudyHomeTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, StudyHome struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            StudyHomeProgress studyHomeProgress = new StudyHomeProgress();
            struct.progress = studyHomeProgress;
            studyHomeProgress.read(tTupleProtocol);
            struct.setProgressIsSet(true);
            StudyHomeToday studyHomeToday = new StudyHomeToday();
            struct.today_progresss = studyHomeToday;
            studyHomeToday.read(tTupleProtocol);
            struct.setToday_progresssIsSet(true);
            HomeButton homeButton = new HomeButton();
            struct.learning_button = homeButton;
            homeButton.read(tTupleProtocol);
            struct.setLearning_buttonIsSet(true);
            HomeButton homeButton2 = new HomeButton();
            struct.review_button = homeButton2;
            homeButton2.read(tTupleProtocol);
            struct.setReview_buttonIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, StudyHome struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.progress.write(tTupleProtocol);
            struct.today_progresss.write(tTupleProtocol);
            struct.learning_button.write(tTupleProtocol);
            struct.review_button.write(tTupleProtocol);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class StudyHomeTupleSchemeFactory implements SchemeFactory {
        private StudyHomeTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public StudyHomeTupleScheme getScheme() {
            return new StudyHomeTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        PROGRESS(1, "progress"),
        TODAY_PROGRESSS(2, "today_progresss"),
        LEARNING_BUTTON(3, "learning_button"),
        REVIEW_BUTTON(4, "review_button");

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
                return PROGRESS;
            }
            if (fieldId == 2) {
                return TODAY_PROGRESSS;
            }
            if (fieldId == 3) {
                return LEARNING_BUTTON;
            }
            if (fieldId != 4) {
                return null;
            }
            return REVIEW_BUTTON;
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
        hashMap.put(StandardScheme.class, new StudyHomeStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new StudyHomeTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.PROGRESS, (_Fields) new FieldMetaData("progress", (byte) 1, new StructMetaData((byte) 12, StudyHomeProgress.class)));
        enumMap.put((EnumMap) _Fields.TODAY_PROGRESSS, (_Fields) new FieldMetaData("today_progresss", (byte) 1, new StructMetaData((byte) 12, StudyHomeToday.class)));
        enumMap.put((EnumMap) _Fields.LEARNING_BUTTON, (_Fields) new FieldMetaData("learning_button", (byte) 1, new StructMetaData((byte) 12, HomeButton.class)));
        enumMap.put((EnumMap) _Fields.REVIEW_BUTTON, (_Fields) new FieldMetaData("review_button", (byte) 1, new StructMetaData((byte) 12, HomeButton.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(StudyHome.class, unmodifiableMap);
    }

    public StudyHome() {
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
        this.progress = null;
        this.today_progresss = null;
        this.learning_button = null;
        this.review_button = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof StudyHome)) {
            return equals((StudyHome) that);
        }
        return false;
    }

    public HomeButton getLearning_button() {
        return this.learning_button;
    }

    public StudyHomeProgress getProgress() {
        return this.progress;
    }

    public HomeButton getReview_button() {
        return this.review_button;
    }

    public StudyHomeToday getToday_progresss() {
        return this.today_progresss;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetLearning_button() {
        return this.learning_button != null;
    }

    public boolean isSetProgress() {
        return this.progress != null;
    }

    public boolean isSetReview_button() {
        return this.review_button != null;
    }

    public boolean isSetToday_progresss() {
        return this.today_progresss != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public StudyHome setLearning_button(HomeButton learning_button) {
        this.learning_button = learning_button;
        return this;
    }

    public void setLearning_buttonIsSet(boolean value) {
        if (value) {
            return;
        }
        this.learning_button = null;
    }

    public StudyHome setProgress(StudyHomeProgress progress) {
        this.progress = progress;
        return this;
    }

    public void setProgressIsSet(boolean value) {
        if (value) {
            return;
        }
        this.progress = null;
    }

    public StudyHome setReview_button(HomeButton review_button) {
        this.review_button = review_button;
        return this;
    }

    public void setReview_buttonIsSet(boolean value) {
        if (value) {
            return;
        }
        this.review_button = null;
    }

    public StudyHome setToday_progresss(StudyHomeToday today_progresss) {
        this.today_progresss = today_progresss;
        return this;
    }

    public void setToday_progresssIsSet(boolean value) {
        if (value) {
            return;
        }
        this.today_progresss = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("StudyHome(");
        sb2.append("progress:");
        StudyHomeProgress studyHomeProgress = this.progress;
        if (studyHomeProgress == null) {
            sb2.append("null");
        } else {
            sb2.append(studyHomeProgress);
        }
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("today_progresss:");
        StudyHomeToday studyHomeToday = this.today_progresss;
        if (studyHomeToday == null) {
            sb2.append("null");
        } else {
            sb2.append(studyHomeToday);
        }
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("learning_button:");
        HomeButton homeButton = this.learning_button;
        if (homeButton == null) {
            sb2.append("null");
        } else {
            sb2.append(homeButton);
        }
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("review_button:");
        HomeButton homeButton2 = this.review_button;
        if (homeButton2 == null) {
            sb2.append("null");
        } else {
            sb2.append(homeButton2);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetLearning_button() {
        this.learning_button = null;
    }

    public void unsetProgress() {
        this.progress = null;
    }

    public void unsetReview_button() {
        this.review_button = null;
    }

    public void unsetToday_progresss() {
        this.today_progresss = null;
    }

    public void validate() throws TException {
        StudyHomeProgress studyHomeProgress = this.progress;
        if (studyHomeProgress == null) {
            throw new TProtocolException("Required field 'progress' was not present! Struct: " + toString());
        }
        if (this.today_progresss == null) {
            throw new TProtocolException("Required field 'today_progresss' was not present! Struct: " + toString());
        }
        if (this.learning_button == null) {
            throw new TProtocolException("Required field 'learning_button' was not present! Struct: " + toString());
        }
        if (this.review_button == null) {
            throw new TProtocolException("Required field 'review_button' was not present! Struct: " + toString());
        }
        if (studyHomeProgress != null) {
            studyHomeProgress.validate();
        }
        StudyHomeToday studyHomeToday = this.today_progresss;
        if (studyHomeToday != null) {
            studyHomeToday.validate();
        }
        HomeButton homeButton = this.learning_button;
        if (homeButton != null) {
            homeButton.validate();
        }
        HomeButton homeButton2 = this.review_button;
        if (homeButton2 != null) {
            homeButton2.validate();
        }
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    public StudyHome(StudyHomeProgress progress, StudyHomeToday today_progresss, HomeButton learning_button, HomeButton review_button) {
        this();
        this.progress = progress;
        this.today_progresss = today_progresss;
        this.learning_button = learning_button;
        this.review_button = review_button;
    }

    @Override // java.lang.Comparable
    public int compareTo(StudyHome other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo5 = Boolean.valueOf(isSetProgress()).compareTo(Boolean.valueOf(other.isSetProgress()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (isSetProgress() && (compareTo4 = TBaseHelper.compareTo((Comparable) this.progress, (Comparable) other.progress)) != 0) {
            return compareTo4;
        }
        int compareTo6 = Boolean.valueOf(isSetToday_progresss()).compareTo(Boolean.valueOf(other.isSetToday_progresss()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (isSetToday_progresss() && (compareTo3 = TBaseHelper.compareTo((Comparable) this.today_progresss, (Comparable) other.today_progresss)) != 0) {
            return compareTo3;
        }
        int compareTo7 = Boolean.valueOf(isSetLearning_button()).compareTo(Boolean.valueOf(other.isSetLearning_button()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (isSetLearning_button() && (compareTo2 = TBaseHelper.compareTo((Comparable) this.learning_button, (Comparable) other.learning_button)) != 0) {
            return compareTo2;
        }
        int compareTo8 = Boolean.valueOf(isSetReview_button()).compareTo(Boolean.valueOf(other.isSetReview_button()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (!isSetReview_button() || (compareTo = TBaseHelper.compareTo((Comparable) this.review_button, (Comparable) other.review_button)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<StudyHome, _Fields> deepCopy2() {
        return new StudyHome(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$StudyHome$_Fields[field.ordinal()];
        if (i11 == 1) {
            return getProgress();
        }
        if (i11 == 2) {
            return getToday_progresss();
        }
        if (i11 == 3) {
            return getLearning_button();
        }
        if (i11 == 4) {
            return getReview_button();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$StudyHome$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetProgress();
        }
        if (i11 == 2) {
            return isSetToday_progresss();
        }
        if (i11 == 3) {
            return isSetLearning_button();
        }
        if (i11 == 4) {
            return isSetReview_button();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$StudyHome$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetProgress();
                return;
            } else {
                setProgress((StudyHomeProgress) value);
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetToday_progresss();
                return;
            } else {
                setToday_progresss((StudyHomeToday) value);
                return;
            }
        }
        if (i11 == 3) {
            if (value == null) {
                unsetLearning_button();
                return;
            } else {
                setLearning_button((HomeButton) value);
                return;
            }
        }
        if (i11 != 4) {
            return;
        }
        if (value == null) {
            unsetReview_button();
        } else {
            setReview_button((HomeButton) value);
        }
    }

    public boolean equals(StudyHome that) {
        if (that == null) {
            return false;
        }
        boolean isSetProgress = isSetProgress();
        boolean isSetProgress2 = that.isSetProgress();
        if ((isSetProgress || isSetProgress2) && !(isSetProgress && isSetProgress2 && this.progress.equals(that.progress))) {
            return false;
        }
        boolean isSetToday_progresss = isSetToday_progresss();
        boolean isSetToday_progresss2 = that.isSetToday_progresss();
        if ((isSetToday_progresss || isSetToday_progresss2) && !(isSetToday_progresss && isSetToday_progresss2 && this.today_progresss.equals(that.today_progresss))) {
            return false;
        }
        boolean isSetLearning_button = isSetLearning_button();
        boolean isSetLearning_button2 = that.isSetLearning_button();
        if ((isSetLearning_button || isSetLearning_button2) && !(isSetLearning_button && isSetLearning_button2 && this.learning_button.equals(that.learning_button))) {
            return false;
        }
        boolean isSetReview_button = isSetReview_button();
        boolean isSetReview_button2 = that.isSetReview_button();
        if (isSetReview_button || isSetReview_button2) {
            return isSetReview_button && isSetReview_button2 && this.review_button.equals(that.review_button);
        }
        return true;
    }

    public StudyHome(StudyHome other) {
        if (other.isSetProgress()) {
            this.progress = new StudyHomeProgress(other.progress);
        }
        if (other.isSetToday_progresss()) {
            this.today_progresss = new StudyHomeToday(other.today_progresss);
        }
        if (other.isSetLearning_button()) {
            this.learning_button = new HomeButton(other.learning_button);
        }
        if (other.isSetReview_button()) {
            this.review_button = new HomeButton(other.review_button);
        }
    }
}

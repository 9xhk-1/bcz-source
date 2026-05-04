package com.baicizhan.online.game_api;

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

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class SentenceGameHome implements TBase<SentenceGameHome, _Fields>, Serializable, Cloneable, Comparable<SentenceGameHome> {
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    public SentenceBuildingProgress building_progress;
    public WordEnergyInfo energy_info;
    public SentenceLessonInfo lesson_info;
    private _Fields[] optionals;
    private static final TStruct STRUCT_DESC = new TStruct("SentenceGameHome");
    private static final TField ENERGY_INFO_FIELD_DESC = new TField("energy_info", (byte) 12, 1);
    private static final TField BUILDING_PROGRESS_FIELD_DESC = new TField("building_progress", (byte) 12, 2);
    private static final TField LESSON_INFO_FIELD_DESC = new TField("lesson_info", (byte) 12, 3);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.game_api.SentenceGameHome$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$game_api$SentenceGameHome$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$game_api$SentenceGameHome$_Fields = iArr;
            try {
                iArr[_Fields.ENERGY_INFO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$SentenceGameHome$_Fields[_Fields.BUILDING_PROGRESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$SentenceGameHome$_Fields[_Fields.LESSON_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SentenceGameHomeStandardScheme extends StandardScheme<SentenceGameHome> {
        private SentenceGameHomeStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, SentenceGameHome struct) throws TException {
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
                            TProtocolUtil.skip(iprot, b11);
                        } else if (b11 == 12) {
                            SentenceLessonInfo sentenceLessonInfo = new SentenceLessonInfo();
                            struct.lesson_info = sentenceLessonInfo;
                            sentenceLessonInfo.read(iprot);
                            struct.setLesson_infoIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 12) {
                        SentenceBuildingProgress sentenceBuildingProgress = new SentenceBuildingProgress();
                        struct.building_progress = sentenceBuildingProgress;
                        sentenceBuildingProgress.read(iprot);
                        struct.setBuilding_progressIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 12) {
                    WordEnergyInfo wordEnergyInfo = new WordEnergyInfo();
                    struct.energy_info = wordEnergyInfo;
                    wordEnergyInfo.read(iprot);
                    struct.setEnergy_infoIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, SentenceGameHome struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(SentenceGameHome.STRUCT_DESC);
            if (struct.energy_info != null) {
                oprot.writeFieldBegin(SentenceGameHome.ENERGY_INFO_FIELD_DESC);
                struct.energy_info.write(oprot);
                oprot.writeFieldEnd();
            }
            if (struct.building_progress != null) {
                oprot.writeFieldBegin(SentenceGameHome.BUILDING_PROGRESS_FIELD_DESC);
                struct.building_progress.write(oprot);
                oprot.writeFieldEnd();
            }
            if (struct.lesson_info != null && struct.isSetLesson_info()) {
                oprot.writeFieldBegin(SentenceGameHome.LESSON_INFO_FIELD_DESC);
                struct.lesson_info.write(oprot);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SentenceGameHomeStandardSchemeFactory implements SchemeFactory {
        private SentenceGameHomeStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public SentenceGameHomeStandardScheme getScheme() {
            return new SentenceGameHomeStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SentenceGameHomeTupleScheme extends TupleScheme<SentenceGameHome> {
        private SentenceGameHomeTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, SentenceGameHome struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            WordEnergyInfo wordEnergyInfo = new WordEnergyInfo();
            struct.energy_info = wordEnergyInfo;
            wordEnergyInfo.read(tTupleProtocol);
            struct.setEnergy_infoIsSet(true);
            SentenceBuildingProgress sentenceBuildingProgress = new SentenceBuildingProgress();
            struct.building_progress = sentenceBuildingProgress;
            sentenceBuildingProgress.read(tTupleProtocol);
            struct.setBuilding_progressIsSet(true);
            if (tTupleProtocol.readBitSet(1).get(0)) {
                SentenceLessonInfo sentenceLessonInfo = new SentenceLessonInfo();
                struct.lesson_info = sentenceLessonInfo;
                sentenceLessonInfo.read(tTupleProtocol);
                struct.setLesson_infoIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, SentenceGameHome struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.energy_info.write(tTupleProtocol);
            struct.building_progress.write(tTupleProtocol);
            BitSet bitSet = new BitSet();
            if (struct.isSetLesson_info()) {
                bitSet.set(0);
            }
            tTupleProtocol.writeBitSet(bitSet, 1);
            if (struct.isSetLesson_info()) {
                struct.lesson_info.write(tTupleProtocol);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SentenceGameHomeTupleSchemeFactory implements SchemeFactory {
        private SentenceGameHomeTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public SentenceGameHomeTupleScheme getScheme() {
            return new SentenceGameHomeTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        ENERGY_INFO(1, "energy_info"),
        BUILDING_PROGRESS(2, "building_progress"),
        LESSON_INFO(3, "lesson_info");

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
                return ENERGY_INFO;
            }
            if (fieldId == 2) {
                return BUILDING_PROGRESS;
            }
            if (fieldId != 3) {
                return null;
            }
            return LESSON_INFO;
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
        hashMap.put(StandardScheme.class, new SentenceGameHomeStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new SentenceGameHomeTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.ENERGY_INFO, (_Fields) new FieldMetaData("energy_info", (byte) 1, new StructMetaData((byte) 12, WordEnergyInfo.class)));
        enumMap.put((EnumMap) _Fields.BUILDING_PROGRESS, (_Fields) new FieldMetaData("building_progress", (byte) 1, new StructMetaData((byte) 12, SentenceBuildingProgress.class)));
        enumMap.put((EnumMap) _Fields.LESSON_INFO, (_Fields) new FieldMetaData("lesson_info", (byte) 2, new StructMetaData((byte) 12, SentenceLessonInfo.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(SentenceGameHome.class, unmodifiableMap);
    }

    public SentenceGameHome() {
        this.optionals = new _Fields[]{_Fields.LESSON_INFO};
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
        this.energy_info = null;
        this.building_progress = null;
        this.lesson_info = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof SentenceGameHome)) {
            return equals((SentenceGameHome) that);
        }
        return false;
    }

    public SentenceBuildingProgress getBuilding_progress() {
        return this.building_progress;
    }

    public WordEnergyInfo getEnergy_info() {
        return this.energy_info;
    }

    public SentenceLessonInfo getLesson_info() {
        return this.lesson_info;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetBuilding_progress() {
        return this.building_progress != null;
    }

    public boolean isSetEnergy_info() {
        return this.energy_info != null;
    }

    public boolean isSetLesson_info() {
        return this.lesson_info != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public SentenceGameHome setBuilding_progress(SentenceBuildingProgress building_progress) {
        this.building_progress = building_progress;
        return this;
    }

    public void setBuilding_progressIsSet(boolean value) {
        if (value) {
            return;
        }
        this.building_progress = null;
    }

    public SentenceGameHome setEnergy_info(WordEnergyInfo energy_info) {
        this.energy_info = energy_info;
        return this;
    }

    public void setEnergy_infoIsSet(boolean value) {
        if (value) {
            return;
        }
        this.energy_info = null;
    }

    public SentenceGameHome setLesson_info(SentenceLessonInfo lesson_info) {
        this.lesson_info = lesson_info;
        return this;
    }

    public void setLesson_infoIsSet(boolean value) {
        if (value) {
            return;
        }
        this.lesson_info = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("SentenceGameHome(");
        sb2.append("energy_info:");
        WordEnergyInfo wordEnergyInfo = this.energy_info;
        if (wordEnergyInfo == null) {
            sb2.append("null");
        } else {
            sb2.append(wordEnergyInfo);
        }
        sb2.append(j2.O);
        sb2.append("building_progress:");
        SentenceBuildingProgress sentenceBuildingProgress = this.building_progress;
        if (sentenceBuildingProgress == null) {
            sb2.append("null");
        } else {
            sb2.append(sentenceBuildingProgress);
        }
        if (isSetLesson_info()) {
            sb2.append(j2.O);
            sb2.append("lesson_info:");
            SentenceLessonInfo sentenceLessonInfo = this.lesson_info;
            if (sentenceLessonInfo == null) {
                sb2.append("null");
            } else {
                sb2.append(sentenceLessonInfo);
            }
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetBuilding_progress() {
        this.building_progress = null;
    }

    public void unsetEnergy_info() {
        this.energy_info = null;
    }

    public void unsetLesson_info() {
        this.lesson_info = null;
    }

    public void validate() throws TException {
        WordEnergyInfo wordEnergyInfo = this.energy_info;
        if (wordEnergyInfo == null) {
            throw new TProtocolException("Required field 'energy_info' was not present! Struct: " + toString());
        }
        if (this.building_progress == null) {
            throw new TProtocolException("Required field 'building_progress' was not present! Struct: " + toString());
        }
        if (wordEnergyInfo != null) {
            wordEnergyInfo.validate();
        }
        SentenceBuildingProgress sentenceBuildingProgress = this.building_progress;
        if (sentenceBuildingProgress != null) {
            sentenceBuildingProgress.validate();
        }
        SentenceLessonInfo sentenceLessonInfo = this.lesson_info;
        if (sentenceLessonInfo != null) {
            sentenceLessonInfo.validate();
        }
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(SentenceGameHome other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo4 = Boolean.valueOf(isSetEnergy_info()).compareTo(Boolean.valueOf(other.isSetEnergy_info()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (isSetEnergy_info() && (compareTo3 = TBaseHelper.compareTo((Comparable) this.energy_info, (Comparable) other.energy_info)) != 0) {
            return compareTo3;
        }
        int compareTo5 = Boolean.valueOf(isSetBuilding_progress()).compareTo(Boolean.valueOf(other.isSetBuilding_progress()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (isSetBuilding_progress() && (compareTo2 = TBaseHelper.compareTo((Comparable) this.building_progress, (Comparable) other.building_progress)) != 0) {
            return compareTo2;
        }
        int compareTo6 = Boolean.valueOf(isSetLesson_info()).compareTo(Boolean.valueOf(other.isSetLesson_info()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (!isSetLesson_info() || (compareTo = TBaseHelper.compareTo((Comparable) this.lesson_info, (Comparable) other.lesson_info)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<SentenceGameHome, _Fields> deepCopy2() {
        return new SentenceGameHome(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$SentenceGameHome$_Fields[field.ordinal()];
        if (i11 == 1) {
            return getEnergy_info();
        }
        if (i11 == 2) {
            return getBuilding_progress();
        }
        if (i11 == 3) {
            return getLesson_info();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$SentenceGameHome$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetEnergy_info();
        }
        if (i11 == 2) {
            return isSetBuilding_progress();
        }
        if (i11 == 3) {
            return isSetLesson_info();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$SentenceGameHome$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetEnergy_info();
                return;
            } else {
                setEnergy_info((WordEnergyInfo) value);
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetBuilding_progress();
                return;
            } else {
                setBuilding_progress((SentenceBuildingProgress) value);
                return;
            }
        }
        if (i11 != 3) {
            return;
        }
        if (value == null) {
            unsetLesson_info();
        } else {
            setLesson_info((SentenceLessonInfo) value);
        }
    }

    public SentenceGameHome(WordEnergyInfo energy_info, SentenceBuildingProgress building_progress) {
        this();
        this.energy_info = energy_info;
        this.building_progress = building_progress;
    }

    public boolean equals(SentenceGameHome that) {
        if (that == null) {
            return false;
        }
        boolean isSetEnergy_info = isSetEnergy_info();
        boolean isSetEnergy_info2 = that.isSetEnergy_info();
        if ((isSetEnergy_info || isSetEnergy_info2) && !(isSetEnergy_info && isSetEnergy_info2 && this.energy_info.equals(that.energy_info))) {
            return false;
        }
        boolean isSetBuilding_progress = isSetBuilding_progress();
        boolean isSetBuilding_progress2 = that.isSetBuilding_progress();
        if ((isSetBuilding_progress || isSetBuilding_progress2) && !(isSetBuilding_progress && isSetBuilding_progress2 && this.building_progress.equals(that.building_progress))) {
            return false;
        }
        boolean isSetLesson_info = isSetLesson_info();
        boolean isSetLesson_info2 = that.isSetLesson_info();
        if (isSetLesson_info || isSetLesson_info2) {
            return isSetLesson_info && isSetLesson_info2 && this.lesson_info.equals(that.lesson_info);
        }
        return true;
    }

    public SentenceGameHome(SentenceGameHome other) {
        this.optionals = new _Fields[]{_Fields.LESSON_INFO};
        if (other.isSetEnergy_info()) {
            this.energy_info = new WordEnergyInfo(other.energy_info);
        }
        if (other.isSetBuilding_progress()) {
            this.building_progress = new SentenceBuildingProgress(other.building_progress);
        }
        if (other.isSetLesson_info()) {
            this.lesson_info = new SentenceLessonInfo(other.lesson_info);
        }
    }
}

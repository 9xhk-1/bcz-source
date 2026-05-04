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
public class PrimarySchoolModeConfig implements TBase<PrimarySchoolModeConfig, _Fields>, Serializable, Cloneable, Comparable<PrimarySchoolModeConfig> {
    private static final int __HAS_DONE_FINAL_EXAM_ISSET_ID = 1;
    private static final int __STATE_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public String final_exam_link_button;
    public String final_exam_link_popup;
    public String final_exam_result_link;
    public String h5_link;
    public int has_done_final_exam;
    public int state;
    private static final TStruct STRUCT_DESC = new TStruct("PrimarySchoolModeConfig");
    private static final TField STATE_FIELD_DESC = new TField("state", (byte) 8, 1);
    private static final TField H5_LINK_FIELD_DESC = new TField("h5_link", (byte) 11, 2);
    private static final TField HAS_DONE_FINAL_EXAM_FIELD_DESC = new TField("has_done_final_exam", (byte) 8, 3);
    private static final TField FINAL_EXAM_LINK_POPUP_FIELD_DESC = new TField("final_exam_link_popup", (byte) 11, 4);
    private static final TField FINAL_EXAM_LINK_BUTTON_FIELD_DESC = new TField("final_exam_link_button", (byte) 11, 5);
    private static final TField FINAL_EXAM_RESULT_LINK_FIELD_DESC = new TField("final_exam_result_link", (byte) 11, 6);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.user_study_api.PrimarySchoolModeConfig$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_study_api$PrimarySchoolModeConfig$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$user_study_api$PrimarySchoolModeConfig$_Fields = iArr;
            try {
                iArr[_Fields.STATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$PrimarySchoolModeConfig$_Fields[_Fields.H5_LINK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$PrimarySchoolModeConfig$_Fields[_Fields.HAS_DONE_FINAL_EXAM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$PrimarySchoolModeConfig$_Fields[_Fields.FINAL_EXAM_LINK_POPUP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$PrimarySchoolModeConfig$_Fields[_Fields.FINAL_EXAM_LINK_BUTTON.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$PrimarySchoolModeConfig$_Fields[_Fields.FINAL_EXAM_RESULT_LINK.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class PrimarySchoolModeConfigStandardScheme extends StandardScheme<PrimarySchoolModeConfig> {
        private PrimarySchoolModeConfigStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, PrimarySchoolModeConfig struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    iprot.readStructEnd();
                    if (!struct.isSetState()) {
                        throw new TProtocolException("Required field 'state' was not found in serialized data! Struct: " + toString());
                    }
                    if (struct.isSetHas_done_final_exam()) {
                        struct.validate();
                        return;
                    }
                    throw new TProtocolException("Required field 'has_done_final_exam' was not found in serialized data! Struct: " + toString());
                }
                switch (readFieldBegin.f77768id) {
                    case 1:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.state = iprot.readI32();
                            struct.setStateIsSet(true);
                            break;
                        }
                    case 2:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.h5_link = iprot.readString();
                            struct.setH5_linkIsSet(true);
                            break;
                        }
                    case 3:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.has_done_final_exam = iprot.readI32();
                            struct.setHas_done_final_examIsSet(true);
                            break;
                        }
                    case 4:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.final_exam_link_popup = iprot.readString();
                            struct.setFinal_exam_link_popupIsSet(true);
                            break;
                        }
                    case 5:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.final_exam_link_button = iprot.readString();
                            struct.setFinal_exam_link_buttonIsSet(true);
                            break;
                        }
                    case 6:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.final_exam_result_link = iprot.readString();
                            struct.setFinal_exam_result_linkIsSet(true);
                            break;
                        }
                    default:
                        TProtocolUtil.skip(iprot, b11);
                        break;
                }
                iprot.readFieldEnd();
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, PrimarySchoolModeConfig struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(PrimarySchoolModeConfig.STRUCT_DESC);
            oprot.writeFieldBegin(PrimarySchoolModeConfig.STATE_FIELD_DESC);
            oprot.writeI32(struct.state);
            oprot.writeFieldEnd();
            if (struct.h5_link != null) {
                oprot.writeFieldBegin(PrimarySchoolModeConfig.H5_LINK_FIELD_DESC);
                oprot.writeString(struct.h5_link);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(PrimarySchoolModeConfig.HAS_DONE_FINAL_EXAM_FIELD_DESC);
            oprot.writeI32(struct.has_done_final_exam);
            oprot.writeFieldEnd();
            if (struct.final_exam_link_popup != null) {
                oprot.writeFieldBegin(PrimarySchoolModeConfig.FINAL_EXAM_LINK_POPUP_FIELD_DESC);
                oprot.writeString(struct.final_exam_link_popup);
                oprot.writeFieldEnd();
            }
            if (struct.final_exam_link_button != null) {
                oprot.writeFieldBegin(PrimarySchoolModeConfig.FINAL_EXAM_LINK_BUTTON_FIELD_DESC);
                oprot.writeString(struct.final_exam_link_button);
                oprot.writeFieldEnd();
            }
            if (struct.final_exam_result_link != null) {
                oprot.writeFieldBegin(PrimarySchoolModeConfig.FINAL_EXAM_RESULT_LINK_FIELD_DESC);
                oprot.writeString(struct.final_exam_result_link);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class PrimarySchoolModeConfigStandardSchemeFactory implements SchemeFactory {
        private PrimarySchoolModeConfigStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public PrimarySchoolModeConfigStandardScheme getScheme() {
            return new PrimarySchoolModeConfigStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class PrimarySchoolModeConfigTupleScheme extends TupleScheme<PrimarySchoolModeConfig> {
        private PrimarySchoolModeConfigTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, PrimarySchoolModeConfig struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.state = tTupleProtocol.readI32();
            struct.setStateIsSet(true);
            struct.h5_link = tTupleProtocol.readString();
            struct.setH5_linkIsSet(true);
            struct.has_done_final_exam = tTupleProtocol.readI32();
            struct.setHas_done_final_examIsSet(true);
            struct.final_exam_link_popup = tTupleProtocol.readString();
            struct.setFinal_exam_link_popupIsSet(true);
            struct.final_exam_link_button = tTupleProtocol.readString();
            struct.setFinal_exam_link_buttonIsSet(true);
            struct.final_exam_result_link = tTupleProtocol.readString();
            struct.setFinal_exam_result_linkIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, PrimarySchoolModeConfig struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.state);
            tTupleProtocol.writeString(struct.h5_link);
            tTupleProtocol.writeI32(struct.has_done_final_exam);
            tTupleProtocol.writeString(struct.final_exam_link_popup);
            tTupleProtocol.writeString(struct.final_exam_link_button);
            tTupleProtocol.writeString(struct.final_exam_result_link);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class PrimarySchoolModeConfigTupleSchemeFactory implements SchemeFactory {
        private PrimarySchoolModeConfigTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public PrimarySchoolModeConfigTupleScheme getScheme() {
            return new PrimarySchoolModeConfigTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        STATE(1, "state"),
        H5_LINK(2, "h5_link"),
        HAS_DONE_FINAL_EXAM(3, "has_done_final_exam"),
        FINAL_EXAM_LINK_POPUP(4, "final_exam_link_popup"),
        FINAL_EXAM_LINK_BUTTON(5, "final_exam_link_button"),
        FINAL_EXAM_RESULT_LINK(6, "final_exam_result_link");

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
            switch (fieldId) {
                case 1:
                    return STATE;
                case 2:
                    return H5_LINK;
                case 3:
                    return HAS_DONE_FINAL_EXAM;
                case 4:
                    return FINAL_EXAM_LINK_POPUP;
                case 5:
                    return FINAL_EXAM_LINK_BUTTON;
                case 6:
                    return FINAL_EXAM_RESULT_LINK;
                default:
                    return null;
            }
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
        hashMap.put(StandardScheme.class, new PrimarySchoolModeConfigStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new PrimarySchoolModeConfigTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.STATE, (_Fields) new FieldMetaData("state", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.H5_LINK, (_Fields) new FieldMetaData("h5_link", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.HAS_DONE_FINAL_EXAM, (_Fields) new FieldMetaData("has_done_final_exam", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.FINAL_EXAM_LINK_POPUP, (_Fields) new FieldMetaData("final_exam_link_popup", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.FINAL_EXAM_LINK_BUTTON, (_Fields) new FieldMetaData("final_exam_link_button", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.FINAL_EXAM_RESULT_LINK, (_Fields) new FieldMetaData("final_exam_result_link", (byte) 1, new FieldValueMetaData((byte) 11)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(PrimarySchoolModeConfig.class, unmodifiableMap);
    }

    public PrimarySchoolModeConfig() {
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
        setStateIsSet(false);
        this.state = 0;
        this.h5_link = null;
        setHas_done_final_examIsSet(false);
        this.has_done_final_exam = 0;
        this.final_exam_link_popup = null;
        this.final_exam_link_button = null;
        this.final_exam_result_link = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof PrimarySchoolModeConfig)) {
            return equals((PrimarySchoolModeConfig) that);
        }
        return false;
    }

    public String getFinal_exam_link_button() {
        return this.final_exam_link_button;
    }

    public String getFinal_exam_link_popup() {
        return this.final_exam_link_popup;
    }

    public String getFinal_exam_result_link() {
        return this.final_exam_result_link;
    }

    public String getH5_link() {
        return this.h5_link;
    }

    public int getHas_done_final_exam() {
        return this.has_done_final_exam;
    }

    public int getState() {
        return this.state;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetFinal_exam_link_button() {
        return this.final_exam_link_button != null;
    }

    public boolean isSetFinal_exam_link_popup() {
        return this.final_exam_link_popup != null;
    }

    public boolean isSetFinal_exam_result_link() {
        return this.final_exam_result_link != null;
    }

    public boolean isSetH5_link() {
        return this.h5_link != null;
    }

    public boolean isSetHas_done_final_exam() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetState() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public PrimarySchoolModeConfig setFinal_exam_link_button(String final_exam_link_button) {
        this.final_exam_link_button = final_exam_link_button;
        return this;
    }

    public void setFinal_exam_link_buttonIsSet(boolean value) {
        if (value) {
            return;
        }
        this.final_exam_link_button = null;
    }

    public PrimarySchoolModeConfig setFinal_exam_link_popup(String final_exam_link_popup) {
        this.final_exam_link_popup = final_exam_link_popup;
        return this;
    }

    public void setFinal_exam_link_popupIsSet(boolean value) {
        if (value) {
            return;
        }
        this.final_exam_link_popup = null;
    }

    public PrimarySchoolModeConfig setFinal_exam_result_link(String final_exam_result_link) {
        this.final_exam_result_link = final_exam_result_link;
        return this;
    }

    public void setFinal_exam_result_linkIsSet(boolean value) {
        if (value) {
            return;
        }
        this.final_exam_result_link = null;
    }

    public PrimarySchoolModeConfig setH5_link(String h5_link) {
        this.h5_link = h5_link;
        return this;
    }

    public void setH5_linkIsSet(boolean value) {
        if (value) {
            return;
        }
        this.h5_link = null;
    }

    public PrimarySchoolModeConfig setHas_done_final_exam(int has_done_final_exam) {
        this.has_done_final_exam = has_done_final_exam;
        setHas_done_final_examIsSet(true);
        return this;
    }

    public void setHas_done_final_examIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public PrimarySchoolModeConfig setState(int state) {
        this.state = state;
        setStateIsSet(true);
        return this;
    }

    public void setStateIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("PrimarySchoolModeConfig(");
        sb2.append("state:");
        sb2.append(this.state);
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("h5_link:");
        String str = this.h5_link;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("has_done_final_exam:");
        sb2.append(this.has_done_final_exam);
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("final_exam_link_popup:");
        String str2 = this.final_exam_link_popup;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(str2);
        }
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("final_exam_link_button:");
        String str3 = this.final_exam_link_button;
        if (str3 == null) {
            sb2.append("null");
        } else {
            sb2.append(str3);
        }
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("final_exam_result_link:");
        String str4 = this.final_exam_result_link;
        if (str4 == null) {
            sb2.append("null");
        } else {
            sb2.append(str4);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetFinal_exam_link_button() {
        this.final_exam_link_button = null;
    }

    public void unsetFinal_exam_link_popup() {
        this.final_exam_link_popup = null;
    }

    public void unsetFinal_exam_result_link() {
        this.final_exam_result_link = null;
    }

    public void unsetH5_link() {
        this.h5_link = null;
    }

    public void unsetHas_done_final_exam() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetState() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void validate() throws TException {
        if (this.h5_link == null) {
            throw new TProtocolException("Required field 'h5_link' was not present! Struct: " + toString());
        }
        if (this.final_exam_link_popup == null) {
            throw new TProtocolException("Required field 'final_exam_link_popup' was not present! Struct: " + toString());
        }
        if (this.final_exam_link_button == null) {
            throw new TProtocolException("Required field 'final_exam_link_button' was not present! Struct: " + toString());
        }
        if (this.final_exam_result_link != null) {
            return;
        }
        throw new TProtocolException("Required field 'final_exam_result_link' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(PrimarySchoolModeConfig other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        int compareTo5;
        int compareTo6;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo7 = Boolean.valueOf(isSetState()).compareTo(Boolean.valueOf(other.isSetState()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (isSetState() && (compareTo6 = TBaseHelper.compareTo(this.state, other.state)) != 0) {
            return compareTo6;
        }
        int compareTo8 = Boolean.valueOf(isSetH5_link()).compareTo(Boolean.valueOf(other.isSetH5_link()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (isSetH5_link() && (compareTo5 = TBaseHelper.compareTo(this.h5_link, other.h5_link)) != 0) {
            return compareTo5;
        }
        int compareTo9 = Boolean.valueOf(isSetHas_done_final_exam()).compareTo(Boolean.valueOf(other.isSetHas_done_final_exam()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (isSetHas_done_final_exam() && (compareTo4 = TBaseHelper.compareTo(this.has_done_final_exam, other.has_done_final_exam)) != 0) {
            return compareTo4;
        }
        int compareTo10 = Boolean.valueOf(isSetFinal_exam_link_popup()).compareTo(Boolean.valueOf(other.isSetFinal_exam_link_popup()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (isSetFinal_exam_link_popup() && (compareTo3 = TBaseHelper.compareTo(this.final_exam_link_popup, other.final_exam_link_popup)) != 0) {
            return compareTo3;
        }
        int compareTo11 = Boolean.valueOf(isSetFinal_exam_link_button()).compareTo(Boolean.valueOf(other.isSetFinal_exam_link_button()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (isSetFinal_exam_link_button() && (compareTo2 = TBaseHelper.compareTo(this.final_exam_link_button, other.final_exam_link_button)) != 0) {
            return compareTo2;
        }
        int compareTo12 = Boolean.valueOf(isSetFinal_exam_result_link()).compareTo(Boolean.valueOf(other.isSetFinal_exam_result_link()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (!isSetFinal_exam_result_link() || (compareTo = TBaseHelper.compareTo(this.final_exam_result_link, other.final_exam_result_link)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<PrimarySchoolModeConfig, _Fields> deepCopy2() {
        return new PrimarySchoolModeConfig(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$PrimarySchoolModeConfig$_Fields[field.ordinal()]) {
            case 1:
                return Integer.valueOf(getState());
            case 2:
                return getH5_link();
            case 3:
                return Integer.valueOf(getHas_done_final_exam());
            case 4:
                return getFinal_exam_link_popup();
            case 5:
                return getFinal_exam_link_button();
            case 6:
                return getFinal_exam_result_link();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$PrimarySchoolModeConfig$_Fields[field.ordinal()]) {
            case 1:
                return isSetState();
            case 2:
                return isSetH5_link();
            case 3:
                return isSetHas_done_final_exam();
            case 4:
                return isSetFinal_exam_link_popup();
            case 5:
                return isSetFinal_exam_link_button();
            case 6:
                return isSetFinal_exam_result_link();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$PrimarySchoolModeConfig$_Fields[field.ordinal()]) {
            case 1:
                if (value != null) {
                    setState(((Integer) value).intValue());
                    break;
                } else {
                    unsetState();
                    break;
                }
            case 2:
                if (value != null) {
                    setH5_link((String) value);
                    break;
                } else {
                    unsetH5_link();
                    break;
                }
            case 3:
                if (value != null) {
                    setHas_done_final_exam(((Integer) value).intValue());
                    break;
                } else {
                    unsetHas_done_final_exam();
                    break;
                }
            case 4:
                if (value != null) {
                    setFinal_exam_link_popup((String) value);
                    break;
                } else {
                    unsetFinal_exam_link_popup();
                    break;
                }
            case 5:
                if (value != null) {
                    setFinal_exam_link_button((String) value);
                    break;
                } else {
                    unsetFinal_exam_link_button();
                    break;
                }
            case 6:
                if (value != null) {
                    setFinal_exam_result_link((String) value);
                    break;
                } else {
                    unsetFinal_exam_result_link();
                    break;
                }
        }
    }

    public PrimarySchoolModeConfig(int state, String h5_link, int has_done_final_exam, String final_exam_link_popup, String final_exam_link_button, String final_exam_result_link) {
        this();
        this.state = state;
        setStateIsSet(true);
        this.h5_link = h5_link;
        this.has_done_final_exam = has_done_final_exam;
        setHas_done_final_examIsSet(true);
        this.final_exam_link_popup = final_exam_link_popup;
        this.final_exam_link_button = final_exam_link_button;
        this.final_exam_result_link = final_exam_result_link;
    }

    public boolean equals(PrimarySchoolModeConfig that) {
        if (that == null || this.state != that.state) {
            return false;
        }
        boolean isSetH5_link = isSetH5_link();
        boolean isSetH5_link2 = that.isSetH5_link();
        if (((isSetH5_link || isSetH5_link2) && !(isSetH5_link && isSetH5_link2 && this.h5_link.equals(that.h5_link))) || this.has_done_final_exam != that.has_done_final_exam) {
            return false;
        }
        boolean isSetFinal_exam_link_popup = isSetFinal_exam_link_popup();
        boolean isSetFinal_exam_link_popup2 = that.isSetFinal_exam_link_popup();
        if ((isSetFinal_exam_link_popup || isSetFinal_exam_link_popup2) && !(isSetFinal_exam_link_popup && isSetFinal_exam_link_popup2 && this.final_exam_link_popup.equals(that.final_exam_link_popup))) {
            return false;
        }
        boolean isSetFinal_exam_link_button = isSetFinal_exam_link_button();
        boolean isSetFinal_exam_link_button2 = that.isSetFinal_exam_link_button();
        if ((isSetFinal_exam_link_button || isSetFinal_exam_link_button2) && !(isSetFinal_exam_link_button && isSetFinal_exam_link_button2 && this.final_exam_link_button.equals(that.final_exam_link_button))) {
            return false;
        }
        boolean isSetFinal_exam_result_link = isSetFinal_exam_result_link();
        boolean isSetFinal_exam_result_link2 = that.isSetFinal_exam_result_link();
        if (isSetFinal_exam_result_link || isSetFinal_exam_result_link2) {
            return isSetFinal_exam_result_link && isSetFinal_exam_result_link2 && this.final_exam_result_link.equals(that.final_exam_result_link);
        }
        return true;
    }

    public PrimarySchoolModeConfig(PrimarySchoolModeConfig other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        this.state = other.state;
        if (other.isSetH5_link()) {
            this.h5_link = other.h5_link;
        }
        this.has_done_final_exam = other.has_done_final_exam;
        if (other.isSetFinal_exam_link_popup()) {
            this.final_exam_link_popup = other.final_exam_link_popup;
        }
        if (other.isSetFinal_exam_link_button()) {
            this.final_exam_link_button = other.final_exam_link_button;
        }
        if (other.isSetFinal_exam_result_link()) {
            this.final_exam_result_link = other.final_exam_result_link;
        }
    }
}

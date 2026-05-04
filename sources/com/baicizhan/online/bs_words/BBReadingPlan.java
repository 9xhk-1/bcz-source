package com.baicizhan.online.bs_words;

import com.baicizhan.online.bs_users.BBRedirectInfo;
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
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TBase;
import org.apache.thrift.TBaseHelper;
import org.apache.thrift.TException;
import org.apache.thrift.TFieldIdEnum;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
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
public class BBReadingPlan implements TBase<BBReadingPlan, _Fields>, Serializable, Cloneable, Comparable<BBReadingPlan> {
    private static final int __PLAN_ID_ISSET_ID = 0;
    private static final int __PLAN_LEVEL_ISSET_ID = 2;
    private static final int __PLAY_TIMES_ISSET_ID = 1;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public String img_file_name;
    public String img_url;
    public BBRedirectInfo mall_info;
    private _Fields[] optionals;
    public String plan_descrp;
    public int plan_id;
    public int plan_level;
    public String plan_name;
    public int play_times;
    private static final TStruct STRUCT_DESC = new TStruct("BBReadingPlan");
    private static final TField PLAN_ID_FIELD_DESC = new TField("plan_id", (byte) 8, 1);
    private static final TField PLAN_NAME_FIELD_DESC = new TField("plan_name", (byte) 11, 2);
    private static final TField PLAN_DESCRP_FIELD_DESC = new TField("plan_descrp", (byte) 11, 3);
    private static final TField PLAY_TIMES_FIELD_DESC = new TField("play_times", (byte) 8, 4);
    private static final TField PLAN_LEVEL_FIELD_DESC = new TField("plan_level", (byte) 8, 5);
    private static final TField MALL_INFO_FIELD_DESC = new TField("mall_info", (byte) 12, 6);
    private static final TField IMG_URL_FIELD_DESC = new TField(com.baicizhan.main.activity.schedule_v2.e.f19255e, (byte) 11, 7);
    private static final TField IMG_FILE_NAME_FIELD_DESC = new TField("img_file_name", (byte) 11, 8);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.bs_words.BBReadingPlan$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_words$BBReadingPlan$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$bs_words$BBReadingPlan$_Fields = iArr;
            try {
                iArr[_Fields.PLAN_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_words$BBReadingPlan$_Fields[_Fields.PLAN_NAME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_words$BBReadingPlan$_Fields[_Fields.PLAN_DESCRP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_words$BBReadingPlan$_Fields[_Fields.PLAY_TIMES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_words$BBReadingPlan$_Fields[_Fields.PLAN_LEVEL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_words$BBReadingPlan$_Fields[_Fields.MALL_INFO.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_words$BBReadingPlan$_Fields[_Fields.IMG_URL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_words$BBReadingPlan$_Fields[_Fields.IMG_FILE_NAME.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBReadingPlanStandardScheme extends StandardScheme<BBReadingPlan> {
        private BBReadingPlanStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, BBReadingPlan struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    iprot.readStructEnd();
                    if (!struct.isSetPlan_id()) {
                        throw new TProtocolException("Required field 'plan_id' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetPlay_times()) {
                        throw new TProtocolException("Required field 'play_times' was not found in serialized data! Struct: " + toString());
                    }
                    if (struct.isSetPlan_level()) {
                        struct.validate();
                        return;
                    }
                    throw new TProtocolException("Required field 'plan_level' was not found in serialized data! Struct: " + toString());
                }
                switch (readFieldBegin.f77768id) {
                    case 1:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.plan_id = iprot.readI32();
                            struct.setPlan_idIsSet(true);
                            break;
                        }
                    case 2:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.plan_name = iprot.readString();
                            struct.setPlan_nameIsSet(true);
                            break;
                        }
                    case 3:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.plan_descrp = iprot.readString();
                            struct.setPlan_descrpIsSet(true);
                            break;
                        }
                    case 4:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.play_times = iprot.readI32();
                            struct.setPlay_timesIsSet(true);
                            break;
                        }
                    case 5:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.plan_level = iprot.readI32();
                            struct.setPlan_levelIsSet(true);
                            break;
                        }
                    case 6:
                        if (b11 != 12) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            BBRedirectInfo bBRedirectInfo = new BBRedirectInfo();
                            struct.mall_info = bBRedirectInfo;
                            bBRedirectInfo.read(iprot);
                            struct.setMall_infoIsSet(true);
                            break;
                        }
                    case 7:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.img_url = iprot.readString();
                            struct.setImg_urlIsSet(true);
                            break;
                        }
                    case 8:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.img_file_name = iprot.readString();
                            struct.setImg_file_nameIsSet(true);
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
        public void write(TProtocol oprot, BBReadingPlan struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(BBReadingPlan.STRUCT_DESC);
            oprot.writeFieldBegin(BBReadingPlan.PLAN_ID_FIELD_DESC);
            oprot.writeI32(struct.plan_id);
            oprot.writeFieldEnd();
            if (struct.plan_name != null) {
                oprot.writeFieldBegin(BBReadingPlan.PLAN_NAME_FIELD_DESC);
                oprot.writeString(struct.plan_name);
                oprot.writeFieldEnd();
            }
            if (struct.plan_descrp != null) {
                oprot.writeFieldBegin(BBReadingPlan.PLAN_DESCRP_FIELD_DESC);
                oprot.writeString(struct.plan_descrp);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(BBReadingPlan.PLAY_TIMES_FIELD_DESC);
            oprot.writeI32(struct.play_times);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(BBReadingPlan.PLAN_LEVEL_FIELD_DESC);
            oprot.writeI32(struct.plan_level);
            oprot.writeFieldEnd();
            if (struct.mall_info != null && struct.isSetMall_info()) {
                oprot.writeFieldBegin(BBReadingPlan.MALL_INFO_FIELD_DESC);
                struct.mall_info.write(oprot);
                oprot.writeFieldEnd();
            }
            if (struct.img_url != null) {
                oprot.writeFieldBegin(BBReadingPlan.IMG_URL_FIELD_DESC);
                oprot.writeString(struct.img_url);
                oprot.writeFieldEnd();
            }
            if (struct.img_file_name != null) {
                oprot.writeFieldBegin(BBReadingPlan.IMG_FILE_NAME_FIELD_DESC);
                oprot.writeString(struct.img_file_name);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBReadingPlanStandardSchemeFactory implements SchemeFactory {
        private BBReadingPlanStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BBReadingPlanStandardScheme getScheme() {
            return new BBReadingPlanStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBReadingPlanTupleScheme extends TupleScheme<BBReadingPlan> {
        private BBReadingPlanTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, BBReadingPlan struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.plan_id = tTupleProtocol.readI32();
            struct.setPlan_idIsSet(true);
            struct.plan_name = tTupleProtocol.readString();
            struct.setPlan_nameIsSet(true);
            struct.plan_descrp = tTupleProtocol.readString();
            struct.setPlan_descrpIsSet(true);
            struct.play_times = tTupleProtocol.readI32();
            struct.setPlay_timesIsSet(true);
            struct.plan_level = tTupleProtocol.readI32();
            struct.setPlan_levelIsSet(true);
            struct.img_url = tTupleProtocol.readString();
            struct.setImg_urlIsSet(true);
            struct.img_file_name = tTupleProtocol.readString();
            struct.setImg_file_nameIsSet(true);
            if (tTupleProtocol.readBitSet(1).get(0)) {
                BBRedirectInfo bBRedirectInfo = new BBRedirectInfo();
                struct.mall_info = bBRedirectInfo;
                bBRedirectInfo.read(tTupleProtocol);
                struct.setMall_infoIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, BBReadingPlan struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.plan_id);
            tTupleProtocol.writeString(struct.plan_name);
            tTupleProtocol.writeString(struct.plan_descrp);
            tTupleProtocol.writeI32(struct.play_times);
            tTupleProtocol.writeI32(struct.plan_level);
            tTupleProtocol.writeString(struct.img_url);
            tTupleProtocol.writeString(struct.img_file_name);
            BitSet bitSet = new BitSet();
            if (struct.isSetMall_info()) {
                bitSet.set(0);
            }
            tTupleProtocol.writeBitSet(bitSet, 1);
            if (struct.isSetMall_info()) {
                struct.mall_info.write(tTupleProtocol);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBReadingPlanTupleSchemeFactory implements SchemeFactory {
        private BBReadingPlanTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BBReadingPlanTupleScheme getScheme() {
            return new BBReadingPlanTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        PLAN_ID(1, "plan_id"),
        PLAN_NAME(2, "plan_name"),
        PLAN_DESCRP(3, "plan_descrp"),
        PLAY_TIMES(4, "play_times"),
        PLAN_LEVEL(5, "plan_level"),
        MALL_INFO(6, "mall_info"),
        IMG_URL(7, com.baicizhan.main.activity.schedule_v2.e.f19255e),
        IMG_FILE_NAME(8, "img_file_name");

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
                    return PLAN_ID;
                case 2:
                    return PLAN_NAME;
                case 3:
                    return PLAN_DESCRP;
                case 4:
                    return PLAY_TIMES;
                case 5:
                    return PLAN_LEVEL;
                case 6:
                    return MALL_INFO;
                case 7:
                    return IMG_URL;
                case 8:
                    return IMG_FILE_NAME;
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
        hashMap.put(StandardScheme.class, new BBReadingPlanStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new BBReadingPlanTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.PLAN_ID, (_Fields) new FieldMetaData("plan_id", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.PLAN_NAME, (_Fields) new FieldMetaData("plan_name", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.PLAN_DESCRP, (_Fields) new FieldMetaData("plan_descrp", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.PLAY_TIMES, (_Fields) new FieldMetaData("play_times", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.PLAN_LEVEL, (_Fields) new FieldMetaData("plan_level", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.MALL_INFO, (_Fields) new FieldMetaData("mall_info", (byte) 2, new StructMetaData((byte) 12, BBRedirectInfo.class)));
        enumMap.put((EnumMap) _Fields.IMG_URL, (_Fields) new FieldMetaData(com.baicizhan.main.activity.schedule_v2.e.f19255e, (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.IMG_FILE_NAME, (_Fields) new FieldMetaData("img_file_name", (byte) 1, new FieldValueMetaData((byte) 11)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(BBReadingPlan.class, unmodifiableMap);
    }

    public BBReadingPlan() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.MALL_INFO};
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
        setPlan_idIsSet(false);
        this.plan_id = 0;
        this.plan_name = null;
        this.plan_descrp = null;
        setPlay_timesIsSet(false);
        this.play_times = 0;
        setPlan_levelIsSet(false);
        this.plan_level = 0;
        this.mall_info = null;
        this.img_url = null;
        this.img_file_name = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof BBReadingPlan)) {
            return equals((BBReadingPlan) that);
        }
        return false;
    }

    public String getImg_file_name() {
        return this.img_file_name;
    }

    public String getImg_url() {
        return this.img_url;
    }

    public BBRedirectInfo getMall_info() {
        return this.mall_info;
    }

    public String getPlan_descrp() {
        return this.plan_descrp;
    }

    public int getPlan_id() {
        return this.plan_id;
    }

    public int getPlan_level() {
        return this.plan_level;
    }

    public String getPlan_name() {
        return this.plan_name;
    }

    public int getPlay_times() {
        return this.play_times;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetImg_file_name() {
        return this.img_file_name != null;
    }

    public boolean isSetImg_url() {
        return this.img_url != null;
    }

    public boolean isSetMall_info() {
        return this.mall_info != null;
    }

    public boolean isSetPlan_descrp() {
        return this.plan_descrp != null;
    }

    public boolean isSetPlan_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetPlan_level() {
        return EncodingUtils.testBit(this.__isset_bitfield, 2);
    }

    public boolean isSetPlan_name() {
        return this.plan_name != null;
    }

    public boolean isSetPlay_times() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public BBReadingPlan setImg_file_name(String img_file_name) {
        this.img_file_name = img_file_name;
        return this;
    }

    public void setImg_file_nameIsSet(boolean value) {
        if (value) {
            return;
        }
        this.img_file_name = null;
    }

    public BBReadingPlan setImg_url(String img_url) {
        this.img_url = img_url;
        return this;
    }

    public void setImg_urlIsSet(boolean value) {
        if (value) {
            return;
        }
        this.img_url = null;
    }

    public BBReadingPlan setMall_info(BBRedirectInfo mall_info) {
        this.mall_info = mall_info;
        return this;
    }

    public void setMall_infoIsSet(boolean value) {
        if (value) {
            return;
        }
        this.mall_info = null;
    }

    public BBReadingPlan setPlan_descrp(String plan_descrp) {
        this.plan_descrp = plan_descrp;
        return this;
    }

    public void setPlan_descrpIsSet(boolean value) {
        if (value) {
            return;
        }
        this.plan_descrp = null;
    }

    public BBReadingPlan setPlan_id(int plan_id) {
        this.plan_id = plan_id;
        setPlan_idIsSet(true);
        return this;
    }

    public void setPlan_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public BBReadingPlan setPlan_level(int plan_level) {
        this.plan_level = plan_level;
        setPlan_levelIsSet(true);
        return this;
    }

    public void setPlan_levelIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 2, value);
    }

    public BBReadingPlan setPlan_name(String plan_name) {
        this.plan_name = plan_name;
        return this;
    }

    public void setPlan_nameIsSet(boolean value) {
        if (value) {
            return;
        }
        this.plan_name = null;
    }

    public BBReadingPlan setPlay_times(int play_times) {
        this.play_times = play_times;
        setPlay_timesIsSet(true);
        return this;
    }

    public void setPlay_timesIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("BBReadingPlan(");
        sb2.append("plan_id:");
        sb2.append(this.plan_id);
        sb2.append(j2.O);
        sb2.append("plan_name:");
        String str = this.plan_name;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(j2.O);
        sb2.append("plan_descrp:");
        String str2 = this.plan_descrp;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(str2);
        }
        sb2.append(j2.O);
        sb2.append("play_times:");
        sb2.append(this.play_times);
        sb2.append(j2.O);
        sb2.append("plan_level:");
        sb2.append(this.plan_level);
        if (isSetMall_info()) {
            sb2.append(j2.O);
            sb2.append("mall_info:");
            BBRedirectInfo bBRedirectInfo = this.mall_info;
            if (bBRedirectInfo == null) {
                sb2.append("null");
            } else {
                sb2.append(bBRedirectInfo);
            }
        }
        sb2.append(j2.O);
        sb2.append("img_url:");
        String str3 = this.img_url;
        if (str3 == null) {
            sb2.append("null");
        } else {
            sb2.append(str3);
        }
        sb2.append(j2.O);
        sb2.append("img_file_name:");
        String str4 = this.img_file_name;
        if (str4 == null) {
            sb2.append("null");
        } else {
            sb2.append(str4);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetImg_file_name() {
        this.img_file_name = null;
    }

    public void unsetImg_url() {
        this.img_url = null;
    }

    public void unsetMall_info() {
        this.mall_info = null;
    }

    public void unsetPlan_descrp() {
        this.plan_descrp = null;
    }

    public void unsetPlan_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetPlan_level() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 2);
    }

    public void unsetPlan_name() {
        this.plan_name = null;
    }

    public void unsetPlay_times() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void validate() throws TException {
        if (this.plan_name == null) {
            throw new TProtocolException("Required field 'plan_name' was not present! Struct: " + toString());
        }
        if (this.plan_descrp == null) {
            throw new TProtocolException("Required field 'plan_descrp' was not present! Struct: " + toString());
        }
        if (this.img_url == null) {
            throw new TProtocolException("Required field 'img_url' was not present! Struct: " + toString());
        }
        if (this.img_file_name == null) {
            throw new TProtocolException("Required field 'img_file_name' was not present! Struct: " + toString());
        }
        BBRedirectInfo bBRedirectInfo = this.mall_info;
        if (bBRedirectInfo != null) {
            bBRedirectInfo.validate();
        }
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(BBReadingPlan other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        int compareTo5;
        int compareTo6;
        int compareTo7;
        int compareTo8;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo9 = Boolean.valueOf(isSetPlan_id()).compareTo(Boolean.valueOf(other.isSetPlan_id()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (isSetPlan_id() && (compareTo8 = TBaseHelper.compareTo(this.plan_id, other.plan_id)) != 0) {
            return compareTo8;
        }
        int compareTo10 = Boolean.valueOf(isSetPlan_name()).compareTo(Boolean.valueOf(other.isSetPlan_name()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (isSetPlan_name() && (compareTo7 = TBaseHelper.compareTo(this.plan_name, other.plan_name)) != 0) {
            return compareTo7;
        }
        int compareTo11 = Boolean.valueOf(isSetPlan_descrp()).compareTo(Boolean.valueOf(other.isSetPlan_descrp()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (isSetPlan_descrp() && (compareTo6 = TBaseHelper.compareTo(this.plan_descrp, other.plan_descrp)) != 0) {
            return compareTo6;
        }
        int compareTo12 = Boolean.valueOf(isSetPlay_times()).compareTo(Boolean.valueOf(other.isSetPlay_times()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (isSetPlay_times() && (compareTo5 = TBaseHelper.compareTo(this.play_times, other.play_times)) != 0) {
            return compareTo5;
        }
        int compareTo13 = Boolean.valueOf(isSetPlan_level()).compareTo(Boolean.valueOf(other.isSetPlan_level()));
        if (compareTo13 != 0) {
            return compareTo13;
        }
        if (isSetPlan_level() && (compareTo4 = TBaseHelper.compareTo(this.plan_level, other.plan_level)) != 0) {
            return compareTo4;
        }
        int compareTo14 = Boolean.valueOf(isSetMall_info()).compareTo(Boolean.valueOf(other.isSetMall_info()));
        if (compareTo14 != 0) {
            return compareTo14;
        }
        if (isSetMall_info() && (compareTo3 = TBaseHelper.compareTo((Comparable) this.mall_info, (Comparable) other.mall_info)) != 0) {
            return compareTo3;
        }
        int compareTo15 = Boolean.valueOf(isSetImg_url()).compareTo(Boolean.valueOf(other.isSetImg_url()));
        if (compareTo15 != 0) {
            return compareTo15;
        }
        if (isSetImg_url() && (compareTo2 = TBaseHelper.compareTo(this.img_url, other.img_url)) != 0) {
            return compareTo2;
        }
        int compareTo16 = Boolean.valueOf(isSetImg_file_name()).compareTo(Boolean.valueOf(other.isSetImg_file_name()));
        if (compareTo16 != 0) {
            return compareTo16;
        }
        if (!isSetImg_file_name() || (compareTo = TBaseHelper.compareTo(this.img_file_name, other.img_file_name)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<BBReadingPlan, _Fields> deepCopy2() {
        return new BBReadingPlan(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_words$BBReadingPlan$_Fields[field.ordinal()]) {
            case 1:
                return Integer.valueOf(getPlan_id());
            case 2:
                return getPlan_name();
            case 3:
                return getPlan_descrp();
            case 4:
                return Integer.valueOf(getPlay_times());
            case 5:
                return Integer.valueOf(getPlan_level());
            case 6:
                return getMall_info();
            case 7:
                return getImg_url();
            case 8:
                return getImg_file_name();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_words$BBReadingPlan$_Fields[field.ordinal()]) {
            case 1:
                return isSetPlan_id();
            case 2:
                return isSetPlan_name();
            case 3:
                return isSetPlan_descrp();
            case 4:
                return isSetPlay_times();
            case 5:
                return isSetPlan_level();
            case 6:
                return isSetMall_info();
            case 7:
                return isSetImg_url();
            case 8:
                return isSetImg_file_name();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_words$BBReadingPlan$_Fields[field.ordinal()]) {
            case 1:
                if (value != null) {
                    setPlan_id(((Integer) value).intValue());
                    break;
                } else {
                    unsetPlan_id();
                    break;
                }
            case 2:
                if (value != null) {
                    setPlan_name((String) value);
                    break;
                } else {
                    unsetPlan_name();
                    break;
                }
            case 3:
                if (value != null) {
                    setPlan_descrp((String) value);
                    break;
                } else {
                    unsetPlan_descrp();
                    break;
                }
            case 4:
                if (value != null) {
                    setPlay_times(((Integer) value).intValue());
                    break;
                } else {
                    unsetPlay_times();
                    break;
                }
            case 5:
                if (value != null) {
                    setPlan_level(((Integer) value).intValue());
                    break;
                } else {
                    unsetPlan_level();
                    break;
                }
            case 6:
                if (value != null) {
                    setMall_info((BBRedirectInfo) value);
                    break;
                } else {
                    unsetMall_info();
                    break;
                }
            case 7:
                if (value != null) {
                    setImg_url((String) value);
                    break;
                } else {
                    unsetImg_url();
                    break;
                }
            case 8:
                if (value != null) {
                    setImg_file_name((String) value);
                    break;
                } else {
                    unsetImg_file_name();
                    break;
                }
        }
    }

    public boolean equals(BBReadingPlan that) {
        if (that == null || this.plan_id != that.plan_id) {
            return false;
        }
        boolean isSetPlan_name = isSetPlan_name();
        boolean isSetPlan_name2 = that.isSetPlan_name();
        if ((isSetPlan_name || isSetPlan_name2) && !(isSetPlan_name && isSetPlan_name2 && this.plan_name.equals(that.plan_name))) {
            return false;
        }
        boolean isSetPlan_descrp = isSetPlan_descrp();
        boolean isSetPlan_descrp2 = that.isSetPlan_descrp();
        if (((isSetPlan_descrp || isSetPlan_descrp2) && (!isSetPlan_descrp || !isSetPlan_descrp2 || !this.plan_descrp.equals(that.plan_descrp))) || this.play_times != that.play_times || this.plan_level != that.plan_level) {
            return false;
        }
        boolean isSetMall_info = isSetMall_info();
        boolean isSetMall_info2 = that.isSetMall_info();
        if ((isSetMall_info || isSetMall_info2) && !(isSetMall_info && isSetMall_info2 && this.mall_info.equals(that.mall_info))) {
            return false;
        }
        boolean isSetImg_url = isSetImg_url();
        boolean isSetImg_url2 = that.isSetImg_url();
        if ((isSetImg_url || isSetImg_url2) && !(isSetImg_url && isSetImg_url2 && this.img_url.equals(that.img_url))) {
            return false;
        }
        boolean isSetImg_file_name = isSetImg_file_name();
        boolean isSetImg_file_name2 = that.isSetImg_file_name();
        if (isSetImg_file_name || isSetImg_file_name2) {
            return isSetImg_file_name && isSetImg_file_name2 && this.img_file_name.equals(that.img_file_name);
        }
        return true;
    }

    public BBReadingPlan(int plan_id, String plan_name, String plan_descrp, int play_times, int plan_level, String img_url, String img_file_name) {
        this();
        this.plan_id = plan_id;
        setPlan_idIsSet(true);
        this.plan_name = plan_name;
        this.plan_descrp = plan_descrp;
        this.play_times = play_times;
        setPlay_timesIsSet(true);
        this.plan_level = plan_level;
        setPlan_levelIsSet(true);
        this.img_url = img_url;
        this.img_file_name = img_file_name;
    }

    public BBReadingPlan(BBReadingPlan other) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.MALL_INFO};
        this.__isset_bitfield = other.__isset_bitfield;
        this.plan_id = other.plan_id;
        if (other.isSetPlan_name()) {
            this.plan_name = other.plan_name;
        }
        if (other.isSetPlan_descrp()) {
            this.plan_descrp = other.plan_descrp;
        }
        this.play_times = other.play_times;
        this.plan_level = other.plan_level;
        if (other.isSetMall_info()) {
            this.mall_info = new BBRedirectInfo(other.mall_info);
        }
        if (other.isSetImg_url()) {
            this.img_url = other.img_url;
        }
        if (other.isSetImg_file_name()) {
            this.img_file_name = other.img_file_name;
        }
    }
}

package com.baicizhan.online.advertise_api;

import com.baicizhan.online.ad_property.AdExtraResp;
import com.tencent.open.SocialConstants;
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
public class StartupAd implements TBase<StartupAd, _Fields>, Serializable, Cloneable, Comparable<StartupAd> {
    private static final int __AD_ID_ISSET_ID = 0;
    private static final int __AD_TYPE_ISSET_ID = 5;
    private static final int __BTN_LIGHT_ISSET_ID = 9;
    private static final int __CACHED_ISSET_ID = 8;
    private static final int __END_TIME_ISSET_ID = 2;
    private static final int __FULL_ISSET_ID = 6;
    private static final int __RES_TYPE_ISSET_ID = 7;
    private static final int __SHOW_SECONDS_ISSET_ID = 4;
    private static final int __SHOW_TIMES_ISSET_ID = 3;
    private static final int __START_TIME_ISSET_ID = 1;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private short __isset_bitfield;
    public int ad_id;
    public AdExtraResp ad_resp;
    public int ad_type;
    public AdLink backup_link;
    public int btn_light;
    public int cached;
    public long end_time;
    public String ext_ad_id;
    public int full;
    public String img;
    public AdLink link;
    private _Fields[] optionals;
    public int res_type;
    public int show_seconds;
    public int show_times;
    public long start_time;
    private static final TStruct STRUCT_DESC = new TStruct("StartupAd");
    private static final TField AD_ID_FIELD_DESC = new TField("ad_id", (byte) 8, 1);
    private static final TField IMG_FIELD_DESC = new TField(SocialConstants.PARAM_IMG_URL, (byte) 11, 2);
    private static final TField START_TIME_FIELD_DESC = new TField("start_time", (byte) 10, 3);
    private static final TField END_TIME_FIELD_DESC = new TField("end_time", (byte) 10, 4);
    private static final TField SHOW_TIMES_FIELD_DESC = new TField("show_times", (byte) 8, 5);
    private static final TField SHOW_SECONDS_FIELD_DESC = new TField("show_seconds", (byte) 8, 6);
    private static final TField LINK_FIELD_DESC = new TField(y9.b.f99687c, (byte) 12, 7);
    private static final TField BACKUP_LINK_FIELD_DESC = new TField("backup_link", (byte) 12, 8);
    private static final TField EXT_AD_ID_FIELD_DESC = new TField("ext_ad_id", (byte) 11, 9);
    private static final TField AD_TYPE_FIELD_DESC = new TField("ad_type", (byte) 8, 10);
    private static final TField FULL_FIELD_DESC = new TField("full", (byte) 8, 11);
    private static final TField RES_TYPE_FIELD_DESC = new TField("res_type", (byte) 8, 12);
    private static final TField AD_RESP_FIELD_DESC = new TField("ad_resp", (byte) 12, 13);
    private static final TField CACHED_FIELD_DESC = new TField("cached", (byte) 8, 14);
    private static final TField BTN_LIGHT_FIELD_DESC = new TField("btn_light", (byte) 8, 15);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.advertise_api.StartupAd$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$advertise_api$StartupAd$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$advertise_api$StartupAd$_Fields = iArr;
            try {
                iArr[_Fields.AD_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$advertise_api$StartupAd$_Fields[_Fields.IMG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$advertise_api$StartupAd$_Fields[_Fields.START_TIME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$advertise_api$StartupAd$_Fields[_Fields.END_TIME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$advertise_api$StartupAd$_Fields[_Fields.SHOW_TIMES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$baicizhan$online$advertise_api$StartupAd$_Fields[_Fields.SHOW_SECONDS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$baicizhan$online$advertise_api$StartupAd$_Fields[_Fields.LINK.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$baicizhan$online$advertise_api$StartupAd$_Fields[_Fields.BACKUP_LINK.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$baicizhan$online$advertise_api$StartupAd$_Fields[_Fields.EXT_AD_ID.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$baicizhan$online$advertise_api$StartupAd$_Fields[_Fields.AD_TYPE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$baicizhan$online$advertise_api$StartupAd$_Fields[_Fields.FULL.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$baicizhan$online$advertise_api$StartupAd$_Fields[_Fields.RES_TYPE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$baicizhan$online$advertise_api$StartupAd$_Fields[_Fields.AD_RESP.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$baicizhan$online$advertise_api$StartupAd$_Fields[_Fields.CACHED.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$baicizhan$online$advertise_api$StartupAd$_Fields[_Fields.BTN_LIGHT.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class StartupAdStandardScheme extends StandardScheme<StartupAd> {
        private StartupAdStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, StartupAd struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    iprot.readStructEnd();
                    if (!struct.isSetAd_id()) {
                        throw new TProtocolException("Required field 'ad_id' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetStart_time()) {
                        throw new TProtocolException("Required field 'start_time' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetEnd_time()) {
                        throw new TProtocolException("Required field 'end_time' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetShow_times()) {
                        throw new TProtocolException("Required field 'show_times' was not found in serialized data! Struct: " + toString());
                    }
                    if (struct.isSetShow_seconds()) {
                        struct.validate();
                        return;
                    }
                    throw new TProtocolException("Required field 'show_seconds' was not found in serialized data! Struct: " + toString());
                }
                switch (readFieldBegin.f77768id) {
                    case 1:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.ad_id = iprot.readI32();
                            struct.setAd_idIsSet(true);
                            break;
                        }
                    case 2:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.img = iprot.readString();
                            struct.setImgIsSet(true);
                            break;
                        }
                    case 3:
                        if (b11 != 10) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.start_time = iprot.readI64();
                            struct.setStart_timeIsSet(true);
                            break;
                        }
                    case 4:
                        if (b11 != 10) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.end_time = iprot.readI64();
                            struct.setEnd_timeIsSet(true);
                            break;
                        }
                    case 5:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.show_times = iprot.readI32();
                            struct.setShow_timesIsSet(true);
                            break;
                        }
                    case 6:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.show_seconds = iprot.readI32();
                            struct.setShow_secondsIsSet(true);
                            break;
                        }
                    case 7:
                        if (b11 != 12) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            AdLink adLink = new AdLink();
                            struct.link = adLink;
                            adLink.read(iprot);
                            struct.setLinkIsSet(true);
                            break;
                        }
                    case 8:
                        if (b11 != 12) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            AdLink adLink2 = new AdLink();
                            struct.backup_link = adLink2;
                            adLink2.read(iprot);
                            struct.setBackup_linkIsSet(true);
                            break;
                        }
                    case 9:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.ext_ad_id = iprot.readString();
                            struct.setExt_ad_idIsSet(true);
                            break;
                        }
                    case 10:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.ad_type = iprot.readI32();
                            struct.setAd_typeIsSet(true);
                            break;
                        }
                    case 11:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.full = iprot.readI32();
                            struct.setFullIsSet(true);
                            break;
                        }
                    case 12:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.res_type = iprot.readI32();
                            struct.setRes_typeIsSet(true);
                            break;
                        }
                    case 13:
                        if (b11 != 12) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            AdExtraResp adExtraResp = new AdExtraResp();
                            struct.ad_resp = adExtraResp;
                            adExtraResp.read(iprot);
                            struct.setAd_respIsSet(true);
                            break;
                        }
                    case 14:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.cached = iprot.readI32();
                            struct.setCachedIsSet(true);
                            break;
                        }
                    case 15:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.btn_light = iprot.readI32();
                            struct.setBtn_lightIsSet(true);
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
        public void write(TProtocol oprot, StartupAd struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(StartupAd.STRUCT_DESC);
            oprot.writeFieldBegin(StartupAd.AD_ID_FIELD_DESC);
            oprot.writeI32(struct.ad_id);
            oprot.writeFieldEnd();
            if (struct.img != null) {
                oprot.writeFieldBegin(StartupAd.IMG_FIELD_DESC);
                oprot.writeString(struct.img);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(StartupAd.START_TIME_FIELD_DESC);
            oprot.writeI64(struct.start_time);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(StartupAd.END_TIME_FIELD_DESC);
            oprot.writeI64(struct.end_time);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(StartupAd.SHOW_TIMES_FIELD_DESC);
            oprot.writeI32(struct.show_times);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(StartupAd.SHOW_SECONDS_FIELD_DESC);
            oprot.writeI32(struct.show_seconds);
            oprot.writeFieldEnd();
            if (struct.link != null && struct.isSetLink()) {
                oprot.writeFieldBegin(StartupAd.LINK_FIELD_DESC);
                struct.link.write(oprot);
                oprot.writeFieldEnd();
            }
            if (struct.backup_link != null && struct.isSetBackup_link()) {
                oprot.writeFieldBegin(StartupAd.BACKUP_LINK_FIELD_DESC);
                struct.backup_link.write(oprot);
                oprot.writeFieldEnd();
            }
            if (struct.ext_ad_id != null && struct.isSetExt_ad_id()) {
                oprot.writeFieldBegin(StartupAd.EXT_AD_ID_FIELD_DESC);
                oprot.writeString(struct.ext_ad_id);
                oprot.writeFieldEnd();
            }
            if (struct.isSetAd_type()) {
                oprot.writeFieldBegin(StartupAd.AD_TYPE_FIELD_DESC);
                oprot.writeI32(struct.ad_type);
                oprot.writeFieldEnd();
            }
            if (struct.isSetFull()) {
                oprot.writeFieldBegin(StartupAd.FULL_FIELD_DESC);
                oprot.writeI32(struct.full);
                oprot.writeFieldEnd();
            }
            if (struct.isSetRes_type()) {
                oprot.writeFieldBegin(StartupAd.RES_TYPE_FIELD_DESC);
                oprot.writeI32(struct.res_type);
                oprot.writeFieldEnd();
            }
            if (struct.ad_resp != null && struct.isSetAd_resp()) {
                oprot.writeFieldBegin(StartupAd.AD_RESP_FIELD_DESC);
                struct.ad_resp.write(oprot);
                oprot.writeFieldEnd();
            }
            if (struct.isSetCached()) {
                oprot.writeFieldBegin(StartupAd.CACHED_FIELD_DESC);
                oprot.writeI32(struct.cached);
                oprot.writeFieldEnd();
            }
            if (struct.isSetBtn_light()) {
                oprot.writeFieldBegin(StartupAd.BTN_LIGHT_FIELD_DESC);
                oprot.writeI32(struct.btn_light);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class StartupAdStandardSchemeFactory implements SchemeFactory {
        private StartupAdStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public StartupAdStandardScheme getScheme() {
            return new StartupAdStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class StartupAdTupleScheme extends TupleScheme<StartupAd> {
        private StartupAdTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, StartupAd struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.ad_id = tTupleProtocol.readI32();
            struct.setAd_idIsSet(true);
            struct.img = tTupleProtocol.readString();
            struct.setImgIsSet(true);
            struct.start_time = tTupleProtocol.readI64();
            struct.setStart_timeIsSet(true);
            struct.end_time = tTupleProtocol.readI64();
            struct.setEnd_timeIsSet(true);
            struct.show_times = tTupleProtocol.readI32();
            struct.setShow_timesIsSet(true);
            struct.show_seconds = tTupleProtocol.readI32();
            struct.setShow_secondsIsSet(true);
            BitSet readBitSet = tTupleProtocol.readBitSet(9);
            if (readBitSet.get(0)) {
                AdLink adLink = new AdLink();
                struct.link = adLink;
                adLink.read(tTupleProtocol);
                struct.setLinkIsSet(true);
            }
            if (readBitSet.get(1)) {
                AdLink adLink2 = new AdLink();
                struct.backup_link = adLink2;
                adLink2.read(tTupleProtocol);
                struct.setBackup_linkIsSet(true);
            }
            if (readBitSet.get(2)) {
                struct.ext_ad_id = tTupleProtocol.readString();
                struct.setExt_ad_idIsSet(true);
            }
            if (readBitSet.get(3)) {
                struct.ad_type = tTupleProtocol.readI32();
                struct.setAd_typeIsSet(true);
            }
            if (readBitSet.get(4)) {
                struct.full = tTupleProtocol.readI32();
                struct.setFullIsSet(true);
            }
            if (readBitSet.get(5)) {
                struct.res_type = tTupleProtocol.readI32();
                struct.setRes_typeIsSet(true);
            }
            if (readBitSet.get(6)) {
                AdExtraResp adExtraResp = new AdExtraResp();
                struct.ad_resp = adExtraResp;
                adExtraResp.read(tTupleProtocol);
                struct.setAd_respIsSet(true);
            }
            if (readBitSet.get(7)) {
                struct.cached = tTupleProtocol.readI32();
                struct.setCachedIsSet(true);
            }
            if (readBitSet.get(8)) {
                struct.btn_light = tTupleProtocol.readI32();
                struct.setBtn_lightIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, StartupAd struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.ad_id);
            tTupleProtocol.writeString(struct.img);
            tTupleProtocol.writeI64(struct.start_time);
            tTupleProtocol.writeI64(struct.end_time);
            tTupleProtocol.writeI32(struct.show_times);
            tTupleProtocol.writeI32(struct.show_seconds);
            BitSet bitSet = new BitSet();
            if (struct.isSetLink()) {
                bitSet.set(0);
            }
            if (struct.isSetBackup_link()) {
                bitSet.set(1);
            }
            if (struct.isSetExt_ad_id()) {
                bitSet.set(2);
            }
            if (struct.isSetAd_type()) {
                bitSet.set(3);
            }
            if (struct.isSetFull()) {
                bitSet.set(4);
            }
            if (struct.isSetRes_type()) {
                bitSet.set(5);
            }
            if (struct.isSetAd_resp()) {
                bitSet.set(6);
            }
            if (struct.isSetCached()) {
                bitSet.set(7);
            }
            if (struct.isSetBtn_light()) {
                bitSet.set(8);
            }
            tTupleProtocol.writeBitSet(bitSet, 9);
            if (struct.isSetLink()) {
                struct.link.write(tTupleProtocol);
            }
            if (struct.isSetBackup_link()) {
                struct.backup_link.write(tTupleProtocol);
            }
            if (struct.isSetExt_ad_id()) {
                tTupleProtocol.writeString(struct.ext_ad_id);
            }
            if (struct.isSetAd_type()) {
                tTupleProtocol.writeI32(struct.ad_type);
            }
            if (struct.isSetFull()) {
                tTupleProtocol.writeI32(struct.full);
            }
            if (struct.isSetRes_type()) {
                tTupleProtocol.writeI32(struct.res_type);
            }
            if (struct.isSetAd_resp()) {
                struct.ad_resp.write(tTupleProtocol);
            }
            if (struct.isSetCached()) {
                tTupleProtocol.writeI32(struct.cached);
            }
            if (struct.isSetBtn_light()) {
                tTupleProtocol.writeI32(struct.btn_light);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class StartupAdTupleSchemeFactory implements SchemeFactory {
        private StartupAdTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public StartupAdTupleScheme getScheme() {
            return new StartupAdTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        AD_ID(1, "ad_id"),
        IMG(2, SocialConstants.PARAM_IMG_URL),
        START_TIME(3, "start_time"),
        END_TIME(4, "end_time"),
        SHOW_TIMES(5, "show_times"),
        SHOW_SECONDS(6, "show_seconds"),
        LINK(7, y9.b.f99687c),
        BACKUP_LINK(8, "backup_link"),
        EXT_AD_ID(9, "ext_ad_id"),
        AD_TYPE(10, "ad_type"),
        FULL(11, "full"),
        RES_TYPE(12, "res_type"),
        AD_RESP(13, "ad_resp"),
        CACHED(14, "cached"),
        BTN_LIGHT(15, "btn_light");

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
                    return AD_ID;
                case 2:
                    return IMG;
                case 3:
                    return START_TIME;
                case 4:
                    return END_TIME;
                case 5:
                    return SHOW_TIMES;
                case 6:
                    return SHOW_SECONDS;
                case 7:
                    return LINK;
                case 8:
                    return BACKUP_LINK;
                case 9:
                    return EXT_AD_ID;
                case 10:
                    return AD_TYPE;
                case 11:
                    return FULL;
                case 12:
                    return RES_TYPE;
                case 13:
                    return AD_RESP;
                case 14:
                    return CACHED;
                case 15:
                    return BTN_LIGHT;
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
        hashMap.put(StandardScheme.class, new StartupAdStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new StartupAdTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.AD_ID, (_Fields) new FieldMetaData("ad_id", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.IMG, (_Fields) new FieldMetaData(SocialConstants.PARAM_IMG_URL, (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.START_TIME, (_Fields) new FieldMetaData("start_time", (byte) 1, new FieldValueMetaData((byte) 10)));
        enumMap.put((EnumMap) _Fields.END_TIME, (_Fields) new FieldMetaData("end_time", (byte) 1, new FieldValueMetaData((byte) 10)));
        enumMap.put((EnumMap) _Fields.SHOW_TIMES, (_Fields) new FieldMetaData("show_times", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.SHOW_SECONDS, (_Fields) new FieldMetaData("show_seconds", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.LINK, (_Fields) new FieldMetaData(y9.b.f99687c, (byte) 2, new StructMetaData((byte) 12, AdLink.class)));
        enumMap.put((EnumMap) _Fields.BACKUP_LINK, (_Fields) new FieldMetaData("backup_link", (byte) 2, new StructMetaData((byte) 12, AdLink.class)));
        enumMap.put((EnumMap) _Fields.EXT_AD_ID, (_Fields) new FieldMetaData("ext_ad_id", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.AD_TYPE, (_Fields) new FieldMetaData("ad_type", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.FULL, (_Fields) new FieldMetaData("full", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.RES_TYPE, (_Fields) new FieldMetaData("res_type", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.AD_RESP, (_Fields) new FieldMetaData("ad_resp", (byte) 2, new StructMetaData((byte) 12, AdExtraResp.class)));
        enumMap.put((EnumMap) _Fields.CACHED, (_Fields) new FieldMetaData("cached", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.BTN_LIGHT, (_Fields) new FieldMetaData("btn_light", (byte) 2, new FieldValueMetaData((byte) 8)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(StartupAd.class, unmodifiableMap);
    }

    public StartupAd() {
        this.__isset_bitfield = (short) 0;
        this.optionals = new _Fields[]{_Fields.LINK, _Fields.BACKUP_LINK, _Fields.EXT_AD_ID, _Fields.AD_TYPE, _Fields.FULL, _Fields.RES_TYPE, _Fields.AD_RESP, _Fields.CACHED, _Fields.BTN_LIGHT};
    }

    private void readObject(ObjectInputStream in2) throws IOException, ClassNotFoundException {
        try {
            this.__isset_bitfield = (short) 0;
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
        setAd_idIsSet(false);
        this.ad_id = 0;
        this.img = null;
        setStart_timeIsSet(false);
        this.start_time = 0L;
        setEnd_timeIsSet(false);
        this.end_time = 0L;
        setShow_timesIsSet(false);
        this.show_times = 0;
        setShow_secondsIsSet(false);
        this.show_seconds = 0;
        this.link = null;
        this.backup_link = null;
        this.ext_ad_id = null;
        setAd_typeIsSet(false);
        this.ad_type = 0;
        setFullIsSet(false);
        this.full = 0;
        setRes_typeIsSet(false);
        this.res_type = 0;
        this.ad_resp = null;
        setCachedIsSet(false);
        this.cached = 0;
        setBtn_lightIsSet(false);
        this.btn_light = 0;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof StartupAd)) {
            return equals((StartupAd) that);
        }
        return false;
    }

    public int getAd_id() {
        return this.ad_id;
    }

    public AdExtraResp getAd_resp() {
        return this.ad_resp;
    }

    public int getAd_type() {
        return this.ad_type;
    }

    public AdLink getBackup_link() {
        return this.backup_link;
    }

    public int getBtn_light() {
        return this.btn_light;
    }

    public int getCached() {
        return this.cached;
    }

    public long getEnd_time() {
        return this.end_time;
    }

    public String getExt_ad_id() {
        return this.ext_ad_id;
    }

    public int getFull() {
        return this.full;
    }

    public String getImg() {
        return this.img;
    }

    public AdLink getLink() {
        return this.link;
    }

    public int getRes_type() {
        return this.res_type;
    }

    public int getShow_seconds() {
        return this.show_seconds;
    }

    public int getShow_times() {
        return this.show_times;
    }

    public long getStart_time() {
        return this.start_time;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetAd_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetAd_resp() {
        return this.ad_resp != null;
    }

    public boolean isSetAd_type() {
        return EncodingUtils.testBit(this.__isset_bitfield, 5);
    }

    public boolean isSetBackup_link() {
        return this.backup_link != null;
    }

    public boolean isSetBtn_light() {
        return EncodingUtils.testBit(this.__isset_bitfield, 9);
    }

    public boolean isSetCached() {
        return EncodingUtils.testBit(this.__isset_bitfield, 8);
    }

    public boolean isSetEnd_time() {
        return EncodingUtils.testBit(this.__isset_bitfield, 2);
    }

    public boolean isSetExt_ad_id() {
        return this.ext_ad_id != null;
    }

    public boolean isSetFull() {
        return EncodingUtils.testBit(this.__isset_bitfield, 6);
    }

    public boolean isSetImg() {
        return this.img != null;
    }

    public boolean isSetLink() {
        return this.link != null;
    }

    public boolean isSetRes_type() {
        return EncodingUtils.testBit(this.__isset_bitfield, 7);
    }

    public boolean isSetShow_seconds() {
        return EncodingUtils.testBit(this.__isset_bitfield, 4);
    }

    public boolean isSetShow_times() {
        return EncodingUtils.testBit(this.__isset_bitfield, 3);
    }

    public boolean isSetStart_time() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public StartupAd setAd_id(int ad_id) {
        this.ad_id = ad_id;
        setAd_idIsSet(true);
        return this;
    }

    public void setAd_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public StartupAd setAd_resp(AdExtraResp ad_resp) {
        this.ad_resp = ad_resp;
        return this;
    }

    public void setAd_respIsSet(boolean value) {
        if (value) {
            return;
        }
        this.ad_resp = null;
    }

    public StartupAd setAd_type(int ad_type) {
        this.ad_type = ad_type;
        setAd_typeIsSet(true);
        return this;
    }

    public void setAd_typeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 5, value);
    }

    public StartupAd setBackup_link(AdLink backup_link) {
        this.backup_link = backup_link;
        return this;
    }

    public void setBackup_linkIsSet(boolean value) {
        if (value) {
            return;
        }
        this.backup_link = null;
    }

    public StartupAd setBtn_light(int btn_light) {
        this.btn_light = btn_light;
        setBtn_lightIsSet(true);
        return this;
    }

    public void setBtn_lightIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 9, value);
    }

    public StartupAd setCached(int cached) {
        this.cached = cached;
        setCachedIsSet(true);
        return this;
    }

    public void setCachedIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 8, value);
    }

    public StartupAd setEnd_time(long end_time) {
        this.end_time = end_time;
        setEnd_timeIsSet(true);
        return this;
    }

    public void setEnd_timeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 2, value);
    }

    public StartupAd setExt_ad_id(String ext_ad_id) {
        this.ext_ad_id = ext_ad_id;
        return this;
    }

    public void setExt_ad_idIsSet(boolean value) {
        if (value) {
            return;
        }
        this.ext_ad_id = null;
    }

    public StartupAd setFull(int full) {
        this.full = full;
        setFullIsSet(true);
        return this;
    }

    public void setFullIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 6, value);
    }

    public StartupAd setImg(String img) {
        this.img = img;
        return this;
    }

    public void setImgIsSet(boolean value) {
        if (value) {
            return;
        }
        this.img = null;
    }

    public StartupAd setLink(AdLink link) {
        this.link = link;
        return this;
    }

    public void setLinkIsSet(boolean value) {
        if (value) {
            return;
        }
        this.link = null;
    }

    public StartupAd setRes_type(int res_type) {
        this.res_type = res_type;
        setRes_typeIsSet(true);
        return this;
    }

    public void setRes_typeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 7, value);
    }

    public StartupAd setShow_seconds(int show_seconds) {
        this.show_seconds = show_seconds;
        setShow_secondsIsSet(true);
        return this;
    }

    public void setShow_secondsIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 4, value);
    }

    public StartupAd setShow_times(int show_times) {
        this.show_times = show_times;
        setShow_timesIsSet(true);
        return this;
    }

    public void setShow_timesIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 3, value);
    }

    public StartupAd setStart_time(long start_time) {
        this.start_time = start_time;
        setStart_timeIsSet(true);
        return this;
    }

    public void setStart_timeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("StartupAd(");
        sb2.append("ad_id:");
        sb2.append(this.ad_id);
        sb2.append(j2.O);
        sb2.append("img:");
        String str = this.img;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(j2.O);
        sb2.append("start_time:");
        sb2.append(this.start_time);
        sb2.append(j2.O);
        sb2.append("end_time:");
        sb2.append(this.end_time);
        sb2.append(j2.O);
        sb2.append("show_times:");
        sb2.append(this.show_times);
        sb2.append(j2.O);
        sb2.append("show_seconds:");
        sb2.append(this.show_seconds);
        if (isSetLink()) {
            sb2.append(j2.O);
            sb2.append("link:");
            AdLink adLink = this.link;
            if (adLink == null) {
                sb2.append("null");
            } else {
                sb2.append(adLink);
            }
        }
        if (isSetBackup_link()) {
            sb2.append(j2.O);
            sb2.append("backup_link:");
            AdLink adLink2 = this.backup_link;
            if (adLink2 == null) {
                sb2.append("null");
            } else {
                sb2.append(adLink2);
            }
        }
        if (isSetExt_ad_id()) {
            sb2.append(j2.O);
            sb2.append("ext_ad_id:");
            String str2 = this.ext_ad_id;
            if (str2 == null) {
                sb2.append("null");
            } else {
                sb2.append(str2);
            }
        }
        if (isSetAd_type()) {
            sb2.append(j2.O);
            sb2.append("ad_type:");
            sb2.append(this.ad_type);
        }
        if (isSetFull()) {
            sb2.append(j2.O);
            sb2.append("full:");
            sb2.append(this.full);
        }
        if (isSetRes_type()) {
            sb2.append(j2.O);
            sb2.append("res_type:");
            sb2.append(this.res_type);
        }
        if (isSetAd_resp()) {
            sb2.append(j2.O);
            sb2.append("ad_resp:");
            AdExtraResp adExtraResp = this.ad_resp;
            if (adExtraResp == null) {
                sb2.append("null");
            } else {
                sb2.append(adExtraResp);
            }
        }
        if (isSetCached()) {
            sb2.append(j2.O);
            sb2.append("cached:");
            sb2.append(this.cached);
        }
        if (isSetBtn_light()) {
            sb2.append(j2.O);
            sb2.append("btn_light:");
            sb2.append(this.btn_light);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetAd_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetAd_resp() {
        this.ad_resp = null;
    }

    public void unsetAd_type() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 5);
    }

    public void unsetBackup_link() {
        this.backup_link = null;
    }

    public void unsetBtn_light() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 9);
    }

    public void unsetCached() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 8);
    }

    public void unsetEnd_time() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 2);
    }

    public void unsetExt_ad_id() {
        this.ext_ad_id = null;
    }

    public void unsetFull() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 6);
    }

    public void unsetImg() {
        this.img = null;
    }

    public void unsetLink() {
        this.link = null;
    }

    public void unsetRes_type() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 7);
    }

    public void unsetShow_seconds() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 4);
    }

    public void unsetShow_times() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 3);
    }

    public void unsetStart_time() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void validate() throws TException {
        if (this.img == null) {
            throw new TProtocolException("Required field 'img' was not present! Struct: " + toString());
        }
        AdLink adLink = this.link;
        if (adLink != null) {
            adLink.validate();
        }
        AdLink adLink2 = this.backup_link;
        if (adLink2 != null) {
            adLink2.validate();
        }
        AdExtraResp adExtraResp = this.ad_resp;
        if (adExtraResp != null) {
            adExtraResp.validate();
        }
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(StartupAd other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        int compareTo5;
        int compareTo6;
        int compareTo7;
        int compareTo8;
        int compareTo9;
        int compareTo10;
        int compareTo11;
        int compareTo12;
        int compareTo13;
        int compareTo14;
        int compareTo15;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo16 = Boolean.valueOf(isSetAd_id()).compareTo(Boolean.valueOf(other.isSetAd_id()));
        if (compareTo16 != 0) {
            return compareTo16;
        }
        if (isSetAd_id() && (compareTo15 = TBaseHelper.compareTo(this.ad_id, other.ad_id)) != 0) {
            return compareTo15;
        }
        int compareTo17 = Boolean.valueOf(isSetImg()).compareTo(Boolean.valueOf(other.isSetImg()));
        if (compareTo17 != 0) {
            return compareTo17;
        }
        if (isSetImg() && (compareTo14 = TBaseHelper.compareTo(this.img, other.img)) != 0) {
            return compareTo14;
        }
        int compareTo18 = Boolean.valueOf(isSetStart_time()).compareTo(Boolean.valueOf(other.isSetStart_time()));
        if (compareTo18 != 0) {
            return compareTo18;
        }
        if (isSetStart_time() && (compareTo13 = TBaseHelper.compareTo(this.start_time, other.start_time)) != 0) {
            return compareTo13;
        }
        int compareTo19 = Boolean.valueOf(isSetEnd_time()).compareTo(Boolean.valueOf(other.isSetEnd_time()));
        if (compareTo19 != 0) {
            return compareTo19;
        }
        if (isSetEnd_time() && (compareTo12 = TBaseHelper.compareTo(this.end_time, other.end_time)) != 0) {
            return compareTo12;
        }
        int compareTo20 = Boolean.valueOf(isSetShow_times()).compareTo(Boolean.valueOf(other.isSetShow_times()));
        if (compareTo20 != 0) {
            return compareTo20;
        }
        if (isSetShow_times() && (compareTo11 = TBaseHelper.compareTo(this.show_times, other.show_times)) != 0) {
            return compareTo11;
        }
        int compareTo21 = Boolean.valueOf(isSetShow_seconds()).compareTo(Boolean.valueOf(other.isSetShow_seconds()));
        if (compareTo21 != 0) {
            return compareTo21;
        }
        if (isSetShow_seconds() && (compareTo10 = TBaseHelper.compareTo(this.show_seconds, other.show_seconds)) != 0) {
            return compareTo10;
        }
        int compareTo22 = Boolean.valueOf(isSetLink()).compareTo(Boolean.valueOf(other.isSetLink()));
        if (compareTo22 != 0) {
            return compareTo22;
        }
        if (isSetLink() && (compareTo9 = TBaseHelper.compareTo((Comparable) this.link, (Comparable) other.link)) != 0) {
            return compareTo9;
        }
        int compareTo23 = Boolean.valueOf(isSetBackup_link()).compareTo(Boolean.valueOf(other.isSetBackup_link()));
        if (compareTo23 != 0) {
            return compareTo23;
        }
        if (isSetBackup_link() && (compareTo8 = TBaseHelper.compareTo((Comparable) this.backup_link, (Comparable) other.backup_link)) != 0) {
            return compareTo8;
        }
        int compareTo24 = Boolean.valueOf(isSetExt_ad_id()).compareTo(Boolean.valueOf(other.isSetExt_ad_id()));
        if (compareTo24 != 0) {
            return compareTo24;
        }
        if (isSetExt_ad_id() && (compareTo7 = TBaseHelper.compareTo(this.ext_ad_id, other.ext_ad_id)) != 0) {
            return compareTo7;
        }
        int compareTo25 = Boolean.valueOf(isSetAd_type()).compareTo(Boolean.valueOf(other.isSetAd_type()));
        if (compareTo25 != 0) {
            return compareTo25;
        }
        if (isSetAd_type() && (compareTo6 = TBaseHelper.compareTo(this.ad_type, other.ad_type)) != 0) {
            return compareTo6;
        }
        int compareTo26 = Boolean.valueOf(isSetFull()).compareTo(Boolean.valueOf(other.isSetFull()));
        if (compareTo26 != 0) {
            return compareTo26;
        }
        if (isSetFull() && (compareTo5 = TBaseHelper.compareTo(this.full, other.full)) != 0) {
            return compareTo5;
        }
        int compareTo27 = Boolean.valueOf(isSetRes_type()).compareTo(Boolean.valueOf(other.isSetRes_type()));
        if (compareTo27 != 0) {
            return compareTo27;
        }
        if (isSetRes_type() && (compareTo4 = TBaseHelper.compareTo(this.res_type, other.res_type)) != 0) {
            return compareTo4;
        }
        int compareTo28 = Boolean.valueOf(isSetAd_resp()).compareTo(Boolean.valueOf(other.isSetAd_resp()));
        if (compareTo28 != 0) {
            return compareTo28;
        }
        if (isSetAd_resp() && (compareTo3 = TBaseHelper.compareTo((Comparable) this.ad_resp, (Comparable) other.ad_resp)) != 0) {
            return compareTo3;
        }
        int compareTo29 = Boolean.valueOf(isSetCached()).compareTo(Boolean.valueOf(other.isSetCached()));
        if (compareTo29 != 0) {
            return compareTo29;
        }
        if (isSetCached() && (compareTo2 = TBaseHelper.compareTo(this.cached, other.cached)) != 0) {
            return compareTo2;
        }
        int compareTo30 = Boolean.valueOf(isSetBtn_light()).compareTo(Boolean.valueOf(other.isSetBtn_light()));
        if (compareTo30 != 0) {
            return compareTo30;
        }
        if (!isSetBtn_light() || (compareTo = TBaseHelper.compareTo(this.btn_light, other.btn_light)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<StartupAd, _Fields> deepCopy2() {
        return new StartupAd(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$advertise_api$StartupAd$_Fields[field.ordinal()]) {
            case 1:
                return Integer.valueOf(getAd_id());
            case 2:
                return getImg();
            case 3:
                return Long.valueOf(getStart_time());
            case 4:
                return Long.valueOf(getEnd_time());
            case 5:
                return Integer.valueOf(getShow_times());
            case 6:
                return Integer.valueOf(getShow_seconds());
            case 7:
                return getLink();
            case 8:
                return getBackup_link();
            case 9:
                return getExt_ad_id();
            case 10:
                return Integer.valueOf(getAd_type());
            case 11:
                return Integer.valueOf(getFull());
            case 12:
                return Integer.valueOf(getRes_type());
            case 13:
                return getAd_resp();
            case 14:
                return Integer.valueOf(getCached());
            case 15:
                return Integer.valueOf(getBtn_light());
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$advertise_api$StartupAd$_Fields[field.ordinal()]) {
            case 1:
                return isSetAd_id();
            case 2:
                return isSetImg();
            case 3:
                return isSetStart_time();
            case 4:
                return isSetEnd_time();
            case 5:
                return isSetShow_times();
            case 6:
                return isSetShow_seconds();
            case 7:
                return isSetLink();
            case 8:
                return isSetBackup_link();
            case 9:
                return isSetExt_ad_id();
            case 10:
                return isSetAd_type();
            case 11:
                return isSetFull();
            case 12:
                return isSetRes_type();
            case 13:
                return isSetAd_resp();
            case 14:
                return isSetCached();
            case 15:
                return isSetBtn_light();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$advertise_api$StartupAd$_Fields[field.ordinal()]) {
            case 1:
                if (value != null) {
                    setAd_id(((Integer) value).intValue());
                    break;
                } else {
                    unsetAd_id();
                    break;
                }
            case 2:
                if (value != null) {
                    setImg((String) value);
                    break;
                } else {
                    unsetImg();
                    break;
                }
            case 3:
                if (value != null) {
                    setStart_time(((Long) value).longValue());
                    break;
                } else {
                    unsetStart_time();
                    break;
                }
            case 4:
                if (value != null) {
                    setEnd_time(((Long) value).longValue());
                    break;
                } else {
                    unsetEnd_time();
                    break;
                }
            case 5:
                if (value != null) {
                    setShow_times(((Integer) value).intValue());
                    break;
                } else {
                    unsetShow_times();
                    break;
                }
            case 6:
                if (value != null) {
                    setShow_seconds(((Integer) value).intValue());
                    break;
                } else {
                    unsetShow_seconds();
                    break;
                }
            case 7:
                if (value != null) {
                    setLink((AdLink) value);
                    break;
                } else {
                    unsetLink();
                    break;
                }
            case 8:
                if (value != null) {
                    setBackup_link((AdLink) value);
                    break;
                } else {
                    unsetBackup_link();
                    break;
                }
            case 9:
                if (value != null) {
                    setExt_ad_id((String) value);
                    break;
                } else {
                    unsetExt_ad_id();
                    break;
                }
            case 10:
                if (value != null) {
                    setAd_type(((Integer) value).intValue());
                    break;
                } else {
                    unsetAd_type();
                    break;
                }
            case 11:
                if (value != null) {
                    setFull(((Integer) value).intValue());
                    break;
                } else {
                    unsetFull();
                    break;
                }
            case 12:
                if (value != null) {
                    setRes_type(((Integer) value).intValue());
                    break;
                } else {
                    unsetRes_type();
                    break;
                }
            case 13:
                if (value != null) {
                    setAd_resp((AdExtraResp) value);
                    break;
                } else {
                    unsetAd_resp();
                    break;
                }
            case 14:
                if (value != null) {
                    setCached(((Integer) value).intValue());
                    break;
                } else {
                    unsetCached();
                    break;
                }
            case 15:
                if (value != null) {
                    setBtn_light(((Integer) value).intValue());
                    break;
                } else {
                    unsetBtn_light();
                    break;
                }
        }
    }

    public boolean equals(StartupAd that) {
        if (that == null || this.ad_id != that.ad_id) {
            return false;
        }
        boolean isSetImg = isSetImg();
        boolean isSetImg2 = that.isSetImg();
        if (((isSetImg || isSetImg2) && (!isSetImg || !isSetImg2 || !this.img.equals(that.img))) || this.start_time != that.start_time || this.end_time != that.end_time || this.show_times != that.show_times || this.show_seconds != that.show_seconds) {
            return false;
        }
        boolean isSetLink = isSetLink();
        boolean isSetLink2 = that.isSetLink();
        if ((isSetLink || isSetLink2) && !(isSetLink && isSetLink2 && this.link.equals(that.link))) {
            return false;
        }
        boolean isSetBackup_link = isSetBackup_link();
        boolean isSetBackup_link2 = that.isSetBackup_link();
        if ((isSetBackup_link || isSetBackup_link2) && !(isSetBackup_link && isSetBackup_link2 && this.backup_link.equals(that.backup_link))) {
            return false;
        }
        boolean isSetExt_ad_id = isSetExt_ad_id();
        boolean isSetExt_ad_id2 = that.isSetExt_ad_id();
        if ((isSetExt_ad_id || isSetExt_ad_id2) && !(isSetExt_ad_id && isSetExt_ad_id2 && this.ext_ad_id.equals(that.ext_ad_id))) {
            return false;
        }
        boolean isSetAd_type = isSetAd_type();
        boolean isSetAd_type2 = that.isSetAd_type();
        if ((isSetAd_type || isSetAd_type2) && !(isSetAd_type && isSetAd_type2 && this.ad_type == that.ad_type)) {
            return false;
        }
        boolean isSetFull = isSetFull();
        boolean isSetFull2 = that.isSetFull();
        if ((isSetFull || isSetFull2) && !(isSetFull && isSetFull2 && this.full == that.full)) {
            return false;
        }
        boolean isSetRes_type = isSetRes_type();
        boolean isSetRes_type2 = that.isSetRes_type();
        if ((isSetRes_type || isSetRes_type2) && !(isSetRes_type && isSetRes_type2 && this.res_type == that.res_type)) {
            return false;
        }
        boolean isSetAd_resp = isSetAd_resp();
        boolean isSetAd_resp2 = that.isSetAd_resp();
        if ((isSetAd_resp || isSetAd_resp2) && !(isSetAd_resp && isSetAd_resp2 && this.ad_resp.equals(that.ad_resp))) {
            return false;
        }
        boolean isSetCached = isSetCached();
        boolean isSetCached2 = that.isSetCached();
        if ((isSetCached || isSetCached2) && !(isSetCached && isSetCached2 && this.cached == that.cached)) {
            return false;
        }
        boolean isSetBtn_light = isSetBtn_light();
        boolean isSetBtn_light2 = that.isSetBtn_light();
        if (isSetBtn_light || isSetBtn_light2) {
            return isSetBtn_light && isSetBtn_light2 && this.btn_light == that.btn_light;
        }
        return true;
    }

    public StartupAd(int ad_id, String img, long start_time, long end_time, int show_times, int show_seconds) {
        this();
        this.ad_id = ad_id;
        setAd_idIsSet(true);
        this.img = img;
        this.start_time = start_time;
        setStart_timeIsSet(true);
        this.end_time = end_time;
        setEnd_timeIsSet(true);
        this.show_times = show_times;
        setShow_timesIsSet(true);
        this.show_seconds = show_seconds;
        setShow_secondsIsSet(true);
    }

    public StartupAd(StartupAd other) {
        this.__isset_bitfield = (short) 0;
        this.optionals = new _Fields[]{_Fields.LINK, _Fields.BACKUP_LINK, _Fields.EXT_AD_ID, _Fields.AD_TYPE, _Fields.FULL, _Fields.RES_TYPE, _Fields.AD_RESP, _Fields.CACHED, _Fields.BTN_LIGHT};
        this.__isset_bitfield = other.__isset_bitfield;
        this.ad_id = other.ad_id;
        if (other.isSetImg()) {
            this.img = other.img;
        }
        this.start_time = other.start_time;
        this.end_time = other.end_time;
        this.show_times = other.show_times;
        this.show_seconds = other.show_seconds;
        if (other.isSetLink()) {
            this.link = new AdLink(other.link);
        }
        if (other.isSetBackup_link()) {
            this.backup_link = new AdLink(other.backup_link);
        }
        if (other.isSetExt_ad_id()) {
            this.ext_ad_id = other.ext_ad_id;
        }
        this.ad_type = other.ad_type;
        this.full = other.full;
        this.res_type = other.res_type;
        if (other.isSetAd_resp()) {
            this.ad_resp = new AdExtraResp(other.ad_resp);
        }
        this.cached = other.cached;
        this.btn_light = other.btn_light;
    }
}

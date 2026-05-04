package com.baicizhan.online.ad_property;

import com.igexin.push.g.o;
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
import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.protocol.TField;
import org.apache.thrift.protocol.TList;
import org.apache.thrift.protocol.TProtocol;
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
/* loaded from: classes5.dex */
public class AdDeviceInfo implements TBase<AdDeviceInfo, _Fields>, Serializable, Cloneable, Comparable<AdDeviceInfo> {
    private static final int __CARRIER_ISSET_ID = 0;
    private static final int __CONNECTION_TYPE_ISSET_ID = 1;
    private static final int __DENSITY_ISSET_ID = 6;
    private static final int __DPI_ISSET_ID = 5;
    private static final int __ORI_ISSET_ID = 7;
    private static final int __PPI_ISSET_ID = 4;
    private static final int __SH_ISSET_ID = 3;
    private static final int __SW_ISSET_ID = 2;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public String aid;
    public List<Integer> apps;
    public String caid;
    public String caid_version;
    public int carrier;
    public int connection_type;
    public int density;
    public String device_make;
    public int dpi;
    public String idfa;
    public String model;
    public String oaid;
    private _Fields[] optionals;
    public int ori;
    public String paid;
    public int ppi;

    /* renamed from: sh, reason: collision with root package name */
    public int f28133sh;

    /* renamed from: sw, reason: collision with root package name */
    public int f28134sw;

    /* renamed from: ua, reason: collision with root package name */
    public String f28135ua;
    public String ver_code_ag;
    public String ver_code_hms;
    private static final TStruct STRUCT_DESC = new TStruct("AdDeviceInfo");
    private static final TField OAID_FIELD_DESC = new TField("oaid", (byte) 11, 1);
    private static final TField AID_FIELD_DESC = new TField("aid", (byte) 11, 2);
    private static final TField IDFA_FIELD_DESC = new TField("idfa", (byte) 11, 3);
    private static final TField CAID_FIELD_DESC = new TField("caid", (byte) 11, 4);
    private static final TField CAID_VERSION_FIELD_DESC = new TField("caid_version", (byte) 11, 5);
    private static final TField DEVICE_MAKE_FIELD_DESC = new TField("device_make", (byte) 11, 6);
    private static final TField MODEL_FIELD_DESC = new TField("model", (byte) 11, 7);
    private static final TField UA_FIELD_DESC = new TField(o.f38735d, (byte) 11, 8);
    private static final TField CARRIER_FIELD_DESC = new TField(ma.b.f72892b0, (byte) 8, 9);
    private static final TField CONNECTION_TYPE_FIELD_DESC = new TField("connection_type", (byte) 8, 10);
    private static final TField SW_FIELD_DESC = new TField("sw", (byte) 8, 11);
    private static final TField SH_FIELD_DESC = new TField("sh", (byte) 8, 12);
    private static final TField PPI_FIELD_DESC = new TField("ppi", (byte) 8, 13);
    private static final TField DPI_FIELD_DESC = new TField("dpi", (byte) 8, 14);
    private static final TField DENSITY_FIELD_DESC = new TField("density", (byte) 8, 15);
    private static final TField ORI_FIELD_DESC = new TField("ori", (byte) 8, 16);
    private static final TField APPS_FIELD_DESC = new TField("apps", (byte) 15, 17);
    private static final TField VER_CODE_HMS_FIELD_DESC = new TField("ver_code_hms", (byte) 11, 18);
    private static final TField VER_CODE_AG_FIELD_DESC = new TField("ver_code_ag", (byte) 11, 19);
    private static final TField PAID_FIELD_DESC = new TField("paid", (byte) 11, 20);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.ad_property.AdDeviceInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$ad_property$AdDeviceInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$ad_property$AdDeviceInfo$_Fields = iArr;
            try {
                iArr[_Fields.OAID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$ad_property$AdDeviceInfo$_Fields[_Fields.AID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$ad_property$AdDeviceInfo$_Fields[_Fields.IDFA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$ad_property$AdDeviceInfo$_Fields[_Fields.CAID.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$ad_property$AdDeviceInfo$_Fields[_Fields.CAID_VERSION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$baicizhan$online$ad_property$AdDeviceInfo$_Fields[_Fields.DEVICE_MAKE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$baicizhan$online$ad_property$AdDeviceInfo$_Fields[_Fields.MODEL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$baicizhan$online$ad_property$AdDeviceInfo$_Fields[_Fields.UA.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$baicizhan$online$ad_property$AdDeviceInfo$_Fields[_Fields.CARRIER.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$baicizhan$online$ad_property$AdDeviceInfo$_Fields[_Fields.CONNECTION_TYPE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$baicizhan$online$ad_property$AdDeviceInfo$_Fields[_Fields.SW.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$baicizhan$online$ad_property$AdDeviceInfo$_Fields[_Fields.SH.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$baicizhan$online$ad_property$AdDeviceInfo$_Fields[_Fields.PPI.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$baicizhan$online$ad_property$AdDeviceInfo$_Fields[_Fields.DPI.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$baicizhan$online$ad_property$AdDeviceInfo$_Fields[_Fields.DENSITY.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$baicizhan$online$ad_property$AdDeviceInfo$_Fields[_Fields.ORI.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$baicizhan$online$ad_property$AdDeviceInfo$_Fields[_Fields.APPS.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$com$baicizhan$online$ad_property$AdDeviceInfo$_Fields[_Fields.VER_CODE_HMS.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                $SwitchMap$com$baicizhan$online$ad_property$AdDeviceInfo$_Fields[_Fields.VER_CODE_AG.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                $SwitchMap$com$baicizhan$online$ad_property$AdDeviceInfo$_Fields[_Fields.PAID.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AdDeviceInfoStandardScheme extends StandardScheme<AdDeviceInfo> {
        private AdDeviceInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, AdDeviceInfo struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    iprot.readStructEnd();
                    struct.validate();
                    return;
                }
                switch (readFieldBegin.f77768id) {
                    case 1:
                        if (b11 == 11) {
                            struct.oaid = iprot.readString();
                            struct.setOaidIsSet(true);
                            break;
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        }
                    case 2:
                        if (b11 == 11) {
                            struct.aid = iprot.readString();
                            struct.setAidIsSet(true);
                            break;
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        }
                    case 3:
                        if (b11 == 11) {
                            struct.idfa = iprot.readString();
                            struct.setIdfaIsSet(true);
                            break;
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        }
                    case 4:
                        if (b11 == 11) {
                            struct.caid = iprot.readString();
                            struct.setCaidIsSet(true);
                            break;
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        }
                    case 5:
                        if (b11 == 11) {
                            struct.caid_version = iprot.readString();
                            struct.setCaid_versionIsSet(true);
                            break;
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        }
                    case 6:
                        if (b11 == 11) {
                            struct.device_make = iprot.readString();
                            struct.setDevice_makeIsSet(true);
                            break;
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        }
                    case 7:
                        if (b11 == 11) {
                            struct.model = iprot.readString();
                            struct.setModelIsSet(true);
                            break;
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        }
                    case 8:
                        if (b11 == 11) {
                            struct.f28135ua = iprot.readString();
                            struct.setUaIsSet(true);
                            break;
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        }
                    case 9:
                        if (b11 == 8) {
                            struct.carrier = iprot.readI32();
                            struct.setCarrierIsSet(true);
                            break;
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        }
                    case 10:
                        if (b11 == 8) {
                            struct.connection_type = iprot.readI32();
                            struct.setConnection_typeIsSet(true);
                            break;
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        }
                    case 11:
                        if (b11 == 8) {
                            struct.f28134sw = iprot.readI32();
                            struct.setSwIsSet(true);
                            break;
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        }
                    case 12:
                        if (b11 == 8) {
                            struct.f28133sh = iprot.readI32();
                            struct.setShIsSet(true);
                            break;
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        }
                    case 13:
                        if (b11 == 8) {
                            struct.ppi = iprot.readI32();
                            struct.setPpiIsSet(true);
                            break;
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        }
                    case 14:
                        if (b11 == 8) {
                            struct.dpi = iprot.readI32();
                            struct.setDpiIsSet(true);
                            break;
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        }
                    case 15:
                        if (b11 == 8) {
                            struct.density = iprot.readI32();
                            struct.setDensityIsSet(true);
                            break;
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        }
                    case 16:
                        if (b11 == 8) {
                            struct.ori = iprot.readI32();
                            struct.setOriIsSet(true);
                            break;
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        }
                    case 17:
                        if (b11 == 15) {
                            TList readListBegin = iprot.readListBegin();
                            struct.apps = new ArrayList(readListBegin.size);
                            for (int i11 = 0; i11 < readListBegin.size; i11++) {
                                struct.apps.add(Integer.valueOf(iprot.readI32()));
                            }
                            iprot.readListEnd();
                            struct.setAppsIsSet(true);
                            break;
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        }
                    case 18:
                        if (b11 == 11) {
                            struct.ver_code_hms = iprot.readString();
                            struct.setVer_code_hmsIsSet(true);
                            break;
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        }
                    case 19:
                        if (b11 == 11) {
                            struct.ver_code_ag = iprot.readString();
                            struct.setVer_code_agIsSet(true);
                            break;
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        }
                    case 20:
                        if (b11 == 11) {
                            struct.paid = iprot.readString();
                            struct.setPaidIsSet(true);
                            break;
                        } else {
                            TProtocolUtil.skip(iprot, b11);
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
        public void write(TProtocol oprot, AdDeviceInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(AdDeviceInfo.STRUCT_DESC);
            if (struct.oaid != null && struct.isSetOaid()) {
                oprot.writeFieldBegin(AdDeviceInfo.OAID_FIELD_DESC);
                oprot.writeString(struct.oaid);
                oprot.writeFieldEnd();
            }
            if (struct.aid != null && struct.isSetAid()) {
                oprot.writeFieldBegin(AdDeviceInfo.AID_FIELD_DESC);
                oprot.writeString(struct.aid);
                oprot.writeFieldEnd();
            }
            if (struct.idfa != null && struct.isSetIdfa()) {
                oprot.writeFieldBegin(AdDeviceInfo.IDFA_FIELD_DESC);
                oprot.writeString(struct.idfa);
                oprot.writeFieldEnd();
            }
            if (struct.caid != null && struct.isSetCaid()) {
                oprot.writeFieldBegin(AdDeviceInfo.CAID_FIELD_DESC);
                oprot.writeString(struct.caid);
                oprot.writeFieldEnd();
            }
            if (struct.caid_version != null && struct.isSetCaid_version()) {
                oprot.writeFieldBegin(AdDeviceInfo.CAID_VERSION_FIELD_DESC);
                oprot.writeString(struct.caid_version);
                oprot.writeFieldEnd();
            }
            if (struct.device_make != null && struct.isSetDevice_make()) {
                oprot.writeFieldBegin(AdDeviceInfo.DEVICE_MAKE_FIELD_DESC);
                oprot.writeString(struct.device_make);
                oprot.writeFieldEnd();
            }
            if (struct.model != null && struct.isSetModel()) {
                oprot.writeFieldBegin(AdDeviceInfo.MODEL_FIELD_DESC);
                oprot.writeString(struct.model);
                oprot.writeFieldEnd();
            }
            if (struct.f28135ua != null && struct.isSetUa()) {
                oprot.writeFieldBegin(AdDeviceInfo.UA_FIELD_DESC);
                oprot.writeString(struct.f28135ua);
                oprot.writeFieldEnd();
            }
            if (struct.isSetCarrier()) {
                oprot.writeFieldBegin(AdDeviceInfo.CARRIER_FIELD_DESC);
                oprot.writeI32(struct.carrier);
                oprot.writeFieldEnd();
            }
            if (struct.isSetConnection_type()) {
                oprot.writeFieldBegin(AdDeviceInfo.CONNECTION_TYPE_FIELD_DESC);
                oprot.writeI32(struct.connection_type);
                oprot.writeFieldEnd();
            }
            if (struct.isSetSw()) {
                oprot.writeFieldBegin(AdDeviceInfo.SW_FIELD_DESC);
                oprot.writeI32(struct.f28134sw);
                oprot.writeFieldEnd();
            }
            if (struct.isSetSh()) {
                oprot.writeFieldBegin(AdDeviceInfo.SH_FIELD_DESC);
                oprot.writeI32(struct.f28133sh);
                oprot.writeFieldEnd();
            }
            if (struct.isSetPpi()) {
                oprot.writeFieldBegin(AdDeviceInfo.PPI_FIELD_DESC);
                oprot.writeI32(struct.ppi);
                oprot.writeFieldEnd();
            }
            if (struct.isSetDpi()) {
                oprot.writeFieldBegin(AdDeviceInfo.DPI_FIELD_DESC);
                oprot.writeI32(struct.dpi);
                oprot.writeFieldEnd();
            }
            if (struct.isSetDensity()) {
                oprot.writeFieldBegin(AdDeviceInfo.DENSITY_FIELD_DESC);
                oprot.writeI32(struct.density);
                oprot.writeFieldEnd();
            }
            if (struct.isSetOri()) {
                oprot.writeFieldBegin(AdDeviceInfo.ORI_FIELD_DESC);
                oprot.writeI32(struct.ori);
                oprot.writeFieldEnd();
            }
            if (struct.apps != null && struct.isSetApps()) {
                oprot.writeFieldBegin(AdDeviceInfo.APPS_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 8, struct.apps.size()));
                Iterator<Integer> it = struct.apps.iterator();
                while (it.hasNext()) {
                    oprot.writeI32(it.next().intValue());
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            if (struct.ver_code_hms != null && struct.isSetVer_code_hms()) {
                oprot.writeFieldBegin(AdDeviceInfo.VER_CODE_HMS_FIELD_DESC);
                oprot.writeString(struct.ver_code_hms);
                oprot.writeFieldEnd();
            }
            if (struct.ver_code_ag != null && struct.isSetVer_code_ag()) {
                oprot.writeFieldBegin(AdDeviceInfo.VER_CODE_AG_FIELD_DESC);
                oprot.writeString(struct.ver_code_ag);
                oprot.writeFieldEnd();
            }
            if (struct.paid != null && struct.isSetPaid()) {
                oprot.writeFieldBegin(AdDeviceInfo.PAID_FIELD_DESC);
                oprot.writeString(struct.paid);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AdDeviceInfoStandardSchemeFactory implements SchemeFactory {
        private AdDeviceInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public AdDeviceInfoStandardScheme getScheme() {
            return new AdDeviceInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AdDeviceInfoTupleScheme extends TupleScheme<AdDeviceInfo> {
        private AdDeviceInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, AdDeviceInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            BitSet readBitSet = tTupleProtocol.readBitSet(20);
            if (readBitSet.get(0)) {
                struct.oaid = tTupleProtocol.readString();
                struct.setOaidIsSet(true);
            }
            if (readBitSet.get(1)) {
                struct.aid = tTupleProtocol.readString();
                struct.setAidIsSet(true);
            }
            if (readBitSet.get(2)) {
                struct.idfa = tTupleProtocol.readString();
                struct.setIdfaIsSet(true);
            }
            if (readBitSet.get(3)) {
                struct.caid = tTupleProtocol.readString();
                struct.setCaidIsSet(true);
            }
            if (readBitSet.get(4)) {
                struct.caid_version = tTupleProtocol.readString();
                struct.setCaid_versionIsSet(true);
            }
            if (readBitSet.get(5)) {
                struct.device_make = tTupleProtocol.readString();
                struct.setDevice_makeIsSet(true);
            }
            if (readBitSet.get(6)) {
                struct.model = tTupleProtocol.readString();
                struct.setModelIsSet(true);
            }
            if (readBitSet.get(7)) {
                struct.f28135ua = tTupleProtocol.readString();
                struct.setUaIsSet(true);
            }
            if (readBitSet.get(8)) {
                struct.carrier = tTupleProtocol.readI32();
                struct.setCarrierIsSet(true);
            }
            if (readBitSet.get(9)) {
                struct.connection_type = tTupleProtocol.readI32();
                struct.setConnection_typeIsSet(true);
            }
            if (readBitSet.get(10)) {
                struct.f28134sw = tTupleProtocol.readI32();
                struct.setSwIsSet(true);
            }
            if (readBitSet.get(11)) {
                struct.f28133sh = tTupleProtocol.readI32();
                struct.setShIsSet(true);
            }
            if (readBitSet.get(12)) {
                struct.ppi = tTupleProtocol.readI32();
                struct.setPpiIsSet(true);
            }
            if (readBitSet.get(13)) {
                struct.dpi = tTupleProtocol.readI32();
                struct.setDpiIsSet(true);
            }
            if (readBitSet.get(14)) {
                struct.density = tTupleProtocol.readI32();
                struct.setDensityIsSet(true);
            }
            if (readBitSet.get(15)) {
                struct.ori = tTupleProtocol.readI32();
                struct.setOriIsSet(true);
            }
            if (readBitSet.get(16)) {
                TList tList = new TList((byte) 8, tTupleProtocol.readI32());
                struct.apps = new ArrayList(tList.size);
                for (int i11 = 0; i11 < tList.size; i11++) {
                    struct.apps.add(Integer.valueOf(tTupleProtocol.readI32()));
                }
                struct.setAppsIsSet(true);
            }
            if (readBitSet.get(17)) {
                struct.ver_code_hms = tTupleProtocol.readString();
                struct.setVer_code_hmsIsSet(true);
            }
            if (readBitSet.get(18)) {
                struct.ver_code_ag = tTupleProtocol.readString();
                struct.setVer_code_agIsSet(true);
            }
            if (readBitSet.get(19)) {
                struct.paid = tTupleProtocol.readString();
                struct.setPaidIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, AdDeviceInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            BitSet bitSet = new BitSet();
            if (struct.isSetOaid()) {
                bitSet.set(0);
            }
            if (struct.isSetAid()) {
                bitSet.set(1);
            }
            if (struct.isSetIdfa()) {
                bitSet.set(2);
            }
            if (struct.isSetCaid()) {
                bitSet.set(3);
            }
            if (struct.isSetCaid_version()) {
                bitSet.set(4);
            }
            if (struct.isSetDevice_make()) {
                bitSet.set(5);
            }
            if (struct.isSetModel()) {
                bitSet.set(6);
            }
            if (struct.isSetUa()) {
                bitSet.set(7);
            }
            if (struct.isSetCarrier()) {
                bitSet.set(8);
            }
            if (struct.isSetConnection_type()) {
                bitSet.set(9);
            }
            if (struct.isSetSw()) {
                bitSet.set(10);
            }
            if (struct.isSetSh()) {
                bitSet.set(11);
            }
            if (struct.isSetPpi()) {
                bitSet.set(12);
            }
            if (struct.isSetDpi()) {
                bitSet.set(13);
            }
            if (struct.isSetDensity()) {
                bitSet.set(14);
            }
            if (struct.isSetOri()) {
                bitSet.set(15);
            }
            if (struct.isSetApps()) {
                bitSet.set(16);
            }
            if (struct.isSetVer_code_hms()) {
                bitSet.set(17);
            }
            if (struct.isSetVer_code_ag()) {
                bitSet.set(18);
            }
            if (struct.isSetPaid()) {
                bitSet.set(19);
            }
            tTupleProtocol.writeBitSet(bitSet, 20);
            if (struct.isSetOaid()) {
                tTupleProtocol.writeString(struct.oaid);
            }
            if (struct.isSetAid()) {
                tTupleProtocol.writeString(struct.aid);
            }
            if (struct.isSetIdfa()) {
                tTupleProtocol.writeString(struct.idfa);
            }
            if (struct.isSetCaid()) {
                tTupleProtocol.writeString(struct.caid);
            }
            if (struct.isSetCaid_version()) {
                tTupleProtocol.writeString(struct.caid_version);
            }
            if (struct.isSetDevice_make()) {
                tTupleProtocol.writeString(struct.device_make);
            }
            if (struct.isSetModel()) {
                tTupleProtocol.writeString(struct.model);
            }
            if (struct.isSetUa()) {
                tTupleProtocol.writeString(struct.f28135ua);
            }
            if (struct.isSetCarrier()) {
                tTupleProtocol.writeI32(struct.carrier);
            }
            if (struct.isSetConnection_type()) {
                tTupleProtocol.writeI32(struct.connection_type);
            }
            if (struct.isSetSw()) {
                tTupleProtocol.writeI32(struct.f28134sw);
            }
            if (struct.isSetSh()) {
                tTupleProtocol.writeI32(struct.f28133sh);
            }
            if (struct.isSetPpi()) {
                tTupleProtocol.writeI32(struct.ppi);
            }
            if (struct.isSetDpi()) {
                tTupleProtocol.writeI32(struct.dpi);
            }
            if (struct.isSetDensity()) {
                tTupleProtocol.writeI32(struct.density);
            }
            if (struct.isSetOri()) {
                tTupleProtocol.writeI32(struct.ori);
            }
            if (struct.isSetApps()) {
                tTupleProtocol.writeI32(struct.apps.size());
                Iterator<Integer> it = struct.apps.iterator();
                while (it.hasNext()) {
                    tTupleProtocol.writeI32(it.next().intValue());
                }
            }
            if (struct.isSetVer_code_hms()) {
                tTupleProtocol.writeString(struct.ver_code_hms);
            }
            if (struct.isSetVer_code_ag()) {
                tTupleProtocol.writeString(struct.ver_code_ag);
            }
            if (struct.isSetPaid()) {
                tTupleProtocol.writeString(struct.paid);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AdDeviceInfoTupleSchemeFactory implements SchemeFactory {
        private AdDeviceInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public AdDeviceInfoTupleScheme getScheme() {
            return new AdDeviceInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        OAID(1, "oaid"),
        AID(2, "aid"),
        IDFA(3, "idfa"),
        CAID(4, "caid"),
        CAID_VERSION(5, "caid_version"),
        DEVICE_MAKE(6, "device_make"),
        MODEL(7, "model"),
        UA(8, o.f38735d),
        CARRIER(9, ma.b.f72892b0),
        CONNECTION_TYPE(10, "connection_type"),
        SW(11, "sw"),
        SH(12, "sh"),
        PPI(13, "ppi"),
        DPI(14, "dpi"),
        DENSITY(15, "density"),
        ORI(16, "ori"),
        APPS(17, "apps"),
        VER_CODE_HMS(18, "ver_code_hms"),
        VER_CODE_AG(19, "ver_code_ag"),
        PAID(20, "paid");

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
                    return OAID;
                case 2:
                    return AID;
                case 3:
                    return IDFA;
                case 4:
                    return CAID;
                case 5:
                    return CAID_VERSION;
                case 6:
                    return DEVICE_MAKE;
                case 7:
                    return MODEL;
                case 8:
                    return UA;
                case 9:
                    return CARRIER;
                case 10:
                    return CONNECTION_TYPE;
                case 11:
                    return SW;
                case 12:
                    return SH;
                case 13:
                    return PPI;
                case 14:
                    return DPI;
                case 15:
                    return DENSITY;
                case 16:
                    return ORI;
                case 17:
                    return APPS;
                case 18:
                    return VER_CODE_HMS;
                case 19:
                    return VER_CODE_AG;
                case 20:
                    return PAID;
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
        hashMap.put(StandardScheme.class, new AdDeviceInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new AdDeviceInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.OAID, (_Fields) new FieldMetaData("oaid", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.AID, (_Fields) new FieldMetaData("aid", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.IDFA, (_Fields) new FieldMetaData("idfa", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.CAID, (_Fields) new FieldMetaData("caid", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.CAID_VERSION, (_Fields) new FieldMetaData("caid_version", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.DEVICE_MAKE, (_Fields) new FieldMetaData("device_make", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.MODEL, (_Fields) new FieldMetaData("model", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.UA, (_Fields) new FieldMetaData(o.f38735d, (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.CARRIER, (_Fields) new FieldMetaData(ma.b.f72892b0, (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.CONNECTION_TYPE, (_Fields) new FieldMetaData("connection_type", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.SW, (_Fields) new FieldMetaData("sw", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.SH, (_Fields) new FieldMetaData("sh", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.PPI, (_Fields) new FieldMetaData("ppi", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.DPI, (_Fields) new FieldMetaData("dpi", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.DENSITY, (_Fields) new FieldMetaData("density", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.ORI, (_Fields) new FieldMetaData("ori", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.APPS, (_Fields) new FieldMetaData("apps", (byte) 2, new ListMetaData((byte) 15, new FieldValueMetaData((byte) 8))));
        enumMap.put((EnumMap) _Fields.VER_CODE_HMS, (_Fields) new FieldMetaData("ver_code_hms", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.VER_CODE_AG, (_Fields) new FieldMetaData("ver_code_ag", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.PAID, (_Fields) new FieldMetaData("paid", (byte) 2, new FieldValueMetaData((byte) 11)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(AdDeviceInfo.class, unmodifiableMap);
    }

    public AdDeviceInfo() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.OAID, _Fields.AID, _Fields.IDFA, _Fields.CAID, _Fields.CAID_VERSION, _Fields.DEVICE_MAKE, _Fields.MODEL, _Fields.UA, _Fields.CARRIER, _Fields.CONNECTION_TYPE, _Fields.SW, _Fields.SH, _Fields.PPI, _Fields.DPI, _Fields.DENSITY, _Fields.ORI, _Fields.APPS, _Fields.VER_CODE_HMS, _Fields.VER_CODE_AG, _Fields.PAID};
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

    public void addToApps(int elem) {
        if (this.apps == null) {
            this.apps = new ArrayList();
        }
        this.apps.add(Integer.valueOf(elem));
    }

    @Override // org.apache.thrift.TBase
    public void clear() {
        this.oaid = null;
        this.aid = null;
        this.idfa = null;
        this.caid = null;
        this.caid_version = null;
        this.device_make = null;
        this.model = null;
        this.f28135ua = null;
        setCarrierIsSet(false);
        this.carrier = 0;
        setConnection_typeIsSet(false);
        this.connection_type = 0;
        setSwIsSet(false);
        this.f28134sw = 0;
        setShIsSet(false);
        this.f28133sh = 0;
        setPpiIsSet(false);
        this.ppi = 0;
        setDpiIsSet(false);
        this.dpi = 0;
        setDensityIsSet(false);
        this.density = 0;
        setOriIsSet(false);
        this.ori = 0;
        this.apps = null;
        this.ver_code_hms = null;
        this.ver_code_ag = null;
        this.paid = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof AdDeviceInfo)) {
            return equals((AdDeviceInfo) that);
        }
        return false;
    }

    public String getAid() {
        return this.aid;
    }

    public List<Integer> getApps() {
        return this.apps;
    }

    public Iterator<Integer> getAppsIterator() {
        List<Integer> list = this.apps;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getAppsSize() {
        List<Integer> list = this.apps;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public String getCaid() {
        return this.caid;
    }

    public String getCaid_version() {
        return this.caid_version;
    }

    public int getCarrier() {
        return this.carrier;
    }

    public int getConnection_type() {
        return this.connection_type;
    }

    public int getDensity() {
        return this.density;
    }

    public String getDevice_make() {
        return this.device_make;
    }

    public int getDpi() {
        return this.dpi;
    }

    public String getIdfa() {
        return this.idfa;
    }

    public String getModel() {
        return this.model;
    }

    public String getOaid() {
        return this.oaid;
    }

    public int getOri() {
        return this.ori;
    }

    public String getPaid() {
        return this.paid;
    }

    public int getPpi() {
        return this.ppi;
    }

    public int getSh() {
        return this.f28133sh;
    }

    public int getSw() {
        return this.f28134sw;
    }

    public String getUa() {
        return this.f28135ua;
    }

    public String getVer_code_ag() {
        return this.ver_code_ag;
    }

    public String getVer_code_hms() {
        return this.ver_code_hms;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetAid() {
        return this.aid != null;
    }

    public boolean isSetApps() {
        return this.apps != null;
    }

    public boolean isSetCaid() {
        return this.caid != null;
    }

    public boolean isSetCaid_version() {
        return this.caid_version != null;
    }

    public boolean isSetCarrier() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetConnection_type() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetDensity() {
        return EncodingUtils.testBit(this.__isset_bitfield, 6);
    }

    public boolean isSetDevice_make() {
        return this.device_make != null;
    }

    public boolean isSetDpi() {
        return EncodingUtils.testBit(this.__isset_bitfield, 5);
    }

    public boolean isSetIdfa() {
        return this.idfa != null;
    }

    public boolean isSetModel() {
        return this.model != null;
    }

    public boolean isSetOaid() {
        return this.oaid != null;
    }

    public boolean isSetOri() {
        return EncodingUtils.testBit(this.__isset_bitfield, 7);
    }

    public boolean isSetPaid() {
        return this.paid != null;
    }

    public boolean isSetPpi() {
        return EncodingUtils.testBit(this.__isset_bitfield, 4);
    }

    public boolean isSetSh() {
        return EncodingUtils.testBit(this.__isset_bitfield, 3);
    }

    public boolean isSetSw() {
        return EncodingUtils.testBit(this.__isset_bitfield, 2);
    }

    public boolean isSetUa() {
        return this.f28135ua != null;
    }

    public boolean isSetVer_code_ag() {
        return this.ver_code_ag != null;
    }

    public boolean isSetVer_code_hms() {
        return this.ver_code_hms != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public AdDeviceInfo setAid(String aid) {
        this.aid = aid;
        return this;
    }

    public void setAidIsSet(boolean value) {
        if (value) {
            return;
        }
        this.aid = null;
    }

    public AdDeviceInfo setApps(List<Integer> apps) {
        this.apps = apps;
        return this;
    }

    public void setAppsIsSet(boolean value) {
        if (value) {
            return;
        }
        this.apps = null;
    }

    public AdDeviceInfo setCaid(String caid) {
        this.caid = caid;
        return this;
    }

    public void setCaidIsSet(boolean value) {
        if (value) {
            return;
        }
        this.caid = null;
    }

    public AdDeviceInfo setCaid_version(String caid_version) {
        this.caid_version = caid_version;
        return this;
    }

    public void setCaid_versionIsSet(boolean value) {
        if (value) {
            return;
        }
        this.caid_version = null;
    }

    public AdDeviceInfo setCarrier(int carrier) {
        this.carrier = carrier;
        setCarrierIsSet(true);
        return this;
    }

    public void setCarrierIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public AdDeviceInfo setConnection_type(int connection_type) {
        this.connection_type = connection_type;
        setConnection_typeIsSet(true);
        return this;
    }

    public void setConnection_typeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public AdDeviceInfo setDensity(int density) {
        this.density = density;
        setDensityIsSet(true);
        return this;
    }

    public void setDensityIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 6, value);
    }

    public AdDeviceInfo setDevice_make(String device_make) {
        this.device_make = device_make;
        return this;
    }

    public void setDevice_makeIsSet(boolean value) {
        if (value) {
            return;
        }
        this.device_make = null;
    }

    public AdDeviceInfo setDpi(int dpi) {
        this.dpi = dpi;
        setDpiIsSet(true);
        return this;
    }

    public void setDpiIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 5, value);
    }

    public AdDeviceInfo setIdfa(String idfa) {
        this.idfa = idfa;
        return this;
    }

    public void setIdfaIsSet(boolean value) {
        if (value) {
            return;
        }
        this.idfa = null;
    }

    public AdDeviceInfo setModel(String model) {
        this.model = model;
        return this;
    }

    public void setModelIsSet(boolean value) {
        if (value) {
            return;
        }
        this.model = null;
    }

    public AdDeviceInfo setOaid(String oaid) {
        this.oaid = oaid;
        return this;
    }

    public void setOaidIsSet(boolean value) {
        if (value) {
            return;
        }
        this.oaid = null;
    }

    public AdDeviceInfo setOri(int ori) {
        this.ori = ori;
        setOriIsSet(true);
        return this;
    }

    public void setOriIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 7, value);
    }

    public AdDeviceInfo setPaid(String paid) {
        this.paid = paid;
        return this;
    }

    public void setPaidIsSet(boolean value) {
        if (value) {
            return;
        }
        this.paid = null;
    }

    public AdDeviceInfo setPpi(int ppi) {
        this.ppi = ppi;
        setPpiIsSet(true);
        return this;
    }

    public void setPpiIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 4, value);
    }

    public AdDeviceInfo setSh(int sh2) {
        this.f28133sh = sh2;
        setShIsSet(true);
        return this;
    }

    public void setShIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 3, value);
    }

    public AdDeviceInfo setSw(int sw2) {
        this.f28134sw = sw2;
        setSwIsSet(true);
        return this;
    }

    public void setSwIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 2, value);
    }

    public AdDeviceInfo setUa(String ua2) {
        this.f28135ua = ua2;
        return this;
    }

    public void setUaIsSet(boolean value) {
        if (value) {
            return;
        }
        this.f28135ua = null;
    }

    public AdDeviceInfo setVer_code_ag(String ver_code_ag) {
        this.ver_code_ag = ver_code_ag;
        return this;
    }

    public void setVer_code_agIsSet(boolean value) {
        if (value) {
            return;
        }
        this.ver_code_ag = null;
    }

    public AdDeviceInfo setVer_code_hms(String ver_code_hms) {
        this.ver_code_hms = ver_code_hms;
        return this;
    }

    public void setVer_code_hmsIsSet(boolean value) {
        if (value) {
            return;
        }
        this.ver_code_hms = null;
    }

    public String toString() {
        boolean z11;
        StringBuilder sb2 = new StringBuilder("AdDeviceInfo(");
        boolean z12 = false;
        if (isSetOaid()) {
            sb2.append("oaid:");
            String str = this.oaid;
            if (str == null) {
                sb2.append("null");
            } else {
                sb2.append(str);
            }
            z11 = false;
        } else {
            z11 = true;
        }
        if (isSetAid()) {
            if (!z11) {
                sb2.append(j2.O);
            }
            sb2.append("aid:");
            String str2 = this.aid;
            if (str2 == null) {
                sb2.append("null");
            } else {
                sb2.append(str2);
            }
            z11 = false;
        }
        if (isSetIdfa()) {
            if (!z11) {
                sb2.append(j2.O);
            }
            sb2.append("idfa:");
            String str3 = this.idfa;
            if (str3 == null) {
                sb2.append("null");
            } else {
                sb2.append(str3);
            }
            z11 = false;
        }
        if (isSetCaid()) {
            if (!z11) {
                sb2.append(j2.O);
            }
            sb2.append("caid:");
            String str4 = this.caid;
            if (str4 == null) {
                sb2.append("null");
            } else {
                sb2.append(str4);
            }
            z11 = false;
        }
        if (isSetCaid_version()) {
            if (!z11) {
                sb2.append(j2.O);
            }
            sb2.append("caid_version:");
            String str5 = this.caid_version;
            if (str5 == null) {
                sb2.append("null");
            } else {
                sb2.append(str5);
            }
            z11 = false;
        }
        if (isSetDevice_make()) {
            if (!z11) {
                sb2.append(j2.O);
            }
            sb2.append("device_make:");
            String str6 = this.device_make;
            if (str6 == null) {
                sb2.append("null");
            } else {
                sb2.append(str6);
            }
            z11 = false;
        }
        if (isSetModel()) {
            if (!z11) {
                sb2.append(j2.O);
            }
            sb2.append("model:");
            String str7 = this.model;
            if (str7 == null) {
                sb2.append("null");
            } else {
                sb2.append(str7);
            }
            z11 = false;
        }
        if (isSetUa()) {
            if (!z11) {
                sb2.append(j2.O);
            }
            sb2.append("ua:");
            String str8 = this.f28135ua;
            if (str8 == null) {
                sb2.append("null");
            } else {
                sb2.append(str8);
            }
            z11 = false;
        }
        if (isSetCarrier()) {
            if (!z11) {
                sb2.append(j2.O);
            }
            sb2.append("carrier:");
            sb2.append(this.carrier);
            z11 = false;
        }
        if (isSetConnection_type()) {
            if (!z11) {
                sb2.append(j2.O);
            }
            sb2.append("connection_type:");
            sb2.append(this.connection_type);
            z11 = false;
        }
        if (isSetSw()) {
            if (!z11) {
                sb2.append(j2.O);
            }
            sb2.append("sw:");
            sb2.append(this.f28134sw);
            z11 = false;
        }
        if (isSetSh()) {
            if (!z11) {
                sb2.append(j2.O);
            }
            sb2.append("sh:");
            sb2.append(this.f28133sh);
            z11 = false;
        }
        if (isSetPpi()) {
            if (!z11) {
                sb2.append(j2.O);
            }
            sb2.append("ppi:");
            sb2.append(this.ppi);
            z11 = false;
        }
        if (isSetDpi()) {
            if (!z11) {
                sb2.append(j2.O);
            }
            sb2.append("dpi:");
            sb2.append(this.dpi);
            z11 = false;
        }
        if (isSetDensity()) {
            if (!z11) {
                sb2.append(j2.O);
            }
            sb2.append("density:");
            sb2.append(this.density);
            z11 = false;
        }
        if (isSetOri()) {
            if (!z11) {
                sb2.append(j2.O);
            }
            sb2.append("ori:");
            sb2.append(this.ori);
            z11 = false;
        }
        if (isSetApps()) {
            if (!z11) {
                sb2.append(j2.O);
            }
            sb2.append("apps:");
            List<Integer> list = this.apps;
            if (list == null) {
                sb2.append("null");
            } else {
                sb2.append(list);
            }
            z11 = false;
        }
        if (isSetVer_code_hms()) {
            if (!z11) {
                sb2.append(j2.O);
            }
            sb2.append("ver_code_hms:");
            String str9 = this.ver_code_hms;
            if (str9 == null) {
                sb2.append("null");
            } else {
                sb2.append(str9);
            }
            z11 = false;
        }
        if (isSetVer_code_ag()) {
            if (!z11) {
                sb2.append(j2.O);
            }
            sb2.append("ver_code_ag:");
            String str10 = this.ver_code_ag;
            if (str10 == null) {
                sb2.append("null");
            } else {
                sb2.append(str10);
            }
        } else {
            z12 = z11;
        }
        if (isSetPaid()) {
            if (!z12) {
                sb2.append(j2.O);
            }
            sb2.append("paid:");
            String str11 = this.paid;
            if (str11 == null) {
                sb2.append("null");
            } else {
                sb2.append(str11);
            }
        }
        sb2.append(j.f81007d);
        return sb2.toString();
    }

    public void unsetAid() {
        this.aid = null;
    }

    public void unsetApps() {
        this.apps = null;
    }

    public void unsetCaid() {
        this.caid = null;
    }

    public void unsetCaid_version() {
        this.caid_version = null;
    }

    public void unsetCarrier() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetConnection_type() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetDensity() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 6);
    }

    public void unsetDevice_make() {
        this.device_make = null;
    }

    public void unsetDpi() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 5);
    }

    public void unsetIdfa() {
        this.idfa = null;
    }

    public void unsetModel() {
        this.model = null;
    }

    public void unsetOaid() {
        this.oaid = null;
    }

    public void unsetOri() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 7);
    }

    public void unsetPaid() {
        this.paid = null;
    }

    public void unsetPpi() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 4);
    }

    public void unsetSh() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 3);
    }

    public void unsetSw() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 2);
    }

    public void unsetUa() {
        this.f28135ua = null;
    }

    public void unsetVer_code_ag() {
        this.ver_code_ag = null;
    }

    public void unsetVer_code_hms() {
        this.ver_code_hms = null;
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(AdDeviceInfo other) {
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
        int compareTo16;
        int compareTo17;
        int compareTo18;
        int compareTo19;
        int compareTo20;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo21 = Boolean.valueOf(isSetOaid()).compareTo(Boolean.valueOf(other.isSetOaid()));
        if (compareTo21 != 0) {
            return compareTo21;
        }
        if (isSetOaid() && (compareTo20 = TBaseHelper.compareTo(this.oaid, other.oaid)) != 0) {
            return compareTo20;
        }
        int compareTo22 = Boolean.valueOf(isSetAid()).compareTo(Boolean.valueOf(other.isSetAid()));
        if (compareTo22 != 0) {
            return compareTo22;
        }
        if (isSetAid() && (compareTo19 = TBaseHelper.compareTo(this.aid, other.aid)) != 0) {
            return compareTo19;
        }
        int compareTo23 = Boolean.valueOf(isSetIdfa()).compareTo(Boolean.valueOf(other.isSetIdfa()));
        if (compareTo23 != 0) {
            return compareTo23;
        }
        if (isSetIdfa() && (compareTo18 = TBaseHelper.compareTo(this.idfa, other.idfa)) != 0) {
            return compareTo18;
        }
        int compareTo24 = Boolean.valueOf(isSetCaid()).compareTo(Boolean.valueOf(other.isSetCaid()));
        if (compareTo24 != 0) {
            return compareTo24;
        }
        if (isSetCaid() && (compareTo17 = TBaseHelper.compareTo(this.caid, other.caid)) != 0) {
            return compareTo17;
        }
        int compareTo25 = Boolean.valueOf(isSetCaid_version()).compareTo(Boolean.valueOf(other.isSetCaid_version()));
        if (compareTo25 != 0) {
            return compareTo25;
        }
        if (isSetCaid_version() && (compareTo16 = TBaseHelper.compareTo(this.caid_version, other.caid_version)) != 0) {
            return compareTo16;
        }
        int compareTo26 = Boolean.valueOf(isSetDevice_make()).compareTo(Boolean.valueOf(other.isSetDevice_make()));
        if (compareTo26 != 0) {
            return compareTo26;
        }
        if (isSetDevice_make() && (compareTo15 = TBaseHelper.compareTo(this.device_make, other.device_make)) != 0) {
            return compareTo15;
        }
        int compareTo27 = Boolean.valueOf(isSetModel()).compareTo(Boolean.valueOf(other.isSetModel()));
        if (compareTo27 != 0) {
            return compareTo27;
        }
        if (isSetModel() && (compareTo14 = TBaseHelper.compareTo(this.model, other.model)) != 0) {
            return compareTo14;
        }
        int compareTo28 = Boolean.valueOf(isSetUa()).compareTo(Boolean.valueOf(other.isSetUa()));
        if (compareTo28 != 0) {
            return compareTo28;
        }
        if (isSetUa() && (compareTo13 = TBaseHelper.compareTo(this.f28135ua, other.f28135ua)) != 0) {
            return compareTo13;
        }
        int compareTo29 = Boolean.valueOf(isSetCarrier()).compareTo(Boolean.valueOf(other.isSetCarrier()));
        if (compareTo29 != 0) {
            return compareTo29;
        }
        if (isSetCarrier() && (compareTo12 = TBaseHelper.compareTo(this.carrier, other.carrier)) != 0) {
            return compareTo12;
        }
        int compareTo30 = Boolean.valueOf(isSetConnection_type()).compareTo(Boolean.valueOf(other.isSetConnection_type()));
        if (compareTo30 != 0) {
            return compareTo30;
        }
        if (isSetConnection_type() && (compareTo11 = TBaseHelper.compareTo(this.connection_type, other.connection_type)) != 0) {
            return compareTo11;
        }
        int compareTo31 = Boolean.valueOf(isSetSw()).compareTo(Boolean.valueOf(other.isSetSw()));
        if (compareTo31 != 0) {
            return compareTo31;
        }
        if (isSetSw() && (compareTo10 = TBaseHelper.compareTo(this.f28134sw, other.f28134sw)) != 0) {
            return compareTo10;
        }
        int compareTo32 = Boolean.valueOf(isSetSh()).compareTo(Boolean.valueOf(other.isSetSh()));
        if (compareTo32 != 0) {
            return compareTo32;
        }
        if (isSetSh() && (compareTo9 = TBaseHelper.compareTo(this.f28133sh, other.f28133sh)) != 0) {
            return compareTo9;
        }
        int compareTo33 = Boolean.valueOf(isSetPpi()).compareTo(Boolean.valueOf(other.isSetPpi()));
        if (compareTo33 != 0) {
            return compareTo33;
        }
        if (isSetPpi() && (compareTo8 = TBaseHelper.compareTo(this.ppi, other.ppi)) != 0) {
            return compareTo8;
        }
        int compareTo34 = Boolean.valueOf(isSetDpi()).compareTo(Boolean.valueOf(other.isSetDpi()));
        if (compareTo34 != 0) {
            return compareTo34;
        }
        if (isSetDpi() && (compareTo7 = TBaseHelper.compareTo(this.dpi, other.dpi)) != 0) {
            return compareTo7;
        }
        int compareTo35 = Boolean.valueOf(isSetDensity()).compareTo(Boolean.valueOf(other.isSetDensity()));
        if (compareTo35 != 0) {
            return compareTo35;
        }
        if (isSetDensity() && (compareTo6 = TBaseHelper.compareTo(this.density, other.density)) != 0) {
            return compareTo6;
        }
        int compareTo36 = Boolean.valueOf(isSetOri()).compareTo(Boolean.valueOf(other.isSetOri()));
        if (compareTo36 != 0) {
            return compareTo36;
        }
        if (isSetOri() && (compareTo5 = TBaseHelper.compareTo(this.ori, other.ori)) != 0) {
            return compareTo5;
        }
        int compareTo37 = Boolean.valueOf(isSetApps()).compareTo(Boolean.valueOf(other.isSetApps()));
        if (compareTo37 != 0) {
            return compareTo37;
        }
        if (isSetApps() && (compareTo4 = TBaseHelper.compareTo((List) this.apps, (List) other.apps)) != 0) {
            return compareTo4;
        }
        int compareTo38 = Boolean.valueOf(isSetVer_code_hms()).compareTo(Boolean.valueOf(other.isSetVer_code_hms()));
        if (compareTo38 != 0) {
            return compareTo38;
        }
        if (isSetVer_code_hms() && (compareTo3 = TBaseHelper.compareTo(this.ver_code_hms, other.ver_code_hms)) != 0) {
            return compareTo3;
        }
        int compareTo39 = Boolean.valueOf(isSetVer_code_ag()).compareTo(Boolean.valueOf(other.isSetVer_code_ag()));
        if (compareTo39 != 0) {
            return compareTo39;
        }
        if (isSetVer_code_ag() && (compareTo2 = TBaseHelper.compareTo(this.ver_code_ag, other.ver_code_ag)) != 0) {
            return compareTo2;
        }
        int compareTo40 = Boolean.valueOf(isSetPaid()).compareTo(Boolean.valueOf(other.isSetPaid()));
        if (compareTo40 != 0) {
            return compareTo40;
        }
        if (!isSetPaid() || (compareTo = TBaseHelper.compareTo(this.paid, other.paid)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<AdDeviceInfo, _Fields> deepCopy2() {
        return new AdDeviceInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$ad_property$AdDeviceInfo$_Fields[field.ordinal()]) {
            case 1:
                return getOaid();
            case 2:
                return getAid();
            case 3:
                return getIdfa();
            case 4:
                return getCaid();
            case 5:
                return getCaid_version();
            case 6:
                return getDevice_make();
            case 7:
                return getModel();
            case 8:
                return getUa();
            case 9:
                return Integer.valueOf(getCarrier());
            case 10:
                return Integer.valueOf(getConnection_type());
            case 11:
                return Integer.valueOf(getSw());
            case 12:
                return Integer.valueOf(getSh());
            case 13:
                return Integer.valueOf(getPpi());
            case 14:
                return Integer.valueOf(getDpi());
            case 15:
                return Integer.valueOf(getDensity());
            case 16:
                return Integer.valueOf(getOri());
            case 17:
                return getApps();
            case 18:
                return getVer_code_hms();
            case 19:
                return getVer_code_ag();
            case 20:
                return getPaid();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$ad_property$AdDeviceInfo$_Fields[field.ordinal()]) {
            case 1:
                return isSetOaid();
            case 2:
                return isSetAid();
            case 3:
                return isSetIdfa();
            case 4:
                return isSetCaid();
            case 5:
                return isSetCaid_version();
            case 6:
                return isSetDevice_make();
            case 7:
                return isSetModel();
            case 8:
                return isSetUa();
            case 9:
                return isSetCarrier();
            case 10:
                return isSetConnection_type();
            case 11:
                return isSetSw();
            case 12:
                return isSetSh();
            case 13:
                return isSetPpi();
            case 14:
                return isSetDpi();
            case 15:
                return isSetDensity();
            case 16:
                return isSetOri();
            case 17:
                return isSetApps();
            case 18:
                return isSetVer_code_hms();
            case 19:
                return isSetVer_code_ag();
            case 20:
                return isSetPaid();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$ad_property$AdDeviceInfo$_Fields[field.ordinal()]) {
            case 1:
                if (value != null) {
                    setOaid((String) value);
                    break;
                } else {
                    unsetOaid();
                    break;
                }
            case 2:
                if (value != null) {
                    setAid((String) value);
                    break;
                } else {
                    unsetAid();
                    break;
                }
            case 3:
                if (value != null) {
                    setIdfa((String) value);
                    break;
                } else {
                    unsetIdfa();
                    break;
                }
            case 4:
                if (value != null) {
                    setCaid((String) value);
                    break;
                } else {
                    unsetCaid();
                    break;
                }
            case 5:
                if (value != null) {
                    setCaid_version((String) value);
                    break;
                } else {
                    unsetCaid_version();
                    break;
                }
            case 6:
                if (value != null) {
                    setDevice_make((String) value);
                    break;
                } else {
                    unsetDevice_make();
                    break;
                }
            case 7:
                if (value != null) {
                    setModel((String) value);
                    break;
                } else {
                    unsetModel();
                    break;
                }
            case 8:
                if (value != null) {
                    setUa((String) value);
                    break;
                } else {
                    unsetUa();
                    break;
                }
            case 9:
                if (value != null) {
                    setCarrier(((Integer) value).intValue());
                    break;
                } else {
                    unsetCarrier();
                    break;
                }
            case 10:
                if (value != null) {
                    setConnection_type(((Integer) value).intValue());
                    break;
                } else {
                    unsetConnection_type();
                    break;
                }
            case 11:
                if (value != null) {
                    setSw(((Integer) value).intValue());
                    break;
                } else {
                    unsetSw();
                    break;
                }
            case 12:
                if (value != null) {
                    setSh(((Integer) value).intValue());
                    break;
                } else {
                    unsetSh();
                    break;
                }
            case 13:
                if (value != null) {
                    setPpi(((Integer) value).intValue());
                    break;
                } else {
                    unsetPpi();
                    break;
                }
            case 14:
                if (value != null) {
                    setDpi(((Integer) value).intValue());
                    break;
                } else {
                    unsetDpi();
                    break;
                }
            case 15:
                if (value != null) {
                    setDensity(((Integer) value).intValue());
                    break;
                } else {
                    unsetDensity();
                    break;
                }
            case 16:
                if (value != null) {
                    setOri(((Integer) value).intValue());
                    break;
                } else {
                    unsetOri();
                    break;
                }
            case 17:
                if (value != null) {
                    setApps((List) value);
                    break;
                } else {
                    unsetApps();
                    break;
                }
            case 18:
                if (value != null) {
                    setVer_code_hms((String) value);
                    break;
                } else {
                    unsetVer_code_hms();
                    break;
                }
            case 19:
                if (value != null) {
                    setVer_code_ag((String) value);
                    break;
                } else {
                    unsetVer_code_ag();
                    break;
                }
            case 20:
                if (value != null) {
                    setPaid((String) value);
                    break;
                } else {
                    unsetPaid();
                    break;
                }
        }
    }

    public boolean equals(AdDeviceInfo that) {
        if (that == null) {
            return false;
        }
        boolean isSetOaid = isSetOaid();
        boolean isSetOaid2 = that.isSetOaid();
        if ((isSetOaid || isSetOaid2) && !(isSetOaid && isSetOaid2 && this.oaid.equals(that.oaid))) {
            return false;
        }
        boolean isSetAid = isSetAid();
        boolean isSetAid2 = that.isSetAid();
        if ((isSetAid || isSetAid2) && !(isSetAid && isSetAid2 && this.aid.equals(that.aid))) {
            return false;
        }
        boolean isSetIdfa = isSetIdfa();
        boolean isSetIdfa2 = that.isSetIdfa();
        if ((isSetIdfa || isSetIdfa2) && !(isSetIdfa && isSetIdfa2 && this.idfa.equals(that.idfa))) {
            return false;
        }
        boolean isSetCaid = isSetCaid();
        boolean isSetCaid2 = that.isSetCaid();
        if ((isSetCaid || isSetCaid2) && !(isSetCaid && isSetCaid2 && this.caid.equals(that.caid))) {
            return false;
        }
        boolean isSetCaid_version = isSetCaid_version();
        boolean isSetCaid_version2 = that.isSetCaid_version();
        if ((isSetCaid_version || isSetCaid_version2) && !(isSetCaid_version && isSetCaid_version2 && this.caid_version.equals(that.caid_version))) {
            return false;
        }
        boolean isSetDevice_make = isSetDevice_make();
        boolean isSetDevice_make2 = that.isSetDevice_make();
        if ((isSetDevice_make || isSetDevice_make2) && !(isSetDevice_make && isSetDevice_make2 && this.device_make.equals(that.device_make))) {
            return false;
        }
        boolean isSetModel = isSetModel();
        boolean isSetModel2 = that.isSetModel();
        if ((isSetModel || isSetModel2) && !(isSetModel && isSetModel2 && this.model.equals(that.model))) {
            return false;
        }
        boolean isSetUa = isSetUa();
        boolean isSetUa2 = that.isSetUa();
        if ((isSetUa || isSetUa2) && !(isSetUa && isSetUa2 && this.f28135ua.equals(that.f28135ua))) {
            return false;
        }
        boolean isSetCarrier = isSetCarrier();
        boolean isSetCarrier2 = that.isSetCarrier();
        if ((isSetCarrier || isSetCarrier2) && !(isSetCarrier && isSetCarrier2 && this.carrier == that.carrier)) {
            return false;
        }
        boolean isSetConnection_type = isSetConnection_type();
        boolean isSetConnection_type2 = that.isSetConnection_type();
        if ((isSetConnection_type || isSetConnection_type2) && !(isSetConnection_type && isSetConnection_type2 && this.connection_type == that.connection_type)) {
            return false;
        }
        boolean isSetSw = isSetSw();
        boolean isSetSw2 = that.isSetSw();
        if ((isSetSw || isSetSw2) && !(isSetSw && isSetSw2 && this.f28134sw == that.f28134sw)) {
            return false;
        }
        boolean isSetSh = isSetSh();
        boolean isSetSh2 = that.isSetSh();
        if ((isSetSh || isSetSh2) && !(isSetSh && isSetSh2 && this.f28133sh == that.f28133sh)) {
            return false;
        }
        boolean isSetPpi = isSetPpi();
        boolean isSetPpi2 = that.isSetPpi();
        if ((isSetPpi || isSetPpi2) && !(isSetPpi && isSetPpi2 && this.ppi == that.ppi)) {
            return false;
        }
        boolean isSetDpi = isSetDpi();
        boolean isSetDpi2 = that.isSetDpi();
        if ((isSetDpi || isSetDpi2) && !(isSetDpi && isSetDpi2 && this.dpi == that.dpi)) {
            return false;
        }
        boolean isSetDensity = isSetDensity();
        boolean isSetDensity2 = that.isSetDensity();
        if ((isSetDensity || isSetDensity2) && !(isSetDensity && isSetDensity2 && this.density == that.density)) {
            return false;
        }
        boolean isSetOri = isSetOri();
        boolean isSetOri2 = that.isSetOri();
        if ((isSetOri || isSetOri2) && !(isSetOri && isSetOri2 && this.ori == that.ori)) {
            return false;
        }
        boolean isSetApps = isSetApps();
        boolean isSetApps2 = that.isSetApps();
        if ((isSetApps || isSetApps2) && !(isSetApps && isSetApps2 && this.apps.equals(that.apps))) {
            return false;
        }
        boolean isSetVer_code_hms = isSetVer_code_hms();
        boolean isSetVer_code_hms2 = that.isSetVer_code_hms();
        if ((isSetVer_code_hms || isSetVer_code_hms2) && !(isSetVer_code_hms && isSetVer_code_hms2 && this.ver_code_hms.equals(that.ver_code_hms))) {
            return false;
        }
        boolean isSetVer_code_ag = isSetVer_code_ag();
        boolean isSetVer_code_ag2 = that.isSetVer_code_ag();
        if ((isSetVer_code_ag || isSetVer_code_ag2) && !(isSetVer_code_ag && isSetVer_code_ag2 && this.ver_code_ag.equals(that.ver_code_ag))) {
            return false;
        }
        boolean isSetPaid = isSetPaid();
        boolean isSetPaid2 = that.isSetPaid();
        if (isSetPaid || isSetPaid2) {
            return isSetPaid && isSetPaid2 && this.paid.equals(that.paid);
        }
        return true;
    }

    public AdDeviceInfo(AdDeviceInfo other) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.OAID, _Fields.AID, _Fields.IDFA, _Fields.CAID, _Fields.CAID_VERSION, _Fields.DEVICE_MAKE, _Fields.MODEL, _Fields.UA, _Fields.CARRIER, _Fields.CONNECTION_TYPE, _Fields.SW, _Fields.SH, _Fields.PPI, _Fields.DPI, _Fields.DENSITY, _Fields.ORI, _Fields.APPS, _Fields.VER_CODE_HMS, _Fields.VER_CODE_AG, _Fields.PAID};
        this.__isset_bitfield = other.__isset_bitfield;
        if (other.isSetOaid()) {
            this.oaid = other.oaid;
        }
        if (other.isSetAid()) {
            this.aid = other.aid;
        }
        if (other.isSetIdfa()) {
            this.idfa = other.idfa;
        }
        if (other.isSetCaid()) {
            this.caid = other.caid;
        }
        if (other.isSetCaid_version()) {
            this.caid_version = other.caid_version;
        }
        if (other.isSetDevice_make()) {
            this.device_make = other.device_make;
        }
        if (other.isSetModel()) {
            this.model = other.model;
        }
        if (other.isSetUa()) {
            this.f28135ua = other.f28135ua;
        }
        this.carrier = other.carrier;
        this.connection_type = other.connection_type;
        this.f28134sw = other.f28134sw;
        this.f28133sh = other.f28133sh;
        this.ppi = other.ppi;
        this.dpi = other.dpi;
        this.density = other.density;
        this.ori = other.ori;
        if (other.isSetApps()) {
            this.apps = new ArrayList(other.apps);
        }
        if (other.isSetVer_code_hms()) {
            this.ver_code_hms = other.ver_code_hms;
        }
        if (other.isSetVer_code_ag()) {
            this.ver_code_ag = other.ver_code_ag;
        }
        if (other.isSetPaid()) {
            this.paid = other.paid;
        }
    }

    public void validate() throws TException {
    }
}

package com.baicizhan.online.resource_api;

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
public class VariantInfo implements TBase<VariantInfo, _Fields>, Serializable, Cloneable, Comparable<VariantInfo> {
    private static final int __ADJ_TOPIC_ID_ISSET_ID = 12;
    private static final int __ADV_TOPIC_ID_ISSET_ID = 9;
    private static final int __CONN_TOPIC_ID_ISSET_ID = 13;
    private static final int __DONE_TOPIC_ID_ISSET_ID = 4;
    private static final int __ER_TOPIC_ID_ISSET_ID = 6;
    private static final int __EST_TOPIC_ID_ISSET_ID = 7;
    private static final int __ING_TOPIC_ID_ISSET_ID = 5;
    private static final int __NOUN_TOPIC_ID_ISSET_ID = 11;
    private static final int __PAST_TOPIC_ID_ISSET_ID = 3;
    private static final int __PL_TOPIC_ID_ISSET_ID = 1;
    private static final int __PREP_TOPIC_ID_ISSET_ID = 8;
    private static final int __THIRD_TOPIC_ID_ISSET_ID = 2;
    private static final int __TOPIC_ID_ISSET_ID = 0;
    private static final int __VERB_TOPIC_ID_ISSET_ID = 10;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private short __isset_bitfield;
    public String adj;
    public int adj_topic_id;
    public String adv;
    public int adv_topic_id;
    public String conn;
    public int conn_topic_id;
    public String done;
    public int done_topic_id;

    /* renamed from: er, reason: collision with root package name */
    public String f28162er;
    public int er_topic_id;
    public String est;
    public int est_topic_id;
    public String ing;
    public int ing_topic_id;
    public String noun;
    public int noun_topic_id;
    private _Fields[] optionals;
    public String past;
    public int past_topic_id;

    /* renamed from: pl, reason: collision with root package name */
    public String f28163pl;
    public int pl_topic_id;
    public String prep;
    public int prep_topic_id;
    public String third;
    public int third_topic_id;
    public int topic_id;
    public String verb;
    public int verb_topic_id;
    private static final TStruct STRUCT_DESC = new TStruct("VariantInfo");
    private static final TField TOPIC_ID_FIELD_DESC = new TField("topic_id", (byte) 8, 1);
    private static final TField PL_FIELD_DESC = new TField("pl", (byte) 11, 2);
    private static final TField PL_TOPIC_ID_FIELD_DESC = new TField("pl_topic_id", (byte) 8, 3);
    private static final TField THIRD_FIELD_DESC = new TField(com.alipay.sdk.m.k.b.f10659o, (byte) 11, 4);
    private static final TField THIRD_TOPIC_ID_FIELD_DESC = new TField("third_topic_id", (byte) 8, 5);
    private static final TField PAST_FIELD_DESC = new TField("past", (byte) 11, 6);
    private static final TField PAST_TOPIC_ID_FIELD_DESC = new TField("past_topic_id", (byte) 8, 7);
    private static final TField DONE_FIELD_DESC = new TField("done", (byte) 11, 8);
    private static final TField DONE_TOPIC_ID_FIELD_DESC = new TField("done_topic_id", (byte) 8, 9);
    private static final TField ING_FIELD_DESC = new TField("ing", (byte) 11, 10);
    private static final TField ING_TOPIC_ID_FIELD_DESC = new TField("ing_topic_id", (byte) 8, 11);
    private static final TField ER_FIELD_DESC = new TField("er", (byte) 11, 12);
    private static final TField ER_TOPIC_ID_FIELD_DESC = new TField("er_topic_id", (byte) 8, 13);
    private static final TField EST_FIELD_DESC = new TField("est", (byte) 11, 14);
    private static final TField EST_TOPIC_ID_FIELD_DESC = new TField("est_topic_id", (byte) 8, 15);
    private static final TField PREP_FIELD_DESC = new TField("prep", (byte) 11, 16);
    private static final TField PREP_TOPIC_ID_FIELD_DESC = new TField("prep_topic_id", (byte) 8, 17);
    private static final TField ADV_FIELD_DESC = new TField("adv", (byte) 11, 18);
    private static final TField ADV_TOPIC_ID_FIELD_DESC = new TField("adv_topic_id", (byte) 8, 19);
    private static final TField VERB_FIELD_DESC = new TField("verb", (byte) 11, 20);
    private static final TField VERB_TOPIC_ID_FIELD_DESC = new TField("verb_topic_id", (byte) 8, 21);
    private static final TField NOUN_FIELD_DESC = new TField("noun", (byte) 11, 22);
    private static final TField NOUN_TOPIC_ID_FIELD_DESC = new TField("noun_topic_id", (byte) 8, 23);
    private static final TField ADJ_FIELD_DESC = new TField("adj", (byte) 11, 24);
    private static final TField ADJ_TOPIC_ID_FIELD_DESC = new TField("adj_topic_id", (byte) 8, 25);
    private static final TField CONN_FIELD_DESC = new TField("conn", (byte) 11, 26);
    private static final TField CONN_TOPIC_ID_FIELD_DESC = new TField("conn_topic_id", (byte) 8, 27);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.resource_api.VariantInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$resource_api$VariantInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$resource_api$VariantInfo$_Fields = iArr;
            try {
                iArr[_Fields.TOPIC_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$VariantInfo$_Fields[_Fields.PL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$VariantInfo$_Fields[_Fields.PL_TOPIC_ID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$VariantInfo$_Fields[_Fields.THIRD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$VariantInfo$_Fields[_Fields.THIRD_TOPIC_ID.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$VariantInfo$_Fields[_Fields.PAST.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$VariantInfo$_Fields[_Fields.PAST_TOPIC_ID.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$VariantInfo$_Fields[_Fields.DONE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$VariantInfo$_Fields[_Fields.DONE_TOPIC_ID.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$VariantInfo$_Fields[_Fields.ING.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$VariantInfo$_Fields[_Fields.ING_TOPIC_ID.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$VariantInfo$_Fields[_Fields.ER.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$VariantInfo$_Fields[_Fields.ER_TOPIC_ID.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$VariantInfo$_Fields[_Fields.EST.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$VariantInfo$_Fields[_Fields.EST_TOPIC_ID.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$VariantInfo$_Fields[_Fields.PREP.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$VariantInfo$_Fields[_Fields.PREP_TOPIC_ID.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$VariantInfo$_Fields[_Fields.ADV.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$VariantInfo$_Fields[_Fields.ADV_TOPIC_ID.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$VariantInfo$_Fields[_Fields.VERB.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$VariantInfo$_Fields[_Fields.VERB_TOPIC_ID.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$VariantInfo$_Fields[_Fields.NOUN.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$VariantInfo$_Fields[_Fields.NOUN_TOPIC_ID.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$VariantInfo$_Fields[_Fields.ADJ.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$VariantInfo$_Fields[_Fields.ADJ_TOPIC_ID.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$VariantInfo$_Fields[_Fields.CONN.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$VariantInfo$_Fields[_Fields.CONN_TOPIC_ID.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class VariantInfoStandardScheme extends StandardScheme<VariantInfo> {
        private VariantInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, VariantInfo struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    iprot.readStructEnd();
                    if (struct.isSetTopic_id()) {
                        struct.validate();
                        return;
                    }
                    throw new TProtocolException("Required field 'topic_id' was not found in serialized data! Struct: " + toString());
                }
                switch (readFieldBegin.f77768id) {
                    case 1:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.topic_id = iprot.readI32();
                            struct.setTopic_idIsSet(true);
                            break;
                        }
                    case 2:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.f28163pl = iprot.readString();
                            struct.setPlIsSet(true);
                            break;
                        }
                    case 3:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.pl_topic_id = iprot.readI32();
                            struct.setPl_topic_idIsSet(true);
                            break;
                        }
                    case 4:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.third = iprot.readString();
                            struct.setThirdIsSet(true);
                            break;
                        }
                    case 5:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.third_topic_id = iprot.readI32();
                            struct.setThird_topic_idIsSet(true);
                            break;
                        }
                    case 6:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.past = iprot.readString();
                            struct.setPastIsSet(true);
                            break;
                        }
                    case 7:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.past_topic_id = iprot.readI32();
                            struct.setPast_topic_idIsSet(true);
                            break;
                        }
                    case 8:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.done = iprot.readString();
                            struct.setDoneIsSet(true);
                            break;
                        }
                    case 9:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.done_topic_id = iprot.readI32();
                            struct.setDone_topic_idIsSet(true);
                            break;
                        }
                    case 10:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.ing = iprot.readString();
                            struct.setIngIsSet(true);
                            break;
                        }
                    case 11:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.ing_topic_id = iprot.readI32();
                            struct.setIng_topic_idIsSet(true);
                            break;
                        }
                    case 12:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.f28162er = iprot.readString();
                            struct.setErIsSet(true);
                            break;
                        }
                    case 13:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.er_topic_id = iprot.readI32();
                            struct.setEr_topic_idIsSet(true);
                            break;
                        }
                    case 14:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.est = iprot.readString();
                            struct.setEstIsSet(true);
                            break;
                        }
                    case 15:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.est_topic_id = iprot.readI32();
                            struct.setEst_topic_idIsSet(true);
                            break;
                        }
                    case 16:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.prep = iprot.readString();
                            struct.setPrepIsSet(true);
                            break;
                        }
                    case 17:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.prep_topic_id = iprot.readI32();
                            struct.setPrep_topic_idIsSet(true);
                            break;
                        }
                    case 18:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.adv = iprot.readString();
                            struct.setAdvIsSet(true);
                            break;
                        }
                    case 19:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.adv_topic_id = iprot.readI32();
                            struct.setAdv_topic_idIsSet(true);
                            break;
                        }
                    case 20:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.verb = iprot.readString();
                            struct.setVerbIsSet(true);
                            break;
                        }
                    case 21:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.verb_topic_id = iprot.readI32();
                            struct.setVerb_topic_idIsSet(true);
                            break;
                        }
                    case 22:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.noun = iprot.readString();
                            struct.setNounIsSet(true);
                            break;
                        }
                    case 23:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.noun_topic_id = iprot.readI32();
                            struct.setNoun_topic_idIsSet(true);
                            break;
                        }
                    case 24:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.adj = iprot.readString();
                            struct.setAdjIsSet(true);
                            break;
                        }
                    case 25:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.adj_topic_id = iprot.readI32();
                            struct.setAdj_topic_idIsSet(true);
                            break;
                        }
                    case 26:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.conn = iprot.readString();
                            struct.setConnIsSet(true);
                            break;
                        }
                    case 27:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.conn_topic_id = iprot.readI32();
                            struct.setConn_topic_idIsSet(true);
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
        public void write(TProtocol oprot, VariantInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(VariantInfo.STRUCT_DESC);
            oprot.writeFieldBegin(VariantInfo.TOPIC_ID_FIELD_DESC);
            oprot.writeI32(struct.topic_id);
            oprot.writeFieldEnd();
            if (struct.f28163pl != null && struct.isSetPl()) {
                oprot.writeFieldBegin(VariantInfo.PL_FIELD_DESC);
                oprot.writeString(struct.f28163pl);
                oprot.writeFieldEnd();
            }
            if (struct.isSetPl_topic_id()) {
                oprot.writeFieldBegin(VariantInfo.PL_TOPIC_ID_FIELD_DESC);
                oprot.writeI32(struct.pl_topic_id);
                oprot.writeFieldEnd();
            }
            if (struct.third != null && struct.isSetThird()) {
                oprot.writeFieldBegin(VariantInfo.THIRD_FIELD_DESC);
                oprot.writeString(struct.third);
                oprot.writeFieldEnd();
            }
            if (struct.isSetThird_topic_id()) {
                oprot.writeFieldBegin(VariantInfo.THIRD_TOPIC_ID_FIELD_DESC);
                oprot.writeI32(struct.third_topic_id);
                oprot.writeFieldEnd();
            }
            if (struct.past != null && struct.isSetPast()) {
                oprot.writeFieldBegin(VariantInfo.PAST_FIELD_DESC);
                oprot.writeString(struct.past);
                oprot.writeFieldEnd();
            }
            if (struct.isSetPast_topic_id()) {
                oprot.writeFieldBegin(VariantInfo.PAST_TOPIC_ID_FIELD_DESC);
                oprot.writeI32(struct.past_topic_id);
                oprot.writeFieldEnd();
            }
            if (struct.done != null && struct.isSetDone()) {
                oprot.writeFieldBegin(VariantInfo.DONE_FIELD_DESC);
                oprot.writeString(struct.done);
                oprot.writeFieldEnd();
            }
            if (struct.isSetDone_topic_id()) {
                oprot.writeFieldBegin(VariantInfo.DONE_TOPIC_ID_FIELD_DESC);
                oprot.writeI32(struct.done_topic_id);
                oprot.writeFieldEnd();
            }
            if (struct.ing != null && struct.isSetIng()) {
                oprot.writeFieldBegin(VariantInfo.ING_FIELD_DESC);
                oprot.writeString(struct.ing);
                oprot.writeFieldEnd();
            }
            if (struct.isSetIng_topic_id()) {
                oprot.writeFieldBegin(VariantInfo.ING_TOPIC_ID_FIELD_DESC);
                oprot.writeI32(struct.ing_topic_id);
                oprot.writeFieldEnd();
            }
            if (struct.f28162er != null && struct.isSetEr()) {
                oprot.writeFieldBegin(VariantInfo.ER_FIELD_DESC);
                oprot.writeString(struct.f28162er);
                oprot.writeFieldEnd();
            }
            if (struct.isSetEr_topic_id()) {
                oprot.writeFieldBegin(VariantInfo.ER_TOPIC_ID_FIELD_DESC);
                oprot.writeI32(struct.er_topic_id);
                oprot.writeFieldEnd();
            }
            if (struct.est != null && struct.isSetEst()) {
                oprot.writeFieldBegin(VariantInfo.EST_FIELD_DESC);
                oprot.writeString(struct.est);
                oprot.writeFieldEnd();
            }
            if (struct.isSetEst_topic_id()) {
                oprot.writeFieldBegin(VariantInfo.EST_TOPIC_ID_FIELD_DESC);
                oprot.writeI32(struct.est_topic_id);
                oprot.writeFieldEnd();
            }
            if (struct.prep != null && struct.isSetPrep()) {
                oprot.writeFieldBegin(VariantInfo.PREP_FIELD_DESC);
                oprot.writeString(struct.prep);
                oprot.writeFieldEnd();
            }
            if (struct.isSetPrep_topic_id()) {
                oprot.writeFieldBegin(VariantInfo.PREP_TOPIC_ID_FIELD_DESC);
                oprot.writeI32(struct.prep_topic_id);
                oprot.writeFieldEnd();
            }
            if (struct.adv != null && struct.isSetAdv()) {
                oprot.writeFieldBegin(VariantInfo.ADV_FIELD_DESC);
                oprot.writeString(struct.adv);
                oprot.writeFieldEnd();
            }
            if (struct.isSetAdv_topic_id()) {
                oprot.writeFieldBegin(VariantInfo.ADV_TOPIC_ID_FIELD_DESC);
                oprot.writeI32(struct.adv_topic_id);
                oprot.writeFieldEnd();
            }
            if (struct.verb != null && struct.isSetVerb()) {
                oprot.writeFieldBegin(VariantInfo.VERB_FIELD_DESC);
                oprot.writeString(struct.verb);
                oprot.writeFieldEnd();
            }
            if (struct.isSetVerb_topic_id()) {
                oprot.writeFieldBegin(VariantInfo.VERB_TOPIC_ID_FIELD_DESC);
                oprot.writeI32(struct.verb_topic_id);
                oprot.writeFieldEnd();
            }
            if (struct.noun != null && struct.isSetNoun()) {
                oprot.writeFieldBegin(VariantInfo.NOUN_FIELD_DESC);
                oprot.writeString(struct.noun);
                oprot.writeFieldEnd();
            }
            if (struct.isSetNoun_topic_id()) {
                oprot.writeFieldBegin(VariantInfo.NOUN_TOPIC_ID_FIELD_DESC);
                oprot.writeI32(struct.noun_topic_id);
                oprot.writeFieldEnd();
            }
            if (struct.adj != null && struct.isSetAdj()) {
                oprot.writeFieldBegin(VariantInfo.ADJ_FIELD_DESC);
                oprot.writeString(struct.adj);
                oprot.writeFieldEnd();
            }
            if (struct.isSetAdj_topic_id()) {
                oprot.writeFieldBegin(VariantInfo.ADJ_TOPIC_ID_FIELD_DESC);
                oprot.writeI32(struct.adj_topic_id);
                oprot.writeFieldEnd();
            }
            if (struct.conn != null && struct.isSetConn()) {
                oprot.writeFieldBegin(VariantInfo.CONN_FIELD_DESC);
                oprot.writeString(struct.conn);
                oprot.writeFieldEnd();
            }
            if (struct.isSetConn_topic_id()) {
                oprot.writeFieldBegin(VariantInfo.CONN_TOPIC_ID_FIELD_DESC);
                oprot.writeI32(struct.conn_topic_id);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class VariantInfoStandardSchemeFactory implements SchemeFactory {
        private VariantInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public VariantInfoStandardScheme getScheme() {
            return new VariantInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class VariantInfoTupleScheme extends TupleScheme<VariantInfo> {
        private VariantInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, VariantInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.topic_id = tTupleProtocol.readI32();
            struct.setTopic_idIsSet(true);
            BitSet readBitSet = tTupleProtocol.readBitSet(26);
            if (readBitSet.get(0)) {
                struct.f28163pl = tTupleProtocol.readString();
                struct.setPlIsSet(true);
            }
            if (readBitSet.get(1)) {
                struct.pl_topic_id = tTupleProtocol.readI32();
                struct.setPl_topic_idIsSet(true);
            }
            if (readBitSet.get(2)) {
                struct.third = tTupleProtocol.readString();
                struct.setThirdIsSet(true);
            }
            if (readBitSet.get(3)) {
                struct.third_topic_id = tTupleProtocol.readI32();
                struct.setThird_topic_idIsSet(true);
            }
            if (readBitSet.get(4)) {
                struct.past = tTupleProtocol.readString();
                struct.setPastIsSet(true);
            }
            if (readBitSet.get(5)) {
                struct.past_topic_id = tTupleProtocol.readI32();
                struct.setPast_topic_idIsSet(true);
            }
            if (readBitSet.get(6)) {
                struct.done = tTupleProtocol.readString();
                struct.setDoneIsSet(true);
            }
            if (readBitSet.get(7)) {
                struct.done_topic_id = tTupleProtocol.readI32();
                struct.setDone_topic_idIsSet(true);
            }
            if (readBitSet.get(8)) {
                struct.ing = tTupleProtocol.readString();
                struct.setIngIsSet(true);
            }
            if (readBitSet.get(9)) {
                struct.ing_topic_id = tTupleProtocol.readI32();
                struct.setIng_topic_idIsSet(true);
            }
            if (readBitSet.get(10)) {
                struct.f28162er = tTupleProtocol.readString();
                struct.setErIsSet(true);
            }
            if (readBitSet.get(11)) {
                struct.er_topic_id = tTupleProtocol.readI32();
                struct.setEr_topic_idIsSet(true);
            }
            if (readBitSet.get(12)) {
                struct.est = tTupleProtocol.readString();
                struct.setEstIsSet(true);
            }
            if (readBitSet.get(13)) {
                struct.est_topic_id = tTupleProtocol.readI32();
                struct.setEst_topic_idIsSet(true);
            }
            if (readBitSet.get(14)) {
                struct.prep = tTupleProtocol.readString();
                struct.setPrepIsSet(true);
            }
            if (readBitSet.get(15)) {
                struct.prep_topic_id = tTupleProtocol.readI32();
                struct.setPrep_topic_idIsSet(true);
            }
            if (readBitSet.get(16)) {
                struct.adv = tTupleProtocol.readString();
                struct.setAdvIsSet(true);
            }
            if (readBitSet.get(17)) {
                struct.adv_topic_id = tTupleProtocol.readI32();
                struct.setAdv_topic_idIsSet(true);
            }
            if (readBitSet.get(18)) {
                struct.verb = tTupleProtocol.readString();
                struct.setVerbIsSet(true);
            }
            if (readBitSet.get(19)) {
                struct.verb_topic_id = tTupleProtocol.readI32();
                struct.setVerb_topic_idIsSet(true);
            }
            if (readBitSet.get(20)) {
                struct.noun = tTupleProtocol.readString();
                struct.setNounIsSet(true);
            }
            if (readBitSet.get(21)) {
                struct.noun_topic_id = tTupleProtocol.readI32();
                struct.setNoun_topic_idIsSet(true);
            }
            if (readBitSet.get(22)) {
                struct.adj = tTupleProtocol.readString();
                struct.setAdjIsSet(true);
            }
            if (readBitSet.get(23)) {
                struct.adj_topic_id = tTupleProtocol.readI32();
                struct.setAdj_topic_idIsSet(true);
            }
            if (readBitSet.get(24)) {
                struct.conn = tTupleProtocol.readString();
                struct.setConnIsSet(true);
            }
            if (readBitSet.get(25)) {
                struct.conn_topic_id = tTupleProtocol.readI32();
                struct.setConn_topic_idIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, VariantInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.topic_id);
            BitSet bitSet = new BitSet();
            if (struct.isSetPl()) {
                bitSet.set(0);
            }
            if (struct.isSetPl_topic_id()) {
                bitSet.set(1);
            }
            if (struct.isSetThird()) {
                bitSet.set(2);
            }
            if (struct.isSetThird_topic_id()) {
                bitSet.set(3);
            }
            if (struct.isSetPast()) {
                bitSet.set(4);
            }
            if (struct.isSetPast_topic_id()) {
                bitSet.set(5);
            }
            if (struct.isSetDone()) {
                bitSet.set(6);
            }
            if (struct.isSetDone_topic_id()) {
                bitSet.set(7);
            }
            if (struct.isSetIng()) {
                bitSet.set(8);
            }
            if (struct.isSetIng_topic_id()) {
                bitSet.set(9);
            }
            if (struct.isSetEr()) {
                bitSet.set(10);
            }
            if (struct.isSetEr_topic_id()) {
                bitSet.set(11);
            }
            if (struct.isSetEst()) {
                bitSet.set(12);
            }
            if (struct.isSetEst_topic_id()) {
                bitSet.set(13);
            }
            if (struct.isSetPrep()) {
                bitSet.set(14);
            }
            if (struct.isSetPrep_topic_id()) {
                bitSet.set(15);
            }
            if (struct.isSetAdv()) {
                bitSet.set(16);
            }
            if (struct.isSetAdv_topic_id()) {
                bitSet.set(17);
            }
            if (struct.isSetVerb()) {
                bitSet.set(18);
            }
            if (struct.isSetVerb_topic_id()) {
                bitSet.set(19);
            }
            if (struct.isSetNoun()) {
                bitSet.set(20);
            }
            if (struct.isSetNoun_topic_id()) {
                bitSet.set(21);
            }
            if (struct.isSetAdj()) {
                bitSet.set(22);
            }
            if (struct.isSetAdj_topic_id()) {
                bitSet.set(23);
            }
            if (struct.isSetConn()) {
                bitSet.set(24);
            }
            if (struct.isSetConn_topic_id()) {
                bitSet.set(25);
            }
            tTupleProtocol.writeBitSet(bitSet, 26);
            if (struct.isSetPl()) {
                tTupleProtocol.writeString(struct.f28163pl);
            }
            if (struct.isSetPl_topic_id()) {
                tTupleProtocol.writeI32(struct.pl_topic_id);
            }
            if (struct.isSetThird()) {
                tTupleProtocol.writeString(struct.third);
            }
            if (struct.isSetThird_topic_id()) {
                tTupleProtocol.writeI32(struct.third_topic_id);
            }
            if (struct.isSetPast()) {
                tTupleProtocol.writeString(struct.past);
            }
            if (struct.isSetPast_topic_id()) {
                tTupleProtocol.writeI32(struct.past_topic_id);
            }
            if (struct.isSetDone()) {
                tTupleProtocol.writeString(struct.done);
            }
            if (struct.isSetDone_topic_id()) {
                tTupleProtocol.writeI32(struct.done_topic_id);
            }
            if (struct.isSetIng()) {
                tTupleProtocol.writeString(struct.ing);
            }
            if (struct.isSetIng_topic_id()) {
                tTupleProtocol.writeI32(struct.ing_topic_id);
            }
            if (struct.isSetEr()) {
                tTupleProtocol.writeString(struct.f28162er);
            }
            if (struct.isSetEr_topic_id()) {
                tTupleProtocol.writeI32(struct.er_topic_id);
            }
            if (struct.isSetEst()) {
                tTupleProtocol.writeString(struct.est);
            }
            if (struct.isSetEst_topic_id()) {
                tTupleProtocol.writeI32(struct.est_topic_id);
            }
            if (struct.isSetPrep()) {
                tTupleProtocol.writeString(struct.prep);
            }
            if (struct.isSetPrep_topic_id()) {
                tTupleProtocol.writeI32(struct.prep_topic_id);
            }
            if (struct.isSetAdv()) {
                tTupleProtocol.writeString(struct.adv);
            }
            if (struct.isSetAdv_topic_id()) {
                tTupleProtocol.writeI32(struct.adv_topic_id);
            }
            if (struct.isSetVerb()) {
                tTupleProtocol.writeString(struct.verb);
            }
            if (struct.isSetVerb_topic_id()) {
                tTupleProtocol.writeI32(struct.verb_topic_id);
            }
            if (struct.isSetNoun()) {
                tTupleProtocol.writeString(struct.noun);
            }
            if (struct.isSetNoun_topic_id()) {
                tTupleProtocol.writeI32(struct.noun_topic_id);
            }
            if (struct.isSetAdj()) {
                tTupleProtocol.writeString(struct.adj);
            }
            if (struct.isSetAdj_topic_id()) {
                tTupleProtocol.writeI32(struct.adj_topic_id);
            }
            if (struct.isSetConn()) {
                tTupleProtocol.writeString(struct.conn);
            }
            if (struct.isSetConn_topic_id()) {
                tTupleProtocol.writeI32(struct.conn_topic_id);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class VariantInfoTupleSchemeFactory implements SchemeFactory {
        private VariantInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public VariantInfoTupleScheme getScheme() {
            return new VariantInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        TOPIC_ID(1, "topic_id"),
        PL(2, "pl"),
        PL_TOPIC_ID(3, "pl_topic_id"),
        THIRD(4, com.alipay.sdk.m.k.b.f10659o),
        THIRD_TOPIC_ID(5, "third_topic_id"),
        PAST(6, "past"),
        PAST_TOPIC_ID(7, "past_topic_id"),
        DONE(8, "done"),
        DONE_TOPIC_ID(9, "done_topic_id"),
        ING(10, "ing"),
        ING_TOPIC_ID(11, "ing_topic_id"),
        ER(12, "er"),
        ER_TOPIC_ID(13, "er_topic_id"),
        EST(14, "est"),
        EST_TOPIC_ID(15, "est_topic_id"),
        PREP(16, "prep"),
        PREP_TOPIC_ID(17, "prep_topic_id"),
        ADV(18, "adv"),
        ADV_TOPIC_ID(19, "adv_topic_id"),
        VERB(20, "verb"),
        VERB_TOPIC_ID(21, "verb_topic_id"),
        NOUN(22, "noun"),
        NOUN_TOPIC_ID(23, "noun_topic_id"),
        ADJ(24, "adj"),
        ADJ_TOPIC_ID(25, "adj_topic_id"),
        CONN(26, "conn"),
        CONN_TOPIC_ID(27, "conn_topic_id");

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
                    return TOPIC_ID;
                case 2:
                    return PL;
                case 3:
                    return PL_TOPIC_ID;
                case 4:
                    return THIRD;
                case 5:
                    return THIRD_TOPIC_ID;
                case 6:
                    return PAST;
                case 7:
                    return PAST_TOPIC_ID;
                case 8:
                    return DONE;
                case 9:
                    return DONE_TOPIC_ID;
                case 10:
                    return ING;
                case 11:
                    return ING_TOPIC_ID;
                case 12:
                    return ER;
                case 13:
                    return ER_TOPIC_ID;
                case 14:
                    return EST;
                case 15:
                    return EST_TOPIC_ID;
                case 16:
                    return PREP;
                case 17:
                    return PREP_TOPIC_ID;
                case 18:
                    return ADV;
                case 19:
                    return ADV_TOPIC_ID;
                case 20:
                    return VERB;
                case 21:
                    return VERB_TOPIC_ID;
                case 22:
                    return NOUN;
                case 23:
                    return NOUN_TOPIC_ID;
                case 24:
                    return ADJ;
                case 25:
                    return ADJ_TOPIC_ID;
                case 26:
                    return CONN;
                case 27:
                    return CONN_TOPIC_ID;
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
        hashMap.put(StandardScheme.class, new VariantInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new VariantInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.TOPIC_ID, (_Fields) new FieldMetaData("topic_id", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.PL, (_Fields) new FieldMetaData("pl", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.PL_TOPIC_ID, (_Fields) new FieldMetaData("pl_topic_id", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.THIRD, (_Fields) new FieldMetaData(com.alipay.sdk.m.k.b.f10659o, (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.THIRD_TOPIC_ID, (_Fields) new FieldMetaData("third_topic_id", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.PAST, (_Fields) new FieldMetaData("past", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.PAST_TOPIC_ID, (_Fields) new FieldMetaData("past_topic_id", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.DONE, (_Fields) new FieldMetaData("done", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.DONE_TOPIC_ID, (_Fields) new FieldMetaData("done_topic_id", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.ING, (_Fields) new FieldMetaData("ing", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.ING_TOPIC_ID, (_Fields) new FieldMetaData("ing_topic_id", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.ER, (_Fields) new FieldMetaData("er", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.ER_TOPIC_ID, (_Fields) new FieldMetaData("er_topic_id", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.EST, (_Fields) new FieldMetaData("est", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.EST_TOPIC_ID, (_Fields) new FieldMetaData("est_topic_id", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.PREP, (_Fields) new FieldMetaData("prep", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.PREP_TOPIC_ID, (_Fields) new FieldMetaData("prep_topic_id", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.ADV, (_Fields) new FieldMetaData("adv", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.ADV_TOPIC_ID, (_Fields) new FieldMetaData("adv_topic_id", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.VERB, (_Fields) new FieldMetaData("verb", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.VERB_TOPIC_ID, (_Fields) new FieldMetaData("verb_topic_id", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.NOUN, (_Fields) new FieldMetaData("noun", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.NOUN_TOPIC_ID, (_Fields) new FieldMetaData("noun_topic_id", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.ADJ, (_Fields) new FieldMetaData("adj", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.ADJ_TOPIC_ID, (_Fields) new FieldMetaData("adj_topic_id", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.CONN, (_Fields) new FieldMetaData("conn", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.CONN_TOPIC_ID, (_Fields) new FieldMetaData("conn_topic_id", (byte) 2, new FieldValueMetaData((byte) 8)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(VariantInfo.class, unmodifiableMap);
    }

    public VariantInfo() {
        this.__isset_bitfield = (short) 0;
        this.optionals = new _Fields[]{_Fields.PL, _Fields.PL_TOPIC_ID, _Fields.THIRD, _Fields.THIRD_TOPIC_ID, _Fields.PAST, _Fields.PAST_TOPIC_ID, _Fields.DONE, _Fields.DONE_TOPIC_ID, _Fields.ING, _Fields.ING_TOPIC_ID, _Fields.ER, _Fields.ER_TOPIC_ID, _Fields.EST, _Fields.EST_TOPIC_ID, _Fields.PREP, _Fields.PREP_TOPIC_ID, _Fields.ADV, _Fields.ADV_TOPIC_ID, _Fields.VERB, _Fields.VERB_TOPIC_ID, _Fields.NOUN, _Fields.NOUN_TOPIC_ID, _Fields.ADJ, _Fields.ADJ_TOPIC_ID, _Fields.CONN, _Fields.CONN_TOPIC_ID};
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
        setTopic_idIsSet(false);
        this.topic_id = 0;
        this.f28163pl = null;
        setPl_topic_idIsSet(false);
        this.pl_topic_id = 0;
        this.third = null;
        setThird_topic_idIsSet(false);
        this.third_topic_id = 0;
        this.past = null;
        setPast_topic_idIsSet(false);
        this.past_topic_id = 0;
        this.done = null;
        setDone_topic_idIsSet(false);
        this.done_topic_id = 0;
        this.ing = null;
        setIng_topic_idIsSet(false);
        this.ing_topic_id = 0;
        this.f28162er = null;
        setEr_topic_idIsSet(false);
        this.er_topic_id = 0;
        this.est = null;
        setEst_topic_idIsSet(false);
        this.est_topic_id = 0;
        this.prep = null;
        setPrep_topic_idIsSet(false);
        this.prep_topic_id = 0;
        this.adv = null;
        setAdv_topic_idIsSet(false);
        this.adv_topic_id = 0;
        this.verb = null;
        setVerb_topic_idIsSet(false);
        this.verb_topic_id = 0;
        this.noun = null;
        setNoun_topic_idIsSet(false);
        this.noun_topic_id = 0;
        this.adj = null;
        setAdj_topic_idIsSet(false);
        this.adj_topic_id = 0;
        this.conn = null;
        setConn_topic_idIsSet(false);
        this.conn_topic_id = 0;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof VariantInfo)) {
            return equals((VariantInfo) that);
        }
        return false;
    }

    public String getAdj() {
        return this.adj;
    }

    public int getAdj_topic_id() {
        return this.adj_topic_id;
    }

    public String getAdv() {
        return this.adv;
    }

    public int getAdv_topic_id() {
        return this.adv_topic_id;
    }

    public String getConn() {
        return this.conn;
    }

    public int getConn_topic_id() {
        return this.conn_topic_id;
    }

    public String getDone() {
        return this.done;
    }

    public int getDone_topic_id() {
        return this.done_topic_id;
    }

    public String getEr() {
        return this.f28162er;
    }

    public int getEr_topic_id() {
        return this.er_topic_id;
    }

    public String getEst() {
        return this.est;
    }

    public int getEst_topic_id() {
        return this.est_topic_id;
    }

    public String getIng() {
        return this.ing;
    }

    public int getIng_topic_id() {
        return this.ing_topic_id;
    }

    public String getNoun() {
        return this.noun;
    }

    public int getNoun_topic_id() {
        return this.noun_topic_id;
    }

    public String getPast() {
        return this.past;
    }

    public int getPast_topic_id() {
        return this.past_topic_id;
    }

    public String getPl() {
        return this.f28163pl;
    }

    public int getPl_topic_id() {
        return this.pl_topic_id;
    }

    public String getPrep() {
        return this.prep;
    }

    public int getPrep_topic_id() {
        return this.prep_topic_id;
    }

    public String getThird() {
        return this.third;
    }

    public int getThird_topic_id() {
        return this.third_topic_id;
    }

    public int getTopic_id() {
        return this.topic_id;
    }

    public String getVerb() {
        return this.verb;
    }

    public int getVerb_topic_id() {
        return this.verb_topic_id;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetAdj() {
        return this.adj != null;
    }

    public boolean isSetAdj_topic_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 12);
    }

    public boolean isSetAdv() {
        return this.adv != null;
    }

    public boolean isSetAdv_topic_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 9);
    }

    public boolean isSetConn() {
        return this.conn != null;
    }

    public boolean isSetConn_topic_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 13);
    }

    public boolean isSetDone() {
        return this.done != null;
    }

    public boolean isSetDone_topic_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 4);
    }

    public boolean isSetEr() {
        return this.f28162er != null;
    }

    public boolean isSetEr_topic_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 6);
    }

    public boolean isSetEst() {
        return this.est != null;
    }

    public boolean isSetEst_topic_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 7);
    }

    public boolean isSetIng() {
        return this.ing != null;
    }

    public boolean isSetIng_topic_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 5);
    }

    public boolean isSetNoun() {
        return this.noun != null;
    }

    public boolean isSetNoun_topic_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 11);
    }

    public boolean isSetPast() {
        return this.past != null;
    }

    public boolean isSetPast_topic_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 3);
    }

    public boolean isSetPl() {
        return this.f28163pl != null;
    }

    public boolean isSetPl_topic_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetPrep() {
        return this.prep != null;
    }

    public boolean isSetPrep_topic_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 8);
    }

    public boolean isSetThird() {
        return this.third != null;
    }

    public boolean isSetThird_topic_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 2);
    }

    public boolean isSetTopic_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetVerb() {
        return this.verb != null;
    }

    public boolean isSetVerb_topic_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 10);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public VariantInfo setAdj(String adj) {
        this.adj = adj;
        return this;
    }

    public void setAdjIsSet(boolean value) {
        if (value) {
            return;
        }
        this.adj = null;
    }

    public VariantInfo setAdj_topic_id(int adj_topic_id) {
        this.adj_topic_id = adj_topic_id;
        setAdj_topic_idIsSet(true);
        return this;
    }

    public void setAdj_topic_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 12, value);
    }

    public VariantInfo setAdv(String adv) {
        this.adv = adv;
        return this;
    }

    public void setAdvIsSet(boolean value) {
        if (value) {
            return;
        }
        this.adv = null;
    }

    public VariantInfo setAdv_topic_id(int adv_topic_id) {
        this.adv_topic_id = adv_topic_id;
        setAdv_topic_idIsSet(true);
        return this;
    }

    public void setAdv_topic_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 9, value);
    }

    public VariantInfo setConn(String conn) {
        this.conn = conn;
        return this;
    }

    public void setConnIsSet(boolean value) {
        if (value) {
            return;
        }
        this.conn = null;
    }

    public VariantInfo setConn_topic_id(int conn_topic_id) {
        this.conn_topic_id = conn_topic_id;
        setConn_topic_idIsSet(true);
        return this;
    }

    public void setConn_topic_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 13, value);
    }

    public VariantInfo setDone(String done) {
        this.done = done;
        return this;
    }

    public void setDoneIsSet(boolean value) {
        if (value) {
            return;
        }
        this.done = null;
    }

    public VariantInfo setDone_topic_id(int done_topic_id) {
        this.done_topic_id = done_topic_id;
        setDone_topic_idIsSet(true);
        return this;
    }

    public void setDone_topic_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 4, value);
    }

    public VariantInfo setEr(String er2) {
        this.f28162er = er2;
        return this;
    }

    public void setErIsSet(boolean value) {
        if (value) {
            return;
        }
        this.f28162er = null;
    }

    public VariantInfo setEr_topic_id(int er_topic_id) {
        this.er_topic_id = er_topic_id;
        setEr_topic_idIsSet(true);
        return this;
    }

    public void setEr_topic_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 6, value);
    }

    public VariantInfo setEst(String est) {
        this.est = est;
        return this;
    }

    public void setEstIsSet(boolean value) {
        if (value) {
            return;
        }
        this.est = null;
    }

    public VariantInfo setEst_topic_id(int est_topic_id) {
        this.est_topic_id = est_topic_id;
        setEst_topic_idIsSet(true);
        return this;
    }

    public void setEst_topic_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 7, value);
    }

    public VariantInfo setIng(String ing) {
        this.ing = ing;
        return this;
    }

    public void setIngIsSet(boolean value) {
        if (value) {
            return;
        }
        this.ing = null;
    }

    public VariantInfo setIng_topic_id(int ing_topic_id) {
        this.ing_topic_id = ing_topic_id;
        setIng_topic_idIsSet(true);
        return this;
    }

    public void setIng_topic_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 5, value);
    }

    public VariantInfo setNoun(String noun) {
        this.noun = noun;
        return this;
    }

    public void setNounIsSet(boolean value) {
        if (value) {
            return;
        }
        this.noun = null;
    }

    public VariantInfo setNoun_topic_id(int noun_topic_id) {
        this.noun_topic_id = noun_topic_id;
        setNoun_topic_idIsSet(true);
        return this;
    }

    public void setNoun_topic_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 11, value);
    }

    public VariantInfo setPast(String past) {
        this.past = past;
        return this;
    }

    public void setPastIsSet(boolean value) {
        if (value) {
            return;
        }
        this.past = null;
    }

    public VariantInfo setPast_topic_id(int past_topic_id) {
        this.past_topic_id = past_topic_id;
        setPast_topic_idIsSet(true);
        return this;
    }

    public void setPast_topic_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 3, value);
    }

    public VariantInfo setPl(String pl2) {
        this.f28163pl = pl2;
        return this;
    }

    public void setPlIsSet(boolean value) {
        if (value) {
            return;
        }
        this.f28163pl = null;
    }

    public VariantInfo setPl_topic_id(int pl_topic_id) {
        this.pl_topic_id = pl_topic_id;
        setPl_topic_idIsSet(true);
        return this;
    }

    public void setPl_topic_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public VariantInfo setPrep(String prep) {
        this.prep = prep;
        return this;
    }

    public void setPrepIsSet(boolean value) {
        if (value) {
            return;
        }
        this.prep = null;
    }

    public VariantInfo setPrep_topic_id(int prep_topic_id) {
        this.prep_topic_id = prep_topic_id;
        setPrep_topic_idIsSet(true);
        return this;
    }

    public void setPrep_topic_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 8, value);
    }

    public VariantInfo setThird(String third) {
        this.third = third;
        return this;
    }

    public void setThirdIsSet(boolean value) {
        if (value) {
            return;
        }
        this.third = null;
    }

    public VariantInfo setThird_topic_id(int third_topic_id) {
        this.third_topic_id = third_topic_id;
        setThird_topic_idIsSet(true);
        return this;
    }

    public void setThird_topic_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 2, value);
    }

    public VariantInfo setTopic_id(int topic_id) {
        this.topic_id = topic_id;
        setTopic_idIsSet(true);
        return this;
    }

    public void setTopic_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public VariantInfo setVerb(String verb) {
        this.verb = verb;
        return this;
    }

    public void setVerbIsSet(boolean value) {
        if (value) {
            return;
        }
        this.verb = null;
    }

    public VariantInfo setVerb_topic_id(int verb_topic_id) {
        this.verb_topic_id = verb_topic_id;
        setVerb_topic_idIsSet(true);
        return this;
    }

    public void setVerb_topic_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 10, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("VariantInfo(");
        sb2.append("topic_id:");
        sb2.append(this.topic_id);
        if (isSetPl()) {
            sb2.append(j2.O);
            sb2.append("pl:");
            String str = this.f28163pl;
            if (str == null) {
                sb2.append("null");
            } else {
                sb2.append(str);
            }
        }
        if (isSetPl_topic_id()) {
            sb2.append(j2.O);
            sb2.append("pl_topic_id:");
            sb2.append(this.pl_topic_id);
        }
        if (isSetThird()) {
            sb2.append(j2.O);
            sb2.append("third:");
            String str2 = this.third;
            if (str2 == null) {
                sb2.append("null");
            } else {
                sb2.append(str2);
            }
        }
        if (isSetThird_topic_id()) {
            sb2.append(j2.O);
            sb2.append("third_topic_id:");
            sb2.append(this.third_topic_id);
        }
        if (isSetPast()) {
            sb2.append(j2.O);
            sb2.append("past:");
            String str3 = this.past;
            if (str3 == null) {
                sb2.append("null");
            } else {
                sb2.append(str3);
            }
        }
        if (isSetPast_topic_id()) {
            sb2.append(j2.O);
            sb2.append("past_topic_id:");
            sb2.append(this.past_topic_id);
        }
        if (isSetDone()) {
            sb2.append(j2.O);
            sb2.append("done:");
            String str4 = this.done;
            if (str4 == null) {
                sb2.append("null");
            } else {
                sb2.append(str4);
            }
        }
        if (isSetDone_topic_id()) {
            sb2.append(j2.O);
            sb2.append("done_topic_id:");
            sb2.append(this.done_topic_id);
        }
        if (isSetIng()) {
            sb2.append(j2.O);
            sb2.append("ing:");
            String str5 = this.ing;
            if (str5 == null) {
                sb2.append("null");
            } else {
                sb2.append(str5);
            }
        }
        if (isSetIng_topic_id()) {
            sb2.append(j2.O);
            sb2.append("ing_topic_id:");
            sb2.append(this.ing_topic_id);
        }
        if (isSetEr()) {
            sb2.append(j2.O);
            sb2.append("er:");
            String str6 = this.f28162er;
            if (str6 == null) {
                sb2.append("null");
            } else {
                sb2.append(str6);
            }
        }
        if (isSetEr_topic_id()) {
            sb2.append(j2.O);
            sb2.append("er_topic_id:");
            sb2.append(this.er_topic_id);
        }
        if (isSetEst()) {
            sb2.append(j2.O);
            sb2.append("est:");
            String str7 = this.est;
            if (str7 == null) {
                sb2.append("null");
            } else {
                sb2.append(str7);
            }
        }
        if (isSetEst_topic_id()) {
            sb2.append(j2.O);
            sb2.append("est_topic_id:");
            sb2.append(this.est_topic_id);
        }
        if (isSetPrep()) {
            sb2.append(j2.O);
            sb2.append("prep:");
            String str8 = this.prep;
            if (str8 == null) {
                sb2.append("null");
            } else {
                sb2.append(str8);
            }
        }
        if (isSetPrep_topic_id()) {
            sb2.append(j2.O);
            sb2.append("prep_topic_id:");
            sb2.append(this.prep_topic_id);
        }
        if (isSetAdv()) {
            sb2.append(j2.O);
            sb2.append("adv:");
            String str9 = this.adv;
            if (str9 == null) {
                sb2.append("null");
            } else {
                sb2.append(str9);
            }
        }
        if (isSetAdv_topic_id()) {
            sb2.append(j2.O);
            sb2.append("adv_topic_id:");
            sb2.append(this.adv_topic_id);
        }
        if (isSetVerb()) {
            sb2.append(j2.O);
            sb2.append("verb:");
            String str10 = this.verb;
            if (str10 == null) {
                sb2.append("null");
            } else {
                sb2.append(str10);
            }
        }
        if (isSetVerb_topic_id()) {
            sb2.append(j2.O);
            sb2.append("verb_topic_id:");
            sb2.append(this.verb_topic_id);
        }
        if (isSetNoun()) {
            sb2.append(j2.O);
            sb2.append("noun:");
            String str11 = this.noun;
            if (str11 == null) {
                sb2.append("null");
            } else {
                sb2.append(str11);
            }
        }
        if (isSetNoun_topic_id()) {
            sb2.append(j2.O);
            sb2.append("noun_topic_id:");
            sb2.append(this.noun_topic_id);
        }
        if (isSetAdj()) {
            sb2.append(j2.O);
            sb2.append("adj:");
            String str12 = this.adj;
            if (str12 == null) {
                sb2.append("null");
            } else {
                sb2.append(str12);
            }
        }
        if (isSetAdj_topic_id()) {
            sb2.append(j2.O);
            sb2.append("adj_topic_id:");
            sb2.append(this.adj_topic_id);
        }
        if (isSetConn()) {
            sb2.append(j2.O);
            sb2.append("conn:");
            String str13 = this.conn;
            if (str13 == null) {
                sb2.append("null");
            } else {
                sb2.append(str13);
            }
        }
        if (isSetConn_topic_id()) {
            sb2.append(j2.O);
            sb2.append("conn_topic_id:");
            sb2.append(this.conn_topic_id);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetAdj() {
        this.adj = null;
    }

    public void unsetAdj_topic_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 12);
    }

    public void unsetAdv() {
        this.adv = null;
    }

    public void unsetAdv_topic_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 9);
    }

    public void unsetConn() {
        this.conn = null;
    }

    public void unsetConn_topic_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 13);
    }

    public void unsetDone() {
        this.done = null;
    }

    public void unsetDone_topic_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 4);
    }

    public void unsetEr() {
        this.f28162er = null;
    }

    public void unsetEr_topic_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 6);
    }

    public void unsetEst() {
        this.est = null;
    }

    public void unsetEst_topic_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 7);
    }

    public void unsetIng() {
        this.ing = null;
    }

    public void unsetIng_topic_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 5);
    }

    public void unsetNoun() {
        this.noun = null;
    }

    public void unsetNoun_topic_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 11);
    }

    public void unsetPast() {
        this.past = null;
    }

    public void unsetPast_topic_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 3);
    }

    public void unsetPl() {
        this.f28163pl = null;
    }

    public void unsetPl_topic_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetPrep() {
        this.prep = null;
    }

    public void unsetPrep_topic_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 8);
    }

    public void unsetThird() {
        this.third = null;
    }

    public void unsetThird_topic_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 2);
    }

    public void unsetTopic_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetVerb() {
        this.verb = null;
    }

    public void unsetVerb_topic_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 10);
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(VariantInfo other) {
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
        int compareTo21;
        int compareTo22;
        int compareTo23;
        int compareTo24;
        int compareTo25;
        int compareTo26;
        int compareTo27;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo28 = Boolean.valueOf(isSetTopic_id()).compareTo(Boolean.valueOf(other.isSetTopic_id()));
        if (compareTo28 != 0) {
            return compareTo28;
        }
        if (isSetTopic_id() && (compareTo27 = TBaseHelper.compareTo(this.topic_id, other.topic_id)) != 0) {
            return compareTo27;
        }
        int compareTo29 = Boolean.valueOf(isSetPl()).compareTo(Boolean.valueOf(other.isSetPl()));
        if (compareTo29 != 0) {
            return compareTo29;
        }
        if (isSetPl() && (compareTo26 = TBaseHelper.compareTo(this.f28163pl, other.f28163pl)) != 0) {
            return compareTo26;
        }
        int compareTo30 = Boolean.valueOf(isSetPl_topic_id()).compareTo(Boolean.valueOf(other.isSetPl_topic_id()));
        if (compareTo30 != 0) {
            return compareTo30;
        }
        if (isSetPl_topic_id() && (compareTo25 = TBaseHelper.compareTo(this.pl_topic_id, other.pl_topic_id)) != 0) {
            return compareTo25;
        }
        int compareTo31 = Boolean.valueOf(isSetThird()).compareTo(Boolean.valueOf(other.isSetThird()));
        if (compareTo31 != 0) {
            return compareTo31;
        }
        if (isSetThird() && (compareTo24 = TBaseHelper.compareTo(this.third, other.third)) != 0) {
            return compareTo24;
        }
        int compareTo32 = Boolean.valueOf(isSetThird_topic_id()).compareTo(Boolean.valueOf(other.isSetThird_topic_id()));
        if (compareTo32 != 0) {
            return compareTo32;
        }
        if (isSetThird_topic_id() && (compareTo23 = TBaseHelper.compareTo(this.third_topic_id, other.third_topic_id)) != 0) {
            return compareTo23;
        }
        int compareTo33 = Boolean.valueOf(isSetPast()).compareTo(Boolean.valueOf(other.isSetPast()));
        if (compareTo33 != 0) {
            return compareTo33;
        }
        if (isSetPast() && (compareTo22 = TBaseHelper.compareTo(this.past, other.past)) != 0) {
            return compareTo22;
        }
        int compareTo34 = Boolean.valueOf(isSetPast_topic_id()).compareTo(Boolean.valueOf(other.isSetPast_topic_id()));
        if (compareTo34 != 0) {
            return compareTo34;
        }
        if (isSetPast_topic_id() && (compareTo21 = TBaseHelper.compareTo(this.past_topic_id, other.past_topic_id)) != 0) {
            return compareTo21;
        }
        int compareTo35 = Boolean.valueOf(isSetDone()).compareTo(Boolean.valueOf(other.isSetDone()));
        if (compareTo35 != 0) {
            return compareTo35;
        }
        if (isSetDone() && (compareTo20 = TBaseHelper.compareTo(this.done, other.done)) != 0) {
            return compareTo20;
        }
        int compareTo36 = Boolean.valueOf(isSetDone_topic_id()).compareTo(Boolean.valueOf(other.isSetDone_topic_id()));
        if (compareTo36 != 0) {
            return compareTo36;
        }
        if (isSetDone_topic_id() && (compareTo19 = TBaseHelper.compareTo(this.done_topic_id, other.done_topic_id)) != 0) {
            return compareTo19;
        }
        int compareTo37 = Boolean.valueOf(isSetIng()).compareTo(Boolean.valueOf(other.isSetIng()));
        if (compareTo37 != 0) {
            return compareTo37;
        }
        if (isSetIng() && (compareTo18 = TBaseHelper.compareTo(this.ing, other.ing)) != 0) {
            return compareTo18;
        }
        int compareTo38 = Boolean.valueOf(isSetIng_topic_id()).compareTo(Boolean.valueOf(other.isSetIng_topic_id()));
        if (compareTo38 != 0) {
            return compareTo38;
        }
        if (isSetIng_topic_id() && (compareTo17 = TBaseHelper.compareTo(this.ing_topic_id, other.ing_topic_id)) != 0) {
            return compareTo17;
        }
        int compareTo39 = Boolean.valueOf(isSetEr()).compareTo(Boolean.valueOf(other.isSetEr()));
        if (compareTo39 != 0) {
            return compareTo39;
        }
        if (isSetEr() && (compareTo16 = TBaseHelper.compareTo(this.f28162er, other.f28162er)) != 0) {
            return compareTo16;
        }
        int compareTo40 = Boolean.valueOf(isSetEr_topic_id()).compareTo(Boolean.valueOf(other.isSetEr_topic_id()));
        if (compareTo40 != 0) {
            return compareTo40;
        }
        if (isSetEr_topic_id() && (compareTo15 = TBaseHelper.compareTo(this.er_topic_id, other.er_topic_id)) != 0) {
            return compareTo15;
        }
        int compareTo41 = Boolean.valueOf(isSetEst()).compareTo(Boolean.valueOf(other.isSetEst()));
        if (compareTo41 != 0) {
            return compareTo41;
        }
        if (isSetEst() && (compareTo14 = TBaseHelper.compareTo(this.est, other.est)) != 0) {
            return compareTo14;
        }
        int compareTo42 = Boolean.valueOf(isSetEst_topic_id()).compareTo(Boolean.valueOf(other.isSetEst_topic_id()));
        if (compareTo42 != 0) {
            return compareTo42;
        }
        if (isSetEst_topic_id() && (compareTo13 = TBaseHelper.compareTo(this.est_topic_id, other.est_topic_id)) != 0) {
            return compareTo13;
        }
        int compareTo43 = Boolean.valueOf(isSetPrep()).compareTo(Boolean.valueOf(other.isSetPrep()));
        if (compareTo43 != 0) {
            return compareTo43;
        }
        if (isSetPrep() && (compareTo12 = TBaseHelper.compareTo(this.prep, other.prep)) != 0) {
            return compareTo12;
        }
        int compareTo44 = Boolean.valueOf(isSetPrep_topic_id()).compareTo(Boolean.valueOf(other.isSetPrep_topic_id()));
        if (compareTo44 != 0) {
            return compareTo44;
        }
        if (isSetPrep_topic_id() && (compareTo11 = TBaseHelper.compareTo(this.prep_topic_id, other.prep_topic_id)) != 0) {
            return compareTo11;
        }
        int compareTo45 = Boolean.valueOf(isSetAdv()).compareTo(Boolean.valueOf(other.isSetAdv()));
        if (compareTo45 != 0) {
            return compareTo45;
        }
        if (isSetAdv() && (compareTo10 = TBaseHelper.compareTo(this.adv, other.adv)) != 0) {
            return compareTo10;
        }
        int compareTo46 = Boolean.valueOf(isSetAdv_topic_id()).compareTo(Boolean.valueOf(other.isSetAdv_topic_id()));
        if (compareTo46 != 0) {
            return compareTo46;
        }
        if (isSetAdv_topic_id() && (compareTo9 = TBaseHelper.compareTo(this.adv_topic_id, other.adv_topic_id)) != 0) {
            return compareTo9;
        }
        int compareTo47 = Boolean.valueOf(isSetVerb()).compareTo(Boolean.valueOf(other.isSetVerb()));
        if (compareTo47 != 0) {
            return compareTo47;
        }
        if (isSetVerb() && (compareTo8 = TBaseHelper.compareTo(this.verb, other.verb)) != 0) {
            return compareTo8;
        }
        int compareTo48 = Boolean.valueOf(isSetVerb_topic_id()).compareTo(Boolean.valueOf(other.isSetVerb_topic_id()));
        if (compareTo48 != 0) {
            return compareTo48;
        }
        if (isSetVerb_topic_id() && (compareTo7 = TBaseHelper.compareTo(this.verb_topic_id, other.verb_topic_id)) != 0) {
            return compareTo7;
        }
        int compareTo49 = Boolean.valueOf(isSetNoun()).compareTo(Boolean.valueOf(other.isSetNoun()));
        if (compareTo49 != 0) {
            return compareTo49;
        }
        if (isSetNoun() && (compareTo6 = TBaseHelper.compareTo(this.noun, other.noun)) != 0) {
            return compareTo6;
        }
        int compareTo50 = Boolean.valueOf(isSetNoun_topic_id()).compareTo(Boolean.valueOf(other.isSetNoun_topic_id()));
        if (compareTo50 != 0) {
            return compareTo50;
        }
        if (isSetNoun_topic_id() && (compareTo5 = TBaseHelper.compareTo(this.noun_topic_id, other.noun_topic_id)) != 0) {
            return compareTo5;
        }
        int compareTo51 = Boolean.valueOf(isSetAdj()).compareTo(Boolean.valueOf(other.isSetAdj()));
        if (compareTo51 != 0) {
            return compareTo51;
        }
        if (isSetAdj() && (compareTo4 = TBaseHelper.compareTo(this.adj, other.adj)) != 0) {
            return compareTo4;
        }
        int compareTo52 = Boolean.valueOf(isSetAdj_topic_id()).compareTo(Boolean.valueOf(other.isSetAdj_topic_id()));
        if (compareTo52 != 0) {
            return compareTo52;
        }
        if (isSetAdj_topic_id() && (compareTo3 = TBaseHelper.compareTo(this.adj_topic_id, other.adj_topic_id)) != 0) {
            return compareTo3;
        }
        int compareTo53 = Boolean.valueOf(isSetConn()).compareTo(Boolean.valueOf(other.isSetConn()));
        if (compareTo53 != 0) {
            return compareTo53;
        }
        if (isSetConn() && (compareTo2 = TBaseHelper.compareTo(this.conn, other.conn)) != 0) {
            return compareTo2;
        }
        int compareTo54 = Boolean.valueOf(isSetConn_topic_id()).compareTo(Boolean.valueOf(other.isSetConn_topic_id()));
        if (compareTo54 != 0) {
            return compareTo54;
        }
        if (!isSetConn_topic_id() || (compareTo = TBaseHelper.compareTo(this.conn_topic_id, other.conn_topic_id)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<VariantInfo, _Fields> deepCopy2() {
        return new VariantInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$VariantInfo$_Fields[field.ordinal()]) {
            case 1:
                return Integer.valueOf(getTopic_id());
            case 2:
                return getPl();
            case 3:
                return Integer.valueOf(getPl_topic_id());
            case 4:
                return getThird();
            case 5:
                return Integer.valueOf(getThird_topic_id());
            case 6:
                return getPast();
            case 7:
                return Integer.valueOf(getPast_topic_id());
            case 8:
                return getDone();
            case 9:
                return Integer.valueOf(getDone_topic_id());
            case 10:
                return getIng();
            case 11:
                return Integer.valueOf(getIng_topic_id());
            case 12:
                return getEr();
            case 13:
                return Integer.valueOf(getEr_topic_id());
            case 14:
                return getEst();
            case 15:
                return Integer.valueOf(getEst_topic_id());
            case 16:
                return getPrep();
            case 17:
                return Integer.valueOf(getPrep_topic_id());
            case 18:
                return getAdv();
            case 19:
                return Integer.valueOf(getAdv_topic_id());
            case 20:
                return getVerb();
            case 21:
                return Integer.valueOf(getVerb_topic_id());
            case 22:
                return getNoun();
            case 23:
                return Integer.valueOf(getNoun_topic_id());
            case 24:
                return getAdj();
            case 25:
                return Integer.valueOf(getAdj_topic_id());
            case 26:
                return getConn();
            case 27:
                return Integer.valueOf(getConn_topic_id());
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$VariantInfo$_Fields[field.ordinal()]) {
            case 1:
                return isSetTopic_id();
            case 2:
                return isSetPl();
            case 3:
                return isSetPl_topic_id();
            case 4:
                return isSetThird();
            case 5:
                return isSetThird_topic_id();
            case 6:
                return isSetPast();
            case 7:
                return isSetPast_topic_id();
            case 8:
                return isSetDone();
            case 9:
                return isSetDone_topic_id();
            case 10:
                return isSetIng();
            case 11:
                return isSetIng_topic_id();
            case 12:
                return isSetEr();
            case 13:
                return isSetEr_topic_id();
            case 14:
                return isSetEst();
            case 15:
                return isSetEst_topic_id();
            case 16:
                return isSetPrep();
            case 17:
                return isSetPrep_topic_id();
            case 18:
                return isSetAdv();
            case 19:
                return isSetAdv_topic_id();
            case 20:
                return isSetVerb();
            case 21:
                return isSetVerb_topic_id();
            case 22:
                return isSetNoun();
            case 23:
                return isSetNoun_topic_id();
            case 24:
                return isSetAdj();
            case 25:
                return isSetAdj_topic_id();
            case 26:
                return isSetConn();
            case 27:
                return isSetConn_topic_id();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$VariantInfo$_Fields[field.ordinal()]) {
            case 1:
                if (value != null) {
                    setTopic_id(((Integer) value).intValue());
                    break;
                } else {
                    unsetTopic_id();
                    break;
                }
            case 2:
                if (value != null) {
                    setPl((String) value);
                    break;
                } else {
                    unsetPl();
                    break;
                }
            case 3:
                if (value != null) {
                    setPl_topic_id(((Integer) value).intValue());
                    break;
                } else {
                    unsetPl_topic_id();
                    break;
                }
            case 4:
                if (value != null) {
                    setThird((String) value);
                    break;
                } else {
                    unsetThird();
                    break;
                }
            case 5:
                if (value != null) {
                    setThird_topic_id(((Integer) value).intValue());
                    break;
                } else {
                    unsetThird_topic_id();
                    break;
                }
            case 6:
                if (value != null) {
                    setPast((String) value);
                    break;
                } else {
                    unsetPast();
                    break;
                }
            case 7:
                if (value != null) {
                    setPast_topic_id(((Integer) value).intValue());
                    break;
                } else {
                    unsetPast_topic_id();
                    break;
                }
            case 8:
                if (value != null) {
                    setDone((String) value);
                    break;
                } else {
                    unsetDone();
                    break;
                }
            case 9:
                if (value != null) {
                    setDone_topic_id(((Integer) value).intValue());
                    break;
                } else {
                    unsetDone_topic_id();
                    break;
                }
            case 10:
                if (value != null) {
                    setIng((String) value);
                    break;
                } else {
                    unsetIng();
                    break;
                }
            case 11:
                if (value != null) {
                    setIng_topic_id(((Integer) value).intValue());
                    break;
                } else {
                    unsetIng_topic_id();
                    break;
                }
            case 12:
                if (value != null) {
                    setEr((String) value);
                    break;
                } else {
                    unsetEr();
                    break;
                }
            case 13:
                if (value != null) {
                    setEr_topic_id(((Integer) value).intValue());
                    break;
                } else {
                    unsetEr_topic_id();
                    break;
                }
            case 14:
                if (value != null) {
                    setEst((String) value);
                    break;
                } else {
                    unsetEst();
                    break;
                }
            case 15:
                if (value != null) {
                    setEst_topic_id(((Integer) value).intValue());
                    break;
                } else {
                    unsetEst_topic_id();
                    break;
                }
            case 16:
                if (value != null) {
                    setPrep((String) value);
                    break;
                } else {
                    unsetPrep();
                    break;
                }
            case 17:
                if (value != null) {
                    setPrep_topic_id(((Integer) value).intValue());
                    break;
                } else {
                    unsetPrep_topic_id();
                    break;
                }
            case 18:
                if (value != null) {
                    setAdv((String) value);
                    break;
                } else {
                    unsetAdv();
                    break;
                }
            case 19:
                if (value != null) {
                    setAdv_topic_id(((Integer) value).intValue());
                    break;
                } else {
                    unsetAdv_topic_id();
                    break;
                }
            case 20:
                if (value != null) {
                    setVerb((String) value);
                    break;
                } else {
                    unsetVerb();
                    break;
                }
            case 21:
                if (value != null) {
                    setVerb_topic_id(((Integer) value).intValue());
                    break;
                } else {
                    unsetVerb_topic_id();
                    break;
                }
            case 22:
                if (value != null) {
                    setNoun((String) value);
                    break;
                } else {
                    unsetNoun();
                    break;
                }
            case 23:
                if (value != null) {
                    setNoun_topic_id(((Integer) value).intValue());
                    break;
                } else {
                    unsetNoun_topic_id();
                    break;
                }
            case 24:
                if (value != null) {
                    setAdj((String) value);
                    break;
                } else {
                    unsetAdj();
                    break;
                }
            case 25:
                if (value != null) {
                    setAdj_topic_id(((Integer) value).intValue());
                    break;
                } else {
                    unsetAdj_topic_id();
                    break;
                }
            case 26:
                if (value != null) {
                    setConn((String) value);
                    break;
                } else {
                    unsetConn();
                    break;
                }
            case 27:
                if (value != null) {
                    setConn_topic_id(((Integer) value).intValue());
                    break;
                } else {
                    unsetConn_topic_id();
                    break;
                }
        }
    }

    public boolean equals(VariantInfo that) {
        if (that == null || this.topic_id != that.topic_id) {
            return false;
        }
        boolean isSetPl = isSetPl();
        boolean isSetPl2 = that.isSetPl();
        if ((isSetPl || isSetPl2) && !(isSetPl && isSetPl2 && this.f28163pl.equals(that.f28163pl))) {
            return false;
        }
        boolean isSetPl_topic_id = isSetPl_topic_id();
        boolean isSetPl_topic_id2 = that.isSetPl_topic_id();
        if ((isSetPl_topic_id || isSetPl_topic_id2) && !(isSetPl_topic_id && isSetPl_topic_id2 && this.pl_topic_id == that.pl_topic_id)) {
            return false;
        }
        boolean isSetThird = isSetThird();
        boolean isSetThird2 = that.isSetThird();
        if ((isSetThird || isSetThird2) && !(isSetThird && isSetThird2 && this.third.equals(that.third))) {
            return false;
        }
        boolean isSetThird_topic_id = isSetThird_topic_id();
        boolean isSetThird_topic_id2 = that.isSetThird_topic_id();
        if ((isSetThird_topic_id || isSetThird_topic_id2) && !(isSetThird_topic_id && isSetThird_topic_id2 && this.third_topic_id == that.third_topic_id)) {
            return false;
        }
        boolean isSetPast = isSetPast();
        boolean isSetPast2 = that.isSetPast();
        if ((isSetPast || isSetPast2) && !(isSetPast && isSetPast2 && this.past.equals(that.past))) {
            return false;
        }
        boolean isSetPast_topic_id = isSetPast_topic_id();
        boolean isSetPast_topic_id2 = that.isSetPast_topic_id();
        if ((isSetPast_topic_id || isSetPast_topic_id2) && !(isSetPast_topic_id && isSetPast_topic_id2 && this.past_topic_id == that.past_topic_id)) {
            return false;
        }
        boolean isSetDone = isSetDone();
        boolean isSetDone2 = that.isSetDone();
        if ((isSetDone || isSetDone2) && !(isSetDone && isSetDone2 && this.done.equals(that.done))) {
            return false;
        }
        boolean isSetDone_topic_id = isSetDone_topic_id();
        boolean isSetDone_topic_id2 = that.isSetDone_topic_id();
        if ((isSetDone_topic_id || isSetDone_topic_id2) && !(isSetDone_topic_id && isSetDone_topic_id2 && this.done_topic_id == that.done_topic_id)) {
            return false;
        }
        boolean isSetIng = isSetIng();
        boolean isSetIng2 = that.isSetIng();
        if ((isSetIng || isSetIng2) && !(isSetIng && isSetIng2 && this.ing.equals(that.ing))) {
            return false;
        }
        boolean isSetIng_topic_id = isSetIng_topic_id();
        boolean isSetIng_topic_id2 = that.isSetIng_topic_id();
        if ((isSetIng_topic_id || isSetIng_topic_id2) && !(isSetIng_topic_id && isSetIng_topic_id2 && this.ing_topic_id == that.ing_topic_id)) {
            return false;
        }
        boolean isSetEr = isSetEr();
        boolean isSetEr2 = that.isSetEr();
        if ((isSetEr || isSetEr2) && !(isSetEr && isSetEr2 && this.f28162er.equals(that.f28162er))) {
            return false;
        }
        boolean isSetEr_topic_id = isSetEr_topic_id();
        boolean isSetEr_topic_id2 = that.isSetEr_topic_id();
        if ((isSetEr_topic_id || isSetEr_topic_id2) && !(isSetEr_topic_id && isSetEr_topic_id2 && this.er_topic_id == that.er_topic_id)) {
            return false;
        }
        boolean isSetEst = isSetEst();
        boolean isSetEst2 = that.isSetEst();
        if ((isSetEst || isSetEst2) && !(isSetEst && isSetEst2 && this.est.equals(that.est))) {
            return false;
        }
        boolean isSetEst_topic_id = isSetEst_topic_id();
        boolean isSetEst_topic_id2 = that.isSetEst_topic_id();
        if ((isSetEst_topic_id || isSetEst_topic_id2) && !(isSetEst_topic_id && isSetEst_topic_id2 && this.est_topic_id == that.est_topic_id)) {
            return false;
        }
        boolean isSetPrep = isSetPrep();
        boolean isSetPrep2 = that.isSetPrep();
        if ((isSetPrep || isSetPrep2) && !(isSetPrep && isSetPrep2 && this.prep.equals(that.prep))) {
            return false;
        }
        boolean isSetPrep_topic_id = isSetPrep_topic_id();
        boolean isSetPrep_topic_id2 = that.isSetPrep_topic_id();
        if ((isSetPrep_topic_id || isSetPrep_topic_id2) && !(isSetPrep_topic_id && isSetPrep_topic_id2 && this.prep_topic_id == that.prep_topic_id)) {
            return false;
        }
        boolean isSetAdv = isSetAdv();
        boolean isSetAdv2 = that.isSetAdv();
        if ((isSetAdv || isSetAdv2) && !(isSetAdv && isSetAdv2 && this.adv.equals(that.adv))) {
            return false;
        }
        boolean isSetAdv_topic_id = isSetAdv_topic_id();
        boolean isSetAdv_topic_id2 = that.isSetAdv_topic_id();
        if ((isSetAdv_topic_id || isSetAdv_topic_id2) && !(isSetAdv_topic_id && isSetAdv_topic_id2 && this.adv_topic_id == that.adv_topic_id)) {
            return false;
        }
        boolean isSetVerb = isSetVerb();
        boolean isSetVerb2 = that.isSetVerb();
        if ((isSetVerb || isSetVerb2) && !(isSetVerb && isSetVerb2 && this.verb.equals(that.verb))) {
            return false;
        }
        boolean isSetVerb_topic_id = isSetVerb_topic_id();
        boolean isSetVerb_topic_id2 = that.isSetVerb_topic_id();
        if ((isSetVerb_topic_id || isSetVerb_topic_id2) && !(isSetVerb_topic_id && isSetVerb_topic_id2 && this.verb_topic_id == that.verb_topic_id)) {
            return false;
        }
        boolean isSetNoun = isSetNoun();
        boolean isSetNoun2 = that.isSetNoun();
        if ((isSetNoun || isSetNoun2) && !(isSetNoun && isSetNoun2 && this.noun.equals(that.noun))) {
            return false;
        }
        boolean isSetNoun_topic_id = isSetNoun_topic_id();
        boolean isSetNoun_topic_id2 = that.isSetNoun_topic_id();
        if ((isSetNoun_topic_id || isSetNoun_topic_id2) && !(isSetNoun_topic_id && isSetNoun_topic_id2 && this.noun_topic_id == that.noun_topic_id)) {
            return false;
        }
        boolean isSetAdj = isSetAdj();
        boolean isSetAdj2 = that.isSetAdj();
        if ((isSetAdj || isSetAdj2) && !(isSetAdj && isSetAdj2 && this.adj.equals(that.adj))) {
            return false;
        }
        boolean isSetAdj_topic_id = isSetAdj_topic_id();
        boolean isSetAdj_topic_id2 = that.isSetAdj_topic_id();
        if ((isSetAdj_topic_id || isSetAdj_topic_id2) && !(isSetAdj_topic_id && isSetAdj_topic_id2 && this.adj_topic_id == that.adj_topic_id)) {
            return false;
        }
        boolean isSetConn = isSetConn();
        boolean isSetConn2 = that.isSetConn();
        if ((isSetConn || isSetConn2) && !(isSetConn && isSetConn2 && this.conn.equals(that.conn))) {
            return false;
        }
        boolean isSetConn_topic_id = isSetConn_topic_id();
        boolean isSetConn_topic_id2 = that.isSetConn_topic_id();
        if (isSetConn_topic_id || isSetConn_topic_id2) {
            return isSetConn_topic_id && isSetConn_topic_id2 && this.conn_topic_id == that.conn_topic_id;
        }
        return true;
    }

    public VariantInfo(int topic_id) {
        this();
        this.topic_id = topic_id;
        setTopic_idIsSet(true);
    }

    public VariantInfo(VariantInfo other) {
        this.__isset_bitfield = (short) 0;
        this.optionals = new _Fields[]{_Fields.PL, _Fields.PL_TOPIC_ID, _Fields.THIRD, _Fields.THIRD_TOPIC_ID, _Fields.PAST, _Fields.PAST_TOPIC_ID, _Fields.DONE, _Fields.DONE_TOPIC_ID, _Fields.ING, _Fields.ING_TOPIC_ID, _Fields.ER, _Fields.ER_TOPIC_ID, _Fields.EST, _Fields.EST_TOPIC_ID, _Fields.PREP, _Fields.PREP_TOPIC_ID, _Fields.ADV, _Fields.ADV_TOPIC_ID, _Fields.VERB, _Fields.VERB_TOPIC_ID, _Fields.NOUN, _Fields.NOUN_TOPIC_ID, _Fields.ADJ, _Fields.ADJ_TOPIC_ID, _Fields.CONN, _Fields.CONN_TOPIC_ID};
        this.__isset_bitfield = other.__isset_bitfield;
        this.topic_id = other.topic_id;
        if (other.isSetPl()) {
            this.f28163pl = other.f28163pl;
        }
        this.pl_topic_id = other.pl_topic_id;
        if (other.isSetThird()) {
            this.third = other.third;
        }
        this.third_topic_id = other.third_topic_id;
        if (other.isSetPast()) {
            this.past = other.past;
        }
        this.past_topic_id = other.past_topic_id;
        if (other.isSetDone()) {
            this.done = other.done;
        }
        this.done_topic_id = other.done_topic_id;
        if (other.isSetIng()) {
            this.ing = other.ing;
        }
        this.ing_topic_id = other.ing_topic_id;
        if (other.isSetEr()) {
            this.f28162er = other.f28162er;
        }
        this.er_topic_id = other.er_topic_id;
        if (other.isSetEst()) {
            this.est = other.est;
        }
        this.est_topic_id = other.est_topic_id;
        if (other.isSetPrep()) {
            this.prep = other.prep;
        }
        this.prep_topic_id = other.prep_topic_id;
        if (other.isSetAdv()) {
            this.adv = other.adv;
        }
        this.adv_topic_id = other.adv_topic_id;
        if (other.isSetVerb()) {
            this.verb = other.verb;
        }
        this.verb_topic_id = other.verb_topic_id;
        if (other.isSetNoun()) {
            this.noun = other.noun;
        }
        this.noun_topic_id = other.noun_topic_id;
        if (other.isSetAdj()) {
            this.adj = other.adj;
        }
        this.adj_topic_id = other.adj_topic_id;
        if (other.isSetConn()) {
            this.conn = other.conn;
        }
        this.conn_topic_id = other.conn_topic_id;
    }

    public void validate() throws TException {
    }
}

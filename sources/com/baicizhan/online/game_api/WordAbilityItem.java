package com.baicizhan.online.game_api;

import com.baicizhan.client.business.dataset.provider.a;
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
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class WordAbilityItem implements TBase<WordAbilityItem, _Fields>, Serializable, Cloneable, Comparable<WordAbilityItem> {
    private static final int __CFA_ISSET_ID = 14;
    private static final int __CFA_TIME_ISSET_ID = 15;
    private static final int __CFS_ISSET_ID = 12;
    private static final int __CFS_TIME_ISSET_ID = 13;
    private static final int __EFAU_ISSET_ID = 20;
    private static final int __EFAU_TIME_ISSET_ID = 21;
    private static final int __EFCF_ISSET_ID = 6;
    private static final int __EFCF_TIME_ISSET_ID = 7;
    private static final int __EFD_ISSET_ID = 18;
    private static final int __EFD_TIME_ISSET_ID = 19;
    private static final int __EFPCF_ISSET_ID = 16;
    private static final int __EFPCF_TIME_ISSET_ID = 17;
    private static final int __EFS_ISSET_ID = 10;
    private static final int __EFS_TIME_ISSET_ID = 11;
    private static final int __EFU_ISSET_ID = 8;
    private static final int __EFU_TIME_ISSET_ID = 9;
    private static final int __EVCF_ISSET_ID = 4;
    private static final int __EVCF_TIME_ISSET_ID = 5;
    private static final int __EVEF_ISSET_ID = 2;
    private static final int __EVEF_TIME_ISSET_ID = 3;
    private static final int __LAST_MODIFY_TIME_ISSET_ID = 22;
    private static final int __SCORE_ISSET_ID = 1;
    private static final int __TOPIC_ID_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private int __isset_bitfield;
    public double cfa;
    public int cfa_time;
    public double cfs;
    public int cfs_time;
    public double efau;
    public int efau_time;
    public double efcf;
    public int efcf_time;
    public double efd;
    public int efd_time;
    public double efpcf;
    public int efpcf_time;
    public double efs;
    public int efs_time;
    public double efu;
    public int efu_time;
    public double evcf;
    public int evcf_time;
    public double evef;
    public int evef_time;
    public long last_modify_time;
    public double score;
    public int topic_id;
    private static final TStruct STRUCT_DESC = new TStruct("WordAbilityItem");
    private static final TField TOPIC_ID_FIELD_DESC = new TField("topic_id", (byte) 8, 1);
    private static final TField SCORE_FIELD_DESC = new TField(a.b.C0242a.f16107c, (byte) 4, 2);
    private static final TField EVEF_FIELD_DESC = new TField("evef", (byte) 4, 3);
    private static final TField EVEF_TIME_FIELD_DESC = new TField("evef_time", (byte) 8, 4);
    private static final TField EVCF_FIELD_DESC = new TField("evcf", (byte) 4, 5);
    private static final TField EVCF_TIME_FIELD_DESC = new TField("evcf_time", (byte) 8, 6);
    private static final TField EFCF_FIELD_DESC = new TField("efcf", (byte) 4, 7);
    private static final TField EFCF_TIME_FIELD_DESC = new TField("efcf_time", (byte) 8, 8);
    private static final TField EFU_FIELD_DESC = new TField("efu", (byte) 4, 9);
    private static final TField EFU_TIME_FIELD_DESC = new TField("efu_time", (byte) 8, 10);
    private static final TField EFS_FIELD_DESC = new TField("efs", (byte) 4, 11);
    private static final TField EFS_TIME_FIELD_DESC = new TField("efs_time", (byte) 8, 12);
    private static final TField CFS_FIELD_DESC = new TField("cfs", (byte) 4, 13);
    private static final TField CFS_TIME_FIELD_DESC = new TField("cfs_time", (byte) 8, 14);
    private static final TField CFA_FIELD_DESC = new TField("cfa", (byte) 4, 15);
    private static final TField CFA_TIME_FIELD_DESC = new TField("cfa_time", (byte) 8, 16);
    private static final TField EFPCF_FIELD_DESC = new TField("efpcf", (byte) 4, 17);
    private static final TField EFPCF_TIME_FIELD_DESC = new TField("efpcf_time", (byte) 8, 18);
    private static final TField EFD_FIELD_DESC = new TField("efd", (byte) 4, 19);
    private static final TField EFD_TIME_FIELD_DESC = new TField("efd_time", (byte) 8, 20);
    private static final TField EFAU_FIELD_DESC = new TField("efau", (byte) 4, 21);
    private static final TField EFAU_TIME_FIELD_DESC = new TField("efau_time", (byte) 8, 22);
    private static final TField LAST_MODIFY_TIME_FIELD_DESC = new TField("last_modify_time", (byte) 10, 23);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.game_api.WordAbilityItem$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$game_api$WordAbilityItem$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$game_api$WordAbilityItem$_Fields = iArr;
            try {
                iArr[_Fields.TOPIC_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$WordAbilityItem$_Fields[_Fields.SCORE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$WordAbilityItem$_Fields[_Fields.EVEF.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$WordAbilityItem$_Fields[_Fields.EVEF_TIME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$WordAbilityItem$_Fields[_Fields.EVCF.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$WordAbilityItem$_Fields[_Fields.EVCF_TIME.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$WordAbilityItem$_Fields[_Fields.EFCF.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$WordAbilityItem$_Fields[_Fields.EFCF_TIME.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$WordAbilityItem$_Fields[_Fields.EFU.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$WordAbilityItem$_Fields[_Fields.EFU_TIME.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$WordAbilityItem$_Fields[_Fields.EFS.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$WordAbilityItem$_Fields[_Fields.EFS_TIME.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$WordAbilityItem$_Fields[_Fields.CFS.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$WordAbilityItem$_Fields[_Fields.CFS_TIME.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$WordAbilityItem$_Fields[_Fields.CFA.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$WordAbilityItem$_Fields[_Fields.CFA_TIME.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$WordAbilityItem$_Fields[_Fields.EFPCF.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$WordAbilityItem$_Fields[_Fields.EFPCF_TIME.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$WordAbilityItem$_Fields[_Fields.EFD.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$WordAbilityItem$_Fields[_Fields.EFD_TIME.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$WordAbilityItem$_Fields[_Fields.EFAU.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$WordAbilityItem$_Fields[_Fields.EFAU_TIME.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$WordAbilityItem$_Fields[_Fields.LAST_MODIFY_TIME.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class WordAbilityItemStandardScheme extends StandardScheme<WordAbilityItem> {
        private WordAbilityItemStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, WordAbilityItem struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    iprot.readStructEnd();
                    if (!struct.isSetTopic_id()) {
                        throw new TProtocolException("Required field 'topic_id' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetScore()) {
                        throw new TProtocolException("Required field 'score' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetEvef()) {
                        throw new TProtocolException("Required field 'evef' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetEvef_time()) {
                        throw new TProtocolException("Required field 'evef_time' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetEvcf()) {
                        throw new TProtocolException("Required field 'evcf' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetEvcf_time()) {
                        throw new TProtocolException("Required field 'evcf_time' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetEfcf()) {
                        throw new TProtocolException("Required field 'efcf' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetEfcf_time()) {
                        throw new TProtocolException("Required field 'efcf_time' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetEfu()) {
                        throw new TProtocolException("Required field 'efu' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetEfu_time()) {
                        throw new TProtocolException("Required field 'efu_time' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetEfs()) {
                        throw new TProtocolException("Required field 'efs' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetEfs_time()) {
                        throw new TProtocolException("Required field 'efs_time' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetCfs()) {
                        throw new TProtocolException("Required field 'cfs' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetCfs_time()) {
                        throw new TProtocolException("Required field 'cfs_time' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetCfa()) {
                        throw new TProtocolException("Required field 'cfa' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetCfa_time()) {
                        throw new TProtocolException("Required field 'cfa_time' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetEfpcf()) {
                        throw new TProtocolException("Required field 'efpcf' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetEfpcf_time()) {
                        throw new TProtocolException("Required field 'efpcf_time' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetEfd()) {
                        throw new TProtocolException("Required field 'efd' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetEfd_time()) {
                        throw new TProtocolException("Required field 'efd_time' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetEfau()) {
                        throw new TProtocolException("Required field 'efau' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetEfau_time()) {
                        throw new TProtocolException("Required field 'efau_time' was not found in serialized data! Struct: " + toString());
                    }
                    if (struct.isSetLast_modify_time()) {
                        struct.validate();
                        return;
                    }
                    throw new TProtocolException("Required field 'last_modify_time' was not found in serialized data! Struct: " + toString());
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
                        if (b11 != 4) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.score = iprot.readDouble();
                            struct.setScoreIsSet(true);
                            break;
                        }
                    case 3:
                        if (b11 != 4) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.evef = iprot.readDouble();
                            struct.setEvefIsSet(true);
                            break;
                        }
                    case 4:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.evef_time = iprot.readI32();
                            struct.setEvef_timeIsSet(true);
                            break;
                        }
                    case 5:
                        if (b11 != 4) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.evcf = iprot.readDouble();
                            struct.setEvcfIsSet(true);
                            break;
                        }
                    case 6:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.evcf_time = iprot.readI32();
                            struct.setEvcf_timeIsSet(true);
                            break;
                        }
                    case 7:
                        if (b11 != 4) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.efcf = iprot.readDouble();
                            struct.setEfcfIsSet(true);
                            break;
                        }
                    case 8:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.efcf_time = iprot.readI32();
                            struct.setEfcf_timeIsSet(true);
                            break;
                        }
                    case 9:
                        if (b11 != 4) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.efu = iprot.readDouble();
                            struct.setEfuIsSet(true);
                            break;
                        }
                    case 10:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.efu_time = iprot.readI32();
                            struct.setEfu_timeIsSet(true);
                            break;
                        }
                    case 11:
                        if (b11 != 4) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.efs = iprot.readDouble();
                            struct.setEfsIsSet(true);
                            break;
                        }
                    case 12:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.efs_time = iprot.readI32();
                            struct.setEfs_timeIsSet(true);
                            break;
                        }
                    case 13:
                        if (b11 != 4) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.cfs = iprot.readDouble();
                            struct.setCfsIsSet(true);
                            break;
                        }
                    case 14:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.cfs_time = iprot.readI32();
                            struct.setCfs_timeIsSet(true);
                            break;
                        }
                    case 15:
                        if (b11 != 4) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.cfa = iprot.readDouble();
                            struct.setCfaIsSet(true);
                            break;
                        }
                    case 16:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.cfa_time = iprot.readI32();
                            struct.setCfa_timeIsSet(true);
                            break;
                        }
                    case 17:
                        if (b11 != 4) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.efpcf = iprot.readDouble();
                            struct.setEfpcfIsSet(true);
                            break;
                        }
                    case 18:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.efpcf_time = iprot.readI32();
                            struct.setEfpcf_timeIsSet(true);
                            break;
                        }
                    case 19:
                        if (b11 != 4) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.efd = iprot.readDouble();
                            struct.setEfdIsSet(true);
                            break;
                        }
                    case 20:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.efd_time = iprot.readI32();
                            struct.setEfd_timeIsSet(true);
                            break;
                        }
                    case 21:
                        if (b11 != 4) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.efau = iprot.readDouble();
                            struct.setEfauIsSet(true);
                            break;
                        }
                    case 22:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.efau_time = iprot.readI32();
                            struct.setEfau_timeIsSet(true);
                            break;
                        }
                    case 23:
                        if (b11 != 10) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.last_modify_time = iprot.readI64();
                            struct.setLast_modify_timeIsSet(true);
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
        public void write(TProtocol oprot, WordAbilityItem struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(WordAbilityItem.STRUCT_DESC);
            oprot.writeFieldBegin(WordAbilityItem.TOPIC_ID_FIELD_DESC);
            oprot.writeI32(struct.topic_id);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(WordAbilityItem.SCORE_FIELD_DESC);
            oprot.writeDouble(struct.score);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(WordAbilityItem.EVEF_FIELD_DESC);
            oprot.writeDouble(struct.evef);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(WordAbilityItem.EVEF_TIME_FIELD_DESC);
            oprot.writeI32(struct.evef_time);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(WordAbilityItem.EVCF_FIELD_DESC);
            oprot.writeDouble(struct.evcf);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(WordAbilityItem.EVCF_TIME_FIELD_DESC);
            oprot.writeI32(struct.evcf_time);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(WordAbilityItem.EFCF_FIELD_DESC);
            oprot.writeDouble(struct.efcf);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(WordAbilityItem.EFCF_TIME_FIELD_DESC);
            oprot.writeI32(struct.efcf_time);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(WordAbilityItem.EFU_FIELD_DESC);
            oprot.writeDouble(struct.efu);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(WordAbilityItem.EFU_TIME_FIELD_DESC);
            oprot.writeI32(struct.efu_time);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(WordAbilityItem.EFS_FIELD_DESC);
            oprot.writeDouble(struct.efs);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(WordAbilityItem.EFS_TIME_FIELD_DESC);
            oprot.writeI32(struct.efs_time);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(WordAbilityItem.CFS_FIELD_DESC);
            oprot.writeDouble(struct.cfs);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(WordAbilityItem.CFS_TIME_FIELD_DESC);
            oprot.writeI32(struct.cfs_time);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(WordAbilityItem.CFA_FIELD_DESC);
            oprot.writeDouble(struct.cfa);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(WordAbilityItem.CFA_TIME_FIELD_DESC);
            oprot.writeI32(struct.cfa_time);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(WordAbilityItem.EFPCF_FIELD_DESC);
            oprot.writeDouble(struct.efpcf);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(WordAbilityItem.EFPCF_TIME_FIELD_DESC);
            oprot.writeI32(struct.efpcf_time);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(WordAbilityItem.EFD_FIELD_DESC);
            oprot.writeDouble(struct.efd);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(WordAbilityItem.EFD_TIME_FIELD_DESC);
            oprot.writeI32(struct.efd_time);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(WordAbilityItem.EFAU_FIELD_DESC);
            oprot.writeDouble(struct.efau);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(WordAbilityItem.EFAU_TIME_FIELD_DESC);
            oprot.writeI32(struct.efau_time);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(WordAbilityItem.LAST_MODIFY_TIME_FIELD_DESC);
            oprot.writeI64(struct.last_modify_time);
            oprot.writeFieldEnd();
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class WordAbilityItemStandardSchemeFactory implements SchemeFactory {
        private WordAbilityItemStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public WordAbilityItemStandardScheme getScheme() {
            return new WordAbilityItemStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class WordAbilityItemTupleScheme extends TupleScheme<WordAbilityItem> {
        private WordAbilityItemTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, WordAbilityItem struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.topic_id = tTupleProtocol.readI32();
            struct.setTopic_idIsSet(true);
            struct.score = tTupleProtocol.readDouble();
            struct.setScoreIsSet(true);
            struct.evef = tTupleProtocol.readDouble();
            struct.setEvefIsSet(true);
            struct.evef_time = tTupleProtocol.readI32();
            struct.setEvef_timeIsSet(true);
            struct.evcf = tTupleProtocol.readDouble();
            struct.setEvcfIsSet(true);
            struct.evcf_time = tTupleProtocol.readI32();
            struct.setEvcf_timeIsSet(true);
            struct.efcf = tTupleProtocol.readDouble();
            struct.setEfcfIsSet(true);
            struct.efcf_time = tTupleProtocol.readI32();
            struct.setEfcf_timeIsSet(true);
            struct.efu = tTupleProtocol.readDouble();
            struct.setEfuIsSet(true);
            struct.efu_time = tTupleProtocol.readI32();
            struct.setEfu_timeIsSet(true);
            struct.efs = tTupleProtocol.readDouble();
            struct.setEfsIsSet(true);
            struct.efs_time = tTupleProtocol.readI32();
            struct.setEfs_timeIsSet(true);
            struct.cfs = tTupleProtocol.readDouble();
            struct.setCfsIsSet(true);
            struct.cfs_time = tTupleProtocol.readI32();
            struct.setCfs_timeIsSet(true);
            struct.cfa = tTupleProtocol.readDouble();
            struct.setCfaIsSet(true);
            struct.cfa_time = tTupleProtocol.readI32();
            struct.setCfa_timeIsSet(true);
            struct.efpcf = tTupleProtocol.readDouble();
            struct.setEfpcfIsSet(true);
            struct.efpcf_time = tTupleProtocol.readI32();
            struct.setEfpcf_timeIsSet(true);
            struct.efd = tTupleProtocol.readDouble();
            struct.setEfdIsSet(true);
            struct.efd_time = tTupleProtocol.readI32();
            struct.setEfd_timeIsSet(true);
            struct.efau = tTupleProtocol.readDouble();
            struct.setEfauIsSet(true);
            struct.efau_time = tTupleProtocol.readI32();
            struct.setEfau_timeIsSet(true);
            struct.last_modify_time = tTupleProtocol.readI64();
            struct.setLast_modify_timeIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, WordAbilityItem struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.topic_id);
            tTupleProtocol.writeDouble(struct.score);
            tTupleProtocol.writeDouble(struct.evef);
            tTupleProtocol.writeI32(struct.evef_time);
            tTupleProtocol.writeDouble(struct.evcf);
            tTupleProtocol.writeI32(struct.evcf_time);
            tTupleProtocol.writeDouble(struct.efcf);
            tTupleProtocol.writeI32(struct.efcf_time);
            tTupleProtocol.writeDouble(struct.efu);
            tTupleProtocol.writeI32(struct.efu_time);
            tTupleProtocol.writeDouble(struct.efs);
            tTupleProtocol.writeI32(struct.efs_time);
            tTupleProtocol.writeDouble(struct.cfs);
            tTupleProtocol.writeI32(struct.cfs_time);
            tTupleProtocol.writeDouble(struct.cfa);
            tTupleProtocol.writeI32(struct.cfa_time);
            tTupleProtocol.writeDouble(struct.efpcf);
            tTupleProtocol.writeI32(struct.efpcf_time);
            tTupleProtocol.writeDouble(struct.efd);
            tTupleProtocol.writeI32(struct.efd_time);
            tTupleProtocol.writeDouble(struct.efau);
            tTupleProtocol.writeI32(struct.efau_time);
            tTupleProtocol.writeI64(struct.last_modify_time);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class WordAbilityItemTupleSchemeFactory implements SchemeFactory {
        private WordAbilityItemTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public WordAbilityItemTupleScheme getScheme() {
            return new WordAbilityItemTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        TOPIC_ID(1, "topic_id"),
        SCORE(2, a.b.C0242a.f16107c),
        EVEF(3, "evef"),
        EVEF_TIME(4, "evef_time"),
        EVCF(5, "evcf"),
        EVCF_TIME(6, "evcf_time"),
        EFCF(7, "efcf"),
        EFCF_TIME(8, "efcf_time"),
        EFU(9, "efu"),
        EFU_TIME(10, "efu_time"),
        EFS(11, "efs"),
        EFS_TIME(12, "efs_time"),
        CFS(13, "cfs"),
        CFS_TIME(14, "cfs_time"),
        CFA(15, "cfa"),
        CFA_TIME(16, "cfa_time"),
        EFPCF(17, "efpcf"),
        EFPCF_TIME(18, "efpcf_time"),
        EFD(19, "efd"),
        EFD_TIME(20, "efd_time"),
        EFAU(21, "efau"),
        EFAU_TIME(22, "efau_time"),
        LAST_MODIFY_TIME(23, "last_modify_time");

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
                    return SCORE;
                case 3:
                    return EVEF;
                case 4:
                    return EVEF_TIME;
                case 5:
                    return EVCF;
                case 6:
                    return EVCF_TIME;
                case 7:
                    return EFCF;
                case 8:
                    return EFCF_TIME;
                case 9:
                    return EFU;
                case 10:
                    return EFU_TIME;
                case 11:
                    return EFS;
                case 12:
                    return EFS_TIME;
                case 13:
                    return CFS;
                case 14:
                    return CFS_TIME;
                case 15:
                    return CFA;
                case 16:
                    return CFA_TIME;
                case 17:
                    return EFPCF;
                case 18:
                    return EFPCF_TIME;
                case 19:
                    return EFD;
                case 20:
                    return EFD_TIME;
                case 21:
                    return EFAU;
                case 22:
                    return EFAU_TIME;
                case 23:
                    return LAST_MODIFY_TIME;
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
        hashMap.put(StandardScheme.class, new WordAbilityItemStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new WordAbilityItemTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.TOPIC_ID, (_Fields) new FieldMetaData("topic_id", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.SCORE, (_Fields) new FieldMetaData(a.b.C0242a.f16107c, (byte) 1, new FieldValueMetaData((byte) 4)));
        enumMap.put((EnumMap) _Fields.EVEF, (_Fields) new FieldMetaData("evef", (byte) 1, new FieldValueMetaData((byte) 4)));
        enumMap.put((EnumMap) _Fields.EVEF_TIME, (_Fields) new FieldMetaData("evef_time", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.EVCF, (_Fields) new FieldMetaData("evcf", (byte) 1, new FieldValueMetaData((byte) 4)));
        enumMap.put((EnumMap) _Fields.EVCF_TIME, (_Fields) new FieldMetaData("evcf_time", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.EFCF, (_Fields) new FieldMetaData("efcf", (byte) 1, new FieldValueMetaData((byte) 4)));
        enumMap.put((EnumMap) _Fields.EFCF_TIME, (_Fields) new FieldMetaData("efcf_time", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.EFU, (_Fields) new FieldMetaData("efu", (byte) 1, new FieldValueMetaData((byte) 4)));
        enumMap.put((EnumMap) _Fields.EFU_TIME, (_Fields) new FieldMetaData("efu_time", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.EFS, (_Fields) new FieldMetaData("efs", (byte) 1, new FieldValueMetaData((byte) 4)));
        enumMap.put((EnumMap) _Fields.EFS_TIME, (_Fields) new FieldMetaData("efs_time", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.CFS, (_Fields) new FieldMetaData("cfs", (byte) 1, new FieldValueMetaData((byte) 4)));
        enumMap.put((EnumMap) _Fields.CFS_TIME, (_Fields) new FieldMetaData("cfs_time", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.CFA, (_Fields) new FieldMetaData("cfa", (byte) 1, new FieldValueMetaData((byte) 4)));
        enumMap.put((EnumMap) _Fields.CFA_TIME, (_Fields) new FieldMetaData("cfa_time", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.EFPCF, (_Fields) new FieldMetaData("efpcf", (byte) 1, new FieldValueMetaData((byte) 4)));
        enumMap.put((EnumMap) _Fields.EFPCF_TIME, (_Fields) new FieldMetaData("efpcf_time", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.EFD, (_Fields) new FieldMetaData("efd", (byte) 1, new FieldValueMetaData((byte) 4)));
        enumMap.put((EnumMap) _Fields.EFD_TIME, (_Fields) new FieldMetaData("efd_time", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.EFAU, (_Fields) new FieldMetaData("efau", (byte) 1, new FieldValueMetaData((byte) 4)));
        enumMap.put((EnumMap) _Fields.EFAU_TIME, (_Fields) new FieldMetaData("efau_time", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.LAST_MODIFY_TIME, (_Fields) new FieldMetaData("last_modify_time", (byte) 1, new FieldValueMetaData((byte) 10)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(WordAbilityItem.class, unmodifiableMap);
    }

    public WordAbilityItem() {
        this.__isset_bitfield = 0;
    }

    private void readObject(ObjectInputStream in2) throws IOException, ClassNotFoundException {
        try {
            this.__isset_bitfield = 0;
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
        setScoreIsSet(false);
        this.score = 0.0d;
        setEvefIsSet(false);
        this.evef = 0.0d;
        setEvef_timeIsSet(false);
        this.evef_time = 0;
        setEvcfIsSet(false);
        this.evcf = 0.0d;
        setEvcf_timeIsSet(false);
        this.evcf_time = 0;
        setEfcfIsSet(false);
        this.efcf = 0.0d;
        setEfcf_timeIsSet(false);
        this.efcf_time = 0;
        setEfuIsSet(false);
        this.efu = 0.0d;
        setEfu_timeIsSet(false);
        this.efu_time = 0;
        setEfsIsSet(false);
        this.efs = 0.0d;
        setEfs_timeIsSet(false);
        this.efs_time = 0;
        setCfsIsSet(false);
        this.cfs = 0.0d;
        setCfs_timeIsSet(false);
        this.cfs_time = 0;
        setCfaIsSet(false);
        this.cfa = 0.0d;
        setCfa_timeIsSet(false);
        this.cfa_time = 0;
        setEfpcfIsSet(false);
        this.efpcf = 0.0d;
        setEfpcf_timeIsSet(false);
        this.efpcf_time = 0;
        setEfdIsSet(false);
        this.efd = 0.0d;
        setEfd_timeIsSet(false);
        this.efd_time = 0;
        setEfauIsSet(false);
        this.efau = 0.0d;
        setEfau_timeIsSet(false);
        this.efau_time = 0;
        setLast_modify_timeIsSet(false);
        this.last_modify_time = 0L;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof WordAbilityItem)) {
            return equals((WordAbilityItem) that);
        }
        return false;
    }

    public double getCfa() {
        return this.cfa;
    }

    public int getCfa_time() {
        return this.cfa_time;
    }

    public double getCfs() {
        return this.cfs;
    }

    public int getCfs_time() {
        return this.cfs_time;
    }

    public double getEfau() {
        return this.efau;
    }

    public int getEfau_time() {
        return this.efau_time;
    }

    public double getEfcf() {
        return this.efcf;
    }

    public int getEfcf_time() {
        return this.efcf_time;
    }

    public double getEfd() {
        return this.efd;
    }

    public int getEfd_time() {
        return this.efd_time;
    }

    public double getEfpcf() {
        return this.efpcf;
    }

    public int getEfpcf_time() {
        return this.efpcf_time;
    }

    public double getEfs() {
        return this.efs;
    }

    public int getEfs_time() {
        return this.efs_time;
    }

    public double getEfu() {
        return this.efu;
    }

    public int getEfu_time() {
        return this.efu_time;
    }

    public double getEvcf() {
        return this.evcf;
    }

    public int getEvcf_time() {
        return this.evcf_time;
    }

    public double getEvef() {
        return this.evef;
    }

    public int getEvef_time() {
        return this.evef_time;
    }

    public long getLast_modify_time() {
        return this.last_modify_time;
    }

    public double getScore() {
        return this.score;
    }

    public int getTopic_id() {
        return this.topic_id;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetCfa() {
        return EncodingUtils.testBit(this.__isset_bitfield, 14);
    }

    public boolean isSetCfa_time() {
        return EncodingUtils.testBit(this.__isset_bitfield, 15);
    }

    public boolean isSetCfs() {
        return EncodingUtils.testBit(this.__isset_bitfield, 12);
    }

    public boolean isSetCfs_time() {
        return EncodingUtils.testBit(this.__isset_bitfield, 13);
    }

    public boolean isSetEfau() {
        return EncodingUtils.testBit(this.__isset_bitfield, 20);
    }

    public boolean isSetEfau_time() {
        return EncodingUtils.testBit(this.__isset_bitfield, 21);
    }

    public boolean isSetEfcf() {
        return EncodingUtils.testBit(this.__isset_bitfield, 6);
    }

    public boolean isSetEfcf_time() {
        return EncodingUtils.testBit(this.__isset_bitfield, 7);
    }

    public boolean isSetEfd() {
        return EncodingUtils.testBit(this.__isset_bitfield, 18);
    }

    public boolean isSetEfd_time() {
        return EncodingUtils.testBit(this.__isset_bitfield, 19);
    }

    public boolean isSetEfpcf() {
        return EncodingUtils.testBit(this.__isset_bitfield, 16);
    }

    public boolean isSetEfpcf_time() {
        return EncodingUtils.testBit(this.__isset_bitfield, 17);
    }

    public boolean isSetEfs() {
        return EncodingUtils.testBit(this.__isset_bitfield, 10);
    }

    public boolean isSetEfs_time() {
        return EncodingUtils.testBit(this.__isset_bitfield, 11);
    }

    public boolean isSetEfu() {
        return EncodingUtils.testBit(this.__isset_bitfield, 8);
    }

    public boolean isSetEfu_time() {
        return EncodingUtils.testBit(this.__isset_bitfield, 9);
    }

    public boolean isSetEvcf() {
        return EncodingUtils.testBit(this.__isset_bitfield, 4);
    }

    public boolean isSetEvcf_time() {
        return EncodingUtils.testBit(this.__isset_bitfield, 5);
    }

    public boolean isSetEvef() {
        return EncodingUtils.testBit(this.__isset_bitfield, 2);
    }

    public boolean isSetEvef_time() {
        return EncodingUtils.testBit(this.__isset_bitfield, 3);
    }

    public boolean isSetLast_modify_time() {
        return EncodingUtils.testBit(this.__isset_bitfield, 22);
    }

    public boolean isSetScore() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetTopic_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public WordAbilityItem setCfa(double cfa) {
        this.cfa = cfa;
        setCfaIsSet(true);
        return this;
    }

    public void setCfaIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 14, value);
    }

    public WordAbilityItem setCfa_time(int cfa_time) {
        this.cfa_time = cfa_time;
        setCfa_timeIsSet(true);
        return this;
    }

    public void setCfa_timeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 15, value);
    }

    public WordAbilityItem setCfs(double cfs) {
        this.cfs = cfs;
        setCfsIsSet(true);
        return this;
    }

    public void setCfsIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 12, value);
    }

    public WordAbilityItem setCfs_time(int cfs_time) {
        this.cfs_time = cfs_time;
        setCfs_timeIsSet(true);
        return this;
    }

    public void setCfs_timeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 13, value);
    }

    public WordAbilityItem setEfau(double efau) {
        this.efau = efau;
        setEfauIsSet(true);
        return this;
    }

    public void setEfauIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 20, value);
    }

    public WordAbilityItem setEfau_time(int efau_time) {
        this.efau_time = efau_time;
        setEfau_timeIsSet(true);
        return this;
    }

    public void setEfau_timeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 21, value);
    }

    public WordAbilityItem setEfcf(double efcf) {
        this.efcf = efcf;
        setEfcfIsSet(true);
        return this;
    }

    public void setEfcfIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 6, value);
    }

    public WordAbilityItem setEfcf_time(int efcf_time) {
        this.efcf_time = efcf_time;
        setEfcf_timeIsSet(true);
        return this;
    }

    public void setEfcf_timeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 7, value);
    }

    public WordAbilityItem setEfd(double efd) {
        this.efd = efd;
        setEfdIsSet(true);
        return this;
    }

    public void setEfdIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 18, value);
    }

    public WordAbilityItem setEfd_time(int efd_time) {
        this.efd_time = efd_time;
        setEfd_timeIsSet(true);
        return this;
    }

    public void setEfd_timeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 19, value);
    }

    public WordAbilityItem setEfpcf(double efpcf) {
        this.efpcf = efpcf;
        setEfpcfIsSet(true);
        return this;
    }

    public void setEfpcfIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 16, value);
    }

    public WordAbilityItem setEfpcf_time(int efpcf_time) {
        this.efpcf_time = efpcf_time;
        setEfpcf_timeIsSet(true);
        return this;
    }

    public void setEfpcf_timeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 17, value);
    }

    public WordAbilityItem setEfs(double efs) {
        this.efs = efs;
        setEfsIsSet(true);
        return this;
    }

    public void setEfsIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 10, value);
    }

    public WordAbilityItem setEfs_time(int efs_time) {
        this.efs_time = efs_time;
        setEfs_timeIsSet(true);
        return this;
    }

    public void setEfs_timeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 11, value);
    }

    public WordAbilityItem setEfu(double efu) {
        this.efu = efu;
        setEfuIsSet(true);
        return this;
    }

    public void setEfuIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 8, value);
    }

    public WordAbilityItem setEfu_time(int efu_time) {
        this.efu_time = efu_time;
        setEfu_timeIsSet(true);
        return this;
    }

    public void setEfu_timeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 9, value);
    }

    public WordAbilityItem setEvcf(double evcf) {
        this.evcf = evcf;
        setEvcfIsSet(true);
        return this;
    }

    public void setEvcfIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 4, value);
    }

    public WordAbilityItem setEvcf_time(int evcf_time) {
        this.evcf_time = evcf_time;
        setEvcf_timeIsSet(true);
        return this;
    }

    public void setEvcf_timeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 5, value);
    }

    public WordAbilityItem setEvef(double evef) {
        this.evef = evef;
        setEvefIsSet(true);
        return this;
    }

    public void setEvefIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 2, value);
    }

    public WordAbilityItem setEvef_time(int evef_time) {
        this.evef_time = evef_time;
        setEvef_timeIsSet(true);
        return this;
    }

    public void setEvef_timeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 3, value);
    }

    public WordAbilityItem setLast_modify_time(long last_modify_time) {
        this.last_modify_time = last_modify_time;
        setLast_modify_timeIsSet(true);
        return this;
    }

    public void setLast_modify_timeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 22, value);
    }

    public WordAbilityItem setScore(double score) {
        this.score = score;
        setScoreIsSet(true);
        return this;
    }

    public void setScoreIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public WordAbilityItem setTopic_id(int topic_id) {
        this.topic_id = topic_id;
        setTopic_idIsSet(true);
        return this;
    }

    public void setTopic_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public String toString() {
        return "WordAbilityItem(topic_id:" + this.topic_id + j2.O + "score:" + this.score + j2.O + "evef:" + this.evef + j2.O + "evef_time:" + this.evef_time + j2.O + "evcf:" + this.evcf + j2.O + "evcf_time:" + this.evcf_time + j2.O + "efcf:" + this.efcf + j2.O + "efcf_time:" + this.efcf_time + j2.O + "efu:" + this.efu + j2.O + "efu_time:" + this.efu_time + j2.O + "efs:" + this.efs + j2.O + "efs_time:" + this.efs_time + j2.O + "cfs:" + this.cfs + j2.O + "cfs_time:" + this.cfs_time + j2.O + "cfa:" + this.cfa + j2.O + "cfa_time:" + this.cfa_time + j2.O + "efpcf:" + this.efpcf + j2.O + "efpcf_time:" + this.efpcf_time + j2.O + "efd:" + this.efd + j2.O + "efd_time:" + this.efd_time + j2.O + "efau:" + this.efau + j2.O + "efau_time:" + this.efau_time + j2.O + "last_modify_time:" + this.last_modify_time + pn.j.f81007d;
    }

    public void unsetCfa() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 14);
    }

    public void unsetCfa_time() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 15);
    }

    public void unsetCfs() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 12);
    }

    public void unsetCfs_time() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 13);
    }

    public void unsetEfau() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 20);
    }

    public void unsetEfau_time() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 21);
    }

    public void unsetEfcf() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 6);
    }

    public void unsetEfcf_time() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 7);
    }

    public void unsetEfd() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 18);
    }

    public void unsetEfd_time() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 19);
    }

    public void unsetEfpcf() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 16);
    }

    public void unsetEfpcf_time() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 17);
    }

    public void unsetEfs() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 10);
    }

    public void unsetEfs_time() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 11);
    }

    public void unsetEfu() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 8);
    }

    public void unsetEfu_time() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 9);
    }

    public void unsetEvcf() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 4);
    }

    public void unsetEvcf_time() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 5);
    }

    public void unsetEvef() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 2);
    }

    public void unsetEvef_time() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 3);
    }

    public void unsetLast_modify_time() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 22);
    }

    public void unsetScore() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetTopic_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(WordAbilityItem other) {
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
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo24 = Boolean.valueOf(isSetTopic_id()).compareTo(Boolean.valueOf(other.isSetTopic_id()));
        if (compareTo24 != 0) {
            return compareTo24;
        }
        if (isSetTopic_id() && (compareTo23 = TBaseHelper.compareTo(this.topic_id, other.topic_id)) != 0) {
            return compareTo23;
        }
        int compareTo25 = Boolean.valueOf(isSetScore()).compareTo(Boolean.valueOf(other.isSetScore()));
        if (compareTo25 != 0) {
            return compareTo25;
        }
        if (isSetScore() && (compareTo22 = TBaseHelper.compareTo(this.score, other.score)) != 0) {
            return compareTo22;
        }
        int compareTo26 = Boolean.valueOf(isSetEvef()).compareTo(Boolean.valueOf(other.isSetEvef()));
        if (compareTo26 != 0) {
            return compareTo26;
        }
        if (isSetEvef() && (compareTo21 = TBaseHelper.compareTo(this.evef, other.evef)) != 0) {
            return compareTo21;
        }
        int compareTo27 = Boolean.valueOf(isSetEvef_time()).compareTo(Boolean.valueOf(other.isSetEvef_time()));
        if (compareTo27 != 0) {
            return compareTo27;
        }
        if (isSetEvef_time() && (compareTo20 = TBaseHelper.compareTo(this.evef_time, other.evef_time)) != 0) {
            return compareTo20;
        }
        int compareTo28 = Boolean.valueOf(isSetEvcf()).compareTo(Boolean.valueOf(other.isSetEvcf()));
        if (compareTo28 != 0) {
            return compareTo28;
        }
        if (isSetEvcf() && (compareTo19 = TBaseHelper.compareTo(this.evcf, other.evcf)) != 0) {
            return compareTo19;
        }
        int compareTo29 = Boolean.valueOf(isSetEvcf_time()).compareTo(Boolean.valueOf(other.isSetEvcf_time()));
        if (compareTo29 != 0) {
            return compareTo29;
        }
        if (isSetEvcf_time() && (compareTo18 = TBaseHelper.compareTo(this.evcf_time, other.evcf_time)) != 0) {
            return compareTo18;
        }
        int compareTo30 = Boolean.valueOf(isSetEfcf()).compareTo(Boolean.valueOf(other.isSetEfcf()));
        if (compareTo30 != 0) {
            return compareTo30;
        }
        if (isSetEfcf() && (compareTo17 = TBaseHelper.compareTo(this.efcf, other.efcf)) != 0) {
            return compareTo17;
        }
        int compareTo31 = Boolean.valueOf(isSetEfcf_time()).compareTo(Boolean.valueOf(other.isSetEfcf_time()));
        if (compareTo31 != 0) {
            return compareTo31;
        }
        if (isSetEfcf_time() && (compareTo16 = TBaseHelper.compareTo(this.efcf_time, other.efcf_time)) != 0) {
            return compareTo16;
        }
        int compareTo32 = Boolean.valueOf(isSetEfu()).compareTo(Boolean.valueOf(other.isSetEfu()));
        if (compareTo32 != 0) {
            return compareTo32;
        }
        if (isSetEfu() && (compareTo15 = TBaseHelper.compareTo(this.efu, other.efu)) != 0) {
            return compareTo15;
        }
        int compareTo33 = Boolean.valueOf(isSetEfu_time()).compareTo(Boolean.valueOf(other.isSetEfu_time()));
        if (compareTo33 != 0) {
            return compareTo33;
        }
        if (isSetEfu_time() && (compareTo14 = TBaseHelper.compareTo(this.efu_time, other.efu_time)) != 0) {
            return compareTo14;
        }
        int compareTo34 = Boolean.valueOf(isSetEfs()).compareTo(Boolean.valueOf(other.isSetEfs()));
        if (compareTo34 != 0) {
            return compareTo34;
        }
        if (isSetEfs() && (compareTo13 = TBaseHelper.compareTo(this.efs, other.efs)) != 0) {
            return compareTo13;
        }
        int compareTo35 = Boolean.valueOf(isSetEfs_time()).compareTo(Boolean.valueOf(other.isSetEfs_time()));
        if (compareTo35 != 0) {
            return compareTo35;
        }
        if (isSetEfs_time() && (compareTo12 = TBaseHelper.compareTo(this.efs_time, other.efs_time)) != 0) {
            return compareTo12;
        }
        int compareTo36 = Boolean.valueOf(isSetCfs()).compareTo(Boolean.valueOf(other.isSetCfs()));
        if (compareTo36 != 0) {
            return compareTo36;
        }
        if (isSetCfs() && (compareTo11 = TBaseHelper.compareTo(this.cfs, other.cfs)) != 0) {
            return compareTo11;
        }
        int compareTo37 = Boolean.valueOf(isSetCfs_time()).compareTo(Boolean.valueOf(other.isSetCfs_time()));
        if (compareTo37 != 0) {
            return compareTo37;
        }
        if (isSetCfs_time() && (compareTo10 = TBaseHelper.compareTo(this.cfs_time, other.cfs_time)) != 0) {
            return compareTo10;
        }
        int compareTo38 = Boolean.valueOf(isSetCfa()).compareTo(Boolean.valueOf(other.isSetCfa()));
        if (compareTo38 != 0) {
            return compareTo38;
        }
        if (isSetCfa() && (compareTo9 = TBaseHelper.compareTo(this.cfa, other.cfa)) != 0) {
            return compareTo9;
        }
        int compareTo39 = Boolean.valueOf(isSetCfa_time()).compareTo(Boolean.valueOf(other.isSetCfa_time()));
        if (compareTo39 != 0) {
            return compareTo39;
        }
        if (isSetCfa_time() && (compareTo8 = TBaseHelper.compareTo(this.cfa_time, other.cfa_time)) != 0) {
            return compareTo8;
        }
        int compareTo40 = Boolean.valueOf(isSetEfpcf()).compareTo(Boolean.valueOf(other.isSetEfpcf()));
        if (compareTo40 != 0) {
            return compareTo40;
        }
        if (isSetEfpcf() && (compareTo7 = TBaseHelper.compareTo(this.efpcf, other.efpcf)) != 0) {
            return compareTo7;
        }
        int compareTo41 = Boolean.valueOf(isSetEfpcf_time()).compareTo(Boolean.valueOf(other.isSetEfpcf_time()));
        if (compareTo41 != 0) {
            return compareTo41;
        }
        if (isSetEfpcf_time() && (compareTo6 = TBaseHelper.compareTo(this.efpcf_time, other.efpcf_time)) != 0) {
            return compareTo6;
        }
        int compareTo42 = Boolean.valueOf(isSetEfd()).compareTo(Boolean.valueOf(other.isSetEfd()));
        if (compareTo42 != 0) {
            return compareTo42;
        }
        if (isSetEfd() && (compareTo5 = TBaseHelper.compareTo(this.efd, other.efd)) != 0) {
            return compareTo5;
        }
        int compareTo43 = Boolean.valueOf(isSetEfd_time()).compareTo(Boolean.valueOf(other.isSetEfd_time()));
        if (compareTo43 != 0) {
            return compareTo43;
        }
        if (isSetEfd_time() && (compareTo4 = TBaseHelper.compareTo(this.efd_time, other.efd_time)) != 0) {
            return compareTo4;
        }
        int compareTo44 = Boolean.valueOf(isSetEfau()).compareTo(Boolean.valueOf(other.isSetEfau()));
        if (compareTo44 != 0) {
            return compareTo44;
        }
        if (isSetEfau() && (compareTo3 = TBaseHelper.compareTo(this.efau, other.efau)) != 0) {
            return compareTo3;
        }
        int compareTo45 = Boolean.valueOf(isSetEfau_time()).compareTo(Boolean.valueOf(other.isSetEfau_time()));
        if (compareTo45 != 0) {
            return compareTo45;
        }
        if (isSetEfau_time() && (compareTo2 = TBaseHelper.compareTo(this.efau_time, other.efau_time)) != 0) {
            return compareTo2;
        }
        int compareTo46 = Boolean.valueOf(isSetLast_modify_time()).compareTo(Boolean.valueOf(other.isSetLast_modify_time()));
        if (compareTo46 != 0) {
            return compareTo46;
        }
        if (!isSetLast_modify_time() || (compareTo = TBaseHelper.compareTo(this.last_modify_time, other.last_modify_time)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<WordAbilityItem, _Fields> deepCopy2() {
        return new WordAbilityItem(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$WordAbilityItem$_Fields[field.ordinal()]) {
            case 1:
                return Integer.valueOf(getTopic_id());
            case 2:
                return Double.valueOf(getScore());
            case 3:
                return Double.valueOf(getEvef());
            case 4:
                return Integer.valueOf(getEvef_time());
            case 5:
                return Double.valueOf(getEvcf());
            case 6:
                return Integer.valueOf(getEvcf_time());
            case 7:
                return Double.valueOf(getEfcf());
            case 8:
                return Integer.valueOf(getEfcf_time());
            case 9:
                return Double.valueOf(getEfu());
            case 10:
                return Integer.valueOf(getEfu_time());
            case 11:
                return Double.valueOf(getEfs());
            case 12:
                return Integer.valueOf(getEfs_time());
            case 13:
                return Double.valueOf(getCfs());
            case 14:
                return Integer.valueOf(getCfs_time());
            case 15:
                return Double.valueOf(getCfa());
            case 16:
                return Integer.valueOf(getCfa_time());
            case 17:
                return Double.valueOf(getEfpcf());
            case 18:
                return Integer.valueOf(getEfpcf_time());
            case 19:
                return Double.valueOf(getEfd());
            case 20:
                return Integer.valueOf(getEfd_time());
            case 21:
                return Double.valueOf(getEfau());
            case 22:
                return Integer.valueOf(getEfau_time());
            case 23:
                return Long.valueOf(getLast_modify_time());
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$WordAbilityItem$_Fields[field.ordinal()]) {
            case 1:
                return isSetTopic_id();
            case 2:
                return isSetScore();
            case 3:
                return isSetEvef();
            case 4:
                return isSetEvef_time();
            case 5:
                return isSetEvcf();
            case 6:
                return isSetEvcf_time();
            case 7:
                return isSetEfcf();
            case 8:
                return isSetEfcf_time();
            case 9:
                return isSetEfu();
            case 10:
                return isSetEfu_time();
            case 11:
                return isSetEfs();
            case 12:
                return isSetEfs_time();
            case 13:
                return isSetCfs();
            case 14:
                return isSetCfs_time();
            case 15:
                return isSetCfa();
            case 16:
                return isSetCfa_time();
            case 17:
                return isSetEfpcf();
            case 18:
                return isSetEfpcf_time();
            case 19:
                return isSetEfd();
            case 20:
                return isSetEfd_time();
            case 21:
                return isSetEfau();
            case 22:
                return isSetEfau_time();
            case 23:
                return isSetLast_modify_time();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$WordAbilityItem$_Fields[field.ordinal()]) {
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
                    setScore(((Double) value).doubleValue());
                    break;
                } else {
                    unsetScore();
                    break;
                }
            case 3:
                if (value != null) {
                    setEvef(((Double) value).doubleValue());
                    break;
                } else {
                    unsetEvef();
                    break;
                }
            case 4:
                if (value != null) {
                    setEvef_time(((Integer) value).intValue());
                    break;
                } else {
                    unsetEvef_time();
                    break;
                }
            case 5:
                if (value != null) {
                    setEvcf(((Double) value).doubleValue());
                    break;
                } else {
                    unsetEvcf();
                    break;
                }
            case 6:
                if (value != null) {
                    setEvcf_time(((Integer) value).intValue());
                    break;
                } else {
                    unsetEvcf_time();
                    break;
                }
            case 7:
                if (value != null) {
                    setEfcf(((Double) value).doubleValue());
                    break;
                } else {
                    unsetEfcf();
                    break;
                }
            case 8:
                if (value != null) {
                    setEfcf_time(((Integer) value).intValue());
                    break;
                } else {
                    unsetEfcf_time();
                    break;
                }
            case 9:
                if (value != null) {
                    setEfu(((Double) value).doubleValue());
                    break;
                } else {
                    unsetEfu();
                    break;
                }
            case 10:
                if (value != null) {
                    setEfu_time(((Integer) value).intValue());
                    break;
                } else {
                    unsetEfu_time();
                    break;
                }
            case 11:
                if (value != null) {
                    setEfs(((Double) value).doubleValue());
                    break;
                } else {
                    unsetEfs();
                    break;
                }
            case 12:
                if (value != null) {
                    setEfs_time(((Integer) value).intValue());
                    break;
                } else {
                    unsetEfs_time();
                    break;
                }
            case 13:
                if (value != null) {
                    setCfs(((Double) value).doubleValue());
                    break;
                } else {
                    unsetCfs();
                    break;
                }
            case 14:
                if (value != null) {
                    setCfs_time(((Integer) value).intValue());
                    break;
                } else {
                    unsetCfs_time();
                    break;
                }
            case 15:
                if (value != null) {
                    setCfa(((Double) value).doubleValue());
                    break;
                } else {
                    unsetCfa();
                    break;
                }
            case 16:
                if (value != null) {
                    setCfa_time(((Integer) value).intValue());
                    break;
                } else {
                    unsetCfa_time();
                    break;
                }
            case 17:
                if (value != null) {
                    setEfpcf(((Double) value).doubleValue());
                    break;
                } else {
                    unsetEfpcf();
                    break;
                }
            case 18:
                if (value != null) {
                    setEfpcf_time(((Integer) value).intValue());
                    break;
                } else {
                    unsetEfpcf_time();
                    break;
                }
            case 19:
                if (value != null) {
                    setEfd(((Double) value).doubleValue());
                    break;
                } else {
                    unsetEfd();
                    break;
                }
            case 20:
                if (value != null) {
                    setEfd_time(((Integer) value).intValue());
                    break;
                } else {
                    unsetEfd_time();
                    break;
                }
            case 21:
                if (value != null) {
                    setEfau(((Double) value).doubleValue());
                    break;
                } else {
                    unsetEfau();
                    break;
                }
            case 22:
                if (value != null) {
                    setEfau_time(((Integer) value).intValue());
                    break;
                } else {
                    unsetEfau_time();
                    break;
                }
            case 23:
                if (value != null) {
                    setLast_modify_time(((Long) value).longValue());
                    break;
                } else {
                    unsetLast_modify_time();
                    break;
                }
        }
    }

    public WordAbilityItem(int topic_id, double score, double evef, int evef_time, double evcf, int evcf_time, double efcf, int efcf_time, double efu, int efu_time, double efs, int efs_time, double cfs, int cfs_time, double cfa, int cfa_time, double efpcf, int efpcf_time, double efd, int efd_time, double efau, int efau_time, long last_modify_time) {
        this();
        this.topic_id = topic_id;
        setTopic_idIsSet(true);
        this.score = score;
        setScoreIsSet(true);
        this.evef = evef;
        setEvefIsSet(true);
        this.evef_time = evef_time;
        setEvef_timeIsSet(true);
        this.evcf = evcf;
        setEvcfIsSet(true);
        this.evcf_time = evcf_time;
        setEvcf_timeIsSet(true);
        this.efcf = efcf;
        setEfcfIsSet(true);
        this.efcf_time = efcf_time;
        setEfcf_timeIsSet(true);
        this.efu = efu;
        setEfuIsSet(true);
        this.efu_time = efu_time;
        setEfu_timeIsSet(true);
        this.efs = efs;
        setEfsIsSet(true);
        this.efs_time = efs_time;
        setEfs_timeIsSet(true);
        this.cfs = cfs;
        setCfsIsSet(true);
        this.cfs_time = cfs_time;
        setCfs_timeIsSet(true);
        this.cfa = cfa;
        setCfaIsSet(true);
        this.cfa_time = cfa_time;
        setCfa_timeIsSet(true);
        this.efpcf = efpcf;
        setEfpcfIsSet(true);
        this.efpcf_time = efpcf_time;
        setEfpcf_timeIsSet(true);
        this.efd = efd;
        setEfdIsSet(true);
        this.efd_time = efd_time;
        setEfd_timeIsSet(true);
        this.efau = efau;
        setEfauIsSet(true);
        this.efau_time = efau_time;
        setEfau_timeIsSet(true);
        this.last_modify_time = last_modify_time;
        setLast_modify_timeIsSet(true);
    }

    public boolean equals(WordAbilityItem that) {
        return that != null && this.topic_id == that.topic_id && this.score == that.score && this.evef == that.evef && this.evef_time == that.evef_time && this.evcf == that.evcf && this.evcf_time == that.evcf_time && this.efcf == that.efcf && this.efcf_time == that.efcf_time && this.efu == that.efu && this.efu_time == that.efu_time && this.efs == that.efs && this.efs_time == that.efs_time && this.cfs == that.cfs && this.cfs_time == that.cfs_time && this.cfa == that.cfa && this.cfa_time == that.cfa_time && this.efpcf == that.efpcf && this.efpcf_time == that.efpcf_time && this.efd == that.efd && this.efd_time == that.efd_time && this.efau == that.efau && this.efau_time == that.efau_time && this.last_modify_time == that.last_modify_time;
    }

    public void validate() throws TException {
    }

    public WordAbilityItem(WordAbilityItem other) {
        this.__isset_bitfield = 0;
        this.__isset_bitfield = other.__isset_bitfield;
        this.topic_id = other.topic_id;
        this.score = other.score;
        this.evef = other.evef;
        this.evef_time = other.evef_time;
        this.evcf = other.evcf;
        this.evcf_time = other.evcf_time;
        this.efcf = other.efcf;
        this.efcf_time = other.efcf_time;
        this.efu = other.efu;
        this.efu_time = other.efu_time;
        this.efs = other.efs;
        this.efs_time = other.efs_time;
        this.cfs = other.cfs;
        this.cfs_time = other.cfs_time;
        this.cfa = other.cfa;
        this.cfa_time = other.cfa_time;
        this.efpcf = other.efpcf;
        this.efpcf_time = other.efpcf_time;
        this.efd = other.efd;
        this.efd_time = other.efd_time;
        this.efau = other.efau;
        this.efau_time = other.efau_time;
        this.last_modify_time = other.last_modify_time;
    }
}

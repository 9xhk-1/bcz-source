package com.baicizhan.online.advertise_api;

import com.tencent.connect.share.QQShare;
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
public class BczLaunchAdItem implements TBase<BczLaunchAdItem, _Fields>, Serializable, Cloneable, Comparable<BczLaunchAdItem> {
    private static final int __CLICK_TYPE_ISSET_ID = 1;
    private static final int __END_TIME_ISSET_ID = 3;
    private static final int __ID_ISSET_ID = 0;
    private static final int __SHOW_SECONDS_ISSET_ID = 5;
    private static final int __SHOW_TIMES_ISSET_ID = 4;
    private static final int __START_TIME_ISSET_ID = 2;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public int click_type;
    public long end_time;

    /* renamed from: id, reason: collision with root package name */
    public int f28138id;
    public String img;
    public String link;
    public String link_2;
    public String mini_program_backup_url;
    public String mini_program_id;
    public String mini_program_path;
    private _Fields[] optionals;
    public int show_seconds;
    public int show_times;
    public long start_time;
    private static final TStruct STRUCT_DESC = new TStruct("BczLaunchAdItem");
    private static final TField ID_FIELD_DESC = new TField("id", (byte) 8, 1);
    private static final TField CLICK_TYPE_FIELD_DESC = new TField("click_type", (byte) 8, 2);
    private static final TField LINK_FIELD_DESC = new TField(y9.b.f99687c, (byte) 11, 3);
    private static final TField IMG_FIELD_DESC = new TField(SocialConstants.PARAM_IMG_URL, (byte) 11, 4);
    private static final TField START_TIME_FIELD_DESC = new TField("start_time", (byte) 10, 5);
    private static final TField END_TIME_FIELD_DESC = new TField("end_time", (byte) 10, 6);
    private static final TField SHOW_TIMES_FIELD_DESC = new TField("show_times", (byte) 8, 7);
    private static final TField SHOW_SECONDS_FIELD_DESC = new TField("show_seconds", (byte) 8, 8);
    private static final TField LINK_2_FIELD_DESC = new TField("link_2", (byte) 11, 9);
    private static final TField MINI_PROGRAM_ID_FIELD_DESC = new TField("mini_program_id", (byte) 11, 10);
    private static final TField MINI_PROGRAM_PATH_FIELD_DESC = new TField(QQShare.SHARE_TO_QQ_MINI_PROGRAM_PATH, (byte) 11, 11);
    private static final TField MINI_PROGRAM_BACKUP_URL_FIELD_DESC = new TField("mini_program_backup_url", (byte) 11, 12);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.advertise_api.BczLaunchAdItem$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$advertise_api$BczLaunchAdItem$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$advertise_api$BczLaunchAdItem$_Fields = iArr;
            try {
                iArr[_Fields.ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$advertise_api$BczLaunchAdItem$_Fields[_Fields.CLICK_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$advertise_api$BczLaunchAdItem$_Fields[_Fields.LINK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$advertise_api$BczLaunchAdItem$_Fields[_Fields.IMG.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$advertise_api$BczLaunchAdItem$_Fields[_Fields.START_TIME.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$baicizhan$online$advertise_api$BczLaunchAdItem$_Fields[_Fields.END_TIME.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$baicizhan$online$advertise_api$BczLaunchAdItem$_Fields[_Fields.SHOW_TIMES.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$baicizhan$online$advertise_api$BczLaunchAdItem$_Fields[_Fields.SHOW_SECONDS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$baicizhan$online$advertise_api$BczLaunchAdItem$_Fields[_Fields.LINK_2.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$baicizhan$online$advertise_api$BczLaunchAdItem$_Fields[_Fields.MINI_PROGRAM_ID.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$baicizhan$online$advertise_api$BczLaunchAdItem$_Fields[_Fields.MINI_PROGRAM_PATH.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$baicizhan$online$advertise_api$BczLaunchAdItem$_Fields[_Fields.MINI_PROGRAM_BACKUP_URL.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BczLaunchAdItemStandardScheme extends StandardScheme<BczLaunchAdItem> {
        private BczLaunchAdItemStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, BczLaunchAdItem struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    iprot.readStructEnd();
                    if (!struct.isSetId()) {
                        throw new TProtocolException("Required field 'id' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetClick_type()) {
                        throw new TProtocolException("Required field 'click_type' was not found in serialized data! Struct: " + toString());
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
                            struct.f28138id = iprot.readI32();
                            struct.setIdIsSet(true);
                            break;
                        }
                    case 2:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.click_type = iprot.readI32();
                            struct.setClick_typeIsSet(true);
                            break;
                        }
                    case 3:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.link = iprot.readString();
                            struct.setLinkIsSet(true);
                            break;
                        }
                    case 4:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.img = iprot.readString();
                            struct.setImgIsSet(true);
                            break;
                        }
                    case 5:
                        if (b11 != 10) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.start_time = iprot.readI64();
                            struct.setStart_timeIsSet(true);
                            break;
                        }
                    case 6:
                        if (b11 != 10) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.end_time = iprot.readI64();
                            struct.setEnd_timeIsSet(true);
                            break;
                        }
                    case 7:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.show_times = iprot.readI32();
                            struct.setShow_timesIsSet(true);
                            break;
                        }
                    case 8:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.show_seconds = iprot.readI32();
                            struct.setShow_secondsIsSet(true);
                            break;
                        }
                    case 9:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.link_2 = iprot.readString();
                            struct.setLink_2IsSet(true);
                            break;
                        }
                    case 10:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.mini_program_id = iprot.readString();
                            struct.setMini_program_idIsSet(true);
                            break;
                        }
                    case 11:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.mini_program_path = iprot.readString();
                            struct.setMini_program_pathIsSet(true);
                            break;
                        }
                    case 12:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.mini_program_backup_url = iprot.readString();
                            struct.setMini_program_backup_urlIsSet(true);
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
        public void write(TProtocol oprot, BczLaunchAdItem struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(BczLaunchAdItem.STRUCT_DESC);
            oprot.writeFieldBegin(BczLaunchAdItem.ID_FIELD_DESC);
            oprot.writeI32(struct.f28138id);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(BczLaunchAdItem.CLICK_TYPE_FIELD_DESC);
            oprot.writeI32(struct.click_type);
            oprot.writeFieldEnd();
            if (struct.link != null) {
                oprot.writeFieldBegin(BczLaunchAdItem.LINK_FIELD_DESC);
                oprot.writeString(struct.link);
                oprot.writeFieldEnd();
            }
            if (struct.img != null) {
                oprot.writeFieldBegin(BczLaunchAdItem.IMG_FIELD_DESC);
                oprot.writeString(struct.img);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(BczLaunchAdItem.START_TIME_FIELD_DESC);
            oprot.writeI64(struct.start_time);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(BczLaunchAdItem.END_TIME_FIELD_DESC);
            oprot.writeI64(struct.end_time);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(BczLaunchAdItem.SHOW_TIMES_FIELD_DESC);
            oprot.writeI32(struct.show_times);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(BczLaunchAdItem.SHOW_SECONDS_FIELD_DESC);
            oprot.writeI32(struct.show_seconds);
            oprot.writeFieldEnd();
            if (struct.link_2 != null && struct.isSetLink_2()) {
                oprot.writeFieldBegin(BczLaunchAdItem.LINK_2_FIELD_DESC);
                oprot.writeString(struct.link_2);
                oprot.writeFieldEnd();
            }
            if (struct.mini_program_id != null && struct.isSetMini_program_id()) {
                oprot.writeFieldBegin(BczLaunchAdItem.MINI_PROGRAM_ID_FIELD_DESC);
                oprot.writeString(struct.mini_program_id);
                oprot.writeFieldEnd();
            }
            if (struct.mini_program_path != null && struct.isSetMini_program_path()) {
                oprot.writeFieldBegin(BczLaunchAdItem.MINI_PROGRAM_PATH_FIELD_DESC);
                oprot.writeString(struct.mini_program_path);
                oprot.writeFieldEnd();
            }
            if (struct.mini_program_backup_url != null && struct.isSetMini_program_backup_url()) {
                oprot.writeFieldBegin(BczLaunchAdItem.MINI_PROGRAM_BACKUP_URL_FIELD_DESC);
                oprot.writeString(struct.mini_program_backup_url);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BczLaunchAdItemStandardSchemeFactory implements SchemeFactory {
        private BczLaunchAdItemStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BczLaunchAdItemStandardScheme getScheme() {
            return new BczLaunchAdItemStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BczLaunchAdItemTupleScheme extends TupleScheme<BczLaunchAdItem> {
        private BczLaunchAdItemTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, BczLaunchAdItem struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.f28138id = tTupleProtocol.readI32();
            struct.setIdIsSet(true);
            struct.click_type = tTupleProtocol.readI32();
            struct.setClick_typeIsSet(true);
            struct.link = tTupleProtocol.readString();
            struct.setLinkIsSet(true);
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
            BitSet readBitSet = tTupleProtocol.readBitSet(4);
            if (readBitSet.get(0)) {
                struct.link_2 = tTupleProtocol.readString();
                struct.setLink_2IsSet(true);
            }
            if (readBitSet.get(1)) {
                struct.mini_program_id = tTupleProtocol.readString();
                struct.setMini_program_idIsSet(true);
            }
            if (readBitSet.get(2)) {
                struct.mini_program_path = tTupleProtocol.readString();
                struct.setMini_program_pathIsSet(true);
            }
            if (readBitSet.get(3)) {
                struct.mini_program_backup_url = tTupleProtocol.readString();
                struct.setMini_program_backup_urlIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, BczLaunchAdItem struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.f28138id);
            tTupleProtocol.writeI32(struct.click_type);
            tTupleProtocol.writeString(struct.link);
            tTupleProtocol.writeString(struct.img);
            tTupleProtocol.writeI64(struct.start_time);
            tTupleProtocol.writeI64(struct.end_time);
            tTupleProtocol.writeI32(struct.show_times);
            tTupleProtocol.writeI32(struct.show_seconds);
            BitSet bitSet = new BitSet();
            if (struct.isSetLink_2()) {
                bitSet.set(0);
            }
            if (struct.isSetMini_program_id()) {
                bitSet.set(1);
            }
            if (struct.isSetMini_program_path()) {
                bitSet.set(2);
            }
            if (struct.isSetMini_program_backup_url()) {
                bitSet.set(3);
            }
            tTupleProtocol.writeBitSet(bitSet, 4);
            if (struct.isSetLink_2()) {
                tTupleProtocol.writeString(struct.link_2);
            }
            if (struct.isSetMini_program_id()) {
                tTupleProtocol.writeString(struct.mini_program_id);
            }
            if (struct.isSetMini_program_path()) {
                tTupleProtocol.writeString(struct.mini_program_path);
            }
            if (struct.isSetMini_program_backup_url()) {
                tTupleProtocol.writeString(struct.mini_program_backup_url);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BczLaunchAdItemTupleSchemeFactory implements SchemeFactory {
        private BczLaunchAdItemTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BczLaunchAdItemTupleScheme getScheme() {
            return new BczLaunchAdItemTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        ID(1, "id"),
        CLICK_TYPE(2, "click_type"),
        LINK(3, y9.b.f99687c),
        IMG(4, SocialConstants.PARAM_IMG_URL),
        START_TIME(5, "start_time"),
        END_TIME(6, "end_time"),
        SHOW_TIMES(7, "show_times"),
        SHOW_SECONDS(8, "show_seconds"),
        LINK_2(9, "link_2"),
        MINI_PROGRAM_ID(10, "mini_program_id"),
        MINI_PROGRAM_PATH(11, QQShare.SHARE_TO_QQ_MINI_PROGRAM_PATH),
        MINI_PROGRAM_BACKUP_URL(12, "mini_program_backup_url");

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
                    return ID;
                case 2:
                    return CLICK_TYPE;
                case 3:
                    return LINK;
                case 4:
                    return IMG;
                case 5:
                    return START_TIME;
                case 6:
                    return END_TIME;
                case 7:
                    return SHOW_TIMES;
                case 8:
                    return SHOW_SECONDS;
                case 9:
                    return LINK_2;
                case 10:
                    return MINI_PROGRAM_ID;
                case 11:
                    return MINI_PROGRAM_PATH;
                case 12:
                    return MINI_PROGRAM_BACKUP_URL;
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
        hashMap.put(StandardScheme.class, new BczLaunchAdItemStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new BczLaunchAdItemTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.ID, (_Fields) new FieldMetaData("id", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.CLICK_TYPE, (_Fields) new FieldMetaData("click_type", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.LINK, (_Fields) new FieldMetaData(y9.b.f99687c, (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.IMG, (_Fields) new FieldMetaData(SocialConstants.PARAM_IMG_URL, (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.START_TIME, (_Fields) new FieldMetaData("start_time", (byte) 1, new FieldValueMetaData((byte) 10)));
        enumMap.put((EnumMap) _Fields.END_TIME, (_Fields) new FieldMetaData("end_time", (byte) 1, new FieldValueMetaData((byte) 10)));
        enumMap.put((EnumMap) _Fields.SHOW_TIMES, (_Fields) new FieldMetaData("show_times", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.SHOW_SECONDS, (_Fields) new FieldMetaData("show_seconds", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.LINK_2, (_Fields) new FieldMetaData("link_2", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.MINI_PROGRAM_ID, (_Fields) new FieldMetaData("mini_program_id", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.MINI_PROGRAM_PATH, (_Fields) new FieldMetaData(QQShare.SHARE_TO_QQ_MINI_PROGRAM_PATH, (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.MINI_PROGRAM_BACKUP_URL, (_Fields) new FieldMetaData("mini_program_backup_url", (byte) 2, new FieldValueMetaData((byte) 11)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(BczLaunchAdItem.class, unmodifiableMap);
    }

    public BczLaunchAdItem() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.LINK_2, _Fields.MINI_PROGRAM_ID, _Fields.MINI_PROGRAM_PATH, _Fields.MINI_PROGRAM_BACKUP_URL};
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
        setIdIsSet(false);
        this.f28138id = 0;
        setClick_typeIsSet(false);
        this.click_type = 0;
        this.link = null;
        this.img = null;
        setStart_timeIsSet(false);
        this.start_time = 0L;
        setEnd_timeIsSet(false);
        this.end_time = 0L;
        setShow_timesIsSet(false);
        this.show_times = 0;
        setShow_secondsIsSet(false);
        this.show_seconds = 0;
        this.link_2 = null;
        this.mini_program_id = null;
        this.mini_program_path = null;
        this.mini_program_backup_url = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof BczLaunchAdItem)) {
            return equals((BczLaunchAdItem) that);
        }
        return false;
    }

    public int getClick_type() {
        return this.click_type;
    }

    public long getEnd_time() {
        return this.end_time;
    }

    public int getId() {
        return this.f28138id;
    }

    public String getImg() {
        return this.img;
    }

    public String getLink() {
        return this.link;
    }

    public String getLink_2() {
        return this.link_2;
    }

    public String getMini_program_backup_url() {
        return this.mini_program_backup_url;
    }

    public String getMini_program_id() {
        return this.mini_program_id;
    }

    public String getMini_program_path() {
        return this.mini_program_path;
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

    public boolean isSetClick_type() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetEnd_time() {
        return EncodingUtils.testBit(this.__isset_bitfield, 3);
    }

    public boolean isSetId() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetImg() {
        return this.img != null;
    }

    public boolean isSetLink() {
        return this.link != null;
    }

    public boolean isSetLink_2() {
        return this.link_2 != null;
    }

    public boolean isSetMini_program_backup_url() {
        return this.mini_program_backup_url != null;
    }

    public boolean isSetMini_program_id() {
        return this.mini_program_id != null;
    }

    public boolean isSetMini_program_path() {
        return this.mini_program_path != null;
    }

    public boolean isSetShow_seconds() {
        return EncodingUtils.testBit(this.__isset_bitfield, 5);
    }

    public boolean isSetShow_times() {
        return EncodingUtils.testBit(this.__isset_bitfield, 4);
    }

    public boolean isSetStart_time() {
        return EncodingUtils.testBit(this.__isset_bitfield, 2);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public BczLaunchAdItem setClick_type(int click_type) {
        this.click_type = click_type;
        setClick_typeIsSet(true);
        return this;
    }

    public void setClick_typeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public BczLaunchAdItem setEnd_time(long end_time) {
        this.end_time = end_time;
        setEnd_timeIsSet(true);
        return this;
    }

    public void setEnd_timeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 3, value);
    }

    public BczLaunchAdItem setId(int id2) {
        this.f28138id = id2;
        setIdIsSet(true);
        return this;
    }

    public void setIdIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public BczLaunchAdItem setImg(String img) {
        this.img = img;
        return this;
    }

    public void setImgIsSet(boolean value) {
        if (value) {
            return;
        }
        this.img = null;
    }

    public BczLaunchAdItem setLink(String link) {
        this.link = link;
        return this;
    }

    public void setLinkIsSet(boolean value) {
        if (value) {
            return;
        }
        this.link = null;
    }

    public BczLaunchAdItem setLink_2(String link_2) {
        this.link_2 = link_2;
        return this;
    }

    public void setLink_2IsSet(boolean value) {
        if (value) {
            return;
        }
        this.link_2 = null;
    }

    public BczLaunchAdItem setMini_program_backup_url(String mini_program_backup_url) {
        this.mini_program_backup_url = mini_program_backup_url;
        return this;
    }

    public void setMini_program_backup_urlIsSet(boolean value) {
        if (value) {
            return;
        }
        this.mini_program_backup_url = null;
    }

    public BczLaunchAdItem setMini_program_id(String mini_program_id) {
        this.mini_program_id = mini_program_id;
        return this;
    }

    public void setMini_program_idIsSet(boolean value) {
        if (value) {
            return;
        }
        this.mini_program_id = null;
    }

    public BczLaunchAdItem setMini_program_path(String mini_program_path) {
        this.mini_program_path = mini_program_path;
        return this;
    }

    public void setMini_program_pathIsSet(boolean value) {
        if (value) {
            return;
        }
        this.mini_program_path = null;
    }

    public BczLaunchAdItem setShow_seconds(int show_seconds) {
        this.show_seconds = show_seconds;
        setShow_secondsIsSet(true);
        return this;
    }

    public void setShow_secondsIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 5, value);
    }

    public BczLaunchAdItem setShow_times(int show_times) {
        this.show_times = show_times;
        setShow_timesIsSet(true);
        return this;
    }

    public void setShow_timesIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 4, value);
    }

    public BczLaunchAdItem setStart_time(long start_time) {
        this.start_time = start_time;
        setStart_timeIsSet(true);
        return this;
    }

    public void setStart_timeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 2, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("BczLaunchAdItem(");
        sb2.append("id:");
        sb2.append(this.f28138id);
        sb2.append(j2.O);
        sb2.append("click_type:");
        sb2.append(this.click_type);
        sb2.append(j2.O);
        sb2.append("link:");
        String str = this.link;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(j2.O);
        sb2.append("img:");
        String str2 = this.img;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(str2);
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
        if (isSetLink_2()) {
            sb2.append(j2.O);
            sb2.append("link_2:");
            String str3 = this.link_2;
            if (str3 == null) {
                sb2.append("null");
            } else {
                sb2.append(str3);
            }
        }
        if (isSetMini_program_id()) {
            sb2.append(j2.O);
            sb2.append("mini_program_id:");
            String str4 = this.mini_program_id;
            if (str4 == null) {
                sb2.append("null");
            } else {
                sb2.append(str4);
            }
        }
        if (isSetMini_program_path()) {
            sb2.append(j2.O);
            sb2.append("mini_program_path:");
            String str5 = this.mini_program_path;
            if (str5 == null) {
                sb2.append("null");
            } else {
                sb2.append(str5);
            }
        }
        if (isSetMini_program_backup_url()) {
            sb2.append(j2.O);
            sb2.append("mini_program_backup_url:");
            String str6 = this.mini_program_backup_url;
            if (str6 == null) {
                sb2.append("null");
            } else {
                sb2.append(str6);
            }
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetClick_type() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetEnd_time() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 3);
    }

    public void unsetId() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetImg() {
        this.img = null;
    }

    public void unsetLink() {
        this.link = null;
    }

    public void unsetLink_2() {
        this.link_2 = null;
    }

    public void unsetMini_program_backup_url() {
        this.mini_program_backup_url = null;
    }

    public void unsetMini_program_id() {
        this.mini_program_id = null;
    }

    public void unsetMini_program_path() {
        this.mini_program_path = null;
    }

    public void unsetShow_seconds() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 5);
    }

    public void unsetShow_times() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 4);
    }

    public void unsetStart_time() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 2);
    }

    public void validate() throws TException {
        if (this.link == null) {
            throw new TProtocolException("Required field 'link' was not present! Struct: " + toString());
        }
        if (this.img != null) {
            return;
        }
        throw new TProtocolException("Required field 'img' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(BczLaunchAdItem other) {
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
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo13 = Boolean.valueOf(isSetId()).compareTo(Boolean.valueOf(other.isSetId()));
        if (compareTo13 != 0) {
            return compareTo13;
        }
        if (isSetId() && (compareTo12 = TBaseHelper.compareTo(this.f28138id, other.f28138id)) != 0) {
            return compareTo12;
        }
        int compareTo14 = Boolean.valueOf(isSetClick_type()).compareTo(Boolean.valueOf(other.isSetClick_type()));
        if (compareTo14 != 0) {
            return compareTo14;
        }
        if (isSetClick_type() && (compareTo11 = TBaseHelper.compareTo(this.click_type, other.click_type)) != 0) {
            return compareTo11;
        }
        int compareTo15 = Boolean.valueOf(isSetLink()).compareTo(Boolean.valueOf(other.isSetLink()));
        if (compareTo15 != 0) {
            return compareTo15;
        }
        if (isSetLink() && (compareTo10 = TBaseHelper.compareTo(this.link, other.link)) != 0) {
            return compareTo10;
        }
        int compareTo16 = Boolean.valueOf(isSetImg()).compareTo(Boolean.valueOf(other.isSetImg()));
        if (compareTo16 != 0) {
            return compareTo16;
        }
        if (isSetImg() && (compareTo9 = TBaseHelper.compareTo(this.img, other.img)) != 0) {
            return compareTo9;
        }
        int compareTo17 = Boolean.valueOf(isSetStart_time()).compareTo(Boolean.valueOf(other.isSetStart_time()));
        if (compareTo17 != 0) {
            return compareTo17;
        }
        if (isSetStart_time() && (compareTo8 = TBaseHelper.compareTo(this.start_time, other.start_time)) != 0) {
            return compareTo8;
        }
        int compareTo18 = Boolean.valueOf(isSetEnd_time()).compareTo(Boolean.valueOf(other.isSetEnd_time()));
        if (compareTo18 != 0) {
            return compareTo18;
        }
        if (isSetEnd_time() && (compareTo7 = TBaseHelper.compareTo(this.end_time, other.end_time)) != 0) {
            return compareTo7;
        }
        int compareTo19 = Boolean.valueOf(isSetShow_times()).compareTo(Boolean.valueOf(other.isSetShow_times()));
        if (compareTo19 != 0) {
            return compareTo19;
        }
        if (isSetShow_times() && (compareTo6 = TBaseHelper.compareTo(this.show_times, other.show_times)) != 0) {
            return compareTo6;
        }
        int compareTo20 = Boolean.valueOf(isSetShow_seconds()).compareTo(Boolean.valueOf(other.isSetShow_seconds()));
        if (compareTo20 != 0) {
            return compareTo20;
        }
        if (isSetShow_seconds() && (compareTo5 = TBaseHelper.compareTo(this.show_seconds, other.show_seconds)) != 0) {
            return compareTo5;
        }
        int compareTo21 = Boolean.valueOf(isSetLink_2()).compareTo(Boolean.valueOf(other.isSetLink_2()));
        if (compareTo21 != 0) {
            return compareTo21;
        }
        if (isSetLink_2() && (compareTo4 = TBaseHelper.compareTo(this.link_2, other.link_2)) != 0) {
            return compareTo4;
        }
        int compareTo22 = Boolean.valueOf(isSetMini_program_id()).compareTo(Boolean.valueOf(other.isSetMini_program_id()));
        if (compareTo22 != 0) {
            return compareTo22;
        }
        if (isSetMini_program_id() && (compareTo3 = TBaseHelper.compareTo(this.mini_program_id, other.mini_program_id)) != 0) {
            return compareTo3;
        }
        int compareTo23 = Boolean.valueOf(isSetMini_program_path()).compareTo(Boolean.valueOf(other.isSetMini_program_path()));
        if (compareTo23 != 0) {
            return compareTo23;
        }
        if (isSetMini_program_path() && (compareTo2 = TBaseHelper.compareTo(this.mini_program_path, other.mini_program_path)) != 0) {
            return compareTo2;
        }
        int compareTo24 = Boolean.valueOf(isSetMini_program_backup_url()).compareTo(Boolean.valueOf(other.isSetMini_program_backup_url()));
        if (compareTo24 != 0) {
            return compareTo24;
        }
        if (!isSetMini_program_backup_url() || (compareTo = TBaseHelper.compareTo(this.mini_program_backup_url, other.mini_program_backup_url)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<BczLaunchAdItem, _Fields> deepCopy2() {
        return new BczLaunchAdItem(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$advertise_api$BczLaunchAdItem$_Fields[field.ordinal()]) {
            case 1:
                return Integer.valueOf(getId());
            case 2:
                return Integer.valueOf(getClick_type());
            case 3:
                return getLink();
            case 4:
                return getImg();
            case 5:
                return Long.valueOf(getStart_time());
            case 6:
                return Long.valueOf(getEnd_time());
            case 7:
                return Integer.valueOf(getShow_times());
            case 8:
                return Integer.valueOf(getShow_seconds());
            case 9:
                return getLink_2();
            case 10:
                return getMini_program_id();
            case 11:
                return getMini_program_path();
            case 12:
                return getMini_program_backup_url();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$advertise_api$BczLaunchAdItem$_Fields[field.ordinal()]) {
            case 1:
                return isSetId();
            case 2:
                return isSetClick_type();
            case 3:
                return isSetLink();
            case 4:
                return isSetImg();
            case 5:
                return isSetStart_time();
            case 6:
                return isSetEnd_time();
            case 7:
                return isSetShow_times();
            case 8:
                return isSetShow_seconds();
            case 9:
                return isSetLink_2();
            case 10:
                return isSetMini_program_id();
            case 11:
                return isSetMini_program_path();
            case 12:
                return isSetMini_program_backup_url();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$advertise_api$BczLaunchAdItem$_Fields[field.ordinal()]) {
            case 1:
                if (value != null) {
                    setId(((Integer) value).intValue());
                    break;
                } else {
                    unsetId();
                    break;
                }
            case 2:
                if (value != null) {
                    setClick_type(((Integer) value).intValue());
                    break;
                } else {
                    unsetClick_type();
                    break;
                }
            case 3:
                if (value != null) {
                    setLink((String) value);
                    break;
                } else {
                    unsetLink();
                    break;
                }
            case 4:
                if (value != null) {
                    setImg((String) value);
                    break;
                } else {
                    unsetImg();
                    break;
                }
            case 5:
                if (value != null) {
                    setStart_time(((Long) value).longValue());
                    break;
                } else {
                    unsetStart_time();
                    break;
                }
            case 6:
                if (value != null) {
                    setEnd_time(((Long) value).longValue());
                    break;
                } else {
                    unsetEnd_time();
                    break;
                }
            case 7:
                if (value != null) {
                    setShow_times(((Integer) value).intValue());
                    break;
                } else {
                    unsetShow_times();
                    break;
                }
            case 8:
                if (value != null) {
                    setShow_seconds(((Integer) value).intValue());
                    break;
                } else {
                    unsetShow_seconds();
                    break;
                }
            case 9:
                if (value != null) {
                    setLink_2((String) value);
                    break;
                } else {
                    unsetLink_2();
                    break;
                }
            case 10:
                if (value != null) {
                    setMini_program_id((String) value);
                    break;
                } else {
                    unsetMini_program_id();
                    break;
                }
            case 11:
                if (value != null) {
                    setMini_program_path((String) value);
                    break;
                } else {
                    unsetMini_program_path();
                    break;
                }
            case 12:
                if (value != null) {
                    setMini_program_backup_url((String) value);
                    break;
                } else {
                    unsetMini_program_backup_url();
                    break;
                }
        }
    }

    public boolean equals(BczLaunchAdItem that) {
        if (that == null || this.f28138id != that.f28138id || this.click_type != that.click_type) {
            return false;
        }
        boolean isSetLink = isSetLink();
        boolean isSetLink2 = that.isSetLink();
        if ((isSetLink || isSetLink2) && !(isSetLink && isSetLink2 && this.link.equals(that.link))) {
            return false;
        }
        boolean isSetImg = isSetImg();
        boolean isSetImg2 = that.isSetImg();
        if (((isSetImg || isSetImg2) && (!isSetImg || !isSetImg2 || !this.img.equals(that.img))) || this.start_time != that.start_time || this.end_time != that.end_time || this.show_times != that.show_times || this.show_seconds != that.show_seconds) {
            return false;
        }
        boolean isSetLink_2 = isSetLink_2();
        boolean isSetLink_22 = that.isSetLink_2();
        if ((isSetLink_2 || isSetLink_22) && !(isSetLink_2 && isSetLink_22 && this.link_2.equals(that.link_2))) {
            return false;
        }
        boolean isSetMini_program_id = isSetMini_program_id();
        boolean isSetMini_program_id2 = that.isSetMini_program_id();
        if ((isSetMini_program_id || isSetMini_program_id2) && !(isSetMini_program_id && isSetMini_program_id2 && this.mini_program_id.equals(that.mini_program_id))) {
            return false;
        }
        boolean isSetMini_program_path = isSetMini_program_path();
        boolean isSetMini_program_path2 = that.isSetMini_program_path();
        if ((isSetMini_program_path || isSetMini_program_path2) && !(isSetMini_program_path && isSetMini_program_path2 && this.mini_program_path.equals(that.mini_program_path))) {
            return false;
        }
        boolean isSetMini_program_backup_url = isSetMini_program_backup_url();
        boolean isSetMini_program_backup_url2 = that.isSetMini_program_backup_url();
        if (isSetMini_program_backup_url || isSetMini_program_backup_url2) {
            return isSetMini_program_backup_url && isSetMini_program_backup_url2 && this.mini_program_backup_url.equals(that.mini_program_backup_url);
        }
        return true;
    }

    public BczLaunchAdItem(int id2, int click_type, String link, String img, long start_time, long end_time, int show_times, int show_seconds) {
        this();
        this.f28138id = id2;
        setIdIsSet(true);
        this.click_type = click_type;
        setClick_typeIsSet(true);
        this.link = link;
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

    public BczLaunchAdItem(BczLaunchAdItem other) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.LINK_2, _Fields.MINI_PROGRAM_ID, _Fields.MINI_PROGRAM_PATH, _Fields.MINI_PROGRAM_BACKUP_URL};
        this.__isset_bitfield = other.__isset_bitfield;
        this.f28138id = other.f28138id;
        this.click_type = other.click_type;
        if (other.isSetLink()) {
            this.link = other.link;
        }
        if (other.isSetImg()) {
            this.img = other.img;
        }
        this.start_time = other.start_time;
        this.end_time = other.end_time;
        this.show_times = other.show_times;
        this.show_seconds = other.show_seconds;
        if (other.isSetLink_2()) {
            this.link_2 = other.link_2;
        }
        if (other.isSetMini_program_id()) {
            this.mini_program_id = other.mini_program_id;
        }
        if (other.isSetMini_program_path()) {
            this.mini_program_path = other.mini_program_path;
        }
        if (other.isSetMini_program_backup_url()) {
            this.mini_program_backup_url = other.mini_program_backup_url;
        }
    }
}

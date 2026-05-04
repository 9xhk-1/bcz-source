package com.baicizhan.online.game_api;

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
public class LavaQuest implements TBase<LavaQuest, _Fields>, Serializable, Cloneable, Comparable<LavaQuest> {
    private static final int __CURRENT_ISSET_ID = 1;
    private static final int __END_TIME_ISSET_ID = 5;
    private static final int __PROPS_REMAIN_COUNT_ISSET_ID = 3;
    private static final int __REVIVAL_COIN_COST_ISSET_ID = 4;
    private static final int __STATUS_ISSET_ID = 0;
    private static final int __TOTAL_ISSET_ID = 2;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public String background_color;
    public String border_color;
    public int current;
    public long end_time;
    public String icon_img;
    public int props_remain_count;
    public int revival_coin_cost;
    public int status;
    public int total;
    private static final TStruct STRUCT_DESC = new TStruct("LavaQuest");
    private static final TField STATUS_FIELD_DESC = new TField("status", (byte) 8, 1);
    private static final TField CURRENT_FIELD_DESC = new TField("current", (byte) 8, 2);
    private static final TField TOTAL_FIELD_DESC = new TField(hb.d.f59153d, (byte) 8, 3);
    private static final TField PROPS_REMAIN_COUNT_FIELD_DESC = new TField("props_remain_count", (byte) 8, 4);
    private static final TField REVIVAL_COIN_COST_FIELD_DESC = new TField("revival_coin_cost", (byte) 8, 5);
    private static final TField END_TIME_FIELD_DESC = new TField("end_time", (byte) 10, 6);
    private static final TField ICON_IMG_FIELD_DESC = new TField("icon_img", (byte) 11, 7);
    private static final TField BACKGROUND_COLOR_FIELD_DESC = new TField("background_color", (byte) 11, 8);
    private static final TField BORDER_COLOR_FIELD_DESC = new TField("border_color", (byte) 11, 9);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.game_api.LavaQuest$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$game_api$LavaQuest$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$game_api$LavaQuest$_Fields = iArr;
            try {
                iArr[_Fields.STATUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$LavaQuest$_Fields[_Fields.CURRENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$LavaQuest$_Fields[_Fields.TOTAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$LavaQuest$_Fields[_Fields.PROPS_REMAIN_COUNT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$LavaQuest$_Fields[_Fields.REVIVAL_COIN_COST.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$LavaQuest$_Fields[_Fields.END_TIME.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$LavaQuest$_Fields[_Fields.ICON_IMG.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$LavaQuest$_Fields[_Fields.BACKGROUND_COLOR.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$LavaQuest$_Fields[_Fields.BORDER_COLOR.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class LavaQuestStandardScheme extends StandardScheme<LavaQuest> {
        private LavaQuestStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, LavaQuest struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    iprot.readStructEnd();
                    if (!struct.isSetStatus()) {
                        throw new TProtocolException("Required field 'status' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetCurrent()) {
                        throw new TProtocolException("Required field 'current' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetTotal()) {
                        throw new TProtocolException("Required field 'total' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetProps_remain_count()) {
                        throw new TProtocolException("Required field 'props_remain_count' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetRevival_coin_cost()) {
                        throw new TProtocolException("Required field 'revival_coin_cost' was not found in serialized data! Struct: " + toString());
                    }
                    if (struct.isSetEnd_time()) {
                        struct.validate();
                        return;
                    }
                    throw new TProtocolException("Required field 'end_time' was not found in serialized data! Struct: " + toString());
                }
                switch (readFieldBegin.f77768id) {
                    case 1:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.status = iprot.readI32();
                            struct.setStatusIsSet(true);
                            break;
                        }
                    case 2:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.current = iprot.readI32();
                            struct.setCurrentIsSet(true);
                            break;
                        }
                    case 3:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.total = iprot.readI32();
                            struct.setTotalIsSet(true);
                            break;
                        }
                    case 4:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.props_remain_count = iprot.readI32();
                            struct.setProps_remain_countIsSet(true);
                            break;
                        }
                    case 5:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.revival_coin_cost = iprot.readI32();
                            struct.setRevival_coin_costIsSet(true);
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
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.icon_img = iprot.readString();
                            struct.setIcon_imgIsSet(true);
                            break;
                        }
                    case 8:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.background_color = iprot.readString();
                            struct.setBackground_colorIsSet(true);
                            break;
                        }
                    case 9:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.border_color = iprot.readString();
                            struct.setBorder_colorIsSet(true);
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
        public void write(TProtocol oprot, LavaQuest struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(LavaQuest.STRUCT_DESC);
            oprot.writeFieldBegin(LavaQuest.STATUS_FIELD_DESC);
            oprot.writeI32(struct.status);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(LavaQuest.CURRENT_FIELD_DESC);
            oprot.writeI32(struct.current);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(LavaQuest.TOTAL_FIELD_DESC);
            oprot.writeI32(struct.total);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(LavaQuest.PROPS_REMAIN_COUNT_FIELD_DESC);
            oprot.writeI32(struct.props_remain_count);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(LavaQuest.REVIVAL_COIN_COST_FIELD_DESC);
            oprot.writeI32(struct.revival_coin_cost);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(LavaQuest.END_TIME_FIELD_DESC);
            oprot.writeI64(struct.end_time);
            oprot.writeFieldEnd();
            if (struct.icon_img != null) {
                oprot.writeFieldBegin(LavaQuest.ICON_IMG_FIELD_DESC);
                oprot.writeString(struct.icon_img);
                oprot.writeFieldEnd();
            }
            if (struct.background_color != null) {
                oprot.writeFieldBegin(LavaQuest.BACKGROUND_COLOR_FIELD_DESC);
                oprot.writeString(struct.background_color);
                oprot.writeFieldEnd();
            }
            if (struct.border_color != null) {
                oprot.writeFieldBegin(LavaQuest.BORDER_COLOR_FIELD_DESC);
                oprot.writeString(struct.border_color);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class LavaQuestStandardSchemeFactory implements SchemeFactory {
        private LavaQuestStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public LavaQuestStandardScheme getScheme() {
            return new LavaQuestStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class LavaQuestTupleScheme extends TupleScheme<LavaQuest> {
        private LavaQuestTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, LavaQuest struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.status = tTupleProtocol.readI32();
            struct.setStatusIsSet(true);
            struct.current = tTupleProtocol.readI32();
            struct.setCurrentIsSet(true);
            struct.total = tTupleProtocol.readI32();
            struct.setTotalIsSet(true);
            struct.props_remain_count = tTupleProtocol.readI32();
            struct.setProps_remain_countIsSet(true);
            struct.revival_coin_cost = tTupleProtocol.readI32();
            struct.setRevival_coin_costIsSet(true);
            struct.end_time = tTupleProtocol.readI64();
            struct.setEnd_timeIsSet(true);
            struct.icon_img = tTupleProtocol.readString();
            struct.setIcon_imgIsSet(true);
            struct.background_color = tTupleProtocol.readString();
            struct.setBackground_colorIsSet(true);
            struct.border_color = tTupleProtocol.readString();
            struct.setBorder_colorIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, LavaQuest struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.status);
            tTupleProtocol.writeI32(struct.current);
            tTupleProtocol.writeI32(struct.total);
            tTupleProtocol.writeI32(struct.props_remain_count);
            tTupleProtocol.writeI32(struct.revival_coin_cost);
            tTupleProtocol.writeI64(struct.end_time);
            tTupleProtocol.writeString(struct.icon_img);
            tTupleProtocol.writeString(struct.background_color);
            tTupleProtocol.writeString(struct.border_color);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class LavaQuestTupleSchemeFactory implements SchemeFactory {
        private LavaQuestTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public LavaQuestTupleScheme getScheme() {
            return new LavaQuestTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        STATUS(1, "status"),
        CURRENT(2, "current"),
        TOTAL(3, hb.d.f59153d),
        PROPS_REMAIN_COUNT(4, "props_remain_count"),
        REVIVAL_COIN_COST(5, "revival_coin_cost"),
        END_TIME(6, "end_time"),
        ICON_IMG(7, "icon_img"),
        BACKGROUND_COLOR(8, "background_color"),
        BORDER_COLOR(9, "border_color");

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
                    return STATUS;
                case 2:
                    return CURRENT;
                case 3:
                    return TOTAL;
                case 4:
                    return PROPS_REMAIN_COUNT;
                case 5:
                    return REVIVAL_COIN_COST;
                case 6:
                    return END_TIME;
                case 7:
                    return ICON_IMG;
                case 8:
                    return BACKGROUND_COLOR;
                case 9:
                    return BORDER_COLOR;
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
        hashMap.put(StandardScheme.class, new LavaQuestStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new LavaQuestTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.STATUS, (_Fields) new FieldMetaData("status", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.CURRENT, (_Fields) new FieldMetaData("current", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.TOTAL, (_Fields) new FieldMetaData(hb.d.f59153d, (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.PROPS_REMAIN_COUNT, (_Fields) new FieldMetaData("props_remain_count", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.REVIVAL_COIN_COST, (_Fields) new FieldMetaData("revival_coin_cost", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.END_TIME, (_Fields) new FieldMetaData("end_time", (byte) 1, new FieldValueMetaData((byte) 10)));
        enumMap.put((EnumMap) _Fields.ICON_IMG, (_Fields) new FieldMetaData("icon_img", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.BACKGROUND_COLOR, (_Fields) new FieldMetaData("background_color", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.BORDER_COLOR, (_Fields) new FieldMetaData("border_color", (byte) 1, new FieldValueMetaData((byte) 11)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(LavaQuest.class, unmodifiableMap);
    }

    public LavaQuest() {
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
        setStatusIsSet(false);
        this.status = 0;
        setCurrentIsSet(false);
        this.current = 0;
        setTotalIsSet(false);
        this.total = 0;
        setProps_remain_countIsSet(false);
        this.props_remain_count = 0;
        setRevival_coin_costIsSet(false);
        this.revival_coin_cost = 0;
        setEnd_timeIsSet(false);
        this.end_time = 0L;
        this.icon_img = null;
        this.background_color = null;
        this.border_color = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof LavaQuest)) {
            return equals((LavaQuest) that);
        }
        return false;
    }

    public String getBackground_color() {
        return this.background_color;
    }

    public String getBorder_color() {
        return this.border_color;
    }

    public int getCurrent() {
        return this.current;
    }

    public long getEnd_time() {
        return this.end_time;
    }

    public String getIcon_img() {
        return this.icon_img;
    }

    public int getProps_remain_count() {
        return this.props_remain_count;
    }

    public int getRevival_coin_cost() {
        return this.revival_coin_cost;
    }

    public int getStatus() {
        return this.status;
    }

    public int getTotal() {
        return this.total;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetBackground_color() {
        return this.background_color != null;
    }

    public boolean isSetBorder_color() {
        return this.border_color != null;
    }

    public boolean isSetCurrent() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetEnd_time() {
        return EncodingUtils.testBit(this.__isset_bitfield, 5);
    }

    public boolean isSetIcon_img() {
        return this.icon_img != null;
    }

    public boolean isSetProps_remain_count() {
        return EncodingUtils.testBit(this.__isset_bitfield, 3);
    }

    public boolean isSetRevival_coin_cost() {
        return EncodingUtils.testBit(this.__isset_bitfield, 4);
    }

    public boolean isSetStatus() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetTotal() {
        return EncodingUtils.testBit(this.__isset_bitfield, 2);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public LavaQuest setBackground_color(String background_color) {
        this.background_color = background_color;
        return this;
    }

    public void setBackground_colorIsSet(boolean value) {
        if (value) {
            return;
        }
        this.background_color = null;
    }

    public LavaQuest setBorder_color(String border_color) {
        this.border_color = border_color;
        return this;
    }

    public void setBorder_colorIsSet(boolean value) {
        if (value) {
            return;
        }
        this.border_color = null;
    }

    public LavaQuest setCurrent(int current) {
        this.current = current;
        setCurrentIsSet(true);
        return this;
    }

    public void setCurrentIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public LavaQuest setEnd_time(long end_time) {
        this.end_time = end_time;
        setEnd_timeIsSet(true);
        return this;
    }

    public void setEnd_timeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 5, value);
    }

    public LavaQuest setIcon_img(String icon_img) {
        this.icon_img = icon_img;
        return this;
    }

    public void setIcon_imgIsSet(boolean value) {
        if (value) {
            return;
        }
        this.icon_img = null;
    }

    public LavaQuest setProps_remain_count(int props_remain_count) {
        this.props_remain_count = props_remain_count;
        setProps_remain_countIsSet(true);
        return this;
    }

    public void setProps_remain_countIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 3, value);
    }

    public LavaQuest setRevival_coin_cost(int revival_coin_cost) {
        this.revival_coin_cost = revival_coin_cost;
        setRevival_coin_costIsSet(true);
        return this;
    }

    public void setRevival_coin_costIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 4, value);
    }

    public LavaQuest setStatus(int status) {
        this.status = status;
        setStatusIsSet(true);
        return this;
    }

    public void setStatusIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public LavaQuest setTotal(int total) {
        this.total = total;
        setTotalIsSet(true);
        return this;
    }

    public void setTotalIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 2, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("LavaQuest(");
        sb2.append("status:");
        sb2.append(this.status);
        sb2.append(j2.O);
        sb2.append("current:");
        sb2.append(this.current);
        sb2.append(j2.O);
        sb2.append("total:");
        sb2.append(this.total);
        sb2.append(j2.O);
        sb2.append("props_remain_count:");
        sb2.append(this.props_remain_count);
        sb2.append(j2.O);
        sb2.append("revival_coin_cost:");
        sb2.append(this.revival_coin_cost);
        sb2.append(j2.O);
        sb2.append("end_time:");
        sb2.append(this.end_time);
        sb2.append(j2.O);
        sb2.append("icon_img:");
        String str = this.icon_img;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(j2.O);
        sb2.append("background_color:");
        String str2 = this.background_color;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(str2);
        }
        sb2.append(j2.O);
        sb2.append("border_color:");
        String str3 = this.border_color;
        if (str3 == null) {
            sb2.append("null");
        } else {
            sb2.append(str3);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetBackground_color() {
        this.background_color = null;
    }

    public void unsetBorder_color() {
        this.border_color = null;
    }

    public void unsetCurrent() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetEnd_time() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 5);
    }

    public void unsetIcon_img() {
        this.icon_img = null;
    }

    public void unsetProps_remain_count() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 3);
    }

    public void unsetRevival_coin_cost() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 4);
    }

    public void unsetStatus() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetTotal() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 2);
    }

    public void validate() throws TException {
        if (this.icon_img == null) {
            throw new TProtocolException("Required field 'icon_img' was not present! Struct: " + toString());
        }
        if (this.background_color == null) {
            throw new TProtocolException("Required field 'background_color' was not present! Struct: " + toString());
        }
        if (this.border_color != null) {
            return;
        }
        throw new TProtocolException("Required field 'border_color' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(LavaQuest other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        int compareTo5;
        int compareTo6;
        int compareTo7;
        int compareTo8;
        int compareTo9;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo10 = Boolean.valueOf(isSetStatus()).compareTo(Boolean.valueOf(other.isSetStatus()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (isSetStatus() && (compareTo9 = TBaseHelper.compareTo(this.status, other.status)) != 0) {
            return compareTo9;
        }
        int compareTo11 = Boolean.valueOf(isSetCurrent()).compareTo(Boolean.valueOf(other.isSetCurrent()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (isSetCurrent() && (compareTo8 = TBaseHelper.compareTo(this.current, other.current)) != 0) {
            return compareTo8;
        }
        int compareTo12 = Boolean.valueOf(isSetTotal()).compareTo(Boolean.valueOf(other.isSetTotal()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (isSetTotal() && (compareTo7 = TBaseHelper.compareTo(this.total, other.total)) != 0) {
            return compareTo7;
        }
        int compareTo13 = Boolean.valueOf(isSetProps_remain_count()).compareTo(Boolean.valueOf(other.isSetProps_remain_count()));
        if (compareTo13 != 0) {
            return compareTo13;
        }
        if (isSetProps_remain_count() && (compareTo6 = TBaseHelper.compareTo(this.props_remain_count, other.props_remain_count)) != 0) {
            return compareTo6;
        }
        int compareTo14 = Boolean.valueOf(isSetRevival_coin_cost()).compareTo(Boolean.valueOf(other.isSetRevival_coin_cost()));
        if (compareTo14 != 0) {
            return compareTo14;
        }
        if (isSetRevival_coin_cost() && (compareTo5 = TBaseHelper.compareTo(this.revival_coin_cost, other.revival_coin_cost)) != 0) {
            return compareTo5;
        }
        int compareTo15 = Boolean.valueOf(isSetEnd_time()).compareTo(Boolean.valueOf(other.isSetEnd_time()));
        if (compareTo15 != 0) {
            return compareTo15;
        }
        if (isSetEnd_time() && (compareTo4 = TBaseHelper.compareTo(this.end_time, other.end_time)) != 0) {
            return compareTo4;
        }
        int compareTo16 = Boolean.valueOf(isSetIcon_img()).compareTo(Boolean.valueOf(other.isSetIcon_img()));
        if (compareTo16 != 0) {
            return compareTo16;
        }
        if (isSetIcon_img() && (compareTo3 = TBaseHelper.compareTo(this.icon_img, other.icon_img)) != 0) {
            return compareTo3;
        }
        int compareTo17 = Boolean.valueOf(isSetBackground_color()).compareTo(Boolean.valueOf(other.isSetBackground_color()));
        if (compareTo17 != 0) {
            return compareTo17;
        }
        if (isSetBackground_color() && (compareTo2 = TBaseHelper.compareTo(this.background_color, other.background_color)) != 0) {
            return compareTo2;
        }
        int compareTo18 = Boolean.valueOf(isSetBorder_color()).compareTo(Boolean.valueOf(other.isSetBorder_color()));
        if (compareTo18 != 0) {
            return compareTo18;
        }
        if (!isSetBorder_color() || (compareTo = TBaseHelper.compareTo(this.border_color, other.border_color)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<LavaQuest, _Fields> deepCopy2() {
        return new LavaQuest(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$LavaQuest$_Fields[field.ordinal()]) {
            case 1:
                return Integer.valueOf(getStatus());
            case 2:
                return Integer.valueOf(getCurrent());
            case 3:
                return Integer.valueOf(getTotal());
            case 4:
                return Integer.valueOf(getProps_remain_count());
            case 5:
                return Integer.valueOf(getRevival_coin_cost());
            case 6:
                return Long.valueOf(getEnd_time());
            case 7:
                return getIcon_img();
            case 8:
                return getBackground_color();
            case 9:
                return getBorder_color();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$LavaQuest$_Fields[field.ordinal()]) {
            case 1:
                return isSetStatus();
            case 2:
                return isSetCurrent();
            case 3:
                return isSetTotal();
            case 4:
                return isSetProps_remain_count();
            case 5:
                return isSetRevival_coin_cost();
            case 6:
                return isSetEnd_time();
            case 7:
                return isSetIcon_img();
            case 8:
                return isSetBackground_color();
            case 9:
                return isSetBorder_color();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$LavaQuest$_Fields[field.ordinal()]) {
            case 1:
                if (value != null) {
                    setStatus(((Integer) value).intValue());
                    break;
                } else {
                    unsetStatus();
                    break;
                }
            case 2:
                if (value != null) {
                    setCurrent(((Integer) value).intValue());
                    break;
                } else {
                    unsetCurrent();
                    break;
                }
            case 3:
                if (value != null) {
                    setTotal(((Integer) value).intValue());
                    break;
                } else {
                    unsetTotal();
                    break;
                }
            case 4:
                if (value != null) {
                    setProps_remain_count(((Integer) value).intValue());
                    break;
                } else {
                    unsetProps_remain_count();
                    break;
                }
            case 5:
                if (value != null) {
                    setRevival_coin_cost(((Integer) value).intValue());
                    break;
                } else {
                    unsetRevival_coin_cost();
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
                    setIcon_img((String) value);
                    break;
                } else {
                    unsetIcon_img();
                    break;
                }
            case 8:
                if (value != null) {
                    setBackground_color((String) value);
                    break;
                } else {
                    unsetBackground_color();
                    break;
                }
            case 9:
                if (value != null) {
                    setBorder_color((String) value);
                    break;
                } else {
                    unsetBorder_color();
                    break;
                }
        }
    }

    public LavaQuest(int status, int current, int total, int props_remain_count, int revival_coin_cost, long end_time, String icon_img, String background_color, String border_color) {
        this();
        this.status = status;
        setStatusIsSet(true);
        this.current = current;
        setCurrentIsSet(true);
        this.total = total;
        setTotalIsSet(true);
        this.props_remain_count = props_remain_count;
        setProps_remain_countIsSet(true);
        this.revival_coin_cost = revival_coin_cost;
        setRevival_coin_costIsSet(true);
        this.end_time = end_time;
        setEnd_timeIsSet(true);
        this.icon_img = icon_img;
        this.background_color = background_color;
        this.border_color = border_color;
    }

    public boolean equals(LavaQuest that) {
        if (that == null || this.status != that.status || this.current != that.current || this.total != that.total || this.props_remain_count != that.props_remain_count || this.revival_coin_cost != that.revival_coin_cost || this.end_time != that.end_time) {
            return false;
        }
        boolean isSetIcon_img = isSetIcon_img();
        boolean isSetIcon_img2 = that.isSetIcon_img();
        if ((isSetIcon_img || isSetIcon_img2) && !(isSetIcon_img && isSetIcon_img2 && this.icon_img.equals(that.icon_img))) {
            return false;
        }
        boolean isSetBackground_color = isSetBackground_color();
        boolean isSetBackground_color2 = that.isSetBackground_color();
        if ((isSetBackground_color || isSetBackground_color2) && !(isSetBackground_color && isSetBackground_color2 && this.background_color.equals(that.background_color))) {
            return false;
        }
        boolean isSetBorder_color = isSetBorder_color();
        boolean isSetBorder_color2 = that.isSetBorder_color();
        if (isSetBorder_color || isSetBorder_color2) {
            return isSetBorder_color && isSetBorder_color2 && this.border_color.equals(that.border_color);
        }
        return true;
    }

    public LavaQuest(LavaQuest other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        this.status = other.status;
        this.current = other.current;
        this.total = other.total;
        this.props_remain_count = other.props_remain_count;
        this.revival_coin_cost = other.revival_coin_cost;
        this.end_time = other.end_time;
        if (other.isSetIcon_img()) {
            this.icon_img = other.icon_img;
        }
        if (other.isSetBackground_color()) {
            this.background_color = other.background_color;
        }
        if (other.isSetBorder_color()) {
            this.border_color = other.border_color;
        }
    }
}

package com.baicizhan.online.user_study_api;

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
import org.apache.thrift.meta_data.StructMetaData;
import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.protocol.TField;
import org.apache.thrift.protocol.TList;
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
public class CreditCenter implements TBase<CreditCenter, _Fields>, Serializable, Cloneable, Comparable<CreditCenter> {
    private static final int __CREDIT_ISSET_ID = 1;
    private static final int __DAILY_INC_CREDIT_ISSET_ID = 2;
    private static final int __NEW_FLAG_ISSET_ID = 3;
    private static final int __SHOW_CREDIT_CENTER_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public int credit;
    public List<String> credit_item_img;
    public String credit_mall_url;
    public int daily_inc_credit;
    public int new_flag;
    private _Fields[] optionals;
    public int show_credit_center;
    public List<Task> task;
    private static final TStruct STRUCT_DESC = new TStruct("CreditCenter");
    private static final TField SHOW_CREDIT_CENTER_FIELD_DESC = new TField("show_credit_center", (byte) 8, 1);
    private static final TField CREDIT_FIELD_DESC = new TField("credit", (byte) 8, 2);
    private static final TField DAILY_INC_CREDIT_FIELD_DESC = new TField("daily_inc_credit", (byte) 8, 3);
    private static final TField CREDIT_ITEM_IMG_FIELD_DESC = new TField("credit_item_img", (byte) 15, 4);
    private static final TField NEW_FLAG_FIELD_DESC = new TField("new_flag", (byte) 8, 5);
    private static final TField CREDIT_MALL_URL_FIELD_DESC = new TField("credit_mall_url", (byte) 11, 6);
    private static final TField TASK_FIELD_DESC = new TField("task", (byte) 15, 7);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.user_study_api.CreditCenter$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_study_api$CreditCenter$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$user_study_api$CreditCenter$_Fields = iArr;
            try {
                iArr[_Fields.SHOW_CREDIT_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$CreditCenter$_Fields[_Fields.CREDIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$CreditCenter$_Fields[_Fields.DAILY_INC_CREDIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$CreditCenter$_Fields[_Fields.CREDIT_ITEM_IMG.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$CreditCenter$_Fields[_Fields.NEW_FLAG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$CreditCenter$_Fields[_Fields.CREDIT_MALL_URL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$CreditCenter$_Fields[_Fields.TASK.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class CreditCenterStandardScheme extends StandardScheme<CreditCenter> {
        private CreditCenterStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, CreditCenter struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    iprot.readStructEnd();
                    if (!struct.isSetShow_credit_center()) {
                        throw new TProtocolException("Required field 'show_credit_center' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetCredit()) {
                        throw new TProtocolException("Required field 'credit' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetDaily_inc_credit()) {
                        throw new TProtocolException("Required field 'daily_inc_credit' was not found in serialized data! Struct: " + toString());
                    }
                    if (struct.isSetNew_flag()) {
                        struct.validate();
                        return;
                    }
                    throw new TProtocolException("Required field 'new_flag' was not found in serialized data! Struct: " + toString());
                }
                int i11 = 0;
                switch (readFieldBegin.f77768id) {
                    case 1:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.show_credit_center = iprot.readI32();
                            struct.setShow_credit_centerIsSet(true);
                            break;
                        }
                    case 2:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.credit = iprot.readI32();
                            struct.setCreditIsSet(true);
                            break;
                        }
                    case 3:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.daily_inc_credit = iprot.readI32();
                            struct.setDaily_inc_creditIsSet(true);
                            break;
                        }
                    case 4:
                        if (b11 != 15) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            TList readListBegin = iprot.readListBegin();
                            struct.credit_item_img = new ArrayList(readListBegin.size);
                            while (i11 < readListBegin.size) {
                                struct.credit_item_img.add(iprot.readString());
                                i11++;
                            }
                            iprot.readListEnd();
                            struct.setCredit_item_imgIsSet(true);
                            break;
                        }
                    case 5:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.new_flag = iprot.readI32();
                            struct.setNew_flagIsSet(true);
                            break;
                        }
                    case 6:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.credit_mall_url = iprot.readString();
                            struct.setCredit_mall_urlIsSet(true);
                            break;
                        }
                    case 7:
                        if (b11 != 15) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            TList readListBegin2 = iprot.readListBegin();
                            struct.task = new ArrayList(readListBegin2.size);
                            while (i11 < readListBegin2.size) {
                                Task task = new Task();
                                task.read(iprot);
                                struct.task.add(task);
                                i11++;
                            }
                            iprot.readListEnd();
                            struct.setTaskIsSet(true);
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
        public void write(TProtocol oprot, CreditCenter struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(CreditCenter.STRUCT_DESC);
            oprot.writeFieldBegin(CreditCenter.SHOW_CREDIT_CENTER_FIELD_DESC);
            oprot.writeI32(struct.show_credit_center);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(CreditCenter.CREDIT_FIELD_DESC);
            oprot.writeI32(struct.credit);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(CreditCenter.DAILY_INC_CREDIT_FIELD_DESC);
            oprot.writeI32(struct.daily_inc_credit);
            oprot.writeFieldEnd();
            if (struct.credit_item_img != null) {
                oprot.writeFieldBegin(CreditCenter.CREDIT_ITEM_IMG_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 11, struct.credit_item_img.size()));
                Iterator<String> it = struct.credit_item_img.iterator();
                while (it.hasNext()) {
                    oprot.writeString(it.next());
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(CreditCenter.NEW_FLAG_FIELD_DESC);
            oprot.writeI32(struct.new_flag);
            oprot.writeFieldEnd();
            if (struct.credit_mall_url != null) {
                oprot.writeFieldBegin(CreditCenter.CREDIT_MALL_URL_FIELD_DESC);
                oprot.writeString(struct.credit_mall_url);
                oprot.writeFieldEnd();
            }
            if (struct.task != null && struct.isSetTask()) {
                oprot.writeFieldBegin(CreditCenter.TASK_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 12, struct.task.size()));
                Iterator<Task> it2 = struct.task.iterator();
                while (it2.hasNext()) {
                    it2.next().write(oprot);
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class CreditCenterStandardSchemeFactory implements SchemeFactory {
        private CreditCenterStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public CreditCenterStandardScheme getScheme() {
            return new CreditCenterStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class CreditCenterTupleScheme extends TupleScheme<CreditCenter> {
        private CreditCenterTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, CreditCenter struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.show_credit_center = tTupleProtocol.readI32();
            struct.setShow_credit_centerIsSet(true);
            struct.credit = tTupleProtocol.readI32();
            struct.setCreditIsSet(true);
            struct.daily_inc_credit = tTupleProtocol.readI32();
            struct.setDaily_inc_creditIsSet(true);
            TList tList = new TList((byte) 11, tTupleProtocol.readI32());
            struct.credit_item_img = new ArrayList(tList.size);
            for (int i11 = 0; i11 < tList.size; i11++) {
                struct.credit_item_img.add(tTupleProtocol.readString());
            }
            struct.setCredit_item_imgIsSet(true);
            struct.new_flag = tTupleProtocol.readI32();
            struct.setNew_flagIsSet(true);
            struct.credit_mall_url = tTupleProtocol.readString();
            struct.setCredit_mall_urlIsSet(true);
            if (tTupleProtocol.readBitSet(1).get(0)) {
                TList tList2 = new TList((byte) 12, tTupleProtocol.readI32());
                struct.task = new ArrayList(tList2.size);
                for (int i12 = 0; i12 < tList2.size; i12++) {
                    Task task = new Task();
                    task.read(tTupleProtocol);
                    struct.task.add(task);
                }
                struct.setTaskIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, CreditCenter struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.show_credit_center);
            tTupleProtocol.writeI32(struct.credit);
            tTupleProtocol.writeI32(struct.daily_inc_credit);
            tTupleProtocol.writeI32(struct.credit_item_img.size());
            Iterator<String> it = struct.credit_item_img.iterator();
            while (it.hasNext()) {
                tTupleProtocol.writeString(it.next());
            }
            tTupleProtocol.writeI32(struct.new_flag);
            tTupleProtocol.writeString(struct.credit_mall_url);
            BitSet bitSet = new BitSet();
            if (struct.isSetTask()) {
                bitSet.set(0);
            }
            tTupleProtocol.writeBitSet(bitSet, 1);
            if (struct.isSetTask()) {
                tTupleProtocol.writeI32(struct.task.size());
                Iterator<Task> it2 = struct.task.iterator();
                while (it2.hasNext()) {
                    it2.next().write(tTupleProtocol);
                }
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class CreditCenterTupleSchemeFactory implements SchemeFactory {
        private CreditCenterTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public CreditCenterTupleScheme getScheme() {
            return new CreditCenterTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        SHOW_CREDIT_CENTER(1, "show_credit_center"),
        CREDIT(2, "credit"),
        DAILY_INC_CREDIT(3, "daily_inc_credit"),
        CREDIT_ITEM_IMG(4, "credit_item_img"),
        NEW_FLAG(5, "new_flag"),
        CREDIT_MALL_URL(6, "credit_mall_url"),
        TASK(7, "task");

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
                    return SHOW_CREDIT_CENTER;
                case 2:
                    return CREDIT;
                case 3:
                    return DAILY_INC_CREDIT;
                case 4:
                    return CREDIT_ITEM_IMG;
                case 5:
                    return NEW_FLAG;
                case 6:
                    return CREDIT_MALL_URL;
                case 7:
                    return TASK;
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
        hashMap.put(StandardScheme.class, new CreditCenterStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new CreditCenterTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.SHOW_CREDIT_CENTER, (_Fields) new FieldMetaData("show_credit_center", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.CREDIT, (_Fields) new FieldMetaData("credit", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.DAILY_INC_CREDIT, (_Fields) new FieldMetaData("daily_inc_credit", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.CREDIT_ITEM_IMG, (_Fields) new FieldMetaData("credit_item_img", (byte) 1, new ListMetaData((byte) 15, new FieldValueMetaData((byte) 11))));
        enumMap.put((EnumMap) _Fields.NEW_FLAG, (_Fields) new FieldMetaData("new_flag", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.CREDIT_MALL_URL, (_Fields) new FieldMetaData("credit_mall_url", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.TASK, (_Fields) new FieldMetaData("task", (byte) 2, new ListMetaData((byte) 15, new StructMetaData((byte) 12, Task.class))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(CreditCenter.class, unmodifiableMap);
    }

    public CreditCenter() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.TASK};
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

    public void addToCredit_item_img(String elem) {
        if (this.credit_item_img == null) {
            this.credit_item_img = new ArrayList();
        }
        this.credit_item_img.add(elem);
    }

    public void addToTask(Task elem) {
        if (this.task == null) {
            this.task = new ArrayList();
        }
        this.task.add(elem);
    }

    @Override // org.apache.thrift.TBase
    public void clear() {
        setShow_credit_centerIsSet(false);
        this.show_credit_center = 0;
        setCreditIsSet(false);
        this.credit = 0;
        setDaily_inc_creditIsSet(false);
        this.daily_inc_credit = 0;
        this.credit_item_img = null;
        setNew_flagIsSet(false);
        this.new_flag = 0;
        this.credit_mall_url = null;
        this.task = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof CreditCenter)) {
            return equals((CreditCenter) that);
        }
        return false;
    }

    public int getCredit() {
        return this.credit;
    }

    public List<String> getCredit_item_img() {
        return this.credit_item_img;
    }

    public Iterator<String> getCredit_item_imgIterator() {
        List<String> list = this.credit_item_img;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getCredit_item_imgSize() {
        List<String> list = this.credit_item_img;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public String getCredit_mall_url() {
        return this.credit_mall_url;
    }

    public int getDaily_inc_credit() {
        return this.daily_inc_credit;
    }

    public int getNew_flag() {
        return this.new_flag;
    }

    public int getShow_credit_center() {
        return this.show_credit_center;
    }

    public List<Task> getTask() {
        return this.task;
    }

    public Iterator<Task> getTaskIterator() {
        List<Task> list = this.task;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getTaskSize() {
        List<Task> list = this.task;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetCredit() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetCredit_item_img() {
        return this.credit_item_img != null;
    }

    public boolean isSetCredit_mall_url() {
        return this.credit_mall_url != null;
    }

    public boolean isSetDaily_inc_credit() {
        return EncodingUtils.testBit(this.__isset_bitfield, 2);
    }

    public boolean isSetNew_flag() {
        return EncodingUtils.testBit(this.__isset_bitfield, 3);
    }

    public boolean isSetShow_credit_center() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetTask() {
        return this.task != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public CreditCenter setCredit(int credit) {
        this.credit = credit;
        setCreditIsSet(true);
        return this;
    }

    public void setCreditIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public CreditCenter setCredit_item_img(List<String> credit_item_img) {
        this.credit_item_img = credit_item_img;
        return this;
    }

    public void setCredit_item_imgIsSet(boolean value) {
        if (value) {
            return;
        }
        this.credit_item_img = null;
    }

    public CreditCenter setCredit_mall_url(String credit_mall_url) {
        this.credit_mall_url = credit_mall_url;
        return this;
    }

    public void setCredit_mall_urlIsSet(boolean value) {
        if (value) {
            return;
        }
        this.credit_mall_url = null;
    }

    public CreditCenter setDaily_inc_credit(int daily_inc_credit) {
        this.daily_inc_credit = daily_inc_credit;
        setDaily_inc_creditIsSet(true);
        return this;
    }

    public void setDaily_inc_creditIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 2, value);
    }

    public CreditCenter setNew_flag(int new_flag) {
        this.new_flag = new_flag;
        setNew_flagIsSet(true);
        return this;
    }

    public void setNew_flagIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 3, value);
    }

    public CreditCenter setShow_credit_center(int show_credit_center) {
        this.show_credit_center = show_credit_center;
        setShow_credit_centerIsSet(true);
        return this;
    }

    public void setShow_credit_centerIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public CreditCenter setTask(List<Task> task) {
        this.task = task;
        return this;
    }

    public void setTaskIsSet(boolean value) {
        if (value) {
            return;
        }
        this.task = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("CreditCenter(");
        sb2.append("show_credit_center:");
        sb2.append(this.show_credit_center);
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("credit:");
        sb2.append(this.credit);
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("daily_inc_credit:");
        sb2.append(this.daily_inc_credit);
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("credit_item_img:");
        List<String> list = this.credit_item_img;
        if (list == null) {
            sb2.append("null");
        } else {
            sb2.append(list);
        }
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("new_flag:");
        sb2.append(this.new_flag);
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("credit_mall_url:");
        String str = this.credit_mall_url;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        if (isSetTask()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("task:");
            List<Task> list2 = this.task;
            if (list2 == null) {
                sb2.append("null");
            } else {
                sb2.append(list2);
            }
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetCredit() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetCredit_item_img() {
        this.credit_item_img = null;
    }

    public void unsetCredit_mall_url() {
        this.credit_mall_url = null;
    }

    public void unsetDaily_inc_credit() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 2);
    }

    public void unsetNew_flag() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 3);
    }

    public void unsetShow_credit_center() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetTask() {
        this.task = null;
    }

    public void validate() throws TException {
        if (this.credit_item_img == null) {
            throw new TProtocolException("Required field 'credit_item_img' was not present! Struct: " + toString());
        }
        if (this.credit_mall_url != null) {
            return;
        }
        throw new TProtocolException("Required field 'credit_mall_url' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(CreditCenter other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        int compareTo5;
        int compareTo6;
        int compareTo7;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo8 = Boolean.valueOf(isSetShow_credit_center()).compareTo(Boolean.valueOf(other.isSetShow_credit_center()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (isSetShow_credit_center() && (compareTo7 = TBaseHelper.compareTo(this.show_credit_center, other.show_credit_center)) != 0) {
            return compareTo7;
        }
        int compareTo9 = Boolean.valueOf(isSetCredit()).compareTo(Boolean.valueOf(other.isSetCredit()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (isSetCredit() && (compareTo6 = TBaseHelper.compareTo(this.credit, other.credit)) != 0) {
            return compareTo6;
        }
        int compareTo10 = Boolean.valueOf(isSetDaily_inc_credit()).compareTo(Boolean.valueOf(other.isSetDaily_inc_credit()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (isSetDaily_inc_credit() && (compareTo5 = TBaseHelper.compareTo(this.daily_inc_credit, other.daily_inc_credit)) != 0) {
            return compareTo5;
        }
        int compareTo11 = Boolean.valueOf(isSetCredit_item_img()).compareTo(Boolean.valueOf(other.isSetCredit_item_img()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (isSetCredit_item_img() && (compareTo4 = TBaseHelper.compareTo((List) this.credit_item_img, (List) other.credit_item_img)) != 0) {
            return compareTo4;
        }
        int compareTo12 = Boolean.valueOf(isSetNew_flag()).compareTo(Boolean.valueOf(other.isSetNew_flag()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (isSetNew_flag() && (compareTo3 = TBaseHelper.compareTo(this.new_flag, other.new_flag)) != 0) {
            return compareTo3;
        }
        int compareTo13 = Boolean.valueOf(isSetCredit_mall_url()).compareTo(Boolean.valueOf(other.isSetCredit_mall_url()));
        if (compareTo13 != 0) {
            return compareTo13;
        }
        if (isSetCredit_mall_url() && (compareTo2 = TBaseHelper.compareTo(this.credit_mall_url, other.credit_mall_url)) != 0) {
            return compareTo2;
        }
        int compareTo14 = Boolean.valueOf(isSetTask()).compareTo(Boolean.valueOf(other.isSetTask()));
        if (compareTo14 != 0) {
            return compareTo14;
        }
        if (!isSetTask() || (compareTo = TBaseHelper.compareTo((List) this.task, (List) other.task)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<CreditCenter, _Fields> deepCopy2() {
        return new CreditCenter(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$CreditCenter$_Fields[field.ordinal()]) {
            case 1:
                return Integer.valueOf(getShow_credit_center());
            case 2:
                return Integer.valueOf(getCredit());
            case 3:
                return Integer.valueOf(getDaily_inc_credit());
            case 4:
                return getCredit_item_img();
            case 5:
                return Integer.valueOf(getNew_flag());
            case 6:
                return getCredit_mall_url();
            case 7:
                return getTask();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$CreditCenter$_Fields[field.ordinal()]) {
            case 1:
                return isSetShow_credit_center();
            case 2:
                return isSetCredit();
            case 3:
                return isSetDaily_inc_credit();
            case 4:
                return isSetCredit_item_img();
            case 5:
                return isSetNew_flag();
            case 6:
                return isSetCredit_mall_url();
            case 7:
                return isSetTask();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$CreditCenter$_Fields[field.ordinal()]) {
            case 1:
                if (value != null) {
                    setShow_credit_center(((Integer) value).intValue());
                    break;
                } else {
                    unsetShow_credit_center();
                    break;
                }
            case 2:
                if (value != null) {
                    setCredit(((Integer) value).intValue());
                    break;
                } else {
                    unsetCredit();
                    break;
                }
            case 3:
                if (value != null) {
                    setDaily_inc_credit(((Integer) value).intValue());
                    break;
                } else {
                    unsetDaily_inc_credit();
                    break;
                }
            case 4:
                if (value != null) {
                    setCredit_item_img((List) value);
                    break;
                } else {
                    unsetCredit_item_img();
                    break;
                }
            case 5:
                if (value != null) {
                    setNew_flag(((Integer) value).intValue());
                    break;
                } else {
                    unsetNew_flag();
                    break;
                }
            case 6:
                if (value != null) {
                    setCredit_mall_url((String) value);
                    break;
                } else {
                    unsetCredit_mall_url();
                    break;
                }
            case 7:
                if (value != null) {
                    setTask((List) value);
                    break;
                } else {
                    unsetTask();
                    break;
                }
        }
    }

    public boolean equals(CreditCenter that) {
        if (that == null || this.show_credit_center != that.show_credit_center || this.credit != that.credit || this.daily_inc_credit != that.daily_inc_credit) {
            return false;
        }
        boolean isSetCredit_item_img = isSetCredit_item_img();
        boolean isSetCredit_item_img2 = that.isSetCredit_item_img();
        if (((isSetCredit_item_img || isSetCredit_item_img2) && !(isSetCredit_item_img && isSetCredit_item_img2 && this.credit_item_img.equals(that.credit_item_img))) || this.new_flag != that.new_flag) {
            return false;
        }
        boolean isSetCredit_mall_url = isSetCredit_mall_url();
        boolean isSetCredit_mall_url2 = that.isSetCredit_mall_url();
        if ((isSetCredit_mall_url || isSetCredit_mall_url2) && !(isSetCredit_mall_url && isSetCredit_mall_url2 && this.credit_mall_url.equals(that.credit_mall_url))) {
            return false;
        }
        boolean isSetTask = isSetTask();
        boolean isSetTask2 = that.isSetTask();
        if (isSetTask || isSetTask2) {
            return isSetTask && isSetTask2 && this.task.equals(that.task);
        }
        return true;
    }

    public CreditCenter(int show_credit_center, int credit, int daily_inc_credit, List<String> credit_item_img, int new_flag, String credit_mall_url) {
        this();
        this.show_credit_center = show_credit_center;
        setShow_credit_centerIsSet(true);
        this.credit = credit;
        setCreditIsSet(true);
        this.daily_inc_credit = daily_inc_credit;
        setDaily_inc_creditIsSet(true);
        this.credit_item_img = credit_item_img;
        this.new_flag = new_flag;
        setNew_flagIsSet(true);
        this.credit_mall_url = credit_mall_url;
    }

    public CreditCenter(CreditCenter other) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.TASK};
        this.__isset_bitfield = other.__isset_bitfield;
        this.show_credit_center = other.show_credit_center;
        this.credit = other.credit;
        this.daily_inc_credit = other.daily_inc_credit;
        if (other.isSetCredit_item_img()) {
            this.credit_item_img = new ArrayList(other.credit_item_img);
        }
        this.new_flag = other.new_flag;
        if (other.isSetCredit_mall_url()) {
            this.credit_mall_url = other.credit_mall_url;
        }
        if (other.isSetTask()) {
            ArrayList arrayList = new ArrayList(other.task.size());
            Iterator<Task> it = other.task.iterator();
            while (it.hasNext()) {
                arrayList.add(new Task(it.next()));
            }
            this.task = arrayList;
        }
    }
}

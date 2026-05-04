package com.baicizhan.online.ad_property;

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
public class AdExtraResp implements TBase<AdExtraResp, _Fields>, Serializable, Cloneable, Comparable<AdExtraResp> {
    private static final int __PRICE_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public List<String> click_trackers;
    public List<String> imp_trackers;
    public AdLunchApp launch_app;
    public List<String> launch_app_trackers;
    public AdLunchWechatProgram launch_wechat_program;
    public List<String> launch_wechat_program_trackers;
    private _Fields[] optionals;
    public int price;
    private static final TStruct STRUCT_DESC = new TStruct("AdExtraResp");
    private static final TField LAUNCH_WECHAT_PROGRAM_FIELD_DESC = new TField("launch_wechat_program", (byte) 12, 1);
    private static final TField LAUNCH_APP_FIELD_DESC = new TField("launch_app", (byte) 12, 2);
    private static final TField IMP_TRACKERS_FIELD_DESC = new TField("imp_trackers", (byte) 15, 3);
    private static final TField CLICK_TRACKERS_FIELD_DESC = new TField("click_trackers", (byte) 15, 4);
    private static final TField LAUNCH_WECHAT_PROGRAM_TRACKERS_FIELD_DESC = new TField("launch_wechat_program_trackers", (byte) 15, 5);
    private static final TField LAUNCH_APP_TRACKERS_FIELD_DESC = new TField("launch_app_trackers", (byte) 15, 6);
    private static final TField PRICE_FIELD_DESC = new TField("price", (byte) 8, 7);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.ad_property.AdExtraResp$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$ad_property$AdExtraResp$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$ad_property$AdExtraResp$_Fields = iArr;
            try {
                iArr[_Fields.LAUNCH_WECHAT_PROGRAM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$ad_property$AdExtraResp$_Fields[_Fields.LAUNCH_APP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$ad_property$AdExtraResp$_Fields[_Fields.IMP_TRACKERS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$ad_property$AdExtraResp$_Fields[_Fields.CLICK_TRACKERS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$ad_property$AdExtraResp$_Fields[_Fields.LAUNCH_WECHAT_PROGRAM_TRACKERS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$baicizhan$online$ad_property$AdExtraResp$_Fields[_Fields.LAUNCH_APP_TRACKERS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$baicizhan$online$ad_property$AdExtraResp$_Fields[_Fields.PRICE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AdExtraRespStandardScheme extends StandardScheme<AdExtraResp> {
        private AdExtraRespStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, AdExtraResp struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    iprot.readStructEnd();
                    struct.validate();
                    return;
                }
                int i11 = 0;
                switch (readFieldBegin.f77768id) {
                    case 1:
                        if (b11 != 12) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            AdLunchWechatProgram adLunchWechatProgram = new AdLunchWechatProgram();
                            struct.launch_wechat_program = adLunchWechatProgram;
                            adLunchWechatProgram.read(iprot);
                            struct.setLaunch_wechat_programIsSet(true);
                            break;
                        }
                    case 2:
                        if (b11 != 12) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            AdLunchApp adLunchApp = new AdLunchApp();
                            struct.launch_app = adLunchApp;
                            adLunchApp.read(iprot);
                            struct.setLaunch_appIsSet(true);
                            break;
                        }
                    case 3:
                        if (b11 != 15) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            TList readListBegin = iprot.readListBegin();
                            struct.imp_trackers = new ArrayList(readListBegin.size);
                            while (i11 < readListBegin.size) {
                                struct.imp_trackers.add(iprot.readString());
                                i11++;
                            }
                            iprot.readListEnd();
                            struct.setImp_trackersIsSet(true);
                            break;
                        }
                    case 4:
                        if (b11 != 15) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            TList readListBegin2 = iprot.readListBegin();
                            struct.click_trackers = new ArrayList(readListBegin2.size);
                            while (i11 < readListBegin2.size) {
                                struct.click_trackers.add(iprot.readString());
                                i11++;
                            }
                            iprot.readListEnd();
                            struct.setClick_trackersIsSet(true);
                            break;
                        }
                    case 5:
                        if (b11 != 15) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            TList readListBegin3 = iprot.readListBegin();
                            struct.launch_wechat_program_trackers = new ArrayList(readListBegin3.size);
                            while (i11 < readListBegin3.size) {
                                struct.launch_wechat_program_trackers.add(iprot.readString());
                                i11++;
                            }
                            iprot.readListEnd();
                            struct.setLaunch_wechat_program_trackersIsSet(true);
                            break;
                        }
                    case 6:
                        if (b11 != 15) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            TList readListBegin4 = iprot.readListBegin();
                            struct.launch_app_trackers = new ArrayList(readListBegin4.size);
                            while (i11 < readListBegin4.size) {
                                struct.launch_app_trackers.add(iprot.readString());
                                i11++;
                            }
                            iprot.readListEnd();
                            struct.setLaunch_app_trackersIsSet(true);
                            break;
                        }
                    case 7:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.price = iprot.readI32();
                            struct.setPriceIsSet(true);
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
        public void write(TProtocol oprot, AdExtraResp struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(AdExtraResp.STRUCT_DESC);
            if (struct.launch_wechat_program != null && struct.isSetLaunch_wechat_program()) {
                oprot.writeFieldBegin(AdExtraResp.LAUNCH_WECHAT_PROGRAM_FIELD_DESC);
                struct.launch_wechat_program.write(oprot);
                oprot.writeFieldEnd();
            }
            if (struct.launch_app != null && struct.isSetLaunch_app()) {
                oprot.writeFieldBegin(AdExtraResp.LAUNCH_APP_FIELD_DESC);
                struct.launch_app.write(oprot);
                oprot.writeFieldEnd();
            }
            if (struct.imp_trackers != null && struct.isSetImp_trackers()) {
                oprot.writeFieldBegin(AdExtraResp.IMP_TRACKERS_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 11, struct.imp_trackers.size()));
                Iterator<String> it = struct.imp_trackers.iterator();
                while (it.hasNext()) {
                    oprot.writeString(it.next());
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            if (struct.click_trackers != null && struct.isSetClick_trackers()) {
                oprot.writeFieldBegin(AdExtraResp.CLICK_TRACKERS_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 11, struct.click_trackers.size()));
                Iterator<String> it2 = struct.click_trackers.iterator();
                while (it2.hasNext()) {
                    oprot.writeString(it2.next());
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            if (struct.launch_wechat_program_trackers != null && struct.isSetLaunch_wechat_program_trackers()) {
                oprot.writeFieldBegin(AdExtraResp.LAUNCH_WECHAT_PROGRAM_TRACKERS_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 11, struct.launch_wechat_program_trackers.size()));
                Iterator<String> it3 = struct.launch_wechat_program_trackers.iterator();
                while (it3.hasNext()) {
                    oprot.writeString(it3.next());
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            if (struct.launch_app_trackers != null && struct.isSetLaunch_app_trackers()) {
                oprot.writeFieldBegin(AdExtraResp.LAUNCH_APP_TRACKERS_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 11, struct.launch_app_trackers.size()));
                Iterator<String> it4 = struct.launch_app_trackers.iterator();
                while (it4.hasNext()) {
                    oprot.writeString(it4.next());
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            if (struct.isSetPrice()) {
                oprot.writeFieldBegin(AdExtraResp.PRICE_FIELD_DESC);
                oprot.writeI32(struct.price);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AdExtraRespStandardSchemeFactory implements SchemeFactory {
        private AdExtraRespStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public AdExtraRespStandardScheme getScheme() {
            return new AdExtraRespStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AdExtraRespTupleScheme extends TupleScheme<AdExtraResp> {
        private AdExtraRespTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, AdExtraResp struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            BitSet readBitSet = tTupleProtocol.readBitSet(7);
            if (readBitSet.get(0)) {
                AdLunchWechatProgram adLunchWechatProgram = new AdLunchWechatProgram();
                struct.launch_wechat_program = adLunchWechatProgram;
                adLunchWechatProgram.read(tTupleProtocol);
                struct.setLaunch_wechat_programIsSet(true);
            }
            if (readBitSet.get(1)) {
                AdLunchApp adLunchApp = new AdLunchApp();
                struct.launch_app = adLunchApp;
                adLunchApp.read(tTupleProtocol);
                struct.setLaunch_appIsSet(true);
            }
            if (readBitSet.get(2)) {
                TList tList = new TList((byte) 11, tTupleProtocol.readI32());
                struct.imp_trackers = new ArrayList(tList.size);
                for (int i11 = 0; i11 < tList.size; i11++) {
                    struct.imp_trackers.add(tTupleProtocol.readString());
                }
                struct.setImp_trackersIsSet(true);
            }
            if (readBitSet.get(3)) {
                TList tList2 = new TList((byte) 11, tTupleProtocol.readI32());
                struct.click_trackers = new ArrayList(tList2.size);
                for (int i12 = 0; i12 < tList2.size; i12++) {
                    struct.click_trackers.add(tTupleProtocol.readString());
                }
                struct.setClick_trackersIsSet(true);
            }
            if (readBitSet.get(4)) {
                TList tList3 = new TList((byte) 11, tTupleProtocol.readI32());
                struct.launch_wechat_program_trackers = new ArrayList(tList3.size);
                for (int i13 = 0; i13 < tList3.size; i13++) {
                    struct.launch_wechat_program_trackers.add(tTupleProtocol.readString());
                }
                struct.setLaunch_wechat_program_trackersIsSet(true);
            }
            if (readBitSet.get(5)) {
                TList tList4 = new TList((byte) 11, tTupleProtocol.readI32());
                struct.launch_app_trackers = new ArrayList(tList4.size);
                for (int i14 = 0; i14 < tList4.size; i14++) {
                    struct.launch_app_trackers.add(tTupleProtocol.readString());
                }
                struct.setLaunch_app_trackersIsSet(true);
            }
            if (readBitSet.get(6)) {
                struct.price = tTupleProtocol.readI32();
                struct.setPriceIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, AdExtraResp struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            BitSet bitSet = new BitSet();
            if (struct.isSetLaunch_wechat_program()) {
                bitSet.set(0);
            }
            if (struct.isSetLaunch_app()) {
                bitSet.set(1);
            }
            if (struct.isSetImp_trackers()) {
                bitSet.set(2);
            }
            if (struct.isSetClick_trackers()) {
                bitSet.set(3);
            }
            if (struct.isSetLaunch_wechat_program_trackers()) {
                bitSet.set(4);
            }
            if (struct.isSetLaunch_app_trackers()) {
                bitSet.set(5);
            }
            if (struct.isSetPrice()) {
                bitSet.set(6);
            }
            tTupleProtocol.writeBitSet(bitSet, 7);
            if (struct.isSetLaunch_wechat_program()) {
                struct.launch_wechat_program.write(tTupleProtocol);
            }
            if (struct.isSetLaunch_app()) {
                struct.launch_app.write(tTupleProtocol);
            }
            if (struct.isSetImp_trackers()) {
                tTupleProtocol.writeI32(struct.imp_trackers.size());
                Iterator<String> it = struct.imp_trackers.iterator();
                while (it.hasNext()) {
                    tTupleProtocol.writeString(it.next());
                }
            }
            if (struct.isSetClick_trackers()) {
                tTupleProtocol.writeI32(struct.click_trackers.size());
                Iterator<String> it2 = struct.click_trackers.iterator();
                while (it2.hasNext()) {
                    tTupleProtocol.writeString(it2.next());
                }
            }
            if (struct.isSetLaunch_wechat_program_trackers()) {
                tTupleProtocol.writeI32(struct.launch_wechat_program_trackers.size());
                Iterator<String> it3 = struct.launch_wechat_program_trackers.iterator();
                while (it3.hasNext()) {
                    tTupleProtocol.writeString(it3.next());
                }
            }
            if (struct.isSetLaunch_app_trackers()) {
                tTupleProtocol.writeI32(struct.launch_app_trackers.size());
                Iterator<String> it4 = struct.launch_app_trackers.iterator();
                while (it4.hasNext()) {
                    tTupleProtocol.writeString(it4.next());
                }
            }
            if (struct.isSetPrice()) {
                tTupleProtocol.writeI32(struct.price);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AdExtraRespTupleSchemeFactory implements SchemeFactory {
        private AdExtraRespTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public AdExtraRespTupleScheme getScheme() {
            return new AdExtraRespTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        LAUNCH_WECHAT_PROGRAM(1, "launch_wechat_program"),
        LAUNCH_APP(2, "launch_app"),
        IMP_TRACKERS(3, "imp_trackers"),
        CLICK_TRACKERS(4, "click_trackers"),
        LAUNCH_WECHAT_PROGRAM_TRACKERS(5, "launch_wechat_program_trackers"),
        LAUNCH_APP_TRACKERS(6, "launch_app_trackers"),
        PRICE(7, "price");

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
                    return LAUNCH_WECHAT_PROGRAM;
                case 2:
                    return LAUNCH_APP;
                case 3:
                    return IMP_TRACKERS;
                case 4:
                    return CLICK_TRACKERS;
                case 5:
                    return LAUNCH_WECHAT_PROGRAM_TRACKERS;
                case 6:
                    return LAUNCH_APP_TRACKERS;
                case 7:
                    return PRICE;
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
        hashMap.put(StandardScheme.class, new AdExtraRespStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new AdExtraRespTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.LAUNCH_WECHAT_PROGRAM, (_Fields) new FieldMetaData("launch_wechat_program", (byte) 2, new StructMetaData((byte) 12, AdLunchWechatProgram.class)));
        enumMap.put((EnumMap) _Fields.LAUNCH_APP, (_Fields) new FieldMetaData("launch_app", (byte) 2, new StructMetaData((byte) 12, AdLunchApp.class)));
        enumMap.put((EnumMap) _Fields.IMP_TRACKERS, (_Fields) new FieldMetaData("imp_trackers", (byte) 2, new ListMetaData((byte) 15, new FieldValueMetaData((byte) 11))));
        enumMap.put((EnumMap) _Fields.CLICK_TRACKERS, (_Fields) new FieldMetaData("click_trackers", (byte) 2, new ListMetaData((byte) 15, new FieldValueMetaData((byte) 11))));
        enumMap.put((EnumMap) _Fields.LAUNCH_WECHAT_PROGRAM_TRACKERS, (_Fields) new FieldMetaData("launch_wechat_program_trackers", (byte) 2, new ListMetaData((byte) 15, new FieldValueMetaData((byte) 11))));
        enumMap.put((EnumMap) _Fields.LAUNCH_APP_TRACKERS, (_Fields) new FieldMetaData("launch_app_trackers", (byte) 2, new ListMetaData((byte) 15, new FieldValueMetaData((byte) 11))));
        enumMap.put((EnumMap) _Fields.PRICE, (_Fields) new FieldMetaData("price", (byte) 2, new FieldValueMetaData((byte) 8)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(AdExtraResp.class, unmodifiableMap);
    }

    public AdExtraResp() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.LAUNCH_WECHAT_PROGRAM, _Fields.LAUNCH_APP, _Fields.IMP_TRACKERS, _Fields.CLICK_TRACKERS, _Fields.LAUNCH_WECHAT_PROGRAM_TRACKERS, _Fields.LAUNCH_APP_TRACKERS, _Fields.PRICE};
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

    public void addToClick_trackers(String elem) {
        if (this.click_trackers == null) {
            this.click_trackers = new ArrayList();
        }
        this.click_trackers.add(elem);
    }

    public void addToImp_trackers(String elem) {
        if (this.imp_trackers == null) {
            this.imp_trackers = new ArrayList();
        }
        this.imp_trackers.add(elem);
    }

    public void addToLaunch_app_trackers(String elem) {
        if (this.launch_app_trackers == null) {
            this.launch_app_trackers = new ArrayList();
        }
        this.launch_app_trackers.add(elem);
    }

    public void addToLaunch_wechat_program_trackers(String elem) {
        if (this.launch_wechat_program_trackers == null) {
            this.launch_wechat_program_trackers = new ArrayList();
        }
        this.launch_wechat_program_trackers.add(elem);
    }

    @Override // org.apache.thrift.TBase
    public void clear() {
        this.launch_wechat_program = null;
        this.launch_app = null;
        this.imp_trackers = null;
        this.click_trackers = null;
        this.launch_wechat_program_trackers = null;
        this.launch_app_trackers = null;
        setPriceIsSet(false);
        this.price = 0;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof AdExtraResp)) {
            return equals((AdExtraResp) that);
        }
        return false;
    }

    public List<String> getClick_trackers() {
        return this.click_trackers;
    }

    public Iterator<String> getClick_trackersIterator() {
        List<String> list = this.click_trackers;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getClick_trackersSize() {
        List<String> list = this.click_trackers;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public List<String> getImp_trackers() {
        return this.imp_trackers;
    }

    public Iterator<String> getImp_trackersIterator() {
        List<String> list = this.imp_trackers;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getImp_trackersSize() {
        List<String> list = this.imp_trackers;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public AdLunchApp getLaunch_app() {
        return this.launch_app;
    }

    public List<String> getLaunch_app_trackers() {
        return this.launch_app_trackers;
    }

    public Iterator<String> getLaunch_app_trackersIterator() {
        List<String> list = this.launch_app_trackers;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getLaunch_app_trackersSize() {
        List<String> list = this.launch_app_trackers;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public AdLunchWechatProgram getLaunch_wechat_program() {
        return this.launch_wechat_program;
    }

    public List<String> getLaunch_wechat_program_trackers() {
        return this.launch_wechat_program_trackers;
    }

    public Iterator<String> getLaunch_wechat_program_trackersIterator() {
        List<String> list = this.launch_wechat_program_trackers;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getLaunch_wechat_program_trackersSize() {
        List<String> list = this.launch_wechat_program_trackers;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public int getPrice() {
        return this.price;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetClick_trackers() {
        return this.click_trackers != null;
    }

    public boolean isSetImp_trackers() {
        return this.imp_trackers != null;
    }

    public boolean isSetLaunch_app() {
        return this.launch_app != null;
    }

    public boolean isSetLaunch_app_trackers() {
        return this.launch_app_trackers != null;
    }

    public boolean isSetLaunch_wechat_program() {
        return this.launch_wechat_program != null;
    }

    public boolean isSetLaunch_wechat_program_trackers() {
        return this.launch_wechat_program_trackers != null;
    }

    public boolean isSetPrice() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public AdExtraResp setClick_trackers(List<String> click_trackers) {
        this.click_trackers = click_trackers;
        return this;
    }

    public void setClick_trackersIsSet(boolean value) {
        if (value) {
            return;
        }
        this.click_trackers = null;
    }

    public AdExtraResp setImp_trackers(List<String> imp_trackers) {
        this.imp_trackers = imp_trackers;
        return this;
    }

    public void setImp_trackersIsSet(boolean value) {
        if (value) {
            return;
        }
        this.imp_trackers = null;
    }

    public AdExtraResp setLaunch_app(AdLunchApp launch_app) {
        this.launch_app = launch_app;
        return this;
    }

    public void setLaunch_appIsSet(boolean value) {
        if (value) {
            return;
        }
        this.launch_app = null;
    }

    public AdExtraResp setLaunch_app_trackers(List<String> launch_app_trackers) {
        this.launch_app_trackers = launch_app_trackers;
        return this;
    }

    public void setLaunch_app_trackersIsSet(boolean value) {
        if (value) {
            return;
        }
        this.launch_app_trackers = null;
    }

    public AdExtraResp setLaunch_wechat_program(AdLunchWechatProgram launch_wechat_program) {
        this.launch_wechat_program = launch_wechat_program;
        return this;
    }

    public void setLaunch_wechat_programIsSet(boolean value) {
        if (value) {
            return;
        }
        this.launch_wechat_program = null;
    }

    public AdExtraResp setLaunch_wechat_program_trackers(List<String> launch_wechat_program_trackers) {
        this.launch_wechat_program_trackers = launch_wechat_program_trackers;
        return this;
    }

    public void setLaunch_wechat_program_trackersIsSet(boolean value) {
        if (value) {
            return;
        }
        this.launch_wechat_program_trackers = null;
    }

    public AdExtraResp setPrice(int price) {
        this.price = price;
        setPriceIsSet(true);
        return this;
    }

    public void setPriceIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public String toString() {
        boolean z11;
        StringBuilder sb2 = new StringBuilder("AdExtraResp(");
        boolean z12 = false;
        if (isSetLaunch_wechat_program()) {
            sb2.append("launch_wechat_program:");
            AdLunchWechatProgram adLunchWechatProgram = this.launch_wechat_program;
            if (adLunchWechatProgram == null) {
                sb2.append("null");
            } else {
                sb2.append(adLunchWechatProgram);
            }
            z11 = false;
        } else {
            z11 = true;
        }
        if (isSetLaunch_app()) {
            if (!z11) {
                sb2.append(j2.O);
            }
            sb2.append("launch_app:");
            AdLunchApp adLunchApp = this.launch_app;
            if (adLunchApp == null) {
                sb2.append("null");
            } else {
                sb2.append(adLunchApp);
            }
            z11 = false;
        }
        if (isSetImp_trackers()) {
            if (!z11) {
                sb2.append(j2.O);
            }
            sb2.append("imp_trackers:");
            List<String> list = this.imp_trackers;
            if (list == null) {
                sb2.append("null");
            } else {
                sb2.append(list);
            }
            z11 = false;
        }
        if (isSetClick_trackers()) {
            if (!z11) {
                sb2.append(j2.O);
            }
            sb2.append("click_trackers:");
            List<String> list2 = this.click_trackers;
            if (list2 == null) {
                sb2.append("null");
            } else {
                sb2.append(list2);
            }
            z11 = false;
        }
        if (isSetLaunch_wechat_program_trackers()) {
            if (!z11) {
                sb2.append(j2.O);
            }
            sb2.append("launch_wechat_program_trackers:");
            List<String> list3 = this.launch_wechat_program_trackers;
            if (list3 == null) {
                sb2.append("null");
            } else {
                sb2.append(list3);
            }
            z11 = false;
        }
        if (isSetLaunch_app_trackers()) {
            if (!z11) {
                sb2.append(j2.O);
            }
            sb2.append("launch_app_trackers:");
            List<String> list4 = this.launch_app_trackers;
            if (list4 == null) {
                sb2.append("null");
            } else {
                sb2.append(list4);
            }
        } else {
            z12 = z11;
        }
        if (isSetPrice()) {
            if (!z12) {
                sb2.append(j2.O);
            }
            sb2.append("price:");
            sb2.append(this.price);
        }
        sb2.append(j.f81007d);
        return sb2.toString();
    }

    public void unsetClick_trackers() {
        this.click_trackers = null;
    }

    public void unsetImp_trackers() {
        this.imp_trackers = null;
    }

    public void unsetLaunch_app() {
        this.launch_app = null;
    }

    public void unsetLaunch_app_trackers() {
        this.launch_app_trackers = null;
    }

    public void unsetLaunch_wechat_program() {
        this.launch_wechat_program = null;
    }

    public void unsetLaunch_wechat_program_trackers() {
        this.launch_wechat_program_trackers = null;
    }

    public void unsetPrice() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void validate() throws TException {
        AdLunchWechatProgram adLunchWechatProgram = this.launch_wechat_program;
        if (adLunchWechatProgram != null) {
            adLunchWechatProgram.validate();
        }
        AdLunchApp adLunchApp = this.launch_app;
        if (adLunchApp != null) {
            adLunchApp.validate();
        }
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(AdExtraResp other) {
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
        int compareTo8 = Boolean.valueOf(isSetLaunch_wechat_program()).compareTo(Boolean.valueOf(other.isSetLaunch_wechat_program()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (isSetLaunch_wechat_program() && (compareTo7 = TBaseHelper.compareTo((Comparable) this.launch_wechat_program, (Comparable) other.launch_wechat_program)) != 0) {
            return compareTo7;
        }
        int compareTo9 = Boolean.valueOf(isSetLaunch_app()).compareTo(Boolean.valueOf(other.isSetLaunch_app()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (isSetLaunch_app() && (compareTo6 = TBaseHelper.compareTo((Comparable) this.launch_app, (Comparable) other.launch_app)) != 0) {
            return compareTo6;
        }
        int compareTo10 = Boolean.valueOf(isSetImp_trackers()).compareTo(Boolean.valueOf(other.isSetImp_trackers()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (isSetImp_trackers() && (compareTo5 = TBaseHelper.compareTo((List) this.imp_trackers, (List) other.imp_trackers)) != 0) {
            return compareTo5;
        }
        int compareTo11 = Boolean.valueOf(isSetClick_trackers()).compareTo(Boolean.valueOf(other.isSetClick_trackers()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (isSetClick_trackers() && (compareTo4 = TBaseHelper.compareTo((List) this.click_trackers, (List) other.click_trackers)) != 0) {
            return compareTo4;
        }
        int compareTo12 = Boolean.valueOf(isSetLaunch_wechat_program_trackers()).compareTo(Boolean.valueOf(other.isSetLaunch_wechat_program_trackers()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (isSetLaunch_wechat_program_trackers() && (compareTo3 = TBaseHelper.compareTo((List) this.launch_wechat_program_trackers, (List) other.launch_wechat_program_trackers)) != 0) {
            return compareTo3;
        }
        int compareTo13 = Boolean.valueOf(isSetLaunch_app_trackers()).compareTo(Boolean.valueOf(other.isSetLaunch_app_trackers()));
        if (compareTo13 != 0) {
            return compareTo13;
        }
        if (isSetLaunch_app_trackers() && (compareTo2 = TBaseHelper.compareTo((List) this.launch_app_trackers, (List) other.launch_app_trackers)) != 0) {
            return compareTo2;
        }
        int compareTo14 = Boolean.valueOf(isSetPrice()).compareTo(Boolean.valueOf(other.isSetPrice()));
        if (compareTo14 != 0) {
            return compareTo14;
        }
        if (!isSetPrice() || (compareTo = TBaseHelper.compareTo(this.price, other.price)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<AdExtraResp, _Fields> deepCopy2() {
        return new AdExtraResp(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$ad_property$AdExtraResp$_Fields[field.ordinal()]) {
            case 1:
                return getLaunch_wechat_program();
            case 2:
                return getLaunch_app();
            case 3:
                return getImp_trackers();
            case 4:
                return getClick_trackers();
            case 5:
                return getLaunch_wechat_program_trackers();
            case 6:
                return getLaunch_app_trackers();
            case 7:
                return Integer.valueOf(getPrice());
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$ad_property$AdExtraResp$_Fields[field.ordinal()]) {
            case 1:
                return isSetLaunch_wechat_program();
            case 2:
                return isSetLaunch_app();
            case 3:
                return isSetImp_trackers();
            case 4:
                return isSetClick_trackers();
            case 5:
                return isSetLaunch_wechat_program_trackers();
            case 6:
                return isSetLaunch_app_trackers();
            case 7:
                return isSetPrice();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$ad_property$AdExtraResp$_Fields[field.ordinal()]) {
            case 1:
                if (value != null) {
                    setLaunch_wechat_program((AdLunchWechatProgram) value);
                    break;
                } else {
                    unsetLaunch_wechat_program();
                    break;
                }
            case 2:
                if (value != null) {
                    setLaunch_app((AdLunchApp) value);
                    break;
                } else {
                    unsetLaunch_app();
                    break;
                }
            case 3:
                if (value != null) {
                    setImp_trackers((List) value);
                    break;
                } else {
                    unsetImp_trackers();
                    break;
                }
            case 4:
                if (value != null) {
                    setClick_trackers((List) value);
                    break;
                } else {
                    unsetClick_trackers();
                    break;
                }
            case 5:
                if (value != null) {
                    setLaunch_wechat_program_trackers((List) value);
                    break;
                } else {
                    unsetLaunch_wechat_program_trackers();
                    break;
                }
            case 6:
                if (value != null) {
                    setLaunch_app_trackers((List) value);
                    break;
                } else {
                    unsetLaunch_app_trackers();
                    break;
                }
            case 7:
                if (value != null) {
                    setPrice(((Integer) value).intValue());
                    break;
                } else {
                    unsetPrice();
                    break;
                }
        }
    }

    public boolean equals(AdExtraResp that) {
        if (that == null) {
            return false;
        }
        boolean isSetLaunch_wechat_program = isSetLaunch_wechat_program();
        boolean isSetLaunch_wechat_program2 = that.isSetLaunch_wechat_program();
        if ((isSetLaunch_wechat_program || isSetLaunch_wechat_program2) && !(isSetLaunch_wechat_program && isSetLaunch_wechat_program2 && this.launch_wechat_program.equals(that.launch_wechat_program))) {
            return false;
        }
        boolean isSetLaunch_app = isSetLaunch_app();
        boolean isSetLaunch_app2 = that.isSetLaunch_app();
        if ((isSetLaunch_app || isSetLaunch_app2) && !(isSetLaunch_app && isSetLaunch_app2 && this.launch_app.equals(that.launch_app))) {
            return false;
        }
        boolean isSetImp_trackers = isSetImp_trackers();
        boolean isSetImp_trackers2 = that.isSetImp_trackers();
        if ((isSetImp_trackers || isSetImp_trackers2) && !(isSetImp_trackers && isSetImp_trackers2 && this.imp_trackers.equals(that.imp_trackers))) {
            return false;
        }
        boolean isSetClick_trackers = isSetClick_trackers();
        boolean isSetClick_trackers2 = that.isSetClick_trackers();
        if ((isSetClick_trackers || isSetClick_trackers2) && !(isSetClick_trackers && isSetClick_trackers2 && this.click_trackers.equals(that.click_trackers))) {
            return false;
        }
        boolean isSetLaunch_wechat_program_trackers = isSetLaunch_wechat_program_trackers();
        boolean isSetLaunch_wechat_program_trackers2 = that.isSetLaunch_wechat_program_trackers();
        if ((isSetLaunch_wechat_program_trackers || isSetLaunch_wechat_program_trackers2) && !(isSetLaunch_wechat_program_trackers && isSetLaunch_wechat_program_trackers2 && this.launch_wechat_program_trackers.equals(that.launch_wechat_program_trackers))) {
            return false;
        }
        boolean isSetLaunch_app_trackers = isSetLaunch_app_trackers();
        boolean isSetLaunch_app_trackers2 = that.isSetLaunch_app_trackers();
        if ((isSetLaunch_app_trackers || isSetLaunch_app_trackers2) && !(isSetLaunch_app_trackers && isSetLaunch_app_trackers2 && this.launch_app_trackers.equals(that.launch_app_trackers))) {
            return false;
        }
        boolean isSetPrice = isSetPrice();
        boolean isSetPrice2 = that.isSetPrice();
        if (isSetPrice || isSetPrice2) {
            return isSetPrice && isSetPrice2 && this.price == that.price;
        }
        return true;
    }

    public AdExtraResp(AdExtraResp other) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.LAUNCH_WECHAT_PROGRAM, _Fields.LAUNCH_APP, _Fields.IMP_TRACKERS, _Fields.CLICK_TRACKERS, _Fields.LAUNCH_WECHAT_PROGRAM_TRACKERS, _Fields.LAUNCH_APP_TRACKERS, _Fields.PRICE};
        this.__isset_bitfield = other.__isset_bitfield;
        if (other.isSetLaunch_wechat_program()) {
            this.launch_wechat_program = new AdLunchWechatProgram(other.launch_wechat_program);
        }
        if (other.isSetLaunch_app()) {
            this.launch_app = new AdLunchApp(other.launch_app);
        }
        if (other.isSetImp_trackers()) {
            this.imp_trackers = new ArrayList(other.imp_trackers);
        }
        if (other.isSetClick_trackers()) {
            this.click_trackers = new ArrayList(other.click_trackers);
        }
        if (other.isSetLaunch_wechat_program_trackers()) {
            this.launch_wechat_program_trackers = new ArrayList(other.launch_wechat_program_trackers);
        }
        if (other.isSetLaunch_app_trackers()) {
            this.launch_app_trackers = new ArrayList(other.launch_app_trackers);
        }
        this.price = other.price;
    }
}

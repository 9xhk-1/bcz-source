package com.baicizhan.online.advertise_api;

import com.baicizhan.online.ad_property.AdExtraResp;
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
public class MainViewBottomAdv implements TBase<MainViewBottomAdv, _Fields>, Serializable, Cloneable, Comparable<MainViewBottomAdv> {
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    public AdExtraResp ad_resp;
    public String aid;

    /* renamed from: id, reason: collision with root package name */
    public String f28141id;
    public String img_url;
    public String link;
    private _Fields[] optionals;
    private static final TStruct STRUCT_DESC = new TStruct("MainViewBottomAdv");
    private static final TField ID_FIELD_DESC = new TField("id", (byte) 11, 1);
    private static final TField IMG_URL_FIELD_DESC = new TField(com.baicizhan.main.activity.schedule_v2.e.f19255e, (byte) 11, 2);
    private static final TField LINK_FIELD_DESC = new TField(y9.b.f99687c, (byte) 11, 3);
    private static final TField AID_FIELD_DESC = new TField("aid", (byte) 11, 4);
    private static final TField AD_RESP_FIELD_DESC = new TField("ad_resp", (byte) 12, 5);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.advertise_api.MainViewBottomAdv$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$advertise_api$MainViewBottomAdv$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$advertise_api$MainViewBottomAdv$_Fields = iArr;
            try {
                iArr[_Fields.ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$advertise_api$MainViewBottomAdv$_Fields[_Fields.IMG_URL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$advertise_api$MainViewBottomAdv$_Fields[_Fields.LINK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$advertise_api$MainViewBottomAdv$_Fields[_Fields.AID.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$advertise_api$MainViewBottomAdv$_Fields[_Fields.AD_RESP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class MainViewBottomAdvStandardScheme extends StandardScheme<MainViewBottomAdv> {
        private MainViewBottomAdvStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, MainViewBottomAdv struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    iprot.readStructEnd();
                    struct.validate();
                    return;
                }
                short s11 = readFieldBegin.f77768id;
                if (s11 != 1) {
                    if (s11 != 2) {
                        if (s11 != 3) {
                            if (s11 != 4) {
                                if (s11 != 5) {
                                    TProtocolUtil.skip(iprot, b11);
                                } else if (b11 == 12) {
                                    AdExtraResp adExtraResp = new AdExtraResp();
                                    struct.ad_resp = adExtraResp;
                                    adExtraResp.read(iprot);
                                    struct.setAd_respIsSet(true);
                                } else {
                                    TProtocolUtil.skip(iprot, b11);
                                }
                            } else if (b11 == 11) {
                                struct.aid = iprot.readString();
                                struct.setAidIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 11) {
                            struct.link = iprot.readString();
                            struct.setLinkIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 11) {
                        struct.img_url = iprot.readString();
                        struct.setImg_urlIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 11) {
                    struct.f28141id = iprot.readString();
                    struct.setIdIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, MainViewBottomAdv struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(MainViewBottomAdv.STRUCT_DESC);
            if (struct.f28141id != null) {
                oprot.writeFieldBegin(MainViewBottomAdv.ID_FIELD_DESC);
                oprot.writeString(struct.f28141id);
                oprot.writeFieldEnd();
            }
            if (struct.img_url != null) {
                oprot.writeFieldBegin(MainViewBottomAdv.IMG_URL_FIELD_DESC);
                oprot.writeString(struct.img_url);
                oprot.writeFieldEnd();
            }
            if (struct.link != null) {
                oprot.writeFieldBegin(MainViewBottomAdv.LINK_FIELD_DESC);
                oprot.writeString(struct.link);
                oprot.writeFieldEnd();
            }
            if (struct.aid != null && struct.isSetAid()) {
                oprot.writeFieldBegin(MainViewBottomAdv.AID_FIELD_DESC);
                oprot.writeString(struct.aid);
                oprot.writeFieldEnd();
            }
            if (struct.ad_resp != null && struct.isSetAd_resp()) {
                oprot.writeFieldBegin(MainViewBottomAdv.AD_RESP_FIELD_DESC);
                struct.ad_resp.write(oprot);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class MainViewBottomAdvStandardSchemeFactory implements SchemeFactory {
        private MainViewBottomAdvStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public MainViewBottomAdvStandardScheme getScheme() {
            return new MainViewBottomAdvStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class MainViewBottomAdvTupleScheme extends TupleScheme<MainViewBottomAdv> {
        private MainViewBottomAdvTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, MainViewBottomAdv struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.f28141id = tTupleProtocol.readString();
            struct.setIdIsSet(true);
            struct.img_url = tTupleProtocol.readString();
            struct.setImg_urlIsSet(true);
            struct.link = tTupleProtocol.readString();
            struct.setLinkIsSet(true);
            BitSet readBitSet = tTupleProtocol.readBitSet(2);
            if (readBitSet.get(0)) {
                struct.aid = tTupleProtocol.readString();
                struct.setAidIsSet(true);
            }
            if (readBitSet.get(1)) {
                AdExtraResp adExtraResp = new AdExtraResp();
                struct.ad_resp = adExtraResp;
                adExtraResp.read(tTupleProtocol);
                struct.setAd_respIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, MainViewBottomAdv struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeString(struct.f28141id);
            tTupleProtocol.writeString(struct.img_url);
            tTupleProtocol.writeString(struct.link);
            BitSet bitSet = new BitSet();
            if (struct.isSetAid()) {
                bitSet.set(0);
            }
            if (struct.isSetAd_resp()) {
                bitSet.set(1);
            }
            tTupleProtocol.writeBitSet(bitSet, 2);
            if (struct.isSetAid()) {
                tTupleProtocol.writeString(struct.aid);
            }
            if (struct.isSetAd_resp()) {
                struct.ad_resp.write(tTupleProtocol);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class MainViewBottomAdvTupleSchemeFactory implements SchemeFactory {
        private MainViewBottomAdvTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public MainViewBottomAdvTupleScheme getScheme() {
            return new MainViewBottomAdvTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        ID(1, "id"),
        IMG_URL(2, com.baicizhan.main.activity.schedule_v2.e.f19255e),
        LINK(3, y9.b.f99687c),
        AID(4, "aid"),
        AD_RESP(5, "ad_resp");

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
            if (fieldId == 1) {
                return ID;
            }
            if (fieldId == 2) {
                return IMG_URL;
            }
            if (fieldId == 3) {
                return LINK;
            }
            if (fieldId == 4) {
                return AID;
            }
            if (fieldId != 5) {
                return null;
            }
            return AD_RESP;
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
        hashMap.put(StandardScheme.class, new MainViewBottomAdvStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new MainViewBottomAdvTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.ID, (_Fields) new FieldMetaData("id", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.IMG_URL, (_Fields) new FieldMetaData(com.baicizhan.main.activity.schedule_v2.e.f19255e, (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.LINK, (_Fields) new FieldMetaData(y9.b.f99687c, (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.AID, (_Fields) new FieldMetaData("aid", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.AD_RESP, (_Fields) new FieldMetaData("ad_resp", (byte) 2, new StructMetaData((byte) 12, AdExtraResp.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(MainViewBottomAdv.class, unmodifiableMap);
    }

    public MainViewBottomAdv() {
        this.optionals = new _Fields[]{_Fields.AID, _Fields.AD_RESP};
    }

    private void readObject(ObjectInputStream in2) throws IOException, ClassNotFoundException {
        try {
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
        this.f28141id = null;
        this.img_url = null;
        this.link = null;
        this.aid = null;
        this.ad_resp = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof MainViewBottomAdv)) {
            return equals((MainViewBottomAdv) that);
        }
        return false;
    }

    public AdExtraResp getAd_resp() {
        return this.ad_resp;
    }

    public String getAid() {
        return this.aid;
    }

    public String getId() {
        return this.f28141id;
    }

    public String getImg_url() {
        return this.img_url;
    }

    public String getLink() {
        return this.link;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetAd_resp() {
        return this.ad_resp != null;
    }

    public boolean isSetAid() {
        return this.aid != null;
    }

    public boolean isSetId() {
        return this.f28141id != null;
    }

    public boolean isSetImg_url() {
        return this.img_url != null;
    }

    public boolean isSetLink() {
        return this.link != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public MainViewBottomAdv setAd_resp(AdExtraResp ad_resp) {
        this.ad_resp = ad_resp;
        return this;
    }

    public void setAd_respIsSet(boolean value) {
        if (value) {
            return;
        }
        this.ad_resp = null;
    }

    public MainViewBottomAdv setAid(String aid) {
        this.aid = aid;
        return this;
    }

    public void setAidIsSet(boolean value) {
        if (value) {
            return;
        }
        this.aid = null;
    }

    public MainViewBottomAdv setId(String id2) {
        this.f28141id = id2;
        return this;
    }

    public void setIdIsSet(boolean value) {
        if (value) {
            return;
        }
        this.f28141id = null;
    }

    public MainViewBottomAdv setImg_url(String img_url) {
        this.img_url = img_url;
        return this;
    }

    public void setImg_urlIsSet(boolean value) {
        if (value) {
            return;
        }
        this.img_url = null;
    }

    public MainViewBottomAdv setLink(String link) {
        this.link = link;
        return this;
    }

    public void setLinkIsSet(boolean value) {
        if (value) {
            return;
        }
        this.link = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("MainViewBottomAdv(");
        sb2.append("id:");
        String str = this.f28141id;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(j2.O);
        sb2.append("img_url:");
        String str2 = this.img_url;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(str2);
        }
        sb2.append(j2.O);
        sb2.append("link:");
        String str3 = this.link;
        if (str3 == null) {
            sb2.append("null");
        } else {
            sb2.append(str3);
        }
        if (isSetAid()) {
            sb2.append(j2.O);
            sb2.append("aid:");
            String str4 = this.aid;
            if (str4 == null) {
                sb2.append("null");
            } else {
                sb2.append(str4);
            }
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
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetAd_resp() {
        this.ad_resp = null;
    }

    public void unsetAid() {
        this.aid = null;
    }

    public void unsetId() {
        this.f28141id = null;
    }

    public void unsetImg_url() {
        this.img_url = null;
    }

    public void unsetLink() {
        this.link = null;
    }

    public void validate() throws TException {
        if (this.f28141id == null) {
            throw new TProtocolException("Required field 'id' was not present! Struct: " + toString());
        }
        if (this.img_url == null) {
            throw new TProtocolException("Required field 'img_url' was not present! Struct: " + toString());
        }
        if (this.link == null) {
            throw new TProtocolException("Required field 'link' was not present! Struct: " + toString());
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
    public int compareTo(MainViewBottomAdv other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        int compareTo5;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo6 = Boolean.valueOf(isSetId()).compareTo(Boolean.valueOf(other.isSetId()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (isSetId() && (compareTo5 = TBaseHelper.compareTo(this.f28141id, other.f28141id)) != 0) {
            return compareTo5;
        }
        int compareTo7 = Boolean.valueOf(isSetImg_url()).compareTo(Boolean.valueOf(other.isSetImg_url()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (isSetImg_url() && (compareTo4 = TBaseHelper.compareTo(this.img_url, other.img_url)) != 0) {
            return compareTo4;
        }
        int compareTo8 = Boolean.valueOf(isSetLink()).compareTo(Boolean.valueOf(other.isSetLink()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (isSetLink() && (compareTo3 = TBaseHelper.compareTo(this.link, other.link)) != 0) {
            return compareTo3;
        }
        int compareTo9 = Boolean.valueOf(isSetAid()).compareTo(Boolean.valueOf(other.isSetAid()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (isSetAid() && (compareTo2 = TBaseHelper.compareTo(this.aid, other.aid)) != 0) {
            return compareTo2;
        }
        int compareTo10 = Boolean.valueOf(isSetAd_resp()).compareTo(Boolean.valueOf(other.isSetAd_resp()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (!isSetAd_resp() || (compareTo = TBaseHelper.compareTo((Comparable) this.ad_resp, (Comparable) other.ad_resp)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<MainViewBottomAdv, _Fields> deepCopy2() {
        return new MainViewBottomAdv(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$advertise_api$MainViewBottomAdv$_Fields[field.ordinal()];
        if (i11 == 1) {
            return getId();
        }
        if (i11 == 2) {
            return getImg_url();
        }
        if (i11 == 3) {
            return getLink();
        }
        if (i11 == 4) {
            return getAid();
        }
        if (i11 == 5) {
            return getAd_resp();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$advertise_api$MainViewBottomAdv$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetId();
        }
        if (i11 == 2) {
            return isSetImg_url();
        }
        if (i11 == 3) {
            return isSetLink();
        }
        if (i11 == 4) {
            return isSetAid();
        }
        if (i11 == 5) {
            return isSetAd_resp();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$advertise_api$MainViewBottomAdv$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetId();
                return;
            } else {
                setId((String) value);
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetImg_url();
                return;
            } else {
                setImg_url((String) value);
                return;
            }
        }
        if (i11 == 3) {
            if (value == null) {
                unsetLink();
                return;
            } else {
                setLink((String) value);
                return;
            }
        }
        if (i11 == 4) {
            if (value == null) {
                unsetAid();
                return;
            } else {
                setAid((String) value);
                return;
            }
        }
        if (i11 != 5) {
            return;
        }
        if (value == null) {
            unsetAd_resp();
        } else {
            setAd_resp((AdExtraResp) value);
        }
    }

    public MainViewBottomAdv(String id2, String img_url, String link) {
        this();
        this.f28141id = id2;
        this.img_url = img_url;
        this.link = link;
    }

    public boolean equals(MainViewBottomAdv that) {
        if (that == null) {
            return false;
        }
        boolean isSetId = isSetId();
        boolean isSetId2 = that.isSetId();
        if ((isSetId || isSetId2) && !(isSetId && isSetId2 && this.f28141id.equals(that.f28141id))) {
            return false;
        }
        boolean isSetImg_url = isSetImg_url();
        boolean isSetImg_url2 = that.isSetImg_url();
        if ((isSetImg_url || isSetImg_url2) && !(isSetImg_url && isSetImg_url2 && this.img_url.equals(that.img_url))) {
            return false;
        }
        boolean isSetLink = isSetLink();
        boolean isSetLink2 = that.isSetLink();
        if ((isSetLink || isSetLink2) && !(isSetLink && isSetLink2 && this.link.equals(that.link))) {
            return false;
        }
        boolean isSetAid = isSetAid();
        boolean isSetAid2 = that.isSetAid();
        if ((isSetAid || isSetAid2) && !(isSetAid && isSetAid2 && this.aid.equals(that.aid))) {
            return false;
        }
        boolean isSetAd_resp = isSetAd_resp();
        boolean isSetAd_resp2 = that.isSetAd_resp();
        if (isSetAd_resp || isSetAd_resp2) {
            return isSetAd_resp && isSetAd_resp2 && this.ad_resp.equals(that.ad_resp);
        }
        return true;
    }

    public MainViewBottomAdv(MainViewBottomAdv other) {
        this.optionals = new _Fields[]{_Fields.AID, _Fields.AD_RESP};
        if (other.isSetId()) {
            this.f28141id = other.f28141id;
        }
        if (other.isSetImg_url()) {
            this.img_url = other.img_url;
        }
        if (other.isSetLink()) {
            this.link = other.link;
        }
        if (other.isSetAid()) {
            this.aid = other.aid;
        }
        if (other.isSetAd_resp()) {
            this.ad_resp = new AdExtraResp(other.ad_resp);
        }
    }
}

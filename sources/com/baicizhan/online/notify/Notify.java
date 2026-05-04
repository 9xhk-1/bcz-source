package com.baicizhan.online.notify;

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
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class Notify implements TBase<Notify, _Fields>, Serializable, Cloneable, Comparable<Notify> {
    private static final int __TIME_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public AdExtraResp ad_resp;
    public String aid;
    public String banner_img_url;
    public String content;
    public String img_url;
    private _Fields[] optionals;
    public int time;
    public String title;
    public String url;
    private static final TStruct STRUCT_DESC = new TStruct("Notify");
    private static final TField TIME_FIELD_DESC = new TField("time", (byte) 8, 1);
    private static final TField TITLE_FIELD_DESC = new TField("title", (byte) 11, 2);
    private static final TField CONTENT_FIELD_DESC = new TField("content", (byte) 11, 3);
    private static final TField URL_FIELD_DESC = new TField("url", (byte) 11, 4);
    private static final TField IMG_URL_FIELD_DESC = new TField(com.baicizhan.main.activity.schedule_v2.e.f19255e, (byte) 11, 5);
    private static final TField BANNER_IMG_URL_FIELD_DESC = new TField("banner_img_url", (byte) 11, 6);
    private static final TField AID_FIELD_DESC = new TField("aid", (byte) 11, 7);
    private static final TField AD_RESP_FIELD_DESC = new TField("ad_resp", (byte) 12, 8);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.notify.Notify$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$notify$Notify$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$notify$Notify$_Fields = iArr;
            try {
                iArr[_Fields.TIME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$notify$Notify$_Fields[_Fields.TITLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$notify$Notify$_Fields[_Fields.CONTENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$notify$Notify$_Fields[_Fields.URL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$notify$Notify$_Fields[_Fields.IMG_URL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$baicizhan$online$notify$Notify$_Fields[_Fields.BANNER_IMG_URL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$baicizhan$online$notify$Notify$_Fields[_Fields.AID.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$baicizhan$online$notify$Notify$_Fields[_Fields.AD_RESP.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class NotifyStandardScheme extends StandardScheme<Notify> {
        private NotifyStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, Notify struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    iprot.readStructEnd();
                    if (struct.isSetTime()) {
                        struct.validate();
                        return;
                    }
                    throw new TProtocolException("Required field 'time' was not found in serialized data! Struct: " + toString());
                }
                switch (readFieldBegin.f77768id) {
                    case 1:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.time = iprot.readI32();
                            struct.setTimeIsSet(true);
                            break;
                        }
                    case 2:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.title = iprot.readString();
                            struct.setTitleIsSet(true);
                            break;
                        }
                    case 3:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.content = iprot.readString();
                            struct.setContentIsSet(true);
                            break;
                        }
                    case 4:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.url = iprot.readString();
                            struct.setUrlIsSet(true);
                            break;
                        }
                    case 5:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.img_url = iprot.readString();
                            struct.setImg_urlIsSet(true);
                            break;
                        }
                    case 6:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.banner_img_url = iprot.readString();
                            struct.setBanner_img_urlIsSet(true);
                            break;
                        }
                    case 7:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.aid = iprot.readString();
                            struct.setAidIsSet(true);
                            break;
                        }
                    case 8:
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
                    default:
                        TProtocolUtil.skip(iprot, b11);
                        break;
                }
                iprot.readFieldEnd();
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, Notify struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(Notify.STRUCT_DESC);
            oprot.writeFieldBegin(Notify.TIME_FIELD_DESC);
            oprot.writeI32(struct.time);
            oprot.writeFieldEnd();
            if (struct.title != null) {
                oprot.writeFieldBegin(Notify.TITLE_FIELD_DESC);
                oprot.writeString(struct.title);
                oprot.writeFieldEnd();
            }
            if (struct.content != null) {
                oprot.writeFieldBegin(Notify.CONTENT_FIELD_DESC);
                oprot.writeString(struct.content);
                oprot.writeFieldEnd();
            }
            if (struct.url != null && struct.isSetUrl()) {
                oprot.writeFieldBegin(Notify.URL_FIELD_DESC);
                oprot.writeString(struct.url);
                oprot.writeFieldEnd();
            }
            if (struct.img_url != null && struct.isSetImg_url()) {
                oprot.writeFieldBegin(Notify.IMG_URL_FIELD_DESC);
                oprot.writeString(struct.img_url);
                oprot.writeFieldEnd();
            }
            if (struct.banner_img_url != null && struct.isSetBanner_img_url()) {
                oprot.writeFieldBegin(Notify.BANNER_IMG_URL_FIELD_DESC);
                oprot.writeString(struct.banner_img_url);
                oprot.writeFieldEnd();
            }
            if (struct.aid != null && struct.isSetAid()) {
                oprot.writeFieldBegin(Notify.AID_FIELD_DESC);
                oprot.writeString(struct.aid);
                oprot.writeFieldEnd();
            }
            if (struct.ad_resp != null && struct.isSetAd_resp()) {
                oprot.writeFieldBegin(Notify.AD_RESP_FIELD_DESC);
                struct.ad_resp.write(oprot);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class NotifyStandardSchemeFactory implements SchemeFactory {
        private NotifyStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public NotifyStandardScheme getScheme() {
            return new NotifyStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class NotifyTupleScheme extends TupleScheme<Notify> {
        private NotifyTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, Notify struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.time = tTupleProtocol.readI32();
            struct.setTimeIsSet(true);
            struct.title = tTupleProtocol.readString();
            struct.setTitleIsSet(true);
            struct.content = tTupleProtocol.readString();
            struct.setContentIsSet(true);
            BitSet readBitSet = tTupleProtocol.readBitSet(5);
            if (readBitSet.get(0)) {
                struct.url = tTupleProtocol.readString();
                struct.setUrlIsSet(true);
            }
            if (readBitSet.get(1)) {
                struct.img_url = tTupleProtocol.readString();
                struct.setImg_urlIsSet(true);
            }
            if (readBitSet.get(2)) {
                struct.banner_img_url = tTupleProtocol.readString();
                struct.setBanner_img_urlIsSet(true);
            }
            if (readBitSet.get(3)) {
                struct.aid = tTupleProtocol.readString();
                struct.setAidIsSet(true);
            }
            if (readBitSet.get(4)) {
                AdExtraResp adExtraResp = new AdExtraResp();
                struct.ad_resp = adExtraResp;
                adExtraResp.read(tTupleProtocol);
                struct.setAd_respIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, Notify struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.time);
            tTupleProtocol.writeString(struct.title);
            tTupleProtocol.writeString(struct.content);
            BitSet bitSet = new BitSet();
            if (struct.isSetUrl()) {
                bitSet.set(0);
            }
            if (struct.isSetImg_url()) {
                bitSet.set(1);
            }
            if (struct.isSetBanner_img_url()) {
                bitSet.set(2);
            }
            if (struct.isSetAid()) {
                bitSet.set(3);
            }
            if (struct.isSetAd_resp()) {
                bitSet.set(4);
            }
            tTupleProtocol.writeBitSet(bitSet, 5);
            if (struct.isSetUrl()) {
                tTupleProtocol.writeString(struct.url);
            }
            if (struct.isSetImg_url()) {
                tTupleProtocol.writeString(struct.img_url);
            }
            if (struct.isSetBanner_img_url()) {
                tTupleProtocol.writeString(struct.banner_img_url);
            }
            if (struct.isSetAid()) {
                tTupleProtocol.writeString(struct.aid);
            }
            if (struct.isSetAd_resp()) {
                struct.ad_resp.write(tTupleProtocol);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class NotifyTupleSchemeFactory implements SchemeFactory {
        private NotifyTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public NotifyTupleScheme getScheme() {
            return new NotifyTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        TIME(1, "time"),
        TITLE(2, "title"),
        CONTENT(3, "content"),
        URL(4, "url"),
        IMG_URL(5, com.baicizhan.main.activity.schedule_v2.e.f19255e),
        BANNER_IMG_URL(6, "banner_img_url"),
        AID(7, "aid"),
        AD_RESP(8, "ad_resp");

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
                    return TIME;
                case 2:
                    return TITLE;
                case 3:
                    return CONTENT;
                case 4:
                    return URL;
                case 5:
                    return IMG_URL;
                case 6:
                    return BANNER_IMG_URL;
                case 7:
                    return AID;
                case 8:
                    return AD_RESP;
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
        hashMap.put(StandardScheme.class, new NotifyStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new NotifyTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.TIME, (_Fields) new FieldMetaData("time", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.TITLE, (_Fields) new FieldMetaData("title", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.CONTENT, (_Fields) new FieldMetaData("content", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.URL, (_Fields) new FieldMetaData("url", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.IMG_URL, (_Fields) new FieldMetaData(com.baicizhan.main.activity.schedule_v2.e.f19255e, (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.BANNER_IMG_URL, (_Fields) new FieldMetaData("banner_img_url", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.AID, (_Fields) new FieldMetaData("aid", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.AD_RESP, (_Fields) new FieldMetaData("ad_resp", (byte) 2, new StructMetaData((byte) 12, AdExtraResp.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(Notify.class, unmodifiableMap);
    }

    public Notify() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.URL, _Fields.IMG_URL, _Fields.BANNER_IMG_URL, _Fields.AID, _Fields.AD_RESP};
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
        setTimeIsSet(false);
        this.time = 0;
        this.title = null;
        this.content = null;
        this.url = null;
        this.img_url = null;
        this.banner_img_url = null;
        this.aid = null;
        this.ad_resp = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof Notify)) {
            return equals((Notify) that);
        }
        return false;
    }

    public AdExtraResp getAd_resp() {
        return this.ad_resp;
    }

    public String getAid() {
        return this.aid;
    }

    public String getBanner_img_url() {
        return this.banner_img_url;
    }

    public String getContent() {
        return this.content;
    }

    public String getImg_url() {
        return this.img_url;
    }

    public int getTime() {
        return this.time;
    }

    public String getTitle() {
        return this.title;
    }

    public String getUrl() {
        return this.url;
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

    public boolean isSetBanner_img_url() {
        return this.banner_img_url != null;
    }

    public boolean isSetContent() {
        return this.content != null;
    }

    public boolean isSetImg_url() {
        return this.img_url != null;
    }

    public boolean isSetTime() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetTitle() {
        return this.title != null;
    }

    public boolean isSetUrl() {
        return this.url != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public Notify setAd_resp(AdExtraResp ad_resp) {
        this.ad_resp = ad_resp;
        return this;
    }

    public void setAd_respIsSet(boolean value) {
        if (value) {
            return;
        }
        this.ad_resp = null;
    }

    public Notify setAid(String aid) {
        this.aid = aid;
        return this;
    }

    public void setAidIsSet(boolean value) {
        if (value) {
            return;
        }
        this.aid = null;
    }

    public Notify setBanner_img_url(String banner_img_url) {
        this.banner_img_url = banner_img_url;
        return this;
    }

    public void setBanner_img_urlIsSet(boolean value) {
        if (value) {
            return;
        }
        this.banner_img_url = null;
    }

    public Notify setContent(String content) {
        this.content = content;
        return this;
    }

    public void setContentIsSet(boolean value) {
        if (value) {
            return;
        }
        this.content = null;
    }

    public Notify setImg_url(String img_url) {
        this.img_url = img_url;
        return this;
    }

    public void setImg_urlIsSet(boolean value) {
        if (value) {
            return;
        }
        this.img_url = null;
    }

    public Notify setTime(int time) {
        this.time = time;
        setTimeIsSet(true);
        return this;
    }

    public void setTimeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public Notify setTitle(String title) {
        this.title = title;
        return this;
    }

    public void setTitleIsSet(boolean value) {
        if (value) {
            return;
        }
        this.title = null;
    }

    public Notify setUrl(String url) {
        this.url = url;
        return this;
    }

    public void setUrlIsSet(boolean value) {
        if (value) {
            return;
        }
        this.url = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Notify(");
        sb2.append("time:");
        sb2.append(this.time);
        sb2.append(j2.O);
        sb2.append("title:");
        String str = this.title;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(j2.O);
        sb2.append("content:");
        String str2 = this.content;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(str2);
        }
        if (isSetUrl()) {
            sb2.append(j2.O);
            sb2.append("url:");
            String str3 = this.url;
            if (str3 == null) {
                sb2.append("null");
            } else {
                sb2.append(str3);
            }
        }
        if (isSetImg_url()) {
            sb2.append(j2.O);
            sb2.append("img_url:");
            String str4 = this.img_url;
            if (str4 == null) {
                sb2.append("null");
            } else {
                sb2.append(str4);
            }
        }
        if (isSetBanner_img_url()) {
            sb2.append(j2.O);
            sb2.append("banner_img_url:");
            String str5 = this.banner_img_url;
            if (str5 == null) {
                sb2.append("null");
            } else {
                sb2.append(str5);
            }
        }
        if (isSetAid()) {
            sb2.append(j2.O);
            sb2.append("aid:");
            String str6 = this.aid;
            if (str6 == null) {
                sb2.append("null");
            } else {
                sb2.append(str6);
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
        sb2.append(j.f81007d);
        return sb2.toString();
    }

    public void unsetAd_resp() {
        this.ad_resp = null;
    }

    public void unsetAid() {
        this.aid = null;
    }

    public void unsetBanner_img_url() {
        this.banner_img_url = null;
    }

    public void unsetContent() {
        this.content = null;
    }

    public void unsetImg_url() {
        this.img_url = null;
    }

    public void unsetTime() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetTitle() {
        this.title = null;
    }

    public void unsetUrl() {
        this.url = null;
    }

    public void validate() throws TException {
        if (this.title == null) {
            throw new TProtocolException("Required field 'title' was not present! Struct: " + toString());
        }
        if (this.content == null) {
            throw new TProtocolException("Required field 'content' was not present! Struct: " + toString());
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
    public int compareTo(Notify other) {
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
        int compareTo9 = Boolean.valueOf(isSetTime()).compareTo(Boolean.valueOf(other.isSetTime()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (isSetTime() && (compareTo8 = TBaseHelper.compareTo(this.time, other.time)) != 0) {
            return compareTo8;
        }
        int compareTo10 = Boolean.valueOf(isSetTitle()).compareTo(Boolean.valueOf(other.isSetTitle()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (isSetTitle() && (compareTo7 = TBaseHelper.compareTo(this.title, other.title)) != 0) {
            return compareTo7;
        }
        int compareTo11 = Boolean.valueOf(isSetContent()).compareTo(Boolean.valueOf(other.isSetContent()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (isSetContent() && (compareTo6 = TBaseHelper.compareTo(this.content, other.content)) != 0) {
            return compareTo6;
        }
        int compareTo12 = Boolean.valueOf(isSetUrl()).compareTo(Boolean.valueOf(other.isSetUrl()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (isSetUrl() && (compareTo5 = TBaseHelper.compareTo(this.url, other.url)) != 0) {
            return compareTo5;
        }
        int compareTo13 = Boolean.valueOf(isSetImg_url()).compareTo(Boolean.valueOf(other.isSetImg_url()));
        if (compareTo13 != 0) {
            return compareTo13;
        }
        if (isSetImg_url() && (compareTo4 = TBaseHelper.compareTo(this.img_url, other.img_url)) != 0) {
            return compareTo4;
        }
        int compareTo14 = Boolean.valueOf(isSetBanner_img_url()).compareTo(Boolean.valueOf(other.isSetBanner_img_url()));
        if (compareTo14 != 0) {
            return compareTo14;
        }
        if (isSetBanner_img_url() && (compareTo3 = TBaseHelper.compareTo(this.banner_img_url, other.banner_img_url)) != 0) {
            return compareTo3;
        }
        int compareTo15 = Boolean.valueOf(isSetAid()).compareTo(Boolean.valueOf(other.isSetAid()));
        if (compareTo15 != 0) {
            return compareTo15;
        }
        if (isSetAid() && (compareTo2 = TBaseHelper.compareTo(this.aid, other.aid)) != 0) {
            return compareTo2;
        }
        int compareTo16 = Boolean.valueOf(isSetAd_resp()).compareTo(Boolean.valueOf(other.isSetAd_resp()));
        if (compareTo16 != 0) {
            return compareTo16;
        }
        if (!isSetAd_resp() || (compareTo = TBaseHelper.compareTo((Comparable) this.ad_resp, (Comparable) other.ad_resp)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<Notify, _Fields> deepCopy2() {
        return new Notify(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$notify$Notify$_Fields[field.ordinal()]) {
            case 1:
                return Integer.valueOf(getTime());
            case 2:
                return getTitle();
            case 3:
                return getContent();
            case 4:
                return getUrl();
            case 5:
                return getImg_url();
            case 6:
                return getBanner_img_url();
            case 7:
                return getAid();
            case 8:
                return getAd_resp();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$notify$Notify$_Fields[field.ordinal()]) {
            case 1:
                return isSetTime();
            case 2:
                return isSetTitle();
            case 3:
                return isSetContent();
            case 4:
                return isSetUrl();
            case 5:
                return isSetImg_url();
            case 6:
                return isSetBanner_img_url();
            case 7:
                return isSetAid();
            case 8:
                return isSetAd_resp();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$notify$Notify$_Fields[field.ordinal()]) {
            case 1:
                if (value != null) {
                    setTime(((Integer) value).intValue());
                    break;
                } else {
                    unsetTime();
                    break;
                }
            case 2:
                if (value != null) {
                    setTitle((String) value);
                    break;
                } else {
                    unsetTitle();
                    break;
                }
            case 3:
                if (value != null) {
                    setContent((String) value);
                    break;
                } else {
                    unsetContent();
                    break;
                }
            case 4:
                if (value != null) {
                    setUrl((String) value);
                    break;
                } else {
                    unsetUrl();
                    break;
                }
            case 5:
                if (value != null) {
                    setImg_url((String) value);
                    break;
                } else {
                    unsetImg_url();
                    break;
                }
            case 6:
                if (value != null) {
                    setBanner_img_url((String) value);
                    break;
                } else {
                    unsetBanner_img_url();
                    break;
                }
            case 7:
                if (value != null) {
                    setAid((String) value);
                    break;
                } else {
                    unsetAid();
                    break;
                }
            case 8:
                if (value != null) {
                    setAd_resp((AdExtraResp) value);
                    break;
                } else {
                    unsetAd_resp();
                    break;
                }
        }
    }

    public boolean equals(Notify that) {
        if (that == null || this.time != that.time) {
            return false;
        }
        boolean isSetTitle = isSetTitle();
        boolean isSetTitle2 = that.isSetTitle();
        if ((isSetTitle || isSetTitle2) && !(isSetTitle && isSetTitle2 && this.title.equals(that.title))) {
            return false;
        }
        boolean isSetContent = isSetContent();
        boolean isSetContent2 = that.isSetContent();
        if ((isSetContent || isSetContent2) && !(isSetContent && isSetContent2 && this.content.equals(that.content))) {
            return false;
        }
        boolean isSetUrl = isSetUrl();
        boolean isSetUrl2 = that.isSetUrl();
        if ((isSetUrl || isSetUrl2) && !(isSetUrl && isSetUrl2 && this.url.equals(that.url))) {
            return false;
        }
        boolean isSetImg_url = isSetImg_url();
        boolean isSetImg_url2 = that.isSetImg_url();
        if ((isSetImg_url || isSetImg_url2) && !(isSetImg_url && isSetImg_url2 && this.img_url.equals(that.img_url))) {
            return false;
        }
        boolean isSetBanner_img_url = isSetBanner_img_url();
        boolean isSetBanner_img_url2 = that.isSetBanner_img_url();
        if ((isSetBanner_img_url || isSetBanner_img_url2) && !(isSetBanner_img_url && isSetBanner_img_url2 && this.banner_img_url.equals(that.banner_img_url))) {
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

    public Notify(int time, String title, String content) {
        this();
        this.time = time;
        setTimeIsSet(true);
        this.title = title;
        this.content = content;
    }

    public Notify(Notify other) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.URL, _Fields.IMG_URL, _Fields.BANNER_IMG_URL, _Fields.AID, _Fields.AD_RESP};
        this.__isset_bitfield = other.__isset_bitfield;
        this.time = other.time;
        if (other.isSetTitle()) {
            this.title = other.title;
        }
        if (other.isSetContent()) {
            this.content = other.content;
        }
        if (other.isSetUrl()) {
            this.url = other.url;
        }
        if (other.isSetImg_url()) {
            this.img_url = other.img_url;
        }
        if (other.isSetBanner_img_url()) {
            this.banner_img_url = other.banner_img_url;
        }
        if (other.isSetAid()) {
            this.aid = other.aid;
        }
        if (other.isSetAd_resp()) {
            this.ad_resp = new AdExtraResp(other.ad_resp);
        }
    }
}

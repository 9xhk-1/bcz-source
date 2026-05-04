package com.baicizhan.online.bs_fights;

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
public class BBFightShareInfo implements TBase<BBFightShareInfo, _Fields>, Serializable, Cloneable, Comparable<BBFightShareInfo> {
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    public String data;
    public String detail_weibo_url;
    public String detail_weixin_url;
    private _Fields[] optionals;
    public String share_url_weibo;
    public String share_url_weixin;
    public String weibo_url;
    public String weixin_title;
    private static final TStruct STRUCT_DESC = new TStruct("BBFightShareInfo");
    private static final TField DATA_FIELD_DESC = new TField("data", (byte) 11, 1);
    private static final TField WEIBO_URL_FIELD_DESC = new TField("weibo_url", (byte) 11, 2);
    private static final TField WEIXIN_TITLE_FIELD_DESC = new TField("weixin_title", (byte) 11, 3);
    private static final TField SHARE_URL_WEIXIN_FIELD_DESC = new TField("share_url_weixin", (byte) 11, 4);
    private static final TField SHARE_URL_WEIBO_FIELD_DESC = new TField("share_url_weibo", (byte) 11, 5);
    private static final TField DETAIL_WEIXIN_URL_FIELD_DESC = new TField("detail_weixin_url", (byte) 11, 6);
    private static final TField DETAIL_WEIBO_URL_FIELD_DESC = new TField("detail_weibo_url", (byte) 11, 7);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.bs_fights.BBFightShareInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_fights$BBFightShareInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$bs_fights$BBFightShareInfo$_Fields = iArr;
            try {
                iArr[_Fields.DATA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_fights$BBFightShareInfo$_Fields[_Fields.WEIBO_URL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_fights$BBFightShareInfo$_Fields[_Fields.WEIXIN_TITLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_fights$BBFightShareInfo$_Fields[_Fields.SHARE_URL_WEIXIN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_fights$BBFightShareInfo$_Fields[_Fields.SHARE_URL_WEIBO.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_fights$BBFightShareInfo$_Fields[_Fields.DETAIL_WEIXIN_URL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_fights$BBFightShareInfo$_Fields[_Fields.DETAIL_WEIBO_URL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBFightShareInfoStandardScheme extends StandardScheme<BBFightShareInfo> {
        private BBFightShareInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, BBFightShareInfo struct) throws TException {
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
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.data = iprot.readString();
                            struct.setDataIsSet(true);
                            break;
                        }
                    case 2:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.weibo_url = iprot.readString();
                            struct.setWeibo_urlIsSet(true);
                            break;
                        }
                    case 3:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.weixin_title = iprot.readString();
                            struct.setWeixin_titleIsSet(true);
                            break;
                        }
                    case 4:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.share_url_weixin = iprot.readString();
                            struct.setShare_url_weixinIsSet(true);
                            break;
                        }
                    case 5:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.share_url_weibo = iprot.readString();
                            struct.setShare_url_weiboIsSet(true);
                            break;
                        }
                    case 6:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.detail_weixin_url = iprot.readString();
                            struct.setDetail_weixin_urlIsSet(true);
                            break;
                        }
                    case 7:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.detail_weibo_url = iprot.readString();
                            struct.setDetail_weibo_urlIsSet(true);
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
        public void write(TProtocol oprot, BBFightShareInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(BBFightShareInfo.STRUCT_DESC);
            if (struct.data != null) {
                oprot.writeFieldBegin(BBFightShareInfo.DATA_FIELD_DESC);
                oprot.writeString(struct.data);
                oprot.writeFieldEnd();
            }
            if (struct.weibo_url != null) {
                oprot.writeFieldBegin(BBFightShareInfo.WEIBO_URL_FIELD_DESC);
                oprot.writeString(struct.weibo_url);
                oprot.writeFieldEnd();
            }
            if (struct.weixin_title != null) {
                oprot.writeFieldBegin(BBFightShareInfo.WEIXIN_TITLE_FIELD_DESC);
                oprot.writeString(struct.weixin_title);
                oprot.writeFieldEnd();
            }
            if (struct.share_url_weixin != null && struct.isSetShare_url_weixin()) {
                oprot.writeFieldBegin(BBFightShareInfo.SHARE_URL_WEIXIN_FIELD_DESC);
                oprot.writeString(struct.share_url_weixin);
                oprot.writeFieldEnd();
            }
            if (struct.share_url_weibo != null && struct.isSetShare_url_weibo()) {
                oprot.writeFieldBegin(BBFightShareInfo.SHARE_URL_WEIBO_FIELD_DESC);
                oprot.writeString(struct.share_url_weibo);
                oprot.writeFieldEnd();
            }
            if (struct.detail_weixin_url != null && struct.isSetDetail_weixin_url()) {
                oprot.writeFieldBegin(BBFightShareInfo.DETAIL_WEIXIN_URL_FIELD_DESC);
                oprot.writeString(struct.detail_weixin_url);
                oprot.writeFieldEnd();
            }
            if (struct.detail_weibo_url != null && struct.isSetDetail_weibo_url()) {
                oprot.writeFieldBegin(BBFightShareInfo.DETAIL_WEIBO_URL_FIELD_DESC);
                oprot.writeString(struct.detail_weibo_url);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBFightShareInfoStandardSchemeFactory implements SchemeFactory {
        private BBFightShareInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BBFightShareInfoStandardScheme getScheme() {
            return new BBFightShareInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBFightShareInfoTupleScheme extends TupleScheme<BBFightShareInfo> {
        private BBFightShareInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, BBFightShareInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.data = tTupleProtocol.readString();
            struct.setDataIsSet(true);
            struct.weibo_url = tTupleProtocol.readString();
            struct.setWeibo_urlIsSet(true);
            struct.weixin_title = tTupleProtocol.readString();
            struct.setWeixin_titleIsSet(true);
            BitSet readBitSet = tTupleProtocol.readBitSet(4);
            if (readBitSet.get(0)) {
                struct.share_url_weixin = tTupleProtocol.readString();
                struct.setShare_url_weixinIsSet(true);
            }
            if (readBitSet.get(1)) {
                struct.share_url_weibo = tTupleProtocol.readString();
                struct.setShare_url_weiboIsSet(true);
            }
            if (readBitSet.get(2)) {
                struct.detail_weixin_url = tTupleProtocol.readString();
                struct.setDetail_weixin_urlIsSet(true);
            }
            if (readBitSet.get(3)) {
                struct.detail_weibo_url = tTupleProtocol.readString();
                struct.setDetail_weibo_urlIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, BBFightShareInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeString(struct.data);
            tTupleProtocol.writeString(struct.weibo_url);
            tTupleProtocol.writeString(struct.weixin_title);
            BitSet bitSet = new BitSet();
            if (struct.isSetShare_url_weixin()) {
                bitSet.set(0);
            }
            if (struct.isSetShare_url_weibo()) {
                bitSet.set(1);
            }
            if (struct.isSetDetail_weixin_url()) {
                bitSet.set(2);
            }
            if (struct.isSetDetail_weibo_url()) {
                bitSet.set(3);
            }
            tTupleProtocol.writeBitSet(bitSet, 4);
            if (struct.isSetShare_url_weixin()) {
                tTupleProtocol.writeString(struct.share_url_weixin);
            }
            if (struct.isSetShare_url_weibo()) {
                tTupleProtocol.writeString(struct.share_url_weibo);
            }
            if (struct.isSetDetail_weixin_url()) {
                tTupleProtocol.writeString(struct.detail_weixin_url);
            }
            if (struct.isSetDetail_weibo_url()) {
                tTupleProtocol.writeString(struct.detail_weibo_url);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBFightShareInfoTupleSchemeFactory implements SchemeFactory {
        private BBFightShareInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BBFightShareInfoTupleScheme getScheme() {
            return new BBFightShareInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        DATA(1, "data"),
        WEIBO_URL(2, "weibo_url"),
        WEIXIN_TITLE(3, "weixin_title"),
        SHARE_URL_WEIXIN(4, "share_url_weixin"),
        SHARE_URL_WEIBO(5, "share_url_weibo"),
        DETAIL_WEIXIN_URL(6, "detail_weixin_url"),
        DETAIL_WEIBO_URL(7, "detail_weibo_url");

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
                    return DATA;
                case 2:
                    return WEIBO_URL;
                case 3:
                    return WEIXIN_TITLE;
                case 4:
                    return SHARE_URL_WEIXIN;
                case 5:
                    return SHARE_URL_WEIBO;
                case 6:
                    return DETAIL_WEIXIN_URL;
                case 7:
                    return DETAIL_WEIBO_URL;
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
        hashMap.put(StandardScheme.class, new BBFightShareInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new BBFightShareInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.DATA, (_Fields) new FieldMetaData("data", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.WEIBO_URL, (_Fields) new FieldMetaData("weibo_url", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.WEIXIN_TITLE, (_Fields) new FieldMetaData("weixin_title", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.SHARE_URL_WEIXIN, (_Fields) new FieldMetaData("share_url_weixin", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.SHARE_URL_WEIBO, (_Fields) new FieldMetaData("share_url_weibo", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.DETAIL_WEIXIN_URL, (_Fields) new FieldMetaData("detail_weixin_url", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.DETAIL_WEIBO_URL, (_Fields) new FieldMetaData("detail_weibo_url", (byte) 2, new FieldValueMetaData((byte) 11)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(BBFightShareInfo.class, unmodifiableMap);
    }

    public BBFightShareInfo() {
        this.optionals = new _Fields[]{_Fields.SHARE_URL_WEIXIN, _Fields.SHARE_URL_WEIBO, _Fields.DETAIL_WEIXIN_URL, _Fields.DETAIL_WEIBO_URL};
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
        this.data = null;
        this.weibo_url = null;
        this.weixin_title = null;
        this.share_url_weixin = null;
        this.share_url_weibo = null;
        this.detail_weixin_url = null;
        this.detail_weibo_url = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof BBFightShareInfo)) {
            return equals((BBFightShareInfo) that);
        }
        return false;
    }

    public String getData() {
        return this.data;
    }

    public String getDetail_weibo_url() {
        return this.detail_weibo_url;
    }

    public String getDetail_weixin_url() {
        return this.detail_weixin_url;
    }

    public String getShare_url_weibo() {
        return this.share_url_weibo;
    }

    public String getShare_url_weixin() {
        return this.share_url_weixin;
    }

    public String getWeibo_url() {
        return this.weibo_url;
    }

    public String getWeixin_title() {
        return this.weixin_title;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetData() {
        return this.data != null;
    }

    public boolean isSetDetail_weibo_url() {
        return this.detail_weibo_url != null;
    }

    public boolean isSetDetail_weixin_url() {
        return this.detail_weixin_url != null;
    }

    public boolean isSetShare_url_weibo() {
        return this.share_url_weibo != null;
    }

    public boolean isSetShare_url_weixin() {
        return this.share_url_weixin != null;
    }

    public boolean isSetWeibo_url() {
        return this.weibo_url != null;
    }

    public boolean isSetWeixin_title() {
        return this.weixin_title != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public BBFightShareInfo setData(String data) {
        this.data = data;
        return this;
    }

    public void setDataIsSet(boolean value) {
        if (value) {
            return;
        }
        this.data = null;
    }

    public BBFightShareInfo setDetail_weibo_url(String detail_weibo_url) {
        this.detail_weibo_url = detail_weibo_url;
        return this;
    }

    public void setDetail_weibo_urlIsSet(boolean value) {
        if (value) {
            return;
        }
        this.detail_weibo_url = null;
    }

    public BBFightShareInfo setDetail_weixin_url(String detail_weixin_url) {
        this.detail_weixin_url = detail_weixin_url;
        return this;
    }

    public void setDetail_weixin_urlIsSet(boolean value) {
        if (value) {
            return;
        }
        this.detail_weixin_url = null;
    }

    public BBFightShareInfo setShare_url_weibo(String share_url_weibo) {
        this.share_url_weibo = share_url_weibo;
        return this;
    }

    public void setShare_url_weiboIsSet(boolean value) {
        if (value) {
            return;
        }
        this.share_url_weibo = null;
    }

    public BBFightShareInfo setShare_url_weixin(String share_url_weixin) {
        this.share_url_weixin = share_url_weixin;
        return this;
    }

    public void setShare_url_weixinIsSet(boolean value) {
        if (value) {
            return;
        }
        this.share_url_weixin = null;
    }

    public BBFightShareInfo setWeibo_url(String weibo_url) {
        this.weibo_url = weibo_url;
        return this;
    }

    public void setWeibo_urlIsSet(boolean value) {
        if (value) {
            return;
        }
        this.weibo_url = null;
    }

    public BBFightShareInfo setWeixin_title(String weixin_title) {
        this.weixin_title = weixin_title;
        return this;
    }

    public void setWeixin_titleIsSet(boolean value) {
        if (value) {
            return;
        }
        this.weixin_title = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("BBFightShareInfo(");
        sb2.append("data:");
        String str = this.data;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(j2.O);
        sb2.append("weibo_url:");
        String str2 = this.weibo_url;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(str2);
        }
        sb2.append(j2.O);
        sb2.append("weixin_title:");
        String str3 = this.weixin_title;
        if (str3 == null) {
            sb2.append("null");
        } else {
            sb2.append(str3);
        }
        if (isSetShare_url_weixin()) {
            sb2.append(j2.O);
            sb2.append("share_url_weixin:");
            String str4 = this.share_url_weixin;
            if (str4 == null) {
                sb2.append("null");
            } else {
                sb2.append(str4);
            }
        }
        if (isSetShare_url_weibo()) {
            sb2.append(j2.O);
            sb2.append("share_url_weibo:");
            String str5 = this.share_url_weibo;
            if (str5 == null) {
                sb2.append("null");
            } else {
                sb2.append(str5);
            }
        }
        if (isSetDetail_weixin_url()) {
            sb2.append(j2.O);
            sb2.append("detail_weixin_url:");
            String str6 = this.detail_weixin_url;
            if (str6 == null) {
                sb2.append("null");
            } else {
                sb2.append(str6);
            }
        }
        if (isSetDetail_weibo_url()) {
            sb2.append(j2.O);
            sb2.append("detail_weibo_url:");
            String str7 = this.detail_weibo_url;
            if (str7 == null) {
                sb2.append("null");
            } else {
                sb2.append(str7);
            }
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetData() {
        this.data = null;
    }

    public void unsetDetail_weibo_url() {
        this.detail_weibo_url = null;
    }

    public void unsetDetail_weixin_url() {
        this.detail_weixin_url = null;
    }

    public void unsetShare_url_weibo() {
        this.share_url_weibo = null;
    }

    public void unsetShare_url_weixin() {
        this.share_url_weixin = null;
    }

    public void unsetWeibo_url() {
        this.weibo_url = null;
    }

    public void unsetWeixin_title() {
        this.weixin_title = null;
    }

    public void validate() throws TException {
        if (this.data == null) {
            throw new TProtocolException("Required field 'data' was not present! Struct: " + toString());
        }
        if (this.weibo_url == null) {
            throw new TProtocolException("Required field 'weibo_url' was not present! Struct: " + toString());
        }
        if (this.weixin_title != null) {
            return;
        }
        throw new TProtocolException("Required field 'weixin_title' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(BBFightShareInfo other) {
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
        int compareTo8 = Boolean.valueOf(isSetData()).compareTo(Boolean.valueOf(other.isSetData()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (isSetData() && (compareTo7 = TBaseHelper.compareTo(this.data, other.data)) != 0) {
            return compareTo7;
        }
        int compareTo9 = Boolean.valueOf(isSetWeibo_url()).compareTo(Boolean.valueOf(other.isSetWeibo_url()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (isSetWeibo_url() && (compareTo6 = TBaseHelper.compareTo(this.weibo_url, other.weibo_url)) != 0) {
            return compareTo6;
        }
        int compareTo10 = Boolean.valueOf(isSetWeixin_title()).compareTo(Boolean.valueOf(other.isSetWeixin_title()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (isSetWeixin_title() && (compareTo5 = TBaseHelper.compareTo(this.weixin_title, other.weixin_title)) != 0) {
            return compareTo5;
        }
        int compareTo11 = Boolean.valueOf(isSetShare_url_weixin()).compareTo(Boolean.valueOf(other.isSetShare_url_weixin()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (isSetShare_url_weixin() && (compareTo4 = TBaseHelper.compareTo(this.share_url_weixin, other.share_url_weixin)) != 0) {
            return compareTo4;
        }
        int compareTo12 = Boolean.valueOf(isSetShare_url_weibo()).compareTo(Boolean.valueOf(other.isSetShare_url_weibo()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (isSetShare_url_weibo() && (compareTo3 = TBaseHelper.compareTo(this.share_url_weibo, other.share_url_weibo)) != 0) {
            return compareTo3;
        }
        int compareTo13 = Boolean.valueOf(isSetDetail_weixin_url()).compareTo(Boolean.valueOf(other.isSetDetail_weixin_url()));
        if (compareTo13 != 0) {
            return compareTo13;
        }
        if (isSetDetail_weixin_url() && (compareTo2 = TBaseHelper.compareTo(this.detail_weixin_url, other.detail_weixin_url)) != 0) {
            return compareTo2;
        }
        int compareTo14 = Boolean.valueOf(isSetDetail_weibo_url()).compareTo(Boolean.valueOf(other.isSetDetail_weibo_url()));
        if (compareTo14 != 0) {
            return compareTo14;
        }
        if (!isSetDetail_weibo_url() || (compareTo = TBaseHelper.compareTo(this.detail_weibo_url, other.detail_weibo_url)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<BBFightShareInfo, _Fields> deepCopy2() {
        return new BBFightShareInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BBFightShareInfo$_Fields[field.ordinal()]) {
            case 1:
                return getData();
            case 2:
                return getWeibo_url();
            case 3:
                return getWeixin_title();
            case 4:
                return getShare_url_weixin();
            case 5:
                return getShare_url_weibo();
            case 6:
                return getDetail_weixin_url();
            case 7:
                return getDetail_weibo_url();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BBFightShareInfo$_Fields[field.ordinal()]) {
            case 1:
                return isSetData();
            case 2:
                return isSetWeibo_url();
            case 3:
                return isSetWeixin_title();
            case 4:
                return isSetShare_url_weixin();
            case 5:
                return isSetShare_url_weibo();
            case 6:
                return isSetDetail_weixin_url();
            case 7:
                return isSetDetail_weibo_url();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BBFightShareInfo$_Fields[field.ordinal()]) {
            case 1:
                if (value != null) {
                    setData((String) value);
                    break;
                } else {
                    unsetData();
                    break;
                }
            case 2:
                if (value != null) {
                    setWeibo_url((String) value);
                    break;
                } else {
                    unsetWeibo_url();
                    break;
                }
            case 3:
                if (value != null) {
                    setWeixin_title((String) value);
                    break;
                } else {
                    unsetWeixin_title();
                    break;
                }
            case 4:
                if (value != null) {
                    setShare_url_weixin((String) value);
                    break;
                } else {
                    unsetShare_url_weixin();
                    break;
                }
            case 5:
                if (value != null) {
                    setShare_url_weibo((String) value);
                    break;
                } else {
                    unsetShare_url_weibo();
                    break;
                }
            case 6:
                if (value != null) {
                    setDetail_weixin_url((String) value);
                    break;
                } else {
                    unsetDetail_weixin_url();
                    break;
                }
            case 7:
                if (value != null) {
                    setDetail_weibo_url((String) value);
                    break;
                } else {
                    unsetDetail_weibo_url();
                    break;
                }
        }
    }

    public BBFightShareInfo(String data, String weibo_url, String weixin_title) {
        this();
        this.data = data;
        this.weibo_url = weibo_url;
        this.weixin_title = weixin_title;
    }

    public boolean equals(BBFightShareInfo that) {
        if (that == null) {
            return false;
        }
        boolean isSetData = isSetData();
        boolean isSetData2 = that.isSetData();
        if ((isSetData || isSetData2) && !(isSetData && isSetData2 && this.data.equals(that.data))) {
            return false;
        }
        boolean isSetWeibo_url = isSetWeibo_url();
        boolean isSetWeibo_url2 = that.isSetWeibo_url();
        if ((isSetWeibo_url || isSetWeibo_url2) && !(isSetWeibo_url && isSetWeibo_url2 && this.weibo_url.equals(that.weibo_url))) {
            return false;
        }
        boolean isSetWeixin_title = isSetWeixin_title();
        boolean isSetWeixin_title2 = that.isSetWeixin_title();
        if ((isSetWeixin_title || isSetWeixin_title2) && !(isSetWeixin_title && isSetWeixin_title2 && this.weixin_title.equals(that.weixin_title))) {
            return false;
        }
        boolean isSetShare_url_weixin = isSetShare_url_weixin();
        boolean isSetShare_url_weixin2 = that.isSetShare_url_weixin();
        if ((isSetShare_url_weixin || isSetShare_url_weixin2) && !(isSetShare_url_weixin && isSetShare_url_weixin2 && this.share_url_weixin.equals(that.share_url_weixin))) {
            return false;
        }
        boolean isSetShare_url_weibo = isSetShare_url_weibo();
        boolean isSetShare_url_weibo2 = that.isSetShare_url_weibo();
        if ((isSetShare_url_weibo || isSetShare_url_weibo2) && !(isSetShare_url_weibo && isSetShare_url_weibo2 && this.share_url_weibo.equals(that.share_url_weibo))) {
            return false;
        }
        boolean isSetDetail_weixin_url = isSetDetail_weixin_url();
        boolean isSetDetail_weixin_url2 = that.isSetDetail_weixin_url();
        if ((isSetDetail_weixin_url || isSetDetail_weixin_url2) && !(isSetDetail_weixin_url && isSetDetail_weixin_url2 && this.detail_weixin_url.equals(that.detail_weixin_url))) {
            return false;
        }
        boolean isSetDetail_weibo_url = isSetDetail_weibo_url();
        boolean isSetDetail_weibo_url2 = that.isSetDetail_weibo_url();
        if (isSetDetail_weibo_url || isSetDetail_weibo_url2) {
            return isSetDetail_weibo_url && isSetDetail_weibo_url2 && this.detail_weibo_url.equals(that.detail_weibo_url);
        }
        return true;
    }

    public BBFightShareInfo(BBFightShareInfo other) {
        this.optionals = new _Fields[]{_Fields.SHARE_URL_WEIXIN, _Fields.SHARE_URL_WEIBO, _Fields.DETAIL_WEIXIN_URL, _Fields.DETAIL_WEIBO_URL};
        if (other.isSetData()) {
            this.data = other.data;
        }
        if (other.isSetWeibo_url()) {
            this.weibo_url = other.weibo_url;
        }
        if (other.isSetWeixin_title()) {
            this.weixin_title = other.weixin_title;
        }
        if (other.isSetShare_url_weixin()) {
            this.share_url_weixin = other.share_url_weixin;
        }
        if (other.isSetShare_url_weibo()) {
            this.share_url_weibo = other.share_url_weibo;
        }
        if (other.isSetDetail_weixin_url()) {
            this.detail_weixin_url = other.detail_weixin_url;
        }
        if (other.isSetDetail_weibo_url()) {
            this.detail_weibo_url = other.detail_weibo_url;
        }
    }
}

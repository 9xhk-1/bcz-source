package com.baicizhan.online.bs_fights;

import com.baicizhan.client.business.dataset.provider.a;
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
public class BBOption implements TBase<BBOption, _Fields>, Serializable, Cloneable, Comparable<BBOption> {
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    public String image_url;
    public String mean_cn;
    private _Fields[] optionals;
    public String word;
    private static final TStruct STRUCT_DESC = new TStruct("BBOption");
    private static final TField MEAN_CN_FIELD_DESC = new TField(a.e.C0246a.f16184d, (byte) 11, 1);
    private static final TField WORD_FIELD_DESC = new TField("word", (byte) 11, 2);
    private static final TField IMAGE_URL_FIELD_DESC = new TField("image_url", (byte) 11, 3);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.bs_fights.BBOption$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_fights$BBOption$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$bs_fights$BBOption$_Fields = iArr;
            try {
                iArr[_Fields.MEAN_CN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_fights$BBOption$_Fields[_Fields.WORD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_fights$BBOption$_Fields[_Fields.IMAGE_URL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBOptionStandardScheme extends StandardScheme<BBOption> {
        private BBOptionStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, BBOption struct) throws TException {
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
                            TProtocolUtil.skip(iprot, b11);
                        } else if (b11 == 11) {
                            struct.image_url = iprot.readString();
                            struct.setImage_urlIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 11) {
                        struct.word = iprot.readString();
                        struct.setWordIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 11) {
                    struct.mean_cn = iprot.readString();
                    struct.setMean_cnIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, BBOption struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(BBOption.STRUCT_DESC);
            if (struct.mean_cn != null) {
                oprot.writeFieldBegin(BBOption.MEAN_CN_FIELD_DESC);
                oprot.writeString(struct.mean_cn);
                oprot.writeFieldEnd();
            }
            if (struct.word != null && struct.isSetWord()) {
                oprot.writeFieldBegin(BBOption.WORD_FIELD_DESC);
                oprot.writeString(struct.word);
                oprot.writeFieldEnd();
            }
            if (struct.image_url != null && struct.isSetImage_url()) {
                oprot.writeFieldBegin(BBOption.IMAGE_URL_FIELD_DESC);
                oprot.writeString(struct.image_url);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBOptionStandardSchemeFactory implements SchemeFactory {
        private BBOptionStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BBOptionStandardScheme getScheme() {
            return new BBOptionStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBOptionTupleScheme extends TupleScheme<BBOption> {
        private BBOptionTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, BBOption struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.mean_cn = tTupleProtocol.readString();
            struct.setMean_cnIsSet(true);
            BitSet readBitSet = tTupleProtocol.readBitSet(2);
            if (readBitSet.get(0)) {
                struct.word = tTupleProtocol.readString();
                struct.setWordIsSet(true);
            }
            if (readBitSet.get(1)) {
                struct.image_url = tTupleProtocol.readString();
                struct.setImage_urlIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, BBOption struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeString(struct.mean_cn);
            BitSet bitSet = new BitSet();
            if (struct.isSetWord()) {
                bitSet.set(0);
            }
            if (struct.isSetImage_url()) {
                bitSet.set(1);
            }
            tTupleProtocol.writeBitSet(bitSet, 2);
            if (struct.isSetWord()) {
                tTupleProtocol.writeString(struct.word);
            }
            if (struct.isSetImage_url()) {
                tTupleProtocol.writeString(struct.image_url);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBOptionTupleSchemeFactory implements SchemeFactory {
        private BBOptionTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BBOptionTupleScheme getScheme() {
            return new BBOptionTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        MEAN_CN(1, a.e.C0246a.f16184d),
        WORD(2, "word"),
        IMAGE_URL(3, "image_url");

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
                return MEAN_CN;
            }
            if (fieldId == 2) {
                return WORD;
            }
            if (fieldId != 3) {
                return null;
            }
            return IMAGE_URL;
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
        hashMap.put(StandardScheme.class, new BBOptionStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new BBOptionTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.MEAN_CN, (_Fields) new FieldMetaData(a.e.C0246a.f16184d, (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.WORD, (_Fields) new FieldMetaData("word", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.IMAGE_URL, (_Fields) new FieldMetaData("image_url", (byte) 2, new FieldValueMetaData((byte) 11)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(BBOption.class, unmodifiableMap);
    }

    public BBOption() {
        this.optionals = new _Fields[]{_Fields.WORD, _Fields.IMAGE_URL};
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
        this.mean_cn = null;
        this.word = null;
        this.image_url = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof BBOption)) {
            return equals((BBOption) that);
        }
        return false;
    }

    public String getImage_url() {
        return this.image_url;
    }

    public String getMean_cn() {
        return this.mean_cn;
    }

    public String getWord() {
        return this.word;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetImage_url() {
        return this.image_url != null;
    }

    public boolean isSetMean_cn() {
        return this.mean_cn != null;
    }

    public boolean isSetWord() {
        return this.word != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public BBOption setImage_url(String image_url) {
        this.image_url = image_url;
        return this;
    }

    public void setImage_urlIsSet(boolean value) {
        if (value) {
            return;
        }
        this.image_url = null;
    }

    public BBOption setMean_cn(String mean_cn) {
        this.mean_cn = mean_cn;
        return this;
    }

    public void setMean_cnIsSet(boolean value) {
        if (value) {
            return;
        }
        this.mean_cn = null;
    }

    public BBOption setWord(String word) {
        this.word = word;
        return this;
    }

    public void setWordIsSet(boolean value) {
        if (value) {
            return;
        }
        this.word = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("BBOption(");
        sb2.append("mean_cn:");
        String str = this.mean_cn;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        if (isSetWord()) {
            sb2.append(j2.O);
            sb2.append("word:");
            String str2 = this.word;
            if (str2 == null) {
                sb2.append("null");
            } else {
                sb2.append(str2);
            }
        }
        if (isSetImage_url()) {
            sb2.append(j2.O);
            sb2.append("image_url:");
            String str3 = this.image_url;
            if (str3 == null) {
                sb2.append("null");
            } else {
                sb2.append(str3);
            }
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetImage_url() {
        this.image_url = null;
    }

    public void unsetMean_cn() {
        this.mean_cn = null;
    }

    public void unsetWord() {
        this.word = null;
    }

    public void validate() throws TException {
        if (this.mean_cn != null) {
            return;
        }
        throw new TProtocolException("Required field 'mean_cn' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(BBOption other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo4 = Boolean.valueOf(isSetMean_cn()).compareTo(Boolean.valueOf(other.isSetMean_cn()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (isSetMean_cn() && (compareTo3 = TBaseHelper.compareTo(this.mean_cn, other.mean_cn)) != 0) {
            return compareTo3;
        }
        int compareTo5 = Boolean.valueOf(isSetWord()).compareTo(Boolean.valueOf(other.isSetWord()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (isSetWord() && (compareTo2 = TBaseHelper.compareTo(this.word, other.word)) != 0) {
            return compareTo2;
        }
        int compareTo6 = Boolean.valueOf(isSetImage_url()).compareTo(Boolean.valueOf(other.isSetImage_url()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (!isSetImage_url() || (compareTo = TBaseHelper.compareTo(this.image_url, other.image_url)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<BBOption, _Fields> deepCopy2() {
        return new BBOption(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BBOption$_Fields[field.ordinal()];
        if (i11 == 1) {
            return getMean_cn();
        }
        if (i11 == 2) {
            return getWord();
        }
        if (i11 == 3) {
            return getImage_url();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BBOption$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetMean_cn();
        }
        if (i11 == 2) {
            return isSetWord();
        }
        if (i11 == 3) {
            return isSetImage_url();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BBOption$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetMean_cn();
                return;
            } else {
                setMean_cn((String) value);
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetWord();
                return;
            } else {
                setWord((String) value);
                return;
            }
        }
        if (i11 != 3) {
            return;
        }
        if (value == null) {
            unsetImage_url();
        } else {
            setImage_url((String) value);
        }
    }

    public BBOption(String mean_cn) {
        this();
        this.mean_cn = mean_cn;
    }

    public boolean equals(BBOption that) {
        if (that == null) {
            return false;
        }
        boolean isSetMean_cn = isSetMean_cn();
        boolean isSetMean_cn2 = that.isSetMean_cn();
        if ((isSetMean_cn || isSetMean_cn2) && !(isSetMean_cn && isSetMean_cn2 && this.mean_cn.equals(that.mean_cn))) {
            return false;
        }
        boolean isSetWord = isSetWord();
        boolean isSetWord2 = that.isSetWord();
        if ((isSetWord || isSetWord2) && !(isSetWord && isSetWord2 && this.word.equals(that.word))) {
            return false;
        }
        boolean isSetImage_url = isSetImage_url();
        boolean isSetImage_url2 = that.isSetImage_url();
        if (isSetImage_url || isSetImage_url2) {
            return isSetImage_url && isSetImage_url2 && this.image_url.equals(that.image_url);
        }
        return true;
    }

    public BBOption(BBOption other) {
        this.optionals = new _Fields[]{_Fields.WORD, _Fields.IMAGE_URL};
        if (other.isSetMean_cn()) {
            this.mean_cn = other.mean_cn;
        }
        if (other.isSetWord()) {
            this.word = other.word;
        }
        if (other.isSetImage_url()) {
            this.image_url = other.image_url;
        }
    }
}

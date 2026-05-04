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
public class BBSubmitReply implements TBase<BBSubmitReply, _Fields>, Serializable, Cloneable, Comparable<BBSubmitReply> {
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private _Fields[] optionals;
    public String prompt;
    public BBFightShareInfo share_info;
    private static final TStruct STRUCT_DESC = new TStruct("BBSubmitReply");
    private static final TField PROMPT_FIELD_DESC = new TField("prompt", (byte) 11, 1);
    private static final TField SHARE_INFO_FIELD_DESC = new TField("share_info", (byte) 12, 2);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.bs_fights.BBSubmitReply$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_fights$BBSubmitReply$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$bs_fights$BBSubmitReply$_Fields = iArr;
            try {
                iArr[_Fields.PROMPT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_fights$BBSubmitReply$_Fields[_Fields.SHARE_INFO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBSubmitReplyStandardScheme extends StandardScheme<BBSubmitReply> {
        private BBSubmitReplyStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, BBSubmitReply struct) throws TException {
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
                        TProtocolUtil.skip(iprot, b11);
                    } else if (b11 == 12) {
                        BBFightShareInfo bBFightShareInfo = new BBFightShareInfo();
                        struct.share_info = bBFightShareInfo;
                        bBFightShareInfo.read(iprot);
                        struct.setShare_infoIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 11) {
                    struct.prompt = iprot.readString();
                    struct.setPromptIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, BBSubmitReply struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(BBSubmitReply.STRUCT_DESC);
            if (struct.prompt != null) {
                oprot.writeFieldBegin(BBSubmitReply.PROMPT_FIELD_DESC);
                oprot.writeString(struct.prompt);
                oprot.writeFieldEnd();
            }
            if (struct.share_info != null && struct.isSetShare_info()) {
                oprot.writeFieldBegin(BBSubmitReply.SHARE_INFO_FIELD_DESC);
                struct.share_info.write(oprot);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBSubmitReplyStandardSchemeFactory implements SchemeFactory {
        private BBSubmitReplyStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BBSubmitReplyStandardScheme getScheme() {
            return new BBSubmitReplyStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBSubmitReplyTupleScheme extends TupleScheme<BBSubmitReply> {
        private BBSubmitReplyTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, BBSubmitReply struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.prompt = tTupleProtocol.readString();
            struct.setPromptIsSet(true);
            if (tTupleProtocol.readBitSet(1).get(0)) {
                BBFightShareInfo bBFightShareInfo = new BBFightShareInfo();
                struct.share_info = bBFightShareInfo;
                bBFightShareInfo.read(tTupleProtocol);
                struct.setShare_infoIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, BBSubmitReply struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeString(struct.prompt);
            BitSet bitSet = new BitSet();
            if (struct.isSetShare_info()) {
                bitSet.set(0);
            }
            tTupleProtocol.writeBitSet(bitSet, 1);
            if (struct.isSetShare_info()) {
                struct.share_info.write(tTupleProtocol);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBSubmitReplyTupleSchemeFactory implements SchemeFactory {
        private BBSubmitReplyTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BBSubmitReplyTupleScheme getScheme() {
            return new BBSubmitReplyTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        PROMPT(1, "prompt"),
        SHARE_INFO(2, "share_info");

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
                return PROMPT;
            }
            if (fieldId != 2) {
                return null;
            }
            return SHARE_INFO;
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
        hashMap.put(StandardScheme.class, new BBSubmitReplyStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new BBSubmitReplyTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.PROMPT, (_Fields) new FieldMetaData("prompt", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.SHARE_INFO, (_Fields) new FieldMetaData("share_info", (byte) 2, new StructMetaData((byte) 12, BBFightShareInfo.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(BBSubmitReply.class, unmodifiableMap);
    }

    public BBSubmitReply() {
        this.optionals = new _Fields[]{_Fields.SHARE_INFO};
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
        this.prompt = null;
        this.share_info = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof BBSubmitReply)) {
            return equals((BBSubmitReply) that);
        }
        return false;
    }

    public String getPrompt() {
        return this.prompt;
    }

    public BBFightShareInfo getShare_info() {
        return this.share_info;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetPrompt() {
        return this.prompt != null;
    }

    public boolean isSetShare_info() {
        return this.share_info != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public BBSubmitReply setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }

    public void setPromptIsSet(boolean value) {
        if (value) {
            return;
        }
        this.prompt = null;
    }

    public BBSubmitReply setShare_info(BBFightShareInfo share_info) {
        this.share_info = share_info;
        return this;
    }

    public void setShare_infoIsSet(boolean value) {
        if (value) {
            return;
        }
        this.share_info = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("BBSubmitReply(");
        sb2.append("prompt:");
        String str = this.prompt;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        if (isSetShare_info()) {
            sb2.append(j2.O);
            sb2.append("share_info:");
            BBFightShareInfo bBFightShareInfo = this.share_info;
            if (bBFightShareInfo == null) {
                sb2.append("null");
            } else {
                sb2.append(bBFightShareInfo);
            }
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetPrompt() {
        this.prompt = null;
    }

    public void unsetShare_info() {
        this.share_info = null;
    }

    public void validate() throws TException {
        if (this.prompt == null) {
            throw new TProtocolException("Required field 'prompt' was not present! Struct: " + toString());
        }
        BBFightShareInfo bBFightShareInfo = this.share_info;
        if (bBFightShareInfo != null) {
            bBFightShareInfo.validate();
        }
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(BBSubmitReply other) {
        int compareTo;
        int compareTo2;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo3 = Boolean.valueOf(isSetPrompt()).compareTo(Boolean.valueOf(other.isSetPrompt()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (isSetPrompt() && (compareTo2 = TBaseHelper.compareTo(this.prompt, other.prompt)) != 0) {
            return compareTo2;
        }
        int compareTo4 = Boolean.valueOf(isSetShare_info()).compareTo(Boolean.valueOf(other.isSetShare_info()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (!isSetShare_info() || (compareTo = TBaseHelper.compareTo((Comparable) this.share_info, (Comparable) other.share_info)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<BBSubmitReply, _Fields> deepCopy2() {
        return new BBSubmitReply(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BBSubmitReply$_Fields[field.ordinal()];
        if (i11 == 1) {
            return getPrompt();
        }
        if (i11 == 2) {
            return getShare_info();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BBSubmitReply$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetPrompt();
        }
        if (i11 == 2) {
            return isSetShare_info();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BBSubmitReply$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetPrompt();
                return;
            } else {
                setPrompt((String) value);
                return;
            }
        }
        if (i11 != 2) {
            return;
        }
        if (value == null) {
            unsetShare_info();
        } else {
            setShare_info((BBFightShareInfo) value);
        }
    }

    public BBSubmitReply(String prompt) {
        this();
        this.prompt = prompt;
    }

    public boolean equals(BBSubmitReply that) {
        if (that == null) {
            return false;
        }
        boolean isSetPrompt = isSetPrompt();
        boolean isSetPrompt2 = that.isSetPrompt();
        if ((isSetPrompt || isSetPrompt2) && !(isSetPrompt && isSetPrompt2 && this.prompt.equals(that.prompt))) {
            return false;
        }
        boolean isSetShare_info = isSetShare_info();
        boolean isSetShare_info2 = that.isSetShare_info();
        if (isSetShare_info || isSetShare_info2) {
            return isSetShare_info && isSetShare_info2 && this.share_info.equals(that.share_info);
        }
        return true;
    }

    public BBSubmitReply(BBSubmitReply other) {
        this.optionals = new _Fields[]{_Fields.SHARE_INFO};
        if (other.isSetPrompt()) {
            this.prompt = other.prompt;
        }
        if (other.isSetShare_info()) {
            this.share_info = new BBFightShareInfo(other.share_info);
        }
    }
}

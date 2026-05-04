package com.baicizhan.online.strategy_api;

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
import org.apache.thrift.meta_data.StructMetaData;
import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.protocol.TField;
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

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class AppHomePageMemberStageInfo implements TBase<AppHomePageMemberStageInfo, _Fields>, Serializable, Cloneable, Comparable<AppHomePageMemberStageInfo> {
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    public MemberPopupSaleInfo activity_icon_member_sale_info;
    private _Fields[] optionals;
    public MemberPopupSaleInfo popup_member_sale_info;
    private static final TStruct STRUCT_DESC = new TStruct("AppHomePageMemberStageInfo");
    private static final TField ACTIVITY_ICON_MEMBER_SALE_INFO_FIELD_DESC = new TField("activity_icon_member_sale_info", (byte) 12, 1);
    private static final TField POPUP_MEMBER_SALE_INFO_FIELD_DESC = new TField("popup_member_sale_info", (byte) 12, 2);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.strategy_api.AppHomePageMemberStageInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$strategy_api$AppHomePageMemberStageInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$strategy_api$AppHomePageMemberStageInfo$_Fields = iArr;
            try {
                iArr[_Fields.ACTIVITY_ICON_MEMBER_SALE_INFO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$strategy_api$AppHomePageMemberStageInfo$_Fields[_Fields.POPUP_MEMBER_SALE_INFO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AppHomePageMemberStageInfoStandardScheme extends StandardScheme<AppHomePageMemberStageInfo> {
        private AppHomePageMemberStageInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, AppHomePageMemberStageInfo struct) throws TException {
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
                        MemberPopupSaleInfo memberPopupSaleInfo = new MemberPopupSaleInfo();
                        struct.popup_member_sale_info = memberPopupSaleInfo;
                        memberPopupSaleInfo.read(iprot);
                        struct.setPopup_member_sale_infoIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 12) {
                    MemberPopupSaleInfo memberPopupSaleInfo2 = new MemberPopupSaleInfo();
                    struct.activity_icon_member_sale_info = memberPopupSaleInfo2;
                    memberPopupSaleInfo2.read(iprot);
                    struct.setActivity_icon_member_sale_infoIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, AppHomePageMemberStageInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(AppHomePageMemberStageInfo.STRUCT_DESC);
            if (struct.activity_icon_member_sale_info != null && struct.isSetActivity_icon_member_sale_info()) {
                oprot.writeFieldBegin(AppHomePageMemberStageInfo.ACTIVITY_ICON_MEMBER_SALE_INFO_FIELD_DESC);
                struct.activity_icon_member_sale_info.write(oprot);
                oprot.writeFieldEnd();
            }
            if (struct.popup_member_sale_info != null && struct.isSetPopup_member_sale_info()) {
                oprot.writeFieldBegin(AppHomePageMemberStageInfo.POPUP_MEMBER_SALE_INFO_FIELD_DESC);
                struct.popup_member_sale_info.write(oprot);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AppHomePageMemberStageInfoStandardSchemeFactory implements SchemeFactory {
        private AppHomePageMemberStageInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public AppHomePageMemberStageInfoStandardScheme getScheme() {
            return new AppHomePageMemberStageInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AppHomePageMemberStageInfoTupleScheme extends TupleScheme<AppHomePageMemberStageInfo> {
        private AppHomePageMemberStageInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, AppHomePageMemberStageInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            BitSet readBitSet = tTupleProtocol.readBitSet(2);
            if (readBitSet.get(0)) {
                MemberPopupSaleInfo memberPopupSaleInfo = new MemberPopupSaleInfo();
                struct.activity_icon_member_sale_info = memberPopupSaleInfo;
                memberPopupSaleInfo.read(tTupleProtocol);
                struct.setActivity_icon_member_sale_infoIsSet(true);
            }
            if (readBitSet.get(1)) {
                MemberPopupSaleInfo memberPopupSaleInfo2 = new MemberPopupSaleInfo();
                struct.popup_member_sale_info = memberPopupSaleInfo2;
                memberPopupSaleInfo2.read(tTupleProtocol);
                struct.setPopup_member_sale_infoIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, AppHomePageMemberStageInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            BitSet bitSet = new BitSet();
            if (struct.isSetActivity_icon_member_sale_info()) {
                bitSet.set(0);
            }
            if (struct.isSetPopup_member_sale_info()) {
                bitSet.set(1);
            }
            tTupleProtocol.writeBitSet(bitSet, 2);
            if (struct.isSetActivity_icon_member_sale_info()) {
                struct.activity_icon_member_sale_info.write(tTupleProtocol);
            }
            if (struct.isSetPopup_member_sale_info()) {
                struct.popup_member_sale_info.write(tTupleProtocol);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AppHomePageMemberStageInfoTupleSchemeFactory implements SchemeFactory {
        private AppHomePageMemberStageInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public AppHomePageMemberStageInfoTupleScheme getScheme() {
            return new AppHomePageMemberStageInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        ACTIVITY_ICON_MEMBER_SALE_INFO(1, "activity_icon_member_sale_info"),
        POPUP_MEMBER_SALE_INFO(2, "popup_member_sale_info");

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
                return ACTIVITY_ICON_MEMBER_SALE_INFO;
            }
            if (fieldId != 2) {
                return null;
            }
            return POPUP_MEMBER_SALE_INFO;
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
        hashMap.put(StandardScheme.class, new AppHomePageMemberStageInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new AppHomePageMemberStageInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.ACTIVITY_ICON_MEMBER_SALE_INFO, (_Fields) new FieldMetaData("activity_icon_member_sale_info", (byte) 2, new StructMetaData((byte) 12, MemberPopupSaleInfo.class)));
        enumMap.put((EnumMap) _Fields.POPUP_MEMBER_SALE_INFO, (_Fields) new FieldMetaData("popup_member_sale_info", (byte) 2, new StructMetaData((byte) 12, MemberPopupSaleInfo.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(AppHomePageMemberStageInfo.class, unmodifiableMap);
    }

    public AppHomePageMemberStageInfo() {
        this.optionals = new _Fields[]{_Fields.ACTIVITY_ICON_MEMBER_SALE_INFO, _Fields.POPUP_MEMBER_SALE_INFO};
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
        this.activity_icon_member_sale_info = null;
        this.popup_member_sale_info = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof AppHomePageMemberStageInfo)) {
            return equals((AppHomePageMemberStageInfo) that);
        }
        return false;
    }

    public MemberPopupSaleInfo getActivity_icon_member_sale_info() {
        return this.activity_icon_member_sale_info;
    }

    public MemberPopupSaleInfo getPopup_member_sale_info() {
        return this.popup_member_sale_info;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetActivity_icon_member_sale_info() {
        return this.activity_icon_member_sale_info != null;
    }

    public boolean isSetPopup_member_sale_info() {
        return this.popup_member_sale_info != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public AppHomePageMemberStageInfo setActivity_icon_member_sale_info(MemberPopupSaleInfo activity_icon_member_sale_info) {
        this.activity_icon_member_sale_info = activity_icon_member_sale_info;
        return this;
    }

    public void setActivity_icon_member_sale_infoIsSet(boolean value) {
        if (value) {
            return;
        }
        this.activity_icon_member_sale_info = null;
    }

    public AppHomePageMemberStageInfo setPopup_member_sale_info(MemberPopupSaleInfo popup_member_sale_info) {
        this.popup_member_sale_info = popup_member_sale_info;
        return this;
    }

    public void setPopup_member_sale_infoIsSet(boolean value) {
        if (value) {
            return;
        }
        this.popup_member_sale_info = null;
    }

    public String toString() {
        boolean z11;
        StringBuilder sb2 = new StringBuilder("AppHomePageMemberStageInfo(");
        if (isSetActivity_icon_member_sale_info()) {
            sb2.append("activity_icon_member_sale_info:");
            MemberPopupSaleInfo memberPopupSaleInfo = this.activity_icon_member_sale_info;
            if (memberPopupSaleInfo == null) {
                sb2.append("null");
            } else {
                sb2.append(memberPopupSaleInfo);
            }
            z11 = false;
        } else {
            z11 = true;
        }
        if (isSetPopup_member_sale_info()) {
            if (!z11) {
                sb2.append(j2.O);
            }
            sb2.append("popup_member_sale_info:");
            MemberPopupSaleInfo memberPopupSaleInfo2 = this.popup_member_sale_info;
            if (memberPopupSaleInfo2 == null) {
                sb2.append("null");
            } else {
                sb2.append(memberPopupSaleInfo2);
            }
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetActivity_icon_member_sale_info() {
        this.activity_icon_member_sale_info = null;
    }

    public void unsetPopup_member_sale_info() {
        this.popup_member_sale_info = null;
    }

    public void validate() throws TException {
        MemberPopupSaleInfo memberPopupSaleInfo = this.activity_icon_member_sale_info;
        if (memberPopupSaleInfo != null) {
            memberPopupSaleInfo.validate();
        }
        MemberPopupSaleInfo memberPopupSaleInfo2 = this.popup_member_sale_info;
        if (memberPopupSaleInfo2 != null) {
            memberPopupSaleInfo2.validate();
        }
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(AppHomePageMemberStageInfo other) {
        int compareTo;
        int compareTo2;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo3 = Boolean.valueOf(isSetActivity_icon_member_sale_info()).compareTo(Boolean.valueOf(other.isSetActivity_icon_member_sale_info()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (isSetActivity_icon_member_sale_info() && (compareTo2 = TBaseHelper.compareTo((Comparable) this.activity_icon_member_sale_info, (Comparable) other.activity_icon_member_sale_info)) != 0) {
            return compareTo2;
        }
        int compareTo4 = Boolean.valueOf(isSetPopup_member_sale_info()).compareTo(Boolean.valueOf(other.isSetPopup_member_sale_info()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (!isSetPopup_member_sale_info() || (compareTo = TBaseHelper.compareTo((Comparable) this.popup_member_sale_info, (Comparable) other.popup_member_sale_info)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<AppHomePageMemberStageInfo, _Fields> deepCopy2() {
        return new AppHomePageMemberStageInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$strategy_api$AppHomePageMemberStageInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return getActivity_icon_member_sale_info();
        }
        if (i11 == 2) {
            return getPopup_member_sale_info();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$strategy_api$AppHomePageMemberStageInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetActivity_icon_member_sale_info();
        }
        if (i11 == 2) {
            return isSetPopup_member_sale_info();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$strategy_api$AppHomePageMemberStageInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetActivity_icon_member_sale_info();
                return;
            } else {
                setActivity_icon_member_sale_info((MemberPopupSaleInfo) value);
                return;
            }
        }
        if (i11 != 2) {
            return;
        }
        if (value == null) {
            unsetPopup_member_sale_info();
        } else {
            setPopup_member_sale_info((MemberPopupSaleInfo) value);
        }
    }

    public AppHomePageMemberStageInfo(AppHomePageMemberStageInfo other) {
        this.optionals = new _Fields[]{_Fields.ACTIVITY_ICON_MEMBER_SALE_INFO, _Fields.POPUP_MEMBER_SALE_INFO};
        if (other.isSetActivity_icon_member_sale_info()) {
            this.activity_icon_member_sale_info = new MemberPopupSaleInfo(other.activity_icon_member_sale_info);
        }
        if (other.isSetPopup_member_sale_info()) {
            this.popup_member_sale_info = new MemberPopupSaleInfo(other.popup_member_sale_info);
        }
    }

    public boolean equals(AppHomePageMemberStageInfo that) {
        if (that == null) {
            return false;
        }
        boolean isSetActivity_icon_member_sale_info = isSetActivity_icon_member_sale_info();
        boolean isSetActivity_icon_member_sale_info2 = that.isSetActivity_icon_member_sale_info();
        if ((isSetActivity_icon_member_sale_info || isSetActivity_icon_member_sale_info2) && !(isSetActivity_icon_member_sale_info && isSetActivity_icon_member_sale_info2 && this.activity_icon_member_sale_info.equals(that.activity_icon_member_sale_info))) {
            return false;
        }
        boolean isSetPopup_member_sale_info = isSetPopup_member_sale_info();
        boolean isSetPopup_member_sale_info2 = that.isSetPopup_member_sale_info();
        if (isSetPopup_member_sale_info || isSetPopup_member_sale_info2) {
            return isSetPopup_member_sale_info && isSetPopup_member_sale_info2 && this.popup_member_sale_info.equals(that.popup_member_sale_info);
        }
        return true;
    }
}

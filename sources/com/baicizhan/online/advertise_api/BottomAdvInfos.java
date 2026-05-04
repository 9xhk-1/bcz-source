package com.baicizhan.online.advertise_api;

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
import org.apache.thrift.TBase;
import org.apache.thrift.TBaseHelper;
import org.apache.thrift.TException;
import org.apache.thrift.TFieldIdEnum;
import org.apache.thrift.meta_data.FieldMetaData;
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

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class BottomAdvInfos implements TBase<BottomAdvInfos, _Fields>, Serializable, Cloneable, Comparable<BottomAdvInfos> {
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    public List<MainViewBottomAdv> carousel_banner;
    public List<MainViewBottomAdv> grid_ad;
    public List<MainViewBottomAdv> horizontal_banner;
    private _Fields[] optionals;
    private static final TStruct STRUCT_DESC = new TStruct("BottomAdvInfos");
    private static final TField CAROUSEL_BANNER_FIELD_DESC = new TField("carousel_banner", (byte) 15, 1);
    private static final TField HORIZONTAL_BANNER_FIELD_DESC = new TField("horizontal_banner", (byte) 15, 2);
    private static final TField GRID_AD_FIELD_DESC = new TField("grid_ad", (byte) 15, 3);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.advertise_api.BottomAdvInfos$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$advertise_api$BottomAdvInfos$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$advertise_api$BottomAdvInfos$_Fields = iArr;
            try {
                iArr[_Fields.CAROUSEL_BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$advertise_api$BottomAdvInfos$_Fields[_Fields.HORIZONTAL_BANNER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$advertise_api$BottomAdvInfos$_Fields[_Fields.GRID_AD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BottomAdvInfosStandardScheme extends StandardScheme<BottomAdvInfos> {
        private BottomAdvInfosStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, BottomAdvInfos struct) throws TException {
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
                int i11 = 0;
                if (s11 != 1) {
                    if (s11 != 2) {
                        if (s11 != 3) {
                            TProtocolUtil.skip(iprot, b11);
                        } else if (b11 == 15) {
                            TList readListBegin = iprot.readListBegin();
                            struct.grid_ad = new ArrayList(readListBegin.size);
                            while (i11 < readListBegin.size) {
                                MainViewBottomAdv mainViewBottomAdv = new MainViewBottomAdv();
                                mainViewBottomAdv.read(iprot);
                                struct.grid_ad.add(mainViewBottomAdv);
                                i11++;
                            }
                            iprot.readListEnd();
                            struct.setGrid_adIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 15) {
                        TList readListBegin2 = iprot.readListBegin();
                        struct.horizontal_banner = new ArrayList(readListBegin2.size);
                        while (i11 < readListBegin2.size) {
                            MainViewBottomAdv mainViewBottomAdv2 = new MainViewBottomAdv();
                            mainViewBottomAdv2.read(iprot);
                            struct.horizontal_banner.add(mainViewBottomAdv2);
                            i11++;
                        }
                        iprot.readListEnd();
                        struct.setHorizontal_bannerIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 15) {
                    TList readListBegin3 = iprot.readListBegin();
                    struct.carousel_banner = new ArrayList(readListBegin3.size);
                    while (i11 < readListBegin3.size) {
                        MainViewBottomAdv mainViewBottomAdv3 = new MainViewBottomAdv();
                        mainViewBottomAdv3.read(iprot);
                        struct.carousel_banner.add(mainViewBottomAdv3);
                        i11++;
                    }
                    iprot.readListEnd();
                    struct.setCarousel_bannerIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, BottomAdvInfos struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(BottomAdvInfos.STRUCT_DESC);
            if (struct.carousel_banner != null && struct.isSetCarousel_banner()) {
                oprot.writeFieldBegin(BottomAdvInfos.CAROUSEL_BANNER_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 12, struct.carousel_banner.size()));
                Iterator<MainViewBottomAdv> it = struct.carousel_banner.iterator();
                while (it.hasNext()) {
                    it.next().write(oprot);
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            if (struct.horizontal_banner != null && struct.isSetHorizontal_banner()) {
                oprot.writeFieldBegin(BottomAdvInfos.HORIZONTAL_BANNER_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 12, struct.horizontal_banner.size()));
                Iterator<MainViewBottomAdv> it2 = struct.horizontal_banner.iterator();
                while (it2.hasNext()) {
                    it2.next().write(oprot);
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            if (struct.grid_ad != null && struct.isSetGrid_ad()) {
                oprot.writeFieldBegin(BottomAdvInfos.GRID_AD_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 12, struct.grid_ad.size()));
                Iterator<MainViewBottomAdv> it3 = struct.grid_ad.iterator();
                while (it3.hasNext()) {
                    it3.next().write(oprot);
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BottomAdvInfosStandardSchemeFactory implements SchemeFactory {
        private BottomAdvInfosStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BottomAdvInfosStandardScheme getScheme() {
            return new BottomAdvInfosStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BottomAdvInfosTupleScheme extends TupleScheme<BottomAdvInfos> {
        private BottomAdvInfosTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, BottomAdvInfos struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            BitSet readBitSet = tTupleProtocol.readBitSet(3);
            if (readBitSet.get(0)) {
                TList tList = new TList((byte) 12, tTupleProtocol.readI32());
                struct.carousel_banner = new ArrayList(tList.size);
                for (int i11 = 0; i11 < tList.size; i11++) {
                    MainViewBottomAdv mainViewBottomAdv = new MainViewBottomAdv();
                    mainViewBottomAdv.read(tTupleProtocol);
                    struct.carousel_banner.add(mainViewBottomAdv);
                }
                struct.setCarousel_bannerIsSet(true);
            }
            if (readBitSet.get(1)) {
                TList tList2 = new TList((byte) 12, tTupleProtocol.readI32());
                struct.horizontal_banner = new ArrayList(tList2.size);
                for (int i12 = 0; i12 < tList2.size; i12++) {
                    MainViewBottomAdv mainViewBottomAdv2 = new MainViewBottomAdv();
                    mainViewBottomAdv2.read(tTupleProtocol);
                    struct.horizontal_banner.add(mainViewBottomAdv2);
                }
                struct.setHorizontal_bannerIsSet(true);
            }
            if (readBitSet.get(2)) {
                TList tList3 = new TList((byte) 12, tTupleProtocol.readI32());
                struct.grid_ad = new ArrayList(tList3.size);
                for (int i13 = 0; i13 < tList3.size; i13++) {
                    MainViewBottomAdv mainViewBottomAdv3 = new MainViewBottomAdv();
                    mainViewBottomAdv3.read(tTupleProtocol);
                    struct.grid_ad.add(mainViewBottomAdv3);
                }
                struct.setGrid_adIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, BottomAdvInfos struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            BitSet bitSet = new BitSet();
            if (struct.isSetCarousel_banner()) {
                bitSet.set(0);
            }
            if (struct.isSetHorizontal_banner()) {
                bitSet.set(1);
            }
            if (struct.isSetGrid_ad()) {
                bitSet.set(2);
            }
            tTupleProtocol.writeBitSet(bitSet, 3);
            if (struct.isSetCarousel_banner()) {
                tTupleProtocol.writeI32(struct.carousel_banner.size());
                Iterator<MainViewBottomAdv> it = struct.carousel_banner.iterator();
                while (it.hasNext()) {
                    it.next().write(tTupleProtocol);
                }
            }
            if (struct.isSetHorizontal_banner()) {
                tTupleProtocol.writeI32(struct.horizontal_banner.size());
                Iterator<MainViewBottomAdv> it2 = struct.horizontal_banner.iterator();
                while (it2.hasNext()) {
                    it2.next().write(tTupleProtocol);
                }
            }
            if (struct.isSetGrid_ad()) {
                tTupleProtocol.writeI32(struct.grid_ad.size());
                Iterator<MainViewBottomAdv> it3 = struct.grid_ad.iterator();
                while (it3.hasNext()) {
                    it3.next().write(tTupleProtocol);
                }
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BottomAdvInfosTupleSchemeFactory implements SchemeFactory {
        private BottomAdvInfosTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BottomAdvInfosTupleScheme getScheme() {
            return new BottomAdvInfosTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        CAROUSEL_BANNER(1, "carousel_banner"),
        HORIZONTAL_BANNER(2, "horizontal_banner"),
        GRID_AD(3, "grid_ad");

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
                return CAROUSEL_BANNER;
            }
            if (fieldId == 2) {
                return HORIZONTAL_BANNER;
            }
            if (fieldId != 3) {
                return null;
            }
            return GRID_AD;
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
        hashMap.put(StandardScheme.class, new BottomAdvInfosStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new BottomAdvInfosTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.CAROUSEL_BANNER, (_Fields) new FieldMetaData("carousel_banner", (byte) 2, new ListMetaData((byte) 15, new StructMetaData((byte) 12, MainViewBottomAdv.class))));
        enumMap.put((EnumMap) _Fields.HORIZONTAL_BANNER, (_Fields) new FieldMetaData("horizontal_banner", (byte) 2, new ListMetaData((byte) 15, new StructMetaData((byte) 12, MainViewBottomAdv.class))));
        enumMap.put((EnumMap) _Fields.GRID_AD, (_Fields) new FieldMetaData("grid_ad", (byte) 2, new ListMetaData((byte) 15, new StructMetaData((byte) 12, MainViewBottomAdv.class))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(BottomAdvInfos.class, unmodifiableMap);
    }

    public BottomAdvInfos() {
        this.optionals = new _Fields[]{_Fields.CAROUSEL_BANNER, _Fields.HORIZONTAL_BANNER, _Fields.GRID_AD};
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

    public void addToCarousel_banner(MainViewBottomAdv elem) {
        if (this.carousel_banner == null) {
            this.carousel_banner = new ArrayList();
        }
        this.carousel_banner.add(elem);
    }

    public void addToGrid_ad(MainViewBottomAdv elem) {
        if (this.grid_ad == null) {
            this.grid_ad = new ArrayList();
        }
        this.grid_ad.add(elem);
    }

    public void addToHorizontal_banner(MainViewBottomAdv elem) {
        if (this.horizontal_banner == null) {
            this.horizontal_banner = new ArrayList();
        }
        this.horizontal_banner.add(elem);
    }

    @Override // org.apache.thrift.TBase
    public void clear() {
        this.carousel_banner = null;
        this.horizontal_banner = null;
        this.grid_ad = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof BottomAdvInfos)) {
            return equals((BottomAdvInfos) that);
        }
        return false;
    }

    public List<MainViewBottomAdv> getCarousel_banner() {
        return this.carousel_banner;
    }

    public Iterator<MainViewBottomAdv> getCarousel_bannerIterator() {
        List<MainViewBottomAdv> list = this.carousel_banner;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getCarousel_bannerSize() {
        List<MainViewBottomAdv> list = this.carousel_banner;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public List<MainViewBottomAdv> getGrid_ad() {
        return this.grid_ad;
    }

    public Iterator<MainViewBottomAdv> getGrid_adIterator() {
        List<MainViewBottomAdv> list = this.grid_ad;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getGrid_adSize() {
        List<MainViewBottomAdv> list = this.grid_ad;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public List<MainViewBottomAdv> getHorizontal_banner() {
        return this.horizontal_banner;
    }

    public Iterator<MainViewBottomAdv> getHorizontal_bannerIterator() {
        List<MainViewBottomAdv> list = this.horizontal_banner;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getHorizontal_bannerSize() {
        List<MainViewBottomAdv> list = this.horizontal_banner;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetCarousel_banner() {
        return this.carousel_banner != null;
    }

    public boolean isSetGrid_ad() {
        return this.grid_ad != null;
    }

    public boolean isSetHorizontal_banner() {
        return this.horizontal_banner != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public BottomAdvInfos setCarousel_banner(List<MainViewBottomAdv> carousel_banner) {
        this.carousel_banner = carousel_banner;
        return this;
    }

    public void setCarousel_bannerIsSet(boolean value) {
        if (value) {
            return;
        }
        this.carousel_banner = null;
    }

    public BottomAdvInfos setGrid_ad(List<MainViewBottomAdv> grid_ad) {
        this.grid_ad = grid_ad;
        return this;
    }

    public void setGrid_adIsSet(boolean value) {
        if (value) {
            return;
        }
        this.grid_ad = null;
    }

    public BottomAdvInfos setHorizontal_banner(List<MainViewBottomAdv> horizontal_banner) {
        this.horizontal_banner = horizontal_banner;
        return this;
    }

    public void setHorizontal_bannerIsSet(boolean value) {
        if (value) {
            return;
        }
        this.horizontal_banner = null;
    }

    public String toString() {
        boolean z11;
        StringBuilder sb2 = new StringBuilder("BottomAdvInfos(");
        boolean z12 = false;
        if (isSetCarousel_banner()) {
            sb2.append("carousel_banner:");
            List<MainViewBottomAdv> list = this.carousel_banner;
            if (list == null) {
                sb2.append("null");
            } else {
                sb2.append(list);
            }
            z11 = false;
        } else {
            z11 = true;
        }
        if (isSetHorizontal_banner()) {
            if (!z11) {
                sb2.append(j2.O);
            }
            sb2.append("horizontal_banner:");
            List<MainViewBottomAdv> list2 = this.horizontal_banner;
            if (list2 == null) {
                sb2.append("null");
            } else {
                sb2.append(list2);
            }
        } else {
            z12 = z11;
        }
        if (isSetGrid_ad()) {
            if (!z12) {
                sb2.append(j2.O);
            }
            sb2.append("grid_ad:");
            List<MainViewBottomAdv> list3 = this.grid_ad;
            if (list3 == null) {
                sb2.append("null");
            } else {
                sb2.append(list3);
            }
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetCarousel_banner() {
        this.carousel_banner = null;
    }

    public void unsetGrid_ad() {
        this.grid_ad = null;
    }

    public void unsetHorizontal_banner() {
        this.horizontal_banner = null;
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(BottomAdvInfos other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo4 = Boolean.valueOf(isSetCarousel_banner()).compareTo(Boolean.valueOf(other.isSetCarousel_banner()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (isSetCarousel_banner() && (compareTo3 = TBaseHelper.compareTo((List) this.carousel_banner, (List) other.carousel_banner)) != 0) {
            return compareTo3;
        }
        int compareTo5 = Boolean.valueOf(isSetHorizontal_banner()).compareTo(Boolean.valueOf(other.isSetHorizontal_banner()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (isSetHorizontal_banner() && (compareTo2 = TBaseHelper.compareTo((List) this.horizontal_banner, (List) other.horizontal_banner)) != 0) {
            return compareTo2;
        }
        int compareTo6 = Boolean.valueOf(isSetGrid_ad()).compareTo(Boolean.valueOf(other.isSetGrid_ad()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (!isSetGrid_ad() || (compareTo = TBaseHelper.compareTo((List) this.grid_ad, (List) other.grid_ad)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<BottomAdvInfos, _Fields> deepCopy2() {
        return new BottomAdvInfos(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$advertise_api$BottomAdvInfos$_Fields[field.ordinal()];
        if (i11 == 1) {
            return getCarousel_banner();
        }
        if (i11 == 2) {
            return getHorizontal_banner();
        }
        if (i11 == 3) {
            return getGrid_ad();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$advertise_api$BottomAdvInfos$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetCarousel_banner();
        }
        if (i11 == 2) {
            return isSetHorizontal_banner();
        }
        if (i11 == 3) {
            return isSetGrid_ad();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$advertise_api$BottomAdvInfos$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetCarousel_banner();
                return;
            } else {
                setCarousel_banner((List) value);
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetHorizontal_banner();
                return;
            } else {
                setHorizontal_banner((List) value);
                return;
            }
        }
        if (i11 != 3) {
            return;
        }
        if (value == null) {
            unsetGrid_ad();
        } else {
            setGrid_ad((List) value);
        }
    }

    public BottomAdvInfos(BottomAdvInfos other) {
        this.optionals = new _Fields[]{_Fields.CAROUSEL_BANNER, _Fields.HORIZONTAL_BANNER, _Fields.GRID_AD};
        if (other.isSetCarousel_banner()) {
            ArrayList arrayList = new ArrayList(other.carousel_banner.size());
            Iterator<MainViewBottomAdv> it = other.carousel_banner.iterator();
            while (it.hasNext()) {
                arrayList.add(new MainViewBottomAdv(it.next()));
            }
            this.carousel_banner = arrayList;
        }
        if (other.isSetHorizontal_banner()) {
            ArrayList arrayList2 = new ArrayList(other.horizontal_banner.size());
            Iterator<MainViewBottomAdv> it2 = other.horizontal_banner.iterator();
            while (it2.hasNext()) {
                arrayList2.add(new MainViewBottomAdv(it2.next()));
            }
            this.horizontal_banner = arrayList2;
        }
        if (other.isSetGrid_ad()) {
            ArrayList arrayList3 = new ArrayList(other.grid_ad.size());
            Iterator<MainViewBottomAdv> it3 = other.grid_ad.iterator();
            while (it3.hasNext()) {
                arrayList3.add(new MainViewBottomAdv(it3.next()));
            }
            this.grid_ad = arrayList3;
        }
    }

    public boolean equals(BottomAdvInfos that) {
        if (that == null) {
            return false;
        }
        boolean isSetCarousel_banner = isSetCarousel_banner();
        boolean isSetCarousel_banner2 = that.isSetCarousel_banner();
        if ((isSetCarousel_banner || isSetCarousel_banner2) && !(isSetCarousel_banner && isSetCarousel_banner2 && this.carousel_banner.equals(that.carousel_banner))) {
            return false;
        }
        boolean isSetHorizontal_banner = isSetHorizontal_banner();
        boolean isSetHorizontal_banner2 = that.isSetHorizontal_banner();
        if ((isSetHorizontal_banner || isSetHorizontal_banner2) && !(isSetHorizontal_banner && isSetHorizontal_banner2 && this.horizontal_banner.equals(that.horizontal_banner))) {
            return false;
        }
        boolean isSetGrid_ad = isSetGrid_ad();
        boolean isSetGrid_ad2 = that.isSetGrid_ad();
        if (isSetGrid_ad || isSetGrid_ad2) {
            return isSetGrid_ad && isSetGrid_ad2 && this.grid_ad.equals(that.grid_ad);
        }
        return true;
    }

    public void validate() throws TException {
    }
}

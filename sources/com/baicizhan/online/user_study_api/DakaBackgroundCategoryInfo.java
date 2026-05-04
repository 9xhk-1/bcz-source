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
public class DakaBackgroundCategoryInfo implements TBase<DakaBackgroundCategoryInfo, _Fields>, Serializable, Cloneable, Comparable<DakaBackgroundCategoryInfo> {
    private static final int __WIN_DAYS_ISSET_ID = 0;
    private static final int __WIN_TYPE_ISSET_ID = 1;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public List<String> colors;
    public List<Long> image_ids;
    public List<String> images;
    public String name;
    private _Fields[] optionals;
    public String sen_mean;
    public String sen_source;
    public String sentence;
    public int win_days;
    public int win_type;
    private static final TStruct STRUCT_DESC = new TStruct("DakaBackgroundCategoryInfo");
    private static final TField NAME_FIELD_DESC = new TField("name", (byte) 11, 1);
    private static final TField IMAGES_FIELD_DESC = new TField("images", (byte) 15, 2);
    private static final TField COLORS_FIELD_DESC = new TField("colors", (byte) 15, 3);
    private static final TField IMAGE_IDS_FIELD_DESC = new TField("image_ids", (byte) 15, 4);
    private static final TField SENTENCE_FIELD_DESC = new TField("sentence", (byte) 11, 5);
    private static final TField SEN_MEAN_FIELD_DESC = new TField("sen_mean", (byte) 11, 6);
    private static final TField SEN_SOURCE_FIELD_DESC = new TField("sen_source", (byte) 11, 7);
    private static final TField WIN_DAYS_FIELD_DESC = new TField("win_days", (byte) 8, 8);
    private static final TField WIN_TYPE_FIELD_DESC = new TField("win_type", (byte) 8, 9);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.user_study_api.DakaBackgroundCategoryInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_study_api$DakaBackgroundCategoryInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$user_study_api$DakaBackgroundCategoryInfo$_Fields = iArr;
            try {
                iArr[_Fields.NAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$DakaBackgroundCategoryInfo$_Fields[_Fields.IMAGES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$DakaBackgroundCategoryInfo$_Fields[_Fields.COLORS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$DakaBackgroundCategoryInfo$_Fields[_Fields.IMAGE_IDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$DakaBackgroundCategoryInfo$_Fields[_Fields.SENTENCE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$DakaBackgroundCategoryInfo$_Fields[_Fields.SEN_MEAN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$DakaBackgroundCategoryInfo$_Fields[_Fields.SEN_SOURCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$DakaBackgroundCategoryInfo$_Fields[_Fields.WIN_DAYS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$DakaBackgroundCategoryInfo$_Fields[_Fields.WIN_TYPE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class DakaBackgroundCategoryInfoStandardScheme extends StandardScheme<DakaBackgroundCategoryInfo> {
        private DakaBackgroundCategoryInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, DakaBackgroundCategoryInfo struct) throws TException {
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
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.name = iprot.readString();
                            struct.setNameIsSet(true);
                            break;
                        }
                    case 2:
                        if (b11 != 15) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            TList readListBegin = iprot.readListBegin();
                            struct.images = new ArrayList(readListBegin.size);
                            while (i11 < readListBegin.size) {
                                struct.images.add(iprot.readString());
                                i11++;
                            }
                            iprot.readListEnd();
                            struct.setImagesIsSet(true);
                            break;
                        }
                    case 3:
                        if (b11 != 15) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            TList readListBegin2 = iprot.readListBegin();
                            struct.colors = new ArrayList(readListBegin2.size);
                            while (i11 < readListBegin2.size) {
                                struct.colors.add(iprot.readString());
                                i11++;
                            }
                            iprot.readListEnd();
                            struct.setColorsIsSet(true);
                            break;
                        }
                    case 4:
                        if (b11 != 15) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            TList readListBegin3 = iprot.readListBegin();
                            struct.image_ids = new ArrayList(readListBegin3.size);
                            while (i11 < readListBegin3.size) {
                                struct.image_ids.add(Long.valueOf(iprot.readI64()));
                                i11++;
                            }
                            iprot.readListEnd();
                            struct.setImage_idsIsSet(true);
                            break;
                        }
                    case 5:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.sentence = iprot.readString();
                            struct.setSentenceIsSet(true);
                            break;
                        }
                    case 6:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.sen_mean = iprot.readString();
                            struct.setSen_meanIsSet(true);
                            break;
                        }
                    case 7:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.sen_source = iprot.readString();
                            struct.setSen_sourceIsSet(true);
                            break;
                        }
                    case 8:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.win_days = iprot.readI32();
                            struct.setWin_daysIsSet(true);
                            break;
                        }
                    case 9:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.win_type = iprot.readI32();
                            struct.setWin_typeIsSet(true);
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
        public void write(TProtocol oprot, DakaBackgroundCategoryInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(DakaBackgroundCategoryInfo.STRUCT_DESC);
            if (struct.name != null) {
                oprot.writeFieldBegin(DakaBackgroundCategoryInfo.NAME_FIELD_DESC);
                oprot.writeString(struct.name);
                oprot.writeFieldEnd();
            }
            if (struct.images != null) {
                oprot.writeFieldBegin(DakaBackgroundCategoryInfo.IMAGES_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 11, struct.images.size()));
                Iterator<String> it = struct.images.iterator();
                while (it.hasNext()) {
                    oprot.writeString(it.next());
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            if (struct.colors != null) {
                oprot.writeFieldBegin(DakaBackgroundCategoryInfo.COLORS_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 11, struct.colors.size()));
                Iterator<String> it2 = struct.colors.iterator();
                while (it2.hasNext()) {
                    oprot.writeString(it2.next());
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            if (struct.image_ids != null && struct.isSetImage_ids()) {
                oprot.writeFieldBegin(DakaBackgroundCategoryInfo.IMAGE_IDS_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 10, struct.image_ids.size()));
                Iterator<Long> it3 = struct.image_ids.iterator();
                while (it3.hasNext()) {
                    oprot.writeI64(it3.next().longValue());
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            if (struct.sentence != null && struct.isSetSentence()) {
                oprot.writeFieldBegin(DakaBackgroundCategoryInfo.SENTENCE_FIELD_DESC);
                oprot.writeString(struct.sentence);
                oprot.writeFieldEnd();
            }
            if (struct.sen_mean != null && struct.isSetSen_mean()) {
                oprot.writeFieldBegin(DakaBackgroundCategoryInfo.SEN_MEAN_FIELD_DESC);
                oprot.writeString(struct.sen_mean);
                oprot.writeFieldEnd();
            }
            if (struct.sen_source != null && struct.isSetSen_source()) {
                oprot.writeFieldBegin(DakaBackgroundCategoryInfo.SEN_SOURCE_FIELD_DESC);
                oprot.writeString(struct.sen_source);
                oprot.writeFieldEnd();
            }
            if (struct.isSetWin_days()) {
                oprot.writeFieldBegin(DakaBackgroundCategoryInfo.WIN_DAYS_FIELD_DESC);
                oprot.writeI32(struct.win_days);
                oprot.writeFieldEnd();
            }
            if (struct.isSetWin_type()) {
                oprot.writeFieldBegin(DakaBackgroundCategoryInfo.WIN_TYPE_FIELD_DESC);
                oprot.writeI32(struct.win_type);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class DakaBackgroundCategoryInfoStandardSchemeFactory implements SchemeFactory {
        private DakaBackgroundCategoryInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public DakaBackgroundCategoryInfoStandardScheme getScheme() {
            return new DakaBackgroundCategoryInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class DakaBackgroundCategoryInfoTupleScheme extends TupleScheme<DakaBackgroundCategoryInfo> {
        private DakaBackgroundCategoryInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, DakaBackgroundCategoryInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.name = tTupleProtocol.readString();
            struct.setNameIsSet(true);
            TList tList = new TList((byte) 11, tTupleProtocol.readI32());
            struct.images = new ArrayList(tList.size);
            for (int i11 = 0; i11 < tList.size; i11++) {
                struct.images.add(tTupleProtocol.readString());
            }
            struct.setImagesIsSet(true);
            TList tList2 = new TList((byte) 11, tTupleProtocol.readI32());
            struct.colors = new ArrayList(tList2.size);
            for (int i12 = 0; i12 < tList2.size; i12++) {
                struct.colors.add(tTupleProtocol.readString());
            }
            struct.setColorsIsSet(true);
            BitSet readBitSet = tTupleProtocol.readBitSet(6);
            if (readBitSet.get(0)) {
                TList tList3 = new TList((byte) 10, tTupleProtocol.readI32());
                struct.image_ids = new ArrayList(tList3.size);
                for (int i13 = 0; i13 < tList3.size; i13++) {
                    struct.image_ids.add(Long.valueOf(tTupleProtocol.readI64()));
                }
                struct.setImage_idsIsSet(true);
            }
            if (readBitSet.get(1)) {
                struct.sentence = tTupleProtocol.readString();
                struct.setSentenceIsSet(true);
            }
            if (readBitSet.get(2)) {
                struct.sen_mean = tTupleProtocol.readString();
                struct.setSen_meanIsSet(true);
            }
            if (readBitSet.get(3)) {
                struct.sen_source = tTupleProtocol.readString();
                struct.setSen_sourceIsSet(true);
            }
            if (readBitSet.get(4)) {
                struct.win_days = tTupleProtocol.readI32();
                struct.setWin_daysIsSet(true);
            }
            if (readBitSet.get(5)) {
                struct.win_type = tTupleProtocol.readI32();
                struct.setWin_typeIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, DakaBackgroundCategoryInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeString(struct.name);
            tTupleProtocol.writeI32(struct.images.size());
            Iterator<String> it = struct.images.iterator();
            while (it.hasNext()) {
                tTupleProtocol.writeString(it.next());
            }
            tTupleProtocol.writeI32(struct.colors.size());
            Iterator<String> it2 = struct.colors.iterator();
            while (it2.hasNext()) {
                tTupleProtocol.writeString(it2.next());
            }
            BitSet bitSet = new BitSet();
            if (struct.isSetImage_ids()) {
                bitSet.set(0);
            }
            if (struct.isSetSentence()) {
                bitSet.set(1);
            }
            if (struct.isSetSen_mean()) {
                bitSet.set(2);
            }
            if (struct.isSetSen_source()) {
                bitSet.set(3);
            }
            if (struct.isSetWin_days()) {
                bitSet.set(4);
            }
            if (struct.isSetWin_type()) {
                bitSet.set(5);
            }
            tTupleProtocol.writeBitSet(bitSet, 6);
            if (struct.isSetImage_ids()) {
                tTupleProtocol.writeI32(struct.image_ids.size());
                Iterator<Long> it3 = struct.image_ids.iterator();
                while (it3.hasNext()) {
                    tTupleProtocol.writeI64(it3.next().longValue());
                }
            }
            if (struct.isSetSentence()) {
                tTupleProtocol.writeString(struct.sentence);
            }
            if (struct.isSetSen_mean()) {
                tTupleProtocol.writeString(struct.sen_mean);
            }
            if (struct.isSetSen_source()) {
                tTupleProtocol.writeString(struct.sen_source);
            }
            if (struct.isSetWin_days()) {
                tTupleProtocol.writeI32(struct.win_days);
            }
            if (struct.isSetWin_type()) {
                tTupleProtocol.writeI32(struct.win_type);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class DakaBackgroundCategoryInfoTupleSchemeFactory implements SchemeFactory {
        private DakaBackgroundCategoryInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public DakaBackgroundCategoryInfoTupleScheme getScheme() {
            return new DakaBackgroundCategoryInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        NAME(1, "name"),
        IMAGES(2, "images"),
        COLORS(3, "colors"),
        IMAGE_IDS(4, "image_ids"),
        SENTENCE(5, "sentence"),
        SEN_MEAN(6, "sen_mean"),
        SEN_SOURCE(7, "sen_source"),
        WIN_DAYS(8, "win_days"),
        WIN_TYPE(9, "win_type");

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
                    return NAME;
                case 2:
                    return IMAGES;
                case 3:
                    return COLORS;
                case 4:
                    return IMAGE_IDS;
                case 5:
                    return SENTENCE;
                case 6:
                    return SEN_MEAN;
                case 7:
                    return SEN_SOURCE;
                case 8:
                    return WIN_DAYS;
                case 9:
                    return WIN_TYPE;
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
        hashMap.put(StandardScheme.class, new DakaBackgroundCategoryInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new DakaBackgroundCategoryInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.NAME, (_Fields) new FieldMetaData("name", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.IMAGES, (_Fields) new FieldMetaData("images", (byte) 1, new ListMetaData((byte) 15, new FieldValueMetaData((byte) 11))));
        enumMap.put((EnumMap) _Fields.COLORS, (_Fields) new FieldMetaData("colors", (byte) 1, new ListMetaData((byte) 15, new FieldValueMetaData((byte) 11))));
        enumMap.put((EnumMap) _Fields.IMAGE_IDS, (_Fields) new FieldMetaData("image_ids", (byte) 2, new ListMetaData((byte) 15, new FieldValueMetaData((byte) 10))));
        enumMap.put((EnumMap) _Fields.SENTENCE, (_Fields) new FieldMetaData("sentence", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.SEN_MEAN, (_Fields) new FieldMetaData("sen_mean", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.SEN_SOURCE, (_Fields) new FieldMetaData("sen_source", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.WIN_DAYS, (_Fields) new FieldMetaData("win_days", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.WIN_TYPE, (_Fields) new FieldMetaData("win_type", (byte) 2, new FieldValueMetaData((byte) 8)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(DakaBackgroundCategoryInfo.class, unmodifiableMap);
    }

    public DakaBackgroundCategoryInfo() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.IMAGE_IDS, _Fields.SENTENCE, _Fields.SEN_MEAN, _Fields.SEN_SOURCE, _Fields.WIN_DAYS, _Fields.WIN_TYPE};
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

    public void addToColors(String elem) {
        if (this.colors == null) {
            this.colors = new ArrayList();
        }
        this.colors.add(elem);
    }

    public void addToImage_ids(long elem) {
        if (this.image_ids == null) {
            this.image_ids = new ArrayList();
        }
        this.image_ids.add(Long.valueOf(elem));
    }

    public void addToImages(String elem) {
        if (this.images == null) {
            this.images = new ArrayList();
        }
        this.images.add(elem);
    }

    @Override // org.apache.thrift.TBase
    public void clear() {
        this.name = null;
        this.images = null;
        this.colors = null;
        this.image_ids = null;
        this.sentence = null;
        this.sen_mean = null;
        this.sen_source = null;
        setWin_daysIsSet(false);
        this.win_days = 0;
        setWin_typeIsSet(false);
        this.win_type = 0;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof DakaBackgroundCategoryInfo)) {
            return equals((DakaBackgroundCategoryInfo) that);
        }
        return false;
    }

    public List<String> getColors() {
        return this.colors;
    }

    public Iterator<String> getColorsIterator() {
        List<String> list = this.colors;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getColorsSize() {
        List<String> list = this.colors;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public List<Long> getImage_ids() {
        return this.image_ids;
    }

    public Iterator<Long> getImage_idsIterator() {
        List<Long> list = this.image_ids;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getImage_idsSize() {
        List<Long> list = this.image_ids;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public List<String> getImages() {
        return this.images;
    }

    public Iterator<String> getImagesIterator() {
        List<String> list = this.images;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getImagesSize() {
        List<String> list = this.images;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public String getName() {
        return this.name;
    }

    public String getSen_mean() {
        return this.sen_mean;
    }

    public String getSen_source() {
        return this.sen_source;
    }

    public String getSentence() {
        return this.sentence;
    }

    public int getWin_days() {
        return this.win_days;
    }

    public int getWin_type() {
        return this.win_type;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetColors() {
        return this.colors != null;
    }

    public boolean isSetImage_ids() {
        return this.image_ids != null;
    }

    public boolean isSetImages() {
        return this.images != null;
    }

    public boolean isSetName() {
        return this.name != null;
    }

    public boolean isSetSen_mean() {
        return this.sen_mean != null;
    }

    public boolean isSetSen_source() {
        return this.sen_source != null;
    }

    public boolean isSetSentence() {
        return this.sentence != null;
    }

    public boolean isSetWin_days() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetWin_type() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public DakaBackgroundCategoryInfo setColors(List<String> colors) {
        this.colors = colors;
        return this;
    }

    public void setColorsIsSet(boolean value) {
        if (value) {
            return;
        }
        this.colors = null;
    }

    public DakaBackgroundCategoryInfo setImage_ids(List<Long> image_ids) {
        this.image_ids = image_ids;
        return this;
    }

    public void setImage_idsIsSet(boolean value) {
        if (value) {
            return;
        }
        this.image_ids = null;
    }

    public DakaBackgroundCategoryInfo setImages(List<String> images) {
        this.images = images;
        return this;
    }

    public void setImagesIsSet(boolean value) {
        if (value) {
            return;
        }
        this.images = null;
    }

    public DakaBackgroundCategoryInfo setName(String name) {
        this.name = name;
        return this;
    }

    public void setNameIsSet(boolean value) {
        if (value) {
            return;
        }
        this.name = null;
    }

    public DakaBackgroundCategoryInfo setSen_mean(String sen_mean) {
        this.sen_mean = sen_mean;
        return this;
    }

    public void setSen_meanIsSet(boolean value) {
        if (value) {
            return;
        }
        this.sen_mean = null;
    }

    public DakaBackgroundCategoryInfo setSen_source(String sen_source) {
        this.sen_source = sen_source;
        return this;
    }

    public void setSen_sourceIsSet(boolean value) {
        if (value) {
            return;
        }
        this.sen_source = null;
    }

    public DakaBackgroundCategoryInfo setSentence(String sentence) {
        this.sentence = sentence;
        return this;
    }

    public void setSentenceIsSet(boolean value) {
        if (value) {
            return;
        }
        this.sentence = null;
    }

    public DakaBackgroundCategoryInfo setWin_days(int win_days) {
        this.win_days = win_days;
        setWin_daysIsSet(true);
        return this;
    }

    public void setWin_daysIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public DakaBackgroundCategoryInfo setWin_type(int win_type) {
        this.win_type = win_type;
        setWin_typeIsSet(true);
        return this;
    }

    public void setWin_typeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("DakaBackgroundCategoryInfo(");
        sb2.append("name:");
        String str = this.name;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("images:");
        List<String> list = this.images;
        if (list == null) {
            sb2.append("null");
        } else {
            sb2.append(list);
        }
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("colors:");
        List<String> list2 = this.colors;
        if (list2 == null) {
            sb2.append("null");
        } else {
            sb2.append(list2);
        }
        if (isSetImage_ids()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("image_ids:");
            List<Long> list3 = this.image_ids;
            if (list3 == null) {
                sb2.append("null");
            } else {
                sb2.append(list3);
            }
        }
        if (isSetSentence()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("sentence:");
            String str2 = this.sentence;
            if (str2 == null) {
                sb2.append("null");
            } else {
                sb2.append(str2);
            }
        }
        if (isSetSen_mean()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("sen_mean:");
            String str3 = this.sen_mean;
            if (str3 == null) {
                sb2.append("null");
            } else {
                sb2.append(str3);
            }
        }
        if (isSetSen_source()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("sen_source:");
            String str4 = this.sen_source;
            if (str4 == null) {
                sb2.append("null");
            } else {
                sb2.append(str4);
            }
        }
        if (isSetWin_days()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("win_days:");
            sb2.append(this.win_days);
        }
        if (isSetWin_type()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("win_type:");
            sb2.append(this.win_type);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetColors() {
        this.colors = null;
    }

    public void unsetImage_ids() {
        this.image_ids = null;
    }

    public void unsetImages() {
        this.images = null;
    }

    public void unsetName() {
        this.name = null;
    }

    public void unsetSen_mean() {
        this.sen_mean = null;
    }

    public void unsetSen_source() {
        this.sen_source = null;
    }

    public void unsetSentence() {
        this.sentence = null;
    }

    public void unsetWin_days() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetWin_type() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void validate() throws TException {
        if (this.name == null) {
            throw new TProtocolException("Required field 'name' was not present! Struct: " + toString());
        }
        if (this.images == null) {
            throw new TProtocolException("Required field 'images' was not present! Struct: " + toString());
        }
        if (this.colors != null) {
            return;
        }
        throw new TProtocolException("Required field 'colors' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(DakaBackgroundCategoryInfo other) {
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
        int compareTo10 = Boolean.valueOf(isSetName()).compareTo(Boolean.valueOf(other.isSetName()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (isSetName() && (compareTo9 = TBaseHelper.compareTo(this.name, other.name)) != 0) {
            return compareTo9;
        }
        int compareTo11 = Boolean.valueOf(isSetImages()).compareTo(Boolean.valueOf(other.isSetImages()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (isSetImages() && (compareTo8 = TBaseHelper.compareTo((List) this.images, (List) other.images)) != 0) {
            return compareTo8;
        }
        int compareTo12 = Boolean.valueOf(isSetColors()).compareTo(Boolean.valueOf(other.isSetColors()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (isSetColors() && (compareTo7 = TBaseHelper.compareTo((List) this.colors, (List) other.colors)) != 0) {
            return compareTo7;
        }
        int compareTo13 = Boolean.valueOf(isSetImage_ids()).compareTo(Boolean.valueOf(other.isSetImage_ids()));
        if (compareTo13 != 0) {
            return compareTo13;
        }
        if (isSetImage_ids() && (compareTo6 = TBaseHelper.compareTo((List) this.image_ids, (List) other.image_ids)) != 0) {
            return compareTo6;
        }
        int compareTo14 = Boolean.valueOf(isSetSentence()).compareTo(Boolean.valueOf(other.isSetSentence()));
        if (compareTo14 != 0) {
            return compareTo14;
        }
        if (isSetSentence() && (compareTo5 = TBaseHelper.compareTo(this.sentence, other.sentence)) != 0) {
            return compareTo5;
        }
        int compareTo15 = Boolean.valueOf(isSetSen_mean()).compareTo(Boolean.valueOf(other.isSetSen_mean()));
        if (compareTo15 != 0) {
            return compareTo15;
        }
        if (isSetSen_mean() && (compareTo4 = TBaseHelper.compareTo(this.sen_mean, other.sen_mean)) != 0) {
            return compareTo4;
        }
        int compareTo16 = Boolean.valueOf(isSetSen_source()).compareTo(Boolean.valueOf(other.isSetSen_source()));
        if (compareTo16 != 0) {
            return compareTo16;
        }
        if (isSetSen_source() && (compareTo3 = TBaseHelper.compareTo(this.sen_source, other.sen_source)) != 0) {
            return compareTo3;
        }
        int compareTo17 = Boolean.valueOf(isSetWin_days()).compareTo(Boolean.valueOf(other.isSetWin_days()));
        if (compareTo17 != 0) {
            return compareTo17;
        }
        if (isSetWin_days() && (compareTo2 = TBaseHelper.compareTo(this.win_days, other.win_days)) != 0) {
            return compareTo2;
        }
        int compareTo18 = Boolean.valueOf(isSetWin_type()).compareTo(Boolean.valueOf(other.isSetWin_type()));
        if (compareTo18 != 0) {
            return compareTo18;
        }
        if (!isSetWin_type() || (compareTo = TBaseHelper.compareTo(this.win_type, other.win_type)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<DakaBackgroundCategoryInfo, _Fields> deepCopy2() {
        return new DakaBackgroundCategoryInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$DakaBackgroundCategoryInfo$_Fields[field.ordinal()]) {
            case 1:
                return getName();
            case 2:
                return getImages();
            case 3:
                return getColors();
            case 4:
                return getImage_ids();
            case 5:
                return getSentence();
            case 6:
                return getSen_mean();
            case 7:
                return getSen_source();
            case 8:
                return Integer.valueOf(getWin_days());
            case 9:
                return Integer.valueOf(getWin_type());
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$DakaBackgroundCategoryInfo$_Fields[field.ordinal()]) {
            case 1:
                return isSetName();
            case 2:
                return isSetImages();
            case 3:
                return isSetColors();
            case 4:
                return isSetImage_ids();
            case 5:
                return isSetSentence();
            case 6:
                return isSetSen_mean();
            case 7:
                return isSetSen_source();
            case 8:
                return isSetWin_days();
            case 9:
                return isSetWin_type();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$DakaBackgroundCategoryInfo$_Fields[field.ordinal()]) {
            case 1:
                if (value != null) {
                    setName((String) value);
                    break;
                } else {
                    unsetName();
                    break;
                }
            case 2:
                if (value != null) {
                    setImages((List) value);
                    break;
                } else {
                    unsetImages();
                    break;
                }
            case 3:
                if (value != null) {
                    setColors((List) value);
                    break;
                } else {
                    unsetColors();
                    break;
                }
            case 4:
                if (value != null) {
                    setImage_ids((List) value);
                    break;
                } else {
                    unsetImage_ids();
                    break;
                }
            case 5:
                if (value != null) {
                    setSentence((String) value);
                    break;
                } else {
                    unsetSentence();
                    break;
                }
            case 6:
                if (value != null) {
                    setSen_mean((String) value);
                    break;
                } else {
                    unsetSen_mean();
                    break;
                }
            case 7:
                if (value != null) {
                    setSen_source((String) value);
                    break;
                } else {
                    unsetSen_source();
                    break;
                }
            case 8:
                if (value != null) {
                    setWin_days(((Integer) value).intValue());
                    break;
                } else {
                    unsetWin_days();
                    break;
                }
            case 9:
                if (value != null) {
                    setWin_type(((Integer) value).intValue());
                    break;
                } else {
                    unsetWin_type();
                    break;
                }
        }
    }

    public boolean equals(DakaBackgroundCategoryInfo that) {
        if (that == null) {
            return false;
        }
        boolean isSetName = isSetName();
        boolean isSetName2 = that.isSetName();
        if ((isSetName || isSetName2) && !(isSetName && isSetName2 && this.name.equals(that.name))) {
            return false;
        }
        boolean isSetImages = isSetImages();
        boolean isSetImages2 = that.isSetImages();
        if ((isSetImages || isSetImages2) && !(isSetImages && isSetImages2 && this.images.equals(that.images))) {
            return false;
        }
        boolean isSetColors = isSetColors();
        boolean isSetColors2 = that.isSetColors();
        if ((isSetColors || isSetColors2) && !(isSetColors && isSetColors2 && this.colors.equals(that.colors))) {
            return false;
        }
        boolean isSetImage_ids = isSetImage_ids();
        boolean isSetImage_ids2 = that.isSetImage_ids();
        if ((isSetImage_ids || isSetImage_ids2) && !(isSetImage_ids && isSetImage_ids2 && this.image_ids.equals(that.image_ids))) {
            return false;
        }
        boolean isSetSentence = isSetSentence();
        boolean isSetSentence2 = that.isSetSentence();
        if ((isSetSentence || isSetSentence2) && !(isSetSentence && isSetSentence2 && this.sentence.equals(that.sentence))) {
            return false;
        }
        boolean isSetSen_mean = isSetSen_mean();
        boolean isSetSen_mean2 = that.isSetSen_mean();
        if ((isSetSen_mean || isSetSen_mean2) && !(isSetSen_mean && isSetSen_mean2 && this.sen_mean.equals(that.sen_mean))) {
            return false;
        }
        boolean isSetSen_source = isSetSen_source();
        boolean isSetSen_source2 = that.isSetSen_source();
        if ((isSetSen_source || isSetSen_source2) && !(isSetSen_source && isSetSen_source2 && this.sen_source.equals(that.sen_source))) {
            return false;
        }
        boolean isSetWin_days = isSetWin_days();
        boolean isSetWin_days2 = that.isSetWin_days();
        if ((isSetWin_days || isSetWin_days2) && !(isSetWin_days && isSetWin_days2 && this.win_days == that.win_days)) {
            return false;
        }
        boolean isSetWin_type = isSetWin_type();
        boolean isSetWin_type2 = that.isSetWin_type();
        if (isSetWin_type || isSetWin_type2) {
            return isSetWin_type && isSetWin_type2 && this.win_type == that.win_type;
        }
        return true;
    }

    public DakaBackgroundCategoryInfo(String name, List<String> images, List<String> colors) {
        this();
        this.name = name;
        this.images = images;
        this.colors = colors;
    }

    public DakaBackgroundCategoryInfo(DakaBackgroundCategoryInfo other) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.IMAGE_IDS, _Fields.SENTENCE, _Fields.SEN_MEAN, _Fields.SEN_SOURCE, _Fields.WIN_DAYS, _Fields.WIN_TYPE};
        this.__isset_bitfield = other.__isset_bitfield;
        if (other.isSetName()) {
            this.name = other.name;
        }
        if (other.isSetImages()) {
            this.images = new ArrayList(other.images);
        }
        if (other.isSetColors()) {
            this.colors = new ArrayList(other.colors);
        }
        if (other.isSetImage_ids()) {
            this.image_ids = new ArrayList(other.image_ids);
        }
        if (other.isSetSentence()) {
            this.sentence = other.sentence;
        }
        if (other.isSetSen_mean()) {
            this.sen_mean = other.sen_mean;
        }
        if (other.isSetSen_source()) {
            this.sen_source = other.sen_source;
        }
        this.win_days = other.win_days;
        this.win_type = other.win_type;
    }
}

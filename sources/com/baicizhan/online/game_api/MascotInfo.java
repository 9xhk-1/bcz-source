package com.baicizhan.online.game_api;

import com.baicizhan.main.activity.SingleFragmentActivity;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
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
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class MascotInfo implements TBase<MascotInfo, _Fields>, Serializable, Cloneable, Comparable<MascotInfo> {
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    public String background;
    public List<String> images;
    private static final TStruct STRUCT_DESC = new TStruct("MascotInfo");
    private static final TField BACKGROUND_FIELD_DESC = new TField(SingleFragmentActivity.f18194n, (byte) 11, 1);
    private static final TField IMAGES_FIELD_DESC = new TField("images", (byte) 15, 2);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.game_api.MascotInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$game_api$MascotInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$game_api$MascotInfo$_Fields = iArr;
            try {
                iArr[_Fields.BACKGROUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$MascotInfo$_Fields[_Fields.IMAGES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class MascotInfoStandardScheme extends StandardScheme<MascotInfo> {
        private MascotInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, MascotInfo struct) throws TException {
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
                    } else if (b11 == 15) {
                        TList readListBegin = iprot.readListBegin();
                        struct.images = new ArrayList(readListBegin.size);
                        for (int i11 = 0; i11 < readListBegin.size; i11++) {
                            struct.images.add(iprot.readString());
                        }
                        iprot.readListEnd();
                        struct.setImagesIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 11) {
                    struct.background = iprot.readString();
                    struct.setBackgroundIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, MascotInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(MascotInfo.STRUCT_DESC);
            if (struct.background != null) {
                oprot.writeFieldBegin(MascotInfo.BACKGROUND_FIELD_DESC);
                oprot.writeString(struct.background);
                oprot.writeFieldEnd();
            }
            if (struct.images != null) {
                oprot.writeFieldBegin(MascotInfo.IMAGES_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 11, struct.images.size()));
                Iterator<String> it = struct.images.iterator();
                while (it.hasNext()) {
                    oprot.writeString(it.next());
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class MascotInfoStandardSchemeFactory implements SchemeFactory {
        private MascotInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public MascotInfoStandardScheme getScheme() {
            return new MascotInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class MascotInfoTupleScheme extends TupleScheme<MascotInfo> {
        private MascotInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, MascotInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.background = tTupleProtocol.readString();
            struct.setBackgroundIsSet(true);
            TList tList = new TList((byte) 11, tTupleProtocol.readI32());
            struct.images = new ArrayList(tList.size);
            for (int i11 = 0; i11 < tList.size; i11++) {
                struct.images.add(tTupleProtocol.readString());
            }
            struct.setImagesIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, MascotInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeString(struct.background);
            tTupleProtocol.writeI32(struct.images.size());
            Iterator<String> it = struct.images.iterator();
            while (it.hasNext()) {
                tTupleProtocol.writeString(it.next());
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class MascotInfoTupleSchemeFactory implements SchemeFactory {
        private MascotInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public MascotInfoTupleScheme getScheme() {
            return new MascotInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        BACKGROUND(1, SingleFragmentActivity.f18194n),
        IMAGES(2, "images");

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
                return BACKGROUND;
            }
            if (fieldId != 2) {
                return null;
            }
            return IMAGES;
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
        hashMap.put(StandardScheme.class, new MascotInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new MascotInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.BACKGROUND, (_Fields) new FieldMetaData(SingleFragmentActivity.f18194n, (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.IMAGES, (_Fields) new FieldMetaData("images", (byte) 1, new ListMetaData((byte) 15, new FieldValueMetaData((byte) 11))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(MascotInfo.class, unmodifiableMap);
    }

    public MascotInfo() {
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

    public void addToImages(String elem) {
        if (this.images == null) {
            this.images = new ArrayList();
        }
        this.images.add(elem);
    }

    @Override // org.apache.thrift.TBase
    public void clear() {
        this.background = null;
        this.images = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof MascotInfo)) {
            return equals((MascotInfo) that);
        }
        return false;
    }

    public String getBackground() {
        return this.background;
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

    public int hashCode() {
        return 0;
    }

    public boolean isSetBackground() {
        return this.background != null;
    }

    public boolean isSetImages() {
        return this.images != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public MascotInfo setBackground(String background) {
        this.background = background;
        return this;
    }

    public void setBackgroundIsSet(boolean value) {
        if (value) {
            return;
        }
        this.background = null;
    }

    public MascotInfo setImages(List<String> images) {
        this.images = images;
        return this;
    }

    public void setImagesIsSet(boolean value) {
        if (value) {
            return;
        }
        this.images = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("MascotInfo(");
        sb2.append("background:");
        String str = this.background;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(j2.O);
        sb2.append("images:");
        List<String> list = this.images;
        if (list == null) {
            sb2.append("null");
        } else {
            sb2.append(list);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetBackground() {
        this.background = null;
    }

    public void unsetImages() {
        this.images = null;
    }

    public void validate() throws TException {
        if (this.background == null) {
            throw new TProtocolException("Required field 'background' was not present! Struct: " + toString());
        }
        if (this.images != null) {
            return;
        }
        throw new TProtocolException("Required field 'images' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    public MascotInfo(String background, List<String> images) {
        this();
        this.background = background;
        this.images = images;
    }

    @Override // java.lang.Comparable
    public int compareTo(MascotInfo other) {
        int compareTo;
        int compareTo2;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo3 = Boolean.valueOf(isSetBackground()).compareTo(Boolean.valueOf(other.isSetBackground()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (isSetBackground() && (compareTo2 = TBaseHelper.compareTo(this.background, other.background)) != 0) {
            return compareTo2;
        }
        int compareTo4 = Boolean.valueOf(isSetImages()).compareTo(Boolean.valueOf(other.isSetImages()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (!isSetImages() || (compareTo = TBaseHelper.compareTo((List) this.images, (List) other.images)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<MascotInfo, _Fields> deepCopy2() {
        return new MascotInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$MascotInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return getBackground();
        }
        if (i11 == 2) {
            return getImages();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$MascotInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetBackground();
        }
        if (i11 == 2) {
            return isSetImages();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$MascotInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetBackground();
                return;
            } else {
                setBackground((String) value);
                return;
            }
        }
        if (i11 != 2) {
            return;
        }
        if (value == null) {
            unsetImages();
        } else {
            setImages((List) value);
        }
    }

    public boolean equals(MascotInfo that) {
        if (that == null) {
            return false;
        }
        boolean isSetBackground = isSetBackground();
        boolean isSetBackground2 = that.isSetBackground();
        if ((isSetBackground || isSetBackground2) && !(isSetBackground && isSetBackground2 && this.background.equals(that.background))) {
            return false;
        }
        boolean isSetImages = isSetImages();
        boolean isSetImages2 = that.isSetImages();
        if (isSetImages || isSetImages2) {
            return isSetImages && isSetImages2 && this.images.equals(that.images);
        }
        return true;
    }

    public MascotInfo(MascotInfo other) {
        if (other.isSetBackground()) {
            this.background = other.background;
        }
        if (other.isSetImages()) {
            this.images = new ArrayList(other.images);
        }
    }
}

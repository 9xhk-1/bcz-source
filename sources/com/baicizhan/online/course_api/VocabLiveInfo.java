package com.baicizhan.online.course_api;

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
public class VocabLiveInfo implements TBase<VocabLiveInfo, _Fields>, Serializable, Cloneable, Comparable<VocabLiveInfo> {
    private static final int __DURATION_ISSET_ID = 0;
    private static final int __STUDY_DONE_ISSET_ID = 1;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public List<LiveAnswerItem> answers;
    public DiscountCoupon discountcoupon;
    public int duration;
    public List<String> emojis;
    public List<LineInfo> line_infos;
    public String nickname;
    private _Fields[] optionals;

    /* renamed from: qs, reason: collision with root package name */
    public CourseQs f28151qs;
    public List<String> sents;
    public int study_done;
    public String title;
    private static final TStruct STRUCT_DESC = new TStruct("VocabLiveInfo");
    private static final TField NICKNAME_FIELD_DESC = new TField("nickname", (byte) 11, 1);
    private static final TField LINE_INFOS_FIELD_DESC = new TField("line_infos", (byte) 15, 2);
    private static final TField DURATION_FIELD_DESC = new TField("duration", (byte) 8, 3);
    private static final TField TITLE_FIELD_DESC = new TField("title", (byte) 11, 4);
    private static final TField DISCOUNTCOUPON_FIELD_DESC = new TField("discountcoupon", (byte) 12, 5);
    private static final TField ANSWERS_FIELD_DESC = new TField("answers", (byte) 15, 6);
    private static final TField EMOJIS_FIELD_DESC = new TField("emojis", (byte) 15, 7);
    private static final TField SENTS_FIELD_DESC = new TField("sents", (byte) 15, 8);
    private static final TField QS_FIELD_DESC = new TField("qs", (byte) 12, 9);
    private static final TField STUDY_DONE_FIELD_DESC = new TField("study_done", (byte) 8, 10);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.course_api.VocabLiveInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$course_api$VocabLiveInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$course_api$VocabLiveInfo$_Fields = iArr;
            try {
                iArr[_Fields.NICKNAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$course_api$VocabLiveInfo$_Fields[_Fields.LINE_INFOS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$course_api$VocabLiveInfo$_Fields[_Fields.DURATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$course_api$VocabLiveInfo$_Fields[_Fields.TITLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$course_api$VocabLiveInfo$_Fields[_Fields.DISCOUNTCOUPON.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$baicizhan$online$course_api$VocabLiveInfo$_Fields[_Fields.ANSWERS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$baicizhan$online$course_api$VocabLiveInfo$_Fields[_Fields.EMOJIS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$baicizhan$online$course_api$VocabLiveInfo$_Fields[_Fields.SENTS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$baicizhan$online$course_api$VocabLiveInfo$_Fields[_Fields.QS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$baicizhan$online$course_api$VocabLiveInfo$_Fields[_Fields.STUDY_DONE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class VocabLiveInfoStandardScheme extends StandardScheme<VocabLiveInfo> {
        private VocabLiveInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, VocabLiveInfo struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    iprot.readStructEnd();
                    if (!struct.isSetDuration()) {
                        throw new TProtocolException("Required field 'duration' was not found in serialized data! Struct: " + toString());
                    }
                    if (struct.isSetStudy_done()) {
                        struct.validate();
                        return;
                    }
                    throw new TProtocolException("Required field 'study_done' was not found in serialized data! Struct: " + toString());
                }
                int i11 = 0;
                switch (readFieldBegin.f77768id) {
                    case 1:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.nickname = iprot.readString();
                            struct.setNicknameIsSet(true);
                            break;
                        }
                    case 2:
                        if (b11 != 15) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            TList readListBegin = iprot.readListBegin();
                            struct.line_infos = new ArrayList(readListBegin.size);
                            while (i11 < readListBegin.size) {
                                LineInfo lineInfo = new LineInfo();
                                lineInfo.read(iprot);
                                struct.line_infos.add(lineInfo);
                                i11++;
                            }
                            iprot.readListEnd();
                            struct.setLine_infosIsSet(true);
                            break;
                        }
                    case 3:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.duration = iprot.readI32();
                            struct.setDurationIsSet(true);
                            break;
                        }
                    case 4:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.title = iprot.readString();
                            struct.setTitleIsSet(true);
                            break;
                        }
                    case 5:
                        if (b11 != 12) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            DiscountCoupon discountCoupon = new DiscountCoupon();
                            struct.discountcoupon = discountCoupon;
                            discountCoupon.read(iprot);
                            struct.setDiscountcouponIsSet(true);
                            break;
                        }
                    case 6:
                        if (b11 != 15) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            TList readListBegin2 = iprot.readListBegin();
                            struct.answers = new ArrayList(readListBegin2.size);
                            while (i11 < readListBegin2.size) {
                                LiveAnswerItem liveAnswerItem = new LiveAnswerItem();
                                liveAnswerItem.read(iprot);
                                struct.answers.add(liveAnswerItem);
                                i11++;
                            }
                            iprot.readListEnd();
                            struct.setAnswersIsSet(true);
                            break;
                        }
                    case 7:
                        if (b11 != 15) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            TList readListBegin3 = iprot.readListBegin();
                            struct.emojis = new ArrayList(readListBegin3.size);
                            while (i11 < readListBegin3.size) {
                                struct.emojis.add(iprot.readString());
                                i11++;
                            }
                            iprot.readListEnd();
                            struct.setEmojisIsSet(true);
                            break;
                        }
                    case 8:
                        if (b11 != 15) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            TList readListBegin4 = iprot.readListBegin();
                            struct.sents = new ArrayList(readListBegin4.size);
                            while (i11 < readListBegin4.size) {
                                struct.sents.add(iprot.readString());
                                i11++;
                            }
                            iprot.readListEnd();
                            struct.setSentsIsSet(true);
                            break;
                        }
                    case 9:
                        if (b11 != 12) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            CourseQs courseQs = new CourseQs();
                            struct.f28151qs = courseQs;
                            courseQs.read(iprot);
                            struct.setQsIsSet(true);
                            break;
                        }
                    case 10:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.study_done = iprot.readI32();
                            struct.setStudy_doneIsSet(true);
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
        public void write(TProtocol oprot, VocabLiveInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(VocabLiveInfo.STRUCT_DESC);
            if (struct.nickname != null && struct.isSetNickname()) {
                oprot.writeFieldBegin(VocabLiveInfo.NICKNAME_FIELD_DESC);
                oprot.writeString(struct.nickname);
                oprot.writeFieldEnd();
            }
            if (struct.line_infos != null) {
                oprot.writeFieldBegin(VocabLiveInfo.LINE_INFOS_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 12, struct.line_infos.size()));
                Iterator<LineInfo> it = struct.line_infos.iterator();
                while (it.hasNext()) {
                    it.next().write(oprot);
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(VocabLiveInfo.DURATION_FIELD_DESC);
            oprot.writeI32(struct.duration);
            oprot.writeFieldEnd();
            if (struct.title != null) {
                oprot.writeFieldBegin(VocabLiveInfo.TITLE_FIELD_DESC);
                oprot.writeString(struct.title);
                oprot.writeFieldEnd();
            }
            if (struct.discountcoupon != null && struct.isSetDiscountcoupon()) {
                oprot.writeFieldBegin(VocabLiveInfo.DISCOUNTCOUPON_FIELD_DESC);
                struct.discountcoupon.write(oprot);
                oprot.writeFieldEnd();
            }
            if (struct.answers != null && struct.isSetAnswers()) {
                oprot.writeFieldBegin(VocabLiveInfo.ANSWERS_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 12, struct.answers.size()));
                Iterator<LiveAnswerItem> it2 = struct.answers.iterator();
                while (it2.hasNext()) {
                    it2.next().write(oprot);
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            if (struct.emojis != null) {
                oprot.writeFieldBegin(VocabLiveInfo.EMOJIS_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 11, struct.emojis.size()));
                Iterator<String> it3 = struct.emojis.iterator();
                while (it3.hasNext()) {
                    oprot.writeString(it3.next());
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            if (struct.sents != null) {
                oprot.writeFieldBegin(VocabLiveInfo.SENTS_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 11, struct.sents.size()));
                Iterator<String> it4 = struct.sents.iterator();
                while (it4.hasNext()) {
                    oprot.writeString(it4.next());
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            if (struct.f28151qs != null && struct.isSetQs()) {
                oprot.writeFieldBegin(VocabLiveInfo.QS_FIELD_DESC);
                struct.f28151qs.write(oprot);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(VocabLiveInfo.STUDY_DONE_FIELD_DESC);
            oprot.writeI32(struct.study_done);
            oprot.writeFieldEnd();
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class VocabLiveInfoStandardSchemeFactory implements SchemeFactory {
        private VocabLiveInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public VocabLiveInfoStandardScheme getScheme() {
            return new VocabLiveInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class VocabLiveInfoTupleScheme extends TupleScheme<VocabLiveInfo> {
        private VocabLiveInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, VocabLiveInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            TList tList = new TList((byte) 12, tTupleProtocol.readI32());
            struct.line_infos = new ArrayList(tList.size);
            for (int i11 = 0; i11 < tList.size; i11++) {
                LineInfo lineInfo = new LineInfo();
                lineInfo.read(tTupleProtocol);
                struct.line_infos.add(lineInfo);
            }
            struct.setLine_infosIsSet(true);
            struct.duration = tTupleProtocol.readI32();
            struct.setDurationIsSet(true);
            struct.title = tTupleProtocol.readString();
            struct.setTitleIsSet(true);
            TList tList2 = new TList((byte) 11, tTupleProtocol.readI32());
            struct.emojis = new ArrayList(tList2.size);
            for (int i12 = 0; i12 < tList2.size; i12++) {
                struct.emojis.add(tTupleProtocol.readString());
            }
            struct.setEmojisIsSet(true);
            TList tList3 = new TList((byte) 11, tTupleProtocol.readI32());
            struct.sents = new ArrayList(tList3.size);
            for (int i13 = 0; i13 < tList3.size; i13++) {
                struct.sents.add(tTupleProtocol.readString());
            }
            struct.setSentsIsSet(true);
            struct.study_done = tTupleProtocol.readI32();
            struct.setStudy_doneIsSet(true);
            BitSet readBitSet = tTupleProtocol.readBitSet(4);
            if (readBitSet.get(0)) {
                struct.nickname = tTupleProtocol.readString();
                struct.setNicknameIsSet(true);
            }
            if (readBitSet.get(1)) {
                DiscountCoupon discountCoupon = new DiscountCoupon();
                struct.discountcoupon = discountCoupon;
                discountCoupon.read(tTupleProtocol);
                struct.setDiscountcouponIsSet(true);
            }
            if (readBitSet.get(2)) {
                TList tList4 = new TList((byte) 12, tTupleProtocol.readI32());
                struct.answers = new ArrayList(tList4.size);
                for (int i14 = 0; i14 < tList4.size; i14++) {
                    LiveAnswerItem liveAnswerItem = new LiveAnswerItem();
                    liveAnswerItem.read(tTupleProtocol);
                    struct.answers.add(liveAnswerItem);
                }
                struct.setAnswersIsSet(true);
            }
            if (readBitSet.get(3)) {
                CourseQs courseQs = new CourseQs();
                struct.f28151qs = courseQs;
                courseQs.read(tTupleProtocol);
                struct.setQsIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, VocabLiveInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.line_infos.size());
            Iterator<LineInfo> it = struct.line_infos.iterator();
            while (it.hasNext()) {
                it.next().write(tTupleProtocol);
            }
            tTupleProtocol.writeI32(struct.duration);
            tTupleProtocol.writeString(struct.title);
            tTupleProtocol.writeI32(struct.emojis.size());
            Iterator<String> it2 = struct.emojis.iterator();
            while (it2.hasNext()) {
                tTupleProtocol.writeString(it2.next());
            }
            tTupleProtocol.writeI32(struct.sents.size());
            Iterator<String> it3 = struct.sents.iterator();
            while (it3.hasNext()) {
                tTupleProtocol.writeString(it3.next());
            }
            tTupleProtocol.writeI32(struct.study_done);
            BitSet bitSet = new BitSet();
            if (struct.isSetNickname()) {
                bitSet.set(0);
            }
            if (struct.isSetDiscountcoupon()) {
                bitSet.set(1);
            }
            if (struct.isSetAnswers()) {
                bitSet.set(2);
            }
            if (struct.isSetQs()) {
                bitSet.set(3);
            }
            tTupleProtocol.writeBitSet(bitSet, 4);
            if (struct.isSetNickname()) {
                tTupleProtocol.writeString(struct.nickname);
            }
            if (struct.isSetDiscountcoupon()) {
                struct.discountcoupon.write(tTupleProtocol);
            }
            if (struct.isSetAnswers()) {
                tTupleProtocol.writeI32(struct.answers.size());
                Iterator<LiveAnswerItem> it4 = struct.answers.iterator();
                while (it4.hasNext()) {
                    it4.next().write(tTupleProtocol);
                }
            }
            if (struct.isSetQs()) {
                struct.f28151qs.write(tTupleProtocol);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class VocabLiveInfoTupleSchemeFactory implements SchemeFactory {
        private VocabLiveInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public VocabLiveInfoTupleScheme getScheme() {
            return new VocabLiveInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        NICKNAME(1, "nickname"),
        LINE_INFOS(2, "line_infos"),
        DURATION(3, "duration"),
        TITLE(4, "title"),
        DISCOUNTCOUPON(5, "discountcoupon"),
        ANSWERS(6, "answers"),
        EMOJIS(7, "emojis"),
        SENTS(8, "sents"),
        QS(9, "qs"),
        STUDY_DONE(10, "study_done");

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
                    return NICKNAME;
                case 2:
                    return LINE_INFOS;
                case 3:
                    return DURATION;
                case 4:
                    return TITLE;
                case 5:
                    return DISCOUNTCOUPON;
                case 6:
                    return ANSWERS;
                case 7:
                    return EMOJIS;
                case 8:
                    return SENTS;
                case 9:
                    return QS;
                case 10:
                    return STUDY_DONE;
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
        hashMap.put(StandardScheme.class, new VocabLiveInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new VocabLiveInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.NICKNAME, (_Fields) new FieldMetaData("nickname", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.LINE_INFOS, (_Fields) new FieldMetaData("line_infos", (byte) 1, new ListMetaData((byte) 15, new StructMetaData((byte) 12, LineInfo.class))));
        enumMap.put((EnumMap) _Fields.DURATION, (_Fields) new FieldMetaData("duration", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.TITLE, (_Fields) new FieldMetaData("title", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.DISCOUNTCOUPON, (_Fields) new FieldMetaData("discountcoupon", (byte) 2, new StructMetaData((byte) 12, DiscountCoupon.class)));
        enumMap.put((EnumMap) _Fields.ANSWERS, (_Fields) new FieldMetaData("answers", (byte) 2, new ListMetaData((byte) 15, new StructMetaData((byte) 12, LiveAnswerItem.class))));
        enumMap.put((EnumMap) _Fields.EMOJIS, (_Fields) new FieldMetaData("emojis", (byte) 1, new ListMetaData((byte) 15, new FieldValueMetaData((byte) 11))));
        enumMap.put((EnumMap) _Fields.SENTS, (_Fields) new FieldMetaData("sents", (byte) 1, new ListMetaData((byte) 15, new FieldValueMetaData((byte) 11))));
        enumMap.put((EnumMap) _Fields.QS, (_Fields) new FieldMetaData("qs", (byte) 2, new StructMetaData((byte) 12, CourseQs.class)));
        enumMap.put((EnumMap) _Fields.STUDY_DONE, (_Fields) new FieldMetaData("study_done", (byte) 1, new FieldValueMetaData((byte) 8)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(VocabLiveInfo.class, unmodifiableMap);
    }

    public VocabLiveInfo() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.NICKNAME, _Fields.DISCOUNTCOUPON, _Fields.ANSWERS, _Fields.QS};
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

    public void addToAnswers(LiveAnswerItem elem) {
        if (this.answers == null) {
            this.answers = new ArrayList();
        }
        this.answers.add(elem);
    }

    public void addToEmojis(String elem) {
        if (this.emojis == null) {
            this.emojis = new ArrayList();
        }
        this.emojis.add(elem);
    }

    public void addToLine_infos(LineInfo elem) {
        if (this.line_infos == null) {
            this.line_infos = new ArrayList();
        }
        this.line_infos.add(elem);
    }

    public void addToSents(String elem) {
        if (this.sents == null) {
            this.sents = new ArrayList();
        }
        this.sents.add(elem);
    }

    @Override // org.apache.thrift.TBase
    public void clear() {
        this.nickname = null;
        this.line_infos = null;
        setDurationIsSet(false);
        this.duration = 0;
        this.title = null;
        this.discountcoupon = null;
        this.answers = null;
        this.emojis = null;
        this.sents = null;
        this.f28151qs = null;
        setStudy_doneIsSet(false);
        this.study_done = 0;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof VocabLiveInfo)) {
            return equals((VocabLiveInfo) that);
        }
        return false;
    }

    public List<LiveAnswerItem> getAnswers() {
        return this.answers;
    }

    public Iterator<LiveAnswerItem> getAnswersIterator() {
        List<LiveAnswerItem> list = this.answers;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getAnswersSize() {
        List<LiveAnswerItem> list = this.answers;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public DiscountCoupon getDiscountcoupon() {
        return this.discountcoupon;
    }

    public int getDuration() {
        return this.duration;
    }

    public List<String> getEmojis() {
        return this.emojis;
    }

    public Iterator<String> getEmojisIterator() {
        List<String> list = this.emojis;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getEmojisSize() {
        List<String> list = this.emojis;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public List<LineInfo> getLine_infos() {
        return this.line_infos;
    }

    public Iterator<LineInfo> getLine_infosIterator() {
        List<LineInfo> list = this.line_infos;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getLine_infosSize() {
        List<LineInfo> list = this.line_infos;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public String getNickname() {
        return this.nickname;
    }

    public CourseQs getQs() {
        return this.f28151qs;
    }

    public List<String> getSents() {
        return this.sents;
    }

    public Iterator<String> getSentsIterator() {
        List<String> list = this.sents;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getSentsSize() {
        List<String> list = this.sents;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public int getStudy_done() {
        return this.study_done;
    }

    public String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetAnswers() {
        return this.answers != null;
    }

    public boolean isSetDiscountcoupon() {
        return this.discountcoupon != null;
    }

    public boolean isSetDuration() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetEmojis() {
        return this.emojis != null;
    }

    public boolean isSetLine_infos() {
        return this.line_infos != null;
    }

    public boolean isSetNickname() {
        return this.nickname != null;
    }

    public boolean isSetQs() {
        return this.f28151qs != null;
    }

    public boolean isSetSents() {
        return this.sents != null;
    }

    public boolean isSetStudy_done() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetTitle() {
        return this.title != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public VocabLiveInfo setAnswers(List<LiveAnswerItem> answers) {
        this.answers = answers;
        return this;
    }

    public void setAnswersIsSet(boolean value) {
        if (value) {
            return;
        }
        this.answers = null;
    }

    public VocabLiveInfo setDiscountcoupon(DiscountCoupon discountcoupon) {
        this.discountcoupon = discountcoupon;
        return this;
    }

    public void setDiscountcouponIsSet(boolean value) {
        if (value) {
            return;
        }
        this.discountcoupon = null;
    }

    public VocabLiveInfo setDuration(int duration) {
        this.duration = duration;
        setDurationIsSet(true);
        return this;
    }

    public void setDurationIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public VocabLiveInfo setEmojis(List<String> emojis) {
        this.emojis = emojis;
        return this;
    }

    public void setEmojisIsSet(boolean value) {
        if (value) {
            return;
        }
        this.emojis = null;
    }

    public VocabLiveInfo setLine_infos(List<LineInfo> line_infos) {
        this.line_infos = line_infos;
        return this;
    }

    public void setLine_infosIsSet(boolean value) {
        if (value) {
            return;
        }
        this.line_infos = null;
    }

    public VocabLiveInfo setNickname(String nickname) {
        this.nickname = nickname;
        return this;
    }

    public void setNicknameIsSet(boolean value) {
        if (value) {
            return;
        }
        this.nickname = null;
    }

    public VocabLiveInfo setQs(CourseQs qs2) {
        this.f28151qs = qs2;
        return this;
    }

    public void setQsIsSet(boolean value) {
        if (value) {
            return;
        }
        this.f28151qs = null;
    }

    public VocabLiveInfo setSents(List<String> sents) {
        this.sents = sents;
        return this;
    }

    public void setSentsIsSet(boolean value) {
        if (value) {
            return;
        }
        this.sents = null;
    }

    public VocabLiveInfo setStudy_done(int study_done) {
        this.study_done = study_done;
        setStudy_doneIsSet(true);
        return this;
    }

    public void setStudy_doneIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public VocabLiveInfo setTitle(String title) {
        this.title = title;
        return this;
    }

    public void setTitleIsSet(boolean value) {
        if (value) {
            return;
        }
        this.title = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("VocabLiveInfo(");
        if (isSetNickname()) {
            sb2.append("nickname:");
            String str = this.nickname;
            if (str == null) {
                sb2.append("null");
            } else {
                sb2.append(str);
            }
            sb2.append(j2.O);
        }
        sb2.append("line_infos:");
        List<LineInfo> list = this.line_infos;
        if (list == null) {
            sb2.append("null");
        } else {
            sb2.append(list);
        }
        sb2.append(j2.O);
        sb2.append("duration:");
        sb2.append(this.duration);
        sb2.append(j2.O);
        sb2.append("title:");
        String str2 = this.title;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(str2);
        }
        if (isSetDiscountcoupon()) {
            sb2.append(j2.O);
            sb2.append("discountcoupon:");
            DiscountCoupon discountCoupon = this.discountcoupon;
            if (discountCoupon == null) {
                sb2.append("null");
            } else {
                sb2.append(discountCoupon);
            }
        }
        if (isSetAnswers()) {
            sb2.append(j2.O);
            sb2.append("answers:");
            List<LiveAnswerItem> list2 = this.answers;
            if (list2 == null) {
                sb2.append("null");
            } else {
                sb2.append(list2);
            }
        }
        sb2.append(j2.O);
        sb2.append("emojis:");
        List<String> list3 = this.emojis;
        if (list3 == null) {
            sb2.append("null");
        } else {
            sb2.append(list3);
        }
        sb2.append(j2.O);
        sb2.append("sents:");
        List<String> list4 = this.sents;
        if (list4 == null) {
            sb2.append("null");
        } else {
            sb2.append(list4);
        }
        if (isSetQs()) {
            sb2.append(j2.O);
            sb2.append("qs:");
            CourseQs courseQs = this.f28151qs;
            if (courseQs == null) {
                sb2.append("null");
            } else {
                sb2.append(courseQs);
            }
        }
        sb2.append(j2.O);
        sb2.append("study_done:");
        sb2.append(this.study_done);
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetAnswers() {
        this.answers = null;
    }

    public void unsetDiscountcoupon() {
        this.discountcoupon = null;
    }

    public void unsetDuration() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetEmojis() {
        this.emojis = null;
    }

    public void unsetLine_infos() {
        this.line_infos = null;
    }

    public void unsetNickname() {
        this.nickname = null;
    }

    public void unsetQs() {
        this.f28151qs = null;
    }

    public void unsetSents() {
        this.sents = null;
    }

    public void unsetStudy_done() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetTitle() {
        this.title = null;
    }

    public void validate() throws TException {
        if (this.line_infos == null) {
            throw new TProtocolException("Required field 'line_infos' was not present! Struct: " + toString());
        }
        if (this.title == null) {
            throw new TProtocolException("Required field 'title' was not present! Struct: " + toString());
        }
        if (this.emojis == null) {
            throw new TProtocolException("Required field 'emojis' was not present! Struct: " + toString());
        }
        if (this.sents == null) {
            throw new TProtocolException("Required field 'sents' was not present! Struct: " + toString());
        }
        DiscountCoupon discountCoupon = this.discountcoupon;
        if (discountCoupon != null) {
            discountCoupon.validate();
        }
        CourseQs courseQs = this.f28151qs;
        if (courseQs != null) {
            courseQs.validate();
        }
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(VocabLiveInfo other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        int compareTo5;
        int compareTo6;
        int compareTo7;
        int compareTo8;
        int compareTo9;
        int compareTo10;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo11 = Boolean.valueOf(isSetNickname()).compareTo(Boolean.valueOf(other.isSetNickname()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (isSetNickname() && (compareTo10 = TBaseHelper.compareTo(this.nickname, other.nickname)) != 0) {
            return compareTo10;
        }
        int compareTo12 = Boolean.valueOf(isSetLine_infos()).compareTo(Boolean.valueOf(other.isSetLine_infos()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (isSetLine_infos() && (compareTo9 = TBaseHelper.compareTo((List) this.line_infos, (List) other.line_infos)) != 0) {
            return compareTo9;
        }
        int compareTo13 = Boolean.valueOf(isSetDuration()).compareTo(Boolean.valueOf(other.isSetDuration()));
        if (compareTo13 != 0) {
            return compareTo13;
        }
        if (isSetDuration() && (compareTo8 = TBaseHelper.compareTo(this.duration, other.duration)) != 0) {
            return compareTo8;
        }
        int compareTo14 = Boolean.valueOf(isSetTitle()).compareTo(Boolean.valueOf(other.isSetTitle()));
        if (compareTo14 != 0) {
            return compareTo14;
        }
        if (isSetTitle() && (compareTo7 = TBaseHelper.compareTo(this.title, other.title)) != 0) {
            return compareTo7;
        }
        int compareTo15 = Boolean.valueOf(isSetDiscountcoupon()).compareTo(Boolean.valueOf(other.isSetDiscountcoupon()));
        if (compareTo15 != 0) {
            return compareTo15;
        }
        if (isSetDiscountcoupon() && (compareTo6 = TBaseHelper.compareTo((Comparable) this.discountcoupon, (Comparable) other.discountcoupon)) != 0) {
            return compareTo6;
        }
        int compareTo16 = Boolean.valueOf(isSetAnswers()).compareTo(Boolean.valueOf(other.isSetAnswers()));
        if (compareTo16 != 0) {
            return compareTo16;
        }
        if (isSetAnswers() && (compareTo5 = TBaseHelper.compareTo((List) this.answers, (List) other.answers)) != 0) {
            return compareTo5;
        }
        int compareTo17 = Boolean.valueOf(isSetEmojis()).compareTo(Boolean.valueOf(other.isSetEmojis()));
        if (compareTo17 != 0) {
            return compareTo17;
        }
        if (isSetEmojis() && (compareTo4 = TBaseHelper.compareTo((List) this.emojis, (List) other.emojis)) != 0) {
            return compareTo4;
        }
        int compareTo18 = Boolean.valueOf(isSetSents()).compareTo(Boolean.valueOf(other.isSetSents()));
        if (compareTo18 != 0) {
            return compareTo18;
        }
        if (isSetSents() && (compareTo3 = TBaseHelper.compareTo((List) this.sents, (List) other.sents)) != 0) {
            return compareTo3;
        }
        int compareTo19 = Boolean.valueOf(isSetQs()).compareTo(Boolean.valueOf(other.isSetQs()));
        if (compareTo19 != 0) {
            return compareTo19;
        }
        if (isSetQs() && (compareTo2 = TBaseHelper.compareTo((Comparable) this.f28151qs, (Comparable) other.f28151qs)) != 0) {
            return compareTo2;
        }
        int compareTo20 = Boolean.valueOf(isSetStudy_done()).compareTo(Boolean.valueOf(other.isSetStudy_done()));
        if (compareTo20 != 0) {
            return compareTo20;
        }
        if (!isSetStudy_done() || (compareTo = TBaseHelper.compareTo(this.study_done, other.study_done)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<VocabLiveInfo, _Fields> deepCopy2() {
        return new VocabLiveInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$course_api$VocabLiveInfo$_Fields[field.ordinal()]) {
            case 1:
                return getNickname();
            case 2:
                return getLine_infos();
            case 3:
                return Integer.valueOf(getDuration());
            case 4:
                return getTitle();
            case 5:
                return getDiscountcoupon();
            case 6:
                return getAnswers();
            case 7:
                return getEmojis();
            case 8:
                return getSents();
            case 9:
                return getQs();
            case 10:
                return Integer.valueOf(getStudy_done());
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$course_api$VocabLiveInfo$_Fields[field.ordinal()]) {
            case 1:
                return isSetNickname();
            case 2:
                return isSetLine_infos();
            case 3:
                return isSetDuration();
            case 4:
                return isSetTitle();
            case 5:
                return isSetDiscountcoupon();
            case 6:
                return isSetAnswers();
            case 7:
                return isSetEmojis();
            case 8:
                return isSetSents();
            case 9:
                return isSetQs();
            case 10:
                return isSetStudy_done();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$course_api$VocabLiveInfo$_Fields[field.ordinal()]) {
            case 1:
                if (value != null) {
                    setNickname((String) value);
                    break;
                } else {
                    unsetNickname();
                    break;
                }
            case 2:
                if (value != null) {
                    setLine_infos((List) value);
                    break;
                } else {
                    unsetLine_infos();
                    break;
                }
            case 3:
                if (value != null) {
                    setDuration(((Integer) value).intValue());
                    break;
                } else {
                    unsetDuration();
                    break;
                }
            case 4:
                if (value != null) {
                    setTitle((String) value);
                    break;
                } else {
                    unsetTitle();
                    break;
                }
            case 5:
                if (value != null) {
                    setDiscountcoupon((DiscountCoupon) value);
                    break;
                } else {
                    unsetDiscountcoupon();
                    break;
                }
            case 6:
                if (value != null) {
                    setAnswers((List) value);
                    break;
                } else {
                    unsetAnswers();
                    break;
                }
            case 7:
                if (value != null) {
                    setEmojis((List) value);
                    break;
                } else {
                    unsetEmojis();
                    break;
                }
            case 8:
                if (value != null) {
                    setSents((List) value);
                    break;
                } else {
                    unsetSents();
                    break;
                }
            case 9:
                if (value != null) {
                    setQs((CourseQs) value);
                    break;
                } else {
                    unsetQs();
                    break;
                }
            case 10:
                if (value != null) {
                    setStudy_done(((Integer) value).intValue());
                    break;
                } else {
                    unsetStudy_done();
                    break;
                }
        }
    }

    public boolean equals(VocabLiveInfo that) {
        if (that == null) {
            return false;
        }
        boolean isSetNickname = isSetNickname();
        boolean isSetNickname2 = that.isSetNickname();
        if ((isSetNickname || isSetNickname2) && !(isSetNickname && isSetNickname2 && this.nickname.equals(that.nickname))) {
            return false;
        }
        boolean isSetLine_infos = isSetLine_infos();
        boolean isSetLine_infos2 = that.isSetLine_infos();
        if (((isSetLine_infos || isSetLine_infos2) && !(isSetLine_infos && isSetLine_infos2 && this.line_infos.equals(that.line_infos))) || this.duration != that.duration) {
            return false;
        }
        boolean isSetTitle = isSetTitle();
        boolean isSetTitle2 = that.isSetTitle();
        if ((isSetTitle || isSetTitle2) && !(isSetTitle && isSetTitle2 && this.title.equals(that.title))) {
            return false;
        }
        boolean isSetDiscountcoupon = isSetDiscountcoupon();
        boolean isSetDiscountcoupon2 = that.isSetDiscountcoupon();
        if ((isSetDiscountcoupon || isSetDiscountcoupon2) && !(isSetDiscountcoupon && isSetDiscountcoupon2 && this.discountcoupon.equals(that.discountcoupon))) {
            return false;
        }
        boolean isSetAnswers = isSetAnswers();
        boolean isSetAnswers2 = that.isSetAnswers();
        if ((isSetAnswers || isSetAnswers2) && !(isSetAnswers && isSetAnswers2 && this.answers.equals(that.answers))) {
            return false;
        }
        boolean isSetEmojis = isSetEmojis();
        boolean isSetEmojis2 = that.isSetEmojis();
        if ((isSetEmojis || isSetEmojis2) && !(isSetEmojis && isSetEmojis2 && this.emojis.equals(that.emojis))) {
            return false;
        }
        boolean isSetSents = isSetSents();
        boolean isSetSents2 = that.isSetSents();
        if ((isSetSents || isSetSents2) && !(isSetSents && isSetSents2 && this.sents.equals(that.sents))) {
            return false;
        }
        boolean isSetQs = isSetQs();
        boolean isSetQs2 = that.isSetQs();
        return (!(isSetQs || isSetQs2) || (isSetQs && isSetQs2 && this.f28151qs.equals(that.f28151qs))) && this.study_done == that.study_done;
    }

    public VocabLiveInfo(List<LineInfo> line_infos, int duration, String title, List<String> emojis, List<String> sents, int study_done) {
        this();
        this.line_infos = line_infos;
        this.duration = duration;
        setDurationIsSet(true);
        this.title = title;
        this.emojis = emojis;
        this.sents = sents;
        this.study_done = study_done;
        setStudy_doneIsSet(true);
    }

    public VocabLiveInfo(VocabLiveInfo other) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.NICKNAME, _Fields.DISCOUNTCOUPON, _Fields.ANSWERS, _Fields.QS};
        this.__isset_bitfield = other.__isset_bitfield;
        if (other.isSetNickname()) {
            this.nickname = other.nickname;
        }
        if (other.isSetLine_infos()) {
            ArrayList arrayList = new ArrayList(other.line_infos.size());
            Iterator<LineInfo> it = other.line_infos.iterator();
            while (it.hasNext()) {
                arrayList.add(new LineInfo(it.next()));
            }
            this.line_infos = arrayList;
        }
        this.duration = other.duration;
        if (other.isSetTitle()) {
            this.title = other.title;
        }
        if (other.isSetDiscountcoupon()) {
            this.discountcoupon = new DiscountCoupon(other.discountcoupon);
        }
        if (other.isSetAnswers()) {
            ArrayList arrayList2 = new ArrayList(other.answers.size());
            Iterator<LiveAnswerItem> it2 = other.answers.iterator();
            while (it2.hasNext()) {
                arrayList2.add(new LiveAnswerItem(it2.next()));
            }
            this.answers = arrayList2;
        }
        if (other.isSetEmojis()) {
            this.emojis = new ArrayList(other.emojis);
        }
        if (other.isSetSents()) {
            this.sents = new ArrayList(other.sents);
        }
        if (other.isSetQs()) {
            this.f28151qs = new CourseQs(other.f28151qs);
        }
        this.study_done = other.study_done;
    }
}

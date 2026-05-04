package l50;

import androidx.exifinterface.media.ExifInterface;
import java.util.Iterator;
import kotlinx.serialization.json.DecodeSequenceMode;
import kotlinx.serialization.json.internal.WriteMode;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class u0 {

    /* renamed from: a, reason: collision with root package name */
    public static final int f70072a = 65535;

    /* renamed from: b, reason: collision with root package name */
    public static final int f70073b = 55232;

    /* renamed from: c, reason: collision with root package name */
    public static final int f70074c = 56320;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 JsonStreams.kt\nkotlinx/serialization/json/internal/JsonStreamsKt\n*L\n1#1,731:1\n129#2:732\n*E\n"})
    public static final class a<T> implements q30.m<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Iterator f70075a;

        public a(Iterator it) {
            this.f70075a = it;
        }

        @Override // q30.m
        public Iterator<T> iterator() {
            return this.f70075a;
        }
    }

    @j0
    public static final <T> T a(@m80.k k50.a json, @m80.k f50.e<? extends T> deserializer, @m80.k c0 reader) {
        kotlin.jvm.internal.g0.p(json, "json");
        kotlin.jvm.internal.g0.p(deserializer, "deserializer");
        kotlin.jvm.internal.g0.p(reader, "reader");
        f1 b11 = g1.b(json, reader, null, 4, null);
        try {
            T t11 = (T) new j1(json, WriteMode.OBJ, b11, deserializer.a(), null).decodeSerializableValue(deserializer);
            b11.z();
            return t11;
        } finally {
            b11.j0();
        }
    }

    @f50.f
    @j0
    @m80.k
    public static final <T> q30.m<T> b(@m80.k k50.a json, @m80.k c0 reader, @m80.k f50.e<? extends T> deserializer, @m80.k DecodeSequenceMode format) {
        kotlin.jvm.internal.g0.p(json, "json");
        kotlin.jvm.internal.g0.p(reader, "reader");
        kotlin.jvm.internal.g0.p(deserializer, "deserializer");
        kotlin.jvm.internal.g0.p(format, "format");
        return q30.x.k(new a(l0.a(format, json, g1.a(json, reader, new char[16384]), deserializer)));
    }

    @f50.f
    @j0
    public static final /* synthetic */ <T> q30.m<T> c(k50.a json, c0 reader, DecodeSequenceMode format) {
        kotlin.jvm.internal.g0.p(json, "json");
        kotlin.jvm.internal.g0.p(reader, "reader");
        kotlin.jvm.internal.g0.p(format, "format");
        o50.f serializersModule = json.getSerializersModule();
        kotlin.jvm.internal.g0.y(6, ExifInterface.GPS_DIRECTION_TRUE);
        kotlin.jvm.internal.l0.n("kotlinx.serialization.serializer.withModule");
        return b(json, reader, f50.k0.n(serializersModule, null), format);
    }

    public static /* synthetic */ q30.m d(k50.a aVar, c0 c0Var, f50.e eVar, DecodeSequenceMode decodeSequenceMode, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            decodeSequenceMode = DecodeSequenceMode.AUTO_DETECT;
        }
        return b(aVar, c0Var, eVar, decodeSequenceMode);
    }

    public static /* synthetic */ q30.m e(k50.a json, c0 reader, DecodeSequenceMode format, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            format = DecodeSequenceMode.AUTO_DETECT;
        }
        kotlin.jvm.internal.g0.p(json, "json");
        kotlin.jvm.internal.g0.p(reader, "reader");
        kotlin.jvm.internal.g0.p(format, "format");
        o50.f serializersModule = json.getSerializersModule();
        kotlin.jvm.internal.g0.y(6, ExifInterface.GPS_DIRECTION_TRUE);
        kotlin.jvm.internal.l0.n("kotlinx.serialization.serializer.withModule");
        return b(json, reader, f50.k0.n(serializersModule, null), format);
    }

    @j0
    public static final <T> void f(@m80.k k50.a json, @m80.k e0 writer, @m80.k f50.b0<? super T> serializer, T t11) {
        kotlin.jvm.internal.g0.p(json, "json");
        kotlin.jvm.internal.g0.p(writer, "writer");
        kotlin.jvm.internal.g0.p(serializer, "serializer");
        new l1(writer, json, WriteMode.OBJ, new k50.x[WriteMode.getEntries().size()]).encodeSerializableValue(serializer, t11);
    }
}

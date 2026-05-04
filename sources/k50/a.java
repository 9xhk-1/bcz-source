package k50;

import androidx.exifinterface.media.ExifInterface;
import kotlin.DeprecationLevel;
import kotlinx.serialization.json.internal.WriteMode;
import l50.j1;
import l50.n1;
import l50.o1;
import l50.s1;
import l50.u0;
import l50.u1;
import l50.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class a implements f50.p0 {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final C0758a f65901d = new C0758a(null);

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final g f65902a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final o50.f f65903b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final l50.a0 f65904c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: k50.a$a, reason: collision with other inner class name */
    public static final class C0758a extends a {
        public /* synthetic */ C0758a(kotlin.jvm.internal.v vVar) {
            this();
        }

        public C0758a() {
            super(new g(false, false, false, false, false, false, null, false, false, null, false, false, null, false, false, false, null, 131071, null), o50.h.a(), null);
        }
    }

    public /* synthetic */ a(g gVar, o50.f fVar, kotlin.jvm.internal.v vVar) {
        this(gVar, fVar);
    }

    @Override // f50.p0
    @m80.k
    public final <T> String a(@m80.k f50.b0<? super T> serializer, T t11) {
        kotlin.jvm.internal.g0.p(serializer, "serializer");
        w0 w0Var = new w0();
        try {
            u0.f(this, w0Var, serializer, t11);
            return w0Var.toString();
        } finally {
            w0Var.release();
        }
    }

    @Override // f50.p0
    public final <T> T c(@m80.k f50.e<? extends T> deserializer, @l80.d(prefix = "", suffix = "", value = "json") @m80.k String string) {
        kotlin.jvm.internal.g0.p(deserializer, "deserializer");
        kotlin.jvm.internal.g0.p(string, "string");
        n1 a11 = o1.a(this, string);
        T t11 = (T) new j1(this, WriteMode.OBJ, a11, deserializer.a(), null).decodeSerializableValue(deserializer);
        a11.z();
        return t11;
    }

    public final <T> T e(@m80.k f50.e<? extends T> deserializer, @m80.k k element) {
        kotlin.jvm.internal.g0.p(deserializer, "deserializer");
        kotlin.jvm.internal.g0.p(element, "element");
        return (T) s1.a(this, element, deserializer);
    }

    public final /* synthetic */ <T> T f(@l80.d(prefix = "", suffix = "", value = "json") String string) {
        kotlin.jvm.internal.g0.p(string, "string");
        o50.f serializersModule = getSerializersModule();
        kotlin.jvm.internal.g0.y(6, ExifInterface.GPS_DIRECTION_TRUE);
        kotlin.jvm.internal.l0.n("kotlinx.serialization.serializer.withModule");
        return (T) c(f50.k0.n(serializersModule, null), string);
    }

    @m80.k
    public final <T> k g(@m80.k f50.b0<? super T> serializer, T t11) {
        kotlin.jvm.internal.g0.p(serializer, "serializer");
        return u1.e(this, t11, serializer);
    }

    @Override // f50.w
    @m80.k
    public o50.f getSerializersModule() {
        return this.f65903b;
    }

    public final /* synthetic */ <T> String h(T t11) {
        o50.f serializersModule = getSerializersModule();
        kotlin.jvm.internal.g0.y(6, ExifInterface.GPS_DIRECTION_TRUE);
        kotlin.jvm.internal.l0.n("kotlinx.serialization.serializer.withModule");
        return a(f50.k0.n(serializersModule, null), t11);
    }

    @m80.k
    public final g i() {
        return this.f65902a;
    }

    @m80.k
    public final l50.a0 j() {
        return this.f65904c;
    }

    @m80.k
    public final k l(@l80.d(prefix = "", suffix = "", value = "json") @m80.k String string) {
        kotlin.jvm.internal.g0.p(string, "string");
        return (k) c(v.f65976a, string);
    }

    public a(g gVar, o50.f fVar) {
        this.f65902a = gVar;
        this.f65903b = fVar;
        this.f65904c = new l50.a0();
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "Should not be accessed directly, use Json.schemaCache accessor instead", replaceWith = @yz.w0(expression = "schemaCache", imports = {}))
    public static /* synthetic */ void k() {
    }
}

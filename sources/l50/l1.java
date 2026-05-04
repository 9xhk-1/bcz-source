package l50;

import androidx.exifinterface.media.ExifInterface;
import kotlin.KotlinNothingValueException;
import kotlinx.serialization.json.internal.WriteMode;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nStreamingJsonEncoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StreamingJsonEncoder.kt\nkotlinx/serialization/json/internal/StreamingJsonEncoder\n+ 2 Polymorphic.kt\nkotlinx/serialization/json/internal/PolymorphicKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,232:1\n178#1,2:261\n178#1,2:263\n21#2,12:233\n35#2,15:246\n1#3:245\n1#3:265\n*S KotlinDebug\n*F\n+ 1 StreamingJsonEncoder.kt\nkotlinx/serialization/json/internal/StreamingJsonEncoder\n*L\n168#1:261,2\n169#1:263,2\n68#1:233,12\n68#1:246,15\n68#1:245\n*E\n"})
/* loaded from: classes8.dex */
public final class l1 extends i50.b implements k50.x {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final s f70020a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final k50.a f70021b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final WriteMode f70022c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    public final k50.x[] f70023d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final o50.f f70024e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final k50.g f70025f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f70026g;

    /* renamed from: h, reason: collision with root package name */
    @m80.l
    public String f70027h;

    /* renamed from: i, reason: collision with root package name */
    @m80.l
    public String f70028i;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f70029a;

        static {
            int[] iArr = new int[WriteMode.values().length];
            try {
                iArr[WriteMode.LIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WriteMode.MAP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WriteMode.POLY_OBJ.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f70029a = iArr;
        }
    }

    public l1(@m80.k s composer, @m80.k k50.a json, @m80.k WriteMode mode, @m80.l k50.x[] xVarArr) {
        kotlin.jvm.internal.g0.p(composer, "composer");
        kotlin.jvm.internal.g0.p(json, "json");
        kotlin.jvm.internal.g0.p(mode, "mode");
        this.f70020a = composer;
        this.f70021b = json;
        this.f70022c = mode;
        this.f70023d = xVarArr;
        this.f70024e = a().getSerializersModule();
        this.f70025f = a().i();
        int ordinal = mode.ordinal();
        if (xVarArr != null) {
            k50.x xVar = xVarArr[ordinal];
            if (xVar == null && xVar == this) {
                return;
            }
            xVarArr[ordinal] = this;
        }
    }

    @Override // k50.x
    @m80.k
    public k50.a a() {
        return this.f70021b;
    }

    @Override // i50.b, i50.h
    @m80.k
    public i50.e beginStructure(@m80.k h50.f descriptor) {
        k50.x xVar;
        kotlin.jvm.internal.g0.p(descriptor, "descriptor");
        WriteMode c11 = v1.c(a(), descriptor);
        char c12 = c11.begin;
        if (c12 != 0) {
            this.f70020a.f(c12);
            this.f70020a.b();
        }
        String str = this.f70027h;
        if (str != null) {
            String str2 = this.f70028i;
            if (str2 == null) {
                str2 = descriptor.k();
            }
            n(str, str2);
            this.f70027h = null;
            this.f70028i = null;
        }
        if (this.f70022c == c11) {
            return this;
        }
        k50.x[] xVarArr = this.f70023d;
        return (xVarArr == null || (xVar = xVarArr[c11.ordinal()]) == null) ? new l1(this.f70020a, a(), c11, this.f70023d) : xVar;
    }

    @Override // k50.x
    public void d(@m80.k k50.k element) {
        kotlin.jvm.internal.g0.p(element, "element");
        if (this.f70027h == null || (element instanceof k50.i0)) {
            encodeSerializableValue(k50.v.f65976a, element);
        } else {
            e1.f(this.f70028i, element);
            throw new KotlinNothingValueException();
        }
    }

    @Override // i50.b, i50.h
    public void encodeBoolean(boolean z11) {
        if (this.f70026g) {
            encodeString(String.valueOf(z11));
        } else {
            this.f70020a.m(z11);
        }
    }

    @Override // i50.b, i50.h
    public void encodeByte(byte b11) {
        if (this.f70026g) {
            encodeString(String.valueOf((int) b11));
        } else {
            this.f70020a.e(b11);
        }
    }

    @Override // i50.b, i50.h
    public void encodeChar(char c11) {
        encodeString(String.valueOf(c11));
    }

    @Override // i50.b, i50.h
    public void encodeDouble(double d11) {
        if (this.f70026g) {
            encodeString(String.valueOf(d11));
        } else {
            this.f70020a.g(d11);
        }
        if (!this.f70025f.c() && Math.abs(d11) > Double.MAX_VALUE) {
            throw i0.b(Double.valueOf(d11), this.f70020a.f70064a.toString());
        }
    }

    @Override // i50.b
    public boolean encodeElement(@m80.k h50.f descriptor, int i11) {
        kotlin.jvm.internal.g0.p(descriptor, "descriptor");
        int i12 = a.f70029a[this.f70022c.ordinal()];
        if (i12 != 1) {
            boolean z11 = false;
            if (i12 != 2) {
                if (i12 != 3) {
                    if (!this.f70020a.a()) {
                        this.f70020a.f(',');
                    }
                    this.f70020a.c();
                    encodeString(p0.i(descriptor, a(), i11));
                    this.f70020a.f(':');
                    this.f70020a.p();
                } else {
                    if (i11 == 0) {
                        this.f70026g = true;
                    }
                    if (i11 == 1) {
                        this.f70020a.f(',');
                        this.f70020a.p();
                        this.f70026g = false;
                    }
                }
            } else if (this.f70020a.a()) {
                this.f70026g = true;
                this.f70020a.c();
            } else {
                if (i11 % 2 == 0) {
                    this.f70020a.f(',');
                    this.f70020a.c();
                    z11 = true;
                } else {
                    this.f70020a.f(':');
                    this.f70020a.p();
                }
                this.f70026g = z11;
            }
        } else {
            if (!this.f70020a.a()) {
                this.f70020a.f(',');
            }
            this.f70020a.c();
        }
        return true;
    }

    @Override // i50.b, i50.h
    public void encodeEnum(@m80.k h50.f enumDescriptor, int i11) {
        kotlin.jvm.internal.g0.p(enumDescriptor, "enumDescriptor");
        encodeString(enumDescriptor.i(i11));
    }

    @Override // i50.b, i50.h
    public void encodeFloat(float f11) {
        if (this.f70026g) {
            encodeString(String.valueOf(f11));
        } else {
            this.f70020a.h(f11);
        }
        if (!this.f70025f.c() && Math.abs(f11) > Float.MAX_VALUE) {
            throw i0.b(Float.valueOf(f11), this.f70020a.f70064a.toString());
        }
    }

    @Override // i50.b, i50.h
    @m80.k
    public i50.h encodeInline(@m80.k h50.f descriptor) {
        kotlin.jvm.internal.g0.p(descriptor, "descriptor");
        if (m1.b(descriptor)) {
            s sVar = this.f70020a;
            if (!(sVar instanceof w)) {
                sVar = new w(sVar.f70064a, this.f70026g);
            }
            return new l1(sVar, a(), this.f70022c, (k50.x[]) null);
        }
        if (m1.a(descriptor)) {
            s sVar2 = this.f70020a;
            if (!(sVar2 instanceof t)) {
                sVar2 = new t(sVar2.f70064a, this.f70026g);
            }
            return new l1(sVar2, a(), this.f70022c, (k50.x[]) null);
        }
        if (this.f70027h == null) {
            return super.encodeInline(descriptor);
        }
        this.f70028i = descriptor.k();
        return this;
    }

    @Override // i50.b, i50.h
    public void encodeInt(int i11) {
        if (this.f70026g) {
            encodeString(String.valueOf(i11));
        } else {
            this.f70020a.i(i11);
        }
    }

    @Override // i50.b, i50.h
    public void encodeLong(long j11) {
        if (this.f70026g) {
            encodeString(String.valueOf(j11));
        } else {
            this.f70020a.j(j11);
        }
    }

    @Override // i50.b, i50.h
    public void encodeNull() {
        this.f70020a.k("null");
    }

    @Override // i50.b, i50.e
    public <T> void encodeNullableSerializableElement(@m80.k h50.f descriptor, int i11, @m80.k f50.b0<? super T> serializer, @m80.l T t11) {
        kotlin.jvm.internal.g0.p(descriptor, "descriptor");
        kotlin.jvm.internal.g0.p(serializer, "serializer");
        if (t11 != null || this.f70025f.n()) {
            super.encodeNullableSerializableElement(descriptor, i11, serializer, t11);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x005f, code lost:
    
        if (kotlin.jvm.internal.g0.g(r1, h50.n.d.f58544a) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:
    
        if (a().i().h() != kotlinx.serialization.json.ClassDiscriminatorMode.NONE) goto L21;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // i50.b, i50.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <T> void encodeSerializableValue(@m80.k f50.b0<? super T> r4, T r5) {
        /*
            r3 = this;
            java.lang.String r0 = "serializer"
            kotlin.jvm.internal.g0.p(r4, r0)
            k50.a r0 = r3.a()
            k50.g r0 = r0.i()
            boolean r0 = r0.v()
            if (r0 == 0) goto L17
            r4.b(r3, r5)
            return
        L17:
            boolean r0 = r4 instanceof j50.b
            if (r0 == 0) goto L2c
            k50.a r1 = r3.a()
            k50.g r1 = r1.i()
            kotlinx.serialization.json.ClassDiscriminatorMode r1 = r1.h()
            kotlinx.serialization.json.ClassDiscriminatorMode r2 = kotlinx.serialization.json.ClassDiscriminatorMode.NONE
            if (r1 == r2) goto L74
            goto L61
        L2c:
            k50.a r1 = r3.a()
            k50.g r1 = r1.i()
            kotlinx.serialization.json.ClassDiscriminatorMode r1 = r1.h()
            int[] r2 = l50.e1.a.f69987a
            int r1 = r1.ordinal()
            r1 = r2[r1]
            r2 = 1
            if (r1 == r2) goto L74
            r2 = 2
            if (r1 == r2) goto L74
            r2 = 3
            if (r1 != r2) goto L6e
            h50.f r1 = r4.a()
            h50.m r1 = r1.getKind()
            h50.n$a r2 = h50.n.a.f58541a
            boolean r2 = kotlin.jvm.internal.g0.g(r1, r2)
            if (r2 != 0) goto L61
            h50.n$d r2 = h50.n.d.f58544a
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r2)
            if (r1 == 0) goto L74
        L61:
            h50.f r1 = r4.a()
            k50.a r2 = r3.a()
            java.lang.String r1 = l50.e1.c(r1, r2)
            goto L75
        L6e:
            kotlin.NoWhenBranchMatchedException r4 = new kotlin.NoWhenBranchMatchedException
            r4.<init>()
            throw r4
        L74:
            r1 = 0
        L75:
            if (r0 == 0) goto Lbb
            r0 = r4
            j50.b r0 = (j50.b) r0
            if (r5 == 0) goto L97
            f50.b0 r0 = f50.p.b(r0, r3, r5)
            if (r1 == 0) goto L90
            l50.e1.a(r4, r0, r1)
            h50.f r4 = r0.a()
            h50.m r4 = r4.getKind()
            l50.e1.b(r4)
        L90:
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.serialization.SerializationStrategy<T of kotlinx.serialization.json.internal.PolymorphicKt.encodePolymorphically>"
            kotlin.jvm.internal.g0.n(r0, r4)
            r4 = r0
            goto Lbb
        L97:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Value for serializer "
            r4.append(r5)
            h50.f r5 = r0.a()
            r4.append(r5)
            java.lang.String r5 = " should always be non-null. Please report issue to the kotlinx.serialization tracker."
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
            throw r5
        Lbb:
            if (r1 == 0) goto Lc9
            h50.f r0 = r4.a()
            java.lang.String r0 = r0.k()
            r3.f70027h = r1
            r3.f70028i = r0
        Lc9:
            r4.b(r3, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l50.l1.encodeSerializableValue(f50.b0, java.lang.Object):void");
    }

    @Override // i50.b, i50.h
    public void encodeShort(short s11) {
        if (this.f70026g) {
            encodeString(String.valueOf((int) s11));
        } else {
            this.f70020a.l(s11);
        }
    }

    @Override // i50.b, i50.h
    public void encodeString(@m80.k String value) {
        kotlin.jvm.internal.g0.p(value, "value");
        this.f70020a.n(value);
    }

    @Override // i50.b, i50.e
    public void endStructure(@m80.k h50.f descriptor) {
        kotlin.jvm.internal.g0.p(descriptor, "descriptor");
        if (this.f70022c.end != 0) {
            this.f70020a.q();
            this.f70020a.d();
            this.f70020a.f(this.f70022c.end);
        }
    }

    @Override // i50.h, i50.e
    @m80.k
    public o50.f getSerializersModule() {
        return this.f70024e;
    }

    public final /* synthetic */ <T extends s> T m(x00.p<? super e0, ? super Boolean, ? extends T> pVar) {
        s sVar = this.f70020a;
        kotlin.jvm.internal.g0.y(3, ExifInterface.GPS_DIRECTION_TRUE);
        return sVar != null ? (T) this.f70020a : pVar.invoke(this.f70020a.f70064a, Boolean.valueOf(this.f70026g));
    }

    public final void n(String str, String str2) {
        this.f70020a.c();
        encodeString(str);
        this.f70020a.f(':');
        this.f70020a.p();
        encodeString(str2);
    }

    @Override // i50.b, i50.e
    public boolean shouldEncodeElementDefault(@m80.k h50.f descriptor, int i11) {
        kotlin.jvm.internal.g0.p(descriptor, "descriptor");
        return this.f70025f.m();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l1(@m80.k e0 output, @m80.k k50.a json, @m80.k WriteMode mode, @m80.k k50.x[] modeReuseCache) {
        this(y.a(output, json), json, mode, modeReuseCache);
        kotlin.jvm.internal.g0.p(output, "output");
        kotlin.jvm.internal.g0.p(json, "json");
        kotlin.jvm.internal.g0.p(mode, "mode");
        kotlin.jvm.internal.g0.p(modeReuseCache, "modeReuseCache");
    }
}

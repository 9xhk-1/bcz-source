package w8;

import com.baicizhan.main.collectreview.ui.CollectReviewActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import ws.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class c implements ts.e {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final b f95711d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    @k
    public static final ts.a<c, a> f95712e = new C1286c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final long f95713a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final int f95714b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @k
    public final List<e> f95715c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: w8.c$c, reason: collision with other inner class name */
    public static final class C1286c implements ts.a<c, a> {
        @Override // ts.a
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public c read(@k i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public c read(@k i protocol, @k a builder) {
            g0.p(protocol, "protocol");
            g0.p(builder, "builder");
            protocol.u0();
            while (true) {
                ws.d a62 = protocol.a6();
                byte b11 = a62.f96796b;
                if (b11 == 0) {
                    protocol.I4();
                    return builder.build();
                }
                short s11 = a62.f96797c;
                if (s11 != 1) {
                    if (s11 != 2) {
                        if (s11 != 3) {
                            at.b.a(protocol, b11);
                        } else if (b11 == 15) {
                            ws.f v42 = protocol.v4();
                            ArrayList arrayList = new ArrayList(v42.f96838b);
                            int i11 = v42.f96838b;
                            for (int i12 = 0; i12 < i11; i12++) {
                                arrayList.add(e.f95730d.read(protocol));
                            }
                            protocol.l8();
                            builder.d(arrayList);
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 8) {
                        builder.b(protocol.s8());
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 10) {
                    builder.c(protocol.T1());
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@k i protocol, @k c struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("ExportParam");
            protocol.Q6(CollectReviewActivity.G, 1, (byte) 10);
            protocol.q7(struct.f95713a);
            protocol.N2();
            protocol.Q6("template_id", 2, (byte) 8);
            protocol.l5(struct.f95714b);
            protocol.N2();
            protocol.Q6(xd.a.f98002r, 3, (byte) 15);
            protocol.y2((byte) 12, struct.f95715c.size());
            Iterator<e> it = struct.f95715c.iterator();
            while (it.hasNext()) {
                e.f95730d.write(protocol, it.next());
            }
            protocol.i5();
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public c(long j11, int i11, @k List<e> words) {
        g0.p(words, "words");
        this.f95713a = j11;
        this.f95714b = i11;
        this.f95715c = words;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ c e(c cVar, long j11, int i11, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            j11 = cVar.f95713a;
        }
        if ((i12 & 2) != 0) {
            i11 = cVar.f95714b;
        }
        if ((i12 & 4) != 0) {
            list = cVar.f95715c;
        }
        return cVar.d(j11, i11, list);
    }

    public final long a() {
        return this.f95713a;
    }

    public final int b() {
        return this.f95714b;
    }

    @k
    public final List<e> c() {
        return this.f95715c;
    }

    @k
    public final c d(long j11, int i11, @k List<e> words) {
        g0.p(words, "words");
        return new c(j11, i11, words);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f95713a == cVar.f95713a && this.f95714b == cVar.f95714b && g0.g(this.f95715c, cVar.f95715c);
    }

    public int hashCode() {
        return (((Long.hashCode(this.f95713a) * 31) + Integer.hashCode(this.f95714b)) * 31) + this.f95715c.hashCode();
    }

    @k
    public String toString() {
        return "ExportParam(user_book_id=" + this.f95713a + ", template_id=" + this.f95714b + ", words=" + this.f95715c + ')';
    }

    @Override // ts.e
    public void write(@k i protocol) {
        g0.p(protocol, "protocol");
        f95712e.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nExportParam.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExportParam.kt\ncom/baicizhan/biz/online/user_activity_api/ExportParam$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,157:1\n1#2:158\n*E\n"})
    public static final class a implements ts.f<c> {

        /* renamed from: a, reason: collision with root package name */
        @l
        public Long f95716a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public Integer f95717b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public List<e> f95718c;

        public a() {
            this.f95716a = null;
            this.f95717b = null;
            this.f95718c = null;
        }

        @Override // ts.f
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public c build() {
            Long l11 = this.f95716a;
            if (l11 == null) {
                throw new IllegalStateException("Required field 'user_book_id' is missing");
            }
            long longValue = l11.longValue();
            Integer num = this.f95717b;
            if (num == null) {
                throw new IllegalStateException("Required field 'template_id' is missing");
            }
            int intValue = num.intValue();
            List<e> list = this.f95718c;
            if (list != null) {
                return new c(longValue, intValue, list);
            }
            throw new IllegalStateException("Required field 'words' is missing");
        }

        @k
        public final a b(int i11) {
            this.f95717b = Integer.valueOf(i11);
            return this;
        }

        @k
        public final a c(long j11) {
            this.f95716a = Long.valueOf(j11);
            return this;
        }

        @k
        public final a d(@k List<e> words) {
            g0.p(words, "words");
            this.f95718c = words;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f95716a = null;
            this.f95717b = null;
            this.f95718c = null;
        }

        public a(@k c source) {
            g0.p(source, "source");
            this.f95716a = Long.valueOf(source.f95713a);
            this.f95717b = Integer.valueOf(source.f95714b);
            this.f95718c = source.f95715c;
        }
    }
}

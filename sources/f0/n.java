package f0;

import l60.g1;
import okio.ByteString;
import yz.o1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class n extends l60.w {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final a f50313c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final ByteString f50314d = ByteString.Companion.i("0021F904");

    /* renamed from: e, reason: collision with root package name */
    public static final int f50315e = 4;

    /* renamed from: f, reason: collision with root package name */
    public static final int f50316f = 2;

    /* renamed from: g, reason: collision with root package name */
    public static final int f50317g = 10;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final l60.k f50318b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        public a() {
        }
    }

    public n(@m80.k g1 g1Var) {
        super(g1Var);
        this.f50318b = new l60.k();
    }

    private final long b0(ByteString byteString) {
        long j11 = -1;
        while (true) {
            j11 = this.f50318b.l0(byteString.getByte(0), j11 + 1);
            if (j11 == -1 || (request(byteString.size()) && this.f50318b.J0(j11, byteString))) {
                break;
            }
        }
        return j11;
    }

    private final boolean request(long j11) {
        if (this.f50318b.size() >= j11) {
            return true;
        }
        long size = j11 - this.f50318b.size();
        return super.L3(this.f50318b, size) == size;
    }

    @Override // l60.w, l60.g1
    public long L3(@m80.k l60.k kVar, long j11) {
        request(j11);
        if (this.f50318b.size() == 0) {
            return j11 == 0 ? 0L : -1L;
        }
        long j12 = 0;
        while (true) {
            long b02 = b0(f50314d);
            if (b02 == -1) {
                break;
            }
            j12 += e(kVar, b02 + 4);
            if (request(5L) && this.f50318b.x0(4L) == 0 && (((o1.i(this.f50318b.x0(2L)) & 255) << 8) | (o1.i(this.f50318b.x0(1L)) & 255)) < 2) {
                kVar.writeByte(this.f50318b.x0(0L));
                kVar.writeByte(10);
                kVar.writeByte(0);
                this.f50318b.skip(3L);
            }
        }
        if (j12 < j11) {
            j12 += e(kVar, j11 - j12);
        }
        if (j12 == 0) {
            return -1L;
        }
        return j12;
    }

    public final long e(l60.k kVar, long j11) {
        return g10.u.v(this.f50318b.L3(kVar, j11), 0L);
    }
}

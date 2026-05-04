package kotlin.uuid;

import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@y30.a
/* loaded from: classes8.dex */
public final class c implements Externalizable {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f67804c = new a(null);
    private static final long serialVersionUID = 0;

    /* renamed from: a, reason: collision with root package name */
    public long f67805a;

    /* renamed from: b, reason: collision with root package name */
    public long f67806b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        public a() {
        }
    }

    public c(long j11, long j12) {
        this.f67805a = j11;
        this.f67806b = j12;
    }

    private final Object readResolve() {
        return Uuid.Companion.b(this.f67805a, this.f67806b);
    }

    public final long a() {
        return this.f67806b;
    }

    public final long b() {
        return this.f67805a;
    }

    public final void c(long j11) {
        this.f67806b = j11;
    }

    public final void d(long j11) {
        this.f67805a = j11;
    }

    @Override // java.io.Externalizable
    public void readExternal(@k ObjectInput input) {
        g0.p(input, "input");
        this.f67805a = input.readLong();
        this.f67806b = input.readLong();
    }

    @Override // java.io.Externalizable
    public void writeExternal(@k ObjectOutput output) {
        g0.p(output, "output");
        output.writeLong(this.f67805a);
        output.writeLong(this.f67806b);
    }

    public c() {
        this(0L, 0L);
    }
}

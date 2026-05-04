package kotlin.time;

import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w30.h
/* loaded from: classes8.dex */
public final class i implements Externalizable {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final a f67787c = new a(null);
    private static final long serialVersionUID = 0;

    /* renamed from: a, reason: collision with root package name */
    public long f67788a;

    /* renamed from: b, reason: collision with root package name */
    public int f67789b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        public a() {
        }
    }

    public i(long j11, int i11) {
        this.f67788a = j11;
        this.f67789b = i11;
    }

    private final Object readResolve() {
        return Instant.Companion.b(this.f67788a, this.f67789b);
    }

    public final long a() {
        return this.f67788a;
    }

    public final int b() {
        return this.f67789b;
    }

    public final void c(long j11) {
        this.f67788a = j11;
    }

    public final void d(int i11) {
        this.f67789b = i11;
    }

    @Override // java.io.Externalizable
    public void readExternal(@m80.k ObjectInput input) {
        g0.p(input, "input");
        this.f67788a = input.readLong();
        this.f67789b = input.readInt();
    }

    @Override // java.io.Externalizable
    public void writeExternal(@m80.k ObjectOutput output) {
        g0.p(output, "output");
        output.writeLong(this.f67788a);
        output.writeInt(this.f67789b);
    }

    public i() {
        this(0L, 0);
    }
}

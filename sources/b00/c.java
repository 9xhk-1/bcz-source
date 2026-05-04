package b00;

import a00.k1;
import a00.l1;
import java.io.Externalizable;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Map;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class c implements Externalizable {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f5653b = new a(null);
    private static final long serialVersionUID = 0;

    /* renamed from: a, reason: collision with root package name */
    @k
    public Map<?, ?> f5654a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        public a() {
        }
    }

    public c(@k Map<?, ?> map) {
        g0.p(map, "map");
        this.f5654a = map;
    }

    private final Object readResolve() {
        return this.f5654a;
    }

    @Override // java.io.Externalizable
    public void readExternal(@k ObjectInput input) {
        g0.p(input, "input");
        byte readByte = input.readByte();
        if (readByte != 0) {
            throw new InvalidObjectException("Unsupported flags value: " + ((int) readByte));
        }
        int readInt = input.readInt();
        if (readInt < 0) {
            throw new InvalidObjectException("Illegal size value: " + readInt + '.');
        }
        Map h11 = k1.h(readInt);
        for (int i11 = 0; i11 < readInt; i11++) {
            h11.put(input.readObject(), input.readObject());
        }
        this.f5654a = k1.d(h11);
    }

    @Override // java.io.Externalizable
    public void writeExternal(@k ObjectOutput output) {
        g0.p(output, "output");
        output.writeByte(0);
        output.writeInt(this.f5654a.size());
        for (Map.Entry<?, ?> entry : this.f5654a.entrySet()) {
            output.writeObject(entry.getKey());
            output.writeObject(entry.getValue());
        }
    }

    public c() {
        this(l1.z());
    }
}

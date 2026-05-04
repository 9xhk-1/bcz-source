package pz;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class b extends d<ByteBuffer> {

    /* renamed from: g, reason: collision with root package name */
    public final int f81339g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b() {
        /*
            r3 = this;
            r0 = 3
            r1 = 0
            r2 = 0
            r3.<init>(r2, r2, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pz.b.<init>():void");
    }

    @Override // pz.d
    @k
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public ByteBuffer f() {
        ByteBuffer allocate = ByteBuffer.allocate(this.f81339g);
        g0.m(allocate);
        return allocate;
    }

    @Override // pz.d
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public void q(@k ByteBuffer instance) {
        g0.p(instance, "instance");
        if (instance.capacity() != this.f81339g) {
            throw new IllegalStateException("Check failed.");
        }
        if (instance.isDirect()) {
            throw new IllegalStateException("Check failed.");
        }
    }

    @Override // pz.d
    @k
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public ByteBuffer a(@k ByteBuffer instance) {
        g0.p(instance, "instance");
        instance.clear();
        instance.order(ByteOrder.BIG_ENDIAN);
        return instance;
    }

    public final int w() {
        return this.f81339g;
    }

    public /* synthetic */ b(int i11, int i12, int i13, v vVar) {
        this((i13 & 1) != 0 ? 2000 : i11, (i13 & 2) != 0 ? 4096 : i12);
    }

    public b(int i11, int i12) {
        super(i11);
        this.f81339g = i12;
    }
}

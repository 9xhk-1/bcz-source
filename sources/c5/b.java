package c5;

import b5.c;
import b5.c0;
import b5.c1;
import b5.d;
import b5.e1;
import b5.f2;
import b5.h1;
import b5.i2;
import b5.j;
import b5.k0;
import b5.n1;
import b5.o;
import b5.o0;
import b5.r0;
import b5.u1;
import b5.v;
import b5.w0;
import b5.y1;
import b5.z;
import f50.i;
import h50.f;
import h50.l;
import i50.h;
import k50.x;
import kotlin.NoWhenBranchMatchedException;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class b implements i<c1> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final b f8021a = new b();

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final f f8022b = l.f("PayloadOut", new f[0], null, 4, null);

    @Override // f50.i, f50.b0, f50.e
    @k
    public f a() {
        return f8022b;
    }

    @Override // f50.e
    @m80.l
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public c1 e(@k i50.f decoder) {
        g0.p(decoder, "decoder");
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // f50.b0
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void b(@k h encoder, @m80.l c1 c1Var) {
        g0.p(encoder, "encoder");
        x xVar = (x) encoder;
        if (c1Var == null) {
            xVar.encodeNull();
            return;
        }
        if (c1Var instanceof e1) {
            xVar.encodeNull();
            return;
        }
        if (c1Var instanceof b5.b) {
            xVar.encodeSerializableValue(b5.b.Companion.serializer(), c1Var);
            return;
        }
        if (c1Var instanceof c) {
            xVar.encodeSerializableValue(c.Companion.serializer(), c1Var);
            return;
        }
        if (c1Var instanceof k0) {
            xVar.encodeSerializableValue(k0.Companion.serializer(), c1Var);
            return;
        }
        if (c1Var instanceof w0) {
            xVar.encodeSerializableValue(w0.Companion.serializer(), c1Var);
            return;
        }
        if (c1Var instanceof j) {
            xVar.encodeSerializableValue(j.Companion.serializer(), c1Var);
            return;
        }
        if (c1Var instanceof c0) {
            xVar.encodeSerializableValue(c0.Companion.serializer(), c1Var);
            return;
        }
        if (c1Var instanceof y1) {
            xVar.encodeSerializableValue(y1.Companion.serializer(), c1Var);
            return;
        }
        if (c1Var instanceof b5.h) {
            xVar.encodeSerializableValue(b5.h.Companion.serializer(), c1Var);
            return;
        }
        if (c1Var instanceof o0) {
            xVar.encodeSerializableValue(o0.Companion.serializer(), c1Var);
            return;
        }
        if (c1Var instanceof h1) {
            xVar.encodeSerializableValue(h1.Companion.serializer(), c1Var);
            return;
        }
        if (c1Var instanceof i2) {
            xVar.encodeSerializableValue(i2.Companion.serializer(), c1Var);
            return;
        }
        if (c1Var instanceof f2) {
            xVar.encodeSerializableValue(f2.Companion.serializer(), c1Var);
            return;
        }
        if (c1Var instanceof u1) {
            xVar.encodeSerializableValue(u1.Companion.serializer(), c1Var);
            return;
        }
        if (c1Var instanceof r0) {
            xVar.encodeSerializableValue(r0.Companion.serializer(), c1Var);
            return;
        }
        if (c1Var instanceof b5.g0) {
            xVar.encodeSerializableValue(b5.g0.Companion.serializer(), c1Var);
            return;
        }
        if (c1Var instanceof o) {
            xVar.encodeSerializableValue(o.Companion.serializer(), c1Var);
            return;
        }
        if (c1Var instanceof n1) {
            xVar.encodeSerializableValue(n1.Companion.serializer(), c1Var);
            return;
        }
        if (c1Var instanceof z) {
            xVar.encodeSerializableValue(z.Companion.serializer(), c1Var);
        } else if (c1Var instanceof v) {
            xVar.encodeSerializableValue(v.Companion.serializer(), c1Var);
        } else {
            if (!(c1Var instanceof d)) {
                throw new NoWhenBranchMatchedException();
            }
            xVar.encodeSerializableValue(d.Companion.serializer(), c1Var);
        }
    }
}

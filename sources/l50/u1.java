package l50;

import androidx.exifinterface.media.ExifInterface;
import h50.m;
import kotlin.jvm.internal.Ref;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class u1 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final String f70076a = "primitive";

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ <T extends k50.k> T c(k50.k value, String serialName, x00.a<String> path) {
        kotlin.jvm.internal.g0.p(value, "value");
        kotlin.jvm.internal.g0.p(serialName, "serialName");
        kotlin.jvm.internal.g0.p(path, "path");
        kotlin.jvm.internal.g0.y(3, ExifInterface.GPS_DIRECTION_TRUE);
        if (value != 0) {
            return value;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Expected ");
        kotlin.jvm.internal.g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        sb2.append(kotlin.jvm.internal.o0.d(k50.k.class).C());
        sb2.append(", but had ");
        sb2.append(kotlin.jvm.internal.o0.d(value.getClass()).C());
        sb2.append(" as the serialized body of ");
        sb2.append(serialName);
        sb2.append(" at element: ");
        sb2.append(path.invoke());
        throw i0.f(-1, sb2.toString(), value.toString());
    }

    public static final boolean d(h50.f fVar) {
        return (fVar.getKind() instanceof h50.e) || fVar.getKind() == m.b.f58540a;
    }

    @j0
    @m80.k
    public static final <T> k50.k e(@m80.k k50.a json, T t11, @m80.k f50.b0<? super T> serializer) {
        kotlin.jvm.internal.g0.p(json, "json");
        kotlin.jvm.internal.g0.p(serializer, "serializer");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        new y0(json, new x00.l() { // from class: l50.t1
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 f11;
                f11 = u1.f(Ref.ObjectRef.this, (k50.k) obj);
                return f11;
            }
        }).encodeSerializableValue(serializer, t11);
        T t12 = objectRef.element;
        if (t12 != null) {
            return (k50.k) t12;
        }
        kotlin.jvm.internal.g0.S("result");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final g2 f(Ref.ObjectRef objectRef, k50.k it) {
        kotlin.jvm.internal.g0.p(it, "it");
        objectRef.element = it;
        return g2.f100423a;
    }
}

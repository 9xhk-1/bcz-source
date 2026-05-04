package p10;

import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class y {
    public static final boolean a(@m80.k b bVar) {
        kotlin.jvm.internal.g0.p(bVar, "<this>");
        return bVar.k() == Modality.FINAL && bVar.getKind() != ClassKind.ENUM_CLASS;
    }
}

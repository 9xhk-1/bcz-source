package androidx.compose.ui.semantics;

import a00.i0;
import a00.k1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.ValueElementSequence;
import g10.u;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.l;
import yz.g2;
import yz.h1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSemanticsModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsModifier.kt\nandroidx/compose/ui/semantics/SemanticsModifierKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,205:1\n1179#2,2:206\n1253#2,4:208\n*S KotlinDebug\n*F\n+ 1 SemanticsModifier.kt\nandroidx/compose/ui/semantics/SemanticsModifierKt\n*L\n203#1:206,2\n203#1:208,4\n*E\n"})
/* loaded from: classes2.dex */
public final class SemanticsModifierKt {

    @k
    private static AtomicInteger lastIdentifier = new AtomicInteger(0);

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addSemanticsPropertiesFrom(InspectorInfo inspectorInfo, SemanticsConfiguration semanticsConfiguration) {
        ValueElementSequence properties = inspectorInfo.getProperties();
        LinkedHashMap linkedHashMap = new LinkedHashMap(u.u(k1.j(i0.d0(semanticsConfiguration, 10)), 16));
        for (Map.Entry<? extends SemanticsPropertyKey<?>, ? extends Object> entry : semanticsConfiguration) {
            SemanticsPropertyKey<?> key = entry.getKey();
            Pair a11 = h1.a(key.getName(), entry.getValue());
            linkedHashMap.put(a11.getFirst(), a11.getSecond());
        }
        properties.set("properties", linkedHashMap);
    }

    @k
    public static final Modifier clearAndSetSemantics(@k Modifier modifier, @k l<? super SemanticsPropertyReceiver, g2> lVar) {
        return modifier.then(new ClearAndSetSemanticsElement(lVar));
    }

    public static final int generateSemanticsId() {
        return lastIdentifier.addAndGet(1);
    }

    @k
    public static final Modifier semantics(@k Modifier modifier, boolean z11, @k l<? super SemanticsPropertyReceiver, g2> lVar) {
        return modifier.then(new AppendedSemanticsElement(z11, lVar));
    }

    public static /* synthetic */ Modifier semantics$default(Modifier modifier, boolean z11, l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        return semantics(modifier, z11, lVar);
    }
}

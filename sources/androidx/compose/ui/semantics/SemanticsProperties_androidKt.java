package androidx.compose.ui.semantics;

import h10.n;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.o0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class SemanticsProperties_androidKt {
    static final /* synthetic */ n<Object>[] $$delegatedProperties = {o0.k(new MutablePropertyReference1Impl(SemanticsProperties_androidKt.class, "testTagsAsResourceId", "getTestTagsAsResourceId(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1))};

    static {
        SemanticsPropertiesAndroid.INSTANCE.getTestTagsAsResourceId();
    }

    public static final boolean getTestTagsAsResourceId(@k SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsPropertiesAndroid.INSTANCE.getTestTagsAsResourceId().getValue(semanticsPropertyReceiver, $$delegatedProperties[0]).booleanValue();
    }

    public static final void setTestTagsAsResourceId(@k SemanticsPropertyReceiver semanticsPropertyReceiver, boolean z11) {
        SemanticsPropertiesAndroid.INSTANCE.getTestTagsAsResourceId().setValue(semanticsPropertyReceiver, $$delegatedProperties[0], Boolean.valueOf(z11));
    }

    public static /* synthetic */ void getTestTagsAsResourceId$annotations(SemanticsPropertyReceiver semanticsPropertyReceiver) {
    }
}

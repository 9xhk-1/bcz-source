package androidx.compose.foundation;

import androidx.compose.ui.draw.DrawModifier;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nIndication.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Indication.kt\nandroidx/compose/foundation/IndicationModifier\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,348:1\n1#2:349\n*E\n"})
/* loaded from: classes.dex */
final class IndicationModifier implements DrawModifier {

    @m80.k
    private final IndicationInstance indicationInstance;

    public IndicationModifier(@m80.k IndicationInstance indicationInstance) {
        this.indicationInstance = indicationInstance;
    }

    @Override // androidx.compose.ui.draw.DrawModifier
    public void draw(@m80.k ContentDrawScope contentDrawScope) {
        this.indicationInstance.drawIndication(contentDrawScope);
    }

    @m80.k
    public final IndicationInstance getIndicationInstance() {
        return this.indicationInstance;
    }
}

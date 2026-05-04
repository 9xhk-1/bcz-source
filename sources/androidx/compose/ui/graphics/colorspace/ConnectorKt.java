package androidx.compose.ui.graphics.colorspace;

import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableIntObjectMap;
import androidx.compose.ui.graphics.colorspace.RenderIntent;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nConnector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Connector.kt\nandroidx/compose/ui/graphics/colorspace/ConnectorKt\n*L\n1#1,328:1\n326#1:329\n326#1:330\n326#1:331\n*S KotlinDebug\n*F\n+ 1 Connector.kt\nandroidx/compose/ui/graphics/colorspace/ConnectorKt\n*L\n315#1:329\n317#1:330\n319#1:331\n*E\n"})
/* loaded from: classes.dex */
public final class ConnectorKt {

    @m80.k
    private static final MutableIntObjectMap<Connector> Connectors;

    static {
        ColorSpaces colorSpaces = ColorSpaces.INSTANCE;
        int id$ui_graphics_release = colorSpaces.getSrgb().getId$ui_graphics_release();
        int id$ui_graphics_release2 = colorSpaces.getSrgb().getId$ui_graphics_release();
        RenderIntent.Companion companion = RenderIntent.Companion;
        kotlin.jvm.internal.v vVar = null;
        Connectors = IntObjectMapKt.mutableIntObjectMapOf(id$ui_graphics_release | (id$ui_graphics_release2 << 6) | (companion.m2944getPerceptualuksYyKA() << 12), Connector.Companion.identity$ui_graphics_release(colorSpaces.getSrgb()), colorSpaces.getSrgb().getId$ui_graphics_release() | (colorSpaces.getOklab().getId$ui_graphics_release() << 6) | (companion.m2944getPerceptualuksYyKA() << 12), new Connector(colorSpaces.getSrgb(), colorSpaces.getOklab(), companion.m2944getPerceptualuksYyKA(), vVar), colorSpaces.getOklab().getId$ui_graphics_release() | (colorSpaces.getSrgb().getId$ui_graphics_release() << 6) | (companion.m2944getPerceptualuksYyKA() << 12), new Connector(colorSpaces.getOklab(), colorSpaces.getSrgb(), companion.m2944getPerceptualuksYyKA(), vVar));
    }

    /* renamed from: connectorKey-YBCOT_4, reason: not valid java name */
    public static final int m2935connectorKeyYBCOT_4(int i11, int i12, int i13) {
        return i11 | (i12 << 6) | (i13 << 12);
    }

    @m80.k
    public static final MutableIntObjectMap<Connector> getConnectors() {
        return Connectors;
    }
}

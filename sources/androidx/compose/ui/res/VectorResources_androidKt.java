package androidx.compose.ui.res;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.annotation.DrawableRes;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.compat.AndroidVectorParser;
import androidx.compose.ui.graphics.vector.compat.XmlVectorParser_androidKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.ImageVectorCache;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import org.xmlpull.v1.XmlPullParserException;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nVectorResources.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VectorResources.android.kt\nandroidx/compose/ui/res/VectorResources_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,140:1\n75#2:141\n1247#3,6:142\n1#4:148\n*S KotlinDebug\n*F\n+ 1 VectorResources.android.kt\nandroidx/compose/ui/res/VectorResources_androidKt\n*L\n49#1:141\n53#1:142,6\n*E\n"})
/* loaded from: classes2.dex */
public final class VectorResources_androidKt {
    @k
    public static final ImageVectorCache.ImageVectorEntry loadVectorResourceInner(@l Resources.Theme theme, @k Resources resources, @k XmlResourceParser xmlResourceParser, int i11) throws XmlPullParserException {
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        AndroidVectorParser androidVectorParser = new AndroidVectorParser(xmlResourceParser, 0, 2, null);
        ImageVector.Builder createVectorImageBuilder = XmlVectorParser_androidKt.createVectorImageBuilder(androidVectorParser, resources, theme, asAttributeSet);
        int i12 = 0;
        while (!XmlVectorParser_androidKt.isAtEnd(xmlResourceParser)) {
            i12 = XmlVectorParser_androidKt.parseCurrentVectorNode(androidVectorParser, resources, asAttributeSet, theme, createVectorImageBuilder, i12);
            xmlResourceParser.next();
        }
        return new ImageVectorCache.ImageVectorEntry(createVectorImageBuilder.build(), i11);
    }

    public static /* synthetic */ ImageVectorCache.ImageVectorEntry loadVectorResourceInner$default(Resources.Theme theme, Resources resources, XmlResourceParser xmlResourceParser, int i11, int i12, Object obj) throws XmlPullParserException {
        if ((i12 & 1) != 0) {
            theme = null;
        }
        return loadVectorResourceInner(theme, resources, xmlResourceParser, i11);
    }

    @Composable
    @k
    public static final ImageVector vectorResource(@k ImageVector.Companion companion, @DrawableRes int i11, @l Composer composer, int i12) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(44534090, i12, -1, "androidx.compose.ui.res.vectorResource (VectorResources.android.kt:47)");
        }
        Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        Resources resources = Resources_androidKt.resources(composer, 0);
        Resources.Theme theme = context.getTheme();
        boolean changed = composer.changed(resources) | ((((i12 & 112) ^ 48) > 32 && composer.changed(i11)) || (i12 & 48) == 32) | composer.changed(theme) | composer.changed(resources.getConfiguration());
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = vectorResource(companion, theme, resources, i11);
            composer.updateRememberedValue(rememberedValue);
        }
        ImageVector imageVector = (ImageVector) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return imageVector;
    }

    public static /* synthetic */ ImageVector vectorResource$default(ImageVector.Companion companion, Resources.Theme theme, Resources resources, int i11, int i12, Object obj) throws XmlPullParserException {
        if ((i12 & 1) != 0) {
            theme = null;
        }
        return vectorResource(companion, theme, resources, i11);
    }

    @k
    public static final ImageVector vectorResource(@k ImageVector.Companion companion, @l Resources.Theme theme, @k Resources resources, int i11) throws XmlPullParserException {
        TypedValue typedValue = new TypedValue();
        resources.getValue(i11, typedValue, true);
        XmlResourceParser xml = resources.getXml(i11);
        XmlVectorParser_androidKt.seekToStartTag(xml);
        g2 g2Var = g2.f100423a;
        return loadVectorResourceInner(theme, resources, xml, typedValue.changingConfigurations).getImageVector();
    }
}

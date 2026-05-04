package androidx.navigation;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.annotation.NavigationRes;
import androidx.annotation.RestrictTo;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.navigation.NavArgument;
import androidx.navigation.NavDeepLink;
import androidx.navigation.NavOptions;
import java.io.IOException;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import org.xmlpull.v1.XmlPullParserException;
import u30.f0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nNavInflater.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavInflater.kt\nandroidx/navigation/NavInflater\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n+ 4 Context.kt\nandroidx/core/content/ContextKt\n*L\n1#1,365:1\n1#2:366\n232#3,3:367\n232#3,3:370\n232#3,3:373\n232#3,3:376\n55#4,6:379\n*S KotlinDebug\n*F\n+ 1 NavInflater.kt\nandroidx/navigation/NavInflater\n*L\n110#1:367,3\n128#1:370,3\n144#1:373,3\n261#1:376,3\n295#1:379,6\n*E\n"})
/* loaded from: classes3.dex */
public final class NavInflater {

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @k
    public static final String APPLICATION_ID_PLACEHOLDER = "${applicationId}";

    @k
    private static final String TAG_ACTION = "action";

    @k
    private static final String TAG_ARGUMENT = "argument";

    @k
    private static final String TAG_DEEP_LINK = "deepLink";

    @k
    private static final String TAG_INCLUDE = "include";

    @k
    private final Context context;

    @k
    private final NavigatorProvider navigatorProvider;

    @k
    public static final Companion Companion = new Companion(null);

    @k
    private static final ThreadLocal<TypedValue> sTmpValue = new ThreadLocal<>();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        @k
        public final NavType<?> checkNavType$navigation_runtime_release(@k TypedValue value, @l NavType<?> navType, @k NavType<?> expectedNavType, @l String str, @k String foundType) throws XmlPullParserException {
            g0.p(value, "value");
            g0.p(expectedNavType, "expectedNavType");
            g0.p(foundType, "foundType");
            if (navType == null || navType == expectedNavType) {
                return navType == null ? expectedNavType : navType;
            }
            throw new XmlPullParserException("Type is " + str + " but found " + foundType + ": " + value.data);
        }

        private Companion() {
        }
    }

    public NavInflater(@k Context context, @k NavigatorProvider navigatorProvider) {
        g0.p(context, "context");
        g0.p(navigatorProvider, "navigatorProvider");
        this.context = context;
        this.navigatorProvider = navigatorProvider;
    }

    private final void inflateAction(Resources resources, NavDestination navDestination, AttributeSet attributeSet, XmlResourceParser xmlResourceParser, int i11) throws IOException, XmlPullParserException {
        int depth;
        Context context = this.context;
        int[] NavAction = androidx.navigation.common.R.styleable.NavAction;
        g0.o(NavAction, "NavAction");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, NavAction, 0, 0);
        int resourceId = obtainStyledAttributes.getResourceId(androidx.navigation.common.R.styleable.NavAction_android_id, 0);
        NavAction navAction = new NavAction(obtainStyledAttributes.getResourceId(androidx.navigation.common.R.styleable.NavAction_destination, 0), null, null, 6, null);
        NavOptions.Builder builder = new NavOptions.Builder();
        builder.setLaunchSingleTop(obtainStyledAttributes.getBoolean(androidx.navigation.common.R.styleable.NavAction_launchSingleTop, false));
        builder.setRestoreState(obtainStyledAttributes.getBoolean(androidx.navigation.common.R.styleable.NavAction_restoreState, false));
        builder.setPopUpTo(obtainStyledAttributes.getResourceId(androidx.navigation.common.R.styleable.NavAction_popUpTo, -1), obtainStyledAttributes.getBoolean(androidx.navigation.common.R.styleable.NavAction_popUpToInclusive, false), obtainStyledAttributes.getBoolean(androidx.navigation.common.R.styleable.NavAction_popUpToSaveState, false));
        builder.setEnterAnim(obtainStyledAttributes.getResourceId(androidx.navigation.common.R.styleable.NavAction_enterAnim, -1));
        builder.setExitAnim(obtainStyledAttributes.getResourceId(androidx.navigation.common.R.styleable.NavAction_exitAnim, -1));
        builder.setPopEnterAnim(obtainStyledAttributes.getResourceId(androidx.navigation.common.R.styleable.NavAction_popEnterAnim, -1));
        builder.setPopExitAnim(obtainStyledAttributes.getResourceId(androidx.navigation.common.R.styleable.NavAction_popExitAnim, -1));
        navAction.setNavOptions(builder.build());
        Bundle bundle = new Bundle();
        int depth2 = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 1 || ((depth = xmlResourceParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && g0.g(TAG_ARGUMENT, xmlResourceParser.getName())) {
                inflateArgumentForBundle(resources, bundle, attributeSet, i11);
            }
        }
        if (!bundle.isEmpty()) {
            navAction.setDefaultArguments(bundle);
        }
        navDestination.putAction(resourceId, navAction);
        obtainStyledAttributes.recycle();
    }

    private final NavArgument inflateArgument(TypedArray typedArray, Resources resources, int i11) throws XmlPullParserException {
        NavArgument.Builder builder = new NavArgument.Builder();
        int i12 = 0;
        builder.setIsNullable(typedArray.getBoolean(androidx.navigation.common.R.styleable.NavArgument_nullable, false));
        ThreadLocal<TypedValue> threadLocal = sTmpValue;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        TypedValue typedValue2 = typedValue;
        String string = typedArray.getString(androidx.navigation.common.R.styleable.NavArgument_argType);
        Object obj = null;
        NavType<Object> fromArgType = string != null ? NavType.Companion.fromArgType(string, resources.getResourcePackageName(i11)) : null;
        int i13 = androidx.navigation.common.R.styleable.NavArgument_android_defaultValue;
        if (typedArray.getValue(i13, typedValue2)) {
            NavType<Object> navType = NavType.ReferenceType;
            if (fromArgType == navType) {
                int i14 = typedValue2.resourceId;
                if (i14 != 0) {
                    i12 = i14;
                } else if (typedValue2.type != 16 || typedValue2.data != 0) {
                    throw new XmlPullParserException("unsupported value '" + ((Object) typedValue2.string) + "' for " + fromArgType.getName() + ". Must be a reference to a resource.");
                }
                obj = Integer.valueOf(i12);
            } else {
                int i15 = typedValue2.resourceId;
                if (i15 != 0) {
                    if (fromArgType != null) {
                        throw new XmlPullParserException("unsupported value '" + ((Object) typedValue2.string) + "' for " + fromArgType.getName() + ". You must use a \"" + navType.getName() + "\" type to reference other resources.");
                    }
                    fromArgType = navType;
                    obj = Integer.valueOf(i15);
                } else if (fromArgType == NavType.StringType) {
                    obj = typedArray.getString(i13);
                } else {
                    int i16 = typedValue2.type;
                    if (i16 == 3) {
                        String obj2 = typedValue2.string.toString();
                        if (fromArgType == null) {
                            fromArgType = NavType.Companion.inferFromValue(obj2);
                        }
                        obj = fromArgType.parseValue(obj2);
                    } else if (i16 == 4) {
                        fromArgType = Companion.checkNavType$navigation_runtime_release(typedValue2, fromArgType, NavType.FloatType, string, TypedValues.Custom.S_FLOAT);
                        obj = Float.valueOf(typedValue2.getFloat());
                    } else if (i16 == 5) {
                        fromArgType = Companion.checkNavType$navigation_runtime_release(typedValue2, fromArgType, NavType.IntType, string, TypedValues.Custom.S_DIMENSION);
                        obj = Integer.valueOf((int) typedValue2.getDimension(resources.getDisplayMetrics()));
                    } else if (i16 == 18) {
                        fromArgType = Companion.checkNavType$navigation_runtime_release(typedValue2, fromArgType, NavType.BoolType, string, TypedValues.Custom.S_BOOLEAN);
                        obj = Boolean.valueOf(typedValue2.data != 0);
                    } else {
                        if (i16 < 16 || i16 > 31) {
                            throw new XmlPullParserException("unsupported argument type " + typedValue2.type);
                        }
                        NavType<Object> navType2 = NavType.FloatType;
                        if (fromArgType == navType2) {
                            fromArgType = Companion.checkNavType$navigation_runtime_release(typedValue2, fromArgType, navType2, string, TypedValues.Custom.S_FLOAT);
                            obj = Float.valueOf(typedValue2.data);
                        } else {
                            fromArgType = Companion.checkNavType$navigation_runtime_release(typedValue2, fromArgType, NavType.IntType, string, TypedValues.Custom.S_INT);
                            obj = Integer.valueOf(typedValue2.data);
                        }
                    }
                }
            }
        }
        if (obj != null) {
            builder.setDefaultValue(obj);
        }
        if (fromArgType != null) {
            builder.setType(fromArgType);
        }
        return builder.build();
    }

    private final void inflateArgumentForBundle(Resources resources, Bundle bundle, AttributeSet attributeSet, int i11) throws XmlPullParserException {
        TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, androidx.navigation.common.R.styleable.NavArgument);
        g0.o(obtainAttributes, "res.obtainAttributes(att… R.styleable.NavArgument)");
        String string = obtainAttributes.getString(androidx.navigation.common.R.styleable.NavArgument_android_name);
        if (string == null) {
            throw new XmlPullParserException("Arguments must have a name");
        }
        g0.o(string, "array.getString(R.stylea…uments must have a name\")");
        NavArgument inflateArgument = inflateArgument(obtainAttributes, resources, i11);
        if (inflateArgument.isDefaultValuePresent()) {
            inflateArgument.putDefaultValue(string, bundle);
        }
        g2 g2Var = g2.f100423a;
        obtainAttributes.recycle();
    }

    private final void inflateArgumentForDestination(Resources resources, NavDestination navDestination, AttributeSet attributeSet, int i11) throws XmlPullParserException {
        TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, androidx.navigation.common.R.styleable.NavArgument);
        g0.o(obtainAttributes, "res.obtainAttributes(att… R.styleable.NavArgument)");
        String string = obtainAttributes.getString(androidx.navigation.common.R.styleable.NavArgument_android_name);
        if (string == null) {
            throw new XmlPullParserException("Arguments must have a name");
        }
        g0.o(string, "array.getString(R.stylea…uments must have a name\")");
        navDestination.addArgument(string, inflateArgument(obtainAttributes, resources, i11));
        g2 g2Var = g2.f100423a;
        obtainAttributes.recycle();
    }

    private final void inflateDeepLink(Resources resources, NavDestination navDestination, AttributeSet attributeSet) throws XmlPullParserException {
        TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, androidx.navigation.common.R.styleable.NavDeepLink);
        g0.o(obtainAttributes, "res.obtainAttributes(att… R.styleable.NavDeepLink)");
        String string = obtainAttributes.getString(androidx.navigation.common.R.styleable.NavDeepLink_uri);
        String string2 = obtainAttributes.getString(androidx.navigation.common.R.styleable.NavDeepLink_action);
        String string3 = obtainAttributes.getString(androidx.navigation.common.R.styleable.NavDeepLink_mimeType);
        if ((string == null || string.length() == 0) && ((string2 == null || string2.length() == 0) && (string3 == null || string3.length() == 0))) {
            throw new XmlPullParserException("Every <deepLink> must include at least one of app:uri, app:action, or app:mimeType");
        }
        NavDeepLink.Builder builder = new NavDeepLink.Builder();
        if (string != null) {
            String packageName = this.context.getPackageName();
            g0.o(packageName, "context.packageName");
            builder.setUriPattern(f0.z2(string, APPLICATION_ID_PLACEHOLDER, packageName, false, 4, null));
        }
        if (string2 != null && string2.length() != 0) {
            String packageName2 = this.context.getPackageName();
            g0.o(packageName2, "context.packageName");
            builder.setAction(f0.z2(string2, APPLICATION_ID_PLACEHOLDER, packageName2, false, 4, null));
        }
        if (string3 != null) {
            String packageName3 = this.context.getPackageName();
            g0.o(packageName3, "context.packageName");
            builder.setMimeType(f0.z2(string3, APPLICATION_ID_PLACEHOLDER, packageName3, false, 4, null));
        }
        navDestination.addDeepLink(builder.build());
        g2 g2Var = g2.f100423a;
        obtainAttributes.recycle();
    }

    @SuppressLint({"ResourceType"})
    @k
    public final NavGraph inflate(@NavigationRes int i11) {
        int next;
        Resources res = this.context.getResources();
        XmlResourceParser xml = res.getXml(i11);
        g0.o(xml, "res.getXml(graphResId)");
        AttributeSet attrs = Xml.asAttributeSet(xml);
        do {
            try {
                try {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } catch (Exception e11) {
                    throw new RuntimeException("Exception inflating " + res.getResourceName(i11) + " line " + xml.getLineNumber(), e11);
                }
            } finally {
                xml.close();
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        g0.o(res, "res");
        g0.o(attrs, "attrs");
        NavDestination inflate = inflate(res, xml, attrs, i11);
        if (inflate instanceof NavGraph) {
            return (NavGraph) inflate;
        }
        throw new IllegalArgumentException(("Root element <" + name + "> did not inflate into a NavGraph").toString());
    }

    private final NavDestination inflate(Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, int i11) throws XmlPullParserException, IOException {
        int depth;
        NavigatorProvider navigatorProvider = this.navigatorProvider;
        String name = xmlResourceParser.getName();
        g0.o(name, "parser.name");
        NavDestination createDestination = navigatorProvider.getNavigator(name).createDestination();
        createDestination.onInflate(this.context, attributeSet);
        int depth2 = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 1 || ((depth = xmlResourceParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2) {
                String name2 = xmlResourceParser.getName();
                if (g0.g(TAG_ARGUMENT, name2)) {
                    inflateArgumentForDestination(resources, createDestination, attributeSet, i11);
                } else if (g0.g(TAG_DEEP_LINK, name2)) {
                    inflateDeepLink(resources, createDestination, attributeSet);
                } else if (g0.g("action", name2)) {
                    inflateAction(resources, createDestination, attributeSet, xmlResourceParser, i11);
                } else {
                    Resources resources2 = resources;
                    XmlResourceParser xmlResourceParser2 = xmlResourceParser;
                    AttributeSet attributeSet2 = attributeSet;
                    int i12 = i11;
                    if (g0.g(TAG_INCLUDE, name2) && (createDestination instanceof NavGraph)) {
                        TypedArray obtainAttributes = resources2.obtainAttributes(attributeSet2, R.styleable.NavInclude);
                        g0.o(obtainAttributes, "res.obtainAttributes(att…n.R.styleable.NavInclude)");
                        ((NavGraph) createDestination).addDestination(inflate(obtainAttributes.getResourceId(R.styleable.NavInclude_graph, 0)));
                        g2 g2Var = g2.f100423a;
                        obtainAttributes.recycle();
                    } else if (createDestination instanceof NavGraph) {
                        ((NavGraph) createDestination).addDestination(inflate(resources2, xmlResourceParser2, attributeSet2, i12));
                    }
                    resources = resources2;
                    attributeSet = attributeSet2;
                    xmlResourceParser = xmlResourceParser2;
                    i11 = i12;
                }
            }
        }
        return createDestination;
    }
}

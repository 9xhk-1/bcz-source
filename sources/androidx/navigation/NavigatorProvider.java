package androidx.navigation;

import a00.l1;
import android.annotation.SuppressLint;
import androidx.annotation.CallSuper;
import androidx.annotation.RestrictTo;
import androidx.navigation.Navigator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import w00.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@SuppressLint({"TypeParameterUnusedInFormals"})
@u0({"SMAP\nNavigatorProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigatorProvider.kt\nandroidx/navigation/NavigatorProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,178:1\n1#2:179\n*E\n"})
/* loaded from: classes3.dex */
public class NavigatorProvider {

    @k
    public static final Companion Companion = new Companion(null);

    @k
    private static final Map<Class<?>, String> annotationNames = new LinkedHashMap();

    @k
    private final Map<String, Navigator<? extends NavDestination>> _navigators = new LinkedHashMap();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        @o
        @k
        public final String getNameForNavigator$navigation_common_release(@k Class<? extends Navigator<?>> navigatorClass) {
            g0.p(navigatorClass, "navigatorClass");
            String str = (String) NavigatorProvider.annotationNames.get(navigatorClass);
            if (str == null) {
                Navigator.Name name = (Navigator.Name) navigatorClass.getAnnotation(Navigator.Name.class);
                str = name != null ? name.value() : null;
                if (!validateName$navigation_common_release(str)) {
                    throw new IllegalArgumentException(("No @Navigator.Name annotation found for " + navigatorClass.getSimpleName()).toString());
                }
                NavigatorProvider.annotationNames.put(navigatorClass, str);
            }
            g0.m(str);
            return str;
        }

        public final boolean validateName$navigation_common_release(@l String str) {
            return str != null && str.length() > 0;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l
    public final Navigator<? extends NavDestination> addNavigator(@k Navigator<? extends NavDestination> navigator) {
        g0.p(navigator, "navigator");
        return addNavigator(Companion.getNameForNavigator$navigation_common_release(navigator.getClass()), navigator);
    }

    @k
    public final <T extends Navigator<?>> T getNavigator(@k Class<T> navigatorClass) {
        g0.p(navigatorClass, "navigatorClass");
        return (T) getNavigator(Companion.getNameForNavigator$navigation_common_release(navigatorClass));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @k
    public final Map<String, Navigator<? extends NavDestination>> getNavigators() {
        return l1.D0(this._navigators);
    }

    @l
    @CallSuper
    public Navigator<? extends NavDestination> addNavigator(@k String name, @k Navigator<? extends NavDestination> navigator) {
        g0.p(name, "name");
        g0.p(navigator, "navigator");
        if (!Companion.validateName$navigation_common_release(name)) {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
        Navigator<? extends NavDestination> navigator2 = this._navigators.get(name);
        if (g0.g(navigator2, navigator)) {
            return navigator;
        }
        boolean z11 = false;
        if (navigator2 != null && navigator2.isAttached()) {
            z11 = true;
        }
        if (z11) {
            throw new IllegalStateException(("Navigator " + navigator + " is replacing an already attached " + navigator2).toString());
        }
        if (!navigator.isAttached()) {
            return this._navigators.put(name, navigator);
        }
        throw new IllegalStateException(("Navigator " + navigator + " is already attached to another NavController").toString());
    }

    @CallSuper
    @k
    public <T extends Navigator<?>> T getNavigator(@k String name) {
        g0.p(name, "name");
        if (Companion.validateName$navigation_common_release(name)) {
            Navigator<? extends NavDestination> navigator = this._navigators.get(name);
            if (navigator != null) {
                return navigator;
            }
            throw new IllegalStateException("Could not find Navigator with name \"" + name + "\". You must call NavController.addNavigator() for each navigation type.");
        }
        throw new IllegalArgumentException("navigator name cannot be an empty string");
    }
}

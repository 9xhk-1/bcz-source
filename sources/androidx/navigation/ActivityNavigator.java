package androidx.navigation;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import androidx.annotation.CallSuper;
import androidx.annotation.RestrictTo;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.content.ContextCompat;
import androidx.navigation.NavDestination;
import androidx.navigation.Navigator;
import g10.u;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import q30.x;
import u30.f0;
import w00.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Navigator.Name("activity")
@u0({"SMAP\nActivityNavigator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityNavigator.kt\nandroidx/navigation/ActivityNavigator\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,501:1\n179#2,2:502\n*S KotlinDebug\n*F\n+ 1 ActivityNavigator.kt\nandroidx/navigation/ActivityNavigator\n*L\n45#1:502,2\n*E\n"})
/* loaded from: classes3.dex */
public class ActivityNavigator extends Navigator<Destination> {

    @k
    public static final Companion Companion = new Companion(null);

    @k
    private static final String EXTRA_NAV_CURRENT = "android-support-navigation:ActivityNavigator:current";

    @k
    private static final String EXTRA_NAV_SOURCE = "android-support-navigation:ActivityNavigator:source";

    @k
    private static final String EXTRA_POP_ENTER_ANIM = "android-support-navigation:ActivityNavigator:popEnterAnim";

    @k
    private static final String EXTRA_POP_EXIT_ANIM = "android-support-navigation:ActivityNavigator:popExitAnim";

    @k
    private static final String LOG_TAG = "ActivityNavigator";

    @k
    private final Context context;

    @l
    private final Activity hostActivity;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        @o
        public final void applyPopAnimationsToPendingTransition(@k Activity activity) {
            g0.p(activity, "activity");
            Intent intent = activity.getIntent();
            if (intent == null) {
                return;
            }
            int intExtra = intent.getIntExtra(ActivityNavigator.EXTRA_POP_ENTER_ANIM, -1);
            int intExtra2 = intent.getIntExtra(ActivityNavigator.EXTRA_POP_EXIT_ANIM, -1);
            if (intExtra == -1 && intExtra2 == -1) {
                return;
            }
            if (intExtra == -1) {
                intExtra = 0;
            }
            if (intExtra2 == -1) {
                intExtra2 = 0;
            }
            activity.overridePendingTransition(intExtra, intExtra2);
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @NavDestination.ClassType(Activity.class)
    @u0({"SMAP\nActivityNavigator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityNavigator.kt\nandroidx/navigation/ActivityNavigator$Destination\n+ 2 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n*L\n1#1,501:1\n232#2,3:502\n*S KotlinDebug\n*F\n+ 1 ActivityNavigator.kt\nandroidx/navigation/ActivityNavigator$Destination\n*L\n258#1:502,3\n*E\n"})
    public static class Destination extends NavDestination {

        @l
        private String action;

        @l
        private ComponentName component;

        @l
        private Uri data;

        @l
        private String dataPattern;

        @l
        private Intent intent;

        @l
        private String targetPackage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Destination(@k Navigator<? extends Destination> activityNavigator) {
            super(activityNavigator);
            g0.p(activityNavigator, "activityNavigator");
        }

        private final String parseApplicationId(Context context, String str) {
            if (str == null) {
                return null;
            }
            String packageName = context.getPackageName();
            g0.o(packageName, "context.packageName");
            return f0.z2(str, NavInflater.APPLICATION_ID_PLACEHOLDER, packageName, false, 4, null);
        }

        @Override // androidx.navigation.NavDestination
        public boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof Destination) && super.equals(obj)) {
                Intent intent = this.intent;
                if ((intent != null ? intent.filterEquals(((Destination) obj).intent) : ((Destination) obj).intent == null) && g0.g(this.dataPattern, ((Destination) obj).dataPattern)) {
                    return true;
                }
            }
            return false;
        }

        @l
        public final String getAction() {
            Intent intent = this.intent;
            if (intent != null) {
                return intent.getAction();
            }
            return null;
        }

        @l
        public final ComponentName getComponent() {
            Intent intent = this.intent;
            if (intent != null) {
                return intent.getComponent();
            }
            return null;
        }

        @l
        public final Uri getData() {
            Intent intent = this.intent;
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }

        @l
        public final String getDataPattern() {
            return this.dataPattern;
        }

        @l
        public final Intent getIntent() {
            return this.intent;
        }

        @l
        public final String getTargetPackage() {
            Intent intent = this.intent;
            if (intent != null) {
                return intent.getPackage();
            }
            return null;
        }

        @Override // androidx.navigation.NavDestination
        public int hashCode() {
            int hashCode = super.hashCode() * 31;
            Intent intent = this.intent;
            int filterHashCode = (hashCode + (intent != null ? intent.filterHashCode() : 0)) * 31;
            String str = this.dataPattern;
            return filterHashCode + (str != null ? str.hashCode() : 0);
        }

        @Override // androidx.navigation.NavDestination
        @CallSuper
        public void onInflate(@k Context context, @k AttributeSet attrs) {
            g0.p(context, "context");
            g0.p(attrs, "attrs");
            super.onInflate(context, attrs);
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attrs, R.styleable.ActivityNavigator);
            g0.o(obtainAttributes, "context.resources.obtain…leable.ActivityNavigator)");
            setTargetPackage(parseApplicationId(context, obtainAttributes.getString(R.styleable.ActivityNavigator_targetPackage)));
            String string = obtainAttributes.getString(R.styleable.ActivityNavigator_android_name);
            if (string != null) {
                if (string.charAt(0) == '.') {
                    string = context.getPackageName() + string;
                }
                setComponentName(new ComponentName(context, string));
            }
            setAction(obtainAttributes.getString(R.styleable.ActivityNavigator_action));
            String parseApplicationId = parseApplicationId(context, obtainAttributes.getString(R.styleable.ActivityNavigator_data));
            if (parseApplicationId != null) {
                setData(Uri.parse(parseApplicationId));
            }
            setDataPattern(parseApplicationId(context, obtainAttributes.getString(R.styleable.ActivityNavigator_dataPattern)));
            obtainAttributes.recycle();
        }

        @k
        public final Destination setAction(@l String str) {
            if (this.intent == null) {
                this.intent = new Intent();
            }
            Intent intent = this.intent;
            g0.m(intent);
            intent.setAction(str);
            return this;
        }

        @k
        public final Destination setComponentName(@l ComponentName componentName) {
            if (this.intent == null) {
                this.intent = new Intent();
            }
            Intent intent = this.intent;
            g0.m(intent);
            intent.setComponent(componentName);
            return this;
        }

        @k
        public final Destination setData(@l Uri uri) {
            if (this.intent == null) {
                this.intent = new Intent();
            }
            Intent intent = this.intent;
            g0.m(intent);
            intent.setData(uri);
            return this;
        }

        @k
        public final Destination setDataPattern(@l String str) {
            this.dataPattern = str;
            return this;
        }

        @k
        public final Destination setIntent(@l Intent intent) {
            this.intent = intent;
            return this;
        }

        @k
        public final Destination setTargetPackage(@l String str) {
            if (this.intent == null) {
                this.intent = new Intent();
            }
            Intent intent = this.intent;
            g0.m(intent);
            intent.setPackage(str);
            return this;
        }

        @Override // androidx.navigation.NavDestination
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public boolean supportsActions() {
            return false;
        }

        @Override // androidx.navigation.NavDestination
        @k
        public String toString() {
            ComponentName component = getComponent();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(super.toString());
            if (component != null) {
                sb2.append(" class=");
                sb2.append(component.getClassName());
            } else {
                String action = getAction();
                if (action != null) {
                    sb2.append(" action=");
                    sb2.append(action);
                }
            }
            String sb3 = sb2.toString();
            g0.o(sb3, "sb.toString()");
            return sb3;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Destination(@k NavigatorProvider navigatorProvider) {
            this((Navigator<? extends Destination>) navigatorProvider.getNavigator(ActivityNavigator.class));
            g0.p(navigatorProvider, "navigatorProvider");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Extras implements Navigator.Extras {

        @l
        private final ActivityOptionsCompat activityOptions;
        private final int flags;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class Builder {

            @l
            private ActivityOptionsCompat activityOptions;
            private int flags;

            @k
            public final Builder addFlags(int i11) {
                this.flags = i11 | this.flags;
                return this;
            }

            @k
            public final Extras build() {
                return new Extras(this.flags, this.activityOptions);
            }

            @k
            public final Builder setActivityOptions(@k ActivityOptionsCompat activityOptions) {
                g0.p(activityOptions, "activityOptions");
                this.activityOptions = activityOptions;
                return this;
            }
        }

        public Extras(int i11, @l ActivityOptionsCompat activityOptionsCompat) {
            this.flags = i11;
            this.activityOptions = activityOptionsCompat;
        }

        @l
        public final ActivityOptionsCompat getActivityOptions() {
            return this.activityOptions;
        }

        public final int getFlags() {
            return this.flags;
        }
    }

    public ActivityNavigator(@k Context context) {
        Object obj;
        g0.p(context, "context");
        this.context = context;
        Iterator it = x.t(context, new x00.l<Context, Context>() { // from class: androidx.navigation.ActivityNavigator$hostActivity$1
            @Override // x00.l
            public final Context invoke(Context it2) {
                g0.p(it2, "it");
                if (it2 instanceof ContextWrapper) {
                    return ((ContextWrapper) it2).getBaseContext();
                }
                return null;
            }
        }).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((Context) obj) instanceof Activity) {
                    break;
                }
            }
        }
        this.hostActivity = (Activity) obj;
    }

    @o
    public static final void applyPopAnimationsToPendingTransition(@k Activity activity) {
        Companion.applyPopAnimationsToPendingTransition(activity);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @k
    public final Context getContext() {
        return this.context;
    }

    @Override // androidx.navigation.Navigator
    public boolean popBackStack() {
        Activity activity = this.hostActivity;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.navigation.Navigator
    @k
    public Destination createDestination() {
        return new Destination(this);
    }

    @Override // androidx.navigation.Navigator
    @l
    public NavDestination navigate(@k Destination destination, @l Bundle bundle, @l NavOptions navOptions, @l Navigator.Extras extras) {
        Intent intent;
        int intExtra;
        String encode;
        g0.p(destination, "destination");
        if (destination.getIntent() == null) {
            throw new IllegalStateException(("Destination " + destination.getId() + " does not have an Intent set.").toString());
        }
        Intent intent2 = new Intent(destination.getIntent());
        if (bundle != null) {
            intent2.putExtras(bundle);
            String dataPattern = destination.getDataPattern();
            if (dataPattern != null && dataPattern.length() != 0) {
                StringBuffer stringBuffer = new StringBuffer();
                Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(dataPattern);
                while (matcher.find()) {
                    String group = matcher.group(1);
                    if (!bundle.containsKey(group)) {
                        throw new IllegalArgumentException(("Could not find " + group + " in " + bundle + " to fill data pattern " + dataPattern).toString());
                    }
                    matcher.appendReplacement(stringBuffer, "");
                    Map<String, NavArgument> arguments = destination.getArguments();
                    g0.m(group);
                    NavArgument navArgument = arguments.get(group);
                    NavType<Object> type = navArgument != null ? navArgument.getType() : null;
                    if (type == null || (encode = type.serializeAsValue(type.get(bundle, group))) == null) {
                        encode = Uri.encode(String.valueOf(bundle.get(group)));
                    }
                    stringBuffer.append(encode);
                }
                matcher.appendTail(stringBuffer);
                intent2.setData(Uri.parse(stringBuffer.toString()));
            }
        }
        boolean z11 = extras instanceof Extras;
        if (z11) {
            intent2.addFlags(((Extras) extras).getFlags());
        }
        if (this.hostActivity == null) {
            intent2.addFlags(268435456);
        }
        if (navOptions != null && navOptions.shouldLaunchSingleTop()) {
            intent2.addFlags(536870912);
        }
        Activity activity = this.hostActivity;
        if (activity != null && (intent = activity.getIntent()) != null && (intExtra = intent.getIntExtra(EXTRA_NAV_CURRENT, 0)) != 0) {
            intent2.putExtra(EXTRA_NAV_SOURCE, intExtra);
        }
        intent2.putExtra(EXTRA_NAV_CURRENT, destination.getId());
        Resources resources = this.context.getResources();
        if (navOptions != null) {
            int popEnterAnim = navOptions.getPopEnterAnim();
            int popExitAnim = navOptions.getPopExitAnim();
            if ((popEnterAnim <= 0 || !g0.g(resources.getResourceTypeName(popEnterAnim), "animator")) && (popExitAnim <= 0 || !g0.g(resources.getResourceTypeName(popExitAnim), "animator"))) {
                intent2.putExtra(EXTRA_POP_ENTER_ANIM, popEnterAnim);
                intent2.putExtra(EXTRA_POP_EXIT_ANIM, popExitAnim);
            } else {
                Log.w(LOG_TAG, "Activity destinations do not support Animator resource. Ignoring popEnter resource " + resources.getResourceName(popEnterAnim) + " and popExit resource " + resources.getResourceName(popExitAnim) + " when launching " + destination);
            }
        }
        if (z11) {
            ActivityOptionsCompat activityOptions = ((Extras) extras).getActivityOptions();
            if (activityOptions != null) {
                ContextCompat.startActivity(this.context, intent2, activityOptions.toBundle());
            } else {
                this.context.startActivity(intent2);
            }
        } else {
            this.context.startActivity(intent2);
        }
        if (navOptions != null && this.hostActivity != null) {
            int enterAnim = navOptions.getEnterAnim();
            int exitAnim = navOptions.getExitAnim();
            if ((enterAnim > 0 && g0.g(resources.getResourceTypeName(enterAnim), "animator")) || (exitAnim > 0 && g0.g(resources.getResourceTypeName(exitAnim), "animator"))) {
                Log.w(LOG_TAG, "Activity destinations do not support Animator resource. Ignoring enter resource " + resources.getResourceName(enterAnim) + " and exit resource " + resources.getResourceName(exitAnim) + "when launching " + destination);
            } else if (enterAnim >= 0 || exitAnim >= 0) {
                this.hostActivity.overridePendingTransition(u.u(enterAnim, 0), u.u(exitAnim, 0));
            }
        }
        return null;
    }
}

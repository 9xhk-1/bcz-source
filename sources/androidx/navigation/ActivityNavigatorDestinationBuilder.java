package androidx.navigation;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import androidx.annotation.IdRes;
import androidx.navigation.ActivityNavigator;
import h10.d;
import h10.r;
import java.util.Map;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import yz.n;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@NavDestinationDsl
/* loaded from: classes3.dex */
public final class ActivityNavigatorDestinationBuilder extends NavDestinationBuilder<ActivityNavigator.Destination> {

    @l
    private String action;

    @l
    private d<? extends Activity> activityClass;

    @k
    private Context context;

    @l
    private Uri data;

    @l
    private String dataPattern;

    @l
    private String targetPackage;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @n(message = "Use routes to create your ActivityNavigatorDestinationBuilder instead", replaceWith = @w0(expression = "ActivityNavigatorDestinationBuilder(navigator, route = id.toString())", imports = {}))
    public ActivityNavigatorDestinationBuilder(@k ActivityNavigator navigator, @IdRes int i11) {
        super(navigator, i11);
        g0.p(navigator, "navigator");
        this.context = navigator.getContext();
    }

    @l
    public final String getAction() {
        return this.action;
    }

    @l
    public final d<? extends Activity> getActivityClass() {
        return this.activityClass;
    }

    @l
    public final Uri getData() {
        return this.data;
    }

    @l
    public final String getDataPattern() {
        return this.dataPattern;
    }

    @l
    public final String getTargetPackage() {
        return this.targetPackage;
    }

    public final void setAction(@l String str) {
        this.action = str;
    }

    public final void setActivityClass(@l d<? extends Activity> dVar) {
        this.activityClass = dVar;
    }

    public final void setData(@l Uri uri) {
        this.data = uri;
    }

    public final void setDataPattern(@l String str) {
        this.dataPattern = str;
    }

    public final void setTargetPackage(@l String str) {
        this.targetPackage = str;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.navigation.NavDestinationBuilder
    @k
    public ActivityNavigator.Destination build() {
        ActivityNavigator.Destination destination = (ActivityNavigator.Destination) super.build();
        destination.setTargetPackage(this.targetPackage);
        d<? extends Activity> dVar = this.activityClass;
        if (dVar != null) {
            destination.setComponentName(new ComponentName(this.context, (Class<?>) w00.b.d(dVar)));
        }
        destination.setAction(this.action);
        destination.setData(this.data);
        destination.setDataPattern(this.dataPattern);
        return destination;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityNavigatorDestinationBuilder(@k ActivityNavigator navigator, @k String route) {
        super(navigator, route);
        g0.p(navigator, "navigator");
        g0.p(route, "route");
        this.context = navigator.getContext();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityNavigatorDestinationBuilder(@k ActivityNavigator navigator, @k d<? extends Object> route, @k Map<r, NavType<?>> typeMap) {
        super(navigator, route, typeMap);
        g0.p(navigator, "navigator");
        g0.p(route, "route");
        g0.p(typeMap, "typeMap");
        this.context = navigator.getContext();
    }
}

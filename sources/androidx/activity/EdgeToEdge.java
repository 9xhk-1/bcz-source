package androidx.activity;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.activity.SystemBarStyle;
import androidx.annotation.VisibleForTesting;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w00.j(name = "EdgeToEdge")
@u0({"SMAP\nEdgeToEdge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EdgeToEdge.kt\nandroidx/activity/EdgeToEdge\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,343:1\n1#2:344\n*E\n"})
/* loaded from: classes.dex */
public final class EdgeToEdge {

    @m80.l
    private static EdgeToEdgeImpl Impl;
    private static final int DefaultLightScrim = Color.argb(com.jiongji.andriod.card.R.styleable.Theme_drawable_tab_friends, 255, 255, 255);
    private static final int DefaultDarkScrim = Color.argb(128, 27, 27, 27);

    @w00.j(name = k3.u0.f65628b)
    @w00.k
    public static final void enable(@m80.k ComponentActivity componentActivity) {
        g0.p(componentActivity, "<this>");
        enable$default(componentActivity, null, null, 3, null);
    }

    public static /* synthetic */ void enable$default(ComponentActivity componentActivity, SystemBarStyle systemBarStyle, SystemBarStyle systemBarStyle2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            systemBarStyle = SystemBarStyle.Companion.auto$default(SystemBarStyle.Companion, 0, 0, null, 4, null);
        }
        if ((i11 & 2) != 0) {
            systemBarStyle2 = SystemBarStyle.Companion.auto$default(SystemBarStyle.Companion, DefaultLightScrim, DefaultDarkScrim, null, 4, null);
        }
        enable(componentActivity, systemBarStyle, systemBarStyle2);
    }

    public static final int getDefaultDarkScrim() {
        return DefaultDarkScrim;
    }

    public static final int getDefaultLightScrim() {
        return DefaultLightScrim;
    }

    @w00.j(name = k3.u0.f65628b)
    @w00.k
    public static final void enable(@m80.k ComponentActivity componentActivity, @m80.k SystemBarStyle statusBarStyle) {
        g0.p(componentActivity, "<this>");
        g0.p(statusBarStyle, "statusBarStyle");
        enable$default(componentActivity, statusBarStyle, null, 2, null);
    }

    @w00.j(name = k3.u0.f65628b)
    @w00.k
    public static final void enable(@m80.k ComponentActivity componentActivity, @m80.k SystemBarStyle statusBarStyle, @m80.k SystemBarStyle navigationBarStyle) {
        g0.p(componentActivity, "<this>");
        g0.p(statusBarStyle, "statusBarStyle");
        g0.p(navigationBarStyle, "navigationBarStyle");
        View decorView = componentActivity.getWindow().getDecorView();
        g0.o(decorView, "window.decorView");
        x00.l<Resources, Boolean> detectDarkMode$activity_release = statusBarStyle.getDetectDarkMode$activity_release();
        Resources resources = decorView.getResources();
        g0.o(resources, "view.resources");
        boolean booleanValue = detectDarkMode$activity_release.invoke(resources).booleanValue();
        x00.l<Resources, Boolean> detectDarkMode$activity_release2 = navigationBarStyle.getDetectDarkMode$activity_release();
        Resources resources2 = decorView.getResources();
        g0.o(resources2, "view.resources");
        boolean booleanValue2 = detectDarkMode$activity_release2.invoke(resources2).booleanValue();
        EdgeToEdgeImpl edgeToEdgeImpl = Impl;
        if (edgeToEdgeImpl == null) {
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 30) {
                edgeToEdgeImpl = new EdgeToEdgeApi30();
            } else if (i11 >= 29) {
                edgeToEdgeImpl = new EdgeToEdgeApi29();
            } else if (i11 >= 28) {
                edgeToEdgeImpl = new EdgeToEdgeApi28();
            } else if (i11 >= 26) {
                edgeToEdgeImpl = new EdgeToEdgeApi26();
            } else {
                edgeToEdgeImpl = new EdgeToEdgeApi23();
            }
        }
        EdgeToEdgeImpl edgeToEdgeImpl2 = edgeToEdgeImpl;
        Window window = componentActivity.getWindow();
        g0.o(window, "window");
        edgeToEdgeImpl2.setUp(statusBarStyle, navigationBarStyle, window, decorView, booleanValue, booleanValue2);
        Window window2 = componentActivity.getWindow();
        g0.o(window2, "window");
        edgeToEdgeImpl2.adjustLayoutInDisplayCutoutMode(window2);
    }

    @VisibleForTesting
    public static /* synthetic */ void getDefaultDarkScrim$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getDefaultLightScrim$annotations() {
    }
}

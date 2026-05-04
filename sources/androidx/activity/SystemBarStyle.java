package androidx.activity;

import android.content.res.Resources;
import androidx.annotation.ColorInt;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class SystemBarStyle {

    @m80.k
    public static final Companion Companion = new Companion(null);
    private final int darkScrim;

    @m80.k
    private final x00.l<Resources, Boolean> detectDarkMode;
    private final int lightScrim;
    private final int nightMode;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SystemBarStyle auto$default(Companion companion, int i11, int i12, x00.l lVar, int i13, Object obj) {
            if ((i13 & 4) != 0) {
                lVar = new x00.l<Resources, Boolean>() { // from class: androidx.activity.SystemBarStyle$Companion$auto$1
                    @Override // x00.l
                    public final Boolean invoke(Resources resources) {
                        g0.p(resources, "resources");
                        return Boolean.valueOf((resources.getConfiguration().uiMode & 48) == 32);
                    }
                };
            }
            return companion.auto(i11, i12, lVar);
        }

        @w00.k
        @w00.o
        @m80.k
        public final SystemBarStyle auto(@ColorInt int i11, @ColorInt int i12) {
            return auto$default(this, i11, i12, null, 4, null);
        }

        @w00.o
        @m80.k
        public final SystemBarStyle dark(@ColorInt int i11) {
            return new SystemBarStyle(i11, i11, 2, new x00.l<Resources, Boolean>() { // from class: androidx.activity.SystemBarStyle$Companion$dark$1
                @Override // x00.l
                public final Boolean invoke(Resources resources) {
                    g0.p(resources, "<anonymous parameter 0>");
                    return Boolean.TRUE;
                }
            }, null);
        }

        @w00.o
        @m80.k
        public final SystemBarStyle light(@ColorInt int i11, @ColorInt int i12) {
            return new SystemBarStyle(i11, i12, 1, new x00.l<Resources, Boolean>() { // from class: androidx.activity.SystemBarStyle$Companion$light$1
                @Override // x00.l
                public final Boolean invoke(Resources resources) {
                    g0.p(resources, "<anonymous parameter 0>");
                    return Boolean.FALSE;
                }
            }, null);
        }

        private Companion() {
        }

        @w00.k
        @w00.o
        @m80.k
        public final SystemBarStyle auto(@ColorInt int i11, @ColorInt int i12, @m80.k x00.l<? super Resources, Boolean> detectDarkMode) {
            g0.p(detectDarkMode, "detectDarkMode");
            return new SystemBarStyle(i11, i12, 0, detectDarkMode, null);
        }
    }

    public /* synthetic */ SystemBarStyle(int i11, int i12, int i13, x00.l lVar, v vVar) {
        this(i11, i12, i13, lVar);
    }

    @w00.k
    @w00.o
    @m80.k
    public static final SystemBarStyle auto(@ColorInt int i11, @ColorInt int i12) {
        return Companion.auto(i11, i12);
    }

    @w00.o
    @m80.k
    public static final SystemBarStyle dark(@ColorInt int i11) {
        return Companion.dark(i11);
    }

    @w00.o
    @m80.k
    public static final SystemBarStyle light(@ColorInt int i11, @ColorInt int i12) {
        return Companion.light(i11, i12);
    }

    public final int getDarkScrim$activity_release() {
        return this.darkScrim;
    }

    @m80.k
    public final x00.l<Resources, Boolean> getDetectDarkMode$activity_release() {
        return this.detectDarkMode;
    }

    public final int getNightMode$activity_release() {
        return this.nightMode;
    }

    public final int getScrim$activity_release(boolean z11) {
        return z11 ? this.darkScrim : this.lightScrim;
    }

    public final int getScrimWithEnforcedContrast$activity_release(boolean z11) {
        if (this.nightMode == 0) {
            return 0;
        }
        return z11 ? this.darkScrim : this.lightScrim;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private SystemBarStyle(int i11, int i12, int i13, x00.l<? super Resources, Boolean> lVar) {
        this.lightScrim = i11;
        this.darkScrim = i12;
        this.nightMode = i13;
        this.detectDarkMode = lVar;
    }

    @w00.k
    @w00.o
    @m80.k
    public static final SystemBarStyle auto(@ColorInt int i11, @ColorInt int i12, @m80.k x00.l<? super Resources, Boolean> lVar) {
        return Companion.auto(i11, i12, lVar);
    }
}

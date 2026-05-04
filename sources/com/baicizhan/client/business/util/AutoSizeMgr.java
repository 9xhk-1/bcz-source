package com.baicizhan.client.business.util;

import android.app.Application;
import android.content.res.Resources;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import me.jessyan.autosize.AutoSize;
import me.jessyan.autosize.AutoSizeCompat;
import me.jessyan.autosize.AutoSizeConfig;
import yz.c0;
import yz.e0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nAutoSizeMgr.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutoSizeMgr.kt\ncom/baicizhan/client/business/util/AutoSizeMgr\n+ 2 Delegates.kt\nkotlin/properties/Delegates\n*L\n1#1,61:1\n33#2,3:62\n*S KotlinDebug\n*F\n+ 1 AutoSizeMgr.kt\ncom/baicizhan/client/business/util/AutoSizeMgr\n*L\n-1#1:62,3\n*E\n"})
/* loaded from: classes4.dex */
public final class AutoSizeMgr {
    public static final int $stable;

    @m80.k
    private static final String KEY_CONFIG_AUTO_SIZE = "key_config_auto_size";

    @m80.k
    public static final String TAG = "AutoSizeMgr";

    @m80.k
    private static final d10.f userCloseAutoSize$delegate;
    static final /* synthetic */ h10.n<Object>[] $$delegatedProperties = {o0.k(new MutablePropertyReference1Impl(AutoSizeMgr.class, "userCloseAutoSize", "getUserCloseAutoSize()Z", 0))};

    @m80.k
    public static final AutoSizeMgr INSTANCE = new AutoSizeMgr();

    @m80.k
    private static final c0 useAutoSize$delegate = e0.c(new x00.a() { // from class: com.baicizhan.client.business.util.a
        @Override // x00.a
        public final Object invoke() {
            boolean useAutoSize_delegate$lambda$0;
            useAutoSize_delegate$lambda$0 = AutoSizeMgr.useAutoSize_delegate$lambda$0();
            return Boolean.valueOf(useAutoSize_delegate$lambda$0);
        }
    });

    static {
        d10.a aVar = d10.a.f47010a;
        final Boolean valueOf = Boolean.valueOf(nc.b.b().getBoolean(KEY_CONFIG_AUTO_SIZE, false));
        userCloseAutoSize$delegate = new d10.c<Boolean>(valueOf) { // from class: com.baicizhan.client.business.util.AutoSizeMgr$special$$inlined$observable$1
            @Override // d10.c
            public void afterChange(h10.n<?> property, Boolean bool, Boolean bool2) {
                g0.p(property, "property");
                boolean booleanValue = bool2.booleanValue();
                bool.getClass();
                nc.b.b().j("key_config_auto_size", booleanValue);
            }
        };
        $stable = 8;
    }

    private AutoSizeMgr() {
    }

    private final boolean getUseAutoSize() {
        return ((Boolean) useAutoSize$delegate.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean useAutoSize_delegate$lambda$0() {
        return !nc.b.b().getBoolean(KEY_CONFIG_AUTO_SIZE, false);
    }

    public final void adjust(@m80.l Resources resources) {
        if (!getUseAutoSize() || resources == null) {
            return;
        }
        int f11 = xb.f.f(pb.a.a());
        int i11 = xb.f.i(pb.a.a());
        if (i11 == 0 || f11 / i11 < 1.3f) {
            return;
        }
        try {
            AutoSizeCompat.autoConvertDensityOfGlobal(resources);
        } catch (Exception unused) {
        }
    }

    public final void autoSizeInit(@m80.k Application app2) {
        g0.p(app2, "app");
        if (getUseAutoSize()) {
            setAutoSize(app2, true);
        }
    }

    public final boolean getUserCloseAutoSize() {
        return ((Boolean) userCloseAutoSize$delegate.getValue(this, $$delegatedProperties[0])).booleanValue();
    }

    public final void setAutoSize(@m80.k Application app2, boolean z11) {
        g0.p(app2, "app");
        int f11 = xb.f.f(app2);
        int i11 = xb.f.i(app2);
        if (i11 == 0 || f11 / i11 < 1.3f) {
            return;
        }
        AutoSize.checkAndInit(pb.a.a());
        AutoSizeConfig.getInstance().setExcludeFontScale(z11);
        qb.c.i(TAG, "use autoSize, %d, %d", Integer.valueOf(f11), Integer.valueOf(i11));
    }

    public final void setUserCloseAutoSize(boolean z11) {
        userCloseAutoSize$delegate.setValue(this, $$delegatedProperties[0], Boolean.valueOf(z11));
    }
}
